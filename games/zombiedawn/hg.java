/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hg {
    static b field_b;
    static int[] field_a;

    final static void b(int param0) {
        if (null != e.field_S) {
          e.field_S.e((byte) -36);
        }
        if (vi.field_c != null) {
          vi.field_c.m(-31361);
        }
        if (param0 != 31431) {
          return;
        }
        jk.b(0);
    }

    final static void a(byte param0) {
        vn var1 = null;
        vn var2 = null;
        int var4 = 0;
        int var5 = ZombieDawn.field_J;
        try {
          var1 = new vn(540, 140);
          ki.a((byte) -122, var1);
          en.c();
          bi.d();
          ej.field_x = 0;
          gk.j(30549);
          var2 = var1.e();
          int var3 = 1 / ((4 - param0) / 43);
          for (var4 = 0; var4 < 15; var4++) {
            var2.h(-2, -2, 16777215);
            bi.h(4, 4, 0, 0, 540, 140);
          }
          wc.field_Pb.a();
          var1.d(0, 0);
          pa.a(-21189);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "hg.F(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 140) {
          field_a = (int[]) null;
        }
        field_b = null;
        field_a = null;
    }

    final static oh a(int param0, String param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        oh var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        oh stackIn_15_0 = null;
        Object stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ZombieDawn.field_J;
        try {
          if (null == sf.field_j) {
            return null;
          }
          if (param1 == null) {
            return null;
          }
          if (0 == param1.length()) {
            stackIn_7_0 = null;
            return (oh) (stackIn_7_0);
          }
          var6 = (CharSequence) ((Object) param1);
          var2 = fm.a(var6, -47);
          if (var2 == null) {
            stackIn_10_0 = null;
            return (oh) (stackIn_10_0);
          }
          var3 = (oh) (sf.field_j.a(93, (long)var2.hashCode()));
          while (true) {
            if (var3 == null) {
              var4 = -121 % ((60 - param0) / 32);
              stackIn_18_0 = null;
              return (oh) (stackIn_18_0);
            }
            var7 = (CharSequence) ((Object) var3.field_lb);
            var4_ref_String = fm.a(var7, -124);
            if (!var4_ref_String.equals(var2)) {
              var3 = (oh) (sf.field_j.b((byte) -113));
              continue;
            }
            break;
          }
          stackIn_15_0 = var3;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_21_0 = var2_ref;
          stackIn_21_1 = new StringBuilder().append("hg.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static vn a(int param0, int param1, dj param2, int param3) {
        RuntimeException var4 = null;
        vn stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        vn stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -2) {
            stackIn_2_0 = (vn) null;
            return stackIn_2_0;
          }
          if (ph.a(param1, 31043, param0, param2)) {
            stackIn_7_0 = em.i((byte) 72);
            return stackIn_7_0;
          }
          stackIn_5_0 = null;
          return (vn) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("hg.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void c(int param0) {
        try {
          int var1_int = 0;
          IOException iOException = null;
          int var3 = 0;
          Throwable decompiledCaughtException = null;
          RuntimeException var1 = null;
          IOException var2 = null;
          var3 = ZombieDawn.field_J;
          try {
            if (null != tf.field_c) {
              tf.field_c.d(31239);
            }
            if (he.field_d != null) {
              he.field_d.a(true);
            }
            if (param0 != 0) {
              hg.c(-94);
            }
            if (null != da.field_j) {
              try {
                da.field_j.b(463);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
              }
            }
            if (lg.field_v != null) {
              for (var1_int = 0; var1_int < lg.field_v.length; var1_int++) {
                if (lg.field_v[var1_int] != null) {
                  try {
                    lg.field_v[var1_int].b(463);
                  } catch (java.io.IOException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    var2 = (IOException) (Object) decompiledCaughtException;
                  }
                }
              }
              return;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw sh.a((Throwable) ((Object) var1), "hg.C(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_a = new int[16];
    }
}
