/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc {
    static int field_b;
    static String field_a;
    static qh[] field_c;

    final static void a(byte param0) {
        if (mj.field_d >= 1000) {
          int var1 = aj.field_a.a((byte) 23, true);
          if (param0 == -75) {
            if (var1 == 3) {
              AudioService.a((byte) 72, PointCloudEffect.d((byte) -128));
            }
            if (var1 == 1) {
              wk.field_c = false;
              mj.field_d = 0;
              t stackIn_54_0 = AlternateUsernameCredentials.field_q;
              int stackIn_54_1 = -26480;
              boolean stackIn_55_2 = (2 != var1) ? false : true;
              ((t) (Object) stackIn_54_0).b(stackIn_54_1, stackIn_55_2);
            } else {
              if (var1 != 2) {
                return;
              }
              wk.field_c = false;
              mj.field_d = 0;
              t stackIn_60_0 = AlternateUsernameCredentials.field_q;
              int stackIn_60_1 = -26480;
              boolean stackIn_61_2 = (2 != var1) ? false : true;
              ((t) (Object) stackIn_60_0).b(stackIn_60_1, stackIn_61_2);
            }
          } else {
            field_b = -124;
            if (var1 == 3) {
              AudioService.a((byte) 72, PointCloudEffect.d((byte) -128));
            }
            if (var1 == 1) {
              wk.field_c = false;
              mj.field_d = 0;
              t stackIn_39_0 = AlternateUsernameCredentials.field_q;
              int stackIn_39_1 = -26480;
              boolean stackIn_40_2 = (2 != var1) ? false : true;
              ((t) (Object) stackIn_39_0).b(stackIn_39_1, stackIn_40_2);
            } else {
              if (var1 != 2) {
                return;
              }
              wk.field_c = false;
              mj.field_d = 0;
              t stackIn_45_0 = AlternateUsernameCredentials.field_q;
              int stackIn_45_1 = -26480;
              boolean stackIn_46_2 = (2 != var1) ? false : true;
              ((t) (Object) stackIn_45_0).b(stackIn_45_1, stackIn_46_2);
            }
          }
          ChatMessage.clearFrameOffsets((byte) -58);
          LaserGateSpan.field_k = 0;
          return;
        }
        mj.field_d = mj.field_d + 1;
        int var1Lifetime1 = aj.field_a.a((byte) 23, true);
        if (param0 == -75) {
          if (var1Lifetime1 == 3) {
            AudioService.a((byte) 72, PointCloudEffect.d((byte) -128));
          }
          if (var1Lifetime1 == 1) {
            wk.field_c = false;
            mj.field_d = 0;
            t stackIn_8_0 = AlternateUsernameCredentials.field_q;
            int stackIn_8_1 = -26480;
            boolean stackIn_9_2 = (2 != var1Lifetime1) ? false : true;
            ((t) (Object) stackIn_8_0).b(stackIn_8_1, stackIn_9_2);
          } else {
            if (var1Lifetime1 != 2) {
              return;
            }
            wk.field_c = false;
            mj.field_d = 0;
            t stackIn_14_0 = AlternateUsernameCredentials.field_q;
            int stackIn_14_1 = -26480;
            boolean stackIn_15_2 = (2 != var1Lifetime1) ? false : true;
            ((t) (Object) stackIn_14_0).b(stackIn_14_1, stackIn_15_2);
          }
          ChatMessage.clearFrameOffsets((byte) -58);
          LaserGateSpan.field_k = 0;
          return;
        }
        field_b = -124;
        if (var1Lifetime1 == 3) {
          AudioService.a((byte) 72, PointCloudEffect.d((byte) -128));
        }
        if (var1Lifetime1 == 1) {
          wk.field_c = false;
          mj.field_d = 0;
          t stackIn_29_0 = AlternateUsernameCredentials.field_q;
          int stackIn_29_1 = -26480;
          boolean stackIn_30_2 = (2 != var1Lifetime1) ? false : true;
          ((t) (Object) stackIn_29_0).b(stackIn_29_1, stackIn_30_2);
          ChatMessage.clearFrameOffsets((byte) -58);
          LaserGateSpan.field_k = 0;
        } else if (var1Lifetime1 == 2) {
          wk.field_c = false;
          mj.field_d = 0;
          t stackIn_24_0 = AlternateUsernameCredentials.field_q;
          int stackIn_24_1 = -26480;
          boolean stackIn_25_2 = (2 != var1Lifetime1) ? false : true;
          ((t) (Object) stackIn_24_0).b(stackIn_24_1, stackIn_25_2);
          ChatMessage.clearFrameOffsets((byte) -58);
          LaserGateSpan.field_k = 0;
        }
    }

    public static void releaseStatics(int guard) {
        if (guard != -28377) {
          return;
        }
        field_c = null;
        field_a = null;
    }

    static {
        field_a = "Triple shot";
        field_b = 64;
    }
}
