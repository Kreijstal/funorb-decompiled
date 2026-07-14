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
        ((gja) this).field_g = ((gja) this).field_g - 2;
        if (((gja) this).field_g - 2 <= 0) {
            return false;
        }
        if (param0 >= 0) {
            field_l = '';
            return true;
        }
        return true;
    }

    public static void c(int param0) {
        Object var2 = null;
        field_k = null;
        field_i = null;
        if (param0 != 4177) {
          var2 = null;
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
        Object var6 = null;
        var5 = BachelorFridge.field_y;
        if (-4 != (((gja) this).field_o ^ -1)) {
          if (((gja) this).field_o == -2) {
            dg.a(-8 + param2, -96 + param0, -(((gja) this).field_g << 1471389379) - (-1024 - param2) - 16, un.field_m.field_p + param0 + -96);
            un.field_m.a(param2 + -8, -32 + param0 + -64, ((gja) this).field_g << 619566017);
            dg.c();
            if (param1 != 25415) {
              var6 = null;
              gja.a(false, (java.applet.Applet) null, (String) null, 115);
              return;
            } else {
              return;
            }
          } else {
            if (((gja) this).field_o == 4) {
              dg.a(qga.field_r.field_q + param2 - (1056 - (((gja) this).field_g << -2026566269)), param0 - 32, qga.field_r.field_q + (-128 + param2) + 96, -32 + (param0 - -qga.field_r.field_p));
              qga.field_r.a(param2 - 128 + 96, param0 - 32, ((gja) this).field_g << -843618527);
              dg.c();
              if (param1 != 25415) {
                var6 = null;
                gja.a(false, (java.applet.Applet) null, (String) null, 115);
                return;
              } else {
                return;
              }
            } else {
              if (-3 == ((gja) this).field_o) {
                dg.a(qga.field_r.field_q + (-128 + (-8 + param2) - 1024 + (((gja) this).field_g << 101984643)), -32 + param0 - 64, qga.field_r.field_q + 16 + param2 - 128, qga.field_r.field_p + -32 + (param0 + -64));
                qga.field_r.a(-8 + (param2 + -128), -96 + param0, ((gja) this).field_g << -1375057439);
                dg.c();
                if (param1 != 25415) {
                  var6 = null;
                  gja.a(false, (java.applet.Applet) null, (String) null, 115);
                  return;
                } else {
                  return;
                }
              } else {
                if (param1 == 25415) {
                  return;
                } else {
                  var6 = null;
                  gja.a(false, (java.applet.Applet) null, (String) null, 115);
                  return;
                }
              }
            }
          }
        } else {
          dg.a(-128 + (param2 + -8), param0 - 32, 1024 - ((((gja) this).field_g << -277109949) - -16) + (param2 + -128), un.field_m.field_p + (param0 + -32));
          un.field_m.a(param2 + -128 + -8, -32 + param0, ((gja) this).field_g << 1204239649);
          dg.c();
          if (param1 == 25415) {
            return;
          } else {
            var6 = null;
            gja.a(false, (java.applet.Applet) null, (String) null, 115);
            return;
          }
        }
    }

    gja(gj param0, ad param1, int param2) {
        super(param0, param1);
        ((gja) this).field_g = 128;
        ((gja) this).field_o = param2;
    }

    final static void a(String param0, byte param1) {
        if (param1 < 51) {
            return;
        }
        ij.field_m = param0;
    }

    final static boolean b(int param0) {
        if (param0 != -16103) {
            return false;
        }
        return kga.field_c != null ? true : kt.field_i;
    }

    final static void a(boolean param0, java.applet.Applet param1, String param2, int param3) {
        try {
            if (ht.field_i.startsWith("win")) {
                if (qd.a(param2, -126)) {
                    return;
                }
            }
            try {
                if (param3 != 38) {
                    boolean discarded$0 = gja.b(10);
                }
                param1.getAppletContext().showDocument(new java.net.URL(param2), "_blank");
            } catch (java.net.MalformedURLException malformedURLException) {
                cv.a(1, "MGR1: " + param2, (Throwable) null);
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
