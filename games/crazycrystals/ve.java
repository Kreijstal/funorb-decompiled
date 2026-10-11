/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve extends lb {
    private int field_r;
    static boolean field_t;
    private int field_s;
    private int field_q;
    private dl[] field_u;

    final static dh a(int param0, db param1, int param2, db param3, int param4) {
        RuntimeException var5 = null;
        dh stackIn_5_0 = null;
        dh stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!gm.a(param1, param2, true, param4)) {
            return null;
          }
          if (param0 >= 53) {
            stackIn_7_0 = dq.a(-18289, param3.b(param2, 0, param4));
            return stackIn_7_0;
          }
          stackIn_5_0 = (dh) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("ve.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param4).append(')').toString());
        }
    }

    public final void a(int param0, boolean param1, int param2, qm param3, boolean param4) {
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          if (!param3.field_m) {
            stackIn_6_0 = (param3.e(-109)) ? 1 : 0;
          } else {
            stackIn_6_0 = 1;
          }
          var6_int = stackIn_6_0;
          if (param3 instanceof pc) {
            param4 = param4 & ((pc) (param3)).field_x;
          }
          if (!param4) {
            stackIn_14_0 = this.field_q;
          } else {
            if (var6_int != 0) {
              stackIn_14_0 = this.field_r;
            } else {
              stackIn_14_0 = this.field_s;
            }
          }
          var7 = stackIn_14_0;
          tm.a(param3.field_r + param2, var7, param3.field_j + (param0 + (param3.field_f - this.field_u[0].field_o >> 1)), this.field_u, param3.field_g, (byte) 89);
          stackIn_17_0 = (param4) ? 16777215 : 7105644;
          var8 = stackIn_17_0;
          this.field_p.a(param3.field_o, param3.field_r + param2, param0 + (param3.field_j - 2), param3.field_g, param3.field_f, var8, -1, 1, 1, this.field_p.field_o);
          if (!param1) {
            return;
          }
          field_t = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("ve.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param4).append(')').toString());
        }
    }

    public ve() {
        this(2188450, 2591221, 9543);
    }

    private ve(int param0, int param1, int param2) {
        this.field_s = param0;
        this.field_u = sb.field_B;
        this.field_r = param1;
        this.field_p = mo.field_m;
        this.field_q = param2;
    }

    static {
        field_t = true;
    }
}
