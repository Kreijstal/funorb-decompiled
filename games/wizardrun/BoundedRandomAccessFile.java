/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class BoundedRandomAccessFile {
    private long field_e;
    static boolean field_b;
    private long field_d;
    private RandomAccessFile field_c;
    static int field_a;

    final void seek(long param0, byte param1) throws IOException {
        if (param1 == -24) {
          this.field_c.seek(param0);
          this.field_d = param0;
          return;
        }
        String var5 = (String) null;
        BoundedRandomAccessFile.containsNonAlphanumericPasswordCharacter((byte) -93, (String) null);
        this.field_c.seek(param0);
        this.field_d = param0;
    }

    final void write(int param0, byte[] param1, boolean param2, int param3) throws IOException {
        try {
          if (this.field_e < (this.field_d + (long)param0)) {
            this.field_c.seek(this.field_e);
            this.field_c.write(1);
            throw new EOFException();
          }
          this.field_c.write(param1, param3, param0);
          if (!param2) {
            this.field_c = (RandomAccessFile) null;
          }
          this.field_d = this.field_d + (long)param0;
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "ri.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final int read(byte[] param0, int param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 4836) {
            stackIn_2_0 = -82;
            return stackIn_2_0;
          }
          var5_int = this.field_c.read(param0, param2, param3);
          if (var5_int > 0) {
            this.field_d = this.field_d + (long)var5_int;
          }
          stackIn_7_0 = var5_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("ri.E(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final long length(int param0) throws IOException {
        if (param0 != 0) {
          BoundedRandomAccessFile.hasAccountEligibilityCookie(97);
          return this.field_c.length();
        }
        return this.field_c.length();
    }

    final static boolean containsNonAlphanumericPasswordCharacter(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = wizardrun.field_H;
        try {
          for (var2_int = 0; param1.length() > var2_int; var2_int++) {
            var3 = param1.charAt(var2_int);
            if (!HighscorePlayerState.isAsciiLetter((char) var3, true) &&
              !CheckboxPainter.isAsciiDigit((char) var3, -5717)) {
              return true;
            }
          }
          if (param0 == -56) {
            return false;
          }
          var5 = (String) null;
          BoundedRandomAccessFile.containsNonAlphanumericPasswordCharacter((byte) -90, (String) null);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("ri.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    protected final void finalize() throws Throwable {
        if (null != this.field_c) {
          System.out.println("");
          this.close(-1);
        }
    }

    final void close(int param0) throws IOException {
        if (null != this.field_c) {
          this.field_c.close();
          this.field_c = null;
          if (param0 != -1) {
            this.field_d = 71L;
            return;
          }
          return;
        }
        if (param0 == -1) {
          return;
        }
        this.field_d = 71L;
    }

    BoundedRandomAccessFile(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
          if (-1L == param2) {
            param2 = 9223372036854775807L;
          }
          if (param2 < param0.length()) {
            param0.delete();
          }
          this.field_c = new RandomAccessFile(param0, param1);
          this.field_e = param2;
          this.field_d = 0L;
          var5_int = this.field_c.read();
          if (var5_int != -1 &&
            !param1.equals("r")) {
            this.field_c.seek(0L);
            this.field_c.write(var5_int);
          }
          this.field_c.seek(0L);
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "ri.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void writeHighscoreRequest(HighscoreRequest param0, int param1, byte param2) {
        IsaacPacketBuffer var3 = null;
        try {
          if (param2 != 121) {
            String var4 = (String) null;
            BoundedRandomAccessFile.containsNonAlphanumericPasswordCharacter((byte) -79, (String) null);
          }
          var3 = AccountPacketState.field_b;
          var3.writeCipheredOpcode((byte) 113, param1);
          var3.writeByte((byte) 11, 5);
          var3.writeByte((byte) 11, 0);
          var3.writeShort(-1947079288, param0.field_l);
          var3.writeByte((byte) 11, param0.field_j);
          var3.writeByte((byte) 11, param0.field_o);
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "ri.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean hasAccountEligibilityCookie(int param0) {
        if (param0 < 18) {
          return false;
        }
        return SocketConnector.hasAccountEligibilityCookie((byte) 46, DisplayNameValidator.getActiveApplet(1));
    }

    static {
    }
}
