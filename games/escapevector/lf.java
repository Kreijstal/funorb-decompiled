/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf extends ue {
    static String field_G;
    private ed field_M;
    static ed field_I;
    private int field_O;
    static int field_H;
    private el field_N;
    static String field_J;
    private String field_L;
    static byte[] field_K;

    lf(el param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (db) (Object) gl.c(true));
        ((lf) this).field_L = param1;
        ((lf) this).field_N = param0;
        ((lf) this).a(param4, param3, param2, true, param5);
    }

    final void a(int param0, byte param1, int param2, int param3) {
        String var5 = null;
        rf var6 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var17 = null;
        Object var18 = null;
        ed var19 = null;
        ed var20 = null;
        ed var21 = null;
        ed var22 = null;
        Object var23 = null;
        ed var24 = null;
        ed var25 = null;
        ed var26 = null;
        ed var27 = null;
        ao var28 = null;
        ao var29 = null;
        var18 = null;
        var23 = null;
        var13 = EscapeVector.field_A;
        var6 = ((lf) this).field_N.a(17124);
        if (of.field_f != var6) {
          L0: {
            L1: {
              L2: {
                if (ug.field_c != var6) {
                  var5 = ((lf) this).field_N.b(44);
                  if (var5 == null) {
                    var5 = ((lf) this).field_L;
                    break L2;
                  } else {
                    if (!var5.equals((Object) (Object) ((lf) this).field_l)) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                } else {
                  var5 = fj.field_bb;
                  break L2;
                }
              }
              if (!var5.equals((Object) (Object) ((lf) this).field_l)) {
                break L1;
              } else {
                break L0;
              }
            }
            ((lf) this).field_l = var5;
            ((lf) this).k(0);
            break L0;
          }
          super.a(param0, (byte) 109, param2, param3);
          var6 = ((lf) this).field_N.a(17124);
          var29 = (ao) (Object) ((lf) this).field_s;
          var9 = param3 - -((lf) this).field_k;
          var10 = var29.a((hm) this, param0, -16956) - -(var29.b((hm) this, 90).c(0) >> -974182559);
          if (param1 > 85) {
            if (of.field_f == var6) {
              var25 = ul.field_E[0];
              var11 = var25.field_A << -1966556351;
              var12 = var25.field_z << 1145816513;
              if (((lf) this).field_M != null) {
                if (var11 <= ((lf) this).field_M.field_s) {
                  if (var12 <= ((lf) this).field_M.field_x) {
                    eo.a(((lf) this).field_M, (byte) -7);
                    em.d();
                    var25.b(112, 144, var25.field_A << -1605119068, var25.field_z << -195294684, -((lf) this).field_O << 1599618826, 4096);
                    dl.a((byte) 120);
                    ((lf) this).field_M.c(-(var25.field_A >> 420622369) + var9, -var25.field_z + var10, 256);
                    return;
                  } else {
                    ((lf) this).field_M = new ed(var11, var12);
                    eo.a(((lf) this).field_M, (byte) -84);
                    var25.b(112, 144, var25.field_A << -1605119068, var25.field_z << -195294684, -((lf) this).field_O << 1599618826, 4096);
                    dl.a((byte) 120);
                    ((lf) this).field_M.c(-(var25.field_A >> 420622369) + var9, -var25.field_z + var10, 256);
                    return;
                  }
                } else {
                  ((lf) this).field_M = new ed(var11, var12);
                  eo.a(((lf) this).field_M, (byte) -84);
                  var25.b(112, 144, var25.field_A << -1605119068, var25.field_z << -195294684, -((lf) this).field_O << 1599618826, 4096);
                  dl.a((byte) 120);
                  ((lf) this).field_M.c(-(var25.field_A >> 420622369) + var9, -var25.field_z + var10, 256);
                  return;
                }
              } else {
                ((lf) this).field_M = new ed(var11, var12);
                eo.a(((lf) this).field_M, (byte) -84);
                var25.b(112, 144, var25.field_A << -1605119068, var25.field_z << -195294684, -((lf) this).field_O << 1599618826, 4096);
                dl.a((byte) 120);
                ((lf) this).field_M.c(-(var25.field_A >> 420622369) + var9, -var25.field_z + var10, 256);
                return;
              }
            } else {
              if (var6 != ug.field_c) {
                if (ob.field_a != var6) {
                  if (df.field_h == var6) {
                    var26 = ul.field_E[1];
                    var26.c(var9, -(var26.field_x >> 1526982145) + var10, 256);
                    return;
                  } else {
                    return;
                  }
                } else {
                  var27 = ul.field_E[2];
                  var27.c(var9, -(var27.field_x >> 18734081) + var10, 256);
                  return;
                }
              } else {
                var24 = ul.field_E[0];
                var11 = var24.field_A << -1966556351;
                var12 = var24.field_z << 1145816513;
                if (((lf) this).field_M == null) {
                  ((lf) this).field_M = new ed(var11, var12);
                  eo.a(((lf) this).field_M, (byte) -84);
                  var24.b(112, 144, var24.field_A << -1605119068, var24.field_z << -195294684, -((lf) this).field_O << 1599618826, 4096);
                  dl.a((byte) 120);
                  ((lf) this).field_M.c(-(var24.field_A >> 420622369) + var9, -var24.field_z + var10, 256);
                  return;
                } else {
                  L3: {
                    L4: {
                      if (var11 > ((lf) this).field_M.field_s) {
                        break L4;
                      } else {
                        if (var12 > ((lf) this).field_M.field_x) {
                          break L4;
                        } else {
                          eo.a(((lf) this).field_M, (byte) -7);
                          em.d();
                          break L3;
                        }
                      }
                    }
                    ((lf) this).field_M = new ed(var11, var12);
                    eo.a(((lf) this).field_M, (byte) -84);
                    break L3;
                  }
                  var24.b(112, 144, var24.field_A << -1605119068, var24.field_z << -195294684, -((lf) this).field_O << 1599618826, 4096);
                  dl.a((byte) 120);
                  ((lf) this).field_M.c(-(var24.field_A >> 420622369) + var9, -var24.field_z + var10, 256);
                  return;
                }
              }
            }
          } else {
            return;
          }
        } else {
          L5: {
            var17 = fj.field_bb;
            if (!var17.equals((Object) (Object) ((lf) this).field_l)) {
              ((lf) this).field_l = var17;
              ((lf) this).k(0);
              break L5;
            } else {
              break L5;
            }
          }
          super.a(param0, (byte) 109, param2, param3);
          var6 = ((lf) this).field_N.a(17124);
          var28 = (ao) (Object) ((lf) this).field_s;
          var9 = param3 - -((lf) this).field_k;
          var10 = var28.a((hm) this, param0, -16956) - -(var28.b((hm) this, 90).c(0) >> -974182559);
          if (param1 > 85) {
            if (of.field_f == var6) {
              var20 = ul.field_E[0];
              var11 = var20.field_A << -1966556351;
              var12 = var20.field_z << 1145816513;
              if (((lf) this).field_M != null) {
                if (var11 <= ((lf) this).field_M.field_s) {
                  if (var12 <= ((lf) this).field_M.field_x) {
                    eo.a(((lf) this).field_M, (byte) -7);
                    em.d();
                    var20.b(112, 144, var20.field_A << -1605119068, var20.field_z << -195294684, -((lf) this).field_O << 1599618826, 4096);
                    dl.a((byte) 120);
                    ((lf) this).field_M.c(-(var20.field_A >> 420622369) + var9, -var20.field_z + var10, 256);
                    return;
                  } else {
                    ((lf) this).field_M = new ed(var11, var12);
                    eo.a(((lf) this).field_M, (byte) -84);
                    var20.b(112, 144, var20.field_A << -1605119068, var20.field_z << -195294684, -((lf) this).field_O << 1599618826, 4096);
                    dl.a((byte) 120);
                    ((lf) this).field_M.c(-(var20.field_A >> 420622369) + var9, -var20.field_z + var10, 256);
                    return;
                  }
                } else {
                  ((lf) this).field_M = new ed(var11, var12);
                  eo.a(((lf) this).field_M, (byte) -84);
                  var20.b(112, 144, var20.field_A << -1605119068, var20.field_z << -195294684, -((lf) this).field_O << 1599618826, 4096);
                  dl.a((byte) 120);
                  ((lf) this).field_M.c(-(var20.field_A >> 420622369) + var9, -var20.field_z + var10, 256);
                  return;
                }
              } else {
                ((lf) this).field_M = new ed(var11, var12);
                eo.a(((lf) this).field_M, (byte) -84);
                var20.b(112, 144, var20.field_A << -1605119068, var20.field_z << -195294684, -((lf) this).field_O << 1599618826, 4096);
                dl.a((byte) 120);
                ((lf) this).field_M.c(-(var20.field_A >> 420622369) + var9, -var20.field_z + var10, 256);
                return;
              }
            } else {
              if (var6 != ug.field_c) {
                if (ob.field_a != var6) {
                  if (df.field_h != var6) {
                    return;
                  } else {
                    var21 = ul.field_E[1];
                    var21.c(var9, -(var21.field_x >> 1526982145) + var10, 256);
                    return;
                  }
                } else {
                  var22 = ul.field_E[2];
                  var22.c(var9, -(var22.field_x >> 18734081) + var10, 256);
                  return;
                }
              } else {
                L6: {
                  L7: {
                    var19 = ul.field_E[0];
                    var11 = var19.field_A << -1966556351;
                    var12 = var19.field_z << 1145816513;
                    if (((lf) this).field_M == null) {
                      break L7;
                    } else {
                      if (var11 > ((lf) this).field_M.field_s) {
                        break L7;
                      } else {
                        if (var12 > ((lf) this).field_M.field_x) {
                          break L7;
                        } else {
                          eo.a(((lf) this).field_M, (byte) -7);
                          em.d();
                          break L6;
                        }
                      }
                    }
                  }
                  ((lf) this).field_M = new ed(var11, var12);
                  eo.a(((lf) this).field_M, (byte) -84);
                  break L6;
                }
                var19.b(112, 144, var19.field_A << -1605119068, var19.field_z << -195294684, -((lf) this).field_O << 1599618826, 4096);
                dl.a((byte) 120);
                ((lf) this).field_M.c(-(var19.field_A >> 420622369) + var9, -var19.field_z + var10, 256);
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    final void a(int param0, int param1, int param2, hm param3) {
        if (param0 != -14472) {
          return;
        } else {
          ((lf) this).field_O = ((lf) this).field_O + 1;
          super.a(param0 ^ 0, param1, param2, param3);
          return;
        }
    }

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        param2 = ca.a(-1, '_', param2, "");
        var3 = na.a(param0, false);
        if (param1 == 37) {
          if ((param2.indexOf(param0) ^ -1) == 0) {
            if (-1 != param2.indexOf(var3)) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          field_J = null;
          if ((param2.indexOf(param0) ^ -1) != 0) {
            return true;
          } else {
            L0: {
              if (-1 == param2.indexOf(var3)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    public static void a(byte param0) {
        field_J = null;
        field_K = null;
        int var1 = -35 % ((param0 - 34) / 58);
        field_I = null;
        field_G = null;
    }

    final String d(int param0) {
        if (param0 == 1) {
            return null;
        }
        return null;
    }

    final boolean a(int param0, hm param1) {
        if (param0 != -4659) {
            field_I = null;
            return false;
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "Player Name: ";
        field_G = "Play the game without logging in just yet";
        field_H = 1;
    }
}
