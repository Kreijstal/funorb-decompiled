/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextLineLayout {
    int bottom;
    int top;
    static LoginForm field_j;
    static int[] field_a;
    static String ratingWon;
    static int field_d;
    static boolean[] field_c;
    static String playerYouAreOut;
    int[] caretXs;
    static String tutorialBasicComplete;

    final int nearestCaret(int param0, int param1) {
        int var3;
        int var4;
        String var5;
        int var3Lifetime1;
        var4 = Pool.field_O;
        if (this.caretXs == null) {
          return 0;
        }
        if (this.caretXs.length == 0) {
          return 0;
        }
        if (param0 < -108) {
          for (var3 = 1; this.caretXs.length > var3; var3++) {
            if (param1 < this.caretXs[var3] + this.caretXs[var3 - 1] >> 1) {
              return -1 + var3;
            }
          }
          return this.caretXs.length - 1;
        }
        var5 = (String) null;
        TextLineLayout.a((String) null, (byte) -110, (String) null, 52);
        for (var3Lifetime1 = 1; this.caretXs.length > var3Lifetime1; var3Lifetime1++) {
          if (param1 < this.caretXs[var3Lifetime1] + this.caretXs[var3Lifetime1 - 1] >> 1) {
            return -1 + var3Lifetime1;
          }
        }
        return this.caretXs.length - 1;
    }

    final static java.awt.Canvas a(byte param0) {
        if (param0 > -34) {
          return (java.awt.Canvas) null;
        }
        return null == MatchingTextValidator.field_u ? TimeTrialSelectScreen.field_K : (java.awt.Canvas) ((Object) MatchingTextValidator.field_u);
    }

    final static void insertAfter(IntrusiveNode param0, byte param1, IntrusiveNode param2) {
        try {
          if (null != param0.next) {
            param0.unlink((byte) -117);
          }
          param0.next = param2.next;
          if (param1 != -119) {
            playerYouAreOut = (String) null;
          }
          param0.previous = param2;
          param0.next.previous = param0;
          param0.previous.next = param0;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "vj.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static ij a(String param0, byte param1, String param2, int param3) {
        ij var4 = null;
        RuntimeException var4_ref = null;
        ij stackIn_10_0 = null;
        ij stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 18) {
            TextLineLayout.a((byte) -44);
          }
          if (MarkerSliderPainter.field_i.c(0)) {
            stackIn_12_0 = TextHotspotRegion.a(true, param3, param2, param0);
            return stackIn_12_0;
          }
          var4 = (ij) (MarkerSliderPainter.field_i.c((byte) -88));
          if (param3 == var4.field_m &&
            var4.field_H <= kg.field_m &&
            var4.field_H + var4.field_B > kg.field_m) {
            kg.field_m = var4.field_H;
          }
          stackIn_10_0 = var4;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_15_0 = var4_ref;
          stackIn_15_1 = new StringBuilder().append("vj.E(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean a(int param0, ResourceArchive param1, int param2, byte param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = param1.a(param3 ^ 44, param2, param0);
          var4 = var5;
          if (var5 == null) {
            return false;
          }
          ClientException.a(true, var5);
          if (param3 == 121) {
            return true;
          }
          ratingWon = (String) null;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_10_0 = var4_ref;
          stackIn_10_1 = new StringBuilder().append("vj.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static kf a(byte param0, PcmSample param1) {
        RuntimeException var2 = null;
        kf stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -27) {
            ratingWon = (String) null;
          }
          stackIn_3_0 = DualLinkDequeIterator.a(param0 ^ 24317, PcmSampleStream.b(param1, 100, 96));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("vj.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final int rightEdge(int param0) {
        if (param0 > -9) {
          ResourceArchive var3 = (ResourceArchive) null;
          TextLineLayout.a(-35, (ResourceArchive) null, 64, (byte) 45);
          if (null != this.caretXs) {
            return this.caretXs.length == 0 ? 0 : this.caretXs[this.caretXs.length - 1];
          }
          return 0;
        }
        if (null == this.caretXs) {
          return 0;
        }
        if (this.caretXs.length != 0) {
          return this.caretXs[this.caretXs.length - 1];
        }
        return 0;
    }

    public static void b(int param0) {
        field_j = null;
        playerYouAreOut = null;
        tutorialBasicComplete = null;
        field_a = null;
        ratingWon = null;
        field_c = null;
        if (param0 != -27731) {
          TextLineLayout.b(-11);
        }
    }

    TextLineLayout(int param0, int param1, int param2) {
        this.caretXs = new int[1 + param2];
        this.top = param0;
        this.bottom = param1;
    }

    static {
        field_a = new int[8192];
        ratingWon = "Won";
        playerYouAreOut = "You are out of lives!";
        field_c = new boolean[112];
        tutorialBasicComplete = "That concludes the Basics Tutorial. You can now experiment freely some more on your own, click >> to go to the Eight-ball Tutorial, or press <img=3> to go to the options menu to end the tutorial.";
    }
}
