/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SphinxActionRequest extends ActionRequest {
    private int sphinxY;
    static int[] field_x;
    private int sphinxX;
    static je field_A;
    private ActionRequest delegatedRequest;
    static gk field_v;

    final static void a(int param0, byte param1) {
        int var3 = 0;
        bj var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var4 = (bj) (ArchiveIndex.field_o.first((byte) 121));
          while (var4 != null) {
            te.a(param0, var4, -17006);
            var4 = (bj) (ArchiveIndex.field_o.next((byte) 123));
          }
          if (param1 <= 33) {
            field_v = (gk) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ee.I(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(IndexedSprite[] param0, ResourceArchive param1, int param2, int[] param3, ResourceArchive param4) {
        RgbSprite[] dupTemp$0 = null;
        RgbSprite[] dupTemp$1 = null;
        RgbSprite[] dupTemp$2 = null;
        RgbSprite[] dupTemp$3 = null;
        IndexedSprite[] var5 = null;
        IndexedSprite[] var6 = null;
        int[] var6_array = null;
        int var7_int = 0;
        int var18 = 0;
        int[] var19 = null;
        IndexedSprite[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        tu var7 = null;
        je var8 = null;
        je var9 = null;
        je var10 = null;
        je var11 = null;
        RgbSprite[] var12 = null;
        RgbSprite[] var13 = null;
        RgbSprite[] var14 = null;
        je var15 = null;
        RgbSprite[] var16 = null;
        RgbSprite[] var17 = null;
        int var7_intLifetime1;
        int var7_intLifetime2;
        int var7_intLifetime3;
        var18 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var20 = MapLayout.a("crowns", -28106, "lobby", param1);
          var5 = var20;
          PacketBuffer.field_n = var20.length;
          if (param0 != null) {
            var6 = new IndexedSprite[param0.length + PacketBuffer.field_n];
            for (var7_int = 0; var7_int < PacketBuffer.field_n; var7_int++) {
              var6[var7_int] = var20[var7_int];
            }
            for (var7_intLifetime3 = 0; var7_intLifetime3 < param0.length; var7_intLifetime3++) {
              var6[var7_intLifetime3 + PacketBuffer.field_n] = param0[var7_intLifetime3];
            }
            var5 = var6;
          }
          var23 = new int[var5.length];
          var21 = var23;
          var19 = var21;
          var24 = var19;
          var22 = var24;
          var6_array = var22;
          for (var7_intLifetime1 = 0; PacketBuffer.field_n > var7_intLifetime1; var7_intLifetime1++) {
            var23[var7_intLifetime1] = 10;
          }
          if (param0 != null) {
            if (param3 != null) {
              for (var7_intLifetime2 = 0; param0.length > var7_intLifetime2; var7_intLifetime2++) {
                var6_array[PacketBuffer.field_n + var7_intLifetime2] = param3[var7_intLifetime2];
              }
            } else {
              for (var7_intLifetime2 = 0; var7_intLifetime2 < param0.length; var7_intLifetime2++) {
                var6_array[var7_intLifetime2 + PacketBuffer.field_n] = param0[var7_intLifetime2].canvasHeight;
              }
            }
          }
          gl.field_c = 2;
          is.field_b = 11;
          mi.field_l = 4;
          io.field_n = 2;
          jn.field_d = 15;
          var7 = gs.a("lobby", param1, param4, (byte) -53, "largefont");
          t.field_a = gs.a("lobby", param1, param4, (byte) -53, "generalfont");
          LeaderEscortCondition.field_f = gs.a("lobby", param1, param4, (byte) -53, "chatfont");
          var7.a(var5, var24);
          t.field_a.a(var5, var24);
          LeaderEscortCondition.field_f.a(var5, var24);
          var8 = new je(0L, (je) null);
          var8.field_Z = (BitmapFont) ((Object) var7);
          var8.field_N = 16777215;
          var8.field_pb = jn.field_d;
          var8.field_Fb = 1;
          var9 = var8;
          var9.field_Eb = 1;
          var10 = new je(0L, (je) null);
          var10.field_N = 16777215;
          var10.field_Z = (BitmapFont) ((Object) t.field_a);
          var10.field_pb = jn.field_d;
          var10.field_Fb = 1;
          var11 = var10;
          var11.field_Eb = 1;
          SummonAction.field_y = new je(0L, var8);
          SummonAction.field_y.field_G = wj.a(-12310, fk.a("heading", (byte) -126, param1, "lobby"));
          im.field_x = new je(0L, (je) null);
          im.field_x.field_G = jq.a(false, 4210752, -20600, 120, false, 8421504);
          qc.field_e = new je(0L, (je) null);
          qc.field_e.field_G = tq.a(6316128, false, 114, 1, 3, 6316128);
          kq.field_N = new je(0L, (je) null);
          kq.field_N.field_G = wj.a(-12310, fk.a("popup", (byte) -127, param1, "lobby"));
          var12 = wj.a(-12310, fk.a("popup_mouseover", (byte) -124, param1, "lobby"));
          var13 = fk.a("button", (byte) -125, param1, "lobby");
          var14 = wj.a(-12310, fk.a("tab_active", (byte) -124, param1, "lobby"));
          UnitModelPreview.field_m = new je(0L, var8);
          UnitModelPreview.field_m.field_G = var14;
          uc.field_b = new je(0L, (je) null);
          uc.field_b.field_cb = GameplayController.a("closebutton", (byte) 51, "lobby", param1);
          uc.field_b.field_vb = GameplayController.a("closebutton_mouseover", (byte) 51, "lobby", param1);
          rn.field_a = new je(0L, var8);
          rn.field_a.field_G = jq.a(true, 2039583, -20600, 40, true, 3815994);
          te.field_p = new je(0L, var10);
          te.field_p.field_O = 2;
          te.field_p.field_G = jq.a(true, 2039583, -20600, 30, false, 3815994);
          CampaignResult.field_a = new je(0L, var10);
          CampaignResult.field_a.field_O = 2;
          CampaignResult.field_a.field_G = jq.a(false, 2039583, -20600, 30, false, 3815994);
          br.field_e = new je(0L, var10);
          br.field_e.field_O = 2;
          br.field_e.field_G = jq.a(false, 2039583, -20600, 30, true, 3815994);
          eq.field_h = new je(0L, (je) null);
          eq.field_h.field_Z = (BitmapFont) ((Object) t.field_a);
          eq.field_h.field_pb = jn.field_d;
          eq.field_h.field_Fb = 1;
          eq.field_h.field_N = 13421772;
          DualLinkedNode.field_k = new je(0L, eq.field_h);
          DualLinkedNode.field_k.field_wb = 16777215;
          DualLinkedNode.field_k.field_L = 8421504;
          DualLinkedNode.field_k.field_N = 16764006;
          DualLinkedNode.field_k.field_T = 16777215;
          if (param2 >= -38) {
            field_v = (gk) null;
          }
          DualLinkedNode.field_k.field_W = 16777215;
          var15 = new je(0L, DualLinkedNode.field_k);
          var15.field_pb = jn.field_d;
          var15.field_N = 16777215;
          var15.field_Z = (BitmapFont) ((Object) var7);
          ke.field_e = new je(0L, eq.field_h);
          ke.field_e.field_G = jq.a(false, 2236962, -20600, 16, false, 2236962);
          ke.field_e.field_O = 2;
          fp.field_Lb = new je(0L, eq.field_h);
          fp.field_Lb.field_G = jq.a(false, 1513239, -20600, 16, false, 1513239);
          fp.field_Lb.field_O = 2;
          ws.field_P = new je(0L, ke.field_e);
          ws.field_P.a(0, DualLinkedNode.field_k);
          IsaacRandom.field_i = new je(0L, fp.field_Lb);
          IsaacRandom.field_i.a(0, DualLinkedNode.field_k);
          var16 = fk.a("button_mouseover", (byte) -128, param1, "lobby");
          AnimationSequence.field_h = new np(kq.field_N, var12, eq.field_h, DualLinkedNode.field_k, 3, 2, io.field_n, 3, jn.field_d);
          lu.field_u = new je(0L, DualLinkedNode.field_k);
          lu.field_u.field_G = var13;
          lu.field_u.field_Bb = 1;
          lu.field_u.field_tb = 1;
          lu.field_u.field_B = 1;
          lu.field_u.field_R = 1;
          lu.field_u.field_mb = var16;
          lu.field_u.field_U = fk.a("button_mouseheld", (byte) -127, param1, "lobby");
          lu.field_u.field_H = fk.a("button_active", (byte) -124, param1, "lobby");
          lu.field_u.field_A = fk.a("button_disabled", (byte) -126, param1, "lobby");
          lu.field_u.field_Eb = 1;
          h.field_d = new je(0L, DualLinkedNode.field_k);
          h.field_d.field_Eb = 1;
          h.field_d.field_G = wj.a(-12310, fk.a("tab_inactive", (byte) -127, param1, "lobby"));
          h.field_d.field_mb = wj.a(-12310, fk.a("tab_mouseover", (byte) -124, param1, "lobby"));
          h.field_d.field_H = var14;
          wm.field_c = new je(0L, (je) null);
          wm.field_c.field_G = tq.a(1856141, false, 206, -1, 3, 1127256);
          sh.field_m = new je(0L, (je) null);
          sh.field_m.field_G = tq.a(11579568, false, 290, -1, 3, 6052956);
          nd.field_a = new je(0L, var15);
          nd.field_a.field_Eb = 1;
          nd.field_a.field_Bb = 1;
          nd.field_a.field_B = 1;
          nd.field_a.field_R = 1;
          nd.field_a.field_tb = 1;
          bw.field_h = new je(0L, nd.field_a);
          je.field_Q = new je(0L, DualLinkedNode.field_k);
          je.field_Q.field_R = 1;
          je.field_Q.field_Bb = 1;
          je.field_Q.field_tb = 1;
          je.field_Q.field_B = 1;
          je.field_Q.field_Eb = 1;
          rf.field_d = new je(0L, je.field_Q);
          pt.field_X = new je(0L, je.field_Q);
          kd.field_M = new je(0L, nd.field_a);
          rd.field_e = new je(0L, je.field_Q);
          PreparedAction.field_o = new je(0L, je.field_Q);
          eb.field_a = new je(0L, je.field_Q);
          je.field_Q.field_G = wj.a(-12310, fk.a("smallbutton", (byte) -128, param1, "lobby"));
          je.field_Q.field_mb = wj.a(-12310, fk.a("smallbutton_mouseover", (byte) -125, param1, "lobby"));
          dupTemp$0 = wj.a(-12310, fk.a("smallbutton_active", (byte) -124, param1, "lobby"));
          je.field_Q.field_H = dupTemp$0;
          je.field_Q.field_U = dupTemp$0;
          je.field_Q.field_A = wj.a(-12310, fk.a("smallbutton_disabled", (byte) -127, param1, "lobby"));
          bw.field_h.field_G = wj.a(-12310, fk.a("mediumbutton", (byte) -125, param1, "lobby"));
          bw.field_h.field_mb = wj.a(-12310, fk.a("mediumbutton_mouseover", (byte) -125, param1, "lobby"));
          bw.field_h.field_U = wj.a(-12310, fk.a("mediumbutton_mouseheld", (byte) -124, param1, "lobby"));
          nd.field_a.field_G = wj.a(-12310, fk.a("bigbutton", (byte) -128, param1, "lobby"));
          nd.field_a.field_mb = wj.a(-12310, fk.a("bigbutton_mouseover", (byte) -124, param1, "lobby"));
          nd.field_a.field_U = wj.a(-12310, fk.a("bigbutton_mouseheld", (byte) -124, param1, "lobby"));
          nd.field_a.field_A = wj.a(-12310, fk.a("bigbutton_disabled", (byte) -126, param1, "lobby"));
          rf.field_d.field_G = wj.a(-12310, fk.a("greenbutton", (byte) -124, param1, "lobby"));
          rf.field_d.field_mb = wj.a(-12310, fk.a("greenbutton_mouseover", (byte) -126, param1, "lobby"));
          rf.field_d.field_U = wj.a(-12310, fk.a("greenbutton_mouseheld", (byte) -127, param1, "lobby"));
          pt.field_X.field_G = wj.a(-12310, fk.a("redbutton", (byte) -128, param1, "lobby"));
          pt.field_X.field_mb = wj.a(-12310, fk.a("redbutton_mouseover", (byte) -127, param1, "lobby"));
          pt.field_X.field_U = wj.a(-12310, fk.a("redbutton_mouseheld", (byte) -126, param1, "lobby"));
          kd.field_M.field_G = wj.a(-12310, fk.a("backbutton", (byte) -124, param1, "lobby"));
          kd.field_M.field_mb = wj.a(-12310, fk.a("backbutton_mouseover", (byte) -124, param1, "lobby"));
          kd.field_M.field_U = wj.a(-12310, fk.a("backbutton_mouseheld", (byte) -128, param1, "lobby"));
          kd.field_M.field_A = wj.a(-12310, fk.a("backbutton_disabled", (byte) -124, param1, "lobby"));
          eb.field_a.field_G = wj.a(-12310, fk.a("gameoptionbutton", (byte) -128, param1, "lobby"));
          eb.field_a.field_mb = wj.a(-12310, fk.a("gameoptionbutton_mouseover", (byte) -126, param1, "lobby"));
          dupTemp$1 = wj.a(-12310, fk.a("gameoptionbutton_active", (byte) -128, param1, "lobby"));
          eb.field_a.field_H = dupTemp$1;
          eb.field_a.field_U = dupTemp$1;
          eb.field_a.field_A = wj.a(-12310, fk.a("gameoptionbutton_disabled", (byte) -124, param1, "lobby"));
          rd.field_e.field_G = wj.a(-12310, fk.a("chatbutton", (byte) -125, param1, "lobby"));
          rd.field_e.field_mb = wj.a(-12310, fk.a("chatbutton_mouseover", (byte) -127, param1, "lobby"));
          dupTemp$2 = wj.a(-12310, fk.a("chatbutton_active", (byte) -124, param1, "lobby"));
          rd.field_e.field_H = dupTemp$2;
          rd.field_e.field_U = dupTemp$2;
          PreparedAction.field_o.field_G = wj.a(-12310, fk.a("chatfilterbutton", (byte) -127, param1, "lobby"));
          PreparedAction.field_o.field_mb = wj.a(-12310, fk.a("chatfilterbutton_mouseover", (byte) -127, param1, "lobby"));
          dupTemp$3 = wj.a(-12310, fk.a("chatfilterbutton_active", (byte) -124, param1, "lobby"));
          PreparedAction.field_o.field_H = dupTemp$3;
          PreparedAction.field_o.field_U = dupTemp$3;
          var17 = fk.a("checkbox", (byte) -124, param1, "lobby");
          hs.field_H = new fp(0L, var17[1], var17[0], 1, DualLinkedNode.field_k, (String) null);
          oe.field_Cb = new je(0L, (je) null);
          oe.field_Cb.field_G = it.a(17, GameplayController.a("slideregion", (byte) 51, "lobby", param1));
          oe.field_Cb.field_mb = it.a(17, GameplayController.a("slideregion_mouseover", (byte) 51, "lobby", param1));
          oe.field_Cb.field_U = it.a(17, GameplayController.a("slideregion_mouseheld", (byte) 51, "lobby", param1));
          oe.field_Cb.field_A = it.a(17, GameplayController.a("slideregion_disabled", (byte) 51, "lobby", param1));
          ke.field_c = new je(0L, (je) null);
          ke.field_c.field_G = wj.a(-12310, fk.a("dragbar", (byte) -126, param1, "lobby"));
          ke.field_c.field_mb = wj.a(-12310, fk.a("dragbar_mouseover", (byte) -127, param1, "lobby"));
          ke.field_c.field_U = wj.a(-12310, fk.a("dragbar_mouseheld", (byte) -127, param1, "lobby"));
          ke.field_c.field_A = wj.a(-12310, fk.a("dragbar_disabled", (byte) -125, param1, "lobby"));
          no.field_M = new je(0L, (je) null);
          no.field_M.field_cb = GameplayController.a("upbutton", (byte) 51, "lobby", param1);
          no.field_M.field_vb = GameplayController.a("upbutton_mouseover", (byte) 51, "lobby", param1);
          no.field_M.field_qb = GameplayController.a("upbutton_mouseheld", (byte) 51, "lobby", param1);
          no.field_M.field_sb = GameplayController.a("upbutton_disabled", (byte) 51, "lobby", param1);
          wh.field_g = new je(0L, (je) null);
          wh.field_g.field_cb = GameplayController.a("downbutton", (byte) 51, "lobby", param1);
          wh.field_g.field_vb = GameplayController.a("downbutton_mouseover", (byte) 51, "lobby", param1);
          wh.field_g.field_qb = GameplayController.a("downbutton_mouseheld", (byte) 51, "lobby", param1);
          wh.field_g.field_sb = GameplayController.a("downbutton_disabled", (byte) 51, "lobby", param1);
          ri.field_b = new ll(0L, no.field_M, wh.field_g, oe.field_Cb, ke.field_c);
          br.field_g = new mp(0L, (je) null, cb.field_c, ri.field_b, je.field_Q, (String) null, (String) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_27_0 = var5_ref;
          stackIn_27_1 = new StringBuilder().append("ee.E(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (param4 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }

    private final String formatMindControlRejection(String[] messageParts, int obfuscationGuard) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard == 30536) {
            stackIn_4_0 = this.formatIllegalMove(12, messageParts, "mind control");
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ee.F(");
          if (messageParts == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void f(int param0) {
        field_v = null;
        field_A = null;
        if (param0 != -27538) {
          return;
        }
        field_x = null;
    }

    final static void e(int param0) {
        TurnEffectEvent.field_z.c((byte) -115);
        if (param0 != 0) {
          SphinxActionRequest.f(64);
          return;
        }
    }

    final PreparedAction prepareAction(int obfuscationGuard, Battlefield battlefield) {
        String discarded$0 = null;
        String discarded$2 = null;
        String discarded$1 = null;
        Object stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_11_0 = null;
        PreparedAction stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        ResourceArchive var4 = null;
        Unit var5 = null;
        try {
          this.unlink(44);
          if (obfuscationGuard <= 31) {
            var4 = (ResourceArchive) null;
            SphinxActionRequest.a((IndexedSprite[]) null, (ResourceArchive) null, 4, (int[]) null, (ResourceArchive) null);
          }
          var5 = battlefield.getUnitAt(this.sphinxY, true, this.sphinxX);
          if (var5 == null) {
            discarded$0 = this.formatMindControlRejection(new String[]{"no unit at ", TutorialController.formatCoordinatePair(this.sphinxX, 0, this.sphinxY)}, 30536);
            stackIn_5_0 = null;
            return (PreparedAction) (stackIn_5_0);
          }
          if (var5.attacksRemaining == 0) {
            discarded$2 = this.formatMindControlRejection(new String[]{"unit at ", TutorialController.formatCoordinatePair(this.sphinxX, 0, this.sphinxY), " has attacked"}, 30536);
            stackIn_8_0 = null;
            return (PreparedAction) (stackIn_8_0);
          }
          if (72 == var5.unitType) {
            stackIn_13_0 = this.delegatedRequest.prepareAction(100, battlefield);
            return stackIn_13_0;
          }
          discarded$1 = this.formatMindControlRejection(new String[]{"unit at ", TutorialController.formatCoordinatePair(this.sphinxX, 0, this.sphinxY), " is not TYPE_SPHINX"}, 30536);
          stackIn_11_0 = null;
          return (PreparedAction) (stackIn_11_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("ee.C(").append(obfuscationGuard).append(',');
          if (battlefield == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    SphinxActionRequest(int actingPlayer, int sphinxX, int sphinxY, ActionRequest delegatedRequest) {
        try {
          this.delegatedRequest = delegatedRequest;
          this.delegatedRequest.allowOtherPlayer = true;
          this.actingPlayer = actingPlayer;
          this.sphinxX = sphinxX;
          this.sphinxY = sphinxY;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ee.<init>(" + actingPlayer + ',' + sphinxX + ',' + sphinxY + ',' + (delegatedRequest != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_x = new int[128];
    }
}
