/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl extends ok {
    static int field_I;
    int field_H;
    static vl field_E;

    public static void j(int param0) {
        if (param0 != -101) {
            return;
        }
        field_E = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        qj var6 = null;
        if (-1 == (param0 ^ -1)) {
          if (null != this.field_B) {
            if (this.field_H == 0) {
              return;
            } else {
              if (this.field_H != 256) {
                var6 = new qj(this.field_B.field_x, this.field_B.field_u);
                if (param3 != 29221) {
                  return;
                } else {
                  mb.a((byte) -12, var6);
                  this.field_B.a(param0, 0, 0, param3 + 0);
                  ch.m(param3 + -29294);
                  var6.d(this.field_p + param1, this.field_m + param2, this.field_H);
                  return;
                }
              } else {
                this.field_B.a(param0, param1 + this.field_p, this.field_m + param2, param3 + 0);
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public gl() {
        super(0, 0, 0, 0, (t) null, (tg) null);
        this.field_H = 256;
    }

    final static void a(String param0, String[] param1, int param2, byte param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var5 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              fd.field_h = cj.field_e;
              if (param2 != 255) {
                if ((param2 ^ -1) > -101) {
                  h.field_c = wg.a((byte) 54, param2, param0);
                  break L1;
                } else {
                  if (-106 > (param2 ^ -1)) {
                    h.field_c = wg.a((byte) 54, param2, param0);
                    break L1;
                  } else {
                    h.field_c = qg.a(param1, 91);
                    break L1;
                  }
                }
              } else {
                L2: {
                  if (-14 >= (da.field_o ^ -1)) {
                    stackOut_4_0 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    break L2;
                  } else {
                    stackOut_3_0 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    break L2;
                  }
                }
                h.field_c = oc.a(stackIn_5_0 != 0, -21017);
                break L1;
              }
            }
            if (param3 >= 93) {
              break L0;
            } else {
              field_I = -52;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var4);
            stackOut_14_1 = new StringBuilder().append("gl.A(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          L4: {
            stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static qj[] b(int param0, int param1, int param2, int param3, int param4) {
        qj[] var7 = new qj[9];
        qj[] var5 = var7;
        qj dupTemp$0 = ee.a(param0, param1, (byte) 104);
        var7[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        qj dupTemp$1 = ee.a(param2, param1, (byte) -74);
        var7[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        int var6 = 87 % ((-23 - param3) / 37);
        if (!(param4 == 0)) {
            var7[4] = ee.a(param4, 64, (byte) 104);
        }
        return var5;
    }

    gl(al param0) {
        super(param0.field_p, param0.field_m, param0.field_x, param0.field_u, (t) null, (tg) null);
        try {
            param0.a(this.field_u, -3050, 0, this.field_x, 0);
            this.field_H = 256;
            this.field_B = param0;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "gl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
