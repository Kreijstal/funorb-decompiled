/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj {
    private um field_e;
    private v field_d;
    private um field_b;
    static int field_c;
    static lc field_a;
    static int field_h;
    static String field_f;
    static he field_g;

    final static void a(boolean param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        if (param2 != 4239) {
            kj.a((byte) -55);
            if (!(pj.field_h == null)) {
                var3 = pj.field_h.b(param0, (byte) -95);
                if (var3 == -2) {
                    return;
                }
                if (!((var3 ^ -1) == 0)) {
                    var4 = pj.field_h.b(false) ? 1 : 0;
                    ng.a(param1, var4 != 0, pj.field_h.field_Lb, var3, pj.field_h.a(true), 79);
                }
                pj.field_h = null;
                fi.a(-393711775);
            }
            return;
        }
        if (pj.field_h == null) {
            return;
        }
        var3 = pj.field_h.b(param0, (byte) -95);
        if (var3 != -2) {
            if (!((var3 ^ -1) == 0)) {
                var4 = pj.field_h.b(false) ? 1 : 0;
                ng.a(param1, var4 != 0, pj.field_h.field_Lb, var3, pj.field_h.a(true), 79);
            }
            pj.field_h = null;
            fi.a(-393711775);
        }
    }

    final j a(int param0, int param1) {
        j var3;
        byte[] var4;
        j var5;
        var3 = (j) (this.field_d.a((byte) -77, (long)param0));
        if (param1 == 0) {
          if (var3 != null) {
            return var3;
          } else {
            L0: {
              if ((param0 ^ -1) > -32769) {
                var4 = this.field_e.a(0, param0, 5847);
                break L0;
              } else {
                var4 = this.field_b.a(0, param0 & 32767, 5847);
                break L0;
              }
            }
            var5 = new j();
            if (var4 == null) {
              if (-32769 >= (param0 ^ -1)) {
                var5.f(0);
                this.field_d.a((long)param0, 1, var5);
                return var5;
              } else {
                this.field_d.a((long)param0, 1, var5);
                return var5;
              }
            } else {
              var5.a(new p(var4), param1 ^ 0);
              if (-32769 < (param0 ^ -1)) {
                this.field_d.a((long)param0, 1, var5);
                return var5;
              } else {
                var5.f(0);
                this.field_d.a((long)param0, 1, var5);
                return var5;
              }
            }
          }
        } else {
          return (j) null;
        }
    }

    public static void a(byte param0) {
        int var1 = -16 % ((param0 - -18) / 61);
        field_f = null;
        field_g = null;
        field_a = null;
    }

    kj(int param0, um param1, um param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_d = new v(64);
        try {
          L0: {
            L1: {
              this.field_e = param1;
              this.field_b = param2;
              if (this.field_e == null) {
                break L1;
              } else {
                this.field_e.a((byte) -67, 0);
                break L1;
              }
            }
            if (this.field_b == null) {
              break L0;
            } else {
              this.field_b.a((byte) -106, 0);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("kj.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ')');
        }
    }

    static {
        field_c = -1;
        field_f = "<%0> is not on your friend list.";
    }
}
