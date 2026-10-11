/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve {
    static String field_b;
    static int field_a;
    static String field_c;
    private boolean field_e;
    private String field_d;

    final static void a(int param0, int param1, tg[] param2, byte param3, int param4, int param5) {
        int var21 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
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
        var22 = Bounce.field_N;
        try {
          if (param2 == null) {
            return;
          }
          if (param4 > 0 &&
            param0 > 0) {
            if (null == param2[3]) {
              stackIn_10_0 = 0;
            } else {
              stackIn_10_0 = param2[3].field_t;
            }
            var6_int = stackIn_10_0;
            if (null != param2[5]) {
              stackIn_13_0 = param2[5].field_t;
            } else {
              stackIn_13_0 = 0;
            }
            var7 = stackIn_13_0;
            if (param2[1] == null) {
              stackIn_16_0 = 0;
            } else {
              stackIn_16_0 = param2[1].field_o;
            }
            var8 = stackIn_16_0;
            if (param2[7] != null) {
              stackIn_19_0 = param2[7].field_o;
            } else {
              stackIn_19_0 = 0;
            }
            var9 = stackIn_19_0;
            if (param3 >= -67) {
              return;
            }
            var10 = param4 + param5;
            var11 = param1 + param0;
            var12 = var6_int + param5;
            var13 = var10 - var7;
            var14 = param1 + var8;
            var15 = -var9 + var11;
            var16 = var12;
            var17 = var13;
            if (var17 < var16) {
              var17 = param4 * var6_int / (var6_int + var7) + param5;
              var16 = param4 * var6_int / (var6_int + var7) + param5;
            }
            var18 = var14;
            var19 = var15;
            if (var18 > var19) {
              var19 = param1 + var8 * param0 / (var8 + var9);
              var18 = param1 + var8 * param0 / (var8 + var9);
            }
            na.b(mg.field_j);
            if (param2[0] != null) {
              na.c(param5, param1, var16, var18);
              param2[0].a(param5, param1);
              na.a(mg.field_j);
            }
            if (null != param2[2]) {
              na.c(var17, param1, var10, var18);
              param2[2].a(var13, param1);
              na.a(mg.field_j);
            }
            if (param2[6] != null) {
              na.c(param5, var19, var16, var11);
              param2[6].a(param5, var15);
              na.a(mg.field_j);
            }
            if (null != param2[8]) {
              na.c(var17, var19, var10, var11);
              param2[8].a(var13, var15);
              na.a(mg.field_j);
            }
            if (param2[1] != null &&
              0 != param2[1].field_t) {
              na.c(var16, param1, var17, var18);
              for (var20 = var12; var20 < var13; var20 = var20 + param2[1].field_t) {
                param2[1].a(var20, param1);
              }
              na.a(mg.field_j);
            }
            if (param2[7] != null &&
              param2[7].field_t != 0) {
              na.c(var16, var19, var17, var11);
              for (var20Lifetime1 = var12; var13 > var20Lifetime1; var20Lifetime1 = var20Lifetime1 + param2[7].field_t) {
                param2[7].a(var20Lifetime1, var15);
              }
              na.a(mg.field_j);
            }
            if (null != param2[3] &&
              param2[3].field_o != 0) {
              na.c(param5, var18, var16, var19);
              for (var20Lifetime2 = var14; var20Lifetime2 < var15; var20Lifetime2 = var20Lifetime2 + param2[3].field_o) {
                param2[3].a(param5, var20Lifetime2);
              }
              na.a(mg.field_j);
            }
            if (param2[5] != null &&
              param2[5].field_o != 0) {
              na.c(var17, var18, var10, var19);
              for (var20Lifetime3 = var14; var20Lifetime3 < var15; var20Lifetime3 = var20Lifetime3 + param2[5].field_o) {
                param2[5].a(var13, var20Lifetime3);
              }
              na.a(mg.field_j);
            }
            if (null != param2[4] &&
              param2[4].field_t != 0 &&
              param2[4].field_o != 0) {
              na.c(var16, var18, var17, var19);
              for (var20Lifetime4 = var14; var15 > var20Lifetime4; var20Lifetime4 = var20Lifetime4 + param2[4].field_o) {
                for (var21 = var12; var13 > var21; var21 = var21 + param2[4].field_t) {
                  param2[4].a(var21, var20Lifetime4);
                }
              }
              na.a(mg.field_j);
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_73_0 = var6;
          stackIn_73_1 = new StringBuilder().append("ve.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final boolean a(byte param0) {
        if (param0 != 56) {
          field_b = (String) null;
        }
        return this.field_e;
    }

    public static void d(byte param0) {
        field_b = null;
        if (param0 != 85) {
          return;
        }
        field_c = null;
    }

    final static void b(byte param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        var1 = nj.field_o;
        synchronized (var1) {
          n.field_m = c.field_c;
          wh.field_d = wh.field_d + 1;
          uc.field_C = th.field_a;
          ll.field_y = q.field_H;
          mi.field_j = cl.field_o;
          cl.field_o = false;
          vh.field_e = ta.field_a;
          og.field_a = hb.field_B;
          rk.field_a = nc.field_b;
          if (param0 != -91) {
            ve.a(108);
          }
          ta.field_a = 0;
        }
    }

    final static void a(int param0) {
        n var1 = (n) (qb.field_g.e((byte) 60));
        if (var1 != null) {
          na.a(var1.field_g, var1.field_k, var1.field_h);
          na.e(var1.field_l, var1.field_j, var1.field_i, var1.field_n);
          if (param0 > -118) {
            ve.b((byte) -90);
          }
          var1.field_g = null;
          k.field_B.a(1, var1);
          return;
        }
        throw new IllegalStateException();
    }

    final String c(byte param0) {
        if (param0 >= -49) {
          return (String) null;
        }
        return this.field_d;
    }

    ve(String param0) {
        this(param0, false);
    }

    ve(String param0, boolean param1) {
        RuntimeException runtimeException = null;
        boolean stackIn_6_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_d = param0;
          if (this.field_d == null) {
            this.field_d = "";
          }
          stackIn_6_1 = (param1);
          this.field_e = stackIn_6_1;
          if (this.field_d.length() == 0) {
            this.field_e = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_11_0 = runtimeException;
          stackIn_11_1 = new StringBuilder().append("ve.<init>(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_b = "Passwords must be between 5 and 20 characters long";
        field_c = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
