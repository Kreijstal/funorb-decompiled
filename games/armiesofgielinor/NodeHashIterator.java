/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class NodeHashIterator implements Iterator {
    private IntrusiveNode cursor;
    static RgbSprite field_e;
    private int nextBucket;
    private IntrusiveNode lastReturned;
    static String field_a;
    static String field_f;
    static QuickChatCommandDefinition field_i;
    private IterableNodeHashTable table;
    static String field_h;

    public final void remove() {
        if (this.lastReturned == null) {
          throw new IllegalStateException();
        }
        this.lastReturned.unlink(42);
        this.lastReturned = null;
    }

    final static void a(int param0, java.awt.Color param1, String param2, boolean param3, int param4) {
        Exception var5 = null;
        RuntimeException var5_ref = null;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          try {
            var9 = IndexedSpriteBase.field_b.getGraphics();
            if (null == BattleCharacter.field_g) {
              BattleCharacter.field_g = new java.awt.Font("Helvetica", 1, 13);
            }
            if (param3) {
              var9.setColor(java.awt.Color.black);
              var9.fillRect(0, 0, bn.viewportWidth, dt.viewportHeight);
            }
            if (param1 == null) {
              param1 = new java.awt.Color(140, 17, 17);
            }
            try {
              if (gp.field_e == null) {
                gp.field_e = IndexedSpriteBase.field_b.createImage(304, 34);
              }
              var10 = gp.field_e.getGraphics();
              var10.setColor(param1);
              if (param0 != -5790) {
                return;
              }
              var10.drawRect(0, 0, 303, 33);
              var10.fillRect(2, 2, 3 * param4, 30);
              var10.setColor(java.awt.Color.black);
              var10.drawRect(1, 1, 301, 31);
              var10.fillRect(param4 * 3 + 2, 2, 300 - param4 * 3, 30);
              var10.setFont(BattleCharacter.field_g);
              var10.setColor(java.awt.Color.white);
              var10.drawString(param2, (304 - 6 * param2.length()) / 2, 22);
              var9.drawImage(gp.field_e, -152 + bn.viewportWidth / 2, dt.viewportHeight / 2 - 18, (java.awt.image.ImageObserver) null);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Exception) (Object) decompiledCaughtException;
              var7 = bn.viewportWidth / 2 - 152;
              var8 = -18 + dt.viewportHeight / 2;
              var9.setColor(param1);
              var9.drawRect(var7, var8, 303, 33);
              var9.fillRect(2 + var7, var8 + 2, param4 * 3, 30);
              var9.setColor(java.awt.Color.black);
              var9.drawRect(var7 + 1, 1 + var8, 301, 31);
              var9.fillRect(param4 * 3 + 2 + var7, var8 + 2, -(param4 * 3) + 300, 30);
              var9.setFont(BattleCharacter.field_g);
              var9.setColor(java.awt.Color.white);
              var9.drawString(param2, var7 + (304 - param2.length() * 6) / 2, 22 + var8);
            }
            if (DefeatPlayerConsoleCommand.field_G == null) {
              return;
            }
            var9.setFont(BattleCharacter.field_g);
            var9.setColor(java.awt.Color.white);
            var9.drawString(DefeatPlayerConsoleCommand.field_G, bn.viewportWidth / 2 - DefeatPlayerConsoleCommand.field_G.length() * 6 / 2, dt.viewportHeight / 2 - 26);
            return;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5 = (Exception) (Object) decompiledCaughtException;
            IndexedSpriteBase.field_b.repaint();
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_21_0 = var5_ref;
          stackIn_21_1 = new StringBuilder().append("tl.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void b(byte param0) {
        SoftwareRaster.b();
        if (param0 != -90) {
          field_i = (QuickChatCommandDefinition) null;
          VerticalScrollbar.field_Rb.draw(2);
          return;
        }
        VerticalScrollbar.field_Rb.draw(2);
    }

    public final Object next() {
        int bucketIndex = 0;
        int obfuscationControl;
        IntrusiveNode firstInBucket;
        IntrusiveNode nextNode;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.table.buckets[this.nextBucket - 1] != this.cursor) {
          nextNode = this.cursor;
          this.cursor = nextNode.next;
          this.lastReturned = nextNode;
          return nextNode;
        }
        do {
          if (this.table.bucketCount <= this.nextBucket) {
            return null;
          }
          bucketIndex = this.nextBucket;
          this.nextBucket = this.nextBucket + 1;
          firstInBucket = this.table.buckets[bucketIndex].next;
        } while (firstInBucket == this.table.buckets[-1 + this.nextBucket]);
        this.lastReturned = firstInBucket;
        this.cursor = firstInBucket.next;
        return firstInBucket;
    }

    public final boolean hasNext() {
        int bucketIndex = 0;
        int obfuscationControl;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.table.buckets[-1 + this.nextBucket] != this.cursor) {
          return true;
        }
        while (this.nextBucket < this.table.bucketCount) {
          bucketIndex = this.nextBucket;
          this.nextBucket = this.nextBucket + 1;
          if (this.table.buckets[bucketIndex].next != this.table.buckets[this.nextBucket - 1]) {
            this.cursor = this.table.buckets[this.nextBucket - 1].next;
            return true;
          }
          this.cursor = this.table.buckets[this.nextBucket - 1];
        }
        return false;
    }

    final static void a(byte param0, ResourceArchive param1, ResourceArchive param2) {
        try {
          jj.animationFramesArchive = param2;
          PortalLossCondition.animationSkeletonsArchive = param1;
          if (param0 > -117) {
            field_a = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "tl.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_i = null;
        int var1 = -28 % ((param0 + 69) / 51);
        field_f = null;
        field_e = null;
        field_h = null;
    }

    private final void reset(byte obfuscationGuard) {
        this.lastReturned = null;
        this.cursor = this.table.buckets[0].next;
        if (obfuscationGuard < -85) {
          this.nextBucket = 1;
          return;
        }
        this.lastReturned = (IntrusiveNode) null;
        this.nextBucket = 1;
    }

    NodeHashIterator(IterableNodeHashTable table) {
        this.lastReturned = null;
        try {
          this.table = table;
          this.reset((byte) -101);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "tl.<init>(" + (table != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_f = "Rune";
        field_i = new QuickChatCommandDefinition(6, 0, 4, 2);
        field_h = "Log in / Create account";
    }
}
