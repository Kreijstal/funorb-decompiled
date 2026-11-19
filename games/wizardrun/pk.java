/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk extends IntrusiveNode {
    int field_i;
    int field_r;
    static boolean field_s;
    int[] field_p;
    int[] field_t;
    byte[][][] field_k;
    AsyncRequest[] field_l;
    static volatile boolean field_o;
    static String field_q;
    static PcmStreamMixer field_n;
    AsyncRequest[] field_m;
    int[] field_j;

    final static void a(Sprite param0, boolean param1) {
        try {
          if (param1) {
            Sprite var3 = (Sprite) null;
            pk.a((Sprite) null, true);
          }
          StrongCacheEntry.field_v = param0;
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "pk.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(byte param0) {
        if (param0 != -35) {
          pk.releaseStatics(63);
          if (null == kj.field_b) {
            return false;
          }
          if (kj.field_b.f(0) != null) {
            return true;
          }
          return false;
        }
        if (null == kj.field_b) {
          return false;
        }
        if (kj.field_b.f(0) != null) {
          return true;
        }
        return false;
    }

    public static void releaseStatics(int param0) {
        field_n = null;
        field_q = null;
        if (param0 != -15563) {
          pk.a((byte) 103);
        }
    }

    pk() {
    }

    static {
        field_s = true;
        field_q = "Quit to website";
        field_o = true;
    }
}
