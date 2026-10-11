/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class drb extends le {
    static int field_j;
    static String field_k;
    private int field_i;

    public static void e(byte param0) {
        field_k = null;
        if (param0 > -80) {
          field_k = (String) null;
        }
    }

    final static kob a(boolean param0, int param1) {
        kob var2 = new kob();
        if (param0) {
          cnb.field_q.b(-10258, var2);
          wva.b(param1, 22681);
          return var2;
        }
        return (kob) null;
    }

    final int[] a(int param0, boolean param1) {
        if (!param1) {
          return (int[]) null;
        }
        int[] var4 = this.field_f.a((byte) 117, param0);
        int[] var3 = var4;
        if (!this.field_f.field_e) {
          return var4;
        }
        cua.a(var4, 0, hob.field_d, this.field_i);
        return var4;
    }

    private drb(int param0) {
        super(0, true);
        this.field_i = 4096;
        this.field_i = param0;
    }

    public drb() {
        this(4096);
    }

    final void a(int param0, int param1, ds param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -60) {
            drb.e((byte) 48);
          }
          var4_int = param0;
          if (0 != var4_int) {
            return;
          }
          this.field_i = (param2.e((byte) -115) << 12) / 255;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("drb.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    static {
        field_j = 0;
        field_k = "Loading graphics";
    }
}
