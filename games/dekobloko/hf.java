/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hf {
    static String field_b;
    static String field_c;
    static String field_g;
    static ck[][] field_e;
    static String field_h;
    private RandomAccessFile field_f;
    static String field_a;
    private long field_i;
    private long field_d;

    final int a(byte[] param0, byte param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -33) {
            field_h = (String) null;
          }
          var5_int = this.field_f.read(param0, param2, param3);
          if (0 < var5_int) {
            this.field_d = this.field_d + (long)var5_int;
          }
          stackIn_5_0 = var5_int;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("hf.G(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_g = null;
        field_h = null;
        field_c = null;
        if (param0 != 12741) {
          field_g = (String) null;
        }
        field_a = null;
        field_b = null;
        field_e = (ck[][]) null;
    }

    final void a(int param0) throws IOException {
        if (this.field_f != null) {
          this.field_f.close();
          this.field_f = null;
        }
        if (param0 >= -4) {
          CharSequence[] var3 = (CharSequence[]) null;
          hf.a(-21, 99, (CharSequence[]) null, (byte) 32);
        }
    }

    protected final void finalize() throws Throwable {
        if (null != this.field_f) {
          System.out.println("");
          this.a(-86);
        }
    }

    final void a(long param0, int param1) throws IOException {
        this.field_f.seek(param0);
        this.field_d = param0;
        if (param1 < 3) {
          CharSequence[] var5 = (CharSequence[]) null;
          hf.a(69, 18, (CharSequence[]) null, (byte) 126);
        }
    }

    final static String a(int param0, int param1, CharSequence[] param2, byte param3) {
        int var6_int = 0;
        int var7 = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        CharSequence var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence[] var10 = null;
        CharSequence var11 = null;
        var9 = client.field_A ? 1 : 0;
        try {
          if (param0 == 0) {
            stackIn_3_0 = "";
            return stackIn_3_0;
          }
          if (param0 == 1) {
            var11 = param2[param1];
            var4 = var11;
            if (var4 != null) {
              return var11.toString();
            }
            stackIn_8_0 = "null";
            return stackIn_8_0;
          }
          var4_int = param0 + param1;
          var5 = 0;
          for (var6_int = param1; var6_int < var4_int; var6_int++) {
            var7_ref_CharSequence = param2[var6_int];
            if (var7_ref_CharSequence == null) {
              var5 += 4;
            } else {
              var5 = var5 + var7_ref_CharSequence.length();
            }
          }
          var6 = new StringBuilder(var5);
          if (param3 != 74) {
            var10 = (CharSequence[]) null;
            hf.a(-7, 123, (CharSequence[]) null, (byte) 21);
          }
          for (var7 = param1; var7 < var4_int; var7++) {
            var8 = param2[var7];
            if (var8 == null) {
              discarded$0 = var6.append("null");
            } else {
              discarded$1 = var6.append(var8);
            }
          }
          stackIn_24_0 = var6.toString();
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_27_0 = var4_ref;
          stackIn_27_1 = new StringBuilder().append("hf.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param3).append(')').toString());
        }
    }

    final long a(byte param0) throws IOException {
        if (param0 != -50) {
          return -2L;
        }
        return this.field_f.length();
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        try {
          if (((long)param3 + this.field_d) > this.field_i) {
            this.field_f.seek(this.field_i);
            this.field_f.write(1);
            throw new EOFException();
          }
          int var5_int = 96 % ((param1 + 35) / 49);
          this.field_f.write(param0, param2, param3);
          this.field_d = this.field_d + (long)param3;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "hf.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    hf(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
          if (-1L == param2) {
            param2 = 9223372036854775807L;
          }
          if (param2 < param0.length()) {
            param0.delete();
          }
          this.field_f = new RandomAccessFile(param0, param1);
          this.field_d = 0L;
          this.field_i = param2;
          var5_int = this.field_f.read();
          if (var5_int != -1 &&
            !param1.equals("r")) {
            this.field_f.seek(0L);
            this.field_f.write(var5_int);
          }
          this.field_f.seek(0L);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "hf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_b = "Visit the Account Management section on the main site to view.";
        field_a = "<%0>'s game";
        field_h = "Report abuse";
        field_e = new ck[8][];
        field_g = "No players";
        field_c = "<%0> has joined your game.";
    }
}
