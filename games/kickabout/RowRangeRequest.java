/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RowRangeRequest extends IntrusiveNode {
    static byte[][] field_e;
    private int category;
    static int field_h;
    private int count;
    private int startIndex;
    static String field_g;
    static vn field_k;
    static Sprite field_f;

    final void writeToPacket(CipherPacketBuffer param0, byte param1) {
        try {
          param0.writeByte(112, this.category);
          param0.writeMedium(this.startIndex, (byte) 118);
          param0.writeByte(102, this.count);
          if (param1 < 89) {
            CipherPacketBuffer var4 = (CipherPacketBuffer) null;
            this.writeToPacket((CipherPacketBuffer) null, (byte) 107);
          }
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "es.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        field_g = null;
        field_e = (byte[][]) null;
        if (param0 != -49) {
          return;
        }
        field_f = null;
        field_k = null;
    }

    RowRangeRequest(int param0, int param1, int param2) {
        this.count = param2;
        this.startIndex = param1;
        this.category = param0;
    }

    final static void a(int param0, FootballerAgent param1, int param2, FootballerAgent param3, BallAgent param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        BallAgent var8 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4.possessorTeam == -1) {
            return;
          }
          var5_int = param1.pixelX(-92) - param4.pixelX(true);
          if (param0 >= -56) {
            var8 = (BallAgent) null;
            RowRangeRequest.a(-29, (FootballerAgent) null, -8, (FootballerAgent) null, (BallAgent) null);
          }
          var6 = param1.pixelY(true) - param4.pixelY(879306160);
          var7 = nb.keeperReach(param1, 170);
          if (var7 * var7 <= var5_int * var5_int + var6 * var6) {
            return;
          }
          param1.startTackle(0, -1);
          param1.actionTime = 200;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("es.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param4 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    static {
        field_g = "Continue";
    }
}
