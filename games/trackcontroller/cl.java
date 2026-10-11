/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl {
    static int field_a;

    final static void a(kk param0, byte param1) {
        qj var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
          var2 = new qj(param0.a("final_frame.jpg", -1, ""), (java.awt.Component) ((Object) ki.field_f));
          var3 = var2.field_t;
          var4 = var2.field_q;
          nk.b(false);
          ej.field_d = new qj(var3, var4 * 3 / 4);
          ej.field_d.a();
          var2.h(0, 0);
          jd.field_g = new qj(var3, var4 - ej.field_d.field_q);
          jd.field_g.a();
          var2.h(0, -ej.field_d.field_q);
          jd.field_g.field_o = ej.field_d.field_q;
          if (param1 >= -64) {
            field_a = -73;
          }
          ch.m(26);
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "cl.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(qj[] param0, int param1, int param2, int param3, int param4, int param5) {
        int var21 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var22 = 0;
        int var20Lifetime1;
        int var20Lifetime2;
        int var20Lifetime3;
        int var20Lifetime4;
        var22 = TrackController.field_F ? 1 : 0;
        try {
          if (param0 == null) {
            return;
          }
          if (param4 > 0 &&
            param2 > 0) {
            if (param0[3] != null) {
              stackIn_11_0 = param0[3].field_s;
            } else {
              stackIn_11_0 = 0;
            }
            var6_int = stackIn_11_0;
            if (param0[5] != null) {
              stackIn_14_0 = param0[5].field_s;
            } else {
              stackIn_14_0 = 0;
            }
            var7 = stackIn_14_0;
            if (param0[1] != null) {
              stackIn_17_0 = param0[1].field_v;
            } else {
              stackIn_17_0 = 0;
            }
            var8 = stackIn_17_0;
            if (null != param0[7]) {
              stackIn_20_0 = param0[7].field_v;
            } else {
              stackIn_20_0 = 0;
            }
            var9 = stackIn_20_0;
            var10 = param1 + param4;
            var11 = param2 + param3;
            var12 = param1 + var6_int;
            var13 = -var7 + var10;
            var14 = var8 + param3;
            var15 = var11 - var9;
            var16 = var12;
            var17 = var13;
            if (var17 < var16) {
              var17 = param1 + param4 * var6_int / (var6_int + var7);
              var16 = param1 + param4 * var6_int / (var6_int + var7);
            }
            var18 = var14;
            var19 = var15;
            ll.a(bf.field_a);
            if (var19 < var18) {
              var19 = var8 * param2 / (var8 + var9) + param3;
              var18 = var8 * param2 / (var8 + var9) + param3;
            }
            if (param0[0] != null) {
              ll.b(param1, param3, var16, var18);
              param0[0].e(param1, param3);
              ll.b(bf.field_a);
            }
            if (param0[2] != null) {
              ll.b(var17, param3, var10, var18);
              param0[2].e(var13, param3);
              ll.b(bf.field_a);
            }
            if (param0[6] != null) {
              ll.b(param1, var19, var16, var11);
              param0[6].e(param1, var15);
              ll.b(bf.field_a);
            }
            if (param0[8] != null) {
              ll.b(var17, var19, var10, var11);
              param0[8].e(var13, var15);
              ll.b(bf.field_a);
            }
            if (param0[1] != null &&
              param0[1].field_s != 0) {
              ll.b(var16, param3, var17, var18);
              for (var20 = var12; var20 < var13; var20 = var20 + param0[1].field_s) {
                param0[1].e(var20, param3);
              }
              ll.b(bf.field_a);
            }
            if (null != param0[7] &&
              param0[7].field_s != 0) {
              ll.b(var16, var19, var17, var11);
              for (var20Lifetime1 = var12; var20Lifetime1 < var13; var20Lifetime1 = var20Lifetime1 + param0[7].field_s) {
                param0[7].e(var20Lifetime1, var15);
              }
              ll.b(bf.field_a);
            }
            if (null != param0[3] &&
              param0[3].field_v != 0) {
              ll.b(param1, var18, var16, var19);
              for (var20Lifetime2 = var14; var15 > var20Lifetime2; var20Lifetime2 = var20Lifetime2 + param0[3].field_v) {
                param0[3].e(param1, var20Lifetime2);
              }
              ll.b(bf.field_a);
            }
            if (null != param0[5] &&
              param0[5].field_v != 0) {
              ll.b(var17, var18, var10, var19);
              for (var20Lifetime3 = var14; var20Lifetime3 < var15; var20Lifetime3 = var20Lifetime3 + param0[5].field_v) {
                param0[5].e(var13, var20Lifetime3);
              }
              ll.b(bf.field_a);
            }
            if (param0[param5] != null &&
              0 != param0[4].field_s) {
              if (0 == param0[4].field_v) {
                return;
              }
              ll.b(var16, var18, var17, var19);
              for (var20Lifetime4 = var14; var15 > var20Lifetime4; var20Lifetime4 = var20Lifetime4 + param0[4].field_v) {
                for (var21 = var12; var21 < var13; var21 = var21 + param0[4].field_s) {
                  param0[4].e(var21, var20Lifetime4);
                }
              }
              ll.b(bf.field_a);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_77_0 = var6;
          stackIn_77_1 = new StringBuilder().append("cl.C(");
          if (param0 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_77_0), ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        qj[] var4 = null;
        jf var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = TrackController.field_F ? 1 : 0;
        try {
          if (param0 != 7) {
            var4 = (qj[]) null;
            cl.a((qj[]) null, -82, 53, -34, 34, -30);
          }
          var5 = (jf) (ei.field_m.b(param0 - 5));
          while (var5 != null) {
            rd.a(var5, param0 - 3, param1);
            var5 = (jf) (ei.field_m.a(10));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var2), "cl.A(" + param0 + ',' + param1 + ')');
        }
    }

    final static int a(int param0, int param1, int param2, byte[] param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        qj[] var7 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = TrackController.field_F ? 1 : 0;
        try {
          var4_int = -1;
          for (var5 = param2; param1 > var5; var5++) {
            var4_int = lj.field_e[(param3[var5] ^ var4_int) & 255] ^ var4_int >>> 8;
          }
          if (param0 != 1) {
            var7 = (qj[]) null;
            cl.a((qj[]) null, 92, 80, -112, -104, -128);
          }
          var4_int = ~var4_int;
          stackIn_7_0 = var4_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("cl.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
        field_a = 250;
    }
}
