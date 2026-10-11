/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki extends ek {
    private int field_q;
    private int field_s;
    private int field_p;
    private kc[] field_r;

    public ki() {
        this(2188450, 2591221, 9543);
    }

    final static void a(int param0, byte param1, int param2, int param3) {
        if (param1 < -86) {
          wg.field_a = param0;
          af.field_jb = param3;
          ca.field_b = param2;
          return;
        }
        ki.a(118, (byte) 95, 42, -10);
        wg.field_a = param0;
        af.field_jb = param3;
        ca.field_b = param2;
    }

    public final void a(int param0, lk param1, int param2, int param3, boolean param4) {
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        lk var9 = null;
        try {
          if (!param1.field_j) {
            stackIn_6_0 = (param1.d(121)) ? 1 : 0;
          } else {
            stackIn_6_0 = 1;
          }
          var6_int = stackIn_6_0;
          if (param1 instanceof hl) {
            param4 = param4 & ((hl) (param1)).field_B;
          }
          if (!param4) {
            stackIn_13_0 = this.field_s;
          } else {
            if (var6_int == 0) {
              stackIn_13_0 = this.field_p;
            } else {
              stackIn_13_0 = this.field_q;
            }
          }
          var7 = stackIn_13_0;
          if (param2 != 11447) {
            var9 = (lk) null;
            this.a(103, (lk) null, -110, -12, false);
          }
          ge.a(param1.field_h, this.field_r, var7, param1.field_o + param0, (-this.field_r[0].field_k + param1.field_q >> 1) + param3 + param1.field_i, (byte) -10);
          stackIn_18_0 = (param4) ? 16777215 : 7105644;
          var8 = stackIn_18_0;
          this.field_c.a(param1.field_r, param1.field_o + param0, -2 + (param3 + param1.field_i), param1.field_h, param1.field_q, var8, -1, 1, 1, this.field_c.field_s);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("ki.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private ki(int param0, int param1, int param2) {
        this.field_s = param2;
        this.field_p = param0;
        this.field_c = vd.field_p;
        this.field_q = param1;
        this.field_r = eg.field_c;
    }

    static {
    }
}
