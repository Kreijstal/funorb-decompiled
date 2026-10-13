/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj {
    static n field_e;
    oa field_d;
    static int field_c;
    static RgbSprite field_b;
    static UiComponent[] field_a;
    static int[] field_f;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        if (param2 >= 75) {
          var6 = 24;
          var7 = 5;
          this.field_d.a(var7, param1, param0, var6, param4, param3, 75);
          sj.field_d.setBounds(np.field_a, 0, 0, rg.field_c.width, (byte) 64);
          MouseWheelSource.field_c.setBounds(18, 2 + np.field_a, 0, -82 + (rg.field_c.width - ec.field_J - 2), (byte) 64);
          GameplayScreen.field_u.setBounds(18, 2 + np.field_a, -2 + (-ec.field_J + (rg.field_c.width - 80)), 82 + ec.field_J, (byte) 64);
          GameScreen.field_f.a(true, 2, rg.field_c.width, 0, 20 + (np.field_a + 2), ec.field_J, 20, -2 + (-np.field_a + rg.field_c.height) - 20);
          f.field_c.a(20, -779, ec.field_J, 2);
          return;
        }
    }

    public static void a(boolean param0) {
        field_e = null;
        if (param0) {
          field_f = null;
          field_a = null;
          field_b = null;
          return;
        }
        MusicTrack var2 = (MusicTrack) null;
        vj.a(true, 99, (byte) -104, (MusicTrack) null);
        field_f = null;
        field_a = null;
        field_b = null;
    }

    final static void a(boolean param0, int param1, byte param2, MusicTrack param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object var5 = null;
        Throwable var6 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          var4_int = -2 / ((41 - param2) / 40);
          if (null != MeshAttributeRecord.musicCrossfadeStream) {
            ScorePopup.a(1048576, param3, param1, param0, -104);
          }
          if (null == m.musicSynthesizer) {
            return;
          }
          var5 = DirectByteStorage.field_f;
          synchronized (var5) {
            m.musicSynthesizer.setChannelGain(param1, -1, 16);
            if (param3 == IsaacGenerator.field_a) {
              return;
            }
            m.musicSynthesizer.stopTrack(-24774);
            DirectByteStorage.field_f.b();
            IsaacGenerator.field_a = param3;
            if (null != IsaacGenerator.field_a) {
              m.musicSynthesizer.playTrack(IsaacGenerator.field_a, 127, param0);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("vj.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    vj(String param0, UiComponent param1) {
        String[] var3 = null;
        UiComponent[] var4 = null;
        try {
          var3 = new String[]{param0, AchievementSubmission.field_j, pl.field_e};
          var4 = new UiComponent[]{param1, rg.field_c, (UiComponent) ((Object) f.field_c)};
          this.field_d = new oa(0L, eh.field_n, var3, hd.field_c, var4, 0);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "vj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = new n();
        field_f = new int[]{14, 14, 14, 14, 14, 14, 14};
    }
}
