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
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            String stackIn_11_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                try {
                  L1: {
                    if (param0 == 1) {
                      var4 = Class.forName("qn");
                      var5 = (l) (var4.newInstance());
                      var5.a(-6, param1, param3, param2);
                      stackIn_4_0 = (l) (var5);
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      stackIn_2_0 = (l) null;
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4_ref = decompiledCaughtException;
                  var5_ref = new dq();
                  ((l) ((Object) var5_ref)).a(param0 + -7, param1, param3, param2);
                  stackIn_6_0 = (dq) (var5_ref);
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
                stackIn_10_0 = (RuntimeException) (var4_ref2);

                stackIn_10_1 = new StringBuilder().append("wb.BB(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackIn_11_2 = "null";
                  break L2;
                } else {
                  stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackIn_11_2 = "{...}";
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
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              stackIn_4_0 = this;

              if ((this.field_K ^ -1) != -34) {
                stackIn_5_0 = this;
                stackIn_5_1 = 0;
                break L1;
              } else {
                stackIn_5_0 = this;
                stackIn_5_1 = 1;
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
                                              stackIn_46_0 = 0;
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
                stackIn_46_0 = 1;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
                        stackIn_19_0 = 1;
                        break L3;
                      }
                    }
                  }
                }
              }
              stackIn_19_0 = 0;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
        try {
          L0: {
            var2_int = -64 % ((-15 - param0) / 42);
            if (this.o(106)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              this.b(17, -27655);
              stackIn_6_0 = 1;
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
        int statePc = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ja var12_ref_ja = null;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var27 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    var3_int = ub.p(-124);
                    if (-1 <= (var3_int ^ -1)) {
                        statePc = 4;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    stackIn_5_0 = 1;
                    statePc = 5;
                    continue stateLoop;
                }
                case 4: {
                    stackIn_5_0 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    var4 = stackIn_5_0;
                    if (param0 == -10136) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    return;
                }
                case 7: {
                    var5 = this.field_K;
                    var6 = this.field_ab;
                    if (var4 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (-1 == (hp.a((byte) 59, g.field_a, 30) ^ -1)) {
                        statePc = 13;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_16_0 = this;
                    stackIn_14_0 = stackIn_16_0;
                    if (this.field_wb) {
                        statePc = 16;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackIn_17_0 = this;
                    stackIn_17_1 = 1;
                    statePc = 17;
                    continue stateLoop;
                }
                case 16: {
                    stackIn_17_0 = this;
                    stackIn_17_1 = 0;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    ((wb) (this)).field_wb = stackIn_17_1 != 0;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (var4 == 0) {
                        statePc = 124;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (this.field_wb) {
                        statePc = 124;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    var7 = this.field_K;
                    if (var7 != 22) {
                        statePc = 26;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (var27 == 0) {
                        statePc = 112;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (5 != var7) {
                        statePc = 32;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (var27 == 0) {
                        statePc = 113;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (-35 == (var7 ^ -1)) {
                        statePc = 113;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (var7 != 7) {
                        statePc = 41;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (var27 == 0) {
                        statePc = 113;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (-14 == (var7 ^ -1)) {
                        statePc = 114;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if ((var7 ^ -1) == -28) {
                        statePc = 114;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (14 != var7) {
                        statePc = 53;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    if (var27 == 0) {
                        statePc = 115;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    if ((var7 ^ -1) != -27) {
                        statePc = 59;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    if (var27 == 0) {
                        statePc = 115;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    if (19 == var7) {
                        statePc = 115;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    if (24 != var7) {
                        statePc = 68;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    if (var27 == 0) {
                        statePc = 115;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    if ((var7 ^ -1) != -30) {
                        statePc = 74;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    if (var27 == 0) {
                        statePc = 115;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    if (var7 == 33) {
                        statePc = 115;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    if (4 == var7) {
                        statePc = 115;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    if (var7 == 23) {
                        statePc = 116;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    if ((var7 ^ -1) != -13) {
                        statePc = 89;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    if (var27 == 0) {
                        statePc = 117;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    if (-536870913 != (var7 ^ -1)) {
                        statePc = 95;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    if (var27 == 0) {
                        statePc = 118;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    if ((var7 ^ -1) == -16) {
                        statePc = 118;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    if (var7 == 28) {
                        statePc = 118;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    if (var7 == 9) {
                        statePc = 119;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    if (17 == var7) {
                        statePc = 119;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    if (-32 == (var7 ^ -1)) {
                        statePc = 120;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 112: {
                    var5 = 30;
                    if (var27 == 0) {
                        statePc = 122;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    var5 = 1;
                    if (var27 == 0) {
                        statePc = 122;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    var5 = 30;
                    if (var27 == 0) {
                        statePc = 122;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    var5 = 0;
                    if (var27 == 0) {
                        statePc = 122;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    var5 = 25;
                    if (var27 == 0) {
                        statePc = 122;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    var5 = 2;
                    if (var27 == 0) {
                        statePc = 122;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    var5 = 16;
                    if (var27 == 0) {
                        statePc = 122;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    var5 = 32;
                    if (var27 == 0) {
                        statePc = 122;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    var5 = 3;
                    if (var27 == 0) {
                        statePc = 122;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    var5 = 0;
                    statePc = 122;
                    continue stateLoop;
                }
                case 122: {
                    if (gg.field_j[var5] > var6) {
                        statePc = 124;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    var6 = 0;
                    statePc = 124;
                    continue stateLoop;
                }
                case 124: {
                    var7 = -24 + param1.c(this.g(87), -20126);
                    var8 = -48 + param1.d(this.h(param0 + 10063), 108);
                    if (this.field_Cb) {
                        statePc = 128;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    if ((this.field_yb ^ -1) == -1) {
                        statePc = 130;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    stackIn_131_0 = 1;
                    statePc = 131;
                    continue stateLoop;
                }
                case 130: {
                    stackIn_131_0 = 0;
                    statePc = 131;
                    continue stateLoop;
                }
                case 131: {
                    var9 = stackIn_131_0;
                    var10 = 12303359;
                    if (var9 != 0) {
                        statePc = 134;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    stackIn_135_0 = 1;
                    statePc = 135;
                    continue stateLoop;
                }
                case 134: {
                    stackIn_135_0 = 0;
                    statePc = 135;
                    continue stateLoop;
                }
                case 135: {
                    var11 = stackIn_135_0;
                    statePc = 136;
                    continue stateLoop;
                }
                case 136: {
                    if (var11 >= 2) {
                        statePc = 461;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    if (var27 != 0) {
                        statePc = 461;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    if (this.field_rb) {
                        statePc = 143;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 143: {
                    if ((var11 ^ -1) == -2) {
                        statePc = 145;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    var7 = param1.c(this.g(param0 ^ 10153), param0 + -9990);
                    var8 = param1.d(this.h(102), param0 ^ -10212) + -24;
                    if (var27 == 0) {
                        statePc = 146;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    var7 = param1.c(this.field_Ob >> 2084930032, -20126);
                    var8 = -12 + param1.d(this.field_vb >> -964577424, 125);
                    statePc = 146;
                    continue stateLoop;
                }
                case 146: {
                    if (1 == ll.field_k.field_k) {
                        statePc = 154;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    if (null == this.field_kb) {
                        statePc = 152;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 152: {
                    this.field_kb = new ve(var7, var8, 8, 0.0, 8.0, 3.0, 4, 1.5, 0.99, 1);
                    statePc = 153;
                    continue stateLoop;
                }
                case 153: {
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
                    statePc = 154;
                    continue stateLoop;
                }
                case 154: {
                    if ((var11 ^ -1) != -1) {
                        statePc = 158;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    if (var27 == 0) {
                        statePc = 454;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    if (var11 == 0) {
                        statePc = 162;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    var7 = param1.c(this.g(88), -20126) + -24;
                    var8 = -48 + param1.d(this.h(param0 ^ 10225), 111);
                    statePc = 162;
                    continue stateLoop;
                }
                case 162: {
                    if ((this.field_K ^ -1) != -9) {
                        statePc = 164;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    gd.field_B = op.field_m.field_D[this.field_Lb][0];
                    mo.field_Ib = op.field_m.field_D[this.field_Lb][1];
                    this.n(0);
                    this.s(2);
                    var12_ref_ja = nk.a(ig.field_d[var6 + (gg.field_l[var5] + this.field_fb)], mo.field_Ib, 255, gd.field_B);
                    var12_ref_ja.g(var7 + this.field_mb - 3, var8 + this.field_cb - 3);
                    if (var27 == 0) {
                        statePc = 461;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 164: {
                    if (!ei.field_f) {
                        statePc = 167;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 167: {
                    if (null != this.field_U) {
                        statePc = 170;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 170: {
                    if (this.field_U.k()) {
                        statePc = 174;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    this.field_U.h(sd.b(-49, var8, var7));
                    this.field_U.f(pb.a(var8, var7, false));
                    if (var27 == 0) {
                        statePc = 176;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    this.field_U = null;
                    statePc = 176;
                    continue stateLoop;
                }
                case 176: {
                    if (io.a(var7, var8, (byte) -99, param1)) {
                        statePc = 180;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    if (var27 == 0) {
                        statePc = 461;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    if (17 == this.field_K) {
                        statePc = 193;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    if (this.field_Gb) {
                        statePc = 193;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 186: {
                    stackIn_191_0 = ig.field_d[1];
                    stackIn_187_0 = stackIn_191_0;
                    stackIn_191_1 = 12;
                    stackIn_187_1 = stackIn_191_1;
                    if (this.field_F != 3) {
                        statePc = 191;
                    } else {
                        statePc = 187;
                    }
                    continue stateLoop;
                }
                case 187: {
                    stackIn_189_0 = (ja) ((Object) stackIn_187_0);
                    stackIn_189_1 = stackIn_187_1;
                    statePc = 189;
                    continue stateLoop;
                }
                case 189: {
                    stackIn_192_0 = (ja) ((Object) stackIn_189_0);
                    stackIn_192_1 = stackIn_189_1;
                    stackIn_192_2 = var7 + -5;
                    statePc = 192;
                    continue stateLoop;
                }
                case 191: {
                    stackIn_192_0 = (ja) ((Object) stackIn_191_0);
                    stackIn_192_1 = stackIn_191_1;
                    stackIn_192_2 = var7;
                    statePc = 192;
                    continue stateLoop;
                }
                case 192: {
                    g.a(stackIn_192_0, stackIn_192_1 + stackIn_192_2, 43 + var8);
                    statePc = 193;
                    continue stateLoop;
                }
                case 193: {
                    var12 = 0;
                    var13 = 0;
                    if (this.field_Cb) {
                        statePc = 199;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 194: {
                    if (33 == this.field_K) {
                        statePc = 199;
                    } else {
                        statePc = 223;
                    }
                    continue stateLoop;
                }
                case 199: {
                    if (nk.field_h != null) {
                        statePc = 202;
                    } else {
                        statePc = 200;
                    }
                    continue stateLoop;
                }
                case 200: {
                    g.c(bb.field_n);
                    nk.field_h = new ea();
                    g.d();
                    statePc = 202;
                    continue stateLoop;
                }
                case 202: {
                    g.c(bb.field_n);
                    oo.b();
                    oo.d(oo.field_l / 2, oo.field_l / 2, oo.field_l / 2, 1);
                    if (0 < this.field_yb) {
                        statePc = 204;
                    } else {
                        statePc = 203;
                    }
                    continue stateLoop;
                }
                case 203: {
                    var14_ref_int__ = nk.a(1052800, 455739624, 8454143);
                    var15 = 1073741824 - -this.field_y - wf.field_m;
                    if (var27 == 0) {
                        statePc = 205;
                    } else {
                        statePc = 204;
                    }
                    continue stateLoop;
                }
                case 204: {
                    var14_ref_int__ = nk.a(8392720, 455739624, 16744448);
                    var15 = -this.field_y + wf.field_m;
                    statePc = 205;
                    continue stateLoop;
                }
                case 205: {
                    nk.field_h.a(2, (double)var15 / 7.0, var14_ref_int__);
                    g.d();
                    if (!this.field_Cb) {
                        statePc = 209;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 206: {
                    bb.field_n.c(var7, var8, 200);
                    if (var27 == 0) {
                        statePc = 223;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    if ((this.field_yb ^ -1) <= -1) {
                        statePc = 213;
                    } else {
                        statePc = 212;
                    }
                    continue stateLoop;
                }
                case 212: {
                    var12 = bb.field_n.field_x * -this.field_yb / 100;
                    if (var27 == 0) {
                        statePc = 219;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 213: {
                    if (this.field_yb <= 0) {
                        statePc = 217;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 216: {
                    var12 = this.field_yb * bb.field_n.field_x / 100;
                    if (var27 == 0) {
                        statePc = 219;
                    } else {
                        statePc = 217;
                    }
                    continue stateLoop;
                }
                case 217: {
                    this.field_E = this.field_vb;
                    this.field_z = this.field_Ob;
                    statePc = 219;
                    continue stateLoop;
                }
                case 219: {
                    var13 = -(var12 / 2) + 24;
                    if (-1 != (var12 ^ -1)) {
                        statePc = 222;
                    } else {
                        statePc = 223;
                    }
                    continue stateLoop;
                }
                case 222: {
                    bb.field_n.f(var7 + var13, var8 + var13, var12, var12);
                    statePc = 223;
                    continue stateLoop;
                }
                case 223: {
                    var14 = var6;
                    if (null == gg.field_i[var5]) {
                        statePc = 225;
                    } else {
                        statePc = 224;
                    }
                    continue stateLoop;
                }
                case 224: {
                    var14 = gg.field_i[var5][var6];
                    statePc = 225;
                    continue stateLoop;
                }
                case 225: {
                    var15 = var14 + gg.field_l[var5];
                    if (!this.field_xb) {
                        statePc = 244;
                    } else {
                        statePc = 226;
                    }
                    continue stateLoop;
                }
                case 226: {
                    if (!this.i((byte) 122)) {
                        statePc = 238;
                    } else {
                        statePc = 229;
                    }
                    continue stateLoop;
                }
                case 229: {
                    if (var4 != 0) {
                        statePc = 238;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 232: {
                    if (14 > var15) {
                        statePc = 237;
                    } else {
                        statePc = 244;
                    }
                    continue stateLoop;
                }
                case 237: {
                    var15 += 70;
                    if (var27 == 0) {
                        statePc = 244;
                    } else {
                        statePc = 238;
                    }
                    continue stateLoop;
                }
                case 238: {
                    if (!this.field_nb) {
                        statePc = 243;
                    } else {
                        statePc = 244;
                    }
                    continue stateLoop;
                }
                case 243: {
                    this.a(var7, var8, 256, (byte) -91);
                    if (var27 == 0) {
                        statePc = 461;
                    } else {
                        statePc = 244;
                    }
                    continue stateLoop;
                }
                case 244: {
                    if (null == fb.field_e) {
                        statePc = 256;
                    } else {
                        statePc = 247;
                    }
                    continue stateLoop;
                }
                case 247: {
                    var16 = this.field_Lb;
                    if (!this.field_xb) {
                        statePc = 255;
                    } else {
                        statePc = 248;
                    }
                    continue stateLoop;
                }
                case 248: {
                    if (!this.field_nb) {
                        statePc = 255;
                    } else {
                        statePc = 251;
                    }
                    continue stateLoop;
                }
                case 251: {
                    var16 = fb.field_e.field_M;
                    if (var16 < 0) {
                        statePc = 254;
                    } else {
                        statePc = 255;
                    }
                    continue stateLoop;
                }
                case 254: {
                    var16 = (this.field_Lb + 1) % op.field_m.field_t;
                    statePc = 255;
                    continue stateLoop;
                }
                case 255: {
                    gd.field_B = op.field_m.field_D[var16][0];
                    mo.field_Ib = op.field_m.field_D[var16][1];
                    this.n(param0 + 10136);
                    this.s(2);
                    if (var27 == 0) {
                        statePc = 289;
                    } else {
                        statePc = 256;
                    }
                    continue stateLoop;
                }
                case 256: {
                    var16 = this.field_Lb;
                    if (var16 != 0) {
                        statePc = 260;
                    } else {
                        statePc = 257;
                    }
                    continue stateLoop;
                }
                case 257: {
                    if (var27 == 0) {
                        statePc = 275;
                    } else {
                        statePc = 260;
                    }
                    continue stateLoop;
                }
                case 260: {
                    if (var16 != 1) {
                        statePc = 266;
                    } else {
                        statePc = 263;
                    }
                    continue stateLoop;
                }
                case 263: {
                    if (var27 == 0) {
                        statePc = 278;
                    } else {
                        statePc = 266;
                    }
                    continue stateLoop;
                }
                case 266: {
                    if ((var16 ^ -1) == -3) {
                        statePc = 281;
                    } else {
                        statePc = 269;
                    }
                    continue stateLoop;
                }
                case 269: {
                    if ((var16 ^ -1) != -4) {
                        statePc = 287;
                    } else {
                        statePc = 272;
                    }
                    continue stateLoop;
                }
                case 272: {
                    if (var27 == 0) {
                        statePc = 284;
                    } else {
                        statePc = 275;
                    }
                    continue stateLoop;
                }
                case 275: {
                    mo.field_Ib = 2473480;
                    gd.field_B = 12222482;
                    if (var27 == 0) {
                        statePc = 289;
                    } else {
                        statePc = 278;
                    }
                    continue stateLoop;
                }
                case 278: {
                    gd.field_B = 11498997;
                    mo.field_Ib = 8165621;
                    if (var27 == 0) {
                        statePc = 289;
                    } else {
                        statePc = 281;
                    }
                    continue stateLoop;
                }
                case 281: {
                    mo.field_Ib = 13843485;
                    gd.field_B = 13542477;
                    if (var27 == 0) {
                        statePc = 289;
                    } else {
                        statePc = 284;
                    }
                    continue stateLoop;
                }
                case 284: {
                    gd.field_B = 9796223;
                    mo.field_Ib = 16054718;
                    if (var27 == 0) {
                        statePc = 289;
                    } else {
                        statePc = 287;
                    }
                    continue stateLoop;
                }
                case 287: {
                    gd.field_B = 3178624;
                    mo.field_Ib = 3176576;
                    statePc = 289;
                    continue stateLoop;
                }
                case 289: {
                    var16 = this.field_C;
                    var17 = no.field_Hb;
                    if (var4 == 0) {
                        statePc = 294;
                    } else {
                        statePc = 290;
                    }
                    continue stateLoop;
                }
                case 290: {
                    if (this.field_wb) {
                        statePc = 294;
                    } else {
                        statePc = 293;
                    }
                    continue stateLoop;
                }
                case 293: {
                    var17 = wq.field_c;
                    statePc = 294;
                    continue stateLoop;
                }
                case 294: {
                    if (he.field_a) {
                        statePc = 329;
                    } else {
                        statePc = 295;
                    }
                    continue stateLoop;
                }
                case 295: {
                    if (this.field_xb) {
                        statePc = 329;
                    } else {
                        statePc = 298;
                    }
                    continue stateLoop;
                }
                case 298: {
                    if (var4 != 0) {
                        statePc = 329;
                    } else {
                        statePc = 301;
                    }
                    continue stateLoop;
                }
                case 301: {
                    if ((this.field_Ib ^ -1) >= (op.field_m.field_H ^ -1)) {
                        statePc = 329;
                    } else {
                        statePc = 304;
                    }
                    continue stateLoop;
                }
                case 304: {
                    if (op.field_m.field_H <= this.field_Ib + (-100 + this.field_y * 19 % 35)) {
                        statePc = 329;
                    } else {
                        statePc = 307;
                    }
                    continue stateLoop;
                }
                case 307: {
                    if (this.field_tb >= this.g(param0 + 10218)) {
                        statePc = 312;
                    } else {
                        statePc = 310;
                    }
                    continue stateLoop;
                }
                case 310: {
                    stackIn_313_0 = 1;
                    statePc = 313;
                    continue stateLoop;
                }
                case 312: {
                    stackIn_313_0 = 0;
                    statePc = 313;
                    continue stateLoop;
                }
                case 313: {
                    stackIn_316_0 = stackIn_313_0;
                    stackIn_314_0 = stackIn_316_0;
                    if ((this.field_F ^ -1) != -4) {
                        statePc = 316;
                    } else {
                        statePc = 314;
                    }
                    continue stateLoop;
                }
                case 314: {
                    stackIn_317_0 = stackIn_314_0;
                    stackIn_317_1 = 1;
                    statePc = 317;
                    continue stateLoop;
                }
                case 316: {
                    stackIn_317_0 = stackIn_316_0;
                    stackIn_317_1 = 0;
                    statePc = 317;
                    continue stateLoop;
                }
                case 317: {
                    if ((stackIn_317_0 ^ stackIn_317_1) == 0) {
                        statePc = 329;
                    } else {
                        statePc = 318;
                    }
                    continue stateLoop;
                }
                case 318: {
                    if (this.field_K == 5) {
                        statePc = 327;
                    } else {
                        statePc = 321;
                    }
                    continue stateLoop;
                }
                case 321: {
                    if (4 == this.field_K) {
                        statePc = 327;
                    } else {
                        statePc = 324;
                    }
                    continue stateLoop;
                }
                case 324: {
                    if (6 != this.field_K) {
                        statePc = 329;
                    } else {
                        statePc = 327;
                    }
                    continue stateLoop;
                }
                case 327: {
                    stackIn_330_0 = 1;
                    statePc = 330;
                    continue stateLoop;
                }
                case 329: {
                    stackIn_330_0 = 0;
                    statePc = 330;
                    continue stateLoop;
                }
                case 330: {
                    var18 = stackIn_330_0;
                    if (var18 != 0) {
                        statePc = 334;
                    } else {
                        statePc = 331;
                    }
                    continue stateLoop;
                }
                case 331: {
                    nk.a(var17[var16][var15], mo.field_Ib, param0 + 10391, gd.field_B);
                    if (var27 == 0) {
                        statePc = 361;
                    } else {
                        statePc = 334;
                    }
                    continue stateLoop;
                }
                case 334: {
                    g.c(vb.field_b);
                    var19 = 117;
                    var20_ref_ja = no.field_Hb[var16][var15];
                    var21 = 6;
                    var22 = 3;
                    if ((ic.field_h.length ^ -1) < (var15 ^ -1)) {
                        statePc = 337;
                    } else {
                        statePc = 338;
                    }
                    continue stateLoop;
                }
                case 337: {
                    var21 = ic.field_h[var15];
                    var22 = ui.field_i[var15];
                    statePc = 338;
                    continue stateLoop;
                }
                case 338: {
                    if (!this.m(-2)) {
                        statePc = 341;
                    } else {
                        statePc = 342;
                    }
                    continue stateLoop;
                }
                case 341: {
                    var22++;
                    var21 -= 3;
                    statePc = 342;
                    continue stateLoop;
                }
                case 342: {
                    oo.b();
                    var20_ref_ja.g(3, 3);
                    no.field_Hb[var16][var19].g(var21, var22);
                    var23 = oo.field_i;
                    var24 = 0;
                    statePc = 343;
                    continue stateLoop;
                }
                case 343: {
                    if ((var24 ^ -1) <= (var23.length ^ -1)) {
                        statePc = 360;
                    } else {
                        statePc = 344;
                    }
                    continue stateLoop;
                }
                case 344: {
                    var25 = var23[var24];
                    stackIn_370_0 = var25 ^ -1;
                    stackIn_345_0 = stackIn_370_0;
                    stackIn_370_1 = -1;
                    stackIn_345_1 = stackIn_370_1;
                    if (var27 != 0) {
                        statePc = 370;
                    } else {
                        statePc = 345;
                    }
                    continue stateLoop;
                }
                case 345: {
                    if (stackIn_345_0 != stackIn_345_1) {
                        statePc = 351;
                    } else {
                        statePc = 348;
                    }
                    continue stateLoop;
                }
                case 348: {
                    if (var27 == 0) {
                        statePc = 359;
                    } else {
                        statePc = 351;
                    }
                    continue stateLoop;
                }
                case 351: {
                    if ((var25 & 65535 ^ -1) == -1) {
                        statePc = 358;
                    } else {
                        statePc = 354;
                    }
                    continue stateLoop;
                }
                case 354: {
                    if (0 != (16711935 & var25)) {
                        statePc = 359;
                    } else {
                        statePc = 357;
                    }
                    continue stateLoop;
                }
                case 357: {
                    var26 = var25 >> -425183832;
                    var23[var24] = cr.b(cr.b(tq.b(65280, tq.b(255, mo.field_Ib >> 1133644488) * var26), tq.b(mo.field_Ib, 255) * var26 >> -1003267160), tq.b(16711777, (tq.b(mo.field_Ib, 16754034) >> -1959167184) * var26 << 2079136584));
                    if (var27 == 0) {
                        statePc = 359;
                    } else {
                        statePc = 358;
                    }
                    continue stateLoop;
                }
                case 358: {
                    var26 = var25 >> -1706931600;
                    var23[var24] = cr.b(cr.b(var26 * tq.b(255, gd.field_B) >> -1733865048, tq.b(65280, var26 * (tq.b(65430, gd.field_B) >> -1696279416))), tq.b(1895890688, var26 * tq.b(255, gd.field_B >> -124998928)) << 622445480);
                    statePc = 359;
                    continue stateLoop;
                }
                case 359: {
                    var24++;
                    if (var27 == 0) {
                        statePc = 343;
                    } else {
                        statePc = 360;
                    }
                    continue stateLoop;
                }
                case 360: {
                    g.d();
                    statePc = 361;
                    continue stateLoop;
                }
                case 361: {
                    if (this.i((byte) 119)) {
                        statePc = 368;
                    } else {
                        statePc = 362;
                    }
                    continue stateLoop;
                }
                case 362: {
                    if (!this.field_xb) {
                        statePc = 371;
                    } else {
                        statePc = 365;
                    }
                    continue stateLoop;
                }
                case 365: {
                    if (!this.field_nb) {
                        statePc = 371;
                    } else {
                        statePc = 368;
                    }
                    continue stateLoop;
                }
                case 368: {
                    g.c(vb.field_b);
                    stackIn_370_0 = 0;
                    stackIn_370_1 = 0;
                    statePc = 370;
                    continue stateLoop;
                }
                case 370: {
                    g.a(stackIn_370_0, stackIn_370_1, 54, 54, gd.field_B);
                    g.d();
                    statePc = 371;
                    continue stateLoop;
                }
                case 371: {
                    if (this.field_K == 21) {
                        statePc = 425;
                    } else {
                        statePc = 372;
                    }
                    continue stateLoop;
                }
                case 372: {
                    var19 = wf.field_m / 4 % aa.field_h.length;
                    if (this.field_F != 3) {
                        statePc = 375;
                    } else {
                        statePc = 373;
                    }
                    continue stateLoop;
                }
                case 373: {
                    g.a(vb.field_b);
                    statePc = 375;
                    continue stateLoop;
                }
                case 375: {
                    var20 = 3 + var8;
                    if (this.field_K != 23) {
                        statePc = 379;
                    } else {
                        statePc = 376;
                    }
                    continue stateLoop;
                }
                case 376: {
                    aa.field_h[var19].a(var7, var20);
                    if (var27 == 0) {
                        statePc = 401;
                    } else {
                        statePc = 379;
                    }
                    continue stateLoop;
                }
                case 379: {
                    if (this.field_Nb <= 0) {
                        statePc = 391;
                    } else {
                        statePc = 382;
                    }
                    continue stateLoop;
                }
                case 382: {
                    var21 = pn.field_c.length;
                    var19 = -var21 + (1 + wf.field_m / 4 % (-1 + var21 * 2));
                    if (0 > var19) {
                        statePc = 385;
                    } else {
                        statePc = 386;
                    }
                    continue stateLoop;
                }
                case 385: {
                    var19 = -var19;
                    statePc = 386;
                    continue stateLoop;
                }
                case 386: {
                    stackIn_389_0 = pn.field_c[var19];
                    stackIn_387_0 = stackIn_389_0;
                    stackIn_389_1 = var7;
                    stackIn_387_1 = stackIn_389_1;
                    if (-4 != (this.field_F ^ -1)) {
                        statePc = 389;
                    } else {
                        statePc = 387;
                    }
                    continue stateLoop;
                }
                case 387: {
                    stackIn_390_0 = (ri) ((Object) stackIn_387_0);
                    stackIn_390_1 = stackIn_387_1;
                    stackIn_390_2 = -2;
                    statePc = 390;
                    continue stateLoop;
                }
                case 389: {
                    stackIn_390_0 = (ri) ((Object) stackIn_389_0);
                    stackIn_390_1 = stackIn_389_1;
                    stackIn_390_2 = 2;
                    statePc = 390;
                    continue stateLoop;
                }
                case 390: {
                    ((ri) (Object) stackIn_390_0).a(stackIn_390_1 - -stackIn_390_2, var20 - 7);
                    if (var27 == 0) {
                        statePc = 401;
                    } else {
                        statePc = 391;
                    }
                    continue stateLoop;
                }
                case 391: {
                    if ((this.field_ub ^ -1) >= -1) {
                        statePc = 401;
                    } else {
                        statePc = 394;
                    }
                    continue stateLoop;
                }
                case 394: {
                    var21 = 72;
                    if (24 > this.field_ub / 2) {
                        statePc = 399;
                    } else {
                        statePc = 395;
                    }
                    continue stateLoop;
                }
                case 395: {
                    if ((this.field_Mb - 48 ^ -1) <= (this.field_ub ^ -1)) {
                        statePc = 400;
                    } else {
                        statePc = 398;
                    }
                    continue stateLoop;
                }
                case 398: {
                    var21 = 48 - -((this.field_Mb + -this.field_ub) / 2);
                    if (var27 == 0) {
                        statePc = 400;
                    } else {
                        statePc = 399;
                    }
                    continue stateLoop;
                }
                case 399: {
                    var21 = this.field_ub / 2 + 48;
                    statePc = 400;
                    continue stateLoop;
                }
                case 400: {
                    vb.field_b.a(var7 - 3 + -((var21 + -48) / 2), -var21 - -48 + -3 + var8, var21, var21, 128);
                    statePc = 401;
                    continue stateLoop;
                }
                case 401: {
                    if ((this.field_K ^ -1) != -34) {
                        statePc = 405;
                    } else {
                        statePc = 402;
                    }
                    continue stateLoop;
                }
                case 402: {
                    vb.field_b.f(var13 + var7, var8 + var13, var12, var12);
                    if (var27 == 0) {
                        statePc = 413;
                    } else {
                        statePc = 405;
                    }
                    continue stateLoop;
                }
                case 405: {
                    if ((this.field_G ^ -1) < -1) {
                        statePc = 411;
                    } else {
                        statePc = 408;
                    }
                    continue stateLoop;
                }
                case 408: {
                    vb.field_b.g(var7 + -3, var8 + -3);
                    if (var27 == 0) {
                        statePc = 413;
                    } else {
                        statePc = 411;
                    }
                    continue stateLoop;
                }
                case 411: {
                    vb.field_b.d(-3 + var7, var8 - 3, 142);
                    statePc = 413;
                    continue stateLoop;
                }
                case 413: {
                    if ((this.field_K ^ -1) == -24) {
                        statePc = 419;
                    } else {
                        statePc = 414;
                    }
                    continue stateLoop;
                }
                case 414: {
                    if ((this.field_Nb ^ -1) < -1) {
                        statePc = 419;
                    } else {
                        statePc = 424;
                    }
                    continue stateLoop;
                }
                case 419: {
                    g.c();
                    oo.h(var7, var20 + aa.field_h[var19].field_b / 2, 640, aa.field_h[var19].field_b + var20);
                    if (23 == this.field_K) {
                        statePc = 422;
                    } else {
                        statePc = 423;
                    }
                    continue stateLoop;
                }
                case 422: {
                    aa.field_h[var19].a(var7, var20);
                    statePc = 423;
                    continue stateLoop;
                }
                case 423: {
                    g.b();
                    statePc = 424;
                    continue stateLoop;
                }
                case 424: {
                    if (var27 == 0) {
                        statePc = 427;
                    } else {
                        statePc = 425;
                    }
                    continue stateLoop;
                }
                case 425: {
                    vb.field_b.c(-3 + var7, -3 + var8, this.field_N);
                    statePc = 427;
                    continue stateLoop;
                }
                case 427: {
                    if (!this.field_zb) {
                        statePc = 431;
                    } else {
                        statePc = 428;
                    }
                    continue stateLoop;
                }
                case 428: {
                    ig.field_d[0].e(1 + var7, var8 - -2, 128, 16711680);
                    if (var27 == 0) {
                        statePc = 454;
                    } else {
                        statePc = 431;
                    }
                    continue stateLoop;
                }
                case 431: {
                    if (this.field_Bb) {
                        statePc = 440;
                    } else {
                        statePc = 434;
                    }
                    continue stateLoop;
                }
                case 434: {
                    if (this.field_eb) {
                        statePc = 439;
                    } else {
                        statePc = 454;
                    }
                    continue stateLoop;
                }
                case 439: {
                    ig.field_d[0].c(var7, var8 - -2, 96);
                    if (var27 == 0) {
                        statePc = 454;
                    } else {
                        statePc = 440;
                    }
                    continue stateLoop;
                }
                case 440: {
                    if (param1.field_d > 1.25f) {
                        statePc = 449;
                    } else {
                        statePc = 443;
                    }
                    continue stateLoop;
                }
                case 443: {
                    ig.field_d[0].g(var7, var8 + 3);
                    if (0 == this.field_Kb) {
                        statePc = 454;
                    } else {
                        statePc = 446;
                    }
                    continue stateLoop;
                }
                case 446: {
                    qp.field_w.a((char)(48 + this.field_Kb), 1 + (var7 - (-ig.field_d[0].field_x + -9)), var8 + 7 - -ig.field_d[0].field_w + 1, 0);
                    qp.field_w.a((char)(48 - -this.field_Kb), 9 + var7 - -ig.field_d[0].field_x, 7 + (var8 - -ig.field_d[0].field_w), 16777215);
                    if (var27 == 0) {
                        statePc = 454;
                    } else {
                        statePc = 449;
                    }
                    continue stateLoop;
                }
                case 449: {
                    ig.field_d[0].f(var7, var8 + 3, 1);
                    ig.field_d[0].f(var7, var8, 16777215);
                    if (0 == this.field_Kb) {
                        statePc = 454;
                    } else {
                        statePc = 452;
                    }
                    continue stateLoop;
                }
                case 452: {
                    pb.field_e.a((char)(this.field_Kb + 48), var7 - (-ig.field_d[0].field_x + -9) + 1, ig.field_d[0].field_w + (7 + (var8 + 1)), 0);
                    pb.field_e.a((char)(48 - -this.field_Kb), 9 + (ig.field_d[0].field_x + var7), 7 + (var8 + ig.field_d[0].field_w), 16777215);
                    statePc = 454;
                    continue stateLoop;
                }
                case 454: {
                    var11++;
                    if (var27 == 0) {
                        statePc = 136;
                    } else {
                        statePc = 461;
                    }
                    continue stateLoop;
                }
                case 461: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final boolean m(int param0) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                stackIn_7_0 = 0;
                break L2;
              } else {
                stackIn_7_0 = 1;
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
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        th var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ja var10 = null;
        try {
          L0: {
            var3 = this.field_gb;
            if (var3 == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                param1.c(this.g(-127), -20126);
                param1.d(this.h(-59), 126);
                param1.c(this.field_O, -20126);
                param1.d(this.field_P, 125);
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
            stackIn_18_0 = (RuntimeException) (var3_ref);

            stackIn_18_1 = new StringBuilder().append("wb.JB(").append(param0).append(',');

            if (param1 == null) {
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
        try {
          L0: {
            if (fb.field_e != null) {
              L1: {
                var2_int = 97 % ((58 - param0) / 58);
                if ((this.field_Lb ^ -1) != (fb.field_e.field_M ^ -1)) {
                  stackIn_7_0 = 0;
                  break L1;
                } else {
                  stackIn_7_0 = 1;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
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
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          L0: {
            var2_int = -32 % ((param0 - 12) / 53);
            stackIn_1_0 = 350;
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
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -80) {
                break L1;
              } else {
                wb.k((byte) 98);
                break L1;
              }
            }
            stackIn_4_0 = rj.field_J;
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
        Throwable decompiledCaughtException = null;
        Exception var1 = null;
        RuntimeException var1_ref = null;
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
        Object stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        L0: {
          stackIn_2_0 = this;

          stackIn_2_1 = param0;

          stackIn_2_2 = param1;

          if (!param2) {
            stackIn_3_0 = this;
            stackIn_3_1 = stackIn_2_1;
            stackIn_3_2 = stackIn_2_2;
            stackIn_3_3 = 1;
            break L0;
          } else {
            stackIn_3_0 = this;
            stackIn_3_1 = stackIn_2_1;
            stackIn_3_2 = stackIn_2_2;
            stackIn_3_3 = 0;
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
                wb.k((byte) -17);
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
        try {
          L0: {
            if (param0 > 91) {
              stackIn_4_0 = jg.field_a;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
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
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_11_0 = (RuntimeException) (runtimeException);

            stackIn_11_1 = new StringBuilder().append("wb.RB(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
                    stackIn_6_0 = 6;
                    break L2;
                  } else {
                    stackIn_6_0 = 2;
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
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        boolean discarded$2 = false;
        th stackIn_158_0;
        jj stackIn_158_1;
        jj stackIn_158_2;
        int stackIn_158_3;
        int stackIn_158_4;
        int stackIn_158_5;
        int stackIn_158_6;
        th stackIn_159_0 = null;
        jj stackIn_159_1 = null;
        jj stackIn_159_2 = null;
        int stackIn_159_3 = 0;
        int stackIn_159_4 = 0;
        int stackIn_159_5 = 0;
        int stackIn_159_6 = 0;
        int stackIn_159_7 = 0;
        Object stackIn_245_0 = null;
        Object stackIn_247_0 = null;
        Object stackIn_248_0 = null;
        int stackIn_248_1 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
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
                                        fieldTemp$0 = this.field_sb;
                                        this.field_sb = this.field_sb + 1;
                                        if (-61 > (fieldTemp$0 ^ -1)) {
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
                                            stackIn_158_0 = fb.field_e.field_H;

                                            stackIn_158_1 = null;

                                            stackIn_158_2 = null;

                                            stackIn_158_3 = this.g(113);

                                            stackIn_158_4 = this.h(101);

                                            stackIn_158_5 = this.field_C;

                                            stackIn_158_6 = this.field_Lb;

                                            if (26 != this.field_K) {
                                              stackIn_159_0 = (th) ((Object) stackIn_158_0);
                                              stackIn_159_1 = null;
                                              stackIn_159_2 = null;
                                              stackIn_159_3 = stackIn_158_3;
                                              stackIn_159_4 = stackIn_158_4;
                                              stackIn_159_5 = stackIn_158_5;
                                              stackIn_159_6 = stackIn_158_6;
                                              stackIn_159_7 = 0;
                                              break L31;
                                            } else {







                                              stackIn_159_0 = (th) ((Object) stackIn_158_0);
                                              stackIn_159_1 = null;
                                              stackIn_159_2 = null;
                                              stackIn_159_3 = stackIn_158_3;
                                              stackIn_159_4 = stackIn_158_4;
                                              stackIn_159_5 = stackIn_158_5;
                                              stackIn_159_6 = stackIn_158_6;
                                              stackIn_159_7 = 1;
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
                                              stackIn_247_0 = this;

                                              if ((this.field_K ^ -1) != -25) {
                                                stackIn_248_0 = this;
                                                stackIn_248_1 = 0;
                                                break L44;
                                              } else {
                                                stackIn_245_0 = this;
                                                stackIn_248_0 = this;
                                                stackIn_248_1 = 1;
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
                            fieldTemp$1 = this.field_lb - 1;
                            this.field_lb = this.field_lb - 1;
                            if (fieldTemp$1 > 0) {
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
                    discarded$2 = this.n((byte) -119);
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
            hp.a((byte) 57, g.field_a, 5);
            hp.a((byte) 82, g.field_a, 120);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "wb.<init>(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean q(int param0) {
        RuntimeException var2 = null;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                  stackIn_16_0 = 1;
                  break L2;
                }
              }
              stackIn_16_0 = 0;
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
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
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
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("wb.FA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    final void t(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
        int fieldTemp$1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              fieldTemp$1 = this.field_ob;
              this.field_ob = this.field_ob - 1;
              if (0 < fieldTemp$1) {
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
