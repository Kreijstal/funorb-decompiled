/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wb extends ti {
    private int field_yb;
    gm field_Eb;
    private int field_fb;
    int field_Lb;
    static int field_db;
    private int field_Jb;
    static java.awt.Font field_hb;
    private int field_qb;
    private ve field_kb;
    private boolean field_xb;
    int field_ib;
    private boolean field_nb;
    boolean field_Bb;
    int field_Kb;
    private boolean field_wb;
    private int field_ob;
    private int field_Nb;
    private pq field_jb;
    private int field_ub;
    private int field_Ob;
    int field_Ib;
    private int field_sb;
    private int field_pb;
    private int field_lb;
    boolean field_Hb;
    private int field_mb;
    boolean field_eb;
    private boolean field_rb;
    private int field_vb;
    private int field_Mb;
    private int field_cb;
    static int field_Ab;
    private int field_Fb;
    boolean field_zb;
    private int field_tb;
    private boolean field_Cb;
    private qk field_Db;
    private th field_gb;
    private boolean field_Gb;

    final void p(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 72) {
                break L1;
              } else {
                wb.l((byte) 29);
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.m(-2)) {
                  break L3;
                } else {
                  this.field_U = qq.b(1481485697, 72 + hp.a((byte) -68, g.field_a, 2));
                  if (!ZombieDawnMulti.field_E) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              this.field_U = qq.b(1481485697, 70 + hp.a((byte) -90, g.field_a, 2));
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "wb.BA(" + param0 + ')');
        }
    }

    final static l a(int param0, java.awt.Component param1, int param2, int param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            RuntimeException var4_ref2 = null;
            l var5 = null;
            dq var5_ref = null;
            l stackIn_2_0 = null;
            l stackIn_4_0 = null;
            dq stackIn_6_0 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            String stackIn_11_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            l stackOut_3_0 = null;
            l stackOut_1_0 = null;
            dq stackOut_5_0 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    if (param0 == 1) {
                      var4 = Class.forName("qn");
                      var5 = (l) (var4.newInstance());
                      var5.a(-6, param1, param3, param2);
                      stackOut_3_0 = (l) (var5);
                      stackIn_4_0 = stackOut_3_0;
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      stackOut_1_0 = (l) null;
                      stackIn_2_0 = stackOut_1_0;
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4_ref = decompiledCaughtException;
                  var5_ref = new dq();
                  ((l) ((Object) var5_ref)).a(param0 + -7, param1, param3, param2);
                  stackOut_5_0 = (dq) (var5_ref);
                  stackIn_6_0 = stackOut_5_0;
                  return (l) ((Object) stackIn_6_0);
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_7_0 = (RuntimeException) (var4_ref2);
                stackOut_7_1 = new StringBuilder().append("wb.BB(").append(param0).append(',');
                stackIn_10_0 = stackOut_7_0;
                stackIn_10_1 = stackOut_7_1;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                if (param1 == null) {
                  stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackOut_10_2 = "null";
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  stackIn_11_2 = stackOut_10_2;
                  break L2;
                } else {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "{...}";
                  stackIn_11_0 = stackOut_8_0;
                  stackIn_11_1 = stackOut_8_1;
                  stackIn_11_2 = stackOut_8_2;
                  break L2;
                }
              }
              throw fa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_2_0;
            } else {
              return stackIn_4_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(int param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              stackOut_1_0 = this;
              stackIn_4_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if ((this.field_K ^ -1) != -34) {
                stackOut_4_0 = this;
                stackOut_4_1 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_5_0 = stackOut_2_0;
                stackIn_5_1 = stackOut_2_1;
                break L1;
              }
            }
            ((wb) (this)).field_rb = stackIn_5_1 != 0;
            if (this.field_K == 9) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (34 != this.field_K) {
                  break L2;
                } else {
                  if ((param0 ^ -1) == -10) {
                    break L2;
                  } else {
                    if (param0 == 21) {
                      break L2;
                    } else {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
              }
              L3: {
                if (null == this.field_jb) {
                  break L3;
                } else {
                  L4: {
                    if (param0 == 9) {
                      break L4;
                    } else {
                      if (21 != param0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  this.field_jb.c(-24421);
                  break L3;
                }
              }
              L5: {
                L6: {
                  super.b(param0, param1);
                  if (-22 != (this.field_K ^ -1)) {
                    break L6;
                  } else {
                    this.field_Bb = false;
                    if (var5 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                if ((this.field_K ^ -1) == -24) {
                  break L5;
                } else {
                  L7: {
                    if (4 == this.field_K) {
                      break L7;
                    } else {
                      L8: {
                        if (this.field_K == 7) {
                          break L8;
                        } else {
                          L9: {
                            if ((this.field_K ^ -1) != -10) {
                              break L9;
                            } else {
                              this.field_U = nm.b(-126, 66);
                              if (var5 == 0) {
                                break L5;
                              } else {
                                break L9;
                              }
                            }
                          }
                          L10: {
                            if ((this.field_K ^ -1) == -28) {
                              break L10;
                            } else {
                              if ((this.field_K ^ -1) == -29) {
                                break L10;
                              } else {
                                if (19 == this.field_K) {
                                  break L10;
                                } else {
                                  if (this.field_K == 24) {
                                    break L10;
                                  } else {
                                    L11: {
                                      if (-30 != (this.field_K ^ -1)) {
                                        break L11;
                                      } else {
                                        this.field_Cb = true;
                                        this.field_yb = 0;
                                        this.field_Ob = -65536000;
                                        this.field_vb = -65536000;
                                        if (var5 == 0) {
                                          break L5;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                    L12: {
                                      if (-34 != (this.field_K ^ -1)) {
                                        break L12;
                                      } else {
                                        this.field_rb = true;
                                        this.field_yb = -100;
                                        if (var5 == 0) {
                                          break L5;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                    L13: {
                                      if (-23 != (this.field_K ^ -1)) {
                                        break L13;
                                      } else {
                                        this.field_lb = 70;
                                        if (var5 == 0) {
                                          break L5;
                                        } else {
                                          break L13;
                                        }
                                      }
                                    }
                                    if (this.field_K != 8) {
                                      break L5;
                                    } else {
                                      if (this.field_Eb == null) {
                                        break L5;
                                      } else {
                                        var3_int = (this.field_Eb.g(-97) + -this.g(-47)) / 2;
                                        var4 = (this.field_Eb.h(123) + -this.h(-99)) / 2;
                                        this.field_Eb.n(20);
                                        this.field_cb = var4;
                                        this.field_mb = var3_int;
                                        if (var5 == 0) {
                                          break L5;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          this.field_xb = false;
                          this.field_Nb = 0;
                          this.field_ub = 0;
                          if (var5 == 0) {
                            break L5;
                          } else {
                            break L8;
                          }
                        }
                      }
                      L14: {
                        if (this.m(-2)) {
                          break L14;
                        } else {
                          this.field_U = qq.b(1481485697, 25);
                          if (var5 == 0) {
                            break L5;
                          } else {
                            break L14;
                          }
                        }
                      }
                      this.field_U = qq.b(1481485697, 15);
                      if (var5 == 0) {
                        break L5;
                      } else {
                        break L7;
                      }
                    }
                  }
                  this.field_S = 0;
                  this.field_X = 0;
                  if (null != this.field_gb) {
                    var3_int = this.field_tb + -this.g(-99);
                    var4 = this.field_Jb + -this.h(-56);
                    if (var3_int * var3_int + var4 * var4 < 400) {
                      this.field_gb = null;
                      break L5;
                    } else {
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "wb.T(" + param0 + ',' + param1 + ')');
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

    public static void o(byte param0) {
        try {
            field_hb = null;
            int var1_int = -96 % ((param0 - 52) / 58);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "wb.AB(" + param0 + ')');
        }
    }

    final boolean o(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_46_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_45_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 > 86) {
              L1: {
                L2: {
                  if ((this.field_K ^ -1) == -9) {
                    break L2;
                  } else {
                    if (21 == this.field_K) {
                      break L2;
                    } else {
                      if ((this.field_K ^ -1) == -10) {
                        break L2;
                      } else {
                        if (-13 == (this.field_K ^ -1)) {
                          break L2;
                        } else {
                          if ((this.field_K ^ -1) == -8) {
                            break L2;
                          } else {
                            if ((this.field_K ^ -1) == -14) {
                              break L2;
                            } else {
                              if ((this.field_K ^ -1) == -15) {
                                break L2;
                              } else {
                                if (this.field_K == 26) {
                                  break L2;
                                } else {
                                  if (-28 == (this.field_K ^ -1)) {
                                    break L2;
                                  } else {
                                    if (this.field_K == 15) {
                                      break L2;
                                    } else {
                                      if (this.field_K == 17) {
                                        break L2;
                                      } else {
                                        if (28 == this.field_K) {
                                          break L2;
                                        } else {
                                          if (24 == this.field_K) {
                                            break L2;
                                          } else {
                                            if (19 != this.field_K) {
                                              stackOut_45_0 = 0;
                                              stackIn_46_0 = stackOut_45_0;
                                              break L1;
                                            } else {
                                              break L2;
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
                      }
                    }
                  }
                }
                stackOut_43_0 = 1;
                stackIn_46_0 = stackOut_43_0;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "wb.U(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_46_0 != 0;
        }
    }

    final void e(boolean param0) {
        try {
            this.field_Fb = 250;
            if (param0) {
                this.a(87, (nm) null);
            }
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "wb.I(" + param0 + ')');
        }
    }

    private final void n(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                this.field_kb = (ve) null;
                break L1;
              }
            }
            L2: {
              if (!this.field_xb) {
                break L2;
              } else {
                if (!this.field_nb) {
                  break L2;
                } else {
                  if ((this.field_Lb ^ -1) != (fb.field_e.field_M ^ -1)) {
                    break L2;
                  } else {
                    gd.field_B = fb.field_d[wf.field_m % fb.field_d.length];
                    mo.field_Ib = ej.field_p[wf.field_m % ej.field_p.length];
                    break L2;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "wb.KB(" + param0 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_19_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_18_0 = 0;
        try {
          L0: {
            L1: {
              if (param4 >= param0) {
                break L1;
              } else {
                var6_int = param0;
                param0 = param4;
                param4 = var6_int;
                break L1;
              }
            }
            L2: {
              if (param2 > param1) {
                var6_int = param2;
                param2 = param1;
                param1 = var6_int;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                var6_int = 24 + (this.field_z >> -1004036528);
                var7 = var6_int - param3;
                var8 = this.field_E >> 1923022896;
                var9 = var8 + -48;
                if (param0 >= var6_int) {
                  break L4;
                } else {
                  if ((param4 ^ -1) >= (var7 ^ -1)) {
                    break L4;
                  } else {
                    if ((var8 ^ -1) >= (param2 ^ -1)) {
                      break L4;
                    } else {
                      if ((param1 ^ -1) >= (var9 ^ -1)) {
                        break L4;
                      } else {
                        stackOut_16_0 = 1;
                        stackIn_19_0 = stackOut_16_0;
                        break L3;
                      }
                    }
                  }
                }
              }
              stackOut_18_0 = 0;
              stackIn_19_0 = stackOut_18_0;
              break L3;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var6), "wb.IB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_19_0 != 0;
    }

    final void r(int param0) {
        try {
            this.field_Bb = true;
            this.field_qb = param0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "wb.SB(" + param0 + ')');
        }
    }

    private final void s(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (0 >= this.field_Fb) {
                break L1;
              } else {
                var2_int = this.field_Fb / 2;
                var2_int = (int)(128.0 * Math.sin((double)var2_int / 10.0 * (1.0 + (double)var2_int / 33.3)));
                var2_int = var2_int + this.field_Fb / 250;
                if (-1 >= (var2_int ^ -1)) {
                  gd.field_B = 13421772;
                  mo.field_Ib = 13421772;
                  break L1;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L2: {
              if (param0 == 2) {
                break L2;
              } else {
                this.field_ub = 112;
                break L2;
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "wb.M(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final boolean n(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        try {
          L0: {
            var2_int = -64 % ((-15 - param0) / 42);
            if (this.o(106)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              this.b(17, -27655);
              stackOut_5_0 = 1;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "wb.CB(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    final void a(int param0, nm param1) {
        ja discarded$1 = null;
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ja var12_ref_ja = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var14_ref_int__ = null;
        int var15 = 0;
        int var16 = 0;
        ja[][] var17 = null;
        int var18 = 0;
        int var19 = 0;
        ja var20_ref_ja = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int[] var23 = null;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int stackIn_5_0 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_131_0 = 0;
        int stackIn_135_0 = 0;
        ja stackIn_187_0 = null;
        int stackIn_187_1 = 0;
        ja stackIn_189_0 = null;
        int stackIn_189_1 = 0;
        ja stackIn_191_0 = null;
        int stackIn_191_1 = 0;
        ja stackIn_192_0 = null;
        int stackIn_192_1 = 0;
        int stackIn_192_2 = 0;
        int stackIn_313_0 = 0;
        int stackIn_314_0 = 0;
        int stackIn_316_0 = 0;
        int stackIn_317_0 = 0;
        int stackIn_317_1 = 0;
        int stackIn_330_0 = 0;
        int stackIn_345_0 = 0;
        int stackIn_345_1 = 0;
        int stackIn_370_0 = 0;
        int stackIn_370_1 = 0;
        ri stackIn_387_0 = null;
        int stackIn_387_1 = 0;
        ri stackIn_389_0 = null;
        int stackIn_389_1 = 0;
        ri stackIn_390_0 = null;
        int stackIn_390_1 = 0;
        int stackIn_390_2 = 0;
        RuntimeException stackIn_457_0 = null;
        StringBuilder stackIn_457_1 = null;
        RuntimeException stackIn_459_0 = null;
        StringBuilder stackIn_459_1 = null;
        RuntimeException stackIn_460_0 = null;
        StringBuilder stackIn_460_1 = null;
        String stackIn_460_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        Object stackOut_13_0 = null;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_130_0 = 0;
        int stackOut_128_0 = 0;
        int stackOut_134_0 = 0;
        int stackOut_132_0 = 0;
        ja stackOut_186_0 = null;
        int stackOut_186_1 = 0;
        ja stackOut_191_0 = null;
        int stackOut_191_1 = 0;
        int stackOut_191_2 = 0;
        ja stackOut_187_0 = null;
        int stackOut_187_1 = 0;
        ja stackOut_189_0 = null;
        int stackOut_189_1 = 0;
        int stackOut_189_2 = 0;
        int stackOut_312_0 = 0;
        int stackOut_310_0 = 0;
        int stackOut_313_0 = 0;
        int stackOut_316_0 = 0;
        int stackOut_316_1 = 0;
        int stackOut_314_0 = 0;
        int stackOut_314_1 = 0;
        int stackOut_327_0 = 0;
        int stackOut_329_0 = 0;
        int stackOut_344_0 = 0;
        int stackOut_344_1 = 0;
        int stackOut_368_0 = 0;
        int stackOut_368_1 = 0;
        ri stackOut_386_0 = null;
        int stackOut_386_1 = 0;
        ri stackOut_389_0 = null;
        int stackOut_389_1 = 0;
        int stackOut_389_2 = 0;
        ri stackOut_387_0 = null;
        int stackOut_387_1 = 0;
        int stackOut_387_2 = 0;
        RuntimeException stackOut_456_0 = null;
        StringBuilder stackOut_456_1 = null;
        RuntimeException stackOut_459_0 = null;
        StringBuilder stackOut_459_1 = null;
        String stackOut_459_2 = null;
        RuntimeException stackOut_457_0 = null;
        StringBuilder stackOut_457_1 = null;
        String stackOut_457_2 = null;
        var27 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = ub.p(-124);
              if (-1 <= (var3_int ^ -1)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_5_0 = stackOut_2_0;
                break L1;
              }
            }
            var4 = stackIn_5_0;
            if (param0 == -10136) {
              L2: {
                var5 = this.field_K;
                var6 = this.field_ab;
                if (var4 == 0) {
                  break L2;
                } else {
                  if (-1 == (hp.a((byte) 59, g.field_a, 30) ^ -1)) {
                    L3: {
                      stackOut_13_0 = this;
                      stackIn_16_0 = stackOut_13_0;
                      stackIn_14_0 = stackOut_13_0;
                      if (this.field_wb) {
                        stackOut_16_0 = this;
                        stackOut_16_1 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        break L3;
                      } else {
                        stackOut_14_0 = this;
                        stackOut_14_1 = 1;
                        stackIn_17_0 = stackOut_14_0;
                        stackIn_17_1 = stackOut_14_1;
                        break L3;
                      }
                    }
                    ((wb) (this)).field_wb = stackIn_17_1 != 0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              L4: {
                if (var4 == 0) {
                  break L4;
                } else {
                  if (this.field_wb) {
                    break L4;
                  } else {
                    L5: {
                      L6: {
                        L7: {
                          L8: {
                            L9: {
                              L10: {
                                L11: {
                                  L12: {
                                    L13: {
                                      L14: {
                                        L15: {
                                          var7 = this.field_K;
                                          if (var7 != 22) {
                                            break L15;
                                          } else {
                                            if (var27 == 0) {
                                              var5 = 30;
                                              if (var27 == 0) {
                                                break L5;
                                              } else {
                                                break L14;
                                              }
                                            } else {
                                              break L15;
                                            }
                                          }
                                        }
                                        L16: {
                                          if (5 != var7) {
                                            break L16;
                                          } else {
                                            if (var27 == 0) {
                                              break L14;
                                            } else {
                                              break L16;
                                            }
                                          }
                                        }
                                        if (-35 == (var7 ^ -1)) {
                                          break L14;
                                        } else {
                                          L17: {
                                            if (var7 != 7) {
                                              break L17;
                                            } else {
                                              if (var27 == 0) {
                                                break L14;
                                              } else {
                                                break L17;
                                              }
                                            }
                                          }
                                          if (-14 == (var7 ^ -1)) {
                                            break L13;
                                          } else {
                                            if ((var7 ^ -1) == -28) {
                                              break L13;
                                            } else {
                                              L18: {
                                                if (14 != var7) {
                                                  break L18;
                                                } else {
                                                  if (var27 == 0) {
                                                    break L12;
                                                  } else {
                                                    break L18;
                                                  }
                                                }
                                              }
                                              L19: {
                                                if ((var7 ^ -1) != -27) {
                                                  break L19;
                                                } else {
                                                  if (var27 == 0) {
                                                    break L12;
                                                  } else {
                                                    break L19;
                                                  }
                                                }
                                              }
                                              if (19 == var7) {
                                                break L12;
                                              } else {
                                                L20: {
                                                  if (24 != var7) {
                                                    break L20;
                                                  } else {
                                                    if (var27 == 0) {
                                                      break L12;
                                                    } else {
                                                      break L20;
                                                    }
                                                  }
                                                }
                                                L21: {
                                                  if ((var7 ^ -1) != -30) {
                                                    break L21;
                                                  } else {
                                                    if (var27 == 0) {
                                                      break L12;
                                                    } else {
                                                      break L21;
                                                    }
                                                  }
                                                }
                                                if (var7 == 33) {
                                                  break L12;
                                                } else {
                                                  if (4 == var7) {
                                                    break L12;
                                                  } else {
                                                    if (var7 == 23) {
                                                      break L11;
                                                    } else {
                                                      L22: {
                                                        if ((var7 ^ -1) != -13) {
                                                          break L22;
                                                        } else {
                                                          if (var27 == 0) {
                                                            break L10;
                                                          } else {
                                                            break L22;
                                                          }
                                                        }
                                                      }
                                                      L23: {
                                                        if (-536870913 != (var7 ^ -1)) {
                                                          break L23;
                                                        } else {
                                                          if (var27 == 0) {
                                                            break L9;
                                                          } else {
                                                            break L23;
                                                          }
                                                        }
                                                      }
                                                      if ((var7 ^ -1) == -16) {
                                                        break L9;
                                                      } else {
                                                        if (var7 == 28) {
                                                          break L9;
                                                        } else {
                                                          if (var7 == 9) {
                                                            break L8;
                                                          } else {
                                                            if (17 == var7) {
                                                              break L8;
                                                            } else {
                                                              if (-32 == (var7 ^ -1)) {
                                                                break L7;
                                                              } else {
                                                                break L6;
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
                                        }
                                      }
                                      var5 = 1;
                                      if (var27 == 0) {
                                        break L5;
                                      } else {
                                        break L13;
                                      }
                                    }
                                    var5 = 30;
                                    if (var27 == 0) {
                                      break L5;
                                    } else {
                                      break L12;
                                    }
                                  }
                                  var5 = 0;
                                  if (var27 == 0) {
                                    break L5;
                                  } else {
                                    break L11;
                                  }
                                }
                                var5 = 25;
                                if (var27 == 0) {
                                  break L5;
                                } else {
                                  break L10;
                                }
                              }
                              var5 = 2;
                              if (var27 == 0) {
                                break L5;
                              } else {
                                break L9;
                              }
                            }
                            var5 = 16;
                            if (var27 == 0) {
                              break L5;
                            } else {
                              break L8;
                            }
                          }
                          var5 = 32;
                          if (var27 == 0) {
                            break L5;
                          } else {
                            break L7;
                          }
                        }
                        var5 = 3;
                        if (var27 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                      var5 = 0;
                      break L5;
                    }
                    if (gg.field_j[var5] > var6) {
                      break L4;
                    } else {
                      var6 = 0;
                      break L4;
                    }
                  }
                }
              }
              L24: {
                L25: {
                  var7 = -24 + param1.c(this.g(87), -20126);
                  var8 = -48 + param1.d(this.h(param0 + 10063), 108);
                  if (this.field_Cb) {
                    break L25;
                  } else {
                    if ((this.field_yb ^ -1) == -1) {
                      stackOut_130_0 = 0;
                      stackIn_131_0 = stackOut_130_0;
                      break L24;
                    } else {
                      break L25;
                    }
                  }
                }
                stackOut_128_0 = 1;
                stackIn_131_0 = stackOut_128_0;
                break L24;
              }
              L26: {
                var9 = stackIn_131_0;
                var10 = 12303359;
                if (var9 != 0) {
                  stackOut_134_0 = 0;
                  stackIn_135_0 = stackOut_134_0;
                  break L26;
                } else {
                  stackOut_132_0 = 1;
                  stackIn_135_0 = stackOut_132_0;
                  break L26;
                }
              }
              var11 = stackIn_135_0;
              L27: while (true) {
                L28: {
                  L29: {
                    if (var11 >= 2) {
                      break L29;
                    } else {
                      if (var27 != 0) {
                        break L28;
                      } else {
                        L30: {
                          L31: {
                            if (this.field_rb) {
                              L32: {
                                L33: {
                                  if ((var11 ^ -1) == -2) {
                                    break L33;
                                  } else {
                                    var7 = param1.c(this.g(param0 ^ 10153), param0 + -9990);
                                    var8 = param1.d(this.h(102), param0 ^ -10212) + -24;
                                    if (var27 == 0) {
                                      break L32;
                                    } else {
                                      break L33;
                                    }
                                  }
                                }
                                var7 = param1.c(this.field_Ob >> 2084930032, -20126);
                                var8 = -12 + param1.d(this.field_vb >> -964577424, 125);
                                break L32;
                              }
                              L34: {
                                if (1 == ll.field_k.field_k) {
                                  break L34;
                                } else {
                                  L35: {
                                    if (null == this.field_kb) {
                                      this.field_kb = new ve(var7, var8, 8, 0.0, 8.0, 3.0, 4, 1.5, 0.99, 1);
                                      break L35;
                                    } else {
                                      break L35;
                                    }
                                  }
                                  this.field_kb.field_k = 13 * var7 + (wf.field_m - -(79 * var8));
                                  var12 = 200;
                                  var13 = 128 * var12;
                                  var14 = var12 * 64;
                                  var13 = var13 >> 8;
                                  var15 = 255 * var12;
                                  var14 = var14 >> 8;
                                  var14 = var14 << 8;
                                  var13 = var13 << 16;
                                  var15 = var15 >> 8;
                                  this.field_kb.a(var13 | var14 | var15, var7, true, var8, var10, -1963);
                                  break L34;
                                }
                              }
                              if ((var11 ^ -1) != -1) {
                                break L31;
                              } else {
                                if (var27 == 0) {
                                  break L30;
                                } else {
                                  break L31;
                                }
                              }
                            } else {
                              break L31;
                            }
                          }
                          L36: {
                            if (var11 == 0) {
                              break L36;
                            } else {
                              var7 = param1.c(this.g(88), -20126) + -24;
                              var8 = -48 + param1.d(this.h(param0 ^ 10225), 111);
                              break L36;
                            }
                          }
                          L37: {
                            if ((this.field_K ^ -1) != -9) {
                              break L37;
                            } else {
                              gd.field_B = op.field_m.field_D[this.field_Lb][0];
                              mo.field_Ib = op.field_m.field_D[this.field_Lb][1];
                              this.n(0);
                              this.s(2);
                              var12_ref_ja = nk.a(ig.field_d[var6 + (gg.field_l[var5] + this.field_fb)], mo.field_Ib, 255, gd.field_B);
                              var12_ref_ja.g(var7 + this.field_mb - 3, var8 + this.field_cb - 3);
                              if (var27 == 0) {
                                break L29;
                              } else {
                                break L37;
                              }
                            }
                          }
                          L38: {
                            if (!ei.field_f) {
                              break L38;
                            } else {
                              break L38;
                            }
                          }
                          L39: {
                            if (null != this.field_U) {
                              L40: {
                                if (this.field_U.k()) {
                                  break L40;
                                } else {
                                  this.field_U.h(sd.b(-49, var8, var7));
                                  this.field_U.f(pb.a(var8, var7, false));
                                  if (var27 == 0) {
                                    break L39;
                                  } else {
                                    break L40;
                                  }
                                }
                              }
                              this.field_U = null;
                              break L39;
                            } else {
                              break L39;
                            }
                          }
                          L41: {
                            if (io.a(var7, var8, (byte) -99, param1)) {
                              break L41;
                            } else {
                              if (var27 == 0) {
                                break L29;
                              } else {
                                break L41;
                              }
                            }
                          }
                          L42: {
                            if (17 == this.field_K) {
                              break L42;
                            } else {
                              if (this.field_Gb) {
                                break L42;
                              } else {
                                L43: {
                                  stackOut_186_0 = ig.field_d[1];
                                  stackOut_186_1 = 12;
                                  stackIn_191_0 = stackOut_186_0;
                                  stackIn_191_1 = stackOut_186_1;
                                  stackIn_187_0 = stackOut_186_0;
                                  stackIn_187_1 = stackOut_186_1;
                                  if (this.field_F != 3) {
                                    stackOut_191_0 = (ja) ((Object) stackIn_191_0);
                                    stackOut_191_1 = stackIn_191_1;
                                    stackOut_191_2 = var7;
                                    stackIn_192_0 = stackOut_191_0;
                                    stackIn_192_1 = stackOut_191_1;
                                    stackIn_192_2 = stackOut_191_2;
                                    break L43;
                                  } else {
                                    stackOut_187_0 = (ja) ((Object) stackIn_187_0);
                                    stackOut_187_1 = stackIn_187_1;
                                    stackIn_189_0 = stackOut_187_0;
                                    stackIn_189_1 = stackOut_187_1;
                                    stackOut_189_0 = (ja) ((Object) stackIn_189_0);
                                    stackOut_189_1 = stackIn_189_1;
                                    stackOut_189_2 = var7 + -5;
                                    stackIn_192_0 = stackOut_189_0;
                                    stackIn_192_1 = stackOut_189_1;
                                    stackIn_192_2 = stackOut_189_2;
                                    break L43;
                                  }
                                }
                                g.a(stackIn_192_0, stackIn_192_1 + stackIn_192_2, 43 + var8);
                                break L42;
                              }
                            }
                          }
                          L44: {
                            L45: {
                              var12 = 0;
                              var13 = 0;
                              if (this.field_Cb) {
                                break L45;
                              } else {
                                if (33 == this.field_K) {
                                  break L45;
                                } else {
                                  break L44;
                                }
                              }
                            }
                            L46: {
                              if (nk.field_h != null) {
                                break L46;
                              } else {
                                g.c(bb.field_n);
                                nk.field_h = new ea();
                                g.d();
                                break L46;
                              }
                            }
                            L47: {
                              L48: {
                                g.c(bb.field_n);
                                oo.b();
                                oo.d(oo.field_l / 2, oo.field_l / 2, oo.field_l / 2, 1);
                                if (0 < this.field_yb) {
                                  break L48;
                                } else {
                                  var14_ref_int__ = nk.a(1052800, 455739624, 8454143);
                                  var15 = 1073741824 - -this.field_y - wf.field_m;
                                  if (var27 == 0) {
                                    break L47;
                                  } else {
                                    break L48;
                                  }
                                }
                              }
                              var14_ref_int__ = nk.a(8392720, 455739624, 16744448);
                              var15 = -this.field_y + wf.field_m;
                              break L47;
                            }
                            L49: {
                              nk.field_h.a(2, (double)var15 / 7.0, var14_ref_int__);
                              g.d();
                              if (!this.field_Cb) {
                                break L49;
                              } else {
                                bb.field_n.c(var7, var8, 200);
                                if (var27 == 0) {
                                  break L44;
                                } else {
                                  break L49;
                                }
                              }
                            }
                            L50: {
                              L51: {
                                if ((this.field_yb ^ -1) <= -1) {
                                  break L51;
                                } else {
                                  var12 = bb.field_n.field_x * -this.field_yb / 100;
                                  if (var27 == 0) {
                                    break L50;
                                  } else {
                                    break L51;
                                  }
                                }
                              }
                              L52: {
                                if (this.field_yb <= 0) {
                                  break L52;
                                } else {
                                  var12 = this.field_yb * bb.field_n.field_x / 100;
                                  if (var27 == 0) {
                                    break L50;
                                  } else {
                                    break L52;
                                  }
                                }
                              }
                              this.field_E = this.field_vb;
                              this.field_z = this.field_Ob;
                              break L50;
                            }
                            var13 = -(var12 / 2) + 24;
                            if (-1 != (var12 ^ -1)) {
                              bb.field_n.f(var7 + var13, var8 + var13, var12, var12);
                              break L44;
                            } else {
                              break L44;
                            }
                          }
                          L53: {
                            var14 = var6;
                            if (null == gg.field_i[var5]) {
                              break L53;
                            } else {
                              var14 = gg.field_i[var5][var6];
                              break L53;
                            }
                          }
                          L54: {
                            var15 = var14 + gg.field_l[var5];
                            if (!this.field_xb) {
                              break L54;
                            } else {
                              L55: {
                                if (!this.i((byte) 122)) {
                                  break L55;
                                } else {
                                  if (var4 != 0) {
                                    break L55;
                                  } else {
                                    if (14 > var15) {
                                      var15 += 70;
                                      if (var27 == 0) {
                                        break L54;
                                      } else {
                                        break L55;
                                      }
                                    } else {
                                      break L54;
                                    }
                                  }
                                }
                              }
                              if (!this.field_nb) {
                                this.a(var7, var8, 256, (byte) -91);
                                if (var27 == 0) {
                                  break L29;
                                } else {
                                  break L54;
                                }
                              } else {
                                break L54;
                              }
                            }
                          }
                          L56: {
                            L57: {
                              if (null == fb.field_e) {
                                break L57;
                              } else {
                                L58: {
                                  var16 = this.field_Lb;
                                  if (!this.field_xb) {
                                    break L58;
                                  } else {
                                    if (!this.field_nb) {
                                      break L58;
                                    } else {
                                      var16 = fb.field_e.field_M;
                                      if (var16 < 0) {
                                        var16 = (this.field_Lb + 1) % op.field_m.field_t;
                                        break L58;
                                      } else {
                                        break L58;
                                      }
                                    }
                                  }
                                }
                                gd.field_B = op.field_m.field_D[var16][0];
                                mo.field_Ib = op.field_m.field_D[var16][1];
                                this.n(param0 + 10136);
                                this.s(2);
                                if (var27 == 0) {
                                  break L56;
                                } else {
                                  break L57;
                                }
                              }
                            }
                            L59: {
                              L60: {
                                L61: {
                                  L62: {
                                    L63: {
                                      L64: {
                                        var16 = this.field_Lb;
                                        if (var16 != 0) {
                                          break L64;
                                        } else {
                                          if (var27 == 0) {
                                            break L63;
                                          } else {
                                            break L64;
                                          }
                                        }
                                      }
                                      L65: {
                                        if (var16 != 1) {
                                          break L65;
                                        } else {
                                          if (var27 == 0) {
                                            break L62;
                                          } else {
                                            break L65;
                                          }
                                        }
                                      }
                                      if ((var16 ^ -1) == -3) {
                                        break L61;
                                      } else {
                                        if ((var16 ^ -1) != -4) {
                                          break L59;
                                        } else {
                                          if (var27 == 0) {
                                            break L60;
                                          } else {
                                            break L63;
                                          }
                                        }
                                      }
                                    }
                                    mo.field_Ib = 2473480;
                                    gd.field_B = 12222482;
                                    if (var27 == 0) {
                                      break L56;
                                    } else {
                                      break L62;
                                    }
                                  }
                                  gd.field_B = 11498997;
                                  mo.field_Ib = 8165621;
                                  if (var27 == 0) {
                                    break L56;
                                  } else {
                                    break L61;
                                  }
                                }
                                mo.field_Ib = 13843485;
                                gd.field_B = 13542477;
                                if (var27 == 0) {
                                  break L56;
                                } else {
                                  break L60;
                                }
                              }
                              gd.field_B = 9796223;
                              mo.field_Ib = 16054718;
                              if (var27 == 0) {
                                break L56;
                              } else {
                                break L59;
                              }
                            }
                            gd.field_B = 3178624;
                            mo.field_Ib = 3176576;
                            break L56;
                          }
                          L66: {
                            var16 = this.field_C;
                            var17 = no.field_Hb;
                            if (var4 == 0) {
                              break L66;
                            } else {
                              if (this.field_wb) {
                                break L66;
                              } else {
                                var17 = wq.field_c;
                                break L66;
                              }
                            }
                          }
                          L67: {
                            L68: {
                              if (he.field_a) {
                                break L68;
                              } else {
                                if (this.field_xb) {
                                  break L68;
                                } else {
                                  if (var4 != 0) {
                                    break L68;
                                  } else {
                                    if ((this.field_Ib ^ -1) >= (op.field_m.field_H ^ -1)) {
                                      break L68;
                                    } else {
                                      if (op.field_m.field_H <= this.field_Ib + (-100 + this.field_y * 19 % 35)) {
                                        break L68;
                                      } else {
                                        L69: {
                                          if (this.field_tb >= this.g(param0 + 10218)) {
                                            stackOut_312_0 = 0;
                                            stackIn_313_0 = stackOut_312_0;
                                            break L69;
                                          } else {
                                            stackOut_310_0 = 1;
                                            stackIn_313_0 = stackOut_310_0;
                                            break L69;
                                          }
                                        }
                                        L70: {
                                          stackOut_313_0 = stackIn_313_0;
                                          stackIn_316_0 = stackOut_313_0;
                                          stackIn_314_0 = stackOut_313_0;
                                          if ((this.field_F ^ -1) != -4) {
                                            stackOut_316_0 = stackIn_316_0;
                                            stackOut_316_1 = 0;
                                            stackIn_317_0 = stackOut_316_0;
                                            stackIn_317_1 = stackOut_316_1;
                                            break L70;
                                          } else {
                                            stackOut_314_0 = stackIn_314_0;
                                            stackOut_314_1 = 1;
                                            stackIn_317_0 = stackOut_314_0;
                                            stackIn_317_1 = stackOut_314_1;
                                            break L70;
                                          }
                                        }
                                        if ((stackIn_317_0 ^ stackIn_317_1) == 0) {
                                          break L68;
                                        } else {
                                          L71: {
                                            if (this.field_K == 5) {
                                              break L71;
                                            } else {
                                              if (4 == this.field_K) {
                                                break L71;
                                              } else {
                                                if (6 != this.field_K) {
                                                  break L68;
                                                } else {
                                                  break L71;
                                                }
                                              }
                                            }
                                          }
                                          stackOut_327_0 = 1;
                                          stackIn_330_0 = stackOut_327_0;
                                          break L67;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_329_0 = 0;
                            stackIn_330_0 = stackOut_329_0;
                            break L67;
                          }
                          L72: {
                            L73: {
                              L74: {
                                L75: {
                                  var18 = stackIn_330_0;
                                  if (var18 != 0) {
                                    break L75;
                                  } else {
                                    discarded$1 = nk.a(var17[var16][var15], mo.field_Ib, param0 + 10391, gd.field_B);
                                    if (var27 == 0) {
                                      break L74;
                                    } else {
                                      break L75;
                                    }
                                  }
                                }
                                L76: {
                                  g.c(vb.field_b);
                                  var19 = 117;
                                  var20_ref_ja = no.field_Hb[var16][var15];
                                  var21 = 6;
                                  var22 = 3;
                                  if ((ic.field_h.length ^ -1) < (var15 ^ -1)) {
                                    var21 = ic.field_h[var15];
                                    var22 = ui.field_i[var15];
                                    break L76;
                                  } else {
                                    break L76;
                                  }
                                }
                                L77: {
                                  if (!this.m(-2)) {
                                    var22++;
                                    var21 -= 3;
                                    break L77;
                                  } else {
                                    break L77;
                                  }
                                }
                                oo.b();
                                var20_ref_ja.g(3, 3);
                                no.field_Hb[var16][var19].g(var21, var22);
                                var23 = oo.field_i;
                                var24 = 0;
                                L78: while (true) {
                                  L79: {
                                    if ((var24 ^ -1) <= (var23.length ^ -1)) {
                                      break L79;
                                    } else {
                                      var25 = var23[var24];
                                      stackOut_344_0 = var25 ^ -1;
                                      stackOut_344_1 = -1;
                                      stackIn_370_0 = stackOut_344_0;
                                      stackIn_370_1 = stackOut_344_1;
                                      stackIn_345_0 = stackOut_344_0;
                                      stackIn_345_1 = stackOut_344_1;
                                      if (var27 != 0) {
                                        break L73;
                                      } else {
                                        L80: {
                                          L81: {
                                            if (stackIn_345_0 != stackIn_345_1) {
                                              break L81;
                                            } else {
                                              if (var27 == 0) {
                                                break L80;
                                              } else {
                                                break L81;
                                              }
                                            }
                                          }
                                          L82: {
                                            if ((var25 & 65535 ^ -1) == -1) {
                                              break L82;
                                            } else {
                                              if (0 != (16711935 & var25)) {
                                                break L80;
                                              } else {
                                                var26 = var25 >> -425183832;
                                                var23[var24] = cr.b(cr.b(tq.b(65280, tq.b(255, mo.field_Ib >> 1133644488) * var26), tq.b(mo.field_Ib, 255) * var26 >> -1003267160), tq.b(16711777, (tq.b(mo.field_Ib, 16754034) >> -1959167184) * var26 << 2079136584));
                                                if (var27 == 0) {
                                                  break L80;
                                                } else {
                                                  break L82;
                                                }
                                              }
                                            }
                                          }
                                          var26 = var25 >> -1706931600;
                                          var23[var24] = cr.b(cr.b(var26 * tq.b(255, gd.field_B) >> -1733865048, tq.b(65280, var26 * (tq.b(65430, gd.field_B) >> -1696279416))), tq.b(1895890688, var26 * tq.b(255, gd.field_B >> -124998928)) << 622445480);
                                          break L80;
                                        }
                                        var24++;
                                        if (var27 == 0) {
                                          continue L78;
                                        } else {
                                          break L79;
                                        }
                                      }
                                    }
                                  }
                                  g.d();
                                  break L74;
                                }
                              }
                              L83: {
                                if (this.i((byte) 119)) {
                                  break L83;
                                } else {
                                  if (!this.field_xb) {
                                    break L72;
                                  } else {
                                    if (!this.field_nb) {
                                      break L72;
                                    } else {
                                      break L83;
                                    }
                                  }
                                }
                              }
                              g.c(vb.field_b);
                              stackOut_368_0 = 0;
                              stackOut_368_1 = 0;
                              stackIn_370_0 = stackOut_368_0;
                              stackIn_370_1 = stackOut_368_1;
                              break L73;
                            }
                            g.a(stackIn_370_0, stackIn_370_1, 54, 54, gd.field_B);
                            g.d();
                            break L72;
                          }
                          L84: {
                            L85: {
                              if (this.field_K == 21) {
                                break L85;
                              } else {
                                L86: {
                                  var19 = wf.field_m / 4 % aa.field_h.length;
                                  if (this.field_F != 3) {
                                    break L86;
                                  } else {
                                    g.a(vb.field_b);
                                    break L86;
                                  }
                                }
                                L87: {
                                  L88: {
                                    var20 = 3 + var8;
                                    if (this.field_K != 23) {
                                      break L88;
                                    } else {
                                      aa.field_h[var19].a(var7, var20);
                                      if (var27 == 0) {
                                        break L87;
                                      } else {
                                        break L88;
                                      }
                                    }
                                  }
                                  L89: {
                                    if (this.field_Nb <= 0) {
                                      break L89;
                                    } else {
                                      L90: {
                                        var21 = pn.field_c.length;
                                        var19 = -var21 + (1 + wf.field_m / 4 % (-1 + var21 * 2));
                                        if (0 > var19) {
                                          var19 = -var19;
                                          break L90;
                                        } else {
                                          break L90;
                                        }
                                      }
                                      L91: {
                                        stackOut_386_0 = pn.field_c[var19];
                                        stackOut_386_1 = var7;
                                        stackIn_389_0 = stackOut_386_0;
                                        stackIn_389_1 = stackOut_386_1;
                                        stackIn_387_0 = stackOut_386_0;
                                        stackIn_387_1 = stackOut_386_1;
                                        if (-4 != (this.field_F ^ -1)) {
                                          stackOut_389_0 = (ri) ((Object) stackIn_389_0);
                                          stackOut_389_1 = stackIn_389_1;
                                          stackOut_389_2 = 2;
                                          stackIn_390_0 = stackOut_389_0;
                                          stackIn_390_1 = stackOut_389_1;
                                          stackIn_390_2 = stackOut_389_2;
                                          break L91;
                                        } else {
                                          stackOut_387_0 = (ri) ((Object) stackIn_387_0);
                                          stackOut_387_1 = stackIn_387_1;
                                          stackOut_387_2 = -2;
                                          stackIn_390_0 = stackOut_387_0;
                                          stackIn_390_1 = stackOut_387_1;
                                          stackIn_390_2 = stackOut_387_2;
                                          break L91;
                                        }
                                      }
                                      ((ri) (Object) stackIn_390_0).a(stackIn_390_1 - -stackIn_390_2, var20 - 7);
                                      if (var27 == 0) {
                                        break L87;
                                      } else {
                                        break L89;
                                      }
                                    }
                                  }
                                  if ((this.field_ub ^ -1) >= -1) {
                                    break L87;
                                  } else {
                                    L92: {
                                      L93: {
                                        var21 = 72;
                                        if (24 > this.field_ub / 2) {
                                          break L93;
                                        } else {
                                          if ((this.field_Mb - 48 ^ -1) <= (this.field_ub ^ -1)) {
                                            break L92;
                                          } else {
                                            var21 = 48 - -((this.field_Mb + -this.field_ub) / 2);
                                            if (var27 == 0) {
                                              break L92;
                                            } else {
                                              break L93;
                                            }
                                          }
                                        }
                                      }
                                      var21 = this.field_ub / 2 + 48;
                                      break L92;
                                    }
                                    vb.field_b.a(var7 - 3 + -((var21 + -48) / 2), -var21 - -48 + -3 + var8, var21, var21, 128);
                                    break L87;
                                  }
                                }
                                L94: {
                                  L95: {
                                    if ((this.field_K ^ -1) != -34) {
                                      break L95;
                                    } else {
                                      vb.field_b.f(var13 + var7, var8 + var13, var12, var12);
                                      if (var27 == 0) {
                                        break L94;
                                      } else {
                                        break L95;
                                      }
                                    }
                                  }
                                  L96: {
                                    if ((this.field_G ^ -1) < -1) {
                                      break L96;
                                    } else {
                                      vb.field_b.g(var7 + -3, var8 + -3);
                                      if (var27 == 0) {
                                        break L94;
                                      } else {
                                        break L96;
                                      }
                                    }
                                  }
                                  vb.field_b.d(-3 + var7, var8 - 3, 142);
                                  break L94;
                                }
                                L97: {
                                  L98: {
                                    if ((this.field_K ^ -1) == -24) {
                                      break L98;
                                    } else {
                                      if ((this.field_Nb ^ -1) < -1) {
                                        break L98;
                                      } else {
                                        break L97;
                                      }
                                    }
                                  }
                                  L99: {
                                    g.c();
                                    oo.h(var7, var20 + aa.field_h[var19].field_b / 2, 640, aa.field_h[var19].field_b + var20);
                                    if (23 == this.field_K) {
                                      aa.field_h[var19].a(var7, var20);
                                      break L99;
                                    } else {
                                      break L99;
                                    }
                                  }
                                  g.b();
                                  break L97;
                                }
                                if (var27 == 0) {
                                  break L84;
                                } else {
                                  break L85;
                                }
                              }
                            }
                            vb.field_b.c(-3 + var7, -3 + var8, this.field_N);
                            break L84;
                          }
                          L100: {
                            if (!this.field_zb) {
                              break L100;
                            } else {
                              ig.field_d[0].e(1 + var7, var8 - -2, 128, 16711680);
                              if (var27 == 0) {
                                break L30;
                              } else {
                                break L100;
                              }
                            }
                          }
                          L101: {
                            if (this.field_Bb) {
                              break L101;
                            } else {
                              if (this.field_eb) {
                                ig.field_d[0].c(var7, var8 - -2, 96);
                                if (var27 == 0) {
                                  break L30;
                                } else {
                                  break L101;
                                }
                              } else {
                                break L30;
                              }
                            }
                          }
                          L102: {
                            if (param1.field_d > 1.25f) {
                              break L102;
                            } else {
                              ig.field_d[0].g(var7, var8 + 3);
                              if (0 == this.field_Kb) {
                                break L30;
                              } else {
                                qp.field_w.a((char)(48 + this.field_Kb), 1 + (var7 - (-ig.field_d[0].field_x + -9)), var8 + 7 - -ig.field_d[0].field_w + 1, 0);
                                qp.field_w.a((char)(48 - -this.field_Kb), 9 + var7 - -ig.field_d[0].field_x, 7 + (var8 - -ig.field_d[0].field_w), 16777215);
                                if (var27 == 0) {
                                  break L30;
                                } else {
                                  break L102;
                                }
                              }
                            }
                          }
                          ig.field_d[0].f(var7, var8 + 3, 1);
                          ig.field_d[0].f(var7, var8, 16777215);
                          if (0 == this.field_Kb) {
                            break L30;
                          } else {
                            pb.field_e.a((char)(this.field_Kb + 48), var7 - (-ig.field_d[0].field_x + -9) + 1, ig.field_d[0].field_w + (7 + (var8 + 1)), 0);
                            pb.field_e.a((char)(48 - -this.field_Kb), 9 + (ig.field_d[0].field_x + var7), 7 + (var8 + ig.field_d[0].field_w), 16777215);
                            break L30;
                          }
                        }
                        var11++;
                        if (var27 == 0) {
                          continue L27;
                        } else {
                          break L29;
                        }
                      }
                    }
                  }
                  break L28;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L103: {
            var3 = decompiledCaughtException;
            stackOut_456_0 = (RuntimeException) (var3);
            stackOut_456_1 = new StringBuilder().append("wb.H(").append(param0).append(',');
            stackIn_459_0 = stackOut_456_0;
            stackIn_459_1 = stackOut_456_1;
            stackIn_457_0 = stackOut_456_0;
            stackIn_457_1 = stackOut_456_1;
            if (param1 == null) {
              stackOut_459_0 = (RuntimeException) ((Object) stackIn_459_0);
              stackOut_459_1 = (StringBuilder) ((Object) stackIn_459_1);
              stackOut_459_2 = "null";
              stackIn_460_0 = stackOut_459_0;
              stackIn_460_1 = stackOut_459_1;
              stackIn_460_2 = stackOut_459_2;
              break L103;
            } else {
              stackOut_457_0 = (RuntimeException) ((Object) stackIn_457_0);
              stackOut_457_1 = (StringBuilder) ((Object) stackIn_457_1);
              stackOut_457_2 = "{...}";
              stackIn_460_0 = stackOut_457_0;
              stackIn_460_1 = stackOut_457_1;
              stackIn_460_2 = stackOut_457_2;
              break L103;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_460_0), stackIn_460_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final boolean m(int param0) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == -2) {
                break L1;
              } else {
                this.field_fb = -112;
                break L1;
              }
            }
            L2: {
              if (0 != this.field_C) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_7_0 = stackOut_4_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "wb.CA(" + param0 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final void a(boolean param0, nm param1) {
        int discarded$4 = 0;
        int discarded$5 = 0;
        int discarded$6 = 0;
        int discarded$7 = 0;
        th var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ja var10 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            var3 = this.field_gb;
            if (var3 == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                discarded$4 = param1.c(this.g(-127), -20126);
                discarded$5 = param1.d(this.h(-59), 126);
                discarded$6 = param1.c(this.field_O, -20126);
                discarded$7 = param1.d(this.field_P, 125);
                if (param0) {
                  break L1;
                } else {
                  this.field_sb = 20;
                  break L1;
                }
              }
              L2: {
                var4 = param1.c(this.field_tb, -20126);
                var5 = param1.d(this.field_Jb, 108) - 24;
                var6 = 50;
                var7 = 50;
                if (-op.field_m.field_H + this.field_Ib >= 50) {
                  break L2;
                } else {
                  L3: {
                    var6 = this.field_Ib - op.field_m.field_H;
                    if (20 > var6) {
                      var6 = 20;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var7 = var6;
                  break L2;
                }
              }
              var8 = op.field_m.field_D[this.field_Lb][0];
              var9 = op.field_m.field_D[this.field_Lb][1];
              var10 = am.a(0, var9, this.field_C, 1, var8);
              var10.c(-24 + var4, -24 + var5, var7 * 2);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var3_ref);
            stackOut_15_1 = new StringBuilder().append("wb.JB(").append(param0).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean i(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (fb.field_e != null) {
              L1: {
                var2_int = 97 % ((58 - param0) / 58);
                if ((this.field_Lb ^ -1) != (fb.field_e.field_M ^ -1)) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_7_0 = stackOut_4_0;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "wb.W(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    final int l(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        try {
          L0: {
            var2_int = -32 % ((param0 - 12) / 53);
            stackOut_0_0 = 350;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "wb.GB(" + param0 + ')');
        }
        return stackIn_1_0;
    }

    final static int h(byte param0) {
        boolean discarded$2 = false;
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == -80) {
                break L1;
              } else {
                discarded$2 = wb.k((byte) 98);
                break L1;
              }
            }
            stackOut_3_0 = rj.field_J;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "wb.DB(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final static void l(byte param0) {
        int var1_int = 0;
        Exception var1 = null;
        RuntimeException var1_ref = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            try {
              L1: {
                gj.a(6962);
                bi.field_e = true;
                cf.field_s = null;
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var1 = (Exception) (Object) decompiledCaughtException;
                var1.printStackTrace();
                break L2;
              }
            }
            var1_int = -32 / ((param0 - 51) / 48);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1_ref), "wb.DA(" + param0 + ')');
        }
    }

    wb(int param0, int param1, boolean param2) {
        this(param0, param1, param2 ? 0 : 1);
        Object stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        int stackIn_1_2 = 0;
        Object stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        Object stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        int stackOut_0_2 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        L0: {
          stackOut_0_0 = this;
          stackOut_0_1 = param0;
          stackOut_0_2 = param1;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_2_2 = stackOut_0_2;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          stackIn_1_2 = stackOut_0_2;
          if (!param2) {
            stackOut_2_0 = this;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = stackIn_2_2;
            stackOut_2_3 = 1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            stackIn_3_3 = stackOut_2_3;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = stackIn_1_2;
            stackOut_1_3 = 0;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_3_3 = stackOut_1_3;
            break L0;
          }
        }
    }

    private final void c(boolean param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                this.field_Lb = -36;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "wb.EA(" + param0 + ')');
        }
    }

    final void d(boolean param0) {
        boolean discarded$2 = false;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != this.field_jb) {
                this.field_K = 15;
                this.field_jb.a(true);
                this.field_jb = null;
                this.b(4, -27655);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (!param0) {
                break L2;
              } else {
                discarded$2 = wb.k((byte) -17);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "wb.HB(" + param0 + ')');
        }
    }

    final static boolean k(byte param0) {
        RuntimeException var1 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 > 91) {
              stackOut_3_0 = jg.field_a;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "wb.K(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(th param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              var3_int = 95 / ((36 - param1) / 40);
              if (null == param0) {
                break L1;
              } else {
                if (!param0.f(28113)) {
                  L2: {
                    this.field_Db = (qk) ((Object) param0.a((byte) -39));
                    if (this.field_Db != null) {
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  this.field_qb = 0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (runtimeException);
            stackOut_8_1 = new StringBuilder().append("wb.RB(");
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 >= 19) {
              L1: {
                if (!this.o(124)) {
                  L2: {
                    if (this.field_Cb) {
                      this.field_vb = param3 << 1225131056;
                      this.field_Ob = param2 << -1232610480;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  this.field_Jb = param3;
                  this.field_Ib = param1;
                  this.field_tb = param2;
                  this.field_gb = fb.field_e.field_u.b(this.g(126), this.field_Jb, this.h(-73), this.field_tb, 8760);
                  break L1;
                } else {
                  break L1;
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
          var5 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var5), "wb.GA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void m(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 6) {
                break L1;
              } else {
                this.e(false);
                break L1;
              }
            }
            this.b(4, param0 ^ -27649);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "wb.FB(" + param0 + ')');
        }
    }

    final void j(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -13) {
                break L1;
              } else {
                this.field_ob = 69;
                break L1;
              }
            }
            this.field_Nb = 0;
            this.field_xb = false;
            this.field_ub = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "wb.EB(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, byte param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_6_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (this.field_nb) {
                break L1;
              } else {
                L2: {
                  var5_int = 0;
                  var6 = this.field_ab % gg.field_j[var5_int];
                  var7 = op.field_m.field_h.field_j;
                  if ((var7 ^ -1) != -1) {
                    stackOut_5_0 = 6;
                    stackIn_6_0 = stackOut_5_0;
                    break L2;
                  } else {
                    stackOut_3_0 = 2;
                    stackIn_6_0 = stackOut_3_0;
                    break L2;
                  }
                }
                L3: {
                  var8 = stackIn_6_0;
                  var9 = gg.field_l[var5_int] - -var6;
                  if ((param2 ^ -1) > -257) {
                    break L3;
                  } else {
                    L4: {
                      if (this.field_F == 1) {
                        break L4;
                      } else {
                        wq.field_c[var8][var9].g(param0, param1);
                        if (var10 == 0) {
                          break L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                    wq.field_c[var8][var9].b(param0, param1);
                    if (var10 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
                wq.field_c[var8][var9].c(param0, param1, param2);
                break L1;
              }
            }
            L5: {
              if (param3 < -54) {
                break L5;
              } else {
                this.a(true, (nm) null);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) runtimeException), "wb.AA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void f(byte param0) {
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        boolean discarded$5 = false;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        th stackIn_154_0 = null;
        jj stackIn_154_1 = null;
        jj stackIn_154_2 = null;
        int stackIn_154_3 = 0;
        int stackIn_154_4 = 0;
        int stackIn_154_5 = 0;
        int stackIn_154_6 = 0;
        th stackIn_156_0 = null;
        jj stackIn_156_1 = null;
        jj stackIn_156_2 = null;
        int stackIn_156_3 = 0;
        int stackIn_156_4 = 0;
        int stackIn_156_5 = 0;
        int stackIn_156_6 = 0;
        th stackIn_158_0 = null;
        jj stackIn_158_1 = null;
        jj stackIn_158_2 = null;
        int stackIn_158_3 = 0;
        int stackIn_158_4 = 0;
        int stackIn_158_5 = 0;
        int stackIn_158_6 = 0;
        th stackIn_159_0 = null;
        jj stackIn_159_1 = null;
        jj stackIn_159_2 = null;
        int stackIn_159_3 = 0;
        int stackIn_159_4 = 0;
        int stackIn_159_5 = 0;
        int stackIn_159_6 = 0;
        int stackIn_159_7 = 0;
        Object stackIn_243_0 = null;
        Object stackIn_245_0 = null;
        Object stackIn_247_0 = null;
        Object stackIn_248_0 = null;
        int stackIn_248_1 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        th stackOut_153_0 = null;
        jj stackOut_153_1 = null;
        jj stackOut_153_2 = null;
        int stackOut_153_3 = 0;
        int stackOut_153_4 = 0;
        int stackOut_153_5 = 0;
        int stackOut_153_6 = 0;
        th stackOut_158_0 = null;
        jj stackOut_158_1 = null;
        jj stackOut_158_2 = null;
        int stackOut_158_3 = 0;
        int stackOut_158_4 = 0;
        int stackOut_158_5 = 0;
        int stackOut_158_6 = 0;
        int stackOut_158_7 = 0;
        th stackOut_154_0 = null;
        jj stackOut_154_1 = null;
        jj stackOut_154_2 = null;
        int stackOut_154_3 = 0;
        int stackOut_154_4 = 0;
        int stackOut_154_5 = 0;
        int stackOut_154_6 = 0;
        th stackOut_156_0 = null;
        jj stackOut_156_1 = null;
        jj stackOut_156_2 = null;
        int stackOut_156_3 = 0;
        int stackOut_156_4 = 0;
        int stackOut_156_5 = 0;
        int stackOut_156_6 = 0;
        int stackOut_156_7 = 0;
        Object stackOut_242_0 = null;
        Object stackOut_247_0 = null;
        int stackOut_247_1 = 0;
        Object stackOut_243_0 = null;
        Object stackOut_245_0 = null;
        int stackOut_245_1 = 0;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 < -79) {
                break L1;
              } else {
                this.a(true, (wb) null);
                break L1;
              }
            }
            L2: {
              super.f((byte) -92);
              this.c(30818, this.field_K);
              if ((this.field_K ^ -1) != -34) {
                this.field_yb = 0;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if ((this.field_ub ^ -1) < -1) {
                this.field_ub = this.field_ub - 1;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (0 >= this.field_Fb) {
                break L4;
              } else {
                this.field_Fb = this.field_Fb - 1;
                break L4;
              }
            }
            L5: {
              if (-30 == (this.field_K ^ -1)) {
                break L5;
              } else {
                this.field_Cb = false;
                break L5;
              }
            }
            L6: {
              if ((this.field_Nb ^ -1) >= -1) {
                break L6;
              } else {
                this.field_Nb = this.field_Nb - 1;
                break L6;
              }
            }
            L7: {
              L8: {
                if (-5 != (this.field_K ^ -1)) {
                  break L8;
                } else {
                  if (!this.field_xb) {
                    break L7;
                  } else {
                    if ((this.field_ab ^ -1) <= -3) {
                      break L7;
                    } else {
                      this.field_Q = this.field_Q + 3;
                      if (var3 == 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                }
              }
              L9: {
                if (-32 == (this.field_K ^ -1)) {
                  break L9;
                } else {
                  L10: {
                    if (this.field_K == 5) {
                      break L10;
                    } else {
                      L11: {
                        if (-30 != (this.field_K ^ -1)) {
                          break L11;
                        } else {
                          this.field_yb = -100;
                          if (var3 == 0) {
                            break L7;
                          } else {
                            break L11;
                          }
                        }
                      }
                      L12: {
                        if ((this.field_K ^ -1) == -34) {
                          break L12;
                        } else {
                          L13: {
                            if (6 != this.field_K) {
                              break L13;
                            } else {
                              L14: {
                                if ((this.field_sb ^ -1) < -1) {
                                  this.field_sb = this.field_sb - 1;
                                  break L14;
                                } else {
                                  break L14;
                                }
                              }
                              L15: {
                                this.i(5197);
                                if (this.k(-106)) {
                                  break L15;
                                } else {
                                  if (0 != this.field_X) {
                                    break L7;
                                  } else {
                                    if (0 == this.field_S) {
                                      break L15;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              this.b(4, -27655);
                              if (var3 == 0) {
                                break L7;
                              } else {
                                break L13;
                              }
                            }
                          }
                          L16: {
                            if (7 != this.field_K) {
                              break L16;
                            } else {
                              L17: {
                                this.i(5197);
                                if (this.field_Eb == null) {
                                  break L17;
                                } else {
                                  if (this.field_Eb.field_K == 18) {
                                    break L17;
                                  } else {
                                    if ((this.field_Eb.field_K ^ -1) == -22) {
                                      break L17;
                                    } else {
                                      if (20 == this.field_Eb.field_K) {
                                        break L17;
                                      } else {
                                        fieldTemp$3 = this.field_sb;
                                        this.field_sb = this.field_sb + 1;
                                        if (-61 > (fieldTemp$3 ^ -1)) {
                                          break L17;
                                        } else {
                                          if (-2 == (this.field_Eb.field_K ^ -1)) {
                                            break L7;
                                          } else {
                                            if (-3 != (this.field_Eb.field_K ^ -1)) {
                                              break L7;
                                            } else {
                                              break L7;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              this.field_Eb = null;
                              this.b(4, -27655);
                              if (var3 == 0) {
                                break L7;
                              } else {
                                break L16;
                              }
                            }
                          }
                          L18: {
                            if (this.field_K != 8) {
                              break L18;
                            } else {
                              L19: {
                                L20: {
                                  this.field_xb = false;
                                  if ((this.field_ab ^ -1) == -1) {
                                    break L20;
                                  } else {
                                    if (this.field_ab != 2) {
                                      break L19;
                                    } else {
                                      break L20;
                                    }
                                  }
                                }
                                if (this.field_Q != 0) {
                                  break L19;
                                } else {
                                  L21: {
                                    L22: {
                                      var2_int = 0;
                                      if (0 != hp.a((byte) -112, g.field_a, 3)) {
                                        break L22;
                                      } else {
                                        L23: {
                                          if (this.field_Eb == null) {
                                            break L23;
                                          } else {
                                            if (this.field_Eb.m(15684)) {
                                              break L23;
                                            } else {
                                              var2_int = 37 + hp.a((byte) 14, g.field_a, 3);
                                              if (var3 == 0) {
                                                break L21;
                                              } else {
                                                break L23;
                                              }
                                            }
                                          }
                                        }
                                        var2_int = 40 + hp.a((byte) -118, g.field_a, 4);
                                        if (var3 == 0) {
                                          break L21;
                                        } else {
                                          break L22;
                                        }
                                      }
                                    }
                                    var2_int = hp.a((byte) -103, g.field_a, 5) + 30;
                                    break L21;
                                  }
                                  this.field_U = qq.b(1481485697, var2_int);
                                  break L19;
                                }
                              }
                              if (this.field_lb == 30) {
                                fb.field_e.a(1, this.field_Eb.g(76), this.field_Eb.h(117));
                                if (var3 == 0) {
                                  break L7;
                                } else {
                                  break L18;
                                }
                              } else {
                                break L7;
                              }
                            }
                          }
                          L24: {
                            if ((this.field_K ^ -1) == -23) {
                              break L24;
                            } else {
                              L25: {
                                if (this.field_K != 9) {
                                  break L25;
                                } else {
                                  L26: {
                                    if ((this.field_pb ^ -1) != -1) {
                                      this.field_z = this.field_z + (this.field_pb << -911662448);
                                      break L26;
                                    } else {
                                      break L26;
                                    }
                                  }
                                  if (-6 != (this.field_ab ^ -1)) {
                                    break L7;
                                  } else {
                                    fb.field_e.a(1, this.g(124), this.h(-105));
                                    fb.field_e.a(true, (wb) (this));
                                    if (this.field_jb == null) {
                                      break L7;
                                    } else {
                                      this.field_jb.c(-24421);
                                      this.field_jb.a(true);
                                      this.field_jb = null;
                                      if (var3 == 0) {
                                        break L7;
                                      } else {
                                        break L25;
                                      }
                                    }
                                  }
                                }
                              }
                              L27: {
                                if (-13 == (this.field_K ^ -1)) {
                                  break L27;
                                } else {
                                  L28: {
                                    if ((this.field_K ^ -1) == -14) {
                                      break L28;
                                    } else {
                                      L29: {
                                        L30: {
                                          if ((this.field_K ^ -1) == -15) {
                                            break L30;
                                          } else {
                                            if (-27 != (this.field_K ^ -1)) {
                                              break L29;
                                            } else {
                                              break L30;
                                            }
                                          }
                                        }
                                        this.field_xb = false;
                                        this.field_F = 1;
                                        if (4 != this.field_ab) {
                                          break L7;
                                        } else {
                                          L31: {
                                            stackOut_153_0 = fb.field_e.field_H;
                                            stackOut_153_1 = null;
                                            stackOut_153_2 = null;
                                            stackOut_153_3 = this.g(113);
                                            stackOut_153_4 = this.h(101);
                                            stackOut_153_5 = this.field_C;
                                            stackOut_153_6 = this.field_Lb;
                                            stackIn_158_0 = stackOut_153_0;
                                            stackIn_158_1 = stackOut_153_1;
                                            stackIn_158_2 = stackOut_153_2;
                                            stackIn_158_3 = stackOut_153_3;
                                            stackIn_158_4 = stackOut_153_4;
                                            stackIn_158_5 = stackOut_153_5;
                                            stackIn_158_6 = stackOut_153_6;
                                            stackIn_154_0 = stackOut_153_0;
                                            stackIn_154_1 = stackOut_153_1;
                                            stackIn_154_2 = stackOut_153_2;
                                            stackIn_154_3 = stackOut_153_3;
                                            stackIn_154_4 = stackOut_153_4;
                                            stackIn_154_5 = stackOut_153_5;
                                            stackIn_154_6 = stackOut_153_6;
                                            if (26 != this.field_K) {
                                              stackOut_158_0 = (th) ((Object) stackIn_158_0);
                                              stackOut_158_1 = null;
                                              stackOut_158_2 = null;
                                              stackOut_158_3 = stackIn_158_3;
                                              stackOut_158_4 = stackIn_158_4;
                                              stackOut_158_5 = stackIn_158_5;
                                              stackOut_158_6 = stackIn_158_6;
                                              stackOut_158_7 = 0;
                                              stackIn_159_0 = stackOut_158_0;
                                              stackIn_159_1 = stackOut_158_1;
                                              stackIn_159_2 = stackOut_158_2;
                                              stackIn_159_3 = stackOut_158_3;
                                              stackIn_159_4 = stackOut_158_4;
                                              stackIn_159_5 = stackOut_158_5;
                                              stackIn_159_6 = stackOut_158_6;
                                              stackIn_159_7 = stackOut_158_7;
                                              break L31;
                                            } else {
                                              stackOut_154_0 = (th) ((Object) stackIn_154_0);
                                              stackOut_154_1 = null;
                                              stackOut_154_2 = null;
                                              stackOut_154_3 = stackIn_154_3;
                                              stackOut_154_4 = stackIn_154_4;
                                              stackOut_154_5 = stackIn_154_5;
                                              stackOut_154_6 = stackIn_154_6;
                                              stackIn_156_0 = stackOut_154_0;
                                              stackIn_156_1 = stackOut_154_1;
                                              stackIn_156_2 = stackOut_154_2;
                                              stackIn_156_3 = stackOut_154_3;
                                              stackIn_156_4 = stackOut_154_4;
                                              stackIn_156_5 = stackOut_154_5;
                                              stackIn_156_6 = stackOut_154_6;
                                              stackOut_156_0 = (th) ((Object) stackIn_156_0);
                                              stackOut_156_1 = null;
                                              stackOut_156_2 = null;
                                              stackOut_156_3 = stackIn_156_3;
                                              stackOut_156_4 = stackIn_156_4;
                                              stackOut_156_5 = stackIn_156_5;
                                              stackOut_156_6 = stackIn_156_6;
                                              stackOut_156_7 = 1;
                                              stackIn_159_0 = stackOut_156_0;
                                              stackIn_159_1 = stackOut_156_1;
                                              stackIn_159_2 = stackOut_156_2;
                                              stackIn_159_3 = stackOut_156_3;
                                              stackIn_159_4 = stackOut_156_4;
                                              stackIn_159_5 = stackOut_156_5;
                                              stackIn_159_6 = stackOut_156_6;
                                              stackIn_159_7 = stackOut_156_7;
                                              break L31;
                                            }
                                          }
                                          ((th) (Object) stackIn_159_0).a(new jj(stackIn_159_3, stackIn_159_4, stackIn_159_5, stackIn_159_6, stackIn_159_7 != 0), false);
                                          this.b(4, -27655);
                                          if (var3 == 0) {
                                            break L7;
                                          } else {
                                            break L29;
                                          }
                                        }
                                      }
                                      L32: {
                                        if (this.field_K != 34) {
                                          break L32;
                                        } else {
                                          if (-5 != (this.field_ab ^ -1)) {
                                            break L7;
                                          } else {
                                            L33: {
                                              this.field_Q = this.field_Q - 1;
                                              this.field_xb = false;
                                              if (this.field_jb != null) {
                                                break L33;
                                              } else {
                                                this.field_jb = new pq(this.g(-74), this.h(-61) + -30, op.field_m.a((byte) 32, this.field_Lb, 750));
                                                op.field_m.field_G.a(this.field_jb, false);
                                                if (var3 == 0) {
                                                  break L7;
                                                } else {
                                                  break L33;
                                                }
                                              }
                                            }
                                            L34: {
                                              if (this.field_jb.d(67)) {
                                                break L34;
                                              } else {
                                                L35: {
                                                  L36: {
                                                    this.i(5197);
                                                    if (this.k(-100)) {
                                                      break L36;
                                                    } else {
                                                      if (0 != this.field_X) {
                                                        break L35;
                                                      } else {
                                                        if (this.field_S == 0) {
                                                          break L36;
                                                        } else {
                                                          break L35;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  this.m((byte) 6);
                                                  break L35;
                                                }
                                                this.field_jb.a(this.h(92) + -30, this.g(71), 0);
                                                if (var3 == 0) {
                                                  break L7;
                                                } else {
                                                  break L34;
                                                }
                                              }
                                            }
                                            this.field_jb.a(true);
                                            this.field_jb = null;
                                            this.field_K = 15;
                                            this.b(4, -27655);
                                            if (var3 == 0) {
                                              break L7;
                                            } else {
                                              break L32;
                                            }
                                          }
                                        }
                                      }
                                      L37: {
                                        if (15 == this.field_K) {
                                          break L37;
                                        } else {
                                          L38: {
                                            if ((this.field_K ^ -1) != -18) {
                                              break L38;
                                            } else {
                                              L39: {
                                                if ((this.field_ab ^ -1) != -4) {
                                                  break L39;
                                                } else {
                                                  if (-1 == (this.field_Q ^ -1)) {
                                                    fb.field_e.a((byte) 126, this.g(-113), this.h(-82), this.field_Lb);
                                                    break L39;
                                                  } else {
                                                    break L39;
                                                  }
                                                }
                                              }
                                              if ((this.field_ab ^ -1) <= -6) {
                                                fb.field_e.a(true, (wb) (this));
                                                op.field_m.a(-119, (ff) (this));
                                                if (var3 == 0) {
                                                  break L7;
                                                } else {
                                                  break L38;
                                                }
                                              } else {
                                                break L7;
                                              }
                                            }
                                          }
                                          L40: {
                                            if ((this.field_K ^ -1) == -20) {
                                              break L40;
                                            } else {
                                              if ((this.field_K ^ -1) == -25) {
                                                break L40;
                                              } else {
                                                L41: {
                                                  if (-28 != (this.field_K ^ -1)) {
                                                    break L41;
                                                  } else {
                                                    L42: {
                                                      if ((gg.field_j[27] / 2 ^ -1) != (this.field_ab ^ -1)) {
                                                        break L42;
                                                      } else {
                                                        this.field_ub = 0;
                                                        this.field_xb = false;
                                                        this.field_Nb = op.field_m.a((byte) 32, this.field_Lb, 2250);
                                                        break L42;
                                                      }
                                                    }
                                                    if (gg.field_j[27] + -1 == this.field_ab) {
                                                      this.b(4, -27655);
                                                      if (var3 == 0) {
                                                        break L7;
                                                      } else {
                                                        break L41;
                                                      }
                                                    } else {
                                                      break L7;
                                                    }
                                                  }
                                                }
                                                if (this.field_K != 28) {
                                                  break L7;
                                                } else {
                                                  L43: {
                                                    if (this.field_ab == gg.field_j[28] / 2) {
                                                      this.field_xb = false;
                                                      this.field_Nb = 0;
                                                      this.field_Mb = op.field_m.a((byte) 32, this.field_Lb, 2250);
                                                      this.field_ub = this.field_Mb;
                                                      break L43;
                                                    } else {
                                                      break L43;
                                                    }
                                                  }
                                                  if (this.field_ab == -1 + gg.field_j[28]) {
                                                    this.b(4, -27655);
                                                    if (var3 == 0) {
                                                      break L7;
                                                    } else {
                                                      break L40;
                                                    }
                                                  } else {
                                                    break L7;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          if (5 != this.field_ab) {
                                            break L7;
                                          } else {
                                            L44: {
                                              stackOut_242_0 = this;
                                              stackIn_247_0 = stackOut_242_0;
                                              stackIn_243_0 = stackOut_242_0;
                                              if ((this.field_K ^ -1) != -25) {
                                                stackOut_247_0 = this;
                                                stackOut_247_1 = 0;
                                                stackIn_248_0 = stackOut_247_0;
                                                stackIn_248_1 = stackOut_247_1;
                                                break L44;
                                              } else {
                                                stackOut_243_0 = this;
                                                stackIn_245_0 = stackOut_243_0;
                                                stackOut_245_0 = this;
                                                stackOut_245_1 = 1;
                                                stackIn_248_0 = stackOut_245_0;
                                                stackIn_248_1 = stackOut_245_1;
                                                break L44;
                                              }
                                            }
                                            ((wb) (this)).field_nb = stackIn_248_1 != 0;
                                            this.field_xb = true;
                                            this.b(4, -27655);
                                            if (var3 == 0) {
                                              break L7;
                                            } else {
                                              break L37;
                                            }
                                          }
                                        }
                                      }
                                      if ((this.field_ab ^ -1) != -5) {
                                        break L7;
                                      } else {
                                        L45: {
                                          this.field_Q = this.field_Q - 1;
                                          this.field_xb = false;
                                          if (this.field_jb == null) {
                                            this.field_jb = new pq(this.g(73), this.h(-104) - 30, op.field_m.a((byte) 32, this.field_Lb, 750));
                                            op.field_m.field_G.a(this.field_jb, false);
                                            break L45;
                                          } else {
                                            break L45;
                                          }
                                        }
                                        if (this.field_jb.d(124)) {
                                          this.field_jb.a(true);
                                          this.field_jb = null;
                                          this.b(4, -27655);
                                          if (var3 == 0) {
                                            break L7;
                                          } else {
                                            break L28;
                                          }
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                  }
                                  L46: {
                                    if (this.field_xb) {
                                      this.field_ab = 2;
                                      break L46;
                                    } else {
                                      break L46;
                                    }
                                  }
                                  if (2 == this.field_ab) {
                                    this.field_ab = 0;
                                    this.field_xb = false;
                                    fb.field_e.b(this.field_Hb, 0, this.h(-71), this.g(-88));
                                    this.b(false);
                                    if (var3 == 0) {
                                      break L7;
                                    } else {
                                      break L27;
                                    }
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              this.field_xb = false;
                              this.i(5197);
                              if (var3 == 0) {
                                break L7;
                              } else {
                                break L24;
                              }
                            }
                          }
                          L47: {
                            fieldTemp$4 = this.field_lb - 1;
                            this.field_lb = this.field_lb - 1;
                            if (fieldTemp$4 > 0) {
                              break L47;
                            } else {
                              this.b(4, -27655);
                              if (var3 == 0) {
                                break L7;
                              } else {
                                break L47;
                              }
                            }
                          }
                          L48: {
                            if (this.field_z >= this.field_V) {
                              break L48;
                            } else {
                              this.field_z = this.field_z + 32768;
                              if ((this.field_V ^ -1) <= (this.field_z ^ -1)) {
                                break L48;
                              } else {
                                this.field_z = this.field_V;
                                break L48;
                              }
                            }
                          }
                          L49: {
                            if (this.field_z > this.field_V) {
                              this.field_z = this.field_z - 32768;
                              if (this.field_V > this.field_z) {
                                this.field_z = this.field_V;
                                break L49;
                              } else {
                                break L49;
                              }
                            } else {
                              break L49;
                            }
                          }
                          L50: {
                            if (this.field_E >= this.field_L) {
                              break L50;
                            } else {
                              this.field_E = this.field_E + 32768;
                              if (this.field_E > this.field_L) {
                                this.field_E = this.field_L;
                                break L50;
                              } else {
                                break L50;
                              }
                            }
                          }
                          L51: {
                            if ((this.field_E ^ -1) < (this.field_L ^ -1)) {
                              this.field_E = this.field_E - 32768;
                              if (this.field_E < this.field_L) {
                                this.field_E = this.field_L;
                                break L51;
                              } else {
                                break L51;
                              }
                            } else {
                              break L51;
                            }
                          }
                          if (-1 != (this.field_ab ^ -1)) {
                            break L7;
                          } else {
                            if ((this.field_Q ^ -1) == -1) {
                              var2_int = 30 - -hp.a((byte) 22, g.field_a, 5);
                              this.field_U = qq.b(1481485697, var2_int);
                              if (var3 == 0) {
                                break L7;
                              } else {
                                break L12;
                              }
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      L52: {
                        this.field_yb = this.field_yb + 1;
                        if ((this.field_yb ^ -1) == -1) {
                          break L52;
                        } else {
                          if (this.field_yb <= 100) {
                            break L7;
                          } else {
                            this.b(4, -27655);
                            if (var3 == 0) {
                              break L7;
                            } else {
                              break L52;
                            }
                          }
                        }
                      }
                      this.field_E = this.field_vb;
                      this.field_z = this.field_Ob;
                      if (var3 == 0) {
                        break L7;
                      } else {
                        break L10;
                      }
                    }
                  }
                  L53: {
                    if (0 < this.field_sb) {
                      this.field_sb = this.field_sb - 1;
                      break L53;
                    } else {
                      break L53;
                    }
                  }
                  L54: {
                    this.c(true);
                    this.i(5197);
                    if (!this.field_Bb) {
                      break L54;
                    } else {
                      if (this.field_qb >= 128) {
                        break L54;
                      } else {
                        this.field_qb = this.field_qb + 8;
                        break L54;
                      }
                    }
                  }
                  L55: {
                    if (this.k(-71)) {
                      break L55;
                    } else {
                      if (0 != this.field_X) {
                        break L7;
                      } else {
                        if (this.field_S != 0) {
                          break L7;
                        } else {
                          break L55;
                        }
                      }
                    }
                  }
                  this.m((byte) 6);
                  if (var3 == 0) {
                    break L7;
                  } else {
                    break L9;
                  }
                }
              }
              L56: {
                if (this.field_ab != gg.field_j[31] / 4) {
                  break L56;
                } else {
                  L57: {
                    if (!this.i((byte) -54)) {
                      break L57;
                    } else {
                      L58: {
                        if (!this.field_Bb) {
                          break L58;
                        } else {
                          this.t(16);
                          this.a(-4564);
                          break L58;
                        }
                      }
                      this.field_gb = null;
                      break L57;
                    }
                  }
                  this.field_Lb = this.field_ib;
                  break L56;
                }
              }
              if ((-1 + gg.field_j[31] ^ -1) == (this.field_ab ^ -1)) {
                this.b(4, -27655);
                break L7;
              } else {
                break L7;
              }
            }
            L59: {
              if (null == op.field_m) {
                break L59;
              } else {
                if (!op.field_m.field_c) {
                  break L59;
                } else {
                  if (this.o(109)) {
                    break L59;
                  } else {
                    L60: {
                      L61: {
                        if (-1 != ((13 * op.field_m.field_H + 17 * this.field_y) % 71 ^ -1)) {
                          break L61;
                        } else {
                          if ((this.field_K ^ -1) != -10) {
                            break L60;
                          } else {
                            break L61;
                          }
                        }
                      }
                      if (((25 * this.field_y - -(op.field_m.field_H * 37)) % 59 ^ -1) != -1) {
                        break L59;
                      } else {
                        if ((this.field_K ^ -1) == -18) {
                          break L59;
                        } else {
                          this.b(false);
                          if (var3 == 0) {
                            break L59;
                          } else {
                            break L60;
                          }
                        }
                      }
                    }
                    discarded$5 = this.n((byte) -119);
                    break L59;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "wb.N(" + param0 + ')');
        }
    }

    wb(int param0, int param1, int param2) {
        super(param0, param1, param2, 57344);
        int discarded$0 = 0;
        int discarded$1 = 0;
        this.field_qb = 0;
        this.field_Eb = null;
        this.field_wb = false;
        this.field_Kb = 0;
        this.field_ob = 0;
        this.field_yb = 0;
        this.field_xb = false;
        this.field_mb = 0;
        this.field_lb = 0;
        this.field_cb = 0;
        this.field_rb = false;
        this.field_pb = 0;
        this.field_Cb = false;
        this.field_Bb = false;
        this.field_jb = null;
        this.field_zb = false;
        this.field_Gb = false;
        try {
            this.field_X = 0;
            this.field_S = 0;
            discarded$0 = hp.a((byte) 57, g.field_a, 5);
            discarded$1 = hp.a((byte) 82, g.field_a, 120);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "wb.<init>(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean q(int param0) {
        RuntimeException var2 = null;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == -14945) {
                break L1;
              } else {
                this.field_Bb = true;
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  if (!this.field_xb) {
                    break L4;
                  } else {
                    if ((this.field_K ^ -1) == -34) {
                      break L4;
                    } else {
                      if ((this.field_K ^ -1) != -30) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                if (-10 == (this.field_K ^ -1)) {
                  break L3;
                } else {
                  stackOut_13_0 = 1;
                  stackIn_16_0 = stackOut_13_0;
                  break L2;
                }
              }
              stackOut_15_0 = 0;
              stackIn_16_0 = stackOut_15_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "wb.V(" + param0 + ')');
        }
        return stackIn_16_0 != 0;
    }

    final void a(boolean param0, wb param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                this.b(22, -27655);
                param1.b(22, -27655);
                if (this.field_z >= param1.field_z) {
                  break L2;
                } else {
                  this.field_F = 1;
                  if (!ZombieDawnMulti.field_E) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.field_F = 3;
              break L1;
            }
            L3: {
              param1.field_F = 4 + -this.field_F;
              if (!param0) {
                break L3;
              } else {
                this.field_qb = -98;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3);
            stackOut_10_1 = new StringBuilder().append("wb.FA(").append(param0).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    final void t(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 16) {
                break L1;
              } else {
                wb.l((byte) -55);
                break L1;
              }
            }
            this.field_Bb = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "wb.L(" + param0 + ')');
        }
    }

    private final void b(boolean param0) {
        int fieldTemp$2 = 0;
        RuntimeException var2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              fieldTemp$2 = this.field_ob;
              this.field_ob = this.field_ob - 1;
              if (0 < fieldTemp$2) {
                break L1;
              } else {
                if ((this.field_K ^ -1) != -10) {
                  L2: {
                    if (-9 != (this.field_K ^ -1)) {
                      break L2;
                    } else {
                      if (this.field_Eb != null) {
                        this.field_Eb.l(-95);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    if (!param0) {
                      break L3;
                    } else {
                      field_hb = (java.awt.Font) null;
                      break L3;
                    }
                  }
                  this.b(9, -27655);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "wb.J(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_Ab = 0;
    }
}
