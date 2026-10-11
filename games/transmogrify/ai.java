/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ai {
    static byte[][] field_e;
    static q field_a;
    static String field_d;
    static int field_c;
    static ti[] field_b;

    final static int a(int param0) {
        try {
          int stackIn_16_0 = 0;
          int stackIn_27_0 = 0;
          int stackIn_32_0 = 0;
          int stackIn_35_0 = 0;
          int stackIn_37_0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          oa var2 = null;
          if (oh.field_h.field_p >= 4) {
            if (oh.field_h.field_k == -1) {
              return 3;
            }
            if (oh.field_h.field_k != -2) {
              return 1;
            }
            return 4;
          }
          try {
            if (0 == cl.field_A) {
              wj.field_j = qi.field_a.a(60, nf.field_i, c.field_b);
              cl.field_A = cl.field_A + 1;
            }
            if (cl.field_A == 1) {
              if (wj.field_j.field_c == 2) {
                stackIn_16_0 = og.a(2, -1);
                return stackIn_16_0;
              }
              if (1 == wj.field_j.field_c) {
                cl.field_A = cl.field_A + 1;
              }
            }
            if (cl.field_A == param0) {
              re.field_y = new gj((java.net.Socket) (wj.field_j.field_g), qi.field_a);
              var2 = new oa(13);
              qb.a(116, of.field_c, var2, uh.field_f, tl.field_c);
              var2.f(param0 + 6387, 15);
              var2.a(-109, dk.field_h);
              re.field_y.a((byte) 9, var2.field_g, 13, 0);
              cl.field_A = cl.field_A + 1;
              ob.field_G = 30000L + lk.a(param0 ^ 2);
            }
            if (cl.field_A == 3) {
              if (re.field_y.a((byte) -125) <= 0) {
                if (ob.field_G < lk.a(0)) {
                  stackIn_32_0 = og.a(2, -2);
                  return stackIn_32_0;
                }
              } else {
                var1_int = re.field_y.c(1);
                if (var1_int != 0) {
                  stackIn_27_0 = og.a(param0 ^ 0, var1_int);
                  return stackIn_27_0;
                }
                cl.field_A = cl.field_A + 1;
              }
            }
            if (4 != cl.field_A) {
              stackIn_37_0 = -1;
              return stackIn_37_0;
            }
            oh.field_h.a(ck.field_A, re.field_y, param0 + 18);
            re.field_y = null;
            cl.field_A = 0;
            wj.field_j = null;
            stackIn_35_0 = 0;
            return stackIn_35_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IOException) (Object) decompiledCaughtException;
            return og.a(2, -3);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_e = (byte[][]) null;
        field_d = null;
        if (param0 == 67) {
          field_b = null;
          return;
        }
        ai.a(17);
        field_b = null;
    }

    final static void b(int param0) {
        String var1 = null;
        String var1Lifetime1;
        if (!lb.field_d) {
          throw new IllegalStateException();
        }
        int var2 = 33 / ((-70 - param0) / 55);
        if (null == wg.field_d) {
          var1 = lb.a(true);
          ok.field_a = new ff(var1, (String) null, true, false, false);
          ci.field_f.b((qg) (l.field_d), (byte) -71);
          l.field_d.b(-122, ok.field_a);
          l.field_d.p(27830);
          return;
        }
        wg.field_d.r(77);
        var1Lifetime1 = lb.a(true);
        ok.field_a = new ff(var1Lifetime1, (String) null, true, false, false);
        ci.field_f.b((qg) (l.field_d), (byte) -71);
        l.field_d.b(-122, ok.field_a);
        l.field_d.p(27830);
    }

    static {
        field_e = new byte[250][];
        field_a = new q();
    }
}
