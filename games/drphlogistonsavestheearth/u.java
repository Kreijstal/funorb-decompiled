/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class u {
    static vd field_f;
    static String field_e;
    static he[] field_a;
    static he[] field_c;
    static vh field_b;
    static rf field_d;

    final static int a(int param0, byte param1) {
        if (param1 != 74) {
          field_b = (vh) null;
        }
        param0 = param0 & 8191;
        if (param0 >= 4096) {
          return param0 < 6144 ? -tc.field_a[6144 - param0] : tc.field_a[param0 - 6144];
        }
        return param0 < 2048 ? tc.field_a[2048 - param0] : -tc.field_a[param0 - 2048];
    }

    final static boolean a(String param0, boolean param1, String param2) {
        RuntimeException var3 = null;
        vj var4 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (oi.a(8975, param0)) {
            return false;
          }
          if (g.b((byte) 99, param0)) {
            return false;
          }
          if (kj.a(param0, (byte) 59)) {
            return false;
          }
          if (param1) {
            var4 = (vj) null;
            u.a((vj) null, 120, -66);
          }
          if (param2.length() == 0) {
            return true;
          }
          if (rb.a(param2, param0, -1)) {
            return false;
          }
          if (gk.a(-1, param2, param0)) {
            return false;
          }
          if (!pc.a((byte) -123, param2, param0)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("u.I(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    abstract void a(od param0, int param1);

    final static ig a(vj param0, int param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        ig stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = param0.b(param2, -2);
          var3 = var4;
          if (var4 == null) {
            return null;
          }
          if (param1 != 0) {
            field_d = (rf) null;
          }
          stackIn_6_0 = new ig(var4);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("u.F(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static int a(String param0, boolean param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2) {
            u.a(-18, (byte) 118);
          }
          if (!param1) {
            stackIn_6_0 = uj.field_i.b(param0);
            return stackIn_6_0;
          }
          stackIn_4_0 = cj.field_a.b(param0);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("u.K(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(od param0, byte param1) {
        try {
          int var4 = 0;
          byte[] var2 = null;
          int var3_int = 0;
          Exception var3 = null;
          int var5 = 0;
          byte[] var6 = null;
          byte[] var7 = null;
          byte[] var8 = null;
          byte[] var9 = null;
          byte[] var10 = null;
          RuntimeException stackIn_21_0 = null;
          StringBuilder stackIn_21_1 = null;
          String stackIn_22_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var2_ref = null;
          var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          try {
            if (param1 >= -62) {
              field_f = (vd) null;
            }
            var9 = new byte[24];
            var7 = var9;
            var6 = var7;
            var10 = var6;
            var8 = var10;
            var2 = var8;
            if (null != mi.field_f) {
              try {
                mi.field_f.a(0L, (byte) -63);
                mi.field_f.a((byte) -111, var9);
                for (var3_int = 0; var3_int < 24; var3_int++) {
                  if (var10[var3_int] == 0) {
                    continue;
                  }
                  break;
                }
                if (var3_int >= 24) {
                  throw new IOException();
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3 = (Exception) (Object) decompiledCaughtException;
                for (var4 = 0; 24 > var4; var4++) {
                  var2[var4] = (byte)-1;
                }
              }
              param0.a(24, 0, 29211, var10);
            } else {
              param0.a(24, 0, 29211, var10);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_21_0 = var2_ref;
            stackIn_21_1 = new StringBuilder().append("u.H(");
            if (param0 == null) {
              stackIn_22_2 = "null";
            } else {
              stackIn_22_2 = "{...}";
            }
            throw ie.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        if (param0 != 50) {
          return;
        }
        field_b = null;
        field_d = null;
        field_f = null;
        field_a = null;
        field_e = null;
        field_c = null;
    }

    abstract db b(byte param0);

    static {
        field_f = new vd();
        field_e = "Player";
        field_b = new vh();
    }
}
