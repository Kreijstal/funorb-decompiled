/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng extends rg {
    private String field_K;
    private boolean field_O;
    static String[] field_J;
    private ss field_L;
    private boolean field_P;
    private String field_M;

    final void k(int param0) {
        this.field_O = true;
        int var2 = 105 / ((param0 + 39) / 32);
        this.field_L.field_u = false;
    }

    final void a(boolean param0, int param1, String param2, float param3) {
        try {
          if ((param0 ? 1 : 0) == (!this.field_P ? 1 : 0)) {
            this.field_P = param0 ? true : false;
            if (this.field_P) {
              this.field_L.a(4210752, 8405024, (byte) 54);
              this.field_L.field_u = true;
            } else {
              this.field_L.a(4210752, 2113632, (byte) 71);
              if (this.field_O) {
                this.field_L.field_u = false;
              }
            }
          }
          if (param1 >= -80) {
            this.field_O = false;
          }
          this.field_K = param2;
          this.field_L.field_z = (int)(param3 / 100.0f * 65536.0f);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ng.W(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    ng(lt param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
          this.field_M = param1;
          if (this.field_M != null) {
            var3_int = b.field_c.measureWrappedHeight(this.field_M, 260, b.field_c.maxAscent);
            this.a(300, (byte) 29, var3_int + 150);
          }
          this.field_L = new ss(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_P = false;
          this.field_L.field_u = true;
          this.field_O = false;
          this.a(this.field_L, 1);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ng.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(BitmapFont param0, String param1, co param2, int param3, byte param4) {
        int var7 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param4 != 30) {
            field_J = (String[]) null;
          }
          var5_int = 0;
          var6 = -1;
          for (var7 = 1; var7 < param1.length(); var7++) {
            var8 = param1.charAt(var7);
            if (60 == var8) {
              var6 = (var5_int >> 8) + param2.field_h[0] + param0.measureTextWidth(param1.substring(0, var7));
            }
            if (var6 != -1) {
              param2.field_h[var7] = var6;
            } else {
              if (var8 == 32) {
                var5_int = var5_int + param3;
              }
              param2.field_h[var7] = param2.field_h[0] + (var5_int >> 8) + (param0.measureTextWidth(param1.substring(0, 1 + var7)) - param0.measureCharacterAdvance((char) var8));
            }
            if (var8 == 62) {
              var6 = -1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("ng.V(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void j(int param0) {
        field_J = null;
        if (param0 != 11617) {
          co var2 = (co) null;
          ng.a((BitmapFont) null, (String) null, (co) null, 27, (byte) -23);
        }
    }

    final void a(boolean param0, int param1, int param2) {
        super.a(param0, param1, param2);
        b.field_c.drawCenteredText(this.field_K, (this.field_q >> 1) + param1, 103 + param2, 16777215, -1);
        if (null != this.field_M) {
          SoftwareRasterizer.drawHorizontalLine(20 + param1, 120 + param2 - 7, 260, 8421504);
          b.field_c.drawParagraph(this.field_M, 20 + param1, 128 + param2, 260, 100, 16777215, -1, 1, 0, b.field_c.maxAscent);
        }
    }

    static {
        field_J = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
    }
}
