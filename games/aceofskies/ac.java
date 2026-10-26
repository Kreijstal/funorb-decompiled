/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac implements gd {
    int field_a;
    static int field_c;
    static int[] field_e;
    static String field_d;
    int field_g;
    static jb field_b;
    static RenderSprite[] keySprites;

    final static void a(int param0, int param1, oc param2) {
        CipherPacketBuffer var5 = q.outgoingPacket;
        var5.writeCipheredOpcode(43, param0);
        var5.position = var5.position + 1;
        int var4 = var5.position;
        var5.writeByte(-1336879960, 1);
        var5.writeByte(-1336879960, param2.field_k);
        var5.writeByte(-1336879960, param2.field_i);
        var5.writeInt((byte) 97, param2.field_j);
        var5.writeInt((byte) 61, param2.field_l);
        if (param1 != 0) {
          return;
        }
        try {
          var5.writeInt((byte) 90, param2.field_h);
          var5.writeInt((byte) 75, param2.field_f);
          var5.appendCrc32(var4, 45);
          var5.patchByteLength(-var4 + var5.position, (byte) 76);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ac.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        keySprites = null;
        field_e = null;
        field_b = null;
        field_d = null;
        if (param0 != -28819) {
          field_e = (int[]) null;
        }
    }

    final static mo a(boolean param0, int param1, byte[] param2, jc param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        mo stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == null) {
            stackIn_2_0 = null;
            return (mo) (stackIn_2_0);
          }
          var4_int = jaggl.OpenGL.glGenProgramARB();
          jaggl.OpenGL.glBindProgramARB(param1, var4_int);
          jaggl.OpenGL.glProgramRawARB(param1, 34933, param2);
          jaggl.OpenGL.glGetIntegerv(34379, ClientException.field_b, 0);
          if (-1 != ClientException.field_b[0]) {
            jaggl.OpenGL.glBindProgramARB(param1, 0);
            stackIn_5_0 = null;
            return (mo) (stackIn_5_0);
          }
          jaggl.OpenGL.glBindProgramARB(param1, 0);
          if (!param0) {
            field_b = (jb) null;
          }
          stackIn_9_0 = new mo(param3, param1, var4_int);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("ac.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    ac(int param0, int param1) {
        this.field_g = param1;
        this.field_a = param0;
    }

    final static void writeScoreSubmission(int firstScoreIndex, int opcode, ScoreSubmission submission) {
        CipherPacketBuffer packet = null;
        CipherPacketBuffer packetAlias = null;
        int payloadStartPosition = 0;
        int scoreIndex = 0;
        int obfuscationControl = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          packet = q.outgoingPacket;
          packetAlias = packet;
          packetAlias.writeCipheredOpcode(52, opcode);
          packetAlias.position = packetAlias.position + 1;
          payloadStartPosition = packetAlias.position;
          packetAlias.writeByte(-1336879960, 1);
          packetAlias.writeShort(submission.submissionId, 23385);
          packetAlias.writeShort(submission.firstShortValue, 23385);
          packetAlias.writeShort(submission.secondShortValue, 23385);
          packetAlias.writeInt((byte) 34, submission.firstContextValue);
          packetAlias.writeInt((byte) 80, submission.secondContextValue);
          packetAlias.writeInt((byte) 93, submission.thirdContextValue);
          packetAlias.writeInt((byte) 113, submission.fourthContextValue);
          packetAlias.writeByte(-1336879960, submission.scores.length);
          for (scoreIndex = firstScoreIndex; submission.scores.length > scoreIndex; scoreIndex++) {
            packet.writeInt((byte) 92, submission.scores[scoreIndex]);
          }
          packetAlias.appendCrc32(payloadStartPosition, firstScoreIndex + 108);
          packetAlias.patchByteLength(packetAlias.position - payloadStartPosition, (byte) 93);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ac.C(" + firstScoreIndex + ',' + opcode + ',' + (submission != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = new int[1000];
        field_b = new jb();
    }
}
