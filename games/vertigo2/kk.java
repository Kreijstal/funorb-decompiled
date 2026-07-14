/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class kk {
    static ve field_e;
    private mn[] field_m;
    private nj field_i;
    private int field_g;
    static int field_j;
    private int field_d;
    private int field_k;
    private int field_b;
    private int[][][] field_l;
    static String field_h;
    static cr field_a;
    boolean field_c;
    static cr field_f;

    final int[][] a(int param0, int param1) {
        mn var3 = null;
        mn var3_ref = null;
        mn var4 = null;
        int var5 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        L0: {
          var5 = Vertigo2.field_L ? 1 : 0;
          if (param1 == -2) {
            break L0;
          } else {
            ((kk) this).field_g = -121;
            break L0;
          }
        }
        if (((kk) this).field_k != ((kk) this).field_g) {
          if (-2 != (((kk) this).field_g ^ -1)) {
            L1: {
              var3 = ((kk) this).field_m[param0];
              if (var3 == null) {
                L2: {
                  ((kk) this).field_c = true;
                  if (((kk) this).field_g <= ((kk) this).field_d) {
                    var4 = (mn) (Object) ((kk) this).field_i.c((byte) -45);
                    var3_ref = new mn(param0, var4.field_s);
                    ((kk) this).field_m[var4.field_r] = null;
                    var4.c(param1 ^ -4);
                    break L2;
                  } else {
                    var3_ref = new mn(param0, ((kk) this).field_d);
                    ((kk) this).field_d = ((kk) this).field_d + 1;
                    break L2;
                  }
                }
                ((kk) this).field_m[param0] = var3_ref;
                break L1;
              } else {
                ((kk) this).field_c = false;
                break L1;
              }
            }
            ((kk) this).field_i.a((li) (Object) var3_ref, (byte) 27);
            return ((kk) this).field_l[var3_ref.field_s];
          } else {
            L3: {
              stackOut_8_0 = this;
              stackIn_10_0 = stackOut_8_0;
              stackIn_9_0 = stackOut_8_0;
              if (((kk) this).field_b == param0) {
                stackOut_10_0 = this;
                stackOut_10_1 = 0;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                break L3;
              } else {
                stackOut_9_0 = this;
                stackOut_9_1 = 1;
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                break L3;
              }
            }
            ((kk) this).field_c = stackIn_11_1 != 0;
            ((kk) this).field_b = param0;
            return ((kk) this).field_l[0];
          }
        } else {
          L4: {
            stackOut_3_0 = this;
            stackIn_5_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if (null != ((kk) this).field_m[param0]) {
              stackOut_5_0 = this;
              stackOut_5_1 = 0;
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              break L4;
            } else {
              stackOut_4_0 = this;
              stackOut_4_1 = 1;
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              break L4;
            }
          }
          ((kk) this).field_c = stackIn_6_1 != 0;
          ((kk) this).field_m[param0] = mn.field_v;
          return ((kk) this).field_l[param0];
        }
    }

    final static byte[] a(int param0, byte param1) {
        byte[] var11 = null;
        byte[] var10 = null;
        byte[] var3 = null;
        Random var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        km var2_ref = null;
        int var9 = Vertigo2.field_L ? 1 : 0;
        km var2 = (km) (Object) bj.field_c.a((long)param0, false);
        if (var2 == null) {
            var11 = new byte[512];
            var10 = var11;
            var3 = var10;
            var4 = new Random((long)param0);
            for (var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte)var5;
            }
            for (var5 = 0; var5 < 255; var5++) {
                var6 = -var5 + 255;
                var7 = mj.a(-116, var4, var6);
                var8 = var11[var7];
                var3[var7] = var11[var6];
                var3[511 + -var5] = (byte) var8;
                var3[var6] = (byte) var8;
            }
            var2_ref = new km(var11);
            bj.field_c.a(-1, (gp) (Object) var2_ref, (long)param0);
        }
        if (param1 != 38) {
            kk.a((byte) 22);
        }
        return var2_ref.field_t;
    }

    public static void a(boolean param0) {
        if (!param0) {
            kk.b((byte) -122);
        }
        field_f = null;
        field_e = null;
        field_h = null;
        field_a = null;
    }

    final static void a(byte param0) {
        id.field_a = gk.a(53);
        if (param0 != 43) {
            byte[] discarded$0 = kk.a(-94, (byte) -26);
        }
        nj.field_d = 0;
    }

    final int[][][] a(int param0) {
        int var2 = 0;
        int var3 = Vertigo2.field_L ? 1 : 0;
        if (!(((kk) this).field_k == ((kk) this).field_g)) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (var2 = param0; ((kk) this).field_g > var2; var2++) {
            ((kk) this).field_m[var2] = mn.field_v;
        }
        return ((kk) this).field_l;
    }

    final static byte[] a(byte[] param0, byte param1) {
        int var2 = param0.length;
        byte[] var3 = new byte[var2];
        qq.a(param0, 0, var3, 0, var2);
        if (param1 != 103) {
            field_h = null;
        }
        return var3;
    }

    final static void b(byte param0) {
        il.field_a = true;
        if (param0 <= 78) {
            byte[] discarded$0 = kk.a(117, (byte) 117);
        }
        field_a = null;
        gk.field_c = null;
        if (!(null == ha.field_a)) {
            dj.field_d = ha.field_a;
            ui.field_b = gj.field_z;
            dj.field_d.field_B = -1;
            dj.field_d.field_H = -1;
            gj.field_z = null;
            ha.field_a = null;
        }
        gg.field_o = null;
        hb.field_j = null;
        oa.field_s = null;
    }

    kk(int param0, int param1, int param2) {
        ((kk) this).field_b = -1;
        ((kk) this).field_d = 0;
        ((kk) this).field_i = new nj();
        ((kk) this).field_c = false;
        ((kk) this).field_g = param0;
        ((kk) this).field_k = param1;
        ((kk) this).field_l = new int[((kk) this).field_g][3][param2];
        ((kk) this).field_m = new mn[((kk) this).field_k];
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = Vertigo2.field_L ? 1 : 0;
        for (var2 = 0; ((kk) this).field_g > var2; var2++) {
            ((kk) this).field_l[var2][0] = null;
            ((kk) this).field_l[var2][1] = null;
            ((kk) this).field_l[var2][2] = null;
            ((kk) this).field_l[var2] = null;
        }
        ((kk) this).field_l = null;
        if (param0 != 32764) {
            return;
        }
        ((kk) this).field_m = null;
        ((kk) this).field_i.c(0);
        ((kk) this).field_i = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new ve(7, 0, 1, 1);
        field_h = "You need to play <%0> more rated games to unlock this option.";
    }
}
