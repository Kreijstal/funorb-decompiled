/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk extends hv {
    private n field_Z;
    private RgbSprite field_Y;
    private int field_U;
    static String field_S;
    static int field_X;
    static String field_W;
    static int[][] field_T;
    static String field_V;
    private String field_L;

    final String h(int param0) {
        if (param0 == 21384) {
          return null;
        }
        this.field_U = -103;
        return null;
    }

    final static int a(byte[] param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -73 / ((param2 - 55) / 56);
          stackIn_1_0 = ClientUiNode.a(param1, param0, 0, -8779);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("pk.O(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    pk(n param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, ji.a(true));
        try {
          this.field_Z = param0;
          this.field_L = param1;
          this.setBounds(param2, param4, param3, 8192, param5);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "pk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        String var5;
        gu var6;
        int var13;
        pm var8;
        int var9;
        int var10;
        int var11;
        int var12;
        RgbSprite var14;
        RgbSprite var15;
        RgbSprite var16;
        RgbSprite var17;
        RgbSprite var18;
        int var11Lifetime1;
        int var12Lifetime1;
        gu var6Lifetime1;
        var13 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var6 = this.field_Z.a(false);
        if (ad.field_K != var6 &&
          var6 != so.field_e) {
          var5 = this.field_Z.a((byte) 55);
          if (var5 == null) {
            var5 = this.field_L;
          }
        } else {
          var5 = gt.field_h;
        }
        if (!var5.equals(this.field_v)) {
          this.field_v = var5;
          this.a(-128);
        }
        super.a(param0, param1, (byte) -114, param3);
        if (param2 > -82) {
          field_W = (String) null;
        }
        var6Lifetime1 = this.field_Z.a(false);
        var8 = (pm) ((Object) this.painter);
        var9 = param0 + this.x;
        var10 = var8.a(-18033, param1, (Widget) (this)) + (var8.a(-69, (Widget) (this)).a((byte) 27) >> 1);
        if (var6Lifetime1 == ad.field_K) {
          var18 = db.field_a[0];
          var11 = var18.canvasWidth << 1;
          var12 = var18.canvasHeight << 1;
          if (this.field_Y == null) {
            this.field_Y = new RgbSprite(var11, var12);
            CombatSandbox.a(this.field_Y, 3);
          } else {
            if (this.field_Y.pixelWidth < var11) {
              this.field_Y = new RgbSprite(var11, var12);
              CombatSandbox.a(this.field_Y, 3);
            } else {
              if (var12 > this.field_Y.pixelHeight) {
                this.field_Y = new RgbSprite(var11, var12);
                CombatSandbox.a(this.field_Y, 3);
              } else {
                CombatSandbox.a(this.field_Y, 3);
                SoftwareRaster.b();
              }
            }
          }
          var18.b(112, 144, var18.canvasWidth << 4, var18.canvasHeight << 4, -this.field_U << 10, 4096);
          QuickChatPhraseRepository.b(-18862);
          this.field_Y.f(var9 - (var18.canvasWidth >> 1), -var18.canvasHeight + var10, 256);
          return;
        }
        if (so.field_e != var6Lifetime1) {
          if (var6Lifetime1 == rn.field_e) {
            var16 = db.field_a[2];
            var16.f(var9, -(var16.pixelHeight >> 1) + var10, 256);
            return;
          }
          if (var6Lifetime1 != oo.field_g) {
            return;
          }
          var15 = db.field_a[1];
          var15.f(var9, -(var15.pixelHeight >> 1) + var10, 256);
          return;
        }
        var17 = db.field_a[0];
        var14 = var17;
        var11Lifetime1 = var17.canvasWidth << 1;
        var12Lifetime1 = var17.canvasHeight << 1;
        if (this.field_Y == null) {
          this.field_Y = new RgbSprite(var11Lifetime1, var12Lifetime1);
          CombatSandbox.a(this.field_Y, 3);
        } else {
          if (this.field_Y.pixelWidth < var11Lifetime1) {
            this.field_Y = new RgbSprite(var11Lifetime1, var12Lifetime1);
            CombatSandbox.a(this.field_Y, 3);
          } else {
            if (var12Lifetime1 > this.field_Y.pixelHeight) {
              this.field_Y = new RgbSprite(var11Lifetime1, var12Lifetime1);
              CombatSandbox.a(this.field_Y, 3);
            } else {
              CombatSandbox.a(this.field_Y, 3);
              SoftwareRaster.b();
            }
          }
        }
        var17.b(112, 144, var17.canvasWidth << 4, var17.canvasHeight << 4, -this.field_U << 10, 4096);
        QuickChatPhraseRepository.b(-18862);
        this.field_Y.f(var9 - (var17.canvasWidth >> 1), -var17.canvasHeight + var10, 256);
        return;
    }

    final boolean a(int param0, Widget param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 11) {
            pk.a(56, -104, -60, 38, -92, -10, 85, -99);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("pk.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = CampaignMenuEntry.field_u[param3];
        if (11 == var8) {
          var8 = 7;
        }
        if (param5 != -29403) {
          return;
        }
        if (var8 == 0) {
          return;
        }
        if (7 == var8) {
          return;
        }
        if (var8 == 9) {
          var8 = 2;
        }
        j.field_b = var8;
        SpellConfirmationDialog.field_e = var8;
        rq.field_m = var8;
        ContextActionMenu.field_Wb = var8;
        oh.field_E = var8;
        pv.field_b = var8;
        cs.field_Y = var8;
        gt.field_i = var8;
        QuickChatCategory.field_z = var8;
        int var9 = 0 < param2 ? 1 : 0;
        int var10 = param2 < ResourceRequest.field_y - 1 ? 1 : 0;
        if (param1 <= 0) {
          if (var9 != 0) {
            cs.field_Y = CampaignMenuEntry.field_u[-1 + param3];
          }
          if (var10 != 0) {
            SpellConfirmationDialog.field_e = CampaignMenuEntry.field_u[param3 + 1];
            var8 = var8 * 20;
            if (-1 + ef.field_c > param1) {
              if (var9 != 0) {
                oh.field_E = CampaignMenuEntry.field_u[-1 + (param3 + ResourceRequest.field_y)];
              }
              QuickChatCategory.field_z = CampaignMenuEntry.field_u[ResourceRequest.field_y + param3];
              gt.field_i = CampaignMenuEntry.field_u[1 + (ResourceRequest.field_y + param3)];
            }
            ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, SpellConfirmationDialog.field_e, -83) + (0 + var8)].b(param7, param0, param6, param4);
            ac.field_k[ls.a(ContextActionMenu.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
            ac.field_k[ls.a(gt.field_i, j.field_b, QuickChatCategory.field_z, SpellConfirmationDialog.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
            ac.field_k[ls.a(oh.field_E, j.field_b, QuickChatCategory.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
            return;
          }
          var8 = var8 * 20;
          if (-1 + ef.field_c <= param1) {
            ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, SpellConfirmationDialog.field_e, -83) + (0 + var8)].b(param7, param0, param6, param4);
            ac.field_k[ls.a(ContextActionMenu.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
            ac.field_k[ls.a(gt.field_i, j.field_b, QuickChatCategory.field_z, SpellConfirmationDialog.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
            ac.field_k[ls.a(oh.field_E, j.field_b, QuickChatCategory.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
            return;
          }
          if (var9 != 0) {
            oh.field_E = CampaignMenuEntry.field_u[-1 + (param3 + ResourceRequest.field_y)];
            QuickChatCategory.field_z = CampaignMenuEntry.field_u[ResourceRequest.field_y + param3];
            ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, SpellConfirmationDialog.field_e, -83) + (0 + var8)].b(param7, param0, param6, param4);
            ac.field_k[ls.a(ContextActionMenu.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
            ac.field_k[ls.a(gt.field_i, j.field_b, QuickChatCategory.field_z, SpellConfirmationDialog.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
            ac.field_k[ls.a(oh.field_E, j.field_b, QuickChatCategory.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
            return;
          }
          QuickChatCategory.field_z = CampaignMenuEntry.field_u[ResourceRequest.field_y + param3];
          ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, SpellConfirmationDialog.field_e, -83) + (0 + var8)].b(param7, param0, param6, param4);
          ac.field_k[ls.a(ContextActionMenu.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
          ac.field_k[ls.a(gt.field_i, j.field_b, QuickChatCategory.field_z, SpellConfirmationDialog.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
          ac.field_k[ls.a(oh.field_E, j.field_b, QuickChatCategory.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
          return;
        }
        if (var9 != 0) {
          ContextActionMenu.field_Wb = CampaignMenuEntry.field_u[param3 + (-ResourceRequest.field_y - 1)];
        }
        pv.field_b = CampaignMenuEntry.field_u[-ResourceRequest.field_y + param3];
        if (var10 == 0) {
          if (var9 != 0) {
            cs.field_Y = CampaignMenuEntry.field_u[-1 + param3];
          }
          var8 = var8 * 20;
          if (-1 + ef.field_c <= param1) {
            ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, SpellConfirmationDialog.field_e, -83) + (0 + var8)].b(param7, param0, param6, param4);
            ac.field_k[ls.a(ContextActionMenu.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
            ac.field_k[ls.a(gt.field_i, j.field_b, QuickChatCategory.field_z, SpellConfirmationDialog.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
            ac.field_k[ls.a(oh.field_E, j.field_b, QuickChatCategory.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
            return;
          }
          if (var9 != 0) {
            oh.field_E = CampaignMenuEntry.field_u[-1 + (param3 + ResourceRequest.field_y)];
            QuickChatCategory.field_z = CampaignMenuEntry.field_u[ResourceRequest.field_y + param3];
            ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, SpellConfirmationDialog.field_e, -83) + (0 + var8)].b(param7, param0, param6, param4);
            ac.field_k[ls.a(ContextActionMenu.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
            ac.field_k[ls.a(gt.field_i, j.field_b, QuickChatCategory.field_z, SpellConfirmationDialog.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
            ac.field_k[ls.a(oh.field_E, j.field_b, QuickChatCategory.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
            return;
          }
          QuickChatCategory.field_z = CampaignMenuEntry.field_u[ResourceRequest.field_y + param3];
          ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, SpellConfirmationDialog.field_e, -83) + (0 + var8)].b(param7, param0, param6, param4);
          ac.field_k[ls.a(ContextActionMenu.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
          ac.field_k[ls.a(gt.field_i, j.field_b, QuickChatCategory.field_z, SpellConfirmationDialog.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
          ac.field_k[ls.a(oh.field_E, j.field_b, QuickChatCategory.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
          return;
        }
        rq.field_m = CampaignMenuEntry.field_u[-ResourceRequest.field_y + (param3 + 1)];
        if (var9 != 0) {
          cs.field_Y = CampaignMenuEntry.field_u[-1 + param3];
        }
        SpellConfirmationDialog.field_e = CampaignMenuEntry.field_u[param3 + 1];
        var8 = var8 * 20;
        if (-1 + ef.field_c > param1) {
          if (var9 != 0) {
            oh.field_E = CampaignMenuEntry.field_u[-1 + (param3 + ResourceRequest.field_y)];
          }
          QuickChatCategory.field_z = CampaignMenuEntry.field_u[ResourceRequest.field_y + param3];
          gt.field_i = CampaignMenuEntry.field_u[1 + (ResourceRequest.field_y + param3)];
        }
        ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, SpellConfirmationDialog.field_e, -83) + (0 + var8)].b(param7, param0, param6, param4);
        ac.field_k[ls.a(ContextActionMenu.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
        ac.field_k[ls.a(gt.field_i, j.field_b, QuickChatCategory.field_z, SpellConfirmationDialog.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
        ac.field_k[ls.a(oh.field_E, j.field_b, QuickChatCategory.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
        return;

    }

    public static void c(boolean param0) {
        field_S = null;
        field_W = null;
        field_T = (int[][]) null;
        if (param0) {
          field_W = (String) null;
          field_V = null;
          return;
        }
        field_V = null;
    }

    final void a(int param0, int param1, int param2, Widget param3) {
        try {
          this.field_U = this.field_U + 1;
          super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "pk.P(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_T = new int[][]{new int[]{150, 150}, new int[]{300, 150}, new int[]{50, 150}, new int[]{150, 150}, new int[]{425, 450}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{50, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{450, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{250, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{50, 150}, new int[]{300, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{50, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{250, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{400, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{0, 150}, new int[]{100, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{250, 150}, new int[]{100, 150}, new int[]{150, 150}, new int[]{250, 150}, new int[]{150, 150}, new int[]{20, 150}, new int[]{150, 150}, new int[]{50, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{5, 150}, new int[]{150, 150}, new int[]{40, 150}, new int[]{150, 150}, new int[]{400, 450}, new int[]{380, 380}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{425, 450}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 165}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}};
        field_S = "Only show lobby chat from my friends";
        field_W = "Invite <%0> to this game";
        field_V = "You are not currently logged in to the game.";
        field_X = 0;
    }
}
