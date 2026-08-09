/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class se {
    static String field_b;
    static String field_c;
    static int field_d;
    static String field_a;

    final static int a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            rf.field_a.a(wr.field_F, ha.field_b, true, param0 + -19887);
            rf.field_a.h(-90);
            L1: while (true) {
              if (!wd.c(param0 ^ -19954)) {
                if (0 == (iu.field_e ^ -1)) {
                  if (lc.field_A) {
                    stackIn_10_0 = 3;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    L2: {
                      if (param0 == 19886) {
                        break L2;
                      } else {
                        field_d = -49;
                        break L2;
                      }
                    }
                    if (vm.field_c == ad.field_p) {
                      stackIn_16_0 = 1;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      if (ut.field_o.a(true)) {
                        if (nw.field_e != ad.field_p) {
                          stackIn_24_0 = -1;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        } else {
                          stackIn_22_0 = 2;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      } else {
                        stackIn_19_0 = 1;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  }
                } else {
                  var1_int = iu.field_e;
                  rd.a(-1, param0 ^ -19873);
                  stackIn_6_0 = var1_int;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                rf.field_a.a(np.field_c, tg.field_a, true);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1), "se.K(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_22_0;
                } else {
                  return stackIn_24_0;
                }
              }
            }
          }
        }
    }

    abstract nb a(byte param0);

    final static String a(CharSequence[] param0, int param1, int param2, int param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_13_0 = null;
        String stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (param3 == 14156) {
              if (0 == param2) {
                stackIn_7_0 = "";
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if ((param2 ^ -1) == -2) {
                  var10 = param0[param1];
                  var4 = var10;
                  if (var4 == null) {
                    stackIn_13_0 = "null";
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    return var10.toString();
                  }
                } else {
                  var4_int = param2 - -param1;
                  var5 = 0;
                  var6_int = param1;
                  L1: while (true) {
                    if (var4_int <= var6_int) {
                      var6 = new StringBuilder(var5);
                      var7 = param1;
                      L2: while (true) {
                        if (var7 >= var4_int) {
                          stackIn_27_0 = var6.toString();
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          L3: {
                            var8 = param0[var7];
                            if (var8 != null) {
                              discarded$3 = var6.append(var8);
                              break L3;
                            } else {
                              discarded$4 = var6.append("null");
                              break L3;
                            }
                          }
                          var7++;
                          continue L2;
                        }
                      }
                    } else {
                      L4: {
                        var7_ref_CharSequence = param0[var6_int];
                        if (var7_ref_CharSequence != null) {
                          var5 = var5 + var7_ref_CharSequence.length();
                          break L4;
                        } else {
                          var5 += 4;
                          break L4;
                        }
                      }
                      var6_int++;
                      continue L1;
                    }
                  }
                }
              }
            } else {
              stackIn_3_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var4_ref);

            stackIn_30_1 = new StringBuilder().append("se.M(");

            if (param0 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L5;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              return stackIn_27_0;
            }
          }
        }
    }

    abstract void a(fs param0, byte param1);

    final static boolean a(int param0, int param1, int param2) {
        int var3 = -24 % ((-63 - param0) / 40);
        if (!oj.a(param1, 13836, param2)) {
            return false;
        }
        if ((-1 != (param1 & 36864 ^ -1) ? true : false) | dk.a(param1, (byte) -107, param2) | tq.a(param2, true, param1)) {
            return true;
        }
        return (lg.a(param1, -22, param2) | ((8192 & param1) != 0 ? true : false) | mb.a(true, param2, param1)) & ((param2 & 55) == 0 ? true : false);
    }

    public static void b(int param0) {
        if (param0 != 8192) {
            field_d = 19;
        }
        field_b = null;
        field_a = null;
        field_c = null;
    }

    static {
        field_b = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_c = "Please try again in a few minutes.";
        field_a = "Score";
    }
}
