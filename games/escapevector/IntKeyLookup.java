/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntKeyLookup {
    static int field_c;
    private int[] field_f;
    static int field_e;
    static int field_a;
    static int field_d;
    static int field_b;

    final int find(int key, int guard) {
        int var3 = (this.field_f.length >> 1) - guard;
        int var4 = var3 & key;
        while (true) {
          int var5 = this.field_f[1 + (var4 + var4)];
          if (var5 == -1) {
            return -1;
          }
          if (this.field_f[var4 + var4] == key) {
            return var5;
          }
          var4 = 1 + var4 & var3;
        }
    }

    final static byte[] loadLanguageAsset(int guard, String name) {
        String stackIn_7_2 = null;
        try {
          if (guard < 13) {
            String var3 = (String) null;
            IntKeyLookup.loadLanguageAsset(-106, (String) null);
          }
          byte[] stackIn_3_0 = LoginCredentialType.languageArchive.getNamedFile(-4, name, "");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var2;
          StringBuilder stackIn_6_1 = new StringBuilder().append("jn.A(").append(guard).append(',');
          if (name == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    IntKeyLookup(int[] param0) {
        String stackIn_17_2 = null;
        try {
          int var2_int = 1;
          while ((param0.length >> 1) + param0.length >= var2_int) {
            var2_int = var2_int << 1;
          }
          this.field_f = new int[var2_int + var2_int];
          for (int var3 = 0; var2_int + var2_int > var3; var3++) {
            this.field_f[var3] = -1;
          }
          for (int var3Lifetime1 = 0; param0.length > var3Lifetime1; var3Lifetime1++) {
            int var4 = param0[var3Lifetime1] & var2_int - 1;
            while (this.field_f[var4 + (var4 + 1)] != -1) {
              var4 = var2_int - 1 & var4 + 1;
            }
            this.field_f[var4 + var4] = param0[var3Lifetime1];
            this.field_f[var4 - (-var4 - 1)] = var3Lifetime1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_16_0 = var2;
          StringBuilder stackIn_16_1 = new StringBuilder().append("jn.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        IntroRasterSupport.configureIntroScale(400, 50);
    }
}
