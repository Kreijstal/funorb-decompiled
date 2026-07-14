/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vo extends bn {
    int field_z;
    private int field_D;
    int field_B;
    int field_w;
    int field_y;
    static mh field_C;
    static int field_x;
    private int field_E;
    static int[] field_v;
    static String field_G;
    int field_F;
    int field_H;
    static int field_A;

    public static void e(int param0) {
        field_C = null;
        int var1 = -6 / ((param0 - -5) / 47);
        field_G = null;
        field_v = null;
    }

    vo(int param0, int param1, int param2, int param3) {
        super(0, param1, 0, 0, 22528, 3840, 0);
        ((vo) this).field_D = 1;
        ((vo) this).field_y = param3;
        ((vo) this).field_E = param0;
        ((vo) this).field_B = param2;
        ((vo) this).f(0);
    }

    final int a(int param0, StringBuilder param1) {
        int var3 = 0;
        L0: {
          var3 = super.a(105, param1) ^ 1381323349;
          if (param1 != null) {
            StringBuilder discarded$4 = param1.append("base checksum for paddle: " + Integer.toString(var3, 16) + "\n");
            StringBuilder discarded$5 = param1.append(((vo) this).field_j + " " + ((vo) this).field_m + " " + ((vo) this).field_k + " " + ((vo) this).field_o + " " + " " + ((vo) this).field_i + " " + ((vo) this).field_l + "\n");
            StringBuilder discarded$6 = param1.append(((vo) this).field_B + " " + ((vo) this).field_y + " " + ((vo) this).field_E + " " + ((vo) this).field_F + " " + " " + ((vo) this).field_w + " " + ((vo) this).field_z + "\n");
            StringBuilder discarded$7 = param1.append(((vo) this).field_D + " " + ((vo) this).field_H + "\n");
            break L0;
          } else {
            break L0;
          }
        }
        var3 = var3 ^ (((vo) this).field_y * 41 << -666628187) + (((vo) this).field_B * 37 << 242736641);
        var3 = var3 + (64175 + ((vo) this).field_E * 11);
        var3 = var3 ^ 51 + ((vo) this).field_F * 31 << -424349706;
        var3 = var3 ^ 85 + ((vo) this).field_w * 59 << 205541995;
        if (param0 <= 79) {
          ((vo) this).field_w = 12;
          var3 = var3 + (((vo) this).field_z * 29 << 819991034);
          var3 = var3 ^ 10 + 13 * ((vo) this).field_D << -1418890980;
          var3 = var3 ^ ((vo) this).field_H * 83 + 45050 << -1950853534;
          return var3;
        } else {
          var3 = var3 + (((vo) this).field_z * 29 << 819991034);
          var3 = var3 ^ 10 + 13 * ((vo) this).field_D << -1418890980;
          var3 = var3 ^ ((vo) this).field_H * 83 + 45050 << -1950853534;
          return var3;
        }
    }

    final static void a(int param0, boolean param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          if (null == no.field_p) {
            break L0;
          } else {
            var3 = no.field_p.b(param1, 8421504);
            if (-2 != var3) {
              L1: {
                if (var3 == -1) {
                  break L1;
                } else {
                  var4 = no.field_p.j(72) ? 1 : 0;
                  oc.a(var3, param0, no.field_p.field_Wb, 1, var4 != 0, no.field_p.h(107));
                  break L1;
                }
              }
              no.field_p = null;
              cr.f((byte) -124);
              break L0;
            } else {
              if (param2 > 69) {
                return;
              } else {
                field_v = null;
                return;
              }
            }
          }
        }
        if (param2 <= 69) {
          field_v = null;
          return;
        } else {
          return;
        }
    }

    final void b(boolean param0) {
        if (-9 == (((vo) this).field_D ^ -1)) {
          return;
        } else {
          L0: {
            ((vo) this).field_D = ((vo) this).field_D + 1;
            if (param0) {
              break L0;
            } else {
              field_C = null;
              break L0;
            }
          }
          return;
        }
    }

    final void a(byte param0, j param1, no param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        vn var14 = null;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackOut_6_0;
        int stackOut_8_0;
        int stackOut_8_1;
        int stackOut_7_0;
        int stackOut_7_1;
        var13 = BrickABrac.field_J ? 1 : 0;
        super.a(param0, param1, param2);
        var14 = (vn) (Object) param2;
        var14.field_I = 0;
        var14.field_C = var14.field_C + 1;
        if ((sh.field_a ^ -1) != -2) {
          if (-3 != (sh.field_a ^ -1)) {
            param2.field_k = -param2.field_k;
            var5 = (((vo) this).field_k - param2.field_k) * mn.field_A;
            if (-1 < (var5 ^ -1)) {
              param2.field_k = ((vo) this).field_k;
              return;
            } else {
              return;
            }
          } else {
            param2.field_o = -param2.field_o;
            return;
          }
        } else {
          L0: {
            var5 = kj.a(-w.b(param2.field_k, -param2.field_k, 93) + -w.b(param2.field_o, -param2.field_o, 114) << 625384232, param0 + -51) >> 1312232584;
            var6 = ((vo) this).field_D * 16 + var5;
            if (3840 < var6) {
              var6 = 3840;
              break L0;
            } else {
              break L0;
            }
          }
          var7 = 43520;
          var8 = param2.field_j + param2.field_u - (((vo) this).field_j + (((vo) this).field_u >> 1185040929));
          var9 = -kj.a(w.b(var8, -var8, 113) + -w.b(var7, -var7, 111) << -216406360, 2);
          var9 = var9 / var7;
          var8 = (var8 << 2083949576) / var7;
          var10 = param2.field_o * var9 + var8 * param2.field_k >> -282378105;
          var11 = -(var8 * var10 >> 1655339144) + (param2.field_k - -8) - param1.a(16, (byte) 62);
          var12 = -(var10 * var9 >> -715940696) + (param2.field_o + (-param1.a(16, (byte) 62) + 8));
          if (-1 != var11) {
            L1: {
              stackOut_6_0 = 341;
              stackIn_8_0 = stackOut_6_0;
              stackIn_7_0 = stackOut_6_0;
              if (-1 >= var12 * var11) {
                stackOut_8_0 = stackIn_8_0;
                stackOut_8_1 = -((var12 << 1266019560) / var11) << 2124432360;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                break L1;
              } else {
                stackOut_7_0 = stackIn_7_0;
                stackOut_7_1 = (var12 << 1408298216) / var11 << 1033738024;
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                break L1;
              }
            }
            if (stackIn_9_0 >= nk.a(stackIn_9_1, 30922)) {
              param2.field_o = -param2.field_o;
              var5 = kj.a(-w.b(param2.field_k, -param2.field_k, param0 ^ 85) + -w.b(param2.field_o, -param2.field_o, 95) << -611909240, param0 ^ 55) >> -449298264;
              param2.field_k = var6 * param2.field_k / var5;
              param2.field_o = param2.field_o * var6 / var5;
              return;
            } else {
              param2.field_o = var12;
              param2.field_k = var11;
              var5 = kj.a(-w.b(param2.field_k, -param2.field_k, param0 ^ 85) + -w.b(param2.field_o, -param2.field_o, 95) << -611909240, param0 ^ 55) >> -449298264;
              param2.field_k = var6 * param2.field_k / var5;
              param2.field_o = param2.field_o * var6 / var5;
              return;
            }
          } else {
            param2.field_o = var12;
            param2.field_k = var11;
            var5 = kj.a(-w.b(param2.field_k, -param2.field_k, param0 ^ 85) + -w.b(param2.field_o, -param2.field_o, 95) << -611909240, param0 ^ 55) >> -449298264;
            param2.field_k = var6 * param2.field_k / var5;
            param2.field_o = param2.field_o * var6 / var5;
            return;
          }
        }
    }

    final void f(int param0) {
        ((vo) this).field_D = 1;
        ((vo) this).field_j = ((vo) this).field_E - 11264;
        ((vo) this).field_F = 8;
        ((vo) this).field_u = 22528;
        ((vo) this).field_H = param0;
    }

    final void d(int param0) {
        if (14 == ((vo) this).field_F) {
          return;
        } else {
          if (param0 < 6) {
            return;
          } else {
            ((vo) this).field_j = ((vo) this).field_j - 1536;
            ((vo) this).field_F = ((vo) this).field_F + 2;
            ((vo) this).field_u = ((vo) this).field_u + 3072;
            return;
          }
        }
    }

    final void e(byte param0) {
        int var2 = 0;
        if (-1 == (((vo) this).field_F ^ -1)) {
          return;
        } else {
          ((vo) this).field_u = ((vo) this).field_u - 3072;
          ((vo) this).field_j = ((vo) this).field_j + 1536;
          var2 = 27 / ((74 - param0) / 49);
          ((vo) this).field_F = ((vo) this).field_F - 2;
          return;
        }
    }

    final void a(int param0, wq param1) {
        super.a(94, param1);
        ((vo) this).field_F = param1.l(255);
        if (param0 <= 89) {
          return;
        } else {
          ((vo) this).field_D = 15 & ((vo) this).field_F >> -614297756;
          ((vo) this).field_F = ((vo) this).field_F & 15;
          ((vo) this).field_w = param1.i(65280);
          ((vo) this).field_z = param1.i(65280);
          ((vo) this).field_H = param1.i(65280);
          ((vo) this).field_u = 32 + (6 * ((vo) this).field_F + 8) << 795448776;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "Show players in <%0>'s game";
        field_v = new int[8192];
    }
}
