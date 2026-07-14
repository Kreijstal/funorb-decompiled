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

    public static void b(byte param0) {
        field_h = null;
        field_i = null;
        if (param0 <= 11) {
            field_h = null;
        }
        field_g = null;
    }

    final static int a(byte param0, BitSet param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        g[] var5 = null;
        int var6 = 0;
        g var7 = null;
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        var3 = 0;
        var4 = -1;
        var5 = qg.field_a;
        var6 = 0;
        if (param0 == 22) {
          L0: while (true) {
            L1: {
              if (var6 >= var5.length) {
                break L1;
              } else {
                L2: {
                  var7 = var5[var6];
                  if (param2) {
                    break L2;
                  } else {
                    if (!var7.field_d) {
                      break L2;
                    } else {
                      var6++;
                      continue L0;
                    }
                  }
                }
                if (!param1.get(var7.field_a)) {
                  L3: {
                    var3++;
                    if (var4 >= var7.field_a) {
                      break L3;
                    } else {
                      var4 = var7.field_a;
                      break L3;
                    }
                  }
                  if (10 <= var3) {
                    break L1;
                  } else {
                    var6++;
                    continue L0;
                  }
                } else {
                  var6++;
                  continue L0;
                }
              }
            }
            return var4;
          }
        } else {
          return -122;
        }
    }

    final static void a(int param0, int param1) {
        if (param1 != 0) {
            Object var3 = null;
            int discarded$0 = jk.a((byte) 69, (BitSet) null, true);
        }
        int var2 = param0;
        lu.a(var2, al.field_h, -1, var2, sua.field_J);
    }

    jk(byte[] param0) {
        ((jk) this).field_f = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Rated games are available to members only. To become a member, please visit the 'Account' section of the website.";
    }
}
