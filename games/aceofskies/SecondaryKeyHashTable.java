/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class SecondaryKeyHashTable {
    static String[] field_a;
    private DualLinkNode lookupCursor;
    static int rendererCurrentShadowColor;
    private int bucketCount;
    static RenderSprite[] smokeSprites;
    static String field_g;
    private DualLinkNode[] bucketSentinels;
    private long lookupKey;
    static SpriteData lockedSpriteData;

    final DualLinkNode nextWithLookupKey(boolean obfuscationGuard) {
        if (null == this.lookupCursor) {
          return null;
        }
        if (obfuscationGuard) {
          return (DualLinkNode) null;
        }
        DualLinkNode var2 = this.bucketSentinels[(int)((long)(this.bucketCount - 1) & this.lookupKey)];
        while (true) {
          if (var2 == this.lookupCursor) {
            this.lookupCursor = null;
            return null;
          }
          if (~this.lookupCursor.secondaryKey != ~this.lookupKey) {
            this.lookupCursor = this.lookupCursor.nextSecondaryNode;
            continue;
          }
          break;
        }
        DualLinkNode var3 = this.lookupCursor;
        this.lookupCursor = this.lookupCursor.nextSecondaryNode;
        return var3;
    }

    final DualLinkNode firstWithKey(int obfuscationGuard, long key) {
        this.lookupKey = key;
        DualLinkNode var4 = this.bucketSentinels[(int)((long)(this.bucketCount - 1) & key)];
        if (obfuscationGuard >= 87) {
          this.lookupCursor = var4.nextSecondaryNode;
          while (true) {
            if (var4 == this.lookupCursor) {
              this.lookupCursor = null;
              return null;
            }
            if (~this.lookupCursor.secondaryKey != ~key) {
              this.lookupCursor = this.lookupCursor.nextSecondaryNode;
              continue;
            }
            break;
          }
          DualLinkNode var5 = this.lookupCursor;
          this.lookupCursor = this.lookupCursor.nextSecondaryNode;
          return var5;
        }
        smokeSprites = (RenderSprite[]) null;
        this.lookupCursor = var4.nextSecondaryNode;
        while (true) {
          if (var4 == this.lookupCursor) {
            this.lookupCursor = null;
            return null;
          }
          if (~this.lookupCursor.secondaryKey != ~key) {
            this.lookupCursor = this.lookupCursor.nextSecondaryNode;
            continue;
          }
          break;
        }
        DualLinkNode var5Lifetime1 = this.lookupCursor;
        this.lookupCursor = this.lookupCursor.nextSecondaryNode;
        return var5Lifetime1;
    }

    final void put(DualLinkNode node, long key, byte obfuscationGuard) {
        try {
          if (null != node.previousSecondaryNode) {
            node.unlinkSecondaryNode(-122);
          }
          DualLinkNode var5 = this.bucketSentinels[(int)(key & (long)(this.bucketCount - 1))];
          node.previousSecondaryNode = var5.previousSecondaryNode;
          node.nextSecondaryNode = var5;
          node.previousSecondaryNode.nextSecondaryNode = node;
          if (obfuscationGuard != 56) {
            this.nextWithLookupKey(false);
          }
          node.secondaryKey = key;
          node.nextSecondaryNode.previousSecondaryNode = node;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "es.C(" + (node != null ? "{...}" : "null") + ',' + key + ',' + obfuscationGuard + ')');
        }
    }

    final static boolean a(Class param0, int param1, String param2) {
        try {
          String stackIn_23_2 = null;
          String stackIn_26_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            Class var3 = (Class) (RenderEffect.field_e.get(param2));
            if (var3 != null) {
              if (var3.getClassLoader() == param0.getClassLoader()) {
                return true;
              }
              return false;
            }
            Object var4 = null;
            if (param1 > -38) {
              return true;
            }
            if (var4 == null) {
              var4 = (File) (vg.field_j.get(param2));
            }
            if (var4 == null) {
              return false;
            }
            try {
              File var9 = new File(((File) (var4)).getCanonicalPath());
              var4 = var9;
              Class var5 = Class.forName("java.lang.Runtime");
              Class var6 = Class.forName("java.lang.reflect.AccessibleObject");
              java.lang.reflect.Method var7 = var6.getDeclaredMethod("setAccessible", new Class[]{Boolean.TYPE});
              java.lang.reflect.Method var8 = var5.getDeclaredMethod("load0", new Class[]{Class.forName("java.lang.Class"), Class.forName("java.lang.String")});
              var7.invoke((Object) (var8), new Object[]{Boolean.TRUE});
              var8.invoke((Object) (Runtime.getRuntime()), new Object[]{param0, var9.getPath()});
              var7.invoke((Object) (var8), new Object[]{Boolean.FALSE});
              RenderEffect.field_e.put(param2, param0);
              return true;
            } catch (java.lang.NoSuchMethodException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              NoSuchMethodException var5_ref = (NoSuchMethodException) (Object) decompiledCaughtException;
              System.load(((File) (var4)).getPath());
              RenderEffect.field_e.put(param2, ln.class);
              return true;
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              Throwable var5_ref2 = decompiledCaughtException;
              return false;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            RuntimeException var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_22_0 = var3_ref;
            StringBuilder stackIn_22_1 = new StringBuilder().append("es.E(");
            if (param0 == null) {
              stackIn_23_2 = "null";
            } else {
              stackIn_23_2 = "{...}";
            }
            StringBuilder stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_26_2 = "null";
            } else {
              stackIn_26_2 = "{...}";
            }
            throw pn.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    SecondaryKeyHashTable(int bucketCount) {
        boolean var4 = (AceOfSkies.obfuscationControl);
        this.bucketCount = bucketCount;
        this.bucketSentinels = new DualLinkNode[bucketCount];
        int var2 = 0;
        while (var2 < bucketCount) {
          DualLinkNode dupTemp$1 = new DualLinkNode();
          DualLinkNode var3 = dupTemp$1;
          this.bucketSentinels[var2] = dupTemp$1;
          var3.previousSecondaryNode = var3;
          var3.nextSecondaryNode = var3;
          var2++;
          if (var4) {
            return;
          }
        }
    }

    public static void a(int param0) {
        if (param0 == 1020) {
          smokeSprites = null;
          field_g = null;
          lockedSpriteData = null;
          field_a = null;
          return;
        }
        field_g = (String) null;
        smokeSprites = null;
        field_g = null;
        lockedSpriteData = null;
        field_a = null;
    }

    static {
        rendererCurrentShadowColor = 0;
        field_g = "Player Name: ";
    }
}
