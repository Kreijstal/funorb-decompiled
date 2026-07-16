/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class id extends fb {
    boolean field_P;
    int field_F;
    private fn field_K;
    static int field_I;
    static int field_N;
    boolean field_J;
    private boolean field_G;
    static int field_D;
    int field_E;
    private boolean field_O;
    static String field_L;
    static int field_M;

    final boolean a(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = ZombieDawn.field_J;
        if (!param0) {
            Object var5 = null;
            ((id) this).a((byte) -30, (wk) null);
        }
        for (var3 = 0; var3 < tl.field_g.length; var3++) {
            if (((id) this).field_F == tl.field_g[var3]) {
                if (param1) {
                    if (!ka.field_h[var3]) {
                        return false;
                    }
                }
                ((id) this).field_F = oo.field_U[var3];
                if ((((id) this).field_z ^ -1) < -1) {
                    dj.field_e.field_u[((id) this).field_z + -1] = dj.field_e.field_u[((id) this).field_z + -1] - 1;
                }
                ((id) this).field_z = 0;
                return true;
            }
        }
        return false;
    }

    void a(byte param0, wk param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = ZombieDawn.field_J;
          if (param0 <= -76) {
            break L0;
          } else {
            this.b(true);
            break L0;
          }
        }
        L1: {
          var3 = param1.a(((id) this).a(true), (byte) -118);
          var4 = param1.a(((id) this).f(237239984), 0) - 24;
          if (!((id) this).field_O) {
            break L1;
          } else {
            L2: {
              if ((var3 ^ -1) > 47) {
                break L2;
              } else {
                if (var4 < -48) {
                  break L2;
                } else {
                  if (var3 > qj.field_d) {
                    break L2;
                  } else {
                    if (me.field_Bb >= var4 + -24) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            return;
          }
        }
        L3: {
          if (((id) this).field_O) {
            break L3;
          } else {
            L4: {
              if ((var3 ^ -1) > 47) {
                break L4;
              } else {
                if ((var4 ^ -1) > 47) {
                  break L4;
                } else {
                  if (qj.field_d < var3) {
                    break L4;
                  } else {
                    if (var4 <= me.field_Bb) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
              }
            }
            return;
          }
        }
        if (tm.field_h.length >= ((id) this).field_F) {
          L5: {
            if (-1 <= (((id) this).field_E ^ -1)) {
              L6: {
                if (!((id) this).field_P) {
                  if (!((id) this).field_J) {
                    tm.field_h[((id) this).field_F].b(var3, var4);
                    break L6;
                  } else {
                    tm.field_h[((id) this).field_F].f(var3, var4);
                    break L6;
                  }
                } else {
                  tm.field_h[((id) this).field_F].c(var3, var4);
                  break L6;
                }
              }
              if (!((id) this).field_O) {
                break L5;
              } else {
                if (!((id) this).field_P) {
                  if (!((id) this).field_J) {
                    tm.field_h[-8 + ((id) this).field_F].b(var3, -24 + var4);
                    break L5;
                  } else {
                    tm.field_h[-8 + ((id) this).field_F].f(var3, var4 + -24);
                    break L5;
                  }
                } else {
                  tm.field_h[((id) this).field_F - 8].c(var3, -24 + var4);
                  break L5;
                }
              }
            } else {
              L7: {
                if (!ng.field_e) {
                  break L7;
                } else {
                  if ((((id) this).field_E ^ -1) >= -1) {
                    break L7;
                  } else {
                    bi.g(8 + var3, 1 + var4, 14, bb.field_e[-1 + ((id) this).field_E]);
                    break L7;
                  }
                }
              }
              if (!((id) this).field_P) {
                tm.field_h[((id) this).field_F].g(var3, var4, bb.field_e[((id) this).field_E + -1]);
                if (!((id) this).field_O) {
                  break L5;
                } else {
                  tm.field_h[-8 + ((id) this).field_F].g(var3, -24 + var4, bb.field_e[((id) this).field_E - 1]);
                  break L5;
                }
              } else {
                so.a(tm.field_h[((id) this).field_F], var3, var4, bb.field_e[-1 + ((id) this).field_E]);
                if (((id) this).field_O) {
                  so.a(tm.field_h[((id) this).field_F - 8], var3, var4 + -24, bb.field_e[((id) this).field_E - 1]);
                  break L5;
                } else {
                  break L5;
                }
              }
            }
          }
          L8: {
            if (!kc.field_Q) {
              break L8;
            } else {
              pc.field_k.a(s.a(1938762664, "<%0>,<%1>", new String[2]), 12 + var3, -5 + var4, 16777215, 0);
              break L8;
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void i(int param0) {
        if (param0 >= -33) {
            id.i(45);
        }
        field_L = null;
    }

    private final void b(boolean param0) {
        le var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ej var6 = null;
        ej var7 = null;
        var5 = ZombieDawn.field_J;
        if (0 != ((id) this).field_z) {
          L0: {
            dj.field_e.field_u[-1 + ((id) this).field_z] = dj.field_e.field_u[-1 + ((id) this).field_z] - 1;
            if (0 >= dj.field_e.field_u[-1 + ((id) this).field_z]) {
              var2 = dj.field_e.field_R.field_b.field_b;
              L1: while (true) {
                if (!(var2 instanceof fb)) {
                  break L0;
                } else {
                  L2: {
                    if (!(var2 instanceof ah)) {
                      break L2;
                    } else {
                      if (((id) this).field_z != ((fb) (Object) var2).field_z) {
                        break L2;
                      } else {
                        ((fb) (Object) var2).field_z = 0;
                        break L2;
                      }
                    }
                  }
                  var2 = var2.field_b;
                  continue L1;
                }
              }
            } else {
              break L0;
            }
          }
          L3: {
            ((id) this).field_E = ((id) this).field_z;
            ((id) this).field_z = 0;
            var6 = dj.field_e.field_H;
            var7 = var6;
            var3 = ((id) this).a(param0) / 24;
            var4 = ((id) this).f(237239984) / 24;
            if (-1 != (((id) this).f(237239984) % 24 ^ -1)) {
              break L3;
            } else {
              var4--;
              break L3;
            }
          }
          L4: {
            var6.field_A.field_f[var4][var3] = eg.a(var6.field_A.field_f[var4][var3], -33554433);
            var7.field_A.a(param0, 14365, var4, false, var3);
            var6.field_A.field_t[var4 + -1][var3] = eg.a(var6.field_A.field_t[var4 + -1][var3], -33554433);
            if (!((id) this).field_O) {
              break L4;
            } else {
              var6.field_A.field_f[-1 + var4][var3] = eg.a(var6.field_A.field_f[-1 + var4][var3], -33554433);
              var7.field_A.a(true, 14365, -1 + var4, false, var3);
              var6.field_A.field_t[var4 - 1][var3] = eg.a(var6.field_A.field_t[var4 - 1][var3], -33554433);
              break L4;
            }
          }
          ((id) this).field_F = ((id) this).field_F + 1;
          return;
        } else {
          return;
        }
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    id(int param0, int param1, int param2) {
        super(param0, param1, param2);
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int[] var8 = null;
        int[] var9 = null;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        L0: {
          ((id) this).field_K = null;
          ((id) this).field_O = false;
          ((id) this).field_F = ((id) this).field_t;
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (0 == (1073741824 & ((id) this).field_t)) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          ((id) this).field_P = stackIn_3_1 != 0;
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (0 == (((id) this).field_t & 536870912)) {
            stackOut_5_0 = this;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = this;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        ((id) this).field_J = stackIn_6_1 != 0;
        ((id) this).field_F = ((id) this).field_F & -1610612737;
        ((id) this).field_F = ((id) this).field_F - 1;
        var17 = rc.field_u;
        var15 = var17;
        var13 = var15;
        var11 = var13;
        var8 = var11;
        var4 = var8;
        var5 = 0;
        L2: while (true) {
          if (var17.length <= var5) {
            var18 = ln.field_c;
            var16 = var18;
            var14 = var16;
            var12 = var14;
            var9 = var12;
            var4 = var9;
            var10 = 0;
            var5 = var10;
            L3: while (true) {
              if (var10 >= var18.length) {
                return;
              } else {
                var6 = var18[var10];
                if (((id) this).field_F == var6) {
                  ((id) this).field_G = true;
                  var10++;
                  continue L3;
                } else {
                  var10++;
                  continue L3;
                }
              }
            }
          } else {
            var6 = var17[var5];
            if (((id) this).field_F == var6) {
              ((id) this).field_O = true;
              var5++;
              continue L2;
            } else {
              var5++;
              continue L2;
            }
          }
        }
    }

    void g(int param0) {
        fb var2_ref_fb = null;
        int var2 = 0;
        int var3 = 0;
        fb var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        va var7 = null;
        var6 = ZombieDawn.field_J;
        if (param0 > 95) {
          L0: {
            if (dj.field_e.field_r >= 400) {
              break L0;
            } else {
              if (-201 <= (dj.field_e.field_r ^ -1)) {
                break L0;
              } else {
                var2 = 0;
                L1: while (true) {
                  if (var2 >= ka.field_h.length) {
                    break L0;
                  } else {
                    if (((id) this).field_F != tl.field_g[var2]) {
                      var2++;
                      continue L1;
                    } else {
                      L2: {
                        if (dj.field_e.field_r < 250) {
                          break L2;
                        } else {
                          if (0 != pb.a(so.field_a, 25, 1)) {
                            break L0;
                          } else {
                            break L2;
                          }
                        }
                      }
                      if (((id) this).a(true, true)) {
                        L3: {
                          var3 = ((id) this).a(true) / 24;
                          var4_int = ((id) this).f(237239984) / 24;
                          if (-1 != (((id) this).f(237239984) % 24 ^ -1)) {
                            break L3;
                          } else {
                            var4_int--;
                            break L3;
                          }
                        }
                        dj.field_e.field_H.field_A.field_f[var4_int][var3] = eg.a(dj.field_e.field_H.field_A.field_f[var4_int][var3], -33554433);
                        dj.field_e.field_H.field_A.field_f[-1 + var4_int][var3] = eg.a(dj.field_e.field_H.field_A.field_f[-1 + var4_int][var3], -33554433);
                        dj.field_e.field_H.field_A.a(true, 14365, var4_int, false, var3);
                        dj.field_e.field_H.field_A.a(true, 14365, var4_int - 1, false, var3);
                        if (pb.a(so.field_a, 2, 1) != 0) {
                          break L0;
                        } else {
                          L4: {
                            if (null != ((id) this).field_K) {
                              pc.a((byte) 13, ((id) this).field_K);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          ((id) this).field_K = kh.a(pb.a(so.field_a, 2, 1) + 64, false);
                          break L0;
                        }
                      } else {
                        break L0;
                      }
                    }
                  }
                }
              }
            }
          }
          L5: {
            if (((id) this).field_z <= 0) {
              break L5;
            } else {
              ((id) this).field_E = ((id) this).field_z;
              var2_ref_fb = ((id) this).a((byte) -74, 50, 1);
              L6: while (true) {
                if (var2_ref_fb == null) {
                  break L5;
                } else {
                  L7: {
                    if (var2_ref_fb.field_z == ((id) this).field_z) {
                      if (((id) this).a(var2_ref_fb, 1654152400) >= 2500) {
                        break L7;
                      } else {
                        var3 = ((id) this).field_z;
                        ck.a(-9, 6836);
                        fn discarded$2 = kh.a(93, false);
                        fn discarded$3 = kh.a(94, false);
                        var4 = ((id) this).a((byte) -74, 48, 4);
                        L8: while (true) {
                          if (var4 == null) {
                            dj.field_e.b(true);
                            wh.a((byte) -81);
                            break L5;
                          } else {
                            L9: {
                              if (var3 == var4.field_z) {
                                ((id) (Object) var4).b(true);
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            var4 = ((id) this).e((byte) 32);
                            continue L8;
                          }
                        }
                      }
                    } else {
                      break L7;
                    }
                  }
                  var2_ref_fb = ((id) this).e((byte) 32);
                  continue L6;
                }
              }
            }
          }
          L10: {
            if (!((id) this).field_G) {
              break L10;
            } else {
              L11: {
                var2 = (12 + ((id) this).a(true)) / 24;
                var3 = (((id) this).f(237239984) + -1) / 24;
                if (0 > var2) {
                  break L11;
                } else {
                  if (0 > var3) {
                    break L11;
                  } else {
                    if (var2 >= dj.field_e.field_H.field_A.field_f[0].length) {
                      break L11;
                    } else {
                      if (var3 < dj.field_e.field_H.field_A.field_f.length) {
                        var7 = ub.a(127, dj.field_e.field_H.field_A.field_f[var3][var2]);
                        if (var7 == null) {
                          break L10;
                        } else {
                          L12: {
                            if ((var7.field_h ^ -1) <= -1) {
                              if ((var7.field_h ^ -1) >= -1) {
                                ((id) this).field_y = ((id) this).field_y + var7.field_h;
                                break L12;
                              } else {
                                var5 = (var7.field_h + ((id) this).field_y) % 1572864;
                                if (var5 >= var7.field_h) {
                                  ((id) this).field_y = ((id) this).field_y + var7.field_h;
                                  break L12;
                                } else {
                                  ((id) this).field_y = ((id) this).field_y + (-var5 + var7.field_h);
                                  break L12;
                                }
                              }
                            } else {
                              var5 = ((id) this).field_y % 1572864;
                              if (-var7.field_h > var5) {
                                ((id) this).field_y = ((id) this).field_y - (var5 + 1);
                                break L12;
                              } else {
                                ((id) this).field_y = ((id) this).field_y + var7.field_h;
                                break L12;
                              }
                            }
                          }
                          if (-1 < (var7.field_i ^ -1)) {
                            var5 = ((id) this).field_x % 1572864;
                            if (-var7.field_i <= var5) {
                              ((id) this).field_x = ((id) this).field_x + var7.field_i;
                              break L10;
                            } else {
                              ((id) this).field_x = -var5 + (((id) this).field_x - 1);
                              break L10;
                            }
                          } else {
                            if (0 >= var7.field_i) {
                              ((id) this).field_x = ((id) this).field_x + var7.field_i;
                              break L10;
                            } else {
                              var5 = (var7.field_i + ((id) this).field_x) % 1572864;
                              if (var7.field_i <= var5) {
                                ((id) this).field_x = ((id) this).field_x + var7.field_i;
                                break L10;
                              } else {
                                ((id) this).field_x = -var5 - -var7.field_i + ((id) this).field_x;
                                break L10;
                              }
                            }
                          }
                        }
                      } else {
                        break L11;
                      }
                    }
                  }
                }
              }
              return;
            }
          }
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = -1;
        field_L = "If you do nothing the game will revert to normal view once the timer reaches 0.";
        field_M = 0;
    }
}
