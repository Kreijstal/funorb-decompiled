/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NetworkArchiveRequest extends ArchiveRequest {
    PacketBuffer field_y;
    byte field_x;
    static String field_A;
    static int field_z;
    int field_w;
    static String field_v;

    final static void a(byte param0, int param1) {
        BitPacketBuffer var2 = null;
        int var3 = 0;
        if (param0 == 81) {
          var2 = EditableTextField.field_U;
          var2.writeCipheredByte(param1, -118);
          var2.position = var2.position + 1;
          var3 = var2.position;
          var2.writeByte(2, (byte) 47);
          var2.writeBytes(DelegatingCanvas.field_f, (byte) -45, 0, DelegatingCanvas.field_f.length);
          var2.writeByte(MusicPatchNode.field_u, (byte) -69);
          var2.writeByte(PacketBuffer.field_n, (byte) 107);
          var2.writeBytes(SoundCache.field_d, (byte) -45, 0, SoundCache.field_d.length);
          var2.backpatchByteLength(var2.position - var3, -1);
          return;
        }
    }

    public static void resetStaticState(byte param0) {
        field_v = null;
        if (param0 < 17) {
          field_z = 70;
          field_A = null;
          return;
        }
        field_A = null;
    }

    NetworkArchiveRequest() {
    }

    final int getProgressPercent(int param0) {
        if (param0 <= 51) {
          NetworkArchiveRequest.a((byte) -115, 18);
          if (null != this.field_y) {
            return 100 * this.field_y.position / (this.field_y.data.length - this.field_x);
          }
          return 0;
        }
        if (null != this.field_y) {
          return 100 * this.field_y.position / (this.field_y.data.length - this.field_x);
        }
        return 0;
    }

    final byte[] getData(boolean param0) {
        if (this.field_s) {
          throw new RuntimeException();
        }
        if (-this.field_x + this.field_y.data.length > this.field_y.position) {
          throw new RuntimeException();
        }
        if (!param0) {
          return this.field_y.data;
        }
        this.field_y = (PacketBuffer) null;
        return this.field_y.data;
    }

    static {
        field_v = "Checking";
    }
}
