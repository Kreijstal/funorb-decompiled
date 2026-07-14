/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cp implements Runnable {
    static r field_h;
    static String field_a;
    static hd field_g;
    volatile boolean field_c;
    volatile boolean field_e;
    bu field_f;
    static long[] field_d;
    volatile uh[] field_b;

    final static wn a(int param0, String param1) {
        int var2 = 0;
        var2 = 16 / ((param0 - 46) / 47);
        if (mj.field_a != nr.field_f) {
          L0: {
            if (mj.field_a != cr.field_d) {
              break L0;
            } else {
              if (param1.equals((Object) (Object) pr.field_c)) {
                mj.field_a = vj.field_a;
                return u.field_h;
              } else {
                break L0;
              }
            }
          }
          mj.field_a = nr.field_f;
          pr.field_c = param1;
          u.field_h = null;
          return null;
        } else {
          return null;
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_h = null;
        field_g = null;
        int var1 = 20 % ((param0 - -1) / 41);
        field_a = null;
    }

    public final void run() {
        int var1_int = 0;
        uh var2 = null;
        int var4 = Kickabout.field_G;
        ((cp) this).field_c = true;
        try {
            while (!((cp) this).field_e) {
                for (var1_int = 0; (var1_int ^ -1) > -3; var1_int++) {
                    var2 = ((cp) this).field_b[var1_int];
                    if (var2 == null) {
                    } else {
                        var2.d();
                    }
                }
                aj.a(10L, 1);
                Object var5 = null;
                si.a((byte) 41, ((cp) this).field_f, (Object) null);
            }
        } catch (Exception exception) {
            Object var6 = null;
            bd.a((String) null, (Throwable) (Object) exception, 1);
        } finally {
            ((cp) this).field_c = false;
        }
    }

    final static int a(byte param0, int param1, int param2, int param3) {
        if (param0 != 21) {
            return 53;
        }
        int var4 = lw.field_c[param1];
        if (param2 == param3) {
            if (!(param1 != 3)) {
                var4 = 522;
            }
        }
        if (!(-1 != (param2 ^ -1))) {
            var4 = 1344 + -var4;
        }
        return var4;
    }

    final static int a(int param0) {
        al.field_Ab.a(0);
        if (!(gt.field_t.a((byte) -46))) {
            return fw.h((byte) 66);
        }
        if (param0 != 522) {
            field_h = null;
            return 0;
        }
        return 0;
    }

    cp() {
        ((cp) this).field_b = new uh[2];
        ((cp) this).field_e = false;
        ((cp) this).field_c = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "The Final has begun";
        field_d = new long[32];
        field_h = new r();
    }
}
