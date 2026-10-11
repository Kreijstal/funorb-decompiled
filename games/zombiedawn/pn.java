/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pn extends ei {
    private int field_Q;
    private int field_S;
    private int field_P;
    private int field_O;
    static String[] field_R;
    private int field_L;
    private int field_N;
    static String field_M;

    void l(int param0) {
        if (param0 != -7476) {
          pn.k(10);
        }
    }

    boolean e(byte param0) {
        this.f((byte) -45);
        if (param0 != 28) {
          field_R = (String[]) null;
          return super.e((byte) 28);
        }
        return super.e((byte) 28);
    }

    void a(int param0, int param1, byte param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var16;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var12Lifetime1;
        int var13Lifetime1;
        var16 = ZombieDawn.field_J;
        bi.f(6 + param0, param1 + 35, -12 + this.field_i, this.field_n - 40, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        var7 = 0;
        var8 = param1;
        while (var4 > var7) {
          if (var8 >= bi.field_l &&
            var8 < bi.field_d) {
            var9 = var7 * (var6 - var5) / var4 + var5;
            var10 = 0;
            var11 = this.field_i;
            if (20 >= var7) {
              while (var10 <= 20) {
                var12 = (-var7 + 20) * (-var7 + 20) + (-var10 + 20) * (20 - var10);
                if (var12 <= 462) {
                  if (var12 < 420) {
                    break;
                  }
                  var13 = var9 * (462 - var12) / 42;
                  var13 = var13 | (var13 << 16 | var13 << 8);
                  bi.field_c[param0 + var8 * bi.field_f + var10] = var13;
                }
                var10++;
              }
            }
            if (20 >= var7) {
              var12Lifetime1 = var11;
              var11 -= 21;
              var13Lifetime1 = 0;
              while (var13Lifetime1 <= 20) {
                var14 = (20 - var7) * (-var7 + 20) + var13Lifetime1 * var13Lifetime1;
                if (var14 <= 462) {
                  if (var14 >= 420) {
                    var15 = var9 * (-var14 + 462) / 42;
                    var15 = var15 | (var15 << 16 | var15 << 8);
                    bi.field_c[var8 * bi.field_f + param0 + var11] = var15;
                  } else {
                    var12Lifetime1 = var11 + 1;
                  }
                  var13Lifetime1++;
                  var11++;
                  continue;
                }
                break;
              }
              var11 = var12Lifetime1;
            }
            var9 = var9 | (var9 << 16 | var9 << 8);
            bi.b(param0 + var10, var8, var11 - var10, var9);
          }
          var8++;
          var7++;
        }
        if (param2 > -111) {
          this.a(-128, -39, (byte) -12);
        }
        var6Lifetime1 = 169;
        var4Lifetime1 = 22;
        var5Lifetime1 = 194;
        var7Lifetime1 = 0;
        var8Lifetime1 = param1 + 35;
        while (var4Lifetime1 > var7Lifetime1) {
          var9Lifetime1 = var5Lifetime1 + (-var5Lifetime1 + var6Lifetime1) * var7Lifetime1 / var4Lifetime1;
          var9Lifetime1 = var9Lifetime1 | (var9Lifetime1 << 16 | var9Lifetime1 << 8);
          bi.b(param0, var8Lifetime1, 6, var9Lifetime1);
          bi.b(param0 + this.field_i - 6, var8Lifetime1, 6, var9Lifetime1);
          var7Lifetime1++;
          var8Lifetime1++;
        }
        we.field_Tb.b(this.field_i + param0 - 90, 10 + param1);
        ke.a(65, param0 + 5, ad.field_f, -10 + this.field_i, param1 + 35);
        ke.a(79, param0, dp.field_b, this.field_i, param1 + this.field_n - 22);
        var6Lifetime2 = 127;
        var5Lifetime2 = 169;
        var4Lifetime2 = -79 + this.field_n;
        var7Lifetime2 = 0;
        var8Lifetime2 = 57 + param1;
        while (var7Lifetime2 < var4Lifetime2) {
          var9Lifetime2 = var5Lifetime2 + var7Lifetime2 * (var6Lifetime2 - var5Lifetime2) / var4Lifetime2;
          var9Lifetime2 = var9Lifetime2 | (var9Lifetime2 << 8 | var9Lifetime2 << 16);
          bi.b(param0, var8Lifetime2, 6, var9Lifetime2);
          bi.b(this.field_i + (param0 - 6), var8Lifetime2, 6, var9Lifetime2);
          var7Lifetime2++;
          var8Lifetime2++;
        }
    }

    final static void a(boolean param0, byte param1, boolean param2) {
        String var4 = null;
        String var4Lifetime1;
        if (param1 < -32) {
          var4 = (String) null;
          gl.a(-753, (String) null, param0, param2);
          return;
        }
        pn.k(-15);
        var4Lifetime1 = (String) null;
        gl.a(-753, (String) null, param0, param2);
    }

    boolean j(int param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        if (param0 == 2634) {
          if (this.field_Q <= 0) {
            return super.j(param0 + 0);
          }
          var2 = this.field_N;
          var3 = this.field_O;
          fieldTemp$2 = this.field_L + 1;
          this.field_L = this.field_L + 1;
          if (fieldTemp$2 >= this.field_Q) {
            this.field_Q = 0;
            this.l(param0 - 10110);
          } else {
            var4 = (this.field_Q * 2 - this.field_L) * this.field_L;
            var5 = this.field_Q * this.field_Q;
            var3 = this.field_S + var4 * (this.field_O - this.field_S) / var5;
            var2 = (-this.field_P + this.field_N) * var4 / var5 + this.field_P;
          }
          this.a((byte) 123, var3, var2);
          return super.j(param0 + 0);
        }
        this.f((byte) -55);
        if (this.field_Q <= 0) {
          return super.j(param0 + 0);
        }
        var2Lifetime1 = this.field_N;
        var3Lifetime1 = this.field_O;
        fieldTemp$3 = this.field_L + 1;
        this.field_L = this.field_L + 1;
        if (fieldTemp$3 >= this.field_Q) {
          this.field_Q = 0;
          this.l(param0 - 10110);
        } else {
          var4Lifetime1 = (this.field_Q * 2 - this.field_L) * this.field_L;
          var5Lifetime1 = this.field_Q * this.field_Q;
          var3Lifetime1 = this.field_S + var4Lifetime1 * (this.field_O - this.field_S) / var5Lifetime1;
          var2Lifetime1 = (-this.field_P + this.field_N) * var4Lifetime1 / var5Lifetime1 + this.field_P;
        }
        this.a((byte) 123, var3Lifetime1, var2Lifetime1);
        return super.j(param0 + 0);
    }

    void f(byte param0) {
        if (this.field_Q <= 0) {
          return;
        }
        this.a((byte) 90, this.field_O, this.field_N);
        int var2 = 97 % ((22 - param0) / 59);
        this.field_Q = 0;
        this.l(-7476);
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        if (0 >= param3) {
          this.a((byte) 98, param1, param2);
          return;
        }
        this.field_S = this.field_n;
        this.field_L = 0;
        if (!param0) {
          this.field_O = param1;
          this.field_N = param2;
          this.field_Q = param3;
          this.field_P = this.field_i;
          return;
        }
        this.field_L = 20;
        this.field_O = param1;
        this.field_N = param2;
        this.field_Q = param3;
        this.field_P = this.field_i;
    }

    final static void a(wk param0, int param1, ub param2) {
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_66_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var5Lifetime1;
        var6 = ZombieDawn.field_J;
        try {
          if (ac.field_m > 1562) {
            return;
          }
          var3_int = 11;
          if (param1 != 152) {
            field_R = (String[]) null;
          }
          var4 = ac.field_m % var3_int;
          if (ac.field_m % var3_int == 0) {
            lg.a(2 + var4 % (2 * var3_int) / var3_int * 2, (byte) -90);
          }
          if (-1.0f == oc.field_c) {
            oc.field_c = (float)param0.field_c;
          }
          if (240.0f < oc.field_c) {
            oc.field_c = oc.field_c - i.field_V;
            param0.field_c = (int)oc.field_c;
          }
          if (ac.field_m == 1562) {
            if (null != qj.field_f &&
              !qj.field_f.l()) {
              pc.a((byte) 13, qj.field_f);
            }
            ch.b(124);
            hm.a(9);
            ZombieDawn.b(116, wi.field_a);
            qb.a(false, wc.field_Rb);
            wo.field_wb = true;
            return;
          }
          if (ac.field_m <= 990) {
            if (990 == ac.field_m) {
              wi.field_a = ce.field_u;
            }
          } else {
            var5 = 256 + (-ac.field_m + 990);
            if (var5 < 0) {
              var5 = 0;
            }
            ZombieDawn.b(param1 - 30, wi.field_a * var5 >> 8);
            qb.a(false, var5 * wc.field_Rb >> 8);
            vf.field_c.h(wc.field_Rb);
            if (ac.field_m % 2 == 0) {
              param2.i(16777215);
              if (100 == (ac.field_m - 990) / 2) {
                hp.field_A.r((byte) -84);
              }
            }
          }
          if (ac.field_m == 800) {
            og.field_A = true;
            kh.a(64, false);
            vf.field_c = kh.a(150, false);
            dj.field_e.field_R.a(0, ne.field_c);
            for (var5Lifetime1 = 0; pl.field_t.length > var5Lifetime1; var5Lifetime1++) {
              dj.field_e.field_R.a(0, pl.field_t[var5Lifetime1]);
            }
            dj.field_e.field_R.a(0, new jj(370, 550));
          } else {
            if (ac.field_m != 950) {
              if (ac.field_m != 700) {
                if (ac.field_m >= 700 &&
                  ac.field_m < 990) {
                  var5Lifetime1 = 256 * (-700 + ac.field_m) / 50;
                  if (var5Lifetime1 > 256) {
                    var5Lifetime1 = 256;
                  }
                  nc.field_r.h(wc.field_Rb * var5Lifetime1 >> 8);
                }
              } else {
                nc.field_r = jp.$cfr$intArgs$a$c44adeabe1a9(125, 152);
                nc.field_r.h(0);
                wc.field_Rb = ge.field_c;
              }
            } else {
              hp.field_A.q((byte) 111);
            }
          }
          if (ac.field_m > 140) {
            if (0.0f < i.field_V &&
              0 == ac.field_m % 20) {
              i.field_V = i.field_V - 0.4000000059604645f;
            }
            if (!(i.field_V < 0.0f)) {
              return;
            }
            i.field_V = 0.0f;
          } else {
            if (ac.field_m <= 30) {
              return;
            }
            if (ac.field_m % 20 == 0) {
              if (!(1.7 > (double)i.field_V)) {
                return;
              }
              i.field_V = i.field_V + 0.30000001192092896f;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_62_0 = var3;
          stackIn_62_1 = new StringBuilder().append("pn.T(");
          if (param0 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          stackIn_65_1 = ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_66_2 = "null";
          } else {
            stackIn_66_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_62_0), ((StringBuilder) (Object) stackIn_65_1).append(stackIn_66_2).append(')').toString());
        }
    }

    public static void k(int param0) {
        field_R = null;
        int var1 = 47 % ((param0 - 29) / 37);
        field_M = null;
    }

    pn(dn param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_Q = 0;
        this.field_L = 0;
    }

    static {
        field_M = "You have 1 unread message!";
    }
}
