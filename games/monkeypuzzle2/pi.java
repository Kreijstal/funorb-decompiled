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
        int var4 = 0;
        gk var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                var5 = (gk) null;
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
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("pi.C(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    private final void a(gk param0, int param1, int param2) {
        int[] array$0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        te var7 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((param2 ^ -1) != -2) {
                if (param2 != 2) {
                  if ((param2 ^ -1) == -4) {
                    var4_int = param0.a((byte) 114);
                    this.field_j = new int[var4_int][];
                    this.field_k = new int[var4_int];
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
                            this.field_k[var5] = var6;
                            array$0 = new int[var7.field_b];
                            this.field_j[var5] = array$0;
                            var8 = 0;
                            L4: while (true) {
                              if (var8 >= var7.field_b) {
                                break L3;
                              } else {
                                this.field_j[var5][var8] = param0.j(17277);
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
                  this.field_q = new int[var4_int];
                  var5 = 0;
                  L5: while (true) {
                    if (var4_int <= var5) {
                      break L1;
                    } else {
                      this.field_q[var5] = param0.j(17277);
                      var5++;
                      continue L5;
                    }
                  }
                }
              } else {
                this.field_n = ma.a(122, '<', param0.f(-1));
                break L1;
              }
            }
            L6: {
              if (param1 == -305) {
                break L6;
              } else {
                field_l = (Random) null;
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var4);

            stackIn_22_1 = new StringBuilder().append("pi.A(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean a(byte param0) {
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_76_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        ki var3 = null;
        int var4 = 0;
        float var5 = 0.0f;
        int var6 = 0;
        int var7 = 0;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              if (!ba.a(-1)) {
                if (kc.field_d != 0) {
                  stackIn_13_0 = 1;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    L3: {
                      L4: {
                        m.field_h = m.field_h + 1;
                        var1_int = 6;
                        if (0 != m.field_h % var1_int) {
                          break L4;
                        } else {
                          var2 = 0;
                          L5: while (true) {
                            if (var2 >= ii.field_E) {
                              break L4;
                            } else {
                              stackIn_20_0 = -1;

                              stackIn_20_1 = ii.field_U[var2] ^ -1;

                              L6: {
                                if (stackIn_20_0 < stackIn_20_1) {
                                  break L6;
                                } else {
                                  ii.field_U[var2] = ii.field_U[var2] + 1;
                                  if (3 > ii.field_U[var2]) {
                                    break L6;
                                  } else {
                                    ii.field_U[var2] = -2;
                                    break L6;
                                  }
                                }
                              }
                              var2++;
                              continue L5;
                            }
                          }
                        }
                      }
                      if (-298 <= (m.field_h ^ -1)) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                    if (326 <= m.field_h) {
                      break L2;
                    } else {
                      var1_int = 14;
                      break L2;
                    }
                  }
                  L7: {
                    if (-1 == (m.field_h % var1_int ^ -1)) {
                      L8: {
                        if (196 >= m.field_h) {
                          break L8;
                        } else {
                          if (-298 >= (m.field_h ^ -1)) {
                            break L8;
                          } else {
                            L9: {
                              if (i.field_i) {
                                mg.field_q = mg.field_q - 1;
                                break L9;
                              } else {
                                mg.field_q = mg.field_q + 1;
                                break L9;
                              }
                            }
                            L10: {
                              if (!i.field_i) {
                                break L10;
                              } else {
                                if (-5 != (mg.field_q ^ -1)) {
                                  break L10;
                                } else {
                                  i.field_i = false;
                                  break L7;
                                }
                              }
                            }
                            if (mg.field_q == 6) {
                              i.field_i = true;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      L11: {
                        mg.field_q = mg.field_q + 1;
                        if (-197 >= (m.field_h ^ -1)) {
                          break L11;
                        } else {
                          if (mg.field_q == 4) {
                            mg.field_q = 0;
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                      }
                      L12: {
                        if ((m.field_h ^ -1) >= -305) {
                          break L12;
                        } else {
                          if ((m.field_h ^ -1) > -331) {
                            mg.field_q = 7;
                            break L7;
                          } else {
                            break L12;
                          }
                        }
                      }
                      if (mg.field_q < we.field_f.length) {
                        break L7;
                      } else {
                        mg.field_q = we.field_f.length - 1 + -3;
                        break L7;
                      }
                    } else {
                      break L7;
                    }
                  }
                  L13: {
                    L14: {
                      L15: {
                        if (102 >= m.field_h) {
                          break L15;
                        } else {
                          var7 = 0;
                          var2 = var7;
                          var3 = (ki) ((Object) bd.field_b.a((byte) -117));
                          L16: while (true) {
                            if (var3 == null) {
                              break L15;
                            } else {
                              var4 = m.field_h - (102 + ck.field_g[var7]);
                              stackIn_56_0 = var4 ^ -1;

                              stackIn_56_1 = -1;

                              L17: {
                                if (stackIn_56_0 <= stackIn_56_1) {
                                  L18: {
                                    var5 = (float)var4 / 80.0f;
                                    if (var5 < 1.0f) {
                                      break L18;
                                    } else {
                                      var5 = 1.0f;
                                      break L18;
                                    }
                                  }
                                  L19: {
                                    if (var5 >= 0.9700000286102295f) {
                                      if ((ii.field_U[var7] ^ -1) != 0) {
                                        break L19;
                                      } else {
                                        ii.field_U[var7] = 0;
                                        cj.a((byte) 113, ke.field_h[5]);
                                        break L19;
                                      }
                                    } else {
                                      break L19;
                                    }
                                  }
                                  var3.field_B = rl.field_c[var7][0] + (-rl.field_c[var7][0] + da.field_b[var7][0]) * var5;
                                  var3.field_q = rl.field_c[var7][1] + (da.field_b[var7][1] - rl.field_c[var7][1]) * var5;
                                  var7++;
                                  break L17;
                                } else {
                                  var7++;
                                  break L17;
                                }
                              }
                              var3 = (ki) ((Object) bd.field_b.d((byte) 63));
                              continue L16;
                            }
                          }
                        }
                      }
                      if (param0 >= 120) {
                        break L13;
                      } else {
                        break L14;
                      }
                    }
                    field_p = (String) null;
                    break L13;
                  }
                  L20: {
                    if (m.field_h == 330) {
                      cj.a((byte) -71, ke.field_h[14]);
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  L21: {
                    if ((m.field_h ^ -1) != -375) {
                      break L21;
                    } else {
                      cj.a((byte) -99, ke.field_h[12]);
                      break L21;
                    }
                  }
                  L22: {
                    if (m.field_h <= 424) {
                      stackIn_76_0 = 0;
                      break L22;
                    } else {
                      stackIn_76_0 = 1;
                      break L22;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                L23: {
                  if (oa.field_H == 13) {
                    break L23;
                  } else {
                    if (oa.field_H == 83) {
                      break L23;
                    } else {
                      if (-85 == (oa.field_H ^ -1)) {
                        break L23;
                      } else {
                        continue L1;
                      }
                    }
                  }
                }
                stackIn_9_0 = 1;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "pi.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            return stackIn_76_0 != 0;
          }
        }
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
        if (!(this.field_q == null)) {
            for (var2 = 0; var2 < this.field_q.length; var2++) {
                this.field_q[var2] = bd.a(this.field_q[var2], 32768);
            }
        }
        if (param0 != 0) {
            field_l = (Random) null;
        }
    }

    final String b(byte param0) {
        int var3 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 != -54) {
            pi.f(62);
        }
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (null == this.field_n) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(this.field_n[0]);
        for (var3 = 1; this.field_n.length > var3; var3++) {
            discarded$1 = var2.append("...");
            discarded$2 = var5.append(this.field_n[var3]);
        }
        return var2.toString();
    }

    pi() {
    }

    final static String a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 122) {
                break L1;
              } else {
                var3 = (CharSequence) null;
                pi.a((byte) -13, (CharSequence) null);
                break L1;
              }
            }
            stackIn_3_0 = wg.a(false, param1, 17212);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("pi.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_l = new Random();
        field_m = "Mouse over an icon for details";
        field_i = "Continue";
    }
}
