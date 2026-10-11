/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg {
    private String field_e;
    static wk field_b;
    static ci field_a;
    static String field_d;
    private boolean field_c;

    final static void c(int param0) {
        ta.field_f = new wl();
        l.field_d.b(96, ta.field_f);
        if (param0 != 0) {
          hg.b(3);
        }
    }

    hg(String param0) {
        this(param0, false);
    }

    public static void b(byte param0) {
        int var1 = 103 / ((67 - param0) / 36);
        field_a = null;
        field_d = null;
        field_b = null;
    }

    final static int b(int param0) {
        if (param0 != 0) {
          return 124;
        }
        return pc.field_b;
    }

    final String a(boolean param0) {
        if (param0) {
          hg.a(60);
          return this.field_e;
        }
        return this.field_e;
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        sj var3 = null;
        RuntimeException decompiledCaughtException = null;
        var2 = Transmogrify.field_A ? 1 : 0;
        try {
          var3 = (sj) (ch.field_e.a((byte) -95));
          while (var3 != null) {
            var3.a((byte) 75);
            var3 = (sj) (ch.field_e.a(true));
          }
          if (param0 > 40) {
            return;
          }
          field_a = (ci) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1), "hg.E(" + param0 + ')');
        }
    }

    hg(String param0, boolean param1) {
        RuntimeException var3 = null;
        boolean stackIn_6_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_e = param0;
          if (this.field_e == null) {
            this.field_e = "";
          }
          stackIn_6_1 = (param1);
          this.field_c = stackIn_6_1;
          if (0 != this.field_e.length()) {
            return;
          }
          this.field_c = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("hg.<init>(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(byte param0) {
        if (param0 != -121) {
          return true;
        }
        return this.field_c;
    }

    static {
        field_d = "You have 1 unread message!";
        field_b = new wk();
    }
}
