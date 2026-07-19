/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie extends kf {
    static int field_z;
    static gi field_y;
    static hl[] field_B;
    static int field_C;
    static volatile int field_D;
    int field_w;
    static pf field_x;
    static hl[] field_A;

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (-1 != (param0 ^ -1)) {
            return;
        }
        if (!(null != this.field_t)) {
            return;
        }
        if (!(this.field_w != 0)) {
            return;
        }
        if (!((this.field_w ^ -1) != -257)) {
            this.field_t.a(param0, param1 - -this.field_s, (byte) 49, param3 + this.field_j);
            return;
        }
        hl var6 = new hl(this.field_t.field_i, this.field_t.field_f);
        bc.a(var6, 26095);
        this.field_t.a(param0, 0, param2, 0);
        wf.a(-110);
        var6.e(this.field_s + param1, this.field_j + param3, this.field_w);
    }

    public static void h(int param0) {
        String[] var2 = null;
        field_y = null;
        field_x = null;
        if (param0 != 24288) {
          var2 = (String[]) null;
          ie.a(-11, (String) null, (String[]) null, -43);
          field_A = null;
          field_B = null;
          return;
        } else {
          field_A = null;
          field_B = null;
          return;
        }
    }

    ie(uj param0) {
        super(param0.field_s, param0.field_j, param0.field_i, param0.field_f, (de) null, (qg) null);
        try {
            param0.a(0, this.field_i, (byte) 117, this.field_f, 0);
            this.field_w = 256;
            this.field_t = param0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "ie.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, String param1, String[] param2, int param3) {
        String[] var4 = null;
        RuntimeException var4_ref = null;
        String[] var5 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              field_x = s.field_f;
              if (param0 <= -99) {
                break L1;
              } else {
                ie.g(-121);
                break L1;
              }
            }
            if (-256 != (param3 ^ -1)) {
              L2: {
                if (param3 < 100) {
                  break L2;
                } else {
                  if ((param3 ^ -1) < -106) {
                    break L2;
                  } else {
                    var4 = param2;
                    dl.a((byte) -12, var4);
                    mf.field_a = hc.a(param2, 0);
                    return;
                  }
                }
              }
              mf.field_a = fb.a(param1, param3, 0);
              break L0;
            } else {
              L3: {
                if (-14 >= (qb.field_a ^ -1)) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L3;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L3;
                }
              }
              mf.field_a = cf.a(stackIn_6_0 != 0, false);
              var5 = (String[]) null;
              dl.a((byte) -12, (String[]) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var4_ref);
            stackOut_12_1 = new StringBuilder().append("ie.LA(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param3 + ')');
        }
    }

    final static void g(int param0) {
        if (param0 != -1) {
            field_y = (gi) null;
        }
    }

    public ie() {
        super(0, 0, 0, 0, (de) null, (qg) null);
        this.field_w = 256;
    }

    static {
        field_D = 0;
        field_C = 0;
    }
}
