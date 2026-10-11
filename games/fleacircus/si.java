/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si {
    short[] field_M;
    short[] field_s;
    static String field_o;
    static dd field_C;
    short field_w;
    short[] field_t;
    int field_m;
    short[] field_F;
    int field_b;
    short[] field_P;
    short[] field_Q;
    int[] field_d;
    int[] field_G;
    short[] field_n;
    short[] field_q;
    int[] field_v;
    short[] field_D;
    int[] field_O;
    static vg field_y;
    short[] field_i;
    private boolean field_a;
    int[] field_z;
    int field_k;
    short field_p;
    short[] field_K;
    byte field_h;
    int[] field_g;
    short[] field_f;
    static int[] field_R;
    int[] field_c;
    short[] field_l;
    int[] field_L;
    int field_A;
    int[] field_I;
    int field_B;
    short[] field_N;
    short[] field_E;
    short[] field_u;
    short[] field_x;
    int field_e;
    short field_j;
    byte[] field_J;
    static String field_H;
    short[] field_r;

    public static void c(int param0) {
        int var1 = 55 % ((param0 - 9) / 40);
        field_H = null;
        field_C = null;
        field_R = null;
        field_o = null;
        field_y = null;
    }

    final void b(int param0) {
        int var8 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var9;
        int var10;
        int var11;
        int var12;
        var12 = fleas.field_A ? 1 : 0;
        if (this.field_a) {
          return;
        }
        this.field_a = true;
        var2 = 32767;
        var3 = 32767;
        var4 = 32767;
        var5 = -32768;
        var6 = -32768;
        var7 = -32768;
        for (var8 = 0; var8 < this.field_w; var8++) {
          var9 = this.field_n[var8];
          var10 = this.field_f[var8];
          if (var5 < var9) {
            var5 = var9;
          }
          if (var10 < var3) {
            var3 = var10;
          }
          if (var6 < var10) {
            var6 = var10;
          }
          if (var2 > var9) {
            var2 = var9;
          }
          var11 = this.field_P[var8];
          if (var11 > var7) {
            var7 = var11;
          }
          if (var11 < var4) {
            var4 = var11;
          }
        }
        if (param0 != -23443) {
          this.field_K = (short[]) null;
        }
        this.field_A = var4;
        this.field_e = var3;
        this.field_k = var6;
        this.field_B = var5;
        this.field_b = var7;
        this.field_m = var2;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = fleas.field_A ? 1 : 0;
        for (var6 = param4; var6 < this.field_w; var6++) {
          this.field_n[var6] = (short)(this.field_n[var6] * param0 / param1);
          this.field_f[var6] = (short)(param3 * this.field_f[var6] / param1);
          this.field_P[var6] = (short)(this.field_P[var6] * param2 / param1);
        }
        this.a(78);
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var7 = fleas.field_A ? 1 : 0;
        int var5 = 0;
        int var6 = 15 % ((param3 + 11) / 63);
        while (var5 < this.field_w) {
          this.field_n[var5] = (short)(this.field_n[var5] + param1);
          this.field_f[var5] = (short)(this.field_f[var5] + param0);
          this.field_P[var5] = (short)(this.field_P[var5] + param2);
          var5++;
        }
        this.a(87);
    }

    private final void a(int param0) {
        if (param0 <= 27) {
          this.field_q = (short[]) null;
        }
        this.field_a = false;
    }

    final static int a(int param0, boolean param1) {
        int stackIn_59_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_82_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = fleas.field_A ? 1 : 0;
        try {
          ib.field_g = ib.field_g + 65536;
          while (a.a(hd.field_b, ib.field_g, (byte) -17) >= 65536) {
            ib.field_g = ib.field_g - hd.field_b;
            bf.field_b = bf.field_b + 1;
          }
          var2_int = -1;
          if (wa.field_k == null) {
            if (of.field_h != null) {
              var2_int = of.field_h.length;
            }
          } else {
            var2_int = wa.field_k.length;
          }
          if (var2_int != -1) {
            boolean decompiledFrameRemainder0 = true;
            if (td.field_i < hd.field_g) {
              td.field_i = td.field_i + 1;
              if (td.field_i > hd.field_c && (null == wa.field_k ||
                null == wa.field_k[ql.field_o])) {
                td.field_i = td.field_i - 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                if (td.field_i >= hd.field_g &&
                  null == wa.field_k[(1 + ql.field_o) % var2_int]) {
                  td.field_i = td.field_i - 1;
                }
              }
            }
            if (td.field_i >= hd.field_g) {
              t.field_a = ql.field_o;
              if (rc.field_i) {
                ql.field_o = ql.field_o + 1;
                if (var2_int <= ql.field_o) {
                  ql.field_o = ql.field_o - var2_int;
                }
              } else {
                ql.field_o = ql.field_o - 1;
                if (ql.field_o < 0) {
                  ql.field_o = ql.field_o + var2_int;
                }
              }
              td.field_i = td.field_i - hd.field_g;
            }
            if (td.field_i > hd.field_c) {
              rc.field_i = true;
            }
          }
          if (null != jg.field_f) {
            var3 = -(jg.field_f.field_r / 2) + 357;
            var4 = 0;
            if (jk.field_r != 0 &&
              var3 < ob.field_e &&
              var3 + jg.field_f.field_t > ob.field_e) {
              if (269 - jg.field_f.field_w < pb.field_d &&
                pb.field_d < 269) {
                td.field_i = hd.field_g;
                var4 = 1;
                rc.field_i = false;
              }
              if (pb.field_d > 586 &&
                pb.field_d < jg.field_f.field_w + 586) {
                rc.field_i = true;
                var4 = 1;
                td.field_i = hd.field_g;
              }
            }
            if (var4 == 0 &&
              hd.field_c < td.field_i &&
              var3 < kc.field_b &&
              kc.field_b < jg.field_f.field_t + var3) {
              if (ag.field_f > 269 - jg.field_f.field_w &&
                ag.field_f < 269) {
                td.field_i = hd.field_c;
              }
              if (ag.field_f > 586 &&
                ag.field_f < jg.field_f.field_w + 586) {
                td.field_i = hd.field_c;
              }
            }
          }
          if (param0 <= 3) {
            stackIn_59_0 = 107;
            return stackIn_59_0;
          }
          if (param1) {
            ul.field_G.b(109, em.a(ob.field_e, false, pb.field_d), em.a(kc.field_b, false, ag.field_f));
            if (ul.field_G.b(-78)) {
              if (ul.field_G.field_k == 0) {
                stackIn_64_0 = 3;
                return stackIn_64_0;
              }
              if (1 == ul.field_G.field_k) {
                stackIn_67_0 = 2;
                return stackIn_67_0;
              }
            }
            stackIn_70_0 = -97;
            while (wf.b(stackIn_70_0)) {
              ul.field_G.a(0, true);
              if (ul.field_G.b(107)) {
                if (ul.field_G.field_k == 0) {
                  stackIn_74_0 = 3;
                  return stackIn_74_0;
                }
                if (ul.field_G.field_k == 1) {
                  stackIn_77_0 = 1;
                  return stackIn_77_0;
                }
              }
              if (ji.field_a != 13) {
                stackIn_70_0 = -97;
                continue;
              }
              stackIn_80_0 = 1;
              return stackIn_80_0;
            }
          }
          stackIn_82_0 = 0;
          return stackIn_82_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var2), "si.E(" + param0 + ',' + param1 + ')');
        }
    }

    final static int a(int param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = fleas.field_A ? 1 : 0;
        try {
          var4 = -14 / ((param1 - 2) / 51);
          var3_int = 0;
          while (0 < param0) {
            var3_int = 1 & param2 | var3_int << 1;
            param0--;
            param2 = param2 >>> 1;
          }
          stackIn_5_0 = var3_int;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var3), "si.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    si() {
        this.field_a = false;
        this.field_h = (byte) 0;
    }

    static {
        field_R = new int[4];
        field_H = "<%0>Spring:<%1> Fleas standing on these are bounced up until they hit something.";
        field_o = "<%0>Blocks:<%1> fleas can walk on these, but can't climb up the sides.";
    }
}
