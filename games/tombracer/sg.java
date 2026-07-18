/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.Class;

final class sg extends nv {
    private boolean field_r;
    private boolean field_v;
    private boolean field_t;
    private boolean field_p;
    static String field_n;
    static int[] field_u;
    static String field_q;
    private boolean field_o;
    static String field_s;

    final int a(int param0, int param1) {
        if (param1 >= -48) {
            field_q = null;
            return param0;
        }
        return param0;
    }

    public static void b() {
        field_n = null;
        field_q = null;
        field_s = null;
        field_u = null;
    }

    sg(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        ((sg) this).field_r = false;
        try {
            ((sg) this).field_p = 1 != param1.b((byte) 44, 1) ? false : true;
            ((sg) this).field_t = param1.b((byte) 44, 1) != 1 ? false : true;
            ((sg) this).field_v = param1.b((byte) 44, 1) != 1 ? false : true;
            ((sg) this).field_o = param1.b((byte) 44, 1) == 1 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "sg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static Class a(String param0) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_3_0 = null;
        Class stackIn_7_0 = null;
        Class stackIn_10_0 = null;
        Class stackIn_14_0 = null;
        Class stackIn_17_0 = null;
        Class stackIn_20_0 = null;
        Class stackIn_24_0 = null;
        Class stackIn_28_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        Class stackOut_2_0 = null;
        Class stackOut_6_0 = null;
        Class stackOut_13_0 = null;
        Class stackOut_23_0 = null;
        Class stackOut_27_0 = null;
        Class stackOut_19_0 = null;
        Class stackOut_16_0 = null;
        Class stackOut_9_0 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            if (param0.equals((Object) (Object) "B")) {
              stackOut_2_0 = Byte.TYPE;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (param0.equals((Object) (Object) "I")) {
                stackOut_6_0 = Integer.TYPE;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (!param0.equals((Object) (Object) "S")) {
                  if (param0.equals((Object) (Object) "J")) {
                    stackOut_13_0 = Long.TYPE;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0;
                  } else {
                    if (!param0.equals((Object) (Object) "Z")) {
                      if (!param0.equals((Object) (Object) "F")) {
                        if (param0.equals((Object) (Object) "D")) {
                          stackOut_23_0 = Double.TYPE;
                          stackIn_24_0 = stackOut_23_0;
                          return stackIn_24_0;
                        } else {
                          if (param0.equals((Object) (Object) "C")) {
                            stackOut_27_0 = Character.TYPE;
                            stackIn_28_0 = stackOut_27_0;
                            break L0;
                          } else {
                            return Class.forName(param0);
                          }
                        }
                      } else {
                        stackOut_19_0 = Float.TYPE;
                        stackIn_20_0 = stackOut_19_0;
                        return stackIn_20_0;
                      }
                    } else {
                      stackOut_16_0 = Boolean.TYPE;
                      stackIn_17_0 = stackOut_16_0;
                      return stackIn_17_0;
                    }
                  }
                } else {
                  stackOut_9_0 = Short.TYPE;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var2;
            stackOut_29_1 = new StringBuilder().append("sg.H(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L1;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ',' + 1 + ')');
        }
        return stackIn_28_0;
    }

    final void k(int param0) {
        hca var2 = null;
        if (param0 == 5418) {
          if (!((sg) this).d(8031)) {
            if (((sg) this).field_r) {
              if (!((sg) this).field_p) {
                return;
              } else {
                ((sg) this).c(false);
                return;
              }
            } else {
              return;
            }
          } else {
            L0: {
              ((sg) this).field_r = true;
              var2 = ((sg) this).m((byte) 19);
              if (((sg) this).field_t) {
                var2.i(true);
                break L0;
              } else {
                break L0;
              }
            }
            if (!((sg) this).field_o) {
              if (!((sg) this).field_v) {
                return;
              } else {
                var2.n(21120);
                return;
              }
            } else {
              var2.l((byte) 28);
              if (!((sg) this).field_v) {
                return;
              } else {
                var2.n(21120);
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final int a(boolean param0) {
        if (param0) {
            ((sg) this).field_v = true;
            return 10;
        }
        return 10;
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            param1.a((byte) -125, ((sg) this).field_p ? 1 : 0, 1);
            param1.a((byte) -25, !((sg) this).field_t ? 0 : 1, 1);
            param1.a((byte) 12, !((sg) this).field_v ? 0 : 1, 1);
            param1.a((byte) -125, ((sg) this).field_o ? 1 : 0, 1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "sg.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "You ran out of time";
        field_q = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_s = "Quick Chat game";
    }
}
