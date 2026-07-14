/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ff implements dv {
    int field_k;
    dt[] field_G;
    int field_E;
    hca[] field_H;
    wd[] field_y;
    private int field_r;
    private mt field_d;
    static String field_N;
    int field_L;
    int field_K;
    private int field_O;
    int field_A;
    sma field_e;
    String[] field_l;
    int field_C;
    BitSet[] field_x;
    private int field_o;
    int field_b;
    boolean[] field_I;
    int[] field_v;
    kqa field_c;
    boolean field_h;
    ds field_D;
    private String[] field_J;
    static jpa[] field_j;
    int[] field_g;
    private boolean field_s;
    int field_P;
    long[] field_F;
    private int field_f;
    cfa field_i;
    private boolean[] field_n;
    private boolean[] field_q;
    static int field_w;
    private int field_B;
    int field_z;
    private wea[] field_u;
    private boolean field_M;
    private int field_m;
    private int field_a;
    static iu field_p;
    int field_t;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        la var6 = ((ff) this).field_G[param1].a(true, param0);
        if (var6 == null) {
            throw new IllegalStateException("Could not resync player to room: " + param1 + ", " + param0);
        }
        ((ff) this).field_G[param1].field_c = param3;
        var6.a((byte) 88, param4);
        var6.i((byte) -65);
        if (param2 != 1) {
            ((ff) this).field_k = 37;
        }
    }

    final void b(boolean param0, int param1, int param2) {
        ((ff) this).field_s = false;
        dt var4 = ((ff) this).field_G[param2];
        if (!param0) {
            return;
        }
        var4.m(9262).a(var4, param1, 104);
        if (!(var4.k(-19271))) {
            this.n(121, param2);
        }
    }

    final int i(int param0) {
        if (param0 != 0) {
            ((ff) this).a(68, (byte) -44);
        }
        return ((ff) this).field_r;
    }

    final boolean b(int param0, int param1) {
        if (param1 != 0) {
            ((ff) this).field_n = null;
        }
        return ((ff) this).field_n[param0];
    }

    private final void c(int param0) {
        ((ff) this).c((byte) -89);
        if (param0 != 22640) {
            this.c(96);
        }
    }

    public static void f(int param0) {
        field_N = null;
        field_p = null;
        if (param0 != 0) {
            boolean discarded$0 = ff.h(88);
        }
        field_j = null;
    }

    final boolean a(boolean param0, int param1, int param2) {
        hca var4 = ((ff) this).field_H[param1];
        if (param0) {
            return false;
        }
        la var5 = var4.f((byte) -85);
        if (var5 == null) {
            return true;
        }
        int var6 = var5.c(74);
        if (param2 != var6) {
            if (param2 != var6 - -1) {
                return true;
            }
        }
        return false;
    }

    final void a(boolean param0, la param1) {
        int var3 = 0;
        int var4 = 0;
        la var5 = null;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        if (param0) {
          if (param1.o((byte) -82)) {
            return;
          } else {
            var3 = param1.c(91);
            var4 = 0;
            L0: while (true) {
              if (var4 >= ((ff) this).field_G.length) {
                return;
              } else {
                if (((ff) this).field_G[var4] != null) {
                  var5 = ((ff) this).field_G[var4].a(param0, var3);
                  if (var5 != null) {
                    param1.a(var5, (byte) 126);
                    var4++;
                    continue L0;
                  } else {
                    var4++;
                    continue L0;
                  }
                } else {
                  var4++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final void k(int param0, int param1) {
        ((ff) this).field_o = param0;
        ((ff) this).field_D.a(((ff) this).field_o, false);
        ((ff) this).field_D.a((byte) 74);
        if (!((((ff) this).field_o ^ -1) > param1)) {
            ((ff) this).field_v[((ff) this).field_o] = ((ff) this).field_v[((ff) this).field_o] + 1;
        }
    }

    final int a(String param0, byte param1) {
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        if (param1 <= 62) {
            boolean discarded$0 = ((ff) this).d(-118);
        }
        for (var3 = 0; ((ff) this).field_H.length > var3; var3++) {
            if (!(!faa.a(param0, 109, ((ff) this).field_l[var3]))) {
                return var3;
            }
        }
        return -2;
    }

    final boolean k(int param0) {
        if (param0 != -25319) {
            ((ff) this).field_s = true;
        }
        return ((ff) this).field_K == 2 ? true : false;
    }

    final int b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = TombRacer.field_G ? 1 : 0;
          if (param0 > 54) {
            break L0;
          } else {
            ((ff) this).field_n = null;
            break L0;
          }
        }
        var2 = -1;
        var3 = -1;
        var4 = 0;
        L1: while (true) {
          if (var4 >= ((ff) this).field_H.length) {
            if (var2 < ((ff) this).field_L) {
              return -1;
            } else {
              return var3;
            }
          } else {
            L2: {
              var5 = ((ff) this).field_v[var4];
              if (-1 == var3) {
                break L2;
              } else {
                if (var5 > var2) {
                  break L2;
                } else {
                  var4++;
                  continue L1;
                }
              }
            }
            var2 = var5;
            var3 = var4;
            var4++;
            continue L1;
          }
        }
    }

    final void h(int param0, int param1) {
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        if (param1 <= 45) {
            return;
        }
        for (var3 = 0; ((ff) this).field_H.length > var3; var3++) {
            ((ff) this).field_G[var3].d(119, param0);
        }
    }

    final la a(int param0, int param1) {
        if (param0 != 0) {
            ((ff) this).field_A = -127;
        }
        return ((ff) this).field_H[param1].f((byte) 106);
    }

    final void d(byte param0, int param1) {
        if (!((ff) this).f((byte) -107, param1)) {
            if (!(!((ff) this).l(13, param1))) {
                return;
            }
            ((ff) this).field_m = ((ff) this).field_m | 1 << param1;
            this.n(38, param1);
            int var3 = 27 / ((51 - param0) / 43);
            ((ff) this).field_P = ((ff) this).field_P - 1;
            return;
        }
    }

    private final void n(int param0, int param1) {
        ((ff) this).field_q[param1] = true;
        if (param0 < 29) {
            ((ff) this).a(-104, 79, -8, 3, -72);
        }
    }

    public final void a(kh param0, boolean param1) {
        L0: {
          ((ff) this).field_h = uha.a(5907, param0);
          ((ff) this).field_z = uma.a(32, param0, -26803);
          ((ff) this).field_A = param0.b((byte) 44, 32);
          ((ff) this).field_C = param0.b((byte) 44, 32);
          ((ff) this).field_y = (wd[]) (Object) gha.a((mva[]) (Object) ((ff) this).field_y, 1, 8, -16499, nfa.field_q, param0);
          ((ff) this).field_u = (wea[]) (Object) gha.a((mva[]) (Object) ((ff) this).field_u, 1, 8, -16499, kba.field_u, param0);
          ((ff) this).field_v = fa.a(0, param0, 8, ((ff) this).field_v);
          ((ff) this).field_o = uma.a(32, param0, -26803);
          ((ff) this).field_q = c.a(8, ((ff) this).field_q, (byte) 93, param0);
          ((ff) this).field_P = param0.b((byte) 44, 32);
          ((ff) this).field_s = uha.a(5907, param0);
          if (!uha.a(5907, param0)) {
            ((ff) this).field_i = null;
            break L0;
          } else {
            if (null == ((ff) this).field_i) {
              ((ff) this).field_i = new cfa();
              ((ff) this).field_i.a(param0, false);
              break L0;
            } else {
              ((ff) this).field_i.a(param0, false);
              break L0;
            }
          }
        }
        ((ff) this).field_E = uma.a(32, param0, -26803);
        ((ff) this).field_I = c.a(8, ((ff) this).field_I, (byte) -41, param0);
        if (!param1) {
          this.c(22640);
          return;
        } else {
          return;
        }
    }

    final static void d(int param0, int param1) {
        if (msa.field_a == param1) {
            if (!(null != rba.field_a)) {
                return;
            }
            if (param0 != 0) {
                return;
            }
            aoa.a(108, 13);
            aoa.a(84, 14);
            aoa.a(43, 15);
            return;
        }
    }

    final boolean b(int param0) {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        for (var2 = param0; var2 < ((ff) this).field_H.length; var2++) {
            if (!((ff) this).field_q[var2]) {
                return false;
            }
        }
        return true;
    }

    final String e(int param0, int param1) {
        if (param1 != 23807) {
            return null;
        }
        if (-1 < (param0 ^ -1)) {
            return dpa.field_c;
        }
        return ((ff) this).field_J[param0];
    }

    final boolean j(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -1878) {
            break L0;
          } else {
            int discarded$2 = ((ff) this).i(-41, -61);
            break L0;
          }
        }
        L1: {
          L2: {
            if (-2 != ((ff) this).field_k) {
              break L2;
            } else {
              if (-3 == ((ff) this).field_K) {
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

    final boolean e(byte param0, int param1) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 < -56) {
            break L0;
          } else {
            ((ff) this).c((byte) 52);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((ff) this).f((byte) -102, param1)) {
              break L2;
            } else {
              if (!((ff) this).field_G[param1].e(-31170)) {
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

    final static boolean h(int param0) {
        if (param0 != 1) {
            field_w = 88;
        }
        return du.field_e;
    }

    final void a(byte param0) {
        if (((ff) this).field_z < 0) {
            ((ff) this).field_A = ((ff) this).field_A + 1;
            ((ff) this).field_C = ((ff) this).field_A + (((ff) this).field_f + 1);
            ((ff) this).field_D.a((byte) 108);
            ((ff) this).c((byte) -89);
        }
        int var2 = -128 % ((80 - param0) / 37);
        ((ff) this).field_o = -1;
        ((ff) this).field_s = true;
    }

    final boolean g(int param0, int param1) {
        if (param0 < 68) {
            return false;
        }
        return -1 > (1 << param1 & ((ff) this).field_t ^ -1) ? true : false;
    }

    final boolean g(int param0) {
        if (param0 != 0) {
            boolean discarded$0 = ((ff) this).k(37);
        }
        return ((ff) this).field_s;
    }

    final dda a(boolean param0, int param1) {
        if (!param0) {
            return null;
        }
        return ((ff) this).field_G[param1].m(9262).a(104);
    }

    final void m(int param0, int param1) {
        if (!((ff) this).f((byte) -82, param1)) {
            if (!(!((ff) this).l(13, param1))) {
                return;
            }
            ((ff) this).field_B = ((ff) this).field_B | param0 << param1;
            this.n(40, param1);
            ((ff) this).field_P = ((ff) this).field_P - 1;
            return;
        }
    }

    final boolean a(int param0) {
        int var3 = 0;
        wd var5 = null;
        int var6 = TombRacer.field_G ? 1 : 0;
        wd[] var7 = ((ff) this).field_y;
        wd[] var2 = var7;
        int var4 = -71 % ((param0 - -68) / 44);
        for (var3 = 0; var3 < var7.length; var3++) {
            var5 = var7[var3];
            if ((var5.b(56) ^ -1) == 0) {
                return false;
            }
        }
        return true;
    }

    final void a(int param0, byte param1) {
        ((ff) this).field_z = param0;
        ((ff) this).field_h = true;
        if (param1 <= 100) {
            ((ff) this).field_C = 80;
        }
    }

    final int i(int param0, int param1) {
        if (param0 != 1) {
            ((ff) this).a(21, (byte) 42);
        }
        return ((ff) this).field_H[param1].f((byte) 87).c(-79);
    }

    final boolean l(int param0, int param1) {
        if (param0 != 13) {
            ((ff) this).field_C = -75;
        }
        return (1 << param1 & ((ff) this).field_m) > 0 ? true : false;
    }

    private final void a(byte param0, int param1) {
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        int var4 = 16 % ((54 - param0) / 35);
        tu var7 = ((ff) this).field_d.a((ff) this, -25077);
        tu var3 = var7;
        ((ff) this).field_G[param1] = new dt((eha) (Object) var7, ((ff) this).field_H[param1], ((ff) this).field_O, ((ff) this).field_a);
        for (var5 = 0; ((ff) this).field_G[param1].l(-106) > var5; var5++) {
            ((ff) this).field_G[param1].a(-28088, var5, ((ff) this).field_u[((ff) this).field_A].a(1024, var5, ((ff) this).field_C, ((ff) this).field_G[param1]));
        }
    }

    final boolean b(byte param0, int param1) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 90) {
            break L0;
          } else {
            ((ff) this).field_m = 124;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((ff) this).f((byte) -91, param1)) {
              break L2;
            } else {
              if (!((ff) this).field_G[param1].b(param0 + -90)) {
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

    final boolean f(byte param0, int param1) {
        if (param0 > -73) {
            ((ff) this).field_O = 117;
        }
        return (1 << param1 & ((ff) this).field_B) > 0 ? true : false;
    }

    final boolean a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = TombRacer.field_G ? 1 : 0;
          var3 = 0;
          if (param1) {
            break L0;
          } else {
            field_w = -127;
            break L0;
          }
        }
        L1: while (true) {
          if (((ff) this).field_k <= var3) {
            return true;
          } else {
            if (var3 != param0) {
              if (!((ff) this).f((byte) -122, var3)) {
                return false;
              } else {
                var3++;
                continue L1;
              }
            } else {
              var3++;
              continue L1;
            }
          }
        }
    }

    final String c(int param0, int param1) {
        if (param1 > param0) {
            return dpa.field_c;
        }
        return ((ff) this).field_l[param0];
    }

    final int j(int param0, int param1) {
        if (param0 != 0) {
            ((ff) this).field_a = 20;
        }
        return dna.b(((ff) this).field_G[param1].a(true), 255);
    }

    final dt f(int param0, int param1) {
        if (param0 < param1) {
            return null;
        }
        return ((ff) this).field_G[param0];
    }

    final void a(byte param0, pi param1) {
        if (param0 <= 14) {
            int discarded$0 = ((ff) this).b((byte) -115);
        }
        dt var3 = ((ff) this).field_G[param1.a(3)];
        var3.m(9262).a(var3, param1, false);
    }

    final int c(byte param0, int param1) {
        if (param0 != 115) {
            String discarded$0 = ((ff) this).e(-62, 55);
        }
        return ((ff) this).field_G[param1].field_c;
    }

    final boolean d(int param0) {
        if (param0 > -61) {
            ((ff) this).field_z = -104;
        }
        return ((ff) this).field_M;
    }

    final void c(byte param0) {
        int var2 = 0;
        la var3 = null;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (var2 >= ((ff) this).field_G.length) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= ((ff) this).field_G.length) {
                ((ff) this).field_c.a(false);
                var2 = 0;
                if (param0 == -89) {
                  L2: while (true) {
                    if (var2 >= ((ff) this).field_q.length) {
                      L3: {
                        if (0 == ((ff) this).field_K) {
                          ((ff) this).field_i = new cfa((ff) this);
                          ((ff) this).field_i.b(param0 + 28713);
                          ((ff) this).field_E = 0;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      return;
                    } else {
                      ((ff) this).field_q[var2] = ((ff) this).f((byte) -81, var2);
                      var2++;
                      continue L2;
                    }
                  }
                } else {
                  return;
                }
              } else {
                var3 = ((ff) this).field_G[var2].a(-88);
                if (var3 != null) {
                  var3.i((byte) -89);
                  var2++;
                  continue L1;
                } else {
                  var2++;
                  continue L1;
                }
              }
            }
          } else {
            ((ff) this).field_H[var2].t((byte) 126);
            this.a((byte) -36, var2);
            var2++;
            continue L0;
          }
        }
    }

    final int e(int param0) {
        if (param0 != 2) {
            return 69;
        }
        return ((ff) this).field_o;
    }

    final boolean d(byte param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 >= 57) {
          L0: {
            L1: {
              if (((ff) this).field_K == 0) {
                break L1;
              } else {
                if (((ff) this).field_K != 2) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = 1;
            stackIn_7_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return true;
        }
    }

    ff(String[] param0, int param1, int param2, int param3, int param4, int param5, int param6, BitSet[] param7, boolean[] param8, mt param9, ou param10) {
        int var12 = 0;
        int var13 = 0;
        L0: {
          ((ff) this).field_s = true;
          ((ff) this).field_z = -1;
          ((ff) this).field_E = -1;
          ((ff) this).field_L = param4;
          ((ff) this).field_d = param9;
          ((ff) this).field_l = param0;
          ((ff) this).field_K = param5;
          if (param10 == null) {
            break L0;
          } else {
            L1: {
              if (((ff) this).field_K != 0) {
                var12 = 1;
                break L1;
              } else {
                var12 = ((ff) this).field_l.length * (-1 + param4) - -1;
                break L1;
              }
            }
            ((ff) this).field_u = new wea[var12];
            var13 = 0;
            L2: while (true) {
              if (var13 >= var12) {
                break L0;
              } else {
                ((ff) this).field_u[var13] = param10.a((byte) 58);
                var13++;
                continue L2;
              }
            }
          }
        }
        ((ff) this).field_J = new String[((ff) this).field_l.length];
        var12 = 0;
        L3: while (true) {
          if (var12 >= ((ff) this).field_l.length) {
            ((ff) this).field_k = param0.length;
            ((ff) this).field_a = param3;
            ((ff) this).field_O = param2;
            ((ff) this).field_n = param8;
            ((ff) this).field_f = param1;
            ((ff) this).field_x = param7;
            ((ff) this).field_C = ((ff) this).field_f;
            ((ff) this).field_P = ((ff) this).field_k;
            ((ff) this).field_v = new int[((ff) this).field_P];
            ((ff) this).field_H = new hca[((ff) this).field_P];
            ((ff) this).field_y = new wd[((ff) this).field_P];
            var12 = 0;
            L4: while (true) {
              if (((ff) this).field_H.length <= var12) {
                L5: {
                  var12 = ((ff) this).field_K;
                  if (var12 == 0) {
                    ((ff) this).field_r = -1;
                    break L5;
                  } else {
                    if (var12 == 1) {
                      ((ff) this).field_r = param6;
                      break L5;
                    } else {
                      if (3 == var12) {
                        ((ff) this).field_r = pl.a((byte) 64);
                        break L5;
                      } else {
                        if (2 == var12) {
                          ((ff) this).field_r = -1;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                }
                L6: {
                  ((ff) this).field_G = new dt[((ff) this).field_k];
                  ((ff) this).field_q = new boolean[((ff) this).field_H.length];
                  ((ff) this).field_o = -1;
                  ((ff) this).field_c = new kqa((ff) this);
                  ((ff) this).field_e = new sma((ff) this);
                  if (((ff) this).field_K != 0) {
                    break L6;
                  } else {
                    ((ff) this).field_i = new cfa((ff) this);
                    ((ff) this).field_i.b(28624);
                    ((ff) this).field_E = 0;
                    break L6;
                  }
                }
                ((ff) this).field_D = new ds(((ff) this).field_k);
                ((ff) this).field_g = new int[((ff) this).field_k];
                ((ff) this).field_F = new long[((ff) this).field_k];
                ((ff) this).field_I = new boolean[((ff) this).field_k];
              } else {
                ((ff) this).field_H[var12] = new hca(var12);
                ((ff) this).field_y[var12] = new wd(((ff) this).field_H[var12]);
                var12++;
                continue L4;
              }
            }
          } else {
            ((ff) this).field_J[var12] = "<col=" + jm.field_k[var12] + ">" + ((ff) this).field_l[var12] + "</col>";
            var12++;
            continue L3;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = "Options";
        field_w = 256;
    }
}
