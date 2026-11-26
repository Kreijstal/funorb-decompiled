/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class NodeHashTableIterator implements Iterator {
    private IterableNodeHashTable table;
    private int nextBucketIndex;
    static java.math.BigInteger field_b;
    private IntrusiveNode nextNode;
    private IntrusiveNode lastReturned;
    static String field_d;
    static BufferedSocket field_a;
    static String field_e;

    public final void remove() {
        if (this.lastReturned == null) {
          throw new IllegalStateException();
        }
        this.lastReturned.unlink(2);
        this.lastReturned = null;
    }

    private final void reset(int param0) {
        this.nextNode = this.table.buckets[0].field_c;
        this.nextBucketIndex = 1;
        if (param0 != -1) {
          return;
        }
        this.lastReturned = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Bounce.field_N;
        try {
          SoftwareRasterizer.drawHorizontalLine(param3, param0, param2 + 1, 10000536);
          SoftwareRasterizer.drawHorizontalLine(param3, param0 + param4, param2 + 1, 12105912);
          var5_int = 1;
          var6 = param4;
          if (var5_int + param0 < SoftwareRasterizer.field_i) {
            var5_int = SoftwareRasterizer.field_i - param0;
          }
          if (param0 + var6 > SoftwareRasterizer.field_f) {
            var6 = -param0 + SoftwareRasterizer.field_f;
          }
          if (param1 != 1232050056) {
            return;
          }
          for (var7 = var5_int; var7 < var6; var7++) {
            var8 = 48 * var7 / param4 + 152;
            var9 = var8 | (var8 << 16 | var8 << 8);
            SoftwareRasterizer.field_d[param3 + SoftwareRasterizer.field_e * (var7 + param0)] = var9;
            SoftwareRasterizer.field_d[param3 + (param0 + var7) * SoftwareRasterizer.field_e + param2] = var9;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) var5), "dh.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final Object next() {
        int fieldTemp$0 = 0;
        IntrusiveNode var1;
        int var2;
        var2 = Bounce.field_N;
        if (this.nextNode != this.table.buckets[-1 + this.nextBucketIndex]) {
          var1 = this.nextNode;
          this.lastReturned = var1;
          this.nextNode = var1.field_c;
          return var1;
        }
        do {
          if (this.table.bucketCount <= this.nextBucketIndex) {
            return null;
          }
          fieldTemp$0 = this.nextBucketIndex;
          this.nextBucketIndex = this.nextBucketIndex + 1;
          var1 = this.table.buckets[fieldTemp$0].field_c;
        } while (this.table.buckets[this.nextBucketIndex - 1] == var1);
        this.lastReturned = var1;
        this.nextNode = var1.field_c;
        return var1;
    }

    public final boolean hasNext() {
        int fieldTemp$0 = 0;
        int var2;
        var2 = Bounce.field_N;
        if (this.table.buckets[-1 + this.nextBucketIndex] != this.nextNode) {
          return true;
        }
        while (true) {
          if (this.table.bucketCount <= this.nextBucketIndex) {
            return false;
          }
          fieldTemp$0 = this.nextBucketIndex;
          this.nextBucketIndex = this.nextBucketIndex + 1;
          if (this.table.buckets[fieldTemp$0].field_c == this.table.buckets[this.nextBucketIndex - 1]) {
            this.nextNode = this.table.buckets[-1 + this.nextBucketIndex];
            continue;
          }
          break;
        }
        this.nextNode = this.table.buckets[-1 + this.nextBucketIndex].field_c;
        return true;
    }

    final static void a(boolean param0, String param1, float param2, int param3) {
        try {
          if (param3 != -608757616) {
            field_a = (BufferedSocket) null;
          }
          if (q.field_A == null) {
            q.field_A = new db(q.field_N, ej.field_c);
            q.field_N.b(q.field_A, false);
          }
          q.field_A.a(param0, param2, param1, 65536);
          SoftwareRasterizer.clearRaster();
          pj.a(true, 1);
        } catch (RuntimeException runtimeException) {
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) runtimeException), "dh.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void clearStaticReferences(int param0) {
        field_d = null;
        field_b = null;
        if (param0 != 8832) {
          return;
        }
        field_e = null;
        field_a = null;
    }

    NodeHashTableIterator(IterableNodeHashTable param0) {
        this.lastReturned = null;
        try {
          this.table = param0;
          this.reset(-1);
        } catch (RuntimeException runtimeException) {
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) runtimeException), "dh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = new java.math.BigInteger("65537");
        field_d = "Loading...";
        field_e = "Connection restored.";
    }
}
