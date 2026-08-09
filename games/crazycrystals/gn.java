/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gn extends en implements vd {
    private pc field_V;
    static wb field_Q;
    static java.math.BigInteger field_S;
    static String field_U;

    public final void a(byte param0, int param1, int param2, int param3, pc param4) {
        try {
            if (!(param4 != this.field_V)) {
                this.l(15);
            }
            int var6_int = 52 / ((param0 - 83) / 36);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "gn.BA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static void f(boolean param0) {
        jl.field_a = null;
        sl.field_r = null;
        rd.field_h = param0 ? true : false;
        ne.field_a = null;
        lo.field_c = null;
    }

    public static void e(boolean param0) {
        field_U = null;
        if (param0) {
            field_U = (String) null;
            field_Q = null;
            field_S = null;
            return;
        }
        field_Q = null;
        field_S = null;
    }

    private final pc a(bi param0, String param1, byte param2) {
        pc var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        pc stackIn_3_0 = null;
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
              var4 = new pc(param1, param0);
              var4.field_i = (wo) ((Object) new ve());
              var5 = this.field_f + -6;
              if (param2 > 115) {
                break L1;
              } else {
                field_Q = (wb) null;
                break L1;
              }
            }
            this.field_f = this.field_f + 38;
            var4.a(30, 15, var5, -16 + (-14 + this.field_g), (byte) -52);
            this.b(var4, -20);
            this.f(-30);
            stackIn_3_0 = (pc) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("gn.U(");

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
          throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    private final void l(int param0) {
        if (this.field_C) {
          if (param0 != 15) {
            this.field_V = (pc) null;
            this.field_C = false;
            return;
          } else {
            this.field_C = false;
            return;
          }
        } else {
          return;
        }
    }

    gn(ol param0, bf param1) {
        super(param0, 200, 150);
        Object var3 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        qm var4 = null;
        try {
          L0: {
            L1: {
              var3 = null;
              if (eb.field_w == param1) {
                var3 = field_U;
                break L1;
              } else {
                if (ab.field_A == param1) {
                  this.field_f = this.field_f + 10;
                  var3 = nh.field_C;
                  if (!jl.a(100)) {
                    break L1;
                  } else {
                    var3 = md.field_n;
                    this.field_f = this.field_f + 20;
                    break L1;
                  }
                } else {
                  if (param1 != rn.field_r) {
                    break L1;
                  } else {
                    var3 = fn.field_i;
                    this.field_f = this.field_f + 30;
                    break L1;
                  }
                }
              }
            }
            var4 = new qm((String) (var3), (bi) null);
            var4.field_g = this.field_g;
            var4.field_r = 0;
            var4.field_f = 80;
            var4.field_j = 50;
            var4.field_i = (wo) ((Object) new lb(ba.field_i, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
            this.b(var4, 125);
            this.field_V = this.a((bi) (this), qo.field_o, (byte) 118);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = var3;

            stackIn_12_1 = new StringBuilder().append("gn.<init>(");

            if (param0 == null) {
              stackIn_13_0 = stackIn_12_0;
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = stackIn_12_0;
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param1 == null) {

              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {

              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
    }

    final static boolean d(boolean param0) {
        if (param0) {
            field_S = (java.math.BigInteger) null;
            return j.c((byte) -23);
        }
        return j.c((byte) -23);
    }

    static {
        field_Q = new wb();
        field_S = new java.math.BigInteger("65537");
        field_U = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
