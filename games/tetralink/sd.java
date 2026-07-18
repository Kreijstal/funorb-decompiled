/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd extends ml {
    static oh[] field_qb;
    static String field_ob;
    static hl field_rb;
    static String field_pb;
    static kd field_nb;

    final void e(na param0, int param1) {
        try {
            super.e(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "sd.Q(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    sd(pk param0, na param1) {
        super(param0, param1, 33, 20, 30);
    }

    final static int c(int param0, int param1, int param2) {
        int var3 = 0;
        if (param2 >= -70) {
          field_rb = null;
          var3 = param0 >>> 31;
          return -var3 + (var3 + param0) / param1;
        } else {
          var3 = param0 >>> 31;
          return -var3 + (var3 + param0) / param1;
        }
    }

    final static mh a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        mh stackIn_3_0 = null;
        mh stackIn_6_0 = null;
        mh stackIn_15_0 = null;
        mh stackIn_18_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        mh stackOut_17_0 = null;
        mh stackOut_14_0 = null;
        mh stackOut_5_0 = null;
        mh stackOut_2_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var5 = TetraLink.field_J;
        try {
          var2_int = param1.length();
          if (var2_int != 0) {
            if (var2_int <= 63) {
              var3 = 0;
              L0: while (true) {
                if (var2_int > var3) {
                  L1: {
                    var4 = param1.charAt(var3);
                    if (var4 != 45) {
                      if (fi.field_xb.indexOf(var4) != -1) {
                        break L1;
                      } else {
                        stackOut_17_0 = jg.field_h;
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0;
                      }
                    } else {
                      L2: {
                        if (var3 == 0) {
                          break L2;
                        } else {
                          if (-1 + var2_int == var3) {
                            break L2;
                          } else {
                            break L1;
                          }
                        }
                      }
                      stackOut_14_0 = jg.field_h;
                      stackIn_15_0 = stackOut_14_0;
                      return stackIn_15_0;
                    }
                  }
                  var3++;
                  continue L0;
                } else {
                  return null;
                }
              }
            } else {
              stackOut_5_0 = nb.field_V;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0;
            }
          } else {
            stackOut_2_0 = c.field_o;
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var2;
            stackOut_21_1 = new StringBuilder().append("sd.T(").append(30).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L3;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L3;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ')');
        }
    }

    final static boolean a(byte param0, ah param1) {
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = param1.a(false);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("sd.EA(").append(-68).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    public static void p(int param0) {
        field_pb = null;
        field_qb = null;
        field_rb = null;
        field_nb = null;
        field_ob = null;
    }

    final static void r(int param0) {
        if (!pj.b((byte) 106)) {
            return;
        }
        if (param0 != -11) {
            return;
        }
        om.a(false, 10, 4);
    }

    final static void a(java.awt.Component param0, int param1) {
        try {
            param0.addMouseListener((java.awt.event.MouseListener) (Object) kd.field_g);
            if (param1 != 33) {
                Object var3 = null;
                sd.a((java.awt.Component) null, -26);
            }
            param0.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) kd.field_g);
            param0.addFocusListener((java.awt.event.FocusListener) (Object) kd.field_g);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "sd.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void q(int param0) {
        if (fn.field_R == 10) {
          cc.c(param0 + -9216);
          fn.field_R = 11;
          n.field_Q = true;
          if (param0 == 27112) {
            return;
          } else {
            sd.r(-30);
            return;
          }
        } else {
          if (wm.b(param0 + -27112)) {
            n.field_Q = true;
            if (param0 == 27112) {
              return;
            } else {
              sd.r(-30);
              return;
            }
          } else {
            cc.c(param0 + -9216);
            fn.field_R = 11;
            n.field_Q = true;
            if (param0 == 27112) {
              return;
            } else {
              sd.r(-30);
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ob = "Return to lobby";
        field_pb = "Create unrated game";
    }
}
