/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class PendingBytePayloadRequest extends IntrusiveNode {
    byte[] field_j;
    static volatile int field_m;
    static java.util.zip.CRC32 field_h;
    static Js5ArchiveManager field_l;
    static int field_i;
    int field_k;

    final static void resetFrameTimingHistory(byte param0) {
        int var1_int = 0;
        int var2 = ZombieDawn.field_J;
        CivilianHuman.field_yb.resetTiming(true);
        for (var1_int = 0; var1_int < 32; var1_int++) {
          LoginNameValue.field_c[var1_int] = 0L;
        }
        if (param0 != -50) {
          return;
        }
        try {
          for (var1_int = 0; var1_int < 32; var1_int++) {
            ZombieDawn.field_E[var1_int] = 0L;
          }
          StationaryRifleman.field_Ob = 0;
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "ep.C(" + param0 + ')');
        }
    }

    final static void setViewportSize(int param0, int param1, int param2) {
        if (param2 != -21141) {
          PendingBytePayloadRequest.resetFrameTimingHistory((byte) 112);
        }
        DropdownItemList.field_N = param1;
        PendingIntArrayRequest.field_l = param0;
        if (null != CivilianHuman.field_xb) {
          CivilianHuman.field_xb.recentreDialogs(param0, false, param1);
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != 0) {
          field_m = -48;
        }
        field_h = null;
        field_l = null;
    }

    private PendingBytePayloadRequest() throws Throwable {
        throw new Error();
    }

    static {
        field_m = 0;
        field_h = new java.util.zip.CRC32();
    }
}
