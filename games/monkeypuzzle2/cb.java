/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cb {
    static int[] field_c;
    static byte[][] field_b;
    static pj field_a;

    final static boolean a(int param0, boolean param1) {
        try {
          long dupTemp$1 = 0L;
          hb var2_ref_hb = null;
          int var2 = 0;
          IOException var2_ref_IOException = null;
          int stackIn_10_0 = 0;
          Throwable decompiledCaughtException = null;
          if (null == qg.field_a) {
            qg.field_a = pj.field_g.a(di.field_d, 0, cg.field_g);
          }
          if (qg.field_a.field_g == 0) {
            return false;
          }
          dupTemp$1 = pf.a(0);
          qg.field_d = dupTemp$1;
          d.field_k = dupTemp$1;
          if (qg.field_a.field_g != 1) {
            dk.field_h = ed.field_b;
          } else {
            try {
              ol.field_g = new id((java.net.Socket) (qg.field_a.field_b), pj.field_g);
              gf.field_c.field_h = 0;
              var2_ref_hb = MonkeyPuzzle2.field_D;
              stackIn_10_0 = (!param1) ? -1 : -2;
              bk.field_f = stackIn_10_0;
              il.field_e = stackIn_10_0;
              hk.field_l = stackIn_10_0;
              dk.field_h = ii.field_r;
              var2_ref_hb.field_h = 0;
              qi.a(j.field_a, gf.field_c, kc.field_c, false, rl.field_a);
              al.a((byte) -71, -1);
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref_IOException = (IOException) (Object) decompiledCaughtException;
              dk.field_h = ed.field_b;
              var2 = 82 / ((param0 + 53) / 63);
              qg.field_a = null;
              return true;
            }
          }
          var2 = 82 / ((param0 + 53) / 63);
          qg.field_a = null;
          return true;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b(boolean param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (!param0) {
          field_c = (int[]) null;
        }
        if (null == wj.field_k) {
          return;
        }
        var1 = wj.field_k;
        synchronized (var1) {
          wj.field_k = null;
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        if (param0 != 8) {
          return;
        }
        field_b = (byte[][]) null;
    }

    final static boolean a(boolean param0) {
        if (param0) {
          field_c = (int[]) null;
          if (null == ol.field_g) {
            return false;
          }
          if (wh.field_b == dk.field_h) {
            return true;
          }
          return false;
        }
        if (null == ol.field_g) {
          return false;
        }
        if (wh.field_b == dk.field_h) {
          return true;
        }
        return false;
    }

    final static tb a(String param0, ad param1, int param2, ad param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        tb stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param3.c(param0, (byte) -105);
          var6 = param3.a(param4, var5_int, -28459);
          if (param2 > -66) {
            cb.a(false);
          }
          stackIn_3_0 = wl.a(param1, -26348, param3, var6, var5_int);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("cb.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_c = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    }
}
