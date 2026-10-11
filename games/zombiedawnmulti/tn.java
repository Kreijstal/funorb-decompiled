/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tn extends qc {
    static int field_z;
    int field_D;
    byte field_B;
    static th field_C;
    static tq field_A;
    k field_y;

    final static void a(boolean param0, int param1, java.awt.Canvas param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var3_int = 62 % ((43 - param1) / 53);
          if (fn.field_i < 10) {
            var4 = 0;
            if (cj.field_ub) {
              cj.field_ub = false;
              var4 = 1;
            }
            ip.a(tg.b(8218), af.field_b, var4 != 0, cj.g(18006), 34);
            return;
          }
          if (!gb.a(250)) {
            oo.b();
            eh.a(320, 240, 122);
            t.a(false, 0, param2, 0);
            return;
          }
          if (a.field_b != 0) {
            ra.a(param2, -113);
            return;
          }
          ec.a(false, param0, -126);
          t.a(false, 0, param2, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("tn.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final int f(int param0) {
        if (this.field_y == null) {
          return 0;
        }
        if (param0 == 100) {
          return 100 * this.field_y.field_j / (this.field_y.field_m.length - this.field_B);
        }
        java.awt.Canvas var3 = (java.awt.Canvas) null;
        tn.a(true, 113, (java.awt.Canvas) null);
        return 100 * this.field_y.field_j / (this.field_y.field_m.length - this.field_B);
    }

    public static void g(int param0) {
        field_A = null;
        if (param0 != 0) {
          field_C = (th) null;
          field_C = null;
          return;
        }
        field_C = null;
    }

    final byte[] e(int param0) {
        if (this.field_t) {
          throw new RuntimeException();
        }
        if (this.field_y.field_m.length - this.field_B > this.field_y.field_j) {
          throw new RuntimeException();
        }
        if (param0 == 0) {
          return this.field_y.field_m;
        }
        field_C = (th) null;
        return this.field_y.field_m;
    }

    final static boolean a(String param0, long param1, byte param2, int param3, int[] param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          boolean decompiledFrameRemainder0 = true;
          var6_int = -63 / ((param2 + 32) / 42);
          if (param4 != null && (2 != param3 ||
            pd.a(param1, param0, 2))) {
            stackIn_6_0 = true;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_6_0 = false;
          }
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("tn.L(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    tn() {
    }

    static {
        field_z = -1;
    }
}
