/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri {
    private int field_p;
    static int field_i;
    private int field_g;
    private int field_j;
    private int field_n;
    static String[] field_f;
    private float field_d;
    private tk field_t;
    private int field_m;
    private int field_l;
    static String field_k;
    private boolean field_q;
    private int field_r;
    private int field_c;
    private int field_e;
    private int field_o;
    private int field_a;
    private int field_h;
    private int field_s;
    private int field_u;
    private int field_b;

    final static boolean a(int param0) {
        int var1 = -44 / ((-56 - param0) / 32);
        return vb.field_Z;
    }

    final static String a(int param0, boolean param1, boolean param2, boolean param3) {
        int var4;
        var4 = param0;
        if (param3) {
          var4 += 4;
        }
        if (param2) {
          var4 += 2;
        }
        if (!param1) {
          return ik.field_d[var4];
        }
        var4++;
        return ik.field_d[var4];
    }

    final static void a(int param0, byte param1, int param2, java.math.BigInteger param3, java.math.BigInteger param4, wl param5, byte[] param6) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int var9Lifetime1;
        var10 = client.field_A ? 1 : 0;
        try {
          var7_int = ha.a(param2, (byte) -126);
          if (rk.field_K == null) {
            rk.field_K = new java.security.SecureRandom();
          }
          var13 = new int[4];
          var12 = var13;
          var8 = var12;
          for (var9 = 0; 4 > var9; var9++) {
            var8[var9] = rk.field_K.nextInt();
          }
          if (null == ef.field_R ||
            !(var7_int <= ef.field_R.field_r.length)) {
            ef.field_R = new wl(var7_int);
          }
          ef.field_R.field_n = 0;
          if (param1 < 101) {
            return;
          }
          ef.field_R.a(false, param2, param6, param0);
          ef.field_R.e(102, var7_int);
          ef.field_R.a((byte) -105, var13);
          if (ba.field_b == null ||
            !(100 <= ba.field_b.field_r.length)) {
            ba.field_b = new wl(100);
          }
          ba.field_b.field_n = 0;
          ba.field_b.a(true, 10);
          var11 = 0;
          var9Lifetime1 = var11;
          while (4 > var11) {
            ba.field_b.a(var13[var11], false);
            var11++;
          }
          ba.field_b.d(-1, param2);
          ba.field_b.a(param4, param3, true);
          param5.a(false, ba.field_b.field_n, ba.field_b.field_r, 0);
          param5.a(false, ef.field_R.field_n, ef.field_R.field_r, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_24_0 = var7;
          stackIn_24_1 = new StringBuilder().append("ri.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param4 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param5 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param6 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final ql c(int param0) {
        ql var2 = null;
        ql var2Lifetime1;
        if (param0 == 27134) {
          this.field_g = ob.field_g;
          this.field_j = de.field_M;
          this.field_t.a(-4328, this.field_o, this.field_p);
          jg.field_e = false;
          var2 = sg.a(this.field_p, lf.field_e, 0, 0, 67, this.field_o);
          if (var2 == null) {
            this.b((byte) -60);
          }
          return var2;
        }
        ri.a(-14);
        this.field_g = ob.field_g;
        this.field_j = de.field_M;
        this.field_t.a(-4328, this.field_o, this.field_p);
        jg.field_e = false;
        var2Lifetime1 = sg.a(this.field_p, lf.field_e, 0, 0, 67, this.field_o);
        if (var2Lifetime1 == null) {
          this.b((byte) -60);
        }
        return var2Lifetime1;
    }

    final void a(boolean param0) {
        int fieldTemp$0 = 0;
        if (null != cl.field_v) {
          return;
        }
        if (eh.field_a <= 0) {
          this.field_q = false;
        }
        if (this.field_q) {
          fieldTemp$0 = this.field_u - 1;
          this.field_u = this.field_u - 1;
          if (fieldTemp$0 > 0) {
            return;
          }
          this.field_u = this.field_s;
          if (this.field_e > ab.field_e) {
            this.field_q = false;
          } else {
            this.d(60);
            if (param0) {
              ri.a(-99, -30, 116, 96, -46, -122);
            }
          }
          return;
        }
        if (de.field_M < this.field_m) {
          qd.field_Rb = (this.field_m - de.field_M) / 2;
        } else {
          if (this.field_m > 0) {
            qd.field_Rb = 0;
          }
        }
        if (this.field_n == de.field_M &&
          ob.field_g == this.field_r) {
          return;
        }
        this.field_t.a(-4328, this.field_r, this.field_n);
    }

    private final void d(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var4Lifetime1;
        var5 = client.field_A ? 1 : 0;
        var2 = this.field_m;
        var3 = this.field_h;
        if (!this.b(param0 - 60)) {
          this.field_q = false;
          return;
        }
        if (var2 > this.field_a) {
          var2 = this.field_a;
        } else {
          if (var2 < this.field_l) {
            var2 = this.field_l;
          }
        }
        if (var3 > this.field_c) {
          var3 = this.field_c;
        } else {
          if (this.field_b > var3) {
            var3 = this.field_b;
            if (!(0.0f < this.field_d)) {
              if (de.field_M != var2) {
                this.field_t.a(-4328, var3, var2);
              } else {
                if (ob.field_g != var3) {
                  this.field_t.a(-4328, var3, var2);
                }
              }
              if (param0 != 60) {
                ri.a((byte) 59);
              }
              if (this.field_m > 0) {
                qd.field_Rb = (this.field_m - de.field_M) / 2;
              }
              return;
            }
            var4 = (int)((float)var3 * this.field_d + 0.5f);
            if (var4 <= var2) {
              if (var2 > var4) {
                var2 = var4;
              }
            } else {
              var3 = (int)((float)var2 / this.field_d);
            }
            if (de.field_M != var2) {
              this.field_t.a(-4328, var3, var2);
            } else {
              if (ob.field_g != var3) {
                this.field_t.a(-4328, var3, var2);
              }
            }
            if (param0 != 60) {
              ri.a((byte) 59);
            }
            if (this.field_m > 0) {
              qd.field_Rb = (this.field_m - de.field_M) / 2;
            }
            return;
          }
        }
        if (!(0.0f < this.field_d)) {
          if (de.field_M != var2 ||
            ob.field_g != var3) {
            this.field_t.a(-4328, var3, var2);
            if (param0 == 60) {
              if (this.field_m <= 0) {
                return;
              }
              qd.field_Rb = (this.field_m - de.field_M) / 2;
              return;
            }
            ri.a((byte) 59);
            if (this.field_m > 0) {
              qd.field_Rb = (this.field_m - de.field_M) / 2;
            }
            return;
          }
        } else {
          var4Lifetime1 = (int)((float)var3 * this.field_d + 0.5f);
          if (var4Lifetime1 > var2) {
            var3 = (int)((float)var2 / this.field_d);
            if (de.field_M != var2 ||
              ob.field_g != var3) {
              this.field_t.a(-4328, var3, var2);
            }
          } else {
            if (var2 > var4Lifetime1) {
              var2 = var4Lifetime1;
            }
            if (de.field_M != var2) {
              this.field_t.a(-4328, var3, var2);
            } else {
              if (ob.field_g != var3) {
                this.field_t.a(-4328, var3, var2);
              }
            }
          }
        }
        if (param0 != 60) {
          ri.a((byte) 59);
        }
        if (this.field_m <= 0) {
          return;
        }
        qd.field_Rb = (this.field_m - de.field_M) / 2;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var9 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var10 = 0;
        var10 = client.field_A ? 1 : 0;
        try {
          if (80 <= param1) {
            stackIn_4_0 = 54;
          } else {
            stackIn_4_0 = param1 / 20 * 18;
          }
          var7_int = stackIn_4_0;
          var8 = 0;
          if (param1 >= 60) {
            if (param1 < 80) {
              var7_int = var7_int + vl.a(23841, 80, 40 + param5 * 18);
            } else {
              if (param1 >= 93) {
                hk.a(-30 + param4, 54 + param0 - 2, 60, 40, 4, 65280, 100);
              } else {
                var8 = vl.a(23841, 80, 40 + ve.field_ic[1 + param1 - 80] * 18);
              }
            }
          } else {
            var7_int = var7_int + vl.a(23841, 80, param2 * 18 + 40);
          }
          if (param3 >= -57) {
            field_i = -11;
          }
          for (var9 = 0; var9 < 3; var9++) {
            fb.field_c[param6][1].c(var9 * 18 - 27 + param4, 72 + param0, 18, 18);
          }
          fb.field_c[param6][1].c(param4 - 27 + 36, var8 + var7_int + param0, 18, -var8 + 18);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var7), "ri.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int stackIn_7_0 = 0;
        int stackIn_19_0 = 0;
        int var6;
        int var7;
        int var6Lifetime1;
        int var7Lifetime1;
        db.field_b[og.field_eb] = param0;
        ch.field_a[og.field_eb] = og.field_eb;
        ad.field_i[og.field_eb] = param3;
        if (ge.field_b > param3) {
          mf.field_Q = param3;
        }
        if (param3 <= bg.field_d) {
          oa.field_e[og.field_eb] = param1;
          ln.field_a[og.field_eb] = param4;
          mk.field_b[og.field_eb] = param5;
          var6 = param5 + (param4 + param1);
          if (~var6 == param2) {
            stackIn_19_0 = 0;
          } else {
            stackIn_19_0 = param1 * 1000 / var6;
          }
          var7 = stackIn_19_0;
          cc.field_h[og.field_eb] = var7;
          og.field_eb = og.field_eb + 1;
          if (rf.field_g < var7) {
            rf.field_g = var7;
          }
          if (mf.field_Q <= var7) {
            return;
          }
          mf.field_Q = var7;
          return;
        }
        rf.field_g = param3;
        oa.field_e[og.field_eb] = param1;
        ln.field_a[og.field_eb] = param4;
        mk.field_b[og.field_eb] = param5;
        var6Lifetime1 = param5 + (param4 + param1);
        if (~var6Lifetime1 == param2) {
          stackIn_7_0 = 0;
        } else {
          stackIn_7_0 = param1 * 1000 / var6Lifetime1;
        }
        var7Lifetime1 = stackIn_7_0;
        cc.field_h[og.field_eb] = var7Lifetime1;
        og.field_eb = og.field_eb + 1;
        if (rf.field_g < var7Lifetime1) {
          rf.field_g = var7Lifetime1;
        }
        if (mf.field_Q <= var7Lifetime1) {
          return;
        }
        mf.field_Q = var7Lifetime1;
    }

    final boolean b(int param0) {
        if (param0 != 0) {
          this.field_t = (tk) null;
          if (ab.field_e < this.field_e) {
            return false;
          }
          if (0 < eh.field_a) {
            return true;
          }
          return false;
        }
        if (ab.field_e < this.field_e) {
          return false;
        }
        if (0 < eh.field_a) {
          return true;
        }
        return false;
    }

    final void a(int param0, boolean param1, int param2) {
        this.field_h = param2;
        this.field_m = param0;
        if (param1) {
          this.c(-56);
        }
    }

    final void b(byte param0) {
        if (param0 <= -49) {
          this.field_t.a(-4328, this.field_g, this.field_j);
          return;
        }
        this.field_s = -34;
        this.field_t.a(-4328, this.field_g, this.field_j);
    }

    public static void a(byte param0) {
        field_f = null;
        field_k = null;
        if (param0 != -91) {
          byte[] var2 = (byte[]) null;
          ri.a(-34, (byte) -93, 92, (java.math.BigInteger) null, (java.math.BigInteger) null, (wl) null, (byte[]) null);
        }
    }

    private ri() throws Throwable {
        throw new Error();
    }

    static {
        field_k = "DRAW!";
        field_f = new String[8];
        field_f[0] = "fruit";
        field_f[3] = "bugs";
        field_f[5] = "undersea";
        field_f[4] = "flowers";
        field_f[1] = "animals";
        field_f[7] = "eightbit";
        field_f[6] = "city";
        field_f[2] = "breakfast";
    }
}
