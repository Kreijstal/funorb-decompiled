/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class an {
    static boolean field_d;
    private eq field_e;
    private sj field_b;
    static int field_c;
    static String field_f;
    private sj field_a;

    final bg a(int param0, int param1) {
        byte[] var4 = null;
        bg var3 = (bg) (this.field_e.a((long)param1, (byte) 43));
        if (var3 != null) {
          return var3;
        }
        if (param1 >= 32768) {
          var4 = this.field_b.b(1, -32669, param1 & 32767);
        } else {
          var4 = this.field_a.b(1, -32669, param1);
        }
        var3 = new bg();
        if (var4 != null) {
          var3.a((byte) 126, new iw(var4));
        }
        int var5 = 37 % ((param0 - 83) / 36);
        if (32768 > param1) {
          this.field_e.a((long)param1, var3, (byte) -116);
          return var3;
        }
        var3.a(false);
        this.field_e.a((long)param1, var3, (byte) -116);
        return var3;
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 != 30297) {
          field_c = 42;
        }
    }

    an(int param0, sj param1, sj param2, fg param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_e = new eq(64);
        try {
          this.field_a = param1;
          this.field_b = param2;
          if (this.field_a != null) {
            this.field_a.a(true, 1);
          }
          if (null == this.field_b) {
            return;
          }
          this.field_b.a(true, 1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("an.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_f = "Your ignore list is full. Max of 100 hit.";
    }
}
