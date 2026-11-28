/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc extends ui {
    String field_jb;
    int field_hb;
    static int field_db;
    static ResourceArchive field_eb;
    static int field_fb;
    static ResourceArchive field_gb;
    static String[] field_ib;
    static String field_kb;
    String field_R;

    final static int a(int param0, int param1, gb param2, int param3, gb param4, String param5, boolean param6) {
        int var12 = 0;
        int stackIn_5_0 = 0;
        PacketBuffer stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        String stackIn_12_2 = null;
        PacketBuffer stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        String stackIn_15_2 = null;
        int stackIn_33_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_68_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        int var10Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        var13 = Lexicominos.field_L ? 1 : 0;
        try {
          var14 = param4.b(25545);
          var8 = param2.b(25545);
          if (null == DelegatingCanvas.field_b &&
            !dg.a(false, true)) {
            stackIn_5_0 = -1;
            return stackIn_5_0;
          }
          if (AgeValidator.field_m == ae.field_E) {
            SpriteGeometry.field_q.position = 0;
            wh.field_d = null;
            if (param5 != null) {
              var9 = 0;
              of.field_a.position = 0;
              if (param6) {
                var9 = var9 | 1;
              }
              of.field_a.writeInt(q.field_a.nextInt(), -32287);
              of.field_a.writeInt(q.field_a.nextInt(), -32287);
              of.field_a.writePrefixedString((byte) -38, var14);
              of.field_a.writePrefixedString((byte) -38, var8);
              var15 = (CharSequence) ((Object) param5);
              of.field_a.writePrefixedString((byte) -38, ImageProducerRasterBuffer.a(var15, param3 + 30742));
              of.field_a.writeShort(param3 + 30884, param1);
              of.field_a.writeByte(param0, -1);
              of.field_a.writeByte(var9, param3 + 30761);
              SpriteGeometry.field_q.writeByte(18, -1);
              SpriteGeometry.field_q.position = SpriteGeometry.field_q.position + 2;
              var10 = SpriteGeometry.field_q.position;
              var11_ref_String = pg.a(RichTextLayout.c(param3 + 16715), (byte) -28);
              if (var11_ref_String == null) {
                var11_ref_String = "";
              }
              SpriteGeometry.field_q.writeTerminatedString(var11_ref_String, (byte) 0);
              wc.a(wb.field_m, SpriteGeometry.field_q, ContentTransitionDialog.field_T, (byte) 111, of.field_a);
              SpriteGeometry.field_q.backpatchShortLength(SpriteGeometry.field_q.position - var10, (byte) 26);
            } else {
              of.field_a.position = 0;
              of.field_a.writeInt(q.field_a.nextInt(), param3 ^ 1591);
              of.field_a.writeInt(q.field_a.nextInt(), -32287);
              stackIn_11_0 = of.field_a;
              stackIn_11_1 = -38;
              if (!param4.a(15738)) {
                stackIn_12_2 = "";
              } else {
                stackIn_12_2 = var14;
              }
              ((PacketBuffer) (Object) stackIn_11_0).writePrefixedString((byte) stackIn_11_1, stackIn_12_2);
              stackIn_14_0 = of.field_a;
              stackIn_14_1 = -38;
              if (param2.a(15738)) {
                stackIn_15_2 = var8;
              } else {
                stackIn_15_2 = "";
              }
              ((PacketBuffer) (Object) stackIn_14_0).writePrefixedString((byte) stackIn_14_1, stackIn_15_2);
              SpriteGeometry.field_q.writeByte(16, -1);
              SpriteGeometry.field_q.position = SpriteGeometry.field_q.position + 1;
              var9 = SpriteGeometry.field_q.position;
              wc.a(wb.field_m, SpriteGeometry.field_q, ContentTransitionDialog.field_T, (byte) 111, of.field_a);
              SpriteGeometry.field_q.backpatchByteLength(SpriteGeometry.field_q.position - var9, (byte) -128);
            }
            kc.a(-1, param3 ^ 30761);
            AgeValidator.field_m = TextLayout.field_e;
          }
          if (param3 != -30762) {
            hc.releaseDeclaredStaticReferences(-12);
          }
          if (AgeValidator.field_m == TextLayout.field_e &&
            a.b(1, 10343)) {
            var9Lifetime1 = ig.field_a.readUnsignedByte(true);
            ig.field_a.position = 0;
            if (var9Lifetime1 >= 100 &&
              var9Lifetime1 <= 105) {
              fc.field_S = new String[var9Lifetime1 - 100];
              AgeValidator.field_m = sg.field_l;
            } else {
              if (var9Lifetime1 == 248) {
                sa.a((byte) 108, RichTextLayout.c(-14047));
                wj.field_p = el.field_d;
                ProxyAuthenticationRequiredException.$cfr$intArgs$b$e683eeaaf5b5(-88);
                fb.field_p = false;
                stackIn_33_0 = var9Lifetime1;
                return stackIn_33_0;
              }
              if (var9Lifetime1 != 99) {
                a.field_c = -1;
                pg.field_d = var9Lifetime1;
                AgeValidator.field_m = RichTextWidget.field_F;
              } else {
                a.b(wg.b(param3 ^ -19296), 10343);
                wh.field_d = new Boolean(f.a(ig.field_a, 25444));
                ig.field_a.position = 0;
              }
            }
          }
          if (AgeValidator.field_m == sg.field_l) {
            var9Lifetime2 = 2;
            if (a.b(var9Lifetime2, 10343)) {
              var10Lifetime1 = ig.field_a.readUnsignedShort(-1698573656);
              ig.field_a.position = 0;
              if (a.b(var10Lifetime1, 10343)) {
                var11 = fc.field_S.length;
                for (var12 = 0; var12 < var11; var12++) {
                  fc.field_S[var12] = ig.field_a.readPrefixedString(0);
                }
                ProxyAuthenticationRequiredException.$cfr$intArgs$b$e683eeaaf5b5(-36);
                fb.field_p = false;
                stackIn_47_0 = 100 + var11;
                return stackIn_47_0;
              }
            }
          }
          if (RichTextWidget.field_F == AgeValidator.field_m &&
            NetworkArchiveRequest.d(2)) {
            if (pg.field_d == 255) {
              var9_ref_String = ig.field_a.readNullableString((byte) -49);
              if (var9_ref_String != null) {
                MouseWheelInput.a(var9_ref_String, -11971, RichTextLayout.c(-14047));
              }
            } else {
              wj.field_p = ig.field_a.readString(false);
            }
            ProxyAuthenticationRequiredException.$cfr$intArgs$b$e683eeaaf5b5(-85);
            fb.field_p = false;
            stackIn_57_0 = pg.field_d;
            return stackIn_57_0;
          }
          if (null == DelegatingCanvas.field_b) {
            if (fb.field_p) {
              if (vl.b(-116) <= 30000L) {
                wj.field_p = sa.field_h;
              } else {
                wj.field_p = nk.field_t;
              }
              fb.field_p = false;
              stackIn_65_0 = 249;
              return stackIn_65_0;
            }
            var9Lifetime3 = nj.field_a;
            nj.field_a = SingleChildWidgetContainer.field_y;
            SingleChildWidgetContainer.field_y = var9Lifetime3;
            fb.field_p = true;
          }
          stackIn_68_0 = -1;
          return stackIn_68_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_71_0 = var7;
          stackIn_71_1 = new StringBuilder().append("hc.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          stackIn_77_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',');
          if (param5 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          throw ValidationStatusIcon.wrapClientException((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',').append(param6).append(')').toString());
        }
    }

    final static PalettedBitmapFont a(byte param0, ResourceArchive param1, ResourceArchive param2, int param3, int param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        PalettedBitmapFont stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!DequeWidgetContainer.a(param4, param3, (byte) 124, param1)) {
            stackIn_2_0 = null;
            return (PalettedBitmapFont) (stackIn_2_0);
          }
          if (param0 < 97) {
            field_eb = (ResourceArchive) null;
          }
          stackIn_6_0 = fl.a(param2.getFile(param4, -27493, param3), (byte) -116);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("hc.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ValidationStatusIcon.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static int f(int param0) {
        if (param0 != -1980) {
          field_eb = (ResourceArchive) null;
        }
        return gd.field_o - me.field_v;
    }

    public static void releaseDeclaredStaticReferences(int param0) {
        field_ib = null;
        if (param0 != -1) {
          field_gb = (ResourceArchive) null;
        }
        field_eb = null;
        field_gb = null;
        field_kb = null;
    }

    final static void h(int param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        if (DraggableWidgetContainer.field_M != null) {
          var1 = DraggableWidgetContainer.field_M;
          synchronized (var1) {
            DraggableWidgetContainer.field_M = null;
          }
        }
        if (param0 != 249) {
          field_ib = (String[]) null;
        }
    }

    hc() {
        super(0L, (ui) null);
    }

    static {
        field_ib = new String[]{"Make a 5-letter word", "Make a 6-letter word", "Make a 7-letter word", "Make an 8-letter word", "Get a x3 multiplier", "Get a x4 multiplier", "Get a x5 multiplier", "Get a x6 multiplier", "Build a 3-part chain", "Build a 4-part chain", "Build a 5-part chain", "Reach level 5", "Reach level 10", "Reach level 15", "Reach level 20", "Recover from a panic situation"};
        field_kb = "Player Name: ";
    }
}
