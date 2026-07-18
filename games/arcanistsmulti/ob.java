/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ob extends vi {
    static je field_hb;
    private int field_U;
    private int field_W;
    private int field_fb;
    static String[] field_bb;
    static String field_ib;
    private int field_gb;
    static String field_X;
    static am field_eb;
    static dj field_T;
    static v field_Y;
    static int field_ab;
    private int field_cb;
    private int field_Z;
    static ll[] field_db;

    void e(boolean param0) {
        if (param0) {
            ((ob) this).a(-67, (byte) -5, -121);
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        int var5 = 58 / ((param1 - 76) / 32);
        if (param2 <= 0) {
            ((ob) this).a(param0, 0, param3);
            return;
        }
        ((ob) this).field_cb = param2;
        ((ob) this).field_W = ((ob) this).field_k;
        ((ob) this).field_gb = param3;
        ((ob) this).field_U = param0;
        ((ob) this).field_fb = ((ob) this).field_v;
        ((ob) this).field_Z = 0;
    }

    final static void j(byte param0) {
        int var1 = 0;
        if (si.field_l > 32) {
            var1 = si.field_l % 32;
            if (!(var1 != 0)) {
                var1 = 32;
            }
            mf.a(si.field_l + -var1, 21298);
        } else {
            mf.a(0, 21298);
        }
    }

    void a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var16 = ArcanistsMulti.field_G ? 1 : 0;
        de.c(6 + param0, 35 + param2, ((ob) this).field_v + -12, -40 + ((ob) this).field_k, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        var7 = 0;
        var8 = param2;
        L0: while (true) {
          if (var4 <= var7) {
            L1: {
              var5 = 194;
              var6 = 169;
              var4 = 22;
              if (param1 == -117) {
                break L1;
              } else {
                ((ob) this).e(false);
                break L1;
              }
            }
            var7 = 0;
            var8 = param2 + 35;
            L2: while (true) {
              if (var4 <= var7) {
                ci.field_e.c(-90 + (param0 + ((ob) this).field_v), 10 + param2);
                dd.a(2, 35 + param2, fk.field_g, ((ob) this).field_v + -10, 5 + param0);
                dd.a(param1 ^ -119, param2 - -((ob) this).field_k + -22, vi.field_E, ((ob) this).field_v, param0);
                var4 = ((ob) this).field_k - 79;
                var6 = 127;
                var5 = 169;
                var7 = 0;
                var8 = 57 + param2;
                L3: while (true) {
                  if (var7 >= var4) {
                    return;
                  } else {
                    var9 = (var6 + -var5) * var7 / var4 + var5;
                    var9 = var9 | (var9 << 8 | var9 << 16);
                    de.f(param0, var8, 6, var9);
                    de.f(((ob) this).field_v + (param0 - 6), var8, 6, var9);
                    var8++;
                    var7++;
                    continue L3;
                  }
                }
              } else {
                var9 = var5 - -(var7 * (-var5 + var6) / var4);
                var9 = var9 | (var9 << 8 | var9 << 16);
                de.f(param0, var8, 6, var9);
                de.f(((ob) this).field_v + (param0 + -6), var8, 6, var9);
                var7++;
                var8++;
                continue L2;
              }
            }
          } else {
            if (de.field_c <= var8) {
              if (de.field_k > var8) {
                L4: {
                  var9 = var7 * (var6 - var5) / var4 + var5;
                  var10 = 0;
                  var11 = ((ob) this).field_v;
                  if (var7 > 20) {
                    break L4;
                  } else {
                    L5: while (true) {
                      if (20 < var10) {
                        break L4;
                      } else {
                        var12 = (-var7 + 20) * (20 - var7) - -((-var10 + 20) * (-var10 + 20));
                        if (var12 <= 462) {
                          if (var12 >= 420) {
                            var13 = (462 - var12) * var9 / 42;
                            var13 = var13 | (var13 << 8 | var13 << 16);
                            de.field_l[de.field_e * var8 + param0 + var10] = var13;
                            var10++;
                            continue L5;
                          } else {
                            break L4;
                          }
                        } else {
                          var10++;
                          continue L5;
                        }
                      }
                    }
                  }
                }
                L6: {
                  if (20 >= var7) {
                    var12 = var11;
                    var11 -= 21;
                    var13 = 0;
                    L7: while (true) {
                      L8: {
                        if (20 < var13) {
                          break L8;
                        } else {
                          var14 = (20 + -var7) * (-var7 + 20) + var13 * var13;
                          if (var14 > 462) {
                            break L8;
                          } else {
                            if (420 <= var14) {
                              var15 = var9 * (462 + -var14) / 42;
                              var15 = var15 | (var15 << 16 | var15 << 8);
                              de.field_l[var11 + (de.field_e * var8 - -param0)] = var15;
                              var11++;
                              var13++;
                              continue L7;
                            } else {
                              var12 = var11 - -1;
                              var11++;
                              var13++;
                              continue L7;
                            }
                          }
                        }
                      }
                      var11 = var12;
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
                var9 = var9 | (var9 << 16 | var9 << 8);
                de.f(param0 + var10, var8, -var10 + var11, var9);
                var7++;
                var8++;
                continue L0;
              } else {
                var7++;
                var8++;
                continue L0;
              }
            } else {
              var7++;
              var8++;
              continue L0;
            }
          }
        }
    }

    public static void f(boolean param0) {
        field_Y = null;
        field_hb = null;
        field_db = null;
        field_ib = null;
        field_X = null;
        field_bb = null;
        field_eb = null;
        field_T = null;
    }

    boolean a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var5 = 0;
        int var4 = 0;
        if (((ob) this).field_cb <= 0) {
        } else {
            var2 = ((ob) this).field_U;
            var3 = ((ob) this).field_gb;
            int fieldTemp$0 = ((ob) this).field_Z + 1;
            ((ob) this).field_Z = ((ob) this).field_Z + 1;
            if (fieldTemp$0 < ((ob) this).field_cb) {
                var4 = (((ob) this).field_cb * 2 + -((ob) this).field_Z) * ((ob) this).field_Z;
                var5 = ((ob) this).field_cb * ((ob) this).field_cb;
                var3 = (((ob) this).field_gb - ((ob) this).field_W) * var4 / var5 + ((ob) this).field_W;
                var2 = var4 * (-((ob) this).field_fb + ((ob) this).field_U) / var5 + ((ob) this).field_fb;
            } else {
                ((ob) this).field_cb = 0;
                ((ob) this).e(false);
            }
            ((ob) this).a(var2, 0, var3);
        }
        return super.a((byte) 107);
    }

    ob(h param0, int param1, int param2) {
        super(param0, param1, param2);
        ((ob) this).field_cb = 0;
        ((ob) this).field_Z = 0;
    }

    boolean g(byte param0) {
        ((ob) this).a(109);
        return super.g((byte) 45);
    }

    void a(int param0) {
        if (param0 < 89) {
            return;
        }
        if (0 >= ((ob) this).field_cb) {
            return;
        }
        ((ob) this).a(((ob) this).field_U, 0, ((ob) this).field_gb);
        ((ob) this).field_cb = 0;
        ((ob) this).e(false);
    }

    final static void a(int param0, ge param1, int param2) {
        try {
            he.field_e.b((byte) -98, 58);
            he.field_e.f(param2, (byte) -7);
            he.field_e.c(param1.field_o, (byte) -109);
            he.field_e.c(param1.field_j, (byte) -101);
            he.field_e.c(param1.field_q, (byte) -56);
            he.field_e.c(param1.field_s, (byte) -79);
            he.field_e.c(param1.field_k, (byte) -113);
            he.field_e.f(param1.field_m, (byte) -111);
            he.field_e.f(param1.field_h, (byte) -124);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ob.KA(" + 20 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_hb = new je();
        field_ib = "Player";
        field_ab = 0;
        field_Y = null;
        field_X = "DRAGON MASTER - ";
    }
}
