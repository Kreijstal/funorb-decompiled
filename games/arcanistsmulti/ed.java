/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class ed extends qk implements vb {
    static String field_tb;
    static char field_Bb;
    static String field_xb;
    private boolean field_Ab;
    static String field_Eb;
    static String field_Db;
    static pa field_yb;
    private boolean field_zb;
    private boolean field_Fb;
    static int[] field_Ib;
    private boolean field_Gb;
    static int field_Cb;
    private om field_ub;
    private dj field_wb;
    static qb field_vb;
    static int field_Hb;

    final boolean a(qm param0, byte param1, char param2, int param3) {
        RuntimeException var5 = null;
        Object var6 = null;
        int stackIn_4_0 = 0;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -120) {
                break L1;
              } else {
                var6 = null;
                boolean discarded$2 = ((ed) this).a((qm) null, (byte) -14, 'Y', 108);
                break L1;
              }
            }
            if (param3 != 13) {
              stackOut_5_0 = super.a(param0, (byte) -122, param2, param3);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              ((ed) this).h(77);
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("ed.N(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_6_0;
    }

    final void h(int param0) {
        if (!(((ed) this).field_G)) {
            return;
        }
        ((ed) this).field_G = false;
        if (param0 != 77) {
            return;
        }
        if (((ed) this).field_Ab) {
            fj.c(-120);
            return;
        }
        if (!((ed) this).field_Fb) {
            return;
        }
        pn.c(-11090);
    }

    ed(h param0, dj param1, String param2, boolean param3, boolean param4) {
        super(param0, (qm) (Object) new me((ed) null, param1, param2), 77, 10, 10);
        try {
            ((ed) this).field_wb = param1;
            ((ed) this).field_Ab = param3 ? true : false;
            ((ed) this).field_Fb = param4 ? true : false;
            ((ed) this).field_Gb = false;
            ((ed) this).field_zb = false;
            ((ed) this).field_ub = new om(13, 50, 274, 30, 15, 2113632, 4210752);
            ((ed) this).field_ub.field_I = true;
            ((ed) this).c(-105, (qm) (Object) ((ed) this).field_ub);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ed.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static void a(boolean param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_61_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_79_1 = 0;
        int stackIn_85_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_94_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_98_1 = 0;
        int stackIn_104_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_92_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_96_1 = 0;
        int stackOut_97_0 = 0;
        int stackOut_97_1 = 0;
        int stackOut_101_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_77_1 = 0;
        int stackOut_78_0 = 0;
        int stackOut_78_1 = 0;
        int stackOut_82_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        int stackOut_58_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_40_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_20_0 = 0;
        if (null == jb.field_z) {
          if (null == r.field_b) {
            L0: {
              var2 = 25 % ((38 - param1) / 34);
              if (!cb.field_b) {
                break L0;
              } else {
                if (!io.field_A) {
                  break L0;
                } else {
                  L1: {
                    L2: {
                      if (!hi.field_a) {
                        break L2;
                      } else {
                        if (!ef.field_r) {
                          break L2;
                        } else {
                          stackOut_91_0 = 1;
                          stackIn_93_0 = stackOut_91_0;
                          break L1;
                        }
                      }
                    }
                    stackOut_92_0 = 0;
                    stackIn_93_0 = stackOut_92_0;
                    break L1;
                  }
                  L3: {
                    L4: {
                      var3 = stackIn_93_0;
                      stackOut_93_0 = 0;
                      stackIn_97_0 = stackOut_93_0;
                      stackIn_94_0 = stackOut_93_0;
                      if (!param0) {
                        break L4;
                      } else {
                        stackOut_94_0 = stackIn_94_0;
                        stackIn_97_0 = stackOut_94_0;
                        stackIn_95_0 = stackOut_94_0;
                        if (!gj.a(29372)) {
                          break L4;
                        } else {
                          stackOut_95_0 = stackIn_95_0;
                          stackIn_97_0 = stackOut_95_0;
                          stackIn_96_0 = stackOut_95_0;
                          if (var3 != 0) {
                            break L4;
                          } else {
                            stackOut_96_0 = stackIn_96_0;
                            stackOut_96_1 = 1;
                            stackIn_98_0 = stackOut_96_0;
                            stackIn_98_1 = stackOut_96_1;
                            break L3;
                          }
                        }
                      }
                    }
                    stackOut_97_0 = stackIn_97_0;
                    stackOut_97_1 = 0;
                    stackIn_98_0 = stackOut_97_0;
                    stackIn_98_1 = stackOut_97_1;
                    break L3;
                  }
                  ui.a(stackIn_98_0, stackIn_98_1 != 0);
                  if (var3 == 0) {
                    break L0;
                  } else {
                    if (!param0) {
                      ml.a(false, -101);
                      return;
                    } else {
                      if (!gj.a(29372)) {
                        ml.a(false, -101);
                        return;
                      } else {
                        stackOut_101_0 = 1;
                        stackIn_104_0 = stackOut_101_0;
                        ml.a(stackIn_104_0 != 0, -101);
                        break L0;
                      }
                    }
                  }
                }
              }
            }
            return;
          } else {
            r.field_b.a(param0, -26449);
            var2 = 25 % ((38 - param1) / 34);
            if (cb.field_b) {
              if (io.field_A) {
                L5: {
                  L6: {
                    if (!hi.field_a) {
                      break L6;
                    } else {
                      if (!ef.field_r) {
                        break L6;
                      } else {
                        stackOut_72_0 = 1;
                        stackIn_74_0 = stackOut_72_0;
                        break L5;
                      }
                    }
                  }
                  stackOut_73_0 = 0;
                  stackIn_74_0 = stackOut_73_0;
                  break L5;
                }
                L7: {
                  L8: {
                    var3 = stackIn_74_0;
                    stackOut_74_0 = 0;
                    stackIn_78_0 = stackOut_74_0;
                    stackIn_75_0 = stackOut_74_0;
                    if (!param0) {
                      break L8;
                    } else {
                      stackOut_75_0 = stackIn_75_0;
                      stackIn_78_0 = stackOut_75_0;
                      stackIn_76_0 = stackOut_75_0;
                      if (!gj.a(29372)) {
                        break L8;
                      } else {
                        stackOut_76_0 = stackIn_76_0;
                        stackIn_78_0 = stackOut_76_0;
                        stackIn_77_0 = stackOut_76_0;
                        if (var3 != 0) {
                          break L8;
                        } else {
                          stackOut_77_0 = stackIn_77_0;
                          stackOut_77_1 = 1;
                          stackIn_79_0 = stackOut_77_0;
                          stackIn_79_1 = stackOut_77_1;
                          break L7;
                        }
                      }
                    }
                  }
                  stackOut_78_0 = stackIn_78_0;
                  stackOut_78_1 = 0;
                  stackIn_79_0 = stackOut_78_0;
                  stackIn_79_1 = stackOut_78_1;
                  break L7;
                }
                L9: {
                  ui.a(stackIn_79_0, stackIn_79_1 != 0);
                  if (var3 == 0) {
                    break L9;
                  } else {
                    if (!param0) {
                      ml.a(false, -101);
                      return;
                    } else {
                      if (!gj.a(29372)) {
                        ml.a(false, -101);
                        return;
                      } else {
                        stackOut_82_0 = 1;
                        stackIn_85_0 = stackOut_82_0;
                        ml.a(stackIn_85_0 != 0, -101);
                        break L9;
                      }
                    }
                  }
                }
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          jb.field_z.a(param0, an.field_j, 0, true, 0, 96, an.field_f);
          if (null != r.field_b) {
            r.field_b.a(param0, -26449);
            var2 = 25 % ((38 - param1) / 34);
            if (cb.field_b) {
              if (io.field_A) {
                if (hi.field_a) {
                  L10: {
                    if (!ef.field_r) {
                      stackOut_49_0 = 0;
                      stackIn_50_0 = stackOut_49_0;
                      break L10;
                    } else {
                      stackOut_48_0 = 1;
                      stackIn_50_0 = stackOut_48_0;
                      break L10;
                    }
                  }
                  L11: {
                    L12: {
                      var3 = stackIn_50_0;
                      stackOut_50_0 = 0;
                      stackIn_54_0 = stackOut_50_0;
                      stackIn_51_0 = stackOut_50_0;
                      if (!param0) {
                        break L12;
                      } else {
                        stackOut_51_0 = stackIn_51_0;
                        stackIn_54_0 = stackOut_51_0;
                        stackIn_52_0 = stackOut_51_0;
                        if (!gj.a(29372)) {
                          break L12;
                        } else {
                          stackOut_52_0 = stackIn_52_0;
                          stackIn_54_0 = stackOut_52_0;
                          stackIn_53_0 = stackOut_52_0;
                          if (var3 != 0) {
                            break L12;
                          } else {
                            stackOut_53_0 = stackIn_53_0;
                            stackOut_53_1 = 1;
                            stackIn_55_0 = stackOut_53_0;
                            stackIn_55_1 = stackOut_53_1;
                            break L11;
                          }
                        }
                      }
                    }
                    stackOut_54_0 = stackIn_54_0;
                    stackOut_54_1 = 0;
                    stackIn_55_0 = stackOut_54_0;
                    stackIn_55_1 = stackOut_54_1;
                    break L11;
                  }
                  L13: {
                    ui.a(stackIn_55_0, stackIn_55_1 != 0);
                    if (var3 == 0) {
                      break L13;
                    } else {
                      if (!param0) {
                        ml.a(false, -101);
                        return;
                      } else {
                        if (!gj.a(29372)) {
                          ml.a(false, -101);
                          return;
                        } else {
                          stackOut_58_0 = 1;
                          stackIn_61_0 = stackOut_58_0;
                          ml.a(stackIn_61_0 != 0, -101);
                          break L13;
                        }
                      }
                    }
                  }
                  return;
                } else {
                  L14: {
                    L15: {
                      var3 = 0;
                      stackOut_32_0 = 0;
                      stackIn_36_0 = stackOut_32_0;
                      stackIn_33_0 = stackOut_32_0;
                      if (!param0) {
                        break L15;
                      } else {
                        stackOut_33_0 = stackIn_33_0;
                        stackIn_36_0 = stackOut_33_0;
                        stackIn_34_0 = stackOut_33_0;
                        if (!gj.a(29372)) {
                          break L15;
                        } else {
                          stackOut_34_0 = stackIn_34_0;
                          stackIn_36_0 = stackOut_34_0;
                          stackIn_35_0 = stackOut_34_0;
                          if (var3 != 0) {
                            break L15;
                          } else {
                            stackOut_35_0 = stackIn_35_0;
                            stackOut_35_1 = 1;
                            stackIn_37_0 = stackOut_35_0;
                            stackIn_37_1 = stackOut_35_1;
                            break L14;
                          }
                        }
                      }
                    }
                    stackOut_36_0 = stackIn_36_0;
                    stackOut_36_1 = 0;
                    stackIn_37_0 = stackOut_36_0;
                    stackIn_37_1 = stackOut_36_1;
                    break L14;
                  }
                  L16: {
                    ui.a(stackIn_37_0, stackIn_37_1 != 0);
                    if (var3 == 0) {
                      break L16;
                    } else {
                      if (!param0) {
                        ml.a(false, -101);
                        return;
                      } else {
                        if (!gj.a(29372)) {
                          ml.a(false, -101);
                          return;
                        } else {
                          stackOut_40_0 = 1;
                          stackIn_45_0 = stackOut_40_0;
                          ml.a(stackIn_45_0 != 0, -101);
                          break L16;
                        }
                      }
                    }
                  }
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            var2 = 25 % ((38 - param1) / 34);
            if (cb.field_b) {
              if (io.field_A) {
                L17: {
                  L18: {
                    if (!hi.field_a) {
                      break L18;
                    } else {
                      if (!ef.field_r) {
                        break L18;
                      } else {
                        stackOut_10_0 = 1;
                        stackIn_12_0 = stackOut_10_0;
                        break L17;
                      }
                    }
                  }
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L17;
                }
                L19: {
                  L20: {
                    var3 = stackIn_12_0;
                    stackOut_12_0 = 0;
                    stackIn_16_0 = stackOut_12_0;
                    stackIn_13_0 = stackOut_12_0;
                    if (!param0) {
                      break L20;
                    } else {
                      stackOut_13_0 = stackIn_13_0;
                      stackIn_16_0 = stackOut_13_0;
                      stackIn_14_0 = stackOut_13_0;
                      if (!gj.a(29372)) {
                        break L20;
                      } else {
                        stackOut_14_0 = stackIn_14_0;
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_15_0 = stackOut_14_0;
                        if (var3 != 0) {
                          break L20;
                        } else {
                          stackOut_15_0 = stackIn_15_0;
                          stackOut_15_1 = 1;
                          stackIn_17_0 = stackOut_15_0;
                          stackIn_17_1 = stackOut_15_1;
                          break L19;
                        }
                      }
                    }
                  }
                  stackOut_16_0 = stackIn_16_0;
                  stackOut_16_1 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  break L19;
                }
                L21: {
                  ui.a(stackIn_17_0, stackIn_17_1 != 0);
                  if (var3 == 0) {
                    break L21;
                  } else {
                    if (!param0) {
                      ml.a(false, -101);
                      return;
                    } else {
                      if (!gj.a(29372)) {
                        ml.a(false, -101);
                        return;
                      } else {
                        stackOut_20_0 = 1;
                        stackIn_25_0 = stackOut_20_0;
                        ml.a(stackIn_25_0 != 0, -101);
                        break L21;
                      }
                    }
                  }
                }
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    public static void i(int param0) {
        field_yb = null;
        field_xb = null;
        field_Ib = null;
        field_Db = null;
        field_vb = null;
        field_tb = null;
        field_Eb = null;
        if (param0 != -29222) {
            ed.i(-73);
        }
    }

    final void g(boolean param0) {
        ((ed) this).field_ub.b(4210752, param0, 2121792);
        me var2 = new me((ed) this, ((ed) this).field_wb, ul.field_k);
        var2.a(r.field_e, (byte) 3, 15);
        ((ed) this).a((byte) -92, (qm) (Object) var2);
    }

    final void a(boolean param0, String param1, int param2) {
        RuntimeException var4 = null;
        me var4_ref = null;
        int var5 = 0;
        me var6 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        me stackIn_13_0 = null;
        me stackIn_14_0 = null;
        me stackIn_15_0 = null;
        String stackIn_15_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        me stackOut_12_0 = null;
        me stackOut_14_0 = null;
        String stackOut_14_1 = null;
        me stackOut_13_0 = null;
        String stackOut_13_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (!((ed) this).field_Gb) {
              L1: {
                stackOut_3_0 = this;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (!param0) {
                  stackOut_5_0 = this;
                  stackOut_5_1 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  break L1;
                } else {
                  stackOut_4_0 = this;
                  stackOut_4_1 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  break L1;
                }
              }
              L2: {
                ((ed) this).field_Gb = stackIn_6_1 != 0;
                stackOut_6_0 = this;
                stackIn_8_0 = stackOut_6_0;
                stackIn_7_0 = stackOut_6_0;
                if (256 != param2) {
                  stackOut_8_0 = this;
                  stackOut_8_1 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  break L2;
                } else {
                  stackOut_7_0 = this;
                  stackOut_7_1 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  break L2;
                }
              }
              L3: {
                ((ed) this).field_zb = stackIn_9_1 != 0;
                ((ed) this).field_ub.b(4210752, param0, 8405024);
                var6 = new me((ed) this, ((ed) this).field_wb, param1);
                var4_ref = var6;
                if (5 != param2) {
                  if (256 == param2) {
                    ag discarded$2 = var6.a(118, sk.field_b, (wc) this);
                    break L3;
                  } else {
                    L4: {
                      stackOut_12_0 = (me) var6;
                      stackIn_14_0 = stackOut_12_0;
                      stackIn_13_0 = stackOut_12_0;
                      if (!((ed) this).field_Ab) {
                        stackOut_14_0 = (me) (Object) stackIn_14_0;
                        stackOut_14_1 = ae.field_b;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        break L4;
                      } else {
                        stackOut_13_0 = (me) (Object) stackIn_13_0;
                        stackOut_13_1 = sk.field_b;
                        stackIn_15_0 = stackOut_13_0;
                        stackIn_15_1 = stackOut_13_1;
                        break L4;
                      }
                    }
                    ((me) (Object) stackIn_15_0).a(stackIn_15_1, (byte) 111, -1);
                    break L3;
                  }
                } else {
                  var6.a(ee.field_f, (byte) 106, 11);
                  var6.a(ki.field_u, (byte) 111, 17);
                  break L3;
                }
              }
              L5: {
                if (param2 != 3) {
                  if (param2 == 4) {
                    var6.a(ad.field_e, (byte) -117, 8);
                    break L5;
                  } else {
                    if (6 == param2) {
                      var6.a(ea.field_B, (byte) -114, 9);
                      break L5;
                    } else {
                      if (param2 != 9) {
                        break L5;
                      } else {
                        ag discarded$3 = var6.a(81, fk.field_j, (wc) this);
                        break L5;
                      }
                    }
                  }
                } else {
                  var6.a(bd.field_b, (byte) 110, 7);
                  break L5;
                }
              }
              ((ed) this).a((byte) -92, (qm) (Object) var6);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var4;
            stackOut_27_1 = new StringBuilder().append("ed.H(").append(param0).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L6;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L6;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + param2 + 41);
        }
    }

    final static String k(int param0) {
        if (!(in.field_Gb != sk.field_a)) {
            return ln.field_Q;
        }
        if (hb.field_Gb == sk.field_a) {
            return ji.field_j;
        }
        if (!wn.field_z.a((byte) -81)) {
            return ji.field_j;
        }
        return ge.field_g;
    }

    final static void a(byte param0, eg param1) {
        ai var2 = null;
        try {
            ai.a(param1.a("", "headers.packvorbis", -1));
            if (param0 != -17) {
                field_tb = null;
            }
            var2 = ai.a(param1, "jagex logo2.packvorbis", "");
            wf discarded$0 = var2.c();
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ed.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public void a(boolean param0, int param1, int param2, int param3, ag param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          if (param0) {
            if (!((ed) this).field_zb) {
              fk.a(cd.e(104), false, "tochangedisplayname.ws");
              return;
            } else {
              ee.a(3, (byte) 30);
              ((ed) this).h(77);
              return;
            }
          } else {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var6 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var6;
            stackOut_6_1 = new StringBuilder().append("ed.U(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param4 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L0;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L0;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    final static void a(byte param0, boolean param1) {
        if (param0 != 90) {
            return;
        }
        if (pm.field_b != null) {
            de.b(de.field_i, de.field_c, -de.field_i + de.field_h, de.field_k + -de.field_c);
            pm.field_b.a(param1, true);
        }
    }

    final static void j(int param0) {
        int var1 = ea.field_F * ea.field_F;
        int var2 = -(jo.field_e * jo.field_e) + var1;
        int var3 = (-ma.field_N + vd.field_k) * var2 / var1 + ma.field_N;
        n.field_g.a(640, sa.field_Hb, var3, 120, (byte) -120);
        jd.a(5, vd.field_k + -24, (byte) 19, 640, mm.field_p, 0, dh.field_Gb);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Db = "Security";
        field_Eb = "IMP MASTER - ";
        field_Ib = new int[]{21, 22, 23};
        field_tb = "This is <%0>'s RuneScape clan if they have one.";
        field_xb = "End Game";
        field_Cb = -1;
    }
}
