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
                  ((wb) this).field_U = qq.b(1481485697, 72 + hp.a((byte) -68, g.field_a, 2));
                  if (!ZombieDawnMulti.field_E) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              ((wb) this).field_U = qq.b(1481485697, 70 + hp.a((byte) -90, g.field_a, 2));
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "wb.BA(" + param0 + 41);
        }
    }

    final static l a(int param0, java.awt.Component param1, int param2, int param3) {
        try {
            Throwable var4 = null;
            RuntimeException var4_ref = null;
            Class var4_ref2 = null;
            dq var5 = null;
            l var5_ref = null;
            l stackIn_4_0 = null;
            dq stackIn_6_0 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            String stackIn_11_2 = null;
            Throwable decompiledCaughtException = null;
            l stackOut_3_0 = null;
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
              try {
                var4_ref2 = Class.forName("qn");
                var5_ref = (l) var4_ref2.newInstance();
                var5_ref.a(-6, param1, param3, param2);
                stackOut_3_0 = (l) var5_ref;
                stackIn_4_0 = stackOut_3_0;
                return stackIn_4_0;
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = decompiledCaughtException;
                var5 = new dq();
                ((l) (Object) var5).a(-6, param1, param3, param2);
                stackOut_5_0 = (dq) var5;
                stackIn_6_0 = stackOut_5_0;
                return (l) (Object) stackIn_6_0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L0: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_7_0 = (RuntimeException) var4_ref;
                stackOut_7_1 = new StringBuilder().append("wb.BB(").append(1).append(44);
                stackIn_10_0 = stackOut_7_0;
                stackIn_10_1 = stackOut_7_1;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                if (param1 == null) {
                  stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                  stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                  stackOut_10_2 = "null";
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  stackIn_11_2 = stackOut_10_2;
                  break L0;
                } else {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "{...}";
                  stackIn_11_0 = stackOut_8_0;
                  stackIn_11_1 = stackOut_8_1;
                  stackIn_11_2 = stackOut_8_2;
                  break L0;
                }
              }
              throw fa.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param2 + 44 + param3 + 41);
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
              if (((wb) this).field_K != 33) {
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
            ((wb) this).field_rb = stackIn_5_1 != 0;
            if (((wb) this).field_K == 9) {
              return;
            } else {
              L2: {
                if (34 != ((wb) this).field_K) {
                  break L2;
                } else {
                  if (param0 == 9) {
                    break L2;
                  } else {
                    if (param0 == 21) {
                      break L2;
                    } else {
                      return;
                    }
                  }
                }
              }
              L3: {
                if (null == ((wb) this).field_jb) {
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
                  ((wb) this).field_jb.c(-24421);
                  break L3;
                }
              }
              L5: {
                L6: {
                  super.b(param0, param1);
                  if (((wb) this).field_K != 21) {
                    break L6;
                  } else {
                    ((wb) this).field_Bb = false;
                    if (var5 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                if (((wb) this).field_K == 23) {
                  break L5;
                } else {
                  L7: {
                    if (4 == ((wb) this).field_K) {
                      break L7;
                    } else {
                      L8: {
                        if (((wb) this).field_K == 7) {
                          break L8;
                        } else {
                          L9: {
                            if (((wb) this).field_K != 9) {
                              break L9;
                            } else {
                              ((wb) this).field_U = nm.b(-126, 66);
                              if (var5 == 0) {
                                break L5;
                              } else {
                                break L9;
                              }
                            }
                          }
                          L10: {
                            if (((wb) this).field_K == 27) {
                              break L10;
                            } else {
                              if (((wb) this).field_K == 28) {
                                break L10;
                              } else {
                                if (19 == ((wb) this).field_K) {
                                  break L10;
                                } else {
                                  if (((wb) this).field_K == 24) {
                                    break L10;
                                  } else {
                                    L11: {
                                      if (((wb) this).field_K != 29) {
                                        break L11;
                                      } else {
                                        ((wb) this).field_Cb = true;
                                        ((wb) this).field_yb = 0;
                                        ((wb) this).field_Ob = -65536000;
                                        ((wb) this).field_vb = -65536000;
                                        if (var5 == 0) {
                                          break L5;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                    L12: {
                                      if (((wb) this).field_K != 33) {
                                        break L12;
                                      } else {
                                        ((wb) this).field_rb = true;
                                        ((wb) this).field_yb = -100;
                                        if (var5 == 0) {
                                          break L5;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                    L13: {
                                      if (((wb) this).field_K != 22) {
                                        break L13;
                                      } else {
                                        ((wb) this).field_lb = 70;
                                        if (var5 == 0) {
                                          break L5;
                                        } else {
                                          break L13;
                                        }
                                      }
                                    }
                                    if (((wb) this).field_K != 8) {
                                      break L5;
                                    } else {
                                      if (((wb) this).field_Eb == null) {
                                        break L5;
                                      } else {
                                        var3_int = (((wb) this).field_Eb.g(-97) + -((wb) this).g(-47)) / 2;
                                        var4 = (((wb) this).field_Eb.h(123) + -((wb) this).h(-99)) / 2;
                                        ((wb) this).field_Eb.n(20);
                                        ((wb) this).field_cb = var4;
                                        ((wb) this).field_mb = var3_int;
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
                          ((wb) this).field_xb = false;
                          ((wb) this).field_Nb = 0;
                          ((wb) this).field_ub = 0;
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
                          ((wb) this).field_U = qq.b(1481485697, 25);
                          if (var5 == 0) {
                            break L5;
                          } else {
                            break L14;
                          }
                        }
                      }
                      ((wb) this).field_U = qq.b(1481485697, 15);
                      if (var5 == 0) {
                        break L5;
                      } else {
                        break L7;
                      }
                    }
                  }
                  ((wb) this).field_S = 0;
                  ((wb) this).field_X = 0;
                  if (null != ((wb) this).field_gb) {
                    var3_int = ((wb) this).field_tb + -((wb) this).g(-99);
                    var4 = ((wb) this).field_Jb + -((wb) this).h(-56);
                    if (var3_int * var3_int + var4 * var4 < 400) {
                      ((wb) this).field_gb = null;
                      break L5;
                    } else {
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var3, "wb.T(" + param0 + 44 + param1 + 41);
        }
    }

    public static void o() {
        try {
            field_hb = null;
            int var1_int = 0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "wb.AB(" + -45 + 41);
        }
    }

    final boolean o(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_46_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_45_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 > 86) {
              L1: {
                L2: {
                  if (((wb) this).field_K == 8) {
                    break L2;
                  } else {
                    if (21 == ((wb) this).field_K) {
                      break L2;
                    } else {
                      if (((wb) this).field_K == 9) {
                        break L2;
                      } else {
                        if (((wb) this).field_K == 12) {
                          break L2;
                        } else {
                          if (((wb) this).field_K == 7) {
                            break L2;
                          } else {
                            if (((wb) this).field_K == 13) {
                              break L2;
                            } else {
                              if (((wb) this).field_K == 14) {
                                break L2;
                              } else {
                                if (((wb) this).field_K == 26) {
                                  break L2;
                                } else {
                                  if (((wb) this).field_K == 27) {
                                    break L2;
                                  } else {
                                    if (((wb) this).field_K == 15) {
                                      break L2;
                                    } else {
                                      if (((wb) this).field_K == 17) {
                                        break L2;
                                      } else {
                                        if (28 == ((wb) this).field_K) {
                                          break L2;
                                        } else {
                                          if (24 == ((wb) this).field_K) {
                                            break L2;
                                          } else {
                                            if (19 != ((wb) this).field_K) {
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
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "wb.U(" + param0 + 41);
        }
        return stackIn_46_0 != 0;
    }

    final void e(boolean param0) {
        try {
            ((wb) this).field_Fb = 250;
            if (param0) {
                ((wb) this).a(87, (nm) null);
            }
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "wb.I(" + param0 + 41);
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
                ((wb) this).field_kb = null;
                break L1;
              }
            }
            L2: {
              if (!((wb) this).field_xb) {
                break L2;
              } else {
                if (!((wb) this).field_nb) {
                  break L2;
                } else {
                  if (~((wb) this).field_Lb != ~fb.field_e.field_M) {
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
          throw fa.a((Throwable) (Object) var2, "wb.KB(" + param0 + 41);
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
                var6_int = 24 + (((wb) this).field_z >> 16);
                var7 = var6_int - param3;
                var8 = ((wb) this).field_E >> 16;
                var9 = var8 + -48;
                if (param0 >= var6_int) {
                  break L4;
                } else {
                  if (~param4 >= ~var7) {
                    break L4;
                  } else {
                    if (~var8 >= ~param2) {
                      break L4;
                    } else {
                      if (~param1 >= ~var9) {
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
          throw fa.a((Throwable) (Object) var6, "wb.IB(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
        return stackIn_19_0 != 0;
    }

    final void r(int param0) {
        try {
            ((wb) this).field_Bb = true;
            ((wb) this).field_qb = param0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "wb.SB(" + param0 + 41);
        }
    }

    private final void s() {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (0 >= ((wb) this).field_Fb) {
                break L1;
              } else {
                var2_int = ((wb) this).field_Fb / 2;
                var2_int = (int)(128.0 * Math.sin((double)var2_int / 10.0 * (1.0 + (double)var2_int / 33.3)));
                var2_int = var2_int + ((wb) this).field_Fb / 250;
                if (var2_int >= 0) {
                  gd.field_B = 13421772;
                  mo.field_Ib = 13421772;
                  break L1;
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "wb.M(" + 2 + 41);
        }
    }

    private final boolean n() {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        try {
          L0: {
            var2_int = 0;
            if (((wb) this).o(106)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              ((wb) this).b(17, -27655);
              stackOut_5_0 = 1;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "wb.CB(" + -119 + 41);
        }
        return stackIn_6_0 != 0;
    }

    final void a(int param0, nm param1) {
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
        int stackIn_3_0 = 0;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_93_0 = 0;
        int stackIn_96_0 = 0;
        ja stackIn_135_0 = null;
        int stackIn_135_1 = 0;
        ja stackIn_136_0 = null;
        int stackIn_136_1 = 0;
        ja stackIn_137_0 = null;
        int stackIn_137_1 = 0;
        ja stackIn_138_0 = null;
        int stackIn_138_1 = 0;
        int stackIn_138_2 = 0;
        int stackIn_224_0 = 0;
        int stackIn_225_0 = 0;
        int stackIn_226_0 = 0;
        int stackIn_227_0 = 0;
        int stackIn_227_1 = 0;
        int stackIn_236_0 = 0;
        int stackIn_248_0 = 0;
        int stackIn_248_1 = 0;
        int stackIn_266_0 = 0;
        int stackIn_266_1 = 0;
        ri stackIn_279_0 = null;
        int stackIn_279_1 = 0;
        ri stackIn_280_0 = null;
        int stackIn_280_1 = 0;
        ri stackIn_281_0 = null;
        int stackIn_281_1 = 0;
        int stackIn_281_2 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        Object stackOut_9_0 = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_92_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_94_0 = 0;
        ja stackOut_134_0 = null;
        int stackOut_134_1 = 0;
        ja stackOut_137_0 = null;
        int stackOut_137_1 = 0;
        int stackOut_137_2 = 0;
        ja stackOut_135_0 = null;
        int stackOut_135_1 = 0;
        ja stackOut_136_0 = null;
        int stackOut_136_1 = 0;
        int stackOut_136_2 = 0;
        int stackOut_223_0 = 0;
        int stackOut_222_0 = 0;
        int stackOut_224_0 = 0;
        int stackOut_226_0 = 0;
        int stackOut_226_1 = 0;
        int stackOut_225_0 = 0;
        int stackOut_225_1 = 0;
        int stackOut_234_0 = 0;
        int stackOut_235_0 = 0;
        int stackOut_247_0 = 0;
        int stackOut_247_1 = 0;
        int stackOut_265_0 = 0;
        int stackOut_265_1 = 0;
        ri stackOut_278_0 = null;
        int stackOut_278_1 = 0;
        ri stackOut_280_0 = null;
        int stackOut_280_1 = 0;
        int stackOut_280_2 = 0;
        ri stackOut_279_0 = null;
        int stackOut_279_1 = 0;
        int stackOut_279_2 = 0;
        L0: {
          var27 = ZombieDawnMulti.field_E ? 1 : 0;
          var3_int = ub.p(-124);
          if (var3_int <= 0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var4 = stackIn_3_0;
        if (param0 == -10136) {
          L1: {
            var5 = ((wb) this).field_K;
            var6 = ((wb) this).field_ab;
            if (var4 == 0) {
              break L1;
            } else {
              if (hp.a((byte) 59, g.field_a, 30) == 0) {
                L2: {
                  stackOut_9_0 = this;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_10_0 = stackOut_9_0;
                  if (((wb) this).field_wb) {
                    stackOut_11_0 = this;
                    stackOut_11_1 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    break L2;
                  } else {
                    stackOut_10_0 = this;
                    stackOut_10_1 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    break L2;
                  }
                }
                ((wb) this).field_wb = stackIn_12_1 != 0;
                break L1;
              } else {
                break L1;
              }
            }
          }
          L3: {
            if (var4 == 0) {
              break L3;
            } else {
              if (((wb) this).field_wb) {
                break L3;
              } else {
                L4: {
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
                                      var7 = ((wb) this).field_K;
                                      if (var7 != 22) {
                                        break L14;
                                      } else {
                                        if (var27 == 0) {
                                          var5 = 30;
                                          if (var27 == 0) {
                                            break L4;
                                          } else {
                                            break L13;
                                          }
                                        } else {
                                          break L14;
                                        }
                                      }
                                    }
                                    L15: {
                                      if (5 != var7) {
                                        break L15;
                                      } else {
                                        if (var27 == 0) {
                                          break L13;
                                        } else {
                                          break L15;
                                        }
                                      }
                                    }
                                    if (var7 == 34) {
                                      break L13;
                                    } else {
                                      L16: {
                                        if (var7 != 7) {
                                          break L16;
                                        } else {
                                          if (var27 == 0) {
                                            break L13;
                                          } else {
                                            break L16;
                                          }
                                        }
                                      }
                                      if (var7 == 13) {
                                        break L12;
                                      } else {
                                        if (var7 == 27) {
                                          break L12;
                                        } else {
                                          L17: {
                                            if (14 != var7) {
                                              break L17;
                                            } else {
                                              if (var27 == 0) {
                                                break L11;
                                              } else {
                                                break L17;
                                              }
                                            }
                                          }
                                          L18: {
                                            if (var7 != 26) {
                                              break L18;
                                            } else {
                                              if (var27 == 0) {
                                                break L11;
                                              } else {
                                                break L18;
                                              }
                                            }
                                          }
                                          if (19 == var7) {
                                            break L11;
                                          } else {
                                            L19: {
                                              if (24 != var7) {
                                                break L19;
                                              } else {
                                                if (var27 == 0) {
                                                  break L11;
                                                } else {
                                                  break L19;
                                                }
                                              }
                                            }
                                            L20: {
                                              if (var7 != 29) {
                                                break L20;
                                              } else {
                                                if (var27 == 0) {
                                                  break L11;
                                                } else {
                                                  break L20;
                                                }
                                              }
                                            }
                                            if (var7 == 33) {
                                              break L11;
                                            } else {
                                              if (4 == var7) {
                                                break L11;
                                              } else {
                                                if (var7 == 23) {
                                                  break L10;
                                                } else {
                                                  L21: {
                                                    if (var7 != 12) {
                                                      break L21;
                                                    } else {
                                                      if (var27 == 0) {
                                                        break L9;
                                                      } else {
                                                        break L21;
                                                      }
                                                    }
                                                  }
                                                  L22: {
                                                    if (var7 != 536870912) {
                                                      break L22;
                                                    } else {
                                                      if (var27 == 0) {
                                                        break L8;
                                                      } else {
                                                        break L22;
                                                      }
                                                    }
                                                  }
                                                  if (var7 == 15) {
                                                    break L8;
                                                  } else {
                                                    if (var7 == 28) {
                                                      break L8;
                                                    } else {
                                                      if (var7 == 9) {
                                                        break L7;
                                                      } else {
                                                        if (17 == var7) {
                                                          break L7;
                                                        } else {
                                                          if (var7 == 31) {
                                                            break L6;
                                                          } else {
                                                            break L5;
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
                                    break L4;
                                  } else {
                                    break L12;
                                  }
                                }
                                var5 = 30;
                                if (var27 == 0) {
                                  break L4;
                                } else {
                                  break L11;
                                }
                              }
                              var5 = 0;
                              if (var27 == 0) {
                                break L4;
                              } else {
                                break L10;
                              }
                            }
                            var5 = 25;
                            if (var27 == 0) {
                              break L4;
                            } else {
                              break L9;
                            }
                          }
                          var5 = 2;
                          if (var27 == 0) {
                            break L4;
                          } else {
                            break L8;
                          }
                        }
                        var5 = 16;
                        if (var27 == 0) {
                          break L4;
                        } else {
                          break L7;
                        }
                      }
                      var5 = 32;
                      if (var27 == 0) {
                        break L4;
                      } else {
                        break L6;
                      }
                    }
                    var5 = 3;
                    if (var27 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                  var5 = 0;
                  break L4;
                }
                if (gg.field_j[var5] > var6) {
                  break L3;
                } else {
                  var6 = 0;
                  break L3;
                }
              }
            }
          }
          L23: {
            L24: {
              var7 = -24 + param1.c(((wb) this).g(87), -20126);
              var8 = -48 + param1.d(((wb) this).h(param0 + 10063), 108);
              if (((wb) this).field_Cb) {
                break L24;
              } else {
                if (((wb) this).field_yb == 0) {
                  stackOut_92_0 = 0;
                  stackIn_93_0 = stackOut_92_0;
                  break L23;
                } else {
                  break L24;
                }
              }
            }
            stackOut_91_0 = 1;
            stackIn_93_0 = stackOut_91_0;
            break L23;
          }
          L25: {
            var9 = stackIn_93_0;
            var10 = 12303359;
            if (var9 != 0) {
              stackOut_95_0 = 0;
              stackIn_96_0 = stackOut_95_0;
              break L25;
            } else {
              stackOut_94_0 = 1;
              stackIn_96_0 = stackOut_94_0;
              break L25;
            }
          }
          var11 = stackIn_96_0;
          L26: while (true) {
            L27: {
              L28: {
                if (var11 >= 2) {
                  break L28;
                } else {
                  if (var27 != 0) {
                    break L27;
                  } else {
                    L29: {
                      L30: {
                        if (((wb) this).field_rb) {
                          L31: {
                            L32: {
                              if (var11 == 1) {
                                break L32;
                              } else {
                                var7 = param1.c(((wb) this).g(param0 ^ 10153), param0 + -9990);
                                var8 = param1.d(((wb) this).h(102), param0 ^ -10212) + -24;
                                if (var27 == 0) {
                                  break L31;
                                } else {
                                  break L32;
                                }
                              }
                            }
                            var7 = param1.c(((wb) this).field_Ob >> 16, -20126);
                            var8 = -12 + param1.d(((wb) this).field_vb >> 16, 125);
                            break L31;
                          }
                          L33: {
                            if (1 == ll.field_k.field_k) {
                              break L33;
                            } else {
                              L34: {
                                if (null == ((wb) this).field_kb) {
                                  ((wb) this).field_kb = new ve(var7, var8, 8, 0.0, 8.0, 3.0, 4, 1.5, 0.99, 1);
                                  break L34;
                                } else {
                                  break L34;
                                }
                              }
                              ((wb) this).field_kb.field_k = 13 * var7 + (wf.field_m - -(79 * var8));
                              var12 = 200;
                              var13 = 128 * var12;
                              var14 = var12 * 64;
                              var13 = var13 >> 8;
                              var15 = 255 * var12;
                              var14 = var14 >> 8;
                              var14 = var14 << 8;
                              var13 = var13 << 16;
                              var15 = var15 >> 8;
                              ((wb) this).field_kb.a(var13 | var14 | var15, var7, true, var8, var10, -1963);
                              break L33;
                            }
                          }
                          if (var11 != 0) {
                            break L30;
                          } else {
                            if (var27 == 0) {
                              break L29;
                            } else {
                              break L30;
                            }
                          }
                        } else {
                          break L30;
                        }
                      }
                      L35: {
                        if (var11 == 0) {
                          break L35;
                        } else {
                          var7 = param1.c(((wb) this).g(88), -20126) + -24;
                          var8 = -48 + param1.d(((wb) this).h(param0 ^ 10225), 111);
                          break L35;
                        }
                      }
                      L36: {
                        if (((wb) this).field_K != 8) {
                          break L36;
                        } else {
                          gd.field_B = op.field_m.field_D[((wb) this).field_Lb][0];
                          mo.field_Ib = op.field_m.field_D[((wb) this).field_Lb][1];
                          this.n(0);
                          int discarded$4 = 2;
                          this.s();
                          var12_ref_ja = nk.a(ig.field_d[var6 + (gg.field_l[var5] + ((wb) this).field_fb)], mo.field_Ib, 255, gd.field_B);
                          var12_ref_ja.g(var7 + ((wb) this).field_mb - 3, var8 + ((wb) this).field_cb - 3);
                          if (var27 == 0) {
                            break L28;
                          } else {
                            break L36;
                          }
                        }
                      }
                      L37: {
                        if (!ei.field_f) {
                          break L37;
                        } else {
                          break L37;
                        }
                      }
                      L38: {
                        if (null != ((wb) this).field_U) {
                          L39: {
                            if (((wb) this).field_U.k()) {
                              break L39;
                            } else {
                              ((wb) this).field_U.h(sd.b(-49, var8, var7));
                              int discarded$5 = 0;
                              ((wb) this).field_U.f(pb.a(var8, var7));
                              if (var27 == 0) {
                                break L38;
                              } else {
                                break L39;
                              }
                            }
                          }
                          ((wb) this).field_U = null;
                          break L38;
                        } else {
                          break L38;
                        }
                      }
                      L40: {
                        if (io.a(var7, var8, (byte) -99, param1)) {
                          break L40;
                        } else {
                          if (var27 == 0) {
                            break L28;
                          } else {
                            break L40;
                          }
                        }
                      }
                      L41: {
                        if (17 == ((wb) this).field_K) {
                          break L41;
                        } else {
                          if (((wb) this).field_Gb) {
                            break L41;
                          } else {
                            L42: {
                              stackOut_134_0 = ig.field_d[1];
                              stackOut_134_1 = 12;
                              stackIn_137_0 = stackOut_134_0;
                              stackIn_137_1 = stackOut_134_1;
                              stackIn_135_0 = stackOut_134_0;
                              stackIn_135_1 = stackOut_134_1;
                              if (((wb) this).field_F != 3) {
                                stackOut_137_0 = (ja) (Object) stackIn_137_0;
                                stackOut_137_1 = stackIn_137_1;
                                stackOut_137_2 = var7;
                                stackIn_138_0 = stackOut_137_0;
                                stackIn_138_1 = stackOut_137_1;
                                stackIn_138_2 = stackOut_137_2;
                                break L42;
                              } else {
                                stackOut_135_0 = (ja) (Object) stackIn_135_0;
                                stackOut_135_1 = stackIn_135_1;
                                stackIn_136_0 = stackOut_135_0;
                                stackIn_136_1 = stackOut_135_1;
                                stackOut_136_0 = (ja) (Object) stackIn_136_0;
                                stackOut_136_1 = stackIn_136_1;
                                stackOut_136_2 = var7 + -5;
                                stackIn_138_0 = stackOut_136_0;
                                stackIn_138_1 = stackOut_136_1;
                                stackIn_138_2 = stackOut_136_2;
                                break L42;
                              }
                            }
                            g.a(stackIn_138_0, stackIn_138_1 + stackIn_138_2, 43 + var8);
                            break L41;
                          }
                        }
                      }
                      L43: {
                        L44: {
                          var12 = 0;
                          var13 = 0;
                          if (((wb) this).field_Cb) {
                            break L44;
                          } else {
                            if (33 == ((wb) this).field_K) {
                              break L44;
                            } else {
                              break L43;
                            }
                          }
                        }
                        L45: {
                          if (nk.field_h != null) {
                            break L45;
                          } else {
                            g.c(bb.field_n);
                            nk.field_h = new ea();
                            g.d();
                            break L45;
                          }
                        }
                        L46: {
                          L47: {
                            g.c(bb.field_n);
                            oo.b();
                            oo.d(oo.field_l / 2, oo.field_l / 2, oo.field_l / 2, 1);
                            if (0 < ((wb) this).field_yb) {
                              break L47;
                            } else {
                              var14_ref_int__ = nk.a(1052800, 455739624, 8454143);
                              var15 = 1073741824 - -((wb) this).field_y - wf.field_m;
                              if (var27 == 0) {
                                break L46;
                              } else {
                                break L47;
                              }
                            }
                          }
                          var14_ref_int__ = nk.a(8392720, 455739624, 16744448);
                          var15 = -((wb) this).field_y + wf.field_m;
                          break L46;
                        }
                        L48: {
                          nk.field_h.a(2, (double)var15 / 7.0, var14_ref_int__);
                          g.d();
                          if (!((wb) this).field_Cb) {
                            break L48;
                          } else {
                            bb.field_n.c(var7, var8, 200);
                            if (var27 == 0) {
                              break L43;
                            } else {
                              break L48;
                            }
                          }
                        }
                        L49: {
                          L50: {
                            if (((wb) this).field_yb >= 0) {
                              break L50;
                            } else {
                              var12 = bb.field_n.field_x * -((wb) this).field_yb / 100;
                              if (var27 == 0) {
                                break L49;
                              } else {
                                break L50;
                              }
                            }
                          }
                          L51: {
                            if (((wb) this).field_yb <= 0) {
                              break L51;
                            } else {
                              var12 = ((wb) this).field_yb * bb.field_n.field_x / 100;
                              if (var27 == 0) {
                                break L49;
                              } else {
                                break L51;
                              }
                            }
                          }
                          ((wb) this).field_E = ((wb) this).field_vb;
                          ((wb) this).field_z = ((wb) this).field_Ob;
                          break L49;
                        }
                        var13 = -(var12 / 2) + 24;
                        if (var12 != 0) {
                          bb.field_n.f(var7 + var13, var8 + var13, var12, var12);
                          break L43;
                        } else {
                          break L43;
                        }
                      }
                      L52: {
                        var14 = var6;
                        if (null == gg.field_i[var5]) {
                          break L52;
                        } else {
                          var14 = gg.field_i[var5][var6];
                          break L52;
                        }
                      }
                      L53: {
                        var15 = var14 + gg.field_l[var5];
                        if (!((wb) this).field_xb) {
                          break L53;
                        } else {
                          L54: {
                            if (!((wb) this).i((byte) 122)) {
                              break L54;
                            } else {
                              if (var4 != 0) {
                                break L54;
                              } else {
                                if (14 > var15) {
                                  var15 += 70;
                                  if (var27 == 0) {
                                    break L53;
                                  } else {
                                    break L54;
                                  }
                                } else {
                                  break L53;
                                }
                              }
                            }
                          }
                          if (!((wb) this).field_nb) {
                            this.a(var7, var8, 256, (byte) -91);
                            if (var27 == 0) {
                              break L28;
                            } else {
                              break L53;
                            }
                          } else {
                            break L53;
                          }
                        }
                      }
                      L55: {
                        L56: {
                          if (null == fb.field_e) {
                            break L56;
                          } else {
                            L57: {
                              var16 = ((wb) this).field_Lb;
                              if (!((wb) this).field_xb) {
                                break L57;
                              } else {
                                if (!((wb) this).field_nb) {
                                  break L57;
                                } else {
                                  var16 = fb.field_e.field_M;
                                  if (var16 < 0) {
                                    var16 = (((wb) this).field_Lb + 1) % op.field_m.field_t;
                                    break L57;
                                  } else {
                                    break L57;
                                  }
                                }
                              }
                            }
                            gd.field_B = op.field_m.field_D[var16][0];
                            mo.field_Ib = op.field_m.field_D[var16][1];
                            this.n(param0 + 10136);
                            int discarded$6 = 2;
                            this.s();
                            if (var27 == 0) {
                              break L55;
                            } else {
                              break L56;
                            }
                          }
                        }
                        L58: {
                          L59: {
                            L60: {
                              L61: {
                                L62: {
                                  L63: {
                                    var16 = ((wb) this).field_Lb;
                                    if (var16 != 0) {
                                      break L63;
                                    } else {
                                      if (var27 == 0) {
                                        break L62;
                                      } else {
                                        break L63;
                                      }
                                    }
                                  }
                                  L64: {
                                    if (var16 != 1) {
                                      break L64;
                                    } else {
                                      if (var27 == 0) {
                                        break L61;
                                      } else {
                                        break L64;
                                      }
                                    }
                                  }
                                  if (var16 == 2) {
                                    break L60;
                                  } else {
                                    if (var16 != 3) {
                                      break L58;
                                    } else {
                                      if (var27 == 0) {
                                        break L59;
                                      } else {
                                        break L62;
                                      }
                                    }
                                  }
                                }
                                mo.field_Ib = 2473480;
                                gd.field_B = 12222482;
                                if (var27 == 0) {
                                  break L55;
                                } else {
                                  break L61;
                                }
                              }
                              gd.field_B = 11498997;
                              mo.field_Ib = 8165621;
                              if (var27 == 0) {
                                break L55;
                              } else {
                                break L60;
                              }
                            }
                            mo.field_Ib = 13843485;
                            gd.field_B = 13542477;
                            if (var27 == 0) {
                              break L55;
                            } else {
                              break L59;
                            }
                          }
                          gd.field_B = 9796223;
                          mo.field_Ib = 16054718;
                          if (var27 == 0) {
                            break L55;
                          } else {
                            break L58;
                          }
                        }
                        gd.field_B = 3178624;
                        mo.field_Ib = 3176576;
                        break L55;
                      }
                      L65: {
                        var16 = ((wb) this).field_C;
                        var17 = no.field_Hb;
                        if (var4 == 0) {
                          break L65;
                        } else {
                          if (((wb) this).field_wb) {
                            break L65;
                          } else {
                            var17 = wq.field_c;
                            break L65;
                          }
                        }
                      }
                      L66: {
                        L67: {
                          if (he.field_a) {
                            break L67;
                          } else {
                            if (((wb) this).field_xb) {
                              break L67;
                            } else {
                              if (var4 != 0) {
                                break L67;
                              } else {
                                if (~((wb) this).field_Ib >= ~op.field_m.field_H) {
                                  break L67;
                                } else {
                                  if (op.field_m.field_H <= ((wb) this).field_Ib + (-100 + ((wb) this).field_y * 19 % 35)) {
                                    break L67;
                                  } else {
                                    L68: {
                                      if (((wb) this).field_tb >= ((wb) this).g(param0 + 10218)) {
                                        stackOut_223_0 = 0;
                                        stackIn_224_0 = stackOut_223_0;
                                        break L68;
                                      } else {
                                        stackOut_222_0 = 1;
                                        stackIn_224_0 = stackOut_222_0;
                                        break L68;
                                      }
                                    }
                                    L69: {
                                      stackOut_224_0 = stackIn_224_0;
                                      stackIn_226_0 = stackOut_224_0;
                                      stackIn_225_0 = stackOut_224_0;
                                      if (((wb) this).field_F != 3) {
                                        stackOut_226_0 = stackIn_226_0;
                                        stackOut_226_1 = 0;
                                        stackIn_227_0 = stackOut_226_0;
                                        stackIn_227_1 = stackOut_226_1;
                                        break L69;
                                      } else {
                                        stackOut_225_0 = stackIn_225_0;
                                        stackOut_225_1 = 1;
                                        stackIn_227_0 = stackOut_225_0;
                                        stackIn_227_1 = stackOut_225_1;
                                        break L69;
                                      }
                                    }
                                    if ((stackIn_227_0 ^ stackIn_227_1) == 0) {
                                      break L67;
                                    } else {
                                      L70: {
                                        if (((wb) this).field_K == 5) {
                                          break L70;
                                        } else {
                                          if (4 == ((wb) this).field_K) {
                                            break L70;
                                          } else {
                                            if (6 != ((wb) this).field_K) {
                                              break L67;
                                            } else {
                                              break L70;
                                            }
                                          }
                                        }
                                      }
                                      stackOut_234_0 = 1;
                                      stackIn_236_0 = stackOut_234_0;
                                      break L66;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        stackOut_235_0 = 0;
                        stackIn_236_0 = stackOut_235_0;
                        break L66;
                      }
                      L71: {
                        L72: {
                          L73: {
                            L74: {
                              var18 = stackIn_236_0;
                              if (var18 != 0) {
                                break L74;
                              } else {
                                ja discarded$7 = nk.a(var17[var16][var15], mo.field_Ib, param0 + 10391, gd.field_B);
                                if (var27 == 0) {
                                  break L73;
                                } else {
                                  break L74;
                                }
                              }
                            }
                            L75: {
                              g.c(vb.field_b);
                              var19 = 117;
                              var20_ref_ja = no.field_Hb[var16][var15];
                              var21 = 6;
                              var22 = 3;
                              if (~ic.field_h.length < ~var15) {
                                var21 = ic.field_h[var15];
                                var22 = ui.field_i[var15];
                                break L75;
                              } else {
                                break L75;
                              }
                            }
                            L76: {
                              if (!this.m(-2)) {
                                var22++;
                                var21 -= 3;
                                break L76;
                              } else {
                                break L76;
                              }
                            }
                            oo.b();
                            var20_ref_ja.g(3, 3);
                            no.field_Hb[var16][var19].g(var21, var22);
                            var23 = oo.field_i;
                            var24 = 0;
                            L77: while (true) {
                              L78: {
                                if (~var24 <= ~var23.length) {
                                  break L78;
                                } else {
                                  var25 = var23[var24];
                                  stackOut_247_0 = ~var25;
                                  stackOut_247_1 = -1;
                                  stackIn_266_0 = stackOut_247_0;
                                  stackIn_266_1 = stackOut_247_1;
                                  stackIn_248_0 = stackOut_247_0;
                                  stackIn_248_1 = stackOut_247_1;
                                  if (var27 != 0) {
                                    break L72;
                                  } else {
                                    L79: {
                                      L80: {
                                        if (stackIn_248_0 != stackIn_248_1) {
                                          break L80;
                                        } else {
                                          if (var27 == 0) {
                                            break L79;
                                          } else {
                                            break L80;
                                          }
                                        }
                                      }
                                      L81: {
                                        if ((var25 & 65535) == 0) {
                                          break L81;
                                        } else {
                                          if (0 != (16711935 & var25)) {
                                            break L79;
                                          } else {
                                            var26 = var25 >> 8;
                                            var23[var24] = cr.b(cr.b(tq.b(65280, tq.b(255, mo.field_Ib >> 8) * var26), tq.b(mo.field_Ib, 255) * var26 >> 8), tq.b(16711777, (tq.b(mo.field_Ib, 16754034) >> 16) * var26 << 8));
                                            if (var27 == 0) {
                                              break L79;
                                            } else {
                                              break L81;
                                            }
                                          }
                                        }
                                      }
                                      var26 = var25 >> 16;
                                      var23[var24] = cr.b(cr.b(var26 * tq.b(255, gd.field_B) >> 8, tq.b(65280, var26 * (tq.b(65430, gd.field_B) >> 8))), tq.b(1895890688, var26 * tq.b(255, gd.field_B >> 16)) << 8);
                                      break L79;
                                    }
                                    var24++;
                                    if (var27 == 0) {
                                      continue L77;
                                    } else {
                                      break L78;
                                    }
                                  }
                                }
                              }
                              g.d();
                              break L73;
                            }
                          }
                          L82: {
                            if (((wb) this).i((byte) 119)) {
                              break L82;
                            } else {
                              if (!((wb) this).field_xb) {
                                break L71;
                              } else {
                                if (!((wb) this).field_nb) {
                                  break L71;
                                } else {
                                  break L82;
                                }
                              }
                            }
                          }
                          g.c(vb.field_b);
                          stackOut_265_0 = 0;
                          stackOut_265_1 = 0;
                          stackIn_266_0 = stackOut_265_0;
                          stackIn_266_1 = stackOut_265_1;
                          break L72;
                        }
                        g.a(stackIn_266_0, stackIn_266_1, 54, 54, gd.field_B);
                        g.d();
                        break L71;
                      }
                      L83: {
                        L84: {
                          if (((wb) this).field_K == 21) {
                            break L84;
                          } else {
                            L85: {
                              var19 = wf.field_m / 4 % aa.field_h.length;
                              if (((wb) this).field_F != 3) {
                                break L85;
                              } else {
                                g.a(vb.field_b);
                                break L85;
                              }
                            }
                            L86: {
                              L87: {
                                var20 = 3 + var8;
                                if (((wb) this).field_K != 23) {
                                  break L87;
                                } else {
                                  aa.field_h[var19].a(var7, var20);
                                  if (var27 == 0) {
                                    break L86;
                                  } else {
                                    break L87;
                                  }
                                }
                              }
                              L88: {
                                if (((wb) this).field_Nb <= 0) {
                                  break L88;
                                } else {
                                  L89: {
                                    var21 = pn.field_c.length;
                                    var19 = -var21 + (1 + wf.field_m / 4 % (-1 + var21 * 2));
                                    if (0 > var19) {
                                      var19 = -var19;
                                      break L89;
                                    } else {
                                      break L89;
                                    }
                                  }
                                  L90: {
                                    stackOut_278_0 = pn.field_c[var19];
                                    stackOut_278_1 = var7;
                                    stackIn_280_0 = stackOut_278_0;
                                    stackIn_280_1 = stackOut_278_1;
                                    stackIn_279_0 = stackOut_278_0;
                                    stackIn_279_1 = stackOut_278_1;
                                    if (((wb) this).field_F != 3) {
                                      stackOut_280_0 = (ri) (Object) stackIn_280_0;
                                      stackOut_280_1 = stackIn_280_1;
                                      stackOut_280_2 = 2;
                                      stackIn_281_0 = stackOut_280_0;
                                      stackIn_281_1 = stackOut_280_1;
                                      stackIn_281_2 = stackOut_280_2;
                                      break L90;
                                    } else {
                                      stackOut_279_0 = (ri) (Object) stackIn_279_0;
                                      stackOut_279_1 = stackIn_279_1;
                                      stackOut_279_2 = -2;
                                      stackIn_281_0 = stackOut_279_0;
                                      stackIn_281_1 = stackOut_279_1;
                                      stackIn_281_2 = stackOut_279_2;
                                      break L90;
                                    }
                                  }
                                  ((ri) (Object) stackIn_281_0).a(stackIn_281_1 - -stackIn_281_2, var20 - 7);
                                  if (var27 == 0) {
                                    break L86;
                                  } else {
                                    break L88;
                                  }
                                }
                              }
                              if (((wb) this).field_ub <= 0) {
                                break L86;
                              } else {
                                L91: {
                                  L92: {
                                    var21 = 72;
                                    if (24 > ((wb) this).field_ub / 2) {
                                      break L92;
                                    } else {
                                      if (~(((wb) this).field_Mb - 48) <= ~((wb) this).field_ub) {
                                        break L91;
                                      } else {
                                        var21 = 48 - -((((wb) this).field_Mb + -((wb) this).field_ub) / 2);
                                        if (var27 == 0) {
                                          break L91;
                                        } else {
                                          break L92;
                                        }
                                      }
                                    }
                                  }
                                  var21 = ((wb) this).field_ub / 2 + 48;
                                  break L91;
                                }
                                vb.field_b.a(var7 - 3 + -((var21 + -48) / 2), -var21 + 45 + var8, var21, var21, 128);
                                break L86;
                              }
                            }
                            L93: {
                              L94: {
                                if (((wb) this).field_K != 33) {
                                  break L94;
                                } else {
                                  vb.field_b.f(var13 + var7, var8 + var13, var12, var12);
                                  if (var27 == 0) {
                                    break L93;
                                  } else {
                                    break L94;
                                  }
                                }
                              }
                              L95: {
                                if (((wb) this).field_G > 0) {
                                  break L95;
                                } else {
                                  vb.field_b.g(var7 + -3, var8 + -3);
                                  if (var27 == 0) {
                                    break L93;
                                  } else {
                                    break L95;
                                  }
                                }
                              }
                              vb.field_b.d(-3 + var7, var8 - 3, 142);
                              break L93;
                            }
                            L96: {
                              L97: {
                                if (((wb) this).field_K == 23) {
                                  break L97;
                                } else {
                                  if (((wb) this).field_Nb > 0) {
                                    break L97;
                                  } else {
                                    break L96;
                                  }
                                }
                              }
                              L98: {
                                g.c();
                                oo.h(var7, var20 + aa.field_h[var19].field_b / 2, 640, aa.field_h[var19].field_b + var20);
                                if (23 == ((wb) this).field_K) {
                                  aa.field_h[var19].a(var7, var20);
                                  break L98;
                                } else {
                                  break L98;
                                }
                              }
                              g.b();
                              break L96;
                            }
                            if (var27 == 0) {
                              break L83;
                            } else {
                              break L84;
                            }
                          }
                        }
                        vb.field_b.c(-3 + var7, -3 + var8, ((wb) this).field_N);
                        break L83;
                      }
                      L99: {
                        if (!((wb) this).field_zb) {
                          break L99;
                        } else {
                          ig.field_d[0].e(1 + var7, var8 - -2, 128, 16711680);
                          if (var27 == 0) {
                            break L29;
                          } else {
                            break L99;
                          }
                        }
                      }
                      L100: {
                        if (((wb) this).field_Bb) {
                          break L100;
                        } else {
                          if (((wb) this).field_eb) {
                            ig.field_d[0].c(var7, var8 - -2, 96);
                            if (var27 == 0) {
                              break L29;
                            } else {
                              break L100;
                            }
                          } else {
                            break L29;
                          }
                        }
                      }
                      L101: {
                        if (param1.field_d > 1.25f) {
                          break L101;
                        } else {
                          ig.field_d[0].g(var7, var8 + 3);
                          if (0 == ((wb) this).field_Kb) {
                            break L29;
                          } else {
                            qp.field_w.a((char)(48 + ((wb) this).field_Kb), 1 + (var7 - (-ig.field_d[0].field_x + -9)), var8 + 7 - -ig.field_d[0].field_w + 1, 0);
                            qp.field_w.a((char)(48 - -((wb) this).field_Kb), 9 + var7 - -ig.field_d[0].field_x, 7 + (var8 - -ig.field_d[0].field_w), 16777215);
                            if (var27 == 0) {
                              break L29;
                            } else {
                              break L101;
                            }
                          }
                        }
                      }
                      ig.field_d[0].f(var7, var8 + 3, 1);
                      ig.field_d[0].f(var7, var8, 16777215);
                      if (0 == ((wb) this).field_Kb) {
                        break L29;
                      } else {
                        pb.field_e.a((char)(((wb) this).field_Kb + 48), var7 - (-ig.field_d[0].field_x + -9) + 1, ig.field_d[0].field_w + (7 + (var8 + 1)), 0);
                        pb.field_e.a((char)(48 - -((wb) this).field_Kb), 9 + (ig.field_d[0].field_x + var7), 7 + (var8 + ig.field_d[0].field_w), 16777215);
                        break L29;
                      }
                    }
                    var11++;
                    if (var27 == 0) {
                      continue L26;
                    } else {
                      break L28;
                    }
                  }
                }
              }
              break L27;
            }
            return;
          }
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
              if (0 != ((wb) this).field_C) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                stackOut_4_0 = 1;
                stackIn_7_0 = stackOut_4_0;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "wb.CA(" + -2 + 41);
        }
        return stackIn_7_0 != 0;
    }

    final void a(boolean param0, nm param1) {
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
            var3 = ((wb) this).field_gb;
            if (var3 == null) {
              return;
            } else {
              L1: {
                int discarded$4 = param1.c(((wb) this).g(-127), -20126);
                int discarded$5 = param1.d(((wb) this).h(-59), 126);
                int discarded$6 = param1.c(((wb) this).field_O, -20126);
                int discarded$7 = param1.d(((wb) this).field_P, 125);
                if (param0) {
                  break L1;
                } else {
                  ((wb) this).field_sb = 20;
                  break L1;
                }
              }
              L2: {
                var4 = param1.c(((wb) this).field_tb, -20126);
                var5 = param1.d(((wb) this).field_Jb, 108) - 24;
                var6 = 50;
                var7 = 50;
                if (-op.field_m.field_H + ((wb) this).field_Ib >= 50) {
                  break L2;
                } else {
                  L3: {
                    var6 = ((wb) this).field_Ib - op.field_m.field_H;
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
              var8 = op.field_m.field_D[((wb) this).field_Lb][0];
              var9 = op.field_m.field_D[((wb) this).field_Lb][1];
              var10 = am.a(0, var9, ((wb) this).field_C, 1, var8);
              var10.c(-24 + var4, -24 + var5, var7 * 2);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3_ref;
            stackOut_15_1 = new StringBuilder().append("wb.JB(").append(param0).append(44);
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L4;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
    }

    final boolean i(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (fb.field_e != null) {
              L1: {
                var2_int = 97 % ((58 - param0) / 58);
                if (~((wb) this).field_Lb != ~fb.field_e.field_M) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_7_0 = stackOut_4_0;
                  break L1;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "wb.W(" + param0 + 41);
        }
        return stackIn_7_0 != 0;
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
          throw fa.a((Throwable) (Object) var2, "wb.GB(" + param0 + 41);
        }
        return stackIn_1_0;
    }

    final static int h() {
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            stackOut_3_0 = rj.field_J;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var1, "wb.DB(" + -80 + 41);
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
          throw fa.a((Throwable) (Object) var1_ref, "wb.DA(" + param0 + 41);
        }
    }

    wb(int param0, int param1, boolean param2) {
        this(param0, param1, param2 ? 0 : 1);
    }

    private final void c() {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "wb.EA(" + 1 + 41);
        }
    }

    final void d(boolean param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != ((wb) this).field_jb) {
                ((wb) this).field_K = 15;
                ((wb) this).field_jb.a(true);
                ((wb) this).field_jb = null;
                ((wb) this).b(4, -27655);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (!param0) {
                break L2;
              } else {
                boolean discarded$2 = wb.k((byte) -17);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "wb.HB(" + param0 + 41);
        }
    }

    final static boolean k(byte param0) {
        RuntimeException var1 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 > 91) {
              stackOut_3_0 = jg.field_a;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var1, "wb.K(" + param0 + 41);
        }
        return stackIn_4_0;
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
                    ((wb) this).field_Db = (qk) (Object) param0.a((byte) -39);
                    if (((wb) this).field_Db != null) {
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  ((wb) this).field_qb = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) runtimeException;
            stackOut_8_1 = new StringBuilder().append("wb.RB(");
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L3;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 41);
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 >= 19) {
              L1: {
                if (!((wb) this).o(124)) {
                  L2: {
                    if (((wb) this).field_Cb) {
                      ((wb) this).field_vb = param3 << 16;
                      ((wb) this).field_Ob = param2 << 16;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  ((wb) this).field_Jb = param3;
                  ((wb) this).field_Ib = param1;
                  ((wb) this).field_tb = param2;
                  ((wb) this).field_gb = fb.field_e.field_u.b(((wb) this).g(126), ((wb) this).field_Jb, ((wb) this).h(-73), ((wb) this).field_tb, 8760);
                  break L1;
                } else {
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var5, "wb.GA(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    private final void m() {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            ((wb) this).b(4, -27655);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "wb.FB(" + 6 + 41);
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
                ((wb) this).field_ob = 69;
                break L1;
              }
            }
            ((wb) this).field_Nb = 0;
            ((wb) this).field_xb = false;
            ((wb) this).field_ub = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "wb.EB(" + param0 + 41);
        }
    }

    private final void a(int param0, int param1, int param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
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
              if (((wb) this).field_nb) {
                break L1;
              } else {
                L2: {
                  var5_int = 0;
                  var6 = ((wb) this).field_ab % gg.field_j[var5_int];
                  var7 = op.field_m.field_h.field_j;
                  if (var7 != 0) {
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
                  if (((wb) this).field_F == 1) {
                    break L3;
                  } else {
                    wq.field_c[var8][var9].g(param0, param1);
                    if (var10 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
                wq.field_c[var8][var9].b(param0, param1);
                if (var10 == 0) {
                  break L1;
                } else {
                  wq.field_c[var8][var9].c(param0, param1, 256);
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var5, "wb.AA(" + param0 + 44 + param1 + 44 + 256 + 44 + -91 + 41);
        }
    }

    final void f(byte param0) {
        int var2_int = 0;
        int var3 = 0;
        th stackIn_106_0 = null;
        jj stackIn_106_1 = null;
        jj stackIn_106_2 = null;
        int stackIn_106_3 = 0;
        int stackIn_106_4 = 0;
        int stackIn_106_5 = 0;
        int stackIn_106_6 = 0;
        th stackIn_107_0 = null;
        jj stackIn_107_1 = null;
        jj stackIn_107_2 = null;
        int stackIn_107_3 = 0;
        int stackIn_107_4 = 0;
        int stackIn_107_5 = 0;
        int stackIn_107_6 = 0;
        th stackIn_108_0 = null;
        jj stackIn_108_1 = null;
        jj stackIn_108_2 = null;
        int stackIn_108_3 = 0;
        int stackIn_108_4 = 0;
        int stackIn_108_5 = 0;
        int stackIn_108_6 = 0;
        th stackIn_109_0 = null;
        jj stackIn_109_1 = null;
        jj stackIn_109_2 = null;
        int stackIn_109_3 = 0;
        int stackIn_109_4 = 0;
        int stackIn_109_5 = 0;
        int stackIn_109_6 = 0;
        int stackIn_109_7 = 0;
        Object stackIn_167_0 = null;
        Object stackIn_168_0 = null;
        Object stackIn_169_0 = null;
        Object stackIn_170_0 = null;
        int stackIn_170_1 = 0;
        th stackOut_105_0 = null;
        jj stackOut_105_1 = null;
        jj stackOut_105_2 = null;
        int stackOut_105_3 = 0;
        int stackOut_105_4 = 0;
        int stackOut_105_5 = 0;
        int stackOut_105_6 = 0;
        th stackOut_108_0 = null;
        jj stackOut_108_1 = null;
        jj stackOut_108_2 = null;
        int stackOut_108_3 = 0;
        int stackOut_108_4 = 0;
        int stackOut_108_5 = 0;
        int stackOut_108_6 = 0;
        int stackOut_108_7 = 0;
        th stackOut_106_0 = null;
        jj stackOut_106_1 = null;
        jj stackOut_106_2 = null;
        int stackOut_106_3 = 0;
        int stackOut_106_4 = 0;
        int stackOut_106_5 = 0;
        int stackOut_106_6 = 0;
        th stackOut_107_0 = null;
        jj stackOut_107_1 = null;
        jj stackOut_107_2 = null;
        int stackOut_107_3 = 0;
        int stackOut_107_4 = 0;
        int stackOut_107_5 = 0;
        int stackOut_107_6 = 0;
        int stackOut_107_7 = 0;
        Object stackOut_166_0 = null;
        Object stackOut_169_0 = null;
        int stackOut_169_1 = 0;
        Object stackOut_167_0 = null;
        Object stackOut_168_0 = null;
        int stackOut_168_1 = 0;
        L0: {
          var3 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param0 < -79) {
            break L0;
          } else {
            ((wb) this).a(true, (wb) null);
            break L0;
          }
        }
        L1: {
          super.f((byte) -92);
          ((wb) this).c(30818, ((wb) this).field_K);
          if (((wb) this).field_K != 33) {
            ((wb) this).field_yb = 0;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (((wb) this).field_ub > 0) {
            ((wb) this).field_ub = ((wb) this).field_ub - 1;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (0 >= ((wb) this).field_Fb) {
            break L3;
          } else {
            ((wb) this).field_Fb = ((wb) this).field_Fb - 1;
            break L3;
          }
        }
        L4: {
          if (((wb) this).field_K == 29) {
            break L4;
          } else {
            ((wb) this).field_Cb = false;
            break L4;
          }
        }
        L5: {
          if (((wb) this).field_Nb <= 0) {
            break L5;
          } else {
            ((wb) this).field_Nb = ((wb) this).field_Nb - 1;
            break L5;
          }
        }
        L6: {
          L7: {
            if (((wb) this).field_K != 4) {
              break L7;
            } else {
              if (!((wb) this).field_xb) {
                break L6;
              } else {
                if (((wb) this).field_ab >= 2) {
                  break L6;
                } else {
                  ((wb) this).field_Q = ((wb) this).field_Q + 3;
                  if (var3 == 0) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
            }
          }
          L8: {
            if (((wb) this).field_K == 31) {
              break L8;
            } else {
              L9: {
                if (((wb) this).field_K == 5) {
                  break L9;
                } else {
                  L10: {
                    if (((wb) this).field_K != 29) {
                      break L10;
                    } else {
                      ((wb) this).field_yb = -100;
                      if (var3 == 0) {
                        break L6;
                      } else {
                        break L10;
                      }
                    }
                  }
                  L11: {
                    if (((wb) this).field_K == 33) {
                      break L11;
                    } else {
                      L12: {
                        if (6 != ((wb) this).field_K) {
                          break L12;
                        } else {
                          L13: {
                            if (((wb) this).field_sb > 0) {
                              ((wb) this).field_sb = ((wb) this).field_sb - 1;
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                          L14: {
                            ((wb) this).i(5197);
                            if (((wb) this).k(-106)) {
                              break L14;
                            } else {
                              if (0 != ((wb) this).field_X) {
                                break L6;
                              } else {
                                if (0 == ((wb) this).field_S) {
                                  break L14;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          ((wb) this).b(4, -27655);
                          if (var3 == 0) {
                            break L6;
                          } else {
                            break L12;
                          }
                        }
                      }
                      L15: {
                        if (7 != ((wb) this).field_K) {
                          break L15;
                        } else {
                          L16: {
                            ((wb) this).i(5197);
                            if (((wb) this).field_Eb == null) {
                              break L16;
                            } else {
                              if (((wb) this).field_Eb.field_K == 18) {
                                break L16;
                              } else {
                                if (((wb) this).field_Eb.field_K == 21) {
                                  break L16;
                                } else {
                                  if (20 == ((wb) this).field_Eb.field_K) {
                                    break L16;
                                  } else {
                                    int fieldTemp$9 = ((wb) this).field_sb;
                                    ((wb) this).field_sb = ((wb) this).field_sb + 1;
                                    if (fieldTemp$9 > 60) {
                                      break L16;
                                    } else {
                                      if (((wb) this).field_Eb.field_K == 1) {
                                        break L6;
                                      } else {
                                        if (((wb) this).field_Eb.field_K != 2) {
                                          break L6;
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
                          ((wb) this).field_Eb = null;
                          ((wb) this).b(4, -27655);
                          if (var3 == 0) {
                            break L6;
                          } else {
                            break L15;
                          }
                        }
                      }
                      L17: {
                        if (((wb) this).field_K != 8) {
                          break L17;
                        } else {
                          L18: {
                            L19: {
                              ((wb) this).field_xb = false;
                              if (((wb) this).field_ab == 0) {
                                break L19;
                              } else {
                                if (((wb) this).field_ab != 2) {
                                  break L18;
                                } else {
                                  break L19;
                                }
                              }
                            }
                            if (((wb) this).field_Q != 0) {
                              break L18;
                            } else {
                              L20: {
                                L21: {
                                  var2_int = 0;
                                  if (0 != hp.a((byte) -112, g.field_a, 3)) {
                                    break L21;
                                  } else {
                                    L22: {
                                      if (((wb) this).field_Eb == null) {
                                        break L22;
                                      } else {
                                        if (((wb) this).field_Eb.m(15684)) {
                                          break L22;
                                        } else {
                                          var2_int = 37 + hp.a((byte) 14, g.field_a, 3);
                                          if (var3 == 0) {
                                            break L20;
                                          } else {
                                            break L22;
                                          }
                                        }
                                      }
                                    }
                                    var2_int = 40 + hp.a((byte) -118, g.field_a, 4);
                                    if (var3 == 0) {
                                      break L20;
                                    } else {
                                      break L21;
                                    }
                                  }
                                }
                                var2_int = hp.a((byte) -103, g.field_a, 5) + 30;
                                break L20;
                              }
                              ((wb) this).field_U = qq.b(1481485697, var2_int);
                              break L18;
                            }
                          }
                          if (((wb) this).field_lb == 30) {
                            fb.field_e.a(1, ((wb) this).field_Eb.g(76), ((wb) this).field_Eb.h(117));
                            if (var3 == 0) {
                              break L6;
                            } else {
                              break L17;
                            }
                          } else {
                            break L6;
                          }
                        }
                      }
                      L23: {
                        if (((wb) this).field_K == 22) {
                          break L23;
                        } else {
                          L24: {
                            if (((wb) this).field_K != 9) {
                              break L24;
                            } else {
                              L25: {
                                if (((wb) this).field_pb != 0) {
                                  ((wb) this).field_z = ((wb) this).field_z + (((wb) this).field_pb << 16);
                                  break L25;
                                } else {
                                  break L25;
                                }
                              }
                              if (((wb) this).field_ab != 5) {
                                break L6;
                              } else {
                                fb.field_e.a(1, ((wb) this).g(124), ((wb) this).h(-105));
                                fb.field_e.a(true, (wb) this);
                                if (((wb) this).field_jb == null) {
                                  break L6;
                                } else {
                                  ((wb) this).field_jb.c(-24421);
                                  ((wb) this).field_jb.a(true);
                                  ((wb) this).field_jb = null;
                                  if (var3 == 0) {
                                    break L6;
                                  } else {
                                    break L24;
                                  }
                                }
                              }
                            }
                          }
                          L26: {
                            if (((wb) this).field_K == 12) {
                              break L26;
                            } else {
                              L27: {
                                if (((wb) this).field_K == 13) {
                                  break L27;
                                } else {
                                  L28: {
                                    L29: {
                                      if (((wb) this).field_K == 14) {
                                        break L29;
                                      } else {
                                        if (((wb) this).field_K != 26) {
                                          break L28;
                                        } else {
                                          break L29;
                                        }
                                      }
                                    }
                                    ((wb) this).field_xb = false;
                                    ((wb) this).field_F = 1;
                                    if (4 != ((wb) this).field_ab) {
                                      break L6;
                                    } else {
                                      L30: {
                                        stackOut_105_0 = fb.field_e.field_H;
                                        stackOut_105_1 = null;
                                        stackOut_105_2 = null;
                                        stackOut_105_3 = ((wb) this).g(113);
                                        stackOut_105_4 = ((wb) this).h(101);
                                        stackOut_105_5 = ((wb) this).field_C;
                                        stackOut_105_6 = ((wb) this).field_Lb;
                                        stackIn_108_0 = stackOut_105_0;
                                        stackIn_108_1 = stackOut_105_1;
                                        stackIn_108_2 = stackOut_105_2;
                                        stackIn_108_3 = stackOut_105_3;
                                        stackIn_108_4 = stackOut_105_4;
                                        stackIn_108_5 = stackOut_105_5;
                                        stackIn_108_6 = stackOut_105_6;
                                        stackIn_106_0 = stackOut_105_0;
                                        stackIn_106_1 = stackOut_105_1;
                                        stackIn_106_2 = stackOut_105_2;
                                        stackIn_106_3 = stackOut_105_3;
                                        stackIn_106_4 = stackOut_105_4;
                                        stackIn_106_5 = stackOut_105_5;
                                        stackIn_106_6 = stackOut_105_6;
                                        if (26 != ((wb) this).field_K) {
                                          stackOut_108_0 = (th) (Object) stackIn_108_0;
                                          stackOut_108_1 = null;
                                          stackOut_108_2 = null;
                                          stackOut_108_3 = stackIn_108_3;
                                          stackOut_108_4 = stackIn_108_4;
                                          stackOut_108_5 = stackIn_108_5;
                                          stackOut_108_6 = stackIn_108_6;
                                          stackOut_108_7 = 0;
                                          stackIn_109_0 = stackOut_108_0;
                                          stackIn_109_1 = stackOut_108_1;
                                          stackIn_109_2 = stackOut_108_2;
                                          stackIn_109_3 = stackOut_108_3;
                                          stackIn_109_4 = stackOut_108_4;
                                          stackIn_109_5 = stackOut_108_5;
                                          stackIn_109_6 = stackOut_108_6;
                                          stackIn_109_7 = stackOut_108_7;
                                          break L30;
                                        } else {
                                          stackOut_106_0 = (th) (Object) stackIn_106_0;
                                          stackOut_106_1 = null;
                                          stackOut_106_2 = null;
                                          stackOut_106_3 = stackIn_106_3;
                                          stackOut_106_4 = stackIn_106_4;
                                          stackOut_106_5 = stackIn_106_5;
                                          stackOut_106_6 = stackIn_106_6;
                                          stackIn_107_0 = stackOut_106_0;
                                          stackIn_107_1 = stackOut_106_1;
                                          stackIn_107_2 = stackOut_106_2;
                                          stackIn_107_3 = stackOut_106_3;
                                          stackIn_107_4 = stackOut_106_4;
                                          stackIn_107_5 = stackOut_106_5;
                                          stackIn_107_6 = stackOut_106_6;
                                          stackOut_107_0 = (th) (Object) stackIn_107_0;
                                          stackOut_107_1 = null;
                                          stackOut_107_2 = null;
                                          stackOut_107_3 = stackIn_107_3;
                                          stackOut_107_4 = stackIn_107_4;
                                          stackOut_107_5 = stackIn_107_5;
                                          stackOut_107_6 = stackIn_107_6;
                                          stackOut_107_7 = 1;
                                          stackIn_109_0 = stackOut_107_0;
                                          stackIn_109_1 = stackOut_107_1;
                                          stackIn_109_2 = stackOut_107_2;
                                          stackIn_109_3 = stackOut_107_3;
                                          stackIn_109_4 = stackOut_107_4;
                                          stackIn_109_5 = stackOut_107_5;
                                          stackIn_109_6 = stackOut_107_6;
                                          stackIn_109_7 = stackOut_107_7;
                                          break L30;
                                        }
                                      }
                                      ((th) (Object) stackIn_109_0).a((br) (Object) new jj(stackIn_109_3, stackIn_109_4, stackIn_109_5, stackIn_109_6, stackIn_109_7 != 0), false);
                                      ((wb) this).b(4, -27655);
                                      if (var3 == 0) {
                                        break L6;
                                      } else {
                                        break L28;
                                      }
                                    }
                                  }
                                  L31: {
                                    if (((wb) this).field_K != 34) {
                                      break L31;
                                    } else {
                                      if (((wb) this).field_ab != 4) {
                                        break L6;
                                      } else {
                                        L32: {
                                          ((wb) this).field_Q = ((wb) this).field_Q - 1;
                                          ((wb) this).field_xb = false;
                                          if (((wb) this).field_jb != null) {
                                            break L32;
                                          } else {
                                            ((wb) this).field_jb = new pq(((wb) this).g(-74), ((wb) this).h(-61) + -30, op.field_m.a((byte) 32, ((wb) this).field_Lb, 750));
                                            op.field_m.field_G.a((br) (Object) ((wb) this).field_jb, false);
                                            if (var3 == 0) {
                                              break L6;
                                            } else {
                                              break L32;
                                            }
                                          }
                                        }
                                        L33: {
                                          if (((wb) this).field_jb.d(67)) {
                                            break L33;
                                          } else {
                                            L34: {
                                              L35: {
                                                ((wb) this).i(5197);
                                                if (((wb) this).k(-100)) {
                                                  break L35;
                                                } else {
                                                  if (0 != ((wb) this).field_X) {
                                                    break L34;
                                                  } else {
                                                    if (((wb) this).field_S == 0) {
                                                      break L35;
                                                    } else {
                                                      break L34;
                                                    }
                                                  }
                                                }
                                              }
                                              int discarded$10 = 6;
                                              this.m();
                                              break L34;
                                            }
                                            ((wb) this).field_jb.a(((wb) this).h(92) + -30, ((wb) this).g(71), 0);
                                            if (var3 == 0) {
                                              break L6;
                                            } else {
                                              break L33;
                                            }
                                          }
                                        }
                                        ((wb) this).field_jb.a(true);
                                        ((wb) this).field_jb = null;
                                        ((wb) this).field_K = 15;
                                        ((wb) this).b(4, -27655);
                                        if (var3 == 0) {
                                          break L6;
                                        } else {
                                          break L31;
                                        }
                                      }
                                    }
                                  }
                                  L36: {
                                    if (15 == ((wb) this).field_K) {
                                      break L36;
                                    } else {
                                      L37: {
                                        if (((wb) this).field_K != 17) {
                                          break L37;
                                        } else {
                                          L38: {
                                            if (((wb) this).field_ab != 3) {
                                              break L38;
                                            } else {
                                              if (((wb) this).field_Q == 0) {
                                                fb.field_e.a((byte) 126, ((wb) this).g(-113), ((wb) this).h(-82), ((wb) this).field_Lb);
                                                break L38;
                                              } else {
                                                break L38;
                                              }
                                            }
                                          }
                                          if (((wb) this).field_ab >= 5) {
                                            fb.field_e.a(true, (wb) this);
                                            op.field_m.a(-119, (ff) this);
                                            if (var3 == 0) {
                                              break L6;
                                            } else {
                                              break L37;
                                            }
                                          } else {
                                            break L6;
                                          }
                                        }
                                      }
                                      L39: {
                                        if (((wb) this).field_K == 19) {
                                          break L39;
                                        } else {
                                          if (((wb) this).field_K == 24) {
                                            break L39;
                                          } else {
                                            L40: {
                                              if (((wb) this).field_K != 27) {
                                                break L40;
                                              } else {
                                                L41: {
                                                  if (~(gg.field_j[27] / 2) != ~((wb) this).field_ab) {
                                                    break L41;
                                                  } else {
                                                    ((wb) this).field_ub = 0;
                                                    ((wb) this).field_xb = false;
                                                    ((wb) this).field_Nb = op.field_m.a((byte) 32, ((wb) this).field_Lb, 2250);
                                                    break L41;
                                                  }
                                                }
                                                if (gg.field_j[27] + -1 == ((wb) this).field_ab) {
                                                  ((wb) this).b(4, -27655);
                                                  if (var3 == 0) {
                                                    break L6;
                                                  } else {
                                                    break L40;
                                                  }
                                                } else {
                                                  break L6;
                                                }
                                              }
                                            }
                                            if (((wb) this).field_K != 28) {
                                              break L6;
                                            } else {
                                              L42: {
                                                if (((wb) this).field_ab == gg.field_j[28] / 2) {
                                                  ((wb) this).field_xb = false;
                                                  ((wb) this).field_Nb = 0;
                                                  ((wb) this).field_Mb = op.field_m.a((byte) 32, ((wb) this).field_Lb, 2250);
                                                  ((wb) this).field_ub = ((wb) this).field_Mb;
                                                  break L42;
                                                } else {
                                                  break L42;
                                                }
                                              }
                                              if (((wb) this).field_ab == -1 + gg.field_j[28]) {
                                                ((wb) this).b(4, -27655);
                                                if (var3 == 0) {
                                                  break L6;
                                                } else {
                                                  break L39;
                                                }
                                              } else {
                                                break L6;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      if (5 != ((wb) this).field_ab) {
                                        break L6;
                                      } else {
                                        L43: {
                                          stackOut_166_0 = this;
                                          stackIn_169_0 = stackOut_166_0;
                                          stackIn_167_0 = stackOut_166_0;
                                          if (((wb) this).field_K != 24) {
                                            stackOut_169_0 = this;
                                            stackOut_169_1 = 0;
                                            stackIn_170_0 = stackOut_169_0;
                                            stackIn_170_1 = stackOut_169_1;
                                            break L43;
                                          } else {
                                            stackOut_167_0 = this;
                                            stackIn_168_0 = stackOut_167_0;
                                            stackOut_168_0 = this;
                                            stackOut_168_1 = 1;
                                            stackIn_170_0 = stackOut_168_0;
                                            stackIn_170_1 = stackOut_168_1;
                                            break L43;
                                          }
                                        }
                                        ((wb) this).field_nb = stackIn_170_1 != 0;
                                        ((wb) this).field_xb = true;
                                        ((wb) this).b(4, -27655);
                                        if (var3 == 0) {
                                          break L6;
                                        } else {
                                          break L36;
                                        }
                                      }
                                    }
                                  }
                                  if (((wb) this).field_ab != 4) {
                                    break L6;
                                  } else {
                                    L44: {
                                      ((wb) this).field_Q = ((wb) this).field_Q - 1;
                                      ((wb) this).field_xb = false;
                                      if (((wb) this).field_jb == null) {
                                        ((wb) this).field_jb = new pq(((wb) this).g(73), ((wb) this).h(-104) - 30, op.field_m.a((byte) 32, ((wb) this).field_Lb, 750));
                                        op.field_m.field_G.a((br) (Object) ((wb) this).field_jb, false);
                                        break L44;
                                      } else {
                                        break L44;
                                      }
                                    }
                                    if (((wb) this).field_jb.d(124)) {
                                      ((wb) this).field_jb.a(true);
                                      ((wb) this).field_jb = null;
                                      ((wb) this).b(4, -27655);
                                      if (var3 == 0) {
                                        break L6;
                                      } else {
                                        break L27;
                                      }
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                              L45: {
                                if (((wb) this).field_xb) {
                                  ((wb) this).field_ab = 2;
                                  break L45;
                                } else {
                                  break L45;
                                }
                              }
                              if (2 == ((wb) this).field_ab) {
                                ((wb) this).field_ab = 0;
                                ((wb) this).field_xb = false;
                                fb.field_e.b(((wb) this).field_Hb, 0, ((wb) this).h(-71), ((wb) this).g(-88));
                                int discarded$11 = 0;
                                this.b();
                                if (var3 == 0) {
                                  break L6;
                                } else {
                                  break L26;
                                }
                              } else {
                                break L6;
                              }
                            }
                          }
                          ((wb) this).field_xb = false;
                          ((wb) this).i(5197);
                          if (var3 == 0) {
                            break L6;
                          } else {
                            break L23;
                          }
                        }
                      }
                      L46: {
                        int fieldTemp$12 = ((wb) this).field_lb - 1;
                        ((wb) this).field_lb = ((wb) this).field_lb - 1;
                        if (fieldTemp$12 > 0) {
                          break L46;
                        } else {
                          ((wb) this).b(4, -27655);
                          if (var3 == 0) {
                            break L6;
                          } else {
                            break L46;
                          }
                        }
                      }
                      L47: {
                        if (((wb) this).field_z >= ((wb) this).field_V) {
                          break L47;
                        } else {
                          ((wb) this).field_z = ((wb) this).field_z + 32768;
                          if (~((wb) this).field_V <= ~((wb) this).field_z) {
                            break L47;
                          } else {
                            ((wb) this).field_z = ((wb) this).field_V;
                            break L47;
                          }
                        }
                      }
                      L48: {
                        if (((wb) this).field_z > ((wb) this).field_V) {
                          ((wb) this).field_z = ((wb) this).field_z - 32768;
                          if (((wb) this).field_V > ((wb) this).field_z) {
                            ((wb) this).field_z = ((wb) this).field_V;
                            break L48;
                          } else {
                            break L48;
                          }
                        } else {
                          break L48;
                        }
                      }
                      L49: {
                        if (((wb) this).field_E >= ((wb) this).field_L) {
                          break L49;
                        } else {
                          ((wb) this).field_E = ((wb) this).field_E + 32768;
                          if (((wb) this).field_E > ((wb) this).field_L) {
                            ((wb) this).field_E = ((wb) this).field_L;
                            break L49;
                          } else {
                            break L49;
                          }
                        }
                      }
                      L50: {
                        if (~((wb) this).field_E < ~((wb) this).field_L) {
                          ((wb) this).field_E = ((wb) this).field_E - 32768;
                          if (((wb) this).field_E < ((wb) this).field_L) {
                            ((wb) this).field_E = ((wb) this).field_L;
                            break L50;
                          } else {
                            break L50;
                          }
                        } else {
                          break L50;
                        }
                      }
                      if (((wb) this).field_ab != 0) {
                        break L6;
                      } else {
                        if (((wb) this).field_Q == 0) {
                          var2_int = 30 - -hp.a((byte) 22, g.field_a, 5);
                          ((wb) this).field_U = qq.b(1481485697, var2_int);
                          if (var3 == 0) {
                            break L6;
                          } else {
                            break L11;
                          }
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  L51: {
                    ((wb) this).field_yb = ((wb) this).field_yb + 1;
                    if (((wb) this).field_yb == 0) {
                      break L51;
                    } else {
                      if (((wb) this).field_yb <= 100) {
                        break L6;
                      } else {
                        ((wb) this).b(4, -27655);
                        if (var3 == 0) {
                          break L6;
                        } else {
                          break L51;
                        }
                      }
                    }
                  }
                  ((wb) this).field_E = ((wb) this).field_vb;
                  ((wb) this).field_z = ((wb) this).field_Ob;
                  if (var3 == 0) {
                    break L6;
                  } else {
                    break L9;
                  }
                }
              }
              L52: {
                if (0 < ((wb) this).field_sb) {
                  ((wb) this).field_sb = ((wb) this).field_sb - 1;
                  break L52;
                } else {
                  break L52;
                }
              }
              L53: {
                int discarded$13 = 1;
                this.c();
                ((wb) this).i(5197);
                if (!((wb) this).field_Bb) {
                  break L53;
                } else {
                  if (((wb) this).field_qb >= 128) {
                    break L53;
                  } else {
                    ((wb) this).field_qb = ((wb) this).field_qb + 8;
                    break L53;
                  }
                }
              }
              L54: {
                if (((wb) this).k(-71)) {
                  break L54;
                } else {
                  if (0 != ((wb) this).field_X) {
                    break L6;
                  } else {
                    if (((wb) this).field_S != 0) {
                      break L6;
                    } else {
                      break L54;
                    }
                  }
                }
              }
              int discarded$14 = 6;
              this.m();
              if (var3 == 0) {
                break L6;
              } else {
                break L8;
              }
            }
          }
          L55: {
            if (((wb) this).field_ab != gg.field_j[31] / 4) {
              break L55;
            } else {
              L56: {
                if (!((wb) this).i((byte) -54)) {
                  break L56;
                } else {
                  L57: {
                    if (!((wb) this).field_Bb) {
                      break L57;
                    } else {
                      ((wb) this).t(16);
                      ((wb) this).a(-4564);
                      break L57;
                    }
                  }
                  ((wb) this).field_gb = null;
                  break L56;
                }
              }
              ((wb) this).field_Lb = ((wb) this).field_ib;
              break L55;
            }
          }
          if (~(-1 + gg.field_j[31]) == ~((wb) this).field_ab) {
            ((wb) this).b(4, -27655);
            break L6;
          } else {
            break L6;
          }
        }
        L58: {
          if (null == op.field_m) {
            break L58;
          } else {
            if (!op.field_m.field_c) {
              break L58;
            } else {
              if (((wb) this).o(109)) {
                break L58;
              } else {
                L59: {
                  L60: {
                    if ((13 * op.field_m.field_H + 17 * ((wb) this).field_y) % 71 != 0) {
                      break L60;
                    } else {
                      if (((wb) this).field_K != 9) {
                        break L59;
                      } else {
                        break L60;
                      }
                    }
                  }
                  if ((25 * ((wb) this).field_y - -(op.field_m.field_H * 37)) % 59 != 0) {
                    break L58;
                  } else {
                    if (((wb) this).field_K == 17) {
                      break L58;
                    } else {
                      int discarded$15 = 0;
                      this.b();
                      if (var3 == 0) {
                        break L58;
                      } else {
                        break L59;
                      }
                    }
                  }
                }
                int discarded$16 = -119;
                boolean discarded$17 = this.n();
                break L58;
              }
            }
          }
        }
    }

    wb(int param0, int param1, int param2) {
        super(param0, param1, param2, 57344);
        ((wb) this).field_qb = 0;
        ((wb) this).field_Eb = null;
        ((wb) this).field_wb = false;
        ((wb) this).field_Kb = 0;
        ((wb) this).field_ob = 0;
        ((wb) this).field_yb = 0;
        ((wb) this).field_xb = false;
        ((wb) this).field_mb = 0;
        ((wb) this).field_lb = 0;
        ((wb) this).field_cb = 0;
        ((wb) this).field_rb = false;
        ((wb) this).field_pb = 0;
        ((wb) this).field_Cb = false;
        ((wb) this).field_Bb = false;
        ((wb) this).field_jb = null;
        ((wb) this).field_zb = false;
        ((wb) this).field_Gb = false;
        try {
            ((wb) this).field_X = 0;
            ((wb) this).field_S = 0;
            int discarded$0 = hp.a((byte) 57, g.field_a, 5);
            int discarded$1 = hp.a((byte) 82, g.field_a, 120);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "wb.<init>(" + param0 + 44 + param1 + 44 + param2 + 41);
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
                ((wb) this).field_Bb = true;
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  if (!((wb) this).field_xb) {
                    break L4;
                  } else {
                    if (((wb) this).field_K == 33) {
                      break L4;
                    } else {
                      if (((wb) this).field_K != 29) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                if (((wb) this).field_K == 9) {
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
          throw fa.a((Throwable) (Object) var2, "wb.V(" + param0 + 41);
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
                ((wb) this).b(22, -27655);
                param1.b(22, -27655);
                if (((wb) this).field_z >= param1.field_z) {
                  break L2;
                } else {
                  ((wb) this).field_F = 1;
                  if (!ZombieDawnMulti.field_E) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((wb) this).field_F = 3;
              break L1;
            }
            L3: {
              param1.field_F = 4 + -((wb) this).field_F;
              if (!param0) {
                break L3;
              } else {
                ((wb) this).field_qb = -98;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("wb.FA(").append(param0).append(44);
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L4;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
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
            ((wb) this).field_Bb = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "wb.L(" + param0 + 41);
        }
    }

    private final void b() {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              int fieldTemp$2 = ((wb) this).field_ob;
              ((wb) this).field_ob = ((wb) this).field_ob - 1;
              if (0 < fieldTemp$2) {
                break L1;
              } else {
                if (((wb) this).field_K != 9) {
                  L2: {
                    if (((wb) this).field_K != 8) {
                      break L2;
                    } else {
                      if (((wb) this).field_Eb != null) {
                        ((wb) this).field_Eb.l(-95);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  ((wb) this).b(9, -27655);
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "wb.J(" + 0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Ab = 0;
    }
}
