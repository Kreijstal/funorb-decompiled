/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sn {
    private String field_a;
    static int[] field_f;
    static boolean field_b;
    static int field_e;
    static String field_d;
    static gm field_c;

    final static ll a(byte param0, long param1, boolean param2, String param3, String param4) {
        RuntimeException var6 = null;
        ld stackIn_7_0 = null;
        l stackIn_9_0 = null;
        bn stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 <= -19) {
                break L1;
              } else {
                field_f = (int[]) null;
                break L1;
              }
            }
            L2: {
              if (param1 != 0L) {
                break L2;
              } else {
                if (param4 != null) {
                  stackIn_9_0 = new l(param4, param3);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            if (!param2) {
              stackIn_11_0 = new bn(param1, param3);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_7_0 = new ld(param1, param3);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var6);

            stackIn_14_1 = new StringBuilder().append("sn.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param4 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ll) ((Object) stackIn_7_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ll) ((Object) stackIn_9_0);
          } else {
            return (ll) ((Object) stackIn_11_0);
          }
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static vn a(int param0, double param1, byte param2) {
        if (param2 > -31) {
            sn.a((byte) 27);
        }
        vn var10 = new vn(640, 90);
        ki.a((byte) -97, var10);
        vn var5 = new vn(640, 90);
        ki.a((byte) -94, var5);
        bi.f(0, 5, 640, 75, 16777215, 1);
        pa.a(-21189);
        vn var6 = new vn(640, 90);
        ki.a((byte) -113, var6);
        b.field_j.a(f.field_j[param0], 320, 65, 13631488, 1);
        pa.a(-21189);
        vn var7 = new vn(640, 90);
        ki.a((byte) -123, var7);
        int var8 = (int)(param1 * 640.0);
        int var9 = (int)(param1 * 90.0);
        var6.d((640 + -var8) / 2, 0, var8, var9);
        var5.a(0, 0);
        var7.d(16777215);
        var7.d(16777215);
        var7.d(1);
        var7.d(1);
        pa.a(-21189);
        var7.b(0, 13);
        pa.a(-21189);
        return var10;
    }

    final static boolean b(byte param0) {
        if (param0 != 12) {
            return false;
        }
        return hl.a(param0 + -139, hc.a(param0 ^ 12));
    }

    final static tj a(int param0, int param1, dj param2, dj param3, int param4) {
        RuntimeException var5 = null;
        Object stackIn_4_0 = null;
        tj stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 90) {
                break L1;
              } else {
                field_f = (int[]) null;
                break L1;
              }
            }
            if (ph.a(param0, 31043, param4, param2)) {
              stackIn_6_0 = ua.a((byte) -128, param3.a((byte) 51, param0, param4));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("sn.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (tj) ((Object) stackIn_4_0);
        } else {
          return stackIn_6_0;
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_d = null;
        field_f = null;
        if (param0 != 93) {
            field_f = (int[]) null;
        }
    }

    final static void a(int param0, ep param1, int param2) {
        int var4 = 0;
        am var5 = dp.field_e;
        var5.j(11, param0);
        if (param2 != 0) {
            return;
        }
        try {
            var5.field_j = var5.field_j + 1;
            var4 = var5.field_j;
            var5.i(1, 79);
            if (param1.field_j == null) {
                var5.i(0, 95);
            } else {
                var5.i(param1.field_j.length, -90);
                var5.a(param1.field_j, param1.field_j.length, 0, param2 ^ -27843);
            }
            var5.e(-60, var4);
            var5.field_j = var5.field_j - 4;
            param1.field_k = var5.c(98);
            var5.d(69, var5.field_j - var4);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "sn.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    sn(String param0) {
        try {
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "sn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, java.applet.Applet param1) {
        if (param0 != 640) {
            return;
        }
        try {
            pg.a(true, param1, 31536000L, "jagex-last-login-method", this.field_a);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "sn.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(String param0, byte param1) {
        RuntimeException var3 = null;
        java.applet.Applet var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -22) {
                break L1;
              } else {
                var4 = (java.applet.Applet) null;
                this.a(1, (java.applet.Applet) null);
                break L1;
              }
            }
            stackIn_3_0 = this.field_a.equals(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("sn.G(");

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
          throw sh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    static {
        int var4 = 0;
        field_b = false;
        field_f = new int[50];
        double var0 = 0.0;
        double var2 = 0.12566370614359174;
        for (var4 = 0; (var4 ^ -1) > -51; var4++) {
            field_f[var4] = (int)(Math.sin(var0) * 64.0) + 192;
            var0 = var0 + var2;
        }
        field_d = "Enter the name you'd prefer. This is the name displayed to other players.";
    }
}
