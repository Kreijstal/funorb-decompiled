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
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var8 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var6_int = 0;
              if (param3 >= 50) {
                break L1;
              } else {
                this.a((byte) -102, -21, 19, -11);
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                if (var6_int >= this.field_E) {
                  break L3;
                } else {
                  if (param1 == this.field_F[var6_int]) {
                    var7 = this.field_G[var6_int];
                    if ((var7 ^ -1) != 0) {
                      ep.a(this.field_G[var6_int], 8192);
                      break L3;
                    } else {
                      this.field_I.p(-83);
                      break L3;
                    }
                  } else {
                    var6_int++;
                    continue L2;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var6);

            stackIn_13_1 = new StringBuilder().append("hc.AA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        super.a((byte) -85, param1, param2, param3);
        this.field_H.a(this.field_C, 14 + (this.field_s + param3), 10 + this.field_v + param1, -28 + this.field_p, this.field_q, 16777215, -1, 0, 0, this.field_H.field_u);
        int var5 = -1 % ((param0 - -20) / 54);
    }

    final void a(int param0, String param1, int param2) {
        int var4_int = 0;
        try {
            var4_int = this.field_E;
            this.a(var4_int - -1, param0 ^ param0);
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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 19528) {
                break L1;
              } else {
                var6 = (String) null;
                this.a((pl) null, (String) null, -17);
                break L1;
              }
            }
            var4 = new hf(param1, param0);
            var4.field_f = (qda) ((Object) new ff());
            var5 = -2 + this.field_q;
            this.a(0, 34 + this.field_q, (byte) 59, this.field_p, 0);
            var4.a(7, 30, (byte) 59, -14 + this.field_p, var5);
            this.c(var4, -126);
            stackIn_3_0 = (hf) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("hc.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    static {
    }
}
