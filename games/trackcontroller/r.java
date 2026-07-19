/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r extends fc {
    static oh field_k;
    static bc field_i;
    static int field_j;

    public static void d(int param0) {
        field_i = null;
        if (param0 != -1) {
            r.f(84);
        }
        field_k = null;
    }

    final static void f(int param0) {
        gl.field_E.l(24910);
        if (param0 != -635) {
            return;
        }
        if (ib.field_e == null) {
            ib.field_e = new rk(gl.field_E, tk.field_r);
        }
        gl.field_E.d((byte) -63, ib.field_e);
    }

    private r() throws Throwable {
        throw new Error();
    }

    final static boolean b(boolean param0) {
        int discarded$0 = 0;
        if (!param0) {
            discarded$0 = r.e(-40);
        }
        return !sa.field_Q.b((byte) 92) ? true : false;
    }

    final static String a(CharSequence param0, int param1) {
        StringBuilder discarded$1 = null;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String stackIn_10_0 = null;
        Object stackIn_18_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_17_0 = null;
        String stackOut_9_0 = null;
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
          L0: {
            if (param0 != null) {
              var2_int = 0;
              var3 = param0.length();
              L1: while (true) {
                L2: {
                  if (var2_int >= var3) {
                    break L2;
                  } else {
                    if (!sf.a(param0.charAt(var2_int), -33)) {
                      break L2;
                    } else {
                      var2_int++;
                      continue L1;
                    }
                  }
                }
                if (param1 == -11133) {
                  L3: while (true) {
                    L4: {
                      if (var2_int >= var3) {
                        break L4;
                      } else {
                        if (!sf.a(param0.charAt(var3 - 1), param1 ^ 11100)) {
                          break L4;
                        } else {
                          var3--;
                          continue L3;
                        }
                      }
                    }
                    var4 = var3 + -var2_int;
                    if (1 <= var4) {
                      if (-13 <= (var4 ^ -1)) {
                        var5 = new StringBuilder(var4);
                        var6 = var2_int;
                        L5: while (true) {
                          if (var6 >= var3) {
                            if (-1 != (var5.length() ^ -1)) {
                              return var5.toString();
                            } else {
                              return null;
                            }
                          } else {
                            L6: {
                              var7 = param0.charAt(var6);
                              if (!ui.a(-19050, (char) var7)) {
                                break L6;
                              } else {
                                var8 = vh.a(true, (char) var7);
                                if (var8 == 0) {
                                  break L6;
                                } else {
                                  discarded$1 = var5.append((char) var8);
                                  break L6;
                                }
                              }
                            }
                            var6++;
                            continue L5;
                          }
                        }
                      } else {
                        stackOut_17_0 = null;
                        stackIn_18_0 = stackOut_17_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  stackOut_9_0 = (String) null;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var2);
            stackOut_29_1 = new StringBuilder().append("r.A(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L7;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L7;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          return (String) ((Object) stackIn_18_0);
        }
    }

    final static void a(int param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              j.a((java.awt.Component) ((Object) param1), 103);
              fb.a(param0 + 32539, (java.awt.Component) ((Object) param1));
              if (param0 == -32652) {
                break L1;
              } else {
                field_i = (bc) null;
                break L1;
              }
            }
            L2: {
              if (null == rd.field_l) {
                break L2;
              } else {
                rd.field_l.a((java.awt.Component) ((Object) param1), 23817);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("r.B(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    final static int e(int param0) {
        if (param0 != -12364) {
            return -34;
        }
        return kk.field_h;
    }

    static {
        field_j = -1;
    }
}
