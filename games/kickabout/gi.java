/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi extends hd {
    private int field_Cb;
    private int field_Ab;
    private gr field_zb;
    int field_yb;
    static String field_Bb;

    final static boolean a(int param0, pt param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        pt var4 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Kickabout.field_G;
        try {
          if (param0 != 140) {
            gi.b(108);
          }
          var4 = (pt) (ce.field_K.g(param0 ^ 23877));
          while (var4 != null) {
            if (var4.a(param1, 5250)) {
              return false;
            }
            var4 = (pt) (ce.field_K.c(param0 ^ 173));
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("gi.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final boolean c(boolean param0) {
        int var2 = this.field_Ab == 0 ? this.field_zb.field_k : this.field_zb.field_R;
        if (!param0) {
          return var2 == this.field_yb ? true : false;
        }
        return false;
    }

    final void a(int param0) {
        int var5 = 0;
        int var7 = 0;
        int var6 = 0;
        int var8 = Kickabout.field_G;
        int var2 = this.c(false) ? 1 : 0;
        int var3 = this.field_F;
        int var4 = this.field_T;
        if (var2 == 0) {
          var5 = var3;
          var7 = 21;
          var6 = var4;
        } else {
          var6 = -4 + var4;
          var5 = -4 + var3;
          var7 = 29;
        }
        on.e(var5 + 1, var6, -2 + var7, var7, 0);
        on.e(var5, 1 + var6, var7, var7 - 2, 0);
        on.a(2 + var5, var6 + 2, -4 + var7, -4 + var7, this.field_Cb);
        if (var2 != 0) {
          if (!this.field_gb) {
            wt.field_z[0].d(var5 + 2, var6 + 2, -4 + var7, var7 - 4, 140);
            wt.field_z[1].d(var5 + 2, var6 + 2, -4 + var7, -4 + var7, 128);
            wt.field_z[3].e(2 + var5, var6 + 2, -4 + var7, -4 + var7, 256);
          }
          su.field_a.c((-su.field_a.field_o + var7 >> 1) + var5, (var7 - su.field_a.field_v >> 1) + var6);
          on.c(var5 + 2, -3 + var7 + var6, -4 + var7, 0, 90);
          on.f(var5 - (-var7 + param0), 2 + var6, -5 + var7, 0, 90);
          on.f(2 + var5, 2 + var6, var7 - 5, 0, 90);
          return;
        }
        if (this.field_gb) {
          on.c(var5 + 2, -3 + var7 + var6, -4 + var7, 0, 90);
          on.f(var5 - (-var7 + param0), 2 + var6, -5 + var7, 0, 90);
          on.f(2 + var5, 2 + var6, var7 - 5, 0, 90);
          return;
        }
        wt.field_z[0].b(var5 + 2, var6 + 2, 140);
        wt.field_z[1].b(var5 + 2, var6 + 2, 128);
        wt.field_z[3].c(2 + var5, 2 + var6, 128);
        on.c(var5 + 2, -3 + var7 + var6, -4 + var7, 0, 90);
        on.f(var5 - (-var7 + param0), 2 + var6, -5 + var7, 0, 90);
        on.f(2 + var5, 2 + var6, var7 - 5, 0, 90);
    }

    public static void h(int param0) {
        field_Bb = null;
        if (param0 != -31922) {
          field_Bb = (String) null;
        }
    }

    gi(gr param0, int param1, int param2) {
        try {
          this.field_yb = param2;
          this.field_Ab = param1;
          this.field_zb = param0;
          this.field_Cb = t.field_l[ev.field_B[this.field_yb]];
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "gi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        wh var3 = null;
        RuntimeException decompiledCaughtException = null;
        var2 = Kickabout.field_G;
        try {
          gp.b((byte) -28);
          var3 = (wh) (pn.field_z.g(24009));
          while (var3 != null) {
            var3.f((byte) -127);
            var3 = (wh) (pn.field_z.c(33));
          }
          if (param0 == 17702) {
            return;
          }
          gi.b(94);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "gi.B(" + param0 + ')');
        }
    }

    static {
        field_Bb = "Your email address is used to identify this account";
    }
}
