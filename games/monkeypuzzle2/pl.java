/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pl {
    static String field_c;
    static String field_b;
    static int field_g;
    static int field_h;
    static String[] field_k;
    private long field_l;
    private long field_i;
    static float[][] field_f;
    static int field_j;
    static boolean field_d;
    static vk field_e;
    private RandomAccessFile field_a;

    final int a(int param0, byte[] param1, byte param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.field_a.read(param1, param0, param3);
          if (var5_int > 0) {
            this.field_i = this.field_i + (long)var5_int;
          }
          if (param2 < -125) {
            stackIn_7_0 = var5_int;
            return stackIn_7_0;
          }
          stackIn_5_0 = 32;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("pl.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, long param1) throws IOException {
        this.field_a.seek(param1);
        if (param0 != 0) {
          this.field_a = (RandomAccessFile) null;
          this.field_i = param1;
          return;
        }
        this.field_i = param1;
    }

    final long c(byte param0) throws IOException {
        int var2 = 82 % ((param0 - 69) / 51);
        return this.field_a.length();
    }

    final void a(int param0, byte param1, byte[] param2, int param3) throws IOException {
        try {
          if (((long)param3 + this.field_i) > this.field_l) {
            this.field_a.seek(this.field_l);
            this.field_a.write(1);
            throw new EOFException();
          }
          this.field_a.write(param2, param0, param3);
          if (param1 != 68) {
            CharSequence var6 = (CharSequence) null;
            pl.a((byte) -58, (CharSequence) null);
          }
          this.field_i = this.field_i + (long)param3;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "pl.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static String a(byte param0) {
        if (ch.field_d == cf.field_b) {
          return v.field_b;
        }
        if (!bb.field_a.a(0)) {
          return bb.field_a.a(true);
        }
        if (cf.field_b == ed.field_c) {
          return bb.field_a.a(true);
        }
        if (param0 == -69) {
          return bh.field_b;
        }
        field_e = (vk) null;
        return bh.field_b;
    }

    final void a(int param0) throws IOException {
        if (null != this.field_a) {
          this.field_a.close();
          this.field_a = null;
          if (param0 != 19808) {
            field_j = -18;
            return;
          }
          return;
        }
        if (param0 != 19808) {
          field_j = -18;
          return;
        }
    }

    final static void a(boolean param0, int param1, java.applet.Applet param2, String param3) {
        try {
          java.net.MalformedURLException var4 = null;
          RuntimeException var4_ref = null;
          CharSequence var5 = null;
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (md.field_f.startsWith("win") &&
              cg.a(param3, (byte) 30)) {
              return;
            }
            try {
              param2.getAppletContext().showDocument(new java.net.URL(param3), "_blank");
              if (param1 == 12430) {
                return;
              }
              var5 = (CharSequence) null;
              pl.a((byte) -97, (CharSequence) null);
              return;
            } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
              kk.a("MGR1: " + param3, (byte) 123, (Throwable) null);
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var4_ref;
            stackIn_11_1 = new StringBuilder().append("pl.I(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
            if (param3 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            throw la.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(byte param0) {
        field_b = null;
        field_k = null;
        field_c = null;
        field_f = (float[][]) null;
        field_e = null;
        if (param0 != -77) {
          pl.a((byte) -78);
          return;
        }
    }

    final static String a(byte param0, CharSequence param1) {
        int var6 = 0;
        StringBuilder discarded$0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (param1 == null) {
            return null;
          }
          var2_int = 0;
          var3 = param1.length();
          if (param0 <= 99) {
            stackIn_6_0 = (String) null;
            return stackIn_6_0;
          }
          while (var3 > var2_int) {
            if (ok.a(-112, param1.charAt(var2_int))) {
              var2_int++;
              continue;
            }
            break;
          }
          while (var3 > var2_int) {
            if (ok.a(-62, param1.charAt(var3 - 1))) {
              var3--;
              continue;
            }
            break;
          }
          var4 = -var2_int + var3;
          if (var4 < 1) {
            return null;
          }
          if (var4 > 12) {
            return null;
          }
          var5 = new StringBuilder(var4);
          for (var6 = var2_int; var3 > var6; var6++) {
            var7 = param1.charAt(var6);
            if (sl.a(0, (char) var7)) {
              var8 = qb.a((char) var7, -201);
              if (var8 != 0) {
                discarded$0 = var5.append((char) var8);
              }
            }
          }
          if (var5.length() != 0) {
            return var5.toString();
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_32_0 = var2;
          stackIn_32_1 = new StringBuilder().append("pl.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    protected final void finalize() throws Throwable {
        if (null == this.field_a) {
          return;
        }
        System.out.println("");
        this.a(19808);
    }

    pl(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
          if (param2 == -1L) {
            param2 = 9223372036854775807L;
          }
          if (param0.length() > param2) {
            param0.delete();
          }
          this.field_a = new RandomAccessFile(param0, param1);
          this.field_l = param2;
          this.field_i = 0L;
          var5_int = this.field_a.read();
          if (var5_int != -1 &&
            !param1.equals("r")) {
            this.field_a.seek(0L);
            this.field_a.write(var5_int);
          }
          this.field_a.seek(0L);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "pl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_c = "Main Menu";
        field_b = "Create";
        field_f = new float[20][2];
    }
}
