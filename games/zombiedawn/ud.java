/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud implements io {
    static java.awt.Color field_c;
    static String field_a;
    private nh field_b;

    final static qg a(String param0, byte param1, int param2) {
        se var3 = null;
        RuntimeException var3_ref = null;
        se stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 68) {
                break L1;
              } else {
                field_c = (java.awt.Color) null;
                break L1;
              }
            }
            var3 = new se();
            ((qg) ((Object) var3)).field_e = param0;
            ((qg) ((Object) var3)).field_b = param2;
            stackIn_3_0 = (se) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("ud.D(");

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
          throw sh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return (qg) ((Object) stackIn_3_0);
    }

    public final void a(int param0, boolean param1, int param2, ga param3, int param4) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        Object var8 = null;
        String var9 = null;
        int var10 = 0;
        try {
          L0: {
            L1: {
              var6_int = param4 - -param3.field_k;
              var7 = param2 - -param3.field_j;
              pb.a(var6_int, param3.field_n, var7, 48, param3.field_i);
              if (param0 == 16777215) {
                break L1;
              } else {
                field_c = (java.awt.Color) null;
                break L1;
              }
            }
            L2: {
              if (!param3.e(-17741)) {
                break L2;
              } else {
                on.b(param3.field_i + -4, -4 + param3.field_n, var6_int - -2, param0 ^ 16777172, var7 - -2);
                break L2;
              }
            }
            L3: {
              bi.f(var6_int, var7, -2 + param3.field_i + var6_int, var7 + param3.field_n);
              var8 = this.field_b.field_T.g(0);
              if (var8 != null) {
                var9 = var8.toString();
                this.field_b.field_L.c(var9, 2 + var6_int, (this.field_b.field_L.field_I + param3.field_n >> 933771393) + (var7 + -1), 10000536, -1);
                if (!this.field_b.e(param0 ^ -16759476)) {
                  break L3;
                } else {
                  if (var9.startsWith(this.field_b.field_U)) {
                    var10 = this.field_b.field_L.b(this.field_b.field_U);
                    bi.a(2 + var6_int, 2 + var7, var10, -4 + param3.field_n, 2188450, 100);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              } else {
                break L3;
              }
            }
            bi.c();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var6);

            stackIn_14_1 = new StringBuilder().append("ud.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param4 + ')');
        }
    }

    final static v a(v param0, int[] param1, int param2) {
        v var3 = null;
        RuntimeException var3_ref = null;
        v stackIn_3_0 = null;
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
              var3 = new v(0, 0, 0);
              if (param2 == -27837) {
                break L1;
              } else {
                ud.a((byte) -120);
                break L1;
              }
            }
            var3.field_a = param0.field_a;
            var3.field_h = param0.field_h;
            var3.field_j = param0.field_j;
            var3.field_e = param0.field_e;
            var3.field_k = param0.field_k;
            var3.field_d = param0.field_d;
            var3.field_g = param0.field_g;
            var3.field_l = param1;
            stackIn_3_0 = (v) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("ud.C(");

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
          throw sh.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != -105) {
            field_c = (java.awt.Color) null;
        }
        field_c = null;
    }

    final static re[] a(int param0, ec param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        re[] var4 = null;
        int var5 = 0;
        re var6 = null;
        int var7 = 0;
        op var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        re[] stackIn_4_0 = null;
        re[] stackIn_11_0 = null;
        re[] stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = ZombieDawn.field_J;
        try {
          L0: {
            if (!param1.c(10)) {
              stackIn_4_0 = new re[]{};
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var8 = param1.a(param0 + -1);
              L1: while (true) {
                if (-1 != (var8.field_f ^ -1)) {
                  if (var8.field_f == 2) {
                    stackIn_11_0 = new re[]{};
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var10 = (int[]) (var8.field_d);
                    var9 = var10;
                    var3 = var9;
                    var4 = new re[var10.length >> -1909262942];
                    var5 = param0;
                    L2: while (true) {
                      if (var5 >= var4.length) {
                        stackIn_16_0 = (re[]) (var4);
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        var6 = new re();
                        var4[var5] = var6;
                        var6.field_a = var3[var5 << 511559810];
                        var6.field_d = var3[1 + (var5 << 466828994)];
                        var6.field_b = var3[(var5 << -2018265502) - -2];
                        var6.field_f = var3[(var5 << -1454643070) - -3];
                        var5++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  ld.a(10L, (byte) 84);
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var2);

            stackIn_19_1 = new StringBuilder().append("ud.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            return stackIn_16_0;
          }
        }
    }

    ud(nh param0) {
        try {
            this.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "ud.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = new java.awt.Color(10040319);
        field_a = "Your undead army is victorious!";
    }
}
