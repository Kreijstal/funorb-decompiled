/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cq {
    private int field_d;
    private wg field_f;
    static int field_i;
    private int field_b;
    private int[][] field_a;
    private hi[] field_c;
    private int[] field_e;
    private int field_h;
    private int field_g;
    private int[][] field_j;
    byte field_k;

    final void a(int param0) {
        if (param0 >= -52) {
            this.b(-19);
        }
        this.field_b = 50;
    }

    final void a(int[] param0, int param1) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        fc var6 = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (!this.field_f.a(-128)) {
              L1: {
                if ((this.field_b ^ -1) <= -21) {
                  if ((this.field_b ^ -1) < -51) {
                    break L1;
                  } else {
                    var5 = 0;
                    var3_int = var5;
                    L2: while (true) {
                      if (var5 >= 100) {
                        break L1;
                      } else {
                        jn.a(param0, this.field_j[var5][2] >> 1990863748, am.field_o, this.field_j[var5][1] >> 630155492, 80 - (this.field_b * 4 - 128), sf.field_b.field_t << 320830242, this.field_j[var5][0] >> -1680369052, 10, sf.field_b.field_y << 1054206658);
                        var5++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  var3_int = 0;
                  L3: while (true) {
                    if ((var3_int ^ -1) <= -101) {
                      break L1;
                    } else {
                      jn.a(param0, this.field_j[var3_int][2] >> -1916931036, am.field_o, this.field_j[var3_int][1] >> -1709333340, 128, sf.field_b.field_t << -1302454142, this.field_j[var3_int][0] >> -2038614172, 10, sf.field_b.field_y << -926966430);
                      var3_int++;
                      continue L3;
                    }
                  }
                }
              }
              L4: {
                mj.a(this.field_g, this.field_h, 0, 0, this.field_e, (byte) -74, this.field_d);
                if (param1 == -926966430) {
                  break L4;
                } else {
                  this.a(-104, -100, -78, -48, (int[][]) null, (byte) 69);
                  break L4;
                }
              }
              var6 = (fc) ((Object) this.field_f.a(false, false, false, rq.field_r.b(110, 1560, 10, -10, -5)));
              var6.a(param0, this.field_e);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3);

            stackIn_17_1 = new StringBuilder().append("cq.A(");

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
          throw wn.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int[][] param4, byte param5) {
        int var7_int = 0;
        int var9 = 0;
        int var11 = 0;
        int var10 = Vertigo2.field_L ? 1 : 0;
        if (this.field_b < 50) {
            return;
        }
        try {
            this.field_g = param2;
            this.field_d = param3;
            this.field_h = param1;
            var7_int = 0;
            int var8 = 32 % ((param0 - 55) / 46);
            while ((var7_int ^ -1) > -101) {
                this.field_j[var7_int][0] = param2 << 60004740;
                this.field_j[var7_int][1] = param3 << 1877741828;
                this.field_j[var7_int][2] = param1 << 1689037380;
                var9 = var7_int * 2048 / 100;
                this.field_a[var7_int][0] = oo.field_h[var9];
                this.field_a[var7_int][1] = oo.field_j[var9];
                var7_int++;
            }
            this.field_k = param5;
            var11 = 0;
            var7_int = var11;
            while (var11 < param5) {
                this.field_c[var11].a(param4[var11][1], param4[var11][3], param4[var11][0], param4[var11][2], -107, this.field_f);
                var11++;
            }
            this.field_f.a(ap.field_b[26], (byte) 78);
            this.field_b = 0;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "cq.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final void a(byte param0) {
        int[] dupTemp$0 = null;
        int[] dupTemp$1 = null;
        int[] dupTemp$2 = null;
        int[] dupTemp$3 = null;
        int var2 = 0;
        int var3 = Vertigo2.field_L ? 1 : 0;
        if (param0 != 68) {
            this.a(55, 9, -77, -47, (int[][]) null, (byte) -61);
        }
        this.field_f.c(-660903963);
        if ((this.field_b ^ -1) < -7) {
            for (var2 = 0; (var2 ^ -1) > -101; var2++) {
                dupTemp$0 = this.field_a[var2];
                dupTemp$0[0] = dupTemp$0[0] >> 1;
                dupTemp$1 = this.field_a[var2];
                dupTemp$1[1] = dupTemp$1[1] >> 1;
            }
        }
        for (var2 = 0; 100 > var2; var2++) {
            dupTemp$2 = this.field_j[var2];
            dupTemp$2[0] = dupTemp$2[0] + (this.field_a[var2][0] >> -1361609945);
            dupTemp$3 = this.field_j[var2];
            dupTemp$3[2] = dupTemp$3[2] + (this.field_a[var2][1] >> -1447810201);
        }
        for (var2 = 0; var2 < this.field_k; var2++) {
            this.field_c[var2].b((byte) 112);
        }
        this.field_b = this.field_b + 1;
    }

    final hi[] b(int param0) {
        if ((this.field_b ^ -1) <= param0) {
            return null;
        }
        return this.field_c;
    }

    cq() {
        int var1 = 0;
        this.field_e = new int[12];
        this.field_a = new int[100][2];
        this.field_j = new int[100][3];
        this.field_b = 50;
        this.field_f = new wg();
        this.field_c = new hi[9];
        for (var1 = 0; var1 < this.field_c.length; var1++) {
            this.field_c[var1] = new hi();
        }
        this.field_k = (byte) 0;
    }

    static {
    }
}
