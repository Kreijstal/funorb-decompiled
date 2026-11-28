/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei extends IntrusiveNode {
    static IntrusiveDeque field_m;
    int field_n;
    static int field_o;
    static String field_k;
    static Archive field_i;
    byte[] field_l;
    static String field_j;

    final static void a(byte param0, java.awt.Component param1) {
        try {
          if (param0 >= -119) {
            Sprite var3 = (Sprite) null;
            ei.a((Sprite) null, -127);
          }
          param1.addMouseListener(ConfirmedEmailAvailabilityValidator.mouseHandler);
          param1.addMouseMotionListener(ConfirmedEmailAvailabilityValidator.mouseHandler);
          param1.addFocusListener(ConfirmedEmailAvailabilityValidator.mouseHandler);
        } catch (RuntimeException runtimeException) {
          throw LevelGrid.toClientException((Throwable) ((Object) runtimeException), "ei.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static IndexedSprite a(int param0, IndexedSprite param1, int[] param2) {
        IndexedSprite var3 = null;
        RuntimeException var3_ref = null;
        IndexedSprite stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new IndexedSprite(0, param0, 0);
          var3.field_c = param1.field_c;
          var3.field_a = param1.field_a;
          var3.field_j = param1.field_j;
          var3.field_l = param2;
          var3.field_g = param1.field_g;
          var3.field_k = param1.field_k;
          var3.field_b = param1.field_b;
          var3.field_m = param1.field_m;
          stackIn_1_0 = var3;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_4_0 = var3_ref;
          stackIn_4_1 = new StringBuilder().append("ei.B(").append(param0).append(',');
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
          throw LevelGrid.toClientException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void clearStaticReferences(int param0) {
        field_m = null;
        field_j = null;
        field_i = null;
        field_k = null;
        int var1 = -82 % ((param0 - 20) / 52);
    }

    final static String a(byte param0) {
        if (!(AlphaWidgetContainer.field_I >= 2)) {
          return NodeHashTableIterator.field_f;
        }
        if (null != ff.field_b) {
          if (!ff.field_b.ensureIndexLoaded(96)) {
            return ArchiveIndex.field_t;
          }
          return jb.field_c;
        }
        if (!field_i.ensureIndexLoaded(-97)) {
          return LabeledWidgetContainer.field_K;
        }
        if (!field_i.tryLoadGroupByName("commonui", (byte) -3)) {
          return gj.field_e + " - " + field_i.getGroupLoadPercentByName("commonui", 0) + "%";
        }
        if (!ha.field_x.ensureIndexLoaded(-50)) {
          return IndexedSpriteState.field_f;
        }
        if (!ha.field_x.tryLoadGroupByName("commonui", (byte) -3)) {
          return DebouncedFieldValidator.field_c + " - " + ha.field_x.getGroupLoadPercentByName("commonui", 0) + "%";
        }
        if (!SingleChildWidgetContainer.field_G.ensureIndexLoaded(117)) {
          return LevelView.field_w;
        }
        if (param0 <= 96) {
          return (String) null;
        }
        if (!SingleChildWidgetContainer.field_G.tryLoadAllGroups((byte) 48)) {
          return ug.field_t + " - " + SingleChildWidgetContainer.field_G.getArchiveLoadPercent(true) + "%";
        }
        return f.field_d;
    }

    final static void a(Sprite param0, int param1) {
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int var8 = 0;
        var8 = TrackController.field_F ? 1 : 0;
        try {
          if (~(3 & (param0.field_q | param0.field_t)) != param1) {
            var2_int = 4 - (3 & param0.field_t);
            var3 = -(3 & param0.field_q) + 4;
            var4 = param0.field_t + var2_int;
            var5 = new int[(param0.field_t + var2_int) * (var3 + param0.field_q)];
            for (var6 = 0; var6 < param0.field_q; var6++) {
              for (var7 = 0; param0.field_t > var7; var7++) {
                var5[(var3 + var6) * var4 - (-var2_int - var7)] = param0.pixels[var7 + param0.field_t * var6];
              }
            }
            param0.pixels = var5;
            param0.field_t = param0.field_t + var2_int;
            param0.field_r = param0.field_r - var2_int;
            param0.field_o = param0.field_o - var3;
            param0.field_q = param0.field_q + var3;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("ei.E(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw LevelGrid.toClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void d(int param0) {
        oj.a(-108);
        if (null != ki.field_f) {
          r.a(param0 - 14051, ki.field_f);
        }
        PasswordValidator.g(95);
        ij.a(13809);
        ValidationStatusWidget.k(10228);
        if (wf.a(-28510)) {
          LevelView.field_C.writeCipheredByte(1, 7);
          MovingBlock.a(param0 + 18600, 0);
        }
        if (param0 != -18601) {
          return;
        }
        GameKeyHandler.a((byte) 117);
    }

    private ei() throws Throwable {
        throw new Error();
    }

    static {
        field_m = new IntrusiveDeque();
        field_k = "Loading levels";
        field_j = "Names should contain a maximum of 12 characters";
    }
}
