/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class cg extends k implements pi {
    static lh field_e;
    static int field_h;
    static kc field_i;
    private hf field_g;
    static boolean field_f;

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Main.field_T;
        try {
          if (param1 > 0 &&
            param1 < 128) {
            return true;
          }
          if (param1 >= 160 &&
            param1 <= 255) {
            return true;
          }
          if (0 != param1) {
            var6 = se.field_K;
            var2 = var6;
            var3 = 0;
            while (var6.length > var3) {
              var4 = var6[var3];
              if (~param1 != ~var4) {
                var3++;
                continue;
              }
              return true;
            }
          }
          if (param0 < 94) {
            field_f = true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2_ref), "cg.P(" + param0 + ',' + param1 + ')');
        }
    }

    public static void f(int param0) {
        field_e = null;
        if (param0 != 1) {
          return;
        }
        field_i = null;
    }

    public final boolean a(byte param0) {
        if (param0 > -1) {
          this.field_g = (hf) null;
          if (null != this.field_g.field_r) {
            return this.field_g.field_r.length() == 0 ? true : false;
          }
          return true;
        }
        if (null == this.field_g.field_r) {
          return true;
        }
        if (this.field_g.field_r.length() != 0) {
          return false;
        }
        return true;
    }

    final sg e(int param0) {
        if (param0 == 14) {
          return this.a(this.field_g.field_r, -103);
        }
        field_i = (kc) null;
        return this.a(this.field_g.field_r, -103);
    }

    abstract sg a(String param0, int param1);

    final static aj b(boolean param0) {
        if (aj.field_a == null) {
          aj.field_a = new aj();
          aj.field_a.a(-1, j.field_C);
          aj.field_a.field_d = 2763306;
          aj.field_a.field_e = 0;
          aj.field_a.field_l = 6;
          aj.field_a.field_o = me.field_c;
          aj.field_a.field_g = 7697781;
          aj.field_a.field_f = 4;
          aj.field_a.field_j = 5;
          aj.field_a.field_c = 14;
        }
        if (param0) {
          return aj.field_a;
        }
        return (aj) null;
    }

    public final void a(hf param0, int param1) {
        try {
          this.a(-98);
          if (param1 != 12891) {
            field_f = true;
          }
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "cg.MA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(int param0, hf param1) {
        try {
          if (param0 != -1) {
            this.a((byte) -37);
          }
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "cg.GA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String d(int param0) {
        if (param0 != -5777) {
          return (String) null;
        }
        return this.a(this.field_g.field_r, false);
    }

    abstract String a(String param0, boolean param1);

    cg(hf param0) {
        try {
          this.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "cg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = new lh(1);
    }
}
