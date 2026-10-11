/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class i {
    static String field_g;
    static vj field_b;
    static String field_f;
    static String field_a;
    static int field_c;
    static int field_d;
    static w field_e;

    final static int a(int param0) {
        if (param0 != 1) {
          return -83;
        }
        return ql.field_c;
    }

    public static void b(int param0) {
        field_g = null;
        field_e = null;
        field_b = null;
        field_f = null;
        if (param0 != 28180) {
          return;
        }
        field_a = null;
    }

    final static void a(wl param0, int param1) {
        try {
          int var4 = 0;
          byte[] var2 = null;
          int var3_int = 0;
          Exception var3 = null;
          int var5 = 0;
          byte[] var6 = null;
          RuntimeException stackIn_19_0 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var2_ref = null;
          var5 = client.field_A ? 1 : 0;
          try {
            var6 = new byte[24];
            var2 = var6;
            if (dj.field_cb != null) {
              try {
                dj.field_cb.a(0L, (byte) -109);
                dj.field_cb.a(var6, (byte) -76);
                for (var3_int = 0; var3_int < 24; var3_int++) {
                  if (var2[var3_int] == 0) {
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
                for (var4 = 0; var4 < 24; var4++) {
                  var2[var4] = (byte)-1;
                }
              }
              param0.a(false, 24, var2, param1);
            } else {
              param0.a(false, 24, var2, param1);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_19_0 = var2_ref;
            stackIn_19_1 = new StringBuilder().append("i.A(");
            if (param0 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw dh.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static byte[] a(byte[] param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        byte[] var6 = null;
        byte[] var7 = null;
        wl var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] stackIn_19_0 = null;
        byte[] stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        Object var8 = null;
        try {
          var10 = new wl(param0);
          var3 = var10.d((byte) -119);
          var5 = -11 / ((-4 - param1) / 59);
          var4 = var10.i(7553);
          if (var4 >= 0 && (ad.field_u == 0 ||
            !(var4 > ad.field_u))) {
            if (var3 == 0) {
              var14 = new byte[var4];
              var12 = var14;
              var6 = var12;
              var10.a(var14, 0, (byte) 126, var4);
              stackIn_21_0 = var6;
              return stackIn_21_0;
            }
            var6_int = var10.i(7553);
            if (var6_int >= 0 && (ad.field_u == 0 ||
              !(ad.field_u < var6_int))) {
              var13 = new byte[var6_int];
              var11 = var13;
              var7 = var11;
              if (1 != var3) {
                var8 = jf.field_g;
                synchronized (var8) {
                  jf.field_g.a((byte) 111, var10, var13);
                }
              } else {
                td.a(var13, var6_int, param0, var4, 9);
              }
              stackIn_19_0 = var7;
              return stackIn_19_0;
            }
            throw new RuntimeException();
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("i.C(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_a = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_f = "Create a free Account";
        field_g = "Accept";
    }
}
