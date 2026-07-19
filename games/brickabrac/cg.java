/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg extends dj {
    private int field_o;
    static boolean field_l;
    static jp field_q;
    static ff field_s;
    static oe[] field_p;
    private long field_m;
    private long field_r;
    private int field_j;
    static long field_i;
    private long field_k;
    private long[] field_n;

    final int a(int param0, long param1) {
        int var4 = 0;
        int var5 = 0;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (param0 == 15) {
          if (this.field_m <= this.field_r) {
            var4 = 0;
            L0: while (true) {
              L1: {
                var4++;
                this.field_m = this.field_m + param1;
                if (var4 >= 10) {
                  break L1;
                } else {
                  if (this.field_r > this.field_m) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if ((this.field_m ^ -1L) <= (this.field_r ^ -1L)) {
                  break L2;
                } else {
                  this.field_m = this.field_r;
                  break L2;
                }
              }
              return var4;
            }
          } else {
            this.field_k = this.field_k + (this.field_m + -this.field_r);
            this.field_r = this.field_r + (-this.field_r + this.field_m);
            this.field_m = this.field_m + param1;
            return 1;
          }
        } else {
          return -72;
        }
    }

    final static void b(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        mh stackIn_3_0 = null;
        mh stackIn_4_0 = null;
        mh stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        mh stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        mh stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        mh stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_11_0 = 0;
        mh stackOut_2_0 = null;
        mh stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        mh stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        mh stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        mh stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        mh stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          fo.field_i = lb.field_d;
          kp.field_a = lb.field_c;
          on.e(-67);
          ap.field_b.a(fe.field_gb.field_Ib, 0, 80, 0, fe.field_gb.field_cb + -40 + -2);
          dn.field_N.a(np.field_a, 0, 0, bn.field_q.field_Ib, (byte) 64);
          if (param0 > 16) {
            break L0;
          } else {
            field_l = true;
            break L0;
          }
        }
        L1: {
          var1 = np.field_a + 2;
          stackOut_2_0 = vn.field_A;
          stackIn_4_0 = stackOut_2_0;
          stackIn_3_0 = stackOut_2_0;
          if (vd.field_e) {
            stackOut_4_0 = (mh) ((Object) stackIn_4_0);
            stackOut_4_1 = var1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            break L1;
          } else {
            stackOut_3_0 = (mh) ((Object) stackIn_3_0);
            stackOut_3_1 = 0;
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            break L1;
          }
        }
        L2: {
          stackOut_5_0 = (mh) ((Object) stackIn_5_0);
          stackOut_5_1 = -stackIn_5_1 + bn.field_q.field_cb;
          stackIn_7_0 = stackOut_5_0;
          stackIn_7_1 = stackOut_5_1;
          stackIn_6_0 = stackOut_5_0;
          stackIn_6_1 = stackOut_5_1;
          if (vd.field_e) {
            stackOut_7_0 = (mh) ((Object) stackIn_7_0);
            stackOut_7_1 = stackIn_7_1;
            stackOut_7_2 = var1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            stackIn_8_2 = stackOut_7_2;
            break L2;
          } else {
            stackOut_6_0 = (mh) ((Object) stackIn_6_0);
            stackOut_6_1 = stackIn_6_1;
            stackOut_6_2 = 0;
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_8_2 = stackOut_6_2;
            break L2;
          }
        }
        L3: {
          ((mh) (Object) stackIn_8_0).a(stackIn_8_1, stackIn_8_2, 0, bn.field_q.field_Ib, (byte) 64);
          s.b(124);
          jf.field_k.a(40, fe.field_gb.field_cb - 40, 0, fe.field_gb.field_Ib, (byte) 64);
          sc.field_b.a(30, 0, 0, rm.field_a.field_Ib, (byte) 64);
          ll.field_e.a(-72 + rm.field_a.field_cb, 30, 0, rm.field_a.field_Ib, (byte) 64);
          nk.field_g.a(30, 5, 5, 68, (byte) 64);
          nk.field_a.a(30, 5, 75, 78, (byte) 64);
          kk.field_b.a(30, 5, 155, 48, (byte) 64);
          la.field_b.a(30, 5, 205, 48, (byte) 64);
          if (!vd.field_e) {
            stackOut_10_0 = 200;
            stackIn_11_0 = stackOut_10_0;
            break L3;
          } else {
            stackOut_9_0 = 250;
            stackIn_11_0 = stackOut_9_0;
            break L3;
          }
        }
        L4: {
          var2 = stackIn_11_0;
          wh.field_h.a(30, 5, 5 - -var2, -var2 + 363, (byte) 64);
          dp.field_x.a(30, 5, 370, rm.field_a.field_Ib - 10 - 365, (byte) 64);
          rl.field_e.a(2, (byte) -128, -5 + (ll.field_e.field_Ib + -5), 5, 37, ec.field_J, -5 + (-5 + ll.field_e.field_cb + -32));
          var3 = (rm.field_a.field_Ib + 2) / 2;
          gj.field_b.a(40, -40 + rm.field_a.field_cb, 0, var3 - 2, (byte) 64);
          if (vd.field_e) {
            break L4;
          } else {
            var3 = 0;
            break L4;
          }
        }
        td.field_v.a(40, rm.field_a.field_cb + -40, var3, -var3 + rm.field_a.field_Ib, (byte) 64);
    }

    final static int a(int param0, byte[] param1, byte param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
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
              if (param2 == -86) {
                break L1;
              } else {
                field_i = -76L;
                break L1;
              }
            }
            stackOut_2_0 = ba.a(param1, 9, 0, param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("cg.J(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0) {
        if ((this.field_m ^ -1L) < (this.field_r ^ -1L)) {
            this.field_r = this.field_r + (-this.field_r + this.field_m);
        }
        if (param0 != 1) {
            vl var3 = (vl) null;
            cg.a((vl[]) null, (byte) 16, (vl) null, true);
        }
        this.field_k = 0L;
    }

    final long d(byte param0) {
        int var2 = 116 / ((param0 - -1) / 38);
        this.field_r = this.field_r + this.e((byte) -64);
        if ((this.field_r ^ -1L) > (this.field_m ^ -1L)) {
            return (-this.field_r + this.field_m) / 1000000L;
        }
        return 0L;
    }

    private final long e(byte param0) {
        int var8 = 0;
        int var9 = BrickABrac.field_J ? 1 : 0;
        long var2 = System.nanoTime();
        long var4 = -this.field_k + var2;
        this.field_k = var2;
        if (4999999999L > (var4 ^ -1L)) {
            if (!((var4 ^ -1L) <= -5000000001L)) {
                this.field_n[this.field_o] = var4;
                if (!((this.field_j ^ -1) <= -2)) {
                    this.field_j = this.field_j + 1;
                }
                this.field_o = (1 + this.field_o) % 10;
            }
        }
        if (param0 >= -19) {
            field_q = (jp) null;
        }
        long var6 = 0L;
        for (var8 = 1; var8 <= this.field_j; var8++) {
            var6 = var6 + this.field_n[(10 + this.field_o + -var8) % 10];
        }
        return var6 / (long)this.field_j;
    }

    final static void a(vl[] param0, byte param1, vl param2, boolean param3) {
        int incrementValue$2 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        cl[] var5 = null;
        int var6 = 0;
        cl var7 = null;
        on var8 = null;
        int var9 = 0;
        vl var10 = null;
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
        int decompiledRegionSelector0 = 0;
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
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var4_int = param2.e(param1 ^ 88);
            var5 = new cl[var4_int];
            var6 = 0;
            var7 = (cl) ((Object) param2.d(-79));
            L1: while (true) {
              if (var7 == null) {
                var6 = 0;
                if (param1 == 35) {
                  L2: while (true) {
                    if (var6 >= param0.length) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var10 = param0[var6];
                      var8 = (on) ((Object) var10.d(param1 + -159));
                      L3: while (true) {
                        if (var8 == null) {
                          var6++;
                          continue L2;
                        } else {
                          L4: {
                            if ((var8.field_N & 4) != 0) {
                              var8.a(var5[var8.field_M], param3, 4);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          var8 = (on) ((Object) var10.a((byte) 116));
                          continue L3;
                        }
                      }
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                incrementValue$2 = var6;
                var6++;
                var5[incrementValue$2] = (cl) ((Object) param0);
                var7 = (cl) ((Object) param2.a((byte) 116));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var4);
            stackOut_15_1 = new StringBuilder().append("cg.M(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void f(byte param0) {
        if (param0 > -89) {
            field_q = (jp) null;
        }
        field_s = null;
        field_q = null;
        field_p = null;
    }

    cg() {
        this.field_o = 0;
        this.field_r = 0L;
        this.field_m = 0L;
        this.field_k = 0L;
        this.field_n = new long[10];
        this.field_j = 1;
        this.field_r = System.nanoTime();
        this.field_m = System.nanoTime();
    }

    static {
        field_s = null;
        field_p = new oe[4];
    }
}
