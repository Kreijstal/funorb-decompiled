/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class TimedSceneEffect extends IntrusiveNode {
    int color;
    static String challengeText;
    int y;
    static PcmSample[][] field_n;
    static boolean field_r;
    int x;
    int remainingTicks;
    static MusicTrack[] field_m;

    boolean updateAndIsExpired(int param0) {
        this.remainingTicks = this.remainingTicks - 1;
        if (param0 == -2567) {
          return this.remainingTicks == 0 ? true : false;
        }
        this.remainingTicks = -86;
        return this.remainingTicks == 0 ? true : false;
    }

    void render(GraphicsToolkit toolkit, int guard) {
        if (guard >= -121) {
          return;
        }
        try {
          ua.field_g[0].a((float)this.x, (float)this.y, 1848 - (int)((double)this.remainingTicks / 30.0 * 2048.0), 0, 1, 0, 2);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "nt.C(" + (toolkit != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    final static boolean a(byte param0) {
        if (param0 <= 82) {
          TimedSceneEffect.a((byte) 13);
          if (null == DisplayModeConfirmationDialog.field_O) {
            return false;
          }
          if (kw.field_c == ga.field_j) {
            return true;
          }
          return false;
        }
        if (null == DisplayModeConfirmationDialog.field_O) {
          return false;
        }
        if (kw.field_c == ga.field_j) {
          return true;
        }
        return false;
    }

    final static void c(int param0) {
        if (param0 != 0) {
          return;
        }
        rd.a(17, -103);
    }

    final static void readFileFully(byte[] param0, int param1, File param2, int param3) throws IOException {
        DataInputStream var4 = null;
        try {
          var4 = new DataInputStream((InputStream) ((Object) new BufferedInputStream((InputStream) ((Object) new FileInputStream(param2)))));
          var4.readFully(param0, 0, param3);
          if (param1 != 7039) {
            field_r = true;
          }
          var4.close();
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "nt.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    TimedSceneEffect(int lifetimeTicks, int x, int y, int color) {
        this.color = color;
        this.x = x;
        this.remainingTicks = lifetimeTicks;
        this.y = y;
    }

    public static void releaseStatics(int param0) {
        field_m = null;
        field_n = (PcmSample[][]) null;
        challengeText = null;
        if (param0 != 31295) {
          field_r = true;
        }
    }

    static {
        challengeText = "challenge";
        field_n = new PcmSample[3][];
        field_m = new MusicTrack[9];
    }
}
