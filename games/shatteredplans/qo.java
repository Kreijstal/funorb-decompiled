/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qo {
    static int field_b;
    static int field_a;
    static int[] field_c;
    ha[] field_d;
    static ln field_e;

    final int a(byte param0, int param1) {
        ha var4 = null;
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        int var3 = 0;
        if (param0 < 43) {
            qo.a(55);
        }
        while (((qo) this).field_d.length > var3) {
            var4 = ((qo) this).field_d[var3];
            if (var4.field_b.length > param1) {
                return var3;
            }
            param1 = param1 - (var4.field_b.length - 1);
            var3++;
        }
        return ((qo) this).field_d.length;
    }

    final static void a(int param0, int param1) {
        int var2 = (kh.field_Mb - 640) / 2;
        int var3 = ed.field_f * ed.field_f;
        int var4 = var3 - param1 * param1;
        if (param0 != 22353) {
            field_b = 102;
        }
        am.field_xb.a(199, gf.field_k + -120 - 94, (byte) 109, 90, var2 - 199 * var4 / var3);
        pf.field_g.a(438, -124 + gf.field_k, (byte) 77, 0, 438 * var4 / var3 + var2 + 202);
    }

    public static void a(int param0) {
        field_c = null;
        field_e = null;
        int var1 = -47 % ((param0 - -43) / 59);
    }

    final int b(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 438) {
          L0: {
            L1: {
              if (null == ((qo) this).field_d) {
                break L1;
              } else {
                if (-1 <= (((qo) this).field_d.length ^ -1)) {
                  break L1;
                } else {
                  stackOut_4_0 = ((qo) this).field_d[((qo) this).field_d.length + -1].field_c - ((qo) this).field_d[0].field_e;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0;
        } else {
          return 23;
        }
    }

    final int c(int param0) {
        int var2 = 0;
        ha[] var3_ref_ha__ = null;
        int var3 = 0;
        int var4 = 0;
        ha var5 = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = ShatteredPlansClient.field_F ? 1 : 0;
          var2 = -1;
          if (null == ((qo) this).field_d) {
            break L0;
          } else {
            var3_ref_ha__ = ((qo) this).field_d;
            var4 = 0;
            L1: while (true) {
              if (var3_ref_ha__.length <= var4) {
                break L0;
              } else {
                var5 = var3_ref_ha__[var4];
                if (var5 != null) {
                  var6 = var5.b(35);
                  if (var6 > var2) {
                    var2 = var6;
                    var4++;
                    continue L1;
                  } else {
                    var4++;
                    continue L1;
                  }
                } else {
                  var4++;
                  continue L1;
                }
              }
            }
          }
        }
        var3 = -49 % ((param0 - 25) / 59);
        return var2;
    }

    final int a(int param0, int param1, int param2, String param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 == -28135) {
          var5 = 0;
          var6 = 0;
          var7 = param3.length();
          var8 = 0;
          L0: while (true) {
            if (var7 <= var8) {
              if ((var5 ^ -1) < -1) {
                return (param1 + -param2 << 1998035880) / var5;
              } else {
                return 0;
              }
            } else {
              var9 = param3.charAt(var8);
              if (var9 == 60) {
                var6 = 1;
                var8++;
                continue L0;
              } else {
                if (var9 != 62) {
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
          return 43;
        }
    }

    final int a(int param0, int param1, int param2) {
        int var5 = 0;
        ha var6 = null;
        int var7 = 0;
        int var8 = ShatteredPlansClient.field_F ? 1 : 0;
        if (((qo) this).field_d != null) {
            // ifeq L36
            // if_icmpgt L36
        } else {
            return -1;
        }
        if (!(((qo) this).field_d[((qo) this).field_d.length + -1].field_c >= param2)) {
            return -1;
        }
        if (!((((qo) this).field_d.length ^ -1) != -2)) {
            return ((qo) this).field_d[0].a(false, param0);
        }
        int var4 = 0;
        if (param1 != 3357) {
            int discarded$0 = ((qo) this).b(-63);
        }
        for (var5 = 0; var5 < ((qo) this).field_d.length; var5++) {
            var6 = ((qo) this).field_d[var5];
            if (param2 >= var6.field_e) {
                if (var6.field_c >= param2) {
                    var7 = var6.a(false, param0);
                    if (!((var7 ^ -1) != 0)) {
                        return -1;
                    }
                    return var4 - -var7;
                }
            }
            var4 = var4 + (-1 + var6.field_b.length);
        }
        return -1;
    }

    final int a(boolean param0, int param1) {
        ha var5 = null;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        ha[] var3 = ((qo) this).field_d;
        int var4 = 0;
        if (!param0) {
            field_c = null;
        }
        while (var3.length > var4) {
            var5 = var3[var4];
            if (var5.field_b.length > param1) {
                return var5.field_b[param1];
            }
            param1 = param1 - (var5.field_b.length + -1);
            var4++;
        }
        return 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[8192];
    }
}
