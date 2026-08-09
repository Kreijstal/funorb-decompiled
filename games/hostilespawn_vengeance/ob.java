/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends ql {
    private v field_k;
    private oc[] field_r;
    private v field_i;
    private v field_v;
    private v field_H;
    private oc field_l;
    private v field_t;
    private oc field_h;
    private oc field_g;
    private oc field_o;
    private v field_d;
    private oc field_A;
    private v field_D;
    private v field_q;
    private v field_y;
    private oj field_x;
    private oc field_u;
    private oc field_z;
    private v field_p;
    private int field_f;
    private v field_w;
    private oc field_j;
    static vi field_s;
    static bd field_C;
    private oc field_G;
    static boolean field_n;
    private v field_m;
    private oc field_F;
    static int[] field_e;
    static String field_E;
    static pg[] field_B;

    final void c(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = HostileSpawn.field_I ? 1 : 0;
        var2 = 0;
        var3 = param0;
        L0: while (true) {
          L1: {
            if (var3 >= el.field_j) {
              break L1;
            } else {
              if (mm.field_m[var3] != null) {
                if ((mm.field_m[var3].field_i ^ -1) == -28) {
                  var2 = 1;
                  break L1;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            }
          }
          L2: {
            if (var2 == 0) {
              ti.a(229, (byte) -118, 26);
              break L2;
            } else {
              break L2;
            }
          }
          return;
        }
    }

    final void d(int param0) {
        int var3;
        oc var4;
        L0: {
          var3 = HostileSpawn.field_I ? 1 : 0;
          var4 = mm.field_m[0].field_j;
          if (0 == this.field_D.field_a) {
            if (kh.field_Q[5]) {
              this.field_D.field_a = 2;
              break L0;
            } else {
              if ((ih.a(var4, (byte) -97, this.field_l) ^ -1) > -3) {
                this.field_D.field_a = 1;
                break L0;
              } else {
                break L0;
              }
            }
          } else {
            break L0;
          }
        }
        L1: {
          if (null == this.field_x) {
            break L1;
          } else {
            if ((this.field_x.field_I ^ -1) >= -1) {
              this.field_D.field_a = 2;
              this.field_x = null;
              this.field_H.field_a = 2;
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if ((this.field_H.field_a ^ -1) == param0) {
            if (!kh.field_Q[5]) {
              break L2;
            } else {
              this.field_H.field_a = 1;
              break L2;
            }
          } else {
            break L2;
          }
        }
        L3: {
          if (-1 == (this.field_q.field_a ^ -1)) {
            if ((ih.a(var4, (byte) -117, this.field_F) ^ -1) > -3) {
              this.field_q.field_a = 1;
              break L3;
            } else {
              break L3;
            }
          } else {
            break L3;
          }
        }
        L4: {
          if (this.field_v.field_a != 0) {
            break L4;
          } else {
            if ((ih.a(var4, (byte) -76, this.field_j) ^ -1) <= -3) {
              break L4;
            } else {
              this.field_v.field_a = 1;
              break L4;
            }
          }
        }
        L5: {
          if (this.field_m.field_a == 0) {
            if ((ih.a(var4, (byte) -97, this.field_z) ^ -1) > -3) {
              this.field_m.field_a = 1;
              break L5;
            } else {
              break L5;
            }
          } else {
            break L5;
          }
        }
        L6: {
          if (this.field_t.field_a != 0) {
            break L6;
          } else {
            if (2 <= ih.a(var4, (byte) -125, this.field_u)) {
              break L6;
            } else {
              L7: {
                this.field_t.field_a = 1;
                this.field_p.field_a = 1;
                if (kh.field_Q[5]) {
                  break L7;
                } else {
                  if (!kh.field_Q[7]) {
                    this.field_t.field_a = 2;
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              this.field_p.field_a = 2;
              break L6;
            }
          }
        }
        L8: {
          if (-1 == (this.field_w.field_a ^ -1)) {
            if (-3 >= (ih.a(var4, (byte) -73, this.field_g) ^ -1)) {
              break L8;
            } else {
              this.field_w.field_a = 1;
              break L8;
            }
          } else {
            break L8;
          }
        }
        L9: {
          if (this.field_k.field_a == 0) {
            if (2 > ih.a(var4, (byte) -127, this.field_r[0])) {
              this.field_k.field_a = 1;
              this.field_k.field_d = this.field_r[0].field_g * 24;
              this.field_k.field_l = 24 * (this.field_r[0].field_e + 2);
              break L9;
            } else {
              if (2 <= ih.a(var4, (byte) -107, this.field_r[1])) {
                break L9;
              } else {
                this.field_k.field_l = -this.field_k.field_m + 24 * (-2 + this.field_r[1].field_e);
                this.field_k.field_a = 1;
                this.field_k.field_d = (this.field_r[1].field_g - 2) * 24 - this.field_k.field_h;
                break L9;
              }
            }
          } else {
            break L9;
          }
        }
        L10: {
          if (-1 != (this.field_i.field_a ^ -1)) {
            break L10;
          } else {
            if (2 > ih.a(var4, (byte) -110, this.field_G)) {
              this.field_i.field_a = 1;
              break L10;
            } else {
              break L10;
            }
          }
        }
        L11: {
          if (this.field_y.field_a == 0) {
            if ((ih.a(var4, (byte) -88, this.field_h) ^ -1) > -3) {
              this.field_y.field_a = 1;
              break L11;
            } else {
              break L11;
            }
          } else {
            break L11;
          }
        }
        L12: {
          if ((ng.field_u & 15) != 0) {
            break L12;
          } else {
            if (null != this.field_x) {
              this.a(this.field_A, -1);
              break L12;
            } else {
              break L12;
            }
          }
        }
        super.d(param0 ^ 0);
    }

    final static int c(byte param0) {
        if (param0 > -19) {
            field_s = (vi) null;
            return 1;
        }
        return 1;
    }

    final void a(int param0, oj param1) {
        int var4 = 0;
        oc var5 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_f = this.field_f - 1;
              if (-2 == (this.field_f ^ -1)) {
                var5 = mm.field_m[0].field_j;
                this.field_d.field_a = 1;
                if ((var5.field_g ^ -1) > -41) {
                  this.field_d.field_l = 1968;
                  this.field_d.field_d = 552;
                  break L1;
                } else {
                  if (var5.field_e < 48) {
                    this.field_d.field_l = 360;
                    this.field_d.field_d = 1536;
                    break L1;
                  } else {
                    this.field_d.field_l = 1776;
                    this.field_d.field_d = 2136;
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (-1 == (this.field_f ^ -1)) {
                r.field_a = 0;
                le.field_D = 500;
                tb.field_N = le.field_D;
                break L2;
              } else {
                r.field_a = 1;
                pm.field_d = pm.field_d - 7;
                tb.field_N = 150;
                break L2;
              }
            }
            var3_int = -76 % ((23 - param0) / 32);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("ob.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    final void e(int param0) {
        int[] var2;
        int var3;
        int var4;
        int[] var5;
        int[] var7;
        int[] var8;
        int var6;
        L0: {
          var4 = HostileSpawn.field_I ? 1 : 0;
          this.field_f = 3;
          var8 = ln.field_a.field_v;
          var7 = var8;
          var5 = var7;
          var2 = var5;
          this.field_o = new oc(var8[2], var8[3]);
          this.field_l = new oc(var8[4], var8[5]);
          this.field_F = new oc(var8[10], var8[11]);
          this.field_j = new oc(var8[16], var8[17]);
          this.field_z = new oc(var8[12], var8[13]);
          this.field_g = new oc(var8[18], var8[19]);
          this.field_G = new oc(var8[14], var8[15]);
          this.field_h = new oc(var8[22], var8[23]);
          this.field_u = new oc(var8[24], var8[25]);
          this.field_r[0] = new oc(var8[28], var8[29]);
          this.field_r[1] = new oc(var8[30], var8[31]);
          this.field_D = new v(td.field_p, 48 + 24 * this.field_l.field_e, -20 + 24 * (this.field_l.field_g + -3));
          this.field_H = new v(sa.field_e, 24 * var8[6], -30 + (-96 + var8[7] * 24), 150);
          this.field_q = new v(sa.field_b, 0, 48 + 24 * this.field_F.field_g);
          this.field_q.field_l = -this.field_q.field_m + (this.field_F.field_e - 3) * 24;
          this.field_v = new v(u.field_b, 24 * this.field_j.field_e + -24, 48 + this.field_j.field_g * 24);
          this.field_m = new v(bj.field_h, this.field_z.field_e * 24, -96 + this.field_z.field_g * 24 - 30);
          this.field_t = new v(ui.field_f, 0, this.field_u.field_g * 24);
          this.field_t.field_l = 48 + 24 * this.field_u.field_e;
          this.field_p = new v(m.field_p, 0, this.field_u.field_g * 24);
          this.field_p.field_l = (2 + this.field_u.field_e) * 24;
          this.field_w = new v(m.field_j, this.field_g.field_e * 24, 24 * this.field_g.field_g - 102);
          this.field_k = new v(bi.field_e, 0, 0);
          this.field_i = new v(eg.field_p, 0, 24 * (this.field_G.field_g - -2));
          this.field_i.field_l = 24 * (this.field_G.field_e - -2);
          this.field_y = new v(qa.field_a, 0, (this.field_h.field_g - -2) * 24);
          this.field_y.field_l = 48 + 24 * this.field_h.field_e;
          if (kh.field_Q[5]) {
            this.field_D.field_a = 2;
            this.field_H.field_a = 2;
            break L0;
          } else {
            break L0;
          }
        }
        this.field_A = new oc();
        var3 = 0;
        L1: while (true) {
          L2: {
            if (ll.field_a <= var3) {
              break L2;
            } else {
              if (wh.field_b[var3] != null) {
                if (wh.field_b[var3].field_i == 0) {
                  if (wh.field_b[var3].field_h == 4) {
                    this.field_A.a((byte) 46, wh.field_b[var3].field_j);
                    break L2;
                  } else {
                    var3++;
                    continue L1;
                  }
                } else {
                  var3++;
                  continue L1;
                }
              } else {
                var3++;
                continue L1;
              }
            }
          }
          var6 = 0;
          var3 = var6;
          L3: while (true) {
            L4: {
              if (el.field_j <= var6) {
                break L4;
              } else {
                if (null != mm.field_m[var6]) {
                  if ((mm.field_m[var6].field_i ^ -1) == -21) {
                    if (-9 < (ih.a(mm.field_m[var6].field_j, (byte) -87, this.field_l) ^ -1)) {
                      this.field_x = mm.field_m[var6];
                      break L4;
                    } else {
                      var6++;
                      continue L3;
                    }
                  } else {
                    var6++;
                    continue L3;
                  }
                } else {
                  var6++;
                  continue L3;
                }
              }
            }
            this.field_d = new v(e.field_k, 0, 0);
            kd.a(param0, param0 ^ 1);
            nh.field_E.a((byte) 46, this.field_o);
            return;
          }
        }
    }

    final void b(byte param0) {
        int var3;
        oc var4;
        L0: {
          var3 = -77 % ((param0 - -48) / 38);
          var4 = mm.field_m[0].field_j;
          this.field_D.e(-115);
          this.field_H.e(-114);
          if (-2 == (this.field_H.field_a ^ -1)) {
            L1: {
              if (this.field_H.field_d - -this.field_H.field_h >= 24 * var4.field_g) {
                this.field_H.field_a = 2;
                break L1;
              } else {
                break L1;
              }
            }
            this.field_q.e(-126);
            if ((this.field_q.field_a ^ -1) != -2) {
              break L0;
            } else {
              if (this.field_q.field_l + this.field_q.field_m <= 24 * var4.field_e) {
                break L0;
              } else {
                this.field_q.field_a = 2;
                break L0;
              }
            }
          } else {
            this.field_q.e(-126);
            if ((this.field_q.field_a ^ -1) != -2) {
              break L0;
            } else {
              if (this.field_q.field_l + this.field_q.field_m <= 24 * var4.field_e) {
                break L0;
              } else {
                this.field_q.field_a = 2;
                break L0;
              }
            }
          }
        }
        this.field_v.e(-119);
        this.field_i.e(-114);
        this.field_y.e(-111);
        this.field_m.e(-127);
        this.field_t.e(-128);
        this.field_p.e(-107);
        this.field_w.e(-106);
        this.field_k.e(-120);
        this.field_d.e(-125);
    }

    public static void d(byte param0) {
        field_s = null;
        field_C = null;
        field_e = null;
        if (param0 > -80) {
            field_B = (pg[]) null;
        }
        field_B = null;
        field_E = null;
    }

    final String a(boolean param0) {
        if (param0) {
            field_e = (int[]) null;
        }
        return bj.field_i;
    }

    public ob() {
        this.field_r = new oc[2];
    }

    static {
        field_s = new vi(256);
        field_e = new int[]{24, 27, 5};
        field_E = "Achievements";
    }
}
