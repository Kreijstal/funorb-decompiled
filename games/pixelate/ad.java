/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad extends uc {
    private tf[] field_s;
    private int field_q;
    static String field_r;
    static wm field_u;
    static tf field_w;
    private int field_v;
    private int field_t;

    final static boolean[] a(hh param0, int param1) {
        boolean[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        boolean[] var5 = null;
        boolean[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        boolean[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        boolean[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              var5 = new boolean[param0.field_f * param0.field_a];
              var2 = var5;
              if (param1 == 21922) {
                break L1;
              } else {
                field_u = (wm) null;
                break L1;
              }
            }
            var3 = 0;
            L2: while (true) {
              if (var5.length <= var3) {
                stackIn_10_0 = (boolean[]) (var5);
                break L0;
              } else {
                L3: {
                  stackIn_7_0 = (boolean[]) (var5);

                  stackIn_7_1 = var3;

                  if (-2 <= (param0.field_n[var3] ^ -1)) {
                    stackIn_8_0 = (boolean[]) ((Object) stackIn_7_0);
                    stackIn_8_1 = stackIn_7_1;
                    stackIn_8_2 = 0;
                    break L3;
                  } else {
                    stackIn_8_0 = (boolean[]) ((Object) stackIn_7_0);
                    stackIn_8_1 = stackIn_7_1;
                    stackIn_8_2 = 1;
                    break L3;
                  }
                }
                stackIn_8_0[stackIn_8_1] = stackIn_8_2 != 0;
                var3++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var2_ref);

            stackIn_13_1 = new StringBuilder().append("ad.E(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_10_0;
    }

    final static te a(int param0, ak param1, int[] param2, ak param3, ak param4) {
        int var5_int = 0;
        String[] var6 = null;
        char[] var7 = null;
        te[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        kp var11 = null;
        int var12 = 0;
        char[] var13 = null;
        char[] var14 = null;
        Object stackIn_7_0 = null;
        te stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var5 = null;
        Exception var10 = null;
        var12 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var5_int = param2.length;
            var6 = new String[var5_int];
            var14 = new char[var5_int];
            var13 = var14;
            var7 = var13;
            var8 = new te[var5_int];
            var9 = (char)param0;
            try {
              L1: {
                var10_int = 0;
                L2: while (true) {
                  if (var10_int >= var5_int) {
                    break L1;
                  } else {
                    var11 = jd.field_k.a(-21209, param2[var10_int]);
                    var6[var10_int] = var11.a((byte) -54);
                    var9 = (char)(var9 + 1);
                    var7[var10_int] = (char)var9;
                    var8[var10_int] = null;
                    var10_int++;
                    continue L2;
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var10 = (Exception) (Object) decompiledCaughtException;
              stackIn_7_0 = null;
              return (te) ((Object) stackIn_7_0);
            }
            stackIn_9_0 = new te(0L, param4, param1, param3, var8, param2, var6, var14);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L3: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("ad.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param4 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), stackIn_22_2 + ')');
        }
        return stackIn_9_0;
    }

    public static void c(int param0) {
        field_w = null;
        field_r = null;
        if (param0 > -24) {
            tf[] var2 = (tf[]) null;
            ad.a((tf[]) null, 23, -123, 94);
        }
        field_u = null;
    }

    final static void a(tf[] param0, int param1, int param2, int param3) {
        try {
            if (param2 > -57) {
                hh var5 = (hh) null;
                ad.a((hh) null, -30);
            }
            he.field_a = new sb(param0);
            gh.field_t = param3;
            we.field_n = param1;
            bb.h(-126);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "ad.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public ad() {
        this(2188450, 2591221, 9543);
    }

    public final void a(ng param0, byte param1, int param2, int param3, boolean param4) {
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          L0: {
            if (param1 == -124) {
              L1: {
                if (!param0.field_D) {
                  if (param0.b(true)) {
                    stackIn_8_0 = 1;
                    break L1;
                  } else {
                    stackIn_8_0 = 0;
                    break L1;
                  }
                } else {
                  stackIn_8_0 = 1;
                  break L1;
                }
              }
              L2: {
                var6_int = stackIn_8_0;
                if (param0 instanceof qm) {
                  param4 = param4 & ((qm) ((Object) param0)).field_H;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (param4) {
                  if (var6_int == 0) {
                    stackIn_16_0 = this.field_t;
                    break L3;
                  } else {
                    stackIn_16_0 = this.field_q;
                    break L3;
                  }
                } else {
                  stackIn_16_0 = this.field_v;
                  break L3;
                }
              }
              L4: {
                var7 = stackIn_16_0;
                td.a(param3 - -param0.field_z, param0.field_p + (param2 - -(param0.field_C - this.field_s[0].field_B >> 172295841)), param0.field_E, this.field_s, (byte) 121, var7);
                if (param4) {
                  stackIn_19_0 = 16777215;
                  break L4;
                } else {
                  stackIn_19_0 = 7105644;
                  break L4;
                }
              }
              var8 = stackIn_19_0;
              this.field_a.a(param0.field_q, param3 - -param0.field_z, param2 - -param0.field_p + -2, param0.field_E, param0.field_C, var8, -1, 1, 1, this.field_a.field_w);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var6);

            stackIn_23_1 = new StringBuilder().append("ad.A(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L5;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private ad(int param0, int param1, int param2) {
        this.field_v = param2;
        this.field_q = param1;
        this.field_t = param0;
        this.field_a = ba.field_d;
        this.field_s = fc.field_d;
    }

    static {
        field_u = new wm(15, 0, 1, 0);
    }
}
