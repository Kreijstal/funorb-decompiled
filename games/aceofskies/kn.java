/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kn {
    static RendererBitmapFont titleFont;
    static PcmSample[] field_c;
    static BitmapFontMetrics bigFontMetrics;

    final static java.awt.Frame a(rk param0, int param1, int param2, int param3, int param4, int param5) {
        String stackIn_46_2 = null;
        int var9 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (!param0.a((byte) 84)) {
            return null;
          }
          if (param3 == 0) {
            rm[] var10 = sk.a(param0, 1175069442);
            rm[] var6 = var10;
            if (var6 == null) {
              Object stackIn_8_0 = null;
              return (java.awt.Frame) (stackIn_8_0);
            }
            boolean var7_int = false;
            for (int var8 = 0; var8 < var10.length; var8++) {
              if (param1 == var10[var8].field_f &&
                var10[var8].field_b == param2 && ((param4 == 0 ||
                var10[var8].field_a == param4) &&
                (!var7_int ||
                !(param3 >= var10[var8].field_d)))) {
                param3 = var10[var8].field_d;
                var7_int = true;
              }
            }
            if (!var7_int) {
              Object stackIn_29_0 = null;
              return (java.awt.Frame) (stackIn_29_0);
            }
          }
          en var11 = param0.a(param1, -83, param4, param2, param3);
          while (var11.field_a == 0) {
            IntrusiveNode.a(10L, false);
          }
          java.awt.Frame var7 = (java.awt.Frame) (var11.field_f);
          if (var7 == null) {
            Object stackIn_35_0 = null;
            return (java.awt.Frame) (stackIn_35_0);
          }
          if (param5 != 29742) {
            java.awt.Frame stackIn_38_0 = (java.awt.Frame) null;
            return stackIn_38_0;
          }
          if (var11.field_a != 2) {
            return var7;
          }
          ke.a(param5 ^ 30691, param0, var7);
          Object stackIn_42_0 = null;
          return (java.awt.Frame) (stackIn_42_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6_ref = decompiledCaughtException;
          RuntimeException stackIn_45_0 = var6_ref;
          StringBuilder stackIn_45_1 = new StringBuilder().append("kn.A(");
          if (param0 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void b(int param0) {
        if (param0 != -1) {
          bigFontMetrics = (BitmapFontMetrics) null;
        }
        titleFont = null;
        field_c = null;
        bigFontMetrics = null;
    }

    final static IndexedSprite[] a(int param0) {
        int var4 = AceOfSkies.obfuscationControl ? 1 : 0;
        int var1 = -37 / ((19 - param0) / 57);
        IndexedSprite[] var2 = new IndexedSprite[to.field_t];
        for (int var3 = 0; var3 < to.field_t; var3++) {
          var2[var3] = new IndexedSprite(pu.field_a, cc.field_i, lh.field_a[var3], lg.field_j[var3], ji.field_b[var3], ee.field_e[var3], fk.field_a[var3], ud.field_e);
        }
        kf.f(1);
        return var2;
    }

    static {
    }
}
