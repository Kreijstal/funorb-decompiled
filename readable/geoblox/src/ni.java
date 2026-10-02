/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni extends ee implements pl {
    private String field_K;
    private f field_J;
    private hk[] field_F;
    private int[] field_H;
    private BitmapFont field_G;
    private int field_D;
    static String createToUseText;
    static int field_I;

    private final void c(int param0, int param1) {
        int var5 = 0;
        int var6 = Geoblox.field_C;
        if (this.field_D >= param1) {
            return;
        }
        hk[] var7 = new hk[param1];
        hk[] var3 = var7;
        int[] var4 = new int[param1];
        for (var5 = 0; var5 < this.field_D; var5++) {
            var7[var5] = this.field_F[var5];
            var4[var5] = this.field_H[var5];
        }
        this.field_F = var3;
        this.field_H = var4;
        this.field_D = param1;
        if (param0 != -11272) {
            this.field_G = (BitmapFont) null;
        }
    }

    final static void a(ResourceArchive param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        nf var5 = null;
        int[] var6 = null;
        int var7 = 0;
        PacketBuffer var8 = null;
        int var9 = 0;
        PacketBuffer var10 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var7 = Geoblox.field_C;
        try {
          var8 = new PacketBuffer(param0.getNamedFile(param1 + param1, "", "logo.fo3d"));
          var10 = var8;
          var3 = var10.readUnsignedByte((byte) 34);
          var10.beginBitAccess(param1 + 8);
          l.field_i = jc.a(var10, true);
          ArchiveIndex.field_l = new nf[var3];
          pi.field_R = new int[var3][];
          for (var4 = 0; var4 < var3; var4++) {
            ArchiveIndex.field_l[var4] = uh.a(var8, (byte) 113);
          }
          var10.endBitAccess(-16989);
          var9 = 0;
          var4 = var9;
          L1: while (var3 > var9) {
            var5 = ArchiveIndex.field_l[var9];
            var5.a(6, 1, (byte) 89, 6, 6);
            var5.a((byte) -99);
            var6 = new int[]{var5.field_Q + var5.field_I >> 1, var5.field_H + var5.field_s >> 1, var5.field_N + var5.field_F >> 1};
            pi.field_R[var9] = var6;
            var5.a(-var6[0], -var6[1], -9121, -var6[2]);
            var9++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = (RuntimeException) (var2);
          stackIn_10_1 = new StringBuilder().append("ni.KA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final hk a(int param0, String param1, bb param2) {
        hk var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        hk stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new hk(param1, param2);
          var4.field_q = (dh) ((Object) new ml());
          var5 = param0 + this.field_h;
          this.a(34 + this.field_h, this.field_r, (byte) -53, 0, 0);
          var4.a(30, this.field_r - 14, (byte) -33, var5, 7);
          this.b((byte) -73, var4);
          stackIn_1_0 = (hk) (var4);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = (RuntimeException) (var4_ref);
          stackIn_4_1 = new StringBuilder().append("ni.GA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    ni(f param0, BitmapFont param1, String param2) {
        super(0, 0, 288, 0, (dh) null);
        int var4_int = 0;
        this.field_D = 0;
        try {
            this.field_G = param1;
            this.field_J = param0;
            this.field_K = param2;
            var4_int = null == this.field_K ? 0 : this.field_G.measureWrappedHeight(this.field_K, 260, this.field_G.maxAscent);
            this.a(var4_int + 22, 288, (byte) -119, 0, 0);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ni.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void drawTransientEntities(int methodGuard) {
        int clientControlFlowGuardSnapshot = 0;
        GameplayEntity transientEntityToDraw = null;
        RuntimeException caughtTransientDrawFailure = null;
        RuntimeException transientDrawFailureForContext = null;
        clientControlFlowGuardSnapshot = Geoblox.field_C;
        try {
          if (methodGuard != 484842465) {
            ni.drawTransientEntities(15);
          }
          transientEntityToDraw = (GameplayEntity) ((Object) bh.transientEntities.firstForIteration(0));
          L1: while (transientEntityToDraw != null) {
            transientEntityToDraw.drawRotatedEntityOnCurrentRaster(1915952803);
            transientEntityToDraw = (GameplayEntity) ((Object) bh.transientEntities.nextForIteration(1));
          }
          return;
        } catch (java.lang.RuntimeException transientDrawFailure) {
          caughtTransientDrawFailure = transientDrawFailure;
          transientDrawFailureForContext = caughtTransientDrawFailure;
          throw t.a((Throwable) ((Object) transientDrawFailureForContext), "ni.JA(" + methodGuard + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        super.a(param0, param1, (byte) 54, param3);
        this.field_G.drawParagraph(this.field_K, this.field_v + (param0 + 14), 10 + param1 + this.field_m, this.field_r - 28, this.field_h, 16777215, -1, 0, 0, this.field_G.maxAscent);
        int var5 = 35 / ((param2 - 1) / 43);
    }

    public final void a(int param0, byte param1, int param2, int param3, hk param4) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var8 = Geoblox.field_C;
        try {
          L0: for (var6_int = 0; var6_int < this.field_D; var6_int++) {
            if (param4 != this.field_F[var6_int]) {
              continue L0;
            }
            var7 = this.field_H[var6_int];
            if (var7 != -1) {
              pc.a(this.field_H[var6_int], false);
            } else {
              this.field_J.h((byte) -104);
            }
            break;
          }
          if (param1 != -20) {
            ni.a((byte) 87);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = (RuntimeException) (var6);
          stackIn_14_1 = new StringBuilder().append("ni.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void a(String param0, int param1, int param2) {
        int var4_int = 0;
        try {
            var4_int = this.field_D;
            this.c(-11272, var4_int + param1);
            this.field_F[var4_int] = this.a(-2, param0, (bb) (this));
            this.field_H[var4_int] = param2;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ni.IA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        createToUseText = null;
        if (param0 >= -19) {
            createToUseText = (String) null;
        }
    }

    final static PaletteBitmapFont buildPaletteFontFromDecodedSprites(byte[] metrics, int methodGuard) {
        PaletteBitmapFont font = null;
        RuntimeException fontFailureForContext = null;
        PaletteBitmapFont fontBeforeReturn = null;
        RuntimeException fontFailureBeforeMetricsDescription = null;
        StringBuilder fontMessagePrefix = null;
        String metricsDescription = null;
        RuntimeException caughtFontFailure = null;
        try {
          if (metrics == null) {
            return null;
          }
          font = new PaletteBitmapFont(metrics, GameplaySession.decodedSpriteXOffsets, md.decodedSpriteYOffsets, DualLinkNode.decodedSpriteWidths, hl.decodedSpriteHeights, cm.decodedSpritePalette, mj.decodedSpriteIndices);
          kj.clearDecodedSpriteWorkingArrays(true);
          if (methodGuard >= -107) {
            createToUseText = (String) null;
          }
          fontBeforeReturn = (PaletteBitmapFont) (font);
          return fontBeforeReturn;
        } catch (java.lang.RuntimeException fontFailure) {
          caughtFontFailure = fontFailure;
          fontFailureForContext = caughtFontFailure;
          fontFailureBeforeMetricsDescription = (RuntimeException) (fontFailureForContext);
          fontMessagePrefix = new StringBuilder().append("ni.MA(");
          if (metrics == null) {
            metricsDescription = "null";
          } else {
            metricsDescription = "{...}";
          }
          throw t.a((Throwable) ((Object) fontFailureBeforeMetricsDescription), ((StringBuilder) (Object) fontMessagePrefix).append(metricsDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    static {
        createToUseText = "Create a free account to start using this feature";
    }
}
