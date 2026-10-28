/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Bzip2State {
    int field_F;
    int field_k;
    byte field_t;
    int field_m;
    int[] field_c;
    int[][] field_I;
    int field_b;
    int[][] field_H;
    boolean[] field_d;
    static int field_p;
    int field_e;
    int field_g;
    static int[] field_y;
    int field_u;
    byte[] field_o;
    int field_J;
    byte[] field_z;
    byte[] field_w;
    int field_n;
    int[] field_j;
    int[][] field_a;
    int field_h;
    byte[] field_E;
    int field_C;
    int field_x;
    static int[] field_v;
    byte[][] field_q;
    int field_A;
    int[] field_r;
    static PcmSample field_G;
    boolean[] field_f;
    int field_l;
    byte[] field_D;
    int[] field_B;
    int field_i;
    byte[] field_s;

    public static void releaseStatics(int guard) {
        field_y = null;
        field_G = null;
        if (guard != 8192) {
          field_y = (int[]) null;
          field_v = null;
          return;
        }
        field_v = null;
    }

    final static void a(boolean param0, boolean param1, java.applet.Applet param2, String param3) {
        try {
          String stackIn_14_2 = null;
          String stackIn_17_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (SystemTaskService.field_e.startsWith("win") &&
              RasterRestoreSupport.openWindowsUrl((byte) 38, param3)) {
              return;
            }
            try {
              param2.getAppletContext().showDocument(new java.net.URL(param3), "_blank");
            } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              java.net.MalformedURLException var4_ref = (java.net.MalformedURLException) (Object) decompiledCaughtException;
              GameModeSelectScreen.reportClientError(false, "MGR1: " + param3, (Throwable) null);
            }
            if (param0) {
              return;
            }
            field_p = -75;
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            RuntimeException var4 = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_13_0 = var4;
            StringBuilder stackIn_13_1 = new StringBuilder().append("th.B(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_14_2 = "null";
            } else {
              stackIn_14_2 = "{...}";
            }
            StringBuilder stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
            if (param3 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    Bzip2State() {
        this.field_d = new boolean[256];
        this.field_o = new byte[4096];
        this.field_I = new int[6][258];
        this.field_w = new byte[256];
        this.field_e = 0;
        this.field_a = new int[6][258];
        this.field_C = 0;
        this.field_j = new int[256];
        this.field_q = new byte[6][258];
        this.field_H = new int[6][258];
        this.field_f = new boolean[16];
        this.field_B = new int[257];
        this.field_c = new int[6];
        this.field_r = new int[16];
        this.field_E = new byte[18002];
        this.field_s = new byte[18002];
    }

    static {
        field_p = 0;
        field_y = new int[8192];
    }
}
