/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg {
    static int field_e;
    static int field_f;
    static String field_c;
    static bd field_a;
    static String field_d;
    static String[] field_b;

    final static void a(byte[] param0, int param1, int param2, int param3, vi param4, java.math.BigInteger param5, java.math.BigInteger param6) {
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        L0: {
          var10 = HostileSpawn.field_I ? 1 : 0;
          var7 = ja.a(7, param2);
          if (hi.field_k == null) {
            hi.field_k = new java.security.SecureRandom();
            break L0;
          } else {
            break L0;
          }
        }
        var15 = new int[4];
        var14 = var15;
        var13 = var14;
        var12 = var13;
        var8 = var12;
        var9 = 0;
        L1: while (true) {
          if (4 <= var9) {
            if (bb.field_f == null) {
              L2: {
                L3: {
                  bb.field_f = new vi(var7);
                  bb.field_f.field_i = 0;
                  bb.field_f.a(param2, param0, true, param3);
                  bb.field_f.g(var7, -122);
                  bb.field_f.a(var15, (byte) 108);
                  if (tb.field_M == null) {
                    break L3;
                  } else {
                    if (-101 < (tb.field_M.field_n.length ^ -1)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                tb.field_M = new vi(100);
                break L2;
              }
              tb.field_M.field_i = 0;
              tb.field_M.d(95, 10);
              var11 = 0;
              var9 = var11;
              if (param1 < -98) {
                L4: while (true) {
                  if (4 <= var11) {
                    tb.field_M.a((byte) -119, param2);
                    tb.field_M.a(param5, 0, param6);
                    param4.a(tb.field_M.field_i, tb.field_M.field_n, true, 0);
                    param4.a(bb.field_f.field_i, bb.field_f.field_n, true, 0);
                    return;
                  } else {
                    tb.field_M.b(var15[var11], 25251);
                    var11++;
                    continue L4;
                  }
                }
              } else {
                return;
              }
            } else {
              if (bb.field_f.field_n.length < var7) {
                bb.field_f = new vi(var7);
                bb.field_f.field_i = 0;
                bb.field_f.a(param2, param0, true, param3);
                bb.field_f.g(var7, -122);
                bb.field_f.a(var15, (byte) 108);
                if (tb.field_M == null) {
                  tb.field_M = new vi(100);
                  tb.field_M.field_i = 0;
                  tb.field_M.d(95, 10);
                  var11 = 0;
                  var9 = var11;
                  if (param1 >= -98) {
                    return;
                  } else {
                    L5: while (true) {
                      if (4 <= var11) {
                        tb.field_M.a((byte) -119, param2);
                        tb.field_M.a(param5, 0, param6);
                        param4.a(tb.field_M.field_i, tb.field_M.field_n, true, 0);
                        param4.a(bb.field_f.field_i, bb.field_f.field_n, true, 0);
                        return;
                      } else {
                        tb.field_M.b(var15[var11], 25251);
                        var11++;
                        continue L5;
                      }
                    }
                  }
                } else {
                  if (-101 < (tb.field_M.field_n.length ^ -1)) {
                    tb.field_M = new vi(100);
                    tb.field_M.field_i = 0;
                    tb.field_M.d(95, 10);
                    var11 = 0;
                    var9 = var11;
                    if (param1 < -98) {
                      L6: while (true) {
                        if (4 <= var11) {
                          tb.field_M.a((byte) -119, param2);
                          tb.field_M.a(param5, 0, param6);
                          param4.a(tb.field_M.field_i, tb.field_M.field_n, true, 0);
                          param4.a(bb.field_f.field_i, bb.field_f.field_n, true, 0);
                          return;
                        } else {
                          tb.field_M.b(var15[var11], 25251);
                          var11++;
                          continue L6;
                        }
                      }
                    } else {
                      return;
                    }
                  } else {
                    tb.field_M.field_i = 0;
                    tb.field_M.d(95, 10);
                    var11 = 0;
                    var9 = var11;
                    if (param1 >= -98) {
                      return;
                    } else {
                      L7: while (true) {
                        if (4 <= var11) {
                          tb.field_M.a((byte) -119, param2);
                          tb.field_M.a(param5, 0, param6);
                          param4.a(tb.field_M.field_i, tb.field_M.field_n, true, 0);
                          param4.a(bb.field_f.field_i, bb.field_f.field_n, true, 0);
                          return;
                        } else {
                          tb.field_M.b(var15[var11], 25251);
                          var11++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
              } else {
                L8: {
                  L9: {
                    bb.field_f.field_i = 0;
                    bb.field_f.a(param2, param0, true, param3);
                    bb.field_f.g(var7, -122);
                    bb.field_f.a(var15, (byte) 108);
                    if (tb.field_M == null) {
                      break L9;
                    } else {
                      if (-101 < (tb.field_M.field_n.length ^ -1)) {
                        break L9;
                      } else {
                        break L8;
                      }
                    }
                  }
                  tb.field_M = new vi(100);
                  break L8;
                }
                tb.field_M.field_i = 0;
                tb.field_M.d(95, 10);
                var11 = 0;
                var9 = var11;
                if (param1 < -98) {
                  L10: while (true) {
                    if (4 <= var11) {
                      tb.field_M.a((byte) -119, param2);
                      tb.field_M.a(param5, 0, param6);
                      param4.a(tb.field_M.field_i, tb.field_M.field_n, true, 0);
                      param4.a(bb.field_f.field_i, bb.field_f.field_n, true, 0);
                      return;
                    } else {
                      tb.field_M.b(var15[var11], 25251);
                      var11++;
                      continue L10;
                    }
                  }
                } else {
                  return;
                }
              }
            }
          } else {
            var8[var9] = hi.field_k.nextInt();
            var9++;
            continue L1;
          }
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != 0) {
          field_a = null;
          field_d = null;
          field_b = null;
          return;
        } else {
          field_d = null;
          field_b = null;
          return;
        }
    }

    final static void a(byte param0, p param1) {
        double var3 = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        oj var14 = null;
        oj var15 = null;
        if (dl.field_l) {
          return;
        } else {
          if (param0 == 64) {
            var15 = mm.field_m[0];
            var3 = jj.a(param1, 1, (p) (Object) var15);
            if (var3 > 16.0) {
              return;
            } else {
              L0: {
                var5 = nh.a(-12149, param1, (p) (Object) var15);
                var7 = 16.0;
                if (-1 != (var15.field_t ^ -1)) {
                  var9 = (double)var15.field_t * Math.cos(3.141592653589793 * var15.field_K / 128.0);
                  var11 = (double)var15.field_t * Math.sin(3.141592653589793 * var15.field_K / 128.0);
                  var9 = var9 + var7 * Math.cos(var5 * 3.141592653589793 / 128.0);
                  var11 = var11 + Math.sin(3.141592653589793 * var5 / 128.0) * var7;
                  var5 = 128.0 * Math.atan2(var11, var9) / 3.141592653589793;
                  var7 = Math.sqrt(var11 * var11 + var9 * var9);
                  break L0;
                } else {
                  break L0;
                }
              }
              var15.field_K = var5;
              var15.field_t = Math.min(16, (int)var7);
              return;
            }
          } else {
            hg.a(-79);
            var14 = mm.field_m[0];
            var3 = jj.a(param1, 1, (p) (Object) var14);
            if (var3 > 16.0) {
              return;
            } else {
              L1: {
                var5 = nh.a(-12149, param1, (p) (Object) var14);
                var7 = 16.0;
                if (-1 != (var14.field_t ^ -1)) {
                  var9 = (double)var14.field_t * Math.cos(3.141592653589793 * var14.field_K / 128.0);
                  var11 = (double)var14.field_t * Math.sin(3.141592653589793 * var14.field_K / 128.0);
                  var9 = var9 + var7 * Math.cos(var5 * 3.141592653589793 / 128.0);
                  var11 = var11 + Math.sin(3.141592653589793 * var5 / 128.0) * var7;
                  var5 = 128.0 * Math.atan2(var11, var9) / 3.141592653589793;
                  var7 = Math.sqrt(var11 * var11 + var9 * var9);
                  break L1;
                } else {
                  break L1;
                }
              }
              var14.field_K = var5;
              var14.field_t = Math.min(16, (int)var7);
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
        field_c = "This password contains your email address, and would be easy to guess";
        field_d = "Back";
        field_b = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}
