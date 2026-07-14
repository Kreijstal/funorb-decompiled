/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc {
    int[] field_g;
    int[] field_E;
    byte field_I;
    int[] field_M;
    int field_q;
    short[] field_s;
    int field_N;
    int[] field_A;
    static int field_B;
    short[] field_i;
    short[] field_p;
    short[] field_Q;
    short[] field_v;
    int[] field_D;
    short[] field_a;
    short[] field_u;
    int[] field_e;
    short field_d;
    int[] field_J;
    short[] field_x;
    short[] field_y;
    int[] field_C;
    byte[] field_K;
    short[] field_j;
    int[] field_c;
    short[] field_P;
    short[] field_l;
    static java.applet.Applet field_t;
    short[] field_w;
    int field_n;
    static String field_h;
    private boolean field_G;
    short field_o;
    short[] field_m;
    short[] field_H;
    short[] field_O;
    short[] field_r;
    int field_b;
    int field_F;
    int field_f;
    short field_k;
    short[] field_z;

    private final void b(int param0) {
        if (param0 != 32767) {
            return;
        }
        ((oc) this).field_G = false;
    }

    final static boolean b(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 84) {
            break L0;
          } else {
            field_B = 96;
            break L0;
          }
        }
        L1: {
          L2: {
            if (jd.field_c == null) {
              break L2;
            } else {
              if (!tl.field_J.b(719)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static void d(int param0) {
        nn.field_b = new oo[5];
        nn.field_b[0] = (oo) (Object) new ni();
        nn.field_b[1] = (oo) (Object) new fk();
        nn.field_b[2] = (oo) (Object) new cj();
        nn.field_b[3] = (oo) (Object) new vf();
        if (param0 >= -75) {
            return;
        }
        nn.field_b[4] = (oo) (Object) new gh();
    }

    final static void a(int param0) {
        tn var1 = (tn) (Object) nf.field_S.b(-1);
        if (var1 == null) {
            throw new IllegalStateException();
        }
        qh.a(var1.field_q, var1.field_v, var1.field_l);
        qh.c(var1.field_t, var1.field_s, var1.field_m, var1.field_r);
        if (param0 <= 111) {
            field_t = null;
        }
        var1.field_q = null;
        cb.field_e.b((byte) -23, (ma) (Object) var1);
    }

    public static void c(int param0) {
        if (param0 >= -11) {
            boolean discarded$0 = oc.b((byte) 45);
        }
        field_t = null;
        field_h = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        for (var6 = 0; var6 < ((oc) this).field_k; var6++) {
            ((oc) this).field_m[var6] = (short)(((oc) this).field_m[var6] * param2 / param4);
            ((oc) this).field_s[var6] = (short)(((oc) this).field_s[var6] * param3 / param4);
            ((oc) this).field_l[var6] = (short)(((oc) this).field_l[var6] * param0 / param4);
        }
        this.b(32767);
        if (param1 != 1) {
            ((oc) this).field_e = null;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        for (var5 = param0; ((oc) this).field_k > var5; var5++) {
            ((oc) this).field_m[var5] = (short)(((oc) this).field_m[var5] + param1);
            ((oc) this).field_s[var5] = (short)(((oc) this).field_s[var5] + param3);
            ((oc) this).field_l[var5] = (short)(((oc) this).field_l[var5] + param2);
        }
        this.b(32767);
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
        if (!((oc) this).field_G) {
          L0: {
            ((oc) this).field_G = true;
            var2 = 32767;
            var3 = 32767;
            var4 = 32767;
            if (param0 >= 72) {
              break L0;
            } else {
              ((oc) this).field_P = null;
              break L0;
            }
          }
          var5 = -32768;
          var6 = -32768;
          var7 = -32768;
          var8 = 0;
          L1: while (true) {
            if (var8 >= ((oc) this).field_k) {
              ((oc) this).field_F = var7;
              ((oc) this).field_b = var6;
              ((oc) this).field_q = var5;
              ((oc) this).field_f = var4;
              ((oc) this).field_N = var3;
              ((oc) this).field_n = var2;
              return;
            } else {
              L2: {
                var9 = ((oc) this).field_m[var8];
                var10 = ((oc) this).field_s[var8];
                if (var10 >= var3) {
                  break L2;
                } else {
                  var3 = var10;
                  break L2;
                }
              }
              L3: {
                if (var2 <= var9) {
                  break L3;
                } else {
                  var2 = var9;
                  break L3;
                }
              }
              L4: {
                if (var10 <= var6) {
                  break L4;
                } else {
                  var6 = var10;
                  break L4;
                }
              }
              L5: {
                if (var9 > var5) {
                  var5 = var9;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                var11 = ((oc) this).field_l[var8];
                if (var11 <= var7) {
                  break L6;
                } else {
                  var7 = var11;
                  break L6;
                }
              }
              if (var11 < var4) {
                var4 = var11;
                var8++;
                continue L1;
              } else {
                var8++;
                continue L1;
              }
            }
          }
        } else {
          return;
        }
    }

    oc() {
        ((oc) this).field_I = (byte) 0;
        ((oc) this).field_G = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Suggested names: ";
    }
}
