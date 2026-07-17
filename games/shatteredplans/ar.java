/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ar {
    static String field_o;
    static int field_i;
    static String field_r;
    db field_h;
    static String field_g;
    static String field_e;
    static int field_b;
    db field_j;
    db field_m;
    db field_f;
    int field_n;
    ob field_c;
    long field_k;
    volatile int field_a;
    ob field_q;
    byte field_d;
    volatile int field_p;
    tk field_l;

    abstract void b(byte param0);

    abstract void e(int param0);

    final int a(byte param0) {
        if (param0 != 0) {
          boolean discarded$2 = ((ar) this).c(-35);
          return ((ar) this).field_h.c((byte) 123) - -((ar) this).field_j.c((byte) 83);
        } else {
          return ((ar) this).field_h.c((byte) 123) - -((ar) this).field_j.c((byte) 83);
        }
    }

    abstract void a(byte param0, boolean param1, Object param2);

    final int b(int param0) {
        if (param0 != -5205) {
            return -48;
        }
        return ((ar) this).field_m.c((byte) -111) + ((ar) this).field_f.c((byte) -109);
    }

    abstract boolean d(int param0);

    final boolean c(byte param0) {
        int var2 = -70 % ((47 - param0) / 56);
        return ((ar) this).b(-5205) >= 20 ? true : false;
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        int var6 = 0;
        if ((Math.abs(param1) | Math.abs(param4) | Math.abs(param0) | Math.abs(param2)) >>> 19 == 0) {
          var6 = -104 % ((-50 - param3) / 36);
          if (Math.abs(param0 - param1) < Math.abs(param2 + -param4)) {
            in.a(param5, param4, 80, param2, param1, param0);
            return;
          } else {
            kr.a(param2, (byte) -55, param1, param0, param5, param4);
            return;
          }
        } else {
          return;
        }
    }

    final tk a(boolean param0, int param1, byte param2, int param3, int param4) {
        long var6 = ((long)param1 << 32) - -(long)param4;
        tk var8 = new tk();
        var8.field_w = param2;
        var8.field_q = param0 ? true : false;
        var8.field_l = var6;
        if (param3 != -2057056416) {
            boolean discarded$9 = ((ar) this).c(-16);
            if (param0) {
                if (!(((ar) this).a((byte) 0) < 20)) {
                    throw new RuntimeException();
                }
                ((ar) this).field_h.a((df) (Object) var8, 32);
            } else {
                if (!(((ar) this).b(-5205) < 20)) {
                    throw new RuntimeException();
                }
                ((ar) this).field_m.a((df) (Object) var8, 32);
            }
            return var8;
        }
        if (param0) {
            if (!(((ar) this).a((byte) 0) < 20)) {
                throw new RuntimeException();
            }
            ((ar) this).field_h.a((df) (Object) var8, 32);
        } else {
            if (!(((ar) this).b(-5205) < 20)) {
                throw new RuntimeException();
            }
            ((ar) this).field_m.a((df) (Object) var8, 32);
        }
        return var8;
    }

    final boolean c(int param0) {
        if (param0 != 27356) {
            return false;
        }
        return ((ar) this).a((byte) 0) >= 20 ? true : false;
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 != 16967) {
          ar.a(-27);
          field_e = null;
          field_r = null;
          field_o = null;
          return;
        } else {
          field_e = null;
          field_r = null;
          field_o = null;
          return;
        }
    }

    ar() {
        ((ar) this).field_h = new db();
        ((ar) this).field_j = new db();
        ((ar) this).field_m = new db();
        ((ar) this).field_f = new db();
        ((ar) this).field_c = new ob(6);
        ((ar) this).field_a = 0;
        ((ar) this).field_d = (byte) 0;
        ((ar) this).field_p = 0;
        ((ar) this).field_q = new ob(10);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "<%PROJECT_EXOTICS> - (<%Resource3>) The <%Project_Exotics> creates a <%highlight>temporary wormhole between two systems</col>. This behaves as a normal <%glossary>wormhole</col> for a three-turn duration. One end must be anchored in a friendly <%glossary>system</col>, but the other end can be placed anywhere else on the map.";
        field_r = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_g = "Resign";
        field_e = "This game option has not yet been unlocked for use.";
        field_b = -1;
    }
}
