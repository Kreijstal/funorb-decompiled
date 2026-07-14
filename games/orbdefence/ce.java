/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce {
    static String field_b;
    static hb[] field_e;
    static String field_c;
    static int field_d;
    static int field_a;

    final static void a(int param0, byte param1) {
        hf var2 = null;
        int var3 = 0;
        var3 = OrbDefence.field_D ? 1 : 0;
        ck.field_f = param0;
        if (param1 < -114) {
          var2 = (hf) (Object) ba.field_b.b((byte) 117);
          L0: while (true) {
            if (var2 == null) {
              if (null != bg.field_a) {
                var2 = (hf) (Object) bg.field_a.b((byte) 116);
                L1: while (true) {
                  if (var2 != null) {
                    L2: {
                      if (var2.field_f.b(true)) {
                        var2.field_h.g(128 + var2.field_j * ck.field_f >> 1257608904);
                        break L2;
                      } else {
                        var2.b(57);
                        break L2;
                      }
                    }
                    var2 = (hf) (Object) bg.field_a.d(853);
                    continue L1;
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              L3: {
                if (!var2.field_f.b(true)) {
                  var2.b(57);
                  break L3;
                } else {
                  var2.field_h.g(128 + ck.field_f * var2.field_j >> 302902376);
                  break L3;
                }
              }
              var2 = (hf) (Object) ba.field_b.d(853);
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        if (!param0) {
            return;
        }
        field_e = null;
        field_b = null;
    }

    final static boolean a(int param0) {
        int var1 = 105 / ((52 - param0) / 61);
        if (tf.field_c == -1) {
            if (!(va.a(true, 1))) {
                return false;
            }
            tf.field_c = cd.field_t.b((byte) 90);
            cd.field_t.field_i = 0;
        }
        if (!((tf.field_c ^ -1) != 1)) {
            if (va.a(true, 2)) {
                tf.field_c = cd.field_t.j(98203176);
                cd.field_t.field_i = 0;
                return va.a(true, tf.field_c);
            }
            return false;
        }
        return va.a(true, tf.field_c);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_e = new hb[255];
        field_b = "Your email address is used to identify this account";
        field_c = null;
        for (var0 = 0; field_e.length > var0; var0++) {
            field_e[var0] = new hb();
        }
        field_d = -1;
    }
}
