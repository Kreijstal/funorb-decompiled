/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe extends li {
    static boolean field_r;
    int field_x;
    int field_n;
    int field_G;
    int field_C;
    int field_H;
    int field_y;
    int field_F;
    static String field_t;
    al field_K;
    static String field_u;
    gl field_p;
    int field_q;
    int field_A;
    int field_o;
    int field_s;
    int field_B;
    static String field_L;
    ae field_z;
    int field_I;
    ra field_J;
    int field_E;
    int field_w;
    int field_D;
    int field_v;

    final static wp a(String param0, boolean param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ud var6 = null;
        wp stackIn_3_0 = null;
        wp stackIn_6_0 = null;
        wp stackIn_18_0 = null;
        wp stackIn_21_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (-1 != (var2_int ^ -1)) {
              if (var2_int <= 63) {
                L1: {
                  if (param1) {
                    break L1;
                  } else {
                    var6 = (ud) null;
                    pe.a((ud) null, 53);
                    break L1;
                  }
                }
                var3 = 0;
                L2: while (true) {
                  if (var3 < var2_int) {
                    L3: {
                      var4 = param0.charAt(var3);
                      if (var4 == 45) {
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
                        stackIn_18_0 = bp.field_A;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        if (ke.field_d.indexOf(var4) != -1) {
                          break L3;
                        } else {
                          stackIn_21_0 = bp.field_A;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                    }
                    var3++;
                    continue L2;
                  } else {
                    return null;
                  }
                }
              } else {
                stackIn_6_0 = cg.field_a;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = ab.field_a;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var2);

            stackIn_26_1 = new StringBuilder().append("pe.E(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L5;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L5;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_18_0;
            } else {
              return stackIn_21_0;
            }
          }
        }
    }

    final void a(int param0) {
        this.field_p = null;
        this.field_z = null;
        this.field_J = null;
        if (param0 > -93) {
            this.field_q = -49;
        }
        this.field_K = null;
    }

    final static void a(ud param0, int param1) {
        param0.field_z = new int[]{-1};
        if (param1 <= 82) {
            return;
        }
        try {
            param0.field_u = new char[]{(char)63};
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "pe.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(boolean param0) {
        field_u = null;
        if (!param0) {
            return;
        }
        field_L = null;
        field_t = null;
    }

    final static boolean a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        int stackIn_8_0 = 0;
        L0: {
          if (param4 > 10) {
            break L0;
          } else {
            field_t = (String) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (param3 < param5) {
              break L2;
            } else {
              if (param3 >= param6 + param5) {
                break L2;
              } else {
                if (param2 < param1) {
                  break L2;
                } else {
                  if (param2 >= param0 + param1) {
                    break L2;
                  } else {
                    stackIn_8_0 = 1;
                    break L1;
                  }
                }
              }
            }
          }
          stackIn_8_0 = 0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    pe() {
    }

    static {
        field_t = "red died";
        field_L = "You won! <br><%0>% of the level was <%1>";
        field_u = "Status";
        field_r = true;
    }
}
