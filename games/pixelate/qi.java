/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi extends jj {
    private int field_m;
    private bb field_n;
    static String field_o;
    static boolean[] field_p;

    final static int a(int param0, int param1, int param2, boolean param3) {
        if (param0 != 6388) {
            return -3;
        }
        return jg.l(72);
    }

    public static void b(byte param0) {
        field_o = null;
        field_p = null;
        int var1 = 0;
    }

    final void a(boolean param0) {
        int var3 = 0;
        jn var4 = null;
        var3 = Pixelate.field_H ? 1 : 0;
        t.d(0, 0, 640, 480, 12632256);
        if (param0) {
          return;
        } else {
          var4 = (jn) (Object) ((qi) this).field_n.c(1504642273);
          L0: while (true) {
            if (var4 == null) {
              return;
            } else {
              int discarded$2 = 1183261192;
              sn.a(var4);
              var4 = (jn) (Object) ((qi) this).field_n.f(1504642273);
              continue L0;
            }
          }
        }
    }

    final void c(int param0) {
        int var3 = 0;
        int var4 = Pixelate.field_H ? 1 : 0;
        super.c(-1);
        jn var2 = (jn) (Object) ((qi) this).field_n.c(1504642273);
        while (var2 != null) {
            var2.field_l = var2.field_l + var2.field_s;
            var2.field_r = var2.field_r + var2.field_y;
            int fieldTemp$0 = var2.field_x + 1;
            var2.field_x = var2.field_x + 1;
            if (var2.field_w <= fieldTemp$0) {
                var2.field_x = 0;
                var3 = ii.c(5, (byte) -120);
                var2.field_n = var3 == var2.field_n ? 5 : var3;
                var2.field_k = Math.random() < 0.5 ? true : false;
            }
            if (!(var2.field_r <= 148480)) {
                var2.c(2779);
            }
            var2 = (jn) (Object) ((qi) this).field_n.f(param0 + 1504642274);
        }
        int fieldTemp$1 = ((qi) this).field_m - 1;
        ((qi) this).field_m = ((qi) this).field_m - 1;
        if (!(~fieldTemp$1 <= param0)) {
            ((qi) this).field_n.a(22125, (fa) (Object) new jn(od.a((byte) 41, 189440, -25600), -25600));
            ((qi) this).field_m = od.a((byte) 41, 75, 25);
        }
    }

    qi(String param0, tf[] param1) {
        super(param0, param1);
        int var3_int = 0;
        try {
            ((qi) this).field_n = new bb();
            for (var3_int = 0; 5 > var3_int; var3_int++) {
                ((qi) this).field_n.a(22125, (fa) (Object) new jn(od.a((byte) 41, 189440, -25600), od.a((byte) 41, 148480, -25600)));
            }
            ((qi) this).field_m = od.a((byte) 41, 75, 25);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "qi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "This game option has not yet been unlocked for use.";
        field_p = new boolean[]{false, false, true, true, true, true, true, true, true, true, true, false, true, true, true, true, false, true, false, false, false, false};
    }
}
