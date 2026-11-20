/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class IterableSecondaryNodeDeque implements Iterable {
    static byte[][] field_e;
    static BufferedSocket field_h;
    static RotatedSpriteAsset[] field_c;
    static int field_f;
    static DiskCacheWorker field_d;
    DualLinkNode field_i;
    static float field_b;
    static boolean[] field_g;
    static SpriteAsset field_a;

    public final Iterator iterator() {
        return (Iterator) ((Object) new SecondaryNodeDequeIterator(this));
    }

    final DualLinkNode removeFirst(byte param0) {
        if (param0 != 121) {
          return (DualLinkNode) null;
        }
        DualLinkNode var2 = this.field_i.secondaryNext;
        if (this.field_i != var2) {
          var2.unlinkSecondary((byte) -42);
          return var2;
        }
        return null;
    }

    public static void clearSharedReferences(byte param0) {
        field_g = null;
        field_a = null;
        field_e = (byte[][]) null;
        field_c = null;
        field_h = null;
        field_d = null;
        if (param0 <= 75) {
          field_f = 94;
        }
    }

    final void addLast(DualLinkNode param0, int param1) {
        if (param0.secondaryPrevious != null) {
          param0.unlinkSecondary((byte) -42);
        }
        param0.secondaryNext = this.field_i;
        param0.secondaryPrevious = this.field_i.secondaryPrevious;
        param0.secondaryPrevious.secondaryNext = param0;
        if (param1 != -29460) {
          return;
        }
        try {
          param0.secondaryNext.secondaryPrevious = param0;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "lk.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int scaleRgb(float param0, int param1, int param2) {
        int var3 = param2 >> 16 & 255;
        int var4 = (param2 & 65280) >> 8;
        var3 = (int)((float)var3 * param0);
        int var5 = param2 & 255;
        var4 = (int)((float)var4 * param0);
        if (var3 < 0) {
          var3 = 0;
        }
        var5 = (int)((float)var5 * param0);
        if (0 > var4) {
          var4 = 0;
        }
        if (var3 > 255) {
          var3 = 255;
        }
        if (255 < var4) {
          var4 = 255;
        }
        if (~var5 > param1) {
          var5 = 0;
        }
        if (var5 > 255) {
          var5 = 255;
        }
        return var5 | (var4 << 8 | var3 << 16);
    }

    private IterableSecondaryNodeDeque() throws Throwable {
        throw new Error();
    }

    final static float evaluateBezier(float[] param0, int param1, int param2, int param3, float param4) {
        RuntimeException var5 = null;
        float stackIn_4_0 = 0.0f;
        float stackIn_6_0 = 0.0f;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -1) {
            field_d = (DiskCacheWorker) null;
          }
          if (param2 != 0) {
            stackIn_6_0 = (1.0f - param4) * IterableSecondaryNodeDeque.evaluateBezier(param0, param1, -1 + param2, -1, param4) + param4 * IterableSecondaryNodeDeque.evaluateBezier(param0, 1 + param1, param2 - 1, -1, param4);
            return stackIn_6_0;
          }
          stackIn_4_0 = param0[param1];
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("lk.B(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_f = 0;
        field_g = new boolean[112];
    }
}
