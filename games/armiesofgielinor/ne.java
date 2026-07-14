/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne implements uo {
    int field_h;
    private ha field_d;
    static dn field_f;
    jd field_c;
    boolean field_b;
    int field_g;
    boolean field_l;
    int field_a;
    int field_j;
    ca field_n;
    int[] field_k;
    int field_m;
    static boolean[] field_e;
    static int field_i;

    public static void g(int param0) {
        field_f = null;
        if (param0 >= -19) {
            return;
        }
        field_e = null;
    }

    final static void a(hd param0, Object param1, boolean param2) {
        int var3_int = 0;
        Exception var3 = null;
        int var4 = 0;
        Object var5 = null;
        Throwable decompiledCaughtException = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = ArmiesOfGielinor.field_M ? 1 : 0;
                    if (null != param0.field_j) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    var3_int = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var3_int >= 50) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (null == param0.field_j.peekEvent()) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    nu.a(1L, 0);
                    var3_int++;
                    statePc = 3;
                    continue stateLoop;
                }
                case 6: {
                    try {
                        if (param1 != null) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        param0.field_j.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param1, 1001, "dummy"));
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    var3 = (Exception) (Object) caughtException;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (param2) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var5 = null;
                    te discarded$3 = ne.a(-21, (aa) null);
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean e(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 < -114) {
          L0: {
            L1: {
              if (((ne) this).field_n == null) {
                break L1;
              } else {
                if (0 == (4 & ((ne) this).field_n.field_c)) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return false;
        }
    }

    final boolean h(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -1) {
            break L0;
          } else {
            ((ne) this).field_l = false;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((ne) this).field_n == null) {
              break L2;
            } else {
              if (-1 == (((ne) this).field_n.field_c & 2 ^ -1)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    public final void a(int param0, bv param1, String param2, byte param3) {
        int var6 = 0;
        L0: {
          var6 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param2.equals((Object) (Object) "unit")) {
            if (param0 <= 0) {
              break L0;
            } else {
              ((ne) this).field_c = a.a(param0, 32, param1);
              break L0;
            }
          } else {
            if (param2.equals((Object) (Object) "own")) {
              if ((param0 ^ -1) >= -1) {
                break L0;
              } else {
                ((ne) this).field_a = (int)tn.a(false, param0, param1);
                break L0;
              }
            } else {
              if (!param2.equals((Object) (Object) "type")) {
                if (!param2.equals((Object) (Object) "mod")) {
                  break L0;
                } else {
                  if (param0 <= 0) {
                    break L0;
                  } else {
                    ((ne) this).field_n = ui.a(param1, param0, 80);
                    break L0;
                  }
                }
              } else {
                if (param0 > 0) {
                  ((ne) this).field_h = (int)tn.a(false, param0, param1);
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (param3 == 37) {
            break L1;
          } else {
            ((ne) this).field_c = null;
            break L1;
          }
        }
    }

    final void a(boolean param0, int param1) {
        if (!(null != ((ne) this).field_n)) {
            ((ne) this).field_n = new ca();
        }
        if (!param0) {
            return;
        }
        ((ne) this).field_n.field_d = param1;
    }

    final boolean k(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 12) {
            break L0;
          } else {
            boolean discarded$2 = ((ne) this).l(-61);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((ne) this).field_n == null) {
              break L2;
            } else {
              if (-1 == (1 & ((ne) this).field_n.field_c ^ -1)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_10_0 = 0;
        ha stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        ha stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        ha stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        ha stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        ha stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        ha stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        ha stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        ha stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        ha stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        int stackIn_30_2 = 0;
        int stackIn_39_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_80_0 = 0;
        ha stackIn_101_0 = null;
        int stackIn_101_1 = 0;
        ha stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        ha stackIn_103_0 = null;
        int stackIn_103_1 = 0;
        int stackIn_103_2 = 0;
        ha stackIn_114_0 = null;
        int stackIn_114_1 = 0;
        ha stackIn_115_0 = null;
        int stackIn_115_1 = 0;
        ha stackIn_116_0 = null;
        int stackIn_116_1 = 0;
        int stackIn_116_2 = 0;
        ha stackIn_124_0 = null;
        int stackIn_124_1 = 0;
        ha stackIn_125_0 = null;
        int stackIn_125_1 = 0;
        ha stackIn_126_0 = null;
        int stackIn_126_1 = 0;
        int stackIn_126_2 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        ha stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        ha stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int stackOut_29_2 = 0;
        ha stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        ha stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        ha stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        ha stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        ha stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        ha stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        ha stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_72_0 = 0;
        ha stackOut_100_0 = null;
        int stackOut_100_1 = 0;
        ha stackOut_102_0 = null;
        int stackOut_102_1 = 0;
        int stackOut_102_2 = 0;
        ha stackOut_101_0 = null;
        int stackOut_101_1 = 0;
        int stackOut_101_2 = 0;
        ha stackOut_113_0 = null;
        int stackOut_113_1 = 0;
        ha stackOut_115_0 = null;
        int stackOut_115_1 = 0;
        int stackOut_115_2 = 0;
        ha stackOut_114_0 = null;
        int stackOut_114_1 = 0;
        int stackOut_114_2 = 0;
        ha stackOut_123_0 = null;
        int stackOut_123_1 = 0;
        ha stackOut_125_0 = null;
        int stackOut_125_1 = 0;
        int stackOut_125_2 = 0;
        ha stackOut_124_0 = null;
        int stackOut_124_1 = 0;
        int stackOut_124_2 = 0;
        L0: {
          var14 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (((ne) this).field_d.field_K == null) {
            break L0;
          } else {
            if (param2 != ((ne) this).field_a) {
              return;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (((ne) this).field_c != null) {
            if (!((ne) this).field_d.c(((ne) this).field_c.field_O, -16985, param2)) {
              stackOut_8_0 = 1;
              stackIn_10_0 = stackOut_8_0;
              break L1;
            } else {
              stackOut_7_0 = 0;
              stackIn_10_0 = stackOut_7_0;
              break L1;
            }
          } else {
            stackOut_5_0 = 0;
            stackIn_10_0 = stackOut_5_0;
            break L1;
          }
        }
        L2: {
          var6 = stackIn_10_0;
          if (param3 <= (((ne) this).field_a ^ -1)) {
            break L2;
          } else {
            var7 = ((ne) this).field_h;
            if (7 != var7) {
              if ((var7 ^ -1) != -9) {
                L3: {
                  if (var7 != 14) {
                    if (var7 != 9) {
                      break L2;
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                L4: {
                  stackOut_27_0 = ((ne) this).field_d;
                  stackOut_27_1 = param2;
                  stackIn_29_0 = stackOut_27_0;
                  stackIn_29_1 = stackOut_27_1;
                  stackIn_28_0 = stackOut_27_0;
                  stackIn_28_1 = stackOut_27_1;
                  if (var6 != 0) {
                    stackOut_29_0 = (ha) (Object) stackIn_29_0;
                    stackOut_29_1 = stackIn_29_1;
                    stackOut_29_2 = 37;
                    stackIn_30_0 = stackOut_29_0;
                    stackIn_30_1 = stackOut_29_1;
                    stackIn_30_2 = stackOut_29_2;
                    break L4;
                  } else {
                    stackOut_28_0 = (ha) (Object) stackIn_28_0;
                    stackOut_28_1 = stackIn_28_1;
                    stackOut_28_2 = 75;
                    stackIn_30_0 = stackOut_28_0;
                    stackIn_30_1 = stackOut_28_1;
                    stackIn_30_2 = stackOut_28_2;
                    break L4;
                  }
                }
                var5 = ((ha) (Object) stackIn_30_0).d(stackIn_30_1, stackIn_30_2, 6);
                ((ne) this).field_d.field_S[((ne) this).field_d.o(((ne) this).field_a, -1)] = ((ne) this).field_d.field_S[((ne) this).field_d.o(((ne) this).field_a, -1)] + 75;
                break L2;
              } else {
                L5: {
                  stackOut_23_0 = ((ne) this).field_d;
                  stackOut_23_1 = param2;
                  stackIn_25_0 = stackOut_23_0;
                  stackIn_25_1 = stackOut_23_1;
                  stackIn_24_0 = stackOut_23_0;
                  stackIn_24_1 = stackOut_23_1;
                  if (var6 != 0) {
                    stackOut_25_0 = (ha) (Object) stackIn_25_0;
                    stackOut_25_1 = stackIn_25_1;
                    stackOut_25_2 = 12;
                    stackIn_26_0 = stackOut_25_0;
                    stackIn_26_1 = stackOut_25_1;
                    stackIn_26_2 = stackOut_25_2;
                    break L5;
                  } else {
                    stackOut_24_0 = (ha) (Object) stackIn_24_0;
                    stackOut_24_1 = stackIn_24_1;
                    stackOut_24_2 = 25;
                    stackIn_26_0 = stackOut_24_0;
                    stackIn_26_1 = stackOut_24_1;
                    stackIn_26_2 = stackOut_24_2;
                    break L5;
                  }
                }
                var5 = ((ha) (Object) stackIn_26_0).d(stackIn_26_1, stackIn_26_2, 6);
                ((ne) this).field_d.field_S[((ne) this).field_d.o(((ne) this).field_a, -1)] = ((ne) this).field_d.field_S[((ne) this).field_d.o(((ne) this).field_a, -1)] + 25;
                break L2;
              }
            } else {
              L6: {
                stackOut_19_0 = ((ne) this).field_d;
                stackOut_19_1 = param2;
                stackIn_21_0 = stackOut_19_0;
                stackIn_21_1 = stackOut_19_1;
                stackIn_20_0 = stackOut_19_0;
                stackIn_20_1 = stackOut_19_1;
                if (var6 != 0) {
                  stackOut_21_0 = (ha) (Object) stackIn_21_0;
                  stackOut_21_1 = stackIn_21_1;
                  stackOut_21_2 = 25;
                  stackIn_22_0 = stackOut_21_0;
                  stackIn_22_1 = stackOut_21_1;
                  stackIn_22_2 = stackOut_21_2;
                  break L6;
                } else {
                  stackOut_20_0 = (ha) (Object) stackIn_20_0;
                  stackOut_20_1 = stackIn_20_1;
                  stackOut_20_2 = 50;
                  stackIn_22_0 = stackOut_20_0;
                  stackIn_22_1 = stackOut_20_1;
                  stackIn_22_2 = stackOut_20_2;
                  break L6;
                }
              }
              var5 = ((ha) (Object) stackIn_22_0).d(stackIn_22_1, stackIn_22_2, 6);
              ((ne) this).field_d.field_S[((ne) this).field_d.o(((ne) this).field_a, -1)] = ((ne) this).field_d.field_S[((ne) this).field_d.o(((ne) this).field_a, -1)] + 50;
              break L2;
            }
          }
        }
        if (((ne) this).field_d.c(((ne) this).field_a, -16985, param2)) {
          L7: {
            if (!((ne) this).field_d.field_F) {
              if (param2 == ((ne) this).field_d.field_sb) {
                stackOut_37_0 = 1;
                stackIn_39_0 = stackOut_37_0;
                break L7;
              } else {
                stackOut_36_0 = 0;
                stackIn_39_0 = stackOut_36_0;
                break L7;
              }
            } else {
              stackOut_34_0 = 1;
              stackIn_39_0 = stackOut_34_0;
              break L7;
            }
          }
          L8: {
            var7 = stackIn_39_0;
            if (((ne) this).field_c != null) {
              if (((ne) this).field_d.c(((ne) this).field_c.field_O, -16985, ((ne) this).field_a)) {
                stackOut_43_0 = 1;
                stackIn_45_0 = stackOut_43_0;
                break L8;
              } else {
                stackOut_42_0 = 0;
                stackIn_45_0 = stackOut_42_0;
                break L8;
              }
            } else {
              stackOut_40_0 = 0;
              stackIn_45_0 = stackOut_40_0;
              break L8;
            }
          }
          L9: {
            var8 = stackIn_45_0;
            if (((ne) this).field_c != null) {
              if (var8 != 0) {
                if (((ne) this).field_c.field_O != param2) {
                  if (null != ((ne) this).field_d.field_K) {
                    stackOut_53_0 = 0;
                    stackIn_55_0 = stackOut_53_0;
                    break L9;
                  } else {
                    stackOut_52_0 = 1;
                    stackIn_55_0 = stackOut_52_0;
                    break L9;
                  }
                } else {
                  stackOut_50_0 = 0;
                  stackIn_55_0 = stackOut_50_0;
                  break L9;
                }
              } else {
                stackOut_48_0 = 0;
                stackIn_55_0 = stackOut_48_0;
                break L9;
              }
            } else {
              stackOut_46_0 = 0;
              stackIn_55_0 = stackOut_46_0;
              break L9;
            }
          }
          L10: {
            var9 = stackIn_55_0;
            if (((ne) this).field_c != null) {
              if (var8 != 0) {
                if (((ne) this).field_c.field_t <= ((ne) this).field_c.field_Y) {
                  stackOut_61_0 = 0;
                  stackIn_62_0 = stackOut_61_0;
                  break L10;
                } else {
                  stackOut_60_0 = 1;
                  stackIn_62_0 = stackOut_60_0;
                  break L10;
                }
              } else {
                stackOut_58_0 = 0;
                stackIn_62_0 = stackOut_58_0;
                break L10;
              }
            } else {
              stackOut_56_0 = 0;
              stackIn_62_0 = stackOut_56_0;
              break L10;
            }
          }
          L11: {
            var10 = stackIn_62_0;
            if (((ne) this).field_c != null) {
              if (var8 == 0) {
                if (((ne) this).field_a != -1) {
                  if (((ne) this).field_c.i(-21428)) {
                    stackOut_70_0 = 0;
                    stackIn_71_0 = stackOut_70_0;
                    break L11;
                  } else {
                    stackOut_69_0 = 1;
                    stackIn_71_0 = stackOut_69_0;
                    break L11;
                  }
                } else {
                  stackOut_67_0 = 0;
                  stackIn_71_0 = stackOut_67_0;
                  break L11;
                }
              } else {
                stackOut_65_0 = 0;
                stackIn_71_0 = stackOut_65_0;
                break L11;
              }
            } else {
              stackOut_63_0 = 0;
              stackIn_71_0 = stackOut_63_0;
              break L11;
            }
          }
          L12: {
            var11 = stackIn_71_0;
            if (((ne) this).field_c != null) {
              if (var8 != 0) {
                if (((ne) this).field_c.field_t > ((ne) this).field_c.field_Y) {
                  if (((ne) this).field_c.a(23072)) {
                    stackOut_79_0 = 0;
                    stackIn_80_0 = stackOut_79_0;
                    break L12;
                  } else {
                    stackOut_78_0 = 1;
                    stackIn_80_0 = stackOut_78_0;
                    break L12;
                  }
                } else {
                  stackOut_76_0 = 0;
                  stackIn_80_0 = stackOut_76_0;
                  break L12;
                }
              } else {
                stackOut_74_0 = 0;
                stackIn_80_0 = stackOut_74_0;
                break L12;
              }
            } else {
              stackOut_72_0 = 0;
              stackIn_80_0 = stackOut_72_0;
              break L12;
            }
          }
          L13: {
            var12 = stackIn_80_0;
            var13 = ((ne) this).field_h;
            if (var13 != -12) {
              if (-8 == var13) {
                L14: {
                  if (var10 == 0) {
                    break L14;
                  } else {
                    L15: {
                      ((ne) this).field_d.field_l.a((byte) -119, (tc) (Object) new st(((ne) this).field_c, 1));
                      if (-1 + ((ne) this).field_c.field_t <= ((ne) this).field_c.field_Y) {
                        break L15;
                      } else {
                        ((ne) this).field_d.field_l.a((byte) -119, (tc) (Object) new st(((ne) this).field_c, 1));
                        break L15;
                      }
                    }
                    ((ne) this).field_d.e(14, param1, ((ne) this).field_a, param0);
                    break L14;
                  }
                }
                L16: {
                  if (var11 != 0) {
                    ((ne) this).field_d.field_l.a((byte) -119, (tc) (Object) new nw(((ne) this).field_c, 3, false));
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  if (var9 == 0) {
                    break L17;
                  } else {
                    ((ne) this).field_d.field_l.a((byte) -119, (tc) (Object) new as(((ne) this).field_c, param2, true));
                    break L17;
                  }
                }
                L18: {
                  stackOut_100_0 = ((ne) this).field_d;
                  stackOut_100_1 = param2;
                  stackIn_102_0 = stackOut_100_0;
                  stackIn_102_1 = stackOut_100_1;
                  stackIn_101_0 = stackOut_100_0;
                  stackIn_101_1 = stackOut_100_1;
                  if (var6 == 0) {
                    stackOut_102_0 = (ha) (Object) stackIn_102_0;
                    stackOut_102_1 = stackIn_102_1;
                    stackOut_102_2 = 50;
                    stackIn_103_0 = stackOut_102_0;
                    stackIn_103_1 = stackOut_102_1;
                    stackIn_103_2 = stackOut_102_2;
                    break L18;
                  } else {
                    stackOut_101_0 = (ha) (Object) stackIn_101_0;
                    stackOut_101_1 = stackIn_101_1;
                    stackOut_101_2 = 25;
                    stackIn_103_0 = stackOut_101_0;
                    stackIn_103_1 = stackOut_101_1;
                    stackIn_103_2 = stackOut_101_2;
                    break L18;
                  }
                }
                var5 = ((ha) (Object) stackIn_103_0).d(stackIn_103_1, stackIn_103_2, 6);
                if (var7 != 0) {
                  ((ne) this).field_d.field_l.a((byte) -119, (tc) (Object) new vp(0, var5, param2));
                  break L13;
                } else {
                  L19: {
                    ((ne) this).field_d.field_H[param2] = ((ne) this).field_d.field_H[param2] + var5;
                    if (1000000000 < ((ne) this).field_d.field_H[param2]) {
                      ((ne) this).field_d.field_H[param2] = 1000000000;
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  ((ne) this).field_d.field_fb[((ne) this).field_d.o(param2, -1)] = ((ne) this).field_d.field_fb[((ne) this).field_d.o(param2, -1)] + var5;
                  if (-1000000001 > (((ne) this).field_d.field_fb[((ne) this).field_d.o(param2, -1)] ^ -1)) {
                    ((ne) this).field_d.field_fb[((ne) this).field_d.o(param2, -1)] = 1000000000;
                    break L13;
                  } else {
                    break L13;
                  }
                }
              } else {
                if (-9 == (var13 ^ -1)) {
                  L20: {
                    if (var12 == 0) {
                      break L20;
                    } else {
                      ((ne) this).field_d.field_l.a((byte) -119, (tc) (Object) new st(((ne) this).field_c, 1));
                      ((ne) this).field_d.e(14, param1, ((ne) this).field_a, param0);
                      break L20;
                    }
                  }
                  L21: {
                    stackOut_113_0 = ((ne) this).field_d;
                    stackOut_113_1 = param2;
                    stackIn_115_0 = stackOut_113_0;
                    stackIn_115_1 = stackOut_113_1;
                    stackIn_114_0 = stackOut_113_0;
                    stackIn_114_1 = stackOut_113_1;
                    if (var6 == 0) {
                      stackOut_115_0 = (ha) (Object) stackIn_115_0;
                      stackOut_115_1 = stackIn_115_1;
                      stackOut_115_2 = 25;
                      stackIn_116_0 = stackOut_115_0;
                      stackIn_116_1 = stackOut_115_1;
                      stackIn_116_2 = stackOut_115_2;
                      break L21;
                    } else {
                      stackOut_114_0 = (ha) (Object) stackIn_114_0;
                      stackOut_114_1 = stackIn_114_1;
                      stackOut_114_2 = 12;
                      stackIn_116_0 = stackOut_114_0;
                      stackIn_116_1 = stackOut_114_1;
                      stackIn_116_2 = stackOut_114_2;
                      break L21;
                    }
                  }
                  var5 = ((ha) (Object) stackIn_116_0).d(stackIn_116_1, stackIn_116_2, param3 ^ 6);
                  if (var7 != 0) {
                    ((ne) this).field_d.field_l.a((byte) -119, (tc) (Object) new vp(2, var5, param2));
                    break L13;
                  } else {
                    ((ne) this).field_d.field_H[param2] = ((ne) this).field_d.field_H[param2] + var5;
                    ((ne) this).field_d.field_fb[((ne) this).field_d.o(param2, -1)] = ((ne) this).field_d.field_fb[((ne) this).field_d.o(param2, -1)] + var5;
                    if (-1000000001 > (((ne) this).field_d.field_fb[((ne) this).field_d.o(param2, -1)] ^ -1)) {
                      ((ne) this).field_d.field_fb[((ne) this).field_d.o(param2, param3 + -1)] = 1000000000;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                } else {
                  L22: {
                    if (var13 == 14) {
                      break L22;
                    } else {
                      if ((var13 ^ -1) != -10) {
                        break L13;
                      } else {
                        break L22;
                      }
                    }
                  }
                  L23: {
                    if (var12 == 0) {
                      break L23;
                    } else {
                      ((ne) this).field_d.field_l.a((byte) -119, (tc) (Object) new st(((ne) this).field_c, 1));
                      ((ne) this).field_d.e(param3 + 14, param1, ((ne) this).field_a, param0);
                      break L23;
                    }
                  }
                  L24: {
                    stackOut_123_0 = ((ne) this).field_d;
                    stackOut_123_1 = param2;
                    stackIn_125_0 = stackOut_123_0;
                    stackIn_125_1 = stackOut_123_1;
                    stackIn_124_0 = stackOut_123_0;
                    stackIn_124_1 = stackOut_123_1;
                    if (var6 == 0) {
                      stackOut_125_0 = (ha) (Object) stackIn_125_0;
                      stackOut_125_1 = stackIn_125_1;
                      stackOut_125_2 = 75;
                      stackIn_126_0 = stackOut_125_0;
                      stackIn_126_1 = stackOut_125_1;
                      stackIn_126_2 = stackOut_125_2;
                      break L24;
                    } else {
                      stackOut_124_0 = (ha) (Object) stackIn_124_0;
                      stackOut_124_1 = stackIn_124_1;
                      stackOut_124_2 = 37;
                      stackIn_126_0 = stackOut_124_0;
                      stackIn_126_1 = stackOut_124_1;
                      stackIn_126_2 = stackOut_124_2;
                      break L24;
                    }
                  }
                  var5 = ((ha) (Object) stackIn_126_0).d(stackIn_126_1, stackIn_126_2, 6);
                  if (var7 == 0) {
                    ((ne) this).field_d.field_H[param2] = ((ne) this).field_d.field_H[param2] + var5;
                    ((ne) this).field_d.field_fb[((ne) this).field_d.o(param2, -1)] = ((ne) this).field_d.field_fb[((ne) this).field_d.o(param2, -1)] + var5;
                    if ((((ne) this).field_d.field_fb[((ne) this).field_d.o(param2, -1)] ^ -1) < -1000000001) {
                      ((ne) this).field_d.field_fb[((ne) this).field_d.o(param2, -1)] = 1000000000;
                      break L13;
                    } else {
                      break L13;
                    }
                  } else {
                    ((ne) this).field_d.field_l.a((byte) -119, (tc) (Object) new vp(1, var5, param2));
                    break L13;
                  }
                }
              }
            } else {
              L25: {
                if (var11 == 0) {
                  break L25;
                } else {
                  ((ne) this).field_d.field_l.a((byte) -119, (tc) (Object) new nw(((ne) this).field_c, 3, false));
                  break L25;
                }
              }
              if (var9 == 0) {
                break L13;
              } else {
                ((ne) this).field_d.field_l.a((byte) -119, (tc) (Object) new as(((ne) this).field_c, param2, true));
                break L13;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final int b(byte param0) {
        if (!(((ne) this).c((byte) -79))) {
            return -1;
        }
        if (param0 > -19) {
            ((ne) this).field_m = -105;
        }
        if (!((((ne) this).field_n.field_b ^ -1) != -256)) {
            return -1;
        }
        return ((ne) this).field_n.field_b;
    }

    final boolean d(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 <= -12) {
            break L0;
          } else {
            ((ne) this).field_g = 34;
            break L0;
          }
        }
        L1: {
          L2: {
            if ((((ne) this).field_h ^ -1) == -12) {
              break L2;
            } else {
              if (7 != ((ne) this).field_h) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final String f(byte param0) {
        String var2 = null;
        String var2_ref = null;
        int var3 = 0;
        L0: {
          L1: {
            var3 = ArmiesOfGielinor.field_M ? 1 : 0;
            var2 = "";
            if (((ne) this).field_n == null) {
              break L1;
            } else {
              if (((ne) this).field_n.field_e == null) {
                break L1;
              } else {
                var2 = ((ne) this).field_n.field_e;
                break L0;
              }
            }
          }
          if (jj.field_a.length <= ((ne) this).field_h) {
            break L0;
          } else {
            L2: {
              if (null == ((ne) this).field_d) {
                break L2;
              } else {
                if (((ne) this).field_d.field_hb == 4) {
                  var2_ref = dj.field_d[((ne) this).field_h];
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            var2_ref = jj.field_a[((ne) this).field_h];
            break L0;
          }
        }
        L3: {
          if (((ne) this).e((byte) -120)) {
            var2 = var2_ref + " " + ce.field_P;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (param0 >= 30) {
            break L4;
          } else {
            ((ne) this).field_a = -35;
            break L4;
          }
        }
        return var2;
    }

    final boolean a(boolean param0) {
        if (param0) {
            ((ne) this).field_a = -78;
        }
        return ck.a(((ne) this).field_h, -12);
    }

    private ne(int param0) {
        this();
        ((ne) this).field_h = param0;
        ((ne) this).field_m = ((ne) this).e(10);
    }

    final void j(int param0) {
        int var2 = -2 % ((param0 - 5) / 44);
        if (!(((ne) this).field_h != 11)) {
            ((ne) this).field_g = ((ne) this).field_n.field_g;
        }
    }

    final void a(int param0) {
        if (null == ((ne) this).field_n) {
            ((ne) this).field_n = new ca();
        }
        if (param0 < 62) {
            return;
        }
        ((ne) this).field_n.field_c = ((ne) this).field_n.field_c | 8;
    }

    final int e(int param0) {
        if (param0 != 10) {
            return 18;
        }
        if ((((ne) this).field_h ^ -1) != -10) {
            if (14 != ((ne) this).field_h) {
                return 10;
            }
        }
        return 15;
    }

    final void a(byte param0, ha param1) {
        ((ne) this).field_d = param1;
        if (param0 != -68) {
            Object var4 = null;
            ((ne) this).a(-103, (bv) null, (String) null, (byte) 0);
        }
        if (param1 == null) {
            return;
        }
        ((ne) this).field_k = new int[((ne) this).field_d.field_tb];
        if (!(((ne) this).field_c == null)) {
            ((ne) this).field_c.field_l = ((ne) this).field_d;
            ((ne) this).field_d.a(8288, ((ne) this).field_c);
        }
    }

    final boolean c(int param0) {
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var2 = 89 / ((20 - param0) / 41);
            if (null == ((ne) this).field_n) {
              break L1;
            } else {
              if (0 == (8 & ((ne) this).field_n.field_c)) {
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_4_0 != 0;
    }

    final boolean l(int param0) {
        if (param0 != -1) {
            ((ne) this).field_c = null;
        }
        return ((ne) this).field_m != ((ne) this).e(10) ? true : false;
    }

    final int a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        var4 = 0;
        if (((ne) this).field_k == null) {
          return 0;
        } else {
          L0: {
            var5 = 0;
            if (param0 == 97) {
              break L0;
            } else {
              ((ne) this).field_b = false;
              break L0;
            }
          }
          L1: while (true) {
            if (((ne) this).field_k.length <= var5) {
              return var4;
            } else {
              if (param1 < 0) {
                var4 = var4 | ((ne) this).field_k[var5];
                var5++;
                continue L1;
              } else {
                if (param2 == var5) {
                  var4 = var4 | 16 & ((ne) this).field_k[var5];
                  var5++;
                  continue L1;
                } else {
                  var4 = var4 | 15 & ((ne) this).field_k[var5];
                  var5++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final boolean c(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -79) {
            break L0;
          } else {
            ((ne) this).field_j = -3;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((ne) this).field_n == null) {
              break L2;
            } else {
              if (0 == (16 & ((ne) this).field_n.field_c)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final void b(boolean param0, int param1) {
        if (((ne) this).field_n == null) {
            ((ne) this).field_n = new ca();
        }
        if (!param0) {
            field_f = null;
        }
        ((ne) this).field_n.field_b = param1;
        ((ne) this).field_n.field_c = ((ne) this).field_n.field_c | 16;
    }

    final void d(byte param0) {
        if (param0 < 42) {
            ((ne) this).a(13, -128, -104, -117);
        }
        ((ne) this).field_n.field_c = ((ne) this).field_n.field_c & -2;
    }

    final void i(int param0) {
        if (!(((ne) this).field_n != null)) {
            return;
        }
        ((ne) this).field_n.field_c = ((ne) this).field_n.field_c & -9;
        if (param0 != 14) {
            ((ne) this).field_g = 118;
        }
    }

    final static te a(int param0, aa param1) {
        te var2 = new te(param1, (tc) (Object) param1);
        bl.field_h.a((byte) -119, (tc) (Object) var2);
        if (param0 > -35) {
            return null;
        }
        ig.field_n.a((hn) (Object) param1);
        return var2;
    }

    final boolean b(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 928) {
          L0: {
            L1: {
              if (3 == ((ne) this).field_h) {
                break L1;
              } else {
                if (-3 != (((ne) this).field_h ^ -1)) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = 1;
            stackIn_7_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return false;
        }
    }

    final int a(byte param0) {
        if (param0 != -107) {
            ((ne) this).field_j = -71;
        }
        if (((ne) this).field_n != null) {
            return ((ne) this).field_n.field_d;
        }
        return 0;
    }

    final boolean a(int param0, byte param1) {
        if (param1 != 91) {
            ((ne) this).field_l = true;
        }
        return ((ne) this).field_d.c(((ne) this).field_a, param1 + -17076, param0);
    }

    final void a(int param0, int param1) {
        int var3 = -116 % ((-35 - param0) / 61);
        ((ne) this).field_m = ((ne) this).e(10);
        if (((ne) this).field_h != 11) {
            ((ne) this).field_a = param1;
        } else {
            if (!(null == ((ne) this).field_d.field_K)) {
                ((ne) this).field_b = true;
            }
            ((ne) this).field_a = -1;
            ((ne) this).field_h = 0;
        }
    }

    ne(int param0, ha param1) {
        this(param0);
        ((ne) this).a((byte) -68, param1);
    }

    final boolean f(int param0) {
        if (param0 != 19725) {
            ((ne) this).d((byte) -22);
        }
        return !((ne) this).a(false) ? true : false;
    }

    ne() {
        ((ne) this).field_l = false;
        ((ne) this).field_b = false;
        ((ne) this).field_a = -1;
        ((ne) this).field_m = 10;
        ((ne) this).field_c = null;
        ((ne) this).field_g = -1;
        ((ne) this).field_a = -1;
        ((ne) this).field_d = null;
        ((ne) this).field_j = 0;
        ((ne) this).field_k = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = -1;
    }
}
