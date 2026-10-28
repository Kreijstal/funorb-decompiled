/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SecondaryNodeHashTable {
    private DualLinkNode[] buckets;
    static Sprite[] field_a;
    private int bucketCount;
    private DualLinkNode lookupCursor;
    static String[] field_i;
    static String field_e;
    static String field_c;
    private long lookupKey;
    static PcmSample field_g;

    final void put(long key, DualLinkNode node, int guard) {
        String stackIn_8_2 = null;
        try {
          if (null != node.secondaryPrevious) {
            node.unlinkSecondary(-39);
          }
          DualLinkNode var5 = this.buckets[(int)(key & (long)(this.bucketCount - 1))];
          node.secondaryNext = var5;
          node.secondaryPrevious = var5.secondaryPrevious;
          node.secondaryPrevious.secondaryNext = node;
          node.secondaryNext.secondaryPrevious = node;
          node.secondaryKey = key;
          if (guard <= 24) {
            SecondaryNodeHashTable.releaseStatics((byte) -113);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5_ref = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var5_ref;
          StringBuilder stackIn_7_1 = new StringBuilder().append("nn.D(").append(key).append(',');
          if (node == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(guard).append(')').toString());
        }
    }

    public static void releaseStatics(byte guard) {
        field_c = null;
        if (guard <= 48) {
          field_g = (PcmSample) null;
          field_g = null;
          field_a = null;
          field_i = null;
          field_e = null;
          return;
        }
        field_g = null;
        field_a = null;
        field_i = null;
        field_e = null;
    }

    final DualLinkNode get(int guard, long key) {
        int var6 = EscapeVector.obfuscationControl;
        if (guard <= -4) {
          this.lookupKey = key;
          DualLinkNode var4 = this.buckets[(int)(key & (long)(this.bucketCount - 1))];
          this.lookupCursor = var4.secondaryNext;
          while (true) {
            if (var4 == this.lookupCursor) {
              this.lookupCursor = null;
              return null;
            }
            if (~this.lookupCursor.secondaryKey != ~key) {
              this.lookupCursor = this.lookupCursor.secondaryNext;
              continue;
            }
            break;
          }
          DualLinkNode var5 = this.lookupCursor;
          this.lookupCursor = this.lookupCursor.secondaryNext;
          return var5;
        }
        this.lookupKey = 26L;
        this.lookupKey = key;
        DualLinkNode var4Lifetime1 = this.buckets[(int)(key & (long)(this.bucketCount - 1))];
        this.lookupCursor = var4Lifetime1.secondaryNext;
        while (true) {
          if (var4Lifetime1 == this.lookupCursor) {
            this.lookupCursor = null;
            return null;
          }
          if (~this.lookupCursor.secondaryKey != ~key) {
            this.lookupCursor = this.lookupCursor.secondaryNext;
            continue;
          }
          break;
        }
        DualLinkNode var5Lifetime1 = this.lookupCursor;
        this.lookupCursor = this.lookupCursor.secondaryNext;
        return var5Lifetime1;
    }

    final static void presentRaster(java.awt.Canvas canvas, int y, int guard, int x) {
        String stackIn_7_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            java.awt.Graphics var4 = canvas.getGraphics();
            AlphaContainer.field_D.drawImage(y, guard ^ guard, x, var4);
            var4.dispose();
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            Exception var4_ref = (Exception) (Object) decompiledCaughtException;
            canvas.repaint();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          RuntimeException var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          RuntimeException stackIn_6_0 = var4_ref2;
          StringBuilder stackIn_6_1 = new StringBuilder().append("nn.B(");
          if (canvas == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(y).append(',').append(guard).append(',').append(x).append(')').toString());
        }
    }

    final DualLinkNode nextMatch(byte guard) {
        int var4 = EscapeVector.obfuscationControl;
        if (null == this.lookupCursor) {
          return null;
        }
        DualLinkNode var2 = this.buckets[(int)((long)(this.bucketCount - 1) & this.lookupKey)];
        while (this.lookupCursor != var2) {
          if (this.lookupKey == this.lookupCursor.secondaryKey) {
            DualLinkNode var3 = this.lookupCursor;
            this.lookupCursor = this.lookupCursor.secondaryNext;
            return var3;
          }
          this.lookupCursor = this.lookupCursor.secondaryNext;
        }
        if (guard != -36) {
          this.nextMatch((byte) 87);
          this.lookupCursor = null;
          return null;
        }
        this.lookupCursor = null;
        return null;
    }

    SecondaryNodeHashTable(int param0) {
        this.buckets = new DualLinkNode[param0];
        this.bucketCount = param0;
        for (int var2 = 0; var2 < param0; var2++) {
          DualLinkNode dupTemp$0 = new DualLinkNode();
          DualLinkNode var3 = dupTemp$0;
          this.buckets[var2] = dupTemp$0;
          var3.secondaryNext = var3;
          var3.secondaryPrevious = var3;
        }
    }

    static {
        field_c = "Power-up is on hill - please land closer";
        field_e = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
    }
}
