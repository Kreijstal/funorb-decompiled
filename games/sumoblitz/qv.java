/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qv extends ms {
    static String field_l;
    static String field_o;
    int[] field_m;
    int field_n;
    static da field_k;

    final static void a(int param0) {
        ts.field_a = ts.field_a + 13;
        if (param0 != 2) {
            field_l = (String) null;
        }
        fb.field_a = fb.field_a - 9;
        kn.field_b = kn.field_b - 4;
        ha.field_f = ha.field_f + 18;
    }

    final static void a(int param0, int param1) {
        mf var2 = fh.field_n[param0];
        if (param1 != 4) {
            CharSequence var3 = (CharSequence) null;
            qv.a(false, -82, (CharSequence) null);
        }
        var2.c(-1);
        qq.a(18416, var2);
    }

    final static String a(boolean param0, int param1, CharSequence param2) {
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_14_0 = null;
        String stackIn_19_0 = null;
        String stackIn_28_0 = null;
        String stackIn_33_0 = null;
        Object stackIn_35_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (param2 == null) {
              stackIn_4_0 = qq.field_Q;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var3_int = param2.length();
                if ((var3_int ^ -1) > -2) {
                  break L1;
                } else {
                  if (12 >= var3_int) {
                    L2: {
                      var4 = uk.a(-1, param2);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if (-2 >= (var4.length() ^ -1)) {
                          L3: {
                            if (wv.a((byte) -88, var4.charAt(0))) {
                              break L3;
                            } else {
                              if (!wv.a((byte) -86, var4.charAt(-1 + var4.length()))) {
                                var5 = 0;
                                var6 = 0;
                                L4: while (true) {
                                  if (var6 >= param2.length()) {
                                    if (-1 > (var5 ^ -1)) {
                                      stackIn_33_0 = m.field_T;
                                      decompiledRegionSelector0 = 5;
                                      break L0;
                                    } else {
                                      var6 = -54 / ((48 - param1) / 41);
                                      stackIn_35_0 = null;
                                      decompiledRegionSelector0 = 6;
                                      break L0;
                                    }
                                  } else {
                                    L5: {
                                      var7 = param2.charAt(var6);
                                      if (!wv.a((byte) -99, (char) var7)) {
                                        var5 = 0;
                                        break L5;
                                      } else {
                                        var5++;
                                        break L5;
                                      }
                                    }
                                    L6: {
                                      if (var5 < 2) {
                                        break L6;
                                      } else {
                                        if (param0) {
                                          break L6;
                                        } else {
                                          stackIn_28_0 = ma.field_a;
                                          decompiledRegionSelector0 = 4;
                                          break L0;
                                        }
                                      }
                                    }
                                    var6++;
                                    continue L4;
                                  }
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                          stackIn_19_0 = m.field_T;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackIn_14_0 = qq.field_Q;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              stackIn_9_0 = qq.field_Q;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_38_0 = (RuntimeException) (var3);

            stackIn_38_1 = new StringBuilder().append("qv.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L7;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L7;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_28_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_33_0;
                  } else {
                    return (String) ((Object) stackIn_35_0);
                  }
                }
              }
            }
          }
        }
    }

    public static void c(int param0) {
        field_l = null;
        field_k = null;
        if (param0 != 18) {
            field_k = (da) null;
        }
        field_o = null;
    }

    private qv() throws Throwable {
        throw new Error();
    }

    static {
        field_l = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
