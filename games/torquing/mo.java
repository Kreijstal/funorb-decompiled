/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mo extends am {
    private int field_s;
    static int[] field_B;
    static int[] field_w;
    private int field_G;
    private int field_E;
    static double[] field_D;
    private int field_t;
    private int field_A;
    static double[] field_x;
    private int field_F;
    static java.security.SecureRandom field_y;
    private int field_z;
    static int[] field_C;
    private int field_v;
    private int field_u;

    final int[][] a(int param0, int param1) {
        int var11 = 0;
        int[][] var3;
        int[] var8;
        int[] var9;
        int[] var10;
        int var12;
        int[][] var13;
        int[][] var15;
        int[][] var20;
        int[][] var28;
        int[] var29;
        int[] var30;
        int[] var31;
        var12 = Torquing.field_u;
        if (param0 != -29116) {
          this.field_u = 7;
        }
        var20 = this.field_r.a(15142, param1);
        var15 = var20;
        var13 = var15;
        var3 = var13;
        if (this.field_r.field_b) {
          var28 = this.c(24066, param1, 0);
          var30 = var28[0];
          var31 = var28[1];
          var29 = var28[2];
          var8 = var20[0];
          var9 = var20[1];
          var10 = var20[2];
          for (var11 = 0; ci.field_c > var11; var11++) {
            this.a(var29[var11], var30[var11], 117, var31[var11]);
            this.field_v = this.field_v + this.field_z;
            this.field_A = this.field_A + this.field_t;
            this.field_F = this.field_F + this.field_G;
            while (this.field_F < 0) {
              this.field_F = this.field_F + 4096;
            }
            if (0 > this.field_A) {
              this.field_A = 0;
            }
            while (this.field_F > 4096) {
              this.field_F = this.field_F - 4096;
            }
            if (this.field_v < 0) {
              this.field_v = 0;
            }
            if (this.field_A > 4096) {
              this.field_A = 4096;
            }
            if (4096 < this.field_v) {
              this.field_v = 4096;
            }
            this.b(-4, this.field_A, this.field_v, this.field_F);
            var8[var11] = this.field_s;
            var9[var11] = this.field_u;
            var10[var11] = this.field_E;
          }
        }
        return var3;
    }

    final static boolean a(int param0, boolean param1) {
        try {
          df var4 = null;
          df var5 = null;
          if (null == rh.field_b) {
            rh.field_b = u.field_t.a(ih.field_b, ea.field_t, param0 ^ -369);
          }
          if (rh.field_b.field_a == 0) {
            return false;
          }
          if (param0 != 269) {
            mo.a(-117, true);
          }
          long dupTemp$0 = km.b(-1);
          ak.field_k = dupTemp$0;
          rb.field_C = dupTemp$0;
          if (1 != rh.field_b.field_a) {
            ef.field_a = wj.field_i;
          } else {
            try {
              vk.field_E = new no((java.net.Socket) (rh.field_b.field_d), u.field_t);
              wa.field_d.field_n = 0;
              var4 = kj.field_d;
              var5 = var4;
              var5.field_n = 0;
              ef.field_a = tb.field_o;
              mm.field_d = !param1 ? -1 : -2;
              eb.field_f = !param1 ? -1 : -2;
              wk.field_h = !param1 ? -1 : -2;
              q.a(vg.field_j, 107, tp.field_i, wa.field_d, ao.field_d);
              jd.a((byte) -95, -1);
            } catch (IOException iOException) {
              ef.field_a = wj.field_i;
            }
          }
          rh.field_b = null;
          return true;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public mo() {
        super(1, false);
        this.field_t = 0;
        this.field_z = 0;
        this.field_G = 0;
    }

    final static int b(int param0, boolean param1) {
        int stackIn_63_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_81_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Torquing.field_u;
        try {
          vp.field_E = vp.field_E + 65536;
          while (65536 <= rn.a(vp.field_E, (byte) -18, op.field_k)) {
            vp.field_E = vp.field_E - op.field_k;
            ke.field_c = ke.field_c + 1;
          }
          var2_int = -1;
          if (nc.field_d != null) {
            var2_int = nc.field_d.length;
          } else {
            if (ln.field_H != null) {
              var2_int = ln.field_H.length;
            }
          }
          if (-1 != var2_int) {
            boolean decompiledFrameRemainder0 = true;
            if (mf.field_t < op.field_q) {
              mf.field_t = mf.field_t + 1;
              if (mf.field_t > op.field_j && (nc.field_d == null ||
                null == nc.field_d[da.field_a])) {
                mf.field_t = mf.field_t - 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                if (mf.field_t >= op.field_q &&
                  null == nc.field_d[(1 + da.field_a) % var2_int]) {
                  mf.field_t = mf.field_t - 1;
                }
              }
            }
            if (op.field_q <= mf.field_t) {
              gf.field_h = da.field_a;
              mf.field_t = mf.field_t - op.field_q;
              if (!pp.field_c) {
                da.field_a = da.field_a - 1;
                if (da.field_a < 0) {
                  da.field_a = da.field_a + var2_int;
                }
              } else {
                da.field_a = da.field_a + 1;
                if (da.field_a >= var2_int) {
                  da.field_a = da.field_a - var2_int;
                }
              }
            }
            if (mf.field_t > op.field_j) {
              pp.field_c = true;
            }
          }
          if (param0 != -457010900) {
            field_w = (int[]) null;
          }
          if (qc.field_db != null) {
            var3 = 357 - qc.field_db.field_u / 2;
            var4 = 0;
            if (0 != ta.field_o &&
              re.field_c > var3 &&
              re.field_c < var3 + qc.field_db.field_t) {
              if (wh.field_s > -qc.field_db.field_s + 269 &&
                wh.field_s < 269) {
                pp.field_c = false;
                var4 = 1;
                mf.field_t = op.field_q;
              }
              if (wh.field_s > 586 &&
                wh.field_s < qc.field_db.field_s + 586) {
                pp.field_c = true;
                var4 = 1;
                mf.field_t = op.field_q;
              }
            }
            if (var4 == 0 &&
              op.field_j < mf.field_t &&
              k.field_e > var3 &&
              var3 + qc.field_db.field_t > k.field_e) {
              if (269 - qc.field_db.field_s < n.field_t &&
                n.field_t < 269) {
                mf.field_t = op.field_j;
              }
              if (586 < n.field_t &&
                n.field_t < 586 + qc.field_db.field_s) {
                mf.field_t = op.field_j;
              }
            }
          }
          if (!param1) {
            return 0;
          }
          sd.field_s.a(true, n.a(n.field_t, false, k.field_e), n.a(wh.field_s, false, re.field_c));
          if (sd.field_s.f((byte) -60)) {
            if (sd.field_s.field_g == 0) {
              stackIn_63_0 = 3;
              return stackIn_63_0;
            }
            if (sd.field_s.field_g == 1) {
              stackIn_66_0 = 2;
              return stackIn_66_0;
            }
          }
          while (true) {
            if (!np.a((byte) -13)) {
              stackIn_81_0 = 0;
              return stackIn_81_0;
            }
            sd.field_s.a((byte) 119, 0);
            if (sd.field_s.f((byte) -60)) {
              if (0 == sd.field_s.field_g) {
                stackIn_72_0 = 3;
                return stackIn_72_0;
              }
              if (sd.field_s.field_g == 1) {
                stackIn_75_0 = 1;
                return stackIn_75_0;
              }
            }
            if (e.field_f != 13) {
              continue;
            }
            break;
          }
          stackIn_79_0 = 1;
          return stackIn_79_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var2), "mo.E(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_25_1 = 0;
        int stackIn_29_1 = 0;
        int stackIn_37_1 = 0;
        int stackIn_38_2 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var5Lifetime1;
        int var6Lifetime1;
        var11 = Torquing.field_u;
        if (param2 < 97) {
          field_C = (int[]) null;
        }
        stackIn_5_0 = (param1 > param3) ? param1 : param3;
        var5 = stackIn_5_0;
        stackIn_8_0 = (var5 < param0) ? param0 : var5;
        var5Lifetime1 = stackIn_8_0;
        stackIn_11_0 = (param1 < param3) ? param1 : param3;
        var6 = stackIn_11_0;
        stackIn_14_0 = (var6 > param0) ? param0 : var6;
        var6Lifetime1 = stackIn_14_0;
        this.field_v = (var6Lifetime1 + var5Lifetime1) / 2;
        var7 = -var6Lifetime1 + var5Lifetime1;
        if (var7 > 0) {
          var8 = (var5Lifetime1 - param1 << 12) / var7;
          var9 = (-param3 + var5Lifetime1 << 12) / var7;
          var10 = (var5Lifetime1 - param0 << 12) / var7;
          if (var5Lifetime1 == param1) {
            if (var6Lifetime1 == param3) {
              stackIn_29_1 = var10 + 20480;
            } else {
              stackIn_29_1 = -var9 + 4096;
            }
            this.field_F = stackIn_29_1;
          } else {
            if (var5Lifetime1 != param3) {
              if (var6Lifetime1 == param1) {
                stackIn_25_1 = 12288 + var9;
              } else {
                stackIn_25_1 = -var8 + 20480;
              }
              this.field_F = stackIn_25_1;
            } else {
              if (var6Lifetime1 != param0) {
                stackIn_21_1 = -var10 + 12288;
              } else {
                stackIn_21_1 = var8 + 4096;
              }
              this.field_F = stackIn_21_1;
            }
          }
          this.field_F = this.field_F / 6;
        } else {
          this.field_F = 0;
        }
        if (0 < this.field_v &&
          this.field_v < 4096) {
          stackIn_37_1 = var7 << 12;
          if (2048 < this.field_v) {
            stackIn_38_2 = 8192 - this.field_v * 2;
          } else {
            stackIn_38_2 = 2 * this.field_v;
          }
          this.field_A = stackIn_37_1 / stackIn_38_2;
        } else {
          this.field_A = 0;
        }
    }

    final void a(fj param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Torquing.field_u;
        try {
          var4_int = param2;
          if (var4_int == 0) {
            this.field_G = param0.g(param1 + 65501);
          } else {
            if (var4_int == 1) {
              this.field_t = (param0.f((byte) 23) << 12) / 100;
            } else {
              if (2 == var4_int) {
                this.field_z = (param0.f((byte) 77) << 12) / 100;
              }
            }
          }
          if (param1 != 35) {
            this.field_s = -80;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("mo.H(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        int stackIn_5_0 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        var14 = Torquing.field_u;
        if (param0 != -4) {
          return;
        }
        if (param2 > 2048) {
          stackIn_5_0 = param2 + param1 - (param2 * param1 >> 12);
        } else {
          stackIn_5_0 = (param1 + 4096) * param2 >> 12;
        }
        var5 = stackIn_5_0;
        if (var5 > 0) {
          param3 = param3 * 6;
          var6 = -var5 + param2 + param2;
          var7 = (-var6 + var5 << 12) / var5;
          var8 = param3 >> 12;
          var9 = -(var8 << 12) + param3;
          var10 = var5;
          var10 = var7 * var10 >> 12;
          var10 = var9 * var10 >> 12;
          var11 = var6 + var10;
          var12 = -var10 + var5;
          var13 = var8;
          if (var13 != 0) {
            if (var13 == 1) {
              this.field_u = var5;
              this.field_E = var6;
              this.field_s = var12;
            } else {
              if (2 != var13) {
                if (var13 == 3) {
                  this.field_s = var6;
                  this.field_u = var12;
                  this.field_E = var5;
                } else {
                  if (4 == var13) {
                    this.field_u = var6;
                    this.field_E = var5;
                    this.field_s = var11;
                  } else {
                    if (var13 == 5) {
                      this.field_u = var6;
                      this.field_E = var12;
                      this.field_s = var5;
                    }
                  }
                }
              } else {
                this.field_s = var6;
                this.field_u = var5;
                this.field_E = var11;
              }
            }
          } else {
            this.field_E = var6;
            this.field_u = var11;
            this.field_s = var5;
          }
        } else {
          this.field_E = param2;
          this.field_u = param2;
          this.field_s = param2;
        }
        return;
    }

    final static void a(t param0, int param1) {
        int var7 = 0;
        int var8 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var9 = 0;
        var9 = Torquing.field_u;
        try {
          if (0 == (3 & (param0.field_r | (param0.field_v | (param0.field_t | param0.field_s))))) {
            return;
          }
          var2_int = (3 & param0.field_v) + param0.field_s;
          var3 = param0.field_t + (3 & param0.field_r);
          var2_int = var2_int - (3 & var2_int) + 4;
          var3 = var3 + (-(3 & var3) + param1);
          var4 = new int[var2_int * var3];
          var5 = 0;
          var6 = (3 & param0.field_v) + var2_int * (param0.field_r & 3);
          for (var7 = 0; var7 < param0.field_t; var7++) {
            for (var8 = 0; var8 < param0.field_s; var8++) {
              incrementValue$0 = var6;
              var6++;
              incrementValue$1 = var5;
              var5++;
              var4[incrementValue$0] = param0.field_y[incrementValue$1];
            }
            var6 = var6 + (-param0.field_s + var2_int);
          }
          param0.field_r = param0.field_r & -4;
          param0.field_y = var4;
          param0.field_v = param0.field_v & -4;
          param0.field_t = var3;
          param0.field_s = var2_int;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("mo.A(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void g(byte param0) {
        field_B = null;
        field_x = null;
        field_D = null;
        field_C = null;
        field_w = null;
        field_y = null;
        if (param0 != -16) {
          field_C = (int[]) null;
        }
    }

    static {
        field_w = new int[4];
        field_x = new double[]{0.0, 1.0, 0.0, 0.5, 0.0, 1.5};
        field_D = new double[]{4.0, 4.0, 0.0, 4.0, 0.5, 4.0};
        field_C = new int[]{0, 1, 2, 3, 4, 5};
    }
}
