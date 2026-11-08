/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AudioService implements Runnable {
    static ClientProtocolStage field_h;
    static String field_a;
    static UiLayoutNode field_g;
    volatile boolean field_c;
    volatile boolean field_e;
    PlatformTaskDispatcher field_f;
    static long[] field_d;
    volatile PcmPlayerService[] field_b;

    final static AccountRegistrationResponse pollAccountNameAvailability(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        Object stackIn_7_0 = null;
        AccountRegistrationResponse stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 16 / ((param0 - 46) / 47);
          if (mj.field_a == PlayerModelPreview.field_f) {
            stackIn_2_0 = null;
            return (AccountRegistrationResponse) (stackIn_2_0);
          }
          if (mj.field_a == LinkTextPainter.field_d &&
            param1.equals(pr.field_c)) {
            mj.field_a = vj.field_a;
            stackIn_9_0 = JaggrabDownloader.field_h;
            return stackIn_9_0;
          }
          mj.field_a = PlayerModelPreview.field_f;
          pr.field_c = param1;
          JaggrabDownloader.field_h = null;
          stackIn_7_0 = null;
          return (AccountRegistrationResponse) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("cp.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_d = null;
        field_h = null;
        field_g = null;
        int var1 = 20 % ((param0 + 1) / 41);
        field_a = null;
    }

    public final void run() {
        int var1_int = 0;
        PcmPlayerService var2 = null;
        int var4 = Kickabout.field_G;
        this.field_c = true;
        try {
          while (!this.field_e) {
            for (var1_int = 0; var1_int < 2; var1_int++) {
              var2 = this.field_b[var1_int];
              if (var2 == null) {
              } else {
                var2.serviceOutput();
              }
            }
            ThreadSleepSupport.sleepMillis(10L, 1);
            Object var5 = (Object) null;
            ReflectionCheck.a((byte) 41, this.field_f, (Object) null);
          }
        } catch (Exception exception) {
          String var6 = (String) null;
          UnreadMessagesScreen.a((String) null, (Throwable) ((Object) exception), 1);
        } finally {
          this.field_c = false;
        }
    }

    final static int formationY(byte param0, int param1, int param2, int param3) {
        if (param0 != 21) {
          return 53;
        }
        int var4 = ProxyAuthenticationRequiredException.field_c[param1];
        if (param2 == param3 &&
          param1 == 3) {
          var4 = 522;
        }
        if (param2 == 0) {
          var4 = 1344 - var4;
        }
        return var4;
    }

    final static int pollResourceConnection(int param0) {
        FriendsListPanel.field_Ab.a(0);
        if (!ParticipantStatus.field_t.pollResponses((byte) -46)) {
          return MyPitchScreen.pollServerConnection((byte) 66);
        }
        if (param0 != 522) {
          field_h = (ClientProtocolStage) null;
          return 0;
        }
        return 0;
    }

    AudioService() {
        this.field_b = new PcmPlayerService[2];
        this.field_e = false;
        this.field_c = false;
    }

    static {
        field_a = "The Final has begun";
        field_d = new long[32];
        field_h = new ClientProtocolStage();
    }
}
