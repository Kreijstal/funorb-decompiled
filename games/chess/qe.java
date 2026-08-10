/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe extends uk {
    static String field_R;
    private int[] field_H;
    private double field_T;
    private int field_I;
    private double field_w;
    private int[] field_r;
    private double field_t;
    static dd[] field_u;
    private int field_C;
    private double field_s;
    static java.applet.Applet field_B;
    static String field_O;
    private int field_Q;
    static String field_y;
    private km field_M;
    private km field_A;
    private km field_S;
    private dd field_v;
    private km field_F;
    private km field_p;
    private double[] field_D;
    private km[] field_N;
    private int[] field_G;
    private km field_q;
    private int[] field_x;
    private km[] field_z;
    qe field_K;
    private int field_P;
    String[] field_L;

    private final void a(int param0, int param1, int param2, int[] param3) {
        int var5;
        int var6;
        int var7;
        km[] var8_ref_km__;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int[] var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        dd var20;
        dd var21;
        dd var22;
        int[] var23;
        L0: {
          var5 = hn.field_k;
          var6 = rf.field_b;
          this.field_j = -1;
          if (qk.field_k != null) {
            break L0;
          } else {
            qk.field_k = new km(0, 0);
            break L0;
          }
        }
        L1: {
          qk.field_k.field_x = wb.field_d;
          qk.field_k.field_w = wb.field_h;
          qk.field_k.field_t = wb.field_c;
          if (hd.field_f != null) {
            hd.field_f.e();
            wb.b();
            break L1;
          } else {
            hd.field_f = new km(wb.field_h, wb.field_c);
            hd.field_f.e();
            break L1;
          }
        }
        L2: {
          this.a(param3, param1, 64, -13147);
          if (rn.field_b == 0) {
            break L2;
          } else {
            if (!t.field_Q) {
              break L2;
            } else {
              this.field_A.e();
              wb.b();
              break L2;
            }
          }
        }
        L3: {
          wb.a(qk.field_k.field_x, qk.field_k.field_w, qk.field_k.field_t);
          if (!t.field_Q) {
            break L3;
          } else {
            var7 = 0;
            L4: while (true) {
              if (var7 >= this.field_z.length) {
                break L3;
              } else {
                var8_ref_km__ = this.field_z;
                var9 = var7;
                this.field_N[var7] = null;
                var8_ref_km__[var9] = null;
                var7++;
                continue L4;
              }
            }
          }
        }
        var7 = 0;
        var8 = this.d(-1);
        var9 = this.m(94);
        var14 = new int[]{640, 480, 0, 0};
        var15 = 63;
        L5: while (true) {
          if (var15 < 0) {
            wb.a(qk.field_k.field_x, qk.field_k.field_w, qk.field_k.field_t);
            wb.a();
            this.g(-1, var8);
            t.field_Q = false;
            return;
          } else {
            L6: {
              var16 = this.field_r[var15];
              var17 = this.field_f[var16];
              if (var16 != var8) {
                break L6;
              } else {
                var17 = this.field_f[var9];
                break L6;
              }
            }
            L7: {
              var18 = var17 & 16773120;
              var19 = var17 & -16773121;
              if (var18 != 0) {
                var20 = ad.field_f[var19];
                var21 = ig.field_f[var19];
                var22 = pj.field_c[var19];
                break L7;
              } else {
                var20 = se.field_N[var19];
                var21 = jj.field_c[var19];
                var22 = q.field_b[var19];
                break L7;
              }
            }
            if (var20 != null) {
              L8: {
                param0 = var16 % 8;
                param2 = var16 / 8;
                param0 -= 4;
                param2 -= 4;
                var23 = new int[]{64 + (param0 << 7), param1 << 7, 64 + (param2 << 7), 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
                if (rn.field_b == 0) {
                  break L8;
                } else {
                  if (!t.field_Q) {
                    break L8;
                  } else {
                    if (var16 == var8) {
                      break L8;
                    } else {
                      L9: {
                        this.field_A.e();
                        var21.a(param3, var23);
                        this.field_M.e();
                        var22.a(param3, var23);
                        var22.a();
                        var11 = dd.field_x;
                        var13 = dd.field_D;
                        var10 = dd.field_Z;
                        var12 = dd.field_eb;
                        if (var14[0] <= var11) {
                          break L9;
                        } else {
                          var14[0] = var11;
                          break L9;
                        }
                      }
                      L10: {
                        if (var14[1] <= var13) {
                          break L10;
                        } else {
                          var14[1] = var13;
                          break L10;
                        }
                      }
                      L11: {
                        if (var14[2] <= var10) {
                          break L11;
                        } else {
                          var14[2] = var10;
                          break L11;
                        }
                      }
                      L12: {
                        if (var14[3] <= var12) {
                          break L12;
                        } else {
                          var14[3] = var12;
                          break L12;
                        }
                      }
                      this.field_N[var7] = new km(var10 - var11 + 2, var12 - var13 + 2);
                      this.field_N[var7].e();
                      this.field_M.b(1 - var11, 1 - var13);
                      this.field_N[var7].field_s = var11;
                      this.field_N[var7].field_r = var13;
                      this.field_N[var7].a(64, 64, 64);
                      this.field_M.e();
                      wb.b(var11, var13, var10, var12);
                      wb.f(0, 0, 640, 480, 0);
                      break L8;
                    }
                  }
                }
              }
              L13: {
                if (t.field_Q) {
                  this.field_M.e();
                  var20.a(param3, var23);
                  var20.a();
                  var10 = dd.field_Z;
                  var11 = dd.field_x;
                  var12 = dd.field_eb;
                  var13 = dd.field_D;
                  this.field_z[var7] = new km(var10 - var11 + 2, var12 - var13 + 2);
                  this.field_z[var7].e();
                  this.field_M.b(1 - var11, 1 - var13);
                  this.field_z[var7].field_s = var11;
                  this.field_z[var7].field_r = var13;
                  this.field_M.e();
                  wb.b(var11, var13, var10, var12);
                  wb.f(0, 0, 640, 480, 0);
                  if (jc.field_f == -1) {
                    if (this.field_z[var7] != null) {
                      if (this.field_z[var7].c(0, 0, var5, var6)) {
                        break L13;
                      } else {
                        var7++;
                        var15--;
                        continue L5;
                      }
                    } else {
                      var7++;
                      var15--;
                      continue L5;
                    }
                  } else {
                    var7++;
                    var15--;
                    continue L5;
                  }
                } else {
                  if (jc.field_f == -1) {
                    if (this.field_z[var7] != null) {
                      if (this.field_z[var7].c(0, 0, var5, var6)) {
                        break L13;
                      } else {
                        var7++;
                        var15--;
                        continue L5;
                      }
                    } else {
                      var7++;
                      var15--;
                      continue L5;
                    }
                  } else {
                    var7++;
                    var15--;
                    continue L5;
                  }
                }
              }
              this.field_j = var16;
              var7++;
              var15--;
              continue L5;
            } else {
              var7++;
              var15--;
              continue L5;
            }
          }
        }
    }

    private final void b(int param0, int param1, byte param2) {
        int var4;
        int var5;
        km var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        km var12;
        km var13;
        km var14;
        L0: {
          var11 = Chess.field_G;
          this.e(-73);
          this.field_S.b(0, 0);
          if (rn.field_b != 0) {
            this.field_A.b(0, 0, 128);
            break L0;
          } else {
            break L0;
          }
        }
        var4 = 0;
        if (param2 >= 19) {
          L1: while (true) {
            if (this.field_z.length <= var4) {
              return;
            } else {
              var5 = this.field_r[-var4 + -1 + this.field_z.length];
              var12 = this.field_z[var4];
              var13 = var12;
              var6 = var13;
              var13 = var12;
              var6 = var13;
              var6 = var12;
              if (var12 != null) {
                L2: {
                  if (param0 == var5) {
                    var7 = (int)(Math.sin((double)qb.field_a / 10.0) * 32.0);
                    var8 = var7;
                    var9 = -var7 / 4;
                    var10 = -3 * var7 / 4;
                    var13 = var12.c();
                    var6 = var13;
                    var13.a(var8, var9, var10);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  var7 = 192 - -(int)(Math.sin((double)qb.field_a / 10.0) * 63.0);
                  if (var5 == this.field_m) {
                    var14 = var6.c();
                    var6 = var14;
                    var14.f(16711680);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if (var5 != this.field_j) {
                  if (param1 == var5) {
                    var6.b(0, 0, (-128 + var7) / 2);
                    var4++;
                    continue L1;
                  } else {
                    var6.b(0, 0);
                    var4++;
                    continue L1;
                  }
                } else {
                  L4: {
                    if (this.field_f[var5] == 0) {
                      var9 = pj.field_b[var5];
                      break L4;
                    } else {
                      var9 = this.field_f[var5] & 16773120;
                      break L4;
                    }
                  }
                  L5: {
                    if (-1 == (var9 ^ -1)) {
                      var8 = 0;
                      break L5;
                    } else {
                      var8 = 8421504;
                      break L5;
                    }
                  }
                  if (var5 == param1) {
                    var6.b(0, 0, (var7 - 128) / 2);
                    var4++;
                    continue L1;
                  } else {
                    var6.b(0, 0, var7, var8);
                    var4++;
                    continue L1;
                  }
                }
              } else {
                var4++;
                continue L1;
              }
            }
          }
        } else {
          return;
        }
    }

    private final void e(int param0) {
        int[] var5 = wb.field_d;
        int[] var2 = var5;
        if (param0 >= -36) {
            return;
        }
        int var3 = wb.field_h;
        int var4 = wb.field_c;
        this.field_S.e();
        wb.b(this.field_x);
        this.field_p.e(0, 0);
        wb.a(this.field_x);
        wb.a(var5, var3, var4);
    }

    private final int d(int param0) {
        int var2;
        int var3;
        var3 = Chess.field_G;
        var2 = param0 + this.field_h.length;
        L0: while (true) {
          L1: {
            if (0 > var2) {
              break L1;
            } else {
              if (null != this.field_h[var2]) {
                break L1;
              } else {
                var2--;
                continue L0;
              }
            }
          }
          if (0 == (var2 ^ -1)) {
            return -1;
          } else {
            return this.field_h[var2].field_f;
          }
        }
    }

    private final void c(int[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        bn var11 = null;
        int var12_int = 0;
        int[] var12 = null;
        int var13 = 0;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var13 = Chess.field_G;
        try {
          L0: {
            L1: {
              if ((this.d(-1) ^ -1) == 0) {
                break L1;
              } else {
                if ((this.m(79) ^ -1) != 0) {
                  var5_int = this.d(-1) / 8;
                  var6 = this.d(-1) % 8;
                  var7 = this.m(81) / 8;
                  var5_int = var5_int * 132;
                  var6 = var6 * 132;
                  var8 = this.m(89) % 8;
                  var5_int -= 528;
                  var7 = var7 * 132;
                  var6 -= 528;
                  var8 = var8 * 132;
                  var8 -= 528;
                  var7 -= 528;
                  if ((var6 ^ -1) == -2147483648) {
                    break L1;
                  } else {
                    if (var8 != 2147483647) {
                      var9 = (byte)(int)(33.0 * Math.sin((double)r.field_Eb / 10.0) + 64.0);
                      var16 = (int[]) ((Object) this.field_H.clone());
                      var15 = var16;
                      var10 = var15;
                      se.a(var8, var16, 45, (byte) 49, var5_int, var7, var6);
                      var11 = new bn(var16.length >> -1961894143, 5, 0);
                      var12_int = 0;
                      L2: while (true) {
                        if (var16.length <= var12_int) {
                          var11.a(0, 6, 1, (byte) 1, (byte) -1, (short) 960, (short) -1);
                          var11.a(2, 1, 3, (byte) 1, (byte) -1, (short) 960, (short) -1);
                          var11.a(1, 5, 3, (byte) 1, (byte) -1, (short) 960, (short) -1);
                          var11.a(5, 4, 3, (byte) 1, (byte) -1, (short) 960, (short) -1);
                          var11.a(6, 5, 1, (byte) 1, (byte) -1, (short) 960, (short) -1);
                          var12_int = 0;
                          L3: while (true) {
                            if (var11.field_D.length <= var12_int) {
                              this.field_v = (dd) ((Object) var11.a(100, 131072, 10, 10, 10));
                              var12 = new int[]{param3, param2 << 1933005799, param3, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
                              this.field_v.a(param0, var12);
                              break L1;
                            } else {
                              var11.field_D[var12_int] = (byte)var9;
                              var12_int++;
                              continue L3;
                            }
                          }
                        } else {
                          var11.a(var16[var12_int], 0, var10[1 + var12_int]);
                          var12_int += 2;
                          continue L2;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            L4: {
              if (param1 < -85) {
                break L4;
              } else {
                var14 = (int[]) null;
                this.a((int[]) null, 52, 43, 116);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var5);

            stackIn_19_1 = new StringBuilder().append("qe.U(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void c(byte param0) {
        int var2;
        int var3;
        double var4;
        int var6;
        double var6_double;
        double var8;
        int var10;
        var10 = Chess.field_G;
        var2 = 0;
        L0: while (true) {
          if ((var2 ^ -1) <= -9) {
            var2 = 63;
            L1: while (true) {
              if (0 > var2) {
                L2: {
                  if (param0 <= -77) {
                    break L2;
                  } else {
                    this.field_Q = 62;
                    break L2;
                  }
                }
                var2 = 1;
                L3: while (true) {
                  if (var2 == 0) {
                    this.field_r = this.field_G;
                    return;
                  } else {
                    var2 = 0;
                    var3 = 63;
                    L4: while (true) {
                      if ((var3 ^ -1) >= -1) {
                        continue L3;
                      } else {
                        if (this.field_D[var3] < this.field_D[var3 + -1]) {
                          var4 = this.field_D[var3];
                          var6 = this.field_G[var3];
                          this.field_D[var3] = this.field_D[-1 + var3];
                          this.field_D[-1 + var3] = var4;
                          this.field_G[var3] = this.field_G[-1 + var3];
                          var2 = 1;
                          this.field_G[var3 - 1] = var6;
                          var3--;
                          continue L4;
                        } else {
                          var3--;
                          continue L4;
                        }
                      }
                    }
                  }
                }
              } else {
                this.field_G[var2] = var2;
                var2--;
                continue L1;
              }
            }
          } else {
            var3 = 0;
            L5: while (true) {
              if (8 <= var3) {
                var2++;
                continue L0;
              } else {
                var4 = (double)(this.field_I + (4 + -var2));
                var6_double = (double)this.field_C;
                var8 = (double)(-var3 + (4 + this.field_Q));
                this.field_D[8 * var3 + var2] = var8 * var8 + (var6_double * var6_double + var4 * var4);
                var3++;
                continue L5;
              }
            }
          }
        }
    }

    qe(boolean param0) {
        this.field_w = 0.5;
        this.field_H = new int[]{-2, 0, -2, 35, -6, 35, 0, 45, 6, 35, 2, 35, 2, 0};
        this.field_t = 0.5;
        this.field_T = 0.5;
        this.field_r = new int[64];
        this.field_s = 0.5;
        this.field_M = new km(640, 480);
        this.field_A = new km(640, 480);
        this.field_S = new km(640, 480);
        this.field_p = new km(640, 480);
        this.field_D = new double[64];
        this.field_N = new km[64];
        this.field_G = new int[64];
        this.field_x = new int[4];
        this.field_z = new km[64];
        this.field_q = new km(640, 480);
        this.field_P = -1;
        this.c((byte) -110);
        this.a(-0.7853981633974483, param0 ? 3.141592653589793 : 0.0, true);
    }

    final boolean b(byte param0) {
        if (param0 != 15) {
            this.field_S = (km) null;
        }
        return this.a(this.field_s, (byte) 42, this.field_w);
    }

    qe() {
        this(true);
    }

    private final void a(int[] param0, int param1, int param2, int param3) {
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        dd var13 = null;
        int var14 = 0;
        int var15 = 0;
        int[] var19 = null;
        var15 = Chess.field_G;
        try {
          L0: {
            L1: {
              if (param3 == -13147) {
                break L1;
              } else {
                this.field_G = (int[]) null;
                break L1;
              }
            }
            L2: {
              var19 = wb.field_d;
              var8 = wb.field_h;
              var9 = wb.field_c;
              this.field_S.e();
              wb.b();
              var10 = -1;
              if (oc.field_p == null) {
                break L2;
              } else {
                if (oc.field_p.field_b) {
                  if (oc.field_p.field_B.field_l != oc.field_p.field_a) {
                    break L2;
                  } else {
                    var10 = oc.field_p.field_C;
                    break L2;
                  }
                } else {
                  var10 = oc.field_p.field_C;
                  break L2;
                }
              }
            }
            var11 = 0;
            L3: while (true) {
              if (var11 >= pj.field_b.length) {
                this.c(param0, -119, param1, param2);
                wb.a(var19, var8, var9);
                break L0;
              } else {
                L4: {
                  var5_int = var11 % 8;
                  var6 = var11 / 8;
                  var6 -= 4;
                  var5_int -= 4;
                  var12 = new int[]{param2 - -(var5_int << 1797155911), param1 << -1685981465, param2 + (var6 << -1831060889), 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
                  var14 = this.a(var10, var11, -103) ? 1 : 0;
                  if (pj.field_b[var11] == 0) {
                    if (var14 != 0) {
                      var13 = mm.field_a;
                      break L4;
                    } else {
                      var13 = rm.field_H;
                      break L4;
                    }
                  } else {
                    if (var14 == 0) {
                      var13 = bd.field_b;
                      break L4;
                    } else {
                      var13 = mh.field_f;
                      break L4;
                    }
                  }
                }
                var13.a(param0, var12);
                if ((jc.field_f ^ -1) == 0) {
                  if ((this.field_j ^ -1) == 0) {
                    L5: {
                      if (this.field_S.c(0, 0, hn.field_k, rf.field_b)) {
                        this.field_j = var11;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var11++;
                    continue L3;
                  } else {
                    var11++;
                    continue L3;
                  }
                } else {
                  var11++;
                  continue L3;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var5);

            stackIn_29_1 = new StringBuilder().append("qe.M(");

            if (param0 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L6;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L6;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(byte param0, boolean param1) {
        jh.field_e.a(true, 0, 0);
        if (param0 != -31) {
            field_O = (String) null;
        }
    }

    final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        double[] var5 = new double[]{(double)(-this.field_I), (double)(-this.field_C), (double)(-this.field_Q)};
        if (param0 > -60) {
            field_R = (String) null;
        }
        double[] var6 = new double[]{0.0, 1.0, 0.0};
        double[] var7 = new double[]{1.0, 0.0, 0.0};
        int[] var11 = this.a(var7, var6, var5, (byte) -40);
        int[] var10 = var11;
        int[] var8 = var10;
        int var9 = -420 + (int)((-this.field_t + 3.141592653589793) * 400.0 / 3.141592653589793);
        var8[0] = (int)((double)var8[0] - (double)var9 * qn.a(-17513, this.field_T));
        var8[2] = (int)((double)var8[2] - mn.a(this.field_T, 2278) * (double)var9);
        if (!(this.field_F != null)) {
            this.field_F = new km(640, 480);
            vk.field_e = true;
        }
        if (!(!vk.field_e)) {
            this.b(var11, var2, 0, var4);
        }
        this.field_F.d(0, 0);
        this.a(var2, var3, var4, var11);
        this.b(this.m(93), this.d(-1), (byte) 122);
    }

    public static void k(int param0) {
        field_B = null;
        if (param0 != 2) {
            field_R = (String) null;
        }
        field_O = null;
        field_R = null;
        field_u = null;
        field_y = null;
    }

    private final void b(int[] param0, int param1, int param2, int param3) {
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int[] var8_ref_int__ = null;
        int var8 = 0;
        int var9 = 0;
        int[] var11 = null;
        int var12 = 0;
        dd var13 = null;
        dd var14 = null;
        var12 = Chess.field_G;
        try {
          L0: {
            L1: {
              qk.field_k.field_t = wb.field_c;
              qk.field_k.field_w = wb.field_h;
              vk.field_e = false;
              qk.field_k.field_x = wb.field_d;
              this.field_F.e();
              var5_int = 170 + ((int)(500.0 * this.field_t) - -(ec.c((byte) -63) / 2));
              wb.b();
              if (ph.field_f == null) {
                break L1;
              } else {
                var6_int = -(int)((double)ph.field_f.field_w * this.field_T / 6.283185307179586);
                var7 = var5_int + -120;
                ph.field_f.b(var6_int, var7);
                ph.field_f.b(-ph.field_f.field_w + var6_int, var7);
                ph.field_f.b(var6_int + ph.field_f.field_w, var7);
                break L1;
              }
            }
            L2: {
              stackIn_5_0 = 0;

              stackIn_5_1 = var5_int;

              stackIn_5_2 = 640;

              if (-3 == (rn.field_b ^ -1)) {
                stackIn_6_0 = stackIn_5_0;
                stackIn_6_1 = stackIn_5_1;
                stackIn_6_2 = stackIn_5_2;
                stackIn_6_3 = 126;
                break L2;
              } else {
                stackIn_6_0 = stackIn_5_0;
                stackIn_6_1 = stackIn_5_1;
                stackIn_6_2 = stackIn_5_2;
                stackIn_6_3 = 480 + -var5_int;
                break L2;
              }
            }
            L3: {
              wb.f(stackIn_6_0, stackIn_6_1, stackIn_6_2, stackIn_6_3, rh.field_a[qm.field_g]);
              if (0 != rn.field_b) {
                var6_int = -16;
                L4: while (true) {
                  if (var6_int > 16) {
                    break L3;
                  } else {
                    var7 = -16;
                    L5: while (true) {
                      if (var7 > 16) {
                        var6_int += 4;
                        continue L4;
                      } else {
                        var8_ref_int__ = new int[]{var7 + param1 << 676553831, 42, var6_int + param3 << -699840505, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
                        ei.field_q.a(param0, var8_ref_int__);
                        var7 += 4;
                        continue L5;
                      }
                    }
                  }
                }
              } else {
                break L3;
              }
            }
            L6: {
              if (2 == rn.field_b) {
                var6_int = 0;
                L7: while (true) {
                  if ((var6_int ^ -1) <= -3) {
                    break L6;
                  } else {
                    var7 = -16;
                    L8: while (true) {
                      if ((var7 ^ -1) < -17) {
                        var6_int++;
                        continue L7;
                      } else {
                        var8 = -16;
                        L9: while (true) {
                          if ((var8 ^ -1) < -17) {
                            var7++;
                            continue L8;
                          } else {
                            L10: {
                              if (6 <= Math.abs(var7)) {
                                break L10;
                              } else {
                                if (Math.abs(var8) >= 6) {
                                  break L10;
                                } else {
                                  var8++;
                                  continue L9;
                                }
                              }
                            }
                            L11: {
                              var9 = wc.field_z[qm.field_g][16 + var8][var7 - -16];
                              if (0 != var6_int) {
                                break L11;
                              } else {
                                if (11 > var9) {
                                  break L11;
                                } else {
                                  var8++;
                                  continue L9;
                                }
                              }
                            }
                            L12: {
                              L13: {
                                if (var6_int != 1) {
                                  break L13;
                                } else {
                                  if (-12 >= (var9 ^ -1)) {
                                    break L13;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              if (-1 > (var9 ^ -1)) {
                                if (var9 < dn.field_h[qm.field_g]) {
                                  L14: {
                                    var13 = am.field_c[var9];
                                    var14 = var13;
                                    var14 = var13;
                                    var11 = new int[]{var8 + param1 << -1407228121, 42, var7 + param3 << -1488574777, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
                                    if (var13 == null) {
                                      break L14;
                                    } else {
                                      var13.a(param0, var11);
                                      break L14;
                                    }
                                  }
                                  var14 = field_u[var9];
                                  if (var14 != null) {
                                    var14.a(param0, var11);
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                } else {
                                  break L12;
                                }
                              } else {
                                var8++;
                                continue L9;
                              }
                            }
                            var8++;
                            continue L9;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                break L6;
              }
            }
            L15: {
              var6 = new int[]{param2, -6, 0, 63488, 0, 0, 0, 63488, 0, 0, 0, 63488};
              if (rn.field_b != 0) {
                sl.field_g.a(param0, var6);
                break L15;
              } else {
                break L15;
              }
            }
            qk.field_k.e();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var5 = decompiledCaughtException;
            stackIn_52_0 = (RuntimeException) (var5);

            stackIn_52_1 = new StringBuilder().append("qe.K(");

            if (param0 == null) {
              stackIn_53_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "null";
              break L16;
            } else {
              stackIn_53_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "{...}";
              break L16;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_53_0), stackIn_53_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final String a(int param0, byte param1) {
        int var3 = -16773121 & param0;
        if (param1 <= 2) {
            this.a(true, false, 105, 28, (byte) -18, false);
        }
        return jf.field_c[var3];
    }

    final void g(int param0) {
        int discarded$0 = 0;
        this.field_w = this.field_T;
        this.field_s = this.field_t;
        if (param0 != 1) {
            discarded$0 = this.d(-31);
        }
    }

    private final boolean a(int param0, int param1, int param2) {
        int var4;
        int stackIn_16_0 = 0;
        if (param2 < -74) {
          L0: {
            if (!this.field_d[param1]) {
              if (this.field_f[param1] != 0) {
                if (this.field_m == -1) {
                  if (-1 != param0) {
                    if (param0 == (this.field_f[param1] & 16773120)) {
                      if (this.a(param0, param1, (byte) -12)) {
                        stackIn_16_0 = 1;
                        break L0;
                      } else {
                        stackIn_16_0 = 0;
                        break L0;
                      }
                    } else {
                      stackIn_16_0 = 0;
                      break L0;
                    }
                  } else {
                    stackIn_16_0 = 0;
                    break L0;
                  }
                } else {
                  stackIn_16_0 = 0;
                  break L0;
                }
              } else {
                stackIn_16_0 = 0;
                break L0;
              }
            } else {
              stackIn_16_0 = 1;
              break L0;
            }
          }
          var4 = stackIn_16_0;
          return var4 != 0;
        } else {
          return false;
        }
    }

    final void f(int param0) {
        this.a(0.04908738521234052 + this.field_t, this.field_T, true);
        if (param0 != -4083) {
            int[] var3 = (int[]) null;
            this.a(64, 34, -72, (int[]) null);
        }
    }

    private final String h(int param0, int param1) {
        int var3 = param1 / 8;
        int var4 = param1 % 8;
        int var5 = -65 % ((55 - param0) / 50);
        return sj.field_j[var4] + (1 + var3);
    }

    final int a(boolean param0, boolean param1, int param2, int param3, byte param4, boolean param5) {
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_52_0 = 0;
        c stackIn_69_0 = null;
        String[] stackIn_69_1 = null;
        c stackIn_70_0 = null;
        String[] stackIn_70_1 = null;
        int stackIn_70_2 = 0;
        c stackIn_72_0 = null;
        c stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13_int;
        String[] var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        km var25;
        km var26;
        int[] var30;
        L0: {
          var24 = Chess.field_G;
          qk.field_k.field_w = wb.field_h;
          qk.field_k.field_x = wb.field_d;
          qk.field_k.field_t = wb.field_c;
          hd.field_f.e();
          if (!param5) {
            wb.b();
            break L0;
          } else {
            ob.field_B.b(0, param3);
            break L0;
          }
        }
        L1: {
          var7 = -1;
          if (null == oc.field_p) {
            break L1;
          } else {
            if (!param5) {
              break L1;
            } else {
              if (oc.field_p.field_b) {
                if (oc.field_p.field_B.field_l != oc.field_p.field_a) {
                  break L1;
                } else {
                  var7 = oc.field_p.field_C;
                  break L1;
                }
              } else {
                var7 = oc.field_p.field_C;
                break L1;
              }
            }
          }
        }
        L2: {
          var8 = this.d(-1);
          var9 = this.m(71);
          if (param4 <= -74) {
            break L2;
          } else {
            qe.k(-34);
            break L2;
          }
        }
        var10 = 370 + param3;
        var11 = 140;
        var12 = var10 - 315;
        var13_int = 0;
        L3: while (true) {
          if ((var13_int ^ -1) <= -5) {
            var13_int = 4;
            L4: while (true) {
              if ((var13_int ^ -1) <= -10) {
                var13_int = 9;
                L5: while (true) {
                  if (15 <= var13_int) {
                    this.field_j = -1;
                    var13_int = 7;
                    L6: while (true) {
                      if (var13_int < 0) {
                        var13 = new String[]{"A", "B", "C", "D", "E", "F", "G", "H"};
                        var14 = 0;
                        L7: while (true) {
                          if ((var14 ^ -1) <= -9) {
                            L8: {
                              var14 = var8 / 8;
                              var15 = var8 % 8;
                              var16 = var9 / 8;
                              var17 = var9 % 8;
                              if (!param0) {
                                var19 = var10 - 45 * var14;
                                var21 = var10 + -(var16 * 45);
                                var18 = 320 - -(45 * (-4 + var15));
                                var20 = 140 + 45 * var17;
                                break L8;
                              } else {
                                var19 = var10 - (-var14 + 7) * 45;
                                var18 = 320 + (135 - var15 * 45);
                                var20 = 45 * (-var17 + 3) + 320;
                                var21 = -(45 * (7 + -var16)) + var10;
                                break L8;
                              }
                            }
                            L9: {
                              var21 += 22;
                              var18 += 22;
                              var19 += 22;
                              var20 += 22;
                              var22 = (int)(33.0 * Math.sin((double)param2 / 10.0)) + 64;
                              var30 = (int[]) ((Object) this.field_H.clone());
                              se.a(var20, var30, 45, (byte) 44, var19, var21, var18);
                              wa.b(var30, 16711680, var22);
                              qk.field_k.e();
                              if (param5) {
                                if ((jc.field_f ^ -1) == 0) {
                                  hd.field_f.b(0, 0, 64);
                                  break L9;
                                } else {
                                  hd.field_f.d(0, 0);
                                  break L9;
                                }
                              } else {
                                hd.field_f.d(0, 0);
                                break L9;
                              }
                            }
                            return var10 + -315;
                          } else {
                            L10: {
                              var11 = -180 - -(45 * var14) + 320;
                              var12 = 45 + var10;
                              stackIn_69_0 = jj.field_b;

                              stackIn_69_1 = (String[]) (var13);

                              if (param0) {
                                stackIn_70_0 = (c) ((Object) stackIn_69_0);
                                stackIn_70_1 = (String[]) ((Object) stackIn_69_1);
                                stackIn_70_2 = 7 - var14;
                                break L10;
                              } else {
                                stackIn_70_0 = (c) ((Object) stackIn_69_0);
                                stackIn_70_1 = (String[]) ((Object) stackIn_69_1);
                                stackIn_70_2 = var14;
                                break L10;
                              }
                            }
                            L11: {
                              ((c) (Object) stackIn_70_0).b(stackIn_70_1[stackIn_70_2], 22 + var11, var12 + 14, 15794175, 1);
                              var12 = var10 - 45 * var14;
                              var11 = 140;
                              stackIn_72_0 = jj.field_b;

                              if (!param0) {
                                stackIn_73_0 = (c) ((Object) stackIn_72_0);
                                stackIn_73_1 = var14 - -1;
                                break L11;
                              } else {
                                stackIn_73_0 = (c) ((Object) stackIn_72_0);
                                stackIn_73_1 = -var14 + 8;
                                break L11;
                              }
                            }
                            ((c) (Object) stackIn_73_0).c(Integer.toString(stackIn_73_1), var11 + -5, 22 + var12, 15794175, 1);
                            var14++;
                            continue L7;
                          }
                        }
                      } else {
                        var14 = 0;
                        L12: while (true) {
                          if (8 <= var14) {
                            var13_int--;
                            continue L6;
                          } else {
                            L13: {
                              var11 = 320 - (-(45 * var14) - -180);
                              var15 = var14 + 8 * var13_int;
                              var12 = var10 + -(var13_int * 45);
                              if (param0) {
                                var12 = var10 - 315 - -(var13_int * 45);
                                var11 = -(45 * var14) + 455;
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                            L14: {
                              var16 = this.field_f[var15];
                              var17 = var16 & 16773120;
                              var18 = var16 & -16773121;
                              if (0 != var17) {
                                stackIn_30_0 = 0;
                                break L14;
                              } else {
                                stackIn_30_0 = 1;
                                break L14;
                              }
                            }
                            L15: {
                              var19 = stackIn_30_0;
                              if (0 != pj.field_b[var15]) {
                                stackIn_33_0 = 3100495;
                                break L15;
                              } else {
                                stackIn_33_0 = 16444375;
                                break L15;
                              }
                            }
                            L16: {
                              var20 = stackIn_33_0;
                              if (this.field_d[var15]) {
                                L17: {
                                  if (pj.field_b[var15] == 0) {
                                    stackIn_38_0 = 14101529;
                                    break L17;
                                  } else {
                                    stackIn_38_0 = 4525064;
                                    break L17;
                                  }
                                }
                                var20 = stackIn_38_0;
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                            L18: {
                              wb.f(var11, var12, 45, 45, var20);
                              if (var15 != this.field_m) {
                                L19: {
                                  if (!this.a(var7, var15, -80)) {
                                    stackIn_49_0 = 0;
                                    break L19;
                                  } else {
                                    stackIn_49_0 = 1;
                                    break L19;
                                  }
                                }
                                L20: {
                                  var22 = stackIn_49_0;
                                  if (-4097 != (pj.field_b[var15] ^ -1)) {
                                    stackIn_52_0 = 1;
                                    break L20;
                                  } else {
                                    stackIn_52_0 = 0;
                                    break L20;
                                  }
                                }
                                var23 = stackIn_52_0;
                                cl.field_c[var22][var23][var19][var18].d(var11, var12);
                                break L18;
                              } else {
                                if (rn.field_b != 0) {
                                  var26 = rl.field_d[var19][var18].c();
                                  var22 = 0;
                                  L21: while (true) {
                                    if (4 <= var22) {
                                      var26.a(var11, var12);
                                      break L18;
                                    } else {
                                      var26.f(16711680);
                                      var22++;
                                      continue L21;
                                    }
                                  }
                                } else {
                                  var25 = hb.field_b[var19][var18].c();
                                  var25.f(16711680);
                                  var25.b(var11, var12);
                                  break L18;
                                }
                              }
                            }
                            if (param1) {
                              if (hn.field_k >= var11) {
                                if (hn.field_k < 45 + var11) {
                                  if (rf.field_b >= var12) {
                                    if (45 + var12 > rf.field_b) {
                                      this.field_j = var15;
                                      var21 = 128 + (int)(63.0 * Math.sin((double)qb.field_a / 10.0));
                                      wb.b(var11, var12, 45, 45, var20, var21);
                                      var14++;
                                      continue L12;
                                    } else {
                                      var14++;
                                      continue L12;
                                    }
                                  } else {
                                    var14++;
                                    continue L12;
                                  }
                                } else {
                                  var14++;
                                  continue L12;
                                }
                              } else {
                                var14++;
                                continue L12;
                              }
                            } else {
                              var14++;
                              continue L12;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    wb.d(-var13_int + var11, -var13_int + var12, 360 - -(2 * var13_int), var13_int * 2 + 360, 4998726);
                    var13_int++;
                    continue L5;
                  }
                }
              } else {
                wb.d(var11 - var13_int, -var13_int + var12, 360 + var13_int * 2, 360 - -(2 * var13_int), 3288622);
                var13_int++;
                continue L4;
              }
            }
          } else {
            wb.d(var11 + -var13_int, var12 - var13_int, 360 - -(2 * var13_int), 2 * var13_int + 360, 10983537);
            var13_int++;
            continue L3;
          }
        }
    }

    final boolean a(double param0, byte param1, double param2) {
        int var6;
        int var7;
        L0: {
          var7 = Chess.field_G;
          if (param1 == 42) {
            break L0;
          } else {
            field_B = (java.applet.Applet) null;
            break L0;
          }
        }
        L1: {
          var6 = 0;
          if (param2 >= this.field_T) {
            if (this.field_T >= param2) {
              break L1;
            } else {
              L2: {
                this.field_T = this.field_T + 0.04908738521234052;
                if (param2 >= this.field_T) {
                  break L2;
                } else {
                  this.field_T = param2;
                  break L2;
                }
              }
              var6 = 1;
              break L1;
            }
          } else {
            L3: {
              this.field_T = this.field_T - 0.04908738521234052;
              if (param2 > this.field_T) {
                this.field_T = param2;
                break L3;
              } else {
                break L3;
              }
            }
            var6 = 1;
            break L1;
          }
        }
        L4: {
          if (param0 >= this.field_t) {
            if (param0 > this.field_t) {
              L5: {
                this.field_t = this.field_t + 0.04908738521234052;
                if (param0 >= this.field_t) {
                  break L5;
                } else {
                  this.field_t = param0;
                  break L5;
                }
              }
              var6 = 1;
              break L4;
            } else {
              break L4;
            }
          } else {
            this.field_t = this.field_t - 0.04908738521234052;
            var6 = 1;
            if (this.field_t >= param0) {
              break L4;
            } else {
              this.field_t = param0;
              break L4;
            }
          }
        }
        this.a(this.field_t, this.field_T, true);
        return var6 != 0;
    }

    final void j(int param0) {
        String discarded$0 = null;
        if (param0 <= 83) {
            discarded$0 = this.a(false, -127, -34, -39, -63);
        }
        this.a(-0.04908738521234052 + this.field_t, this.field_T, true);
    }

    final void f(int param0, int param1) {
        String[] stackIn_12_0;
        int stackIn_12_1;
        StringBuilder stackIn_12_2;
        qe stackIn_12_3;
        String[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        StringBuilder stackIn_13_2 = null;
        qe stackIn_13_3 = null;
        int stackIn_13_4 = 0;
        int stackIn_16_0 = 0;
        String[] var3;
        int var4;
        int var5;
        int var6;
        int var7;
        String var8;
        int var9;
        int var10;
        String[] var11;
        L0: {
          var10 = Chess.field_G;
          if (param1 == -1) {
            break L0;
          } else {
            this.f(-101, 67);
            break L0;
          }
        }
        L1: {
          if (this.field_P == param0) {
            break L1;
          } else {
            this.field_K = new qe();
            this.field_P = param0;
            var11 = new String[(this.a((byte) -124) - -1) / 2];
            var3 = var11;
            var4 = 0;
            L2: while (true) {
              L3: {
                if (this.field_h.length <= var4) {
                  break L3;
                } else {
                  if (this.field_P <= var4) {
                    break L3;
                  } else {
                    if (this.field_h[var4] == null) {
                      break L3;
                    } else {
                      L4: {
                        this.field_K.a(this.field_h[var4].field_f, false, param1 + 0);
                        var5 = this.field_h[var4].field_f;
                        var6 = this.field_h[var4].field_d;
                        var7 = this.field_h[var4].field_e;
                        if ((1 & var4) == 0) {
                          var8 = var4 / 2 - -1 + ".";
                          break L4;
                        } else {
                          var8 = var3[var4 / 2];
                          break L4;
                        }
                      }
                      L5: {
                        stackIn_12_0 = (String[]) (var3);

                        stackIn_12_1 = var4 / 2;

                        stackIn_12_2 = new StringBuilder().append(var8).append(" ");

                        stackIn_12_3 = this.field_K;

                        if (-1 != (ce.a(1, var4) ^ -1)) {
                          stackIn_13_0 = (String[]) ((Object) stackIn_12_0);
                          stackIn_13_1 = stackIn_12_1;
                          stackIn_13_2 = (StringBuilder) ((Object) stackIn_12_2);
                          stackIn_13_3 = (qe) ((Object) stackIn_12_3);
                          stackIn_13_4 = 0;
                          break L5;
                        } else {
                          stackIn_13_0 = (String[]) ((Object) stackIn_12_0);
                          stackIn_13_1 = stackIn_12_1;
                          stackIn_13_2 = (StringBuilder) ((Object) stackIn_12_2);
                          stackIn_13_3 = (qe) ((Object) stackIn_12_3);
                          stackIn_13_4 = 1;
                          break L5;
                        }
                      }
                      L6: {
                        stackIn_13_0[stackIn_13_1] = ((qe) (Object) stackIn_13_3).a(stackIn_13_4 != 0, var7, var6, dm.a(param1, -33), var5);
                        this.field_K.a((byte) 19, this.field_h[var4].field_e, this.field_h[var4].field_f, this.field_h[var4].field_d);
                        if ((1 & var4) != 0) {
                          stackIn_16_0 = 0;
                          break L6;
                        } else {
                          stackIn_16_0 = 4096;
                          break L6;
                        }
                      }
                      var9 = stackIn_16_0;
                      if (!this.field_K.a((byte) 61, var9)) {
                        if (this.field_K.e(var9, 100)) {
                          var3[var4 / 2] = var3[var4 / 2] + "+";
                          var4++;
                          continue L2;
                        } else {
                          var4++;
                          continue L2;
                        }
                      } else {
                        var3[var4 / 2] = var3[var4 / 2] + "#";
                        var4++;
                        continue L2;
                      }
                    }
                  }
                }
              }
              var4 = 0;
              var5 = 0;
              L7: while (true) {
                L8: {
                  if (var5 >= var11.length) {
                    break L8;
                  } else {
                    if (null == var11[var5]) {
                      break L8;
                    } else {
                      var4++;
                      var5++;
                      continue L7;
                    }
                  }
                }
                this.field_L = new String[var4];
                var5 = 0;
                L9: while (true) {
                  if (var4 <= var5) {
                    break L1;
                  } else {
                    this.field_L[var5] = var11[var5];
                    var5++;
                    continue L9;
                  }
                }
              }
            }
          }
        }
    }

    final void a(double param0, double param1, boolean param2) {
        t.field_Q = true;
        vk.field_e = param2 ? true : false;
        this.field_T = param1 % 6.283185307179586;
        this.field_t = param0 % 6.283185307179586;
        if (!(this.field_t <= -0.1)) {
            this.field_t = -0.1;
        }
        if (6.283185307179586 < this.field_T || 0.0 > this.field_T) {
            this.field_T = this.field_T % 6.283185307179586;
        }
        if (this.field_t < -1.5607963267948965) {
            this.field_t = -1.5607963267948965;
        }
        this.field_C = (int)(1280.0 * Math.sin(this.field_t));
        double var6 = Math.cos(this.field_t);
        this.field_I = (int)(var6 * (Math.sin(this.field_T) * 1280.0));
        this.field_Q = (int)(var6 * (Math.cos(this.field_T) * 1280.0));
        this.field_C = this.field_C - 200;
        this.field_C = this.field_C + (int)(Math.sin(this.field_t * 2.0) * 320.0);
        this.c((byte) -85);
    }

    final int a(boolean param0, int param1, int param2) {
        if (!param0) {
            this.field_H = (int[]) null;
        }
        this.f(param2, -1);
        int[] var8 = wb.field_d;
        int[] var4 = var8;
        int var5 = wb.field_h;
        int var6 = wb.field_c;
        this.field_q.e();
        int var7 = 0;
        if (this.field_K != null) {
            var7 = this.field_K.a(false, false, param1, 0, (byte) -100, false);
        }
        wb.a(var8, var5, var6);
        this.field_q.b(120, ec.c((byte) -63) / 2 + -21, 196);
        return var7;
    }

    private final void g(int param0, int param1) {
        int[] var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int[] var9;
        var8 = Chess.field_G;
        var9 = wb.field_d;
        var3 = var9;
        var4 = wb.field_h;
        var5 = wb.field_c;
        this.field_p.e();
        wb.b();
        if (param0 == -1) {
          var6 = 0;
          L0: while (true) {
            if (var6 >= this.field_z.length) {
              wb.a(var9, var4, var5);
              return;
            } else {
              var7 = this.field_r[this.field_z.length + (-var6 - 1)];
              if (-1 != (rn.field_b ^ -1)) {
                if (this.field_N[var6] != null) {
                  if (param1 != var7) {
                    this.field_N[var6].b(0, 0);
                    var6++;
                    continue L0;
                  } else {
                    var6++;
                    continue L0;
                  }
                } else {
                  var6++;
                  continue L0;
                }
              } else {
                var6++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    private final int[] a(double[] param0, double[] param1, double[] param2, byte param3) {
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var13 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              da.a(param1, 0, param2, 0, 0, -2, param0);
              da.a(param2, 0, param0, 0, 0, -2, param1);
              jn.a(param0, 0, param3 + 16841);
              jn.a(param1, 0, 16801);
              jn.a(param2, 0, 16801);
              if (param3 == -40) {
                break L1;
              } else {
                this.field_K = (qe) null;
                break L1;
              }
            }
            var13 = rd.a(16, param3 ^ 39, param0);
            var10 = var13;
            var9 = var10;
            var5 = var9;
            var18 = rd.a(16, -1, param1);
            var19 = rd.a(16, -1, param2);
            var8 = new int[]{this.field_I, this.field_C, this.field_Q, var13[0], var13[1], var13[2], var18[0], var18[1], var18[2], var19[0], var19[1], var19[2]};
            stackIn_3_0 = (int[]) (var8);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5_ref);

            stackIn_6_1 = new StringBuilder().append("qe.I(");

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
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    final void l(int param0) {
        this.a(this.field_t, -0.04908738521234052 + this.field_T, true);
        if (param0 != -28628) {
            this.field_L = (String[]) null;
        }
    }

    private final String a(boolean param0, int param1, int param2, int param3, int param4) {
        int stackIn_5_0 = 0;
        StringBuilder stackIn_35_0 = null;
        StringBuilder stackIn_36_0 = null;
        String stackIn_36_1 = null;
        StringBuilder stackIn_38_0 = null;
        StringBuilder stackIn_39_0 = null;
        String stackIn_39_1 = null;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        var16 = Chess.field_G;
        var6 = this.field_f[param4];
        var7 = this.field_f[param2];
        var8 = var6 & -16773121;
        var9 = param4 / 8;
        var10 = param4 % 8;
        if (param3 > 8) {
          L0: {
            var11 = param2 % 8;
            if (-1 == (var7 ^ -1)) {
              stackIn_5_0 = 0;
              break L0;
            } else {
              stackIn_5_0 = 1;
              break L0;
            }
          }
          L1: {
            L2: {
              var12 = stackIn_5_0;
              var13 = -1;
              if (!param0) {
                break L2;
              } else {
                if ((this.field_l ^ -1) == 0) {
                  break L2;
                } else {
                  var13 = this.field_l;
                  break L1;
                }
              }
            }
            if (param0) {
              break L1;
            } else {
              if (0 != (this.field_k ^ -1)) {
                var13 = this.field_k;
                break L1;
              } else {
                break L1;
              }
            }
          }
          L3: {
            if (-1 == var13) {
              break L3;
            } else {
              L4: {
                var14 = var10 + -var13;
                if (-2 == (var14 ^ -1)) {
                  break L4;
                } else {
                  if ((var14 ^ -1) != 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                L6: {
                  var15 = -1;
                  if (!param0) {
                    break L6;
                  } else {
                    if (var9 == 4) {
                      var15 = 1 + var9;
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                if (param0) {
                  break L5;
                } else {
                  if (var9 != 3) {
                    break L5;
                  } else {
                    var15 = -1 + var9;
                    break L5;
                  }
                }
              }
              if (var15 != -1) {
                if (param2 != var13 + 8 * var15) {
                  break L3;
                } else {
                  var12 = 1;
                  break L3;
                }
              } else {
                break L3;
              }
            }
          }
          L7: {
            if ((var8 ^ -1) != -7) {
              break L7;
            } else {
              if (-2 != var11 - var10) {
                break L7;
              } else {
                return "0-0-0";
              }
            }
          }
          L8: {
            if ((var8 ^ -1) != -7) {
              break L8;
            } else {
              if (-3 != (-var10 + var11 ^ -1)) {
                break L8;
              } else {
                return "0-0";
              }
            }
          }
          L9: {
            stackIn_35_0 = new StringBuilder().append(this.a(var6, (byte) 124)).append(this.h(-106, param4));

            if (var12 != 0) {
              stackIn_36_0 = (StringBuilder) ((Object) stackIn_35_0);
              stackIn_36_1 = "x";
              break L9;
            } else {
              stackIn_36_0 = (StringBuilder) ((Object) stackIn_35_0);
              stackIn_36_1 = "";
              break L9;
            }
          }
          L10: {
            stackIn_38_0 = ((StringBuilder) (Object) stackIn_36_0).append(stackIn_36_1).append(this.h(109, param2));

            if (0 != param1) {
              stackIn_39_0 = (StringBuilder) ((Object) stackIn_38_0);
              stackIn_39_1 = this.a(param1, (byte) 30);
              break L10;
            } else {
              stackIn_39_0 = (StringBuilder) ((Object) stackIn_38_0);
              stackIn_39_1 = "";
              break L10;
            }
          }
          return stackIn_39_1;
        } else {
          return (String) null;
        }
    }

    final void i(int param0) {
        this.a(this.field_t, 0.04908738521234052 + this.field_T, true);
        if (param0 <= 15) {
            this.field_G = (int[]) null;
        }
    }

    private final int m(int param0) {
        int var2;
        int var3;
        var3 = Chess.field_G;
        var2 = -1 + this.field_h.length;
        L0: while (true) {
          L1: {
            if ((var2 ^ -1) > -1) {
              break L1;
            } else {
              if (this.field_h[var2] != null) {
                break L1;
              } else {
                var2--;
                continue L0;
              }
            }
          }
          if ((var2 ^ -1) == 0) {
            return -1;
          } else {
            if (param0 >= 35) {
              return this.field_h[var2].field_d;
            } else {
              return -46;
            }
          }
        }
    }

    static {
        field_R = "Who can join";
        field_O = "Unpacking music";
        field_y = "Played";
    }
}
