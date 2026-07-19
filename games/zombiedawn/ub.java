/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub {
    private tj field_o;
    static String field_h;
    static String field_j;
    private int field_m;
    private int field_n;
    private boolean field_l;
    private int field_q;
    int field_b;
    private boolean field_i;
    private boolean field_c;
    int field_k;
    static float field_f;
    static int field_d;
    private boolean field_e;
    private float field_p;
    int field_a;
    private boolean field_s;
    private boolean field_g;
    private int field_r;

    private final String h(int param0) {
        if (param0 != 31214) {
            return (String) null;
        }
        int var2 = this.field_a / 3000;
        int var3 = this.field_a % 3000 / 50;
        return var2 + ":" + (10 <= var3 ? "" : "0") + var3;
    }

    public static void c(byte param0) {
        va discarded$0 = null;
        field_j = null;
        field_h = null;
        if (param0 <= 59) {
            discarded$0 = ub.a(-19, 30);
        }
    }

    final void a(boolean param0) {
        this.field_b = this.field_b + 1;
        if (!param0) {
            this.field_r = 87;
        }
        this.d((byte) -106);
    }

    final static void a(int param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ZombieDawn.field_J;
        try {
          L0: {
            b.field_q = param0;
            qn.field_g.a();
            bi.d();
            bd.field_i[qd.field_e][b.field_q].b(10, 10);
            var2_int = 0;
            L1: while (true) {
              if (3 <= var2_int) {
                L2: {
                  bd.field_i[qd.field_e][b.field_q].d(10, 10, 0);
                  bi.h(2, 2, 0, 0, qn.field_g.field_w, qn.field_g.field_t);
                  cn.field_f.b(-115);
                  rk.field_a = 3 * sn.field_f.length >> 416263970;
                  if (param1 < -25) {
                    break L2;
                  } else {
                    ub.c((byte) 111);
                    break L2;
                  }
                }
                break L0;
              } else {
                so.a(16777045);
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "ub.L(" + param0 + ',' + param1 + ')');
        }
    }

    final int j(int param0) {
        boolean discarded$0 = false;
        if (param0 >= -73) {
            discarded$0 = this.k(123);
        }
        return this.field_q / 50;
    }

    final void a(boolean param0, byte param1) {
        this.field_l = param0 ? true : false;
        if (param1 != -13) {
            return;
        }
        if (param0) {
            this.c(-127);
        }
    }

    final static va a(int param0, int param1) {
        int var3 = 0;
        va var4 = null;
        int var5 = ZombieDawn.field_J;
        va[] var6 = pa.field_x;
        va[] var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
            var4 = var6[var3];
            if (!(var4.field_e != (param1 & 127))) {
                return var4;
            }
        }
        if (param0 == 127) {
            return null;
        }
        field_j = (String) null;
        return null;
    }

    final void c(int param0, boolean param1) {
        if (param0 != 0) {
            return;
        }
        this.field_e = param1 ? true : false;
        if (!(!param1)) {
            this.field_b = 0;
            this.f(param0 ^ 6);
        }
    }

    private final void a(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = -1;
        if (this.field_p == 1.0f) {
            si.field_Ub[5].a();
            bi.d();
            this.field_o.b(this.h(31214), -5 + bi.field_f, this.field_o.field_I + 5, 0, var2);
        } else {
            pl.field_p.a();
            bi.d();
            this.field_o.b(this.h(31214), -5 + bi.field_f, 5 + this.field_o.field_I, 2, var2);
            var3 = (int)(this.field_p * (float)bi.field_f);
            var4 = (int)((float)bi.field_a * this.field_p);
            si.field_Ub[5].a();
            bi.d();
            pl.field_p.a(bi.field_f - var3, 0, var3, var4);
        }
        vh.field_e[5].a();
        bi.d();
        si.field_Ub[5].h(0, 0, 16777215);
        oc.a((byte) 50);
        si.field_Ub[5].h(0, param0, 0);
    }

    private final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          var4 = ZombieDawn.field_J;
          si.field_Ub[2].a();
          bi.d();
          if (this.field_s) {
            var2 = dj.field_e.field_hb;
            break L0;
          } else {
            if (!this.field_g) {
              var2 = dj.field_e.field_P;
              break L0;
            } else {
              var2 = dj.field_e.field_nb;
              break L0;
            }
          }
        }
        L1: {
          if (!this.field_s) {
            stackOut_7_0 = dj.field_e.field_f;
            stackIn_8_0 = stackOut_7_0;
            break L1;
          } else {
            stackOut_6_0 = 2;
            stackIn_8_0 = stackOut_6_0;
            break L1;
          }
        }
        L2: {
          L3: {
            var3 = stackIn_8_0;
            if (this.field_l) {
              break L3;
            } else {
              if (!this.field_g) {
                if (-100 <= (var3 ^ -1)) {
                  this.field_o.c(var2 + "/" + var3, 20, 2 * this.field_o.field_I + -3, 2, 65793);
                  break L2;
                } else {
                  this.field_o.c("/" + var3, 22, this.field_o.field_I * 2 - -6, 2, 65793);
                  this.field_o.c(Integer.toString(var2), 15, 6 + this.field_o.field_I, 2, 65793);
                  break L2;
                }
              } else {
                break L3;
              }
            }
          }
          this.field_o.c(Integer.toString(var2), 20, this.field_o.field_I * 2 - 3, 2, 65793);
          break L2;
        }
        L4: {
          vh.field_e[2].a();
          bi.d();
          si.field_Ub[2].h(0, 0, 16777215);
          oc.a((byte) -65);
          if (param0 < -20) {
            break L4;
          } else {
            this.field_k = 119;
            break L4;
          }
        }
        si.field_Ub[2].h(0, 0, 0);
    }

    private final void d(int param0, int param1) {
        si.field_Ub[4].a();
        bi.d();
        this.field_o.b(this.b(param0 + -73, param1), -5 + bi.field_f, 5 + this.field_o.field_I, param0, -1);
        vh.field_e[4].a();
        bi.d();
        si.field_Ub[4].h(0, 0, 16777215);
        oc.a((byte) -78);
        si.field_Ub[4].h(0, 0, 0);
    }

    final void d(byte param0) {
        le var2 = null;
        int var3 = 0;
        var3 = ZombieDawn.field_J;
        this.field_k = 0;
        var2 = dj.field_e.field_R.b((byte) 26);
        k.field_t = 0;
        L0: while (true) {
          if (!(var2 instanceof fb)) {
            k.field_t = k.field_t - dj.field_e.field_db;
            if (param0 == -106) {
              L1: {
                this.c(-58);
                this.e(param0 + 106);
                if (this.field_e) {
                  this.f(6);
                  break L1;
                } else {
                  if (!this.field_g) {
                    break L1;
                  } else {
                    this.f(6);
                    break L1;
                  }
                }
              }
              L2: {
                cn.field_f.b(-117);
                if (this.field_s) {
                  break L2;
                } else {
                  if (this.field_e) {
                    break L2;
                  } else {
                    if (this.field_g) {
                      break L2;
                    } else {
                      if (dj.field_e.field_f <= dj.field_e.field_P + k.field_t) {
                        break L2;
                      } else {
                        ck.a(-11, param0 ^ -6878);
                        break L2;
                      }
                    }
                  }
                }
              }
              return;
            } else {
              return;
            }
          } else {
            L3: {
              L4: {
                if (!(var2 instanceof kd)) {
                  break L4;
                } else {
                  if (((kd) ((Object) var2)).i((byte) -126)) {
                    this.field_k = this.field_k + 1;
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if (!(var2 instanceof ah)) {
                break L3;
              } else {
                L5: {
                  if (!this.field_s) {
                    break L5;
                  } else {
                    if (28 != ((ah) ((Object) var2)).field_t) {
                      break L3;
                    } else {
                      break L5;
                    }
                  }
                }
                if ((((ah) ((Object) var2)).field_F ^ -1) == -19) {
                  break L3;
                } else {
                  if (19 == ((ah) ((Object) var2)).field_t) {
                    break L3;
                  } else {
                    if (((ah) ((Object) var2)).field_J) {
                      break L3;
                    } else {
                      k.field_t = k.field_t + 1;
                      break L3;
                    }
                  }
                }
              }
            }
            var2 = var2.field_b;
            continue L0;
          }
        }
    }

    final void d(int param0) {
        boolean discarded$0 = false;
        this.field_c = false;
        if (param0 != 0) {
            discarded$0 = this.b(false);
        }
    }

    final boolean k(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 16284) {
            break L0;
          } else {
            this.d(-57, -1);
            break L0;
          }
        }
        L1: {
          L2: {
            if (!this.field_c) {
              break L2;
            } else {
              if (-1 > (this.field_a ^ -1)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final void b(int param0, boolean param1) {
        this.field_g = param1 ? true : false;
        if (param0 != 10) {
            return;
        }
        if (!(!param1)) {
            this.f(6);
            this.field_c = true;
        }
    }

    final void i(int param0) {
        if (!((this.field_r ^ -1) <= -321)) {
            this.field_r = this.field_r + 1;
        }
        if (param0 != 16777215) {
            this.field_g = true;
        }
    }

    final boolean g(int param0) {
        if (param0 != 16954) {
            this.c(-109, 76);
        }
        return -1 <= (this.field_k ^ -1) ? true : false;
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (!this.field_i) {
          L0: {
            if (this.field_c) {
              var2 = -210 + bd.field_e;
              so.a(vh.field_e[5], var2, 40);
              si.field_Ub[5].b(var2, 40);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            var2 = -310 + bd.field_e;
            so.a(vh.field_e[4], var2, 0);
            si.field_Ub[4].b(var2, 0);
            if (param0 < -59) {
              break L1;
            } else {
              this.c(54, 36);
              break L1;
            }
          }
          L2: {
            L3: {
              if (this.field_e) {
                break L3;
              } else {
                if (this.field_g) {
                  break L3;
                } else {
                  var2 = -70 + nh.field_P;
                  so.a(vh.field_e[0], 0, var2);
                  si.field_Ub[0].b(5, 5 + var2);
                  var2 = nh.field_P - 80;
                  so.a(vh.field_e[2], 70, var2);
                  si.field_Ub[2].b(70, var2);
                  var2 = nh.field_P + -68;
                  var3 = -48 + bd.field_e;
                  so.a(vh.field_e[1], var3, var2);
                  var3 -= 35;
                  si.field_Ub[1].b(var3, var2 + 5);
                  var3 = -170 + bd.field_e;
                  var2 = -55 + nh.field_P;
                  so.a(vh.field_e[3], var3, var2);
                  si.field_Ub[3].b(var3, var2);
                  break L2;
                }
              }
            }
            si.field_Ub[6].b(220 + vh.field_b, -55 + nh.field_P);
            so.a(vh.field_e[6], vh.field_b - -220, -55 + nh.field_P);
            break L2;
          }
          return;
        } else {
          var2 = id.field_M - -this.field_n;
          bi.b(0, 0, bd.field_e, var2, 0);
          var2++;
          bi.b(0, -var2 + nh.field_P, bd.field_e, var2, 0);
          return;
        }
    }

    final static void b(byte param0) {
        va discarded$0 = null;
        if (param0 < 43) {
            discarded$0 = ub.a(124, 35);
        }
        jm.a((String) null, to.field_d, -901373652);
    }

    private final String b(int param0, int param1) {
        String var5 = qi.a(true, 0, jp.field_a, (long)param1, (byte) 113);
        String var3 = var5;
        int var4 = 107 % ((-8 - param0) / 33);
        return s.a(1938762664, jp.field_i, new String[]{var5});
    }

    final boolean b(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (!this.field_s) {
          L0: {
            if (param0) {
              break L0;
            } else {
              this.f(-118);
              break L0;
            }
          }
          L1: {
            L2: {
              if (dj.field_e.field_P < dj.field_e.field_f) {
                break L2;
              } else {
                if (this.field_l) {
                  break L2;
                } else {
                  if (this.field_g) {
                    break L2;
                  } else {
                    stackOut_10_0 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    break L1;
                  }
                }
              }
            }
            stackOut_11_0 = 0;
            stackIn_12_0 = stackOut_11_0;
            break L1;
          }
          return stackIn_12_0 != 0;
        } else {
          L3: {
            if (0 != k.field_t) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L3;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L3;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(int param0, boolean param1) {
        if (param0 != 49) {
            ub.a(110, (byte) 53);
        }
        this.field_s = param1 ? true : false;
        if (param1) {
            this.d((byte) -106);
            this.c(-53);
        }
    }

    final void l(int param0) {
        this.field_a = param0;
    }

    final int a(byte param0) {
        int var2 = -41 % ((2 - param0) / 45);
        return !this.field_c ? -1 : this.field_a / 50;
    }

    private final void f(int param0) {
        ki.a((byte) -103, si.field_Ub[param0]);
        bi.d();
        String var2 = "";
        if (this.field_e) {
            var2 = s.a(1938762664, li.field_f, new String[]{Integer.toString(this.field_b), Integer.toString(this.field_k - -this.field_b)});
            this.field_o.a(var2, bi.field_f / 2, 5 + this.field_o.field_I, 2, 65793);
        } else {
            var2 = kn.field_I + " " + Integer.toString(dj.field_e.field_nb);
            bj.field_q.a(var2, bi.field_f / 2, 5 + this.field_o.field_I, 16777088, 65793);
        }
        pa.a(-21189);
        ki.a((byte) -93, vh.field_e[6]);
        bi.d();
        si.field_Ub[6].h(0, 0, 16777215);
        oc.a((byte) -104);
        si.field_Ub[6].h(0, 0, 0);
        pa.a(-21189);
    }

    private final void e(int param0) {
        si.field_Ub[3].a();
        bi.d();
        this.field_o.b(Integer.toString(this.field_k), -5 + bi.field_f, this.field_o.field_I + 5, 1, 65793);
        vh.field_e[3].a();
        bi.d();
        si.field_Ub[3].h(0, 0, 16777215);
        oc.a((byte) -83);
        si.field_Ub[3].h(param0, 0, 0);
    }

    final void a(boolean param0, boolean param1) {
        if (!param0) {
            return;
        }
        this.field_i = param1 ? true : false;
        if (!(!param1)) {
            this.field_r = 80;
            this.field_n = 0;
            this.field_c = false;
        }
    }

    final void c(int param0, int param1) {
        fn discarded$2 = null;
        fn discarded$3 = null;
        L0: {
          if (this.field_i) {
            if (this.field_n >= this.field_r) {
              if (this.field_r < this.field_n) {
                this.field_n = this.field_r;
                break L0;
              } else {
                break L0;
              }
            } else {
              this.field_n = this.field_n + 1;
              break L0;
            }
          } else {
            break L0;
          }
        }
        L1: {
          if (!this.field_c) {
            break L1;
          } else {
            if (this.b(true)) {
              break L1;
            } else {
              if (this.g(16954)) {
                break L1;
              } else {
                if (this.k(16284)) {
                  break L1;
                } else {
                  this.field_a = this.field_a - 1;
                  break L1;
                }
              }
            }
          }
        }
        L2: {
          this.field_q = this.field_q + 1;
          if (1.0f != this.field_p) {
            this.field_p = this.field_p + -0.029999999329447746f;
            if (this.field_p <= 1.0f) {
              this.field_p = 1.0f;
              break L2;
            } else {
              break L2;
            }
          } else {
            break L2;
          }
        }
        L3: {
          if (this.field_a <= param1) {
            if ((this.field_a ^ -1) >= -1) {
              break L3;
            } else {
              if (-551 > (this.field_a ^ -1)) {
                break L3;
              } else {
                if ((this.field_a % 50 ^ -1) != -50) {
                  break L3;
                } else {
                  this.field_p = 2.0f;
                  discarded$2 = kh.a(47, false);
                  break L3;
                }
              }
            }
          } else {
            if ((this.field_a ^ -1) >= -1) {
              break L3;
            } else {
              if (-551 > (this.field_a ^ -1)) {
                break L3;
              } else {
                if ((this.field_a % 50 ^ -1) != -50) {
                  break L3;
                } else {
                  this.field_p = 2.0f;
                  discarded$3 = kh.a(47, false);
                  break L3;
                }
              }
            }
          }
        }
        L4: {
          if (!this.field_c) {
            break L4;
          } else {
            if (1.0f < this.field_p) {
              this.a(0);
              break L4;
            } else {
              if (-50 != (this.field_a % 50 ^ -1)) {
                break L4;
              } else {
                this.a(0);
                break L4;
              }
            }
          }
        }
        L5: {
          if (param0 != this.field_m) {
            this.d(3, param0);
            this.field_m = param0;
            break L5;
          } else {
            break L5;
          }
        }
        cn.field_f.b(124);
    }

    ub(int param0) {
        this.field_n = 0;
        this.field_b = 0;
        this.field_l = false;
        this.field_q = 0;
        this.field_m = 0;
        this.field_k = 0;
        this.field_c = true;
        this.field_e = false;
        this.field_p = 1.0f;
        this.field_i = false;
        this.field_s = false;
        this.field_a = 0;
        this.field_g = false;
        this.field_r = 80;
        this.field_a = param0;
        this.field_q = 0;
        this.field_o = sg.field_jb;
        this.a(0);
        this.d(3, this.field_m);
        this.d((byte) -106);
        cn.field_f.b(-123);
    }

    static {
        field_h = "BREACH";
        field_j = "to return to the normal view.";
    }
}
