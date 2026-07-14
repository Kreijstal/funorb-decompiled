/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf extends ks {
    static sa field_D;
    byte field_B;
    vh field_E;
    int field_F;
    static ic field_C;
    static String field_G;

    public static void h(int param0) {
        if (param0 != -29390) {
            return;
        }
        field_G = null;
        field_D = null;
        field_C = null;
    }

    final int g(int param0) {
        if (param0 != 0) {
            jf.b(-42, -14);
            if (!(null != ((jf) this).field_E)) {
                return 0;
            }
            return ((jf) this).field_E.field_q * 100 / (-((jf) this).field_B + ((jf) this).field_E.field_o.length);
        }
        if (!(null != ((jf) this).field_E)) {
            return 0;
        }
        return ((jf) this).field_E.field_q * 100 / (-((jf) this).field_B + ((jf) this).field_E.field_o.length);
    }

    final byte[] d(byte param0) {
        int var2 = 0;
        if (!((jf) this).field_x) {
          if (((jf) this).field_E.field_q < ((jf) this).field_E.field_o.length + -((jf) this).field_B) {
            throw new RuntimeException();
          } else {
            var2 = -74 / ((-35 - param0) / 45);
            return ((jf) this).field_E.field_o;
          }
        } else {
          throw new RuntimeException();
        }
    }

    final static void b(int param0, int param1) {
        te.field_n = param0;
        if (param1 < 83) {
          L0: {
            field_C = null;
            if (null != au.field_Kb) {
              au.field_Kb.f(-122, param0);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (null != lk.field_e) {
              lk.field_e.b(param0, 6);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        } else {
          L2: {
            if (null != au.field_Kb) {
              au.field_Kb.f(-122, param0);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (null != lk.field_e) {
              lk.field_e.b(param0, 6);
              break L3;
            } else {
              break L3;
            }
          }
          return;
        }
    }

    jf() {
    }

    final static String a(String[][] param0, int param1, String param2, int param3, byte param4) {
        int var5 = 0;
        int var6 = 0;
        String var6_ref = null;
        String var7 = null;
        if (kq.a(param2, false)) {
          var5 = dq.a((byte) -105, param1);
          if (param1 != var5) {
            var6_ref = pe.a(var5, false, param0);
            if (var6_ref == null) {
              var6 = 68 / ((param4 - -77) / 49);
              return param2;
            } else {
              var7 = ua.a(var5, (byte) 83, var6_ref);
              return var7;
            }
          } else {
            var6 = 68 / ((param4 - -77) / 49);
            return param2;
          }
        } else {
          return param2;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = new sa();
        field_G = "New Game";
    }
}
