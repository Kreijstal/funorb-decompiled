/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DropdownSelectorPainter implements WidgetPainter {
    static java.awt.Color field_c;
    static String field_a;
    private DropdownList field_b;

    final static SocketConnector createProxyConnector(String param0, byte param1, int param2) {
        ProxySocketConnector var3 = null;
        RuntimeException var3_ref = null;
        ProxySocketConnector stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 68) {
            field_c = (java.awt.Color) null;
          }
          var3 = new ProxySocketConnector();
          ((SocketConnector) ((Object) var3)).field_e = param0;
          ((SocketConnector) ((Object) var3)).field_b = param2;
          stackIn_3_0 = var3;
          return (SocketConnector) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("ud.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public final void drawWidget(int param0, boolean param1, int param2, UiWidget param3, int param4) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        Object var8 = null;
        String var9 = null;
        int var10 = 0;
        try {
          var6_int = param4 + param3.field_k;
          var7 = param2 + param3.field_j;
          GooPuddleCell.drawInsetFieldBorder(var6_int, param3.field_n, var7, 48, param3.field_i);
          if (param0 != 16777215) {
            field_c = (java.awt.Color) null;
          }
          if (param3.isFocused(-17741)) {
            TileMap.drawDottedRectangle(param3.field_i - 4, -4 + param3.field_n, var6_int + 2, param0 ^ 16777172, var7 + 2);
          }
          Rasterizer.setClip(var6_int, var7, -2 + param3.field_i + var6_int, var7 + param3.field_n);
          var8 = this.field_b.field_T.getSelectedItem(0);
          if (var8 != null) {
            var9 = var8.toString();
            this.field_b.field_L.drawString(var9, 2 + var6_int, (this.field_b.field_L.field_I + param3.field_n >> 1) + (var7 - 1), 10000536, -1);
            if (this.field_b.isFocused(param0 ^ -16759476) &&
              var9.startsWith(this.field_b.field_U)) {
              var10 = this.field_b.field_L.textWidth(this.field_b.field_U);
              Rasterizer.fillRectangleBlended(2 + var6_int, 2 + var7, var10, -4 + param3.field_n, 2188450, 100);
            }
          }
          Rasterizer.resetClip();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("ud.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param4).append(')').toString());
        }
    }

    final static IndexedSprite createRepalettedSprite(IndexedSprite param0, int[] param1, int param2) {
        IndexedSprite var3 = null;
        RuntimeException var3_ref = null;
        IndexedSprite stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new IndexedSprite(0, 0, 0);
          if (param2 != -27837) {
            DropdownSelectorPainter.releaseStatics((byte) -120);
          }
          var3.field_a = param0.field_a;
          var3.field_h = param0.field_h;
          var3.field_j = param0.field_j;
          var3.field_e = param0.field_e;
          var3.field_k = param0.field_k;
          var3.field_d = param0.field_d;
          var3.field_g = param0.field_g;
          var3.field_l = param1;
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("ud.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_a = null;
        if (param0 != -105) {
          field_c = (java.awt.Color) null;
        }
        field_c = null;
    }

    final static FullscreenExitHelpers[] enumerateFullscreenModes(int param0, PlatformTaskDispatcher param1) {
        int var5 = 0;
        FullscreenExitHelpers[] stackIn_4_0 = null;
        FullscreenExitHelpers[] stackIn_11_0 = null;
        FullscreenExitHelpers[] stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        FullscreenExitHelpers[] var4 = null;
        FullscreenExitHelpers var6 = null;
        int var7 = 0;
        AsyncRequest var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        var7 = ZombieDawn.field_J;
        try {
          if (!param1.supportsFullscreen(10)) {
            stackIn_4_0 = new FullscreenExitHelpers[]{};
            return stackIn_4_0;
          }
          var8 = param1.requestDisplayModes(param0 - 1);
          while (var8.status == 0) {
            AlternateLongAndNameCredentials.sleepMillis(10L, (byte) 84);
          }
          if (var8.status == 2) {
            stackIn_11_0 = new FullscreenExitHelpers[]{};
            return stackIn_11_0;
          }
          var10 = (int[]) (var8.result);
          var9 = var10;
          var3 = var9;
          var4 = new FullscreenExitHelpers[var10.length >> 2];
          for (var5 = param0; var5 < var4.length; var5++) {
            var6 = new FullscreenExitHelpers();
            var4[var5] = var6;
            var6.field_a = var3[var5 << 2];
            var6.field_d = var3[1 + (var5 << 2)];
            var6.field_b = var3[(var5 << 2) + 2];
            var6.field_f = var3[(var5 << 2) + 3];
          }
          stackIn_16_0 = var4;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_19_0 = var2;
          stackIn_19_1 = new StringBuilder().append("ud.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    DropdownSelectorPainter(DropdownList param0) {
        try {
          this.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "ud.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = new java.awt.Color(10040319);
        field_a = "Your undead army is victorious!";
    }
}
