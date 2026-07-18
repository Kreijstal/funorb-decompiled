/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql {
    private int[] field_d;
    static String field_a;
    static long[] field_b;
    static int field_c;

    final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        var3 = 1 << param2;
        if (0 != (ti.field_a & var3)) {
          return;
        } else {
          qf.field_l = qf.field_l | var3;
          ti.field_a = ti.field_a | var3;
          uc.field_b.a((wl) (Object) new ra(param2), false);
          if (tc.field_j) {
            if (dd.field_m < 2) {
              return;
            } else {
              ie.field_l.a((wl) (Object) new pg(param2, param1, hi.field_c + qh.field_g, -(64 * sg.field_f) + wg.field_b, field_c + me.field_f, ic.field_a + 6 * qh.field_l), false);
              return;
            }
          } else {
            ie.field_l.a((wl) (Object) new pg(param2, param1, hi.field_c + qh.field_g, -(64 * sg.field_f) + wg.field_b, field_c + me.field_f, ic.field_a + 6 * qh.field_l), false);
            return;
          }
        }
    }

    final static sf a(String param0, boolean param1) {
        RuntimeException var2 = null;
        sf stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        sf stackOut_0_0 = null;
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
            stackOut_0_0 = new sf(param0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("ql.E(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
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
          throw bd.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + false + ')');
        }
        return stackIn_1_0;
    }

    final static void a(int param0) {
        if (param0 >= -32) {
            return;
        }
        if (null != jc.field_H) {
            jc.field_H.b((byte) 76);
            jc.field_H = null;
        }
    }

    final static boolean a(boolean param0) {
        if (oa.field_c == null) {
            return false;
        }
        if (!oa.field_c.b(0)) {
            return false;
        }
        return true;
    }

    public static void b(int param0) {
        int var1 = 0;
        field_a = null;
        field_b = null;
    }

    final int a(boolean param0, int param1, byte[] param2, int param3, int param4, byte[] param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_69_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_68_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        var11 = wizardrun.field_H;
        try {
          L0: {
            if (param3 != 0) {
              var7_int = 0;
              if (!param0) {
                param3 = param3 + param1;
                var8 = param4;
                L1: while (true) {
                  L2: {
                    var9 = param5[var8];
                    if (var9 >= 0) {
                      var7_int++;
                      break L2;
                    } else {
                      var7_int = ((ql) this).field_d[var7_int];
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      var10 = ((ql) this).field_d[var7_int];
                      if (0 > ((ql) this).field_d[var7_int]) {
                        int incrementValue$8 = param1;
                        param1++;
                        param2[incrementValue$8] = (byte)(~var10);
                        if (param3 > param1) {
                          var7_int = 0;
                          break L4;
                        } else {
                          break L3;
                        }
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (0 != (var9 & 64)) {
                        var7_int = ((ql) this).field_d[var7_int];
                        break L5;
                      } else {
                        var7_int++;
                        break L5;
                      }
                    }
                    L6: {
                      var10 = ((ql) this).field_d[var7_int];
                      if (((ql) this).field_d[var7_int] >= 0) {
                        break L6;
                      } else {
                        int incrementValue$9 = param1;
                        param1++;
                        param2[incrementValue$9] = (byte)(~var10);
                        if (param1 >= param3) {
                          break L3;
                        } else {
                          var7_int = 0;
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if ((32 & var9) == 0) {
                        var7_int++;
                        break L7;
                      } else {
                        var7_int = ((ql) this).field_d[var7_int];
                        break L7;
                      }
                    }
                    L8: {
                      var10 = ((ql) this).field_d[var7_int];
                      if (0 <= ((ql) this).field_d[var7_int]) {
                        break L8;
                      } else {
                        int incrementValue$10 = param1;
                        param1++;
                        param2[incrementValue$10] = (byte)(~var10);
                        if (param3 <= param1) {
                          break L3;
                        } else {
                          var7_int = 0;
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if ((var9 & 16) != -1) {
                        var7_int = ((ql) this).field_d[var7_int];
                        break L9;
                      } else {
                        var7_int++;
                        break L9;
                      }
                    }
                    L10: {
                      var10 = ((ql) this).field_d[var7_int];
                      if (-1 > ((ql) this).field_d[var7_int]) {
                        int incrementValue$11 = param1;
                        param1++;
                        param2[incrementValue$11] = (byte)(~var10);
                        if (param1 >= param3) {
                          break L3;
                        } else {
                          var7_int = 0;
                          break L10;
                        }
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if ((var9 & 8) != -1) {
                        var7_int = ((ql) this).field_d[var7_int];
                        break L11;
                      } else {
                        var7_int++;
                        break L11;
                      }
                    }
                    L12: {
                      var10 = ((ql) this).field_d[var7_int];
                      if (-1 <= ((ql) this).field_d[var7_int]) {
                        break L12;
                      } else {
                        int incrementValue$12 = param1;
                        param1++;
                        param2[incrementValue$12] = (byte)(~var10);
                        if (param3 <= param1) {
                          break L3;
                        } else {
                          var7_int = 0;
                          break L12;
                        }
                      }
                    }
                    L13: {
                      if (0 == (4 & var9)) {
                        var7_int++;
                        break L13;
                      } else {
                        var7_int = ((ql) this).field_d[var7_int];
                        break L13;
                      }
                    }
                    L14: {
                      var10 = ((ql) this).field_d[var7_int];
                      if (((ql) this).field_d[var7_int] >= 0) {
                        break L14;
                      } else {
                        int incrementValue$13 = param1;
                        param1++;
                        param2[incrementValue$13] = (byte)(~var10);
                        if (param1 < param3) {
                          var7_int = 0;
                          break L14;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L15: {
                      if ((2 & var9) == 0) {
                        var7_int++;
                        break L15;
                      } else {
                        var7_int = ((ql) this).field_d[var7_int];
                        break L15;
                      }
                    }
                    L16: {
                      var10 = ((ql) this).field_d[var7_int];
                      if (0 > ((ql) this).field_d[var7_int]) {
                        int incrementValue$14 = param1;
                        param1++;
                        param2[incrementValue$14] = (byte)(~var10);
                        if (param3 > param1) {
                          var7_int = 0;
                          break L16;
                        } else {
                          return var8 - -1 + -param4;
                        }
                      } else {
                        break L16;
                      }
                    }
                    L17: {
                      if ((var9 & 1) == 0) {
                        var7_int++;
                        break L17;
                      } else {
                        var7_int = ((ql) this).field_d[var7_int];
                        break L17;
                      }
                    }
                    L18: {
                      var10 = ((ql) this).field_d[var7_int];
                      if (((ql) this).field_d[var7_int] < 0) {
                        int incrementValue$15 = param1;
                        param1++;
                        param2[incrementValue$15] = (byte)(~var10);
                        if (param3 > param1) {
                          var7_int = 0;
                          var8++;
                          break L18;
                        } else {
                          break L3;
                        }
                      } else {
                        var8++;
                        break L18;
                      }
                    }
                    var8++;
                    continue L1;
                  }
                  stackOut_68_0 = var8 - -1 + -param4;
                  stackIn_69_0 = stackOut_68_0;
                  break L0;
                }
              } else {
                stackOut_5_0 = 107;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var7 = decompiledCaughtException;
            stackOut_70_0 = (RuntimeException) var7;
            stackOut_70_1 = new StringBuilder().append("ql.C(").append(param0).append(',').append(param1).append(',');
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param2 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L19;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L19;
            }
          }
          L20: {
            stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
            stackOut_73_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_75_0 = stackOut_73_0;
            stackIn_75_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param5 == null) {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "null";
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              break L20;
            } else {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "{...}";
              stackIn_76_0 = stackOut_74_0;
              stackIn_76_1 = stackOut_74_1;
              stackIn_76_2 = stackOut_74_2;
              break L20;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_76_0, stackIn_76_2 + ')');
        }
        return stackIn_69_0;
    }

    private ql() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new long[32];
        field_a = "it with spells to knock";
    }
}
