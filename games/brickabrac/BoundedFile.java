/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class BoundedFile {
    static int[] receivedChatSuggestions;
    static int[][] logoOriginalCenters;
    private long maxLength;
    static int field_c;
    static String field_d;
    static int field_l;
    static UiComponent field_g;
    static int field_i;
    static boolean field_n;
    static String field_b;
    private long position;
    static int field_h;
    static RgbSprite[] field_a;
    private RandomAccessFile file;

    protected final void finalize() throws Throwable {
        if (null != this.file) {
          System.out.println("");
          this.close(81);
        }
    }

    final int read(int offset, byte[] data, int length, byte obfuscationGuard) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.file.read(data, offset, length);
          if (obfuscationGuard < 102) {
            field_l = -103;
          }
          if (0 < var5_int) {
            this.position = this.position + (long)var5_int;
          }
          stackIn_6_0 = var5_int;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("rn.A(").append(offset).append(',');
          if (data == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(length).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void patchJavaKeyCodeMap(int keyCodeFor57) {
        FullscreenFailureKind.javaKeyCodeMap[keyCodeFor57] = 57;
        FullscreenFailureKind.javaKeyCodeMap[93] = 43;
        FullscreenFailureKind.javaKeyCodeMap[91] = 42;
        FullscreenFailureKind.javaKeyCodeMap[47] = 73;
        FullscreenFailureKind.javaKeyCodeMap[46] = 72;
        FullscreenFailureKind.javaKeyCodeMap[61] = 27;
        FullscreenFailureKind.javaKeyCodeMap[92] = 74;
        FullscreenFailureKind.javaKeyCodeMap[44] = 71;
        FullscreenFailureKind.javaKeyCodeMap[45] = 26;
        FullscreenFailureKind.javaKeyCodeMap[192] = 28;
        FullscreenFailureKind.javaKeyCodeMap[520] = 59;
        FullscreenFailureKind.javaKeyCodeMap[222] = 58;
    }

    final void write(int offset, byte obfuscationGuard, byte[] data, int length) throws IOException {
        if (this.maxLength < ((long)length + this.position)) {
          this.file.seek(this.maxLength);
          this.file.write(1);
          throw new EOFException();
        }
        this.file.write(data, offset, length);
        if (obfuscationGuard > -99) {
          return;
        }
        try {
          this.position = this.position + (long)length;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "rn.C(" + offset + ',' + obfuscationGuard + ',' + (data != null ? "{...}" : "null") + ',' + length + ')');
        }
    }

    final long length(int obfuscationGuard) throws IOException {
        if (obfuscationGuard > -91) {
          logoOriginalCenters = (int[][]) null;
          return this.file.length();
        }
        return this.file.length();
    }

    public static void b(int param0) {
        field_g = null;
        logoOriginalCenters = (int[][]) null;
        if (param0 == 57) {
          field_b = null;
          field_d = null;
          field_a = null;
          receivedChatSuggestions = null;
          return;
        }
        field_a = (RgbSprite[]) null;
        field_b = null;
        field_d = null;
        field_a = null;
        receivedChatSuggestions = null;
    }

    final void seek(int obfuscationGuard, long position) throws IOException {
        if (obfuscationGuard <= -10) {
          this.file.seek(position);
          this.position = position;
          return;
        }
        field_h = -109;
        this.file.seek(position);
        this.position = position;
    }

    final void close(int obfuscationGuard) throws IOException {
        int var2 = 0;
        int var2Lifetime1;
        if (null == this.file) {
          var2 = 74 % ((obfuscationGuard - 5) / 49);
          return;
        }
        this.file.close();
        this.file = null;
        var2Lifetime1 = 74 % ((obfuscationGuard - 5) / 49);
    }

    BoundedFile(File path, String mode, long maxLength) throws IOException {
        int var5_int = 0;
        try {
          if (maxLength == -1L) {
            maxLength = 9223372036854775807L;
          }
          if (maxLength < path.length()) {
            path.delete();
          }
          this.file = new RandomAccessFile(path, mode);
          this.position = 0L;
          this.maxLength = maxLength;
          var5_int = this.file.read();
          if (-1 != var5_int &&
            !mode.equals("r")) {
            this.file.seek(0L);
            this.file.write(var5_int);
          }
          this.file.seek(0L);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "rn.<init>(" + (path != null ? "{...}" : "null") + ',' + (mode != null ? "{...}" : "null") + ',' + maxLength + ')');
        }
    }

    static {
        field_d = "Service unavailable";
        field_n = false;
        field_b = "Type your password again to make sure it's correct";
        field_h = 360;
    }
}
