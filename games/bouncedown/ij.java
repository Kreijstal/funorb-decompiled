/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij {
    static RgbSprite[] field_c;
    static int[] field_b;
    static boolean field_a;

    final static void a(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          fk.field_a = param0 >> 4 & 3;
          wb.field_a = (13 & param0) >> 2;
          if (fk.field_a > 2) {
            fk.field_a = 2;
          }
          if (wb.field_a > param1) {
            wb.field_a = 2;
          }
          bk.field_a = 3 & param0;
          if (bk.field_a > 2) {
            bk.field_a = 2;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) var2), "ij.C(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(ResourceArchive param0, byte param1) {
        RuntimeException stackIn_231_0 = null;
        StringBuilder stackIn_231_1 = null;
        String stackIn_232_2 = null;
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
        try {
          ih.field_p = param0;
          var2 = AccountNameAvailabilityValidator.a((byte) 48, "achievement_names,0");
          if (null != var2) {
            lj.field_b[0] = c.a(0, var2);
          }
          var2Lifetime1 = AccountNameAvailabilityValidator.a((byte) 48, "achievement_names,1");
          if (var2Lifetime1 != null) {
            lj.field_b[1] = c.a(0, var2Lifetime1);
          }
          var2Lifetime2 = AccountNameAvailabilityValidator.a((byte) 48, "achievement_names,2");
          if (var2Lifetime2 != null) {
            lj.field_b[2] = c.a(0, var2Lifetime2);
          }
          var2Lifetime3 = AccountNameAvailabilityValidator.a((byte) 48, "achievement_names,3");
          if (null != var2Lifetime3) {
            lj.field_b[3] = c.a(0, var2Lifetime3);
          }
          var2Lifetime4 = AccountNameAvailabilityValidator.a((byte) 48, "achievement_names,4");
          if (var2Lifetime4 != null) {
            lj.field_b[4] = c.a(0, var2Lifetime4);
          }
          var2Lifetime5 = AccountNameAvailabilityValidator.a((byte) 48, "achievement_names,5");
          if (null != var2Lifetime5) {
            lj.field_b[5] = c.a(0, var2Lifetime5);
          }
          var2Lifetime6 = AccountNameAvailabilityValidator.a((byte) 48, "achievement_names,6");
          if (null != var2Lifetime6) {
            lj.field_b[6] = c.a(0, var2Lifetime6);
          }
          var2Lifetime7 = AccountNameAvailabilityValidator.a((byte) 48, "achievement_names,7");
          if (null != var2Lifetime7) {
            lj.field_b[7] = c.a(0, var2Lifetime7);
          }
          var2Lifetime8 = AccountNameAvailabilityValidator.a((byte) 48, "achievement_names,8");
          if (var2Lifetime8 != null) {
            lj.field_b[8] = c.a(0, var2Lifetime8);
          }
          var2Lifetime9 = AccountNameAvailabilityValidator.a((byte) 48, "achievement_names,9");
          if (var2Lifetime9 != null) {
            lj.field_b[9] = c.a(0, var2Lifetime9);
          }
          var2Lifetime10 = AccountNameAvailabilityValidator.a((byte) 48, "achievement_criteria,0");
          if (null != var2Lifetime10) {
            bb.field_a[0] = c.a(0, var2Lifetime10);
          }
          var2Lifetime11 = AccountNameAvailabilityValidator.a((byte) 48, "achievement_criteria,1");
          if (var2Lifetime11 != null) {
            bb.field_a[1] = c.a(0, var2Lifetime11);
          }
          var2Lifetime12 = AccountNameAvailabilityValidator.a((byte) 48, "achievement_criteria,2");
          if (var2Lifetime12 != null) {
            bb.field_a[2] = c.a(0, var2Lifetime12);
          }
          var2Lifetime13 = AccountNameAvailabilityValidator.a((byte) 48, "achievement_criteria,3");
          if (null != var2Lifetime13) {
            bb.field_a[3] = c.a(0, var2Lifetime13);
          }
          var2Lifetime14 = AccountNameAvailabilityValidator.a((byte) 48, "achievement_criteria,4");
          if (var2Lifetime14 != null) {
            bb.field_a[4] = c.a(0, var2Lifetime14);
          }
          var2Lifetime15 = AccountNameAvailabilityValidator.a((byte) 48, "achievement_criteria,5");
          if (var2Lifetime15 != null) {
            bb.field_a[5] = c.a(0, var2Lifetime15);
          }
          var2Lifetime16 = AccountNameAvailabilityValidator.a((byte) 48, "achievement_criteria,6");
          if (var2Lifetime16 != null) {
            bb.field_a[6] = c.a(0, var2Lifetime16);
          }
          var2Lifetime17 = AccountNameAvailabilityValidator.a((byte) 48, "achievement_criteria,7");
          if (null != var2Lifetime17) {
            bb.field_a[7] = c.a(0, var2Lifetime17);
          }
          var2Lifetime18 = AccountNameAvailabilityValidator.a((byte) 48, "achievement_criteria,8");
          if (var2Lifetime18 != null) {
            bb.field_a[8] = c.a(0, var2Lifetime18);
          }
          var2Lifetime19 = AccountNameAvailabilityValidator.a((byte) 48, "achievement_criteria,9");
          if (var2Lifetime19 != null) {
            bb.field_a[9] = c.a(0, var2Lifetime19);
          }
          var2Lifetime20 = AccountNameAvailabilityValidator.a((byte) 48, "pressescape");
          if (null != var2Lifetime20) {
            hf.field_c = c.a(0, var2Lifetime20);
          }
          var2Lifetime21 = AccountNameAvailabilityValidator.a((byte) 48, "scorehyphen");
          if (var2Lifetime21 != null) {
            ui.field_j = c.a(0, var2Lifetime21);
          }
          var2Lifetime22 = AccountNameAvailabilityValidator.a((byte) 48, "music");
          if (var2Lifetime22 != null) {
            ob.field_b = c.a(0, var2Lifetime22);
          }
          var2Lifetime23 = AccountNameAvailabilityValidator.a((byte) 48, "sound");
          if (null != var2Lifetime23) {
            DiskArchiveRequest.field_u = c.a(0, var2Lifetime23);
          }
          var2Lifetime24 = AccountNameAvailabilityValidator.a((byte) 48, "threeplayer");
          if (null != var2Lifetime24) {
            kl.field_m = c.a(0, var2Lifetime24);
          }
          var2Lifetime25 = AccountNameAvailabilityValidator.a((byte) 48, "twoplayer");
          if (var2Lifetime25 != null) {
            nf.field_b = c.a(0, var2Lifetime25);
          }
          var2Lifetime26 = AccountNameAvailabilityValidator.a((byte) 48, "oneplayer");
          if (var2Lifetime26 != null) {
            c.field_b = c.a(0, var2Lifetime26);
          }
          var2Lifetime27 = AccountNameAvailabilityValidator.a((byte) 48, "waitforhs");
          if (null != var2Lifetime27) {
            ImageProducerRasterBuffer.field_j = c.a(0, var2Lifetime27);
          }
          var2Lifetime28 = AccountNameAvailabilityValidator.a((byte) 48, "nohs");
          if (var2Lifetime28 != null) {
            jk.field_m = c.a(0, var2Lifetime28);
          }
          var2Lifetime29 = AccountNameAvailabilityValidator.a((byte) 48, "ins,0");
          if (var2Lifetime29 != null) {
            Bounce.field_A[0] = c.a(0, var2Lifetime29);
          }
          var2Lifetime30 = AccountNameAvailabilityValidator.a((byte) 48, "ins,1");
          if (null != var2Lifetime30) {
            Bounce.field_A[1] = c.a(0, var2Lifetime30);
          }
          var2Lifetime31 = AccountNameAvailabilityValidator.a((byte) 48, "ins,2");
          if (var2Lifetime31 != null) {
            Bounce.field_A[2] = c.a(0, var2Lifetime31);
          }
          var2Lifetime32 = AccountNameAvailabilityValidator.a((byte) 48, "ins,3");
          if (null != var2Lifetime32) {
            Bounce.field_A[3] = c.a(0, var2Lifetime32);
          }
          var2Lifetime33 = AccountNameAvailabilityValidator.a((byte) 48, "ins,4");
          if (var2Lifetime33 != null) {
            Bounce.field_A[4] = c.a(0, var2Lifetime33);
          }
          var2Lifetime34 = AccountNameAvailabilityValidator.a((byte) 48, "ins,5");
          if (var2Lifetime34 != null) {
            Bounce.field_A[5] = c.a(0, var2Lifetime34);
          }
          var2Lifetime35 = AccountNameAvailabilityValidator.a((byte) 48, "ins,6");
          if (null != var2Lifetime35) {
            Bounce.field_A[6] = c.a(0, var2Lifetime35);
          }
          var2Lifetime36 = AccountNameAvailabilityValidator.a((byte) 48, "ins,7");
          if (var2Lifetime36 != null) {
            Bounce.field_A[7] = c.a(0, var2Lifetime36);
          }
          var2Lifetime37 = AccountNameAvailabilityValidator.a((byte) 48, "ins,8");
          if (null != var2Lifetime37) {
            Bounce.field_A[8] = c.a(0, var2Lifetime37);
          }
          var2Lifetime38 = AccountNameAvailabilityValidator.a((byte) 48, "ins,9");
          if (var2Lifetime38 != null) {
            Bounce.field_A[9] = c.a(0, var2Lifetime38);
          }
          var2Lifetime39 = AccountNameAvailabilityValidator.a((byte) 48, "ins,10");
          if (var2Lifetime39 != null) {
            Bounce.field_A[10] = c.a(0, var2Lifetime39);
          }
          var2Lifetime40 = AccountNameAvailabilityValidator.a((byte) 48, "ins,11");
          if (var2Lifetime40 != null) {
            Bounce.field_A[11] = c.a(0, var2Lifetime40);
          }
          var2Lifetime41 = AccountNameAvailabilityValidator.a((byte) 48, "ins,12");
          if (var2Lifetime41 != null) {
            Bounce.field_A[12] = c.a(0, var2Lifetime41);
          }
          var2Lifetime42 = AccountNameAvailabilityValidator.a((byte) 48, "ins,13");
          if (var2Lifetime42 != null) {
            Bounce.field_A[13] = c.a(0, var2Lifetime42);
          }
          var2Lifetime43 = AccountNameAvailabilityValidator.a((byte) 48, "ins,14");
          if (var2Lifetime43 != null) {
            Bounce.field_A[14] = c.a(0, var2Lifetime43);
          }
          var2Lifetime44 = AccountNameAvailabilityValidator.a((byte) 48, "ins,15");
          if (null != var2Lifetime44) {
            Bounce.field_A[15] = c.a(0, var2Lifetime44);
          }
          var2Lifetime45 = AccountNameAvailabilityValidator.a((byte) 48, "ins,16");
          if (var2Lifetime45 != null) {
            Bounce.field_A[16] = c.a(0, var2Lifetime45);
          }
          var2Lifetime46 = AccountNameAvailabilityValidator.a((byte) 48, "ins,17");
          if (var2Lifetime46 != null) {
            Bounce.field_A[17] = c.a(0, var2Lifetime46);
          }
          var2Lifetime47 = AccountNameAvailabilityValidator.a((byte) 48, "ins,18");
          if (null != var2Lifetime47) {
            Bounce.field_A[18] = c.a(0, var2Lifetime47);
          }
          var2Lifetime48 = AccountNameAvailabilityValidator.a((byte) 48, "ins,19");
          if (var2Lifetime48 != null) {
            Bounce.field_A[19] = c.a(0, var2Lifetime48);
          }
          var2Lifetime49 = AccountNameAvailabilityValidator.a((byte) 48, "ins,20");
          if (var2Lifetime49 != null) {
            Bounce.field_A[20] = c.a(0, var2Lifetime49);
          }
          var2Lifetime50 = AccountNameAvailabilityValidator.a((byte) 48, "ins,21");
          if (var2Lifetime50 != null) {
            Bounce.field_A[21] = c.a(0, var2Lifetime50);
          }
          var2Lifetime51 = AccountNameAvailabilityValidator.a((byte) 48, "ins,22");
          if (var2Lifetime51 != null) {
            Bounce.field_A[22] = c.a(0, var2Lifetime51);
          }
          var2Lifetime52 = AccountNameAvailabilityValidator.a((byte) 48, "ins,23");
          if (null != var2Lifetime52) {
            Bounce.field_A[23] = c.a(0, var2Lifetime52);
          }
          var2Lifetime53 = AccountNameAvailabilityValidator.a((byte) 48, "ins,24");
          if (null != var2Lifetime53) {
            Bounce.field_A[24] = c.a(0, var2Lifetime53);
          }
          var2Lifetime54 = AccountNameAvailabilityValidator.a((byte) 48, "ins,25");
          if (null != var2Lifetime54) {
            Bounce.field_A[25] = c.a(0, var2Lifetime54);
          }
          var2Lifetime55 = AccountNameAvailabilityValidator.a((byte) 48, "p1");
          if (var2Lifetime55 != null) {
            PcmResampler.field_f = c.a(0, var2Lifetime55);
          }
          var2Lifetime56 = AccountNameAvailabilityValidator.a((byte) 48, "p2");
          if (null != var2Lifetime56) {
            c.field_a = c.a(0, var2Lifetime56);
          }
          var2Lifetime57 = AccountNameAvailabilityValidator.a((byte) 48, "p3");
          if (null != var2Lifetime57) {
            bk.field_b = c.a(0, var2Lifetime57);
          }
          var2Lifetime58 = AccountNameAvailabilityValidator.a((byte) 48, "arr");
          var3 = 44 % ((param1 - 23) / 59);
          if (var2Lifetime58 != null) {
            wa.field_a = c.a(0, var2Lifetime58);
          }
          var2Lifetime59 = AccountNameAvailabilityValidator.a((byte) 48, "keys");
          if (var2Lifetime59 != null) {
            MusicPatchPcmStream.field_k = c.a(0, var2Lifetime59);
          }
          var2Lifetime60 = AccountNameAvailabilityValidator.a((byte) 48, "keycode_player1left");
          if (null != var2Lifetime60) {
            nj.field_m = 255 & var2Lifetime60[0];
          }
          var2Lifetime61 = AccountNameAvailabilityValidator.a((byte) 48, "keycode_player1right");
          if (var2Lifetime61 != null) {
            ee.field_a = 255 & var2Lifetime61[0];
          }
          var2Lifetime62 = AccountNameAvailabilityValidator.a((byte) 48, "keycode_player2left");
          if (null != var2Lifetime62) {
            nb.field_g = 255 & var2Lifetime62[0];
          }
          var2Lifetime63 = AccountNameAvailabilityValidator.a((byte) 48, "keycode_player2right");
          ih.field_p = null;
          if (null != var2Lifetime63) {
            db.field_S = 255 & var2Lifetime63[0];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_231_0 = var2_ref;
          stackIn_231_1 = new StringBuilder().append("ij.E(");
          if (param0 == null) {
            stackIn_232_2 = "null";
          } else {
            stackIn_232_2 = "{...}";
          }
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) stackIn_231_0), ((StringBuilder) (Object) stackIn_231_1).append(stackIn_232_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 >= -66) {
            return;
          }
          if (~oa.field_a != ~(0 - fe.field_i) &&
            oa.field_a != 250 - fe.field_i) {
          }
          oa.field_a = oa.field_a + 1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) var1), "ij.B(" + param0 + ')');
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          return;
        }
        try {
          field_b = null;
          field_c = null;
        } catch (RuntimeException runtimeException) {
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) runtimeException), "ij.A(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6_int = 0;
        int var7 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          bl.field_e[q.field_M] = param1;
          w.field_f[q.field_M] = q.field_M;
          sj.field_j[q.field_M] = param2;
          if (param2 < va.field_b) {
            AccountNameAvailabilityValidator.field_n = param2;
          }
          if (w.field_d < param2) {
            uc.field_A = param2;
          }
          nh.field_S[q.field_M] = param0;
          ResourceArchive.field_i[q.field_M] = param5;
          DelegatingCanvas.field_c[q.field_M] = param4;
          var6_int = param5 + (param0 + param4);
          if (param3 != var6_int) {
            stackIn_11_0 = 1000 * param0 / var6_int;
          } else {
            stackIn_11_0 = 0;
          }
          var7 = stackIn_11_0;
          field_b[q.field_M] = var7;
          if (var7 < AccountNameAvailabilityValidator.field_n) {
            AccountNameAvailabilityValidator.field_n = var7;
          }
          q.field_M = q.field_M + 1;
          if (uc.field_A < var7) {
            uc.field_A = var7;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) var6), "ij.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
    }
}
