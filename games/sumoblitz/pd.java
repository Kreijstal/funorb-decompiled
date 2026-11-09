/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd extends IntrusiveNode {
    static ProjectionMode PERSPECTIVE;
    int field_o;
    int field_k;
    static int field_l;
    static int scoreMultiplier;
    static Object hardwareRidgedWaterData;
    static String nameText;
    static int[] field_q;

    public static void releaseStatics(byte param0) {
        if (param0 <= -117) {
          field_q = null;
          nameText = null;
          hardwareRidgedWaterData = null;
          PERSPECTIVE = null;
          return;
        }
        pd.releaseStatics((byte) 113);
        field_q = null;
        nameText = null;
        hardwareRidgedWaterData = null;
        PERSPECTIVE = null;
    }

    final static void sendHiscoreRequest(byte guard, int opcode, HiscoreRequest request) {
        IsaacPacketBuffer var3 = null;
        try {
          if (guard != -65) {
            PERSPECTIVE = (ProjectionMode) null;
          }
          var3 = InwardSparkParticle.field_v;
          var3.writeCipherByte(opcode, 8);
          var3.writeByte((byte) 103, 5);
          var3.writeByte((byte) 46, 0);
          var3.writeShort(117, request.tableId);
          var3.writeByte((byte) 86, request.rowCount);
          var3.writeByte((byte) 121, request.columnCount);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "pd.A(" + guard + ',' + opcode + ',' + (request != null ? "{...}" : "null") + ')');
        }
    }

    final static ServerDataWriteRequest writeServerData(byte[] payload, int opcode, int guard) {
        ServerDataWriteRequest var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        ServerDataWriteRequest stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != 5412) {
            var4 = (byte[]) null;
            pd.writeServerData((byte[]) null, 48, 96);
          }
          var3 = new ServerDataWriteRequest(payload);
          LoginMethodPreference.field_a.addLast((IntrusiveNode) (var3), (byte) 39);
          ArchiveLoadingStage.sendServerDataWrite(var3, guard - 5530, opcode);
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("pd.B(");
          if (payload == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(opcode).append(',').append(guard).append(')').toString());
        }
    }

    private pd() throws Throwable {
        throw new Error();
    }

    static {
        PERSPECTIVE = new ProjectionMode();
        nameText = "Name";
    }
}
