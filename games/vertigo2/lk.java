/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lk {
    int[] field_e;
    int field_d;
    int field_i;
    static String field_c;
    static String field_g;
    java.awt.Image field_b;
    static String field_f;
    static String field_h;
    static cr field_a;

    abstract void a(java.awt.Graphics param0, int param1, int param2, int param3);

    final static String a(byte param0, int param1, String param2) {
        tp var4_ref_tp = null;
        int var4 = 0;
        mi var5 = null;
        int var6 = 0;
        int var7 = 0;
        tp var8 = null;
        CharSequence var9 = null;
        var7 = Vertigo2.field_L ? 1 : 0;
        var9 = (CharSequence) (Object) param2;
        if (hi.a((byte) -3, var9)) {
          if (-3 != (ba.field_d ^ -1)) {
            return oa.field_o;
          } else {
            var8 = vo.a(param2, 0);
            if (var8 == null) {
              return Vertigo2.a(new String[1], tq.field_a, 26);
            } else {
              li discarded$1 = tm.field_a.b((li) (Object) var8, (byte) -50);
              L0: while (true) {
                var4_ref_tp = (tp) (Object) tm.field_a.b(125);
                if (var4_ref_tp != null) {
                  var4_ref_tp.field_Pb = var4_ref_tp.field_Pb - 1;
                  continue L0;
                } else {
                  var8.c(2);
                  var4 = 114 % ((param0 - 24) / 54);
                  var8.a(-102);
                  sq.field_b = sq.field_b - 1;
                  var5 = uh.field_Wb;
                  var5.j(param1, 120);
                  var5.field_u = var5.field_u + 1;
                  var6 = var5.field_u;
                  var5.f(1, -96);
                  var5.a((byte) 0, param2);
                  var5.b((byte) -100, var5.field_u + -var6);
                  return null;
                }
              }
            }
          }
        } else {
          return or.field_a;
        }
    }

    abstract void a(java.awt.Component param0, int param1, int param2, int param3);

    public static void b(int param0) {
        field_h = null;
        field_g = null;
        if (param0 != -18390) {
            return;
        }
        field_f = null;
        field_a = null;
        field_c = null;
    }

    final static void a(int[] param0, byte param1) {
        if (param1 != -48) {
            field_g = null;
        }
    }

    final void a(int param0) {
        bi.a(((lk) this).field_e, ((lk) this).field_i, ((lk) this).field_d);
        int var2 = -99 / ((param0 - -92) / 32);
    }

    final static boolean a(int param0, long param1, String param2, int param3, int[] param4) {
        if (param0 == 1) {
          if (param4 != null) {
            if (-3 == (param3 ^ -1)) {
              if (!rm.a((byte) -125, param1, param2)) {
                return false;
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          lk.b(91);
          if (param4 != null) {
            if (-3 == (param3 ^ -1)) {
              if (!rm.a((byte) -125, param1, param2)) {
                return false;
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "<%0> is BLUE";
        field_f = "<%0> is already on your ignore list.";
        field_g = "Unpacking levels";
        field_c = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}
