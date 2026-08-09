/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hr {
    private int field_k;
    private int field_l;
    static ro[] field_c;
    private int field_f;
    static String field_w;
    private int field_u;
    private int field_a;
    private int field_i;
    private int field_x;
    static int[] field_n;
    private int field_z;
    private int field_g;
    static int field_b;
    private int field_v;
    private int field_h;
    private boolean field_e;
    static String field_s;
    private int field_p;
    private float field_m;
    private int field_j;
    private int field_r;
    static di field_q;
    static boolean field_y;
    private int field_d;
    static int field_t;
    private bd field_o;

    final static void a(di param0, int param1) {
        Object var2 = null;
        int var3 = 0;
        oo var4 = null;
        int var5 = 0;
        Object stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        Object stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Pool.field_O;
        try {
          L0: {
            var2 = null;
            var3 = 0;
            L1: while (true) {
              if (nn.field_b.length <= var3) {
                var3 = param1;
                L2: while (true) {
                  if (var3 >= nn.field_b.length) {
                    var3 = 0;
                    L3: while (true) {
                      if (al.field_B.length <= var3) {
                        break L0;
                      } else {
                        al.field_B[var3].a(param0, (byte) 117);
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    L4: {
                      if (nn.field_b[var3].field_A == null) {
                        nn.field_b[var3].field_A = (jk) (var2);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var3++;
                    continue L2;
                  }
                }
              } else {
                var4 = nn.field_b[var3];
                var4.a(param0, param1 ^ -98);
                if (null != var4.field_A) {
                  L5: {
                    if (var2 == null) {
                      var2 = var4.field_A;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var3++;
                  continue L1;
                } else {
                  var3++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackIn_21_0 = var2;

            stackIn_21_1 = new StringBuilder().append("hr.E(");

            if (param0 == null) {
              stackIn_22_0 = stackIn_21_0;
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_22_0 = stackIn_21_0;
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
    }

    final void a(boolean param0) {
        int fieldTemp$0 = 0;
        if (ne.field_u != null) {
          return;
        } else {
          L0: {
            if (-1 > (mp.field_V ^ -1)) {
              break L0;
            } else {
              this.field_e = false;
              break L0;
            }
          }
          if (param0) {
            if (this.field_e) {
              fieldTemp$0 = this.field_r - 1;
              this.field_r = this.field_r - 1;
              if (-1 <= (fieldTemp$0 ^ -1)) {
                this.field_r = this.field_l;
                if (this.field_v <= rf.field_d) {
                  this.a(2);
                  return;
                } else {
                  this.field_e = false;
                  return;
                }
              } else {
                return;
              }
            } else {
              L1: {
                if (ml.field_d < this.field_j) {
                  cl.field_e = (this.field_j + -ml.field_d) / 2;
                  break L1;
                } else {
                  if (0 >= this.field_j) {
                    break L1;
                  } else {
                    cl.field_e = 0;
                    break L1;
                  }
                }
              }
              L2: {
                if (ml.field_d != this.field_d) {
                  this.field_o.a(this.field_h, this.field_d, 110);
                  break L2;
                } else {
                  if (ad.field_c == this.field_h) {
                    return;
                  } else {
                    this.field_o.a(this.field_h, this.field_d, 110);
                    break L2;
                  }
                }
              }
              return;
            }
          } else {
            return;
          }
        }
    }

    public static void c(int param0) {
        field_c = null;
        field_n = null;
        field_s = null;
        field_w = null;
        if (param0 > -25) {
            return;
        }
        field_q = null;
    }

    final static void a(boolean param0, int param1, int param2) {
        kn var4 = null;
        String var5_ref_String = null;
        int var5 = 0;
        int var6 = 0;
        eo var3 = wp.a(param0, param2, 100);
        if (param1 >= -72) {
            int[] var7 = (int[]) null;
            hr.a((float[]) null, -27, -27, (int[]) null);
        }
        if (!(var3 == null)) {
            vl.field_m.a((byte) 124, false);
            var4 = vl.field_m;
            var5_ref_String = ge.field_m;
            var4.field_n.a(var5_ref_String, 17130, 5);
            var4 = vl.field_m;
            var5 = lq.field_W;
            var6 = ua.field_o;
            var4.field_n.c(0, 0, var5, 0, var6);
        }
        d.a(param2, (byte) 21, param0);
    }

    final static void a(float[] param0, int param1, int param2, int[] param3) {
        param0[0] = 0.5f + 8.0f * param0[0];
        param0[1] = param0[1] * 8.0f + 0.5f;
        param0[2] = param0[2] * 8.0f + 0.5f;
        if ((param0[0] - (float)param3[0]) * (float)param3[9] + (param0[1] - (float)param3[1]) * (float)param3[10] + (param0[2] - (float)param3[2]) * (float)param3[11] < 0.0f) {
            return;
        }
        try {
            ag.a(param3, param0, 9);
            qh.d((int)param0[0], -4 + (int)param0[1], (int)param0[0], 4 + (int)param0[1], param1);
            int var4_int = 91 / ((55 - param2) / 46);
            qh.d((int)param0[0] - 4, (int)param0[1], (int)param0[0] + 4, (int)param0[1], param1);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "hr.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void d(int param0) {
        this.field_o.a(this.field_i, this.field_u, param0 ^ 22433);
        if (param0 != 22472) {
            field_s = (String) null;
        }
    }

    final static void a(int param0, int[] param1, int[] param2, int param3, int param4, byte param5) {
        long var6_long = 0L;
        long var8 = 0L;
        long var10 = 0L;
        try {
            param3 = param3 - param2[1];
            if (param5 != 9) {
                di var12 = (di) null;
                hr.a((di) null, 12);
            }
            param0 = param0 - param2[0];
            param4 = param4 - param2[2];
            var6_long = rj.a((long)param2[3], (byte) -48, (long)param0) - (-rj.a((long)param2[4], (byte) -48, (long)param3) + -rj.a((long)param2[5], (byte) -48, (long)param4));
            var8 = rj.a((long)param2[6], (byte) -48, (long)param0) + rj.a((long)param2[7], (byte) -48, (long)param3) - -rj.a((long)param2[8], (byte) -48, (long)param4);
            var10 = rj.a((long)param2[9], (byte) -48, (long)param0) + (rj.a((long)param2[10], (byte) -48, (long)param3) - -rj.a((long)param2[11], (byte) -48, (long)param4));
            if (var10 == 0L) {
                var10 = 1L;
            }
            param1[0] = (int)((long)fb.field_q + rj.a(512L, (byte) -48, var6_long) / var10);
            param1[1] = (int)((long)fb.field_d - -(rj.a(512L, (byte) -48, var8) / var10));
            param1[2] = (int)var10;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "hr.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final od b(int param0) {
        this.field_u = ml.field_d;
        this.field_i = ad.field_c;
        this.field_o.a(this.field_p, this.field_a, 117);
        int var2 = 35 % ((58 - param0) / 41);
        wd.field_Sb = false;
        od var3 = wp.a(this.field_a, lg.field_s, (byte) 0, this.field_p, 0, 0);
        if (!(var3 != null)) {
            this.d(22472);
        }
        return var3;
    }

    final void a(int param0, int param1, int param2) {
        this.field_j = param0;
        int var4 = -80 / ((-23 - param1) / 62);
        this.field_z = param2;
    }

    final static void a(boolean param0, byte param1) {
        if (param1 != 50) {
            hr.a(true, 91, 8);
        }
        qa.a((byte) 55, param0);
        mq.a(0, param0);
    }

    private final void a(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        L0: {
          var5 = Pool.field_O;
          var2 = this.field_j;
          if (param0 == 2) {
            break L0;
          } else {
            this.field_k = 30;
            break L0;
          }
        }
        var3 = this.field_z;
        if (this.e(param0 + 79)) {
          L1: {
            if (var3 <= this.field_f) {
              if (this.field_k > var3) {
                var3 = this.field_k;
                break L1;
              } else {
                break L1;
              }
            } else {
              var3 = this.field_f;
              break L1;
            }
          }
          L2: {
            if (var2 <= this.field_g) {
              if (var2 >= this.field_x) {
                break L2;
              } else {
                var2 = this.field_x;
                break L2;
              }
            } else {
              var2 = this.field_g;
              break L2;
            }
          }
          L3: {
            if (0.0f < this.field_m) {
              var4 = (int)(this.field_m * (float)var3 + 0.5f);
              if (var2 < var4) {
                var3 = (int)((float)var2 / this.field_m);
                break L3;
              } else {
                if (var4 < var2) {
                  var2 = var4;
                  break L3;
                } else {
                  break L3;
                }
              }
            } else {
              break L3;
            }
          }
          L4: {
            L5: {
              if (ml.field_d != var2) {
                break L5;
              } else {
                if (ad.field_c == var3) {
                  break L4;
                } else {
                  break L5;
                }
              }
            }
            this.field_o.a(var3, var2, param0 + 99);
            break L4;
          }
          L6: {
            if ((this.field_j ^ -1) >= -1) {
              break L6;
            } else {
              cl.field_e = (-ml.field_d + this.field_j) / 2;
              break L6;
            }
          }
          return;
        } else {
          this.field_e = false;
          return;
        }
    }

    final boolean e(int param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 > 73) {
            break L0;
          } else {
            field_c = (ro[]) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (rf.field_d < this.field_v) {
              break L2;
            } else {
              if (-1 <= (mp.field_V ^ -1)) {
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

    private hr() throws Throwable {
        throw new Error();
    }

    static {
        field_b = 6;
        field_w = "<%0> cannot join; the game is full.";
        field_s = "Your request to join has been declined.";
    }
}
