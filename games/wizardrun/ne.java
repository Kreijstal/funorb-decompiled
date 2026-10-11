/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne {
    static String field_d;
    static int[] field_h;
    private boolean field_c;
    static ji field_b;
    static int field_g;
    static int[] field_e;
    private String field_f;
    static String field_a;

    final static int a(byte param0) {
        if (param0 != 28) {
          field_b = (ji) null;
          return h.field_p;
        }
        return h.field_p;
    }

    final static boolean b(int param0) {
        if (param0 != 22845) {
          return true;
        }
        if (jc.field_H == null) {
          return false;
        }
        if (!wh.field_j.a(0)) {
          return false;
        }
        return true;
    }

    final String a(int param0) {
        if (param0 != 160) {
          ne.a((byte) -6);
          return this.field_f;
        }
        return this.field_f;
    }

    ne(String param0) {
        this(param0, false);
    }

    public static void c(int param0) {
        field_b = null;
        field_h = null;
        field_d = null;
        field_e = null;
        field_a = null;
        if (param0 != -1) {
          ne.a((byte) 40);
        }
    }

    final static String b(byte param0) {
        int var1 = -110 / ((70 - param0) / 56);
        if (ol.field_b) {
          return null;
        }
        if (jc.field_I > gj.field_b) {
          return null;
        }
        if (jc.field_I + ll.field_o > gj.field_b) {
          return vb.field_I;
        }
        return null;
    }

    final static boolean a(char param0, int param1) {
        int var3 = 0;
        char[] var2 = null;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = wizardrun.field_H;
        try {
          if (param0 > 0 &&
            128 > param0) {
            return true;
          }
          if (160 <= param0 &&
            param0 <= 255) {
            return true;
          }
          if (param0 != 0) {
            var6 = ki.field_G;
            var2 = var6;
            for (var3 = 0; var6.length > var3; var3++) {
              var4 = var6[var3];
              if (~param0 == ~var4) {
                return true;
              }
            }
          }
          if (param1 == 160) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var2_ref), "ne.E(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean c(byte param0) {
        if (param0 < 118) {
          return true;
        }
        return this.field_c;
    }

    ne(String param0, boolean param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_f = param0;
          stackIn_4_1 = (param1);
          this.field_c = stackIn_4_1;
          if (null == this.field_f) {
            this.field_f = "";
          }
          if (this.field_f.length() != 0) {
            return;
          }
          this.field_c = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("ne.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_d = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_e = new int[8192];
        field_a = "Menu";
    }
}
