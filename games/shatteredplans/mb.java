/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb extends ml {
    static int[] field_o;
    static int[] field_p;
    static qr field_n;

    final String a(boolean param0, String param1) {
        if (param0) {
            field_o = null;
        }
        if (!(((mb) this).b(-11196, param1) != tj.field_b)) {
            return hr.field_f;
        }
        return null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, nq param11, int param12, int param13, v param14, v param15, int param16, nq param17, int param18, v param19, int param20) {
        tf.a(-86, param17, param16, param11);
        id.a(param20, param5, param3 + 26883, param10, param7);
        eg.b(param2, param8, param3);
        te.a(-4440, param19, param13, param14, param9, param12);
        ad.a(param4, param15, param1, (byte) 106);
        gn.a(param0, param18, false, param6);
    }

    final static int[][] a(ln[] param0, boolean param1) {
        int var2 = 0;
        int[][] var3 = null;
        int var4 = 0;
        int var5 = 0;
        ln[] var5_ref_ln__ = null;
        int var6 = 0;
        ln var7_ref_ln = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[][] var10 = null;
        int[][] var11 = null;
        int[][] var12 = null;
        int[][] var13 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = param0.length;
        var13 = new int[var2][var2];
        var12 = var13;
        var11 = var12;
        var10 = var11;
        var3 = var10;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var2) {
            if (!param1) {
              var4 = 0;
              L1: while (true) {
                if (var2 <= var4) {
                  return var3;
                } else {
                  var5 = 0;
                  L2: while (true) {
                    if (var5 >= var2) {
                      var4++;
                      continue L1;
                    } else {
                      var9 = 0;
                      var6 = var9;
                      L3: while (true) {
                        if (var9 >= var2) {
                          var5++;
                          continue L2;
                        } else {
                          if ((var13[var5][var4] ^ -1) != 0) {
                            if (var13[var4][var9] != -1) {
                              L4: {
                                var7 = var13[var5][var4] - -var13[var4][var9];
                                if (var13[var5][var9] == -1) {
                                  break L4;
                                } else {
                                  if (var7 < var13[var5][var9]) {
                                    break L4;
                                  } else {
                                    var9++;
                                    continue L3;
                                  }
                                }
                              }
                              var13[var5][var9] = var7;
                              var9++;
                              continue L3;
                            } else {
                              var9++;
                              continue L3;
                            }
                          } else {
                            var9++;
                            continue L3;
                          }
                        }
                      }
                    }
                  }
                }
              }
            } else {
              return null;
            }
          } else {
            var5 = 0;
            L5: while (true) {
              if (var2 <= var5) {
                var13[var4][var4] = 0;
                var5_ref_ln__ = param0[var4].field_D;
                var6 = 0;
                L6: while (true) {
                  if (var5_ref_ln__.length <= var6) {
                    var4++;
                    continue L0;
                  } else {
                    var7_ref_ln = var5_ref_ln__[var6];
                    var13[var4][var7_ref_ln.field_p] = 1;
                    var6++;
                    continue L6;
                  }
                }
              } else {
                var13[var4][var5] = -1;
                var5++;
                continue L5;
              }
            }
          }
        }
    }

    mb(go param0) {
        super(param0);
    }

    public static void d(int param0) {
        field_o = null;
        field_p = null;
        field_n = null;
        if (param0 <= 77) {
            field_n = null;
        }
    }

    final u b(int param0, String param1) {
        int var3 = 0;
        CharSequence var4 = null;
        CharSequence var5 = null;
        var4 = (CharSequence) (Object) param1;
        if (go.a(0, var4)) {
          if (param0 == -11196) {
            L0: {
              var5 = (CharSequence) (Object) param1;
              var3 = ma.a(var5, param0 + 11198);
              if (0 >= var3) {
                break L0;
              } else {
                if (130 >= var3) {
                  return p.field_g;
                } else {
                  break L0;
                }
              }
            }
            return tj.field_b;
          } else {
            return null;
          }
        } else {
          return tj.field_b;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new int[]{15000, 9000, 6000, 4500, 3000, 2250, 1500};
    }
}
