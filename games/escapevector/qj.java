/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    int field_h;
    int field_b;
    static ee field_g;
    static String field_d;
    static int field_c;
    static java.awt.Frame field_f;
    static PacketBuffer field_a;
    static java.awt.Frame field_i;
    static String field_e;

    final static void a(int param0, int param1, int param2, int param3, Sprite param4, int param5, int param6, int param7) {
        String stackIn_47_2 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var19 = EscapeVector.obfuscationControl;
        try {
          if (param6 > 0) {
            if (20 >= param6) {
              var8_int = 0;
              var9 = param6;
              if (var9 > 20) {
                var9 = 20;
              }
              if (var9 <= 10) {
                var8_int = 0;
              } else {
                var8_int = -10 + var9;
                var8_int = 224 * (var8_int * var8_int) / 100;
                var9 = 20 * var9 / (var8_int + 20);
              }
              var10 = var9 * var9;
              for (var11 = param5 - var9; param5 + var9 > var11; var11++) {
                var12 = param3 + (-var8_int + var11 * 640);
                var13 = (-param5 + var11) * (1 + (var11 - param5));
                for (var14 = -var9; var14 < 0; var14++) {
                  int var15 = var13 + var14 * (1 + var14);
                  if (var15 < var10) {
                    int var16 = -(var15 * 255 / var10) + 255;
                    SoftwareRasterizer.pixels[var14 + var12] = var16 * 65793;
                  }
                }
                var14 = -(255 * var13 / var10) + 255;
                for (int var15Lifetime1 = -var8_int; var15Lifetime1 < var8_int; var15Lifetime1++) {
                  int incrementValue$0 = var12;
                  var12++;
                  SoftwareRasterizer.pixels[incrementValue$0] = var14 * 65793;
                }
                for (var14 = 0; var14 < var9; var14++) {
                  int var15Lifetime2 = var13 + var14 * (var14 + 1);
                  if (var15Lifetime2 < var10) {
                    int var16Lifetime1 = -(255 * var15Lifetime2 / var10) + 255;
                    SoftwareRasterizer.pixels[var14 + var12] = var16Lifetime1 * 65793;
                  }
                }
              }
            } else if (param6 < 30) {
              var8_int = param6 - 20;
              var8_int = param4.fullHeight / 2 * (var8_int * var8_int) / 100;
              if (0 < var8_int) {
                var9 = param4.fullHeight / 2 * 65536 / var8_int;
                var10 = var9 >> 1;
                for (var11 = 0; var11 < var8_int + var8_int; var11++) {
                  var12 = var10 >> 16;
                  var10 = var10 + var9;
                  if (var12 >= param4.offsetY &&
                    var12 < param4.offsetY + param4.height) {
                    var13 = param4.width * var12;
                    var14 = (var11 - var8_int + param5) * 640 + param7 + param4.offsetX;
                    double var15_double = 8.0 * Math.sin((double)param1 + (double)((param1 & 7) + 8) * ((double)var12 * 0.001));
                    var15_double = var15_double + Math.sin((double)(param1 + var12) * 0.002 * (double)((5 * param1 & 31) + 16)) * 4.0;
                    var14 = var14 + (int)Math.floor(var15_double + 0.5);
                    for (int var17 = 0; param4.width > var17; var17++) {
                      int incrementValue$1 = var13;
                      var13++;
                      int var18 = param4.pixels[incrementValue$1];
                      int incrementValue$2 = var14;
                      var14++;
                      SoftwareRasterizer.pixels[incrementValue$2] = var18 - ae.a(4144959, var18 >> 2);
                    }
                  }
                }
              }
            } else {
              param4.e(param7, param2);
            }
          }
          if (param0 != -1276284702) {
            field_a = (PacketBuffer) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var8 = decompiledCaughtException;
          RuntimeException stackIn_46_0 = var8;
          StringBuilder stackIn_46_1 = new StringBuilder().append("qj.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final static void a(int param0) {
        regionExit1: {
          int var2 = EscapeVector.obfuscationControl;
          boolean var1 = (UiComponent.field_o.field_b.field_j);
          if (!UiContainer.e((byte) -32) ||
            UiComponent.field_o.field_f == 2) {
            if (aj.b(-119)) {
              if (UiComponent.field_o.field_f == 0) {
                if (UiContainer.e((byte) -122)) {
                  break regionExit1;
                }
                if (aj.b(-126)) {
                  break regionExit1;
                }
                if (1 == UiComponent.field_o.field_f) {
                  break regionExit1;
                }
              }
              UiComponent.field_o = new pf((var1));
              break regionExit1;
            }
            if (!UiContainer.e((byte) -122) &&
              !aj.b(-126) &&
              1 != UiComponent.field_o.field_f) {
              UiComponent.field_o = new pf((var1));
            }
          } else {
            UiComponent.field_o = new pf((var1));
          }
        }
        if (param0 != -883) {
          Sprite var3 = (Sprite) null;
          qj.a(-40, 111, 116, 104, (Sprite) null, -68, -42, 107);
        }
    }

    final static int a(byte param0, int param1, int param2) {
        if (param0 != -38) {
          qj.releaseStatics(69);
        }
        return DraggableWidget.a(param2, param1, false, TerrainMaskSupport.field_d);
    }

    qj(int param0, int param1) {
        this.field_b = param1;
        this.field_h = param0;
    }

    public static void releaseStatics(int guard) {
        field_i = null;
        field_g = null;
        field_e = null;
        if (guard != -10497) {
          field_c = -87;
        }
        field_f = null;
        field_d = null;
        field_a = null;
    }

    static {
        field_g = new ee("");
        field_d = "Ship";
        field_c = 0;
        field_a = new PacketBuffer(256);
        field_e = " - shoot";
    }
}
