/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj {
    static String[] field_c;
    static int[] field_a;
    static int field_b;

    final static void a(int param0) {
        if (!DialWidget.field_H) {
          throw new IllegalStateException();
        }
        if (param0 != 0) {
          return;
        }
        if (be.field_b != null) {
          be.field_b.closeDialog(param0 ^ -18861);
        }
        String var1 = mh.b((byte) 105);
        PcmResampler.field_d = new LoginForm(var1, (String) null, true, false, false);
        Checkbox.field_F.pushPanel(rd.field_c, 97);
        rd.field_c.transitionToContent(PcmResampler.field_d, 30);
        rd.field_c.finishTransition(false);
    }

    public static void releaseStatics(int guard) {
        field_a = null;
        if (guard != 9) {
          field_b = 96;
        }
        field_c = null;
    }

    final static void a(boolean param0) {
        try {
          int var1_int = ProxySocketConnector.field_j.length;
          ProxySocketConnector.achievementThresholdRules = new AchievementThresholdRule[var1_int];
          for (int var2 = 0; var2 < var1_int; var2++) {
            int var3 = ProxySocketConnector.field_j[var2];
            int var4 = ProxySocketConnector.field_y[var2];
            int var5 = ProxySocketConnector.field_x[var2];
            AchievementThresholdRule var6 = new AchievementThresholdRule(var3, var4, var5);
            ProxySocketConnector.achievementThresholdRules[var2] = var6;
          }
          if (param0) {
            field_b = 97;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "jj.B(" + param0 + ')');
        }
    }

    final static Sprite[] a(int param0, int param1) {
        Sprite[] var3 = new Sprite[9];
        Sprite[] var2 = var3;
        var3[4] = SpriteDecodeSupport.solidSprite(param0, (byte) 104, 64);
        if (param1 <= 33) {
          return (Sprite[]) null;
        }
        return var2;
    }

    static {
        field_c = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_b = -1;
    }
}
