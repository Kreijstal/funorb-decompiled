/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k extends ug {
    static pj field_l;
    int[] field_h;
    static boolean field_i;
    static mj field_f;
    static String field_k;
    static int field_g;
    int field_e;
    boolean field_j;

    final static String a(int param0, int param1, int param2, CharSequence[] param3) {
        CharSequence var4_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param1 != param0) {
          if (1 == param1) {
            var10 = param3[param2];
            var4_ref = var10;
            if (var4_ref == null) {
              return "null";
            } else {
              return ((Object) (Object) var10).toString();
            }
          } else {
            var4 = param1 - -param2;
            var5 = 0;
            var6_int = param2;
            L0: while (true) {
              if (var4 <= var6_int) {
                L1: {
                  var6 = new StringBuilder(var5);
                  var7 = param2;
                  if (var4 <= var7) {
                    break L1;
                  } else {
                    L2: {
                      var8 = param3[var7];
                      if (var8 != null) {
                        StringBuilder discarded$2 = var6.append(var8);
                        var7++;
                        break L2;
                      } else {
                        StringBuilder discarded$3 = var6.append("null");
                        var7++;
                        break L2;
                      }
                    }
                    var7++;
                    var7++;
                    break L1;
                  }
                }
                return var6.toString();
              } else {
                var7_ref_CharSequence = param3[var6_int];
                if (var7_ref_CharSequence != null) {
                  var5 = var5 + var7_ref_CharSequence.length();
                  var6_int++;
                  var6_int++;
                  continue L0;
                } else {
                  var5 += 4;
                  var6_int++;
                  var6_int++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return "";
        }
    }

    final static void a(java.applet.Applet param0, byte param1, String param2) {
        try {
            java.net.URL var3 = null;
            try {
                var3 = new java.net.URL(param0.getCodeBase(), param2);
                int var4 = -27 % ((param1 - 23) / 44);
                var3 = uf.a(param0, (byte) 106, var3);
                pl.a(true, 12430, param0, var3.toString());
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_k = null;
        field_l = null;
        if (param0 != -85) {
            return;
        }
        field_f = null;
    }

    k() {
        ((k) this).field_j = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new pj();
        field_k = "Logging in...";
    }
}
