/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg extends ai {
    int field_i;
    static mf field_g;
    int field_h;

    public static void b(byte param0) {
        field_g = null;
        if (param0 != 57) {
            field_g = (mf) null;
        }
    }

    final static int a(int param0, int param1) {
        int var3 = Bounce.field_N;
        ih.field_X = 0;
        if (param0 != -23888) {
            field_g = (mf) null;
        }
        md.field_q = null;
        mf.field_a = null;
        int var2 = a.field_a;
        a.field_a = fk.field_d;
        tb.field_p.field_l = tb.field_p.field_l + 1;
        if (param1 == 51) {
            tb.field_p.field_d = 2;
        } else {
            if (param1 == 50) {
                tb.field_p.field_d = 5;
            } else {
                tb.field_p.field_d = 1;
            }
        }
        fk.field_d = var2;
        if (-3 >= (tb.field_p.field_l ^ -1)) {
            if (!(51 != param1)) {
                return 2;
            }
        }
        if ((tb.field_p.field_l ^ -1) <= -3) {
            if (!((param1 ^ -1) != -51)) {
                return 5;
            }
        }
        if (!(tb.field_p.field_l < 4)) {
            return 1;
        }
        return -1;
    }

    final static byte[] a(boolean param0, byte[] param1, int param2, ii param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] stackIn_3_0 = null;
        byte[] stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_18_0 = null;
        byte[] stackOut_2_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var8 = Bounce.field_N;
        try {
          L0: {
            if (param0) {
              var4_int = param3.f(7, param2);
              if (-1 != (var4_int ^ -1)) {
                L1: {
                  L2: {
                    if (param1 == null) {
                      break L2;
                    } else {
                      if (var4_int != param1.length) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  param1 = new byte[var4_int];
                  break L1;
                }
                L3: {
                  var5 = param3.f(7, 3);
                  var6 = (byte)param3.f(7, 8);
                  if ((var5 ^ -1) < -1) {
                    var7 = 0;
                    L4: while (true) {
                      if (var7 >= var4_int) {
                        break L3;
                      } else {
                        param1[var7] = (byte)(param3.f(7, var5) + var6);
                        var7++;
                        continue L4;
                      }
                    }
                  } else {
                    var7 = 0;
                    L5: while (true) {
                      if (var7 >= var4_int) {
                        break L3;
                      } else {
                        param1[var7] = (byte)var6;
                        var7++;
                        continue L5;
                      }
                    }
                  }
                }
                stackOut_18_0 = (byte[]) (param1);
                stackIn_19_0 = stackOut_18_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            } else {
              stackOut_2_0 = (byte[]) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var4);
            stackOut_20_1 = new StringBuilder().append("qg.B(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          L7: {
            stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param2).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param3 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_19_0;
        }
    }

    private qg() throws Throwable {
        throw new Error();
    }

    static {
        field_g = new mf();
    }
}
