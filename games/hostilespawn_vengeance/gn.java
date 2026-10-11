/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gn {
    private boolean field_b;
    private int field_g;
    private int field_c;
    static String field_l;
    private int field_i;
    private int field_d;
    private int field_a;
    private int field_n;
    private int field_o;
    private int field_j;
    static int field_t;
    private int field_q;
    private bk field_h;
    private int field_r;
    private int field_s;
    private int field_f;
    private int field_p;
    private int field_e;
    static int[] field_k;
    private int field_u;
    private float field_m;

    final static void a(int param0, int param1, int param2, int param3, int param4, byte param5) {
        int var6_int = 0;
        int var7 = 0;
        vi var8 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = HostileSpawn.field_I ? 1 : 0;
        try {
          for (var6_int = 1; var6_int < 3; var6_int++) {
            si.e(var6_int + param2, param0 + var6_int, 9 - var6_int, 16776960, param3);
            si.d(param2 + var6_int, param0 + var6_int, -var6_int + 9, 16776960, param3);
            si.e(-9 + param1, var6_int + param0, 9 - var6_int, 16776960, param3);
            si.d(param1 - var6_int, param0 + var6_int, 9 - var6_int, 16776960, param3);
            si.e(param2 + var6_int, -var6_int + param4, 9 - var6_int, 16776960, param3);
            si.d(var6_int + param2, -9 + param4, 9 - var6_int, 16776960, param3);
            si.e(-9 + param1, param4 - var6_int, 1 - var6_int + 9, 16776960, param3);
            si.d(-var6_int + param1, param4 - 9, -var6_int + 9, 16776960, param3);
          }
          if (param5 <= 69) {
            var8 = (vi) null;
            gn.a(10, (vi) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var6), "gn.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void a(int param0) {
        int var1 = -52 % ((param0 - 23) / 50);
        field_l = null;
        field_k = null;
    }

    final void a(boolean param0) {
        int fieldTemp$1 = 0;
        if (null != wa.field_q) {
          return;
        }
        if (0 >= wb.field_S) {
          this.field_b = false;
        }
        if (this.field_b) {
          if (!param0) {
            gn.a(-27);
          }
          fieldTemp$1 = this.field_o - 1;
          this.field_o = this.field_o - 1;
          if (fieldTemp$1 > 0) {
            return;
          }
          this.field_o = this.field_n;
          if (ca.field_d >= this.field_q) {
            this.a((byte) -97);
          } else {
            this.field_b = false;
          }
          return;
        }
        if (hf.field_h >= this.field_c) {
          if (0 < this.field_c) {
            sg.field_a = 0;
          }
        } else {
          sg.field_a = (this.field_c - hf.field_h) / 2;
        }
        if (hf.field_h != this.field_i ||
          qc.field_s != this.field_u) {
          this.field_h.a((byte) -123, this.field_u, this.field_i);
        }
    }

    final static boolean a(int param0, vi param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            field_t = 102;
          }
          var2_int = param1.l(32270);
          stackIn_5_0 = (1 == var2_int) ? 1 : 0;
          var3 = stackIn_5_0;
          stackIn_6_0 = var3;
          return stackIn_6_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("gn.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final ue d(int param0) {
        this.field_d = hf.field_h;
        this.field_f = qc.field_s;
        if (param0 != 16776960) {
          this.d(47);
        }
        this.field_h.a((byte) -125, this.field_p, this.field_s);
        ih.field_s = false;
        ue var2 = jg.a(this.field_s, (byte) -61, gf.field_b, 0, this.field_p, 0);
        if (var2 == null) {
          this.c(115);
        }
        return var2;
    }

    final static ll a(String param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ll stackIn_3_0 = null;
        ll stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = HostileSpawn.field_I ? 1 : 0;
        try {
          var2_int = param0.length();
          var3 = 0;
          if (param1) {
            stackIn_3_0 = (ll) null;
            return stackIn_3_0;
          }
          while (var3 < var2_int) {
            var4 = param0.charAt(var3);
            if (48 > var4) {
              return null;
            }
            if (var4 > 57) {
              return null;
            }
            var3++;
          }
          stackIn_12_0 = we.field_g;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("gn.K(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean b(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 28433) {
          return true;
        }
        stackIn_6_0 = (this.field_q <= ca.field_d) && (wb.field_S > 0);
        return stackIn_6_0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, boolean[] param5, boolean[] param6) {
        int var9 = 0;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_62_2 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_65_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        p var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        bd var14 = null;
        var13 = HostileSpawn.field_I ? 1 : 0;
        try {
          var8 = 46 / ((9 - param3) / 50);
          var14 = new bd(64, 64);
          for (var9 = 0; var9 < ll.field_a; var9++) {
            boolean decompiledFrameRemainder0 = true;
            var10 = wh.field_b[var9];
            param1 = -12 - param2 + (int)(24.0 * ((double)var10.field_j.field_e + var10.field_l.field_f));
            param4 = (int)(((double)var10.field_j.field_g + var10.field_l.field_a) * 24.0) - param0 + 12;
            if (-96 <= param1 &&
              param4 >= -96 &&
              736 >= param1 &&
              576 >= param4) {
              var11 = var10.field_j.b(-4);
              if (param6[var11]) {
                var10.field_n = true;
              }
              var12 = var10.field_i;
              if (var12 == 0) {
                pf.a(var14.field_D, false);
                qa.field_g[var10.field_h + 1].a(true, 128, (int)var10.field_c, param1, param4);
                var14.a();
                qa.field_g[1 + var10.field_h].a(true, 128, (int)var10.field_c, 32, 32);
                o.field_n.b((byte) 117);
                for (var12 = 0; var14.field_D.length > var12; var12++) {
                  if (var14.field_D[var12] != 0) {
                    var14.field_D[var12] = 16711680;
                  }
                }
                var12 = em.field_c % 80;
                var12 = (int)(100.0 * (1.0 + Math.sin(3.141592653589793 * (double)var12 / 40.0)));
                var14.b(param1 - 32, -32 + param4, var12 / 2);
                if (((param5[var11])) &&
                  (!(param1 - 24 > j.field_c)) &&
                  (!(-24 + param4 > rb.field_m)) &&
                  (!(param1 + 24 < j.field_c)) &&
                  (!(rb.field_m > 24 + param4))) {
                  if (var10.field_h >= 0 &&
                    var10.field_h < rf.field_s.length) {
                    pf.field_I = rf.field_s[var10.field_h];
                  } else {
                    pf.field_I = rf.field_s[0];
                  }
                  aj.field_d = 8 + param4;
                  lh.field_a = param1;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (var12 == 1) {
                  pf.a(var14.field_D, false);
                  hh.field_a[var10.field_h].a(true, 128, (int)var10.field_c, param1, param4);
                  var14.a();
                  hh.field_a[var10.field_h].a(true, 128, (int)var10.field_c, 32, 32);
                  o.field_n.b((byte) 110);
                  for (var12 = 0; var14.field_D.length > var12; var12++) {
                    if (var14.field_D[var12] != 0) {
                      var14.field_D[var12] = 16711680;
                    }
                  }
                  var12 = em.field_c % 80;
                  var12 = (int)(100.0 * (1.0 + Math.sin((double)var12 * 3.141592653589793 / 40.0)));
                  var14.b(-32 + param1, -32 + param4, var12 / 2);
                  if (((param5[var11])) &&
                    (!(j.field_c < param1 - 24)) &&
                    (!(rb.field_m < -24 + param4)) &&
                    (!(j.field_c > param1 + 24)) &&
                    (!(rb.field_m > 24 + param4))) {
                    pf.field_I = lg.field_n[var10.field_h];
                    lh.field_a = param1;
                    aj.field_d = param4 + 8;
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  if (var12 == 2) {
                    pf.a(var14.field_D, false);
                    wk.field_b[var10.field_h].a(true, 128, (int)var10.field_c, param1, param4);
                    var14.a();
                    wk.field_b[var10.field_h].a(true, 128, (int)var10.field_c, 32, 32);
                    o.field_n.b((byte) -88);
                    for (var12 = 0; var14.field_D.length > var12; var12++) {
                      if (var14.field_D[var12] != 0) {
                        var14.field_D[var12] = 16711680;
                      }
                    }
                    var12 = em.field_c % 80;
                    var12 = (int)(100.0 * (1.0 + Math.sin((double)var12 * 3.141592653589793 / 40.0)));
                    var14.b(-32 + param1, param4 - 32, var12 / 2);
                    if (param5[var11] &&
                      !(param1 - 24 > j.field_c) &&
                      !(-24 + param4 > rb.field_m) &&
                      !(param1 + 24 < j.field_c) &&
                      !(rb.field_m > 24 + param4)) {
                      pf.field_I = bm.field_e[var10.field_h];
                      lh.field_a = param1;
                      aj.field_d = 8 + param4;
                    }
                  }
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_61_0 = var7;
          stackIn_61_1 = new StringBuilder().append("gn.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_62_2 = "null";
          } else {
            stackIn_62_2 = "{...}";
          }
          stackIn_64_1 = ((StringBuilder) (Object) stackIn_61_1).append(stackIn_62_2).append(',');
          if (param6 == null) {
            stackIn_65_2 = "null";
          } else {
            stackIn_65_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_61_0), ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2) {
        this.field_c = param2;
        if (param1 != 1) {
          this.a(true);
        }
        this.field_e = param0;
    }

    private final void a(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = HostileSpawn.field_I ? 1 : 0;
        var2 = this.field_c;
        var3 = this.field_e;
        if (param0 >= -26) {
          this.field_d = 123;
        }
        if (!this.b(28433)) {
          this.field_b = false;
          return;
        }
        if (var3 <= this.field_j) {
          if (this.field_a > var3) {
            var3 = this.field_a;
          }
        } else {
          var3 = this.field_j;
        }
        if (this.field_r >= var2) {
          if (this.field_g > var2) {
            var2 = this.field_g;
          }
        } else {
          var2 = this.field_r;
        }
        if (0.0f < this.field_m) {
          var4 = (int)((float)var3 * this.field_m + 0.5f);
          if (var2 < var4) {
            var3 = (int)((float)var2 / this.field_m);
          } else {
            if (var2 > var4) {
              var2 = var4;
            }
          }
        }
        if (var2 != hf.field_h ||
          qc.field_s != var3) {
          this.field_h.a((byte) -120, var3, var2);
        }
        if (this.field_c > 0) {
          sg.field_a = (-hf.field_h + this.field_c) / 2;
        }
    }

    final void c(int param0) {
        if (param0 <= 67) {
          this.a((byte) -115);
        }
        this.field_h.a((byte) -119, this.field_f, this.field_d);
    }

    private gn() throws Throwable {
        throw new Error();
    }

    static {
        field_t = 0;
        field_l = "Start mission";
        field_k = new int[]{0, 0};
    }
}
