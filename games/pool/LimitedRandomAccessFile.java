/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class LimitedRandomAccessFile {
    private RandomAccessFile file;
    private long position;
    static String muInvitePlayers;
    static String[] goodShot;
    static int[] field_a;
    static int[] field_f;
    static byte[][] field_b;
    static Sprite field_c;
    static int[] field_i;
    private long maximumLength;
    static UiComponent field_j;
    static ModelInstance[] field_g;

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
          var5_int = this.file.read(param0, param3, param2);
          if (param1 != 20859) {
            stackIn_2_0 = -91;
            return stackIn_2_0;
          }
          if (0 < var5_int) {
            this.position = this.position + (long)var5_int;
          }
          stackIn_7_0 = var5_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("v.G(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    protected final void finalize() throws Throwable {
        if (this.file != null) {
          System.out.println("");
          this.close((byte) 122);
        }
    }

    final void close(byte param0) throws IOException {
        if (param0 < 92) {
          LimitedRandomAccessFile.a(-71);
        }
        if (this.file != null) {
          this.file.close();
          this.file = null;
        }
    }

    final static void a(int param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        if (param0 != -22444) {
          LimitedRandomAccessFile.b((byte) -109);
        }
        if (wn.field_a != null) {
          var1 = wn.field_a;
          synchronized (var1) {
            wn.field_a = null;
          }
        }
    }

    final void seek(int param0, long param1) throws IOException {
        this.file.seek(param1);
        this.position = param1;
        if (param0 != -1) {
          LimitedRandomAccessFile.b((byte) -63);
        }
    }

    public static void releaseStatics(byte param0) {
        field_c = null;
        muInvitePlayers = null;
        if (param0 <= 125) {
          return;
        }
        field_b = (byte[][]) null;
        goodShot = null;
        field_i = null;
        field_g = null;
        field_f = null;
        field_j = null;
        field_a = null;
    }

    final long length(boolean param0) throws IOException {
        if (param0) {
          return -122L;
        }
        return this.file.length();
    }

    final static void b(byte param0) {
        IntrusiveNode.field_e = null;
        wn.field_g = null;
        OptionsScreen.field_L = null;
        vi.field_c = null;
        Bzip2DecoderState.field_D = null;
        if (CipherPacketBuffer.field_z != null) {
          TimeTrialSelectScreen.field_J = CipherPacketBuffer.field_z;
          NineBallRules.field_j = ArchiveProvider.field_i;
          TimeTrialSelectScreen.field_J.activeTextColor = -1;
          CipherPacketBuffer.field_z = null;
          TimeTrialSelectScreen.field_J.capturedTextColor = -1;
          ArchiveProvider.field_i = null;
        }
        if (param0 >= -59) {
          LimitedRandomAccessFile.a(-8, -59, 'ﾽ');
        }
        DualLinkNode.field_p = true;
    }

    final void write(int param0, int param1, int param2, byte[] param3) throws IOException {
        try {
          if (this.maximumLength < (this.position + (long)param2)) {
            this.file.seek(this.maximumLength);
            this.file.write(1);
            throw new EOFException();
          }
          if (param1 != 25354) {
            LimitedRandomAccessFile.releaseStatics((byte) 3);
          }
          this.file.write(param3, param0, param2);
          this.position = this.position + (long)param2;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "v.E(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    LimitedRandomAccessFile(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
          if (-1L == param2) {
            param2 = 9223372036854775807L;
          }
          if (param0.length() > param2) {
            param0.delete();
          }
          this.file = new RandomAccessFile(param0, param1);
          this.position = 0L;
          this.maximumLength = param2;
          var5_int = this.file.read();
          if (var5_int != -1 &&
            !param1.equals("r")) {
            this.file.seek(0L);
            this.file.write(var5_int);
          }
          this.file.seek(0L);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "v.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static String a(int param0, int param1, char param2) {
        int var4 = 0;
        char[] var5 = new char[param0];
        char[] var3 = var5;
        for (var4 = param1; var4 < param0; var4++) {
          var5[var4] = param2;
        }
        return new String(var5);
    }

    static {
        muInvitePlayers = "Invite players";
        field_f = new int[]{12, 20, 21, 49, 5, 7};
        goodShot = new String[]{"Nice shot!", "Well played!", "Good shot!"};
    }
}
