/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc extends ii implements vg {
    private int[] field_N;
    private se field_K;
    private int field_O;
    static String field_P;
    private nk field_L;
    private ck[] field_T;
    static int[][] field_S;
    static int[] field_Q;
    static int[] field_M;
    static int[][] field_V;
    private String field_R;
    static int field_U;

    final void a(int param0, int param1, String param2) {
        int var4_int = this.field_O;
        if (param1 != 6824) {
            return;
        }
        try {
            this.a(var4_int + 1, 0);
            this.field_T[var4_int] = this.a(param2, (pg) (this), (byte) -82);
            this.field_N[var4_int] = param0;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "kc.J(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2 ^ 0, param3);
        int discarded$0 = this.field_K.a(this.field_R, 14 + param1 + this.field_q, this.field_v + (param3 - -10), this.field_x + -28, this.field_s, 16777215, -1, param2, 0, this.field_K.field_H);
    }

    kc(nk param0, se param1, String param2) {
        super(0, 0, 288, 0, (ca) null);
        int var4_int = 0;
        this.field_O = 0;
        try {
            this.field_K = param1;
            this.field_R = param2;
            this.field_L = param0;
            var4_int = null != this.field_R ? this.field_K.a(this.field_R, 260, this.field_K.field_H) : 0;
            this.b(0, 288, 0, 0, var4_int + 22);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "kc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(ck param0, byte param1, int param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var8 = DungeonAssault.field_K;
        try {
          L0: {
            if (param1 == 98) {
              var6_int = 0;
              L1: while (true) {
                L2: {
                  if (this.field_O <= var6_int) {
                    break L2;
                  } else {
                    if (this.field_T[var6_int] == param0) {
                      var7 = this.field_N[var6_int];
                      if (0 != (var7 ^ -1)) {
                        sn.a(73, this.field_N[var6_int]);
                        break L2;
                      } else {
                        this.field_L.j((byte) 85);
                        break L2;
                      }
                    } else {
                      var6_int++;
                      continue L1;
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var6);
            stackOut_12_1 = new StringBuilder().append("kc.FA(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_M = null;
        field_V = (int[][]) null;
        field_S = (int[][]) null;
        field_P = null;
        field_Q = null;
        if (param0 != 0) {
            field_Q = (int[]) null;
        }
    }

    final static ki[] a(qg param0, int param1) {
        ki[] discarded$1 = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        ki[] var4 = null;
        int var5 = 0;
        ki var6 = null;
        int var7 = 0;
        qg var8 = null;
        pn var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        ki[] stackIn_3_0 = null;
        ki[] stackIn_9_0 = null;
        ki[] stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ki[] stackOut_15_0 = null;
        ki[] stackOut_8_0 = null;
        ki[] stackOut_2_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var7 = DungeonAssault.field_K;
        try {
          L0: {
            if (param0.a(param1 + 61)) {
              var9 = param0.a(false);
              L1: while (true) {
                if (var9.field_c != 0) {
                  if (var9.field_c != 2) {
                    var11 = (int[]) (var9.field_f);
                    var10 = var11;
                    var3 = var10;
                    var4 = new ki[var11.length >> -1385974494];
                    var5 = 0;
                    L2: while (true) {
                      if (var5 >= var4.length) {
                        L3: {
                          if (param1 == 10) {
                            break L3;
                          } else {
                            var8 = (qg) null;
                            discarded$1 = kc.a((qg) null, 35);
                            break L3;
                          }
                        }
                        stackOut_15_0 = (ki[]) (var4);
                        stackIn_16_0 = stackOut_15_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        var6 = new ki();
                        var4[var5] = var6;
                        var6.field_g = var3[var5 << -1108092254];
                        var6.field_d = var3[(var5 << 2082260066) + 1];
                        var6.field_b = var3[2 + (var5 << 118331554)];
                        var6.field_a = var3[3 + (var5 << 1768350626)];
                        var5++;
                        continue L2;
                      }
                    }
                  } else {
                    stackOut_8_0 = new ki[]{};
                    stackIn_9_0 = stackOut_8_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  pj.a(0, 10L);
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = new ki[]{};
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var2);
            stackOut_17_1 = new StringBuilder().append("kc.A(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_16_0;
          }
        }
    }

    private final void a(int param0, int param1) {
        int var5 = 0;
        int var6 = DungeonAssault.field_K;
        if (param0 <= this.field_O) {
            return;
        }
        ck[] var7 = new ck[param0];
        ck[] var3 = var7;
        int[] var4 = new int[param0];
        for (var5 = param1; this.field_O > var5; var5++) {
            var7[var5] = this.field_T[var5];
            var4[var5] = this.field_N[var5];
        }
        this.field_O = param0;
        this.field_N = var4;
        this.field_T = var3;
    }

    final static ab a(String param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        ab var5 = null;
        ab stackIn_4_0 = null;
        ab stackIn_8_0 = null;
        ab stackIn_11_0 = null;
        ab stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ab stackOut_7_0 = null;
        ab stackOut_12_0 = null;
        ab stackOut_10_0 = null;
        ab stackOut_3_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param0.length() == 0) {
                  break L1;
                } else {
                  var2_int = param0.indexOf('@');
                  if (var2_int == -1) {
                    stackOut_7_0 = ri.field_e;
                    stackIn_8_0 = stackOut_7_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var3 = param0.substring(0, var2_int);
                    var4 = param0.substring(var2_int + 1);
                    var5 = mo.a(var3, param1);
                    if (var5 == null) {
                      stackOut_12_0 = ed.a(-97, var4);
                      stackIn_13_0 = stackOut_12_0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      stackOut_10_0 = (ab) (var5);
                      stackIn_11_0 = stackOut_10_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
              }
            }
            stackOut_3_0 = to.field_e;
            stackIn_4_0 = stackOut_3_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var2);
            stackOut_14_1 = new StringBuilder().append("kc.G(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_13_0;
            }
          }
        }
    }

    final ck a(String param0, pg param1, byte param2) {
        ck var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        ck stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        ck stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var4 = new ck(param0, param1);
              if (param2 <= -73) {
                break L1;
              } else {
                this.a(-80, 42, 35, 65);
                break L1;
              }
            }
            var4.field_o = (ca) ((Object) new na());
            var5 = this.field_s + -2;
            this.b(0, this.field_x, 0, 0, this.field_s - -34);
            var4.b(0, -14 + this.field_x, var5, 7, 30);
            this.b((byte) -126, var4);
            stackOut_2_0 = (ck) (var4);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4_ref);
            stackOut_4_1 = new StringBuilder().append("kc.C(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    static {
        $cfr$clinit: {
            int var0 = 0;
            int var1 = 0;
            int var2 = 0;
            int var3 = 0;
            int var4 = 0;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            field_P = "If you attempt to raid this dragon you will awaken it.<br><br>Do you wish to proceed?";
            field_S = new int[9][];
            field_V = new int[9][];
            var0 = 0;
            L0: while (true) {
              if (-9 > (var0 ^ -1)) {
                field_M = new int[32];
                var0 = 0;
                L1: while (true) {
                  if (var0 >= 32) {
                    break $cfr$clinit;
                  } else {
                    var1 = 112 + var0 * 2;
                    field_M[var0] = mp.a(var1 * 65793, -2147483648);
                    var0++;
                    continue L1;
                  }
                }
              } else {
                field_S[var0] = new int[32];
                var1 = var0 * 8 + 106;
                var2 = 8 * var0 + 192;
                var3 = 80 - -(6 * var0);
                var4 = 6 * var0 + 144;
                var5 = var0 * 10;
                var6 = var0 * 10 - -8;
                var7 = 0;
                L2: while (true) {
                  if (32 <= var7) {
                    var4 = 4 * var0 + 223;
                    var2 = 223 - -(var0 * 4);
                    var1 = 128 - -(var0 * 8);
                    var6 = var0 * 4 + 223;
                    field_V[var0] = new int[32];
                    var3 = 128 - -(8 * var0);
                    var5 = 96 - -(6 * var0);
                    var7 = 0;
                    L3: while (true) {
                      if ((var7 ^ -1) <= -33) {
                        var0++;
                        continue L0;
                      } else {
                        var8 = var7 * (var2 + -var1) / 32 + var1;
                        var9 = (var4 - var3) * var7 / 32 + var3;
                        var10 = var5 - -((var6 + -var5) * var7 / 32);
                        field_V[var0][var7] = mp.a(mp.a(mp.a(var8, 77168640) << -496700080, var9 << 110803880), var10);
                        var7++;
                        continue L3;
                      }
                    }
                  } else {
                    var8 = (var2 - var1) * var7 / 32 + var1;
                    var9 = var3 + var7 * (var4 + -var3) / 32;
                    var10 = (-var5 + var6) * var7 / 32 + var5;
                    field_S[var0][var7] = mp.a(mp.a(var9 << -1560959032, mp.a(-445743104, var8) << 86569456), var10);
                    var7++;
                    continue L2;
                  }
                }
              }
            }
        }
    }
}
