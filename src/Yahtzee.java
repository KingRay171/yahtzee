
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.*;



public class Yahtzee extends javax.swing.JFrame {

    /**
     * Creates new form Yahtzee
     */
    public Yahtzee() {
        initComponents();
        diceIcons.add(new ImageIcon("dice1.png"));
        diceIcons.add(new ImageIcon("dice2.png"));
        diceIcons.add(new ImageIcon("dice3.png"));
        diceIcons.add(new ImageIcon("dice4.png"));
        diceIcons.add(new ImageIcon("dice5.png"));
        diceIcons.add(new ImageIcon("dice6.png"));

        buttonList.add(diceButton1);
        buttonList.add(diceButton2);
        buttonList.add(diceButton3);
        buttonList.add(diceButton4);
        buttonList.add(diceButton5);

        selectedList.add(false);
        selectedList.add(false);
        selectedList.add(false);
        selectedList.add(false);
        selectedList.add(false);

        ArrayList<AbstractButton> l = Collections.list(buttonGroup1.getElements());

        for(AbstractButton b : l)
        {
            b.setEnabled(false);
        }

        endTurnButton.setVisible(false);
        endRollingButton.setEnabled(false);
        gameOverLabel.setVisible(false);
        winnerLabel.setVisible(false);
    }


    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        diceInterface = new javax.swing.JPanel();
        diceButton1 = new javax.swing.JButton();
        diceButton2 = new javax.swing.JButton();
        diceButton3 = new javax.swing.JButton();
        diceButton4 = new javax.swing.JButton();
        diceButton5 = new javax.swing.JButton();
        rollButton = new javax.swing.JButton();
        endRollingButton = new javax.swing.JButton();
        player1Scorecard = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        acesButtonP1 = new javax.swing.JRadioButton();
        twosButtonP1 = new javax.swing.JRadioButton();
        threesButtonP1 = new javax.swing.JRadioButton();
        foursButtonP1 = new javax.swing.JRadioButton();
        fivesButtonP1 = new javax.swing.JRadioButton();
        sixesButtonP1 = new javax.swing.JRadioButton();
        twosPointsP1 = new javax.swing.JLabel();
        foursPointsP1 = new javax.swing.JLabel();
        threesPointsP1 = new javax.swing.JLabel();
        acesPointsP1 = new javax.swing.JLabel();
        fivesPointsP1 = new javax.swing.JLabel();
        sixesPointsP1 = new javax.swing.JLabel();
        totalP1 = new javax.swing.JLabel();
        upperSectionBonusP1 = new javax.swing.JLabel();
        upperSectionP1 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        threeOfAKindButtonP1 = new javax.swing.JRadioButton();
        fourOfAKindButtonP1 = new javax.swing.JRadioButton();
        fullHouseButtonP1 = new javax.swing.JRadioButton();
        smallStraightButtonP1 = new javax.swing.JRadioButton();
        largeStraightButtonP1 = new javax.swing.JRadioButton();
        yahtzeeButtonP1 = new javax.swing.JRadioButton();
        chanceButtonP1 = new javax.swing.JRadioButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        threeOfAKindPointsP1 = new javax.swing.JLabel();
        fourOfAKindPointsP1 = new javax.swing.JLabel();
        fullHousePointsP1 = new javax.swing.JLabel();
        smallStraightPointsP1 = new javax.swing.JLabel();
        largeStraightPointsP1 = new javax.swing.JLabel();
        yahtzeePointsP1 = new javax.swing.JLabel();
        chancePointsP1 = new javax.swing.JLabel();
        yahtzeeBonusP1 = new javax.swing.JLabel();
        secondUpperSectionTotalP1 = new javax.swing.JLabel();
        lowerSectionPointsP1 = new javax.swing.JLabel();
        grandTotalP1 = new javax.swing.JLabel();
        gameStatePanel = new javax.swing.JPanel();
        turnLabel = new javax.swing.JLabel();
        rollsLeftLabel = new javax.swing.JLabel();
        diceSelectedLabel = new javax.swing.JLabel();
        choiceYield = new javax.swing.JLabel();
        yieldLabel = new javax.swing.JLabel();
        endTurnButton = new javax.swing.JButton();
        gameOverLabel = new javax.swing.JLabel();
        winnerLabel = new javax.swing.JLabel();
        player2Scorecard = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        acesButtonP2 = new javax.swing.JRadioButton();
        twosButtonP2 = new javax.swing.JRadioButton();
        threesButtonP2 = new javax.swing.JRadioButton();
        foursButtonP2 = new javax.swing.JRadioButton();
        fivesButtonP2 = new javax.swing.JRadioButton();
        sixesButtonP2 = new javax.swing.JRadioButton();
        twosPointsP2 = new javax.swing.JLabel();
        foursPointsP2 = new javax.swing.JLabel();
        threesPointsP2 = new javax.swing.JLabel();
        acesPointsP2 = new javax.swing.JLabel();
        fivesPointsP2 = new javax.swing.JLabel();
        sixesPointsP2 = new javax.swing.JLabel();
        totalP2 = new javax.swing.JLabel();
        upperSectionBonusP2 = new javax.swing.JLabel();
        upperSectionP2 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        threeOfAKindButtonP2 = new javax.swing.JRadioButton();
        fourOfAKindButtonP2 = new javax.swing.JRadioButton();
        fullHouseButtonP2 = new javax.swing.JRadioButton();
        smallStraightButtonP2 = new javax.swing.JRadioButton();
        largeStraightButtonP2 = new javax.swing.JRadioButton();
        yahtzeeButtonP2 = new javax.swing.JRadioButton();
        chanceButtonP2 = new javax.swing.JRadioButton();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        threeOfAKindPointsP2 = new javax.swing.JLabel();
        fourOfAKindPointsP2 = new javax.swing.JLabel();
        fullHousePointsP2 = new javax.swing.JLabel();
        smallStraightPointsP2 = new javax.swing.JLabel();
        largeStraightPointsP2 = new javax.swing.JLabel();
        yahtzeePointsP2 = new javax.swing.JLabel();
        chancePointsP2 = new javax.swing.JLabel();
        yahtzeeBonusP2 = new javax.swing.JLabel();
        secondUpperSectionTotalP2 = new javax.swing.JLabel();
        lowerSectionPointsP2 = new javax.swing.JLabel();
        grandTotalP2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Yahtzee");

        diceInterface.setBorder(BorderFactory.createLineBorder(Color.black));

        diceButton1.setText("-");
        diceButton1.addActionListener(this::diceButton1ActionPerformed);

        diceButton2.setText("-");
        diceButton2.addActionListener(this::diceButton2ActionPerformed);

        diceButton3.setText("-");
        diceButton3.addActionListener(this::diceButton3ActionPerformed);

        diceButton4.setText("-");
        diceButton4.addActionListener(this::diceButton4ActionPerformed);

        diceButton5.setText("-");
        diceButton5.addActionListener(this::diceButton5ActionPerformed);

        rollButton.setText("Roll");
        rollButton.addActionListener(this::rollButtonActionPerformed);

        endRollingButton.setText("Done");
        endRollingButton.addActionListener(this::endRollingButtonActionPerformed);

