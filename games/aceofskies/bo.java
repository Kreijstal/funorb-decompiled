/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bo {
    static int field_h;
    static String field_g;
    private fo field_b;
    private RenderSprite field_d;
    static IntrusiveDeque field_i;
    static BitmapFont menuBitmapFont;
    private int[] field_e;
    private GraphicsRenderer field_c;
    private fo field_f;

    final static boolean a(byte param0) {
        if (param0 != 102) {
          bo.a((byte) -128);
          if (hr.field_e == null) {
            return false;
          }
          if (null != hr.field_e.d((byte) -112)) {
            return true;
          }
          return false;
        }
        if (hr.field_e == null) {
          return false;
        }
        if (null != hr.field_e.d((byte) -112)) {
          return true;
        }
        return false;
    }

    final static SoundPlayback a(PcmSample[] param0, int param1, int param2) {
        String stackIn_7_2 = null;
        try {
          if (param2 != 23187) {
            field_g = (String) null;
          }
          SoundPlayback stackIn_3_0 = gg.a(param0[qq.a(20, param0.length)], param1, -27227);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var3;
          StringBuilder stackIn_6_1 = new StringBuilder().append("bo.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(boolean param0) {
        fo var3 = null;
        fo var2 = null;
        if (this.field_b.field_b != this.field_d) {
          this.field_c.a();
          if (null != this.field_b.field_b) {
            this.field_c.a(this.field_b.field_b, true);
          } else {
            this.field_d = this.field_b.field_b;
            if (!param0) {
              bo.a(65);
              this.field_c.KA(this.field_b.field_d, this.field_b.field_g, this.field_b.field_a, this.field_b.field_e);
              var3 = this.field_b;
              var2 = var3;
              this.field_b = this.field_b.field_c;
              var3.field_c = this.field_f;
              var3.field_b = null;
              this.field_f = var3;
              return;
            }
            this.field_c.KA(this.field_b.field_d, this.field_b.field_g, this.field_b.field_a, this.field_b.field_e);
            var3 = this.field_b;
            var2 = var3;
            this.field_b = this.field_b.field_c;
            var3.field_c = this.field_f;
            var3.field_b = null;
            this.field_f = var3;
            return;
          }
          this.field_d = this.field_b.field_b;
          if (!param0) {
            bo.a(65);
            this.field_c.KA(this.field_b.field_d, this.field_b.field_g, this.field_b.field_a, this.field_b.field_e);
            fo var3Lifetime3 = this.field_b;
            fo var2Lifetime3 = var3Lifetime3;
            this.field_b = this.field_b.field_c;
            var3Lifetime3.field_c = this.field_f;
            var3Lifetime3.field_b = null;
            this.field_f = var3Lifetime3;
            return;
          }
          this.field_c.KA(this.field_b.field_d, this.field_b.field_g, this.field_b.field_a, this.field_b.field_e);
          fo var3Lifetime4 = this.field_b;
          fo var2Lifetime4 = var3Lifetime4;
          this.field_b = this.field_b.field_c;
          var3Lifetime4.field_c = this.field_f;
          var3Lifetime4.field_b = null;
          this.field_f = var3Lifetime4;
          return;
        }
        if (param0) {
          this.field_c.KA(this.field_b.field_d, this.field_b.field_g, this.field_b.field_a, this.field_b.field_e);
          fo var3Lifetime1 = this.field_b;
          fo var2Lifetime1 = var3Lifetime1;
          this.field_b = this.field_b.field_c;
          var3Lifetime1.field_c = this.field_f;
          var3Lifetime1.field_b = null;
          this.field_f = var3Lifetime1;
          return;
        }
        bo.a(65);
        this.field_c.KA(this.field_b.field_d, this.field_b.field_g, this.field_b.field_a, this.field_b.field_e);
        fo var3Lifetime2 = this.field_b;
        fo var2Lifetime2 = var3Lifetime2;
        this.field_b = this.field_b.field_c;
        var3Lifetime2.field_c = this.field_f;
        var3Lifetime2.field_b = null;
        this.field_f = var3Lifetime2;
    }

    private final void b(int param0) {
        fo var2 = null;
        this.field_c.K(this.field_e);
        if (null != this.field_f) {
          var2 = this.field_f;
          this.field_f = this.field_f.field_c;
        } else {
          var2 = new fo();
        }
        var2.a((byte) 46, this.field_e[3], this.field_e[2], this.field_b, this.field_e[1], this.field_d, this.field_e[0]);
        this.field_b = var2;
        if (param0 == 884) {
          return;
        }
        field_h = -21;
    }

    public static void a(int param0) {
        field_i = null;
        if (param0 != 18598) {
          field_i = (IntrusiveDeque) null;
          field_g = null;
          menuBitmapFont = null;
          return;
        }
        field_g = null;
        menuBitmapFont = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 120 % ((param4 - 25) / 44);
        this.b(884);
        this.field_c.T(param1, param3, param0, param2);
    }

    bo(GraphicsRenderer param0) {
        this.field_d = null;
        this.field_e = new int[4];
        try {
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "bo.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = "Loading extra data";
        field_i = new IntrusiveDeque();
    }
}
