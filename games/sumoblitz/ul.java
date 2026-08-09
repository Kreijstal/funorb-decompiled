/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul {
    boolean field_g;
    private int field_p;
    private int field_d;
    int field_c;
    private int field_l;
    private int field_k;
    private int field_o;
    private int field_q;
    private int field_e;
    private float field_b;
    private int field_h;
    static int field_f;
    private int field_n;
    private int field_j;
    private int field_r;
    private oo field_a;
    private int field_i;
    int field_s;
    private int field_m;

    final void d(int param0) {
        int fieldTemp$1 = 0;
        if (null == gk.field_o) {
          L0: {
            if (-1 > (ct.field_x ^ -1)) {
              break L0;
            } else {
              this.field_g = false;
              break L0;
            }
          }
          if (this.field_g) {
            fieldTemp$1 = this.field_h - 1;
            this.field_h = this.field_h - 1;
            if (-1 <= (fieldTemp$1 ^ -1)) {
              this.field_h = this.field_m;
              if (wh.field_x >= this.field_l) {
                L1: {
                  if (param0 == 2) {
                    break L1;
                  } else {
                    ul.a(47);
                    break L1;
                  }
                }
                this.b(0);
                return;
              } else {
                this.field_g = false;
                return;
              }
            } else {
              return;
            }
          } else {
            L2: {
              if (this.field_i <= gi.field_h) {
                if ((this.field_i ^ -1) >= -1) {
                  break L2;
                } else {
                  th.field_H = 0;
                  break L2;
                }
              } else {
                th.field_H = (-gi.field_h + this.field_i) / 2;
                break L2;
              }
            }
            L3: {
              L4: {
                if (gi.field_h != this.field_e) {
                  break L4;
                } else {
                  if (wq.field_b != this.field_n) {
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
              this.field_a.a(param0 ^ 8308, this.field_e, this.field_n);
              break L3;
            }
            return;
          }
        } else {
          return;
        }
    }

    final static cd[] a(byte param0, wi param1) {
        cd[] stackIn_5_0 = null;
        cd[] stackIn_12_0 = null;
        cd[] stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        cd[] var4 = null;
        int var5 = 0;
        cd var6 = null;
        int var7 = 0;
        jr var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 < -44) {
                break L1;
              } else {
                ul.a(42, -110, 34);
                break L1;
              }
            }
            if (param1.a((byte) 112)) {
              var8 = param1.b((byte) 21);
              L2: while (true) {
                if (var8.field_c != 0) {
                  if ((var8.field_c ^ -1) == -3) {
                    stackIn_12_0 = new cd[]{};
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var10 = (int[]) (var8.field_d);
                    var9 = var10;
                    var3 = var9;
                    var4 = new cd[var10.length >> -1089191198];
                    var5 = 0;
                    L3: while (true) {
                      if (var4.length <= var5) {
                        stackIn_17_0 = (cd[]) (var4);
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        var6 = new cd();
                        var4[var5] = var6;
                        var6.field_a = var3[var5 << 450577506];
                        var6.field_g = var3[1 + (var5 << -450265342)];
                        var6.field_e = var3[(var5 << -1955075518) - -2];
                        var6.field_b = var3[(var5 << 1339645090) - -3];
                        var5++;
                        continue L3;
                      }
                    }
                  }
                } else {
                  tg.a(10L, (byte) 80);
                  continue L2;
                }
              }
            } else {
              stackIn_5_0 = new cd[]{};
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var2);

            stackIn_20_1 = new StringBuilder().append("ul.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            return stackIn_17_0;
          }
        }
    }

    final boolean a(int param0, byte param1, int param2) {
        int stackIn_11_0 = 0;
        if (param1 < -29) {
          L0: {
            L1: {
              if (param2 < this.field_k) {
                break L1;
              } else {
                if (param2 > this.field_p) {
                  break L1;
                } else {
                  if (param0 < this.field_o) {
                    break L1;
                  } else {
                    if (this.field_j < param0) {
                      break L1;
                    } else {
                      L2: {
                        if (0.0f == this.field_b) {
                          break L2;
                        } else {
                          if (param2 != Math.round(this.field_b * (float)param0)) {
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                      stackIn_11_0 = 1;
                      break L0;
                    }
                  }
                }
              }
            }
            stackIn_11_0 = 0;
            break L0;
          }
          return stackIn_11_0 != 0;
        } else {
          return true;
        }
    }

    final boolean f(int param0) {
        int stackIn_6_0 = 0;
        if (param0 == -1) {
          L0: {
            L1: {
              if ((ct.field_x ^ -1) >= -1) {
                break L1;
              } else {
                if (wh.field_x >= this.field_l) {
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L0;
                }
              }
            }
            stackIn_6_0 = 0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return false;
        }
    }

    final cq g(int param0) {
        this.field_d = wq.field_b;
        this.field_r = gi.field_h;
        this.field_a.a(8310, this.field_s, this.field_c);
        int var2 = -25 % ((50 - param0) / 48);
        aj.field_A = false;
        cq var3 = pb.a(this.field_s, 8089, 0, this.field_c, lt.field_m, 0);
        if (!(var3 != null)) {
            this.e(2);
        }
        return var3;
    }

    final void e(int param0) {
        this.field_a.a(8310, this.field_r, this.field_d);
        if (param0 != 2) {
            this.b(115);
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (param0 != 4025) {
            ul.a(102);
        }
        ro.field_d = param1;
        ra.field_e = 1;
        qw.field_b = param2;
    }

    final static wb[] a(int param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var10 = null;
        int[] var11 = null;
        int[] var9 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = Sumoblitz.field_L ? 1 : 0;
        wb[] var1 = new wb[rl.field_n];
        if (param0 != 255) {
            ul.a(79);
        }
        for (var2 = 0; var2 < rl.field_n; var2++) {
            var3 = vg.field_k[var2] * we.field_B[var2];
            var10 = ag.field_d[var2];
            var11 = new int[var3];
            var9 = var11;
            var5 = var9;
            for (var6 = 0; var3 > var6; var6++) {
                var5[var6] = iv.field_l[eb.a(255, (int) var10[var6])];
            }
            var1[var2] = new wb(vf.field_d, li.field_u, er.field_h[var2], av.field_C[var2], vg.field_k[var2], we.field_B[var2], var11);
        }
        tl.a((byte) -79);
        return var1;
    }

    final void a(int param0, int param1, byte param2) {
        this.field_i = param1;
        if (param2 > -31) {
            return;
        }
        this.field_q = param0;
    }

    final boolean c(int param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 == -1) {
            break L0;
          } else {
            this.field_b = 2.1707825660705566f;
            break L0;
          }
        }
        L1: {
          L2: {
            if (wh.field_x < this.field_l) {
              break L2;
            } else {
              if (0 >= ct.field_x) {
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

    final void b(int param0, int param1, int param2) {
        int var4 = 32 / ((param2 - -57) / 44);
        this.field_s = param1;
        this.field_c = param0;
    }

    private final void b(int param0) {
        int var2;
        int var3;
        int var5;
        int var4;
        var5 = Sumoblitz.field_L ? 1 : 0;
        var2 = this.field_i;
        var3 = this.field_q;
        if (this.c(param0 + -1)) {
          L0: {
            if (this.field_j >= var3) {
              if (this.field_o > var3) {
                var3 = this.field_o;
                break L0;
              } else {
                break L0;
              }
            } else {
              var3 = this.field_j;
              break L0;
            }
          }
          L1: {
            if (this.field_p < var2) {
              var2 = this.field_p;
              break L1;
            } else {
              if (this.field_k > var2) {
                var2 = this.field_k;
                break L1;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (this.field_b > (float)param0) {
              var4 = (int)(0.5f + this.field_b * (float)var3);
              if (var2 < var4) {
                var3 = (int)((float)var2 / this.field_b);
                break L2;
              } else {
                if (var4 < var2) {
                  var2 = var4;
                  break L2;
                } else {
                  break L2;
                }
              }
            } else {
              break L2;
            }
          }
          L3: {
            if (var2 != gi.field_h) {
              this.field_a.a(8310, var2, var3);
              break L3;
            } else {
              if (wq.field_b == var3) {
                break L3;
              } else {
                this.field_a.a(8310, var2, var3);
                break L3;
              }
            }
          }
          L4: {
            if ((this.field_i ^ -1) >= -1) {
              break L4;
            } else {
              th.field_H = (-gi.field_h + this.field_i) / 2;
              break L4;
            }
          }
          return;
        } else {
          this.field_g = false;
          return;
        }
    }

    private ul() throws Throwable {
        throw new Error();
    }

    static {
        field_f = 0;
    }
}
