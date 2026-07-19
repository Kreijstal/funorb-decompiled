/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il {
    static dd[] field_d;
    static rh field_a;
    String field_e;
    static int[] field_f;
    static int field_h;
    String field_b;
    static int[] field_c;
    static int field_g;
    boolean field_i;

    final static void b(int param0) {
        int discarded$3 = 0;
        int discarded$4 = 0;
        int discarded$5 = 0;
        RuntimeException var1 = null;
        Object var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        dd var5 = null;
        dd var6 = null;
        dd var7 = null;
        Object stackIn_20_0 = null;
        Object stackIn_30_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_19_0 = null;
        Object stackOut_29_0 = null;
        var4 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            gb.b(243, 197, 369, 143, 16777215);
            gb.e(244, param0, 367, 141, 0);
            if (null != wa.field_k) {
              L1: {
                L2: {
                  var5 = wa.field_k[ql.field_o];
                  if (var5 == null) {
                    break L2;
                  } else {
                    var5.d(245, 199);
                    if (var4 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (qj.field_H == null) {
                  break L1;
                } else {
                  discarded$3 = qj.field_H.a(jg.field_a, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                  break L1;
                }
              }
              L3: {
                if (td.field_i >= hd.field_c) {
                  break L3;
                } else {
                  var6 = wa.field_k[t.field_a];
                  if (var6 == null) {
                    break L3;
                  } else {
                    L4: {
                      var2_int = td.field_i * (60 + var6.field_x) / hd.field_c;
                      var3 = var2_int + -30;
                      if (!rc.field_i) {
                        break L4;
                      } else {
                        d.a((-var3 + var6.field_x) * 256 / 30, 199, var6, 245, 2147483647, -256 * var3 / 30);
                        if (var4 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    d.a(var3 * -256 / 30, 199, var6, 245, 2147483647, 256 * (-var3 + var6.field_x) / 30);
                    break L3;
                  }
                }
              }
              L5: {
                if (null == qj.field_H) {
                  break L5;
                } else {
                  var2 = null;
                  var3 = 0;
                  L6: while (true) {
                    L7: {
                      L8: {
                        if (wa.field_k.length <= var3) {
                          break L8;
                        } else {
                          var7 = wa.field_k[var3];
                          stackOut_19_0 = null;
                          stackIn_30_0 = stackOut_19_0;
                          stackIn_20_0 = stackOut_19_0;
                          if (var4 != 0) {
                            break L7;
                          } else {
                            L9: {
                              if (stackIn_20_0 != var7) {
                                L10: {
                                  if (var7.field_x != 365) {
                                    break L10;
                                  } else {
                                    if (-140 != (var7.field_r ^ -1)) {
                                      break L10;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                L11: {
                                  if (var2 != null) {
                                    break L11;
                                  } else {
                                    var2 = Integer.toString(var3);
                                    if (var4 == 0) {
                                      break L9;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                var2 = (String) (var2) + ", " + var3;
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            var3++;
                            if (var4 == 0) {
                              continue L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                      stackOut_29_0 = null;
                      stackIn_30_0 = stackOut_29_0;
                      break L7;
                    }
                    if (stackIn_30_0 != var2) {
                      discarded$4 = qj.field_H.a("Screenshot(s) " + (String) (var2) + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                      break L5;
                    } else {
                      return;
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L12: {
                if (qj.field_H == null) {
                  break L12;
                } else {
                  discarded$5 = qj.field_H.a(jg.field_a, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                  break L12;
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var1), "il.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean a(byte param0) {
        int var1 = -34 / ((-35 - param0) / 60);
        return uk.b(15000);
    }

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        field_c = null;
        field_f = null;
        if (param0 > -68) {
            java.applet.Applet var2 = (java.applet.Applet) null;
            il.a((byte) 45, (java.applet.Applet) null);
        }
    }

    final static void a(boolean param0, java.awt.Component param1) {
        if (param0) {
            return;
        }
        try {
            param1.addMouseListener(sg.field_i);
            param1.addMouseMotionListener(sg.field_i);
            param1.addFocusListener(sg.field_i);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "il.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              L0: {
                if (param0 == 77) {
                  try {
                    L1: {
                      var2 = new java.net.URL(param1.getCodeBase(), "subscribe.ws");
                      param1.getAppletContext().showDocument(ib.a(param1, var2, param0 ^ -5390), "_top");
                      break L1;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    return;
                  }
                  return;
                } else {
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) (var2_ref2);
                stackOut_6_1 = new StringBuilder().append("il.C(").append(param0).append(',');
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param1 == null) {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L2;
                } else {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L2;
                }
              }
              throw pf.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_h = -1;
        field_f = new int[4];
        field_c = new int[8192];
    }
}
