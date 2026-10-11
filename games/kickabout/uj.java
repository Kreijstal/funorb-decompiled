/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class uj extends tm {
    static ut field_B;
    static String field_C;
    static int[] field_D;
    static String field_A;

    final static boolean a(int param0, String param1, String param2) {
        String var3 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param2 = n.a('_', "", (byte) -125, param2);
          if (param0 < 12) {
            return true;
          }
          var3 = bo.a(-1, param1);
          stackIn_8_0 = (param2.indexOf(param1) != -1) || (-1 != param2.indexOf(var3));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("uj.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_A = null;
        field_B = null;
        field_C = null;
        if (param0) {
          field_B = (ut) null;
        }
        field_D = null;
    }

    final static ut[] a(byte param0, it[] param1, String[] param2, int param3) {
        int var6 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        ut[] var5 = null;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        int stackIn_8_0 = 0;
        ut[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = Kickabout.field_G;
        try {
          var4_int = param2.length;
          var5 = new ut[var4_int];
          if (param0 > -58) {
            field_B = (ut) null;
          }
          for (var6 = 0; var6 < var4_int; var6++) {
            var7 = param2[var6];
            var5[var6] = new ut(q.field_d.a(var7) + 4, 18);
            iw.a(82, var5[var6]);
            stackIn_8_0 = (param1[var6].field_p == param3) ? 11184895 : 16755370;
            var8 = stackIn_8_0;
            q.field_d.d(var7, on.field_g >> 1, -4 + on.field_f, var8, -1);
            ta.e(117);
            var5[var6].a(65793);
          }
          stackIn_10_0 = var5;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("uj.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    uj(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final li a(byte param0, li[] param1) {
        RuntimeException var3 = null;
        li stackIn_2_0 = null;
        li stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 84) {
            stackIn_4_0 = new li(vg.e(-63, param1[0].b(-30368)));
            return stackIn_4_0;
          }
          stackIn_2_0 = (li) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("uj.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static boolean a(byte param0, int param1) {
        try {
          int var2 = 0;
          Throwable decompiledCaughtException = null;
          IOException var2_ref_IOException = null;
          if (un.field_e.field_n >= param1) {
            return true;
          }
          if (op.field_y == null) {
            return false;
          }
          try {
            var2 = op.field_y.a((byte) 63);
            if (0 < var2) {
              if (param1 - un.field_e.field_n < var2) {
                var2 = -un.field_e.field_n + param1;
              }
              op.field_y.a(un.field_e.field_f, var2, un.field_e.field_n, -4847);
              ci.field_c = nj.a(-128);
              un.field_e.field_n = un.field_e.field_n + var2;
              if (param1 > un.field_e.field_n) {
                return false;
              }
              un.field_e.field_n = 0;
              return true;
            }
            if (0 > var2 ||
              !(30000L >= aa.c(29680))) {
              lr.b((byte) -116);
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref_IOException = (IOException) (Object) decompiledCaughtException;
            lr.b((byte) -116);
          }
          var2 = -124 / ((param0 + 30) / 55);
          return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b(boolean param0) {
        if (!hk.field_G) {
          throw new IllegalStateException();
        }
        if (null != rk.field_f) {
          rk.field_f.q(-96);
        }
        String var1 = vg.a(-110);
        pb.field_E = new pd(var1, (String) null, param0, false, false);
        wd.field_l.a(we.field_a, false);
        we.field_a.a((byte) -126, (fd) (pb.field_E));
        we.field_a.m(4000);
    }

    final static sj a(int param0, byte param1, int param2, boolean param3, boolean param4, boolean param5) {
        try {
          int var6_int = 0;
          IOException var6 = null;
          Object var7 = null;
          Object var8 = null;
          wm var9 = null;
          sj stackIn_14_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            var6_int = 60 % ((20 - param1) / 35);
            var7 = null;
            if (hf.field_e.field_c != null) {
              ao.field_h = new ew(hf.field_e.field_c, 5200, 0);
              hf.field_e.field_c = null;
              var7 = new qh(255, ao.field_h, new ew(hf.field_e.field_j, 12000, 0), 2097152);
            }
            var8 = null;
            if (null != ao.field_h) {
              if (null == u.field_j) {
                u.field_j = new ew[hf.field_e.field_v.length];
              }
              if (u.field_j[param0] == null) {
                u.field_j[param0] = new ew(hf.field_e.field_v[param0], 12000, 0);
                hf.field_e.field_v[param0] = null;
              }
              var8 = new qh(param0, ao.field_h, u.field_j[param0], 2097152);
            }
            var9 = al.field_Ab.a((qh) (var8), -122, param0, param4, (qh) (var7));
            if (param3) {
              var9.b((byte) 55);
            }
            stackIn_14_0 = new sj(var9, param5, param2);
            return stackIn_14_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (IOException) (Object) decompiledCaughtException;
            throw new RuntimeException(var6.toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_C = "Asking to join <%0>'s game...";
        field_A = "Email: ";
    }
}
