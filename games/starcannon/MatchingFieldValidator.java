/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MatchingFieldValidator extends TextFieldValidator {
    static Sprite field_l;
    private EditableTextField field_n;
    static IntrusiveDeque field_k;
    static int field_m;
    static String field_j;

    final String getValidationMessage(String param0, boolean param1) {
        FieldValidator var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_2_0 = null;
        String stackIn_14_0 = null;
        String stackIn_16_0 = null;
        String stackIn_19_0 = null;
        Object stackIn_21_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          if (this.field_n instanceof FieldValidatorProvider) {
            var3 = ((FieldValidatorProvider) ((Object) this.field_n)).getFieldValidator(false);
            if (var3 != null) {
              if (var3.getValidationStatus((byte) 12) == bf.field_x &&
                !param0.equals(this.field_n.field_k)) {
                stackIn_14_0 = qb.field_d;
                return stackIn_14_0;
              }
              stackIn_16_0 = var3.getValidationMessage(26162);
              return stackIn_16_0;
            }
          }
          if (param0.equals(this.field_n.field_k)) {
            stackIn_21_0 = null;
            return (String) (stackIn_21_0);
          }
          stackIn_19_0 = qb.field_d;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_25_0 = var3_ref;
          stackIn_25_1 = new StringBuilder().append("vb.A(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw sd.wrapClientException((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    MatchingFieldValidator(EditableTextField param0, EditableTextField param1) {
        super(param0);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_n = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("vb.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sd.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(ResourceArchive param0, int param1) {
        RuntimeException stackIn_373_0 = null;
        StringBuilder stackIn_373_1 = null;
        String stackIn_374_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        byte[] var2Lifetime1;
        byte[] var2Lifetime2;
        byte[] var2Lifetime3;
        byte[] var2Lifetime4;
        byte[] var2Lifetime5;
        byte[] var2Lifetime6;
        byte[] var2Lifetime7;
        byte[] var2Lifetime8;
        byte[] var2Lifetime9;
        byte[] var2Lifetime10;
        byte[] var2Lifetime11;
        byte[] var2Lifetime12;
        byte[] var2Lifetime13;
        byte[] var2Lifetime14;
        byte[] var2Lifetime15;
        byte[] var2Lifetime16;
        byte[] var2Lifetime17;
        byte[] var2Lifetime18;
        byte[] var2Lifetime19;
        byte[] var2Lifetime20;
        byte[] var2Lifetime21;
        byte[] var2Lifetime22;
        byte[] var2Lifetime23;
        byte[] var2Lifetime24;
        byte[] var2Lifetime25;
        byte[] var2Lifetime26;
        byte[] var2Lifetime27;
        byte[] var2Lifetime28;
        byte[] var2Lifetime29;
        byte[] var2Lifetime30;
        byte[] var2Lifetime31;
        byte[] var2Lifetime32;
        byte[] var2Lifetime33;
        byte[] var2Lifetime34;
        byte[] var2Lifetime35;
        byte[] var2Lifetime36;
        byte[] var2Lifetime37;
        byte[] var2Lifetime38;
        byte[] var2Lifetime39;
        byte[] var2Lifetime40;
        byte[] var2Lifetime41;
        byte[] var2Lifetime42;
        byte[] var2Lifetime43;
        byte[] var2Lifetime44;
        byte[] var2Lifetime45;
        byte[] var2Lifetime46;
        byte[] var2Lifetime47;
        byte[] var2Lifetime48;
        byte[] var2Lifetime49;
        byte[] var2Lifetime50;
        byte[] var2Lifetime51;
        byte[] var2Lifetime52;
        byte[] var2Lifetime53;
        byte[] var2Lifetime54;
        byte[] var2Lifetime55;
        byte[] var2Lifetime56;
        byte[] var2Lifetime57;
        byte[] var2Lifetime58;
        byte[] var2Lifetime59;
        byte[] var2Lifetime60;
        byte[] var2Lifetime61;
        byte[] var2Lifetime62;
        byte[] var2Lifetime63;
        byte[] var2Lifetime64;
        byte[] var2Lifetime65;
        byte[] var2Lifetime66;
        byte[] var2Lifetime67;
        byte[] var2Lifetime68;
        byte[] var2Lifetime69;
        byte[] var2Lifetime70;
        byte[] var2Lifetime71;
        byte[] var2Lifetime72;
        byte[] var2Lifetime73;
        byte[] var2Lifetime74;
        byte[] var2Lifetime75;
        byte[] var2Lifetime76;
        byte[] var2Lifetime77;
        byte[] var2Lifetime78;
        byte[] var2Lifetime79;
        byte[] var2Lifetime80;
        byte[] var2Lifetime81;
        byte[] var2Lifetime82;
        byte[] var2Lifetime83;
        byte[] var2Lifetime84;
        byte[] var2Lifetime85;
        byte[] var2Lifetime86;
        byte[] var2Lifetime87;
        byte[] var2Lifetime88;
        byte[] var2Lifetime89;
        byte[] var2Lifetime90;
        byte[] var2Lifetime91;
        byte[] var2Lifetime92;
        byte[] var2Lifetime93;
        byte[] var2Lifetime94;
        byte[] var2Lifetime95;
        byte[] var2Lifetime96;
        byte[] var2Lifetime97;
        byte[] var2Lifetime98;
        byte[] var2Lifetime99;
        byte[] var2Lifetime100;
        byte[] var2Lifetime101;
        byte[] var2Lifetime102;
        var3 = StarCannon.field_A;
        try {
          ri.field_c = param0;
          var2 = BoundedRandomAccessFile.a("gamename", (byte) -124);
          if (null != var2) {
            wc.field_g = DualLinkNode.a(121, var2);
          }
          var2Lifetime1 = BoundedRandomAccessFile.a("achievement_names,0", (byte) -124);
          if (null != var2Lifetime1) {
            AgeValidator.field_j[0] = DualLinkNode.a(127, var2Lifetime1);
          }
          var2Lifetime2 = BoundedRandomAccessFile.a("achievement_names,1", (byte) -124);
          if (var2Lifetime2 != null) {
            AgeValidator.field_j[1] = DualLinkNode.a(dg.a(param1, 30856), var2Lifetime2);
          }
          var2Lifetime3 = BoundedRandomAccessFile.a("achievement_names,2", (byte) -124);
          if (null != var2Lifetime3) {
            AgeValidator.field_j[2] = DualLinkNode.a(126, var2Lifetime3);
          }
          var2Lifetime4 = BoundedRandomAccessFile.a("achievement_names,3", (byte) -124);
          if (var2Lifetime4 != null) {
            AgeValidator.field_j[3] = DualLinkNode.a(dg.a(param1, 30858), var2Lifetime4);
          }
          var2Lifetime5 = BoundedRandomAccessFile.a("achievement_names,4", (byte) -124);
          if (var2Lifetime5 != null) {
            AgeValidator.field_j[4] = DualLinkNode.a(120, var2Lifetime5);
          }
          var2Lifetime6 = BoundedRandomAccessFile.a("achievement_names,5", (byte) -124);
          if (null != var2Lifetime6) {
            AgeValidator.field_j[5] = DualLinkNode.a(115, var2Lifetime6);
          }
          var2Lifetime7 = BoundedRandomAccessFile.a("achievement_names,6", (byte) -124);
          if (var2Lifetime7 != null) {
            AgeValidator.field_j[6] = DualLinkNode.a(param1 - 30835, var2Lifetime7);
          }
          var2Lifetime8 = BoundedRandomAccessFile.a("achievement_names,7", (byte) -124);
          if (var2Lifetime8 != null) {
            AgeValidator.field_j[7] = DualLinkNode.a(param1 - 30850, var2Lifetime8);
          }
          var2Lifetime9 = BoundedRandomAccessFile.a("achievement_names,8", (byte) -124);
          if (var2Lifetime9 != null) {
            AgeValidator.field_j[8] = DualLinkNode.a(113, var2Lifetime9);
          }
          var2Lifetime10 = BoundedRandomAccessFile.a("achievement_names,9", (byte) -124);
          if (var2Lifetime10 != null) {
            AgeValidator.field_j[9] = DualLinkNode.a(121, var2Lifetime10);
          }
          var2Lifetime11 = BoundedRandomAccessFile.a("achievement_names,10", (byte) -124);
          if (var2Lifetime11 != null) {
            AgeValidator.field_j[10] = DualLinkNode.a(122, var2Lifetime11);
          }
          var2Lifetime12 = BoundedRandomAccessFile.a("achievement_names,11", (byte) -124);
          if (var2Lifetime12 != null) {
            AgeValidator.field_j[11] = DualLinkNode.a(126, var2Lifetime12);
          }
          var2Lifetime13 = BoundedRandomAccessFile.a("achievement_names,12", (byte) -124);
          if (null != var2Lifetime13) {
            AgeValidator.field_j[12] = DualLinkNode.a(123, var2Lifetime13);
          }
          var2Lifetime14 = BoundedRandomAccessFile.a("achievement_names,13", (byte) -124);
          if (var2Lifetime14 != null) {
            AgeValidator.field_j[13] = DualLinkNode.a(120, var2Lifetime14);
          }
          var2Lifetime15 = BoundedRandomAccessFile.a("achievement_names,14", (byte) -124);
          if (var2Lifetime15 != null) {
            AgeValidator.field_j[14] = DualLinkNode.a(120, var2Lifetime15);
          }
          var2Lifetime16 = BoundedRandomAccessFile.a("achievement_criteria,0", (byte) -124);
          if (null != var2Lifetime16) {
            vd.field_h[0] = DualLinkNode.a(116, var2Lifetime16);
          }
          var2Lifetime17 = BoundedRandomAccessFile.a("achievement_criteria,1", (byte) -124);
          if (null != var2Lifetime17) {
            vd.field_h[1] = DualLinkNode.a(dg.a(param1, 30850), var2Lifetime17);
          }
          var2Lifetime18 = BoundedRandomAccessFile.a("achievement_criteria,2", (byte) -124);
          if (null != var2Lifetime18) {
            vd.field_h[2] = DualLinkNode.a(123, var2Lifetime18);
          }
          var2Lifetime19 = BoundedRandomAccessFile.a("achievement_criteria,3", (byte) -124);
          if (var2Lifetime19 != null) {
            vd.field_h[3] = DualLinkNode.a(dg.a(param1, 30850), var2Lifetime19);
          }
          var2Lifetime20 = BoundedRandomAccessFile.a("achievement_criteria,4", (byte) -124);
          if (var2Lifetime20 != null) {
            vd.field_h[4] = DualLinkNode.a(120, var2Lifetime20);
          }
          var2Lifetime21 = BoundedRandomAccessFile.a("achievement_criteria,5", (byte) -124);
          if (var2Lifetime21 != null) {
            vd.field_h[5] = DualLinkNode.a(120, var2Lifetime21);
          }
          var2Lifetime22 = BoundedRandomAccessFile.a("achievement_criteria,6", (byte) -124);
          if (var2Lifetime22 != null) {
            vd.field_h[6] = DualLinkNode.a(param1 - 30843, var2Lifetime22);
          }
          var2Lifetime23 = BoundedRandomAccessFile.a("achievement_criteria,7", (byte) -124);
          if (null != var2Lifetime23) {
            vd.field_h[7] = DualLinkNode.a(116, var2Lifetime23);
          }
          var2Lifetime24 = BoundedRandomAccessFile.a("achievement_criteria,8", (byte) -124);
          if (var2Lifetime24 != null) {
            vd.field_h[8] = DualLinkNode.a(117, var2Lifetime24);
          }
          var2Lifetime25 = BoundedRandomAccessFile.a("achievement_criteria,9", (byte) -124);
          if (null != var2Lifetime25) {
            vd.field_h[9] = DualLinkNode.a(127, var2Lifetime25);
          }
          var2Lifetime26 = BoundedRandomAccessFile.a("achievement_criteria,10", (byte) -124);
          if (var2Lifetime26 != null) {
            vd.field_h[10] = DualLinkNode.a(param1 - 30840, var2Lifetime26);
          }
          var2Lifetime27 = BoundedRandomAccessFile.a("achievement_criteria,11", (byte) -124);
          if (null != var2Lifetime27) {
            vd.field_h[11] = DualLinkNode.a(120, var2Lifetime27);
          }
          var2Lifetime28 = BoundedRandomAccessFile.a("achievement_criteria,12", (byte) -124);
          if (var2Lifetime28 != null) {
            vd.field_h[12] = DualLinkNode.a(117, var2Lifetime28);
          }
          var2Lifetime29 = BoundedRandomAccessFile.a("achievement_criteria,13", (byte) -124);
          if (var2Lifetime29 != null) {
            vd.field_h[13] = DualLinkNode.a(123, var2Lifetime29);
          }
          var2Lifetime30 = BoundedRandomAccessFile.a("achievement_criteria,14", (byte) -124);
          if (var2Lifetime30 != null) {
            vd.field_h[14] = DualLinkNode.a(121, var2Lifetime30);
          }
          var2Lifetime31 = BoundedRandomAccessFile.a("optionscaps", (byte) -124);
          if (null != var2Lifetime31) {
            DualLinkNode.a(param1 ^ 30861, var2Lifetime31);
          }
          var2Lifetime32 = BoundedRandomAccessFile.a("bosshealthcaps", (byte) -124);
          if (var2Lifetime32 != null) {
            s.field_h = DualLinkNode.a(112, var2Lifetime32);
          }
          var2Lifetime33 = BoundedRandomAccessFile.a("lev7a", (byte) -124);
          if (var2Lifetime33 != null) {
            jg.field_I = DualLinkNode.a(127, var2Lifetime33);
          }
          var2Lifetime34 = BoundedRandomAccessFile.a("lev6c", (byte) -124);
          if (var2Lifetime34 != null) {
            eh.field_c = DualLinkNode.a(117, var2Lifetime34);
          }
          var2Lifetime35 = BoundedRandomAccessFile.a("lev6b", (byte) -124);
          if (var2Lifetime35 != null) {
            jf.field_b = DualLinkNode.a(122, var2Lifetime35);
          }
          var2Lifetime36 = BoundedRandomAccessFile.a("lev6a", (byte) -124);
          if (var2Lifetime36 != null) {
            d.field_n = DualLinkNode.a(126, var2Lifetime36);
          }
          var2Lifetime37 = BoundedRandomAccessFile.a("lev5b", (byte) -124);
          if (var2Lifetime37 != null) {
            BufferedSocket.field_o = DualLinkNode.a(112, var2Lifetime37);
          }
          var2Lifetime38 = BoundedRandomAccessFile.a("lev5a", (byte) -124);
          if (var2Lifetime38 != null) {
            bc.field_l = DualLinkNode.a(126, var2Lifetime38);
          }
          var2Lifetime39 = BoundedRandomAccessFile.a("lev4a", (byte) -124);
          if (null != var2Lifetime39) {
            vf.field_a = DualLinkNode.a(param1 ^ 30860, var2Lifetime39);
          }
          var2Lifetime40 = BoundedRandomAccessFile.a("lev3a", (byte) -124);
          if (null != var2Lifetime40) {
            FullscreenFocusCanvas.field_a = DualLinkNode.a(121, var2Lifetime40);
          }
          var2Lifetime41 = BoundedRandomAccessFile.a("lev2a", (byte) -124);
          if (null != var2Lifetime41) {
            AccountServiceResult.field_c = DualLinkNode.a(123, var2Lifetime41);
          }
          var2Lifetime42 = BoundedRandomAccessFile.a("lev1", (byte) -124);
          if (null != var2Lifetime42) {
            eg.field_i = DualLinkNode.a(114, var2Lifetime42);
          }
          var2Lifetime43 = BoundedRandomAccessFile.a("spacetofire", (byte) -124);
          if (null != var2Lifetime43) {
            DualLinkNode.a(120, var2Lifetime43);
          }
          var2Lifetime44 = BoundedRandomAccessFile.a("escforopts", (byte) -124);
          if (null != var2Lifetime44) {
            DualLinkNode.a(112, var2Lifetime44);
          }
          var2Lifetime45 = BoundedRandomAccessFile.a("scorecapscolon", (byte) -124);
          if (null != var2Lifetime45) {
            rd.field_o = DualLinkNode.a(112, var2Lifetime45);
          }
          var2Lifetime46 = BoundedRandomAccessFile.a("collecttopowerup", (byte) -124);
          if (null != var2Lifetime46) {
            p.field_e = DualLinkNode.a(param1 - 30845, var2Lifetime46);
          }
          var2Lifetime47 = BoundedRandomAccessFile.a("lancepower", (byte) -124);
          if (var2Lifetime47 != null) {
            ve.field_g = DualLinkNode.a(114, var2Lifetime47);
          }
          var2Lifetime48 = BoundedRandomAccessFile.a("helixpower", (byte) -124);
          if (null != var2Lifetime48) {
            b.field_d = DualLinkNode.a(param1 - 30838, var2Lifetime48);
          }
          var2Lifetime49 = BoundedRandomAccessFile.a("pulsepower", (byte) -124);
          if (null != var2Lifetime49) {
            be.field_b = DualLinkNode.a(119, var2Lifetime49);
          }
          var2Lifetime50 = BoundedRandomAccessFile.a("livescapscolon", (byte) -124);
          if (var2Lifetime50 != null) {
            vk.field_w = DualLinkNode.a(param1 - 30842, var2Lifetime50);
          }
          var2Lifetime51 = BoundedRandomAccessFile.a("atgcaps", (byte) -124);
          if (null != var2Lifetime51) {
            DualLinkNode.a(115, var2Lifetime51);
          }
          var2Lifetime52 = BoundedRandomAccessFile.a("levhard", (byte) -124);
          if (null != var2Lifetime52) {
            DisplayNameSelectionPanel.field_D = DualLinkNode.a(127, var2Lifetime52);
          }
          var2Lifetime53 = BoundedRandomAccessFile.a("levmedium", (byte) -124);
          if (var2Lifetime53 != null) {
            fl.field_g = DualLinkNode.a(120, var2Lifetime53);
          }
          var2Lifetime54 = BoundedRandomAccessFile.a("leveasy", (byte) -124);
          if (null != var2Lifetime54) {
            ConfirmedEmailAvailabilityValidator.field_k = DualLinkNode.a(param1 - 30847, var2Lifetime54);
          }
          var2Lifetime55 = BoundedRandomAccessFile.a("fsoff", (byte) -124);
          if (var2Lifetime55 != null) {
            DualLinkNode.a(126, var2Lifetime55);
          }
          var2Lifetime56 = BoundedRandomAccessFile.a("fson", (byte) -124);
          if (var2Lifetime56 != null) {
            DualLinkNode.a(114, var2Lifetime56);
          }
          var2Lifetime57 = BoundedRandomAccessFile.a("gfxhigh", (byte) -124);
          if (null != var2Lifetime57) {
            gh.field_A = DualLinkNode.a(120, var2Lifetime57);
          }
          var2Lifetime58 = BoundedRandomAccessFile.a("gfxmed", (byte) -124);
          if (var2Lifetime58 != null) {
            fd.field_d = DualLinkNode.a(param1 - 30850, var2Lifetime58);
          }
          var2Lifetime59 = BoundedRandomAccessFile.a("gfxlow", (byte) -124);
          if (var2Lifetime59 != null) {
            ec.field_d = DualLinkNode.a(121, var2Lifetime59);
          }
          var2Lifetime60 = BoundedRandomAccessFile.a("maxpowtext", (byte) -124);
          if (var2Lifetime60 != null) {
            RichTextWidget.field_B = DualLinkNode.a(param1 ^ 30855, var2Lifetime60);
          }
          var2Lifetime61 = BoundedRandomAccessFile.a("sideguntext", (byte) -124);
          if (null != var2Lifetime61) {
            NetworkArchiveRequest.field_y = DualLinkNode.a(124, var2Lifetime61);
          }
          var2Lifetime62 = BoundedRandomAccessFile.a("backguntext", (byte) -124);
          if (null != var2Lifetime62) {
            TextHotspotBounds.field_i = DualLinkNode.a(119, var2Lifetime62);
          }
          var2Lifetime63 = BoundedRandomAccessFile.a("shieldtext", (byte) -124);
          if (null != var2Lifetime63) {
            t.field_x = DualLinkNode.a(113, var2Lifetime63);
          }
          var2Lifetime64 = BoundedRandomAccessFile.a("enginetext", (byte) -124);
          if (var2Lifetime64 != null) {
            hb.field_g = DualLinkNode.a(126, var2Lifetime64);
          }
          var2Lifetime65 = BoundedRandomAccessFile.a("powerup2of2", (byte) -124);
          if (var2Lifetime65 != null) {
            AgeValidator.field_k = DualLinkNode.a(120, var2Lifetime65);
          }
          var2Lifetime66 = BoundedRandomAccessFile.a("collecttext", (byte) -124);
          if (var2Lifetime66 != null) {
            la.field_a = DualLinkNode.a(117, var2Lifetime66);
          }
          var2Lifetime67 = BoundedRandomAccessFile.a("lifetext", (byte) -124);
          if (null != var2Lifetime67) {
            a.field_c = DualLinkNode.a(126, var2Lifetime67);
          }
          var2Lifetime68 = BoundedRandomAccessFile.a("lancetext", (byte) -124);
          if (var2Lifetime68 != null) {
            ImageProducerRasterBuffer.field_k = DualLinkNode.a(118, var2Lifetime68);
          }
          var2Lifetime69 = BoundedRandomAccessFile.a("helixtext", (byte) -124);
          if (null != var2Lifetime69) {
            mc.field_i = DualLinkNode.a(120, var2Lifetime69);
          }
          var2Lifetime70 = BoundedRandomAccessFile.a("pulsetext", (byte) -124);
          if (var2Lifetime70 != null) {
            gf.field_e = DualLinkNode.a(123, var2Lifetime70);
          }
          var2Lifetime71 = BoundedRandomAccessFile.a("powerup1of2", (byte) -124);
          if (null != var2Lifetime71) {
            vc.field_k = DualLinkNode.a(127, var2Lifetime71);
          }
          var2Lifetime72 = BoundedRandomAccessFile.a("con7", (byte) -124);
          if (null != var2Lifetime72) {
            eb.field_e = DualLinkNode.a(127, var2Lifetime72);
          }
          var2Lifetime73 = BoundedRandomAccessFile.a("con6", (byte) -124);
          if (var2Lifetime73 != null) {
            p.field_b = DualLinkNode.a(114, var2Lifetime73);
          }
          var2Lifetime74 = BoundedRandomAccessFile.a("con5", (byte) -124);
          if (var2Lifetime74 != null) {
            PasswordValidator.field_k = DualLinkNode.a(119, var2Lifetime74);
          }
          var2Lifetime75 = BoundedRandomAccessFile.a("con4", (byte) -124);
          if (null != var2Lifetime75) {
            qd.field_y = DualLinkNode.a(param1 - 30843, var2Lifetime75);
          }
          var2Lifetime76 = BoundedRandomAccessFile.a("con3", (byte) -124);
          if (null != var2Lifetime76) {
            ac.field_c = DualLinkNode.a(120, var2Lifetime76);
          }
          var2Lifetime77 = BoundedRandomAccessFile.a("con2", (byte) -124);
          if (null != var2Lifetime77) {
            FrameTimer.field_a = DualLinkNode.a(112, var2Lifetime77);
          }
          var2Lifetime78 = BoundedRandomAccessFile.a("con1", (byte) -124);
          if (null != var2Lifetime78) {
            s.field_a = DualLinkNode.a(param1 - 30840, var2Lifetime78);
          }
          var2Lifetime79 = BoundedRandomAccessFile.a("controlcaps", (byte) -124);
          if (null != var2Lifetime79) {
            tc.field_y = DualLinkNode.a(param1 ^ 30860, var2Lifetime79);
          }
          var2Lifetime80 = BoundedRandomAccessFile.a("storytext", (byte) -124);
          if (var2Lifetime80 != null) {
            ff.field_p = DualLinkNode.a(123, var2Lifetime80);
          }
          var2Lifetime81 = BoundedRandomAccessFile.a("storycaps", (byte) -124);
          if (null != var2Lifetime81) {
            BufferedSocket.field_p = DualLinkNode.a(117, var2Lifetime81);
          }
          var2Lifetime82 = BoundedRandomAccessFile.a("nextcaps", (byte) -124);
          if (null != var2Lifetime82) {
            DualLinkNode.a(127, var2Lifetime82);
          }
          var2Lifetime83 = BoundedRandomAccessFile.a("prevcaps", (byte) -124);
          if (null != var2Lifetime83) {
            DualLinkNode.a(param1 ^ 30853, var2Lifetime83);
          }
          var2Lifetime84 = BoundedRandomAccessFile.a("pageno", (byte) -124);
          if (null != var2Lifetime84) {
            SpriteState.field_t = DualLinkNode.a(120, var2Lifetime84);
          }
          var2Lifetime85 = BoundedRandomAccessFile.a("instrcaps", (byte) -124);
          if (null != var2Lifetime85) {
            DualLinkNode.a(114, var2Lifetime85);
          }
          var2Lifetime86 = BoundedRandomAccessFile.a("hsunavail", (byte) -124);
          if (null != var2Lifetime86) {
            DualLinkNode.a(115, var2Lifetime86);
          }
          var2Lifetime87 = BoundedRandomAccessFile.a("waitforhs", (byte) -124);
          if (null != var2Lifetime87) {
            DualLinkNode.a(127, var2Lifetime87);
          }
          var2Lifetime88 = BoundedRandomAccessFile.a("hardcaps", (byte) -124);
          if (var2Lifetime88 != null) {
            BufferedRandomAccessFile.field_j = DualLinkNode.a(118, var2Lifetime88);
          }
          var2Lifetime89 = BoundedRandomAccessFile.a("mediumcaps", (byte) -124);
          if (var2Lifetime89 != null) {
            lb.field_l = DualLinkNode.a(116, var2Lifetime89);
          }
          var2Lifetime90 = BoundedRandomAccessFile.a("easycaps", (byte) -124);
          if (null != var2Lifetime90) {
            ta.field_a = DualLinkNode.a(param1 ^ 30862, var2Lifetime90);
          }
          var2Lifetime91 = BoundedRandomAccessFile.a("lastscorestring", (byte) -124);
          if (null != var2Lifetime91) {
            DualLinkNode.a(120, var2Lifetime91);
          }
          var2Lifetime92 = BoundedRandomAccessFile.a("logincaps", (byte) -124);
          if (null != var2Lifetime92) {
            DualLinkNode.a(param1 - 30840, var2Lifetime92);
          }
          var2Lifetime93 = BoundedRandomAccessFile.a("highscorescaps", (byte) -124);
          if (null != var2Lifetime93) {
            DualLinkNode.a(113, var2Lifetime93);
          }
          var2Lifetime94 = BoundedRandomAccessFile.a("menucaps", (byte) -124);
          if (null != var2Lifetime94) {
            DualLinkNode.a(123, var2Lifetime94);
          }
          var2Lifetime95 = BoundedRandomAccessFile.a("hiddenachievement", (byte) -124);
          if (null != var2Lifetime95) {
            DualLinkNode.a(127, var2Lifetime95);
          }
          var2Lifetime96 = BoundedRandomAccessFile.a("achievementscaps", (byte) -124);
          if (var2Lifetime96 != null) {
            DualLinkNode.a(param1 - 30850, var2Lifetime96);
          }
          var2Lifetime97 = BoundedRandomAccessFile.a("mainmenucaps", (byte) -124);
          if (null != var2Lifetime97) {
            DualLinkNode.a(param1 - 30842, var2Lifetime97);
          }
          var2Lifetime98 = BoundedRandomAccessFile.a("warninghardmode", (byte) -124);
          if (var2Lifetime98 != null) {
            DualLinkNode.a(param1 - 30836, var2Lifetime98);
          }
          var2Lifetime99 = BoundedRandomAccessFile.a("gameover", (byte) -124);
          if (var2Lifetime99 != null) {
            ne.field_i = DualLinkNode.a(127, var2Lifetime99);
          }
          var2Lifetime100 = BoundedRandomAccessFile.a("benefits,0", (byte) -124);
          if (param1 != 30962) {
            field_j = (String) null;
          }
          if (null != var2Lifetime100) {
            rj.field_l[0] = DualLinkNode.a(114, var2Lifetime100);
          }
          var2Lifetime101 = BoundedRandomAccessFile.a("benefits,1", (byte) -124);
          if (null != var2Lifetime101) {
            rj.field_l[1] = DualLinkNode.a(121, var2Lifetime101);
          }
          var2Lifetime102 = BoundedRandomAccessFile.a("benefits,2", (byte) -124);
          if (null != var2Lifetime102) {
            rj.field_l[2] = DualLinkNode.a(125, var2Lifetime102);
          }
          ri.field_c = null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_373_0 = var2_ref;
          stackIn_373_1 = new StringBuilder().append("vb.C(");
          if (param0 == null) {
            stackIn_374_2 = "null";
          } else {
            stackIn_374_2 = "{...}";
          }
          throw sd.wrapClientException((Throwable) ((Object) stackIn_373_0), ((StringBuilder) (Object) stackIn_373_1).append(stackIn_374_2).append(',').append(param1).append(')').toString());
        }
        if (GameApplet.field_i) {
          var3++;
          StarCannon.field_A = var3;
        }
    }

    public static void e(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_j = null;
          field_k = null;
          if (param0 < 108) {
            field_k = (IntrusiveDeque) null;
          }
          field_l = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.wrapClientException((Throwable) ((Object) var1), "vb.M(" + param0 + ')');
        }
    }

    final p getValidationStatus(String param0, int param1) {
        RuntimeException var3 = null;
        p stackIn_8_0 = null;
        p stackIn_16_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        FieldValidator var3_ref = null;
        try {
          if (this.field_n instanceof FieldValidatorProvider) {
            var3_ref = ((FieldValidatorProvider) ((Object) this.field_n)).getFieldValidator(false);
            if (var3_ref != null &&
              var3_ref.getValidationStatus((byte) -8) != bf.field_x) {
              stackIn_8_0 = BufferedSocket.field_n;
              return stackIn_8_0;
            }
          }
          if (param1 != -26188) {
            MatchingFieldValidator.e((byte) 95);
          }
          if (!param0.equals(this.field_n.field_k)) {
            stackIn_16_0 = BufferedSocket.field_n;
          } else {
            stackIn_16_0 = bf.field_x;
          }
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("vb.B(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw sd.wrapClientException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_k = new IntrusiveDeque();
        field_j = "Prev";
    }
}
