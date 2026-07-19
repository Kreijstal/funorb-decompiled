/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh extends le {
    static vn field_j;
    static java.applet.Applet field_i;
    byte[] field_k;
    static String field_h;

    final static void a(int param0) {
        al[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        al var3 = null;
        int var4 = 0;
        al[] var5 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ZombieDawn.field_J;
        try {
          L0: {
            if (qg.field_d) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              qg.field_d = true;
              var5 = qk.field_Jb;
              var1 = var5;
              var2 = param0;
              L1: while (true) {
                if (var2 >= var5.length) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var3 = var5[var2];
                  var3.b(24136);
                  var2++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1_ref), "bh.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void c(int param0) {
        field_h = null;
        if (param0 < 69) {
            bh.a(-47);
        }
        field_j = null;
        field_i = null;
    }

    bh(byte[] param0) {
        try {
            this.field_k = param0;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "bh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(char param0, boolean param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_2_0 = 0;
        var5 = ZombieDawn.field_J;
        try {
          L0: {
            if (!Character.isISOControl(param0)) {
              if (c.a(param0, 441)) {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var6 = hn.field_o;
                var2 = var6;
                var3 = 0;
                L1: while (true) {
                  if (var6.length <= var3) {
                    L2: {
                      var2 = pf.field_h;
                      var3 = 0;
                      if (!param1) {
                        break L2;
                      } else {
                        field_h = (String) null;
                        break L2;
                      }
                    }
                    L3: while (true) {
                      if (var3 >= var2.length) {
                        stackOut_22_0 = 0;
                        stackIn_23_0 = stackOut_22_0;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        var4 = var2[var3];
                        if (param0 == var4) {
                          stackOut_19_0 = 1;
                          stackIn_20_0 = stackOut_19_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          var3++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    var4 = var6[var3];
                    if (param0 != var4) {
                      var3++;
                      continue L1;
                    } else {
                      stackOut_11_0 = 1;
                      stackIn_12_0 = stackOut_11_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2_ref), "bh.C(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_20_0 != 0;
              } else {
                return stackIn_23_0 != 0;
              }
            }
          }
        }
    }

    static {
        field_h = "CURSE";
    }
}
