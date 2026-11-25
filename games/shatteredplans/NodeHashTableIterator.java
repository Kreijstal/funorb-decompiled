/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class NodeHashTableIterator implements Iterator {
    static Sprite field_b;
    static int field_f;
    private IntrusiveNode lastReturned;
    private IntrusiveNode nextNode;
    private IterableNodeHashTable table;
    static String field_e;
    private int nextBucketIndex;
    static int field_h;

    public static void clearStatics(int param0) {
        field_e = null;
        field_b = null;
        if (param0 != -1) {
          Star var2 = (Star) null;
          NodeHashTableIterator.a((Star) null, (byte) -77);
        }
    }

    public final void remove() {
        if (null == this.lastReturned) {
          throw new IllegalStateException();
        }
        this.lastReturned.unlink((byte) -90);
        this.lastReturned = null;
    }

    final static AnimatedPanel a(int param0) {
        int var1 = -56 % ((-22 - param0) / 48);
        return wg.field_a.field_Eb;
    }

    final static void a(Star param0, byte param1) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        FleetMove var3 = null;
        int var4 = 0;
        int var5 = 0;
        FleetMove var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Star var10 = null;
        DualLinkDeque var11 = null;
        FleetMove var3Lifetime1;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (null == param0.field_s.startForward(-128)) {
            return;
          }
          if (param1 < 35) {
            var10 = (Star) null;
            NodeHashTableIterator.a((Star) null, (byte) -17);
          }
          var11 = new DualLinkDeque();
          var11.addLast(param0.field_s.pollFirst(-123), 32);
          var3 = (FleetMove) (param0.field_s.startForward(-128));
          while (var3 != null) {
            var4 = var3.field_y.field_A - var3.field_B.field_A;
            var5 = var3.field_y.field_S - var3.field_B.field_S;
            var6 = (FleetMove) (var11.startForward(-127));
            while (var6 != null) {
              var7 = var6.field_y.field_A - var6.field_B.field_A;
              var8 = -var6.field_B.field_S + var6.field_y.field_S;
              if (!oo.a(var4, var5, var7, true, var8)) {
                var6 = (FleetMove) (var11.nextForward(32));
                continue;
              }
              TertiaryNodeList.a(var3, 0, var6);
              break;
            }
            if (var6 == null) {
              var11.addLast(var3, 32);
            }
            var3 = (FleetMove) (param0.field_s.nextForward(32));
          }
          var3Lifetime1 = (FleetMove) (var11.startForward(-127));
          while (var3Lifetime1 != null) {
            param0.field_s.addLast(var3Lifetime1, 32);
            var3Lifetime1 = (FleetMove) (var11.nextForward(32));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("fl.B(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    public final boolean hasNext() {
        int fieldTemp$0 = 0;
        int var2;
        var2 = ShatteredPlansClient.field_F ? 1 : 0;
        if (this.table.field_f[-1 + this.nextBucketIndex] != this.nextNode) {
          return true;
        }
        while (true) {
          if (this.table.field_d <= this.nextBucketIndex) {
            return false;
          }
          fieldTemp$0 = this.nextBucketIndex;
          this.nextBucketIndex = this.nextBucketIndex + 1;
          if (this.table.field_f[fieldTemp$0].next == this.table.field_f[this.nextBucketIndex - 1]) {
            this.nextNode = this.table.field_f[-1 + this.nextBucketIndex];
            continue;
          }
          break;
        }
        this.nextNode = this.table.field_f[this.nextBucketIndex - 1].next;
        return true;
    }

    final static void a(int param0, String param1) {
        try {
          ClientContextMenuSupport.field_a.addLast((byte) -113, new de(param1));
          if (param0 != 0) {
            Star var3 = (Star) null;
            NodeHashTableIterator.a((Star) null, (byte) 103);
          }
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "fl.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final Object next() {
        int fieldTemp$0 = 0;
        IntrusiveNode var1;
        int var2;
        var2 = ShatteredPlansClient.field_F ? 1 : 0;
        if (this.table.field_f[-1 + this.nextBucketIndex] != this.nextNode) {
          var1 = this.nextNode;
          this.nextNode = var1.next;
          this.lastReturned = var1;
          return var1;
        }
        do {
          if (this.table.field_d <= this.nextBucketIndex) {
            return null;
          }
          fieldTemp$0 = this.nextBucketIndex;
          this.nextBucketIndex = this.nextBucketIndex + 1;
          var1 = this.table.field_f[fieldTemp$0].next;
        } while (this.table.field_f[-1 + this.nextBucketIndex] == var1);
        this.lastReturned = var1;
        this.nextNode = var1.next;
        return var1;
    }

    NodeHashTableIterator(IterableNodeHashTable param0) {
        this.lastReturned = null;
        try {
          this.table = param0;
          this.reset(-107);
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "fl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final void reset(int param0) {
        this.lastReturned = null;
        if (param0 > -77) {
          this.next();
        }
        this.nextBucketIndex = 1;
        this.nextNode = this.table.field_f[0].next;
    }

    static {
        field_f = 360;
        field_e = "Animations do not play automatically. Click to enable.";
    }
}
