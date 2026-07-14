/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g extends ph {
    int field_Q;
    int field_J;
    int field_I;
    static bd[] field_G;
    static String field_N;
    static String field_O;
    int field_H;
    static String field_R;
    static jf field_M;
    static String field_K;
    int field_L;
    int field_P;

    public static void j(int param0) {
        if (param0 >= -119) {
            return;
        }
        field_G = null;
        field_M = null;
        field_R = null;
        field_N = null;
        field_O = null;
        field_K = null;
    }

    final static void a(m param0, int param1, int param2) {
        wk.field_g.a((am) (Object) param0, 124);
        fj.a(param1, param0, true);
        if (param2 == -7347) {
            return;
        }
        g.j(101);
    }

    final static void a(byte param0, int param1) {
        dn.field_a = param1;
        int var2 = -94 / ((-70 - param0) / 46);
    }

    final boolean a(int param0, int param1, int param2, int param3, byte param4, ag param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = HostileSpawn.field_I ? 1 : 0;
        if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
          var8 = -((g) this).field_v + -param1 + (-((g) this).field_P + param0);
          var9 = -((g) this).field_Q - (param2 - (-((g) this).field_m + param3));
          if (((g) this).field_J * ((g) this).field_J > var9 * var9 + var8 * var8) {
            L0: {
              var10 = Math.atan2((double)var9, (double)var8) - he.field_r;
              if (0.0 > var10) {
                var10 = var10 - 3.141592653589793 / (double)((g) this).field_I;
                break L0;
              } else {
                if (0.0 >= var10) {
                  break L0;
                } else {
                  var10 = var10 + 3.141592653589793 / (double)((g) this).field_I;
                  ((g) this).field_H = (int)((double)((g) this).field_I * var10 / 6.283185307179586);
                  L1: while (true) {
                    if (((g) this).field_I <= ((g) this).field_H) {
                      ((g) this).field_H = ((g) this).field_H - ((g) this).field_I;
                      continue L1;
                    } else {
                      L2: while (true) {
                        if (((g) this).field_H >= 0) {
                          return true;
                        } else {
                          ((g) this).field_H = ((g) this).field_H + ((g) this).field_I;
                          continue L2;
                        }
                      }
                    }
                  }
                }
              }
            }
            ((g) this).field_H = (int)((double)((g) this).field_I * var10 / 6.283185307179586);
            L3: while (true) {
              if (((g) this).field_I <= ((g) this).field_H) {
                ((g) this).field_H = ((g) this).field_H - ((g) this).field_I;
                continue L3;
              } else {
                L4: while (true) {
                  if (((g) this).field_H >= 0) {
                    return true;
                  } else {
                    ((g) this).field_H = ((g) this).field_H + ((g) this).field_I;
                    continue L4;
                  }
                }
              }
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final static java.awt.Frame a(int param0, int param1, byte param2, fd param3, int param4, int param5) {
        ak[] var6 = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        ak[] var10 = null;
        kk var12 = null;
        java.awt.Frame var13 = null;
        kk var14 = null;
        java.awt.Frame var15 = null;
        var9 = HostileSpawn.field_I ? 1 : 0;
        if (param3.a(true)) {
          if (0 == param4) {
            var10 = je.a(param3, 2);
            var6 = var10;
            if (var6 != null) {
              var7_int = 0;
              var8 = 0;
              L0: while (true) {
                if (var10.length <= var8) {
                  if (var7_int != 0) {
                    var14 = param3.a(false, param5, param1, param0, param4);
                    L1: while (true) {
                      if (var14.field_f == 0) {
                        vj.a(10L, (byte) -49);
                        continue L1;
                      } else {
                        var15 = (java.awt.Frame) var14.field_c;
                        var7 = var15;
                        if (var15 != null) {
                          if (param2 >= 11) {
                            if (2 == var14.field_f) {
                              sd.a(param3, -125, var15);
                              return null;
                            } else {
                              return var15;
                            }
                          } else {
                            field_N = null;
                            if (2 == var14.field_f) {
                              sd.a(param3, -125, var15);
                              return null;
                            } else {
                              return var15;
                            }
                          }
                        } else {
                          return null;
                        }
                      }
                    }
                  } else {
                    return null;
                  }
                } else {
                  if (param5 == var10[var8].field_d) {
                    if (param0 == var10[var8].field_k) {
                      L2: {
                        if (0 == param1) {
                          break L2;
                        } else {
                          if (var10[var8].field_j == param1) {
                            break L2;
                          } else {
                            var8++;
                            continue L0;
                          }
                        }
                      }
                      L3: {
                        if (var7_int == 0) {
                          break L3;
                        } else {
                          if (var10[var8].field_e > param4) {
                            break L3;
                          } else {
                            var8++;
                            continue L0;
                          }
                        }
                      }
                      var7_int = 1;
                      param4 = var10[var8].field_e;
                      var8++;
                      continue L0;
                    } else {
                      var8++;
                      var8++;
                      continue L0;
                    }
                  } else {
                    var8++;
                    var8++;
                    continue L0;
                  }
                }
              }
            } else {
              return null;
            }
          } else {
            var12 = param3.a(false, param5, param1, param0, param4);
            L4: while (true) {
              if (var12.field_f == 0) {
                vj.a(10L, (byte) -49);
                continue L4;
              } else {
                var13 = (java.awt.Frame) var12.field_c;
                if (var13 != null) {
                  if (param2 >= 11) {
                    if (2 == var12.field_f) {
                      sd.a(param3, -125, var13);
                      return null;
                    } else {
                      return var13;
                    }
                  } else {
                    field_N = null;
                    if (2 == var12.field_f) {
                      sd.a(param3, -125, var13);
                      return null;
                    } else {
                      return var13;
                    }
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    private g() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = "Achieved";
        field_R = "Passwords can only contain letters and numbers";
        field_O = "Find more ammo for the rocket launcher to destroy the turrets blocking the lift. Otherwise, find an alternative way out.";
        field_K = "Doors open when you get close to them.";
        field_M = new jf();
    }
}
