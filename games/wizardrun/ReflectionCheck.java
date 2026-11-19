/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ReflectionCheck extends IntrusiveNode {
    int requestId;
    int operationCount;
    static boolean field_s;
    int[] fieldWriteValues;
    int[] operationTypes;
    byte[][][] serializedArguments;
    AsyncRequest[] fieldTasks;
    static volatile boolean field_o;
    static String field_q;
    static PcmStreamMixer field_n;
    AsyncRequest[] methodTasks;
    int[] lookupErrors;

    final static void setMembershipOfferIcon(Sprite param0, boolean param1) {
        try {
          if (param1) {
            Sprite var3 = (Sprite) null;
            ReflectionCheck.setMembershipOfferIcon((Sprite) null, true);
          }
          StrongCacheEntry.field_v = param0;
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "pk.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(byte param0) {
        if (param0 != -35) {
          ReflectionCheck.releaseStatics(63);
          if (null == SystemMemoryHelpers.field_b) {
            return false;
          }
          if (SystemMemoryHelpers.field_b.getTopVisibleDialog(0) != null) {
            return true;
          }
          return false;
        }
        if (null == SystemMemoryHelpers.field_b) {
          return false;
        }
        if (SystemMemoryHelpers.field_b.getTopVisibleDialog(0) != null) {
          return true;
        }
        return false;
    }

    public static void releaseStatics(int param0) {
        field_n = null;
        field_q = null;
        if (param0 != -15563) {
          ReflectionCheck.a((byte) 103);
        }
    }

    ReflectionCheck() {
    }

    static {
        field_s = true;
        field_q = "Quit to website";
        field_o = true;
    }
}
