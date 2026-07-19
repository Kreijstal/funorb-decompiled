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
        var3 = param0 << param2;
        if (0 != (ti.field_a & var3)) {
          return;
        } else {
          qf.field_l = qf.field_l | var3;
          ti.field_a = ti.field_a | var3;
          uc.field_b.a(new ra(param2), false);
          if (tc.field_j) {
            if ((dd.field_m ^ -1) > -3) {
              return;
            } else {
              ie.field_l.a(new pg(param2, param1, hi.field_c + qh.field_g, -(64 * sg.field_f) + wg.field_b, field_c + me.field_f, ic.field_a + 6 * qh.field_l), false);
              return;
            }
          } else {
            ie.field_l.a(new pg(param2, param1, hi.field_c + qh.field_g, -(64 * sg.field_f) + wg.field_b, field_c + me.field_f, ic.field_a + 6 * qh.field_l), false);
            return;
          }
        }
    }

    final static sf a(String param0, boolean param1) {
        RuntimeException var2 = null;
        sf stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        sf stackOut_2_0 = null;
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
              if (!param1) {
                break L1;
              } else {
                field_b = (long[]) null;
                break L1;
              }
            }
            stackOut_2_0 = new sf(param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("ql.E(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
          throw bd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
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
        if (!param0) {
          if (oa.field_c != null) {
            if (!oa.field_c.b(0)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          ql.a(-48, 28, 36);
          if (oa.field_c != null) {
            if (!oa.field_c.b(0)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void b(int param0) {
        int var1 = 8 % ((param0 - 73) / 33);
        field_a = null;
        field_b = null;
    }

    final int a(boolean param0, int param1, byte[] param2, int param3, int param4, byte[] param5) {
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_67_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_66_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
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
                      var7_int = this.field_d[var7_int];
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      var10 = this.field_d[var7_int];
                      if (0 > this.field_d[var7_int]) {
                        incrementValue$8 = param1;
                        param1++;
                        param2[incrementValue$8] = (byte)(var10 ^ -1);
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
                        var7_int = this.field_d[var7_int];
                        break L5;
                      } else {
                        var7_int++;
                        break L5;
                      }
                    }
                    L6: {
                      var10 = this.field_d[var7_int];
                      if (-1 >= (this.field_d[var7_int] ^ -1)) {
                        break L6;
                      } else {
                        incrementValue$9 = param1;
                        param1++;
                        param2[incrementValue$9] = (byte)(var10 ^ -1);
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
                        var7_int = this.field_d[var7_int];
                        break L7;
                      }
                    }
                    L8: {
                      var10 = this.field_d[var7_int];
                      if (0 <= this.field_d[var7_int]) {
                        break L8;
                      } else {
                        incrementValue$10 = param1;
                        param1++;
                        param2[incrementValue$10] = (byte)(var10 ^ -1);
                        if (param3 <= param1) {
                          break L3;
                        } else {
                          var7_int = 0;
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if ((var9 & 16) != 0) {
                        var7_int = this.field_d[var7_int];
                        break L9;
                      } else {
                        var7_int++;
                        break L9;
                      }
                    }
                    L10: {
                      var10 = this.field_d[var7_int];
                      if (-1 < (this.field_d[var7_int] ^ -1)) {
                        incrementValue$11 = param1;
                        param1++;
                        param2[incrementValue$11] = (byte)(var10 ^ -1);
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
                      if ((var9 & 8) != 0) {
                        var7_int = this.field_d[var7_int];
                        break L11;
                      } else {
                        var7_int++;
                        break L11;
                      }
                    }
                    L12: {
                      var10 = this.field_d[var7_int];
                      if (-1 >= (this.field_d[var7_int] ^ -1)) {
                        break L12;
                      } else {
                        incrementValue$12 = param1;
                        param1++;
                        param2[incrementValue$12] = (byte)(var10 ^ -1);
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
                        var7_int = this.field_d[var7_int];
                        break L13;
                      }
                    }
                    L14: {
                      var10 = this.field_d[var7_int];
                      if (this.field_d[var7_int] >= 0) {
                        break L14;
                      } else {
                        incrementValue$13 = param1;
                        param1++;
                        param2[incrementValue$13] = (byte)(var10 ^ -1);
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
                        var7_int = this.field_d[var7_int];
                        break L15;
                      }
                    }
                    L16: {
                      var10 = this.field_d[var7_int];
                      if (0 > this.field_d[var7_int]) {
                        incrementValue$14 = param1;
                        param1++;
                        param2[incrementValue$14] = (byte)(var10 ^ -1);
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
                      if (-1 == (var9 & 1 ^ -1)) {
                        var7_int++;
                        break L17;
                      } else {
                        var7_int = this.field_d[var7_int];
                        break L17;
                      }
                    }
                    L18: {
                      var10 = this.field_d[var7_int];
                      if (this.field_d[var7_int] < 0) {
                        incrementValue$15 = param1;
                        param1++;
                        param2[incrementValue$15] = (byte)(var10 ^ -1);
                        if (param3 > param1) {
                          var7_int = 0;
                          break L18;
                        } else {
                          break L3;
                        }
                      } else {
                        break L18;
                      }
                    }
                    var8++;
                    continue L1;
                  }
                  stackOut_66_0 = var8 - -1 + -param4;
                  stackIn_67_0 = stackOut_66_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_5_0 = 107;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var7 = decompiledCaughtException;
            stackOut_68_0 = (RuntimeException) (var7);
            stackOut_68_1 = new StringBuilder().append("ql.C(").append(param0).append(',').append(param1).append(',');
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param2 == null) {
              stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L19;
            } else {
              stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L19;
            }
          }
          L20: {
            stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
            stackOut_71_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param5 == null) {
              stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackOut_73_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L20;
            } else {
              stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L20;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_74_0), stackIn_74_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_67_0;
          }
        }
    }

    private ql() throws Throwable {
        throw new Error();
    }

    static {
        field_b = new long[32];
        field_a = "it with spells to knock";
    }
}
