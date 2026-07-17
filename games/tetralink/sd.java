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
            throw oi.a((Throwable) (Object) runtimeException, "sd.Q(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
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
        mh stackIn_16_0 = null;
        mh stackIn_19_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        mh stackOut_18_0 = null;
        mh stackOut_15_0 = null;
        mh stackOut_5_0 = null;
        mh stackOut_2_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var5 = TetraLink.field_J;
        try {
          var2_int = param1.length();
          if (var2_int != 0) {
            if (var2_int <= 63) {
              L0: {
                var3 = 0;
                if (param0 == 30) {
                  break L0;
                } else {
                  field_nb = null;
                  break L0;
                }
              }
              L1: while (true) {
                if (var2_int > var3) {
                  L2: {
                    var4 = param1.charAt(var3);
                    if (var4 != 45) {
                      if (fi.field_xb.indexOf(var4) != -1) {
                        break L2;
                      } else {
                        stackOut_18_0 = jg.field_h;
                        stackIn_19_0 = stackOut_18_0;
                        return stackIn_19_0;
                      }
                    } else {
                      L3: {
                        if (var3 == 0) {
                          break L3;
                        } else {
                          if (-1 + var2_int == var3) {
                            break L3;
                          } else {
                            break L2;
                          }
                        }
                      }
                      stackOut_15_0 = jg.field_h;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0;
                    }
                  }
                  var3++;
                  continue L1;
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
          L4: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("sd.T(").append(param0).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L4;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L4;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
    }

    final static boolean a(byte param0, ah param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 < -28) {
                break L1;
              } else {
                var3 = null;
                mh discarded$2 = sd.a(121, (String) null);
                break L1;
              }
            }
            stackOut_2_0 = param1.a(false);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("sd.EA(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
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
            throw oi.a((Throwable) (Object) runtimeException, "sd.R(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
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
