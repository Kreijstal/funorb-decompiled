/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class te {
    static java.util.zip.CRC32 field_a;
    static ib field_d;
    static tk field_c;
    static hj[] field_b;

    final static void a(boolean param0) {
        if (null != kf.field_U) {
            em.a(-29486, false);
            kd.a(en.a(76), param0);
            return;
        }
        kd.a(en.a(76), param0);
    }

    final static int a(int param0, byte param1, int param2) {
        int var5 = HoldTheLine.field_D;
        int var3 = 1;
        int var4 = -15 / ((param1 - 36) / 53);
        while (-2 > (param2 ^ -1)) {
            if (!(0 == (param2 & 1))) {
                var3 = var3 * param0;
            }
            param2 = param2 >> 1;
            param0 = param0 * param0;
        }
        if (!(1 != param2)) {
            return param0 * var3;
        }
        return var3;
    }

    final static void a(int param0, hj[] param1) {
        if (param0 == -4) {
          qk.field_y = param1;
          if (null != qk.field_y) {
            if ((param1.length ^ -1) <= -4) {
              return;
            } else {
              throw new IllegalArgumentException("");
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        field_a = null;
        field_b = null;
        if (param0 != -4) {
            field_a = null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, String param4, boolean param5) {
        int[] var8 = new int[]{(-param0 + 640) / 2 + -15, param0};
        int[] var6 = var8;
        fk.a(var8, new String[1], 122, param5 ? 0 : -1, param3, -1, param1);
        int var7 = 21 / ((param2 - 81) / 32);
    }

    final static void a(java.math.BigInteger param0, java.math.BigInteger param1, th param2, int param3, int param4, int param5, byte[] param6) {
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        L0: {
          var11 = HoldTheLine.field_D;
          var7 = jg.a(-1, param5);
          if (an.field_a != null) {
            var14 = new int[4];
            var13 = var14;
            var8 = var13;
            var9 = 0;
            break L0;
          } else {
            an.field_a = new java.security.SecureRandom();
            var14 = new int[4];
            var13 = var14;
            var8 = var13;
            var9 = 0;
            break L0;
          }
        }
        L1: while (true) {
          if (4 <= var9) {
            if (r.field_d == null) {
              r.field_d = new th(var7);
              r.field_d.field_l = 0;
              r.field_d.a(param5, 13, param6, param3);
              r.field_d.b((byte) 127, var7);
              r.field_d.a(var14, 111);
              if (om.field_n == null) {
                om.field_n = new th(100);
                om.field_n.field_l = 0;
                om.field_n.f(111, 10);
                var12 = 0;
                var9 = var12;
                var10 = 4 / ((param4 - 61) / 43);
                L2: while (true) {
                  if (4 <= var12) {
                    om.field_n.b(-652561784, param5);
                    om.field_n.a(param0, param1, (byte) 114);
                    param2.a(om.field_n.field_l, 19, om.field_n.field_i, 0);
                    param2.a(r.field_d.field_l, 58, r.field_d.field_i, 0);
                    return;
                  } else {
                    om.field_n.a((byte) -58, var14[var12]);
                    var12++;
                    continue L2;
                  }
                }
              } else {
                L3: {
                  if ((om.field_n.field_i.length ^ -1) <= -101) {
                    om.field_n.field_l = 0;
                    om.field_n.f(111, 10);
                    var12 = 0;
                    var9 = var12;
                    var10 = 4 / ((param4 - 61) / 43);
                    break L3;
                  } else {
                    om.field_n = new th(100);
                    om.field_n.field_l = 0;
                    om.field_n.f(111, 10);
                    var12 = 0;
                    var9 = var12;
                    var10 = 4 / ((param4 - 61) / 43);
                    break L3;
                  }
                }
                L4: while (true) {
                  if (4 <= var12) {
                    om.field_n.b(-652561784, param5);
                    om.field_n.a(param0, param1, (byte) 114);
                    param2.a(om.field_n.field_l, 19, om.field_n.field_i, 0);
                    param2.a(r.field_d.field_l, 58, r.field_d.field_i, 0);
                    return;
                  } else {
                    om.field_n.a((byte) -58, var14[var12]);
                    var12++;
                    continue L4;
                  }
                }
              }
            } else {
              if (var7 > r.field_d.field_i.length) {
                r.field_d = new th(var7);
                r.field_d.field_l = 0;
                r.field_d.a(param5, 13, param6, param3);
                r.field_d.b((byte) 127, var7);
                r.field_d.a(var14, 111);
                if (om.field_n != null) {
                  if ((om.field_n.field_i.length ^ -1) <= -101) {
                    om.field_n.field_l = 0;
                    om.field_n.f(111, 10);
                    var12 = 0;
                    var9 = var12;
                    var10 = 4 / ((param4 - 61) / 43);
                    L5: while (true) {
                      if (4 <= var12) {
                        om.field_n.b(-652561784, param5);
                        om.field_n.a(param0, param1, (byte) 114);
                        param2.a(om.field_n.field_l, 19, om.field_n.field_i, 0);
                        param2.a(r.field_d.field_l, 58, r.field_d.field_i, 0);
                        return;
                      } else {
                        om.field_n.a((byte) -58, var14[var12]);
                        var12++;
                        continue L5;
                      }
                    }
                  } else {
                    om.field_n = new th(100);
                    om.field_n.field_l = 0;
                    om.field_n.f(111, 10);
                    var12 = 0;
                    var9 = var12;
                    var10 = 4 / ((param4 - 61) / 43);
                    L6: while (true) {
                      if (4 <= var12) {
                        om.field_n.b(-652561784, param5);
                        om.field_n.a(param0, param1, (byte) 114);
                        param2.a(om.field_n.field_l, 19, om.field_n.field_i, 0);
                        param2.a(r.field_d.field_l, 58, r.field_d.field_i, 0);
                        return;
                      } else {
                        om.field_n.a((byte) -58, var14[var12]);
                        var12++;
                        continue L6;
                      }
                    }
                  }
                } else {
                  om.field_n = new th(100);
                  om.field_n.field_l = 0;
                  om.field_n.f(111, 10);
                  var12 = 0;
                  var9 = var12;
                  var10 = 4 / ((param4 - 61) / 43);
                  L7: while (true) {
                    if (4 <= var12) {
                      om.field_n.b(-652561784, param5);
                      om.field_n.a(param0, param1, (byte) 114);
                      param2.a(om.field_n.field_l, 19, om.field_n.field_i, 0);
                      param2.a(r.field_d.field_l, 58, r.field_d.field_i, 0);
                      return;
                    } else {
                      om.field_n.a((byte) -58, var14[var12]);
                      var12++;
                      continue L7;
                    }
                  }
                }
              } else {
                L8: {
                  L9: {
                    r.field_d.field_l = 0;
                    r.field_d.a(param5, 13, param6, param3);
                    r.field_d.b((byte) 127, var7);
                    r.field_d.a(var14, 111);
                    if (om.field_n == null) {
                      break L9;
                    } else {
                      if ((om.field_n.field_i.length ^ -1) <= -101) {
                        om.field_n.field_l = 0;
                        om.field_n.f(111, 10);
                        var12 = 0;
                        var9 = var12;
                        var10 = 4 / ((param4 - 61) / 43);
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  om.field_n = new th(100);
                  om.field_n.field_l = 0;
                  om.field_n.f(111, 10);
                  var12 = 0;
                  var9 = var12;
                  var10 = 4 / ((param4 - 61) / 43);
                  break L8;
                }
                L10: while (true) {
                  if (4 <= var12) {
                    om.field_n.b(-652561784, param5);
                    om.field_n.a(param0, param1, (byte) 114);
                    param2.a(om.field_n.field_l, 19, om.field_n.field_i, 0);
                    param2.a(r.field_d.field_l, 58, r.field_d.field_i, 0);
                    return;
                  } else {
                    om.field_n.a((byte) -58, var14[var12]);
                    var12++;
                    continue L10;
                  }
                }
              }
            }
          } else {
            var8[var9] = an.field_a.nextInt();
            var9++;
            continue L1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new java.util.zip.CRC32();
    }
}
