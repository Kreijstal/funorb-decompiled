/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dm {
    static hg field_c;
    static String field_a;
    static nl field_b;

    abstract ug b(byte param0);

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    final static void a(boolean param0) {
        if (param0) {
            return;
        }
        if (lf.field_S > 10) {
            an.a(-10 + lf.field_S, (byte) 120);
        } else {
            an.a(0, (byte) 96);
        }
    }

    public static void a(byte param0) {
        int var1 = 100 / ((param0 - 19) / 62);
        field_c = null;
        field_a = null;
        field_b = null;
    }

    final static c a(int param0, um param1, String param2, um param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        c stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = param1.a(param4, param0 ^ param0);
            var6 = param1.a(param2, param0 + 7, var5_int);
            stackIn_1_0 = ig.a(var6, param3, -122, var5_int, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var5);

            stackIn_4_1 = new StringBuilder().append("dm.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param4 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_5_0), stackIn_14_2 + ')');
        }
        return stackIn_1_0;
    }

    abstract void a(p param0, byte param1);

    final static void a(lh param0, um param1, int param2) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        j var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        Throwable var10 = null;
        Throwable var11 = null;
        lh var12 = null;
        int[] var16 = null;
        var9 = Chess.field_G;
        try {
          L0: {
            var3_int = se.field_V;
            rh.field_c = new ci(0L, (ci) null);
            if (param1 == null) {
              var10 = (Throwable) null;
              fg.a((Throwable) null, (byte) -77, "QC1");
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param1.field_f = 0;
              param1.field_k = false;
              ak.field_u = new kj(var3_int, param1, param1);
              oa.field_b = new qc(var3_int, param1, param1, new th());
              var4 = p.a(param2 + -1529624);
              if (var4 != null) {
                dh.a(121, var4);
                var12 = (lh) null;
                vj.field_g = aj.a(1513239, 65793, 2245737, 65793, 0, 5138823, (lh) null, 4020342, 65793, (byte) 116, param2, 8947848, 1127256);
                wk.field_c = aj.a(0, 0, 0, 0, 16764006, 0, param0, 0, 0, (byte) -95, 0, 0, 0);
                va.field_d = aj.a(0, 0, 0, 0, 16777215, 0, param0, 0, 0, (byte) -28, 0, 0, 0);
                var5 = wb.field_h;
                var6 = wb.field_c;
                var16 = wb.field_d;
                mc.field_b = new km(10, 14);
                mc.field_b.e();
                var8 = 2;
                L1: while (true) {
                  if (var8 >= 7) {
                    wb.a(var16, var5, var6);
                    ng.field_c = vc.a((byte) 88, vj.field_g, va.field_d, wk.field_c, var4);
                    rh.field_c.field_I = new jc();
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    wb.f(var8, var8 - -1, 14 + -(var8 << -1438167807), 16777215);
                    var8++;
                    continue L1;
                  }
                }
              } else {
                var11 = (Throwable) null;
                fg.a((Throwable) null, (byte) -77, "QC2");
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("dm.H(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    static {
        field_c = new hg(15, 0, 1, 0);
        field_a = "Fastest";
    }
}
