/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class wt extends fd implements jp {
    static int field_v;
    static int field_x;
    static ut field_y;
    static ut[] field_z;
    fd[] field_w;
    static wu field_A;

    private final boolean a(fd param0, int param1, int param2) {
        int var4 = 0;
        fd var5 = null;
        fd var6 = null;
        int var7 = 0;
        var7 = Kickabout.field_G;
        if (((wt) this).field_w == null) {
          return false;
        } else {
          if (param1 == -28) {
            var4 = 0;
            L0: while (true) {
              if (var4 >= ((wt) this).field_w.length) {
                return false;
              } else {
                var5 = ((wt) this).field_w[var4];
                if (var5 != null) {
                  if (var5.b(100)) {
                    var4 = var4 + param2;
                    L1: while (true) {
                      if (var4 < ((wt) this).field_w.length) {
                        L2: {
                          var6 = ((wt) this).field_w[var4];
                          if (var6 != null) {
                            if (!var6.a(param0, param1 ^ -28)) {
                              break L2;
                            } else {
                              return true;
                            }
                          } else {
                            break L2;
                          }
                        }
                        var4 = var4 + param2;
                        continue L1;
                      } else {
                        var4++;
                        continue L0;
                      }
                    }
                  } else {
                    var4++;
                    continue L0;
                  }
                } else {
                  var4++;
                  continue L0;
                }
              }
            }
          } else {
            return true;
          }
        }
    }

    final boolean b(int param0) {
        if (param0 < 10) {
            return true;
        }
        return this.a(true) != null ? true : false;
    }

    final StringBuilder a(int param0, int param1, Hashtable param2, StringBuilder param3) {
        if (param0 != 17883) {
            Object var6 = null;
            boolean discarded$0 = ((wt) this).a(125, (fd) null, 11, -44, 107, -118, 34);
        }
        if (!(!((wt) this).a(1, param3, param2, param1))) {
            ((wt) this).b(param1, param3, param2, param0 ^ -3421);
            this.a(param2, 10, param1, param3);
        }
        return param3;
    }

    final static wh a(int param0, boolean param1, boolean param2, int param3, int param4, int param5) {
        if (-17 >= (pn.field_z.a(false) ^ -1)) {
            return null;
        }
        int var7 = -79 % ((-85 - param5) / 32);
        wh var6 = new wh(param3, param0, param4, param2, param1);
        pn.field_z.a((gn) (Object) var6, 3);
        return var6;
    }

    public static void b(boolean param0) {
        field_y = null;
        field_z = null;
        if (param0) {
            field_y = null;
        }
        field_A = null;
    }

    private final void a(Hashtable param0, int param1, int param2, StringBuilder param3) {
        int var6 = 0;
        fd var7 = null;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        fd[] var11 = null;
        var9 = Kickabout.field_G;
        if (null == ((wt) this).field_w) {
          return;
        } else {
          L0: {
            if (param1 == 10) {
              break L0;
            } else {
              var10 = null;
              ((wt) this).a((byte) 88, (fd) null, 119, 67);
              break L0;
            }
          }
          var11 = ((wt) this).field_w;
          var6 = 0;
          L1: while (true) {
            if (var6 >= var11.length) {
              return;
            } else {
              var7 = var11[var6];
              StringBuilder discarded$34 = param3.append(10);
              var8 = 0;
              L2: while (true) {
                if (param2 < var8) {
                  if (var7 != null) {
                    StringBuilder discarded$35 = var7.a(17883, param2 - -1, param0, param3);
                    var6++;
                    continue L1;
                  } else {
                    StringBuilder discarded$36 = param3.append("null");
                    var6++;
                    continue L1;
                  }
                } else {
                  StringBuilder discarded$37 = param3.append(32);
                  var8++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    private final boolean a(int param0, fd param1) {
        if (param0 != 9) {
            return true;
        }
        return this.a(-17305, param1, 1);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        ((wt) this).a((byte) -118);
    }

    private final boolean b(fd param0, int param1) {
        if (param1 < 84) {
            int discarded$0 = ((wt) this).f((byte) 119);
        }
        return this.a(param0, -28, 1);
    }

    final boolean a(char param0, byte param1, fd param2, int param3) {
        fd[] var5_ref_fd__ = null;
        int var5 = 0;
        int var6 = 0;
        fd var7 = null;
        int var8 = 0;
        fd[] var9 = null;
        boolean stackIn_19_0 = false;
        boolean stackOut_18_0 = false;
        boolean stackOut_17_0 = false;
        var8 = Kickabout.field_G;
        if (null != ((wt) this).field_w) {
          var9 = ((wt) this).field_w;
          var5_ref_fd__ = var9;
          var6 = 0;
          L0: while (true) {
            if (var6 >= var9.length) {
              L1: {
                if (param1 < -60) {
                  break L1;
                } else {
                  field_v = -42;
                  break L1;
                }
              }
              var5 = param3;
              if (80 == var5) {
                L2: {
                  if (!ne.field_G[81]) {
                    stackOut_18_0 = this.b(param2, 87);
                    stackIn_19_0 = stackOut_18_0;
                    break L2;
                  } else {
                    stackOut_17_0 = this.a(9, param2);
                    stackIn_19_0 = stackOut_17_0;
                    break L2;
                  }
                }
                return stackIn_19_0;
              } else {
                return false;
              }
            } else {
              var7 = var9[var6];
              if (var7 != null) {
                if (var7.b(35)) {
                  if (var7.a(param0, (byte) -123, param2, param3)) {
                    return true;
                  } else {
                    var6++;
                    continue L0;
                  }
                } else {
                  var6++;
                  continue L0;
                }
              } else {
                var6++;
                continue L0;
              }
            }
          }
        } else {
          return false;
        }
    }

    final static void a(int param0, nu param1, int param2, ut[] param3) {
        int var4 = 0;
        int var5 = 0;
        var5 = Kickabout.field_G;
        nw.field_b = param1;
        ek.field_G = param2;
        tm.field_n = param3;
        if (param0 == 0) {
          L0: {
            if ((ek.field_G ^ -1) == 1) {
              af.field_a = null;
              break L0;
            } else {
              af.field_a = new dt[4];
              var4 = 0;
              L1: while (true) {
                if ((var4 ^ -1) <= -5) {
                  break L0;
                } else {
                  af.field_a[var4] = new dt((gm) (Object) nw.field_b.field_P[nw.field_b.field_g[ek.field_G].field_p][var4 - -1], var4 + 1);
                  var4++;
                  continue L1;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final static boolean a(tj param0, nl param1, byte param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        nl stackIn_14_0 = null;
        nl stackIn_15_0 = null;
        nl stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        nl stackOut_13_0 = null;
        nl stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        nl stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        L0: {
          if (-1 != param0.field_m) {
            break L0;
          } else {
            if (0 == param0.field_h) {
              break L0;
            } else {
              L1: {
                var4 = -(param1.field_o >> 235307553) + 20;
                if (param2 == -75) {
                  break L1;
                } else {
                  var8 = null;
                  wn discarded$2 = wt.a(69, (String[]) null);
                  break L1;
                }
              }
              L2: {
                var5 = (param1.field_w + -param0.field_p) / param0.field_h;
                var5 = 9 * var5 >> -468456381;
                if (-3 <= (var5 ^ -1)) {
                  break L2;
                } else {
                  if (var5 >= var4) {
                    break L2;
                  } else {
                    L3: {
                      var6 = param0.field_t - -(param0.field_q * var5);
                      var7 = Math.abs(-var6 + param1.field_M);
                      if ((var6 ^ -1) >= -24379393) {
                        break L3;
                      } else {
                        if (var6 < 34275328) {
                          if (-28 + (var7 >> 1397024848) > 12) {
                            param1.c(var6, 5);
                            return true;
                          } else {
                            L4: {
                              stackOut_13_0 = (nl) param1;
                              stackIn_15_0 = stackOut_13_0;
                              stackIn_14_0 = stackOut_13_0;
                              if (param1.field_M < var6) {
                                stackOut_15_0 = (nl) (Object) stackIn_15_0;
                                stackOut_15_1 = 8;
                                stackIn_16_0 = stackOut_15_0;
                                stackIn_16_1 = stackOut_15_1;
                                break L4;
                              } else {
                                stackOut_14_0 = (nl) (Object) stackIn_14_0;
                                stackOut_14_1 = 2;
                                stackIn_16_0 = stackOut_14_0;
                                stackIn_16_1 = stackOut_14_1;
                                break L4;
                              }
                            }
                            stackIn_16_0.field_G = stackIn_16_1;
                            return true;
                          }
                        } else {
                          break L3;
                        }
                      }
                    }
                    param1.field_G = 0;
                    return false;
                  }
                }
              }
              return false;
            }
          }
        }
        return false;
    }

    final static wn a(int param0, String[] param1) {
        if (param0 > -108) {
            return null;
        }
        wn var2 = new wn(false);
        var2.field_f = param1;
        return var2;
    }

    abstract void a(byte param0);

    void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        fd var6 = null;
        int var7 = 0;
        L0: {
          var7 = Kickabout.field_G;
          if (0 != param0) {
            break L0;
          } else {
            if (null == ((wt) this).field_r) {
              break L0;
            } else {
              ((wt) this).field_r.a(126, true, param3, (fd) this, param2);
              break L0;
            }
          }
        }
        L1: {
          if (param1 == 65) {
            break L1;
          } else {
            field_x = -84;
            break L1;
          }
        }
        L2: {
          if (((wt) this).field_w != null) {
            var5 = ((wt) this).field_w.length + -1;
            L3: while (true) {
              if (var5 < 0) {
                break L2;
              } else {
                var6 = ((wt) this).field_w[var5];
                if (var6 != null) {
                  var6.a(param0, 65, param2 - -((wt) this).field_t, ((wt) this).field_g + param3);
                  var5--;
                  continue L3;
                } else {
                  var5--;
                  continue L3;
                }
              }
            }
          } else {
            break L2;
          }
        }
    }

    final String f(int param0) {
        fd[] var2 = null;
        int var3 = 0;
        fd var4 = null;
        String var5 = null;
        int var6 = 0;
        fd[] var7 = null;
        var6 = Kickabout.field_G;
        if (((wt) this).field_w != null) {
          L0: {
            var7 = ((wt) this).field_w;
            var2 = var7;
            if (param0 == -1) {
              break L0;
            } else {
              field_A = null;
              break L0;
            }
          }
          var3 = 0;
          L1: while (true) {
            if (var7.length > var3) {
              var4 = var7[var3];
              if (var4 != null) {
                var5 = var4.f(-1);
                if (var5 != null) {
                  return var5;
                } else {
                  var3++;
                  continue L1;
                }
              } else {
                var3++;
                continue L1;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final int f(byte param0) {
        int var2 = 0;
        fd[] var3 = null;
        int var4 = 0;
        fd var5 = null;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        var7 = Kickabout.field_G;
        var2 = 0;
        var3 = ((wt) this).field_w;
        var4 = 0;
        L0: while (true) {
          if (var3.length <= var4) {
            L1: {
              if (param0 == 118) {
                break L1;
              } else {
                var8 = null;
                boolean discarded$1 = ((wt) this).a(20, (fd) null, 22, -126, -123, 63, -127);
                break L1;
              }
            }
            return var2;
          } else {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.f((byte) 118);
              if (var2 < var6) {
                var2 = var6;
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    wt(int param0, int param1, int param2, int param3, gj param4) {
        super(param0, param1, param2, param3, param4, (jv) null);
    }

    final boolean a(boolean param0, int param1, int param2, fd param3, int param4, int param5, int param6) {
        fd[] var8 = null;
        int var9 = 0;
        fd var10 = null;
        int var11 = 0;
        fd[] var12 = null;
        var11 = Kickabout.field_G;
        if (((wt) this).field_w != null) {
          L0: {
            if (param0) {
              break L0;
            } else {
              field_v = -64;
              break L0;
            }
          }
          var12 = ((wt) this).field_w;
          var8 = var12;
          var9 = 0;
          L1: while (true) {
            if (var9 >= var12.length) {
              return false;
            } else {
              var10 = var12[var9];
              if (var10 != null) {
                if (var10.a(param0, param1 - -((wt) this).field_g, param2, param3, param4, param5 - -((wt) this).field_t, param6)) {
                  return true;
                } else {
                  var9++;
                  continue L1;
                }
              } else {
                var9++;
                continue L1;
              }
            }
          }
        } else {
          return false;
        }
    }

    private final fd a(boolean param0) {
        fd[] var2 = null;
        int var3 = 0;
        fd var4 = null;
        int var5 = 0;
        fd[] var6 = null;
        var5 = Kickabout.field_G;
        if (null != ((wt) this).field_w) {
          var6 = ((wt) this).field_w;
          var2 = var6;
          var3 = 0;
          L0: while (true) {
            if (var3 >= var6.length) {
              if (!param0) {
                String discarded$1 = ((wt) this).f(91);
                return null;
              } else {
                return null;
              }
            } else {
              var4 = var6[var3];
              if (var4 != null) {
                if (var4.b(100)) {
                  return var4;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    final void a(int param0, int param1, int param2, fd param3, int param4, int param5) {
        fd[] var7 = null;
        int var8 = 0;
        fd var9 = null;
        int var10 = 0;
        fd[] var11 = null;
        var10 = Kickabout.field_G;
        if (null != ((wt) this).field_w) {
          var11 = ((wt) this).field_w;
          var7 = var11;
          var8 = 0;
          L0: while (true) {
            if (var11.length <= var8) {
              L1: {
                if (param4 == -1) {
                  break L1;
                } else {
                  wh discarded$1 = wt.a(-45, false, false, 110, 69, -102);
                  break L1;
                }
              }
              return;
            } else {
              var9 = var11[var8];
              if (var9 != null) {
                var9.a(((wt) this).field_g + param0, param1, param2, param3, -1, ((wt) this).field_t + param5);
                var8++;
                continue L0;
              } else {
                var8++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    void a(byte param0, fd param1, int param2, int param3) {
        fd[] var5 = null;
        int var6 = 0;
        fd var7 = null;
        int var8 = 0;
        fd[] var9 = null;
        var8 = Kickabout.field_G;
        super.a(param0, param1, param2, param3);
        if (null != ((wt) this).field_w) {
          var9 = ((wt) this).field_w;
          var5 = var9;
          var6 = 0;
          L0: while (true) {
            if (var6 >= var9.length) {
              return;
            } else {
              var7 = var9[var6];
              if (var7 != null) {
                var7.a((byte) 12, param1, ((wt) this).field_t + param2, ((wt) this).field_g + param3);
                var6++;
                continue L0;
              } else {
                var6++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    private final boolean a(int param0, fd param1, int param2) {
        int var4 = 0;
        fd var5 = null;
        fd var6 = null;
        int var7 = 0;
        var7 = Kickabout.field_G;
        if (((wt) this).field_w != null) {
          L0: {
            if (param0 == -17305) {
              break L0;
            } else {
              field_z = null;
              break L0;
            }
          }
          var4 = -1 + ((wt) this).field_w.length;
          L1: while (true) {
            if (-1 < (var4 ^ -1)) {
              return false;
            } else {
              var5 = ((wt) this).field_w[var4];
              if (var5 != null) {
                if (var5.b(92)) {
                  var4 = var4 - param2;
                  L2: while (true) {
                    if (var4 >= 0) {
                      L3: {
                        var6 = ((wt) this).field_w[var4];
                        if (var6 == null) {
                          break L3;
                        } else {
                          if (var6.a(param1, 0)) {
                            return true;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var4 = var4 - param2;
                      continue L2;
                    } else {
                      var4--;
                      continue L1;
                    }
                  }
                } else {
                  var4--;
                  continue L1;
                }
              } else {
                var4--;
                continue L1;
              }
            }
          }
        } else {
          return false;
        }
    }

    final void g(int param0) {
        fd[] var2 = null;
        int var3 = 0;
        fd var4 = null;
        int var5 = 0;
        fd[] var6 = null;
        var5 = Kickabout.field_G;
        var6 = ((wt) this).field_w;
        var2 = var6;
        var3 = 0;
        L0: while (true) {
          if (var6.length <= var3) {
            L1: {
              if (param0 == 84) {
                break L1;
              } else {
                field_z = null;
                break L1;
              }
            }
            return;
          } else {
            var4 = var6[var3];
            if (var4 != null) {
              var4.g(84);
              var3++;
              continue L0;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    final boolean a(int param0, fd param1, int param2, int param3, int param4, int param5, int param6) {
        fd[] var8 = null;
        int var9 = 0;
        fd var10 = null;
        int var11 = 0;
        fd[] var12 = null;
        var11 = Kickabout.field_G;
        if (null == ((wt) this).field_w) {
          return false;
        } else {
          var12 = ((wt) this).field_w;
          var8 = var12;
          var9 = 0;
          L0: while (true) {
            if (var9 >= var12.length) {
              var9 = -27 / ((param6 - 63) / 56);
              return false;
            } else {
              var10 = var12[var9];
              if (var10 != null) {
                if (var10.b(127)) {
                  if (var10.a(param0, param1, param2, param3, param4, param5, -87)) {
                    return true;
                  } else {
                    var9++;
                    continue L0;
                  }
                } else {
                  var9++;
                  continue L0;
                }
              } else {
                var9++;
                continue L0;
              }
            }
          }
        }
    }

    final boolean a(fd param0, int param1) {
        fd[] var3 = null;
        int var4 = 0;
        fd var5 = null;
        int var6 = 0;
        fd[] var7 = null;
        var6 = Kickabout.field_G;
        var7 = ((wt) this).field_w;
        var3 = var7;
        var4 = param1;
        L0: while (true) {
          if (var4 >= var7.length) {
            return false;
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              if (var5.a(param0, param1 + 0)) {
                return true;
              } else {
                var4++;
                continue L0;
              }
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    static {
    }
}
