/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class af extends kc {
    static qb[] field_Jb;
    static int field_Eb;
    static boolean field_Ib;
    private kc field_Db;
    static String field_Gb;
    static String field_Kb;
    static String field_Cb;
    static String[] field_Bb;
    static float field_Hb;
    private kc field_Fb;

    final static ll a(String param0, String param1, int param2, eg param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ll stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 19412) {
            field_Gb = (String) null;
          }
          var4_int = param3.c(param1, 90);
          var5 = param3.a(param0, (byte) 98, var4_int);
          stackIn_3_0 = me.a(param3, 31027, var4_int, var5);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("af.F(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.a(param2, param0, param3, param1, (byte) -120);
        this.b(param5, 196);
        if (param4 != -31179) {
          field_Hb = -0.7085046172142029f;
        }
    }

    final static char a(char param0, byte param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (param1 == 22) {
          var2 = param0;
          if (var2 == 32) {
            return '_';
          }
          if (var2 == 160) {
            return '_';
          }
          if (var2 == 95) {
            return '_';
          }
          if (45 == var2) {
            return '_';
          }
          if (var2 == 91) {
            return param0;
          }
          if (var2 != 93 &&
            var2 != 35) {
            if (224 != var2 &&
              var2 != 225 &&
              var2 != 226 &&
              228 != var2 &&
              var2 != 227 &&
              var2 != 192 &&
              var2 != 193 &&
              var2 != 194 &&
              var2 != 196 &&
              var2 != 195) {
              if (232 != var2 &&
                var2 != 233 &&
                var2 != 234 &&
                var2 != 235 &&
                var2 != 200 &&
                var2 != 201 &&
                var2 != 202 &&
                var2 != 203) {
                if (var2 != 237 &&
                  var2 != 238 &&
                  var2 != 239 &&
                  var2 != 205 &&
                  206 != var2 &&
                  var2 != 207) {
                  if (242 != var2 &&
                    var2 != 243 &&
                    var2 != 244 &&
                    var2 != 246 &&
                    245 != var2 &&
                    var2 != 210 &&
                    var2 != 211 &&
                    212 != var2 &&
                    var2 != 214) {
                    if (213 == var2) {
                      return 'o';
                    }
                    if (var2 != 249 &&
                      var2 != 250) {
                      if (251 == var2) {
                        return 'u';
                      }
                      if (252 == var2) {
                        return 'u';
                      }
                      if (217 != var2) {
                        if (218 == var2) {
                          return 'u';
                        }
                        if (var2 != 219 &&
                          var2 != 220) {
                          if (231 == var2) {
                            return 'c';
                          }
                          if (199 == var2) {
                            return 'c';
                          }
                          if (255 != var2 &&
                            var2 != 376) {
                            if (241 == var2) {
                              return 'n';
                            }
                            if (var2 == 209) {
                              return 'n';
                            }
                            if (223 != var2) {
                              return Character.toLowerCase(param0);
                            }
                            return 'b';
                          }
                          return 'y';
                        }
                      }
                    }
                    return 'u';
                  }
                  return 'o';
                }
                return 'i';
              }
              return 'e';
            }
            return 'a';
          }
          return param0;
        }
        field_Kb = (String) null;
        var2Lifetime1 = param0;
        if (var2Lifetime1 != 32) {
          if (var2Lifetime1 == 160) {
            return '_';
          }
          if (var2Lifetime1 != 95 &&
            45 != var2Lifetime1) {
            if (var2Lifetime1 != 91 &&
              var2Lifetime1 != 93 &&
              var2Lifetime1 != 35) {
              if (224 != var2Lifetime1 &&
                var2Lifetime1 != 225 &&
                var2Lifetime1 != 226 &&
                228 != var2Lifetime1 &&
                var2Lifetime1 != 227 &&
                var2Lifetime1 != 192) {
                if (var2Lifetime1 == 193) {
                  return 'a';
                }
                if (var2Lifetime1 != 194 &&
                  var2Lifetime1 != 196 &&
                  var2Lifetime1 != 195) {
                  if (232 != var2Lifetime1 &&
                    var2Lifetime1 != 233 &&
                    var2Lifetime1 != 234 &&
                    var2Lifetime1 != 235 &&
                    var2Lifetime1 != 200 &&
                    var2Lifetime1 != 201) {
                    if (var2Lifetime1 == 202) {
                      return 'e';
                    }
                    if (var2Lifetime1 == 203) {
                      return 'e';
                    }
                    if (var2Lifetime1 == 237) {
                      return 'i';
                    }
                    if (var2Lifetime1 == 238) {
                      return 'i';
                    }
                    if (var2Lifetime1 == 239) {
                      return 'i';
                    }
                    if (var2Lifetime1 == 205) {
                      return 'i';
                    }
                    if (206 == var2Lifetime1) {
                      return 'i';
                    }
                    if (var2Lifetime1 == 207) {
                      return 'i';
                    }
                    if (242 != var2Lifetime1) {
                      if (var2Lifetime1 == 243) {
                        return 'o';
                      }
                      if (var2Lifetime1 != 244) {
                        if (var2Lifetime1 == 246) {
                          return 'o';
                        }
                        if (245 != var2Lifetime1 &&
                          var2Lifetime1 != 210) {
                          if (var2Lifetime1 == 211) {
                            return 'o';
                          }
                          if (212 != var2Lifetime1) {
                            if (var2Lifetime1 == 214) {
                              return 'o';
                            }
                            if (213 == var2Lifetime1) {
                              return 'o';
                            }
                            if (var2Lifetime1 != 249 &&
                              var2Lifetime1 != 250) {
                              if (251 == var2Lifetime1) {
                                return 'u';
                              }
                              if (252 == var2Lifetime1) {
                                return 'u';
                              }
                              if (217 != var2Lifetime1) {
                                if (218 == var2Lifetime1) {
                                  return 'u';
                                }
                                if (var2Lifetime1 != 219 &&
                                  var2Lifetime1 != 220) {
                                  if (231 == var2Lifetime1) {
                                    return 'c';
                                  }
                                  if (199 == var2Lifetime1) {
                                    return 'c';
                                  }
                                  if (255 != var2Lifetime1 &&
                                    var2Lifetime1 != 376) {
                                    if (241 == var2Lifetime1) {
                                      return 'n';
                                    }
                                    if (var2Lifetime1 == 209) {
                                      return 'n';
                                    }
                                    if (223 != var2Lifetime1) {
                                      return Character.toLowerCase(param0);
                                    }
                                    return 'b';
                                  }
                                  return 'y';
                                }
                              }
                            }
                            return 'u';
                          }
                        }
                      }
                    }
                    return 'o';
                  }
                  return 'e';
                }
              }
              return 'a';
            }
            return param0;
          }
        }
        return '_';
    }

    af(long param0, af param1, String param2) {
        this(param0, param1.field_Fb, param1.field_Db, param2);
    }

    private final void b(int param0, int param1) {
        int var3 = 0;
        int var3Lifetime1;
        if (param1 == 196) {
          this.field_Fb.a(this.field_Fb.c(param1 - 26117), 0, 0, this.field_I, (byte) -120);
          var3 = this.field_Fb.field_x + param0;
          this.field_Db.a(-var3 + this.field_x, var3, 0, this.field_I, (byte) -120);
          return;
        }
        this.a(28, 56, 27, -126, 76, 103);
        this.field_Fb.a(this.field_Fb.c(param1 - 26117), 0, 0, this.field_I, (byte) -120);
        var3Lifetime1 = this.field_Fb.field_x + param0;
        this.field_Db.a(-var3Lifetime1 + this.field_x, var3Lifetime1, 0, this.field_I, (byte) -120);
    }

    final int a(int param0, byte param1) {
        if (param1 == -126) {
          return this.field_Fb.c(param1 - 25795) + param0 + this.field_Db.c(-25921);
        }
        return -111;
    }

    public static void e(int param0) {
        field_Kb = null;
        field_Gb = null;
        field_Bb = null;
        field_Jb = null;
        field_Cb = null;
        int var1 = 66 / ((-6 - param0) / 44);
    }

    af(long param0, qb param1, qb param2, int param3, kc param4, String param5) {
        this(param0, (kc) null, param4, param5);
        try {
          this.field_Fb.field_gb = param3;
          this.field_Fb.field_W = param2;
          this.field_Fb.field_w = param1;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "af.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    private af(long param0, kc param1, kc param2, String param3) {
        super(param0, (kc) null);
        try {
          this.field_Fb = new kc(0L, param1);
          this.field_Db = new kc(0L, param2);
          this.field_Db.field_rb = param3;
          this.a(this.field_Fb, 51);
          this.a(this.field_Db, 106);
          this.e((byte) 20);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "af.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_Gb = "Enter name of friend to delete from list";
        field_Kb = "Please enter a year between <%0> and <%1>";
        field_Bb = new String[]{"Win a Rated game", "Win 5 Rated games", "Win 20 Rated games", "Win 50 Rated games", "Obtain a rating of 2000 after winning 50 Rated games", "Obtain a rating of 4000 after winning 50 Rated games", "Win a Rated game with the full Book of Flame", "Win a Rated game with the full Book of Frost", "Win a Rated game with the full Book of Storm", "Win a Rated game with the full Book of Stone", "Win a Rated game with the full Book of Overlight", "Win a Rated game with the full Book of Underdark", "Win a Rated game with 10 minion spells in your spellbook", "Win 2 Rated games in a row during one session", "Win 5 Rated games in a row during one session", "Deal 250 damage in one attack, during a Rated game", "Win a Rated game with the full Book of Nature", "Win a Rated game with the full Book of Seas", "Win a Rated game, over 1500 rating, using a Harpy Flame familiar", "Win a Rated game, over 1500 rating, using a Frost Sprite familiar", "Win a Rated game, over 1500 rating, using a Storm Cloud familiar", "Win a Rated game, over 1500 rating, using a Pet Rock familiar", "Win a Rated game, over 2000 rating, using a Soul Jar", "Win a Rated game, over 2000 rating, using a Cherub familiar", "Win a Rated game, over 2500 rating, using a Fungus familiar", "Win a Rated game, over 2500 rating, using a Seahorse familiar", "Win a Rated team game taking no losses to your team", "Win a Rated team game, over 2000 rating, taking no losses to your team", "Win a Free-For-All Rated game with 4+ players", "Win a Free-For-All Rated game, over 2000 rating, with 4+ players", "Win a Rated game, over 3000 rating, with any full spellbook", "Purchase the fifth prestige hat for your Arcanist", "Win a Rated game with the full Book of Cogs", "Win a Rated game, over 3000 rating, using a Alarm Clock familiar", "Kill an Arcanist in a Rated game with a ball, bomb or bolt spell... from the opposite side of the map", "Win a Rated game with a very weak attack", "Win a Rated game with 1 health remaining", "Win a Rated game because the enviroment aided you", "Win a Rated game by knocking your opponent into the water", "Kill at three or more Arcanists in the final turn within a Rated game", "Win a Rated team game using teammate's minion to kill the last enemy", "Win a Rated game with an army of at least four Hard Water Trolls", "Use a flurry with at least four Elves at maximum power in a Rated game", "Only deal damage with minions and win a Rated game", "Win a Rated game ending as a Lich with a Zombie Dragon", "Win a Rated game, over 2000 rating, taking no towers", "Win Rated games on every map without changing your spellbook", "Purchase the tenth (and final) prestige hat for your Arcanist", "Defeat an Arcane Master Moderator in an epic battle of skill and arcane cunning!", "Deal 1,000 damage to your enemies in Rated games", "Deal 5,000 damage to your enemies in Rated games", "Deal 25,000 damage to your enemies in Rated games", "Deal 250,000 damage to your enemies in Rated games", "Deal 1,000,000 damage to your enemies in Rated games", "Win a Rated game, over 3000 rating, with the full Arcane Book", "Play a Rated game and kill the most enemy Zombie Monkeys in the Mos Le'Harmless arena during the Hallowe'en holiday", "Win a Rated game in resizable mode", "Win a Rated game in which you cause great rifts in the world", "Win a Rated game in which you exhibit great celestial control", "Win a Rated game having summoned forth the greatest foes", "Win a Rated game having controlled the weather blocking out the sun", "Win a Rated game where you show mastery of your whole spell book", "Deal excessive damage with control of nature", "Show your superiority of tower ownership", "Show how well you use your Beasts of Burden to shield you from enemy attack", "Destroy an enemy with the ultimate weapon of light", "Zombify the mount another Arcanist is riding", "Subvert the ultimate weapon of light", "Prove yourself the lord of dragons in a six player free-for-all fight", "Destroy an enemy's soul jar", "Exhibit your skill of sanctification", "Kill a player with the power of plants", "Win a Rated game using no direct fire spells (Balls, Bombs or Arrows)", "Win a Rated game using only bombs", "Kill at least 2 enemies using bombs thrown from the ground", "Cast four spells in a turn killing an enemy without finishing your turn", "Charge the ultimate defence of the arcane powers", "Kill a player by recalling them into the path of impending doom", "Kill a player while holding the remnants of his feeble attempt to destroy the world", "Heal excessively using the greatest powers of darkness", "Prove your familar's mastery in a six player game where all chose a different path", "Kill a player using an arcane portal to curcumnavigate their defences", "Deal excessive damage using the staff of the storm", "Kill a player with a skimming throw across the water", "Kill a player with a drop arrow", "Punch, Bash or Whip your enemies far and wide", "Insta-kill with the Dark Knight", "Win a game at the last possible moment", "Deal excessive damage by pulling all minions into darkness", "Shake the world causing the drowning of many foes", "Show your extreme hatred of towers by destoying them as soon as they rise", "Launch yourself into space!", "Sacrifice your windy minion and laugh at the concequences", "Wash your enemy's shields off for him", "Show your mastery of Flash or Vine Whip"};
        field_Cb = "As mentioned before, you can cycle through your minions by pressing 'N'; they move in the same way as yourself.  Select a minion now.";
        field_Ib = false;
    }
}
