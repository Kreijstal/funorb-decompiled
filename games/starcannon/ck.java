/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ck implements Runnable {
    volatile df[] field_e;
    ka field_d;
    static int[][] field_h;
    volatile boolean field_a;
    volatile boolean field_c;
    static rb field_g;
    static String field_b;
    static int field_f;

    public final void run() {
        int var1_int = 0;
        df var2 = null;
        int var4 = StarCannon.field_A;
        this.field_c = true;
        try {
          while (!this.field_a) {
            for (var1_int = 0; var1_int < 2; var1_int++) {
              var2 = this.field_e[var1_int];
              if (var2 != null) {
                var2.d();
              }
            }
            uc.a(-94, 10L);
            ea.a((Object) null, 105, this.field_d);
          }
        } catch (Exception exception) {
          String var5 = (String) null;
          hc.a((Throwable) ((Object) exception), (String) null, (byte) 99);
        } finally {
          this.field_c = false;
        }
    }

    final static int a(byte param0) {
        try {
          int stackIn_16_0 = 0;
          int stackIn_28_0 = 0;
          int stackIn_33_0 = 0;
          int stackIn_36_0 = 0;
          int stackIn_38_0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          rb var2 = null;
          if (jh.field_b.field_p >= 4) {
            if (-1 == jh.field_b.field_d) {
              return 3;
            }
            if (jh.field_b.field_d != -2) {
              return 1;
            }
            return 4;
          }
          try {
            if (0 == bg.field_a) {
              bj.field_d = ij.field_f.a(va.field_s, 90, md.field_b);
              bg.field_a = bg.field_a + 1;
            }
            if (param0 < 124) {
              field_h = (int[][]) null;
            }
            if (bg.field_a == 1) {
              if (2 == bj.field_d.field_b) {
                stackIn_16_0 = ej.a(2, -1);
                return stackIn_16_0;
              }
              if (bj.field_d.field_b == 1) {
                bg.field_a = bg.field_a + 1;
              }
            }
            if (bg.field_a == 2) {
              ok.field_sb = new sb((java.net.Socket) (bj.field_d.field_f), ij.field_f);
              var2 = new rb(13);
              oe.a(wj.field_b, 32, var2, kc.field_M, ld.field_fb);
              var2.a(15, -122);
              var2.c((byte) -113, ac.field_e);
              ok.field_sb.a(0, var2.field_f, (byte) 87, 13);
              bg.field_a = bg.field_a + 1;
              wf.field_f = dd.b(69) + 30000L;
            }
            if (bg.field_a == 3) {
              if (0 >= ok.field_sb.c(122)) {
                if (wf.field_f < dd.b(63)) {
                  stackIn_33_0 = ej.a(2, -2);
                  return stackIn_33_0;
                }
              } else {
                var1_int = ok.field_sb.a(488852616);
                if (var1_int != 0) {
                  stackIn_28_0 = ej.a(2, var1_int);
                  return stackIn_28_0;
                }
                bg.field_a = bg.field_a + 1;
              }
            }
            if (bg.field_a != 4) {
              stackIn_38_0 = -1;
              return stackIn_38_0;
            }
            jh.field_b.a(ok.field_sb, 65, bh.field_g);
            bg.field_a = 0;
            bj.field_d = null;
            ok.field_sb = null;
            stackIn_36_0 = 0;
            return stackIn_36_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IOException) (Object) decompiledCaughtException;
            return ej.a(2, -3);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int b(byte param0) {
        int var1 = -97 / ((param0 - 32) / 58);
        return ie.field_D;
    }

    public static void a(boolean param0) {
        if (param0) {
          ck.b((byte) 79);
        }
        field_g = null;
        field_h = (int[][]) null;
        field_b = null;
    }

    ck() {
        this.field_e = new df[2];
        this.field_a = false;
        this.field_c = false;
    }

    static {
        field_g = new rb(256);
        field_b = "Next";
        field_f = 0;
    }
}
