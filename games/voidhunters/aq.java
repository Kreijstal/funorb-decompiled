/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aq extends rqa {
    static int field_o;
    static int[] field_p;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -119) {
                break L1;
              } else {
                aq.a(80);
                break L1;
              }
            }
            si.a(68, 62, param0[0].a(91));
            stackOut_2_0 = new nc("void");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("aq.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    aq(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        field_p = null;
        if (param0 != -10441) {
            field_o = -54;
        }
    }

    final static pgb b(int param0, int param1, int param2, int param3) {
        Object var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        pgb var8_ref_pgb = null;
        int var9 = 0;
        pgb var9_ref_pgb = null;
        int var10_int = 0;
        String var10 = null;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int stackIn_39_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_81_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        var13 = VoidHunters.field_G;
        var4 = null;
        if (param3 <= -70) {
          vea.field_p.field_wb.field_lb.e(122);
          var5 = 0;
          var6 = 0;
          var7 = -1 + ou.field_q;
          L0: while (true) {
            if (0 > var7) {
              var7 = 0;
              var8 = 0;
              L1: while (true) {
                if (ou.field_q <= var8) {
                  var8 = -var7 - (-var6 - (vea.field_p.field_wb.field_G + vea.field_p.field_wb.field_E));
                  vea.field_p.field_wb.field_K = vea.field_p.field_wb.field_K + var8;
                  vea.field_p.field_wb.field_G = vea.field_p.field_wb.field_G - var8;
                  if (!ebb.field_b) {
                    L2: {
                      if (ebb.field_b) {
                        ebb.field_b = false;
                        vea.field_p.field_wb.field_db = 0;
                        lf.field_o = true;
                        vea.field_p.field_wb.field_K = vea.field_p.field_xb.field_G + -vea.field_p.field_wb.field_G;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    vea.field_p.field_wb.field_E = -vea.field_p.field_wb.field_G + var7;
                    if (fva.field_p) {
                      if (null != qw.field_l) {
                        L3: {
                          lf.field_o = true;
                          var9 = -vea.field_p.field_wb.field_E + -vea.field_p.field_wb.field_G + vea.field_p.field_xb.field_G;
                          if (lf.field_o) {
                            vea.field_p.field_wb.field_db = -vea.field_p.field_wb.field_K + var9;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        L4: {
                          vea.field_p.a(2 * param0 * param2, true, param0, 0);
                          if (var9 != vea.field_p.field_wb.field_K - -vea.field_p.field_wb.field_db) {
                            stackOut_80_0 = 0;
                            stackIn_81_0 = stackOut_80_0;
                            break L4;
                          } else {
                            stackOut_79_0 = 1;
                            stackIn_81_0 = stackOut_79_0;
                            break L4;
                          }
                        }
                        lf.field_o = stackIn_81_0 != 0;
                        return (pgb) (var4);
                      } else {
                        L5: {
                          var9 = -vea.field_p.field_wb.field_E + -vea.field_p.field_wb.field_G + vea.field_p.field_xb.field_G;
                          if (lf.field_o) {
                            vea.field_p.field_wb.field_db = -vea.field_p.field_wb.field_K + var9;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          vea.field_p.a(2 * param0 * param2, true, param0, 0);
                          if (var9 != vea.field_p.field_wb.field_K - -vea.field_p.field_wb.field_db) {
                            stackOut_73_0 = 0;
                            stackIn_74_0 = stackOut_73_0;
                            break L6;
                          } else {
                            stackOut_72_0 = 1;
                            stackIn_74_0 = stackOut_72_0;
                            break L6;
                          }
                        }
                        lf.field_o = stackIn_74_0 != 0;
                        return (pgb) (var4);
                      }
                    } else {
                      L7: {
                        var9 = -vea.field_p.field_wb.field_E + -vea.field_p.field_wb.field_G + vea.field_p.field_xb.field_G;
                        if (lf.field_o) {
                          vea.field_p.field_wb.field_db = -vea.field_p.field_wb.field_K + var9;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      L8: {
                        vea.field_p.a(2 * param0 * param2, true, param0, 0);
                        if (var9 != vea.field_p.field_wb.field_K - -vea.field_p.field_wb.field_db) {
                          stackOut_65_0 = 0;
                          stackIn_66_0 = stackOut_65_0;
                          break L8;
                        } else {
                          stackOut_64_0 = 1;
                          stackIn_66_0 = stackOut_64_0;
                          break L8;
                        }
                      }
                      lf.field_o = stackIn_66_0 != 0;
                      return (pgb) (var4);
                    }
                  } else {
                    L9: {
                      vea.field_p.field_wb.field_G = var7;
                      if (ebb.field_b) {
                        ebb.field_b = false;
                        vea.field_p.field_wb.field_db = 0;
                        lf.field_o = true;
                        vea.field_p.field_wb.field_K = vea.field_p.field_xb.field_G + -vea.field_p.field_wb.field_G;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    vea.field_p.field_wb.field_E = -vea.field_p.field_wb.field_G + var7;
                    if (fva.field_p) {
                      if (null != qw.field_l) {
                        L10: {
                          lf.field_o = true;
                          var9 = -vea.field_p.field_wb.field_E + -vea.field_p.field_wb.field_G + vea.field_p.field_xb.field_G;
                          if (lf.field_o) {
                            vea.field_p.field_wb.field_db = -vea.field_p.field_wb.field_K + var9;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        L11: {
                          vea.field_p.a(2 * param0 * param2, true, param0, 0);
                          if (var9 != vea.field_p.field_wb.field_K - -vea.field_p.field_wb.field_db) {
                            stackOut_53_0 = 0;
                            stackIn_54_0 = stackOut_53_0;
                            break L11;
                          } else {
                            stackOut_52_0 = 1;
                            stackIn_54_0 = stackOut_52_0;
                            break L11;
                          }
                        }
                        lf.field_o = stackIn_54_0 != 0;
                        return (pgb) (var4);
                      } else {
                        L12: {
                          var9 = -vea.field_p.field_wb.field_E + -vea.field_p.field_wb.field_G + vea.field_p.field_xb.field_G;
                          if (lf.field_o) {
                            vea.field_p.field_wb.field_db = -vea.field_p.field_wb.field_K + var9;
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        L13: {
                          vea.field_p.a(2 * param0 * param2, true, param0, 0);
                          if (var9 != vea.field_p.field_wb.field_K - -vea.field_p.field_wb.field_db) {
                            stackOut_46_0 = 0;
                            stackIn_47_0 = stackOut_46_0;
                            break L13;
                          } else {
                            stackOut_45_0 = 1;
                            stackIn_47_0 = stackOut_45_0;
                            break L13;
                          }
                        }
                        lf.field_o = stackIn_47_0 != 0;
                        return (pgb) (var4);
                      }
                    } else {
                      L14: {
                        var9 = -vea.field_p.field_wb.field_E + -vea.field_p.field_wb.field_G + vea.field_p.field_xb.field_G;
                        if (lf.field_o) {
                          vea.field_p.field_wb.field_db = -vea.field_p.field_wb.field_K + var9;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      L15: {
                        vea.field_p.a(2 * param0 * param2, true, param0, 0);
                        if (var9 != vea.field_p.field_wb.field_K - -vea.field_p.field_wb.field_db) {
                          stackOut_38_0 = 0;
                          stackIn_39_0 = stackOut_38_0;
                          break L15;
                        } else {
                          stackOut_37_0 = 1;
                          stackIn_39_0 = stackOut_37_0;
                          break L15;
                        }
                      }
                      lf.field_o = stackIn_39_0 != 0;
                      return (pgb) (var4);
                    }
                  }
                } else {
                  var9_ref_pgb = nrb.field_b[var8];
                  if (null != var9_ref_pgb.field_j) {
                    vea.field_p.field_wb.b(-561, var9_ref_pgb.field_j);
                    var9_ref_pgb.field_j.a(param1, 122, var9_ref_pgb.field_j.e(66), var7, param0);
                    var7 = var7 + param0;
                    if (var9_ref_pgb.field_j.field_o != 0) {
                      var4 = var9_ref_pgb;
                      var8++;
                      continue L1;
                    } else {
                      var8++;
                      continue L1;
                    }
                  } else {
                    var8++;
                    continue L1;
                  }
                }
              }
            } else {
              L16: {
                var8_ref_pgb = nrb.field_b[var7];
                var9 = 0;
                if (erb.field_p) {
                  break L16;
                } else {
                  if (var5 >= hab.field_k) {
                    break L16;
                  } else {
                    var10_int = jia.a(var8_ref_pgb.field_a, (byte) 19);
                    if (var10_int <= var8_ref_pgb.a(1)) {
                      L17: {
                        if (var8_ref_pgb.field_k) {
                          break L17;
                        } else {
                          if (ltb.a((byte) -94, var8_ref_pgb.field_n)) {
                            break L16;
                          } else {
                            break L17;
                          }
                        }
                      }
                      var9 = 1;
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                }
              }
              if (var9 != 0) {
                L18: {
                  if (null == var8_ref_pgb.field_j) {
                    break L18;
                  } else {
                    if (ebb.field_b) {
                      break L18;
                    } else {
                      var5++;
                      var7--;
                      continue L0;
                    }
                  }
                }
                L19: {
                  if (null != var8_ref_pgb.field_j) {
                    break L19;
                  } else {
                    break L19;
                  }
                }
                var10 = dpb.a(true, var8_ref_pgb);
                var11 = var10 + no.c(var8_ref_pgb.field_d);
                var12 = ugb.a(2, var8_ref_pgb);
                var8_ref_pgb.field_j = new llb(0L, odb.field_b, var11);
                var8_ref_pgb.field_j.field_ib = ((odb.field_b.field_ib & 16711422) >> 321931617) + -(var12 >> 554487297 & 8355711) + var12;
                var8_ref_pgb.field_j.field_Y = var12;
                var8_ref_pgb.field_j.field_qb = ((odb.field_b.field_qb & 16711422) >> -1271602495) + var12 + -(8355711 & var12 >> -1318122143);
                var6 = var6 + param0;
                var8_ref_pgb.field_j.field_eb = ej.field_c;
                var5++;
                var7--;
                continue L0;
              } else {
                var8_ref_pgb.field_j = null;
                var7--;
                continue L0;
              }
            }
          }
        } else {
          return (pgb) null;
        }
    }

    static {
        field_o = 8;
        field_p = new int[16384];
    }
}
