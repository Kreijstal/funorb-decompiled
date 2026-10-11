/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class eg {
    static String field_d;
    private long field_b;
    private long field_a;
    static int field_h;
    static ci field_f;
    static String field_j;
    static int field_i;
    static long field_e;
    private RandomAccessFile field_c;
    static String field_g;

    protected final void finalize() throws Throwable {
        if (null != this.field_c) {
          System.out.println("");
          this.a(10992);
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        try {
          if (((long)param3 + this.field_a) > this.field_b) {
            this.field_c.seek(this.field_b);
            this.field_c.write(1);
            throw new EOFException();
          }
          if (param1 != -1036) {
            field_i = -36;
          }
          this.field_c.write(param2, param0, param3);
          this.field_a = this.field_a + (long)param3;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "eg.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, le param3, le param4, int param5) {
        ig.field_b = param3;
        mf.field_z = param1;
        uc.field_g = param4;
        fh.field_e = param2;
        if (param5 != 4) {
          return;
        }
        try {
          gm.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "eg.H(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final long a(byte param0) throws IOException {
        int var2 = 73 / ((-1 - param0) / 50);
        return this.field_c.length();
    }

    public static void b(int param0) {
        field_d = null;
        field_g = null;
        field_j = null;
        if (param0 != -1) {
          return;
        }
        field_f = null;
    }

    final int a(int param0, byte[] param1, int param2, byte param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = -41 % ((-26 - param3) / 49);
          var5_int = this.field_c.read(param1, param0, param2);
          if (var5_int > 0) {
            this.field_a = this.field_a + (long)var5_int;
          }
          stackIn_3_0 = var5_int;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("eg.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(long param0, int param1) throws IOException {
        this.field_c.seek(param0);
        this.field_a = param0;
        if (param1 != -11526) {
          field_f = (ci) null;
          return;
        }
    }

    final static void a(int[] param0, String[] param1, int param2, boolean param3, um param4, km[][] param5, String[][] param6, um param7, byte[] param8, int param9, um param10, String[][] param11, byte[] param12, int param13, km[][] param14) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15 = null;
        rk[] var16 = null;
        int[] var17 = null;
        try {
          if (param2 > -108) {
            eg.a((int[]) null, (String[]) null, 1, true, (um) null, (km[][]) null, (String[][]) null, (um) null, (byte[]) null, 64, (um) null, (String[][]) null, (byte[]) null, -39, (km[][]) null);
          }
          var17 = (int[]) null;
          var16 = (rk[]) null;
          ak.a(param5, param8, (int[]) null, param10, param12, param9, (rk[]) null, param13, param1, param11, param0, 22193, param14, param4, param7, param3, param6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          stackIn_6_0 = var15;
          stackIn_6_1 = new StringBuilder().append("eg.A(");
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
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param5 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param6 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param7 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param8 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param11 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param12 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param13).append(',');
          if (param14 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (param0 < 0) {
          return param0;
        }
        if (param1 != 0) {
          eg.a((int[]) null, (String[]) null, -25, true, (um) null, (km[][]) null, (String[][]) null, (um) null, (byte[]) null, 53, (um) null, (String[][]) null, (byte[]) null, -67, (km[][]) null);
          if (param2 != param0) {
            return 1;
          }
          return 0;
        }
        if (param2 != param0) {
          return 1;
        }
        return 0;
    }

    final void a(int param0) throws IOException {
        if (null != this.field_c) {
          this.field_c.close();
          this.field_c = null;
        }
        if (param0 == 10992) {
          return;
        }
        field_f = (ci) null;
    }

    eg(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
          if (-1L == param2) {
            param2 = 9223372036854775807L;
          }
          if (param2 < param0.length()) {
            param0.delete();
          }
          this.field_c = new RandomAccessFile(param0, param1);
          this.field_b = param2;
          this.field_a = 0L;
          var5_int = this.field_c.read();
          if (-1 != var5_int &&
            !param1.equals("r")) {
            this.field_c.seek(0L);
            this.field_c.write(var5_int);
          }
          this.field_c.seek(0L);
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "eg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_h = 4;
        field_j = null;
        field_g = "That name is not available";
        field_d = "<%0> has resigned and left.";
    }
}
