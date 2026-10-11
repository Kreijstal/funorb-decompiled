/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg extends qh {
    int field_n;
    static long field_C;
    int field_x;
    static String field_t;
    o field_q;
    private int field_m;
    int field_o;
    int field_w;
    int field_z;
    static int field_v;
    int field_p;
    int field_A;
    static kl field_u;
    int field_r;
    int field_s;
    int field_B;
    int field_y;

    private final void a(int param0, int param1, boolean param2, String param3, int param4) {
        jj.field_b.b(param3, -1 + param1, param4, 0, -1);
        jj.field_b.b(param3, param1 + 1, param4, 0, -1);
        jj.field_b.b(param3, param1, -1 + param4, 0, -1);
        jj.field_b.b(param3, param1, 1 + param4, 0, -1);
        if (!param2) {
          return;
        }
        try {
          jj.field_b.b(param3, param1, param4, param0, -1);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "eg.CA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    private final void a(boolean param0, int param1, tg param2) {
        int var6 = 0;
        Object stackIn_88_0 = null;
        int stackIn_89_1 = 0;
        int stackIn_94_0 = 0;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_101_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object var7 = null;
        int var8 = 0;
        int var4_intLifetime1;
        int var4_intLifetime2;
        var8 = wizardrun.field_H;
        try {
          this.field_h = this.field_m;
          if (param1 != 120) {
            return;
          }
          this.a(20, tl.field_a, pk.field_s, si.field_j, (byte) -15, param2);
          this.field_o = 6;
          this.field_w = this.field_w + 1;
          if (param0) {
            if (this.field_n < 31) {
              this.field_n = 31;
            }
            if (this.field_n > 34) {
              this.field_n = 31;
            }
            this.field_z = this.field_z + 1;
            if (5 < this.field_z) {
              this.field_z = 0;
              if (this.field_n < 34) {
                this.field_n = this.field_n + 1;
              }
            }
          } else {
            this.field_n = 31;
            if (0 > this.field_e) {
              this.field_n = 32;
            }
          }
          if (!(this.field_i.field_a >= -2) ||
            !(0 <= this.field_i.field_b) ||
            !(20 >= this.field_i.field_b) ||
            !(this.field_e > -30) ||
            this.field_k == 1) {
            if (1 == this.field_k) {
              this.field_i.field_b = (int)(Math.random() * 18.0) + 1;
              this.field_i.field_a = 17;
              this.field_k = 0;
            } else {
              if (this.field_i.field_a < -2) {
                this.field_i.field_a = 17;
              }
            }
            this.field_o = 0;
            if (param0) {
              for (var4_int = 0; 1000 > var4_int; var4_int++) {
                if (null != ii.field_e[var4_int] &&
                  ii.field_e[var4_int].field_B > 2 &&
                  21 != ii.field_e[var4_int].field_B &&
                  ii.field_e[var4_int].field_B != 20) {
                  ii.field_e[var4_int].field_p = 0;
                }
              }
              for (var4_intLifetime1 = 0; var4_intLifetime1 < 300; var4_intLifetime1++) {
                if (param2.field_d[var4_intLifetime1]) {
                  param2.field_d[var4_intLifetime1] = false;
                }
              }
              var4_intLifetime2 = 0;
              var5 = 6;
              if (this.field_B == 12) {
                var5 = 10;
                var4_intLifetime2 = 1;
              }
              if (17 == this.field_B) {
                var5 = 10;
                var4_intLifetime2 = 2;
              }
              if (26 == this.field_B) {
                var5 = 10;
                var4_intLifetime2 = 3;
              }
              if (this.field_B == 33) {
                var5 = 10;
                var4_intLifetime2 = 4;
              }
              if (this.field_B == 40) {
                var4_intLifetime2 = 5;
                var5 = 20;
                if (!da.field_g) {
                  ql.a(1, 245, 10);
                }
              }
              for (var6 = 0; var6 < var5; var6++) {
                var7 = this;
                if (var6 != 0) {
                  ii.field_e[od.field_k].a(param1 + 9027, 21, new ob(this.field_i));
                  var7 = ii.field_e[od.field_k];
                  od.field_k = od.field_k + 1;
                }
                ((eg) (var7)).a(9147, 21, this.field_i);
                ((eg) (var7)).field_f.a(param1 - 246, this.field_f);
                ((eg) (var7)).field_f.field_b = ((eg) (var7)).field_f.field_b + (int)(Math.sin(6.28 * (double)var6 / (double)var5) * 64.0);
                ((eg) (var7)).field_f.field_a = ((eg) (var7)).field_f.field_a + (int)(64.0 * Math.cos((double)var6 * 6.28 / (double)var5));
                ((eg) (var7)).field_e = 0;
                ((eg) (var7)).field_o = var4_intLifetime2;
                stackIn_88_0 = var7;
                if (var5 / 2 <= var6) {
                  stackIn_89_1 = 1;
                } else {
                  stackIn_89_1 = -1;
                }
                ((eg) (stackIn_88_0)).field_h = stackIn_89_1;
              }
              ra.a(2);
            } else if (this.field_B != 8 &&
              this.field_B != 36) {
              this.field_o = 0;
              if (this.field_d == 32) {
                this.field_o = 0;
              }
              if (this.field_d == 48) {
                this.field_o = 1;
              }
              if (64 == this.field_d) {
                this.field_o = 2;
              }
              if (80 == this.field_d) {
                this.field_o = 3;
              }
              if (this.field_d == 96) {
                this.field_o = 5;
              }
              if (1 < qh.field_l &&
                this.field_o < 5) {
                this.field_o = this.field_o + 1;
              }
              this.field_B = 21;
              if (3 < qh.field_l &&
                5 > this.field_o) {
                this.field_o = this.field_o + 1;
              }
              this.field_d = 32;
            } else {
              this.field_k = 1;
            }
            stackIn_94_0 = (pk.field_s) ? 0 : 1;
            if (stackIn_94_0 == 1) {
              return;
            }
            tl.field_a.a(si.field_j[6], 100, 256 * ee.field_p / 100);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_100_0 = var4;
          stackIn_100_1 = new StringBuilder().append("eg.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_101_2 = "null";
          } else {
            stackIn_101_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_100_0), ((StringBuilder) (Object) stackIn_100_1).append(stackIn_101_2).append(')').toString());
        }
    }

    private final void d(int param0) {
        boolean discarded$0 = false;
        nj.field_r = nj.field_r - 1;
        if (param0 != -1569) {
          tg var3 = (tg) null;
          discarded$0 = this.a(false, (tg) null, 6);
        }
        if (!(155 < nj.field_r)) {
          ql.a(param0 ^ -1570, 244, 11);
        }
    }

    public static void a(int param0) {
        field_t = null;
        int var1 = -76 / ((param0 - 4) / 50);
        field_u = null;
    }

    private final void b(int param0) {
        boolean stackIn_34_0 = false;
        ob var3;
        ob var4;
        ob var5;
        var4 = new ob();
        var5 = var4;
        var3 = new ob();
        var5.field_a = this.field_A;
        var4.field_b = this.field_y;
        var3.field_b = ii.field_e[0].field_y;
        var3.field_a = ii.field_e[0].field_A;
        if (param0 != 5) {
          this.d(69);
        }
        if (ii.field_e[0].field_s == 0 &&
          this.field_q != null &&
          null != ii.field_e[0].field_q &&
          j.a(this.field_q, var5.field_b, var4.field_a, ii.field_e[0].field_q, var3.field_b, var3.field_a)) {
          if (this.field_B == 21) {
            if (this.field_o == 0) {
              hi.field_c = hi.field_c + 640;
              sg.field_f = sg.field_f + 10;
              if (qh.field_l == 5 &&
                ve.a((byte) 110, 0)) {
                this.d(-1569);
              }
            }
            if (this.field_o == 1) {
              sg.field_f = sg.field_f + 25;
              wg.field_b = wg.field_b + 1600;
            }
            if (this.field_o == 2) {
              me.field_f = me.field_f - 3200;
              sg.field_f = sg.field_f + 50;
              if (5 == qh.field_l &&
                ve.a((byte) 89, 0)) {
                this.d(param0 ^ -1574);
              }
            }
            if (this.field_o == 3) {
              sg.field_f = sg.field_f + 75;
              ic.field_a = ic.field_a - 4800;
            }
            if (this.field_o == 4) {
              sg.field_f = sg.field_f + 100;
              hi.field_c = hi.field_c + 6400;
            }
            if (this.field_o == 5) {
              wg.field_b = wg.field_b + 9600;
              sg.field_f = sg.field_f + 150;
            }
            if (6 == this.field_o) {
              me.field_f = me.field_f - 16000;
              sg.field_f = sg.field_f + 250;
            }
            if (this.field_o == 7) {
              ic.field_a = ic.field_a - 32000;
              sg.field_f = sg.field_f + 500;
            }
            stackIn_34_0 = !(pk.field_s);
            if (!stackIn_34_0) {
              tl.field_a.a(si.field_j[7], 100, ee.field_p * 256 / 100);
            }
            this.field_w = 0;
            this.field_B = 44;
          } else {
            this.field_e = 40;
            this.field_r = 0;
            this.field_B = 21;
            this.field_o = 0;
            if (this.field_d == 32) {
              this.field_o = 0;
            }
            if (this.field_d == 48) {
              this.field_o = 1;
            }
            if (64 == this.field_d) {
              this.field_o = 2;
            }
            if (qh.field_l > 1 &&
              this.field_o < 5) {
              this.field_o = this.field_o + 1;
            }
            if (3 < qh.field_l &&
              this.field_o < 5) {
              this.field_o = this.field_o + 1;
            }
            this.field_d = 32;
            this.field_o = this.field_o + 1;
            this.field_p = 0;
            if (pk.field_s) {
              tl.field_a.a(si.field_j[6], 100, 256 * ee.field_p / 100);
            }
          }
        }
    }

    final void d(boolean param0) {
        int var13 = 0;
        int stackIn_87_1 = 0;
        int stackIn_90_1 = 0;
        int stackIn_103_1 = 0;
        int stackIn_115_1 = 0;
        int stackIn_125_1 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        double var6;
        int var8;
        int var9;
        int var10;
        int var11;
        double var11_double;
        int var12;
        int var14;
        int var15;
        var15 = wizardrun.field_H;
        this.field_q = null;
        var2 = 32 * this.field_f.field_b / 240 + 32 * this.field_i.field_b;
        var3 = 32 * (-1 + (15 - this.field_i.field_a)) - 32 * this.field_f.field_a / 240;
        var3 = var3 - (this.field_d - 32);
        if (!param0) {
          this.a(-46, -3, (byte) 15);
        }
        L1: {
          var11 = this.field_B;
          if (var11 != 0) {
            if (var11 == 1) {
              var5 = this.field_f.field_b + (240 * this.field_i.field_b + this.field_w);
              if (0 <= this.field_w &&
                this.field_w <= 10) {
                ob.field_c.a(12 + var2, var3 + 12, -87, 128, var5);
              }
              if (10 < this.field_w &&
                this.field_w <= 15) {
                ob.field_c.a(12 + var2, var3 + 12, -119, 112, var5);
              }
              if (this.field_w > 15 &&
                20 >= this.field_w) {
                ob.field_c.a(var2 + 12, var3 + 12, -96, 96, var5);
              }
              if (this.field_w > 20) {
                if (this.field_w <= 25) {
                  ob.field_c.a(12 + var2, var3 + 12, -106, 80, var5);
                }
                if (this.field_w > 25 &&
                  30 >= this.field_w) {
                  ob.field_c.a(12 + var2, 12 + var3, -121, 64, var5);
                }
              } else {
                if (this.field_w > 25 &&
                  30 >= this.field_w) {
                  ob.field_c.a(12 + var2, 12 + var3, -121, 64, var5);
                }
              }
              this.field_q = ob.field_c;
              this.field_A = var3;
              this.field_y = var2;
            } else {
              if (var11 == 2) {
                for (var11 = 0; 10 > var11; var11++) {
                  var6 = 6.28 * (double)var11 / 10.0 + (double)this.field_w;
                  ob.field_c.d(-6 + (var2 + (int)(32.0 * Math.cos(var6) + 32.0)), -6 + (var3 + (int)(32.0 + 32.0 * Math.sin(var6))), 12, 12, 255 - 10 * var11);
                }
                this.field_A = var3;
                this.field_y = var2;
                this.field_q = ec.field_b;
              } else {
                switch (var11) {
                  case 3:
                    this.a(32, 0, (byte) 62);
                    break;
                  case 4:
                    this.a(32, 1, (byte) 62);
                    break;
                  case 5:
                    this.a(40, 2, (byte) 62);
                    break;
                  default:
                    switch (var11) {
                      case 6:
                        this.a(40, 4, (byte) 62);
                        break;
                      case 7:
                        this.a(40, 0, (byte) 62);
                        break;
                      case 8:
                        this.a(32, 1, (byte) 62);
                        break;
                      case 9:
                        this.a(32, 2, (byte) 62);
                        break;
                      case 10:
                        this.a(40, 3, (byte) 62);
                        break;
                      case 11:
                        if (this.field_h != -1) {
                          oc.field_b[3][29].d(var2, var3);
                          this.field_q = oc.field_b[3][29].c();
                          this.field_A = var3;
                          this.field_y = var2;
                          break;
                        }
                        oc.field_b[3][29].e(var2, var3);
                        this.field_y = var2;
                        this.field_A = var3;
                        this.field_q = oc.field_b[3][29];
                        break;
                      case 12:
                        this.field_h = -this.field_h;
                        this.a(40, 4, (byte) 62);
                        this.field_h = -this.field_h;
                        break;
                      case 13:
                        this.a(32, 0, (byte) 62);
                        break;
                      case 14:
                        this.field_h = -this.field_h;
                        this.a(40, 1, (byte) 62);
                        this.field_h = -this.field_h;
                        break;
                      case 15:
                        this.a(40, 2, (byte) 62);
                        break;
                      case 16:
                        this.a(40, 3, (byte) 62);
                        break;
                      case 17:
                        this.a(80, 4, (byte) 62);
                        break;
                      case 18:
                        if (this.field_n < 34) {
                          this.field_n = 34;
                        }
                        if (this.field_h == 1) {
                          oc.field_b[2][this.field_n].e(var2, var3);
                          this.field_q = oc.field_b[2][this.field_n];
                          this.field_y = var2;
                          this.field_A = var3;
                          break;
                        }
                        oc.field_b[2][this.field_n].d(var2 - 24, var3);
                        this.field_q = oc.field_b[2][this.field_n].c();
                        this.field_y = -24 + var2;
                        this.field_A = var3;
                        break;
                      case 19:
                        if (37 > this.field_n) {
                          this.field_n = 37;
                        }
                        if (this.field_h != 1) {
                          oc.field_b[3][this.field_n].d(var2, var3);
                          this.field_q = oc.field_b[3][this.field_n].c();
                          this.field_y = var2;
                          this.field_A = var3;
                          break;
                        }
                        oc.field_b[3][this.field_n].e(var2, var3);
                        this.field_q = oc.field_b[3][this.field_n];
                        this.field_A = var3;
                        this.field_y = var2;
                        break;
                      case 25:
                        if (this.field_n < 36) {
                          this.field_n = 36;
                        }
                        if (this.field_h != -1) {
                          oc.field_b[4][this.field_n].d(var2, var3);
                          this.field_q = oc.field_b[4][this.field_n].c();
                          this.field_A = var3;
                          this.field_y = var2;
                          break;
                        }
                        oc.field_b[4][this.field_n].e(var2, var3);
                        this.field_q = oc.field_b[4][this.field_n];
                        this.field_y = var2;
                        this.field_A = var3;
                        break;
                      default:
                        switch (var11) {
                          case 21:
                            if (0 > this.field_o) {
                              this.field_o = 0;
                            }
                            if (this.field_o > 7) {
                              this.field_o = 7;
                            }
                            if ((this.field_o == 0 ||
                              this.field_o == 2) &&
                              (qh.field_l == 5 &&
                              ve.a((byte) 123, 0))) {
                              jj.field_a[8].e(var2, var3);
                            } else {
                              jj.field_a[this.field_o].e(var2, var3);
                            }
                            this.field_q = jj.field_a[this.field_o];
                            this.field_y = var2;
                            this.field_A = var3;
                            break L1;
                          case 22:
                            this.a(40, 0, (byte) 62);
                            break L1;
                          case 23:
                            this.a(80, 1, (byte) 62);
                            break L1;
                          case 24:
                            this.a(40, 2, (byte) 62);
                            break L1;
                          case 26:
                            this.a(96, 4, (byte) 62);
                            break L1;
                          case 27:
                            oc.field_b[4][37].e(var2, var3);
                            this.field_A = var3;
                            this.field_y = var2;
                            this.field_q = oc.field_b[4][37];
                            break L1;
                          case 28:
                            oc.field_b[4][36].e(var2, var3);
                            this.field_y = var2;
                            this.field_q = oc.field_b[4][36];
                            this.field_A = var3;
                            break L1;
                          case 29:
                            this.a(40, 0, (byte) 62);
                            break L1;
                          case 30:
                            this.a(40, 1, (byte) 62);
                            break L1;
                          case 31:
                            this.a(56, 2, (byte) 62);
                            break L1;
                          case 32:
                            this.a(56, 3, (byte) 62);
                            break L1;
                          case 33:
                            this.field_h = -this.field_h;
                            this.a(56, 4, (byte) 62);
                            this.field_h = -this.field_h;
                            break L1;
                          case 34:
                            if (-1 != this.field_h) {
                              oc.field_b[0][37].d(var2, var3);
                              this.field_q = oc.field_b[0][37].c();
                              this.field_y = var2;
                              this.field_A = var3;
                              break L1;
                            }
                            oc.field_b[0][37].e(var2, var3);
                            this.field_q = oc.field_b[0][37];
                            this.field_y = var2;
                            this.field_A = var3;
                            break L1;
                          case 43:
                          case 36:
                          case 37:
                          case 38:
                          case 39:
                          case 40:
                          case 41:
                          case 44:
                          case 45:
                          default:
                            if (35 != var11 &&
                              var11 != 42) {
                              switch (var11) {
                                case 43:
                                  var9 = 37;
                                  if (this.field_w > 2) {
                                    var9 = 36;
                                  }
                                  if (20 < this.field_w) {
                                    var9 = 35;
                                  }
                                  if (this.field_h == 1) {
                                    oc.field_b[4][var9].e(var2, var3);
                                    this.field_q = oc.field_b[4][var9];
                                    this.field_y = var2;
                                    this.field_A = var3;
                                    break L1;
                                  }
                                  oc.field_b[4][var9].d(var2, var3);
                                  this.field_q = oc.field_b[4][var9].c();
                                  this.field_y = var2;
                                  this.field_A = var3;
                                  break L1;
                                case 36:
                                  this.a(24, 0, (byte) 62);
                                  break L1;
                                case 37:
                                  this.a(56, 1, (byte) 62);
                                  break L1;
                                case 38:
                                  this.a(40, 2, (byte) 62);
                                  break L1;
                                case 39:
                                  this.a(40, 3, (byte) 62);
                                  break L1;
                                case 40:
                                  this.a(40, 4, (byte) 62);
                                  break L1;
                                case 41:
                                  if (this.field_h == -1) {
                                    h.field_j[this.field_n].e(var2, var3);
                                    this.field_q = h.field_j[this.field_n];
                                    this.field_A = var3;
                                    this.field_y = var2;
                                    break L1;
                                  }
                                  h.field_j[this.field_n].d(var2, var3);
                                  this.field_q = h.field_j[this.field_n].c();
                                  this.field_A = var3;
                                  this.field_y = var2;
                                  break L1;
                                default:
                                  break L1;
                                case 45:
                                  this.a(40, 4, (byte) 62);
                                  break L1;
                                case 44:
                                  var10 = 0;
                                  if (this.field_o == 0) {
                                    var10 = 10;
                                  }
                                  if (this.field_o == 1) {
                                    var10 = 25;
                                  }
                                  if (this.field_o == 2) {
                                    var10 = 50;
                                  }
                                  if (this.field_o == 3) {
                                    var10 = 75;
                                  }
                                  if (4 == this.field_o) {
                                    var10 = 100;
                                  }
                                  if (5 == this.field_o) {
                                    var10 = 150;
                                  }
                                  if (this.field_o == 6) {
                                    var10 = 250;
                                  }
                                  if (this.field_o == 7) {
                                    var10 = 500;
                                  }
                                  a.field_a.b(Integer.toString(var10), 16 + var2, var3 - 1, 0, -1);
                                  a.field_a.b(Integer.toString(var10), 16 + var2, var3 + 1, 0, -1);
                                  a.field_a.b(Integer.toString(var10), var2 + 16 - 1, var3, 0, -1);
                                  a.field_a.b(Integer.toString(var10), 17 + var2, var3, 0, -1);
                                  a.field_a.b(Integer.toString(var10), var2 + 16, var3, 16777215, -1);
                                  break L1;
                              }
                            }
                            var9 = 37;
                            if (this.field_w > 2) {
                              var9 = 36;
                            }
                            if (this.field_w > 20) {
                              var9 = 35;
                            }
                            if (-1 == this.field_h) {
                              oc.field_b[1][var9].e(var2, var3);
                              this.field_q = oc.field_b[1][var9];
                              this.field_A = var3;
                              this.field_y = var2;
                              break L1;
                            }
                            oc.field_b[1][var9].d(var2, var3);
                            this.field_q = oc.field_b[1][var9].c();
                            this.field_A = var3;
                            this.field_y = var2;
                            break L1;
                        }
                      case 20:
                        this.field_w = this.field_w + 2;
                        var8 = this.field_w;
                        var4 = -this.field_w + 128;
                        if (var4 > 0) {
                          rk.field_m.d(var2 - var8, var3 - var8, 2 * var8, var8 * 2, var4);
                        }
                        if (this.field_w > 120) {
                          this.field_k = 1;
                        }
                        break;
                    }
                    break;
                }
              }
            }
          } else {
            if (0 <= qh.field_g &&
              !pg.field_q) {
              if (this.field_h == -1) {
                ve.field_c[this.field_n].e(var2, var3);
                this.field_q = ra.field_m[this.field_n];
                this.field_y = var2;
                this.field_A = var3;
              } else {
                ve.field_c[this.field_n].d(var2, var3);
                this.field_q = ra.field_m[this.field_n].c();
                this.field_A = var3;
                this.field_y = var2;
              }
              if (0 <= nk.field_T &&
                300 > nk.field_T &&
                250 < sj.field_l) {
                if (nk.field_T >= 0 &&
                  nk.field_T < 50) {
                  if (uc.field_g < 20) {
                    stackIn_87_1 = 16711680;
                  } else {
                    stackIn_87_1 = 16776960;
                  }
                  this.a(stackIn_87_1, var2, true, "(", 32 + var3);
                  if (uc.field_g < 20) {
                    stackIn_90_1 = 16711680;
                  } else {
                    stackIn_90_1 = 16776960;
                  }
                  this.a(stackIn_90_1, ve.field_c[this.field_n].field_x + var2, true, ")", 32 + var3);
                }
                if (nk.field_T >= 50 &&
                  nk.field_T < 100) {
                  var11 = jj.field_b.b(di.a(new String[]{wl.field_h[hh.field_S], wl.field_h[nf.field_d]}, (byte) 126, ka.field_g));
                  var12 = var2 + ve.field_c[this.field_n].field_x / 2;
                  if (var12 < var11 / 2) {
                    var12 = var11 / 2;
                  }
                  if (var12 > 640 - var11 / 2) {
                    var12 = -(var11 / 2) + 640;
                  }
                  if (uc.field_g < 20) {
                    stackIn_103_1 = 16711680;
                  } else {
                    stackIn_103_1 = 16776960;
                  }
                  this.a(stackIn_103_1, var12, true, di.a(new String[]{wl.field_h[hh.field_S], wl.field_h[nf.field_d]}, (byte) 107, ka.field_g), -4 + var3);
                }
                if (nk.field_T >= 100 &&
                  nk.field_T < 150) {
                  var11 = jj.field_b.b(di.a(new String[]{wl.field_h[hh.field_S], wl.field_h[nf.field_d]}, (byte) 59, wb.field_a));
                  var12 = var2 + ve.field_c[this.field_n].field_x / 2;
                  if (var11 / 2 > var12) {
                    var12 = var11 / 2;
                  }
                  if (var12 > -(var11 / 2) + 640) {
                    var12 = -(var11 / 2) + 640;
                  }
                  if (uc.field_g >= 20) {
                    stackIn_115_1 = 16776960;
                  } else {
                    stackIn_115_1 = 16711680;
                  }
                  this.a(stackIn_115_1, var12, true, di.a(new String[]{wl.field_h[hh.field_S], wl.field_h[nf.field_d]}, (byte) 61, wb.field_a), var3 - 4);
                }
                if (nk.field_T >= 150 &&
                  nk.field_T < 200) {
                  var11 = jj.field_b.b(di.a(new String[]{wl.field_h[hh.field_S], wl.field_h[nf.field_d]}, (byte) 66, ei.field_m));
                  var12 = var2 + ve.field_c[this.field_n].field_x / 2;
                  if (var11 / 2 > var12) {
                    var12 = var11 / 2;
                  }
                  if (-(var11 / 2) + 640 < var12) {
                    var12 = -(var11 / 2) + 640;
                  }
                  if (20 > uc.field_g) {
                    stackIn_125_1 = 16711680;
                  } else {
                    stackIn_125_1 = 16776960;
                  }
                  this.a(stackIn_125_1, var12, true, di.a(new String[]{wl.field_h[hh.field_S], wl.field_h[nf.field_d]}, (byte) 46, ei.field_m), -4 + var3);
                }
              }
              if (cd.field_e > 0 &&
                7 > cd.field_e % 10 &&
                1 < cd.field_e % 10) {
                if (this.field_h != -1) {
                  ve.field_c[this.field_n].c().b(var2, var3, 16777215);
                } else {
                  ve.field_c[this.field_n].b(var2, var3, 16777215);
                }
              }
              if (120 > fi.field_x) {
                var4 = 256 * fi.field_x / 120;
                var11_double = 0.0;
                for (var13 = 0; var13 < 5; var13++) {
                  var11_double = (double)fi.field_x + 6.28 * (double)var13 / 5.0;
                  var14 = 32;
                  if (100 < fi.field_x) {
                    var14 = var14 + (10 - Math.abs(-110 + fi.field_x));
                  }
                  ob.field_c.d(-6 + var2 + (int)(Math.cos(var11_double) * (double)var14 + 32.0), -6 + ((int)(32.0 + Math.sin(var11_double) * (double)var14) + var3), 12, 12, var4);
                }
              }
            }
          }
        }
    }

    private final void c(int param0) {
        tl.field_a.a(si.field_j[10], 100, ee.field_p * 256 / 100);
        if (param0 != 1) {
          tg var3 = (tg) null;
          this.a(-123, (byte) -40, (tg) null, true);
        }
    }

    private final boolean a(boolean param0, tg param1, int param2) {
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          this.field_z = this.field_z + 1;
          this.field_n = param2;
          if (this.field_s > 0 &&
            !param0) {
            this.field_s = this.field_s - 1;
            this.field_p = this.field_p - 1;
            if (this.field_p > 0) {
              if (pk.field_s &&
                !param0) {
                this.c(param2 ^ 24);
              }
            } else {
              if (pk.field_s &&
                !param0) {
                this.c(false);
              }
            }
            if (0 >= this.field_p) {
              this.field_e = 60;
            }
          }
          if (!param0) {
            if (this.field_z > 35) {
              this.field_n = 26;
            }
            if (this.field_z > 50) {
              this.field_x = 0;
              this.field_z = 0;
            }
            if (this.field_z != 35) {
              return false;
            }
            return true;
          }
          if (this.field_z > 15) {
            this.field_n = 26;
          }
          if (this.field_z > 30) {
            this.field_n = 27;
          }
          if (this.field_z > 40) {
            this.field_n = 28;
          }
          if (this.field_z > 50) {
            this.field_z = 0;
            this.field_x = 0;
          }
          if (this.field_z != 40) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_40_0 = var4;
          stackIn_40_1 = new StringBuilder().append("eg.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0, byte param1, tg param2, boolean param3) {
        int fieldTemp$0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        ob var7 = null;
        ob var8 = null;
        var6 = wizardrun.field_H;
        try {
          if (0 <= this.field_e) {
            this.field_e = this.field_e + 3;
            var7 = new ob(this.field_i);
            var8 = var7;
            var8.field_a = var8.field_a + 1;
            if (param2.field_f[var7.a((byte) -68)] == 1 ||
              !(var8.field_a < 14)) {
              this.field_e = -Math.abs(this.field_e);
            }
            if (this.field_e > 20) {
              this.field_e = 5;
            }
          } else {
            if (this.field_e < -20) {
              this.field_e = -5;
            }
          }
          var5_int = 64 % ((param1 - 58) / 56);
          fieldTemp$0 = this.field_z;
          this.field_z = this.field_z - 1;
          if (0 >= fieldTemp$0) {
            this.field_o = this.field_o + 1;
            this.field_z = 5;
            if (1 < this.field_o) {
              this.field_o = 0;
            }
            this.field_n = this.field_n + 1;
            if (param3) {
              this.field_z = 5;
              if (9 < this.field_n) {
                this.field_n = 2;
              }
            } else {
              if (5 < this.field_n) {
                this.field_n = 2;
              }
            }
            if (this.field_n < 2) {
              this.field_n = 2;
            }
          }
          if (this.field_e == 0) {
            this.field_e = 20;
          }
          this.a(1, si.field_j, param2, 1, param0, 1, tl.field_a, pk.field_s, (byte) 127);
          if (this.field_s > 0 &&
            !param3) {
            this.field_s = this.field_s - 1;
            this.field_p = this.field_p - 1;
            if (0 >= this.field_p) {
              if (pk.field_s &&
                !param3) {
                this.c(false);
              }
            } else {
              if (pk.field_s) {
                this.c(1);
              }
            }
            if (this.field_p <= 0) {
              this.field_e = 60;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_42_0 = var5;
          stackIn_42_1 = new StringBuilder().append("eg.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(int param0, tg param1) {
        this.field_e = this.field_e + 1;
        this.field_w = this.field_w + 1;
        if (this.field_w > 1000) {
          this.field_w = 0;
          this.field_r = 0;
          if (pk.field_s) {
            tl.field_a.a(si.field_j[6], 100, ee.field_p * 256 / 100);
          }
        }
        this.a(1, si.field_j, param1, 1, 5, 1, tl.field_a, pk.field_s, (byte) -57);
        if (1 == this.b(param1, -4) &&
          this.field_f.field_a == 0) {
          this.field_e = 20;
          if (pk.field_s) {
            tl.field_a.a(si.field_j[2], 100, ee.field_p * 64 / 100);
          }
        }
        this.field_n = 31;
        this.field_o = 7;
        if (param0 <= 13) {
          return;
        }
        try {
          this.b(5);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "eg.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void e(boolean param0) {
        ob var2;
        ob var3;
        ob var4;
        if (param0) {
          return;
        }
        if (0 == ii.field_e[0].field_s &&
          this.field_q != null &&
          ii.field_e[0].field_q != null) {
          var4 = new ob();
          var2 = var4;
          var3 = new ob();
          var2.field_b = this.field_y;
          var4.field_a = this.field_A;
          var3.field_b = ii.field_e[0].field_y;
          var3.field_a = ii.field_e[0].field_A;
          if (j.a(this.field_q, var2.field_b, var4.field_a, ii.field_e[0].field_q, var3.field_b, var3.field_a)) {
            ii.field_e[0].field_s = 1;
          }
        }
    }

    private final void c(boolean param0) {
        String var3;
        ol.field_e = true;
        if (3 == this.field_B) {
          tl.field_a.a(nl.field_q[3], 100, ee.field_p * 256 / 100);
        } else {
          if (this.field_B == 4) {
            tl.field_a.a(nl.field_q[4], 100, ee.field_p * 256 / 100);
          } else {
            if (5 == this.field_B) {
              tl.field_a.a(nl.field_q[5], 100, ee.field_p * 256 / 100);
            } else {
              if (this.field_B == 6) {
                tl.field_a.a(nl.field_q[7], 100, ee.field_p * 256 / 100);
              } else {
                if (this.field_B == 8) {
                  tl.field_a.a(nl.field_q[8], 100, 256 * ee.field_p / 100);
                } else {
                  if (this.field_B == 7) {
                    tl.field_a.a(nl.field_q[9], 100, 256 * ee.field_p / 100);
                  } else {
                    if (this.field_B == 9) {
                      tl.field_a.a(nl.field_q[10], 100, 256 * ee.field_p / 100);
                    } else {
                      if (this.field_B == 10) {
                        tl.field_a.a(nl.field_q[11], 100, 256 * ee.field_p / 100);
                      } else {
                        if (this.field_B == 12) {
                          tl.field_a.a(nl.field_q[13], 100, ee.field_p * 256 / 100);
                        } else {
                          if (this.field_B == 14) {
                            tl.field_a.a(nl.field_q[14], 100, ee.field_p * 256 / 100);
                          } else {
                            if (this.field_B == 13) {
                              tl.field_a.a(nl.field_q[15], 100, 256 * ee.field_p / 100);
                            } else {
                              if (this.field_B == 15) {
                                tl.field_a.a(nl.field_q[16], 100, 256 * ee.field_p / 100);
                              } else {
                                if (this.field_B == 16) {
                                  tl.field_a.a(nl.field_q[19], 100, ee.field_p * 256 / 100);
                                } else {
                                  if (this.field_B == 17) {
                                    tl.field_a.a(nl.field_q[21], 100, 256 * ee.field_p / 100);
                                  } else {
                                    if (22 == this.field_B) {
                                      tl.field_a.a(nl.field_q[22], 100, ee.field_p * 256 / 100);
                                    } else {
                                      if (this.field_B == 24) {
                                        tl.field_a.a(nl.field_q[23], 100, 256 * ee.field_p / 100);
                                      } else {
                                        if (this.field_B == 23) {
                                          tl.field_a.a(nl.field_q[24], 100, ee.field_p * 256 / 100);
                                        } else {
                                          if (26 == this.field_B) {
                                            tl.field_a.a(nl.field_q[26], 100, ee.field_p * 256 / 100);
                                          } else {
                                            if (this.field_B == 29) {
                                              tl.field_a.a(nl.field_q[27], 100, 256 * ee.field_p / 100);
                                            } else {
                                              if (31 == this.field_B) {
                                                tl.field_a.a(nl.field_q[28], 100, ee.field_p * 256 / 100);
                                              } else {
                                                if (30 == this.field_B) {
                                                  tl.field_a.a(nl.field_q[29], 100, 256 * ee.field_p / 100);
                                                } else {
                                                  if (this.field_B == 32) {
                                                    tl.field_a.a(nl.field_q[30], 100, 256 * ee.field_p / 100);
                                                  } else {
                                                    if (this.field_B == 33) {
                                                      tl.field_a.a(nl.field_q[31], 100, 256 * ee.field_p / 100);
                                                    } else {
                                                      if (this.field_B == 36) {
                                                        tl.field_a.a(nl.field_q[32], 100, 256 * ee.field_p / 100);
                                                      } else {
                                                        if (param0) {
                                                          var3 = (String) null;
                                                          this.a(-17, 111, false, (String) null, 55);
                                                        }
                                                        if (this.field_B == 38) {
                                                          tl.field_a.a(nl.field_q[33], 100, ee.field_p * 256 / 100);
                                                        } else {
                                                          if (this.field_B == 37) {
                                                            tl.field_a.a(nl.field_q[34], 100, ee.field_p * 256 / 100);
                                                          } else {
                                                            if (39 == this.field_B) {
                                                              tl.field_a.a(nl.field_q[35], 100, ee.field_p * 256 / 100);
                                                            } else {
                                                              if (this.field_B == 40) {
                                                                tl.field_a.a(nl.field_q[37], 100, 256 * ee.field_p / 100);
                                                              } else {
                                                                tl.field_a.a(si.field_j[9], 100, ee.field_p * 256 / 100);
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

    final void a(byte param0, tg param1) {
        int fieldTemp$0 = 0;
        ob dupTemp$1 = null;
        ob dupTemp$2 = null;
        ob dupTemp$3 = null;
        ob dupTemp$4 = null;
        ob dupTemp$5 = null;
        ob dupTemp$6 = null;
        ob dupTemp$7 = null;
        ob dupTemp$8 = null;
        ob dupTemp$9 = null;
        ob dupTemp$10 = null;
        ob dupTemp$11 = null;
        ob dupTemp$12 = null;
        ob dupTemp$13 = null;
        eg dupTemp$14 = null;
        eg dupTemp$15 = null;
        int fieldTemp$75 = 0;
        int fieldTemp$16 = 0;
        int fieldTemp$69 = 0;
        int fieldTemp$70 = 0;
        ob dupTemp$71 = null;
        ob dupTemp$72 = null;
        int fieldTemp$17 = 0;
        int fieldTemp$18 = 0;
        int fieldTemp$67 = 0;
        int fieldTemp$68 = 0;
        int fieldTemp$19 = 0;
        ob dupTemp$20 = null;
        ob dupTemp$21 = null;
        int fieldTemp$22 = 0;
        int fieldTemp$23 = 0;
        ob dupTemp$24 = null;
        ob dupTemp$25 = null;
        int fieldTemp$26 = 0;
        int fieldTemp$27 = 0;
        int fieldTemp$28 = 0;
        int fieldTemp$29 = 0;
        int fieldTemp$66 = 0;
        int fieldTemp$60 = 0;
        int fieldTemp$61 = 0;
        ob dupTemp$62 = null;
        ob dupTemp$63 = null;
        int fieldTemp$56 = 0;
        int fieldTemp$57 = 0;
        ob dupTemp$58 = null;
        ob dupTemp$59 = null;
        int fieldTemp$30 = 0;
        int fieldTemp$31 = 0;
        ob dupTemp$32 = null;
        ob dupTemp$33 = null;
        int fieldTemp$34 = 0;
        int fieldTemp$35 = 0;
        ob dupTemp$36 = null;
        ob dupTemp$37 = null;
        int fieldTemp$55 = 0;
        ob dupTemp$53 = null;
        ob dupTemp$54 = null;
        int fieldTemp$38 = 0;
        int fieldTemp$39 = 0;
        int fieldTemp$51 = 0;
        int fieldTemp$52 = 0;
        int fieldTemp$49 = 0;
        int fieldTemp$50 = 0;
        int fieldTemp$40 = 0;
        ob dupTemp$41 = null;
        ob dupTemp$42 = null;
        int fieldTemp$43 = 0;
        int fieldTemp$44 = 0;
        int fieldTemp$45 = 0;
        ob dupTemp$46 = null;
        ob dupTemp$47 = null;
        int fieldTemp$48 = 0;
        int fieldTemp$64 = 0;
        int fieldTemp$65 = 0;
        int fieldTemp$73 = 0;
        int fieldTemp$74 = 0;
        int fieldTemp$76 = 0;
        int fieldTemp$77 = 0;
        int stackIn_83_0 = 0;
        int stackIn_84_1 = 0;
        boolean stackIn_183_0 = false;
        int stackIn_195_0 = 0;
        int stackIn_248_0 = 0;
        int stackIn_249_1 = 0;
        boolean stackIn_276_1 = false;
        int stackIn_277_2 = 0;
        int stackIn_401_0 = 0;
        int stackIn_440_0 = 0;
        int stackIn_457_0 = 0;
        int stackIn_507_1 = 0;
        int stackIn_535_0 = 0;
        int stackIn_551_1 = 0;
        int stackIn_555_1 = 0;
        boolean stackIn_574_0 = false;
        int stackIn_590_1 = 0;
        int stackIn_658_1 = 0;
        int stackIn_716_1 = 0;
        int stackIn_773_0 = 0;
        int stackIn_774_1 = 0;
        int stackIn_784_0 = 0;
        int stackIn_808_0 = 0;
        int stackIn_817_0 = 0;
        int stackIn_833_1 = 0;
        int stackIn_871_1 = 0;
        int stackIn_875_1 = 0;
        int stackIn_896_0 = 0;
        int stackIn_897_1 = 0;
        int stackIn_972_1 = 0;
        int stackIn_1000_0 = 0;
        int stackIn_1001_1 = 0;
        int stackIn_1043_1 = 0;
        int stackIn_1071_1 = 0;
        int stackIn_1157_1 = 0;
        int stackIn_1184_0 = 0;
        int stackIn_1185_1 = 0;
        int stackIn_1225_1 = 0;
        int stackIn_1227_0 = 0;
        int stackIn_1228_1 = 0;
        int stackIn_1239_0 = 0;
        int stackIn_1240_1 = 0;
        RuntimeException stackIn_1269_0 = null;
        StringBuilder stackIn_1269_1 = null;
        String stackIn_1270_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        eg var4_ref_eg = null;
        int var7 = 0;
        ob var8 = null;
        ob var9 = null;
        ob var10 = null;
        ob var11 = null;
        var7 = wizardrun.field_H;
        try {
          if (17 < this.field_i.field_a) {
            this.field_i.field_a = -2;
          }
          if (this.field_i.field_a < -2) {
            this.field_i.field_a = 17;
          }
          L2: {
            var3_int = 15;
            var4 = this.field_B;
            if (var4 == 0) {
              if (cd.field_e > 0) {
                cd.field_e = cd.field_e - 1;
                this.field_s = 0;
              }
              if (0 == this.field_s) {
                var3_int = 0;
                if (sc.field_m.field_b == 1) {
                  var3_int = 30;
                  this.field_h = 1;
                }
                if (sc.field_m.field_b == -1) {
                  var3_int = 30;
                  this.field_h = -1;
                }
                if (sc.field_m.field_f &&
                  0 == this.field_f.field_a &&
                  this.b(param1, param0 + 119) == 1) {
                  this.field_e = 70;
                  if (pk.field_s) {
                    tl.field_a.a(si.field_j[3], 100, ee.field_p * 256 / 100);
                  }
                }
                this.field_f.field_b = this.field_f.field_b + 120;
                this.field_d = this.field_d / 2;
                this.a((byte) 114);
                if (0 != var3_int) {
                  this.field_w = this.field_w - 1;
                  fieldTemp$0 = this.field_z;
                  this.field_z = this.field_z - 1;
                  if (0 > fieldTemp$0) {
                    this.field_z = 5;
                    this.field_n = this.field_n + 1;
                    if (this.field_n > 3) {
                      this.field_n = 0;
                    }
                  }
                  if (0 > this.field_w) {
                    this.field_o = this.field_o + 1;
                    this.field_w = 10;
                  }
                  if (this.field_o < 3 ||
                    this.field_o > 6) {
                    this.field_o = 3;
                  }
                } else {
                  this.field_o = 0;
                  this.field_z = 0;
                  this.field_n = 1;
                }
                if (!(0 >= this.field_f.field_a) ||
                  this.b(param1, param0 ^ 121) == 0) {
                  if (this.field_e > 0) {
                    this.field_n = 9;
                  }
                  if (this.field_e > 30) {
                    this.field_n = 8;
                  }
                  if (this.field_e > 50) {
                    this.field_n = 7;
                  }
                  if (0 >= this.field_e) {
                    this.field_n = 10;
                  }
                }
                if (0 < p.field_V) {
                  this.field_n = 4;
                  p.field_V = p.field_V - 1;
                  if (p.field_V < 15) {
                    this.field_n = 5;
                  }
                }
                if (!sc.field_m.field_f &&
                  10 < this.field_e) {
                  this.field_e = this.field_e - 4;
                }
                this.a(1, si.field_j, param1, 1, var3_int, 1, tl.field_a, pk.field_s, (byte) -104);
                if (!sc.field_m.field_d) {
                  if (p.field_V < 10) {
                    if (fi.field_x > 0 &&
                      10 > fi.field_x) {
                      p.field_V = 25;
                      fi.field_x = 0;
                      ii.field_e[od.field_k].a(9147, 1, this.field_i);
                      ii.field_e[od.field_k].field_f.a(param0 ^ 42, this.field_f);
                      dupTemp$1 = ii.field_e[od.field_k].field_f;
                      dupTemp$1.field_a = dupTemp$1.field_a + 140;
                      ii.field_e[od.field_k].field_h = this.field_h;
                      dupTemp$2 = ii.field_e[od.field_k].field_f;
                      dupTemp$2.field_b = dupTemp$2.field_b + 40;
                      od.field_k = od.field_k + 1;
                      if (pk.field_s) {
                        tl.field_a.a(si.field_j[0], 100, ee.field_p * 256 / 100);
                      }
                    }
                    if (fi.field_x >= 10 &&
                      fi.field_x < 40) {
                      p.field_V = 5;
                      fi.field_x = fi.field_x - 20;
                      if (fi.field_x < 0) {
                        fi.field_x = 0;
                      }
                      ii.field_e[od.field_k].a(9147, 1, this.field_i);
                      ii.field_e[od.field_k].field_f.a(param0 ^ 21, this.field_f);
                      dupTemp$3 = ii.field_e[od.field_k].field_f;
                      dupTemp$3.field_a = dupTemp$3.field_a + 140;
                      ii.field_e[od.field_k].field_h = this.field_h;
                      dupTemp$4 = ii.field_e[od.field_k].field_f;
                      dupTemp$4.field_b = dupTemp$4.field_b + 40;
                      ii.field_e[od.field_k].field_e = -10;
                      od.field_k = od.field_k + 1;
                      ii.field_e[od.field_k].a(param0 + 9270, 1, this.field_i);
                      ii.field_e[od.field_k].field_f.a(-112, this.field_f);
                      dupTemp$5 = ii.field_e[od.field_k].field_f;
                      dupTemp$5.field_a = dupTemp$5.field_a + 140;
                      ii.field_e[od.field_k].field_h = this.field_h;
                      dupTemp$6 = ii.field_e[od.field_k].field_f;
                      dupTemp$6.field_b = dupTemp$6.field_b + 40;
                      ii.field_e[od.field_k].field_e = 10;
                      od.field_k = od.field_k + 1;
                      if (pk.field_s) {
                        tl.field_a.a(si.field_j[23], 100, ee.field_p * 256 / 100);
                      }
                    }
                    if (fi.field_x >= 40 &&
                      fi.field_x < 100) {
                      p.field_V = 5;
                      fi.field_x = fi.field_x - 30;
                      if (fi.field_x < 0) {
                        fi.field_x = 0;
                      }
                      ii.field_e[od.field_k].a(9147, 1, this.field_i);
                      ii.field_e[od.field_k].field_f.a(-87, this.field_f);
                      dupTemp$7 = ii.field_e[od.field_k].field_f;
                      dupTemp$7.field_a = dupTemp$7.field_a + 140;
                      ii.field_e[od.field_k].field_h = this.field_h;
                      dupTemp$8 = ii.field_e[od.field_k].field_f;
                      dupTemp$8.field_b = dupTemp$8.field_b + 40;
                      ii.field_e[od.field_k].field_e = 30;
                      od.field_k = od.field_k + 1;
                      ii.field_e[od.field_k].a(9147, 1, this.field_i);
                      ii.field_e[od.field_k].field_f.a(-82, this.field_f);
                      dupTemp$9 = ii.field_e[od.field_k].field_f;
                      dupTemp$9.field_a = dupTemp$9.field_a + 140;
                      ii.field_e[od.field_k].field_h = this.field_h;
                      dupTemp$10 = ii.field_e[od.field_k].field_f;
                      dupTemp$10.field_b = dupTemp$10.field_b + 40;
                      ii.field_e[od.field_k].field_e = 0;
                      od.field_k = od.field_k + 1;
                      ii.field_e[od.field_k].a(9147, 1, this.field_i);
                      ii.field_e[od.field_k].field_f.a(-97, this.field_f);
                      dupTemp$11 = ii.field_e[od.field_k].field_f;
                      dupTemp$11.field_a = dupTemp$11.field_a + 140;
                      ii.field_e[od.field_k].field_h = this.field_h;
                      dupTemp$12 = ii.field_e[od.field_k].field_f;
                      dupTemp$12.field_b = dupTemp$12.field_b + 40;
                      ii.field_e[od.field_k].field_e = -30;
                      od.field_k = od.field_k + 1;
                      if (pk.field_s) {
                        tl.field_a.a(si.field_j[24], 100, ee.field_p * 256 / 100);
                      }
                    }
                    if (fi.field_x < 100) {
                      this.field_d = this.field_d * 2;
                      this.field_f.field_b = this.field_f.field_b - 120;
                      this.a((byte) 83);
                      break L2;
                    }
                    fi.field_x = 0;
                    p.field_V = 25;
                    if (this.field_e >= 0) {
                      this.field_e = this.field_e - 10;
                    }
                    ii.field_e[od.field_k].a(9147, 2, this.field_i);
                    ii.field_e[od.field_k].field_f.a(-83, this.field_f);
                    ii.field_e[od.field_k].field_h = this.field_h;
                    dupTemp$13 = ii.field_e[od.field_k].field_f;
                    dupTemp$13.field_b = dupTemp$13.field_b + 60 * this.field_h;
                    ii.field_e[od.field_k].field_e = 5 * (fi.field_x / 10);
                    od.field_k = od.field_k + 1;
                    stackIn_183_0 = !(pk.field_s);
                    if (!stackIn_183_0) {
                      tl.field_a.a(si.field_j[2], 100, 256 * ee.field_p / 100);
                    }
                  }
                } else {
                  if (fi.field_x < 120) {
                    fi.field_x = fi.field_x + 1;
                  }
                  if (120 <= fi.field_x) {
                    fi.field_x = fi.field_x - 20;
                  }
                  if (fi.field_x % 10 == 5 &&
                    pk.field_s) {
                    tl.field_a.a(si.field_j[16], 100, 256 * ee.field_p / 100);
                  }
                }
                this.field_d = this.field_d * 2;
                this.field_f.field_b = this.field_f.field_b - 120;
                this.a((byte) 83);
              } else {
                this.field_n = Math.abs(this.field_e) / 10 % 2 + 12;
                fi.field_x = 0;
                if (this.field_s == 1) {
                  this.field_e = -40;
                  this.field_s = 2;
                  stackIn_83_0 = 0;
                  if (pk.field_s) {
                    stackIn_84_1 = 0;
                  } else {
                    stackIn_84_1 = 1;
                  }
                  if (stackIn_83_0 == stackIn_84_1) {
                    tl.field_a.a(si.field_j[8], 100, ee.field_p * 256 / 100);
                  }
                }
                this.field_e = this.field_e + 1;
                this.field_o = 1;
                this.field_f.field_a = this.field_f.field_a - this.field_e;
                if (this.field_e > 0) {
                  this.field_o = 2;
                }
                if (this.field_f.field_a < 0) {
                  this.field_f.field_a = this.field_f.field_a + 240;
                  this.field_i.field_a = this.field_i.field_a - 1;
                }
                if (this.field_i.field_a < -2) {
                  this.field_i.field_a = 2;
                  this.field_i.field_b = 2;
                  if (4 == qh.field_l &&
                    ql.field_c == 5) {
                    this.field_i.field_b = this.field_i.field_b + 1;
                  }
                  gd.field_b = true;
                  cd.field_e = 100;
                  this.field_f.field_a = 0;
                  this.field_s = 0;
                  da.field_g = true;
                  qh.field_g = qh.field_g - 1;
                  hi.field_c = hi.field_c + 1;
                  this.field_h = 1;
                  this.field_e = 0;
                  this.field_f.field_b = 0;
                  if (qh.field_g < 0) {
                    bb.field_j = me.field_b;
                    hi.field_a = 580;
                  }
                }
              }
            } else {
              if (var4 == 1) {
                if (this.field_e <= 0 &&
                  1 == this.b(param1, param0 + 119) &&
                  0 == this.field_f.field_a) {
                  this.field_e = 30;
                  if (this.field_i.field_b >= 0 &&
                    this.field_i.field_b < 20) {
                    stackIn_195_0 = (pk.field_s) ? 0 : 1;
                    if (stackIn_195_0 != 1) {
                      tl.field_a.a(si.field_j[1], 100, ee.field_p * 128 / 100);
                    }
                  }
                }
                this.field_w = this.field_w + 1;
                if (this.field_w <= 2) {
                  this.a(1, si.field_j, param1, 1, 60, 0, tl.field_a, pk.field_s, (byte) -73);
                  if (!pg.field_q) {
                    for (var4 = 0; od.field_k > var4; var4++) {
                      if (ii.field_e[var4].field_p > 0 &&
                        ii.field_e[var4].field_r == 0 &&
                        null != ii.field_e[var4].field_q &&
                        this.field_q != null) {
                        var8 = new ob();
                        var9 = new ob();
                        var8.field_b = this.field_y;
                        var8.field_a = this.field_A;
                        var9.field_b = ii.field_e[var4].field_y;
                        var9.field_a = ii.field_e[var4].field_A;
                        if (j.a(this.field_q, var8.field_b, var8.field_a, ii.field_e[var4].field_q, var9.field_b, var9.field_a)) {
                          dupTemp$14 = ii.field_e[var4];
                          dupTemp$14.field_s = dupTemp$14.field_s + 1;
                          if (pk.field_s) {
                            tl.field_a.a(si.field_j[10], 100, 256 * ee.field_p / 100);
                          }
                          ii.field_e[var4].field_m = this.field_h;
                          this.field_B = 20;
                          this.field_w = 4;
                        }
                      }
                    }
                  }
                }
                if (this.field_w == 2) {
                  this.field_w = 0;
                }
                if (30 <= this.field_w) {
                  this.field_k = 1;
                }
              } else {
                if (var4 == 2) {
                  this.field_w = this.field_w + 1;
                  this.field_e = 2;
                  if (this.field_w < 10) {
                    this.field_i.field_a = this.field_i.field_a - 1;
                    if (param1.field_d[this.field_i.a((byte) -68)]) {
                      param1.field_d[this.field_i.a((byte) -68)] = false;
                      ii.field_e[od.field_k].a(9147, 21, new ob(this.field_i));
                      var4_ref_eg = ii.field_e[od.field_k];
                      od.field_k = od.field_k + 1;
                      var4_ref_eg.field_f.a(-117, this.field_f);
                      var4_ref_eg.field_o = 0;
                      var4_ref_eg.field_e = 4;
                      var4_ref_eg.field_i.field_a = var4_ref_eg.field_i.field_a + 2;
                      var4_ref_eg.field_h = this.field_h;
                    }
                    this.field_i.field_a = this.field_i.field_a + 1;
                    this.a(1, si.field_j, param1, 1, 30, 0, tl.field_a, pk.field_s, (byte) 29);
                    for (var4 = 0; var4 < od.field_k; var4++) {
                      if (ii.field_e[var4].field_p > 0 &&
                        this.field_q != null &&
                        null != ii.field_e[var4].field_q) {
                        var10 = new ob();
                        var11 = new ob();
                        var10.field_a = this.field_A;
                        var10.field_b = this.field_y;
                        var11.field_b = ii.field_e[var4].field_y;
                        var11.field_a = ii.field_e[var4].field_A;
                        if (j.a(this.field_q, var10.field_b, var10.field_a, ii.field_e[var4].field_q, var11.field_b, var11.field_a)) {
                          if (ii.field_e[var4].field_d <= 64 &&
                            ii.field_e[var4].field_p <= 10) {
                            ii.field_e[var4].field_m = this.field_h;
                            ii.field_e[var4].field_h = this.field_h;
                            stackIn_248_0 = 1;
                            if (pk.field_s) {
                              stackIn_249_1 = 0;
                            } else {
                              stackIn_249_1 = 1;
                            }
                            if (stackIn_248_0 != stackIn_249_1 &&
                              ii.field_e[var4].field_r <= 0) {
                              tl.field_a.a(si.field_j[2], 100, 256 * ee.field_p / 100);
                            }
                            ii.field_e[var4].field_r = 1;
                            ii.field_e[var4].field_w = 0;
                          } else {
                            dupTemp$15 = ii.field_e[var4];
                            dupTemp$15.field_s = dupTemp$15.field_s + 10;
                            if (pk.field_s) {
                              tl.field_a.a(si.field_j[2], 100, 256 * ee.field_p / 100);
                            }
                            ii.field_e[var4].field_m = this.field_h;
                            if (!(ii.field_e[var4].field_p < 10) ||
                              !(ii.field_e[var4].field_d <= 64)) {
                              this.field_w = 4;
                              this.field_B = 20;
                            }
                          }
                        }
                      }
                    }
                  }
                  if (this.field_w == 3) {
                    this.field_w = 0;
                  }
                  if (60 <= this.field_w) {
                    this.field_k = 1;
                  }
                } else {
                  if (var4 != 3) {
                    if (var4 != 4 &&
                      var4 != 9 &&
                      var4 != 13 &&
                      24 != var4) {
                      if (var4 == 5) {
                        if (this.field_p <= 0) {
                          this.a(false, param0 + 243, param1);
                        } else {
                          if (this.field_r != 0) {
                            this.a(77, param1);
                          } else {
                            if (this.field_x == 0) {
                              this.field_n = 19;
                              if (15 < this.field_w) {
                                this.field_n = 22;
                              }
                              fieldTemp$75 = this.field_w;
                              this.field_w = this.field_w + 1;
                              if (fieldTemp$75 > 25) {
                                this.field_x = 2;
                                this.field_e = 85;
                                this.field_w = 0;
                                if (this.field_i.field_a >= ii.field_e[0].field_i.field_a) {
                                  this.field_e = 60;
                                }
                              }
                            }
                            if (this.field_x == 2) {
                              this.a(false, param0 ^ -109, 25, param1);
                            }
                            if (this.field_x == 3) {
                              this.a(15, -74, false, param1);
                            }
                            this.e(false);
                          }
                        }
                        break L2;
                      }
                      if (6 == var4) {
                        if (this.field_p <= 0) {
                          this.a(true, param0 + 243, param1);
                        } else {
                          if (this.field_o == 7) {
                            this.field_z = this.field_z - 1;
                            if (this.field_z <= 0) {
                              this.field_z = 5;
                              this.field_n = this.field_n + 1;
                            }
                            if (this.field_n > 1) {
                              this.field_n = 0;
                            }
                            if (this.field_n < 0) {
                              this.field_n = 0;
                            }
                            if (this.field_s > 0) {
                              this.field_s = this.field_s - 1;
                              this.field_o = 0;
                              if (pk.field_s) {
                                tl.field_a.a(si.field_j[30], 100, 256 * ee.field_p / 100);
                              }
                            }
                            w.field_b = w.field_b + 1;
                            if (250 >= w.field_b) {
                              this.e(false);
                              break L2;
                            }
                            this.field_o = 0;
                          } else {
                            if (0 == this.field_x) {
                              this.field_n = 19;
                              if (this.field_w > 25) {
                                this.field_n = 20;
                              }
                              if (this.field_w > 40) {
                                this.field_n = 21;
                              }
                              this.field_z = 0;
                              fieldTemp$16 = this.field_w;
                              this.field_w = this.field_w + 1;
                              if (fieldTemp$16 > 50) {
                                this.field_w = 0;
                                this.field_e = 100;
                                this.field_x = 2;
                                if (ii.field_e[0].field_i.field_a == this.field_i.field_a) {
                                  this.field_e = 70;
                                }
                                if (this.field_i.field_a > ii.field_e[0].field_i.field_a) {
                                  this.field_e = -10;
                                  this.field_i.field_a = this.field_i.field_a - 1;
                                  this.field_x = 3;
                                  this.field_f.field_a = this.field_f.field_a + 230;
                                }
                              }
                            }
                            if (this.field_x == 2) {
                              this.a(true, 22, 20, param1);
                            }
                            if (this.field_x == 3) {
                              this.a(20, -94, true, param1);
                            }
                            if (this.field_s > 0) {
                              this.field_p = this.field_p - 1;
                              this.field_s = this.field_s - 1;
                              if (pk.field_s) {
                                tl.field_a.a(si.field_j[25], 100, ee.field_p * 256 / 100);
                              }
                              if (this.field_p > 0) {
                                this.e(false);
                                break L2;
                              }
                              this.c(false);
                              this.field_e = 80;
                            }
                          }
                          this.e(false);
                        }
                        break L2;
                      }
                      if (var4 != 7 &&
                        var4 != 8) {
                        if (var4 == 10) {
                          if (this.field_p <= 0) {
                            this.a(false, 120, param1);
                          } else {
                            if (this.field_r != 0) {
                              this.a(114, param1);
                            } else {
                              if (0 == this.field_x) {
                                if (this.field_i.field_a < ii.field_e[0].field_i.field_a) {
                                  this.field_w = this.field_w + 1;
                                }
                                this.a(false, 2, 20, (byte) -76, param1);
                                fieldTemp$69 = this.field_w;
                                this.field_w = this.field_w + 1;
                                if (200 < fieldTemp$69) {
                                  this.field_x = 1;
                                  this.field_z = 0;
                                  this.field_w = 0;
                                  if (Math.random() * 100.0 < 50.0) {
                                    this.field_x = 4;
                                  }
                                }
                              }
                              if (this.field_x == 1) {
                                fieldTemp$70 = this.field_w;
                                this.field_w = this.field_w + 1;
                                if (fieldTemp$70 > 25) {
                                  this.field_w = 0;
                                  this.field_e = 70;
                                  this.field_x = 2;
                                }
                                this.field_n = 19;
                              }
                              if (2 == this.field_x) {
                                this.a(false, 22, 15, param1);
                                if (this.field_x == 0) {
                                  this.field_z = 0;
                                  this.field_w = (int)(100.0 * Math.random());
                                }
                              }
                              if (this.field_x == 3) {
                                this.a(15, -117, false, param1);
                                if (this.field_x == 0) {
                                  this.field_z = 0;
                                  this.field_w = (int)(100.0 * Math.random());
                                }
                              }
                              if (this.field_x != 4) {
                                this.e(false);
                              } else {
                                if (!this.a(false, param1, param0 + 148)) {
                                  this.e(false);
                                } else {
                                  ii.field_e[od.field_k].a(param0 ^ -9154, 11, this.field_i);
                                  ii.field_e[od.field_k].field_f.a(-82, this.field_f);
                                  dupTemp$71 = ii.field_e[od.field_k].field_f;
                                  dupTemp$71.field_b = dupTemp$71.field_b + (this.field_h * 120 + 40);
                                  dupTemp$72 = ii.field_e[od.field_k].field_f;
                                  dupTemp$72.field_a = dupTemp$72.field_a + 40;
                                  ii.field_e[od.field_k].field_h = this.field_h;
                                  ii.field_e[od.field_k].field_w = 10;
                                  od.field_k = od.field_k + 1;
                                  stackIn_440_0 = (pk.field_s) ? 0 : 1;
                                  if (stackIn_440_0 == 1) {
                                    this.e(false);
                                  } else {
                                    tl.field_a.a(si.field_j[13], 100, 256 * ee.field_p / 100);
                                    this.e(false);
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          if (var4 == 11) {
                            this.field_e = 2;
                            this.a(1, si.field_j, param1, 1, 30, 0, tl.field_a, pk.field_s, (byte) 127);
                            this.e(false);
                          } else {
                            if (var4 == 12) {
                              if (0 >= this.field_p) {
                                this.a(true, 120, param1);
                              } else {
                                if (w.field_b >= 250) {
                                  boolean decompiledFrameRemainder0 = true;
                                  if (this.field_x == 0) {
                                    this.a(true, 3, 30, (byte) -61, param1);
                                    if (this.field_i.field_b > 1 &&
                                      17 > this.field_i.field_b) {
                                      if (((this.field_z == 1)) &&
                                        ((this.field_n == 3))) {
                                        tl.field_a.a(nl.field_q[12], 100, 256 * ee.field_p / 100);
                                      }
                                      decompiledFrameRemainder0 = false;
                                    }
                                    else {
                                      if (this.field_i.field_b >= ii.field_e[0].field_i.field_b) {
                                        this.field_h = -1;
                                      } else {
                                        this.field_h = 1;
                                      }
                                      if (this.field_i.field_a < ii.field_e[0].field_i.field_a &&
                                        this.field_i.field_a < 10) {
                                        this.field_x = 1;
                                        this.field_w = 0;
                                      }
                                      if (ii.field_e[0].field_i.field_a < this.field_i.field_a &&
                                        this.field_i.field_a > 2) {
                                        this.field_x = 3;
                                        this.field_i.field_a = this.field_i.field_a - 1;
                                        this.field_e = -20;
                                        this.field_f.field_a = this.field_f.field_a + 230;
                                      }
                                    }
                                  }
                                  if (this.field_x == 1) {
                                    this.field_n = 19;
                                    fieldTemp$17 = this.field_w;
                                    this.field_w = this.field_w + 1;
                                    if (fieldTemp$17 > 5) {
                                      this.field_e = 70;
                                      this.field_x = 2;
                                      this.field_w = 0;
                                    }
                                  }
                                  if (this.field_x == 2) {
                                    this.a(true, 22, 0, param1);
                                  }
                                  if (this.field_x == 3) {
                                    this.a(0, param0 + 31, true, param1);
                                  }
                                  if (0 >= this.field_s) {
                                    this.e(false);
                                    break L2;
                                  }
                                  this.field_p = this.field_p - 1;
                                  this.field_s = this.field_s - 1;
                                  if (25 == this.field_p) {
                                    ii.field_e[od.field_k].a(9147, 10, this.field_i);
                                    ii.field_e[od.field_k].field_f.a(-108, this.field_f);
                                    ii.field_e[od.field_k].field_i.field_b = 0;
                                    ii.field_e[od.field_k].field_i.field_a = 16;
                                    ii.field_e[od.field_k].field_f.field_b = 0;
                                    ii.field_e[od.field_k].field_f.field_a = 0;
                                    ii.field_e[od.field_k].field_h = 1;
                                    ii.field_e[od.field_k].field_w = 10;
                                    od.field_k = od.field_k + 1;
                                    ii.field_e[od.field_k].a(9147, 10, this.field_i);
                                    ii.field_e[od.field_k].field_f.a(param0 + 19, this.field_f);
                                    ii.field_e[od.field_k].field_i.field_b = 19;
                                    ii.field_e[od.field_k].field_i.field_a = 16;
                                    ii.field_e[od.field_k].field_f.field_b = 0;
                                    ii.field_e[od.field_k].field_f.field_a = 0;
                                    ii.field_e[od.field_k].field_h = -1;
                                    ii.field_e[od.field_k].field_w = 10;
                                    od.field_k = od.field_k + 1;
                                  }
                                  if (pk.field_s) {
                                    tl.field_a.a(si.field_j[25], 100, 256 * ee.field_p / 100);
                                  }
                                  if (this.field_p <= 0) {
                                    this.c(false);
                                    this.field_e = 70;
                                  }
                                } else {
                                  this.field_o = 7;
                                  fieldTemp$18 = this.field_z;
                                  this.field_z = this.field_z - 1;
                                  if (fieldTemp$18 <= 0) {
                                    this.field_n = this.field_n + 1;
                                    this.field_z = 5;
                                    if (this.field_n > 1) {
                                      this.field_n = 0;
                                    }
                                  }
                                  if (this.field_s > 0) {
                                    this.field_s = this.field_s - 1;
                                    w.field_b = 250;
                                    this.field_x = 0;
                                    stackIn_457_0 = (pk.field_s) ? 0 : 1;
                                    if (stackIn_457_0 != 1) {
                                      tl.field_a.a(si.field_j[17], 100, 256 * ee.field_p / 100);
                                    }
                                  }
                                  w.field_b = w.field_b + 1;
                                }
                                this.e(false);
                              }
                            } else {
                              if (14 == var4) {
                                if (this.field_p <= 0) {
                                  this.a(false, 120, param1);
                                } else {
                                  if (this.field_r != 0) {
                                    this.a(54, param1);
                                  } else {
                                    if (this.field_x == 0) {
                                      if (this.field_i.field_a < ii.field_e[0].field_i.field_a) {
                                        this.field_w = this.field_w + 1;
                                      }
                                      this.a(false, 1, 20, (byte) -66, param1);
                                      fieldTemp$67 = this.field_w;
                                      this.field_w = this.field_w + 1;
                                      if (fieldTemp$67 > 200) {
                                        this.field_w = 0;
                                        this.field_x = 1;
                                        if (ii.field_e[0].field_i.field_b >= this.field_i.field_b) {
                                          stackIn_507_1 = 1;
                                        } else {
                                          stackIn_507_1 = -1;
                                        }
                                        this.field_h = stackIn_507_1;
                                      }
                                    }
                                    if (this.field_x == 1) {
                                      fieldTemp$68 = this.field_w;
                                      this.field_w = this.field_w + 1;
                                      if (fieldTemp$68 > 25) {
                                        this.field_w = 0;
                                        this.field_e = 70;
                                        this.field_x = 2;
                                      }
                                      this.field_n = 19;
                                    }
                                    if (2 == this.field_x) {
                                      this.a(false, 22, 16, param1);
                                      if (this.field_x == 0) {
                                        this.field_w = (int)(Math.random() * 100.0);
                                      }
                                    }
                                    if (this.field_x == 3) {
                                      this.a(16, -91, false, param1);
                                      if (0 != this.field_x) {
                                        this.e(false);
                                        break L2;
                                      }
                                      this.field_w = (int)(Math.random() * 100.0);
                                    }
                                    this.e(false);
                                  }
                                }
                              } else {
                                if (var4 == 15) {
                                  if (this.field_p <= 0) {
                                    this.a(false, param0 + 243, param1);
                                  } else {
                                    if (0 != this.field_r) {
                                      this.a(46, param1);
                                    } else {
                                      if (0 == this.field_x) {
                                        this.a(15, (byte) -9, param1, false);
                                        fieldTemp$19 = this.field_w;
                                        this.field_w = this.field_w + 1;
                                        if (fieldTemp$19 > 100) {
                                          this.field_x = 1;
                                          this.field_z = 0;
                                          this.field_w = 0;
                                        }
                                      }
                                      if (this.field_x == 1) {
                                        if (!this.a(false, param1, 25)) {
                                          this.e(false);
                                          break L2;
                                        }
                                        this.field_w = 0;
                                        ii.field_e[od.field_k].a(9147, 18, this.field_i);
                                        ii.field_e[od.field_k].field_f.a(-84, this.field_f);
                                        dupTemp$20 = ii.field_e[od.field_k].field_f;
                                        dupTemp$20.field_b = dupTemp$20.field_b + (this.field_h * 200 + 120);
                                        dupTemp$21 = ii.field_e[od.field_k].field_f;
                                        dupTemp$21.field_a = dupTemp$21.field_a - 40;
                                        ii.field_e[od.field_k].field_h = this.field_h;
                                        ii.field_e[od.field_k].field_w = 0;
                                        ii.field_e[od.field_k].field_o = 8;
                                        od.field_k = od.field_k + 1;
                                        stackIn_535_0 = (pk.field_s) ? 0 : 1;
                                        if (stackIn_535_0 != 1) {
                                          tl.field_a.a(nl.field_q[17], 100, ee.field_p * 256 / 100);
                                        }
                                      }
                                      this.e(false);
                                    }
                                  }
                                } else {
                                  if (16 == var4) {
                                    if (this.field_p <= 0) {
                                      this.a(false, 120, param1);
                                    } else {
                                      if (0 != this.field_r) {
                                        this.a(param0 + 163, param1);
                                      } else {
                                        if (this.field_x == 0) {
                                          if (ii.field_e[0].field_i.field_a > this.field_i.field_a) {
                                            this.field_w = this.field_w + 1;
                                          }
                                          this.a(false, 2, 10, (byte) -105, param1);
                                          fieldTemp$22 = this.field_w;
                                          this.field_w = this.field_w + 1;
                                          if (fieldTemp$22 > 200) {
                                            this.field_x = 1;
                                            this.field_w = 0;
                                            if (this.field_i.field_b > ii.field_e[0].field_i.field_b) {
                                              stackIn_551_1 = 1;
                                            } else {
                                              stackIn_551_1 = -1;
                                            }
                                            this.field_h = stackIn_551_1;
                                            if (50.0 > 100.0 * Math.random()) {
                                              if (ii.field_e[0].field_i.field_b < this.field_i.field_b) {
                                                stackIn_555_1 = -1;
                                              } else {
                                                stackIn_555_1 = 1;
                                              }
                                              this.field_h = stackIn_555_1;
                                              this.field_x = 4;
                                            }
                                          }
                                        }
                                        if (this.field_x == 1) {
                                          this.field_n = 19;
                                          fieldTemp$23 = this.field_w;
                                          this.field_w = this.field_w + 1;
                                          if (fieldTemp$23 > 25) {
                                            this.field_e = 70;
                                            this.field_x = 2;
                                            this.field_w = 0;
                                          }
                                        }
                                        if (this.field_x == 2) {
                                          this.a(false, 22, 15, param1);
                                          if (this.field_x == 0) {
                                            this.field_w = (int)(Math.random() * 100.0);
                                          }
                                        }
                                        if (this.field_x == 3) {
                                          this.a(15, -102, false, param1);
                                          if (this.field_x == 0) {
                                            this.field_w = (int)(100.0 * Math.random());
                                          }
                                        }
                                        if (4 == this.field_x &&
                                          this.a(false, param1, param0 + 148)) {
                                          ii.field_e[od.field_k].a(9147, 19, this.field_i);
                                          ii.field_e[od.field_k].field_f.a(param0 ^ 13, this.field_f);
                                          dupTemp$24 = ii.field_e[od.field_k].field_f;
                                          dupTemp$24.field_b = dupTemp$24.field_b + (40 + 360 * this.field_h);
                                          dupTemp$25 = ii.field_e[od.field_k].field_f;
                                          dupTemp$25.field_a = dupTemp$25.field_a + 160;
                                          ii.field_e[od.field_k].field_h = this.field_h;
                                          ii.field_e[od.field_k].field_w = 0;
                                          ii.field_e[od.field_k].field_e = 25;
                                          ii.field_e[od.field_k].field_n = 37;
                                          od.field_k = od.field_k + 1;
                                          stackIn_574_0 = !(pk.field_s);
                                          if (!stackIn_574_0) {
                                            tl.field_a.a(nl.field_q[18], 100, ee.field_p * 256 / 100);
                                          }
                                        }
                                        this.e(false);
                                      }
                                    }
                                  } else {
                                    if (17 == var4) {
                                      if (0 >= this.field_p) {
                                        this.a(true, 120, param1);
                                      } else {
                                        if (w.field_b < 250) {
                                          this.field_x = 0;
                                          fieldTemp$26 = this.field_z;
                                          this.field_z = this.field_z - 1;
                                          if (fieldTemp$26 <= 0) {
                                            this.field_n = this.field_n + 1;
                                            this.field_z = 5;
                                            if (this.field_n > 1) {
                                              this.field_n = 0;
                                            }
                                          }
                                          this.field_o = 7;
                                          if (this.field_s > 0) {
                                            w.field_b = 250;
                                            this.field_s = this.field_s - 1;
                                            if (pk.field_s) {
                                              tl.field_a.a(si.field_j[29], 100, ee.field_p * 256 / 100);
                                            }
                                          }
                                          w.field_b = w.field_b + 1;
                                        } else {
                                          if (this.field_x == 0) {
                                            if (this.field_i.field_a < ii.field_e[0].field_i.field_a) {
                                              this.field_w = this.field_w + 1;
                                            }
                                            this.a(true, 1, 25, (byte) -94, param1);
                                            fieldTemp$27 = this.field_w;
                                            this.field_w = this.field_w + 1;
                                            if (fieldTemp$27 > 200) {
                                              this.field_w = 0;
                                              if (this.field_i.field_b <= ii.field_e[0].field_i.field_b) {
                                                stackIn_590_1 = 1;
                                              } else {
                                                stackIn_590_1 = -1;
                                              }
                                              this.field_h = stackIn_590_1;
                                              this.field_x = 1;
                                            }
                                          }
                                          if (this.field_x == 1) {
                                            this.field_n = 19;
                                            fieldTemp$28 = this.field_w;
                                            this.field_w = this.field_w + 1;
                                            if (25 < fieldTemp$28) {
                                              this.field_e = 70;
                                              this.field_x = 2;
                                              this.field_w = 0;
                                            }
                                          }
                                          if (this.field_x == 2) {
                                            this.a(true, 22, 16, param1);
                                            if (this.field_x == 0) {
                                              this.field_w = (int)(Math.random() * 100.0);
                                            }
                                          }
                                          if (this.field_x == 3) {
                                            this.a(16, -99, true, param1);
                                            if (0 == this.field_x) {
                                              this.field_w = (int)(100.0 * Math.random());
                                            }
                                          }
                                          if (0 < this.field_s) {
                                            this.field_p = this.field_p - 1;
                                            this.field_s = this.field_s - 1;
                                            if (0 == this.field_p % 10) {
                                              ii.field_e[od.field_k].a(9147, 14, this.field_i);
                                              ii.field_e[od.field_k].field_f.a(-102, this.field_f);
                                              ii.field_e[od.field_k].field_h = 1;
                                              ii.field_e[od.field_k].field_w = 10;
                                              od.field_k = od.field_k + 1;
                                            }
                                            this.field_o = 1;
                                            if (pk.field_s) {
                                              tl.field_a.a(si.field_j[29], 100, 256 * ee.field_p / 100);
                                            }
                                            if (this.field_p <= 0) {
                                              this.c(false);
                                              this.field_e = 60;
                                            }
                                          }
                                          this.e(false);
                                        }
                                      }
                                    } else {
                                      if (var4 == 18) {
                                        this.e(false);
                                        if (this.b(param1, -4) == 1 &&
                                          this.field_f.field_a == 0) {
                                          this.field_w = this.field_w + 1;
                                          if (35 < this.field_n) {
                                            this.field_z = 0;
                                          }
                                          this.field_n = 35;
                                          fieldTemp$29 = this.field_z;
                                          this.field_z = this.field_z + 1;
                                          if (fieldTemp$29 > 10) {
                                            this.field_n = 34;
                                          }
                                        } else {
                                          this.a(1, si.field_j, param1, 1, 5, 1, tl.field_a, pk.field_s, (byte) 127);
                                          if (36 > this.field_n) {
                                            this.field_n = 36;
                                          }
                                          this.field_z = this.field_z - 1;
                                          if (this.field_z <= 5) {
                                            this.field_n = 37;
                                          }
                                          if (this.field_z <= 0) {
                                            this.field_z = 10;
                                          }
                                        }
                                        if (this.field_f.field_a < 0) {
                                          this.field_f.field_a = this.field_f.field_a + 240;
                                          this.field_i.field_a = this.field_i.field_a - 1;
                                        }
                                        if (this.field_i.field_a < 0) {
                                          this.field_w = 21;
                                        }
                                        this.e(false);
                                        if (!(20 >= this.field_w)) {
                                          this.field_k = 1;
                                        }
                                      } else {
                                        if (var4 == 19) {
                                          this.a(1, si.field_j, param1, 1, 25, 0, tl.field_a, pk.field_s, (byte) -120);
                                          this.e(false);
                                          this.field_n = 37;
                                          if (((this.b(param1, -4) == 1)) &&
                                            ((this.field_f.field_a == 0))) {
                                            this.field_e = 20;
                                            this.field_n = 37;
                                          }
                                        } else {
                                          if (25 == var4) {
                                            this.a((byte) 78);
                                            if (this.field_f.field_a < 0) {
                                              this.field_f.field_a = this.field_f.field_a + 240;
                                              this.field_i.field_a = this.field_i.field_a - 1;
                                            }
                                            this.field_z = this.field_z + 1;
                                            if (this.field_f.field_a >= 240) {
                                              this.field_f.field_a = this.field_f.field_a - 240;
                                              this.field_i.field_a = this.field_i.field_a + 1;
                                            }
                                            if (this.field_z % 10 < 6) {
                                              stackIn_658_1 = 36;
                                            } else {
                                              stackIn_658_1 = 37;
                                            }
                                            this.field_n = stackIn_658_1;
                                            if (this.field_z < 20) {
                                              if (this.field_i.field_b < ii.field_e[0].field_i.field_b) {
                                                this.field_f.field_b = this.field_f.field_b + 15;
                                                this.field_h = 1;
                                              }
                                              if (ii.field_e[0].field_i.field_a > this.field_i.field_a) {
                                                this.field_f.field_a = this.field_f.field_a + 15;
                                              }
                                              if (ii.field_e[0].field_i.field_b < this.field_i.field_b) {
                                                this.field_h = -1;
                                                this.field_f.field_b = this.field_f.field_b - 15;
                                              }
                                              if (this.field_i.field_a > ii.field_e[0].field_i.field_a) {
                                                this.field_f.field_a = this.field_f.field_a - 15;
                                              }
                                            } else {
                                              this.field_f.field_b = this.field_f.field_b + this.field_h * 15;
                                              if (this.field_i.field_a < ii.field_e[0].field_i.field_a) {
                                                this.field_f.field_a = this.field_f.field_a + 18;
                                              }
                                              if (this.field_i.field_a > ii.field_e[0].field_i.field_a) {
                                                this.field_f.field_a = this.field_f.field_a - 18;
                                              }
                                            }
                                            this.e(false);
                                            if (!(this.field_z <= 300)) {
                                              this.field_k = 1;
                                            }
                                            break L2;
                                          }
                                          if ((var4 != 20)) {
                                            if (var4 == 21) {
                                              if (this.field_i.field_b < 0) {
                                                this.field_h = 1;
                                                this.field_i.field_b = 0;
                                                this.field_f.field_b = 0;
                                              }
                                              if (this.field_i.field_b >= 20) {
                                                this.field_i.field_b = 20;
                                                this.field_h = -1;
                                                this.field_f.field_b = 0;
                                              }
                                              if (this.b(param1, -4) == 1 &&
                                                this.field_f.field_a == 0 &&
                                                this.field_e <= 0) {
                                                this.b(5);
                                              } else {
                                                this.a(1, si.field_j, param1, 1, 30, 1, tl.field_a, pk.field_s, (byte) 126);
                                              }
                                            } else {
                                              if (var4 == 22) {
                                                if (this.field_p <= 0) {
                                                  this.a(false, 120, param1);
                                                } else {
                                                  if (0 != this.field_r) {
                                                    this.a(113, param1);
                                                  } else {
                                                    if (this.field_x == 0) {
                                                      this.field_n = 19;
                                                      if (15 < this.field_w) {
                                                        this.field_n = 22;
                                                      }
                                                      fieldTemp$66 = this.field_w;
                                                      this.field_w = this.field_w + 1;
                                                      if (25 < fieldTemp$66) {
                                                        this.field_x = 2;
                                                        this.field_e = 70;
                                                        this.field_w = 0;
                                                        if (ii.field_e[0].field_i.field_a <= this.field_i.field_a) {
                                                          this.field_e = 50;
                                                        }
                                                      }
                                                    }
                                                    if (this.field_x == 2) {
                                                      this.a(false, param0 ^ -109, 25, param1);
                                                    }
                                                    if (this.field_x == 3) {
                                                      this.a(25, -92, false, param1);
                                                    }
                                                    this.e(false);
                                                  }
                                                }
                                              } else {
                                                if (var4 != 23 &&
                                                  31 != var4) {
                                                  if (var4 == 26) {
                                                    if (0 >= this.field_p) {
                                                      this.a(true, 120, param1);
                                                    } else {
                                                      if (w.field_b < 250) {
                                                        this.field_o = 7;
                                                        fieldTemp$60 = this.field_z;
                                                        this.field_z = this.field_z - 1;
                                                        if (fieldTemp$60 <= 0) {
                                                          this.field_n = this.field_n + 1;
                                                          if (this.field_n > 1) {
                                                            this.field_n = 0;
                                                          }
                                                          this.field_z = 5;
                                                        }
                                                        if (this.field_s > 0) {
                                                          w.field_b = 250;
                                                          this.field_s = this.field_s - 1;
                                                          this.field_x = 0;
                                                          if (pk.field_s) {
                                                            tl.field_a.a(si.field_j[26], 100, 256 * ee.field_p / 100);
                                                          }
                                                        }
                                                        w.field_b = w.field_b + 1;
                                                      } else {
                                                        w.field_b = w.field_b + 1;
                                                        if (0 == this.field_x) {
                                                          if (!(this.field_i.field_b > 0) ||
                                                            !(16 > this.field_i.field_b)) {
                                                            if (ii.field_e[0].field_i.field_a > this.field_i.field_a) {
                                                              this.field_x = 1;
                                                              this.field_w = 0;
                                                            }
                                                            if (ii.field_e[0].field_i.field_b > this.field_i.field_b) {
                                                              this.field_h = 1;
                                                            } else {
                                                              this.field_h = -1;
                                                            }
                                                            if (this.field_i.field_a > ii.field_e[0].field_i.field_a &&
                                                              this.field_i.field_a > 2) {
                                                              this.field_i.field_a = this.field_i.field_a - 1;
                                                              this.field_x = 3;
                                                              this.field_e = -20;
                                                              this.field_f.field_a = this.field_f.field_a + 230;
                                                            }
                                                          }
                                                          if (350 < w.field_b) {
                                                            w.field_b = 250;
                                                            this.field_x = 4;
                                                          }
                                                          if (this.field_x == 0) {
                                                            this.a(true, 0, 35, (byte) -120, param1);
                                                          }
                                                          if (3 == this.field_x) {
                                                            this.field_x = 5;
                                                          }
                                                        }
                                                        if (1 == this.field_x) {
                                                          fieldTemp$61 = this.field_w;
                                                          this.field_w = this.field_w + 1;
                                                          if (fieldTemp$61 > 5) {
                                                            this.field_e = 70;
                                                            this.field_x = 2;
                                                            this.field_w = 0;
                                                          }
                                                          this.field_n = 19;
                                                        }
                                                        if (this.field_x == 2) {
                                                          this.a(true, 22, 0, param1);
                                                        }
                                                        if (this.field_x == 3) {
                                                          this.a(0, -82, true, param1);
                                                        }
                                                        if (this.field_x == 5) {
                                                          this.a(25, param0 ^ 41, true, param1);
                                                          if (this.field_x == 3) {
                                                            this.field_x = 5;
                                                          }
                                                        }
                                                        if (this.field_x == 4 &&
                                                          this.a(true, param1, 25)) {
                                                          ii.field_e[od.field_k].a(9147, 27, this.field_i);
                                                          ii.field_e[od.field_k].field_f.a(-81, this.field_f);
                                                          dupTemp$62 = ii.field_e[od.field_k].field_f;
                                                          dupTemp$62.field_b = dupTemp$62.field_b + (40 + this.field_h * 240);
                                                          dupTemp$63 = ii.field_e[od.field_k].field_f;
                                                          dupTemp$63.field_a = dupTemp$63.field_a + 80;
                                                          ii.field_e[od.field_k].field_h = this.field_h;
                                                          ii.field_e[od.field_k].field_w = 0;
                                                          ii.field_e[od.field_k].field_e = 40;
                                                          ii.field_e[od.field_k].field_o = 5;
                                                          od.field_k = od.field_k + 1;
                                                          stackIn_773_0 = 0;
                                                          if (pk.field_s) {
                                                            stackIn_774_1 = 0;
                                                          } else {
                                                            stackIn_774_1 = 1;
                                                          }
                                                          if (stackIn_773_0 == stackIn_774_1) {
                                                            tl.field_a.a(nl.field_q[25], 100, ee.field_p * 256 / 100);
                                                          }
                                                        }
                                                        if (this.field_s > 0) {
                                                          this.field_p = this.field_p - 1;
                                                          this.field_s = this.field_s - 1;
                                                          if (this.field_p == 10 ||
                                                            this.field_p == 30) {
                                                            ii.field_e[od.field_k].a(param0 + 9270, 23, this.field_i);
                                                            ii.field_e[od.field_k].field_f.a(-94, this.field_f);
                                                            ii.field_e[od.field_k].field_i.field_b = 0;
                                                            ii.field_e[od.field_k].field_i.field_a = 16;
                                                            ii.field_e[od.field_k].field_f.field_b = 0;
                                                            ii.field_e[od.field_k].field_f.field_a = 0;
                                                            ii.field_e[od.field_k].field_h = 1;
                                                            ii.field_e[od.field_k].field_w = 10;
                                                            od.field_k = od.field_k + 1;
                                                            ii.field_e[od.field_k].a(9147, 23, this.field_i);
                                                            ii.field_e[od.field_k].field_f.a(-117, this.field_f);
                                                            ii.field_e[od.field_k].field_i.field_b = 19;
                                                            ii.field_e[od.field_k].field_i.field_a = 16;
                                                            ii.field_e[od.field_k].field_f.field_b = 0;
                                                            ii.field_e[od.field_k].field_f.field_a = 0;
                                                            ii.field_e[od.field_k].field_h = -1;
                                                            ii.field_e[od.field_k].field_w = 10;
                                                            od.field_k = od.field_k + 1;
                                                          }
                                                          stackIn_784_0 = (pk.field_s) ? 0 : 1;
                                                          if (stackIn_784_0 != 1) {
                                                            tl.field_a.a(si.field_j[26], 100, ee.field_p * 256 / 100);
                                                          }
                                                          if (this.field_p <= 0) {
                                                            this.c(false);
                                                            this.field_e = 70;
                                                          }
                                                        }
                                                      }
                                                      this.e(false);
                                                    }
                                                  } else {
                                                    if (var4 == 27) {
                                                      this.a(1, si.field_j, param1, 1, 40, 0, tl.field_a, pk.field_s, (byte) 126);
                                                      this.e(false);
                                                      if (((this.b(param1, -4) == 1)) &&
                                                        ((this.field_f.field_a == 0))) {
                                                        this.field_d = 24;
                                                        this.field_f.field_b = this.field_f.field_b + 40;
                                                        this.field_e = 50;
                                                        this.field_B = 28;
                                                        this.field_f.field_a = this.field_f.field_a + 40;
                                                        ii.field_e[od.field_k].a(9147, 28, this.field_i);
                                                        ii.field_e[od.field_k].field_f.a(-116, this.field_f);
                                                        ii.field_e[od.field_k].field_h = -this.field_h;
                                                        ii.field_e[od.field_k].field_w = 0;
                                                        ii.field_e[od.field_k].field_e = 50;
                                                        ii.field_e[od.field_k].field_o = 5;
                                                        od.field_k = od.field_k + 1;
                                                        stackIn_808_0 = (pk.field_s) ? 0 : 1;
                                                        if ((stackIn_808_0 != 1)) {
                                                          tl.field_a.a(si.field_j[5], 100, ee.field_p * 256 / 100);
                                                        }
                                                      }
                                                    } else {
                                                      if (var4 == 28) {
                                                        this.a(1, si.field_j, param1, 1, 20, 0, tl.field_a, pk.field_s, (byte) -50);
                                                        this.e(false);
                                                        if (((this.b(param1, -4) == 1)) &&
                                                          ((this.field_f.field_a == 0))) {
                                                          this.field_k = 1;
                                                          stackIn_817_0 = (pk.field_s) ? 0 : 1;
                                                          if ((stackIn_817_0 != 1)) {
                                                            tl.field_a.a(si.field_j[5], 100, ee.field_p * 256 / 100);
                                                          }
                                                        }
                                                      } else {
                                                        if (29 == var4) {
                                                          if (0 >= this.field_p) {
                                                            this.a(false, 120, param1);
                                                          } else {
                                                            if (this.field_r != 0) {
                                                              this.a(120, param1);
                                                            } else {
                                                              if (0 == this.field_x) {
                                                                if (ii.field_e[0].field_i.field_a > this.field_i.field_a) {
                                                                  this.field_w = this.field_w + 1;
                                                                }
                                                                this.a(false, 2, 20, (byte) -88, param1);
                                                                fieldTemp$56 = this.field_w;
                                                                this.field_w = this.field_w + 1;
                                                                if (fieldTemp$56 > 200) {
                                                                  if (this.field_i.field_b > ii.field_e[0].field_i.field_b) {
                                                                    stackIn_833_1 = -1;
                                                                  } else {
                                                                    stackIn_833_1 = 1;
                                                                  }
                                                                  this.field_h = stackIn_833_1;
                                                                  this.field_w = 0;
                                                                  this.field_x = 1;
                                                                  this.field_z = 0;
                                                                  if (100.0 * Math.random() < 50.0) {
                                                                    this.field_x = 4;
                                                                  }
                                                                }
                                                              }
                                                              if (this.field_x == 1) {
                                                                fieldTemp$57 = this.field_w;
                                                                this.field_w = this.field_w + 1;
                                                                if (fieldTemp$57 > 25) {
                                                                  this.field_x = 2;
                                                                  this.field_w = 0;
                                                                  this.field_e = 70;
                                                                }
                                                                this.field_n = 19;
                                                              }
                                                              if (2 == this.field_x) {
                                                                this.a(false, 22, 15, param1);
                                                                if (this.field_x == 0) {
                                                                  this.field_z = 0;
                                                                  this.field_w = (int)(Math.random() * 100.0);
                                                                }
                                                              }
                                                              if (this.field_x == 3) {
                                                                this.a(15, param0 + 23, false, param1);
                                                                if (this.field_x == 0) {
                                                                  this.field_z = 0;
                                                                  this.field_w = (int)(100.0 * Math.random());
                                                                }
                                                              }
                                                              if (4 == this.field_x) {
                                                                if (this.a(false, param1, 25)) {
                                                                  ii.field_e[od.field_k].a(9147, 34, this.field_i);
                                                                  ii.field_e[od.field_k].field_f.a(-108, this.field_f);
                                                                  dupTemp$58 = ii.field_e[od.field_k].field_f;
                                                                  dupTemp$58.field_b = dupTemp$58.field_b + (this.field_h * 120 + 40);
                                                                  dupTemp$59 = ii.field_e[od.field_k].field_f;
                                                                  dupTemp$59.field_a = dupTemp$59.field_a + 40;
                                                                  ii.field_e[od.field_k].field_h = this.field_h;
                                                                  ii.field_e[od.field_k].field_w = 10;
                                                                  od.field_k = od.field_k + 1;
                                                                  if (pk.field_s) {
                                                                    tl.field_a.a(si.field_j[13], 100, 256 * ee.field_p / 100);
                                                                  }
                                                                }
                                                                if (this.field_x == 0) {
                                                                  this.field_x = 1;
                                                                }
                                                              }
                                                              this.e(false);
                                                            }
                                                          }
                                                        } else {
                                                          if (var4 == 30) {
                                                            if (this.field_p <= 0) {
                                                              this.a(false, 120, param1);
                                                            } else {
                                                              if (this.field_r != 0) {
                                                                this.a(100, param1);
                                                              } else {
                                                                if (this.field_x == 0) {
                                                                  if (this.field_i.field_a < ii.field_e[0].field_i.field_a) {
                                                                    this.field_w = this.field_w + 1;
                                                                  }
                                                                  this.a(false, 2, 20, (byte) -78, param1);
                                                                  fieldTemp$30 = this.field_w;
                                                                  this.field_w = this.field_w + 1;
                                                                  if (200 < fieldTemp$30) {
                                                                    this.field_x = 1;
                                                                    if (this.field_i.field_b <= ii.field_e[0].field_i.field_b) {
                                                                      stackIn_871_1 = -1;
                                                                    } else {
                                                                      stackIn_871_1 = 1;
                                                                    }
                                                                    this.field_h = stackIn_871_1;
                                                                    this.field_z = 0;
                                                                    this.field_w = 0;
                                                                    if (80.0 > 100.0 * Math.random()) {
                                                                      this.field_x = 4;
                                                                      if (ii.field_e[0].field_i.field_b >= this.field_i.field_b) {
                                                                        stackIn_875_1 = 1;
                                                                      } else {
                                                                        stackIn_875_1 = -1;
                                                                      }
                                                                      this.field_h = stackIn_875_1;
                                                                    }
                                                                  }
                                                                }
                                                                if (this.field_x == 1) {
                                                                  fieldTemp$31 = this.field_w;
                                                                  this.field_w = this.field_w + 1;
                                                                  if (fieldTemp$31 > 25) {
                                                                    this.field_e = 70;
                                                                    this.field_w = 0;
                                                                    this.field_x = 2;
                                                                  }
                                                                  this.field_n = 19;
                                                                }
                                                                if (2 == this.field_x) {
                                                                  this.a(false, 22, 25, param1);
                                                                  if (this.field_x == 0) {
                                                                    this.field_z = 0;
                                                                    this.field_w = (int)(100.0 * Math.random());
                                                                  }
                                                                }
                                                                if (this.field_x == 3) {
                                                                  this.a(25, -128, false, param1);
                                                                  if (this.field_x == 0) {
                                                                    this.field_z = 0;
                                                                    this.field_w = (int)(Math.random() * 100.0);
                                                                  }
                                                                }
                                                                if (this.field_x == 4 &&
                                                                  this.a(false, param1, param0 ^ -100)) {
                                                                  ii.field_e[od.field_k].a(9147, 35, this.field_i);
                                                                  ii.field_e[od.field_k].field_f.a(-103, this.field_f);
                                                                  dupTemp$32 = ii.field_e[od.field_k].field_f;
                                                                  dupTemp$32.field_b = dupTemp$32.field_b + (40 + 120 * this.field_h);
                                                                  dupTemp$33 = ii.field_e[od.field_k].field_f;
                                                                  dupTemp$33.field_a = dupTemp$33.field_a + 520;
                                                                  ii.field_e[od.field_k].field_h = this.field_h;
                                                                  ii.field_e[od.field_k].field_w = 0;
                                                                  od.field_k = od.field_k + 1;
                                                                  stackIn_896_0 = 0;
                                                                  if (pk.field_s) {
                                                                    stackIn_897_1 = 0;
                                                                  } else {
                                                                    stackIn_897_1 = 1;
                                                                  }
                                                                  if (stackIn_896_0 == stackIn_897_1) {
                                                                    tl.field_a.a(si.field_j[13], 100, ee.field_p * 256 / 100);
                                                                  }
                                                                }
                                                                this.e(false);
                                                              }
                                                            }
                                                          } else {
                                                            if (32 == var4) {
                                                              if (this.field_p <= 0) {
                                                                this.a(false, param0 ^ -3, param1);
                                                              } else {
                                                                if (this.field_r != 0) {
                                                                  this.a(param0 + 150, param1);
                                                                } else {
                                                                  if (this.field_x == 0) {
                                                                    if (ii.field_e[0].field_i.field_a > this.field_i.field_a) {
                                                                      this.field_w = this.field_w + 1;
                                                                    }
                                                                    this.a(false, 2, 20, (byte) -92, param1);
                                                                    fieldTemp$34 = this.field_w;
                                                                    this.field_w = this.field_w + 1;
                                                                    if (200 < fieldTemp$34) {
                                                                      this.field_w = 0;
                                                                      this.field_z = 0;
                                                                      this.field_x = 3;
                                                                    }
                                                                  }
                                                                  if (3 == this.field_x) {
                                                                    this.field_n = this.field_n - 4;
                                                                    this.a(20, (byte) 116, param1, false);
                                                                    this.field_n = this.field_n + 4;
                                                                    fieldTemp$35 = this.field_w;
                                                                    this.field_w = this.field_w + 1;
                                                                    if (fieldTemp$35 > 300 &&
                                                                      1 == this.b(param1, param0 ^ 121) &&
                                                                      this.field_f.field_a == 0) {
                                                                      this.field_x = 0;
                                                                      this.field_w = 0;
                                                                    }
                                                                    if (this.field_w % 100 == 25) {
                                                                      ii.field_e[od.field_k].a(9147, 42, this.field_i);
                                                                      ii.field_e[od.field_k].field_f.a(param0 ^ 26, this.field_f);
                                                                      dupTemp$36 = ii.field_e[od.field_k].field_f;
                                                                      dupTemp$36.field_b = dupTemp$36.field_b + (this.field_h * 120 + 40);
                                                                      dupTemp$37 = ii.field_e[od.field_k].field_f;
                                                                      dupTemp$37.field_a = dupTemp$37.field_a + 40;
                                                                      ii.field_e[od.field_k].field_h = this.field_h;
                                                                      ii.field_e[od.field_k].field_w = 0;
                                                                      od.field_k = od.field_k + 1;
                                                                      if (pk.field_s) {
                                                                        tl.field_a.a(si.field_j[13], 100, ee.field_p * 256 / 100);
                                                                      }
                                                                    }
                                                                    if (this.field_w % 100 > 20 &&
                                                                      this.field_w % 100 < 30) {
                                                                      this.field_n = 26;
                                                                    } else {
                                                                      if (10 < this.field_n) {
                                                                        this.field_n = 6;
                                                                      }
                                                                    }
                                                                  }
                                                                  this.e(false);
                                                                }
                                                              }
                                                            } else {
                                                              if (var4 == 33) {
                                                                if (250 > w.field_b) {
                                                                  this.field_o = 7;
                                                                  fieldTemp$55 = this.field_z;
                                                                  this.field_z = this.field_z - 1;
                                                                  if (fieldTemp$55 <= 0) {
                                                                    this.field_n = this.field_n + 1;
                                                                    if (1 < this.field_n) {
                                                                      this.field_n = 0;
                                                                    }
                                                                    this.field_z = 5;
                                                                  }
                                                                  if (this.field_s > 0) {
                                                                    w.field_b = 250;
                                                                    this.field_s = this.field_s - 1;
                                                                    this.field_x = 0;
                                                                    if (pk.field_s) {
                                                                      tl.field_a.a(si.field_j[27], 100, ee.field_p * 256 / 100);
                                                                    }
                                                                  }
                                                                  w.field_b = w.field_b + 1;
                                                                } else {
                                                                  if (this.field_p <= 0) {
                                                                    this.a(true, 120, param1);
                                                                  } else {
                                                                    var4 = 10;
                                                                    if (50 > this.field_p) {
                                                                      var4 = 15;
                                                                    }
                                                                    if (15 > this.field_p) {
                                                                      var4 = 20;
                                                                    }
                                                                    this.a(var4, (byte) -113, param1, true);
                                                                    this.field_w = this.field_w + 1;
                                                                    if (25 == this.field_w % 50 &&
                                                                      this.field_w < 250) {
                                                                      ii.field_e[od.field_k].a(9147, 43, this.field_i);
                                                                      ii.field_e[od.field_k].field_f.a(-112, this.field_f);
                                                                      dupTemp$53 = ii.field_e[od.field_k].field_f;
                                                                      dupTemp$53.field_b = dupTemp$53.field_b + (this.field_h * 120 + 40);
                                                                      dupTemp$54 = ii.field_e[od.field_k].field_f;
                                                                      dupTemp$54.field_a = dupTemp$54.field_a + 40;
                                                                      ii.field_e[od.field_k].field_h = this.field_h;
                                                                      ii.field_e[od.field_k].field_w = 0;
                                                                      od.field_k = od.field_k + 1;
                                                                      if (pk.field_s) {
                                                                        tl.field_a.a(si.field_j[13], 100, 256 * ee.field_p / 100);
                                                                      }
                                                                    }
                                                                    if (this.field_w < 250) {
                                                                      if (this.field_w % 50 > 5 &&
                                                                        this.field_w % 50 < 10) {
                                                                        this.field_n = 25;
                                                                      }
                                                                      if (this.field_w % 50 > 15 &&
                                                                        this.field_w % 50 < 20) {
                                                                        this.field_n = 26;
                                                                      }
                                                                      if (this.field_w % 50 > 20 &&
                                                                        this.field_w % 50 < 25) {
                                                                        this.field_n = 27;
                                                                      }
                                                                      if (this.field_w % 50 > 25 &&
                                                                        30 > this.field_w % 50) {
                                                                        if (ii.field_e[0].field_i.field_b < this.field_i.field_b) {
                                                                          stackIn_972_1 = -1;
                                                                        } else {
                                                                          stackIn_972_1 = 1;
                                                                        }
                                                                        this.field_h = stackIn_972_1;
                                                                        this.field_n = 28;
                                                                      }
                                                                    }
                                                                    if (this.field_w > 300 &&
                                                                      this.field_p < 15) {
                                                                      this.field_w = this.field_w - 300;
                                                                    }
                                                                    if (400 < this.field_w) {
                                                                      this.field_w = this.field_w - 400;
                                                                    }
                                                                    this.e(false);
                                                                    if (!(this.field_s <= 0)) {
                                                                      this.field_s = this.field_s - 1;
                                                                      this.field_p = this.field_p - 1;
                                                                      if (this.field_p == 50 ||
                                                                        this.field_p == 30) {
                                                                        ii.field_e[od.field_k].a(9147, 32, this.field_i);
                                                                        ii.field_e[od.field_k].field_f.a(param0 ^ 2, this.field_f);
                                                                        ii.field_e[od.field_k].field_i.field_b = 10;
                                                                        ii.field_e[od.field_k].field_i.field_a = 16;
                                                                        ii.field_e[od.field_k].field_f.field_b = 0;
                                                                        ii.field_e[od.field_k].field_f.field_a = 0;
                                                                        ii.field_e[od.field_k].field_h = 1;
                                                                        ii.field_e[od.field_k].field_w = 10;
                                                                        od.field_k = od.field_k + 1;
                                                                      }
                                                                      if (pk.field_s) {
                                                                        tl.field_a.a(si.field_j[27], 100, 256 * ee.field_p / 100);
                                                                      }
                                                                      if (!(this.field_p > 0)) {
                                                                        this.c(false);
                                                                        this.field_e = 70;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                if (var4 == 34) {
                                                                  this.field_e = 2;
                                                                  this.a(1, si.field_j, param1, 1, 60, 0, tl.field_a, pk.field_s, (byte) 126);
                                                                  this.e(false);
                                                                } else {
                                                                  if (35 != var4 &&
                                                                    var4 != 43) {
                                                                    if (var4 == 36) {
                                                                      if (this.field_p <= 0) {
                                                                        this.a(false, param0 ^ -3, param1);
                                                                      } else {
                                                                        if (this.field_r != 0) {
                                                                          this.field_r = 0;
                                                                          this.field_p = 0;
                                                                        } else {
                                                                          if (this.field_x == 0) {
                                                                            if (ii.field_e[0].field_i.field_a > this.field_i.field_a) {
                                                                              this.field_w = 0;
                                                                              if (ii.field_e[0].field_i.field_b <= this.field_i.field_b - 5) {
                                                                                this.field_h = -1;
                                                                              }
                                                                              this.field_e = 30;
                                                                              this.field_x = 2;
                                                                              if (this.field_i.field_b + 5 <= ii.field_e[0].field_i.field_b) {
                                                                                this.field_h = 1;
                                                                              }
                                                                            } else {
                                                                              this.a(false, 1, 15, (byte) -102, param1);
                                                                            }
                                                                          }
                                                                          if (2 == this.field_x) {
                                                                            this.a(false, 22, 10, param1);
                                                                          }
                                                                          if (3 == this.field_x) {
                                                                            this.a(10, param0 ^ 26, false, param1);
                                                                          }
                                                                          if (500 < this.field_w) {
                                                                            this.field_p = 0;
                                                                          }
                                                                          this.e(false);
                                                                        }
                                                                      }
                                                                    } else {
                                                                      if (37 == var4) {
                                                                        if (this.field_p <= 0) {
                                                                          this.a(false, 120, param1);
                                                                        } else {
                                                                          if (0 != this.field_r) {
                                                                            this.a(116, param1);
                                                                          } else {
                                                                            if (this.field_x == 0) {
                                                                              this.a(false, 1, 15, (byte) -64, param1);
                                                                              if (ii.field_e[0].field_i.field_a > this.field_i.field_a) {
                                                                                this.field_w = this.field_w + 5;
                                                                              }
                                                                              fieldTemp$38 = this.field_w;
                                                                              this.field_w = this.field_w + 1;
                                                                              if (fieldTemp$38 > 200) {
                                                                                this.field_w = 0;
                                                                                if (ii.field_e[0].field_i.field_b < this.field_i.field_b) {
                                                                                  stackIn_1043_1 = -1;
                                                                                } else {
                                                                                  stackIn_1043_1 = 1;
                                                                                }
                                                                                this.field_h = stackIn_1043_1;
                                                                                this.field_x = 1;
                                                                              }
                                                                            }
                                                                            if (this.field_x == 1) {
                                                                              this.field_n = 19;
                                                                              fieldTemp$39 = this.field_w;
                                                                              this.field_w = this.field_w + 1;
                                                                              if (80 < fieldTemp$39) {
                                                                                this.field_e = 85;
                                                                                this.field_x = 2;
                                                                                this.field_w = 0;
                                                                                if (this.field_i.field_a >= ii.field_e[0].field_i.field_a) {
                                                                                  this.field_e = 35;
                                                                                }
                                                                              }
                                                                            }
                                                                            if (this.field_x == 2) {
                                                                              this.a(false, 22, 30, param1);
                                                                              if (this.field_x == 0) {
                                                                                this.field_w = (int)(Math.random() * 100.0);
                                                                              }
                                                                            }
                                                                            if (3 == this.field_x) {
                                                                              this.a(15, -80, false, param1);
                                                                              if (this.field_x == 0) {
                                                                                this.field_w = (int)(Math.random() * 100.0);
                                                                              }
                                                                            }
                                                                            this.e(false);
                                                                          }
                                                                        }
                                                                      } else {
                                                                        if (var4 == 38) {
                                                                          if (this.field_p <= 0) {
                                                                            this.a(false, 120, param1);
                                                                          } else {
                                                                            if (this.field_r != 0) {
                                                                              this.a(60, param1);
                                                                            } else {
                                                                              if (0 == this.field_x) {
                                                                                if (this.field_i.field_a < ii.field_e[0].field_i.field_a) {
                                                                                  this.field_w = this.field_w + 5;
                                                                                }
                                                                                this.a(false, 1, 25, (byte) -90, param1);
                                                                                fieldTemp$51 = this.field_w;
                                                                                this.field_w = this.field_w + 1;
                                                                                if (200 < fieldTemp$51) {
                                                                                  if (this.field_i.field_b <= ii.field_e[0].field_i.field_b) {
                                                                                    stackIn_1071_1 = 1;
                                                                                  } else {
                                                                                    stackIn_1071_1 = -1;
                                                                                  }
                                                                                  this.field_h = stackIn_1071_1;
                                                                                  this.field_x = 1;
                                                                                  this.field_w = 0;
                                                                                }
                                                                              }
                                                                              if (this.field_x == 1) {
                                                                                this.field_n = 19;
                                                                                fieldTemp$52 = this.field_w;
                                                                                this.field_w = this.field_w + 1;
                                                                                if (fieldTemp$52 > 20) {
                                                                                  this.field_w = 0;
                                                                                  this.field_e = 70;
                                                                                  this.field_x = 2;
                                                                                  if (this.field_i.field_a >= ii.field_e[0].field_i.field_a) {
                                                                                    this.field_e = 40;
                                                                                  }
                                                                                }
                                                                              }
                                                                              if (2 == this.field_x) {
                                                                                this.a(false, param0 ^ -109, 25, param1);
                                                                                if (0 == this.field_x) {
                                                                                  this.field_w = (int)(100.0 * Math.random());
                                                                                }
                                                                              }
                                                                              if (this.field_x == 3) {
                                                                                this.a(25, -81, false, param1);
                                                                                if (this.field_x == 0) {
                                                                                  this.field_w = (int)(100.0 * Math.random());
                                                                                }
                                                                              }
                                                                              this.e(false);
                                                                            }
                                                                          }
                                                                        } else {
                                                                          if (var4 == 39) {
                                                                            if (this.field_p <= 0) {
                                                                              this.a(false, param0 ^ -3, param1);
                                                                            } else {
                                                                              if (this.field_r != 0) {
                                                                                this.a(35, param1);
                                                                              } else {
                                                                                if (this.field_x == 0) {
                                                                                  if (ii.field_e[0].field_i.field_a > this.field_i.field_a) {
                                                                                    this.field_w = this.field_w + 1;
                                                                                  }
                                                                                  this.a(false, 2, 20, (byte) -122, param1);
                                                                                  fieldTemp$49 = this.field_w;
                                                                                  this.field_w = this.field_w + 1;
                                                                                  if (200 < fieldTemp$49) {
                                                                                    this.field_x = 3;
                                                                                    this.field_z = 0;
                                                                                    this.field_w = 0;
                                                                                  }
                                                                                }
                                                                                if (this.field_x == 3) {
                                                                                  this.field_n = this.field_n - 4;
                                                                                  this.a(10, (byte) -13, param1, false);
                                                                                  this.a(10, (byte) 118, param1, false);
                                                                                  this.field_n = this.field_n + 4;
                                                                                  fieldTemp$50 = this.field_w;
                                                                                  this.field_w = this.field_w + 1;
                                                                                  if (fieldTemp$50 > 300 &&
                                                                                    this.b(param1, -4) == 1 &&
                                                                                    this.field_f.field_a == 0) {
                                                                                    this.field_w = 0;
                                                                                    this.field_x = 0;
                                                                                  }
                                                                                  if (this.field_n > 10) {
                                                                                    this.field_n = 6;
                                                                                  }
                                                                                }
                                                                                this.e(false);
                                                                              }
                                                                            }
                                                                          } else {
                                                                            if (40 != var4) {
                                                                              switch (var4) {
                                                                                case 41:
                                                                                  this.field_e = 2;
                                                                                  this.a(1, si.field_j, param1, 1, 100, 0, tl.field_a, pk.field_s, (byte) -126);
                                                                                  this.e(false);
                                                                                  this.field_w = this.field_w + 1;
                                                                                  if (this.field_w % 10 >= 5) {
                                                                                    this.field_n = 37;
                                                                                  } else {
                                                                                    this.field_n = 18;
                                                                                  }
                                                                                  if (50 > this.field_w % 100) {
                                                                                    this.field_f.field_a = this.field_f.field_a + (-(this.field_w % 50) + 50 - 25) / 4;
                                                                                  } else {
                                                                                    this.field_f.field_a = this.field_f.field_a + (-25 + this.field_w % 50) / 4;
                                                                                  }
                                                                                  this.e(false);
                                                                                  break L2;
                                                                                case 42:
                                                                                  this.field_e = 2;
                                                                                  this.a(1, si.field_j, param1, 1, 50, 0, tl.field_a, pk.field_s, (byte) 126);
                                                                                  this.e(false);
                                                                                  break L2;
                                                                                case 44:
                                                                                  this.field_w = this.field_w + 1;
                                                                                  if (this.field_w > 150) {
                                                                                    this.field_k = 1;
                                                                                  }
                                                                                  this.field_f.field_a = this.field_f.field_a + 4;
                                                                                  break L2;
                                                                                default:
                                                                                  break L2;
                                                                                case 45:
                                                                                  this.field_n = 36;
                                                                                  if (this.field_w % 10 > 5) {
                                                                                    this.field_n = 37;
                                                                                  }
                                                                                  fieldTemp$40 = this.field_w;
                                                                                  this.field_w = this.field_w + 1;
                                                                                  if (fieldTemp$40 > 50) {
                                                                                    this.field_k = 1;
                                                                                  }
                                                                                  this.e(false);
                                                                                  break L2;
                                                                              }
                                                                            }
                                                                            if (this.field_p <= 0) {
                                                                              this.a(true, 120, param1);
                                                                            } else {
                                                                              if (ql.field_c < 5) {
                                                                                me.field_f = me.field_f - 5;
                                                                                hi.field_c = hi.field_c - ql.field_c;
                                                                                ql.field_c = 5;
                                                                              }
                                                                              if (this.field_s > 0) {
                                                                                if (ql.field_c == 6) {
                                                                                  ii.field_e[od.field_k].a(param0 ^ -9154, 36, this.field_i);
                                                                                  ii.field_e[od.field_k].field_f.a(-110, this.field_f);
                                                                                  dupTemp$41 = ii.field_e[od.field_k].field_f;
                                                                                  dupTemp$41.field_b = dupTemp$41.field_b + (40 + this.field_h * 120);
                                                                                  dupTemp$42 = ii.field_e[od.field_k].field_f;
                                                                                  dupTemp$42.field_a = dupTemp$42.field_a + 40;
                                                                                  ii.field_e[od.field_k].field_h = this.field_h;
                                                                                  ii.field_e[od.field_k].field_w = 0;
                                                                                  od.field_k = od.field_k + 1;
                                                                                }
                                                                                this.field_p = this.field_p - 1;
                                                                                this.field_s = this.field_s - 1;
                                                                                if (this.field_p <= 0) {
                                                                                  this.c(false);
                                                                                }
                                                                                if (pk.field_s) {
                                                                                  tl.field_a.a(si.field_j[28], 100, 256 * ee.field_p / 100);
                                                                                }
                                                                              }
                                                                              if (5 == ql.field_c) {
                                                                                this.field_w = this.field_w + 1;
                                                                                this.field_d = 80;
                                                                                fieldTemp$43 = this.field_z;
                                                                                this.field_z = this.field_z - 1;
                                                                                if (0 > fieldTemp$43) {
                                                                                  this.field_z = 10;
                                                                                  this.field_n = this.field_n + 1;
                                                                                  if (this.field_n > 3) {
                                                                                    this.field_n = 0;
                                                                                  }
                                                                                }
                                                                                if (this.field_w == 500 ||
                                                                                  this.field_w == 2500) {
                                                                                  ii.field_e[od.field_k].a(param0 + 9270, 39, this.field_i);
                                                                                  ii.field_e[od.field_k].field_i.field_b = 0;
                                                                                  ii.field_e[od.field_k].field_i.field_a = 15;
                                                                                  ii.field_e[od.field_k].field_h = 1;
                                                                                  ii.field_e[od.field_k].field_w = 0;
                                                                                  od.field_k = od.field_k + 1;
                                                                                }
                                                                                if (this.field_w == 1500) {
                                                                                  ii.field_e[od.field_k].a(param0 ^ -9154, 39, this.field_i);
                                                                                  ii.field_e[od.field_k].field_i.field_b = 19;
                                                                                  ii.field_e[od.field_k].field_i.field_a = 15;
                                                                                  ii.field_e[od.field_k].field_h = 1;
                                                                                  ii.field_e[od.field_k].field_w = 0;
                                                                                  od.field_k = od.field_k + 1;
                                                                                }
                                                                                if (3000 < this.field_w ||
                                                                                  this.field_p < 150) {
                                                                                  this.field_d = 96;
                                                                                  wg.field_b = wg.field_b - ql.field_c;
                                                                                  ic.field_a = ic.field_a - 6;
                                                                                  this.field_n = 0;
                                                                                  this.field_w = 0;
                                                                                  this.field_f.field_b = this.field_f.field_b - 40;
                                                                                  ql.field_c = 6;
                                                                                  this.field_x = 0;
                                                                                  if (pk.field_s) {
                                                                                    tl.field_a.a(si.field_j[22], 100, ee.field_p * 256 / 100);
                                                                                  }
                                                                                }
                                                                              }
                                                                              if (ql.field_c == 6) {
                                                                                if (0 == this.field_x ||
                                                                                  this.field_x == 1) {
                                                                                  this.field_n = 0;
                                                                                  if (this.field_w < 0) {
                                                                                    this.field_n = 3;
                                                                                  }
                                                                                  fieldTemp$44 = this.field_w;
                                                                                  this.field_w = this.field_w + 1;
                                                                                  if (10 < fieldTemp$44) {
                                                                                    this.field_w = 0;
                                                                                    this.field_e = 100;
                                                                                    this.field_x = 2;
                                                                                    if (ii.field_e[0].field_i.field_a <= this.field_i.field_a) {
                                                                                      this.field_e = 70;
                                                                                    }
                                                                                    if (this.field_i.field_b > ii.field_e[0].field_i.field_b) {
                                                                                      stackIn_1157_1 = -1;
                                                                                    } else {
                                                                                      stackIn_1157_1 = 1;
                                                                                    }
                                                                                    this.field_h = stackIn_1157_1;
                                                                                  }
                                                                                }
                                                                                if (2 == this.field_x) {
                                                                                  this.a(true, 22, 15, param1);
                                                                                  this.field_n = 1;
                                                                                  if (this.field_e < 60) {
                                                                                    this.field_n = 2;
                                                                                  }
                                                                                }
                                                                                if (3 == this.field_x) {
                                                                                  this.a(15, param0 + 7, true, param1);
                                                                                  this.field_n = 2;
                                                                                  if (this.field_x == 0) {
                                                                                    this.field_w = -10;
                                                                                    if (this.field_i.field_a > ii.field_e[0].field_i.field_a &&
                                                                                      this.field_i.field_a > 2) {
                                                                                      this.field_i.field_a = this.field_i.field_a - 1;
                                                                                      this.field_f.field_a = this.field_f.field_a + 230;
                                                                                      this.field_x = 3;
                                                                                    } else {
                                                                                      this.field_n = 3;
                                                                                      ii.field_e[od.field_k].a(9147, 45, this.field_i);
                                                                                      ii.field_e[od.field_k].field_f.a(-88, this.field_f);
                                                                                      ii.field_e[od.field_k].field_w = 0;
                                                                                      od.field_k = od.field_k + 1;
                                                                                      if (pk.field_s) {
                                                                                        tl.field_a.a(si.field_j[5], 100, ee.field_p * 256 / 100);
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                if (75 > this.field_p &&
                                                                                  this.field_x != 4) {
                                                                                  this.field_e = 60;
                                                                                  this.field_x = 4;
                                                                                }
                                                                                if (this.field_x == 4) {
                                                                                  this.a(10, param0 ^ 20, true, param1);
                                                                                  if (3 == this.field_x) {
                                                                                    this.field_x = 4;
                                                                                  }
                                                                                  this.field_n = 31;
                                                                                  if (this.field_x == 0) {
                                                                                    if (2 >= this.field_i.field_a) {
                                                                                      this.field_i.field_a = 2;
                                                                                      this.field_n = 2;
                                                                                      this.field_f.field_a = 0;
                                                                                      me.field_f = me.field_f + ql.field_c;
                                                                                      w.field_b = 0;
                                                                                      hi.field_c = hi.field_c + 7;
                                                                                      this.field_x = 0;
                                                                                      this.field_d = 128;
                                                                                      this.field_w = 0;
                                                                                      ql.field_c = 7;
                                                                                      this.field_f.field_b = this.field_f.field_b - 40;
                                                                                      this.field_n = 0;
                                                                                      stackIn_1184_0 = 0;
                                                                                      if (pk.field_s) {
                                                                                        stackIn_1185_1 = 0;
                                                                                      } else {
                                                                                        stackIn_1185_1 = 1;
                                                                                      }
                                                                                      if (stackIn_1184_0 == stackIn_1185_1) {
                                                                                        tl.field_a.a(si.field_j[5], 100, 256 * ee.field_p / 100);
                                                                                      }
                                                                                    } else {
                                                                                      this.field_i.field_a = this.field_i.field_a - 1;
                                                                                      this.field_x = 4;
                                                                                      this.field_f.field_a = this.field_f.field_a + 230;
                                                                                    }
                                                                                  }
                                                                                }
                                                                              }
                                                                              if (ql.field_c == 7) {
                                                                                if (w.field_b < 250) {
                                                                                  fieldTemp$45 = this.field_z;
                                                                                  this.field_z = this.field_z - 1;
                                                                                  if (0 >= fieldTemp$45) {
                                                                                    this.field_n = this.field_n + 1;
                                                                                    if (this.field_n > 1) {
                                                                                      this.field_n = 0;
                                                                                    }
                                                                                    this.field_z = 5;
                                                                                  }
                                                                                  this.field_o = 7;
                                                                                  this.field_p = 75;
                                                                                  w.field_b = w.field_b + 1;
                                                                                  if (200 < w.field_b) {
                                                                                    this.field_n = 23;
                                                                                    stackIn_1239_0 = 0;
                                                                                    if (pk.field_s) {
                                                                                      stackIn_1240_1 = 0;
                                                                                    } else {
                                                                                      stackIn_1240_1 = 1;
                                                                                    }
                                                                                    if (stackIn_1239_0 == stackIn_1240_1) {
                                                                                      tl.field_a.a(si.field_j[22], 100, 256 * ee.field_p / 100);
                                                                                    }
                                                                                  }
                                                                                  if (250 <= w.field_b) {
                                                                                    this.field_z = 0;
                                                                                    this.field_x = 0;
                                                                                    this.field_w = 0;
                                                                                    this.field_n = 25;
                                                                                  }
                                                                                } else {
                                                                                  if (this.field_x == 0) {
                                                                                    this.field_z = this.field_z + 1;
                                                                                    if (10 < this.field_z) {
                                                                                      this.field_n = this.field_n + 1;
                                                                                      if (this.field_n == 27) {
                                                                                        ii.field_e[od.field_k].a(9147, 41, this.field_i);
                                                                                        ii.field_e[od.field_k].field_f.a(-85, this.field_f);
                                                                                        dupTemp$46 = ii.field_e[od.field_k].field_f;
                                                                                        dupTemp$46.field_b = dupTemp$46.field_b + (40 + this.field_h * 120);
                                                                                        dupTemp$47 = ii.field_e[od.field_k].field_f;
                                                                                        dupTemp$47.field_a = dupTemp$47.field_a + 40;
                                                                                        ii.field_e[od.field_k].field_h = this.field_h;
                                                                                        ii.field_e[od.field_k].field_w = (int)(Math.random() * 100.0);
                                                                                        od.field_k = od.field_k + 1;
                                                                                        if (pk.field_s) {
                                                                                          tl.field_a.a(nl.field_q[36], 100, 192 * ee.field_p / 100);
                                                                                        }
                                                                                      }
                                                                                      if (25 > this.field_n) {
                                                                                        this.field_n = 25;
                                                                                      }
                                                                                      if (this.field_n > 27) {
                                                                                        this.field_n = 19;
                                                                                        this.field_w = this.field_w + 1;
                                                                                      }
                                                                                    }
                                                                                    if (this.field_w > 8) {
                                                                                      this.field_w = 0;
                                                                                      this.field_x = 2;
                                                                                      this.field_z = 0;
                                                                                      this.field_e = 5;
                                                                                      if (ii.field_e[0].field_i.field_a > 2 + this.field_i.field_a) {
                                                                                        this.field_e = 80;
                                                                                      }
                                                                                      if (ii.field_e[0].field_i.field_a < this.field_i.field_a) {
                                                                                        this.field_i.field_a = this.field_i.field_a - 1;
                                                                                        this.field_f.field_a = this.field_f.field_a + 230;
                                                                                        this.field_e = -5;
                                                                                        this.field_x = 3;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  if (this.field_x == 2) {
                                                                                    this.a(false, 22, 25, param1);
                                                                                    if (this.field_e <= 0) {
                                                                                      this.field_x = 3;
                                                                                    }
                                                                                    this.field_n = 21;
                                                                                  }
                                                                                  if (this.field_x == 3) {
                                                                                    var4 = 40;
                                                                                    if (ii.field_e[0].field_i.field_a < -2 + this.field_i.field_a) {
                                                                                      var4 = 20;
                                                                                    }
                                                                                    this.a(var4, (byte) -82, param1, true);
                                                                                    fieldTemp$48 = this.field_w;
                                                                                    this.field_w = this.field_w + 1;
                                                                                    if (fieldTemp$48 > 25 &&
                                                                                      this.b(param1, -4) == 1 &&
                                                                                      this.field_f.field_a == 0) {
                                                                                      this.field_n = 25;
                                                                                      this.field_w = 0;
                                                                                      this.field_z = 0;
                                                                                      if (ii.field_e[0].field_i.field_b >= this.field_i.field_b) {
                                                                                        stackIn_1225_1 = 1;
                                                                                      } else {
                                                                                        stackIn_1225_1 = -1;
                                                                                      }
                                                                                      this.field_h = stackIn_1225_1;
                                                                                      this.field_x = 0;
                                                                                      stackIn_1227_0 = 0;
                                                                                      if (pk.field_s) {
                                                                                        stackIn_1228_1 = 0;
                                                                                      } else {
                                                                                        stackIn_1228_1 = 1;
                                                                                      }
                                                                                      if (stackIn_1227_0 == stackIn_1228_1) {
                                                                                        tl.field_a.a(si.field_j[5], 100, 256 * ee.field_p / 100);
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                              }
                                                                              this.e(false);
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  } else {
                                                                    if (this.field_w <= 2) {
                                                                      this.a(1, si.field_j, param1, 1, 40, 0, tl.field_a, pk.field_s, (byte) -123);
                                                                    }
                                                                    this.e(false);
                                                                    if (1 == this.b(param1, -4) &&
                                                                      0 == this.field_f.field_a &&
                                                                      this.field_w <= 2) {
                                                                      this.field_e = 5;
                                                                      stackIn_1000_0 = 0;
                                                                      if (pk.field_s) {
                                                                        stackIn_1001_1 = 0;
                                                                      } else {
                                                                        stackIn_1001_1 = 1;
                                                                      }
                                                                      if (stackIn_1000_0 == stackIn_1001_1) {
                                                                        tl.field_a.a(si.field_j[14], 100, ee.field_p * 256 / 100);
                                                                      }
                                                                      ii.field_e[od.field_k].a(9147, this.field_B, this.field_i);
                                                                      ii.field_e[od.field_k].field_f.a(-112, this.field_f);
                                                                      ii.field_e[od.field_k].field_h = this.field_h;
                                                                      ii.field_e[od.field_k].field_w = 11;
                                                                      od.field_k = od.field_k + 1;
                                                                    }
                                                                    this.field_w = this.field_w + 1;
                                                                    if (this.field_w == 2) {
                                                                      this.field_w = 0;
                                                                    }
                                                                    if (!(this.field_w < 30)) {
                                                                      this.field_k = 1;
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
                                                } else {
                                                  if (this.field_p <= 0) {
                                                    this.a(false, 120, param1);
                                                  } else {
                                                    if (this.field_r != 0) {
                                                      this.a(param0 ^ -72, param1);
                                                    } else {
                                                      if (this.field_x == 0) {
                                                        if (ii.field_e[0].field_i.field_a > this.field_i.field_a) {
                                                          this.field_w = this.field_w + 1;
                                                        }
                                                        this.a(false, 1, 20, (byte) -67, param1);
                                                        fieldTemp$64 = this.field_w;
                                                        this.field_w = this.field_w + 1;
                                                        if (200 < fieldTemp$64) {
                                                          this.field_w = 0;
                                                          if (ii.field_e[0].field_i.field_b < this.field_i.field_b) {
                                                            stackIn_716_1 = -1;
                                                          } else {
                                                            stackIn_716_1 = 1;
                                                          }
                                                          this.field_h = stackIn_716_1;
                                                          this.field_x = 1;
                                                        }
                                                      }
                                                      if (1 == this.field_x) {
                                                        this.field_n = 19;
                                                        fieldTemp$65 = this.field_w;
                                                        this.field_w = this.field_w + 1;
                                                        if (fieldTemp$65 > 40) {
                                                          this.field_w = 0;
                                                          this.field_x = 2;
                                                          this.field_e = 80;
                                                          if (this.field_i.field_a >= ii.field_e[0].field_i.field_a) {
                                                            this.field_e = 40;
                                                          }
                                                        }
                                                      }
                                                      if (this.field_x == 2) {
                                                        this.a(false, 22, 15, param1);
                                                        if (this.field_x == 0) {
                                                          this.field_w = (int)(Math.random() * 100.0);
                                                        }
                                                      }
                                                      if (this.field_x == 3) {
                                                        this.a(15, -92, false, param1);
                                                        if (this.field_x == 0) {
                                                          this.field_w = (int)(Math.random() * 100.0);
                                                        }
                                                      }
                                                      this.e(false);
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
                        break L2;
                      }
                      if (0 >= this.field_p) {
                        this.a(false, 120, param1);
                      } else {
                        if (0 != this.field_r) {
                          if (this.field_B != 8) {
                            this.a(98, param1);
                          } else {
                            this.field_p = 0;
                            this.field_r = 0;
                          }
                        } else {
                          var4 = 15;
                          if (this.field_B == 7) {
                            var4 = 10;
                          }
                          if (this.field_x == 0) {
                            if (this.field_i.field_a < ii.field_e[0].field_i.field_a) {
                              this.field_w = this.field_w + 1;
                            }
                            this.a(false, 0, var4, (byte) -68, param1);
                            fieldTemp$73 = this.field_w;
                            this.field_w = this.field_w + 1;
                            if (fieldTemp$73 > 100) {
                              this.field_x = 1;
                              this.field_w = 0;
                              this.field_z = 0;
                              if (100.0 * Math.random() < 10.0 &&
                                7 == this.field_B) {
                                this.field_x = 4;
                              }
                            }
                          }
                          if (1 == this.field_x) {
                            fieldTemp$74 = this.field_w;
                            this.field_w = this.field_w + 1;
                            if (fieldTemp$74 > 25) {
                              this.field_x = 2;
                              this.field_w = 0;
                              this.field_e = 70;
                            }
                            this.field_n = 19;
                          }
                          if (this.field_x == 2) {
                            this.a(false, 22, var4, param1);
                            if (this.field_x == 0) {
                              this.field_w = (int)(Math.random() * 100.0);
                            }
                          }
                          if (this.field_x == 3) {
                            this.a(var4, -82, false, param1);
                            if (this.field_x == 0) {
                              this.field_w = (int)(Math.random() * 100.0);
                            }
                          }
                          if (this.field_x == 4) {
                            if (!this.a(false, param1, 25)) {
                              this.e(false);
                              break L2;
                            }
                            if (od.field_k >= 100) {
                              this.e(false);
                              break L2;
                            }
                            stackIn_401_0 = (pk.field_s) ? 0 : 1;
                            if (stackIn_401_0 != 1) {
                              tl.field_a.a(si.field_j[12], 100, 256 * ee.field_p / 100);
                            }
                            this.field_x = 0;
                            this.field_w = 0;
                            ii.field_e[od.field_k].a(param0 ^ -9154, 8, this.field_i);
                            ii.field_e[od.field_k].field_f.a(-88, this.field_f);
                            ii.field_e[od.field_k].field_h = this.field_h;
                            ii.field_e[od.field_k].field_w = 10;
                            od.field_k = od.field_k + 1;
                          }
                          this.e(false);
                        }
                      }
                      break L2;
                    }
                    if (this.field_p > 0) {
                      if (0 == this.field_r) {
                        this.a(15, (byte) 127, param1, false);
                        this.e(false);
                      } else {
                        this.a(param0 + 238, param1);
                      }
                    } else {
                      this.a(false, 120, param1);
                    }
                  } else {
                    if (this.field_p > 0) {
                      if (this.field_r == 0) {
                        if (this.field_x == 0) {
                          if (this.field_i.field_a < ii.field_e[0].field_i.field_a) {
                            this.field_w = this.field_w + 1;
                          }
                          stackIn_276_1 = false;
                          if (!pg.field_q &&
                            ql.field_c != 0) {
                            stackIn_277_2 = 0;
                          } else {
                            stackIn_277_2 = 2;
                          }
                          this.a(stackIn_276_1, stackIn_277_2, 15, (byte) -63, param1);
                          if (!pg.field_q) {
                            fieldTemp$76 = this.field_w;
                            this.field_w = this.field_w + 1;
                            if (fieldTemp$76 > 250 &&
                              ql.field_c != 0) {
                              this.field_x = 1;
                              this.field_w = 0;
                            }
                          }
                        }
                        if (this.field_x == 1) {
                          this.field_n = 19;
                          fieldTemp$77 = this.field_w;
                          this.field_w = this.field_w + 1;
                          if (25 < fieldTemp$77) {
                            this.field_x = 2;
                            this.field_w = 0;
                            this.field_e = 80;
                          }
                        }
                        if (2 == this.field_x) {
                          this.a(false, 22, 5, param1);
                          if (this.field_x == 0) {
                            this.field_w = (int)(100.0 * Math.random());
                          }
                        }
                        if (this.field_x == 3) {
                          this.a(5, param0 + 16, false, param1);
                          if (this.field_x == 0) {
                            this.field_w = (int)(100.0 * Math.random());
                            this.e(false);
                          } else {
                            this.e(false);
                          }
                        } else {
                          this.e(false);
                        }
                      } else {
                        this.a(14, param1);
                      }
                    } else {
                      this.a(false, param0 + 243, param1);
                    }
                  }
                }
              }
            }
          }
          if (param0 != -123) {
            this.c(-4);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_1269_0 = var3;
          stackIn_1269_1 = new StringBuilder().append("eg.EA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_1270_2 = "null";
          } else {
            stackIn_1270_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_1269_0), ((StringBuilder) (Object) stackIn_1269_1).append(stackIn_1270_2).append(')').toString());
        }
    }

    final static void a(kl param0, int param1, kl param2, kl param3) {
        o var16 = null;
        db[] var5 = null;
        db[][] var6 = null;
        int[][] var17 = null;
        int[][] var15 = null;
        int[][] var7 = null;
        db[] var10_ref_db__ = null;
        int var11_int = 0;
        o var11 = null;
        o var12 = null;
        o var13 = null;
        int var8 = 0;
        int var9 = 0;
        int var14 = wizardrun.field_H;
        int var8Lifetime1;
        int var9Lifetime1;
        try {
          ok.field_a = pe.a("commonui", param3, "frame_top", 127);
          ia.field_i = pe.a("commonui", param3, "frame_bottom", 88);
          hg.field_d = vg.a(15, "jagex_logo_grey", param3, "commonui");
          vf.field_j = pe.a("commonui", param3, "button", 121);
          te.field_k = pc.a((byte) 125, "commonui", param3, "validation");
          e.field_b = (vd) ((Object) oc.a(param3, "commonui", "arezzo12", 67, param0));
          gh.field_b = (vd) ((Object) oc.a(param3, "commonui", "arezzo14", 93, param0));
          va.field_i = (vd) ((Object) oc.a(param3, "commonui", "arezzo14bold", 118, param0));
          var16 = new o(param2.a(122, "", "button.gif"), (java.awt.Component) ((Object) wizardrun.field_G));
          mf.a("commonui", "dropdown", param3, (byte) -108);
          var5 = re.a(param3, "commonui", "screen_options", 112);
          gj.field_f = new db[4];
          s.field_c = new db[4];
          nj.field_k = new db[4];
          var6 = new db[][]{gj.field_f, s.field_c, nj.field_k};
          var17 = new int[4][];
          var15 = var17;
          var7 = var15;
          var7[0] = var5[0].field_k;
          for (var8 = 1; var8 < var17.length; var8++) {
            var7[var8] = (int[]) ((Object) var17[0].clone());
          }
          var8Lifetime1 = var5[0].field_l[0];
          var17[2][var8Lifetime1] = 16777215;
          var17[1][var8Lifetime1] = 2394342;
          var17[3][var8Lifetime1] = 4767999;
          for (var9 = 0; var9 < 3; var9++) {
            var10_ref_db__ = var6[var9];
            for (var11_int = 0; var11_int < var10_ref_db__.length; var11_int++) {
              var10_ref_db__[var11_int] = eb.a(var5[var9], (byte) -105, var17[var11_int]);
            }
          }
          var9Lifetime1 = var16.field_p;
          ph.d(-31782);
          int var10 = -88 / ((15 - param1) / 44);
          var16.b();
          ed.d(0, 0, ed.field_h, ed.field_d);
          var11 = new o(var9Lifetime1, var9Lifetime1);
          var11.b();
          var16.c(0, 0);
          var12 = new o(var9Lifetime1, var9Lifetime1);
          var12.b();
          var16.c(-var16.field_z + var9Lifetime1, 0);
          var13 = new o(var16.field_z - var9Lifetime1 * 2, var9Lifetime1);
          var13.b();
          var16.c(-var9Lifetime1, 0);
          bb.b(4);
          vf.field_j = new o[]{var11, var13, var12};
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "eg.BA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, int param1, byte param2) {
        int var11 = 0;
        int stackIn_21_1 = 0;
        int var4;
        int var5;
        o[] var6;
        int var7;
        int var8;
        double var9;
        int var12;
        var12 = wizardrun.field_H;
        if (param2 != 62) {
          this.field_q = (o) null;
        }
        var4 = this.field_f.field_b * 32 / 240 + 32 * this.field_i.field_b;
        var5 = 32 * (15 - this.field_i.field_a) - (32 + this.field_f.field_a * 32 / 240);
        var5 = var5 - (this.field_d - 32);
        var6 = oc.field_b[param1];
        if (param1 == 4 &&
          ql.field_c == 6) {
          var6 = hh.field_eb;
        }
        if (param1 == 4 &&
          7 == ql.field_c) {
          var6 = h.field_j;
        }
        if (this.field_p <= 0) {
          var7 = 240 * this.field_i.field_b + this.field_f.field_b;
          var7 = 0;
          var6[this.field_n].a(var4 + this.field_d / 2, var5 + this.field_d / 2, -105, 128, var7);
        } else {
          if (this.field_r != 0) {
            var7 = this.field_i.field_b * 240 + this.field_f.field_b;
            var8 = this.field_d / 2;
            var6[this.field_n].a(var8 + var4, var8 + var5, -112, 128, var7);
            this.field_q = var6[this.field_n].c();
            this.field_A = var5;
            this.field_y = var4;
            for (var11 = 0; -(var8 * this.field_w / 1000) + var8 > var11; var11 += 2) {
              var9 = (0.5 * (double)(this.field_f.field_b + this.field_i.field_b * 240) + 6.28 * (double)var11) / (double)var8;
              ob.field_c.d((int)((double)var8 * Math.cos((double)this.field_h * var9) + (double)var8) + (var4 - 6), var5 + ((int)((double)var8 + Math.sin(var9 * (double)this.field_h) * (double)var8) - 6), 12, 12, 255 - var11 % 10 * 25);
              ob.field_c.d(var4 - (int)((double)var8 * Math.cos((double)this.field_h * var9) - (double)var8) - 6, -(int)((double)(-var8) + (double)var8 * Math.sin(var9 * (double)this.field_h)) + (var5 - 6), 12, 12, 255 - 25 * (var11 % 10));
            }
          } else {
            if (-1 == this.field_h) {
              var6[this.field_n].e(var4, var5);
              this.field_q = var6[this.field_n];
              this.field_A = var5;
              this.field_y = var4;
            } else {
              var6[this.field_n].d(var4, var5);
              this.field_q = var6[this.field_n].c();
              this.field_y = var4;
              this.field_A = var5;
            }
            if (!(nk.field_T < 250) && (qh.field_l == 0 &&
              ql.field_c == 0 &&
              nk.field_T < 400)) {
              if (uc.field_g >= 20) {
                stackIn_21_1 = 16776960;
              } else {
                stackIn_21_1 = 16711680;
              }
              this.a(stackIn_21_1, var6[this.field_n].field_x / 2 + var4, true, "*", -4 + var5);
            }
          }
        }
    }

    private final void a(int param0, int param1, boolean param2, tg param3) {
        int stackIn_13_0 = 0;
        int stackIn_14_1 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = wizardrun.field_H;
        try {
          this.a(1, si.field_j, param3, 1, param0, 1, tl.field_a, pk.field_s, (byte) 126);
          if (param1 > -73) {
            return;
          }
          if (this.b(param3, -4) == 1 &&
            0 == this.field_e) {
            this.field_z = 0;
            this.field_x = 0;
            if (this.field_B != 5 &&
              this.field_B != 22 &&
              38 != this.field_B &&
              64 >= this.field_d) {
              stackIn_13_0 = 0;
              if (pk.field_s) {
                stackIn_14_1 = 0;
              } else {
                stackIn_14_1 = 1;
              }
              if (stackIn_13_0 != stackIn_14_1) {
                if (pk.field_s) {
                  if (6 == this.field_B) {
                    tl.field_a.a(nl.field_q[6], 100, 256 * ee.field_p / 100);
                  } else {
                    tl.field_a.a(si.field_j[5], 100, ee.field_p * 256 / 100);
                  }
                }
              } else {
                tl.field_a.a(si.field_j[4], 100, ee.field_p * 256 / 100);
              }
            }
          }
          if (param2) {
            this.field_z = this.field_z + 1;
            this.field_n = 21;
            if (25 < this.field_z) {
              this.field_n = 22;
            }
            if (this.field_B == 6) {
              this.field_n = 22;
              if (this.field_z > 15) {
                this.field_n = 23;
              }
              if (this.field_z > 25) {
                this.field_n = 24;
              }
            }
          } else {
            this.field_n = 21;
          }
          if (this.field_s > 0) {
            if (param2) {
              return;
            }
            this.field_s = this.field_s - 1;
            this.field_p = this.field_p - 1;
            if (this.field_p > 0) {
              if (pk.field_s &&
                !param2) {
                this.c(1);
              }
            } else {
              if (pk.field_s &&
                !param2) {
                this.c(false);
              }
            }
            if (this.field_p > 0) {
              return;
            }
            this.field_e = 60;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_46_0 = var5;
          stackIn_46_1 = new StringBuilder().append("eg.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(')').toString());
        }
    }

    private final void a(boolean param0, int param1, int param2, tg param3) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        ob var6 = null;
        try {
          if (param1 != 22) {
            var6 = (ob) null;
            this.a(81, 113, (ob) null);
          }
          this.a(1, si.field_j, param3, 1, param2, 1, tl.field_a, pk.field_s, (byte) -37);
          if (this.field_e <= 0) {
            this.field_x = 3;
            this.field_z = 0;
          }
          this.field_n = 20;
          if (6 == this.field_B) {
            this.field_n = 22;
          }
          if (this.field_s > 0) {
            if (param0) {
              return;
            }
            this.field_s = this.field_s - 1;
            this.field_p = this.field_p - 1;
            if (this.field_p > 0) {
              if (pk.field_s &&
                !param0) {
                this.c(1);
              }
            } else {
              if (pk.field_s &&
                !param0) {
                this.c(false);
              }
            }
            if (this.field_p > 0) {
              return;
            }
            this.field_e = 60;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_24_0 = var5;
          stackIn_24_1 = new StringBuilder().append("eg.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    private final void a(boolean param0, int param1, int param2, byte param3, tg param4) {
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        var7 = wizardrun.field_H;
        try {
          if (this.b(param4, -4) == 0 &&
            3 != param1) {
            this.field_x = 3;
          }
          if (param1 == 3) {
            this.a(2, si.field_j, param4, 0, param2, 1, tl.field_a, pk.field_s, (byte) 126);
          }
          if (param1 == 0) {
            this.a(1, si.field_j, param4, 0, param2, 1, tl.field_a, pk.field_s, (byte) 126);
          }
          if (param1 == 2) {
            this.a(0, si.field_j, param4, 0, param2, 1, tl.field_a, pk.field_s, (byte) -117);
          }
          if (param1 == 1) {
            if (this.field_i.field_a <= ii.field_e[0].field_i.field_a &&
              this.field_e == 0) {
              this.a(0, si.field_j, param4, 0, param2, 1, tl.field_a, pk.field_s, (byte) 127);
            } else {
              this.a(1, si.field_j, param4, 1, param2, 1, tl.field_a, pk.field_s, (byte) -65);
            }
          }
          this.field_z = this.field_z - 1;
          if (0 >= this.field_z) {
            this.field_z = 5;
            this.field_n = this.field_n + 1;
            if (param0) {
              this.field_z = 2;
            }
          }
          if (this.field_n < 2) {
            this.field_n = 2;
          }
          if (!param0) {
            if (5 < this.field_n) {
              this.field_n = 2;
            }
          } else {
            if (this.field_n > 9) {
              this.field_n = 2;
            }
          }
          if (param3 >= -58) {
            this.a(-80, -12, (byte) -64);
          }
          if (this.field_s > 0) {
            if (param0) {
              return;
            }
            this.field_s = this.field_s - 1;
            this.field_p = this.field_p - 1;
            if (this.field_p > 0) {
              if (pk.field_s &&
                !param0) {
                this.c(1);
              }
            } else {
              if (pk.field_s &&
                !param0) {
                this.c(false);
              }
            }
            if (this.field_p > 0) {
              return;
            }
            if (this.field_p <= 0) {
              if (pk.field_s &&
                !param0) {
                this.c(false);
              }
            } else {
              if (pk.field_s &&
                !param0) {
                this.c(1);
              }
            }
            this.field_e = 60;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_59_0 = var6;
          stackIn_59_1 = new StringBuilder().append("eg.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, ob param2) {
        RuntimeException stackIn_119_0 = null;
        StringBuilder stackIn_119_1 = null;
        String stackIn_120_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          this.field_n = 0;
          this.field_w = 0;
          this.field_q = null;
          this.field_z = 0;
          this.field_B = param1;
          this.field_x = 0;
          this.field_i.a(-109, param2);
          this.field_f.b(17939);
          this.field_m = 0;
          this.field_e = 0;
          this.field_z = 0;
          this.field_r = 0;
          this.field_o = 0;
          this.field_d = 32;
          this.field_h = 1;
          this.field_p = 0;
          this.field_k = 0;
          this.field_s = 0;
          if (param1 == 0) {
            this.field_d = 64;
          }
          if (21 == param1) {
            this.field_d = 32;
          }
          if (param1 == 1) {
            this.field_d = 24;
          }
          if (param1 == 2) {
            this.field_d = 64;
          }
          if (3 == param1) {
            this.field_p = 1;
            this.field_d = 32;
          }
          if (4 == param1) {
            this.field_p = 4;
            this.field_d = 48;
          }
          if (param1 == 5) {
            this.field_p = 1;
            this.field_d = 32;
          }
          if (param1 == 6) {
            this.field_d = 65;
            this.field_f.field_b = this.field_f.field_b - 80;
            this.field_p = 50;
            this.field_o = 7;
          }
          if (param1 == 7) {
            this.field_p = 5;
            this.field_d = 48;
          }
          if (param1 == 8) {
            this.field_d = 32;
            this.field_p = 1;
          }
          if (9 == param1) {
            this.field_d = 48;
            this.field_p = 4;
          }
          if (param1 == 10) {
            this.field_p = 8;
            this.field_d = 64;
          }
          if (param1 == 11) {
            this.field_d = 64;
          }
          if (param1 == 12) {
            this.field_d = 65;
            this.field_p = 50;
          }
          if (13 == param1) {
            this.field_d = 48;
            this.field_p = 3;
          }
          if (param1 == 14) {
            this.field_p = 5;
            this.field_d = 48;
          }
          if (15 == param1) {
            this.field_d = 48;
            this.field_p = 6;
          }
          if (param1 == 16) {
            this.field_d = 64;
            this.field_p = 10;
          }
          if (17 == param1) {
            this.field_d = 80;
            this.field_p = 75;
          }
          if (18 == param1) {
            this.field_d = 24;
          }
          if (19 == param1) {
            this.field_d = 20;
          }
          if (param1 == 25) {
            this.field_d = 80;
          }
          if (param1 == 22) {
            this.field_p = 3;
            this.field_d = 32;
          }
          if (param1 == 23) {
            this.field_p = 12;
            this.field_d = 80;
          }
          if (param1 == 24) {
            this.field_p = 6;
            this.field_d = 48;
          }
          if (26 == param1) {
            this.field_d = 96;
            this.field_p = 75;
          }
          if (param1 == 27) {
            this.field_d = 40;
          }
          if (param1 == 28) {
            this.field_d = 24;
          }
          if (param1 == 29) {
            this.field_d = 64;
            this.field_p = 6;
          }
          if (param1 == 30) {
            this.field_d = 64;
            this.field_p = 4;
          }
          if (param1 == 31) {
            this.field_d = 64;
            this.field_p = 15;
          }
          if (param1 == 32) {
            this.field_d = 80;
            this.field_p = 12;
          }
          if (33 == param1) {
            this.field_p = 75;
            this.field_d = 96;
          }
          if (param1 == 34) {
            this.field_d = 64;
          }
          if (param1 == 35) {
            this.field_d = 64;
          }
          if (42 == param1) {
            this.field_d = 64;
          }
          if (43 == param1) {
            this.field_d = 96;
          }
          if (36 == param1) {
            this.field_p = 1;
            this.field_d = 32;
          }
          if (37 == param1) {
            this.field_d = 80;
            this.field_p = 20;
          }
          if (param1 == 38) {
            this.field_d = 48;
            this.field_p = 6;
          }
          if (39 == param1) {
            this.field_d = 64;
            this.field_p = 10;
          }
          if (40 == param1) {
            this.field_d = 80;
            this.field_p = 200;
          }
          if (param0 != 9147) {
            return;
          }
          if (param1 == 41) {
            this.field_d = 128;
          }
          if (param1 == 45) {
            this.field_d = 96;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_119_0 = var4;
          stackIn_119_1 = new StringBuilder().append("eg.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_120_2 = "null";
          } else {
            stackIn_120_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_119_0), ((StringBuilder) (Object) stackIn_119_1).append(stackIn_120_2).append(')').toString());
        }
    }

    eg() {
        this.field_k = 0;
        this.field_w = 0;
        this.field_x = 0;
        this.field_B = 0;
        this.field_i.b(17939);
        this.field_f.b(17939);
        this.field_m = 0;
        this.field_p = 0;
        this.field_r = 0;
        this.field_e = 0;
        this.field_h = 1;
        this.field_o = 0;
        this.field_q = null;
        this.field_d = 32;
        this.field_s = 0;
    }

    static {
        field_t = "More suggestions";
    }
}
