/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj extends gf implements fi, qg {
    wk field_n;
    static ak field_k;
    static ri field_p;
    static int field_m;
    static boolean field_l;
    static String field_o;

    public dj() {
    }

    public final void a(pm param0, boolean param1) {
        try {
          if (!param1) {
            this.field_n = (wk) null;
          }
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "dj.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void g(int param0) {
        if (param0 == -3) {
          field_o = null;
          field_k = null;
          field_p = null;
          return;
        }
        field_k = (ak) null;
        field_o = null;
        field_k = null;
        field_p = null;
    }

    public final boolean b(int param0) {
        if (param0 != -3) {
          return false;
        }
        return this.field_n.a(1872);
    }

    final re f(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        re stackIn_2_0 = null;
        re stackIn_6_0 = null;
        re stackIn_10_0 = null;
        Throwable decompiledCaughtException = null;
        try {
          var2_int = this.field_n.i(1);
          var3 = this.field_n.j(param0 - 191);
          var4 = this.field_n.g((byte) -118);
          var5 = oa.b((byte) -63);
          if (var4 < 1890) {
            stackIn_2_0 = jq.field_b;
            return stackIn_2_0;
          }
          if (var4 > var5 + param0) {
            stackIn_6_0 = jq.field_b;
            return stackIn_6_0;
          }
          if (!dq.a((byte) -82, var3, var2_int, var4)) {
            stackIn_10_0 = jq.field_b;
            return stackIn_10_0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return jq.field_b;
        }
        return db.field_b;
    }

    public final void a(pm param0, int param1) {
        if (param1 != 0) {
          return;
        }
        try {
          this.a(-1306);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "dj.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String e(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        Throwable decompiledCaughtException = null;
        if (param0 != -3) {
          this.e(-103);
        }
        try {
          var2_int = this.field_n.i(1);
          var3 = this.field_n.j(param0 - 191);
          var4 = this.field_n.g((byte) -86);
          var5 = oa.b((byte) -44);
          if (var4 >= 1890 &&
            var4 <= var5 - 3) {
            if (dq.a((byte) -65, var3, var2_int, var4)) {
              stackIn_9_0 = null;
              return (String) (stackIn_9_0);
            }
          } else {
            stackIn_6_0 = vl.a(ia.field_v, new String[]{"1890", Integer.toString(var5 - 3)}, 2);
            return stackIn_6_0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
        }
        return wm.field_T;
    }

    static {
        field_k = new ak();
        field_m = 4;
        field_o = "SCORE";
    }
}
