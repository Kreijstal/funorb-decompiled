/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fu extends wp {
    int field_J;
    private rs field_H;
    static String field_F;
    static String field_E;
    int field_I;
    private int field_G;

    final static void a(int param0) {
        try {
          int var1_int = 0;
          IOException iOException = null;
          int var3 = 0;
          Throwable decompiledCaughtException = null;
          RuntimeException var1 = null;
          IOException var2 = null;
          var3 = Sumoblitz.field_L ? 1 : 0;
          try {
            if (null != jk.field_b) {
              jk.field_b.c(-106);
            }
            if (in.field_D != null) {
              in.field_D.b(109);
            }
            if (null != bc.field_a) {
              try {
                bc.field_a.b(-1);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
              }
            }
            if (param0 != -1) {
              field_F = (String) null;
            }
            if (m.field_O != null) {
              for (var1_int = 0; m.field_O.length > var1_int; var1_int++) {
                if (null != m.field_O[var1_int]) {
                  try {
                    m.field_O[var1_int].b(-1);
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
            throw qo.a((Throwable) ((Object) var1), "fu.I(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void d(boolean param0) {
        field_E = null;
        if (param0) {
          fu.a(78);
        }
        field_F = null;
    }

    final int a(int param0, int param1) {
        if (param0 < 0 ||
          param0 >= this.field_H.a((byte) 51)) {
          return -1;
        }
        if (param1 != -24194) {
          this.g(-5);
        }
        return this.field_H.d(param0, -29816);
    }

    final int h(int param0) {
        if (param0 != -1) {
          this.field_I = 54;
        }
        return this.field_G;
    }

    final int g(int param0) {
        if (param0 != 0) {
          this.field_I = 112;
        }
        return this.field_H.a((byte) 70);
    }

    final boolean a(pk param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var12 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param1 > -42) {
            fu.f(-122);
          }
          if (!super.a(param0, -105, param2, param3, param4, param5, param6)) {
            return false;
          }
          var8_int = param5 - (param4 + this.field_I);
          var9 = -(this.field_I * 2) + this.field_q;
          if (var9 < var8_int) {
            var8_int = var9;
          }
          if (var8_int < 0) {
            var8_int = 0;
          }
          var8_int = var8_int * this.field_G / var9;
          if (param3 != 1) {
            if (param3 != 2) {
              return true;
            }
            var10 = 2147483647;
            var11 = -1;
            for (var12 = 0; var12 < this.field_H.a((byte) 29); var12++) {
              var13 = this.field_H.d(var12, -29816) - var8_int;
              var13 = var13 * var13;
              if (var10 > var13) {
                var11 = var12;
                var10 = var13;
              }
            }
            if (var11 >= 0) {
              this.field_H.a((byte) 61, var11);
            }
          } else {
            this.field_H.c(-18, var8_int);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_28_0 = var8;
          stackIn_28_1 = new StringBuilder().append("fu.R(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static int e(byte param0) {
        int var1 = 126 % ((param0 + 26) / 38);
        return rf.field_d;
    }

    private fu() throws Throwable {
        throw new Error();
    }

    final static void f(int param0) {
        try {
          if (pe.field_E != null) {
            try {
              pe.field_E.a(-7564, 0L);
              pe.field_E.a(ig.field_a.field_n, 24, (byte) -41, ig.field_a.field_p);
            } catch (Exception exception) {
            }
          }
          ig.field_a.field_p = ig.field_a.field_p + param0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_F = "Names can only contain letters, numbers, spaces and underscores";
    }
}
