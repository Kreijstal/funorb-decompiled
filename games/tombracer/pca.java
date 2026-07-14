/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pca {
    private int field_b;
    private int field_f;
    static String field_a;
    private int field_j;
    private int field_c;
    private uq field_e;
    private int field_g;
    private tqa field_i;
    int field_h;
    static iu[] field_k;
    private int[] field_d;

    final tqa a(int param0) {
        if (param0 != 18641) {
            return null;
        }
        return ((pca) this).field_i;
    }

    final void a(byte param0, iq param1) {
        if (param0 <= 104) {
            ((pca) this).field_d = null;
        }
        if (!(((pca) this).field_e == null)) {
            ((pca) this).field_e.a(113, param1);
        }
    }

    final int c(byte param0) {
        if (param0 <= 48) {
            ((pca) this).field_j = -59;
        }
        return ((pca) this).field_j;
    }

    final int a(byte param0) {
        if (param0 != -104) {
            return 95;
        }
        return ((pca) this).field_c;
    }

    final static boolean b(int param0, int param1, int param2) {
        if (param1 < 5) {
            field_k = null;
        }
        return 0 != (param2 & 16) ? true : false;
    }

    final void a(int param0, uq param1) {
        ((pca) this).field_e = param1;
        param1.a(30711, (pca) this);
        if (param0 != 3) {
            tqa discarded$0 = ((pca) this).a(-124);
        }
    }

    final boolean a(int param0, int[] param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        int[] var7 = param1;
        int[] var3 = var7;
        if (param0 > -110) {
            int discarded$0 = ((pca) this).a((byte) 5);
        }
        for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (!(!((pca) this).a(var5, 0))) {
                return true;
            }
        }
        return false;
    }

    public static void c(int param0) {
        if (param0 != 8) {
            field_k = null;
        }
        field_a = null;
        field_k = null;
    }

    final boolean a(int param0, int param1) {
        if (param1 != 0) {
            tqa discarded$0 = ((pca) this).a(21);
        }
        return 0 < ((pca) this).field_d[param0] ? true : false;
    }

    final boolean b(boolean param0) {
        if (param0) {
            tqa discarded$0 = ((pca) this).a(106);
        }
        return -1 > (((pca) this).field_g ^ -1) ? true : false;
    }

    final void a(kh param0, int param1) {
        if (param1 > -75) {
            return;
        }
        param0.a((byte) 92, ((pca) this).field_h, 8);
    }

    final void a(int param0, int param1, int param2, tqa param3) {
        ((pca) this).field_i = param3;
        ((pca) this).field_f = param2;
        ((pca) this).field_j = param0;
        ((pca) this).field_c = param3.d(-30551) * param0 + param3.d(-30551) / 2;
        ((pca) this).field_b = param3.d(-30551) * param2 + param3.d(-30551) / 2;
        if (param1 <= 124) {
            ((pca) this).a(-52, 68, true);
        }
    }

    final void a(int param0, int param1, boolean param2) {
        ((pca) this).field_d[param1] = ((pca) this).field_d[param1] + param0;
        if (!param2) {
            field_a = null;
        }
    }

    final boolean b(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            byte[] discarded$2 = pca.a(89, (byte) 98);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((pca) this).field_e) {
              break L2;
            } else {
              if (!((pca) this).field_e.c(param0 + -2)) {
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

    final la d(int param0) {
        if (param0 != 0) {
            return null;
        }
        return ((pca) this).field_i.b(0);
    }

    final void a(uw param0, byte param1) {
        if (null != ((pca) this).field_e) {
            param0.a((byte) -88, 4, (fo) (Object) ((pca) this).field_e);
        }
        if (param1 != 84) {
            ((pca) this).field_h = -37;
        }
    }

    final void a(byte param0, int param1) {
        ((pca) this).field_g = ((pca) this).field_g + param1;
        if (param0 <= 5) {
            ((pca) this).field_i = null;
        }
    }

    final void e(int param0) {
        if (!(null == ((pca) this).field_e)) {
            ((pca) this).field_e.a(true);
        }
        if (param0 != 0) {
            ((pca) this).field_h = 1;
        }
    }

    final void a(pca param0, int param1) {
        ((pca) this).field_h = param0.field_h;
        if (param1 != 21324) {
            ((pca) this).field_j = -39;
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
        woa var2_ref = null;
        int var9 = TombRacer.field_G ? 1 : 0;
        woa var2 = (woa) (Object) is.field_xb.a(0, (long)param0);
        if (param1 < 37) {
            return null;
        }
        if (var2 == null) {
            var11 = new byte[512];
            var10 = var11;
            var3 = var10;
            var4 = new Random((long)param0);
            for (var5 = 0; 255 > var5; var5++) {
                var3[var5] = (byte)var5;
            }
            for (var5 = 0; (var5 ^ -1) > -256; var5++) {
                var6 = -var5 + 255;
                var7 = jqa.a(var6, var4, -110);
                var8 = var11[var7];
                var3[var7] = var11[var6];
                var3[-var5 + 511] = (byte) var8;
                var3[var6] = (byte) var8;
            }
            var2_ref = new woa(var11);
            is.field_xb.a((od) (Object) var2_ref, (byte) 52, (long)param0);
        }
        return var2_ref.field_k;
    }

    final void a(byte param0, la param1, kh param2) {
        if (param0 != 29) {
            return;
        }
        ((pca) this).field_h = param2.b((byte) 44, 8);
        if ((param1.field_E ^ -1) <= -11) {
            if (param1.field_E > 17) {
            } else {
                int discarded$20 = param2.b((byte) 44, 1);
                int discarded$31 = param2.b((byte) 44, 1);
                if (((pca) this).field_h <= 5) {
                    ((pca) this).field_h = 0;
                } else {
                    ((pca) this).field_h = 1;
                }
            }
        }
    }

    final uq b(byte param0) {
        if (param0 >= -79) {
            int discarded$0 = ((pca) this).a(true);
        }
        return ((pca) this).field_e;
    }

    pca() {
        ((pca) this).field_d = new int[3];
    }

    final int a(boolean param0) {
        if (!param0) {
            return -58;
        }
        return ((pca) this).field_b;
    }

    final static void a(int param0, int param1, int param2) {
        lu.a(param0, (double)param2, param1 + 26108, param0, (double)param2);
        if (param1 != -26109) {
            pca.c(99);
        }
    }

    final int f(int param0) {
        int var2 = -8 / ((param0 - 44) / 50);
        return ((pca) this).field_f;
    }

    static {
    }
}
