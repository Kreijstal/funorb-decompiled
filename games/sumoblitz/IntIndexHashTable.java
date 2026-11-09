/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntIndexHashTable {
    static java.awt.Color field_a;
    private int[] entries;
    static String field_d;
    static String[] field_c;

    public static void releaseStatics(int param0) {
        field_a = null;
        field_d = null;
        if (param0 != 18260) {
          field_d = (String) null;
          field_c = null;
          return;
        }
        field_c = null;
    }

    final static void a(int param0) {
        if (!IntrusiveNode.field_a) {
          throw new IllegalStateException();
        }
        HardwareTextureSprite.field_m = true;
        LoginDialogNavigation.showLoginDialog(true, false);
        LoginDialogNavigation.field_a = param0;
    }

    IntIndexHashTable(int[] keys) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3Lifetime1;
        try {
          var2_int = 1;
          while ((keys.length >> 1) + keys.length >= var2_int) {
            var2_int = var2_int << 1;
          }
          this.entries = new int[var2_int + var2_int];
          for (var3 = 0; var2_int + var2_int > var3; var3++) {
            this.entries[var3] = -1;
          }
          for (var3Lifetime1 = 0; keys.length > var3Lifetime1; var3Lifetime1++) {
            var4 = keys[var3Lifetime1] & var2_int - 1;
            while (-1 != this.entries[1 + (var4 + var4)]) {
              var4 = -1 + var2_int & var4 + 1;
            }
            this.entries[var4 + var4] = keys[var3Lifetime1];
            this.entries[var4 + (var4 + 1)] = var3Lifetime1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("bf.<init>(");
          if (keys == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final int findIndex(int key, byte guard) {
        int var3;
        int var4;
        int var5;
        int var6;
        var4 = -116 % ((guard - 32) / 48);
        var3 = -1 + (this.entries.length >> 1);
        var5 = var3 & key;
        while (true) {
          var6 = this.entries[var5 + (var5 + 1)];
          if (var6 == -1) {
            return -1;
          }
          if (key == this.entries[var5 + var5]) {
            return var6;
          }
          var5 = var3 & 1 + var5;
        }
    }

    static {
        field_a = new java.awt.Color(10040319);
    }
}
