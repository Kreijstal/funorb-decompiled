/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se extends ji {
    static er field_C;
    static byte[][] field_y;
    private int field_z;
    static fi field_A;

    final int[] c(int param0, int param1) {
        int[] var25 = null;
        int[] var5 = null;
        int[] var24 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = Vertigo2.field_L ? 1 : 0;
        if (param1 < 91) {
          return (int[]) null;
        }
        int[] var17 = this.field_x.a(param0, (byte) -62);
        int[] var3 = var17;
        if (this.field_x.field_i) {
          var25 = this.a(0, -1, param0 - 1 & fk.field_x);
          var5 = this.a(0, -1, param0);
          var24 = this.a(0, -1, param0 + 1 & fk.field_x);
          for (var7 = 0; var7 < we.field_M; var7++) {
            var8 = this.field_z * (var24[var7] - var25[var7]);
            var9 = (-var5[rm.field_z & var7 - 1] + var5[rm.field_z & 1 + var7]) * this.field_z;
            var10 = var9 >> 12;
            var11 = var8 >> 12;
            var12 = var10 * var10 >> 12;
            var13 = var11 * var11 >> 12;
            var14 = (int)(4096.0 * Math.sqrt((double)((float)(var13 + (var12 + 4096)) / 4096.0f)));
            var15 = 0 != var14 ? 16777216 / var14 : 0;
            var17[var7] = -var15 + 4096;
          }
        }
        return var17;
    }

    final static void a(String param0, int param1) {
        try {
          lr.field_S = param0;
          rh.b(param1 - 26, param1);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "se.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public se() {
        super(1, true);
        this.field_z = 4096;
    }

    final void a(byte param0, int param1, ed param2) {
        ed var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (0 == param1) {
            this.field_z = param2.a((byte) -11);
          }
          if (param0 != 110) {
            var5 = (ed) null;
            this.a((byte) -52, -60, (ed) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("se.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        if (!param0) {
          return;
        }
        field_y = (byte[][]) null;
        field_C = null;
        field_A = null;
    }

    static {
    }
}
