/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class qc extends qe {
    private rh field_r;
    static cn field_z;
    private rh field_v;
    private cn[] field_s;
    static boolean field_t;
    private int field_B;
    static int field_w;
    private cn[] field_A;
    private ae field_x;
    static int field_y;
    private tf[] field_u;

    private final void a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          L1: {
            var3 = tg.field_f[((qc) this).field_B][param1];
            var4 = bh.b(param1, ((qc) this).field_B, false);
            var5 = qd.a(param1, 380, ((qc) this).field_B);
            var6 = o.a(((qc) this).field_B, (byte) 122, param1);
            var7 = kf.a(param1, ((qc) this).field_B, -96);
            if (ke.a(105, var3)) {
              break L1;
            } else {
              if (((qc) this).field_B == 3) {
                break L1;
              } else {
                of.field_j.h(640 - of.field_j.field_y >> 1, var6);
                var6 += 4;
                break L0;
              }
            }
          }
          gf.e(var4 + -4, var6 - 6, var5 + (-var4 - -8), var7 - -8, 0);
          qc.b(var4, -2 + var6, var5 + -var4, var7, 8421504, 128, 128);
          rp.a(4, var5 - var4, (byte) 108, var4, var7, kc.field_S, -2 + var6);
          qc.a(var4, var6 - 2, var5 - var4, var7, 224, 64, 3, 128);
          break L0;
        }
        L2: {
          L3: {
            if (var3 == 13) {
              break L3;
            } else {
              if (var3 != 14) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          L4: {
            var8 = qi.field_b - -120;
            var9 = var5 - (-var4 + var8) >> 1;
            var9 = var9 + qi.field_b;
            if (var3 != 13) {
              stackOut_9_0 = 120 * ql.field_d / 256;
              stackIn_10_0 = stackOut_9_0;
              break L4;
            } else {
              stackOut_8_0 = oo.field_d * 120 / 256;
              stackIn_10_0 = stackOut_8_0;
              break L4;
            }
          }
          var10 = stackIn_10_0;
          var11 = (var7 - bk.field_e.field_b) / 2;
          vd.a(120, 2, -14561, 2, var9, var11 + var6);
          jc.a(var7 - 6, var10 + var9 + -1, var6 + 3, 2, 2, 2);
          break L2;
        }
    }

    final void f() {
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        if (((qc) this).field_b == null) {
          L0: {
            L1: {
              if (!ll.field_k) {
                break L1;
              } else {
                if (!qk.field_e[82]) {
                  break L1;
                } else {
                  if (mm.field_t == 49) {
                    L2: {
                      if (!ve.a(false)) {
                        stackOut_9_0 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        break L2;
                      } else {
                        stackOut_8_0 = 12;
                        stackIn_10_0 = stackOut_8_0;
                        break L2;
                      }
                    }
                    gd.a(stackIn_10_0, 0, -2, false);
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            ((qc) this).field_x.d(0);
            break L0;
          }
          return;
        } else {
          ((qc) this).field_b.b(false);
          return;
        }
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        return o.a(((qc) this).field_B, (byte) 109, param0);
    }

    private final void c(int param0, int param1, int param2, int param3, int param4) {
        gf.b(param3, param1, param4, param2, 1, 64);
    }

    private final void c(int param0, int param1) {
        sf.d(-101, param0);
        go var3 = ik.field_e;
        if (!(var3 != null)) {
            return;
        }
        var3.field_D.d(param0);
        var3.field_L.d(param0);
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int stackIn_36_2 = 0;
        Object stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int stackIn_37_2 = 0;
        Object stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_38_2 = 0;
        int stackIn_38_3 = 0;
        Object stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        int stackOut_35_2 = 0;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        int stackOut_37_3 = 0;
        Object stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int stackOut_36_2 = 0;
        int stackOut_36_3 = 0;
        var5 = DungeonAssault.field_K;
        super.a(param0);
        if (((qc) this).field_B == 12) {
          gf.a();
          if (!om.b(124)) {
            return;
          } else {
            he.e((byte) 87);
            return;
          }
        } else {
          this.a((byte) -107);
          var2 = tg.field_h[((qc) this).field_B];
          var3 = 640 - tm.field_p.field_y >> 1;
          var4 = 0;
          L0: while (true) {
            if (((qc) this).field_x.field_i <= var4) {
              L1: {
                L2: {
                  if (8 == mn.field_b) {
                    break L2;
                  } else {
                    if (mn.field_b != 9) {
                      le.field_f.h(4 + var3, -28 + var2);
                      e.field_j.h(var3 + 198, -28 + var2);
                      wj.field_w.h(var3 + 214, (-3 + ((qc) this).field_x.field_i) * tg.field_d[((qc) this).field_B] + (var2 - 5));
                      oj.field_a.h(var3 - -4, 293 + var2);
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                am.field_a.h(-(am.field_a.field_E / 2) + 320, 48);
                break L1;
              }
              L3: {
                if (8 != ((qc) this).field_B) {
                  if (9 != ((qc) this).field_B) {
                    if (((qc) this).field_B == 10) {
                      this.b((byte) 59);
                      break L3;
                    } else {
                      if (((qc) this).field_B == 11) {
                        int discarded$1 = ne.field_c.a(ul.field_d, 80, 80, 480, 1000, 16777215, -1, 0, 0, ne.field_c.field_R);
                        break L3;
                      } else {
                        if (((qc) this).field_B != 0) {
                          break L3;
                        } else {
                          fp.field_d.a(320, 25, 1699);
                          if (ll.field_k) {
                            kk.field_l.c("Press CTRL-S to start a random single player debug test game", 320, 44, 16777215, 0);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  } else {
                    this.b(true, -11931);
                    break L3;
                  }
                } else {
                  this.b(false, -11931);
                  break L3;
                }
              }
              L4: {
                if (((qc) this).field_b != null) {
                  ((qc) this).field_b.a((byte) -61);
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                oe.field_m.h(24, 383);
                oe.field_m.j(560, 383);
                if (!ib.a((byte) 40)) {
                  qc.e();
                  break L5;
                } else {
                  break L5;
                }
              }
              var4 = 0;
              L6: while (true) {
                if (~((qc) this).field_x.field_i >= ~var4) {
                  L7: {
                    if (((qc) this).field_B == 8) {
                      this.c(false, 127);
                      break L7;
                    } else {
                      if (((qc) this).field_B != 9) {
                        break L7;
                      } else {
                        this.c(true, 127);
                        break L7;
                      }
                    }
                  }
                  L8: {
                    if (((qc) this).field_b == null) {
                      break L8;
                    } else {
                      gf.g(0, 0, 640, 480);
                      ((qc) this).field_b.b(-113);
                      break L8;
                    }
                  }
                  oh.a((byte) 113);
                  ((qc) this).field_r.d();
                  ((qc) this).field_v.d();
                  return;
                } else {
                  L9: {
                    if (!this.d(var4, -7228)) {
                      break L9;
                    } else {
                      L10: {
                        stackOut_35_0 = this;
                        stackOut_35_1 = var4;
                        stackOut_35_2 = -31;
                        stackIn_37_0 = stackOut_35_0;
                        stackIn_37_1 = stackOut_35_1;
                        stackIn_37_2 = stackOut_35_2;
                        stackIn_36_0 = stackOut_35_0;
                        stackIn_36_1 = stackOut_35_1;
                        stackIn_36_2 = stackOut_35_2;
                        if (((qc) this).field_x.field_b != var4) {
                          stackOut_37_0 = this;
                          stackOut_37_1 = stackIn_37_1;
                          stackOut_37_2 = stackIn_37_2;
                          stackOut_37_3 = 0;
                          stackIn_38_0 = stackOut_37_0;
                          stackIn_38_1 = stackOut_37_1;
                          stackIn_38_2 = stackOut_37_2;
                          stackIn_38_3 = stackOut_37_3;
                          break L10;
                        } else {
                          stackOut_36_0 = this;
                          stackOut_36_1 = stackIn_36_1;
                          stackOut_36_2 = stackIn_36_2;
                          stackOut_36_3 = 1;
                          stackIn_38_0 = stackOut_36_0;
                          stackIn_38_1 = stackOut_36_1;
                          stackIn_38_2 = stackOut_36_2;
                          stackIn_38_3 = stackOut_36_3;
                          break L10;
                        }
                      }
                      this.a(stackIn_38_1, (byte) stackIn_38_2, stackIn_38_3 != 0);
                      break L9;
                    }
                  }
                  var4++;
                  continue L6;
                }
              }
            } else {
              L11: {
                if (!this.d(var4, -7228)) {
                  break L11;
                } else {
                  this.a(false, var4);
                  break L11;
                }
              }
              var4++;
              continue L0;
            }
          }
        }
    }

    private final void a(byte param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        cf[] var6_ref_cf__ = null;
        int var7 = 0;
        int var8 = 0;
        cf var8_ref_cf = null;
        int var9 = 0;
        L0: {
          var9 = DungeonAssault.field_K;
          var4 = tg.field_f[((qc) this).field_B][param1];
          if (param0 < -101) {
            break L0;
          } else {
            field_w = 68;
            break L0;
          }
        }
        L1: {
          if (!((qc) this).field_x.c(31)) {
            break L1;
          } else {
            if (!this.d(param1, -7228)) {
              break L1;
            } else {
              if (rp.a(15204376, var4)) {
                hm.a(var4, param1, param2, -28);
                break L1;
              } else {
                break L1;
              }
            }
          }
        }
        L2: {
          L3: {
            var6 = var4;
            if (var6 == 13) {
              L4: {
                var5 = 0;
                if (!((qc) this).field_x.b(-1)) {
                  break L4;
                } else {
                  if (oo.field_d > 0) {
                    var5 = 1;
                    this.c(0, -2);
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (!((qc) this).field_x.a(false)) {
                  break L5;
                } else {
                  if (256 > oo.field_d) {
                    var5 = 1;
                    this.c(256, -2);
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                if (!((qc) this).field_x.b((byte) -48)) {
                  break L6;
                } else {
                  L7: {
                    var6 = -120 + (this.e(param1, 82) - -this.f(-77, param1)) + qi.field_b >> 1;
                    var7 = hj.field_S + -var6;
                    var8 = 256 * var7 / 120;
                    if (var8 <= 0) {
                      this.c(0, -2);
                      break L7;
                    } else {
                      if (var8 >= 256) {
                        this.c(256, -2);
                        break L7;
                      } else {
                        this.c(var8, -2);
                        break L7;
                      }
                    }
                  }
                  var5 = 1;
                  break L6;
                }
              }
              L8: {
                if (!((qc) this).field_x.a(0)) {
                  break L8;
                } else {
                  if (oo.field_d <= 0) {
                    break L8;
                  } else {
                    ig.c(-89);
                    var5 = 1;
                    break L8;
                  }
                }
              }
              L9: {
                if (!((qc) this).field_x.c((byte) 109)) {
                  break L9;
                } else {
                  if (256 <= oo.field_d) {
                    break L9;
                  } else {
                    m.b((byte) 64);
                    var5 = 1;
                    break L9;
                  }
                }
              }
              if (var5 != 0) {
                L10: {
                  if (!((qc) this).field_x.b((byte) 127)) {
                    break L10;
                  } else {
                    if (~mo.field_a >= ~ia.field_X) {
                      break L3;
                    } else {
                      break L10;
                    }
                  }
                }
                var6_ref_cf__ = eb.field_O;
                var7 = oi.b(0, var6_ref_cf__.length);
                var8_ref_cf = var6_ref_cf__[var7];
                fa discarded$1 = cf.a(100, var8_ref_cf.field_e, var8_ref_cf.field_a << 2);
                ia.field_X = 20 + mo.field_a;
                break L2;
              } else {
                break L2;
              }
            } else {
              if (var6 != 14) {
                break L2;
              } else {
                L11: {
                  if (((qc) this).field_x.b(-1)) {
                    um.a(0, false);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (((qc) this).field_x.a(false)) {
                    um.a(256, false);
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (((qc) this).field_x.b((byte) -87)) {
                    var6 = -120 + (this.e(param1, 82) + (this.f(76, param1) + qi.field_b)) >> 1;
                    var7 = hj.field_S + -var6;
                    var8 = 256 * var7 / 120;
                    if (var8 > 0) {
                      if (var8 >= 256) {
                        um.a(256, false);
                        break L13;
                      } else {
                        um.a(var8, false);
                        break L13;
                      }
                    } else {
                      um.a(0, false);
                      break L13;
                    }
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if (!((qc) this).field_x.a(0)) {
                    break L14;
                  } else {
                    jd.b(true);
                    break L14;
                  }
                }
                if (((qc) this).field_x.c((byte) 66)) {
                  mi.b(210041889);
                  break L3;
                } else {
                  break L2;
                }
              }
            }
          }
          break L2;
        }
    }

    private final cn a(int param0, q param1) {
        RuntimeException var3 = null;
        cn stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        cn stackOut_0_0 = null;
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
            stackOut_0_0 = this.a(param1.a(), 320);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("qc.P(").append(120).append(',');
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
          throw vk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    private final int a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = DungeonAssault.field_K;
        var4 = 0;
        L0: while (true) {
          if (var4 >= tg.field_f[((qc) this).field_B].length) {
            return -1;
          } else {
            var5 = this.a(var4, 125);
            if (this.d(var4, -7228)) {
              if (this.e(var4, 82) <= param2) {
                if (this.f(97, var4) > param2) {
                  if (var5 <= param0) {
                    if (param0 < var5 - -this.b(394, var4)) {
                      return var4;
                    } else {
                      var4++;
                      continue L0;
                    }
                  } else {
                    var4++;
                    continue L0;
                  }
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                var4++;
                continue L0;
              }
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    private final void a(byte param0) {
        ((qc) this).field_e.b(0, 0);
    }

    private final boolean d(int param0, int param1) {
        return sg.a(3, ((qc) this).field_B, param0);
    }

    private final void a(byte param0, int param1) {
        int var3 = tg.field_f[((qc) this).field_B][param1];
        String var4 = ui.a(var3, 19435);
        int var5 = ne.field_c.b(var4);
        int var6 = ne.field_c.field_H + ne.field_c.field_E;
        cn var7 = new cn(var5, var6);
        jh.a(var7);
        ne.field_c.b(var4, 0, ne.field_c.field_H, 16760960, -1);
        jh.b();
        ((qc) this).field_A[param1] = rb.a(8, var7, 16760960, (byte) 105);
        ((qc) this).field_s[param1] = rb.a(16, var7, 6307840, (byte) -124);
    }

    private final void b(boolean param0, int param1) {
        this.c(64, 90, 94, 82, 476);
        this.c(64, 186, 180, 82, 142);
        this.c(64, 186, 180, 226, 332);
        cg.field_a.a(320, 25, 1699);
    }

    final void c() {
        super.c();
        um.field_g = null;
        ((qc) this).field_s = null;
        fj.field_f = null;
        ((qc) this).field_A = null;
        ud.field_s = null;
        ((qc) this).field_u = null;
        if (dd.field_E != null) {
            dd.field_E.b((byte) 30);
            dd.field_E = null;
        }
        if (nj.field_f != null) {
            nj.field_f.b(-4);
            nj.field_f = null;
        }
        u.field_P = -1;
        tf.field_j = null;
    }

    private final cn a(cn param0, int param1) {
        cn var3 = null;
        RuntimeException var3_ref = null;
        cn stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        cn stackOut_0_0 = null;
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
            jh.c();
            var3 = new cn(param0.field_E >> 1, param0.field_G >> 1);
            var3.e();
            param0.b(param0.field_E >> 3, param0.field_G >> 3, param0.field_E >> 2, param0.field_G >> 2, 16777215);
            var3.d(16777215);
            var3.e();
            param0.b(param0.field_E >> 3, param0.field_G >> 3, param0.field_E >> 2, param0.field_G >> 2, 0);
            jh.b();
            stackOut_0_0 = (cn) var3;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3_ref;
            stackOut_2_1 = new StringBuilder().append("qc.BA(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
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
          throw vk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + 320 + ')');
        }
        return stackIn_1_0;
    }

    final static int a(int param0, int param1, int[] param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var3_int = -117 % ((46 - param1) / 42);
              if (param0 >= ib.field_d * (-1 + ib.field_j)) {
                var4 = param0 - (-1 + ib.field_j) * ib.field_d;
                var5 = var4 - -ib.field_j;
                break L1;
              } else {
                var4 = param0 % (-1 + ib.field_j) + param0 / (-1 + ib.field_j) * ib.field_j;
                var5 = var4 + 1;
                break L1;
              }
            }
            L2: {
              if (param2[var4] < param2[var5]) {
                stackOut_5_0 = param2[var4];
                stackIn_6_0 = stackOut_5_0;
                break L2;
              } else {
                stackOut_4_0 = param2[var5];
                stackIn_6_0 = stackOut_4_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("qc.K(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    public static void a(int param0) {
        field_z = null;
    }

    private final int b(int param0, int param1) {
        return kf.a(param1, ((qc) this).field_B, -116);
    }

    private final void c(boolean param0, int param1) {
        int var3 = 0;
        hm var4 = null;
        int[] var4_array = null;
        cn var5_ref_cn = null;
        int var5 = 0;
        cn var6_ref_cn = null;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        StringBuilder var9 = null;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        String[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        String[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int stackIn_29_0 = 0;
        int[] stackIn_32_0 = null;
        int stackIn_38_0 = 0;
        String[] stackIn_39_0 = null;
        String[] stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        String[] stackIn_40_0 = null;
        String[] stackIn_40_1 = null;
        int stackIn_40_2 = 0;
        String[] stackIn_41_0 = null;
        String[] stackIn_41_1 = null;
        int stackIn_41_2 = 0;
        int stackIn_41_3 = 0;
        String[] stackIn_42_0 = null;
        String[] stackIn_42_1 = null;
        int stackIn_42_2 = 0;
        String[] stackIn_43_0 = null;
        String[] stackIn_43_1 = null;
        int stackIn_43_2 = 0;
        String[] stackIn_44_0 = null;
        String[] stackIn_44_1 = null;
        int stackIn_44_2 = 0;
        String stackIn_44_3 = null;
        String[] stackIn_60_0 = null;
        String[] stackIn_61_0 = null;
        String[] stackIn_62_0 = null;
        String stackIn_62_1 = null;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int[] stackOut_31_0 = null;
        int[] stackOut_30_0 = null;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        String[] stackOut_38_0 = null;
        String[] stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        String[] stackOut_40_0 = null;
        String[] stackOut_40_1 = null;
        int stackOut_40_2 = 0;
        int stackOut_40_3 = 0;
        String[] stackOut_39_0 = null;
        String[] stackOut_39_1 = null;
        int stackOut_39_2 = 0;
        int stackOut_39_3 = 0;
        String[] stackOut_41_0 = null;
        String[] stackOut_41_1 = null;
        int stackOut_41_2 = 0;
        String[] stackOut_43_0 = null;
        String[] stackOut_43_1 = null;
        int stackOut_43_2 = 0;
        String stackOut_43_3 = null;
        String[] stackOut_42_0 = null;
        String[] stackOut_42_1 = null;
        int stackOut_42_2 = 0;
        String stackOut_42_3 = null;
        String[] stackOut_59_0 = null;
        String[] stackOut_61_0 = null;
        String stackOut_61_1 = null;
        String[] stackOut_60_0 = null;
        String stackOut_60_1 = null;
        L0: {
          var17 = DungeonAssault.field_K;
          if (nj.field_f != null) {
            gf.a(kd.field_g);
            gf.e(94, 90, 546, 184);
            var3 = ig.b(31131);
            var4 = (hm) (Object) nj.field_f.e(-24172);
            L1: while (true) {
              if (var4 == null) {
                gf.b(kd.field_g);
                break L0;
              } else {
                L2: {
                  var5_ref_cn = f.field_a;
                  if (var4.field_r) {
                    L3: {
                      if (var4.field_i == u.field_P) {
                        break L3;
                      } else {
                        tf.field_j = ec.field_j[var4.field_i].a();
                        u.field_P = var4.field_i;
                        break L3;
                      }
                    }
                    var5_ref_cn = tf.field_j;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L4: {
                  var5_ref_cn.e(94 + var4.field_o - var3, var4.field_p);
                  if (var4.field_r) {
                    var6_ref_cn = ud.field_s[var4.field_i];
                    break L4;
                  } else {
                    var6_ref_cn = ud.field_s[46];
                    break L4;
                  }
                }
                L5: {
                  if (var4.field_i != kg.field_f) {
                    break L5;
                  } else {
                    um.field_g.field_g = -var3 - -94 + (16 + var4.field_o);
                    um.field_g.field_b = var4.field_p + 32;
                    if (0 == (li.field_k & 1)) {
                      um.field_g.a(var6_ref_cn, -12, 32);
                      break L5;
                    } else {
                      um.field_g.a();
                      break L5;
                    }
                  }
                }
                L6: {
                  if (ak.field_n == var4.field_i) {
                    fj.field_f.field_b = 32 + var4.field_p;
                    fj.field_f.field_g = 94 - var3 + 16 + var4.field_o;
                    if ((1 & li.field_k) != 0) {
                      fj.field_f.a();
                      break L6;
                    } else {
                      fj.field_f.a(var6_ref_cn, -12, 32);
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
                var4 = (hm) (Object) nj.field_f.a(4);
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        L7: {
          if (null == dd.field_E) {
            break L7;
          } else {
            if (!dd.field_E.field_w) {
              break L7;
            } else {
              dd.field_E.d(0);
              break L7;
            }
          }
        }
        L8: {
          if (kg.field_f == -1) {
            stackOut_28_0 = ak.field_n;
            stackIn_29_0 = stackOut_28_0;
            break L8;
          } else {
            stackOut_27_0 = kg.field_f;
            stackIn_29_0 = stackOut_27_0;
            break L8;
          }
        }
        L9: {
          var3 = stackIn_29_0;
          if (param0) {
            stackOut_31_0 = bp.field_e;
            stackIn_32_0 = stackOut_31_0;
            break L9;
          } else {
            stackOut_30_0 = gj.field_c;
            stackIn_32_0 = stackOut_30_0;
            break L9;
          }
        }
        L10: {
          var24 = stackIn_32_0;
          var23 = var24;
          var22 = var23;
          var20 = var22;
          var19 = var20;
          var4_array = var19;
          if (var3 != -1) {
            L11: {
              if (!vl.a(var3, -121, var24)) {
                stackOut_37_0 = 0;
                stackIn_38_0 = stackOut_37_0;
                break L11;
              } else {
                stackOut_36_0 = 1;
                stackIn_38_0 = stackOut_36_0;
                break L11;
              }
            }
            L12: {
              var5 = stackIn_38_0;
              var6 = la.field_b.field_E + la.field_b.field_H;
              stackOut_38_0 = new String[3];
              stackOut_38_1 = new String[3];
              stackOut_38_2 = 1;
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              if (var5 != 0) {
                stackOut_40_0 = (String[]) (Object) stackIn_40_0;
                stackOut_40_1 = (String[]) (Object) stackIn_40_1;
                stackOut_40_2 = stackIn_40_2;
                stackOut_40_3 = 8454016;
                stackIn_41_0 = stackOut_40_0;
                stackIn_41_1 = stackOut_40_1;
                stackIn_41_2 = stackOut_40_2;
                stackIn_41_3 = stackOut_40_3;
                break L12;
              } else {
                stackOut_39_0 = (String[]) (Object) stackIn_39_0;
                stackOut_39_1 = (String[]) (Object) stackIn_39_1;
                stackOut_39_2 = stackIn_39_2;
                stackOut_39_3 = 16744576;
                stackIn_41_0 = stackOut_39_0;
                stackIn_41_1 = stackOut_39_1;
                stackIn_41_2 = stackOut_39_2;
                stackIn_41_3 = stackOut_39_3;
                break L12;
              }
            }
            L13: {
              stackIn_41_1[stackIn_41_2] = Integer.toString(stackIn_41_3, 16);
              stackOut_41_0 = (String[]) (Object) stackIn_41_0;
              stackOut_41_1 = (String[]) (Object) stackIn_41_0;
              stackOut_41_2 = 2;
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              if (var5 != 0) {
                stackOut_43_0 = (String[]) (Object) stackIn_43_0;
                stackOut_43_1 = (String[]) (Object) stackIn_43_1;
                stackOut_43_2 = stackIn_43_2;
                stackOut_43_3 = fa.field_m;
                stackIn_44_0 = stackOut_43_0;
                stackIn_44_1 = stackOut_43_1;
                stackIn_44_2 = stackOut_43_2;
                stackIn_44_3 = stackOut_43_3;
                break L13;
              } else {
                stackOut_42_0 = (String[]) (Object) stackIn_42_0;
                stackOut_42_1 = (String[]) (Object) stackIn_42_1;
                stackOut_42_2 = stackIn_42_2;
                stackOut_42_3 = fi.field_x;
                stackIn_44_0 = stackOut_42_0;
                stackIn_44_1 = stackOut_42_1;
                stackIn_44_2 = stackOut_42_2;
                stackIn_44_3 = stackOut_42_3;
                break L13;
              }
            }
            L14: {
              stackIn_44_1[stackIn_44_2] = stackIn_44_3;
              var7 = jk.a(stackIn_44_0, f.field_b, 30496);
              var10 = var7;
              var10 = var7;
              db.field_v.b(var7, 239, var6 + 195, 16777215, -1);
              var8 = 210;
              if (var5 != 0) {
                ec.field_j[var3].a(89, var8);
                break L14;
              } else {
                f.field_a.h(89, var8);
                break L14;
              }
            }
            L15: {
              var8 = var8 + la.field_b.field_H;
              var8 = var8 + la.field_b.field_H;
              var9 = new StringBuilder(bb.field_k[var3]);
              if (null == gm.field_d) {
                break L15;
              } else {
                if (var5 == 0) {
                  L16: {
                    var10 = null;
                    if (var3 == 18) {
                      if (0 >= gm.field_d.field_u) {
                        break L16;
                      } else {
                        L17: {
                          stackOut_59_0 = new String[]{Integer.toString(gm.field_d.field_u)};
                          stackIn_61_0 = stackOut_59_0;
                          stackIn_60_0 = stackOut_59_0;
                          if (gm.field_d.field_u == 1) {
                            stackOut_61_0 = (String[]) (Object) stackIn_61_0;
                            stackOut_61_1 = i.field_y;
                            stackIn_62_0 = stackOut_61_0;
                            stackIn_62_1 = stackOut_61_1;
                            break L17;
                          } else {
                            stackOut_60_0 = (String[]) (Object) stackIn_60_0;
                            stackOut_60_1 = ji.field_H;
                            stackIn_62_0 = stackOut_60_0;
                            stackIn_62_1 = stackOut_60_1;
                            break L17;
                          }
                        }
                        var10 = jk.a(stackIn_62_0, stackIn_62_1, 30496);
                        break L16;
                      }
                    } else {
                      if (var3 != 41) {
                        if (var3 == 42) {
                          if (df.a((byte) -38) >= gm.field_d.field_p) {
                            break L16;
                          } else {
                            if (gm.field_d.field_p < gm.field_d.field_i) {
                              break L16;
                            } else {
                              var10 = jk.a(new String[2], wl.field_b, 30496);
                              break L16;
                            }
                          }
                        } else {
                          break L16;
                        }
                      } else {
                        var10 = jk.a(new String[1], fn.field_q, 30496);
                        break L16;
                      }
                    }
                  }
                  if (var10 == null) {
                    break L15;
                  } else {
                    StringBuilder discarded$3 = var9.append("<br><br>");
                    StringBuilder discarded$4 = var9.append(var10);
                    break L15;
                  }
                } else {
                  break L15;
                }
              }
            }
            var18 = new String[16];
            var21 = var18;
            var11 = la.field_b.a(var9.toString(), new int[1], var21);
            var12 = 0;
            L18: while (true) {
              if (var12 >= var11) {
                var12 = 355 + -cf.field_f.field_G;
                var13 = (2 * var12 - -cf.field_f.field_G) / 2 - -ne.field_c.field_E;
                gf.b(239, var12 - 6, 306, 8421504);
                la.field_b.b(op.field_a + sg.field_c[var3], 239, var13, 16777215, -1);
                var14 = 120;
                la.field_b.b(mp.field_f, var14 + 239, var13, 16777215, -1);
                var15 = 239 - -var14 - -la.field_b.b(mp.field_f);
                var16 = 0;
                L19: while (true) {
                  if (sg.field_d[var3] <= var16) {
                    break L10;
                  } else {
                    cf.field_f.h(var15, var12);
                    var15 = var15 + cf.field_f.field_y / 3;
                    var16++;
                    continue L19;
                  }
                }
              } else {
                la.field_b.b(var18[var12], 239, var8, 16777215, -1);
                var8 = var8 + var6;
                var12++;
                continue L18;
              }
            }
          } else {
            la.field_b.c(ql.field_h, 392, 260, 16777215, -1);
            if (!ed.c(true)) {
              break L10;
            } else {
              var5 = 300;
              int discarded$5 = db.field_v.a(ld.field_a, 239, var5, 306, 100, 16777215, -1, 1, 0, db.field_v.field_H);
              break L10;
            }
          }
        }
    }

    private final void a(int param0, byte param1, boolean param2) {
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int var12_int = 0;
        int var13 = 0;
        boolean stackIn_13_0 = false;
        boolean stackIn_14_0 = false;
        boolean stackIn_15_0 = false;
        int stackIn_15_1 = 0;
        boolean stackOut_12_0 = false;
        boolean stackOut_14_0 = false;
        int stackOut_14_1 = 0;
        boolean stackOut_13_0 = false;
        int stackOut_13_1 = 0;
        L0: {
          L1: {
            var4 = tg.field_f[((qc) this).field_B][param0];
            var5 = ui.a(var4, 19435);
            var6 = ne.field_c.b(var5);
            var7 = bh.b(param0, ((qc) this).field_B, false);
            var8 = qd.a(param0, 380, ((qc) this).field_B);
            var9 = o.a(((qc) this).field_B, (byte) 105, param0);
            if (var4 == 13) {
              break L1;
            } else {
              if (var4 != 14) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var6 = 120 + qi.field_b;
          break L0;
        }
        L2: {
          int discarded$1 = kf.a(param0, ((qc) this).field_B, -77);
          var10 = -var6 + var8 + var7 >> 1;
          if (ke.a(74, var4)) {
            break L2;
          } else {
            if (((qc) this).field_B != 3) {
              var9 += 4;
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          var11 = rp.a(15204376, var4) ? 1 : 0;
          if (20 != var4) {
            break L3;
          } else {
            if (-1 == ((qc) this).field_x.field_b) {
              break L3;
            } else {
              if (tg.field_f[((qc) this).field_B].length > ((qc) this).field_x.field_b) {
                L4: {
                  var12_int = tg.field_f[((qc) this).field_B][((qc) this).field_x.field_b];
                  stackOut_12_0 = param2;
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_13_0 = stackOut_12_0;
                  if (rp.a(15204376, var12_int)) {
                    stackOut_14_0 = stackIn_14_0;
                    stackOut_14_1 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    break L4;
                  } else {
                    stackOut_13_0 = stackIn_13_0;
                    stackOut_13_1 = 1;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_15_1 = stackOut_13_1;
                    break L4;
                  }
                }
                param2 = stackIn_15_0 | stackIn_15_1 != 0;
                break L3;
              } else {
                break L3;
              }
            }
          }
        }
        L5: {
          if (!param2) {
            if (var11 == 0) {
              var12 = tf.field_k;
              break L5;
            } else {
              var12 = ag.field_c;
              break L5;
            }
          } else {
            if (var11 != 0) {
              var12 = ml.field_b;
              break L5;
            } else {
              var12 = ug.field_E;
              break L5;
            }
          }
        }
        L6: {
          L7: {
            if (null == ((qc) this).field_u[param0]) {
              break L7;
            } else {
              L8: {
                if (((qc) this).field_u[param0].field_f == var5) {
                  break L8;
                } else {
                  if (!((qc) this).field_u[param0].field_f.equals((Object) (Object) var5)) {
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
              if (((qc) this).field_u[param0].field_h != var12) {
                break L7;
              } else {
                break L6;
              }
            }
          }
          ((qc) this).field_u[param0] = new tf((se) (Object) ne.field_c, var5, var12);
          ((qc) this).field_A[param0] = null;
          break L6;
        }
        L9: {
          ((qc) this).field_u[param0].b(var9, 32, var10);
          if (var11 != 0) {
            break L9;
          } else {
            hj.field_T.h(-20 + var10, ne.field_c.field_H + (var9 - 15));
            break L9;
          }
        }
        L10: {
          if (!param2) {
            break L10;
          } else {
            L11: {
              if (null == ((qc) this).field_A[param0]) {
                this.a((byte) -125, param0);
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              ((qc) this).field_A[param0].b(var10, var9, 64);
              var13 = (int)(128.0 * (1.0 + te.a(mo.field_a)));
              if (0 > var13) {
                var13 = 0;
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              if (var13 <= 256) {
                break L13;
              } else {
                var13 = 256;
                break L13;
              }
            }
            ((qc) this).field_s[param0].b(var10, var9, var13);
            break L10;
          }
        }
    }

    private final int f(int param0, int param1) {
        int var3 = -3 % ((param0 - -21) / 56);
        return qd.a(param1, 380, ((qc) this).field_B);
    }

    final void b(boolean param0) {
        int var2 = 0;
        int var3_int = 0;
        cn var3 = null;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        hm var14 = null;
        int var15 = 0;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int stackIn_6_0 = 0;
        int stackIn_18_0 = 0;
        int[] stackIn_21_0 = null;
        int stackIn_26_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_59_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int[] stackOut_20_0 = null;
        int[] stackOut_19_0 = null;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_58_0 = 0;
        L0: {
          var15 = DungeonAssault.field_K;
          super.b(param0);
          if (((qc) this).field_B != 0) {
            break L0;
          } else {
            o.a(121);
            if (!ed.c(true)) {
              break L0;
            } else {
              gm.field_d = null;
              break L0;
            }
          }
        }
        L1: {
          fk.a((byte) 121, lf.field_w);
          if (((qc) this).field_x.field_i > 0) {
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = -1;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var2 = stackIn_6_0;
          if (-1 != ((qc) this).field_x.field_b) {
            var2 = ((qc) this).field_x.field_b;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          L4: {
            ((qc) this).field_x.a(false, param0, var2, this.a(eh.field_h, true, hj.field_S));
            kg.field_f = -1;
            um.field_g = null;
            fj.field_f = null;
            ia.field_X = mo.field_a;
            ak.field_n = -1;
            if (((qc) this).field_B == 8) {
              break L4;
            } else {
              if (((qc) this).field_B != 9) {
                break L3;
              } else {
                break L4;
              }
            }
          }
          ud.field_s = new cn[47];
          u.field_P = -1;
          var3_int = 0;
          L5: while (true) {
            if (var3_int >= 46) {
              L6: {
                jh.c();
                var3 = new cn(64, 64);
                var3.e();
                gf.h(32, 31, 14, 16777215);
                ud.field_s[46] = var3;
                jh.b();
                if (9 != ((qc) this).field_B) {
                  stackOut_17_0 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  break L6;
                } else {
                  stackOut_16_0 = 1;
                  stackIn_18_0 = stackOut_16_0;
                  break L6;
                }
              }
              L7: {
                var4 = stackIn_18_0;
                if (var4 != 0) {
                  stackOut_20_0 = bp.field_e;
                  stackIn_21_0 = stackOut_20_0;
                  break L7;
                } else {
                  stackOut_19_0 = gj.field_c;
                  stackIn_21_0 = stackOut_19_0;
                  break L7;
                }
              }
              var19 = stackIn_21_0;
              var18 = var19;
              var17 = var18;
              var16 = var17;
              var5 = var16;
              nj.field_f = new md();
              var6 = 0;
              var7 = 0;
              L8: while (true) {
                if (var7 >= 46) {
                  L9: {
                    if (var6 >= 8) {
                      stackOut_39_0 = (1 + var6) / 2;
                      stackIn_40_0 = stackOut_39_0;
                      break L9;
                    } else {
                      stackOut_38_0 = var6;
                      stackIn_40_0 = stackOut_38_0;
                      break L9;
                    }
                  }
                  L10: {
                    var7 = stackIn_40_0;
                    if (0 == (var6 & 1)) {
                      stackOut_42_0 = 0;
                      stackIn_43_0 = stackOut_42_0;
                      break L10;
                    } else {
                      stackOut_41_0 = 1;
                      stackIn_43_0 = stackOut_41_0;
                      break L10;
                    }
                  }
                  L11: {
                    var8 = stackIn_43_0;
                    var9 = 0;
                    if (var7 <= 11) {
                      var9 = (8 + (-(var7 * 40) + 452)) / 2;
                      break L11;
                    } else {
                      dd.field_E = new dd(82, 176, 0, 476, 65536, 0);
                      var9 = 12;
                      break L11;
                    }
                  }
                  of.field_l = 0;
                  var10 = var9;
                  var11 = 100;
                  var12 = 0;
                  var13 = 0;
                  var14 = (hm) (Object) nj.field_f.e(-24172);
                  L12: while (true) {
                    if (var14 == null) {
                      break L3;
                    } else {
                      L13: {
                        var14.field_o = var10;
                        var14.field_p = var11;
                        var13 += 40;
                        var10 += 40;
                        if (~var13 >= ~of.field_l) {
                          break L13;
                        } else {
                          of.field_l = var13;
                          break L13;
                        }
                      }
                      var14 = (hm) (Object) nj.field_f.a(4);
                      var12++;
                      if (~var12 == ~var7) {
                        L14: {
                          var13 = 0;
                          var10 = var9;
                          if (var8 == 0) {
                            break L14;
                          } else {
                            var10 += 20;
                            var13 += 20;
                            break L14;
                          }
                        }
                        var11 += 40;
                        continue L12;
                      } else {
                        continue L12;
                      }
                    }
                  }
                } else {
                  L15: {
                    if (!vl.a(var7, -124, var19)) {
                      stackOut_25_0 = 0;
                      stackIn_26_0 = stackOut_25_0;
                      break L15;
                    } else {
                      stackOut_24_0 = 1;
                      stackIn_26_0 = stackOut_24_0;
                      break L15;
                    }
                  }
                  L16: {
                    var8 = stackIn_26_0;
                    if (var4 == 0) {
                      L17: {
                        if (vl.a(var7, -63, ia.field_P)) {
                          stackOut_31_0 = 0;
                          stackIn_32_0 = stackOut_31_0;
                          break L17;
                        } else {
                          stackOut_30_0 = 1;
                          stackIn_32_0 = stackOut_30_0;
                          break L17;
                        }
                      }
                      L18: {
                        var9 = stackIn_32_0;
                        if (var9 != 0) {
                          break L18;
                        } else {
                          if (var8 == 0) {
                            break L16;
                          } else {
                            break L18;
                          }
                        }
                      }
                      var6++;
                      nj.field_f.a((ne) (Object) new hm(var7, var8 != 0), false);
                      break L16;
                    } else {
                      if (var8 == 0) {
                        break L16;
                      } else {
                        nj.field_f.a((ne) (Object) new hm(var7, var8 != 0), false);
                        var6++;
                        break L16;
                      }
                    }
                  }
                  var7++;
                  continue L8;
                }
              }
            } else {
              ud.field_s[var3_int] = this.a(120, ec.field_j[var3_int]);
              var3_int++;
              continue L5;
            }
          }
        }
        L19: {
          L20: {
            ((qc) this).field_r = new rh(58, 394, 80, 160, 255, 197376, 240);
            ((qc) this).field_v = new rh(580, 394, 80, 160, 255, 197376, 240);
            ((qc) this).field_s = new cn[((qc) this).field_x.field_i];
            ((qc) this).field_u = new tf[((qc) this).field_x.field_i];
            ((qc) this).field_A = new cn[((qc) this).field_x.field_i];
            jh.a(((qc) this).field_e);
            if (mn.field_b == 8) {
              break L20;
            } else {
              if (9 == mn.field_b) {
                break L20;
              } else {
                stackOut_57_0 = 1;
                stackIn_59_0 = stackOut_57_0;
                break L19;
              }
            }
          }
          stackOut_58_0 = 0;
          stackIn_59_0 = stackOut_58_0;
          break L19;
        }
        L21: {
          bf.a(stackIn_59_0 != 0, -128);
          gf.a(kd.field_g);
          gf.e(41, 48, 599, 416);
          if (mn.field_b == 8) {
            break L21;
          } else {
            if (mn.field_b == 9) {
              break L21;
            } else {
              tm.field_p.h(640 - tm.field_p.field_y >> 1, 0);
              break L21;
            }
          }
        }
        gf.b(kd.field_g);
        jh.b();
    }

    final void c(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        pk var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_44_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        var4 = DungeonAssault.field_K;
        super.c(param0);
        if (12 == ((qc) this).field_B) {
          L0: {
            if (kk.d(0)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 1;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var2 = hm.a(stackIn_5_0 != 0, (byte) -20);
            if (var2 != 3) {
              break L1;
            } else {
              L2: {
                if (null == cm.field_R) {
                  break L2;
                } else {
                  ib.a(930);
                  break L2;
                }
              }
              sf.a(false, m.c(true));
              break L1;
            }
          }
          L3: {
            if (var2 == 1) {
              gd.a(dc.field_z, 0, 0, false);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (var2 == 2) {
              gd.a(dc.field_z, 0, 0, true);
              break L4;
            } else {
              break L4;
            }
          }
          return;
        } else {
          L5: {
            L6: {
              if (!kh.field_s) {
                break L6;
              } else {
                if (param0) {
                  break L5;
                } else {
                  break L6;
                }
              }
            }
            L7: while (true) {
              if (!ha.b((byte) 47)) {
                if (!((qc) this).d()) {
                  ((qc) this).field_x.a(-7734, this.a(hm.field_k, true, lc.field_c), this.a(eh.field_h, true, hj.field_S));
                  if (((qc) this).field_x.field_b != -1) {
                    this.a((byte) -112, ((qc) this).field_x.field_b, true);
                    break L5;
                  } else {
                    break L5;
                  }
                } else {
                  break L5;
                }
              } else {
                if (mm.field_t != 13) {
                  ((qc) this).f();
                  if (((qc) this).field_x.field_b != -1) {
                    this.a((byte) -127, ((qc) this).field_x.field_b, false);
                    continue L7;
                  } else {
                    continue L7;
                  }
                } else {
                  if (((qc) this).field_B == 1) {
                    L8: {
                      if (ve.a(false)) {
                        stackOut_27_0 = 12;
                        stackIn_28_0 = stackOut_27_0;
                        break L8;
                      } else {
                        stackOut_26_0 = 0;
                        stackIn_28_0 = stackOut_26_0;
                        break L8;
                      }
                    }
                    gd.a(stackIn_28_0, 0, -1, false);
                    continue L7;
                  } else {
                    if (mn.field_b == 10) {
                      continue L7;
                    } else {
                      if (0 == mn.field_b) {
                        continue L7;
                      } else {
                        gd.a(g.field_Hb, 0, g.field_Hb, false);
                        continue L7;
                      }
                    }
                  }
                }
              }
            }
          }
          L9: {
            if (null == ((qc) this).field_b) {
              break L9;
            } else {
              if (!((qc) this).field_b.field_d) {
                break L9;
              } else {
                var5 = (pk) (Object) ((qc) this).field_b;
                var3 = var5.field_r ? 1 : 0;
                ((qc) this).field_b.c(-121);
                ((qc) this).field_b = null;
                if (var3 == 0) {
                  L10: {
                    if (!ve.a(false)) {
                      stackOut_43_0 = 0;
                      stackIn_44_0 = stackOut_43_0;
                      break L10;
                    } else {
                      stackOut_42_0 = 12;
                      stackIn_44_0 = stackOut_42_0;
                      break L10;
                    }
                  }
                  gd.a(stackIn_44_0, 0, -3, false);
                  break L9;
                } else {
                  tl.field_d = false;
                  ik.a(ve.field_c, 89, -3);
                  break L9;
                }
              }
            }
          }
          L11: {
            L12: {
              if (((qc) this).field_B == 8) {
                break L12;
              } else {
                if (((qc) this).field_B == 9) {
                  break L12;
                } else {
                  if (10 == mn.field_b) {
                    break L12;
                  } else {
                    break L11;
                  }
                }
              }
            }
            ra.a(0);
            break L11;
          }
          return;
        }
    }

    private final void b(byte param0) {
        int var2 = en.a(-1, bp.field_e) ? 1 : 0;
        String var3 = kp.field_d;
        var3 = var3 + " " + tg.a('#', jk.a(new String[1], g.a(false, false, (byte) -111, var2 != 0), 30496), 3, "<br><br>");
        int discarded$0 = ne.field_c.a(var3, 80, 80, 480, 10 * ne.field_c.field_R, 16777215, -1, 1, 0, ne.field_c.field_R);
    }

    private final int e(int param0, int param1) {
        return bh.b(param0, ((qc) this).field_B, false);
    }

    qc(int param0) {
        ((qc) this).field_B = param0;
        ((qc) this).field_x = new ae(tg.field_f[((qc) this).field_B].length);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = -1;
    }
}
