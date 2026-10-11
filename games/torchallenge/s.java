/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class s extends da {
    static boolean field_m;
    static int[] field_k;
    static String[] field_j;
    static int[] field_l;
    static String field_p;
    static int[] field_q;
    byte[] field_o;
    static int[] field_i;
    static ka[] field_n;

    final static ka[] a(lj param0, String param1, int param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ka[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 0) {
            field_j = (String[]) null;
          }
          var4_int = param0.a(param1, 73);
          var5 = param0.a(var4_int, param3, (byte) 116);
          stackIn_3_0 = bl.a(var5, var4_int, param0, param2 ^ 2147483647);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("s.A(");
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
          throw oj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static boolean a(boolean param0, boolean param1) {
        try {
          long dupTemp$1 = 0L;
          IOException var2 = null;
          pa var4 = null;
          pa var5 = null;
          int stackIn_11_0 = 0;
          Throwable decompiledCaughtException = null;
          if (null == gf.field_o) {
            gf.field_o = vl.field_a.a(ae.field_x, ll.field_f, 431890200);
          }
          if (gf.field_o.field_d == 0) {
            return false;
          }
          if (param0) {
            field_k = (int[]) null;
          }
          dupTemp$1 = ol.a(256);
          i.field_q = dupTemp$1;
          ac.field_e = dupTemp$1;
          if (gf.field_o.field_d != 1) {
            aj.field_c = pf.field_b;
          } else {
            try {
              qf.field_a = new wb((java.net.Socket) (gf.field_o.field_g), vl.field_a);
              dk.field_s.field_q = 0;
              var4 = id.field_b;
              var5 = var4;
              aj.field_c = ng.field_A;
              var5.field_q = 0;
              stackIn_11_0 = (param1) ? -2 : -1;
              ul.field_j = stackIn_11_0;
              uc.field_X = stackIn_11_0;
              md.field_i = stackIn_11_0;
              hl.a(dk.field_s, 12, ph.field_e, db.field_y, mh.field_a);
              nb.a(-1, -1);
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = (IOException) (Object) decompiledCaughtException;
              aj.field_c = pf.field_b;
              gf.field_o = null;
              return true;
            }
          }
          gf.field_o = null;
          return true;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_n = null;
        field_q = null;
        field_j = null;
        field_k = null;
        field_l = null;
        field_i = null;
        field_p = null;
        if (param0 != 2) {
          field_p = (String) null;
        }
    }

    s(byte[] param0) {
        try {
          this.field_o = param0;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "s.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = new int[]{-20, -20, -20, -20, -20, -20, 1, 1, 1};
        field_j = new String[]{"All scores", "My scores", "Best each"};
        field_q = new int[]{3, 2, 1, 3};
        field_p = "Log in";
        field_l = new int[]{1, 1, 1, 2, 1};
        field_i = new int[]{2, 3, 3};
    }
}
