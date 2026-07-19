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
        vna discarded$1 = null;
        vna var1 = null;
        L0: {
          var1 = new vna();
          if (param0 == 122) {
            break L0;
          } else {
            discarded$1 = jk.a((byte) 64);
            break L0;
          }
        }
        var1.b((byte) -117, new ak("load", new Class[]{String.class}, "Run a test level from the freelevels directory."));
        var1.b((byte) -47, new dia("hello", new Class[]{}, "Be friendly."));
        var1.b((byte) -91, new eea("banner", new Class[]{}, "Load the banner corridor."));
        var1.b((byte) -56, new lq("showLevelSet", new Class[]{}, "Show the level set editor"));
        var1.b((byte) -100, new vr("setFakeLag", new Class[]{Integer.TYPE}, (String) null));
        var1.b((byte) -112, new wr("toggleMusicChannel", new Class[]{String.class, Boolean.TYPE}, (String) null));
        var1.b((byte) -82, new rna("listChannels", new Class[]{}, (String) null));
        var1.b((byte) -73, new bh("playTrack", new Class[]{String.class}, (String) null));
        var1.b((byte) -83, new tb("listTracks", new Class[]{}, (String) null));
        var1.b((byte) -81, new jf("loadProfile", new Class[]{String.class}, (String) null));
        return var1;
    }

    public static void b(byte param0) {
        field_h = null;
        field_i = null;
        if (param0 <= 11) {
            field_h = (int[]) null;
            field_g = null;
            return;
        }
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
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        int stackOut_15_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            var4 = -1;
            var5 = qg.field_a;
            var6 = 0;
            if (param0 == 22) {
              L1: while (true) {
                L2: {
                  L3: {
                    if (var6 >= var5.length) {
                      break L3;
                    } else {
                      var7 = var5[var6];
                      stackOut_5_0 = param2;
                      stackIn_16_0 = stackOut_5_0 ? 1 : 0;
                      stackIn_6_0 = stackOut_5_0;
                      if (var8 != 0) {
                        break L2;
                      } else {
                        L4: {
                          L5: {
                            if (stackIn_6_0) {
                              break L5;
                            } else {
                              if (var7.field_d) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          if (param1.get(var7.field_a)) {
                            break L4;
                          } else {
                            L6: {
                              var3_int++;
                              if (var4 >= var7.field_a) {
                                break L6;
                              } else {
                                var4 = var7.field_a;
                                break L6;
                              }
                            }
                            if (10 <= var3_int) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var6++;
                        if (var8 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_15_0 = var4;
                  stackIn_16_0 = stackOut_15_0;
                  break L2;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = -122;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var3);
            stackOut_17_1 = new StringBuilder().append("jk.D(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L7;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_16_0;
        }
    }

    final static void a(int param0, int param1) {
        int discarded$2 = 0;
        int var2 = 0;
        BitSet var3 = null;
        if (param1 != 0) {
          var3 = (BitSet) null;
          discarded$2 = jk.a((byte) 69, (BitSet) null, true);
          var2 = param0;
          lu.a(var2, al.field_h, -1, var2, sua.field_J);
          return;
        } else {
          var2 = param0;
          lu.a(var2, al.field_h, -1, var2, sua.field_J);
          return;
        }
    }

    jk(byte[] param0) {
        try {
            this.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "jk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = "Rated games are available to members only. To become a member, please visit the 'Account' section of the website.";
    }
}
