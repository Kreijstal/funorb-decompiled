/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MusicPatchNode extends IntrusiveNode {
    int field_f;
    int field_w;
    int field_e;
    int field_D;
    static int[][] field_k;
    int field_E;
    static IntrusiveDeque field_h;
    int field_v;
    MusicPatch field_g;
    gl field_j;
    int field_A;
    int field_z;
    int field_B;
    int field_n;
    int field_r;
    int field_t;
    int field_q;
    int field_l;
    PcmSampleStream field_F;
    PcmSample field_y;
    int field_C;
    static Sprite field_m;
    int field_s;
    static int[] field_x;
    static ArgbSprite[] field_u;
    int field_p;
    static int field_o;
    static String field_i;

    final void clearReferences(boolean param0) {
        this.field_y = null;
        this.field_g = null;
        this.field_F = null;
        this.field_j = null;
        if (!param0) {
          MusicPatchNode.b(97);
          return;
        }
    }

    final static Sprite b(int param0, int param1) {
        if (param1 == 0) {
          return mc.field_k[1];
        }
        if (param1 == 1) {
          return mc.field_k[0];
        }
        if (param1 == 25) {
          return mc.field_k[0];
        }
        if (param0 == param1) {
          return mc.field_k[1];
        }
        if (3 == param1) {
          return mc.field_k[1];
        }
        if (4 == param1) {
          return mc.field_k[1];
        }
        if (param1 == 5) {
          return mc.field_k[1];
        }
        if (param1 == 6) {
          return mc.field_k[1];
        }
        if (param1 == 7) {
          return mc.field_k[1];
        }
        if (param1 == 22) {
          return mc.field_k[1];
        }
        if (param1 == 8) {
          return mc.field_k[0];
        }
        if (param1 == 28) {
          return mc.field_k[1];
        }
        if (9 == param1) {
          return WriteIntegersCommand.field_E[6];
        }
        if (param1 == 35) {
          return mc.field_k[1];
        }
        if (param1 == 36) {
          return (Sprite) ((Object) sh.field_g);
        }
        if (param1 == 38) {
          return mc.field_k[1];
        }
        if (param1 == 39) {
          return mc.field_k[1];
        }
        if (param1 == 40) {
          return mc.field_k[1];
        }
        return null;
    }

    final static void b(int param0) {
        if (param0 < 64) {
          return;
        }
        if (null == TextButton.field_v) {
          TextButton.field_v = null;
          ig.field_f = null;
          return;
        }
        if (null != TextButton.field_v.field_g) {
          TextButton.field_v.field_g.field_I = false;
          TextButton.field_v = null;
          ig.field_f = null;
          return;
        }
        TextButton.field_v = null;
        ig.field_f = null;
    }

    public static void a(byte param0) {
        field_u = null;
        field_h = null;
        field_m = null;
        field_i = null;
        field_x = null;
        field_k = (int[][]) null;
        int var1 = -77 % ((param0 + 16) / 40);
    }

    final static void a(int param0) {
        ConsoleParseException.a(ChatMessage.field_e, AccountTermsPanel.field_H, 14594, ConsoleEvaluationException.field_e, SoundCache.field_b);
        int var1 = -41 / ((47 - param0) / 45);
    }

    final static void a(ResourceArchive param0, boolean param1, ResourceArchive param2, ResourceArchive param3, int param4) {
        DualLinkDequeIterator.field_e = su.a(-3505, "");
        if (param4 >= -118) {
          return;
        }
        try {
          DualLinkDequeIterator.field_e.a(false, (byte) 108);
          id.a(param0, param3, false, param2);
          IntKeyLookup.a(-93);
          mj.field_a = vj.field_a;
          wk.field_f = vj.field_a;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "da.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        fa var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Kickabout.field_G;
        try {
          var4 = (fa) (FootballerAgent.field_f.g(param0 + 24009));
          if (param0 != 0) {
            MusicPatchNode.b(79);
          }
          while (var4 != null) {
            ShopPlayerSlot.a(param1, var4, -51265247);
            var4 = (fa) (FootballerAgent.field_f.c(33));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2), "da.D(" + param0 + ',' + param1 + ')');
        }
    }

    MusicPatchNode() {
    }

    static {
        field_k = new int[][]{new int[]{-1, 2, 3, 1}, new int[]{-1, 3, 3, 1}, new int[]{-1, 3, 1, 1}, new int[]{-1, 4, 1, 1}, new int[]{-1, 5, 1, 1}, new int[]{-1, 6, 1, 1}, new int[]{-1, 7, 1, 1}, new int[]{-1, 8, 1, 1}, new int[]{-1, 9, 1, 1}, new int[]{-1, 10, 1, 1}, new int[]{-1, 11, 1, 1}, new int[]{-1, 12, 1, 1}, new int[]{-1, 13, 1, 1}, new int[]{-1, 14, 1, 1}, new int[]{-1, 15, 1, 1}, new int[]{-1, 16, 1, 1}, new int[]{-1, 9, 3, 0}, new int[]{-1, 10, 3, 0}, new int[]{-1, 11, 3, 0}, new int[]{-1, 12, 3, 0}, new int[]{-1, 13, 3, 0}, new int[]{-1, 14, 3, 0}, new int[]{-1, 15, 3, 0}, new int[]{-1, 16, 3, 0}};
        field_h = new IntrusiveDeque();
        field_x = new int[]{130, 65, 110, 65, 60};
        field_i = "Sell Player";
    }
}
