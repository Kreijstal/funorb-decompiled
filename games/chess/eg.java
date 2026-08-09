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
        if (!(null == this.field_c)) {
            System.out.println("");
            this.a(10992);
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        try {
            if (!(((long)param3 + this.field_a ^ -1L) >= (this.field_b ^ -1L))) {
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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var6 = -41 % ((-26 - param3) / 49);
              var5_int = this.field_c.read(param1, param0, param2);
              if ((var5_int ^ -1) >= -1) {
                break L1;
              } else {
                this.field_a = this.field_a + (long)var5_int;
                break L1;
              }
            }
            stackIn_3_0 = var5_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("eg.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15 = null;
        rk[] var16 = null;
        int[] var17 = null;
        try {
          L0: {
            L1: {
              if (param2 <= -108) {
                break L1;
              } else {
                eg.a((int[]) null, (String[]) null, 1, true, (um) null, (km[][]) null, (String[][]) null, (um) null, (byte[]) null, 64, (um) null, (String[][]) null, (byte[]) null, -39, (km[][]) null);
                break L1;
              }
            }
            var17 = (int[]) null;
            var16 = (rk[]) null;
            ak.a(param5, param8, (int[]) null, param10, param12, param9, (rk[]) null, param13, param1, param11, param0, 22193, param14, param4, param7, param3, param6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var15 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var15);

            stackIn_6_1 = new StringBuilder().append("eg.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param5 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param6 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param7 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param8 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param9).append(',');

            if (param10 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L9;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');

            if (param11 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L10;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param12 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L11;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_36_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',').append(param13).append(',');

            if (param14 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L12;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L12;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_7_0), stackIn_37_2 + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (-1 >= (param0 ^ -1)) {
          if (param1 == 0) {
            if (param2 == param0) {
              return 0;
            } else {
              return 1;
            }
          } else {
            eg.a((int[]) null, (String[]) null, -25, true, (um) null, (km[][]) null, (String[][]) null, (um) null, (byte[]) null, 53, (um) null, (String[][]) null, (byte[]) null, -67, (km[][]) null);
            if (param2 == param0) {
              return 0;
            } else {
              return 1;
            }
          }
        } else {
          return param0;
        }
    }

    final void a(int param0) throws IOException {
        L0: {
          if (null != this.field_c) {
            this.field_c.close();
            this.field_c = null;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 10992) {
          field_f = (ci) null;
          return;
        } else {
          return;
        }
    }

    eg(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
            if (-1L == param2) {
                param2 = 9223372036854775807L;
            }
            if ((param2 ^ -1L) > (param0.length() ^ -1L)) {
                param0.delete();
            }
            this.field_c = new RandomAccessFile(param0, param1);
            this.field_b = param2;
            this.field_a = 0L;
            var5_int = this.field_c.read();
            if (-1 != var5_int && !param1.equals("r")) {
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
