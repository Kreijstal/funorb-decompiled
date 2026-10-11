/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei extends wl {
    static int field_t;
    int field_u;
    static String field_m;
    static String field_i;
    static o field_l;
    int field_p;
    int field_v;
    int field_s;
    static int field_k;
    int field_r;
    static o field_n;
    static boolean field_j;
    int[] field_q;
    int field_o;

    public static void a(int param0) {
        field_l = null;
        field_i = null;
        field_n = null;
        field_m = null;
        if (param0 == 1) {
          return;
        }
        ei.a((byte) 91, -43);
    }

    final void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.field_o = param1;
        this.field_v = param4;
        if (param5 != -24536) {
          return;
        }
        try {
          this.field_r = param2;
          this.field_s = param6;
          this.field_q = param0;
          this.field_u = param7;
          this.field_p = param3;
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "ei.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static o[] a(int param0, int param1, int param2, int param3, int param4) {
        o dupTemp$1 = null;
        o[] var6 = new o[9];
        o[] var5 = var6;
        o dupTemp$0 = id.a((byte) 107, param1, param3);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        if (param4 != 20230) {
          ei.a(-59);
          dupTemp$1 = id.a((byte) 76, param0, param3);
          var6[8] = dupTemp$1;
          var5[7] = dupTemp$1;
          var5[5] = dupTemp$1;
          if (param2 != 0) {
            var6[4] = id.a((byte) 98, param2, 64);
            return var5;
          }
          return var5;
        }
        o dupTemp$2 = id.a((byte) 76, param0, param3);
        var6[8] = dupTemp$2;
        var5[7] = dupTemp$2;
        var5[5] = dupTemp$2;
        if (param2 == 0) {
          return var5;
        }
        var6[4] = id.a((byte) 98, param2, 64);
        return var5;
    }

    final static void a(byte param0, int param1) {
        wl var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        pg var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = wizardrun.field_H;
        try {
          var4 = (pg) (sf.field_j.b((byte) 115));
          while (var4 != null) {
            pg.a(param1, true, var4);
            var4 = (pg) (sf.field_j.d(8192));
          }
          var2 = bk.field_d.b((byte) 96);
          while (var2 != null) {
            hg.a(param1, (byte) 106);
            var2 = bk.field_d.d(param0 + 8141);
          }
          if (param0 == 51) {
            return;
          }
          ei.a(122, 75, 31, 20, 79);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var2_ref), "ei.D(" + param0 + ',' + param1 + ')');
        }
    }

    ei() {
    }

    static {
        field_i = "Player";
        field_m = "Hold <%0> or SPACE";
        field_j = true;
    }
}
