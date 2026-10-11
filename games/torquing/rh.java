/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh {
    static bp field_c;
    static String field_a;
    static int field_d;
    static rc field_b;

    final static void a(int param0, int param1, byte param2, int param3, int param4, t[] param5) {
        int var21 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
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
        String var23 = null;
        int var20Lifetime1;
        int var20Lifetime2;
        int var20Lifetime3;
        int var20Lifetime4;
        var22 = Torquing.field_u;
        try {
          if (param5 == null) {
            return;
          }
          if (param4 > 0 &&
            param1 > 0) {
            if (null == param5[3]) {
              stackIn_9_0 = 0;
            } else {
              stackIn_9_0 = param5[3].field_w;
            }
            var6_int = stackIn_9_0;
            if (param5[5] == null) {
              stackIn_12_0 = 0;
            } else {
              stackIn_12_0 = param5[5].field_w;
            }
            var7 = stackIn_12_0;
            if (null == param5[1]) {
              stackIn_15_0 = 0;
            } else {
              stackIn_15_0 = param5[1].field_u;
            }
            var8 = stackIn_15_0;
            if (null == param5[7]) {
              stackIn_18_0 = 0;
            } else {
              stackIn_18_0 = param5[7].field_u;
            }
            var9 = stackIn_18_0;
            var10 = param0 + param4;
            var11 = param1 + param3;
            var12 = param0 + var6_int;
            var13 = -var7 + var10;
            var14 = var8 + param3;
            var15 = var11 - var9;
            if (param2 != 71) {
              var23 = (String) null;
              rh.a(true, (String) null, (String) null);
            }
            var16 = var12;
            var17 = var13;
            if (var17 < var16) {
              var17 = var6_int * param4 / (var7 + var6_int) + param0;
              var16 = var6_int * param4 / (var7 + var6_int) + param0;
            }
            var18 = var14;
            var19 = var15;
            if (var19 < var18) {
              var19 = param3 + param1 * var8 / (var9 + var8);
              var18 = param3 + param1 * var8 / (var9 + var8);
            }
            ph.b(al.field_d);
            if (null != param5[0]) {
              ph.f(param0, param3, var16, var18);
              param5[0].d(param0, param3);
              ph.a(al.field_d);
            }
            if (null != param5[2]) {
              ph.f(var17, param3, var10, var18);
              param5[2].d(var13, param3);
              ph.a(al.field_d);
            }
            if (param5[6] != null) {
              ph.f(param0, var19, var16, var11);
              param5[6].d(param0, var15);
              ph.a(al.field_d);
            }
            if (null != param5[8]) {
              ph.f(var17, var19, var10, var11);
              param5[8].d(var13, var15);
              ph.a(al.field_d);
            }
            if (null != param5[1] &&
              0 != param5[1].field_w) {
              ph.f(var16, param3, var17, var18);
              for (var20 = var12; var20 < var13; var20 = var20 + param5[1].field_w) {
                param5[1].d(var20, param3);
              }
              ph.a(al.field_d);
            }
            if (null != param5[7] &&
              param5[7].field_w != 0) {
              ph.f(var16, var19, var17, var11);
              for (var20Lifetime1 = var12; var13 > var20Lifetime1; var20Lifetime1 = var20Lifetime1 + param5[7].field_w) {
                param5[7].d(var20Lifetime1, var15);
              }
              ph.a(al.field_d);
            }
            if (param5[3] != null &&
              param5[3].field_u != 0) {
              ph.f(param0, var18, var16, var19);
              for (var20Lifetime2 = var14; var20Lifetime2 < var15; var20Lifetime2 = var20Lifetime2 + param5[3].field_u) {
                param5[3].d(param0, var20Lifetime2);
              }
              ph.a(al.field_d);
            }
            if (param5[5] != null &&
              param5[5].field_u != 0) {
              ph.f(var17, var18, var10, var19);
              for (var20Lifetime3 = var14; var20Lifetime3 < var15; var20Lifetime3 = var20Lifetime3 + param5[5].field_u) {
                param5[5].d(var13, var20Lifetime3);
              }
              ph.a(al.field_d);
            }
            if (param5[4] != null &&
              param5[4].field_w != 0) {
              if (param5[4].field_u == 0) {
                return;
              }
              ph.f(var16, var18, var17, var19);
              for (var20Lifetime4 = var14; var20Lifetime4 < var15; var20Lifetime4 = var20Lifetime4 + param5[4].field_u) {
                for (var21 = var12; var21 < var13; var21 = var21 + param5[4].field_w) {
                  param5[4].d(var21, var20Lifetime4);
                }
              }
              ph.a(al.field_d);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_76_0 = var6;
          stackIn_76_1 = new StringBuilder().append("rh.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_76_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(')').toString());
        }
    }

    final static uf[] a(byte param0, uf[] param1, t param2, String param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        uf[] var6 = null;
        uf var7 = null;
        uf var8 = null;
        uf var9 = null;
        uf[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = -105 / ((52 - param0) / 57);
          var8 = param1[-1 + param1.length];
          if (!var8.a(param2, param3, 250)) {
            var7 = new uf(var8.field_b, var8.field_j, var8.field_m, var8.field_k, var8.field_e, var8.field_o, var8.field_d);
            var9 = var7;
            var9.a(param2, param3, 250);
            var6 = new uf[1 + param1.length];
            dk.a(param1, 0, var6, 0, param1.length);
            var6[param1.length] = var7;
            param1 = var6;
          }
          stackIn_3_0 = (uf[]) (param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("rh.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4) {
        if (param3 > param1) {
          di.a(param1, (byte) 26, param4, qd.field_a[param2], param3);
        } else {
          di.a(param3, (byte) 56, param4, qd.field_a[param2], param1);
        }
        if (param0 > -107) {
          t[] var6 = (t[]) null;
          rh.a(-75, 48, (byte) 27, -12, -103, (t[]) null);
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 >= -27) {
          field_a = (String) null;
        }
        field_a = null;
        field_c = null;
    }

    final static boolean a(boolean param0, String param1, String param2) {
        String var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param1 = kf.a(param1, '_', "", 111);
          if (!param0) {
            field_a = (String) null;
          }
          var3 = db.a(param2, 31108);
          stackIn_7_0 = (-1 != param1.indexOf(param2)) || (param1.indexOf(var3) != -1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("rh.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
        field_c = new bp();
        field_a = null;
    }
}
