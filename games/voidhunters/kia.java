/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kia {
    static String field_a;
    static String field_b;

    final static void a(byte param0) {
        String var1;
        if (tla.field_c) {
          if (param0 != 63) {
            return;
          } else {
            L0: {
              if (null != hwa.field_o) {
                hwa.field_o.l((byte) -106);
                break L0;
              } else {
                break L0;
              }
            }
            var1 = mr.m((byte) -118);
            jt.field_o = new vla(var1, (String) null, true, false, false);
            klb.field_r.a(false, s.field_o);
            s.field_o.b(jt.field_o, -110);
            s.field_o.e(param0 + -10394);
            return;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    final static im a(int param0, qfa param1, int param2, byte[] param3, int param4, boolean param5, int param6, int param7) {
        RuntimeException var8 = null;
        im stackIn_2_0 = null;
        im stackIn_9_0 = null;
        im stackIn_11_0 = null;
        im stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param6 == 21989) {
              L1: {
                if (param1.field_n) {
                  break L1;
                } else {
                  L2: {
                    if (!bd.a(param2, (byte) -95)) {
                      break L2;
                    } else {
                      if (bd.a(param0, (byte) -95)) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (!param1.field_g) {
                    stackIn_11_0 = new im(param1, param7, param2, param0, hj.a(param2, (byte) -95), hj.a(param0, (byte) -109), param3, param4);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    stackIn_9_0 = new im(param1, 34037, param7, param2, param0, param5, param3, param4);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              stackIn_13_0 = new im(param1, 3553, param7, param2, param0, param5, param3, param4);
              decompiledRegionSelector0 = 3;
              break L0;
            } else {
              stackIn_2_0 = (im) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var8);

            stackIn_16_1 = new StringBuilder().append("kia.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_13_0;
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 3553) {
            field_a = (String) null;
            field_b = null;
            field_a = null;
            return;
        }
        field_b = null;
        field_a = null;
    }

    static {
        field_b = "Message game";
        field_a = "<%0> has won the round!";
    }
}
