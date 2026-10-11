/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hh extends ai {
    int field_g;
    static byte[][] field_r;
    int field_j;
    static int[] field_h;
    int[] field_i;
    static boolean field_k;
    int[] field_l;
    static byte[] field_q;
    static ii field_p;
    mk[] field_n;
    int[] field_o;
    byte[][][] field_m;
    mk[] field_s;

    final static void a(int param0, String param1) {
        try {
          if (param0 != 0) {
            hh.a(true);
          }
          mc.field_d = param1;
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "hh.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(byte param0) {
        try {
          int var1_int = 0;
          Throwable decompiledCaughtException = null;
          IOException var1 = null;
          RuntimeException var1_ref = null;
          IOException var2 = null;
          int var3 = 0;
          var3 = Bounce.field_N;
          try {
            if (null != tb.field_p) {
              tb.field_p.a(param0 - 134);
            }
            if (hb.field_F != null) {
              hb.field_F.d(-1);
            }
            if (jg.field_C != null) {
              try {
                jg.field_C.b(-747969087);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
              }
            }
            if (pd.field_a != null) {
              for (var1_int = 0; pd.field_a.length > var1_int; var1_int++) {
                if (null != pd.field_a[var1_int]) {
                  try {
                    pd.field_a[var1_int].b(-747969087);
                  } catch (java.io.IOException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    var2 = (IOException) (Object) decompiledCaughtException;
                  }
                }
              }
            }
            if (param0 == 48) {
              return;
            }
            hh.a(false);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1_ref = (RuntimeException) (Object) decompiledCaughtException;
            throw ii.a((Throwable) ((Object) var1_ref), "hh.B(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(ve param0, ve param1, byte param2) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 < 37) {
            field_k = true;
          }
          var4 = (String) null;
          stackIn_3_0 = vb.a(false, (String) null, -89, 0, param1, 0, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("hh.D(");
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
          throw ii.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_r = (byte[][]) null;
        if (!param0) {
          field_p = null;
          field_q = null;
          field_h = null;
          return;
        }
        field_k = false;
        field_p = null;
        field_q = null;
        field_h = null;
    }

    final static void b(int param0, int param1, int param2, int param3, int param4) {
        pb.field_j = param0;
        ed.field_d = param2;
        k.field_D = param3;
        qd.field_b = param1;
        if (param4 != 0) {
          field_h = (int[]) null;
        }
    }

    final static void c(byte param0) {
        if (param0 != -60) {
          field_q = (byte[]) null;
          oh.a(94, 17);
          return;
        }
        oh.a(94, 17);
    }

    hh() {
    }

    static {
        field_r = new byte[50][];
        field_h = new int[4];
        field_k = false;
    }
}
