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
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (this.field_u) {
                if (this.field_y.a((byte) -52)) {
                  break L1;
                } else {
                  this.field_u = false;
                  this.field_y.field_l = -1;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (!this.field_w) {
                break L2;
              } else {
                if (!this.field_s.a((byte) -82)) {
                  this.field_w = false;
                  this.field_s.field_l = -1;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (!this.field_B) {
                break L3;
              } else {
                if (!this.field_r.a((byte) -75)) {
                  this.field_r.field_l = -1;
                  this.field_B = false;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              var2_int = 125 / ((param0 - -48) / 38);
              if (this.field_o) {
                var3 = 0;
                L5: while (true) {
                  if (2 <= var3) {
                    break L4;
                  } else {
                    if (-1 >= (this.field_x[var3].field_l ^ -1)) {
                      if (!this.field_x[var3].a((byte) -74)) {
                        this.field_o = false;
                        this.field_x[var3].field_l = -1;
                        var3++;
                        continue L5;
                      } else {
                        var3++;
                        continue L5;
                      }
                    } else {
                      var3++;
                      continue L5;
                    }
                  }
                }
              } else {
                break L4;
              }
            }
            L6: {
              if (this.field_n) {
                L7: {
                  if (0 != r.field_a) {
                    break L7;
                  } else {
                    if (this.field_k.a((byte) -125)) {
                      break L7;
                    } else {
                      this.field_n = false;
                      this.field_k.field_l = 0;
                      break L7;
                    }
                  }
                }
                this.field_i.e(-125);
                break L6;
              } else {
                this.field_i.e(-125);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var2), "pj.H(" + param0 + ')');
        }
    }

    final void d(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        Object var4 = null;
        int var5_int = 0;
        oj[] var5 = null;
        int var6 = 0;
        oj var7 = null;
        int var8 = 0;
        int var9 = 0;
        oc var10 = null;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 > this.field_y.field_l) {
                break L1;
              } else {
                if (!kh.field_Q[4]) {
                  break L1;
                } else {
                  this.field_u = true;
                  break L1;
                }
              }
            }
            L2: {
              if (this.field_r.field_l < 0) {
                break L2;
              } else {
                if (!this.field_B) {
                  if (!this.field_z.field_n) {
                    break L2;
                  } else {
                    this.field_B = true;
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
            }
            L3: {
              var10 = mm.field_m[0].field_j;
              if (this.field_s.field_l < 0) {
                break L3;
              } else {
                if (kh.field_Q[5]) {
                  this.field_w = true;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (param0 < (this.field_x[0].field_l ^ -1)) {
                break L4;
              } else {
                if (this.field_o) {
                  break L4;
                } else {
                  if (r.field_a != 0) {
                    var3 = 0;
                    L5: while (true) {
                      if (2 <= var3) {
                        break L4;
                      } else {
                        if (this.field_o) {
                          break L4;
                        } else {
                          L6: {
                            if (ih.a(this.field_g[var3], (byte) -106, var10) <= 2) {
                              this.field_o = true;
                              this.field_x[1 - var3].field_l = -1;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          var3++;
                          continue L5;
                        }
                      }
                    }
                  } else {
                    break L4;
                  }
                }
              }
            }
            var3 = 0;
            var4 = null;
            var5_int = 0;
            L7: while (true) {
              if (var5_int >= this.field_t.length) {
                L8: {
                  if (-1 != (r.field_a ^ -1)) {
                    break L8;
                  } else {
                    if (!this.field_q) {
                      var9 = 0;
                      var5_int = var9;
                      L9: while (true) {
                        if ((var9 ^ -1) <= -3) {
                          break L8;
                        } else {
                          if (!this.field_A[var9]) {
                            if (ih.a(var10, (byte) -93, this.field_m[var9]) < 2) {
                              L10: {
                                if (1 == var9) {
                                  ca.a((double)this.field_m[var9].field_e + 1.5, 1, 1.0 + (double)this.field_m[var9].field_g, true, 192);
                                  break L10;
                                } else {
                                  ca.a(1.5 + (double)this.field_m[var9].field_e, 1, (double)(this.field_m[var9].field_g - -1), true, 192);
                                  break L10;
                                }
                              }
                              this.field_q = true;
                              var9++;
                              continue L9;
                            } else {
                              var9++;
                              continue L9;
                            }
                          } else {
                            var9++;
                            continue L9;
                          }
                        }
                      }
                    } else {
                      break L8;
                    }
                  }
                }
                L11: {
                  if (r.field_a != 0) {
                    break L11;
                  } else {
                    if (!this.field_q) {
                      break L11;
                    } else {
                      if (of.field_d == dn.field_i) {
                        break L11;
                      } else {
                        r.field_a = 1;
                        this.field_q = false;
                        kd.a(0, 1);
                        nh.field_E.a((byte) 46, this.field_j);
                        break L11;
                      }
                    }
                  }
                }
                L12: {
                  if (var3 <= this.field_d) {
                    break L12;
                  } else {
                    L13: {
                      this.field_d = var3;
                      if (!this.field_A[2]) {
                        r.field_a = 1;
                        break L13;
                      } else {
                        L14: {
                          r.field_a = 0;
                          kd.a(4, param0 ^ -2);
                          nh.field_E.a(-1, 8360, -1);
                          if (-4 == (var3 ^ -1)) {
                            le.field_D = 5;
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        var5 = this.field_h;
                        var6 = 0;
                        L15: while (true) {
                          if (var5.length <= var6) {
                            break L13;
                          } else {
                            L16: {
                              var7 = var5[var6];
                              if (var7 != null) {
                                var7.field_I = 0;
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                            var6++;
                            continue L15;
                          }
                        }
                      }
                    }
                    L17: {
                      if (-1 <= (ln.field_a.field_g[((oj) (var4)).field_j.b(-4)] ^ -1)) {
                        break L17;
                      } else {
                        if (ln.field_a.field_g[((oj) (var4)).field_j.b(-4)] == ln.field_a.field_g[this.field_z.field_j.b(-4)]) {
                          L18: {
                            if (this.field_z.field_i == 27) {
                              this.field_z.c((byte) 45);
                              break L18;
                            } else {
                              break L18;
                            }
                          }
                          this.field_r.field_l = -1;
                          this.field_B = false;
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                    }
                    if (var3 == 2) {
                      L19: {
                        if (var10.field_g >= 40) {
                          if (-49 >= (var10.field_e ^ -1)) {
                            this.field_i.field_l = 1776;
                            this.field_i.field_d = 2136;
                            break L19;
                          } else {
                            this.field_i.field_d = 1536;
                            this.field_i.field_l = 360;
                            break L19;
                          }
                        } else {
                          this.field_i.field_d = 552;
                          this.field_i.field_l = 1968;
                          break L19;
                        }
                      }
                      this.field_i.field_a = 1;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                }
                L20: {
                  if (3 <= var3) {
                    break L20;
                  } else {
                    le.field_D = 0;
                    break L20;
                  }
                }
                L21: {
                  if (this.field_n) {
                    break L21;
                  } else {
                    if (0 > this.field_k.field_l) {
                      break L21;
                    } else {
                      if ((ha.field_t ^ -1) != -5) {
                        break L21;
                      } else {
                        if (-3 <= (ih.a(var10, (byte) -93, this.field_j) ^ -1)) {
                          this.field_n = true;
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                    }
                  }
                }
                L22: {
                  if (0 == (ng.field_u & 15)) {
                    this.a(this.field_f, param0 ^ 0);
                    break L22;
                  } else {
                    break L22;
                  }
                }
                super.d(-1);
                break L0;
              } else {
                L23: {
                  if (this.field_t[var5_int].field_i == 126) {
                    var3++;
                    if (!this.field_A[var5_int]) {
                      var4 = this.field_t[var5_int];
                      this.field_A[var5_int] = true;
                      break L23;
                    } else {
                      break L23;
                    }
                  } else {
                    break L23;
                  }
                }
                var5_int++;
                continue L7;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var2), "pj.C(" + param0 + ')');
        }
    }

    final static int a(s param0, s param1, int param2) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
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
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("pj.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {
            stackIn_11_0 = (RuntimeException) ((Object) stackIn_8_0);

            stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    public static void c(byte param0) {
        try {
            field_l = null;
            if (param0 <= 34) {
                field_v = -116;
            }
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "pj.B(" + param0 + ')');
        }
    }

    final void e(int param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        oj var5 = null;
        int var5_int = 0;
        int var6_int = 0;
        oj var6 = null;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var12 = null;
        int[] var15 = null;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
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
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              this.field_s = new v(bn.field_n, 0, var12[7] * 24, 200);
              this.field_s.field_l = 24 * (3 + var12[6]);
              if (kh.field_Q[5]) {
                this.field_s.field_l = -1;
                break L2;
              } else {
                break L2;
              }
            }
            this.field_r = new v(jj.field_f, 0, 24 * (1 + var12[9]), 200);
            this.field_r.field_l = var12[8] * 24 - -48;
            var3 = 0;
            L3: while (true) {
              if (-3 >= (var3 ^ -1)) {
                this.field_f = new oc();
                var3 = param0;
                L4: while (true) {
                  L5: {
                    if (ll.field_a <= var3) {
                      break L5;
                    } else {
                      L6: {
                        if (wh.field_b[var3].field_i != 0) {
                          break L6;
                        } else {
                          if ((wh.field_b[var3].field_h ^ -1) == -5) {
                            this.field_f.a((byte) 46, wh.field_b[var3].field_j);
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var3++;
                      continue L4;
                    }
                  }
                  var3 = 0;
                  var4 = 0;
                  L7: while (true) {
                    if (var4 >= el.field_j) {
                      this.field_m[0] = new oc(var15[14], var15[15]);
                      this.field_m[1] = new oc(var15[16], var15[17]);
                      this.field_p[0] = new we(this.field_m[0]);
                      this.field_p[1] = new we(this.field_m[1]);
                      var3 = 0;
                      L8: while (true) {
                        if (2 <= var3) {
                          var3 = 0;
                          var4 = 0;
                          L9: while (true) {
                            if (var4 >= el.field_j) {
                              this.field_i = new v(e.field_k, 0, 0);
                              this.field_k = new v(vf.field_I, 24 * this.field_j.field_e, 24 * (-4 + this.field_j.field_g), 200);
                              break L0;
                            } else {
                              L10: {
                                var5 = mm.field_m[var4];
                                if (20 == var5.field_i) {
                                  incrementValue$0 = var3;
                                  var3++;
                                  this.field_h[incrementValue$0] = var5;
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              var4++;
                              continue L9;
                            }
                          }
                        } else {
                          var4 = 1000;
                          var5_int = -1;
                          var6_int = var3;
                          L11: while (true) {
                            if ((var6_int ^ -1) <= -4) {
                              L12: {
                                if (var5_int != var3) {
                                  var6 = this.field_t[var3];
                                  this.field_t[var3] = this.field_t[var5_int];
                                  this.field_t[var5_int] = var6;
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                              var3++;
                              continue L8;
                            } else {
                              L13: {
                                var7 = ih.a(this.field_m[var3], (byte) -76, this.field_t[var6_int].field_j);
                                if ((var7 ^ -1) > (var4 ^ -1)) {
                                  var5_int = var6_int;
                                  var4 = var7;
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              var6_int++;
                              continue L11;
                            }
                          }
                        }
                      }
                    } else {
                      L14: {
                        if (-126 == (mm.field_m[var4].field_i ^ -1)) {
                          incrementValue$1 = var3;
                          var3++;
                          this.field_t[incrementValue$1] = mm.field_m[var4];
                          break L14;
                        } else {
                          if (mm.field_m[var4].field_i == 27) {
                            this.field_z = mm.field_m[var4];
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                      }
                      var4++;
                      continue L7;
                    }
                  }
                }
              } else {
                this.field_g[var3] = new oc(var9[2 * var3 + 10], var9[11 - -(var3 * 2)]);
                this.field_x[var3] = new v(bc.field_k, 0, this.field_g[var3].field_g * 24, 200);
                this.field_x[var3].field_l = this.field_g[var3].field_e * 24 - -48;
                var3++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var2), "pj.G(" + param0 + ')');
        }
    }

    final String a(boolean param0) {
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                pj.c((byte) 57);
                break L1;
              }
            }
            if (4 == ha.field_t) {
              stackIn_6_0 = q.field_l;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              stackIn_8_0 = tc.field_c;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var2), "pj.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_8_0;
        }
    }

    final boolean b(int param0) {
        int var2_int = 0;
        int var3 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (-5 != (ha.field_t ^ -1)) {
              var2_int = -72 / ((param0 - 38) / 53);
              stackIn_10_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              var2_int = 0;
              L1: while (true) {
                if (var2_int >= this.field_m.length) {
                  stackIn_8_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  if (126 != this.field_t[var2_int].field_i) {
                    this.field_p[var2_int].a((byte) -46);
                    var2_int++;
                    continue L1;
                  } else {
                    var2_int++;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var2), "pj.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          return stackIn_10_0 != 0;
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
