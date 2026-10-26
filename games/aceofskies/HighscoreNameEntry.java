/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HighscoreNameEntry {
    String primaryName;
    static int field_b;
    static String field_c;
    boolean usedInUniqueView;
    static boolean field_a;
    static Sprite field_d;
    String alternateName;

    final static boolean a(int param0, int param1, int param2) {
        if (param1 != 544) {
          field_c = (String) null;
        }
        return (((param0 & 24) != 0 ? 1 : 0) | ((param0 & 544) == 544 ? 1 : 0)) != 0;
    }

    public static void b(int param0) {
        field_c = null;
        field_d = null;
        if (param0 != -11760) {
          HighscoreNameEntry.a(20);
        }
    }

    final static MonochromeBitmapFont a(ResourceArchive param0, String param1, String param2, ResourceArchive param3, int param4) {
        String stackIn_7_2 = null;
        String stackIn_10_2 = null;
        String stackIn_13_2 = null;
        String stackIn_16_2 = null;
        try {
          if (param4 != 24) {
            HighscoreNameEntry.a(-112);
          }
          int var5_int = param0.b(param2, 0);
          int var6 = param0.a(-79, var5_int, param1);
          MonochromeBitmapFont stackIn_3_0 = eo.a(param0, var6, -112, var5_int, param3);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var5;
          StringBuilder stackIn_6_1 = new StringBuilder().append("gl.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          StringBuilder stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          StringBuilder stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(')').toString());
        }
    }

    final static MonochromeBitmapFont a(byte[] param0, int param1) {
        String stackIn_10_2 = null;
        try {
          if (param0 == null) {
            Object stackIn_2_0 = null;
            return (MonochromeBitmapFont) (stackIn_2_0);
          }
          MonochromeBitmapFont var2 = new MonochromeBitmapFont(param0, lh.field_a, lg.field_j, ji.field_b, ee.field_e, fk.field_a);
          kf.f(1);
          if (param1 != 544) {
            field_a = false;
          }
          MonochromeBitmapFont stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2_ref = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var2_ref;
          StringBuilder stackIn_9_1 = new StringBuilder().append("gl.E(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static Sprite[] a(int param0) {
        int var7 = AceOfSkies.obfuscationControl ? 1 : 0;
        Sprite[] var1 = new Sprite[to.field_t];
        for (int var2 = param0; var2 < to.field_t; var2++) {
          int var3 = ee.field_e[var2] * ji.field_b[var2];
          byte[] var4 = fk.field_a[var2];
          int[] var5 = new int[var3];
          for (int var6 = 0; var3 > var6; var6++) {
            var5[var6] = ud.field_e[pg.a(255, (int) var4[var6])];
          }
          var1[var2] = new Sprite(pu.field_a, cc.field_i, lh.field_a[var2], lg.field_j[var2], ji.field_b[var2], ee.field_e[var2], var5);
        }
        kf.f(1);
        return var1;
    }

    static {
        field_c = "start game";
    }
}
