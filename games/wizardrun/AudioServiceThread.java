/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class AudioServiceThread implements Runnable {
    static IntrusiveDeque field_d;
    PlatformTaskDispatcher field_c;
    static BitmapFont field_a;
    volatile boolean field_e;
    volatile boolean field_g;
    static Sprite field_b;
    volatile AudioOutput[] field_f;

    public final void run() {
        int var1_int = 0;
        AudioOutput var2 = null;
        int var4 = wizardrun.field_H;
        this.field_e = true;
        try {
          while (!this.field_g) {
            for (var1_int = 0; var1_int < 2; var1_int++) {
              var2 = this.field_f[var1_int];
              if (var2 != null) {
                var2.service();
              }
            }
            LevelData.sleepMillis(10L, false);
            Object var5 = (Object) null;
            Cp1252DecodingHelpers.pumpEventQueue(this.field_c, (byte) -105, (Object) null);
          }
        } catch (Exception exception) {
          String var6 = (String) null;
          ResizableDialog.reportClientError((Throwable) ((Object) exception), (String) null, -562);
        } finally {
          this.field_e = false;
        }
    }

    final static void writeFileBytes(byte[] param0, int param1, boolean param2, File param3) throws IOException {
        FileOutputStream var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        try {
          var4 = new FileOutputStream(param3);
          var4.write(param0, 0, param1);
          var4.close();
          if (!param2) {
            field_d = (IntrusiveDeque) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_5_0 = var4_ref;
          stackIn_5_1 = new StringBuilder().append("bk.C(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_b = null;
        if (param0 != 2) {
          return;
        }
        field_d = null;
        field_a = null;
    }

    AudioServiceThread() {
        this.field_f = new AudioOutput[2];
        this.field_g = false;
        this.field_e = false;
    }

    final static void readRankingStatsReply(int param0) {
        RankingStatsRequest var1 = (RankingStatsRequest) (TimedValidator.field_d.first((byte) 72));
        if (var1 == null) {
          HuffmanDecoder.closeAccountConnection(-82);
          return;
        }
        IsaacPacketBuffer var2 = AccountCreationForm.field_N;
        var2.readInt(255);
        int var3 = -11 % ((param0 - 84) / 40);
        var2.readInt(255);
        var2.readInt(255);
        var2.readInt(255);
        var1.unlink(false);
    }

    static {
        field_d = new IntrusiveDeque();
    }
}
