/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class q {
    private boolean field_l;
    int field_b;
    private long field_g;
    int field_f;
    static java.util.zip.CRC32 field_k;
    private int field_h;
    int[] field_i;
    private String field_d;
    int field_e;
    String field_n;
    static String[] field_m;
    static int field_a;
    static java.applet.Applet field_c;
    static String field_j;
    static String field_o;

    final int a(byte param0) {
        if (!((q) this).field_l) {
          if (-3 == (((q) this).field_e ^ -1)) {
            if (((q) this).field_h <= 0) {
              if ((((q) this).field_g ^ -1L) != (fe.field_P ^ -1L)) {
                if (param0 <= -41) {
                  if ((field_a ^ -1) == -3) {
                    if (ie.a(((q) this).field_d, 2)) {
                      return 1;
                    } else {
                      return 0;
                    }
                  } else {
                    return 0;
                  }
                } else {
                  q.a(4);
                  if ((field_a ^ -1) == -3) {
                    if (!ie.a(((q) this).field_d, 2)) {
                      return 0;
                    } else {
                      return 1;
                    }
                  } else {
                    return 0;
                  }
                }
              } else {
                return 1;
              }
            } else {
              return 2;
            }
          } else {
            if ((((q) this).field_g ^ -1L) != (fe.field_P ^ -1L)) {
              if (param0 <= -41) {
                if ((field_a ^ -1) == -3) {
                  if (!ie.a(((q) this).field_d, 2)) {
                    return 0;
                  } else {
                    return 1;
                  }
                } else {
                  return 0;
                }
              } else {
                q.a(4);
                if ((field_a ^ -1) == -3) {
                  if (!ie.a(((q) this).field_d, 2)) {
                    return 0;
                  } else {
                    return 1;
                  }
                } else {
                  return 0;
                }
              }
            } else {
              return 1;
            }
          }
        } else {
          return 2;
        }
    }

    final static void a(boolean param0) {
        la var1 = null;
        int var2 = 0;
        int var3 = 0;
        var3 = TrackController.field_F ? 1 : 0;
        var1 = ra.field_C;
        if (!param0) {
          field_j = null;
          L0: while (true) {
            if (lg.c(-1)) {
              var1.c(8, 7);
              var1.field_k = var1.field_k + 1;
              var2 = var1.field_k + 1;
              rc.a(78, var1);
              ra.field_C.a(param0, -var2 + var1.field_k);
              continue L0;
            } else {
              return;
            }
          }
        } else {
          L1: while (true) {
            if (lg.c(-1)) {
              var1.c(8, 7);
              var1.field_k = var1.field_k + 1;
              var2 = var1.field_k + 1;
              rc.a(78, var1);
              ra.field_C.a(param0, -var2 + var1.field_k);
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_j = null;
        field_o = null;
        int var1 = 36 % ((24 - param0) / 56);
        field_k = null;
        field_m = null;
    }

    q(boolean param0) {
        ((q) this).field_h = id.field_h;
        ((q) this).field_e = fd.field_e;
        if (!param0) {
            ((q) this).field_i = null;
        } else {
            ((q) this).field_i = hi.field_A;
        }
        ((q) this).field_l = nl.field_b;
        ((q) this).field_g = lg.field_a;
        ((q) this).field_d = o.field_b;
        ((q) this).field_b = jb.field_d;
        ((q) this).field_f = ka.field_c;
        ((q) this).field_n = li.field_l;
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            String var4 = null;
            int var3 = 0;
            java.net.URL var5 = null;
            try {
                if (param1 != -1) {
                    q.a(false);
                }
                var2 = param0.getDocumentBase().getFile();
                var4 = var2;
                var4 = var2;
                var3 = var2.indexOf('?');
                var4 = "reload.ws";
                if ((var3 ^ -1) <= -1) {
                    var4 = var4 + var2.substring(var3);
                }
                var5 = new java.net.URL(param0.getCodeBase(), var4);
                param0.getAppletContext().showDocument(of.a(param0, var5, false), "_self");
            } catch (Exception exception) {
                exception.printStackTrace();
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
        field_m = new String[]{"By rating", "By win percentage"};
        field_k = new java.util.zip.CRC32();
        field_j = "End Game";
        field_o = "Next page";
    }
}
