/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IconTextSceneWidget extends SceneWidget {
    static ConnectionState field_Ib;
    static String field_Bb;
    private SceneWidget field_Cb;
    static String field_Hb;
    SceneWidget field_Eb;
    static SceneWidget field_Db;
    static SceneWidget field_Fb;
    static java.math.BigInteger field_Jb;
    static hb field_Gb;

    final static void setViewSize(int param0, int param1, int param2) {
        if (param1 != 19129) {
          return;
        }
        SoundCache.field_c = param0;
        mf.field_c = param2;
        if (ClientException.field_b != null) {
          ClientException.field_b.recentrePanels(-118, param0, param2);
        }
    }

    final static ConditionalTextValue createConnectionCaption(byte param0) {
        if (param0 == 13) {
          return new ConditionalTextValue(BufferedSocket.getConnectionCaption(param0 ^ 13), ImageProducerRasterBuffer.isConnectionClosed(3236));
        }
        field_Hb = (String) null;
        return new ConditionalTextValue(BufferedSocket.getConnectionCaption(param0 ^ 13), ImageProducerRasterBuffer.isConnectionClosed(3236));
    }

    final void setBoundsAndLayout(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.setBounds(param3, param4, param5, param2, (byte) -120);
        this.layoutIconAndText(param0, param6, false);
        if (param1 != 0) {
          this.layoutIconAndText(38, -70, true);
        }
    }

    final int contentWidth(int param0, int param1, int param2) {
        int var5 = -36 % ((param2 - 17) / 45);
        int var4 = -param0;
        int var6 = -param0;
        if (null != this.field_Cb) {
          var4 = this.field_Cb.getContentWidth(-25921);
        }
        if (this.field_Eb != null) {
          var6 = this.field_Eb.getContentWidth(-25921);
        }
        return param1 + (var6 + var4 + param1) + param0;
    }

    final static Sprite[] loadSpritesByName(byte param0, ResourceArchive param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Sprite[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 31) {
            field_Hb = (String) null;
          }
          var4_int = param1.getGroupProgressByName(param3, param0 ^ 65);
          var5 = param1.getFileId(param2, (byte) 29, var4_int);
          stackIn_3_0 = om.loadSprites(var5, var4_int, (byte) -123, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("nl.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_Ib = null;
        field_Bb = null;
        field_Fb = null;
        field_Db = null;
        field_Hb = null;
        field_Gb = null;
        field_Jb = null;
        if (param0 != -10765) {
          field_Jb = (java.math.BigInteger) null;
        }
    }

    IconTextSceneWidget(long param0, SceneWidget param1, SceneWidget param2, SceneWidget param3, Sprite param4, String param5) {
        super(param0, param1);
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        try {
          if (param4 != null) {
            this.field_Cb = new SceneWidget(0L, param2);
            this.field_Cb.field_W = param4;
            this.addChild(this.field_Cb, 116);
          }
          if (param5 != null) {
            this.field_Eb = new SceneWidget(0L, param3, param5);
            this.addChild(this.field_Eb, 99);
            this.markTreeDirty((byte) 20);
          } else {
            this.markTreeDirty((byte) 20);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("nl.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param5 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    private final void layoutIconAndText(int param0, int param1, boolean param2) {
        int var4;
        int var5;
        int var6;
        var4 = -param1;
        if (param2) {
          return;
        }
        var5 = -param1;
        if (this.field_Cb != null) {
          var4 = this.field_Cb.getContentWidth(-25921);
        }
        if (this.field_Eb != null) {
          var5 = this.field_Eb.measureContentWidth(-var4 + (-param0 + (this.field_x + (-param1 - param0))), -123);
        }
        var6 = var5 + (param1 + var4) + param0 + param0;
        if (var6 > this.field_x) {
          var5 = var5 + (this.field_x - var6);
          var6 = this.field_x;
        }
        if (this.field_X == 1) {
          param0 = param0 + (-var6 + this.field_x) / 2;
        }
        if (2 == this.field_X) {
          param0 = param0 + (this.field_x - var6);
        }
        if (null != this.field_Cb) {
          this.field_Cb.setBounds(var4, param0, 0, this.field_I, (byte) -120);
          this.field_Cb.field_gb = this.field_gb;
        }
        if (this.field_Eb == null) {
          return;
        }
        this.field_Eb.setBounds(var5, param1 + (var4 + param0), 0, this.field_I, (byte) -120);
        if (null == this.field_Cb) {
          this.field_Eb.field_X = this.field_X;
        } else {
          this.field_Eb.field_X = 0;
        }
        this.field_Eb.field_gb = this.field_gb;
        return;
    }

    static {
        field_Bb = "Offer unrated rematch";
        field_Hb = "Visit the Account Management section on the main site to view.";
        field_Ib = new ConnectionState();
        field_Jb = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
    }
}
