/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ln extends df {
    int field_C;
    int field_Q;
    sd field_R;
    static bi[][] field_O;
    int field_z;
    String field_I;
    int field_S;
    static String field_U;
    static String field_P;
    static String field_q;
    static int field_w;
    ln[] field_D;
    int field_x;
    static bi field_F;
    int field_B;
    jd[] field_r;
    int field_p;
    static int[] field_H;
    static String field_o;
    fi[] field_v;
    pf field_T;
    int field_N;
    boolean field_u;
    fs field_t;
    fs field_y;
    int field_L;
    static bi field_K;
    int field_A;
    int field_J;
    db field_s;
    int[] field_G;
    static String field_E;

    final void e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        ln var5 = null;
        int var6 = 0;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        if (((ln) this).field_D != null) {
          L0: {
            var2 = 0;
            var3 = ((ln) this).field_D.length;
            if (param0 < -97) {
              break L0;
            } else {
              ((ln) this).field_z = -57;
              break L0;
            }
          }
          L1: while (true) {
            if (var2 != 0) {
              return;
            } else {
              var3--;
              var2 = 1;
              var4 = 0;
              L2: while (true) {
                if (var3 <= var4) {
                  continue L1;
                } else {
                  if (((ln) this).field_D[var4].field_p > ((ln) this).field_D[var4 - -1].field_p) {
                    var5 = ((ln) this).field_D[var4];
                    ((ln) this).field_D[var4] = ((ln) this).field_D[1 + var4];
                    ((ln) this).field_D[var4 - -1] = var5;
                    var2 = 0;
                    var4++;
                    continue L2;
                  } else {
                    var4++;
                    continue L2;
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    public static void e(int param0) {
        field_E = null;
        field_H = null;
        field_P = null;
        if (param0 != 0) {
            ln.e(-26);
        }
        field_o = null;
        field_K = null;
        field_U = null;
        field_q = null;
        field_F = null;
        field_O = null;
    }

    final void a(ln param0, byte param1) {
        ln[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ln[] var7 = null;
        ln[] var8 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!((ln) this).b(param0, (byte) 10)) {
          return;
        } else {
          if ((((ln) this).field_D.length ^ -1) != -2) {
            var7 = new ln[-1 + ((ln) this).field_D.length];
            var8 = var7;
            var3 = var8;
            var4 = 0;
            var5 = 0;
            L0: while (true) {
              if (((ln) this).field_D.length <= var5) {
                L1: {
                  if (param1 < -122) {
                    break L1;
                  } else {
                    ((ln) this).field_s = null;
                    break L1;
                  }
                }
                ((ln) this).field_D = var8;
                param0.a((ln) this, (byte) -123);
                return;
              } else {
                if (param0 != ((ln) this).field_D[var5]) {
                  var4++;
                  var7[var4] = ((ln) this).field_D[var5];
                  var5++;
                  continue L0;
                } else {
                  var5++;
                  continue L0;
                }
              }
            }
          } else {
            ((ln) this).field_D = new ln[]{};
            param0.a((ln) this, (byte) -124);
            return;
          }
        }
    }

    final void a(byte param0, ln param1) {
        ln[] var3 = null;
        int var4 = 0;
        ln[] var6 = null;
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        if (null != ((ln) this).field_D) {
            var6 = new ln[1 + ((ln) this).field_D.length];
            var3 = var6;
            for (var4 = 0; var4 < ((ln) this).field_D.length; var4++) {
                var6[var4] = ((ln) this).field_D[var4];
            }
            var3[((ln) this).field_D.length] = param1;
            ((ln) this).field_D = var3;
        } else {
            ((ln) this).field_D = new ln[]{param1};
        }
        if (param0 > -74) {
            field_q = null;
        }
    }

    final void a(Random param0, byte param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int[] var10 = null;
        int[] var12 = null;
        int[] var14 = null;
        int[] var16 = null;
        int[] var17 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        if (((ln) this).field_G[0] < 0) {
          ((ln) this).field_B = 6;
          return;
        } else {
          L0: {
            if (0 == ((ln) this).field_G[1]) {
              break L0;
            } else {
              if (((ln) this).field_G[2] == 0) {
                break L0;
              } else {
                if (((ln) this).field_G[3] == 0) {
                  break L0;
                } else {
                  if (0 == ((ln) this).field_G[0]) {
                    break L0;
                  } else {
                    ((ln) this).field_B = 1;
                    return;
                  }
                }
              }
            }
          }
          L1: {
            var16 = new int[6];
            var14 = var16;
            var12 = var14;
            var10 = var12;
            var8 = var10;
            var17 = var8;
            var4 = 0;
            if (param1 >= 61) {
              break L1;
            } else {
              var7 = null;
              ((ln) this).a((ln) null, (byte) 104);
              break L1;
            }
          }
          var8[2] = 4 * ((ln) this).field_G[3];
          var8[3] = 4 * ((ln) this).field_G[2];
          var8[1] = 4 * ((ln) this).field_G[1];
          var8[5] = ((ln) this).field_G[0] * 4;
          var8[0] = (((ln) this).field_G[0] + ((ln) this).field_G[3]) * 3;
          var8[4] = 2 * (((ln) this).field_G[2] + ((ln) this).field_G[3] + ((ln) this).field_G[1]);
          var5 = 0;
          L2: while (true) {
            if (var16.length <= var5) {
              var4 = qf.a((byte) 126, var4, param0);
              var9 = 0;
              var5 = var9;
              L3: while (true) {
                if (var9 >= var17.length) {
                  throw new RuntimeException();
                } else {
                  var4 = var4 - var17[var9];
                  if (var4 >= 0) {
                    var9++;
                    continue L3;
                  } else {
                    ((ln) this).field_B = var9;
                    return;
                  }
                }
              }
            } else {
              var4 = var4 + var16[var5];
              var5++;
              continue L2;
            }
          }
        }
    }

    final boolean b(ln param0, byte param1) {
        int var4 = 0;
        ln var5 = null;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!(((ln) this).field_D != null)) {
            return false;
        }
        ln[] var7 = ((ln) this).field_D;
        ln[] var3 = var7;
        for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (param0 == var5) {
                return true;
            }
        }
        if (param1 != 10) {
            ((ln) this).a((ln) null, (byte) 102);
        }
        return false;
    }

    final static void f(byte param0) {
        int var2 = -118 / ((3 - param0) / 49);
        cl var1 = (cl) (Object) ta.field_b.a(true);
        if (var1 == null) {
            throw new IllegalStateException();
        }
        gf.a(var1.field_i, var1.field_r, var1.field_k);
        gf.d(var1.field_o, var1.field_h, var1.field_j, var1.field_l);
        var1.field_i = null;
        ql.field_p.a((byte) -113, (oh) (Object) var1);
    }

    ln(int param0, int param1, int param2, int param3) {
        ((ln) this).field_G = new int[4];
        ((ln) this).field_z = param3;
        ((ln) this).field_p = param0;
        ((ln) this).field_S = param2;
        ((ln) this).field_A = param1;
        ((ln) this).field_T = new pf();
        ((ln) this).field_s = new db();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_U = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_P = "Battles lost in hostile space.";
        field_q = "Incoming fleet";
        field_E = "Enter name of player to delete from list";
    }
}
