/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li {
    static IntrusiveDeque field_a;
    static RgbSprite[] field_l;
    static int field_j;
    static int field_k;
    static String[] field_b;
    static int field_h;
    static String field_d;
    static String field_c;
    static int field_g;
    static String field_e;
    static String field_i;
    static String[] field_f;

    final static void c(int param0) {
        ta.field_a.replaceContent(1, new GuestPlayConfirmationForm());
        if (param0 != 316) {
          field_j = 24;
        }
    }

    final static void a(int param0) {
        if (param0 != -8) {
          li.resetStaticState(true);
        }
        np.a((byte) -123, DebouncedFieldValidator.c(true));
    }

    public static void resetStaticState(boolean param0) {
        if (param0) {
          field_j = 33;
        }
        field_e = null;
        field_b = null;
        field_d = null;
        field_i = null;
        field_f = null;
        field_a = null;
        field_c = null;
        field_l = null;
    }

    final static RgbSprite[] a(int param0, int param1, ResourceArchive param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        RgbSprite[] stackIn_5_0 = null;
        RgbSprite[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!MusicPatch.a(param2, param3 - 3, param0, param1)) {
            stackIn_2_0 = null;
            return (RgbSprite[]) (stackIn_2_0);
          }
          if (param3 == 4) {
            stackIn_7_0 = ib.b(-10718);
            return stackIn_7_0;
          }
          stackIn_5_0 = (RgbSprite[]) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("li.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var4 = 0;
        var4 = DungeonAssault.field_K;
        try {
          jh.c();
          if (param0 > -57) {
            field_e = (String) null;
          }
          if (null == PackedBitSet.field_c) {
            bn.field_f = new RgbSprite(256, 256);
            PackedBitSet.field_c = new RgbSprite(316, 316);
            PackedBitSet.field_c.field_w = -16;
            PackedBitSet.field_c.field_A = -16;
          }
          bn.field_f.bindAsRenderTarget();
          SoftwareRasterizer.clearRaster();
          var1_int = 0;
          for (var2 = 0; var2 < 7; var2++) {
            for (var3 = 0; var3 < 7; var3++) {
              if (null != qj.field_c[var1_int]) {
                SoftwareRasterizer.fillRectangle(var3 * 36 + 4, 4 + 36 * var2, 32, 32, 16777215);
              }
              var1_int++;
            }
          }
          PackedBitSet.field_c.bindAsRenderTarget();
          SoftwareRasterizer.clearRaster();
          bn.field_f.drawSilhouette(16, 16, 8454143);
          SoftwareRasterizer.blurRectangle(8, 8, 0, 0, PackedBitSet.field_c.field_y, PackedBitSet.field_c.field_v);
          bn.field_f.drawSilhouette(16, 16, 0);
          SoftwareRasterizer.blurRectangle(4, 4, 0, 0, PackedBitSet.field_c.field_y, PackedBitSet.field_c.field_v);
          jh.b();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) var1), "li.D(" + param0 + ')');
        }
    }

    static {
        field_h = 3;
        field_c = "Select two rooms to spy out";
        field_d = "Try not to get snared in this spider's webs; the gigantic tarantula is always alert; it likes nothing more than the sweet meat of a raider or two.";
        field_b = new String[6];
        field_e = "Risk of waking dragon: ";
        field_a = new IntrusiveDeque();
        field_i = "More suggestions";
        field_f = new String[]{"Scout", "A creature born to the labyrinth, the enhanced senses of the <%0> can sometimes be used to determine what lies beyond the next door. (Single use)"};
    }
}
