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
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var3_int = 0;
        int var4 = 0;
        Object stackIn_8_0 = null;
        java.awt.AWTEvent stackIn_8_1 = null;
        Object stackIn_10_0 = null;
        java.awt.AWTEvent stackIn_10_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        java.awt.AWTEvent stackOut_7_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
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
                      stackOut_7_0 = null;
                      stackOut_7_1 = param0.field_m.peekEvent();
                      stackIn_10_0 = stackOut_7_0;
                      stackIn_10_1 = stackOut_7_1;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      if (var4 != 0) {
                        if (stackIn_10_0 != stackIn_10_1) {
                          break L3;
                        } else {
                          return;
                        }
                      } else {
                        if (stackIn_8_0 == stackIn_8_1) {
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
            stackOut_20_0 = (RuntimeException) (var3_ref);
            stackOut_20_1 = new StringBuilder().append("db.C(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          L7: {
            stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param2 + ')');
        }
    }

    final int a(int param0, boolean param1) {
        int discarded$4 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
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
          discarded$4 = this.a(4, true);
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
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var5 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = 1;
            L1: while (true) {
              L2: {
                L3: {
                  if ((param0.length >> -639552927) + param0.length < var2_int) {
                    break L3;
                  } else {
                    var2_int = var2_int << 1;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                this.field_c = new int[var2_int - -var2_int];
                break L2;
              }
              var3 = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (var3 >= var2_int + var2_int) {
                      break L6;
                    } else {
                      this.field_c[var3] = -1;
                      var3++;
                      if (var5 != 0) {
                        break L5;
                      } else {
                        if (var5 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  var3 = 0;
                  break L5;
                }
                L7: while (true) {
                  if (var3 >= param0.length) {
                    break L0;
                  } else {
                    if (var5 == 0) {
                      var4 = -1 + var2_int & param0[var3];
                      L8: while (true) {
                        L9: {
                          if (0 == (this.field_c[1 + (var4 - -var4)] ^ -1)) {
                            this.field_c[var4 + var4] = param0[var3];
                            this.field_c[var4 + (var4 + 1)] = var3;
                            var3++;
                            break L9;
                          } else {
                            var4 = var2_int - 1 & var4 + 1;
                            if (var5 != 0) {
                              break L9;
                            } else {
                              continue L8;
                            }
                          }
                        }
                        continue L7;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var2);
            stackOut_21_1 = new StringBuilder().append("db.<init>(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L10;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L10;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
    }

    public static void a(int param0) {
        Object var2 = null;
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
