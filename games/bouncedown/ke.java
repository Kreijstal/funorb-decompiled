/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke extends ai {
    static String field_l;
    int field_j;
    static boolean field_p;
    int field_o;
    static String field_m;
    int field_h;
    int field_k;
    int field_i;
    static String field_n;
    int field_g;

    final static void a(java.awt.Canvas param0, boolean param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Bounce.field_N;
        try {
          if (!param2) {
            return;
          }
          if (10 > sa.field_k) {
            var3_int = 0;
            if (ae.field_b) {
              ae.field_b = false;
              var3_int = 1;
            }
            ai.a(var3_int != 0, da.field_d, -24, mj.b((byte) -26), jk.a((byte) -105));
            return;
          }
          if (!tk.c(250)) {
            na.a();
            pc.a(240, (byte) -66, 320);
            qi.a(param0, 0, 0, -25971);
            return;
          }
          if (mh.field_U != 0) {
            i.a(param0, 0);
            return;
          }
          of.a(false, param1, (byte) -48);
          qi.a(param0, 0, 0, -25971);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("ke.C(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static int a(int param0, int param1) {
        param0--;
        if (param1 == 24636) {
          param0 = param0 | param0 >>> 1;
          param0 = param0 | param0 >>> 2;
          param0 = param0 | param0 >>> 4;
          param0 = param0 | param0 >>> 8;
          param0 = param0 | param0 >>> 16;
          return param0 + 1;
        }
        java.awt.Canvas var3 = (java.awt.Canvas) null;
        ke.a((java.awt.Canvas) null, false, false);
        param0 = param0 | param0 >>> 1;
        param0 = param0 | param0 >>> 2;
        param0 = param0 | param0 >>> 4;
        param0 = param0 | param0 >>> 8;
        param0 = param0 | param0 >>> 16;
        return param0 + 1;
    }

    public static void a(int param0) {
        if (param0 == -196) {
          field_m = null;
          field_l = null;
          field_n = null;
          return;
        }
        java.awt.Canvas var2 = (java.awt.Canvas) null;
        ke.a((java.awt.Canvas) null, true, false);
        field_m = null;
        field_l = null;
        field_n = null;
    }

    ke(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_k = param3;
        this.field_j = param4;
        this.field_g = param0;
        this.field_i = param1;
        this.field_h = param2;
        this.field_o = param5;
    }

    static {
        field_l = "Please check if address is correct";
        field_n = "Waiting for music";
    }
}
