/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf {
    short[] field_J;
    byte[] field_n;
    static int field_w;
    int[] field_l;
    int[] field_d;
    short[] field_i;
    short[] field_B;
    short[] field_M;
    int[] field_x;
    short[] field_z;
    byte field_v;
    int field_Q;
    int[] field_y;
    int field_N;
    int[] field_p;
    int[] field_a;
    short[] field_e;
    short[] field_u;
    short[] field_K;
    short[] field_O;
    short field_f;
    static int field_A;
    int[] field_b;
    private boolean field_D;
    int[] field_L;
    short[] field_c;
    short[] field_P;
    short[] field_r;
    int[] field_C;
    static String field_E;
    short[] field_h;
    int field_H;
    short[] field_G;
    short field_m;
    short[] field_g;
    short[] field_t;
    static tf field_j;
    int field_s;
    short[] field_k;
    int field_I;
    int field_F;
    short[] field_q;
    short field_o;

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        int var6 = 0;
        int var7 = Geoblox.field_C;
        for (var6 = 0; var6 < ((nf) this).field_o; var6++) {
            ((nf) this).field_O[var6] = (short)(param3 * ((nf) this).field_O[var6] / param1);
            ((nf) this).field_q[var6] = (short)(((nf) this).field_q[var6] * param0 / param1);
            ((nf) this).field_K[var6] = (short)(((nf) this).field_K[var6] * param4 / param1);
        }
        if (param2 <= 69) {
            nf.a(-90, 1, 93);
        }
        int discarded$0 = -7008;
        this.a();
    }

    final static int c() {
        return qi.b(ag.field_k, 1);
    }

    public static void b() {
        field_j = null;
        field_E = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = Geoblox.field_C;
        for (var5 = 0; ((nf) this).field_o > var5; var5++) {
            ((nf) this).field_O[var5] = (short)(((nf) this).field_O[var5] + param0);
            ((nf) this).field_q[var5] = (short)(((nf) this).field_q[var5] + param1);
            ((nf) this).field_K[var5] = (short)(((nf) this).field_K[var5] + param3);
        }
        int discarded$0 = -7008;
        this.a();
        if (param2 != -9121) {
            ((nf) this).field_g = null;
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Geoblox.field_C;
        if (((nf) this).field_D) {
          return;
        } else {
          ((nf) this).field_D = true;
          var2 = 32767;
          var3 = 32767;
          var4 = 32767;
          var5 = -32768;
          var6 = -32768;
          var7 = -32768;
          var8 = 0;
          L0: while (true) {
            if (((nf) this).field_o <= var8) {
              L1: {
                ((nf) this).field_H = var6;
                ((nf) this).field_s = var3;
                ((nf) this).field_F = var4;
                ((nf) this).field_I = var5;
                if (param0 == -99) {
                  break L1;
                } else {
                  ((nf) this).field_K = null;
                  break L1;
                }
              }
              ((nf) this).field_Q = var2;
              ((nf) this).field_N = var7;
              return;
            } else {
              L2: {
                var9 = ((nf) this).field_O[var8];
                var10 = ((nf) this).field_q[var8];
                if (var10 < var3) {
                  var3 = var10;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (var6 >= var10) {
                  break L3;
                } else {
                  var6 = var10;
                  break L3;
                }
              }
              L4: {
                var11 = ((nf) this).field_K[var8];
                if (var9 < var2) {
                  var2 = var9;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (var9 <= var5) {
                  break L5;
                } else {
                  var5 = var9;
                  break L5;
                }
              }
              L6: {
                if (var11 <= var7) {
                  break L6;
                } else {
                  var7 = var11;
                  break L6;
                }
              }
              if (var4 > var11) {
                var4 = var11;
                var8++;
                continue L0;
              } else {
                var8++;
                continue L0;
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2) {
        L0: {
          L1: {
            if (hb.field_l == null) {
              break L1;
            } else {
              if (hb.field_l.length >= param2) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          hb.field_l = new int[param2 * 2];
          break L0;
        }
        L2: {
          L3: {
            if (null == hg.field_a) {
              break L3;
            } else {
              if (param2 <= hg.field_a.length) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          hg.field_a = new int[param2 * 2];
          break L2;
        }
        L4: {
          L5: {
            if (null == fb.field_m) {
              break L5;
            } else {
              if (fb.field_m.length >= param2) {
                break L4;
              } else {
                break L5;
              }
            }
          }
          fb.field_m = new int[param2 * 2];
          break L4;
        }
        L6: {
          L7: {
            if (null == k.field_i) {
              break L7;
            } else {
              if (param2 > k.field_i.length) {
                break L7;
              } else {
                break L6;
              }
            }
          }
          k.field_i = new int[param2 * 2];
          break L6;
        }
        L8: {
          L9: {
            if (null == cj.field_b) {
              break L9;
            } else {
              if (cj.field_b.length < param2) {
                break L9;
              } else {
                break L8;
              }
            }
          }
          cj.field_b = new int[2 * param2];
          break L8;
        }
        L10: {
          L11: {
            if (null == gk.field_a) {
              break L11;
            } else {
              if (gk.field_a.length < param2) {
                break L11;
              } else {
                break L10;
              }
            }
          }
          gk.field_a = new int[param2 * 2];
          break L10;
        }
        L12: {
          L13: {
            if (null == qi.field_i) {
              break L13;
            } else {
              if (qi.field_i.length >= param2 + param1) {
                break L12;
              } else {
                break L13;
              }
            }
          }
          qi.field_i = new int[(param2 + param1) * 2];
          break L12;
        }
        L14: {
          L15: {
            if (null == qh.field_C) {
              break L15;
            } else {
              if (qh.field_C.length < param2) {
                break L15;
              } else {
                break L14;
              }
            }
          }
          qh.field_C = new boolean[2 * param2];
          break L14;
        }
        md.field_c = 0;
        va.field_b = -2147483648;
        ok.field_b = 2147483647;
        bd.field_a = -2147483648;
        qg.field_a = param0;
    }

    final static dm[] b(int param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        dm[] var1 = new dm[sb.field_a];
        for (var2 = 0; sb.field_a > var2; var2++) {
            var3 = hl.field_K[var2] * rc.field_j[var2];
            var4 = mj.field_a[var2];
            var5 = new int[var3];
            for (var6 = 0; var6 < var3; var6++) {
                var5[var6] = cm.field_j[cd.a((int) var4[var6], 255)];
            }
            var1[var2] = new dm(pg.field_b, dd.field_C, gh.field_m[var2], md.field_e[var2], rc.field_j[var2], hl.field_K[var2], var5);
        }
        kj.c(true);
        return var1;
    }

    final static boolean a(boolean param0) {
        if (!(p.field_k != -1)) {
            if (!el.b(30000, 1)) {
                return false;
            }
            p.field_k = eh.field_d.c((byte) 34);
            eh.field_d.field_f = 0;
        }
        if (p.field_k == -2) {
            if (!(el.b(30000, 2))) {
                return false;
            }
            p.field_k = eh.field_d.b(true);
            eh.field_d.field_f = 0;
        }
        return el.b(30000, p.field_k);
    }

    private final void a() {
        ((nf) this).field_D = false;
    }

    nf() {
        ((nf) this).field_D = false;
        ((nf) this).field_v = (byte) 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "Reload game";
        field_j = new tf();
    }
}
