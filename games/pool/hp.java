/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hp {
    static long field_a;
    static int[] field_c;
    static dd field_b;
    static String field_e;
    static int[] field_d;

    final static boolean a(boolean param0) {
        if (param0) {
            hp.a(-113, false, -92, -109);
        }
        return tq.a(false, c.field_d, di.field_a);
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            try {
                var2 = new java.net.URL(param1.getCodeBase(), "tosupport.ws");
                param1.getAppletContext().showDocument(p.a((byte) 79, var2, param1), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            if (param0 != 83) {
                Object var3 = null;
                String discarded$0 = hp.a((di) null, (String) null, -87, (String) null);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int[] a(int[] param0, byte param1) {
        int var3 = 0;
        int var5 = Pool.field_O;
        int[] var6 = new int[param0.length];
        int[] var2 = var6;
        for (var3 = 0; var3 < param0.length; var3++) {
            var6[var3] = param0[var3];
        }
        int var4 = -94 / ((param1 - -31) / 50);
        return var6;
    }

    final static String a(di param0, String param1, int param2, String param3) {
        if (!(param0.d(-40))) {
            return param1;
        }
        if (param2 != -641) {
            Object var5 = null;
            int[] discarded$0 = hp.a((int[]) null, (byte) 39);
        }
        return param3 + " - " + param0.b(0) + "%";
    }

    public static void a(byte param0) {
        field_d = null;
        field_c = null;
        field_e = null;
        if (param0 > -31) {
            return;
        }
        field_b = null;
    }

    final static void a(int param0, boolean param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (!fm.field_H) {
          return;
        } else {
          L0: {
            e.field_a.a(param1, false);
            var5 = -29 / ((param3 - -12) / 33);
            var4 = im.field_Ub.i(-1) ? 1 : 0;
            if (ne.field_s == 0) {
              break L0;
            } else {
              if (var4 == 0) {
                param1 = false;
                th.b(-1);
                break L0;
              } else {
                break L0;
              }
            }
          }
          L1: {
            if (!param1) {
              break L1;
            } else {
              im.field_Ub.a((byte) 86, param2, param0);
              break L1;
            }
          }
          L2: {
            if (var4 == 0) {
              break L2;
            } else {
              e.field_a.a(param1, false);
              break L2;
            }
          }
          L3: {
            var6 = im.field_Ub.g(-1) + im.field_Ub.field_sb;
            if (-641 > (var6 ^ -1)) {
              gj.field_G = gj.field_G + 5;
              break L3;
            } else {
              if (635 <= var6) {
                break L3;
              } else {
                if (gj.field_G <= 0) {
                  break L3;
                } else {
                  gj.field_G = gj.field_G - 5;
                  break L3;
                }
              }
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "<%0> and <%1> are offering a rematch.";
        field_d = new int[8192];
    }
}
