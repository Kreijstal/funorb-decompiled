/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj {
    static int[] field_a;
    static int field_b;
    static IndexedSprite[] field_f;
    static String field_c;
    static String field_e;
    static int field_d;
    static int[] field_g;

    final static void composeAgreementText(int param0) {
        int var1 = -65 / ((param0 + 81) / 41);
        qj.field_i = PasswordFieldPainter.field_C + " <b>" + AccountRegistrationPanel.field_R + "</b> " + NameSuggestionsPanel.field_G + " <b>" + ki.field_t + "</b> " + we.field_d + "<br>" + "<br>" + ClientException.field_f;
    }

    final static void drawModel(int param0, int param1, int param2, int param3, MeshModel param4, int param5, int param6, int param7) {
        int stackIn_15_0 = 0;
        int[] stackIn_17_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        gl stackIn_37_0 = null;
        int stackIn_42_0 = 0;
        int stackIn_46_0 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var8 = null;
        RuntimeException var8_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        gl var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        int var44 = 0;
        MeshModel var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        byte[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var14Lifetime2;
        int var15Lifetime2;
        var40 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var45 = param4;
          if (var45.field_H != null &&
            1 < var45.field_F) {
            var61 = var45.field_H;
            SceneWidgetNode.a(var61, false, SpriteState.field_s, 0, 0);
          } else {
            CameraFollowTarget.a((byte) 91);
          }
          var55 = new int[param4.field_A];
          var50 = var55;
          var41 = var50;
          var8 = var41;
          var65 = new int[param4.field_A];
          var64 = GameAppletShell.field_k;
          var63 = Battle.field_Lb;
          var62 = mf.field_b;
          for (var13 = 0; param4.field_A > var13; var13++) {
            var14 = var62[var13] * param5 + var63[var13] * param0 + var64[var13] * param6 >> 8;
            if (var14 < 0) {
              var14 = -var14;
            }
            if (0 <= var14) {
              if (var14 < 128) {
                stackIn_15_0 = var14 + 128;
              } else {
                stackIn_15_0 = 256;
              }
            } else {
              stackIn_15_0 = 128;
            }
            var14Lifetime2 = stackIn_15_0;
            var15 = param2 * var64[var13] - (-(param1 * var63[var13]) - var62[var13] * param7) >> 8;
            stackIn_17_0 = vf.field_n;
            if (var15 < 0) {
              stackIn_18_1 = -var15;
            } else {
              stackIn_18_1 = var15;
            }
            var15Lifetime2 = stackIn_17_0[stackIn_18_1];
            var14Lifetime2 = var14Lifetime2 * (256 - var15Lifetime2) >>> 8;
            var55[var13] = var14Lifetime2;
            var65[var13] = var15Lifetime2;
          }
          var44 = 0;
          var13Lifetime1 = var44;
          while (CameraFollowTarget.field_i > var44) {
            var14Lifetime1 = ChatInputWidget.field_Lb[var44];
            var15Lifetime1 = param4.field_U[var14Lifetime1];
            var16 = param4.field_T[var14Lifetime1];
            var17 = param4.field_O[var14Lifetime1];
            if (param4.field_w[var14Lifetime1] < GameAppletShell.field_k.length) {
              stackIn_24_0 = param4.field_w[var14Lifetime1];
            } else {
              stackIn_24_0 = -1;
            }
            var18 = stackIn_24_0;
            if (GameAppletShell.field_k.length > param4.field_q[var14Lifetime1]) {
              stackIn_27_0 = param4.field_q[var14Lifetime1];
            } else {
              stackIn_27_0 = -1;
            }
            var19 = stackIn_27_0;
            if (param4.field_u[var14Lifetime1] >= GameAppletShell.field_k.length) {
              stackIn_30_0 = -1;
            } else {
              stackIn_30_0 = param4.field_u[var14Lifetime1];
            }
            var20 = stackIn_30_0;
            if (ph.field_e != null &&
              param4.field_z != null &&
              var14Lifetime1 < param4.field_z.length &&
              param4.field_z[var14Lifetime1] != -1 &&
              ph.field_e.length > param4.field_z[var14Lifetime1]) {
              stackIn_37_0 = ph.field_e[param4.field_z[var14Lifetime1]];
            } else {
              stackIn_37_0 = null;
            }
            var21 = stackIn_37_0;
            var22 = GameApplet.field_p[var15Lifetime1];
            var23 = ViewportController.field_g[var15Lifetime1];
            var24 = GameApplet.field_p[var16];
            var25 = ViewportController.field_g[var16];
            var26 = GameApplet.field_p[var17];
            var27 = ViewportController.field_g[var17];
            if (var18 == var19 &&
              var19 == var20) {
              var28 = var55[var18];
              var29 = var65[var18];
              if (var21 == null) {
                stackIn_42_0 = 8355711;
              } else {
                stackIn_42_0 = var21.field_e;
              }
              var30 = stackIn_42_0;
              var31 = var30 & 16711935;
              var32 = var30 & 65280;
              var33 = (16711781 & var32 * var28) >>> 8 | (-16711761 & var28 * var31) >>> 8;
              var33 = var33 + var29 * 65793;
              c.fillTriangle(var25, 83, (var33 & 16711422) >> 1, var23, var22, var27, var24, var26);
            } else {
              var28 = var55[var18];
              var29 = var55[var19];
              var30 = var55[var20];
              var31 = var65[var18];
              var32 = var65[var19];
              var33 = var65[var20];
              if (var21 == null) {
                stackIn_46_0 = 8355711;
              } else {
                stackIn_46_0 = var21.field_e;
              }
              var34 = stackIn_46_0;
              var35 = var34 & 16711935;
              var36 = 65280 & var34;
              var37 = var28 * var36 >>> 8 & -100598016 | var35 * var28 >>> 8 & -755040001;
              var38 = var29 * var35 >>> 8 & -721485569 | var29 * var36 >>> 8 & 1778450176;
              var38 = var38 + var32 * 65793;
              var39 = -989921025 & var35 * var30 >>> 8 | (var36 * var30 & 16711858) >>> 8;
              var37 = var37 + 65793 * var31;
              var39 = var39 + var33 * 65793;
              tn.drawMeshQuad(255 & var37 >> 8, var24, 255 & var38 >> 8, var23, -109, var37 >> 16, var27, var38 >> 16, 255 & var37, var22, var39 >> 16, var25, var26, (var39 & 65321) >> 8, 255 & var39, 255 & var38);
            }
            var44++;
          }
          if (param3 != 20133) {
            field_b = -66;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_53_0 = var8_ref;
          stackIn_53_1 = new StringBuilder().append("cj.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    public static void releaseStatics(boolean param0) {
        if (!param0) {
          field_f = (IndexedSprite[]) null;
        }
        field_f = null;
        field_c = null;
        field_g = null;
        field_a = null;
        field_e = null;
    }

    final static void drawModalDimOverlay(int param0) {
        if (param0 < -98) {
          if (oj.field_i) {
            SoftwareRasterizer.darkenRectangle(SoftwareRasterizer.field_i, SoftwareRasterizer.field_c, SoftwareRasterizer.field_h - SoftwareRasterizer.field_i, SoftwareRasterizer.field_k - SoftwareRasterizer.field_c);
            co.field_f.drawFullScreen(false, true);
          }
          return;
        }
    }

    final static int submitAccountCreationRequest(boolean param0, byte param1, int param2, ConditionalTextValue param3, int param4, ConditionalTextValue param5, String param6) {
        int var12 = 0;
        int stackIn_6_0 = 0;
        PacketBuffer stackIn_18_0 = null;
        String stackIn_19_1 = null;
        PacketBuffer stackIn_21_0 = null;
        String stackIn_22_1 = null;
        int stackIn_36_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_64_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var13 = 0;
        MeshModel var14 = null;
        String var15 = null;
        Object var16 = null;
        CharSequence var17 = null;
        String var11_ref_StringLifetime1;
        String var11_ref_StringLifetime2;
        String var11_ref_StringLifetime3;
        String var11_ref_StringLifetime4;
        int var10Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        var16 = null;
        var13 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var15 = param5.getText(85);
          var11_ref_String = var15;
          var11_ref_StringLifetime1 = var15;
          var8 = param3.getText(-68);
          var11_ref_StringLifetime2 = var8;
          var11_ref_StringLifetime3 = var8;
          if (CredentialKind.field_c == null &&
            !ie.a(-89, false)) {
            stackIn_6_0 = -1;
            return stackIn_6_0;
          }
          if (param1 != -91) {
            var14 = (MeshModel) null;
            cj.drawModel(-75, -92, 61, -80, (MeshModel) null, 40, 3, -5);
          }
          if (ResizableModalPanel.field_eb == pc.field_g) {
            kj.field_e = null;
            he.field_e.position = 0;
            if (param6 == null) {
              NodeHashTableIterator.field_a.position = 0;
              NodeHashTableIterator.field_a.writeInt(TextButton.field_D.nextInt(), (byte) -101);
              NodeHashTableIterator.field_a.writeInt(TextButton.field_D.nextInt(), (byte) -101);
              stackIn_18_0 = NodeHashTableIterator.field_a;
              if (param5.isEnabled(true)) {
                stackIn_19_1 = var15;
              } else {
                stackIn_19_1 = "";
              }
              ((PacketBuffer) (Object) stackIn_18_0).writeVersionedString(stackIn_19_1, (byte) -115);
              stackIn_21_0 = NodeHashTableIterator.field_a;
              if (param3.isEnabled(true)) {
                stackIn_22_1 = var8;
              } else {
                stackIn_22_1 = "";
              }
              ((PacketBuffer) (Object) stackIn_21_0).writeVersionedString(stackIn_22_1, (byte) -92);
              he.field_e.writeByte(16, (byte) -75);
              he.field_e.position = he.field_e.position + 1;
              var9 = he.field_e.position;
              TextLine.a(false, he.field_e, IconTextSceneWidget.field_Jb, NodeHashTableIterator.field_a, DropTargetWidget.field_K);
              he.field_e.writeByteLengthAtMark(he.field_e.position - var9, (byte) 43);
            } else {
              var9 = 0;
              NodeHashTableIterator.field_a.position = 0;
              if (param0) {
                var9 = var9 | 1;
              }
              NodeHashTableIterator.field_a.writeInt(TextButton.field_D.nextInt(), (byte) -101);
              NodeHashTableIterator.field_a.writeInt(TextButton.field_D.nextInt(), (byte) -101);
              NodeHashTableIterator.field_a.writeVersionedString(var15, (byte) -100);
              NodeHashTableIterator.field_a.writeVersionedString(var8, (byte) -96);
              var17 = (CharSequence) ((Object) param6);
              NodeHashTableIterator.field_a.writeVersionedString(vl.a((byte) 106, var17), (byte) -92);
              NodeHashTableIterator.field_a.writeShort(param4, (byte) -73);
              NodeHashTableIterator.field_a.writeByte(param2, (byte) -118);
              NodeHashTableIterator.field_a.writeByte(var9, (byte) -62);
              he.field_e.writeByte(18, (byte) -114);
              he.field_e.position = he.field_e.position + 2;
              var10 = he.field_e.position;
              var11_ref_StringLifetime4 = SecondaryNodeDeque.getSettingsCookie(IconButtonPainter.getApplet(121), param1 ^ 32);
              if (var11_ref_StringLifetime4 == null) {
                var11_ref_StringLifetime4 = "";
              }
              he.field_e.writeString(var11_ref_StringLifetime4, 23333);
              TextLine.a(false, he.field_e, IconTextSceneWidget.field_Jb, NodeHashTableIterator.field_a, DropTargetWidget.field_K);
              he.field_e.writeShortLengthAtMark(he.field_e.position - var10, -19571);
            }
            we.a(-1, (byte) 113);
            ResizableModalPanel.field_eb = sb.field_f;
          }
          if (ResizableModalPanel.field_eb == sb.field_f &&
            ContextActionMenu.hasIncomingBytes((byte) -86, 1)) {
            var9Lifetime1 = UiContainer.field_z.readUnsignedByte((byte) 56);
            UiContainer.field_z.position = 0;
            if (var9Lifetime1 >= 100 &&
              var9Lifetime1 <= 105) {
              ResizableModalPanel.field_eb = TextHotspotWidget.field_R;
              Bzip2State.field_M = new String[-100 + var9Lifetime1];
            } else {
              if (var9Lifetime1 == 248) {
                UiContainer.a(1, IconButtonPainter.getApplet(param1 ^ -40));
                MenuButtonPanel.field_E = fo.field_c;
                ProxySocketConnector.closeActiveConnection(false);
                bb.field_h = false;
                stackIn_36_0 = var9Lifetime1;
                return stackIn_36_0;
              }
              if (99 != var9Lifetime1) {
                ResizableModalPanel.field_eb = NodeHashTable.field_i;
                fj.field_h = -1;
                on.field_g = var9Lifetime1;
              } else {
                ContextActionMenu.hasIncomingBytes((byte) -86, oi.b(88));
                kj.field_e = new Boolean(jo.readByteMatches(UiContainer.field_z, param1 + 89));
                UiContainer.field_z.position = 0;
              }
            }
          }
          if (ResizableModalPanel.field_eb == TextHotspotWidget.field_R) {
            var9Lifetime2 = 2;
            if (ContextActionMenu.hasIncomingBytes((byte) -86, var9Lifetime2)) {
              var10Lifetime1 = UiContainer.field_z.readUnsignedShort(-98);
              UiContainer.field_z.position = 0;
              if (ContextActionMenu.hasIncomingBytes((byte) -86, var10Lifetime1)) {
                var11 = Bzip2State.field_M.length;
                for (var12 = 0; var11 > var12; var12++) {
                  Bzip2State.field_M[var12] = UiContainer.field_z.readVersionedString(-32461);
                }
                ProxySocketConnector.closeActiveConnection(false);
                bb.field_h = false;
                stackIn_45_0 = var11 + 100;
                return stackIn_45_0;
              }
            }
          }
          if (ResizableModalPanel.field_eb == NodeHashTable.field_i &&
            pn.b(-12564)) {
            if (on.field_g != 255) {
              MenuButtonPanel.field_E = UiContainer.field_z.readString(param1 + 90);
            } else {
              var9_ref_String = UiContainer.field_z.readOptionalString(-112);
              if (var9_ref_String != null) {
                NodeHashTableIterator.setSettingsCookie(var9_ref_String, IconButtonPainter.getApplet(110), 0);
              }
            }
            ProxySocketConnector.closeActiveConnection(false);
            bb.field_h = false;
            stackIn_54_0 = on.field_g;
            return stackIn_54_0;
          }
          if (null == CredentialKind.field_c) {
            if (bb.field_h) {
              if (rk.a(-78) <= 30000L) {
                MenuButtonPanel.field_E = NumericDateInputWidget.field_R;
              } else {
                MenuButtonPanel.field_E = DualLinkDeque.field_a;
              }
              bb.field_h = false;
              stackIn_61_0 = 249;
              return stackIn_61_0;
            }
            var9Lifetime3 = ng.field_G;
            ng.field_G = SceneTextInput.field_Lb;
            SceneTextInput.field_Lb = var9Lifetime3;
            bb.field_h = true;
          }
          stackIn_64_0 = -1;
          return stackIn_64_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_67_0 = var7;
          stackIn_67_1 = new StringBuilder().append("cj.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          stackIn_70_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',');
          if (param6 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(')').toString());
        }
    }

    static {
        field_c = "Show lobby chat from my friends";
        field_a = new int[]{24, 25, 26};
        field_e = "This password is part of your Player Name, and would be easy to guess";
    }
}
