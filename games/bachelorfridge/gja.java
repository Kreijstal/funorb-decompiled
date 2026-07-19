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
        int fieldTemp$0 = this.field_g - 2;
        this.field_g = this.field_g - 2;
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
        String var2 = null;
        field_k = (int[][][]) null;
        field_i = null;
        if (param0 != 4177) {
          var2 = (String) null;
          gja.a(false, (java.applet.Applet) null, (String) null, -36);
          field_m = null;
          return;
        } else {
          field_m = null;
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var5 = 0;
        String var6 = null;
        var5 = BachelorFridge.field_y;
        if (-4 != (this.field_o ^ -1)) {
          if ((this.field_o ^ -1) == -2) {
            dg.a(-8 + param2, -96 + param0, -(this.field_g << 1471389379) - (-1024 - param2) - 16, un.field_m.field_p + param0 + -96);
            un.field_m.a(param2 + -8, -32 + param0 + -64, this.field_g << 619566017);
            dg.c();
            if (param1 != 25415) {
              var6 = (String) null;
              gja.a(false, (java.applet.Applet) null, (String) null, 115);
              return;
            } else {
              return;
            }
          } else {
            if (this.field_o == 4) {
              dg.a(qga.field_r.field_q + param2 - (1056 - (this.field_g << -2026566269)), param0 - 32, qga.field_r.field_q + (-128 + param2) + 96, -32 + (param0 - -qga.field_r.field_p));
              qga.field_r.a(param2 - 128 + 96, param0 - 32, this.field_g << -843618527);
              dg.c();
              if (param1 != 25415) {
                var6 = (String) null;
                gja.a(false, (java.applet.Applet) null, (String) null, 115);
                return;
              } else {
                return;
              }
            } else {
              if (-3 == (this.field_o ^ -1)) {
                dg.a(qga.field_r.field_q + (-128 + (-8 + param2) - 1024 + (this.field_g << 101984643)), -32 + param0 - 64, qga.field_r.field_q + 16 + param2 - 128, qga.field_r.field_p + -32 + (param0 + -64));
                qga.field_r.a(-8 + (param2 + -128), -96 + param0, this.field_g << -1375057439);
                dg.c();
                if (param1 != 25415) {
                  var6 = (String) null;
                  gja.a(false, (java.applet.Applet) null, (String) null, 115);
                  return;
                } else {
                  return;
                }
              } else {
                if (param1 == 25415) {
                  return;
                } else {
                  var6 = (String) null;
                  gja.a(false, (java.applet.Applet) null, (String) null, 115);
                  return;
                }
              }
            }
          }
        } else {
          dg.a(-128 + (param2 + -8), param0 - 32, 1024 - ((this.field_g << -277109949) - -16) + (param2 + -128), un.field_m.field_p + (param0 + -32));
          un.field_m.a(param2 + -128 + -8, -32 + param0, this.field_g << 1204239649);
          dg.c();
          if (param1 == 25415) {
            return;
          } else {
            var6 = (String) null;
            gja.a(false, (java.applet.Applet) null, (String) null, 115);
            return;
          }
        }
    }

    gja(gj param0, ad param1, int param2) {
        super(param0, param1);
        try {
            this.field_g = 128;
            this.field_o = param2;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "gja.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(String param0, byte param1) {
        if (param1 < 51) {
            return;
        }
        try {
            ij.field_m = param0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "gja.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
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
            boolean discarded$2 = false;
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
                L1: {
                  if (!ht.field_i.startsWith("win")) {
                    break L1;
                  } else {
                    if (!qd.a(param2, -126)) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
                try {
                  L2: {
                    L3: {
                      if (param3 == 38) {
                        break L3;
                      } else {
                        discarded$2 = gja.b(10);
                        break L3;
                      }
                    }
                    param1.getAppletContext().showDocument(new java.net.URL(param2), "_blank");
                    break L2;
                  }
                } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
                  cv.a(1, "MGR1: " + param2, (Throwable) null);
                  return;
                }
                return;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_9_0 = (RuntimeException) (var4_ref);
                stackOut_9_1 = new StringBuilder().append("gja.F(").append(param0).append(',');
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (param1 == null) {
                  stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackOut_11_2 = "null";
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L4;
                } else {
                  stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackOut_10_2 = "{...}";
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L4;
                }
              }
              L5: {
                stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                if (param2 == null) {
                  stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackOut_14_2 = "null";
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  break L5;
                } else {
                  stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackOut_13_2 = "{...}";
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  break L5;
                }
              }
              throw pe.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_k = new int[][][]{new int[][]{new int[]{96, 24}}, new int[][]{new int[]{81, 34}, new int[]{110, 34}}, new int[][]{new int[]{72, 34}, new int[]{96, 24}, new int[]{119, 34}}, new int[][]{new int[]{58, 38}, new int[]{82, 26}, new int[]{110, 26}, new int[]{132, 38}}};
        field_i = new String[]{"Showing by rating", "Showing by win percentage"};
        field_l = '/';
        field_j = false;
    }
}
