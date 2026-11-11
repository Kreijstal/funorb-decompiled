/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class GpuDataType {
    int field_e;
    static GpuDataType field_a;
    static GpuDataType field_k;
    static GpuDataType field_m;
    static GpuDataType field_g;
    static GpuDataType field_f;
    static GpuDataType field_i;
    static GpuDataType field_l;
    static GpuDataType field_h;
    static UiComponent field_j;
    static int field_c;
    static String field_d;
    static int textureWidthMask;

    final static boolean a(byte param0) {
        int var1 = -97 / ((param0 - 0) / 40);
        return qoa.field_a;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    private GpuDataType(int param0) {
        this.field_e = param0;
    }

    final static int a(BitSet param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 20297) {
            stackIn_2_0 = -19;
            return stackIn_2_0;
          }
          var2_int = RandomAccessFileHandle.getConnectorRoomCount(41);
          var3 = ArchiveNetworkClient.countSetBits(param0, 83);
          var4 = aq.getMainRoomCount(-5640);
          var5 = var3 * var2_int / var4;
          var5 = Math.min(2 + var5, var2_int);
          stackIn_4_0 = var5;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("una.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void releaseStatics(boolean param0) {
        field_m = null;
        if (param0) {
          field_a = null;
          field_g = null;
          field_f = null;
          field_i = null;
          field_j = null;
          field_d = null;
          field_l = null;
          field_k = null;
          field_h = null;
          return;
        }
        BitSet var2 = (BitSet) null;
        GpuDataType.a((BitSet) null, -34);
        field_a = null;
        field_g = null;
        field_f = null;
        field_i = null;
        field_j = null;
        field_d = null;
        field_l = null;
        field_k = null;
        field_h = null;
    }

    static {
        field_a = new GpuDataType(1);
        field_k = new GpuDataType(2);
        field_m = new GpuDataType(4);
        field_g = new GpuDataType(1);
        field_f = new GpuDataType(2);
        field_i = new GpuDataType(4);
        field_l = new GpuDataType(2);
        field_h = new GpuDataType(4);
        field_d = "Your game";
        field_c = 1;
    }
}
