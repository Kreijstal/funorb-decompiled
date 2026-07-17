/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ok extends tj {
    private int field_kb;
    static String[][] field_pb;
    static int field_rb;
    private int field_nb;
    private int field_hb;
    private int field_qb;
    private sh field_ib;
    static am field_mb;
    private int field_jb;
    private cd field_gb;
    static vh field_ob;
    private ei field_lb;

    final static void a(int param0, boolean param1) {
        di.a(param1, (byte) 108, true);
        int var2 = 40 / ((-28 - param0) / 51);
    }

    void d(ei param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (param1 == 30) {
                break L1;
              } else {
                ((ok) this).field_ib = null;
                break L1;
              }
            }
            L2: {
              ((ok) this).field_lb = param0;
              if (db.field_Ub == ((ok) this).field_gb) {
                ((ok) this).a((byte) -77, ((ok) this).field_lb.field_y + (12 - -((ok) this).field_jb), 12 - -((ok) this).field_lb.field_l, ((ok) this).field_nb);
                ((ok) this).field_hb = 0;
                break L2;
              } else {
                if (dj.field_c == ((ok) this).field_gb) {
                  break L2;
                } else {
                  ((ok) this).field_gb = dj.field_c;
                  ((ok) this).field_hb = 0;
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("ok.O(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
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
          throw wm.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
    }

    final static void a(int param0, pq param1, pq param2, byte param3) {
        RuntimeException var4 = null;
        long var4_long = 0L;
        int var6 = 0;
        int var7 = 0;
        long var8 = 0L;
        long var10 = 0L;
        long var12 = 0L;
        long var14 = 0L;
        long var16 = 0L;
        int var18 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              if (0 <= param0) {
                break L1;
              } else {
                param0 = 0;
                break L1;
              }
            }
            param1.a(param0, 127);
            param2.a(param0, 122);
            var4_long = param1.e(-14770) - -param2.e(-14770);
            var6 = param2.field_g + -param1.field_g;
            var7 = param2.field_k + -param1.field_k;
            var8 = rj.a((long)var6, (byte) -48, (long)var6) + rj.a((long)var7, (byte) -48, (long)var7);
            if (var8 < 0L) {
              throw new IllegalStateException("dnorm2_32 overflow " + var8);
            } else {
              L2: {
                var10 = bm.a(-128, var8 >> 16);
                if (var10 < -2147483648L) {
                  break L2;
                } else {
                  if (var10 > 2147483647L) {
                    break L2;
                  } else {
                    L3: {
                      var6 = lh.a((int)var10, (byte) -83, (long)var6);
                      var7 = lh.a((int)var10, (byte) -112, (long)var7);
                      var12 = rj.a((long)param1.field_I, (byte) -48, (long)var6) - -rj.a((long)param1.field_t, (byte) -48, (long)var7) >> 16;
                      var14 = rj.a((long)param2.field_I, (byte) -48, (long)var6) + rj.a((long)param2.field_t, (byte) -48, (long)var7) >> 16;
                      param1.field_I = (int)((long)param1.field_I - od.a((long)var6, var12, false));
                      param1.field_t = (int)((long)param1.field_t - od.a((long)var7, var12, false));
                      param2.field_I = (int)((long)param2.field_I - od.a((long)var6, var14, false));
                      param2.field_t = (int)((long)param2.field_t - od.a((long)var7, var14, false));
                      param1.field_I = (int)((long)param1.field_I + (od.a((long)(tl.field_K * var6), var14, false) >> 8));
                      param1.field_t = (int)((long)param1.field_t + (od.a((long)(tl.field_K * var7), var14, false) >> 8));
                      param2.field_I = (int)((long)param2.field_I + (od.a((long)(tl.field_K * var6), var12, false) >> 8));
                      param2.field_t = (int)((long)param2.field_t + (od.a((long)(tl.field_K * var7), var12, false) >> 8));
                      param1.field_b = ca.field_l * param1.field_b >> 8;
                      param1.field_K = ca.field_l * param1.field_K >> 8;
                      param1.field_n = ca.field_l * param1.field_n >> 8;
                      param2.field_b = param2.field_b * ca.field_l >> 8;
                      param2.field_K = param2.field_K * ca.field_l >> 8;
                      param2.field_n = param2.field_n * ca.field_l >> 8;
                      param1.field_v = 1;
                      param2.field_v = 1;
                      var18 = -53 / ((param3 - 62) / 39);
                      var16 = param1.e(-14770) + param2.e(-14770);
                      if (wm.field_ac.length > or.field_l) {
                        wm.field_ac[or.field_l][0] = param1.field_g + param2.field_g >> 1;
                        wm.field_ac[or.field_l][1] = param2.field_k + param1.field_k >> 1;
                        wm.field_ac[or.field_l][2] = -524288;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      if (or.field_l >= wd.field_Qb.length) {
                        break L4;
                      } else {
                        int fieldTemp$1 = or.field_l;
                        or.field_l = or.field_l + 1;
                        wd.field_Qb[fieldTemp$1] = (int)(-var16 + var4_long);
                        break L4;
                      }
                    }
                    break L0;
                  }
                }
              }
              throw new IllegalStateException("dnorm_16 overflow");
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("ok.V(").append(param0).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param3 + 41);
        }
    }

    private final void c(ei param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (null == ((ok) this).field_ib) {
                break L1;
              } else {
                ((ok) this).field_ib.a((byte) -117);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ok.DA(");
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
          throw wm.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + -111052767 + 41);
        }
    }

    final static int k(byte param0) {
        if (param0 != 59) {
            dd[] discarded$0 = ok.l((byte) -91);
        }
        return er.field_R;
    }

    final void b(boolean param0) {
        if (!(null == ((ok) this).field_gb)) {
            if (!(((ok) this).field_gb == tm.field_h)) {
                ((ok) this).b(12 - -((ok) this).field_jb - -((ok) this).field_lb.field_y, 31936, 12 - -((ok) this).field_lb.field_l);
                this.c(((ok) this).field_lb, -111052767);
            }
            ((ok) this).field_ib.field_T = 256;
            ((ok) this).field_gb = null;
        }
        super.b(param0);
    }

    boolean g(byte param0) {
        int var3 = 0;
        L0: {
          var3 = Pool.field_O;
          if (((ok) this).field_gb == null) {
            break L0;
          } else {
            if (((ok) this).field_gb == dj.field_c) {
              int fieldTemp$38 = ((ok) this).field_hb + 1;
              ((ok) this).field_hb = ((ok) this).field_hb + 1;
              if (((ok) this).field_kb != fieldTemp$38) {
                ((ok) this).field_ib.field_T = 256 + -((((ok) this).field_hb << 8) / ((ok) this).field_kb);
                break L0;
              } else {
                ((ok) this).field_gb = db.field_Ub;
                ((ok) this).a((byte) 88, ((ok) this).field_lb.field_y + (12 + ((ok) this).field_jb), 12 + ((ok) this).field_lb.field_l, ((ok) this).field_nb);
                ((ok) this).field_ib.field_T = 0;
                ((ok) this).field_hb = 0;
                break L0;
              }
            } else {
              if (((ok) this).field_gb != tm.field_h) {
                break L0;
              } else {
                int fieldTemp$39 = ((ok) this).field_hb + 1;
                ((ok) this).field_hb = ((ok) this).field_hb + 1;
                if (((ok) this).field_qb == fieldTemp$39) {
                  ((ok) this).field_ib.field_T = 256;
                  ((ok) this).field_gb = null;
                  break L0;
                } else {
                  ((ok) this).field_ib.field_T = (((ok) this).field_hb << 8) / ((ok) this).field_qb;
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (param0 == -20) {
            break L1;
          } else {
            ((ok) this).field_kb = 54;
            break L1;
          }
        }
        return super.g((byte) -20);
    }

    final void j(int param0) {
        if (((ok) this).field_gb == dj.field_c) {
            return;
        }
        ((ok) this).field_gb = tm.field_h;
        ((ok) this).field_hb = 0;
        this.c(((ok) this).field_lb, -111052767);
        ((ok) this).field_ib.field_T = 0;
        ((ok) this).field_lb = null;
        if (param0 != 50) {
            field_rb = -17;
        }
    }

    final boolean a(boolean param0) {
        ((ok) this).b(param0);
        return super.a(false);
    }

    final static dd j(byte param0) {
        int var1 = 0;
        Object var3 = null;
        int[] var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        int[] var9 = null;
        int[] var12 = null;
        int[] var14 = null;
        int[] var16 = null;
        int[] var18 = null;
        byte[] var19 = null;
        int[] var20 = null;
        byte[] var21 = null;
        int[] var22 = null;
        L0: {
          var7 = Pool.field_O;
          if (param0 < -63) {
            break L0;
          } else {
            var8 = null;
            ok.a(101, (pq) null, (pq) null, (byte) 35);
            break L0;
          }
        }
        L1: {
          var1 = pd.field_a[0] * rc.field_f[0];
          var19 = v.field_b[0];
          if (gg.field_d[0]) {
            var21 = wg.field_Sb[0];
            var22 = new int[var1];
            var18 = var22;
            var14 = var18;
            var12 = var14;
            var5 = var12;
            var6 = 0;
            L2: while (true) {
              if (var6 >= var1) {
                var3 = (Object) (Object) new lp(vd.field_c, tq.field_r, el.field_I[0], ih.field_d[0], pd.field_a[0], rc.field_f[0], var22);
                break L1;
              } else {
                var5[var6] = md.a(rb.b(-16777216, var21[var6] << 24), ma.field_h[rb.b(255, (int) var19[var6])]);
                var6++;
                continue L2;
              }
            }
          } else {
            var20 = new int[var1];
            var16 = var20;
            var9 = var16;
            var5_int = 0;
            L3: while (true) {
              if (var1 <= var5_int) {
                var3 = (Object) (Object) new dd(vd.field_c, tq.field_r, el.field_I[0], ih.field_d[0], pd.field_a[0], rc.field_f[0], var20);
                break L1;
              } else {
                var9[var5_int] = ma.field_h[rb.b((int) var19[var5_int], 255)];
                var5_int++;
                continue L3;
              }
            }
          }
        }
        sh.h(-1);
        return (dd) var3;
    }

    ok(lq param0, ei param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_l, param1.field_y + (12 - -param2));
        try {
            ((ok) this).field_qb = param3;
            ((ok) this).field_kb = param3;
            ((ok) this).field_jb = param2;
            ((ok) this).field_nb = param4;
            this.c(param1, -111052767);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "ok.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    public static void i(byte param0) {
        field_mb = null;
        field_pb = null;
        field_ob = null;
    }

    boolean a(char param0, int param1, boolean param2, ei param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              L1: {
                if (((ok) this).field_ib == null) {
                  break L1;
                } else {
                  L2: {
                    if (param1 == 98) {
                      boolean discarded$4 = ((ok) this).field_ib.a(param3, (byte) -96);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  if (param1 != 99) {
                    break L1;
                  } else {
                    boolean discarded$5 = ((ok) this).field_ib.a(param3, (byte) -97);
                    return false;
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("ok.U(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0 != 0;
    }

    final static dd[] l(byte param0) {
        dd[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int[] var8 = null;
        int[] var11 = null;
        int[] var13 = null;
        int[] var15 = null;
        int[] var17 = null;
        byte[] var18 = null;
        int[] var19 = null;
        byte[] var20 = null;
        int[] var21 = null;
        L0: {
          var1 = new dd[wf.field_d];
          if (param0 == 65) {
            break L0;
          } else {
            int discarded$1 = ok.k((byte) -62);
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (wf.field_d <= var2) {
            sh.h(-1);
            return var1;
          } else {
            var3 = pd.field_a[var2] * rc.field_f[var2];
            var18 = v.field_b[var2];
            if (gg.field_d[var2]) {
              var20 = wg.field_Sb[var2];
              var21 = new int[var3];
              var17 = var21;
              var13 = var17;
              var11 = var13;
              var6 = var11;
              var7 = 0;
              L2: while (true) {
                if (var3 <= var7) {
                  var1[var2] = (dd) (Object) new lp(vd.field_c, tq.field_r, el.field_I[var2], ih.field_d[var2], pd.field_a[var2], rc.field_f[var2], var21);
                  var2++;
                  continue L1;
                } else {
                  var6[var7] = md.a(rb.b((int) var20[var7], 255) << 24, ma.field_h[rb.b(255, (int) var18[var7])]);
                  var7++;
                  continue L2;
                }
              }
            } else {
              var19 = new int[var3];
              var15 = var19;
              var8 = var15;
              var6_int = 0;
              L3: while (true) {
                if (var3 <= var6_int) {
                  var1[var2] = new dd(vd.field_c, tq.field_r, el.field_I[var2], ih.field_d[var2], pd.field_a[var2], rc.field_f[var2], var19);
                  var2++;
                  continue L1;
                } else {
                  var8[var6_int] = ma.field_h[rb.b((int) var18[var6_int], 255)];
                  var6_int++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_pb = new String[][]{new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2], new String[2]};
    }
}
