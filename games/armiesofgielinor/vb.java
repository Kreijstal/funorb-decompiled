/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb extends tc {
    eo field_u;
    int field_v;
    boolean field_z;
    private ha field_k;
    int field_m;
    int field_x;
    private int field_p;
    private boolean field_s;
    boolean field_w;
    boolean field_n;
    static at field_q;
    private ic field_y;
    pa field_B;
    oj field_r;
    static String field_l;
    static boolean[] field_o;
    static wk field_t;

    final boolean e(int param0) {
        int var2 = 0;
        int var3_int = 0;
        kn var3 = null;
        int var4 = 0;
        int var5 = 0;
        nn stackIn_16_0 = null;
        nn stackIn_17_0 = null;
        nn stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_94_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_116_0 = 0;
        int stackIn_120_0 = 0;
        int stackIn_127_0 = 0;
        int stackIn_131_0 = 0;
        int stackIn_135_0 = 0;
        int stackOut_134_0 = 0;
        int stackOut_133_0 = 0;
        int stackOut_130_0 = 0;
        int stackOut_129_0 = 0;
        int stackOut_126_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_119_0 = 0;
        int stackOut_118_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_114_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_92_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        nn stackOut_15_0 = null;
        nn stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        nn stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        L0: {
          var5 = ArmiesOfGielinor.field_M ? 1 : 0;
          var2 = 0;
          if (0 != ((vb) this).field_r.field_m) {
            if (((vb) this).field_r.field_m == 1) {
              L1: {
                ((vb) this).field_z = true;
                ((vb) this).field_B = (pa) (Object) new sk(((vb) this).field_k, ((vb) this).field_y.field_M, (vb) this);
                if (!((vb) this).field_B.a(((vb) this).field_r, (byte) 57)) {
                  stackOut_134_0 = 0;
                  stackIn_135_0 = stackOut_134_0;
                  break L1;
                } else {
                  stackOut_133_0 = 1;
                  stackIn_135_0 = stackOut_133_0;
                  break L1;
                }
              }
              var2 = stackIn_135_0;
              break L0;
            } else {
              if (((vb) this).field_r.field_m == 6) {
                L2: {
                  ((vb) this).field_z = false;
                  ((vb) this).field_B = (pa) (Object) new tb(((vb) this).field_k, ((vb) this).field_y.field_M, (vb) this);
                  if (!((vb) this).field_B.a(((vb) this).field_r, (byte) 57)) {
                    stackOut_130_0 = 0;
                    stackIn_131_0 = stackOut_130_0;
                    break L2;
                  } else {
                    stackOut_129_0 = 1;
                    stackIn_131_0 = stackOut_129_0;
                    break L2;
                  }
                }
                var2 = stackIn_131_0;
                break L0;
              } else {
                if (((vb) this).field_r.field_m != 21) {
                  if (((vb) this).field_r.field_m != 26) {
                    if (((vb) this).field_r.field_m == 5) {
                      L3: {
                        var3 = (kn) (Object) ((vb) this).field_r;
                        if (var3.b(((vb) this).field_k, -75)) {
                          boolean discarded$1 = new hp(((vb) this).field_k.c(var3.field_w.field_w, true, var3.field_w.field_J), true).a(((vb) this).field_y.field_pc, (byte) -86, ((vb) this).field_y);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        ((vb) this).field_z = false;
                        ((vb) this).field_B = (pa) (Object) new tb(((vb) this).field_k, ((vb) this).field_y.field_M, (vb) this);
                        if (!((vb) this).field_B.a(((vb) this).field_r, (byte) 57)) {
                          stackOut_126_0 = 0;
                          stackIn_127_0 = stackOut_126_0;
                          break L4;
                        } else {
                          stackOut_125_0 = 1;
                          stackIn_127_0 = stackOut_125_0;
                          break L4;
                        }
                      }
                      var2 = stackIn_127_0;
                      break L0;
                    } else {
                      if (((vb) this).field_r.field_m == 7) {
                        L5: {
                          ((vb) this).field_z = false;
                          ((vb) this).field_B = (pa) (Object) new qv(((vb) this).field_k, ((vb) this).field_y.field_M, (vb) this);
                          if (!((vb) this).field_B.a(((vb) this).field_r, (byte) 57)) {
                            stackOut_119_0 = 0;
                            stackIn_120_0 = stackOut_119_0;
                            break L5;
                          } else {
                            stackOut_118_0 = 1;
                            stackIn_120_0 = stackOut_118_0;
                            break L5;
                          }
                        }
                        var2 = stackIn_120_0;
                        break L0;
                      } else {
                        if (10 == ((vb) this).field_r.field_m) {
                          L6: {
                            ((vb) this).field_z = false;
                            ((vb) this).field_B = (pa) (Object) new tb(((vb) this).field_k, ((vb) this).field_y.field_M, (vb) this);
                            if (!((vb) this).field_B.a(((vb) this).field_r, (byte) 57)) {
                              stackOut_115_0 = 0;
                              stackIn_116_0 = stackOut_115_0;
                              break L6;
                            } else {
                              stackOut_114_0 = 1;
                              stackIn_116_0 = stackOut_114_0;
                              break L6;
                            }
                          }
                          var2 = stackIn_116_0;
                          break L0;
                        } else {
                          if (((vb) this).field_r.field_m == 11) {
                            L7: {
                              ((vb) this).field_z = false;
                              ((vb) this).field_r.a(((vb) this).field_k, -26661);
                              ((vb) this).field_B = (pa) (Object) new tb(((vb) this).field_k, ((vb) this).field_y.field_M, (vb) this);
                              if (!((vb) this).field_B.a(((vb) this).field_r, (byte) 57)) {
                                stackOut_111_0 = 0;
                                stackIn_112_0 = stackOut_111_0;
                                break L7;
                              } else {
                                stackOut_110_0 = 1;
                                stackIn_112_0 = stackOut_110_0;
                                break L7;
                              }
                            }
                            var2 = stackIn_112_0;
                            break L0;
                          } else {
                            if (((vb) this).field_r.field_m != 15) {
                              if (((vb) this).field_r.field_m != 14) {
                                if (12 != ((vb) this).field_r.field_m) {
                                  if (((vb) this).field_r.field_m != 16) {
                                    if (((vb) this).field_r.field_m == 17) {
                                      L8: {
                                        ((vb) this).field_z = false;
                                        ((vb) this).field_B = (pa) (Object) new tb(((vb) this).field_k, ((vb) this).field_y.field_M, (vb) this);
                                        if (!((vb) this).field_B.a(((vb) this).field_r, (byte) 57)) {
                                          stackOut_107_0 = 0;
                                          stackIn_108_0 = stackOut_107_0;
                                          break L8;
                                        } else {
                                          stackOut_106_0 = 1;
                                          stackIn_108_0 = stackOut_106_0;
                                          break L8;
                                        }
                                      }
                                      var2 = stackIn_108_0;
                                      break L0;
                                    } else {
                                      if (((vb) this).field_r.field_m != 3) {
                                        if (18 == ((vb) this).field_r.field_m) {
                                          L9: {
                                            ((vb) this).field_z = false;
                                            ((vb) this).field_B = (pa) (Object) new tb(((vb) this).field_k, ((vb) this).field_y.field_M, (vb) this);
                                            if (!((vb) this).field_B.a(((vb) this).field_r, (byte) 57)) {
                                              stackOut_103_0 = 0;
                                              stackIn_104_0 = stackOut_103_0;
                                              break L9;
                                            } else {
                                              stackOut_102_0 = 1;
                                              stackIn_104_0 = stackOut_102_0;
                                              break L9;
                                            }
                                          }
                                          var2 = stackIn_104_0;
                                          break L0;
                                        } else {
                                          if (((vb) this).field_r.field_m != 20) {
                                            if (((vb) this).field_r.field_m != 19) {
                                              if (((vb) this).field_r.field_m != 2) {
                                                if (((vb) this).field_r.field_m == 25) {
                                                  L10: {
                                                    ((vb) this).field_z = false;
                                                    ((vb) this).field_n = true;
                                                    ((vb) this).field_B = (pa) (Object) new ql(((vb) this).field_k, ((vb) this).field_y.field_M, (vb) this);
                                                    if (!((vb) this).field_B.a(((vb) this).field_r, (byte) 57)) {
                                                      stackOut_99_0 = 0;
                                                      stackIn_100_0 = stackOut_99_0;
                                                      break L10;
                                                    } else {
                                                      stackOut_98_0 = 1;
                                                      stackIn_100_0 = stackOut_98_0;
                                                      break L10;
                                                    }
                                                  }
                                                  var2 = stackIn_100_0;
                                                  break L0;
                                                } else {
                                                  if (((vb) this).field_r.field_m != 23) {
                                                    if (((vb) this).field_r.field_m != 24) {
                                                      if (((vb) this).field_r.field_m != 27) {
                                                        break L0;
                                                      } else {
                                                        ((vb) this).field_z = false;
                                                        ((vb) this).field_n = false;
                                                        var2 = 1;
                                                        break L0;
                                                      }
                                                    } else {
                                                      L11: {
                                                        ((vb) this).field_z = true;
                                                        ((vb) this).field_n = false;
                                                        ((vb) this).field_B = (pa) (Object) new ql(((vb) this).field_k, ((vb) this).field_y.field_M, (vb) this);
                                                        if (((vb) this).field_B.a(((vb) this).field_r, (byte) 57)) {
                                                          if (-1 < ((vb) this).field_y.field_q) {
                                                            stackOut_92_0 = 1;
                                                            stackIn_94_0 = stackOut_92_0;
                                                            break L11;
                                                          } else {
                                                            stackOut_91_0 = 0;
                                                            stackIn_94_0 = stackOut_91_0;
                                                            break L11;
                                                          }
                                                        } else {
                                                          stackOut_89_0 = 0;
                                                          stackIn_94_0 = stackOut_89_0;
                                                          break L11;
                                                        }
                                                      }
                                                      var2 = stackIn_94_0;
                                                      break L0;
                                                    }
                                                  } else {
                                                    L12: {
                                                      ((vb) this).field_n = true;
                                                      ((vb) this).field_z = false;
                                                      ((vb) this).field_B = (pa) (Object) new ql(((vb) this).field_k, ((vb) this).field_y.field_M, (vb) this);
                                                      if (!((vb) this).field_B.a(((vb) this).field_r, (byte) 57)) {
                                                        stackOut_85_0 = 0;
                                                        stackIn_86_0 = stackOut_85_0;
                                                        break L12;
                                                      } else {
                                                        stackOut_84_0 = 1;
                                                        stackIn_86_0 = stackOut_84_0;
                                                        break L12;
                                                      }
                                                    }
                                                    var2 = stackIn_86_0;
                                                    break L0;
                                                  }
                                                }
                                              } else {
                                                L13: {
                                                  ((vb) this).field_n = true;
                                                  ((vb) this).field_z = false;
                                                  ((vb) this).field_B = (pa) (Object) new ql(((vb) this).field_k, ((vb) this).field_y.field_M, (vb) this);
                                                  if (!((vb) this).field_B.a(((vb) this).field_r, (byte) 57)) {
                                                    stackOut_79_0 = 0;
                                                    stackIn_80_0 = stackOut_79_0;
                                                    break L13;
                                                  } else {
                                                    stackOut_78_0 = 1;
                                                    stackIn_80_0 = stackOut_78_0;
                                                    break L13;
                                                  }
                                                }
                                                var2 = stackIn_80_0;
                                                break L0;
                                              }
                                            } else {
                                              L14: {
                                                ((vb) this).field_n = true;
                                                ((vb) this).field_z = false;
                                                ((vb) this).field_B = (pa) (Object) new ql(((vb) this).field_k, ((vb) this).field_y.field_M, (vb) this);
                                                if (!((vb) this).field_B.a(((vb) this).field_r, (byte) 57)) {
                                                  stackOut_74_0 = 0;
                                                  stackIn_75_0 = stackOut_74_0;
                                                  break L14;
                                                } else {
                                                  stackOut_73_0 = 1;
                                                  stackIn_75_0 = stackOut_73_0;
                                                  break L14;
                                                }
                                              }
                                              var2 = stackIn_75_0;
                                              break L0;
                                            }
                                          } else {
                                            L15: {
                                              ((vb) this).field_n = true;
                                              ((vb) this).field_z = false;
                                              ((vb) this).field_B = (pa) (Object) new ql(((vb) this).field_k, ((vb) this).field_y.field_M, (vb) this);
                                              if (!((vb) this).field_B.a(((vb) this).field_r, (byte) 57)) {
                                                stackOut_69_0 = 0;
                                                stackIn_70_0 = stackOut_69_0;
                                                break L15;
                                              } else {
                                                stackOut_68_0 = 1;
                                                stackIn_70_0 = stackOut_68_0;
                                                break L15;
                                              }
                                            }
                                            var2 = stackIn_70_0;
                                            break L0;
                                          }
                                        }
                                      } else {
                                        L16: {
                                          ((vb) this).field_z = false;
                                          ((vb) this).field_B = (pa) (Object) new tb(((vb) this).field_k, ((vb) this).field_y.field_M, (vb) this);
                                          if (!((vb) this).field_B.a(((vb) this).field_r, (byte) 57)) {
                                            stackOut_63_0 = 0;
                                            stackIn_64_0 = stackOut_63_0;
                                            break L16;
                                          } else {
                                            stackOut_62_0 = 1;
                                            stackIn_64_0 = stackOut_62_0;
                                            break L16;
                                          }
                                        }
                                        var2 = stackIn_64_0;
                                        break L0;
                                      }
                                    }
                                  } else {
                                    L17: {
                                      ((vb) this).field_z = false;
                                      ((vb) this).field_B = (pa) (Object) new tb(((vb) this).field_k, ((vb) this).field_y.field_M, (vb) this);
                                      if (!((vb) this).field_B.a(((vb) this).field_r, (byte) 57)) {
                                        stackOut_57_0 = 0;
                                        stackIn_58_0 = stackOut_57_0;
                                        break L17;
                                      } else {
                                        stackOut_56_0 = 1;
                                        stackIn_58_0 = stackOut_56_0;
                                        break L17;
                                      }
                                    }
                                    var2 = stackIn_58_0;
                                    break L0;
                                  }
                                } else {
                                  L18: {
                                    ((vb) this).field_z = false;
                                    ((vb) this).field_B = (pa) (Object) new tb(((vb) this).field_k, ((vb) this).field_y.field_M, (vb) this);
                                    if (!((vb) this).field_B.a(((vb) this).field_r, (byte) 57)) {
                                      stackOut_52_0 = 0;
                                      stackIn_53_0 = stackOut_52_0;
                                      break L18;
                                    } else {
                                      stackOut_51_0 = 1;
                                      stackIn_53_0 = stackOut_51_0;
                                      break L18;
                                    }
                                  }
                                  var2 = stackIn_53_0;
                                  break L0;
                                }
                              } else {
                                L19: {
                                  ((vb) this).field_z = false;
                                  ((vb) this).field_B = (pa) (Object) new tb(((vb) this).field_k, ((vb) this).field_y.field_M, (vb) this);
                                  if (!((vb) this).field_B.a(((vb) this).field_r, (byte) 57)) {
                                    stackOut_47_0 = 0;
                                    stackIn_48_0 = stackOut_47_0;
                                    break L19;
                                  } else {
                                    stackOut_46_0 = 1;
                                    stackIn_48_0 = stackOut_46_0;
                                    break L19;
                                  }
                                }
                                var2 = stackIn_48_0;
                                break L0;
                              }
                            } else {
                              L20: {
                                ((vb) this).field_z = false;
                                ((vb) this).field_r.a(((vb) this).field_k, -26661);
                                ((vb) this).field_n = true;
                                ((vb) this).field_B = (pa) (Object) new ql(((vb) this).field_k, ((vb) this).field_y.field_M, (vb) this);
                                if (!((vb) this).field_B.a(((vb) this).field_r, (byte) 57)) {
                                  stackOut_42_0 = 0;
                                  stackIn_43_0 = stackOut_42_0;
                                  break L20;
                                } else {
                                  stackOut_41_0 = 1;
                                  stackIn_43_0 = stackOut_41_0;
                                  break L20;
                                }
                              }
                              var2 = stackIn_43_0;
                              break L0;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    L21: {
                      ((vb) this).field_n = true;
                      ((vb) this).field_z = false;
                      ((vb) this).field_B = (pa) (Object) new ql(((vb) this).field_k, ((vb) this).field_y.field_M, (vb) this);
                      if (!((vb) this).field_B.a(((vb) this).field_r, (byte) 57)) {
                        stackOut_33_0 = 0;
                        stackIn_34_0 = stackOut_33_0;
                        break L21;
                      } else {
                        stackOut_32_0 = 1;
                        stackIn_34_0 = stackOut_32_0;
                        break L21;
                      }
                    }
                    var2 = stackIn_34_0;
                    break L0;
                  }
                } else {
                  L22: {
                    ((vb) this).field_z = false;
                    ((vb) this).field_B = (pa) (Object) new tb(((vb) this).field_k, ((vb) this).field_y.field_M, (vb) this);
                    if (!((vb) this).field_B.a(((vb) this).field_r, (byte) 57)) {
                      stackOut_28_0 = 0;
                      stackIn_29_0 = stackOut_28_0;
                      break L22;
                    } else {
                      stackOut_27_0 = 1;
                      stackIn_29_0 = stackOut_27_0;
                      break L22;
                    }
                  }
                  var2 = stackIn_29_0;
                  break L0;
                }
              }
            }
          } else {
            var3_int = ((kr) (Object) ((vb) this).field_r).field_H;
            var4 = ((kr) (Object) ((vb) this).field_r).field_I;
            if (var3_int >= 0) {
              if (((vb) this).field_k.field_v > var3_int) {
                if (0 <= var4) {
                  if (var4 < ((vb) this).field_k.field_db) {
                    if (((vb) this).field_k.field_Eb[((kr) (Object) ((vb) this).field_r).field_H - -(((kr) (Object) ((vb) this).field_r).field_I * ((vb) this).field_k.field_v)].field_c == null) {
                      return false;
                    } else {
                      L23: {
                        if (null != ((vb) this).field_y.field_T) {
                          L24: {
                            stackOut_15_0 = ((vb) this).field_y.field_vb;
                            stackIn_17_0 = stackOut_15_0;
                            stackIn_16_0 = stackOut_15_0;
                            if (null != ((vb) this).field_y.field_oc) {
                              stackOut_17_0 = (nn) (Object) stackIn_17_0;
                              stackOut_17_1 = 0;
                              stackIn_18_0 = stackOut_17_0;
                              stackIn_18_1 = stackOut_17_1;
                              break L24;
                            } else {
                              stackOut_16_0 = (nn) (Object) stackIn_16_0;
                              stackOut_16_1 = 1;
                              stackIn_18_0 = stackOut_16_0;
                              stackIn_18_1 = stackOut_16_1;
                              break L24;
                            }
                          }
                          ((nn) (Object) stackIn_18_0).a(stackIn_18_1 != 0, param0 + 19769, ((vb) this).field_y.field_q, ((vb) this).field_y.field_T, ((vb) this).field_y.field_vb.field_y, ((vb) this).field_y.field_vb.field_p);
                          break L23;
                        } else {
                          break L23;
                        }
                      }
                      L25: {
                        ((vb) this).field_B = (pa) (Object) new qv(((vb) this).field_k, ((vb) this).field_y.field_M, (vb) this);
                        if (!((vb) this).field_B.a(((vb) this).field_r, (byte) 57)) {
                          stackOut_21_0 = 0;
                          stackIn_22_0 = stackOut_21_0;
                          break L25;
                        } else {
                          stackOut_20_0 = 1;
                          stackIn_22_0 = stackOut_20_0;
                          break L25;
                        }
                      }
                      var2 = stackIn_22_0;
                      break L0;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          }
        }
        L26: {
          if (var2 == 0) {
            ((vb) this).field_r.c((byte) -71);
            ((vb) this).field_s = true;
            break L26;
          } else {
            break L26;
          }
        }
        L27: {
          ((vb) this).field_p = 0;
          if (param0 == -19702) {
            break L27;
          } else {
            ((vb) this).field_z = true;
            break L27;
          }
        }
        return var2 != 0;
    }

    public static void f(int param0) {
        field_q = null;
        field_t = null;
        field_o = null;
        int var1 = 0;
        field_l = null;
    }

    final void a(int param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        wk stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int[][] stackIn_13_3 = null;
        wk stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int[][] stackIn_14_3 = null;
        wk stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int[][] stackIn_15_3 = null;
        int stackIn_15_4 = 0;
        wk stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int[][] stackOut_12_3 = null;
        wk stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int[][] stackOut_14_3 = null;
        int stackOut_14_4 = 0;
        wk stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int[][] stackOut_13_3 = null;
        int stackOut_13_4 = 0;
        L0: {
          if (!((vb) this).field_n) {
            break L0;
          } else {
            if (null != ((vb) this).field_B) {
              L1: {
                if (param2) {
                  ((vb) this).field_B.a((byte) -52);
                  break L1;
                } else {
                  ((vb) this).field_B.c((byte) -122);
                  break L1;
                }
              }
              return;
            } else {
              break L0;
            }
          }
        }
        if (!param2) {
          if (null != ((vb) this).field_r.field_w) {
            if (((vb) this).field_r.field_w.field_x == null) {
              return;
            } else {
              L2: {
                var4 = -40 + ((vb) this).field_r.field_w.field_x.field_e[0];
                var5 = -20 + ((vb) this).field_r.field_w.field_x.field_e[1];
                stackOut_12_0 = go.field_g;
                stackOut_12_1 = 10 + var4;
                stackOut_12_2 = var5 + 5;
                stackOut_12_3 = op.field_c;
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_14_2 = stackOut_12_2;
                stackIn_14_3 = stackOut_12_3;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                stackIn_13_2 = stackOut_12_2;
                stackIn_13_3 = stackOut_12_3;
                if (((vb) this).field_k.field_wb) {
                  stackOut_14_0 = (wk) (Object) stackIn_14_0;
                  stackOut_14_1 = stackIn_14_1;
                  stackOut_14_2 = stackIn_14_2;
                  stackOut_14_3 = (int[][]) (Object) stackIn_14_3;
                  stackOut_14_4 = 1;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  stackIn_15_3 = stackOut_14_3;
                  stackIn_15_4 = stackOut_14_4;
                  break L2;
                } else {
                  stackOut_13_0 = (wk) (Object) stackIn_13_0;
                  stackOut_13_1 = stackIn_13_1;
                  stackOut_13_2 = stackIn_13_2;
                  stackOut_13_3 = (int[][]) (Object) stackIn_13_3;
                  stackOut_13_4 = 0;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  stackIn_15_3 = stackOut_13_3;
                  stackIn_15_4 = stackOut_13_4;
                  break L2;
                }
              }
              L3: {
                ((wk) (Object) stackIn_15_0).b(stackIn_15_1, stackIn_15_2, stackIn_15_3[stackIn_15_4][((vb) this).field_r.field_w.field_O]);
                if (param1 == 31785) {
                  break L3;
                } else {
                  ((vb) this).field_s = false;
                  break L3;
                }
              }
              L4: {
                L5: {
                  if (((vb) this).field_y.field_T == ((vb) this).field_r.field_w) {
                    break L5;
                  } else {
                    if (((vb) this).field_y.field_oc == ((vb) this).field_r.field_w) {
                      break L5;
                    } else {
                      break L4;
                    }
                  }
                }
                go.field_g.f(var4 + 10, 5 + var5, 128 - -(int)(64.0 * Math.sin((double)param0 / 3.141592653589793)));
                break L4;
              }
              ((vb) this).field_r.field_w.field_x.a((byte) -72, false);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final boolean b(int param0, int param1, boolean param2) {
        int var4 = 0;
        if (24 != ((vb) this).field_r.field_m) {
            ((vb) this).field_n = true;
            ((vb) this).field_B = (pa) (Object) new ql(((vb) this).field_k, ((vb) this).field_y.field_M, (vb) this);
            var4 = ((ql) (Object) ((vb) this).field_B).a(-98, param1, param0, ((vb) this).field_r) ? 1 : 0;
        } else {
            ((vb) this).field_z = false;
            ((vb) this).field_n = true;
            ((vb) this).field_B = (pa) (Object) new ql(((vb) this).field_k, ((vb) this).field_y.field_M, (vb) this);
            var4 = ((ql) (Object) ((vb) this).field_B).a(-95, param1, param0, ((vb) this).field_r) ? 1 : 0;
        }
        if (!(var4 != 0)) {
            ((vb) this).field_r.c((byte) -107);
            ((vb) this).field_s = true;
        }
        if (!param2) {
            ((vb) this).a(17, 99, true);
        }
        ((vb) this).field_p = 0;
        return var4 != 0;
    }

    final boolean a(byte param0) {
        int var2 = -110 / ((27 - param0) / 35);
        if (!(((vb) this).field_B != null)) {
            return false;
        }
        return ((vb) this).field_B.b((byte) -91);
    }

    final void a(int param0) {
        int var3 = 0;
        L0: {
          L1: {
            var3 = ArmiesOfGielinor.field_M ? 1 : 0;
            if (((vb) this).field_r.field_m == param0) {
              break L1;
            } else {
              if (null == ((vb) this).field_B) {
                break L1;
              } else {
                L2: {
                  if (!((vb) this).field_B.b(8865)) {
                    break L2;
                  } else {
                    if (((vb) this).field_s) {
                      break L2;
                    } else {
                      ((vb) this).field_r.c((byte) -118);
                      ((vb) this).field_s = true;
                      ((vb) this).field_B = null;
                      break L0;
                    }
                  }
                }
                ((vb) this).field_B.b(((vb) this).field_r, (byte) 23);
                break L0;
              }
            }
          }
          if (((vb) this).field_s) {
            break L0;
          } else {
            ((vb) this).field_s = true;
            ((vb) this).field_r.c((byte) -64);
            break L0;
          }
        }
        L3: {
          ((vb) this).field_p = ((vb) this).field_p + 1;
          if (((vb) this).field_p < 1000) {
            break L3;
          } else {
            ((vb) this).field_s = true;
            ((vb) this).field_B = null;
            ((vb) this).field_r.f(param0 + 7);
            oo.e(-387);
            break L3;
          }
        }
    }

    vb(ic param0, ha param1, eo param2, oj param3, boolean param4) {
        ((vb) this).field_z = false;
        ((vb) this).field_x = -1;
        try {
            ((vb) this).field_k = param1;
            ((vb) this).field_r = param3;
            ((vb) this).field_u = param2;
            ((vb) this).field_y = param0;
            j discarded$0 = new j(240, param0.field_M);
            ((vb) this).field_r.a(-97);
            ((vb) this).field_p = 0;
            ((vb) this).field_n = false;
            ((vb) this).field_w = param4 ? true : false;
            ((vb) this).field_s = false;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "vb.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 41);
        }
    }

    vb(ic param0, ha param1, eo param2, oj param3, int param4, int param5, boolean param6) {
        ((vb) this).field_z = false;
        ((vb) this).field_x = -1;
        try {
            ((vb) this).field_r = param3;
            ((vb) this).field_k = param1;
            ((vb) this).field_u = param2;
            ((vb) this).field_y = param0;
            j discarded$0 = new j(240, param0.field_M);
            ((vb) this).field_r.a(-97);
            ((vb) this).field_n = false;
            ((vb) this).field_w = param6 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "vb.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "You have not yet unlocked this option for use.";
        field_q = new at();
    }
}
