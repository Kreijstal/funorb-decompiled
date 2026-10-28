/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DelayedServerPacket extends IntrusiveNode {
    byte[] payload;
    int opcode;
    static int field_h;
    long readyAtMillis;

    final static void detectMaximumHeap(byte guard) {
        try {
          Throwable decompiledCaughtException = null;
          try {
            java.lang.reflect.Method var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
            if (var1 != null) {
              try {
                Runtime var2 = Runtime.getRuntime();
                Object[] var4 = (Object[]) null;
                Long var3 = (Long) (var1.invoke((Object) (var2), (Object[]) null));
                IntroFrameRenderer.field_c = (int)(var3.longValue() / 1048576L) + 1;
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                Throwable var2_ref = decompiledCaughtException;
              }
            }
            if (guard >= -24) {
              DelayedServerPacket.detectMaximumHeap((byte) 69);
              return;
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            Exception var1_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void loadSkyLayers(ResourceArchive archive, int theme, boolean guard) {
        String stackIn_12_2 = null;
        int var4 = EscapeVector.obfuscationControl;
        try {
          int var3_int = 0;
          if (guard) {
            field_h = -2;
          }
          while (4 > var3_int) {
            Sprite[] stackIn_6_0 = ChatMessageDecoder.field_b[theme];
            int stackIn_6_1 = var3_int;
            String stackIn_6_2 = SessionMenuSupport.field_d[theme];
            ResourceArchive stackIn_6_3 = (ResourceArchive) (archive);
            String stackIn_6_4 = "layer" + var3_int;
            boolean stackIn_7_5 = !(guard);
            stackIn_6_0[stackIn_6_1] = MembershipPromotionScreen.loadNamedSprite(stackIn_6_2, stackIn_6_3, stackIn_6_4, stackIn_7_5);
            var3_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_11_0 = var3;
          StringBuilder stackIn_11_1 = new StringBuilder().append("dm.A(");
          if (archive == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(theme).append(',').append(guard).append(')').toString());
        }
    }

    final static void openSupportPage(int guard, java.applet.Applet applet) {
        try {
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              java.net.URL var2 = new java.net.URL(applet.getCodeBase(), "tosupport.ws");
              applet.getAppletContext().showDocument(WeightedCacheEntry.withSessionParameters((byte) 52, applet, var2), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              Exception var2_ref2 = (Exception) (Object) decompiledCaughtException;
              var2_ref2.printStackTrace();
            }
            if (guard == 4) {
              return;
            }
            field_h = -125;
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            RuntimeException var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_8_0 = var2_ref;
            StringBuilder stackIn_8_1 = new StringBuilder().append("dm.C(").append(guard).append(',');
            if (applet == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    DelayedServerPacket(long readyAtMillis, int opcode, byte[] payload) {
        try {
          this.opcode = opcode;
          this.payload = payload;
          this.readyAtMillis = readyAtMillis;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "dm.<init>(" + readyAtMillis + ',' + opcode + ',' + (payload != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = 640;
    }
}
