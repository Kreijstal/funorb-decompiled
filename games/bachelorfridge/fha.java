/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fha extends AnimationNode {
    private int field_m;
    static String field_k;
    static String[][] field_j;
    private TileEffect field_l;

    public static void d(byte param0) {
        field_j = (String[][]) null;
        field_k = null;
        if (param0 == 9) {
          return;
        }
        fha.d((byte) 101);
    }

    final boolean isFinished(byte param0) {
        int var2 = 40 % ((71 - param0) / 47);
        if (0 == this.field_m) {
          this.field_l.a(0);
        }
        int fieldTemp$0 = this.field_m + 1;
        this.field_m = this.field_m + 1;
        if (fieldTemp$0 < this.d(-18093)) {
          return false;
        }
        this.e(1);
        return true;
    }

    final static void a(int param0, int param1, iga param2, boolean param3, boolean param4) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          ImageProducerRasterBuffer.field_i[0] = ia.field_k.nextInt();
          ImageProducerRasterBuffer.field_i[1] = ia.field_k.nextInt();
          ProxySocketConnector.field_g.position = param1;
          ImageProducerRasterBuffer.field_i[3] = (int)bi.field_j;
          ImageProducerRasterBuffer.field_i[2] = (int)(bi.field_j >> 32);
          ProxySocketConnector.field_g.writeInt(ImageProducerRasterBuffer.field_i[0], param1 - 1615464796);
          ProxySocketConnector.field_g.writeInt(ImageProducerRasterBuffer.field_i[1], param1 - 1615464796);
          ProxySocketConnector.field_g.writeInt(ImageProducerRasterBuffer.field_i[2], -1615464796);
          ProxySocketConnector.field_g.writeInt(ImageProducerRasterBuffer.field_i[3], -1615464796);
          qja.b(param1 ^ 24, ProxySocketConnector.field_g);
          ProxySocketConnector.field_g.b(param0, -125);
          param2.a(ProxySocketConnector.field_g, false);
          sja.field_fb.position = 0;
          if (!param4) {
            sja.field_fb.writeByte(16, 0);
          } else {
            sja.field_fb.writeByte(18, param1 ^ 0);
          }
          sja.field_fb.position = sja.field_fb.position + 2;
          var5_int = sja.field_fb.position;
          sja.field_fb.writeInt(cp.field_c, param1 - 1615464796);
          sja.field_fb.writeLong(param1 + 1686281208, vi.field_a);
          var6 = 0;
          if (vs.field_c) {
            var6 = var6 | 1;
          }
          if (cr.field_b) {
            var6 = var6 | 4;
          }
          if (param3) {
            var6 = var6 | 8;
          }
          if (ij.field_m != null) {
            var6 = var6 | 16;
          }
          sja.field_fb.writeByte(var6, 0);
          var7 = pi.a(11713, nia.d(param1 - 31768));
          if (var7 == null) {
            var7 = "";
          }
          sja.field_fb.writeString((byte) -50, var7);
          if (null != ij.field_m) {
            sja.field_fb.a(ij.field_m, 86);
          }
          wd.a(SlowAllEvent.field_q, (byte) -126, sja.field_fb, ProxySocketConnector.field_g, SuperSpeedSpecial.field_p);
          sja.field_fb.writeLengthShort((byte) -88, sja.field_fb.position - var5_int);
          hna.a(-1, 85);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("fha.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void e(int param0) {
        if (param0 == 1) {
          return;
        }
        this.field_l = (TileEffect) null;
    }

    private final int d(int param0) {
        if (param0 != -18093) {
          return -20;
        }
        return 10;
    }

    fha(TileEffect param0) {
        try {
          this.field_l = param0;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "fha.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var18 = 0;
        int[] var22 = null;
        int var16Lifetime1;
        int var16Lifetime2;
        var18 = BachelorFridge.field_y;
        try {
          var12 = cr.a(an.field_q, param7, ha.field_n, 0);
          var13 = cr.a(an.field_q, param2, ha.field_n, 0);
          var14 = cr.a(DualLinkNode.field_l, param4, SnowAnimation.field_x, 0);
          if (param1 < 43) {
            field_j = (String[][]) null;
          }
          var15 = cr.a(DualLinkNode.field_l, param0, SnowAnimation.field_x, 0);
          var8_int = cr.a(an.field_q, param6 + param7, ha.field_n, 0);
          var9 = cr.a(an.field_q, param2 - param6, ha.field_n, 0);
          for (var16 = var12; var8_int > var16; var16++) {
            hba.a(param3, var14, tj.field_b[var16], 7, var15);
          }
          for (var16Lifetime1 = var13; var16Lifetime1 > var9; var16Lifetime1--) {
            hba.a(param3, var14, tj.field_b[var16Lifetime1], 7, var15);
          }
          var10 = cr.a(DualLinkNode.field_l, param6 + param4, SnowAnimation.field_x, 0);
          var11 = cr.a(DualLinkNode.field_l, param0 - param6, SnowAnimation.field_x, 0);
          for (var16Lifetime2 = var8_int; var9 >= var16Lifetime2; var16Lifetime2++) {
            var22 = tj.field_b[var16Lifetime2];
            hba.a(param3, var14, var22, 7, var10);
            hba.a(param5, var10, var22, 7, var11);
            hba.a(param3, var11, var22, 7, var15);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var8), "fha.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        field_k = "Names can only contain letters, numbers, spaces and underscores";
    }
}
