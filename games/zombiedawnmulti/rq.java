/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rq extends br {
    private int field_h;
    static String field_n;
    private int field_t;
    private int field_f;
    private int field_o;
    static String field_g;
    private int field_w;
    private int field_k;
    private int field_s;
    static ja field_v;
    static int[] field_u;
    private int field_i;
    private int field_m;
    static String field_q;
    static String field_r;
    private int field_j;
    static ri field_l;
    private int field_p;

    final boolean a(int param0, byte param1, int param2) {
        if (param1 > 2) {
          if (30 > Math.abs(-this.field_k + param2)) {
            if (Math.abs(param0 + -this.field_f) >= 30) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    public static void b(boolean param0) {
        field_q = null;
        field_g = null;
        field_u = null;
        field_r = null;
        field_n = null;
        if (param0) {
          field_n = (String) null;
          field_v = null;
          field_l = null;
          return;
        } else {
          field_v = null;
          field_l = null;
          return;
        }
    }

    private final int d(int param0) {
        if (param0 != -30019) {
          this.a((byte) -99);
          return -9 + hp.a((byte) 112, g.field_a, 18);
        } else {
          return -9 + hp.a((byte) 112, g.field_a, 18);
        }
    }

    final void a(byte param0) {
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        L0: {
          fieldTemp$6 = this.field_h;
          this.field_h = this.field_h + 1;
          if (fieldTemp$6 <= 1) {
            break L0;
          } else {
            this.field_h = 0;
            if (!ZombieDawnMulti.field_E) {
              if (this.field_w > 0) {
                this.field_w = this.field_w - 1;
                return;
              } else {
                L1: {
                  if (this.field_t < this.field_o) {
                    this.field_t = this.field_t + 1;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                if (param0 > 84) {
                  fieldTemp$7 = this.field_p + 1;
                  this.field_p = this.field_p + 1;
                  if (fieldTemp$7 >= 8) {
                    this.c(12);
                    return;
                  } else {
                    return;
                  }
                } else {
                  field_r = (String) null;
                  fieldTemp$8 = this.field_p + 1;
                  this.field_p = this.field_p + 1;
                  if (fieldTemp$8 < 8) {
                    return;
                  } else {
                    this.c(12);
                    return;
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
    }

    final void a(nm param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
            if (this.field_w <= 0) {
              L1: {
                pk.field_c.c(-30 + param0.c(this.field_k, -20126), param0.d(this.field_f, 121) + -30, this.field_t);
                if (param1 < -24) {
                  break L1;
                } else {
                  this.a((byte) 103);
                  break L1;
                }
              }
              L2: {
                if (-1 >= (this.field_p ^ -1)) {
                  var3_int = param0.c(this.field_j, -20126);
                  var4 = param0.d(this.field_i, 108);
                  wi.field_g[this.field_p].c(-11 + var3_int, -this.field_p + -this.field_p + -this.field_p + var4 - (this.field_p + 11), 8 + -this.field_p << -245585373);
                  break L2;
                } else {
                  break L2;
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
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("rq.C(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0) {
        uj discarded$9 = null;
        int discarded$10 = 0;
        uj discarded$11 = null;
        int discarded$12 = 0;
        uj discarded$13 = null;
        int discarded$14 = 0;
        uj discarded$15 = null;
        int discarded$16 = 0;
        uj discarded$17 = null;
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4_int = 0;
        String var4 = null;
        int var5_int = 0;
        String var5 = null;
        nm stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        nm stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        nm stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        String stackIn_25_0 = null;
        String stackIn_56_0 = null;
        String stackIn_86_0 = null;
        String stackIn_115_0 = null;
        nm stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        nm stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        nm stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        String stackOut_85_0 = null;
        String stackOut_84_0 = null;
        String stackOut_55_0 = null;
        String stackOut_54_0 = null;
        String stackOut_24_0 = null;
        String stackOut_23_0 = null;
        String stackOut_114_0 = null;
        String stackOut_113_0 = null;
        if (!qj.field_p) {
          return;
        } else {
          if (null != wd.field_G) {
            L0: {
              var1 = wn.a(-125, wf.field_m << 1532649287) * 4 >> -405692880;
              stackOut_5_0 = fb.field_e.field_k;
              stackOut_5_1 = 9 + wd.field_G.g(119);
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              if (wd.field_G instanceof h) {
                stackOut_7_0 = (nm) ((Object) stackIn_7_0);
                stackOut_7_1 = stackIn_7_1;
                stackOut_7_2 = 30;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                stackIn_8_2 = stackOut_7_2;
                break L0;
              } else {
                stackOut_6_0 = (nm) ((Object) stackIn_6_0);
                stackOut_6_1 = stackIn_6_1;
                stackOut_6_2 = 0;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_8_2 = stackOut_6_2;
                break L0;
              }
            }
            L1: {
              var2 = (int)((float)((nm) (Object) stackIn_8_0).c(stackIn_8_1 - -stackIn_8_2, -20126) / fb.field_e.field_k.field_d);
              var3 = (int)((float)fb.field_e.field_k.d(-72 + (wd.field_G.h(param0 ^ -80) - -6), 112) / fb.field_e.field_k.field_d);
              var4_int = 2 + (var2 - -var1);
              var5_int = -var1 + var3 + -2;
              if (0 == var1) {
                ul.field_e = true;
                break L1;
              } else {
                break L1;
              }
            }
            if ((var1 ^ -1) == 3) {
              if (ul.field_e) {
                ul.field_e = false;
                discarded$9 = nm.b(param0 + -137, 47);
                ig.field_b.e(var4_int, var5_int, 128, 61264);
                if (param0 == 9) {
                  L2: {
                    if (-1 <= (se.field_E ^ -1)) {
                      break L2;
                    } else {
                      L3: {
                        var1 = (400 + -se.field_E >> 1537588225) + 10;
                        var2 = 20 + se.field_E - -20;
                        g.c();
                        var3 = 45;
                        oo.h(var1, var3, var2 + var1, var3 + hj.field_g);
                        oo.f(var1, var3, var2, hj.field_g, 2560, 160);
                        g.a(o.field_h, 10, var3, 192);
                        sj.field_j.g(10, var3);
                        sj.field_j.a(10, -5 + (hj.field_g + var3));
                        lm.field_fb.g(var1, var3);
                        lm.field_fb.b(-5 + (var2 + var1), var3);
                        rp.field_r[0].g(var1, var3);
                        rp.field_r[1].g(var2 + (var1 + -5), var3);
                        rp.field_r[2].g(var1, var3 - -hj.field_g + -5);
                        rp.field_r[3].g(-5 + var1 + var2, var3 + hj.field_g + -5);
                        var4 = ei.field_g[ma.field_d][ml.field_Jb];
                        if ((ma.field_d ^ -1) != -22) {
                          break L3;
                        } else {
                          if (1 != ll.field_k.b((byte) -1)) {
                            break L3;
                          } else {
                            if (ml.field_Jb >= ci.field_c.length) {
                              break L3;
                            } else {
                              if (null == ci.field_c[ml.field_Jb]) {
                                break L3;
                              } else {
                                var4 = ci.field_c[ml.field_Jb];
                                break L3;
                              }
                            }
                          }
                        }
                      }
                      L4: {
                        discarded$10 = pb.field_e.a(var4, 30, -10 + (var3 + 20), 400, -4 + hj.field_g + -20, 16777215, 0, 0, 0, 0);
                        if (!pp.field_n) {
                          L5: {
                            if (dg.field_J) {
                              stackOut_85_0 = gf.field_b;
                              stackIn_86_0 = stackOut_85_0;
                              break L5;
                            } else {
                              stackOut_84_0 = ob.field_A;
                              stackIn_86_0 = stackOut_84_0;
                              break L5;
                            }
                          }
                          var5 = stackIn_86_0;
                          pb.field_e.a(var5, 430, hj.field_g + var3 - 14, 10066329, 0);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      g.b();
                      break L2;
                    }
                  }
                  if (21 == ai.field_b) {
                    if (-10 == (hg.field_rb ^ -1)) {
                      L6: {
                        var1 = 4 * wn.a(-125, wf.field_m << 1888974151) >> 130906512;
                        var2 = var1 + 222;
                        var3 = 428 + -var1;
                        if (var1 == 0) {
                          ul.field_e = true;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      if (var1 == -4) {
                        if (ul.field_e) {
                          ul.field_e = false;
                          discarded$11 = nm.b(-127, 47);
                          ig.field_b.e(var2, var3, 128, 61264);
                          return;
                        } else {
                          ig.field_b.e(var2, var3, 128, 61264);
                          return;
                        }
                      } else {
                        ig.field_b.e(var2, var3, 128, 61264);
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                ig.field_b.e(var4_int, var5_int, 128, 61264);
                if (param0 == 9) {
                  L7: {
                    if (-1 <= (se.field_E ^ -1)) {
                      break L7;
                    } else {
                      L8: {
                        var1 = (400 + -se.field_E >> 1537588225) + 10;
                        var2 = 20 + se.field_E - -20;
                        g.c();
                        var3 = 45;
                        oo.h(var1, var3, var2 + var1, var3 + hj.field_g);
                        oo.f(var1, var3, var2, hj.field_g, 2560, 160);
                        g.a(o.field_h, 10, var3, 192);
                        sj.field_j.g(10, var3);
                        sj.field_j.a(10, -5 + (hj.field_g + var3));
                        lm.field_fb.g(var1, var3);
                        lm.field_fb.b(-5 + (var2 + var1), var3);
                        rp.field_r[0].g(var1, var3);
                        rp.field_r[1].g(var2 + (var1 + -5), var3);
                        rp.field_r[2].g(var1, var3 - -hj.field_g + -5);
                        rp.field_r[3].g(-5 + var1 + var2, var3 + hj.field_g + -5);
                        var4 = ei.field_g[ma.field_d][ml.field_Jb];
                        if ((ma.field_d ^ -1) != -22) {
                          break L8;
                        } else {
                          if (1 != ll.field_k.b((byte) -1)) {
                            break L8;
                          } else {
                            if (ml.field_Jb >= ci.field_c.length) {
                              break L8;
                            } else {
                              if (null == ci.field_c[ml.field_Jb]) {
                                break L8;
                              } else {
                                var4 = ci.field_c[ml.field_Jb];
                                break L8;
                              }
                            }
                          }
                        }
                      }
                      L9: {
                        discarded$12 = pb.field_e.a(var4, 30, -10 + (var3 + 20), 400, -4 + hj.field_g + -20, 16777215, 0, 0, 0, 0);
                        if (!pp.field_n) {
                          L10: {
                            if (dg.field_J) {
                              stackOut_55_0 = gf.field_b;
                              stackIn_56_0 = stackOut_55_0;
                              break L10;
                            } else {
                              stackOut_54_0 = ob.field_A;
                              stackIn_56_0 = stackOut_54_0;
                              break L10;
                            }
                          }
                          var5 = stackIn_56_0;
                          pb.field_e.a(var5, 430, hj.field_g + var3 - 14, 10066329, 0);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      g.b();
                      break L7;
                    }
                  }
                  if (21 == ai.field_b) {
                    if (-10 == (hg.field_rb ^ -1)) {
                      L11: {
                        var1 = 4 * wn.a(-125, wf.field_m << 1888974151) >> 130906512;
                        var2 = var1 + 222;
                        var3 = 428 + -var1;
                        if (var1 == 0) {
                          ul.field_e = true;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      if (var1 == -4) {
                        if (ul.field_e) {
                          ul.field_e = false;
                          discarded$13 = nm.b(-127, 47);
                          ig.field_b.e(var2, var3, 128, 61264);
                          return;
                        } else {
                          ig.field_b.e(var2, var3, 128, 61264);
                          return;
                        }
                      } else {
                        ig.field_b.e(var2, var3, 128, 61264);
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              ig.field_b.e(var4_int, var5_int, 128, 61264);
              if (param0 == 9) {
                L12: {
                  if (-1 <= (se.field_E ^ -1)) {
                    break L12;
                  } else {
                    L13: {
                      var1 = (400 + -se.field_E >> 1537588225) + 10;
                      var2 = 20 + se.field_E - -20;
                      g.c();
                      var3 = 45;
                      oo.h(var1, var3, var2 + var1, var3 + hj.field_g);
                      oo.f(var1, var3, var2, hj.field_g, 2560, 160);
                      g.a(o.field_h, 10, var3, 192);
                      sj.field_j.g(10, var3);
                      sj.field_j.a(10, -5 + (hj.field_g + var3));
                      lm.field_fb.g(var1, var3);
                      lm.field_fb.b(-5 + (var2 + var1), var3);
                      rp.field_r[0].g(var1, var3);
                      rp.field_r[1].g(var2 + (var1 + -5), var3);
                      rp.field_r[2].g(var1, var3 - -hj.field_g + -5);
                      rp.field_r[3].g(-5 + var1 + var2, var3 + hj.field_g + -5);
                      var4 = ei.field_g[ma.field_d][ml.field_Jb];
                      if ((ma.field_d ^ -1) != -22) {
                        break L13;
                      } else {
                        if (1 != ll.field_k.b((byte) -1)) {
                          break L13;
                        } else {
                          if (ml.field_Jb >= ci.field_c.length) {
                            break L13;
                          } else {
                            if (null == ci.field_c[ml.field_Jb]) {
                              break L13;
                            } else {
                              var4 = ci.field_c[ml.field_Jb];
                              break L13;
                            }
                          }
                        }
                      }
                    }
                    L14: {
                      discarded$14 = pb.field_e.a(var4, 30, -10 + (var3 + 20), 400, -4 + hj.field_g + -20, 16777215, 0, 0, 0, 0);
                      if (!pp.field_n) {
                        L15: {
                          if (dg.field_J) {
                            stackOut_24_0 = gf.field_b;
                            stackIn_25_0 = stackOut_24_0;
                            break L15;
                          } else {
                            stackOut_23_0 = ob.field_A;
                            stackIn_25_0 = stackOut_23_0;
                            break L15;
                          }
                        }
                        var5 = stackIn_25_0;
                        pb.field_e.a(var5, 430, hj.field_g + var3 - 14, 10066329, 0);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    g.b();
                    break L12;
                  }
                }
                if (21 == ai.field_b) {
                  if (-10 == (hg.field_rb ^ -1)) {
                    L16: {
                      var1 = 4 * wn.a(-125, wf.field_m << 1888974151) >> 130906512;
                      var2 = var1 + 222;
                      var3 = 428 + -var1;
                      if (var1 == 0) {
                        ul.field_e = true;
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    if (var1 == -4) {
                      if (ul.field_e) {
                        ul.field_e = false;
                        discarded$15 = nm.b(-127, 47);
                        ig.field_b.e(var2, var3, 128, 61264);
                        return;
                      } else {
                        ig.field_b.e(var2, var3, 128, 61264);
                        return;
                      }
                    } else {
                      ig.field_b.e(var2, var3, 128, 61264);
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            if (param0 == 9) {
              L17: {
                if (-1 <= (se.field_E ^ -1)) {
                  break L17;
                } else {
                  L18: {
                    var1 = (400 + -se.field_E >> 1537588225) + 10;
                    var2 = 20 + se.field_E - -20;
                    g.c();
                    var3 = 45;
                    oo.h(var1, var3, var2 + var1, var3 + hj.field_g);
                    oo.f(var1, var3, var2, hj.field_g, 2560, 160);
                    g.a(o.field_h, 10, var3, 192);
                    sj.field_j.g(10, var3);
                    sj.field_j.a(10, -5 + (hj.field_g + var3));
                    lm.field_fb.g(var1, var3);
                    lm.field_fb.b(-5 + (var2 + var1), var3);
                    rp.field_r[0].g(var1, var3);
                    rp.field_r[1].g(var2 + (var1 + -5), var3);
                    rp.field_r[2].g(var1, var3 - -hj.field_g + -5);
                    rp.field_r[3].g(-5 + var1 + var2, var3 + hj.field_g + -5);
                    var4 = ei.field_g[ma.field_d][ml.field_Jb];
                    if ((ma.field_d ^ -1) != -22) {
                      break L18;
                    } else {
                      if (1 != ll.field_k.b((byte) -1)) {
                        break L18;
                      } else {
                        if (ml.field_Jb >= ci.field_c.length) {
                          break L18;
                        } else {
                          if (null == ci.field_c[ml.field_Jb]) {
                            break L18;
                          } else {
                            var4 = ci.field_c[ml.field_Jb];
                            break L18;
                          }
                        }
                      }
                    }
                  }
                  L19: {
                    discarded$16 = pb.field_e.a(var4, 30, -10 + (var3 + 20), 400, -4 + hj.field_g + -20, 16777215, 0, 0, 0, 0);
                    if (!pp.field_n) {
                      L20: {
                        if (dg.field_J) {
                          stackOut_114_0 = gf.field_b;
                          stackIn_115_0 = stackOut_114_0;
                          break L20;
                        } else {
                          stackOut_113_0 = ob.field_A;
                          stackIn_115_0 = stackOut_113_0;
                          break L20;
                        }
                      }
                      var5 = stackIn_115_0;
                      pb.field_e.a(var5, 430, hj.field_g + var3 - 14, 10066329, 0);
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  g.b();
                  break L17;
                }
              }
              if (21 == ai.field_b) {
                if (-10 == (hg.field_rb ^ -1)) {
                  L21: {
                    var1 = 4 * wn.a(-125, wf.field_m << 1888974151) >> 130906512;
                    var2 = var1 + 222;
                    var3 = 428 + -var1;
                    if (var1 == 0) {
                      ul.field_e = true;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  if (var1 == -4) {
                    if (ul.field_e) {
                      ul.field_e = false;
                      discarded$17 = nm.b(-127, 47);
                      ig.field_b.e(var2, var3, 128, 61264);
                      return;
                    } else {
                      ig.field_b.e(var2, var3, 128, 61264);
                      return;
                    }
                  } else {
                    ig.field_b.e(var2, var3, 128, 61264);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final static void a(ja[] param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        String var3 = null;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            g.c();
            el.field_H = param0;
            ve.field_b = new ja(55, 130);
            ve.field_b.a();
            el.field_H[2].f(5, -5, param1);
            el.field_H[3].f(5, -5, 16777215);
            oo.i(4, 4, 0, 0, oo.field_b, oo.field_l);
            el.field_H[2].f(5, -5, 0);
            el.field_H[3].f(5, -5, 0);
            oj.field_M = new ja[39];
            fe.field_W = new ja[oj.field_M.length];
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var2_int >= oj.field_M.length) {
                    break L3;
                  } else {
                    oj.field_M[var2_int] = new ja(200, 25);
                    oj.field_M[var2_int].a();
                    var3 = lh.a((byte) -12, var2_int);
                    pb.field_e.b(var3, 100, 17, 16777215, -1);
                    fe.field_W[var2_int] = g.b(oj.field_M[var2_int]);
                    var2_int++;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                dl.field_c = da.a(9, np.field_l);
                fe.field_U = da.a(param1 ^ -16777125, mj.field_Sb);
                mi.field_Mb = da.a(104, mq.field_o);
                up.field_f = da.a(4, wm.field_U);
                la.field_j = da.a(70, vc.field_a);
                bq.field_a = da.a(-113, ej.field_k);
                wp.field_e = da.a(100, bg.field_p);
                bf.field_f = g.b(dl.field_c);
                ap.field_t = g.b(fe.field_U);
                ii.field_c = g.b(bq.field_a);
                aq.field_u = g.b(mi.field_Mb);
                kj.field_o = g.b(la.field_j);
                oq.field_t = g.b(up.field_f);
                vl.field_k = g.b(wp.field_e);
                g.b();
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var2);
            stackOut_8_1 = new StringBuilder().append("rq.B(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    private final void c(int param0) {
        this.field_j = param0 + (this.field_s * 24 - -this.d(-30019));
        this.field_i = this.field_m * 24 + 12 + this.d(-30019);
        this.field_p = -hp.a((byte) 39, g.field_a, 50);
    }

    rq(int param0, int param1, int param2) {
        this.field_s = param0;
        this.field_m = param1;
        this.c(12);
        this.field_o = 25 + hp.a((byte) 37, g.field_a, 10) >> 1017857634;
        this.field_t = 0;
        this.field_k = 12 + 24 * this.field_s + this.d(-30019);
        this.field_f = 12 + (this.field_m * 24 - -this.d(-30019));
        this.field_w = param2 + hp.a((byte) 58, g.field_a, 10);
        this.field_p = 0;
        this.field_h = hp.a((byte) -110, g.field_a, 1);
    }

    static {
        field_q = "Show chat (<%0> unread messages)";
        field_r = "Show game chat from my friends";
        field_n = "Blast humans and zombies, stunning them! If you could only make it 'deadly'...";
        field_g = "Hide lobby chat";
    }
}
