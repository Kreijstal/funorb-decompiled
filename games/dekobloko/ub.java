/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub {
    static String field_f;
    static String field_e;
    static int[] field_d;
    static String field_b;
    static int field_a;
    static String field_c;

    final static int a(int param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_18_0 = 0;
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            var4 = fc.field_a;
            L1: while (true) {
              L2: {
                L3: {
                  if (rk.field_P.length <= var3_int) {
                    if (param1 == -81) {
                      break L2;
                    } else {
                      break L3;
                    }
                  } else {
                    var5 = k.field_g[var3_int];
                    var10 = var5 ^ -1;
                    var9 = -1;
                    if (var8 != 0) {
                      if (var9 == var10) {
                        break L2;
                      } else {
                        break L3;
                      }
                    } else {
                      L4: {
                        L5: {
                          if (var9 >= var10) {
                            break L5;
                          } else {
                            var4 = var4 + ke.field_d;
                            if (var8 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var6 = si.a(false, rk.field_P[var3_int], true);
                        var7 = qk.field_d - (var6 >> -1844375231);
                        var4 = var4 + qk.field_m;
                        if (gi.a(17, param2, param0, var6 + (mb.field_c << 242737281), var4, (pa.field_Y << 1992180769) + cc.field_a, var7 - mb.field_c)) {
                          stackOut_11_0 = var5;
                          stackIn_12_0 = stackOut_11_0;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        } else {
                          var4 = var4 + (qk.field_m + ((pa.field_Y << -922946463) - -cc.field_a));
                          break L4;
                        }
                      }
                      var3_int++;
                      continue L1;
                    }
                  }
                }
                stackOut_16_0 = -50;
                stackIn_17_0 = stackOut_16_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
              stackOut_18_0 = -1;
              stackIn_19_0 = stackOut_18_0;
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var3), "ub.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_12_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_17_0;
          } else {
            return stackIn_19_0;
          }
        }
    }

    final static void a(byte param0) {
        int discarded$4 = 0;
        int discarded$5 = 0;
        if (!jh.field_h) {
          if (param0 != 54) {
            discarded$4 = ub.a(-56, (byte) 45, 35);
            return;
          } else {
            return;
          }
        } else {
          hk.d(hk.field_c, hk.field_h, hk.field_g + -hk.field_c, hk.field_b - hk.field_h);
          ie.field_c.a(1141039778, false);
          if (param0 == 54) {
            return;
          } else {
            discarded$5 = ub.a(-56, (byte) 45, 35);
            return;
          }
        }
    }

    final static sb a(int param0, int param1, int param2, int param3) {
        sb var4 = null;
        var4 = new sb();
        if (param3 <= 95) {
          field_f = (String) null;
          var4.field_q = new int[param0];
          var4.field_r = param2;
          ef.field_S.a(var4, 2777);
          oi.a(-102, param1, var4);
          return var4;
        } else {
          var4.field_q = new int[param0];
          var4.field_r = param2;
          ef.field_S.a(var4, 2777);
          oi.a(-102, param1, var4);
          return var4;
        }
    }

    public static void b(byte param0) {
        if (param0 > -17) {
          field_e = (String) null;
          field_f = null;
          field_e = null;
          field_c = null;
          field_d = null;
          field_b = null;
          return;
        } else {
          field_f = null;
          field_e = null;
          field_c = null;
          field_d = null;
          field_b = null;
          return;
        }
    }

    static {
        field_f = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_e = "Player";
        field_d = new int[36];
        field_a = 0;
        field_b = "Ready...";
    }
}