        javax.swing.GroupLayout diceInterfaceLayout = new javax.swing.GroupLayout(diceInterface);
        diceInterface.setLayout(diceInterfaceLayout);
        diceInterfaceLayout.setHorizontalGroup(
                diceInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(diceInterfaceLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(diceInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(diceInterfaceLayout.createSequentialGroup()
                                                .addComponent(diceButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(diceButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(diceInterfaceLayout.createSequentialGroup()
                                                .addComponent(diceButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(diceButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(diceInterfaceLayout.createSequentialGroup()
                                                .addComponent(rollButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(endRollingButton)
                                                .addGap(0, 6, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, diceInterfaceLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(diceButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))
        );
        diceInterfaceLayout.setVerticalGroup(
                diceInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(diceInterfaceLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(diceInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(diceButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                        .addComponent(diceButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(diceButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(diceInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(diceButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                        .addComponent(diceButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(diceInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(rollButton)
                                        .addComponent(endRollingButton))
                                .addContainerGap(22, Short.MAX_VALUE))
        );

        player1Scorecard.setBorder(BorderFactory.createLineBorder(Color.black));

        jLabel1.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 12)); // NOI18N
        jLabel1.setText("Player 1");

        jLabel3.setText("Upper Section");

        jLabel4.setText("Aces");

        jLabel5.setText("Twos");

        jLabel6.setText("Threes");

        jLabel7.setText("Fours");

        jLabel8.setText("Fives");

        jLabel9.setText("Sixes");

        jLabel10.setText("Total Score");

        jLabel11.setText("Bonus (63+):");

        jLabel12.setText("Upper Section Total:");

        buttonGroup1.add(acesButtonP1);
        acesButtonP1.addActionListener(this::aceButtonActionPerformed);

        buttonGroup1.add(twosButtonP1);
        twosButtonP1.addActionListener(this::twosButtonActionPerformed);

        buttonGroup1.add(threesButtonP1);
        threesButtonP1.addActionListener(this::threesButtonActionPerformed);

        buttonGroup1.add(foursButtonP1);
        foursButtonP1.addActionListener(this::foursButtonActionPerformed);

        buttonGroup1.add(fivesButtonP1);
        fivesButtonP1.addActionListener(this::fivesButtonActionPerformed);

        buttonGroup1.add(sixesButtonP1);
        sixesButtonP1.addActionListener(this::sixesButtonActionPerformed);

        twosPointsP1.setText("0");

        foursPointsP1.setText("0");

        threesPointsP1.setText("0");

        acesPointsP1.setText("0");

        fivesPointsP1.setText("0");

        sixesPointsP1.setText("0");

        totalP1.setText("0");

        upperSectionBonusP1.setText("0");

        upperSectionP1.setText("0");

        jLabel22.setText("Lower Section");

        jLabel23.setText("Three of a Kind:");

        jLabel24.setText("Four of a Kind:");

        jLabel25.setText("Full House:");

        jLabel26.setText("Small Straight:");

        jLabel27.setText("Large Straight:");

        jLabel28.setText("Yahtzee:");

        jLabel29.setText("Chance: ");

        jLabel30.setText("Yahtzee Bonus:");

        buttonGroup1.add(threeOfAKindButtonP1);
        threeOfAKindButtonP1.addActionListener(this::threeOfAKindButtonP1ActionPerformed);

        buttonGroup1.add(fourOfAKindButtonP1);
        fourOfAKindButtonP1.addActionListener(this::fourOfAKindButtonP1ActionPerformed);

        buttonGroup1.add(fullHouseButtonP1);
        fullHouseButtonP1.addActionListener(this::fullHouseButtonP1ActionPerformed);

        buttonGroup1.add(smallStraightButtonP1);
        smallStraightButtonP1.addActionListener(this::smallStraightButtonP1ActionPerformed);

        buttonGroup1.add(largeStraightButtonP1);
        largeStraightButtonP1.addActionListener(this::largeStraightButtonP1ActionPerformed);

        buttonGroup1.add(yahtzeeButtonP1);
        yahtzeeButtonP1.addActionListener(this::yahtzeeButtonP1ActionPerformed);

        buttonGroup1.add(chanceButtonP1);
        chanceButtonP1.addActionListener(this::chanceButtonP1ActionPerformed);

        jLabel31.setText("Upper Section Total:");

        jLabel32.setText("Lower Section Total:");

        jLabel33.setText("Grand Total:");

        threeOfAKindPointsP1.setText("0");

        fourOfAKindPointsP1.setText("0");

        fullHousePointsP1.setText("0");

        smallStraightPointsP1.setText("0");

        largeStraightPointsP1.setText("0");

        yahtzeePointsP1.setText("0");

        chancePointsP1.setText("0");

        yahtzeeBonusP1.setText("0");

        secondUpperSectionTotalP1.setText("0");

        lowerSectionPointsP1.setText("0");

        grandTotalP1.setText("0");

        javax.swing.GroupLayout player1ScorecardLayout = new javax.swing.GroupLayout(player1Scorecard);
        player1Scorecard.setLayout(player1ScorecardLayout);
        player1ScorecardLayout.setHorizontalGroup(
                player1ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(player1ScorecardLayout.createSequentialGroup()
                                .addGroup(player1ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(player1ScorecardLayout.createSequentialGroup()
                                                .addGroup(player1ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(player1ScorecardLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel10))
                                                        .addGroup(player1ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addGroup(player1ScorecardLayout.createSequentialGroup()
                                                                        .addContainerGap()
                                                                        .addComponent(jLabel4)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(acesButtonP1))
                                                                .addGroup(player1ScorecardLayout.createSequentialGroup()
                                                                        .addContainerGap()
                                                                        .addComponent(jLabel5)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(twosButtonP1))
                                                                .addGroup(player1ScorecardLayout.createSequentialGroup()
                                                                        .addContainerGap()
                                                                        .addComponent(jLabel6)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                                                                        .addComponent(threesButtonP1))
                                                                .addGroup(player1ScorecardLayout.createSequentialGroup()
                                                                        .addContainerGap()
                                                                        .addComponent(jLabel7)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(foursButtonP1))
                                                                .addGroup(player1ScorecardLayout.createSequentialGroup()
                                                                        .addContainerGap()
                                                                        .addComponent(jLabel8)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(fivesButtonP1))
                                                                .addGroup(player1ScorecardLayout.createSequentialGroup()
                                                                        .addContainerGap()
                                                                        .addComponent(jLabel9)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(sixesButtonP1))
                                                                .addGroup(player1ScorecardLayout.createSequentialGroup()
                                                                        .addGap(52, 52, 52)
                                                                        .addComponent(jLabel3))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, player1ScorecardLayout.createSequentialGroup()
                                                                        .addContainerGap()
                                                                        .addComponent(jLabel1)
                                                                        .addGap(26, 26, 26))))
                                                .addGap(18, 18, 18)
                                                .addGroup(player1ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(twosPointsP1)
                                                        .addComponent(foursPointsP1)
                                                        .addComponent(threesPointsP1)
                                                        .addComponent(acesPointsP1)
                                                        .addComponent(fivesPointsP1)
                                                        .addComponent(sixesPointsP1)
                                                        .addComponent(totalP1)))
                                        .addGroup(player1ScorecardLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(player1ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel30)
                                                        .addGroup(player1ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addGroup(player1ScorecardLayout.createSequentialGroup()
                                                                        .addComponent(jLabel29)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(chanceButtonP1))
                                                                .addGroup(player1ScorecardLayout.createSequentialGroup()
                                                                        .addComponent(jLabel28)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(yahtzeeButtonP1))
                                                                .addGroup(player1ScorecardLayout.createSequentialGroup()
                                                                        .addComponent(jLabel27)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(largeStraightButtonP1))
                                                                .addGroup(player1ScorecardLayout.createSequentialGroup()
                                                                        .addComponent(jLabel26)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(smallStraightButtonP1))
                                                                .addGroup(player1ScorecardLayout.createSequentialGroup()
                                                                        .addComponent(jLabel25)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(fullHouseButtonP1))
                                                                .addGroup(player1ScorecardLayout.createSequentialGroup()
                                                                        .addComponent(jLabel24)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(fourOfAKindButtonP1))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, player1ScorecardLayout.createSequentialGroup()
                                                                        .addComponent(jLabel23)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                                                        .addComponent(threeOfAKindButtonP1)))
                                                        .addComponent(jLabel11)
                                                        .addComponent(jLabel12)
                                                        .addComponent(jLabel31)
                                                        .addComponent(jLabel32)
                                                        .addComponent(jLabel33))
                                                .addGap(18, 18, 18)
                                                .addGroup(player1ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(grandTotalP1)
                                                        .addComponent(lowerSectionPointsP1)
                                                        .addComponent(secondUpperSectionTotalP1)
                                                        .addComponent(upperSectionBonusP1)
                                                        .addComponent(upperSectionP1)
                                                        .addComponent(threeOfAKindPointsP1)
                                                        .addComponent(fourOfAKindPointsP1)
                                                        .addComponent(fullHousePointsP1)
                                                        .addComponent(smallStraightPointsP1)
                                                        .addComponent(largeStraightPointsP1)
                                                        .addComponent(yahtzeePointsP1)
                                                        .addComponent(chancePointsP1)
                                                        .addComponent(yahtzeeBonusP1))))
                                .addContainerGap(16, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, player1ScorecardLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel22)
                                .addGap(50, 50, 50))
        );
        player1ScorecardLayout.setVerticalGroup(
                player1ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(player1ScorecardLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(player1ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(player1ScorecardLayout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(player1ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(player1ScorecardLayout.createSequentialGroup()
                                                                .addGroup(player1ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(acesButtonP1)
                                                                        .addComponent(jLabel4))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(player1ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(twosPointsP1)
                                                                        .addComponent(jLabel5)
                                                                        .addComponent(twosButtonP1))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(player1ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel6)
                                                                        .addComponent(threesButtonP1)
                                                                        .addComponent(threesPointsP1)))
                                                        .addComponent(acesPointsP1))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(player1ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel7)
                                                        .addComponent(foursButtonP1)
                                                        .addComponent(foursPointsP1))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(player1ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel8)
                                                        .addComponent(fivesButtonP1)
                                                        .addComponent(fivesPointsP1))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(player1ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel9)
                                                        .addComponent(sixesButtonP1)
                                                        .addComponent(sixesPointsP1))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(player1ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(totalP1)
                                                        .addComponent(jLabel10))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(player1ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(upperSectionBonusP1)
                                                        .addComponent(jLabel11))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(player1ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(upperSectionP1)
                                                        .addComponent(jLabel12))
                                                .addGap(15, 15, 15)
                                                .addComponent(jLabel22)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(player1ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel23)
                                                        .addComponent(threeOfAKindButtonP1)
                                                        .addComponent(threeOfAKindPointsP1))
                                                .addGroup(player1ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(player1ScorecardLayout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel24))
                                                        .addGroup(player1ScorecardLayout.createSequentialGroup()
                                                                .addGap(3, 3, 3)
                                                                .addComponent(fourOfAKindPointsP1))))
                                        .addComponent(fourOfAKindButtonP1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(player1ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel25)
                                        .addComponent(fullHouseButtonP1)
                                        .addComponent(fullHousePointsP1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(player1ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel26)
                                        .addComponent(smallStraightButtonP1)
                                        .addComponent(smallStraightPointsP1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(player1ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel27)
                                        .addComponent(largeStraightButtonP1)
                                        .addComponent(largeStraightPointsP1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(player1ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel28)
                                        .addComponent(yahtzeeButtonP1)
                                        .addComponent(yahtzeePointsP1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(player1ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel29)
                                        .addComponent(chanceButtonP1)
                                        .addComponent(chancePointsP1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(player1ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel30)
                                        .addComponent(yahtzeeBonusP1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(player1ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel31)
                                        .addComponent(secondUpperSectionTotalP1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(player1ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel32)
                                        .addComponent(lowerSectionPointsP1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(player1ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel33)
                                        .addComponent(grandTotalP1))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gameStatePanel.setBorder(BorderFactory.createLineBorder(Color.black));

        turnLabel.setText("It is " + turn + "'s Turn");

        rollsLeftLabel.setText("Rolls left: " + rollsLeft);

        diceSelectedLabel.setText("Dice selected: ");

        choiceYield.setText("Choice Yield: ");

        yieldLabel.setText("-");

        endTurnButton.setText("End Turn");
        endTurnButton.addActionListener(this::endTurnButtonActionPerformed);

        gameOverLabel.setText("Game Over");

        winnerLabel.setText("jLabel2");

        javax.swing.GroupLayout gameStatePanelLayout = new javax.swing.GroupLayout(gameStatePanel);
        gameStatePanel.setLayout(gameStatePanelLayout);
        gameStatePanelLayout.setHorizontalGroup(
                gameStatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(gameStatePanelLayout.createSequentialGroup()
                                .addGroup(gameStatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(gameStatePanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(gameStatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(turnLabel)
                                                        .addComponent(rollsLeftLabel)
                                                        .addComponent(diceSelectedLabel)
                                                        .addGroup(gameStatePanelLayout.createSequentialGroup()
                                                                .addComponent(choiceYield)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(yieldLabel))))
                                        .addGroup(gameStatePanelLayout.createSequentialGroup()
                                                .addGap(39, 39, 39)
                                                .addComponent(endTurnButton))
                                        .addGroup(gameStatePanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(gameOverLabel))
                                        .addGroup(gameStatePanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(winnerLabel)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gameStatePanelLayout.setVerticalGroup(
                gameStatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(gameStatePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(turnLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rollsLeftLabel)
                                .addGap(64, 64, 64)
                                .addComponent(diceSelectedLabel)
                                .addGap(18, 18, 18)
                                .addGroup(gameStatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(choiceYield)
                                        .addComponent(yieldLabel))
                                .addGap(38, 38, 38)
                                .addComponent(endTurnButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(gameOverLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(winnerLabel)
                                .addGap(14, 14, 14))
        );

        player2Scorecard.setBorder(BorderFactory.createLineBorder(Color.black));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel34.setText("Player 2");

        jLabel35.setText("Upper Section");

        jLabel36.setText("Aces");

        jLabel37.setText("Twos");

        jLabel38.setText("Threes");

        jLabel39.setText("Fours");

        jLabel40.setText("Fives");

        jLabel41.setText("Sixes");

        jLabel42.setText("Total Score");

        jLabel43.setText("Bonus (63+):");

        jLabel44.setText("Upper Section Total:");

        buttonGroup1.add(acesButtonP2);
        acesButtonP2.addActionListener(this::acesButtonP2ActionPerformed);

        buttonGroup1.add(twosButtonP2);
        twosButtonP2.addActionListener(this::twosButtonP2ActionPerformed);

        buttonGroup1.add(threesButtonP2);
        threesButtonP2.addActionListener(this::threesButtonP2ActionPerformed);

        buttonGroup1.add(foursButtonP2);
        foursButtonP2.addActionListener(this::foursButtonP2ActionPerformed);

        buttonGroup1.add(fivesButtonP2);
        fivesButtonP2.addActionListener(this::fivesButtonP2ActionPerformed);

        buttonGroup1.add(sixesButtonP2);
        sixesButtonP2.addActionListener(this::sixesButtonP2ActionPerformed);

        twosPointsP2.setText("0");

        foursPointsP2.setText("0");

        threesPointsP2.setText("0");

        acesPointsP2.setText("0");

        fivesPointsP2.setText("0");

        sixesPointsP2.setText("0");

        totalP2.setText("0");

        upperSectionBonusP2.setText("0");

        upperSectionP2.setText("0");

        jLabel54.setText("Lower Section");

        jLabel55.setText("Three of a Kind:");

        jLabel56.setText("Four of a Kind:");

        jLabel57.setText("Full House:");

        jLabel58.setText("Small Straight:");

        jLabel59.setText("Large Straight:");

        jLabel60.setText("Yahtzee:");

        jLabel61.setText("Chance: ");

        jLabel62.setText("Yahtzee Bonus:");

        buttonGroup1.add(threeOfAKindButtonP2);
        threeOfAKindButtonP2.addActionListener(this::threeOfAKindButtonP2ActionPerformed);

        buttonGroup1.add(fourOfAKindButtonP2);
        fourOfAKindButtonP2.addActionListener(this::fourOfAKindButtonP2ActionPerformed);

        buttonGroup1.add(fullHouseButtonP2);
        fullHouseButtonP2.addActionListener(this::fullHouseButtonP2ActionPerformed);

        buttonGroup1.add(smallStraightButtonP2);
        smallStraightButtonP2.addActionListener(this::smallStraightButtonP2ActionPerformed);

        buttonGroup1.add(largeStraightButtonP2);
        largeStraightButtonP2.addActionListener(this::largeStraightButtonP2ActionPerformed);

        buttonGroup1.add(yahtzeeButtonP2);
        yahtzeeButtonP2.addActionListener(this::yahtzeeButtonP2ActionPerformed);

        buttonGroup1.add(chanceButtonP2);
        chanceButtonP2.addActionListener(this::chanceButtonP2ActionPerformed);

        jLabel63.setText("Upper Section Total:");

        jLabel64.setText("Lower Section Total:");

        jLabel65.setText("Grand Total:");

        threeOfAKindPointsP2.setText("0");

        fourOfAKindPointsP2.setText("0");

        fullHousePointsP2.setText("0");

        smallStraightPointsP2.setText("0");

        largeStraightPointsP2.setText("0");

        yahtzeePointsP2.setText("0");

        chancePointsP2.setText("0");

        yahtzeeBonusP2.setText("0");

        secondUpperSectionTotalP2.setText("0");

        lowerSectionPointsP2.setText("0");

        grandTotalP2.setText("0");

        javax.swing.GroupLayout player2ScorecardLayout = new javax.swing.GroupLayout(player2Scorecard);
        player2Scorecard.setLayout(player2ScorecardLayout);
        player2ScorecardLayout.setHorizontalGroup(
                player2ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(player2ScorecardLayout.createSequentialGroup()
                                .addGroup(player2ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(player2ScorecardLayout.createSequentialGroup()
                                                .addGroup(player2ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(player2ScorecardLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel42))
                                                        .addGroup(player2ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addGroup(player2ScorecardLayout.createSequentialGroup()
                                                                        .addContainerGap()
                                                                        .addComponent(jLabel36)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(acesButtonP2))
                                                                .addGroup(player2ScorecardLayout.createSequentialGroup()
                                                                        .addContainerGap()
                                                                        .addComponent(jLabel37)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(twosButtonP2))
                                                                .addGroup(player2ScorecardLayout.createSequentialGroup()
                                                                        .addContainerGap()
                                                                        .addComponent(jLabel38)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                                                                        .addComponent(threesButtonP2))
                                                                .addGroup(player2ScorecardLayout.createSequentialGroup()
                                                                        .addContainerGap()
                                                                        .addComponent(jLabel39)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(foursButtonP2))
                                                                .addGroup(player2ScorecardLayout.createSequentialGroup()
                                                                        .addContainerGap()
                                                                        .addComponent(jLabel40)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(fivesButtonP2))
                                                                .addGroup(player2ScorecardLayout.createSequentialGroup()
                                                                        .addContainerGap()
                                                                        .addComponent(jLabel41)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(sixesButtonP2))
                                                                .addGroup(player2ScorecardLayout.createSequentialGroup()
                                                                        .addGap(52, 52, 52)
                                                                        .addComponent(jLabel35))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, player2ScorecardLayout.createSequentialGroup()
                                                                        .addContainerGap()
                                                                        .addComponent(jLabel34)
                                                                        .addGap(26, 26, 26))))
                                                .addGap(18, 18, 18)
                                                .addGroup(player2ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(twosPointsP2)
                                                        .addComponent(foursPointsP2)
                                                        .addComponent(threesPointsP2)
                                                        .addComponent(acesPointsP2)
                                                        .addComponent(fivesPointsP2)
                                                        .addComponent(sixesPointsP2)
                                                        .addComponent(totalP2)))
                                        .addGroup(player2ScorecardLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(player2ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel62)
                                                        .addGroup(player2ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addGroup(player2ScorecardLayout.createSequentialGroup()
                                                                        .addComponent(jLabel61)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(chanceButtonP2))
                                                                .addGroup(player2ScorecardLayout.createSequentialGroup()
                                                                        .addComponent(jLabel60)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(yahtzeeButtonP2))
                                                                .addGroup(player2ScorecardLayout.createSequentialGroup()
                                                                        .addComponent(jLabel59)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(largeStraightButtonP2))
                                                                .addGroup(player2ScorecardLayout.createSequentialGroup()
                                                                        .addComponent(jLabel58)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(smallStraightButtonP2))
                                                                .addGroup(player2ScorecardLayout.createSequentialGroup()
                                                                        .addComponent(jLabel57)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(fullHouseButtonP2))
                                                                .addGroup(player2ScorecardLayout.createSequentialGroup()
                                                                        .addComponent(jLabel56)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(fourOfAKindButtonP2))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, player2ScorecardLayout.createSequentialGroup()
                                                                        .addComponent(jLabel55)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                                                        .addComponent(threeOfAKindButtonP2)))
                                                        .addComponent(jLabel43)
                                                        .addComponent(jLabel44)
                                                        .addComponent(jLabel63)
                                                        .addComponent(jLabel64)
                                                        .addComponent(jLabel65))
                                                .addGap(18, 18, 18)
                                                .addGroup(player2ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(grandTotalP2)
                                                        .addComponent(lowerSectionPointsP2)
                                                        .addComponent(secondUpperSectionTotalP2)
                                                        .addComponent(upperSectionBonusP2)
                                                        .addComponent(upperSectionP2)
                                                        .addComponent(threeOfAKindPointsP2)
                                                        .addComponent(fourOfAKindPointsP2)
                                                        .addComponent(fullHousePointsP2)
                                                        .addComponent(smallStraightPointsP2)
                                                        .addComponent(largeStraightPointsP2)
                                                        .addComponent(yahtzeePointsP2)
                                                        .addComponent(chancePointsP2)
                                                        .addComponent(yahtzeeBonusP2))))
                                .addContainerGap(14, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, player2ScorecardLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel54)
                                .addGap(50, 50, 50))
        );
        player2ScorecardLayout.setVerticalGroup(
                player2ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(player2ScorecardLayout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(player2ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(player2ScorecardLayout.createSequentialGroup()
                                                .addComponent(jLabel35)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(player2ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(player2ScorecardLayout.createSequentialGroup()
                                                                .addGroup(player2ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(acesButtonP2)
                                                                        .addComponent(jLabel36))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(player2ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(twosPointsP2)
                                                                        .addComponent(jLabel37)
                                                                        .addComponent(twosButtonP2))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(player2ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel38)
                                                                        .addComponent(threesButtonP2)
                                                                        .addComponent(threesPointsP2)))
                                                        .addComponent(acesPointsP2))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(player2ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel39)
                                                        .addComponent(foursButtonP2)
                                                        .addComponent(foursPointsP2))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(player2ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel40)
                                                        .addComponent(fivesButtonP2)
                                                        .addComponent(fivesPointsP2))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(player2ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel41)
                                                        .addComponent(sixesButtonP2)
                                                        .addComponent(sixesPointsP2))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(player2ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(totalP2)
                                                        .addComponent(jLabel42))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(player2ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(upperSectionBonusP2)
                                                        .addComponent(jLabel43))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(player2ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(upperSectionP2)
                                                        .addComponent(jLabel44))
                                                .addGroup(player2ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(player2ScorecardLayout.createSequentialGroup()
                                                                .addGap(15, 15, 15)
                                                                .addComponent(jLabel54)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(player2ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel55)
                                                                        .addComponent(threeOfAKindButtonP2)
                                                                        .addComponent(threeOfAKindPointsP2))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel56))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, player2ScorecardLayout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(fourOfAKindPointsP2))))
                                        .addComponent(fourOfAKindButtonP2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(player2ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel57)
                                        .addComponent(fullHouseButtonP2)
                                        .addComponent(fullHousePointsP2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(player2ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel58)
                                        .addComponent(smallStraightButtonP2)
                                        .addComponent(smallStraightPointsP2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(player2ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel59)
                                        .addComponent(largeStraightButtonP2)
                                        .addComponent(largeStraightPointsP2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(player2ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel60)
                                        .addComponent(yahtzeeButtonP2)
                                        .addComponent(yahtzeePointsP2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(player2ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel61)
                                        .addComponent(chanceButtonP2)
                                        .addComponent(chancePointsP2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(player2ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel62)
                                        .addComponent(yahtzeeBonusP2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(player2ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel63)
                                        .addComponent(secondUpperSectionTotalP2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(player2ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel64)
                                        .addComponent(lowerSectionPointsP2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(player2ScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel65)
                                        .addComponent(grandTotalP2))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(diceInterface, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(gameStatePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(player1Scorecard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(player2Scorecard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(diceInterface, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(gameStatePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(player1Scorecard, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(player2Scorecard, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addContainerGap(31, Short.MAX_VALUE))))
        );

        pack();
    }


    public static String turn = "Player 1";
    public static int rollsLeft = 3;
    public static int ptsInQuestion = 0;
    public static ArrayList<ImageIcon> diceIcons = new ArrayList<>();
    public static ArrayList<JButton> buttonList = new ArrayList<>();
    public static ArrayList<Boolean> selectedList = new ArrayList<>();
    public static boolean p1Has63 = false;
    public static boolean p2Has63 = false;
    public static int turnNum = 0;

    public void rollDice()
    {
        rollsLeft--;

        for(JButton b : buttonList)
        {
            b.setIcon(diceIcons.get(((int) (6 * Math.random()) + 1) - 1));
        }
    }

    public void rollCertainDice()
    {
        rollsLeft--;
        for(int i = 0; i < 5; i++)
            if(!selectedList.get(i))
                buttonList.get(i).setIcon(diceIcons.get(((int) (6 * Math.random()) + 1) - 1));

        for(Boolean b : selectedList)
        {
            b = false;

        }

    }

    public void handleDiceClick(int diceID)
    {
        if(!selectedList.get(diceID - 1))
        {
            selectedList.set(diceID - 1, true);
            String temp = diceSelectedLabel.getText();
            temp += diceID + ", ";
            diceSelectedLabel.setText(temp);
        } else
        {
            selectedList.set(diceID - 1, false);
            String temp = diceSelectedLabel.getText().replace(diceID + ", ", "");
            diceSelectedLabel.setText(temp);
        }
    }

    public int[] numberOfEach()
    {
        int[] result = {0, 0, 0, 0, 0, 0};

        for(JButton b : buttonList)
        {
            if(b.getIcon().equals(diceIcons.get(0)))
            {
                result[0]++;
            } else if(b.getIcon().equals(diceIcons.get(1)))
            {
                result[1]++;
            } else if (b.getIcon().equals(diceIcons.get(2)))
            {
                result[2]++;
            } else if(b.getIcon().equals(diceIcons.get(3)))
            {
                result[3]++;
            } else if(b.getIcon().equals(diceIcons.get(4)))
            {
                result[4]++;
            } else if (b.getIcon().equals(diceIcons.get(5)))
            {
                result[5]++;
            }
        }
        return result;
    }

    public int sumOfAll()
    {
        int sum = 0;
        int[] nums = numberOfEach();
        for(int i = 0; i < 6; i++)
            sum += nums[i] * (i + 1);

        return sum;
    }

    public void applyPts(String player, JLabel l, boolean isUpper)
    {
        l.setText(Integer.toString(ptsInQuestion));
        if(player.equals("Player 1") && isUpper)
        {
            boolean flag = p1Has63;
            int total = Integer.parseInt(totalP1.getText()) + ptsInQuestion;
            totalP1.setText(Integer.toString(total));
            if(Integer.parseInt(totalP1.getText()) > 62)
            {
                p1Has63 = true;
            }

            if(p1Has63 && !flag)
            {
                upperSectionBonusP1.setText(Integer.toString(35));
                total += 35;
                ptsInQuestion += 35;
                int tot = Integer.parseInt(totalP1.getText());
                tot += Integer.parseInt(upperSectionBonusP1.getText());
                upperSectionP1.setText(Integer.toString(tot));
            } else
            {
                int tot = Integer.parseInt(totalP1.getText());
                tot += Integer.parseInt(upperSectionBonusP1.getText());
                upperSectionP1.setText(Integer.toString(tot));
            }

            secondUpperSectionTotalP1.setText(upperSectionP1.getText());
            int t2 = Integer.parseInt(upperSectionP1.getText());
            upperSectionP1.setText(Integer.toString(t2));

            int t3 = Integer.parseInt(grandTotalP1.getText());
            t3 += ptsInQuestion;
            grandTotalP1.setText(Integer.toString(t3));
            turn = "Player 2";
        } else if(turn.equals("Player 1") && !isUpper)
        {
            if(ptsInQuestion == 100)
            {
                int y = Integer.parseInt(yahtzeeBonusP1.getText());
                y += ptsInQuestion;
                yahtzeeBonusP1.setText(Integer.toString(y));
            }
            int current = Integer.parseInt(lowerSectionPointsP1.getText());
            current += ptsInQuestion;
            lowerSectionPointsP1.setText(Integer.toString(current));
            turn = "Player 2";
            int t3 = Integer.parseInt(grandTotalP1.getText());
            t3 += ptsInQuestion;
            grandTotalP1.setText(Integer.toString(t3));

        } else if(turn.equals("Player 2") && isUpper)
        {
            boolean flag = p2Has63;
            int total = Integer.parseInt(totalP2.getText()) + ptsInQuestion;
            totalP2.setText(Integer.toString(total));
            if(Integer.parseInt(totalP2.getText()) > 62)
            {
                p2Has63 = true;
            }

            if(p2Has63 && !flag)
            {
                upperSectionBonusP2.setText(Integer.toString(35));
                total += 35;
                ptsInQuestion += 35;
                int tot = Integer.parseInt(totalP2.getText());
                tot += Integer.parseInt(upperSectionBonusP2.getText());
                upperSectionP2.setText(Integer.toString(tot));
            } else
            {
                int tot = Integer.parseInt(totalP2.getText());
                tot += Integer.parseInt(upperSectionBonusP2.getText());
                upperSectionP2.setText(Integer.toString(tot));
            }

            secondUpperSectionTotalP2.setText(upperSectionP2.getText());
            int t2 = Integer.parseInt(upperSectionP2.getText());
            upperSectionP2.setText(Integer.toString(t2));

            int t3 = Integer.parseInt(grandTotalP2.getText());
            t3 += ptsInQuestion;
            grandTotalP2.setText(Integer.toString(t3));
            turn = "Player 1";
        } else
        {
            if(ptsInQuestion == 100)
            {
                int y = Integer.parseInt(yahtzeeBonusP2.getText());
                y += ptsInQuestion;
                yahtzeeBonusP2.setText(Integer.toString(y));
            }
            int current = Integer.parseInt(lowerSectionPointsP2.getText());
            current += ptsInQuestion;
            lowerSectionPointsP2.setText(Integer.toString(current));
            turn = "Player 1";
            int t3 = Integer.parseInt(grandTotalP2.getText());
            t3 += ptsInQuestion;
            grandTotalP2.setText(Integer.toString(t3));
        }
        rollButton.setEnabled(true);
        turnLabel.setText("It is " + turn + "'s Turn");
        for(JButton b : buttonList)
            b.setEnabled(true);
        rollsLeft = 3;
        rollsLeftLabel.setText("Rolls left: " + rollsLeft);
    }

    private void diceButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        handleDiceClick(1);
    }

    private void rollButtonActionPerformed(java.awt.event.ActionEvent evt) {
        switch (rollsLeft) {
            case 3 -> {
                rollDice();
                rollsLeftLabel.setText("Rolls left: " + rollsLeft);
                endRollingButton.setEnabled(true);
            }
            case 2 -> {
                rollCertainDice();
                for(JButton b : buttonList)
                    b.setSelected(false);

                rollsLeftLabel.setText("Rolls left: " + rollsLeft);
            }
            case 1 -> {
                rollButton.setEnabled(false);
                rollCertainDice();
                rollsLeftLabel.setText("Rolls left: " + rollsLeft);
            }
            default -> {
            }
        }
    }

    private void diceButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        handleDiceClick(2);
    }

    private void diceButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        handleDiceClick(3);
    }

    private void diceButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        handleDiceClick(4);
    }

    private void diceButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        handleDiceClick(5);
    }

    private void aceButtonActionPerformed(java.awt.event.ActionEvent evt) {
        endTurnButton.setVisible(true);
        yieldLabel.setText(Integer.toString(numberOfEach()[0]));
        ptsInQuestion = numberOfEach()[0];
    }

    private void endRollingButtonActionPerformed(java.awt.event.ActionEvent evt) {
        for(JButton b : buttonList)
        {
            b.setEnabled(false);
        }
        int[] counts = numberOfEach();
        boolean flag1 = false;
        for (int count : counts)
            if (count == 5) {
                flag1 = true;
                break;
            }
        if(flag1 && turn.equals("Player 1") && Integer.parseInt(yahtzeePointsP1.getText()) != 0 && Integer.parseInt(yahtzeeBonusP1.getText()) != 400)
        {
            int y = Integer.parseInt(yahtzeeBonusP1.getText());
            y += 100;
            yahtzeeBonusP1.setText(Integer.toString(y));
            y = Integer.parseInt(lowerSectionPointsP1.getText());
            y += 100;
            lowerSectionPointsP1.setText(Integer.toString(y));
            y = Integer.parseInt(grandTotalP1.getText());
            y += 100;
            grandTotalP1.setText(Integer.toString(y));
        }
        else if(flag1 && turn.equals("Player 2") && Integer.parseInt(yahtzeePointsP2.getText()) != 0 && Integer.parseInt(yahtzeeBonusP2.getText()) != 400)
        {
            int y = Integer.parseInt(yahtzeeBonusP2.getText());
            y += 100;
            yahtzeeBonusP2.setText(Integer.toString(y));
            y = Integer.parseInt(lowerSectionPointsP2.getText());
            y += 100;
            lowerSectionPointsP2.setText(Integer.toString(y));
            y = Integer.parseInt(grandTotalP2.getText());
            y += 100;
            grandTotalP2.setText(Integer.toString(y));
        }
        rollButton.setEnabled(false);
        endRollingButton.setEnabled(false);
        ArrayList<AbstractButton> l = Collections.list(buttonGroup1.getElements());

        for(AbstractButton b : l)
        {
            if((turn.equals("Player 1") && b.getParent() == player1Scorecard) ||
                    (turn.equals("Player 2") && b.getParent() == player2Scorecard))
                b.setEnabled(true);

        }
    }

    private void twosButtonActionPerformed(java.awt.event.ActionEvent evt) {
        endTurnButton.setVisible(true);
        yieldLabel.setText(Integer.toString(numberOfEach()[1] * 2));
        ptsInQuestion = numberOfEach()[1] * 2;
    }

    private void threesButtonActionPerformed(java.awt.event.ActionEvent evt) {
        endTurnButton.setVisible(true);
        yieldLabel.setText(Integer.toString(numberOfEach()[2] * 3));
        ptsInQuestion = numberOfEach()[2] * 3;
    }

    private void foursButtonActionPerformed(java.awt.event.ActionEvent evt) {
        endTurnButton.setVisible(true);
        yieldLabel.setText(Integer.toString(numberOfEach()[3] * 4));
        ptsInQuestion = numberOfEach()[3] * 4;
    }

    private void fivesButtonActionPerformed(java.awt.event.ActionEvent evt) {
        endTurnButton.setVisible(true);
        yieldLabel.setText(Integer.toString(numberOfEach()[4] * 5));
        ptsInQuestion = numberOfEach()[4] * 5;
    }

    private void sixesButtonActionPerformed(java.awt.event.ActionEvent evt) {
        endTurnButton.setVisible(true);
        yieldLabel.setText(Integer.toString(numberOfEach()[5] * 6));
        ptsInQuestion = numberOfEach()[5] * 6;
    }

    private void threeOfAKindButtonP1ActionPerformed(java.awt.event.ActionEvent evt) {
        endTurnButton.setVisible(true);
        boolean flag = false;
        int[] nums = numberOfEach();
        for(int i = 0; i < 6; i++)
        {
            if (nums[i] > 2) {
                flag = true;
                break;
            }
        }

        if(flag)
            yieldLabel.setText(Integer.toString(sumOfAll()));
        else
            yieldLabel.setText(Integer.toString(0));
        ptsInQuestion = Integer.parseInt(yieldLabel.getText());
    }

    private void fourOfAKindButtonP1ActionPerformed(java.awt.event.ActionEvent evt) {
        endTurnButton.setVisible(true);
        boolean flag = false;
        int[] nums = numberOfEach();
        for(int i = 0; i < 6; i++)
        {
            if (nums[i] > 3) {
                flag = true;
                break;
            }
        }

        if(flag)
            yieldLabel.setText(Integer.toString(sumOfAll()));
        else
            yieldLabel.setText(Integer.toString(0));
        ptsInQuestion = Integer.parseInt(yieldLabel.getText());
    }

    private void fullHouseButtonP1ActionPerformed(java.awt.event.ActionEvent evt) {
        endTurnButton.setVisible(true);
        int[] counts = numberOfEach();
        boolean check2 = false;
        boolean check3 = false;
        for (int i: counts) {
            check2 |= (i==2); //found 2 of some number
            check3 |= (i==3); //found 3 of some number
        }

        if(check2 && check3)
            yieldLabel.setText(Integer.toString(25));
        else
            yieldLabel.setText(Integer.toString(0));
        ptsInQuestion = Integer.parseInt(yieldLabel.getText());
    }

    private void smallStraightButtonP1ActionPerformed(java.awt.event.ActionEvent evt) {
        endTurnButton.setVisible(true);
        int[] counts = numberOfEach();
        if((counts[0] > 0 && counts[1] > 0 && counts[2] > 0 && counts[3] > 0) ||
                (counts[1] > 0 && counts[2] > 0 && counts[3] > 0 && counts[4] > 0) ||
                (counts[2] > 0 && counts[3] > 0 && counts[4] > 0 && counts[5] > 0))
            yieldLabel.setText(Integer.toString(30));
        else
            yieldLabel.setText(Integer.toString(0));
        ptsInQuestion = Integer.parseInt(yieldLabel.getText());
    }

    private void largeStraightButtonP1ActionPerformed(java.awt.event.ActionEvent evt) {
        endTurnButton.setVisible(true);
        int[] counts = numberOfEach();
        if((counts[0] > 0 && counts[1] > 0 && counts[2] > 0 && counts[3] > 0 && counts[4] > 0) ||
                (counts[1] > 0 && counts[2] > 0 && counts[3] > 0 && counts[4] > 0 && counts[5] > 0))
            yieldLabel.setText(Integer.toString(40));
        else
            yieldLabel.setText(Integer.toString(0));
        ptsInQuestion = Integer.parseInt(yieldLabel.getText());
    }

    private void yahtzeeButtonP1ActionPerformed(java.awt.event.ActionEvent evt) {
        endTurnButton.setVisible(true);
        int[] counts = numberOfEach();
        boolean hasYahtzee = false;
        for (int count : counts)
            if (count == 5) {
                hasYahtzee = true;
                break;
            }
        if(hasYahtzee) {
            yieldLabel.setText(Integer.toString(50));
            ptsInQuestion = 50;
        }
        else{
            yieldLabel.setText(Integer.toString(0));
            ptsInQuestion = 0;
        }

    }

    private void chanceButtonP1ActionPerformed(java.awt.event.ActionEvent evt) {
        endTurnButton.setVisible(true);
        int pts = sumOfAll();
        yieldLabel.setText(Integer.toString(pts));
        ptsInQuestion = Integer.parseInt(yieldLabel.getText());
    }

    private void acesButtonP2ActionPerformed(java.awt.event.ActionEvent evt) {
        aceButtonActionPerformed(evt);
    }

    private void twosButtonP2ActionPerformed(java.awt.event.ActionEvent evt) {
        twosButtonActionPerformed(evt);
    }

    private void threesButtonP2ActionPerformed(java.awt.event.ActionEvent evt) {
        threesButtonActionPerformed(evt);
    }

    private void foursButtonP2ActionPerformed(java.awt.event.ActionEvent evt) {
        foursButtonActionPerformed(evt);
    }

    private void fivesButtonP2ActionPerformed(java.awt.event.ActionEvent evt) {
        fivesButtonActionPerformed(evt);
    }

    private void sixesButtonP2ActionPerformed(java.awt.event.ActionEvent evt) {
        sixesButtonActionPerformed(evt);
    }

    private void threeOfAKindButtonP2ActionPerformed(java.awt.event.ActionEvent evt) {
        threeOfAKindButtonP1ActionPerformed(evt);
    }

    private void fourOfAKindButtonP2ActionPerformed(java.awt.event.ActionEvent evt) {
        fourOfAKindButtonP1ActionPerformed(evt);
    }

    private void fullHouseButtonP2ActionPerformed(java.awt.event.ActionEvent evt) {
        fullHouseButtonP1ActionPerformed(evt);
    }

    private void smallStraightButtonP2ActionPerformed(java.awt.event.ActionEvent evt) {
        smallStraightButtonP1ActionPerformed(evt);
    }

    private void largeStraightButtonP2ActionPerformed(java.awt.event.ActionEvent evt) {
        largeStraightButtonP1ActionPerformed(evt);
    }

    private void yahtzeeButtonP2ActionPerformed(java.awt.event.ActionEvent evt) {
        yahtzeeButtonP1ActionPerformed(evt);
    }

    private void chanceButtonP2ActionPerformed(java.awt.event.ActionEvent evt) {
        chanceButtonP1ActionPerformed(evt);
    }

    private void endTurnButtonActionPerformed(java.awt.event.ActionEvent evt) {
        diceSelectedLabel.setText("Dice selected:");
        for (int i = 0; i < 5; i++){
            selectedList.set(i, false);
        }

        if(acesButtonP1.isSelected())
            applyPts("Player 1", acesPointsP1, true);
        else if(twosButtonP1.isSelected())
            applyPts("Player 1", twosPointsP1, true);
        else if(threesButtonP1.isSelected())
            applyPts("Player 1", threesPointsP1, true);
        else if(foursButtonP1.isSelected())
            applyPts("Player 1", foursPointsP1, true);
        else if(fivesButtonP1.isSelected())
            applyPts("Player 1", fivesPointsP1, true);
        else if(sixesButtonP1.isSelected())
            applyPts("Player 1", sixesPointsP1, true);
        else if(threeOfAKindButtonP1.isSelected())
            applyPts("Player 1", threeOfAKindPointsP1, false);
        else if(fourOfAKindButtonP1.isSelected())
            applyPts("Player 1", fourOfAKindPointsP1, false);
        else if(fullHouseButtonP1.isSelected())
            applyPts("Player 1", fullHousePointsP1, false);
        else if(smallStraightButtonP1.isSelected())
            applyPts("Player 1", smallStraightPointsP1, false);
        else if(largeStraightButtonP1.isSelected())
            applyPts("Player 1", largeStraightPointsP1, false);
        else if(yahtzeeButtonP1.isSelected())
            applyPts("Player 1", yahtzeePointsP1, false);
        else if(chanceButtonP1.isSelected())
            applyPts("Player 1", chancePointsP1, false);
        else if(acesButtonP2.isSelected())
            applyPts("Player 2", acesPointsP2, true);
        else if(twosButtonP2.isSelected())
            applyPts("Player 2", twosPointsP2, true);
        else if(threesButtonP2.isSelected())
            applyPts("Player 2", threesPointsP2, true);
        else if(foursButtonP2.isSelected())
            applyPts("Player 2", foursPointsP2, true);
        else if(fivesButtonP2.isSelected())
            applyPts("Player 2", fivesPointsP2, true);
        else if(sixesButtonP2.isSelected())
            applyPts("Player 2", sixesPointsP2, true);
        else if(threeOfAKindButtonP2.isSelected())
            applyPts("Player 2", threeOfAKindPointsP2, false);
        else if(fourOfAKindButtonP2.isSelected())
            applyPts("Player 2", fourOfAKindPointsP2, false);
        else if(fullHouseButtonP2.isSelected())
            applyPts("Player 2", fullHousePointsP2, false);
        else if(smallStraightButtonP2.isSelected())
            applyPts("Player 2", smallStraightPointsP2, false);
        else if(largeStraightButtonP2.isSelected())
            applyPts("Player 2", largeStraightPointsP2, false);
        else if(yahtzeeButtonP2.isSelected())
            applyPts("Player 2", yahtzeePointsP2, false);
        else if(chanceButtonP2.isSelected())
            applyPts("Player 2", chancePointsP2, false);

        ArrayList<AbstractButton> l = Collections.list(buttonGroup1.getElements());
        for(AbstractButton b : l)
            if(b.isSelected())
                b.setVisible(false);


        yieldLabel.setText("-");
        turnNum++;
        for(AbstractButton b : l)
        {
            b.setEnabled(false);
        }
        endTurnButton.setVisible(false);

        if(turnNum == 26)
        {
            for(AbstractButton b : l)
                b.setVisible(false);
            gameOverLabel.setVisible(true);
            winnerLabel.setVisible(true);
            if(Integer.parseInt(grandTotalP1.getText()) > Integer.parseInt(grandTotalP2.getText()))
                winnerLabel.setText("Player 1 Won!");
            else if(Integer.parseInt(grandTotalP1.getText()) < Integer.parseInt(grandTotalP2.getText()))
                winnerLabel.setText("Player 2 Won!");
            else
                winnerLabel.setText("It's a Draw!");
        }
    }


    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | UnsupportedLookAndFeelException | IllegalAccessException |
                 InstantiationException ex) {
            java.util.logging.Logger.getLogger(Yahtzee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Yahtzee().setVisible(true));
    }

    // Variables declaration - do not modify
    private javax.swing.JRadioButton acesButtonP1;
    private javax.swing.JRadioButton acesButtonP2;
    private javax.swing.JLabel acesPointsP1;
    private javax.swing.JLabel acesPointsP2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton chanceButtonP1;
    private javax.swing.JRadioButton chanceButtonP2;
    private javax.swing.JLabel chancePointsP1;
    private javax.swing.JLabel chancePointsP2;
    private javax.swing.JLabel choiceYield;
    private javax.swing.JButton diceButton1;
    private javax.swing.JButton diceButton2;
    private javax.swing.JButton diceButton3;
    private javax.swing.JButton diceButton4;
    private javax.swing.JButton diceButton5;
    private javax.swing.JPanel diceInterface;
    private javax.swing.JLabel diceSelectedLabel;
    private javax.swing.JButton endRollingButton;
    private javax.swing.JButton endTurnButton;
    private javax.swing.JRadioButton fivesButtonP1;
    private javax.swing.JRadioButton fivesButtonP2;
    private javax.swing.JLabel fivesPointsP1;
    private javax.swing.JLabel fivesPointsP2;
    private javax.swing.JRadioButton fourOfAKindButtonP1;
    private javax.swing.JRadioButton fourOfAKindButtonP2;
    private javax.swing.JLabel fourOfAKindPointsP1;
    private javax.swing.JLabel fourOfAKindPointsP2;
    private javax.swing.JRadioButton foursButtonP1;
    private javax.swing.JRadioButton foursButtonP2;
    private javax.swing.JLabel foursPointsP1;
    private javax.swing.JLabel foursPointsP2;
    private javax.swing.JRadioButton fullHouseButtonP1;
    private javax.swing.JRadioButton fullHouseButtonP2;
    private javax.swing.JLabel fullHousePointsP1;
    private javax.swing.JLabel fullHousePointsP2;
    private javax.swing.JLabel gameOverLabel;
    private javax.swing.JPanel gameStatePanel;
    private javax.swing.JLabel grandTotalP1;
    private javax.swing.JLabel grandTotalP2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton largeStraightButtonP1;
    private javax.swing.JRadioButton largeStraightButtonP2;
    private javax.swing.JLabel largeStraightPointsP1;
    private javax.swing.JLabel largeStraightPointsP2;
    private javax.swing.JLabel lowerSectionPointsP1;
    private javax.swing.JLabel lowerSectionPointsP2;
    private javax.swing.JPanel player1Scorecard;
    private javax.swing.JPanel player2Scorecard;
    private javax.swing.JButton rollButton;
    private javax.swing.JLabel rollsLeftLabel;
    private javax.swing.JLabel secondUpperSectionTotalP1;
    private javax.swing.JLabel secondUpperSectionTotalP2;
    private javax.swing.JRadioButton sixesButtonP1;
    private javax.swing.JRadioButton sixesButtonP2;
    private javax.swing.JLabel sixesPointsP1;
    private javax.swing.JLabel sixesPointsP2;
    private javax.swing.JRadioButton smallStraightButtonP1;
    private javax.swing.JRadioButton smallStraightButtonP2;
    private javax.swing.JLabel smallStraightPointsP1;
    private javax.swing.JLabel smallStraightPointsP2;
    private javax.swing.JRadioButton threeOfAKindButtonP1;
    private javax.swing.JRadioButton threeOfAKindButtonP2;
    private javax.swing.JLabel threeOfAKindPointsP1;
    private javax.swing.JLabel threeOfAKindPointsP2;
    private javax.swing.JRadioButton threesButtonP1;
    private javax.swing.JRadioButton threesButtonP2;
    private javax.swing.JLabel threesPointsP1;
    private javax.swing.JLabel threesPointsP2;
    private javax.swing.JLabel totalP1;
    private javax.swing.JLabel totalP2;
    private javax.swing.JLabel turnLabel;
    private javax.swing.JRadioButton twosButtonP1;
    private javax.swing.JRadioButton twosButtonP2;
    private javax.swing.JLabel twosPointsP1;
    private javax.swing.JLabel twosPointsP2;
    private javax.swing.JLabel upperSectionBonusP1;
    private javax.swing.JLabel upperSectionBonusP2;
    private javax.swing.JLabel upperSectionP1;
    private javax.swing.JLabel upperSectionP2;
    private javax.swing.JLabel winnerLabel;
    private javax.swing.JLabel yahtzeeBonusP1;
    private javax.swing.JLabel yahtzeeBonusP2;
    private javax.swing.JRadioButton yahtzeeButtonP1;
    private javax.swing.JRadioButton yahtzeeButtonP2;
    private javax.swing.JLabel yahtzeePointsP1;
    private javax.swing.JLabel yahtzeePointsP2;
    private javax.swing.JLabel yieldLabel;
    // End of variables declaration
}



