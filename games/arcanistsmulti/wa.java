/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa extends SceneWidget {
    static String field_Db;
    String field_Cb;
    String field_Lb;
    SceneWidget field_Fb;
    SceneWidget field_Jb;
    int field_Bb;
    static boolean field_Nb;
    static String field_Hb;
    static boolean field_Kb;
    static SceneWidget field_Pb;
    String field_Gb;
    SceneWidget field_Mb;
    static String field_Eb;
    String field_Ib;
    static boolean field_Ob;

    public static void releaseStatics(byte param0) {
        if (param0 >= -62) {
          CharSequence var2 = (CharSequence) null;
          wa.countCharacter(';', (CharSequence) null, (byte) -35);
        }
        field_Db = null;
        field_Eb = null;
        field_Pb = null;
        field_Hb = null;
    }

    wa() {
        super(0L, (SceneWidget) null);
    }

    final static int countCharacter(char param0, CharSequence param1, byte param2) {
        int var5 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var3_int = 0;
          if (param2 != -16) {
            stackIn_3_0 = -10;
            return stackIn_3_0;
          }
          var4 = param1.length();
          for (var5 = 0; var5 < var4; var5++) {
            if (param0 == param1.charAt(var5)) {
              var3_int++;
            }
          }
          stackIn_10_0 = var3_int;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("wa.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_Db = "You need to play <%0> more rated games to unlock this option.";
        field_Eb = "Connection lost. <%0>";
        field_Hb = "Show game chat from my friends";
    }
}
