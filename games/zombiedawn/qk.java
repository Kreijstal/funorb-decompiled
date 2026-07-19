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
            return (vn) null;
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
        RuntimeException var3 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            super.a((byte) -83, param1);
            if (param0 <= -76) {
              L1: {
                if (this.field_G != 1) {
                  break L1;
                } else {
                  if ((this.field_F ^ -1) != -11) {
                    break L1;
                  } else {
                    this.b(param1.a(this.a(true), (byte) -70), (byte) -114, param1.a(this.f(237239984), 0));
                    break L1;
                  }
                }
              }
              L2: {
                if (!ng.field_e) {
                  break L2;
                } else {
                  if (-29 == (this.field_t ^ -1)) {
                    this.a(param1, 5060);
                    break L2;
                  } else {
                    if (-24 == (this.field_t ^ -1)) {
                      this.a(param1, 5060);
                      break L2;
                    } else {
                      if (18 != this.field_t) {
                        break L2;
                      } else {
                        this.a(param1, 5060);
                        break L2;
                      }
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3);
            stackOut_14_1 = new StringBuilder().append("qk.B(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void e(int param0, int param1) {
        if (-11 != (param0 ^ -1)) {
            if (param0 != 11) {
                if (null != this.field_yb) {
                    this.field_yb.field_hb = false;
                    this.field_yb = null;
                }
            }
        }
        super.e(param0, param1);
    }

    final static void n(byte param0) {
        va[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        va var3 = null;
        int var4 = 0;
        va[] var5 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ZombieDawn.field_J;
        try {
          L0: {
            if (param0 > 79) {
              var5 = pa.field_x;
              var1 = var5;
              var2 = 0;
              L1: while (true) {
                if (var2 >= var5.length) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var3 = var5[var2];
                  var3.a((byte) 126);
                  var2++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1_ref), "qk.G(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final boolean a(int param0, boolean param1, int param2) {
        fb var4 = null;
        kd var5 = null;
        int var6 = 0;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        Object stackOut_12_0 = null;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        L0: {
          var6 = ZombieDawn.field_J;
          this.field_mb = 2147483647;
          this.field_sb = null;
          this.field_fb = false;
          if (param0 == -19718) {
            break L0;
          } else {
            this.g(-115);
            break L0;
          }
        }
        var4 = this.a((byte) -74, param2, 2);
        L1: while (true) {
          if (var4 == null) {
            L2: {
              if (this.field_sb == null) {
                stackOut_19_0 = 0;
                stackIn_20_0 = stackOut_19_0;
                break L2;
              } else {
                stackOut_18_0 = 1;
                stackIn_20_0 = stackOut_18_0;
                break L2;
              }
            }
            return stackIn_20_0 != 0;
          } else {
            L3: {
              var5 = (kd) ((Object) var4);
              if (var5.field_hb) {
                break L3;
              } else {
                if (var5.field_F == 9) {
                  break L3;
                } else {
                  if (!var5.x(param0 ^ -19794)) {
                    break L3;
                  } else {
                    L4: {
                      if (param1) {
                        break L4;
                      } else {
                        if (!this.a(57, var4)) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (this.field_mb <= this.field_s) {
                        break L5;
                      } else {
                        this.field_sb = var4;
                        this.field_mb = this.field_s;
                        break L5;
                      }
                    }
                    L6: {
                      stackOut_12_0 = this;
                      stackIn_14_0 = stackOut_12_0;
                      stackIn_13_0 = stackOut_12_0;
                      if (var5.field_bb <= 0) {
                        stackOut_14_0 = this;
                        stackOut_14_1 = 0;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        break L6;
                      } else {
                        stackOut_13_0 = this;
                        stackOut_13_1 = 1;
                        stackIn_15_0 = stackOut_13_0;
                        stackIn_15_1 = stackOut_13_1;
                        break L6;
                      }
                    }
                    ((qk) (this)).field_fb = stackIn_15_1 != 0;
                    break L3;
                  }
                }
              }
            }
            var4 = this.e((byte) 32);
            continue L1;
          }
        }
    }

    void l(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        wk var5 = null;
        L0: {
          var4 = ZombieDawn.field_J;
          if (this.field_F == 0) {
            break L0;
          } else {
            if ((this.field_F ^ -1) == -4) {
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
            var5 = (wk) null;
            this.a((wk) null, 14);
            break L1;
          }
        }
        L2: {
          L3: {
            L4: {
              var2 = this.field_Eb;
              var3 = this.field_Eb / 2;
              if ((this.field_t ^ -1) == -29) {
                break L4;
              } else {
                if (this.a(-68, var2, false)) {
                  break L3;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              if (-29 != (this.field_t ^ -1)) {
                break L5;
              } else {
                if (this.a(-19718, false, var2)) {
                  break L3;
                } else {
                  break L5;
                }
              }
            }
            if (this.field_F != 3) {
              break L2;
            } else {
              this.e(0, param0 ^ -6852);
              break L2;
            }
          }
          L6: {
            if (this.field_fb) {
              break L6;
            } else {
              if (0 >= this.field_Ab) {
                break L6;
              } else {
                if (this.field_mb >= var3 * var3) {
                  if (this.field_Bb) {
                    if (this.p(param0 ^ -79)) {
                      if (this.field_F != 3) {
                        break L2;
                      } else {
                        this.e(0, -6904);
                        break L2;
                      }
                    } else {
                      this.m((byte) -116);
                      break L2;
                    }
                  } else {
                    this.m((byte) -116);
                    break L2;
                  }
                } else {
                  if (!this.field_Bb) {
                    if (this.p(param0 ^ -79)) {
                      if (-4 != (this.field_F ^ -1)) {
                        break L2;
                      } else {
                        this.e(0, -6904);
                        break L2;
                      }
                    } else {
                      this.m((byte) -90);
                      break L2;
                    }
                  } else {
                    this.m((byte) -90);
                    break L2;
                  }
                }
              }
            }
          }
          if (this.p(-120)) {
            break L2;
          } else {
            this.e(3, -6904);
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
            this.field_yb = null;
            this.field_zb = -1;
            this.field_wb = false;
            this.field_Eb = 250;
            this.field_Gb = 0;
            if (-12 == (this.field_t ^ -1)) {
              break L2;
            } else {
              if (-13 != (this.field_t ^ -1)) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          this.field_D = 143360;
          this.field_Ib = 8;
          this.field_Ab = 6;
          this.field_Bb = true;
          this.field_Fb = 3;
          break L1;
        }
        L3: {
          L4: {
            if ((this.field_t ^ -1) == -14) {
              break L4;
            } else {
              if ((this.field_t ^ -1) != -15) {
                break L3;
              } else {
                break L4;
              }
            }
          }
          this.field_Ab = 12;
          this.field_Ib = 8;
          this.field_D = 143360;
          this.field_Bb = true;
          this.field_Fb = 2;
          break L3;
        }
        L5: {
          L6: {
            if (this.field_t == 15) {
              break L6;
            } else {
              if (-24 != (this.field_t ^ -1)) {
                break L5;
              } else {
                break L6;
              }
            }
          }
          this.field_Ib = 8;
          this.field_D = 200704;
          this.field_Bb = false;
          this.field_Ab = 24;
          this.field_Fb = 2;
          break L5;
        }
        L7: {
          if (this.field_t != 16) {
            break L7;
          } else {
            this.field_D = 200704;
            this.field_Ib = 6;
            this.field_Fb = 2;
            this.field_Ab = 2147483647;
            this.field_Bb = false;
            break L7;
          }
        }
        L8: {
          if ((this.field_t ^ -1) != -20) {
            break L8;
          } else {
            this.field_Ab = 2147483647;
            this.field_Bb = false;
            this.field_D = 143360;
            this.field_Fb = 5;
            this.field_Ib = 0;
            break L8;
          }
        }
        L9: {
          if (28 != this.field_t) {
            break L9;
          } else {
            this.field_Bb = false;
            this.field_Eb = 330;
            this.field_D = 143360;
            this.field_Ib = 6;
            this.field_Fb = 1;
            this.field_Ab = 2147483647;
            break L9;
          }
        }
        L10: {
          if (this.field_t != 20) {
            break L10;
          } else {
            this.field_Ab = 2147483647;
            this.field_Ib = 0;
            this.field_D = 0;
            this.field_Bb = false;
            this.field_Fb = 5;
            break L10;
          }
        }
        L11: {
          if (27 != this.field_t) {
            break L11;
          } else {
            this.field_Ab = 2147483647;
            this.field_Bb = false;
            this.field_Ib = 0;
            this.field_Fb = 5;
            this.field_D = 0;
            break L11;
          }
        }
    }

    void a(wk param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 5060) {
                break L1;
              } else {
                this.field_Fb = -109;
                break L1;
              }
            }
            L2: {
              bi.d(param0.a(this.a(true), (byte) -98), param0.a(this.f(237239984), 0), this.field_Eb, 16711680);
              var3 = Integer.toString(this.field_Ab);
              if ((this.field_Ab ^ -1) < -101) {
                var3 = "oo";
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              bj.field_q.c(var3, param0.a(this.a(true), (byte) -128), -48 + param0.a(this.f(param1 ^ 237235572), 0), 16777215, 0);
              if (null != this.field_yb) {
                bi.e(param0.a(this.a(true), (byte) -93), param0.a(this.f(237239984), 0), param0.a(this.field_yb.a(true), (byte) -81), param0.a(this.field_yb.f(param1 + 237234924), 0), 65280);
                break L3;
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3_ref);
            stackOut_9_1 = new StringBuilder().append("qk.L(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    void b(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ZombieDawn.field_J;
        var4 = 2 + this.field_Gb;
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
            if ((this.field_S ^ -1) != -2) {
              if (this.field_S != 3) {
                if (0 == this.field_S) {
                  bi.d(param0 - 2, param2 + -54 + var7, var5, 0, 64);
                  bi.d(-2 + param0, -50 + param2, var6, 0, 128);
                  bi.a(-2 + param0 << 21902564, param2 - 54 - -var7 << 1917214564, var5 << -180827548, 250, dm.field_p);
                  bi.a(-2 + param0 << -1421119132, param2 + -50 << -823603932, var6 << 1995243524, 200, dm.field_r);
                  break L1;
                } else {
                  if ((this.field_S ^ -1) != -3) {
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
        int fieldTemp$3 = 0;
        boolean discarded$4 = false;
        int fieldTemp$5 = 0;
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
          if (0 >= this.field_xb) {
            break L1;
          } else {
            this.field_xb = this.field_xb - 1;
            break L1;
          }
        }
        L2: {
          if (11 != this.field_F) {
            if ((this.field_F ^ -1) != -11) {
              if (this.field_F != 0) {
                break L2;
              } else {
                break L2;
              }
            } else {
              if (-2 != (this.field_G ^ -1)) {
                if ((this.field_G ^ -1) != -3) {
                  break L2;
                } else {
                  L3: {
                    this.field_xb = this.field_Ib;
                    if (4 != this.field_W) {
                      this.field_xb = 4 * this.field_xb / this.field_W;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (this.field_zb != this.field_Lb) {
                      break L4;
                    } else {
                      if (this.field_yb == null) {
                        break L4;
                      } else {
                        fieldTemp$3 = this.field_Ab - 1;
                        this.field_Ab = this.field_Ab - 1;
                        if (-1 >= (fieldTemp$3 ^ -1)) {
                          L5: {
                            if (28 != this.field_t) {
                              this.field_yb.z(0);
                              break L5;
                            } else {
                              discarded$4 = dj.field_e.b(2, this.field_yb.f(237239984), true, this.field_yb.a(true));
                              break L5;
                            }
                          }
                          if (-2001 > (this.field_Ab ^ -1)) {
                            this.field_Ab = 3000;
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
                    fieldTemp$5 = this.field_Lb - 1;
                    this.field_Lb = this.field_Lb - 1;
                    stackOut_29_0 = this;
                    stackIn_31_0 = stackOut_29_0;
                    stackIn_30_0 = stackOut_29_0;
                    if (-1 != (fieldTemp$5 ^ -1)) {
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
                  this.e(stackIn_32_1, -6904);
                  break L2;
                }
              } else {
                if (this.field_Gb <= 0) {
                  break L2;
                } else {
                  this.field_Gb = this.field_Gb - 1;
                  break L2;
                }
              }
            }
          } else {
            if (0 != this.field_xb) {
              break L2;
            } else {
              this.e(10, -6904);
              if (0 >= this.field_Ab) {
                this.field_Gb = -2;
                this.field_U = dc.a((byte) 18, 63);
                break L2;
              } else {
                this.field_Gb = 8;
                if (!(this instanceof we)) {
                  this.field_U = dc.a((byte) 18, 44);
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
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = ZombieDawn.field_J;
        try {
          L0: {
            if (param3 < -72) {
              var5_int = 0;
              L1: while (true) {
                if (bm.field_a.length <= var5_int) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  if (bm.field_a[var5_int] == 0) {
                    bm.field_a[var5_int] = param1;
                    hg.field_a[var5_int] = param2;
                    si.field_Qb[var5_int] = param4;
                    hd.field_u[var5_int] = param0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var5_int++;
                    continue L1;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var5), "qk.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final void m(byte param0) {
        Object var2 = null;
        int var3 = 0;
        fb var4_ref_fb = null;
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
        if (this.field_wb) {
          this.e(3, -6904);
          return;
        } else {
          if (0 < this.field_xb) {
            return;
          } else {
            L0: {
              var11 = null;
              var2 = var11;
              if (param0 <= -87) {
                break L0;
              } else {
                this.field_Ib = -17;
                break L0;
              }
            }
            L1: {
              L2: {
                var3 = this.field_Eb * this.field_Eb;
                if (var2 == null) {
                  break L2;
                } else {
                  if (!((kd) (var11)).field_hb) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var4_ref_fb = this.a((byte) -74, this.field_Eb, 2);
              L3: while (true) {
                if (var4_ref_fb == null) {
                  break L1;
                } else {
                  L4: {
                    L5: {
                      if (((kd) ((Object) var4_ref_fb)).x(42)) {
                        break L5;
                      } else {
                        if (!(this instanceof we)) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (((kd) ((Object) var4_ref_fb)).field_hb) {
                      break L4;
                    } else {
                      var5 = var4_ref_fb.a(true);
                      var6 = var4_ref_fb.f(237239984);
                      var7 = -var5 + this.a(true);
                      var8 = -var6 + this.f(237239984);
                      var9 = var7 * var7 - -(var8 * var8);
                      if (var3 <= var9) {
                        break L4;
                      } else {
                        L6: {
                          if (dj.field_e.field_H.a(var6, this.f(237239984), var5, this.a(true), 123) != -1) {
                            break L6;
                          } else {
                            if ((dj.field_e.field_H.a(-24 + var6, -24 + this.f(237239984), var5, this.a(true), 105) ^ -1) != 0) {
                              break L6;
                            } else {
                              var4_ref_fb = this.e((byte) 32);
                              continue L3;
                            }
                          }
                        }
                        var2 = (kd) ((Object) var4_ref_fb);
                        var3 = var9;
                        break L4;
                      }
                    }
                  }
                  var4_ref_fb = this.e((byte) 32);
                  continue L3;
                }
              }
            }
            L7: {
              if (var2 != null) {
                L8: {
                  ((kd) (var2)).field_hb = true;
                  var4 = ((kd) (var2)).a(true) - this.a(true);
                  var5 = ((kd) (var2)).f(237239984) + -this.f(237239984);
                  if (Math.abs(var5) > Math.abs(var4)) {
                    L9: {
                      stackOut_30_0 = this;
                      stackIn_32_0 = stackOut_30_0;
                      stackIn_31_0 = stackOut_30_0;
                      if (-1 > (var5 ^ -1)) {
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
                    ((qk) (this)).field_S = stackIn_33_1;
                    break L8;
                  } else {
                    L10: {
                      stackOut_26_0 = this;
                      stackIn_28_0 = stackOut_26_0;
                      stackIn_27_0 = stackOut_26_0;
                      if ((var4 ^ -1) >= -1) {
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
                    ((qk) (this)).field_S = stackIn_29_1;
                    break L8;
                  }
                }
                L11: {
                  this.field_yb = (kd) (var2);
                  this.e(10, -6904);
                  if (0 >= this.field_Ab) {
                    this.field_wb = true;
                    this.field_Gb = -2;
                    this.field_U = dc.a((byte) 18, 63);
                    break L11;
                  } else {
                    this.field_Gb = 8;
                    if (!(this instanceof we)) {
                      if (this.field_t == 28) {
                        this.field_U = dc.a((byte) 18, 92);
                        break L11;
                      } else {
                        this.field_U = dc.a((byte) 18, 44);
                        break L11;
                      }
                    } else {
                      this.field_U = dc.a((byte) 18, 8);
                      break L11;
                    }
                  }
                }
                this.field_Lb = this.field_Fb;
                this.field_zb = pb.a(so.field_a, this.field_Fb, 1) - -1;
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
        field_Hb = new vn[5];
        field_Cb = new int[8192];
        field_Jb = new al[15];
    }
}
