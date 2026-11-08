/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class RandomAccessCacheFile {
    static ClientProtocolStage field_f;
    private long field_e;
    static java.awt.Frame field_b;
    static String field_a;
    static int field_g;
    static UiComponent field_h;
    private RandomAccessFile field_d;
    private long field_c;

    final void write(int param0, int param1, byte[] param2, int param3) throws IOException {
        try {
          if ((this.field_c + (long)param3) > this.field_e) {
            this.field_d.seek(this.field_e);
            this.field_d.write(1);
            throw new EOFException();
          }
          int var5_int = -65 / ((-20 - param0) / 33);
          this.field_d.write(param2, param1, param3);
          this.field_c = this.field_c + (long)param3;
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "sa.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static String getStatusMessage(byte param0) {
        if (ArchiveRequest.field_C == AnimationPlayer.field_d) {
          return InputDetachHelpers.field_c;
        }
        if (ArchiveRequest.field_C == PasswordLengthHelpers.field_a) {
          return PacketFlushHelpers.field_b;
        }
        if (!HighscoreQuery.field_y.hasChanged(false)) {
          return PacketFlushHelpers.field_b;
        }
        if (param0 < -30) {
          return SocialTabsPanel.field_d;
        }
        field_a = (String) null;
        return SocialTabsPanel.field_d;
    }

    final int read(int param0, int param1, byte[] param2, byte param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = -122 % ((-48 - param3) / 47);
          var5_int = this.field_d.read(param2, param1, param0);
          if (var5_int > 0) {
            this.field_c = this.field_c + (long)var5_int;
          }
          stackIn_3_0 = var5_int;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("sa.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(')').toString());
        }
    }

    final void seek(long param0, boolean param1) throws IOException {
        this.field_d.seek(param0);
        this.field_c = param0;
        if (param1) {
          RandomAccessCacheFile.getStatusMessage((byte) -89);
          return;
        }
    }

    final static void resetCameraToTarget(int param0, boolean param1) {
        TransitionPhase.field_d = GameRoomPanelHelpers.field_c;
        SoundMixerHelpers.field_e = WidgetNode.field_x;
        if (param1) {
          WidgetTheme.field_s = WidgetNode.field_x;
          WidgetStyleLayer.field_j = GameRoomPanelHelpers.field_c;
        }
        MenuScreen.field_g = 2;
        if (param0 < -53) {
          return;
        }
        field_f = (ClientProtocolStage) null;
    }

    final void close(int param0) throws IOException {
        if (null != this.field_d) {
          this.field_d.close();
          this.field_d = null;
          if (param0 != 0) {
            this.field_d = (RandomAccessFile) null;
            return;
          }
          return;
        }
        if (param0 == 0) {
          return;
        }
        this.field_d = (RandomAccessFile) null;
    }

    public static void releaseStatics(byte param0) {
        field_h = null;
        field_b = null;
        if (param0 != -112) {
          return;
        }
        field_a = null;
        field_f = null;
    }

    protected final void finalize() throws Throwable {
        if (this.field_d != null) {
          System.out.println("");
          this.close(0);
        }
    }

    final long length(int param0) throws IOException {
        if (param0 != -1) {
          RandomAccessCacheFile.releaseStatics((byte) -82);
          return this.field_d.length();
        }
        return this.field_d.length();
    }

    RandomAccessCacheFile(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
          if (-1L == param2) {
            param2 = 9223372036854775807L;
          }
          if (param0.length() > param2) {
            param0.delete();
          }
          this.field_d = new RandomAccessFile(param0, param1);
          this.field_e = param2;
          this.field_c = 0L;
          var5_int = this.field_d.read();
          if (-1 != var5_int &&
            !param1.equals("r")) {
            this.field_d.seek(0L);
            this.field_d.write(var5_int);
          }
          this.field_d.seek(0L);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "sa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_g = 0;
        field_a = "If you are not, please change your password to something more obscure!";
        field_f = new ClientProtocolStage();
    }
}
