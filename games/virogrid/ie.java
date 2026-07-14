/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ie {
    ri[] field_d;
    static float field_e;
    static String field_b;
    static kf field_a;
    static String field_c;

    public static void b(int param0) {
        field_c = null;
        if (param0 != 0) {
            ie.a(81, -82, 22, -52, -108, 64);
        }
        field_a = null;
        field_b = null;
    }

    final int a(byte param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 20) {
            break L0;
          } else {
            ie.a(-6, -99, 20, 28, 4, 1);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((ie) this).field_d) {
              break L2;
            } else {
              if ((((ie) this).field_d.length ^ -1) < -1) {
                stackOut_6_0 = -((ie) this).field_d[0].field_c + ((ie) this).field_d[-1 + ((ie) this).field_d.length].field_b;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0;
    }

    final int b(int param0, int param1) {
        int var3 = 0;
        ri var4 = null;
        int var5 = Virogrid.field_F ? 1 : 0;
        for (var3 = param1; var3 < ((ie) this).field_d.length; var3++) {
            var4 = ((ie) this).field_d[var3];
            if (param0 < var4.field_d.length) {
                return var3;
            }
            param0 = param0 - (var4.field_d.length - 1);
        }
        return ((ie) this).field_d.length;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = Virogrid.field_F ? 1 : 0;
        fd.field_B = new int[param5];
        o.field_d = new int[param0];
        int var6 = 0;
        if (param2 != 28476) {
            field_e = 1.0884095430374146f;
        }
        while (var6 < param0) {
            var7 = -param3 + (500 + -(param1 * var6));
            var8 = param1 * var6 + param3 + 140;
            o.field_d[var6] = var8;
            o.field_d[var6] = var7;
            var6++;
        }
        int var10 = 0;
        var6 = var10;
        while (var10 < param5) {
            var7 = -(var10 * param1) + 370 + -param4;
            fd.field_B[var10] = var7;
            var10++;
        }
    }

    final static vh a(boolean param0, int param1, int param2, eh param3, eh param4) {
        if (param0) {
            return null;
        }
        if (!hn.a(param3, param2, param1, (byte) 109)) {
            return null;
        }
        return jf.a(param4.a(param2, param1, 0), 20);
    }

    final int a(int param0, int param1) {
        int var4 = 0;
        ri var5 = null;
        int var6 = Virogrid.field_F ? 1 : 0;
        ri[] var7 = ((ie) this).field_d;
        ri[] var3 = var7;
        if (param1 != -1) {
            field_c = null;
        }
        for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (!(var5.field_d.length <= param0)) {
                return var5.field_d[param0];
            }
            param0 = param0 - (var5.field_d.length + -1);
        }
        return 0;
    }

    final int a(String param0, int param1, boolean param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Virogrid.field_F ? 1 : 0;
        if (param2) {
          var5 = 0;
          var6 = 0;
          var7 = param0.length();
          var8 = 0;
          L0: while (true) {
            if (var8 >= var7) {
              if (var5 <= 0) {
                return 0;
              } else {
                return (param3 - param1 << -2060076376) / var5;
              }
            } else {
              var9 = param0.charAt(var8);
              if (var9 == 60) {
                var6 = 1;
                var8++;
                continue L0;
              } else {
                if (62 != var9) {
                  if (var6 == 0) {
                    if (var9 == 32) {
                      var5++;
                      var8++;
                      continue L0;
                    } else {
                      var8++;
                      continue L0;
                    }
                  } else {
                    var8++;
                    continue L0;
                  }
                } else {
                  var6 = 0;
                  var8++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return 28;
        }
    }

    final int a(int param0) {
        int var2 = 0;
        ri[] var3 = null;
        int var4 = 0;
        ri var5 = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Virogrid.field_F ? 1 : 0;
          if (param0 == 3209) {
            break L0;
          } else {
            int discarded$2 = ((ie) this).a(-28, -45);
            break L0;
          }
        }
        L1: {
          var2 = -1;
          if (((ie) this).field_d != null) {
            var3 = ((ie) this).field_d;
            var4 = 0;
            L2: while (true) {
              if (var3.length <= var4) {
                break L1;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  var6 = var5.a(-1);
                  if (var6 > var2) {
                    var2 = var6;
                    var4++;
                    continue L2;
                  } else {
                    var4++;
                    continue L2;
                  }
                } else {
                  var4++;
                  continue L2;
                }
              }
            }
          } else {
            break L1;
          }
        }
        return var2;
    }

    final int a(byte param0, int param1, int param2) {
        int var5 = 0;
        ri var7 = null;
        int var8 = 0;
        int var9 = Virogrid.field_F ? 1 : 0;
        if (((ie) this).field_d != null) {
            // if_icmpeq L39
            // if_icmplt L39
        } else {
            return -1;
        }
        if (((ie) this).field_d[-1 + ((ie) this).field_d.length].field_b < param1) {
            return -1;
        }
        if (-2 == (((ie) this).field_d.length ^ -1)) {
            return ((ie) this).field_d[0].a((byte) 89, param2);
        }
        int var4 = 0;
        int var6 = -97 / ((-46 - param0) / 56);
        for (var5 = 0; var5 < ((ie) this).field_d.length; var5++) {
            var7 = ((ie) this).field_d[var5];
            if (var7.field_c <= param1) {
                if (!(param1 > var7.field_b)) {
                    var8 = var7.a((byte) 119, param2);
                    if (!(0 != (var8 ^ -1))) {
                        return -1;
                    }
                    return var8 + var4;
                }
            }
            var4 = var4 + (-1 + var7.field_d.length);
        }
        return -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "<%2>'s turn - playing <%0> (<%1>)";
        field_c = "Visit the Account Management section on the main site to view.";
    }
}
