/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class IterableIntrusiveHashTable implements Iterable {
    static boolean receivedChatSystem;
    private IntrusiveNode lookupCursor;
    static Random packetDelayRandom;
    static String field_g;
    IntrusiveNode[] buckets;
    int bucketCount;
    static ResourceArchive field_a;
    static UiComponent field_b;

    public static void a(int param0) {
        field_a = null;
        field_g = null;
        field_b = null;
        if (param0 != 24968) {
          MusicTrack var2 = (MusicTrack) null;
          IterableIntrusiveHashTable.a(-14, true, (MusicTrack) null, -51, -100, true);
          packetDelayRandom = null;
          return;
        }
        packetDelayRandom = null;
    }

    final IntrusiveNode get(long key, int obfuscationGuard) {
        IntrusiveNode match = null;
        int unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        IntrusiveNode bucket = this.buckets[(int)((long)(this.bucketCount - 1) & key)];
        IntrusiveNode guardedMatch;
        this.lookupCursor = bucket.next;
        if (obfuscationGuard > 85) {
          while (bucket != this.lookupCursor) {
            if (key == this.lookupCursor.key) {
              match = this.lookupCursor;
              this.lookupCursor = this.lookupCursor.next;
              return match;
            }
            this.lookupCursor = this.lookupCursor.next;
          }
          this.lookupCursor = null;
          return null;
        }
        this.bucketCount = -72;
        while (bucket != this.lookupCursor) {
          if (key == this.lookupCursor.key) {
            guardedMatch = this.lookupCursor;
            this.lookupCursor = this.lookupCursor.next;
            return guardedMatch;
          }
          this.lookupCursor = this.lookupCursor.next;
        }
        this.lookupCursor = null;
        return null;
    }

    final void put(byte obfuscationGuard, long key, IntrusiveNode node) {
        IntrusiveNode var5 = null;
        try {
          if (null != node.previous) {
            node.unlink((byte) 111);
          }
          var5 = this.buckets[(int)(key & (long)(-1 + this.bucketCount))];
          node.previous = var5.previous;
          node.next = var5;
          node.previous.next = node;
          node.next.previous = node;
          int var6 = -64 % ((obfuscationGuard + 60) / 52);
          node.key = key;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ji.D(" + obfuscationGuard + ',' + key + ',' + (node != null ? "{...}" : "null") + ')');
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new IntrusiveHashIterator(this));
    }

    final static void a(int param0, boolean param1, MusicTrack param2, int param3, int param4, boolean param5) {
        Object var6 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        Throwable decompiledCaughtException = null;
        Object var6_ref = null;
        RuntimeException var6_ref2 = null;
        try {
          var6_ref = DirectByteStorage.field_f;
          synchronized (var6_ref) {
            if (param0 != 25459) {
              field_g = (String) null;
            }
            if (IsaacGenerator.field_a == param2) {
              return;
            }
            IsaacGenerator.field_a = param2;
            if (IsaacGenerator.field_a != null) {
              ConditionalTextValue.musicSynthesizer.a(param4, IsaacGenerator.field_a, param3, param1, param0 - 25460, param5);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_15_0 = var6_ref2;
          stackIn_15_1 = new StringBuilder().append("ji.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    IterableIntrusiveHashTable(int bucketCount) {
        int var2 = 0;
        IntrusiveNode dupTemp$1 = null;
        IntrusiveNode var3;
        this.buckets = new IntrusiveNode[bucketCount];
        this.bucketCount = bucketCount;
        for (var2 = 0; var2 < bucketCount; var2++) {
          dupTemp$1 = new IntrusiveNode();
          var3 = dupTemp$1;
          this.buckets[var2] = dupTemp$1;
          var3.previous = var3;
          var3.next = var3;
        }
    }

    final static lo a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        lo var7 = null;
        int var8 = 0;
        lo stackIn_3_0 = null;
        lo stackIn_7_0 = null;
        lo stackIn_10_0 = null;
        lo stackIn_15_0 = null;
        lo stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_3_0 = la.field_a;
            return stackIn_3_0;
          }
          if (255 < var2_int) {
            stackIn_7_0 = BitPacketBuffer.field_r;
            return stackIn_7_0;
          }
          var3 = FarmBackground.a((byte) -11, param0, '.');
          if (2 > var3.length) {
            stackIn_10_0 = la.field_a;
            return stackIn_10_0;
          }
          var4 = var3;
          var5 = param1;
          while (true) {
            if (var4.length <= var5) {
              stackIn_18_0 = ResourceArchive.a((byte) -95, var3[var3.length - 1]);
              return stackIn_18_0;
            }
            var6 = var4[var5];
            var7 = QuickChatHelpDialog.a(param1 ^ 95, var6);
            if (var7 == null) {
              var5++;
              continue;
            }
            break;
          }
          stackIn_15_0 = var7;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("ji.A(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_g = "Friends";
        packetDelayRandom = new Random();
    }
}
