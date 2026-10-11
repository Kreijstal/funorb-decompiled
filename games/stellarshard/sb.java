/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb {
    static ek[] field_c;
    static ud[] field_e;
    private int field_d;
    private ah[] field_f;
    private long field_h;
    static byte[] field_i;
    private ah field_g;
    static int field_b;
    static String field_a;

    public static void a(byte param0) {
        field_e = null;
        if (param0 > 75) {
          field_a = null;
          field_c = null;
          field_i = null;
          return;
        }
        field_c = (ek[]) null;
        field_a = null;
        field_c = null;
        field_i = null;
    }

    final static void a(int param0) {
        String var2 = (String) null;
        mj.a((String) null, field_a, 107);
        int var1 = -82 % ((44 - param0) / 45);
    }

    final ah a(boolean param0) {
        ah var2;
        ah var3;
        int var4;
        ah var2Lifetime1;
        ah var3Lifetime1;
        var4 = stellarshard.field_B;
        if (this.field_g == null) {
          return null;
        }
        if (param0) {
          var2 = this.field_f[(int)((long)(-1 + this.field_d) & this.field_h)];
          while (true) {
            if (this.field_g == var2) {
              this.field_g = null;
              return null;
            }
            if (~this.field_g.field_o != ~this.field_h) {
              this.field_g = this.field_g.field_m;
              continue;
            }
            break;
          }
          var3 = this.field_g;
          this.field_g = this.field_g.field_m;
          return var3;
        }
        this.a(true);
        var2Lifetime1 = this.field_f[(int)((long)(-1 + this.field_d) & this.field_h)];
        while (true) {
          if (this.field_g == var2Lifetime1) {
            this.field_g = null;
            return null;
          }
          if (~this.field_g.field_o != ~this.field_h) {
            this.field_g = this.field_g.field_m;
            continue;
          }
          break;
        }
        var3Lifetime1 = this.field_g;
        this.field_g = this.field_g.field_m;
        return var3Lifetime1;
    }

    sb(int param0) {
        int var2 = 0;
        ah dupTemp$0 = null;
        ah var3 = null;
        this.field_d = param0;
        this.field_f = new ah[param0];
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$0 = new ah();
          var3 = dupTemp$0;
          this.field_f[var2] = dupTemp$0;
          var3.field_m = var3;
          var3.field_l = var3;
        }
    }

    final ah a(long param0, int param1) {
        ah var5 = null;
        int var6 = stellarshard.field_B;
        this.field_h = param0;
        ah var4 = this.field_f[(int)(param0 & (long)(-1 + this.field_d))];
        this.field_g = var4.field_m;
        while (var4 != this.field_g) {
          if (param0 == this.field_g.field_o) {
            var5 = this.field_g;
            this.field_g = this.field_g.field_m;
            return var5;
          }
          this.field_g = this.field_g.field_m;
        }
        if (param1 <= -108) {
          this.field_g = null;
          return null;
        }
        return (ah) null;
    }

    final void a(ah param0, long param1, int param2) {
        ah var5 = null;
        try {
          if (null != param0.field_l) {
            param0.c((byte) 36);
          }
          var5 = this.field_f[(int)(param1 & (long)(this.field_d - param2))];
          param0.field_m = var5;
          param0.field_l = var5.field_l;
          param0.field_l.field_m = param0;
          param0.field_o = param1;
          param0.field_m.field_l = param0;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "sb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_i = new byte[65536];
        ri.a(field_i, 0, 65536, (byte) -128);
    }
}
