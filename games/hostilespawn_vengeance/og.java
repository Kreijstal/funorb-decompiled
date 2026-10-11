/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og {
    static String field_e;
    static int field_c;
    static int[] field_b;
    double field_f;
    double field_a;
    static bd field_d;

    final void a(int param0, byte param1, double param2) {
        param2 = param2 * 0.02454369260617026;
        if (param1 == 94) {
          this.field_f = this.field_f + (double)(-param0) * Math.sin(param2) / 20.0;
          this.field_a = this.field_a + Math.cos(param2) * (double)(-param0) / 20.0;
          return;
        }
        oc var6 = (oc) null;
        og.a((byte) 120, (oc) null);
        this.field_f = this.field_f + (double)(-param0) * Math.sin(param2) / 20.0;
        this.field_a = this.field_a + Math.cos(param2) * (double)(-param0) / 20.0;
    }

    final boolean[] a(int param0, double param1, oc param2, boolean param3, id param4) {
        RuntimeException var7 = null;
        boolean[] stackIn_2_0 = null;
        boolean[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param3) {
            stackIn_4_0 = this.a(25302, false, param1, param0, param4, 1, param2);
            return stackIn_4_0;
          }
          stackIn_2_0 = (boolean[]) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("og.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final boolean[] a(double param0, oc param1, int param2, id param3, byte param4) {
        RuntimeException var7 = null;
        boolean[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 >= -63) {
            this.field_f = 2.317784439522071;
          }
          stackIn_3_0 = this.a(25302, false, param0, param2, param3, 0, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("og.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(')').toString());
        }
    }

    final void a(og param0, int param1) {
        try {
          this.field_f = param0.field_f;
          this.field_a = param0.field_a;
          if (param1 != -28860) {
            field_e = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "og.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        ne var4 = null;
        de var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = HostileSpawn.field_I ? 1 : 0;
        try {
          var4 = (ne) (n.field_v.g(-97));
          while (var4 != null) {
            bl.a(1, var4, param1);
            var4 = (ne) (n.field_v.a(12684));
          }
          if (param0 != -22248) {
            og.a(-73, 61);
          }
          var5 = (de) (ke.field_B.g(-47));
          while (var5 != null) {
            km.a(var5, -19746, param1);
            var5 = (de) (ke.field_B.a(12684));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var2), "og.A(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean[] a(oc param0, double param1, int param2, int param3, id param4) {
        RuntimeException var7 = null;
        boolean[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 1) {
            this.a(-128, (byte) 30, 0.14322233202140824);
          }
          stackIn_3_0 = this.a(25302, true, param1, param3, param4, 1, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("og.I(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void a(double param0, double param1, int param2) {
        this.field_a = param0;
        if (param2 != 1) {
          og.a(47, -122);
          this.field_f = param1;
          return;
        }
        this.field_f = param1;
    }

    final static void a(byte param0, oc param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var2_intLifetime1;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          vi.field_p = new oj[17];
          vi.field_p[0] = new oj(param1, 8, rl.field_c);
          vi.field_p[0].field_I = 1000;
          var2_int = 1;
          var3 = -18 % ((param0 + 14) / 46);
          while (vi.field_p.length > var2_int) {
            vi.field_p[var2_int] = new oj(param1, 231, rl.field_c);
            vi.field_p[var2_int].field_I = 200;
            var2_int++;
          }
          for (var2_intLifetime1 = -1 + vi.field_p.length; var2_intLifetime1 >= 0; var2_intLifetime1--) {
            mm.field_m[el.field_j] = vi.field_p[var2_intLifetime1];
            el.field_j = el.field_j + 1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("og.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final boolean[] a(int param0, boolean param1, double param2, int param3, id param4, int param5, oc param6) {
        int stackIn_25_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_61_0 = 0;
        boolean[] stackIn_62_0 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_66_2 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        RuntimeException decompiledCaughtException = null;
        double var9_double = 0.0;
        RuntimeException var9 = null;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        int var19 = 0;
        double var20 = 0.0;
        double var22 = 0.0;
        int var24_int = 0;
        double var24 = 0.0;
        int var25 = 0;
        int var26_int = 0;
        double var26 = 0.0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        id var33 = null;
        var32 = HostileSpawn.field_I ? 1 : 0;
        try {
          var9_double = 3.141592653589793 * param2 / 128.0;
          if (param0 != 25302) {
            var33 = (id) null;
            this.a(-112, 0.23920950584503275, (oc) null, true, (id) null);
          }
          var11 = Math.sin(var9_double) * (double)(-param3) / 40.0;
          if (var11 > -0.01 &&
            var11 < 0.01) {
            var11 = 0.0;
          }
          var13 = Math.cos(var9_double) * (double)(-param3) / 40.0;
          if (var13 > -0.01 &&
            0.01 > var13) {
            var13 = 0.0;
          }
          var15 = var11;
          var17 = var13;
          var19 = param6.b(-4);
          var20 = var11;
          if (var11 * (this.field_f - 0.5) <= 0.0) {
            var20 = 0.0;
          }
          var22 = var13;
          if (var13 * (this.field_a - 0.5) <= 0.0) {
            var22 = 0.0;
          }
          if (var20 != 0.0 ||
            var22 != 0.0) {
            if (!(0.0 > var20)) {
              stackIn_25_0 = (var20 > 0.0) ? 1 : 0;
            } else {
              stackIn_25_0 = -1;
            }
            var24_int = stackIn_25_0;
            if (!(var22 < 0.0)) {
              if (!(0.0 < var22)) {
                stackIn_30_0 = 0;
              } else {
                stackIn_30_0 = param4.field_d;
              }
            } else {
              stackIn_30_0 = -param4.field_d;
            }
            var25 = stackIn_30_0;
            var26_int = var19 + var24_int;
            var27 = var26_int + var25;
            var28 = var25 + var19;
            if (param1) {
              stackIn_33_0 = param4.b(param5, 5857, var27);
            } else {
              stackIn_33_0 = param4.c(param5, -2, var27);
            }
            var29 = stackIn_33_0;
            if (param1) {
              stackIn_36_0 = param4.b(param5, param0 ^ 29751, var26_int);
            } else {
              stackIn_36_0 = param4.c(param5, param0 ^ -25304, var26_int);
            }
            var30 = stackIn_36_0;
            if (param1) {
              stackIn_39_0 = param4.b(param5, 5857, var28);
            } else {
              stackIn_39_0 = param4.c(param5, -2, var28);
            }
            var31 = stackIn_39_0;
            if (var29 > 1) {
              if (1 >= var30) {
                var22 = 0.0;
                var13 = 0.0;
              } else {
                if (var31 > 1) {
                  var20 = 0.0;
                  var22 = 0.0;
                  var11 = 0.0;
                  var13 = 0.0;
                } else {
                  var20 = 0.0;
                  var11 = 0.0;
                }
              }
            } else {
              if (var30 > 1) {
                var20 = 0.0;
                var11 = 0.0;
              }
              if (1 < var31) {
                var13 = 0.0;
                var22 = 0.0;
              }
            }
          }
          this.field_a = this.field_a + var13;
          this.field_f = this.field_f + var11;
          var24 = var11 - var15;
          if (0.0 > var24) {
            var24 = -var24;
          }
          var26 = -var17 + var13;
          if (0.0 > var26) {
            var26 = -var26;
          }
          stackIn_58_0 = (!(0.01 < var24)) ? 0 : 1;
          var28 = stackIn_58_0;
          stackIn_61_0 = (!(0.01 < var26)) ? 0 : 1;
          var29 = stackIn_61_0;
          stackIn_62_0 = new boolean[]{var28 != 0, var29 != 0};
          return stackIn_62_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_65_0 = var9;
          stackIn_65_1 = new StringBuilder().append("og.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_66_2 = "null";
          } else {
            stackIn_66_2 = "{...}";
          }
          stackIn_68_1 = ((StringBuilder) (Object) stackIn_65_1).append(stackIn_66_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_65_0), ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(')').toString());
        }
    }

    public final String toString() {
        return "(" + oc.a(-1, this.field_f) + "," + oc.a(-1, this.field_a) + ")";
    }

    final void b(double param0, double param1, int param2) {
        if (param2 > 92) {
          param1 = param1 * 0.02454369260617026;
          this.field_f = this.field_f + Math.sin(param1) * -param0 / 20.0;
          this.field_a = this.field_a + Math.cos(param1) * -param0 / 20.0;
          return;
        }
        this.a(41, (byte) -101, 1.4898316096248228);
        param1 = param1 * 0.02454369260617026;
        this.field_f = this.field_f + Math.sin(param1) * -param0 / 20.0;
        this.field_a = this.field_a + Math.cos(param1) * -param0 / 20.0;
    }

    public static void a(byte param0) {
        field_d = null;
        field_e = null;
        field_b = null;
        if (param0 == -50) {
          return;
        }
        field_c = -117;
    }

    og() {
        this.field_f = 0.0;
        this.field_a = 0.0;
    }

    og(og param0) {
        try {
          this.field_f = param0.field_f;
          this.field_a = param0.field_a;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "og.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = "Vengeance";
        og discarded$0 = new og();
    }
}
