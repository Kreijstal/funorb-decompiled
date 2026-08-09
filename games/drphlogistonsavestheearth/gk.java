/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk {
    private nh[] field_c;
    static String field_b;
    static String field_a;

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
            fg var2 = (fg) null;
            gk.a((fg) null, 112);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void a(fg param0, int param1) {
        int var2_int = 0;
        fg var3 = null;
        int var4 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            if (param0.field_i == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                L2: {
                  if (param0.field_g != 0) {
                    break L2;
                  } else {
                    if (param0.field_d != 0) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                var2_int = 0;
                L3: while (true) {
                  if (sf.field_e <= var2_int) {
                    break L1;
                  } else {
                    L4: {
                      var3 = mi.field_c[var2_int];
                      if (2 != var3.field_a) {
                        break L4;
                      } else {
                        if (var3.field_g != param0.field_g) {
                          break L4;
                        } else {
                          if (param0.field_d != var3.field_d) {
                            break L4;
                          } else {
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                    }
                    var2_int++;
                    continue L3;
                  }
                }
              }
              L5: {
                if (param1 == -15980) {
                  break L5;
                } else {
                  field_b = (String) null;
                  break L5;
                }
              }
              L6: {
                if (null == param0.field_e) {
                  break L6;
                } else {
                  break L6;
                }
              }
              ja.a(param0, (byte) -60);
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2);

            stackIn_24_1 = new StringBuilder().append("gk.C(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L7;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L7;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    gk(nh[] param0) {
        try {
            this.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "gk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0, String param1, String param2) {
        String var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              param1 = ph.a(param1, (byte) -21, '_', "");
              var3 = vj.a(param2, -121);
              if (param0 == -1) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (-1 != param1.indexOf(param2)) {
                  break L3;
                } else {
                  if (param1.indexOf(var3) == -1) {
                    stackIn_7_0 = 0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_7_0 = 1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("gk.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        fg var7;
        if (param4 != 7453) {
          var7 = (fg) null;
          gk.a((fg) null, -125);
          am.a(param3, param0, param2, this.field_c, 14673, param1);
          return;
        } else {
          am.a(param3, param0, param2, this.field_c, 14673, param1);
          return;
        }
    }

    final static String a(int param0) {
        String var1 = "";
        if (pi.field_O != null) {
            var1 = pi.field_O.b(false);
        }
        if (param0 == var1.length()) {
            var1 = am.h(0);
        }
        if (var1.length() == 0) {
            var1 = u.field_e;
        }
        return var1;
    }

    static {
        field_b = "Username: ";
        field_a = "OVER <%0>";
    }
}
