/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class oga extends rqa {
    static int field_o;

    oga(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc[] var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -119) {
            var4 = (nc[]) null;
            this.a((nc[]) null, 8);
          }
          stackIn_3_0 = new nc(frb.a(32, 118));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("oga.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        if (param0 <= 27) {
          oga.a(23, 89, -52, 81, -123, -26, false);
        }
        if (wq.e((byte) 105)) {
          gaa.a(param2, 11343, param4, param6);
          if (null != cka.field_o &&
            cka.field_o.a(param6, -11, param1, param4, param3)) {
            lnb.d(0);
            param6 = false;
          }
          jra.a(param4, param6, 19717);
          oj.a((byte) -127, param6, param5);
          param6 = false;
        }
        return param6;
    }

    final static boolean a(char param0, byte param1) {
        if (param0 >= 32 &&
          param0 <= 126) {
          return true;
        }
        if (160 <= param0 &&
          param0 <= 255) {
          return true;
        }
        if (param0 != 8364 &&
          param0 != 338 &&
          8212 != param0 &&
          param0 != 339 &&
          param0 != 376) {
          if (param1 == 32) {
          }
          return false;
        }
        return true;
    }

    final static void a(int param0) {
        try {
          int var1_int = 0;
          IOException iOException = null;
          int var3 = 0;
          Throwable decompiledCaughtException = null;
          RuntimeException var1 = null;
          IOException var2 = null;
          var3 = VoidHunters.field_G;
          try {
            if (param0 != 16928) {
              field_o = -75;
            }
            if (ff.field_o != null) {
              ff.field_o.a(116);
            }
            if (nj.field_a != null) {
              nj.field_a.a(23474);
            }
            if (cba.field_e != null) {
              try {
                cba.field_e.a(true);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
              }
            }
            if (null != btb.field_d) {
              for (var1_int = 0; var1_int < btb.field_d.length; var1_int++) {
                if (null != btb.field_d[var1_int]) {
                  try {
                    btb.field_d[var1_int].a(true);
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
            throw rta.a((Throwable) ((Object) var1), "oga.D(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_o = 0;
    }
}
