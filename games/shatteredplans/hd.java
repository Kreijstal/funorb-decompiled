/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd extends IntrusiveNode {
    Sprite field_o;
    int field_h;
    static oa field_s;
    Sprite field_i;
    static AnimatedPanel field_m;
    static byte[][] field_q;
    static String field_p;
    static String field_j;
    static ro field_r;
    static ul field_t;
    static uh field_n;
    static long field_k;
    static int[] field_l;

    final static void a(int param0) {
        int var1_int = 0;
        int var2 = 0;
        nd[] var3 = null;
        int var4 = 0;
        int var6 = 0;
        nd[] var7 = null;
        int var8 = 0;
        nd var9 = null;
        nd var10 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        nd[] var3Lifetime1;
        int var1_intLifetime1;
        int var1_intLifetime2;
        int var4Lifetime1;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          SoftwareRasterizer.clear();
          var2 = 300 - di.field_m;
          var1_int = -25 + var2 / 8;
          DualLinkDeque.field_a.drawColourised(var1_int, 0, 33023);
          var1_intLifetime1 = var2 / 6 - 100;
          Dialog.field_D.drawColourised(var1_intLifetime1, 0, 4227327);
          oi.field_d.drawAlpha(var1_intLifetime1, 0, QuickChatCategoryDefinition.field_r / 8);
          var7 = MenuButton.field_y;
          var3 = var7;
          for (var4 = 0; var4 < var7.length; var4++) {
            var9 = var7[var4];
            if (var9.field_a != 0) {
              SoftwareRasterizer.b(var1_intLifetime1 + var9.field_e << 4, var9.field_j << 4, var9.field_f, var9.field_a, MenuButton.field_u);
            }
          }
          var1_intLifetime2 = -250 + var2 / 4;
          vm.field_Jb.drawColourised(var1_intLifetime2, 120, 8421631);
          SliderPainter.field_e.drawAlpha(var1_intLifetime2, param0, QuickChatCategoryDefinition.field_r / 4);
          sr.field_F.drawAlpha(var1_intLifetime2, 120, QuickChatCategoryDefinition.field_r);
          var3Lifetime1 = MenuButton.field_H;
          var8 = 0;
          var4Lifetime1 = var8;
          while (var3Lifetime1.length > var8) {
            var10 = var3Lifetime1[var8];
            if (0 != var10.field_a) {
              SoftwareRasterizer.b(var10.field_e + var1_intLifetime2 << 4, var10.field_j + 120 << 4, var10.field_f, var10.field_a, MenuButton.field_u);
            }
            var8++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw UrlLoader.wrapThrowable((Throwable) ((Object) var1), "hd.A(" + param0 + ')');
        }
    }

    public static void clearStatics(byte param0) {
        field_p = null;
        field_j = null;
        field_r = null;
        field_m = null;
        field_q = (byte[][]) null;
        field_l = null;
        if (param0 > -49) {
          field_r = (ro) null;
        }
        field_s = null;
        field_t = null;
        field_n = null;
    }

    hd(String param0, nq param1, int param2) {
        int var7 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          var4_int = param1.stringWidth(param0);
          var5 = param1.field_J + param1.field_q;
          stackIn_4_0 = (500 >= var4_int) ? 0 : 1;
          var6 = stackIn_4_0;
          if (var6 != 0) {
            var4_int = 600;
          }
          this.field_i = new Sprite(var4_int, var5);
          this.field_o = new Sprite(var4_int + 6, 6 + var5);
          RandomAccessCacheFile.a(-127);
          this.field_i.bindAsRenderTarget();
          if (var6 == 0) {
            param1.drawString(param0, 0, param1.field_J, 16777215, -1);
          } else {
            param1.drawJustified(param0, 0, param1.field_J, 16777215, -1, 600);
          }
          this.field_o.bindAsRenderTarget();
          this.field_i.drawOpaque(3, 3);
          SoftwareRasterizer.b(1, 1, 0, 0, 6 + var4_int, var5 + 6);
          for (var7 = (var4_int + 6) * (6 + var5) - 1; var7 >= 0; var7--) {
            if (0 == (128 & SoftwareRasterizer.field_h[var7])) {
              SoftwareRasterizer.field_h[var7] = SoftwareRasterizer.field_h[var7] << 1;
            }
          }
          cg.i(0);
          this.field_h = -param2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("hd.<init>(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(')').toString());
        }
    }

    final static ld a(int param0, int param1) {
        if (param1 < 102) {
          field_k = -43L;
        }
        ld var2 = new ld();
        SectorCacheStore.field_d.addLast((byte) -113, var2);
        CanvasResizeController.a(param0, 1);
        return var2;
    }

    final static void c(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        int var1_int = Star.field_H.length;
        kb.field_A = 0;
        if (param0) {
          return;
        }
        try {
          cb.field_i = new int[var1_int];
          for (var2 = 0; var1_int > var2; var2++) {
            var3 = aa.a(var2, (byte) -71);
            if (var2 != -1 + var1_int) {
              var3 += 50;
            }
            cb.field_i[var2] = var3;
            kb.field_A = kb.field_A + var3;
          }
          kb.field_A = kb.field_A - 294;
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "hd.B(" + param0 + ')');
        }
    }

    static {
        field_p = "Your friend list is full. Max of 100 for free users, and 200 for members.";
        field_j = "Click to build fleets in this territory.";
        field_s = new oa();
        field_r = new ro();
        field_l = new int[5];
    }
}
