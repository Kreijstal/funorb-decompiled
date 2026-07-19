/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bn {
    static je field_c;
    static boolean field_e;
    static kk[] field_a;
    static wc field_f;
    static String field_d;
    static int field_b;
    static String field_g;

    final static void a(byte param0, float param1, String param2) {
        try {
            if (param0 != -24) {
                field_a = (kk[]) null;
            }
            wa.field_e = param2;
            q.field_C = param1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "bn.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(byte param0, int param1, int param2) {
        if (param1 != 1) {
          if (param0 >= -7) {
            return 111;
          } else {
            return ce.field_I[param1];
          }
        } else {
          if (!is.a(4, param2)) {
            if (param0 >= -7) {
              return 111;
            } else {
              return ce.field_I[param1];
            }
          } else {
            return 29;
          }
        }
    }

    final static boolean a(boolean param0) {
        if (!hf.field_c) {
            return false;
        }
        if (param0) {
            return true;
        }
        if (rs.field_t != 0) {
            return false;
        }
        return true;
    }

    public static void a(int param0) {
        field_g = null;
        field_d = null;
        if (param0 != 29022) {
          field_d = (String) null;
          field_a = null;
          field_f = null;
          field_c = null;
          return;
        } else {
          field_a = null;
          field_f = null;
          field_c = null;
          return;
        }
    }

    final static void a(boolean param0, boolean param1, int param2, int param3) {
        int var5 = 0;
        je stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        je stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        je stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        je stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        je stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        je stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        je stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        je stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        je stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        je stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        je stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        je stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        je stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        je stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        je stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        je stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        je stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        je stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        je stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        je stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        je stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        je stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        je stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        je stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        je stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        je stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        int stackIn_62_2 = 0;
        je stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        je stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        je stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        je stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        je stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        je stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        je stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        int stackIn_69_2 = 0;
        je stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        je stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        je stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        je stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        je stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        int stackIn_74_2 = 0;
        je stackIn_123_0 = null;
        int stackIn_123_1 = 0;
        je stackIn_124_0 = null;
        int stackIn_124_1 = 0;
        je stackIn_125_0 = null;
        int stackIn_125_1 = 0;
        je stackIn_126_0 = null;
        int stackIn_126_1 = 0;
        je stackIn_127_0 = null;
        int stackIn_127_1 = 0;
        je stackIn_128_0 = null;
        int stackIn_128_1 = 0;
        je stackIn_129_0 = null;
        int stackIn_129_1 = 0;
        int stackIn_129_2 = 0;
        je stackIn_130_0 = null;
        int stackIn_130_1 = 0;
        je stackIn_131_0 = null;
        int stackIn_131_1 = 0;
        je stackIn_132_0 = null;
        int stackIn_132_1 = 0;
        je stackIn_133_0 = null;
        int stackIn_133_1 = 0;
        je stackIn_134_0 = null;
        int stackIn_134_1 = 0;
        je stackIn_135_0 = null;
        int stackIn_135_1 = 0;
        je stackIn_136_0 = null;
        int stackIn_136_1 = 0;
        int stackIn_136_2 = 0;
        je stackIn_137_0 = null;
        int stackIn_137_1 = 0;
        je stackIn_138_0 = null;
        int stackIn_138_1 = 0;
        je stackIn_139_0 = null;
        int stackIn_139_1 = 0;
        je stackIn_140_0 = null;
        int stackIn_140_1 = 0;
        je stackIn_141_0 = null;
        int stackIn_141_1 = 0;
        int stackIn_141_2 = 0;
        je stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        je stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        je stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        je stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        je stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        je stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        int stackOut_60_2 = 0;
        je stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        int stackOut_61_2 = 0;
        je stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        je stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        je stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        je stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        je stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        je stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        int stackOut_67_2 = 0;
        je stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        int stackOut_68_2 = 0;
        je stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        je stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        je stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        je stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        int stackOut_72_2 = 0;
        je stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        int stackOut_73_2 = 0;
        je stackOut_122_0 = null;
        int stackOut_122_1 = 0;
        je stackOut_123_0 = null;
        int stackOut_123_1 = 0;
        je stackOut_124_0 = null;
        int stackOut_124_1 = 0;
        je stackOut_125_0 = null;
        int stackOut_125_1 = 0;
        je stackOut_126_0 = null;
        int stackOut_126_1 = 0;
        je stackOut_127_0 = null;
        int stackOut_127_1 = 0;
        int stackOut_127_2 = 0;
        je stackOut_128_0 = null;
        int stackOut_128_1 = 0;
        int stackOut_128_2 = 0;
        je stackOut_129_0 = null;
        int stackOut_129_1 = 0;
        je stackOut_130_0 = null;
        int stackOut_130_1 = 0;
        je stackOut_131_0 = null;
        int stackOut_131_1 = 0;
        je stackOut_132_0 = null;
        int stackOut_132_1 = 0;
        je stackOut_133_0 = null;
        int stackOut_133_1 = 0;
        je stackOut_134_0 = null;
        int stackOut_134_1 = 0;
        int stackOut_134_2 = 0;
        je stackOut_135_0 = null;
        int stackOut_135_1 = 0;
        int stackOut_135_2 = 0;
        je stackOut_136_0 = null;
        int stackOut_136_1 = 0;
        je stackOut_137_0 = null;
        int stackOut_137_1 = 0;
        je stackOut_138_0 = null;
        int stackOut_138_1 = 0;
        je stackOut_139_0 = null;
        int stackOut_139_1 = 0;
        int stackOut_139_2 = 0;
        je stackOut_140_0 = null;
        int stackOut_140_1 = 0;
        int stackOut_140_2 = 0;
        je stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        je stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        je stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        je stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        je stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        je stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        je stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        je stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        je stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        je stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        je stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        je stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        je stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        je stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        je stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        je stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        je stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        je stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        je stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        bh.d(false);
        if (al.field_g >= 0) {
          L0: {
            L1: {
              t.field_g.field_X = fo.a(4800, ns.field_F, new String[]{Integer.toString(al.field_g)});
              stackOut_55_0 = no.field_T;
              stackOut_55_1 = 1;
              stackIn_61_0 = stackOut_55_0;
              stackIn_61_1 = stackOut_55_1;
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              if (!param0) {
                break L1;
              } else {
                stackOut_56_0 = (je) ((Object) stackIn_56_0);
                stackOut_56_1 = stackIn_56_1;
                stackIn_61_0 = stackOut_56_0;
                stackIn_61_1 = stackOut_56_1;
                stackIn_57_0 = stackOut_56_0;
                stackIn_57_1 = stackOut_56_1;
                if (param1) {
                  break L1;
                } else {
                  stackOut_57_0 = (je) ((Object) stackIn_57_0);
                  stackOut_57_1 = stackIn_57_1;
                  stackIn_61_0 = stackOut_57_0;
                  stackIn_61_1 = stackOut_57_1;
                  stackIn_58_0 = stackOut_57_0;
                  stackIn_58_1 = stackOut_57_1;
                  if (bw.field_g) {
                    break L1;
                  } else {
                    stackOut_58_0 = (je) ((Object) stackIn_58_0);
                    stackOut_58_1 = stackIn_58_1;
                    stackIn_61_0 = stackOut_58_0;
                    stackIn_61_1 = stackOut_58_1;
                    stackIn_59_0 = stackOut_58_0;
                    stackIn_59_1 = stackOut_58_1;
                    if (vu.field_M != null) {
                      break L1;
                    } else {
                      stackOut_59_0 = (je) ((Object) stackIn_59_0);
                      stackOut_59_1 = stackIn_59_1;
                      stackIn_61_0 = stackOut_59_0;
                      stackIn_61_1 = stackOut_59_1;
                      stackIn_60_0 = stackOut_59_0;
                      stackIn_60_1 = stackOut_59_1;
                      if (null != no.field_K) {
                        break L1;
                      } else {
                        stackOut_60_0 = (je) ((Object) stackIn_60_0);
                        stackOut_60_1 = stackIn_60_1;
                        stackOut_60_2 = 1;
                        stackIn_62_0 = stackOut_60_0;
                        stackIn_62_1 = stackOut_60_1;
                        stackIn_62_2 = stackOut_60_2;
                        break L0;
                      }
                    }
                  }
                }
              }
            }
            stackOut_61_0 = (je) ((Object) stackIn_61_0);
            stackOut_61_1 = stackIn_61_1;
            stackOut_61_2 = 0;
            stackIn_62_0 = stackOut_61_0;
            stackIn_62_1 = stackOut_61_1;
            stackIn_62_2 = stackOut_61_2;
            break L0;
          }
          L2: {
            L3: {
              ((je) (Object) stackIn_62_0).a(stackIn_62_1 != 0, stackIn_62_2 != 0);
              stackOut_62_0 = ov.field_i;
              stackOut_62_1 = 1;
              stackIn_68_0 = stackOut_62_0;
              stackIn_68_1 = stackOut_62_1;
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              if (!param0) {
                break L3;
              } else {
                stackOut_63_0 = (je) ((Object) stackIn_63_0);
                stackOut_63_1 = stackIn_63_1;
                stackIn_68_0 = stackOut_63_0;
                stackIn_68_1 = stackOut_63_1;
                stackIn_64_0 = stackOut_63_0;
                stackIn_64_1 = stackOut_63_1;
                if (param1) {
                  break L3;
                } else {
                  stackOut_64_0 = (je) ((Object) stackIn_64_0);
                  stackOut_64_1 = stackIn_64_1;
                  stackIn_68_0 = stackOut_64_0;
                  stackIn_68_1 = stackOut_64_1;
                  stackIn_65_0 = stackOut_64_0;
                  stackIn_65_1 = stackOut_64_1;
                  if (bw.field_g) {
                    break L3;
                  } else {
                    stackOut_65_0 = (je) ((Object) stackIn_65_0);
                    stackOut_65_1 = stackIn_65_1;
                    stackIn_68_0 = stackOut_65_0;
                    stackIn_68_1 = stackOut_65_1;
                    stackIn_66_0 = stackOut_65_0;
                    stackIn_66_1 = stackOut_65_1;
                    if (vu.field_M != null) {
                      break L3;
                    } else {
                      stackOut_66_0 = (je) ((Object) stackIn_66_0);
                      stackOut_66_1 = stackIn_66_1;
                      stackIn_68_0 = stackOut_66_0;
                      stackIn_68_1 = stackOut_66_1;
                      stackIn_67_0 = stackOut_66_0;
                      stackIn_67_1 = stackOut_66_1;
                      if (no.field_K != null) {
                        break L3;
                      } else {
                        stackOut_67_0 = (je) ((Object) stackIn_67_0);
                        stackOut_67_1 = stackIn_67_1;
                        stackOut_67_2 = 1;
                        stackIn_69_0 = stackOut_67_0;
                        stackIn_69_1 = stackOut_67_1;
                        stackIn_69_2 = stackOut_67_2;
                        break L2;
                      }
                    }
                  }
                }
              }
            }
            stackOut_68_0 = (je) ((Object) stackIn_68_0);
            stackOut_68_1 = stackIn_68_1;
            stackOut_68_2 = 0;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            stackIn_69_2 = stackOut_68_2;
            break L2;
          }
          L4: {
            L5: {
              ((je) (Object) stackIn_69_0).a(stackIn_69_1 != 0, stackIn_69_2 != 0);
              stackOut_69_0 = qc.field_c;
              stackOut_69_1 = 1;
              stackIn_73_0 = stackOut_69_0;
              stackIn_73_1 = stackOut_69_1;
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              if (!param0) {
                break L5;
              } else {
                stackOut_70_0 = (je) ((Object) stackIn_70_0);
                stackOut_70_1 = stackIn_70_1;
                stackIn_73_0 = stackOut_70_0;
                stackIn_73_1 = stackOut_70_1;
                stackIn_71_0 = stackOut_70_0;
                stackIn_71_1 = stackOut_70_1;
                if (param1) {
                  break L5;
                } else {
                  stackOut_71_0 = (je) ((Object) stackIn_71_0);
                  stackOut_71_1 = stackIn_71_1;
                  stackIn_73_0 = stackOut_71_0;
                  stackIn_73_1 = stackOut_71_1;
                  stackIn_72_0 = stackOut_71_0;
                  stackIn_72_1 = stackOut_71_1;
                  if (!bw.field_g) {
                    break L5;
                  } else {
                    stackOut_72_0 = (je) ((Object) stackIn_72_0);
                    stackOut_72_1 = stackIn_72_1;
                    stackOut_72_2 = 1;
                    stackIn_74_0 = stackOut_72_0;
                    stackIn_74_1 = stackOut_72_1;
                    stackIn_74_2 = stackOut_72_2;
                    break L4;
                  }
                }
              }
            }
            stackOut_73_0 = (je) ((Object) stackIn_73_0);
            stackOut_73_1 = stackIn_73_1;
            stackOut_73_2 = 0;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            stackIn_74_2 = stackOut_73_2;
            break L4;
          }
          L6: {
            ((je) (Object) stackIn_74_0).a(stackIn_74_1 != 0, stackIn_74_2 != 0);
            pj.field_E.field_a.l(10000);
            if (-1 != (cp.field_d.field_yb ^ -1)) {
              cg.field_a = true;
              break L6;
            } else {
              break L6;
            }
          }
          if (param2 >= 60) {
            if (fj.field_d.field_yb != 0) {
              if (bj.field_k) {
                L7: {
                  gu.a(-61, param3);
                  if (var5 == 0) {
                    break L7;
                  } else {
                    mo.field_w = true;
                    break L7;
                  }
                }
                L8: {
                  if (-1 == (pe.field_x.field_yb ^ -1)) {
                    break L8;
                  } else {
                    L9: {
                      if (lm.field_e.length != 1) {
                        break L9;
                      } else {
                        if (mt.field_d == lm.field_e[0]) {
                          break L9;
                        } else {
                          mt.field_d = lm.field_e[0];
                          break L9;
                        }
                      }
                    }
                    qv.a(param3, mt.field_d, 0, true, tr.field_F, 5623);
                    break L8;
                  }
                }
                L10: {
                  if (td.field_g.field_yb != 0) {
                    bw.field_g = false;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                return;
              } else {
                L11: {
                  L12: {
                    if ((df.field_M ^ -1) < -1) {
                      break L12;
                    } else {
                      if (2 <= hi.field_j) {
                        if (br.field_f[12]) {
                          break L12;
                        } else {
                          mo.field_w = true;
                          break L11;
                        }
                      } else {
                        mo.field_w = true;
                        break L11;
                      }
                    }
                  }
                  gu.a(-61, param3);
                  if (var5 == 0) {
                    break L11;
                  } else {
                    mo.field_w = true;
                    break L11;
                  }
                }
                L13: {
                  if (-1 == (pe.field_x.field_yb ^ -1)) {
                    break L13;
                  } else {
                    L14: {
                      if (lm.field_e.length != 1) {
                        break L14;
                      } else {
                        if (mt.field_d == lm.field_e[0]) {
                          break L14;
                        } else {
                          mt.field_d = lm.field_e[0];
                          break L14;
                        }
                      }
                    }
                    qv.a(param3, mt.field_d, 0, true, tr.field_F, 5623);
                    break L13;
                  }
                }
                L15: {
                  if (td.field_g.field_yb != 0) {
                    bw.field_g = false;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                return;
              }
            } else {
              L16: {
                if (-1 == (pe.field_x.field_yb ^ -1)) {
                  break L16;
                } else {
                  L17: {
                    if (lm.field_e.length != 1) {
                      break L17;
                    } else {
                      if (mt.field_d == lm.field_e[0]) {
                        break L17;
                      } else {
                        mt.field_d = lm.field_e[0];
                        break L17;
                      }
                    }
                  }
                  qv.a(param3, mt.field_d, 0, true, tr.field_F, 5623);
                  break L16;
                }
              }
              L18: {
                if (td.field_g.field_yb != 0) {
                  bw.field_g = false;
                  break L18;
                } else {
                  break L18;
                }
              }
              return;
            }
          } else {
            return;
          }
        } else {
          t.field_g.field_X = null;
          if (var5 == 0) {
            L19: {
              L20: {
                stackOut_122_0 = no.field_T;
                stackOut_122_1 = 1;
                stackIn_128_0 = stackOut_122_0;
                stackIn_128_1 = stackOut_122_1;
                stackIn_123_0 = stackOut_122_0;
                stackIn_123_1 = stackOut_122_1;
                if (!param0) {
                  break L20;
                } else {
                  stackOut_123_0 = (je) ((Object) stackIn_123_0);
                  stackOut_123_1 = stackIn_123_1;
                  stackIn_128_0 = stackOut_123_0;
                  stackIn_128_1 = stackOut_123_1;
                  stackIn_124_0 = stackOut_123_0;
                  stackIn_124_1 = stackOut_123_1;
                  if (param1) {
                    break L20;
                  } else {
                    stackOut_124_0 = (je) ((Object) stackIn_124_0);
                    stackOut_124_1 = stackIn_124_1;
                    stackIn_128_0 = stackOut_124_0;
                    stackIn_128_1 = stackOut_124_1;
                    stackIn_125_0 = stackOut_124_0;
                    stackIn_125_1 = stackOut_124_1;
                    if (bw.field_g) {
                      break L20;
                    } else {
                      stackOut_125_0 = (je) ((Object) stackIn_125_0);
                      stackOut_125_1 = stackIn_125_1;
                      stackIn_128_0 = stackOut_125_0;
                      stackIn_128_1 = stackOut_125_1;
                      stackIn_126_0 = stackOut_125_0;
                      stackIn_126_1 = stackOut_125_1;
                      if (vu.field_M != null) {
                        break L20;
                      } else {
                        stackOut_126_0 = (je) ((Object) stackIn_126_0);
                        stackOut_126_1 = stackIn_126_1;
                        stackIn_128_0 = stackOut_126_0;
                        stackIn_128_1 = stackOut_126_1;
                        stackIn_127_0 = stackOut_126_0;
                        stackIn_127_1 = stackOut_126_1;
                        if (null != no.field_K) {
                          break L20;
                        } else {
                          stackOut_127_0 = (je) ((Object) stackIn_127_0);
                          stackOut_127_1 = stackIn_127_1;
                          stackOut_127_2 = 1;
                          stackIn_129_0 = stackOut_127_0;
                          stackIn_129_1 = stackOut_127_1;
                          stackIn_129_2 = stackOut_127_2;
                          break L19;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_128_0 = (je) ((Object) stackIn_128_0);
              stackOut_128_1 = stackIn_128_1;
              stackOut_128_2 = 0;
              stackIn_129_0 = stackOut_128_0;
              stackIn_129_1 = stackOut_128_1;
              stackIn_129_2 = stackOut_128_2;
              break L19;
            }
            L21: {
              L22: {
                ((je) (Object) stackIn_129_0).a(stackIn_129_1 != 0, stackIn_129_2 != 0);
                stackOut_129_0 = ov.field_i;
                stackOut_129_1 = 1;
                stackIn_135_0 = stackOut_129_0;
                stackIn_135_1 = stackOut_129_1;
                stackIn_130_0 = stackOut_129_0;
                stackIn_130_1 = stackOut_129_1;
                if (!param0) {
                  break L22;
                } else {
                  stackOut_130_0 = (je) ((Object) stackIn_130_0);
                  stackOut_130_1 = stackIn_130_1;
                  stackIn_135_0 = stackOut_130_0;
                  stackIn_135_1 = stackOut_130_1;
                  stackIn_131_0 = stackOut_130_0;
                  stackIn_131_1 = stackOut_130_1;
                  if (param1) {
                    break L22;
                  } else {
                    stackOut_131_0 = (je) ((Object) stackIn_131_0);
                    stackOut_131_1 = stackIn_131_1;
                    stackIn_135_0 = stackOut_131_0;
                    stackIn_135_1 = stackOut_131_1;
                    stackIn_132_0 = stackOut_131_0;
                    stackIn_132_1 = stackOut_131_1;
                    if (bw.field_g) {
                      break L22;
                    } else {
                      stackOut_132_0 = (je) ((Object) stackIn_132_0);
                      stackOut_132_1 = stackIn_132_1;
                      stackIn_135_0 = stackOut_132_0;
                      stackIn_135_1 = stackOut_132_1;
                      stackIn_133_0 = stackOut_132_0;
                      stackIn_133_1 = stackOut_132_1;
                      if (vu.field_M != null) {
                        break L22;
                      } else {
                        stackOut_133_0 = (je) ((Object) stackIn_133_0);
                        stackOut_133_1 = stackIn_133_1;
                        stackIn_135_0 = stackOut_133_0;
                        stackIn_135_1 = stackOut_133_1;
                        stackIn_134_0 = stackOut_133_0;
                        stackIn_134_1 = stackOut_133_1;
                        if (no.field_K != null) {
                          break L22;
                        } else {
                          stackOut_134_0 = (je) ((Object) stackIn_134_0);
                          stackOut_134_1 = stackIn_134_1;
                          stackOut_134_2 = 1;
                          stackIn_136_0 = stackOut_134_0;
                          stackIn_136_1 = stackOut_134_1;
                          stackIn_136_2 = stackOut_134_2;
                          break L21;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_135_0 = (je) ((Object) stackIn_135_0);
              stackOut_135_1 = stackIn_135_1;
              stackOut_135_2 = 0;
              stackIn_136_0 = stackOut_135_0;
              stackIn_136_1 = stackOut_135_1;
              stackIn_136_2 = stackOut_135_2;
              break L21;
            }
            L23: {
              L24: {
                ((je) (Object) stackIn_136_0).a(stackIn_136_1 != 0, stackIn_136_2 != 0);
                stackOut_136_0 = qc.field_c;
                stackOut_136_1 = 1;
                stackIn_140_0 = stackOut_136_0;
                stackIn_140_1 = stackOut_136_1;
                stackIn_137_0 = stackOut_136_0;
                stackIn_137_1 = stackOut_136_1;
                if (!param0) {
                  break L24;
                } else {
                  stackOut_137_0 = (je) ((Object) stackIn_137_0);
                  stackOut_137_1 = stackIn_137_1;
                  stackIn_140_0 = stackOut_137_0;
                  stackIn_140_1 = stackOut_137_1;
                  stackIn_138_0 = stackOut_137_0;
                  stackIn_138_1 = stackOut_137_1;
                  if (param1) {
                    break L24;
                  } else {
                    stackOut_138_0 = (je) ((Object) stackIn_138_0);
                    stackOut_138_1 = stackIn_138_1;
                    stackIn_140_0 = stackOut_138_0;
                    stackIn_140_1 = stackOut_138_1;
                    stackIn_139_0 = stackOut_138_0;
                    stackIn_139_1 = stackOut_138_1;
                    if (!bw.field_g) {
                      break L24;
                    } else {
                      stackOut_139_0 = (je) ((Object) stackIn_139_0);
                      stackOut_139_1 = stackIn_139_1;
                      stackOut_139_2 = 1;
                      stackIn_141_0 = stackOut_139_0;
                      stackIn_141_1 = stackOut_139_1;
                      stackIn_141_2 = stackOut_139_2;
                      break L23;
                    }
                  }
                }
              }
              stackOut_140_0 = (je) ((Object) stackIn_140_0);
              stackOut_140_1 = stackIn_140_1;
              stackOut_140_2 = 0;
              stackIn_141_0 = stackOut_140_0;
              stackIn_141_1 = stackOut_140_1;
              stackIn_141_2 = stackOut_140_2;
              break L23;
            }
            L25: {
              ((je) (Object) stackIn_141_0).a(stackIn_141_1 != 0, stackIn_141_2 != 0);
              pj.field_E.field_a.l(10000);
              if (-1 != (cp.field_d.field_yb ^ -1)) {
                cg.field_a = true;
                break L25;
              } else {
                break L25;
              }
            }
            if (param2 >= 60) {
              if (fj.field_d.field_yb != 0) {
                if (!bj.field_k) {
                  if ((df.field_M ^ -1) >= -1) {
                    if (2 > hi.field_j) {
                      L26: {
                        mo.field_w = true;
                        if (-1 == (pe.field_x.field_yb ^ -1)) {
                          break L26;
                        } else {
                          L27: {
                            if (lm.field_e.length != 1) {
                              break L27;
                            } else {
                              if (mt.field_d == lm.field_e[0]) {
                                break L27;
                              } else {
                                L28: {
                                  mt.field_d = lm.field_e[0];
                                  qv.a(param3, mt.field_d, 0, true, tr.field_F, 5623);
                                  if (td.field_g.field_yb != 0) {
                                    bw.field_g = false;
                                    break L28;
                                  } else {
                                    break L28;
                                  }
                                }
                                return;
                              }
                            }
                          }
                          qv.a(param3, mt.field_d, 0, true, tr.field_F, 5623);
                          break L26;
                        }
                      }
                      L29: {
                        if (td.field_g.field_yb != 0) {
                          bw.field_g = false;
                          break L29;
                        } else {
                          break L29;
                        }
                      }
                      return;
                    } else {
                      if (!br.field_f[12]) {
                        L30: {
                          mo.field_w = true;
                          if (-1 == (pe.field_x.field_yb ^ -1)) {
                            break L30;
                          } else {
                            L31: {
                              if (lm.field_e.length != 1) {
                                break L31;
                              } else {
                                if (mt.field_d == lm.field_e[0]) {
                                  break L31;
                                } else {
                                  L32: {
                                    mt.field_d = lm.field_e[0];
                                    qv.a(param3, mt.field_d, 0, true, tr.field_F, 5623);
                                    if (td.field_g.field_yb != 0) {
                                      bw.field_g = false;
                                      break L32;
                                    } else {
                                      break L32;
                                    }
                                  }
                                  return;
                                }
                              }
                            }
                            qv.a(param3, mt.field_d, 0, true, tr.field_F, 5623);
                            break L30;
                          }
                        }
                        L33: {
                          if (td.field_g.field_yb != 0) {
                            bw.field_g = false;
                            break L33;
                          } else {
                            break L33;
                          }
                        }
                        return;
                      } else {
                        gu.a(-61, param3);
                        if (var5 == 0) {
                          L34: {
                            if (-1 == (pe.field_x.field_yb ^ -1)) {
                              break L34;
                            } else {
                              L35: {
                                if (lm.field_e.length != 1) {
                                  break L35;
                                } else {
                                  if (mt.field_d == lm.field_e[0]) {
                                    break L35;
                                  } else {
                                    L36: {
                                      mt.field_d = lm.field_e[0];
                                      qv.a(param3, mt.field_d, 0, true, tr.field_F, 5623);
                                      if (td.field_g.field_yb != 0) {
                                        bw.field_g = false;
                                        break L36;
                                      } else {
                                        break L36;
                                      }
                                    }
                                    return;
                                  }
                                }
                              }
                              qv.a(param3, mt.field_d, 0, true, tr.field_F, 5623);
                              break L34;
                            }
                          }
                          L37: {
                            if (td.field_g.field_yb != 0) {
                              bw.field_g = false;
                              break L37;
                            } else {
                              break L37;
                            }
                          }
                          return;
                        } else {
                          L38: {
                            mo.field_w = true;
                            if (-1 == (pe.field_x.field_yb ^ -1)) {
                              break L38;
                            } else {
                              L39: {
                                if (lm.field_e.length != 1) {
                                  break L39;
                                } else {
                                  if (mt.field_d == lm.field_e[0]) {
                                    break L39;
                                  } else {
                                    mt.field_d = lm.field_e[0];
                                    break L39;
                                  }
                                }
                              }
                              qv.a(param3, mt.field_d, 0, true, tr.field_F, 5623);
                              break L38;
                            }
                          }
                          L40: {
                            if (td.field_g.field_yb != 0) {
                              bw.field_g = false;
                              break L40;
                            } else {
                              break L40;
                            }
                          }
                          return;
                        }
                      }
                    }
                  } else {
                    gu.a(-61, param3);
                    if (var5 == 0) {
                      if (-1 != (pe.field_x.field_yb ^ -1)) {
                        L41: {
                          if (lm.field_e.length != 1) {
                            break L41;
                          } else {
                            if (mt.field_d == lm.field_e[0]) {
                              break L41;
                            } else {
                              L42: {
                                mt.field_d = lm.field_e[0];
                                qv.a(param3, mt.field_d, 0, true, tr.field_F, 5623);
                                if (td.field_g.field_yb != 0) {
                                  bw.field_g = false;
                                  break L42;
                                } else {
                                  break L42;
                                }
                              }
                              return;
                            }
                          }
                        }
                        L43: {
                          qv.a(param3, mt.field_d, 0, true, tr.field_F, 5623);
                          if (td.field_g.field_yb != 0) {
                            bw.field_g = false;
                            break L43;
                          } else {
                            break L43;
                          }
                        }
                        return;
                      } else {
                        L44: {
                          if (td.field_g.field_yb != 0) {
                            bw.field_g = false;
                            break L44;
                          } else {
                            break L44;
                          }
                        }
                        return;
                      }
                    } else {
                      mo.field_w = true;
                      if (-1 != (pe.field_x.field_yb ^ -1)) {
                        if (lm.field_e.length == 1) {
                          if (mt.field_d != lm.field_e[0]) {
                            L45: {
                              mt.field_d = lm.field_e[0];
                              qv.a(param3, mt.field_d, 0, true, tr.field_F, 5623);
                              if (td.field_g.field_yb != 0) {
                                bw.field_g = false;
                                break L45;
                              } else {
                                break L45;
                              }
                            }
                            return;
                          } else {
                            L46: {
                              qv.a(param3, mt.field_d, 0, true, tr.field_F, 5623);
                              if (td.field_g.field_yb != 0) {
                                bw.field_g = false;
                                break L46;
                              } else {
                                break L46;
                              }
                            }
                            return;
                          }
                        } else {
                          L47: {
                            qv.a(param3, mt.field_d, 0, true, tr.field_F, 5623);
                            if (td.field_g.field_yb != 0) {
                              bw.field_g = false;
                              break L47;
                            } else {
                              break L47;
                            }
                          }
                          return;
                        }
                      } else {
                        L48: {
                          if (td.field_g.field_yb != 0) {
                            bw.field_g = false;
                            break L48;
                          } else {
                            break L48;
                          }
                        }
                        return;
                      }
                    }
                  }
                } else {
                  gu.a(-61, param3);
                  if (var5 == 0) {
                    if (-1 != (pe.field_x.field_yb ^ -1)) {
                      if (lm.field_e.length == 1) {
                        if (mt.field_d == lm.field_e[0]) {
                          L49: {
                            qv.a(param3, mt.field_d, 0, true, tr.field_F, 5623);
                            if (td.field_g.field_yb != 0) {
                              bw.field_g = false;
                              break L49;
                            } else {
                              break L49;
                            }
                          }
                          return;
                        } else {
                          L50: {
                            mt.field_d = lm.field_e[0];
                            qv.a(param3, mt.field_d, 0, true, tr.field_F, 5623);
                            if (td.field_g.field_yb != 0) {
                              bw.field_g = false;
                              break L50;
                            } else {
                              break L50;
                            }
                          }
                          return;
                        }
                      } else {
                        L51: {
                          qv.a(param3, mt.field_d, 0, true, tr.field_F, 5623);
                          if (td.field_g.field_yb != 0) {
                            bw.field_g = false;
                            break L51;
                          } else {
                            break L51;
                          }
                        }
                        return;
                      }
                    } else {
                      L52: {
                        if (td.field_g.field_yb != 0) {
                          bw.field_g = false;
                          break L52;
                        } else {
                          break L52;
                        }
                      }
                      return;
                    }
                  } else {
                    mo.field_w = true;
                    if (-1 != (pe.field_x.field_yb ^ -1)) {
                      if (lm.field_e.length == 1) {
                        if (mt.field_d != lm.field_e[0]) {
                          L53: {
                            mt.field_d = lm.field_e[0];
                            qv.a(param3, mt.field_d, 0, true, tr.field_F, 5623);
                            if (td.field_g.field_yb != 0) {
                              bw.field_g = false;
                              break L53;
                            } else {
                              break L53;
                            }
                          }
                          return;
                        } else {
                          L54: {
                            qv.a(param3, mt.field_d, 0, true, tr.field_F, 5623);
                            if (td.field_g.field_yb != 0) {
                              bw.field_g = false;
                              break L54;
                            } else {
                              break L54;
                            }
                          }
                          return;
                        }
                      } else {
                        L55: {
                          qv.a(param3, mt.field_d, 0, true, tr.field_F, 5623);
                          if (td.field_g.field_yb != 0) {
                            bw.field_g = false;
                            break L55;
                          } else {
                            break L55;
                          }
                        }
                        return;
                      }
                    } else {
                      L56: {
                        if (td.field_g.field_yb != 0) {
                          bw.field_g = false;
                          break L56;
                        } else {
                          break L56;
                        }
                      }
                      return;
                    }
                  }
                }
              } else {
                if (-1 != (pe.field_x.field_yb ^ -1)) {
                  if (lm.field_e.length == 1) {
                    if (mt.field_d != lm.field_e[0]) {
                      L57: {
                        mt.field_d = lm.field_e[0];
                        qv.a(param3, mt.field_d, 0, true, tr.field_F, 5623);
                        if (td.field_g.field_yb != 0) {
                          bw.field_g = false;
                          break L57;
                        } else {
                          break L57;
                        }
                      }
                      return;
                    } else {
                      L58: {
                        qv.a(param3, mt.field_d, 0, true, tr.field_F, 5623);
                        if (td.field_g.field_yb != 0) {
                          bw.field_g = false;
                          break L58;
                        } else {
                          break L58;
                        }
                      }
                      return;
                    }
                  } else {
                    L59: {
                      qv.a(param3, mt.field_d, 0, true, tr.field_F, 5623);
                      if (td.field_g.field_yb != 0) {
                        bw.field_g = false;
                        break L59;
                      } else {
                        break L59;
                      }
                    }
                    return;
                  }
                } else {
                  L60: {
                    if (td.field_g.field_yb != 0) {
                      bw.field_g = false;
                      break L60;
                    } else {
                      break L60;
                    }
                  }
                  return;
                }
              }
            } else {
              return;
            }
          } else {
            L61: {
              L62: {
                t.field_g.field_X = fo.a(4800, ns.field_F, new String[]{Integer.toString(al.field_g)});
                stackOut_2_0 = no.field_T;
                stackOut_2_1 = 1;
                stackIn_8_0 = stackOut_2_0;
                stackIn_8_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (!param0) {
                  break L62;
                } else {
                  stackOut_3_0 = (je) ((Object) stackIn_3_0);
                  stackOut_3_1 = stackIn_3_1;
                  stackIn_8_0 = stackOut_3_0;
                  stackIn_8_1 = stackOut_3_1;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  if (param1) {
                    break L62;
                  } else {
                    stackOut_4_0 = (je) ((Object) stackIn_4_0);
                    stackOut_4_1 = stackIn_4_1;
                    stackIn_8_0 = stackOut_4_0;
                    stackIn_8_1 = stackOut_4_1;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    if (bw.field_g) {
                      break L62;
                    } else {
                      stackOut_5_0 = (je) ((Object) stackIn_5_0);
                      stackOut_5_1 = stackIn_5_1;
                      stackIn_8_0 = stackOut_5_0;
                      stackIn_8_1 = stackOut_5_1;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      if (vu.field_M != null) {
                        break L62;
                      } else {
                        stackOut_6_0 = (je) ((Object) stackIn_6_0);
                        stackOut_6_1 = stackIn_6_1;
                        stackIn_8_0 = stackOut_6_0;
                        stackIn_8_1 = stackOut_6_1;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        if (null != no.field_K) {
                          break L62;
                        } else {
                          stackOut_7_0 = (je) ((Object) stackIn_7_0);
                          stackOut_7_1 = stackIn_7_1;
                          stackOut_7_2 = 1;
                          stackIn_9_0 = stackOut_7_0;
                          stackIn_9_1 = stackOut_7_1;
                          stackIn_9_2 = stackOut_7_2;
                          break L61;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_8_0 = (je) ((Object) stackIn_8_0);
              stackOut_8_1 = stackIn_8_1;
              stackOut_8_2 = 0;
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L61;
            }
            L63: {
              L64: {
                ((je) (Object) stackIn_9_0).a(stackIn_9_1 != 0, stackIn_9_2 != 0);
                stackOut_9_0 = ov.field_i;
                stackOut_9_1 = 1;
                stackIn_15_0 = stackOut_9_0;
                stackIn_15_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (!param0) {
                  break L64;
                } else {
                  stackOut_10_0 = (je) ((Object) stackIn_10_0);
                  stackOut_10_1 = stackIn_10_1;
                  stackIn_15_0 = stackOut_10_0;
                  stackIn_15_1 = stackOut_10_1;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  if (param1) {
                    break L64;
                  } else {
                    stackOut_11_0 = (je) ((Object) stackIn_11_0);
                    stackOut_11_1 = stackIn_11_1;
                    stackIn_15_0 = stackOut_11_0;
                    stackIn_15_1 = stackOut_11_1;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    if (bw.field_g) {
                      break L64;
                    } else {
                      stackOut_12_0 = (je) ((Object) stackIn_12_0);
                      stackOut_12_1 = stackIn_12_1;
                      stackIn_15_0 = stackOut_12_0;
                      stackIn_15_1 = stackOut_12_1;
                      stackIn_13_0 = stackOut_12_0;
                      stackIn_13_1 = stackOut_12_1;
                      if (vu.field_M != null) {
                        break L64;
                      } else {
                        stackOut_13_0 = (je) ((Object) stackIn_13_0);
                        stackOut_13_1 = stackIn_13_1;
                        stackIn_15_0 = stackOut_13_0;
                        stackIn_15_1 = stackOut_13_1;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        if (no.field_K != null) {
                          break L64;
                        } else {
                          stackOut_14_0 = (je) ((Object) stackIn_14_0);
                          stackOut_14_1 = stackIn_14_1;
                          stackOut_14_2 = 1;
                          stackIn_16_0 = stackOut_14_0;
                          stackIn_16_1 = stackOut_14_1;
                          stackIn_16_2 = stackOut_14_2;
                          break L63;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_15_0 = (je) ((Object) stackIn_15_0);
              stackOut_15_1 = stackIn_15_1;
              stackOut_15_2 = 0;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L63;
            }
            L65: {
              L66: {
                ((je) (Object) stackIn_16_0).a(stackIn_16_1 != 0, stackIn_16_2 != 0);
                stackOut_16_0 = qc.field_c;
                stackOut_16_1 = 1;
                stackIn_20_0 = stackOut_16_0;
                stackIn_20_1 = stackOut_16_1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                if (!param0) {
                  break L66;
                } else {
                  stackOut_17_0 = (je) ((Object) stackIn_17_0);
                  stackOut_17_1 = stackIn_17_1;
                  stackIn_20_0 = stackOut_17_0;
                  stackIn_20_1 = stackOut_17_1;
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  if (param1) {
                    break L66;
                  } else {
                    stackOut_18_0 = (je) ((Object) stackIn_18_0);
                    stackOut_18_1 = stackIn_18_1;
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_20_1 = stackOut_18_1;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    if (!bw.field_g) {
                      break L66;
                    } else {
                      stackOut_19_0 = (je) ((Object) stackIn_19_0);
                      stackOut_19_1 = stackIn_19_1;
                      stackOut_19_2 = 1;
                      stackIn_21_0 = stackOut_19_0;
                      stackIn_21_1 = stackOut_19_1;
                      stackIn_21_2 = stackOut_19_2;
                      break L65;
                    }
                  }
                }
              }
              stackOut_20_0 = (je) ((Object) stackIn_20_0);
              stackOut_20_1 = stackIn_20_1;
              stackOut_20_2 = 0;
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L65;
            }
            L67: {
              ((je) (Object) stackIn_21_0).a(stackIn_21_1 != 0, stackIn_21_2 != 0);
              pj.field_E.field_a.l(10000);
              if (-1 != (cp.field_d.field_yb ^ -1)) {
                cg.field_a = true;
                break L67;
              } else {
                break L67;
              }
            }
            if (param2 >= 60) {
              L68: {
                if (fj.field_d.field_yb != 0) {
                  L69: {
                    if (bj.field_k) {
                      break L69;
                    } else {
                      if ((df.field_M ^ -1) < -1) {
                        break L69;
                      } else {
                        if (2 <= hi.field_j) {
                          if (br.field_f[12]) {
                            break L69;
                          } else {
                            mo.field_w = true;
                            break L68;
                          }
                        } else {
                          mo.field_w = true;
                          break L68;
                        }
                      }
                    }
                  }
                  gu.a(-61, param3);
                  if (var5 == 0) {
                    break L68;
                  } else {
                    mo.field_w = true;
                    break L68;
                  }
                } else {
                  break L68;
                }
              }
              if (-1 == (pe.field_x.field_yb ^ -1)) {
                L70: {
                  if (td.field_g.field_yb != 0) {
                    bw.field_g = false;
                    break L70;
                  } else {
                    break L70;
                  }
                }
                return;
              } else {
                L71: {
                  if (lm.field_e.length != 1) {
                    qv.a(param3, mt.field_d, 0, true, tr.field_F, 5623);
                    break L71;
                  } else {
                    if (mt.field_d == lm.field_e[0]) {
                      qv.a(param3, mt.field_d, 0, true, tr.field_F, 5623);
                      break L71;
                    } else {
                      mt.field_d = lm.field_e[0];
                      qv.a(param3, mt.field_d, 0, true, tr.field_F, 5623);
                      break L71;
                    }
                  }
                }
                L72: {
                  if (td.field_g.field_yb != 0) {
                    bw.field_g = false;
                    break L72;
                  } else {
                    break L72;
                  }
                }
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    static {
        field_e = true;
        field_d = "Hide chat";
        field_g = "Members only.";
    }
}
