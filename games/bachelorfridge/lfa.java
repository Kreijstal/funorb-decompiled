/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lfa extends k {
    static int field_q;
    private int field_m;
    static sna field_l;
    static kv field_u;
    static ee field_s;
    private int field_p;
    private int field_n;
    private int field_v;
    private int field_t;
    private int field_k;
    private int field_r;
    static int field_o;

    public static void e(byte param0) {
        field_s = null;
        field_l = null;
        if (param0 != -128) {
          return;
        }
        field_u = null;
    }

    private final boolean b(int param0, int param1, int param2) {
        int var4;
        int var5;
        boolean stackIn_6_0 = false;
        var4 = this.field_n * (param1 - param2) >> 12;
        var5 = am.field_R[(1047373 & var4 * 255) >> 12];
        var5 = (var5 << 12) / this.field_n;
        if (param0 != 0) {
          return true;
        }
        var5 = (var5 << 12) / this.field_p;
        var5 = var5 * this.field_m >> 12;
        stackIn_6_0 = (var5 > param1 + param2) && (param2 + param1 > -var5);
        return stackIn_6_0;
    }

    final static boolean d(int param0) {
        int var8_int = 0;
        int var12 = 0;
        int stackIn_45_0 = 0;
        int stackIn_51_0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3_int = 0;
        op var3 = null;
        int var4_int = 0;
        tk[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        String[] var6_ref_String__ = null;
        int var7 = 0;
        op var8 = null;
        int var9 = 0;
        Object var10 = null;
        int var11_int = 0;
        gj var11 = null;
        int var13 = 0;
        kv var14 = null;
        rk[] var15 = null;
        int var2Lifetime1;
        int var3_intLifetime1;
        int var4_intLifetime1;
        int var5Lifetime1;
        int var7Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var5Lifetime2;
        var13 = BachelorFridge.field_y;
        try {
          if (ri.field_a != 57 &&
            ri.field_a != 58) {
            var1 = null;
            if (param0 > -30) {
              field_l = (sna) null;
            }
            if (vs.field_d) {
              var1 = dj.field_c;
            } else {
              if (gja.field_n) {
                var1 = sna.field_fb;
              }
            }
            if (var1 == null) {
              return false;
            }
            if (ri.field_a == 73) {
              ((gj) (var1)).field_h.a(-2, ig.field_m);
              ((gj) (var1)).l(-67);
              ((gj) (var1)).d((byte) 77);
              return true;
            }
            if (ri.field_a == 74) {
              ((gj) (var1)).field_h.a(dw.field_f, true, ig.field_m);
              if (!((gj) (var1)).field_h.field_U.e(12917)) {
                ((gj) (var1)).field_g = ((cj) (((gj) (var1)).field_h.field_U.a(6))).field_j;
              }
              ((gj) (var1)).field_m = false;
              ((gj) (var1)).b((byte) -117);
              ((gj) (var1)).field_cb = false;
              ((gj) (var1)).field_e.a((byte) 75);
              return true;
            }
            if (ri.field_a == 60) {
              if (var1 != null) {
                var2 = ig.field_m.e((byte) 66);
                stackIn_45_0 = (ig.field_m.b(16711935) != 1) ? 0 : 1;
                var3_int = stackIn_45_0;
                var4_int = ig.field_m.b(true);
                var5 = ig.field_m.b(16711935);
                var6 = ig.field_m.e((byte) 127);
                if (0 == ((gj) (var1)).field_h.field_A) {
                  stackIn_51_0 = (0 != var2) ? 1 : 0;
                } else {
                  stackIn_51_0 = 0;
                }
                var7 = stackIn_51_0;
                ((gj) (var1)).field_h.a(var2, -16292, var3_int != 0);
                ((gj) (var1)).field_h.field_Q = var5;
                ((gj) (var1)).field_h.field_M = var4_int;
                if (((gj) (var1)).field_h.field_o == 2) {
                  ((gj) (var1)).c(640, var4_int, var5);
                }
                if (var7 != 0) {
                  ((gj) (var1)).l(-68);
                }
                ((gj) (var1)).field_M = 0;
                ((gj) (var1)).field_p = -500 + var6;
                ((gj) (var1)).field_k = var6;
                ((gj) (var1)).field_m = true;
                ((gj) (var1)).field_Y = new sfa[7];
                ((gj) (var1)).field_u = var6;
                if (!((gj) (var1)).field_h.field_N) {
                  ((gj) (var1)).f((byte) 50);
                }
                ((gj) (var1)).m(10);
              }
              return true;
            }
            if (ri.field_a == 61) {
              return true;
            }
            if (75 == ri.field_a) {
              var2Lifetime2 = ig.field_m.e((byte) 121);
              ((gj) (var1)).field_u = var2Lifetime2;
              ((gj) (var1)).field_p = var2Lifetime2 - 500;
              ((gj) (var1)).c(false);
              return true;
            }
            if (ri.field_a == 84) {
              return true;
            }
            if (ri.field_a == 62) {
              var2Lifetime3 = ig.field_m.b(true);
              var3 = ((gj) (var1)).field_h;
              var4 = new tk[var3.field_d];
              for (var5Lifetime2 = 0; var3.field_d > var5Lifetime2; var5Lifetime2++) {
                var4[var5Lifetime2] = ika.a((byte) 85, ig.field_m);
              }
              var3.a(true, var2Lifetime3);
              var3.field_H = var4;
              if (0 == var3.field_A) {
                var14 = (kv) null;
                eq.a((kv) null, (gj) (var1), (byte) -111);
                sia.field_h = false;
                lg.a(true, 3, false);
              }
              return true;
            }
            if (ri.field_a == 63) {
              ((gj) (var1)).field_h.field_h = ig.field_m.b(16711935);
              if (vs.field_d) {
                qi.a((byte) 120);
              }
              return true;
            }
            if (ri.field_a == 64) {
              ((gj) (var1)).field_h.field_v = ig.field_m.b(16711935);
              return true;
            }
            if (ri.field_a == 65) {
              ((gj) (var1)).field_h.field_s = ig.field_m.b(16711935);
              return true;
            }
            if (ri.field_a == 66) {
              ((gj) (var1)).field_h.field_f = ig.field_m.b(16711935);
              if (vs.field_d) {
                hia.c((byte) -109);
              }
              return true;
            }
            if (ri.field_a != 67) {
              return false;
            }
            ((gj) (var1)).field_V = ig.field_m.b(16711935);
            if (vs.field_d) {
              hia.c((byte) -122);
            }
            return true;
          }
          baa.e(17035);
          hba.a(true, wha.field_a);
          gs.field_f = null;
          var1_int = ig.field_m.b(16711935);
          var2Lifetime1 = ig.field_m.b(16711935);
          var3_intLifetime1 = ig.field_m.b(16711935);
          var4_intLifetime1 = ig.field_m.b(16711935);
          var5Lifetime1 = ig.field_m.b(16711935);
          var6_ref_String__ = new String[ig.field_m.b(16711935)];
          var7Lifetime1 = ig.field_m.b(true);
          for (var8_int = 0; var6_ref_String__.length > var8_int; var8_int++) {
            var6_ref_String__[var8_int] = ig.field_m.i(0);
          }
          var8 = new op(var1_int, var2Lifetime1, var3_intLifetime1, var4_intLifetime1, var5Lifetime1, var6_ref_String__);
          var9 = ig.field_m.e((byte) 80);
          var8.a(-2, ig.field_m);
          var10 = null;
          if (var8.field_A == 0 &&
            var7Lifetime1 >= 0) {
            var11_int = ig.field_m.b(16711935);
            var15 = new rk[var11_int];
            var10 = var15;
            for (var12 = 0; var12 < var11_int; var12++) {
              var15[var12] = gka.a(ig.field_m, 255);
            }
          }
          var11 = new gj(var8, var7Lifetime1, (rk[]) (var10), true);
          var11.field_g = ig.field_m.f(51);
          if (var8.field_A != 0) {
            ala.a(26219, iq.field_m);
            var11.l(-60);
            var11.field_k = var9;
            var11.field_p = -500 + var9;
            var11.field_u = var9;
            var11.field_m = true;
          }
          var11.n(-57);
          if (ri.field_a == 57) {
            vs.field_d = true;
            dj.field_c = var11;
            hia.c((byte) -119);
            qi.a((byte) 122);
            dna.f((byte) -12);
          } else {
            sna.field_fb = var11;
            gja.field_n = true;
          }
          pha.field_a = false;
          sia.field_h = true;
          kaa.field_m = -1;
          dh.a((byte) 58, var2Lifetime1);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) (var1), "lfa.D(" + param0 + ')');
        }
    }

    final static void a(int param0, ht param1, boolean param2, byte param3, jp param4, java.awt.Component param5) {
        try {
          if (param3 <= 25) {
            java.awt.Component var7 = (java.awt.Component) null;
            lfa.a(93, (ht) null, true, (byte) 13, (jp) null, (java.awt.Component) null);
          }
          efa.a(param0, param0, 1024, param2, param1, 19299, param5, param4);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "lfa.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final void d(byte param0) {
        gea.a(4231);
        if (param0 != -68) {
          lu var3 = (lu) null;
          this.a((byte) -6, (lu) null, -101);
        }
    }

    final int[] a(int param0, int param1) {
        int var5 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int[] stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int stackIn_34_2 = 0;
        int[] var3;
        int var4;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int[] var12;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        var11 = BachelorFridge.field_y;
        if (param1 != 0) {
          return (int[]) null;
        }
        var12 = this.field_j.a(param0, -1);
        var3 = var12;
        if (this.field_j.field_m) {
          var4 = tj.field_f[param0] - 2048;
          for (var5 = 0; hh.field_d > var5; var5++) {
            var6 = -2048 + jq.field_k[var5];
            var7 = var6 + this.field_v;
            if (var7 >= -2048) {
              stackIn_9_0 = var7;
            } else {
              stackIn_9_0 = 4096 + var7;
            }
            var7Lifetime1 = stackIn_9_0;
            if (var7Lifetime1 <= 2048) {
              stackIn_12_0 = var7Lifetime1;
            } else {
              stackIn_12_0 = var7Lifetime1 - 4096;
            }
            var7Lifetime2 = stackIn_12_0;
            var8 = this.field_t + var4;
            if (var8 < -2048) {
              stackIn_15_0 = 4096 + var8;
            } else {
              stackIn_15_0 = var8;
            }
            var8Lifetime1 = stackIn_15_0;
            if (2048 < var8Lifetime1) {
              stackIn_18_0 = var8Lifetime1 - 4096;
            } else {
              stackIn_18_0 = var8Lifetime1;
            }
            var8Lifetime2 = stackIn_18_0;
            var9 = this.field_k + var6;
            if (-2048 > var9) {
              stackIn_21_0 = var9 + 4096;
            } else {
              stackIn_21_0 = var9;
            }
            var9Lifetime1 = stackIn_21_0;
            if (2048 >= var9Lifetime1) {
              stackIn_24_0 = var9Lifetime1;
            } else {
              stackIn_24_0 = -4096 + var9Lifetime1;
            }
            var9Lifetime2 = stackIn_24_0;
            var10 = this.field_r + var4;
            if (var10 >= -2048) {
              stackIn_27_0 = var10;
            } else {
              stackIn_27_0 = 4096 + var10;
            }
            var10Lifetime1 = stackIn_27_0;
            if (2048 >= var10Lifetime1) {
              stackIn_30_0 = var10Lifetime1;
            } else {
              stackIn_30_0 = var10Lifetime1 - 4096;
            }
            var10Lifetime2 = stackIn_30_0;
            stackIn_33_0 = var12;
            stackIn_33_1 = var5;
            if (!this.b(0, var8Lifetime2, var7Lifetime2) &&
              !this.a(var10Lifetime2, var9Lifetime2, -106)) {
              stackIn_34_2 = 0;
            } else {
              stackIn_34_2 = 4096;
            }
            stackIn_33_0[stackIn_33_1] = stackIn_34_2;
          }
        }
        return var12;
    }

    public lfa() {
        super(0, true);
        this.field_m = 4096;
        this.field_t = 0;
        this.field_k = 0;
        this.field_r = 2048;
        this.field_p = 8192;
        this.field_v = 2048;
        this.field_n = 12288;
    }

    final void a(byte param0, lu param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = BachelorFridge.field_y;
        try {
          if (param0 != -71) {
            this.field_v = -29;
          }
          var4_int = param2;
          if (var4_int == 0) {
            this.field_v = param1.e((byte) 83);
          } else {
            if (var4_int == 1) {
              this.field_t = param1.e((byte) 102);
            } else {
              if (var4_int == 2) {
                this.field_k = param1.e((byte) 115);
              } else {
                if (var4_int == 3) {
                  this.field_r = param1.e((byte) 67);
                } else {
                  if (var4_int == 4) {
                    this.field_n = param1.e((byte) 45);
                  } else {
                    if (var4_int == 5) {
                      this.field_m = param1.e((byte) 118);
                    } else {
                      if (6 == var4_int) {
                        this.field_p = param1.e((byte) 70);
                      }
                    }
                  }
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("lfa.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(')').toString());
        }
    }

    private final boolean a(int param0, int param1, int param2) {
        int var4;
        int var5;
        lu var6;
        boolean stackIn_6_0 = false;
        var4 = this.field_n * (param0 + param1) >> 12;
        var5 = am.field_R[255 & var4 * 255 >> 12];
        var5 = (var5 << 12) / this.field_n;
        if (param2 > -29) {
          var6 = (lu) null;
          this.a((byte) -2, (lu) null, 90);
        }
        var5 = (var5 << 12) / this.field_p;
        var5 = this.field_m * var5 >> 12;
        stackIn_6_0 = (var5 > param0 - param1) && (-var5 < -param1 + param0);
        return stackIn_6_0;
    }

    static {
        field_o = 10;
    }
}
