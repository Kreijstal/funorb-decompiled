/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class qk extends ah {
    static int[] field_Kb;
    private int field_Lb;
    static vn[] field_Hb;
    private boolean field_wb;
    kd field_yb;
    int field_Ab;
    private int field_Fb;
    int field_Eb;
    static al[] field_Jb;
    static int[] field_Cb;
    static int field_Db;
    private int field_zb;
    int field_Gb;
    static int field_Mb;
    private int field_xb;
    private int field_Ib;
    private boolean field_Bb;

    final static vn c(int param0, byte param1, int param2) {
        int var5 = ZombieDawn.field_J;
        vn var6 = new vn(param2, param2);
        vn var3 = var6;
        int var4 = 0;
        if (param1 != -71) {
            return null;
        }
        while (var4 < var3.field_z.length) {
            var6.field_z[var4] = param0;
            var4++;
        }
        return var3;
    }

    public static void v(int param0) {
        field_Hb = null;
        if (param0 != 15213) {
            return;
        }
        field_Cb = null;
        field_Jb = null;
        field_Kb = null;
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4) {
        int var5 = 0;
        if (bi.field_f == bd.field_e) {
            if (!(bi.field_a == nh.field_P)) {
                return;
            }
            if (param4) {
                qk.v(32);
            }
            var5 = 3;
            bi.a(param3, param0, param1, param2, 0, 96);
            bi.h(var5, var5, param3, param0, param1, param2);
            return;
        }
    }

    void a(byte param0, wk param1) {
        super.a((byte) -83, param1);
        if (param0 <= -76) {
          L0: {
            if (((qk) this).field_G != 1) {
              break L0;
            } else {
              if ((((qk) this).field_F ^ -1) != -11) {
                break L0;
              } else {
                ((qk) this).b(param1.a(((qk) this).a(true), (byte) -70), (byte) -114, param1.a(((qk) this).f(237239984), 0));
                break L0;
              }
            }
          }
          L1: {
            if (!ng.field_e) {
              break L1;
            } else {
              if (-29 == ((qk) this).field_t) {
                ((qk) this).a(param1, 5060);
                break L1;
              } else {
                if (-24 == ((qk) this).field_t) {
                  ((qk) this).a(param1, 5060);
                  break L1;
                } else {
                  if (18 != ((qk) this).field_t) {
                    break L1;
                  } else {
                    ((qk) this).a(param1, 5060);
                    break L1;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final void e(int param0, int param1) {
        if (-11 != (param0 ^ -1)) {
            if (param0 != 11) {
                if (null != ((qk) this).field_yb) {
                    ((qk) this).field_yb.field_hb = false;
                    ((qk) this).field_yb = null;
                }
            }
        }
        super.e(param0, param1);
    }

    final static void n(byte param0) {
        int var2 = 0;
        va var3 = null;
        int var4 = ZombieDawn.field_J;
        if (param0 <= 79) {
            return;
        }
        va[] var5 = pa.field_x;
        va[] var1 = var5;
        for (var2 = 0; var2 < var5.length; var2++) {
            var3 = var5[var2];
            var3.a((byte) 126);
        }
    }

    private final boolean a(int param0, boolean param1, int param2) {
        kd var5 = null;
        int var6 = ZombieDawn.field_J;
        ((qk) this).field_mb = 2147483647;
        ((qk) this).field_sb = null;
        ((qk) this).field_fb = false;
        if (param0 != -19718) {
            ((qk) this).g(-115);
        }
        fb var4 = ((qk) this).a((byte) -74, param2, 2);
        while (var4 != null) {
            var5 = (kd) (Object) var4;
            if (!var5.field_hb) {
                if (var5.field_F != 9) {
                    if (var5.x(param0 ^ -19794)) {
                        if (!param1) {
                            // ifeq L162
                        }
                        if (((qk) this).field_mb > ((qk) this).field_s) {
                            ((qk) this).field_sb = var4;
                            ((qk) this).field_mb = ((qk) this).field_s;
                        }
                        ((qk) this).field_fb = var5.field_bb > 0 ? true : false;
                    }
                }
            }
            var4 = ((qk) this).e((byte) 32);
        }
        return ((qk) this).field_sb != null ? true : false;
    }

    void l(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        L0: {
          var4 = ZombieDawn.field_J;
          if (((qk) this).field_F == 0) {
            break L0;
          } else {
            if ((((qk) this).field_F ^ -1) == -4) {
              break L0;
            } else {
              return;
            }
          }
        }
        L1: {
          if (param0 == 52) {
            break L1;
          } else {
            var5 = null;
            ((qk) this).a((wk) null, 14);
            break L1;
          }
        }
        L2: {
          L3: {
            L4: {
              var2 = ((qk) this).field_Eb;
              var3 = ((qk) this).field_Eb / 2;
              if (((qk) this).field_t == -29) {
                break L4;
              } else {
                if (((qk) this).a(-68, var2, false)) {
                  break L3;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              if (-29 != ((qk) this).field_t) {
                break L5;
              } else {
                if (this.a(-19718, false, var2)) {
                  break L3;
                } else {
                  break L5;
                }
              }
            }
            if (((qk) this).field_F != 3) {
              break L2;
            } else {
              ((qk) this).e(0, param0 ^ -6852);
              break L2;
            }
          }
          L6: {
            if (((qk) this).field_fb) {
              break L6;
            } else {
              if (0 >= ((qk) this).field_Ab) {
                break L6;
              } else {
                if (((qk) this).field_mb >= var3 * var3) {
                  if (((qk) this).field_Bb) {
                    if (((qk) this).p(param0 ^ -79)) {
                      if (((qk) this).field_F != 3) {
                        break L2;
                      } else {
                        ((qk) this).e(0, -6904);
                        break L2;
                      }
                    } else {
                      ((qk) this).m((byte) -116);
                      break L2;
                    }
                  } else {
                    ((qk) this).m((byte) -116);
                    break L2;
                  }
                } else {
                  if (!((qk) this).field_Bb) {
                    if (((qk) this).p(param0 ^ -79)) {
                      if (-4 != (((qk) this).field_F ^ -1)) {
                        break L2;
                      } else {
                        ((qk) this).e(0, -6904);
                        break L2;
                      }
                    } else {
                      ((qk) this).m((byte) -90);
                      break L2;
                    }
                  } else {
                    ((qk) this).m((byte) -90);
                    break L2;
                  }
                }
              }
            }
          }
          if (((qk) this).p(-120)) {
            break L2;
          } else {
            ((qk) this).e(3, -6904);
            break L2;
          }
        }
    }

    qk(int param0, int param1, int param2) {
        super(param0, param1, param2, 200704);
        Object stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        int stackIn_1_2 = 0;
        int stackIn_1_3 = 0;
        Object stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int stackIn_2_3 = 0;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        int stackIn_3_4 = 0;
        Object stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        int stackOut_0_2 = 0;
        int stackOut_0_3 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        int stackOut_2_4 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        int stackOut_1_4 = 0;
        L0: {
          stackOut_0_0 = this;
          stackOut_0_1 = param0;
          stackOut_0_2 = param1;
          stackOut_0_3 = param2;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_2_2 = stackOut_0_2;
          stackIn_2_3 = stackOut_0_3;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          stackIn_1_2 = stackOut_0_2;
          stackIn_1_3 = stackOut_0_3;
          if (param2 != 23) {
            stackOut_2_0 = this;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = stackIn_2_2;
            stackOut_2_3 = stackIn_2_3;
            stackOut_2_4 = 200704;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            stackIn_3_3 = stackOut_2_3;
            stackIn_3_4 = stackOut_2_4;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = stackIn_1_2;
            stackOut_1_3 = stackIn_1_3;
            stackOut_1_4 = 143360;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_3_3 = stackOut_1_3;
            stackIn_3_4 = stackOut_1_4;
            break L0;
          }
        }
        L1: {
          L2: {
            ((qk) this).field_yb = null;
            ((qk) this).field_zb = -1;
            ((qk) this).field_wb = false;
            ((qk) this).field_Eb = 250;
            ((qk) this).field_Gb = 0;
            if (-12 == ((qk) this).field_t) {
              break L2;
            } else {
              if (-13 != ((qk) this).field_t) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          ((qk) this).field_D = 143360;
          ((qk) this).field_Ib = 8;
          ((qk) this).field_Ab = 6;
          ((qk) this).field_Bb = true;
          ((qk) this).field_Fb = 3;
          break L1;
        }
        L3: {
          L4: {
            if ((((qk) this).field_t ^ -1) == -14) {
              break L4;
            } else {
              if ((((qk) this).field_t ^ -1) != -15) {
                break L3;
              } else {
                break L4;
              }
            }
          }
          ((qk) this).field_Ab = 12;
          ((qk) this).field_Ib = 8;
          ((qk) this).field_D = 143360;
          ((qk) this).field_Bb = true;
          ((qk) this).field_Fb = 2;
          break L3;
        }
        L5: {
          L6: {
            if (((qk) this).field_t == 15) {
              break L6;
            } else {
              if (-24 != (((qk) this).field_t ^ -1)) {
                break L5;
              } else {
                break L6;
              }
            }
          }
          ((qk) this).field_Ib = 8;
          ((qk) this).field_D = 200704;
          ((qk) this).field_Bb = false;
          ((qk) this).field_Ab = 24;
          ((qk) this).field_Fb = 2;
          break L5;
        }
        L7: {
          if (((qk) this).field_t != 16) {
            break L7;
          } else {
            ((qk) this).field_D = 200704;
            ((qk) this).field_Ib = 6;
            ((qk) this).field_Fb = 2;
            ((qk) this).field_Ab = 2147483647;
            ((qk) this).field_Bb = false;
            break L7;
          }
        }
        L8: {
          if ((((qk) this).field_t ^ -1) != -20) {
            break L8;
          } else {
            ((qk) this).field_Ab = 2147483647;
            ((qk) this).field_Bb = false;
            ((qk) this).field_D = 143360;
            ((qk) this).field_Fb = 5;
            ((qk) this).field_Ib = 0;
            break L8;
          }
        }
        L9: {
          if (28 != ((qk) this).field_t) {
            break L9;
          } else {
            ((qk) this).field_Bb = false;
            ((qk) this).field_Eb = 330;
            ((qk) this).field_D = 143360;
            ((qk) this).field_Ib = 6;
            ((qk) this).field_Fb = 1;
            ((qk) this).field_Ab = 2147483647;
            break L9;
          }
        }
        L10: {
          if (((qk) this).field_t != 20) {
            break L10;
          } else {
            ((qk) this).field_Ab = 2147483647;
            ((qk) this).field_Ib = 0;
            ((qk) this).field_D = 0;
            ((qk) this).field_Bb = false;
            ((qk) this).field_Fb = 5;
            break L10;
          }
        }
        L11: {
          if (27 != ((qk) this).field_t) {
            break L11;
          } else {
            ((qk) this).field_Ab = 2147483647;
            ((qk) this).field_Bb = false;
            ((qk) this).field_Ib = 0;
            ((qk) this).field_Fb = 5;
            ((qk) this).field_D = 0;
            break L11;
          }
        }
    }

    void a(wk param0, int param1) {
        if (param1 != 5060) {
            ((qk) this).field_Fb = -109;
        }
        bi.d(param0.a(((qk) this).a(true), (byte) -98), param0.a(((qk) this).f(237239984), 0), ((qk) this).field_Eb, 16711680);
        String var3 = Integer.toString(((qk) this).field_Ab);
        if (!((((qk) this).field_Ab ^ -1) >= -101)) {
            var3 = "oo";
        }
        bj.field_q.c(var3, param0.a(((qk) this).a(true), (byte) -128), -48 + param0.a(((qk) this).f(param1 ^ 237235572), 0), 16777215, 0);
        if (!(null == ((qk) this).field_yb)) {
            bi.e(param0.a(((qk) this).a(true), (byte) -93), param0.a(((qk) this).f(237239984), 0), param0.a(((qk) this).field_yb.a(true), (byte) -81), param0.a(((qk) this).field_yb.f(param1 + 237234924), 0), 65280);
        }
    }

    void b(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ZombieDawn.field_J;
        var4 = 2 + ((qk) this).field_Gb;
        if (var4 == 0) {
          return;
        } else {
          L0: {
            var5 = var4;
            var6 = var4 / 2;
            if (param1 <= -91) {
              break L0;
            } else {
              qk.a(-55, -46, -124, -122, -112);
              break L0;
            }
          }
          L1: {
            var7 = -var4 + 8;
            if ((((qk) this).field_S ^ -1) != -2) {
              if (((qk) this).field_S != 3) {
                if (0 == ((qk) this).field_S) {
                  bi.d(param0 - 2, param2 + -54 + var7, var5, 0, 64);
                  bi.d(-2 + param0, -50 + param2, var6, 0, 128);
                  bi.a(-2 + param0 << 21902564, param2 - 54 - -var7 << 1917214564, var5 << -180827548, 250, dm.field_p);
                  bi.a(-2 + param0 << -1421119132, param2 + -50 << -823603932, var6 << 1995243524, 200, dm.field_r);
                  break L1;
                } else {
                  if ((((qk) this).field_S ^ -1) != -3) {
                    break L1;
                  } else {
                    bi.d(-2 + param0, param2 - 10 + -var7, var5 - 1, 0, 64);
                    bi.d(param0 + -2, param2 - 16, var6 - 1, 0, 128);
                    bi.a(param0 + -2 << 586646820, param2 + (-10 + -var7) << 1428916612, var5 << 1704937060, 250, dm.field_p);
                    bi.a(-2 + param0 << 947830404, param2 + -16 << 583654148, var6 << -1361774428, 200, dm.field_r);
                    break L1;
                  }
                }
              } else {
                bi.d(var7 + (param0 + -23), -36 + param2, var5, 0, 64);
                bi.d(-18 + param0, param2 - 36, var6, 0, 128);
                bi.a(var7 + param0 - 23 << -1991660924, param2 + -36 << 414119172, var5 << -2109650812, 250, dm.field_p);
                bi.a(-18 + param0 << 736731140, param2 - 36 << 1117055044, var6 << 1943370852, 200, dm.field_r);
                break L1;
              }
            } else {
              bi.d(-var7 + param0 - -22, -36 + param2, -1 + var5, 0, 64);
              bi.d(param0 - -17, -36 + param2, -1 + var6, 0, 128);
              bi.a(-var7 + (22 + param0) << 325871236, param2 - 36 << 1105465508, var5 << 174869764, 250, dm.field_p);
              bi.a(17 + param0 << 1062093956, param2 + -36 << -2066237084, var6 << -1717074844, 200, dm.field_r);
              break L1;
            }
          }
          return;
        }
    }

    void g(int param0) {
        int var3 = 0;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        Object stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        Object stackOut_29_0 = null;
        Object stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        Object stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        L0: {
          var3 = ZombieDawn.field_J;
          if (param0 > 95) {
            break L0;
          } else {
            field_Db = -122;
            break L0;
          }
        }
        L1: {
          super.g(112);
          if (0 >= ((qk) this).field_xb) {
            break L1;
          } else {
            ((qk) this).field_xb = ((qk) this).field_xb - 1;
            break L1;
          }
        }
        L2: {
          if (11 != ((qk) this).field_F) {
            if (((qk) this).field_F != -11) {
              if (((qk) this).field_F != 0) {
                break L2;
              } else {
                break L2;
              }
            } else {
              if (-2 != ((qk) this).field_G) {
                if ((((qk) this).field_G ^ -1) != -3) {
                  break L2;
                } else {
                  L3: {
                    ((qk) this).field_xb = ((qk) this).field_Ib;
                    if (4 != ((qk) this).field_W) {
                      ((qk) this).field_xb = 4 * ((qk) this).field_xb / ((qk) this).field_W;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (((qk) this).field_zb != ((qk) this).field_Lb) {
                      break L4;
                    } else {
                      if (((qk) this).field_yb == null) {
                        break L4;
                      } else {
                        ((qk) this).field_Ab = ((qk) this).field_Ab - 1;
                        if (-1 >= (((qk) this).field_Ab - 1 ^ -1)) {
                          L5: {
                            if (28 != ((qk) this).field_t) {
                              ((qk) this).field_yb.z(0);
                              break L5;
                            } else {
                              boolean discarded$1 = dj.field_e.b(2, ((qk) this).field_yb.f(237239984), true, ((qk) this).field_yb.a(true));
                              break L5;
                            }
                          }
                          if (-2001 > ((qk) this).field_Ab) {
                            ((qk) this).field_Ab = 3000;
                            break L4;
                          } else {
                            break L4;
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  L6: {
                    ((qk) this).field_Lb = ((qk) this).field_Lb - 1;
                    stackOut_29_0 = this;
                    stackIn_31_0 = stackOut_29_0;
                    stackIn_30_0 = stackOut_29_0;
                    if (-1 != ((qk) this).field_Lb - 1) {
                      stackOut_31_0 = this;
                      stackOut_31_1 = 11;
                      stackIn_32_0 = stackOut_31_0;
                      stackIn_32_1 = stackOut_31_1;
                      break L6;
                    } else {
                      stackOut_30_0 = this;
                      stackOut_30_1 = 0;
                      stackIn_32_0 = stackOut_30_0;
                      stackIn_32_1 = stackOut_30_1;
                      break L6;
                    }
                  }
                  ((qk) this).e(stackIn_32_1, -6904);
                  break L2;
                }
              } else {
                if (((qk) this).field_Gb <= 0) {
                  break L2;
                } else {
                  ((qk) this).field_Gb = ((qk) this).field_Gb - 1;
                  break L2;
                }
              }
            }
          } else {
            if (0 != ((qk) this).field_xb) {
              break L2;
            } else {
              ((qk) this).e(10, -6904);
              if (0 >= ((qk) this).field_Ab) {
                ((qk) this).field_Gb = -2;
                ((qk) this).field_U = dc.a((byte) 18, 63);
                break L2;
              } else {
                ((qk) this).field_Gb = 8;
                if (!(this instanceof we)) {
                  ((qk) this).field_U = dc.a((byte) 18, 44);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = ZombieDawn.field_J;
        if (param3 >= -72) {
            return;
        }
        for (var5 = 0; bm.field_a.length > var5; var5++) {
            if (!(bm.field_a[var5] != 0)) {
                bm.field_a[var5] = param1;
                hg.field_a[var5] = param2;
                si.field_Qb[var5] = param4;
                hd.field_u[var5] = param0;
                return;
            }
        }
    }

    final void m(byte param0) {
        Object var2 = null;
        kd var2_ref = null;
        int var3 = 0;
        fb var4_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        Object stackIn_31_0 = null;
        Object stackIn_32_0 = null;
        Object stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        Object stackOut_30_0 = null;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        Object stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        Object stackOut_26_0 = null;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        var10 = ZombieDawn.field_J;
        if (((qk) this).field_wb) {
          ((qk) this).e(3, -6904);
          return;
        } else {
          if (0 < ((qk) this).field_xb) {
            return;
          } else {
            L0: {
              var11 = null;
              var2 = var11;
              if (param0 <= -87) {
                break L0;
              } else {
                ((qk) this).field_Ib = -17;
                break L0;
              }
            }
            L1: {
              L2: {
                var3 = ((qk) this).field_Eb * ((qk) this).field_Eb;
                if (var2 == null) {
                  break L2;
                } else {
                  if (!((kd) var11).field_hb) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var4_ref = ((qk) this).a((byte) -74, ((qk) this).field_Eb, 2);
              L3: while (true) {
                if (var4_ref == null) {
                  break L1;
                } else {
                  L4: {
                    L5: {
                      if (((kd) (Object) var4_ref).x(42)) {
                        break L5;
                      } else {
                        if (!(this instanceof we)) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (((kd) (Object) var4_ref).field_hb) {
                      break L4;
                    } else {
                      var5 = var4_ref.a(true);
                      var6 = var4_ref.f(237239984);
                      var7 = -var5 + ((qk) this).a(true);
                      var8 = -var6 + ((qk) this).f(237239984);
                      var9 = var7 * var7 - -(var8 * var8);
                      if (var3 <= var9) {
                        break L4;
                      } else {
                        L6: {
                          if (dj.field_e.field_H.a(var6, ((qk) this).f(237239984), var5, ((qk) this).a(true), 123) != -1) {
                            break L6;
                          } else {
                            if ((dj.field_e.field_H.a(-24 + var6, -24 + ((qk) this).f(237239984), var5, ((qk) this).a(true), 105) ^ -1) != 0) {
                              break L6;
                            } else {
                              var4_ref = ((qk) this).e((byte) 32);
                              continue L3;
                            }
                          }
                        }
                        var2_ref = (kd) (Object) var4_ref;
                        var3 = var9;
                        break L4;
                      }
                    }
                  }
                  var4_ref = ((qk) this).e((byte) 32);
                  continue L3;
                }
              }
            }
            L7: {
              if (var2_ref != null) {
                L8: {
                  var2_ref.field_hb = true;
                  var4 = var2_ref.a(true) - ((qk) this).a(true);
                  var5 = var2_ref.f(237239984) + -((qk) this).f(237239984);
                  if (Math.abs(var5) > Math.abs(var4)) {
                    L9: {
                      stackOut_30_0 = this;
                      stackIn_32_0 = stackOut_30_0;
                      stackIn_31_0 = stackOut_30_0;
                      if (-1 < var5) {
                        stackOut_32_0 = this;
                        stackOut_32_1 = 2;
                        stackIn_33_0 = stackOut_32_0;
                        stackIn_33_1 = stackOut_32_1;
                        break L9;
                      } else {
                        stackOut_31_0 = this;
                        stackOut_31_1 = 0;
                        stackIn_33_0 = stackOut_31_0;
                        stackIn_33_1 = stackOut_31_1;
                        break L9;
                      }
                    }
                    ((qk) this).field_S = stackIn_33_1;
                    break L8;
                  } else {
                    L10: {
                      stackOut_26_0 = this;
                      stackIn_28_0 = stackOut_26_0;
                      stackIn_27_0 = stackOut_26_0;
                      if (var4 >= -1) {
                        stackOut_28_0 = this;
                        stackOut_28_1 = 3;
                        stackIn_29_0 = stackOut_28_0;
                        stackIn_29_1 = stackOut_28_1;
                        break L10;
                      } else {
                        stackOut_27_0 = this;
                        stackOut_27_1 = 1;
                        stackIn_29_0 = stackOut_27_0;
                        stackIn_29_1 = stackOut_27_1;
                        break L10;
                      }
                    }
                    ((qk) this).field_S = stackIn_29_1;
                    break L8;
                  }
                }
                L11: {
                  ((qk) this).field_yb = var2_ref;
                  ((qk) this).e(10, -6904);
                  if (0 >= ((qk) this).field_Ab) {
                    ((qk) this).field_wb = true;
                    ((qk) this).field_Gb = -2;
                    ((qk) this).field_U = dc.a((byte) 18, 63);
                    break L11;
                  } else {
                    ((qk) this).field_Gb = 8;
                    if (!(this instanceof we)) {
                      if (((qk) this).field_t == 28) {
                        ((qk) this).field_U = dc.a((byte) 18, 92);
                        break L11;
                      } else {
                        ((qk) this).field_U = dc.a((byte) 18, 44);
                        break L11;
                      }
                    } else {
                      ((qk) this).field_U = dc.a((byte) 18, 8);
                      break L11;
                    }
                  }
                }
                ((qk) this).field_Lb = ((qk) this).field_Fb;
                ((qk) this).field_zb = pb.a(so.field_a, ((qk) this).field_Fb, 1) - -1;
                break L7;
              } else {
                break L7;
              }
            }
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Hb = new vn[5];
        field_Cb = new int[8192];
        field_Jb = new al[15];
    }
}
