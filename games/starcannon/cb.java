/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cb {
    static int field_f;
    private long field_e;
    static byte[] field_b;
    static ae field_d;
    static long field_a;
    private long field_g;
    private RandomAccessFile field_h;
    static ue field_c;

    final static byte[] a(String param0, byte param1) {
        RuntimeException var2 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -124) {
            stackIn_4_0 = ri.field_c.a("", (byte) -128, param0);
            return stackIn_4_0;
          }
          stackIn_2_0 = (byte[]) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("cb.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, long param1) throws IOException {
        this.field_h.seek(param1);
        if (param0 != 0) {
          cb.b(17);
        }
        this.field_e = param1;
    }

    final long c(int param0) throws IOException {
        int var2 = -109 % ((44 - param0) / 55);
        return this.field_h.length();
    }

    final void a(int param0) throws IOException {
        if (null != this.field_h) {
          this.field_h.close();
          this.field_h = null;
        }
        if (param0 != 1) {
          cb.b(false);
        }
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        try {
          if (param2 != 494) {
            field_b = (byte[]) null;
          }
          if (this.field_g < (long)param3 + this.field_e) {
            this.field_h.seek(this.field_g);
            this.field_h.write(1);
            throw new EOFException();
          }
          this.field_h.write(param1, param0, param3);
          this.field_e = this.field_e + (long)param3;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "cb.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final int a(byte[] param0, int param1, int param2, byte param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 > -72) {
            cb.a((byte) 54);
          }
          var5_int = this.field_h.read(param0, param1, param2);
          if (var5_int > 0) {
            this.field_e = this.field_e + (long)var5_int;
          }
          stackIn_5_0 = var5_int;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("cb.G(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        oj var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ia var12 = null;
        int var13 = 0;
        int var14 = 0;
        ia var15 = null;
        int[][] var19 = null;
        int var6_intLifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        try {
          var12 = se.field_p;
          var15 = var12;
          var2 = var15.j(7909);
          var3 = (oj) (uc.field_b.c(-3905));
          while (var3 != null) {
            if (var3.field_i != var2) {
              var3 = (oj) (uc.field_b.a(-16913));
              continue;
            }
            break;
          }
          if (var3 == null) {
            ec.a((byte) 27);
            return;
          }
          if (param0 > -93) {
            cb.b(false);
          }
          var4 = var15.j(7909);
          if (0 != var4) {
            var5 = var3.field_h;
            ef.field_f[0] = we.field_i;
            for (var6_int = 1; var6_int < var4; var6_int++) {
              ef.field_f[var6_int] = var12.a(-103);
            }
            ai.a(var5, false, var4);
            for (var6_intLifetime1 = 0; var4 > var6_intLifetime1; var6_intLifetime1++) {
              o.a(-20954, var15);
              if (var6_intLifetime1 != 0) {
                fa.a(mc.field_f, var6_intLifetime1, og.field_f, rb.field_i, ta.field_e, -106);
              } else {
                fa.a(mc.field_f, var6_intLifetime1, og.field_f, rb.field_i, ta.field_e, 12);
              }
            }
            kk.a(var5, 42);
            var6 = new String[2][var5];
            var19 = new int[2][var5 * 4];
            var8 = ed.field_p;
            var9 = 0;
            var10 = 0;
            while (var9 < var8) {
              var11 = jk.field_c[var9];
              var6[0][var10] = ef.field_f[var11];
              var19[0][var10 * 4] = tk.field_f[var11];
              var19[0][1 + var10 * 4] = nf.field_b[var11];
              var19[0][2 + 4 * var10] = gj.field_f[var11];
              var19[0][4 * var10 + 3] = ab.field_G[var11];
              if (mc.a(ef.field_f[var11], 0) &&
                0 == nf.field_b[var11] + (gj.field_f[var11] + ab.field_G[var11])) {
                var6[0][var10] = null;
                var10--;
              }
              var10++;
              var9++;
            }
            var13 = 0;
            var9Lifetime1 = var13;
            var14 = 0;
            var10Lifetime1 = var14;
            while (var8 > var13) {
              var11Lifetime1 = jk.field_c[var13 + var5];
              var6[1][var14] = ef.field_f[var11Lifetime1];
              var19[1][4 * var14] = tk.field_f[var11Lifetime1];
              var19[1][1 + 4 * var14] = nf.field_b[var11Lifetime1];
              var19[1][2 + 4 * var14] = gj.field_f[var11Lifetime1];
              var19[1][4 * var14 + 3] = ab.field_G[var11Lifetime1];
              if (mc.a(ef.field_f[var11Lifetime1], 0) &&
                nf.field_b[var11Lifetime1] + gj.field_f[var11Lifetime1] + ab.field_G[var11Lifetime1] == 0) {
                var6[1][var14] = null;
                var14--;
              }
              var14++;
              var13++;
            }
            var3.b(4);
            return;
          }
          var3.b(4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1), "cb.H(" + param0 + ')');
        }
    }

    public static void b(int param0) {
        if (param0 != 0) {
          field_b = (byte[]) null;
        }
        field_b = null;
        field_d = null;
        field_c = null;
    }

    final static String b(boolean param0) {
        if (we.field_i == null) {
          return "";
        }
        if (!param0) {
          field_c = (ue) null;
        }
        return we.field_i;
    }

    protected final void finalize() throws Throwable {
        if (null != this.field_h) {
          System.out.println("");
          this.a(1);
        }
    }

    final static boolean a(boolean param0) {
        if (param0) {
          cb.a(true);
        }
        return nd.b(true);
    }

    cb(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
          if (-1L == param2) {
            param2 = 9223372036854775807L;
          }
          if (param0.length() > param2) {
            param0.delete();
          }
          this.field_h = new RandomAccessFile(param0, param1);
          this.field_g = param2;
          this.field_e = 0L;
          var5_int = this.field_h.read();
          if (var5_int != -1 &&
            !param1.equals("r")) {
            this.field_h.seek(0L);
            this.field_h.write(var5_int);
          }
          this.field_h.seek(0L);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "cb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_b = new byte[520];
        field_d = new ae();
    }
}
