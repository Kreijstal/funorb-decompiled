/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dra {
    static String[] musicTrackNames;
    static String[] field_a;

    public static void releaseStatics(int param0) {
        field_a = null;
        musicTrackNames = null;
        if (param0 > -108) {
          field_a = (String[]) null;
        }
    }

    final static void a(boolean param0) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        BitPacketBuffer var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          if (!param0) {
            musicTrackNames = (String[]) null;
          }
          var1 = ql.field_k;
          while (SnakePitBehaviour.l(10371)) {
            var1.writeCipheredOpcode(8, -2988);
            fieldTemp$0 = var1.position + 1;
            var1.position = var1.position + 1;
            var2 = fieldTemp$0;
            hk.a(true, var1);
            ql.field_k.backpatchByteLength(var1.position - var2, (byte) -17);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1_ref), "dra.B(" + param0 + ')');
        }
    }

    static {
        musicTrackNames = new String[]{"Rhythm", "Basic1", "Basic2", "Flavour1", "Flavour2", "Flavour3", "Flavour4", "Flavour5", "Flavour6", "Music1", "Music2", "Music3", "Music4", "Boulder", "Danger", "Snakes"};
        field_a = new String[100];
    }
}
