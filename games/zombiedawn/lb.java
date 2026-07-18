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
        an var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        Object stackIn_2_0 = null;
        an stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        an stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var4 = new an(param1, param2);
            var4.field_h = (io) (Object) new vm();
            var5 = ((lb) this).field_n + -46;
            if (param0 < -38) {
              var4.a(-71, var5, 15, ((lb) this).field_i - 30, 30);
              ((lb) this).a((ga) (Object) var4, 10);
              stackOut_3_0 = (an) var4;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (an) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4_ref;
            stackOut_5_1 = new StringBuilder().append("lb.JA(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_4_0;
    }

    public static void h(byte param0) {
        if (param0 > -63) {
            boolean discarded$0 = lb.m(9);
        }
        field_db = null;
        field_eb = null;
    }

    public final void a(int param0, int param1, an param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var7 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              if (param1 == -6) {
                break L1;
              } else {
                ((lb) this).field_fb = null;
                break L1;
              }
            }
            L2: {
              if (((lb) this).field_X == param2) {
                this.i((byte) -92);
                break L2;
              } else {
                if (param2 == ((lb) this).field_gb) {
                  this.g((byte) -67);
                  break L2;
                } else {
                  if (param2 != ((lb) this).field_bb) {
                    if (param2 != ((lb) this).field_W) {
                      L3: {
                        if (null != ((lb) this).field_hb) {
                          if (((lb) this).field_hb.field_l) {
                            stackOut_13_0 = 1;
                            stackIn_15_0 = stackOut_13_0;
                            break L3;
                          } else {
                            stackOut_12_0 = 0;
                            stackIn_15_0 = stackOut_12_0;
                            break L3;
                          }
                        } else {
                          stackOut_10_0 = 0;
                          stackIn_15_0 = stackOut_10_0;
                          break L3;
                        }
                      }
                      var6_int = stackIn_15_0;
                      if (var6_int != 0) {
                        break L2;
                      } else {
                        if (param2 != ((lb) this).field_V) {
                          break L2;
                        } else {
                          if (((lb) this).field_cb) {
                            if (be.field_j > 0) {
                              this.a(param2, -115);
                              break L2;
                            } else {
                              ((lb) this).field_F.a((ga) (Object) new kf(((lb) this).field_F), true);
                              break L2;
                            }
                          } else {
                            ((lb) this).field_F.a((ga) (Object) new i(((lb) this).field_F, kb.field_f), true);
                            break L2;
                          }
                        }
                      }
                    } else {
                      this.a(param2, -104);
                      break L2;
                    }
                  } else {
                    this.a(param2, param1 ^ -91);
                    break L2;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var6;
            stackOut_26_1 = new StringBuilder().append("lb.K(").append(param0).append(',').append(param1).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param2 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L4;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L4;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void g(byte param0) {
        int var2 = 0;
        int var3 = 0;
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
        ((lb) this).field_gb.field_C = false;
    }

    private final void a(an param0, int param1) {
        an var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        re var6 = null;
        an stackIn_1_0 = null;
        an stackIn_2_0 = null;
        an stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        an stackOut_0_0 = null;
        an stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        an stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              ((lb) this).field_ib = param0;
              var4 = -49 / ((param1 - -40) / 47);
              boolean discarded$3 = param0.a((byte) 68, (ga) this);
              var3 = this.o(16);
              stackOut_0_0 = ((lb) this).field_gb;
              stackIn_2_0 = stackOut_0_0;
              stackIn_1_0 = stackOut_0_0;
              if (var3 == param0) {
                stackOut_2_0 = (an) (Object) stackIn_2_0;
                stackOut_2_1 = 0;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                break L1;
              } else {
                stackOut_1_0 = (an) (Object) stackIn_1_0;
                stackOut_1_1 = 1;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                break L1;
              }
            }
            L2: {
              stackIn_3_0.field_C = stackIn_3_1 != 0;
              if (((lb) this).field_V == param0) {
                if (var3 == param0) {
                  if (null != ((lb) this).field_hb) {
                    L3: {
                      var5 = ((lb) this).field_hb.h(0);
                      var6 = ((lb) this).field_fb[var5];
                      if (var6.field_a != rn.field_b.field_t) {
                        break L3;
                      } else {
                        if (rn.field_b.field_i != var6.field_d) {
                          break L3;
                        } else {
                          this.n(-18681);
                          break L2;
                        }
                      }
                    }
                    ((lb) this).field_gb.field_C = true;
                    this.n(-18681);
                    break L2;
                  } else {
                    this.n(-18681);
                    break L2;
                  }
                } else {
                  this.n(-18681);
                  break L2;
                }
              } else {
                this.n(-18681);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3_ref;
            stackOut_16_1 = new StringBuilder().append("lb.L(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ')');
        }
    }

    final void a(ga param0, byte param1, int param2, int param3) {
        an[] var9 = null;
        int var6 = 0;
        an var7 = null;
        int var8 = ZombieDawn.field_J;
        try {
            super.a(param0, (byte) 88, param2, param3);
            if (!(!ll.field_a)) {
                param0.c((byte) 57);
                var9 = ((lb) this).field_U;
                an[] var5 = var9;
                for (var6 = 0; var6 < var9.length; var6++) {
                    var7 = var9[var6];
                    if (var7.field_l) {
                        boolean discarded$0 = var7.a((byte) 126, (ga) this);
                    }
                }
            }
            if (!((lb) this).field_ab) {
                if (!po.w(13296)) {
                    this.i((byte) -117);
                    ((lb) this).field_F.a((ga) (Object) new lb(((lb) this).field_F), true);
                }
            }
            if (null != ((lb) this).field_hb) {
                if (!((!((lb) this).field_hb.e((byte) -43) ? 1 : 0) != (((lb) this).field_Z ? 1 : 0))) {
                    this.a(((lb) this).field_V, 115);
                    ((lb) this).field_Z = ((lb) this).field_hb.e((byte) -24);
                }
            }
            int var5_int = -47 % ((param1 - 46) / 42);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "lb.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, int param1, ga param2, char param3) {
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_30_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_71_0 = 0;
        boolean stackIn_73_0 = false;
        Object stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        Object stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        Object stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_43_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_29_0 = 0;
        boolean stackOut_72_0 = false;
        Object stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        Object stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        Object stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        var7 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              var5 = null;
              if (((lb) this).field_bb.e(-17741)) {
                var5 = (Object) (Object) ((lb) this).field_bb;
                break L1;
              } else {
                L2: {
                  if (((lb) this).field_W == null) {
                    break L2;
                  } else {
                    if (!((lb) this).field_W.e(-17741)) {
                      break L2;
                    } else {
                      var5 = (Object) (Object) ((lb) this).field_W;
                      break L1;
                    }
                  }
                }
                if (((lb) this).field_V.e(-17741)) {
                  var5 = (Object) (Object) ((lb) this).field_V;
                  break L1;
                } else {
                  if (((lb) this).field_X.e(-17741)) {
                    var5 = (Object) (Object) ((lb) this).field_X;
                    break L1;
                  } else {
                    if (((lb) this).field_gb.e(-17741)) {
                      var5 = (Object) (Object) ((lb) this).field_gb;
                      break L1;
                    } else {
                      if (!((lb) this).field_bb.field_x) {
                        L3: {
                          if (null == ((lb) this).field_W) {
                            break L3;
                          } else {
                            if (!((lb) this).field_W.field_x) {
                              break L3;
                            } else {
                              var5 = (Object) (Object) ((lb) this).field_W;
                              break L1;
                            }
                          }
                        }
                        if (!((lb) this).field_V.field_x) {
                          break L1;
                        } else {
                          var5 = (Object) (Object) ((lb) this).field_V;
                          break L1;
                        }
                      } else {
                        var5 = (Object) (Object) ((lb) this).field_bb;
                        break L1;
                      }
                    }
                  }
                }
              }
            }
            L4: {
              var6 = param1;
              if (var6 != 96) {
                if (var6 == 97) {
                  if (var5 == (Object) (Object) ((lb) this).field_bb) {
                    L5: {
                      if (null != ((lb) this).field_W) {
                        boolean discarded$13 = ((lb) this).field_W.a((byte) 110, (ga) this);
                        break L5;
                      } else {
                        boolean discarded$14 = ((lb) this).field_V.a((byte) 111, (ga) this);
                        break L5;
                      }
                    }
                    stackOut_43_0 = 1;
                    stackIn_44_0 = stackOut_43_0;
                    return stackIn_44_0 != 0;
                  } else {
                    if (var5 == (Object) (Object) ((lb) this).field_W) {
                      boolean discarded$15 = ((lb) this).field_V.a((byte) 85, (ga) this);
                      stackOut_47_0 = 1;
                      stackIn_48_0 = stackOut_47_0;
                      return stackIn_48_0 != 0;
                    } else {
                      if (var5 != (Object) (Object) ((lb) this).field_X) {
                        break L4;
                      } else {
                        if (!((lb) this).field_gb.field_C) {
                          break L4;
                        } else {
                          boolean discarded$16 = ((lb) this).field_gb.a((byte) 74, (ga) this);
                          stackOut_51_0 = 1;
                          stackIn_52_0 = stackOut_51_0;
                          return stackIn_52_0 != 0;
                        }
                      }
                    }
                  }
                } else {
                  if (var6 != 98) {
                    if (99 != var6) {
                      break L4;
                    } else {
                      L6: {
                        if (var5 == (Object) (Object) ((lb) this).field_bb) {
                          break L6;
                        } else {
                          if (var5 != (Object) (Object) ((lb) this).field_W) {
                            if (var5 != (Object) (Object) ((lb) this).field_V) {
                              break L4;
                            } else {
                              L7: {
                                if (!((lb) this).field_gb.field_C) {
                                  boolean discarded$17 = ((lb) this).field_X.a((byte) 68, (ga) this);
                                  break L7;
                                } else {
                                  boolean discarded$18 = ((lb) this).field_gb.a((byte) 92, (ga) this);
                                  break L7;
                                }
                              }
                              stackOut_70_0 = 1;
                              stackIn_71_0 = stackOut_70_0;
                              return stackIn_71_0 != 0;
                            }
                          } else {
                            break L6;
                          }
                        }
                      }
                      boolean discarded$19 = ((lb) this).field_X.a((byte) 116, (ga) this);
                      stackOut_64_0 = 1;
                      stackIn_65_0 = stackOut_64_0;
                      return stackIn_65_0 != 0;
                    }
                  } else {
                    if (var5 == (Object) (Object) ((lb) this).field_X) {
                      boolean discarded$20 = ((lb) this).field_bb.a((byte) 89, (ga) this);
                      stackOut_55_0 = 1;
                      stackIn_56_0 = stackOut_55_0;
                      return stackIn_56_0 != 0;
                    } else {
                      if ((Object) (Object) ((lb) this).field_gb == var5) {
                        boolean discarded$21 = ((lb) this).field_V.a((byte) 102, (ga) this);
                        stackOut_59_0 = 1;
                        stackIn_60_0 = stackOut_59_0;
                        return stackIn_60_0 != 0;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              } else {
                if (var5 != (Object) (Object) ((lb) this).field_V) {
                  if (var5 == (Object) (Object) ((lb) this).field_W) {
                    boolean discarded$22 = ((lb) this).field_bb.a((byte) 125, (ga) this);
                    stackOut_33_0 = 1;
                    stackIn_34_0 = stackOut_33_0;
                    return stackIn_34_0 != 0;
                  } else {
                    if (var5 != (Object) (Object) ((lb) this).field_gb) {
                      break L4;
                    } else {
                      boolean discarded$23 = ((lb) this).field_X.a((byte) 74, (ga) this);
                      stackOut_36_0 = 1;
                      stackIn_37_0 = stackOut_36_0;
                      return stackIn_37_0 != 0;
                    }
                  }
                } else {
                  if (null == ((lb) this).field_W) {
                    boolean discarded$24 = ((lb) this).field_bb.a((byte) 84, (ga) this);
                    stackOut_29_0 = 1;
                    stackIn_30_0 = stackOut_29_0;
                    return stackIn_30_0 != 0;
                  } else {
                    boolean discarded$25 = ((lb) this).field_W.a((byte) 125, (ga) this);
                    return true;
                  }
                }
              }
            }
            var6 = -79 / ((param0 - -83) / 32);
            stackOut_72_0 = super.a(-118, param1, param2, param3);
            stackIn_73_0 = stackOut_72_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_74_0 = var5;
            stackOut_74_1 = new StringBuilder().append("lb.I(").append(param0).append(',').append(param1).append(',');
            stackIn_76_0 = stackOut_74_0;
            stackIn_76_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param2 == null) {
              stackOut_76_0 = stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L8;
            } else {
              stackOut_75_0 = stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "{...}";
              stackIn_77_0 = stackOut_75_0;
              stackIn_77_1 = stackOut_75_1;
              stackIn_77_2 = stackOut_75_2;
              break L8;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_77_0, stackIn_77_2 + ',' + param3 + ')');
        }
        return stackIn_73_0;
    }

    private final void n(int param0) {
        int var3 = 0;
        an var4 = null;
        int var5 = ZombieDawn.field_J;
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
        an var5 = null;
        RuntimeException var5_ref = null;
        r var6 = null;
        an var7 = null;
        an stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        an stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            var5 = new an(param0, param3);
            var5.field_h = (io) (Object) new k(param1);
            var6 = ((lb) this).field_T;
            var7 = var5;
            var6.a(0, (ga) (Object) var7, var6.field_M);
            ((lb) this).field_T.a(true);
            stackOut_2_0 = (an) var5;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5_ref;
            stackOut_4_1 = new StringBuilder().append("lb.J(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(32).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    lb(dn param0) {
        super(param0, 430, 254);
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        re[] var3_ref_re__ = null;
        int var4 = 0;
        int var5 = 0;
        String[] var5_ref_String__ = null;
        int var6_int = 0;
        an var6 = null;
        String var6_ref = null;
        int var7_int = 0;
        ga var7 = null;
        re var8 = null;
        String var10 = null;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int stackIn_34_0 = 0;
        Object stackIn_35_0 = null;
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_48_0 = 0;
        Object stackIn_49_0 = null;
        r stackIn_49_1 = null;
        r stackIn_49_2 = null;
        int stackIn_49_3 = 0;
        Object stackIn_50_0 = null;
        r stackIn_50_1 = null;
        r stackIn_50_2 = null;
        int stackIn_50_3 = 0;
        Object stackIn_51_0 = null;
        r stackIn_51_1 = null;
        r stackIn_51_2 = null;
        int stackIn_51_3 = 0;
        Object stackIn_52_0 = null;
        r stackIn_52_1 = null;
        r stackIn_52_2 = null;
        int stackIn_52_3 = 0;
        int stackIn_52_4 = 0;
        Object stackIn_55_0 = null;
        Object stackIn_56_0 = null;
        Object stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        String stackIn_74_0 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_28_0 = null;
        Object stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        Object stackOut_34_0 = null;
        Object stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        Object stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_41_0 = 0;
        Object stackOut_48_0 = null;
        r stackOut_48_1 = null;
        r stackOut_48_2 = null;
        int stackOut_48_3 = 0;
        Object stackOut_49_0 = null;
        r stackOut_49_1 = null;
        r stackOut_49_2 = null;
        int stackOut_49_3 = 0;
        Object stackOut_51_0 = null;
        r stackOut_51_1 = null;
        r stackOut_51_2 = null;
        int stackOut_51_3 = 0;
        int stackOut_51_4 = 0;
        Object stackOut_50_0 = null;
        r stackOut_50_1 = null;
        r stackOut_50_2 = null;
        int stackOut_50_3 = 0;
        int stackOut_50_4 = 0;
        Object stackOut_54_0 = null;
        Object stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        Object stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        String stackOut_73_0 = null;
        String stackOut_72_0 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        try {
          L0: {
            L1: {
              ((lb) this).field_fb = ud.a(0, vh.field_a);
              if (((lb) this).field_fb.length <= 0) {
                break L1;
              } else {
                var2_int = 0;
                L2: while (true) {
                  if (var2_int >= ((lb) this).field_fb.length) {
                    var2_int = 0;
                    var3 = 0;
                    L3: while (true) {
                      if (((lb) this).field_fb.length <= var3) {
                        var3_ref_re__ = ((lb) this).field_fb;
                        ((lb) this).field_fb = new re[var2_int];
                        var4 = 0;
                        var5 = 0;
                        L4: while (true) {
                          if (var3_ref_re__.length <= var5) {
                            wc.a(((lb) this).field_fb, 0);
                            break L1;
                          } else {
                            L5: {
                              if (var3_ref_re__[var5] == null) {
                                break L5;
                              } else {
                                int incrementValue$1 = var4;
                                var4++;
                                ((lb) this).field_fb[incrementValue$1] = var3_ref_re__[var5];
                                break L5;
                              }
                            }
                            var5++;
                            continue L4;
                          }
                        }
                      } else {
                        L6: {
                          if (((lb) this).field_fb[var3] == null) {
                            break L6;
                          } else {
                            var2_int++;
                            break L6;
                          }
                        }
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    L7: {
                      if (((lb) this).field_fb[var2_int] == null) {
                        break L7;
                      } else {
                        var3 = 1 + var2_int;
                        L8: while (true) {
                          if (((lb) this).field_fb.length <= var3) {
                            if (null == rn.field_b) {
                              break L7;
                            } else {
                              if (((lb) this).field_fb[var2_int] == null) {
                                break L7;
                              } else {
                                if (rn.field_b.c(((lb) this).field_fb[var2_int].field_d, ((lb) this).field_fb[var2_int].field_a, 79)) {
                                  break L7;
                                } else {
                                  ((lb) this).field_fb[var2_int] = null;
                                  break L7;
                                }
                              }
                            }
                          } else {
                            L9: {
                              if (null == ((lb) this).field_fb[var3]) {
                                break L9;
                              } else {
                                if (((lb) this).field_fb[var2_int].field_a != ((lb) this).field_fb[var3].field_a) {
                                  break L9;
                                } else {
                                  if (((lb) this).field_fb[var3].field_d != ((lb) this).field_fb[var2_int].field_d) {
                                    break L9;
                                  } else {
                                    ((lb) this).field_fb[var3] = null;
                                    break L9;
                                  }
                                }
                              }
                            }
                            var3++;
                            continue L8;
                          }
                        }
                      }
                    }
                    var2_int++;
                    continue L2;
                  }
                }
              }
            }
            L10: {
              stackOut_28_0 = this;
              stackIn_30_0 = stackOut_28_0;
              stackIn_29_0 = stackOut_28_0;
              if (0 >= ((lb) this).field_fb.length) {
                stackOut_30_0 = this;
                stackOut_30_1 = 0;
                stackIn_31_0 = stackOut_30_0;
                stackIn_31_1 = stackOut_30_1;
                break L10;
              } else {
                stackOut_29_0 = this;
                stackOut_29_1 = 1;
                stackIn_31_0 = stackOut_29_0;
                stackIn_31_1 = stackOut_29_1;
                break L10;
              }
            }
            L11: {
              ((lb) this).field_cb = stackIn_31_1 != 0;
              if (!lm.f((byte) 126)) {
                stackOut_33_0 = 0;
                stackIn_34_0 = stackOut_33_0;
                break L11;
              } else {
                stackOut_32_0 = 1;
                stackIn_34_0 = stackOut_32_0;
                break L11;
              }
            }
            L12: {
              var2_int = stackIn_34_0;
              stackOut_34_0 = this;
              stackIn_36_0 = stackOut_34_0;
              stackIn_35_0 = stackOut_34_0;
              if (po.w(13296)) {
                stackOut_36_0 = this;
                stackOut_36_1 = 0;
                stackIn_37_0 = stackOut_36_0;
                stackIn_37_1 = stackOut_36_1;
                break L12;
              } else {
                stackOut_35_0 = this;
                stackOut_35_1 = 1;
                stackIn_37_0 = stackOut_35_0;
                stackIn_37_1 = stackOut_35_1;
                break L12;
              }
            }
            L13: {
              ((lb) this).field_ab = stackIn_37_1 != 0;
              if (var2_int == 0) {
                stackOut_39_0 = 2;
                stackIn_40_0 = stackOut_39_0;
                break L13;
              } else {
                stackOut_38_0 = 3;
                stackIn_40_0 = stackOut_38_0;
                break L13;
              }
            }
            L14: {
              var3 = stackIn_40_0;
              if (var2_int == 0) {
                if (null != rn.field_b) {
                  if (rn.field_b.b(0)) {
                    stackOut_46_0 = 1;
                    stackIn_48_0 = stackOut_46_0;
                    break L14;
                  } else {
                    stackOut_45_0 = 0;
                    stackIn_48_0 = stackOut_45_0;
                    break L14;
                  }
                } else {
                  stackOut_43_0 = 0;
                  stackIn_48_0 = stackOut_43_0;
                  break L14;
                }
              } else {
                stackOut_41_0 = 0;
                stackIn_48_0 = stackOut_41_0;
                break L14;
              }
            }
            L15: {
              L16: {
                var4 = stackIn_48_0;
                stackOut_48_0 = this;
                stackOut_48_1 = null;
                stackOut_48_2 = null;
                stackOut_48_3 = 10;
                stackIn_50_0 = stackOut_48_0;
                stackIn_50_1 = stackOut_48_1;
                stackIn_50_2 = stackOut_48_2;
                stackIn_50_3 = stackOut_48_3;
                stackIn_49_0 = stackOut_48_0;
                stackIn_49_1 = stackOut_48_1;
                stackIn_49_2 = stackOut_48_2;
                stackIn_49_3 = stackOut_48_3;
                if (var2_int != 0) {
                  break L16;
                } else {
                  stackOut_49_0 = this;
                  stackOut_49_1 = null;
                  stackOut_49_2 = null;
                  stackOut_49_3 = stackIn_49_3;
                  stackIn_51_0 = stackOut_49_0;
                  stackIn_51_1 = stackOut_49_1;
                  stackIn_51_2 = stackOut_49_2;
                  stackIn_51_3 = stackOut_49_3;
                  stackIn_50_0 = stackOut_49_0;
                  stackIn_50_1 = stackOut_49_1;
                  stackIn_50_2 = stackOut_49_2;
                  stackIn_50_3 = stackOut_49_3;
                  if (var4 == 0) {
                    stackOut_51_0 = this;
                    stackOut_51_1 = null;
                    stackOut_51_2 = null;
                    stackOut_51_3 = stackIn_51_3;
                    stackOut_51_4 = 75;
                    stackIn_52_0 = stackOut_51_0;
                    stackIn_52_1 = stackOut_51_1;
                    stackIn_52_2 = stackOut_51_2;
                    stackIn_52_3 = stackOut_51_3;
                    stackIn_52_4 = stackOut_51_4;
                    break L15;
                  } else {
                    break L16;
                  }
                }
              }
              stackOut_50_0 = this;
              stackOut_50_1 = null;
              stackOut_50_2 = null;
              stackOut_50_3 = stackIn_50_3;
              stackOut_50_4 = 58;
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              stackIn_52_3 = stackOut_50_3;
              stackIn_52_4 = stackOut_50_4;
              break L15;
            }
            L17: {
              ((lb) this).field_T = new r(stackIn_52_3, stackIn_52_4, 410, 105, (io) null, var3, 1);
              ((lb) this).field_T.field_M = 83;
              ((lb) this).field_T.a((byte) 106, 5, 5);
              ((lb) this).a((ga) (Object) ((lb) this).field_T, 10);
              ((lb) this).field_bb = this.a(vd.field_a, ti.field_e, (byte) 32, (sk) this);
              if (var2_int == 0) {
                break L17;
              } else {
                ((lb) this).field_W = this.a(ma.field_n, li.field_h, (byte) 32, (sk) this);
                break L17;
              }
            }
            L18: {
              ((lb) this).field_V = this.a(j.field_j, af.field_c, (byte) 32, (sk) this);
              stackOut_54_0 = this;
              stackIn_56_0 = stackOut_54_0;
              stackIn_55_0 = stackOut_54_0;
              if (var2_int != 0) {
                stackOut_56_0 = this;
                stackOut_56_1 = 3;
                stackIn_57_0 = stackOut_56_0;
                stackIn_57_1 = stackOut_56_1;
                break L18;
              } else {
                stackOut_55_0 = this;
                stackOut_55_1 = 2;
                stackIn_57_0 = stackOut_55_0;
                stackIn_57_1 = stackOut_55_1;
                break L18;
              }
            }
            L19: {
              ((lb) this).field_U = new an[stackIn_57_1];
              ((lb) this).field_U[1] = ((lb) this).field_V;
              ((lb) this).field_U[0] = ((lb) this).field_bb;
              if (var2_int == 0) {
                break L19;
              } else {
                ((lb) this).field_U[2] = ((lb) this).field_W;
                break L19;
              }
            }
            L20: {
              if (!((lb) this).field_cb) {
                break L20;
              } else {
                if (var2_int == 0) {
                  break L20;
                } else {
                  var5_ref_String__ = new String[((lb) this).field_fb.length];
                  var6_int = -1 + var5_ref_String__.length;
                  var7_int = 0;
                  L21: while (true) {
                    if (var7_int >= ((lb) this).field_fb.length) {
                      ((lb) this).field_hb = new nh((Object[]) (Object) var5_ref_String__, var6_int, 150);
                      ((lb) this).field_hb.a(-87, -19 + (((lb) this).field_V.field_j + (((lb) this).field_T.field_j - -((lb) this).field_V.field_n)), ((lb) this).field_V.field_k + ((lb) this).field_T.field_k, 126, 18);
                      ((lb) this).field_x.a((le) (Object) ((lb) this).field_hb, -123);
                      break L20;
                    } else {
                      L22: {
                        var8 = ((lb) this).field_fb[var7_int];
                        if (cn.field_b == null) {
                          break L22;
                        } else {
                          if (rn.field_b.field_t != var8.field_a) {
                            break L22;
                          } else {
                            if (rn.field_b.field_i != var8.field_d) {
                              break L22;
                            } else {
                              var6_int = var7_int;
                              break L22;
                            }
                          }
                        }
                      }
                      var5_ref_String__[var7_int] = var8.field_a + "<times>" + var8.field_d;
                      var7_int++;
                      continue L21;
                    }
                  }
                }
              }
            }
            L23: {
              L24: {
                ((lb) this).field_X = this.a((byte) -101, lk.field_j, (sk) this);
                var5 = ((lb) this).field_X.field_i / 2 + ((lb) this).field_X.field_k;
                ((lb) this).field_X.field_i = 150;
                ((lb) this).field_X.field_k = -20 + (var5 + -((lb) this).field_X.field_i);
                ((lb) this).field_gb = this.a((byte) -80, bd.field_h, (sk) this);
                ((lb) this).field_gb.field_k = var5 + 20;
                ((lb) this).field_gb.field_i = ((lb) this).field_X.field_i;
                ((lb) this).field_gb.field_C = false;
                if (var2_int != 0) {
                  break L24;
                } else {
                  if (var4 == 0) {
                    break L23;
                  } else {
                    break L24;
                  }
                }
              }
              L25: {
                if (var2_int != 0) {
                  stackOut_73_0 = el.field_h;
                  stackIn_74_0 = stackOut_73_0;
                  break L25;
                } else {
                  stackOut_72_0 = qp.field_a;
                  stackIn_74_0 = stackOut_72_0;
                  break L25;
                }
              }
              var10 = stackIn_74_0;
              var6_ref = var10;
              var7 = new ga(var10, (sk) null);
              var7.field_i = ((lb) this).field_i;
              var7.field_j = 163;
              var7.field_k = 0;
              var7.field_n = 80;
              var7.field_h = (io) (Object) new vf(ia.field_e, 20, 20, 0, 10, 16777215, -1, 0, 0, 16, 0, 0, true);
              ((lb) this).a(var7, 10);
              break L23;
            }
            L26: {
              ((lb) this).field_Z = false;
              var6 = this.o(16);
              if (var6 == null) {
                break L26;
              } else {
                var6.field_x = true;
                break L26;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L27: {
            var2 = decompiledCaughtException;
            stackOut_78_0 = (RuntimeException) var2;
            stackOut_78_1 = new StringBuilder().append("lb.<init>(");
            stackIn_80_0 = stackOut_78_0;
            stackIn_80_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param0 == null) {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L27;
            } else {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "{...}";
              stackIn_81_0 = stackOut_79_0;
              stackIn_81_1 = stackOut_79_1;
              stackIn_81_2 = stackOut_79_2;
              break L27;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_81_0, stackIn_81_2 + ')');
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
