/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class DirectByteArrayStorage extends ByteArrayStorage {
    private java.nio.ByteBuffer buffer;
    static int field_c;
    static ToolkitSprite field_e;
    static ToolkitSprite field_d;

    final static int indexBitCount(int value, int guard) {
        int var2;
        File var3;
        int var2Lifetime1;
        if (value == 0) {
          return 0;
        }
        if (value > 0) {
          var2 = 1;
          if (65535 < value) {
            var2 += 16;
            value = value >> 16;
          }
          if (value > 255) {
            var2 += 8;
            value = value >> 8;
          }
          if (value > 15) {
            var2 += 4;
            value = value >> 4;
          }
          if (value > 3) {
            var2 += 2;
            value = value >> 2;
          }
          if (value > 1) {
            var2++;
            value = value >> 1;
          }
          return var2;
        }
        var2Lifetime1 = 2;
        if (value < -65536) {
          value = value >> 16;
          var2Lifetime1 += 16;
        }
        if (guard == 1) {
          if (value < -256) {
            value = value >> 8;
            var2Lifetime1 += 8;
          }
          if (-16 > value) {
            value = value >> 4;
            var2Lifetime1 += 4;
          }
          if (-4 > value) {
            value = value >> 2;
            var2Lifetime1 += 2;
          }
          if (value < -2) {
            var2Lifetime1++;
            value = value >> 1;
          }
          return var2Lifetime1;
        }
        var3 = (File) null;
        DirectByteArrayStorage.readEntireFile((File) null, (byte) 38);
        if (value < -256) {
          value = value >> 8;
          var2Lifetime1 += 8;
        }
        if (-16 > value) {
          value = value >> 4;
          var2Lifetime1 += 4;
        }
        if (-4 > value) {
          value = value >> 2;
          var2Lifetime1 += 2;
        }
        if (value < -2) {
          var2Lifetime1++;
          value = value >> 1;
        }
        return var2Lifetime1;
    }

    final void setBytes(byte[] bytes, int guard) {
        try {
          int var3_int = -124 % ((guard + 47) / 62);
          this.buffer = java.nio.ByteBuffer.allocateDirect(bytes.length);
          this.buffer.position(0);
          this.buffer.put(bytes);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "si.G(" + (bytes != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    final static byte[] readEntireFile(File param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -1 % ((39 - param1) / 49);
          stackIn_1_0 = FullscreenMembershipDialog.readFileBytes((int)param0.length(), param0, (byte) 103);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("si.N(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    DirectByteArrayStorage() {
    }

    final byte[] copyRange(int offset, int length, int guard) {
        byte[] var6 = null;
        byte[] var4 = null;
        byte[] var6Lifetime1;
        byte[] var4Lifetime1;
        if (guard == 15747) {
          var6 = new byte[length];
          var4 = var6;
          this.buffer.position(offset);
          this.buffer.get(var6, 0, length);
          return var6;
        }
        java.applet.Applet var5 = (java.applet.Applet) null;
        DirectByteArrayStorage.checkAppletUsername((java.applet.Applet) null, (byte) 104);
        var6Lifetime1 = new byte[length];
        var4Lifetime1 = var6Lifetime1;
        this.buffer.position(offset);
        this.buffer.get(var6Lifetime1, 0, length);
        return var6Lifetime1;
    }

    public static void releaseStatics(int param0) {
        int var1 = -2 / ((param0 - 65) / 43);
        field_d = null;
        field_e = null;
    }

    final static void defineMenuScreen(int top, int rowSpacing, int left, int guard, int[] actions, int screenId, int right) {
        IntroLogoRenderer.menuActions[screenId] = actions;
        if (guard != 2) {
          return;
        }
        try {
          GraphicsHeap.menuLeft[screenId] = left;
          RendererPreference.menuRight[screenId] = right;
          DualLinkNode.menuTop[screenId] = top;
          MidiNoteMixer.menuRowSpacing[screenId] = rowSpacing;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "si.K(" + top + ',' + rowSpacing + ',' + left + ',' + guard + ',' + (actions != null ? "{...}" : "null") + ',' + screenId + ',' + right + ')');
        }
    }

    final static void checkAppletUsername(java.applet.Applet applet, byte guard) {
        RuntimeException runtimeException = null;
        String var2 = null;
        CharSequence var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = applet.getParameter("username");
          if (var2 != null) {
            var3 = (CharSequence) ((Object) var2);
            if (ScrollControl.encodeBase37Name(var3, 7441) != 0L) {
              if (guard > -42) {
                field_c = -99;
              }
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_9_0 = runtimeException;
          stackIn_9_1 = new StringBuilder().append("si.M(");
          if (applet == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(guard).append(')').toString());
        }
    }

    final byte[] copyBytes(boolean param0) {
        byte[] var3 = new byte[this.buffer.capacity()];
        byte[] var2 = var3;
        this.buffer.position(0);
        this.buffer.get(var3);
        if (!param0) {
          return var3;
        }
        this.copyBytes(false);
        return var3;
    }

    static {
        field_c = 0;
    }
}
