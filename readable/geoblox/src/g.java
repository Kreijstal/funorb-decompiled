/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g extends TextInputValidator {
    static int field_j;
    static String createEmailUnavailableAlertText;
    private dj field_k;
    static String serviceUnavailableText;
    static Sprite countBoxSprite;
    private dj field_n;

    g(dj param0, dj param1, dj param2) {
        super(param0);
        try {
            this.field_n = param2;
            this.field_k = param1;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "g.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final String validationMessageForText(int guard, String candidateText) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        Object stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        String stackIn_19_0 = null;
        String stackIn_22_0 = null;
        String stackIn_26_0 = null;
        String stackIn_30_0 = null;
        String stackIn_34_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = this.field_k.field_s.toLowerCase();
          var4 = candidateText.toLowerCase();
          if (var4.length() == 0) {
            stackIn_2_0 = null;
            return (String) ((Object) stackIn_2_0);
          }
          var5 = var4;
          if (em.a(var5, guard - 344)) {
            stackIn_6_0 = ji.createPasswordLengthAlertText;
            return stackIn_6_0;
          }
          if (ak.a(var5, (byte) -120)) {
            stackIn_10_0 = ai.createPasswordCharacterAlertText;
            return stackIn_10_0;
          }
          if (ra.a(guard + 18303, var5)) {
            stackIn_13_0 = gg.createRepeatedPasswordAlertText;
            return stackIn_13_0;
          }
          if (guard != 422) {
            g.g(119);
          }
          if (this.a(candidateText, -29267)) {
            stackIn_19_0 = DiskCacheWorker.createPasswordContainsEmailAlertText;
            return stackIn_19_0;
          }
          if (0 >= var6.length()) {
            stackIn_22_0 = ii.createPasswordValidText;
            return stackIn_22_0;
          }
          if (ak.a(var5, var6, -98)) {
            stackIn_26_0 = gf.createPasswordContainsNameAlertText;
            return stackIn_26_0;
          }
          if (uk.a(8, var6, var5)) {
            stackIn_30_0 = gg.createPasswordContainsPartialNameAlertText;
            return stackIn_30_0;
          }
          if (!wc.a(var5, var6, (byte) -96)) {
            return ji.createPasswordLengthAlertText;
          }
          stackIn_34_0 = gf.createPasswordContainsNameAlertText;
          return stackIn_34_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_37_0 = (RuntimeException) (var3);
          stackIn_37_1 = new StringBuilder().append("g.A(").append(guard).append(',');
          if (candidateText == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    private final boolean a(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_n.field_s.toLowerCase();
          var4 = param0.toLowerCase();
          if (0 < var3.length()) {
            if (var4.length() > 0) {
              var5 = var3.lastIndexOf("@");
              if (0 <= var5) {
                if (var3.length() - 1 > var5) {
                  var6 = var3.substring(0, var5);
                  var7 = var3.substring(var5 + 1);
                  if (var4.indexOf(var6) >= 0) {
                    return true;
                  }
                  if (var4.indexOf(var7) >= 0) {
                    return true;
                  }
                }
              }
            }
          }
          if (param1 == -29267) {
            return false;
          }
          serviceUnavailableText = (String) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = (RuntimeException) (var3_ref);
          stackIn_16_1 = new StringBuilder().append("g.B(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    final lh validationStateForText(int guard, String candidateText) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        lh stackIn_5_0 = null;
        lh stackIn_8_0 = null;
        lh stackIn_11_0 = null;
        lh stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != -257) {
            this.field_k = (dj) null;
          }
          var3 = this.field_k.field_s.toLowerCase();
          var4 = candidateText.toLowerCase();
          if (var4.length() == 0) {
            stackIn_5_0 = si.field_m;
            return stackIn_5_0;
          }
          if (!dd.a(var4, var3, -25321)) {
            stackIn_8_0 = si.field_m;
            return stackIn_8_0;
          }
          if (!this.a(candidateText, -29267)) {
            stackIn_13_0 = kk.field_w;
            return stackIn_13_0;
          }
          stackIn_11_0 = si.field_m;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = (RuntimeException) (var3_ref);
          stackIn_16_1 = new StringBuilder().append("g.D(").append(guard).append(',');
          if (candidateText == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void g(int param0) {
        if (param0 >= -90) {
            return;
        }
        countBoxSprite = null;
        createEmailUnavailableAlertText = null;
        serviceUnavailableText = null;
    }

    static {
        createEmailUnavailableAlertText = "Email address is unavailable";
        serviceUnavailableText = "Service unavailable";
        field_j = 0;
    }
}
