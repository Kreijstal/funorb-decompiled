/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db {
    static int[] field_e;
    private int[] field_c;
    static int field_d;
    static pd field_a;
    static String[] field_b;
    static String field_f;

    final static void a(fe param0, Object param1, int param2) {
        Object stackIn_10_0 = null;
        java.awt.AWTEvent stackIn_10_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (null != param0.field_m) {
              L1: {
                if (param2 <= -29) {
                  break L1;
                } else {
                  field_e = (int[]) null;
                  break L1;
                }
              }
              var3_int = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (-51 >= (var3_int ^ -1)) {
                      break L4;
                    } else {
                      stackIn_10_0 = null;

                      stackIn_10_1 = param0.field_m.peekEvent();

                      if (var4 != 0) {
                        if (stackIn_10_0 != stackIn_10_1) {
                          break L3;
                        } else {
                          return;
                        }
                      } else {
                        if (stackIn_10_0 == stackIn_10_1) {
                          break L4;
                        } else {
                          pg.a(1L, -101);
                          var3_int++;
                          if (var4 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  if (param1 != null) {
                    break L3;
                  } else {
                    return;
                  }
                }
                try {
                  L5: {
                    param0.field_m.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param1, 1001, "dummy")));
                    break L5;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var3 = (Exception) (Object) decompiledCaughtException;
                  return;
                }
                return;
              }
            } else {
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L6: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var3_ref);

            stackIn_22_1 = new StringBuilder().append("db.C(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L7;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L7;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_23_0), stackIn_26_2 + ',' + param2 + ')');
        }
    }

    final int a(int param0, boolean param1) {
        int var3;
        int var4;
        int var5;
        if (!param1) {
          var3 = -1 + (this.field_c.length >> 1189282881);
          var4 = var3 & param0;
          L0: while (true) {
            var5 = this.field_c[var4 + var4 + 1];
            if ((var5 ^ -1) == 0) {
              return -1;
            } else {
              if (param0 == this.field_c[var4 + var4]) {
                return var5;
              } else {
                var4 = var4 + 1 & var3;
                continue L0;
              }
            }
          }
        } else {
          this.a(4, true);
          var3 = -1 + (this.field_c.length >> 1189282881);
          var4 = var3 & param0;
          L1: while (true) {
            var5 = this.field_c[var4 + var4 + 1];
            if ((var5 ^ -1) == 0) {
              return -1;
            } else {
              if (param0 == this.field_c[var4 + var4]) {
                return var5;
              } else {
                var4 = var4 + 1 & var3;
                continue L1;
              }
            }
          }
        }
    }

    db(int[] param0) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = 1;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((param0.length >> -639552927) + param0.length < var2_int) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var2_int = var2_int << 1;
                        if (var5 != 0) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var5 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        this.field_c = new int[var2_int - -var2_int];
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var3 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var3 >= var2_int + var2_int) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.field_c[var3] = -1;
                        var3++;
                        if (var5 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var5 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var3 = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var3 >= param0.length) {
                            statePc = 25;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var5 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        return;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var4 = -1 + var2_int & param0[var3];
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (0 == (this.field_c[1 + (var4 - -var4)] ^ -1)) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var4 = var2_int - 1 & var4 + 1;
                        if (var5 != 0) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var5 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        this.field_c[var4 + var4] = param0[var3];
                        this.field_c[var4 + (var4 + 1)] = var3;
                        var3++;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var5 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 21: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_23_0 = (RuntimeException) (var2);
                    stackIn_22_0 = stackIn_23_0;
                    stackIn_23_1 = new StringBuilder().append("db.<init>(");
                    stackIn_22_1 = stackIn_23_1;
                    if (param0 == null) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    stackIn_24_0 = (RuntimeException) ((Object) stackIn_22_0);
                    stackIn_24_1 = (StringBuilder) ((Object) stackIn_22_1);
                    stackIn_24_2 = "{...}";
                    statePc = 24;
                    continue stateLoop;
                }
                case 23: {
                    stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
                    stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
                    stackIn_24_2 = "null";
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    throw ch.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
                }
                case 25: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        Object var2;
        field_f = null;
        field_e = null;
        field_a = null;
        field_b = null;
        if (param0 == 8192) {
          return;
        } else {
          var2 = (Object) null;
          db.a((fe) null, (Object) null, -100);
          return;
        }
    }

    static {
        field_e = new int[8192];
        field_f = "Unpacking music";
        field_b = new String[]{"Your aim in Transmogrify is to make a series of words from your collection of letter tiles.<br><br>There are 10 rounds: in each, you will keep the tiles from the previous word and get a new set of tiles in addition.<br><br>The tiles look like this: <img=1>", "You can move the tiles by dragging them, or by double-clicking them to add them to your proposed word.<br><br>Alternatively, you can use the keyboard. In this case, the 'UP' arrow key will assemble the word from the previous round and the 'DOWN' arrow key will clear the scoring rack.", "You cannot submit the same word twice in a single game.<br><br>If you really cannot make a word, you can skip a round, scoring 0 for it.<br><br>Tiles that are harder to use are worth more and reusing tiles causes their value to rise. The value is shown in the corner of the tile.", "Each of the 10 rounds has a bonus tile, which doubles the score for that word if it is used. This bonus does not carry through to the next round.<br><br>Bonus tiles look like this: <img=2>", "On top of points from the words themselves, there are two other bonuses available.<br><br>Make words quickly to get a large time bonus or make words radically different from previous words to get a large variety bonus. Once you've had some practice, try getting both.", "The dictionaries used by Transmogrify have been compiled from multiple independent sources.<br><br>Certain words that may offend some players have been omitted."};
    }
}
