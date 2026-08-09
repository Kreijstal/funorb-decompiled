/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mr extends iw implements oo {
    static String field_L;
    static ij field_M;
    private htb field_K;
    static String field_J;

    public final void a(int param0, int param1, int param2, htb param3, int param4) {
        RuntimeException var6 = null;
        htb var7 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_K != param3) {
                break L1;
              } else {
                this.h(-95);
                break L1;
              }
            }
            if (param0 == 11) {
              break L0;
            } else {
              var7 = (htb) null;
              this.a(-125, -106, 11, (htb) null, 127);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var6);

            stackIn_7_1 = new StringBuilder().append("mr.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param4 + ')');
        }
    }

    final static String m(byte param0) {
        String var1 = "";
        if (!(null == jt.field_o)) {
            var1 = jt.field_o.a(30);
        }
        int var2 = 80 / ((-61 - param0) / 55);
        if (0 == var1.length()) {
            var1 = dla.c(120);
        }
        if (!(0 != var1.length())) {
            var1 = job.field_o;
        }
        return var1;
    }

    public static void l(byte param0) {
        field_L = null;
        field_M = null;
        field_J = null;
        if (param0 != -16) {
            mr.g(-102);
        }
    }

    mr(ida param0, dpb param1) {
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
        shb var4 = null;
        try {
          L0: {
            L1: {
              var3 = null;
              if (param1 == qua.field_a) {
                var3 = oda.field_t;
                break L1;
              } else {
                if (param1 == bca.field_a) {
                  this.field_f = this.field_f + 10;
                  var3 = r.field_m;
                  if (!oq.c((byte) 109)) {
                    break L1;
                  } else {
                    var3 = jga.field_b;
                    this.field_f = this.field_f + 20;
                    break L1;
                  }
                } else {
                  if (param1 != oca.field_a) {
                    break L1;
                  } else {
                    this.field_f = this.field_f + 30;
                    var3 = tl.field_o;
                    break L1;
                  }
                }
              }
            }
            var4 = new shb((String) (var3), (sba) null);
            var4.field_f = 80;
            var4.field_r = 50;
            var4.field_h = this.field_h;
            var4.field_g = 0;
            var4.field_q = (wwa) ((Object) new bob(web.field_o, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
            this.b(-18756, var4);
            this.field_K = this.a((byte) 113, (sba) (this), wm.field_b);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = var3;

            stackIn_12_1 = new StringBuilder().append("mr.<init>(");

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
          throw rta.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
    }

    private final void h(int param0) {
        if (param0 < -39) {
          if (!this.field_z) {
            return;
          } else {
            this.field_z = false;
            return;
          }
        } else {
          field_J = (String) null;
          if (!this.field_z) {
            return;
          } else {
            this.field_z = false;
            return;
          }
        }
    }

    final static hrb g(int param0) {
        if (param0 <= 37) {
            mr.g(84);
            return (hrb) ((Object) new nmb());
        }
        return (hrb) ((Object) new nmb());
    }

    private final htb a(byte param0, sba param1, String param2) {
        htb var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        htb stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = new htb(param2, param1);
            var4.field_q = (wwa) ((Object) new vva());
            var5 = -79 / ((6 - param0) / 32);
            var6 = -6 + this.field_f;
            this.field_f = this.field_f + 38;
            var4.a(15, this.field_h - 14 + -16, 30, 1, var6);
            this.b(-18756, var4);
            this.a(false);
            stackIn_1_0 = (htb) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4_ref);

            stackIn_4_1 = new StringBuilder().append("mr.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ')');
        }
        return stackIn_1_0;
    }

    static {
        field_L = "<%0> is not on your ignore list.";
        field_J = "Game options";
    }
}
