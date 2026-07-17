/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl {
    tc field_c;
    int field_f;
    static boolean[][] field_j;
    static dd field_h;
    static String field_i;
    static String field_a;
    static String field_d;
    static int field_b;
    static String[][] field_e;
    int field_g;

    final boolean b(int param0, int param1) {
        int var3 = 0;
        if (!(null != ((dl) this).field_c)) {
            return false;
        }
        for (var3 = 0; var3 < ((dl) this).field_c.a((byte) 88); var3++) {
            if (!(((dl) this).field_c.a(var3, 2229) != param0)) {
                return true;
            }
        }
        if (param1 != 304) {
            return false;
        }
        return false;
    }

    final static boolean a() {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        var2 = Pool.field_O;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              if (var1_int >= ml.field_h.length) {
                stackOut_12_0 = 1;
                stackIn_13_0 = stackOut_12_0;
                break L0;
              } else {
                L2: {
                  if (ml.field_h[var1_int][0] == -3) {
                    break L2;
                  } else {
                    if (-3 != ml.field_h[var1_int][2]) {
                      if (!en.a(ml.field_h[var1_int][1], ml.field_h[var1_int][0], 115)) {
                        break L2;
                      } else {
                        if (en.a(ml.field_h[var1_int][3], ml.field_h[var1_int][2], 110)) {
                          stackOut_9_0 = 0;
                          stackIn_10_0 = stackOut_9_0;
                          return stackIn_10_0 != 0;
                        } else {
                          break L2;
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                }
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1, "dl.C(" + 0 + 41);
        }
        return stackIn_13_0 != 0;
    }

    public static void b() {
        field_h = null;
        field_j = null;
        field_e = null;
        field_i = null;
        field_a = null;
        field_d = null;
    }

    final int a(byte param0) {
        int var2 = 67 / ((-51 - param0) / 62);
        return (((dl) this).field_c == null ? 0 : ((dl) this).field_c.a((byte) 99)) + 1;
    }

    final void a(boolean param0) {
        int var2 = 0;
        Object var3 = null;
        L0: {
          if (param0) {
            break L0;
          } else {
            var3 = null;
            ie discarded$2 = dl.a(29, (String) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((dl) this).field_c == null) {
              break L2;
            } else {
              if (((dl) this).field_c.a((byte) 123) == 0) {
                break L2;
              } else {
                System.out.print("{");
                var2 = 0;
                L3: while (true) {
                  if (var2 >= ((dl) this).field_c.a((byte) 113)) {
                    System.out.print("}");
                    break L1;
                  } else {
                    L4: {
                      if (0 != var2) {
                        System.out.print(",");
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    System.out.print(Integer.toString(((dl) this).field_c.a(var2, 2229)));
                    var2++;
                    continue L3;
                  }
                }
              }
            }
          }
          System.out.print("empty");
          break L1;
        }
    }

    final void a(byte param0, ge param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var5 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (param0 == 113) {
                break L1;
              } else {
                ((dl) this).field_f = -35;
                break L1;
              }
            }
            L2: {
              var3_int = param1.g(-101);
              if (var3_int > 0) {
                ((dl) this).field_c = cj.a(var3_int, 1, 0);
                var4 = 0;
                L3: while (true) {
                  if (var4 >= var3_int) {
                    break L2;
                  } else {
                    ((dl) this).field_c.a(10499, param1.g(param0 + -222), var4);
                    var4++;
                    continue L3;
                  }
                }
              } else {
                ((dl) this).field_c = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("dl.I(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
    }

    final void a(int param0, int param1) {
        if (((dl) this).field_c == null) {
            ((dl) this).field_c = qe.b(true);
        }
        int var3 = 126 / (param1 / 51);
        ((dl) this).field_c.a((byte) -2, param0);
    }

    final void a(ge param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                boolean discarded$2 = ((dl) this).b(-87, 43);
                break L1;
              }
            }
            L2: {
              if (null != ((dl) this).field_c) {
                param0.a(((dl) this).field_c.a((byte) 120), false);
                var3_int = 0;
                L3: while (true) {
                  if (((dl) this).field_c.a((byte) 108) <= var3_int) {
                    break L2;
                  } else {
                    param0.a(((dl) this).field_c.a(var3_int, 2229), false);
                    var3_int++;
                    continue L3;
                  }
                }
              } else {
                param0.a(0, false);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("dl.F(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
    }

    final static ie a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        ie stackIn_2_0 = null;
        ie stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        ie stackIn_19_0 = null;
        ie stackIn_23_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        ie stackOut_5_0 = null;
        ie stackOut_18_0 = null;
        ie stackOut_22_0 = null;
        Object stackOut_8_0 = null;
        ie stackOut_1_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        try {
          var2_int = param1.length();
          if (0 != var2_int) {
            if (63 < var2_int) {
              stackOut_5_0 = la.field_h;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0;
            } else {
              if (param0 > 36) {
                var3 = 0;
                L0: while (true) {
                  if (var3 < var2_int) {
                    L1: {
                      var4 = param1.charAt(var3);
                      if (var4 == 45) {
                        L2: {
                          if (0 == var3) {
                            break L2;
                          } else {
                            if (var2_int - 1 != var3) {
                              break L1;
                            } else {
                              break L2;
                            }
                          }
                        }
                        stackOut_18_0 = pj.field_K;
                        stackIn_19_0 = stackOut_18_0;
                        return stackIn_19_0;
                      } else {
                        if (ie.field_c.indexOf(var4) == -1) {
                          stackOut_22_0 = pj.field_K;
                          stackIn_23_0 = stackOut_22_0;
                          return stackIn_23_0;
                        } else {
                          break L1;
                        }
                      }
                    }
                    var3++;
                    continue L0;
                  } else {
                    return null;
                  }
                }
              } else {
                stackOut_8_0 = null;
                stackIn_9_0 = stackOut_8_0;
                return (ie) (Object) stackIn_9_0;
              }
            }
          } else {
            stackOut_1_0 = uj.field_e;
            stackIn_2_0 = stackOut_1_0;
            return stackIn_2_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var2;
            stackOut_26_1 = new StringBuilder().append("dl.B(").append(param0).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L3;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 41);
        }
    }

    final void a(pq[] param0, int param1) {
        tc var3 = null;
        int var4 = 0;
        int var5 = 0;
        if (null == ((dl) this).field_c) {
            return;
        }
        try {
            var3 = qe.b(true);
            var4 = 0;
            for (var5 = 0; var5 < ((dl) this).field_c.a((byte) 110); var5++) {
                if (!param0[((dl) this).field_c.a(var5, 2229)].field_s) {
                    int incrementValue$0 = var4;
                    var4++;
                    var3.a(10499, ((dl) this).field_c.a(var5, 2229), incrementValue$0);
                }
            }
            if (param1 >= -36) {
                int discarded$1 = ((dl) this).a((byte) -111);
            }
            ((dl) this).field_c = var3.a((byte) 98) == 0 ? null : var3;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "dl.J(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    dl(bf param0) {
        ((dl) this).field_c = null;
        try {
            ((dl) this).field_g = (param0.field_f + param0.field_a) / 2;
            ((dl) this).field_f = (param0.field_j - -param0.field_l) / 2;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "dl.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Full";
        field_a = "You have not yet unlocked this option for use.";
        field_e = new String[][]{new String[1], new String[1], new String[2], new String[3], new String[2], new String[2], new String[3], new String[2], new String[2], new String[2], new String[2], new String[1], new String[2], new String[4], new String[2], new String[2], new String[2]};
        field_i = "<%0> have all resigned!";
    }
}
