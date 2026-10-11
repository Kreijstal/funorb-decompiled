/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vc {
    static int[] field_b;
    String field_j;
    static long field_a;
    String field_c;
    static stellarshard field_h;
    static String field_g;
    String field_d;
    int field_i;
    static int[] field_f;
    pf field_e;

    public static void a(int param0) {
        if (param0 != -1) {
          return;
        }
        field_h = null;
        field_b = null;
        field_g = null;
        field_f = null;
    }

    final static pb a(pf param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -2) {
            field_a = 32L;
          }
          if (tl.a(param0, (byte) -5, param2, param1)) {
            return vg.c((byte) -118);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("vc.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(byte param0, boolean param1, boolean param2) {
        if (param0 >= -61) {
          vc.a((byte) 54);
          if (!param2) {
            ti.d();
            af.a(param2, (byte) -98);
            return;
          }
          ti.b(0, 0, ti.field_i, ti.field_b, 0, 192);
          af.a(param2, (byte) -98);
          return;
        }
        if (!param2) {
          ti.d();
          af.a(param2, (byte) -98);
          return;
        }
        ti.b(0, 0, ti.field_i, ti.field_b, 0, 192);
        af.a(param2, (byte) -98);
    }

    final static int a(byte param0) {
        try {
          int stackIn_15_0 = 0;
          int stackIn_25_0 = 0;
          int stackIn_28_0 = 0;
          int stackIn_32_0 = 0;
          int stackIn_34_0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          int var2 = 0;
          ka var3 = null;
          if (4 <= od.field_v.field_i) {
            if (od.field_v.field_g == -1) {
              return 3;
            }
            if (-2 == od.field_v.field_g) {
              return 4;
            }
            return 1;
          }
          try {
            if (kc.field_b == 0) {
              dl.field_A = fa.field_p.a(field_g, (byte) 34, ll.field_b);
              kc.field_b = kc.field_b + 1;
            }
            if (kc.field_b == 1) {
              if (dl.field_A.field_f == 2) {
                stackIn_15_0 = tc.a(-1, (byte) 127);
                return stackIn_15_0;
              }
              if (1 == dl.field_A.field_f) {
                kc.field_b = kc.field_b + 1;
              }
            }
            if (kc.field_b == 2) {
              k.field_b = new fh((java.net.Socket) (dl.field_A.field_b), fa.field_p);
              var3 = new ka(13);
              bk.a(fd.field_nb, false, sk.field_b, var3, ld.field_C);
              var3.a(false, 15);
              var3.b(0, n.field_d);
              k.field_b.a(var3.field_r, 0, 120, 13);
              kc.field_b = kc.field_b + 1;
              fj.field_j = ih.a((byte) -98) + 30000L;
            }
            var1_int = 23 / ((param0 + 55) / 60);
            if (kc.field_b == 3) {
              if (k.field_b.b(-95) > 0) {
                var2 = k.field_b.a(0);
                if (var2 != 0) {
                  stackIn_28_0 = tc.a(var2, (byte) 125);
                  return stackIn_28_0;
                }
                kc.field_b = kc.field_b + 1;
              } else {
                if (fj.field_j < ih.a((byte) -98)) {
                  stackIn_25_0 = tc.a(-2, (byte) 126);
                  return stackIn_25_0;
                }
              }
            }
            if (4 != kc.field_b) {
              stackIn_34_0 = -1;
              return stackIn_34_0;
            }
            od.field_v.a(sd.field_i, k.field_b, 70);
            dl.field_A = null;
            k.field_b = null;
            kc.field_b = 0;
            stackIn_32_0 = 0;
            return stackIn_32_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IOException) (Object) decompiledCaughtException;
            return tc.a(-3, (byte) 125);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private vc() throws Throwable {
        throw new Error();
    }

    static {
    }
}
