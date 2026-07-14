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
            field_g = null;
        }
        return id.field_b.b(false);
    }

    final static lj a(int param0, boolean param1, int param2, byte param3, boolean param4, boolean param5) {
        try {
            la var6 = null;
            IOException var6_ref = null;
            la var7 = null;
            di var8 = null;
            lj stackIn_16_0 = null;
            Throwable decompiledCaughtException = null;
            lj stackOut_15_0 = null;
            L0: {
              if (param3 > 91) {
                break L0;
              } else {
                lj discarded$2 = bb.a(70, true, 52, (byte) -68, false, false);
                break L0;
              }
            }
            try {
              L1: {
                var6 = null;
                var7 = null;
                if (null != rc.field_t.field_x) {
                  jj.field_b = new rk(rc.field_t.field_x, 5200, 0);
                  rc.field_t.field_x = null;
                  var6 = new la(255, jj.field_b, new rk(rc.field_t.field_i, 12000, 0), 2097152);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (jj.field_b == null) {
                  break L2;
                } else {
                  L3: {
                    if (ij.field_y != null) {
                      break L3;
                    } else {
                      ij.field_y = new rk[rc.field_t.field_r.length];
                      break L3;
                    }
                  }
                  L4: {
                    if (ij.field_y[param0] == null) {
                      ij.field_y[param0] = new rk(rc.field_t.field_r[param0], 12000, 0);
                      rc.field_t.field_r[param0] = null;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var7 = new la(param0, jj.field_b, ij.field_y[param0], 2097152);
                  break L2;
                }
              }
              L5: {
                var8 = wf.field_i.a(param0, var7, param4, (byte) 15, var6);
                if (param5) {
                  var8.d(14);
                  break L5;
                } else {
                  break L5;
                }
              }
              stackOut_15_0 = new lj((kl) (Object) var8, param1, param2);
              stackIn_16_0 = stackOut_15_0;
            } catch (java.io.IOException decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return stackIn_16_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    final static void a(boolean param0, byte param1) {
        if (!(param0)) {
            o.a(7, true);
        }
        int var2 = 68 / ((52 - param1) / 62);
    }

    public final void run() {
        int var1_int = 0;
        kh var2 = null;
        int var4 = TorChallenge.field_F ? 1 : 0;
        ((bb) this).field_f = true;
        try {
            while (!((bb) this).field_e) {
                for (var1_int = 0; (var1_int ^ -1) > -3; var1_int++) {
                    var2 = ((bb) this).field_a[var1_int];
                    if (var2 != null) {
                        var2.h();
                    }
                }
                c.a(100, 10L);
                Object var5 = null;
                hd.a(117, ((bb) this).field_b, (Object) null);
            }
        } catch (Exception exception) {
            Object var6 = null;
            td.a((String) null, (Throwable) (Object) exception, (byte) -123);
        } finally {
            ((bb) this).field_f = false;
        }
    }

    public static void b(int param0) {
        field_k = null;
        field_g = null;
        field_j = null;
        field_d = null;
        if (param0 != 6) {
            lj discarded$0 = bb.a(21, false, 57, (byte) -119, true, false);
        }
    }

    bb() {
        ((bb) this).field_a = new kh[2];
        ((bb) this).field_e = false;
        ((bb) this).field_f = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new int[]{103, 88, 87, 100, 50, 42};
        field_g = new int[128];
        field_d = new sl();
        field_k = new int[][]{new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3]};
    }
}
