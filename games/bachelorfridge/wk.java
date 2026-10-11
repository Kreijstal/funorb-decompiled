/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk {
    private pha field_d;
    static int field_g;
    private vr field_c;
    static int field_f;
    static String field_e;
    static boolean field_b;
    static int field_a;
    static String field_i;
    private vr field_h;

    public static void a(int param0) {
        if (param0 >= -8) {
          field_a = -25;
          field_e = null;
          field_i = null;
          return;
        }
        field_e = null;
        field_i = null;
    }

    final static String a(boolean param0) {
        if (kq.field_j == ola.field_p) {
          return wj.field_i;
        }
        if (!param0) {
          wk.a(44);
          return lb.field_w;
        }
        return lb.field_w;
    }

    final pda a(int param0, int param1) {
        pda var3;
        byte[] var4;
        pda var3Lifetime1;
        var3 = (pda) (this.field_d.a(122, (long)param1));
        if (var3 != null) {
          return var3;
        }
        if (param1 >= 32768) {
          var4 = this.field_h.b(-96, 1, param1 & 32767);
        } else {
          var4 = this.field_c.b(-110, 1, param1);
        }
        if (param0 != -22834) {
          return (pda) null;
        }
        var3Lifetime1 = new pda();
        if (var4 != null) {
          var3Lifetime1.a(new lu(var4), (byte) 109);
        }
        if (32768 <= param1) {
          var3Lifetime1.b(true);
        }
        this.field_d.a((long)param1, 1, var3Lifetime1);
        return var3Lifetime1;
    }

    wk(int param0, vr param1, vr param2, so param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_d = new pha(64);
        try {
          this.field_h = param2;
          this.field_c = param1;
          if (null != this.field_c) {
            this.field_c.d(1, 0);
          }
          if (null == this.field_h) {
            return;
          }
          this.field_h.d(1, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("wk.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_g = 0;
        field_e = "Searching for opponents";
        field_i = "Return to game";
    }
}
