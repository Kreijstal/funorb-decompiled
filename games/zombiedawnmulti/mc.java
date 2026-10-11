/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mc {
    static vg field_i;
    private long field_c;
    static pd field_a;
    static ri[] field_h;
    static String field_g;
    static String field_b;
    static int field_e;
    private long field_d;
    private RandomAccessFile field_f;

    final void a(byte param0, long param1) throws IOException {
        this.field_f.seek(param1);
        this.field_c = param1;
        if (param0 >= -123) {
          this.field_c = -76L;
          return;
        }
    }

    public static void a(byte param0) {
        field_i = null;
        field_h = null;
        field_a = null;
        if (param0 > 81) {
          field_g = null;
          field_b = null;
          return;
        }
        mc.a((byte) -64);
        field_g = null;
        field_b = null;
    }

    final int a(int param0, byte[] param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.field_f.read(param1, param3, param0);
          if (~var5_int < param2) {
            this.field_c = this.field_c + (long)var5_int;
          }
          stackIn_3_0 = var5_int;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("mc.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    protected final void finalize() throws Throwable {
        if (this.field_f != null) {
          System.out.println("");
          this.b((byte) 38);
        }
    }

    final static String a(long param0, byte param1) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        int var3;
        long var4;
        StringBuilder var6;
        long var7;
        int var9;
        int var10;
        int var11;
        StringBuilder var12;
        StringBuilder var13;
        long var7Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 <= 0L) {
          return null;
        }
        if (param0 >= 6582952005840035281L) {
          return null;
        }
        if (param0 % 37L == 0L) {
          return null;
        }
        var3 = 0;
        var4 = param0;
        while (var4 != 0L) {
          var3++;
          var4 = var4 / 37L;
        }
        if (param1 == 26) {
          var12 = new StringBuilder(var3);
          while (param0 != 0L) {
            var7 = param0;
            param0 = param0 / 37L;
            var9 = hq.field_o[(int)(-(param0 * 37L) + var7)];
            if (var9 == 95) {
              var10 = -1 + var12.length();
              var12.setCharAt(var10, Character.toUpperCase(var12.charAt(var10)));
              var9 = 160;
            }
            discarded$0 = var12.append((char) var9);
          }
          var12.reverse();
          var12.setCharAt(0, Character.toUpperCase(var12.charAt(0)));
          return var12.toString();
        }
        mc.a((byte) 85);
        var13 = new StringBuilder(var3);
        var6 = var13;
        while (param0 != 0L) {
          var7Lifetime1 = param0;
          param0 = param0 / 37L;
          var9Lifetime1 = hq.field_o[(int)(-(param0 * 37L) + var7Lifetime1)];
          if (var9Lifetime1 == 95) {
            var10Lifetime1 = -1 + var13.length();
            var13.setCharAt(var10Lifetime1, Character.toUpperCase(var13.charAt(var10Lifetime1)));
            var9Lifetime1 = 160;
          }
          discarded$1 = var13.append((char) var9Lifetime1);
        }
        var13.reverse();
        var13.setCharAt(0, Character.toUpperCase(var13.charAt(0)));
        return var13.toString();
    }

    final void a(byte param0, int param1, int param2, byte[] param3) throws IOException {
        if (this.field_d < this.field_c + (long)param2) {
          this.field_f.seek(this.field_d);
          this.field_f.write(1);
          throw new EOFException();
        }
        this.field_f.write(param3, param1, param2);
        if (param0 <= 9) {
          return;
        }
        try {
          this.field_c = this.field_c + (long)param2;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "mc.D(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final long a(int param0) throws IOException {
        if (param0 > -97) {
          field_e = 20;
          return this.field_f.length();
        }
        return this.field_f.length();
    }

    final void b(byte param0) throws IOException {
        if (param0 != 38) {
          field_i = (vg) null;
          if (null != this.field_f) {
            this.field_f.close();
            this.field_f = null;
            return;
          }
          return;
        }
        if (null == this.field_f) {
          return;
        }
        this.field_f.close();
        this.field_f = null;
    }

    mc(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
          if (param2 == -1L) {
            param2 = 9223372036854775807L;
          }
          if (param2 < param0.length()) {
            param0.delete();
          }
          this.field_f = new RandomAccessFile(param0, param1);
          this.field_c = 0L;
          this.field_d = param2;
          var5_int = this.field_f.read();
          if (-1 != var5_int &&
            !param1.equals("r")) {
            this.field_f.seek(0L);
            this.field_f.write(var5_int);
          }
          this.field_f.seek(0L);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "mc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_b = "Try changing the following settings:  ";
        field_i = null;
    }
}
