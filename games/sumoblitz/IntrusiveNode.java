/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class IntrusiveNode {
    static String fullscreenPlayIsAnText;
    static JaggrabDownloader field_e;
    IntrusiveNode next;
    static SpriteData field_d;
    IntrusiveNode previous;
    static String createAFreeAccountText;
    static String[] field_j;
    static boolean field_a;
    static String[] exclamationPhrases;
    long key;

    public static void releaseStatics(byte param0) {
        createAFreeAccountText = null;
        fullscreenPlayIsAnText = null;
        field_d = null;
        field_j = null;
        exclamationPhrases = null;
        field_e = null;
        if (param0 < 71) {
          field_j = (String[]) null;
        }
    }

    final void unlink(boolean param0) {
        if (null == this.previous) {
          return;
        }
        this.previous.next = this.next;
        this.next.previous = this.previous;
        if (!param0) {
          this.previous = null;
          this.next = null;
          return;
        }
        this.unlink(false);
        this.previous = null;
        this.next = null;
    }

    final static void reportClientError(String param0, Throwable param1, int param2) {
        try {
          PlatformTaskDispatcher stackIn_14_0;
          int stackIn_14_1;
          java.net.URL stackIn_14_2;
          java.net.URL stackIn_14_3;
          java.net.URL stackIn_14_4;
          StringBuilder stackIn_14_5;
          java.net.URL stackIn_15_2;
          java.net.URL stackIn_15_3;
          String stackIn_15_6;
          Throwable decompiledCaughtException = null;
          String var3 = null;
          Exception var3_ref = null;
          PlatformTask var4 = null;
          DataInputStream var5 = null;
          int var6 = 0;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var10 = null;
          var6 = Sumoblitz.field_L ? 1 : 0;
          try {
            var3 = "";
            if (param1 != null) {
              var3 = ws.a((byte) 71, param1);
            }
            if (param0 != null) {
              if (param1 != null) {
                var3 = var3 + " | ";
              }
              var3 = var3 + param0;
            }
            il.a((byte) 96, var3);
            var7 = HardwareGraphicsToolkit.a(":", var3, "%3a", true);
            var8 = HardwareGraphicsToolkit.a("@", var7, "%40", true);
            var9 = HardwareGraphicsToolkit.a("&", var8, "%26", true);
            var10 = HardwareGraphicsToolkit.a("#", var9, "%23", true);
            if (HardwareRidgedWaterNoise.field_z == null) {
              return;
            }
            if (param2 != 0) {
              field_e = (JaggrabDownloader) null;
            }
            stackIn_14_0 = CompactMeshGeometry.field_O;
            stackIn_14_1 = 116;
            stackIn_14_2 = null;
            stackIn_14_3 = null;
            stackIn_14_4 = HardwareRidgedWaterNoise.field_z.getCodeBase();
            stackIn_14_5 = new StringBuilder().append("clienterror.ws?c=").append(SpriteState.field_s).append("&u=");
            if (dv.field_c != null) {
              stackIn_15_2 = null;
              stackIn_15_3 = null;
              stackIn_15_6 = dv.field_c;
            } else {
              stackIn_15_2 = null;
              stackIn_15_3 = null;
              stackIn_15_6 = "" + km.field_k;
            }
            var4 = ((PlatformTaskDispatcher) (Object) stackIn_14_0).a((byte) stackIn_14_1, new java.net.URL(stackIn_14_4, ((StringBuilder) (Object) stackIn_14_5).append(stackIn_15_6).append("&v1=").append(PlatformTaskDispatcher.field_u).append("&v2=").append(PlatformTaskDispatcher.field_q).append("&e=").append(var10).toString()));
            while (var4.status == 0) {
              TextureCombineOperation.a(1L, (byte) 73);
            }
            if (var4.status == 1) {
              var5 = (DataInputStream) (var4.result);
              var5.read();
              var5.close();
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean isLinked(boolean param0) {
        if (param0) {
          createAFreeAccountText = (String) null;
          if (null != this.previous) {
            return true;
          }
          return false;
        }
        if (null != this.previous) {
          return true;
        }
        return false;
    }

    final static nj[] b(int param0) {
        if (null == uo.field_e) {
          uo.field_e = hg.a(110, new int[]{1, 0});
        }
        if (param0 == -16754) {
          return uo.field_e;
        }
        Throwable var2 = (Throwable) null;
        IntrusiveNode.reportClientError((String) null, (Throwable) null, 74);
        return uo.field_e;
    }

    static {
        field_j = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_a = true;
        fullscreenPlayIsAnText = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        createAFreeAccountText = "Create a free Account";
        exclamationPhrases = new String[]{"Zounds!", "Well, I never!", "My word!", "*monocle*", "I do declare!", "Great Scott!"};
    }
}
