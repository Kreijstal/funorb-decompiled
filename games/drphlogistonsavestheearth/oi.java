/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class oi {
    static he field_h;
    static he[] field_a;
    static double[] field_b;
    static nh field_d;
    static he[] field_g;
    static boolean field_c;
    static bl field_e;
    static he field_f;

    final static int a(int param0, byte param1) {
        int var2;
        if (param1 != 1) {
          return 85;
        }
        var2 = 0;
        if (param0 < 0 ||
          param0 >= 65536) {
          param0 = param0 >>> 16;
          var2 += 16;
        }
        if (param0 >= 256) {
          var2 += 8;
          param0 = param0 >>> 8;
        }
        if (16 <= param0) {
          var2 += 4;
          param0 = param0 >>> 4;
        }
        if (param0 >= 4) {
          param0 = param0 >>> 2;
          var2 += 2;
        }
        if (param0 >= 1) {
          var2++;
          param0 = param0 >>> 1;
        }
        return param0 + var2;
    }

    final static int a(a param0, a param1, byte param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -85) {
            oi.a((byte) -77);
          }
          stackIn_3_0 = pj.a((String) null, 0, param0, param1, param2 + 85, 0, false);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("oi.F(");
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
          throw ie.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    abstract void a(java.awt.Component param0, byte param1);

    abstract int a(int param0);

    final static void b(byte param0) {
        try {
          int var2 = 0;
          IOException iOException = null;
          int var1_int = 0;
          int var4 = 0;
          Throwable decompiledCaughtException = null;
          RuntimeException var1 = null;
          IOException var3 = null;
          var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          try {
            if (p.field_a != null) {
              p.field_a.a((byte) -82);
            }
            if (pd.field_d != null) {
              pd.field_d.a((byte) 104);
            }
            var1_int = 35 / ((param0 + 45) / 48);
            if (null != uj.field_h) {
              try {
                uj.field_h.a(-126);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
              }
            }
            if (rc.field_d != null) {
              for (var2 = 0; rc.field_d.length > var2; var2++) {
                if (rc.field_d[var2] != null) {
                  try {
                    rc.field_d[var2].a(-104);
                  } catch (java.io.IOException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    var3 = (IOException) (Object) decompiledCaughtException;
                  }
                }
              }
              return;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw ie.a((Throwable) ((Object) var1), "oi.H(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_g = null;
        if (param0 != 86) {
          return;
        }
        field_f = null;
        field_h = null;
        field_e = null;
        field_d = null;
        field_b = null;
        field_a = null;
    }

    abstract void a(byte param0, java.awt.Component param1);

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          for (var2_int = 0; var2_int < param1.length(); var2_int++) {
            var3 = param1.charAt(var2_int);
            if (!ug.a(-1, (char) var3) &&
              !lb.a((char) var3, true)) {
              return true;
            }
          }
          if (param0 == 8975) {
            return false;
          }
          oi.a(-35, (byte) 4);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("oi.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_b = new double[]{1.5, 5.0, 2.5, 3.0, 3.0, 2.0, 1.0, 2.5, 4.5, 3.0, 1.5, 2.0, 1.0, 1.5, 1.5, 3.0, 3.0, 2.0, 5.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.5, 1.0, 5.0, 5.0, 2.5, 1.5, 5.0, 4.5, 1.0, 1.0, 1.0, 5.0, 1.5, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0};
        field_c = false;
    }
}
