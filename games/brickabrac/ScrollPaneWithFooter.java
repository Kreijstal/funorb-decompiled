/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ScrollPaneWithFooter extends UiComponent {
    UiComponent rightFooter;
    static th field_Sb;
    ScrollPane scrollPane;
    UiComponent content;
    UiComponent leftFooter;
    static int field_Pb;
    static String field_Rb;
    static String field_Ub;
    static int field_Yb;
    static String field_Vb;

    final static RgbSprite[] a(int param0, byte param1, int param2, int param3, int param4) {
        if (param1 >= -62) {
          field_Pb = -111;
        }
        RgbSprite[] var6 = new RgbSprite[9];
        RgbSprite[] var5 = var6;
        RgbSprite dupTemp$0 = hd.a(param2, param0, (byte) -6);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        RgbSprite dupTemp$1 = hd.a(param4, param0, (byte) -6);
        var6[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        if (param3 != 0) {
          var6[4] = hd.a(param3, 64, (byte) -6);
        }
        return var5;
    }

    final static void a(int param0, gb param1) {
        int stackIn_2_0;
        UiComponent stackIn_2_1;
        Object stackIn_2_2;
        Object stackIn_2_3;
        String stackIn_2_4;
        int stackIn_3_5 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        nn var5 = null;
        String var6 = null;
        nn var7 = null;
        String var8 = null;
        nn var9 = null;
        String var10 = null;
        nn var11 = null;
        String var12 = null;
        nn var13 = null;
        try {
          stackIn_2_0 = param1.field_c;
          stackIn_2_1 = param1.field_b;
          stackIn_2_2 = null;
          stackIn_2_3 = null;
          stackIn_2_4 = param1.field_m;
          if (param1.field_c == 1) {
            stackIn_3_5 = param1.field_o;
          } else {
            stackIn_3_5 = 0;
          }
          SpriteGeometry.a(stackIn_2_0, stackIn_2_1, (ScrollPane) (stackIn_2_2), (int[]) (stackIn_2_3), stackIn_2_4, stackIn_3_5, (byte) -58, param1.field_k, param1.field_q);
          if (param1.field_c == 0 &&
            !cb.e(-91) &&
            null == o.field_e &&
            nl.field_f == null) {
            if (!qo.field_I) {
              var5 = bm.field_d;
              var6 = LevelPackSelectScreen.field_x;
              var5.field_d.a(var6, 14, (byte) 84);
            }
            var7 = bm.field_d;
            var8 = tq.field_b;
            var7.field_d.a(var8, 20, (byte) 118);
          }
          if (param1.field_c == 1 &&
            !cb.e(-128) &&
            null != o.field_e &&
            param1.field_o == o.field_e.e((byte) 118)) {
            if (!qo.field_I) {
              var9 = bm.field_d;
              var10 = hc.field_b;
              var9.field_d.a(var10, 14, (byte) 120);
            }
            var11 = bm.field_d;
            var12 = MultiplayerExitScreen.field_y;
            var11.field_d.a(var12, 20, (byte) 103);
          }
          bm.field_d.a(true);
          bm.field_d.a(true, false);
          bm.field_d.a(param1.field_g, (byte) -79, param1.field_c);
          bm.field_d.a((byte) -126);
          bm.field_d.a(param1, -96);
          var13 = bm.field_d;
          var3 = tb.pressX;
          var4 = qo.pressY;
          var13.field_d.a(var4, -101, 0, param0, var3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_22_0 = var2;
          stackIn_22_1 = new StringBuilder().append("hj.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    ScrollPaneWithFooter(long id, UiComponent styleTemplate, UiComponent viewportStyle, VerticalScrollbar scrollbarStyle, UiComponent footerStyle, String leftText, String rightText) {
        super(id, styleTemplate);
        try {
          this.content = new UiComponent(0L, (UiComponent) null);
          this.scrollPane = new ScrollPane(0L, this.content, viewportStyle, scrollbarStyle);
          this.leftFooter = new UiComponent(0L, footerStyle);
          this.rightFooter = new UiComponent(0L, footerStyle);
          this.leftFooter.text = leftText;
          this.rightFooter.text = rightText;
          this.addChild(this.scrollPane, 0);
          this.addChild(this.leftFooter, 0);
          this.addChild(this.rightFooter, 0);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "hj.<init>(" + id + ',' + (styleTemplate != null ? "{...}" : "null") + ',' + (viewportStyle != null ? "{...}" : "null") + ',' + (scrollbarStyle != null ? "{...}" : "null") + ',' + (footerStyle != null ? "{...}" : "null") + ',' + (leftText != null ? "{...}" : "null") + ',' + (rightText != null ? "{...}" : "null") + ')');
        }
    }

    final void setPaneFooterBounds(boolean obfuscationGuard, int scrollbarWidth, int width, int x, int y, int contentRightInset, int footerHeight, int height) {
        if (!obfuscationGuard) {
          return;
        }
        this.width = width;
        this.height = height;
        this.localX = x;
        this.localY = y;
        this.layoutPaneFooter(footerHeight, -779, contentRightInset, scrollbarWidth);
    }

    public static void h(int param0) {
        field_Ub = null;
        field_Sb = null;
        if (param0 > -15) {
          gb var2 = (gb) null;
          ScrollPaneWithFooter.a(-63, (gb) null);
        }
        field_Vb = null;
        field_Rb = null;
    }

    final static void b(int param0, int param1) {
        IntrusiveNode var2 = null;
        int var3 = 0;
        ln var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param1 != 0) {
            return;
          }
          var4 = (ln) (MidiSynthesizer.field_v.first(-28));
          while (var4 != null) {
            MultiplayerExitScreen.a(param0, 125, var4);
            var4 = (ln) (MidiSynthesizer.field_v.next((byte) 116));
          }
          var2 = uc.field_q.first(-54);
          while (var2 != null) {
            bd.a(param0, 92);
            var2 = uc.field_q.next((byte) 116);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var2_ref), "hj.D(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, String param4, int param5) {
        try {
          Rasterizer2D.a(param0, -param2 + param1, param3, param2, 3, 0, 196);
          Rasterizer2D.c(param0, -param2 + param1, param3, param2, 3, param5);
          ob.field_D.drawLeft(param4, MusicPatch.pointerX, -1 + (-ob.field_D.descent + po.pointerY - ob.field_D.descent), 2, -1);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "hj.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final static int encodeCp1252(int endIndex, byte[] destination, byte obfuscationGuard, int destinationOffset, CharSequence text, int startIndex) {
        int stackIn_3_0 = 0;
        int stackIn_69_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          var6_int = endIndex - startIndex;
          var7 = 0;
          if (obfuscationGuard != 86) {
            stackIn_3_0 = -79;
            return stackIn_3_0;
          }
          while (var7 < var6_int) {
            {
              var8 = text.charAt(var7 + startIndex);
              if ((var8 <= 0 ||
                var8 >= 128) && (160 > var8 ||
                var8 > 255)) {
                switch (var8) {
                  case 8364:
                    destination[var7 + destinationOffset] = (byte)-128;
                    break;
                  case 8218:
                    destination[destinationOffset + var7] = (byte)-126;
                    break;
                  case 402:
                    destination[destinationOffset + var7] = (byte)-125;
                    break;
                  case 8222:
                    destination[var7 + destinationOffset] = (byte)-124;
                    break;
                  case 8230:
                    destination[destinationOffset + var7] = (byte)-123;
                    break;
                  case 8224:
                    destination[var7 + destinationOffset] = (byte)-122;
                    break;
                  case 8225:
                    destination[destinationOffset + var7] = (byte)-121;
                    break;
                  case 710:
                    destination[var7 + destinationOffset] = (byte)-120;
                    break;
                  case 8240:
                    destination[destinationOffset + var7] = (byte)-119;
                    break;
                  case 352:
                    destination[destinationOffset + var7] = (byte)-118;
                    break;
                  case 8249:
                    destination[destinationOffset + var7] = (byte)-117;
                    break;
                  case 338:
                    destination[destinationOffset + var7] = (byte)-116;
                    break;
                  case 381:
                    destination[var7 + destinationOffset] = (byte)-114;
                    break;
                  case 8216:
                    destination[destinationOffset + var7] = (byte)-111;
                    break;
                  case 8217:
                    destination[var7 + destinationOffset] = (byte)-110;
                    break;
                  case 8220:
                    destination[var7 + destinationOffset] = (byte)-109;
                    break;
                  case 8221:
                    destination[var7 + destinationOffset] = (byte)-108;
                    break;
                  case 8226:
                    destination[var7 + destinationOffset] = (byte)-107;
                    break;
                  case 8211:
                    destination[destinationOffset + var7] = (byte)-106;
                    break;
                  case 8212:
                    destination[destinationOffset + var7] = (byte)-105;
                    break;
                  case 732:
                    destination[destinationOffset + var7] = (byte)-104;
                    break;
                  case 8482:
                    destination[var7 + destinationOffset] = (byte)-103;
                    break;
                  case 353:
                    destination[var7 + destinationOffset] = (byte)-102;
                    break;
                  case 8250:
                    destination[destinationOffset + var7] = (byte)-101;
                    break;
                  case 339:
                    destination[var7 + destinationOffset] = (byte)-100;
                    break;
                  case 382:
                    destination[destinationOffset + var7] = (byte)-98;
                    break;
                  default:
                    destination[var7 + destinationOffset] = (byte)63;
                    break;
                  case 376:
                    destination[destinationOffset + var7] = (byte)-97;
                    break;
                }
              } else {
                destination[var7 + destinationOffset] = (byte)var8;
              }
            }
            var7++;
          }
          stackIn_69_0 = var6_int;
          return stackIn_69_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_72_0 = var6;
          stackIn_72_1 = new StringBuilder().append("hj.C(").append(endIndex).append(',');
          if (destination == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_75_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(obfuscationGuard).append(',').append(destinationOffset).append(',');
          if (text == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(startIndex).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        var13 = BrickABrac.field_J ? 1 : 0;
        try {
          var5_int = param4 + param1;
          if (param2 < 114) {
            field_Ub = (String) null;
          }
          var6 = param0 + param3;
          if (Rasterizer2D.clipLeft >= param1) {
            stackIn_6_0 = Rasterizer2D.clipLeft;
          } else {
            stackIn_6_0 = param1;
          }
          var7 = stackIn_6_0;
          if (Rasterizer2D.clipTop < param0) {
            stackIn_9_0 = param0;
          } else {
            stackIn_9_0 = Rasterizer2D.clipTop;
          }
          var8 = stackIn_9_0;
          if (Rasterizer2D.clipRight > var5_int) {
            stackIn_12_0 = var5_int;
          } else {
            stackIn_12_0 = Rasterizer2D.clipRight;
          }
          var9 = stackIn_12_0;
          if (Rasterizer2D.clipBottom <= var6) {
            stackIn_15_0 = Rasterizer2D.clipBottom;
          } else {
            stackIn_15_0 = var6;
          }
          var10 = stackIn_15_0;
          if (Rasterizer2D.clipLeft <= param1 &&
            param1 < Rasterizer2D.clipRight) {
            var11 = var8 * Rasterizer2D.width + param1;
            var12 = -var8 + 1 + var10 >> 1;
            while (true) {
              var12--;
              if (var12 < 0) {
                break;
              }
              Rasterizer2D.pixels[var11] = 16777215;
              var11 = var11 + 2 * Rasterizer2D.width;
            }
          }
          if (param0 >= Rasterizer2D.clipTop &&
            Rasterizer2D.clipBottom > var6) {
            var11Lifetime1 = var7 + param0 * Rasterizer2D.width;
            var12Lifetime1 = -var7 + 1 + var9 >> 1;
            while (true) {
              var12Lifetime1--;
              if (0 > var12Lifetime1) {
                break;
              }
              Rasterizer2D.pixels[var11Lifetime1] = 16777215;
              var11Lifetime1 += 2;
            }
          }
          if (Rasterizer2D.clipLeft <= var5_int &&
            Rasterizer2D.clipRight > var5_int) {
            var11Lifetime2 = var5_int + ((1 & -param1 + var5_int) + var8) * Rasterizer2D.width;
            var12Lifetime2 = -var8 + (1 + var10) >> 1;
            while (true) {
              var12Lifetime2--;
              if (0 > var12Lifetime2) {
                break;
              }
              Rasterizer2D.pixels[var11Lifetime2] = 16777215;
              var11Lifetime2 = var11Lifetime2 + Rasterizer2D.width * 2;
            }
          }
          if (Rasterizer2D.clipTop <= param0) {
            if (Rasterizer2D.clipBottom <= var6) {
              return;
            }
            var11Lifetime3 = (var6 - param0 & 1) + (var7 + var6 * Rasterizer2D.width);
            var12Lifetime3 = 1 + var9 - var7 >> 1;
            while (true) {
              var12Lifetime3--;
              if (var12Lifetime3 < 0) {
                break;
              }
              Rasterizer2D.pixels[var11Lifetime3] = 16777215;
              var11Lifetime3 += 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var5), "hj.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void layoutPaneFooter(int footerHeight, int obfuscationGuard, int contentRightInset, int scrollbarWidth) {
        int footerSplitX = (scrollbarWidth + this.width) / 2;
        int footerY = -footerHeight + this.height;
        this.scrollPane.setScrollPaneBounds(scrollbarWidth, (byte) -111, this.width, 0, 0, contentRightInset, footerY - scrollbarWidth);
        this.leftFooter.height = footerHeight;
        this.leftFooter.localX = 0;
        this.leftFooter.width = -scrollbarWidth + footerSplitX;
        this.leftFooter.localY = footerY;
        this.rightFooter.localY = footerY;
        this.rightFooter.width = -footerSplitX + this.width;
        this.rightFooter.localX = footerSplitX;
        this.rightFooter.height = footerHeight;
        if (obfuscationGuard != -779) {
          this.leftFooter = (UiComponent) null;
        }
    }

    ScrollPaneWithFooter(long id, ScrollPaneWithFooter styleTemplate, String leftText, String rightText) {
        this(id, styleTemplate, styleTemplate.scrollPane.viewport, styleTemplate.scrollPane.scrollbar, styleTemplate.leftFooter, leftText, rightText);
    }

    static {
        field_Pb = 0;
        field_Sb = new th(11, 0, 1, 2);
        field_Rb = "Invalid date";
        field_Yb = 20;
        field_Ub = "Unable to delete friend - system busy";
        field_Vb = "Lost";
    }
}
