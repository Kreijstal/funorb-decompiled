/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qlb implements dja {
    static int field_a;

    public final tv a(byte param0) {
        int var2 = -87 / ((param0 - -64) / 50);
        return null;
    }

    final static Object[] a(Object[] param0, Object param1, dja param2, boolean param3, boolean param4, int param5) {
        tv[] var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        tv[] var12 = null;
        int var13 = 0;
        iu var14 = null;
        iu var15 = null;
        L0: {
          var10 = VoidHunters.field_G;
          if (param5 == 1) {
            break L0;
          } else {
            ((boolean[]) param0[0])[0] = ((boolean[]) param0[0])[1];
            break L0;
          }
        }
        L1: {
          if (param0 == null) {
            break L1;
          } else {
            if (-1 != (param0.length ^ -1)) {
              L2: {
                L3: {
                  if (param3) {
                    var6_int = 0;
                    L4: while (true) {
                      if (var6_int >= param0.length) {
                        var12 = param2.a(11995, param0.length - -1);
                        var6 = var12;
                        var7 = 0;
                        var15 = (iu) param1;
                        var9 = 0;
                        L5: while (true) {
                          if (param0.length <= var9) {
                            break L3;
                          } else {
                            if (var15.a(param0[var9], true) <= 0) {
                              break L3;
                            } else {
                              var7++;
                              var9++;
                              continue L5;
                            }
                          }
                        }
                      } else {
                        if (param1 != param0[var6_int]) {
                          var6_int++;
                          continue L4;
                        } else {
                          return param0;
                        }
                      }
                    }
                  } else {
                    var12 = param2.a(11995, param0.length - -1);
                    var6 = var12;
                    if (!param4) {
                      var13 = 0;
                      var7 = var13;
                      L6: while (true) {
                        if (param0.length <= var13) {
                          var6[param0.length] = (tv) (Object) param0;
                          break L2;
                        } else {
                          var12[var13] = (tv) param0[var13];
                          var13++;
                          continue L6;
                        }
                      }
                    } else {
                      var7 = 0;
                      var14 = (iu) param1;
                      var9 = 0;
                      L7: while (true) {
                        if (param0.length <= var9) {
                          break L3;
                        } else {
                          if (var14.a(param0[var9], true) <= 0) {
                            break L3;
                          } else {
                            var7++;
                            var9++;
                            continue L7;
                          }
                        }
                      }
                    }
                  }
                }
                var9 = 0;
                L8: while (true) {
                  if (var9 >= var7) {
                    var6[var7] = (tv) (Object) param0;
                    var9 = var7;
                    L9: while (true) {
                      if (var9 >= param0.length) {
                        break L2;
                      } else {
                        var6[1 + var9] = (tv) param0[var9];
                        var9++;
                        continue L9;
                      }
                    }
                  } else {
                    var6[var9] = (tv) param0[var9];
                    var9++;
                    continue L8;
                  }
                }
              }
              return (Object[]) (Object) var6;
            } else {
              break L1;
            }
          }
        }
        var6 = param2.a(11995, 1);
        var6 = var6;
        var6[0] = (tv) (Object) param0;
        return (Object[]) (Object) var6;
    }

    final static void b(byte param0) {
        if (param0 != -75) {
            qlb.b((byte) 0);
        }
        kl.a(vpa.b((byte) -119), 0);
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            field_a = -48;
        }
        return (tv[]) (Object) new dmb[param1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
    }
}
