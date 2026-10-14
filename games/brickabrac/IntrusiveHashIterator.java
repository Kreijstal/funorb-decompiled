/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class IntrusiveHashIterator implements Iterator {
    static boolean field_j;
    static UiComponent field_a;
    private IterableIntrusiveHashTable table;
    private int bucketIndex;
    static tq field_g;
    private IntrusiveNode nextNode;
    private IntrusiveNode lastReturned;
    static UiComponent[] field_i;
    static RgbSprite[] field_f;
    static String[] field_b;
    static RgbSprite field_c;

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    private final void resetIterator(int obfuscationGuard) {
        this.bucketIndex = 1;
        this.nextNode = this.table.buckets[0].next;
        if (obfuscationGuard > -71) {
          return;
        }
        this.lastReturned = null;
    }

    public final boolean hasNext() {
        IntrusiveNode[] fieldTemp$0 = null;
        int fieldTemp$1 = 0;
        int var2;
        var2 = BrickABrac.field_J ? 1 : 0;
        if (this.nextNode != this.table.buckets[this.bucketIndex - 1]) {
          return true;
        }
        while (this.table.bucketCount > this.bucketIndex) {
          fieldTemp$0 = this.table.buckets;
          fieldTemp$1 = this.bucketIndex;
          this.bucketIndex = this.bucketIndex + 1;
          if (fieldTemp$0[fieldTemp$1].next != this.table.buckets[this.bucketIndex - 1]) {
            this.nextNode = this.table.buckets[this.bucketIndex - 1].next;
            return true;
          }
          this.nextNode = this.table.buckets[this.bucketIndex - 1];
        }
        return false;
    }

    public final Object next() {
        IntrusiveNode[] fieldTemp$0 = null;
        int fieldTemp$1 = 0;
        IntrusiveNode var1;
        int var2;
        var2 = BrickABrac.field_J ? 1 : 0;
        if (this.nextNode != this.table.buckets[-1 + this.bucketIndex]) {
          var1 = this.nextNode;
          this.nextNode = var1.next;
          this.lastReturned = var1;
          return var1;
        }
        do {
          if (this.bucketIndex >= this.table.bucketCount) {
            return null;
          }
          fieldTemp$0 = this.table.buckets;
          fieldTemp$1 = this.bucketIndex;
          this.bucketIndex = this.bucketIndex + 1;
          var1 = fieldTemp$0[fieldTemp$1].next;
        } while (this.table.buckets[this.bucketIndex - 1] == var1);
        this.nextNode = var1.next;
        this.lastReturned = var1;
        return var1;
    }

    final static boolean a(boolean param0) {
        boolean stackIn_6_0 = false;
        if (param0) {
          field_g = (tq) null;
        }
        stackIn_6_0 = (null != WhirlpoolHasher.gameTransport) && (MenuButton.field_i == rf.field_b);
        return stackIn_6_0;
    }

    final static int getChatMessageColor(int obfuscationGuard, ChatMessage message) {
        int var2_int = 0;
        int var3 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var2_intLifetime1;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          var2_int = cn.field_d;
          if (message.channel != 2) {
            if (message.channel != 4) {
              if (~message.senderId != ~Widget.field_p) {
                var2_intLifetime1 = TextFieldRenderer.field_C[message.channel];
              } else {
                var2_intLifetime1 = BackgroundScene.field_i[message.channel];
              }
            } else {
              var2_intLifetime1 = TextFieldRenderer.field_C[message.channel];
            }
          } else {
            if (!message.systemMessage) {
              if (message.messageKeyHigh16 == 0 &&
                message.messageKeyLow24 == 0) {
                var2_intLifetime1 = BackgroundScene.field_i[message.channel];
              } else {
                var2_intLifetime1 = TextFieldRenderer.field_C[message.channel];
              }
            } else {
              var2_intLifetime1 = cn.field_d;
            }
          }
          if (obfuscationGuard == -31126) {
            stackIn_18_0 = var2_intLifetime1;
            return stackIn_18_0;
          }
          stackIn_16_0 = -27;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("ik.F(").append(obfuscationGuard).append(',');
          if (message == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    public final void remove() {
        if (this.lastReturned == null) {
          throw new IllegalStateException();
        }
        this.lastReturned.unlink((byte) 111);
        this.lastReturned = null;
    }

    final static boolean isReflectionCheckReady(int obfuscationGuard) {
        ReflectionCheck request = null;
        RuntimeException failure = null;
        int operationIndex = 0;
        int guardArithmetic = 0;
        int unusedGameFlag = 0;
        ReflectionCheck queuedRequest = null;
        RuntimeException caughtFailure = null;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          queuedRequest = (ReflectionCheck) (ResourceArchive.pendingReflectionChecks.first(-78));
          request = queuedRequest;
          if (request == null) {
            return false;
          }
          operationIndex = 0;
          guardArithmetic = -90 / ((obfuscationGuard + 28) / 50);
          while (operationIndex < request.operationCount) {
            if (queuedRequest.fieldTasks[operationIndex] != null &&
              0 == queuedRequest.fieldTasks[operationIndex].status) {
              return false;
            }
            if (queuedRequest.methodTasks[operationIndex] != null &&
              queuedRequest.methodTasks[operationIndex].status == 0) {
              return false;
            }
            operationIndex++;
          }
          return true;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failure), "ik.C(" + obfuscationGuard + ')');
        }
    }

    public static void c(int param0) {
        if (param0 > -8) {
          return;
        }
        field_g = null;
        field_f = null;
        field_i = null;
        field_b = null;
        field_c = null;
        field_a = null;
    }

    final static boolean isNameSeparator(byte obfuscationGuard, char character) {
        boolean stackIn_9_0 = false;
        if (obfuscationGuard != -9) {
          IntrusiveHashIterator.isNameSeparator((byte) -124, 'V');
        }
        stackIn_9_0 = (character == 160) || (character == 32) || (character == 95) || (character == 45);
        return stackIn_9_0;
    }

    IntrusiveHashIterator(IterableIntrusiveHashTable table) {
        this.lastReturned = null;
        try {
          this.table = table;
          this.resetIterator(-101);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ik.<init>(" + (table != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_j = false;
    }
}
