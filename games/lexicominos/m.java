/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m {
    private String field_c;
    static byte[][] field_a;
    static String field_b;

    public static void a(int param0) {
        field_a = (byte[][]) null;
        field_b = null;
        if (param0 != 1000) {
            field_a = (byte[][]) null;
        }
    }

    final static int a(int param0, byte param1) {
        int var2;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        var2 = 70 / ((param1 - -35) / 38);
        param0 = param0 & 8191;
        if (param0 < 4096) {
          L0: {
            if ((param0 ^ -1) > -2049) {
              stackIn_8_0 = v.field_w[param0];
              break L0;
            } else {
              stackIn_8_0 = v.field_w[4096 + -param0];
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (-6145 >= (param0 ^ -1)) {
              stackIn_4_0 = -v.field_w[-param0 + 8192];
              break L1;
            } else {
              stackIn_4_0 = -v.field_w[-4096 + param0];
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    final boolean a(int param0, String param1) {
        RuntimeException var3 = null;
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
              if (param0 >= 73) {
                break L1;
              } else {
                this.field_c = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = this.field_c.equals(param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("m.A(").append(param0).append(',');

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
          throw ld.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(String param0, int param1, boolean param2) {
        try {
            gb.field_d = true;
            lh.field_w = param2 ? true : false;
            int var3_int = -67 / ((param1 - -72) / 33);
            jj.field_a = new uc(ug.field_A, ra.field_c, param0, ca.field_k, lh.field_w);
            ug.field_A.a(-14579, jj.field_a);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "m.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final void a(java.applet.Applet param0, int param1) {
        if (param1 != 4096) {
            return;
        }
        try {
            te.a("jagex-last-login-method", 31536000L, param0, this.field_c, param1 + -3096);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "m.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0, boolean param1, String param2, java.applet.Applet param3) {
        try {
            java.net.MalformedURLException var4 = null;
            RuntimeException var4_ref = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            String stackIn_13_2 = null;
            StringBuilder stackIn_15_1 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  if (!ab.field_b.startsWith("win")) {
                    break L1;
                  } else {
                    if (ul.a(param2, 14080)) {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                if (param1) {
                  try {
                    L2: {
                      param3.getAppletContext().showDocument(new java.net.URL(param2), "_blank");
                      break L2;
                    }
                  } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
                    uj.a("MGR1: " + param2, (Throwable) null, 1);
                    return;
                  }
                  return;
                } else {
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_12_0 = (RuntimeException) (var4_ref);

                stackIn_12_1 = new StringBuilder().append("m.F(").append(param0).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackIn_13_2 = "null";
                  break L3;
                } else {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackIn_13_2 = "{...}";
                  break L3;
                }
              }
              L4: {


                stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

                if (param3 == null) {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "null";
                  break L4;
                } else {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "{...}";
                  break L4;
                }
              }
              throw ld.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    m(String param0) {
        try {
            this.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "m.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Creating your account";
        field_a = new byte[1000][];
    }
}
