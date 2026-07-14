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
        if (-1L > (var4 ^ -1L)) {
            c.a(-127, var4);
        }
        return ((jl) this).a(param1, param0 ^ -24);
    }

    abstract void a(int param0);

    abstract int a(long param0, int param1);

    public static void b(int param0) {
        int var1 = 46 % ((param0 - 25) / 53);
        field_a = null;
        field_b = null;
        field_g = null;
        field_f = null;
        field_d = null;
        field_c = null;
    }

    abstract long c(int param0);

    final static void a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = TorChallenge.field_F ? 1 : 0;
          var5 = 0;
          var6 = 28;
          if (hf.field_d == null) {
            break L0;
          } else {
            if (var6 > hf.field_d.length) {
              break L0;
            } else {
              var7 = 0;
              L1: while (true) {
                if (-4 >= var7) {
                  var1 = 0;
                  var7 = 0;
                  L2: while (true) {
                    if (4 <= var7) {
                      var3 = 0;
                      var7 = 0;
                      L3: while (true) {
                        if (var7 >= 3) {
                          L4: {
                            var3 = var3 | var1 & 31;
                            hd.field_c[0] = p.a(hd.field_c[0], jh.a(var3, 31));
                            if (param0 > 111) {
                              break L4;
                            } else {
                              field_h = 53L;
                              break L4;
                            }
                          }
                          var3 = 0;
                          var3 = var3 | (var1 & 992) >> 165654725;
                          hd.field_c[1] = p.a(hd.field_c[1], jh.a(var3, 31));
                          var3 = 0;
                          var3 = var3 | (var1 & 31744) >> -1439695254;
                          hd.field_c[2] = p.a(hd.field_c[2], jh.a(var3, 31));
                          return;
                        } else {
                          hd.field_c[var7] = 0;
                          var7++;
                          continue L3;
                        }
                      }
                    } else {
                      L5: {
                        var4 = 0;
                        var3 = 0;
                        var3 = var3 | hf.field_d[var5 - -var7];
                        if (-1 == (var7 ^ -1)) {
                          var4 = 255;
                          break L5;
                        } else {
                          if ((var7 ^ -1) == -2) {
                            var4 = 65280;
                            break L5;
                          } else {
                            if ((var7 ^ -1) != -3) {
                              if (var7 == 3) {
                                var4 = -16777216;
                                break L5;
                              } else {
                                var1 = var1 | var4 & (255 & var3) << var7 * 8;
                                var7++;
                                continue L2;
                              }
                            } else {
                              var4 = 16711680;
                              break L5;
                            }
                          }
                        }
                      }
                      var1 = var1 | var4 & (255 & var3) << var7 * 8;
                      var7++;
                      continue L2;
                    }
                  }
                } else {
                  var1 = 0;
                  var8 = 0;
                  L6: while (true) {
                    if (-5 <= var8) {
                      var2 = 0;
                      var8 = 0;
                      L7: while (true) {
                        if (-5 >= var8) {
                          var8 = 0;
                          L8: while (true) {
                            if (5 <= var8) {
                              var3 = 0;
                              var3 = var3 | 31 & var1;
                              pi.field_d[var7][0] = p.a(pi.field_d[var7][0], jh.a(31, var3));
                              var3 = 0;
                              var3 = var3 | 31 & var1 >> 1694637798;
                              pi.field_d[var7][1] = p.a(pi.field_d[var7][1], jh.a(var3, 31));
                              var3 = 0;
                              var3 = var3 | var1 >> -1972835892 & 31;
                              pi.field_d[var7][2] = p.a(pi.field_d[var7][2], jh.a(31, var3));
                              var3 = 0;
                              var3 = var3 | 31 & var1 >> -127324206;
                              pi.field_d[var7][3] = p.a(pi.field_d[var7][3], jh.a(31, var3));
                              var3 = 0;
                              var3 = var3 | 31 & var1 >> -1934140776;
                              pi.field_d[var7][4] = p.a(pi.field_d[var7][4], jh.a(31, var3));
                              var3 = 0;
                              var3 = var3 | (var1 & -1073741824) >> 554067358;
                              pi.field_d[var7][5] = p.a(pi.field_d[var7][5], jh.a(var3, 31));
                              var3 = 0;
                              var3 = var3 | 28 & var2 << -823824190;
                              pi.field_d[var7][5] = p.a(pi.field_d[var7][5], jh.a(var3, 31));
                              hk.field_c[var7] = 0;
                              var3 = 0;
                              var3 = var3 | var1 >> -1176210581 & 1;
                              hk.field_c[var7] = p.a(hk.field_c[var7], jh.a(var3, 1));
                              var3 = 0;
                              var3 = var3 | 2 & var1 >> 582396246;
                              hk.field_c[var7] = p.a(hk.field_c[var7], jh.a(2, var3));
                              var3 = 0;
                              var3 = var3 | var2 >> 488680033 & 4;
                              hk.field_c[var7] = p.a(hk.field_c[var7], jh.a(var3, 4));
                              var3 = 0;
                              k.field_b[var7] = 0;
                              var3 = var3 | 1 & var1 >> 1184433829;
                              k.field_b[var7] = p.a(k.field_b[var7], jh.a(var3, 1));
                              var3 = 0;
                              var3 = var3 | (var1 & 2048) >> -1593412758;
                              k.field_b[var7] = p.a(k.field_b[var7], jh.a(2, var3));
                              var3 = 0;
                              var3 = var3 | (131072 & var1) >> -726796017;
                              k.field_b[var7] = p.a(k.field_b[var7], jh.a(4, var3));
                              var3 = 0;
                              var3 = var3 | (var1 & 8388608) >> -1345642156;
                              k.field_b[var7] = p.a(k.field_b[var7], jh.a(8, var3));
                              var3 = 0;
                              var3 = var3 | (var1 & 536870912) >> 2998521;
                              k.field_b[var7] = p.a(k.field_b[var7], jh.a(var3, 16));
                              var3 = 0;
                              var3 = var3 | (var2 & 8) << -1839608574;
                              var5 += 8;
                              k.field_b[var7] = p.a(k.field_b[var7], jh.a(var3, 32));
                              var7++;
                              continue L1;
                            } else {
                              pi.field_d[var7][var8] = 0;
                              var8++;
                              continue L8;
                            }
                          }
                        } else {
                          L9: {
                            var3 = 0;
                            var4 = 0;
                            if (var8 == 0) {
                              var4 = 255;
                              break L9;
                            } else {
                              if (-2 != var8) {
                                if (2 == var8) {
                                  var4 = 16711680;
                                  break L9;
                                } else {
                                  if ((var8 ^ -1) == -4) {
                                    var4 = -16777216;
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                              } else {
                                var4 = 65280;
                                break L9;
                              }
                            }
                          }
                          var3 = var3 | hf.field_d[var5 - (-4 - var8)];
                          var2 = var2 | (255 & var3) << var8 * 8 & var4;
                          var8++;
                          continue L7;
                        }
                      }
                    } else {
                      L10: {
                        var3 = 0;
                        var4 = 0;
                        if (0 == var8) {
                          var4 = 255;
                          break L10;
                        } else {
                          if (1 == var8) {
                            var4 = 65280;
                            break L10;
                          } else {
                            if (-3 == (var8 ^ -1)) {
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
                          }
                        }
                      }
                      var3 = var3 | hf.field_d[var5 + var8];
                      var1 = var1 | var4 & (255 & var3) << 8 * var8;
                      var8++;
                      continue L6;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static String a(int param0, CharSequence param1) {
        if (param0 >= -57) {
            jl.a((byte) 92);
        }
        String var2 = vf.a(116, lg.a(param1, -1));
        if (!(var2 != null)) {
            var2 = "";
        }
        return var2;
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
