/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ed {
    static double field_a;

    final static void a(int param0, ht param1, boolean param2, uia param3) {
        ht stackIn_6_0 = null;
        ht stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        ht stackIn_9_0 = null;
        ht stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        ht stackIn_12_0 = null;
        ht stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        ht stackIn_15_0 = null;
        ht stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        ht stackIn_19_0 = null;
        ht stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        ht stackIn_22_0 = null;
        ht stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        StringBuilder stackIn_43_1 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2) {
                param1.field_Mb = param3.h(255);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              param1.field_Jb = param3.h(255);
              param1.field_cc = param3.h(255);
              var4_int = param3.h(255);
              stackIn_6_0 = (ht) (param1);

              if ((128 & var4_int) == 0) {
                stackIn_7_0 = (ht) ((Object) stackIn_6_0);
                stackIn_7_1 = 0;
                break L2;
              } else {
                stackIn_7_0 = (ht) ((Object) stackIn_6_0);
                stackIn_7_1 = 1;
                break L2;
              }
            }
            L3: {
              stackIn_7_0.field_Tb = stackIn_7_1 != 0;
              stackIn_9_0 = (ht) (param1);

              if (0 == (var4_int & 64)) {
                stackIn_10_0 = (ht) ((Object) stackIn_9_0);
                stackIn_10_1 = 0;
                break L3;
              } else {
                stackIn_10_0 = (ht) ((Object) stackIn_9_0);
                stackIn_10_1 = 1;
                break L3;
              }
            }
            L4: {
              stackIn_10_0.field_ec = stackIn_10_1 != 0;
              stackIn_12_0 = (ht) (param1);

              if (0 != (var4_int & 16)) {
                stackIn_13_0 = (ht) ((Object) stackIn_12_0);
                stackIn_13_1 = 2;
                break L4;
              } else {
                stackIn_13_0 = (ht) ((Object) stackIn_12_0);
                stackIn_13_1 = 1;
                break L4;
              }
            }
            L5: {
              stackIn_13_0.field_yb = stackIn_13_1;
              stackIn_15_0 = (ht) (param1);

              if ((var4_int & param0) == 0) {
                stackIn_16_0 = (ht) ((Object) stackIn_15_0);
                stackIn_16_1 = 0;
                break L5;
              } else {
                stackIn_16_0 = (ht) ((Object) stackIn_15_0);
                stackIn_16_1 = 1;
                break L5;
              }
            }
            L6: {
              L7: {
                stackIn_16_0.field_Ob = stackIn_16_1 != 0;
                stackIn_19_0 = (ht) (param1);

                if (!param1.field_Tb) {
                  break L7;
                } else {
                  stackIn_19_0 = (ht) ((Object) stackIn_19_0);

                  if (param1.field_Jb <= param1.field_Mb) {
                    break L7;
                  } else {
                    stackIn_20_0 = (ht) ((Object) stackIn_19_0);
                    stackIn_20_1 = 1;
                    break L6;
                  }
                }
              }
              stackIn_20_0 = (ht) ((Object) stackIn_19_0);
              stackIn_20_1 = 0;
              break L6;
            }
            L8: {
              stackIn_20_0.field_Bb = stackIn_20_1 != 0;
              stackIn_22_0 = (ht) (param1);

              if ((var4_int & 8) == 0) {
                stackIn_23_0 = (ht) ((Object) stackIn_22_0);
                stackIn_23_1 = 0;
                break L8;
              } else {
                stackIn_23_0 = (ht) ((Object) stackIn_22_0);
                stackIn_23_1 = 1;
                break L8;
              }
            }
            L9: {
              stackIn_23_0.field_Yb = stackIn_23_1 != 0;
              if (-1 == (4 & var4_int ^ -1)) {
                stackIn_26_0 = 0;
                break L9;
              } else {
                stackIn_26_0 = 1;
                break L9;
              }
            }
            L10: {
              var5 = stackIn_26_0;
              param3.a(param1.field_ac, 0, -104, param1.field_ac.length);
              if ((2 & var4_int) == 0) {
                stackIn_29_0 = 0;
                break L10;
              } else {
                stackIn_29_0 = 1;
                break L10;
              }
            }
            L11: {
              var6 = stackIn_29_0;
              param1.field_Wb = param3.d(param0 + 93);
              param1.field_Gb = bva.b((byte) -107) - (long)param3.e(-105);
              if (var5 != 0) {
                param1.field_Kb = param3.e(param0 ^ 64);
                break L11;
              } else {
                param1.field_Kb = -1;
                break L11;
              }
            }
            L12: {
              param1.field_Ab = param3.b(290646880);
              var7 = param3.field_h;
              param1.field_tb = param3.e((byte) -76);
              if (var6 != 0) {
                param3.field_h = var7;
                param1.field_Cb = new String[param1.field_Mb];
                var8 = 0;
                L13: while (true) {
                  if (var8 >= param1.field_Mb) {
                    break L12;
                  } else {
                    param1.field_Cb[var8] = param3.e((byte) -76);
                    var8++;
                    continue L13;
                  }
                }
              } else {
                param1.field_Cb = null;
                break L12;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var4 = decompiledCaughtException;
            stackIn_40_0 = (RuntimeException) (var4);

            stackIn_40_1 = new StringBuilder().append("ed.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L14;
            } else {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
              break L14;
            }
          }
          L15: {


            stackIn_43_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_41_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "null";
              break L15;
            } else {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "{...}";
              break L15;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_41_0), stackIn_44_2 + ')');
        }
    }

    final static mi a(cr param0, int param1) throws jj {
        mi stackIn_6_0 = null;
        mi stackIn_20_0 = null;
        mi stackIn_26_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        mi var4 = null;
        mi var5 = null;
        mi var6 = null;
        try {
          L0: {
            L1: {
              var4 = param0.c((byte) -127);
              if (var4.field_p == ma.field_e) {
                break L1;
              } else {
                if (nl.field_d == var4.field_p) {
                  break L1;
                } else {
                  if (dc.field_o == var4.field_p) {
                    break L1;
                  } else {
                    if (var4.field_p == dja.field_r) {
                      break L1;
                    } else {
                      L2: {
                        if (param1 == -31733) {
                          break L2;
                        } else {
                          field_a = -1.1603987584850415;
                          break L2;
                        }
                      }
                      if (var4.field_p != tr.field_f) {
                        throw new jj(var4.field_h);
                      } else {
                        if (!param0.a((byte) 100)) {
                          var5 = param0.c((byte) -126);
                          if (var5.field_p == lna.field_a) {
                            var4.field_i = new vna();
                            L3: while (true) {
                              if (param0.a((byte) 127)) {
                                throw new jj(var4.field_h);
                              } else {
                                if (param0.c((byte) -127).field_p != rs.field_a) {
                                  param0.field_c = param0.field_c - 1;
                                  var4.field_i.b((byte) -127, ed.a(param0, -31733));
                                  if (param0.a((byte) 125)) {
                                    throw new jj(var4.field_h);
                                  } else {
                                    var6 = param0.c((byte) -126);
                                    if (var6.field_p != rs.field_a) {
                                      if (var6.field_p != qba.field_c) {
                                        throw new jj(var6.field_h);
                                      } else {
                                        continue L3;
                                      }
                                    } else {
                                      stackIn_26_0 = (mi) (var4);
                                      decompiledRegionSelector0 = 2;
                                      break L0;
                                    }
                                  }
                                } else {
                                  stackIn_20_0 = (mi) (var4);
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                }
                              }
                            }
                          } else {
                            throw new jj(var5.field_h);
                          }
                        } else {
                          throw new jj(var4.field_h);
                        }
                      }
                    }
                  }
                }
              }
            }
            stackIn_6_0 = (mi) (var4);
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var2);

            stackIn_33_1 = new StringBuilder().append("ed.B(");

            if (param0 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L4;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_20_0;
          } else {
            return stackIn_26_0;
          }
        }
    }

    static {
        field_a = -1.0;
    }
}
