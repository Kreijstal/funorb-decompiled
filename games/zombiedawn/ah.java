/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ah extends g {
    int[] field_gb;
    private int field_lb;
    private boolean field_nb;
    private boolean field_hb;
    static int field_eb;
    int field_ub;
    fb field_sb;
    static String field_bb;
    private int field_rb;
    private nc field_cb;
    private int field_vb;
    int field_pb;
    int[] field_jb;
    boolean field_kb;
    int field_db;
    int field_mb;
    boolean field_ib;
    boolean field_fb;
    boolean field_ob;
    private int field_qb;
    static vn field_tb;

    final boolean p(int param0) {
        int var2 = -44 / ((-76 - param0) / 44);
        if ((((ah) this).field_t ^ -1) == -29) {
            return false;
        }
        this.i((byte) -71);
        int var3 = ((ah) this).j((byte) -123);
        if (-1 == var3) {
            return false;
        }
        ((ah) this).field_nb = false;
        ((ah) this).field_qb = 5;
        ((ah) this).field_Y = ((ah) this).field_jb[var3];
        ((ah) this).field_X = ((ah) this).field_gb[var3];
        ho.a(((ah) this).f(237239984), (byte) 54, ((ah) this).a(true));
        pi.a(((ah) this).field_X, ((ah) this).field_Y, (byte) 101);
        ((ah) this).c(0, ((ah) this).field_D);
        ((ah) this).e(1, -6904);
        return true;
    }

    void c(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        var11 = ZombieDawn.field_J;
        if ((((ah) this).field_F ^ -1) == -19) {
          return;
        } else {
          if (((ah) this).field_F != 20) {
            L0: {
              var4 = 200;
              var5 = param0 - ((ah) this).a(true);
              if (param1 > 24) {
                break L0;
              } else {
                ((ah) this).field_hb = false;
                break L0;
              }
            }
            L1: {
              var6 = -((ah) this).f(237239984) + param2;
              var7 = (double)var4 / (double)so.b(var6 * var6 + var5 * var5);
              ((ah) this).field_Y = ((ah) this).a(true) - (int)((double)var5 * var7);
              ((ah) this).field_X = -(int)((double)var6 * var7) + ((ah) this).f(237239984);
              ((ah) this).c(0, 401408);
              ((ah) this).e(2, -6904);
              ((ah) this).field_rb = 1;
              stackOut_5_0 = this;
              stackIn_7_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (((ah) this).field_S != 3) {
                stackOut_7_0 = this;
                stackOut_7_1 = 3;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                break L1;
              } else {
                stackOut_6_0 = this;
                stackOut_6_1 = 1;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                break L1;
              }
            }
            L2: {
              ((ah) this).field_S = stackIn_8_1;
              ho.a(((ah) this).f(237239984), (byte) 54, ((ah) this).a(true));
              var9 = -1;
              var10 = pb.a(so.field_a, 128, 1);
              if ((var10 ^ -1) < -111) {
                var9 = ((ah) this).field_db;
                break L2;
              } else {
                if (var10 > 50) {
                  if (((ah) this).t(10)) {
                    var9 = pb.a(so.field_a, 4, 1) + 40;
                    break L2;
                  } else {
                    var9 = pb.a(so.field_a, 3, 1) + 37;
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (var9 == -1) {
                break L3;
              } else {
                fn discarded$1 = dc.a((byte) 18, var9);
                break L3;
              }
            }
            return;
          } else {
            return;
          }
        }
    }

    final boolean a(int param0, int param1, boolean param2) {
        fb var4 = null;
        kd var5 = null;
        int var6 = 0;
        fb stackIn_7_0 = null;
        int stackIn_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        fb stackOut_6_0 = null;
        Object stackOut_5_0 = null;
        L0: {
          var6 = ZombieDawn.field_J;
          ((ah) this).field_sb = null;
          ((ah) this).field_fb = false;
          if (param0 <= -28) {
            break L0;
          } else {
            ((ah) this).field_fb = true;
            break L0;
          }
        }
        var4 = ((ah) this).a((byte) -74, param1, 10);
        L1: while (true) {
          if (var4 == null) {
            L2: {
              if (null == ((ah) this).field_sb) {
                stackOut_21_0 = 0;
                stackIn_22_0 = stackOut_21_0;
                break L2;
              } else {
                stackOut_20_0 = 1;
                stackIn_22_0 = stackOut_20_0;
                break L2;
              }
            }
            return stackIn_22_0 != 0;
          } else {
            L3: {
              if (var4 instanceof kd) {
                stackOut_6_0 = (fb) var4;
                stackIn_7_0 = stackOut_6_0;
                break L3;
              } else {
                stackOut_5_0 = null;
                stackIn_7_0 = (fb) (Object) stackOut_5_0;
                break L3;
              }
            }
            L4: {
              L5: {
                var5 = (kd) (Object) stackIn_7_0;
                if (var5 == null) {
                  break L5;
                } else {
                  if (var5.x(79)) {
                    break L5;
                  } else {
                    if (!(this instanceof we)) {
                      break L4;
                    } else {
                      if (var5.field_F != 9) {
                        break L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              }
              L6: {
                if (param2) {
                  break L6;
                } else {
                  if (((ah) this).a(72, var4)) {
                    break L6;
                  } else {
                    var4 = ((ah) this).e((byte) 32);
                    continue L1;
                  }
                }
              }
              ((ah) this).field_sb = var4;
              ((ah) this).field_mb = ((ah) this).field_s;
              if (var5 == null) {
                break L4;
              } else {
                if ((var5.field_bb ^ -1) >= -1) {
                  break L4;
                } else {
                  ((ah) this).field_fb = true;
                  return true;
                }
              }
            }
            var4 = ((ah) this).e((byte) 32);
            continue L1;
          }
        }
    }

    final int s(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = ZombieDawn.field_J;
        var2 = ((ah) this).field_t;
        if (0 != var2) {
          if (-2 != (var2 ^ -1)) {
            if (var2 != 2) {
              if (3 != var2) {
                if (4 == var2) {
                  return uo.field_j;
                } else {
                  if (var2 == 5) {
                    return lc.field_j;
                  } else {
                    if (-7 != (var2 ^ -1)) {
                      if (7 != var2) {
                        if (var2 != 8) {
                          if (var2 == -10) {
                            return gg.field_b;
                          } else {
                            if (10 != var2) {
                              if (-12 != var2) {
                                if (-13 == var2) {
                                  return da.field_h;
                                } else {
                                  if (var2 == 13) {
                                    return pa.field_B;
                                  } else {
                                    if (-15 == var2) {
                                      return pa.field_B;
                                    } else {
                                      if (var2 == -16) {
                                        return gn.field_b;
                                      } else {
                                        if (-24 == var2) {
                                          return qc.field_a;
                                        } else {
                                          if (var2 != 16) {
                                            if (-29 != (var2 ^ -1)) {
                                              if (var2 == -19) {
                                                return ke.field_h;
                                              } else {
                                                if (-20 == var2) {
                                                  return jc.field_h;
                                                } else {
                                                  if (var2 == 29) {
                                                    return h.field_a;
                                                  } else {
                                                    if ((var2 ^ -1) != -27) {
                                                      if (var2 == -25) {
                                                        return h.field_a;
                                                      } else {
                                                        if (-26 == var2) {
                                                          return h.field_a;
                                                        } else {
                                                          if (22 == var2) {
                                                            return h.field_a;
                                                          } else {
                                                            if ((var2 ^ -1) != -22) {
                                                              if (var2 != 30) {
                                                                if (param0 == 24478) {
                                                                  return 0;
                                                                } else {
                                                                  ((ah) this).field_db = -10;
                                                                  return 0;
                                                                }
                                                              } else {
                                                                return da.field_n;
                                                              }
                                                            } else {
                                                              return h.field_a;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      return h.field_a;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              return ke.field_h;
                                            }
                                          } else {
                                            return qc.field_a;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                return da.field_h;
                              }
                            } else {
                              return gg.field_b;
                            }
                          }
                        } else {
                          return h.field_a;
                        }
                      } else {
                        return h.field_a;
                      }
                    } else {
                      return da.field_n;
                    }
                  }
                }
              } else {
                return lc.field_j;
              }
            } else {
              return uo.field_j;
            }
          } else {
            return lc.field_j;
          }
        } else {
          return lc.field_j;
        }
    }

    private final String k(byte param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = ZombieDawn.field_J;
        if (param0 == -34) {
          var2 = ((ah) this).field_F;
          if (var2 == 0) {
            return "IDLE";
          } else {
            if (1 != var2) {
              if ((var2 ^ -1) == -4) {
                return "COWERING";
              } else {
                if (16 == var2) {
                  return "SCREECHCOWER";
                } else {
                  if (var2 == -12) {
                    return "AIMING";
                  } else {
                    if (-11 != var2) {
                      if ((var2 ^ -1) != -3) {
                        return "ILLEGAL";
                      } else {
                        return "KNOCKBACK";
                      }
                    } else {
                      return "SHOOTING";
                    }
                  }
                }
              }
            } else {
              return "RUNNING";
            }
          }
        } else {
          return null;
        }
    }

    final void a(int param0, byte param1, int param2) {
        kk var7 = null;
        kk var6_ref = null;
        Object var6 = null;
        int var4 = -5 % ((43 - param1) / 57);
        qh var5 = dj.field_e.field_H.a(true, ((ah) this).a(true), param2, param0, ((ah) this).f(237239984));
        if (var5 != null) {
            var7 = (kk) (Object) var5.b((byte) 26);
            if (((ah) this).a(true) == var7.field_l) {
                if (((ah) this).f(237239984) == var7.field_h) {
                    var6_ref = (kk) (Object) var5.a(false);
                }
            }
            if (!(var6_ref != null)) {
                return;
            }
            ((ah) this).field_Y = var6_ref.field_l;
            ((ah) this).field_X = var6_ref.field_h;
            ((ah) this).c(0, ((ah) this).field_D);
            ((ah) this).e(1, -6904);
        }
    }

    final void n(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        fb var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        var10 = ZombieDawn.field_J;
        var3 = -110 % ((param0 - 24) / 52);
        var2 = 0;
        var4 = 0;
        L0: while (true) {
          if (var4 >= ((ah) this).field_ub) {
            L1: {
              if (var2 != 0) {
                var11 = 0;
                var4 = var11;
                L2: while (true) {
                  if (((ah) this).field_ub <= var11) {
                    break L1;
                  } else {
                    L3: {
                      if (-1 > (h.field_e[var11] ^ -1)) {
                        h.field_e[var11] = 0;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    if ((h.field_e[var11] ^ -1) > 0) {
                      h.field_e[var11] = -h.field_e[var11] + 1000000;
                      var11++;
                      continue L2;
                    } else {
                      var11++;
                      continue L2;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            return;
          } else {
            L4: {
              h.field_e[var4] = 0;
              if (0 >= ((ah) this).field_z) {
                if (mf.a(((ah) this).field_gb[var4], ((ah) this).field_jb[var4], 0)) {
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L4;
                } else {
                  stackOut_5_0 = 0;
                  stackIn_8_0 = stackOut_5_0;
                  break L4;
                }
              } else {
                stackOut_3_0 = 1;
                stackIn_8_0 = stackOut_3_0;
                break L4;
              }
            }
            L5: {
              var5 = stackIn_8_0;
              if (-1 + ((ah) this).field_ub == var4) {
                break L5;
              } else {
                L6: {
                  if (var5 == 0) {
                    break L6;
                  } else {
                    if (-1 != dj.field_e.field_H.a(((ah) this).field_gb[var4], ((ah) this).f(237239984), ((ah) this).field_jb[var4], ((ah) this).a(true), 124)) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                h.field_e[var4] = -1;
                var4++;
                continue L0;
              }
            }
            var6 = ((ah) this).b(250, 16);
            L7: while (true) {
              if (var6 != null) {
                L8: {
                  L9: {
                    L10: {
                      if (!(var6 instanceof kd)) {
                        break L10;
                      } else {
                        if (((kd) (Object) var6).x(53)) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    if (var6 instanceof vb) {
                      break L9;
                    } else {
                      if (0 == ((ah) this).field_z) {
                        break L8;
                      } else {
                        if (!(var6 instanceof id)) {
                          break L8;
                        } else {
                          if (((ah) this).field_z == var6.field_z) {
                            var7 = ((ah) this).field_jb[var4] - var6.a(true);
                            var8 = ((ah) this).field_gb[var4] + -var6.f(237239984);
                            var9 = var8 * var8 + var7 * var7;
                            if (var9 < 625) {
                              var2 = 1;
                              h.field_e[var4] = -1 + -var9;
                              var6 = ((ah) this).e((byte) 32);
                              continue L7;
                            } else {
                              var6 = ((ah) this).e((byte) 32);
                              continue L7;
                            }
                          } else {
                            var6 = ((ah) this).e((byte) 32);
                            continue L7;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    var7 = ((ah) this).field_jb[var4] + -var6.a(true);
                    var8 = ((ah) this).field_gb[var4] + -var6.f(237239984);
                    var9 = var7 * var7 + var8 * var8;
                    if (0 == h.field_e[var4]) {
                      break L11;
                    } else {
                      if (h.field_e[var4] > var9) {
                        break L11;
                      } else {
                        var6 = ((ah) this).e((byte) 32);
                        continue L7;
                      }
                    }
                  }
                  h.field_e[var4] = var9;
                  break L8;
                }
                var6 = ((ah) this).e((byte) 32);
                continue L7;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        }
    }

    void a(byte param0, wk param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        vn stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        vn stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        vn stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        int stackIn_62_2 = 0;
        int stackIn_62_3 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        int stackIn_63_2 = 0;
        int stackIn_63_3 = 0;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        int stackIn_64_2 = 0;
        int stackIn_64_3 = 0;
        int stackIn_64_4 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        int stackIn_65_2 = 0;
        int stackIn_65_3 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        int stackIn_66_2 = 0;
        int stackIn_66_3 = 0;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        int stackIn_67_2 = 0;
        int stackIn_67_3 = 0;
        int stackIn_67_4 = 0;
        vn stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        vn stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        vn stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        int stackOut_61_0 = 0;
        int stackOut_61_1 = 0;
        int stackOut_61_2 = 0;
        int stackOut_61_3 = 0;
        int stackOut_63_0 = 0;
        int stackOut_63_1 = 0;
        int stackOut_63_2 = 0;
        int stackOut_63_3 = 0;
        int stackOut_63_4 = 0;
        int stackOut_62_0 = 0;
        int stackOut_62_1 = 0;
        int stackOut_62_2 = 0;
        int stackOut_62_3 = 0;
        int stackOut_62_4 = 0;
        int stackOut_64_0 = 0;
        int stackOut_64_1 = 0;
        int stackOut_64_2 = 0;
        int stackOut_64_3 = 0;
        int stackOut_66_0 = 0;
        int stackOut_66_1 = 0;
        int stackOut_66_2 = 0;
        int stackOut_66_3 = 0;
        int stackOut_66_4 = 0;
        int stackOut_65_0 = 0;
        int stackOut_65_1 = 0;
        int stackOut_65_2 = 0;
        int stackOut_65_3 = 0;
        int stackOut_65_4 = 0;
        L0: {
          var8 = ZombieDawn.field_J;
          if (20 == ((ah) this).field_F) {
            break L0;
          } else {
            if (!((ah) this).field_J) {
              L1: {
                var3 = -24 + param1.a(((ah) this).a(true), (byte) -81);
                var4 = param1.a(((ah) this).f(237239984), 0) + -48;
                if (null == ((ah) this).field_U) {
                  break L1;
                } else {
                  if (((ah) this).field_U.l()) {
                    ((ah) this).field_U = null;
                    break L1;
                  } else {
                    ((ah) this).field_U.h(pj.a(var4, 84, var3));
                    break L1;
                  }
                }
              }
              L2: {
                if (b.field_h) {
                  bj.field_q.c(this.k((byte) -34), var3, var4, 16777215, 0);
                  ((ah) this).a(param1, 5060);
                  break L2;
                } else {
                  break L2;
                }
              }
              if (var3 < -48) {
                break L0;
              } else {
                L3: {
                  if (var4 < -48) {
                    break L3;
                  } else {
                    if (qj.field_d < var3) {
                      break L3;
                    } else {
                      if (var4 > me.field_Bb) {
                        break L3;
                      } else {
                        L4: {
                          if (-18 == (((ah) this).field_F ^ -1)) {
                            break L4;
                          } else {
                            L5: {
                              stackOut_17_0 = nb.field_k[1];
                              stackOut_17_1 = 12;
                              stackIn_19_0 = stackOut_17_0;
                              stackIn_19_1 = stackOut_17_1;
                              stackIn_18_0 = stackOut_17_0;
                              stackIn_18_1 = stackOut_17_1;
                              if (((ah) this).field_S == 3) {
                                stackOut_19_0 = (vn) (Object) stackIn_19_0;
                                stackOut_19_1 = stackIn_19_1;
                                stackOut_19_2 = -2 + var3;
                                stackIn_20_0 = stackOut_19_0;
                                stackIn_20_1 = stackOut_19_1;
                                stackIn_20_2 = stackOut_19_2;
                                break L5;
                              } else {
                                stackOut_18_0 = (vn) (Object) stackIn_18_0;
                                stackOut_18_1 = stackIn_18_1;
                                stackOut_18_2 = -3 + var3;
                                stackIn_20_0 = stackOut_18_0;
                                stackIn_20_1 = stackOut_18_1;
                                stackIn_20_2 = stackOut_18_2;
                                break L5;
                              }
                            }
                            so.a(stackIn_20_0, stackIn_20_1 + stackIn_20_2, 43 + var4);
                            break L4;
                          }
                        }
                        L6: {
                          if ((((ah) this).field_z ^ -1) < -1) {
                            int discarded$1 = Math.abs(ip.field_p[0].field_w * fb.a(1311979239, (int)tp.field_p << -852457050) >> -12998352);
                            var5 = 6 * fb.a(1311979239, (int)tp.field_p << -877369338) >> -7036432;
                            var6 = rd.a(true, (int)tp.field_p << -1330099737) * 3 >> -1598446800;
                            ip.field_p[0].g(var5 + 24 + (var3 + -7), 2 + (var4 - -var6), bb.field_e[-1 + ((ah) this).field_z]);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        L7: {
                          L8: {
                            var5 = cg.field_d[((ah) this).field_F] - -((ah) this).field_G;
                            var6 = var3;
                            var7 = var4;
                            if (-1 > (((ah) this).field_Z ^ -1)) {
                              break L8;
                            } else {
                              if (!ng.field_e) {
                                break L7;
                              } else {
                                L9: {
                                  if (((ah) this).field_ib) {
                                    break L9;
                                  } else {
                                    if (!((ah) this).field_C) {
                                      break L7;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                if (!bo.field_p[86]) {
                                  break L8;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          ki.a((byte) -114, dn.field_E);
                          var4 = 0;
                          bi.d();
                          var3 = 0;
                          break L7;
                        }
                        L10: {
                          if (param0 <= -76) {
                            break L10;
                          } else {
                            ((ah) this).n(-60);
                            break L10;
                          }
                        }
                        L11: {
                          L12: {
                            if (((ah) this).field_F == -11) {
                              break L12;
                            } else {
                              if (-12 == ((ah) this).field_F) {
                                break L12;
                              } else {
                                L13: {
                                  if (3 == ((ah) this).field_S) {
                                    break L13;
                                  } else {
                                    if (-3 == (((ah) this).field_S ^ -1)) {
                                      break L13;
                                    } else {
                                      ld.field_l[((ah) this).field_t][var5].c(var3, var4);
                                      break L11;
                                    }
                                  }
                                }
                                ld.field_l[((ah) this).field_t][var5].b(var3, var4);
                                break L11;
                              }
                            }
                          }
                          if ((((ah) this).field_S ^ -1) == -3) {
                            ld.field_l[((ah) this).field_t][var5 + 2].b(var3, var4);
                            break L11;
                          } else {
                            if (((ah) this).field_S == 0) {
                              ld.field_l[((ah) this).field_t][var5 + 4].b(var3, var4);
                              break L11;
                            } else {
                              if (((ah) this).field_S == -4) {
                                ld.field_l[((ah) this).field_t][var5].b(var3, var4);
                                break L11;
                              } else {
                                if (-2 == ((ah) this).field_S) {
                                  ld.field_l[((ah) this).field_t][var5].c(var3, var4);
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                            }
                          }
                        }
                        L14: {
                          L15: {
                            if (0 < ((ah) this).field_Z) {
                              break L15;
                            } else {
                              if (!ng.field_e) {
                                break L14;
                              } else {
                                L16: {
                                  if (((ah) this).field_ib) {
                                    break L16;
                                  } else {
                                    if (!((ah) this).field_C) {
                                      break L14;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                                if (bo.field_p[86]) {
                                  break L14;
                                } else {
                                  break L15;
                                }
                              }
                            }
                          }
                          L17: {
                            if (!ng.field_e) {
                              break L17;
                            } else {
                              L18: {
                                if (((ah) this).field_ib) {
                                  break L18;
                                } else {
                                  if (((ah) this).field_C) {
                                    break L18;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                              L19: {
                                stackOut_61_0 = 0;
                                stackOut_61_1 = 0;
                                stackOut_61_2 = dn.field_E.field_w;
                                stackOut_61_3 = dn.field_E.field_t;
                                stackIn_63_0 = stackOut_61_0;
                                stackIn_63_1 = stackOut_61_1;
                                stackIn_63_2 = stackOut_61_2;
                                stackIn_63_3 = stackOut_61_3;
                                stackIn_62_0 = stackOut_61_0;
                                stackIn_62_1 = stackOut_61_1;
                                stackIn_62_2 = stackOut_61_2;
                                stackIn_62_3 = stackOut_61_3;
                                if (((ah) this).field_C) {
                                  stackOut_63_0 = stackIn_63_0;
                                  stackOut_63_1 = stackIn_63_1;
                                  stackOut_63_2 = stackIn_63_2;
                                  stackOut_63_3 = stackIn_63_3;
                                  stackOut_63_4 = 8921617;
                                  stackIn_64_0 = stackOut_63_0;
                                  stackIn_64_1 = stackOut_63_1;
                                  stackIn_64_2 = stackOut_63_2;
                                  stackIn_64_3 = stackOut_63_3;
                                  stackIn_64_4 = stackOut_63_4;
                                  break L19;
                                } else {
                                  stackOut_62_0 = stackIn_62_0;
                                  stackOut_62_1 = stackIn_62_1;
                                  stackOut_62_2 = stackIn_62_2;
                                  stackOut_62_3 = stackIn_62_3;
                                  stackOut_62_4 = 43775;
                                  stackIn_64_0 = stackOut_62_0;
                                  stackIn_64_1 = stackOut_62_1;
                                  stackIn_64_2 = stackOut_62_2;
                                  stackIn_64_3 = stackOut_62_3;
                                  stackIn_64_4 = stackOut_62_4;
                                  break L19;
                                }
                              }
                              L20: {
                                so.a(stackIn_64_0, stackIn_64_1, stackIn_64_2, stackIn_64_3, stackIn_64_4);
                                stackOut_64_0 = 0;
                                stackOut_64_1 = 0;
                                stackOut_64_2 = dn.field_E.field_w;
                                stackOut_64_3 = dn.field_E.field_t;
                                stackIn_66_0 = stackOut_64_0;
                                stackIn_66_1 = stackOut_64_1;
                                stackIn_66_2 = stackOut_64_2;
                                stackIn_66_3 = stackOut_64_3;
                                stackIn_65_0 = stackOut_64_0;
                                stackIn_65_1 = stackOut_64_1;
                                stackIn_65_2 = stackOut_64_2;
                                stackIn_65_3 = stackOut_64_3;
                                if (((ah) this).field_C) {
                                  stackOut_66_0 = stackIn_66_0;
                                  stackOut_66_1 = stackIn_66_1;
                                  stackOut_66_2 = stackIn_66_2;
                                  stackOut_66_3 = stackIn_66_3;
                                  stackOut_66_4 = 16711680;
                                  stackIn_67_0 = stackOut_66_0;
                                  stackIn_67_1 = stackOut_66_1;
                                  stackIn_67_2 = stackOut_66_2;
                                  stackIn_67_3 = stackOut_66_3;
                                  stackIn_67_4 = stackOut_66_4;
                                  break L20;
                                } else {
                                  stackOut_65_0 = stackIn_65_0;
                                  stackOut_65_1 = stackIn_65_1;
                                  stackOut_65_2 = stackIn_65_2;
                                  stackOut_65_3 = stackIn_65_3;
                                  stackOut_65_4 = 255;
                                  stackIn_67_0 = stackOut_65_0;
                                  stackIn_67_1 = stackOut_65_1;
                                  stackIn_67_2 = stackOut_65_2;
                                  stackIn_67_3 = stackOut_65_3;
                                  stackIn_67_4 = stackOut_65_4;
                                  break L20;
                                }
                              }
                              so.a(stackIn_67_0, stackIn_67_1, stackIn_67_2, stackIn_67_3, stackIn_67_4);
                              pa.a(-21189);
                              var4 = var7;
                              var3 = var6;
                              dn.field_E.b(var3, var4);
                              break L14;
                            }
                          }
                          pa.a(-21189);
                          var4 = var7;
                          var3 = var6;
                          dn.field_E.d(var3, var4, 142);
                          break L14;
                        }
                        L21: {
                          if (kc.field_Q) {
                            pc.field_k.a(s.a(1938762664, "<%0>,<%1>", new String[2]), 24 + var3, -5 + var4, 16777215, 0);
                            break L21;
                          } else {
                            break L21;
                          }
                        }
                        L22: {
                          if (((ah) this).field_ob) {
                            nb.field_k[0].b(var3, var4, 128, 16711680);
                            break L22;
                          } else {
                            break L22;
                          }
                        }
                        return;
                      }
                    }
                  }
                }
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final void j(int param0) {
        super.j(124);
        ((ah) this).e(3, -6904);
        if (param0 < 66) {
            ((ah) this).n(53);
        }
    }

    int j(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = ZombieDawn.field_J;
        ((ah) this).n(87);
        var2 = -1;
        var3 = 0;
        if (param0 < -42) {
          L0: while (true) {
            if (((ah) this).field_ub <= var3) {
              L1: {
                if (-1 + ((ah) this).field_ub != var2) {
                  break L1;
                } else {
                  var2 = -1;
                  break L1;
                }
              }
              return var2;
            } else {
              if (-1 != h.field_e[var3]) {
                L2: {
                  if (-1 == var2) {
                    break L2;
                  } else {
                    if (h.field_e[var3] >= h.field_e[var2]) {
                      break L2;
                    } else {
                      var3++;
                      continue L0;
                    }
                  }
                }
                var2 = var3;
                var3++;
                continue L0;
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return -120;
        }
    }

    final boolean a(int param0, fb param1) {
        ej var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          var3 = dj.field_e.field_H;
          if (param0 > 52) {
            break L0;
          } else {
            var8 = null;
            ((ah) this).a((byte) -36, (wk) null);
            break L0;
          }
        }
        L1: {
          L2: {
            var4 = ((ah) this).field_y >> 1972312944;
            var5 = ((ah) this).field_x >> -577246032;
            var6 = param1.field_y >> 551406032;
            var7 = param1.field_x >> -2052826832;
            if (0 != (var3.a(var7, var4, var5, (byte) -111, false, var6) ^ -1)) {
              break L2;
            } else {
              if (var3.a(-48 + var7 - -10, var4, 10 + (-48 + var5), (byte) -123, false, var6) == -1) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    void g(int param0) {
        int var2 = 0;
        le var3 = null;
        int var4 = 0;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        Object stackIn_49_0 = null;
        Object stackIn_50_0 = null;
        Object stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        Object stackIn_90_0 = null;
        Object stackIn_91_0 = null;
        Object stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        Object stackIn_94_0 = null;
        Object stackIn_95_0 = null;
        Object stackIn_96_0 = null;
        int stackIn_96_1 = 0;
        Object stackOut_89_0 = null;
        Object stackOut_91_0 = null;
        int stackOut_91_1 = 0;
        Object stackOut_90_0 = null;
        int stackOut_90_1 = 0;
        Object stackOut_93_0 = null;
        Object stackOut_95_0 = null;
        int stackOut_95_1 = 0;
        Object stackOut_94_0 = null;
        int stackOut_94_1 = 0;
        Object stackOut_48_0 = null;
        Object stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        Object stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        Object stackOut_27_0 = null;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        L0: {
          var4 = ZombieDawn.field_J;
          if (400 - -((ah) this).field_t <= dj.field_e.field_r) {
            break L0;
          } else {
            if (dj.field_e.field_r < -201) {
              if (-1 != pb.a(so.field_a, 25, 1)) {
                break L0;
              } else {
                ((ah) this).c(((ah) this).a(true) + pb.a(so.field_a, 1000, 1) - 500, 78, ((ah) this).f(237239984) - (-pb.a(so.field_a, 1000, 1) + 500));
                break L0;
              }
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (param0 >= 95) {
            break L1;
          } else {
            ((ah) this).field_gb = null;
            break L1;
          }
        }
        va discarded$1 = ((ah) this).m(-67);
        ((ah) this).d(((ah) this).field_F, -26109);
        if (!((ah) this).field_V) {
          L2: {
            if (-1 == (((ah) this).field_F ^ -1)) {
              L3: {
                ((ah) this).field_vb = ((ah) this).field_vb + 1;
                if (((ah) this).field_lb >= ((ah) this).field_vb + 1) {
                  break L3;
                } else {
                  L4: {
                    stackOut_89_0 = this;
                    stackIn_91_0 = stackOut_89_0;
                    stackIn_90_0 = stackOut_89_0;
                    if (((ah) this).field_hb) {
                      stackOut_91_0 = this;
                      stackOut_91_1 = 0;
                      stackIn_92_0 = stackOut_91_0;
                      stackIn_92_1 = stackOut_91_1;
                      break L4;
                    } else {
                      stackOut_90_0 = this;
                      stackOut_90_1 = 1;
                      stackIn_92_0 = stackOut_90_0;
                      stackIn_92_1 = stackOut_90_1;
                      break L4;
                    }
                  }
                  ((ah) this).field_hb = stackIn_92_1 != 0;
                  ((ah) this).field_vb = 0;
                  if (((ah) this).field_hb) {
                    ((ah) this).field_lb = 53;
                    break L3;
                  } else {
                    L5: {
                      stackOut_93_0 = this;
                      stackIn_95_0 = stackOut_93_0;
                      stackIn_94_0 = stackOut_93_0;
                      if (!((ah) this).field_hb) {
                        stackOut_95_0 = this;
                        stackOut_95_1 = pb.a(so.field_a, 200, 1) + 20;
                        stackIn_96_0 = stackOut_95_0;
                        stackIn_96_1 = stackOut_95_1;
                        break L5;
                      } else {
                        stackOut_94_0 = this;
                        stackOut_94_1 = 65;
                        stackIn_96_0 = stackOut_94_0;
                        stackIn_96_1 = stackOut_94_1;
                        break L5;
                      }
                    }
                    ((ah) this).field_lb = stackIn_96_1;
                    break L3;
                  }
                }
              }
              L6: {
                if (!((ah) this).field_hb) {
                  ((ah) this).field_G = 0;
                  break L6;
                } else {
                  break L6;
                }
              }
              ((ah) this).field_qb = ((ah) this).field_qb + 1;
              if ((((ah) this).field_qb ^ -1) <= -6) {
                ((ah) this).field_qb = 0;
                ((ah) this).l((byte) 52);
                break L2;
              } else {
                break L2;
              }
            } else {
              if (2 == ((ah) this).field_F) {
                L7: {
                  L8: {
                    if (0 != ((ah) this).field_O) {
                      break L8;
                    } else {
                      if (((ah) this).field_T != 0) {
                        break L8;
                      } else {
                        break L7;
                      }
                    }
                  }
                  ((ah) this).g((byte) -113);
                  if (dj.field_e.field_H.a(false, ((ah) this).field_T + ((ah) this).field_x >> -1523126096, ((ah) this).field_y + ((ah) this).field_O >> -1060854128, true)) {
                    break L7;
                  } else {
                    L9: {
                      ((ah) this).field_x = ((ah) this).field_x - ((ah) this).field_T;
                      ((ah) this).field_y = ((ah) this).field_y - ((ah) this).field_O;
                      if (((ah) this).field_O == 0) {
                        break L9;
                      } else {
                        if (!dj.field_e.field_H.a(false, ((ah) this).f(237239984), ((ah) this).field_O + ((ah) this).field_y >> 1639600464, true)) {
                          break L9;
                        } else {
                          ((ah) this).field_T = 0;
                          ((ah) this).field_y = ((ah) this).field_y + ((ah) this).field_O;
                          ((ah) this).field_X = ((ah) this).field_x >> 1870696816;
                          break L7;
                        }
                      }
                    }
                    L10: {
                      if (-1 == (((ah) this).field_T ^ -1)) {
                        break L10;
                      } else {
                        if (!dj.field_e.field_H.a(false, ((ah) this).field_x + ((ah) this).field_T >> 1427798000, ((ah) this).field_y >> 1431623312, true)) {
                          break L10;
                        } else {
                          ((ah) this).field_O = 0;
                          ((ah) this).field_Y = ((ah) this).field_y >> 1060555120;
                          ((ah) this).field_x = ((ah) this).field_x + ((ah) this).field_T;
                          break L7;
                        }
                      }
                    }
                    ((ah) this).field_O = 0;
                    ((ah) this).field_T = 0;
                    break L7;
                  }
                }
                if (-5 >= (((ah) this).field_G ^ -1)) {
                  if (((ah) this).field_G != 4) {
                    if (6 == ((ah) this).field_G) {
                      ((ah) this).e(0, -6904);
                      pi.a(((ah) this).f(237239984), ((ah) this).a(true), (byte) 101);
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    L11: {
                      ((ah) this).field_N = 0;
                      ((ah) this).field_rb = ((ah) this).field_rb + 1;
                      if (-401 >= (((ah) this).field_rb ^ -1)) {
                        ((ah) this).field_G = ((ah) this).field_G + 1;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    ((ah) this).field_T = 0;
                    ((ah) this).field_O = 0;
                    break L2;
                  }
                } else {
                  ((ah) this).field_N = ((ah) this).field_N + 1;
                  break L2;
                }
              } else {
                if ((((ah) this).field_F ^ -1) != -2) {
                  if (23 != ((ah) this).field_F) {
                    if (-4 != (((ah) this).field_F ^ -1)) {
                      if (((ah) this).field_F != -17) {
                        if (-21 != (((ah) this).field_F ^ -1)) {
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        ((ah) this).field_qb = ((ah) this).field_qb + 1;
                        if (-6 <= ((ah) this).field_qb) {
                          L12: {
                            ((ah) this).field_qb = 0;
                            if (((ah) this).field_cb == null) {
                              break L12;
                            } else {
                              if (!((ah) this).field_cb.c(111)) {
                                break L2;
                              } else {
                                break L12;
                              }
                            }
                          }
                          ((ah) this).field_cb = null;
                          ((ah) this).e(0, -6904);
                          ((ah) this).l((byte) 52);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    } else {
                      ((ah) this).field_qb = ((ah) this).field_qb + 1;
                      if (((ah) this).field_qb < 5) {
                        break L2;
                      } else {
                        ((ah) this).field_qb = 0;
                        ((ah) this).l((byte) 52);
                        break L2;
                      }
                    }
                  } else {
                    L13: {
                      ((ah) this).field_qb = ((ah) this).field_qb + 1;
                      if (5 <= ((ah) this).field_qb) {
                        ((ah) this).field_qb = 0;
                        var2 = 0;
                        var3 = dj.field_e.field_lb.b((byte) 26);
                        L14: while (true) {
                          if (!(var3 instanceof mm)) {
                            L15: {
                              L16: {
                                if (((ah) this).field_nb) {
                                  break L16;
                                } else {
                                  if (var2 != 0) {
                                    ((ah) this).c(0, ((ah) this).field_D >> -734620190);
                                    break L15;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                              if (!((ah) this).field_nb) {
                                break L15;
                              } else {
                                if (var2 == 0) {
                                  ((ah) this).c(0, ((ah) this).field_D);
                                  break L15;
                                } else {
                                  break L15;
                                }
                              }
                            }
                            L17: {
                              stackOut_48_0 = this;
                              stackIn_50_0 = stackOut_48_0;
                              stackIn_49_0 = stackOut_48_0;
                              if (var2 == 0) {
                                stackOut_50_0 = this;
                                stackOut_50_1 = 0;
                                stackIn_51_0 = stackOut_50_0;
                                stackIn_51_1 = stackOut_50_1;
                                break L17;
                              } else {
                                stackOut_49_0 = this;
                                stackOut_49_1 = 1;
                                stackIn_51_0 = stackOut_49_0;
                                stackIn_51_1 = stackOut_49_1;
                                break L17;
                              }
                            }
                            ((ah) this).field_nb = stackIn_51_1 != 0;
                            ((ah) this).l((byte) 52);
                            break L13;
                          } else {
                            var2 = var2 != 0 | ((mm) (Object) var3).a((ah) this, (byte) 79) ? 1 : 0;
                            var3 = var3.field_b;
                            continue L14;
                          }
                        }
                      } else {
                        break L13;
                      }
                    }
                    ((ah) this).g((byte) -104);
                    if (((ah) this).h((byte) -127)) {
                      ((ah) this).e(0, -6904);
                      ((ah) this).l((byte) 52);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                } else {
                  L18: {
                    ((ah) this).field_qb = ((ah) this).field_qb + 1;
                    if (((ah) this).field_qb >= 5) {
                      ((ah) this).field_qb = 0;
                      var2 = 0;
                      var3 = dj.field_e.field_lb.b((byte) 26);
                      L19: while (true) {
                        if (!(var3 instanceof mm)) {
                          L20: {
                            L21: {
                              if (((ah) this).field_nb) {
                                break L21;
                              } else {
                                if (var2 == 0) {
                                  break L21;
                                } else {
                                  ((ah) this).c(0, ((ah) this).field_D >> -1028351582);
                                  break L20;
                                }
                              }
                            }
                            if (!((ah) this).field_nb) {
                              break L20;
                            } else {
                              if (var2 == 0) {
                                ((ah) this).c(0, ((ah) this).field_D);
                                break L20;
                              } else {
                                break L20;
                              }
                            }
                          }
                          L22: {
                            stackOut_27_0 = this;
                            stackIn_29_0 = stackOut_27_0;
                            stackIn_28_0 = stackOut_27_0;
                            if (var2 == 0) {
                              stackOut_29_0 = this;
                              stackOut_29_1 = 0;
                              stackIn_30_0 = stackOut_29_0;
                              stackIn_30_1 = stackOut_29_1;
                              break L22;
                            } else {
                              stackOut_28_0 = this;
                              stackOut_28_1 = 1;
                              stackIn_30_0 = stackOut_28_0;
                              stackIn_30_1 = stackOut_28_1;
                              break L22;
                            }
                          }
                          ((ah) this).field_nb = stackIn_30_1 != 0;
                          break L18;
                        } else {
                          var2 = var2 != 0 | ((mm) (Object) var3).a((ah) this, (byte) 108) ? 1 : 0;
                          var3 = var3.field_b;
                          continue L19;
                        }
                      }
                    } else {
                      break L18;
                    }
                  }
                  ((ah) this).g((byte) 113);
                  if (((ah) this).h((byte) 126)) {
                    ((ah) this).e(0, -6904);
                    ((ah) this).l((byte) 52);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          return;
        } else {
          if ((((ah) this).field_F ^ -1) != -3) {
            return;
          } else {
            L23: {
              if (-3 + cg.field_h[2] != ((ah) this).field_G) {
                break L23;
              } else {
                ((ah) this).field_N = 0;
                break L23;
              }
            }
            return;
          }
        }
    }

    final void k(int param0) {
        if (param0 != 0) {
            return;
        }
        ((ah) this).o(-6253);
    }

    ah(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3);
        ((ah) this).field_nb = false;
        ((ah) this).field_ub = 61;
        ((ah) this).field_cb = null;
        ((ah) this).field_lb = 0;
        ((ah) this).field_rb = 0;
        ((ah) this).field_kb = false;
        ((ah) this).field_ib = false;
        ((ah) this).field_hb = false;
        ((ah) this).field_ob = false;
        ((ah) this).field_vb = 0;
        vn discarded$0 = new vn(48, 48);
        ((ah) this).field_lb = pb.a(so.field_a, 200, 1);
        ((ah) this).field_jb = new int[61];
        ((ah) this).field_gb = new int[61];
        this.i((byte) 79);
        ((ah) this).field_qb = pb.a(so.field_a, 5, 1);
        if (((ah) this).t(10)) {
            ((ah) this).field_db = 49 - -pb.a(so.field_a, 4, 1);
        } else {
            ((ah) this).field_db = pb.a(so.field_a, 3, 1) + 26;
        }
    }

    final void f(byte param0) {
        if (param0 != -85) {
            ((ah) this).k(76);
        }
        ((ah) this).field_J = true;
        ((ah) this).e(2, param0 + -6819);
        ((ah) this).field_G = 2;
    }

    final boolean a(boolean param0, boolean param1, int param2, int param3) {
        fb var5 = null;
        kd var6 = null;
        int var7 = 0;
        L0: {
          var7 = ZombieDawn.field_J;
          if (param2 < -83) {
            break L0;
          } else {
            ((ah) this).field_hb = true;
            break L0;
          }
        }
        var5 = ((ah) this).a((byte) -74, param3, 10);
        L1: while (true) {
          if (var5 == null) {
            return false;
          } else {
            L2: {
              if (!(var5 instanceof kd)) {
                break L2;
              } else {
                var6 = (kd) (Object) var5;
                if (var6 == null) {
                  break L2;
                } else {
                  L3: {
                    if (param0) {
                      break L3;
                    } else {
                      if ((var6.field_F ^ -1) == -9) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (var6.x(87)) {
                      break L4;
                    } else {
                      if (!(this instanceof we)) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (!var6.field_hb) {
                    L5: {
                      if (param1) {
                        break L5;
                      } else {
                        if (0 != (dj.field_e.field_H.a(var6.f(237239984), ((ah) this).a(true), ((ah) this).f(237239984), (byte) -91, false, var6.a(true)) ^ -1)) {
                          break L5;
                        } else {
                          if (0 != (dj.field_e.field_H.a(var6.f(237239984) + -48, ((ah) this).a(true), -48 + ((ah) this).f(237239984), (byte) -109, false, var6.a(true)) ^ -1)) {
                            break L5;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                    return true;
                  } else {
                    var5 = ((ah) this).e((byte) 32);
                    continue L1;
                  }
                }
              }
            }
            var5 = ((ah) this).e((byte) 32);
            continue L1;
          }
        }
    }

    final void a(nc param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        var3 = param0.field_m + -((ah) this).a(true);
        var4 = param0.field_q + -((ah) this).f(param1 ^ -237213750);
        if (param1 == -26246) {
          L0: {
            if (-102401 >= (var4 * var4 + var3 * var3 ^ -1)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 1;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var5 = stackIn_5_0;
            if (((ah) this).field_cb == param0) {
              if (var5 != 0) {
                break L1;
              } else {
                ((ah) this).field_cb = null;
                ((ah) this).e(0, param1 ^ 31858);
                ((ah) this).l((byte) 52);
                break L1;
              }
            } else {
              if (((ah) this).field_cb == null) {
                if (var5 != 0) {
                  ((ah) this).a(param0, (byte) -124);
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final void q(int param0) {
        if (param0 <= 5) {
            ((ah) this).c(22, 55, 42);
        }
        ((ah) this).e(0, -6904);
    }

    abstract void l(byte param0);

    void o(int param0) {
        if (param0 != -6253) {
            return;
        }
        ((ah) this).e(18, -6904);
        ((ah) this).b(-27598);
        ((ah) this).d(0);
        if (!(0 >= ((ah) this).field_z)) {
            dj.field_e.field_J[-1 + ((ah) this).field_z] = dj.field_e.field_J[-1 + ((ah) this).field_z] - 1;
        }
    }

    public static void u(int param0) {
        field_tb = null;
        field_bb = null;
        if (param0 < 21) {
            field_bb = null;
        }
    }

    private final void i(byte param0) {
        int var5 = 0;
        int var6 = ZombieDawn.field_J;
        int var2 = 99 % ((param0 - 0) / 50);
        int var3 = ((ah) this).a(true);
        int var4 = ((ah) this).f(237239984);
        for (var5 = 0; var5 < ((ah) this).field_ub + -1; var5++) {
            ((ah) this).field_jb[var5] = qd.field_a[var5] + var3;
            ((ah) this).field_gb[var5] = var4 + qd.field_f[var5];
        }
        ((ah) this).field_jb[((ah) this).field_ub - 1] = var3;
        ((ah) this).field_gb[-1 + ((ah) this).field_ub] = var4;
    }

    final boolean t(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_35_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_34_0 = 0;
        L0: {
          var3 = ZombieDawn.field_J;
          if (param0 == 10) {
            break L0;
          } else {
            ((ah) this).r(4);
            break L0;
          }
        }
        var2 = ((ah) this).field_t;
        if (var2 != 0) {
          L1: {
            L2: {
              if ((var2 ^ -1) == -2) {
                break L2;
              } else {
                if (var2 == 2) {
                  break L2;
                } else {
                  L3: {
                    if (var2 == -4) {
                      break L3;
                    } else {
                      if (-5 == var2) {
                        break L3;
                      } else {
                        if (5 == var2) {
                          break L3;
                        } else {
                          if (6 == var2) {
                            return true;
                          } else {
                            if (7 != var2) {
                              if (8 == var2) {
                                return true;
                              } else {
                                if (var2 == 9) {
                                  return false;
                                } else {
                                  if (10 != var2) {
                                    if (-12 == (var2 ^ -1)) {
                                      return false;
                                    } else {
                                      L4: {
                                        if ((var2 ^ -1) == -13) {
                                          break L4;
                                        } else {
                                          if ((var2 ^ -1) != -14) {
                                            if (var2 != 14) {
                                              if ((var2 ^ -1) == -16) {
                                                return true;
                                              } else {
                                                if (var2 == 16) {
                                                  return true;
                                                } else {
                                                  if ((var2 ^ -1) == -19) {
                                                    return true;
                                                  } else {
                                                    if (var2 == -20) {
                                                      return true;
                                                    } else {
                                                      if (20 != var2) {
                                                        L5: {
                                                          if (var2 != -22) {
                                                            if (-28 == var2) {
                                                              break L5;
                                                            } else {
                                                              if (-31 == var2) {
                                                                break L5;
                                                              } else {
                                                                if (29 != var2) {
                                                                  return true;
                                                                } else {
                                                                  stackOut_33_0 = 0;
                                                                  stackIn_35_0 = stackOut_33_0;
                                                                  break L1;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            break L5;
                                                          }
                                                        }
                                                        return false;
                                                      } else {
                                                        return true;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              break L4;
                                            }
                                          } else {
                                            break L4;
                                          }
                                        }
                                      }
                                      return true;
                                    }
                                  } else {
                                    return true;
                                  }
                                }
                              }
                            } else {
                              return true;
                            }
                          }
                        }
                      }
                    }
                  }
                  return true;
                }
              }
            }
            stackOut_34_0 = 0;
            stackIn_35_0 = stackOut_34_0;
            break L1;
          }
          return stackIn_35_0 != 0;
        } else {
          return false;
        }
    }

    abstract void a(wk param0, int param1);

    void a(nc param0, byte param1) {
        int var3 = 0;
        if (-19 == (((ah) this).field_F ^ -1)) {
          return;
        } else {
          L0: {
            if (20 == ((ah) this).field_F) {
              break L0;
            } else {
              if (((ah) this).field_F == 16) {
                break L0;
              } else {
                if ((((ah) this).field_F ^ -1) != -3) {
                  ((ah) this).e(16, -6904);
                  ((ah) this).field_cb = param0;
                  var3 = -89 % ((param1 - -53) / 54);
                  return;
                } else {
                  break L0;
                }
              }
            }
          }
          return;
        }
    }

    final void r(int param0) {
        ((ah) this).e(param0, param0 ^ -6884);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_bb = "PHANTOM";
    }
}
