/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja {
    static String[] field_e;
    int field_d;
    int field_f;
    static fk field_a;
    int field_c;
    int field_g;
    static String field_b;

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 <= 113) {
            field_b = null;
        }
        field_e = null;
    }

    final static void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        ij var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        ik var6_ref_ik = null;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
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
        c var28 = null;
        L0: {
          var26 = EscapeVector.field_A;
          var28 = om.field_g;
          var2 = var28.e(0);
          if (var2 == 0) {
            var3 = var28.f(1952);
            var4 = (ij) (Object) qd.field_n.a(false);
            L1: while (true) {
              L2: {
                if (var4 == null) {
                  break L2;
                } else {
                  if (var4.field_n != var3) {
                    var4 = (ij) (Object) qd.field_n.b((byte) 70);
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (var4 == null) {
                nm.a(16);
                return;
              } else {
                L3: {
                  var5 = var28.e(0);
                  if (var5 != 0) {
                    var6 = var4.field_h;
                    var7 = var4.field_j;
                    bg.field_a[0].field_h = ck.field_r;
                    bg.field_a[0].field_e = false;
                    bg.field_a[0].field_a = null;
                    var8_int = 1;
                    L4: while (true) {
                      if (var5 <= var8_int) {
                        String[][] dupTemp$6 = new String[3][var6];
                        var4.field_m = dupTemp$6;
                        var8 = dupTemp$6;
                        var9 = new String[3][var6];
                        long[][] dupTemp$7 = new long[3][var6];
                        var4.field_k = dupTemp$7;
                        var10 = dupTemp$7;
                        int[][] dupTemp$8 = new int[3][var7 * var6];
                        var4.field_o = dupTemp$8;
                        var11 = dupTemp$8;
                        var12 = 0;
                        var13 = 0;
                        var14 = 0;
                        var15 = 0;
                        var16 = 0;
                        var17 = 0;
                        var18 = var28.e(0);
                        if ((var18 ^ -1) >= -1) {
                          break L3;
                        } else {
                          var19 = 0;
                          L5: while (true) {
                            if (var18 <= var19) {
                              break L3;
                            } else {
                              L6: {
                                var20 = var28.e(0);
                                var21 = bg.field_a[var20].field_h;
                                var22 = var28.i(-800509813);
                                var24 = var28.field_m;
                                if (var6 <= var19) {
                                  break L6;
                                } else {
                                  var8[0][var12] = var21;
                                  var9[0][var12] = bg.field_a[var20].field_a;
                                  var10[0][var12] = var22;
                                  var25 = 0;
                                  L7: while (true) {
                                    if (var7 <= var25) {
                                      var12++;
                                      break L6;
                                    } else {
                                      int incrementValue$9 = var15;
                                      var15++;
                                      var11[0][incrementValue$9] = var28.g(-5053);
                                      var25++;
                                      continue L7;
                                    }
                                  }
                                }
                              }
                              L8: {
                                if (var21 == null) {
                                  break L8;
                                } else {
                                  if (!ic.a(var21, (byte) 112)) {
                                    break L8;
                                  } else {
                                    var8[1][var13] = ck.field_r;
                                    var9[1][var13] = null;
                                    var10[1][var13] = var22;
                                    var28.field_m = var24;
                                    var13++;
                                    var25 = 0;
                                    L9: while (true) {
                                      if (var25 >= var7) {
                                        break L8;
                                      } else {
                                        int incrementValue$10 = var16;
                                        var16++;
                                        var11[1][incrementValue$10] = var28.g(-5053);
                                        var25++;
                                        continue L9;
                                      }
                                    }
                                  }
                                }
                              }
                              if (var14 < var6) {
                                if (!bg.field_a[var20].field_e) {
                                  bg.field_a[var20].field_e = true;
                                  var8[2][var14] = var21;
                                  var9[2][var14] = bg.field_a[var20].field_a;
                                  var10[2][var14] = var22;
                                  var28.field_m = var24;
                                  var14++;
                                  var25 = 0;
                                  L10: while (true) {
                                    if (var25 < var7) {
                                      int incrementValue$11 = var17;
                                      var17++;
                                      var11[2][incrementValue$11] = var28.g(-5053);
                                      var25++;
                                      continue L10;
                                    } else {
                                      var19++;
                                      continue L5;
                                    }
                                  }
                                } else {
                                  var19++;
                                  continue L5;
                                }
                              } else {
                                var19++;
                                continue L5;
                              }
                            }
                          }
                        }
                      } else {
                        bg.field_a[var8_int].field_h = var28.c(false);
                        bg.field_a[var8_int].field_e = false;
                        if (var28.e(0) != 1) {
                          bg.field_a[var8_int].field_a = null;
                          var8_int++;
                          continue L4;
                        } else {
                          bg.field_a[var8_int].field_a = var28.c(false);
                          var8_int++;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                var4.field_l = true;
                var4.c((byte) -90);
                break L0;
              }
            }
          } else {
            if (-2 != (var2 ^ -1)) {
              pf.a(false, "HS1: " + hf.b((byte) 115), (Throwable) null);
              nm.a(16);
              break L0;
            } else {
              var3 = var28.f(1952);
              var4_long = var28.i(-800509813);
              var6_ref_ik = (ik) (Object) vj.field_d.a(false);
              L11: while (true) {
                L12: {
                  if (var6_ref_ik == null) {
                    break L12;
                  } else {
                    if (var6_ref_ik.field_i != var3) {
                      var6_ref_ik = (ik) (Object) vj.field_d.b((byte) 70);
                      continue L11;
                    } else {
                      break L12;
                    }
                  }
                }
                if (var6_ref_ik != null) {
                  var6_ref_ik.field_l = var4_long;
                  var6_ref_ik.c((byte) -85);
                  break L0;
                } else {
                  nm.a(16);
                  return;
                }
              }
            }
          }
        }
        var3 = -111 / ((-41 - param0) / 43);
    }

    final static d a(String param0, boolean param1) {
        if (di.field_g.b(0)) {
            if (!(param0.equals((Object) (Object) di.field_g.a(-100)))) {
                di.field_g = vn.a((byte) 83, param0);
            }
        }
        if (!param1) {
            return null;
        }
        return di.field_g;
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new String[]{"original", "classic", "retribution", "simulator"};
        field_b = "Previous";
        field_a = new fk(2);
    }
}
