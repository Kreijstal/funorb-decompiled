/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nm extends sj implements vg {
    private ck field_kb;
    static String field_lb;
    static String field_jb;
    static int[] field_ib;
    static String field_mb;

    public final void a(ck param0, byte param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 98) {
                break L1;
              } else {
                field_mb = (String) null;
                break L1;
              }
            }
            if (param0 != this.field_kb) {
              break L0;
            } else {
              this.m(110);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var6);

            stackIn_7_1 = new StringBuilder().append("nm.FA(");

            if (param0 == null) {
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
          throw vk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void m(int param0) {
        int var2 = 106 % ((47 - param0) / 49);
        if (!this.field_T) {
            return;
        }
        this.field_T = false;
    }

    private final ck a(int param0, pg param1, String param2) {
        ck var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        ck stackIn_3_0 = null;
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
              var4 = new ck(param2, param1);
              var4.field_o = (ca) ((Object) new na());
              var5 = this.field_s + -6;
              if (param0 == 26414) {
                break L1;
              } else {
                this.field_kb = (ck) null;
                break L1;
              }
            }
            this.field_s = this.field_s + 38;
            var4.b(0, -16 + (this.field_x - 14), var5, 15, 30);
            this.b((byte) -127, var4);
            this.f(12591);
            stackIn_3_0 = (ck) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("nm.G(").append(param0).append(',');

            if (param1 == null) {
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

            if (param2 == null) {
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
          throw vk.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    nm(ji param0, r param1) {
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
        lm var4 = null;
        try {
          L0: {
            L1: {
              var3 = null;
              if (param1 == gl.field_Gb) {
                var3 = oh.field_a;
                break L1;
              } else {
                if (param1 == of.field_g) {
                  var3 = jg.field_b;
                  this.field_s = this.field_s + 10;
                  if (!eh.b(119)) {
                    break L1;
                  } else {
                    this.field_s = this.field_s + 20;
                    var3 = ti.field_v;
                    break L1;
                  }
                } else {
                  if (param1 != mc.field_x) {
                    break L1;
                  } else {
                    this.field_s = this.field_s + 30;
                    var3 = id.field_g;
                    break L1;
                  }
                }
              }
            }
            var4 = new lm((String) (var3), (pg) null);
            var4.field_s = 80;
            var4.field_x = this.field_x;
            var4.field_v = 50;
            var4.field_q = 0;
            var4.field_o = (ca) ((Object) new hh(ta.field_e, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
            this.b((byte) -66, var4);
            this.field_kb = this.a(26414, (pg) (this), sp.field_b);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = var3;

            stackIn_12_1 = new StringBuilder().append("nm.<init>(");

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
          throw vk.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
    }

    public static void n(int param0) {
        field_lb = null;
        field_jb = null;
        field_ib = null;
        if (param0 != 38) {
            return;
        }
        field_mb = null;
    }

    static {
        field_lb = "A pathetic wretch; the runt's sole redeeming feature is its expendability, so common is its kind in the realm of Dungaria that it can be easily replaced.";
        field_jb = "Treasure: ";
        field_mb = "Hidden Nails";
    }
}
