/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad extends kf {
    static int[] field_D;
    private String field_A;
    static int field_y;
    private qe field_F;
    private boolean field_E;
    private int field_B;
    static hl[] field_z;
    static ta field_C;
    private int field_w;
    private int field_x;

    ad(int param0, int param1, int param2, int param3, uj param4, boolean param5, int param6, int param7, qe param8, int param9, String param10) {
        super(param0, param1, param2, param3, (de) null, (qg) null);
        boolean stackIn_4_1 = false;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        try {
          stackIn_4_1 = (param5);
          this.field_E = stackIn_4_1;
          this.field_w = param6;
          this.field_x = param9;
          this.field_A = param10;
          this.field_B = param7;
          this.field_F = param8;
          this.field_t = param4;
          var12_int = this.field_w - this.field_B;
          var13 = this.field_F.a(param10, var12_int, this.field_F.field_p) + this.field_B * 2;
          if (var13 <= param3) {
            var13 = param3;
          } else {
            this.a(param0, param2, (byte) 119, var13, param1);
          }
          if (this.field_E) {
            stackIn_10_0 = 0;
          } else {
            stackIn_10_0 = this.field_B * 2 + this.field_w;
          }
          var14 = stackIn_10_0;
          this.field_t.a(var14, param2 - (this.field_w + this.field_B * 3), (byte) 116, -(2 * this.field_B) + param3, (-param3 + var13 >> 1) + this.field_B);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_14_0 = var12;
          stackIn_14_1 = new StringBuilder().append("ad.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    public static void f(byte param0) {
        field_D = null;
        if (param0 > -88) {
          field_C = (ta) null;
        }
        field_C = null;
        field_z = null;
    }

    final static boolean e(byte param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        boolean stackIn_6_0 = false;
        Throwable decompiledCaughtException = null;
        var1 = hj.field_c;
        synchronized (var1) {
          if (wg.field_b == hc.field_b) {
            return false;
          }
          var2 = -107 % ((11 - param0) / 48);
          lb.field_B = pe.field_e[wg.field_b];
          StarCannon.field_E = ik.field_s[wg.field_b];
          wg.field_b = 127 & wg.field_b + 1;
          stackIn_6_0 = true;
        }
        return stackIn_6_0;
    }

    final static boolean a(int param0, int param1) {
        if (param1 < 10) {
          field_y = -37;
        }
        return param0 == (-param0 & param0) ? true : false;
    }

    final String d(int param0) {
        int var2 = this.field_t.field_h ? 1 : 0;
        this.field_t.field_h = this.field_h;
        String var3 = this.field_t.d(param0);
        this.field_t.field_h = var2 != 0 ? true : false;
        return var3;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = param1 + this.field_s;
        int var6 = this.field_j + param3;
        super.a(param0, param1, param2, param3);
        if (param0 != 0) {
          return;
        }
        int var7 = this.field_E ? -this.field_w + this.field_i - this.field_B * 2 : 0;
        this.field_F.a(this.field_A, var7 + (var5 + this.field_B), var6 + this.field_B, -this.field_B + this.field_w, -(2 * this.field_B) + this.field_f, this.field_x, -1, this.field_E ? 0 : 2, 1, this.field_F.field_p);
    }

    final static void a(int param0, int[] param1, boolean param2) {
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        lk var4 = null;
        int[] var5_ref_int__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var6Lifetime1;
        var10 = StarCannon.field_A;
        try {
          jh.field_c[param0] = param1;
          var3_int = 0;
          var4 = a.field_b;
          var5_ref_int__ = param1;
          for (var6 = 0; var6 < var5_ref_int__.length; var6++) {
            boolean decompiledFrameRemainder0 = true;
            var7 = var5_ref_int__[var6];
            var8 = mj.field_c[var7];
            if (19 != var7) {
              if (var7 != 20) {
                if (var8 == null) {
                  var8 = "ERROR: missing text";
                }
                if (var7 != 12 &&
                  var7 != 13) {
                  var9 = var4.a(var8);
                  if (!(var9 <= var3_int)) {
                    var3_int = var9;
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  var9 = ak.field_e + 64 + 9;
                  if (var3_int < var9) {
                    var3_int = var9;
                  }
                }
              } else {
                var9 = var4.a(ec.field_d);
                if (var3_int < var9) {
                  var3_int = var9;
                }
                var9 = var4.a(fd.field_d);
                if (var3_int < var9) {
                  var3_int = var9;
                }
                var9 = var4.a(gh.field_A);
                if (var3_int < var9) {
                  var3_int = var9;
                }
              }
            } else {
              var9 = var4.a(cf.field_k);
              if (var9 > var3_int) {
                var3_int = var9;
              }
              var9 = var4.a(fl.field_g);
              if (var3_int < var9) {
                var3_int = var9;
              }
              var9 = var4.a(hg.field_D);
              if (var9 > var3_int) {
                var3_int = var9;
              }
            }
          }
          var5 = var3_int + 20 >> 1;
          bj.field_c[param0] = -var5 + 320;
          bi.field_c[param0] = 320 + var5;
          qi.field_a[param0] = -(param1.length * 15) + 272;
          b.field_c[param0] = 30;
          if (4 == param0 ||
            param0 == 5) {
            qi.field_a[param0] = 400;
            bj.field_c[param0] = 100;
          }
          if (!param2) {
            field_y = 17;
          }
          if (param0 == 3) {
            qi.field_a[param0] = 400;
          }
          if (param0 == 2) {
            if (wk.a(54)) {
              qi.field_a[param0] = 360 + b.field_c[param0];
              bj.field_c[param0] = 120;
              return;
            }
            var6Lifetime1 = bj.field_c[param0];
            bj.field_c[param0] = 120;
            bi.field_c[param0] = bi.field_c[param0] + (bj.field_c[param0] - var6Lifetime1);
            qi.field_a[param0] = 350;
            b.field_c[param0] = b.field_c[param0] + 10;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_52_0 = var3;
          stackIn_52_1 = new StringBuilder().append("ad.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_52_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',').append(param2).append(')').toString());
        }
    }

    final static sk a(int param0, String param1) {
        int var3 = 0;
        int var2_int = 0;
        int var4 = 0;
        int var5 = 0;
        sk stackIn_4_0 = null;
        sk stackIn_8_0 = null;
        sk stackIn_19_0 = null;
        sk stackIn_22_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var5 = StarCannon.field_A;
        try {
          var2_int = param1.length();
          if (var2_int == 0) {
            stackIn_4_0 = qb.field_b;
            return stackIn_4_0;
          }
          if (var2_int > 63) {
            stackIn_8_0 = ai.field_a;
            return stackIn_8_0;
          }
          if (param0 >= -67) {
            ad.e((byte) 85);
          }
          for (var3 = 0; var3 < var2_int; var3++) {
            var4 = param1.charAt(var3);
            if (45 == var4) {
              if (var3 == 0 ||
                -1 + var2_int == var3) {
                stackIn_19_0 = ra.field_t;
                return stackIn_19_0;
              }
            } else {
              if (sg.field_o.indexOf(var4) == -1) {
                stackIn_22_0 = ra.field_t;
                return stackIn_22_0;
              }
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_27_0 = var2;
          stackIn_27_1 = new StringBuilder().append("ad.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    static {
        field_D = new int[8192];
    }
}
