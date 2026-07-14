/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fi extends nt {
    private boolean field_s;

    fi(int param0, int param1, int param2) {
        super(100, param0, param1, param2);
        ((fi) this).field_s = true;
    }

    final static int a(int param0, Random param1, byte param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (param2 == -96) {
          if (param0 > 0) {
            if (rm.a(param0, param2 ^ 55)) {
              return (int)(((long)param1.nextInt() & 4294967295L) * (long)param0 >> 124152800);
            } else {
              var3 = -2147483648 - (int)(4294967296L % (long)param0);
              L0: while (true) {
                var4 = param1.nextInt();
                if (var3 <= var4) {
                  continue L0;
                } else {
                  return eb.a(param0, param2 ^ -44, var4);
                }
              }
            }
          } else {
            throw new IllegalArgumentException();
          }
        } else {
          return 54;
        }
    }

    final void a(ha param0, int param1) {
        int var3 = 0;
        var3 = 0;
        if (param1 >= -121) {
          return;
        } else {
          L0: {
            if (((fi) this).field_s) {
              var3 = (int)((double)(100 - ((fi) this).field_p) / 100.0 * 4096.0);
              break L0;
            } else {
              var3 = (int)(4096.0 * ((double)((fi) this).field_p / 100.0));
              break L0;
            }
          }
          var3 = var3 * (-((fi) this).field_p + 100);
          kw.field_a.a((float)(((fi) this).field_k >> -1358736184), (float)(((fi) this).field_o >> -2086129336), var3, 0, 1, ((fi) this).field_q, 2);
          return;
        }
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    final static String a(long param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        aj.field_y.setTime(new Date(param0));
        var3 = aj.field_y.get(7);
        var4 = aj.field_y.get(5);
        var5 = aj.field_y.get(2);
        var6 = aj.field_y.get(1);
        if (!param1) {
          return null;
        } else {
          var7 = aj.field_y.get(11);
          var8 = aj.field_y.get(12);
          var9 = aj.field_y.get(13);
          return dk.field_b[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + bq.field_a[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
    }

    static {
    }
}
