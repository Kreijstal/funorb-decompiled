/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sq {
    String field_c;
    int field_q;
    static boolean field_o;
    static String field_p;
    static String field_s;
    int field_j;
    String field_d;
    String[] field_m;
    sq field_l;
    int field_n;
    static String field_i;
    int field_t;
    lm[] field_f;
    boolean field_h;
    private String[] field_e;
    boolean field_r;
    static int field_a;
    int field_b;
    boolean field_k;
    String field_g;

    final static byte[] a(int param0, Object param1, boolean param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        le var5 = null;
        byte[] stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_15_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            return null;
          }
          if (param1 instanceof byte[]) {
            var3 = (byte[]) (param1);
            if (param2) {
              stackIn_9_0 = ck.a(var3, false);
              return stackIn_9_0;
            }
            stackIn_7_0 = var3;
            return stackIn_7_0;
          }
          if (param0 != -1) {
            var4 = (Object) null;
            sq.a(101, (Object) null, true);
          }
          if (!(param1 instanceof le)) {
            throw new IllegalArgumentException();
          }
          var5 = (le) (param1);
          stackIn_15_0 = var5.a(false);
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("sq.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0, String param1) {
        int var3_int = 0;
        String[] var4 = null;
        int var5 = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 != 30712) {
          return;
        }
        if (this.field_m == null) {
          this.field_m = new String[]{param1};
          return;
        }
        try {
          var3_int = this.field_m.length;
          var4 = new String[var3_int + 1];
          for (var5 = 0; var5 < var3_int; var5++) {
            var4[var5] = this.field_m[var5];
          }
          this.field_m = var4;
          this.field_m[var3_int] = param1;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "sq.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(String param0, byte param1) {
        int var5 = 0;
        int var3_int = 0;
        String[] var4 = null;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (null == this.field_e) {
            this.field_e = new String[]{param0};
            return;
          }
          var3_int = this.field_e.length;
          var4 = new String[1 + var3_int];
          for (var5 = 0; var5 < var3_int; var5++) {
            var4[var5] = this.field_e[var5];
          }
          this.field_e = var4;
          this.field_e[var3_int] = param0;
          if (param1 != -47) {
            var7 = (String) null;
            this.a(-110, (String) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("sq.C(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(byte param0, lm param1) {
        int var3_int = 0;
        lm[] var4 = null;
        int var5 = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 < 5) {
          return;
        }
        if (null == this.field_f) {
          this.field_f = new lm[]{param1};
          return;
        }
        try {
          var3_int = this.field_f.length;
          var4 = new lm[1 + var3_int];
          for (var5 = 0; var5 < var3_int; var5++) {
            var4[var5] = this.field_f[var5];
          }
          this.field_f = var4;
          this.field_f[var3_int] = param1;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "sq.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2) {
        sl var3 = js.field_f;
        var3.h(param1, 255);
        var3.c(3, (byte) -70);
        var3.c(8, (byte) -58);
        var3.d(param2, 255);
        if (param0 >= -18) {
          field_p = (String) null;
        }
    }

    final static boolean a(boolean param0) {
        if (param0) {
          return false;
        }
        return bh.field_j;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException decompiledCaughtException = null;
        wa var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        wa var9 = null;
        wa var10 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param0 < 0) {
            return;
          }
          if (gf.field_k <= param0) {
            return;
          }
          if (param5 != -27259) {
            field_i = (String) null;
          }
          if (param2 == 0) {
            return;
          }
          if (param3 == 0 &&
            0 == param1) {
            if (param6 == 0) {
              return;
            }
            param2 = 1;
          }
          var9 = bj.field_J[param0];
          var10 = var9;
          var7 = var10;
          if (var10 != null &&
            var10.field_g <= param4 && (param4 != var10.field_g ||
            !(var10.field_h < param2))) {
            while (null != var7.field_c) {
              if (!(param4 <= var7.field_c.field_g) ||
                param4 == var7.field_c.field_g &&
                !(param2 >= var7.field_c.field_h)) {
                var7 = var7.field_c;
                continue;
              }
              break;
            }
            var7.field_c = wi.a(param1, param6, var7.field_c, param3, param2, param4, -3903);
            return;
          }
          bj.field_J[param0] = wi.a(param1, param6, var9, param3, param2, param4, -3903);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var7_ref), "sq.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public static void a(byte param0) {
        field_s = null;
        field_p = null;
        if (param0 < 126) {
          sq.a(-28, 66, 76);
        }
        field_i = null;
    }

    sq() {
        this.field_c = "";
        this.field_g = null;
    }

    static {
        field_s = "Allow spectators?";
        field_p = "<%0> fewer ships per turn";
        field_i = "Decline invitation to <%0>'s game";
    }
}
