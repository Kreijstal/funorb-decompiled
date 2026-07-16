/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh {
    static cg field_c;
    static qc field_a;
    static String field_b;
    static pb field_f;
    static int field_g;
    static int[] field_e;
    static boolean field_d;

    final static bm a(String param0, String param1, pf param2, pf param3, byte param4) {
        int var5 = param3.b(param1, (byte) -118);
        int var6 = param3.a(var5, param0, (byte) -11);
        if (param4 != 63) {
            field_a = null;
        }
        return dd.a(var5, (byte) 115, param3, param2, var6);
    }

    final static void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        hk var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        nf var6_ref_nf = null;
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
        ha var28 = null;
        L0: {
          var26 = stellarshard.field_B;
          var28 = ae.field_N;
          var2 = var28.f(4);
          if (param0 == (var2 ^ -1)) {
            var3 = var28.c((byte) 26);
            var4 = (hk) (Object) id.field_g.b(-114);
            L1: while (true) {
              L2: {
                if (var4 == null) {
                  break L2;
                } else {
                  if (var4.field_t == var3) {
                    break L2;
                  } else {
                    var4 = (hk) (Object) id.field_g.b((byte) 80);
                    continue L1;
                  }
                }
              }
              if (var4 == null) {
                oj.c(-2290);
                return;
              } else {
                L3: {
                  var5 = var28.f(4);
                  if (-1 == (var5 ^ -1)) {
                    break L3;
                  } else {
                    var6 = var4.field_q;
                    hi.field_e[0].field_e = wf.field_b;
                    hi.field_e[0].field_d = null;
                    var7 = var4.field_r;
                    hi.field_e[0].field_a = false;
                    var8_int = 1;
                    L4: while (true) {
                      if (var5 <= var8_int) {
                        String[][] dupTemp$6 = new String[3][var6];
                        var4.field_u = dupTemp$6;
                        var8 = dupTemp$6;
                        var9 = new String[3][var6];
                        long[][] dupTemp$7 = new long[3][var6];
                        var4.field_w = dupTemp$7;
                        var10 = dupTemp$7;
                        int[][] dupTemp$8 = new int[3][var6 * var7];
                        var4.field_o = dupTemp$8;
                        var11 = dupTemp$8;
                        var12 = 0;
                        var13 = 0;
                        var14 = 0;
                        var15 = 0;
                        var16 = 0;
                        var17 = 0;
                        var18 = var28.f(4);
                        if (0 >= var18) {
                          break L3;
                        } else {
                          var19 = 0;
                          L5: while (true) {
                            if (var18 <= var19) {
                              break L3;
                            } else {
                              L6: {
                                var20 = var28.f(4);
                                var21 = hi.field_e[var20].field_e;
                                var22 = var28.d(param0 ^ -1);
                                var24 = var28.field_k;
                                if (var19 < var6) {
                                  var8[0][var12] = var21;
                                  var9[0][var12] = hi.field_e[var20].field_d;
                                  var10[0][var12] = var22;
                                  var25 = 0;
                                  L7: while (true) {
                                    if (var7 <= var25) {
                                      var12++;
                                      break L6;
                                    } else {
                                      int incrementValue$9 = var15;
                                      var15++;
                                      var11[0][incrementValue$9] = var28.b(false);
                                      var25++;
                                      continue L7;
                                    }
                                  }
                                } else {
                                  break L6;
                                }
                              }
                              L8: {
                                if (var21 == null) {
                                  break L8;
                                } else {
                                  if (!hk.a(param0 + 101, var21)) {
                                    break L8;
                                  } else {
                                    var8[1][var13] = wf.field_b;
                                    var9[1][var13] = null;
                                    var10[1][var13] = var22;
                                    var13++;
                                    var28.field_k = var24;
                                    var25 = 0;
                                    L9: while (true) {
                                      if (var25 >= var7) {
                                        break L8;
                                      } else {
                                        int incrementValue$10 = var16;
                                        var16++;
                                        var11[1][incrementValue$10] = var28.b(false);
                                        var25++;
                                        continue L9;
                                      }
                                    }
                                  }
                                }
                              }
                              if (var14 < var6) {
                                if (!hi.field_e[var20].field_a) {
                                  hi.field_e[var20].field_a = true;
                                  var8[2][var14] = var21;
                                  var9[2][var14] = hi.field_e[var20].field_d;
                                  var10[2][var14] = var22;
                                  var14++;
                                  var28.field_k = var24;
                                  var25 = 0;
                                  L10: while (true) {
                                    if (var25 < var7) {
                                      int incrementValue$11 = var17;
                                      var17++;
                                      var11[2][incrementValue$11] = var28.b(false);
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
                        hi.field_e[var8_int].field_e = var28.e((byte) 115);
                        hi.field_e[var8_int].field_a = false;
                        if (1 != var28.f(4)) {
                          hi.field_e[var8_int].field_d = null;
                          var8_int++;
                          continue L4;
                        } else {
                          hi.field_e[var8_int].field_d = var28.e((byte) 117);
                          var8_int++;
                          continue L4;
                        }
                      }
                    }
                  }
                }
                var4.field_s = true;
                var4.c(20);
                break L0;
              }
            }
          } else {
            if ((var2 ^ -1) != -2) {
              qe.a(-121, "HS1: " + bh.b((byte) -106), (Throwable) null);
              oj.c(param0 ^ 2289);
              break L0;
            } else {
              var3 = var28.c((byte) 83);
              var4_long = var28.d(0);
              var6_ref_nf = (nf) (Object) wb.field_f.b(-89);
              L11: while (true) {
                L12: {
                  if (var6_ref_nf == null) {
                    break L12;
                  } else {
                    if (var6_ref_nf.field_u != var3) {
                      var6_ref_nf = (nf) (Object) wb.field_f.b((byte) -22);
                      continue L11;
                    } else {
                      break L12;
                    }
                  }
                }
                if (var6_ref_nf == null) {
                  oj.c(-2290);
                  return;
                } else {
                  var6_ref_nf.field_k = var4_long;
                  var6_ref_nf.c(20);
                  break L0;
                }
              }
            }
          }
        }
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        if (!((param0 ^ -1) != -1)) {
            return 0;
        }
        if (!(-1 <= (param0 ^ -1))) {
            var2 = 1;
            if (!((param0 ^ -1) >= -65536)) {
                param0 = param0 >> 16;
                var2 += 16;
            }
            if (-256 > (param0 ^ -1)) {
                param0 = param0 >> 8;
                var2 += 8;
            }
            if (param0 > 15) {
                param0 = param0 >> 4;
                var2 += 4;
            }
            if (3 < param0) {
                var2 += 2;
                param0 = param0 >> 2;
            }
            if ((param0 ^ -1) < -2) {
                var2++;
                param0 = param0 >> 1;
            }
            return var2;
        }
        if (param1 > -33) {
            eh.a((byte) -13);
        }
        var2 = 2;
        if (param0 < -65536) {
            param0 = param0 >> 16;
            var2 += 16;
        }
        if (255 < (param0 ^ -1)) {
            var2 += 8;
            param0 = param0 >> 8;
        }
        if (!(param0 >= -16)) {
            param0 = param0 >> 4;
            var2 += 4;
        }
        if (3 < (param0 ^ -1)) {
            param0 = param0 >> 2;
            var2 += 2;
        }
        if (!(1 >= (param0 ^ -1))) {
            var2++;
            param0 = param0 >> 1;
        }
        return var2;
    }

    public static void a(byte param0) {
        field_e = null;
        field_c = null;
        field_f = null;
        field_a = null;
        if (param0 != 5) {
            return;
        }
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new cg();
        field_b = "Sound          ";
    }
}
