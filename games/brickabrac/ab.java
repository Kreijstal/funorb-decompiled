/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab extends ld {
    static int[][] field_C;
    static String field_z;
    static String[] field_y;
    static String field_F;
    static int field_E;
    static rk[][] field_A;
    static mh field_x;

    public static void f(byte param0) {
        field_z = null;
        field_A = null;
        field_C = null;
        field_x = null;
        int var1 = 55 / ((-70 - param0) / 41);
        field_F = null;
        field_y = null;
    }

    final void a(int param0, int param1, char param2) {
        if (param0 != -120) {
            Object var5 = null;
            boolean discarded$0 = ab.a((String) null, 111);
        }
        ((ab) this).field_h.a(0, -1);
    }

    final int f(int param0) {
        if (param0 != -6) {
            ab.f((byte) -118);
        }
        return 480;
    }

    final static boolean a(byte param0, String param1, String param2) {
        if (ab.a(param1, 0)) {
            return false;
        }
        if (!(!gp.a((byte) 54, param1))) {
            return false;
        }
        if (pp.a(param1, true)) {
            return false;
        }
        if (param0 >= -38) {
            return true;
        }
        if (!(param2.length() != 0)) {
            return true;
        }
        if (!(!q.a(param1, 0, param2))) {
            return false;
        }
        if (ll.a(param1, (byte) 122, param2)) {
            return false;
        }
        if (!ep.a(param1, (byte) 73, param2)) {
            return true;
        }
        return false;
    }

    ab() {
        super(20, lo.field_a);
    }

    final static boolean a(String param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = BrickABrac.field_J ? 1 : 0;
        var2 = param1;
        L0: while (true) {
          if (var2 >= param0.length()) {
            return false;
          } else {
            var3 = param0.charAt(var2);
            if (!ni.b(true, (char) var3)) {
              if (!eh.a((char) var3, (byte) 95)) {
                return true;
              } else {
                var2++;
                continue L0;
              }
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    final static id a(byte param0, long param1) {
        if (param0 != 96) {
            id discarded$0 = ab.a((byte) 62, 38L);
        }
        return (id) (Object) eq.field_m.a(param1, param0 ^ -97);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_z = "Add name";
        field_C = new int[5][256];
        field_y = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_F = "Weak: your ball will be unable to destroy any bricks.";
        var0 = 0;
        L0: while (true) {
          if (-6 >= (var0 ^ -1)) {
            field_C[0][104] = 16301244;
            field_C[0][97] = 16760767;
            field_C[0][95] = 15907000;
            field_C[1][95] = 11703759;
            field_C[1][104] = 12098263;
            field_C[1][97] = 12558303;
            field_C[2][104] = 10012328;
            field_C[2][95] = 9616800;
            field_C[2][97] = 10473381;
            field_C[3][95] = 13738423;
            field_C[3][97] = 15184843;
            field_C[3][104] = 14461633;
            field_C[4][95] = 12374409;
            field_C[4][104] = 12967056;
            field_C[4][97] = 13625239;
          } else {
            field_C[var0][240] = 15790320;
            field_C[var0][251] = 16382457;
            field_C[var0][255] = 16777215;
            var0++;
            continue L0;
          }
        }
    }
}
