/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od extends lg {
    private byte[] field_w;
    static gk field_x;
    static String field_v;

    final static id a(String param0, int param1) {
        if (param1 < 55) {
            od.d((byte) 64);
            return new id(param0);
        }
        return new id(param0);
    }

    final static void a(int param0, byte param1, uk param2) {
        int var4 = 0;
        dl var5 = null;
        var5 = q.field_p;
        var5.g(71, param0);
        ((dl) var5).field_g = ((dl) var5).field_g + 1;
        if (param1 >= -43) {
          return;
        } else {
          var4 = ((dl) var5).field_g;
          var5.b(-1336879960, 1);
          var5.b(-1336879960, ((uk) param2).field_i);
          var5.b(true, ((uk) param2).field_m);
          var5.a((byte) 71, ((uk) param2).field_l);
          var5.a((byte) 59, ((uk) param2).field_h);
          var5.a((byte) 104, ((uk) param2).field_k);
          var5.a((byte) 24, ((uk) param2).field_n);
          int discarded$1 = var5.e(var4, 89);
          var5.b(-var4 + ((dl) var5).field_g, (byte) 117);
          return;
        }
    }

    final void b(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        var4 = 2 * param0;
        if (param1 != -1) {
          field_v = (String) null;
          var5 = param2 & 255;
          var4++;
          ((od) this).field_w[var4] = (byte)(var5 * 3 >> -959081435);
          ((od) this).field_w[var4] = (byte)(3 * var5 >> -1897066011);
          return;
        } else {
          var5 = param2 & 255;
          var4++;
          ((od) this).field_w[var4] = (byte)(var5 * 3 >> -959081435);
          ((od) this).field_w[var4] = (byte)(3 * var5 >> -1897066011);
          return;
        }
    }

    public static void d(byte param0) {
        field_v = null;
        field_x = null;
        if (param0 != -96) {
            String var2 = (String) null;
            id discarded$0 = od.a((String) null, -124);
        }
    }

    od() {
        super(8, 5, 8, 8, 2, 0.10000000149011612f, 0.550000011920929f, 3.0f);
    }

    final static String a(CharSequence[] param0, int param1) {
        if (param1 != 3) {
            return (String) null;
        }
        return gq.a(param0.length, param0, 21530, 0);
    }

    final byte[] a(int param0, int param1, int param2, int param3) {
        ((od) this).field_w = new byte[param2 * (param1 * param3 * 2)];
        ((od) this).a(true, param3, param1, param2);
        if (param0 != -959081435) {
          return (byte[]) null;
        } else {
          return ((od) this).field_w;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Highscores";
    }
}
