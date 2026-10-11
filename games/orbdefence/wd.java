/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd {
    int[] field_b;
    int[] field_f;
    short field_u;
    int[] field_I;
    int field_z;
    int field_v;
    byte[] field_t;
    static String field_k;
    int[] field_L;
    short[] field_Q;
    short field_c;
    short[] field_h;
    short[] field_x;
    short[] field_s;
    short[] field_H;
    int[] field_g;
    short[] field_n;
    short[] field_e;
    int[] field_A;
    static int[] field_D;
    int[] field_r;
    short[] field_l;
    short field_w;
    static String field_p;
    static hj[] field_C;
    short[] field_y;
    int field_F;
    short[] field_N;
    int field_d;
    short[] field_M;
    int field_J;
    short[] field_a;
    short[] field_B;
    short[] field_q;
    short[] field_G;
    int[] field_E;
    short[] field_i;
    short[] field_R;
    short[] field_K;
    int[] field_j;
    static int[] field_o;
    byte field_m;
    private boolean field_O;
    int field_P;

    final static int a(boolean param0, boolean param1) {
        int stackIn_3_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_81_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param1) {
            stackIn_3_0 = -2;
            return stackIn_3_0;
          }
          tk.field_n = tk.field_n + 65536;
          while (tb.a(og.field_a, 723204176, tk.field_n) >= 65536) {
            le.field_c = le.field_c + 1;
            tk.field_n = tk.field_n - og.field_a;
          }
          var2_int = -1;
          if (null == dm.field_b) {
            if (null != il.field_e) {
              var2_int = il.field_e.length;
            }
          } else {
            var2_int = dm.field_b.length;
          }
          if (var2_int != -1) {
            boolean decompiledFrameRemainder0 = true;
            if (h.field_A < og.field_o) {
              h.field_A = h.field_A + 1;
              if (h.field_A > og.field_b && (null == dm.field_b ||
                dm.field_b[kb.field_m] == null)) {
                h.field_A = h.field_A - 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                if (og.field_o <= h.field_A &&
                  null == dm.field_b[(1 + kb.field_m) % var2_int]) {
                  h.field_A = h.field_A - 1;
                }
              }
            }
            if (h.field_A >= og.field_o) {
              lj.field_u = kb.field_m;
              if (!bh.field_b) {
                kb.field_m = kb.field_m - 1;
                if (kb.field_m < 0) {
                  kb.field_m = kb.field_m + var2_int;
                }
              } else {
                kb.field_m = kb.field_m + 1;
                if (kb.field_m >= var2_int) {
                  kb.field_m = kb.field_m - var2_int;
                }
              }
              h.field_A = h.field_A - og.field_o;
            }
            if (og.field_b < h.field_A) {
              bh.field_b = true;
            }
          }
          if (null != fm.field_b) {
            var3 = 357 - fm.field_b.field_t / 2;
            var4 = 0;
            if (gi.field_e != 0 &&
              bg.field_c > var3 &&
              bg.field_c < fm.field_b.field_k + var3) {
              if (269 - fm.field_b.field_o < ig.field_fb &&
                ig.field_fb < 269) {
                h.field_A = og.field_o;
                bh.field_b = false;
                var4 = 1;
              }
              if (ig.field_fb > 586 &&
                fm.field_b.field_o + 586 > ig.field_fb) {
                h.field_A = og.field_o;
                bh.field_b = true;
                var4 = 1;
              }
            }
            if (var4 == 0 &&
              h.field_A > og.field_b &&
              vl.field_d > var3 &&
              fm.field_b.field_k + var3 > vl.field_d) {
              if (ua.field_a > 269 - fm.field_b.field_o &&
                ua.field_a < 269) {
                h.field_A = og.field_b;
              }
              if (ua.field_a > 586 &&
                fm.field_b.field_o + 586 > ua.field_a) {
                h.field_A = og.field_b;
              }
            }
          }
          if (param0) {
            wj.field_k.a(ka.a(24316, ig.field_fb, bg.field_c), -1, ka.a(24316, ua.field_a, vl.field_d));
            if (wj.field_k.a((byte) -1)) {
              if (wj.field_k.field_h == 0) {
                stackIn_60_0 = 3;
                return stackIn_60_0;
              }
              if (wj.field_k.field_h == 1) {
                stackIn_64_0 = 2;
                return stackIn_64_0;
              }
            }
            while (nf.e(32722)) {
              wj.field_k.b(27163, 0);
              if (wj.field_k.a((byte) -1)) {
                if (wj.field_k.field_h == 0) {
                  stackIn_71_0 = 3;
                  return stackIn_71_0;
                }
                if (wj.field_k.field_h == 1) {
                  stackIn_75_0 = 1;
                  return stackIn_75_0;
                }
              }
              if (13 != ob.field_K) {
                continue;
              }
              stackIn_79_0 = 1;
              return stackIn_79_0;
            }
          }
          stackIn_81_0 = 0;
          return stackIn_81_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var2), "wd.E(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(byte param0) {
        this.field_O = false;
        if (param0 > -41) {
          this.field_F = 88;
        }
    }

    final static ea a(int param0, byte param1, int param2, int param3, be param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        ea var7 = null;
        be var8 = null;
        java.awt.Frame var9 = null;
        ea stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = m.a(param5, param2, param3, -1, param0, param4);
          var6 = var9;
          if (param1 <= 34) {
            var8 = (be) null;
            wd.a(23, (byte) -51, 117, 29, (be) null, -42);
          }
          if (var9 == null) {
            return null;
          }
          var7 = new ea();
          var7.field_c = var9;
          var7.field_c.add((java.awt.Component) ((Object) var7));
          var7.setBounds(0, 0, param5, param0);
          var7.addFocusListener(var7);
          var7.requestFocus();
          stackIn_6_0 = var7;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_9_0 = var6_ref;
          stackIn_9_1 = new StringBuilder().append("wd.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param5).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = OrbDefence.field_D ? 1 : 0;
        for (var6 = 0; var6 < this.field_c; var6++) {
          this.field_R[var6] = (short)(this.field_R[var6] * param1 / param4);
          this.field_x[var6] = (short)(param2 * this.field_x[var6] / param4);
          this.field_Q[var6] = (short)(param3 * this.field_Q[var6] / param4);
        }
        this.a((byte) -77);
        if (param0 != 3940) {
          this.field_v = -12;
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = OrbDefence.field_D ? 1 : 0;
        for (var5 = 0; this.field_c > var5; var5++) {
          this.field_R[var5] = (short)(this.field_R[var5] + param3);
          this.field_x[var5] = (short)(this.field_x[var5] + param1);
          this.field_Q[var5] = (short)(this.field_Q[var5] + param2);
        }
        if (param0 != 7) {
          this.field_P = 39;
        }
        this.a((byte) -64);
    }

    public static void b(int param0) {
        if (param0 <= 63) {
          return;
        }
        field_k = null;
        field_D = null;
        field_C = null;
        field_o = null;
        field_p = null;
    }

    final void a(int param0) {
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
        var12 = OrbDefence.field_D ? 1 : 0;
        if (this.field_O) {
          return;
        }
        this.field_O = true;
        var2 = 32767;
        var3 = 32767;
        var4 = 32767;
        var5 = -32768;
        var6 = -32768;
        if (param0 != 2) {
          this.field_f = (int[]) null;
        }
        var7 = -32768;
        for (var8 = 0; this.field_c > var8; var8++) {
          var9 = this.field_R[var8];
          var10 = this.field_x[var8];
          var11 = this.field_Q[var8];
          if (var5 < var9) {
            var5 = var9;
          }
          if (var9 < var2) {
            var2 = var9;
          }
          if (var10 < var3) {
            var3 = var10;
          }
          if (var10 > var6) {
            var6 = var10;
          }
          if (var11 > var7) {
            var7 = var11;
          }
          if (var11 < var4) {
            var4 = var11;
          }
        }
        this.field_v = var4;
        this.field_z = var7;
        this.field_F = var6;
        this.field_P = var2;
        this.field_J = var3;
        this.field_d = var5;
    }

    wd() {
        this.field_m = (byte) 0;
        this.field_O = false;
    }

    static {
        field_k = "Username: ";
        field_D = new int[]{2, 1, 2, 5, 3, 3, 3, 5, 10, 1, 1, 2, 2, 1, 2, 5, 10, 1, 2, 2, 2, 5, 2, 1};
        field_o = new int[9];
    }
}
