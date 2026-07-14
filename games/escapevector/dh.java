/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dh {
    static boolean field_c;
    static int field_d;
    static int field_b;
    static int[] field_e;
    private java.util.zip.Inflater field_a;

    final static void a(boolean param0, byte param1, mf param2, mf param3, mf param4) {
        di.field_g = vn.a((byte) 41, "");
        di.field_g.a((byte) -128, false);
        wc.a(83, param2, param3, param4);
        kn.a((byte) -96);
        dn.field_q = vn.field_g;
        if (param1 > -111) {
            boolean discarded$0 = dh.a(13, (byte) 34);
        }
        ui.field_b = vn.field_g;
    }

    final static ja[] a(int param0, lk param1) {
        int var5 = 0;
        ja var6 = null;
        int var7 = EscapeVector.field_A;
        if (!(param1.c(0))) {
            return new ja[]{};
        }
        la var8 = param1.a(5);
        while (var8.field_f == 0) {
            en.a((byte) 101, 10L);
        }
        if (-3 == (var8.field_f ^ -1)) {
            return new ja[]{};
        }
        if (param0 != 6629) {
            return null;
        }
        int[] var12 = (int[]) var8.field_b;
        int[] var11 = var12;
        int[] var10 = var11;
        int[] var9 = var10;
        int[] var3 = var9;
        ja[] var4 = new ja[var12.length >> -1233688350];
        for (var5 = 0; var5 < var4.length; var5++) {
            var6 = new ja();
            var4[var5] = var6;
            var6.field_c = var3[var5 << -501898174];
            var6.field_g = var3[1 + (var5 << -875913246)];
            var6.field_d = var3[(var5 << -21383230) + 2];
            var6.field_f = var3[3 + (var5 << -358555454)];
        }
        return var4;
    }

    public dh() {
        this(-1, 1000000, 1000000);
    }

    final static boolean a(int param0, byte param1) {
        int var4 = 0;
        int[] var2 = jb.field_m;
        int var3 = 0;
        if (param1 < 26) {
            dh.a((byte) -79);
        }
        while (var3 < var2.length) {
            var4 = var2[var3];
            if (!(param0 != var4)) {
                return true;
            }
            var3++;
        }
        return false;
    }

    public static void a(byte param0) {
        field_e = null;
        int var1 = 61 % ((46 - param0) / 49);
    }

    final void a(int param0, byte[] param1, n param2) {
        try {
            Exception exception = null;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              if (param2.field_g[param2.field_m] != 31) {
                break L0;
              } else {
                if ((param2.field_g[1 + param2.field_m] ^ -1) == 116) {
                  L1: {
                    if (null != ((dh) this).field_a) {
                      break L1;
                    } else {
                      ((dh) this).field_a = new java.util.zip.Inflater(true);
                      break L1;
                    }
                  }
                  try {
                    ((dh) this).field_a.setInput(param2.field_g, param2.field_m - -10, param2.field_g.length + (-10 + -param2.field_m) - 8);
                    int discarded$2 = ((dh) this).field_a.inflate(param1);
                  } catch (java.lang.Exception decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                  }
                  exception = (Exception) (Object) decompiledCaughtException;
                  ((dh) this).field_a.reset();
                  throw new RuntimeException("");
                } else {
                  break L0;
                }
              }
            }
            throw new RuntimeException("");
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private dh(int param0, int param1, int param2) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[]{1, 1, 2, 2};
        field_c = false;
        field_d = 0;
        field_b = 1;
    }
}
