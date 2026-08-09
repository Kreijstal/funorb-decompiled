/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj extends ah {
    private Object field_x;
    static String field_w;
    static bb field_z;
    static int field_y;
    static int field_v;

    public static void j(int param0) {
        field_z = null;
        field_w = null;
        if (param0 <= 77) {
            field_z = (bb) null;
        }
    }

    final static boolean a(pc param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == -32) {
              L1: {
                if ((param0.c(1, (byte) -34) ^ -1) != -2) {
                  stackIn_6_0 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("tj.H(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    tj(Object param0, int param1) {
        super(param1);
        try {
            this.field_x = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "tj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean b(boolean param0) {
        if (!param0) {
            return true;
        }
        return false;
    }

    final static void a(byte param0, java.awt.Component param1) {
        try {
            if (param0 != -128) {
                field_v = -81;
            }
            param1.addMouseListener(fj.field_c);
            param1.addMouseMotionListener(fj.field_c);
            param1.addFocusListener(fj.field_c);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "tj.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static hh b(byte param0) {
        hh var1 = new hh(field_y, jb.field_a, fa.field_b[0], e.field_b[0], gf.field_g[0], ge.field_c[0], wo.field_f[0], fl.field_g);
        if (param0 >= -78) {
            return (hh) null;
        }
        re.b(140);
        return var1;
    }

    final static void h(int param0) {
        uj.j(-705633312);
        gj.field_V = true;
        to.field_s = true;
        if (param0 != 20) {
            field_w = (String) null;
        }
        wa.field_c.e((byte) 54);
        ko.a(false, nb.field_b, param0 ^ -26047);
    }

    final static void a(int param0, boolean param1, int param2, int param3, jl param4, tf[] param5, int param6, int param7, tf[] param8, int param9, jl param10, byte param11, int param12, int param13, int param14) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15 = null;
        java.awt.Component var16 = null;
        tf[] var17 = null;
        try {
          L0: {
            L1: {
              if (param11 == 122) {
                break L1;
              } else {
                var16 = (java.awt.Component) null;
                tj.a((byte) 102, (java.awt.Component) null);
                break L1;
              }
            }
            var17 = (tf[]) null;
            da.a((tf[]) null, param6, param8, 0, param10, 0, ce.field_b, param4, 480, param2, (byte) -100, param14, param3, param0, param12, param13, param5, param9, sl.field_l, qo.field_s, param7);
            ai.a(param1, param11 ^ 124);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var15 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var15);

            stackIn_6_1 = new StringBuilder().append("tj.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param5 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param6).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param9).append(',');

            if (param10 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ')');
        }
    }

    final Object a(byte param0) {
        if (param0 != -55) {
            return (Object) null;
        }
        return this.field_x;
    }

    final static int a(int param0, CharSequence param1, boolean param2, boolean param3) {
        int stackIn_42_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 < 2) {
                break L1;
              } else {
                if ((param0 ^ -1) >= -37) {
                  var4_int = 0;
                  var5 = 0;
                  var6 = 0;
                  var7 = param1.length();
                  var8 = 0;
                  L2: while (true) {
                    if (var8 >= var7) {
                      L3: {
                        if (param2) {
                          break L3;
                        } else {
                          field_w = (String) null;
                          break L3;
                        }
                      }
                      if (var5 != 0) {
                        stackIn_42_0 = var6;
                        break L0;
                      } else {
                        throw new NumberFormatException();
                      }
                    } else {
                      L4: {
                        L5: {
                          var9 = param1.charAt(var8);
                          if (0 != var8) {
                            break L5;
                          } else {
                            if (45 == var9) {
                              var4_int = 1;
                              break L4;
                            } else {
                              if (var9 != 43) {
                                break L5;
                              } else {
                                if (!param3) {
                                  break L5;
                                } else {
                                  var8++;
                                  continue L2;
                                }
                              }
                            }
                          }
                        }
                        L6: {
                          L7: {
                            if (var9 < 48) {
                              break L7;
                            } else {
                              if (57 < var9) {
                                break L7;
                              } else {
                                var9 -= 48;
                                break L6;
                              }
                            }
                          }
                          L8: {
                            if (var9 < 65) {
                              break L8;
                            } else {
                              if (var9 <= 90) {
                                var9 -= 55;
                                break L6;
                              } else {
                                break L8;
                              }
                            }
                          }
                          L9: {
                            if (var9 < 97) {
                              break L9;
                            } else {
                              if (var9 > 122) {
                                break L9;
                              } else {
                                var9 -= 87;
                                break L6;
                              }
                            }
                          }
                          throw new NumberFormatException();
                        }
                        if (var9 < param0) {
                          L10: {
                            if (var4_int != 0) {
                              var9 = -var9;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          var10 = param0 * var6 - -var9;
                          if (var6 == var10 / param0) {
                            var6 = var10;
                            var5 = 1;
                            break L4;
                          } else {
                            throw new NumberFormatException();
                          }
                        } else {
                          throw new NumberFormatException();
                        }
                      }
                      var8++;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("" + param0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackIn_45_0 = (RuntimeException) (var4);

            stackIn_45_1 = new StringBuilder().append("tj.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "null";
              break L11;
            } else {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "{...}";
              break L11;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_46_0), stackIn_46_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_42_0;
    }

    final static boolean a(boolean param0, boolean param1, int param2, int param3) {
        int stackIn_33_0 = 0;
        int var4;
        int var5;
        L0: {
          if (param1) {
            if (ep.field_c[param3] > ep.field_c[param2]) {
              return true;
            } else {
              if (ep.field_c[param2] > ep.field_c[param3]) {
                return false;
              } else {
                if (nb.field_c[param2] >= nb.field_c[param3]) {
                  if (nb.field_c[param3] < nb.field_c[param2]) {
                    return false;
                  } else {
                    break L0;
                  }
                } else {
                  return true;
                }
              }
            }
          } else {
            if (nb.field_c[param3] > nb.field_c[param2]) {
              return true;
            } else {
              if (nb.field_c[param2] <= nb.field_c[param3]) {
                if (ep.field_c[param2] < ep.field_c[param3]) {
                  return true;
                } else {
                  if (ep.field_c[param3] < ep.field_c[param2]) {
                    return false;
                  } else {
                    break L0;
                  }
                }
              } else {
                return false;
              }
            }
          }
        }
        var4 = gh.field_q[param2] + vp.field_Fb[param2] + uc.field_b[param2];
        var5 = uc.field_b[param3] - (-vp.field_Fb[param3] + -gh.field_q[param3]);
        if (var4 >= var5) {
          if (var4 > var5) {
            return false;
          } else {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_w = (String) null;
                break L1;
              }
            }
            L2: {
              if (param2 >= param3) {
                stackIn_33_0 = 0;
                break L2;
              } else {
                stackIn_33_0 = 1;
                break L2;
              }
            }
            return stackIn_33_0 != 0;
          }
        } else {
          return true;
        }
    }

    final static void i(int param0) {
        int var1 = 0;
        if (-225 < (ia.field_h ^ -1)) {
            var1 = ia.field_h % 32;
            nk.a((byte) 93, ia.field_h - -32 + -var1);
        } else {
            nk.a((byte) 93, 256);
        }
        if (param0 != 32) {
            tj.j(117);
        }
    }

    static {
        field_w = "This password contains your Player Name, and would be easy to guess";
        field_v = 20;
        field_z = new bb();
    }
}
