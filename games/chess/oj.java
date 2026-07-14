/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj {
    int field_d;
    static ci field_c;
    static String field_g;
    int field_e;
    static String field_b;
    int field_f;
    static String field_a;

    final static void a(int param0, byte param1, int param2, int param3) {
        L0: {
          if (0 != param0) {
            break L0;
          } else {
            if (sg.field_d != param2) {
              sg.field_d = param2;
              tj.field_l = true;
              pj.b(-6446, param3);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (1 != param0) {
            if (2 != param0) {
              break L1;
            } else {
              if (param2 == v.field_d) {
                break L1;
              } else {
                v.field_d = param2;
                tj.field_l = true;
                pj.b(param1 + -6347, param3);
                break L1;
              }
            }
          } else {
            if (2 != param0) {
              break L1;
            } else {
              if (param2 == v.field_d) {
                break L1;
              } else {
                v.field_d = param2;
                tj.field_l = true;
                pj.b(param1 + -6347, param3);
                break L1;
              }
            }
          }
        }
        L2: {
          if (param1 == -99) {
            break L2;
          } else {
            oj.a((byte) 15);
            break L2;
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        int var1 = -5 / ((-50 - param0) / 60);
        field_c = null;
        field_b = null;
        field_g = null;
    }

    final static sa a(String param0, byte param1) {
        int var5 = 0;
        String var6 = null;
        sa var7 = null;
        int var8 = Chess.field_G;
        int var2 = param0.length();
        if (param1 < 75) {
            field_c = null;
        }
        if (!(var2 != 0)) {
            return ef.field_j;
        }
        if (!(255 >= var2)) {
            return ok.field_Ob;
        }
        String[] var3 = gl.a((byte) -118, '.', param0);
        if ((var3.length ^ -1) > -3) {
            return ef.field_j;
        }
        String[] var4 = var3;
        for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            var7 = ie.a(var6, (byte) -55);
            if (var7 != null) {
                return var7;
            }
        }
        return ib.a(var3[var3.length + -1], false);
    }

    final static void a(int param0) {
        if (!(ua.field_d == null)) {
            ua.field_d.k((byte) -112);
        }
        hn.field_u = new s();
        nj.field_w.c((mf) (Object) hn.field_u, 78);
        if (param0 <= 120) {
            field_a = null;
        }
    }

    oj(int param0, int param1, int param2) {
        ((oj) this).field_d = param1;
        ((oj) this).field_f = param0;
        ((oj) this).field_e = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Invalid date";
        field_a = "Username: ";
        field_b = "Game full";
    }
}
