/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj extends hc {
    static hh field_N;
    private static int[] field_K;
    static int[][] field_E;
    private static int[] field_P;
    private static int[] field_O;
    private el field_F;
    static int field_M;
    private static int[] field_I;
    private int field_R;
    static int field_G;
    static ed field_Q;
    static n field_L;

    final void a(int param0, int param1, int param2, hm param3) {
        ((oj) this).field_R = ((oj) this).field_R + 1;
        super.a(param0, param1, param2, param3);
    }

    public static void e(byte param0) {
        field_K = null;
        field_N = null;
        field_O = null;
        field_Q = null;
        field_E = null;
        field_P = null;
        field_I = null;
        if (param0 != 113) {
          field_N = null;
          field_L = null;
          return;
        } else {
          field_L = null;
          return;
        }
    }

    final boolean a(int param0, hm param1) {
        if (param0 != -4659) {
            field_P = null;
            return false;
        }
        return false;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        rf var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ed var14 = null;
        ed var15 = null;
        ed var16 = null;
        ed var17 = null;
        ed var18 = null;
        ed var23 = null;
        ed var24 = null;
        ed var25 = null;
        var11 = EscapeVector.field_A;
        super.a(param0, (byte) 101, param2, param3);
        if (param1 >= 85) {
          if (param2 != 0) {
            return;
          } else {
            L0: {
              var5 = ((oj) this).field_k + param3 + (((oj) this).field_g >> -86772895);
              var6 = ((oj) this).field_j + param0 - -(((oj) this).field_x >> -1490929535);
              var8 = ((oj) this).field_F.a(17124);
              if (var8 == of.field_f) {
                break L0;
              } else {
                if (ug.field_c == var8) {
                  break L0;
                } else {
                  if (ob.field_a != var8) {
                    if (df.field_h == var8) {
                      var23 = ul.field_E[1];
                      var23.c(-(var23.field_s >> -429218591) + var5, var6 + -(var23.field_x >> -1172708191), 256);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    var24 = ul.field_E[2];
                    var24.c(var5 + -(var24.field_s >> -1406410079), var6 + -(var24.field_x >> -880059167), 256);
                    return;
                  }
                }
              }
            }
            var25 = ul.field_E[0];
            var9 = var25.field_A << -798013407;
            var10 = var25.field_z << -2116837599;
            if (pi.field_j != null) {
              if (pi.field_j.field_s >= var9) {
                if (var10 <= pi.field_j.field_x) {
                  eo.a(pi.field_j, (byte) -79);
                  em.d();
                  var25.b(112, 144, var25.field_A << 187351172, var25.field_z << -1578871420, -((oj) this).field_R << -43194902, 4096);
                  dl.a((byte) 116);
                  pi.field_j.c(var5 - var25.field_A, -var25.field_z + var6, 256);
                  return;
                } else {
                  pi.field_j = new ed(var9, var10);
                  eo.a(pi.field_j, (byte) -111);
                  var25.b(112, 144, var25.field_A << 187351172, var25.field_z << -1578871420, -((oj) this).field_R << -43194902, 4096);
                  dl.a((byte) 116);
                  pi.field_j.c(var5 - var25.field_A, -var25.field_z + var6, 256);
                  return;
                }
              } else {
                pi.field_j = new ed(var9, var10);
                eo.a(pi.field_j, (byte) -111);
                var25.b(112, 144, var25.field_A << 187351172, var25.field_z << -1578871420, -((oj) this).field_R << -43194902, 4096);
                dl.a((byte) 116);
                pi.field_j.c(var5 - var25.field_A, -var25.field_z + var6, 256);
                return;
              }
            } else {
              pi.field_j = new ed(var9, var10);
              eo.a(pi.field_j, (byte) -111);
              var25.b(112, 144, var25.field_A << 187351172, var25.field_z << -1578871420, -((oj) this).field_R << -43194902, 4096);
              dl.a((byte) 116);
              pi.field_j.c(var5 - var25.field_A, -var25.field_z + var6, 256);
              return;
            }
          }
        } else {
          field_I = null;
          if (param2 != 0) {
            return;
          } else {
            var5 = ((oj) this).field_k + param3 + (((oj) this).field_g >> -86772895);
            var6 = ((oj) this).field_j + param0 - -(((oj) this).field_x >> -1490929535);
            var8 = ((oj) this).field_F.a(17124);
            if (var8 != of.field_f) {
              if (ug.field_c != var8) {
                if (ob.field_a != var8) {
                  if (df.field_h == var8) {
                    var17 = ul.field_E[1];
                    var17.c(-(var17.field_s >> -429218591) + var5, var6 + -(var17.field_x >> -1172708191), 256);
                    return;
                  } else {
                    return;
                  }
                } else {
                  var18 = ul.field_E[2];
                  var18.c(var5 + -(var18.field_s >> -1406410079), var6 + -(var18.field_x >> -880059167), 256);
                  return;
                }
              } else {
                L1: {
                  L2: {
                    var16 = ul.field_E[0];
                    var14 = var16;
                    var9 = var16.field_A << -798013407;
                    var10 = var16.field_z << -2116837599;
                    if (pi.field_j == null) {
                      break L2;
                    } else {
                      if (pi.field_j.field_s < var9) {
                        break L2;
                      } else {
                        if (var10 > pi.field_j.field_x) {
                          break L2;
                        } else {
                          eo.a(pi.field_j, (byte) -79);
                          em.d();
                          break L1;
                        }
                      }
                    }
                  }
                  pi.field_j = new ed(var9, var10);
                  eo.a(pi.field_j, (byte) -111);
                  break L1;
                }
                var16.b(112, 144, var16.field_A << 187351172, var16.field_z << -1578871420, -((oj) this).field_R << -43194902, 4096);
                dl.a((byte) 116);
                pi.field_j.c(var5 - var16.field_A, -var16.field_z + var6, 256);
                return;
              }
            } else {
              L3: {
                L4: {
                  var15 = ul.field_E[0];
                  var9 = var15.field_A << -798013407;
                  var10 = var15.field_z << -2116837599;
                  if (pi.field_j == null) {
                    break L4;
                  } else {
                    if (pi.field_j.field_s < var9) {
                      break L4;
                    } else {
                      if (var10 > pi.field_j.field_x) {
                        break L4;
                      } else {
                        eo.a(pi.field_j, (byte) -79);
                        em.d();
                        break L3;
                      }
                    }
                  }
                }
                pi.field_j = new ed(var9, var10);
                eo.a(pi.field_j, (byte) -111);
                break L3;
              }
              var15.b(112, 144, var15.field_A << 187351172, var15.field_z << -1578871420, -((oj) this).field_R << -43194902, 4096);
              dl.a((byte) 116);
              pi.field_j.c(var5 - var15.field_A, -var15.field_z + var6, 256);
              return;
            }
          }
        }
    }

    final static void a(int param0, int param1, byte param2, String param3) {
        fh.field_g.a(param3, param1 - 1, -1 + param0, 0, -1, 64);
        fh.field_g.a(param3, param1 - -1, -1 + param0, 0, -1, 64);
        fh.field_g.a(param3, -1 + param1, param0 - -1, 0, -1, 64);
        fh.field_g.a(param3, 1 + param1, param0 - -1, 0, -1, 64);
        fh.field_g.b(param3, param1, param0, 16777215, -1);
        int var4 = -103 / ((param2 - 7) / 46);
    }

    final static int[] k(int param0) {
        if (param0 != 64) {
            return null;
        }
        if (!(null == bk.field_r)) {
            return bk.field_r.d(param0 + 31240);
        }
        return null;
    }

    final static void a(byte param0) {
        if (!mj.a((byte) 93)) {
            return;
        }
        sn.a(4, 0, false);
        if (param0 < 79) {
            field_Q = null;
        }
    }

    final String d(int param0) {
        if (param0 != 1) {
            return null;
        }
        if (!((oj) this).field_u) {
            return null;
        }
        return ((oj) this).field_F.b(param0 ^ 64);
    }

    oj(el param0) {
        ((oj) this).field_F = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = new int[]{4, 4, 4, 4};
        field_O = new int[]{1, 4, 4, 4, 4};
        field_M = -1;
        field_P = field_O;
        field_I = new int[]{1, 4, 4, 4, 4};
        field_E = new int[][]{field_O, field_P, field_I, field_K};
    }
}
