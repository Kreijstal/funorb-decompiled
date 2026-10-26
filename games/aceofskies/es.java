/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class es {
    static String[] field_a;
    private DualLinkNode field_d;
    static int rendererCurrentShadowColor;
    private int field_f;
    static RenderSprite[] smokeSprites;
    static String field_g;
    private DualLinkNode[] field_e;
    private long field_h;
    static SpriteData lockedSpriteData;

    final DualLinkNode a(boolean param0) {
        DualLinkNode var2;
        DualLinkNode var3;
        if (null == this.field_d) {
          return null;
        }
        if (param0) {
          return (DualLinkNode) null;
        }
        var2 = this.field_e[(int)((long)(this.field_f - 1) & this.field_h)];
        while (true) {
          if (var2 == this.field_d) {
            this.field_d = null;
            return null;
          }
          if (~this.field_d.secondaryKey != ~this.field_h) {
            this.field_d = this.field_d.nextSecondaryNode;
            continue;
          }
          break;
        }
        var3 = this.field_d;
        this.field_d = this.field_d.nextSecondaryNode;
        return var3;
    }

    final DualLinkNode a(int param0, long param1) {
        DualLinkNode var4;
        DualLinkNode var5;
        DualLinkNode var5Lifetime1;
        this.field_h = param1;
        var4 = this.field_e[(int)((long)(this.field_f - 1) & param1)];
        if (param0 >= 87) {
          this.field_d = var4.nextSecondaryNode;
          while (true) {
            if (var4 == this.field_d) {
              this.field_d = null;
              return null;
            }
            if (~this.field_d.secondaryKey != ~param1) {
              this.field_d = this.field_d.nextSecondaryNode;
              continue;
            }
            break;
          }
          var5 = this.field_d;
          this.field_d = this.field_d.nextSecondaryNode;
          return var5;
        }
        smokeSprites = (RenderSprite[]) null;
        this.field_d = var4.nextSecondaryNode;
        while (true) {
          if (var4 == this.field_d) {
            this.field_d = null;
            return null;
          }
          if (~this.field_d.secondaryKey != ~param1) {
            this.field_d = this.field_d.nextSecondaryNode;
            continue;
          }
          break;
        }
        var5Lifetime1 = this.field_d;
        this.field_d = this.field_d.nextSecondaryNode;
        return var5Lifetime1;
    }

    final void a(DualLinkNode param0, long param1, byte param2) {
        DualLinkNode var5 = null;
        try {
          if (null != param0.previousSecondaryNode) {
            param0.unlinkSecondaryNode(-122);
          }
          var5 = this.field_e[(int)(param1 & (long)(this.field_f - 1))];
          param0.previousSecondaryNode = var5.previousSecondaryNode;
          param0.nextSecondaryNode = var5;
          param0.previousSecondaryNode.nextSecondaryNode = param0;
          if (param2 != 56) {
            this.a(false);
          }
          param0.secondaryKey = param1;
          param0.nextSecondaryNode.previousSecondaryNode = param0;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "es.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean a(Class param0, int param1, String param2) {
        try {
          RuntimeException stackIn_22_0 = null;
          StringBuilder stackIn_22_1 = null;
          String stackIn_23_2 = null;
          StringBuilder stackIn_25_1 = null;
          String stackIn_26_2 = null;
          Throwable decompiledCaughtException = null;
          Class var3 = null;
          RuntimeException var3_ref = null;
          Object var4 = null;
          Class var5 = null;
          NoSuchMethodException var5_ref = null;
          Throwable var5_ref2 = null;
          Class var6 = null;
          java.lang.reflect.Method var7 = null;
          java.lang.reflect.Method var8 = null;
          File var9 = null;
          try {
            var3 = (Class) (sk.field_e.get(param2));
            if (var3 != null) {
              if (var3.getClassLoader() == param0.getClassLoader()) {
                return true;
              }
              return false;
            }
            var4 = null;
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
              var9 = new File(((File) (var4)).getCanonicalPath());
              var4 = var9;
              var5 = Class.forName("java.lang.Runtime");
              var6 = Class.forName("java.lang.reflect.AccessibleObject");
              var7 = var6.getDeclaredMethod("setAccessible", new Class[]{Boolean.TYPE});
              var8 = var5.getDeclaredMethod("load0", new Class[]{Class.forName("java.lang.Class"), Class.forName("java.lang.String")});
              var7.invoke((Object) (var8), new Object[]{Boolean.TRUE});
              var8.invoke((Object) (Runtime.getRuntime()), new Object[]{param0, var9.getPath()});
              var7.invoke((Object) (var8), new Object[]{Boolean.FALSE});
              sk.field_e.put(param2, param0);
              return true;
            } catch (java.lang.NoSuchMethodException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5_ref = (NoSuchMethodException) (Object) decompiledCaughtException;
              System.load(((File) (var4)).getPath());
              sk.field_e.put(param2, ln.class);
              return true;
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var5_ref2 = decompiledCaughtException;
              return false;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_22_0 = var3_ref;
            stackIn_22_1 = new StringBuilder().append("es.E(");
            if (param0 == null) {
              stackIn_23_2 = "null";
            } else {
              stackIn_23_2 = "{...}";
            }
            stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',');
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

    es(int param0) {
        DualLinkNode dupTemp$1 = null;
        int var2 = 0;
        DualLinkNode var3 = null;
        int var4 = 0;
        var4 = AceOfSkies.obfuscationControl ? 1 : 0;
        this.field_f = param0;
        this.field_e = new DualLinkNode[param0];
        var2 = 0;
        while (var2 < param0) {
          dupTemp$1 = new DualLinkNode();
          var3 = dupTemp$1;
          this.field_e[var2] = dupTemp$1;
          var3.previousSecondaryNode = var3;
          var3.nextSecondaryNode = var3;
          var2++;
          if (var4 != 0) {
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
