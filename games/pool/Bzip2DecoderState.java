/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Bzip2DecoderState {
    int[] minimumCodeLengths;
    int field_p;
    int field_s;
    int[] byteFrequencies;
    int field_a;
    int field_u;
    int field_e;
    int field_h;
    static PcmSample field_i;
    static UiComponent field_D;
    static int field_c;
    int field_H;
    int[][] field_b;
    byte[] field_A;
    int[] moveToFrontBlockStarts;
    byte[] field_B;
    int[] byteBucketPositions;
    byte[] field_g;
    int field_y;
    int field_j;
    int field_F;
    boolean[] usedByteGroups;
    static UiComponent field_f;
    byte[][] huffmanCodeLengths;
    byte[] alphabetBytes;
    int[][] field_n;
    int field_q;
    byte[] moveToFrontBytes;
    int[][] field_d;
    int field_t;
    int field_l;
    boolean[] usedBytes;
    static String createAlertPasslength;
    byte field_C;
    int field_E;
    byte[] field_r;
    int field_z;

    final static void a(long param0, byte param1) {
        try {
          Throwable decompiledCaughtException = null;
          InterruptedException var3 = null;
          try {
            Thread.sleep(param0);
            if (param1 != 104) {
              Bzip2DecoderState.releaseStatics(-92);
              return;
            }
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (InterruptedException) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0) {
        kf var1 = null;
        int var2 = Pool.field_O;
        kf var1Lifetime1;
        try {
          MidiNoteMixer.field_s.d();
          CacheEntry.field_D.d();
          if (param0 >= -79) {
            createAlertPasslength = (String) null;
          }
          LobbyGame.field_Pb = LobbyGame.field_Pb - 1;
          if (LobbyGame.field_Pb == 0) {
            LobbyGame.field_Pb = 200;
            var1 = (kf) (oj.field_o.c((byte) 116));
            while (var1 != null) {
              if (!var1.field_m.b(-126)) {
                var1.unlink((byte) -117);
              }
              var1 = (kf) (oj.field_o.f((byte) -5));
            }
            if (UsernameSuggestionsPanel.field_R != null) {
              var1Lifetime1 = (kf) (UsernameSuggestionsPanel.field_R.c((byte) -84));
              while (var1Lifetime1 != null) {
                if (!var1Lifetime1.field_m.b(-117)) {
                  var1Lifetime1.unlink((byte) -117);
                }
                var1Lifetime1 = (kf) (UsernameSuggestionsPanel.field_R.f((byte) -5));
              }
            }
          }
          if (null != RankingsScreen.field_N &&
            RankingsScreen.field_N.d(-11414)) {
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "uq.B(" + param0 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_f = null;
        field_i = null;
        if (param0 != -8090) {
          return;
        }
        createAlertPasslength = null;
        field_D = null;
    }

    final static void a(int param0, String param1, int param2, byte param3, long param4) {
        try {
          if (param3 > -52) {
            field_i = (PcmSample) null;
          }
          hj.field_c = param4;
          AccountWelcomePanel.field_T = true;
          ie.field_e = param1;
          PasswordValidator.field_x = param0;
          tq.field_t = param2;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "uq.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    Bzip2DecoderState() {
        this.moveToFrontBlockStarts = new int[16];
        this.byteFrequencies = new int[256];
        this.field_b = new int[6][258];
        this.byteBucketPositions = new int[257];
        this.field_a = 0;
        this.moveToFrontBytes = new byte[4096];
        this.huffmanCodeLengths = new byte[6][258];
        this.alphabetBytes = new byte[256];
        this.minimumCodeLengths = new int[6];
        this.field_d = new int[6][258];
        this.usedByteGroups = new boolean[16];
        this.usedBytes = new boolean[256];
        this.field_A = new byte[18002];
        this.field_u = 0;
        this.field_r = new byte[18002];
        this.field_n = new int[6][258];
    }

    static {
        field_c = -1;
        createAlertPasslength = "Passwords must be between 5 and 20 characters long";
    }
}
