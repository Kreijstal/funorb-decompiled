/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    static ak field_a;
    static String[] field_d;
    static String field_b;
    static ak field_c;

    final static byte[] a(String param0, int param1) {
        RuntimeException var2 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 0) {
            stackIn_4_0 = fl.field_b.a((byte) 24, param0, "");
            return stackIn_4_0;
          }
          stackIn_2_0 = (byte[]) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("vd.E(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(boolean param0, aa param1) {
        int dupTemp$3 = 0;
        int dupTemp$0 = 0;
        int var3 = 0;
        int incrementValue$2 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          for (var2_int = 0; var2_int < 3; var2_int++) {
            tm.field_O[var2_int] = 0;
          }
          for (var2_intLifetime1 = 0; var2_intLifetime1 < sd.field_L; var2_intLifetime1++) {
            if (param1.field_j == de.field_e[var2_intLifetime1].field_j) {
              dupTemp$3 = de.field_e[var2_intLifetime1].a((byte) 123);
              tm.field_O[dupTemp$3] = tm.field_O[dupTemp$3] + 1;
            }
          }
          dupTemp$0 = param1.a((byte) -87);
          tm.field_O[dupTemp$0] = tm.field_O[dupTemp$0] + 1;
          var2_intLifetime2 = 0;
          for (var3 = 0; var3 < sd.field_L; var3++) {
            boolean decompiledFrameRemainder0 = true;
            if (de.field_e[var3].field_j == param1.field_j) {
              var4 = de.field_e[var3].a((byte) -27);
              if (tm.field_O[var4] > ee.field_d) {
                tm.field_O[var4] = tm.field_O[var4] - 1;
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0) {
              incrementValue$2 = var2_intLifetime2;
              var2_intLifetime2++;
              de.field_e[incrementValue$2] = de.field_e[var3];
            }
          }
          sd.field_L = var2_intLifetime2;
          if (param0) {
            return;
          }
          fieldTemp$1 = sd.field_L;
          sd.field_L = sd.field_L + 1;
          de.field_e[fieldTemp$1] = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("vd.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        int var1 = -58 % ((-2 - param0) / 49);
        field_d = null;
        field_a = null;
    }

    final static void a(boolean param0, int param1, int param2, byte param3) {
        a.a(param0, 99);
        if (param3 != -86) {
          field_d = (String[]) null;
        }
        ra.a(param2, param1, param0, -32268);
    }

    final static void a(boolean param0) {
        int var1_int = 0;
        int var2 = 0;
        String var3 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = Pixelate.field_H ? 1 : 0;
        try {
          for (var1_int = 0; var1_int < 24; var1_int++) {
            jm.field_d[var1_int] = new ck();
          }
          if (!param0) {
            var3 = (String) null;
            vd.a((String) null, 91);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "vd.A(" + param0 + ')');
        }
    }

    static {
        field_b = "Show all private chat";
        field_d = new String[]{"The marker at the bottom  of the screen will slide towards the player with the <col=FF9900>highest score</col>. Each match consists of 5, 10, or 20 pictures; the player with the highest score after all pictures are finished is declared the winner.", "You", "Opponent", null};
    }
}
