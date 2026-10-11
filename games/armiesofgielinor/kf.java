/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf extends oj {
    int field_H;
    static String field_B;
    private boolean field_A;
    private int field_C;
    static int[] field_E;
    private int field_y;
    private int field_z;
    private int field_J;
    int field_F;
    static String field_I;

    public static void g(int param0) {
        if (param0 <= -5) {
          field_E = null;
          field_I = null;
          field_B = null;
          return;
        }
        field_B = (String) null;
        field_E = null;
        field_I = null;
        field_B = null;
    }

    static int b(int param0, int param1) {
        return param0 ^ param1;
    }

    final void a(ha param0, int param1) {
        jd var5 = null;
        jd var6 = null;
        if (this.field_A) {
          return;
        }
        this.field_A = true;
        this.field_w = new jd(this.field_H, this.field_F, 39, this.field_C, this.field_z, this.field_z, 0, 0, 0, param0, 0, 0, -1, false, 0);
        if (param1 != -26661) {
          return;
        }
        try {
          param0.a(param1 + 34949, this.field_w);
          this.field_w.field_B = 1;
          this.field_w.field_s = true;
          var5 = param0.c(this.field_y, true, this.field_J);
          var6 = var5;
          if (var6 != null) {
            var6.field_s = true;
          }
          fl.a(param0, param1 ^ 26716);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "kf.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(at param0, byte param1, ic param2) {
        RuntimeException var4 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < -84) {
            stackIn_4_0 = this.a((byte) -39, param2, param0, true);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("kf.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final String a(byte param0, boolean param1) {
        int var4 = -32 / ((param0 - 53) / 51);
        String var3 = "EventGrowth: g: (" + this.field_H + "," + this.field_F + "), strength: " + this.field_z + ", owner: " + this.field_C + ", o: (" + this.field_J + "," + this.field_y + ")";
        return var3;
    }

    kf(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_J = param2;
        this.field_C = param5;
        this.field_z = param4;
        this.field_m = 11;
        this.field_F = param1;
        this.field_H = param0;
        this.field_A = false;
        this.field_y = param3;
    }

    static {
        field_B = "<%0> has entered a game.";
        field_E = new int[]{7, 4, 4, 3, 2, 8};
        field_I = "END TURN";
    }
}
