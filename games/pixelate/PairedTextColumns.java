/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PairedTextColumns extends SceneWidget {
    static String field_Eb;
    static String field_Gb;
    private SceneWidget field_Ib;
    private SceneWidget field_Fb;
    static int field_Hb;

    public static void clearStatics(int param0) {
        field_Eb = null;
        field_Gb = null;
        if (param0 < 78) {
          PairedTextColumns.b((byte) -20);
        }
    }

    final int getPreferredWidth(byte param0, int param1) {
        if (param0 >= 106) {
          return this.field_Fb.getContentWidth(0) + param1 + this.field_Ib.getContentWidth(0);
        }
        this.setBoundsAndLayoutColumns(99, 86, 52, 40, 114, 127);
        return this.field_Fb.getContentWidth(0) + param1 + this.field_Ib.getContentWidth(0);
    }

    final static SceneWidget c(byte param0) {
        if (param0 < 93) {
          return (SceneWidget) null;
        }
        return MouseWheelHandler.field_e.field_Fb;
    }

    private final void layoutColumns(int param0, boolean param1) {
        this.field_Fb.setBounds(0, this.height, 0, 256, this.field_Fb.getContentWidth(0));
        int var3 = param0 + this.field_Fb.field_K;
        this.field_Ib.setBounds(0, this.height, var3, 256, -var3 + this.field_K);
        if (!param1) {
          return;
        }
        LobbyGame var4 = (LobbyGame) null;
        PairedTextColumns.openLobbyGameContextMenu(false, (String) null, (LobbyGame) null, 102);
    }

    final void setBoundsAndLayoutColumns(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.setBounds(param2, param0, param1, param5 + 256, param3);
        if (param5 == 0) {
          this.layoutColumns(param4, false);
          return;
        }
        field_Hb = -3;
        this.layoutColumns(param4, false);
    }

    final static void a(int param0, int param1) {
        CipherPacketBuffer var2 = aa.field_f;
        var2.writeOpcode(param1, 15514);
        var2.writeByte(160, param0);
        var2.writeByte(160, 1);
    }

    PairedTextColumns(long param0, Sprite param1, Sprite param2, int param3, SceneWidget param4, String param5) {
        this(param0, (SceneWidget) null, param4, param5);
        try {
          this.field_Fb.verticalAlignment = param3;
          this.field_Fb.field_z = param1;
          this.field_Fb.field_H = param2;
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "fb.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static SceneWidget b(byte param0) {
        if (param0 <= 77) {
          return (SceneWidget) null;
        }
        return fd.a(0);
    }

    private PairedTextColumns(long param0, SceneWidget param1, SceneWidget param2, String param3) {
        super(param0, (SceneWidget) null);
        try {
          this.field_Fb = new SceneWidget(0L, param1);
          this.field_Ib = new SceneWidget(0L, param2);
          this.field_Ib.field_cb = param3;
          this.addChild(this.field_Fb, (byte) 26);
          this.addChild(this.field_Ib, (byte) 26);
          this.markTreeDirty(-257);
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "fb.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    PairedTextColumns(long param0, PairedTextColumns param1, String param2) {
        this(param0, param1.field_Fb, param1.field_Ib, param2);
    }

    final static int a(int param0, byte param1, int param2) {
        if (param1 < 8) {
          field_Hb = -30;
          if (2 <= param0) {
            return 2;
          }
          if (param2 >= 5) {
            return 1;
          }
          return 0;
        }
        if (2 <= param0) {
          return 2;
        }
        if (param2 >= 5) {
          return 1;
        }
        return 0;
    }

    final static void openLobbyGameContextMenu(boolean param0, String param1, LobbyGame param2, int param3) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ClientContextMenu var9 = null;
        String var10 = null;
        ClientContextMenu var11 = null;
        String var12 = null;
        ClientContextMenu var13 = null;
        String var14 = null;
        ClientContextMenu var15 = null;
        try {
          em.openContextMenu((String) null, 0L, (String) null, param2.c((byte) 8), param2, -163, aj.field_k, (int[]) null, -1);
          if (param2.field_dc && (param2.field_Tb == 2 ||
            !(wo.field_h < 2))) {
            var9 = ProxySocketConnector.field_n;
            var10 = AlphaContainer.a(ReportAbuseDialog.field_Kb, 103, new String[]{param1});
            var9.field_b.addAction(var10, (byte) -112, 10);
          }
          ProxySocketConnector.field_n.addLobbyGameActions(-107);
          if (param0) {
            if (NameAvailabilityValidator.field_r == ProxySocketConnector.field_n.field_m) {
              var13 = ProxySocketConnector.field_n;
              var14 = AlphaContainer.a(DateInputWidget.field_M, 77, new String[]{param1});
              var13.field_b.addAction(var14, (byte) -111, 16);
            } else {
              var11 = ProxySocketConnector.field_n;
              var12 = AlphaContainer.a(AlphaContainer.field_J, 89, new String[]{param1});
              var11.field_b.addAction(var12, (byte) -61, 15);
            }
          }
          var6 = -41 / ((23 - param3) / 40);
          var15 = ProxySocketConnector.field_n;
          var5 = BufferedRandomAccessFile.field_a;
          var7 = ji.field_c;
          var15.field_b.layoutPopup(0, var5, 62, var7, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("fb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_Gb = "Game";
        field_Eb = "You have declined the invitation.";
        field_Hb = 0;
    }
}
