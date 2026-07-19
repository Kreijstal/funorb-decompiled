/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    static String field_c;
    static int field_a;
    static mk field_b;
    static od field_d;

    final static void a(int param0, mp param1, int param2, int param3, int param4, mp param5) {
        RuntimeException runtimeException = null;
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
        try {
          L0: {
            L1: {
              qc.field_z = param3;
              al.field_z = param4;
              gl.field_l = param0;
              gl.field_i = param5;
              mq.field_v = param1;
              if (param2 == 1516482162) {
                break L1;
              } else {
                field_a = -77;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("vd.A(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param5 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final static void a(ed param0, int param1) {
        int var2_int = 0;
        try {
            br.field_U = param0.a((byte) -11) << -1983012731;
            if (param1 != 11591) {
                mp var3 = (mp) null;
                vd.a(-51, (mp) null, 54, -38, -24, (mp) null);
            }
            var2_int = param0.h(-11);
            af.field_E = (var2_int & 7) << 1516482162;
            br.field_U = br.field_U + (var2_int >> 879055395);
            af.field_E = af.field_E + (param0.a((byte) -11) << -2001037374);
            var2_int = param0.h(-11);
            af.field_E = af.field_E + (var2_int >> 83302502);
            bp.field_z = (var2_int & 63) << -341765201;
            bp.field_z = bp.field_z + (param0.h(-11) << -26703417);
            var2_int = param0.h(-11);
            kp.field_P = var2_int << -582943088 & 65536;
            bp.field_z = bp.field_z + (var2_int >> 978233921);
            kp.field_P = kp.field_P + param0.a((byte) -11);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "vd.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static er[] a(byte param0) {
        er[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = Vertigo2.field_L ? 1 : 0;
        var1 = new er[eo.field_m];
        if (param0 != 76) {
          return (er[]) null;
        } else {
          var2 = 0;
          L0: while (true) {
            if (eo.field_m <= var2) {
              la.a((byte) 60);
              return var1;
            } else {
              var3 = mh.field_c[var2] * vi.field_w[var2];
              var4 = se.field_y[var2];
              var5 = new int[var3];
              var6 = 0;
              L1: while (true) {
                if (var3 <= var6) {
                  var1[var2] = new er(ql.field_M, vj.field_c, ca.field_a[var2], pc.field_a[var2], mh.field_c[var2], vi.field_w[var2], var5);
                  var2++;
                  continue L0;
                } else {
                  var5[var6] = in.field_c[b.a((int) var4[var6], 255)];
                  var6++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        int var1 = 1 / ((param0 - -56) / 56);
        field_b = null;
    }

    static {
        field_c = "Loading fonts";
    }
}
