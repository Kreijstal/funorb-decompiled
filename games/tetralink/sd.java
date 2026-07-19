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
            throw oi.a((Throwable) ((Object) runtimeException), "sd.Q(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    sd(pk param0, na param1) {
        super(param0, param1, 33, 20, 30);
    }

    final static int c(int param0, int param1, int param2) {
        int var3 = 0;
        if (param2 >= -70) {
          field_rb = (hl) null;
          var3 = param0 >>> 269286079;
          return -var3 + (var3 + param0) / param1;
        } else {
          var3 = param0 >>> 269286079;
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
        int decompiledRegionSelector0 = 0;
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
          L0: {
            var2_int = param1.length();
            if (-1 != (var2_int ^ -1)) {
              if ((var2_int ^ -1) >= -64) {
                L1: {
                  var3 = 0;
                  if (param0 == 30) {
                    break L1;
                  } else {
                    field_nb = (kd) null;
                    break L1;
                  }
                }
                L2: while (true) {
                  if (var2_int > var3) {
                    L3: {
                      var4 = param1.charAt(var3);
                      if (var4 != 45) {
                        if (0 != (fi.field_xb.indexOf(var4) ^ -1)) {
                          break L3;
                        } else {
                          stackOut_18_0 = jg.field_h;
                          stackIn_19_0 = stackOut_18_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      } else {
                        L4: {
                          if (var3 == 0) {
                            break L4;
                          } else {
                            if (-1 + var2_int == var3) {
                              break L4;
                            } else {
                              break L3;
                            }
                          }
                        }
                        stackOut_15_0 = jg.field_h;
                        stackIn_16_0 = stackOut_15_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                    var3++;
                    continue L2;
                  } else {
                    return null;
                  }
                }
              } else {
                stackOut_5_0 = nb.field_V;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = c.field_o;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var2);
            stackOut_22_1 = new StringBuilder().append("sd.T(").append(param0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L5;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L5;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0;
            } else {
              return stackIn_19_0;
            }
          }
        }
    }

    final static boolean a(byte param0, ah param1) {
        mh discarded$2 = null;
        RuntimeException var2 = null;
        String var3 = null;
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
                var3 = (String) null;
                discarded$2 = sd.a(121, (String) null);
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
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("sd.EA(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void p(int param0) {
        field_pb = null;
        field_qb = null;
        if (param0 != -32527) {
          sd.q(68);
          field_rb = null;
          field_nb = null;
          field_ob = null;
          return;
        } else {
          field_rb = null;
          field_nb = null;
          field_ob = null;
          return;
        }
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
            param0.addMouseListener(kd.field_g);
            if (param1 != 33) {
                java.awt.Component var3 = (java.awt.Component) null;
                sd.a((java.awt.Component) null, -26);
            }
            param0.addMouseMotionListener(kd.field_g);
            param0.addFocusListener(kd.field_g);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "sd.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void q(int param0) {
        if ((fn.field_R ^ -1) == -11) {
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
        field_ob = "Return to lobby";
        field_pb = "Create unrated game";
    }
}
