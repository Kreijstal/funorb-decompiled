/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoundPlayback extends IntrusiveNode {
    static AccountProtocolState field_l;
    private int field_n;
    IntrusiveNode field_k;
    PcmSampleStream field_j;
    static String field_m;
    static int[] field_i;

    final void setVolume(byte param0, int param1) {
        param1 = param1 << 6;
        this.field_n = param1;
        if (param0 <= -53) {
          this.field_j.setVolume(128 + SecondaryNodeDeque.field_d * param1 >> 8);
          return;
        }
    }

    final void setPlaybackStep(int param0, boolean param1) {
        this.field_j.setPlaybackStep(param0);
        if (param1) {
          this.setPlaybackStep(117, false);
        }
    }

    final void setInternalVolume(int param0, boolean param1) {
        this.field_n = param0;
        if (!param1) {
          return;
        }
        this.field_j.setVolume(SecondaryNodeDeque.field_d * param0 + 128 >> 8);
    }

    final void setPan(int param0, int param1) {
        this.field_j.setPan(param0);
        if (param1 >= -59) {
          PacketBuffer var4 = (PacketBuffer) null;
          SoundPlayback.a(65, (byte) -18, (PacketBuffer) null, 106, -96);
        }
    }

    SoundPlayback(PcmSampleStream param0, IntrusiveNode param1) {
        try {
          this.field_j = param0;
          this.field_n = param0.getVolume();
          this.field_k = param1;
          this.field_j.setVolume(this.field_n * SecondaryNodeDeque.field_d + 128 >> 8);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "ui.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, byte param1, PacketBuffer param2, int param3, int param4) {
        param2.writeByte(111, 12);
        param2.writeShort(param1 - 652561689, 17);
        param2.writeShort(-652561784, param0);
        if (param1 != -95) {
          return;
        }
        try {
          param2.writeShort(-652561784, param3);
          param2.writeByte(111, param4);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "ui.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void clearSharedReferences(int param0) {
        field_l = null;
        field_m = null;
        field_i = null;
        if (param0 != 128) {
          field_m = (String) null;
        }
    }

    static {
        field_l = new AccountProtocolState();
        field_m = "Select Vehicle";
        field_i = fc.createHorizontalPointPairs(-109, 15, 4);
    }
}
