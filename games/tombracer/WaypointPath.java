/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WaypointPath {
    static String field_c;
    private int[][] points;
    private boolean field_a;

    final boolean isEmpty(int param0) {
        boolean stackIn_7_0 = false;
        if (param0 != -4075) {
          return false;
        }
        stackIn_7_0 = (this.points == null) || (this.points.length == 0);
        return stackIn_7_0;
    }

    public static void releaseStatics(int param0) {
        if (param0 != 0) {
          return;
        }
        field_c = null;
    }

    final void mirror(boolean param0) {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        for (var2 = 0; var2 < this.points.length; var2++) {
          this.points[var2][0] = -this.points[var2][0];
        }
        if (!param0) {
          field_c = (String) null;
        }
    }

    final static void a(int param0, ResourceArchive param1, BitmapFont param2) {
        int var8 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        QuickChatCategory var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var9 = 0;
        Throwable var10 = null;
        Throwable var11 = null;
        BitmapFont var12 = null;
        int[] var16 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          var3_int = ApproachPlayerLocomotor.field_t;
          rua.field_gb = new UiComponent(0L, (UiComponent) null);
          if (param1 == null) {
            var10 = (Throwable) null;
            ClipStack.reportClientError("QC1", (byte) 123, (Throwable) null);
            return;
          }
          param1.field_j = 0;
          param1.field_g = false;
          taa.field_g = new nc(var3_int, param1, param1);
          ByteStorage.field_a = new tr(var3_int, param1, param1, new gha());
          var4 = BlendModeOperator.findRootQuickChatCategory((byte) 86);
          if (var4 == null) {
            var11 = (Throwable) null;
            ClipStack.reportClientError("QC2", (byte) 122, (Throwable) null);
            return;
          }
          DraggableWidget.a(-1, var4);
          var12 = (BitmapFont) null;
          MembersUpsellMenu.field_w = DrawOfferMenu.a(1127256, 1513239, 1513239, 0, (BitmapFont) null, 2245737, 4020342, 65793, 65793, 5138823, 8947848, 65793, (byte) -78);
          BoulderComponent.field_M = DrawOfferMenu.a(0, 0, 0, 16764006, param2, 0, param0, 0, 0, 0, 0, 0, (byte) -81);
          tg.field_c = DrawOfferMenu.a(0, 0, 0, 16777215, param2, 0, 0, 0, 0, 0, 0, 0, (byte) -123);
          var5 = SoftwareRasterizer.width;
          var6 = SoftwareRasterizer.height;
          var16 = SoftwareRasterizer.pixels;
          EffectEvent.field_j = new Sprite(10, 14);
          EffectEvent.field_j.makeRasterTarget();
          for (var8 = 2; var8 < 7; var8++) {
            SoftwareRasterizer.drawVerticalLine(var8, var8 + 1, -(var8 << 1) + 14, 16777215);
          }
          SoftwareRasterizer.setTarget(var16, var5, var6);
          cia.field_g = FontMetrics.a(true, BoulderComponent.field_M, MembersUpsellMenu.field_w, var4, tg.field_c);
          rua.field_gb.field_J = new IntrusiveDeque();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("gea.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public WaypointPath() {
        this(new int[][]{});
    }

    final int[][] getPoints(int param0) {
        int var2 = 84 % ((param0 - 85) / 34);
        return this.points;
    }

    final boolean a(byte param0) {
        if (param0 != 21) {
          this.a(false, -22);
        }
        return this.field_a;
    }

    final void a(boolean param0, int param1) {
        this.field_a = param0 ? true : false;
        if (param1 != 1) {
          this.field_a = true;
        }
    }

    WaypointPath(int[][] param0) {
        IntPoint discarded$0 = new IntPoint();
        try {
          this.points = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "gea.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    WaypointPath(int param0, BitPacketBuffer param1) {
        int var3_int = 0;
        int var4 = 0;
        IntPoint discarded$0 = new IntPoint();
        try {
          var3_int = param1.readBits((byte) 44, 4);
          this.points = new int[var3_int][2];
          for (var4 = 0; var3_int > var4; var4++) {
            this.points[var4][0] = CoinItemComponent.fromOffsetBinary(true, 12, param1.readBits((byte) 44, 12)) << 16;
            this.points[var4][1] = CoinItemComponent.fromOffsetBinary(true, 12, param1.readBits((byte) 44, 12)) << 16;
          }
          if (11 <= param0) {
            this.field_a = param1.readBits((byte) 44, 1) == 1 ? true : false;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "gea.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void encode(BitPacketBuffer param0, int param1) {
        int var3_int = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        try {
          param0.writeBits((byte) 20, this.points.length, 4);
          for (var3_int = param1; var3_int < this.points.length; var3_int++) {
            param0.writeBits((byte) -128, dqa.toOffsetBinary(true, this.points[var3_int][0] >> 16, 12), 12);
            param0.writeBits((byte) -125, dqa.toOffsetBinary(true, this.points[var3_int][1] >> 16, 12), 12);
          }
          param0.writeBits((byte) 74, !this.field_a ? 0 : 1, 1);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "gea.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_c = "Confirm Password: ";
    }
}
