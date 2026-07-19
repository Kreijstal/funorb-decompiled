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
        if (param0 < 0) {
            cda.a(-97, true);
            field_u = null;
            return;
        }
        field_u = null;
    }

    cda(int param0, la param1, kh param2) {
        super(param0, param1, param2);
        this.field_r = true;
    }

    final boolean a(boolean param0) {
        if (!param0) {
            this.field_t = true;
            return this.field_q;
        }
        return this.field_q;
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
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        boolean stackIn_15_0 = false;
        boolean stackIn_16_0 = false;
        boolean stackIn_17_0 = false;
        int stackIn_17_1 = 0;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_38_0 = 0;
        Object stackIn_41_0 = null;
        Object stackIn_42_0 = null;
        Object stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        boolean stackIn_45_0 = false;
        boolean stackIn_46_0 = false;
        boolean stackIn_47_0 = false;
        int stackIn_47_1 = 0;
        Object stackIn_49_0 = null;
        Object stackIn_50_0 = null;
        Object stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        int stackIn_62_0 = 0;
        Object stackIn_65_0 = null;
        Object stackIn_66_0 = null;
        Object stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        boolean stackIn_69_0 = false;
        boolean stackIn_70_0 = false;
        boolean stackIn_71_0 = false;
        int stackIn_71_1 = 0;
        Object stackIn_73_0 = null;
        Object stackIn_74_0 = null;
        Object stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        int stackIn_85_0 = 0;
        int stackIn_94_0 = 0;
        Object stackIn_97_0 = null;
        Object stackIn_98_0 = null;
        Object stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        boolean stackIn_101_0 = false;
        boolean stackIn_102_0 = false;
        boolean stackIn_103_0 = false;
        int stackIn_103_1 = 0;
        Object stackIn_105_0 = null;
        Object stackIn_106_0 = null;
        Object stackIn_107_0 = null;
        int stackIn_107_1 = 0;
        int stackIn_113_0 = 0;
        int stackIn_117_0 = 0;
        Object stackIn_120_0 = null;
        Object stackIn_121_0 = null;
        Object stackIn_122_0 = null;
        int stackIn_122_1 = 0;
        boolean stackIn_124_0 = false;
        boolean stackIn_125_0 = false;
        boolean stackIn_126_0 = false;
        int stackIn_126_1 = 0;
        Object stackIn_128_0 = null;
        Object stackIn_129_0 = null;
        Object stackIn_130_0 = null;
        int stackIn_130_1 = 0;
        int stackIn_140_0 = 0;
        Object stackIn_143_0 = null;
        Object stackIn_144_0 = null;
        Object stackIn_145_0 = null;
        int stackIn_145_1 = 0;
        boolean stackIn_147_0 = false;
        boolean stackIn_148_0 = false;
        boolean stackIn_149_0 = false;
        int stackIn_149_1 = 0;
        Object stackIn_151_0 = null;
        Object stackIn_152_0 = null;
        Object stackIn_153_0 = null;
        int stackIn_153_1 = 0;
        int stackOut_84_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_92_0 = 0;
        Object stackOut_96_0 = null;
        Object stackOut_98_0 = null;
        int stackOut_98_1 = 0;
        Object stackOut_97_0 = null;
        int stackOut_97_1 = 0;
        boolean stackOut_100_0 = false;
        boolean stackOut_102_0 = false;
        int stackOut_102_1 = 0;
        boolean stackOut_101_0 = false;
        int stackOut_101_1 = 0;
        Object stackOut_104_0 = null;
        Object stackOut_106_0 = null;
        int stackOut_106_1 = 0;
        Object stackOut_105_0 = null;
        int stackOut_105_1 = 0;
        int stackOut_88_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_139_0 = 0;
        int stackOut_138_0 = 0;
        Object stackOut_142_0 = null;
        Object stackOut_144_0 = null;
        int stackOut_144_1 = 0;
        Object stackOut_143_0 = null;
        int stackOut_143_1 = 0;
        boolean stackOut_146_0 = false;
        boolean stackOut_148_0 = false;
        int stackOut_148_1 = 0;
        boolean stackOut_147_0 = false;
        int stackOut_147_1 = 0;
        Object stackOut_150_0 = null;
        Object stackOut_152_0 = null;
        int stackOut_152_1 = 0;
        Object stackOut_151_0 = null;
        int stackOut_151_1 = 0;
        int stackOut_116_0 = 0;
        int stackOut_115_0 = 0;
        Object stackOut_119_0 = null;
        Object stackOut_121_0 = null;
        int stackOut_121_1 = 0;
        Object stackOut_120_0 = null;
        int stackOut_120_1 = 0;
        boolean stackOut_123_0 = false;
        boolean stackOut_125_0 = false;
        int stackOut_125_1 = 0;
        boolean stackOut_124_0 = false;
        int stackOut_124_1 = 0;
        Object stackOut_127_0 = null;
        Object stackOut_129_0 = null;
        int stackOut_129_1 = 0;
        Object stackOut_128_0 = null;
        int stackOut_128_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_60_0 = 0;
        Object stackOut_64_0 = null;
        Object stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        Object stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        boolean stackOut_68_0 = false;
        boolean stackOut_70_0 = false;
        int stackOut_70_1 = 0;
        boolean stackOut_69_0 = false;
        int stackOut_69_1 = 0;
        Object stackOut_72_0 = null;
        Object stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        Object stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        Object stackOut_40_0 = null;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        Object stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        boolean stackOut_44_0 = false;
        boolean stackOut_46_0 = false;
        int stackOut_46_1 = 0;
        boolean stackOut_45_0 = false;
        int stackOut_45_1 = 0;
        Object stackOut_48_0 = null;
        Object stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        Object stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        boolean stackOut_14_0 = false;
        boolean stackOut_16_0 = false;
        int stackOut_16_1 = 0;
        boolean stackOut_15_0 = false;
        int stackOut_15_1 = 0;
        Object stackOut_18_0 = null;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        L0: {
          L1: {
            var8 = TombRacer.field_G ? 1 : 0;
            super.d(param0);
            var2 = 0;
            var3 = 0;
            var4 = 0;
            var5 = 0;
            var6 = 0;
            if (!(this.field_h instanceof fsa)) {
              break L1;
            } else {
              var7 = (fsa) ((Object) this.field_h);
              var4 = var7.s(25745);
              var5 = var7.e(false);
              var6 = var7.q((byte) -80);
              if (var8 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var4 = this.field_h.d(3);
          var5 = this.field_h.e(9648);
          var6 = this.field_h.g(-25787);
          break L0;
        }
        if (!this.field_r) {
          L2: {
            if (this.field_m == var6) {
              stackOut_84_0 = 0;
              stackIn_85_0 = stackOut_84_0;
              break L2;
            } else {
              stackOut_83_0 = 1;
              stackIn_85_0 = stackOut_83_0;
              break L2;
            }
          }
          L3: {
            var3 = stackIn_85_0;
            if (this.field_s == var4) {
              if (var5 != this.field_v) {
                L4: {
                  var2 = 1;
                  this.field_o = dfa.a(-this.field_m + var6, 8192, -60);
                  if (-4097 <= (this.field_o ^ -1)) {
                    break L4;
                  } else {
                    this.field_o = -this.field_o + 8192;
                    break L4;
                  }
                }
                L5: {
                  this.field_m = var6;
                  if (var3 != 0) {
                    stackOut_93_0 = 0;
                    stackIn_94_0 = stackOut_93_0;
                    break L5;
                  } else {
                    stackOut_92_0 = 1;
                    stackIn_94_0 = stackOut_92_0;
                    break L5;
                  }
                }
                L6: {
                  if (stackIn_94_0 == (this.field_t ? 1 : 0)) {
                    L7: {
                      stackOut_96_0 = this;
                      stackIn_98_0 = stackOut_96_0;
                      stackIn_97_0 = stackOut_96_0;
                      if (var3 == 0) {
                        stackOut_98_0 = this;
                        stackOut_98_1 = 0;
                        stackIn_99_0 = stackOut_98_0;
                        stackIn_99_1 = stackOut_98_1;
                        break L7;
                      } else {
                        stackOut_97_0 = this;
                        stackOut_97_1 = 1;
                        stackIn_99_0 = stackOut_97_0;
                        stackIn_99_1 = stackOut_97_1;
                        break L7;
                      }
                    }
                    ((cda) (this)).field_t = stackIn_99_1 != 0;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L8: {
                  stackOut_100_0 = this.field_q;
                  stackIn_102_0 = stackOut_100_0;
                  stackIn_101_0 = stackOut_100_0;
                  if (var2 != 0) {
                    stackOut_102_0 = stackIn_102_0;
                    stackOut_102_1 = 0;
                    stackIn_103_0 = stackOut_102_0;
                    stackIn_103_1 = stackOut_102_1;
                    break L8;
                  } else {
                    stackOut_101_0 = stackIn_101_0;
                    stackOut_101_1 = 1;
                    stackIn_103_0 = stackOut_101_0;
                    stackIn_103_1 = stackOut_101_1;
                    break L8;
                  }
                }
                L9: {
                  if ((stackIn_103_0 ? 1 : 0) != stackIn_103_1) {
                    break L9;
                  } else {
                    L10: {
                      stackOut_104_0 = this;
                      stackIn_106_0 = stackOut_104_0;
                      stackIn_105_0 = stackOut_104_0;
                      if (var2 == 0) {
                        stackOut_106_0 = this;
                        stackOut_106_1 = 0;
                        stackIn_107_0 = stackOut_106_0;
                        stackIn_107_1 = stackOut_106_1;
                        break L10;
                      } else {
                        stackOut_105_0 = this;
                        stackOut_105_1 = 1;
                        stackIn_107_0 = stackOut_105_0;
                        stackIn_107_1 = stackOut_105_1;
                        break L10;
                      }
                    }
                    ((cda) (this)).field_q = stackIn_107_1 != 0;
                    this.field_n = 1;
                    if (var8 == 0) {
                      this.field_s = var4;
                      this.field_v = var5;
                      return;
                    } else {
                      break L9;
                    }
                  }
                }
                this.field_n = this.field_n + 1;
                this.field_s = var4;
                this.field_v = var5;
                return;
              } else {
                stackOut_88_0 = 0;
                stackIn_113_0 = stackOut_88_0;
                break L3;
              }
            } else {
              stackOut_86_0 = 1;
              stackIn_113_0 = stackOut_86_0;
              break L3;
            }
          }
          var2 = stackIn_113_0;
          this.field_o = dfa.a(-this.field_m + var6, 8192, -60);
          if (-4097 <= (this.field_o ^ -1)) {
            L11: {
              this.field_m = var6;
              if (var3 != 0) {
                stackOut_139_0 = 0;
                stackIn_140_0 = stackOut_139_0;
                break L11;
              } else {
                stackOut_138_0 = 1;
                stackIn_140_0 = stackOut_138_0;
                break L11;
              }
            }
            L12: {
              if (stackIn_140_0 == (this.field_t ? 1 : 0)) {
                L13: {
                  stackOut_142_0 = this;
                  stackIn_144_0 = stackOut_142_0;
                  stackIn_143_0 = stackOut_142_0;
                  if (var3 == 0) {
                    stackOut_144_0 = this;
                    stackOut_144_1 = 0;
                    stackIn_145_0 = stackOut_144_0;
                    stackIn_145_1 = stackOut_144_1;
                    break L13;
                  } else {
                    stackOut_143_0 = this;
                    stackOut_143_1 = 1;
                    stackIn_145_0 = stackOut_143_0;
                    stackIn_145_1 = stackOut_143_1;
                    break L13;
                  }
                }
                ((cda) (this)).field_t = stackIn_145_1 != 0;
                break L12;
              } else {
                break L12;
              }
            }
            L14: {
              stackOut_146_0 = this.field_q;
              stackIn_148_0 = stackOut_146_0;
              stackIn_147_0 = stackOut_146_0;
              if (var2 != 0) {
                stackOut_148_0 = stackIn_148_0;
                stackOut_148_1 = 0;
                stackIn_149_0 = stackOut_148_0;
                stackIn_149_1 = stackOut_148_1;
                break L14;
              } else {
                stackOut_147_0 = stackIn_147_0;
                stackOut_147_1 = 1;
                stackIn_149_0 = stackOut_147_0;
                stackIn_149_1 = stackOut_147_1;
                break L14;
              }
            }
            if ((stackIn_149_0 ? 1 : 0) != stackIn_149_1) {
              this.field_n = this.field_n + 1;
              this.field_s = var4;
              this.field_v = var5;
              return;
            } else {
              L15: {
                stackOut_150_0 = this;
                stackIn_152_0 = stackOut_150_0;
                stackIn_151_0 = stackOut_150_0;
                if (var2 == 0) {
                  stackOut_152_0 = this;
                  stackOut_152_1 = 0;
                  stackIn_153_0 = stackOut_152_0;
                  stackIn_153_1 = stackOut_152_1;
                  break L15;
                } else {
                  stackOut_151_0 = this;
                  stackOut_151_1 = 1;
                  stackIn_153_0 = stackOut_151_0;
                  stackIn_153_1 = stackOut_151_1;
                  break L15;
                }
              }
              ((cda) (this)).field_q = stackIn_153_1 != 0;
              this.field_n = 1;
              if (var8 != 0) {
                this.field_n = this.field_n + 1;
                this.field_s = var4;
                this.field_v = var5;
                return;
              } else {
                this.field_s = var4;
                this.field_v = var5;
                return;
              }
            }
          } else {
            L16: {
              this.field_o = -this.field_o + 8192;
              this.field_m = var6;
              if (var3 != 0) {
                stackOut_116_0 = 0;
                stackIn_117_0 = stackOut_116_0;
                break L16;
              } else {
                stackOut_115_0 = 1;
                stackIn_117_0 = stackOut_115_0;
                break L16;
              }
            }
            L17: {
              if (stackIn_117_0 == (this.field_t ? 1 : 0)) {
                L18: {
                  stackOut_119_0 = this;
                  stackIn_121_0 = stackOut_119_0;
                  stackIn_120_0 = stackOut_119_0;
                  if (var3 == 0) {
                    stackOut_121_0 = this;
                    stackOut_121_1 = 0;
                    stackIn_122_0 = stackOut_121_0;
                    stackIn_122_1 = stackOut_121_1;
                    break L18;
                  } else {
                    stackOut_120_0 = this;
                    stackOut_120_1 = 1;
                    stackIn_122_0 = stackOut_120_0;
                    stackIn_122_1 = stackOut_120_1;
                    break L18;
                  }
                }
                ((cda) (this)).field_t = stackIn_122_1 != 0;
                break L17;
              } else {
                break L17;
              }
            }
            L19: {
              stackOut_123_0 = this.field_q;
              stackIn_125_0 = stackOut_123_0;
              stackIn_124_0 = stackOut_123_0;
              if (var2 != 0) {
                stackOut_125_0 = stackIn_125_0;
                stackOut_125_1 = 0;
                stackIn_126_0 = stackOut_125_0;
                stackIn_126_1 = stackOut_125_1;
                break L19;
              } else {
                stackOut_124_0 = stackIn_124_0;
                stackOut_124_1 = 1;
                stackIn_126_0 = stackOut_124_0;
                stackIn_126_1 = stackOut_124_1;
                break L19;
              }
            }
            if ((stackIn_126_0 ? 1 : 0) != stackIn_126_1) {
              this.field_n = this.field_n + 1;
              this.field_s = var4;
              this.field_v = var5;
              return;
            } else {
              L20: {
                stackOut_127_0 = this;
                stackIn_129_0 = stackOut_127_0;
                stackIn_128_0 = stackOut_127_0;
                if (var2 == 0) {
                  stackOut_129_0 = this;
                  stackOut_129_1 = 0;
                  stackIn_130_0 = stackOut_129_0;
                  stackIn_130_1 = stackOut_129_1;
                  break L20;
                } else {
                  stackOut_128_0 = this;
                  stackOut_128_1 = 1;
                  stackIn_130_0 = stackOut_128_0;
                  stackIn_130_1 = stackOut_128_1;
                  break L20;
                }
              }
              ((cda) (this)).field_q = stackIn_130_1 != 0;
              this.field_n = 1;
              if (var8 != 0) {
                this.field_n = this.field_n + 1;
                this.field_s = var4;
                this.field_v = var5;
                return;
              } else {
                this.field_s = var4;
                this.field_v = var5;
                return;
              }
            }
          }
        } else {
          this.field_t = false;
          this.field_n = 1;
          this.field_r = false;
          this.field_o = 0;
          this.field_q = false;
          if (var8 != 0) {
            L21: {
              if (this.field_m == var6) {
                stackOut_28_0 = 0;
                stackIn_29_0 = stackOut_28_0;
                break L21;
              } else {
                stackOut_27_0 = 1;
                stackIn_29_0 = stackOut_27_0;
                break L21;
              }
            }
            var3 = stackIn_29_0;
            if (this.field_s != var4) {
              L22: {
                var2 = 1;
                this.field_o = dfa.a(-this.field_m + var6, 8192, -60);
                if (-4097 <= (this.field_o ^ -1)) {
                  break L22;
                } else {
                  this.field_o = -this.field_o + 8192;
                  break L22;
                }
              }
              L23: {
                this.field_m = var6;
                if (var3 != 0) {
                  stackOut_61_0 = 0;
                  stackIn_62_0 = stackOut_61_0;
                  break L23;
                } else {
                  stackOut_60_0 = 1;
                  stackIn_62_0 = stackOut_60_0;
                  break L23;
                }
              }
              L24: {
                if (stackIn_62_0 == (this.field_t ? 1 : 0)) {
                  L25: {
                    stackOut_64_0 = this;
                    stackIn_66_0 = stackOut_64_0;
                    stackIn_65_0 = stackOut_64_0;
                    if (var3 == 0) {
                      stackOut_66_0 = this;
                      stackOut_66_1 = 0;
                      stackIn_67_0 = stackOut_66_0;
                      stackIn_67_1 = stackOut_66_1;
                      break L25;
                    } else {
                      stackOut_65_0 = this;
                      stackOut_65_1 = 1;
                      stackIn_67_0 = stackOut_65_0;
                      stackIn_67_1 = stackOut_65_1;
                      break L25;
                    }
                  }
                  ((cda) (this)).field_t = stackIn_67_1 != 0;
                  break L24;
                } else {
                  break L24;
                }
              }
              L26: {
                stackOut_68_0 = this.field_q;
                stackIn_70_0 = stackOut_68_0;
                stackIn_69_0 = stackOut_68_0;
                if (var2 != 0) {
                  stackOut_70_0 = stackIn_70_0;
                  stackOut_70_1 = 0;
                  stackIn_71_0 = stackOut_70_0;
                  stackIn_71_1 = stackOut_70_1;
                  break L26;
                } else {
                  stackOut_69_0 = stackIn_69_0;
                  stackOut_69_1 = 1;
                  stackIn_71_0 = stackOut_69_0;
                  stackIn_71_1 = stackOut_69_1;
                  break L26;
                }
              }
              L27: {
                L28: {
                  if ((stackIn_71_0 ? 1 : 0) != stackIn_71_1) {
                    break L28;
                  } else {
                    L29: {
                      stackOut_72_0 = this;
                      stackIn_74_0 = stackOut_72_0;
                      stackIn_73_0 = stackOut_72_0;
                      if (var2 == 0) {
                        stackOut_74_0 = this;
                        stackOut_74_1 = 0;
                        stackIn_75_0 = stackOut_74_0;
                        stackIn_75_1 = stackOut_74_1;
                        break L29;
                      } else {
                        stackOut_73_0 = this;
                        stackOut_73_1 = 1;
                        stackIn_75_0 = stackOut_73_0;
                        stackIn_75_1 = stackOut_73_1;
                        break L29;
                      }
                    }
                    ((cda) (this)).field_q = stackIn_75_1 != 0;
                    this.field_n = 1;
                    if (var8 == 0) {
                      this.field_s = var4;
                      this.field_v = var5;
                      break L27;
                    } else {
                      break L28;
                    }
                  }
                }
                this.field_n = this.field_n + 1;
                this.field_s = var4;
                this.field_v = var5;
                break L27;
              }
              return;
            } else {
              L30: {
                if (var5 == this.field_v) {
                  stackOut_32_0 = 0;
                  stackIn_33_0 = stackOut_32_0;
                  break L30;
                } else {
                  stackOut_31_0 = 1;
                  stackIn_33_0 = stackOut_31_0;
                  break L30;
                }
              }
              L31: {
                var2 = stackIn_33_0;
                this.field_o = dfa.a(-this.field_m + var6, 8192, -60);
                if (-4097 <= (this.field_o ^ -1)) {
                  break L31;
                } else {
                  this.field_o = -this.field_o + 8192;
                  break L31;
                }
              }
              L32: {
                this.field_m = var6;
                if (var3 != 0) {
                  stackOut_37_0 = 0;
                  stackIn_38_0 = stackOut_37_0;
                  break L32;
                } else {
                  stackOut_36_0 = 1;
                  stackIn_38_0 = stackOut_36_0;
                  break L32;
                }
              }
              L33: {
                if (stackIn_38_0 == (this.field_t ? 1 : 0)) {
                  L34: {
                    stackOut_40_0 = this;
                    stackIn_42_0 = stackOut_40_0;
                    stackIn_41_0 = stackOut_40_0;
                    if (var3 == 0) {
                      stackOut_42_0 = this;
                      stackOut_42_1 = 0;
                      stackIn_43_0 = stackOut_42_0;
                      stackIn_43_1 = stackOut_42_1;
                      break L34;
                    } else {
                      stackOut_41_0 = this;
                      stackOut_41_1 = 1;
                      stackIn_43_0 = stackOut_41_0;
                      stackIn_43_1 = stackOut_41_1;
                      break L34;
                    }
                  }
                  ((cda) (this)).field_t = stackIn_43_1 != 0;
                  break L33;
                } else {
                  break L33;
                }
              }
              L35: {
                stackOut_44_0 = this.field_q;
                stackIn_46_0 = stackOut_44_0;
                stackIn_45_0 = stackOut_44_0;
                if (var2 != 0) {
                  stackOut_46_0 = stackIn_46_0;
                  stackOut_46_1 = 0;
                  stackIn_47_0 = stackOut_46_0;
                  stackIn_47_1 = stackOut_46_1;
                  break L35;
                } else {
                  stackOut_45_0 = stackIn_45_0;
                  stackOut_45_1 = 1;
                  stackIn_47_0 = stackOut_45_0;
                  stackIn_47_1 = stackOut_45_1;
                  break L35;
                }
              }
              L36: {
                L37: {
                  if ((stackIn_47_0 ? 1 : 0) != stackIn_47_1) {
                    break L37;
                  } else {
                    L38: {
                      stackOut_48_0 = this;
                      stackIn_50_0 = stackOut_48_0;
                      stackIn_49_0 = stackOut_48_0;
                      if (var2 == 0) {
                        stackOut_50_0 = this;
                        stackOut_50_1 = 0;
                        stackIn_51_0 = stackOut_50_0;
                        stackIn_51_1 = stackOut_50_1;
                        break L38;
                      } else {
                        stackOut_49_0 = this;
                        stackOut_49_1 = 1;
                        stackIn_51_0 = stackOut_49_0;
                        stackIn_51_1 = stackOut_49_1;
                        break L38;
                      }
                    }
                    ((cda) (this)).field_q = stackIn_51_1 != 0;
                    this.field_n = 1;
                    if (var8 == 0) {
                      this.field_s = var4;
                      this.field_v = var5;
                      break L36;
                    } else {
                      break L37;
                    }
                  }
                }
                this.field_n = this.field_n + 1;
                this.field_s = var4;
                this.field_v = var5;
                break L36;
              }
              return;
            }
          } else {
            L39: {
              this.field_m = var6;
              if (var3 != 0) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L39;
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                break L39;
              }
            }
            L40: {
              if (stackIn_8_0 == (this.field_t ? 1 : 0)) {
                L41: {
                  stackOut_10_0 = this;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_11_0 = stackOut_10_0;
                  if (var3 == 0) {
                    stackOut_12_0 = this;
                    stackOut_12_1 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    break L41;
                  } else {
                    stackOut_11_0 = this;
                    stackOut_11_1 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    break L41;
                  }
                }
                ((cda) (this)).field_t = stackIn_13_1 != 0;
                break L40;
              } else {
                break L40;
              }
            }
            L42: {
              stackOut_14_0 = this.field_q;
              stackIn_16_0 = stackOut_14_0;
              stackIn_15_0 = stackOut_14_0;
              if (var2 != 0) {
                stackOut_16_0 = stackIn_16_0;
                stackOut_16_1 = 0;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                break L42;
              } else {
                stackOut_15_0 = stackIn_15_0;
                stackOut_15_1 = 1;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                break L42;
              }
            }
            L43: {
              if ((stackIn_17_0 ? 1 : 0) != stackIn_17_1) {
                break L43;
              } else {
                L44: {
                  stackOut_18_0 = this;
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_19_0 = stackOut_18_0;
                  if (var2 == 0) {
                    stackOut_20_0 = this;
                    stackOut_20_1 = 0;
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    break L44;
                  } else {
                    stackOut_19_0 = this;
                    stackOut_19_1 = 1;
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_21_1 = stackOut_19_1;
                    break L44;
                  }
                }
                ((cda) (this)).field_q = stackIn_21_1 != 0;
                this.field_n = 1;
                if (var8 == 0) {
                  this.field_s = var4;
                  this.field_v = var5;
                  return;
                } else {
                  break L43;
                }
              }
            }
            this.field_n = this.field_n + 1;
            this.field_s = var4;
            this.field_v = var5;
            return;
          }
        }
    }

    final static void a(int param0, boolean param1) {
        ira.a(param1, hb.field_t.field_d, (byte) -100);
        if (param0 != 0) {
            cda.a(50, false);
        }
    }

    cda(int param0) {
        super(param0);
        this.field_r = true;
    }

    final int b(boolean param0) {
        if (param0) {
            this.field_r = false;
            return this.field_n;
        }
        return this.field_n;
    }

    static {
        field_p = 0;
        field_u = "Encouraging rule breaking";
    }
}
