/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tp extends un {
    static String field_u;
    static java.math.BigInteger field_v;
    private boolean field_q;
    private String field_r;
    static int field_s;
    static int[] field_t;

    public static void h(int param0) {
        field_u = null;
        field_t = null;
        if (param0 != 66) {
          tp.h(102);
          field_v = null;
          return;
        }
        field_v = null;
    }

    final re a(boolean param0, String param1) {
        gh var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        CharSequence var5 = null;
        re stackIn_2_0 = null;
        re stackIn_9_0 = null;
        re stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = (CharSequence) ((Object) param1);
          if (!sj.a(var5, 12319)) {
            stackIn_2_0 = jq.field_b;
            return stackIn_2_0;
          }
          if (!param1.equals(this.field_r)) {
            var3 = ed.a((byte) 127, param1);
            if (var3 != null &&
              null == var3.field_h) {
              this.field_r = param1;
              this.field_q = var3.field_d;
            } else {
              stackIn_9_0 = ua.field_I;
              return stackIn_9_0;
            }
          }
          if (param0) {
            var4 = (String) null;
            this.a((String) null, 126);
          }
          if (this.field_q) {
            stackIn_16_0 = db.field_b;
          } else {
            stackIn_16_0 = jq.field_b;
          }
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("tp.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final String a(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        gh var4 = null;
        String var5 = null;
        CharSequence var6 = null;
        String stackIn_3_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = (CharSequence) ((Object) param0);
          var3 = vk.a(param1 ^ -1276425052, var6);
          if (var3 != null) {
            stackIn_3_0 = var3;
            return stackIn_3_0;
          }
          if (param1 != -1276425040) {
            var5 = (String) null;
            this.a(true, (String) null);
          }
          if (!param0.equals(this.field_r)) {
            var4 = ed.a((byte) 127, param0);
            if (var4 == null) {
              return null;
            }
            if (null != var4.field_h) {
              return null;
            }
            this.field_q = var4.field_d;
            this.field_r = param0;
          }
          if (this.field_q) {
            return ba.field_j;
          }
          stackIn_17_0 = wg.field_d;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("tp.C(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    tp(pm param0) {
        super(param0);
        this.field_q = false;
    }

    final void i(int param0) {
        if (param0 != -22837) {
          tp.h(-36);
          this.field_r = null;
          return;
        }
        this.field_r = null;
    }

    static {
        field_u = "This trait will make your powerups last even longer than Expert. Equip both for an extra bonus!";
        field_v = new java.math.BigInteger("65537");
        field_s = 66;
    }
}
