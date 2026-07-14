/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg extends br {
    static th field_i;
    static java.awt.Frame field_m;
    static cj field_f;
    private th field_k;
    private int field_g;
    static ul field_n;
    static String field_j;
    private int field_h;
    static boolean field_l;

    final void a(int param0) {
        if (param0 != -1) {
            field_f = null;
        }
        ((cg) this).a(true);
    }

    final void b(boolean param0) {
        int var3 = ZombieDawnMulti.field_E ? 1 : 0;
        rq var4 = (rq) (Object) ((cg) this).field_k.c(125);
        while (var4 != null) {
            var4.a((byte) 95);
            var4 = (rq) (Object) ((cg) this).field_k.b(6);
        }
        if (param0) {
            cg.a(80, -116, 26L);
        }
    }

    final boolean a(byte param0, int param1, int param2) {
        int var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 < 54) {
            return true;
        }
        rq var6 = (rq) (Object) ((cg) this).field_k.c(87);
        while (var6 != null) {
            if (!(!var6.a(param1, (byte) 5, param2))) {
                return true;
            }
            var6 = (rq) (Object) ((cg) this).field_k.b(6);
        }
        return false;
    }

    final static void a(int param0, int param1, long param2) {
        ga var4 = ma.field_a;
        var4.b((byte) -35, param0);
        if (param1 != -27404) {
            cg.a(-60, -93, 81L);
        }
        var4.field_j = var4.field_j + 1;
        int var5 = var4.field_j;
        var4.a(-59, 7);
        var4.a(param2, true);
        var4.e(29, -var5 + var4.field_j);
    }

    cg(int param0, int param1, int param2) {
        ((cg) this).field_h = param1;
        ((cg) this).field_g = param2;
        if (oq.field_u != null) {
            ((cg) this).a((byte) 108);
        }
    }

    public static void c(byte param0) {
        if (param0 > -33) {
            cg.c((byte) -103);
        }
        field_m = null;
        field_j = null;
        field_f = null;
        field_n = null;
        field_i = null;
    }

    final void a(nm param0, int param1) {
        int var5 = ZombieDawnMulti.field_E ? 1 : 0;
        int var3 = 81 / ((param1 - -32) / 51);
        rq var4 = (rq) (Object) ((cg) this).field_k.c(123);
        while (var4 != null) {
            var4.a(param0, (byte) -75);
            var4 = (rq) (Object) ((cg) this).field_k.b(6);
        }
    }

    final boolean a(gm param0, boolean param1) {
        int var6 = ZombieDawnMulti.field_E ? 1 : 0;
        int var3 = param0.g(73);
        if (param1) {
            field_l = true;
        }
        int var4 = param0.h(81);
        rq var5 = (rq) (Object) ((cg) this).field_k.c(80);
        while (var5 != null) {
            if (var5.a(var4, (byte) 111, var3)) {
                return true;
            }
            var5 = (rq) (Object) ((cg) this).field_k.b(6);
        }
        return false;
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        boolean[][] var4 = null;
        int var5 = 0;
        boolean[][] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        boolean[][] var10_ref_boolean____ = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        boolean[][] var15 = null;
        int var16 = 0;
        boolean[][] var17 = null;
        boolean[][] var18 = null;
        boolean[][] var19 = null;
        boolean[][] var20 = null;
        var14 = ZombieDawnMulti.field_E ? 1 : 0;
        if (((cg) this).field_k != null) {
          return;
        } else {
          var2 = ((cg) this).field_h / 24;
          var3 = ((cg) this).field_g / 24;
          var5 = 109 / ((param0 - 55) / 47);
          var20 = new boolean[1 + 2 * wn.field_t][1 + 2 * wn.field_t];
          var19 = var20;
          var18 = var19;
          var17 = var18;
          var15 = var17;
          var4 = var15;
          var6 = new boolean[var20.length][var20[0].length];
          var7 = -wn.field_t + var2;
          var8 = var3 - wn.field_t;
          var15[wn.field_t][wn.field_t] = true;
          var9 = 0;
          L0: while (true) {
            if (var9 >= wn.field_t) {
              ((cg) this).field_k = new th();
              var9 = 0;
              L1: while (true) {
                if (var9 >= var4.length) {
                  return;
                } else {
                  var16 = 0;
                  var10 = var16;
                  L2: while (true) {
                    if (var4[0].length <= var16) {
                      var9++;
                      continue L1;
                    } else {
                      var11 = var7 + var16;
                      var12 = var9 + var8;
                      var13 = (var3 + -var12) * (var3 - var12) + (var2 + -var11) * (var2 - var11);
                      if (var13 < 81) {
                        if (var4[var9][var16]) {
                          ((cg) this).field_k.a((br) (Object) new rq(var11, var12, var13), false);
                          var16++;
                          continue L2;
                        } else {
                          var16++;
                          continue L2;
                        }
                      } else {
                        var16++;
                        continue L2;
                      }
                    }
                  }
                }
              }
            } else {
              var10 = 0;
              L3: while (true) {
                if (var10 >= var4.length) {
                  var10_ref_boolean____ = var4;
                  var4 = var6;
                  var6 = var10_ref_boolean____;
                  var9++;
                  continue L0;
                } else {
                  var11 = 0;
                  L4: while (true) {
                    if (var11 >= var4[0].length) {
                      var10++;
                      continue L3;
                    } else {
                      var12 = var11 + var7;
                      var13 = var8 + var10;
                      if ((var12 ^ -1) < -1) {
                        if (var13 > 0) {
                          if (oq.field_u[0].length > var12) {
                            if (oq.field_u.length > var13) {
                              if (-1 != (oq.field_u[var13][var12] & 1 ^ -1)) {
                                L5: {
                                  if (var4[var10][var11]) {
                                    break L5;
                                  } else {
                                    L6: {
                                      if (0 >= var11) {
                                        break L6;
                                      } else {
                                        if (var4[var10][-1 + var11]) {
                                          break L5;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                    L7: {
                                      if ((var10 ^ -1) >= -1) {
                                        break L7;
                                      } else {
                                        if (var4[-1 + var10][var11]) {
                                          break L5;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                    L8: {
                                      if (var11 >= -1 + var4[0].length) {
                                        break L8;
                                      } else {
                                        if (var4[var10][var11 - -1]) {
                                          break L5;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                    if (var10 < var4.length - 1) {
                                      if (var4[var10 + 1][var11]) {
                                        break L5;
                                      } else {
                                        var11++;
                                        continue L4;
                                      }
                                    } else {
                                      var11++;
                                      continue L4;
                                    }
                                  }
                                }
                                var6[var10][var11] = true;
                                var11++;
                                continue L4;
                              } else {
                                var11++;
                                continue L4;
                              }
                            } else {
                              var11++;
                              continue L4;
                            }
                          } else {
                            var11++;
                            continue L4;
                          }
                        } else {
                          var11++;
                          continue L4;
                        }
                      } else {
                        var11++;
                        continue L4;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Rating";
    }
}
