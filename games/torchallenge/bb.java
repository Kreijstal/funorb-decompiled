/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bb implements Runnable {
    static int[] field_j;
    static sl field_d;
    static int[] field_g;
    volatile boolean field_f;
    uj field_b;
    static int field_h;
    volatile kh[] field_a;
    volatile boolean field_e;
    static int field_i;
    static int[][] field_k;
    static int field_c;

    final static String a(int param0) {
        if (param0 != 6) {
          field_g = (int[]) null;
        }
        return id.field_b.b(false);
    }

    final static lj a(int param0, boolean param1, int param2, byte param3, boolean param4, boolean param5) {
        try {
          Object var6 = null;
          Object var7 = null;
          di var8 = null;
          lj stackIn_16_0 = null;
          Throwable decompiledCaughtException = null;
          if (param3 <= 91) {
            bb.a(70, true, 52, (byte) -68, false, false);
          }
          try {
            var6 = null;
            var7 = null;
            if (null != rc.field_t.field_x) {
              jj.field_b = new rk(rc.field_t.field_x, 5200, 0);
              rc.field_t.field_x = null;
              var6 = new la(255, jj.field_b, new rk(rc.field_t.field_i, 12000, 0), 2097152);
            }
            if (jj.field_b != null) {
              if (ij.field_y == null) {
                ij.field_y = new rk[rc.field_t.field_r.length];
              }
              if (ij.field_y[param0] == null) {
                ij.field_y[param0] = new rk(rc.field_t.field_r[param0], 12000, 0);
                rc.field_t.field_r[param0] = null;
              }
              var7 = new la(param0, jj.field_b, ij.field_y[param0], 2097152);
            }
            var8 = wf.field_i.a(param0, (la) (var7), param4, (byte) 15, (la) (var6));
            if (param5) {
              var8.d(14);
            }
            stackIn_16_0 = new lj(var8, param1, param2);
            return stackIn_16_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (IOException) (Object) decompiledCaughtException;
            throw new RuntimeException(((IOException) (var6)).toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0, byte param1) {
        if (!param0) {
          o.a(7, true);
        }
        int var2 = 68 / ((52 - param1) / 62);
    }

    public final void run() {
        int var1_int = 0;
        kh var2 = null;
        int var4 = TorChallenge.field_F ? 1 : 0;
        this.field_f = true;
        try {
          while (!this.field_e) {
            for (var1_int = 0; var1_int < 2; var1_int++) {
              var2 = this.field_a[var1_int];
              if (var2 != null) {
                var2.h();
              }
            }
            c.a(100, 10L);
            Object var5 = (Object) null;
            hd.a(117, this.field_b, (Object) null);
          }
        } catch (Exception exception) {
          String var6 = (String) null;
          td.a((String) null, (Throwable) ((Object) exception), (byte) -123);
        } finally {
          this.field_f = false;
        }
    }

    public static void b(int param0) {
        field_k = (int[][]) null;
        field_g = null;
        field_j = null;
        field_d = null;
        if (param0 != 6) {
          bb.a(21, false, 57, (byte) -119, true, false);
        }
    }

    bb() {
        this.field_a = new kh[2];
        this.field_e = false;
        this.field_f = false;
    }

    static {
        field_j = new int[]{103, 88, 87, 100, 50, 42};
        field_g = new int[128];
        field_d = new sl();
        field_k = new int[][]{new int[]{8, 8, 8}, new int[]{7, 7, 7}, new int[]{4, 4, 4}, new int[]{4, 4, 4}, new int[]{4, 4, 4}, new int[]{8, 8, 8}, new int[]{8, 8, 8}, new int[]{8, 8, 8}, new int[]{4, 4, 4}, new int[]{8, 8, 8}, new int[]{8, 8, 8}, new int[]{12, 8, 16}, new int[]{12, 8, 16}, new int[]{12, 8, 16}, new int[]{3, 3, 3}, new int[]{6, 6, 6}, new int[]{6, 6, 6}, new int[]{6, 6, 6}, new int[]{6, 6, 6}, new int[]{6, 6, 6}};
    }
}
