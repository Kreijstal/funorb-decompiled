/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me extends wo {
    static String[][][] field_Fb;
    static int field_Gb;
    static int field_Db;
    private int field_Eb;
    static String field_Hb;
    static int field_Bb;
    static String field_Cb;

    me(int param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_Eb = -72 + (so.c(144) + param0);
    }

    public static void x(int param0) {
        field_Fb = (String[][][]) null;
        field_Cb = null;
        field_Hb = null;
        if (param0 <= 32) {
            field_Bb = -98;
        }
    }

    final int j(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ZombieDawn.field_J;
        this.n(103);
        var2 = -1 + this.field_ub;
        var3 = this.f(var2, 0);
        if (param0 <= -42) {
          var4 = 1;
          L0: while (true) {
            if (this.field_ub - 1 <= var4) {
              L1: {
                if (-1 + this.field_ub != var2) {
                  break L1;
                } else {
                  var2 = -1;
                  break L1;
                }
              }
              return var2;
            } else {
              var5 = this.f(var4, 0);
              if (var3 < var5) {
                var2 = var4;
                var3 = var5;
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return 122;
        }
    }

    final void d(byte param0) {
        int var2 = 0;
        L0: {
          if (this.f(237239984) < 0) {
            break L0;
          } else {
            if (this.f(237239984) <= dj.field_e.field_H.field_p) {
              var2 = -66 % ((param0 - 66) / 50);
              super.d((byte) 118);
              return;
            } else {
              break L0;
            }
          }
        }
    }

    final void g(int param0) {
        super.g(99);
        if (this.f(237239984) - 48 > dj.field_e.field_H.field_p) {
            this.b(-27598);
            this.d(0);
            if (param0 > 95) {
                return;
            }
            this.field_Eb = 110;
            return;
        }
        if (param0 <= 95) {
            this.field_Eb = 110;
            return;
        }
    }

    final void l(byte param0) {
        int var2 = 0;
        int var3 = 0;
        this.field_F = 0;
        super.l(param0);
        var2 = this.field_Eb;
        var3 = 672;
        if (var3 - 24 <= this.f(237239984)) {
          this.field_Y = this.a(true);
          this.field_X = 48 + this.f(param0 + 237239932);
          this.c(0, this.field_D);
          this.e(1, param0 + -6956);
          this.g(param0 + 45);
          return;
        } else {
          if (this.f(237239984) >= 96) {
            if (this.field_F != 0) {
              return;
            } else {
              this.a(var2, (byte) 115, var3);
              return;
            }
          } else {
            this.field_Y = this.a(true);
            this.field_X = 48 + this.f(param0 + 237239932);
            this.c(0, this.field_D);
            this.e(1, param0 + -6956);
            this.g(param0 + 45);
            return;
          }
        }
    }

    final static java.awt.Frame a(byte param0, int param1, int param2, ec param3, int param4, int param5) {
        RuntimeException var6 = null;
        re[] var6_array = null;
        int var7 = 0;
        int var8_int = 0;
        java.awt.Frame var8 = null;
        int var9 = 0;
        re[] var10 = null;
        op var11 = null;
        Object stackIn_3_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_34_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        Object stackOut_33_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var9 = ZombieDawn.field_J;
        try {
          L0: {
            if (param3.c(10)) {
              L1: {
                if (-1 == (param4 ^ -1)) {
                  var10 = ud.a(0, param3);
                  var6_array = var10;
                  if (var6_array != null) {
                    var7 = 0;
                    var8_int = 0;
                    L2: while (true) {
                      if (var10.length <= var8_int) {
                        if (var7 != 0) {
                          break L1;
                        } else {
                          return null;
                        }
                      } else {
                        L3: {
                          if (var10[var8_int].field_a != param1) {
                            break L3;
                          } else {
                            if (var10[var8_int].field_d == param5) {
                              L4: {
                                if (param2 == 0) {
                                  break L4;
                                } else {
                                  if (var10[var8_int].field_f != param2) {
                                    break L3;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              L5: {
                                if (var7 == 0) {
                                  break L5;
                                } else {
                                  if (param4 >= var10[var8_int].field_b) {
                                    break L3;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              var7 = 1;
                              param4 = var10[var8_int].field_b;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        }
                        var8_int++;
                        continue L2;
                      }
                    }
                  } else {
                    stackOut_7_0 = null;
                    stackIn_8_0 = stackOut_7_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
              var11 = param3.a(param4, 1525233840, param5, param2, param1);
              var7 = 116 % ((47 - param0) / 60);
              L6: while (true) {
                if (0 != var11.field_f) {
                  var8 = (java.awt.Frame) (var11.field_d);
                  if (var8 != null) {
                    if (2 == var11.field_f) {
                      jb.a(-41, var8, param3);
                      stackOut_33_0 = null;
                      stackIn_34_0 = stackOut_33_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      return var8;
                    }
                  } else {
                    return null;
                  }
                } else {
                  ld.a(10L, (byte) 118);
                  continue L6;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) (var6);
            stackOut_35_1 = new StringBuilder().append("me.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param3 == null) {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L7;
            } else {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L7;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.awt.Frame) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.awt.Frame) ((Object) stackIn_8_0);
          } else {
            return (java.awt.Frame) ((Object) stackIn_34_0);
          }
        }
    }

    private final int f(int param0, int param1) {
        java.awt.Frame discarded$4 = null;
        if (param1 != 0) {
            ec var4 = (ec) null;
            discarded$4 = me.a((byte) 107, -40, 33, (ec) null, -118, -80);
            if (-1 < (qd.field_f[param0] ^ -1)) {
                return 0;
            }
            if ((h.field_e[param0] ^ -1) == 0) {
                return 0;
            }
            return qd.field_f[param0] * h.field_e[param0];
        }
        if (-1 < (qd.field_f[param0] ^ -1)) {
            return 0;
        }
        if ((h.field_e[param0] ^ -1) == 0) {
            return 0;
        }
        return qd.field_f[param0] * h.field_e[param0];
    }

    final void a(wk param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        var8 = ZombieDawn.field_J;
        try {
          L0: {
            var3_int = param0.a(this.a(true), (byte) -99);
            var4 = param0.a(this.f(237239984), param1 ^ param1);
            bi.d(var3_int, var4, this.field_pb, 65535);
            bi.e(var3_int, var4, param0.a(this.field_Y, (byte) -71), param0.a(this.field_X, 0), 16711935);
            var5 = 0;
            L1: while (true) {
              if (var5 >= this.field_ub) {
                break L0;
              } else {
                var6 = param0.a(this.field_jb[var5], (byte) -114);
                var7 = param0.a(this.field_gb[var5], 0);
                bi.b(var6 - 1, var7 - 1, 3, 3, 0);
                bi.a(var6, var7, 65280);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("me.L(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
    }

    static {
        field_Fb = new String[][][]{new String[][]{new String[]{"Greetings, Lord of the Undead Hordes. Welcome to Zombie Dawn.<br><br>What's this putrid, rotting green thing hiding in the corner of the car park? Oh, it's one of your minions. <col=ff0000>Click on it to select it</col>.", "Now that you've selected your minion, <col=ff0000>click on the map to tell it where to go</col>.<br><br>Why not send it over to make friends with that nervous-looking guy?", "Hurrah! If all survivors are so easy to assimilate, world domination is going to be a cinch.<br><br>You can <col=ff0000>look around using the arrow keys</col> or by <col=ff0000>click-dragging with the right mouse button</col>.<br><br>Now, O Evil One, use your rotting hordes to capture another tasty human.", "Delicious! I hope you enjoyed that. Now, listen closely: the goal on every level is to <col=ff0000>zombify all the humans</col> and you've got one more to go.<br><br>The counter in the bottom-left corner tracks your progress. Onward!"}, new String[]{"It's about time to start conquering humanity, don't you think? Conventional wisdom tells us that there is no better place to begin than a suburban mall.<br><br>There are <col=ff0000>five humans on this level</col> - you know what to do.", "You can <col=ff0000>hold down 'SHIFT'</col> when clicking zombies to select several at once or you can <col=ff0000>click and drag</col> with the left mouse button to draw a box around them. Right-click to unselect them.", "Some humans are trickier to capture than others. Try to spread out your minions to cover all the exits before you move in."}, new String[]{"It looks like these delicious humans have locked themselves inside a shop. You'll have to resort to some clever zombie tactics, such as <col=ff0000>grabbing that shiny powerup</col> around the corner.", "You got a <col=ff0000>Detonate powerup</col>! You can have up to eight powerups held in the <col=ff0000>menu at the bottom of the screen</col>. This one causes a zombie to explode, smashing windows and knocking over humans. Since your other zombies aren't explosion-proof, make sure they stand well back.<br><br>To use it, get your chosen minion standing in front of the shop window. <col=ff0000>Click on the powerup, then click on the zombie</col>.", "Holy smokes, Bat Man! That guy's carrying a baseball bat and he isn't too keen on being turned into a walking corpse. Luckily, he can only hit one zombie at a time...", "No, no. You've got to <col=ff0000>blow out the windows</col> to get inside the shop. Press 'ESC' to access the pause menu and click '<col=ff0000>Retry</col>' to have another go."}, new String[]{"Use the <col=ff0000>Speed powerup</col> to make a zombie hyperactive. It'll move twice as fast, which is useful for a big shop like this."}, new String[]{"Here's a chance to use some more sneaky zombie tactics.<br><br>If you send one of your minions out into the hall, you'll scare them all away, but by using these powerups you can <col=ff0000>capture all those humans in one go.</col>", "This is the <col=ff0000>Disguise powerup</col>. Use it to make a zombie blend seamlessly into the environment.<br><br>Humans will not run away and your zombie will get closer before it gets the urge to bite.", "This is the <col=ff0000>Screech powerup</col>. Use it to make a zombie scream so loud that nearby humans are rooted to the spot in fear.<br><br>The effect lasts for fifteen seconds, so have your other zombie ready to charge in and grab them all."}, new String[]{"Look out! Those gangsters around the corner are carrying guns and they'll shoot any zombie on sight. You'll need a much larger horde before you can overwhelm them - might I suggest you clear out the cinema first, Your Evilness?", "Excellent work. Oh, and if you hadn't already noticed, the <col=ff0000>counter in the bottom-right corner</col> tells you how many zombies you've got left alive. Well, dead. Undead. Whatever.<br><br>If it falls to zero you will fail the level and must retry.", "That wasn't very clever. You only got one Detonate powerup and you didn't use it to blow out the windows? Perhaps you should try the <col=ff0000>Retry</col> option under the pause menu."}}, new String[][]{new String[]{"Welcome to the <col=ff0000>Power Plant</col>. Unfortunately, the spongy governments of humanity have got wind of your evil scheme and they're not entirely happy about it.<br><br>You're working against the clock, now. When the <col=ff0000>timer in the top-right corner</col> reaches zero, soldiers will start arriving and they'll make short work of your precious minions. It will start ticking the moment you close this tutorial.", "Oh no! The soldiers have appeared at the front door. Better finish up quick..."}, new String[]{"This is the <col=ff0000>Phantom powerup</col>. Using it makes a zombie leave an imprint of itself at its position, which acts as a stationary drone.<br><br>Humans will try to avoid it as if it were a normal zombie. It can be useful for <col=ff0000>blocking off doorways</col> and <col=ff0000>trapping humans in one room</col>."}, new String[]{"My oh my, this place is a mess. These people would all be much happier as zombies.<br><br>Did you know that, to the undead, toxic slime tastes of chocolate milkshake?", "In case you were wondering, the red thing in the other building is the <col=ff0000>Tough powerup</col>. Any zombie that uses it will take three bullets (or explosions) to kill."}, null, new String[]{"Ah, very clever, you found the <col=ff0000>Meltdown powerup</col>. This causes a zombie to dissolve into a large puddle of hyperadhesive dimethyl hydrobenzinate-5 (the technical term is 'sticky zombie goo').<br><br>Humans can only run very slowly through it, but your minions will not be be affected.", "Sire! That really is a most excellent choice, indeed! The <col=ff0000>Curse powerup</col> is so very evil. Just use it on a human and 'pop': instant zombie. Do be careful who you choose, though, as they are awfully rare."}, new String[]{"Phew. There's no timer on this level, but those guys in suits don't look too friendly..."}}, new String[][]{null, null, null, null, null, new String[]{"Huzzah! The soldiers are taking a break; there's no time limit on this level.<br><br>Unfortunately, this level appears to be impossible. Sorry, it looks like humanity wins. You'd better stop playing, now.", "A disguise! That's great! One costume for two hundred and twenty zombies. What were you thinking? Please, give up now. You're embarrassing yourself.", "Look, I don't want to be rude. We've had some good times, haven't we? Laughed a little, cried a little...but do you have any idea how many guns there are between you and the exit? Just admit that you're stuck, then go and play Monkey Puzzle 2."}}, new String[][]{}, new String[][]{new String[]{"Welcome to England, m'lord! But watch out, they're screening the passengers! Better keep our disguise for now, lord, until you're ready to strike.<br><br>There should be new tools hidden ahead. Let's get them! Discreetly, please...", "New technology! You can now use the <col=ff0000>Quake powerup</col>. This will cause glass windows to break and make humans stumble and fall."}, new String[]{"The <col=ff0000>Quake powerup</col> affects all the glass panes in the level, but the humans will only stay down for a little while. Make sure you know where you're going before you use it."}, new String[]{"Ah, the <col=ff0000>Miasma powerup</col>! This will create a cloud of acidic gas, preventing humans and zombies from moving -- they will not move in, move out, or see through the cloud. Try using it to cover your exit from this room.<br><br>Be advised that it only lasts for a little while."}, new String[]{"Sometimes there's a better way to deal with guards than just running past them... Try using these powerups to deal with that inspector.", "The <col=ff0000>Fear powerup</col> will make even armed guards shiver and shake. They will run from your fearsome zombie instead of shooting.<br><br>It only works if they can see the zombie, of course, and watch out, as it will only last for a short while. Once it's gone, the guards will start shooting again. So make sure you eat them while they're scared!"}, new String[]{"<col=ff00000>Miasma</col> is also very useful to channel humans into the places you want them to go to. Make sure you don't let them get too close to the guards."}, new String[]{"Don't be scared. Guards like that only shoot when cornered. If you rush them, they'll run away rather than stand and fight.<br><br>The cowards."}}, new String[][]{new String[]{"What is that? Look! A different zombie strain! They have no overlord of their own, but will still do their best to hunt humans.<br><br>Quick, master, stop them before they take all the humans for themselves.<br><br>Hopefully that guard will take care of them.", "Aah, the <col=ff0000>Shackles powerup</col>. This will allow you to permanently slow down the enemy zombies and prevent them from getting too many humans. Use it right away!", "The <col=ff0000>Shackles powerup</col> also works on humans, making them run as if in slow motion. Guards will also take longer to fire shots at you."}, new String[]{"You'll find that your zombies don't really like the mutant ones - they'll claw and punch each other. Hurry and try to block their path to the humans.<br><br>You have a quota to fill. If the enemy zombies get too many humans, you will fail... But at least you don't have to get every single human around here."}, new String[]{"Watch out: a hunter! That farmer has a rifle and he won't be too happy to have zombies on his land.<br><br>Maybe the other zombies will lure him out...", "The <col=ff0000>Shockwave powerup</col> creates a concussive force that sends humans and zombies flying. It will also break some doors and windows, like Detonate does.<br><br>Try using it to send the hunter to the ground, but have a zombie nearby ready to eat him once he gets knocked down."}, null, new String[]{"Oh no! The enemy zombies will make short work of those humans! You’d better make your way there as fast as you can. Watch out for the hunter nearby!"}}, new String[][]{new String[]{"The genetics lab. These operatives are researching new powerups and different zombie strains. We must possess their knowledge!<br><br>Their entrance is locked, though, so we need to send a human with the appropriate keycard through first to open the door for us.", "Well done! We must be careful not to zombify keycard holders too early. Zombies can't use keycards, you know."}, null, new String[]{"New technology! The <col=ff0000>Breach powerup</col> will let you dissolve walls and obstacles, creating a hole for you to move through. You can use it to open shortcuts or provide access to blocked-off areas."}, new String[]{"They seem to be studying how zombies work. Hmm, I wonder what's in those cages...", "Did you see that? What was that? It was all purple and slimy and...tentacled! Don't let it eat our precious resources!", "What's that awful smell? Oh, I see one of your zombies walked right into a laser barrier. Try not to let it happen again, please. Nothing smells worse than a burning zombie.<br><br>Well, almost nothing."}, null, new String[]{"Goodness, look at all those agents! We'll need a lot of powerups to deal with them.<br><br>And how are we getting in there in the first place?"}}, new String[][]{new String[]{"At last, the Palace! Those grenadiers by the main door look pretty tough, though. I wonder how we're going to get through...", "Aha, we have a zombie on the inside! Well done, master. Just watch out for those patrolling guards.", "Ah! This looks like the perfect tool to clear the way for your minions outside... Time to bring them all in!"}, null, new String[]{"We're stuck in here, trapped in this room...<br><br>Look! Those humans can open this green door for us! Make sure they make their way safely to where we are!"}, new String[]{"Don't eat that human! He's our chance to open these doors! If your zombies get him into a corner, you can <col=00ff00>Shackle</col> them into submission. This will help the keycard holder get away..."}, null, new String[]{"The Throne Room, at last! Only two grenadiers stand between us and complete domination! Find a way in and swarm them so we can take the crown!"}}};
        field_Hb = "Achievements this game:";
        field_Bb = 480;
        field_Gb = 50;
        field_Cb = "Unfortunately your configuration doesn't support fullscreen mode.";
    }
}
