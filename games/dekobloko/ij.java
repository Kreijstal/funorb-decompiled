/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij {
    static boolean field_e;
    private String field_a;
    static ck field_d;
    static int field_c;
    static String field_b;

    final boolean a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = -19 % ((42 - param1) / 60);
            stackIn_1_0 = this.field_a.equals(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("ij.A(");

            if (param0 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final void a(int param0, java.applet.Applet param1) {
        try {
            if (param0 >= -40) {
                field_e = true;
            }
            pf.a(param1, "jagex-last-login-method", 31536000L, (byte) 96, this.field_a);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "ij.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, wl param1, String param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] var4 = null;
        String var5 = null;
        CharSequence var6 = null;
        int stackIn_3_0 = 0;
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
              var3_int = param1.field_n;
              var6 = (CharSequence) ((Object) param2);
              var4 = km.a(param0 ^ -18547, var6);
              param1.c(var4.length, 57);
              param1.field_n = param1.field_n + me.field_z.a(param1.field_r, var4, var4.length, param1.field_n, 0, 8);
              if (param0 == -20539) {
                break L1;
              } else {
                var5 = (String) null;
                ij.a((String) null, (String) null, (byte) -115);
                break L1;
              }
            }
            stackIn_3_0 = -var3_int + param1.field_n;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ij.D(").append(param0).append(',');

            if (param1 == null) {
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

            if (param2 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(int param0) {
        String var2;
        if (param0 >= -38) {
          var2 = (String) null;
          ij.a((String) null, (String) null, (byte) -11);
          field_d = null;
          field_b = null;
          return;
        } else {
          field_d = null;
          field_b = null;
          return;
        }
    }

    final static String a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 5) {
              stackIn_4_0 = wc.a(false, param1, param0 + -5);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("ij.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(String param0, String param1, byte param2) {
        String var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              param1 = jm.a('_', param1, "", -1);
              if (param2 <= -101) {
                break L1;
              } else {
                ij.a(-68, -120);
                break L1;
              }
            }
            L2: {
              L3: {
                var3 = oa.a(param0, -1);
                if (param1.indexOf(param0) != -1) {
                  break L3;
                } else {
                  if (-1 == param1.indexOf(var3)) {
                    stackIn_7_0 = 0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_7_0 = 1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("ij.G(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final static void a(int param0, int param1) {
        int var2;
        int var3;
        L0: {
          qc.field_Y = param0;
          if (bl.field_T != dl.field_M) {
            var2 = dl.field_M * dl.field_M;
            var3 = var2 - bl.field_T * bl.field_T;
            param0 = param0 + var3 * (ac.field_B - param0) / var2;
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 > -24) {
          ij.a(105);
          ea.field_D.a(640, 0, param0, 120, vh.field_g);
          gi.a(-24 + ac.field_B, j.field_c, 640, nk.field_b, 0, 5, (byte) -113);
          return;
        } else {
          ea.field_D.a(640, 0, param0, 120, vh.field_g);
          gi.a(-24 + ac.field_B, j.field_c, 640, nk.field_b, 0, 5, (byte) -113);
          return;
        }
    }

    ij(String param0) {
        try {
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "ij.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = true;
        field_b = "Player Name: ";
    }
}
