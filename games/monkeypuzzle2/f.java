/*
 * Decompiled by CFR-JS 0.4.0.
 */
class f extends kc {
    private String field_k;
    private long field_h;
    static na field_g;
    static int[] field_j;
    static String field_f;
    static String field_e;
    static lk field_i;

    final static void a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        var2 = param0 * 16 / 50;
        var3 = 0;
        L0: while (true) {
          if ((var3 ^ -1) <= -301) {
            L1: {
              ge.b();
              if (param1 > 69) {
                break L1;
              } else {
                var7 = null;
                boolean discarded$1 = f.a(-43, (String) null);
                break L1;
              }
            }
            return;
          } else {
            if (var2 > sc.field_h[var3]) {
              var4 = var3 / 20;
              var5 = 32 * (var3 - var4 * 20);
              var4 = var4 * 32;
              ge.h(var5, var4, var5 + 32, var4 + 32);
              ke.field_i.a(0, 0);
              var3++;
              continue L0;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    final static boolean a(int param0, String param1) {
        if (param0 != -15189) {
            Object var3 = null;
            boolean discarded$0 = f.a(-28, (String) null);
        }
        CharSequence var4 = (CharSequence) (Object) param1;
        return uj.field_f.equals((Object) (Object) pl.a((byte) 104, var4));
    }

    fk a(boolean param0) {
        if (param0) {
            f.a(57, -11);
        }
        return sj.field_g;
    }

    public static void b(byte param0) {
        field_e = null;
        field_j = null;
        field_g = null;
        field_f = null;
        if (param0 != -77) {
            Object var2 = null;
            boolean discarded$0 = f.a(-123, (String) null);
        }
        field_i = null;
    }

    final static void a(int param0, int param1) {
        hb var2 = gf.field_c;
        var2.b(true, param0);
        if (param1 != 22492) {
            field_i = null;
        }
        var2.b(1, param1 + -71644);
        var2.b(2, param1 + -71644);
    }

    f(long param0, String param1) {
        ((f) this).field_h = param0;
        ((f) this).field_k = param1;
    }

    final void a(int param0, gk param1) {
        param1.a(((f) this).field_h, (byte) 117);
        int var3 = 37 / ((-34 - param0) / 53);
        param1.a(((f) this).field_k, (byte) 90);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new na();
        field_j = new int[]{5, 5, 3, 1, 2, 3, 3, 1, 2, 3};
        field_e = "Quit";
        field_f = "You are not currently logged in to the<nbsp>game.";
        field_i = new lk();
    }
}
