/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bs implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static int field_c;
    static RenderSprite[] upgradeSprites;
    static jb field_a;

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        String stackIn_24_2 = null;
        try {
          if (ua.field_d != null) {
            he.field_n = 0;
            int var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              var2_int < so.field_d.length) {
              var2_int = so.field_d[var2_int];
              if (0 != (var2_int & 128)) {
                var2_int = -1;
              }
            } else {
              var2_int = -1;
            }
            if (fb.field_a >= 0 &&
              var2_int >= 0) {
              RendererBitmapFont.field_b[fb.field_a] = var2_int;
              fb.field_a = 127 & fb.field_a + 1;
              if (fb.field_a == MenuInputState.field_h) {
                fb.field_a = -1;
              }
            }
            if (var2_int >= 0) {
              int var3 = 127 & 1 + SpriteState.field_w;
              if (var3 != ch.field_a) {
                ArchiveIndex.field_e[SpriteState.field_w] = var2_int;
                qb.field_o[SpriteState.field_w] = (char)0;
                SpriteState.field_w = var3;
              }
            }
            int var3Lifetime1 = param0.getModifiers();
            if ((10 & var3Lifetime1) == 0 &&
              var2_int != 85 &&
              var2_int != 10) {
              return;
            }
            param0.consume();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_23_0 = var2;
          StringBuilder stackIn_23_1 = new StringBuilder().append("bs.keyPressed(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final static Sprite[] a(int param0, boolean param1) {
        Sprite[] var3 = new Sprite[9];
        Sprite[] var2 = var3;
        var3[4] = tn.a(param0, 64, true);
        if (!param1) {
          return var2;
        }
        upgradeSprites = (RenderSprite[]) null;
        return var2;
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        String stackIn_16_2 = null;
        try {
          if (null != ua.field_d) {
            he.field_n = 0;
            int var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              var2_int < so.field_d.length) {
              var2_int = so.field_d[var2_int] & -129;
            } else {
              var2_int = -1;
            }
            if (fb.field_a >= 0 &&
              var2_int >= 0) {
              RendererBitmapFont.field_b[fb.field_a] = ~var2_int;
              fb.field_a = fb.field_a + 1 & 127;
              if (fb.field_a == MenuInputState.field_h) {
                fb.field_a = -1;
              }
            }
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_15_0 = runtimeException;
          StringBuilder stackIn_15_1 = new StringBuilder().append("bs.keyReleased(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        upgradeSprites = null;
        field_a = null;
        if (param0 != 127) {
          field_a = (jb) null;
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        try {
          if (null != ua.field_d) {
            fb.field_a = -1;
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "bs.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, Random param1, int param2) {
        int var4 = 0;
        String stackIn_13_2 = null;
        try {
          if (~param2 >= param0) {
            throw new IllegalArgumentException();
          }
          if (mg.a(param2, (byte) -20)) {
            int stackIn_4_0 = (int)((4294967295L & (long)param1.nextInt()) * (long)param2 >> 32);
            return stackIn_4_0;
          }
          int var3_int = -2147483648 - (int)(4294967296L % (long)param2);
          do {
            var4 = param1.nextInt();
          } while (var4 >= var3_int);
          int stackIn_9_0 = qg.a((byte) 119, param2, var4);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var3;
          StringBuilder stackIn_12_1 = new StringBuilder().append("bs.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(')').toString());
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        try {
          if (ua.field_d != null) {
            int var2_int = param0.getKeyChar();
            if (0 != var2_int &&
              var2_int != 65535 &&
              mr.a((char) var2_int, 2004352972)) {
              int var3 = 1 + SpriteState.field_w & 127;
              if (var3 != ch.field_a) {
                ArchiveIndex.field_e[SpriteState.field_w] = -1;
                qb.field_o[SpriteState.field_w] = (char)var2_int;
                SpriteState.field_w = var3;
              }
            }
          }
          param0.consume();
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "bs.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = new jb();
    }
}
