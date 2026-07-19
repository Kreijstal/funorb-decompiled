/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh extends nv implements ut {
    static nh field_y;
    private int field_n;
    private boolean field_D;
    private mg field_t;
    private int field_q;
    private jma field_C;
    private boolean field_v;
    private pc field_u;
    private int field_x;
    private mma field_p;
    private int field_s;
    private up field_z;
    private int field_E;
    private boolean field_A;
    static String[][] field_w;
    private int field_o;
    private boolean field_r;

    final int a(boolean param0) {
        if (param0) {
            this.field_v = false;
            return 30;
        }
        return 30;
    }

    final void n(byte param0) {
        super.n((byte) 75);
        if (param0 > 68) {
          this.q((byte) 92);
          if (!this.field_D) {
            this.field_z = new up(this.e(6), 4, 128);
            if (TombRacer.field_G) {
              this.field_z = null;
              return;
            } else {
              return;
            }
          } else {
            this.field_z = null;
            return;
          }
        } else {
          this.field_n = 46;
          this.q((byte) 92);
          if (!this.field_D) {
            this.field_z = new up(this.e(6), 4, 128);
            if (!TombRacer.field_G) {
              return;
            } else {
              this.field_z = null;
              return;
            }
          } else {
            this.field_z = null;
            return;
          }
        }
    }

    final void g(int param0) {
        super.g(param0 + 0);
        if (param0 != -2) {
          this.field_C = (jma) null;
          this.field_C.a((byte) 48, this.h((byte) 111));
          return;
        } else {
          this.field_C.a((byte) 48, this.h((byte) 111));
          return;
        }
    }

    public final jma k(byte param0) {
        int discarded$0 = 0;
        if (param0 >= -67) {
            discarded$0 = this.j((byte) 54);
            return this.field_C;
        }
        return this.field_C;
    }

    public final int j(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -108) {
          L0: {
            field_y = (nh) null;
            if (this.field_C.b((byte) 88)) {
              stackOut_7_0 = 1;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 0;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (this.field_C.b((byte) 88)) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 0;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    final void k(int param0) {
        boolean discarded$5 = false;
        boolean discarded$6 = false;
        boolean discarded$7 = false;
        boolean discarded$8 = false;
        int discarded$9 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        pc var7_ref_pc = null;
        int var7 = 0;
        pc var8 = null;
        int var9 = 0;
        int var10 = 0;
        la var11 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        la stackIn_23_0 = null;
        la stackIn_24_0 = null;
        la stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        la stackIn_27_0 = null;
        la stackIn_28_0 = null;
        la stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        Object stackIn_41_0 = null;
        Object stackIn_42_0 = null;
        Object stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int stackIn_49_0 = 0;
        mma stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        mma stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        mma stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        int stackIn_68_2 = 0;
        Object stackIn_70_0 = null;
        Object stackIn_71_0 = null;
        Object stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        mma stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        mma stackIn_87_0 = null;
        int stackIn_87_1 = 0;
        mma stackIn_88_0 = null;
        int stackIn_88_1 = 0;
        int stackIn_88_2 = 0;
        mma stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        mma stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        mma stackIn_94_0 = null;
        int stackIn_94_1 = 0;
        int stackIn_94_2 = 0;
        mma stackIn_103_0 = null;
        int stackIn_103_1 = 0;
        mma stackIn_104_0 = null;
        int stackIn_104_1 = 0;
        mma stackIn_105_0 = null;
        int stackIn_105_1 = 0;
        int stackIn_105_2 = 0;
        int stackIn_107_0 = 0;
        mma stackIn_112_0 = null;
        int stackIn_112_1 = 0;
        mma stackIn_113_0 = null;
        int stackIn_113_1 = 0;
        mma stackIn_114_0 = null;
        int stackIn_114_1 = 0;
        int stackIn_114_2 = 0;
        mma stackIn_119_0 = null;
        int stackIn_119_1 = 0;
        mma stackIn_120_0 = null;
        int stackIn_120_1 = 0;
        mma stackIn_121_0 = null;
        int stackIn_121_1 = 0;
        int stackIn_121_2 = 0;
        mma stackIn_125_0 = null;
        int stackIn_125_1 = 0;
        mma stackIn_126_0 = null;
        int stackIn_126_1 = 0;
        mma stackIn_127_0 = null;
        int stackIn_127_1 = 0;
        int stackIn_127_2 = 0;
        mma stackIn_136_0 = null;
        int stackIn_136_1 = 0;
        mma stackIn_137_0 = null;
        int stackIn_137_1 = 0;
        mma stackIn_138_0 = null;
        int stackIn_138_1 = 0;
        int stackIn_138_2 = 0;
        mma stackIn_150_0 = null;
        int stackIn_150_1 = 0;
        mma stackIn_151_0 = null;
        int stackIn_151_1 = 0;
        mma stackIn_152_0 = null;
        int stackIn_152_1 = 0;
        int stackIn_152_2 = 0;
        mma stackIn_154_0 = null;
        int stackIn_154_1 = 0;
        mma stackIn_155_0 = null;
        int stackIn_155_1 = 0;
        mma stackIn_156_0 = null;
        int stackIn_156_1 = 0;
        int stackIn_156_2 = 0;
        mma stackIn_169_0 = null;
        int stackIn_169_1 = 0;
        mma stackIn_170_0 = null;
        int stackIn_170_1 = 0;
        mma stackIn_171_0 = null;
        int stackIn_171_1 = 0;
        int stackIn_171_2 = 0;
        mma stackIn_173_0 = null;
        int stackIn_173_1 = 0;
        mma stackIn_174_0 = null;
        int stackIn_174_1 = 0;
        mma stackIn_175_0 = null;
        int stackIn_175_1 = 0;
        int stackIn_175_2 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        la stackOut_22_0 = null;
        la stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        la stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        la stackOut_26_0 = null;
        la stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        la stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        Object stackOut_69_0 = null;
        Object stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        Object stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        mma stackOut_91_0 = null;
        int stackOut_91_1 = 0;
        mma stackOut_93_0 = null;
        int stackOut_93_1 = 0;
        int stackOut_93_2 = 0;
        mma stackOut_92_0 = null;
        int stackOut_92_1 = 0;
        int stackOut_92_2 = 0;
        mma stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        mma stackOut_87_0 = null;
        int stackOut_87_1 = 0;
        int stackOut_87_2 = 0;
        mma stackOut_86_0 = null;
        int stackOut_86_1 = 0;
        int stackOut_86_2 = 0;
        mma stackOut_102_0 = null;
        int stackOut_102_1 = 0;
        mma stackOut_104_0 = null;
        int stackOut_104_1 = 0;
        int stackOut_104_2 = 0;
        mma stackOut_103_0 = null;
        int stackOut_103_1 = 0;
        int stackOut_103_2 = 0;
        int stackOut_75_0 = 0;
        int stackOut_73_0 = 0;
        mma stackOut_135_0 = null;
        int stackOut_135_1 = 0;
        mma stackOut_137_0 = null;
        int stackOut_137_1 = 0;
        int stackOut_137_2 = 0;
        mma stackOut_136_0 = null;
        int stackOut_136_1 = 0;
        int stackOut_136_2 = 0;
        mma stackOut_124_0 = null;
        int stackOut_124_1 = 0;
        mma stackOut_126_0 = null;
        int stackOut_126_1 = 0;
        int stackOut_126_2 = 0;
        mma stackOut_125_0 = null;
        int stackOut_125_1 = 0;
        int stackOut_125_2 = 0;
        mma stackOut_118_0 = null;
        int stackOut_118_1 = 0;
        mma stackOut_120_0 = null;
        int stackOut_120_1 = 0;
        int stackOut_120_2 = 0;
        mma stackOut_119_0 = null;
        int stackOut_119_1 = 0;
        int stackOut_119_2 = 0;
        mma stackOut_111_0 = null;
        int stackOut_111_1 = 0;
        mma stackOut_113_0 = null;
        int stackOut_113_1 = 0;
        int stackOut_113_2 = 0;
        mma stackOut_112_0 = null;
        int stackOut_112_1 = 0;
        int stackOut_112_2 = 0;
        mma stackOut_172_0 = null;
        int stackOut_172_1 = 0;
        mma stackOut_174_0 = null;
        int stackOut_174_1 = 0;
        int stackOut_174_2 = 0;
        mma stackOut_173_0 = null;
        int stackOut_173_1 = 0;
        int stackOut_173_2 = 0;
        mma stackOut_168_0 = null;
        int stackOut_168_1 = 0;
        mma stackOut_170_0 = null;
        int stackOut_170_1 = 0;
        int stackOut_170_2 = 0;
        mma stackOut_169_0 = null;
        int stackOut_169_1 = 0;
        int stackOut_169_2 = 0;
        mma stackOut_153_0 = null;
        int stackOut_153_1 = 0;
        mma stackOut_155_0 = null;
        int stackOut_155_1 = 0;
        int stackOut_155_2 = 0;
        mma stackOut_154_0 = null;
        int stackOut_154_1 = 0;
        int stackOut_154_2 = 0;
        mma stackOut_149_0 = null;
        int stackOut_149_1 = 0;
        mma stackOut_151_0 = null;
        int stackOut_151_1 = 0;
        int stackOut_151_2 = 0;
        mma stackOut_150_0 = null;
        int stackOut_150_1 = 0;
        int stackOut_150_2 = 0;
        Object stackOut_40_0 = null;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        Object stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_44_0 = 0;
        mma stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        mma stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        int stackOut_67_2 = 0;
        mma stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        int stackOut_66_2 = 0;
        L0: {
          var10 = TombRacer.field_G ? 1 : 0;
          var11 = this.b(true);
          if (!this.i(12340).g(112)) {
            if (null == this.field_t) {
              break L0;
            } else {
              this.field_t.d(param0 + -5418);
              if (!this.field_t.c(0)) {
                break L0;
              } else {
                L1: {
                  this.field_s = 0;
                  stackOut_4_0 = this;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (this.field_A) {
                    stackOut_6_0 = this;
                    stackOut_6_1 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    break L1;
                  } else {
                    stackOut_5_0 = this;
                    stackOut_5_1 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    break L1;
                  }
                }
                ((wh) (this)).field_A = stackIn_7_1 != 0;
                break L0;
              }
            }
          } else {
            break L0;
          }
        }
        if (!this.field_C.f((byte) -56)) {
          if (!this.field_A) {
            return;
          } else {
            L2: {
              var3 = this.field_q;
              if (0 == var3) {
                var3 = 268435456;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                if (this.field_n <= 0) {
                  break L4;
                } else {
                  this.field_s = this.field_s + this.field_n;
                  if (this.field_s > var3) {
                    this.field_s = var3;
                    if (var10 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              this.field_s = var3;
              break L3;
            }
            L5: {
              L6: {
                this.field_x = this.field_g.g(-25787) >> 2092532578;
                this.field_E = hua.a((byte) 102, this.field_x);
                this.field_o = bua.a(0, this.field_x);
                var6 = this.field_g.P(0) << 1223058128;
                if (!this.field_D) {
                  break L6;
                } else {
                  L7: {
                    this.q((byte) 92);
                    stackOut_22_0 = (la) (var11);
                    stackIn_24_0 = stackOut_22_0;
                    stackIn_23_0 = stackOut_22_0;
                    if (!this.field_v) {
                      stackOut_24_0 = (la) ((Object) stackIn_24_0);
                      stackOut_24_1 = 4;
                      stackIn_25_0 = stackOut_24_0;
                      stackIn_25_1 = stackOut_24_1;
                      break L7;
                    } else {
                      stackOut_23_0 = (la) ((Object) stackIn_23_0);
                      stackOut_23_1 = 3;
                      stackIn_25_0 = stackOut_23_0;
                      stackIn_25_1 = stackOut_23_1;
                      break L7;
                    }
                  }
                  discarded$5 = ((la) (Object) stackIn_25_0).a(stackIn_25_1, this.field_u, this.e(6), (byte) -123);
                  var4 = this.a(this.field_u, (byte) -68);
                  this.q((byte) 92);
                  discarded$6 = var11.a(1, this.field_u, this.e(6), (byte) 75);
                  var5 = this.a(this.field_u, (byte) 57);
                  if (var10 == 0) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              L8: {
                this.q((byte) 92);
                stackOut_26_0 = (la) (var11);
                stackIn_28_0 = stackOut_26_0;
                stackIn_27_0 = stackOut_26_0;
                if (this.field_v) {
                  stackOut_28_0 = (la) ((Object) stackIn_28_0);
                  stackOut_28_1 = 3;
                  stackIn_29_0 = stackOut_28_0;
                  stackIn_29_1 = stackOut_28_1;
                  break L8;
                } else {
                  stackOut_27_0 = (la) ((Object) stackIn_27_0);
                  stackOut_27_1 = 4;
                  stackIn_29_0 = stackOut_27_0;
                  stackIn_29_1 = stackOut_27_1;
                  break L8;
                }
              }
              discarded$7 = ((la) (Object) stackIn_29_0).a(stackIn_29_1, this.field_g, -44, this.field_u, this.e(6), this.field_z);
              var4 = this.a(this.field_u, (byte) 72);
              this.q((byte) 92);
              discarded$8 = var11.a(1, this.field_g, -91, this.field_u, this.e(6), this.field_z);
              var11.b(false).a((byte) 119, this.field_u, this.field_z);
              var7_ref_pc = this.field_u;
              L9: while (true) {
                if (var7_ref_pc.field_h == null) {
                  var11.b(false).a(var7_ref_pc, this.field_g, (byte) -119);
                  var5 = this.a(this.field_u, (byte) -65);
                  break L5;
                } else {
                  var7_ref_pc = var7_ref_pc.field_h;
                  if (var10 != 0) {
                    var5 = this.a(this.field_u, (byte) -65);
                    break L5;
                  } else {
                    if (var10 == 0) {
                      continue L9;
                    } else {
                      var11.b(false).a(var7_ref_pc, this.field_g, (byte) -119);
                      var5 = this.a(this.field_u, (byte) -65);
                      break L5;
                    }
                  }
                }
              }
            }
            if (param0 == 5418) {
              L10: {
                stackOut_69_0 = this;
                stackIn_71_0 = stackOut_69_0;
                stackIn_70_0 = stackOut_69_0;
                if (var5 == var4) {
                  stackOut_71_0 = this;
                  stackOut_71_1 = 0;
                  stackIn_72_0 = stackOut_71_0;
                  stackIn_72_1 = stackOut_71_1;
                  break L10;
                } else {
                  stackOut_70_0 = this;
                  stackOut_70_1 = 1;
                  stackIn_72_0 = stackOut_70_0;
                  stackIn_72_1 = stackOut_70_1;
                  break L10;
                }
              }
              L11: {
                ((wh) (this)).field_r = stackIn_72_1 != 0;
                if (!this.field_r) {
                  if (this.field_C.b((byte) 83)) {
                    L12: {
                      var7 = 1;
                      if (var7 != 0) {
                        this.field_u.field_j = 9;
                        break L12;
                      } else {
                        this.field_u.field_j = 8;
                        if (var10 == 0) {
                          break L12;
                        } else {
                          this.field_u.field_j = 9;
                          break L12;
                        }
                      }
                    }
                    L13: {
                      if (!this.field_D) {
                        var8 = this.field_u;
                        var9 = var6;
                        L14: while (true) {
                          if (var8 != null) {
                            if (var8.field_l) {
                              L15: {
                                if (null != var8.field_h) {
                                  break L15;
                                } else {
                                  L16: {
                                    if (!this.field_r) {
                                      break L16;
                                    } else {
                                      var11.b(false).a(var8.field_a, (byte) -117, 9, var9, 1, 0, 4, 0, var8.field_e, 4, 8);
                                      if (var10 == 0) {
                                        break L15;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                  var11.b(false).a(var8.field_a, (byte) -120, 8, var9, 1, 0, 2, 0, var8.field_e, 2, 4);
                                  break L15;
                                }
                              }
                              var8 = var8.field_h;
                              if (var10 == 0) {
                                continue L14;
                              } else {
                                break L13;
                              }
                            } else {
                              L17: {
                                stackOut_91_0 = this.field_p;
                                stackOut_91_1 = -978;
                                stackIn_93_0 = stackOut_91_0;
                                stackIn_93_1 = stackOut_91_1;
                                stackIn_92_0 = stackOut_91_0;
                                stackIn_92_1 = stackOut_91_1;
                                if (!this.field_r) {
                                  stackOut_93_0 = (mma) ((Object) stackIn_93_0);
                                  stackOut_93_1 = stackIn_93_1;
                                  stackOut_93_2 = 65280;
                                  stackIn_94_0 = stackOut_93_0;
                                  stackIn_94_1 = stackOut_93_1;
                                  stackIn_94_2 = stackOut_93_2;
                                  break L17;
                                } else {
                                  stackOut_92_0 = (mma) ((Object) stackIn_92_0);
                                  stackOut_92_1 = stackIn_92_1;
                                  stackOut_92_2 = 16720384;
                                  stackIn_94_0 = stackOut_92_0;
                                  stackIn_94_1 = stackOut_92_1;
                                  stackIn_94_2 = stackOut_92_2;
                                  break L17;
                                }
                              }
                              ((mma) (Object) stackIn_94_0).a(stackIn_94_1, stackIn_94_2);
                              this.field_C.a((byte) -14, this.field_r);
                              return;
                            }
                          } else {
                            L18: {
                              stackOut_85_0 = this.field_p;
                              stackOut_85_1 = -978;
                              stackIn_87_0 = stackOut_85_0;
                              stackIn_87_1 = stackOut_85_1;
                              stackIn_86_0 = stackOut_85_0;
                              stackIn_86_1 = stackOut_85_1;
                              if (!this.field_r) {
                                stackOut_87_0 = (mma) ((Object) stackIn_87_0);
                                stackOut_87_1 = stackIn_87_1;
                                stackOut_87_2 = 65280;
                                stackIn_88_0 = stackOut_87_0;
                                stackIn_88_1 = stackOut_87_1;
                                stackIn_88_2 = stackOut_87_2;
                                break L18;
                              } else {
                                stackOut_86_0 = (mma) ((Object) stackIn_86_0);
                                stackOut_86_1 = stackIn_86_1;
                                stackOut_86_2 = 16720384;
                                stackIn_88_0 = stackOut_86_0;
                                stackIn_88_1 = stackOut_86_1;
                                stackIn_88_2 = stackOut_86_2;
                                break L18;
                              }
                            }
                            ((mma) (Object) stackIn_88_0).a(stackIn_88_1, stackIn_88_2);
                            this.field_C.a((byte) -14, this.field_r);
                            return;
                          }
                        }
                      } else {
                        break L13;
                      }
                    }
                    L19: {
                      stackOut_102_0 = this.field_p;
                      stackOut_102_1 = -978;
                      stackIn_104_0 = stackOut_102_0;
                      stackIn_104_1 = stackOut_102_1;
                      stackIn_103_0 = stackOut_102_0;
                      stackIn_103_1 = stackOut_102_1;
                      if (!this.field_r) {
                        stackOut_104_0 = (mma) ((Object) stackIn_104_0);
                        stackOut_104_1 = stackIn_104_1;
                        stackOut_104_2 = 65280;
                        stackIn_105_0 = stackOut_104_0;
                        stackIn_105_1 = stackOut_104_1;
                        stackIn_105_2 = stackOut_104_2;
                        break L19;
                      } else {
                        stackOut_103_0 = (mma) ((Object) stackIn_103_0);
                        stackOut_103_1 = stackIn_103_1;
                        stackOut_103_2 = 16720384;
                        stackIn_105_0 = stackOut_103_0;
                        stackIn_105_1 = stackOut_103_1;
                        stackIn_105_2 = stackOut_103_2;
                        break L19;
                      }
                    }
                    ((mma) (Object) stackIn_105_0).a(stackIn_105_1, stackIn_105_2);
                    this.field_C.a((byte) -14, this.field_r);
                    return;
                  } else {
                    stackOut_75_0 = 0;
                    stackIn_107_0 = stackOut_75_0;
                    break L11;
                  }
                } else {
                  stackOut_73_0 = 1;
                  stackIn_107_0 = stackOut_73_0;
                  break L11;
                }
              }
              var7 = stackIn_107_0;
              if (var7 != 0) {
                this.field_u.field_j = 9;
                if (!this.field_D) {
                  var8 = this.field_u;
                  var9 = var6;
                  L20: while (true) {
                    if (var8 != null) {
                      if (var8.field_l) {
                        L21: {
                          if (null != var8.field_h) {
                            break L21;
                          } else {
                            L22: {
                              if (!this.field_r) {
                                break L22;
                              } else {
                                var11.b(false).a(var8.field_a, (byte) -117, 9, var9, 1, 0, 4, 0, var8.field_e, 4, 8);
                                if (var10 == 0) {
                                  break L21;
                                } else {
                                  break L22;
                                }
                              }
                            }
                            var11.b(false).a(var8.field_a, (byte) -120, 8, var9, 1, 0, 2, 0, var8.field_e, 2, 4);
                            break L21;
                          }
                        }
                        var8 = var8.field_h;
                        if (var10 == 0) {
                          continue L20;
                        } else {
                          L23: {
                            stackOut_135_0 = this.field_p;
                            stackOut_135_1 = -978;
                            stackIn_137_0 = stackOut_135_0;
                            stackIn_137_1 = stackOut_135_1;
                            stackIn_136_0 = stackOut_135_0;
                            stackIn_136_1 = stackOut_135_1;
                            if (!this.field_r) {
                              stackOut_137_0 = (mma) ((Object) stackIn_137_0);
                              stackOut_137_1 = stackIn_137_1;
                              stackOut_137_2 = 65280;
                              stackIn_138_0 = stackOut_137_0;
                              stackIn_138_1 = stackOut_137_1;
                              stackIn_138_2 = stackOut_137_2;
                              break L23;
                            } else {
                              stackOut_136_0 = (mma) ((Object) stackIn_136_0);
                              stackOut_136_1 = stackIn_136_1;
                              stackOut_136_2 = 16720384;
                              stackIn_138_0 = stackOut_136_0;
                              stackIn_138_1 = stackOut_136_1;
                              stackIn_138_2 = stackOut_136_2;
                              break L23;
                            }
                          }
                          ((mma) (Object) stackIn_138_0).a(stackIn_138_1, stackIn_138_2);
                          this.field_C.a((byte) -14, this.field_r);
                          return;
                        }
                      } else {
                        L24: {
                          stackOut_124_0 = this.field_p;
                          stackOut_124_1 = -978;
                          stackIn_126_0 = stackOut_124_0;
                          stackIn_126_1 = stackOut_124_1;
                          stackIn_125_0 = stackOut_124_0;
                          stackIn_125_1 = stackOut_124_1;
                          if (!this.field_r) {
                            stackOut_126_0 = (mma) ((Object) stackIn_126_0);
                            stackOut_126_1 = stackIn_126_1;
                            stackOut_126_2 = 65280;
                            stackIn_127_0 = stackOut_126_0;
                            stackIn_127_1 = stackOut_126_1;
                            stackIn_127_2 = stackOut_126_2;
                            break L24;
                          } else {
                            stackOut_125_0 = (mma) ((Object) stackIn_125_0);
                            stackOut_125_1 = stackIn_125_1;
                            stackOut_125_2 = 16720384;
                            stackIn_127_0 = stackOut_125_0;
                            stackIn_127_1 = stackOut_125_1;
                            stackIn_127_2 = stackOut_125_2;
                            break L24;
                          }
                        }
                        ((mma) (Object) stackIn_127_0).a(stackIn_127_1, stackIn_127_2);
                        this.field_C.a((byte) -14, this.field_r);
                        return;
                      }
                    } else {
                      L25: {
                        stackOut_118_0 = this.field_p;
                        stackOut_118_1 = -978;
                        stackIn_120_0 = stackOut_118_0;
                        stackIn_120_1 = stackOut_118_1;
                        stackIn_119_0 = stackOut_118_0;
                        stackIn_119_1 = stackOut_118_1;
                        if (!this.field_r) {
                          stackOut_120_0 = (mma) ((Object) stackIn_120_0);
                          stackOut_120_1 = stackIn_120_1;
                          stackOut_120_2 = 65280;
                          stackIn_121_0 = stackOut_120_0;
                          stackIn_121_1 = stackOut_120_1;
                          stackIn_121_2 = stackOut_120_2;
                          break L25;
                        } else {
                          stackOut_119_0 = (mma) ((Object) stackIn_119_0);
                          stackOut_119_1 = stackIn_119_1;
                          stackOut_119_2 = 16720384;
                          stackIn_121_0 = stackOut_119_0;
                          stackIn_121_1 = stackOut_119_1;
                          stackIn_121_2 = stackOut_119_2;
                          break L25;
                        }
                      }
                      ((mma) (Object) stackIn_121_0).a(stackIn_121_1, stackIn_121_2);
                      this.field_C.a((byte) -14, this.field_r);
                      return;
                    }
                  }
                } else {
                  L26: {
                    stackOut_111_0 = this.field_p;
                    stackOut_111_1 = -978;
                    stackIn_113_0 = stackOut_111_0;
                    stackIn_113_1 = stackOut_111_1;
                    stackIn_112_0 = stackOut_111_0;
                    stackIn_112_1 = stackOut_111_1;
                    if (!this.field_r) {
                      stackOut_113_0 = (mma) ((Object) stackIn_113_0);
                      stackOut_113_1 = stackIn_113_1;
                      stackOut_113_2 = 65280;
                      stackIn_114_0 = stackOut_113_0;
                      stackIn_114_1 = stackOut_113_1;
                      stackIn_114_2 = stackOut_113_2;
                      break L26;
                    } else {
                      stackOut_112_0 = (mma) ((Object) stackIn_112_0);
                      stackOut_112_1 = stackIn_112_1;
                      stackOut_112_2 = 16720384;
                      stackIn_114_0 = stackOut_112_0;
                      stackIn_114_1 = stackOut_112_1;
                      stackIn_114_2 = stackOut_112_2;
                      break L26;
                    }
                  }
                  ((mma) (Object) stackIn_114_0).a(stackIn_114_1, stackIn_114_2);
                  this.field_C.a((byte) -14, this.field_r);
                  return;
                }
              } else {
                this.field_u.field_j = 8;
                if (var10 == 0) {
                  if (this.field_D) {
                    L27: {
                      stackOut_172_0 = this.field_p;
                      stackOut_172_1 = -978;
                      stackIn_174_0 = stackOut_172_0;
                      stackIn_174_1 = stackOut_172_1;
                      stackIn_173_0 = stackOut_172_0;
                      stackIn_173_1 = stackOut_172_1;
                      if (!this.field_r) {
                        stackOut_174_0 = (mma) ((Object) stackIn_174_0);
                        stackOut_174_1 = stackIn_174_1;
                        stackOut_174_2 = 65280;
                        stackIn_175_0 = stackOut_174_0;
                        stackIn_175_1 = stackOut_174_1;
                        stackIn_175_2 = stackOut_174_2;
                        break L27;
                      } else {
                        stackOut_173_0 = (mma) ((Object) stackIn_173_0);
                        stackOut_173_1 = stackIn_173_1;
                        stackOut_173_2 = 16720384;
                        stackIn_175_0 = stackOut_173_0;
                        stackIn_175_1 = stackOut_173_1;
                        stackIn_175_2 = stackOut_173_2;
                        break L27;
                      }
                    }
                    ((mma) (Object) stackIn_175_0).a(stackIn_175_1, stackIn_175_2);
                    this.field_C.a((byte) -14, this.field_r);
                    return;
                  } else {
                    var8 = this.field_u;
                    var9 = var6;
                    L28: while (true) {
                      L29: {
                        if (var8 == null) {
                          break L29;
                        } else {
                          if (!var8.field_l) {
                            break L29;
                          } else {
                            L30: {
                              if (null != var8.field_h) {
                                break L30;
                              } else {
                                L31: {
                                  if (!this.field_r) {
                                    break L31;
                                  } else {
                                    var11.b(false).a(var8.field_a, (byte) -117, 9, var9, 1, 0, 4, 0, var8.field_e, 4, 8);
                                    if (var10 == 0) {
                                      break L30;
                                    } else {
                                      break L31;
                                    }
                                  }
                                }
                                var11.b(false).a(var8.field_a, (byte) -120, 8, var9, 1, 0, 2, 0, var8.field_e, 2, 4);
                                break L30;
                              }
                            }
                            var8 = var8.field_h;
                            if (var10 == 0) {
                              continue L28;
                            } else {
                              break L29;
                            }
                          }
                        }
                      }
                      L32: {
                        stackOut_168_0 = this.field_p;
                        stackOut_168_1 = -978;
                        stackIn_170_0 = stackOut_168_0;
                        stackIn_170_1 = stackOut_168_1;
                        stackIn_169_0 = stackOut_168_0;
                        stackIn_169_1 = stackOut_168_1;
                        if (!this.field_r) {
                          stackOut_170_0 = (mma) ((Object) stackIn_170_0);
                          stackOut_170_1 = stackIn_170_1;
                          stackOut_170_2 = 65280;
                          stackIn_171_0 = stackOut_170_0;
                          stackIn_171_1 = stackOut_170_1;
                          stackIn_171_2 = stackOut_170_2;
                          break L32;
                        } else {
                          stackOut_169_0 = (mma) ((Object) stackIn_169_0);
                          stackOut_169_1 = stackIn_169_1;
                          stackOut_169_2 = 16720384;
                          stackIn_171_0 = stackOut_169_0;
                          stackIn_171_1 = stackOut_169_1;
                          stackIn_171_2 = stackOut_169_2;
                          break L32;
                        }
                      }
                      ((mma) (Object) stackIn_171_0).a(stackIn_171_1, stackIn_171_2);
                      this.field_C.a((byte) -14, this.field_r);
                      return;
                    }
                  }
                } else {
                  this.field_u.field_j = 9;
                  if (this.field_D) {
                    L33: {
                      stackOut_153_0 = this.field_p;
                      stackOut_153_1 = -978;
                      stackIn_155_0 = stackOut_153_0;
                      stackIn_155_1 = stackOut_153_1;
                      stackIn_154_0 = stackOut_153_0;
                      stackIn_154_1 = stackOut_153_1;
                      if (!this.field_r) {
                        stackOut_155_0 = (mma) ((Object) stackIn_155_0);
                        stackOut_155_1 = stackIn_155_1;
                        stackOut_155_2 = 65280;
                        stackIn_156_0 = stackOut_155_0;
                        stackIn_156_1 = stackOut_155_1;
                        stackIn_156_2 = stackOut_155_2;
                        break L33;
                      } else {
                        stackOut_154_0 = (mma) ((Object) stackIn_154_0);
                        stackOut_154_1 = stackIn_154_1;
                        stackOut_154_2 = 16720384;
                        stackIn_156_0 = stackOut_154_0;
                        stackIn_156_1 = stackOut_154_1;
                        stackIn_156_2 = stackOut_154_2;
                        break L33;
                      }
                    }
                    ((mma) (Object) stackIn_156_0).a(stackIn_156_1, stackIn_156_2);
                    this.field_C.a((byte) -14, this.field_r);
                    return;
                  } else {
                    var8 = this.field_u;
                    var9 = var6;
                    L34: while (true) {
                      L35: {
                        if (var8 == null) {
                          break L35;
                        } else {
                          if (!var8.field_l) {
                            break L35;
                          } else {
                            L36: {
                              if (null != var8.field_h) {
                                break L36;
                              } else {
                                L37: {
                                  if (!this.field_r) {
                                    break L37;
                                  } else {
                                    var11.b(false).a(var8.field_a, (byte) -117, 9, var9, 1, 0, 4, 0, var8.field_e, 4, 8);
                                    if (var10 == 0) {
                                      break L36;
                                    } else {
                                      break L37;
                                    }
                                  }
                                }
                                var11.b(false).a(var8.field_a, (byte) -120, 8, var9, 1, 0, 2, 0, var8.field_e, 2, 4);
                                break L36;
                              }
                            }
                            var8 = var8.field_h;
                            if (var10 == 0) {
                              continue L34;
                            } else {
                              break L35;
                            }
                          }
                        }
                      }
                      L38: {
                        stackOut_149_0 = this.field_p;
                        stackOut_149_1 = -978;
                        stackIn_151_0 = stackOut_149_0;
                        stackIn_151_1 = stackOut_149_1;
                        stackIn_150_0 = stackOut_149_0;
                        stackIn_150_1 = stackOut_149_1;
                        if (!this.field_r) {
                          stackOut_151_0 = (mma) ((Object) stackIn_151_0);
                          stackOut_151_1 = stackIn_151_1;
                          stackOut_151_2 = 65280;
                          stackIn_152_0 = stackOut_151_0;
                          stackIn_152_1 = stackOut_151_1;
                          stackIn_152_2 = stackOut_151_2;
                          break L38;
                        } else {
                          stackOut_150_0 = (mma) ((Object) stackIn_150_0);
                          stackOut_150_1 = stackIn_150_1;
                          stackOut_150_2 = 16720384;
                          stackIn_152_0 = stackOut_150_0;
                          stackIn_152_1 = stackOut_150_1;
                          stackIn_152_2 = stackOut_150_2;
                          break L38;
                        }
                      }
                      ((mma) (Object) stackIn_152_0).a(stackIn_152_1, stackIn_152_2);
                      this.field_C.a((byte) -14, this.field_r);
                      return;
                    }
                  }
                }
              }
            } else {
              L39: {
                discarded$9 = this.a(false);
                stackOut_40_0 = this;
                stackIn_42_0 = stackOut_40_0;
                stackIn_41_0 = stackOut_40_0;
                if (var5 == var4) {
                  stackOut_42_0 = this;
                  stackOut_42_1 = 0;
                  stackIn_43_0 = stackOut_42_0;
                  stackIn_43_1 = stackOut_42_1;
                  break L39;
                } else {
                  stackOut_41_0 = this;
                  stackOut_41_1 = 1;
                  stackIn_43_0 = stackOut_41_0;
                  stackIn_43_1 = stackOut_41_1;
                  break L39;
                }
              }
              L40: {
                ((wh) (this)).field_r = stackIn_43_1 != 0;
                if (!this.field_r) {
                  if (this.field_C.b((byte) 83)) {
                    stackOut_47_0 = 1;
                    stackIn_49_0 = stackOut_47_0;
                    break L40;
                  } else {
                    stackOut_46_0 = 0;
                    stackIn_49_0 = stackOut_46_0;
                    break L40;
                  }
                } else {
                  stackOut_44_0 = 1;
                  stackIn_49_0 = stackOut_44_0;
                  break L40;
                }
              }
              L41: {
                var7 = stackIn_49_0;
                if (var7 != 0) {
                  this.field_u.field_j = 9;
                  break L41;
                } else {
                  this.field_u.field_j = 8;
                  if (var10 == 0) {
                    break L41;
                  } else {
                    this.field_u.field_j = 9;
                    break L41;
                  }
                }
              }
              L42: {
                if (!this.field_D) {
                  var8 = this.field_u;
                  var9 = var6;
                  L43: while (true) {
                    if (var8 == null) {
                      break L42;
                    } else {
                      if (!var8.field_l) {
                        break L42;
                      } else {
                        L44: {
                          if (null != var8.field_h) {
                            break L44;
                          } else {
                            L45: {
                              if (!this.field_r) {
                                break L45;
                              } else {
                                var11.b(false).a(var8.field_a, (byte) -117, 9, var9, 1, 0, 4, 0, var8.field_e, 4, 8);
                                if (var10 == 0) {
                                  break L44;
                                } else {
                                  break L45;
                                }
                              }
                            }
                            var11.b(false).a(var8.field_a, (byte) -120, 8, var9, 1, 0, 2, 0, var8.field_e, 2, 4);
                            break L44;
                          }
                        }
                        var8 = var8.field_h;
                        if (var10 == 0) {
                          continue L43;
                        } else {
                          break L42;
                        }
                      }
                    }
                  }
                } else {
                  break L42;
                }
              }
              L46: {
                stackOut_65_0 = this.field_p;
                stackOut_65_1 = -978;
                stackIn_67_0 = stackOut_65_0;
                stackIn_67_1 = stackOut_65_1;
                stackIn_66_0 = stackOut_65_0;
                stackIn_66_1 = stackOut_65_1;
                if (!this.field_r) {
                  stackOut_67_0 = (mma) ((Object) stackIn_67_0);
                  stackOut_67_1 = stackIn_67_1;
                  stackOut_67_2 = 65280;
                  stackIn_68_0 = stackOut_67_0;
                  stackIn_68_1 = stackOut_67_1;
                  stackIn_68_2 = stackOut_67_2;
                  break L46;
                } else {
                  stackOut_66_0 = (mma) ((Object) stackIn_66_0);
                  stackOut_66_1 = stackIn_66_1;
                  stackOut_66_2 = 16720384;
                  stackIn_68_0 = stackOut_66_0;
                  stackIn_68_1 = stackOut_66_1;
                  stackIn_68_2 = stackOut_66_2;
                  break L46;
                }
              }
              ((mma) (Object) stackIn_68_0).a(stackIn_68_1, stackIn_68_2);
              this.field_C.a((byte) -14, this.field_r);
              return;
            }
          }
        } else {
          this.c(false);
          return;
        }
    }

    final int a(int param0, int param1) {
        int discarded$2 = 0;
        param0 = upa.a(this.field_r, param0, (byte) -63);
        param0 = upa.a(this.field_A, param0, (byte) -57);
        if (param1 > -48) {
          discarded$2 = this.c(-120);
          param0 = fs.a((byte) 61, param0, this.field_s);
          return param0;
        } else {
          param0 = fs.a((byte) 61, param0, this.field_s);
          return param0;
        }
    }

    public final int g(byte param0) {
        if (param0 != -108) {
            return 56;
        }
        return 16711782;
    }

    private final int a(pc param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        int stackIn_1_1 = 0;
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        int stackOut_0_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              var3_int = -6 / ((param1 - -5) / 38);
              stackOut_0_0 = ua.a(param0.field_e - param0.field_d, -106);
              stackOut_0_1 = -ua.a(-param0.field_k + param0.field_a, 21);
              stackIn_2_0 = stackOut_0_0;
              stackIn_2_1 = stackOut_0_1;
              stackIn_1_0 = stackOut_0_0;
              stackIn_1_1 = stackOut_0_1;
              if (param0.field_h == null) {
                stackOut_2_0 = stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = 0;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                stackIn_3_2 = stackOut_2_2;
                break L1;
              } else {
                stackOut_1_0 = stackIn_1_0;
                stackOut_1_1 = stackIn_1_1;
                stackOut_1_2 = this.a(param0.field_h, (byte) -81);
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                stackIn_3_2 = stackOut_1_2;
                break L1;
              }
            }
            stackOut_3_0 = stackIn_3_0 - (stackIn_3_1 - stackIn_3_2);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("wh.P(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    wh(la param0, boolean param1) {
        super(param0, param1);
        this.field_u = new pc();
        this.field_s = 0;
        try {
            this.field_C = new jma(15);
            this.field_t = new mg();
            this.field_n = 0;
            this.field_q = 16777216;
            this.field_v = true;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "wh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void b(int param0, int param1) {
        if (param1 != 636) {
            this.field_u = (pc) null;
            this.field_q = param0;
            return;
        }
        this.field_q = param0;
    }

    final void a(byte param0, mg param1) {
        int discarded$0 = 0;
        try {
            if (param0 != -8) {
                discarded$0 = this.a(true);
            }
            this.field_t = param1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "wh.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            this.field_C.a(this.h((byte) 118), (byte) 113, param1);
            this.field_t.a(15637, param1);
            param1.a((byte) -125, this.field_q >> 1323616912, 10);
            param1.a((byte) -127, !this.field_v ? 0 : 1, 1);
            param1.a((byte) 110, !this.field_D ? 0 : 1, 1);
            param1.a((byte) -125, this.field_n >> 1892052496, 8);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "wh.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean p(byte param0) {
        int discarded$0 = 0;
        if (param0 != 120) {
            pc var3 = (pc) null;
            discarded$0 = this.a((pc) null, (byte) 1);
            return false;
        }
        return false;
    }

    final void a(boolean param0, fsa param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1);
              this.field_p = new mma(0, 16777215, this.field_u, param1.P(0));
              if (param0) {
                break L1;
              } else {
                this.field_u = (pc) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("wh.Q(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final int b(int param0) {
        int var2 = -89 % ((param0 - -46) / 45);
        return 1;
    }

    public final int c(int param0) {
        if (param0 != 17832) {
            this.field_D = true;
            return 5570594;
        }
        return 5570594;
    }

    private final void q(byte param0) {
        int var2 = 0;
        int var3 = 0;
        var2 = this.field_g.d(3) - -gqa.a(this.field_E, (byte) 24, this.field_g.c(-31) / 2);
        var3 = this.field_g.e(param0 + 9556) - -gqa.a(this.field_o, (byte) 24, this.field_g.c(-64) / 2);
        this.field_u.a(var2, var2 + gqa.a(this.field_E, (byte) 24, this.field_s), var3, gqa.a(this.field_o, (byte) 24, this.field_s) + var3, 44);
        this.field_u.field_b = this.field_s;
        this.field_u.field_i = this.field_g.P(param0 ^ 92) << -1398774928;
        if (param0 != 92) {
          this.field_o = 58;
          return;
        } else {
          return;
        }
    }

    public static void l(int param0) {
        field_w = (String[][]) null;
        field_y = null;
        if (param0 >= -116) {
            field_w = (String[][]) null;
        }
    }

    wh(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        this.field_u = new pc();
        this.field_s = 0;
        try {
            this.field_C = new jma(15, param0, param1);
            this.field_t = new mg(param0.field_E, param1);
            this.field_q = param1.b((byte) 44, 10) << 1684595792;
            this.field_v = (param1.b((byte) 44, 1) ^ -1) == -2 ? true : false;
            this.field_D = -2 == (param1.b((byte) 44, 1) ^ -1) ? true : false;
            this.field_n = param1.b((byte) 44, 8) << -697012272;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "wh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
    }
}
