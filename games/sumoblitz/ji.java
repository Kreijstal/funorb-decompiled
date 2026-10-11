/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ji {
    static String field_a;
    static String field_b;

    final static int a(boolean param0) {
        try {
          int stackIn_16_0 = 0;
          int stackIn_27_0 = 0;
          int stackIn_30_0 = 0;
          int stackIn_35_0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          fs var2 = null;
          if (4 <= jk.field_b.field_d) {
            if (jk.field_b.field_j == -1) {
              return 3;
            }
            if (jk.field_b.field_j == -2) {
              return 4;
            }
            return 1;
          }
          try {
            if (cd.field_d == 0) {
              dt.field_p = gk.field_u.a((byte) 51, gd.field_a, ie.field_x);
              cd.field_d = cd.field_d + 1;
            }
            if (!param0) {
              field_b = (String) null;
            }
            if (cd.field_d == 1) {
              if (dt.field_p.field_c == 2) {
                stackIn_16_0 = tm.a(-1, -84);
                return stackIn_16_0;
              }
              if (dt.field_p.field_c == 1) {
                cd.field_d = cd.field_d + 1;
              }
            }
            if (cd.field_d == 2) {
              tj.field_n = new dt((java.net.Socket) (dt.field_p.field_d), gk.field_u);
              var2 = new fs(13);
              sb.a(ow.field_e, 127, bt.field_d, rd.field_l, var2);
              var2.b((byte) 127, 15);
              var2.e(48, qq.field_P);
              tj.field_n.a(0, -2, var2.field_n, 13);
              cd.field_d = cd.field_d + 1;
              gb.field_s = wq.a(-109) + 30000L;
            }
            if (cd.field_d == 3) {
              if (tj.field_n.c(-91) > 0) {
                var1_int = tj.field_n.a(-106);
                if (var1_int != 0) {
                  stackIn_30_0 = tm.a(var1_int, -93);
                  return stackIn_30_0;
                }
                cd.field_d = cd.field_d + 1;
              } else {
                if (wq.a(-52) > gb.field_s) {
                  stackIn_27_0 = tm.a(-2, -89);
                  return stackIn_27_0;
                }
              }
            }
            if (cd.field_d != 4) {
              return -1;
            }
            jk.field_b.a(vk.field_e, (byte) 114, tj.field_n);
            dt.field_p = null;
            tj.field_n = null;
            cd.field_d = 0;
            stackIn_35_0 = 0;
            return stackIn_35_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IOException) (Object) decompiledCaughtException;
            return tm.a(-3, -94);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static String a(java.applet.Applet param0, byte param1, String param2) {
        try {
          int var5 = 0;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          String stackIn_8_0 = null;
          Object stackIn_13_0 = null;
          RuntimeException stackIn_16_0 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3_ref = null;
          RuntimeException var3_ref2 = null;
          var7 = Sumoblitz.field_L ? 1 : 0;
          try {
            try {
              var3 = (String) (tw.a(param0, -32, "getcookies"));
              var4 = cn.a(';', var3, -27224);
              if (param1 != -57) {
                ji.a(-92);
              }
              for (var5 = 0; var4.length > var5; var5++) {
                var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(param2)) {
                  stackIn_8_0 = var4[var5].substring(1 + var6).trim();
                  return stackIn_8_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = decompiledCaughtException;
            }
            stackIn_13_0 = null;
            return (String) (stackIn_13_0);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_16_0 = var3_ref2;
            stackIn_16_1 = new StringBuilder().append("ji.B(");
            if (param0 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw qo.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(String param0, byte param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var5 = 0;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          var2_int = param0.length();
          var3 = new char[var2_int];
          for (var4 = 0; var2_int > var4; var4++) {
            var3[-1 + var2_int - var4] = param0.charAt(var4);
          }
          if (param1 <= 61) {
            field_b = (String) null;
          }
          stackIn_7_0 = new String(var3);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("ji.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
          return;
        }
        field_b = null;
    }

    static {
        field_b = "Use this alternative as your account name";
        field_a = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    }
}
