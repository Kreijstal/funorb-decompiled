/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ji {
    private long field_g;
    private long field_f;
    static lc field_b;
    private RandomAccessFile field_h;
    static String field_d;
    static String field_a;
    static String field_c;
    static dk field_e;

    protected final void finalize() throws Throwable {
        if (null != this.field_h) {
          System.out.println("");
          this.b(0);
        }
    }

    final void a(int param0, byte[] param1, int param2, boolean param3) throws IOException {
        try {
          if (param3) {
            ji.a(101);
          }
          if (this.field_f < this.field_g + (long)param0) {
            this.field_h.seek(this.field_f);
            this.field_h.write(1);
            throw new EOFException();
          }
          this.field_h.write(param1, param2, param0);
          this.field_g = this.field_g + (long)param0;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "ji.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final long a(byte param0) throws IOException {
        int var2 = -60 % ((32 - param0) / 41);
        return this.field_h.length();
    }

    final int a(int param0, int param1, int param2, byte[] param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.field_h.read(param3, param1, param0);
          if (var5_int > 0) {
            this.field_g = this.field_g + (long)var5_int;
          }
          if (param2 == 1) {
            stackIn_6_0 = var5_int;
            return stackIn_6_0;
          }
          stackIn_4_0 = 30;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ji.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void a(int param0, long param1) throws IOException {
        this.field_h.seek(param1);
        this.field_g = param1;
        int var4 = -46 % ((param0 + 3) / 59);
    }

    final void b(int param0) throws IOException {
        if (this.field_h != null) {
          this.field_h.close();
          this.field_h = null;
          if (param0 != 0) {
            ji.a(-9);
            return;
          }
          return;
        }
        if (param0 == 0) {
          return;
        }
        ji.a(-9);
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        if (param0 <= -101) {
          field_c = null;
          field_b = null;
          field_e = null;
          return;
        }
        CharSequence var2 = (CharSequence) null;
        ji.a(4, (CharSequence) null);
        field_c = null;
        field_b = null;
        field_e = null;
    }

    final static void a(byte param0, int[] param1, int param2) {
        try {
          ag.field_j[param2] = param1;
          if (param0 >= -36) {
            field_b = (lc) null;
          }
          al.field_j[param2] = new oi(param2);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "ji.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    ji(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
          if (param2 == -1L) {
            param2 = 9223372036854775807L;
          }
          if (param2 < param0.length()) {
            param0.delete();
          }
          this.field_h = new RandomAccessFile(param0, param1);
          this.field_f = param2;
          this.field_g = 0L;
          var5_int = this.field_h.read();
          if (var5_int != -1 &&
            !param1.equals("r")) {
            this.field_h.seek(0L);
            this.field_h.write(var5_int);
          }
          this.field_h.seek(0L);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "ji.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static String a(int param0, CharSequence param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 11) {
            field_c = (String) null;
          }
          var2 = ci.a(jc.a(param1, (byte) -124), 75);
          if (var2 == null) {
            var2 = "";
          }
          stackIn_5_0 = var2;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_8_0 = var2_ref;
          stackIn_8_1 = new StringBuilder().append("ji.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    static {
        field_a = "To report a player, right-click on their name and select the option to report abuse.";
        field_c = "<%0> is not on your friend list.";
        field_d = "If you do nothing the game will revert to normal view in <%0> second.";
        field_b = new lc(11, 0, 1, 2);
    }
}
