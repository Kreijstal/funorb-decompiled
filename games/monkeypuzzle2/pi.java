/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pi extends bf {
    private int[] field_k;
    int[] field_q;
    private int[][] field_j;
    static String field_p;
    private String[] field_n;
    static Random field_l;
    static int field_o;
    static String field_i;
    static String field_m;

    final void a(gk param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        Object var5 = null;
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
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                var5 = null;
                this.a((gk) null, -61, 68);
                break L1;
              }
            }
            L2: while (true) {
              var3_int = param0.a((byte) 114);
              if (0 != var3_int) {
                this.a(param0, -305, var3_int);
                continue L2;
              } else {
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("pi.C(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
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
          throw la.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ')');
        }
    }

    private final void a(gk param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        te var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 != 1) {
                if (param2 != 2) {
                  if (param2 == 3) {
                    var4_int = param0.a((byte) 114);
                    ((pi) this).field_j = new int[var4_int][];
                    ((pi) this).field_k = new int[var4_int];
                    var5 = 0;
                    L2: while (true) {
                      if (var5 >= var4_int) {
                        break L1;
                      } else {
                        L3: {
                          var6 = param0.j(param1 + 17582);
                          var7 = ab.a((byte) -65, var6);
                          if (var7 == null) {
                            break L3;
                          } else {
                            ((pi) this).field_k[var5] = var6;
                            ((pi) this).field_j[var5] = new int[var7.field_b];
                            var8 = 0;
                            L4: while (true) {
                              if (var8 >= var7.field_b) {
                                break L3;
                              } else {
                                ((pi) this).field_j[var5][var8] = param0.j(17277);
                                var8++;
                                continue L4;
                              }
                            }
                          }
                        }
                        var5++;
                        continue L2;
                      }
                    }
                  } else {
                    if (param2 != 4) {
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  var4_int = param0.a((byte) 114);
                  ((pi) this).field_q = new int[var4_int];
                  var5 = 0;
                  L5: while (true) {
                    if (var4_int <= var5) {
                      break L1;
                    } else {
                      ((pi) this).field_q[var5] = param0.j(17277);
                      var5++;
                      continue L5;
                    }
                  }
                }
              } else {
                ((pi) this).field_n = ma.a(122, '<', param0.f(-1));
                break L1;
              }
            }
            L6: {
              if (param1 == -305) {
                break L6;
              } else {
                field_l = null;
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var4;
            stackOut_20_1 = new StringBuilder().append("pi.A(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw la.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean a(byte param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        ki var3 = null;
        int var4 = 0;
        float var5 = 0.0f;
        int var6 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_68_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_6_0 = 0;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              if (!ba.a(-1)) {
                if (kc.field_d != 0) {
                  stackOut_10_0 = 1;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0 != 0;
                } else {
                  L2: {
                    m.field_h = m.field_h + 1;
                    var1_int = 6;
                    if (0 != m.field_h % var1_int) {
                      break L2;
                    } else {
                      var2 = 0;
                      L3: while (true) {
                        if (~var2 <= ~ii.field_E) {
                          break L2;
                        } else {
                          L4: {
                            if (ii.field_U[var2] < 0) {
                              break L4;
                            } else {
                              ii.field_U[var2] = ii.field_U[var2] + 1;
                              if (3 > ii.field_U[var2]) {
                                break L4;
                              } else {
                                ii.field_U[var2] = -2;
                                break L4;
                              }
                            }
                          }
                          var2++;
                          continue L3;
                        }
                      }
                    }
                  }
                  L5: {
                    if (m.field_h <= 297) {
                      break L5;
                    } else {
                      if (326 <= m.field_h) {
                        break L5;
                      } else {
                        var1_int = 14;
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (m.field_h % var1_int == 0) {
                      L7: {
                        if (196 >= m.field_h) {
                          break L7;
                        } else {
                          if (m.field_h >= 297) {
                            break L7;
                          } else {
                            L8: {
                              if (i.field_i) {
                                mg.field_q = mg.field_q - 1;
                                break L8;
                              } else {
                                mg.field_q = mg.field_q + 1;
                                break L8;
                              }
                            }
                            L9: {
                              if (!i.field_i) {
                                break L9;
                              } else {
                                if (mg.field_q != 4) {
                                  break L9;
                                } else {
                                  i.field_i = false;
                                  break L6;
                                }
                              }
                            }
                            if (mg.field_q == 6) {
                              i.field_i = true;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      L10: {
                        mg.field_q = mg.field_q + 1;
                        if (m.field_h >= 196) {
                          break L10;
                        } else {
                          if (mg.field_q == 4) {
                            mg.field_q = 0;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                      }
                      L11: {
                        if (m.field_h <= 304) {
                          break L11;
                        } else {
                          if (m.field_h < 330) {
                            mg.field_q = 7;
                            break L6;
                          } else {
                            break L11;
                          }
                        }
                      }
                      if (~mg.field_q > ~we.field_f.length) {
                        break L6;
                      } else {
                        mg.field_q = we.field_f.length - 4;
                        break L6;
                      }
                    } else {
                      break L6;
                    }
                  }
                  L12: {
                    if (102 >= m.field_h) {
                      break L12;
                    } else {
                      var7 = 0;
                      var2 = var7;
                      var3 = (ki) (Object) bd.field_b.a((byte) -117);
                      L13: while (true) {
                        if (var3 == null) {
                          break L12;
                        } else {
                          L14: {
                            var4 = m.field_h - (102 + ck.field_g[var7]);
                            if (var4 >= 0) {
                              L15: {
                                var5 = (float)var4 / 80.0f;
                                if (var5 < 1.0f) {
                                  break L15;
                                } else {
                                  var5 = 1.0f;
                                  break L15;
                                }
                              }
                              L16: {
                                if (var5 >= 0.9700000286102295f) {
                                  if (ii.field_U[var7] != -1) {
                                    break L16;
                                  } else {
                                    ii.field_U[var7] = 0;
                                    cj.a((byte) 113, ke.field_h[5]);
                                    break L16;
                                  }
                                } else {
                                  break L16;
                                }
                              }
                              var3.field_B = rl.field_c[var7][0] + (-rl.field_c[var7][0] + da.field_b[var7][0]) * var5;
                              var3.field_q = rl.field_c[var7][1] + (da.field_b[var7][1] - rl.field_c[var7][1]) * var5;
                              var7++;
                              break L14;
                            } else {
                              var7++;
                              break L14;
                            }
                          }
                          var3 = (ki) (Object) bd.field_b.d((byte) 63);
                          continue L13;
                        }
                      }
                    }
                  }
                  L17: {
                    if (param0 >= 120) {
                      break L17;
                    } else {
                      field_p = null;
                      break L17;
                    }
                  }
                  L18: {
                    if (m.field_h == 330) {
                      cj.a((byte) -71, ke.field_h[14]);
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    if (m.field_h != 374) {
                      break L19;
                    } else {
                      cj.a((byte) -99, ke.field_h[12]);
                      break L19;
                    }
                  }
                  L20: {
                    if (m.field_h <= 424) {
                      stackOut_67_0 = 0;
                      stackIn_68_0 = stackOut_67_0;
                      break L20;
                    } else {
                      stackOut_66_0 = 1;
                      stackIn_68_0 = stackOut_66_0;
                      break L20;
                    }
                  }
                  break L0;
                }
              } else {
                L21: {
                  if (oa.field_H == 13) {
                    break L21;
                  } else {
                    if (oa.field_H == 83) {
                      break L21;
                    } else {
                      if (oa.field_H == 84) {
                        break L21;
                      } else {
                        continue L1;
                      }
                    }
                  }
                }
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var1, "pi.E(" + param0 + ')');
        }
        return stackIn_68_0 != 0;
    }

    public static void f(int param0) {
        field_p = null;
        field_l = null;
        field_i = null;
        if (param0 != -13739) {
            return;
        }
        field_m = null;
    }

    final void e(int param0) {
        int var2 = 0;
        int var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (!(((pi) this).field_q == null)) {
            for (var2 = 0; var2 < ((pi) this).field_q.length; var2++) {
                ((pi) this).field_q[var2] = bd.a(((pi) this).field_q[var2], 32768);
            }
        }
        if (param0 != 0) {
            field_l = null;
        }
    }

    final String b(byte param0) {
        int var3 = 0;
        int var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 != -54) {
            pi.f(62);
        }
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (null == ((pi) this).field_n) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(((pi) this).field_n[0]);
        for (var3 = 1; ((pi) this).field_n.length > var3; var3++) {
            StringBuilder discarded$1 = var2.append("...");
            StringBuilder discarded$2 = var5.append(((pi) this).field_n[var3]);
        }
        return var2.toString();
    }

    pi() {
    }

    final static String a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 122) {
                break L1;
              } else {
                var3 = null;
                String discarded$2 = pi.a((byte) -13, (CharSequence) null);
                break L1;
              }
            }
            stackOut_2_0 = wg.a(false, param1, 17212);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("pi.F(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw la.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new Random();
        field_m = "Mouse over an icon for details";
        field_i = "Continue";
    }
}
