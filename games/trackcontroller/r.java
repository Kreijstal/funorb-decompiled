/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r extends fc {
    static oh field_k;
    static bc field_i;
    static int field_j;

    public static void d() {
        field_i = null;
        field_k = null;
    }

    final static void f() {
        gl.field_E.l(24910);
        if (ib.field_e == null) {
            ib.field_e = new rk(gl.field_E, tk.field_r);
        }
        gl.field_E.d((byte) -63, (al) (Object) ib.field_e);
    }

    private r() throws Throwable {
        throw new Error();
    }

    final static boolean b() {
        return !sa.field_Q.b((byte) 92);
    }

    final static String a(CharSequence param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_18_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_17_0 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var9 = TrackController.field_F ? 1 : 0;
        try {
          if (param0 != null) {
            var2_int = 0;
            var3 = param0.length();
            L0: while (true) {
              L1: {
                if (var2_int >= var3) {
                  break L1;
                } else {
                  if (!sf.a(param0.charAt(var2_int), -33)) {
                    break L1;
                  } else {
                    var2_int++;
                    continue L0;
                  }
                }
              }
              L2: while (true) {
                L3: {
                  if (var2_int >= var3) {
                    break L3;
                  } else {
                    if (!sf.a(param0.charAt(var3 - 1), -33)) {
                      break L3;
                    } else {
                      var3--;
                      continue L2;
                    }
                  }
                }
                var4 = var3 + -var2_int;
                if (1 <= var4) {
                  if (var4 <= 12) {
                    var5 = new StringBuilder(var4);
                    var6 = var2_int;
                    L4: while (true) {
                      if (var6 >= var3) {
                        if (var5.length() != 0) {
                          return var5.toString();
                        } else {
                          return null;
                        }
                      } else {
                        L5: {
                          var7 = param0.charAt(var6);
                          if (!ui.a(-19050, (char) var7)) {
                            break L5;
                          } else {
                            var8 = vh.a(true, (char) var7);
                            if (var8 == 0) {
                              break L5;
                            } else {
                              StringBuilder discarded$1 = var5.append(var8);
                              break L5;
                            }
                          }
                        }
                        var6++;
                        continue L4;
                      }
                    }
                  } else {
                    stackOut_17_0 = null;
                    stackIn_18_0 = stackOut_17_0;
                    return (String) (Object) stackIn_18_0;
                  }
                } else {
                  return null;
                }
              }
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var2;
            stackOut_29_1 = new StringBuilder().append("r.A(");
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
              break L6;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L6;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 44 + -11133 + 41);
        }
    }

    final static void a(int param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              int discarded$6 = 103;
              j.a((java.awt.Component) (Object) param1);
              fb.a(-113, (java.awt.Component) (Object) param1);
              if (null == rd.field_l) {
                break L1;
              } else {
                rd.field_l.a((java.awt.Component) (Object) param1, 23817);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var2;
            stackOut_3_1 = new StringBuilder().append("r.B(").append(-32652).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final static int e() {
        return kk.field_h;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = -1;
    }
}
