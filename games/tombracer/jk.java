/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jk extends vg {
    static String field_i;
    static int[] field_h;
    byte[] field_f;
    static jea field_g;

    final static vna a(byte param0) {
        vna var1 = null;
        L0: {
          var1 = new vna();
          if (param0 == 122) {
            break L0;
          } else {
            vna discarded$1 = jk.a((byte) 64);
            break L0;
          }
        }
        var1.b((byte) -117, (vg) (Object) new ak("load", new Class[1], "Run a test level from the freelevels directory."));
        var1.b((byte) -47, (vg) (Object) new dia("hello", new Class[0], "Be friendly."));
        var1.b((byte) -91, (vg) (Object) new eea("banner", new Class[0], "Load the banner corridor."));
        var1.b((byte) -56, (vg) (Object) new lq("showLevelSet", new Class[0], "Show the level set editor"));
        var1.b((byte) -100, (vg) (Object) new vr("setFakeLag", new Class[1], (String) null));
        var1.b((byte) -112, (vg) (Object) new wr("toggleMusicChannel", new Class[2], (String) null));
        var1.b((byte) -82, (vg) (Object) new rna("listChannels", new Class[0], (String) null));
        var1.b((byte) -73, (vg) (Object) new bh("playTrack", new Class[1], (String) null));
        var1.b((byte) -83, (vg) (Object) new tb("listTracks", new Class[0], (String) null));
        var1.b((byte) -81, (vg) (Object) new jf("loadProfile", new Class[1], (String) null));
        return var1;
    }

    public static void b() {
        field_h = null;
        field_i = null;
        field_g = null;
    }

    final static int a(byte param0, BitSet param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        g[] var5 = null;
        int var6 = 0;
        g var7 = null;
        int var8 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            var4 = -1;
            var5 = qg.field_a;
            var6 = 0;
            L1: while (true) {
              if (var6 >= var5.length) {
                stackOut_11_0 = var4;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                var7 = var5[var6];
                if (param2) {
                  L2: {
                    if (param1.get(var7.field_a)) {
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var6++;
                  continue L1;
                } else {
                  L3: {
                    if (var7.field_d) {
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var6++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("jk.D(").append(22).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param2 + 41);
        }
        return stackIn_12_0;
    }

    final static void a(int param0) {
        int var2 = param0;
        lu.a(var2, al.field_h, -1, var2, sua.field_J);
    }

    jk(byte[] param0) {
        try {
            ((jk) this).field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "jk.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Rated games are available to members only. To become a member, please visit the 'Account' section of the website.";
    }
}
