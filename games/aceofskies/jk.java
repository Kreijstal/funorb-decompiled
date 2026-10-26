/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk {
    static String field_c;
    static ResourceArchive synthesizedSoundArchive;
    private fq field_a;

    public static void a(int param0) {
        synthesizedSoundArchive = null;
        field_c = null;
        if (param0 != 29770) {
          jk.a('>', 104);
        }
    }

    final static boolean a(char param0, int param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        char[] var5 = null;
        char[] var6 = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        char[] var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        try {
          if (Character.isISOControl(param0)) {
            return false;
          }
          if (dc.a((byte) -119, param0)) {
            return true;
          }
          var5 = wo.field_l;
          var2 = var5;
          for (var3 = 0; var5.length > var3; var3++) {
            var4 = var5[var3];
            if (param0 == var4) {
              return true;
            }
          }
          var6 = wb.field_b;
          var2Lifetime1 = var6;
          if (param1 != -26024) {
            synthesizedSoundArchive = (ResourceArchive) null;
          }
          var7 = 0;
          var3Lifetime1 = var7;
          while (var6.length > var7) {
            var4Lifetime1 = var6[var7];
            if (var4Lifetime1 == param0) {
              return true;
            }
            var7++;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var2_ref), "jk.C(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(byte param0, wl param1) {
        hl discarded$4 = null;
        this.field_a = param1.a((byte) -49, 24, (byte[]) null, 196584, true);
        hl discarded$0 = new hl(this.field_a, 5126, 2, 0);
        hl discarded$3 = new hl(this.field_a, 5126, 3, 8);
        if (param0 < 34) {
          return;
        }
        try {
          discarded$4 = new hl(this.field_a, 5121, 4, 20);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "jk.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    jk() {
        du discarded$0 = new du(786336);
        ek.a((byte) 108, 1600);
    }

    static {
        field_c = "Orb Points";
    }
}
