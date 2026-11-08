/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class LoginCredentials {
    static IntrusiveDeque field_a;
    static UiLayoutNode field_b;
    static int field_e;
    static IndexedSprite[][] field_c;
    static int[] field_d;

    final static void setTutorialRestrictions(int param0, boolean param1, boolean param2, boolean param3, boolean param4, boolean param5, boolean param6) {
        CommonGame stackIn_2_0 = null;
        boolean stackIn_3_1 = false;
        CommonGame stackIn_5_0 = null;
        boolean stackIn_6_1 = false;
        CommonGame stackIn_9_0 = null;
        boolean stackIn_10_1 = false;
        CommonGame stackIn_12_0 = null;
        boolean stackIn_13_1 = false;
        CommonGame stackIn_15_0 = null;
        boolean stackIn_16_1 = false;
        CommonGame stackIn_18_0 = null;
        boolean stackIn_19_1 = false;
        CommonGame stackIn_22_0 = null;
        boolean stackIn_23_1 = false;
        CommonGame stackIn_25_0 = null;
        boolean stackIn_26_1 = false;
        CommonGame stackIn_28_0 = null;
        boolean stackIn_29_1 = false;
        CommonGame stackIn_31_0 = null;
        boolean stackIn_32_1 = false;
        stackIn_2_0 = ThumbnailStateFactory.field_d;
        stackIn_3_1 = (param5) ? false : true;
        stackIn_2_0.field_h = stackIn_3_1;
        stackIn_5_0 = ThumbnailStateFactory.field_d;
        stackIn_6_1 = (param2) ? false : true;
        stackIn_5_0.field_l = stackIn_6_1;
        if (param0 == -25246) {
          stackIn_9_0 = ThumbnailStateFactory.field_d;
          stackIn_10_1 = (param6) ? false : true;
          stackIn_9_0.field_A = stackIn_10_1;
          stackIn_12_0 = ThumbnailStateFactory.field_d;
          stackIn_13_1 = (param1) ? false : true;
          stackIn_12_0.field_Y = stackIn_13_1;
          stackIn_15_0 = ThumbnailStateFactory.field_d;
          stackIn_16_1 = (param4) ? false : true;
          stackIn_15_0.field_y = stackIn_16_1;
          stackIn_18_0 = ThumbnailStateFactory.field_d;
          stackIn_19_1 = (param3) ? false : true;
          stackIn_18_0.field_z = stackIn_19_1;
        } else {
          LoginCredentials.ensureLoginPayloadAvailable(23);
          stackIn_22_0 = ThumbnailStateFactory.field_d;
          stackIn_23_1 = (param6) ? false : true;
          stackIn_22_0.field_A = stackIn_23_1;
          stackIn_25_0 = ThumbnailStateFactory.field_d;
          stackIn_26_1 = (param1) ? false : true;
          stackIn_25_0.field_Y = stackIn_26_1;
          stackIn_28_0 = ThumbnailStateFactory.field_d;
          stackIn_29_1 = (param4) ? false : true;
          stackIn_28_0.field_y = stackIn_29_1;
          stackIn_31_0 = ThumbnailStateFactory.field_d;
          stackIn_32_1 = (param3) ? false : true;
          stackIn_31_0.field_z = stackIn_32_1;
        }
    }

    final static int highestOneBit(byte param0, int param1) {
        int var2 = 0;
        int var2Lifetime1;
        if (param0 <= -60) {
          var2 = param1 >>> 1;
          var2 = var2 | var2 >>> 1;
          var2 = var2 | var2 >>> 2;
          var2 = var2 | var2 >>> 4;
          var2 = var2 | var2 >>> 8;
          var2 = var2 | var2 >>> 16;
          return ~var2 & param1;
        }
        LoginCredentials.releaseStatics(-77);
        var2Lifetime1 = param1 >>> 1;
        var2Lifetime1 = var2Lifetime1 | var2Lifetime1 >>> 1;
        var2Lifetime1 = var2Lifetime1 | var2Lifetime1 >>> 2;
        var2Lifetime1 = var2Lifetime1 | var2Lifetime1 >>> 4;
        var2Lifetime1 = var2Lifetime1 | var2Lifetime1 >>> 8;
        var2Lifetime1 = var2Lifetime1 | var2Lifetime1 >>> 16;
        return ~var2Lifetime1 & param1;
    }

    public static void releaseStatics(int param0) {
        field_b = null;
        field_d = null;
        field_c = (IndexedSprite[][]) null;
        field_a = null;
        if (param0 != -27680) {
          field_c = (IndexedSprite[][]) null;
        }
    }

    final static boolean ensureLoginPayloadAvailable(int param0) {
        if (MusicVolumeSupport.field_b == -1) {
          if (!SetLagCommand.a((byte) 52, 1)) {
            return false;
          }
          MusicVolumeSupport.field_b = ByteArrayPool.field_e.readUnsignedByte((byte) -106);
          ByteArrayPool.field_e.field_n = 0;
        }
        if (param0 != 180) {
          return false;
        }
        if (MusicVolumeSupport.field_b != -2) {
          return SetLagCommand.a((byte) -114, MusicVolumeSupport.field_b);
        }
        if (!SetLagCommand.a((byte) 29, 2)) {
          return false;
        }
        MusicVolumeSupport.field_b = ByteArrayPool.field_e.readUnsignedShort((byte) 81);
        ByteArrayPool.field_e.field_n = 0;
        return SetLagCommand.a((byte) -114, MusicVolumeSupport.field_b);
    }

    abstract LoginKind getLoginKind(byte param0);

    abstract void writeCredentials(PacketBuffer param0, int param1);

    static {
        field_a = new IntrusiveDeque();
        field_d = new int[7];
        field_d[6] = 14000;
        field_d[0] = 0;
        field_d[5] = 7000;
        field_d[2] = 180;
        field_d[4] = 1700;
        field_d[3] = 560;
        field_d[1] = 10;
    }
}
