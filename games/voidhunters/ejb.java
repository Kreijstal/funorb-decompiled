/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ejb extends rqa {
    static int field_p;
    static String field_o;

    ejb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        qn var4 = null;
        ifa var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        faa var27 = null;
        long[][] var34 = null;
        int[][] var35 = null;
        L0: {
          var26 = VoidHunters.field_G;
          if (param0 == 1) {
            break L0;
          } else {
            ejb.e(-77);
            break L0;
          }
        }
        L1: {
          var27 = qga.field_b;
          var2 = var27.e((byte) -93);
          if (0 != var2) {
            if ((var2 ^ -1) != -2) {
              gna.a((Throwable) null, "HS1: " + hm.e(-13514), 0);
              ifb.l(-119);
              break L1;
            } else {
              var3 = var27.e(1869);
              var4_ref = (ifa) (Object) hga.field_p.d(param0 + -1);
              L2: while (true) {
                L3: {
                  if (var4_ref == null) {
                    break L3;
                  } else {
                    if (var3 == var4_ref.field_i) {
                      break L3;
                    } else {
                      var4_ref = (ifa) (Object) hga.field_p.a((byte) 10);
                      continue L2;
                    }
                  }
                }
                if (var4_ref == null) {
                  ifb.l(-126);
                  return;
                } else {
                  var4_ref.b(-3846);
                  break L1;
                }
              }
            }
          } else {
            var3 = var27.e(param0 + 1868);
            var4 = (qn) (Object) md.field_j.d(0);
            L4: while (true) {
              L5: {
                if (var4 == null) {
                  break L5;
                } else {
                  if ((var3 ^ -1) == (var4.field_e ^ -1)) {
                    break L5;
                  } else {
                    var4 = (qn) (Object) md.field_j.a((byte) 17);
                    continue L4;
                  }
                }
              }
              if (var4 == null) {
                ifb.l(-116);
                return;
              } else {
                L6: {
                  var5 = var27.e((byte) -97);
                  if (0 != var5) {
                    var6 = var4.field_i;
                    dda.field_d[0].field_b = null;
                    dda.field_d[0].field_a = kca.field_a;
                    var7 = var4.field_g;
                    dda.field_d[0].field_c = false;
                    var8_int = 1;
                    L7: while (true) {
                      if (var8_int >= var5) {
                        var8 = new String[3][var6];
                        var9 = new String[3][var6];
                        var34 = new long[3][var6];
                        var35 = new int[3][var7 * var6];
                        var12 = 0;
                        var13 = 0;
                        var14 = 0;
                        var15 = 0;
                        var16 = 0;
                        var17 = 0;
                        var18 = var27.e((byte) -97);
                        if (0 < var18) {
                          var19 = 0;
                          L8: while (true) {
                            if (var18 <= var19) {
                              break L6;
                            } else {
                              L9: {
                                var20 = var27.e((byte) -114);
                                var21 = dda.field_d[var20].field_a;
                                var22 = var27.k(255);
                                var24 = var27.field_e;
                                if (var19 >= var6) {
                                  break L9;
                                } else {
                                  var8[0][var12] = var21;
                                  var9[0][var12] = dda.field_d[var20].field_b;
                                  var34[0][var12] = var22;
                                  var25 = 0;
                                  L10: while (true) {
                                    if (var7 <= var25) {
                                      var12++;
                                      break L9;
                                    } else {
                                      var15++;
                                      var35[0][var15] = var27.h(mgb.a(param0, 75));
                                      var25++;
                                      continue L10;
                                    }
                                  }
                                }
                              }
                              L11: {
                                if (var21 == null) {
                                  break L11;
                                } else {
                                  if (qja.a((byte) -75, var21)) {
                                    var8[1][var13] = kca.field_a;
                                    var9[1][var13] = null;
                                    var34[1][var13] = var22;
                                    var13++;
                                    var27.field_e = var24;
                                    var25 = 0;
                                    L12: while (true) {
                                      if ((var25 ^ -1) <= (var7 ^ -1)) {
                                        break L11;
                                      } else {
                                        var16++;
                                        var35[1][var16] = var27.h(param0 + 20);
                                        var25++;
                                        continue L12;
                                      }
                                    }
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              L13: {
                                if ((var14 ^ -1) <= (var6 ^ -1)) {
                                  break L13;
                                } else {
                                  if (!dda.field_d[var20].field_c) {
                                    dda.field_d[var20].field_c = true;
                                    var8[2][var14] = var21;
                                    var9[2][var14] = dda.field_d[var20].field_b;
                                    var34[2][var14] = var22;
                                    var14++;
                                    var27.field_e = var24;
                                    var25 = 0;
                                    L14: while (true) {
                                      if ((var25 ^ -1) <= (var7 ^ -1)) {
                                        break L13;
                                      } else {
                                        var17++;
                                        var35[2][var17] = var27.h(21);
                                        var25++;
                                        continue L14;
                                      }
                                    }
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              var19++;
                              continue L8;
                            }
                          }
                        } else {
                          break L6;
                        }
                      } else {
                        L15: {
                          dda.field_d[var8_int].field_a = var27.a(param0 + -2);
                          dda.field_d[var8_int].field_c = false;
                          if (var27.e((byte) -119) == 1) {
                            dda.field_d[var8_int].field_b = var27.a(param0 ^ -2);
                            break L15;
                          } else {
                            dda.field_d[var8_int].field_b = null;
                            break L15;
                          }
                        }
                        var8_int++;
                        continue L7;
                      }
                    }
                  } else {
                    break L6;
                  }
                }
                var4.b(-3846);
                break L1;
              }
            }
          }
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
            return null;
        }
        return new nc((Object) (Object) frb.a(119, 122));
    }

    public static void e(int param0) {
        field_o = null;
        if (param0 <= 92) {
            ejb.a(-87);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "From <%0>: ";
        field_p = 0;
    }
}
