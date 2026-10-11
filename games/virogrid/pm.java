/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pm extends l {
    static String field_i;
    static String field_s;
    int field_h;
    static long field_o;
    static lc field_q;
    static String field_g;
    int field_r;
    int field_m;
    static me field_l;
    static km field_n;
    static int field_k;
    static byte[] field_p;
    static e field_j;

    final static v a(int param0, byte[] param1) {
        v var2 = null;
        RuntimeException var2_ref = null;
        eh var3 = null;
        v stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -9618) {
            var3 = (eh) null;
            pm.a((eh) null, -49);
          }
          if (param1 == null) {
            return null;
          }
          var2 = new v(param1, el.field_w, mb.field_bb, db.field_k, gb.field_F, lj.field_j);
          pe.b((byte) -28);
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("pm.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_s = null;
        if (param0 == 0) {
          field_q = null;
          field_g = null;
          field_l = null;
          field_p = null;
          field_i = null;
          field_j = null;
          field_n = null;
          return;
        }
        eh var2 = (eh) null;
        pm.a((eh) null, -125);
        field_q = null;
        field_g = null;
        field_l = null;
        field_p = null;
        field_i = null;
        field_j = null;
        field_n = null;
    }

    final static void a(eh param0, int param1) {
        int var5_int = 0;
        int var3 = 0;
        int var4 = 0;
        wm var5 = null;
        int[] var6 = null;
        int var7 = 0;
        hg var8 = null;
        int var9 = 0;
        hg var10 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4Lifetime1;
        var7 = Virogrid.field_F ? 1 : 0;
        try {
          var8 = new hg(param0.a("logo.fo3d", 100, ""));
          var10 = var8;
          var3 = var10.g(11132);
          var10.j(8);
          td.field_e = fj.a(var10, 9);
          ph.field_n = new wm[var3];
          kh.field_f = new int[var3][];
          var4 = -94 / ((9 - param1) / 56);
          for (var5_int = 0; var3 > var5_int; var5_int++) {
            ph.field_n[var5_int] = qn.a(var8, 13472);
          }
          var10.k(7);
          var9 = 0;
          var4Lifetime1 = var9;
          while (var3 > var9) {
            var5 = ph.field_n[var9];
            var5.a(false, 6, 1, 6, 6);
            var5.b((byte) 126);
            var6 = new int[]{var5.field_C + var5.field_U >> 1, var5.field_T + var5.field_g >> 1, var5.field_p + var5.field_L >> 1};
            kh.field_f[var9] = var6;
            var5.a(-var6[1], -var6[0], -var6[2], (byte) 112);
            var9++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("pm.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    pm(int param0, int param1, int param2) {
        this.field_m = param0;
        this.field_r = param2;
        this.field_h = param1;
    }

    static {
        field_i = "Invite more players, or alternatively try changing the '<%0>' setting.";
        field_s = "Buying or selling an account";
        field_q = new lc(0, 2, 2, 1);
        mg discarded$0 = new mg(0, 0);
        field_l = new me();
    }
}
