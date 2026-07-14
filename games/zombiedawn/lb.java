/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class lb extends pn implements hh {
    static vn[] field_eb;
    private nh field_hb;
    private an[] field_U;
    private an field_W;
    private re[] field_fb;
    static int field_Y;
    private an field_V;
    private an field_gb;
    private boolean field_cb;
    private an field_bb;
    private boolean field_ab;
    private r field_T;
    static int[] field_db;
    private an field_ib;
    private boolean field_Z;
    private an field_X;

    private final an o(int param0) {
        if (cn.field_b != null) {
            return ((lb) this).field_V;
        }
        if (param0 != 16) {
            ((lb) this).field_cb = true;
        }
        if (null != rn.field_b) {
            if (rn.field_b.field_c) {
                if (!(null == ((lb) this).field_W)) {
                    return ((lb) this).field_W;
                }
            }
        }
        return ((lb) this).field_bb;
    }

    private final an a(byte param0, String param1, sk param2) {
        an var4 = new an(param1, param2);
        var4.field_h = (io) (Object) new vm();
        int var5 = ((lb) this).field_n + -46;
        if (param0 >= -38) {
            return null;
        }
        var4.a(-71, var5, 15, ((lb) this).field_i - 30, 30);
        ((lb) this).a((ga) (Object) var4, 10);
        return var4;
    }

    public static void h(byte param0) {
        if (param0 > -63) {
            boolean discarded$0 = lb.m(9);
        }
        field_db = null;
        field_eb = null;
    }

    public final void a(int param0, int param1, an param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int stackIn_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          var7 = ZombieDawn.field_J;
          if (param1 == -6) {
            break L0;
          } else {
            ((lb) this).field_fb = null;
            break L0;
          }
        }
        L1: {
          if (((lb) this).field_X == param2) {
            this.i((byte) -92);
            break L1;
          } else {
            if (param2 == ((lb) this).field_gb) {
              this.g((byte) -67);
              break L1;
            } else {
              if (param2 != ((lb) this).field_bb) {
                if (param2 != ((lb) this).field_W) {
                  L2: {
                    if (null != ((lb) this).field_hb) {
                      if (((lb) this).field_hb.field_l) {
                        stackOut_12_0 = 1;
                        stackIn_14_0 = stackOut_12_0;
                        break L2;
                      } else {
                        stackOut_11_0 = 0;
                        stackIn_14_0 = stackOut_11_0;
                        break L2;
                      }
                    } else {
                      stackOut_9_0 = 0;
                      stackIn_14_0 = stackOut_9_0;
                      break L2;
                    }
                  }
                  var6 = stackIn_14_0;
                  if (var6 != 0) {
                    break L1;
                  } else {
                    if (param2 != ((lb) this).field_V) {
                      break L1;
                    } else {
                      if (((lb) this).field_cb) {
                        if ((be.field_j ^ -1) < -1) {
                          this.a(param2, -115);
                          break L1;
                        } else {
                          ((lb) this).field_F.a((ga) (Object) new kf(((lb) this).field_F), true);
                          break L1;
                        }
                      } else {
                        ((lb) this).field_F.a((ga) (Object) new i(((lb) this).field_F, kb.field_f), true);
                        break L1;
                      }
                    }
                  }
                } else {
                  this.a(param2, -104);
                  break L1;
                }
              } else {
                this.a(param2, param1 ^ -91);
                break L1;
              }
            }
          }
        }
    }

    private final void g(byte param0) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        L0: {
          var3 = ZombieDawn.field_J;
          if (((lb) this).field_bb == ((lb) this).field_ib) {
            re.a((byte) -71);
            we.w(-55);
            break L0;
          } else {
            if (((lb) this).field_ib != ((lb) this).field_W) {
              if (((lb) this).field_ib != ((lb) this).field_V) {
                break L0;
              } else {
                L1: {
                  if (((lb) this).field_hb == null) {
                    break L1;
                  } else {
                    var2 = ((lb) this).field_hb.h(0);
                    if (0 <= var2) {
                      rn.field_b.a(((lb) this).field_fb[var2].field_d, ((lb) this).field_fb[var2].field_a, 124);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
                cn.a(true, false);
                ((lb) this).field_F.a((ga) (Object) new nj(((lb) this).field_F), true);
                break L0;
              }
            } else {
              re.a((byte) -71);
              sj.a((byte) 114);
              break L0;
            }
          }
        }
        L2: {
          ((lb) this).field_gb.field_C = false;
          if (param0 <= -46) {
            break L2;
          } else {
            var4 = null;
            this.a((an) null, -96);
            break L2;
          }
        }
    }

    private final void a(an param0, int param1) {
        int var5 = 0;
        re var6 = null;
        ((lb) this).field_ib = param0;
        int var4 = -49 / ((param1 - -40) / 47);
        boolean discarded$0 = param0.a((byte) 68, (ga) this);
        an var3 = this.o(16);
        ((lb) this).field_gb.field_C = var3 != param0 ? true : false;
        if (((lb) this).field_V == param0) {
            if (var3 == param0) {
                if (null != ((lb) this).field_hb) {
                    var5 = ((lb) this).field_hb.h(0);
                    var6 = ((lb) this).field_fb[var5];
                    if (var6.field_a == rn.field_b.field_t) {
                        // if_icmpeq L137
                    }
                    ((lb) this).field_gb.field_C = true;
                }
            }
        }
        this.n(-18681);
    }

    final void a(ga param0, byte param1, int param2, int param3) {
        an[] var5_ref_an__ = null;
        int var5 = 0;
        int var6 = 0;
        an var7 = null;
        int var8 = 0;
        an[] var9 = null;
        int stackIn_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        L0: {
          var8 = ZombieDawn.field_J;
          super.a(param0, (byte) 88, param2, param3);
          if (ll.field_a) {
            param0.c((byte) 57);
            var9 = ((lb) this).field_U;
            var5_ref_an__ = var9;
            var6 = 0;
            L1: while (true) {
              if (var6 >= var9.length) {
                break L0;
              } else {
                var7 = var9[var6];
                if (var7.field_l) {
                  boolean discarded$1 = var7.a((byte) 126, (ga) this);
                  var6++;
                  continue L1;
                } else {
                  var6++;
                  continue L1;
                }
              }
            }
          } else {
            break L0;
          }
        }
        L2: {
          if (((lb) this).field_ab) {
            break L2;
          } else {
            if (po.w(13296)) {
              break L2;
            } else {
              this.i((byte) -117);
              ((lb) this).field_F.a((ga) (Object) new lb(((lb) this).field_F), true);
              break L2;
            }
          }
        }
        L3: {
          if (null == ((lb) this).field_hb) {
            break L3;
          } else {
            L4: {
              if (((lb) this).field_hb.e((byte) -43)) {
                stackOut_14_0 = 0;
                stackIn_15_0 = stackOut_14_0;
                break L4;
              } else {
                stackOut_13_0 = 1;
                stackIn_15_0 = stackOut_13_0;
                break L4;
              }
            }
            if (stackIn_15_0 == (((lb) this).field_Z ? 1 : 0)) {
              this.a(((lb) this).field_V, 115);
              ((lb) this).field_Z = ((lb) this).field_hb.e((byte) -24);
              break L3;
            } else {
              break L3;
            }
          }
        }
        var5 = -47 % ((param1 - 46) / 42);
    }

    final boolean a(int param0, int param1, ga param2, char param3) {
        an var5 = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = ZombieDawn.field_J;
          var5 = null;
          if (((lb) this).field_bb.e(-17741)) {
            var5 = ((lb) this).field_bb;
            break L0;
          } else {
            L1: {
              if (((lb) this).field_W == null) {
                break L1;
              } else {
                if (!((lb) this).field_W.e(-17741)) {
                  break L1;
                } else {
                  var5 = ((lb) this).field_W;
                  break L0;
                }
              }
            }
            if (((lb) this).field_V.e(-17741)) {
              var5 = ((lb) this).field_V;
              break L0;
            } else {
              if (((lb) this).field_X.e(-17741)) {
                var5 = ((lb) this).field_X;
                break L0;
              } else {
                if (((lb) this).field_gb.e(-17741)) {
                  var5 = ((lb) this).field_gb;
                  break L0;
                } else {
                  if (!((lb) this).field_bb.field_x) {
                    L2: {
                      if (null == ((lb) this).field_W) {
                        break L2;
                      } else {
                        if (!((lb) this).field_W.field_x) {
                          break L2;
                        } else {
                          var5 = ((lb) this).field_W;
                          break L0;
                        }
                      }
                    }
                    if (!((lb) this).field_V.field_x) {
                      break L0;
                    } else {
                      var5 = ((lb) this).field_V;
                      break L0;
                    }
                  } else {
                    var5 = ((lb) this).field_bb;
                    break L0;
                  }
                }
              }
            }
          }
        }
        L3: {
          var6 = param1;
          if (-97 != (var6 ^ -1)) {
            if (var6 == 97) {
              if (var5 == ((lb) this).field_bb) {
                L4: {
                  if (null == ((lb) this).field_W) {
                    boolean discarded$13 = ((lb) this).field_V.a((byte) 111, (ga) this);
                    break L4;
                  } else {
                    boolean discarded$14 = ((lb) this).field_W.a((byte) 110, (ga) this);
                    break L4;
                  }
                }
                return true;
              } else {
                if (var5 == ((lb) this).field_W) {
                  boolean discarded$15 = ((lb) this).field_V.a((byte) 85, (ga) this);
                  return true;
                } else {
                  if (var5 != ((lb) this).field_X) {
                    break L3;
                  } else {
                    if (!((lb) this).field_gb.field_C) {
                      break L3;
                    } else {
                      boolean discarded$16 = ((lb) this).field_gb.a((byte) 74, (ga) this);
                      return true;
                    }
                  }
                }
              }
            } else {
              if ((var6 ^ -1) != -99) {
                if (99 != var6) {
                  break L3;
                } else {
                  L5: {
                    if (var5 == ((lb) this).field_bb) {
                      break L5;
                    } else {
                      if (var5 != ((lb) this).field_W) {
                        if (var5 != ((lb) this).field_V) {
                          break L3;
                        } else {
                          L6: {
                            if (!((lb) this).field_gb.field_C) {
                              boolean discarded$17 = ((lb) this).field_X.a((byte) 68, (ga) this);
                              break L6;
                            } else {
                              boolean discarded$18 = ((lb) this).field_gb.a((byte) 92, (ga) this);
                              break L6;
                            }
                          }
                          return true;
                        }
                      } else {
                        break L5;
                      }
                    }
                  }
                  boolean discarded$19 = ((lb) this).field_X.a((byte) 116, (ga) this);
                  return true;
                }
              } else {
                if (var5 == ((lb) this).field_X) {
                  boolean discarded$20 = ((lb) this).field_bb.a((byte) 89, (ga) this);
                  return true;
                } else {
                  if (((lb) this).field_gb == var5) {
                    boolean discarded$21 = ((lb) this).field_V.a((byte) 102, (ga) this);
                    return true;
                  } else {
                    var6 = -79 / ((param0 - -83) / 32);
                    return super.a(-118, param1, param2, param3);
                  }
                }
              }
            }
          } else {
            if (var5 != ((lb) this).field_V) {
              if (var5 == ((lb) this).field_W) {
                boolean discarded$22 = ((lb) this).field_bb.a((byte) 125, (ga) this);
                return true;
              } else {
                if (var5 != ((lb) this).field_gb) {
                  break L3;
                } else {
                  boolean discarded$23 = ((lb) this).field_X.a((byte) 74, (ga) this);
                  return true;
                }
              }
            } else {
              if (null == ((lb) this).field_W) {
                boolean discarded$24 = ((lb) this).field_bb.a((byte) 84, (ga) this);
                return true;
              } else {
                boolean discarded$25 = ((lb) this).field_W.a((byte) 125, (ga) this);
                return true;
              }
            }
          }
        }
        var6 = -79 / ((param0 - -83) / 32);
        return super.a(-118, param1, param2, param3);
    }

    private final void n(int param0) {
        int var3 = 0;
        an var4 = null;
        int var5 = ZombieDawn.field_J;
        if (param0 != -18681) {
            return;
        }
        an[] var6 = ((lb) this).field_U;
        an[] var2 = var6;
        for (var3 = 0; var6.length > var3; var3++) {
            var4 = var6[var3];
            var4.field_x = var4 == ((lb) this).field_ib ? true : false;
        }
    }

    final static boolean m(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 < -77) {
            break L0;
          } else {
            lb.h((byte) 52);
            break L0;
          }
        }
        L1: {
          L2: {
            if (sn.field_c == null) {
              break L2;
            } else {
              if (!ic.field_T.b(-44)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    private final an a(String param0, v[] param1, byte param2, sk param3) {
        an var5 = new an(param0, param3);
        var5.field_h = (io) (Object) new k(param1);
        if (param2 != 32) {
            return null;
        }
        r var6 = ((lb) this).field_T;
        an var7 = var5;
        var6.a(0, (ga) (Object) var7, var6.field_M);
        ((lb) this).field_T.a(true);
        return var5;
    }

    lb(dn param0) {
        super(param0, 430, 254);
        int var2 = 0;
        int var3 = 0;
        re[] var3_ref_re__ = null;
        int var4 = 0;
        int var5 = 0;
        String[] var5_ref_String__ = null;
        int var6_int = 0;
        an var6 = null;
        int var7_int = 0;
        ga var7 = null;
        re var8 = null;
        String var10 = null;
        Object stackIn_33_0 = null;
        Object stackIn_34_0 = null;
        Object stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int stackIn_38_0 = 0;
        Object stackIn_39_0 = null;
        Object stackIn_40_0 = null;
        Object stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_52_0 = 0;
        Object stackIn_53_0 = null;
        r stackIn_53_1 = null;
        r stackIn_53_2 = null;
        int stackIn_53_3 = 0;
        Object stackIn_54_0 = null;
        r stackIn_54_1 = null;
        r stackIn_54_2 = null;
        int stackIn_54_3 = 0;
        Object stackIn_55_0 = null;
        r stackIn_55_1 = null;
        r stackIn_55_2 = null;
        int stackIn_55_3 = 0;
        Object stackIn_56_0 = null;
        r stackIn_56_1 = null;
        r stackIn_56_2 = null;
        int stackIn_56_3 = 0;
        int stackIn_56_4 = 0;
        Object stackIn_59_0 = null;
        Object stackIn_60_0 = null;
        Object stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        String stackIn_78_0 = null;
        Object stackOut_32_0 = null;
        Object stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        Object stackOut_38_0 = null;
        Object stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        Object stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_45_0 = 0;
        Object stackOut_52_0 = null;
        r stackOut_52_1 = null;
        r stackOut_52_2 = null;
        int stackOut_52_3 = 0;
        Object stackOut_53_0 = null;
        r stackOut_53_1 = null;
        r stackOut_53_2 = null;
        int stackOut_53_3 = 0;
        Object stackOut_55_0 = null;
        r stackOut_55_1 = null;
        r stackOut_55_2 = null;
        int stackOut_55_3 = 0;
        int stackOut_55_4 = 0;
        Object stackOut_54_0 = null;
        r stackOut_54_1 = null;
        r stackOut_54_2 = null;
        int stackOut_54_3 = 0;
        int stackOut_54_4 = 0;
        Object stackOut_58_0 = null;
        Object stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        Object stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        String stackOut_77_0 = null;
        String stackOut_76_0 = null;
        L0: {
          ((lb) this).field_fb = ud.a(0, vh.field_a);
          if ((((lb) this).field_fb.length ^ -1) >= -1) {
            break L0;
          } else {
            var2 = 0;
            L1: while (true) {
              if (var2 >= ((lb) this).field_fb.length) {
                var2 = 0;
                var3 = 0;
                L2: while (true) {
                  if (((lb) this).field_fb.length <= var3) {
                    var3_ref_re__ = ((lb) this).field_fb;
                    ((lb) this).field_fb = new re[var2];
                    var4 = 0;
                    var5 = 0;
                    L3: while (true) {
                      if (var3_ref_re__.length <= var5) {
                        wc.a(((lb) this).field_fb, 0);
                        break L0;
                      } else {
                        if (var3_ref_re__[var5] != null) {
                          var4++;
                          ((lb) this).field_fb[var4] = var3_ref_re__[var5];
                          var5++;
                          continue L3;
                        } else {
                          var5++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    if (((lb) this).field_fb[var3] != null) {
                      var2++;
                      var3++;
                      continue L2;
                    } else {
                      var3++;
                      continue L2;
                    }
                  }
                }
              } else {
                if (((lb) this).field_fb[var2] != null) {
                  var3 = 1 + var2;
                  L4: while (true) {
                    if (((lb) this).field_fb.length <= var3) {
                      if (null != rn.field_b) {
                        if (((lb) this).field_fb[var2] != null) {
                          if (!rn.field_b.c(((lb) this).field_fb[var2].field_d, ((lb) this).field_fb[var2].field_a, 79)) {
                            ((lb) this).field_fb[var2] = null;
                            var2++;
                            continue L1;
                          } else {
                            var2++;
                            continue L1;
                          }
                        } else {
                          var2++;
                          continue L1;
                        }
                      } else {
                        var2++;
                        continue L1;
                      }
                    } else {
                      if (null != ((lb) this).field_fb[var3]) {
                        if (((lb) this).field_fb[var2].field_a == ((lb) this).field_fb[var3].field_a) {
                          if (((lb) this).field_fb[var3].field_d == ((lb) this).field_fb[var2].field_d) {
                            ((lb) this).field_fb[var3] = null;
                            var3++;
                            continue L4;
                          } else {
                            var3++;
                            continue L4;
                          }
                        } else {
                          var3++;
                          continue L4;
                        }
                      } else {
                        var3++;
                        continue L4;
                      }
                    }
                  }
                } else {
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
        L5: {
          stackOut_32_0 = this;
          stackIn_34_0 = stackOut_32_0;
          stackIn_33_0 = stackOut_32_0;
          if (0 >= ((lb) this).field_fb.length) {
            stackOut_34_0 = this;
            stackOut_34_1 = 0;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            break L5;
          } else {
            stackOut_33_0 = this;
            stackOut_33_1 = 1;
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            break L5;
          }
        }
        L6: {
          ((lb) this).field_cb = stackIn_35_1 != 0;
          if (!lm.f((byte) 126)) {
            stackOut_37_0 = 0;
            stackIn_38_0 = stackOut_37_0;
            break L6;
          } else {
            stackOut_36_0 = 1;
            stackIn_38_0 = stackOut_36_0;
            break L6;
          }
        }
        L7: {
          var2 = stackIn_38_0;
          stackOut_38_0 = this;
          stackIn_40_0 = stackOut_38_0;
          stackIn_39_0 = stackOut_38_0;
          if (po.w(13296)) {
            stackOut_40_0 = this;
            stackOut_40_1 = 0;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            break L7;
          } else {
            stackOut_39_0 = this;
            stackOut_39_1 = 1;
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            break L7;
          }
        }
        L8: {
          ((lb) this).field_ab = stackIn_41_1 != 0;
          if (var2 == 0) {
            stackOut_43_0 = 2;
            stackIn_44_0 = stackOut_43_0;
            break L8;
          } else {
            stackOut_42_0 = 3;
            stackIn_44_0 = stackOut_42_0;
            break L8;
          }
        }
        L9: {
          var3 = stackIn_44_0;
          if (var2 == 0) {
            if (null != rn.field_b) {
              if (rn.field_b.b(0)) {
                stackOut_50_0 = 1;
                stackIn_52_0 = stackOut_50_0;
                break L9;
              } else {
                stackOut_49_0 = 0;
                stackIn_52_0 = stackOut_49_0;
                break L9;
              }
            } else {
              stackOut_47_0 = 0;
              stackIn_52_0 = stackOut_47_0;
              break L9;
            }
          } else {
            stackOut_45_0 = 0;
            stackIn_52_0 = stackOut_45_0;
            break L9;
          }
        }
        L10: {
          L11: {
            var4 = stackIn_52_0;
            stackOut_52_0 = this;
            stackOut_52_1 = null;
            stackOut_52_2 = null;
            stackOut_52_3 = 10;
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_54_2 = stackOut_52_2;
            stackIn_54_3 = stackOut_52_3;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            stackIn_53_2 = stackOut_52_2;
            stackIn_53_3 = stackOut_52_3;
            if (var2 != 0) {
              break L11;
            } else {
              stackOut_53_0 = this;
              stackOut_53_1 = null;
              stackOut_53_2 = null;
              stackOut_53_3 = stackIn_53_3;
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              stackIn_55_3 = stackOut_53_3;
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              stackIn_54_3 = stackOut_53_3;
              if (var4 == 0) {
                stackOut_55_0 = this;
                stackOut_55_1 = null;
                stackOut_55_2 = null;
                stackOut_55_3 = stackIn_55_3;
                stackOut_55_4 = 75;
                stackIn_56_0 = stackOut_55_0;
                stackIn_56_1 = stackOut_55_1;
                stackIn_56_2 = stackOut_55_2;
                stackIn_56_3 = stackOut_55_3;
                stackIn_56_4 = stackOut_55_4;
                break L10;
              } else {
                break L11;
              }
            }
          }
          stackOut_54_0 = this;
          stackOut_54_1 = null;
          stackOut_54_2 = null;
          stackOut_54_3 = stackIn_54_3;
          stackOut_54_4 = 58;
          stackIn_56_0 = stackOut_54_0;
          stackIn_56_1 = stackOut_54_1;
          stackIn_56_2 = stackOut_54_2;
          stackIn_56_3 = stackOut_54_3;
          stackIn_56_4 = stackOut_54_4;
          break L10;
        }
        L12: {
          new r(stackIn_56_3, stackIn_56_4, 410, 105, (io) null, var3, 1);
          ((lb) this).field_T = stackIn_56_1;
          ((lb) this).field_T.field_M = 83;
          ((lb) this).field_T.a((byte) 106, 5, 5);
          ((lb) this).a((ga) (Object) ((lb) this).field_T, 10);
          ((lb) this).field_bb = this.a(vd.field_a, ti.field_e, (byte) 32, (sk) this);
          if (var2 == 0) {
            break L12;
          } else {
            ((lb) this).field_W = this.a(ma.field_n, li.field_h, (byte) 32, (sk) this);
            break L12;
          }
        }
        L13: {
          ((lb) this).field_V = this.a(j.field_j, af.field_c, (byte) 32, (sk) this);
          stackOut_58_0 = this;
          stackIn_60_0 = stackOut_58_0;
          stackIn_59_0 = stackOut_58_0;
          if (var2 != 0) {
            stackOut_60_0 = this;
            stackOut_60_1 = 3;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            break L13;
          } else {
            stackOut_59_0 = this;
            stackOut_59_1 = 2;
            stackIn_61_0 = stackOut_59_0;
            stackIn_61_1 = stackOut_59_1;
            break L13;
          }
        }
        L14: {
          ((lb) this).field_U = new an[stackIn_61_1];
          ((lb) this).field_U[1] = ((lb) this).field_V;
          ((lb) this).field_U[0] = ((lb) this).field_bb;
          if (var2 == 0) {
            break L14;
          } else {
            ((lb) this).field_U[2] = ((lb) this).field_W;
            break L14;
          }
        }
        L15: {
          if (!((lb) this).field_cb) {
            break L15;
          } else {
            if (var2 == 0) {
              break L15;
            } else {
              var5_ref_String__ = new String[((lb) this).field_fb.length];
              var6_int = -1 + var5_ref_String__.length;
              var7_int = 0;
              L16: while (true) {
                if (var7_int >= ((lb) this).field_fb.length) {
                  ((lb) this).field_hb = new nh((Object[]) (Object) var5_ref_String__, var6_int, 150);
                  ((lb) this).field_hb.a(-87, -19 + (((lb) this).field_V.field_j + (((lb) this).field_T.field_j - -((lb) this).field_V.field_n)), ((lb) this).field_V.field_k + ((lb) this).field_T.field_k, 126, 18);
                  ((lb) this).field_x.a((le) (Object) ((lb) this).field_hb, -123);
                  break L15;
                } else {
                  L17: {
                    var8 = ((lb) this).field_fb[var7_int];
                    if (cn.field_b == null) {
                      break L17;
                    } else {
                      if (rn.field_b.field_t != var8.field_a) {
                        break L17;
                      } else {
                        if (rn.field_b.field_i != var8.field_d) {
                          break L17;
                        } else {
                          var6_int = var7_int;
                          break L17;
                        }
                      }
                    }
                  }
                  var5_ref_String__[var7_int] = var8.field_a + "<times>" + var8.field_d;
                  var7_int++;
                  continue L16;
                }
              }
            }
          }
        }
        L18: {
          L19: {
            ((lb) this).field_X = this.a((byte) -101, lk.field_j, (sk) this);
            var5 = ((lb) this).field_X.field_i / 2 + ((lb) this).field_X.field_k;
            ((lb) this).field_X.field_i = 150;
            ((lb) this).field_X.field_k = -20 + (var5 + -((lb) this).field_X.field_i);
            ((lb) this).field_gb = this.a((byte) -80, bd.field_h, (sk) this);
            ((lb) this).field_gb.field_k = var5 + 20;
            ((lb) this).field_gb.field_i = ((lb) this).field_X.field_i;
            ((lb) this).field_gb.field_C = false;
            if (var2 != 0) {
              break L19;
            } else {
              if (var4 == 0) {
                break L18;
              } else {
                break L19;
              }
            }
          }
          L20: {
            if (var2 != 0) {
              stackOut_77_0 = el.field_h;
              stackIn_78_0 = stackOut_77_0;
              break L20;
            } else {
              stackOut_76_0 = qp.field_a;
              stackIn_78_0 = stackOut_76_0;
              break L20;
            }
          }
          var10 = stackIn_78_0;
          var6 = (an) (Object) var10;
          var7 = new ga(var10, (sk) null);
          var7.field_i = ((lb) this).field_i;
          var7.field_j = 163;
          var7.field_k = 0;
          var7.field_n = 80;
          var7.field_h = (io) (Object) new vf(ia.field_e, 20, 20, 0, 10, 16777215, -1, 0, 0, 16, 0, 0, true);
          ((lb) this).a(var7, 10);
          break L18;
        }
        L21: {
          ((lb) this).field_Z = false;
          var6 = this.o(16);
          if (var6 == null) {
            break L21;
          } else {
            var6.field_x = true;
            break L21;
          }
        }
    }

    private final void i(byte param0) {
        if (!((lb) this).field_H) {
            return;
        }
        ((lb) this).field_H = false;
        if (param0 > -87) {
            ((lb) this).field_ib = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_db = new int[8192];
    }
}
