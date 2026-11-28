/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sm extends ResultScenePhase {
    static int field_f;
    static int field_j;
    private int field_g;
    static String field_h;
    static int field_i;
    static int field_e;

    public static void resetStaticState(int param0) {
        if (param0 != 10) {
          field_i = -38;
        }
        field_h = null;
    }

    final static String a(long param0, byte param1) {
        an.field_t.setTime(new Date(param0));
        int var3 = an.field_t.get(7);
        if (param1 <= 120) {
          byte[] var10 = (byte[]) null;
          sm.copyBytes(-128, (byte[]) null);
        }
        int var4 = an.field_t.get(5);
        int var5 = an.field_t.get(2);
        int var6 = an.field_t.get(1);
        int var7 = an.field_t.get(11);
        int var8 = an.field_t.get(12);
        int var9 = an.field_t.get(13);
        return DropTargetWidgetContainer.field_y[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + mn.field_l[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    final static String a(byte param0, boolean param1, CharSequence param2) {
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_13_0 = null;
        String stackIn_18_0 = null;
        String stackIn_28_0 = null;
        String stackIn_33_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var6Lifetime1;
        var8 = CrazyCrystals.field_B;
        try {
          if (param2 == null) {
            stackIn_3_0 = SingleChildWidgetContainer.field_v;
            return stackIn_3_0;
          }
          var3_int = param2.length();
          if (var3_int >= 1 &&
            var3_int <= 12) {
            var4 = fe.a(60136, param2);
            if (var4 != null &&
              var4.length() >= 1) {
              if (!am.a(var4.charAt(0), (byte) 100) &&
                !am.a(var4.charAt(var4.length() - 1), (byte) 26)) {
                var5 = 0;
                for (var6 = 0; var6 < param2.length(); var6++) {
                  var7 = param2.charAt(var6);
                  if (am.a((char) var7, (byte) 125)) {
                    var5++;
                  } else {
                    var5 = 0;
                  }
                  if (2 <= var5 &&
                    !param1) {
                    stackIn_28_0 = fe.field_e;
                    return stackIn_28_0;
                  }
                }
                var6Lifetime1 = 35 % ((param0 - 35) / 59);
                if (var5 <= 0) {
                  return null;
                }
                stackIn_33_0 = on.field_a;
                return stackIn_33_0;
              }
              stackIn_18_0 = on.field_a;
              return stackIn_18_0;
            }
            stackIn_13_0 = SingleChildWidgetContainer.field_v;
            return stackIn_13_0;
          }
          stackIn_8_0 = SingleChildWidgetContainer.field_v;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_36_0 = var3;
          stackIn_36_1 = new StringBuilder().append("sm.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw dn.wrapClientException((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }

    final static int d(byte param0) {
        int var1 = -39 / ((param0 + 26) / 39);
        return (int)(1000000000L / NanoFrameTimer.field_k);
    }

    final static byte[] copyBytes(int param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        byte[] var4 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -35 / ((-86 - param0) / 36);
          var3 = param1.length;
          var4 = new byte[var3];
          eg.copyByteRange(param1, 0, var4, 0, var3);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("sm.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw dn.wrapClientException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final ResultScenePhase updatePhase(int param0) {
        if (DebouncedFieldValidator.field_a != null &&
          DebouncedFieldValidator.field_a.field_l != null &&
          180 <= DebouncedFieldValidator.field_a.field_f) {
          return (ResultScenePhase) (this);
        }
        nj.field_k = FloatingScoreLabel.field_a[0].length;
        DualLinkNode.a(0, param0, 0, FloatingScoreLabel.field_a);
        nj.field_k = 0;
        if (this.field_g >= 60) {
          jj.field_b = jj.field_b - (~jj.field_b >> 3);
          if (jj.field_b >= FloatingScoreLabel.field_l) {
            FloatingScoreLabel.field_a = (PuzzleTile[][]) null;
            bd.a((byte) 35, true);
            kj.a((byte) 91);
            return null;
          }
        }
        this.field_g = this.field_g + 1;
        return (ResultScenePhase) (this);
    }

    final ResultScenePhase fastForwardPhase(byte param0) {
        FloatingScoreLabel.field_a = (PuzzleTile[][]) null;
        bd.a((byte) 35, false);
        kj.a((byte) 36);
        if (param0 == -90) {
          return null;
        }
        return (ResultScenePhase) null;
    }

    sm() {
        this.field_g = 0;
    }

    static {
        field_f = 256;
        field_h = "?";
        field_i = -1;
    }
}
