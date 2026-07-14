/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he extends ub {
    static tk field_G;
    int field_F;

    final static void a(long param0, java.applet.Applet param1, String param2, int param3, String param4) {
        try {
            Throwable var6 = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var8 = param1.getParameter("cookiehost");
                var7 = var8;
                var7 = var8;
                var9 = param4 + "=" + param2 + "; version=1; path=/; domain=" + var8;
                var7 = var9;
                var7 = var9;
                if (0L > param0) {
                  var7 = var9 + "; Discard;";
                  break L0;
                } else {
                  var7 = var9 + "; Expires=" + cd.a(75, param0 * 1000L + bb.b(-1)) + "; Max-Age=" + param0;
                  break L0;
                }
              }
              L1: {
                if (param3 <= -98) {
                  break L1;
                } else {
                  field_G = null;
                  break L1;
                }
              }
              eo.a(param1, -31645, "document.cookie=\"" + var7 + "\"");
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

    he(n param0) {
        super(param0.field_k, param0.field_o, param0.field_x, param0.field_u, (dh) null, (tb) null);
        param0.a(0, (byte) 122, 0, ((he) this).field_u, ((he) this).field_x);
        ((he) this).field_B = param0;
        ((he) this).field_F = 256;
    }

    public he() {
        super(0, 0, 0, 0, (dh) null, (tb) null);
        ((he) this).field_F = 256;
    }

    public static void h(int param0) {
        field_G = null;
        if (param0 != 1000) {
            Object var2 = null;
            he.a(-9L, (java.applet.Applet) null, (String) null, -57, (String) null);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        hj var6 = null;
        if (param3 == 0) {
          if (null == ((he) this).field_B) {
            return;
          } else {
            if (0 == ((he) this).field_F) {
              return;
            } else {
              if (((he) this).field_F == 256) {
                ((he) this).field_B.a(-9532, ((he) this).field_o + param1, ((he) this).field_k + param2, param3);
                return;
              } else {
                var6 = new hj(((he) this).field_B.field_x, ((he) this).field_B.field_u);
                hf.a(var6, -1);
                ((he) this).field_B.a(param0, 0, 0, param3);
                dm.b((byte) -10);
                var6.d(param2 - -((he) this).field_k, param1 + ((he) this).field_o, ((he) this).field_F);
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    static {
    }
}
