/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UsernameAvailabilityQuery {
    String[] field_a;
    boolean field_d;
    boolean field_g;
    String field_e;
    static IntrusiveDeque field_k;
    int field_j;
    static String createInvalidAgeAlertText;
    static String orbPointsText;
    static Sprite[] achievementSprites;
    static String loginEmailText;
    static ResourceArchive field_l;
    static Sprite germsForegroundSprite;

    final static void a(java.awt.Canvas param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          hj.a((byte) -85, (java.awt.Component) ((Object) param0));
          if (param1 != 57) {
            return;
          }
          DropTargetWidget.a((java.awt.Component) ((Object) param0), param1 - 56);
          if (null == CachedTextLayout.mouseWheelInput) {
            return;
          }
          CachedTextLayout.mouseWheelInput.attachWheelListener(124, (java.awt.Component) ((Object) param0));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("sl.D(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String a(CharSequence param0, int param1) {
        int var2_int = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        java.awt.Canvas var6 = null;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          var2_int = param0.length();
          if (20 < var2_int) {
            var2_int = 20;
          }
          var8 = new char[var2_int];
          var7 = var8;
          var3 = var7;
          var4 = 0;
          if (param1 != 48) {
            var6 = (java.awt.Canvas) null;
            UsernameAvailabilityQuery.a((java.awt.Canvas) null, 58);
          }
          while (var2_int > var4) {
            var5 = param0.charAt(var4);
            if ((var5 >= 65) &&
                (var5 <= 90)) {
              var3[var4] = (char)(-65 + (var5 + 97));
            } else if (!((var5 >= 97) &&
                  (var5 <= 122)) &&
                !((var5 >= 48) &&
                  (var5 <= 57))) {
              var3[var4] = (char)95;
            } else {
              var3[var4] = (char)var5;
            }
            var4++;
          }
          stackIn_20_0 = new String(var8);
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("sl.A(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        createInvalidAgeAlertText = null;
        germsForegroundSprite = null;
        field_l = null;
        field_k = null;
        int var1 = -39 % ((48 - param0) / 43);
        loginEmailText = null;
        orbPointsText = null;
        achievementSprites = null;
    }

    UsernameAvailabilityQuery(boolean param0) {
        this.field_g = param0 ? true : false;
    }

    final static int a(boolean param0, SessionGameApplet param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2) {
            field_l = (ResourceArchive) null;
          }
          stackIn_3_0 = param1.a(param0, -17978);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("sl.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_k = new IntrusiveDeque();
        createInvalidAgeAlertText = "Please enter your age in years";
        orbPointsText = "Orb points: <%0>";
        loginEmailText = "Email: ";
    }
}
