/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua extends ig {
    static int field_v;
    private boolean field_q;
    static dd field_u;
    static String field_m;
    static dd field_r;
    static int[] field_t;
    static int field_o;
    static String field_n;
    private String field_p;
    static String field_s;

    final String a(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        wc var4 = null;
        CharSequence var5 = null;
        String stackIn_2_0 = null;
        Object stackIn_11_0 = null;
        String stackIn_15_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = (CharSequence) ((Object) param0);
          var3 = pk.a(var5, param1 - 89);
          if (var3 != null) {
            stackIn_2_0 = var3;
            return stackIn_2_0;
          }
          if (param1 != 0) {
            field_u = (dd) null;
          }
          if (!param0.equals(this.field_p)) {
            var4 = sm.a(param0, 118);
            if (var4 == null) {
              return null;
            }
            if (var4.field_b != null) {
              stackIn_11_0 = null;
              return (String) (stackIn_11_0);
            }
            this.field_p = param0;
            this.field_q = var4.field_f;
          }
          if (this.field_q) {
            stackIn_17_0 = lb.field_M;
            return stackIn_17_0;
          }
          stackIn_15_0 = gi.field_n;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("ua.L(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    final na a(String param0, boolean param1) {
        wc var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        na stackIn_2_0 = null;
        na stackIn_5_0 = null;
        na stackIn_11_0 = null;
        na stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param0);
          if (!qi.a((byte) -64, var4)) {
            stackIn_2_0 = gp.field_d;
            return stackIn_2_0;
          }
          if (!param1) {
            stackIn_5_0 = (na) null;
            return stackIn_5_0;
          }
          if (!param0.equals(this.field_p)) {
            var3 = sm.a(param0, -51);
            if (var3 != null &&
              var3.field_b == null) {
              this.field_p = param0;
              this.field_q = var3.field_f;
            } else {
              stackIn_11_0 = no.field_k;
              return stackIn_11_0;
            }
          }
          if (this.field_q) {
            stackIn_16_0 = kr.field_e;
          } else {
            stackIn_16_0 = gp.field_d;
          }
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("ua.K(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    ua(sl param0) {
        super(param0);
        this.field_q = false;
    }

    final void i(int param0) {
        if (param0 != 18) {
          return;
        }
        this.field_p = null;
    }

    public static void h(int param0) {
        field_m = null;
        field_r = null;
        field_u = null;
        if (param0 < -51) {
          field_n = null;
          field_t = null;
          field_s = null;
          return;
        }
        field_m = (String) null;
        field_n = null;
        field_t = null;
        field_s = null;
    }

    final static void b(boolean param0) {
        if (!param0) {
          field_s = (String) null;
          if (oh.field_h) {
            kh.field_Vb.a((byte) -79, false);
            return;
          }
          return;
        }
        if (!oh.field_h) {
          return;
        }
        kh.field_Vb.a((byte) -79, false);
    }

    static {
        field_m = "Clan";
        field_v = 0;
        field_t = new int[]{17, 18, 8};
        field_n = "Chat";
        field_o = 0;
        field_s = "Start Game";
    }
}
