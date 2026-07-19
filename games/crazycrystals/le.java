/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le extends ln {
    static dl[][] field_g;

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        md var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        ca var11 = null;
        md var12 = null;
        dp var13 = null;
        int[] var14 = null;
        dp var15 = null;
        int[] var16 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              var12 = kd.field_n;
              if (param0 == 15295) {
                break L1;
              } else {
                le.b(115);
                break L1;
              }
            }
            L2: {
              var2 = var12.h(255);
              if (var2 == 0) {
                var10 = wl.a((byte) -93);
                var16 = var10;
                var14 = var16;
                var3 = var14;
                var9 = var10;
                var4 = var9;
                var5 = var12;
                var6 = ((ng) ((Object) var5)).h(255);
                var7 = 0;
                L3: while (true) {
                  if (var7 >= var6) {
                    var15 = (dp) ((Object) pm.field_c.g(32073));
                    if (var15 != null) {
                      var15.field_k = true;
                      var15.field_g = var3;
                      var15.field_f = var16[0];
                      var15.a(false);
                      break L2;
                    } else {
                      jj.a(4);
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  } else {
                    var9[var7] = ((ng) ((Object) var5)).b((byte) -75);
                    var7++;
                    continue L3;
                  }
                }
              } else {
                if ((var2 ^ -1) == -2) {
                  var11 = (ca) ((Object) gn.field_Q.g(param0 ^ 18166));
                  if (var11 != null) {
                    var11.a(false);
                    break L2;
                  } else {
                    jj.a(4);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  if (var2 == 2) {
                    var13 = (dp) ((Object) pm.field_c.g(param0 ^ 18166));
                    if (var13 != null) {
                      var13.field_g = wl.a((byte) -117);
                      var13.field_k = true;
                      var13.field_f = var13.field_g[0];
                      var13.a(false);
                      break L2;
                    } else {
                      jj.a(param0 + -15291);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    wp.a((Throwable) null, "A1: " + ug.a(-1815), 21862);
                    jj.a(4);
                    break L2;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var1), "le.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    public static void b(int param0) {
        field_g = (dl[][]) null;
        if (param0 != -1) {
            field_g = (dl[][]) null;
        }
    }

    final static java.applet.Applet b(byte param0) {
        if (tk.field_i != null) {
            return tk.field_i;
        }
        if (param0 != -20) {
            le.a(-107);
        }
        return (java.applet.Applet) ((Object) gl.field_h);
    }

    le(String param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3);
    }

    final int a(int param0, byte param1) {
        int var3 = 27 % ((param1 - 55) / 50);
        return ue.field_c ? 1 : 0;
    }

    static {
    }
}
