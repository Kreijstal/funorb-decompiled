/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class co {
    static String[] field_a;
    static int[] field_d;
    static uf field_b;
    static String field_c;
    static String field_e;

    final static int a(int param0) {
        if (param0 != 0) {
            field_b = (uf) null;
            return cb.field_j;
        }
        return cb.field_j;
    }

    final static void a(boolean param0) {
        Object var1 = null;
        Throwable var2 = null;
        gn var3 = null;
        Throwable decompiledCaughtException = null;
        if (null == tf.field_n) {
          if (param0) {
            var3 = (gn) null;
            co.a((gn) null, (gn) null, 26);
            return;
          } else {
            return;
          }
        } else {
          var1 = tf.field_n;
          synchronized (var1) {
            L0: {
              tf.field_n = null;
              break L0;
            }
          }
          L1: {
            if (!param0) {
              break L1;
            } else {
              var3 = (gn) null;
              co.a((gn) null, (gn) null, 26);
              break L1;
            }
          }
          return;
        }
    }

    final static boolean a(gn param0, gn param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 == 10302) {
              L1: {
                L2: {
                  if (!param1.a((byte) 65)) {
                    break L2;
                  } else {
                    if (!param0.d(0, -78)) {
                      break L2;
                    } else {
                      if (!param0.b("car_pass_left", -93)) {
                        break L2;
                      } else {
                        if (!param0.b("car_pass_right", 116)) {
                          break L2;
                        } else {
                          if (!param0.b("wacky_boom_kick", -111)) {
                            break L2;
                          } else {
                            stackIn_10_0 = 1;
                            break L1;
                          }
                        }
                      }
                    }
                  }
                }
                stackIn_10_0 = 0;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("co.A(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            mn.a("", param0, -1);
            ae.a(-16666, param0);
            if (param1 != 237) {
                field_a = (String[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "co.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void c(int param0) {
        if (cf.field_q != -lf.field_l + param0) {
          if (cf.field_q != -lf.field_l + 250) {
            cf.field_q = cf.field_q + 1;
            return;
          } else {
            cf.field_q = cf.field_q + 1;
            return;
          }
        } else {
          cf.field_q = cf.field_q + 1;
          return;
        }
    }

    public static void b(int param0) {
        int var1 = -96 % ((param0 - -48) / 56);
        field_e = null;
        field_c = null;
        field_d = null;
        field_a = null;
        field_b = null;
    }

    static {
        field_a = new String[]{"Kick up some dust on desert tracks", "Cause mayhem in nighttime races", "Dance on ice on alpine tracks", "Put six new vehicles to the test", "The Rink, and other Demolition tracks", "Play in fullscreen mode"};
        field_c = "Username: ";
    }
}
