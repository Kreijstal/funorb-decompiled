/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ContextMenu extends UiComponent {
    private int field_Mb;
    private Sprite[] field_Zb;
    static GameSession field_bc;
    private int field_Yb;
    static int field_Pb;
    private int[] field_Sb;
    static String field_Kb;
    private int field_Rb;
    private int field_Qb;
    private int field_Tb;
    private UiComponent field_Ob;
    static int field_Nb;
    static int field_Vb;
    private IconLabelItem[] field_Lb;
    private int field_ac;
    static NineSliceFrame field_Wb;
    private int field_Xb;
    private UiComponent field_Ub;

    final void openAt(int param0, int param1, int param2, int param3, int param4) {
        int var6;
        int var7;
        int var8;
        int var11;
        int var9;
        int var10;
        int var6Lifetime1;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var10Lifetime1;
        int var7Lifetime3;
        int var8Lifetime3;
        var11 = TetraLink.field_J;
        if (this.field_Rb != 0) {
          var6 = 0;
          for (var7 = 0; this.field_Rb > var7; var7++) {
            var8 = this.field_Lb[var7].measureWidth(-26606, this.field_Qb, this.field_Mb);
            if (var6 < var8) {
              var6 = var8;
            }
          }
          var6 = var6 + 2 * this.field_Tb;
          var7Lifetime3 = this.field_Yb + this.field_Yb + this.field_Rb * this.field_Xb;
          var8Lifetime3 = CameraAndChatHelpers.clampPopupX(var6, (byte) 123, param4, param0);
          var9 = GameRoomPanelHelpers.placePopupVertically(param3, param1, var7Lifetime3, -8748);
          this.setBounds((byte) -80, var6, var9, var7Lifetime3, var8Lifetime3);
          var10 = 0;
          if (param2 >= -13) {
            return;
          }
          while (this.field_Rb > var10) {
            this.field_Lb[var10].setBoundsAndLayout(0, var6 - 2 * this.field_Tb, this.field_Yb + var10 * this.field_Xb, this.field_Qb, this.field_Tb, this.field_Mb, this.field_Xb);
            var10++;
          }
          return;
        }
        this.field_Lb[this.field_Rb] = new IconLabelItem(0L, (UiComponent) null, (UiComponent) null, this.field_Ob, (Sprite) null, field_Kb);
        this.field_Lb[this.field_Rb].field_J = 1;
        this.addChild((byte) -95, this.field_Lb[this.field_Rb]);
        this.field_Sb[this.field_Rb] = -1;
        this.field_Rb = this.field_Rb + 1;
        var6Lifetime1 = 0;
        for (var7Lifetime1 = 0; this.field_Rb > var7Lifetime1; var7Lifetime1++) {
          var8Lifetime1 = this.field_Lb[var7Lifetime1].measureWidth(-26606, this.field_Qb, this.field_Mb);
          if (var6Lifetime1 < var8Lifetime1) {
            var6Lifetime1 = var8Lifetime1;
          }
        }
        var6Lifetime1 = var6Lifetime1 + 2 * this.field_Tb;
        var7Lifetime2 = this.field_Yb + this.field_Yb + this.field_Rb * this.field_Xb;
        var8Lifetime2 = CameraAndChatHelpers.clampPopupX(var6Lifetime1, (byte) 123, param4, param0);
        var9Lifetime1 = GameRoomPanelHelpers.placePopupVertically(param3, param1, var7Lifetime2, -8748);
        this.setBounds((byte) -80, var6Lifetime1, var9Lifetime1, var7Lifetime2, var8Lifetime2);
        var10Lifetime1 = 0;
        if (param2 >= -13) {
          return;
        }
        while (this.field_Rb > var10Lifetime1) {
          this.field_Lb[var10Lifetime1].setBoundsAndLayout(0, var6Lifetime1 - 2 * this.field_Tb, this.field_Yb + var10Lifetime1 * this.field_Xb, this.field_Qb, this.field_Tb, this.field_Mb, this.field_Xb);
          var10Lifetime1++;
        }
    }

    final void addIconAction(int param0, Sprite param1, int param2, String param3) {
        try {
          this.field_Lb[this.field_Rb] = new IconLabelItem((long)param2, (UiComponent) null, (UiComponent) null, this.field_Ub, param1, param3);
          this.field_Lb[this.field_Rb].field_kb = this.field_Zb;
          this.field_Lb[this.field_Rb].field_Cb = true;
          this.field_Lb[this.field_Rb].field_J = 1;
          this.addChild((byte) 92, this.field_Lb[this.field_Rb]);
          this.field_Sb[this.field_Rb] = param0;
          this.field_Rb = this.field_Rb + 1;
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "aa.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void addItem(String param0, int param1, int param2) {
        try {
          this.field_Lb[this.field_Rb] = new IconLabelItem(0L, (UiComponent) null, (UiComponent) null, this.field_Ub, (Sprite) null, param0);
          this.field_Lb[this.field_Rb].field_kb = this.field_Zb;
          this.field_Lb[this.field_Rb].field_Cb = true;
          this.field_Lb[this.field_Rb].field_J = param1;
          this.addChild((byte) -93, this.field_Lb[this.field_Rb]);
          this.field_Sb[this.field_Rb] = param2;
          this.field_Rb = this.field_Rb + 1;
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "aa.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 == -2) {
          field_Wb = null;
          field_Kb = null;
          field_bc = null;
          return;
        }
        field_Pb = 25;
        field_Wb = null;
        field_Kb = null;
        field_bc = null;
    }

    final static void openLoginDialog(byte param0) {
        String var3 = (String) null;
        NineSliceFrame.showLoginForm(-1, (String) null, StatusRequestHelpers.field_e);
        if (param0 < 36) {
          String var2 = (String) null;
          ContextMenu.requestRemoveIgnore((String) null, -21, -48, (String) null);
          return;
        }
    }

    final static void fillTriangle(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9;
        var9 = TetraLink.field_J;
        if (param3 <= param0) {
          if (param5 > param0) {
            SparkParticle.drawFlatTriangle(param1, param4, (byte) 98, param2, param0, param5, SoftwareRasterizer.field_b, param3, param6);
          } else {
            if (param3 >= param5) {
              SparkParticle.drawFlatTriangle(param2, param1, (byte) 98, param4, param3, param0, SoftwareRasterizer.field_b, param5, param6);
            } else {
              SparkParticle.drawFlatTriangle(param2, param4, (byte) 98, param1, param5, param0, SoftwareRasterizer.field_b, param3, param6);
            }
          }
        } else {
          if (param5 > param3) {
            SparkParticle.drawFlatTriangle(param1, param2, (byte) 98, param4, param3, param5, SoftwareRasterizer.field_b, param0, param6);
          } else {
            if (param5 <= param0) {
              SparkParticle.drawFlatTriangle(param4, param1, (byte) 98, param2, param0, param3, SoftwareRasterizer.field_b, param5, param6);
            } else {
              SparkParticle.drawFlatTriangle(param4, param2, (byte) 98, param1, param5, param3, SoftwareRasterizer.field_b, param0, param6);
            }
          }
        }
        if (param7 > 88) {
          return;
        }
        field_Vb = -56;
    }

    ContextMenu(UiComponent param0, Sprite[] param1, UiComponent param2, UiComponent param3, int param4, int param5, int param6, int param7, int param8) {
        super(0L, param0);
        this.field_Sb = new int[256];
        this.field_Lb = new IconLabelItem[256];
        this.field_ac = -2;
        try {
          this.field_Qb = param6;
          this.field_Tb = param4;
          this.field_Mb = param5;
          this.field_Xb = param8;
          this.field_Ub = param3;
          this.field_Yb = param7;
          this.field_Ob = param2;
          this.field_Zb = param1;
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "aa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final boolean handleEscape(byte param0) {
        if (this.field_ac != -2) {
          return false;
        }
        if (WidgetStyleLayer.field_e == 13) {
          this.field_ac = -1;
          if (param0 == -87) {
            return true;
          }
          return false;
        }
        if (param0 == -87) {
          return true;
        }
        return false;
    }

    final static String requestRemoveIgnore(String param0, int param1, int param2, String param3) {
        RuntimeException var4 = null;
        BitPacketBuffer var5 = null;
        int var6 = 0;
        SocialListEntry var7 = null;
        CharSequence var8 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        Object stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = (CharSequence) ((Object) param0);
          if (!InterfaceTextLoader.isValidPlayerName(false, var8)) {
            stackIn_3_0 = WidgetNode.field_u;
            return stackIn_3_0;
          }
          if (TwoColumnListPanel.field_Tb != param2) {
            stackIn_6_0 = LoginProgressHelpers.field_a;
            return stackIn_6_0;
          }
          var7 = HuffmanCodec.findSocialEntryByName(param2 ^ -32053, param3);
          if (var7 == null) {
            stackIn_9_0 = SectorCacheStore.formatTemplate(new String[]{param3}, MiscTextGlobals.field_e, 121);
            return stackIn_9_0;
          }
          var7.unlink(false);
          var7.unlinkSecondary(0);
          SocketConnector.field_c = SocketConnector.field_c - 1;
          var5 = QuickChatHelpDialog.field_Lb;
          var5.writeCipheredByte(param1, (byte) -92);
          var5.position = var5.position + 1;
          var6 = var5.position;
          var5.writeByte(3, false);
          var5.writeString(param0, 0);
          var5.backpatchByteLength(-var6 + var5.position, param2 - 4);
          stackIn_11_0 = null;
          return (String) (stackIn_11_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("aa.C(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final int pollAction(boolean param0, int param1) {
        int var3 = 0;
        int var4 = TetraLink.field_J;
        this.updateInput(0, param0);
        if (!param0) {
          return -2;
        }
        if (param1 > -90) {
          field_Kb = (String) null;
        }
        for (var3 = 0; this.field_Rb > var3; var3++) {
          if (this.field_Lb[var3].field_F != 0) {
            return this.field_Sb[var3];
          }
        }
        if (NameAvailabilityValidator.field_t == 0) {
          return this.field_ac;
        }
        return -1;
    }

    ContextMenu(ContextMenu param0) {
        this(param0, param0.field_Zb, param0.field_Ob, param0.field_Ub, param0.field_Tb, param0.field_Mb, param0.field_Qb, param0.field_Yb, param0.field_Xb);
    }

    static {
        field_Kb = "No options available";
        field_Nb = 0;
    }
}
