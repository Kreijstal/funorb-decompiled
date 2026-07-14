/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi {
    static String field_b;
    static ua field_a;
    static long field_c;

    final static void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        u var4_ref = null;
        int var4 = 0;
        int var5_int = 0;
        hp var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        ga var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        u var14 = null;
        int[] var15 = null;
        Object var16 = null;
        u var16_ref = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        var16 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        var11 = s.field_e;
        if (param0 >= 101) {
          var2 = var11.g(31365);
          var3 = var11.g(31365);
          if (var2 != 0) {
            if (-2 == (var2 ^ -1)) {
              var4 = var11.h(22219);
              var5 = (hp) (Object) mh.field_l.c(83);
              L0: while (true) {
                if (var5 != null) {
                  L1: {
                    if (var5.field_v != var3) {
                      break L1;
                    } else {
                      if (var4 != var5.field_f) {
                        break L1;
                      } else {
                        if (var5 == null) {
                          ak.a((byte) -117);
                          return;
                        } else {
                          var5.a(true);
                          return;
                        }
                      }
                    }
                  }
                  var5 = (hp) (Object) mh.field_l.b(6);
                  continue L0;
                } else {
                  if (var5 == null) {
                    ak.a((byte) -117);
                    return;
                  } else {
                    var5.a(true);
                    return;
                  }
                }
              }
            } else {
              bd.a("LR1: " + ci.a(0), (Throwable) null, false);
              ak.a((byte) -115);
              return;
            }
          } else {
            var16_ref = (u) (Object) cp.field_T.c(83);
            if (var16_ref == null) {
              ak.a((byte) -119);
              return;
            } else {
              L2: {
                var5_int = -var11.field_j + hd.field_q;
                var19 = var16_ref.field_h;
                var17 = var19;
                var13 = var17;
                var12 = var13;
                var6 = var12;
                if (var19.length << -287634078 >= var5_int) {
                  break L2;
                } else {
                  var5_int = var19.length << 313760258;
                  break L2;
                }
              }
              var7 = 0;
              L3: while (true) {
                if (var5_int <= var7) {
                  var16_ref.a(true);
                  return;
                } else {
                  var6[var7 >> -1599527294] = var6[var7 >> -1599527294] + (var11.g(31365) << tq.b(768, var7 << -1960051192));
                  var7++;
                  continue L3;
                }
              }
            }
          }
        } else {
          var9 = null;
          qi.a(31, false, (java.math.BigInteger) null, 54, (java.math.BigInteger) null, (byte[]) null, (k) null);
          var2 = var11.g(31365);
          var3 = var11.g(31365);
          if (var2 != 0) {
            if (-2 == (var2 ^ -1)) {
              var4 = var11.h(22219);
              var5 = (hp) (Object) mh.field_l.c(83);
              L4: while (true) {
                if (var5 != null) {
                  L5: {
                    if (var5.field_v != var3) {
                      break L5;
                    } else {
                      if (var4 != var5.field_f) {
                        break L5;
                      } else {
                        if (var5 == null) {
                          ak.a((byte) -117);
                          return;
                        } else {
                          var5.a(true);
                          return;
                        }
                      }
                    }
                  }
                  var5 = (hp) (Object) mh.field_l.b(6);
                  continue L4;
                } else {
                  if (var5 == null) {
                    ak.a((byte) -117);
                    return;
                  } else {
                    var5.a(true);
                    return;
                  }
                }
              }
            } else {
              bd.a("LR1: " + ci.a(0), (Throwable) null, false);
              ak.a((byte) -115);
              return;
            }
          } else {
            var14 = (u) (Object) cp.field_T.c(83);
            var4_ref = var14;
            if (var14 == null) {
              ak.a((byte) -119);
              return;
            } else {
              L6: {
                var5_int = -var11.field_j + hd.field_q;
                var18 = var14.field_h;
                var15 = var18;
                var13 = var15;
                var12 = var13;
                var6 = var12;
                if (var18.length << -287634078 >= var5_int) {
                  break L6;
                } else {
                  var5_int = var18.length << 313760258;
                  break L6;
                }
              }
              var7 = 0;
              L7: while (true) {
                if (var5_int <= var7) {
                  var14.a(true);
                  return;
                } else {
                  var6[var7 >> -1599527294] = var6[var7 >> -1599527294] + (var11.g(31365) << tq.b(768, var7 << -1960051192));
                  var7++;
                  continue L7;
                }
              }
            }
          }
        }
    }

    final static void a(int param0, java.awt.Canvas param1) {
        eo.a((java.awt.Component) (Object) param1, 11);
        if (param0 == 100) {
          so.a((java.awt.Component) (Object) param1, 127);
          if (null != ll.field_a) {
            ll.field_a.a((byte) 127, (java.awt.Component) (Object) param1);
            return;
          } else {
            return;
          }
        } else {
          qi.b((byte) 52);
          so.a((java.awt.Component) (Object) param1, 127);
          if (null == ll.field_a) {
            return;
          } else {
            ll.field_a.a((byte) 127, (java.awt.Component) (Object) param1);
            return;
          }
        }
    }

    final static void a(boolean param0) {
        fb.a(4, 102);
        if (param0) {
            qi.b((byte) -45);
        }
    }

    public static void b(byte param0) {
        field_a = null;
        field_b = null;
        if (param0 != -17) {
            qi.a((byte) -34);
        }
    }

    final static void a(int param0, boolean param1, java.math.BigInteger param2, int param3, java.math.BigInteger param4, byte[] param5, k param6) {
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
          var10 = ZombieDawnMulti.field_E ? 1 : 0;
          var7 = vj.b(param1, param3);
          if (null == kf.field_j) {
            kf.field_j = new java.security.SecureRandom();
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
            L2: {
              if (null == so.field_k) {
                so.field_k = new k(var7);
                break L2;
              } else {
                if (so.field_k.field_m.length >= var7) {
                  break L2;
                } else {
                  so.field_k = new k(var7);
                  break L2;
                }
              }
            }
            L3: {
              so.field_k.field_j = 0;
              so.field_k.a(param5, param3, param0, 114);
              so.field_k.b(var7, (byte) 119);
              so.field_k.a(0, var15);
              if (null == l.field_e) {
                l.field_e = new k(100);
                l.field_e.field_j = 0;
                l.field_e.a(-30, 10);
                var11 = 0;
                var9 = var11;
                break L3;
              } else {
                if (-101 < (l.field_e.field_m.length ^ -1)) {
                  l.field_e = new k(100);
                  l.field_e.field_j = 0;
                  l.field_e.a(-30, 10);
                  var11 = 0;
                  var9 = var11;
                  break L3;
                } else {
                  l.field_e.field_j = 0;
                  l.field_e.a(-30, 10);
                  var11 = 0;
                  var9 = var11;
                  break L3;
                }
              }
            }
            L4: while (true) {
              if (4 <= var11) {
                l.field_e.a(param3, (byte) -82);
                l.field_e.a(param4, -2628, param2);
                param6.a(l.field_e.field_m, l.field_e.field_j, 0, 127);
                param6.a(so.field_k.field_m, so.field_k.field_j, 0, 122);
                return;
              } else {
                l.field_e.b(-128, var15[var11]);
                var11++;
                continue L4;
              }
            }
          } else {
            var8[var9] = kf.field_j.nextInt();
            var9++;
            continue L1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Your request to join has been declined.";
    }
}
