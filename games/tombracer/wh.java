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
            ((wh) this).field_v = false;
            return 30;
        }
        return 30;
    }

    final void n(byte param0) {
        super.n((byte) 75);
        if (param0 > 68) {
          this.q((byte) 92);
          if (!((wh) this).field_D) {
            ((wh) this).field_z = new up((gma) (Object) ((wh) this).e(6), 4, 128);
            return;
          } else {
            ((wh) this).field_z = null;
            return;
          }
        } else {
          ((wh) this).field_n = 46;
          this.q((byte) 92);
          if (!((wh) this).field_D) {
            ((wh) this).field_z = new up((gma) (Object) ((wh) this).e(6), 4, 128);
            return;
          } else {
            ((wh) this).field_z = null;
            return;
          }
        }
    }

    final void g(int param0) {
        super.g(param0);
        if (param0 != -2) {
          ((wh) this).field_C = null;
          ((wh) this).field_C.a((byte) 48, ((wh) this).h((byte) 111));
          return;
        } else {
          ((wh) this).field_C.a((byte) 48, ((wh) this).h((byte) 111));
          return;
        }
    }

    public final jma k(byte param0) {
        if (param0 >= -67) {
            int discarded$0 = ((wh) this).j((byte) 54);
            return ((wh) this).field_C;
        }
        return ((wh) this).field_C;
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
            field_y = null;
            if (((wh) this).field_C.b((byte) 88)) {
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
            if (((wh) this).field_C.b((byte) 88)) {
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
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        mma stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        mma stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        mma stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        int stackIn_59_2 = 0;
        int stackIn_61_0 = 0;
        mma stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        mma stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        mma stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        int stackIn_69_2 = 0;
        mma stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        mma stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        mma stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        int stackIn_75_2 = 0;
        mma stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        mma stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        mma stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        int stackIn_85_2 = 0;
        mma stackIn_88_0 = null;
        int stackIn_88_1 = 0;
        mma stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        mma stackIn_90_0 = null;
        int stackIn_90_1 = 0;
        int stackIn_90_2 = 0;
        mma stackIn_95_0 = null;
        int stackIn_95_1 = 0;
        mma stackIn_96_0 = null;
        int stackIn_96_1 = 0;
        mma stackIn_97_0 = null;
        int stackIn_97_1 = 0;
        int stackIn_97_2 = 0;
        mma stackIn_101_0 = null;
        int stackIn_101_1 = 0;
        mma stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        mma stackIn_103_0 = null;
        int stackIn_103_1 = 0;
        int stackIn_103_2 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        la stackOut_26_0 = null;
        la stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        la stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        la stackOut_22_0 = null;
        la stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        la stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        Object stackOut_35_0 = null;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        Object stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        mma stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        mma stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        int stackOut_58_2 = 0;
        mma stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        int stackOut_57_2 = 0;
        int stackOut_41_0 = 0;
        int stackOut_39_0 = 0;
        mma stackOut_100_0 = null;
        int stackOut_100_1 = 0;
        mma stackOut_102_0 = null;
        int stackOut_102_1 = 0;
        int stackOut_102_2 = 0;
        mma stackOut_101_0 = null;
        int stackOut_101_1 = 0;
        int stackOut_101_2 = 0;
        mma stackOut_94_0 = null;
        int stackOut_94_1 = 0;
        mma stackOut_96_0 = null;
        int stackOut_96_1 = 0;
        int stackOut_96_2 = 0;
        mma stackOut_95_0 = null;
        int stackOut_95_1 = 0;
        int stackOut_95_2 = 0;
        mma stackOut_87_0 = null;
        int stackOut_87_1 = 0;
        mma stackOut_89_0 = null;
        int stackOut_89_1 = 0;
        int stackOut_89_2 = 0;
        mma stackOut_88_0 = null;
        int stackOut_88_1 = 0;
        int stackOut_88_2 = 0;
        mma stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        mma stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        int stackOut_74_2 = 0;
        mma stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        int stackOut_73_2 = 0;
        mma stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        mma stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        int stackOut_68_2 = 0;
        mma stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        int stackOut_67_2 = 0;
        mma stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        mma stackOut_84_0 = null;
        int stackOut_84_1 = 0;
        int stackOut_84_2 = 0;
        mma stackOut_83_0 = null;
        int stackOut_83_1 = 0;
        int stackOut_83_2 = 0;
        L0: {
          var10 = TombRacer.field_G ? 1 : 0;
          var11 = ((wh) this).b(true);
          if (!((wh) this).i(12340).g(112)) {
            if (null == ((wh) this).field_t) {
              break L0;
            } else {
              ((wh) this).field_t.d(param0 + -5418);
              if (!((wh) this).field_t.c(0)) {
                break L0;
              } else {
                L1: {
                  ((wh) this).field_s = 0;
                  stackOut_4_0 = this;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (((wh) this).field_A) {
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
                ((wh) this).field_A = stackIn_7_1 != 0;
                break L0;
              }
            }
          } else {
            break L0;
          }
        }
        if (!((wh) this).field_C.f((byte) -56)) {
          if (!((wh) this).field_A) {
            return;
          } else {
            L2: {
              var3 = ((wh) this).field_q;
              if (0 == var3) {
                var3 = 268435456;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (((wh) this).field_n <= 0) {
                ((wh) this).field_s = var3;
                break L3;
              } else {
                ((wh) this).field_s = ((wh) this).field_s + ((wh) this).field_n;
                if (((wh) this).field_s > var3) {
                  ((wh) this).field_s = var3;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              ((wh) this).field_x = ((wh) this).field_g.g(-25787) >> 2;
              ((wh) this).field_E = hua.a((byte) 102, ((wh) this).field_x);
              ((wh) this).field_o = bua.a(0, ((wh) this).field_x);
              var6 = ((wh) this).field_g.P(0) << 16;
              if (!((wh) this).field_D) {
                L5: {
                  this.q((byte) 92);
                  stackOut_26_0 = (la) var11;
                  stackIn_28_0 = stackOut_26_0;
                  stackIn_27_0 = stackOut_26_0;
                  if (((wh) this).field_v) {
                    stackOut_28_0 = (la) (Object) stackIn_28_0;
                    stackOut_28_1 = 3;
                    stackIn_29_0 = stackOut_28_0;
                    stackIn_29_1 = stackOut_28_1;
                    break L5;
                  } else {
                    stackOut_27_0 = (la) (Object) stackIn_27_0;
                    stackOut_27_1 = 4;
                    stackIn_29_0 = stackOut_27_0;
                    stackIn_29_1 = stackOut_27_1;
                    break L5;
                  }
                }
                boolean discarded$5 = ((la) (Object) stackIn_29_0).a(stackIn_29_1, (gma) (Object) ((wh) this).field_g, -44, ((wh) this).field_u, (gma) (Object) ((wh) this).e(6), ((wh) this).field_z);
                var4 = this.a(((wh) this).field_u, (byte) 72);
                this.q((byte) 92);
                boolean discarded$6 = var11.a(1, (gma) (Object) ((wh) this).field_g, -91, ((wh) this).field_u, (gma) (Object) ((wh) this).e(6), ((wh) this).field_z);
                var11.b(false).a((byte) 119, ((wh) this).field_u, ((wh) this).field_z);
                var7_ref_pc = ((wh) this).field_u;
                L6: while (true) {
                  if (var7_ref_pc.field_h == null) {
                    var11.b(false).a(var7_ref_pc, (gma) (Object) ((wh) this).field_g, (byte) -119);
                    var5 = this.a(((wh) this).field_u, (byte) -65);
                    break L4;
                  } else {
                    var7_ref_pc = var7_ref_pc.field_h;
                    continue L6;
                  }
                }
              } else {
                L7: {
                  this.q((byte) 92);
                  stackOut_22_0 = (la) var11;
                  stackIn_24_0 = stackOut_22_0;
                  stackIn_23_0 = stackOut_22_0;
                  if (!((wh) this).field_v) {
                    stackOut_24_0 = (la) (Object) stackIn_24_0;
                    stackOut_24_1 = 4;
                    stackIn_25_0 = stackOut_24_0;
                    stackIn_25_1 = stackOut_24_1;
                    break L7;
                  } else {
                    stackOut_23_0 = (la) (Object) stackIn_23_0;
                    stackOut_23_1 = 3;
                    stackIn_25_0 = stackOut_23_0;
                    stackIn_25_1 = stackOut_23_1;
                    break L7;
                  }
                }
                boolean discarded$7 = ((la) (Object) stackIn_25_0).a(stackIn_25_1, ((wh) this).field_u, (gma) (Object) ((wh) this).e(6), (byte) -123);
                var4 = this.a(((wh) this).field_u, (byte) -68);
                this.q((byte) 92);
                boolean discarded$8 = var11.a(1, ((wh) this).field_u, (gma) (Object) ((wh) this).e(6), (byte) 75);
                var5 = this.a(((wh) this).field_u, (byte) 57);
                break L4;
              }
            }
            L8: {
              if (param0 == 5418) {
                break L8;
              } else {
                int discarded$9 = ((wh) this).a(false);
                break L8;
              }
            }
            L9: {
              stackOut_35_0 = this;
              stackIn_37_0 = stackOut_35_0;
              stackIn_36_0 = stackOut_35_0;
              if (var5 == var4) {
                stackOut_37_0 = this;
                stackOut_37_1 = 0;
                stackIn_38_0 = stackOut_37_0;
                stackIn_38_1 = stackOut_37_1;
                break L9;
              } else {
                stackOut_36_0 = this;
                stackOut_36_1 = 1;
                stackIn_38_0 = stackOut_36_0;
                stackIn_38_1 = stackOut_36_1;
                break L9;
              }
            }
            L10: {
              ((wh) this).field_r = stackIn_38_1 != 0;
              if (!((wh) this).field_r) {
                if (((wh) this).field_C.b((byte) 83)) {
                  L11: {
                    var7 = 1;
                    if (var7 != 0) {
                      ((wh) this).field_u.field_j = 9;
                      break L11;
                    } else {
                      ((wh) this).field_u.field_j = 8;
                      break L11;
                    }
                  }
                  L12: {
                    if (!((wh) this).field_D) {
                      var8 = ((wh) this).field_u;
                      var9 = var6;
                      L13: while (true) {
                        if (var8 == null) {
                          break L12;
                        } else {
                          if (!var8.field_l) {
                            break L12;
                          } else {
                            L14: {
                              if (null != var8.field_h) {
                                break L14;
                              } else {
                                if (!((wh) this).field_r) {
                                  var11.b(false).a(var8.field_a, (byte) -120, 8, var9, 1, 0, 2, 0, var8.field_e, 2, 4);
                                  break L14;
                                } else {
                                  var11.b(false).a(var8.field_a, (byte) -117, 9, var9, 1, 0, 4, 0, var8.field_e, 4, 8);
                                  break L14;
                                }
                              }
                            }
                            var8 = var8.field_h;
                            continue L13;
                          }
                        }
                      }
                    } else {
                      break L12;
                    }
                  }
                  L15: {
                    stackOut_56_0 = ((wh) this).field_p;
                    stackOut_56_1 = -978;
                    stackIn_58_0 = stackOut_56_0;
                    stackIn_58_1 = stackOut_56_1;
                    stackIn_57_0 = stackOut_56_0;
                    stackIn_57_1 = stackOut_56_1;
                    if (!((wh) this).field_r) {
                      stackOut_58_0 = (mma) (Object) stackIn_58_0;
                      stackOut_58_1 = stackIn_58_1;
                      stackOut_58_2 = 65280;
                      stackIn_59_0 = stackOut_58_0;
                      stackIn_59_1 = stackOut_58_1;
                      stackIn_59_2 = stackOut_58_2;
                      break L15;
                    } else {
                      stackOut_57_0 = (mma) (Object) stackIn_57_0;
                      stackOut_57_1 = stackIn_57_1;
                      stackOut_57_2 = 16720384;
                      stackIn_59_0 = stackOut_57_0;
                      stackIn_59_1 = stackOut_57_1;
                      stackIn_59_2 = stackOut_57_2;
                      break L15;
                    }
                  }
                  ((mma) (Object) stackIn_59_0).a(stackIn_59_1, stackIn_59_2);
                  ((wh) this).field_C.a((byte) -14, ((wh) this).field_r);
                  return;
                } else {
                  stackOut_41_0 = 0;
                  stackIn_61_0 = stackOut_41_0;
                  break L10;
                }
              } else {
                stackOut_39_0 = 1;
                stackIn_61_0 = stackOut_39_0;
                break L10;
              }
            }
            var7 = stackIn_61_0;
            if (var7 != 0) {
              ((wh) this).field_u.field_j = 9;
              if (!((wh) this).field_D) {
                var8 = ((wh) this).field_u;
                var9 = var6;
                L16: while (true) {
                  if (var8 != null) {
                    if (var8.field_l) {
                      L17: {
                        if (null != var8.field_h) {
                          break L17;
                        } else {
                          if (!((wh) this).field_r) {
                            var11.b(false).a(var8.field_a, (byte) -120, 8, var9, 1, 0, 2, 0, var8.field_e, 2, 4);
                            break L17;
                          } else {
                            var11.b(false).a(var8.field_a, (byte) -117, 9, var9, 1, 0, 4, 0, var8.field_e, 4, 8);
                            break L17;
                          }
                        }
                      }
                      var8 = var8.field_h;
                      continue L16;
                    } else {
                      L18: {
                        stackOut_100_0 = ((wh) this).field_p;
                        stackOut_100_1 = -978;
                        stackIn_102_0 = stackOut_100_0;
                        stackIn_102_1 = stackOut_100_1;
                        stackIn_101_0 = stackOut_100_0;
                        stackIn_101_1 = stackOut_100_1;
                        if (!((wh) this).field_r) {
                          stackOut_102_0 = (mma) (Object) stackIn_102_0;
                          stackOut_102_1 = stackIn_102_1;
                          stackOut_102_2 = 65280;
                          stackIn_103_0 = stackOut_102_0;
                          stackIn_103_1 = stackOut_102_1;
                          stackIn_103_2 = stackOut_102_2;
                          break L18;
                        } else {
                          stackOut_101_0 = (mma) (Object) stackIn_101_0;
                          stackOut_101_1 = stackIn_101_1;
                          stackOut_101_2 = 16720384;
                          stackIn_103_0 = stackOut_101_0;
                          stackIn_103_1 = stackOut_101_1;
                          stackIn_103_2 = stackOut_101_2;
                          break L18;
                        }
                      }
                      ((mma) (Object) stackIn_103_0).a(stackIn_103_1, stackIn_103_2);
                      ((wh) this).field_C.a((byte) -14, ((wh) this).field_r);
                      return;
                    }
                  } else {
                    L19: {
                      stackOut_94_0 = ((wh) this).field_p;
                      stackOut_94_1 = -978;
                      stackIn_96_0 = stackOut_94_0;
                      stackIn_96_1 = stackOut_94_1;
                      stackIn_95_0 = stackOut_94_0;
                      stackIn_95_1 = stackOut_94_1;
                      if (!((wh) this).field_r) {
                        stackOut_96_0 = (mma) (Object) stackIn_96_0;
                        stackOut_96_1 = stackIn_96_1;
                        stackOut_96_2 = 65280;
                        stackIn_97_0 = stackOut_96_0;
                        stackIn_97_1 = stackOut_96_1;
                        stackIn_97_2 = stackOut_96_2;
                        break L19;
                      } else {
                        stackOut_95_0 = (mma) (Object) stackIn_95_0;
                        stackOut_95_1 = stackIn_95_1;
                        stackOut_95_2 = 16720384;
                        stackIn_97_0 = stackOut_95_0;
                        stackIn_97_1 = stackOut_95_1;
                        stackIn_97_2 = stackOut_95_2;
                        break L19;
                      }
                    }
                    ((mma) (Object) stackIn_97_0).a(stackIn_97_1, stackIn_97_2);
                    ((wh) this).field_C.a((byte) -14, ((wh) this).field_r);
                    return;
                  }
                }
              } else {
                L20: {
                  stackOut_87_0 = ((wh) this).field_p;
                  stackOut_87_1 = -978;
                  stackIn_89_0 = stackOut_87_0;
                  stackIn_89_1 = stackOut_87_1;
                  stackIn_88_0 = stackOut_87_0;
                  stackIn_88_1 = stackOut_87_1;
                  if (!((wh) this).field_r) {
                    stackOut_89_0 = (mma) (Object) stackIn_89_0;
                    stackOut_89_1 = stackIn_89_1;
                    stackOut_89_2 = 65280;
                    stackIn_90_0 = stackOut_89_0;
                    stackIn_90_1 = stackOut_89_1;
                    stackIn_90_2 = stackOut_89_2;
                    break L20;
                  } else {
                    stackOut_88_0 = (mma) (Object) stackIn_88_0;
                    stackOut_88_1 = stackIn_88_1;
                    stackOut_88_2 = 16720384;
                    stackIn_90_0 = stackOut_88_0;
                    stackIn_90_1 = stackOut_88_1;
                    stackIn_90_2 = stackOut_88_2;
                    break L20;
                  }
                }
                ((mma) (Object) stackIn_90_0).a(stackIn_90_1, stackIn_90_2);
                ((wh) this).field_C.a((byte) -14, ((wh) this).field_r);
                return;
              }
            } else {
              ((wh) this).field_u.field_j = 8;
              if (!((wh) this).field_D) {
                var8 = ((wh) this).field_u;
                var9 = var6;
                L21: while (true) {
                  if (var8 != null) {
                    if (var8.field_l) {
                      L22: {
                        if (null != var8.field_h) {
                          break L22;
                        } else {
                          if (!((wh) this).field_r) {
                            var11.b(false).a(var8.field_a, (byte) -120, 8, var9, 1, 0, 2, 0, var8.field_e, 2, 4);
                            break L22;
                          } else {
                            var11.b(false).a(var8.field_a, (byte) -117, 9, var9, 1, 0, 4, 0, var8.field_e, 4, 8);
                            break L22;
                          }
                        }
                      }
                      var8 = var8.field_h;
                      continue L21;
                    } else {
                      L23: {
                        stackOut_72_0 = ((wh) this).field_p;
                        stackOut_72_1 = -978;
                        stackIn_74_0 = stackOut_72_0;
                        stackIn_74_1 = stackOut_72_1;
                        stackIn_73_0 = stackOut_72_0;
                        stackIn_73_1 = stackOut_72_1;
                        if (!((wh) this).field_r) {
                          stackOut_74_0 = (mma) (Object) stackIn_74_0;
                          stackOut_74_1 = stackIn_74_1;
                          stackOut_74_2 = 65280;
                          stackIn_75_0 = stackOut_74_0;
                          stackIn_75_1 = stackOut_74_1;
                          stackIn_75_2 = stackOut_74_2;
                          break L23;
                        } else {
                          stackOut_73_0 = (mma) (Object) stackIn_73_0;
                          stackOut_73_1 = stackIn_73_1;
                          stackOut_73_2 = 16720384;
                          stackIn_75_0 = stackOut_73_0;
                          stackIn_75_1 = stackOut_73_1;
                          stackIn_75_2 = stackOut_73_2;
                          break L23;
                        }
                      }
                      ((mma) (Object) stackIn_75_0).a(stackIn_75_1, stackIn_75_2);
                      ((wh) this).field_C.a((byte) -14, ((wh) this).field_r);
                      return;
                    }
                  } else {
                    L24: {
                      stackOut_66_0 = ((wh) this).field_p;
                      stackOut_66_1 = -978;
                      stackIn_68_0 = stackOut_66_0;
                      stackIn_68_1 = stackOut_66_1;
                      stackIn_67_0 = stackOut_66_0;
                      stackIn_67_1 = stackOut_66_1;
                      if (!((wh) this).field_r) {
                        stackOut_68_0 = (mma) (Object) stackIn_68_0;
                        stackOut_68_1 = stackIn_68_1;
                        stackOut_68_2 = 65280;
                        stackIn_69_0 = stackOut_68_0;
                        stackIn_69_1 = stackOut_68_1;
                        stackIn_69_2 = stackOut_68_2;
                        break L24;
                      } else {
                        stackOut_67_0 = (mma) (Object) stackIn_67_0;
                        stackOut_67_1 = stackIn_67_1;
                        stackOut_67_2 = 16720384;
                        stackIn_69_0 = stackOut_67_0;
                        stackIn_69_1 = stackOut_67_1;
                        stackIn_69_2 = stackOut_67_2;
                        break L24;
                      }
                    }
                    ((mma) (Object) stackIn_69_0).a(stackIn_69_1, stackIn_69_2);
                    ((wh) this).field_C.a((byte) -14, ((wh) this).field_r);
                    return;
                  }
                }
              } else {
                L25: {
                  stackOut_82_0 = ((wh) this).field_p;
                  stackOut_82_1 = -978;
                  stackIn_84_0 = stackOut_82_0;
                  stackIn_84_1 = stackOut_82_1;
                  stackIn_83_0 = stackOut_82_0;
                  stackIn_83_1 = stackOut_82_1;
                  if (!((wh) this).field_r) {
                    stackOut_84_0 = (mma) (Object) stackIn_84_0;
                    stackOut_84_1 = stackIn_84_1;
                    stackOut_84_2 = 65280;
                    stackIn_85_0 = stackOut_84_0;
                    stackIn_85_1 = stackOut_84_1;
                    stackIn_85_2 = stackOut_84_2;
                    break L25;
                  } else {
                    stackOut_83_0 = (mma) (Object) stackIn_83_0;
                    stackOut_83_1 = stackIn_83_1;
                    stackOut_83_2 = 16720384;
                    stackIn_85_0 = stackOut_83_0;
                    stackIn_85_1 = stackOut_83_1;
                    stackIn_85_2 = stackOut_83_2;
                    break L25;
                  }
                }
                ((mma) (Object) stackIn_85_0).a(stackIn_85_1, stackIn_85_2);
                ((wh) this).field_C.a((byte) -14, ((wh) this).field_r);
                return;
              }
            }
          }
        } else {
          ((wh) this).c(false);
          return;
        }
    }

    final int a(int param0, int param1) {
        param0 = upa.a(((wh) this).field_r, param0, (byte) -63);
        param0 = upa.a(((wh) this).field_A, param0, (byte) -57);
        if (param1 > -48) {
          int discarded$2 = ((wh) this).c(-120);
          param0 = fs.a((byte) 61, param0, ((wh) this).field_s);
          return param0;
        } else {
          param0 = fs.a((byte) 61, param0, ((wh) this).field_s);
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
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("wh.P(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
        return stackIn_4_0;
    }

    wh(la param0, boolean param1) {
        super(param0, param1);
        ((wh) this).field_u = new pc();
        ((wh) this).field_s = 0;
        try {
            ((wh) this).field_C = new jma(15);
            ((wh) this).field_t = new mg();
            ((wh) this).field_n = 0;
            ((wh) this).field_q = 16777216;
            ((wh) this).field_v = true;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "wh.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void b(int param0, int param1) {
        if (param1 != 636) {
            ((wh) this).field_u = null;
            ((wh) this).field_q = param0;
            return;
        }
        ((wh) this).field_q = param0;
    }

    final void a(byte param0, mg param1) {
        try {
            if (param0 != -8) {
                int discarded$0 = ((wh) this).a(true);
            }
            ((wh) this).field_t = param1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "wh.L(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            ((wh) this).field_C.a(((wh) this).h((byte) 118), (byte) 113, param1);
            ((wh) this).field_t.a(15637, param1);
            param1.a((byte) -125, ((wh) this).field_q >> 16, 10);
            param1.a((byte) -127, !((wh) this).field_v ? 0 : 1, 1);
            param1.a((byte) 110, !((wh) this).field_D ? 0 : 1, 1);
            param1.a((byte) -125, ((wh) this).field_n >> 16, 8);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "wh.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final boolean p(byte param0) {
        if (param0 != 120) {
            Object var3 = null;
            int discarded$0 = this.a((pc) null, (byte) 1);
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
              ((wh) this).field_p = new mma(0, 16777215, ((wh) this).field_u, param1.P(0));
              if (param0) {
                break L1;
              } else {
                ((wh) this).field_u = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("wh.Q(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public final int b(int param0) {
        int var2 = -89 % ((param0 - -46) / 45);
        return 1;
    }

    public final int c(int param0) {
        if (param0 != 17832) {
            ((wh) this).field_D = true;
            return 5570594;
        }
        return 5570594;
    }

    private final void q(byte param0) {
        int var2 = ((wh) this).field_g.d(3) - -gqa.a(((wh) this).field_E, (byte) 24, ((wh) this).field_g.c(-31) / 2);
        int var3 = ((wh) this).field_g.e(9648) - -gqa.a(((wh) this).field_o, (byte) 24, ((wh) this).field_g.c(-64) / 2);
        ((wh) this).field_u.a(var2, var2 + gqa.a(((wh) this).field_E, (byte) 24, ((wh) this).field_s), var3, gqa.a(((wh) this).field_o, (byte) 24, ((wh) this).field_s) + var3, 44);
        ((wh) this).field_u.field_b = ((wh) this).field_s;
        ((wh) this).field_u.field_i = ((wh) this).field_g.P(0) << 16;
    }

    public static void l() {
        field_w = null;
        field_y = null;
    }

    wh(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        ((wh) this).field_u = new pc();
        ((wh) this).field_s = 0;
        try {
            ((wh) this).field_C = new jma(15, param0, param1);
            ((wh) this).field_t = new mg(param0.field_E, param1);
            ((wh) this).field_q = param1.b((byte) 44, 10) << 16;
            ((wh) this).field_v = param1.b((byte) 44, 1) == -2 ? true : false;
            ((wh) this).field_D = -2 == param1.b((byte) 44, 1) ? true : false;
            ((wh) this).field_n = param1.b((byte) 44, 8) << 16;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "wh.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    static {
    }
}
