/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vva extends bob {
    static llb field_r;
    private int field_s;
    private int field_p;
    static byte[] field_u;
    private int field_t;
    private phb[] field_q;

    public final void a(int param0, shb param1, int param2, int param3, boolean param4) {
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        try {
          var7 = 112 / ((param0 + 27) / 35);
          if (!param1.field_e) {
            stackIn_6_0 = (param1.e((byte) -120)) ? 1 : 0;
          } else {
            stackIn_6_0 = 1;
          }
          var6_int = stackIn_6_0;
          if (param1 instanceof htb) {
            param4 = param4 & ((htb) (param1)).field_x;
          }
          if (!param4) {
            stackIn_14_0 = this.field_p;
          } else {
            if (var6_int != 0) {
              stackIn_14_0 = this.field_t;
            } else {
              stackIn_14_0 = this.field_s;
            }
          }
          var8 = stackIn_14_0;
          qt.a(this.field_q, var8, param1.field_r + (param3 + (-this.field_q[0].field_n + param1.field_f >> 1)), param1.field_h, param2 + param1.field_g, true);
          stackIn_17_0 = (!param4) ? 7105644 : 16777215;
          var9 = stackIn_17_0;
          this.field_d.a(param1.field_j, param2 + param1.field_g, param1.field_r + param3 - 2, param1.field_h, param1.field_f, var9, -1, 1, 1, this.field_d.field_k);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_21_0 = var6;
          stackIn_21_1 = new StringBuilder().append("vva.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public vva() {
        this(2188450, 2591221, 9543);
    }

    public static void a(byte param0) {
        if (param0 != 121) {
          return;
        }
        field_r = null;
        field_u = null;
    }

    private vva(int param0, int param1, int param2) {
        this.field_s = param0;
        this.field_q = eia.field_o;
        this.field_p = param2;
        this.field_d = vob.field_r;
        this.field_t = param1;
    }

    static {
    }
}
