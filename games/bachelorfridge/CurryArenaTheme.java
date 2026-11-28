/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CurryArenaTheme extends ArenaTheme {
    static int field_h;
    static Sprite field_g;

    final static IndexedSprite[] a(int param0, ResourceArchive param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        IndexedSprite[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!g.a(param3, param2, param0 - 23018, param1)) {
            stackIn_2_0 = null;
            return (IndexedSprite[]) (stackIn_2_0);
          }
          if (param0 != -7726) {
            CurryArenaTheme.a(-95);
          }
          stackIn_6_0 = hca.b(200);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("kn.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void b(BoardView param0, int param1) {
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        aj var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        aj var6 = null;
        aj var7 = null;
        aj var8 = null;
        aj var9 = null;
        aj var10 = null;
        aj var11 = null;
        aj var12 = null;
        aj var3Lifetime1;
        aj var3Lifetime2;
        int var4Lifetime1;
        var5 = BachelorFridge.field_y;
        try {
          var3 = new aj(0, 0);
          for (var4 = -1; var4 < param0.field_a - 1; var4++) {
            var6 = param0.a(0, (byte) 100, var4);
            this.field_b[18 + var4 % 3].draw(var6.field_c + 128, var6.field_a);
            this.field_b[2 + var4 % 3].draw(var6.field_c + 128, -64 + var6.field_a);
            var7 = param0.a(param0.field_z, (byte) -96, var4);
            if (var4 > 0) {
              this.field_b[var4 % 2 + 42].draw(var7.field_c, var7.field_a);
            }
            if (0 <= var4) {
              this.field_b[57].draw(var7.field_c, 64 + var7.field_a);
            }
          }
          var4Lifetime1 = -1;
          while (var4Lifetime1 < -1 + param0.field_z) {
            var8 = param0.a(var4Lifetime1, (byte) -103, 0);
            var3Lifetime1 = var8;
            stackIn_16_0 = ~(param0.field_z - 2);
            stackIn_16_1 = ~var4Lifetime1;
            if (stackIn_16_0 < stackIn_16_1) {
              this.field_b[1 + var4Lifetime1 % 3 + 24].draw(-128 + var8.field_c, var8.field_a);
            }
            if (var4Lifetime1 >= 0) {
              this.field_b[9 + var4Lifetime1 % 3 + 1].draw(var8.field_c - 128, var8.field_a - 64);
            }
            var9 = param0.a(var4Lifetime1, (byte) 119, param0.field_a);
            if (0 < var4Lifetime1) {
              this.field_b[34 + var4Lifetime1 % 3].draw(var9.field_c, var9.field_a);
            }
            if (var4Lifetime1 >= 0) {
              this.field_b[49].draw(var9.field_c, var9.field_a + 64);
            }
            var4Lifetime1++;
          }
          var10 = param0.a(0, (byte) 107, 0);
          this.field_a[0].draw(-128 + var10.field_c, -128 + var10.field_a);
          var3Lifetime2 = param0.a(0, (byte) 77, param0.field_a);
          if (param1 != -13319) {
            CurryArenaTheme.releaseStatics(-107);
          }
          this.field_a[3].draw(var3Lifetime2.field_c - 64, 32 + var3Lifetime2.field_a - 128);
          var11 = param0.a(param0.field_z, (byte) 118, param0.field_a);
          this.field_a[2].draw(-128 + var11.field_c, var11.field_a - 64);
          var12 = param0.a(param0.field_z, (byte) 43, 0);
          this.field_a[1].draw(-128 + (var12.field_c - 64), 32 + (var12.field_a - 128));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_34_0 = var3_ref;
          stackIn_34_1 = new StringBuilder().append("kn.B(");
          if (param0 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void b(byte param0) {
        this.field_a = new Sprite[4];
        if (param0 != -5) {
          return;
        }
        Sprite var6 = new Sprite(384, 192);
        Sprite var2 = var6;
        var6.bindAsRenderTarget();
        this.field_b[0].draw(128, 0);
        this.field_b[8].draw(64, 32);
        this.field_b[1].draw(192, 32);
        this.field_b[16].draw(128, 64);
        this.field_a[0] = var6;
        Sprite var3 = new Sprite(384, 192);
        var3.bindAsRenderTarget();
        this.field_b[13].draw(128, 0);
        this.field_b[14].draw(64, 32);
        this.field_b[28].draw(192, 32);
        this.field_b[40].draw(128, 64);
        this.field_b[41].draw(192, 96);
        this.field_b[56].draw(128, 128);
        this.field_a[1] = var3;
        Sprite var4 = new Sprite(384, 192);
        var4.bindAsRenderTarget();
        this.field_b[6].draw(128, 0);
        this.field_b[21].draw(64, 32);
        this.field_b[7].draw(192, 32);
        this.field_b[32].draw(128, 64);
        this.field_b[33].draw(64, 96);
        this.field_b[48].draw(128, 128);
        this.field_a[3] = var4;
        Sprite var5 = new Sprite(384, 192);
        var5.bindAsRenderTarget();
        this.field_b[38].draw(128, 64);
        this.field_b[44].draw(64, 32);
        this.field_b[37].draw(192, 32);
        this.field_b[57].draw(0, 64);
        this.field_b[49].draw(256, 64);
        this.field_b[58].draw(64, 96);
        this.field_b[50].draw(192, 96);
        this.field_b[51].draw(128, 128);
        this.field_a[2] = var5;
    }

    public static void releaseStatics(int param0) {
        field_g = null;
        if (param0 != 50) {
          CurryArenaTheme.a(42);
        }
    }

    CurryArenaTheme(ResourceArchive param0) {
        try {
          this.field_b = RageSpecial.a(29611, "basic", "tiles_curry", param0);
          this.b((byte) -5);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "kn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static jc a(int param0) {
        int var1_int = 0;
        jc var2 = null;
        jc stackIn_6_0 = null;
        Throwable decompiledCaughtException = null;
        IllegalArgumentException var1 = null;
        if (param0 != 128) {
          return (jc) null;
        }
        try {
          var1_int = 0;
          while (true) {
            var2 = bga.field_l.a((byte) -108, var1_int);
            if (var2.field_w) {
              stackIn_6_0 = var2;
              return stackIn_6_0;
            }
            var1_int++;
          }
        } catch (java.lang.IllegalArgumentException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (IllegalArgumentException) (Object) decompiledCaughtException;
          return null;
        }
    }

    static {
    }
}
