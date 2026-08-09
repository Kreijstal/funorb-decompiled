/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bo extends jl implements bp {
    private kg field_X;
    static String field_Y;

    public static void p(int param0) {
        field_Y = null;
        if (param0 != 0) {
            field_Y = (String) null;
        }
    }

    bo(tc param0, ih param1) {
        super(param0, 200, 150);
        Object var3 = null;
        vg var4 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = null;
              if (eo.field_Z != param1) {
                if (param1 != bg.field_f) {
                  if (param1 != pe.field_E) {
                    break L1;
                  } else {
                    this.field_n = this.field_n + 30;
                    var3 = sc.field_p;
                    break L1;
                  }
                } else {
                  var3 = lp.field_z;
                  this.field_n = this.field_n + 10;
                  if (!cb.c((byte) 58)) {
                    break L1;
                  } else {
                    this.field_n = this.field_n + 20;
                    var3 = rm.field_c;
                    break L1;
                  }
                }
              } else {
                var3 = ne.field_n;
                break L1;
              }
            }
            var4 = new vg((String) (var3), (ko) null);
            var4.field_q = 50;
            var4.field_x = this.field_x;
            var4.field_m = 0;
            var4.field_n = 80;
            var4.field_p = (iq) ((Object) new o(mf.field_x, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
            this.b((byte) -49, var4);
            this.field_X = this.a((ko) (this), nf.field_i, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = var3;

            stackIn_12_1 = new StringBuilder().append("bo.<init>(");

            if (param0 == null) {
              stackIn_13_0 = stackIn_12_0;
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = stackIn_12_0;
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param1 == null) {

              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {

              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
    }

    final static void r(int param0) {
        sl.a(param0 ^ param0, of.field_b);
    }

    final static boolean q(int param0) {
        int var1 = -98 / ((param0 - -33) / 63);
        return !wh.field_a.b(14) ? true : false;
    }

    private final kg a(ko param0, String param1, int param2) {
        kg var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        kg stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = new kg(param1, param0);
              var4.field_p = (iq) ((Object) new qp());
              var5 = -6 + this.field_n;
              this.field_n = this.field_n + 38;
              if (param2 == 0) {
                break L1;
              } else {
                bo.p(-92);
                break L1;
              }
            }
            var4.a(var5, 30, (byte) 126, 15, this.field_x - 14 + -16);
            this.b((byte) -50, var4);
            this.d((byte) 90);
            stackIn_3_0 = (kg) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("bo.AB(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    private final void f(boolean param0) {
        if (!param0) {
            return;
        }
        if (!this.field_E) {
            return;
        }
        this.field_E = false;
    }

    final static void a(int param0, int param1) {
        sl var2 = js.field_f;
        var2.h(param0, 255);
        var2.c(1, (byte) -76);
        var2.c(param1, (byte) -97);
    }

    public final void a(kg param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 != this.field_X) {
                break L1;
              } else {
                this.f(true);
                break L1;
              }
            }
            if (param1 == 6) {
              break L0;
            } else {
              this.f(true);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var6);

            stackIn_7_1 = new StringBuilder().append("bo.F(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static vm a(int[] param0, byte param1, qr param2, qr param3, qr param4) {
        int var5_int = 0;
        String[] var6 = null;
        char[] var7 = null;
        vm[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        dp var11 = null;
        int var12 = 0;
        char[] var13 = null;
        char[] var14 = null;
        vm stackIn_4_0 = null;
        Object stackIn_10_0 = null;
        vm stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var5 = null;
        Exception var10 = null;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var5_int = param0.length;
            var6 = new String[var5_int];
            var14 = new char[var5_int];
            var13 = var14;
            var7 = var13;
            var8 = new vm[var5_int];
            var9 = 49;
            try {
              L1: {
                if (param1 < -106) {
                  var10_int = 0;
                  L2: while (true) {
                    if (var5_int <= var10_int) {
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      var11 = dh.field_c.a((byte) 47, param0[var10_int]);
                      var6[var10_int] = var11.f(80);
                      var9 = (char)(var9 + 1);
                      var7[var10_int] = (char)var9;
                      var8[var10_int] = null;
                      var10_int++;
                      continue L2;
                    }
                  }
                } else {
                  stackIn_4_0 = (vm) null;
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var10 = (Exception) (Object) decompiledCaughtException;
              stackIn_10_0 = null;
              return (vm) ((Object) stackIn_10_0);
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 1;
              break L0;
            } else {
              stackIn_12_0 = new vm(0L, param3, param4, param2, var8, param0, var6, var14);
              decompiledRegionSelector1 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L3: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5);

            stackIn_15_1 = new StringBuilder().append("bo.I(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param4 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L6;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_16_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_12_0;
        } else {
          return stackIn_4_0;
        }
    }

    static {
        field_Y = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
