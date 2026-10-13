/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf {
    static String[] field_d;
    private int field_h;
    private int field_j;
    int field_i;
    static mf field_c;
    private ah field_a;
    private int field_e;
    static String field_g;
    private int field_f;
    static mh field_k;
    private boolean field_b;

    final boolean a(int param0, char param1, int param2) {
        int var4 = 107 / ((0 - param2) / 63);
        if (99 == param0) {
          this.field_i = this.field_i + 1;
          this.field_b = true;
        } else {
          if (param0 == 98) {
            this.field_i = this.field_i - 1;
            this.field_b = true;
          }
        }
        if (this.field_i < 0 ||
          this.field_i >= this.field_f) {
          this.field_i = -1;
          this.field_b = false;
          return true;
        }
        return false;
    }

    final static RgbSprite[] a(RgbSprite param0, int param1) {
        RgbSprite[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RgbSprite[] var4 = null;
        RgbSprite[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = 48 / ((param1 - 55) / 32);
          var4 = new RgbSprite[9];
          var2 = var4;
          var4[4] = param0;
          stackIn_1_0 = var2;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_4_0 = var2_ref;
          stackIn_4_1 = new StringBuilder().append("jf.F(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void d(int param0) {
        if (param0 != -99) {
          field_g = (String) null;
        }
        ii var1 = (ii) (fr.field_M.removeLast(127));
        if (var1 == null) {
          var1 = new ii();
        }
        var1.a(Rasterizer2D.pixels, Rasterizer2D.clipLeft, Rasterizer2D.width, Rasterizer2D.height, param0 ^ 194, Rasterizer2D.clipRight, Rasterizer2D.clipTop, Rasterizer2D.clipBottom);
        hi.field_v.addLast(var1, (byte) 3);
    }

    final static mp a(int param0, String param1) {
        String var2 = null;
        mp var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        mp stackIn_16_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          if (tf.field_d == null) {
            return null;
          }
          var7 = (CharSequence) ((Object) param1);
          var2 = gb.a(var7, 85);
          if (var2 == null) {
            var2 = param1;
          }
          if (param0 != 0) {
            var6 = (String) null;
            jf.a(-82, (String) null);
          }
          var3 = (mp) (tf.field_d.a((long)var2.hashCode(), -1));
          while (true) {
            if (var3 == null) {
              return null;
            }
            var8 = (CharSequence) ((Object) var3.field_Rb);
            var4 = gb.a(var8, param0 + 55);
            if (var4 == null) {
              var4 = var3.field_Rb;
            }
            if (!var4.equals(var2)) {
              var3 = (mp) (tf.field_d.a((byte) -43));
              continue;
            }
            break;
          }
          stackIn_16_0 = var3;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_21_0 = var2_ref;
          stackIn_21_1 = new StringBuilder().append("jf.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final void b(int param0) {
        int var6 = 0;
        int var7 = BrickABrac.field_J ? 1 : 0;
        int var3 = 26 % ((param0 - 50) / 56);
        q var2 = this.field_a.field_m[this.field_h];
        int var4 = var2.field_c;
        int var5 = var2.field_a;
        for (var6 = 0; var6 < this.field_f; var6++) {
          if (this.field_i == var6) {
            nb.a(-111, var5, var4, cm.field_r[var6]);
            ik.field_f[var6].f(var4, var5 - 1, 256);
          }
          da.field_E[var6].drawTransparent(var4, var5);
          var5 = var5 + (20 + da.field_E[var6].canvasHeight);
        }
    }

    final void a(int param0) {
        int var5 = 0;
        int var3;
        int var4;
        int var6;
        q var7;
        var6 = BrickABrac.field_J ? 1 : 0;
        if (this.field_a.field_h.field_j != this.field_h) {
          this.field_e = -1;
          this.field_b = false;
          this.field_j = -1;
          this.field_i = -1;
        } else {
          var7 = this.field_a.field_m[this.field_h];
          if (!this.field_b ||
            pq.field_k != this.field_e ||
            this.field_j != po.field_a) {
            var3 = var7.field_c;
            var4 = var7.field_a;
            for (var5 = 0; this.field_f > var5; var5++) {
              if (da.field_E[var5].containsPixel(var3, var4, pq.field_k, po.field_a)) {
                this.field_i = var5;
                break;
              }
              var4 = var4 + (da.field_E[var5].canvasHeight + 20);
            }
          }
          this.field_e = pq.field_k;
          this.field_j = po.field_a;
        }
        if (param0 <= 84) {
          this.field_h = 25;
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          return;
        }
        field_d = null;
        field_c = null;
        field_k = null;
        field_g = null;
    }

    final void c(int param0) {
        this.field_i = param0 + this.field_f;
        this.field_j = po.field_a;
        this.field_e = pq.field_k;
        this.field_b = true;
    }

    final void a(byte param0) {
        this.field_b = true;
        this.field_j = po.field_a;
        if (param0 <= 32) {
          return;
        }
        this.field_e = pq.field_k;
        this.field_i = 0;
    }

    jf(ah param0, int param1, int param2) {
        this.field_i = -1;
        try {
          this.field_f = param2;
          this.field_h = param1;
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "jf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_d = new String[]{"Levels"};
        field_g = "Quit";
    }
}
