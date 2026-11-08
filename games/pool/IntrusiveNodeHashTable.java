/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class IntrusiveNodeHashTable implements Iterable {
    static Sprite[] field_b;
    IntrusiveNode[] buckets;
    static boolean field_c;
    int bucketCount;
    static NineSliceFrame field_d;
    private static int field_f;
    static Sprite field_g;
    static int field_a;
    static int field_l;
    static int field_m;
    static Sprite[] field_i;
    private IntrusiveNode field_e;
    static int field_j;

    final static void recenterMeshAndAdjustTransform(int[] transform, int obfuscationGuard, MeshBuilder mesh) {
        try {
          RuntimeException stackIn_29_0 = null;
          StringBuilder stackIn_29_1 = null;
          String stackIn_30_2 = null;
          StringBuilder stackIn_32_1 = null;
          String stackIn_33_2 = null;
          RuntimeException decompiledCaughtException = null;
          int var3_int = 0;
          RuntimeException var3 = null;
          int var4 = 0;
          int var5 = 0;
          int var6 = 0;
          int var7 = 0;
          int var3_intLifetime1;
          int var3_intLifetime2;
          var7 = Pool.field_O;
          try {
            MeshBoundsSupport.computeMeshBounds(mesh, -23109);
            var4 = mesh.field_D + mesh.field_w >> 1;
            var5 = mesh.field_y + mesh.field_S >> 1;
            var6 = mesh.field_V + mesh.field_x >> 1;
            for (var3_int = 0; mesh.vertexX.length > var3_int; var3_int++) {
              mesh.vertexX[var3_int] = mesh.vertexX[var3_int] - var4;
            }
            for (var3_intLifetime1 = 0; var3_intLifetime1 < mesh.vertexY.length; var3_intLifetime1++) {
              mesh.vertexY[var3_intLifetime1] = mesh.vertexY[var3_intLifetime1] - var5;
            }
            for (var3_intLifetime2 = 0; var3_intLifetime2 < mesh.vertexZ.length; var3_intLifetime2++) {
              mesh.vertexZ[var3_intLifetime2] = mesh.vertexZ[var3_intLifetime2] - var6;
            }
            if (obfuscationGuard >= -121) {
              field_i = (Sprite[]) null;
            }
            boolean decompiledFrameRemainder0 = true;
            if (transform.length == 12 && (65536 != transform[3] ||
              transform[4] != 0 ||
              0 != transform[5] ||
              0 != transform[6] ||
              transform[7] != 65536 ||
              transform[8] != 0 ||
              transform[9] != 0 ||
              transform[10] != 0 ||
              transform[11] != 65536)) {
              System.out.println("Recentring with transformation");
              new Throwable().printStackTrace();
              transform[1] = transform[1] + (var4 * transform[6] + (var5 * transform[7] + transform[8] * var6) >> 16);
              transform[2] = transform[2] + (transform[11] * var6 + transform[9] * var4 + var5 * transform[10] >> 16);
              transform[0] = transform[0] + (transform[4] * var5 + var4 * transform[3] + var6 * transform[5] >> 16);
              decompiledFrameRemainder0 = false;
            }
            else {
              transform[1] = transform[1] + var5;
              transform[2] = transform[2] + var6;
              transform[0] = transform[0] + var4;
            }
            mesh.clearCaches();
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = decompiledCaughtException;
            stackIn_29_0 = var3;
            stackIn_29_1 = new StringBuilder().append("uk.F(");
            if (transform == null) {
              stackIn_30_2 = "null";
            } else {
              stackIn_30_2 = "{...}";
            }
            stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(obfuscationGuard).append(',');
            if (mesh == null) {
              stackIn_33_2 = "null";
            } else {
              stackIn_33_2 = "{...}";
            }
            throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, Sprite[] param11, int param12, BitmapFont param13, int param14, int param15, int param16, int param17, Sprite[] param18, Sprite[] param19, BitmapFont param20) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        java.applet.Applet var22 = null;
        try {
          if (param12 != -23994) {
            var22 = (java.applet.Applet) null;
            IntrusiveNodeHashTable.a(-48, (java.applet.Applet) null);
          }
          MessageDialogContent.a(param9, param5, param13, param8, param20, param4, param15, new NineSliceFrame(param11), param3, param17, new NineSliceFrame(param19), param10, param0, param2, param1, param7, 255, param6, new NineSliceFrame(param18), param16, param14);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_6_0 = var21;
          stackIn_6_1 = new StringBuilder().append("uk.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param12).append(',');
          if (param13 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',');
          if (param18 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param19 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param20 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final void put(IntrusiveNode param0, boolean param1, long param2) {
        IntrusiveNode var5 = null;
        MeshBuilder var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          if (param0.next != null) {
            param0.unlink((byte) -117);
          }
          var5 = this.buckets[(int)((long)(this.bucketCount - 1) & param2)];
          param0.previous = var5;
          param0.next = var5.next;
          param0.next.previous = param0;
          param0.key = param2;
          param0.previous.next = param0;
          if (!param1) {
            var6 = (MeshBuilder) null;
            IntrusiveNodeHashTable.recenterMeshAndAdjustTransform((int[]) null, 89, (MeshBuilder) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = var5_ref;
          stackIn_7_1 = new StringBuilder().append("uk.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new NodeHashTableIterator(this));
    }

    final static ChatMessage a(int param0, byte param1, int param2, int param3) {
        boolean stackIn_47_0 = false;
        Object var4;
        int var5;
        int var6;
        int var7;
        int var8;
        ChatMessage var8_ref_pn;
        int var9;
        ChatMessage var9_ref_pn;
        int var10_int;
        String var10;
        String var11;
        int var12;
        int var13;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        var13 = Pool.field_O;
        Js5ArchiveManager.field_b.content.children.clear((byte) 90);
        var4 = null;
        var5 = 0;
        var6 = 0;
        for (var7 = IntrusiveDequeCursor.field_e - 1; var7 >= 0; var7--) {
          var8_ref_pn = RankingsProtocolSupport.field_e[var7];
          var9 = 0;
          if (!RankingsRequest.field_z &&
            var5 < QuickChatPhraseDefinition.field_E) {
            var10_int = LobbyPanelLayoutSupport.getChatFilterMode(5, var8_ref_pn.field_p);
            if (var8_ref_pn.b(14842) >= var10_int && (var8_ref_pn.field_g ||
              !MenuSelection.isIgnoredName(var8_ref_pn.field_q, 24552))) {
              var9 = 1;
            }
          }
          if (var9 != 0) {
            var5++;
            if (null == var8_ref_pn.field_u ||
              LoginEncryptionSupport.field_c) {
              if (null == var8_ref_pn.field_u) {
                MidiNoteMixer.field_r = MidiNoteMixer.field_r + 1;
              }
              var10 = PacketBuffer.formatChatPrefix((byte) -24, var8_ref_pn);
              var11 = var10 + BitmapFont.escapeMarkup(var8_ref_pn.field_f);
              var12 = QuickChatHelpDialog.chatMessageColor(var8_ref_pn, -55);
              var8_ref_pn.field_u = new UiComponent(0L, TickClock.field_h, var11);
              var8_ref_pn.field_u.capturedTextColor = -(var12 >> 1 & 8355711) + (var12 + ((16711423 & TickClock.field_h.capturedTextColor) >> 1));
              var8_ref_pn.field_u.font = RatingTextState.field_c;
              var8_ref_pn.field_u.textColor = var12;
              var8_ref_pn.field_u.activeTextColor = var12 - (var12 >> 1 & 8355711) + ((TickClock.field_h.activeTextColor & 16711423) >> 1);
              var6 = var6 + param2;
            }
          } else {
            var8_ref_pn.field_u = null;
          }
        }
        var7Lifetime1 = 0;
        for (var8 = 0; IntrusiveDequeCursor.field_e > var8; var8++) {
          var9_ref_pn = RankingsProtocolSupport.field_e[var8];
          if (var9_ref_pn.field_u != null) {
            Js5ArchiveManager.field_b.content.addChild(-104, var9_ref_pn.field_u);
            var9_ref_pn.field_u.setBounds(var7Lifetime1, 2147483647, param3, var9_ref_pn.field_u.getContentWidth(true), param2);
            if (var9_ref_pn.field_u.pressedButton != 0) {
              var4 = var9_ref_pn;
            }
            var7Lifetime1 = var7Lifetime1 + param2;
          }
        }
        var8Lifetime1 = Js5ArchiveManager.field_b.content.height + Js5ArchiveManager.field_b.content.remainingHeight + (-var7Lifetime1 + var6);
        Js5ArchiveManager.field_b.content.height = Js5ArchiveManager.field_b.content.height - var8Lifetime1;
        Js5ArchiveManager.field_b.content.localY = Js5ArchiveManager.field_b.content.localY + var8Lifetime1;
        if (LoginEncryptionSupport.field_c) {
          Js5ArchiveManager.field_b.content.height = var7Lifetime1;
        }
        if (LoginEncryptionSupport.field_c) {
          LoginEncryptionSupport.field_c = false;
          Js5ArchiveManager.field_b.content.remainingY = 0;
          LoginTextSupport.field_b = true;
          Js5ArchiveManager.field_b.content.localY = -Js5ArchiveManager.field_b.content.height + Js5ArchiveManager.field_b.viewport.height;
        }
        if (param1 > -58) {
          field_a = 102;
        }
        Js5ArchiveManager.field_b.content.remainingHeight = -Js5ArchiveManager.field_b.content.height + var7Lifetime1;
        if (DualLinkNode.field_p &&
          null != Bzip2DecoderState.field_D) {
          LoginTextSupport.field_b = true;
        }
        var9Lifetime1 = -Js5ArchiveManager.field_b.content.remainingHeight - (Js5ArchiveManager.field_b.content.height - Js5ArchiveManager.field_b.viewport.height);
        if (LoginTextSupport.field_b) {
          Js5ArchiveManager.field_b.content.remainingY = -Js5ArchiveManager.field_b.content.localY + var9Lifetime1;
        }
        Js5ArchiveManager.field_b.updateScroll(-1207, param0 * (2 * param2), param2, true);
        stackIn_47_0 = (Js5ArchiveManager.field_b.content.localY + Js5ArchiveManager.field_b.content.remainingY == var9Lifetime1);
        LoginTextSupport.field_b = stackIn_47_0;
        return (ChatMessage) (var4);
    }

    public static void releaseStatics(int param0) {
        field_g = null;
        if (param0 >= -37) {
          field_g = (Sprite) null;
        }
        field_b = null;
        field_i = null;
        field_d = null;
    }

    final IntrusiveNode findByKey(int param0, long param1) {
        IntrusiveNode var5 = null;
        int var6 = Pool.field_O;
        if (param0 != -28010) {
          return (IntrusiveNode) null;
        }
        IntrusiveNode var4 = this.buckets[(int)(param1 & (long)(-1 + this.bucketCount))];
        this.field_e = var4.previous;
        while (this.field_e != var4) {
          if (~param1 == ~this.field_e.key) {
            var5 = this.field_e;
            this.field_e = this.field_e.previous;
            return var5;
          }
          this.field_e = this.field_e.previous;
        }
        this.field_e = null;
        return null;
    }

    IntrusiveNodeHashTable(int param0) {
        int var2 = 0;
        IntrusiveNode dupTemp$0 = null;
        IntrusiveNode var3 = null;
        this.bucketCount = param0;
        this.buckets = new IntrusiveNode[param0];
        for (var2 = 0; var2 < param0; var2++) {
          dupTemp$0 = new IntrusiveNode();
          var3 = dupTemp$0;
          this.buckets[var2] = dupTemp$0;
          var3.next = var3;
          var3.previous = var3;
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          String var3 = null;
          java.net.URL var4 = null;
          try {
            try {
              var4 = param1.getCodeBase();
              var3 = ModelInstance.a((byte) -100, var4, param1).getFile();
              JavaScriptBridge.callWindowFunctionWithArguments("updatelinks", new Object[]{"home", var3 + "home.ws"}, 98, param1);
              JavaScriptBridge.callWindowFunctionWithArguments("updatelinks", new Object[]{"gamelist", var3 + "togamelist.ws"}, 70, param1);
              JavaScriptBridge.callWindowFunctionWithArguments("updatelinks", new Object[]{"serverlist", var3 + "toserverlist.ws"}, 116, param1);
              JavaScriptBridge.callWindowFunctionWithArguments("updatelinks", new Object[]{"options", var3 + "options.ws"}, param0 ^ 558370174, param1);
              JavaScriptBridge.callWindowFunctionWithArguments("updatelinks", new Object[]{"terms", var3 + "terms.ws"}, param0 ^ 558370117, param1);
              if (param0 != 558370049) {
                field_b = (Sprite[]) null;
              }
              JavaScriptBridge.callWindowFunctionWithArguments("updatelinks", new Object[]{"privacy", var3 + "privacy.ws"}, 125, param1);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref;
            stackIn_8_1 = new StringBuilder().append("uk.G(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_f = 0;
        field_m = 0;
        field_a = 1 << field_f;
        field_j = -1;
        field_c = false;
    }
}
