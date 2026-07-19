/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk {
    static String field_g;
    static boolean field_c;
    static pf field_a;
    private pf field_d;
    static vl[] field_b;
    private pf field_f;
    private wa field_e;

    final static boolean a(int param0) {
        if (param0 < 74) {
            field_a = (pf) null;
        }
        return id.b(-4);
    }

    public static void a(byte param0) {
        if (param0 != 31) {
            return;
        }
        field_a = null;
        field_g = null;
        field_b = null;
    }

    final static boolean b(int param0) {
        lb var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        lb var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        var3 = stellarshard.field_B;
        try {
          L0: {
            var4 = (lb) ((Object) oc.field_c.b(-124));
            var1 = var4;
            if (var1 != null) {
              if (param0 == 1816) {
                var2 = 0;
                L1: while (true) {
                  if (var2 >= var1.field_s) {
                    stackOut_20_0 = 1;
                    stackIn_21_0 = stackOut_20_0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    L2: {
                      if (null == var4.field_r[var2]) {
                        break L2;
                      } else {
                        if (0 == var4.field_r[var2].field_f) {
                          stackOut_12_0 = 0;
                          stackIn_13_0 = stackOut_12_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    L3: {
                      if (null == var4.field_q[var2]) {
                        break L3;
                      } else {
                        if (-1 == (var4.field_q[var2].field_f ^ -1)) {
                          stackOut_17_0 = 0;
                          stackIn_18_0 = stackOut_17_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var2++;
                    continue L1;
                  }
                }
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
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
          var1_ref = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1_ref), "wk.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0 != 0;
              } else {
                return stackIn_21_0 != 0;
              }
            }
          }
        }
    }

    final od a(int param0, int param1) {
        byte[] var4 = null;
        od var3 = (od) (this.field_e.b((long)param1, (byte) 58));
        if (var3 != null) {
            return var3;
        }
        if (-32769 < (param1 ^ -1)) {
            var4 = this.field_f.a(param1, 16, 1);
        } else {
            var4 = this.field_d.a(32767 & param1, 16, 1);
        }
        var3 = new od();
        if (var4 != null) {
            var3.a(new ka(var4), 745);
        }
        if (!((param1 ^ -1) > -32769)) {
            var3.f(20865);
        }
        this.field_e.a(var3, (long)param1, -22424);
        if (param0 != 32767) {
            field_a = (pf) null;
        }
        return var3;
    }

    private wk() throws Throwable {
        throw new Error();
    }

    static {
        field_c = false;
        field_b = new vl[3000];
        field_g = "Please wait for high scores";
    }
}
