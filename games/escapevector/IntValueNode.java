/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntValueNode extends IntrusiveNode {
    static ik field_i;
    static String[] field_h;
    int value;
    static boolean field_j;

    final static void a(String param0, String param1, int param2) {
        try {
          if (be.field_b != null) {
            be.field_b.o(-18861);
          }
          PcmResampler.field_d = new h(param0, param1, false, true, true);
          if (param2 != 63) {
            field_h = (String[]) null;
          }
          rd.field_c.a(PcmResampler.field_d, 30);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "de.D(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
          String stackIn_12_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              String var2 = param1.getDocumentBase().getFile();
              if (param0) {
                return;
              }
              int var3 = var2.indexOf('?');
              String var4 = "reload.ws";
              if (var3 >= 0) {
                var4 = var4 + var2.substring(var3);
              }
              java.net.URL var5 = new java.net.URL(param1.getCodeBase(), var4);
              param1.getAppletContext().showDocument(sh.a((byte) 12, param1, var5), "_self");
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              Exception var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            RuntimeException var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_11_0 = var2_ref2;
            StringBuilder stackIn_11_1 = new StringBuilder().append("de.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        field_h = null;
        if (!param0) {
          return;
        }
        field_i = null;
    }

    IntValueNode(int param0) {
        this.value = param0;
    }

    final static void startSelectedLevel(int gameMode, int levelIndex, int guard) {
        ce.field_f.a(true);
        gameMode = l.a(-8462, gameMode);
        levelIndex = SectorCacheStore.a(gameMode, 13565, levelIndex);
        int var3 = nk.a(1, gameMode);
        BoundedRandomAccessFile.activeSession = new GameplaySession(ld.field_h[gameMode], var3, gameMode, levelIndex);
        BoundedRandomAccessFile.activeSession.startSession((byte) -40);
        if (guard >= 77) {
          return;
        }
        field_h = (String[]) null;
    }

    static {
        field_h = new String[]{"Congratulations, commander. Your mission has been an overwhelming success.", "You have exceeded all expectations and single-handedly brought about the destruction of the alien war machine.", "Their military infrastructure lies in ruins ... ", " ... in the wake of your successful undercover strikes", "Earth is safe once again, thanks to you."};
    }
}
