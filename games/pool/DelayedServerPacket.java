/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DelayedServerPacket extends IntrusiveNode {
    static ServerListLauncher field_o;
    static String createAlertInvalidemail;
    static int field_n;
    long field_p;
    byte[] field_l;
    static int field_s;
    static String muOptionsWhocanjoin;
    int field_r;
    static int field_u;
    static int field_t;

    final static int bitLength(int param0, int param1) {
        int var2;
        int var2Lifetime1;
        if (param1 == 0) {
          return 0;
        }
        if (0 < param1) {
          var2 = 1;
          if (param1 > 65535) {
            param1 = param1 >> 16;
            var2 += 16;
          }
          if (param1 > 255) {
            var2 += 8;
            param1 = param1 >> 8;
          }
          if (param1 > 15) {
            param1 = param1 >> 4;
            var2 += 4;
          }
          if (param1 > 3) {
            var2 += 2;
            param1 = param1 >> 2;
          }
          if (param1 > 1) {
            var2++;
            param1 = param1 >> 1;
          }
          return var2;
        }
        var2Lifetime1 = 2;
        if (-65536 > param1) {
          var2Lifetime1 += 16;
          param1 = param1 >> 16;
        }
        if (param0 != 16) {
          DelayedServerPacket.releaseStatics((byte) -52);
        }
        if (-256 > param1) {
          param1 = param1 >> 8;
          var2Lifetime1 += 8;
        }
        if (param1 < -16) {
          param1 = param1 >> 4;
          var2Lifetime1 += 4;
        }
        if (param1 < -4) {
          var2Lifetime1 += 2;
          param1 = param1 >> 2;
        }
        if (param1 < -2) {
          var2Lifetime1++;
          param1 = param1 >> 1;
        }
        return var2Lifetime1;
    }

    final static void sendByteRecordSubmission(int obfuscationGuard, ByteRecordSubmission submission, int opcode) {
        CipherPacketBuffer var6 = null;
        int var4 = 0;
        try {
          var6 = JaggrabDownloader.field_j;
          CipherPacketBuffer var3 = var6;
          var6.writeCipheredOpcode(false, opcode);
          var6.position = var6.position + 1;
          var4 = var6.position;
          var6.writeByte(1, false);
          if (null != submission.field_p) {
            var6.writeByte(submission.field_p.length, false);
            var6.writeBytes(submission.field_p, (byte) 0, 0, submission.field_p.length);
          } else {
            var6.writeByte(0, false);
          }
          int var5 = 48 / ((obfuscationGuard - 52) / 40);
          var6.appendChecksum(-1, var4);
          var6.position = var6.position - 4;
          submission.field_o = var6.readInt(true);
          var6.writeByteLengthPrefix(-var4 + var6.position, true);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "fr.D(" + obfuscationGuard + ',' + (submission != null ? "{...}" : "null") + ',' + opcode + ')');
        }
    }

    final static void layoutSlidingGamePanels(byte obfuscationGuard, int progress) {
        int var3 = 0;
        int var4 = 0;
        int var2 = (-640 + field_s) / 2;
        int var3Lifetime1;
        int var4Lifetime1;
        if (obfuscationGuard <= -21) {
          var3 = BufferedFile.field_h * BufferedFile.field_h;
          var4 = var3 - progress * progress;
          SceneNode.field_k.setBounds(90, 2147483647, var2 - 199 * var4 / var3, 199, -90 + (-4 + (-120 + SoftwareRasterizer.height)));
          Bzip2DecoderState.field_f.setBounds(0, 2147483647, 202 + (var2 + 438 * var4 / var3), 438, -120 + SoftwareRasterizer.height - 4);
          return;
        }
        field_s = -62;
        var3Lifetime1 = BufferedFile.field_h * BufferedFile.field_h;
        var4Lifetime1 = var3Lifetime1 - progress * progress;
        SceneNode.field_k.setBounds(90, 2147483647, var2 - 199 * var4Lifetime1 / var3Lifetime1, 199, -90 + (-4 + (-120 + SoftwareRasterizer.height)));
        Bzip2DecoderState.field_f.setBounds(0, 2147483647, 202 + (var2 + 438 * var4Lifetime1 / var3Lifetime1), 438, -120 + SoftwareRasterizer.height - 4);
    }

    public static void releaseStatics(byte param0) {
        createAlertInvalidemail = null;
        muOptionsWhocanjoin = null;
        field_o = null;
        if (param0 < 39) {
          DelayedServerPacket.bitLength(-16, 120);
        }
    }

    DelayedServerPacket(long param0, int param1, byte[] param2) {
        try {
          this.field_p = param0;
          this.field_l = param2;
          this.field_r = param1;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "fr.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        createAlertInvalidemail = "Please check if address is correct";
        field_o = new ServerListLauncher();
        muOptionsWhocanjoin = "Who can join";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void layoutSlidingGamePanelsIntArgs(int obfuscationGuard, int progress) {
        int var3 = 0;
        int var4 = 0;
        int var2 = (-640 + field_s) / 2;
        int var3Lifetime1;
        int var4Lifetime1;
        if (obfuscationGuard <= -21) {
          var3 = BufferedFile.field_h * BufferedFile.field_h;
          var4 = var3 - progress * progress;
          SceneNode.field_k.setBounds(90, 2147483647, var2 - 199 * var4 / var3, 199, -90 + (-4 + (-120 + SoftwareRasterizer.height)));
          Bzip2DecoderState.field_f.setBounds(0, 2147483647, 202 + (var2 + 438 * var4 / var3), 438, -120 + SoftwareRasterizer.height - 4);
          return;
        }
        field_s = -62;
        var3Lifetime1 = BufferedFile.field_h * BufferedFile.field_h;
        var4Lifetime1 = var3Lifetime1 - progress * progress;
        SceneNode.field_k.setBounds(90, 2147483647, var2 - 199 * var4Lifetime1 / var3Lifetime1, 199, -90 + (-4 + (-120 + SoftwareRasterizer.height)));
        Bzip2DecoderState.field_f.setBounds(0, 2147483647, 202 + (var2 + 438 * var4Lifetime1 / var3Lifetime1), 438, -120 + SoftwareRasterizer.height - 4);
    }
}
