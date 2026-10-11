/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lr extends hs {
    static String field_l;
    static int field_m;
    private hd field_p;
    static int field_r;
    static String field_s;
    private hd field_k;
    static boolean[][] field_n;
    static String field_o;
    static int field_q;
    static String field_j;

    final static void b(byte param0) {
        if (null != op.field_y) {
          op.field_y.a(1);
          op.field_y = null;
        }
        if (param0 != -116) {
          field_o = (String) null;
        }
    }

    final void e(int param0) {
        String stackIn_16_0 = null;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_23_1 = 0;
        String var2_ref_String;
        int var2;
        int var3_int;
        String var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        var7 = Kickabout.field_G;
        this.c(param0 ^ 106);
        this.a(false, tl.field_b);
        if (!this.field_a.field_C.field_i[this.field_h]) {
          if (this.field_g != -2 &&
            this.field_g == this.field_a.b((byte) -89, this.field_h)) {
            var3_int = 0;
            for (var4 = 0; var4 < this.field_a.field_I; var4++) {
              if (~this.field_a.field_g[var4].field_p == ~this.field_h) {
                var3_int++;
              }
            }
            if (var3_int > 1) {
              stackIn_16_0 = b.field_J;
            } else {
              stackIn_16_0 = fr.field_I;
            }
            var2_ref_String = stackIn_16_0;
          } else {
            var2_ref_String = br.field_b;
          }
        } else {
          var2_ref_String = cb.field_a;
        }
        stackIn_20_0 = (!this.e(0, 50)) ? 0 : 1;
        var3_intLifetime1 = stackIn_20_0;
        var4Lifetime1 = 8 + pb.field_C.c(var2_ref_String, 185, 16);
        var5 = -33 + (-var4Lifetime1 + this.c(342, 0));
        stackIn_22_0 = 10 + var4Lifetime1;
        stackIn_23_1 = (var3_intLifetime1 == 0) ? 0 : 60;
        var6 = stackIn_22_0 + stackIn_23_1;
        on.f(390, var5, 205, var6, 10, 983040);
        on.a(390, var5, 205, var6, 10, 65793, 140);
        pb.field_C.a(var2_ref_String, 400, var5 + 8, 185, var6, 16777215, -1, param0, 0, 16);
        this.d(param0 - 95);
        this.b(param0 ^ -2352, this.field_a.field_v);
        var2 = this.field_a.field_C.field_k[this.field_h];
        on.a(220, 332, 150, 26, 8, 65793, 128);
        var3 = df.field_F[var2].toLowerCase();
        un.field_d.d(var3, 293, 351, 16777215, -1);
        qj.field_f.c(220, 100);
        for (var4Lifetime2 = 0; 4 > var4Lifetime2; var4Lifetime2++) {
          var5Lifetime1 = -(es.field_f.field_o >> 1) + 147 * ws.field_b[var2][var4Lifetime2] / 896 + 220;
          var6Lifetime1 = -(es.field_f.field_v >> 1) + ws.field_d[var2][var4Lifetime2] * 220 / 1344 + 100;
          es.field_f.c(var5Lifetime1, var6Lifetime1);
        }
        if (this.e(0, param0 + 49)) {
          this.field_k.a(102, false);
          this.field_p.a(param0 + 126, false);
        }
        var4Lifetime3 = 110;
        var5Lifetime2 = 230;
        if (-2 != this.field_g &&
          this.field_a.field_g[this.field_g].field_p == 1) {
          var6Lifetime2 = var4Lifetime3;
          var4Lifetime3 = var5Lifetime2;
          var5Lifetime2 = var6Lifetime2;
        }
        this.a(0, var4Lifetime3, (byte) -107, 30);
        this.a(1, var5Lifetime2, (byte) -78, 30);
        if (this.field_a.field_f) {
          un.field_d.a("FB", 5, 17, 16777215, -1);
        }
    }

    lr(nu param0, int param1, boolean param2) {
        super(param0, param1, param2, new int[]{41});
        int var4_int = 0;
        int var5 = 0;
        try {
          this.field_c[0] = new io(-4, 7126504, 41);
          this.field_k = eo.a(false);
          this.field_p = eo.a(true);
          var4_int = this.field_k.field_N.field_o;
          var5 = this.field_k.field_N.field_v;
          this.field_k.field_s = -3 - var4_int + (this.d(127, 0) - (this.field_c[0].field_d >> 1));
          this.field_k.field_J = this.c(342, 0) - (var5 >> 1);
          this.field_p.field_s = 3 + this.d(117, 0) + (this.field_c[0].field_d >> 1);
          this.field_p.field_J = this.c(342, 0) - (var5 >> 1);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "lr.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(java.awt.Component param0, int param1) {
        try {
          param0.removeKeyListener(nr.field_q);
          if (param1 >= -3) {
            field_s = (String) null;
          }
          param0.removeFocusListener(nr.field_q);
          rc.field_d = -1;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "lr.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void f(int param0) {
        field_s = null;
        field_n = (boolean[][]) null;
        field_o = null;
        if (param0 != -15640) {
          java.awt.Component var2 = (java.awt.Component) null;
          lr.a((java.awt.Component) null, 101);
        }
        field_j = null;
        field_l = null;
    }

    final boolean e(int param0, int param1) {
        int var3;
        int var4;
        boolean stackIn_16_0 = false;
        if (this.field_g == -2) {
          return false;
        }
        var3 = this.field_a.field_g[this.field_g].field_p;
        if (this.field_a.b((byte) -71, this.field_a.field_g[this.field_g].field_p) != this.field_g) {
          return false;
        }
        if (this.field_a.field_C.field_i[var3]) {
          return false;
        }
        var4 = this.field_a.field_C.field_k[this.field_a.field_g[this.field_g].field_p];
        if (param1 != 50) {
          field_s = (String) null;
        }
        boolean decompiledFrameRemainder0 = true;
        if (1 != param0 ||
          var4 != 0) {
          if (param0 != 2) {
            return true;
          }
          if (var4 != ws.field_b.length - 1) {
            stackIn_16_0 = true;
            decompiledFrameRemainder0 = false;
          }
        }
        if (decompiledFrameRemainder0) {
          stackIn_16_0 = false;
        }
        return stackIn_16_0;
    }

    final void a(int param0, boolean param1) {
        if (param0 >= -92) {
          this.c(-63, 11);
        }
        super.a(-124, param1);
        if (-2 != this.field_g) {
          this.field_k.field_lb = this.e(1, 50);
          this.field_p.field_lb = this.e(2, 50);
          this.field_k.b(0, param1);
          this.field_p.b(0, param1);
          if (this.field_k.field_sb != 0) {
            kj.a((byte) -121);
            this.g(8, 0);
          }
          if (this.field_p.field_sb != 0) {
            kj.a((byte) 49);
            this.g(8, 1);
          }
        }
    }

    private final void g(int param0, int param1) {
        this.field_a.a(mf.a(param1, this.field_g, (byte) 0), param0 ^ -127);
        if (this.field_f) {
          or.field_d.b(73, (byte) 112);
          or.field_d.a(param0 ^ 96, param1);
        }
        if (param0 != 8) {
          this.e(29, 11);
        }
    }

    final int c(int param0, int param1) {
        if (param0 != 342) {
          field_n = (boolean[][]) null;
        }
        return 224;
    }

    final int d(int param0, int param1) {
        if (param0 <= 106) {
          this.field_p = (hd) null;
        }
        return 493;
    }

    final void f(int param0, int param1) {
        if (param0 <= 98) {
          return;
        }
        if (param1 == 41) {
          this.g(8, 2);
        }
    }

    static {
        field_l = "won";
        field_o = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_n = new boolean[][]{new boolean[]{false, false, false}, new boolean[]{false, true}, new boolean[]{false, true}, new boolean[]{false, true}};
        field_s = "This private message is prefixed with \"<col=9090FF>To <%1>:</col>\" on your screen.<br>On <%1>'s screen, it will be prefixed with \"<col=FF6060>From <%0>:</col>\", which is<br>a different length and may leave less room for the message itself.<br><br>This shading covers the area which is not available on <%1>'s screen.<br>Provided your message fits to the left of the shaded area,<br><%1> should be able to see it in full.<br><br>(Note: this may be inaccurate if <%1> is playing in a different<br>language from you.)";
        field_j = "beach";
    }
}
