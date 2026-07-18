/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class cda extends dg {
    private boolean field_r;
    private boolean field_t;
    private boolean field_q;
    private int field_m;
    private int field_v;
    private int field_s;
    static String field_u;
    private int field_o;
    static volatile int field_p;
    private int field_n;

    public static void n(byte param0) {
        field_u = null;
    }

    cda(int param0, la param1, kh param2) {
        super(param0, param1, param2);
        ((cda) this).field_r = true;
    }

    final boolean a(boolean param0) {
        if (!param0) {
            ((cda) this).field_t = true;
            return ((cda) this).field_q;
        }
        return ((cda) this).field_q;
    }

    void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        fsa var7 = null;
        int var8 = 0;
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        boolean stackIn_23_0 = false;
        boolean stackIn_24_0 = false;
        boolean stackIn_25_0 = false;
        int stackIn_25_1 = 0;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_37_0 = 0;
        Object stackIn_40_0 = null;
        Object stackIn_41_0 = null;
        Object stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        boolean stackIn_44_0 = false;
        boolean stackIn_45_0 = false;
        boolean stackIn_46_0 = false;
        int stackIn_46_1 = 0;
        Object stackIn_48_0 = null;
        Object stackIn_49_0 = null;
        Object stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_59_0 = 0;
        Object stackIn_62_0 = null;
        Object stackIn_63_0 = null;
        Object stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        boolean stackIn_66_0 = false;
        boolean stackIn_67_0 = false;
        boolean stackIn_68_0 = false;
        int stackIn_68_1 = 0;
        Object stackIn_70_0 = null;
        Object stackIn_71_0 = null;
        Object stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        int stackIn_79_0 = 0;
        Object stackIn_82_0 = null;
        Object stackIn_83_0 = null;
        Object stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        boolean stackIn_86_0 = false;
        boolean stackIn_87_0 = false;
        boolean stackIn_88_0 = false;
        int stackIn_88_1 = 0;
        Object stackIn_90_0 = null;
        Object stackIn_91_0 = null;
        Object stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        int stackIn_99_0 = 0;
        Object stackIn_102_0 = null;
        Object stackIn_103_0 = null;
        Object stackIn_104_0 = null;
        int stackIn_104_1 = 0;
        boolean stackIn_106_0 = false;
        boolean stackIn_107_0 = false;
        boolean stackIn_108_0 = false;
        int stackIn_108_1 = 0;
        Object stackIn_110_0 = null;
        Object stackIn_111_0 = null;
        Object stackIn_112_0 = null;
        int stackIn_112_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        Object stackOut_39_0 = null;
        Object stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        Object stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        boolean stackOut_43_0 = false;
        boolean stackOut_45_0 = false;
        int stackOut_45_1 = 0;
        boolean stackOut_44_0 = false;
        int stackOut_44_1 = 0;
        Object stackOut_47_0 = null;
        Object stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        Object stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        Object stackOut_18_0 = null;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        boolean stackOut_22_0 = false;
        boolean stackOut_24_0 = false;
        int stackOut_24_1 = 0;
        boolean stackOut_23_0 = false;
        int stackOut_23_1 = 0;
        Object stackOut_26_0 = null;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_77_0 = 0;
        Object stackOut_81_0 = null;
        Object stackOut_83_0 = null;
        int stackOut_83_1 = 0;
        Object stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        boolean stackOut_85_0 = false;
        boolean stackOut_87_0 = false;
        int stackOut_87_1 = 0;
        boolean stackOut_86_0 = false;
        int stackOut_86_1 = 0;
        Object stackOut_89_0 = null;
        Object stackOut_91_0 = null;
        int stackOut_91_1 = 0;
        Object stackOut_90_0 = null;
        int stackOut_90_1 = 0;
        int stackOut_58_0 = 0;
        int stackOut_57_0 = 0;
        Object stackOut_61_0 = null;
        Object stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        Object stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        boolean stackOut_65_0 = false;
        boolean stackOut_67_0 = false;
        int stackOut_67_1 = 0;
        boolean stackOut_66_0 = false;
        int stackOut_66_1 = 0;
        Object stackOut_69_0 = null;
        Object stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        Object stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        int stackOut_98_0 = 0;
        int stackOut_97_0 = 0;
        Object stackOut_101_0 = null;
        Object stackOut_103_0 = null;
        int stackOut_103_1 = 0;
        Object stackOut_102_0 = null;
        int stackOut_102_1 = 0;
        boolean stackOut_105_0 = false;
        boolean stackOut_107_0 = false;
        int stackOut_107_1 = 0;
        boolean stackOut_106_0 = false;
        int stackOut_106_1 = 0;
        Object stackOut_109_0 = null;
        Object stackOut_111_0 = null;
        int stackOut_111_1 = 0;
        Object stackOut_110_0 = null;
        int stackOut_110_1 = 0;
        L0: {
          var8 = TombRacer.field_G ? 1 : 0;
          super.d(param0);
          var2 = 0;
          var3 = 0;
          var4 = 0;
          var5 = 0;
          var6 = 0;
          if (!(((cda) this).field_h instanceof fsa)) {
            var4 = ((cda) this).field_h.d(3);
            var5 = ((cda) this).field_h.e(9648);
            var6 = ((cda) this).field_h.g(-25787);
            break L0;
          } else {
            var7 = (fsa) (Object) ((cda) this).field_h;
            var4 = var7.s(25745);
            var5 = var7.e(false);
            var6 = var7.q((byte) -80);
            break L0;
          }
        }
        if (!((cda) this).field_r) {
          L1: {
            if (((cda) this).field_m == var6) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            }
          }
          L2: {
            var3 = stackIn_8_0;
            if (((cda) this).field_s == var4) {
              if (var5 != ((cda) this).field_v) {
                var2 = 1;
                ((cda) this).field_o = dfa.a(-((cda) this).field_m + var6, 8192, -60);
                if (((cda) this).field_o <= 4096) {
                  L3: {
                    ((cda) this).field_m = var6;
                    if (var3 != 0) {
                      stackOut_36_0 = 0;
                      stackIn_37_0 = stackOut_36_0;
                      break L3;
                    } else {
                      stackOut_35_0 = 1;
                      stackIn_37_0 = stackOut_35_0;
                      break L3;
                    }
                  }
                  L4: {
                    if (stackIn_37_0 == (((cda) this).field_t ? 1 : 0)) {
                      L5: {
                        stackOut_39_0 = this;
                        stackIn_41_0 = stackOut_39_0;
                        stackIn_40_0 = stackOut_39_0;
                        if (var3 == 0) {
                          stackOut_41_0 = this;
                          stackOut_41_1 = 0;
                          stackIn_42_0 = stackOut_41_0;
                          stackIn_42_1 = stackOut_41_1;
                          break L5;
                        } else {
                          stackOut_40_0 = this;
                          stackOut_40_1 = 1;
                          stackIn_42_0 = stackOut_40_0;
                          stackIn_42_1 = stackOut_40_1;
                          break L5;
                        }
                      }
                      ((cda) this).field_t = stackIn_42_1 != 0;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L6: {
                    stackOut_43_0 = ((cda) this).field_q;
                    stackIn_45_0 = stackOut_43_0;
                    stackIn_44_0 = stackOut_43_0;
                    if (var2 != 0) {
                      stackOut_45_0 = stackIn_45_0;
                      stackOut_45_1 = 0;
                      stackIn_46_0 = stackOut_45_0;
                      stackIn_46_1 = stackOut_45_1;
                      break L6;
                    } else {
                      stackOut_44_0 = stackIn_44_0;
                      stackOut_44_1 = 1;
                      stackIn_46_0 = stackOut_44_0;
                      stackIn_46_1 = stackOut_44_1;
                      break L6;
                    }
                  }
                  if ((stackIn_46_0 ? 1 : 0) != stackIn_46_1) {
                    ((cda) this).field_n = ((cda) this).field_n + 1;
                    ((cda) this).field_s = var4;
                    ((cda) this).field_v = var5;
                    return;
                  } else {
                    L7: {
                      stackOut_47_0 = this;
                      stackIn_49_0 = stackOut_47_0;
                      stackIn_48_0 = stackOut_47_0;
                      if (var2 == 0) {
                        stackOut_49_0 = this;
                        stackOut_49_1 = 0;
                        stackIn_50_0 = stackOut_49_0;
                        stackIn_50_1 = stackOut_49_1;
                        break L7;
                      } else {
                        stackOut_48_0 = this;
                        stackOut_48_1 = 1;
                        stackIn_50_0 = stackOut_48_0;
                        stackIn_50_1 = stackOut_48_1;
                        break L7;
                      }
                    }
                    ((cda) this).field_q = stackIn_50_1 != 0;
                    ((cda) this).field_n = 1;
                    ((cda) this).field_s = var4;
                    ((cda) this).field_v = var5;
                    return;
                  }
                } else {
                  L8: {
                    ((cda) this).field_o = -((cda) this).field_o + 8192;
                    ((cda) this).field_m = var6;
                    if (var3 != 0) {
                      stackOut_15_0 = 0;
                      stackIn_16_0 = stackOut_15_0;
                      break L8;
                    } else {
                      stackOut_14_0 = 1;
                      stackIn_16_0 = stackOut_14_0;
                      break L8;
                    }
                  }
                  L9: {
                    if (stackIn_16_0 == (((cda) this).field_t ? 1 : 0)) {
                      L10: {
                        stackOut_18_0 = this;
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_19_0 = stackOut_18_0;
                        if (var3 == 0) {
                          stackOut_20_0 = this;
                          stackOut_20_1 = 0;
                          stackIn_21_0 = stackOut_20_0;
                          stackIn_21_1 = stackOut_20_1;
                          break L10;
                        } else {
                          stackOut_19_0 = this;
                          stackOut_19_1 = 1;
                          stackIn_21_0 = stackOut_19_0;
                          stackIn_21_1 = stackOut_19_1;
                          break L10;
                        }
                      }
                      ((cda) this).field_t = stackIn_21_1 != 0;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L11: {
                    stackOut_22_0 = ((cda) this).field_q;
                    stackIn_24_0 = stackOut_22_0;
                    stackIn_23_0 = stackOut_22_0;
                    if (var2 != 0) {
                      stackOut_24_0 = stackIn_24_0;
                      stackOut_24_1 = 0;
                      stackIn_25_0 = stackOut_24_0;
                      stackIn_25_1 = stackOut_24_1;
                      break L11;
                    } else {
                      stackOut_23_0 = stackIn_23_0;
                      stackOut_23_1 = 1;
                      stackIn_25_0 = stackOut_23_0;
                      stackIn_25_1 = stackOut_23_1;
                      break L11;
                    }
                  }
                  L12: {
                    if ((stackIn_25_0 ? 1 : 0) != stackIn_25_1) {
                      ((cda) this).field_n = ((cda) this).field_n + 1;
                      ((cda) this).field_s = var4;
                      ((cda) this).field_v = var5;
                      break L12;
                    } else {
                      L13: {
                        stackOut_26_0 = this;
                        stackIn_28_0 = stackOut_26_0;
                        stackIn_27_0 = stackOut_26_0;
                        if (var2 == 0) {
                          stackOut_28_0 = this;
                          stackOut_28_1 = 0;
                          stackIn_29_0 = stackOut_28_0;
                          stackIn_29_1 = stackOut_28_1;
                          break L13;
                        } else {
                          stackOut_27_0 = this;
                          stackOut_27_1 = 1;
                          stackIn_29_0 = stackOut_27_0;
                          stackIn_29_1 = stackOut_27_1;
                          break L13;
                        }
                      }
                      ((cda) this).field_q = stackIn_29_1 != 0;
                      ((cda) this).field_n = 1;
                      ((cda) this).field_s = var4;
                      ((cda) this).field_v = var5;
                      break L12;
                    }
                  }
                  return;
                }
              } else {
                stackOut_11_0 = 0;
                stackIn_55_0 = stackOut_11_0;
                break L2;
              }
            } else {
              stackOut_9_0 = 1;
              stackIn_55_0 = stackOut_9_0;
              break L2;
            }
          }
          var2 = stackIn_55_0;
          ((cda) this).field_o = dfa.a(-((cda) this).field_m + var6, 8192, -60);
          if (((cda) this).field_o > 4096) {
            L14: {
              ((cda) this).field_o = -((cda) this).field_o + 8192;
              ((cda) this).field_m = var6;
              if (var3 != 0) {
                stackOut_78_0 = 0;
                stackIn_79_0 = stackOut_78_0;
                break L14;
              } else {
                stackOut_77_0 = 1;
                stackIn_79_0 = stackOut_77_0;
                break L14;
              }
            }
            L15: {
              if (stackIn_79_0 == (((cda) this).field_t ? 1 : 0)) {
                L16: {
                  stackOut_81_0 = this;
                  stackIn_83_0 = stackOut_81_0;
                  stackIn_82_0 = stackOut_81_0;
                  if (var3 == 0) {
                    stackOut_83_0 = this;
                    stackOut_83_1 = 0;
                    stackIn_84_0 = stackOut_83_0;
                    stackIn_84_1 = stackOut_83_1;
                    break L16;
                  } else {
                    stackOut_82_0 = this;
                    stackOut_82_1 = 1;
                    stackIn_84_0 = stackOut_82_0;
                    stackIn_84_1 = stackOut_82_1;
                    break L16;
                  }
                }
                ((cda) this).field_t = stackIn_84_1 != 0;
                break L15;
              } else {
                break L15;
              }
            }
            L17: {
              stackOut_85_0 = ((cda) this).field_q;
              stackIn_87_0 = stackOut_85_0;
              stackIn_86_0 = stackOut_85_0;
              if (var2 != 0) {
                stackOut_87_0 = stackIn_87_0;
                stackOut_87_1 = 0;
                stackIn_88_0 = stackOut_87_0;
                stackIn_88_1 = stackOut_87_1;
                break L17;
              } else {
                stackOut_86_0 = stackIn_86_0;
                stackOut_86_1 = 1;
                stackIn_88_0 = stackOut_86_0;
                stackIn_88_1 = stackOut_86_1;
                break L17;
              }
            }
            if ((stackIn_88_0 ? 1 : 0) != stackIn_88_1) {
              ((cda) this).field_n = ((cda) this).field_n + 1;
              ((cda) this).field_s = var4;
              ((cda) this).field_v = var5;
              return;
            } else {
              L18: {
                stackOut_89_0 = this;
                stackIn_91_0 = stackOut_89_0;
                stackIn_90_0 = stackOut_89_0;
                if (var2 == 0) {
                  stackOut_91_0 = this;
                  stackOut_91_1 = 0;
                  stackIn_92_0 = stackOut_91_0;
                  stackIn_92_1 = stackOut_91_1;
                  break L18;
                } else {
                  stackOut_90_0 = this;
                  stackOut_90_1 = 1;
                  stackIn_92_0 = stackOut_90_0;
                  stackIn_92_1 = stackOut_90_1;
                  break L18;
                }
              }
              ((cda) this).field_q = stackIn_92_1 != 0;
              ((cda) this).field_n = 1;
              ((cda) this).field_s = var4;
              ((cda) this).field_v = var5;
              return;
            }
          } else {
            L19: {
              ((cda) this).field_m = var6;
              if (var3 != 0) {
                stackOut_58_0 = 0;
                stackIn_59_0 = stackOut_58_0;
                break L19;
              } else {
                stackOut_57_0 = 1;
                stackIn_59_0 = stackOut_57_0;
                break L19;
              }
            }
            L20: {
              if (stackIn_59_0 == (((cda) this).field_t ? 1 : 0)) {
                L21: {
                  stackOut_61_0 = this;
                  stackIn_63_0 = stackOut_61_0;
                  stackIn_62_0 = stackOut_61_0;
                  if (var3 == 0) {
                    stackOut_63_0 = this;
                    stackOut_63_1 = 0;
                    stackIn_64_0 = stackOut_63_0;
                    stackIn_64_1 = stackOut_63_1;
                    break L21;
                  } else {
                    stackOut_62_0 = this;
                    stackOut_62_1 = 1;
                    stackIn_64_0 = stackOut_62_0;
                    stackIn_64_1 = stackOut_62_1;
                    break L21;
                  }
                }
                ((cda) this).field_t = stackIn_64_1 != 0;
                break L20;
              } else {
                break L20;
              }
            }
            L22: {
              stackOut_65_0 = ((cda) this).field_q;
              stackIn_67_0 = stackOut_65_0;
              stackIn_66_0 = stackOut_65_0;
              if (var2 != 0) {
                stackOut_67_0 = stackIn_67_0;
                stackOut_67_1 = 0;
                stackIn_68_0 = stackOut_67_0;
                stackIn_68_1 = stackOut_67_1;
                break L22;
              } else {
                stackOut_66_0 = stackIn_66_0;
                stackOut_66_1 = 1;
                stackIn_68_0 = stackOut_66_0;
                stackIn_68_1 = stackOut_66_1;
                break L22;
              }
            }
            if ((stackIn_68_0 ? 1 : 0) != stackIn_68_1) {
              ((cda) this).field_n = ((cda) this).field_n + 1;
              ((cda) this).field_s = var4;
              ((cda) this).field_v = var5;
              return;
            } else {
              L23: {
                stackOut_69_0 = this;
                stackIn_71_0 = stackOut_69_0;
                stackIn_70_0 = stackOut_69_0;
                if (var2 == 0) {
                  stackOut_71_0 = this;
                  stackOut_71_1 = 0;
                  stackIn_72_0 = stackOut_71_0;
                  stackIn_72_1 = stackOut_71_1;
                  break L23;
                } else {
                  stackOut_70_0 = this;
                  stackOut_70_1 = 1;
                  stackIn_72_0 = stackOut_70_0;
                  stackIn_72_1 = stackOut_70_1;
                  break L23;
                }
              }
              ((cda) this).field_q = stackIn_72_1 != 0;
              ((cda) this).field_n = 1;
              ((cda) this).field_s = var4;
              ((cda) this).field_v = var5;
              return;
            }
          }
        } else {
          ((cda) this).field_t = false;
          ((cda) this).field_n = 1;
          ((cda) this).field_r = false;
          ((cda) this).field_o = 0;
          ((cda) this).field_q = false;
          L24: {
            ((cda) this).field_m = var6;
            if (var3 != 0) {
              stackOut_98_0 = 0;
              stackIn_99_0 = stackOut_98_0;
              break L24;
            } else {
              stackOut_97_0 = 1;
              stackIn_99_0 = stackOut_97_0;
              break L24;
            }
          }
          L25: {
            if (stackIn_99_0 == (((cda) this).field_t ? 1 : 0)) {
              L26: {
                stackOut_101_0 = this;
                stackIn_103_0 = stackOut_101_0;
                stackIn_102_0 = stackOut_101_0;
                if (var3 == 0) {
                  stackOut_103_0 = this;
                  stackOut_103_1 = 0;
                  stackIn_104_0 = stackOut_103_0;
                  stackIn_104_1 = stackOut_103_1;
                  break L26;
                } else {
                  stackOut_102_0 = this;
                  stackOut_102_1 = 1;
                  stackIn_104_0 = stackOut_102_0;
                  stackIn_104_1 = stackOut_102_1;
                  break L26;
                }
              }
              ((cda) this).field_t = stackIn_104_1 != 0;
              break L25;
            } else {
              break L25;
            }
          }
          L27: {
            stackOut_105_0 = ((cda) this).field_q;
            stackIn_107_0 = stackOut_105_0;
            stackIn_106_0 = stackOut_105_0;
            if (var2 != 0) {
              stackOut_107_0 = stackIn_107_0;
              stackOut_107_1 = 0;
              stackIn_108_0 = stackOut_107_0;
              stackIn_108_1 = stackOut_107_1;
              break L27;
            } else {
              stackOut_106_0 = stackIn_106_0;
              stackOut_106_1 = 1;
              stackIn_108_0 = stackOut_106_0;
              stackIn_108_1 = stackOut_106_1;
              break L27;
            }
          }
          if ((stackIn_108_0 ? 1 : 0) != stackIn_108_1) {
            ((cda) this).field_n = ((cda) this).field_n + 1;
            ((cda) this).field_s = var4;
            ((cda) this).field_v = var5;
            return;
          } else {
            L28: {
              stackOut_109_0 = this;
              stackIn_111_0 = stackOut_109_0;
              stackIn_110_0 = stackOut_109_0;
              if (var2 == 0) {
                stackOut_111_0 = this;
                stackOut_111_1 = 0;
                stackIn_112_0 = stackOut_111_0;
                stackIn_112_1 = stackOut_111_1;
                break L28;
              } else {
                stackOut_110_0 = this;
                stackOut_110_1 = 1;
                stackIn_112_0 = stackOut_110_0;
                stackIn_112_1 = stackOut_110_1;
                break L28;
              }
            }
            ((cda) this).field_q = stackIn_112_1 != 0;
            ((cda) this).field_n = 1;
            ((cda) this).field_s = var4;
            ((cda) this).field_v = var5;
            return;
          }
        }
    }

    final static void a(int param0, boolean param1) {
        ira.a(false, hb.field_t.field_d, (byte) -100);
        if (param0 != 0) {
            cda.a(50, false);
        }
    }

    cda(int param0) {
        super(param0);
        ((cda) this).field_r = true;
    }

    final int b(boolean param0) {
        if (param0) {
            ((cda) this).field_r = false;
            return ((cda) this).field_n;
        }
        return ((cda) this).field_n;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 0;
        field_u = "Encouraging rule breaking";
    }
}
