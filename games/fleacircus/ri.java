/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri extends e {
    static String field_q;
    static String field_u;
    static ni field_x;
    private int field_w;
    static String field_s;
    private int field_v;
    private dd[] field_t;
    private int field_y;
    static String field_r;

    public ri() {
        this(2188450, 2591221, 9543);
    }

    public final void a(int param0, int param1, boolean param2, qa param3, int param4) {
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          if (param0 >= -36) {
            return;
          }
          if (!param3.field_x) {
            stackIn_8_0 = (param3.e(1)) ? 1 : 0;
          } else {
            stackIn_8_0 = 1;
          }
          var6_int = stackIn_8_0;
          if (param3 instanceof bb) {
            param2 = param2 & ((bb) (param3)).field_D;
          }
          if (param2) {
            if (var6_int != 0) {
              stackIn_16_0 = this.field_v;
            } else {
              stackIn_16_0 = this.field_y;
            }
          } else {
            stackIn_16_0 = this.field_w;
          }
          var7 = stackIn_16_0;
          ml.a(param1 + param3.field_y, 1, this.field_t, param4 + param3.field_z + (-this.field_t[0].field_r + param3.field_j >> 1), param3.field_u, var7);
          stackIn_19_0 = (param2) ? 16777215 : 7105644;
          var8 = stackIn_19_0;
          this.field_j.a(param3.field_i, param3.field_y + param1, -2 + (param4 + param3.field_z), param3.field_u, param3.field_j, var8, -1, 1, 1, this.field_j.field_H);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("ri.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void c(byte param0) {
        field_s = null;
        field_r = null;
        field_q = null;
        field_u = null;
        int var1 = 57 % ((1 - param0) / 61);
        field_x = null;
    }

    private ri(int param0, int param1, int param2) {
        this.field_w = param2;
        this.field_j = rg.field_o;
        this.field_v = param1;
        this.field_t = ng.field_h;
        this.field_y = param0;
    }

    final static void a(dd[] param0, int param1, fa param2, int param3, int param4, boolean param5, int param6, int param7, fa param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, dd[] param16, dd[] param17, int param18, int param19, int param20) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          if (!param5) {
            ri.c((byte) 79);
          }
          d.a(param10, param4, new qc(param17), new qc(param0), param6, param1, param9, param2, param8, new qc(param16), param13, param3, param12, param20, param7, param15, param19, param14, param11, param18, 255);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_6_0 = var21;
          stackIn_6_1 = new StringBuilder().append("ri.L(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',');
          if (param16 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param17 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param18).append(',').append(param19).append(',').append(param20).append(')').toString());
        }
    }

    static {
        field_u = "This is a members-only level.";
        field_q = "You have 1 unread message!";
        field_r = "Unable to connect to the data server. Please check any firewall you are using.";
        field_s = "Unpacking sound effects";
    }
}
