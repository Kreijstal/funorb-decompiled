/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gf {
    static volatile int field_b;
    static hu field_a;
    static String field_i;
    int field_g;
    static String field_d;
    static String field_h;
    static int field_c;
    static String field_f;
    static String[] field_e;

    final static boolean a(byte[] param0, int param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (param0 != null) {
              if (param2 < 2) {
                L1: {
                  var4_int = param1 / 8;
                  if (param0.length <= var4_int) {
                    break L1;
                  } else {
                    if (var4_int < 0) {
                      break L1;
                    } else {
                      L2: {
                        var5 = param0[var4_int];
                        var6 = 7 - (7 & param1);
                        if ((var5 & 1 << var6) == 0) {
                          stackOut_13_0 = 0;
                          stackIn_14_0 = stackOut_13_0;
                          break L2;
                        } else {
                          stackOut_12_0 = 1;
                          stackIn_14_0 = stackOut_12_0;
                          break L2;
                        }
                      }
                      break L0;
                    }
                  }
                }
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0 != 0;
              } else {
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("gf.D(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param1 + 44 + param2 + 44 + 3231 + 41);
        }
        return stackIn_14_0 != 0;
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int[] var5 = null;
        ml var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var11 = null;
        int[] var12 = null;
        dk var13 = null;
        ii var14 = null;
        ml var15 = null;
        Object var16 = null;
        dk var16_ref = null;
        RuntimeException decompiledCaughtException = null;
        var16 = null;
        var9 = Kickabout.field_G;
        try {
          L0: {
            var15 = un.field_e;
            var2 = 123 % ((param0 - -25) / 60);
            var3 = var15.h((byte) -106);
            if (var3 != 0) {
              if (var3 == 1) {
                var14 = (ii) (Object) il.field_a.g(24009);
                if (var14 != null) {
                  var14.c((byte) -109);
                  break L0;
                } else {
                  lr.b((byte) -116);
                  return;
                }
              } else {
                if (2 != var3) {
                  bd.a("A1: " + tr.b(0), (Throwable) null, 1);
                  lr.b((byte) -116);
                  return;
                } else {
                  var16_ref = (dk) (Object) ap.field_j.g(24009);
                  if (var16_ref != null) {
                    var16_ref.field_e = st.c(-23091);
                    var16_ref.field_f = true;
                    var16_ref.c((byte) -109);
                    return;
                  } else {
                    lr.b((byte) -116);
                    return;
                  }
                }
              }
            } else {
              var12 = st.c(-23091);
              var4 = var12;
              var11 = var12;
              var5 = var11;
              var6 = var15;
              var7 = ((iw) (Object) var6).h((byte) -108);
              var8 = 0;
              L1: while (true) {
                if (var7 <= var8) {
                  var13 = (dk) (Object) ap.field_j.g(24009);
                  if (var13 != null) {
                    var13.field_e = var4;
                    var13.field_f = true;
                    var13.c((byte) -109);
                    return;
                  } else {
                    lr.b((byte) -116);
                    return;
                  }
                } else {
                  var11[var8] = ((iw) (Object) var6).k(4);
                  var8++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "gf.A(" + param0 + 41);
        }
    }

    final static vq a(bu param0, int param1, int param2, int param3, int param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        vq var7 = null;
        java.awt.Frame var8 = null;
        Object stackIn_2_0 = null;
        vq stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        vq stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var8 = ol.a(param1 ^ -9027, param4, param2, param3, param0, param5);
            var6 = var8;
            if (var8 != null) {
              var7 = new vq();
              var7.field_c = var8;
              java.awt.Component discarded$2 = var7.field_c.add((java.awt.Component) (Object) var7);
              var7.setBounds(param1, 0, param4, param2);
              var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
              var7.requestFocus();
              stackOut_3_0 = (vq) var7;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (vq) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var6_ref;
            stackOut_5_1 = new StringBuilder().append("gf.B(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_4_0;
    }

    public static void a(int param0) {
        field_d = null;
        field_e = null;
        field_i = null;
        field_f = null;
        field_a = null;
        field_h = null;
    }

    final static ld a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        ld var5 = null;
        ld stackIn_4_0 = null;
        ld stackIn_7_0 = null;
        ld stackIn_10_0 = null;
        ld stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        ld stackOut_11_0 = null;
        ld stackOut_9_0 = null;
        ld stackOut_6_0 = null;
        ld stackOut_3_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (param1.length() != 0) {
                  var2_int = param1.indexOf((int) (char)param0);
                  if (var2_int != -1) {
                    var3 = param1.substring(0, var2_int);
                    var4 = param1.substring(1 + var2_int);
                    var5 = gp.a((byte) -25, var3);
                    if (var5 == null) {
                      stackOut_11_0 = ie.a(var4, param0 + -64);
                      stackIn_12_0 = stackOut_11_0;
                      break L0;
                    } else {
                      stackOut_9_0 = (ld) var5;
                      stackIn_10_0 = stackOut_9_0;
                      return stackIn_10_0;
                    }
                  } else {
                    stackOut_6_0 = ld.field_b;
                    stackIn_7_0 = stackOut_6_0;
                    return stackIn_7_0;
                  }
                } else {
                  break L1;
                }
              }
            }
            stackOut_3_0 = cb.field_c;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var2;
            stackOut_13_1 = new StringBuilder().append("gf.E(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_12_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = -1;
        field_i = "Unrated game";
        field_h = "Game options changed (<%0>)";
        field_f = "You can ask to join this game";
        field_d = "Use PageUp/PageDown or scroll the mouse wheel to zoom the camera.";
        field_e = new String[]{"Slots", "Trinkets"};
    }
}
