/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jl {
    static String[] field_c;
    static String field_d;
    static int field_e;
    static long field_h;
    static lj field_b;
    static ka[] field_a;
    static java.math.BigInteger field_f;
    static String field_g;

    final int a(byte param0, long param1) {
        long var4 = ((jl) this).c(121);
        if (param0 != -12) {
            int discarded$0 = ((jl) this).a(69L, 62);
        }
        if (var4 > 0L) {
            c.a(-127, var4);
        }
        return ((jl) this).a(param1, param0 ^ -24);
    }

    abstract void a(int param0);

    abstract int a(long param0, int param1);

    public static void b(int param0) {
        int var1 = 0;
        field_a = null;
        field_b = null;
        field_g = null;
        field_f = null;
        field_d = null;
        field_c = null;
    }

    abstract long c(int param0);

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var5 = 0;
              var6 = 28;
              if (hf.field_d == null) {
                break L1;
              } else {
                if (~var6 < ~hf.field_d.length) {
                  break L1;
                } else {
                  var7 = 0;
                  L2: while (true) {
                    if (var7 >= 3) {
                      var1_int = 0;
                      var7 = 0;
                      L3: while (true) {
                        if (4 <= var7) {
                          var3 = 0;
                          var7 = 0;
                          L4: while (true) {
                            if (var7 >= 3) {
                              L5: {
                                var3 = var3 | var1_int & 31;
                                hd.field_c[0] = p.a(hd.field_c[0], jh.a(var3, 31));
                                if (param0 > 111) {
                                  break L5;
                                } else {
                                  field_h = 53L;
                                  break L5;
                                }
                              }
                              var3 = 0;
                              var3 = var3 | (var1_int & 992) >> 5;
                              hd.field_c[1] = p.a(hd.field_c[1], jh.a(var3, 31));
                              var3 = 0;
                              var3 = var3 | (var1_int & 31744) >> 10;
                              hd.field_c[2] = p.a(hd.field_c[2], jh.a(var3, 31));
                              break L0;
                            } else {
                              hd.field_c[var7] = 0;
                              var7++;
                              continue L4;
                            }
                          }
                        } else {
                          L6: {
                            var4 = 0;
                            var3 = 0;
                            var3 = var3 | hf.field_d[var5 - -var7];
                            if (var7 == 0) {
                              var4 = 255;
                              break L6;
                            } else {
                              if (var7 == 1) {
                                var4 = 65280;
                                break L6;
                              } else {
                                if (var7 != 2) {
                                  if (var7 == 3) {
                                    var4 = -16777216;
                                    break L6;
                                  } else {
                                    var1_int = var1_int | var4 & (255 & var3) << var7 * 8;
                                    var7++;
                                    continue L3;
                                  }
                                } else {
                                  var4 = 16711680;
                                  break L6;
                                }
                              }
                            }
                          }
                          var1_int = var1_int | var4 & (255 & var3) << var7 * 8;
                          var7++;
                          continue L3;
                        }
                      }
                    } else {
                      var1_int = 0;
                      var8 = 0;
                      L7: while (true) {
                        if (var8 >= 4) {
                          var2 = 0;
                          var8 = 0;
                          L8: while (true) {
                            if (var8 >= 4) {
                              var8 = 0;
                              L9: while (true) {
                                if (5 <= var8) {
                                  var3 = 0;
                                  var3 = var3 | 31 & var1_int;
                                  pi.field_d[var7][0] = p.a(pi.field_d[var7][0], jh.a(31, var3));
                                  var3 = 0;
                                  var3 = var3 | 31 & var1_int >> 6;
                                  pi.field_d[var7][1] = p.a(pi.field_d[var7][1], jh.a(var3, 31));
                                  var3 = 0;
                                  var3 = var3 | var1_int >> 12 & 31;
                                  pi.field_d[var7][2] = p.a(pi.field_d[var7][2], jh.a(31, var3));
                                  var3 = 0;
                                  var3 = var3 | 31 & var1_int >> 18;
                                  pi.field_d[var7][3] = p.a(pi.field_d[var7][3], jh.a(31, var3));
                                  var3 = 0;
                                  var3 = var3 | 31 & var1_int >> 24;
                                  pi.field_d[var7][4] = p.a(pi.field_d[var7][4], jh.a(31, var3));
                                  var3 = 0;
                                  var3 = var3 | (var1_int & -1073741824) >> 30;
                                  pi.field_d[var7][5] = p.a(pi.field_d[var7][5], jh.a(var3, 31));
                                  var3 = 0;
                                  var3 = var3 | 28 & var2 << 2;
                                  pi.field_d[var7][5] = p.a(pi.field_d[var7][5], jh.a(var3, 31));
                                  hk.field_c[var7] = 0;
                                  var3 = 0;
                                  var3 = var3 | var1_int >> 11 & 1;
                                  hk.field_c[var7] = p.a(hk.field_c[var7], jh.a(var3, 1));
                                  var3 = 0;
                                  var3 = var3 | 2 & var1_int >> 22;
                                  hk.field_c[var7] = p.a(hk.field_c[var7], jh.a(2, var3));
                                  var3 = 0;
                                  var3 = var3 | var2 >> 1 & 4;
                                  hk.field_c[var7] = p.a(hk.field_c[var7], jh.a(var3, 4));
                                  var3 = 0;
                                  k.field_b[var7] = 0;
                                  var3 = var3 | 1 & var1_int >> 5;
                                  k.field_b[var7] = p.a(k.field_b[var7], jh.a(var3, 1));
                                  var3 = 0;
                                  var3 = var3 | (var1_int & 2048) >> 10;
                                  k.field_b[var7] = p.a(k.field_b[var7], jh.a(2, var3));
                                  var3 = 0;
                                  var3 = var3 | (131072 & var1_int) >> 15;
                                  k.field_b[var7] = p.a(k.field_b[var7], jh.a(4, var3));
                                  var3 = 0;
                                  var3 = var3 | (var1_int & 8388608) >> 20;
                                  k.field_b[var7] = p.a(k.field_b[var7], jh.a(8, var3));
                                  var3 = 0;
                                  var3 = var3 | (var1_int & 536870912) >> 25;
                                  k.field_b[var7] = p.a(k.field_b[var7], jh.a(var3, 16));
                                  var3 = 0;
                                  var3 = var3 | (var2 & 8) << 2;
                                  var5 += 8;
                                  k.field_b[var7] = p.a(k.field_b[var7], jh.a(var3, 32));
                                  var7++;
                                  continue L2;
                                } else {
                                  pi.field_d[var7][var8] = 0;
                                  var8++;
                                  continue L9;
                                }
                              }
                            } else {
                              L10: {
                                var3 = 0;
                                var4 = 0;
                                if (var8 == 0) {
                                  var4 = 255;
                                  break L10;
                                } else {
                                  if (var8 != 1) {
                                    if (2 == var8) {
                                      var4 = 16711680;
                                      break L10;
                                    } else {
                                      if (var8 == 3) {
                                        var4 = -16777216;
                                        break L10;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  } else {
                                    var4 = 65280;
                                    break L10;
                                  }
                                }
                              }
                              var3 = var3 | hf.field_d[var5 - (-4 - var8)];
                              var2 = var2 | (255 & var3) << var8 * 8 & var4;
                              var8++;
                              continue L8;
                            }
                          }
                        } else {
                          L11: {
                            var3 = 0;
                            var4 = 0;
                            if (0 == var8) {
                              var4 = 255;
                              break L11;
                            } else {
                              if (1 == var8) {
                                var4 = 65280;
                                break L11;
                              } else {
                                if (var8 == 2) {
                                  var4 = 16711680;
                                  break L11;
                                } else {
                                  if (var8 == 3) {
                                    var4 = -16777216;
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                            }
                          }
                          var3 = var3 | hf.field_d[var5 + var8];
                          var1_int = var1_int | var4 & (255 & var3) << 8 * var8;
                          var8++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var1, "jl.F(" + param0 + 41);
        }
    }

    final static String a(int param0, CharSequence param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param0 < -57) {
                break L1;
              } else {
                jl.a((byte) 92);
                break L1;
              }
            }
            L2: {
              var2 = vf.a(116, lg.a(param1, -1));
              if (var2 == null) {
                var2 = "";
                break L2;
              } else {
                break L2;
              }
            }
            stackOut_5_0 = (String) var2;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2_ref;
            stackOut_7_1 = new StringBuilder().append("jl.G(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_6_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "to over <%0> great games";
        field_a = new ka[3];
        field_g = "OK";
        field_f = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
    }
}
