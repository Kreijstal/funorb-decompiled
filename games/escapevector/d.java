/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class d {
    private String field_a;
    private boolean field_e;
    private boolean field_b;
    static tk field_c;
    static String field_d;
    static String[] field_f;

    final void a(byte param0, boolean param1) {
        ((d) this).field_e = param1 ? true : false;
        if (param0 != -128) {
            return;
        }
        ((d) this).field_b = true;
    }

    final static boolean a(char param0, int param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        var5 = EscapeVector.field_A;
        if (Character.isISOControl(param0)) {
          return false;
        } else {
          if (k.a(true, param0)) {
            return true;
          } else {
            var6 = pb.field_a;
            var2 = var6;
            var3 = 0;
            L0: while (true) {
              if (var6.length <= var3) {
                var2 = pn.field_nb;
                var3 = 0;
                L1: while (true) {
                  if (var2.length <= var3) {
                    if (param1 != -11217) {
                      return false;
                    } else {
                      return false;
                    }
                  } else {
                    var4 = var2[var3];
                    if (var4 == param0) {
                      return true;
                    } else {
                      var3++;
                      continue L1;
                    }
                  }
                }
              } else {
                var4 = var6[var3];
                if (var4 != param0) {
                  var3++;
                  continue L0;
                } else {
                  return true;
                }
              }
            }
          }
        }
    }

    final boolean b(int param0) {
        if (param0 != 0) {
            return false;
        }
        return ((d) this).field_b;
    }

    final String a(int param0) {
        if (param0 > -24) {
            return null;
        }
        return ((d) this).field_a;
    }

    final boolean c(int param0) {
        if (param0 != 14668) {
            return false;
        }
        return ((d) this).field_e;
    }

    d(String param0) {
        ((d) this).field_b = false;
        ((d) this).field_e = false;
        ((d) this).field_a = param0;
    }

    public static void a(byte param0) {
        field_c = null;
        field_d = null;
        if (param0 != 65) {
            field_f = null;
            field_f = null;
            return;
        }
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new tk();
        field_d = "Quit to website";
        field_f = new String[]{"Fly away from the asteroid intact<br>to avoid losing a life.", "Fly away from the moon intact<br>to avoid losing a life.", "Fly away from the planet intact<br>to avoid losing a life."};
    }
}
