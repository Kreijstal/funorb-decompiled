/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wm {
    boolean field_s;
    boolean field_l;
    int field_p;
    byte field_k;
    byte field_g;
    boolean field_o;
    byte field_c;
    short field_e;
    byte field_u;
    boolean field_n;
    int field_h;
    boolean field_i;
    boolean field_b;
    byte field_j;
    static boolean[] field_f;
    byte field_t;
    boolean field_m;
    byte field_d;
    boolean field_r;
    static hr field_a;
    int field_q;

    final static void a(int param0, int param1, int param2, int param3, int[] param4) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        if (param0 == -1) {
          param3--;
          L0: while (true) {
            if ((param3 ^ -1) <= -1) {
              var9 = param4;
              var5 = var9;
              var6 = param1;
              var7 = param2;
              var9[var6] = eb.a(8355711, var9[var6] >> -816598271) + var7;
              param1++;
              param3--;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          field_a = null;
          param3--;
          L1: while (true) {
            if ((param3 ^ -1) <= -1) {
              var9 = param4;
              var5 = var9;
              var6 = param1;
              var7 = param2;
              var9[var6] = eb.a(8355711, var9[var6] >> -816598271) + var7;
              param1++;
              param3--;
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    final static void a(boolean param0, int param1) {
        ms var2 = null;
        int var3 = 0;
        Object var4 = null;
        db var5 = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        var5 = (db) (Object) jj.field_a.b(72);
        L0: while (true) {
          if (var5 == null) {
            var2 = no.field_d.b(-87);
            L1: while (true) {
              if (var2 == null) {
                if (!param0) {
                  return;
                } else {
                  var4 = null;
                  wm.a(-1, 109, 92, -119, (int[]) null);
                  return;
                }
              } else {
                jg.b(11044, param1);
                var2 = no.field_d.d((byte) 18);
                continue L1;
              }
            }
          } else {
            mn.a(var5, -112, param1);
            var5 = (db) (Object) jj.field_a.d((byte) 18);
            continue L0;
          }
        }
    }

    public static void a(boolean param0) {
        field_f = null;
        field_a = null;
        if (param0) {
            return;
        }
        field_f = null;
    }

    private wm() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new boolean[25];
    }
}
