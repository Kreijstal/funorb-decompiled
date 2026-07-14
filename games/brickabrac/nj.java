/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj extends nm {
    private int field_I;
    static int[] field_G;
    private int[][] field_D;
    static jp[] field_l;
    private int field_k;
    private int field_w;
    private int field_H;
    static jp field_z;
    private int[][] field_m;
    private int field_o;
    private int field_K;
    private int field_j;
    private int field_u;
    private int[] field_y;
    private int[] field_r;
    private int[] field_n;
    private int field_x;
    private int field_N;
    private int[] field_C;
    private int field_t;
    private int[] field_A;
    private int[] field_P;
    private int field_q;
    private int field_E;
    private int field_i;
    static String field_F;
    private int field_J;
    private int field_B;
    private int field_p;
    private int field_s;
    private int field_O;
    static int[] field_v;
    private int field_L;

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = BrickABrac.field_J ? 1 : 0;
          if (((nj) this).field_K <= 0) {
            break L0;
          } else {
            ((nj) this).field_K = ((nj) this).field_K - 1;
            if (((nj) this).field_K - 1 <= 0) {
              break L0;
            } else {
              return;
            }
          }
        }
        var2 = param0;
        L1: while (true) {
          if (var2 >= ((nj) this).field_w) {
            L2: {
              if (((nj) this).field_k <= ((nj) this).field_t) {
                break L2;
              } else {
                ((nj) this).field_j = ((nj) this).field_j + 1;
                break L2;
              }
            }
            L3: {
              if (((nj) this).field_I >= ((nj) this).field_k) {
                break L3;
              } else {
                L4: {
                  if (((nj) this).field_O == 0) {
                    break L4;
                  } else {
                    if (2 * ((nj) this).field_q > ((nj) this).field_k) {
                      break L4;
                    } else {
                      ((nj) this).field_J = ((nj) this).field_J + 1;
                      break L3;
                    }
                  }
                }
                if (((nj) this).field_k % 3 != 0) {
                  break L3;
                } else {
                  ((nj) this).field_J = ((nj) this).field_J + 1;
                  break L3;
                }
              }
            }
            L5: {
              ((nj) this).field_k = ((nj) this).field_k + 1;
              if (((nj) this).field_u != ((nj) this).field_k + 1) {
                break L5;
              } else {
                ((nj) this).b((byte) 111);
                dl.field_f = dl.field_f - 1;
                break L5;
              }
            }
            return;
          } else {
            L6: {
              if (((nj) this).field_k > ((nj) this).field_I) {
                ((nj) this).field_D[var2][((nj) this).field_J] = ((nj) this).field_A[var2];
                ((nj) this).field_m[var2][((nj) this).field_J] = ((nj) this).field_C[var2];
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (((nj) this).field_B > ((nj) this).field_k) {
                ((nj) this).field_r[var2] = ((nj) this).field_r[var2] * 91 / 100;
                ((nj) this).field_y[var2] = ((nj) this).field_y[var2] * 91 / 100;
                break L7;
              } else {
                if (((nj) this).field_k > ((nj) this).field_q) {
                  ((nj) this).field_y[var2] = ((nj) this).field_y[var2] + ((nj) this).field_O;
                  ((nj) this).field_r[var2] = ((nj) this).field_r[var2] + ((nj) this).field_p;
                  if (((nj) this).field_o < ((nj) this).field_k) {
                    L8: {
                      if (-1 == (((nj) this).field_p ^ -1)) {
                        ((nj) this).field_p = ip.field_r.a(-37880252, 3) + -1;
                        break L8;
                      } else {
                        ((nj) this).field_p = -((nj) this).field_p;
                        break L8;
                      }
                    }
                    ((nj) this).field_o = ((nj) this).field_u + 1;
                    break L7;
                  } else {
                    ((nj) this).field_A[var2] = ((nj) this).field_A[var2] + ((nj) this).field_r[var2];
                    ((nj) this).field_C[var2] = ((nj) this).field_C[var2] + ((nj) this).field_y[var2];
                    var2++;
                    continue L1;
                  }
                } else {
                  break L7;
                }
              }
            }
            ((nj) this).field_A[var2] = ((nj) this).field_A[var2] + ((nj) this).field_r[var2];
            ((nj) this).field_C[var2] = ((nj) this).field_C[var2] + ((nj) this).field_y[var2];
            var2++;
            continue L1;
          }
        }
    }

    final void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = BrickABrac.field_J ? 1 : 0;
        if (param0 != -1196049244) {
            nj.a(76);
        }
        if (0 < ((nj) this).field_K) {
            return;
        }
        for (var3 = 0; ((nj) this).field_w > var3; var3++) {
            for (var4 = 0; var4 < ((nj) this).field_J; var4++) {
                lb.a((((nj) this).field_D[var3][var4] >> -1196049244) + param1, ((nj) this).field_m[var3][var4] >> -593133180, 48, -(((nj) this).field_i * ((nj) this).field_j) + 64, eb.field_r[((nj) this).field_P[var3]]);
            }
            lb.a(param1 - -(((nj) this).field_A[var3] >> -2090539484), ((nj) this).field_C[var3] >> -637335740, 224, -(((nj) this).field_j * ((nj) this).field_E) + 165, eb.field_r[((nj) this).field_n[var3]]);
            lb.a((((nj) this).field_A[var3] >> 1009824580) + param1, ((nj) this).field_C[var3] >> -744014204, 64, -(((nj) this).field_x * ((nj) this).field_j) + 250, eb.field_r[((nj) this).field_n[var3]]);
        }
    }

    public static void a(int param0) {
        field_F = null;
        if (param0 != 0) {
            field_F = null;
        }
        field_z = null;
        field_G = null;
        field_l = null;
        field_v = null;
    }

    nj(int param0, int param1, int param2, int param3) {
        int var11 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        ((nj) this).field_H = param1;
        ((nj) this).field_L = param0;
        ((nj) this).field_w = ((nj) this).field_H * ((nj) this).field_L;
        ((nj) this).field_s = param2 << -901864408;
        ((nj) this).field_N = param3 << -60158744;
        ((nj) this).field_K = 30 + ip.field_r.a(-37880252, 30);
        ((nj) this).field_u = 100 - -ip.field_r.a(-37880252, 30);
        ((nj) this).field_I = ip.field_r.a(-37880252, 5) + 12;
        ((nj) this).field_B = 19 - -ip.field_r.a(-37880252, 3);
        ((nj) this).field_q = ip.field_r.a(-37880252, 10) + 25;
        ((nj) this).field_t = ip.field_r.a(-37880252, 15) + 80;
        ((nj) this).field_o = 2 * ip.field_r.a(-37880252, ((nj) this).field_u);
        ((nj) this).field_O = ip.field_r.a(-37880252, 2) << 220150625;
        ((nj) this).field_p = ip.field_r.a(-37880252, 3) + -1;
        ((nj) this).field_D = new int[((nj) this).field_w][((nj) this).field_u];
        ((nj) this).field_y = new int[((nj) this).field_w];
        ((nj) this).field_n = new int[((nj) this).field_w];
        ((nj) this).field_C = new int[((nj) this).field_w];
        ((nj) this).field_A = new int[((nj) this).field_w];
        ((nj) this).field_P = new int[((nj) this).field_w];
        ((nj) this).field_r = new int[((nj) this).field_w];
        ((nj) this).field_m = new int[((nj) this).field_w][((nj) this).field_u];
        int var5 = 0;
        int var6 = ip.field_r.a(-37880252, 64) + 192;
        int var7 = 8192 / ((nj) this).field_H;
        int var8 = 0;
        for (var11 = 0; ((nj) this).field_L > var11; var11++) {
            var9 = ip.field_r.a(-37880252, eb.field_q.length);
            var10 = ip.field_r.a(-37880252, eb.field_q.length);
            for (var12 = 0; ((nj) this).field_H > var12; var12++) {
                var8 = ip.field_r.a(-37880252, 800);
                ((nj) this).field_A[var5] = ((nj) this).field_s - -(ip.field_r.a(-37880252, 4) - 2 << 311394888);
                ((nj) this).field_C[var5] = ((nj) this).field_N + (-2 + ip.field_r.a(-37880252, 4) << 873818952);
                ((nj) this).field_r[var5] = (sa.a(var12 * var7 - -var8, -4097) >> 2098116680) * var6 >> 1885634184;
                ((nj) this).field_y[var5] = var6 * (BrickABrac.c(2048, var8 + var12 * var7) >> -1599398456) >> 1424474376;
                ((nj) this).field_n[var5] = var9;
                ((nj) this).field_P[var5] = var10;
                var5++;
            }
            var6 = var6 + (128 - -ip.field_r.a(-37880252, 64));
        }
        ((nj) this).field_E = 165 / (((nj) this).field_u - ((nj) this).field_t);
        ((nj) this).field_i = 64 / (((nj) this).field_u + -((nj) this).field_t);
        ((nj) this).field_x = 250 / (-((nj) this).field_t + ((nj) this).field_u);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = new int[]{31114, 12658477, 16494651, 26679, 16711935};
        field_F = "Searching for opponents";
        field_v = new int[8192];
    }
}
