/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd extends pv {
    static String field_l;
    static float field_q;
    static String field_k;
    private double field_j;
    static String field_n;
    private int field_o;
    private int field_m;
    static String field_p;

    private final void c(int param0) {
        if (param0 < -116) {
          this.field_f.field_n = this.field_f.c((byte) -125);
          this.field_f.field_k = this.field_f.b(true);
          return;
        }
    }

    public static void c(byte param0) {
        field_k = null;
        if (param0 < 31) {
          return;
        }
        field_p = null;
        field_l = null;
        field_n = null;
    }

    final boolean b(boolean param0) {
        int fieldTemp$0 = this.field_g + 1;
        this.field_g = this.field_g + 1;
        if (fieldTemp$0 > this.c(false)) {
          this.c(-123);
          return true;
        }
        if (this.field_m == 0) {
          this.c(-123);
          return true;
        }
        if (1 == this.field_g) {
          this.field_f.field_l = this.field_f.field_l + (int)((double)this.field_m / 39.0);
          this.field_f.field_v.a((byte) 55, this.field_f.field_g.field_o.field_b, 2);
        }
        if (this.field_g >= 18) {
          if (this.field_g > (this.c(!param0 ? true : false) - 25)) {
            if (param0) {
              return false;
            }
            field_p = (String) null;
            return false;
          }
          this.field_f.field_k = this.b(-102);
        }
        if (param0) {
          return false;
        }
        field_p = (String) null;
        return false;
    }

    private final int c(boolean param0) {
        if (param0) {
          return -126;
        }
        return 40 * Math.abs(this.field_m) / 39;
    }

    private final int b(int param0) {
        if (param0 <= -101) {
          return (int)((double)(this.field_g - 18) * this.field_j) + this.field_o;
        }
        int discarded$0 = this.c(true);
        return (int)((double)(this.field_g - 18) * this.field_j) + this.field_o;
    }

    final static boolean a(String param0, int param1) {
        int var3 = 0;
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var4 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        var4 = BachelorFridge.field_y;
        try {
          try {
            if (!ht.field_i.startsWith("win")) {
              return false;
            }
            if (!param0.startsWith("http://") &&
              !param0.startsWith("https://")) {
              return false;
            }
            if (param1 >= -119) {
              qd.c((byte) -22);
            }
            var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            for (var3 = 0; param0.length() > var3; var3++) {
              if (var2.indexOf((int) param0.charAt(var3)) == -1) {
                return false;
              }
            }
            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
            return true;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_25_0 = var2_ref2;
          stackIn_25_1 = new StringBuilder().append("qd.I(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    qd(jfa param0, int param1) {
        try {
          this.field_f = param0;
          this.field_m = param1;
          this.field_o = this.field_f.field_k;
          this.field_j = (double)this.field_m / (-43.0 + (double)this.c(false));
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "qd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_l = "Add to Cart";
        field_k = "Shortcut Reference";
        field_p = "This is your RuneScape clan if you have one.";
        field_n = "Error connecting to server. Please try using a different server.";
    }
}
