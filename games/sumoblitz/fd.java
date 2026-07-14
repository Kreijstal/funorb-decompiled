/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fd extends uw {
    private long[] field_h;
    private int field_f;
    private long field_l;
    static String field_i;
    static long field_k;
    private long field_e;
    private long field_j;
    static Random field_d;
    private int field_g;

    final void b(byte param0) {
        if (!((((fd) this).field_e ^ -1L) >= (((fd) this).field_l ^ -1L))) {
            ((fd) this).field_l = ((fd) this).field_l + (-((fd) this).field_l + ((fd) this).field_e);
        }
        if (param0 != 105) {
            Object var3 = null;
            boolean discarded$0 = fd.a((js) null, (String) null, true, (String) null, (String) null, -8, -120);
        }
        ((fd) this).field_j = 0L;
    }

    final static boolean a(js param0, String param1, boolean param2, String param3, String param4, int param5, int param6) {
        if (param6 != 0) {
            fd.c(127);
        }
        if (!(hm.field_a == nw.field_e)) {
            return false;
        }
        uk var8 = new uk(rf.field_a, param0);
        uk var7 = var8;
        rf.field_a.a((byte) 111, (pk) (Object) var8);
        if (!fh.c(param6 ^ -123)) {
            dv.field_b = param2 ? true : false;
            vr.field_G = param1;
            in.field_C = param3;
            eg.field_l = null;
            nw.field_e = ad.field_p;
            bi.field_d = param4;
            lq.field_d = param5;
            return true;
        }
        var8.f(true);
        return true;
    }

    public static void c(int param0) {
        field_i = null;
        int var1 = 121 % ((75 - param0) / 32);
        field_d = null;
    }

    private final long a(int param0) {
        int var8 = 0;
        int var9 = Sumoblitz.field_L ? 1 : 0;
        long var2 = System.nanoTime();
        long var4 = var2 - ((fd) this).field_j;
        ((fd) this).field_j = var2;
        if ((var4 ^ -1L) < 4999999999L) {
            if (!(var4 >= 5000000000L)) {
                ((fd) this).field_h[((fd) this).field_g] = var4;
                ((fd) this).field_g = (1 + ((fd) this).field_g) % 10;
                if (-2 < (((fd) this).field_f ^ -1)) {
                    ((fd) this).field_f = ((fd) this).field_f + 1;
                }
            }
        }
        long var6 = 0L;
        if (param0 < 49) {
            ((fd) this).field_e = -118L;
        }
        for (var8 = 1; var8 <= ((fd) this).field_f; var8++) {
            var6 = var6 + ((fd) this).field_h[(10 + (((fd) this).field_g - var8)) % 10];
        }
        return var6 / (long)((fd) this).field_f;
    }

    final static int b(int param0) {
        if (param0 == 3878) {
          L0: {
            if (!oj.a(false)) {
              break L0;
            } else {
              if (null != pu.field_e.e((byte) 54)) {
                return pu.field_e.e((byte) 54).field_v;
              } else {
                break L0;
              }
            }
          }
          return -1;
        } else {
          return 25;
        }
    }

    final long a(byte param0) {
        ((fd) this).field_l = ((fd) this).field_l + this.a(62);
        if (!((((fd) this).field_l ^ -1L) <= (((fd) this).field_e ^ -1L))) {
            return (((fd) this).field_e + -((fd) this).field_l) / 1000000L;
        }
        int var2 = -94 / ((param0 - 42) / 37);
        return 0L;
    }

    final int a(int param0, long param1) {
        int var4 = 0;
        int var5 = Sumoblitz.field_L ? 1 : 0;
        if (param0 != 0) {
            ((fd) this).b((byte) 73);
        }
        if ((((fd) this).field_l ^ -1L) <= (((fd) this).field_e ^ -1L)) {
            var4 = 0;
            do {
                ((fd) this).field_e = ((fd) this).field_e + param1;
                var4++;
                // if_icmple L75
            } while (((fd) this).field_l > ((fd) this).field_e);
            if (!(((fd) this).field_l <= ((fd) this).field_e)) {
                ((fd) this).field_e = ((fd) this).field_l;
            }
            return var4;
        }
        ((fd) this).field_j = ((fd) this).field_j + (((fd) this).field_e - ((fd) this).field_l);
        ((fd) this).field_l = ((fd) this).field_l + (((fd) this).field_e + -((fd) this).field_l);
        ((fd) this).field_e = ((fd) this).field_e + param1;
        return 1;
    }

    fd() {
        ((fd) this).field_f = 1;
        ((fd) this).field_h = new long[10];
        ((fd) this).field_l = 0L;
        ((fd) this).field_e = 0L;
        ((fd) this).field_j = 0L;
        ((fd) this).field_g = 0;
        ((fd) this).field_l = System.nanoTime();
        ((fd) this).field_e = System.nanoTime();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Click";
        field_k = 0L;
        field_d = new Random();
    }
}
