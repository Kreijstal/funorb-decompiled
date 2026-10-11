/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph {
    private he[] field_e;
    private long field_d;
    private int field_c;
    private he field_b;
    static String field_a;

    public static void b(int param0) {
        int var1 = 110 % ((-13 - param0) / 60);
        field_a = null;
    }

    final he a(int param0, long param1) {
        he var4;
        he var5;
        int var6;
        he var4Lifetime1;
        he var5Lifetime1;
        var6 = Main.field_T;
        this.field_d = param1;
        if (param0 <= -26) {
          var4 = this.field_e[(int)(param1 & (long)(-1 + this.field_c))];
          this.field_b = var4.field_h;
          while (true) {
            if (var4 == this.field_b) {
              this.field_b = null;
              return null;
            }
            if (~param1 != ~this.field_b.field_j) {
              this.field_b = this.field_b.field_h;
              continue;
            }
            break;
          }
          var5 = this.field_b;
          this.field_b = this.field_b.field_h;
          return var5;
        }
        ph.a(22, 12);
        var4Lifetime1 = this.field_e[(int)(param1 & (long)(-1 + this.field_c))];
        this.field_b = var4Lifetime1.field_h;
        while (true) {
          if (var4Lifetime1 == this.field_b) {
            this.field_b = null;
            return null;
          }
          if (~param1 != ~this.field_b.field_j) {
            this.field_b = this.field_b.field_h;
            continue;
          }
          break;
        }
        var5Lifetime1 = this.field_b;
        this.field_b = this.field_b.field_h;
        return var5Lifetime1;
    }

    final static void c(int param0) {
        ga.a(true);
        if (tb.field_c != null) {
          bg.a(tb.field_c, (byte) -76);
          r.b((byte) 123);
          kf.d(param0 ^ param0);
          ui.d((byte) -122);
          if (wk.b((byte) -112)) {
            na.field_r.h(1, 0);
            fe.a((byte) -38, 0);
            mc.a((byte) -126);
            return;
          }
          mc.a((byte) -126);
          return;
        }
        r.b((byte) 123);
        kf.d(param0 ^ param0);
        ui.d((byte) -122);
        if (!wk.b((byte) -112)) {
          mc.a((byte) -126);
          return;
        }
        na.field_r.h(1, 0);
        fe.a((byte) -38, 0);
        mc.a((byte) -126);
    }

    final he a(int param0) {
        he var2;
        he var3;
        int var4;
        var4 = Main.field_T;
        if (param0 != 26847) {
          return (he) null;
        }
        if (this.field_b == null) {
          return null;
        }
        var2 = this.field_e[(int)((long)(-1 + this.field_c) & this.field_d)];
        while (true) {
          if (this.field_b == var2) {
            this.field_b = null;
            return null;
          }
          if (this.field_b.field_j != this.field_d) {
            this.field_b = this.field_b.field_h;
            continue;
          }
          break;
        }
        var3 = this.field_b;
        this.field_b = this.field_b.field_h;
        return var3;
    }

    ph(int param0) {
        int var2 = 0;
        he dupTemp$0 = null;
        he var3 = null;
        this.field_c = param0;
        this.field_e = new he[param0];
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$0 = new he();
          var3 = dupTemp$0;
          this.field_e[var2] = dupTemp$0;
          var3.field_h = var3;
          var3.field_i = var3;
        }
    }

    final static boolean a(char param0, boolean param1) {
        boolean stackIn_27_0 = false;
        if (param1) {
          return true;
        }
        if (param0 < 48) {
          if (65 > param0) {
            if (param0 >= 97 &&
              param0 <= 122) {
              return true;
            }
            return false;
          }
          if (param0 <= 90) {
            return true;
          }
          stackIn_27_0 = (param0 >= 97) && (param0 <= 122);
          return stackIn_27_0;
        }
        if (param0 <= 57) {
          return true;
        }
        if (65 <= param0 &&
          param0 <= 90) {
          return true;
        }
        if (param0 < 97) {
          return false;
        }
        if (param0 > 122) {
          return false;
        }
        return true;
    }

    final void a(he param0, long param1, int param2) {
        he var5 = null;
        try {
          if (param0.field_i != null) {
            param0.d(12);
          }
          var5 = this.field_e[(int)(param1 & (long)(this.field_c - 1))];
          param0.field_h = var5;
          param0.field_i = var5.field_i;
          param0.field_i.field_h = param0;
          if (param2 != 6144) {
            field_a = (String) null;
          }
          param0.field_j = param1;
          param0.field_h.field_i = param0;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "ph.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 35 / ((40 - param0) / 45);
        param1 = param1 & 8191;
        if (4096 > param1) {
          return param1 < 2048 ? ad.field_g[param1] : ad.field_g[-param1 + 4096];
        }
        return param1 >= 6144 ? -ad.field_g[8192 - param1] : -ad.field_g[param1 - 4096];
    }

    static {
        field_a = "Please try again in a few minutes.";
    }
}
