/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak extends IntrusiveNode {
    static String field_l;
    ArgbSprite field_e;
    int field_g;
    static IntrusiveDeque field_i;
    int field_k;
    RenderedBall field_h;
    static Sprite field_f;
    RenderedFootballer field_m;
    boolean field_n;
    private int field_j;

    final static int a(AppScreen param0, int param1) {
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param1 != 4) {
            field_f = (Sprite) null;
          }
          if (0 != param0.screenId &&
            17 != param0.screenId &&
            13 != param0.screenId &&
            param0.screenId != 12 &&
            param0.screenId != 1 &&
            2 != param0.screenId &&
            param0.screenId != 3 &&
            4 != param0.screenId &&
            param0.screenId != 5 &&
            6 != param0.screenId &&
            param0.screenId != 8 &&
            18 != param0.screenId &&
            param0.screenId != -5 &&
            param0.screenId != 26) {
            if (-1 == param0.screenId &&
              MyKitScreen.field_O) {
              stackIn_22_0 = OffscreenPlayerArrow.b((byte) -75);
              return stackIn_22_0;
            }
            stackIn_24_0 = 0;
            return stackIn_24_0;
          }
          stackIn_18_0 = 256;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_27_0 = var2;
          stackIn_27_1 = new StringBuilder().append("ak.C(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(')').toString());
        }
    }

    final int a(byte param0) {
        int var2 = 69 / ((param0 - 50) / 59);
        if (this.field_j == 1) {
          return this.field_m.pixelY(true);
        }
        if (this.field_j == 2) {
          return this.field_h.field_E >> 16;
        }
        if (this.field_j != 3) {
          return this.field_g;
        }
        return !(this.field_n ^ ia.field_c) ? 1344 : 0;
    }

    final void a(int param0, int param1, int param2) {
        this.field_g = -(this.field_e.field_v >> 1) + param1;
        if (param2 > -46) {
          return;
        }
        this.field_k = param0;
    }

    final void b(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5_int;
        long var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5_intLifetime1;
        int var6Lifetime1;
        int var8Lifetime1;
        var9 = Kickabout.field_G;
        if (this.field_j == 0) {
          if (this.field_j == 0) {
            stackIn_12_0 = 4;
          } else {
            stackIn_12_0 = this.field_e.field_v >> 1;
          }
          var2 = stackIn_12_0;
          var3 = ug.a(0, this.field_k);
          var4 = IntKeyLookup.a((byte) -59, this.field_g + var2);
          var5_int = this.field_e.field_o * InstrumentNoteMask.field_i >> 8;
          var6 = this.field_e.field_v * InstrumentNoteMask.field_i >> 8;
          this.field_e.a(var3 - (var5_int >> 1), -(var6 >> 1) + var4, var5_int, var6);
          if (param0 == 192) {
            return;
          }
          this.b(86);
          return;
        }
        if (this.field_j == 4) {
          if (this.field_j == 0) {
            stackIn_5_0 = 4;
          } else {
            stackIn_5_0 = this.field_e.field_v >> 1;
          }
          var2Lifetime1 = stackIn_5_0;
          var3Lifetime1 = ug.a(0, this.field_k);
          var4Lifetime1 = IntKeyLookup.a((byte) -59, this.field_g + var2Lifetime1);
          var5_intLifetime1 = this.field_e.field_o * InstrumentNoteMask.field_i >> 8;
          var6Lifetime1 = this.field_e.field_v * InstrumentNoteMask.field_i >> 8;
          this.field_e.a(var3Lifetime1 - (var5_intLifetime1 >> 1), -(var6Lifetime1 >> 1) + var4Lifetime1, var5_intLifetime1, var6Lifetime1);
        } else {
          if (this.field_j == 5) {
            var2Lifetime1 = ug.a(param0 ^ 192, this.field_k);
            var3Lifetime1 = IntKeyLookup.a((byte) -110, (this.field_e.field_v >> 1) + this.field_g);
            var4Lifetime1 = InstrumentNoteMask.field_i << 4;
            var5 = nj.monotonicMillis(param0 - 126);
            var7 = (int)(var5 % 1050L);
            if (var7 < 700) {
              var8 = (65536 + we.cosine((var7 << 13) / 700, false) >> 11) + 192;
              var4Lifetime1 = var8 * var4Lifetime1 >> 8;
            }
            var8Lifetime1 = (int)((var5 << 16) / 2600L);
            this.field_e.a(var3Lifetime1, 24407, -var8Lifetime1, var2Lifetime1, var4Lifetime1);
            if (param0 == 192) {
              return;
            }
            this.b(86);
            return;
          }
          if (this.field_j == 3) {
            MidiPcmStream.a(this.field_n, (byte) -114);
          } else {
            if (1 == this.field_j) {
              this.field_m.d(false);
            } else {
              if (this.field_j == 2) {
                this.field_h.h(param0 ^ 128);
              }
            }
          }
        }
        if (param0 == 192) {
          return;
        }
        this.b(86);
    }

    public static void a(int param0) {
        if (param0 != 17) {
          return;
        }
        field_i = null;
        field_f = null;
        field_l = null;
    }

    ak(int param0) {
        this.field_j = param0;
    }

    static {
        field_l = "The '<%0>' setting needs to be changed.";
        field_i = new IntrusiveDeque();
    }
}
