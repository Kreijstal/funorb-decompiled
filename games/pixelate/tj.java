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
            field_z = null;
        }
    }

    final static boolean a(pc param0, int param1) {
        if (param1 != -32) {
            return false;
        }
        return (param0.c(1, (byte) -34) ^ -1) == -2 ? true : false;
    }

    tj(Object param0, int param1) {
        super(param1);
        ((tj) this).field_x = param0;
    }

    final boolean b(boolean param0) {
        if (!param0) {
            return true;
        }
        return false;
    }

    final static void a(byte param0, java.awt.Component param1) {
        if (param0 != -128) {
            field_v = -81;
        }
        param1.addMouseListener((java.awt.event.MouseListener) (Object) fj.field_c);
        param1.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) fj.field_c);
        param1.addFocusListener((java.awt.event.FocusListener) (Object) fj.field_c);
    }

    final static hh b(byte param0) {
        hh var1 = new hh(field_y, jb.field_a, fa.field_b[0], e.field_b[0], gf.field_g[0], ge.field_c[0], wo.field_f[0], fl.field_g);
        if (param0 >= -78) {
            return null;
        }
        re.b(140);
        return var1;
    }

    final static void h(int param0) {
        uj.j(-705633312);
        gj.field_V = true;
        to.field_s = true;
        if (param0 != 20) {
            field_w = null;
        }
        wa.field_c.e((byte) 54);
        ko.a(false, nb.field_b, param0 ^ -26047);
    }

    final static void a(int param0, boolean param1, int param2, int param3, jl param4, tf[] param5, int param6, int param7, tf[] param8, int param9, jl param10, byte param11, int param12, int param13, int param14) {
        if (param11 != 122) {
            Object var16 = null;
            tj.a((byte) 102, (java.awt.Component) null);
        }
        Object var17 = null;
        da.a((tf[]) null, param6, param8, 0, param10, 0, ce.field_b, param4, 480, param2, (byte) -100, param14, param3, param0, param12, param13, param5, param9, sl.field_l, qo.field_s, param7);
        ai.a(param1, param11 ^ 124);
    }

    final Object a(byte param0) {
        if (param0 != -55) {
            return null;
        }
        return ((tj) this).field_x;
    }

    final static int a(int param0, CharSequence param1, boolean param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = Pixelate.field_H ? 1 : 0;
          if (param0 < 2) {
            break L0;
          } else {
            if ((param0 ^ -1) >= -37) {
              var4 = 0;
              var5 = 0;
              var6 = 0;
              var7 = param1.length();
              var8 = 0;
              L1: while (true) {
                if (var8 >= var7) {
                  L2: {
                    if (param2) {
                      break L2;
                    } else {
                      field_w = null;
                      break L2;
                    }
                  }
                  if (var5 != 0) {
                    return var6;
                  } else {
                    throw new NumberFormatException();
                  }
                } else {
                  L3: {
                    var9 = param1.charAt(var8);
                    if (0 != var8) {
                      break L3;
                    } else {
                      if (45 == var9) {
                        var4 = 1;
                        var8++;
                        continue L1;
                      } else {
                        if (var9 != 43) {
                          break L3;
                        } else {
                          if (!param3) {
                            break L3;
                          } else {
                            var8++;
                            continue L1;
                          }
                        }
                      }
                    }
                  }
                  L4: {
                    L5: {
                      if (var9 < 48) {
                        break L5;
                      } else {
                        if (57 < var9) {
                          break L5;
                        } else {
                          var9 -= 48;
                          break L4;
                        }
                      }
                    }
                    L6: {
                      if (var9 < 65) {
                        break L6;
                      } else {
                        if (var9 <= 90) {
                          var9 -= 55;
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (var9 < 97) {
                        break L7;
                      } else {
                        if (var9 > 122) {
                          break L7;
                        } else {
                          var9 -= 87;
                          break L4;
                        }
                      }
                    }
                    throw new NumberFormatException();
                  }
                  if (var9 < param0) {
                    L8: {
                      if (var4 != 0) {
                        var9 = -var9;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    var10 = param0 * var6 - -var9;
                    if (var6 == var10 / param0) {
                      var6 = var10;
                      var5 = 1;
                      var8++;
                      continue L1;
                    } else {
                      throw new NumberFormatException();
                    }
                  } else {
                    throw new NumberFormatException();
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("" + param0);
    }

    final static boolean a(boolean param0, boolean param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
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
                field_w = null;
                break L1;
              }
            }
            L2: {
              if (param2 >= param3) {
                stackOut_32_0 = 0;
                stackIn_33_0 = stackOut_32_0;
                break L2;
              } else {
                stackOut_31_0 = 1;
                stackIn_33_0 = stackOut_31_0;
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = "This password contains your Player Name, and would be easy to guess";
        field_v = 20;
        field_z = new bb();
    }
}
