/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ao extends fb {
    static String field_G;
    static int field_J;
    private fn field_K;
    private int field_E;
    static String field_I;
    private String field_D;
    private fn field_H;
    static op field_F;

    final static eo a(String[] args, int param1) {
        eo var2 = null;
        RuntimeException var2_ref = null;
        eo stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        eo stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var2 = new eo(false);
              var2.field_g = args;
              if (param1 <= -76) {
                break L1;
              } else {
                field_F = (op) null;
                break L1;
              }
            }
            stackOut_2_0 = (eo) (var2);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2_ref);
            stackOut_4_1 = new StringBuilder().append("ao.D(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (args == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public static void i(int param0) {
        field_I = null;
        int var1 = -63 % ((-43 - param0) / 34);
        field_G = null;
        field_F = null;
    }

    ao(int param0, int param1, int param2, boolean param3) {
        super(param0, param1, 0);
        this.field_K = null;
        this.field_H = null;
        this.field_D = Integer.toString(param2);
        this.field_E = 255;
        if (!param3) {
            this.field_K = kh.a(55, false);
        }
    }

    final void a(byte param0, wk param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            var3_int = param1.a(this.a(true), (byte) -94);
            var4 = param1.a(this.f(237239984), 0);
            if (param0 < -76) {
              L1: {
                sg.field_jb.b(this.field_D, var3_int, var4, 3, -1, this.field_E);
                if (this.field_K == null) {
                  break L1;
                } else {
                  if (!this.field_K.l()) {
                    var5 = pj.a(var4, 47, var3_int);
                    this.field_K.h(var5);
                    if (this.field_H != null) {
                      this.field_H.h(var5);
                      break L1;
                    } else {
                      return;
                    }
                  } else {
                    this.field_H = null;
                    this.field_K = null;
                    return;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (runtimeException);
            stackOut_9_1 = new StringBuilder().append("ao.B(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void g(int param0) {
        if (-1 > (this.field_E ^ -1)) {
          this.field_x = this.field_x - 131072;
          this.field_E = this.field_E - 7;
          if (-1 < (this.field_E ^ -1)) {
            this.field_E = 0;
            if (param0 < 95) {
              this.field_H = (fn) null;
              return;
            } else {
              return;
            }
          } else {
            if (param0 >= 95) {
              return;
            } else {
              this.field_H = (fn) null;
              return;
            }
          }
        } else {
          this.b(-27598);
          if (param0 >= 95) {
            return;
          } else {
            this.field_H = (fn) null;
            return;
          }
        }
    }

    static {
        field_G = "Names can only contain letters, numbers, spaces and underscores";
        field_I = "Waiting for sound effects";
        field_J = -1;
    }
}
