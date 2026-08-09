/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj extends ql {
    static int field_e;
    private oc[] field_m;
    private boolean[] field_A;
    private v field_y;
    private oj[] field_h;
    private boolean field_u;
    private v field_s;
    private v field_i;
    private boolean field_o;
    private boolean field_w;
    private v field_r;
    private oc field_j;
    private v field_k;
    private oc field_f;
    static int field_v;
    private we[] field_p;
    static bd field_l;
    private boolean field_B;
    private boolean field_n;
    private v[] field_x;
    private oc[] field_g;
    private oj field_z;
    private boolean field_q;
    private oj[] field_t;
    private int field_d;

    final void b(byte param0) {
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int var2;
        int var3;
        int var4;
        L0: {
          var4 = HostileSpawn.field_I ? 1 : 0;
          if (this.field_u) {
            if (this.field_y.a((byte) -52)) {
              break L0;
            } else {
              this.field_u = false;
              this.field_y.field_l = -1;
              break L0;
            }
          } else {
            break L0;
          }
        }
        L1: {
          if (!this.field_w) {
            break L1;
          } else {
            if (!this.field_s.a((byte) -82)) {
              this.field_w = false;
              this.field_s.field_l = -1;
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (!this.field_B) {
            break L2;
          } else {
            if (!this.field_r.a((byte) -75)) {
              this.field_r.field_l = -1;
              this.field_B = false;
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          L4: {
            L5: {
              var2 = 125 / ((param0 - -48) / 38);
              if (this.field_o) {
                var3 = 0;
                L6: while (true) {
                  if (2 <= var3) {
                    break L5;
                  } else {
                    stackIn_21_0 = -1;

                    stackIn_21_1 = this.field_x[var3].field_l ^ -1;

                    if (stackIn_21_0 >= stackIn_21_1) {
                      if (!this.field_x[var3].a((byte) -74)) {
                        this.field_o = false;
                        this.field_x[var3].field_l = -1;
                        var3++;
                        continue L6;
                      } else {
                        var3++;
                        continue L6;
                      }
                    } else {
                      var3++;
                      continue L6;
                    }
                  }
                }
              } else {
                break L5;
              }
            }
            if (this.field_n) {
              if (0 != r.field_a) {
                break L4;
              } else {
                if (this.field_k.a((byte) -125)) {
                  break L4;
                } else {
                  this.field_n = false;
                  this.field_k.field_l = 0;
                  this.field_i.e(-125);
                  break L3;
                }
              }
            } else {
              this.field_i.e(-125);
              break L3;
            }
          }
          this.field_i.e(-125);
          break L3;
        }
    }

    final void d(int param0) {
        boolean stackIn_47_0 = false;
        int var3;
        Object var4;
        int var5_int;
        oj[] var5;
        int var6;
        oj var7;
        int var8;
        int var9;
        oc var10;
        L0: {
          var8 = HostileSpawn.field_I ? 1 : 0;
          if (0 > this.field_y.field_l) {
            break L0;
          } else {
            if (!kh.field_Q[4]) {
              break L0;
            } else {
              this.field_u = true;
              break L0;
            }
          }
        }
        L1: {
          if (this.field_r.field_l < 0) {
            break L1;
          } else {
            if (!this.field_B) {
              if (!this.field_z.field_n) {
                break L1;
              } else {
                this.field_B = true;
                break L1;
              }
            } else {
              break L1;
            }
          }
        }
        L2: {
          var10 = mm.field_m[0].field_j;
          if (this.field_s.field_l < 0) {
            break L2;
          } else {
            if (kh.field_Q[5]) {
              this.field_w = true;
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (param0 < (this.field_x[0].field_l ^ -1)) {
            break L3;
          } else {
            if (this.field_o) {
              break L3;
            } else {
              if (r.field_a != 0) {
                var3 = 0;
                L4: while (true) {
                  if (2 <= var3) {
                    break L3;
                  } else {
                    if (this.field_o) {
                      break L3;
                    } else {
                      if (ih.a(this.field_g[var3], (byte) -106, var10) <= 2) {
                        this.field_o = true;
                        this.field_x[1 - var3].field_l = -1;
                        var3++;
                        continue L4;
                      } else {
                        var3++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                break L3;
              }
            }
          }
        }
        var3 = 0;
        var4 = null;
        var5_int = 0;
        L5: while (true) {
          if (var5_int >= this.field_t.length) {
            L6: {
              if (-1 == (r.field_a ^ -1)) {
                if (!this.field_q) {
                  var9 = 0;
                  var5_int = var9;
                  L7: while (true) {
                    if ((var9 ^ -1) > -3) {
                      stackIn_47_0 = this.field_A[var9];

                      if (!stackIn_47_0) {
                        if (ih.a(var10, (byte) -93, this.field_m[var9]) < 2) {
                          L8: {
                            if (1 == var9) {
                              ca.a((double)this.field_m[var9].field_e + 1.5, 1, 1.0 + (double)this.field_m[var9].field_g, true, 192);
                              break L8;
                            } else {
                              ca.a(1.5 + (double)this.field_m[var9].field_e, 1, (double)(this.field_m[var9].field_g - -1), true, 192);
                              break L8;
                            }
                          }
                          this.field_q = true;
                          var9++;
                          continue L7;
                        } else {
                          var9++;
                          continue L7;
                        }
                      } else {
                        var9++;
                        continue L7;
                      }
                    } else {
                      if (r.field_a != 0) {
                        break L6;
                      } else {
                        if (!this.field_q) {
                          break L6;
                        } else {
                          if (of.field_d == dn.field_i) {
                            break L6;
                          } else {
                            r.field_a = 1;
                            this.field_q = false;
                            kd.a(0, 1);
                            nh.field_E.a((byte) 46, this.field_j);
                            break L6;
                          }
                        }
                      }
                    }
                  }
                } else {
                  if (r.field_a != 0) {
                    break L6;
                  } else {
                    if (!this.field_q) {
                      break L6;
                    } else {
                      if (of.field_d == dn.field_i) {
                        break L6;
                      } else {
                        r.field_a = 1;
                        this.field_q = false;
                        kd.a(0, 1);
                        nh.field_E.a((byte) 46, this.field_j);
                        break L6;
                      }
                    }
                  }
                }
              } else {
                if (r.field_a != 0) {
                  break L6;
                } else {
                  if (!this.field_q) {
                    break L6;
                  } else {
                    if (of.field_d == dn.field_i) {
                      break L6;
                    } else {
                      r.field_a = 1;
                      this.field_q = false;
                      kd.a(0, 1);
                      nh.field_E.a((byte) 46, this.field_j);
                      break L6;
                    }
                  }
                }
              }
            }
            L9: {
              if (var3 <= this.field_d) {
                break L9;
              } else {
                L10: {
                  this.field_d = var3;
                  if (!this.field_A[2]) {
                    r.field_a = 1;
                    break L10;
                  } else {
                    L11: {
                      r.field_a = 0;
                      kd.a(4, param0 ^ -2);
                      nh.field_E.a(-1, 8360, -1);
                      if (-4 == (var3 ^ -1)) {
                        le.field_D = 5;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    var5 = this.field_h;
                    var6 = 0;
                    L12: while (true) {
                      if (var5.length <= var6) {
                        break L10;
                      } else {
                        var7 = var5[var6];
                        if (var7 != null) {
                          var7.field_I = 0;
                          var6++;
                          continue L12;
                        } else {
                          var6++;
                          continue L12;
                        }
                      }
                    }
                  }
                }
                L13: {
                  if (-1 <= (ln.field_a.field_g[((oj) (var4)).field_j.b(-4)] ^ -1)) {
                    break L13;
                  } else {
                    if (ln.field_a.field_g[((oj) (var4)).field_j.b(-4)] == ln.field_a.field_g[this.field_z.field_j.b(-4)]) {
                      L14: {
                        if (this.field_z.field_i == 27) {
                          this.field_z.c((byte) 45);
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      this.field_r.field_l = -1;
                      this.field_B = false;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                }
                if (var3 == 2) {
                  L15: {
                    if (var10.field_g >= 40) {
                      if (-49 >= (var10.field_e ^ -1)) {
                        this.field_i.field_l = 1776;
                        this.field_i.field_d = 2136;
                        break L15;
                      } else {
                        this.field_i.field_d = 1536;
                        this.field_i.field_l = 360;
                        break L15;
                      }
                    } else {
                      this.field_i.field_d = 552;
                      this.field_i.field_l = 1968;
                      break L15;
                    }
                  }
                  this.field_i.field_a = 1;
                  break L9;
                } else {
                  break L9;
                }
              }
            }
            L16: {
              if (3 <= var3) {
                break L16;
              } else {
                le.field_D = 0;
                break L16;
              }
            }
            L17: {
              if (this.field_n) {
                break L17;
              } else {
                if (0 > this.field_k.field_l) {
                  break L17;
                } else {
                  if ((ha.field_t ^ -1) != -5) {
                    break L17;
                  } else {
                    if (-3 <= (ih.a(var10, (byte) -93, this.field_j) ^ -1)) {
                      this.field_n = true;
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                }
              }
            }
            L18: {
              if (0 == (ng.field_u & 15)) {
                this.a(this.field_f, param0 ^ 0);
                break L18;
              } else {
                break L18;
              }
            }
            super.d(-1);
            return;
          } else {
            if (this.field_t[var5_int].field_i == 126) {
              var3++;
              if (!this.field_A[var5_int]) {
                var4 = this.field_t[var5_int];
                this.field_A[var5_int] = true;
                var5_int++;
                continue L5;
              } else {
                var5_int++;
                continue L5;
              }
            } else {
              var5_int++;
              continue L5;
            }
          }
        }
    }

    final static int a(s param0, s param1, int param2) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 29280) {
                break L1;
              } else {
                pj.c((byte) 120);
                break L1;
              }
            }
            var4 = (String) null;
            stackIn_3_0 = lb.a(0, (byte) 125, param1, false, param0, (String) null, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("pj.A(");

            if (param0 == null) {
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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    public static void c(byte param0) {
        field_l = null;
        if (param0 <= 34) {
            field_v = -116;
        }
    }

    final void e(int param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int var3;
        int var4;
        oj var5;
        int var5_int;
        int var6_int;
        oj var6;
        int var7;
        int var8;
        int[] var9;
        int[] var10;
        int[] var12;
        int[] var15;
        L0: {
          var8 = HostileSpawn.field_I ? 1 : 0;
          var12 = ln.field_a.field_v;
          var10 = var12;
          var9 = var10;
          var15 = var9;
          kd.a(0, param0 + 1);
          this.field_j = new oc(var12[2], var12[3]);
          nh.field_E.a((byte) 46, this.field_j);
          this.field_y = new v(m.field_k, var12[4] * 24 + -100, 24 * (-5 + var12[5]) + -30, 200);
          if (kh.field_Q[4]) {
            this.field_y.field_l = -1;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          this.field_s = new v(bn.field_n, 0, var12[7] * 24, 200);
          this.field_s.field_l = 24 * (3 + var12[6]);
          if (kh.field_Q[5]) {
            this.field_s.field_l = -1;
            break L1;
          } else {
            break L1;
          }
        }
        this.field_r = new v(jj.field_f, 0, 24 * (1 + var12[9]), 200);
        this.field_r.field_l = var12[8] * 24 - -48;
        var3 = 0;
        L2: while (true) {
          if (-3 >= (var3 ^ -1)) {
            this.field_f = new oc();
            var3 = param0;
            L3: while (true) {
              L4: {
                if (ll.field_a <= var3) {
                  break L4;
                } else {
                  if (wh.field_b[var3].field_i == 0) {
                    if ((wh.field_b[var3].field_h ^ -1) == -5) {
                      this.field_f.a((byte) 46, wh.field_b[var3].field_j);
                      break L4;
                    } else {
                      var3++;
                      continue L3;
                    }
                  } else {
                    var3++;
                    continue L3;
                  }
                }
              }
              var3 = 0;
              var4 = 0;
              L5: while (true) {
                if (var4 >= el.field_j) {
                  this.field_m[0] = new oc(var15[14], var15[15]);
                  this.field_m[1] = new oc(var15[16], var15[17]);
                  this.field_p[0] = new we(this.field_m[0]);
                  this.field_p[1] = new we(this.field_m[1]);
                  var3 = 0;
                  L6: while (true) {
                    if (2 <= var3) {
                      var3 = 0;
                      var4 = 0;
                      L7: while (true) {
                        if (var4 >= el.field_j) {
                          this.field_i = new v(e.field_k, 0, 0);
                          this.field_k = new v(vf.field_I, 24 * this.field_j.field_e, 24 * (-4 + this.field_j.field_g), 200);
                          return;
                        } else {
                          var5 = mm.field_m[var4];
                          if (20 == var5.field_i) {
                            incrementValue$0 = var3;
                            var3++;
                            this.field_h[incrementValue$0] = var5;
                            var4++;
                            continue L7;
                          } else {
                            var4++;
                            continue L7;
                          }
                        }
                      }
                    } else {
                      var4 = 1000;
                      var5_int = -1;
                      var6_int = var3;
                      L8: while (true) {
                        if ((var6_int ^ -1) <= -4) {
                          if (var5_int != var3) {
                            var6 = this.field_t[var3];
                            this.field_t[var3] = this.field_t[var5_int];
                            this.field_t[var5_int] = var6;
                            var3++;
                            continue L6;
                          } else {
                            var3++;
                            continue L6;
                          }
                        } else {
                          var7 = ih.a(this.field_m[var3], (byte) -76, this.field_t[var6_int].field_j);
                          if ((var7 ^ -1) > (var4 ^ -1)) {
                            var5_int = var6_int;
                            var4 = var7;
                            var6_int++;
                            continue L8;
                          } else {
                            var6_int++;
                            continue L8;
                          }
                        }
                      }
                    }
                  }
                } else {
                  if (-126 == (mm.field_m[var4].field_i ^ -1)) {
                    incrementValue$1 = var3;
                    var3++;
                    this.field_t[incrementValue$1] = mm.field_m[var4];
                    var4++;
                    continue L5;
                  } else {
                    if (mm.field_m[var4].field_i == 27) {
                      this.field_z = mm.field_m[var4];
                      var4++;
                      continue L5;
                    } else {
                      var4++;
                      continue L5;
                    }
                  }
                }
              }
            }
          } else {
            this.field_g[var3] = new oc(var9[2 * var3 + 10], var9[11 - -(var3 * 2)]);
            this.field_x[var3] = new v(bc.field_k, 0, this.field_g[var3].field_g * 24, 200);
            this.field_x[var3].field_l = this.field_g[var3].field_e * 24 - -48;
            var3++;
            continue L2;
          }
        }
    }

    final String a(boolean param0) {
        if (param0) {
            pj.c((byte) 57);
        }
        if (!(4 != ha.field_t)) {
            return q.field_l;
        }
        return tc.field_c;
    }

    final boolean b(int param0) {
        int var2;
        int var3;
        var3 = HostileSpawn.field_I ? 1 : 0;
        if (-5 != (ha.field_t ^ -1)) {
          var2 = -72 / ((param0 - 38) / 53);
          return true;
        } else {
          var2 = 0;
          L0: while (true) {
            if (var2 >= this.field_m.length) {
              return false;
            } else {
              if (126 != this.field_t[var2].field_i) {
                this.field_p[var2].a((byte) -46);
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            }
          }
        }
    }

    public pj() {
        this.field_h = new oj[4];
        this.field_A = new boolean[3];
        this.field_m = new oc[2];
        this.field_p = new we[2];
        this.field_g = new oc[2];
        this.field_x = new v[2];
        this.field_t = new oj[3];
        this.field_d = 0;
    }

    static {
    }
}
