/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
            return this.field_V;
        }
        if (param0 != 16) {
            this.field_cb = true;
        }
        if (null != rn.field_b && rn.field_b.field_c) {
            if (!(null == this.field_W)) {
                return this.field_W;
            }
        }
        return this.field_bb;
    }

    private final an a(byte param0, String param1, sk param2) {
        an var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        an stackIn_2_0 = null;
        an stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = new an(param1, param2);
            var4.field_h = (io) ((Object) new vm());
            var5 = this.field_n + -46;
            if (param0 < -38) {
              var4.a(-71, var5, 15, this.field_i - 30, 30);
              this.a((ga) (var4), 10);
              stackIn_4_0 = (an) (var4);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (an) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4_ref);

            stackIn_7_1 = new StringBuilder().append("lb.JA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void h(byte param0) {
        if (param0 > -63) {
            lb.m(9);
        }
        field_db = null;
        field_eb = null;
    }

    public final void a(int param0, int param1, an param2, int param3, int param4) {
        int stackIn_15_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        var7 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              if (param1 == -6) {
                break L1;
              } else {
                this.field_fb = (re[]) null;
                break L1;
              }
            }
            L2: {
              if (this.field_X == param2) {
                this.i((byte) -92);
                break L2;
              } else {
                if (param2 == this.field_gb) {
                  this.g((byte) -67);
                  break L2;
                } else {
                  if (param2 != this.field_bb) {
                    if (param2 != this.field_W) {
                      L3: {
                        if (null != this.field_hb) {
                          if (this.field_hb.field_l) {
                            stackIn_15_0 = 1;
                            break L3;
                          } else {
                            stackIn_15_0 = 0;
                            break L3;
                          }
                        } else {
                          stackIn_15_0 = 0;
                          break L3;
                        }
                      }
                      var6_int = stackIn_15_0;
                      if (var6_int != 0) {
                        break L2;
                      } else {
                        if (param2 != this.field_V) {
                          break L2;
                        } else {
                          if (this.field_cb) {
                            if ((be.field_j ^ -1) < -1) {
                              this.a(param2, -115);
                              break L2;
                            } else {
                              this.field_F.a(new kf(this.field_F), true);
                              break L2;
                            }
                          } else {
                            this.field_F.a(new i(this.field_F, kb.field_f), true);
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
            stackIn_28_0 = (RuntimeException) (var6);

            stackIn_28_1 = new StringBuilder().append("lb.K(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L4;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L4;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void g(byte param0) {
        int var2;
        int var3;
        an var4;
        L0: {
          var3 = ZombieDawn.field_J;
          if (this.field_bb == this.field_ib) {
            re.a((byte) -71);
            we.w(-55);
            break L0;
          } else {
            if (this.field_ib != this.field_W) {
              if (this.field_ib != this.field_V) {
                break L0;
              } else {
                L1: {
                  if (this.field_hb == null) {
                    break L1;
                  } else {
                    var2 = this.field_hb.h(0);
                    if (0 <= var2) {
                      rn.field_b.a(this.field_fb[var2].field_d, this.field_fb[var2].field_a, 124);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
                cn.a(true, false);
                this.field_F.a(new nj(this.field_F), true);
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
          this.field_gb.field_C = false;
          if (param0 <= -46) {
            break L2;
          } else {
            var4 = (an) null;
            this.a((an) null, -96);
            break L2;
          }
        }
    }

    private final void a(an param0, int param1) {
        an var3 = null;
        int var4 = 0;
        int var5 = 0;
        re var6 = null;
        an stackIn_2_0 = null;
        an stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              this.field_ib = param0;
              var4 = -49 / ((param1 - -40) / 47);
              param0.a((byte) 68, (ga) (this));
              var3 = this.o(16);
              stackIn_2_0 = this.field_gb;

              if (var3 == param0) {
                stackIn_3_0 = (an) ((Object) stackIn_2_0);
                stackIn_3_1 = 0;
                break L1;
              } else {
                stackIn_3_0 = (an) ((Object) stackIn_2_0);
                stackIn_3_1 = 1;
                break L1;
              }
            }
            L2: {
              stackIn_3_0.field_C = stackIn_3_1 != 0;
              if (this.field_V == param0) {
                if (var3 == param0) {
                  if (null != this.field_hb) {
                    L3: {
                      var5 = this.field_hb.h(0);
                      var6 = this.field_fb[var5];
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
                    this.field_gb.field_C = true;
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
            stackIn_18_0 = (RuntimeException) (var3_ref);

            stackIn_18_1 = new StringBuilder().append("lb.L(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
    }

    final void a(ga param0, byte param1, int param2, int param3) {
        int stackIn_15_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        an[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        int var6 = 0;
        an var7 = null;
        int var8 = 0;
        an[] var9 = null;
        var8 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              super.a(param0, (byte) 88, param2, param3);
              if (ll.field_a) {
                param0.c((byte) 57);
                var9 = this.field_U;
                var5 = var9;
                var6 = 0;
                L2: while (true) {
                  if (var6 >= var9.length) {
                    break L1;
                  } else {
                    L3: {
                      var7 = var9[var6];
                      if (!var7.field_l) {
                        break L3;
                      } else {
                        var7.a((byte) 126, (ga) (this));
                        break L3;
                      }
                    }
                    var6++;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L4: {
              if (this.field_ab) {
                break L4;
              } else {
                if (po.w(13296)) {
                  break L4;
                } else {
                  this.i((byte) -117);
                  this.field_F.a(new lb(this.field_F), true);
                  break L4;
                }
              }
            }
            L5: {
              if (null == this.field_hb) {
                break L5;
              } else {
                L6: {
                  if (this.field_hb.e((byte) -43)) {
                    stackIn_15_0 = 0;
                    break L6;
                  } else {
                    stackIn_15_0 = 1;
                    break L6;
                  }
                }
                if (stackIn_15_0 == (this.field_Z ? 1 : 0)) {
                  this.a(this.field_V, 115);
                  this.field_Z = this.field_hb.e((byte) -24);
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            var5_int = -47 % ((param1 - 46) / 42);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5_ref = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var5_ref);

            stackIn_22_1 = new StringBuilder().append("lb.D(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, int param1, ga param2, char param3) {
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
        Object stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        Object stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              var5 = null;
              if (this.field_bb.e(-17741)) {
                var5 = this.field_bb;
                break L1;
              } else {
                L2: {
                  if (this.field_W == null) {
                    break L2;
                  } else {
                    if (!this.field_W.e(-17741)) {
                      break L2;
                    } else {
                      var5 = this.field_W;
                      break L1;
                    }
                  }
                }
                if (this.field_V.e(-17741)) {
                  var5 = this.field_V;
                  break L1;
                } else {
                  if (this.field_X.e(-17741)) {
                    var5 = this.field_X;
                    break L1;
                  } else {
                    if (this.field_gb.e(-17741)) {
                      var5 = this.field_gb;
                      break L1;
                    } else {
                      if (!this.field_bb.field_x) {
                        L3: {
                          if (null == this.field_W) {
                            break L3;
                          } else {
                            if (!this.field_W.field_x) {
                              break L3;
                            } else {
                              var5 = this.field_W;
                              break L1;
                            }
                          }
                        }
                        if (!this.field_V.field_x) {
                          break L1;
                        } else {
                          var5 = this.field_V;
                          break L1;
                        }
                      } else {
                        var5 = this.field_bb;
                        break L1;
                      }
                    }
                  }
                }
              }
            }
            L4: {
              var6 = param1;
              if (-97 != (var6 ^ -1)) {
                if (var6 == 97) {
                  if (var5 == this.field_bb) {
                    L5: {
                      if (null != this.field_W) {
                        this.field_W.a((byte) 110, (ga) (this));
                        break L5;
                      } else {
                        this.field_V.a((byte) 111, (ga) (this));
                        break L5;
                      }
                    }
                    stackIn_44_0 = 1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (var5 == this.field_W) {
                      this.field_V.a((byte) 85, (ga) (this));
                      stackIn_48_0 = 1;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if (var5 != this.field_X) {
                        break L4;
                      } else {
                        if (!this.field_gb.field_C) {
                          break L4;
                        } else {
                          this.field_gb.a((byte) 74, (ga) (this));
                          stackIn_52_0 = 1;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        }
                      }
                    }
                  }
                } else {
                  if ((var6 ^ -1) != -99) {
                    if (99 != var6) {
                      break L4;
                    } else {
                      L6: {
                        if (var5 == this.field_bb) {
                          break L6;
                        } else {
                          if (var5 != this.field_W) {
                            if (var5 != this.field_V) {
                              break L4;
                            } else {
                              L7: {
                                if (!this.field_gb.field_C) {
                                  this.field_X.a((byte) 68, (ga) (this));
                                  break L7;
                                } else {
                                  this.field_gb.a((byte) 92, (ga) (this));
                                  break L7;
                                }
                              }
                              stackIn_71_0 = 1;
                              decompiledRegionSelector0 = 9;
                              break L0;
                            }
                          } else {
                            break L6;
                          }
                        }
                      }
                      this.field_X.a((byte) 116, (ga) (this));
                      stackIn_65_0 = 1;
                      decompiledRegionSelector0 = 8;
                      break L0;
                    }
                  } else {
                    if (var5 == this.field_X) {
                      this.field_bb.a((byte) 89, (ga) (this));
                      stackIn_56_0 = 1;
                      decompiledRegionSelector0 = 6;
                      break L0;
                    } else {
                      if (this.field_gb == var5) {
                        this.field_V.a((byte) 102, (ga) (this));
                        stackIn_60_0 = 1;
                        decompiledRegionSelector0 = 7;
                        break L0;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              } else {
                if (var5 != this.field_V) {
                  if (var5 == this.field_W) {
                    this.field_bb.a((byte) 125, (ga) (this));
                    stackIn_34_0 = 1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if (var5 != this.field_gb) {
                      break L4;
                    } else {
                      this.field_X.a((byte) 74, (ga) (this));
                      stackIn_37_0 = 1;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                } else {
                  if (null == this.field_W) {
                    this.field_bb.a((byte) 84, (ga) (this));
                    stackIn_30_0 = 1;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    this.field_W.a((byte) 125, (ga) (this));
                    return true;
                  }
                }
              }
            }
            var6 = -79 / ((param0 - -83) / 32);
            stackIn_73_0 = super.a(-118, param1, param2, param3);
            decompiledRegionSelector0 = 10;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackIn_76_0 = var5;

            stackIn_76_1 = new StringBuilder().append("lb.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_77_0 = stackIn_76_0;
              stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackIn_77_2 = "null";
              break L8;
            } else {
              stackIn_77_0 = stackIn_76_0;
              stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackIn_77_2 = "{...}";
              break L8;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_77_0), stackIn_77_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_30_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_34_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_37_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_44_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_48_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_52_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_56_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_60_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_65_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_71_0 != 0;
                          } else {
                            return stackIn_73_0;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final void n(int param0) {
        int var3 = 0;
        an var4 = null;
        int var5 = ZombieDawn.field_J;
        if (param0 != -18681) {
            return;
        }
        an[] var6 = this.field_U;
        an[] var2 = var6;
        for (var3 = 0; var6.length > var3; var3++) {
            var4 = var6[var3];
            var4.field_x = var4 == this.field_ib ? true : false;
        }
    }

    final static boolean m(int param0) {
        int stackIn_6_0 = 0;
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
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    private final an a(String param0, v[] param1, byte param2, sk param3) {
        an var5 = null;
        RuntimeException var5_ref = null;
        r var6 = null;
        an var7 = null;
        an stackIn_2_0 = null;
        an stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = new an(param0, param3);
            var5.field_h = (io) ((Object) new k(param1));
            if (param2 == 32) {
              var6 = this.field_T;
              var7 = var5;
              var6.a(0, var7, var6.field_M);
              this.field_T.a(true);
              stackIn_4_0 = (an) (var5);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (an) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5_ref);

            stackIn_7_1 = new StringBuilder().append("lb.J(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    lb(dn param0) {
        super(param0, 430, 254);
        int incrementValue$0 = 0;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int stackIn_34_0 = 0;
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_48_0 = 0;
        Object stackIn_50_0;
        r stackIn_50_1;
        r stackIn_50_2;
        int stackIn_50_3;
        Object stackIn_51_0;
        Object stackIn_52_0 = null;
        r stackIn_52_1 = null;
        r stackIn_52_2 = null;
        int stackIn_52_3 = 0;
        int stackIn_52_4 = 0;
        Object stackIn_56_0 = null;
        Object stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        String stackIn_74_0 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        re[] var3_ref_re__ = null;
        int var4 = 0;
        int var5 = 0;
        String[] var5_ref_String__ = null;
        int var6_int = 0;
        String var6 = null;
        an var6_ref = null;
        int var7_int = 0;
        ga var7 = null;
        re var8 = null;
        String var10 = null;
        try {
          L0: {
            L1: {
              this.field_fb = ud.a(0, vh.field_a);
              if ((this.field_fb.length ^ -1) >= -1) {
                break L1;
              } else {
                var2_int = 0;
                L2: while (true) {
                  if (var2_int >= this.field_fb.length) {
                    var2_int = 0;
                    var3 = 0;
                    L3: while (true) {
                      if (this.field_fb.length <= var3) {
                        var3_ref_re__ = this.field_fb;
                        this.field_fb = new re[var2_int];
                        var4 = 0;
                        var5 = 0;
                        L4: while (true) {
                          if (var3_ref_re__.length <= var5) {
                            wc.a(this.field_fb, 0);
                            break L1;
                          } else {
                            L5: {
                              if (var3_ref_re__[var5] == null) {
                                break L5;
                              } else {
                                incrementValue$0 = var4;
                                var4++;
                                this.field_fb[incrementValue$0] = var3_ref_re__[var5];
                                break L5;
                              }
                            }
                            var5++;
                            continue L4;
                          }
                        }
                      } else {
                        L6: {
                          if (this.field_fb[var3] == null) {
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
                      if (this.field_fb[var2_int] == null) {
                        break L7;
                      } else {
                        var3 = 1 + var2_int;
                        L8: while (true) {
                          if (this.field_fb.length <= var3) {
                            if (null == rn.field_b) {
                              break L7;
                            } else {
                              if (this.field_fb[var2_int] == null) {
                                break L7;
                              } else {
                                if (rn.field_b.c(this.field_fb[var2_int].field_d, this.field_fb[var2_int].field_a, 79)) {
                                  break L7;
                                } else {
                                  this.field_fb[var2_int] = null;
                                  break L7;
                                }
                              }
                            }
                          } else {
                            L9: {
                              if (null == this.field_fb[var3]) {
                                break L9;
                              } else {
                                if (this.field_fb[var2_int].field_a != this.field_fb[var3].field_a) {
                                  break L9;
                                } else {
                                  if (this.field_fb[var3].field_d != this.field_fb[var2_int].field_d) {
                                    break L9;
                                  } else {
                                    this.field_fb[var3] = null;
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
              stackIn_30_0 = this;

              if (0 >= this.field_fb.length) {
                stackIn_31_0 = this;
                stackIn_31_1 = 0;
                break L10;
              } else {
                stackIn_31_0 = this;
                stackIn_31_1 = 1;
                break L10;
              }
            }
            L11: {
              ((lb) (this)).field_cb = stackIn_31_1 != 0;
              if (!lm.f((byte) 126)) {
                stackIn_34_0 = 0;
                break L11;
              } else {
                stackIn_34_0 = 1;
                break L11;
              }
            }
            L12: {
              var2_int = stackIn_34_0;
              stackIn_36_0 = this;

              if (po.w(13296)) {
                stackIn_37_0 = this;
                stackIn_37_1 = 0;
                break L12;
              } else {
                stackIn_37_0 = this;
                stackIn_37_1 = 1;
                break L12;
              }
            }
            L13: {
              ((lb) (this)).field_ab = stackIn_37_1 != 0;
              if (var2_int == 0) {
                stackIn_40_0 = 2;
                break L13;
              } else {
                stackIn_40_0 = 3;
                break L13;
              }
            }
            L14: {
              var3 = stackIn_40_0;
              if (var2_int == 0) {
                if (null != rn.field_b) {
                  if (rn.field_b.b(0)) {
                    stackIn_48_0 = 1;
                    break L14;
                  } else {
                    stackIn_48_0 = 0;
                    break L14;
                  }
                } else {
                  stackIn_48_0 = 0;
                  break L14;
                }
              } else {
                stackIn_48_0 = 0;
                break L14;
              }
            }
            L15: {
              L16: {
                var4 = stackIn_48_0;
                stackIn_50_0 = this;

                stackIn_50_1 = null;

                stackIn_50_2 = null;

                stackIn_50_3 = 10;

                if (var2_int != 0) {
                  break L16;
                } else {
                  stackIn_51_0 = this;
                  stackIn_50_0 = stackIn_51_0;

                  if (var4 == 0) {
                    stackIn_52_0 = this;
                    stackIn_52_1 = null;
                    stackIn_52_2 = null;
                    stackIn_52_3 = stackIn_50_3;
                    stackIn_52_4 = 75;
                    break L15;
                  } else {
                    break L16;
                  }
                }
              }
              stackIn_52_0 = this;
              stackIn_52_1 = null;
              stackIn_52_2 = null;
              stackIn_52_3 = stackIn_50_3;
              stackIn_52_4 = 58;
              break L15;
            }
            L17: {
              ((lb) (this)).field_T = new r(stackIn_52_3, stackIn_52_4, 410, 105, (io) null, var3, 1);
              this.field_T.field_M = 83;
              this.field_T.a((byte) 106, 5, 5);
              this.a(this.field_T, 10);
              this.field_bb = this.a(vd.field_a, ti.field_e, (byte) 32, (sk) (this));
              if (var2_int == 0) {
                break L17;
              } else {
                this.field_W = this.a(ma.field_n, li.field_h, (byte) 32, (sk) (this));
                break L17;
              }
            }
            L18: {
              this.field_V = this.a(j.field_j, af.field_c, (byte) 32, (sk) (this));
              stackIn_56_0 = this;

              if (var2_int != 0) {
                stackIn_57_0 = this;
                stackIn_57_1 = 3;
                break L18;
              } else {
                stackIn_57_0 = this;
                stackIn_57_1 = 2;
                break L18;
              }
            }
            L19: {
              ((lb) (this)).field_U = new an[stackIn_57_1];
              this.field_U[1] = this.field_V;
              this.field_U[0] = this.field_bb;
              if (var2_int == 0) {
                break L19;
              } else {
                this.field_U[2] = this.field_W;
                break L19;
              }
            }
            L20: {
              if (!this.field_cb) {
                break L20;
              } else {
                if (var2_int == 0) {
                  break L20;
                } else {
                  var5_ref_String__ = new String[this.field_fb.length];
                  var6_int = -1 + var5_ref_String__.length;
                  var7_int = 0;
                  L21: while (true) {
                    if (var7_int >= this.field_fb.length) {
                      this.field_hb = new nh(var5_ref_String__, var6_int, 150);
                      this.field_hb.a(-87, -19 + (this.field_V.field_j + (this.field_T.field_j - -this.field_V.field_n)), this.field_V.field_k + this.field_T.field_k, 126, 18);
                      this.field_x.a(this.field_hb, -123);
                      break L20;
                    } else {
                      L22: {
                        var8 = this.field_fb[var7_int];
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
                this.field_X = this.a((byte) -101, lk.field_j, (sk) (this));
                var5 = this.field_X.field_i / 2 + this.field_X.field_k;
                this.field_X.field_i = 150;
                this.field_X.field_k = -20 + (var5 + -this.field_X.field_i);
                this.field_gb = this.a((byte) -80, bd.field_h, (sk) (this));
                this.field_gb.field_k = var5 + 20;
                this.field_gb.field_i = this.field_X.field_i;
                this.field_gb.field_C = false;
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
                  stackIn_74_0 = el.field_h;
                  break L25;
                } else {
                  stackIn_74_0 = qp.field_a;
                  break L25;
                }
              }
              var10 = stackIn_74_0;
              var6 = var10;
              var7 = new ga(var10, (sk) null);
              var7.field_i = this.field_i;
              var7.field_j = 163;
              var7.field_k = 0;
              var7.field_n = 80;
              var7.field_h = (io) ((Object) new vf(ia.field_e, 20, 20, 0, 10, 16777215, -1, 0, 0, 16, 0, 0, true));
              this.a(var7, 10);
              break L23;
            }
            L26: {
              this.field_Z = false;
              var6_ref = this.o(16);
              if (var6_ref == null) {
                break L26;
              } else {
                var6_ref.field_x = true;
                break L26;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L27: {
            var2 = decompiledCaughtException;
            stackIn_80_0 = (RuntimeException) (var2);

            stackIn_80_1 = new StringBuilder().append("lb.<init>(");

            if (param0 == null) {
              stackIn_81_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackIn_81_2 = "null";
              break L27;
            } else {
              stackIn_81_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackIn_81_2 = "{...}";
              break L27;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_81_0), stackIn_81_2 + ')');
        }
    }

    private final void i(byte param0) {
        if (!this.field_H) {
            return;
        }
        this.field_H = false;
        if (param0 > -87) {
            this.field_ib = (an) null;
        }
    }

    static {
        field_db = new int[8192];
    }
}
