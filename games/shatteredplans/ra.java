/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ra {
    private long field_h;
    static int[] field_f;
    static int[] field_a;
    static boolean[] field_i;
    static float field_e;
    private long field_b;
    static int field_g;
    static String field_c;
    static String field_j;
    static int field_k;
    private RandomAccessFile field_d;

    final int a(int param0, int param1, int param2, byte[] param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.field_d.read(param3, param1, param0);
          if (param2 < var5_int) {
            this.field_h = this.field_h + (long)var5_int;
          }
          stackIn_3_0 = var5_int;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("ra.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1, ag[] param2) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param0) {
            field_g = -122;
          }
          for (var3_int = 1; var3_int < param1; var3_int++) {
            wl.a(var3_int, 46, param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ra.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final long b(int param0) throws IOException {
        if (param0 != 3) {
          field_c = (String) null;
        }
        return this.field_d.length();
    }

    final void c(int param0) throws IOException {
        if (param0 != 10) {
          ra.a(-125, 93);
        }
        if (this.field_d != null) {
          this.field_d.close();
          this.field_d = null;
        }
    }

    final static void a(java.math.BigInteger param0, ob param1, int param2, int param3, java.math.BigInteger param4, byte[] param5, int param6) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int var9Lifetime1;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var7_int = ef.a(param6, 57);
          if (ro.field_b == null) {
            ro.field_b = new java.security.SecureRandom();
          }
          var13 = new int[4];
          var12 = var13;
          var8 = var12;
          for (var9 = param3; var9 < 4; var9++) {
            var8[var9] = ro.field_b.nextInt();
          }
          if (null == ih.field_c ||
            !(ih.field_c.field_h.length >= var7_int)) {
            ih.field_c = new ob(var7_int);
          }
          ih.field_c.field_j = 0;
          ih.field_c.a(param2, param6, param5, 22186);
          ih.field_c.a(var7_int, (byte) -103);
          ih.field_c.a(var13, param3 ^ 107);
          if (il.field_kb == null ||
            !(il.field_kb.field_h.length >= 100)) {
            il.field_kb = new ob(100);
          }
          il.field_kb.field_j = 0;
          il.field_kb.c(10, (byte) -81);
          var11 = 0;
          var9Lifetime1 = var11;
          while (var11 < 4) {
            il.field_kb.e(11135, var13[var11]);
            var11++;
          }
          il.field_kb.d(param6, 255);
          il.field_kb.a(param4, param0, (byte) -86);
          param1.a(0, il.field_kb.field_j, il.field_kb.field_h, 22186);
          param1.a(0, ih.field_c.field_j, ih.field_c.field_h, param3 ^ 22186);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_22_0 = var7;
          stackIn_22_1 = new StringBuilder().append("ra.A(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param5 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param6).append(')').toString());
        }
    }

    protected final void finalize() throws Throwable {
        if (this.field_d != null) {
          System.out.println("");
          this.c(10);
        }
    }

    final static void a(int param0, int param1) {
        im.field_b = new int[3];
        wm.field_d = new nf[param1 * 15];
        da.field_g = 0;
        kp.field_i = param1;
        int var2 = -27 % ((param0 + 56) / 49);
    }

    final void a(long param0, byte param1) throws IOException {
        this.field_d.seek(param0);
        if (param1 <= 25) {
          ra.a(false);
        }
        this.field_h = param0;
    }

    public static void a(boolean param0) {
        if (param0) {
          field_j = (String) null;
        }
        field_i = null;
        field_j = null;
        field_a = null;
        field_f = null;
        field_c = null;
    }

    final void a(byte[] param0, int param1, byte param2, int param3) throws IOException {
        try {
          if (param2 != 11) {
            field_g = -73;
          }
          if (this.field_b < ((long)param1 + this.field_h)) {
            this.field_d.seek(this.field_b);
            this.field_d.write(1);
            throw new EOFException();
          }
          this.field_d.write(param0, param3, param1);
          this.field_h = this.field_h + (long)param1;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "ra.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0) {
        bc.field_c[field_k] = gf.field_h;
        cb.field_f[field_k] = gf.field_i;
        dk.field_b[field_k] = gf.field_l;
        if (param0 >= -103) {
          ra.a(109, 107);
        }
        bf.field_c[field_k] = gf.field_a;
        da.field_d[field_k] = gf.field_f;
        oj.field_Cb[field_k] = gf.field_b;
        vp.field_s[field_k] = gf.field_k;
        field_k = field_k + 1;
    }

    ra(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
          if (param2 == -1L) {
            param2 = 9223372036854775807L;
          }
          if (param2 < param0.length()) {
            param0.delete();
          }
          this.field_d = new RandomAccessFile(param0, param1);
          this.field_b = param2;
          this.field_h = 0L;
          var5_int = this.field_d.read();
          if (var5_int != -1 &&
            !param1.equals("r")) {
            this.field_d.seek(0L);
            this.field_d.write(var5_int);
          }
          this.field_d.seek(0L);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "ra.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_f = new int[8192];
        field_c = "Using a hastily converted fleet of experimental vessels, a small fraction of humanity managed to escape the scorched ruins of Earth.";
        field_j = "<%0> has not yet unlocked this option for use.";
        field_g = -1;
        field_k = 0;
    }
}
