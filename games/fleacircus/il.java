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
        RuntimeException var1 = null;
        Object var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        dd var6 = null;
        dd var7 = null;
        dd var8 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            gb.b(243, 197, 369, 143, 16777215);
            gb.e(244, 198, 367, 141, 0);
            if (null != wa.field_k) {
              L1: {
                var6 = wa.field_k[ql.field_o];
                if (var6 == null) {
                  if (qj.field_H == null) {
                    break L1;
                  } else {
                    int discarded$3 = qj.field_H.a(jg.field_a, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                    break L1;
                  }
                } else {
                  var6.d(245, 199);
                  break L1;
                }
              }
              L2: {
                if (td.field_i >= hd.field_c) {
                  break L2;
                } else {
                  var7 = wa.field_k[t.field_a];
                  if (var7 == null) {
                    break L2;
                  } else {
                    var2_int = td.field_i * (60 + var7.field_x) / hd.field_c;
                    var3 = var2_int + -30;
                    if (!rc.field_i) {
                      d.a(var3 * -256 / 30, 199, var7, 245, 2147483647, 256 * (-var3 + var7.field_x) / 30);
                      break L2;
                    } else {
                      d.a((-var3 + var7.field_x) * 256 / 30, 199, var7, 245, 2147483647, -256 * var3 / 30);
                      break L2;
                    }
                  }
                }
              }
              L3: {
                if (null == qj.field_H) {
                  break L3;
                } else {
                  var2 = null;
                  var5 = 0;
                  var3 = var5;
                  L4: while (true) {
                    if (wa.field_k.length <= var5) {
                      if (var2 != null) {
                        int discarded$4 = qj.field_H.a("Screenshot(s) " + (String) var2 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                        break L3;
                      } else {
                        return;
                      }
                    } else {
                      L5: {
                        var8 = wa.field_k[var5];
                        if (var8 != null) {
                          L6: {
                            if (var8.field_x != 365) {
                              break L6;
                            } else {
                              if (var8.field_r != 139) {
                                break L6;
                              } else {
                                var5++;
                                break L5;
                              }
                            }
                          }
                          if (var2 != null) {
                            var2 = (Object) (Object) ((String) var2 + ", " + var5);
                            break L5;
                          } else {
                            var2 = (Object) (Object) Integer.toString(var5);
                            break L5;
                          }
                        } else {
                          var5++;
                          break L5;
                        }
                      }
                      var5++;
                      continue L4;
                    }
                  }
                }
              }
              break L0;
            } else {
              L7: {
                if (qj.field_H == null) {
                  break L7;
                } else {
                  int discarded$5 = qj.field_H.a(jg.field_a, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                  break L7;
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var1, "il.E(" + 198 + ')');
        }
    }

    final static boolean a(byte param0) {
        int var1 = 34;
        return uk.b(15000);
    }

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        field_c = null;
        field_f = null;
    }

    final static void a(boolean param0, java.awt.Component param1) {
        try {
            param1.addMouseListener((java.awt.event.MouseListener) (Object) sg.field_i);
            param1.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) sg.field_i);
            param1.addFocusListener((java.awt.event.FocusListener) (Object) sg.field_i);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "il.A(" + false + ',' + (param1 != null ? "{...}" : "null") + ')');
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
              try {
                L0: {
                  var2 = new java.net.URL(param1.getCodeBase(), "subscribe.ws");
                  param1.getAppletContext().showDocument(ib.a(param1, var2, -5441), "_top");
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L1: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var2_ref2;
                stackOut_6_1 = new StringBuilder().append("il.C(").append(77).append(',');
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param1 == null) {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L1;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L1;
                }
              }
              throw pf.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = -1;
        field_f = new int[4];
        field_c = new int[8192];
    }
}
