/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ServerDataReadRequest extends IntrusiveNode {
    static il field_n;
    byte[] payload;
    static SpriteData field_k;
    boolean complete;
    static TextureFilter NEAREST;
    static String resetStatsText;

    public static void releaseStatics(int param0) {
        field_k = null;
        NEAREST = null;
        field_n = null;
        resetStatsText = null;
        int var1 = -90 / ((param0 - 71) / 51);
    }

    final static EmailValidationError validateEmailDomain(String domain, int guard) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        String var6 = null;
        EmailValidationError var7 = null;
        int var8 = 0;
        EmailValidationError stackIn_3_0 = null;
        EmailValidationError stackIn_7_0 = null;
        EmailValidationError stackIn_11_0 = null;
        EmailValidationError stackIn_17_0 = null;
        EmailValidationError stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          var2_int = domain.length();
          if (guard == ~var2_int) {
            stackIn_3_0 = ClientExceptionSupport.MISSING_EMAIL_COMPONENT;
            return stackIn_3_0;
          }
          if (255 < var2_int) {
            stackIn_7_0 = SocialContact.EMAIL_COMPONENT_TOO_LONG;
            return stackIn_7_0;
          }
          var3 = SocialContact.split('.', domain, -27224);
          if (var3.length < 2) {
            stackIn_11_0 = ClientExceptionSupport.MISSING_EMAIL_COMPONENT;
            return stackIn_11_0;
          }
          var4 = var3;
          for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            var7 = ImageProducerRasterBuffer.validateDomainLabel(var6, -1);
            if (var7 != null) {
              stackIn_17_0 = var7;
              return stackIn_17_0;
            }
          }
          stackIn_20_0 = WidgetTheme.validateTopLevelDomain(guard ^ -26, var3[var3.length - 1]);
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("lh.A(");
          if (domain == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(guard).append(')').toString());
        }
    }

    ServerDataReadRequest() {
    }

    static {
        field_n = new il();
        NEAREST = new TextureFilter();
        resetStatsText = "reset stats";
    }
}
