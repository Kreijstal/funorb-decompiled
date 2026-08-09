/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc {
    static String field_a;
    static of field_b;
    static String field_c;

    final static java.applet.Applet a(int param0) {
        if (param0 != 0) {
            hc.a((byte) -61);
            if (null != bh.field_i) {
                return bh.field_i;
            }
            return (java.applet.Applet) ((Object) nh.field_J);
        }
        if (null != bh.field_i) {
            return bh.field_i;
        }
        return (java.applet.Applet) ((Object) nh.field_J);
    }

    final static String a(boolean param0) {
        if (param0) {
          if (df.field_h) {
            return md.field_qb[0];
          } else {
            return md.field_qb[1];
          }
        } else {
          field_c = (String) null;
          if (df.field_h) {
            return md.field_qb[0];
          } else {
            return md.field_qb[1];
          }
        }
    }

    final static byte[] a(int param0, am param1, byte param2, byte[] param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        byte[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = ZombieDawn.field_J;
        try {
          L0: {
            var4_int = param1.k(80, param0);
            if (var4_int != 0) {
              L1: {
                L2: {
                  if (param3 == null) {
                    break L2;
                  } else {
                    if (var4_int != param3.length) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                param3 = new byte[var4_int];
                break L1;
              }
              L3: {
                var5 = param1.k(95, 3);
                if (param2 <= -24) {
                  break L3;
                } else {
                  field_c = (String) null;
                  break L3;
                }
              }
              L4: {
                var6 = (byte)param1.k(85, 8);
                if ((var5 ^ -1) < -1) {
                  var7 = 0;
                  L5: while (true) {
                    if (var4_int <= var7) {
                      break L4;
                    } else {
                      param3[var7] = (byte)(param1.k(56, var5) + var6);
                      var7++;
                      continue L5;
                    }
                  }
                } else {
                  var7 = 0;
                  L6: while (true) {
                    if (var4_int <= var7) {
                      break L4;
                    } else {
                      param3[var7] = (byte)var6;
                      var7++;
                      continue L6;
                    }
                  }
                }
              }
              stackIn_18_0 = (byte[]) (param3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4);

            stackIn_21_1 = new StringBuilder().append("hc.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_3_0);
        } else {
          return stackIn_18_0;
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        field_a = null;
        if (param0 > -114) {
            field_a = (String) null;
        }
    }

    static {
        field_a = "Click anywhere to activate!";
        field_c = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
    }
}
