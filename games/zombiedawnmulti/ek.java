/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ek extends ff {
    int field_D;
    int field_C;
    static String field_y;
    int field_E;
    static ja field_J;
    static cj field_z;
    int field_x;
    int field_G;
    static String field_I;
    int field_B;
    static tq field_H;
    static long field_K;
    static String field_F;
    rl field_A;

    final static int a(boolean param0, int param1, String param2, int param3, String param4, String param5, int param6) {
        int var9 = -51 % ((param3 - -75) / 50);
        hf var7 = new hf(param5);
        hf var8 = new hf(param2);
        return mg.a(param0, var7, param6, var8, param4, param1, (byte) -92);
    }

    public static void f(byte param0) {
        field_J = null;
        field_F = null;
        if (param0 >= -63) {
          field_K = -50L;
          field_z = null;
          field_I = null;
          field_y = null;
          field_H = null;
          return;
        } else {
          field_z = null;
          field_I = null;
          field_y = null;
          field_H = null;
          return;
        }
    }

    final void d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var2 = ((ek) this).field_G >> -1148155624;
        var3 = ((ek) this).field_E >> 728831128;
        if (var2 == ((ek) this).field_C) {
          if (var3 != ((ek) this).field_B) {
            ((ek) this).field_C = var2;
            ((ek) this).field_B = var3;
            ((ek) this).field_A.a(-44, (ek) this);
            var4 = -126 % ((-59 - param0) / 46);
            return;
          } else {
            var4 = -126 % ((-59 - param0) / 46);
            return;
          }
        } else {
          ((ek) this).field_C = var2;
          ((ek) this).field_B = var3;
          ((ek) this).field_A.a(-44, (ek) this);
          var4 = -126 % ((-59 - param0) / 46);
          return;
        }
    }

    abstract void h(int param0);

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        me.field_h = param4;
        if (param2 != 1829947600) {
          field_z = null;
          nc.field_h = param0;
          se.field_C = param1;
          bf.field_g = param3;
          return;
        } else {
          nc.field_h = param0;
          se.field_C = param1;
          bf.field_g = param3;
          return;
        }
    }

    final int g(int param0) {
        Object var3 = null;
        if (param0 != 1829947600) {
          var3 = null;
          int discarded$2 = ek.a(false, -35, (String) null, -111, (String) null, (String) null, -17);
          return ((ek) this).field_E >> 1829947600;
        } else {
          return ((ek) this).field_E >> 1829947600;
        }
    }

    final static void i(int param0) {
        Object var2 = null;
        q.field_a = null;
        aa.field_n = null;
        ik.field_a = null;
        if (param0 < 45) {
          var2 = null;
          int discarded$2 = ek.a(false, 8, (String) null, -49, (String) null, (String) null, -19);
          bq.field_c = false;
          ud.field_N = null;
          return;
        } else {
          bq.field_c = false;
          ud.field_N = null;
          return;
        }
    }

    void a(int param0, rl param1) {
        ((ek) this).field_A = param1;
        ((ek) this).d((byte) -105);
        if (param0 != -9019) {
            field_J = null;
        }
    }

    final int e(byte param0) {
        if (param0 != -112) {
            ek.i(98);
            return ((ek) this).field_G >> 1307187664;
        }
        return ((ek) this).field_G >> 1307187664;
    }

    ek(int param0, int param1, int param2) {
        ((ek) this).field_C = -1;
        ((ek) this).field_G = param0 << 1588518416;
        ((ek) this).field_B = -1;
        ((ek) this).field_D = param2;
        ((ek) this).field_E = param1 << 8329232;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "<%0> would need a rating of <%1> to play with the current options.";
        field_I = "You have withdrawn your request to join.";
        field_F = "Speed";
    }
}
