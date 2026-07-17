/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii {
    static String[] field_g;
    static boolean field_e;
    private w field_l;
    static boolean field_d;
    static int field_a;
    static ka[] field_h;
    static int field_i;
    static qe field_k;
    static int field_c;
    private w field_b;
    static int[][] field_j;
    static int[][] field_f;

    final int a(boolean param0) {
        int var2 = 0;
        w var3 = null;
        int var4 = 0;
        var4 = TorChallenge.field_F ? 1 : 0;
        if (!param0) {
          return -18;
        } else {
          var2 = 0;
          var3 = ((ii) this).field_l.field_k;
          L0: while (true) {
            if (((ii) this).field_l == var3) {
              return var2;
            } else {
              var2++;
              var3 = var3.field_k;
              continue L0;
            }
          }
        }
    }

    final w a(int param0) {
        w var2 = ((ii) this).field_l.field_k;
        if (param0 != 25777) {
            int discarded$9 = ((ii) this).a(false);
            if (!(var2 != ((ii) this).field_l)) {
                ((ii) this).field_b = null;
                return null;
            }
            ((ii) this).field_b = var2.field_k;
            return var2;
        }
        if (!(var2 != ((ii) this).field_l)) {
            ((ii) this).field_b = null;
            return null;
        }
        ((ii) this).field_b = var2.field_k;
        return var2;
    }

    public static void b(int param0) {
        field_h = null;
        field_j = null;
        field_g = null;
        field_f = null;
        field_k = null;
    }

    final w c(int param0) {
        w var2 = null;
        var2 = ((ii) this).field_l.field_k;
        if (var2 != ((ii) this).field_l) {
          if (param0 != -1) {
            field_f = null;
            var2.a(12695);
            return var2;
          } else {
            var2.a(12695);
            return var2;
          }
        } else {
          return null;
        }
    }

    final w d(int param0) {
        w var2 = null;
        var2 = ((ii) this).field_b;
        if (((ii) this).field_l != var2) {
          ((ii) this).field_b = var2.field_k;
          if (param0 < 12) {
            int discarded$2 = ((ii) this).a(false);
            return var2;
          } else {
            return var2;
          }
        } else {
          ((ii) this).field_b = null;
          return null;
        }
    }

    final void a(w param0, int param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param0.field_i != null) {
                param0.a(12695);
                break L1;
              } else {
                break L1;
              }
            }
            param0.field_i = ((ii) this).field_l.field_i;
            param0.field_k = ((ii) this).field_l;
            param0.field_i.field_k = param0;
            param0.field_k.field_i = param0;
            if (param1 == 3329) {
              break L0;
            } else {
              var4 = null;
              ((ii) this).a((w) null, 42);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("ii.D(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException decompiledCaughtException = null;
        var12 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (qg.field_a <= param4) {
                break L1;
              } else {
                param0 = param0 - (-param4 + qg.field_a);
                param4 = qg.field_a;
                break L1;
              }
            }
            L2: {
              if (qg.field_k <= param5) {
                break L2;
              } else {
                param1 = param1 - (-param5 + qg.field_k);
                param5 = qg.field_k;
                break L2;
              }
            }
            L3: {
              if (qg.field_c >= param4 - -param0) {
                break L3;
              } else {
                param0 = -param4 + qg.field_c;
                break L3;
              }
            }
            L4: {
              if (param1 + param5 <= qg.field_l) {
                break L4;
              } else {
                param1 = -param5 + qg.field_l;
                break L4;
              }
            }
            L5: {
              if (0 >= param0) {
                break L5;
              } else {
                if (0 >= param1) {
                  break L5;
                } else {
                  var6_int = param4 - -(param5 * qg.field_g);
                  var7 = qg.field_g - param0;
                  if (param3 == 4) {
                    param5 = -param1;
                    L6: while (true) {
                      if (param5 >= 0) {
                        break L0;
                      } else {
                        param4 = -param0;
                        L7: while (true) {
                          if (0 <= param4) {
                            var6_int = var6_int + var7;
                            param5++;
                            continue L6;
                          } else {
                            L8: {
                              var8 = qg.field_i[var6_int];
                              if ((255 & var8 >> 8) <= param2) {
                                break L8;
                              } else {
                                if ((var8 & 65280) >> 8 >= (var8 & 16711680) >> 16) {
                                  L9: {
                                    var9 = ((var8 & 16711680) >> 15) + -60;
                                    if (var9 > 255) {
                                      var9 = 255;
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  }
                                  var10 = var8 & 65280;
                                  var10 = 65280 & -(var10 >> 5) + (var10 >> 1);
                                  var11 = 31 & var8 >> 3;
                                  qg.field_i[var6_int] = p.a(p.a(var9 << 16, var10), var11);
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            var6_int++;
                            param4++;
                            continue L7;
                          }
                        }
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var6, "ii.G(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    public ii() {
        ((ii) this).field_l = new w();
        ((ii) this).field_l.field_k = ((ii) this).field_l;
        ((ii) this).field_l.field_i = ((ii) this).field_l;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_i = 0;
        field_d = false;
        field_j = new int[][]{new int[2], new int[2], new int[2]};
        field_f = new int[4][];
    }
}
