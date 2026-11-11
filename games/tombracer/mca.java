/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mca {
    short[] field_a;
    byte[] field_b;
    static String field_d;
    short[] field_e;
    short[] field_c;

    final static boolean isCourseAvailable(byte param0, int param1) {
        boolean stackIn_12_0 = false;
        if (0 == param1) {
          return true;
        }
        if (ChatChannelType.a((byte) 64) == param1) {
          return true;
        }
        if (param0 != 6) {
          mca.isCourseAvailable((byte) 65, -116);
        }
        if (TextWidgetPainter.a(114)) {
          return false;
        }
        if (mq.field_e == null) {
          return false;
        }
        stackIn_12_0 = (mq.field_e.isCourseUnlocked((byte) -102, param1));
        return stackIn_12_0;
    }

    final static void writeScoreSubmission(ScoreSubmission param0, int param1, int param2) {
        BitPacketBuffer var7 = null;
        BitPacketBuffer var8 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        try {
          var7 = ql.field_k;
          var8 = var7;
          var8.writeCipheredOpcode(param2, -2988);
          var8.position = var8.position + 1;
          var4 = var8.position;
          var8.writeByte(1, 0);
          var8.writeShort(-1477662136, param0.submissionId);
          var8.writeShort(-1477662136, param0.courseId);
          var8.writeShort(param1 ^ -1477662136, param0.courseIdComplement);
          var8.writeInt(param0.field_i, (byte) -36);
          var8.writeInt(param0.field_g, (byte) -75);
          var8.writeInt(param0.field_k, (byte) -63);
          var8.writeInt(param0.field_j, (byte) 124);
          var8.writeByte(param0.scores.length, 0);
          for (var5 = param1; var5 < param0.scores.length; var5++) {
            var7.writeInt(param0.scores[var5], (byte) 96);
          }
          var8.appendCrc32(var4, 64);
          var8.backpatchByteLength(-var4 + var8.position, (byte) 72);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "mca.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_d = null;
        if (param0 != 0) {
          field_d = (String) null;
        }
    }

    static {
        field_d = "Please enter your date of birth to enable chat:";
    }
}
