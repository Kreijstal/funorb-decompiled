/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RegistrationRequestDialog extends AccountRequestDialog implements ButtonListener {
    static String field_yb;
    private boolean field_wb;
    static String field_xb;
    static int field_Ab;
    static String field_vb;
    private AccountRegistrationPanel registrationForm;
    private boolean field_zb;

    RegistrationRequestDialog(ModalStack param0, AccountRegistrationPanel param1) {
        super(param0, dl.field_b, j.field_a, false, false);
        String stackIn_7_2 = null;
        String stackIn_11_2 = null;
        try {
          this.registrationForm = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_6_0 = runtimeException;
          StringBuilder stackIn_6_1 = new StringBuilder().append("qc.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final void onAction(TextButton button, int buttonCode, int localY, int guard, int localX) {
        String stackIn_13_2 = null;
        try {
          if (this.field_zb) {
            MarkerSliderPainter.a(122, false, true);
            return;
          }
          DebouncedValidator.b((byte) -51);
          if (guard != 1) {
            return;
          }
          this.closeDialog(-18861);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_12_0 = runtimeException;
          StringBuilder stackIn_12_1 = new StringBuilder().append("qc.K(");
          if (button == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(buttonCode).append(',').append(localY).append(',').append(guard).append(',').append(localX).append(')').toString());
        }
    }

    final void s(int param0) {
        try {
          this.a(-4814, bm.a(mj.field_a, param0, param0 ^ 252), true);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "qc.WB(" + param0 + ')');
        }
    }

    final static void a(int param0, ResourceArchive param1) {
        String stackIn_1028_2 = null;
        int var3 = EscapeVector.obfuscationControl;
        try {
          wk.field_e = param1;
          byte[] var2 = LabeledField.loadNamedAsset("benefits_captions,0", 10592);
          if (null != var2) {
            vj.field_c[0] = RasterSnapshot.a(var2, PacketBuffer.xor(param0, 124));
          }
          byte[] var2Lifetime1 = LabeledField.loadNamedAsset("benefits_captions,1", 10592);
          if (null != var2Lifetime1) {
            vj.field_c[1] = RasterSnapshot.a(var2Lifetime1, 114);
          }
          byte[] var2Lifetime2 = LabeledField.loadNamedAsset("benefits_captions,2", 10592);
          if (var2Lifetime2 != null) {
            vj.field_c[2] = RasterSnapshot.a(var2Lifetime2, param0 + 112);
          }
          byte[] var2Lifetime3 = LabeledField.loadNamedAsset("achievement_names,0", 10592);
          if (var2Lifetime3 != null) {
            CachedArchiveProvider.field_r[0] = RasterSnapshot.a(var2Lifetime3, 110);
          }
          byte[] var2Lifetime4 = LabeledField.loadNamedAsset("achievement_names,1", 10592);
          if (null != var2Lifetime4) {
            CachedArchiveProvider.field_r[1] = RasterSnapshot.a(var2Lifetime4, PacketBuffer.xor(param0, 126));
          }
          byte[] var2Lifetime5 = LabeledField.loadNamedAsset("achievement_names,2", 10592);
          if (var2Lifetime5 != null) {
            CachedArchiveProvider.field_r[2] = RasterSnapshot.a(var2Lifetime5, 125);
          }
          byte[] var2Lifetime6 = LabeledField.loadNamedAsset("achievement_names,3", param0 ^ 10600);
          if (null != var2Lifetime6) {
            CachedArchiveProvider.field_r[3] = RasterSnapshot.a(var2Lifetime6, 122);
          }
          byte[] var2Lifetime7 = LabeledField.loadNamedAsset("achievement_names,4", 10592);
          if (null != var2Lifetime7) {
            CachedArchiveProvider.field_r[4] = RasterSnapshot.a(var2Lifetime7, PacketBuffer.xor(param0, 114));
          }
          byte[] var2Lifetime8 = LabeledField.loadNamedAsset("achievement_names,5", 10592);
          if (null != var2Lifetime8) {
            CachedArchiveProvider.field_r[5] = RasterSnapshot.a(var2Lifetime8, PacketBuffer.xor(param0, 120));
          }
          byte[] var2Lifetime9 = LabeledField.loadNamedAsset("achievement_names,6", param0 + 10584);
          if (null != var2Lifetime9) {
            CachedArchiveProvider.field_r[6] = RasterSnapshot.a(var2Lifetime9, 124);
          }
          byte[] var2Lifetime10 = LabeledField.loadNamedAsset("achievement_names,7", 10592);
          if (null != var2Lifetime10) {
            CachedArchiveProvider.field_r[7] = RasterSnapshot.a(var2Lifetime10, 115);
          }
          byte[] var2Lifetime11 = LabeledField.loadNamedAsset("achievement_names,8", param0 ^ 10600);
          if (var2Lifetime11 != null) {
            CachedArchiveProvider.field_r[8] = RasterSnapshot.a(var2Lifetime11, PacketBuffer.xor(param0, 122));
          }
          byte[] var2Lifetime12 = LabeledField.loadNamedAsset("achievement_names,9", 10592);
          if (var2Lifetime12 != null) {
            CachedArchiveProvider.field_r[9] = RasterSnapshot.a(var2Lifetime12, 110);
          }
          byte[] var2Lifetime13 = LabeledField.loadNamedAsset("achievement_names,10", param0 ^ 10600);
          if (null != var2Lifetime13) {
            CachedArchiveProvider.field_r[10] = RasterSnapshot.a(var2Lifetime13, 117);
          }
          byte[] var2Lifetime14 = LabeledField.loadNamedAsset("achievement_names,11", 10592);
          if (null != var2Lifetime14) {
            CachedArchiveProvider.field_r[11] = RasterSnapshot.a(var2Lifetime14, 120);
          }
          byte[] var2Lifetime15 = LabeledField.loadNamedAsset("achievement_names,12", 10592);
          if (var2Lifetime15 != null) {
            CachedArchiveProvider.field_r[12] = RasterSnapshot.a(var2Lifetime15, 126);
          }
          byte[] var2Lifetime16 = LabeledField.loadNamedAsset("achievement_names,13", 10592);
          if (var2Lifetime16 != null) {
            CachedArchiveProvider.field_r[13] = RasterSnapshot.a(var2Lifetime16, 115);
          }
          byte[] var2Lifetime17 = LabeledField.loadNamedAsset("achievement_names,14", param0 ^ 10600);
          if (null != var2Lifetime17) {
            CachedArchiveProvider.field_r[14] = RasterSnapshot.a(var2Lifetime17, PacketBuffer.xor(param0, 123));
          }
          byte[] var2Lifetime18 = LabeledField.loadNamedAsset("achievement_names,15", 10592);
          if (null != var2Lifetime18) {
            CachedArchiveProvider.field_r[15] = RasterSnapshot.a(var2Lifetime18, 126);
          }
          byte[] var2Lifetime19 = LabeledField.loadNamedAsset("achievement_names,16", 10592);
          if (var2Lifetime19 != null) {
            CachedArchiveProvider.field_r[16] = RasterSnapshot.a(var2Lifetime19, 114);
          }
          byte[] var2Lifetime20 = LabeledField.loadNamedAsset("achievement_names,17", 10592);
          if (var2Lifetime20 != null) {
            CachedArchiveProvider.field_r[17] = RasterSnapshot.a(var2Lifetime20, param0 + 103);
          }
          byte[] var2Lifetime21 = LabeledField.loadNamedAsset("achievement_names,18", param0 ^ 10600);
          if (null != var2Lifetime21) {
            CachedArchiveProvider.field_r[18] = RasterSnapshot.a(var2Lifetime21, 112);
          }
          byte[] var2Lifetime22 = LabeledField.loadNamedAsset("achievement_names,19", param0 + 10584);
          if (null != var2Lifetime22) {
            CachedArchiveProvider.field_r[19] = RasterSnapshot.a(var2Lifetime22, 123);
          }
          byte[] var2Lifetime23 = LabeledField.loadNamedAsset("achievement_names,20", 10592);
          if (var2Lifetime23 != null) {
            CachedArchiveProvider.field_r[20] = RasterSnapshot.a(var2Lifetime23, 117);
          }
          byte[] var2Lifetime24 = LabeledField.loadNamedAsset("achievement_names,21", param0 ^ 10600);
          if (null != var2Lifetime24) {
            CachedArchiveProvider.field_r[21] = RasterSnapshot.a(var2Lifetime24, PacketBuffer.xor(param0, 122));
          }
          byte[] var2Lifetime25 = LabeledField.loadNamedAsset("achievement_names,22", 10592);
          if (var2Lifetime25 != null) {
            CachedArchiveProvider.field_r[22] = RasterSnapshot.a(var2Lifetime25, param0 + 117);
          }
          byte[] var2Lifetime26 = LabeledField.loadNamedAsset("achievement_names,23", 10592);
          if (null != var2Lifetime26) {
            CachedArchiveProvider.field_r[23] = RasterSnapshot.a(var2Lifetime26, 116);
          }
          byte[] var2Lifetime27 = LabeledField.loadNamedAsset("achievement_names,24", 10592);
          if (var2Lifetime27 != null) {
            CachedArchiveProvider.field_r[24] = RasterSnapshot.a(var2Lifetime27, 123);
          }
          byte[] var2Lifetime28 = LabeledField.loadNamedAsset("achievement_names,25", param0 ^ 10600);
          if (var2Lifetime28 != null) {
            CachedArchiveProvider.field_r[25] = RasterSnapshot.a(var2Lifetime28, 125);
          }
          byte[] var2Lifetime29 = LabeledField.loadNamedAsset("achievement_names,26", 10592);
          if (null != var2Lifetime29) {
            CachedArchiveProvider.field_r[26] = RasterSnapshot.a(var2Lifetime29, 115);
          }
          byte[] var2Lifetime30 = LabeledField.loadNamedAsset("achievement_names,27", 10592);
          if (var2Lifetime30 != null) {
            CachedArchiveProvider.field_r[27] = RasterSnapshot.a(var2Lifetime30, PacketBuffer.xor(param0, 116));
          }
          byte[] var2Lifetime31 = LabeledField.loadNamedAsset("achievement_names,28", 10592);
          if (var2Lifetime31 != null) {
            CachedArchiveProvider.field_r[28] = RasterSnapshot.a(var2Lifetime31, 126);
          }
          byte[] var2Lifetime32 = LabeledField.loadNamedAsset("achievement_names,29", param0 ^ 10600);
          if (var2Lifetime32 != null) {
            CachedArchiveProvider.field_r[29] = RasterSnapshot.a(var2Lifetime32, 127);
          }
          byte[] var2Lifetime33 = LabeledField.loadNamedAsset("achievement_names,30", param0 ^ 10600);
          if (var2Lifetime33 != null) {
            CachedArchiveProvider.field_r[30] = RasterSnapshot.a(var2Lifetime33, 112);
          }
          byte[] var2Lifetime34 = LabeledField.loadNamedAsset("achievement_names,31", 10592);
          if (var2Lifetime34 != null) {
            CachedArchiveProvider.field_r[31] = RasterSnapshot.a(var2Lifetime34, 124);
          }
          byte[] var2Lifetime35 = LabeledField.loadNamedAsset("achievement_descriptions,0", 10592);
          if (null != var2Lifetime35) {
            ResourceArchive.field_f[0] = RasterSnapshot.a(var2Lifetime35, 117);
          }
          byte[] var2Lifetime36 = LabeledField.loadNamedAsset("achievement_descriptions,1", 10592);
          if (var2Lifetime36 != null) {
            ResourceArchive.field_f[1] = RasterSnapshot.a(var2Lifetime36, PacketBuffer.xor(param0, 115));
          }
          byte[] var2Lifetime37 = LabeledField.loadNamedAsset("achievement_descriptions,2", 10592);
          if (var2Lifetime37 != null) {
            ResourceArchive.field_f[2] = RasterSnapshot.a(var2Lifetime37, 114);
          }
          byte[] var2Lifetime38 = LabeledField.loadNamedAsset("achievement_descriptions,3", 10592);
          if (var2Lifetime38 != null) {
            ResourceArchive.field_f[3] = RasterSnapshot.a(var2Lifetime38, 123);
          }
          byte[] var2Lifetime39 = LabeledField.loadNamedAsset("achievement_descriptions,4", 10592);
          if (null != var2Lifetime39) {
            ResourceArchive.field_f[4] = RasterSnapshot.a(var2Lifetime39, 121);
          }
          byte[] var2Lifetime40 = LabeledField.loadNamedAsset("achievement_descriptions,5", 10592);
          if (null != var2Lifetime40) {
            ResourceArchive.field_f[5] = RasterSnapshot.a(var2Lifetime40, param0 + 106);
          }
          byte[] var2Lifetime41 = LabeledField.loadNamedAsset("achievement_descriptions,6", 10592);
          if (var2Lifetime41 != null) {
            ResourceArchive.field_f[6] = RasterSnapshot.a(var2Lifetime41, 125);
          }
          byte[] var2Lifetime42 = LabeledField.loadNamedAsset("achievement_descriptions,7", 10592);
          if (var2Lifetime42 != null) {
            ResourceArchive.field_f[7] = RasterSnapshot.a(var2Lifetime42, 127);
          }
          byte[] var2Lifetime43 = LabeledField.loadNamedAsset("achievement_descriptions,8", param0 + 10584);
          if (var2Lifetime43 != null) {
            ResourceArchive.field_f[8] = RasterSnapshot.a(var2Lifetime43, PacketBuffer.xor(param0, 125));
          }
          byte[] var2Lifetime44 = LabeledField.loadNamedAsset("achievement_descriptions,9", 10592);
          if (null != var2Lifetime44) {
            ResourceArchive.field_f[9] = RasterSnapshot.a(var2Lifetime44, 110);
          }
          byte[] var2Lifetime45 = LabeledField.loadNamedAsset("achievement_descriptions,10", param0 ^ 10600);
          if (null != var2Lifetime45) {
            ResourceArchive.field_f[10] = RasterSnapshot.a(var2Lifetime45, 116);
          }
          byte[] var2Lifetime46 = LabeledField.loadNamedAsset("achievement_descriptions,11", 10592);
          if (var2Lifetime46 != null) {
            ResourceArchive.field_f[11] = RasterSnapshot.a(var2Lifetime46, param0 + 113);
          }
          byte[] var2Lifetime47 = LabeledField.loadNamedAsset("achievement_descriptions,12", param0 + 10584);
          if (var2Lifetime47 != null) {
            ResourceArchive.field_f[12] = RasterSnapshot.a(var2Lifetime47, 119);
          }
          byte[] var2Lifetime48 = LabeledField.loadNamedAsset("achievement_descriptions,13", 10592);
          if (null != var2Lifetime48) {
            ResourceArchive.field_f[13] = RasterSnapshot.a(var2Lifetime48, 117);
          }
          byte[] var2Lifetime49 = LabeledField.loadNamedAsset("achievement_descriptions,14", 10592);
          if (var2Lifetime49 != null) {
            ResourceArchive.field_f[14] = RasterSnapshot.a(var2Lifetime49, 119);
          }
          byte[] var2Lifetime50 = LabeledField.loadNamedAsset("achievement_descriptions,15", param0 + 10584);
          if (var2Lifetime50 != null) {
            ResourceArchive.field_f[15] = RasterSnapshot.a(var2Lifetime50, 115);
          }
          byte[] var2Lifetime51 = LabeledField.loadNamedAsset("achievement_descriptions,16", 10592);
          if (null != var2Lifetime51) {
            ResourceArchive.field_f[16] = RasterSnapshot.a(var2Lifetime51, param0 + 108);
          }
          byte[] var2Lifetime52 = LabeledField.loadNamedAsset("achievement_descriptions,17", 10592);
          if (var2Lifetime52 != null) {
            ResourceArchive.field_f[17] = RasterSnapshot.a(var2Lifetime52, 112);
          }
          byte[] var2Lifetime53 = LabeledField.loadNamedAsset("achievement_descriptions,18", 10592);
          if (var2Lifetime53 != null) {
            ResourceArchive.field_f[18] = RasterSnapshot.a(var2Lifetime53, 120);
          }
          byte[] var2Lifetime54 = LabeledField.loadNamedAsset("achievement_descriptions,19", 10592);
          if (var2Lifetime54 != null) {
            ResourceArchive.field_f[19] = RasterSnapshot.a(var2Lifetime54, 119);
          }
          byte[] var2Lifetime55 = LabeledField.loadNamedAsset("achievement_descriptions,20", 10592);
          if (null != var2Lifetime55) {
            ResourceArchive.field_f[20] = RasterSnapshot.a(var2Lifetime55, 124);
          }
          byte[] var2Lifetime56 = LabeledField.loadNamedAsset("achievement_descriptions,21", 10592);
          if (var2Lifetime56 != null) {
            ResourceArchive.field_f[21] = RasterSnapshot.a(var2Lifetime56, 113);
          }
          byte[] var2Lifetime57 = LabeledField.loadNamedAsset("achievement_descriptions,22", 10592);
          if (var2Lifetime57 != null) {
            ResourceArchive.field_f[22] = RasterSnapshot.a(var2Lifetime57, 114);
          }
          if (param0 != 8) {
            RegistrationRequestDialog.a(58, (ResourceArchive) null);
          }
          byte[] var2Lifetime58 = LabeledField.loadNamedAsset("achievement_descriptions,23", 10592);
          if (null != var2Lifetime58) {
            ResourceArchive.field_f[23] = RasterSnapshot.a(var2Lifetime58, 115);
          }
          byte[] var2Lifetime59 = LabeledField.loadNamedAsset("achievement_descriptions,24", param0 + 10584);
          if (null != var2Lifetime59) {
            ResourceArchive.field_f[24] = RasterSnapshot.a(var2Lifetime59, 114);
          }
          byte[] var2Lifetime60 = LabeledField.loadNamedAsset("achievement_descriptions,25", 10592);
          if (null != var2Lifetime60) {
            ResourceArchive.field_f[25] = RasterSnapshot.a(var2Lifetime60, 110);
          }
          byte[] var2Lifetime61 = LabeledField.loadNamedAsset("achievement_descriptions,26", 10592);
          if (null != var2Lifetime61) {
            ResourceArchive.field_f[26] = RasterSnapshot.a(var2Lifetime61, 112);
          }
          byte[] var2Lifetime62 = LabeledField.loadNamedAsset("achievement_descriptions,27", param0 ^ 10600);
          if (var2Lifetime62 != null) {
            ResourceArchive.field_f[27] = RasterSnapshot.a(var2Lifetime62, 123);
          }
          byte[] var2Lifetime63 = LabeledField.loadNamedAsset("achievement_descriptions,28", 10592);
          if (var2Lifetime63 != null) {
            ResourceArchive.field_f[28] = RasterSnapshot.a(var2Lifetime63, param0 + 109);
          }
          byte[] var2Lifetime64 = LabeledField.loadNamedAsset("achievement_descriptions,29", 10592);
          if (var2Lifetime64 != null) {
            ResourceArchive.field_f[29] = RasterSnapshot.a(var2Lifetime64, 118);
          }
          byte[] var2Lifetime65 = LabeledField.loadNamedAsset("achievement_descriptions,30", param0 + 10584);
          if (null != var2Lifetime65) {
            ResourceArchive.field_f[30] = RasterSnapshot.a(var2Lifetime65, 110);
          }
          byte[] var2Lifetime66 = LabeledField.loadNamedAsset("achievement_descriptions,31", param0 + 10584);
          if (var2Lifetime66 != null) {
            ResourceArchive.field_f[31] = RasterSnapshot.a(var2Lifetime66, 122);
          }
          byte[] var2Lifetime67 = LabeledField.loadNamedAsset("originalLevelNames,0", 10592);
          if (null != var2Lifetime67) {
            ProxySocketConnector.field_o[0] = RasterSnapshot.a(var2Lifetime67, 110);
          }
          byte[] var2Lifetime68 = LabeledField.loadNamedAsset("originalLevelNames,1", 10592);
          if (null != var2Lifetime68) {
            ProxySocketConnector.field_o[1] = RasterSnapshot.a(var2Lifetime68, 125);
          }
          byte[] var2Lifetime69 = LabeledField.loadNamedAsset("originalLevelNames,2", param0 ^ 10600);
          if (null != var2Lifetime69) {
            ProxySocketConnector.field_o[2] = RasterSnapshot.a(var2Lifetime69, 115);
          }
          byte[] var2Lifetime70 = LabeledField.loadNamedAsset("originalLevelNames,3", 10592);
          if (var2Lifetime70 != null) {
            ProxySocketConnector.field_o[3] = RasterSnapshot.a(var2Lifetime70, 126);
          }
          byte[] var2Lifetime71 = LabeledField.loadNamedAsset("originalLevelNames,4", 10592);
          if (var2Lifetime71 != null) {
            ProxySocketConnector.field_o[4] = RasterSnapshot.a(var2Lifetime71, 126);
          }
          byte[] var2Lifetime72 = LabeledField.loadNamedAsset("originalLevelNames,5", 10592);
          if (null != var2Lifetime72) {
            ProxySocketConnector.field_o[5] = RasterSnapshot.a(var2Lifetime72, 124);
          }
          byte[] var2Lifetime73 = LabeledField.loadNamedAsset("originalLevelNames,6", 10592);
          if (null != var2Lifetime73) {
            ProxySocketConnector.field_o[6] = RasterSnapshot.a(var2Lifetime73, PacketBuffer.xor(param0, 121));
          }
          byte[] var2Lifetime74 = LabeledField.loadNamedAsset("originalLevelNames,7", param0 ^ 10600);
          if (null != var2Lifetime74) {
            ProxySocketConnector.field_o[7] = RasterSnapshot.a(var2Lifetime74, 119);
          }
          byte[] var2Lifetime75 = LabeledField.loadNamedAsset("originalLevelNames,8", 10592);
          if (var2Lifetime75 != null) {
            ProxySocketConnector.field_o[8] = RasterSnapshot.a(var2Lifetime75, 126);
          }
          byte[] var2Lifetime76 = LabeledField.loadNamedAsset("originalLevelNames,9", 10592);
          if (var2Lifetime76 != null) {
            ProxySocketConnector.field_o[9] = RasterSnapshot.a(var2Lifetime76, 111);
          }
          byte[] var2Lifetime77 = LabeledField.loadNamedAsset("originalLevelNames,10", 10592);
          if (var2Lifetime77 != null) {
            ProxySocketConnector.field_o[10] = RasterSnapshot.a(var2Lifetime77, PacketBuffer.xor(param0, 123));
          }
          byte[] var2Lifetime78 = LabeledField.loadNamedAsset("originalLevelNames,11", param0 + 10584);
          if (null != var2Lifetime78) {
            ProxySocketConnector.field_o[11] = RasterSnapshot.a(var2Lifetime78, 113);
          }
          byte[] var2Lifetime79 = LabeledField.loadNamedAsset("originalLevelNames,12", param0 + 10584);
          if (var2Lifetime79 != null) {
            ProxySocketConnector.field_o[12] = RasterSnapshot.a(var2Lifetime79, 121);
          }
          byte[] var2Lifetime80 = LabeledField.loadNamedAsset("originalLevelNames,13", param0 + 10584);
          if (null != var2Lifetime80) {
            ProxySocketConnector.field_o[13] = RasterSnapshot.a(var2Lifetime80, 118);
          }
          byte[] var2Lifetime81 = LabeledField.loadNamedAsset("originalLevelNames,14", 10592);
          if (null != var2Lifetime81) {
            ProxySocketConnector.field_o[14] = RasterSnapshot.a(var2Lifetime81, 121);
          }
          byte[] var2Lifetime82 = LabeledField.loadNamedAsset("originalLevelNames,15", 10592);
          if (var2Lifetime82 != null) {
            ProxySocketConnector.field_o[15] = RasterSnapshot.a(var2Lifetime82, 116);
          }
          byte[] var2Lifetime83 = LabeledField.loadNamedAsset("vengenceLevelNames,0", 10592);
          if (var2Lifetime83 != null) {
            vd.field_d[0] = RasterSnapshot.a(var2Lifetime83, 119);
          }
          byte[] var2Lifetime84 = LabeledField.loadNamedAsset("vengenceLevelNames,1", 10592);
          if (var2Lifetime84 != null) {
            vd.field_d[1] = RasterSnapshot.a(var2Lifetime84, param0 + 102);
          }
          byte[] var2Lifetime85 = LabeledField.loadNamedAsset("vengenceLevelNames,2", param0 ^ 10600);
          if (var2Lifetime85 != null) {
            vd.field_d[2] = RasterSnapshot.a(var2Lifetime85, 120);
          }
          byte[] var2Lifetime86 = LabeledField.loadNamedAsset("vengenceLevelNames,3", param0 ^ 10600);
          if (null != var2Lifetime86) {
            vd.field_d[3] = RasterSnapshot.a(var2Lifetime86, param0 + 110);
          }
          byte[] var2Lifetime87 = LabeledField.loadNamedAsset("vengenceLevelNames,4", 10592);
          if (var2Lifetime87 != null) {
            vd.field_d[4] = RasterSnapshot.a(var2Lifetime87, param0 + 107);
          }
          byte[] var2Lifetime88 = LabeledField.loadNamedAsset("vengenceLevelNames,5", 10592);
          if (var2Lifetime88 != null) {
            vd.field_d[5] = RasterSnapshot.a(var2Lifetime88, 112);
          }
          byte[] var2Lifetime89 = LabeledField.loadNamedAsset("vengenceLevelNames,6", 10592);
          if (null != var2Lifetime89) {
            vd.field_d[6] = RasterSnapshot.a(var2Lifetime89, 118);
          }
          byte[] var2Lifetime90 = LabeledField.loadNamedAsset("vengenceLevelNames,7", 10592);
          if (var2Lifetime90 != null) {
            vd.field_d[7] = RasterSnapshot.a(var2Lifetime90, param0 + 115);
          }
          byte[] var2Lifetime91 = LabeledField.loadNamedAsset("vengenceLevelNames,8", 10592);
          if (var2Lifetime91 != null) {
            vd.field_d[8] = RasterSnapshot.a(var2Lifetime91, 120);
          }
          byte[] var2Lifetime92 = LabeledField.loadNamedAsset("vengenceLevelNames,9", 10592);
          if (var2Lifetime92 != null) {
            vd.field_d[9] = RasterSnapshot.a(var2Lifetime92, 118);
          }
          byte[] var2Lifetime93 = LabeledField.loadNamedAsset("vengenceLevelNames,10", 10592);
          if (var2Lifetime93 != null) {
            vd.field_d[10] = RasterSnapshot.a(var2Lifetime93, PacketBuffer.xor(param0, 122));
          }
          byte[] var2Lifetime94 = LabeledField.loadNamedAsset("vengenceLevelNames,11", param0 + 10584);
          if (var2Lifetime94 != null) {
            vd.field_d[11] = RasterSnapshot.a(var2Lifetime94, 112);
          }
          byte[] var2Lifetime95 = LabeledField.loadNamedAsset("vengenceLevelNames,12", 10592);
          if (null != var2Lifetime95) {
            vd.field_d[12] = RasterSnapshot.a(var2Lifetime95, 125);
          }
          byte[] var2Lifetime96 = LabeledField.loadNamedAsset("vengenceLevelNames,13", 10592);
          if (var2Lifetime96 != null) {
            vd.field_d[13] = RasterSnapshot.a(var2Lifetime96, 110);
          }
          byte[] var2Lifetime97 = LabeledField.loadNamedAsset("vengenceLevelNames,14", 10592);
          if (null != var2Lifetime97) {
            vd.field_d[14] = RasterSnapshot.a(var2Lifetime97, PacketBuffer.xor(param0, 112));
          }
          byte[] var2Lifetime98 = LabeledField.loadNamedAsset("vengenceLevelNames,15", param0 ^ 10600);
          if (null != var2Lifetime98) {
            vd.field_d[15] = RasterSnapshot.a(var2Lifetime98, 120);
          }
          byte[] var2Lifetime99 = LabeledField.loadNamedAsset("simulatorLevelNames,0", 10592);
          if (var2Lifetime99 != null) {
            ThreeSliceButtonPainter.field_u[0] = RasterSnapshot.a(var2Lifetime99, 112);
          }
          byte[] var2Lifetime100 = LabeledField.loadNamedAsset("simulatorLevelNames,1", 10592);
          if (var2Lifetime100 != null) {
            ThreeSliceButtonPainter.field_u[1] = RasterSnapshot.a(var2Lifetime100, param0 + 114);
          }
          byte[] var2Lifetime101 = LabeledField.loadNamedAsset("simulatorLevelNames,2", 10592);
          if (var2Lifetime101 != null) {
            ThreeSliceButtonPainter.field_u[2] = RasterSnapshot.a(var2Lifetime101, 114);
          }
          byte[] var2Lifetime102 = LabeledField.loadNamedAsset("simulatorLevelNames,3", param0 + 10584);
          if (var2Lifetime102 != null) {
            ThreeSliceButtonPainter.field_u[3] = RasterSnapshot.a(var2Lifetime102, 112);
          }
          byte[] var2Lifetime103 = LabeledField.loadNamedAsset("simulatorLevelNames,4", 10592);
          if (null != var2Lifetime103) {
            ThreeSliceButtonPainter.field_u[4] = RasterSnapshot.a(var2Lifetime103, 125);
          }
          byte[] var2Lifetime104 = LabeledField.loadNamedAsset("simulatorLevelNames,5", 10592);
          if (null != var2Lifetime104) {
            ThreeSliceButtonPainter.field_u[5] = RasterSnapshot.a(var2Lifetime104, 115);
          }
          byte[] var2Lifetime105 = LabeledField.loadNamedAsset("simulatorLevelNames,6", 10592);
          if (null != var2Lifetime105) {
            ThreeSliceButtonPainter.field_u[6] = RasterSnapshot.a(var2Lifetime105, 114);
          }
          byte[] var2Lifetime106 = LabeledField.loadNamedAsset("simulatorLevelNames,7", 10592);
          if (var2Lifetime106 != null) {
            ThreeSliceButtonPainter.field_u[7] = RasterSnapshot.a(var2Lifetime106, 121);
          }
          byte[] var2Lifetime107 = LabeledField.loadNamedAsset("simulatorLevelNames,8", 10592);
          if (var2Lifetime107 != null) {
            ThreeSliceButtonPainter.field_u[8] = RasterSnapshot.a(var2Lifetime107, 125);
          }
          byte[] var2Lifetime108 = LabeledField.loadNamedAsset("simulatorLevelNames,9", 10592);
          if (null != var2Lifetime108) {
            ThreeSliceButtonPainter.field_u[9] = RasterSnapshot.a(var2Lifetime108, PacketBuffer.xor(param0, 114));
          }
          byte[] var2Lifetime109 = LabeledField.loadNamedAsset("simulatorLevelNames,10", 10592);
          if (var2Lifetime109 != null) {
            ThreeSliceButtonPainter.field_u[10] = RasterSnapshot.a(var2Lifetime109, 114);
          }
          byte[] var2Lifetime110 = LabeledField.loadNamedAsset("simulatorLevelNames,11", 10592);
          if (null != var2Lifetime110) {
            ThreeSliceButtonPainter.field_u[11] = RasterSnapshot.a(var2Lifetime110, PacketBuffer.xor(param0, 117));
          }
          byte[] var2Lifetime111 = LabeledField.loadNamedAsset("simulatorLevelNames,12", param0 ^ 10600);
          if (null != var2Lifetime111) {
            ThreeSliceButtonPainter.field_u[12] = RasterSnapshot.a(var2Lifetime111, 124);
          }
          byte[] var2Lifetime112 = LabeledField.loadNamedAsset("simulatorLevelNames,13", 10592);
          if (var2Lifetime112 != null) {
            ThreeSliceButtonPainter.field_u[13] = RasterSnapshot.a(var2Lifetime112, 117);
          }
          byte[] var2Lifetime113 = LabeledField.loadNamedAsset("simulatorLevelNames,14", 10592);
          if (var2Lifetime113 != null) {
            ThreeSliceButtonPainter.field_u[14] = RasterSnapshot.a(var2Lifetime113, 125);
          }
          byte[] var2Lifetime114 = LabeledField.loadNamedAsset("simulatorLevelNames,15", param0 + 10584);
          if (null != var2Lifetime114) {
            ThreeSliceButtonPainter.field_u[15] = RasterSnapshot.a(var2Lifetime114, param0 + 119);
          }
          byte[] var2Lifetime115 = LabeledField.loadNamedAsset("leftarrow", 10592);
          if (null != var2Lifetime115) {
            um.field_c = RasterSnapshot.a(var2Lifetime115, 126);
          }
          byte[] var2Lifetime116 = LabeledField.loadNamedAsset("rightarrow", 10592);
          if (null != var2Lifetime116) {
            ProgressQuery.field_i = RasterSnapshot.a(var2Lifetime116, 124);
          }
          byte[] var2Lifetime117 = LabeledField.loadNamedAsset("uparrow", 10592);
          if (var2Lifetime117 != null) {
            PacketBuffer.field_k = RasterSnapshot.a(var2Lifetime117, 116);
          }
          byte[] var2Lifetime118 = LabeledField.loadNamedAsset("ctrlkey", param0 ^ 10600);
          if (var2Lifetime118 != null) {
            SpriteOffset.field_a = RasterSnapshot.a(var2Lifetime118, 126);
          }
          byte[] var2Lifetime119 = LabeledField.loadNamedAsset("shieldkeys", 10592);
          if (null != var2Lifetime119) {
            SpriteStrip.field_h = RasterSnapshot.a(var2Lifetime119, 116);
          }
          byte[] var2Lifetime120 = LabeledField.loadNamedAsset("rockbusterkeys", param0 ^ 10600);
          if (null != var2Lifetime120) {
            ArchiveKeyRequest.field_h = RasterSnapshot.a(var2Lifetime120, 114);
          }
          byte[] var2Lifetime121 = LabeledField.loadNamedAsset("minimapkey", param0 + 10584);
          if (var2Lifetime121 != null) {
            ea.field_i = RasterSnapshot.a(var2Lifetime121, 126);
          }
          byte[] var2Lifetime122 = LabeledField.loadNamedAsset("minimap_message", 10592);
          if (var2Lifetime122 != null) {
            TetherHumStream.field_n = RasterSnapshot.a(var2Lifetime122, 123);
          }
          byte[] var2Lifetime123 = LabeledField.loadNamedAsset("keycode_minimap", param0 + 10584);
          if (var2Lifetime123 != null) {
            of.field_c = 255 & var2Lifetime123[0];
          }
          byte[] var2Lifetime124 = LabeledField.loadNamedAsset("keycode_rockbuster", param0 ^ 10600);
          if (var2Lifetime124 != null) {
            LegacyTextBlock.field_a = 255 & var2Lifetime124[0];
          }
          byte[] var2Lifetime125 = LabeledField.loadNamedAsset("rotateshipleft", 10592);
          if (var2Lifetime125 != null) {
            ug.field_b = RasterSnapshot.a(var2Lifetime125, 120);
          }
          byte[] var2Lifetime126 = LabeledField.loadNamedAsset("rotateshipright", 10592);
          if (null != var2Lifetime126) {
            QuickChatPhraseDefinition.field_w = RasterSnapshot.a(var2Lifetime126, 126);
          }
          byte[] var2Lifetime127 = LabeledField.loadNamedAsset("thrust", 10592);
          if (var2Lifetime127 != null) {
            mj.field_c = RasterSnapshot.a(var2Lifetime127, param0 + 116);
          }
          byte[] var2Lifetime128 = LabeledField.loadNamedAsset("shoot", 10592);
          if (null != var2Lifetime128) {
            qj.field_e = RasterSnapshot.a(var2Lifetime128, 121);
          }
          byte[] var2Lifetime129 = LabeledField.loadNamedAsset("activateshield", 10592);
          if (null != var2Lifetime129) {
            oh.field_k = RasterSnapshot.a(var2Lifetime129, 126);
          }
          byte[] var2Lifetime130 = LabeledField.loadNamedAsset("firerockbuster", param0 ^ 10600);
          if (var2Lifetime130 != null) {
            DynamicTerrainRenderer.field_t = RasterSnapshot.a(var2Lifetime130, param0 + 104);
          }
          byte[] var2Lifetime131 = LabeledField.loadNamedAsset("showhideminimap", 10592);
          if (var2Lifetime131 != null) {
            cj.field_b = RasterSnapshot.a(var2Lifetime131, 112);
          }
          byte[] var2Lifetime132 = LabeledField.loadNamedAsset("objectivetext1", 10592);
          if (var2Lifetime132 != null) {
            on.field_c = RasterSnapshot.a(var2Lifetime132, param0 + 117);
          }
          byte[] var2Lifetime133 = LabeledField.loadNamedAsset("objectivetext2", param0 ^ 10600);
          if (var2Lifetime133 != null) {
            fk.field_e = RasterSnapshot.a(var2Lifetime133, 112);
          }
          byte[] var2Lifetime134 = LabeledField.loadNamedAsset("objective_tutorial", 10592);
          if (null != var2Lifetime134) {
            AccountRegistrationPanel.field_O = RasterSnapshot.a(var2Lifetime134, 112);
          }
          byte[] var2Lifetime135 = LabeledField.loadNamedAsset("objective_enterthecave", param0 + 10584);
          if (null != var2Lifetime135) {
            LevelObject.field_q = RasterSnapshot.a(var2Lifetime135, 116);
          }
          byte[] var2Lifetime136 = LabeledField.loadNamedAsset("objective_retribution", 10592);
          if (var2Lifetime136 != null) {
            mh.field_g = RasterSnapshot.a(var2Lifetime136, param0 ^ 122);
          }
          byte[] var2Lifetime137 = LabeledField.loadNamedAsset("objective_simulator", 10592);
          if (null != var2Lifetime137) {
            TriangleMesh.field_p = RasterSnapshot.a(var2Lifetime137, 110);
          }
          byte[] var2Lifetime138 = LabeledField.loadNamedAsset("title_objective_retrieval", 10592);
          if (var2Lifetime138 != null) {
            km.field_o = RasterSnapshot.a(var2Lifetime138, 110);
          }
          byte[] var2Lifetime139 = LabeledField.loadNamedAsset("title_objective_retribution", 10592);
          if (var2Lifetime139 != null) {
            PairedTextColumns.field_s = RasterSnapshot.a(var2Lifetime139, 127);
          }
          byte[] var2Lifetime140 = LabeledField.loadNamedAsset("title_objective_simulator", param0 ^ 10600);
          if (var2Lifetime140 != null) {
            pl.field_p = RasterSnapshot.a(var2Lifetime140, 117);
          }
          byte[] var2Lifetime141 = LabeledField.loadNamedAsset("objective_flycontaineraway,0", 10592);
          if (null != var2Lifetime141) {
            AccountRequestDialog.field_qb[0] = RasterSnapshot.a(var2Lifetime141, 119);
          }
          byte[] var2Lifetime142 = LabeledField.loadNamedAsset("objective_flycontaineraway,1", param0 + 10584);
          if (var2Lifetime142 != null) {
            AccountRequestDialog.field_qb[1] = RasterSnapshot.a(var2Lifetime142, 123);
          }
          byte[] var2Lifetime143 = LabeledField.loadNamedAsset("objective_flycontaineraway,2", 10592);
          if (null != var2Lifetime143) {
            AccountRequestDialog.field_qb[2] = RasterSnapshot.a(var2Lifetime143, 127);
          }
          byte[] var2Lifetime144 = LabeledField.loadNamedAsset("objective_flyawayintact,0", 10592);
          if (var2Lifetime144 != null) {
            EmailAvailabilityRequest.field_f[0] = RasterSnapshot.a(var2Lifetime144, 119);
          }
          byte[] var2Lifetime145 = LabeledField.loadNamedAsset("objective_flyawayintact,1", param0 ^ 10600);
          if (null != var2Lifetime145) {
            EmailAvailabilityRequest.field_f[1] = RasterSnapshot.a(var2Lifetime145, 120);
          }
          byte[] var2Lifetime146 = LabeledField.loadNamedAsset("objective_flyawayintact,2", 10592);
          if (null != var2Lifetime146) {
            EmailAvailabilityRequest.field_f[2] = RasterSnapshot.a(var2Lifetime146, param0 + 108);
          }
          byte[] var2Lifetime147 = LabeledField.loadNamedAsset("objective_infrastructure", 10592);
          if (var2Lifetime147 != null) {
            PairedTextColumns.field_r = RasterSnapshot.a(var2Lifetime147, param0 ^ 116);
          }
          byte[] var2Lifetime148 = LabeledField.loadNamedAsset("objective_crate", 10592);
          if (null != var2Lifetime148) {
            tf.field_i = RasterSnapshot.a(var2Lifetime148, 122);
          }
          byte[] var2Lifetime149 = LabeledField.loadNamedAsset("autodestruct_warning", 10592);
          if (var2Lifetime149 != null) {
            di.field_c = RasterSnapshot.a(var2Lifetime149, 122);
          }
          byte[] var2Lifetime150 = LabeledField.loadNamedAsset("target_destroyed", 10592);
          if (var2Lifetime150 != null) {
            DisplayNameForm.field_J = RasterSnapshot.a(var2Lifetime150, 123);
          }
          byte[] var2Lifetime151 = LabeledField.loadNamedAsset("objective_levelcomplete", param0 + 10584);
          if (var2Lifetime151 != null) {
            pf.field_h = RasterSnapshot.a(var2Lifetime151, 127);
          }
          byte[] var2Lifetime152 = LabeledField.loadNamedAsset("objective_levelwillrestart", 10592);
          if (var2Lifetime152 != null) {
            AccountTermsPanel.field_M = RasterSnapshot.a(var2Lifetime152, param0 ^ 112);
          }
          byte[] var2Lifetime153 = LabeledField.loadNamedAsset("warning_highgravity", 10592);
          if (var2Lifetime153 != null) {
            WeightedLruCache.field_e = RasterSnapshot.a(var2Lifetime153, param0 ^ 124);
          }
          byte[] var2Lifetime154 = LabeledField.loadNamedAsset("outoffuel", 10592);
          if (null != var2Lifetime154) {
            RatingQuery.field_l = RasterSnapshot.a(var2Lifetime154, param0 ^ 119);
          }
          byte[] var2Lifetime155 = LabeledField.loadNamedAsset("outofshield", 10592);
          if (null != var2Lifetime155) {
            rc.field_c = RasterSnapshot.a(var2Lifetime155, param0 ^ 117);
          }
          byte[] var2Lifetime156 = LabeledField.loadNamedAsset("cannotloadpowerup", 10592);
          if (null != var2Lifetime156) {
            on.field_d = RasterSnapshot.a(var2Lifetime156, 127);
          }
          byte[] var2Lifetime157 = LabeledField.loadNamedAsset("containerisonhill", param0 + 10584);
          if (null != var2Lifetime157) {
            ff.field_f = RasterSnapshot.a(var2Lifetime157, param0 + 102);
          }
          byte[] var2Lifetime158 = LabeledField.loadNamedAsset("explosiveisonhill", 10592);
          if (null != var2Lifetime158) {
            ui.field_d = RasterSnapshot.a(var2Lifetime158, param0 ^ 103);
          }
          byte[] var2Lifetime159 = LabeledField.loadNamedAsset("powerupisonhill", 10592);
          if (null != var2Lifetime159) {
            nn.field_c = RasterSnapshot.a(var2Lifetime159, 122);
          }
          byte[] var2Lifetime160 = LabeledField.loadNamedAsset("tetherwillnotreach", param0 + 10584);
          if (var2Lifetime160 != null) {
            NineSliceFrame.field_e = RasterSnapshot.a(var2Lifetime160, param0 + 112);
          }
          byte[] var2Lifetime161 = LabeledField.loadNamedAsset("shieldrecharged", 10592);
          if (var2Lifetime161 != null) {
            qh.field_e = RasterSnapshot.a(var2Lifetime161, 121);
          }
          byte[] var2Lifetime162 = LabeledField.loadNamedAsset("tripleshot", 10592);
          if (var2Lifetime162 != null) {
            DelegatingCanvas.field_a = RasterSnapshot.a(var2Lifetime162, 124);
          }
          byte[] var2Lifetime163 = LabeledField.loadNamedAsset("extrathrust", param0 + 10584);
          if (null != var2Lifetime163) {
            oh.field_g = RasterSnapshot.a(var2Lifetime163, 122);
          }
          byte[] var2Lifetime164 = LabeledField.loadNamedAsset("rockbuster_entertofire", param0 ^ 10600);
          if (null != var2Lifetime164) {
            WidgetStyleLayer.field_k = RasterSnapshot.a(var2Lifetime164, 111);
          }
          byte[] var2Lifetime165 = LabeledField.loadNamedAsset("rockbuster", param0 ^ 10600);
          if (null != var2Lifetime165) {
            Minimap.field_p = RasterSnapshot.a(var2Lifetime165, param0 + 109);
          }
          byte[] var2Lifetime166 = LabeledField.loadNamedAsset("fiverockbusters_entertofire", 10592);
          if (var2Lifetime166 != null) {
            PcmResampler.field_b = RasterSnapshot.a(var2Lifetime166, 127);
          }
          byte[] var2Lifetime167 = LabeledField.loadNamedAsset("fiverockbusters", 10592);
          if (var2Lifetime167 != null) {
            FullscreenFocusCanvas.field_g = RasterSnapshot.a(var2Lifetime167, 123);
          }
          byte[] var2Lifetime168 = LabeledField.loadNamedAsset("powerup_shield", 10592);
          if (var2Lifetime168 != null) {
            nl.field_a = RasterSnapshot.a(var2Lifetime168, 117);
          }
          byte[] var2Lifetime169 = LabeledField.loadNamedAsset("powerup_tripleshot", 10592);
          if (null != var2Lifetime169) {
            kc.field_a = RasterSnapshot.a(var2Lifetime169, 124);
          }
          byte[] var2Lifetime170 = LabeledField.loadNamedAsset("powerup_extrathrust", 10592);
          if (var2Lifetime170 != null) {
            ArchiveProvider.field_c = RasterSnapshot.a(var2Lifetime170, 125);
          }
          byte[] var2Lifetime171 = LabeledField.loadNamedAsset("powerup_rockbuster", param0 + 10584);
          if (null != var2Lifetime171) {
            gn.field_l = RasterSnapshot.a(var2Lifetime171, 114);
          }
          byte[] var2Lifetime172 = LabeledField.loadNamedAsset("powerup_fiverockbusters", 10592);
          if (var2Lifetime172 != null) {
            NodeHashTableIterator.field_a = RasterSnapshot.a(var2Lifetime172, 111);
          }
          byte[] var2Lifetime173 = LabeledField.loadNamedAsset("crate", 10592);
          if (null != var2Lifetime173) {
            gk.field_b = RasterSnapshot.a(var2Lifetime173, 118);
          }
          byte[] var2Lifetime174 = LabeledField.loadNamedAsset("tnt", 10592);
          if (var2Lifetime174 != null) {
            UiContainer.field_D = RasterSnapshot.a(var2Lifetime174, 122);
          }
          byte[] var2Lifetime175 = LabeledField.loadNamedAsset("containerdestroyed", 10592);
          if (var2Lifetime175 != null) {
            EmailSyntaxValidator.field_n = RasterSnapshot.a(var2Lifetime175, param0 + 117);
          }
          byte[] var2Lifetime176 = LabeledField.loadNamedAsset("containerdestroyed_tutorial", 10592);
          if (var2Lifetime176 != null) {
            field_xb = RasterSnapshot.a(var2Lifetime176, 123);
          }
          byte[] var2Lifetime177 = LabeledField.loadNamedAsset("containernotretrieved", 10592);
          if (var2Lifetime177 != null) {
            LabeledField.field_I = RasterSnapshot.a(var2Lifetime177, 127);
          }
          byte[] var2Lifetime178 = LabeledField.loadNamedAsset("restartinglevel", 10592);
          if (var2Lifetime178 != null) {
            LegacyTextBlock.field_c = RasterSnapshot.a(var2Lifetime178, 126);
          }
          byte[] var2Lifetime179 = LabeledField.loadNamedAsset("autoshield_off", 10592);
          if (var2Lifetime179 != null) {
            bh.field_e = RasterSnapshot.a(var2Lifetime179, 117);
          }
          byte[] var2Lifetime180 = LabeledField.loadNamedAsset("autoshield_on", 10592);
          if (null != var2Lifetime180) {
            AudioService.field_a = RasterSnapshot.a(var2Lifetime180, param0 + 117);
          }
          byte[] var2Lifetime181 = LabeledField.loadNamedAsset("tutorialtext,0", 10592);
          if (null != var2Lifetime181) {
            SeekerMine.field_k[0] = RasterSnapshot.a(var2Lifetime181, PacketBuffer.xor(param0, 114));
          }
          byte[] var2Lifetime182 = LabeledField.loadNamedAsset("tutorialtext,1", param0 + 10584);
          if (null != var2Lifetime182) {
            SeekerMine.field_k[1] = RasterSnapshot.a(var2Lifetime182, 122);
          }
          byte[] var2Lifetime183 = LabeledField.loadNamedAsset("tutorialtext,2", 10592);
          if (var2Lifetime183 != null) {
            SeekerMine.field_k[2] = RasterSnapshot.a(var2Lifetime183, 121);
          }
          byte[] var2Lifetime184 = LabeledField.loadNamedAsset("tutorialtext,3", param0 + 10584);
          if (null != var2Lifetime184) {
            SeekerMine.field_k[3] = RasterSnapshot.a(var2Lifetime184, 125);
          }
          byte[] var2Lifetime185 = LabeledField.loadNamedAsset("tutorialtext,4", 10592);
          if (var2Lifetime185 != null) {
            SeekerMine.field_k[4] = RasterSnapshot.a(var2Lifetime185, PacketBuffer.xor(param0, 120));
          }
          byte[] var2Lifetime186 = LabeledField.loadNamedAsset("tutorialtext,5", 10592);
          if (var2Lifetime186 != null) {
            SeekerMine.field_k[5] = RasterSnapshot.a(var2Lifetime186, 120);
          }
          byte[] var2Lifetime187 = LabeledField.loadNamedAsset("tutorialtext,6", 10592);
          if (var2Lifetime187 != null) {
            SeekerMine.field_k[6] = RasterSnapshot.a(var2Lifetime187, param0 + 102);
          }
          byte[] var2Lifetime188 = LabeledField.loadNamedAsset("tutorialtext,7", 10592);
          if (null != var2Lifetime188) {
            SeekerMine.field_k[7] = RasterSnapshot.a(var2Lifetime188, PacketBuffer.xor(param0, 127));
          }
          byte[] var2Lifetime189 = LabeledField.loadNamedAsset("tutorialtext,8", param0 + 10584);
          if (var2Lifetime189 != null) {
            SeekerMine.field_k[8] = RasterSnapshot.a(var2Lifetime189, PacketBuffer.xor(param0, 126));
          }
          byte[] var2Lifetime190 = LabeledField.loadNamedAsset("tutorialtext,9", 10592);
          if (var2Lifetime190 != null) {
            SeekerMine.field_k[9] = RasterSnapshot.a(var2Lifetime190, 122);
          }
          byte[] var2Lifetime191 = LabeledField.loadNamedAsset("tutorialtext,10", 10592);
          if (null != var2Lifetime191) {
            SeekerMine.field_k[10] = RasterSnapshot.a(var2Lifetime191, PacketBuffer.xor(param0, 114));
          }
          byte[] var2Lifetime192 = LabeledField.loadNamedAsset("tutorialtext,11", 10592);
          if (null != var2Lifetime192) {
            SeekerMine.field_k[11] = RasterSnapshot.a(var2Lifetime192, param0 + 114);
          }
          byte[] var2Lifetime193 = LabeledField.loadNamedAsset("tutorialtext,12", param0 + 10584);
          if (null != var2Lifetime193) {
            SeekerMine.field_k[12] = RasterSnapshot.a(var2Lifetime193, param0 + 115);
          }
          byte[] var2Lifetime194 = LabeledField.loadNamedAsset("tutorialtext,13", 10592);
          if (var2Lifetime194 != null) {
            SeekerMine.field_k[13] = RasterSnapshot.a(var2Lifetime194, PacketBuffer.xor(param0, 112));
          }
          byte[] var2Lifetime195 = LabeledField.loadNamedAsset("tutorialtext,14", param0 + 10584);
          if (null != var2Lifetime195) {
            SeekerMine.field_k[14] = RasterSnapshot.a(var2Lifetime195, 122);
          }
          byte[] var2Lifetime196 = LabeledField.loadNamedAsset("tutorialtext,15", 10592);
          if (var2Lifetime196 != null) {
            SeekerMine.field_k[15] = RasterSnapshot.a(var2Lifetime196, 121);
          }
          byte[] var2Lifetime197 = LabeledField.loadNamedAsset("tutorialtext,16", 10592);
          if (null != var2Lifetime197) {
            SeekerMine.field_k[16] = RasterSnapshot.a(var2Lifetime197, 117);
          }
          byte[] var2Lifetime198 = LabeledField.loadNamedAsset("tutorialtext,17", 10592);
          if (var2Lifetime198 != null) {
            SeekerMine.field_k[17] = RasterSnapshot.a(var2Lifetime198, param0 + 115);
          }
          byte[] var2Lifetime199 = LabeledField.loadNamedAsset("tutorialtext,18", 10592);
          if (var2Lifetime199 != null) {
            SeekerMine.field_k[18] = RasterSnapshot.a(var2Lifetime199, 113);
          }
          byte[] var2Lifetime200 = LabeledField.loadNamedAsset("tutorialtext,19", param0 ^ 10600);
          if (null != var2Lifetime200) {
            SeekerMine.field_k[19] = RasterSnapshot.a(var2Lifetime200, 125);
          }
          byte[] var2Lifetime201 = LabeledField.loadNamedAsset("tutorialtext,20", 10592);
          if (var2Lifetime201 != null) {
            SeekerMine.field_k[20] = RasterSnapshot.a(var2Lifetime201, 118);
          }
          byte[] var2Lifetime202 = LabeledField.loadNamedAsset("tutorialtext,21", 10592);
          if (var2Lifetime202 != null) {
            SeekerMine.field_k[21] = RasterSnapshot.a(var2Lifetime202, 126);
          }
          byte[] var2Lifetime203 = LabeledField.loadNamedAsset("tutorialtext,22", 10592);
          if (null != var2Lifetime203) {
            SeekerMine.field_k[22] = RasterSnapshot.a(var2Lifetime203, 118);
          }
          byte[] var2Lifetime204 = LabeledField.loadNamedAsset("tutorialtext,23", param0 + 10584);
          if (null != var2Lifetime204) {
            SeekerMine.field_k[23] = RasterSnapshot.a(var2Lifetime204, 127);
          }
          byte[] var2Lifetime205 = LabeledField.loadNamedAsset("tutorialtext,24", 10592);
          if (null != var2Lifetime205) {
            SeekerMine.field_k[24] = RasterSnapshot.a(var2Lifetime205, 112);
          }
          byte[] var2Lifetime206 = LabeledField.loadNamedAsset("tutorialtext,25", 10592);
          if (null != var2Lifetime206) {
            SeekerMine.field_k[25] = RasterSnapshot.a(var2Lifetime206, 110);
          }
          byte[] var2Lifetime207 = LabeledField.loadNamedAsset("tutorialtext,26", 10592);
          if (var2Lifetime207 != null) {
            SeekerMine.field_k[26] = RasterSnapshot.a(var2Lifetime207, 120);
          }
          byte[] var2Lifetime208 = LabeledField.loadNamedAsset("tutorialtext,27", 10592);
          if (var2Lifetime208 != null) {
            SeekerMine.field_k[27] = RasterSnapshot.a(var2Lifetime208, 127);
          }
          byte[] var2Lifetime209 = LabeledField.loadNamedAsset("tutorialtext,28", param0 ^ 10600);
          if (var2Lifetime209 != null) {
            SeekerMine.field_k[28] = RasterSnapshot.a(var2Lifetime209, 127);
          }
          byte[] var2Lifetime210 = LabeledField.loadNamedAsset("tutorialtext,29", 10592);
          if (null != var2Lifetime210) {
            SeekerMine.field_k[29] = RasterSnapshot.a(var2Lifetime210, 111);
          }
          byte[] var2Lifetime211 = LabeledField.loadNamedAsset("fuel_colon", 10592);
          if (var2Lifetime211 != null) {
            di.field_b = RasterSnapshot.a(var2Lifetime211, 127);
          }
          byte[] var2Lifetime212 = LabeledField.loadNamedAsset("shield_colon", param0 + 10584);
          if (null != var2Lifetime212) {
            TextWidgetPainter.field_p = RasterSnapshot.a(var2Lifetime212, 114);
          }
          byte[] var2Lifetime213 = LabeledField.loadNamedAsset("rockbusters_colon", 10592);
          if (var2Lifetime213 != null) {
            FullscreenFocusCanvas.field_f = RasterSnapshot.a(var2Lifetime213, param0 ^ 103);
          }
          byte[] var2Lifetime214 = LabeledField.loadNamedAsset("level_colon", 10592);
          if (var2Lifetime214 != null) {
            AccountTermsPanel.field_K = RasterSnapshot.a(var2Lifetime214, 114);
          }
          byte[] var2Lifetime215 = LabeledField.loadNamedAsset("lives_colon", 10592);
          if (null != var2Lifetime215) {
            vd.field_c = RasterSnapshot.a(var2Lifetime215, 116);
          }
          byte[] var2Lifetime216 = LabeledField.loadNamedAsset("score_colon", 10592);
          if (var2Lifetime216 != null) {
            ShipHullGeometry.field_a = RasterSnapshot.a(var2Lifetime216, 111);
          }
          byte[] var2Lifetime217 = LabeledField.loadNamedAsset("time_colon", 10592);
          if (var2Lifetime217 != null) {
            CheckboxPainter.field_f = RasterSnapshot.a(var2Lifetime217, param0 ^ 103);
          }
          byte[] var2Lifetime218 = LabeledField.loadNamedAsset("targets_colon", 10592);
          if (var2Lifetime218 != null) {
            IntrusiveNode.field_f = RasterSnapshot.a(var2Lifetime218, 127);
          }
          byte[] var2Lifetime219 = LabeledField.loadNamedAsset("levelscore_colon", 10592);
          if (var2Lifetime219 != null) {
            en.field_e = RasterSnapshot.a(var2Lifetime219, 117);
          }
          byte[] var2Lifetime220 = LabeledField.loadNamedAsset("fuelbonus_colon", 10592);
          if (var2Lifetime220 != null) {
            EmailAvailabilityValidator.field_s = RasterSnapshot.a(var2Lifetime220, 121);
          }
          byte[] var2Lifetime221 = LabeledField.loadNamedAsset("shieldbonus_colon", 10592);
          if (null != var2Lifetime221) {
            DualLinkNode.field_g = RasterSnapshot.a(var2Lifetime221, 115);
          }
          byte[] var2Lifetime222 = LabeledField.loadNamedAsset("totalscore_colon", 10592);
          if (var2Lifetime222 != null) {
            BoundedUrlRequest.field_c = RasterSnapshot.a(var2Lifetime222, 114);
          }
          byte[] var2Lifetime223 = LabeledField.loadNamedAsset("continue_", param0 + 10584);
          if (null != var2Lifetime223) {
            RasterSnapshot.a(var2Lifetime223, 118);
          }
          byte[] var2Lifetime224 = LabeledField.loadNamedAsset("continuemessage1", 10592);
          if (null != var2Lifetime224) {
            RasterSnapshot.a(var2Lifetime224, 117);
          }
          byte[] var2Lifetime225 = LabeledField.loadNamedAsset("continuemessage2", 10592);
          if (var2Lifetime225 != null) {
            RasterSnapshot.a(var2Lifetime225, 123);
          }
          byte[] var2Lifetime226 = LabeledField.loadNamedAsset("rewatchlastbriefing", param0 + 10584);
          if (var2Lifetime226 != null) {
            LoginForm.field_O = RasterSnapshot.a(var2Lifetime226, 124);
          }
          byte[] var2Lifetime227 = LabeledField.loadNamedAsset("showelapsedtime_colon", 10592);
          if (var2Lifetime227 != null) {
            PasswordValidator.field_s = RasterSnapshot.a(var2Lifetime227, param0 + 115);
          }
          byte[] var2Lifetime228 = LabeledField.loadNamedAsset("startforscore1", 10592);
          if (null != var2Lifetime228) {
            RasterSnapshot.a(var2Lifetime228, 112);
          }
          byte[] var2Lifetime229 = LabeledField.loadNamedAsset("startforscore2", 10592);
          if (var2Lifetime229 != null) {
            RasterSnapshot.a(var2Lifetime229, param0 + 115);
          }
          byte[] var2Lifetime230 = LabeledField.loadNamedAsset("classicIntroMessage,0", 10592);
          if (var2Lifetime230 != null) {
            qh.field_j[0] = RasterSnapshot.a(var2Lifetime230, param0 + 108);
          }
          byte[] var2Lifetime231 = LabeledField.loadNamedAsset("classicIntroMessage,1", param0 ^ 10600);
          if (var2Lifetime231 != null) {
            qh.field_j[1] = RasterSnapshot.a(var2Lifetime231, 121);
          }
          byte[] var2Lifetime232 = LabeledField.loadNamedAsset("classicIntroMessage,2", 10592);
          if (null != var2Lifetime232) {
            qh.field_j[2] = RasterSnapshot.a(var2Lifetime232, 124);
          }
          byte[] var2Lifetime233 = LabeledField.loadNamedAsset("classicIntroMessage,3", param0 ^ 10600);
          if (var2Lifetime233 != null) {
            qh.field_j[3] = RasterSnapshot.a(var2Lifetime233, 119);
          }
          byte[] var2Lifetime234 = LabeledField.loadNamedAsset("classicIntroMessage,4", 10592);
          if (var2Lifetime234 != null) {
            qh.field_j[4] = RasterSnapshot.a(var2Lifetime234, 111);
          }
          byte[] var2Lifetime235 = LabeledField.loadNamedAsset("classicIntroMessage,5", 10592);
          if (var2Lifetime235 != null) {
            qh.field_j[5] = RasterSnapshot.a(var2Lifetime235, 126);
          }
          byte[] var2Lifetime236 = LabeledField.loadNamedAsset("vengeanceIntroMessage,0", 10592);
          if (null != var2Lifetime236) {
            LegacyMenuColumn.field_o[0] = RasterSnapshot.a(var2Lifetime236, 125);
          }
          byte[] var2Lifetime237 = LabeledField.loadNamedAsset("vengeanceIntroMessage,1", 10592);
          if (null != var2Lifetime237) {
            LegacyMenuColumn.field_o[1] = RasterSnapshot.a(var2Lifetime237, 115);
          }
          byte[] var2Lifetime238 = LabeledField.loadNamedAsset("vengeanceIntroMessage,2", param0 ^ 10600);
          if (null != var2Lifetime238) {
            LegacyMenuColumn.field_o[2] = RasterSnapshot.a(var2Lifetime238, PacketBuffer.xor(param0, 103));
          }
          byte[] var2Lifetime239 = LabeledField.loadNamedAsset("vengeanceIntroMessage,3", 10592);
          if (var2Lifetime239 != null) {
            LegacyMenuColumn.field_o[3] = RasterSnapshot.a(var2Lifetime239, 113);
          }
          byte[] var2Lifetime240 = LabeledField.loadNamedAsset("vengeanceIntroMessage,4", 10592);
          if (var2Lifetime240 != null) {
            LegacyMenuColumn.field_o[4] = RasterSnapshot.a(var2Lifetime240, 122);
          }
          byte[] var2Lifetime241 = LabeledField.loadNamedAsset("startGameMessage,0", 10592);
          if (null != var2Lifetime241) {
            se.field_a[0] = RasterSnapshot.a(var2Lifetime241, 118);
          }
          byte[] var2Lifetime242 = LabeledField.loadNamedAsset("startGameMessage,1", param0 ^ 10600);
          if (null != var2Lifetime242) {
            se.field_a[1] = RasterSnapshot.a(var2Lifetime242, 112);
          }
          byte[] var2Lifetime243 = LabeledField.loadNamedAsset("firstDefencesMessage,0", 10592);
          if (null != var2Lifetime243) {
            SpriteCheckboxPainter.field_e[0] = RasterSnapshot.a(var2Lifetime243, 124);
          }
          byte[] var2Lifetime244 = LabeledField.loadNamedAsset("firstDefencesMessage,1", 10592);
          if (var2Lifetime244 != null) {
            SpriteCheckboxPainter.field_e[1] = RasterSnapshot.a(var2Lifetime244, param0 + 118);
          }
          byte[] var2Lifetime245 = LabeledField.loadNamedAsset("firstDefencesMessage,2", param0 ^ 10600);
          if (null != var2Lifetime245) {
            SpriteCheckboxPainter.field_e[2] = RasterSnapshot.a(var2Lifetime245, param0 + 109);
          }
          byte[] var2Lifetime246 = LabeledField.loadNamedAsset("freeEndMessage,0", 10592);
          if (var2Lifetime246 != null) {
            bk.field_q[0] = RasterSnapshot.a(var2Lifetime246, 111);
          }
          byte[] var2Lifetime247 = LabeledField.loadNamedAsset("bakedMoonMessage,0", param0 ^ 10600);
          if (var2Lifetime247 != null) {
            co.field_e[0] = RasterSnapshot.a(var2Lifetime247, 118);
          }
          byte[] var2Lifetime248 = LabeledField.loadNamedAsset("bakedMoonMessage,1", 10592);
          if (var2Lifetime248 != null) {
            co.field_e[1] = RasterSnapshot.a(var2Lifetime248, 127);
          }
          byte[] var2Lifetime249 = LabeledField.loadNamedAsset("bakedMoonMessage,2", 10592);
          if (var2Lifetime249 != null) {
            co.field_e[2] = RasterSnapshot.a(var2Lifetime249, 123);
          }
          byte[] var2Lifetime250 = LabeledField.loadNamedAsset("bakedMoonMessage,3", param0 ^ 10600);
          if (var2Lifetime250 != null) {
            co.field_e[3] = RasterSnapshot.a(var2Lifetime250, 123);
          }
          byte[] var2Lifetime251 = LabeledField.loadNamedAsset("icyMoonMessage,0", 10592);
          if (var2Lifetime251 != null) {
            LegacyMenuColumn.field_g[0] = RasterSnapshot.a(var2Lifetime251, param0 + 106);
          }
          byte[] var2Lifetime252 = LabeledField.loadNamedAsset("icyMoonMessage,1", param0 ^ 10600);
          if (var2Lifetime252 != null) {
            LegacyMenuColumn.field_g[1] = RasterSnapshot.a(var2Lifetime252, 125);
          }
          byte[] var2Lifetime253 = LabeledField.loadNamedAsset("alienWorldMessage,0", 10592);
          if (var2Lifetime253 != null) {
            SeekerPulseStream.field_t[0] = RasterSnapshot.a(var2Lifetime253, 125);
          }
          byte[] var2Lifetime254 = LabeledField.loadNamedAsset("alienWorldMessage,1", 10592);
          if (null != var2Lifetime254) {
            SeekerPulseStream.field_t[1] = RasterSnapshot.a(var2Lifetime254, 118);
          }
          byte[] var2Lifetime255 = LabeledField.loadNamedAsset("classicEndMessage,0", param0 + 10584);
          if (var2Lifetime255 != null) {
            mb.field_b[0] = RasterSnapshot.a(var2Lifetime255, 113);
          }
          byte[] var2Lifetime256 = LabeledField.loadNamedAsset("classicEndMessage,1", param0 ^ 10600);
          if (var2Lifetime256 != null) {
            mb.field_b[1] = RasterSnapshot.a(var2Lifetime256, param0 + 119);
          }
          byte[] var2Lifetime257 = LabeledField.loadNamedAsset("classicEndMessage,2", 10592);
          if (null != var2Lifetime257) {
            mb.field_b[2] = RasterSnapshot.a(var2Lifetime257, 115);
          }
          byte[] var2Lifetime258 = LabeledField.loadNamedAsset("vengeanceEndMessage,0", 10592);
          if (var2Lifetime258 != null) {
            IntValueNode.field_h[0] = RasterSnapshot.a(var2Lifetime258, 125);
          }
          byte[] var2Lifetime259 = LabeledField.loadNamedAsset("vengeanceEndMessage,1", 10592);
          if (null != var2Lifetime259) {
            IntValueNode.field_h[1] = RasterSnapshot.a(var2Lifetime259, 112);
          }
          byte[] var2Lifetime260 = LabeledField.loadNamedAsset("vengeanceEndMessage,2", param0 + 10584);
          if (null != var2Lifetime260) {
            IntValueNode.field_h[2] = RasterSnapshot.a(var2Lifetime260, 112);
          }
          byte[] var2Lifetime261 = LabeledField.loadNamedAsset("vengeanceEndMessage,3", 10592);
          if (null != var2Lifetime261) {
            IntValueNode.field_h[3] = RasterSnapshot.a(var2Lifetime261, PacketBuffer.xor(param0, 116));
          }
          byte[] var2Lifetime262 = LabeledField.loadNamedAsset("vengeanceEndMessage,4", 10592);
          if (var2Lifetime262 != null) {
            IntValueNode.field_h[4] = RasterSnapshot.a(var2Lifetime262, param0 + 111);
          }
          byte[] var2Lifetime263 = LabeledField.loadNamedAsset("vengeanceAsteroidsMessage,0", 10592);
          if (null != var2Lifetime263) {
            lh.field_c[0] = RasterSnapshot.a(var2Lifetime263, 113);
          }
          byte[] var2Lifetime264 = LabeledField.loadNamedAsset("vengeanceAsteroidsMessage,1", param0 + 10584);
          if (var2Lifetime264 != null) {
            lh.field_c[1] = RasterSnapshot.a(var2Lifetime264, 117);
          }
          byte[] var2Lifetime265 = LabeledField.loadNamedAsset("vengeanceAsteroidsMessage,2", 10592);
          if (null != var2Lifetime265) {
            lh.field_c[2] = RasterSnapshot.a(var2Lifetime265, PacketBuffer.xor(param0, 103));
          }
          byte[] var2Lifetime266 = LabeledField.loadNamedAsset("vengeanceMoonMessage,0", 10592);
          if (var2Lifetime266 != null) {
            HudMessage.field_j[0] = RasterSnapshot.a(var2Lifetime266, 121);
          }
          byte[] var2Lifetime267 = LabeledField.loadNamedAsset("vengeanceMoonMessage,1", 10592);
          if (null != var2Lifetime267) {
            HudMessage.field_j[1] = RasterSnapshot.a(var2Lifetime267, 110);
          }
          byte[] var2Lifetime268 = LabeledField.loadNamedAsset("vengeanceIceMessage,0", 10592);
          if (var2Lifetime268 != null) {
            pc.field_b[0] = RasterSnapshot.a(var2Lifetime268, 111);
          }
          byte[] var2Lifetime269 = LabeledField.loadNamedAsset("vengeanceIceMessage,1", 10592);
          if (null != var2Lifetime269) {
            pc.field_b[1] = RasterSnapshot.a(var2Lifetime269, 125);
          }
          byte[] var2Lifetime270 = LabeledField.loadNamedAsset("vengeanceAlienMessage,0", 10592);
          if (var2Lifetime270 != null) {
            vd.field_i[0] = RasterSnapshot.a(var2Lifetime270, 122);
          }
          byte[] var2Lifetime271 = LabeledField.loadNamedAsset("vengeanceAlienMessage,1", 10592);
          if (var2Lifetime271 != null) {
            vd.field_i[1] = RasterSnapshot.a(var2Lifetime271, 117);
          }
          byte[] var2Lifetime272 = LabeledField.loadNamedAsset("titleMembersExpansion", 10592);
          if (var2Lifetime272 != null) {
            WeightedCacheEntry.field_r = RasterSnapshot.a(var2Lifetime272, 118);
          }
          byte[] var2Lifetime273 = LabeledField.loadNamedAsset("textMembersExpansion", 10592);
          if (null != var2Lifetime273) {
            EscapeVector.field_z = RasterSnapshot.a(var2Lifetime273, 117);
          }
          byte[] var2Lifetime274 = LabeledField.loadNamedAsset("textLevelSetSelect", 10592);
          if (var2Lifetime274 != null) {
            ModalPanel.field_O = RasterSnapshot.a(var2Lifetime274, 125);
          }
          byte[] var2Lifetime275 = LabeledField.loadNamedAsset("levelSetNames,0", 10592);
          if (null != var2Lifetime275) {
            pl.field_s[0] = RasterSnapshot.a(var2Lifetime275, 117);
          }
          byte[] var2Lifetime276 = LabeledField.loadNamedAsset("levelSetNames,1", 10592);
          if (var2Lifetime276 != null) {
            pl.field_s[1] = RasterSnapshot.a(var2Lifetime276, param0 + 112);
          }
          byte[] var2Lifetime277 = LabeledField.loadNamedAsset("levelSetNames,2", 10592);
          if (null != var2Lifetime277) {
            pl.field_s[2] = RasterSnapshot.a(var2Lifetime277, 110);
          }
          byte[] var2Lifetime278 = LabeledField.loadNamedAsset("levelSetNames,3", 10592);
          if (null != var2Lifetime278) {
            pl.field_s[3] = RasterSnapshot.a(var2Lifetime278, 110);
          }
          byte[] var2Lifetime279 = LabeledField.loadNamedAsset("highScoreTableNames,0", param0 + 10584);
          if (var2Lifetime279 != null) {
            mg.field_h[0] = RasterSnapshot.a(var2Lifetime279, 122);
          }
          byte[] var2Lifetime280 = LabeledField.loadNamedAsset("highScoreTableNames,1", param0 + 10584);
          if (null != var2Lifetime280) {
            mg.field_h[1] = RasterSnapshot.a(var2Lifetime280, 114);
          }
          byte[] var2Lifetime281 = LabeledField.loadNamedAsset("highScoreTableNames,2", 10592);
          if (var2Lifetime281 != null) {
            mg.field_h[2] = RasterSnapshot.a(var2Lifetime281, PacketBuffer.xor(param0, 102));
          }
          byte[] var2Lifetime282 = LabeledField.loadNamedAsset("titleMiniMapCrate", 10592);
          if (null != var2Lifetime282) {
            FullscreenFocusCanvas.field_b = RasterSnapshot.a(var2Lifetime282, 118);
          }
          byte[] var2Lifetime283 = LabeledField.loadNamedAsset("titleMiniMapTargets", param0 ^ 10600);
          if (var2Lifetime283 != null) {
            sj.field_k = RasterSnapshot.a(var2Lifetime283, 121);
          }
          byte[] var2Lifetime284 = LabeledField.loadNamedAsset("highScoresDifficultyMode", 10592);
          if (null != var2Lifetime284) {
            qf.field_o = RasterSnapshot.a(var2Lifetime284, 124);
          }
          byte[] var2Lifetime285 = LabeledField.loadNamedAsset("difficultyEasy", 10592);
          if (null != var2Lifetime285) {
            LoginDialog.field_lb = RasterSnapshot.a(var2Lifetime285, param0 ^ 125);
          }
          byte[] var2Lifetime286 = LabeledField.loadNamedAsset("difficultyHard", 10592);
          if (var2Lifetime286 != null) {
            wc.field_b = RasterSnapshot.a(var2Lifetime286, 126);
          }
          byte[] var2Lifetime287 = LabeledField.loadNamedAsset("legend", param0 ^ 10600);
          if (null != var2Lifetime287) {
            sf.field_n = RasterSnapshot.a(var2Lifetime287, 116);
          }
          byte[] var2Lifetime288 = LabeledField.loadNamedAsset("ship", 10592);
          if (null != var2Lifetime288) {
            qj.field_d = RasterSnapshot.a(var2Lifetime288, 117);
          }
          byte[] var2Lifetime289 = LabeledField.loadNamedAsset("targets", 10592);
          if (var2Lifetime289 != null) {
            SpriteLabelColumns.field_q = RasterSnapshot.a(var2Lifetime289, 120);
          }
          byte[] var2Lifetime290 = LabeledField.loadNamedAsset("collectables", 10592);
          if (null != var2Lifetime290) {
            IterableDualLinkDeque.field_a = RasterSnapshot.a(var2Lifetime290, 127);
          }
          byte[] var2Lifetime291 = LabeledField.loadNamedAsset("ellipsis", 10592);
          if (null != var2Lifetime291) {
            GameplaySession.field_cc = RasterSnapshot.a(var2Lifetime291, 119);
          }
          byte[] var2Lifetime292 = LabeledField.loadNamedAsset("tnt_collected", 10592);
          if (var2Lifetime292 != null) {
            b.field_a = RasterSnapshot.a(var2Lifetime292, 112);
          }
          wk.field_e = null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2_ref = decompiledCaughtException;
          RuntimeException stackIn_1027_0 = var2_ref;
          StringBuilder stackIn_1027_1 = new StringBuilder().append("qc.TB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_1028_2 = "null";
          } else {
            stackIn_1028_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_1027_0), ((StringBuilder) (Object) stackIn_1027_1).append(stackIn_1028_2).append(')').toString());
        }
        if (GameAppletShell.field_h) {
          var3++;
          EscapeVector.obfuscationControl = var3;
        }
    }

    final boolean updateAnimationsAndCheckClosed(int guard) {
        try {
          if (guard != -13907) {
            this.s(-28);
          }
          if (this.open &&
            !this.field_wb) {
            NameAvailabilityResult var2 = e.a(-16055);
            if (null != var2) {
              this.a(guard + 9093, var2, false);
            }
          }
          boolean stackIn_12_0 = super.updateAnimationsAndCheckClosed(-13907);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2_ref), "qc.H(" + guard + ')');
        }
    }

    private final void a(int param0, NameAvailabilityResult param1, boolean param2) {
        String stackIn_54_2 = null;
        String var4 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          this.field_wb = true;
          if (param0 != -4814) {
            return;
          }
          boolean decompiledFrameRemainder1 = true;
          if (param1.field_a) {
            var4 = DraggableWidget.field_G;
            decompiledFrameRemainder1 = (var6 != 0);
          }
          if (decompiledFrameRemainder1) {
            if (param1.field_c == null) {
              var4 = param1.field_f;
              if (param1.field_g == 248) {
                if (!param2) {
                  LegacyTextBlock.writeBrowserSessionMarker(param0 + 4816);
                }
                var4 = mj.field_a;
                this.field_zb = true;
                if (var6 != 0) {
                  var4 = RasterBuffer.field_b;
                  if (null != this.registrationForm) {
                    this.registrationForm.onMoreSuggestions((byte) -61);
                  }
                }
              }
            } else {
              var4 = RasterBuffer.field_b;
              if (null != this.registrationForm) {
                this.registrationForm.onMoreSuggestions((byte) -61);
              }
            }
          }
          boolean decompiledFrameRemainder0 = true;
          AccountMessagePanel var5 = new AccountMessagePanel((AccountRequestDialog) (this), dl.field_b, var4);
          if (param1.field_a) {
            if (param1.field_e) {
              this.transitionToContent(new AccountTermsPanel(this), 30);
              return;
            }
            var5.appendButton((UiListener) (this), (byte) -67, bm.field_d);
            decompiledFrameRemainder0 = (var6 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (this.field_zb) {
              var5.appendButton((UiListener) (this), (byte) -67, bm.field_d);
              if (var6 != 0) {
                if (param1.field_g == 5) {
                  var5.appendActionButton(false, TerrainMap.field_i, 11);
                  var5.appendActionButton(false, EmailAvailabilityRequest.field_d, 17);
                  var5.appendActionButton(false, Minimap.field_O, -1);
                } else {
                  var5.appendActionButton(false, Minimap.field_O, -1);
                }
              }
            } else if (param1.field_g == 5) {
              var5.appendActionButton(false, TerrainMap.field_i, 11);
              var5.appendActionButton(false, EmailAvailabilityRequest.field_d, 17);
              if (var6 != 0) {
                var5.appendActionButton(false, Minimap.field_O, -1);
              }
            } else {
              var5.appendActionButton(false, Minimap.field_O, -1);
            }
            if (param1.field_g == 3) {
              var5.appendActionButton(false, qk.field_a, 7);
            } else if (param1.field_g == 6) {
              var5.appendActionButton(false, ej.field_c, 9);
              if (var6 != 0) {
                var5.appendActionButton(false, qk.field_a, 7);
              }
            }
          }
          this.transitionToContent(var5, 30);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4_ref = decompiledCaughtException;
          RuntimeException stackIn_53_0 = var4_ref;
          StringBuilder stackIn_53_1 = new StringBuilder().append("qc.VB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void releaseStatics(int guard) {
        try {
          field_yb = null;
          int var1_int = 91 % ((guard + 21) / 42);
          field_vb = null;
          field_xb = null;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "qc.UB(" + guard + ')');
        }
    }

    static {
        field_vb = "Password: ";
        field_xb = "Container destroyed - auto-restarting";
        field_yb = "Keys";
    }
}
