/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class uh extends qb {
    static de field_n;
    long[][] field_j;
    String[][] field_m;
    int field_h;
    static long field_p;
    int field_g;
    static java.applet.Applet field_i;
    int[][] field_q;
    boolean field_o;
    int field_k;
    static Random field_l;

    final static dh a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        dh var8 = null;
        var8 = new dh(param5, param3, param0, param6, param4, param7);
        vb.field_c.a((qb) (Object) var8, 27362);
        if (param1 <= 49) {
          field_i = (java.applet.Applet) null;
          ke.a(var8, param2, 21719);
          return var8;
        } else {
          ke.a(var8, param2, 21719);
          return var8;
        }
    }

    final static int a(byte param0, int param1, byte[] param2) {
        if (param0 < 97) {
            return 53;
        }
        return ml.a(param2, 0, param1, 12011);
    }

    final static kc[] a(int param0, qk param1, int param2, byte param3) {
        if (tc.a(param0, param2, param3 + 25552, param1)) {
          if (param3 != -73) {
            field_n = (de) null;
            return ol.s(-106);
          } else {
            return ol.s(-106);
          }
        } else {
          return null;
        }
    }

    final static boolean a(qk param0, qk param1, qk param2, int param3) {
        if (param0.b(param3 ^ 6)) {
          if (param0.b(4, "commonui")) {
            L0: {
              if (!param2.b(4)) {
                break L0;
              } else {
                if (!param2.b(param3 ^ 6, "commonui")) {
                  break L0;
                } else {
                  L1: {
                    if (!param1.b(param3 + param3)) {
                      break L1;
                    } else {
                      if (!param1.b(4, "button.gif")) {
                        break L1;
                      } else {
                        return true;
                      }
                    }
                  }
                  return false;
                }
              }
            }
            return false;
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static void b(byte param0) {
        if (param0 > -62) {
            field_l = (Random) null;
        }
    }

    public static void a(int param0) {
        field_n = null;
        field_l = null;
        if (param0 != -12908) {
            field_l = (Random) null;
            field_i = null;
            return;
        }
        field_i = null;
    }

    final static void a(long param0, int param1, String param2, String param3, java.applet.Applet param4) {
        try {
            Throwable var6 = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            Throwable decompiledCaughtException = null;
            try {
              var8 = param4.getParameter("cookiehost");
              var7 = var8;
              var7 = var8;
              var9 = param2 + "=" + param3 + "; version=1; path=/; domain=" + var8;
              var7 = var9;
              var7 = var9;
              if (param1 > 95) {
                L0: {
                  if (0L <= param0) {
                    var7 = var9 + "; Expires=" + h.a(-60, id.a(106) + param0 * 1000L) + "; Max-Age=" + param0;
                    break L0;
                  } else {
                    var7 = var9 + "; Discard;";
                    break L0;
                  }
                }
                vh.a(param4, "document.cookie=\"" + var7 + "\"", -12300);
              } else {
                return;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var6 = decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    uh() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new de(0, 2, 2, 1);
        field_l = new Random();
    }
}
