/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh extends cn {
    static String field_p;
    static int field_x;
    private int field_A;
    static nk field_v;
    static long field_q;
    private int field_t;
    static int[] field_r;
    private wk[] field_y;
    private int field_o;
    static gh field_s;
    static String field_z;
    static ll field_w;
    static int[] field_u;

    public final void a(int param0, lh param1, byte param2, boolean param3, int param4) {
        int discarded$1 = 0;
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            L1: {
              if (!param1.field_C) {
                if (param1.d(param2 ^ -30)) {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                } else {
                  stackOut_3_0 = 0;
                  stackIn_6_0 = stackOut_3_0;
                  break L1;
                }
              } else {
                stackOut_1_0 = 1;
                stackIn_6_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var6_int = stackIn_6_0;
              if (!(param1 instanceof oa)) {
                break L2;
              } else {
                param3 = param3 & ((oa) ((Object) param1)).field_K;
                break L2;
              }
            }
            L3: {
              if (param3) {
                if (var6_int != 0) {
                  stackOut_12_0 = this.field_t;
                  stackIn_13_0 = stackOut_12_0;
                  break L3;
                } else {
                  stackOut_11_0 = this.field_A;
                  stackIn_13_0 = stackOut_11_0;
                  break L3;
                }
              } else {
                stackOut_9_0 = this.field_o;
                stackIn_13_0 = stackOut_9_0;
                break L3;
              }
            }
            L4: {
              var7 = stackIn_13_0;
              if (param3) {
                stackOut_15_0 = 16777215;
                stackIn_16_0 = stackOut_15_0;
                break L4;
              } else {
                stackOut_14_0 = 7105644;
                stackIn_16_0 = stackOut_14_0;
                break L4;
              }
            }
            L5: {
              var8 = stackIn_16_0;
              if (param2 == -30) {
                break L5;
              } else {
                this.field_t = -80;
                break L5;
              }
            }
            sl.a(this.field_y, param1.field_x, (param1.field_E - this.field_y[0].field_B >> 621424481) + (param1.field_z + param4), param0 + param1.field_o, var7, (byte) -119);
            discarded$1 = this.field_f.a(param1.field_y, param1.field_o + param0, -2 + param4 - -param1.field_z, param1.field_x, param1.field_E, var8, -1, 1, 1, this.field_f.field_G);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var6);
            stackOut_20_1 = new StringBuilder().append("kh.A(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
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
          throw ci.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(gh param0, String param1, int param2, int param3, int param4, int param5, int param6, int param7, boolean param8) {
        RuntimeException var9 = null;
        gh var10 = null;
        int var11 = 0;
        int var12 = 0;
        gh var13 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var12 = SteelSentinels.field_G;
        try {
          L0: {
            var13 = new gh((long)param3, field_s, param1);
            if (param8) {
              L1: {
                var13.a(0, param4, 20, -7 + param7, 2 + param5 + -param7);
                param0.a(var13, 122);
                var10 = new gh((long)param3, (gh) null);
                var10.a(0, 1, 12, 22, -20 + (param5 + -param7));
                var10.field_Pb = new wk(var10.field_zb, var10.field_Lb);
                var10.field_Pb.d();
                pb.h(0, 0, var10.field_zb, var10.field_Lb, 1995681);
                if (param2 > 0) {
                  if (param2 <= param6) {
                    pb.a(2, 2, param2 * (-4 + var10.field_zb) / param6, -4 + var10.field_Lb, 1995681);
                    if (param6 <= 100) {
                      break L1;
                    } else {
                      if (param6 >= 2000) {
                        break L1;
                      } else {
                        var11 = 100;
                        L2: while (true) {
                          if (param6 <= var11) {
                            break L1;
                          } else {
                            pb.f(var11 * (var10.field_zb - 4) / param6 + 2, 2, var10.field_Lb - 4, 4473924, 96);
                            var11 += 100;
                            continue L2;
                          }
                        }
                      }
                    }
                  } else {
                    pb.a(2, 2, -4 + var10.field_zb, var10.field_Lb - 4, 5157841);
                    break L1;
                  }
                } else {
                  pb.h(0, 0, var10.field_zb, var10.field_Lb, 10367841);
                  break L1;
                }
              }
              var13.a(var10, 121);
              sb.field_bb.b((byte) 121);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var9 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var9);
            stackOut_14_1 = new StringBuilder().append("kh.D(");
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
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          L4: {
            stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
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
          throw ci.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void b(int param0) {
        field_u = null;
        field_z = null;
        field_w = null;
        field_p = null;
        field_v = null;
        field_s = null;
        if (param0 != 100) {
            String var2 = (String) null;
            kh.a((gh) null, (String) null, 70, 81, -71, -99, -90, -116, false);
        }
        field_r = null;
    }

    public kh() {
        this(2188450, 2591221, 9543);
    }

    final static cc a(boolean param0, long param1) {
        if (param0) {
            return (cc) null;
        }
        return (cc) ((Object) me.field_b.a(param1, (byte) -72));
    }

    private kh(int param0, int param1, int param2) {
        this.field_y = un.field_m;
        this.field_t = param1;
        this.field_A = param0;
        this.field_f = gf.field_d;
        this.field_o = param2;
    }

    static {
        $cfr$clinit: {
            int var0 = 0;
            int var1 = 0;
            int var2 = 0;
            field_p = "Lobby";
            field_x = 100;
            field_r = new int[256];
            var1 = 0;
            L0: while (true) {
              if (256 <= var1) {
                field_u = new int[8192];
                break $cfr$clinit;
              } else {
                var0 = var1;
                var2 = 0;
                L1: while (true) {
                  if ((var2 ^ -1) <= -9) {
                    field_r[var1] = var0;
                    var1++;
                    continue L0;
                  } else {
                    if ((var0 & 1) != 1) {
                      var0 = var0 >>> 1;
                      var2++;
                      continue L1;
                    } else {
                      var0 = var0 >>> -471859999 ^ -306674912;
                      var2++;
                      continue L1;
                    }
                  }
                }
              }
            }
        }
    }
}
