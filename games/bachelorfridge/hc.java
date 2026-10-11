/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc extends vd implements lja {
    private mf field_I;
    private int[] field_G;
    private int field_E;
    static int field_J;
    private String field_C;
    private hf[] field_F;
    static int field_D;
    private po field_H;

    public final void a(int param0, hf param1, int param2, byte param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var8 = BachelorFridge.field_y;
        try {
          var6_int = 0;
          if (param3 < 50) {
            this.a((byte) -102, -21, 19, -11);
          }
          while (var6_int < this.field_E) {
            if (param1 != this.field_F[var6_int]) {
              var6_int++;
              continue;
            }
            var7 = this.field_G[var6_int];
            if (var7 != -1) {
              ep.a(this.field_G[var6_int], 8192);
            } else {
              this.field_I.p(-83);
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("hc.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        super.a((byte) -85, param1, param2, param3);
        this.field_H.a(this.field_C, 14 + (this.field_s + param3), 10 + this.field_v + param1, -28 + this.field_p, this.field_q, 16777215, -1, 0, 0, this.field_H.field_u);
        int var5 = -1 % ((param0 + 20) / 54);
    }

    final void a(int param0, String param1, int param2) {
        int var4_int = 0;
        try {
          var4_int = this.field_E;
          this.a(var4_int + 1, param0 ^ param0);
          this.field_F[var4_int] = this.a((pl) (this), param1, param0 + 19521);
          this.field_G[var4_int] = param2;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "hc.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1) {
        int var5 = 0;
        int var6 = BachelorFridge.field_y;
        if (this.field_E >= param0) {
          return;
        }
        hf[] var7 = new hf[param0];
        hf[] var3 = var7;
        int[] var4 = new int[param0];
        for (var5 = param1; this.field_E > var5; var5++) {
          var7[var5] = this.field_F[var5];
          var4[var5] = this.field_G[var5];
        }
        this.field_F = var3;
        this.field_E = param0;
        this.field_G = var4;
    }

    hc(mf param0, po param1, String param2) {
        super(0, 0, 288, 0, (qda) null);
        int var4_int = 0;
        this.field_E = 0;
        try {
          this.field_I = param0;
          this.field_H = param1;
          this.field_C = param2;
          var4_int = this.field_C != null ? this.field_H.a(this.field_C, 260, this.field_H.field_u) : 0;
          this.a(0, 22 + var4_int, (byte) 59, 288, 0);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "hc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final hf a(pl param0, String param1, int param2) {
        hf var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        String var6 = null;
        hf stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 19528) {
            var6 = (String) null;
            this.a((pl) null, (String) null, -17);
          }
          var4 = new hf(param1, param0);
          var4.field_f = (qda) ((Object) new ff());
          var5 = -2 + this.field_q;
          this.a(0, 34 + this.field_q, (byte) 59, this.field_p, 0);
          var4.a(7, 30, (byte) 59, -14 + this.field_p, var5);
          this.c(var4, -126);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("hc.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
    }
}
