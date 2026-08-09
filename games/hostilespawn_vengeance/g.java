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
        try {
            wk.field_g.a(param0, 124);
            fj.a(param1, param0, true);
            if (param2 != -7347) {
                g.j(101);
            }
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "g.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(byte param0, int param1) {
        dn.field_a = param1;
        int var2 = -94 / ((-70 - param0) / 46);
    }

    final boolean a(int param0, int param1, int param2, int param3, byte param4, ag param5, int param6) {
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
              var8_int = -this.field_v + -param1 + (-this.field_P + param0);
              var9 = -this.field_Q - (param2 - (-this.field_m + param3));
              if (this.field_J * this.field_J > var9 * var9 + var8_int * var8_int) {
                L1: {
                  var10 = Math.atan2((double)var9, (double)var8_int) - he.field_r;
                  if (0.0 > var10) {
                    var10 = var10 - 3.141592653589793 / (double)this.field_I;
                    break L1;
                  } else {
                    if (0.0 >= var10) {
                      break L1;
                    } else {
                      var10 = var10 + 3.141592653589793 / (double)this.field_I;
                      break L1;
                    }
                  }
                }
                this.field_H = (int)((double)this.field_I * var10 / 6.283185307179586);
                L2: while (true) {
                  if (this.field_I > this.field_H) {
                    L3: while (true) {
                      if (this.field_H >= 0) {
                        stackIn_15_0 = 1;
                        break L0;
                      } else {
                        this.field_H = this.field_H + this.field_I;
                        continue L3;
                      }
                    }
                  } else {
                    this.field_H = this.field_H - this.field_I;
                    continue L2;
                  }
                }
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var8);

            stackIn_18_1 = new StringBuilder().append("g.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param6 + ')');
        }
        return stackIn_15_0 != 0;
    }

    final static java.awt.Frame a(int param0, int param1, byte param2, fd param3, int param4, int param5) {
        Object stackIn_8_0 = null;
        Object stackIn_24_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_35_0 = null;
        java.awt.Frame stackIn_37_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ak[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        ak[] var10 = null;
        kk var11 = null;
        var9 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (param3.a(true)) {
              L1: {
                if (0 == param4) {
                  var10 = je.a(param3, 2);
                  var6 = var10;
                  if (var6 != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var10.length <= var8) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          stackIn_24_0 = null;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      } else {
                        L3: {
                          if (param5 != var10[var8].field_d) {
                            break L3;
                          } else {
                            if (param0 != var10[var8].field_k) {
                              break L3;
                            } else {
                              L4: {
                                if (0 == param1) {
                                  break L4;
                                } else {
                                  if (var10[var8].field_j != param1) {
                                    break L3;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              L5: {
                                if (var7_int == 0) {
                                  break L5;
                                } else {
                                  if (var10[var8].field_e <= param4) {
                                    break L3;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              var7_int = 1;
                              param4 = var10[var8].field_e;
                              break L3;
                            }
                          }
                        }
                        var8++;
                        continue L2;
                      }
                    }
                  } else {
                    stackIn_8_0 = null;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
              var11 = param3.a(false, param5, param1, param0, param4);
              L6: while (true) {
                if (var11.field_f != 0) {
                  var7 = (java.awt.Frame) (var11.field_c);
                  if (var7 != null) {
                    L7: {
                      if (param2 >= 11) {
                        break L7;
                      } else {
                        field_N = (String) null;
                        break L7;
                      }
                    }
                    if (2 != var11.field_f) {
                      stackIn_37_0 = (java.awt.Frame) (var7);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      sd.a(param3, -125, var7);
                      stackIn_35_0 = null;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  } else {
                    stackIn_30_0 = null;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  vj.a(10L, (byte) -49);
                  continue L6;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6_ref = decompiledCaughtException;
            stackIn_40_0 = (RuntimeException) (var6_ref);

            stackIn_40_1 = new StringBuilder().append("g.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L8;
            } else {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
              break L8;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.awt.Frame) ((Object) stackIn_8_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.awt.Frame) ((Object) stackIn_24_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (java.awt.Frame) ((Object) stackIn_30_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return (java.awt.Frame) ((Object) stackIn_35_0);
              } else {
                return stackIn_37_0;
              }
            }
          }
        }
    }

    private g() throws Throwable {
        throw new Error();
    }

    static {
        field_N = "Achieved";
        field_R = "Passwords can only contain letters and numbers";
        field_O = "Find more ammo for the rocket launcher to destroy the turrets blocking the lift. Otherwise, find an alternative way out.";
        field_K = "Doors open when you get close to them.";
        field_M = new jf();
    }
}
