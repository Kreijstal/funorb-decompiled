/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qu {
    private double field_f;
    private boolean field_b;
    private double field_h;
    static Object field_j;
    static int field_k;
    private int[] field_g;
    private double field_m;
    private double field_a;
    private int[] field_c;
    private double field_e;
    static float[][] field_i;
    private static int field_l;
    private double field_d;

    private final void b(int param0) {
        int[][] stackIn_25_0 = null;
        int[][] stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int[][] stackIn_33_0 = null;
        int[][] stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int[][] stackIn_41_0 = null;
        int[][] stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ha var2 = null;
        RuntimeException var2_ref = null;
        int var3_int = 0;
        int[] var3 = null;
        int var4_int = 0;
        gw var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var2 = nq.field_h.a(param0 ^ -80);
            if (param0 == 60) {
              L1: {
                L2: {
                  if (0 == lg.field_c % 500) {
                    break L2;
                  } else {
                    if (null == this.field_c) {
                      break L2;
                    } else {
                      if (this.field_g == null) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
                L3: {
                  var3_int = oh.field_e % 6;
                  if (var3_int == -1) {
                    var3_int = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  var4_int = (tl.field_t + 1) % bi.field_a[var3_int].length;
                  var5 = (2 + tl.field_t) % bi.field_a[var3_int].length;
                  var6 = bi.field_a[var3_int][tl.field_t];
                  var7 = bi.field_a[var3_int][var4_int];
                  var8 = bi.field_a[var3_int][var5];
                  if (!uk.field_ob) {
                    break L4;
                  } else {
                    L5: {
                      if (2 > kr.field_e) {
                        break L5;
                      } else {
                        L6: {
                          stackIn_25_0 = bi.field_a;

                          if ((var3_int - 1) % 6 < 0) {
                            stackIn_26_0 = (int[][]) ((Object) stackIn_25_0);
                            stackIn_26_1 = 5;
                            break L6;
                          } else {

                            stackIn_26_0 = (int[][]) ((Object) stackIn_25_0);
                            stackIn_26_1 = (var3_int + -1) % 6;
                            break L6;
                          }
                        }
                        var7 = stackIn_26_0[stackIn_26_1][var4_int];
                        break L5;
                      }
                    }
                    L7: {
                      if (-2 >= (kr.field_e ^ -1)) {
                        L8: {
                          stackIn_33_0 = bi.field_a;

                          if (0 > (var3_int - 1) % 6) {
                            stackIn_34_0 = (int[][]) ((Object) stackIn_33_0);
                            stackIn_34_1 = 5;
                            break L8;
                          } else {
                            stackIn_34_0 = (int[][]) ((Object) stackIn_33_0);
                            stackIn_34_1 = (var3_int + -1) % 6;
                            break L8;
                          }
                        }
                        var6 = stackIn_34_0[stackIn_34_1][tl.field_t];
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L9: {
                      if ((kr.field_e ^ -1) == -4) {
                        L10: {
                          stackIn_41_0 = bi.field_a;

                          if (0 > (-1 + var3_int) % 6) {
                            stackIn_42_0 = (int[][]) ((Object) stackIn_41_0);
                            stackIn_42_1 = 5;
                            break L10;
                          } else {
                            stackIn_42_0 = (int[][]) ((Object) stackIn_41_0);
                            stackIn_42_1 = (-1 + var3_int) % 6;
                            break L10;
                          }
                        }
                        var8 = stackIn_42_0[stackIn_42_1][var5];
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    kr.field_e = kr.field_e - 1;
                    if (-1 <= (kr.field_e ^ -1)) {
                      uk.field_ob = false;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                this.field_c = nf.a(var6, (byte) -117, 501, var7);
                this.field_g = nf.a(var7, (byte) -87, 501, var8);
                tl.field_t = tl.field_t + 1;
                if ((bi.field_a[var3_int].length ^ -1) < (tl.field_t ^ -1)) {
                  break L1;
                } else {
                  tl.field_t = 0;
                  break L1;
                }
              }
              var3 = nf.a(this.field_c[lg.field_c % 500], (byte) -118, 480, this.field_g[lg.field_c % 500]);
              var4_int = 0;
              L11: while (true) {
                if ((var4_int ^ -1) <= -481) {
                  L12: {
                    if (-1 != (ul.field_f ^ -1)) {
                      break L12;
                    } else {
                      ej.field_i.a((int)this.field_a, (int)this.field_f, 0, 1140850688, 1);
                      if (null != ni.field_e) {
                        var4 = (gw) ((Object) ni.field_e.b(125));
                        L13: while (true) {
                          if (var4 == null) {
                            break L12;
                          } else {
                            var4.a(var2, -123);
                            var4 = (gw) ((Object) ni.field_e.d((byte) 18));
                            continue L13;
                          }
                        }
                      } else {
                        break L12;
                      }
                    }
                  }
                  L14: {
                    if (ul.field_f != 1) {
                      this.b(-109, var2);
                      break L14;
                    } else {
                      this.a(24, var2);
                      break L14;
                    }
                  }
                  lg.field_c = lg.field_c + 1;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var2.a(var3[var4_int] - 16777216, param0 + 23, var4_int, 640, 0);
                  var4_int++;
                  continue L11;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2_ref), "qu.I(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, ha param1) {
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            ml.field_w[2].a(0, 0);
            ml.field_w[3].a(608, 0);
            ml.field_w[0].a(0, 448);
            ml.field_w[1].a(608, 448);
            var3_int = 0;
            var4 = (lg.field_c >> -2079652639) % ok.field_f.length;
            var5 = 32;
            L1: while (true) {
              L2: {
                if ((var5 ^ -1) <= -609) {
                  var5 = 48;
                  L3: while (true) {
                    stackIn_12_0 = -449;
                    stackIn_12_1 = var5 ^ -1;
                    if (stackIn_12_0 >= stackIn_12_1) {
                      break L2;
                    } else {
                      ff.field_k[0].a(9, -16 + var5, 1, var3_int << 366195576, 1);
                      ff.field_k[0].a(598, var5 - 16, 1, var3_int << -1564699176, 1);
                      var4++;
                      stackIn_15_0 = ok.field_f.length ^ -1;
                      stackIn_15_1 = var4 ^ -1;
                      L4: {
                        if (stackIn_15_0 == stackIn_15_1) {
                          var4 = 0;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var5 = var5 + ok.field_f[0].c();
                      continue L3;
                    }
                  }
                } else {
                  ok.field_f[0].a(var5, 5, 1, var3_int << -905102216, 1);
                  var4++;
                  ok.field_f[0].a(var5, 440, 1, var3_int << -93168936, 1);
                  stackIn_12_0 = var4;

                  stackIn_12_1 = ok.field_f.length;

                  L7: {
                    if (stackIn_12_0 == stackIn_12_1) {
                      var4 = 0;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  var5 = var5 + ok.field_f[0].c();
                  continue L1;
                }
              }
              L8: {
                if (param0 == 24) {
                  break L8;
                } else {
                  this.f(-88);
                  break L8;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var3);

            stackIn_28_1 = new StringBuilder().append("qu.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L9;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L9;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
        }
    }

    final void a(int param0, ha param1, boolean param2) {
        int stackIn_30_0 = 0;
        to stackIn_40_0 = null;
        Object stackIn_50_0 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        to stackOut_39_0;
        nm var4 = null;
        int var4_int = 0;
        tl var4_ref = null;
        to var4_ref2 = null;
        nt var4_ref3 = null;
        RuntimeException var4_ref4 = null;
        ah var5 = null;
        int var6 = 0;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              param1.GA(0);
              this.b(60);
              if (null == is.field_c) {
                break L1;
              } else {
                var4 = (nm) ((Object) is.field_c.b(-81));
                L2: while (true) {
                  if (var4 == null) {
                    break L1;
                  } else {
                    var4.a(param1, -15687169);
                    var4 = (nm) ((Object) is.field_c.d((byte) 18));
                    continue L2;
                  }
                }
              }
            }
            L3: {
              if (aa.field_a == null) {
                break L3;
              } else {
                var4_int = 0;
                L4: while (true) {
                  if ((var4_int ^ -1) <= (aa.field_a.length ^ -1)) {
                    break L3;
                  } else {
                    L5: {
                      var5 = aa.field_a[var4_int];
                      if (null != var5) {
                        var5.a(param1, 19399);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var4_int++;
                    continue L4;
                  }
                }
              }
            }
            L6: {
              if (null == bj.field_b) {
                break L6;
              } else {
                var4_ref = (tl) ((Object) bj.field_b.b(-90));
                L7: while (true) {
                  if (var4_ref == null) {
                    break L6;
                  } else {
                    var4_ref.a(-62, param1);
                    var4_ref = (tl) ((Object) bj.field_b.d((byte) 18));
                    continue L7;
                  }
                }
              }
            }
            L8: {
              if (60 > fa.field_b) {
                L9: {
                  if (fa.field_b <= 30) {
                    stackIn_30_0 = fa.field_b;
                    break L9;
                  } else {
                    stackIn_30_0 = 30;
                    break L9;
                  }
                }
                var4_int = stackIn_30_0;
                if (0 != ul.field_f) {
                  pn.field_t.a((ua.field_d >> 757831592) + -(pn.field_t.c() >> -1597786623), (field_l >> 876231784) - (pn.field_t.a() >> 213918945), 1, 0, 2);
                  break L8;
                } else {
                  ng.field_f[1].a((float)(64 + (ua.field_d >> -1851035384)), (float)(field_l >> -1471480856), 4096, 0, 1, 0, 2);
                  ng.field_f[1].a((float)((ua.field_d >> 128595208) + -64), (float)(field_l >> 1224162376), 4096, 32768, 1, 0, 2);
                  ng.field_f[1].a((float)(ua.field_d >> -1944095928), (float)((field_l >> -495848376) + 64), 4096, 49152, 1, 0, 2);
                  ng.field_f[1].a((float)(ua.field_d >> -362503640), (float)(-64 + (field_l >> -1878274360)), 4096, 16384, 1, 0, 2);
                  ng.field_f[0].a((float)(ua.field_d >> -135353592), (float)(field_l >> -1258680760), (int)((double)var4_int * 97.52380952380952), 0, 1, 0, 2);
                  break L8;
                }
              } else {
                break L8;
              }
            }
            L10: {
              L11: {
                L12: {
                  if (td.field_m) {
                    break L12;
                  } else {
                    var4_ref2 = (to) ((Object) ig.field_b.b(-59));
                    L13: while (true) {
                      if (var4_ref2 == null) {
                        break L12;
                      } else {
                        stackOut_39_0 = (to) (var4_ref2);
                        stackIn_50_0 = stackOut_39_0;
                        stackIn_40_0 = stackOut_39_0;
                        L14: {
                          if (stackIn_40_0 != null) {
                            var4_ref2.a((byte) -70);
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        var4_ref2 = (to) ((Object) ig.field_b.d((byte) 18));
                        continue L13;
                      }
                    }
                  }
                }
                if (rc.field_m != null) {
                  stackIn_50_0 = rc.field_m.b(-84);
                  break L11;
                } else {
                  break L10;
                }
              }
              var4_ref3 = (nt) ((Object) stackIn_50_0);
              L15: while (true) {
                if (null == var4_ref3) {
                  break L10;
                } else {
                  var4_ref3.a(param1, -127);
                  var4_ref3 = (nt) ((Object) rc.field_m.d((byte) 18));
                  continue L15;
                }
              }
            }
            L16: {
              this.a((byte) -106, param1);
              uc.a(param1, false);
              if (param0 >= 117) {
                break L16;
              } else {
                this.a(6, 60, (String) null);
                break L16;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var4_ref4 = decompiledCaughtException;
            stackIn_62_0 = (RuntimeException) (var4_ref4);

            stackIn_62_1 = new StringBuilder().append("qu.S(").append(param0).append(',');

            if (param1 == null) {
              stackIn_63_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackIn_63_2 = "null";
              break L17;
            } else {
              stackIn_63_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackIn_63_2 = "{...}";
              break L17;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_63_0), stackIn_63_2 + ',' + param2 + ')');
        }
    }

    private final void e(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        cb var3 = null;
        nm var4 = null;
        int var5 = 0;
        ah var6 = null;
        int var7 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            var3 = new cb(is.field_c);
            if (param0 >= 59) {
              var4 = (nm) ((Object) var3.b((byte) -80));
              L1: while (true) {
                if (var4 == null) {
                  L2: {
                    if (var2_int == 0) {
                      mb.field_b = -1;
                      lf.b((byte) -128);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var4.a(1048149637);
                  var5 = 0;
                  L3: while (true) {
                    if ((var5 ^ -1) <= (aa.field_a.length ^ -1)) {
                      var4 = (nm) ((Object) var3.b(0));
                      continue L1;
                    } else {
                      L4: {
                        var6 = aa.field_a[var5];
                        if (null == var6) {
                          break L4;
                        } else {
                          if (!var4.c(var6, 2145812808)) {
                            break L4;
                          } else {
                            var2_int = 1;
                            var4.b(var6, 16776960);
                            break L4;
                          }
                        }
                      }
                      var5++;
                      continue L3;
                    }
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
          runtimeException = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) runtimeException), "qu.P(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void c(byte param0) {
        try {
            po.field_a = false;
            if (param0 != 112) {
                field_i = (float[][]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "qu.O(" + param0 + ')');
        }
    }

    final static void a(int param0, gk param1, int param2, int param3, int param4, int param5, byte param6, int param7) {
        int stackIn_25_0 = 0;
        int[] stackIn_28_0 = null;
        int[] stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_47_0 = 0;
        l stackIn_63_0 = null;
        int stackIn_71_0 = 0;
        int stackIn_76_0 = 0;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_83_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        gk var8 = null;
        int[] var8_array = null;
        RuntimeException var8_ref = null;
        byte[] var9 = null;
        int[] var9_array = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        l var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        var40 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var8 = param1;
                if (null == var8.field_a) {
                  break L2;
                } else {
                  if (-2 <= (var8.field_E ^ -1)) {
                    break L2;
                  } else {
                    var9 = var8.field_a;
                    za.a(var9, cv.field_G, 0, 0, 0);
                    break L1;
                  }
                }
              }
              vf.a(0);
              break L1;
            }
            if (param6 < -1) {
              var8_array = new int[param1.field_c];
              var9_array = new int[param1.field_c];
              var10 = of.field_t;
              var11 = r.field_r;
              var12 = qr.field_d;
              var13 = 0;
              L3: while (true) {
                L4: {
                  if (var13 >= param1.field_c) {
                    stackIn_31_0 = 0;
                    break L4;
                  } else {
                    var14 = param4 * var12[var13] + (param0 * var10[var13] + var11[var13] * param7) >> 1897625512;
                    stackIn_31_0 = var14;

                    L5: {
                      if (stackIn_31_0 >= 0) {
                        break L5;
                      } else {
                        var14 = -var14;
                        break L5;
                      }
                    }
                    L6: {
                      if (0 > var14) {
                        stackIn_25_0 = 128;
                        break L6;
                      } else {
                        if (-129 >= (var14 ^ -1)) {
                          stackIn_25_0 = 256;
                          break L6;
                        } else {
                          stackIn_25_0 = var14 + 128;
                          break L6;
                        }
                      }
                    }
                    L7: {
                      var14 = stackIn_25_0;
                      var15 = param3 * var10[var13] + (var11[var13] * param5 - -(var12[var13] * param2)) >> 1422470888;
                      stackIn_28_0 = sq.field_a;

                      if ((var15 ^ -1) > -1) {
                        stackIn_29_0 = (int[]) ((Object) stackIn_28_0);
                        stackIn_29_1 = -var15;
                        break L7;
                      } else {
                        stackIn_29_0 = (int[]) ((Object) stackIn_28_0);
                        stackIn_29_1 = var15;
                        break L7;
                      }
                    }
                    var15 = stackIn_29_0[stackIn_29_1];
                    var14 = var14 * (256 + -var15) >>> -1080569816;
                    var8_array[var13] = var14;
                    var9_array[var13] = var15;
                    var13++;
                    continue L3;
                  }
                }
                var13 = stackIn_31_0;
                L8: while (true) {
                  if (sv.field_b <= var13) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    L9: {
                      var14 = Sumoblitz.field_G[var13];
                      var15 = param1.field_A[var14];
                      var16 = param1.field_b[var14];
                      var17 = param1.field_l[var14];
                      if (param1.field_e[var14] < of.field_t.length) {
                        stackIn_39_0 = param1.field_e[var14];
                        break L9;
                      } else {
                        stackIn_39_0 = -1;
                        break L9;
                      }
                    }
                    L10: {
                      var18 = stackIn_39_0;
                      if ((param1.field_k[var14] ^ -1) > (of.field_t.length ^ -1)) {
                        stackIn_43_0 = param1.field_k[var14];
                        break L10;
                      } else {
                        stackIn_43_0 = -1;
                        break L10;
                      }
                    }
                    L11: {
                      var19 = stackIn_43_0;
                      if ((param1.field_h[var14] ^ -1) > (of.field_t.length ^ -1)) {
                        stackIn_47_0 = param1.field_h[var14];
                        break L11;
                      } else {
                        stackIn_47_0 = -1;
                        break L11;
                      }
                    }
                    L12: {
                      L13: {
                        var20 = stackIn_47_0;
                        if (au.field_i == null) {
                          break L13;
                        } else {
                          if (param1.field_K == null) {
                            break L13;
                          } else {
                            if (var14 >= param1.field_K.length) {
                              break L13;
                            } else {
                              if (0 == (param1.field_K[var14] ^ -1)) {
                                break L13;
                              } else {
                                if ((au.field_i.length ^ -1) < (param1.field_K[var14] ^ -1)) {
                                  stackIn_63_0 = au.field_i[param1.field_K[var14]];
                                  break L12;
                                } else {
                                  break L13;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackIn_63_0 = null;
                      break L12;
                    }
                    L14: {
                      L15: {
                        var21 = stackIn_63_0;
                        var22 = we.field_z[var15];
                        var23 = hp.field_o[var15];
                        var24 = we.field_z[var16];
                        var25 = hp.field_o[var16];
                        var26 = we.field_z[var17];
                        var27 = hp.field_o[var17];
                        if (var19 != var18) {
                          break L15;
                        } else {
                          if (var20 != var19) {
                            break L15;
                          } else {
                            L16: {
                              var28 = var8_array[var18];
                              var29 = var9_array[var18];
                              if (null == var21) {
                                stackIn_71_0 = 8355711;
                                break L16;
                              } else {
                                stackIn_71_0 = var21.field_b;
                                break L16;
                              }
                            }
                            var30 = stackIn_71_0;
                            var31 = 16711935 & var30;
                            var32 = 65280 & var30;
                            var33 = (-16711696 & var31 * var28) >>> 1060445288 | (16711739 & var28 * var32) >>> -339014136;
                            var33 = var33 + var29 * 65793;
                            sd.a(var24, 8355711 & var33 >> -1389733983, var27, (byte) 27, var25, var23, var26, var22);
                            break L14;
                          }
                        }
                      }
                      L17: {
                        var28 = var8_array[var18];
                        var29 = var8_array[var19];
                        var30 = var8_array[var20];
                        var31 = var9_array[var18];
                        var32 = var9_array[var19];
                        var33 = var9_array[var20];
                        if (null != var21) {
                          stackIn_76_0 = var21.field_b;
                          break L17;
                        } else {
                          stackIn_76_0 = 8355711;
                          break L17;
                        }
                      }
                      var34 = stackIn_76_0;
                      var35 = 16711935 & var34;
                      var36 = 65280 & var34;
                      var37 = (-16711691 & var35 * var28) >>> -2085040184 | -1862205696 & var28 * var36 >>> -1247821432;
                      var38 = (16711795 & var29 * var36) >>> -100790424 | var29 * var35 >>> 1999541512 & 1711210751;
                      var38 = var38 + var32 * 65793;
                      var37 = var37 + 65793 * var31;
                      var39 = (16711933 & var30 * var36) >>> 732356136 | (var35 * var30 & -16711934) >>> 1053491816;
                      var39 = var39 + var33 * 65793;
                      hi.a(var26, var39 >> 1829377648, var27, (byte) 27, 255 & var37, var22, var38 >> -1528119856, (var39 & 65340) >> 453663720, var25, var37 >> -2075533136, (65513 & var38) >> 837660168, var39 & 255, var23, var38 & 255, (65436 & var37) >> -71168760, var24);
                      break L14;
                    }
                    var13++;
                    continue L8;
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
          L18: {
            var8_ref = decompiledCaughtException;
            stackIn_82_0 = (RuntimeException) (var8_ref);

            stackIn_82_1 = new StringBuilder().append("qu.T(").append(param0).append(',');

            if (param1 == null) {
              stackIn_83_0 = (RuntimeException) ((Object) stackIn_82_0);
              stackIn_83_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackIn_83_2 = "null";
              break L18;
            } else {
              stackIn_83_0 = (RuntimeException) ((Object) stackIn_82_0);
              stackIn_83_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackIn_83_2 = "{...}";
              break L18;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_83_0), stackIn_83_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void f(byte param0) {
        RuntimeException runtimeException = null;
        gw var2 = null;
        int var3 = 0;
        int var4 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var2 = (gw) ((Object) ni.field_e.b(-68));
            L1: while (true) {
              L2: {
                if (null == var2) {
                  stackIn_11_0 = 61 / ((-13 - param0) / 54);
                  break L2;
                } else {
                  stackOut_3_0 = var2.a(-2567);
                  stackIn_11_0 = stackOut_3_0 ? 1 : 0;
                  stackIn_4_0 = stackOut_3_0;
                  L3: {
                    if (!stackIn_4_0) {
                      break L3;
                    } else {
                      var2.b(false);
                      break L3;
                    }
                  }
                  var2 = (gw) ((Object) ni.field_e.d((byte) 18));
                  continue L1;
                }
              }
              var3 = stackIn_11_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) runtimeException), "qu.F(" + param0 + ')');
        }
    }

    private final void f(int param0) {
        RuntimeException decompiledCaughtException = null;
        ah var2 = null;
        RuntimeException var2_ref = null;
        tl var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var2 = aa.field_a[0];
            var3 = (tl) ((Object) bj.field_b.b(param0 + 14762));
            L1: while (true) {
              if (var3 == null) {
                L2: {
                  if (param0 == -14854) {
                    break L2;
                  } else {
                    field_k = -94;
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  var3.c(param0 + -16401);
                  if (null == var2) {
                    break L3;
                  } else {
                    var4 = var2.field_m - -var3.a(-127);
                    if (!wn.a(var2.field_z, var4, -127, var3.c((byte) 70), var2.field_C, var3.d(param0 ^ 14936))) {
                      break L3;
                    } else {
                      if (var3.g(0)) {
                        break L3;
                      } else {
                        L4: {
                          var2.a((byte) 88, var3);
                          gn.a(27, true);
                          if (2 != var3.field_n) {
                            if (-1 == (var3.field_n ^ -1)) {
                              hl.field_e = true;
                              rn.a(ee.field_a[0] + "+", var2.field_C >> 824971464, var2.field_z >> 730790632, 32780, 28807);
                              break L4;
                            } else {
                              if ((var3.field_n ^ -1) != -2) {
                                if (3 == var3.field_n) {
                                  cl.field_w = true;
                                  rn.a(ee.field_a[3], var2.field_C >> -75883576, var2.field_z >> 209149352, 16711680, 28807);
                                  break L4;
                                } else {
                                  if (4 != var3.field_n) {
                                    break L4;
                                  } else {
                                    cl.field_w = true;
                                    rn.a(ee.field_a[4], var2.field_C >> 116822024, var2.field_z >> 1703966664, 44031, param0 + 43661);
                                    break L4;
                                  }
                                }
                              } else {
                                cl.field_w = true;
                                rn.a(ee.field_a[1] + "+", var2.field_C >> 1585541864, var2.field_z >> 1280258952, 12714108, param0 + 43661);
                                break L4;
                              }
                            }
                          } else {
                            b.field_c = true;
                            rn.a(ee.field_a[2] + "+", var2.field_C >> 360361960, var2.field_z >> -1335083256, 16732416, 28807);
                            break L4;
                          }
                        }
                        vb.field_E = true;
                        var3.b(false);
                        break L3;
                      }
                    }
                  }
                }
                L5: {
                  if (var3.field_q > 0) {
                    break L5;
                  } else {
                    var3.b(false);
                    break L5;
                  }
                }
                var3 = (tl) ((Object) bj.field_b.d((byte) 18));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2_ref), "qu.E(" + param0 + ')');
        }
    }

    private final void d(byte param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (tg.field_a == 13) {
                po.field_a = true;
                av.a(-7753, false, 1);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (!td.field_m) {
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param0 <= -68) {
                break L3;
              } else {
                field_k = -6;
                break L3;
              }
            }
            if (ku.field_j < 2) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L4: {
                L5: {
                  var2_int = tg.field_a;
                  if (var2_int == 13) {
                    break L5;
                  } else {
                    if (-36 != (var2_int ^ -1)) {
                      if ((var2_int ^ -1) == -35) {
                        break L4;
                      } else {
                        if (var2_int != 56) {
                          if (12 == var2_int) {
                            aa.field_a[0].a(-42, 2);
                            f.field_w = true;
                            break L4;
                          } else {
                            if (11 == var2_int) {
                              aa.field_a[0].a(-34, 1);
                              f.field_w = true;
                              break L4;
                            } else {
                              if ((var2_int ^ -1) == -11) {
                                aa.field_a[0].a(-32, 0);
                                f.field_w = true;
                                break L4;
                              } else {
                                if (-10 != (var2_int ^ -1)) {
                                  break L4;
                                } else {
                                  o.a(0);
                                  gg.a((byte) 87);
                                  f.field_w = true;
                                  break L4;
                                }
                              }
                            }
                          }
                        } else {
                          nd.field_F = nd.field_F + 1;
                          f.field_w = true;
                          break L4;
                        }
                      }
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  if (!hw.field_b[81]) {
                    break L6;
                  } else {
                    gg.a((byte) 125);
                    break L6;
                  }
                }
                f.field_w = true;
                break L4;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "qu.J(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        try {
            field_j = null;
            field_i = (float[][]) null;
            if (param0 <= 33) {
                field_i = (float[][]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "qu.L(" + param0 + ')');
        }
    }

    final void b(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -120) {
                break L1;
              } else {
                this.a(109, (ha) null);
                break L1;
              }
            }
            hb.field_a = null;
            ig.field_b.e(116);
            in.field_z = 0;
            f.field_w = false;
            fb.field_a = 0;
            ha.field_f = 0;
            ts.field_a = 0;
            wj.field_e = 0;
            iw.field_b = 0;
            kn.field_b = 0;
            te.field_c = 0;
            tc.e(101);
            ct.b(true);
            gt.field_bb = true;
            td.field_m = false;
            this.c((byte) 112);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "qu.G(" + param0 + ')');
        }
    }

    private final void b(int param0, ha param1) {
        int stackIn_10_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_35_0 = 0;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            an.field_f.a(26.0f, 26.0f, 4915, 0);
            ju.field_p[0].a(16.0f, 16.0f, 4096, -16384);
            ju.field_p[1].a(16.0f, 16.0f, 4096, -16384);
            an.field_f.a(616.0f, 26.0f, 4915, 0);
            ju.field_p[0].a(624.0f, 16.0f, 4096, 32768);
            ju.field_p[1].a(624.0f, 16.0f, 4096, 32768);
            an.field_f.a(26.0f, 454.0f, 4915, 0);
            ju.field_p[0].a(16.0f, 464.0f, 4096, 0);
            ju.field_p[1].a(16.0f, 464.0f, 4096, 0);
            an.field_f.a(614.0f, 454.0f, 4915, 0);
            ju.field_p[0].a(624.0f, 464.0f, 4096, 16384);
            ju.field_p[1].a(624.0f, 464.0f, 4096, 16384);
            var3_int = 0;
            var4 = (lg.field_c >> 1674121953) % ok.field_f.length;
            var5 = 32;
            L1: while (true) {
              L2: {
                if (var5 >= 608) {
                  stackIn_24_0 = param0;
                  stackIn_24_1 = -76;
                  break L2;
                } else {
                  stackIn_24_0 = -256;

                  stackIn_24_1 = ((var4 << -965883645) + (lg.field_c << -608976670)) % 512 ^ -1;

                  L3: {
                    if (stackIn_24_0 <= stackIn_24_1) {
                      stackIn_10_0 = ((var4 << -496912669) + (lg.field_c << -1899736062)) % 512;
                      break L3;
                    } else {
                      stackIn_10_0 = 512 - ((var4 << 1008403395) + (lg.field_c << -1629282398)) % 512;
                      break L3;
                    }
                  }
                  L4: {
                    var3_int = stackIn_10_0;
                    if ((var3_int ^ -1) < -241) {
                      var3_int = 240;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if ((var3_int ^ -1) > -21) {
                      var3_int = 20;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    ok.field_f[0].a((float)(var5 + 16), 25.0f, 4096, 0, 3, var3_int << -1918863432, 1);
                    var4++;
                    ok.field_f[0].a((float)(var5 - -16), 454.0f, 4096, 0, 3, var3_int << -1208636296, 1);
                    if ((ok.field_f.length ^ -1) == (var4 ^ -1)) {
                      var4 = 0;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  var5 = var5 + ok.field_f[0].c();
                  continue L1;
                }
              }
              L7: {
                if (stackIn_24_0 < stackIn_24_1) {
                  break L7;
                } else {
                  qu.a(84, (gk) null, -85, 57, -45, 101, (byte) 84, -26);
                  break L7;
                }
              }
              var5 = 48;
              L8: while (true) {
                if (var5 >= 448) {
                  break L0;
                } else {
                  L9: {
                    if (255 < ((var4 << -1464876221) + (lg.field_c << 270917026)) % 512) {
                      stackIn_35_0 = -(((var4 << -895192509) + (lg.field_c << -1485052030)) % 512) + 512;
                      break L9;
                    } else {
                      stackIn_35_0 = ((lg.field_c << 1548728226) + (var4 << 692222787)) % 512;
                      break L9;
                    }
                  }
                  L10: {
                    var3_int = stackIn_35_0;
                    if (240 < var3_int) {
                      var3_int = 240;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if ((var3_int ^ -1) > -21) {
                      var3_int = 20;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    ok.field_f[0].a(25.0f, (float)var5, 4096, 16384, 3, var3_int << 408481080, 1);
                    var4++;
                    ok.field_f[0].a(614.0f, (float)var5, 4096, 16384, 3, var3_int << -1808154120, 1);
                    if (ok.field_f.length != var4) {
                      break L12;
                    } else {
                      var4 = 0;
                      break L12;
                    }
                  }
                  var5 = var5 + ok.field_f[0].c();
                  continue L8;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var3 = decompiledCaughtException;
            stackIn_50_0 = (RuntimeException) (var3);

            stackIn_50_1 = new StringBuilder().append("qu.N(").append(param0).append(',');

            if (param1 == null) {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "null";
              break L13;
            } else {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "{...}";
              break L13;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_51_0), stackIn_51_2 + ')');
        }
    }

    final void a(boolean param0, byte param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        boolean stackIn_29_0 = false;
        boolean stackIn_149_0 = false;
        int stackIn_156_0 = 0;
        int stackIn_229_0 = 0;
        Object stackIn_332_0 = null;
        ah stackIn_332_1 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_148_0;
        nt var3 = null;
        ah var3_ref = null;
        to var3_ref2 = null;
        RuntimeException var3_ref3 = null;
        int var4_int = 0;
        ah var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                L2: while (true) {
                  if (!wd.c(-112)) {
                    break L1;
                  } else {
                    this.d((byte) -122);
                    continue L2;
                  }
                }
              }
            }
            L3: {
              if (ul.field_f != 0) {
                break L3;
              } else {
                this.c(2500);
                break L3;
              }
            }
            L4: {
              this.field_f = this.field_f + this.field_d;
              this.field_a = this.field_a + this.field_e;
              if (null == ni.field_e) {
                break L4;
              } else {
                if (-1 == (ul.field_f ^ -1)) {
                  this.f((byte) 55);
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              L6: {
                if (null == rc.field_m) {
                  break L6;
                } else {
                  var3 = (nt) ((Object) rc.field_m.b(95));
                  L7: while (true) {
                    if (null == var3) {
                      break L6;
                    } else {
                      stackIn_29_0 = var3.a(-2567);

                      L8: {
                        if (!stackIn_29_0) {
                          break L8;
                        } else {
                          var3.b(false);
                          break L8;
                        }
                      }
                      var3 = (nt) ((Object) rc.field_m.d((byte) 18));
                      continue L7;
                    }
                  }
                }
              }
              stackIn_29_0 = po.field_a;
              break L5;
            }
            if (stackIn_29_0) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!ld.field_N.a(false)) {
                if (!cd.a(false)) {
                  L9: {
                    if (param1 < -65) {
                      break L9;
                    } else {
                      this.a(-55, (ha) null);
                      break L9;
                    }
                  }
                  L10: {
                    if (iw.field_b - uc.field_f != 100) {
                      break L10;
                    } else {
                      if (td.field_m) {
                        break L10;
                      } else {
                        if (gt.field_bb) {
                          break L10;
                        } else {
                          sj.a(-1, an.field_a, oh.field_e);
                          break L10;
                        }
                      }
                    }
                  }
                  L11: {
                    if (nd.field_F > 0) {
                      ts.field_a = ts.field_a + 8;
                      ha.field_f = ha.field_f + 10;
                      fb.field_a = fb.field_a - 5;
                      kn.field_b = kn.field_b - 3;
                      iw.field_b = iw.field_b + 1;
                      if ((gj.a((byte) -84, 10) ^ -1) > -6) {
                        if (gj.a((byte) -84, 10) < 5) {
                          ha.field_f = ha.field_f - 1;
                          break L11;
                        } else {
                          fb.field_a = fb.field_a - 1;
                          break L11;
                        }
                      } else {
                        if (5 > gj.a((byte) -84, 10)) {
                          ts.field_a = ts.field_a + 1;
                          break L11;
                        } else {
                          kn.field_b = kn.field_b + 1;
                          break L11;
                        }
                      }
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    td.c((byte) 77);
                    if (iw.field_b == uc.field_f) {
                      break L12;
                    } else {
                      if (-1 != ((iw.field_b - uc.field_f) % 50 ^ -1)) {
                        break L12;
                      } else {
                        if (!aj.field_C) {
                          aj.field_C = ig.b(114);
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                    }
                  }
                  if (td.field_m) {
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L13: {
                      qv.a(2);
                      if (is.field_c != null) {
                        this.e((byte) 111);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    L14: {
                      this.d(-112);
                      if (-1 > (gt.field_ab ^ -1)) {
                        gt.field_ab = gt.field_ab - 1;
                        if (tl.field_v >= ps.field_e[11]) {
                          th.b(24753, 244, 11);
                          break L14;
                        } else {
                          break L14;
                        }
                      } else {
                        tl.field_v = 0;
                        break L14;
                      }
                    }
                    L15: {
                      if (aa.field_a[0] == null) {
                        break L15;
                      } else {
                        L16: {
                          if (6 <= oh.field_e) {
                            break L16;
                          } else {
                            if (wm.field_f[6]) {
                              break L16;
                            } else {
                              if (gt.field_bb) {
                                break L16;
                              } else {
                                break L15;
                              }
                            }
                          }
                        }
                        L17: {
                          L18: {
                            if (-1 <= (fa.field_b ^ -1)) {
                              break L18;
                            } else {
                              if (30 < fa.field_b) {
                                break L18;
                              } else {
                                fa.field_b = fa.field_b - 1;
                                break L17;
                              }
                            }
                          }
                          L19: {
                            var3_ref = aa.field_a[0];
                            if (fa.field_b > 0) {
                              break L19;
                            } else {
                              if (var3_ref.g(126)) {
                                break L19;
                              } else {
                                L20: {
                                  if (wn.a(field_l, var3_ref.field_m, -105, var3_ref.field_C, ua.field_d, var3_ref.field_z)) {
                                    L21: {
                                      ro.a(var3_ref, (byte) 113);
                                      if (ul.field_f != 0) {
                                        break L21;
                                      } else {
                                        rc.field_m.a((ms) (new fi(ua.field_d, field_l, -1)), (byte) 39);
                                        break L21;
                                      }
                                    }
                                    gn.a(30, true);
                                    break L20;
                                  } else {
                                    break L20;
                                  }
                                }
                                fa.field_b = 250;
                                break L19;
                              }
                            }
                          }
                          field_l = var3_ref.field_z;
                          ua.field_d = var3_ref.field_C;
                          fa.field_b = fa.field_b - 1;
                          break L17;
                        }
                        L22: {
                          if (fa.field_b == 30) {
                            if (0 == ul.field_f) {
                              rc.field_m.a((ms) (new gb(ua.field_d, field_l, -1)), (byte) 39);
                              break L22;
                            } else {
                              break L22;
                            }
                          } else {
                            break L22;
                          }
                        }
                        L23: {
                          if (30 != fa.field_b) {
                            break L23;
                          } else {
                            gn.a(32, true);
                            break L23;
                          }
                        }
                        if (fa.field_b == 30) {
                          gd.a(10, field_l, rc.field_m, 61, ua.field_d, 16711680);
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                    }
                    var3_ref2 = (to) ((Object) ig.field_b.b(111));
                    L24: while (true) {
                      L25: {
                        if (null == var3_ref2) {
                          stackIn_156_0 = an.field_a ^ -1;
                          break L25;
                        } else {
                          stackOut_148_0 = var3_ref2.a(80);
                          stackIn_156_0 = stackOut_148_0 ? 1 : 0;
                          stackIn_149_0 = stackOut_148_0;
                          L26: {
                            if (stackIn_149_0) {
                              var3_ref2.b(false);
                              break L26;
                            } else {
                              break L26;
                            }
                          }
                          var3_ref2 = (to) ((Object) ig.field_b.d((byte) 18));
                          continue L24;
                        }
                      }
                      L27: {
                        if (stackIn_156_0 != -1) {
                          if ((-sr.field_b + iw.field_b ^ -1) != -6) {
                            if (10 != -sr.field_b + iw.field_b) {
                              break L27;
                            } else {
                              rn.a(ff.field_m, 320, 255, 16776960, 28807);
                              break L27;
                            }
                          } else {
                            rn.a(ff.field_m, 320, 240, 16755456, 28807);
                            break L27;
                          }
                        } else {
                          break L27;
                        }
                      }
                      L28: {
                        L29: {
                          if (!ok.field_b) {
                            break L29;
                          } else {
                            var4_int = 4;
                            var5 = 0;
                            L30: while (true) {
                              if (var5 >= db.field_l) {
                                L31: while (true) {
                                  incrementValue$0 = var4_int;
                                  var4_int--;
                                  if (-1 <= (incrementValue$0 ^ -1)) {
                                    break L29;
                                  } else {
                                    oc.a(uj.a(Math.max(7, fi.a((int)(Math.log((double)in.field_z) / Math.log(10.0)), ki.field_b, (byte) -96)), fi.a(588, ki.field_b, (byte) -96) + 26 << -1146276408, 0, (byte) 84, 26 + fi.a(428, ki.field_b, (byte) -96) << 1972838920), false);
                                    continue L31;
                                  }
                                }
                              } else {
                                stackIn_332_0 = null;

                                stackIn_332_1 = aa.field_a[var5];

                                L32: {
                                  if (stackIn_332_0 != stackIn_332_1) {
                                    var4_int--;
                                    break L32;
                                  } else {
                                    break L32;
                                  }
                                }
                                var5++;
                                continue L30;
                              }
                            }
                          }
                        }
                        L33: {
                          wj.d(22403);
                          if (!param0) {
                            break L33;
                          } else {
                            if (null == aa.field_a[0]) {
                              break L33;
                            } else {
                              ub.a(20);
                              break L33;
                            }
                          }
                        }
                        L34: {
                          if (!kp.field_a) {
                            break L34;
                          } else {
                            km.a((byte) 32);
                            break L34;
                          }
                        }
                        L35: {
                          er.c((byte) 54);
                          if (!gt.field_bb) {
                            L36: {
                              if (aa.field_a[0] == null) {
                                break L36;
                              } else {
                                if (ku.field_J.length <= an.field_a) {
                                  break L36;
                                } else {
                                  if (0 == (an.field_a ^ -1)) {
                                    break L36;
                                  } else {
                                    var4_int = ku.field_J[an.field_a].a(0) + 3 >> 134641474;
                                    var5 = 0;
                                    L37: while (true) {
                                      L38: {
                                        if ((db.field_l ^ -1) >= (var5 ^ -1)) {
                                          stackIn_229_0 = an.field_a;
                                          break L38;
                                        } else {
                                          stackIn_229_0 = var5;

                                          L39: {
                                            if (stackIn_229_0 == 0) {
                                              break L39;
                                            } else {
                                              if (aa.field_a[var5] == null) {
                                                break L39;
                                              } else {
                                                incrementValue$1 = var4_int;
                                                var4_int--;
                                                if (0 < incrementValue$1) {
                                                  break L39;
                                                } else {
                                                  break L36;
                                                }
                                              }
                                            }
                                          }
                                          var5++;
                                          continue L37;
                                        }
                                      }
                                      if (stackIn_229_0 == -1) {
                                        break L36;
                                      } else {
                                        if (aj.field_C) {
                                          L40: {
                                            if ((an.field_a ^ -1) != (-1 + ku.field_J.length ^ -1)) {
                                              sr.field_b = iw.field_b;
                                              rn.a(ff.field_m, 320, 225, 16711680, 28807);
                                              break L40;
                                            } else {
                                              break L40;
                                            }
                                          }
                                          an.field_a = an.field_a + 1;
                                          gn.a(14, true);
                                          ke.a(false);
                                          break L36;
                                        } else {
                                          break L36;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            if (null == ku.field_J) {
                              break L35;
                            } else {
                              if (ku.field_J.length > an.field_a) {
                                break L35;
                              } else {
                                if (!jl.a(-62)) {
                                  break L35;
                                } else {
                                  if (jc.b(true) == 0) {
                                    L41: {
                                      o.a(0);
                                      if (!mq.a(8230, 10)) {
                                        break L41;
                                      } else {
                                        th.b(24753, 239, 16);
                                        if (!sl.a((byte) 90, 10)) {
                                          break L41;
                                        } else {
                                          th.b(24753, 238, 17);
                                          break L41;
                                        }
                                      }
                                    }
                                    L42: {
                                      if (!mq.a(8230, 25)) {
                                        break L42;
                                      } else {
                                        L43: {
                                          th.b(24753, 237, 18);
                                          if (sl.a((byte) 90, 25)) {
                                            th.b(24753, 236, 19);
                                            break L43;
                                          } else {
                                            break L43;
                                          }
                                        }
                                        if (!nn.a(25, 115)) {
                                          break L42;
                                        } else {
                                          th.b(24753, 234, 21);
                                          break L42;
                                        }
                                      }
                                    }
                                    L44: {
                                      if (-11 != (nq.field_i ^ -1)) {
                                        break L44;
                                      } else {
                                        if (!vb.field_E) {
                                          th.b(24753, 251, 4);
                                          break L44;
                                        } else {
                                          break L44;
                                        }
                                      }
                                    }
                                    L45: {
                                      if ((nq.field_i ^ -1) != -6) {
                                        break L45;
                                      } else {
                                        if (hl.field_e) {
                                          break L45;
                                        } else {
                                          th.b(24753, 250, 5);
                                          break L45;
                                        }
                                      }
                                    }
                                    L46: {
                                      if ((nq.field_i ^ -1) != -6) {
                                        break L46;
                                      } else {
                                        if (cl.field_w) {
                                          break L46;
                                        } else {
                                          th.b(24753, 249, 6);
                                          break L46;
                                        }
                                      }
                                    }
                                    L47: {
                                      if ((nq.field_i ^ -1) != -6) {
                                        break L47;
                                      } else {
                                        if (!b.field_c) {
                                          th.b(24753, 248, 7);
                                          break L47;
                                        } else {
                                          break L47;
                                        }
                                      }
                                    }
                                    L48: {
                                      if (og.a(-102)) {
                                        oh.field_e = oh.field_e + 1;
                                        break L48;
                                      } else {
                                        break L48;
                                      }
                                    }
                                    if (ku.field_J == null) {
                                      break L35;
                                    } else {
                                      if ((ku.field_J.length ^ -1) < (an.field_a ^ -1)) {
                                        break L35;
                                      } else {
                                        if (jl.a(-36)) {
                                          break L35;
                                        } else {
                                          if (jc.b(true) != 0) {
                                            break L35;
                                          } else {
                                            L49: {
                                              if (ku.a((byte) -94) <= ps.field_e[20]) {
                                                break L49;
                                              } else {
                                                th.b(24753, 235, 20);
                                                break L49;
                                              }
                                            }
                                            L50: {
                                              if (ld.field_C != 0) {
                                                break L50;
                                              } else {
                                                th.b(24753, 252, 3);
                                                break L50;
                                              }
                                            }
                                            L51: {
                                              if ((oh.field_e ^ -1) != -26) {
                                                break L51;
                                              } else {
                                                L52: {
                                                  if (ki.field_f != 10) {
                                                    break L52;
                                                  } else {
                                                    th.b(24753, 255, 0);
                                                    break L52;
                                                  }
                                                }
                                                L53: {
                                                  if ((iv.field_i ^ -1) == -11) {
                                                    th.b(24753, 254, 1);
                                                    break L53;
                                                  } else {
                                                    break L53;
                                                  }
                                                }
                                                if (hc.field_f != 10) {
                                                  break L51;
                                                } else {
                                                  th.b(24753, 253, 2);
                                                  break L51;
                                                }
                                              }
                                            }
                                            ua.a(35040, new fe(81920, 61440));
                                            av.a(-7753, true, 12);
                                            ag.a(0, 6);
                                            decompiledRegionSelector0 = 4;
                                            break L0;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    break L35;
                                  }
                                }
                              }
                            }
                          } else {
                            if (0 != iw.field_b % 250) {
                              break L35;
                            } else {
                              if ((jc.b(true) ^ -1) > (aa.field_a.length + -1 ^ -1)) {
                                var4 = uj.a(1, fi.a(588, ki.field_b, (byte) -96) + 26 << -900854456, 4, (byte) 84, 26 + fi.a(428, ki.field_b, (byte) -96) << -602599192);
                                oc.a(var4, false);
                                break L35;
                              } else {
                                break L35;
                              }
                            }
                          }
                        }
                        stackIn_332_0 = null;
                        stackIn_332_1 = aa.field_a[0];
                        break L28;
                      }
                      L54: {
                        if (stackIn_332_0 != stackIn_332_1) {
                          break L54;
                        } else {
                          if ((nd.field_F ^ -1) < -1) {
                            L55: {
                              nd.field_F = nd.field_F - 1;
                              if (nd.field_F > 0) {
                                if (gt.field_bb) {
                                  sm.a(72);
                                  break L55;
                                } else {
                                  ds.a(107);
                                  break L55;
                                }
                              } else {
                                jk.field_a = iw.field_b;
                                uq.a(7, 8);
                                av.a(-7753, true, 11);
                                break L55;
                              }
                            }
                            qk.field_T = 0;
                            bi.field_c = 0;
                            break L54;
                          } else {
                            break L54;
                          }
                        }
                      }
                      L56: {
                        if (null != aa.field_a[0]) {
                          L57: {
                            var4 = aa.field_a[0];
                            if (var4.i(-2)) {
                              this.a(231, 6356832, pu.field_a);
                              break L57;
                            } else {
                              break L57;
                            }
                          }
                          if (!var4.g((byte) -59)) {
                            break L56;
                          } else {
                            if (this.field_b) {
                              wd.a((byte) 99, 17);
                              this.field_b = false;
                              break L56;
                            } else {
                              break L56;
                            }
                          }
                        } else {
                          break L56;
                        }
                      }
                      L58: {
                        if (null != bj.field_b) {
                          this.f(-14854);
                          break L58;
                        } else {
                          break L58;
                        }
                      }
                      L59: {
                        lp.a(true);
                        if (!gt.field_bb) {
                          break L59;
                        } else {
                          if (aa.field_a[0] == null) {
                            break L59;
                          } else {
                            L60: {
                              if (300 <= iw.field_b * 20 / 1000) {
                                th.b(24753, 231, 24);
                                break L60;
                              } else {
                                break L60;
                              }
                            }
                            L61: {
                              if (180 <= 20 * iw.field_b / 1000) {
                                th.b(24753, 232, 23);
                                break L61;
                              } else {
                                break L61;
                              }
                            }
                            L62: {
                              if ((20 * iw.field_b / 1000 ^ -1) <= -61) {
                                th.b(24753, 233, 22);
                                break L62;
                              } else {
                                break L62;
                              }
                            }
                            if (rf.a(false)) {
                              L63: {
                                if (-301 < (iw.field_b * 20 / 1000 ^ -1)) {
                                  break L63;
                                } else {
                                  th.b(24753, 228, 27);
                                  break L63;
                                }
                              }
                              L64: {
                                if (-181 < (iw.field_b * 20 / 1000 ^ -1)) {
                                  break L64;
                                } else {
                                  th.b(24753, 229, 26);
                                  break L64;
                                }
                              }
                              if (60 > iw.field_b * 20 / 1000) {
                                break L59;
                              } else {
                                th.b(24753, 230, 25);
                                break L59;
                              }
                            } else {
                              break L59;
                            }
                          }
                        }
                      }
                      decompiledRegionSelector0 = 5;
                      break L0;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                ld.field_N.c(5008);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref3 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var3_ref3), "qu.C(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    private final void a(int param0, int param1, String param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ig.field_b.a((ms) (new to(param2, param1)), (byte) 39);
              if (param0 == 231) {
                break L1;
              } else {
                this.c(-6);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("qu.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    private final void c(int param0) {
        gw stackIn_28_0;
        gw stackIn_28_1;
        int stackIn_28_2;
        int stackIn_28_3;
        int stackIn_28_4;
        int stackIn_28_5;
        int stackIn_28_6;
        gw stackIn_29_0;
        gw stackIn_29_1;
        int stackIn_29_2;
        int stackIn_29_3;
        int stackIn_29_4;
        int stackIn_29_5;
        int stackIn_29_6;
        int stackIn_29_7;
        gw stackIn_51_0;
        gw stackIn_51_1;
        int stackIn_51_2;
        int stackIn_51_3;
        int stackIn_51_4;
        int stackIn_51_5;
        int stackIn_51_6;
        gw stackIn_52_0;
        gw stackIn_52_1;
        int stackIn_52_2;
        int stackIn_52_3;
        int stackIn_52_4;
        int stackIn_52_5;
        int stackIn_52_6;
        int stackIn_52_7;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        double var5 = 0.0;
        int var7 = 0;
        int var8 = 0;
        gw var9 = null;
        int var10 = 0;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (-1 == (lg.field_c % param0 ^ -1)) {
                  break L2;
                } else {
                  if (this.field_h != this.field_a) {
                    break L1;
                  } else {
                    if (this.field_m != this.field_f) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              var2_int = fi.a(640 + ej.field_i.c(), ki.field_b, (byte) -96) - ej.field_i.c();
              var3 = fi.a(480 - -ej.field_i.a(), ki.field_b, (byte) -96) - ej.field_i.a();
              this.field_d = (-this.field_f + (double)var3) / 2500.0;
              this.field_e = (-this.field_a + (double)var2_int) / 2500.0;
              break L1;
            }
            L3: {
              if (-1 != (lg.field_c % 100 ^ -1)) {
                break L3;
              } else {
                if (ni.field_e == null) {
                  break L3;
                } else {
                  L4: {
                    var2_int = 0;
                    var3 = 0;
                    if (0 != fi.a(2, ki.field_b, (byte) -96)) {
                      var3 = fi.a(163840, ki.field_b, (byte) -96);
                      break L4;
                    } else {
                      var2_int = fi.a(163840, ki.field_b, (byte) -96);
                      break L4;
                    }
                  }
                  L5: {
                    var4 = fi.a(65536, ki.field_b, (byte) -96);
                    var5 = Math.random() / 500.0;
                    var7 = 1 + fi.a(256, ki.field_b, (byte) -96);
                    var8 = 1 + fi.a(256, ki.field_b, (byte) -96);
                    if ((fi.a(2, ki.field_b, (byte) -96) ^ -1) != -1) {
                      break L5;
                    } else {
                      if (var2_int <= 0) {
                        if (0 >= var3) {
                          break L5;
                        } else {
                          var2_int = 163840;
                          var7 = var7 * -1;
                          break L5;
                        }
                      } else {
                        var8 = var8 * -1;
                        var3 = 122880;
                        break L5;
                      }
                    }
                  }
                  L6: {
                    stackIn_28_0 = null;

                    stackIn_28_1 = null;

                    stackIn_28_2 = 5000;

                    stackIn_28_3 = var2_int;

                    stackIn_28_4 = var3;

                    stackIn_28_5 = 16777215;

                    stackIn_28_6 = 1;

                    if (oh.field_e > -1) {
                      stackIn_29_0 = null;
                      stackIn_29_1 = null;
                      stackIn_29_2 = stackIn_28_2;
                      stackIn_29_3 = stackIn_28_3;
                      stackIn_29_4 = stackIn_28_4;
                      stackIn_29_5 = stackIn_28_5;
                      stackIn_29_6 = stackIn_28_6;
                      stackIn_29_7 = oh.field_e % 3;
                      break L6;
                    } else {
                      stackIn_29_0 = null;
                      stackIn_29_1 = null;
                      stackIn_29_2 = stackIn_28_2;
                      stackIn_29_3 = stackIn_28_3;
                      stackIn_29_4 = stackIn_28_4;
                      stackIn_29_5 = stackIn_28_5;
                      stackIn_29_6 = stackIn_28_6;
                      stackIn_29_7 = 0;
                      break L6;
                    }
                  }
                  var9 = new gw(stackIn_29_2, stackIn_29_3, stackIn_29_4, stackIn_29_5, stackIn_29_6, stackIn_29_7, (double)var4, var5, var7, var8);
                  ni.field_e.a((ms) (var9), (byte) 39);
                  break L3;
                }
              }
            }
            L7: {
              if ((lg.field_c % 200 ^ -1) != -1) {
                break L7;
              } else {
                if (ni.field_e == null) {
                  break L7;
                } else {
                  L8: {
                    var2_int = 0;
                    var3 = 0;
                    if (0 == fi.a(2, ki.field_b, (byte) -96)) {
                      var2_int = fi.a(163840, ki.field_b, (byte) -96);
                      break L8;
                    } else {
                      var3 = fi.a(163840, ki.field_b, (byte) -96);
                      break L8;
                    }
                  }
                  L9: {
                    var4 = fi.a(65536, ki.field_b, (byte) -96);
                    var5 = Math.random() / 1000.0;
                    var7 = fi.a(64, ki.field_b, (byte) -96) + 1;
                    var8 = 1 + fi.a(64, ki.field_b, (byte) -96);
                    if (fi.a(2, ki.field_b, (byte) -96) == 0) {
                      if (0 >= var2_int) {
                        if ((var3 ^ -1) < -1) {
                          var7 = var7 * -1;
                          var2_int = 163840;
                          break L9;
                        } else {
                          break L9;
                        }
                      } else {
                        var3 = 122880;
                        var8 = var8 * -1;
                        break L9;
                      }
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    stackIn_51_0 = null;

                    stackIn_51_1 = null;

                    stackIn_51_2 = 5000;

                    stackIn_51_3 = var2_int;

                    stackIn_51_4 = var3;

                    stackIn_51_5 = 16777215;

                    stackIn_51_6 = 0;

                    if (0 > (oh.field_e ^ -1)) {
                      stackIn_52_0 = null;
                      stackIn_52_1 = null;
                      stackIn_52_2 = stackIn_51_2;
                      stackIn_52_3 = stackIn_51_3;
                      stackIn_52_4 = stackIn_51_4;
                      stackIn_52_5 = stackIn_51_5;
                      stackIn_52_6 = stackIn_51_6;
                      stackIn_52_7 = oh.field_e % 3;
                      break L10;
                    } else {
                      stackIn_52_0 = null;
                      stackIn_52_1 = null;
                      stackIn_52_2 = stackIn_51_2;
                      stackIn_52_3 = stackIn_51_3;
                      stackIn_52_4 = stackIn_51_4;
                      stackIn_52_5 = stackIn_51_5;
                      stackIn_52_6 = stackIn_51_6;
                      stackIn_52_7 = 0;
                      break L10;
                    }
                  }
                  var9 = new gw(stackIn_52_2, stackIn_52_3, stackIn_52_4, stackIn_52_5, stackIn_52_6, stackIn_52_7, (double)var4, var5, var7, var8);
                  ni.field_e.a((ms) (var9), (byte) 39);
                  break L7;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "qu.R(" + param0 + ')');
        }
    }

    final void e(int param0) {
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              var2_int = 54 / ((-65 - param0) / 47);
              if (null != hb.field_a) {
                break L1;
              } else {
                if (0 >= te.field_c) {
                  break L1;
                } else {
                  if (f.field_w) {
                    break L1;
                  } else {
                    L2: {
                      if (gt.field_bb) {
                        hb.field_a = new id(1, 65534, ha.field_f, fb.field_a, ts.field_a, kn.field_b, new int[]{te.field_c, iw.field_b});
                        break L2;
                      } else {
                        hb.field_a = new id(0, 65535, ha.field_f, fb.field_a, ts.field_a, kn.field_b, new int[]{te.field_c, iw.field_b});
                        break L2;
                      }
                    }
                    L3: {
                      if (vs.b((byte) 9)) {
                        break L3;
                      } else {
                        kp.a(3, hb.field_a, 79);
                        break L3;
                      }
                    }
                    hb.field_a = null;
                    break L1;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "qu.D(" + param0 + ')');
        }
    }

    private final void d(int param0) {
        try {
            if (td.field_m) {
            }
            int var2_int = 31 / ((-57 - param0) / 49);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "qu.Q(" + param0 + ')');
        }
    }

    private final void a(byte param0, ha param1) {
        int stackIn_36_0 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        pm var3 = null;
        RuntimeException var3_ref = null;
        fe var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 <= -75) {
              L1: {
                L2: {
                  var3 = wq.a(param1, (byte) 36);
                  if (0 != nd.field_F) {
                    break L2;
                  } else {
                    if (!td.field_m) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (td.field_m) {
                  break L1;
                } else {
                  L3: {
                    var4 = (fe) ((Object) aa.field_a[0]);
                    if (gt.field_bb) {
                      break L3;
                    } else {
                      if (ku.field_J != null) {
                        to.field_s[0].a(55, 0);
                        to.field_s[1].a(to.field_s[0].c() + 55, 0);
                        var5 = 55 - -(to.field_s[1].c() * 2);
                        L4: while (true) {
                          if (var5 >= 530) {
                            to.field_s[3].a(-to.field_s[4].c() + 567, 0);
                            to.field_s[4].a(567, 0);
                            qv.field_k.a(19, 85, -11753985, ps.field_b + "" + in.field_z, (byte) -21, -1);
                            uq.field_a.a(19, 85, -4720129, "<col=ffffff>" + ps.field_b + "</col>" + in.field_z, (byte) -18, -1);
                            qv.field_k.a(-1, 560, pl.field_x + "" + (oh.field_e + 1) + " " + fq.field_e + "" + pd.field_p + "x " + as.field_x + "" + nd.field_F + "", 19, -11753985, 74);
                            uq.field_a.a(-1, 560, "<col=ffffff> " + pl.field_x + "</col>" + (1 + oh.field_e) + "<col=ffffff> " + fq.field_e + "</col>" + pd.field_p + "x" + "<col=ffffff> " + as.field_x + "</col>" + nd.field_F + "", 19, -4720129, 120);
                            break L3;
                          } else {
                            to.field_s[2].a(var5, 0);
                            var5 = var5 + to.field_s[1].c();
                            continue L4;
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  mu.field_B[0].a(139, 448);
                  mu.field_B[1].a(-16 + to.field_s[0].c() + 155, 448);
                  var5 = 145 + 2 * to.field_s[1].c();
                  L5: while (true) {
                    if (var5 >= 408) {
                      L6: {
                        mu.field_B[3].a(-to.field_s[4].c() + 475 - 16, 448);
                        mu.field_B[4].a(459, 448);
                        qv.field_k.a(473, 320, -11753985, tj.field_l + dp.b(iw.field_b, -23620) + "", (byte) -73, -1);
                        uq.field_a.a(473, 320, -4720129, "<col=ffffff>" + tj.field_l + "</col>" + dp.b(iw.field_b, -23620) + "</col>", (byte) -76, -1);
                        if (gt.field_bb) {
                          qv.field_k.a(473, 175, -11753985, ps.field_b + "" + in.field_z, (byte) -125, -1);
                          uq.field_a.a(473, 175, -4720129, "<col=ffffff>" + ps.field_b + "</col>" + in.field_z, (byte) -112, -1);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        pr.field_k[0].a(3, 42);
                        var3.a((byte) 75, 395 + -var4.d((byte) -106) + 42, 42 + pr.field_k[0].a(), 0, 40);
                        pr.field_k[1].a(3, 42);
                        var3.a(29709);
                        if (!var4.j(20)) {
                          break L7;
                        } else {
                          L8: {
                            var5 = lg.field_c << -1701084670;
                            if (255 >= var5 % 510) {
                              stackIn_36_0 = var5 % 255;
                              break L8;
                            } else {
                              stackIn_36_0 = -(var5 % 255) + 510;
                              break L8;
                            }
                          }
                          var6 = stackIn_36_0;
                          pr.field_k[2].a(3, 42, 0, 16777215 | var6 << -994409832, 1);
                          break L7;
                        }
                      }
                      if (gt.field_bb) {
                        break L1;
                      } else {
                        if (var4 != null) {
                          ud.field_q[0].a(190.0f, 468.0f, 1600, 0, 1, 0, 2);
                          qv.field_k.a(473, 202, -11753985, Integer.toString(var4.field_I), (byte) -10, -1);
                          uq.field_a.a(473, 202, -1, Integer.toString(var4.field_I), (byte) -30, -1);
                          ud.field_q[1].a(240.0f, 468.0f, 1600, 0, 1, 0, 2);
                          qv.field_k.a(473, 252, -11753985, Integer.toString(var4.field_y), (byte) -30, -1);
                          uq.field_a.a(473, 252, -1, Integer.toString(var4.field_y), (byte) -30, -1);
                          ud.field_q[2].a(290.0f, 468.0f, 1600, 0, 1, 0, 2);
                          qv.field_k.a(473, 302, -11753985, Integer.toString(var4.field_t), (byte) -34, -1);
                          uq.field_a.a(473, 302, -1, Integer.toString(var4.field_t), (byte) -24, -1);
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    } else {
                      mu.field_B[2].a(-6 + var5, 448);
                      var5 = var5 + to.field_s[1].c();
                      continue L5;
                    }
                  }
                }
              }
              L9: {
                if (ld.field_N.a(false)) {
                  ld.field_N.a(true, param1);
                  break L9;
                } else {
                  break L9;
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
          L10: {
            var3_ref = decompiledCaughtException;
            stackIn_52_0 = (RuntimeException) (var3_ref);

            stackIn_52_1 = new StringBuilder().append("qu.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_53_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "null";
              break L10;
            } else {
              stackIn_53_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "{...}";
              break L10;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_53_0), stackIn_53_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              ig.field_b.e(117);
              an.field_a = -1;
              td.field_m = true;
              aa.field_a = new ah[100];
              if (param0 >= 53) {
                break L1;
              } else {
                qu.a(-125, (gk) null, -52, -77, 38, -62, (byte) 105, 54);
                break L1;
              }
            }
            kp.field_a = true;
            ke.a(false);
            this.c((byte) 112);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "qu.K(" + param0 + ')');
        }
    }

    final void a(int param0, boolean param1, boolean param2) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              hb.field_a = null;
              ig.field_b.e(119);
              wj.field_e = 0;
              in.field_z = 0;
              kn.field_b = 0;
              ld.field_C = param0;
              f.field_w = false;
              te.field_c = 0;
              oh.field_e = param0;
              ha.field_f = 0;
              ts.field_a = 0;
              iw.field_b = 0;
              fb.field_a = 0;
              tc.e(104);
              if (oh.field_e != 0) {
                break L1;
              } else {
                if (wm.field_f[0]) {
                  break L1;
                } else {
                  bw.field_d = true;
                  this.field_b = true;
                  break L1;
                }
              }
            }
            gg.a((byte) 105);
            td.field_m = false;
            gt.field_bb = param2;
            this.c((byte) 112);
            lg.field_c = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var4), "qu.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    qu() {
        jp discarded$0 = null;
        lp discarded$1 = null;
        try {
            ni.field_e = new jn();
            rc.field_m = new jn();
            this.a(127);
            discarded$0 = new jp();
            ld.field_N = new bw();
            discarded$1 = new lp();
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "qu.<init>()");
        }
    }

    static {
        field_i = new float[][]{new float[]{-0.33333298563957214f, -0.33333298563957214f, -0.33333298563957214f}, new float[]{0.33333298563957214f, -0.33333298563957214f, -0.33333298563957214f}, new float[]{-0.33333298563957214f, 0.33333298563957214f, -0.33333298563957214f}, new float[]{0.33333298563957214f, 0.33333298563957214f, -0.33333298563957214f}, new float[]{-0.33333298563957214f, -0.33333298563957214f, 0.33333298563957214f}, new float[]{0.33333298563957214f, -0.33333298563957214f, 0.33333298563957214f}, new float[]{-0.33333298563957214f, 0.33333298563957214f, 0.33333298563957214f}, new float[]{0.33333298563957214f, 0.33333298563957214f, 0.33333298563957214f}};
    }
}
