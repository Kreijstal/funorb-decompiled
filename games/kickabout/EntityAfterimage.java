/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EntityAfterimage {
    static String[] field_i;
    private int field_c;
    private int field_g;
    private int field_e;
    static ResourceArchive field_b;
    private int field_h;
    private int field_j;
    int field_a;
    private Sprite field_f;
    static int field_d;

    final void tick(int param0) {
        if (param0 == 17) {
          if (this.field_a > 0) {
            this.field_a = this.field_a - 1;
          }
          return;
        }
        this.tick(-40);
        if (this.field_a > 0) {
          this.field_a = this.field_a - 1;
        }
    }

    final void captureFootballer(RenderedFootballer param0, int param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_j = param0.field_bb >> 16;
          this.field_a = 17;
          this.field_c = param0.field_kb >> 16;
          this.field_e = param1;
          this.field_g = 64;
          this.field_h = 96;
          PacketBuffer.a(74, this.field_f);
          SoftwareRasterizer.clearFramebuffer();
          var4_int = 486400 / InstrumentNoteMask.field_i;
          param0.renderModel(var4_int, 300, this.field_g, this.field_h, (byte) -74);
          TeamManagementScreen.e(124);
          if (param2) {
            return;
          }
          this.draw(119);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_5_0 = var4;
          stackIn_5_1 = new StringBuilder().append("v.B(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void draw(int param0) {
        if (0 >= this.field_a) {
          return;
        }
        int var2 = SocialListLayoutSupport.worldToScreenX(0, this.field_c) - this.field_g;
        int var3 = IntKeyLookup.projectPitchY((byte) -83, this.field_j) - this.field_h;
        this.field_f.b(var2, var3, this.field_e * this.field_a / 17);
        if (param0 < -1) {
          return;
        }
        RenderedFootballer var4 = (RenderedFootballer) null;
        this.captureFootballer((RenderedFootballer) null, 55, true);
    }

    final static Boolean takePendingBooleanResult(int param0) {
        int var2 = -80 % ((1 - param0) / 56);
        Boolean var1 = TutorialMessages.field_f;
        TutorialMessages.field_f = null;
        return var1;
    }

    public static void releaseStatics(int param0) {
        if (param0 != 0) {
          return;
        }
        field_i = null;
        field_b = null;
    }

    EntityAfterimage() {
        this.field_f = new Sprite(128, 128);
    }

    final void captureBall(int param0, byte param1, RenderedBall param2) {
        int var4_int = 0;
        try {
          this.field_g = 64;
          this.field_h = 64;
          this.field_c = param2.field_N >> 16;
          this.field_e = param0;
          this.field_j = param2.getRenderedY(true);
          this.field_a = 17;
          PacketBuffer.a(-57, this.field_f);
          SoftwareRasterizer.clearFramebuffer();
          int var5 = 64 / ((-64 - param1) / 38);
          var4_int = (param2.getRenderedScale(-1) << 8) / InstrumentNoteMask.field_i;
          param2.drawBall(300, this.field_g, this.field_h, var4_int, 300);
          TeamManagementScreen.e(123);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "v.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_d = 5;
    }
}
