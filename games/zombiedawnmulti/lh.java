/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh {
    private gg[] field_f;
    private int field_k;
    String field_j;
    static sk field_g;
    static int field_l;
    private int field_h;
    float field_d;
    private int field_c;
    static int[] field_b;
    static String field_e;
    static ri field_m;
    static float field_i;
    static String field_a;

    final boolean a(int param0) {
        boolean stackIn_3_0 = false;
        int stackIn_20_0 = 0;
        boolean stackOut_2_0;
        int var3;
        gg var4;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        L0: while (true) {
          L1: {
            L2: {
              if (this.field_k >= this.field_c) {
                break L2;
              } else {
                var4 = this.field_f[this.field_k];
                stackOut_2_0 = var4.field_d.a((byte) -123);
                stackIn_20_0 = stackOut_2_0 ? 1 : 0;
                stackIn_3_0 = stackOut_2_0;
                if (var3 != 0) {
                  break L1;
                } else {
                  if (!stackIn_3_0) {
                    this.a(0, (byte) 30, var4);
                    return false;
                  } else {
                    L3: {
                      if ((var4.field_g ^ -1) > -1) {
                        break L3;
                      } else {
                        if (!var4.field_d.a(-128, var4.field_g)) {
                          this.a(var4.field_d.a(var4.field_g, (byte) 104), (byte) 30, var4);
                          return false;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L4: {
                      if (var4.field_a == null) {
                        break L4;
                      } else {
                        if (var4.field_d.a(false, var4.field_a)) {
                          break L4;
                        } else {
                          this.a(var4.field_d.a(0, var4.field_a), (byte) 30, var4);
                          return false;
                        }
                      }
                    }
                    L5: {
                      if ((var4.field_g ^ -1) <= -1) {
                        break L5;
                      } else {
                        if (var4.field_a != null) {
                          break L5;
                        } else {
                          if (var4.field_f == null) {
                            break L5;
                          } else {
                            if (var4.field_d.a(0)) {
                              break L5;
                            } else {
                              this.a(var4.field_d.b(0), (byte) 30, var4);
                              return false;
                            }
                          }
                        }
                      }
                    }
                    this.field_k = this.field_k + 1;
                    if (var3 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            stackIn_20_0 = param0;
            break L1;
          }
          if (stackIn_20_0 > -90) {
            this.field_j = (String) null;
            return true;
          } else {
            return true;
          }
        }
    }

    public static void a(byte param0) {
        field_m = null;
        field_b = null;
        field_a = null;
        if (param0 != -50) {
          field_b = (int[]) null;
          field_e = null;
          field_g = null;
          return;
        } else {
          field_e = null;
          field_g = null;
          return;
        }
    }

    final static void a(int param0, ul param1) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        md var6 = null;
        int[] var7 = null;
        int var8 = 0;
        ga var9 = null;
        ga var10 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var9 = new ga(param1.a("logo.fo3d", "", false));
                        var10 = var9;
                        var3 = var10.g(31365);
                        var10.k(-1136);
                        qh.field_f = bo.a(30816, var10);
                        lk.field_G = new int[var3][];
                        vn.field_c = new md[var3];
                        var4 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var4 >= var3) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        vn.field_c[var4] = s.a(var9, (byte) -111);
                        var4++;
                        if (var8 != 0) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var8 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var10.l(-3093);
                        var4 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var5 = 60 / ((62 - param0) / 39);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var4 >= var3) {
                            statePc = 18;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var6 = vn.field_c[var4];
                        var6.a(6, 1, 6, 6, 2122);
                        var6.a((byte) -102);
                        var7 = new int[]{var6.field_C - -var6.field_D >> -1596068575, var6.field_G + var6.field_l >> -349764991, var6.field_j + var6.field_r >> -726377183};
                        lk.field_G[var4] = var7;
                        var6.a(-var7[2], 3, -var7[0], -var7[1]);
                        var4++;
                        if (var8 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        return;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var8 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        return;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_16_0 = (RuntimeException) (var2);
                    stackIn_15_0 = stackIn_16_0;
                    stackIn_16_1 = new StringBuilder().append("lh.E(").append(param0).append(',');
                    stackIn_15_1 = stackIn_16_1;
                    if (param1 == null) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    stackIn_17_0 = (RuntimeException) ((Object) stackIn_15_0);
                    stackIn_17_1 = (StringBuilder) ((Object) stackIn_15_1);
                    stackIn_17_2 = "{...}";
                    statePc = 17;
                    continue stateLoop;
                }
                case 16: {
                    stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                    stackIn_17_2 = "null";
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    throw fa.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
                }
                case 18: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(boolean param0) {
        wn.field_r = bl.a((byte) 41);
        vd.field_c = 0;
        if (!param0) {
            lh.a((byte) -46, -87);
        }
    }

    final static String a(byte param0, int param1) {
        if (param0 != -12) {
            return (String) null;
        }
        return gh.field_f[param1];
    }

    private final void a(int param0, byte param1, gg param2) {
        float var4_float = 0.0f;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              var4_float = (float)(this.field_k + 1) + (float)param0 / 100.0f;
              if (-1 == (param0 ^ -1)) {
                this.field_j = param2.field_h;
                break L1;
              } else {
                this.field_j = param2.field_f + " - " + param0 + "%";
                if (!ZombieDawnMulti.field_E) {
                  break L1;
                } else {
                  this.field_j = param2.field_h;
                  break L1;
                }
              }
            }
            L2: {
              if (param1 == 30) {
                break L2;
              } else {
                field_m = (ri) null;
                break L2;
              }
            }
            this.field_d = (float)this.field_h * var4_float / (float)(1 + this.field_c);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("lh.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    private lh() throws Throwable {
        throw new Error();
    }

    static {
        int var2 = 0;
        field_e = "The account name you use to access RuneScape and other Jagex.com games";
        field_b = new int[50];
        double var0 = 6.283185307179586 / (double)field_b.length;
        for (var2 = 0; field_b.length > var2; var2++) {
            field_b[var2] = (int)(48.0 * Math.sin(var0 * (double)var2));
        }
        field_a = "Recharge your powerups even faster than with Nimble Fingers! Equip both for the maximum recharge rate.";
    }
}
