/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class DebouncedValidator implements ValidationSource {
    static PlatformTask field_e;
    static String field_a;
    private long field_b;
    private static long[] field_h;
    static int field_g;
    static String field_c;
    static int[] field_d;
    static String field_f;

    abstract ValidationState a(boolean param0);

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -30106) {
            stackIn_6_0 = (hb.a((byte) -90, param1) != null);
            return stackIn_6_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("da.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public final String a(byte param0) {
        if (param0 != -63) {
          MusicCrossfadeStream var3 = (MusicCrossfadeStream) null;
          DebouncedValidator.a((java.awt.Component) null, (PlatformTaskDispatcher) null, (MusicCrossfadeStream) null, -88, true, -43, 7, true);
        }
        if (this.a(16647)) {
          return null;
        }
        if (pr.a(14274) < (this.field_b + 350L)) {
          return null;
        }
        return this.c((byte) 125);
    }

    final static SoundPlayback a(int param0, PcmSampleStream param1) {
        SoundPlayback var2 = null;
        RuntimeException var2_ref = null;
        SoundPlayback stackIn_2_0 = null;
        SoundPlayback stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new SoundPlayback(param1, param1);
          eo.field_ab.addLast((byte) -113, var2);
          if (param0 > -121) {
            stackIn_2_0 = (SoundPlayback) null;
            return stackIn_2_0;
          }
          jp.field_Bb.addChild(param1);
          stackIn_4_0 = var2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_7_0 = var2_ref;
          stackIn_7_1 = new StringBuilder().append("da.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_e = null;
        field_d = null;
        field_c = null;
        if (param0 != -37) {
          return;
        }
        field_h = null;
        field_a = null;
        field_f = null;
    }

    public final void b(int param0) {
        this.field_b = pr.a(14274);
        int var2 = -57 / ((param0 + 1) / 58);
    }

    public final ValidationState c(int param0) {
        if (this.a(16647)) {
          return un.field_i;
        }
        int var2 = -29 / ((-80 - param0) / 35);
        if (!(this.field_b + 350L <= pr.a(14274))) {
          return pd.field_h;
        }
        return this.a(false);
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException stackIn_7_0 = null;
          StringBuilder stackIn_7_1 = null;
          String stackIn_8_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
              param1.getAppletContext().showDocument(AudioService.a(param1, false, var2), "_top");
              if (param0 != 1) {
                field_a = (String) null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_7_0 = var2_ref2;
            stackIn_7_1 = new StringBuilder().append("da.G(").append(param0).append(',');
            if (param1 == null) {
              stackIn_8_2 = "null";
            } else {
              stackIn_8_2 = "{...}";
            }
            throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(java.awt.Component param0, PlatformTaskDispatcher param1, MusicCrossfadeStream param2, int param3, boolean param4, int param5, int param6, boolean param7) {
        try {
          PcmPlayerService.configure(param5, param7, 10);
          aj.field_e = PcmPlayerService.create(param1, param0, 0, param6);
          if (param4) {
            java.applet.Applet var9 = (java.applet.Applet) null;
            DebouncedValidator.a(-84, (java.applet.Applet) null);
          }
          IsolationistAi.field_q = PcmPlayerService.create(param1, param0, 1, param3);
          jp.field_Bb = new PcmStreamMixer();
          AttackTask.field_t = param3;
          IsolationistAi.field_q.setSourceStream(jp.field_Bb);
          ValidationState.field_b = param2;
          ValidationState.field_b.a(wm.field_b, 0);
          aj.field_e.setSourceStream(ValidationState.field_b);
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "da.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    abstract String c(byte param0);

    static {
        int var2 = 0;
        int var3 = 0;
        long var0;
        field_h = new long[256];
        field_a = "<%highlight>FLEET RESIZING</col> - Once you have chosen a destination system for a move, you may <%highlight>increase or decrease</col> the number of <%glossary>fleets</col> you are sending there. This can be done via the <%highlight>tip of the arrow</col> at the destination system. Simply <%key>click</col> on the <%highlight>'+' button</col> by the arrowhead to increase how many fleets you are sending, or on the <%highlight>'-' button</col> to decrease it. Clicking the <%highlight>'X' button</col> will cancel the order completely.";
        for (var2 = 0; var2 < 256; var2++) {
          var0 = (long)var2;
          for (var3 = 0; var3 < 8; var3++) {
            if ((var0 & 1L) == 1L) {
              var0 = -3932672073523589310L ^ var0 >>> 1;
            } else {
              var0 = var0 >>> 1;
            }
          }
          field_h[var2] = var0;
        }
        field_c = "Suggested names: ";
        field_d = new int[4];
        field_f = "Click to replay animation.";
    }
}
