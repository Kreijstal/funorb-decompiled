/*
 * Decompiled by CFR-JS 0.4.0.
 */
class pg {
    static boolean field_d;
    pg field_b;
    long field_e;
    static kc field_c;
    static sd field_f;
    pg field_a;

    final boolean b(byte param0) {
        if (!(null != this.field_a)) {
            return false;
        }
        if (param0 > -31) {
            pg.b(-104);
        }
        return true;
    }

    final void a(boolean param0) {
        boolean discarded$0 = false;
        if (this.field_a == null) {
            return;
        }
        this.field_a.field_b = this.field_b;
        this.field_b.field_a = this.field_a;
        if (!param0) {
            discarded$0 = this.b((byte) 71);
        }
        this.field_a = null;
        this.field_b = null;
    }

    public static void c(byte param0) {
        field_f = null;
        if (param0 != -115) {
            pg.b(117);
        }
        field_c = null;
    }

    final static void b(int param0) {
        String[][] dupTemp$2 = null;
        int[][] dupTemp$3 = null;
        RuntimeException var1 = null;
        int var2 = 0;
        nk var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ab var13 = null;
        int var14 = 0;
        int var15 = 0;
        ab var16 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var12 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var13 = df.field_z;
              var16 = var13;
              if (param0 <= -37) {
                break L1;
              } else {
                pg.c((byte) -12);
                break L1;
              }
            }
            var2 = var16.e((byte) -118);
            var3 = (nk) ((Object) pe.field_Lb.b(12623));
            L2: while (true) {
              L3: {
                if (var3 == null) {
                  break L3;
                } else {
                  if (var2 == var3.field_p) {
                    break L3;
                  } else {
                    var3 = (nk) ((Object) pe.field_Lb.a(0));
                    continue L2;
                  }
                }
              }
              if (var3 != null) {
                L4: {
                  var4 = var16.e((byte) -97);
                  if (var4 != 0) {
                    var5 = var3.field_t;
                    bb.field_i[0] = ah.field_b;
                    var6_int = 1;
                    L5: while (true) {
                      if (var6_int >= var4) {
                        se.a((byte) -33, var4, var5);
                        var6_int = 0;
                        L6: while (true) {
                          if (var4 <= var6_int) {
                            bi.a((byte) -113, var5);
                            dupTemp$2 = new String[2][var5];
                            var3.field_r = dupTemp$2;
                            var6 = dupTemp$2;
                            dupTemp$3 = new int[2][4 * var5];
                            var3.field_l = dupTemp$3;
                            var7 = dupTemp$3;
                            var8 = je.field_b;
                            var9 = 0;
                            var10 = 0;
                            L7: while (true) {
                              if (var9 >= var8) {
                                var14 = 0;
                                var9 = var14;
                                var15 = 0;
                                var10 = var15;
                                L8: while (true) {
                                  if (var14 >= var8) {
                                    break L4;
                                  } else {
                                    L9: {
                                      var11 = ki.field_r[var14 + var5];
                                      var6[1][var15] = bb.field_i[var11];
                                      var7[1][4 * var15] = nf.field_z[var11];
                                      var7[1][1 + var15 * 4] = hc.field_e[var11];
                                      var7[1][var15 * 4 - -2] = tj.field_u[var11];
                                      var7[1][4 * var15 - -3] = ba.field_o[var11];
                                      if (!je.a(16, bb.field_i[var11])) {
                                        break L9;
                                      } else {
                                        if (hc.field_e[var11] + tj.field_u[var11] + ba.field_o[var11] != 0) {
                                          break L9;
                                        } else {
                                          var6[1][var15] = null;
                                          var15--;
                                          break L9;
                                        }
                                      }
                                    }
                                    var14++;
                                    var15++;
                                    continue L8;
                                  }
                                }
                              } else {
                                L10: {
                                  var11 = ki.field_r[var9];
                                  var6[0][var10] = bb.field_i[var11];
                                  var7[0][4 * var10] = nf.field_z[var11];
                                  var7[0][var10 * 4 + 1] = hc.field_e[var11];
                                  var7[0][4 * var10 + 2] = tj.field_u[var11];
                                  var7[0][3 + var10 * 4] = ba.field_o[var11];
                                  if (je.a(16, bb.field_i[var11])) {
                                    if (-1 == (tj.field_u[var11] + hc.field_e[var11] - -ba.field_o[var11] ^ -1)) {
                                      var6[0][var10] = null;
                                      var10--;
                                      break L10;
                                    } else {
                                      break L10;
                                    }
                                  } else {
                                    break L10;
                                  }
                                }
                                var10++;
                                var9++;
                                continue L7;
                              }
                            }
                          } else {
                            L11: {
                              je.a(123, var16);
                              if (0 == var6_int) {
                                var3.field_h = fo.field_a;
                                var3.field_k = kj.field_c;
                                var3.field_i = qj.field_g;
                                var3.field_s = oc.field_j;
                                wk.a(-1, kj.field_c, var6_int, fo.field_a, qj.field_g, oc.field_j);
                                break L11;
                              } else {
                                wk.a(-1, kj.field_c, var6_int, fo.field_a, qj.field_g, oc.field_j);
                                break L11;
                              }
                            }
                            var6_int++;
                            continue L6;
                          }
                        }
                      } else {
                        bb.field_i[var6_int] = var13.l(-1);
                        var6_int++;
                        continue L5;
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                var3.field_g = true;
                var3.a(true);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                ka.b(false);
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "pg.OC(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
    }
}
