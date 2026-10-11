/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd extends di {
    static String field_m;
    private boolean field_n;
    static String field_r;
    static volatile boolean field_q;
    static cb field_p;
    private ni field_t;
    static int field_s;
    private String field_u;
    static int field_o;

    hd(lb param0, lb param1) {
        super(param0);
        this.field_n = false;
        this.field_u = "";
        try {
          this.field_t = new ni(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "hd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0, char param1) {
        if (param0 >= -112) {
          field_q = true;
          if (param1 < 48) {
            return false;
          }
          if (param1 <= 57) {
            return true;
          }
          return false;
        }
        if (param1 < 48) {
          return false;
        }
        if (param1 <= 57) {
          return true;
        }
        return false;
    }

    final String a(String param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_t.a(-116, param0) == ef.field_b) {
            stackIn_2_0 = this.field_t.a(param0, 426);
            return stackIn_2_0;
          }
          if (this.a(-108, param0) == ef.field_b) {
            stackIn_5_0 = wd.field_H;
            return stackIn_5_0;
          }
          if (param1 != 426) {
            this.field_u = (String) null;
          }
          stackIn_9_0 = hf.field_a;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("hd.B(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void d(byte param0) {
        if (param0 == 69) {
          field_r = null;
          field_m = null;
          field_p = null;
          return;
        }
        hd.d((byte) -97);
        field_r = null;
        field_m = null;
        field_p = null;
    }

    final ud a(int param0, String param1) {
        j var3 = null;
        RuntimeException var3_ref = null;
        ud stackIn_2_0 = null;
        ud stackIn_6_0 = null;
        ud stackIn_12_0 = null;
        ud stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -106) {
            stackIn_2_0 = (ud) null;
            return stackIn_2_0;
          }
          if (this.field_t.a(-112, param1) == ef.field_b) {
            stackIn_6_0 = ef.field_b;
            return stackIn_6_0;
          }
          if (!param1.equals(this.field_u)) {
            var3 = ca.a(param1, 647);
            if (!var3.b((byte) 79)) {
              stackIn_12_0 = tk.field_t;
              return stackIn_12_0;
            }
            this.field_u = param1;
            this.field_n = var3.c((byte) -100);
          }
          if (this.field_n) {
            stackIn_17_0 = TrackController.field_G;
          } else {
            stackIn_17_0 = ef.field_b;
          }
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("hd.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    static {
        field_q = false;
        field_r = "Sound: ";
        field_m = "Continue";
        field_p = new cb();
    }
}
