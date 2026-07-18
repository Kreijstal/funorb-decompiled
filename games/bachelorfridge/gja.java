/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gja extends tia {
    private int field_o;
    static int[][][] field_k;
    static String[] field_i;
    static boolean field_n;
    static char field_l;
    static volatile boolean field_j;
    static rp field_m;

    final boolean a(int param0) {
        int fieldTemp$0 = ((gja) this).field_g - 2;
        ((gja) this).field_g = ((gja) this).field_g - 2;
        if (fieldTemp$0 <= 0) {
            return false;
        }
        if (param0 >= 0) {
            field_l = '';
            return true;
        }
        return true;
    }

    public static void c(int param0) {
        field_k = null;
        field_i = null;
        field_m = null;
    }

    final void a(int param0, int param1, int param2) {
        int var5 = 0;
        Object var6 = null;
        var5 = BachelorFridge.field_y;
        if (((gja) this).field_o != 3) {
          if (((gja) this).field_o == 1) {
            dg.a(-8 + param2, -96 + param0, -(((gja) this).field_g << 3) - (-1024 - param2) - 16, un.field_m.field_p + param0 + -96);
            un.field_m.a(param2 + -8, -32 + param0 + -64, ((gja) this).field_g << 1);
            dg.c();
            if (param1 == 25415) {
              return;
            } else {
              var6 = null;
              gja.a(false, (java.applet.Applet) null, (String) null, 115);
              return;
            }
          } else {
            if (((gja) this).field_o == 4) {
              dg.a(qga.field_r.field_q + param2 - (1056 - (((gja) this).field_g << 3)), param0 - 32, qga.field_r.field_q + (-128 + param2) + 96, -32 + (param0 - -qga.field_r.field_p));
              qga.field_r.a(param2 - 32, param0 - 32, ((gja) this).field_g << 1);
              dg.c();
              if (param1 == 25415) {
                return;
              } else {
                var6 = null;
                gja.a(false, (java.applet.Applet) null, (String) null, 115);
                return;
              }
            } else {
              if (((gja) this).field_o == 2) {
                dg.a(qga.field_r.field_q + (-128 + (-8 + param2) - 1024 + (((gja) this).field_g << 3)), -32 + param0 - 64, qga.field_r.field_q + 16 + param2 - 128, qga.field_r.field_p + -32 + (param0 + -64));
                qga.field_r.a(-8 + (param2 + -128), -96 + param0, ((gja) this).field_g << 1);
                dg.c();
                if (param1 == 25415) {
                  return;
                } else {
                  var6 = null;
                  gja.a(false, (java.applet.Applet) null, (String) null, 115);
                  return;
                }
              } else {
                if (param1 != 25415) {
                  var6 = null;
                  gja.a(false, (java.applet.Applet) null, (String) null, 115);
                  return;
                } else {
                  return;
                }
              }
            }
          }
        } else {
          dg.a(-128 + (param2 + -8), param0 - 32, 1024 - ((((gja) this).field_g << 3) - -16) + (param2 + -128), un.field_m.field_p + (param0 + -32));
          un.field_m.a(param2 - 136, -32 + param0, ((gja) this).field_g << 1);
          dg.c();
          if (param1 != 25415) {
            var6 = null;
            gja.a(false, (java.applet.Applet) null, (String) null, 115);
            return;
          } else {
            return;
          }
        }
    }

    gja(gj param0, ad param1, int param2) {
        super(param0, param1);
        try {
            ((gja) this).field_g = 128;
            ((gja) this).field_o = param2;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "gja.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(String param0, byte param1) {
        try {
            ij.field_m = param0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "gja.B(" + (param0 != null ? "{...}" : "null") + ',' + 92 + ')');
        }
    }

    final static boolean b(int param0) {
        if (param0 != -16103) {
            return false;
        }
        return kga.field_c != null ? true : kt.field_i;
    }

    final static void a(boolean param0, java.applet.Applet param1, String param2, int param3) {
        try {
            java.net.MalformedURLException var4 = null;
            RuntimeException var4_ref = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            try {
              L0: {
                if (!ht.field_i.startsWith("win")) {
                  break L0;
                } else {
                  if (!qd.a(param2, -126)) {
                    break L0;
                  } else {
                    return;
                  }
                }
              }
              try {
                L1: {
                  L2: {
                    if (param3 == 38) {
                      break L2;
                    } else {
                      boolean discarded$2 = gja.b(10);
                      break L2;
                    }
                  }
                  param1.getAppletContext().showDocument(new java.net.URL(param2), "_blank");
                  break L1;
                }
              } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
                cv.a(1, "MGR1: " + param2, (Throwable) null);
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_9_0 = (RuntimeException) var4_ref;
                stackOut_9_1 = new StringBuilder().append("gja.F(").append(param0).append(',');
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (param1 == null) {
                  stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                  stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                  stackOut_11_2 = "null";
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L3;
                } else {
                  stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                  stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                  stackOut_10_2 = "{...}";
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L3;
                }
              }
              L4: {
                stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                if (param2 == null) {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "null";
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  break L4;
                } else {
                  stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                  stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                  stackOut_13_2 = "{...}";
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  break L4;
                }
              }
              throw pe.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param3 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new int[][][]{new int[1][], new int[2][], new int[3][], new int[4][]};
        field_i = new String[]{"Showing by rating", "Showing by win percentage"};
        field_l = '/';
        field_j = false;
    }
}
