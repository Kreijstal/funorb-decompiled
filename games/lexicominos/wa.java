/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wa extends kd {
    int field_h;
    int field_o;
    int field_n;
    int field_l;
    static boolean[] field_j;
    int field_i;
    static String field_k;
    int field_m;

    final static void a(byte param0, long param1) {
        try {
          try {
            Thread.sleep(param1);
          } catch (InterruptedException interruptedException) {
          }
          if (param0 != 5) {
            field_k = (String) null;
            return;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        try {
          int var1_int = 0;
          Throwable decompiledCaughtException = null;
          IOException var1 = null;
          RuntimeException var1_ref = null;
          IOException var2 = null;
          int var3 = 0;
          var3 = Lexicominos.field_L ? 1 : 0;
          try {
            if (kb.field_b != null) {
              kb.field_b.b(0);
            }
            if (param0 > 0) {
              field_k = (String) null;
            }
            if (null != u.field_pb) {
              u.field_pb.a((byte) -114);
            }
            if (wj.field_s != null) {
              try {
                wj.field_s.c(0);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
              }
            }
            if (null != bd.field_i) {
              for (var1_int = 0; bd.field_i.length > var1_int; var1_int++) {
                if (null != bd.field_i[var1_int]) {
                  try {
                    bd.field_i[var1_int].c(0);
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
            var1_ref = (RuntimeException) (Object) decompiledCaughtException;
            throw ld.a((Throwable) ((Object) var1_ref), "wa.C(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_k = null;
        int var1 = 115 % ((param0 + 66) / 60);
        field_j = null;
    }

    private wa() throws Throwable {
        throw new Error();
    }

    static {
        ng discarded$0 = new ng();
        field_j = new boolean[112];
    }
}
