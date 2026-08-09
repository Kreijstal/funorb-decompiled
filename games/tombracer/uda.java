/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uda extends qra {
    static nh field_r;
    private daa field_m;
    private vna field_n;
    static String field_w;
    static String field_o;
    static int field_q;
    private int field_p;
    private boolean field_y;
    static jea field_s;
    private rp[] field_t;
    private int field_u;
    private int field_v;
    static int field_x;

    private final boolean f(int param0) {
        ad var2;
        int var3;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param0 == 0) {
          var2 = (ad) ((Object) this.field_n.f(param0 ^ -80));
          L0: while (true) {
            if (var2 == null) {
              return false;
            } else {
              L1: {
                if (!var2.a((byte) -85)) {
                  break L1;
                } else {
                  if (var2.a(-64)) {
                    break L1;
                  } else {
                    this.field_v = var2.field_f;
                    return true;
                  }
                }
              }
              var2 = (ad) ((Object) this.field_n.e(111));
              continue L0;
            }
          }
        } else {
          return true;
        }
    }

    final boolean a(char param0, int param1, int param2) {
        boolean discarded$1 = false;
        L0: {
          if (0 == this.field_p) {
            break L0;
          } else {
            if (!this.i(param1 ^ -26)) {
              break L0;
            } else {
              L1: {
                if (param1 == 25) {
                  break L1;
                } else {
                  discarded$1 = this.f(94);
                  break L1;
                }
              }
              L2: {
                if (84 == param2) {
                  break L2;
                } else {
                  if ((param2 ^ -1) != -84) {
                    return false;
                  } else {
                    break L2;
                  }
                }
              }
              this.a(true, this.field_v);
              return true;
            }
          }
        }
        return false;
    }

    final void b(int param0, boolean param1) {
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        int var3;
        int var4;
        int var5;
        ad var6_ref_ad;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        L0: {
          var10 = TombRacer.field_G ? 1 : 0;
          la.field_j.a(0, 0);
          var3 = aaa.a(false) / 2;
          var4 = koa.b(0) / 2;
          if (this.i(-1)) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = 1;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          ik.field_h.a(0, 0);
          be.a(gta.field_a.toUpperCase(), 1, qr.field_v, 2431750, 0, 48, 1, -222 + var4, var3 + -360, -1, (byte) 60, 512);
          if (-1 != this.field_u) {
            break L1;
          } else {
            if (var5 == 0) {
              break L1;
            } else {
              be.a(jsa.field_F, 1, eda.field_f, 2431750, 0, 48, 1, koa.b(0) + -48, var3 - 256, -1, (byte) 60, 512);
              break L1;
            }
          }
        }
        var6_ref_ad = (ad) ((Object) this.field_n.f(-80));
        L2: while (true) {
          if (var6_ref_ad == null) {
            L3: {
              if (param0 < -50) {
                break L3;
              } else {
                this.a(33, true);
                break L3;
              }
            }
            ura.a(-10985);
            var6 = this.field_t.length;
            var11 = 0;
            var7 = var11;
            L4: while (true) {
              if (var6 <= var11) {
                se.f((byte) -6);
                this.d(-27142);
                return;
              } else {
                L5: {
                  var8 = 64 + -(var6 * 64) + var3 + (var11 * 128 + -10);
                  var9 = var4 - -80;
                  if (this.field_t[var11] != null) {
                    this.field_t[var11].a(var8, 1400, var9 - -55, (byte) 73);
                    break L5;
                  } else {
                    bsa.field_i.a(-(bsa.field_i.a() >> -1700657663) + var8, -(bsa.field_i.c() >> -4698335) + var9, 0, 1627389951, 1);
                    break L5;
                  }
                }
                be.a(this.field_h.a(var11, false).toUpperCase(), 1, qf.field_j, wga.field_a[var11], 0, 32, 1, 55 + var9, var8 + -64, -1, (byte) 60, 128);
                var11++;
                continue L4;
              }
            }
          } else {
            L6: {
              if (var6_ref_ad.field_f == this.field_v) {
                stackIn_12_0 = 1;
                break L6;
              } else {
                stackIn_12_0 = 0;
                break L6;
              }
            }
            var7 = stackIn_12_0;
            var6_ref_ad.a((byte) -9, var7 != 0);
            var6_ref_ad = (ad) ((Object) this.field_n.e(119));
            continue L2;
          }
        }
    }

    final void a(int param0, boolean param1) {
        int var3;
        int var4;
        L0: {
          var4 = TombRacer.field_G ? 1 : 0;
          if (this.field_y) {
            break L0;
          } else {
            li.b(this.field_h.l(param0 + 41), (byte) 107);
            this.field_y = true;
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          if (this.field_t.length <= var3) {
            L2: {
              if (param1) {
                this.c(7);
                break L2;
              } else {
                break L2;
              }
            }
            if (this.field_u < 0) {
              L3: {
                this.field_m.a(32221);
                if (!param1) {
                  break L3;
                } else {
                  if (!this.i(param0 + -81)) {
                    break L3;
                  } else {
                    this.g(-13);
                    break L3;
                  }
                }
              }
              L4: {
                if (this.field_m.a(false)) {
                  this.field_u = 100;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (param0 == 80) {
                  break L5;
                } else {
                  this.a('H', -116, 32);
                  break L5;
                }
              }
              this.field_p = this.field_p + 1;
              return;
            } else {
              L6: {
                this.field_u = this.field_u - 1;
                if (this.field_u == 0) {
                  if (this.field_h.field_D) {
                    return;
                  } else {
                    this.field_h.c(111);
                    break L6;
                  }
                } else {
                  break L6;
                }
              }
              return;
            }
          } else {
            if (null != this.field_t[var3]) {
              this.field_t[var3].b(-73);
              var3++;
              continue L1;
            } else {
              var3++;
              continue L1;
            }
          }
        }
    }

    private final void a(boolean param0, int param1) {
        if (!this.i(-1)) {
            return;
        }
        if (!param0) {
            return;
        }
        if (null != this.field_f) {
            this.field_f.d(param1, 73);
        } else {
            this.a(this.field_h.field_x, 0, param1);
        }
    }

    uda(qh param0, v param1) {
        super(param0, param1);
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ad var8 = null;
        this.field_p = 0;
        this.field_v = 0;
        this.field_u = -1;
        try {
          L0: {
            this.field_m = new daa(this.field_c);
            this.field_m.field_b = new w();
            this.field_n = new vna();
            var3_int = 0;
            L1: while (true) {
              if ((var3_int ^ -1) <= -14) {
                var3_int = param0.field_k.field_H.length;
                this.field_t = new rp[var3_int];
                this.field_y = false;
                break L0;
              } else {
                L2: {
                  var4 = aaa.a(false);
                  var5 = koa.b(0);
                  var6 = var3_int % 7 * (0 + (-90 + var4) / 7) + 45;
                  stackIn_5_0 = -90;

                  if (-8 >= (var3_int ^ -1)) {
                    stackIn_6_0 = stackIn_5_0;
                    stackIn_6_1 = (var5 >> -1653651743) + 20;
                    break L2;
                  } else {
                    stackIn_6_0 = stackIn_5_0;
                    stackIn_6_1 = (var5 >> 764891265) + -84;
                    break L2;
                  }
                }
                L3: {
                  var7 = stackIn_6_0 + stackIn_6_1;
                  if (-8 < (var3_int ^ -1)) {
                    break L3;
                  } else {
                    var6 += 32;
                    break L3;
                  }
                }
                L4: {
                  var8 = new ad(var6, var7);
                  if (!this.a(var3_int, (byte) -35)) {
                    break L4;
                  } else {
                    var8 = new ad(var3_int, var6, var7);
                    break L4;
                  }
                }
                this.field_n.b((byte) -104, var8);
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("uda.<init>(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        this.field_m.a((byte) -69, param2, param0);
        this.field_t[param0] = new rp(param2);
        bua var4 = this.field_t[param0].field_j;
        var4.a(param2, false, param1, 5, true);
        int var5 = var4.c((byte) 114);
        var4.a(param1 + 107, var5, param2, 0, 0);
        jha var6 = ab.a(param1 ^ -41, gl.a((byte) 82, coa.field_n, new String[]{this.field_c.e(param0, 23807), la.field_m[param2]}));
        iqa.field_c.a(0, var6);
    }

    private final boolean i(int param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 == -1) {
            break L0;
          } else {
            this.field_p = -18;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_h.d((byte) 111)) {
              break L2;
            } else {
              if (this.field_m.a(0, this.field_h.field_x) != -1) {
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

    private final void g(int param0) {
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_28_2 = 0;
        int var3;
        var3 = TombRacer.field_G ? 1 : 0;
        if (this.field_p == 0) {
          return;
        } else {
          L0: {
            if (!qma.field_c) {
              break L0;
            } else {
              if (!this.f(0)) {
                break L0;
              } else {
                if (-2 == (hf.field_b ^ -1)) {
                  this.a(true, this.field_v);
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
          L1: {
            if (!this.field_h.g(0, 2)) {
              break L1;
            } else {
              this.field_v = this.field_v - 7;
              break L1;
            }
          }
          L2: {
            if (!this.field_h.g(0, 3)) {
              break L2;
            } else {
              this.field_v = this.field_v + 7;
              break L2;
            }
          }
          L3: {
            if (!this.field_h.g(param0 ^ param0, 0)) {
              break L3;
            } else {
              this.field_v = this.field_v - 1;
              break L3;
            }
          }
          L4: {
            if (this.field_h.g(0, 1)) {
              this.field_v = this.field_v + 1;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (this.field_v < 13) {
              break L5;
            } else {
              this.field_v = this.field_v - 13;
              break L5;
            }
          }
          L6: {
            if (0 > this.field_v) {
              this.field_v = this.field_v + 13;
              break L6;
            } else {
              break L6;
            }
          }
          L7: while (true) {
            if (this.a(this.field_v, (byte) -74)) {
              return;
            } else {
              L8: {
                L9: {
                  stackIn_26_0 = this;

                  stackIn_26_1 = this.field_v;

                  if (this.field_h.g(0, 0)) {
                    break L9;
                  } else {
                    stackIn_27_0 = this;

                    if (!this.field_h.g(0, 2)) {
                      stackIn_28_0 = this;
                      stackIn_28_1 = stackIn_26_1;
                      stackIn_28_2 = 1;
                      break L8;
                    } else {
                      stackIn_26_0 = this;

                      break L9;
                    }
                  }
                }
                stackIn_28_0 = this;
                stackIn_28_1 = stackIn_26_1;
                stackIn_28_2 = -1;
                break L8;
              }
              L10: {
                ((uda) (this)).field_v = stackIn_28_1 + stackIn_28_2;
                if ((this.field_v ^ -1) <= -14) {
                  this.field_v = this.field_v + -13;
                  break L10;
                } else {
                  break L10;
                }
              }
              if (this.field_v < 0) {
                this.field_v = 13 + this.field_v;
                continue L7;
              } else {
                continue L7;
              }
            }
          }
        }
    }

    private final boolean a(int param0, byte param1) {
        int stackIn_16_0 = 0;
        L0: {
          if (param1 < -29) {
            break L0;
          } else {
            field_s = (jea) null;
            break L0;
          }
        }
        L1: {
          if (vpa.a(119)) {
            break L1;
          } else {
            if (mq.field_e != null) {
              L2: {
                L3: {
                  if (di.field_g[param0]) {
                    break L3;
                  } else {
                    L4: {
                      L5: {
                        if (di.field_f[param0]) {
                          break L5;
                        } else {
                          if (-1 <= (wla.field_ub ^ -1)) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      if (mq.field_e.b((byte) 4, param0)) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                    if (!eq.c(0)) {
                      stackIn_16_0 = 0;
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                stackIn_16_0 = 1;
                break L2;
              }
              return stackIn_16_0 != 0;
            } else {
              break L1;
            }
          }
        }
        return di.field_g[param0];
    }

    final boolean e(int param0) {
        if (param0 != -9202) {
            return false;
        }
        return true;
    }

    public static void h(int param0) {
        field_o = null;
        field_w = null;
        field_s = null;
        if (param0 < 9) {
            uda.h(105);
        }
        field_r = null;
    }

    static {
        field_o = "(finished quicker)";
        field_w = "Invite more players, or alternatively try changing the following settings:  ";
    }
}
