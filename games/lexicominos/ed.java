/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class ed extends ca {
    static int field_v;
    int field_x;
    static th field_q;
    int field_p;
    int field_s;
    int field_u;
    int field_w;
    int field_r;
    static String[] field_t;

    public static void c(int param0) {
        field_q = null;
        field_t = null;
        if (param0 >= -31) {
          field_v = -74;
        }
    }

    final static void a(int param0, wf param1) {
        try {
          int var4 = 0;
          RuntimeException runtimeException = null;
          byte[] var2 = null;
          int var3_int = 0;
          Exception var3 = null;
          int var5 = 0;
          wf var6 = null;
          byte[] var7 = null;
          byte[] var8 = null;
          byte[] var9 = null;
          byte[] var10 = null;
          byte[] var11 = null;
          RuntimeException stackIn_19_0 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          var5 = Lexicominos.field_L ? 1 : 0;
          try {
            var10 = new byte[24];
            var8 = var10;
            var7 = var8;
            var11 = var7;
            var9 = var11;
            var2 = var9;
            if (null != kf.field_y) {
              try {
                kf.field_y.a((byte) 40, 0L);
                kf.field_y.a(var10, 0);
                for (var3_int = 0; 24 > var3_int; var3_int++) {
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
                for (var4 = 0; var4 < 24; var4++) {
                  var2[var4] = (byte)-1;
                }
              }
            }
            if (param0 <= 79) {
              var6 = (wf) null;
              ed.a(-106, (wf) null);
            }
            param1.a(0, var11, 255, 24);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            runtimeException = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_19_0 = runtimeException;
            stackIn_19_1 = new StringBuilder().append("ed.GB(").append(param0).append(',');
            if (param1 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw ld.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, sh param1) {
        sd var2 = null;
        try {
          sd.b(param1.a((byte) 127, "", "headers.packvorbis"));
          if (param0 != 0) {
            ed.c(-110);
          }
          var2 = sd.a(param1, "jagex logo2.packvorbis", "");
          var2.c();
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "ed.FB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static eb[] a(sh param0, boolean param1) {
        int var8 = 0;
        eb[] var2 = null;
        RuntimeException var2_ref = null;
        wf var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        eb var7 = null;
        int var9 = 0;
        eb[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = Lexicominos.field_L ? 1 : 0;
        try {
          var2 = new eb[64];
          if (!param1) {
            field_q = (th) null;
          }
          var3 = new wf(param0.a((byte) 127, "", "index"));
          while (var3.field_j.length > var3.field_h) {
            var4 = var3.d(true);
            var5 = var3.b(-1698573656);
            var6 = var3.d(true);
            var7 = new eb(var4, var3.b(-1698573656));
            var2[var7.field_g] = var7;
            for (var8 = 0; var8 < var7.field_c.length; var8++) {
              var7.field_c[var8][0] = var3.c(false);
              var7.field_c[var8][1] = var3.c(false);
            }
            var7.a(new wf(param0.a(var5, -27493, var6)), (byte) 96);
          }
          stackIn_10_0 = var2;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_13_0 = var2_ref;
          stackIn_13_1 = new StringBuilder().append("ed.DB(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    ed() {
    }

    static {
        field_v = 0;
    }
}
