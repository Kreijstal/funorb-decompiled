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
        int var4;
        int var5;
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
        fo.field_i = lb.field_d;
        kp.field_a = lb.field_c;
        on.e(-67);
        ap.field_b.a(fe.field_gb.field_Ib, 0, 80, 0, fe.field_gb.field_cb + -40 + -2);
        dn.field_N.a(np.field_a, 0, 0, bn.field_q.field_Ib, (byte) 64);
        if (param0 <= 16) {
            field_l = true;
        }
        int var1 = np.field_a + 2;
        vn.field_A.a(-(!vd.field_e ? 0 : var1) + bn.field_q.field_cb, !vd.field_e ? 0 : var1, 0, bn.field_q.field_Ib, (byte) 64);
        s.b(124);
        jf.field_k.a(40, fe.field_gb.field_cb - 40, 0, fe.field_gb.field_Ib, (byte) 64);
        sc.field_b.a(30, 0, 0, rm.field_a.field_Ib, (byte) 64);
        ll.field_e.a(-72 + rm.field_a.field_cb, 30, 0, rm.field_a.field_Ib, (byte) 64);
        nk.field_g.a(30, 5, 5, 68, (byte) 64);
        nk.field_a.a(30, 5, 75, 78, (byte) 64);
        kk.field_b.a(30, 5, 155, 48, (byte) 64);
        la.field_b.a(30, 5, 205, 48, (byte) 64);
        int var2 = vd.field_e ? 250 : 200;
        wh.field_h.a(30, 5, 5 - -var2, -var2 + 363, (byte) 64);
        dp.field_x.a(30, 5, 370, rm.field_a.field_Ib - 10 - 365, (byte) 64);
        rl.field_e.a(2, (byte) -128, -5 + (ll.field_e.field_Ib + -5), 5, 37, ec.field_J, -5 + (-5 + ll.field_e.field_cb + -32));
        int var3 = (rm.field_a.field_Ib + 2) / 2;
        gj.field_b.a(40, -40 + rm.field_a.field_cb, 0, var3 - 2, (byte) 64);
        if (!vd.field_e) {
            var3 = 0;
        }
        td.field_v.a(40, rm.field_a.field_cb + -40, var3, -var3 + rm.field_a.field_Ib, (byte) 64);
    }

    final static int a(int param0, byte[] param1, byte param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_3_0 = ba.a(param1, 9, 0, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("cg.J(").append(param0).append(',');

            if (param1 == null) {
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
        int incrementValue$1 = 0;
        int var4_int = 0;
        cl[] var5 = null;
        int var6 = 0;
        cl var7 = null;
        on var8 = null;
        int var9 = 0;
        vl var10 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
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
                            if ((var8.field_N & 4 ^ -1) != -1) {
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
                incrementValue$1 = var6;
                var6++;
                var5[incrementValue$1] = var7;
                var7 = (cl) ((Object) param2.a((byte) 116));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("cg.M(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ',' + param3 + ')');
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
