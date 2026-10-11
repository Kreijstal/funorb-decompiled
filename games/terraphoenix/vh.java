/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vh extends uf {
    static String field_n;
    static bg[] field_k;
    static int[][] field_j;
    long field_m;
    vh field_i;
    static String field_l;
    vh field_o;
    static String field_h;

    final static boolean a(int param0, int param1, fa param2, boolean param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = param2.b(param0, -106, param1);
          var4 = var5;
          if (!param3) {
            field_n = (String) null;
          }
          if (var5 == null) {
            return false;
          }
          b.a(var5, (byte) -110);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_10_0 = var4_ref;
          stackIn_10_1 = new StringBuilder().append("vh.VA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(String param0, byte param1, float param2) {
        try {
          ad.field_e = param0;
          int var3_int = -44 % ((-15 - param1) / 53);
          ed.field_d = param2;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "vh.WA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void c(byte param0) {
        if (this.field_i == null) {
          return;
        }
        this.field_i.field_o = this.field_o;
        this.field_o.field_i = this.field_i;
        this.field_i = null;
        if (param0 == 13) {
          this.field_o = null;
          return;
        }
        this.field_m = 69L;
        this.field_o = null;
    }

    public static void a(int param0) {
        field_n = null;
        if (param0 == 7229) {
          field_j = (int[][]) null;
          field_k = null;
          field_l = null;
          field_h = null;
          return;
        }
        field_h = (String) null;
        field_j = (int[][]) null;
        field_k = null;
        field_l = null;
        field_h = null;
    }

    protected vh() {
    }

    static {
        field_n = "Soldier";
        field_h = "    Low Walls";
    }
}
