/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cp {
    static String field_b;
    static String field_a;
    static int field_c;

    final static boolean a(int param0) {
        int var1;
        var1 = -123 / ((param0 - 52) / 44);
        if (-21 >= (qc.field_A ^ -1)) {
          if (tk.c((byte) -38)) {
            if (0 < rc.field_b) {
              if (ne.j(0)) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    public static void b(byte param0) {
        int var1 = 65 / ((-65 - param0) / 61);
        field_a = null;
        field_b = null;
    }

    final static boolean a(byte param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (!Character.isISOControl(param1)) {
              if (!d.a(param1, param0 + -62)) {
                if (param0 == 64) {
                  var6 = nr.field_o;
                  var2 = var6;
                  var3 = 0;
                  L1: while (true) {
                    if (var6.length <= var3) {
                      var2 = uc.field_b;
                      var3 = 0;
                      L2: while (true) {
                        if (var2.length <= var3) {
                          stackIn_24_0 = 0;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          var4 = var2[var3];
                          if (param1 != var4) {
                            var3++;
                            continue L2;
                          } else {
                            stackIn_21_0 = 1;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          }
                        }
                      }
                    } else {
                      var4 = var6[var3];
                      if ((var4 ^ -1) != (param1 ^ -1)) {
                        var3++;
                        continue L1;
                      } else {
                        return true;
                      }
                    }
                  }
                } else {
                  stackIn_9_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2_ref), "cp.B(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_21_0 != 0;
              } else {
                return stackIn_24_0 != 0;
              }
            }
          }
        }
    }

    final static void a(byte param0) {
        if (dc.field_L == null) {
          return;
        } else {
          Vertigo2.a(dc.field_L, (byte) -35);
          dc.field_L.a(gi.field_s, 30210);
          dc.field_L = null;
          if (param0 > 122) {
            if (null != t.field_m) {
              t.field_m.b((byte) 118);
              ne.field_F.requestFocus();
              return;
            } else {
              ne.field_F.requestFocus();
              return;
            }
          } else {
            field_a = (String) null;
            if (null == t.field_m) {
              ne.field_F.requestFocus();
              return;
            } else {
              t.field_m.b((byte) 118);
              ne.field_F.requestFocus();
              return;
            }
          }
        }
    }

    static {
        field_b = "    ";
        field_c = -1;
        field_a = "Unpacking models";
    }
}
