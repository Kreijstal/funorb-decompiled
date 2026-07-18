/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.awt.Canvas;

public final class DrPhlogistonSavesTheEarth extends sl {
    static nh field_J;
    static vd field_F;
    static long field_I;
    static String field_L;
    static int field_K;
    private int field_H;
    static String field_E;
    private boolean field_C;
    static he[] field_G;
    public static boolean field_D;

    public final void init() {
        try {
            ((DrPhlogistonSavesTheEarth) this).a(12, "drphlogistonsavestheearth", (byte) 12);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "DrPhlogistonSavesTheEarth.init()");
        }
    }

    private final he[] a(he param0, byte param1) {
        he[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        he[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        he[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3 = new he[1];
            var4 = -95 / ((param1 - 56) / 32);
            var3[0] = be.a(param0);
            var3[0].c();
            stackOut_0_0 = (he[]) var3;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3_ref;
            stackOut_2_1 = new StringBuilder().append("DrPhlogistonSavesTheEarth.PA(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    private final void d() {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = field_D ? 1 : 0;
        try {
          L0: {
            we.a(qa.field_O, -106, 82.0f);
            int discarded$5 = 1;
            bd.field_P = qk.a("", kf.field_d, "weapongattlinggun");
            int discarded$6 = 1;
            le.field_d = qk.a("", kf.field_d, "weapongattlinggun2");
            int discarded$7 = 1;
            qf.field_b = qk.a("", kf.field_d, "weapongattlinggun3");
            int discarded$8 = 1;
            lh.field_p = qk.a("", kf.field_d, "weaponhomingmissile");
            int discarded$9 = 1;
            nc.field_K = qk.a("", kf.field_d, "weaponbomb");
            f.field_i = cl.a("", kf.field_d, -116, "weaponmegacannonshot");
            oj.field_c = ij.a("bulletspark", (byte) 96, kf.field_d, "");
            hb.field_a = new nh(15, 15);
            hb.field_a.c();
            wj.b(7, 7, 7, 8388608);
            lb.field_C.a(123);
            oi.field_d = new nh(20, 20);
            oi.field_d.c();
            wj.b(9, 9, 6, 61568);
            lb.field_C.a(119);
            li.field_i = new nh(10, 10);
            li.field_i.c();
            wj.b(5, 5, 5, 8421504);
            lb.field_C.a(122);
            al.field_b = new nh(800, 32);
            al.field_b.c();
            wj.g(0, 7, 800, 16711680);
            wj.g(0, 8, 800, 16776960);
            wj.g(0, 9, 800, 16777215);
            wj.g(0, 10, 800, 16777215);
            wj.g(0, 11, 800, 16776960);
            wj.g(0, 12, 800, 16711680);
            lb.field_C.a(101);
            kc.field_p = new nh(32, 430);
            kc.field_p.c();
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var2_int >= 16) {
                    break L3;
                  } else {
                    wj.c(var2_int, 430 * (-var2_int + 16) / 16, 430, 16711680 - -(var2_int * 4096));
                    wj.c(-var2_int + 31, (6880 - 430 * var2_int) / 16, 430, 16711680 - -(4096 * var2_int));
                    var2_int++;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                lb.field_C.a(98);
                kc.field_q = new nh(800, 20);
                kc.field_q.c();
                wj.g(0, 6, 800, 65280);
                wj.g(0, 7, 800, 65280);
                wj.g(0, 8, 800, 65535);
                wj.g(0, 9, 800, 16777215);
                wj.g(0, 10, 800, 16777215);
                wj.g(0, 11, 800, 65535);
                wj.g(0, 12, 800, 65280);
                wj.g(0, 13, 800, 65280);
                lb.field_C.a(127);
                qa.field_M = new nh(20, 20);
                qa.field_M.c();
                wj.b(9, 9, 6, 8421376);
                lb.field_C.a(104);
                nd.field_L = new nh(20, 20);
                nd.field_L.c();
                wj.b(9, 9, 6, 8421376);
                lb.field_C.a(97);
                sa.field_c = new nh(20, 20);
                sa.field_c.c();
                wj.b(9, 9, 6, 8388736);
                lb.field_C.a(110);
                field_J = sa.field_c;
                mh.field_c = nd.field_L;
                jj.field_c = new nh(800, 32);
                jj.field_c.c();
                break L2;
              }
              var2_int = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (var2_int >= 16) {
                      break L6;
                    } else {
                      wj.g(0, var2_int, 800, 4096 * var2_int + 16711680);
                      wj.g(0, 32 - var2_int, 800, 16711680 + 4096 * var2_int);
                      var2_int++;
                      if (var3 != 0) {
                        break L5;
                      } else {
                        if (var3 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  wj.g(0, 16, 800, 16777215);
                  lb.field_C.a(117);
                  am.field_o = new nh(8, 8);
                  am.field_o.c();
                  wj.b(4, 4, 4, 65535);
                  lb.field_C.a(111);
                  ik.field_b = new nh(3, 3);
                  ik.field_b.c();
                  wj.b(1, 1, 1, 65408);
                  lb.field_C.a(105);
                  cj.field_d = new nh(256, 256);
                  lb.field_C.a(111);
                  db.field_e = new nh(1, 1);
                  ii.field_b = ij.a("playerfxspawn", (byte) 78, kf.field_d, "");
                  ub.a(0);
                  break L5;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "DrPhlogistonSavesTheEarth.GB(" + true + ')');
        }
    }

    private final he[] a(int param0, int param1, he param2) {
        RuntimeException var4 = null;
        he[] var4_array = null;
        int var5 = 0;
        int var6 = 0;
        he[] stackIn_7_0 = null;
        he[] stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        he[] stackOut_6_0 = null;
        he[] stackOut_10_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = field_D ? 1 : 0;
        try {
          L0: {
            var4_array = new he[param1];
            var5 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (param1 <= var5) {
                    break L3;
                  } else {
                    stackOut_6_0 = (he[]) var4_array;
                    stackIn_11_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      stackIn_7_0[var5] = param2;
                      var5++;
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_10_0 = (he[]) var4_array;
                stackIn_11_0 = stackOut_10_0;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("DrPhlogistonSavesTheEarth.MB(").append(-1745).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L4;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_11_0;
    }

    final void c(byte param0) {
        RuntimeException var2 = null;
        je var2_ref = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_18_0 = null;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        Object stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        Object stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        Object stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        Object stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        int stackIn_83_2 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_17_0 = null;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        Object stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        int stackOut_82_2 = 0;
        Object stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        Object stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        int stackOut_80_2 = 0;
        var5 = field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              int discarded$13 = 9;
              ia.a();
              if (!((DrPhlogistonSavesTheEarth) this).field_C) {
                break L1;
              } else {
                if (!s.field_a.e(16)) {
                  sc.a(-1, true, ad.field_q);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (df.field_l == null) {
                break L2;
              } else {
                if (!df.field_l.field_h) {
                  break L2;
                } else {
                  qk.a(true);
                  int discarded$14 = 72;
                  vj.b();
                  break L2;
                }
              }
            }
            L3: {
              if (param0 == 35) {
                break L3;
              } else {
                this.a((he[]) null, 93, (he[]) null);
                break L3;
              }
            }
            L4: {
              stackOut_17_0 = this;
              stackIn_20_0 = stackOut_17_0;
              stackIn_18_0 = stackOut_17_0;
              if (df.field_l == null) {
                stackOut_20_0 = this;
                stackOut_20_1 = 0;
                stackIn_21_0 = stackOut_20_0;
                stackIn_21_1 = stackOut_20_1;
                break L4;
              } else {
                stackOut_18_0 = this;
                stackOut_18_1 = 1;
                stackIn_21_0 = stackOut_18_0;
                stackIn_21_1 = stackOut_18_1;
                break L4;
              }
            }
            L5: {
              ((DrPhlogistonSavesTheEarth) this).a(stackIn_21_1 != 0, 55);
              if (!nd.field_Q) {
                break L5;
              } else {
                int discarded$15 = -119;
                this.p();
                nd.field_Q = false;
                break L5;
              }
            }
            L6: {
              ni.field_x = ni.field_x + 1;
              lf.field_b = lf.field_b + 1;
              int discarded$16 = 0;
              if (kh.a()) {
                ((DrPhlogistonSavesTheEarth) this).m(-128);
                int discarded$17 = 0;
                if (!kh.a()) {
                  break L6;
                } else {
                  L7: {
                    int discarded$18 = 13;
                    if (bj.a()) {
                      boolean discarded$19 = this.b(false, -111);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  return;
                }
              } else {
                break L6;
              }
            }
            L8: {
              L9: {
                if (((DrPhlogistonSavesTheEarth) this).field_C) {
                  break L9;
                } else {
                  ui.a(ma.field_sb, param0 + -34);
                  if (!this.b(true, param0 ^ -88)) {
                    break L8;
                  } else {
                    ((DrPhlogistonSavesTheEarth) this).field_C = true;
                    if (var5 == 0) {
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
              }
              L10: {
                if (!a.a(param0 ^ -27336)) {
                  break L10;
                } else {
                  L11: {
                    if (!pf.a((byte) 97)) {
                      break L11;
                    } else {
                      L12: {
                        L13: {
                          var2_int = (int)(32.0 * ji.a(65535, (double)ni.field_x / 25.0) + 224.0);
                          var3 = 3 * var2_int / 4;
                          pj.field_E = var2_int + ((var3 << 16) - -(var3 << 8));
                          var2_int = (int)(224.0 + pj.a((double)ni.field_x / 25.0, param0 ^ 32803) * 32.0);
                          a.field_i = var2_int << 16;
                          if (ul.field_a != 0) {
                            break L13;
                          } else {
                            L14: {
                              L15: {
                                int discarded$20 = 46;
                                var4 = qg.n();
                                if (2 != var4) {
                                  break L15;
                                } else {
                                  qk.a(true);
                                  if (var5 == 0) {
                                    break L14;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                              L16: {
                                if (var4 == 3) {
                                  break L16;
                                } else {
                                  if (var4 == 4) {
                                    wl.a(-2, 0, 108);
                                    if (var5 == 0) {
                                      break L14;
                                    } else {
                                      break L16;
                                    }
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                              s.a(true, (byte) -121);
                              break L14;
                            }
                            if (var5 == 0) {
                              break L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        this.v(-8755);
                        break L12;
                      }
                      L17: {
                        if (pf.a((byte) 97)) {
                          break L17;
                        } else {
                          th.field_a[hl.field_f].a(true, (byte) 98);
                          break L17;
                        }
                      }
                      if (var5 == 0) {
                        break L8;
                      } else {
                        break L11;
                      }
                    }
                  }
                  L18: {
                    if (bb.a((byte) -103)) {
                      break L18;
                    } else {
                      this.v(param0 + -8790);
                      if (var5 == 0) {
                        break L8;
                      } else {
                        break L18;
                      }
                    }
                  }
                  L19: {
                    stackOut_77_0 = this;
                    stackOut_77_1 = 5017;
                    stackIn_82_0 = stackOut_77_0;
                    stackIn_82_1 = stackOut_77_1;
                    stackIn_78_0 = stackOut_77_0;
                    stackIn_78_1 = stackOut_77_1;
                    if (null == df.field_l) {
                      stackOut_82_0 = this;
                      stackOut_82_1 = stackIn_82_1;
                      stackOut_82_2 = 0;
                      stackIn_83_0 = stackOut_82_0;
                      stackIn_83_1 = stackOut_82_1;
                      stackIn_83_2 = stackOut_82_2;
                      break L19;
                    } else {
                      stackOut_78_0 = this;
                      stackOut_78_1 = stackIn_78_1;
                      stackIn_80_0 = stackOut_78_0;
                      stackIn_80_1 = stackOut_78_1;
                      stackOut_80_0 = this;
                      stackOut_80_1 = stackIn_80_1;
                      stackOut_80_2 = 1;
                      stackIn_83_0 = stackOut_80_0;
                      stackIn_83_1 = stackOut_80_1;
                      stackIn_83_2 = stackOut_80_2;
                      break L19;
                    }
                  }
                  L20: {
                    L21: {
                      var2_int = ((DrPhlogistonSavesTheEarth) this).b(stackIn_83_1, stackIn_83_2 != 0);
                      if (var2_int == 1) {
                        break L21;
                      } else {
                        if (var2_int == 2) {
                          break L21;
                        } else {
                          break L20;
                        }
                      }
                    }
                    L22: {
                      if (null != df.field_l) {
                        hb.a(-5, (java.awt.Canvas) (Object) df.field_l);
                        df.field_l.a(sb.field_d, true);
                        df.field_l = null;
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                    if (var2_int == 2) {
                      DrPhlogistonSavesTheEarth.a(nb.a(-106), -117);
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  if (var5 == 0) {
                    break L8;
                  } else {
                    break L10;
                  }
                }
              }
              int discarded$21 = -51;
              hc.b();
              if (!a.a(-27365)) {
                break L8;
              } else {
                bh.b(-95);
                int discarded$22 = 86;
                gf.b();
                if (hl.field_f != 9) {
                  break L8;
                } else {
                  if (ej.field_h != 0) {
                    break L8;
                  } else {
                    hl.field_f = 2;
                    ek.a(-114, false, 2);
                    break L8;
                  }
                }
              }
            }
            L23: {
              L24: {
                if (!oh.a(0)) {
                  L25: while (true) {
                    var2_ref = (je) (Object) nf.field_x.d(180479896);
                    if (var2_ref == null) {
                      break L24;
                    } else {
                      wb.a(true, 4, var2_ref);
                      if (var5 != 0) {
                        break L23;
                      } else {
                        if (var5 == 0) {
                          continue L25;
                        } else {
                          break L24;
                        }
                      }
                    }
                  }
                } else {
                  break L24;
                }
              }
              L26: while (true) {
                L27: {
                  if (!th.a(false, vi.field_a)) {
                    break L27;
                  } else {
                    ((DrPhlogistonSavesTheEarth) this).c(true);
                    if (var5 != 0) {
                      break L23;
                    } else {
                      if (var5 == 0) {
                        continue L26;
                      } else {
                        break L27;
                      }
                    }
                  }
                }
                qj.a(0, 14656);
                break L23;
              }
            }
            L28: {
              if (sb.b(-11)) {
                L29: {
                  L30: {
                    var2_int = ((DrPhlogistonSavesTheEarth) this).b(false);
                    if (var2_int == 0) {
                      break L30;
                    } else {
                      if (var2_int == 1) {
                        break L30;
                      } else {
                        break L29;
                      }
                    }
                  }
                  el.a(false, 2);
                  ka.a(3, (byte) -40);
                  i.a(4, 0);
                  int discarded$23 = 5;
                  int discarded$24 = 0;
                  dj.a();
                  break L29;
                }
                if (var2_int != 2) {
                  break L28;
                } else {
                  int discarded$25 = 11;
                  am.e();
                  break L28;
                }
              } else {
                break L28;
              }
            }
            L31: {
              if (vi.field_c == null) {
                break L31;
              } else {
                if (!vi.field_c.field_i) {
                  break L31;
                } else {
                  L32: {
                    if (gf.field_D >= vi.field_c.field_j[0]) {
                      break L32;
                    } else {
                      gf.field_D = vi.field_c.field_j[0];
                      break L32;
                    }
                  }
                  vi.field_c = null;
                  break L31;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "DrPhlogistonSavesTheEarth.BA(" + param0 + ')');
        }
    }

    private final void o() {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = field_D ? 1 : 0;
        try {
          L0: {
            we.a(qa.field_O, -89, 88.0f);
            of.field_x = eh.a("", (byte) -61, kf.field_d, "poweruplife");
            od.field_k = eh.a("", (byte) -66, kf.field_d, "poweruppoints100");
            qc.field_a = eh.a("", (byte) -56, kf.field_d, "poweruppoints1000");
            p.field_e = eh.a("", (byte) -31, kf.field_d, "poweruppoints5000");
            c.field_a[0] = eh.a("", (byte) -47, kf.field_d, "powerupx2");
            c.field_a[1] = eh.a("", (byte) -23, kf.field_d, "powerupx3");
            c.field_a[2] = eh.a("", (byte) -96, kf.field_d, "powerupx4");
            c.field_a[3] = eh.a("", (byte) -92, kf.field_d, "powerupx5");
            c.field_a[4] = eh.a("", (byte) -55, kf.field_d, "powerupx6");
            ri.field_b = eh.a("", (byte) -71, kf.field_d, "powerupshield");
            re.field_d = eh.a("", (byte) -110, kf.field_d, "powerupweapon");
            si.f(10);
            di.field_b = ij.a("awardarray_big", (byte) 63, kf.field_d, "");
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (di.field_b.length <= var2_int) {
                    break L3;
                  } else {
                    di.field_b[var2_int].c();
                    var2_int++;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                tl.field_P = eh.a("basic", (byte) -53, ph.field_b, "unachieved");
                ce.field_b = eh.a("basic", (byte) -39, ph.field_b, "orbcoin");
                ge.field_d = eh.a("basic", (byte) -55, ph.field_b, "locked");
                int discarded$1 = 0;
                ol.a();
                break L2;
              }
              var2_int = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (9 <= var2_int) {
                      break L6;
                    } else {
                      eb.field_e[var2_int] = new nh(64, 64);
                      var2_int++;
                      if (var3 != 0) {
                        break L5;
                      } else {
                        if (var3 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  eb.field_e[0].c();
                  wj.f(0, 0, 64, 64, 10836, 21672);
                  oi.field_f.a(0, 0, 256, 64);
                  eb.field_e[1].c();
                  wj.f(0, 0, 64, 64, 262656, 11754240);
                  sg.field_e.a(0, 0, 256, 64);
                  eb.field_e[2].c();
                  wj.f(0, 0, 64, 64, 258, 13932);
                  uk.field_h.a(0, 0, 256, 64);
                  eb.field_e[3].c();
                  nb.field_b.a(0, 0);
                  kl.field_R[0].d(0, 0);
                  eb.field_e[4].c();
                  nb.field_b.a(0, 0);
                  sh.field_b.d(-715, -185);
                  od.field_i[0].a(10, 5);
                  eb.field_e[5].c();
                  nb.field_b.a(0, 0);
                  be.a(sh.field_b, -715, -75);
                  eb.field_e[6].c();
                  wj.f(0, 0, 64, 64, 7091712, 131328);
                  vi.field_g.a(0, 0, 256, 64);
                  var2_int = 0;
                  eb.field_e[7].c();
                  wj.f(0, 0, 64, 64, 27648, 512);
                  vi.field_g.a(0, 0, 256, 64);
                  eb.field_e[8].c();
                  wj.f(0, 0, 64, 64, 27648, 512);
                  vi.field_g.a(-30, 0, 256, 64);
                  md.field_f = new nh(64, 64);
                  md.field_f.c();
                  wj.f(0, 0, 64, 64, 2897296, 0);
                  cb.field_b.b("?", 32, 32, 16777215, 1);
                  wi.field_a = new nh(64, 64);
                  wi.field_a.c();
                  wj.f(0, 0, 64, 64, 2897296, 0);
                  cb.field_b.b("?", 32, 32, 16777215, 1);
                  ge.field_d.b(32, 32);
                  lb.field_C.a(103);
                  break L5;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "DrPhlogistonSavesTheEarth.VA(" + 125 + ')');
        }
    }

    final void a(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        try {
          L0: {
            L1: {
              DrPhlogistonSavesTheEarth.u(-16387);
              int discarded$154 = 1;
              vd.a();
              int discarded$155 = 24;
              dk.a();
              int discarded$156 = 35;
              tb.a();
              ul.a((byte) 8);
              rk.a((byte) 52);
              int discarded$157 = -27770;
              gd.a();
              int discarded$158 = 39;
              ld.e();
              ij.a(15596);
              sl.j(26395);
              int discarded$159 = 0;
              gl.a();
              li.c(-1);
              int discarded$160 = 125;
              fi.a();
              int discarded$161 = 119;
              fe.a();
              int discarded$162 = 45;
              aj.a();
              int discarded$163 = 86;
              oi.a();
              wj.d();
              vj.c(0);
              pc.a(13302);
              int discarded$164 = 66;
              bc.a();
              od.d(4);
              int discarded$165 = 0;
              la.a();
              int discarded$166 = -127;
              lf.a();
              le.a(param0);
              int discarded$167 = 5;
              oe.a();
              kf.a(23050);
              int discarded$168 = 111;
              th.a();
              int discarded$169 = 0;
              al.a();
              oh.a(false);
              bj.a(true);
              int discarded$170 = 120;
              we.a();
              qh.a(1);
              ab.a(false);
              if (param0) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_4_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              m.a(stackIn_4_0 != 0);
              na.a((byte) -33);
              int discarded$171 = 33;
              sb.a();
              int discarded$172 = 25270;
              q.a();
              wg.b(2);
              int discarded$173 = 0;
              ng.a();
              int discarded$174 = -127;
              cf.a();
              int discarded$175 = 0;
              mk.a();
              j.h(24342);
              int discarded$176 = 76;
              nb.a();
              int discarded$177 = -118;
              i.a();
              int discarded$178 = 6;
              gb.b();
              int discarded$179 = -31553;
              n.b();
              int discarded$180 = 110;
              df.c();
              ge.a(false);
              qe.c(0);
              int discarded$181 = 0;
              oj.a();
              int discarded$182 = 57;
              fj.d();
              gf.a(param0);
              int discarded$183 = 9;
              ib.a();
              int discarded$184 = -114;
              bf.c();
              td.a(869637800);
              int discarded$185 = 7268;
              ck.a();
              gi.b(10589);
              ug.h(-921185753);
              tg.a(0);
              int discarded$186 = -8;
              cc.a();
              rl.f();
              int discarded$187 = -112;
              am.f();
              if (param0) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_5_0 = 1;
                stackIn_8_0 = stackOut_5_0;
                break L2;
              }
            }
            ml.a(stackIn_8_0 != 0);
            id.e();
            eb.a(5);
            ql.a((byte) -114);
            of.g(1024);
            gk.a(false);
            d.a((byte) 39);
            rf.a();
            int discarded$188 = -19662;
            ui.a();
            int discarded$189 = -20;
            rg.a();
            int discarded$190 = 27;
            di.a();
            int discarded$191 = 0;
            ea.a();
            kh.a((byte) -63);
            int discarded$192 = 5;
            mg.a();
            int discarded$193 = 99;
            wd.a();
            eg.a(-1);
            int discarded$194 = -126;
            qj.a();
            int discarded$195 = 52;
            k.g();
            int discarded$196 = 9791;
            qd.o();
            int discarded$197 = 0;
            tf.c();
            int discarded$198 = 20;
            el.n();
            ma.n(19678);
            v.j(3);
            ff.i(-1);
            int discarded$199 = -11179;
            wa.j();
            ah.k(-988);
            int discarded$200 = 2;
            a.b();
            sf.a(param0);
            int discarded$201 = -119;
            ub.a();
            s.a(7);
            int discarded$202 = 256;
            fb.a();
            int discarded$203 = 122;
            cb.a();
            int discarded$204 = -62;
            mf.g();
            uh.d(-24338);
            int discarded$205 = 0;
            lh.p();
            int discarded$206 = 111;
            jj.a();
            nk.a();
            sg.a((byte) -57);
            tk.b();
            gj.b();
            int discarded$207 = 69;
            ha.a();
            pe.b(0);
            be.a();
            int discarded$208 = 109;
            hi.b();
            int discarded$209 = 1;
            aa.a();
            int discarded$210 = 1;
            ee.a();
            ii.a(110);
            int discarded$211 = 89;
            db.a();
            u.a((byte) 50);
            int discarded$212 = -114;
            t.a();
            int discarded$213 = 1441320386;
            ta.b();
            int discarded$214 = 0;
            cl.d();
            int discarded$215 = 108;
            hl.e();
            cm.a((byte) -113);
            int discarded$216 = 0;
            ik.a();
            int discarded$217 = 119;
            bi.a();
            int discarded$218 = 117;
            de.d();
            pf.b(-79);
            int discarded$219 = -58;
            c.a();
            int discarded$220 = 30;
            lb.h();
            int discarded$221 = 118;
            fl.a();
            int discarded$222 = 24937;
            qc.a();
            int discarded$223 = 1;
            ae.n();
            int discarded$224 = 44;
            kk.a();
            l.a(0);
            uc.c();
            int discarded$225 = 119;
            sh.a();
            int discarded$226 = 12018;
            ej.a();
            int discarded$227 = 93;
            ja.a();
            fc.a(-60);
            af.a(4);
            int discarded$228 = 0;
            pd.a();
            int discarded$229 = -9;
            mh.a();
            int discarded$230 = 11;
            r.a();
            int discarded$231 = -105;
            ce.a();
            int discarded$232 = -98;
            hc.c();
            int discarded$233 = -99;
            hm.c();
            int discarded$234 = 50;
            ua.a();
            int discarded$235 = 2;
            rc.a();
            qf.a((byte) 64);
            int discarded$236 = 67;
            bh.a();
            gh.a();
            int discarded$237 = 111;
            lc.b();
            int discarded$238 = -63;
            sc.a();
            int discarded$239 = 1;
            ki.a();
            int discarded$240 = 101;
            hb.a();
            int discarded$241 = 94;
            ch.b();
            int discarded$242 = -119;
            lg.a();
            fm.a(-109);
            vg.f((byte) -102);
            hf.f(7966);
            si.g(6714);
            int discarded$243 = -2110416344;
            ca.m();
            int discarded$244 = -120;
            bd.a();
            int discarded$245 = -86;
            pj.f();
            rh.b(-2);
            int discarded$246 = 52;
            ob.a();
            int discarded$247 = -95;
            cj.a();
            int discarded$248 = -30463;
            ai.h();
            int discarded$249 = -29912;
            p.a();
            int discarded$250 = -91;
            ac.a();
            ol.a((byte) -116);
            int discarded$251 = -84;
            eh.a();
            int discarded$252 = 2;
            wi.a();
            int discarded$253 = 1;
            ji.a();
            int discarded$254 = 1;
            ph.a();
            int discarded$255 = -20385;
            hj.a();
            int discarded$256 = 65280;
            qk.b();
            int discarded$257 = 66;
            bk.b();
            int discarded$258 = -57;
            fa.e();
            int discarded$259 = -4;
            ga.a();
            int discarded$260 = 34;
            wb.b();
            int discarded$261 = -339514552;
            gg.b();
            int discarded$262 = 0;
            nj.b();
            int discarded$263 = -15877;
            ig.e();
            ri.a(param0);
            int discarded$264 = 3;
            dh.j();
            qg.n(-1);
            int discarded$265 = 78;
            kl.j();
            int discarded$266 = 127;
            jf.h();
            hd.b(false);
            int discarded$267 = 108;
            jd.a();
            qa.a((byte) 122);
            gm.h(-112);
            int discarded$268 = -76;
            ci.i();
            int discarded$269 = 126;
            nc.a();
            int discarded$270 = 1;
            ei.d();
            int discarded$271 = 75;
            md.a();
            int discarded$272 = 288;
            ih.l();
            int discarded$273 = 1;
            nd.b();
            int discarded$274 = -39;
            tl.a();
            da.a();
            int discarded$275 = 0;
            hh.a();
            o.a((byte) 99);
            jc.c((byte) 56);
            rb.a(0);
            int discarded$276 = 2147483647;
            pi.j();
            int discarded$277 = 7624;
            jk.j();
            int discarded$278 = 250;
            sa.a();
            tc.a(-9292);
            dg.a(true);
            int discarded$279 = -86;
            wh.c();
            rd.g(-125);
            ka.c(26713);
            int discarded$280 = -1;
            pa.a();
            int discarded$281 = 967;
            re.b();
            int discarded$282 = 71;
            oa.a();
            int discarded$283 = 4;
            vb.d();
            int discarded$284 = 102;
            bg.a();
            int discarded$285 = 1;
            sj.a();
            int discarded$286 = -1;
            kc.a();
            int discarded$287 = 78;
            ie.c();
            uk.a(false);
            mj.c(2147483647);
            dm.d((byte) -126);
            int discarded$288 = 117;
            ue.a();
            int discarded$289 = 0;
            dl.j();
            int discarded$290 = -15;
            hg.h();
            int discarded$291 = -382;
            b.d();
            int discarded$292 = -60;
            uf.a();
            int discarded$293 = -1;
            f.d();
            int discarded$294 = 19;
            je.a();
            int discarded$295 = -106;
            nl.a();
            int discarded$296 = 0;
            vc.a();
            bb.b(param0);
            int discarded$297 = 80;
            wk.d();
            qb.a(false);
            og.a(120);
            sd.a(2);
            int discarded$298 = -27996;
            lk.a();
            int discarded$299 = 104;
            ll.d();
            dd.a(false);
            int discarded$300 = 27174;
            ia.b();
            int discarded$301 = -126;
            ek.e();
            int discarded$302 = 1;
            uj.d();
            int discarded$303 = 65535;
            jl.d();
            kj.a(14970);
            mi.b((byte) 91);
            int discarded$304 = 0;
            ad.e();
            ni.d((byte) 125);
            int discarded$305 = 1;
            g.b();
            nf.d((byte) -95);
            cd.b((byte) -47);
            int discarded$306 = 111;
            fk.a();
            vh.a(84);
            int discarded$307 = 88;
            dc.c();
            vi.a(2823);
            ((DrPhlogistonSavesTheEarth) this).field_z = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "DrPhlogistonSavesTheEarth.W(" + param0 + ')');
        }
    }

    final static boolean t(int param0) {
        RuntimeException var1 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == 18137) {
              L1: {
                L2: {
                  if (uj.field_j == null) {
                    break L2;
                  } else {
                    if (!tl.field_O.a(false)) {
                      break L2;
                    } else {
                      stackOut_7_0 = 1;
                      stackIn_10_0 = stackOut_7_0;
                      break L1;
                    }
                  }
                }
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
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
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var1, "DrPhlogistonSavesTheEarth.IB(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    private final void p() {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != df.field_m) {
                int discarded$2 = 255;
                q.a(df.field_m);
                df.field_m = null;
                int discarded$3 = 86;
                tc.a();
                break L1;
              } else {
                break L1;
              }
            }
            kf.field_d = al.a(3, 1);
            aa.field_b = al.a(3, 2);
            ua.field_b = al.a(3, 3);
            ui.field_a = al.a(3, 4);
            df.field_a = al.a(3, 5);
            mh.field_a = al.a(3, 6);
            ff.field_P = al.a(3, 7);
            s.c((byte) 126);
            var2_int = 0;
            gd.a(si.field_E, 255, ph.field_b);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "DrPhlogistonSavesTheEarth.RA(" + -119 + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param2 == 176) {
              var3_int = param0 >> 31 & param1 - 1;
              stackOut_3_0 = (param0 - -(param0 >>> 31)) % param1 - -var3_int;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = -7;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var3, "DrPhlogistonSavesTheEarth.SA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    private final he[] a(he[] param0) {
        he[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        he[] stackIn_7_0 = null;
        he[] stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        he[] stackOut_6_0 = null;
        he[] stackOut_10_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var5 = field_D ? 1 : 0;
        try {
          L0: {
            var3 = new he[param0.length];
            var4 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var4 <= ~var3.length) {
                    break L3;
                  } else {
                    var3[var4] = param0[var4].e();
                    stackOut_6_0 = (he[]) var3;
                    stackIn_11_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      ((he) (Object) stackIn_7_0[var4]).d();
                      var4++;
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_10_0 = (he[]) var3;
                stackIn_11_0 = stackOut_10_0;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3_ref;
            stackOut_12_1 = new StringBuilder().append("DrPhlogistonSavesTheEarth.CB(");
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L4;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + 65793 + ')');
        }
        return stackIn_11_0;
    }

    private final void a(int param0, he[] param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var4 = field_D ? 1 : 0;
        try {
          L0: {
            if (param1 == null) {
              return;
            } else {
              L1: {
                var3_int = 0;
                if (param0 >= 80) {
                  break L1;
                } else {
                  field_J = null;
                  break L1;
                }
              }
              L2: while (true) {
                L3: {
                  L4: {
                    if (~param1.length >= ~var3_int) {
                      break L4;
                    } else {
                      param1[var3_int].c();
                      var3_int++;
                      if (var4 != 0) {
                        break L3;
                      } else {
                        if (var4 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  break L3;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) runtimeException;
            stackOut_13_1 = new StringBuilder().append("DrPhlogistonSavesTheEarth.WA(").append(param0).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L5;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
    }

    final void h(int param0) {
        Object var2_ref = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        Object stackIn_5_0 = null;
        int stackIn_12_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_87_1 = 0;
        RuntimeException decompiledCaughtException = null;
        q stackOut_4_0 = null;
        java.awt.Canvas stackOut_2_0 = null;
        boolean stackOut_11_0 = false;
        int stackOut_9_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_86_1 = 0;
        int stackOut_82_0 = 0;
        int stackOut_84_0 = 0;
        boolean stackOut_84_1 = false;
        var2_ref = null;
        var4 = field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (df.field_l != null) {
                stackOut_4_0 = df.field_l;
                stackIn_5_0 = (Object) (Object) stackOut_4_0;
                break L1;
              } else {
                stackOut_2_0 = n.field_g;
                stackIn_5_0 = (Object) (Object) stackOut_2_0;
                break L1;
              }
            }
            var2_ref = stackIn_5_0;
            int discarded$4 = 0;
            if (kh.a()) {
              L2: {
                if (null == df.field_l) {
                  stackOut_11_0 = pj.field_C;
                  stackIn_12_0 = stackOut_11_0 ? 1 : 0;
                  break L2;
                } else {
                  stackOut_9_0 = 1;
                  stackIn_12_0 = stackOut_9_0;
                  break L2;
                }
              }
              o.a(stackIn_12_0 != 0, 320, (java.awt.Canvas) var2_ref);
              return;
            } else {
              if (!((DrPhlogistonSavesTheEarth) this).field_C) {
                dh.a(41, (java.awt.Canvas) var2_ref);
                return;
              } else {
                if (a.a(-27365)) {
                  L3: {
                    L4: {
                      if (r.field_d != hl.field_f) {
                        break L4;
                      } else {
                        L5: {
                          if (hl.field_f != -1) {
                            break L5;
                          } else {
                            sd.field_a.y(6212);
                            if (var4 == 0) {
                              break L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                        th.field_a[hl.field_f].f(-8448);
                        if (var4 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L6: {
                      L7: {
                        if (16 <= ue.field_b) {
                          break L7;
                        } else {
                          L8: {
                            L9: {
                              if (hl.field_f == -1) {
                                break L9;
                              } else {
                                th.field_a[hl.field_f].f(-8448);
                                if (var4 == 0) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            sd.field_a.y(6212);
                            break L8;
                          }
                          be.a(ue.field_b * 15 - -1);
                          be.a(0, 0, 640, 480, 14713896, ue.field_b * 10);
                          if (var4 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      L10: {
                        L11: {
                          lf.field_b = 0;
                          if (r.field_d == -1) {
                            break L11;
                          } else {
                            th.field_a[r.field_d].f(-8448);
                            if (var4 == 0) {
                              break L10;
                            } else {
                              break L11;
                            }
                          }
                        }
                        sd.field_a.y(6212);
                        break L10;
                      }
                      be.a(15 * (-ue.field_b + 33));
                      be.a(0, 0, 640, 480, 22070844, -(10 * ue.field_b) + 320);
                      break L6;
                    }
                    if (ue.field_b != 0) {
                      break L3;
                    } else {
                      if (r.field_d != 11) {
                        break L3;
                      } else {
                        int discarded$5 = 0;
                        ti.a(true);
                        break L3;
                      }
                    }
                  }
                  L12: {
                    if (!pf.a((byte) 97)) {
                      break L12;
                    } else {
                      wj.a(0, 0, wj.field_k, wj.field_c);
                      ug.a(ca.field_W[0].field_y, ca.field_W[0].field_w, ca.field_W, 37);
                      break L12;
                    }
                  }
                  L13: {
                    if (0 != ul.field_a) {
                      var3 = 256 * ue.field_b / 32;
                      if (var3 <= 0) {
                        break L13;
                      } else {
                        wj.d(0, 0, wj.field_k, wj.field_c, 0, var3);
                        break L13;
                      }
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    L15: {
                      L16: {
                        if (!bb.a((byte) -103)) {
                          break L16;
                        } else {
                          if (!pf.a((byte) 97)) {
                            break L15;
                          } else {
                            break L16;
                          }
                        }
                      }
                      int discarded$6 = 73;
                      if (!fl.b()) {
                        break L14;
                      } else {
                        if (!pf.a((byte) 97)) {
                          wj.a(0, 0, wj.field_k, wj.field_c);
                          qe.a(ca.field_W[0].field_y, ca.field_W[0].field_w, ca.field_W, (byte) -76);
                          if (var4 == 0) {
                            break L14;
                          } else {
                            break L15;
                          }
                        } else {
                          break L14;
                        }
                      }
                    }
                    L17: {
                      stackOut_81_0 = 91;
                      stackIn_86_0 = stackOut_81_0;
                      stackIn_82_0 = stackOut_81_0;
                      if (df.field_l != null) {
                        stackOut_86_0 = stackIn_86_0;
                        stackOut_86_1 = 1;
                        stackIn_87_0 = stackOut_86_0;
                        stackIn_87_1 = stackOut_86_1;
                        break L17;
                      } else {
                        stackOut_82_0 = stackIn_82_0;
                        stackIn_84_0 = stackOut_82_0;
                        stackOut_84_0 = stackIn_84_0;
                        stackOut_84_1 = pj.field_C;
                        stackIn_87_0 = stackOut_84_0;
                        stackIn_87_1 = stackOut_84_1 ? 1 : 0;
                        break L17;
                      }
                    }
                    dh.a((byte) stackIn_87_0, stackIn_87_1 != 0);
                    break L14;
                  }
                  L18: {
                    if (nj.field_j < 2) {
                      break L18;
                    } else {
                      a.field_g.c(qj.field_c + " lps", 15, 15, 16777215, 65793);
                      break L18;
                    }
                  }
                  DrPhlogistonSavesTheEarth.a(param0, -74, (java.awt.Canvas) var2_ref, 0);
                  break L0;
                } else {
                  we.a(ia.field_b, -119, 100.0f);
                  dh.a(21, (java.awt.Canvas) var2_ref);
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "DrPhlogistonSavesTheEarth.LA(" + param0 + ')');
        }
    }

    private final void v(int param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -8755) {
                break L1;
              } else {
                field_F = null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (ul.field_a != 0) {
                  break L3;
                } else {
                  L4: {
                    if (~r.field_d == ~hl.field_f) {
                      break L4;
                    } else {
                      ue.field_b = ue.field_b + 1;
                      if (ue.field_b != 32) {
                        break L2;
                      } else {
                        L5: {
                          if (hl.field_f != 2) {
                            break L5;
                          } else {
                            ob.field_b = null;
                            break L5;
                          }
                        }
                        hl.field_f = r.field_d;
                        ue.field_b = 0;
                        if (var3 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  L6: {
                    if (hl.field_f != -1) {
                      break L6;
                    } else {
                      sd.field_a.r(param0 ^ 8794);
                      if (var3 == 0) {
                        break L2;
                      } else {
                        break L6;
                      }
                    }
                  }
                  th.field_a[hl.field_f].l(-14689);
                  if (var3 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L7: {
                if (ul.field_a != 1) {
                  break L7;
                } else {
                  ue.field_b = ue.field_b + 1;
                  if (ue.field_b == 32) {
                    L8: {
                      L9: {
                        if (pf.a((byte) 97)) {
                          break L9;
                        } else {
                          int discarded$3 = 8227;
                          cj.b();
                          if (var3 == 0) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                      int discarded$4 = 78;
                      og.a();
                      break L8;
                    }
                    ul.field_a = 2;
                    if (var3 == 0) {
                      break L2;
                    } else {
                      break L7;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              L10: {
                if (ul.field_a == 2) {
                  break L10;
                } else {
                  L11: {
                    if (ue.field_b <= 0) {
                      ul.field_a = 0;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  ue.field_b = ue.field_b - 1;
                  if (var3 == 0) {
                    break L2;
                  } else {
                    break L10;
                  }
                }
              }
              L12: {
                L13: {
                  if (oh.a(param0 + 8755)) {
                    break L13;
                  } else {
                    L14: {
                      ri.field_f = ge.a(4, (byte) -125);
                      if (null == sd.field_a) {
                        break L14;
                      } else {
                        bf.field_h = sd.field_a.j((byte) -68);
                        break L14;
                      }
                    }
                    hl.field_f = hg.field_sb;
                    int discarded$5 = 20;
                    eb.a();
                    li.b(param0 + 8638);
                    if (hl.field_f != -2) {
                      break L12;
                    } else {
                      hl.field_f = 0;
                      s.a(false, (byte) -122);
                      if (var3 == 0) {
                        break L12;
                      } else {
                        break L13;
                      }
                    }
                  }
                }
                hl.field_f = tf.field_jb;
                break L12;
              }
              ek.a(-114, false, hl.field_f);
              ul.field_a = 3;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "DrPhlogistonSavesTheEarth.LB(" + param0 + ')');
        }
    }

    private final void k() {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = field_D ? 1 : 0;
        try {
          L0: {
            we.a(qa.field_O, -80, 68.0f);
            mk.field_g[0] = eh.a("", (byte) -66, kf.field_d, "act_screen_intro_1_part_1");
            mk.field_g[1] = eh.a("", (byte) -90, kf.field_d, "act_screen_intro_1_part_2");
            mk.field_g[2] = eh.a("", (byte) -99, kf.field_d, "act_screen_intro_1_part_3");
            mk.field_g[3] = eh.a("", (byte) -90, kf.field_d, "act_screen_intro_1_part_4");
            mk.field_g[4] = eh.a("", (byte) -110, kf.field_d, "act_screen_intro_1_part_5");
            mk.field_g[5] = eh.a("", (byte) -75, kf.field_d, "act_screen_intro_1_part_6");
            mk.field_g[6] = eh.a("", (byte) -23, kf.field_d, "act_screen_intro_1_part_7");
            mk.field_g[7] = eh.a("", (byte) -65, kf.field_d, "act_screen_intro_1_part_8");
            wb.field_a[0] = eh.a("", (byte) -92, kf.field_d, "act_screen_intro_2");
            gl.field_b[0] = eh.a("", (byte) -127, kf.field_d, "act_screen_intro_3");
            pc.field_b[0] = eh.a("", (byte) -35, kf.field_d, "act_screen_intro_4_part_1");
            pc.field_b[1] = eh.a("", (byte) -102, kf.field_d, "act_screen_intro_4_part_2");
            pc.field_b[2] = eh.a("", (byte) -61, kf.field_d, "act_screen_intro_4_part_3");
            ge.field_p[0] = eh.a("", (byte) -93, kf.field_d, "act_screen_intro_5");
            th.field_b[0] = eh.a("", (byte) -31, kf.field_d, "act_screen_intro_6");
            v.field_W[0] = eh.a("", (byte) -100, kf.field_d, "act_screen_intro_7_part_1");
            v.field_W[1] = eh.a("", (byte) -75, kf.field_d, "act_screen_intro_7_part_2");
            v.field_W[2] = eh.a("", (byte) -50, kf.field_d, "act_screen_intro_7_part_3");
            ie.field_x[0] = eh.a("", (byte) -122, kf.field_d, "act_screen_intro_8");
            rg.field_c[0] = eh.a("", (byte) -84, kf.field_d, "act_screen_intro_9");
            l.field_f[0][0] = eh.a("", (byte) -78, kf.field_d, "act_screen_death_1");
            l.field_f[1][0] = l.field_f[0][0];
            l.field_f[2][0] = l.field_f[0][0];
            l.field_f[3][0] = eh.a("", (byte) -105, kf.field_d, "act_screen_death_4");
            l.field_f[4][0] = l.field_f[3][0];
            l.field_f[5][0] = l.field_f[3][0];
            l.field_f[6][0] = eh.a("", (byte) -49, kf.field_d, "act_screen_death_7");
            l.field_f[7][0] = l.field_f[6][0];
            l.field_f[8][0] = l.field_f[6][0];
            l.field_f[0][1] = eh.a("", (byte) -101, kf.field_d, "act_screen_death_boss_123");
            l.field_f[1][1] = l.field_f[0][1];
            l.field_f[2][1] = l.field_f[0][1];
            l.field_f[3][1] = eh.a("", (byte) -96, kf.field_d, "act_screen_death_boss_456");
            l.field_f[4][1] = l.field_f[3][1];
            l.field_f[5][1] = l.field_f[3][1];
            l.field_f[6][1] = eh.a("", (byte) -34, kf.field_d, "act_screen_death_boss_789");
            l.field_f[7][1] = l.field_f[6][1];
            l.field_f[8][1] = l.field_f[6][1];
            hh.field_d[2] = eh.a("", (byte) -114, kf.field_d, "act_screen_completion_1");
            hh.field_d[5] = eh.a("", (byte) -83, kf.field_d, "act_screen_completion_2");
            hh.field_d[8] = eh.a("", (byte) -111, kf.field_d, "act_screen_completion_3");
            al.field_c = eh.a("", (byte) -95, kf.field_d, "act_screen_completion_4");
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (9 <= var2_int) {
                    break L3;
                  } else {
                    if (var4 != 0) {
                      break L2;
                    } else {
                      var3 = 0;
                      L4: while (true) {
                        L5: {
                          L6: {
                            if (2 <= var3) {
                              break L6;
                            } else {
                              rc.field_a[var2_int][var3] = new nh(l.field_f[var2_int][var3].field_h / 4, l.field_f[var2_int][var3].field_c / 4);
                              rc.field_a[var2_int][var3].c();
                              l.field_f[var2_int][var3].b(0, 0);
                              var3++;
                              if (var4 != 0) {
                                break L5;
                              } else {
                                if (var4 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var2_int++;
                          break L5;
                        }
                        if (var4 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                dc.field_a = new nh(al.field_c.field_h / 4, al.field_c.field_c / 4);
                dc.field_a.c();
                al.field_c.b(0, 0);
                lb.field_C.a(98);
                rh.field_h = hh.field_d[2];
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "DrPhlogistonSavesTheEarth.TA(" + 22 + ')');
        }
    }

    private final void a(he[] param0, int param1, he[] param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                field_E = null;
                break L1;
              }
            }
            var4_int = param2.length - 1;
            L2: while (true) {
              L3: {
                L4: {
                  if (0 > var4_int) {
                    break L4;
                  } else {
                    param2[var4_int].d(param0[var4_int].field_k + -param2[var4_int].field_k);
                    var4_int--;
                    if (var5 != 0) {
                      break L3;
                    } else {
                      if (var5 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("DrPhlogistonSavesTheEarth.UA(");
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L5;
            }
          }
          L6: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L6;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
    }

    final static void a(int param0, int param1, java.awt.Canvas param2, int param3) {
        java.awt.Graphics var4 = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
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
                var4 = param2.getGraphics();
                lb.field_C.a(var4, param3, param0, 255);
                var4.dispose();
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var4_ref = (Exception) (Object) decompiledCaughtException;
                param2.repaint();
                break L2;
              }
            }
            L3: {
              if (param1 <= -67) {
                break L3;
              } else {
                field_G = null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4_ref2;
            stackOut_7_1 = new StringBuilder().append("DrPhlogistonSavesTheEarth.OB(").append(param0).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L4;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param3 + ')');
        }
    }

    private final void j() {
        kb var2 = null;
        int var3 = 0;
        L0: {
          we.a(sl.field_s, -79, 50.0f);
          ((DrPhlogistonSavesTheEarth) this).h(0);
          nl.field_r[0] = kb.a(aa.field_b, "", "menu_select").a().a(qk.field_g);
          var2 = kb.a(aa.field_b, "", "DrP_1_gatling_gun_fire");
          if (null != var2) {
            nl.field_r[1] = var2.a().a(qk.field_g);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var2 = kb.a(aa.field_b, "", "DrP_2_drop_bomb");
          if (var2 == null) {
            break L1;
          } else {
            nl.field_r[2] = var2.a().a(qk.field_g);
            break L1;
          }
        }
        L2: {
          var2 = kb.a(aa.field_b, "", "DrP_3_sonic_canon_fire");
          if (null != var2) {
            nl.field_r[3] = var2.a().a(qk.field_g);
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          var2 = kb.a(aa.field_b, "", "DrP_4_homing_missile_fire");
          if (var2 != null) {
            nl.field_r[4] = var2.a().a(qk.field_g);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          nl.field_r[5] = wi.a(2205, 100, 100);
          var2 = kb.a(aa.field_b, "", "DrP_6_mega_canon_fire");
          if (var2 != null) {
            nl.field_r[6] = var2.a().a(qk.field_g);
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          var2 = kb.a(aa.field_b, "", "DrP_7_loose_life");
          if (var2 == null) {
            break L5;
          } else {
            nl.field_r[7] = var2.a().a(qk.field_g);
            break L5;
          }
        }
        L6: {
          nl.field_r[8] = tk.a(ua.field_b, "", "DrP_8_respawn").c().a(qk.field_g);
          var2 = kb.a(aa.field_b, "", "DrP_9_final_death");
          if (null == var2) {
            break L6;
          } else {
            nl.field_r[9] = var2.a().a(qk.field_g);
            break L6;
          }
        }
        L7: {
          var2 = kb.a(aa.field_b, "", "DrP_10_tripod_hit");
          if (null != var2) {
            nl.field_r[10] = var2.a().a(qk.field_g);
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          var2 = kb.a(aa.field_b, "", "DrP_11_tripod_fire");
          if (var2 != null) {
            nl.field_r[11] = var2.a().a(qk.field_g);
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          var2 = kb.a(aa.field_b, "", "DrP_12_probes_hit");
          if (var2 != null) {
            nl.field_r[12] = var2.a().a(qk.field_g);
            break L9;
          } else {
            break L9;
          }
        }
        L10: {
          nl.field_r[13] = tk.a(ua.field_b, "", "DrP_13_probes_die").c().a(qk.field_g);
          var2 = kb.a(aa.field_b, "", "DrP_14_glider_fire");
          if (null != var2) {
            nl.field_r[14] = var2.a().a(qk.field_g);
            break L10;
          } else {
            break L10;
          }
        }
        L11: {
          var2 = kb.a(aa.field_b, "", "DrP_15_glider_die");
          if (var2 == null) {
            break L11;
          } else {
            nl.field_r[15] = var2.a().a(qk.field_g);
            break L11;
          }
        }
        L12: {
          var2 = kb.a(aa.field_b, "", "DrP_16_shredder_hit");
          if (null == var2) {
            break L12;
          } else {
            nl.field_r[16] = var2.a().a(qk.field_g);
            break L12;
          }
        }
        L13: {
          var2 = kb.a(aa.field_b, "", "DrP_17_shredder_die");
          if (var2 != null) {
            nl.field_r[17] = var2.a().a(qk.field_g);
            break L13;
          } else {
            break L13;
          }
        }
        L14: {
          var2 = kb.a(aa.field_b, "", "DrP_18_as_bot_hit");
          if (var2 == null) {
            break L14;
          } else {
            nl.field_r[18] = var2.a().a(qk.field_g);
            break L14;
          }
        }
        L15: {
          var2 = kb.a(aa.field_b, "", "DrP_19_as_bot_fire");
          if (null != var2) {
            nl.field_r[19] = var2.a().a(qk.field_g);
            break L15;
          } else {
            break L15;
          }
        }
        L16: {
          nl.field_r[20] = tk.a(ua.field_b, "", "DrP_20_as_bot_die").c().a(qk.field_g);
          nl.field_r[21] = tk.a(ua.field_b, "", "DrP_21_dropship_move").c().a(qk.field_g);
          nl.field_r[22] = tk.a(ua.field_b, "", "DrP_22_dropship_chrg").c().a(qk.field_g);
          var2 = kb.a(aa.field_b, "", "DrP_23_dropship_spawn");
          if (var2 == null) {
            break L16;
          } else {
            nl.field_r[23] = var2.a().a(qk.field_g);
            break L16;
          }
        }
        L17: {
          var2 = kb.a(aa.field_b, "", "DrP_24_dropship_fire");
          if (var2 == null) {
            break L17;
          } else {
            nl.field_r[24] = var2.a().a(qk.field_g);
            break L17;
          }
        }
        L18: {
          var2 = kb.a(aa.field_b, "", "DrP_25_dropship_hit");
          if (null == var2) {
            break L18;
          } else {
            nl.field_r[25] = var2.a().a(qk.field_g);
            break L18;
          }
        }
        L19: {
          nl.field_r[26] = tk.a(ua.field_b, "", "DrP_26_dropship_die").c().a(qk.field_g);
          var2 = kb.a(aa.field_b, "", "DrP_27_spacemine_exp");
          if (null != var2) {
            nl.field_r[27] = var2.a().a(qk.field_g);
            break L19;
          } else {
            break L19;
          }
        }
        L20: {
          var2 = kb.a(aa.field_b, "", "DrP_28_miner_hit");
          if (var2 == null) {
            break L20;
          } else {
            nl.field_r[28] = var2.a().a(qk.field_g);
            break L20;
          }
        }
        L21: {
          nl.field_r[29] = tk.a(ua.field_b, "", "DrP_29_miner_move").c().a(qk.field_g);
          var2 = kb.a(aa.field_b, "", "DrP_30_miner_die");
          if (null == var2) {
            break L21;
          } else {
            nl.field_r[30] = var2.a().a(qk.field_g);
            break L21;
          }
        }
        L22: {
          var2 = kb.a(aa.field_b, "", "DrP_31_asteroid_hit");
          if (var2 == null) {
            break L22;
          } else {
            nl.field_r[31] = var2.a().a(qk.field_g);
            break L22;
          }
        }
        L23: {
          var2 = kb.a(aa.field_b, "", "DrP_32b_asteroid_dest");
          if (null == var2) {
            break L23;
          } else {
            nl.field_r[32] = var2.a().a(qk.field_g);
            break L23;
          }
        }
        L24: {
          nl.field_r[33] = tk.a(ua.field_b, "", "DrP_33_battlecarr_move").c().a(qk.field_g);
          nl.field_r[34] = tk.a(ua.field_b, "", "DrP_34_battlecarr_charge").c().a(qk.field_g);
          var2 = kb.a(aa.field_b, "", "DrP_35_battlecarr_fire");
          if (var2 != null) {
            nl.field_r[35] = var2.a().a(qk.field_g);
            break L24;
          } else {
            break L24;
          }
        }
        L25: {
          var2 = kb.a(aa.field_b, "", "DrP_36_battlecarr_spawn");
          if (null != var2) {
            nl.field_r[36] = var2.a().a(qk.field_g);
            break L25;
          } else {
            break L25;
          }
        }
        L26: {
          var2 = kb.a(aa.field_b, "", "DrP_37_battlecarr_hit");
          if (var2 != null) {
            nl.field_r[37] = var2.a().a(qk.field_g);
            break L26;
          } else {
            break L26;
          }
        }
        L27: {
          nl.field_r[38] = tk.a(ua.field_b, "", "DrP_38_battlecarr_die").c().a(qk.field_g);
          nl.field_r[39] = tk.a(ua.field_b, "", "DrP_39_bunkers_hit").c().a(qk.field_g);
          var2 = kb.a(aa.field_b, "", "DrP_40_bunkers_die");
          if (null == var2) {
            break L27;
          } else {
            nl.field_r[40] = var2.a().a(qk.field_g);
            break L27;
          }
        }
        L28: {
          var2 = kb.a(aa.field_b, "", "DrP_41_combtank_fire");
          if (var2 == null) {
            break L28;
          } else {
            nl.field_r[41] = var2.a().a(qk.field_g);
            break L28;
          }
        }
        L29: {
          var2 = kb.a(aa.field_b, "", "DrP_42_combtank_hit");
          if (var2 == null) {
            break L29;
          } else {
            nl.field_r[42] = var2.a().a(qk.field_g);
            break L29;
          }
        }
        L30: {
          var2 = kb.a(aa.field_b, "", "DrP_43_combtank_die");
          if (var2 == null) {
            break L30;
          } else {
            nl.field_r[43] = var2.a().a(qk.field_g);
            break L30;
          }
        }
        L31: {
          var2 = kb.a(aa.field_b, "", "DrP_44_battank_fire");
          if (var2 == null) {
            break L31;
          } else {
            nl.field_r[44] = var2.a().a(qk.field_g);
            break L31;
          }
        }
        L32: {
          var2 = kb.a(aa.field_b, "", "DrP_45_battank_hit");
          if (var2 != null) {
            nl.field_r[45] = var2.a().a(qk.field_g);
            break L32;
          } else {
            break L32;
          }
        }
        L33: {
          var2 = kb.a(aa.field_b, "", "DrP_46_battank_die");
          if (var2 != null) {
            nl.field_r[46] = var2.a().a(qk.field_g);
            break L33;
          } else {
            break L33;
          }
        }
        L34: {
          nl.field_r[47] = tk.a(ua.field_b, "", "DrP_47_attackcop_move").c().a(qk.field_g);
          var2 = kb.a(aa.field_b, "", "DrP_48_attackcop_fire");
          if (null == var2) {
            break L34;
          } else {
            nl.field_r[48] = var2.a().a(qk.field_g);
            break L34;
          }
        }
        L35: {
          var2 = kb.a(aa.field_b, "", "DrP_49_attackcop_hit");
          if (var2 != null) {
            nl.field_r[49] = var2.a().a(qk.field_g);
            break L35;
          } else {
            break L35;
          }
        }
        L36: {
          nl.field_r[50] = tk.a(ua.field_b, "", "DrP_50_attackcop_die").c().a(qk.field_g);
          nl.field_r[51] = tk.a(ua.field_b, "", "DrP_51_doomcop_move").c().a(qk.field_g);
          var2 = kb.a(aa.field_b, "", "DrP_52_doomcop_fire");
          if (var2 != null) {
            nl.field_r[52] = var2.a().a(qk.field_g);
            break L36;
          } else {
            break L36;
          }
        }
        L37: {
          var2 = kb.a(aa.field_b, "", "DrP_53_doomcop_hit");
          if (null != var2) {
            nl.field_r[53] = var2.a().a(qk.field_g);
            break L37;
          } else {
            break L37;
          }
        }
        L38: {
          nl.field_r[54] = tk.a(ua.field_b, "", "DrP_54_doomcop_die").c().a(qk.field_g);
          var2 = kb.a(aa.field_b, "", "DrP_55_floatbat_move");
          if (null != var2) {
            nl.field_r[55] = var2.a().a(qk.field_g);
            break L38;
          } else {
            break L38;
          }
        }
        L39: {
          nl.field_r[56] = tk.a(ua.field_b, "", "DrP_56_floatbat_chrg").c().a(qk.field_g);
          var2 = kb.a(aa.field_b, "", "DrP_57_floatbat_fire");
          if (null != var2) {
            nl.field_r[57] = var2.a().a(qk.field_g);
            break L39;
          } else {
            break L39;
          }
        }
        L40: {
          var2 = kb.a(aa.field_b, "", "DrP_58_floatbat_spawn");
          if (null != var2) {
            nl.field_r[58] = var2.a().a(qk.field_g);
            break L40;
          } else {
            break L40;
          }
        }
        L41: {
          var2 = kb.a(aa.field_b, "", "DrP_59_floatbat_hit");
          if (null == var2) {
            break L41;
          } else {
            nl.field_r[59] = var2.a().a(qk.field_g);
            break L41;
          }
        }
        L42: {
          nl.field_r[60] = tk.a(ua.field_b, "", "DrP_60_floatbat_die").c().a(qk.field_g);
          var2 = kb.a(aa.field_b, "", "DrP_61_alcomship_move");
          if (var2 == null) {
            break L42;
          } else {
            nl.field_r[61] = var2.a().a(qk.field_g);
            break L42;
          }
        }
        L43: {
          nl.field_r[62] = tk.a(ua.field_b, "", "DrP_62_alcomship_chrg").c().a(qk.field_g);
          var2 = kb.a(aa.field_b, "", "DrP_63_alcomship_fire");
          if (null == var2) {
            break L43;
          } else {
            nl.field_r[63] = var2.a().a(qk.field_g);
            break L43;
          }
        }
        L44: {
          var2 = kb.a(aa.field_b, "", "DrP_64_alcomship_spawn");
          if (null != var2) {
            nl.field_r[64] = var2.a().a(qk.field_g);
            break L44;
          } else {
            break L44;
          }
        }
        L45: {
          var2 = kb.a(aa.field_b, "", "DrP_65_alcomship_fire2");
          if (var2 != null) {
            nl.field_r[65] = var2.a().a(qk.field_g);
            break L45;
          } else {
            break L45;
          }
        }
        L46: {
          var2 = kb.a(aa.field_b, "", "DrP_66_alcomship_hit");
          if (null != var2) {
            nl.field_r[66] = var2.a().a(qk.field_g);
            break L46;
          } else {
            break L46;
          }
        }
        L47: {
          nl.field_r[67] = tk.a(ua.field_b, "", "DrP_67_alcomship_die").c().a(qk.field_g);
          var2 = kb.a(aa.field_b, "", "DrP_68_humbuild_hit");
          if (var2 != null) {
            nl.field_r[68] = var2.a().a(qk.field_g);
            break L47;
          } else {
            break L47;
          }
        }
        L48: {
          if (var2 == null) {
            break L48;
          } else {
            nl.field_r[69] = var2.a().a(qk.field_g);
            break L48;
          }
        }
        L49: {
          var2 = kb.a(aa.field_b, "", "DrP_70_allpowerups");
          if (var2 == null) {
            break L49;
          } else {
            nl.field_r[70] = var2.a().a(qk.field_g);
            break L49;
          }
        }
        L50: {
          var2 = kb.a(aa.field_b, "", "DrP_32c_asteroid_dest");
          var3 = -47;
          if (var2 == null) {
            break L50;
          } else {
            nl.field_r[71] = var2.a().a(qk.field_g);
            break L50;
          }
        }
        L51: {
          var2 = kb.a(aa.field_b, "", "DrP_32a_asteroid_dest");
          if (var2 == null) {
            break L51;
          } else {
            nl.field_r[72] = var2.a().a(qk.field_g);
            break L51;
          }
        }
        L52: {
          var2 = kb.a(aa.field_b, "", "drp_71_tesla_coil");
          if (var2 == null) {
            break L52;
          } else {
            nl.field_r[73] = var2.a().a(qk.field_g);
            break L52;
          }
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            String stackIn_11_2 = null;
            Throwable decompiledCaughtException = null;
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
                    L2: {
                      if (param1 <= -92) {
                        break L2;
                      } else {
                        boolean discarded$4 = DrPhlogistonSavesTheEarth.t(-37);
                        break L2;
                      }
                    }
                    var2 = new java.net.URL(param0.getCodeBase(), "quit.ws");
                    int discarded$5 = 4767999;
                    param0.getAppletContext().showDocument(kk.a(var2, param0), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_7_0 = (RuntimeException) var2_ref2;
                stackOut_7_1 = new StringBuilder().append("DrPhlogistonSavesTheEarth.JB(");
                stackIn_10_0 = stackOut_7_0;
                stackIn_10_1 = stackOut_7_1;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                if (param0 == null) {
                  stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                  stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                  stackOut_10_2 = "null";
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  stackIn_11_2 = stackOut_10_2;
                  break L4;
                } else {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "{...}";
                  stackIn_11_0 = stackOut_8_0;
                  stackIn_11_1 = stackOut_8_1;
                  stackIn_11_2 = stackOut_8_2;
                  break L4;
                }
              }
              throw ie.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void h() {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            we.a(qa.field_O, -77, 60.0f);
            ni.field_q = kc.a(ff.field_P, kf.field_d, "", 33, "font");
            a.field_g = kc.a(ff.field_P, kf.field_d, "", 85, "small_font");
            ji.field_d = kc.a(ff.field_P, kf.field_d, "", -101, "bottomheavy32");
            cb.field_b = kc.a(ff.field_P, kf.field_d, "", -95, "scriptfont");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "DrPhlogistonSavesTheEarth.NB(" + -83 + ')');
        }
    }

    private final void s(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              we.a(qa.field_O, -111, 95.0f);
              int discarded$17 = 1;
              nc.field_M = qk.a("", kf.field_d, "mb_foreground");
              int discarded$18 = 1;
              eb.field_g = qk.a("", kf.field_d, "mb_logo");
              int discarded$19 = 1;
              nh discarded$20 = qk.a("", kf.field_d, "mb_transparency_layer");
              int discarded$21 = 1;
              nh discarded$22 = qk.a("", kf.field_d, "mb_signup_button_frame");
              int discarded$23 = 1;
              v.field_Y = qk.a("", kf.field_d, "mb_price_background");
              int discarded$24 = 1;
              nh discarded$25 = qk.a("", kf.field_d, "mb_menu_button_frame");
              cm.field_R = new nh[8];
              int discarded$26 = 1;
              cm.field_R[0] = qk.a("", kf.field_d, "mb_screenshot_1");
              int discarded$27 = 1;
              cm.field_R[1] = qk.a("", kf.field_d, "mb_screenshot_2");
              int discarded$28 = 1;
              cm.field_R[2] = qk.a("", kf.field_d, "mb_screenshot_3");
              int discarded$29 = 1;
              cm.field_R[3] = qk.a("", kf.field_d, "mb_screenshot_4");
              int discarded$30 = 1;
              cm.field_R[4] = qk.a("", kf.field_d, "mb_screenshot_5");
              if (param0 == -23796) {
                break L1;
              } else {
                this.s(-63);
                break L1;
              }
            }
            int discarded$31 = 1;
            cm.field_R[5] = qk.a("", kf.field_d, "mb_screenshot_6");
            int discarded$32 = 1;
            cm.field_R[6] = qk.a("", kf.field_d, "mb_screenshot_7");
            int discarded$33 = 1;
            cm.field_R[7] = qk.a("", kf.field_d, "mb_screenshot_8");
            sg.field_e.h();
            uk.field_h.h();
            oi.field_f.h();
            nj.field_o.h();
            cc.field_w.h();
            b.field_k.h();
            lb.field_C.a(107);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "DrPhlogistonSavesTheEarth.EB(" + param0 + ')');
        }
    }

    final void a(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              int discarded$6 = -2;
              ek.d();
              if (null != df.field_l) {
                hb.a(-5, (java.awt.Canvas) (Object) df.field_l);
                df.field_l.a(sb.field_d, true);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              int discarded$7 = 67;
              sb.b();
              if (param0 <= -120) {
                break L2;
              } else {
                field_I = 81L;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "DrPhlogistonSavesTheEarth.AA(" + param0 + ')');
        }
    }

    final void a(int param0) {
        ug var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 32) {
                break L1;
              } else {
                field_J = null;
                break L1;
              }
            }
            ((DrPhlogistonSavesTheEarth) this).a(8, 4, false, 7320, 0, 11, 10, 9);
            var2 = new ug();
            var2.d(9, 128, param0 ^ 85);
            var2.a(oa.field_b, (byte) -13);
            dc.a(sb.field_d, 22050, true, var2, (byte) -92, (java.awt.Component) (Object) n.field_g);
            a.field_i = 16711680;
            pj.field_E = 11184895;
            b.field_h = 16777215;
            ((DrPhlogistonSavesTheEarth) this).a(true, false, true, true, -6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2_ref, "DrPhlogistonSavesTheEarth.MA(" + param0 + ')');
        }
    }

    private final he[] a(byte param0, he[] param1) {
        he[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        he[] stackIn_7_0 = null;
        he[] stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        he[] stackOut_6_0 = null;
        he[] stackOut_10_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var5 = field_D ? 1 : 0;
        try {
          L0: {
            var3 = new he[param1.length];
            var4 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var4 >= param1.length) {
                    break L3;
                  } else {
                    stackOut_6_0 = (he[]) var3;
                    stackIn_11_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      stackIn_7_0[var4] = param1[var4].a();
                      var4++;
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_10_0 = (he[]) var3;
                stackIn_11_0 = stackOut_10_0;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3_ref;
            stackOut_12_1 = new StringBuilder().append("DrPhlogistonSavesTheEarth.AB(").append(-105).append(',');
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L4;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_11_0;
    }

    public static void u(int param0) {
        field_E = null;
        field_F = null;
        if (param0 != -16387) {
            return;
        }
        try {
            field_J = null;
            field_L = null;
            field_G = null;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "DrPhlogistonSavesTheEarth.QA(" + param0 + ')');
        }
    }

    private final void r() {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            we.a(qa.field_O, -126, 62.0f);
            ea.field_c = eh.a("", (byte) -92, kf.field_d, "gameinterface");
            fk.field_m = eh.a("", (byte) -78, kf.field_d, "get_ready_window");
            ph.field_h = eh.a("", (byte) -40, kf.field_d, "title_screen");
            qj.field_f = eh.a("", (byte) -126, kf.field_d, "title_screen_chars");
            rk.field_a = eh.a("", (byte) -99, kf.field_d, "slider_background");
            oi.field_h = eh.a("", (byte) -100, kf.field_d, "slider_foreground");
            gg.field_d = eh.a("", (byte) -84, kf.field_d, "title_text_highscore_screen");
            we.field_g = eh.a("", (byte) -61, kf.field_d, "title_text_instructions_screen");
            qe.field_k = eh.a("", (byte) -87, kf.field_d, "title_text_achievements_screen");
            el.field_ub = eh.a("", (byte) -23, kf.field_d, "title_text_achievements_this_game_screen");
            jk.field_L = eh.a("", (byte) -100, kf.field_d, "title_text_level_select_screen");
            cj.field_g = eh.a("", (byte) -24, kf.field_d, "title_text_world_complete");
            he discarded$1 = eh.a("", (byte) -91, kf.field_d, "title_text_members_benefits");
            oj.field_d = eh.a("", (byte) -54, kf.field_d, "title_text_log_in");
            pi.field_S = ij.a("numbers", (byte) 111, kf.field_d, "");
            t.field_a = eh.a("", (byte) -65, kf.field_d, "claw");
            bb.field_b = t.field_a.e();
            bb.field_b.g();
            la.field_a = t.field_a.e();
            la.field_a.f();
            ri.field_o = bb.field_b.e();
            ri.field_o.f();
            ek.field_m = eh.a("", (byte) -115, kf.field_d, "claw_h_bar");
            cl.field_t = eh.a("", (byte) -57, kf.field_d, "claw_v_bar");
            tb.field_d = cl.field_t.e();
            tb.field_d.g();
            jl.field_h = eh.a("", (byte) -89, kf.field_d, "help_key_shift");
            wg.field_c = eh.a("", (byte) -49, kf.field_d, "help_key_ctrl");
            na.field_c = eh.a("", (byte) -33, kf.field_d, "help_key_space");
            ul.field_h = eh.a("", (byte) -82, kf.field_d, "help_key_z");
            qb.field_d = eh.a("", (byte) -72, kf.field_d, "help_key_x");
            lk.field_k = eh.a("", (byte) -98, kf.field_d, "help_key_c");
            lb.field_D = eh.a("", (byte) -69, kf.field_d, "help_key_v");
            ki.field_b = eh.a("", (byte) -40, kf.field_d, "help_key_up");
            si.field_D = ki.field_b.e();
            si.field_D.i();
            fk.field_l = si.field_D.e();
            fk.field_l.i();
            lc.field_s = fk.field_l.e();
            lc.field_s.i();
            dh.field_R[0] = eh.a("", (byte) -66, kf.field_d, "game_interface_weapon_gatling_gun");
            dh.field_R[1] = eh.a("", (byte) -33, kf.field_d, "game_interface_weapon_bomb");
            dh.field_R[2] = eh.a("", (byte) -45, kf.field_d, "game_interface_weapon_sonic");
            dh.field_R[3] = eh.a("", (byte) -25, kf.field_d, "game_interface_weapon_missile");
            al.field_a[0] = eh.a("", (byte) -48, kf.field_d, "tutorial_dp_happy");
            al.field_a[1] = eh.a("", (byte) -27, kf.field_d, "tutorial_dp_det");
            al.field_a[2] = eh.a("", (byte) -103, kf.field_d, "tutorial_cp_happy");
            al.field_a[3] = eh.a("", (byte) -113, kf.field_d, "tutorial_cp_det");
            ca.field_W = la.a("", kf.field_d, "frame", -82);
            ch.field_z = la.a("", kf.field_d, "frame_button", -53);
            ee.field_c = la.a("", kf.field_d, "frame_button_dn", -54);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "DrPhlogistonSavesTheEarth.BB(" + 2 + ')');
        }
    }

    private final void i() {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = field_D ? 1 : 0;
        try {
          L0: {
            we.a(qa.field_O, -105, 78.0f);
            ph.field_a = ij.a("alientripod", (byte) 69, kf.field_d, "");
            af.field_e = new he[ph.field_a.length];
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (ph.field_a.length <= var2_int) {
                    break L3;
                  } else {
                    ph.field_a[var2_int].c();
                    af.field_e[var2_int] = ph.field_a[var2_int].a();
                    var2_int++;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                ib.field_u = ij.a("alienprobe", (byte) 77, kf.field_d, "");
                bg.field_t = ij.a("aliendeathprobe", (byte) 73, kf.field_d, "");
                dh.field_S = ij.a("aliendeathglider", (byte) 113, kf.field_d, "");
                mj.field_w = this.a((byte) -105, dh.field_S);
                wd.field_f = ij.a("aliendoomglider", (byte) 114, kf.field_d, "");
                fa.field_n = ij.a("alienshredder", (byte) 118, kf.field_d, "");
                t.field_c = ij.a("alienassaultbot", (byte) 127, kf.field_d, "");
                cm.field_Q = ij.a("aliendropship", (byte) 58, kf.field_d, "");
                od.field_i = ij.a("alienspacemine", (byte) 101, kf.field_d, "");
                uf.field_j = ij.a("alienspacemineseeking", (byte) 89, kf.field_d, "");
                ng.field_f = ij.a("alienparamine", (byte) 112, kf.field_d, "");
                jd.field_M = ij.a("alienminer", (byte) 77, kf.field_d, "");
                vd.field_g = ij.a("alienminer_door", (byte) 63, kf.field_d, "");
                we.field_b = be.b(eh.a("", (byte) -36, kf.field_d, "alienasteroid_1"), 64);
                ee.field_b = be.b(eh.a("", (byte) -92, kf.field_d, "alienasteroid_2"), 64);
                ae.field_lb = be.b(eh.a("", (byte) -81, kf.field_d, "alienasteroid_3"), 64);
                ad.field_s = ij.a("alienbattlecarrier", (byte) 54, kf.field_d, "");
                ib.field_r = ij.a("alienbattlecarrier_side_arms", (byte) 85, kf.field_d, "");
                mi.field_i = ij.a("alienbattlecarrier_middle_arms", (byte) 90, kf.field_d, "");
                fa.field_k = ij.a("alienbunker", (byte) 123, kf.field_d, "");
                ub.field_a = be.a(eh.a("", (byte) -111, kf.field_d, "alienbunker_rubble"), fa.field_k.length);
                ib.field_j = new he[fa.field_k.length];
                rh.field_l = new he[fa.field_k.length];
                break L2;
              }
              var2_int = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (~var2_int <= ~ib.field_j.length) {
                      break L6;
                    } else {
                      fa.field_k[var2_int].c();
                      ub.field_a[var2_int].c();
                      ib.field_j[var2_int] = fa.field_k[var2_int].e();
                      ib.field_j[var2_int].c(128);
                      rh.field_l[var2_int] = ub.field_a[var2_int].e();
                      rh.field_l[var2_int].c(128);
                      var2_int++;
                      if (var3 != 0) {
                        break L5;
                      } else {
                        if (var3 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  lb.field_C.a(100);
                  wk.field_m = ij.a("alienbunker_big", (byte) 123, kf.field_d, "");
                  this.a(99, wk.field_m);
                  break L5;
                }
                qb.field_a = be.a(eh.a("", (byte) -80, kf.field_d, "alienbunker_big_rubble"), wk.field_m.length);
                this.a(85, qb.field_a);
                uk.field_b = be.a(eh.a("", (byte) -34, kf.field_d, "alienbunker_big_fire_mask"), wk.field_m.length);
                this.a(99, uk.field_b);
                j.field_db = ij.a("aliencombattank", (byte) 105, kf.field_d, "");
                var2_int = 0;
                L7: while (true) {
                  L8: {
                    L9: {
                      if (j.field_db.length <= var2_int) {
                        break L9;
                      } else {
                        j.field_db[var2_int].c();
                        var2_int++;
                        if (var3 != 0) {
                          break L8;
                        } else {
                          if (var3 == 0) {
                            continue L7;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    jj.field_a = be.a(eh.a("", (byte) -110, kf.field_d, "aliencombattank_rubble"), j.field_db.length);
                    break L8;
                  }
                  var2_int = 0;
                  L10: while (true) {
                    L11: {
                      L12: {
                        if (var2_int >= jj.field_a.length) {
                          break L12;
                        } else {
                          jj.field_a[var2_int].c();
                          var2_int++;
                          if (var3 != 0) {
                            break L11;
                          } else {
                            if (var3 == 0) {
                              continue L10;
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                      mk.field_e = ij.a("alienbattletank", (byte) 62, kf.field_d, "");
                      break L11;
                    }
                    var2_int = 0;
                    L13: while (true) {
                      L14: {
                        L15: {
                          if (~var2_int <= ~mk.field_e.length) {
                            break L15;
                          } else {
                            mk.field_e[var2_int].c();
                            var2_int++;
                            if (var3 != 0) {
                              break L14;
                            } else {
                              if (var3 == 0) {
                                continue L13;
                              } else {
                                break L15;
                              }
                            }
                          }
                        }
                        nc.field_I = be.a(eh.a("", (byte) -42, kf.field_d, "alienbattletank_rubble"), mk.field_e.length);
                        break L14;
                      }
                      var2_int = 0;
                      L16: while (true) {
                        L17: {
                          L18: {
                            if (nc.field_I.length <= var2_int) {
                              break L18;
                            } else {
                              nc.field_I[var2_int].c();
                              var2_int++;
                              if (var3 != 0) {
                                break L17;
                              } else {
                                if (var3 == 0) {
                                  continue L16;
                                } else {
                                  break L18;
                                }
                              }
                            }
                          }
                          pf.field_c = ij.a("alienattackcopter", (byte) 113, kf.field_d, "");
                          wd.field_a = ij.a("aliendoomcopter", (byte) 118, kf.field_d, "");
                          sd.field_c = ij.a("alienflyingbattlestation", (byte) 111, kf.field_d, "");
                          ff.field_R = ij.a("alienalienbattleship", (byte) 84, kf.field_d, "");
                          nj.field_d = ij.a("alien_meteor", (byte) 82, kf.field_d, "");
                          wi.field_c = ij.a("alien_abductor", (byte) 94, kf.field_d, "");
                          wa.field_O = ij.a("scenery_tile_tesla_coil", (byte) 64, kf.field_d, "");
                          u.field_a = this.a(-1745, 2, eh.a("", (byte) -55, kf.field_d, "scenery_tile_tesla_coil_broken"));
                          this.a(122, u.field_a);
                          int discarded$2 = 65793;
                          jk.field_H = this.a(wa.field_O);
                          int discarded$3 = 65793;
                          si.field_G = this.a(u.field_a);
                          eh.field_b = ij.a("alien_cargo_ship", (byte) 101, kf.field_d, "");
                          pj.field_B[0] = ij.a("scenery_tile_mothership_girder_1", (byte) 89, kf.field_d, "");
                          pj.field_B[1] = ij.a("scenery_tile_mothership_girder_2", (byte) 110, kf.field_d, "");
                          pj.field_B[2] = ij.a("scenery_tile_mothership_girder_3", (byte) 116, kf.field_d, "");
                          nl.field_n[0] = ij.a("scenery_tile_mothership_background_1", (byte) 72, kf.field_d, "");
                          nl.field_n[1] = ij.a("scenery_tile_mothership_window", (byte) 78, kf.field_d, "");
                          nl.field_n[2] = ij.a("scenery_tile_mothership_background_3", (byte) 107, kf.field_d, "");
                          kc.field_l = ij.a("scenery_tile_mothership_antennae_yagi", (byte) 54, kf.field_d, "");
                          ta.field_d = ij.a("scenery_tile_mothership_antennae_parabolic", (byte) 109, kf.field_d, "");
                          m.field_a = ij.a("scenery_tile_mothership_antennae_yagi_broken", (byte) 90, kf.field_d, "");
                          ki.field_a = ij.a("scenery_tile_mothership_antennae_parabolic_broken", (byte) 83, kf.field_d, "");
                          hc.field_M[0] = ij.a("scenery_tile_mothership_platform_1", (byte) 110, kf.field_d, "");
                          hc.field_M[1] = ij.a("scenery_tile_mothership_platform_2", (byte) 102, kf.field_d, "");
                          hc.field_M[2] = ij.a("scenery_tile_mothership_platform_3", (byte) 72, kf.field_d, "");
                          kk.field_b[0] = ij.a("scenery_tile_mothership_scenery_1", (byte) 64, kf.field_d, "");
                          kk.field_b[1] = ij.a("scenery_tile_mothership_scenery_2", (byte) 82, kf.field_d, "");
                          lf.field_e[0] = ij.a("scenery_tile_mothership_scenery_1_broken", (byte) 118, kf.field_d, "");
                          lf.field_e[1] = ij.a("scenery_tile_mothership_scenery_2_broken", (byte) 68, kf.field_d, "");
                          this.a(kk.field_b[0], 0, lf.field_e[0]);
                          this.a(kk.field_b[1], 0, lf.field_e[1]);
                          ca.field_bb = ij.a("scenery_tile_mothership_docking_platform", (byte) 82, kf.field_d, "");
                          sf.field_m = ij.a("scenery_tile_mothership_gun_turret_base", (byte) 83, kf.field_d, "");
                          sf.field_m[0].c();
                          lc.field_i = be.b(eh.a("", (byte) -26, kf.field_d, "scenery_tile_mothership_gun_turret"), 32);
                          bh.field_b = new he[1];
                          bh.field_b[0] = sf.field_m[0].e();
                          bh.field_b[0].f();
                          bh.field_b[0].c();
                          sj.field_f = sf.field_m;
                          jk.field_I = be.b(eh.a("", (byte) -47, kf.field_d, "scenery_tile_mothership_missile_launcher"), 32);
                          qf.field_g = this.a(-1745, 4, eh.a("", (byte) -78, kf.field_d, "scenery_tile_mothership_docking_platform_broken"));
                          qg.field_W = ij.a("scenery_tile_mothership_gun_turret_broken", (byte) 114, kf.field_d, "");
                          tl.field_I = new he[1];
                          tl.field_I[0] = qg.field_W[0].e();
                          tl.field_I[0].f();
                          eg.field_f = qg.field_W;
                          le.field_b = ij.a("scenery_tile_smokestack", (byte) 114, kf.field_d, "");
                          ck.field_k = ij.a("scenery_tile_smokestack_broken", (byte) 59, kf.field_d, "");
                          le.field_b[0].c();
                          ck.field_k[0].c();
                          ad.field_v = new he[1];
                          bh.field_e = new he[1];
                          ad.field_v[0] = le.field_b[0].a();
                          bh.field_e[0] = ck.field_k[0].a();
                          this.a(124, pj.field_B[0]);
                          this.a(97, pj.field_B[1]);
                          this.a(97, pj.field_B[2]);
                          this.a(98, nl.field_n[0]);
                          this.a(91, nl.field_n[1]);
                          this.a(118, nl.field_n[2]);
                          this.a(118, kc.field_l);
                          this.a(99, ta.field_d);
                          this.a(107, m.field_a);
                          this.a(121, ki.field_a);
                          this.a(82, hc.field_M[0]);
                          this.a(98, hc.field_M[1]);
                          this.a(127, hc.field_M[2]);
                          this.a(95, ph.field_c[0]);
                          this.a(98, ph.field_c[1]);
                          this.a(82, ph.field_c[2]);
                          this.a(102, ca.field_bb);
                          this.a(86, sf.field_m);
                          this.a(107, sj.field_f);
                          this.a(81, qf.field_g);
                          this.a(99, qg.field_W);
                          this.a(98, eg.field_f);
                          oi.field_a = ij.a("human_abductee_male", (byte) 67, kf.field_d, "");
                          cc.field_y = ij.a("human_abductee_female", (byte) 87, kf.field_d, "");
                          og.field_e = ij.a("human_abductee_baby", (byte) 95, kf.field_d, "");
                          break L17;
                        }
                        break L0;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "DrPhlogistonSavesTheEarth.DB(" + -125 + ')');
        }
    }

    public DrPhlogistonSavesTheEarth() {
        ((DrPhlogistonSavesTheEarth) this).field_H = 0;
        ((DrPhlogistonSavesTheEarth) this).field_C = false;
    }

    private final boolean b(boolean param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_9_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_119_0 = 0;
        int stackIn_129_0 = 0;
        int stackIn_144_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_74_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_118_0 = 0;
        int stackOut_143_0 = 0;
        int stackOut_128_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_8_0 = 0;
        var10 = field_D ? 1 : 0;
        try {
          L0: {
            if (null == aa.field_b) {
              if (null != ua.field_b) {
                qk.field_g = null;
                ua.field_b = null;
                int discarded$23 = 86;
                tc.a();
                stackOut_74_0 = 0;
                stackIn_75_0 = stackOut_74_0;
                return stackIn_75_0 != 0;
              } else {
                if (null != df.field_a) {
                  we.a(ai.field_x, -83, 55.0f);
                  ((DrPhlogistonSavesTheEarth) this).h(0);
                  ad.field_q = ok.a(df.field_a, "", "Dr_Phlogiston_Title");
                  boolean discarded$24 = s.field_a.a(0, ui.field_a, 0, ad.field_q, cf.field_c);
                  ki.field_c = ok.a(df.field_a, "", "Dr_Phlogiston_Earth");
                  boolean discarded$25 = s.field_a.a(0, ui.field_a, 0, ki.field_c, cf.field_c);
                  hi.field_l = ok.a(df.field_a, "", "Dr_Phlogiston_Space");
                  boolean discarded$26 = s.field_a.a(0, ui.field_a, 0, hi.field_l, cf.field_c);
                  le.field_e = ok.a(df.field_a, "", "Dr_Phlogiston_Alien");
                  boolean discarded$27 = s.field_a.a(0, ui.field_a, 0, le.field_e, cf.field_c);
                  lh.field_l = ok.a(df.field_a, "", "Dr_Phlogiston_Boss_Break");
                  dm.field_x = ok.a(df.field_a, "", "Dr_Phlogiston_GameOver_jingle");
                  boolean discarded$28 = s.field_a.a(0, ui.field_a, 0, dm.field_x, cf.field_c);
                  ml.field_l = ok.a(df.field_a, "", "Dr_Phlogiston_GameComplete_jingle");
                  boolean discarded$29 = s.field_a.a(0, ui.field_a, 0, ml.field_l, cf.field_c);
                  s.field_a.b((byte) 47);
                  cf.field_c = null;
                  df.field_a = null;
                  ui.field_a = null;
                  int discarded$30 = 86;
                  tc.a();
                  stackOut_79_0 = 0;
                  stackIn_80_0 = stackOut_79_0;
                  return stackIn_80_0 != 0;
                } else {
                  if (null != kf.field_d) {
                    L1: {
                      if (((DrPhlogistonSavesTheEarth) this).field_H == 0) {
                        int discarded$31 = -83;
                        this.h();
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    L2: {
                      if (((DrPhlogistonSavesTheEarth) this).field_H == 1) {
                        int discarded$32 = 2;
                        this.r();
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      if (2 != ((DrPhlogistonSavesTheEarth) this).field_H) {
                        break L3;
                      } else {
                        int discarded$33 = 22;
                        this.k();
                        break L3;
                      }
                    }
                    L4: {
                      if (((DrPhlogistonSavesTheEarth) this).field_H == 3) {
                        int discarded$34 = -11666;
                        this.q();
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (((DrPhlogistonSavesTheEarth) this).field_H != 4) {
                        break L5;
                      } else {
                        int discarded$35 = -125;
                        this.i();
                        break L5;
                      }
                    }
                    L6: {
                      if (((DrPhlogistonSavesTheEarth) this).field_H == 5) {
                        int discarded$36 = 1;
                        this.d();
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      if (((DrPhlogistonSavesTheEarth) this).field_H == 6) {
                        int discarded$37 = 125;
                        this.o();
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (((DrPhlogistonSavesTheEarth) this).field_H == 7) {
                        this.s(-23796);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (((DrPhlogistonSavesTheEarth) this).field_H == 8) {
                        kf.field_d = null;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    ((DrPhlogistonSavesTheEarth) this).field_H = ((DrPhlogistonSavesTheEarth) this).field_H + 1;
                    int discarded$38 = 86;
                    tc.a();
                    stackOut_118_0 = 0;
                    stackIn_119_0 = stackOut_118_0;
                    return stackIn_119_0 != 0;
                  } else {
                    if (null == mh.field_a) {
                      var3_int = 0;
                      L10: while (true) {
                        L11: {
                          L12: {
                            if (13 <= var3_int) {
                              break L12;
                            } else {
                              th.field_a[var3_int] = new ld(var3_int);
                              var3_int++;
                              if (var10 != 0) {
                                break L11;
                              } else {
                                if (var10 == 0) {
                                  continue L10;
                                } else {
                                  break L12;
                                }
                              }
                            }
                          }
                          hl.field_f = 0;
                          s.c((byte) 88);
                          var3_int = 3072;
                          break L11;
                        }
                        L13: {
                          var4 = 30;
                          var5 = 15;
                          var6 = 10;
                          var7 = -2;
                          var8 = v.field_Y.field_y - 20;
                          var9 = v.field_Y.field_w - 20;
                          gl.a(var9, var8, (byte) -96, var5, var4, v.field_Y);
                          gg.a(1000, cm.field_R);
                          bi.a(ml.field_j, 121, nc.field_M);
                          if (param1 <= -91) {
                            break L13;
                          } else {
                            field_L = null;
                            break L13;
                          }
                        }
                        L14: {
                          int discarded$39 = 21914;
                          pi.a(eb.field_g);
                          int discarded$40 = 15488514;
                          wb.a((java.applet.Applet) this, 2, 1052688, 150, ej.field_e);
                          ah.a((byte) 109, 50);
                          k.a(0, 50);
                          if (oh.a(0)) {
                            break L14;
                          } else {
                            ri.field_f = ge.a(4, (byte) -79);
                            vi.field_c = ck.a(0, 5, 1, true);
                            break L14;
                          }
                        }
                        int discarded$41 = 86;
                        tc.a();
                        stackOut_143_0 = 1;
                        stackIn_144_0 = stackOut_143_0;
                        break L0;
                      }
                    } else {
                      var3_int = 0;
                      L15: while (true) {
                        L16: {
                          L17: {
                            if (var3_int >= 9) {
                              break L17;
                            } else {
                              bi.field_K[var3_int] = new mk(mh.field_a.a("", "AchirdAttacks_level_" + (1 + var3_int) + ".lvl", 24874), var3_int % 3 - -1);
                              var3_int++;
                              if (var10 != 0) {
                                break L16;
                              } else {
                                if (var10 == 0) {
                                  continue L15;
                                } else {
                                  break L17;
                                }
                              }
                            }
                          }
                          mh.field_a = null;
                          int discarded$42 = 86;
                          tc.a();
                          break L16;
                        }
                        stackOut_128_0 = 0;
                        stackIn_129_0 = stackOut_128_0;
                        return stackIn_129_0 != 0;
                      }
                    }
                  }
                }
              }
            } else {
              L18: {
                if (!aa.field_b.a(0)) {
                  break L18;
                } else {
                  if (aa.field_b.c((byte) 79)) {
                    L19: {
                      if (!ua.field_b.a(0)) {
                        break L19;
                      } else {
                        if (!ua.field_b.c((byte) 21)) {
                          break L19;
                        } else {
                          L20: {
                            if (!ui.field_a.a(0)) {
                              break L20;
                            } else {
                              if (!ui.field_a.c((byte) 56)) {
                                break L20;
                              } else {
                                L21: {
                                  if (!df.field_a.a(0)) {
                                    break L21;
                                  } else {
                                    if (!df.field_a.c((byte) 53)) {
                                      break L21;
                                    } else {
                                      L22: {
                                        if (!kf.field_d.a(0)) {
                                          break L22;
                                        } else {
                                          if (!kf.field_d.c((byte) 84)) {
                                            break L22;
                                          } else {
                                            L23: {
                                              if (!mh.field_a.a(0)) {
                                                break L23;
                                              } else {
                                                if (!mh.field_a.c((byte) 64)) {
                                                  break L23;
                                                } else {
                                                  L24: {
                                                    if (!ff.field_P.a(0)) {
                                                      break L24;
                                                    } else {
                                                      if (!ff.field_P.c((byte) 109)) {
                                                        break L24;
                                                      } else {
                                                        L25: {
                                                          if (!ph.field_b.a(0)) {
                                                            break L25;
                                                          } else {
                                                            if (!ph.field_b.a(255, "basic")) {
                                                              break L25;
                                                            } else {
                                                              if (param0) {
                                                                bh.b(77);
                                                                cf.field_c = new cf(aa.field_b, ua.field_b);
                                                                qk.field_g = new ng(22050, id.field_d);
                                                                int discarded$43 = -30;
                                                                this.j();
                                                                aa.field_b = null;
                                                                stackOut_69_0 = 0;
                                                                stackIn_70_0 = stackOut_69_0;
                                                                return stackIn_70_0 != 0;
                                                              } else {
                                                                stackOut_67_0 = 0;
                                                                stackIn_68_0 = stackOut_67_0;
                                                                return stackIn_68_0 != 0;
                                                              }
                                                            }
                                                          }
                                                        }
                                                        we.a(qg.a(td.field_o, sa.field_b, 34, "basic", ph.field_b), -118, 48.0f);
                                                        stackOut_64_0 = 0;
                                                        stackIn_65_0 = stackOut_64_0;
                                                        return stackIn_65_0 != 0;
                                                      }
                                                    }
                                                  }
                                                  we.a(qg.a(bh.field_d, ij.field_a, 34, "", ff.field_P), -127, 45.0f);
                                                  stackOut_56_0 = 0;
                                                  stackIn_57_0 = stackOut_56_0;
                                                  return stackIn_57_0 != 0;
                                                }
                                              }
                                            }
                                            we.a(qg.a(l.field_s, hl.field_e, 34, "", mh.field_a), -115, 40.0f);
                                            stackOut_48_0 = 0;
                                            stackIn_49_0 = stackOut_48_0;
                                            return stackIn_49_0 != 0;
                                          }
                                        }
                                      }
                                      we.a(qg.a(td.field_o, sa.field_b, 34, "", kf.field_d), -118, 18.0f);
                                      stackOut_40_0 = 0;
                                      stackIn_41_0 = stackOut_40_0;
                                      return stackIn_41_0 != 0;
                                    }
                                  }
                                }
                                we.a(qg.a(qd.field_Fb, r.field_a, 34, "", df.field_a), -105, 13.0f);
                                stackOut_32_0 = 0;
                                stackIn_33_0 = stackOut_32_0;
                                return stackIn_33_0 != 0;
                              }
                            }
                          }
                          int discarded$44 = 17733;
                          int discarded$45 = 0;
                          we.a(hj.a(qd.field_Fb, ui.field_a, r.field_a), -83, 10.0f);
                          stackOut_24_0 = 0;
                          stackIn_25_0 = stackOut_24_0;
                          return stackIn_25_0 != 0;
                        }
                      }
                    }
                    we.a(qg.a(wi.field_h, ig.field_o, 34, "", ua.field_b), -105, 8.0f);
                    stackOut_16_0 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    return stackIn_17_0 != 0;
                  } else {
                    break L18;
                  }
                }
              }
              we.a(qg.a(wi.field_h, ig.field_o, 34, "", aa.field_b), -88, 5.0f);
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var3, "DrPhlogistonSavesTheEarth.FB(" + param0 + ',' + param1 + ')');
        }
        return stackIn_144_0 != 0;
    }

    private final void q() {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = field_D ? 1 : 0;
        we.a(qa.field_O, -103, 73.0f);
        bc.field_d = new nh(50, 300);
        q.field_f = new he(50, 300, 2);
        var2_int = q.field_f.field_d * 260;
        var3 = -1 + q.field_f.field_m.length;
        var4 = var2_int;
        L0: while (true) {
          L1: {
            L2: {
              if (~var3 > ~var4) {
                break L2;
              } else {
                q.field_f.field_m[var4] = (byte) 1;
                var4++;
                if (var6 != 0) {
                  break L1;
                } else {
                  if (var6 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            v.field_O = new nh(640, 430);
            v.field_O.c();
            var4 = 336 * wj.field_k;
            break L1;
          }
          var5 = 0;
          L3: while (true) {
            L4: {
              L5: {
                if (var5 >= 2000) {
                  break L5;
                } else {
                  wj.field_l[hi.a(var4, 4, pd.field_c)] = 65793 * (hi.a(254, 4, pd.field_c) + 1);
                  var5++;
                  if (var6 != 0) {
                    break L4;
                  } else {
                    if (var6 == 0) {
                      continue L3;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              var5 = 0;
              break L4;
            }
            L6: while (true) {
              L7: {
                L8: {
                  if (430 <= var5) {
                    break L8;
                  } else {
                    wj.e(0, var5, 640, 258 * ((9 + var5) / 7), (var5 - -435) / 3);
                    var5++;
                    if (var6 != 0) {
                      break L7;
                    } else {
                      if (var6 == 0) {
                        continue L6;
                      } else {
                        break L8;
                      }
                    }
                  }
                }
                lb.field_C.a(125);
                nb.field_b = new nh(640, 430);
                nb.field_b.c();
                break L7;
              }
              var5 = 0;
              L9: while (true) {
                L10: {
                  L11: {
                    if (var5 >= 1500) {
                      break L11;
                    } else {
                      wj.field_l[hi.a(wj.field_l.length, qk.a(-11666, -11670), pd.field_c)] = hi.a(256, 4, pd.field_c) * 65793;
                      var5++;
                      if (var6 != 0) {
                        break L10;
                      } else {
                        if (var6 == 0) {
                          continue L9;
                        } else {
                          break L11;
                        }
                      }
                    }
                  }
                  var5 = 0;
                  break L10;
                }
                L12: while (true) {
                  L13: {
                    L14: {
                      if (var5 >= 500) {
                        break L14;
                      } else {
                        wj.field_l[hi.a(wj.field_l.length, 4, pd.field_c)] = 131329 * hi.a(128, 4, pd.field_c);
                        var5++;
                        if (var6 != 0) {
                          break L13;
                        } else {
                          if (var6 == 0) {
                            continue L12;
                          } else {
                            break L14;
                          }
                        }
                      }
                    }
                    var5 = 0;
                    break L13;
                  }
                  L15: while (true) {
                    L16: {
                      L17: {
                        if (var5 >= 500) {
                          break L17;
                        } else {
                          wj.field_l[hi.a(wj.field_l.length, 4, pd.field_c)] = hi.a(128, 4, pd.field_c) * 65794;
                          var5++;
                          if (var6 != 0) {
                            break L16;
                          } else {
                            if (var6 == 0) {
                              continue L15;
                            } else {
                              break L17;
                            }
                          }
                        }
                      }
                      lb.field_C.a(96);
                      sg.field_e = eh.a("", (byte) -103, kf.field_d, "background_bath");
                      uk.field_h = eh.a("", (byte) -52, kf.field_d, "background_london");
                      oi.field_f = eh.a("", (byte) -121, kf.field_d, "background_brighton");
                      nj.field_o = eh.a("", (byte) -97, kf.field_d, "midground_earth");
                      hc.field_K = cl.a("", kf.field_d, -116, "background_space");
                      hc.field_K[1].field_D = hc.field_K[1].field_D + 800;
                      break L16;
                    }
                    int discarded$8 = 1;
                    sh.field_b = qk.a("", kf.field_d, "midground_space");
                    vi.field_g = eh.a("", (byte) -111, kf.field_d, "background_alien");
                    gb.field_e = eh.a("", (byte) -79, kf.field_d, "background_alien_8");
                    ha.field_b = eh.a("", (byte) -112, kf.field_d, "background_alien_9");
                    int discarded$9 = 1;
                    q.field_e = qk.a("", kf.field_d, "scenery_earth_background_clouds_lit");
                    int discarded$10 = 1;
                    kl.field_R[0] = qk.a("", kf.field_d, "scenery_space_background_asteroid_1");
                    int discarded$11 = 1;
                    kl.field_R[1] = qk.a("", kf.field_d, "scenery_space_background_asteroid_2");
                    int discarded$12 = 1;
                    kl.field_R[2] = qk.a("", kf.field_d, "scenery_space_background_asteroid_3");
                    int discarded$13 = 1;
                    kl.field_R[3] = qk.a("", kf.field_d, "scenery_space_background_asteroid_4");
                    int discarded$14 = 1;
                    kl.field_R[4] = qk.a("", kf.field_d, "scenery_space_background_asteroid_5");
                    int discarded$15 = 1;
                    si.field_F = qk.a("", kf.field_d, "background_space_comet");
                    cc.field_w = eh.a("", (byte) -89, kf.field_d, "midground_alien");
                    b.field_k = eh.a("", (byte) -45, kf.field_d, "midground_alien_8");
                    nf.field_v = eh.a("", (byte) -77, kf.field_d, "midground_alien_9");
                    kh.field_e = eh.a("", (byte) -116, kf.field_d, "playership");
                    kh.field_e.d(3);
                    ri.field_e = kh.field_e.field_k;
                    am.field_l = kh.field_e.field_d;
                    am.field_p = am.field_l / 2;
                    ri.field_q = ri.field_e / 2;
                    df.field_f = this.a(eh.a("", (byte) -85, kf.field_d, "scenery_tile_earth_1"), (byte) 88);
                    ah.field_L = this.a(eh.a("", (byte) -118, kf.field_d, "scenery_tile_earth_2"), (byte) 103);
                    mk.field_f = this.a(eh.a("", (byte) -120, kf.field_d, "scenery_tile_earth_3"), (byte) -60);
                    qg.field_U = this.a(eh.a("", (byte) -126, kf.field_d, "scenery_tile_earth_4"), (byte) 24);
                    bf.field_v = this.a(eh.a("", (byte) -106, kf.field_d, "scenery_tile_earth_5"), (byte) 113);
                    vg.field_h = this.a(eh.a("", (byte) -55, kf.field_d, "scenery_tile_earth_6"), (byte) -124);
                    rg.field_a = this.a(eh.a("", (byte) -29, kf.field_d, "scenery_tile_earth_7"), (byte) 120);
                    fi.field_e = this.a(eh.a("", (byte) -127, kf.field_d, "scenery_tile_earth_8"), (byte) -29);
                    jd.field_Q = this.a(eh.a("", (byte) -82, kf.field_d, "scenery_tile_earth_9"), (byte) 118);
                    r.field_e = this.a(eh.a("", (byte) -49, kf.field_d, "scenery_tile_earth_10"), (byte) 127);
                    nf.field_s = ij.a("scenery_tile_earth_11", (byte) 99, kf.field_d, "");
                    nf.field_s[0].c();
                    pc.field_c = new he[1];
                    pc.field_c[0] = nf.field_s[0].e();
                    pc.field_c[0].g();
                    rh.field_f = this.a(eh.a("", (byte) -109, kf.field_d, "scenery_tile_earth_1_rubble"), (byte) -34);
                    sd.field_d = this.a(eh.a("", (byte) -112, kf.field_d, "scenery_tile_earth_2_rubble"), (byte) 110);
                    tb.field_b = this.a(eh.a("", (byte) -78, kf.field_d, "scenery_tile_earth_3_rubble"), (byte) -20);
                    qf.field_e = this.a(eh.a("", (byte) -36, kf.field_d, "scenery_tile_earth_4_rubble"), (byte) -48);
                    dm.field_z = this.a(eh.a("", (byte) -76, kf.field_d, "scenery_tile_earth_5_rubble"), (byte) -23);
                    qd.field_Cb = this.a(eh.a("", (byte) -107, kf.field_d, "scenery_tile_earth_6_rubble"), (byte) 90);
                    gm.field_L = this.a(eh.a("", (byte) -77, kf.field_d, "scenery_tile_earth_7_rubble"), (byte) -97);
                    rb.field_c = this.a(eh.a("", (byte) -57, kf.field_d, "scenery_tile_earth_8_rubble"), (byte) -40);
                    sc.field_a = this.a(eh.a("", (byte) -61, kf.field_d, "scenery_tile_earth_9_rubble"), (byte) 103);
                    rd.field_A = this.a(eh.a("", (byte) -29, kf.field_d, "scenery_tile_earth_10_rubble"), (byte) -77);
                    re.field_i = ij.a("scenery_tile_earth_11_rubble", (byte) 84, kf.field_d, "");
                    re.field_i[0].c();
                    re.field_h = new he[1];
                    re.field_h[0] = re.field_i[0].e();
                    re.field_h[0].g();
                    dm.field_y = this.a(eh.a("", (byte) -69, kf.field_d, "scenery_tile_earth_1_fire_mask"), (byte) 105);
                    wh.field_u = this.a(eh.a("", (byte) -31, kf.field_d, "scenery_tile_earth_2_fire_mask"), (byte) -120);
                    ng.field_b = this.a(eh.a("", (byte) -68, kf.field_d, "scenery_tile_earth_3_fire_mask"), (byte) 17);
                    g.field_q = this.a(eh.a("", (byte) -70, kf.field_d, "scenery_tile_earth_4_fire_mask"), (byte) -124);
                    pj.field_z = this.a(eh.a("", (byte) -123, kf.field_d, "scenery_tile_earth_5_fire_mask"), (byte) 98);
                    tl.field_Q = this.a(eh.a("", (byte) -108, kf.field_d, "scenery_tile_earth_6_fire_mask"), (byte) -7);
                    ld.field_d = this.a(eh.a("", (byte) -71, kf.field_d, "scenery_tile_earth_7_fire_mask"), (byte) 1);
                    eb.field_c = this.a(eh.a("", (byte) -61, kf.field_d, "scenery_tile_earth_8_fire_mask"), (byte) -28);
                    ri.field_h = this.a(eh.a("", (byte) -53, kf.field_d, "scenery_tile_earth_9_fire_mask"), (byte) 119);
                    el.field_vb = this.a(eh.a("", (byte) -25, kf.field_d, "scenery_tile_earth_10_fire_mask"), (byte) -126);
                    bk.field_j = ij.a("scenery_tile_earth_11_fire_mask", (byte) 73, kf.field_d, "");
                    bk.field_j[0].c();
                    ik.field_f = new he[1];
                    ik.field_f[0] = bk.field_j[0].e();
                    ik.field_f[0].g();
                    fa.field_m = this.a(eh.a("", (byte) -30, kf.field_d, "scenery_tile_earth_bath_01"), (byte) -35);
                    we.field_c = this.a(eh.a("", (byte) -107, kf.field_d, "scenery_tile_earth_bath_02"), (byte) -7);
                    d.field_c = ij.a("scenery_tile_earth_bath_03", (byte) 115, kf.field_d, "");
                    d.field_c[0].c();
                    ek.field_l = this.a(eh.a("", (byte) -89, kf.field_d, "scenery_tile_earth_bath_04"), (byte) -110);
                    oj.field_g = this.a(eh.a("", (byte) -117, kf.field_d, "scenery_tile_earth_bath_05"), (byte) -24);
                    mh.field_g = this.a(eh.a("", (byte) -58, kf.field_d, "scenery_tile_earth_bath_06"), (byte) 101);
                    u.field_c = this.a(eh.a("", (byte) -93, kf.field_d, "scenery_tile_earth_bath_07"), (byte) 112);
                    ai.field_y = this.a(eh.a("", (byte) -43, kf.field_d, "scenery_tile_earth_bath_08"), (byte) 117);
                    bk.field_d = this.a(eh.a("", (byte) -80, kf.field_d, "scenery_tile_earth_bath_09"), (byte) 23);
                    ek.field_t = this.a(eh.a("", (byte) -59, kf.field_d, "scenery_tile_earth_bath_10"), (byte) 103);
                    hh.field_c = ij.a("scenery_tile_earth_bath_11", (byte) 71, kf.field_d, "");
                    hh.field_c[0].c();
                    lk.field_m = new he[1];
                    lk.field_m[0] = hh.field_c[0].e();
                    lk.field_m[0].g();
                    gi.field_d = ij.a("scenery_tile_earth_bath_01_broken", (byte) 108, kf.field_d, "");
                    gi.field_d[0].c();
                    lc.field_q = ij.a("scenery_tile_earth_bath_02_broken", (byte) 92, kf.field_d, "");
                    lc.field_q[0].c();
                    ca.field_V = ij.a("scenery_tile_earth_bath_03_broken", (byte) 86, kf.field_d, "");
                    ca.field_V[0].c();
                    ac.field_g = ij.a("scenery_tile_earth_bath_04_broken", (byte) 109, kf.field_d, "");
                    ac.field_g[0].c();
                    df.field_k = this.a(eh.a("", (byte) -59, kf.field_d, "scenery_tile_earth_bath_05_broken"), (byte) -88);
                    sl.field_x = ij.a("scenery_tile_earth_bath_06_broken", (byte) 80, kf.field_d, "");
                    sl.field_x[0].c();
                    qj.field_a = this.a(eh.a("", (byte) -81, kf.field_d, "scenery_tile_earth_bath_07_broken"), (byte) 102);
                    og.field_c = ij.a("scenery_tile_earth_bath_08_broken", (byte) 120, kf.field_d, "");
                    og.field_c[0].c();
                    ck.field_d = this.a(eh.a("", (byte) -39, kf.field_d, "scenery_tile_earth_bath_09_broken"), (byte) 89);
                    field_G = this.a(eh.a("", (byte) -71, kf.field_d, "scenery_tile_earth_bath_10_broken"), (byte) 7);
                    qa.field_S = ij.a("scenery_tile_earth_bath_11_broken", (byte) 61, kf.field_d, "");
                    qa.field_S[0].c();
                    nf.field_p = new he[1];
                    nf.field_p[0] = hh.field_c[0].e();
                    nf.field_p[0].g();
                    eb.field_a = ij.a("scenery_tile_earth_bath_01_fire_mask", (byte) 121, kf.field_d, "");
                    eb.field_a[0].c();
                    wb.field_b = ij.a("scenery_tile_earth_bath_02_fire_mask", (byte) 108, kf.field_d, "");
                    wb.field_b[0].c();
                    cm.field_L = ij.a("scenery_tile_earth_bath_03_fire_mask", (byte) 75, kf.field_d, "");
                    cm.field_L[0].c();
                    ca.field_Y = ij.a("scenery_tile_earth_bath_04_fire_mask", (byte) 106, kf.field_d, "");
                    ca.field_Y[0].c();
                    oj.field_f = ij.a("scenery_tile_earth_bath_05_fire_mask", (byte) 114, kf.field_d, "");
                    oj.field_f[0].c();
                    ld.field_f = ij.a("scenery_tile_earth_bath_06_fire_mask", (byte) 60, kf.field_d, "");
                    ld.field_f[0].c();
                    cf.field_g = this.a(eh.a("", (byte) -48, kf.field_d, "scenery_tile_earth_bath_07_fire_mask"), (byte) 101);
                    cf.field_g[0].c();
                    ri.field_r = ij.a("scenery_tile_earth_bath_08_fire_mask", (byte) 62, kf.field_d, "");
                    ri.field_r[0].c();
                    cl.field_n = ij.a("scenery_tile_earth_bath_09_fire_mask", (byte) 102, kf.field_d, "");
                    cl.field_n[0].c();
                    kj.field_g = ij.a("scenery_tile_earth_bath_10_fire_mask", (byte) 120, kf.field_d, "");
                    kj.field_g[0].c();
                    ei.field_k = ij.a("scenery_tile_earth_bath_11_fire_mask", (byte) 125, kf.field_d, "");
                    ei.field_k[0].c();
                    ij.field_e = new he[1];
                    ij.field_e[0] = ei.field_k[0].e();
                    ij.field_e[0].g();
                    vc.field_b = ij.a("scenery_tile_alien_1", (byte) 107, kf.field_d, "");
                    ij.field_d = ij.a("scenery_tile_alien_2", (byte) 103, kf.field_d, "");
                    db.field_b = ij.a("scenery_tile_alien_3", (byte) 112, kf.field_d, "");
                    kf.field_e = ij.a("scenery_tile_alien_4", (byte) 72, kf.field_d, "");
                    return;
                  }
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = "Resume Game";
        field_E = "Retry";
        field_F = new vd();
    }
}
