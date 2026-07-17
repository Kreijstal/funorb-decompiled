/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nda extends rqa {
    static int field_q;
    static java.awt.Image field_p;
    static String field_o;

    public static void a(int param0) {
        field_p = null;
        if (param0 != 0) {
            nda.a(48, false);
            field_o = null;
            return;
        }
        field_o = null;
    }

    nda(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

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
              si.a(124, 62, param0[0].a(93));
              if (param1 <= -119) {
                break L1;
              } else {
                nda.a(-23);
                break L1;
              }
            }
            stackOut_2_0 = new nc((Object) (Object) "void");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("nda.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    final static void a(int param0, boolean param1) {
        llb stackIn_7_0 = null;
        llb stackIn_8_0 = null;
        llb stackIn_9_0 = null;
        llb stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        llb stackIn_11_0 = null;
        llb stackIn_12_0 = null;
        llb stackIn_13_0 = null;
        llb stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        llb stackIn_18_0 = null;
        llb stackIn_19_0 = null;
        llb stackIn_20_0 = null;
        llb stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        llb stackIn_22_0 = null;
        llb stackIn_23_0 = null;
        llb stackIn_24_0 = null;
        llb stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        llb stackIn_27_0 = null;
        llb stackIn_28_0 = null;
        llb stackIn_29_0 = null;
        llb stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        llb stackIn_31_0 = null;
        llb stackIn_32_0 = null;
        llb stackIn_33_0 = null;
        llb stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        llb stackIn_40_0 = null;
        llb stackIn_41_0 = null;
        llb stackIn_42_0 = null;
        llb stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        llb stackIn_44_0 = null;
        llb stackIn_45_0 = null;
        llb stackIn_46_0 = null;
        llb stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        llb stackIn_49_0 = null;
        llb stackIn_50_0 = null;
        llb stackIn_51_0 = null;
        llb stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        llb stackIn_53_0 = null;
        llb stackIn_54_0 = null;
        llb stackIn_55_0 = null;
        llb stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        llb stackIn_64_0 = null;
        llb stackIn_65_0 = null;
        llb stackIn_66_0 = null;
        llb stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        llb stackIn_68_0 = null;
        llb stackIn_69_0 = null;
        llb stackIn_70_0 = null;
        llb stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        llb stackIn_77_0 = null;
        llb stackIn_78_0 = null;
        llb stackIn_79_0 = null;
        llb stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        llb stackIn_81_0 = null;
        llb stackIn_82_0 = null;
        llb stackIn_83_0 = null;
        llb stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        llb stackIn_86_0 = null;
        llb stackIn_87_0 = null;
        llb stackIn_88_0 = null;
        llb stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        llb stackIn_90_0 = null;
        llb stackIn_91_0 = null;
        llb stackIn_92_0 = null;
        llb stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        llb stackOut_63_0 = null;
        llb stackOut_64_0 = null;
        llb stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        llb stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        llb stackOut_67_0 = null;
        llb stackOut_68_0 = null;
        llb stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        llb stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        llb stackOut_85_0 = null;
        llb stackOut_86_0 = null;
        llb stackOut_87_0 = null;
        int stackOut_87_1 = 0;
        llb stackOut_88_0 = null;
        int stackOut_88_1 = 0;
        llb stackOut_89_0 = null;
        llb stackOut_90_0 = null;
        llb stackOut_91_0 = null;
        int stackOut_91_1 = 0;
        llb stackOut_92_0 = null;
        int stackOut_92_1 = 0;
        llb stackOut_76_0 = null;
        llb stackOut_77_0 = null;
        llb stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        llb stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        llb stackOut_80_0 = null;
        llb stackOut_81_0 = null;
        llb stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        llb stackOut_83_0 = null;
        int stackOut_83_1 = 0;
        llb stackOut_6_0 = null;
        llb stackOut_7_0 = null;
        llb stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        llb stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        llb stackOut_10_0 = null;
        llb stackOut_11_0 = null;
        llb stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        llb stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        llb stackOut_48_0 = null;
        llb stackOut_49_0 = null;
        llb stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        llb stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        llb stackOut_52_0 = null;
        llb stackOut_53_0 = null;
        llb stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        llb stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        llb stackOut_39_0 = null;
        llb stackOut_40_0 = null;
        llb stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        llb stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        llb stackOut_43_0 = null;
        llb stackOut_44_0 = null;
        llb stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        llb stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        llb stackOut_26_0 = null;
        llb stackOut_27_0 = null;
        llb stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        llb stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        llb stackOut_30_0 = null;
        llb stackOut_31_0 = null;
        llb stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        llb stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        llb stackOut_17_0 = null;
        llb stackOut_18_0 = null;
        llb stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        llb stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        llb stackOut_21_0 = null;
        llb stackOut_22_0 = null;
        llb stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        llb stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        if (param0 < -111) {
          L0: {
            qca.a(dma.field_g - -640 >> 1, dma.field_j, dma.field_g + -640 >> 1, true, 0);
            if (0 < lia.field_b) {
              L1: {
                if (null != kl.field_c) {
                  kl.field_c.c(tb.field_a.field_L, 0);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                L3: {
                  stackOut_63_0 = tb.field_a;
                  stackIn_66_0 = stackOut_63_0;
                  stackIn_64_0 = stackOut_63_0;
                  if (!param1) {
                    break L3;
                  } else {
                    stackOut_64_0 = (llb) (Object) stackIn_64_0;
                    stackIn_66_0 = stackOut_64_0;
                    stackIn_65_0 = stackOut_64_0;
                    if (bv.field_d) {
                      break L3;
                    } else {
                      stackOut_65_0 = (llb) (Object) stackIn_65_0;
                      stackOut_65_1 = 1;
                      stackIn_67_0 = stackOut_65_0;
                      stackIn_67_1 = stackOut_65_1;
                      break L2;
                    }
                  }
                }
                stackOut_66_0 = (llb) (Object) stackIn_66_0;
                stackOut_66_1 = 0;
                stackIn_67_0 = stackOut_66_0;
                stackIn_67_1 = stackOut_66_1;
                break L2;
              }
              L4: {
                L5: {
                  ((llb) (Object) stackIn_67_0).b(stackIn_67_1 != 0, -109);
                  stackOut_67_0 = bqa.field_d;
                  stackIn_70_0 = stackOut_67_0;
                  stackIn_68_0 = stackOut_67_0;
                  if (!param1) {
                    break L5;
                  } else {
                    stackOut_68_0 = (llb) (Object) stackIn_68_0;
                    stackIn_70_0 = stackOut_68_0;
                    stackIn_69_0 = stackOut_68_0;
                    if (bv.field_d) {
                      break L5;
                    } else {
                      stackOut_69_0 = (llb) (Object) stackIn_69_0;
                      stackOut_69_1 = 1;
                      stackIn_71_0 = stackOut_69_0;
                      stackIn_71_1 = stackOut_69_1;
                      break L4;
                    }
                  }
                }
                stackOut_70_0 = (llb) (Object) stackIn_70_0;
                stackOut_70_1 = 0;
                stackIn_71_0 = stackOut_70_0;
                stackIn_71_1 = stackOut_70_1;
                break L4;
              }
              ((llb) (Object) stackIn_71_0).b(stackIn_71_1 != 0, 113);
              break L0;
            } else {
              break L0;
            }
          }
          L6: {
            if (nf.field_a > 0) {
              break L6;
            } else {
              if (tba.field_p > 0) {
                break L6;
              } else {
                bia.a((byte) 124);
                return;
              }
            }
          }
          if (null != kl.field_c) {
            L7: {
              L8: {
                kl.field_c.c(rga.field_g.field_L, 0);
                stackOut_85_0 = rga.field_g;
                stackIn_88_0 = stackOut_85_0;
                stackIn_86_0 = stackOut_85_0;
                if (!param1) {
                  break L8;
                } else {
                  stackOut_86_0 = (llb) (Object) stackIn_86_0;
                  stackIn_88_0 = stackOut_86_0;
                  stackIn_87_0 = stackOut_86_0;
                  if (wo.field_o) {
                    break L8;
                  } else {
                    stackOut_87_0 = (llb) (Object) stackIn_87_0;
                    stackOut_87_1 = 1;
                    stackIn_89_0 = stackOut_87_0;
                    stackIn_89_1 = stackOut_87_1;
                    break L7;
                  }
                }
              }
              stackOut_88_0 = (llb) (Object) stackIn_88_0;
              stackOut_88_1 = 0;
              stackIn_89_0 = stackOut_88_0;
              stackIn_89_1 = stackOut_88_1;
              break L7;
            }
            L9: {
              L10: {
                ((llb) (Object) stackIn_89_0).b(stackIn_89_1 != 0, 101);
                stackOut_89_0 = vva.field_r;
                stackIn_92_0 = stackOut_89_0;
                stackIn_90_0 = stackOut_89_0;
                if (!param1) {
                  break L10;
                } else {
                  stackOut_90_0 = (llb) (Object) stackIn_90_0;
                  stackIn_92_0 = stackOut_90_0;
                  stackIn_91_0 = stackOut_90_0;
                  if (wo.field_o) {
                    break L10;
                  } else {
                    stackOut_91_0 = (llb) (Object) stackIn_91_0;
                    stackOut_91_1 = 1;
                    stackIn_93_0 = stackOut_91_0;
                    stackIn_93_1 = stackOut_91_1;
                    break L9;
                  }
                }
              }
              stackOut_92_0 = (llb) (Object) stackIn_92_0;
              stackOut_92_1 = 0;
              stackIn_93_0 = stackOut_92_0;
              stackIn_93_1 = stackOut_92_1;
              break L9;
            }
            ((llb) (Object) stackIn_93_0).b(stackIn_93_1 != 0, 101);
            bia.a((byte) 124);
            return;
          } else {
            L11: {
              L12: {
                stackOut_76_0 = rga.field_g;
                stackIn_79_0 = stackOut_76_0;
                stackIn_77_0 = stackOut_76_0;
                if (!param1) {
                  break L12;
                } else {
                  stackOut_77_0 = (llb) (Object) stackIn_77_0;
                  stackIn_79_0 = stackOut_77_0;
                  stackIn_78_0 = stackOut_77_0;
                  if (wo.field_o) {
                    break L12;
                  } else {
                    stackOut_78_0 = (llb) (Object) stackIn_78_0;
                    stackOut_78_1 = 1;
                    stackIn_80_0 = stackOut_78_0;
                    stackIn_80_1 = stackOut_78_1;
                    break L11;
                  }
                }
              }
              stackOut_79_0 = (llb) (Object) stackIn_79_0;
              stackOut_79_1 = 0;
              stackIn_80_0 = stackOut_79_0;
              stackIn_80_1 = stackOut_79_1;
              break L11;
            }
            L13: {
              L14: {
                ((llb) (Object) stackIn_80_0).b(stackIn_80_1 != 0, 101);
                stackOut_80_0 = vva.field_r;
                stackIn_83_0 = stackOut_80_0;
                stackIn_81_0 = stackOut_80_0;
                if (!param1) {
                  break L14;
                } else {
                  stackOut_81_0 = (llb) (Object) stackIn_81_0;
                  stackIn_83_0 = stackOut_81_0;
                  stackIn_82_0 = stackOut_81_0;
                  if (wo.field_o) {
                    break L14;
                  } else {
                    stackOut_82_0 = (llb) (Object) stackIn_82_0;
                    stackOut_82_1 = 1;
                    stackIn_84_0 = stackOut_82_0;
                    stackIn_84_1 = stackOut_82_1;
                    break L13;
                  }
                }
              }
              stackOut_83_0 = (llb) (Object) stackIn_83_0;
              stackOut_83_1 = 0;
              stackIn_84_0 = stackOut_83_0;
              stackIn_84_1 = stackOut_83_1;
              break L13;
            }
            ((llb) (Object) stackIn_84_0).b(stackIn_84_1 != 0, 101);
            bia.a((byte) 124);
            return;
          }
        } else {
          L15: {
            field_p = null;
            qca.a(dma.field_g - -640 >> 1, dma.field_j, dma.field_g + -640 >> 1, true, 0);
            if (0 < lia.field_b) {
              L16: {
                if (null != kl.field_c) {
                  kl.field_c.c(tb.field_a.field_L, 0);
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                L18: {
                  stackOut_6_0 = tb.field_a;
                  stackIn_9_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (!param1) {
                    break L18;
                  } else {
                    stackOut_7_0 = (llb) (Object) stackIn_7_0;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_8_0 = stackOut_7_0;
                    if (bv.field_d) {
                      break L18;
                    } else {
                      stackOut_8_0 = (llb) (Object) stackIn_8_0;
                      stackOut_8_1 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      break L17;
                    }
                  }
                }
                stackOut_9_0 = (llb) (Object) stackIn_9_0;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L17;
              }
              L19: {
                L20: {
                  ((llb) (Object) stackIn_10_0).b(stackIn_10_1 != 0, -109);
                  stackOut_10_0 = bqa.field_d;
                  stackIn_13_0 = stackOut_10_0;
                  stackIn_11_0 = stackOut_10_0;
                  if (!param1) {
                    break L20;
                  } else {
                    stackOut_11_0 = (llb) (Object) stackIn_11_0;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_12_0 = stackOut_11_0;
                    if (bv.field_d) {
                      break L20;
                    } else {
                      stackOut_12_0 = (llb) (Object) stackIn_12_0;
                      stackOut_12_1 = 1;
                      stackIn_14_0 = stackOut_12_0;
                      stackIn_14_1 = stackOut_12_1;
                      break L19;
                    }
                  }
                }
                stackOut_13_0 = (llb) (Object) stackIn_13_0;
                stackOut_13_1 = 0;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                break L19;
              }
              ((llb) (Object) stackIn_14_0).b(stackIn_14_1 != 0, 113);
              break L15;
            } else {
              break L15;
            }
          }
          if (nf.field_a <= 0) {
            if (tba.field_p > 0) {
              if (null != kl.field_c) {
                L21: {
                  L22: {
                    kl.field_c.c(rga.field_g.field_L, 0);
                    stackOut_48_0 = rga.field_g;
                    stackIn_51_0 = stackOut_48_0;
                    stackIn_49_0 = stackOut_48_0;
                    if (!param1) {
                      break L22;
                    } else {
                      stackOut_49_0 = (llb) (Object) stackIn_49_0;
                      stackIn_51_0 = stackOut_49_0;
                      stackIn_50_0 = stackOut_49_0;
                      if (wo.field_o) {
                        break L22;
                      } else {
                        stackOut_50_0 = (llb) (Object) stackIn_50_0;
                        stackOut_50_1 = 1;
                        stackIn_52_0 = stackOut_50_0;
                        stackIn_52_1 = stackOut_50_1;
                        break L21;
                      }
                    }
                  }
                  stackOut_51_0 = (llb) (Object) stackIn_51_0;
                  stackOut_51_1 = 0;
                  stackIn_52_0 = stackOut_51_0;
                  stackIn_52_1 = stackOut_51_1;
                  break L21;
                }
                L23: {
                  L24: {
                    ((llb) (Object) stackIn_52_0).b(stackIn_52_1 != 0, 101);
                    stackOut_52_0 = vva.field_r;
                    stackIn_55_0 = stackOut_52_0;
                    stackIn_53_0 = stackOut_52_0;
                    if (!param1) {
                      break L24;
                    } else {
                      stackOut_53_0 = (llb) (Object) stackIn_53_0;
                      stackIn_55_0 = stackOut_53_0;
                      stackIn_54_0 = stackOut_53_0;
                      if (wo.field_o) {
                        break L24;
                      } else {
                        stackOut_54_0 = (llb) (Object) stackIn_54_0;
                        stackOut_54_1 = 1;
                        stackIn_56_0 = stackOut_54_0;
                        stackIn_56_1 = stackOut_54_1;
                        break L23;
                      }
                    }
                  }
                  stackOut_55_0 = (llb) (Object) stackIn_55_0;
                  stackOut_55_1 = 0;
                  stackIn_56_0 = stackOut_55_0;
                  stackIn_56_1 = stackOut_55_1;
                  break L23;
                }
                ((llb) (Object) stackIn_56_0).b(stackIn_56_1 != 0, 101);
                bia.a((byte) 124);
                return;
              } else {
                L25: {
                  L26: {
                    stackOut_39_0 = rga.field_g;
                    stackIn_42_0 = stackOut_39_0;
                    stackIn_40_0 = stackOut_39_0;
                    if (!param1) {
                      break L26;
                    } else {
                      stackOut_40_0 = (llb) (Object) stackIn_40_0;
                      stackIn_42_0 = stackOut_40_0;
                      stackIn_41_0 = stackOut_40_0;
                      if (wo.field_o) {
                        break L26;
                      } else {
                        stackOut_41_0 = (llb) (Object) stackIn_41_0;
                        stackOut_41_1 = 1;
                        stackIn_43_0 = stackOut_41_0;
                        stackIn_43_1 = stackOut_41_1;
                        break L25;
                      }
                    }
                  }
                  stackOut_42_0 = (llb) (Object) stackIn_42_0;
                  stackOut_42_1 = 0;
                  stackIn_43_0 = stackOut_42_0;
                  stackIn_43_1 = stackOut_42_1;
                  break L25;
                }
                L27: {
                  L28: {
                    ((llb) (Object) stackIn_43_0).b(stackIn_43_1 != 0, 101);
                    stackOut_43_0 = vva.field_r;
                    stackIn_46_0 = stackOut_43_0;
                    stackIn_44_0 = stackOut_43_0;
                    if (!param1) {
                      break L28;
                    } else {
                      stackOut_44_0 = (llb) (Object) stackIn_44_0;
                      stackIn_46_0 = stackOut_44_0;
                      stackIn_45_0 = stackOut_44_0;
                      if (wo.field_o) {
                        break L28;
                      } else {
                        stackOut_45_0 = (llb) (Object) stackIn_45_0;
                        stackOut_45_1 = 1;
                        stackIn_47_0 = stackOut_45_0;
                        stackIn_47_1 = stackOut_45_1;
                        break L27;
                      }
                    }
                  }
                  stackOut_46_0 = (llb) (Object) stackIn_46_0;
                  stackOut_46_1 = 0;
                  stackIn_47_0 = stackOut_46_0;
                  stackIn_47_1 = stackOut_46_1;
                  break L27;
                }
                ((llb) (Object) stackIn_47_0).b(stackIn_47_1 != 0, 101);
                bia.a((byte) 124);
                return;
              }
            } else {
              bia.a((byte) 124);
              return;
            }
          } else {
            if (null != kl.field_c) {
              L29: {
                L30: {
                  kl.field_c.c(rga.field_g.field_L, 0);
                  stackOut_26_0 = rga.field_g;
                  stackIn_29_0 = stackOut_26_0;
                  stackIn_27_0 = stackOut_26_0;
                  if (!param1) {
                    break L30;
                  } else {
                    stackOut_27_0 = (llb) (Object) stackIn_27_0;
                    stackIn_29_0 = stackOut_27_0;
                    stackIn_28_0 = stackOut_27_0;
                    if (wo.field_o) {
                      break L30;
                    } else {
                      stackOut_28_0 = (llb) (Object) stackIn_28_0;
                      stackOut_28_1 = 1;
                      stackIn_30_0 = stackOut_28_0;
                      stackIn_30_1 = stackOut_28_1;
                      break L29;
                    }
                  }
                }
                stackOut_29_0 = (llb) (Object) stackIn_29_0;
                stackOut_29_1 = 0;
                stackIn_30_0 = stackOut_29_0;
                stackIn_30_1 = stackOut_29_1;
                break L29;
              }
              L31: {
                L32: {
                  ((llb) (Object) stackIn_30_0).b(stackIn_30_1 != 0, 101);
                  stackOut_30_0 = vva.field_r;
                  stackIn_33_0 = stackOut_30_0;
                  stackIn_31_0 = stackOut_30_0;
                  if (!param1) {
                    break L32;
                  } else {
                    stackOut_31_0 = (llb) (Object) stackIn_31_0;
                    stackIn_33_0 = stackOut_31_0;
                    stackIn_32_0 = stackOut_31_0;
                    if (wo.field_o) {
                      break L32;
                    } else {
                      stackOut_32_0 = (llb) (Object) stackIn_32_0;
                      stackOut_32_1 = 1;
                      stackIn_34_0 = stackOut_32_0;
                      stackIn_34_1 = stackOut_32_1;
                      break L31;
                    }
                  }
                }
                stackOut_33_0 = (llb) (Object) stackIn_33_0;
                stackOut_33_1 = 0;
                stackIn_34_0 = stackOut_33_0;
                stackIn_34_1 = stackOut_33_1;
                break L31;
              }
              ((llb) (Object) stackIn_34_0).b(stackIn_34_1 != 0, 101);
              bia.a((byte) 124);
              return;
            } else {
              L33: {
                L34: {
                  stackOut_17_0 = rga.field_g;
                  stackIn_20_0 = stackOut_17_0;
                  stackIn_18_0 = stackOut_17_0;
                  if (!param1) {
                    break L34;
                  } else {
                    stackOut_18_0 = (llb) (Object) stackIn_18_0;
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_19_0 = stackOut_18_0;
                    if (wo.field_o) {
                      break L34;
                    } else {
                      stackOut_19_0 = (llb) (Object) stackIn_19_0;
                      stackOut_19_1 = 1;
                      stackIn_21_0 = stackOut_19_0;
                      stackIn_21_1 = stackOut_19_1;
                      break L33;
                    }
                  }
                }
                stackOut_20_0 = (llb) (Object) stackIn_20_0;
                stackOut_20_1 = 0;
                stackIn_21_0 = stackOut_20_0;
                stackIn_21_1 = stackOut_20_1;
                break L33;
              }
              L35: {
                L36: {
                  ((llb) (Object) stackIn_21_0).b(stackIn_21_1 != 0, 101);
                  stackOut_21_0 = vva.field_r;
                  stackIn_24_0 = stackOut_21_0;
                  stackIn_22_0 = stackOut_21_0;
                  if (!param1) {
                    break L36;
                  } else {
                    stackOut_22_0 = (llb) (Object) stackIn_22_0;
                    stackIn_24_0 = stackOut_22_0;
                    stackIn_23_0 = stackOut_22_0;
                    if (wo.field_o) {
                      break L36;
                    } else {
                      stackOut_23_0 = (llb) (Object) stackIn_23_0;
                      stackOut_23_1 = 1;
                      stackIn_25_0 = stackOut_23_0;
                      stackIn_25_1 = stackOut_23_1;
                      break L35;
                    }
                  }
                }
                stackOut_24_0 = (llb) (Object) stackIn_24_0;
                stackOut_24_1 = 0;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                break L35;
              }
              ((llb) (Object) stackIn_25_0).b(stackIn_25_1 != 0, 101);
              bia.a((byte) 124);
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = 0;
        field_o = "If you do nothing the game will revert to normal view in <%0> seconds.";
    }
}
