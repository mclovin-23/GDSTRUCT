package com.company;

public class PlayerLinkedList {
    private PlayerNode head;


    public void addToFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
    }

    public void printList()
    {
        PlayerNode current = head;
        System.out.println("Head -> ");
        while (current != null)
        {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNextPlayer();
        }
        System.out.println("null");
    }

    public void removePlayer()
    {
        head = head.getNextPlayer();
    }

    public void counter()
    {
        PlayerNode current = head;
        int count = 0;
        while (current != null)
        {
            current = current.getNextPlayer();
            count++;
        }
        System.out.println("Number of players: " + count);
    }

    public boolean container(Player currentPlayer)
    {
        boolean variable = false;
        PlayerNode current = head;
        while (current != null)
        {
            if (current.getPlayer() == currentPlayer)
            {
                variable = true;
            }
            else
            {
                variable = false;
            }
            current = current.getNextPlayer();
        }
        System.out.println("Player: " + variable);
        return variable;
    }

    public int indexer(Player currentPlayer)
    {
        int playerIndex = 0;
        PlayerNode current = head;
        while (current.getPlayer() != currentPlayer)
        {
            if (playerIndex == 0)
            {
                playerIndex++;
                current = current.getNextPlayer();
            }
        }
       return playerIndex;
    }


}
