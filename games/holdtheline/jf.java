/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jf {
    static uf field_a;
    static int field_b;
    static go field_c;
    static oa field_d;

    final static void a(int param0, int param1, byte param2, int param3) {
        if (-1 != on.field_v[param1][param3]) {
            // if_icmpgt L25
        } else {
            on.field_v[param1][param3] = param0;
            tn.a(0);
        }
        if (param2 != 62) {
            Object var5 = null;
            short[] discarded$0 = jf.a((short[]) null, -26, (da) null, true);
        }
    }

    final static boolean a(in param0, qm param1, int param2, int param3, in param4, int param5, int param6, qm param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        float var19 = 0.0f;
        int var20_int = 0;
        float var20 = 0.0f;
        float var21 = 0.0f;
        int var22 = 0;
        L0: {
          var22 = HoldTheLine.field_D;
          var9 = -param7.field_h + param1.field_h;
          var10 = -param7.field_f + param1.field_f;
          var11 = Math.abs(param0.field_j * param4.field_j + param0.field_g * param4.field_g);
          var12 = Math.abs(-(param0.field_g * param4.field_j) + param0.field_j * param4.field_g);
          var13 = var12;
          var14 = var11;
          var15 = param4.field_j * (float)var9 + (float)var10 * param4.field_g;
          var16 = (float)var9 * param4.field_g - (float)var10 * param4.field_j;
          var17 = (float)var10 * param0.field_g + param0.field_j * (float)var9;
          var18 = param0.field_g * (float)var9 - param0.field_j * (float)var10;
          le.field_s[0] = (float)(-param5) + (-(var13 * (float)param6) - var11 * (float)param3 + Math.abs(var15));
          if (param8 == 7527) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        if (le.field_s[0] > 0.0f) {
          return false;
        } else {
          le.field_s[1] = -(var14 * (float)param6) - var12 * (float)param3 + Math.abs(var16) - (float)param2;
          if (le.field_s[1] > 0.0f) {
            return false;
          } else {
            le.field_s[2] = -((float)param2 * var12) - (float)param5 * var11 + Math.abs(var17) - (float)param3;
            if (le.field_s[2] > 0.0f) {
              return false;
            } else {
              le.field_s[3] = Math.abs(var18) - (var14 * (float)param2 + (float)param5 * var13) - (float)param6;
              if (0.0f >= le.field_s[3]) {
                ek.field_o = 0;
                var19 = le.field_s[0];
                var20_int = 1;
                L1: while (true) {
                  if (var20_int >= 4) {
                    kk.field_k = -var19;
                    if (-1 != (ek.field_o ^ -1)) {
                      L2: {
                        if (-3 == ek.field_o) {
                          L3: {
                            vl.field_c = param4.a((byte) -74);
                            var20 = (float)param3 * (ln.a(-29407, param0.a(param4, true)) * param0.field_j) + (float)param6 * (ln.a(param8 + -36934, param0.a(param4, (byte) -10)) * param0.field_g);
                            var21 = (float)param3 * (ln.a(-29407, param0.a(param4, true)) * param0.field_g) - (float)param6 * (ln.a(-29407, param0.a(param4, (byte) -10)) * param0.field_j);
                            if (0.0f < var16) {
                              vl.field_c.a(-1.0f, -1);
                              var21 = -var21;
                              ek.field_o = ek.field_o + 1;
                              var20 = -var20;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          mm.field_d = (float)param1.field_h + var20;
                          lk.field_b = (float)param1.field_f + var21;
                          break L2;
                        } else {
                          if (-5 != ek.field_o) {
                            L4: {
                              vl.field_c = param0.a((byte) -81);
                              var20 = ln.a(param8 ^ -28602, param4.a(param0, true)) * param4.field_j * (float)param5 + (float)param2 * (ln.a(-29407, param4.a(param0, (byte) -10)) * param4.field_g);
                              var21 = (float)param5 * (ln.a(-29407, param4.a(param0, true)) * param4.field_g) - ln.a(param8 + -36934, param4.a(param0, (byte) -10)) * param4.field_j * (float)param2;
                              if (var18 > 0.0f) {
                                vl.field_c.a(-1.0f, -1);
                                var21 = -var21;
                                var20 = -var20;
                                ek.field_o = ek.field_o + 1;
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                            lk.field_b = var21 + (float)param7.field_f;
                            mm.field_d = (float)param7.field_h + var20;
                            break L2;
                          } else {
                            L5: {
                              vl.field_c = new in(param0);
                              var20 = (float)param5 * (ln.a(-29407, param4.a(param0, (byte) -10)) * param4.field_j) - ln.a(-29407, param4.a(param0, true)) * param4.field_g * (float)param2;
                              var21 = (float)param5 * (ln.a(-29407, param4.a(param0, (byte) -10)) * param4.field_g) + ln.a(-29407, param4.a(param0, true)) * param4.field_j * (float)param2;
                              if (0.0f < var17) {
                                vl.field_c.a(-1.0f, param8 + -7528);
                                ek.field_o = ek.field_o + 1;
                                var20 = -var20;
                                var21 = -var21;
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            mm.field_d = var20 + (float)param7.field_h;
                            lk.field_b = var21 + (float)param7.field_f;
                            break L2;
                          }
                        }
                      }
                      return true;
                    } else {
                      L6: {
                        vl.field_c = new in(param4);
                        var20 = ln.a(-29407, param0.a(param4, (byte) -10)) * param0.field_j * (float)param3 - ln.a(-29407, param0.a(param4, true)) * param0.field_g * (float)param6;
                        var21 = (float)param3 * (ln.a(-29407, param0.a(param4, (byte) -10)) * param0.field_g) + ln.a(-29407, param0.a(param4, true)) * param0.field_j * (float)param6;
                        if (var15 > 0.0f) {
                          vl.field_c.a(-1.0f, -1);
                          var21 = -var21;
                          var20 = -var20;
                          ek.field_o = ek.field_o + 1;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      mm.field_d = var20 + (float)param1.field_h;
                      lk.field_b = (float)param1.field_f + var21;
                      return true;
                    }
                  } else {
                    if (var19 < le.field_s[var20_int]) {
                      var19 = le.field_s[var20_int];
                      ek.field_o = var20_int * 2;
                      var20_int++;
                      continue L1;
                    } else {
                      var20_int++;
                      continue L1;
                    }
                  }
                }
              } else {
                return false;
              }
            }
          }
        }
    }

    abstract void a(java.awt.Component param0, byte param1);

    abstract int a(byte param0);

    final static short[] a(short[] param0, int param1, da param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = HoldTheLine.field_D;
        var4 = param2.h(param1, 7);
        if (var4 != 0) {
          L0: {
            if (!param3) {
              break L0;
            } else {
              field_a = null;
              break L0;
            }
          }
          L1: {
            L2: {
              if (param0 == null) {
                break L2;
              } else {
                if (param0.length != var4) {
                  break L2;
                } else {
                  break L1;
                }
              }
            }
            param0 = new short[var4];
            break L1;
          }
          L3: {
            var5 = param2.h(4, 7);
            var6 = (short)param2.h(16, 7);
            if (0 >= var5) {
              var7 = 0;
              L4: while (true) {
                if (var7 >= var4) {
                  break L3;
                } else {
                  param0[var7] = (short)var6;
                  var7++;
                  continue L4;
                }
              }
            } else {
              var7 = 0;
              L5: while (true) {
                if (var7 >= var4) {
                  break L3;
                } else {
                  param0[var7] = (short)(var6 + param2.h(var5, 7));
                  var7++;
                  continue L5;
                }
              }
            }
          }
          return param0;
        } else {
          return null;
        }
    }

    public static void b(byte param0) {
        field_d = null;
        if (param0 != 106) {
            jf.a(-4);
        }
        field_a = null;
        field_c = null;
    }

    final static void a(int param0) {
        if (param0 != 4) {
            field_c = null;
        }
        if (rc.field_c.length > kn.field_a) {
            kn.field_a = kn.field_a + 1;
            kf.field_q = rc.field_c[kn.field_a];
        } else {
            kf.field_q = null;
        }
    }

    abstract void a(java.awt.Component param0, int param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = -1;
    }
}
