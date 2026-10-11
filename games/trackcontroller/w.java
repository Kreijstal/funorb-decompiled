/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w extends wd implements m {
    private rh field_S;
    static int field_T;
    static double field_U;
    static ce field_V;

    public static void b(boolean param0) {
        if (!param0) {
          field_U = 0.7922077777637492;
          field_V = null;
          return;
        }
        field_V = null;
    }

    private final rh a(int param0, String param1, tg param2) {
        rh var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        rh stackIn_2_0 = null;
        rh stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 23879) {
            stackIn_2_0 = (rh) null;
            return stackIn_2_0;
          }
          var4 = new rh(param1, param2);
          var4.field_y = (t) ((Object) new dc());
          var5 = this.field_u - 6;
          this.field_u = this.field_u + 38;
          var4.a(30, -3050, var5, -30 + this.field_x, 15);
          this.a(false, var4);
          this.g(110);
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("w.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final void a(rh param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 != -27322) {
            return;
          }
          if (param0 != this.field_S) {
            return;
          }
          this.r(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("w.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    w(vl param0, mk param1) {
        super(param0, 200, 150);
        Object var3 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        al var4 = null;
        try {
          var3 = null;
          if (param1 == jf.field_l) {
            var3 = bf.field_c;
          } else {
            if (param1 != te.field_b) {
              if (param1 == ej.field_e) {
                this.field_u = this.field_u + 30;
                var3 = cg.field_e;
              }
            } else {
              var3 = fj.field_O;
              this.field_u = this.field_u + 10;
              if (rf.b(120)) {
                this.field_u = this.field_u + 20;
                var3 = nb.field_A;
              }
            }
          }
          var4 = new al((String) (var3), (tg) null);
          var4.field_m = 50;
          var4.field_x = this.field_x;
          var4.field_u = 80;
          var4.field_p = 0;
          var4.field_y = (t) ((Object) new ic(fk.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.a(false, var4);
          this.field_S = this.a(23879, me.field_k, (tg) (this));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("w.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sl.a((Throwable) (stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final void r(int param0) {
        if (!this.field_E) {
          return;
        }
        this.field_E = false;
        if (param0 != 0) {
          rh var3 = (rh) null;
          this.a((rh) null, -7, -55, -15, 33);
        }
    }

    static {
        field_U = 0.0;
    }
}
