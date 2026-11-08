/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoadingProgressDialog extends ResizableModalPanel {
    private boolean field_sb;
    static String field_qb;
    static String field_nb;
    private String field_jb;
    static String[] field_kb;
    static int field_tb;
    static int field_rb;
    private boolean field_V;
    static int[] field_pb;
    private om field_ob;
    private String field_lb;
    static Sprite field_mb;

    final void setProgress(String param0, float param1, boolean param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_5_1 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_intLifetime1;
        try {
          if (this.field_sb == param2) {
            this.field_ob.field_O = (int)(65536.0f * (param1 / 100.0f));
            var5_int = -108 % ((-12 - param3) / 54);
            this.field_lb = param0;
            return;
          }
          stackIn_5_1 = (param2);
          this.field_sb = stackIn_5_1;
          if (this.field_sb) {
            this.field_ob.setColours(4210752, true, 8405024);
            this.field_ob.field_I = true;
          } else {
            this.field_ob.setColours(4210752, true, 2113632);
            if (this.field_V) {
              this.field_ob.field_I = false;
            }
          }
          this.field_ob.field_O = (int)(65536.0f * (param1 / 100.0f));
          var5_intLifetime1 = -108 % ((-12 - param3) / 54);
          this.field_lb = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("gd.F(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    LoadingProgressDialog(ModalPanelStack param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
          this.field_jb = param1;
          if (null != this.field_jb) {
            var3_int = SocketConnector.field_k.paragraphHeight(this.field_jb, 260, SocketConnector.field_k.field_C);
            this.centerOnScreen(300, 0, var3_int + 150);
          }
          this.field_ob = new om(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_sb = false;
          this.field_V = false;
          this.field_ob.field_I = true;
          this.addChild(-78, this.field_ob);
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "gd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void initializeGameAssets(int[] param0, IndexedSprite[] param1, Sprite[][] param2, int param3, String[][] param4, String[] param5, int param6, ResourceArchive param7, byte[] param8, String[] param9, ResourceArchive param10, String[] param11, int param12, Sprite[][] param13, boolean param14, int param15, String[][] param16, ResourceArchive param17, byte[] param18, int[] param19) {
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
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
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var20 = null;
        try {
          ArchiveRequest.loadLobbySprites(param12 ^ param12, param17, param0, param1, param10);
          gf.loadDisplayNameSprites((byte) 72, param17);
          CacheEntry.initializeGameOptions(param8, param19, param3, param2, param6, param9, param4, param11, param17, param18, param5, param16, param15, param13, param12 - 17290);
          FrameClock.initializeChatFilter(param7, param14, param17, (byte) -103);
          PasswordFieldPainter.initializeCaptionTable((byte) 6);
          ik.buildLobbyRoot((byte) -85);
          r.refreshOverlay(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var20 = decompiledCaughtException;
          stackIn_4_0 = var20;
          stackIn_4_1 = new StringBuilder().append("gd.I(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param5 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param8 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param9 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param10 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param11 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param12).append(',');
          if (param13 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param14).append(',').append(param15).append(',');
          if (param16 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          stackIn_40_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',');
          if (param17 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          stackIn_43_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',');
          if (param18 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          stackIn_46_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',');
          if (param19 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(')').toString());
        }
    }

    final void markComplete(byte param0) {
        this.field_ob.field_I = false;
        if (param0 != 61) {
          return;
        }
        this.field_V = true;
    }

    final void drawPanel(int param0, byte param1, int param2) {
        super.drawPanel(param0, param1, param2);
        SocketConnector.field_k.drawCentered(this.field_lb, param0 + (this.field_v >> 1), 103 + param2, 16777215, -1);
        if (null != this.field_jb) {
          SoftwareRasterizer.drawHorizontalLine(param0 + 20, 113 + param2, 260, 8421504);
          SocketConnector.field_k.drawParagraph(this.field_jb, 20 + param0, 8 + param2 + 120, 260, 100, 16777215, -1, 1, 0, SocketConnector.field_k.field_C);
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 == 103) {
          field_pb = null;
          field_mb = null;
          field_qb = null;
          field_nb = null;
          field_kb = null;
          return;
        }
        field_pb = (int[]) null;
        field_pb = null;
        field_mb = null;
        field_qb = null;
        field_nb = null;
        field_kb = null;
    }

    final static int padToByteBoundary(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var2Lifetime1;
        int var3Lifetime1;
        if (param0 == 29389) {
          var2 = 0;
          if ((7 & param1) != 0) {
            var2 = 8 - (7 & param1);
          }
          var3 = var2 + param1;
          return var3;
        }
        field_tb = 65;
        var2Lifetime1 = 0;
        if ((7 & param1) != 0) {
          var2Lifetime1 = 8 - (7 & param1);
        }
        var3Lifetime1 = var2Lifetime1 + param1;
        return var3Lifetime1;
    }

    static {
        field_qb = "Book of Flame";
        field_kb = new String[]{"Story", "Movement", "Spell types", "Spell types", "Game interface", "Wands", "Team Play", "Familiars", "Landscapes", "Landscapes", "Landscapes", "Landscapes", "Tips"};
        field_tb = 1;
        field_pb = new int[]{15, 16, 17};
        field_nb = "Loading graphics";
    }
}
