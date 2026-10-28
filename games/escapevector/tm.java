/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tm extends vg implements ButtonListener {
    private TextButton field_eb;
    static long[][] field_db;
    static int[] field_bb;
    static String field_Z;
    static long[] field_ab;
    static Sprite[] field_cb;
    static int[] field_fb;

    public final void onAction(TextButton button, int buttonCode, int localY, int guard, int localX) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (guard != 1) {
            tm.c(-26, 47, -12);
          }
          if (button == this.field_eb) {
            this.o(127);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("tm.K(");
          if (button == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(buttonCode).append(',').append(localY).append(',').append(guard).append(',').append(localX).append(')').toString());
        }
    }

    final static qe[] c(int param0, int param1, int param2) {
        int var12 = 0;
        int[] var19 = null;
        qe var14 = null;
        int var15 = EscapeVector.obfuscationControl;
        int var3 = 12;
        int[] var4 = new int[]{3170352, 6332512};
        int[] var5 = new int[]{6340704, 16777215};
        if (param0 != 10) {
          field_bb = (int[]) null;
        }
        int var6 = 16777215;
        int var7 = 1;
        ih var8 = fh.field_g;
        int[][] var18 = ValidatedTextWidget.field_U[param2];
        int var10 = je.a(false, param2);
        if (1 + param1 < var10) {
          var10 = 1 + param1;
        }
        qe[] var11 = new qe[var10];
        for (var12 = 0; var12 < var10; var12++) {
          var19 = var18[var12];
          var14 = new qe(var12, var19, var3, var4, var5, var6, var7, var8);
          var11[var12] = var14;
        }
        return var11;
    }

    tm(tb param0, fc param1) {
        super(param0, 200, 150);
        Object var3 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        UiComponent var4 = null;
        try {
          var3 = null;
          if (AudioService.field_h == param1) {
            var3 = DialogueScreen.field_k;
          } else {
            if (param1 == ck.field_A) {
              this.height = this.height + 10;
              var3 = ol.field_K;
              if (tb.a(false)) {
                var3 = e.field_b;
                this.height = this.height + 20;
              }
            } else {
              if (um.field_d == param1) {
                var3 = eg.field_a;
                this.height = this.height + 30;
              }
            }
          }
          var4 = new UiComponent((String) (var3), (UiListener) null);
          var4.y = 50;
          var4.height = 80;
          var4.width = this.width;
          var4.x = 0;
          var4.painter = (WidgetPainter) ((Object) new TextWidgetPainter(ke.field_c, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.b(var4, false);
          this.field_eb = this.a(-1, TextFieldValidator.field_k, (UiListener) (this));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("tm.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) (stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void releaseStatics(int guard) {
        field_ab = null;
        field_cb = null;
        field_db = (long[][]) null;
        if (guard != -23008) {
          tm.c(105, -33, -63);
        }
        field_Z = null;
        field_fb = null;
        field_bb = null;
    }

    private final TextButton a(int param0, String param1, UiListener param2) {
        TextButton discarded$1 = null;
        TextButton var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        UiListener var6 = null;
        TextButton stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new TextButton(param1, param2);
          if (param0 != -1) {
            var6 = (UiListener) null;
            discarded$1 = this.a(36, (String) null, (UiListener) null);
          }
          var4.painter = (WidgetPainter) ((Object) new ck());
          var5 = this.height - 6;
          this.height = this.height + 38;
          var4.setBounds(-16 + this.width - 14, var5, 15, true, 30);
          this.b(var4, false);
          this.refreshLayout(param0 + 1);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("tm.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final void o(int param0) {
        if (!this.field_G) {
          return;
        }
        this.field_G = false;
        if (param0 <= 120) {
          tm.c(-66, -5, 40);
        }
    }

    private static long a(long param0, long param1) {
        return param0 | param1;
    }

    static {
        int var1 = 0;
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        long var8 = 0L;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        field_bb = new int[8192];
        field_ab = new long[11];
        field_Z = "Email (Login):";
        field_db = new long[8][256];
        field_cb = new Sprite[5];
        int var0 = 0;
        while (var0 < 256) {
            var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
            var2 = (var0 & 1) == 0 ? (long)(var1 >>> 8) : (long)(255 & var1);
            var4 = var2 << 1;
            if (!(var4 < 256L)) {
                var4 = var4 ^ 285L;
            }
            var6 = var4 << 1;
            if (!(var6 < 256L)) {
                var6 = var6 ^ 285L;
            }
            var8 = var6 ^ var2;
            var10 = var6 << 1;
            if (256L <= var10) {
                var10 = var10 ^ 285L;
            }
            var12 = var2 ^ var10;
            field_db[0][var0] = tm.a(tm.a(tm.a(var8 << 16, tm.a(tm.a(tm.a(var6 << 40, tm.a(var2 << 56, var2 << 48)), var2 << 32), var10 << 24)), var4 << 8), var12);
            for (var14 = 1; var14 < 8; var14++) {
                field_db[var14][var0] = tm.a(field_db[-1 + var14][var0] >>> 8, field_db[-1 + var14][var0] << 56);
            }
            var0++;
        }
        field_ab[0] = 0L;
        int var15 = 1;
        var0 = var15;
        while (10 >= var15) {
            var1 = -8 + 8 * var15;
            field_ab[var15] = ja.a(SpriteOffset.a(field_db[7][7 + var1], 255L), ja.a(ja.a(SpriteOffset.a(field_db[5][var1 + 5], 16711680L), ja.a(SpriteOffset.a(4278190080L, field_db[4][4 + var1]), ja.a(ja.a(SpriteOffset.a(field_db[2][2 + var1], 280375465082880L), ja.a(SpriteOffset.a(field_db[1][var1 + 1], 71776119061217280L), SpriteOffset.a(field_db[0][var1], -72057594037927936L))), SpriteOffset.a(1095216660480L, field_db[3][3 + var1])))), SpriteOffset.a(65280L, field_db[6][var1 + 6])));
            var15++;
        }
    }
}
