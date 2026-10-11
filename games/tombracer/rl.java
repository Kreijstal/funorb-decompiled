/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl extends pd {
    private wf field_x;
    static String field_s;
    static ka[] field_t;
    static String field_v;
    static boolean[][] field_u;
    static int field_w;

    rl(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        try {
          this.field_x = new wf(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "rl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int a(boolean param0) {
        if (param0) {
          kh var3 = (kh) null;
          this.a(false, (kh) null);
          return 7;
        }
        return 7;
    }

    final void g(byte param0) {
        if (param0 != 3) {
          return;
        }
        this.field_x = this.field_x.e(-1);
    }

    final void a(boolean param0, kh param1) {
        try {
          super.a(param0, param1);
          this.field_x.a(-29928, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "rl.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(boolean param0) {
        field_t = null;
        if (param0) {
          field_u = (boolean[][]) null;
          field_s = null;
          field_v = null;
          return;
        }
        field_v = (String) null;
        field_u = (boolean[][]) null;
        field_s = null;
        field_v = null;
    }

    final static int r(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = TombRacer.field_G ? 1 : 0;
        try {
          ej.field_a.a(gv.field_u, true, oi.field_b, -116);
          ej.field_a.g((byte) -127);
          while (es.a(true)) {
            ej.field_a.a((byte) 116, fna.field_h, kda.field_td);
          }
          if (bf.field_a != -1) {
            var1_int = bf.field_a;
            jsa.a(false, -1);
            stackIn_7_0 = var1_int;
            return stackIn_7_0;
          }
          if (nfa.field_p) {
            stackIn_11_0 = 3;
            return stackIn_11_0;
          }
          if (gsa.field_y == wt.field_d) {
            stackIn_14_0 = 1;
            return stackIn_14_0;
          }
          if (!gva.field_b.b(108)) {
            stackIn_18_0 = 1;
            return stackIn_18_0;
          }
          if (param0 > -87) {
            field_u = (boolean[][]) null;
          }
          if (gsa.field_y != kl.field_a) {
            stackIn_25_0 = -1;
            return stackIn_25_0;
          }
          stackIn_23_0 = 2;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "rl.U(" + param0 + ')');
        }
    }

    final boolean a(int param0, hca param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -114) {
            return false;
          }
          param1.a(this.field_x, (byte) 3);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("rl.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
        field_v = "Finish Order";
        field_s = "Portals";
        field_w = 0;
    }
}
