/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa {
    private ne field_i;
    private ne[] field_h;
    static String field_e;
    private int field_n;
    static int field_k;
    private ne field_d;
    private int field_g;
    static String field_f;
    static int field_c;
    static ec field_b;
    static mb field_j;
    static boolean field_a;
    static int[] field_m;
    static int field_l;

    final static void a(int param0, int param1, int param2, cn param3, int param4, int param5) {
        try {
          param3.h(param4, param5);
          db.field_v.b(Integer.toString(param0), 20 + param4, (param3.field_v + la.field_b.field_H >> 1) + param5, param2, param1);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "wa.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final ne a(long param0, int param1) {
        ne var4;
        ne var5;
        int var6;
        ne var4Lifetime1;
        ne var5Lifetime1;
        var6 = DungeonAssault.field_K;
        if (param1 == 8) {
          var4 = this.field_h[(int)((long)(-1 + this.field_n) & param0)];
          this.field_d = var4.field_e;
          while (true) {
            if (this.field_d == var4) {
              this.field_d = null;
              return null;
            }
            if (~this.field_d.field_h != ~param0) {
              this.field_d = this.field_d.field_e;
              continue;
            }
            break;
          }
          var5 = this.field_d;
          this.field_d = this.field_d.field_e;
          return var5;
        }
        field_b = (ec) null;
        var4Lifetime1 = this.field_h[(int)((long)(-1 + this.field_n) & param0)];
        this.field_d = var4Lifetime1.field_e;
        while (true) {
          if (this.field_d == var4Lifetime1) {
            this.field_d = null;
            return null;
          }
          if (~this.field_d.field_h != ~param0) {
            this.field_d = this.field_d.field_e;
            continue;
          }
          break;
        }
        var5Lifetime1 = this.field_d;
        this.field_d = this.field_d.field_e;
        return var5Lifetime1;
    }

    final ne a(boolean param0) {
        if (!param0) {
          field_l = -108;
          this.field_g = 0;
          return this.a(4318);
        }
        this.field_g = 0;
        return this.a(4318);
    }

    public static void c(int param0) {
        field_b = null;
        field_m = null;
        field_j = null;
        if (param0 != 23413) {
          cn var2 = (cn) null;
          wa.a(-5, (cn) null);
          field_f = null;
          field_e = null;
          return;
        }
        field_f = null;
        field_e = null;
    }

    final static void a(int param0, cn param1) {
        try {
          if (param0 < 116) {
            field_m = (int[]) null;
          }
          ol.field_b = param1;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "wa.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int[] b(int param0) {
        if (param0 != -1) {
          wa.b(20);
          return new int[8];
        }
        return new int[8];
    }

    final ne a(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var3;
        ne var4;
        ne var7;
        ne var8;
        var3 = DungeonAssault.field_K;
        if (0 >= this.field_g) {
          if (param0 != 4318) {
            return (ne) null;
          }
          do {
            if (this.field_g >= this.field_n) {
              return null;
            }
            fieldTemp$0 = this.field_g;
            this.field_g = this.field_g + 1;
            var8 = this.field_h[fieldTemp$0].field_e;
          } while (this.field_h[this.field_g - 1] == var8);
          this.field_i = var8.field_e;
          return var8;
        }
        if (this.field_h[this.field_g - 1] != this.field_i) {
          var7 = this.field_i;
          this.field_i = var7.field_e;
          return var7;
        }
        if (param0 != 4318) {
          return (ne) null;
        }
        do {
          if (this.field_g >= this.field_n) {
            return null;
          }
          fieldTemp$1 = this.field_g;
          this.field_g = this.field_g + 1;
          var4 = this.field_h[fieldTemp$1].field_e;
        } while (this.field_h[this.field_g - 1] == var4);
        this.field_i = var4.field_e;
        return var4;
    }

    final void a(ne param0, int param1, long param2) {
        ne var5 = null;
        try {
          if (null != param0.field_a) {
            param0.a(false);
          }
          var5 = this.field_h[(int)(param2 & (long)(this.field_n - 1))];
          param0.field_a = var5.field_a;
          param0.field_e = var5;
          param0.field_a.field_e = param0;
          if (param1 != 12460) {
            field_e = (String) null;
          }
          param0.field_e.field_a = param0;
          param0.field_h = param2;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "wa.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    wa(int param0) {
        int var2 = 0;
        ne dupTemp$1 = null;
        ne var3;
        this.field_g = 0;
        this.field_h = new ne[param0];
        this.field_n = param0;
        for (var2 = 0; var2 < param0; var2++) {
          dupTemp$1 = new ne();
          var3 = dupTemp$1;
          this.field_h[var2] = dupTemp$1;
          var3.field_a = var3;
          var3.field_e = var3;
        }
    }

    static {
        field_e = "Account created successfully!";
        field_f = "You have never raided a dungeon.";
        field_k = 5;
        field_c = -1;
    }
}
