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

    final static void a(di param0) {
        Object var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        oo var4 = null;
        int var5 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var5 = Pool.field_O;
        try {
          L0: {
            var2 = null;
            var3 = 0;
            L1: while (true) {
              if (nn.field_b.length <= var3) {
                var3 = 0;
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
                        nn.field_b[var3].field_A = (jk) var2;
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
                L5: {
                  var4 = nn.field_b[var3];
                  var4.a(param0, -98);
                  if (null == var4.field_A) {
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var2_ref;
            stackOut_16_1 = new StringBuilder().append("hr.E(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + 0 + 41);
        }
    }

    final void a(boolean param0) {
        if (ne.field_u != null) {
          return;
        } else {
          L0: {
            if (mp.field_V > 0) {
              break L0;
            } else {
              ((hr) this).field_e = false;
              break L0;
            }
          }
          if (param0) {
            if (((hr) this).field_e) {
              int fieldTemp$2 = ((hr) this).field_r - 1;
              ((hr) this).field_r = ((hr) this).field_r - 1;
              if (fieldTemp$2 <= 0) {
                ((hr) this).field_r = ((hr) this).field_l;
                if (((hr) this).field_v <= rf.field_d) {
                  int discarded$3 = 2;
                  this.a();
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

    public static void c() {
        field_c = null;
        field_n = null;
        field_s = null;
        field_w = null;
        field_q = null;
    }

    final static void a(boolean param0, int param1, int param2) {
        kn var4 = null;
        String var5_ref_String = null;
        int var5 = 0;
        int var6 = 0;
        int discarded$0 = 100;
        eo var3 = wp.a(param0, param2);
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
        RuntimeException var4 = null;
        int var4_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            param0[0] = 0.5f + 8.0f * param0[0];
            param0[1] = param0[1] * 8.0f + 0.5f;
            param0[2] = param0[2] * 8.0f + 0.5f;
            if ((param0[0] - (float)param3[0]) * (float)param3[9] + (param0[1] - (float)param3[1]) * (float)param3[10] + (param0[2] - (float)param3[2]) * (float)param3[11] >= 0.0f) {
              ag.a(param3, param0, 9);
              qh.d((int)param0[0], -4 + (int)param0[1], (int)param0[0], 4 + (int)param0[1], param1);
              var4_int = 91 / ((55 - param2) / 46);
              qh.d((int)param0[0] - 4, (int)param0[1], (int)param0[0] + 4, (int)param0[1], param1);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("hr.I(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    final void d(int param0) {
        ((hr) this).field_o.a(((hr) this).field_i, ((hr) this).field_u, param0 ^ 22433);
        if (param0 != 22472) {
            field_s = null;
        }
    }

    final static void a(int param0, int[] param1, int[] param2, int param3, int param4) {
        long var6_long = 0L;
        RuntimeException var6 = null;
        long var8 = 0L;
        long var10 = 0L;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              param3 = param3 - param2[1];
              param0 = param0 - param2[0];
              param4 = param4 - param2[2];
              var6_long = rj.a((long)param2[3], (byte) -48, (long)param0) - (-rj.a((long)param2[4], (byte) -48, (long)param3) + -rj.a((long)param2[5], (byte) -48, (long)param4));
              var8 = rj.a((long)param2[6], (byte) -48, (long)param0) + rj.a((long)param2[7], (byte) -48, (long)param3) - -rj.a((long)param2[8], (byte) -48, (long)param4);
              var10 = rj.a((long)param2[9], (byte) -48, (long)param0) + (rj.a((long)param2[10], (byte) -48, (long)param3) - -rj.a((long)param2[11], (byte) -48, (long)param4));
              if (var10 != 0L) {
                break L1;
              } else {
                var10 = 1L;
                break L1;
              }
            }
            param1[0] = (int)((long)fb.field_q + rj.a(512L, (byte) -48, var6_long) / var10);
            param1[1] = (int)((long)fb.field_d - -(rj.a(512L, (byte) -48, var8) / var10));
            param1[2] = (int)var10;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var6;
            stackOut_4_1 = new StringBuilder().append("hr.J(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param3 + 44 + param4 + 44 + 9 + 41);
        }
    }

    final od b(int param0) {
        ((hr) this).field_u = ml.field_d;
        ((hr) this).field_i = ad.field_c;
        ((hr) this).field_o.a(((hr) this).field_p, ((hr) this).field_a, 117);
        int var2 = 35 % ((58 - param0) / 41);
        wd.field_Sb = false;
        int discarded$0 = 0;
        int discarded$1 = 0;
        od var3 = wp.a(((hr) this).field_a, lg.field_s, (byte) 0, ((hr) this).field_p);
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
        qa.a((byte) 55, param0);
        mq.a(0, param0);
    }

    private final void a() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Pool.field_O;
        var2 = ((hr) this).field_j;
        var3 = ((hr) this).field_z;
        if (((hr) this).e(81)) {
          L0: {
            if (var3 <= ((hr) this).field_f) {
              if (((hr) this).field_k > var3) {
                var3 = ((hr) this).field_k;
                break L0;
              } else {
                break L0;
              }
            } else {
              var3 = ((hr) this).field_f;
              break L0;
            }
          }
          L1: {
            if (var2 <= ((hr) this).field_g) {
              if (var2 >= ((hr) this).field_x) {
                break L1;
              } else {
                var2 = ((hr) this).field_x;
                break L1;
              }
            } else {
              var2 = ((hr) this).field_g;
              break L1;
            }
          }
          L2: {
            if (0.0f < ((hr) this).field_m) {
              var4 = (int)(((hr) this).field_m * (float)var3 + 0.5f);
              if (var2 < var4) {
                var3 = (int)((float)var2 / ((hr) this).field_m);
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
            if (ml.field_d != var2) {
              ((hr) this).field_o.a(var3, var2, 101);
              break L3;
            } else {
              if (ad.field_c == var3) {
                break L3;
              } else {
                ((hr) this).field_o.a(var3, var2, 101);
                break L3;
              }
            }
          }
          L4: {
            if (((hr) this).field_j <= 0) {
              break L4;
            } else {
              cl.field_e = (-ml.field_d + ((hr) this).field_j) / 2;
              break L4;
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
              if (mp.field_V <= 0) {
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
