/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd {
    static sj field_c;
    static String field_g;
    static String field_d;
    static String field_b;
    static sj field_h;
    static String field_f;
    static String[] field_e;
    static boolean field_a;

    final void a(int param0, bc[] param1, long param2) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var6 = Kickabout.field_G;
        try {
          L0: {
            var5_int = 0;
            L1: while (true) {
              if (var5_int >= param1.length) {
                L2: {
                  if (param0 == 2) {
                    break L2;
                  } else {
                    field_a = true;
                    break L2;
                  }
                }
                break L0;
              } else {
                this.a((byte) 98, param1[var5_int], param2);
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("gd.C(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param2 + ')');
        }
    }

    public static void a() {
        field_e = null;
        field_b = null;
        field_h = null;
        field_g = null;
        field_f = null;
        field_c = null;
        field_d = null;
    }

    final void b(int param0) {
        int var3 = 0;
        int var4 = Kickabout.field_G;
        int var2 = 20 % ((param0 - -4) / 40);
        for (var3 = 0; 7 > var3; var3++) {
            bm.field_L[var3].a(true);
            mt.field_f[var3] = 0;
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int var4 = 115 / ((-39 - param0) / 47);
        if (param2 == 0) {
            if (!(param1 == ng.field_a)) {
                wj.field_z = true;
                ng.field_a = param1;
                ca.a(3, param3);
            }
        }
        if (param2 == 1) {
            if (~q.field_b != ~param1) {
                q.field_b = param1;
                wj.field_z = true;
                ca.a(3, param3);
            }
        }
        if (param2 == 2) {
            if (!(fc.field_a == param1)) {
                wj.field_z = true;
                fc.field_a = param1;
                ca.a(3, param3);
            }
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param3 == -96) {
                break L1;
              } else {
                field_g = null;
                break L1;
              }
            }
            var5_int = 0;
            L2: while (true) {
              if (var5_int >= 3) {
                L3: {
                  if (param0 == param4) {
                    param4 = -1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (param0 != -1) {
                    vl.a(3, param1, param2, param0, 160);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (param4 != -1) {
                    vl.a(param3 + 99, param1, param2, param4, 50);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                break L0;
              } else {
                var6 = 0;
                L6: while (true) {
                  if (3 <= var6) {
                    var5_int++;
                    continue L2;
                  } else {
                    dk.a(param2, -112, param1, var5_int, var6);
                    on.a(param2, param1, 156, 225, 10, 65793, 96);
                    ta.e(126);
                    var6++;
                    continue L6;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var5, "gd.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(byte param0, bc param1, long param2) {
        iu var5 = null;
        try {
            var5 = (iu) (Object) bm.field_L[param1.field_j].a(true, (long)param1.field_g);
            if (var5 == null) {
                var5 = new iu(param1, vs.a(-1090519040, param2));
                bm.field_L[param1.field_j].a((gn) (Object) var5, -116, (long)param1.field_g);
                mt.field_f[param1.field_j] = mt.field_f[param1.field_j] + 1;
            } else {
                var5.field_g = param1;
                var5.field_f = vs.a(-1090519040, param2);
            }
            int var6 = -2;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "gd.F(" + 98 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        iu var6 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = Kickabout.field_G;
        if (param2 <= -83) {
          var4 = vs.a(-1090519040, nj.a(85));
          var5 = 0;
          L0: while (true) {
            if (var5 >= 7) {
              return;
            } else {
              var6 = (iu) (Object) bm.field_L[var5].b(0);
              L1: while (true) {
                if (var6 == null) {
                  var5++;
                  continue L0;
                } else {
                  L2: {
                    L3: {
                      var7 = 5;
                      if (param1 > var6.field_g.field_g) {
                        break L3;
                      } else {
                        if (var6.field_g.field_g <= param0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (256 > mt.field_f[var5]) {
                      var7 = 2;
                      break L2;
                    } else {
                      var7 = 0;
                      break L2;
                    }
                  }
                  L4: {
                    if (-var6.field_f + var4 < var7) {
                      break L4;
                    } else {
                      var6.c((byte) -109);
                      mt.field_f[var5] = mt.field_f[var5] - 1;
                      break L4;
                    }
                  }
                  var6 = (iu) (Object) bm.field_L[var5].a(-1);
                  continue L1;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final bc a(int param0, byte param1, int param2) {
        if (param1 != 116) {
            gd.a(124, -44, -97, (byte) 89, -100);
        }
        if (param2 < 0) {
            return null;
        }
        if (param2 >= 7) {
            return null;
        }
        iu var4 = (iu) (Object) bm.field_L[param2].a(true, (long)param0);
        return var4 == null ? null : var4.field_g;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "No Bids";
        field_g = "The mouse cursor performs different functions when you are in possession.";
        field_f = "Seriously offensive language";
        field_a = false;
        field_e = new String[]{"There is no space in your squad. Sell a player before buying another.", "You have made changes to your team. Would you like to save these changes?", "There is no space in your team's squad. Sell a player before bidding on another.", "You are already winning this auction.", "You do not have enough money.", "You cannot enter a game without four players available in your squad. Use the Management menu to organise your team.", "You can only bid or sell in five simultaneous auctions. Wait for one of these to end before entering another.", "This player's stats are maxed out and he can no longer be levelled up.", "Would you like to play through the Tutorial or practice with your team in Sandbox mode?", "Congratulations! You are the winner of the <%0>! You truly are a master of Kickabout League.", "Well done, you have earned at least <%0> league points and have now been promoted to the <%1>!", "", "The My Kit page allows you to choose the kit your team wears on the pitch. Select a primary and secondary colour and make them as stylish or as garish as you like!<br><br>Kits with an Orb Coin beneath them can be bought for 10 coins on the Orb Downloads page of FunOrb.com.<br><br>Some kits appear with a padlock over them. Earn Achievements to gain access to these designs.", "The Player Shop allows you to buy and sell players. The left-hand side shows your squad of characters. To sell one, click on him and then click the red 'Sell' button underneath.<br><br>The right-hand side lists the players you can buy. This list expands as you progress through the leagues, giving you access to more powerful characters with more trinket slots. To recruit somebody into your squad, click the 'Buy' button on the right. All purchases can be cancelled when you leave the menu.", "Use the My Squad page to view information about the players in your team. Click on a player in the grid to bring up their name, class, and vital statistics. When a player's experience reaches 100%, this menu can be used to buy another point of POW/TCK/SPD for them.<br><br>Players who are being bought or sold in an auction will show their current state in the pane on the right. Note that these players cannot be used in-game until the transfer is complete.<br><br>The bottom pane lists available trinket slots. Use the buttons to buy or replace trinkets and further customise your players.", "The My Pitch menu allows you to choose the pitch you play on when you host a game of Kickabout. The active pitch is outlined in white. This will be your turf for all single-player games and any multiplayer games where you are the captain of the home team.<br><br>Better pitches attract more prestige. The pitch surface affects the physics of your game - for example, the ball bounces much faster on the street than it does on sand.<br><br>Click the 'Buy' button to purchase higher levels of pitch. The padlock icon indicates that a pitch is locked.", "The Online Auction system allows you to trade your footballers with other FunOrb users. You can auction up to five of your players at any one time using the \"New Auction\" button in the top-left of the screen.<br><br>Click on the column headers to sort the auctions and search for a bargain, then click the 'Bid' button to place a bid on it. You can use the 'Buyout' feature to instantly complete a transaction, although you may have to pay extra.<br><br>Note: You cannot bid on players unless you have an empty space in your squad. The auction house takes a 10% cut of all transactions. It may take several minutes for an auction or bid to appear in the system.", "Play Rated games in the Multiplayer Lobby to earn league points. When your points total is high enough, you will be promoted to the next division, earning prestige and gaining access to more items and players in the shops.<br><br>You cannot get relegated - once you are promoted, your score is reset to 0 and it cannot reduce below that.<br><br>The Diamond Division is the highest tier of Kickabout League, and it's where players battle it out every week to win the Diamond Trophy. Keep an eye out for some FunOrb celebrities!", "", "Bid <%0> for this player?<%1>", "EXP at max! Choose a stat to increase by 1%.", "", "Become a FunOrb member to unlock the Trinkets Expansion Pack.", "Welcome to Kickabout League!<br><br>As you are not logged in, you have been given a temporary team. Play through the Tutorial and experiment with the management menus, or log in to start building up your team.<br><br><col=ff0000>Warning: All changes will be lost when you log in.</col>", "", "To access the Multiplayer Lobby, log in or create a free account.", "Complete the Single-player Tutorial to unlock this feature.", "Mouse over an icon for details", "Your profile was updated by the server. All pending changes were reset.", "Buy <%0> for <%1>?", "Buy <%0> for <%1>?", "This is your auction. You cannot bid or buy your own auctions.", "Buyout this player for <%0>?<%1>", "You do not have anyone to auction.", "Do you want to sell <%0> for <%1>?", "This kit is unlocked by the <col=ffff55>\"<%0>\"</col> achievement.<br><br>Requirement:<br><col=ffff55>\"<%1>\"<col>", "Visit the Orb Downloads page on FunOrb.com to buy this kit.", "Buyout this player for <%0>? (Your previous bid of <%1> will be returned).<%2>", "Your game was ended by the server. Sorry for any inconvenience this has caused.", "This feature is not available to players running the unsigned applet. Use the Java Options link (under the Games menu on FunOrb.com) to switch to the signed applet version of Kickabout.", "Before playing your first multiplayer game, you must complete the short tutorial to learn the basics. Don't worry, it shouldn't take more than 3 minutes!", "All Trinkets within Kickabout have been redesigned. The Trinkets on your players have been removed and you have been refunded the total cost of <%0>. We appologise for any inconvenience this may have caused.", "Congratulations to <%0>! They are the tournament champion."};
    }
}
