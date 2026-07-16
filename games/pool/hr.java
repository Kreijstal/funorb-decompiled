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
        var5 = Pool.field_O;
        var2 = null;
        var3 = 0;
        L0: while (true) {
          if (nn.field_b.length <= var3) {
            var3 = param1;
            L1: while (true) {
              if (var3 >= nn.field_b.length) {
                var3 = 0;
                L2: while (true) {
                  if (al.field_B.length <= var3) {
                    return;
                  } else {
                    al.field_B[var3].a(param0, (byte) 117);
                    var3++;
                    continue L2;
                  }
                }
              } else {
                if (nn.field_b[var3].field_A == null) {
                  nn.field_b[var3].field_A = (jk) var2;
                  var3++;
                  continue L1;
                } else {
                  var3++;
                  continue L1;
                }
              }
            }
          } else {
            var4 = nn.field_b[var3];
            var4.a(param0, param1 ^ -98);
            if (null != var4.field_A) {
              if (var2 == null) {
                var2 = (Object) (Object) var4.field_A;
                var3++;
                continue L0;
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
    }

    final void a(boolean param0) {
        if (ne.field_u != null) {
          return;
        } else {
          L0: {
            if (-1 > (mp.field_V ^ -1)) {
              break L0;
            } else {
              ((hr) this).field_e = false;
              break L0;
            }
          }
          if (param0) {
            if (((hr) this).field_e) {
              int fieldTemp$1 = ((hr) this).field_r - 1;
              ((hr) this).field_r = ((hr) this).field_r - 1;
              if (-1 <= (fieldTemp$1 ^ -1)) {
                ((hr) this).field_r = ((hr) this).field_l;
                if (((hr) this).field_v <= rf.field_d) {
                  this.a(2);
                  return;
                } else {
                  ((hr) this).field_e = false;
                  return;
                }
              } else {
                return;
              }
            } else {
              L1: {
                if (ml.field_d < ((hr) this).field_j) {
                  cl.field_e = (((hr) this).field_j + -ml.field_d) / 2;
                  break L1;
                } else {
                  if (0 >= ((hr) this).field_j) {
                    break L1;
                  } else {
                    cl.field_e = 0;
                    break L1;
                  }
                }
              }
              L2: {
                if (ml.field_d != ((hr) this).field_d) {
                  ((hr) this).field_o.a(((hr) this).field_h, ((hr) this).field_d, 110);
                  break L2;
                } else {
                  if (ad.field_c == ((hr) this).field_h) {
                    return;
                  } else {
                    ((hr) this).field_o.a(((hr) this).field_h, ((hr) this).field_d, 110);
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
            Object var7 = null;
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
        int var4 = 0;
        param0[0] = 0.5f + 8.0f * param0[0];
        param0[1] = param0[1] * 8.0f + 0.5f;
        param0[2] = param0[2] * 8.0f + 0.5f;
        if ((param0[0] - (float)param3[0]) * (float)param3[9] + (param0[1] - (float)param3[1]) * (float)param3[10] + (param0[2] - (float)param3[2]) * (float)param3[11] >= 0.0f) {
          ag.a(param3, param0, 9);
          qh.d((int)param0[0], -4 + (int)param0[1], (int)param0[0], 4 + (int)param0[1], param1);
          var4 = 91 / ((55 - param2) / 46);
          qh.d((int)param0[0] - 4, (int)param0[1], (int)param0[0] + 4, (int)param0[1], param1);
          return;
        } else {
          return;
        }
    }

    final void d(int param0) {
        ((hr) this).field_o.a(((hr) this).field_i, ((hr) this).field_u, param0 ^ 22433);
        if (param0 != 22472) {
            field_s = null;
        }
    }

    final static void a(int param0, int[] param1, int[] param2, int param3, int param4, byte param5) {
        long var6 = 0L;
        long var8 = 0L;
        long var10 = 0L;
        Object var12 = null;
        L0: {
          param3 = param3 - param2[1];
          if (param5 == 9) {
            break L0;
          } else {
            var12 = null;
            hr.a((di) null, 12);
            break L0;
          }
        }
        L1: {
          param0 = param0 - param2[0];
          param4 = param4 - param2[2];
          var6 = rj.a((long)param2[3], (byte) -48, (long)param0) - (-rj.a((long)param2[4], (byte) -48, (long)param3) + -rj.a((long)param2[5], (byte) -48, (long)param4));
          var8 = rj.a((long)param2[6], (byte) -48, (long)param0) + rj.a((long)param2[7], (byte) -48, (long)param3) - -rj.a((long)param2[8], (byte) -48, (long)param4);
          var10 = rj.a((long)param2[9], (byte) -48, (long)param0) + (rj.a((long)param2[10], (byte) -48, (long)param3) - -rj.a((long)param2[11], (byte) -48, (long)param4));
          if (var10 != 0L) {
            break L1;
          } else {
            var10 = 1L;
            break L1;
          }
        }
        param1[0] = (int)((long)fb.field_q + rj.a(512L, (byte) -48, var6) / var10);
        param1[1] = (int)((long)fb.field_d - -(rj.a(512L, (byte) -48, var8) / var10));
        param1[2] = (int)var10;
    }

    final od b(int param0) {
        ((hr) this).field_u = ml.field_d;
        ((hr) this).field_i = ad.field_c;
        ((hr) this).field_o.a(((hr) this).field_p, ((hr) this).field_a, 117);
        int var2 = 35 % ((58 - param0) / 41);
        wd.field_Sb = false;
        od var3 = wp.a(((hr) this).field_a, lg.field_s, (byte) 0, ((hr) this).field_p, 0, 0);
        if (!(var3 != null)) {
            ((hr) this).d(22472);
        }
        return var3;
    }

    final void a(int param0, int param1, int param2) {
        ((hr) this).field_j = param0;
        int var4 = -80 / ((-23 - param1) / 62);
        ((hr) this).field_z = param2;
    }

    final static void a(boolean param0, byte param1) {
        if (param1 != 50) {
            hr.a(true, 91, 8);
        }
        qa.a((byte) 55, param0);
        mq.a(0, param0);
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Pool.field_O;
          var2 = ((hr) this).field_j;
          if (param0 == 2) {
            break L0;
          } else {
            ((hr) this).field_k = 30;
            break L0;
          }
        }
        var3 = ((hr) this).field_z;
        if (((hr) this).e(param0 + 79)) {
          L1: {
            if (var3 <= ((hr) this).field_f) {
              if (((hr) this).field_k > var3) {
                var3 = ((hr) this).field_k;
                break L1;
              } else {
                break L1;
              }
            } else {
              var3 = ((hr) this).field_f;
              break L1;
            }
          }
          L2: {
            if (var2 <= ((hr) this).field_g) {
              if (var2 >= ((hr) this).field_x) {
                break L2;
              } else {
                var2 = ((hr) this).field_x;
                break L2;
              }
            } else {
              var2 = ((hr) this).field_g;
              break L2;
            }
          }
          L3: {
            if (0.0f < ((hr) this).field_m) {
              var4 = (int)(((hr) this).field_m * (float)var3 + 0.5f);
              if (var2 < var4) {
                var3 = (int)((float)var2 / ((hr) this).field_m);
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
            ((hr) this).field_o.a(var3, var2, param0 + 99);
            break L4;
          }
          L6: {
            if ((((hr) this).field_j ^ -1) >= -1) {
              break L6;
            } else {
              cl.field_e = (-ml.field_d + ((hr) this).field_j) / 2;
              break L6;
            }
          }
          return;
        } else {
          ((hr) this).field_e = false;
          return;
        }
    }

    final boolean e(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 > 73) {
            break L0;
          } else {
            field_c = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (rf.field_d < ((hr) this).field_v) {
              break L2;
            } else {
              if (-1 <= (mp.field_V ^ -1)) {
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

    private hr() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 6;
        field_w = "<%0> cannot join; the game is full.";
        field_s = "Your request to join has been declined.";
    }
}
