/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class uta implements sia {
    private static String[] field_l;
    private static String[] field_f;
    il field_m;
    static String field_n;
    String field_t;
    private int field_k;
    iv field_a;
    jea field_p;
    sw field_o;
    static nh field_d;
    static String field_e;
    private jea field_i;
    private vna field_s;
    private int field_h;
    private boolean field_j;
    private int field_c;
    private String[] field_b;
    private gka field_g;
    private String field_r;
    private int field_q;

    private final void a(boolean param0, String param1) {
        gka var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                ((uta) this).field_h = -36;
                break L1;
              }
            }
            L2: {
              L3: {
                var3 = (gka) (Object) ((uta) this).field_s.f(-80);
                if (var3 == null) {
                  break L3;
                } else {
                  if (param1.equals((Object) (Object) var3.field_h)) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              ((uta) this).field_s.a((byte) 88, (vg) (Object) new gka(param1));
              break L2;
            }
            L4: {
              if (((uta) this).field_s.a((byte) -16) > 30) {
                vg discarded$2 = ((uta) this).field_s.c((byte) 22);
                break L4;
              } else {
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("uta.W(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    private final void a(int param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String[] var5 = null;
        String[] var6 = null;
        int var7 = 0;
        String var8 = null;
        vna var9 = null;
        gka var10 = null;
        int var11 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = -10 + ((uta) this).field_a.field_G - 15;
              var5 = rga.a(32287, param1, '\n');
              if (param0 == 24219) {
                break L1;
              } else {
                boolean discarded$2 = ((uta) this).a(-59);
                break L1;
              }
            }
            var6 = var5;
            var7 = 0;
            L2: while (true) {
              if (var7 >= var6.length) {
                break L0;
              } else {
                L3: {
                  var8 = var6[var7];
                  if (var4_int <= ((uta) this).field_m.b(var8)) {
                    var9 = this.a(var4_int, true, var8);
                    var10 = (gka) (Object) var9.f(param0 ^ -24277);
                    L4: while (true) {
                      if (var10 == null) {
                        break L3;
                      } else {
                        this.b(var10.field_h, param2, 230);
                        var10 = (gka) (Object) var9.e(param0 ^ 24289);
                        continue L4;
                      }
                    }
                  } else {
                    this.b(var8, param2, param0 + -23989);
                    break L3;
                  }
                }
                var7++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("uta.Q(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param2 + 41);
        }
    }

    private final vna a(int param0, boolean param1, String param2) {
        RuntimeException var4 = null;
        vna var4_ref = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        Object stackIn_20_0 = null;
        vna stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        vna stackOut_21_0 = null;
        Object stackOut_19_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var4_ref = new vna();
            L1: while (true) {
              if (param2 == null) {
                if (param1) {
                  stackOut_21_0 = (vna) var4_ref;
                  stackIn_22_0 = stackOut_21_0;
                  break L0;
                } else {
                  stackOut_19_0 = null;
                  stackIn_20_0 = stackOut_19_0;
                  return (vna) (Object) stackIn_20_0;
                }
              } else {
                L2: {
                  var5 = ((uta) this).field_m.b(param2);
                  var6 = param2;
                  if (var5 > param0) {
                    var7 = -1 + param2.length();
                    L3: while (true) {
                      L4: {
                        if (var7 <= 0) {
                          break L4;
                        } else {
                          L5: {
                            if (var5 > param0) {
                              break L5;
                            } else {
                              if (32 == param2.charAt(var7)) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          int incrementValue$2 = var7;
                          var7--;
                          var5 = var5 - ((uta) this).field_m.a(param2.charAt(incrementValue$2));
                          continue L3;
                        }
                      }
                      if (var7 == 0) {
                        var5 = ((uta) this).field_m.b(param2);
                        var7 = param2.length() + -1;
                        L6: while (true) {
                          if (var5 <= param0) {
                            var6 = param2.substring(0, var7);
                            param2 = param2.substring(var7 + 1);
                            break L2;
                          } else {
                            int incrementValue$3 = var7;
                            var7--;
                            var5 = var5 - ((uta) this).field_m.a(param2.charAt(incrementValue$3));
                            continue L6;
                          }
                        }
                      } else {
                        var9 = param2.substring(0, var7);
                        param2 = param2.substring(var7 + 1);
                        var4_ref.b((byte) -128, (vg) (Object) new gka(var9));
                        continue L1;
                      }
                    }
                  } else {
                    param2 = null;
                    break L2;
                  }
                }
                var4_ref.b((byte) -128, (vg) (Object) new gka(var6));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var4;
            stackOut_23_1 = new StringBuilder().append("uta.M(").append(param0).append(44).append(param1).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
        return stackIn_22_0;
    }

    abstract String[] a(boolean param0);

    public static void c(int param0) {
        field_f = null;
        field_d = null;
        field_e = null;
        field_n = null;
        field_l = null;
        if (param0 != 0) {
            field_n = null;
        }
    }

    private final jea a(int param0, byte param1, int param2) {
        jea var4 = new jea(0L, (jea) null);
        int var5 = 39 / ((-89 - param1) / 36);
        var4.field_w = sva.a(param2, param0, 4);
        return var4;
    }

    private final jea a(int param0, int param1) {
        int var4 = -128 / ((-18 - param0) / 61);
        jea var3 = new jea(0L, (jea) null);
        var3.field_w = eca.a(4, 2263074);
        return var3;
    }

    public final boolean a(int param0) {
        if (param0 != -2) {
            return true;
        }
        return ((uta) this).field_j;
    }

    public void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        jea stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        jea stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        jea stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        jea stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        jea stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        jea stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        L0: {
          var5 = TombRacer.field_G ? 1 : 0;
          if (param0 == 1) {
            break L0;
          } else {
            uta.c(24);
            break L0;
          }
        }
        L1: {
          if (((uta) this).field_i.field_t + ((uta) this).field_i.field_T > 0) {
            L2: {
              bea.c(((uta) this).field_i.field_q, ((uta) this).field_i.field_A, ((uta) this).field_a.field_qb, ((uta) this).field_i.field_t, 5592405, 230);
              bea.c(((uta) this).field_a.field_q + ((uta) this).field_a.field_G, ((uta) this).field_i.field_A, ((uta) this).field_a.field_qb, ((uta) this).field_i.field_t, 5592405, 230);
              bea.c(((uta) this).field_a.field_q, ((uta) this).field_i.field_A, ((uta) this).field_a.field_G, ((uta) this).field_a.field_T, 5592405, 230);
              bea.c(((uta) this).field_a.field_q, ((uta) this).field_a.field_A - -((uta) this).field_a.field_t, ((uta) this).field_a.field_G, -((uta) this).field_a.field_t + -((uta) this).field_a.field_A + ((uta) this).field_o.field_A, 5592405, 230);
              bea.c(((uta) this).field_a.field_q, ((uta) this).field_o.field_t + ((uta) this).field_o.field_A, ((uta) this).field_a.field_G, ((uta) this).field_i.field_t - ((uta) this).field_o.field_T - ((uta) this).field_o.field_t, 5592405, 230);
              bea.c(((uta) this).field_a.field_q, ((uta) this).field_a.field_A, ((uta) this).field_a.field_G, ((uta) this).field_a.field_t, 2236962, 240);
              bea.c(((uta) this).field_o.field_q, ((uta) this).field_o.field_A, ((uta) this).field_o.field_G, ((uta) this).field_o.field_t, 2236962, 240);
              var2 = ((uta) this).field_i.field_T + 256;
              if (var2 < 0) {
                var2 = 0;
                break L2;
              } else {
                break L2;
              }
            }
            bea.c(((uta) this).field_i.field_q, ((uta) this).field_i.field_t + ((uta) this).field_i.field_A, ((uta) this).field_i.field_G, -((uta) this).field_i.field_t + qf.field_i + -((uta) this).field_i.field_A, 0, var2 >> 1);
            var3 = ((uta) this).field_i.field_t + (((uta) this).field_i.field_T - -5);
            var4 = 0;
            L3: while (true) {
              if (6 <= var4) {
                L4: {
                  stackOut_10_0 = ((uta) this).field_i;
                  stackOut_10_1 = 100;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  if ((((uta) this).field_h & 8) != 0) {
                    stackOut_12_0 = (jea) (Object) stackIn_12_0;
                    stackOut_12_1 = stackIn_12_1;
                    stackOut_12_2 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    stackIn_13_2 = stackOut_12_2;
                    break L4;
                  } else {
                    stackOut_11_0 = (jea) (Object) stackIn_11_0;
                    stackOut_11_1 = stackIn_11_1;
                    stackOut_11_2 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    stackIn_13_2 = stackOut_11_2;
                    break L4;
                  }
                }
                ((jea) (Object) stackIn_13_0).b(stackIn_13_1, stackIn_13_2 != 0);
                break L1;
              } else {
                bea.c(0, var3, mma.field_a, 0, var4 << 5);
                var3--;
                var4++;
                continue L3;
              }
            }
          } else {
            break L1;
          }
        }
        L5: {
          if (((uta) this).field_b == null) {
            break L5;
          } else {
            if (((uta) this).field_j) {
              var2 = ((uta) this).field_i.field_t + ((uta) this).field_i.field_T;
              ((uta) this).field_p.field_T = var2;
              ((uta) this).field_p.b(74, false);
              var2 = var2 + (5 + ((uta) this).field_k);
              var3 = 0;
              L6: while (true) {
                if (((uta) this).field_b.length <= var3) {
                  break L5;
                } else {
                  ((uta) this).field_m.c(((uta) this).field_b[var3], ((uta) this).field_p.field_q + 10, var2, 13421772, -1);
                  var2 = var2 + ((uta) this).field_k;
                  var3++;
                  continue L6;
                }
              }
            } else {
              break L5;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == ns.field_g) {
                break L1;
              } else {
                ht.field_Fb = new int[param2];
                var3_int = 0;
                L2: while (true) {
                  if (var3_int >= param2) {
                    ooa.field_g = 32 * param2;
                    una.field_b = -1 + param2;
                    ns.field_g = param2;
                    break L1;
                  } else {
                    ht.field_Fb[var3_int] = (var3_int << 12) / param2;
                    var3_int++;
                    continue L2;
                  }
                }
              }
            }
            if (param0 == 0) {
              L3: {
                if (param1 == qda.field_i) {
                  break L3;
                } else {
                  L4: {
                    if (param1 != ns.field_g) {
                      sj.field_b = new int[param1];
                      var3_int = 0;
                      L5: while (true) {
                        if (param1 <= var3_int) {
                          break L4;
                        } else {
                          sj.field_b[var3_int] = (var3_int << 12) / param1;
                          var3_int++;
                          continue L5;
                        }
                      }
                    } else {
                      sj.field_b = ht.field_Fb;
                      break L4;
                    }
                  }
                  hba.field_b = -1 + param1;
                  qda.field_i = param1;
                  break L3;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "uta.L(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
    }

    private final jea a(byte param0, int param1) {
        jea var3 = new jea();
        if (param0 <= 80) {
            Object var4 = null;
            this.a(true, (String) null);
        }
        var3.field_w = sva.a(65793, 0, 4);
        return var3;
    }

    private final jea a(String param0, int param1, int param2) {
        jea var4 = null;
        RuntimeException var4_ref = null;
        Object stackIn_2_0 = null;
        jea stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        jea stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var4 = new jea(0L, (jea) null, param0);
            if (param1 == 16733525) {
              var4.field_H = ((uta) this).field_m;
              var4.field_ib = param2;
              var4.a(((uta) this).field_m.b(var4.field_r), ((uta) this).field_k, -23776, 0, 5);
              stackOut_3_0 = (jea) var4;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (jea) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4_ref;
            stackOut_5_1 = new StringBuilder().append("uta.J(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_4_0;
    }

    public boolean a(byte param0, char param1, int param2) {
        jea var5 = null;
        int var6 = 0;
        String var7 = null;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        vg stackIn_19_1 = null;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        vg stackOut_18_1 = null;
        Object stackOut_17_0 = null;
        vg stackOut_17_1 = null;
        L0: {
          var6 = TombRacer.field_G ? 1 : 0;
          if (param0 == -72) {
            break L0;
          } else {
            field_l = null;
            break L0;
          }
        }
        if (96 == param1) {
          this.d(2);
          return true;
        } else {
          if (((uta) this).field_j) {
            L1: {
              if (84 != param2) {
                if (param2 != 98) {
                  if (99 == param2) {
                    if (((uta) this).field_g == null) {
                      break L1;
                    } else {
                      if (((uta) this).field_s.field_e != ((uta) this).field_g.field_e) {
                        ((uta) this).field_g = (gka) (Object) ((uta) this).field_g.field_e;
                        ((uta) this).field_o.a((byte) 74, ((uta) this).field_g.field_h);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    if (param2 != 80) {
                      boolean discarded$1 = ((uta) this).field_o.a(param2, param0 + -19624, param1);
                      break L1;
                    } else {
                      ((uta) this).e(param0 + 21375);
                      break L1;
                    }
                  }
                } else {
                  L2: {
                    if (((uta) this).field_g == null) {
                      break L2;
                    } else {
                      if (((uta) this).field_g.field_a != ((uta) this).field_s.field_e) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  L3: {
                    stackOut_16_0 = this;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_17_0 = stackOut_16_0;
                    if (null != ((uta) this).field_g) {
                      stackOut_18_0 = this;
                      stackOut_18_1 = ((uta) this).field_g.field_a;
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      break L3;
                    } else {
                      stackOut_17_0 = this;
                      stackOut_17_1 = ((uta) this).field_s.f(-80);
                      stackIn_19_0 = stackOut_17_0;
                      stackIn_19_1 = stackOut_17_1;
                      break L3;
                    }
                  }
                  ((uta) this).field_g = (gka) (Object) stackIn_19_1;
                  if (((uta) this).field_g == null) {
                    break L1;
                  } else {
                    ((uta) this).field_o.a((byte) 12, ((uta) this).field_g.field_h);
                    break L1;
                  }
                }
              } else {
                var7 = ((uta) this).field_o.e((byte) -124);
                if (var7.length() > 0) {
                  L4: {
                    this.a(24219, ((uta) this).field_t + var7, 5635925);
                    var5 = (jea) (Object) ((uta) this).field_a.field_tb.field_J.b(3);
                    if (!((uta) this).a(var7, (byte) -112)) {
                      var5.field_ib = 16733525;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  ((uta) this).field_o.d((byte) -113);
                  this.a(true, var7);
                  ((uta) this).field_g = null;
                  break L1;
                } else {
                  return true;
                }
              }
            }
            return true;
          } else {
            return false;
          }
        }
    }

    final void a(int param0, String param1) {
        try {
            this.a(24219, param1, 13421772);
            int var3_int = 22 / ((param0 - 82) / 40);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "uta.T(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(byte param0, Object param1) {
        try {
            if (param0 > -15) {
                field_f = null;
            }
            ((uta) this).a(126, param1 != null ? param1.toString() : "null");
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "uta.R(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    abstract void e(int param0);

    abstract boolean a(String param0, byte param1);

    private final void d(int param0) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (((uta) this).field_j) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          ((uta) this).field_j = stackIn_3_1 != 0;
          if (!((uta) this).field_j) {
            if (null != ((uta) this).field_i) {
              ((uta) this).field_i.a(-127, (jea) null);
              break L1;
            } else {
              break L1;
            }
          } else {
            ((uta) this).field_q = 15;
            if (null == ((uta) this).field_i) {
              break L1;
            } else {
              ((uta) this).field_i.a(-110, (jea) (Object) ((uta) this).field_o);
              break L1;
            }
          }
        }
    }

    public final void a(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          L1: {
            var6 = TombRacer.field_G ? 1 : 0;
            if (!((uta) this).field_j) {
              break L1;
            } else {
              if (((uta) this).field_q > 0) {
                ((uta) this).field_q = ((uta) this).field_q - 1;
                ((uta) this).field_i.field_T = ((uta) this).field_q * (((uta) this).field_q * -200) / 225;
                break L0;
              } else {
                break L1;
              }
            }
          }
          if (((uta) this).field_j) {
            break L0;
          } else {
            if (((uta) this).field_i.field_T - -200 > 0) {
              ((uta) this).field_i.field_T = ((uta) this).field_i.field_T - 28;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L2: {
          L3: {
            if (!((uta) this).field_o.e((byte) -117).equals((Object) (Object) ((uta) this).field_r)) {
              break L3;
            } else {
              if (((uta) this).field_o.j(-1320) != ((uta) this).field_c) {
                break L3;
              } else {
                break L2;
              }
            }
          }
          L4: {
            ((uta) this).field_r = ((uta) this).field_o.e((byte) -121);
            ((uta) this).field_c = ((uta) this).field_o.j(-1320);
            ((uta) this).field_b = ((uta) this).a(false);
            if (((uta) this).field_b == null) {
              break L4;
            } else {
              if (((uta) this).field_b.length == 0) {
                ((uta) this).field_b = null;
                break L4;
              } else {
                break L4;
              }
            }
          }
          if (null == ((uta) this).field_b) {
            break L2;
          } else {
            var3 = 0;
            var4 = 0;
            L5: while (true) {
              if (var4 >= ((uta) this).field_b.length) {
                ((uta) this).field_p.field_G = 20 + var3;
                ((uta) this).field_p.field_t = ((uta) this).field_b.length * ((uta) this).field_k + 15;
                break L2;
              } else {
                var5 = ((uta) this).field_m.b(((uta) this).field_b[var4]);
                if (var3 < var5) {
                  var3 = var5;
                  var4++;
                  continue L5;
                } else {
                  var4++;
                  continue L5;
                }
              }
            }
          }
        }
        ((uta) this).field_h = ((uta) this).field_h + 1;
        ((uta) this).field_i.c(83, param1);
        ((uta) this).field_a.b(param0, 0, ((uta) this).field_k * 2 * pg.field_y, ((uta) this).field_k);
        ((uta) this).field_o.h((byte) 87);
    }

    final static bb a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = TombRacer.field_G ? 1 : 0;
        if (param2 != 0) {
            field_f = null;
        }
        bb var5 = (bb) (Object) mg.field_b.f(-80);
        while (var5 != null) {
            if (!(param1 != var5.field_n)) {
                return var5;
            }
            var5 = (bb) (Object) mg.field_b.e(126);
        }
        var5 = new bb();
        var5.field_j = param3;
        var5.field_i = 1;
        var5.field_n = param1;
        mg.field_b.b((byte) -48, (vg) (Object) var5);
        pc.a(false, param0, var5);
        return var5;
    }

    private final void b(String param0, int param1, int param2) {
        int var4_int = 0;
        jea var5 = null;
        int var6 = TombRacer.field_G ? 1 : 0;
        try {
            ((uta) this).field_a.field_tb.b(param2 ^ -155, this.a(param0, 16733525, param1));
            if (((uta) this).field_a.field_tb.field_J.a((byte) -16) > 256) {
                vg discarded$0 = ((uta) this).field_a.field_tb.field_J.c(-106);
            }
            var4_int = 5;
            var5 = (jea) (Object) ((uta) this).field_a.field_tb.field_J.f(-80);
            while (var5 != null) {
                var5.field_T = var4_int;
                var4_int = var4_int + ((uta) this).field_k;
                var5 = (jea) (Object) ((uta) this).field_a.field_tb.field_J.e(116);
            }
            if (param2 != 230) {
                ((uta) this).field_i = null;
            }
            ((uta) this).field_a.field_tb.field_t = var4_int;
            ((uta) this).field_a.field_tb.field_T = -var4_int + ((uta) this).field_a.field_t;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "uta.U(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    uta(il param0, fia param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        jea var4 = null;
        jea var5 = null;
        jea var6 = null;
        jea var7 = null;
        jea var8 = null;
        jea var9 = null;
        jea var10 = null;
        jea var11 = null;
        jea var12 = null;
        oj var13 = null;
        jea var14 = null;
        jea var15 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        ((uta) this).field_t = "# ";
        ((uta) this).field_s = new vna();
        ((uta) this).field_j = false;
        ((uta) this).field_h = 0;
        ((uta) this).field_b = null;
        ((uta) this).field_q = 0;
        try {
          L0: {
            ((uta) this).field_m = param0;
            ((uta) this).field_k = ((uta) this).field_m.field_w + ((uta) this).field_m.field_k;
            var3_int = 4 + ((uta) this).field_k;
            var4 = this.a((byte) 104, 65793);
            var5 = var4;
            var6 = var4;
            var7 = var4;
            var8 = this.a(7829367, (byte) 31, 2236962);
            var9 = this.a(65793, (byte) 21, 65793);
            var10 = this.a(3355443, (byte) -126, 65793);
            var11 = this.a(-91, 2263074);
            var12 = this.a(2236962, (byte) -125, 65793);
            ((uta) this).field_i = new jea(0L, var5);
            ((uta) this).field_i.a(mma.field_a, 200, -23776, -200, 0);
            var13 = new oj(0L, var8, var8, var9, var10);
            var14 = new jea();
            var14.field_J = new vna();
            ((uta) this).field_a = new iv(0L, var14, var6, var13);
            ((uta) this).field_a.field_tb.field_J = new vna();
            ((uta) this).field_a.a(((uta) this).field_i.field_G + -10, 0, (byte) 127, 5, 15, -var3_int + 185, 5);
            ((uta) this).field_i.b(-128, (jea) (Object) ((uta) this).field_a);
            var15 = new jea();
            var15.field_H = ((uta) this).field_m;
            var15.field_ib = 13421772;
            var15.field_S = 5;
            var15.field_V = 2;
            ((uta) this).field_o = new sw(0L, var7, var11, var15);
            ((uta) this).field_o.b(((uta) this).field_a.field_G, 127, ((uta) this).field_a.field_T + ((uta) this).field_a.field_t + 5, var3_int, ((uta) this).field_a.field_qb);
            ((uta) this).field_o.a(param1, (byte) -127);
            ((uta) this).field_i.b(-126, (jea) (Object) ((uta) this).field_o);
            ((uta) this).field_p = new jea(0L, var12);
            ((uta) this).field_p.field_qb = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var3;
            stackOut_3_1 = new StringBuilder().append("uta.<init>(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new String[2];
        field_l[1] = "Lava";
        field_l[0] = "Normal";
        field_n = "Death penalty <%0>";
        field_f = new String[9];
        field_f[4] = "Room: Windy";
        field_f[5] = "Room: Lights Out";
        field_f[7] = "Flip";
        field_f[2] = "Weapon Jammed";
        field_f[8] = "Tremors";
        field_f[6] = "Monsters";
        field_f[0] = "Slow Player";
        field_f[3] = "Difficulty Up";
        field_f[1] = "Invert Controls";
        field_e = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
    }
}
