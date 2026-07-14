/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cp {
    static String field_b;
    static String field_a;
    static int field_c;

    final static boolean a(int param0) {
        int var1 = 0;
        var1 = -123 / ((param0 - 52) / 44);
        if (-21 >= (qc.field_A ^ -1)) {
          if (tk.c((byte) -38)) {
            if (0 < rc.field_b) {
              if (ne.j(0)) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    public static void b(byte param0) {
        int var1 = 65 / ((-65 - param0) / 61);
        field_a = null;
        field_b = null;
    }

    final static boolean a(byte param0, char param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        if (!Character.isISOControl(param1)) {
          if (!d.a(param1, param0 + -62)) {
            if (param0 == 64) {
              var6 = nr.field_o;
              var2 = var6;
              var3 = 0;
              L0: while (true) {
                if (var6.length <= var3) {
                  var2 = uc.field_b;
                  var3 = 0;
                  L1: while (true) {
                    if (var2.length > var3) {
                      var4 = var2[var3];
                      if (param1 != var4) {
                        var3++;
                        continue L1;
                      } else {
                        return true;
                      }
                    } else {
                      return false;
                    }
                  }
                } else {
                  var4 = var6[var3];
                  if (var4 != param1) {
                    var3++;
                    continue L0;
                  } else {
                    return true;
                  }
                }
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final static void a(byte param0) {
        if (dc.field_L == null) {
          return;
        } else {
          Vertigo2.a((java.awt.Canvas) (Object) dc.field_L, (byte) -35);
          dc.field_L.a(gi.field_s, 30210);
          dc.field_L = null;
          if (param0 > 122) {
            if (null != t.field_m) {
              t.field_m.b((byte) 118);
              ne.field_F.requestFocus();
              return;
            } else {
              ne.field_F.requestFocus();
              return;
            }
          } else {
            field_a = null;
            if (null == t.field_m) {
              ne.field_F.requestFocus();
              return;
            } else {
              t.field_m.b((byte) 118);
              ne.field_F.requestFocus();
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "    ";
        field_c = -1;
        field_a = "Unpacking models";
    }
}
