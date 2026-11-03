/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vs {
    ArgbSprite field_h;
    int field_a;
    int field_e;
    int field_b;
    static int field_f;
    static sm field_g;
    static SortCriterion field_k;
    boolean field_j;
    PlayerStats field_d;
    static String field_l;
    static String field_c;
    static int field_i;

    final static boolean a(int param0, int param1) {
        IntrusiveNode var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Kickabout.field_G;
        try {
          if (param0 <= 70) {
            vs.a(50);
          }
          var2 = StrongCacheEntry.field_z.g(24009);
          while (var2 instanceof FadingSoundPlayer) {
            if (((FadingSoundPlayer) (var2)).getSoundId(false) == param1) {
              return true;
            }
            var2 = var2.field_d;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2_ref), "vs.F(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0, boolean param1, byte param2) {
        if (param0) {
          SoftwareRasterizer.a(0, 0, SoftwareRasterizer.field_g, SoftwareRasterizer.field_f, 0, 192);
          oa.a((byte) -126, param0);
          if (param2 != 39) {
            vs.a(115, 82L);
            return;
          }
          return;
        }
        SoftwareRasterizer.b();
        oa.a((byte) -126, param0);
        if (param2 != 39) {
          vs.a(115, 82L);
          return;
        }
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 == 0) {
          field_l = null;
          field_c = null;
          field_k = null;
          return;
        }
        vs.a(-50);
        field_l = null;
        field_c = null;
        field_k = null;
    }

    final void a(int param0, int param1, int param2, PlayerStats param3, boolean param4, int param5) {
        int incrementValue$4 = 0;
        int incrementValue$3 = 0;
        int[] var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RenderedFootballer var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        int var14Lifetime1;
        int var15Lifetime1;
        var16 = Kickabout.field_G;
        try {
          this.field_d.copyFrom((byte) -122, param3);
          this.field_a = param1;
          this.field_b = param5;
          stackIn_4_1 = (param4);
          this.field_j = stackIn_4_1;
          this.field_e = param2;
          var17 = new int[]{158, 220, 222, param0};
          var7 = var17;
          var8 = new int[]{1200, 800, 800, 800};
          var9 = this.field_e;
          var10 = this.field_b;
          var11 = this.field_a;
          if (var9 == -1) {
            var10 = this.field_d.surnameIndex % 14;
            var9 = this.field_d.initialIndex % 7;
            var11 = 31;
          }
          var12 = mg.a(this.field_d, var9, var10, this.field_j, var11, (byte) 108);
          var12.field_mb.a(0, 99);
          PacketBuffer.a(-81, ConsoleCommand.field_u);
          SoftwareRasterizer.b();
          var12.a(var8[this.field_d.playerType], 0, SoftwareRasterizer.field_g >> 1, var17[this.field_d.playerType], (byte) -118);
          TeamManagementScreen.e(122);
          eo.downscaleByHalf(ConsoleCommand.field_u, this.field_h);
          var13 = (this.field_h.field_v - 2) * this.field_h.field_o;
          for (var14 = -this.field_h.field_o; 0 > var14; var14++) {
            var15 = this.field_h.field_y[var13];
            incrementValue$4 = var13;
            var13++;
            this.field_h.field_y[incrementValue$4] = PainterStyle.a(TextLayoutLine.b(var15, -33554431) >>> 1, TextLayoutLine.b(var15, 16777215));
          }
          for (var14Lifetime1 = -this.field_h.field_o; 0 > var14Lifetime1; var14Lifetime1++) {
            var15Lifetime1 = this.field_h.field_y[var13];
            incrementValue$3 = var13;
            var13++;
            this.field_h.field_y[incrementValue$3] = PainterStyle.a(TextLayoutLine.b(var15Lifetime1, 16777215), TextLayoutLine.b(-1090519040, var15Lifetime1 >>> 2));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_15_0 = var7_ref;
          stackIn_15_1 = new StringBuilder().append("vs.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    vs() {
        this.field_d = new PlayerStats();
        this.field_h = new ArgbSprite(38, 46);
    }

    final static void a(String param0, String[] param1, byte param2, int param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Kickabout.field_G;
        try {
          if (param2 < 76) {
            return;
          }
          wk.field_f = cr.field_d;
          if (param3 == 255) {
            stackIn_12_0 = !(tn.field_b >= 13);
            ArchiveIndex.field_a = SquadGridWidget.a(stackIn_12_0, 124);
            return;
          }
          if (param3 >= 100 &&
            105 >= param3) {
            ArchiveIndex.field_a = ArrayWidgetContainer.a(-111, param1);
            return;
          }
          ArchiveIndex.field_a = TeamSelectionView.a(-126, param0, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("vs.B(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static int a(int param0, long param1) {
        if (param0 != -1090519040) {
          vs.a(false, true, (byte) -125);
          return (int)(param1 / 60000L);
        }
        return (int)(param1 / 60000L);
    }

    static {
        field_g = null;
        field_k = (SortCriterion) ((Object) new rl());
        field_l = "trapping the mouse prevents you from clicking outside the game during a match";
        field_i = 0;
        field_c = "Your request to join has been declined.";
    }
}
