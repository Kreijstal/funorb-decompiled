/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa extends SceneWidget {
    static String field_Gb;
    static int field_Bb;
    static int field_Hb;
    static int field_Db;
    static String field_Eb;
    private SceneWidget field_Fb;
    static SceneWidget field_Cb;

    sa(SceneWidget param0, SceneWidget param1, SceneWidget param2, SceneWidget param3, SceneWidget param4, SceneWidget param5) {
        int var12 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        SceneWidget var8 = null;
        SceneWidget var9 = null;
        int var10 = 0;
        int var11 = 0;
        SceneWidget var13 = null;
        SceneWidget var14 = null;
        int var15 = 0;
        SceneWidget var17 = null;
        int var10Lifetime1;
        try {
          var17 = new SceneWidget(0L, param1, IntrusiveNodeHashTable.field_j.toUpperCase());
          var17.field_X = 1;
          this.field_Fb = new SceneWidget(0L, param2);
          var8 = new SceneWidget(0L, param3);
          var9 = new SceneWidget(0L, param3, NameSuggestionsPanel.field_H);
          var9.field_X = 1;
          var10 = 50;
          var11 = 0;
          for (var12 = 0; var12 < MenuButtonPanel.field_L.length; var12++) {
            var13 = new SceneWidget(0L, param3, no.field_vb[var12]);
            var14 = new SceneWidget(0L, param3, MenuButtonPanel.field_L[var12]);
            var15 = param3.field_Z.textWidth(MenuButtonPanel.field_L[var12]);
            var13.setBounds(65, 20, var10, 15, (byte) -120);
            if (var11 < var15) {
              var11 = var15;
            }
            var14.setBounds(640, 90, var10, 15, (byte) -120);
            var8.addChild(var13, 60);
            var8.addChild(var14, 77);
            var10 += 30;
          }
          var10 += 15;
          var17.setBounds(20 + (var11 + 90), 0, 0, 24, (byte) -120);
          this.setBounds(var17.field_x, 100, 100, var17.field_I + var10, (byte) -120);
          this.field_Fb.setBounds(15, -20 + var17.field_x, 5, 15, (byte) -120);
          var8.setBounds(this.field_x, 0, var17.field_I, this.field_I - var17.field_I, (byte) -120);
          var9.setBounds(this.field_x, 0, 20, 15, (byte) -120);
          var8.field_v = of.a(3, var8.field_I, 1, 2105376, 11579568, 8421504);
          var17.addChild(this.field_Fb, 27);
          var8.addChild(var9, 126);
          this.addChild(var17, 21);
          this.addChild(var8, 17);
          this.field_T = 320 - (this.field_x >> 1);
          var10Lifetime1 = -(this.field_I >> 1) + 240;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_10_0 = var7;
          stackIn_10_1 = new StringBuilder().append("sa.<init>(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param5 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        String var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 320) {
            var3 = (String) null;
            sa.a((String) null, 69);
          }
          stackIn_5_0 = (mf.a(-1, param0) != null);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("sa.B(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean c(boolean param0, byte param1) {
        boolean stackIn_9_0 = false;
        this.updateInputFullScreen(true, (byte) 46);
        if (param1 != 48) {
          return true;
        }
        stackIn_9_0 = ((re.field_r != 0 &&
          0 == this.field_U) ||
          this.field_Fb.field_U != 0);
        return stackIn_9_0;
    }

    public static void releaseStatics(int param0) {
        field_Eb = null;
        field_Cb = null;
        field_Gb = null;
        if (param0 != 26820) {
          field_Gb = (String) null;
        }
    }

    static {
        field_Eb = "Cancel";
        field_Hb = 0;
        field_Gb = "Advertising websites";
    }
}
