/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qo {
    static jd field_e;
    static int field_c;
    static int field_d;
    static eg field_a;
    static hc field_b;

    public static void c(byte param0) {
        field_e = null;
        int var1 = -27 % ((param0 - -24) / 37);
        field_b = null;
        field_a = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static String a(String param0, String param1, gk param2, int param3, String param4) {
        RuntimeException var5 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param2.b((byte) -105)) {
              stackIn_3_0 = (String) (param0);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param3 == 13525) {
                stackIn_8_0 = param4 + " - " + param2.a(param1, (byte) -79) + "%";
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_6_0 = (String) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("qo.B(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L1;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_12_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_8_0;
          }
        }
    }

    final static void a(byte param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        oh var4_ref_oh = null;
        uk var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        dl var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        var8 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var10 = nm.field_c;
            if (param0 == -26) {
              L1: {
                var2 = var10.g(104);
                var3 = var10.g(-75);
                if (0 != var2) {
                  if (1 == var2) {
                    var4 = var10.f((byte) 127);
                    var5 = (uk) ((Object) v.field_b.d(268435455));
                    L2: while (true) {
                      L3: {
                        if (var5 == null) {
                          break L3;
                        } else {
                          L4: {
                            if (var3 != var5.field_i) {
                              break L4;
                            } else {
                              if (var5.field_m == var4) {
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          var5 = (uk) ((Object) v.field_b.b((byte) 103));
                          continue L2;
                        }
                      }
                      if (var5 != null) {
                        var5.c(-125);
                        break L1;
                      } else {
                        te.b(true);
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  } else {
                    v.a("LR1: " + dl.k((byte) 65), (byte) -52, (Throwable) null);
                    te.b(true);
                    break L1;
                  }
                } else {
                  var4_ref_oh = (oh) ((Object) fg.field_r.d(268435455));
                  if (var4_ref_oh != null) {
                    L5: {
                      var5_int = ag.field_s + -var10.field_g;
                      var12 = var4_ref_oh.field_f;
                      var11 = var12;
                      var6 = var11;
                      if (var5_int <= var12.length << -2061567038) {
                        break L5;
                      } else {
                        var5_int = var12.length << -381357150;
                        break L5;
                      }
                    }
                    var7 = 0;
                    L6: while (true) {
                      if (var7 >= var5_int) {
                        var4_ref_oh.c(-124);
                        break L1;
                      } else {
                        var6[var7 >> -1283038238] = var6[var7 >> -1283038238] + (var10.g(-100) << pg.a(var7 << 920191848, 768));
                        var7++;
                        continue L6;
                      }
                    }
                  } else {
                    te.b(true);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1), "qo.D(" + param0 + ')');
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

    final boolean b(byte param0) {
        if (param0 != -92) {
            field_c = 87;
        }
        return ((aj.field_v == this ? 1 : 0) | (this == nj.field_f ? 1 : 0)) != 0;
    }

    static {
        field_e = new jd();
        field_a = new eg();
    }
}
