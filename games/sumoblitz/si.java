/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class si extends nn {
    private java.nio.ByteBuffer field_b;
    static int field_c;
    static hr field_e;
    static hr field_d;

    final static int c(int param0, int param1) {
        int var2;
        File var3;
        int var2Lifetime1;
        if (param0 == 0) {
          return 0;
        }
        if (param0 > 0) {
          var2 = 1;
          if (65535 < param0) {
            var2 += 16;
            param0 = param0 >> 16;
          }
          if (param0 > 255) {
            var2 += 8;
            param0 = param0 >> 8;
          }
          if (param0 > 15) {
            var2 += 4;
            param0 = param0 >> 4;
          }
          if (param0 > 3) {
            var2 += 2;
            param0 = param0 >> 2;
          }
          if (param0 > 1) {
            var2++;
            param0 = param0 >> 1;
          }
          return var2;
        }
        var2Lifetime1 = 2;
        if (param0 < -65536) {
          param0 = param0 >> 16;
          var2Lifetime1 += 16;
        }
        if (param1 == 1) {
          if (param0 < -256) {
            param0 = param0 >> 8;
            var2Lifetime1 += 8;
          }
          if (-16 > param0) {
            param0 = param0 >> 4;
            var2Lifetime1 += 4;
          }
          if (-4 > param0) {
            param0 = param0 >> 2;
            var2Lifetime1 += 2;
          }
          if (param0 < -2) {
            var2Lifetime1++;
            param0 = param0 >> 1;
          }
          return var2Lifetime1;
        }
        var3 = (File) null;
        si.a((File) null, (byte) 38);
        if (param0 < -256) {
          param0 = param0 >> 8;
          var2Lifetime1 += 8;
        }
        if (-16 > param0) {
          param0 = param0 >> 4;
          var2Lifetime1 += 4;
        }
        if (-4 > param0) {
          param0 = param0 >> 2;
          var2Lifetime1 += 2;
        }
        if (param0 < -2) {
          var2Lifetime1++;
          param0 = param0 >> 1;
        }
        return var2Lifetime1;
    }

    final void a(byte[] param0, int param1) {
        try {
          int var3_int = -124 % ((param1 + 47) / 62);
          this.field_b = java.nio.ByteBuffer.allocateDirect(param0.length);
          this.field_b.position(0);
          this.field_b.put(param0);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "si.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static byte[] a(File param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -1 % ((39 - param1) / 49);
          stackIn_1_0 = kq.a((int)param0.length(), param0, (byte) 103);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("si.N(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    si() {
    }

    final byte[] a(int param0, int param1, int param2) {
        byte[] var6 = null;
        byte[] var4 = null;
        byte[] var6Lifetime1;
        byte[] var4Lifetime1;
        if (param2 == 15747) {
          var6 = new byte[param1];
          var4 = var6;
          this.field_b.position(param0);
          this.field_b.get(var6, 0, param1);
          return var6;
        }
        java.applet.Applet var5 = (java.applet.Applet) null;
        si.a((java.applet.Applet) null, (byte) 104);
        var6Lifetime1 = new byte[param1];
        var4Lifetime1 = var6Lifetime1;
        this.field_b.position(param0);
        this.field_b.get(var6Lifetime1, 0, param1);
        return var6Lifetime1;
    }

    public static void b(int param0) {
        int var1 = -2 / ((param0 - 65) / 43);
        field_d = null;
        field_e = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        kd.field_a[param5] = param4;
        if (param3 != 2) {
          return;
        }
        try {
          za.field_l[param5] = param2;
          nj.field_d[param5] = param6;
          pj.field_k[param5] = param0;
          rh.field_s[param5] = param1;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "si.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        RuntimeException runtimeException = null;
        String var2 = null;
        CharSequence var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = param0.getParameter("username");
          if (var2 != null) {
            var3 = (CharSequence) ((Object) var2);
            if (vo.a(var3, 7441) != 0L) {
              if (param1 > -42) {
                field_c = -99;
              }
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_9_0 = runtimeException;
          stackIn_9_1 = new StringBuilder().append("si.M(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final byte[] a(boolean param0) {
        byte[] var3 = new byte[this.field_b.capacity()];
        byte[] var2 = var3;
        this.field_b.position(0);
        this.field_b.get(var3);
        if (!param0) {
          return var3;
        }
        this.a(false);
        return var3;
    }

    static {
        field_c = 0;
    }
}
