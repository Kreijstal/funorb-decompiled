/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TwoColumnListPanel extends UiComponent {
    static QuickChatCommandType field_Qb;
    UiComponent field_Sb;
    UiComponent field_Kb;
    UiComponent field_Pb;
    ScrollPane field_Rb;
    static String field_Mb;
    static boolean field_Nb;
    static String field_Ob;
    static String field_Ub;
    static String field_Vb;
    static int field_Tb;
    static String field_Lb;

    final static String formatArchiveGroupProgress(String param0, Archive param1, String param2, String param3, int param4) {
        RuntimeException var5 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1.ensureIndexLoaded(103)) {
            stackIn_2_0 = (String) (param2);
            return stackIn_2_0;
          }
          if (param4 != 1152753825) {
            TwoColumnListPanel.releaseStatics((byte) 23);
          }
          stackIn_6_0 = param0 + " - " + param1.getGroupProgressByName(param3, true) + "%";
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ji.D(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param4).append(')').toString());
        }
    }

    final void layoutColumns(int param0, int param1, int param2, int param3) {
        int var5 = (param1 + this.field_Hb) / param3;
        int var6 = this.field_R - param0;
        this.field_Rb.setBoundsAndLayout(this.field_Hb, param2, var6 - param1, true, 0, 0, param1);
        this.field_Sb.field_Hb = var5 - param1;
        this.field_Sb.field_R = param0;
        this.field_Sb.field_M = 0;
        this.field_Sb.field_yb = var6;
        this.field_Pb.field_R = param0;
        this.field_Pb.field_yb = var6;
        this.field_Pb.field_Hb = this.field_Hb - var5;
        this.field_Pb.field_M = var5;
    }

    TwoColumnListPanel(long param0, UiComponent param1, UiComponent param2, VerticalScrollbar param3, UiComponent param4, String param5, String param6) {
        super(param0, param1);
        try {
          this.field_Kb = new UiComponent(0L, (UiComponent) null);
          this.field_Rb = new ScrollPane(0L, this.field_Kb, param2, param3);
          this.field_Sb = new UiComponent(0L, param4);
          this.field_Pb = new UiComponent(0L, param4);
          this.field_Sb.field_jb = param5;
          this.field_Pb.field_jb = param6;
          this.addChild((byte) -110, this.field_Rb);
          this.addChild((byte) -117, this.field_Sb);
          this.addChild((byte) 47, this.field_Pb);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "ji.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final void setBoundsAndLayout(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.field_yb = param6;
        this.field_R = param3;
        this.field_M = param1;
        if (param0 != -2328) {
          String var10 = (String) null;
          TwoColumnListPanel.formatArchiveGroupProgress((String) null, (Archive) null, (String) null, (String) null, 48);
        }
        this.field_Hb = param4;
        this.layoutColumns(param2, param5, param7, 2);
    }

    final static void loadLogoModels(Archive param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        TriangleMesh var5 = null;
        int[] var6 = null;
        int var7 = 0;
        BitPacketBuffer var8 = null;
        int var9 = 0;
        BitPacketBuffer var10 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4Lifetime1;
        var7 = TetraLink.field_J;
        try {
          var8 = new BitPacketBuffer(param0.getFileByName("logo.fo3d", "", true));
          var10 = var8;
          var3 = var10.readUnsignedByte((byte) -99);
          var10.beginBitAccess(true);
          LruTextureCache.field_n = NodeHashTableIterator.readMeshMaterials(var10, 0);
          TriangleSpanHelpers.field_f = new TriangleMesh[var3];
          CanvasAndErrorHelpers.field_b = new int[var3][];
          if (param1 != 1) {
            field_Nb = false;
          }
          for (var4 = 0; var4 < var3; var4++) {
            TriangleSpanHelpers.field_f[var4] = NodeHashTableIterator.decodeMesh(param1 - 16484, var8);
          }
          var10.endBitAccess((byte) 123);
          var9 = 0;
          var4Lifetime1 = var9;
          while (var3 > var9) {
            var5 = TriangleSpanHelpers.field_f[var9];
            var5.scaleVertices(1, 6, true, 6, 6);
            var5.computeBounds(false);
            var6 = new int[]{var5.field_a + var5.field_j >> 1, var5.field_L + var5.field_f >> 1, var5.field_P + var5.field_m >> 1};
            CanvasAndErrorHelpers.field_b[var9] = var6;
            var5.translateVertices(-var6[2], param1 ^ 5337, -var6[0], -var6[1]);
            var9++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("ji.F(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void drawPopupOverlays(int param0, boolean param1) {
        if (CheckboxWidget.field_P != null) {
          CommonUiHelpers.drawTooltipBox(7918, CheckboxWidget.field_P);
        }
        if (null != EmailAvailabilityValidator.field_s) {
          EmailAvailabilityValidator.field_s.setMenuFlag(param1, 15163);
        }
        LoginProgressHelpers.updateTextPromptDialog(param1, -123);
        if (param0 != -1002815199) {
          field_Mb = (String) null;
        }
        if (null != PasswordValidator.field_y) {
          PasswordValidator.field_y.drawFullScreen(param1, 256);
        }
        AlternateLongAndTextCredentials.drawActivePopup(param1, (byte) 24);
    }

    TwoColumnListPanel(long param0, TwoColumnListPanel param1, String param2, String param3) {
        this(param0, param1, param1.field_Rb.field_Ob, param1.field_Rb.field_Qb, param1.field_Sb, param2, param3);
    }

    public static void releaseStatics(byte param0) {
        if (param0 != 116) {
          field_Mb = (String) null;
        }
        field_Qb = null;
        field_Ub = null;
        field_Mb = null;
        field_Vb = null;
        field_Ob = null;
        field_Lb = null;
    }

    final static void clearSocialLists(int param0) {
        DualLinkNode var1 = null;
        int var2 = TetraLink.field_J;
        DualLinkNode var1Lifetime1;
        try {
          SpriteCheckboxPainter.field_e = null;
          SparkParticle.field_q = 0;
          SocketConnector.field_c = param0;
          CheckboxPainter.field_j.clear(1);
          PasswordValidator.field_s.clear(1);
          var1 = DelegatingCanvas.field_f.firstInTraversal(107);
          while (var1 != null) {
            var1.unlinkSecondary(param0 ^ 0);
            var1 = DelegatingCanvas.field_f.nextInTraversal(-1);
          }
          var1Lifetime1 = LoginDialog.field_nb.firstInTraversal(-127);
          while (var1Lifetime1 != null) {
            var1Lifetime1.unlinkSecondary(param0 + 0);
            var1Lifetime1 = LoginDialog.field_nb.nextInTraversal(-1);
          }
          field_Tb = 0;
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "ji.E(" + param0 + ')');
        }
    }

    static {
        field_Mb = "Options";
        field_Qb = new QuickChatCommandType(8, 0, 4, 1);
        field_Ub = "Unpacking sound effects";
        field_Ob = "Show all game chat";
        field_Vb = "Please remove <%0> from your friend list first.";
    }
}
