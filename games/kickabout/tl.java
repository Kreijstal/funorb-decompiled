/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl {
    static String field_b;
    static r field_c;
    static String[] field_a;

    public static void c(int param0) {
        field_b = null;
        field_c = null;
        field_a = null;
        if (param0 != 0) {
            field_c = null;
        }
    }

    final static int a(int param0) {
        if (param0 >= -115) {
            return -7;
        }
        return lb.field_M;
    }

    final static void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        ni var4 = null;
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
        Object var28 = null;
        ml var29 = null;
        Object var30 = null;
        sm var30_ref = null;
        long[][] var37 = null;
        int[][] var38 = null;
        L0: {
          var30 = null;
          var28 = null;
          var26 = Kickabout.field_G;
          var29 = un.field_e;
          var2 = var29.h((byte) -120);
          if (param0 == 2) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
        L1: {
          if (var2 == 0) {
            var3 = var29.a((byte) 81);
            var4 = (ni) (Object) lw.field_g.g(24009);
            L2: while (true) {
              L3: {
                if (var4 == null) {
                  break L3;
                } else {
                  if (var3 == var4.field_o) {
                    break L3;
                  } else {
                    var4 = (ni) (Object) lw.field_g.c(33);
                    continue L2;
                  }
                }
              }
              if (var4 == null) {
                lr.b((byte) -116);
                return;
              } else {
                L4: {
                  var5 = var29.h((byte) -128);
                  if (-1 == (var5 ^ -1)) {
                    break L4;
                  } else {
                    var6 = var4.field_g;
                    sc.field_F[0].field_d = null;
                    var7 = var4.field_j;
                    sc.field_F[0].field_b = ow.field_e;
                    sc.field_F[0].field_g = false;
                    var8_int = 1;
                    L5: while (true) {
                      if (var8_int >= var5) {
                        var8 = new String[3][var6];
                        var9 = new String[3][var6];
                        var37 = new long[3][var6];
                        var38 = new int[3][var6 * var7];
                        var12 = 0;
                        var13 = 0;
                        var14 = 0;
                        var15 = 0;
                        var16 = 0;
                        var17 = 0;
                        var18 = var29.h((byte) -106);
                        if (0 < var18) {
                          var19 = 0;
                          L6: while (true) {
                            if (var18 <= var19) {
                              break L4;
                            } else {
                              L7: {
                                var20 = var29.h((byte) -118);
                                var21 = sc.field_F[var20].field_b;
                                var22 = var29.i((byte) -124);
                                var24 = var29.field_n;
                                if (var19 < var6) {
                                  var8[0][var12] = var21;
                                  var9[0][var12] = sc.field_F[var20].field_d;
                                  var37[0][var12] = var22;
                                  var12++;
                                  var25 = 0;
                                  L8: while (true) {
                                    if (var25 >= var7) {
                                      break L7;
                                    } else {
                                      int incrementValue$3 = var15;
                                      var15++;
                                      var38[0][incrementValue$3] = var29.k(4);
                                      var25++;
                                      continue L8;
                                    }
                                  }
                                } else {
                                  break L7;
                                }
                              }
                              L9: {
                                if (var21 == null) {
                                  break L9;
                                } else {
                                  if (!hm.a((byte) 78, var21)) {
                                    break L9;
                                  } else {
                                    var8[1][var13] = ow.field_e;
                                    var9[1][var13] = null;
                                    var37[1][var13] = var22;
                                    var13++;
                                    var29.field_n = var24;
                                    var25 = 0;
                                    L10: while (true) {
                                      if (var25 >= var7) {
                                        break L9;
                                      } else {
                                        int incrementValue$4 = var16;
                                        var16++;
                                        var38[1][incrementValue$4] = var29.k(4);
                                        var25++;
                                        continue L10;
                                      }
                                    }
                                  }
                                }
                              }
                              if (var14 < var6) {
                                if (!sc.field_F[var20].field_g) {
                                  sc.field_F[var20].field_g = true;
                                  var8[2][var14] = var21;
                                  var9[2][var14] = sc.field_F[var20].field_d;
                                  var37[2][var14] = var22;
                                  var29.field_n = var24;
                                  var14++;
                                  var25 = 0;
                                  L11: while (true) {
                                    if (var25 < var7) {
                                      int incrementValue$5 = var17;
                                      var17++;
                                      var38[2][incrementValue$5] = var29.k(4);
                                      var25++;
                                      continue L11;
                                    } else {
                                      var19++;
                                      continue L6;
                                    }
                                  }
                                } else {
                                  var19++;
                                  continue L6;
                                }
                              } else {
                                var19++;
                                continue L6;
                              }
                            }
                          }
                        } else {
                          break L4;
                        }
                      } else {
                        sc.field_F[var8_int].field_b = var29.a(param0 ^ 34);
                        sc.field_F[var8_int].field_g = false;
                        if (1 == var29.h((byte) -127)) {
                          sc.field_F[var8_int].field_d = var29.a(-108);
                          var8_int++;
                          continue L5;
                        } else {
                          sc.field_F[var8_int].field_d = null;
                          var8_int++;
                          continue L5;
                        }
                      }
                    }
                  }
                }
                var4.c((byte) -109);
                break L1;
              }
            }
          } else {
            if (var2 == 1) {
              var3 = var29.a((byte) 81);
              var30_ref = (sm) (Object) ia.field_d.g(24009);
              L12: while (true) {
                L13: {
                  if (var30_ref == null) {
                    break L13;
                  } else {
                    if (var3 != var30_ref.field_k) {
                      var28 = (Object) (Object) (sm) (Object) ia.field_d.c(param0 + 31);
                      continue L12;
                    } else {
                      break L13;
                    }
                  }
                }
                if (var28 == null) {
                  lr.b((byte) -116);
                  return;
                } else {
                  ((sm) var28).c((byte) -109);
                  break L1;
                }
              }
            } else {
              bd.a("HS1: " + tr.b(0), (Throwable) null, 1);
              lr.b((byte) -116);
              break L1;
            }
          }
        }
    }

    final static lk a(sb param0, boolean param1) {
        int var2 = 0;
        StringBuilder var3 = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        var6 = Kickabout.field_G;
        if (!param1) {
          int fieldTemp$4 = param0.field_c - 1;
          param0.field_c = param0.field_c - 1;
          var2 = fieldTemp$4;
          var3 = new StringBuilder();
          L0: while (true) {
            L1: {
              if (param0.a((byte) 71)) {
                break L1;
              } else {
                L2: {
                  var4 = param0.b(-59);
                  if (Character.isWhitespace((char) var4)) {
                    break L2;
                  } else {
                    if (var4 == 44) {
                      break L2;
                    } else {
                      if (var4 == 40) {
                        break L2;
                      } else {
                        if (var4 != 41) {
                          StringBuilder discarded$5 = var3.append(var4);
                          continue L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                param0.field_c = param0.field_c - 1;
                break L1;
              }
            }
            L3: {
              L4: {
                var5 = var3.toString();
                if (var5.equals((Object) (Object) "true")) {
                  break L4;
                } else {
                  if (var5.equals((Object) (Object) "false")) {
                    break L4;
                  } else {
                    L5: {
                      if (var5.charAt(0) == 45) {
                        break L5;
                      } else {
                        if (Character.isDigit(var5.charAt(0))) {
                          break L5;
                        } else {
                          var4 = vu.field_Ab;
                          break L3;
                        }
                      }
                    }
                    var4 = pv.field_H;
                    break L3;
                  }
                }
              }
              var4 = ra.field_N;
              break L3;
            }
            return new lk(var4, var2, var5);
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "FORMATION";
        field_c = new r();
    }
}
