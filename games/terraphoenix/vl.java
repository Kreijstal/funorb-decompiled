/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vl {
    int field_f;
    private int field_d;
    boolean field_b;
    static jj field_i;
    static int[] field_a;
    private int field_g;
    static int field_h;
    static int[] field_e;
    static ci field_c;

    final vl a(Terraphoenix param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        vl stackIn_6_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        vl stackOut_5_0 = null;
        Object stackOut_12_0 = null;
        Object stackOut_10_0 = null;
        Object stackOut_1_0 = null;
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
            if (param1 == 11803) {
              if (((vl) this).field_b) {
                int discarded$2 = -19;
                stackOut_5_0 = this.a();
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              } else {
                if (((vl) this).field_f >= 0) {
                  stackOut_12_0 = this;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  L1: {
                    param0.field_G = 0;
                    ((vl) this).field_f = 9 * ((vl) this).field_f / 10;
                    ((vl) this).field_f = ((vl) this).field_f + 1;
                    if (((vl) this).field_f < 0) {
                      break L1;
                    } else {
                      ((vl) this).field_f = 0;
                      ja.field_i = 4;
                      break L1;
                    }
                  }
                  stackOut_10_0 = this;
                  stackIn_11_0 = stackOut_10_0;
                  return (vl) this;
                }
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (vl) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("vl.D(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 41);
        }
        return (vl) this;
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_i = null;
        field_e = null;
    }

    final static byte[] a(int param0, File param1) {
        RuntimeException var2 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = og.a(19758, param1, (int)param1.length());
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("vl.B(").append(75).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
        return stackIn_1_0;
    }

    final static String b() {
        if (ua.field_d == qe.field_f) {
            return oe.field_a;
        }
        if (!(vc.field_a.a(-113))) {
            return vc.field_a.b(-123);
        }
        if (!(pe.field_a != ua.field_d)) {
            return vc.field_a.b(-121);
        }
        return ol.field_Hb;
    }

    private final vl a() {
        ((vl) this).field_f = ((vl) this).field_f - 8;
        if (((vl) this).field_f <= -356) {
            return null;
        }
        int var2 = -18;
        return (vl) this;
    }

    final void a(int param0, Terraphoenix param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var8_ref_String = null;
        int var9 = 0;
        ci var9_ref_ci = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = Terraphoenix.field_V;
          param1.field_yb = false;
          l.c(0, 0, 640, 56 - -(((vl) this).field_f / 4));
          vk.field_d.d(0, ((vl) this).field_f / 4);
          l.c(0, 56, 356 - -((vl) this).field_f, 369);
          vk.field_d.d(0 - -((vl) this).field_f, 0);
          l.c(0, 369, 356 - -((vl) this).field_f, 480);
          l.f(0, 0, 640, 480, 0);
          l.c(356 - ((vl) this).field_f, 56, 640, 369);
          vk.field_d.d(0 - ((vl) this).field_f, 0);
          l.c(-((vl) this).field_f + 356, 369, 640, 480);
          l.f(0, 0, 640, 480, 0);
          l.c(0, -((vl) this).field_f + 369, 640, 480);
          vk.field_d.d(0, -((vl) this).field_f);
          l.c();
          qh.field_b.b(624 - qh.field_b.field_r, -qh.field_b.field_t + 464 + -((vl) this).field_f);
          if (param1.field_wb == null) {
            if (~ef.field_j > ~(624 + -qh.field_b.field_r)) {
              break L0;
            } else {
              if (ef.field_j > 624) {
                break L0;
              } else {
                if (-((vl) this).field_f + (464 + -qh.field_b.field_t) > jb.field_b) {
                  break L0;
                } else {
                  if (464 - ((vl) this).field_f < jb.field_b) {
                    break L0;
                  } else {
                    l.d(624 - qh.field_b.field_r, 464 + -((vl) this).field_f + -qh.field_b.field_t, qh.field_b.field_r, qh.field_b.field_t, 16777215, 128);
                    break L0;
                  }
                }
              }
            }
          } else {
            l.d(-qh.field_b.field_r + 624, -((vl) this).field_f + 464 - qh.field_b.field_t, qh.field_b.field_r, qh.field_b.field_t, 0, 192);
            break L0;
          }
        }
        L1: {
          param1.field_I.field_a[0] = 100;
          var3_int = param1.field_Bb;
          param1.field_I.field_a[1] = 100;
          param1.field_I.field_d[0] = 100;
          od.field_c[1].field_q = true;
          sj.field_a[2].field_e = true;
          param1.field_gb = 0;
          if (var3_int < 7) {
            break L1;
          } else {
            sj.field_a[1].field_e = false;
            param1.field_I.field_d[1] = 100;
            break L1;
          }
        }
        L2: {
          if (var3_int >= 3) {
            param1.field_I.field_a[2] = 100;
            od.field_c[2].field_q = false;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          var4 = 58;
          var5 = 4;
          if (od.field_c[6].field_t) {
            var5 = 5;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          L5: {
            if (od.field_c[8].field_t) {
              break L5;
            } else {
              if (!od.field_c[12].field_t) {
                break L4;
              } else {
                break L5;
              }
            }
          }
          var5 = 6;
          break L4;
        }
        var6 = 0;
        L6: while (true) {
          if (~var6 <= ~var5) {
            L7: {
              if (param1.field_hb != 0) {
                break L7;
              } else {
                og.field_f.c(lb.field_c[0], ((vl) this).field_f + 189, 79, 65280, -1);
                break L7;
              }
            }
            L8: {
              if (param1.field_hb == 1) {
                og.field_f.c(lb.field_c[1], ((vl) this).field_f + 189, 79, 65280, -1);
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (param1.field_hb == 2) {
                og.field_f.c(lb.field_c[2], 189 + ((vl) this).field_f, 79, 65280, -1);
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              if (param1.field_hb != 3) {
                break L10;
              } else {
                og.field_f.c(lb.field_c[3], ((vl) this).field_f + 189, 79, 65280, -1);
                break L10;
              }
            }
            L11: {
              if (param1.field_hb == 4) {
                og.field_f.c(lb.field_c[4], ((vl) this).field_f + 189, 79, 65280, -1);
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              if (param1.field_hb != 5) {
                break L12;
              } else {
                og.field_f.c(lb.field_c[5], ((vl) this).field_f + 189, 79, 65280, -1);
                break L12;
              }
            }
            l.c(((vl) this).field_f + 57, 84, 323 + ((vl) this).field_f, 364);
            var4 = 84 + -param1.field_G;
            var6 = -1 + od.field_c.length;
            L13: while (true) {
              if (var6 < 0) {
                var6 = sj.field_a.length - 1;
                L14: while (true) {
                  if (var6 < 0) {
                    L15: {
                      l.c();
                      var4 = var4 + param1.field_G;
                      var4 -= 84;
                      if (oh.field_f != 1) {
                        param1.field_J = false;
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    L16: {
                      if (var4 > 280) {
                        L17: {
                          var6 = 78120 / var4;
                          var7 = param1.field_G * (-var6 + 279) / (var4 - 280);
                          jg.field_hb.a(((vl) this).field_f + 337, var7 + 73, jg.field_hb.field_r, var6);
                          if (param1.field_J) {
                            break L17;
                          } else {
                            if (~(337 + ((vl) this).field_f) < ~ef.field_j) {
                              break L16;
                            } else {
                              if (((vl) this).field_f + (337 - -jg.field_hb.field_r) <= ef.field_j) {
                                break L16;
                              } else {
                                break L17;
                              }
                            }
                          }
                        }
                        if (62 > jb.field_b) {
                          break L16;
                        } else {
                          if (363 > jb.field_b) {
                            if (oh.field_f != 1) {
                              break L16;
                            } else {
                              L18: {
                                var8 = var6 / 2 + 73;
                                var9 = -(var6 / 2) + 352;
                                if (!param1.field_J) {
                                  break L18;
                                } else {
                                  if (param1.field_wb == null) {
                                    var9 = param1.field_rb;
                                    var8 = param1.field_eb;
                                    if (var8 <= jb.field_b) {
                                      if (var9 < jb.field_b) {
                                        param1.field_G = -280 + var4;
                                        break L16;
                                      } else {
                                        param1.field_G = (var4 + -280) * (-var8 + jb.field_b) / (var9 + -var8);
                                        break L16;
                                      }
                                    } else {
                                      param1.field_G = 0;
                                      break L16;
                                    }
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                              L19: {
                                if (73 + var7 >= jb.field_b) {
                                  break L19;
                                } else {
                                  if (var7 + (73 + var6) <= jb.field_b) {
                                    break L19;
                                  } else {
                                    param1.field_rb = var9 - var6 / 2 + (jb.field_b - var7) - 73;
                                    param1.field_J = true;
                                    param1.field_eb = -var7 + (-73 + var8) + (-(var6 / 2) + jb.field_b);
                                    break L16;
                                  }
                                }
                              }
                              if (param1.field_wb == null) {
                                L20: {
                                  if (var8 > jb.field_b) {
                                    param1.field_G = 0;
                                    break L20;
                                  } else {
                                    if (~var9 <= ~jb.field_b) {
                                      param1.field_G = (var4 + -280) * (-var8 + jb.field_b) / (var9 - var8);
                                      break L20;
                                    } else {
                                      param1.field_G = var4 + -280;
                                      break L20;
                                    }
                                  }
                                }
                                param1.field_eb = var8;
                                param1.field_rb = var9;
                                param1.field_J = true;
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                          } else {
                            break L16;
                          }
                        }
                      } else {
                        l.f(((vl) this).field_f + 333, 58, 19, 309, 0);
                        break L16;
                      }
                    }
                    L21: {
                      var6 = 4;
                      if (var3_int <= 0) {
                        break L21;
                      } else {
                        var6 = 8;
                        break L21;
                      }
                    }
                    L22: {
                      if (var3_int > 3) {
                        var6 = 12;
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                    L23: {
                      if (var3_int > 12) {
                        var6 = 0;
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                    var7 = 0;
                    var8 = 0;
                    L24: while (true) {
                      if (12 <= var8) {
                        L25: {
                          if (~var6 < ~var7) {
                            var7 = var6;
                            break L25;
                          } else {
                            break L25;
                          }
                        }
                        L26: {
                          if (var7 > 1) {
                            var8 = 550 / (-1 + var7);
                            break L26;
                          } else {
                            var8 = 90;
                            break L26;
                          }
                        }
                        if (param0 <= -93) {
                          L27: {
                            if (var8 > 90) {
                              var8 = 90;
                              break L27;
                            } else {
                              break L27;
                            }
                          }
                          var9 = var7 + -1;
                          L28: while (true) {
                            if (var9 < 0) {
                              L29: {
                                if (null != param1.field_nb[param1.field_qb]) {
                                  L30: {
                                    nf.field_g[param1.field_nb[param1.field_qb].field_d].b(10, -((vl) this).field_f + 9 + var4);
                                    int discarded$2 = kb.a(120, 24, -((vl) this).field_f + 630, param1.field_nb[param1.field_qb].b(1), -((vl) this).field_f + 362, 88, 65280);
                                    if (param1.field_nb[param1.field_qb].field_b != null) {
                                      var9_ref_ci = cc.field_i[param1.field_nb[param1.field_qb].field_b.field_g];
                                      var10 = -(3 * var9_ref_ci.field_p / 4) + (-(3 * var9_ref_ci.field_r / 8) + 398);
                                      var11 = -(var9_ref_ci.field_v * 3 / 4) + 213 + -(3 * var9_ref_ci.field_t / 8);
                                      var9_ref_ci.a(-((vl) this).field_f + var10, var11, 75, 150);
                                      break L30;
                                    } else {
                                      break L30;
                                    }
                                  }
                                  L31: {
                                    if (param1.field_nb[param1.field_qb].field_A == null) {
                                      break L31;
                                    } else {
                                      var9_ref_ci = cc.field_i[param1.field_nb[param1.field_qb].field_A.field_g];
                                      var10 = -(var9_ref_ci.field_p * 3 / 4) + (-(3 * var9_ref_ci.field_r / 8) + 593);
                                      var11 = 194 - var9_ref_ci.field_t * 3 / 8 + -(3 * var9_ref_ci.field_v / 4);
                                      var9_ref_ci.a(-((vl) this).field_f + var10, var11, 75, 150);
                                      og.field_f.c(param1.field_nb[param1.field_qb].field_A.field_d + " / " + od.field_c[param1.field_nb[param1.field_qb].field_A.field_g].field_o, -((vl) this).field_f + 593, 264, 65280, -1);
                                      break L31;
                                    }
                                  }
                                  L32: {
                                    if (null == param1.field_nb[param1.field_qb].field_m) {
                                      break L32;
                                    } else {
                                      kb.field_a[param1.field_nb[param1.field_qb].field_m.field_f].a(-((vl) this).field_f + 453, 139, 87, 87);
                                      break L32;
                                    }
                                  }
                                  L33: {
                                    if (null != param1.field_nb[param1.field_qb].field_i) {
                                      L34: {
                                        var9_ref_ci = cc.field_i[param1.field_nb[param1.field_qb].field_i.field_g].d();
                                        var9_ref_ci.b();
                                        var10 = -(var9_ref_ci.field_p * 3 / 4) + (597 - 3 * var9_ref_ci.field_r / 8);
                                        var11 = -(var9_ref_ci.field_v * 3 / 4) + -(3 * var9_ref_ci.field_t / 8) + 297;
                                        var9_ref_ci.a(-((vl) this).field_f + var10, var11, 150, 75);
                                        og.field_f.c(Integer.toString(param1.field_nb[param1.field_qb].field_i.field_d), 602 - ((vl) this).field_f, 335, 65280, -1);
                                        if (7 < param1.field_nb[param1.field_qb].field_i.field_d) {
                                          break L34;
                                        } else {
                                          if (param1.field_I.field_a[param1.field_nb[param1.field_qb].field_i.field_g] > 0) {
                                            break L33;
                                          } else {
                                            break L34;
                                          }
                                        }
                                      }
                                      l.f(618 + -((vl) this).field_f, 325, 6, 11, 6052956);
                                      break L33;
                                    } else {
                                      l.f(582 - ((vl) this).field_f, 325, 6, 11, 6052956);
                                      l.f(618 + -((vl) this).field_f, 325, 6, 11, 6052956);
                                      break L33;
                                    }
                                  }
                                  L35: {
                                    var9 = 171;
                                    var10 = 171;
                                    if (ph.field_o != 1) {
                                      break L35;
                                    } else {
                                      var10 += 6;
                                      var9 += 23;
                                      break L35;
                                    }
                                  }
                                  L36: {
                                    int discarded$3 = param1.field_nb[param1.field_qb].d((byte) 37);
                                    og.field_f.b(Integer.toString(param1.field_nb[param1.field_qb].field_e), var9, 406 - ((vl) this).field_f, 16777215, -1);
                                    l.c(var9, 0, param1.field_nb[param1.field_qb].field_t * 3 + var9, 640);
                                    tg.field_e.f(var10, 416 - ((vl) this).field_f, 16711680);
                                    l.c();
                                    og.field_f.b(Integer.toString(param1.field_nb[param1.field_qb].field_t), var9 - -1, -((vl) this).field_f + 426, 0, -1);
                                    og.field_f.b(Integer.toString(param1.field_nb[param1.field_qb].field_t), var9 + -1, 416 + (-((vl) this).field_f - -10), 0, -1);
                                    og.field_f.b(Integer.toString(param1.field_nb[param1.field_qb].field_t), var9, 10 + (-((vl) this).field_f + 417), 0, -1);
                                    og.field_f.b(Integer.toString(param1.field_nb[param1.field_qb].field_t), var9, 10 + (-((vl) this).field_f + 415), 0, -1);
                                    og.field_f.b(Integer.toString(param1.field_nb[param1.field_qb].field_t), var9, 10 + (416 - ((vl) this).field_f), 16711680, -1);
                                    var11 = 65793 * (int)(Math.sin(mm.field_f) * 120.0) + 7895160;
                                    l.c(var9, 0, param1.field_nb[param1.field_qb].field_w * 3 + var9, 640);
                                    tg.field_e.f(var10, 432 - ((vl) this).field_f, 255);
                                    if (~param1.field_nb[param1.field_qb].field_w != ~param1.field_nb[param1.field_qb].field_s) {
                                      l.d(var9, 432 - ((vl) this).field_f, param1.field_nb[param1.field_qb].field_s * 3, 9, var11, 192);
                                      l.d(3 * param1.field_nb[param1.field_qb].field_s + var9, 432 - ((vl) this).field_f, 3 * (-param1.field_nb[param1.field_qb].field_s + param1.field_nb[param1.field_qb].field_w), 9, var11 & 16711680, 192);
                                      l.c();
                                      og.field_f.b(param1.field_nb[param1.field_qb].field_s + og.field_b, var9 + 1, 10 + (432 + -((vl) this).field_f), 0, -1);
                                      og.field_f.b(param1.field_nb[param1.field_qb].field_s + og.field_b, var9 + -1, -((vl) this).field_f + 442, 0, -1);
                                      og.field_f.b(param1.field_nb[param1.field_qb].field_s + og.field_b, var9, 442 - ((vl) this).field_f - -1, 0, -1);
                                      og.field_f.b(param1.field_nb[param1.field_qb].field_s + og.field_b, var9, 432 - ((vl) this).field_f - -9, 0, -1);
                                      og.field_f.b(param1.field_nb[param1.field_qb].field_s + og.field_b, var9, 10 + (-((vl) this).field_f + 432), var11, -1);
                                      break L36;
                                    } else {
                                      l.c();
                                      og.field_f.b(Integer.toString(param1.field_nb[param1.field_qb].field_s), var9 - -1, 432 - ((vl) this).field_f - -10, 0, -1);
                                      og.field_f.b(Integer.toString(param1.field_nb[param1.field_qb].field_s), var9 - 1, 10 + -((vl) this).field_f + 432, 0, -1);
                                      og.field_f.b(Integer.toString(param1.field_nb[param1.field_qb].field_s), var9, 1 + (442 - ((vl) this).field_f), 0, -1);
                                      og.field_f.b(Integer.toString(param1.field_nb[param1.field_qb].field_s), var9, 10 + (432 - (((vl) this).field_f + 1)), 0, -1);
                                      og.field_f.b(Integer.toString(param1.field_nb[param1.field_qb].field_s), var9, 432 - (((vl) this).field_f + -10), 8421631, -1);
                                      break L36;
                                    }
                                  }
                                  L37: {
                                    l.c(var9, 0, param1.field_nb[param1.field_qb].field_u * 3 + var9, 640);
                                    tg.field_e.f(var10, 448 - ((vl) this).field_f, 16776960);
                                    if (param1.field_nb[param1.field_qb].field_w != param1.field_nb[param1.field_qb].field_s) {
                                      l.d(var9, 448 + -((vl) this).field_f, param1.field_nb[param1.field_qb].field_v * 3, 9, var11, 192);
                                      l.d(param1.field_nb[param1.field_qb].field_v * 3 + var9, -((vl) this).field_f + 448, (param1.field_nb[param1.field_qb].field_u + -param1.field_nb[param1.field_qb].field_v) * 3, 9, 16711680 & var11, 192);
                                      break L37;
                                    } else {
                                      break L37;
                                    }
                                  }
                                  L38: {
                                    l.c();
                                    og.field_f.b(param1.field_nb[param1.field_qb].field_x + "/" + param1.field_nb[param1.field_qb].field_v, 1 + var9, 448 - ((vl) this).field_f + 10, 0, -1);
                                    og.field_f.b(param1.field_nb[param1.field_qb].field_x + "/" + param1.field_nb[param1.field_qb].field_v, -1 + var9, -((vl) this).field_f + 458, 0, -1);
                                    og.field_f.b(param1.field_nb[param1.field_qb].field_x + "/" + param1.field_nb[param1.field_qb].field_v, var9, 458 - (((vl) this).field_f + -1), 0, -1);
                                    og.field_f.b(param1.field_nb[param1.field_qb].field_x + "/" + param1.field_nb[param1.field_qb].field_v, var9, -1 + -((vl) this).field_f + 458, 0, -1);
                                    if (param1.field_nb[param1.field_qb].field_s == param1.field_nb[param1.field_qb].field_w) {
                                      og.field_f.b(param1.field_nb[param1.field_qb].field_x + "/" + param1.field_nb[param1.field_qb].field_v, var9, 10 + (-((vl) this).field_f + 448), 16776960, -1);
                                      break L38;
                                    } else {
                                      og.field_f.b(param1.field_nb[param1.field_qb].field_x + "/" + param1.field_nb[param1.field_qb].field_v, var9, 10 + (448 - ((vl) this).field_f), var11, -1);
                                      break L38;
                                    }
                                  }
                                  l.c(var9, 0, 3 * param1.field_nb[param1.field_qb].field_B + var9, 640);
                                  tg.field_e.f(var10, 464 + -((vl) this).field_f, 16777215);
                                  l.c();
                                  og.field_f.b(param1.field_nb[param1.field_qb].field_B + "%", 1 + var9, 10 + (-((vl) this).field_f + 464), 0, -1);
                                  og.field_f.b(param1.field_nb[param1.field_qb].field_B + "%", var9 - 1, 10 + (464 - ((vl) this).field_f), 0, -1);
                                  og.field_f.b(param1.field_nb[param1.field_qb].field_B + "%", var9, 10 + (-((vl) this).field_f + 465), 0, -1);
                                  og.field_f.b(param1.field_nb[param1.field_qb].field_B + "%", var9, -1 + (10 + (464 + -((vl) this).field_f)), 0, -1);
                                  og.field_f.b(param1.field_nb[param1.field_qb].field_B + "%", var9, 474 + -((vl) this).field_f, 16777215, -1);
                                  break L29;
                                } else {
                                  break L29;
                                }
                              }
                              l.c();
                              return;
                            } else {
                              L39: {
                                var10 = var8;
                                if (param1.field_qb == var9) {
                                  var10 = 90;
                                  break L39;
                                } else {
                                  break L39;
                                }
                              }
                              L40: {
                                var11 = var8 * var9;
                                var4 = 384;
                                if (var9 <= param1.field_qb) {
                                  break L40;
                                } else {
                                  var11 = var11 + (-var8 + 90);
                                  break L40;
                                }
                              }
                              L41: {
                                if (param1.field_nb[var9] == null) {
                                  th.field_i.b(var10 + (var11 - th.field_i.field_r), -((vl) this).field_f + 370);
                                  var12 = (120 + (int)(Math.sin(mm.field_f) * 120.0)) * 65793;
                                  if (~og.field_f.b(pj.field_v) >= ~(-5 + var8)) {
                                    og.field_f.b(pj.field_v, var11 + 5, -((vl) this).field_f + var4, var12, -1);
                                    break L41;
                                  } else {
                                    og.field_f.b(pd.field_e, 5 + var11, -((vl) this).field_f + var4, var12, -1);
                                    break L41;
                                  }
                                } else {
                                  if (var9 != param1.field_qb) {
                                    th.field_i.b(-th.field_i.field_r + (var11 - -var10), 370 - ((vl) this).field_f);
                                    og.field_f.b(param1.field_nb[var9].a(-1426, -8 + var10), var11, -((vl) this).field_f + var4, 52224, -1);
                                    break L41;
                                  } else {
                                    field_c.b(var10 + var11 + -field_c.field_r, -((vl) this).field_f + 370);
                                    og.field_f.b(param1.field_nb[var9].a(-1426, -8 + var10), var11, -((vl) this).field_f + var4, 65280, -1);
                                    break L41;
                                  }
                                }
                              }
                              var9--;
                              continue L28;
                            }
                          }
                        } else {
                          return;
                        }
                      } else {
                        L42: {
                          if (param1.field_nb[var8] == null) {
                            break L42;
                          } else {
                            L43: {
                              if (param1.field_nb[param1.field_qb] == null) {
                                param1.field_qb = var8;
                                break L43;
                              } else {
                                break L43;
                              }
                            }
                            var7++;
                            break L42;
                          }
                        }
                        var8++;
                        continue L24;
                      }
                    }
                  } else {
                    L44: {
                      if (!sj.field_a[var6].field_l) {
                        break L44;
                      } else {
                        if (param1.field_hb == 2) {
                          L45: {
                            if (param1.field_I.field_d[var6] > 0) {
                              L46: {
                                if (jb.field_b <= 84) {
                                  break L46;
                                } else {
                                  if (jb.field_b >= 364) {
                                    break L46;
                                  } else {
                                    if (57 + ((vl) this).field_f > ef.field_j) {
                                      break L46;
                                    } else {
                                      if (ef.field_j >= ((vl) this).field_f + (57 + e.field_g.field_r)) {
                                        break L46;
                                      } else {
                                        if (jb.field_b < var4) {
                                          break L46;
                                        } else {
                                          if (~(e.field_g.field_t + var4) >= ~jb.field_b) {
                                            break L46;
                                          } else {
                                            e.field_g.c(57 + ((vl) this).field_f, var4, 384);
                                            param1.field_gb = -1 + -var6;
                                            if (((vl) this).field_g == -param1.field_gb) {
                                              break L45;
                                            } else {
                                              ((vl) this).field_g = -param1.field_gb;
                                              qd.a((byte) 77, 29);
                                              break L45;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              e.field_g.b(((vl) this).field_f + 57, var4);
                              break L45;
                            } else {
                              e.field_g.c(57 - -((vl) this).field_f, var4, 128);
                              break L45;
                            }
                          }
                          L47: {
                            l.i(((vl) this).field_f + 59, 2 + var4, ((vl) this).field_f + 321, var4 + 66);
                            kb.field_a[var6].a(0, 128, ((vl) this).field_f + 190, 32 + (var4 - -2), (byte) 21);
                            l.c(((vl) this).field_f + 57, 84, 323 - -((vl) this).field_f, 364);
                            if (param1.field_I.field_d[var6] <= 50) {
                              break L47;
                            } else {
                              param1.field_I.field_d[var6] = 55;
                              break L47;
                            }
                          }
                          L48: {
                            if (!sj.field_a[var6].field_e) {
                              break L48;
                            } else {
                              if (param1.field_Fb <= 0) {
                                break L48;
                              } else {
                                if (50 <= param1.field_I.field_d[var6]) {
                                  break L48;
                                } else {
                                  L49: {
                                    qc.field_f[7].c(((vl) this).field_f + 59, var4 - -2, 120 + (int)(120.0 * Math.cos(mm.field_f)));
                                    var7 = 1;
                                    if (var6 != 1) {
                                      break L49;
                                    } else {
                                      if (!sj.field_a[2].field_l) {
                                        break L49;
                                      } else {
                                        var7 = 2;
                                        break L49;
                                      }
                                    }
                                  }
                                  L50: {
                                    if (1 != var6) {
                                      break L50;
                                    } else {
                                      if (sj.field_a[3].field_l) {
                                        var7 = 4;
                                        break L50;
                                      } else {
                                        break L50;
                                      }
                                    }
                                  }
                                  L51: {
                                    if (var6 != 2) {
                                      break L51;
                                    } else {
                                      if (!sj.field_a[3].field_l) {
                                        break L51;
                                      } else {
                                        var7 = 2;
                                        break L51;
                                      }
                                    }
                                  }
                                  L52: {
                                    L53: {
                                      if (param1.field_Fb > 1) {
                                        break L53;
                                      } else {
                                        if (var7 <= 1) {
                                          break L52;
                                        } else {
                                          break L53;
                                        }
                                      }
                                    }
                                    L54: {
                                      var8_ref_String = Integer.toString(param1.field_Fb);
                                      if (1 >= var7) {
                                        break L54;
                                      } else {
                                        var8_ref_String = var8_ref_String + "*" + var7;
                                        break L54;
                                      }
                                    }
                                    og.field_f.c(var8_ref_String, 90 - -((vl) this).field_f, 8 + var4 + 32, 0, -1);
                                    og.field_f.c(var8_ref_String, 88 + ((vl) this).field_f, var4 + 40, 0, -1);
                                    og.field_f.c(var8_ref_String, ((vl) this).field_f + 89, 32 + (var4 + 9), 0, -1);
                                    og.field_f.c(var8_ref_String, 89 + ((vl) this).field_f, 7 + var4 - -32, 0, -1);
                                    og.field_f.c(var8_ref_String, 89 + ((vl) this).field_f, 8 + var4 - -32, 16777215, -1);
                                    break L52;
                                  }
                                  if (59 + ((vl) this).field_f > ef.field_j) {
                                    break L48;
                                  } else {
                                    if (ef.field_j >= 103 + ((vl) this).field_f) {
                                      break L48;
                                    } else {
                                      if (~(2 + var4) < ~jb.field_b) {
                                        break L48;
                                      } else {
                                        if (~jb.field_b > ~(44 + var4 + 2)) {
                                          param1.field_gb = -var6 + -1;
                                          param1.field_yb = true;
                                          l.e(((vl) this).field_f + 59, 2 + var4, 44, 44, 16777215);
                                          break L48;
                                        } else {
                                          break L48;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L55: {
                            if (0 >= param1.field_I.field_d[var6]) {
                              og.field_f.b(sj.field_a[var6].field_m, 65 - -((vl) this).field_f, var4 - -82, 16711680, -1);
                              og.field_f.a(bh.field_j, ((vl) this).field_f + 313, 82 + var4, 16711680, -1);
                              og.field_f.a(of.field_n + (sj.field_a[var6].field_g + sj.field_a[var6].field_d), ((vl) this).field_f + 319, var4 + 16, 16711680, -1);
                              break L55;
                            } else {
                              L56: {
                                og.field_f.b(sj.field_a[var6].field_m, 65 - -((vl) this).field_f, 82 + var4, 65280, -1);
                                if (50 > param1.field_I.field_d[var6]) {
                                  og.field_f.a(hk.field_c + param1.field_I.field_d[var6], ((vl) this).field_f + 313, var4 - -82, 65280, -1);
                                  break L56;
                                } else {
                                  break L56;
                                }
                              }
                              og.field_f.a(of.field_n + (sj.field_a[var6].field_g + sj.field_a[var6].field_d), ((vl) this).field_f + 319, 16 + var4, 65280, -1);
                              break L55;
                            }
                          }
                          var4 += 92;
                          break L44;
                        } else {
                          break L44;
                        }
                      }
                    }
                    var6--;
                    continue L14;
                  }
                }
              } else {
                L57: {
                  if (!od.field_c[var6].field_t) {
                    break L57;
                  } else {
                    L58: {
                      L59: {
                        if (param1.field_hb != 0) {
                          break L59;
                        } else {
                          if (0 == var6) {
                            break L58;
                          } else {
                            if (var6 == 3) {
                              break L58;
                            } else {
                              if (var6 == 8) {
                                break L58;
                              } else {
                                if (var6 == 12) {
                                  break L58;
                                } else {
                                  break L59;
                                }
                              }
                            }
                          }
                        }
                      }
                      L60: {
                        if (param1.field_hb != 1) {
                          break L60;
                        } else {
                          if (var6 == 1) {
                            break L58;
                          } else {
                            if (var6 == 2) {
                              break L58;
                            } else {
                              if (4 == var6) {
                                break L58;
                              } else {
                                if (var6 == 18) {
                                  break L58;
                                } else {
                                  break L60;
                                }
                              }
                            }
                          }
                        }
                      }
                      L61: {
                        if (2 != param1.field_hb) {
                          break L61;
                        } else {
                          if (var6 == 17) {
                            break L58;
                          } else {
                            break L61;
                          }
                        }
                      }
                      L62: {
                        if (param1.field_hb != 3) {
                          break L62;
                        } else {
                          if (var6 == 5) {
                            break L58;
                          } else {
                            if (11 == var6) {
                              break L58;
                            } else {
                              break L62;
                            }
                          }
                        }
                      }
                      L63: {
                        if (4 != param1.field_hb) {
                          break L63;
                        } else {
                          if (6 == var6) {
                            break L58;
                          } else {
                            if (7 == var6) {
                              break L58;
                            } else {
                              if (10 == var6) {
                                break L58;
                              } else {
                                if (var6 == 16) {
                                  break L58;
                                } else {
                                  break L63;
                                }
                              }
                            }
                          }
                        }
                      }
                      if (param1.field_hb != 5) {
                        break L57;
                      } else {
                        if (var6 == 8) {
                          break L58;
                        } else {
                          if (var6 == 9) {
                            break L58;
                          } else {
                            if (12 == var6) {
                              break L58;
                            } else {
                              if (var6 == 13) {
                                break L58;
                              } else {
                                if (var6 == 14) {
                                  break L58;
                                } else {
                                  if (15 != var6) {
                                    break L57;
                                  } else {
                                    break L58;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    L64: {
                      if (0 < param1.field_I.field_a[var6]) {
                        L65: {
                          if (jb.field_b <= 84) {
                            break L65;
                          } else {
                            if (364 <= jb.field_b) {
                              break L65;
                            } else {
                              if (~ef.field_j > ~(57 + ((vl) this).field_f)) {
                                break L65;
                              } else {
                                if (~ef.field_j <= ~(e.field_g.field_r + (57 + ((vl) this).field_f))) {
                                  break L65;
                                } else {
                                  if (jb.field_b < var4) {
                                    break L65;
                                  } else {
                                    if (~jb.field_b <= ~(var4 + e.field_g.field_t)) {
                                      break L65;
                                    } else {
                                      e.field_g.c(57 - -((vl) this).field_f, var4, 384);
                                      param1.field_gb = 1 + var6;
                                      if (((vl) this).field_g != param1.field_gb) {
                                        ((vl) this).field_g = param1.field_gb;
                                        qd.a((byte) 101, 29);
                                        break L64;
                                      } else {
                                        break L64;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        e.field_g.b(57 - -((vl) this).field_f, var4);
                        break L64;
                      } else {
                        e.field_g.c(((vl) this).field_f + 57, var4, 128);
                        break L64;
                      }
                    }
                    L66: {
                      L67: {
                        l.i(59 - -((vl) this).field_f, 2 + var4, ((vl) this).field_f + 321, var4 - -66);
                        if (var6 == 5) {
                          break L67;
                        } else {
                          if (11 != var6) {
                            cc.field_i[var6].a(192, 128, 164 + ((vl) this).field_f, 50 + (var4 - -2), (byte) 21);
                            break L66;
                          } else {
                            break L67;
                          }
                        }
                      }
                      L68: {
                        var7 = 0;
                        if (var6 != 5) {
                          break L68;
                        } else {
                          var7 -= 10;
                          break L68;
                        }
                      }
                      var8 = 4;
                      cc.field_i[var6].a(192, 128, var7 + (((vl) this).field_f + 164) + -64, 50 + (var4 + 2 + var8), (byte) 21);
                      break L66;
                    }
                    L69: {
                      l.c(((vl) this).field_f + 57, 84, ((vl) this).field_f + 323, 364);
                      if (param1.field_I.field_a[var6] > 50) {
                        param1.field_I.field_a[var6] = 55;
                        break L69;
                      } else {
                        break L69;
                      }
                    }
                    L70: {
                      if (od.field_c[var6].field_q) {
                        break L70;
                      } else {
                        if (!od.field_c[var6].field_f) {
                          param1.field_I.field_a[var6] = 55;
                          break L70;
                        } else {
                          break L70;
                        }
                      }
                    }
                    L71: {
                      if (!od.field_c[var6].field_q) {
                        break L71;
                      } else {
                        if (param1.field_Fb <= 0) {
                          break L71;
                        } else {
                          if (param1.field_I.field_a[var6] < 50) {
                            L72: {
                              qc.field_f[7].c(59 + ((vl) this).field_f, 2 + var4, (int)(120.0 * Math.cos(mm.field_f)) + 120);
                              var7 = 1;
                              if (var6 != 3) {
                                break L72;
                              } else {
                                var7 = 2;
                                break L72;
                              }
                            }
                            L73: {
                              if (var6 == 5) {
                                var7 = 4;
                                break L73;
                              } else {
                                break L73;
                              }
                            }
                            L74: {
                              if (var6 != 5) {
                                break L74;
                              } else {
                                if (!od.field_c[11].field_t) {
                                  break L74;
                                } else {
                                  var7 = 8;
                                  break L74;
                                }
                              }
                            }
                            L75: {
                              if (var6 != 2) {
                                break L75;
                              } else {
                                if (!od.field_c[10].field_t) {
                                  break L75;
                                } else {
                                  var7 = 2;
                                  break L75;
                                }
                              }
                            }
                            L76: {
                              if (var6 != 18) {
                                break L76;
                              } else {
                                if (!od.field_c[10].field_t) {
                                  break L76;
                                } else {
                                  var7 = 2;
                                  break L76;
                                }
                              }
                            }
                            L77: {
                              if (var6 != 7) {
                                break L77;
                              } else {
                                if (!od.field_c[16].field_t) {
                                  break L77;
                                } else {
                                  var7 = 2;
                                  break L77;
                                }
                              }
                            }
                            L78: {
                              if (6 != var6) {
                                break L78;
                              } else {
                                if (!od.field_c[16].field_t) {
                                  break L78;
                                } else {
                                  var7 = 2;
                                  break L78;
                                }
                              }
                            }
                            L79: {
                              if (var6 != 2) {
                                break L79;
                              } else {
                                if (od.field_c[16].field_t) {
                                  var7 = 4;
                                  break L79;
                                } else {
                                  break L79;
                                }
                              }
                            }
                            L80: {
                              if (var6 != 18) {
                                break L80;
                              } else {
                                if (od.field_c[16].field_t) {
                                  var7 = 4;
                                  break L80;
                                } else {
                                  break L80;
                                }
                              }
                            }
                            L81: {
                              L82: {
                                if (1 < param1.field_Fb) {
                                  break L82;
                                } else {
                                  if (var7 <= 1) {
                                    break L81;
                                  } else {
                                    break L82;
                                  }
                                }
                              }
                              L83: {
                                var8_ref_String = Integer.toString(param1.field_Fb);
                                if (var7 <= 1) {
                                  break L83;
                                } else {
                                  var8_ref_String = var8_ref_String + "*" + var7;
                                  break L83;
                                }
                              }
                              og.field_f.c(var8_ref_String, ((vl) this).field_f + 90, 32 + var4 + 8, 0, -1);
                              og.field_f.c(var8_ref_String, ((vl) this).field_f + 88, var4 + 40, 0, -1);
                              og.field_f.c(var8_ref_String, 89 + ((vl) this).field_f, 32 + (var4 - -9), 0, -1);
                              og.field_f.c(var8_ref_String, ((vl) this).field_f + 89, 7 + (var4 + 32), 0, -1);
                              og.field_f.c(var8_ref_String, ((vl) this).field_f + 89, 8 + var4 + 32, 16777215, -1);
                              break L81;
                            }
                            if (ef.field_j < 59 - -((vl) this).field_f) {
                              break L71;
                            } else {
                              if (~ef.field_j <= ~(103 + ((vl) this).field_f)) {
                                break L71;
                              } else {
                                if (var4 + 2 > jb.field_b) {
                                  break L71;
                                } else {
                                  if (~jb.field_b <= ~(2 + (var4 - -44))) {
                                    break L71;
                                  } else {
                                    param1.field_yb = true;
                                    param1.field_gb = 1 + var6;
                                    l.e(((vl) this).field_f + 59, 2 + var4, 44, 44, 16777215);
                                    break L71;
                                  }
                                }
                              }
                            }
                          } else {
                            break L71;
                          }
                        }
                      }
                    }
                    L84: {
                      var7 = 65280;
                      if (param1.field_I.field_a[var6] <= 0) {
                        var7 = 16711680;
                        og.field_f.b(od.field_c[var6].field_j, ((vl) this).field_f + 65, 82 + var4, var7, -1);
                        og.field_f.a(bh.field_j, ((vl) this).field_f + 313, 82 + var4, var7, -1);
                        break L84;
                      } else {
                        og.field_f.b(od.field_c[var6].field_j, 65 - -((vl) this).field_f, 82 + var4, var7, -1);
                        if (param1.field_I.field_a[var6] >= 50) {
                          break L84;
                        } else {
                          og.field_f.a(hk.field_c + param1.field_I.field_a[var6], ((vl) this).field_f + 313, var4 - -82, var7, -1);
                          break L84;
                        }
                      }
                    }
                    L85: {
                      if (var6 != 17) {
                        L86: {
                          L87: {
                            if (var6 == 5) {
                              break L87;
                            } else {
                              if (var6 == 11) {
                                break L87;
                              } else {
                                if (4 == var6) {
                                  break L87;
                                } else {
                                  if (var6 == 15) {
                                    break L87;
                                  } else {
                                    L88: {
                                      if (8 == var6) {
                                        break L88;
                                      } else {
                                        if (var6 == 9) {
                                          break L88;
                                        } else {
                                          if (var6 == 10) {
                                            break L88;
                                          } else {
                                            if (1 == var6) {
                                              og.field_f.a(ab.field_e + 10 * od.field_c[var6].field_l, ((vl) this).field_f + 319, 16 + var4, var7, -1);
                                              break L86;
                                            } else {
                                              og.field_f.a(ab.field_e + od.field_c[var6].field_l, ((vl) this).field_f + 319, 16 + var4, var7, -1);
                                              break L86;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    og.field_f.a(ab.field_e + od.field_c[var6].field_l * 3, 319 - -((vl) this).field_f, 16 + var4, var7, -1);
                                    break L86;
                                  }
                                }
                              }
                            }
                          }
                          og.field_f.a(ab.field_e + od.field_c[var6].field_l + im.field_a, 319 + ((vl) this).field_f, 16 + var4, var7, -1);
                          break L86;
                        }
                        L89: {
                          if (od.field_c[var6].field_o <= 1) {
                            break L89;
                          } else {
                            og.field_f.a(lm.field_f + od.field_c[var6].field_o, 319 - -((vl) this).field_f, 30 + var4, var7, -1);
                            break L89;
                          }
                        }
                        if (var6 == 5) {
                          break L85;
                        } else {
                          if (11 == var6) {
                            break L85;
                          } else {
                            L90: {
                              L91: {
                                var8 = od.field_c[var6].field_g[0];
                                if (8 == var6) {
                                  break L91;
                                } else {
                                  if (var6 != 9) {
                                    break L90;
                                  } else {
                                    break L91;
                                  }
                                }
                              }
                              var8 = var8 * 4 / 5;
                              break L90;
                            }
                            L92: {
                              L93: {
                                if (var6 == 12) {
                                  break L93;
                                } else {
                                  if (var6 != 13) {
                                    break L92;
                                  } else {
                                    break L93;
                                  }
                                }
                              }
                              var8 = 3 * var8 / 4;
                              break L92;
                            }
                            L94: {
                              if (var6 == 14) {
                                var8 = var8 * 2 / 3;
                                break L94;
                              } else {
                                break L94;
                              }
                            }
                            L95: {
                              og.field_f.a(wh.field_g + var8 + "%", 319 - -((vl) this).field_f, var4 + 44, var7, -1);
                              if (0 >= od.field_c[var6].field_b[2]) {
                                break L95;
                              } else {
                                if (5 >= od.field_c[var6].field_b[2]) {
                                  og.field_f.a(di.field_h[0], 319 - -((vl) this).field_f, 16 + var4 + 42, var7, -1);
                                  break L95;
                                } else {
                                  break L95;
                                }
                              }
                            }
                            L96: {
                              if (od.field_c[var6].field_b[2] <= 5) {
                                break L96;
                              } else {
                                if (10 < od.field_c[var6].field_b[2]) {
                                  break L96;
                                } else {
                                  og.field_f.a(di.field_h[1], ((vl) this).field_f + 319, 16 + (var4 + 42), var7, -1);
                                  break L96;
                                }
                              }
                            }
                            L97: {
                              if (od.field_c[var6].field_b[2] <= 10) {
                                break L97;
                              } else {
                                if (od.field_c[var6].field_b[2] <= 20) {
                                  og.field_f.a(di.field_h[2], 319 - -((vl) this).field_f, 16 + (var4 - -42), var7, -1);
                                  break L97;
                                } else {
                                  break L97;
                                }
                              }
                            }
                            L98: {
                              if (od.field_c[var6].field_b[2] > 20) {
                                og.field_f.a(di.field_h[3], 319 - -((vl) this).field_f, 16 + (var4 + 42), var7, -1);
                                break L98;
                              } else {
                                break L98;
                              }
                            }
                            if (0 == od.field_c[var6].field_b[2]) {
                              og.field_f.a(di.field_h[4], 319 - -((vl) this).field_f, var4 + 58, var7, -1);
                              break L85;
                            } else {
                              break L85;
                            }
                          }
                        }
                      } else {
                        og.field_f.a(of.field_n + 50, ((vl) this).field_f + 319, 16 + var4, var7, -1);
                        break L85;
                      }
                    }
                    var4 += 92;
                    break L57;
                  }
                }
                var6--;
                continue L13;
              }
            }
          } else {
            L99: {
              qc.field_f[var6 - -1].b(5 - -((vl) this).field_f, var4);
              if (var6 == param1.field_hb) {
                qc.field_f[0].b(5 + ((vl) this).field_f, var4);
                break L99;
              } else {
                break L99;
              }
            }
            L100: {
              if (ef.field_j < ((vl) this).field_f + 5) {
                break L100;
              } else {
                if (~(5 + (-((vl) this).field_f + qc.field_f[0].field_r)) >= ~ef.field_j) {
                  break L100;
                } else {
                  if (~var4 < ~jb.field_b) {
                    break L100;
                  } else {
                    if (~jb.field_b > ~(var4 - -qc.field_f[0].field_t)) {
                      L101: {
                        param1.field_Eb = new String[1];
                        param1.field_Eb[0] = lb.field_c[0];
                        if (var6 == 1) {
                          param1.field_Eb[0] = lb.field_c[1];
                          break L101;
                        } else {
                          break L101;
                        }
                      }
                      L102: {
                        if (var6 == 2) {
                          param1.field_Eb[0] = lb.field_c[2];
                          break L102;
                        } else {
                          break L102;
                        }
                      }
                      L103: {
                        if (var6 == 3) {
                          param1.field_Eb[0] = lb.field_c[3];
                          break L103;
                        } else {
                          break L103;
                        }
                      }
                      L104: {
                        if (var6 != 4) {
                          break L104;
                        } else {
                          param1.field_Eb[0] = lb.field_c[4];
                          break L104;
                        }
                      }
                      L105: {
                        if (var6 != 5) {
                          break L105;
                        } else {
                          param1.field_Eb[0] = lb.field_c[5];
                          break L105;
                        }
                      }
                      L106: {
                        l.e(5 - -((vl) this).field_f, var4, qc.field_f[0].field_r, qc.field_f[0].field_t, 16777215);
                        if (~var6 != ~((vl) this).field_d) {
                          ((vl) this).field_d = var6;
                          qd.a((byte) 67, 28);
                          break L106;
                        } else {
                          break L106;
                        }
                      }
                      if (oh.field_f != 1) {
                        break L100;
                      } else {
                        if (param1.field_wb != null) {
                          break L100;
                        } else {
                          L107: {
                            if (param1.field_hb == var6) {
                              break L107;
                            } else {
                              param1.field_G = 0;
                              ((vl) this).field_g = -1;
                              qd.a((byte) 119, 30);
                              break L107;
                            }
                          }
                          param1.field_hb = var6;
                          break L100;
                        }
                      }
                    } else {
                      break L100;
                    }
                  }
                }
              }
            }
            var4 += 52;
            var6++;
            continue L6;
          }
        }
    }

    vl() {
        ((vl) this).field_d = -1;
        ((vl) this).field_g = -1;
        qd.a((byte) 94, 26);
        ((vl) this).field_b = false;
        ((vl) this).field_f = -356;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new jj();
        field_h = 0;
        field_e = new int[4];
    }
}
