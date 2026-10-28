/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class d {
    private String field_a;
    private boolean field_e;
    private boolean field_b;
    static tk field_c;
    static String field_d;
    static String[] field_f;

    final void a(byte param0, boolean param1) {
        this.field_e = param1 ? true : false;
        if (param0 != -128) {
          return;
        }
        this.field_b = true;
    }

    final static boolean a(char param0, int param1) {
        int var5 = EscapeVector.obfuscationControl;
        try {
          if (Character.isISOControl(param0)) {
            return false;
          }
          if (TextWidgetPainter.a(true, param0)) {
            return true;
          }
          char[] var6 = pb.field_a;
          char[] var2 = var6;
          for (int var3 = 0; var6.length > var3; var3++) {
            int var4 = var6[var3];
            if (~var4 == ~param0) {
              return true;
            }
          }
          char[] var2Lifetime1 = pn.field_nb;
          for (int var3Lifetime1 = 0; var2Lifetime1.length > var3Lifetime1; var3Lifetime1++) {
            int var4Lifetime1 = var2Lifetime1[var3Lifetime1];
            if (var4Lifetime1 == param0) {
              return true;
            }
          }
          if (param1 == -11217) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2_ref), "d.E(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean b(int param0) {
        if (param0 != 0) {
          return false;
        }
        return this.field_b;
    }

    final String a(int param0) {
        if (param0 > -24) {
          return (String) null;
        }
        return this.field_a;
    }

    final boolean c(int param0) {
        if (param0 != 14668) {
          return false;
        }
        return this.field_e;
    }

    d(String param0) {
        this.field_b = false;
        this.field_e = false;
        try {
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "d.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_d = null;
        if (param0 != 65) {
          field_f = (String[]) null;
          field_f = null;
          return;
        }
        field_f = null;
    }

    static {
        field_c = new tk();
        field_d = "Quit to website";
        field_f = new String[]{"Fly away from the asteroid intact<br>to avoid losing a life.", "Fly away from the moon intact<br>to avoid losing a life.", "Fly away from the planet intact<br>to avoid losing a life."};
    }
}
