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
        field_e = null;
    }

    final static void a(hd param0, Object param1, boolean param2) {
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (null != param0.field_j) {
              var3_int = 0;
              L1: while (true) {
                L2: {
                  if (var3_int >= 50) {
                    break L2;
                  } else {
                    if (null == param0.field_j.peekEvent()) {
                      break L2;
                    } else {
                      nu.a(1L, 0);
                      var3_int++;
                      continue L1;
                    }
                  }
                }
                try {
                  L3: {
                    L4: {
                      if (param1 != null) {
                        param0.field_j.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param1, 1001, "dummy"));
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    break L3;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L5;
                  }
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L6: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("ne.T(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          L7: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + 1 + 41);
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
              if ((((ne) this).field_n.field_c & 2) == 0) {
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
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2.equals((Object) (Object) "unit")) {
                if (param0 <= 0) {
                  break L1;
                } else {
                  ((ne) this).field_c = a.a(param0, 32, param1);
                  break L1;
                }
              } else {
                if (param2.equals((Object) (Object) "own")) {
                  if (param0 <= 0) {
                    break L1;
                  } else {
                    ((ne) this).field_a = (int)tn.a(false, param0, param1);
                    break L1;
                  }
                } else {
                  if (!param2.equals((Object) (Object) "type")) {
                    if (!param2.equals((Object) (Object) "mod")) {
                      break L1;
                    } else {
                      if (param0 <= 0) {
                        break L1;
                      } else {
                        ((ne) this).field_n = ui.a(param1, param0, 80);
                        break L1;
                      }
                    }
                  } else {
                    if (param0 > 0) {
                      ((ne) this).field_h = (int)tn.a(false, param0, param1);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            L2: {
              if (param3 == 37) {
                break L2;
              } else {
                ((ne) this).field_c = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var5;
            stackOut_17_1 = new StringBuilder().append("ne.B(").append(param0).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          L4: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L4;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param3 + 41);
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
              if ((1 & ((ne) this).field_n.field_c) == 0) {
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
        int stackIn_8_0 = 0;
        ha stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        ha stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        ha stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        ha stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        ha stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        ha stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        ha stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        ha stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        ha stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_28_2 = 0;
        int stackIn_36_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_63_0 = 0;
        ha stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        ha stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        ha stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        int stackIn_86_2 = 0;
        ha stackIn_97_0 = null;
        int stackIn_97_1 = 0;
        ha stackIn_98_0 = null;
        int stackIn_98_1 = 0;
        ha stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        int stackIn_99_2 = 0;
        ha stackIn_107_0 = null;
        int stackIn_107_1 = 0;
        ha stackIn_108_0 = null;
        int stackIn_108_1 = 0;
        ha stackIn_109_0 = null;
        int stackIn_109_1 = 0;
        int stackIn_109_2 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        ha stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        ha stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        ha stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        ha stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        ha stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        ha stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        ha stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        ha stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        ha stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_62_0 = 0;
        ha stackOut_83_0 = null;
        int stackOut_83_1 = 0;
        ha stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        int stackOut_85_2 = 0;
        ha stackOut_84_0 = null;
        int stackOut_84_1 = 0;
        int stackOut_84_2 = 0;
        ha stackOut_96_0 = null;
        int stackOut_96_1 = 0;
        ha stackOut_98_0 = null;
        int stackOut_98_1 = 0;
        int stackOut_98_2 = 0;
        ha stackOut_97_0 = null;
        int stackOut_97_1 = 0;
        int stackOut_97_2 = 0;
        ha stackOut_106_0 = null;
        int stackOut_106_1 = 0;
        ha stackOut_108_0 = null;
        int stackOut_108_1 = 0;
        int stackOut_108_2 = 0;
        ha stackOut_107_0 = null;
        int stackOut_107_1 = 0;
        int stackOut_107_2 = 0;
        L0: {
          var14 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (((ne) this).field_d.field_K == null) {
            break L0;
          } else {
            if (~param2 != ~((ne) this).field_a) {
              return;
            } else {
              break L0;
            }
          }
        }
        L1: {
          L2: {
            if (((ne) this).field_c == null) {
              break L2;
            } else {
              if (((ne) this).field_d.c(((ne) this).field_c.field_O, -16985, param2)) {
                break L2;
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                break L1;
              }
            }
          }
          stackOut_7_0 = 0;
          stackIn_8_0 = stackOut_7_0;
          break L1;
        }
        L3: {
          var6 = stackIn_8_0;
          if (param3 <= ~((ne) this).field_a) {
            break L3;
          } else {
            var7 = ((ne) this).field_h;
            if (7 != var7) {
              if (var7 != 8) {
                L4: {
                  if (var7 != 14) {
                    if (var7 != 9) {
                      break L3;
                    } else {
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                L5: {
                  stackOut_25_0 = ((ne) this).field_d;
                  stackOut_25_1 = param2;
                  stackIn_27_0 = stackOut_25_0;
                  stackIn_27_1 = stackOut_25_1;
                  stackIn_26_0 = stackOut_25_0;
                  stackIn_26_1 = stackOut_25_1;
                  if (var6 != 0) {
                    stackOut_27_0 = (ha) (Object) stackIn_27_0;
                    stackOut_27_1 = stackIn_27_1;
                    stackOut_27_2 = 37;
                    stackIn_28_0 = stackOut_27_0;
                    stackIn_28_1 = stackOut_27_1;
                    stackIn_28_2 = stackOut_27_2;
                    break L5;
                  } else {
                    stackOut_26_0 = (ha) (Object) stackIn_26_0;
                    stackOut_26_1 = stackIn_26_1;
                    stackOut_26_2 = 75;
                    stackIn_28_0 = stackOut_26_0;
                    stackIn_28_1 = stackOut_26_1;
                    stackIn_28_2 = stackOut_26_2;
                    break L5;
                  }
                }
                var5 = ((ha) (Object) stackIn_28_0).d(stackIn_28_1, stackIn_28_2, 6);
                int dupTemp$6 = ((ne) this).field_d.o(((ne) this).field_a, -1);
                ((ne) this).field_d.field_S[dupTemp$6] = ((ne) this).field_d.field_S[dupTemp$6] + 75;
                break L3;
              } else {
                L6: {
                  stackOut_21_0 = ((ne) this).field_d;
                  stackOut_21_1 = param2;
                  stackIn_23_0 = stackOut_21_0;
                  stackIn_23_1 = stackOut_21_1;
                  stackIn_22_0 = stackOut_21_0;
                  stackIn_22_1 = stackOut_21_1;
                  if (var6 != 0) {
                    stackOut_23_0 = (ha) (Object) stackIn_23_0;
                    stackOut_23_1 = stackIn_23_1;
                    stackOut_23_2 = 12;
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    stackIn_24_2 = stackOut_23_2;
                    break L6;
                  } else {
                    stackOut_22_0 = (ha) (Object) stackIn_22_0;
                    stackOut_22_1 = stackIn_22_1;
                    stackOut_22_2 = 25;
                    stackIn_24_0 = stackOut_22_0;
                    stackIn_24_1 = stackOut_22_1;
                    stackIn_24_2 = stackOut_22_2;
                    break L6;
                  }
                }
                var5 = ((ha) (Object) stackIn_24_0).d(stackIn_24_1, stackIn_24_2, 6);
                int dupTemp$7 = ((ne) this).field_d.o(((ne) this).field_a, -1);
                ((ne) this).field_d.field_S[dupTemp$7] = ((ne) this).field_d.field_S[dupTemp$7] + 25;
                break L3;
              }
            } else {
              L7: {
                stackOut_17_0 = ((ne) this).field_d;
                stackOut_17_1 = param2;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                if (var6 != 0) {
                  stackOut_19_0 = (ha) (Object) stackIn_19_0;
                  stackOut_19_1 = stackIn_19_1;
                  stackOut_19_2 = 25;
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  stackIn_20_2 = stackOut_19_2;
                  break L7;
                } else {
                  stackOut_18_0 = (ha) (Object) stackIn_18_0;
                  stackOut_18_1 = stackIn_18_1;
                  stackOut_18_2 = 50;
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  stackIn_20_2 = stackOut_18_2;
                  break L7;
                }
              }
              var5 = ((ha) (Object) stackIn_20_0).d(stackIn_20_1, stackIn_20_2, 6);
              int dupTemp$8 = ((ne) this).field_d.o(((ne) this).field_a, -1);
              ((ne) this).field_d.field_S[dupTemp$8] = ((ne) this).field_d.field_S[dupTemp$8] + 50;
              break L3;
            }
          }
        }
        if (((ne) this).field_d.c(((ne) this).field_a, -16985, param2)) {
          L8: {
            L9: {
              if (((ne) this).field_d.field_F) {
                break L9;
              } else {
                if (param2 != ((ne) this).field_d.field_sb) {
                  stackOut_35_0 = 0;
                  stackIn_36_0 = stackOut_35_0;
                  break L8;
                } else {
                  break L9;
                }
              }
            }
            stackOut_34_0 = 1;
            stackIn_36_0 = stackOut_34_0;
            break L8;
          }
          L10: {
            L11: {
              var7 = stackIn_36_0;
              if (((ne) this).field_c == null) {
                break L11;
              } else {
                if (!((ne) this).field_d.c(((ne) this).field_c.field_O, -16985, ((ne) this).field_a)) {
                  break L11;
                } else {
                  stackOut_38_0 = 1;
                  stackIn_40_0 = stackOut_38_0;
                  break L10;
                }
              }
            }
            stackOut_39_0 = 0;
            stackIn_40_0 = stackOut_39_0;
            break L10;
          }
          L12: {
            L13: {
              var8 = stackIn_40_0;
              if (((ne) this).field_c == null) {
                break L13;
              } else {
                if (var8 == 0) {
                  break L13;
                } else {
                  if (((ne) this).field_c.field_O == param2) {
                    break L13;
                  } else {
                    if (null != ((ne) this).field_d.field_K) {
                      break L13;
                    } else {
                      stackOut_44_0 = 1;
                      stackIn_46_0 = stackOut_44_0;
                      break L12;
                    }
                  }
                }
              }
            }
            stackOut_45_0 = 0;
            stackIn_46_0 = stackOut_45_0;
            break L12;
          }
          L14: {
            L15: {
              var9 = stackIn_46_0;
              if (((ne) this).field_c == null) {
                break L15;
              } else {
                if (var8 == 0) {
                  break L15;
                } else {
                  if (~((ne) this).field_c.field_t >= ~((ne) this).field_c.field_Y) {
                    break L15;
                  } else {
                    stackOut_49_0 = 1;
                    stackIn_51_0 = stackOut_49_0;
                    break L14;
                  }
                }
              }
            }
            stackOut_50_0 = 0;
            stackIn_51_0 = stackOut_50_0;
            break L14;
          }
          L16: {
            L17: {
              var10 = stackIn_51_0;
              if (((ne) this).field_c == null) {
                break L17;
              } else {
                if (var8 != 0) {
                  break L17;
                } else {
                  if (((ne) this).field_a == -1) {
                    break L17;
                  } else {
                    if (((ne) this).field_c.i(-21428)) {
                      break L17;
                    } else {
                      stackOut_55_0 = 1;
                      stackIn_57_0 = stackOut_55_0;
                      break L16;
                    }
                  }
                }
              }
            }
            stackOut_56_0 = 0;
            stackIn_57_0 = stackOut_56_0;
            break L16;
          }
          L18: {
            L19: {
              var11 = stackIn_57_0;
              if (((ne) this).field_c == null) {
                break L19;
              } else {
                if (var8 == 0) {
                  break L19;
                } else {
                  if (~((ne) this).field_c.field_t >= ~((ne) this).field_c.field_Y) {
                    break L19;
                  } else {
                    if (((ne) this).field_c.a(23072)) {
                      break L19;
                    } else {
                      stackOut_61_0 = 1;
                      stackIn_63_0 = stackOut_61_0;
                      break L18;
                    }
                  }
                }
              }
            }
            stackOut_62_0 = 0;
            stackIn_63_0 = stackOut_62_0;
            break L18;
          }
          L20: {
            L21: {
              var12 = stackIn_63_0;
              var13 = ((ne) this).field_h;
              if (var13 != 11) {
                if (var13 == 7) {
                  L22: {
                    if (var10 == 0) {
                      break L22;
                    } else {
                      L23: {
                        ((ne) this).field_d.field_l.a((byte) -119, (tc) (Object) new st(((ne) this).field_c, 1));
                        if (~(-1 + ((ne) this).field_c.field_t) >= ~((ne) this).field_c.field_Y) {
                          break L23;
                        } else {
                          ((ne) this).field_d.field_l.a((byte) -119, (tc) (Object) new st(((ne) this).field_c, 1));
                          break L23;
                        }
                      }
                      ((ne) this).field_d.e(14, param1, ((ne) this).field_a, param0);
                      break L22;
                    }
                  }
                  L24: {
                    if (var11 != 0) {
                      ((ne) this).field_d.field_l.a((byte) -119, (tc) (Object) new nw(((ne) this).field_c, 3, false));
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  L25: {
                    if (var9 == 0) {
                      break L25;
                    } else {
                      ((ne) this).field_d.field_l.a((byte) -119, (tc) (Object) new as(((ne) this).field_c, param2, true));
                      break L25;
                    }
                  }
                  L26: {
                    stackOut_83_0 = ((ne) this).field_d;
                    stackOut_83_1 = param2;
                    stackIn_85_0 = stackOut_83_0;
                    stackIn_85_1 = stackOut_83_1;
                    stackIn_84_0 = stackOut_83_0;
                    stackIn_84_1 = stackOut_83_1;
                    if (var6 == 0) {
                      stackOut_85_0 = (ha) (Object) stackIn_85_0;
                      stackOut_85_1 = stackIn_85_1;
                      stackOut_85_2 = 50;
                      stackIn_86_0 = stackOut_85_0;
                      stackIn_86_1 = stackOut_85_1;
                      stackIn_86_2 = stackOut_85_2;
                      break L26;
                    } else {
                      stackOut_84_0 = (ha) (Object) stackIn_84_0;
                      stackOut_84_1 = stackIn_84_1;
                      stackOut_84_2 = 25;
                      stackIn_86_0 = stackOut_84_0;
                      stackIn_86_1 = stackOut_84_1;
                      stackIn_86_2 = stackOut_84_2;
                      break L26;
                    }
                  }
                  var5 = ((ha) (Object) stackIn_86_0).d(stackIn_86_1, stackIn_86_2, 6);
                  if (var7 != 0) {
                    ((ne) this).field_d.field_l.a((byte) -119, (tc) (Object) new vp(0, var5, param2));
                    break L20;
                  } else {
                    L27: {
                      ((ne) this).field_d.field_H[param2] = ((ne) this).field_d.field_H[param2] + var5;
                      if (1000000000 < ((ne) this).field_d.field_H[param2]) {
                        ((ne) this).field_d.field_H[param2] = 1000000000;
                        break L27;
                      } else {
                        break L27;
                      }
                    }
                    int dupTemp$9 = ((ne) this).field_d.o(param2, -1);
                    ((ne) this).field_d.field_fb[dupTemp$9] = ((ne) this).field_d.field_fb[dupTemp$9] + var5;
                    if (((ne) this).field_d.field_fb[((ne) this).field_d.o(param2, -1)] > 1000000000) {
                      ((ne) this).field_d.field_fb[((ne) this).field_d.o(param2, -1)] = 1000000000;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                } else {
                  if (var13 == 8) {
                    L28: {
                      if (var12 == 0) {
                        break L28;
                      } else {
                        ((ne) this).field_d.field_l.a((byte) -119, (tc) (Object) new st(((ne) this).field_c, 1));
                        ((ne) this).field_d.e(14, param1, ((ne) this).field_a, param0);
                        break L28;
                      }
                    }
                    L29: {
                      stackOut_96_0 = ((ne) this).field_d;
                      stackOut_96_1 = param2;
                      stackIn_98_0 = stackOut_96_0;
                      stackIn_98_1 = stackOut_96_1;
                      stackIn_97_0 = stackOut_96_0;
                      stackIn_97_1 = stackOut_96_1;
                      if (var6 == 0) {
                        stackOut_98_0 = (ha) (Object) stackIn_98_0;
                        stackOut_98_1 = stackIn_98_1;
                        stackOut_98_2 = 25;
                        stackIn_99_0 = stackOut_98_0;
                        stackIn_99_1 = stackOut_98_1;
                        stackIn_99_2 = stackOut_98_2;
                        break L29;
                      } else {
                        stackOut_97_0 = (ha) (Object) stackIn_97_0;
                        stackOut_97_1 = stackIn_97_1;
                        stackOut_97_2 = 12;
                        stackIn_99_0 = stackOut_97_0;
                        stackIn_99_1 = stackOut_97_1;
                        stackIn_99_2 = stackOut_97_2;
                        break L29;
                      }
                    }
                    var5 = ((ha) (Object) stackIn_99_0).d(stackIn_99_1, stackIn_99_2, param3 ^ 6);
                    if (var7 != 0) {
                      ((ne) this).field_d.field_l.a((byte) -119, (tc) (Object) new vp(2, var5, param2));
                      break L20;
                    } else {
                      ((ne) this).field_d.field_H[param2] = ((ne) this).field_d.field_H[param2] + var5;
                      int dupTemp$10 = ((ne) this).field_d.o(param2, -1);
                      ((ne) this).field_d.field_fb[dupTemp$10] = ((ne) this).field_d.field_fb[dupTemp$10] + var5;
                      if (((ne) this).field_d.field_fb[((ne) this).field_d.o(param2, -1)] > 1000000000) {
                        ((ne) this).field_d.field_fb[((ne) this).field_d.o(param2, param3 + -1)] = 1000000000;
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                  } else {
                    L30: {
                      if (var13 == 14) {
                        break L30;
                      } else {
                        if (var13 != 9) {
                          break L20;
                        } else {
                          break L30;
                        }
                      }
                    }
                    L31: {
                      if (var12 == 0) {
                        break L31;
                      } else {
                        ((ne) this).field_d.field_l.a((byte) -119, (tc) (Object) new st(((ne) this).field_c, 1));
                        ((ne) this).field_d.e(param3 + 14, param1, ((ne) this).field_a, param0);
                        break L31;
                      }
                    }
                    L32: {
                      stackOut_106_0 = ((ne) this).field_d;
                      stackOut_106_1 = param2;
                      stackIn_108_0 = stackOut_106_0;
                      stackIn_108_1 = stackOut_106_1;
                      stackIn_107_0 = stackOut_106_0;
                      stackIn_107_1 = stackOut_106_1;
                      if (var6 == 0) {
                        stackOut_108_0 = (ha) (Object) stackIn_108_0;
                        stackOut_108_1 = stackIn_108_1;
                        stackOut_108_2 = 75;
                        stackIn_109_0 = stackOut_108_0;
                        stackIn_109_1 = stackOut_108_1;
                        stackIn_109_2 = stackOut_108_2;
                        break L32;
                      } else {
                        stackOut_107_0 = (ha) (Object) stackIn_107_0;
                        stackOut_107_1 = stackIn_107_1;
                        stackOut_107_2 = 37;
                        stackIn_109_0 = stackOut_107_0;
                        stackIn_109_1 = stackOut_107_1;
                        stackIn_109_2 = stackOut_107_2;
                        break L32;
                      }
                    }
                    var5 = ((ha) (Object) stackIn_109_0).d(stackIn_109_1, stackIn_109_2, 6);
                    if (var7 == 0) {
                      ((ne) this).field_d.field_H[param2] = ((ne) this).field_d.field_H[param2] + var5;
                      int dupTemp$11 = ((ne) this).field_d.o(param2, -1);
                      ((ne) this).field_d.field_fb[dupTemp$11] = ((ne) this).field_d.field_fb[dupTemp$11] + var5;
                      if (((ne) this).field_d.field_fb[((ne) this).field_d.o(param2, -1)] > 1000000000) {
                        ((ne) this).field_d.field_fb[((ne) this).field_d.o(param2, -1)] = 1000000000;
                        break L21;
                      } else {
                        break L20;
                      }
                    } else {
                      ((ne) this).field_d.field_l.a((byte) -119, (tc) (Object) new vp(1, var5, param2));
                      break L20;
                    }
                  }
                }
              } else {
                L33: {
                  if (var11 == 0) {
                    break L33;
                  } else {
                    ((ne) this).field_d.field_l.a((byte) -119, (tc) (Object) new nw(((ne) this).field_c, 3, false));
                    break L33;
                  }
                }
                if (var9 == 0) {
                  break L21;
                } else {
                  ((ne) this).field_d.field_l.a((byte) -119, (tc) (Object) new as(((ne) this).field_c, param2, true));
                  break L20;
                }
              }
            }
            break L20;
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
        if (!(((ne) this).field_n.field_b != 255)) {
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
            if (((ne) this).field_h == 11) {
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
                  var2 = dj.field_d[((ne) this).field_h];
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            var2 = jj.field_a[((ne) this).field_h];
            break L0;
          }
        }
        L3: {
          if (((ne) this).e((byte) -120)) {
            var2 = var2 + " " + ce.field_P;
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
        if (((ne) this).field_h != 9) {
            if (14 != ((ne) this).field_h) {
                return 10;
            }
        }
        return 15;
    }

    final void a(byte param0, ha param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              ((ne) this).field_d = param1;
              if (param0 == -68) {
                break L1;
              } else {
                var4 = null;
                ((ne) this).a(-103, (bv) null, (String) null, (byte) 0);
                break L1;
              }
            }
            if (param1 != null) {
              L2: {
                ((ne) this).field_k = new int[((ne) this).field_d.field_tb];
                if (((ne) this).field_c != null) {
                  ((ne) this).field_c.field_l = ((ne) this).field_d;
                  ((ne) this).field_d.a(8288, ((ne) this).field_c);
                  break L2;
                } else {
                  break L2;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("ne.EA(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
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
        te var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        te stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        te stackOut_3_0 = null;
        Object stackOut_1_0 = null;
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
            var2 = new te(param1, (tc) (Object) param1);
            bl.field_h.a((byte) -119, (tc) (Object) var2);
            if (param0 <= -35) {
              ig.field_n.a((hn) (Object) param1);
              stackOut_3_0 = (te) var2;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (te) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2_ref;
            stackOut_5_1 = new StringBuilder().append("ne.Q(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
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
                if (((ne) this).field_h != 2) {
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
        try {
            ((ne) this).a((byte) -68, param1);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ne.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
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
