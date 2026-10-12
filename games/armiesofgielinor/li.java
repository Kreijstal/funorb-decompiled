/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class li extends IntrusiveNode {
    static Random field_n;
    static int[] field_k;
    static String field_p;
    byte[] field_l;
    int field_o;
    static int field_q;
    static String field_m;

    final static void a(int param0) {
        int var3 = 0;
        int var1_int = 0;
        wp var2 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var1_int = pr.field_g.frameId >> 16;
          var2 = we.a(var1_int, true);
          io.a(var2, (byte) -34);
          if (CipherPacketBuffer.currentBattlefield.localPlayer <= -1) {
            stackIn_4_0 = CipherPacketBuffer.currentBattlefield.currentPlayer;
          } else {
            stackIn_4_0 = CipherPacketBuffer.currentBattlefield.localPlayer;
          }
          MapTile.field_i = stackIn_4_0;
          GameplayController.field_f = (int)(106.0 + Math.sin((double)uk.field_n / 3.141592653589793 / (double)param0) * 50.0);
          if (!cu.field_a) {
            kl.field_a.g(200);
            return;
          }
          for (var3 = 0; var3 < 4; var3++) {
            kl.field_a.b(var3, param0 + 1745035901);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.addExceptionContext((Throwable) ((Object) var1), "li.B(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        field_p = null;
        field_k = null;
        field_m = null;
        if (param0 != 74) {
          li.a(-95);
          field_n = null;
          return;
        }
        field_n = null;
    }

    li(byte[] param0) {
        try {
          this.field_l = param0;
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "li.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = new int[8192];
        field_p = "Create a free Account";
        field_n = new Random(6L);
        field_q = -1;
        field_m = "Show lobby chat from my friends";
    }
}
