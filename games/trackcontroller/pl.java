/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl {
    static il field_b;
    static int[] field_c;
    static String field_d;
    static int[] field_a;

    private final static boolean a(byte param0, CharSequence param1, boolean param2) {
        int var3 = 0;
        int var4 = TrackController.field_F ? 1 : 0;
        if (!ka.a(param1, param2, -2)) {
            return false;
        }
        for (var3 = 0; var3 < param1.length(); var3++) {
            if (!ue.a(-16490, param1.charAt(var3))) {
                return false;
            }
        }
        if (param0 != -110) {
            field_c = null;
            return true;
        }
        return true;
    }

    final static void a(int param0) {
        if (!(null == kb.field_a)) {
            kb.field_a.t(20252);
        }
        ne.field_d = new bk();
        if (param0 != 0) {
            field_d = null;
        }
        re.field_g.b((al) (Object) ne.field_d, -113);
    }

    final static void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        ti var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        aj var6_ref_aj = null;
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
        la var27 = null;
        L0: {
          var26 = TrackController.field_F ? 1 : 0;
          var27 = ne.field_a;
          var2 = var27.h(16383);
          if (-1 == var2) {
            var3 = var27.d((byte) -48);
            var4 = (ti) (Object) ea.field_s.b(2);
            L1: while (true) {
              L2: {
                if (var4 == null) {
                  break L2;
                } else {
                  if (var4.field_i == var3) {
                    break L2;
                  } else {
                    var4 = (ti) (Object) ea.field_s.a(10);
                    continue L1;
                  }
                }
              }
              if (var4 == null) {
                lj.a((byte) 115);
                return;
              } else {
                L3: {
                  var5 = var27.h(16383);
                  if (0 != var5) {
                    var6 = var4.field_l;
                    var7 = var4.field_k;
                    cb.field_c[0].field_f = null;
                    cb.field_c[0].field_h = ue.field_a;
                    cb.field_c[0].field_i = false;
                    var8_int = 1;
                    L4: while (true) {
                      if (var5 <= var8_int) {
                        var4.field_m = new String[3][var6];
                        var8 = new String[3][var6];
                        var9 = new String[3][var6];
                        var4.field_q = new long[3][var6];
                        var10 = new long[3][var6];
                        var4.field_n = new int[3][var6 * var7];
                        var11 = new int[3][var6 * var7];
                        var12 = 0;
                        var13 = 0;
                        var14 = 0;
                        var15 = 0;
                        var16 = 0;
                        var17 = 0;
                        var18 = var27.h(param0 ^ -12815);
                        if (0 >= var18) {
                          break L3;
                        } else {
                          var19 = 0;
                          L5: while (true) {
                            if (var18 <= var19) {
                              break L3;
                            } else {
                              L6: {
                                var20 = var27.h(16383);
                                var21 = cb.field_c[var20].field_h;
                                var22 = var27.f((byte) 38);
                                var24 = var27.field_k;
                                if (var6 > var19) {
                                  var8[0][var12] = var21;
                                  var9[0][var12] = cb.field_c[var20].field_f;
                                  var10[0][var12] = var22;
                                  var12++;
                                  var25 = 0;
                                  L7: while (true) {
                                    if (var7 <= var25) {
                                      break L6;
                                    } else {
                                      var15++;
                                      var11[0][var15] = var27.e((byte) 113);
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
                                  if (!rb.a(false, var21)) {
                                    break L8;
                                  } else {
                                    var8[1][var13] = ue.field_a;
                                    var9[1][var13] = null;
                                    var10[1][var13] = var22;
                                    var13++;
                                    var27.field_k = var24;
                                    var25 = 0;
                                    L9: while (true) {
                                      if (var25 >= var7) {
                                        break L8;
                                      } else {
                                        var16++;
                                        var11[1][var16] = var27.e((byte) 113);
                                        var25++;
                                        continue L9;
                                      }
                                    }
                                  }
                                }
                              }
                              if (var14 < var6) {
                                if (!cb.field_c[var20].field_i) {
                                  cb.field_c[var20].field_i = true;
                                  var8[2][var14] = var21;
                                  var9[2][var14] = cb.field_c[var20].field_f;
                                  var10[2][var14] = var22;
                                  var14++;
                                  var27.field_k = var24;
                                  var25 = 0;
                                  L10: while (true) {
                                    if (var7 > var25) {
                                      var17++;
                                      var11[2][var17] = var27.e((byte) 113);
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
                        cb.field_c[var8_int].field_h = var27.g(0);
                        cb.field_c[var8_int].field_i = false;
                        if (var27.h(param0 + 19953) == 1) {
                          cb.field_c[var8_int].field_f = var27.g(param0 ^ -3570);
                          var8_int++;
                          continue L4;
                        } else {
                          cb.field_c[var8_int].field_f = null;
                          var8_int++;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                var4.field_o = true;
                var4.a(-47);
                break L0;
              }
            }
          } else {
            if (-2 != var2) {
              hb.a((Throwable) null, param0 + 3570, "HS1: " + jc.b(116));
              lj.a((byte) 118);
              break L0;
            } else {
              var3 = var27.d((byte) -127);
              var4_long = var27.f((byte) 108);
              var6_ref_aj = (aj) (Object) ub.field_e.b(2);
              L11: while (true) {
                L12: {
                  if (var6_ref_aj == null) {
                    break L12;
                  } else {
                    if (var6_ref_aj.field_q != var3) {
                      var6_ref_aj = (aj) (Object) ub.field_e.a(param0 ^ -3580);
                      continue L11;
                    } else {
                      break L12;
                    }
                  }
                }
                if (var6_ref_aj == null) {
                  lj.a((byte) 114);
                  return;
                } else {
                  var6_ref_aj.field_j = var4_long;
                  var6_ref_aj.a(-62);
                  break L0;
                }
              }
            }
          }
        }
        L13: {
          if (param0 == -3570) {
            break L13;
          } else {
            field_a = null;
            break L13;
          }
        }
    }

    final static void a(int[] param0, int param1, int param2, int param3, byte[] param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = TrackController.field_F ? 1 : 0;
        if (param1 != 1240830180) {
            return;
        }
        for (var5 = 0; rf.field_a.length > var5; var5++) {
            param3 = rf.field_a[var5];
            var6 = var5 << 1240830180;
            while (true) {
                param3--;
                if (-1 == (param3 ^ -1)) {
                    break;
                }
                var6++;
                param2 = gk.field_b[var6];
                param0[param4[param2]] = param0[param4[param2]] + 1;
                gk.field_b[param0[param4[param2]]] = param2;
            }
        }
    }

    public static void c(int param0) {
        field_b = null;
        field_a = null;
        field_d = null;
        field_c = null;
        if (param0 != -30877) {
            field_b = null;
        }
    }

    final static boolean a(int param0, CharSequence param1) {
        if (param0 <= 37) {
            Object var3 = null;
            pl.a((int[]) null, -51, 81, -104, (byte[]) null);
        }
        return pl.a((byte) -110, param1, false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Updates will sent to the email address you've given";
        field_c = new int[8192];
        field_a = new int[4];
    }
}
