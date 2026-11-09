/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class NodeSequence {
    static Sprite field_d;
    static java.applet.Applet field_a;
    static Sprite[] field_b;
    static int field_e;
    static String field_c;

    final static boolean a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param1 != -31654) {
            field_e = 87;
          }
          for (var2_int = 0; var2_int < param0.length(); var2_int++) {
            var3 = param0.charAt(var2_int);
            if (!hq.a(-95, (char) var3) &&
              !dk.isDigit((byte) -66, (char) var3)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("hb.J(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final static ve a(byte param0, String param1) {
        String var2 = null;
        ve var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        ve stackIn_13_0 = null;
        ve stackIn_20_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (BattleEvent.field_q == null) {
            return null;
          }
          if (param1 == null) {
            return null;
          }
          if (param1.length() == 0) {
            stackIn_7_0 = null;
            return (ve) (stackIn_7_0);
          }
          var6 = (CharSequence) ((Object) param1);
          var2 = DateInputWidget.a(var6, true);
          if (var2 == null) {
            stackIn_10_0 = null;
            return (ve) (stackIn_10_0);
          }
          if (param0 != -90) {
            stackIn_13_0 = (ve) null;
            return stackIn_13_0;
          }
          var3 = (ve) (BattleEvent.field_q.get(65280, (long)var2.hashCode()));
          while (var3 != null) {
            var7 = (CharSequence) ((Object) var3.field_Ab);
            var4 = DateInputWidget.a(var7, true);
            if (var4.equals(var2)) {
              stackIn_20_0 = var3;
              return stackIn_20_0;
            }
            var3 = (ve) (BattleEvent.field_q.getNextWithKey((byte) -112));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_25_0 = var2_ref;
          stackIn_25_1 = new StringBuilder().append("hb.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    public static void clearStatics(byte param0) {
        field_d = null;
        field_b = null;
        field_c = null;
        if (param0 != -122) {
          field_d = (Sprite) null;
        }
        field_a = null;
    }

    abstract int size(byte param0);

    abstract IntrusiveNode first(byte param0);

    abstract IntrusiveNode next(boolean param0);

    static {
        field_e = 0;
        field_c = "Player";
    }
}
