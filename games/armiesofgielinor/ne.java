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
        te discarded$1 = null;
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        aa var5 = null;
        Object stackIn_6_0 = null;
        java.awt.AWTEvent stackIn_6_1 = null;
        Object stackIn_10_0 = null;
        java.awt.AWTEvent stackIn_10_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        java.awt.AWTEvent stackOut_5_1 = null;
        Object stackOut_9_0 = null;
        Object stackOut_9_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (null != param0.field_j) {
              var3_int = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var3_int >= 50) {
                      break L3;
                    } else {
                      stackOut_5_0 = null;
                      stackOut_5_1 = param0.field_j.peekEvent();
                      stackIn_10_0 = stackOut_5_0;
                      stackIn_10_1 = stackOut_5_1;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      if (var4 != 0) {
                        break L2;
                      } else {
                        if (stackIn_6_0 == stackIn_6_1) {
                          break L3;
                        } else {
                          nu.a(1L, 0);
                          var3_int++;
                          continue L1;
                        }
                      }
                    }
                  }
                  stackOut_9_0 = null;
                  stackOut_9_1 = param1;
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = (java.awt.AWTEvent) ((Object) stackOut_9_1);
                  break L2;
                }
                L4: {
                  if (stackIn_10_0 != stackIn_10_1) {
                    try {
                      L5: {
                        param0.field_j.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param1, 1001, "dummy")));
                        break L5;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L6: {
                        var3 = (Exception) (Object) decompiledCaughtException;
                        break L6;
                      }
                    }
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L7: {
                  if (param2) {
                    break L7;
                  } else {
                    var5 = (aa) null;
                    discarded$1 = ne.a(-21, (aa) null);
                    break L7;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L8: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var3_ref);
            stackOut_18_1 = new StringBuilder().append("ne.T(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L8;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L8;
            }
          }
          L9: {
            stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L9;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L9;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean e(byte param0) {
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        if (param0 >= -114) {
          return false;
        } else {
          L0: {
            L1: {
              if (this.field_n == null) {
                break L1;
              } else {
                if (0 == (4 & this.field_n.field_c)) {
                  break L1;
                } else {
                  stackOut_3_0 = 1;
                  stackIn_5_0 = stackOut_3_0;
                  break L0;
                }
              }
            }
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
          return stackIn_5_0 != 0;
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
            this.field_l = false;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_n == null) {
              break L2;
            } else {
              if (-1 == (this.field_n.field_c & 2 ^ -1)) {
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
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param2.equals("unit")) {
                  break L2;
                } else {
                  L3: {
                    if (param2.equals("own")) {
                      break L3;
                    } else {
                      L4: {
                        if (!param2.equals("type")) {
                          break L4;
                        } else {
                          if (param0 > 0) {
                            this.field_h = (int)tn.a(false, param0, param1);
                            if (var6 == 0) {
                              break L1;
                            } else {
                              break L4;
                            }
                          } else {
                            break L1;
                          }
                        }
                      }
                      if (!param2.equals("mod")) {
                        break L1;
                      } else {
                        if (param0 <= 0) {
                          break L1;
                        } else {
                          this.field_n = ui.a(param1, param0, 80);
                          if (var6 == 0) {
                            break L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  if ((param0 ^ -1) >= -1) {
                    break L1;
                  } else {
                    this.field_a = (int)tn.a(false, param0, param1);
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              if (param0 <= 0) {
                break L1;
              } else {
                this.field_c = a.a(param0, 32, param1);
                break L1;
              }
            }
            L5: {
              if (param3 == 37) {
                break L5;
              } else {
                this.field_c = (jd) null;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var5);
            stackOut_19_1 = new StringBuilder().append("ne.B(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          L7: {
            stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param3 + ')');
        }
    }

    final void a(boolean param0, int param1) {
        L0: {
          if (null == this.field_n) {
            this.field_n = new ca();
            break L0;
          } else {
            break L0;
          }
        }
        if (!param0) {
          return;
        } else {
          this.field_n.field_d = param1;
          return;
        }
    }

    final boolean k(int param0) {
        boolean discarded$2 = false;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 12) {
            break L0;
          } else {
            discarded$2 = this.l(-61);
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_n == null) {
              break L2;
            } else {
              if (-1 == (1 & this.field_n.field_c ^ -1)) {
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
        int dupTemp$6 = 0;
        int dupTemp$7 = 0;
        int dupTemp$8 = 0;
        int dupTemp$9 = 0;
        int dupTemp$10 = 0;
        int dupTemp$11 = 0;
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
        ha stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        ha stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        ha stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int stackIn_34_2 = 0;
        int stackIn_43_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_84_0 = 0;
        ha stackIn_108_0 = null;
        int stackIn_108_1 = 0;
        ha stackIn_109_0 = null;
        int stackIn_109_1 = 0;
        ha stackIn_110_0 = null;
        int stackIn_110_1 = 0;
        int stackIn_110_2 = 0;
        ha stackIn_122_0 = null;
        int stackIn_122_1 = 0;
        ha stackIn_123_0 = null;
        int stackIn_123_1 = 0;
        ha stackIn_124_0 = null;
        int stackIn_124_1 = 0;
        int stackIn_124_2 = 0;
        ha stackIn_133_0 = null;
        int stackIn_133_1 = 0;
        ha stackIn_134_0 = null;
        int stackIn_134_1 = 0;
        ha stackIn_135_0 = null;
        int stackIn_135_1 = 0;
        int stackIn_135_2 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        ha stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        ha stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        ha stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        ha stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        ha stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int stackOut_29_2 = 0;
        ha stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        ha stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        ha stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_33_2 = 0;
        ha stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        int stackOut_32_2 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_76_0 = 0;
        ha stackOut_107_0 = null;
        int stackOut_107_1 = 0;
        ha stackOut_109_0 = null;
        int stackOut_109_1 = 0;
        int stackOut_109_2 = 0;
        ha stackOut_108_0 = null;
        int stackOut_108_1 = 0;
        int stackOut_108_2 = 0;
        ha stackOut_121_0 = null;
        int stackOut_121_1 = 0;
        ha stackOut_123_0 = null;
        int stackOut_123_1 = 0;
        int stackOut_123_2 = 0;
        ha stackOut_122_0 = null;
        int stackOut_122_1 = 0;
        int stackOut_122_2 = 0;
        ha stackOut_132_0 = null;
        int stackOut_132_1 = 0;
        ha stackOut_134_0 = null;
        int stackOut_134_1 = 0;
        int stackOut_134_2 = 0;
        ha stackOut_133_0 = null;
        int stackOut_133_1 = 0;
        int stackOut_133_2 = 0;
        L0: {
          var14 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (this.field_d.field_K == null) {
            break L0;
          } else {
            if (param2 != this.field_a) {
              return;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (this.field_c != null) {
            if (!this.field_d.c(this.field_c.field_O, -16985, param2)) {
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
          if (param3 <= (this.field_a ^ -1)) {
            break L2;
          } else {
            L3: {
              L4: {
                L5: {
                  L6: {
                    var7 = this.field_h;
                    if (7 != var7) {
                      break L6;
                    } else {
                      if (var14 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if ((var7 ^ -1) != -9) {
                      break L7;
                    } else {
                      if (var14 == 0) {
                        break L4;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: {
                    if (var7 != 14) {
                      break L8;
                    } else {
                      if (var14 == 0) {
                        break L3;
                      } else {
                        break L8;
                      }
                    }
                  }
                  if (var7 != 9) {
                    break L2;
                  } else {
                    if (var14 == 0) {
                      break L3;
                    } else {
                      break L5;
                    }
                  }
                }
                L9: {
                  stackOut_23_0 = this.field_d;
                  stackOut_23_1 = param2;
                  stackIn_25_0 = stackOut_23_0;
                  stackIn_25_1 = stackOut_23_1;
                  stackIn_24_0 = stackOut_23_0;
                  stackIn_24_1 = stackOut_23_1;
                  if (var6 != 0) {
                    stackOut_25_0 = (ha) ((Object) stackIn_25_0);
                    stackOut_25_1 = stackIn_25_1;
                    stackOut_25_2 = 25;
                    stackIn_26_0 = stackOut_25_0;
                    stackIn_26_1 = stackOut_25_1;
                    stackIn_26_2 = stackOut_25_2;
                    break L9;
                  } else {
                    stackOut_24_0 = (ha) ((Object) stackIn_24_0);
                    stackOut_24_1 = stackIn_24_1;
                    stackOut_24_2 = 50;
                    stackIn_26_0 = stackOut_24_0;
                    stackIn_26_1 = stackOut_24_1;
                    stackIn_26_2 = stackOut_24_2;
                    break L9;
                  }
                }
                var5 = ((ha) (Object) stackIn_26_0).d(stackIn_26_1, stackIn_26_2, 6);
                dupTemp$6 = this.field_d.o(this.field_a, -1);
                this.field_d.field_S[dupTemp$6] = this.field_d.field_S[dupTemp$6] + 50;
                if (var14 == 0) {
                  break L2;
                } else {
                  break L4;
                }
              }
              L10: {
                stackOut_27_0 = this.field_d;
                stackOut_27_1 = param2;
                stackIn_29_0 = stackOut_27_0;
                stackIn_29_1 = stackOut_27_1;
                stackIn_28_0 = stackOut_27_0;
                stackIn_28_1 = stackOut_27_1;
                if (var6 != 0) {
                  stackOut_29_0 = (ha) ((Object) stackIn_29_0);
                  stackOut_29_1 = stackIn_29_1;
                  stackOut_29_2 = 12;
                  stackIn_30_0 = stackOut_29_0;
                  stackIn_30_1 = stackOut_29_1;
                  stackIn_30_2 = stackOut_29_2;
                  break L10;
                } else {
                  stackOut_28_0 = (ha) ((Object) stackIn_28_0);
                  stackOut_28_1 = stackIn_28_1;
                  stackOut_28_2 = 25;
                  stackIn_30_0 = stackOut_28_0;
                  stackIn_30_1 = stackOut_28_1;
                  stackIn_30_2 = stackOut_28_2;
                  break L10;
                }
              }
              var5 = ((ha) (Object) stackIn_30_0).d(stackIn_30_1, stackIn_30_2, 6);
              dupTemp$7 = this.field_d.o(this.field_a, -1);
              this.field_d.field_S[dupTemp$7] = this.field_d.field_S[dupTemp$7] + 25;
              if (var14 == 0) {
                break L2;
              } else {
                break L3;
              }
            }
            L11: {
              stackOut_31_0 = this.field_d;
              stackOut_31_1 = param2;
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              if (var6 != 0) {
                stackOut_33_0 = (ha) ((Object) stackIn_33_0);
                stackOut_33_1 = stackIn_33_1;
                stackOut_33_2 = 37;
                stackIn_34_0 = stackOut_33_0;
                stackIn_34_1 = stackOut_33_1;
                stackIn_34_2 = stackOut_33_2;
                break L11;
              } else {
                stackOut_32_0 = (ha) ((Object) stackIn_32_0);
                stackOut_32_1 = stackIn_32_1;
                stackOut_32_2 = 75;
                stackIn_34_0 = stackOut_32_0;
                stackIn_34_1 = stackOut_32_1;
                stackIn_34_2 = stackOut_32_2;
                break L11;
              }
            }
            var5 = ((ha) (Object) stackIn_34_0).d(stackIn_34_1, stackIn_34_2, 6);
            dupTemp$8 = this.field_d.o(this.field_a, -1);
            this.field_d.field_S[dupTemp$8] = this.field_d.field_S[dupTemp$8] + 75;
            break L2;
          }
        }
        if (this.field_d.c(this.field_a, -16985, param2)) {
          L12: {
            if (!this.field_d.field_F) {
              if (param2 == this.field_d.field_sb) {
                stackOut_41_0 = 1;
                stackIn_43_0 = stackOut_41_0;
                break L12;
              } else {
                stackOut_40_0 = 0;
                stackIn_43_0 = stackOut_40_0;
                break L12;
              }
            } else {
              stackOut_38_0 = 1;
              stackIn_43_0 = stackOut_38_0;
              break L12;
            }
          }
          L13: {
            var7 = stackIn_43_0;
            if (this.field_c != null) {
              if (this.field_d.c(this.field_c.field_O, -16985, this.field_a)) {
                stackOut_47_0 = 1;
                stackIn_49_0 = stackOut_47_0;
                break L13;
              } else {
                stackOut_46_0 = 0;
                stackIn_49_0 = stackOut_46_0;
                break L13;
              }
            } else {
              stackOut_44_0 = 0;
              stackIn_49_0 = stackOut_44_0;
              break L13;
            }
          }
          L14: {
            var8 = stackIn_49_0;
            if (this.field_c != null) {
              if (var8 != 0) {
                if (this.field_c.field_O != param2) {
                  if (null != this.field_d.field_K) {
                    stackOut_57_0 = 0;
                    stackIn_59_0 = stackOut_57_0;
                    break L14;
                  } else {
                    stackOut_56_0 = 1;
                    stackIn_59_0 = stackOut_56_0;
                    break L14;
                  }
                } else {
                  stackOut_54_0 = 0;
                  stackIn_59_0 = stackOut_54_0;
                  break L14;
                }
              } else {
                stackOut_52_0 = 0;
                stackIn_59_0 = stackOut_52_0;
                break L14;
              }
            } else {
              stackOut_50_0 = 0;
              stackIn_59_0 = stackOut_50_0;
              break L14;
            }
          }
          L15: {
            var9 = stackIn_59_0;
            if (this.field_c != null) {
              if (var8 != 0) {
                if (this.field_c.field_t <= this.field_c.field_Y) {
                  stackOut_65_0 = 0;
                  stackIn_66_0 = stackOut_65_0;
                  break L15;
                } else {
                  stackOut_64_0 = 1;
                  stackIn_66_0 = stackOut_64_0;
                  break L15;
                }
              } else {
                stackOut_62_0 = 0;
                stackIn_66_0 = stackOut_62_0;
                break L15;
              }
            } else {
              stackOut_60_0 = 0;
              stackIn_66_0 = stackOut_60_0;
              break L15;
            }
          }
          L16: {
            var10 = stackIn_66_0;
            if (this.field_c != null) {
              if (var8 == 0) {
                if (this.field_a != -1) {
                  if (this.field_c.i(-21428)) {
                    stackOut_74_0 = 0;
                    stackIn_75_0 = stackOut_74_0;
                    break L16;
                  } else {
                    stackOut_73_0 = 1;
                    stackIn_75_0 = stackOut_73_0;
                    break L16;
                  }
                } else {
                  stackOut_71_0 = 0;
                  stackIn_75_0 = stackOut_71_0;
                  break L16;
                }
              } else {
                stackOut_69_0 = 0;
                stackIn_75_0 = stackOut_69_0;
                break L16;
              }
            } else {
              stackOut_67_0 = 0;
              stackIn_75_0 = stackOut_67_0;
              break L16;
            }
          }
          L17: {
            var11 = stackIn_75_0;
            if (this.field_c != null) {
              if (var8 != 0) {
                if (this.field_c.field_t > this.field_c.field_Y) {
                  if (this.field_c.a(23072)) {
                    stackOut_83_0 = 0;
                    stackIn_84_0 = stackOut_83_0;
                    break L17;
                  } else {
                    stackOut_82_0 = 1;
                    stackIn_84_0 = stackOut_82_0;
                    break L17;
                  }
                } else {
                  stackOut_80_0 = 0;
                  stackIn_84_0 = stackOut_80_0;
                  break L17;
                }
              } else {
                stackOut_78_0 = 0;
                stackIn_84_0 = stackOut_78_0;
                break L17;
              }
            } else {
              stackOut_76_0 = 0;
              stackIn_84_0 = stackOut_76_0;
              break L17;
            }
          }
          L18: {
            L19: {
              L20: {
                L21: {
                  L22: {
                    L23: {
                      var12 = stackIn_84_0;
                      var13 = this.field_h;
                      if ((var13 ^ -1) != -12) {
                        break L23;
                      } else {
                        if (var14 == 0) {
                          break L22;
                        } else {
                          break L23;
                        }
                      }
                    }
                    if (-8 == (var13 ^ -1)) {
                      break L21;
                    } else {
                      if (-9 == (var13 ^ -1)) {
                        break L20;
                      } else {
                        if (var13 == 14) {
                          break L19;
                        } else {
                          if ((var13 ^ -1) != -10) {
                            break L18;
                          } else {
                            if (var14 == 0) {
                              break L19;
                            } else {
                              break L22;
                            }
                          }
                        }
                      }
                    }
                  }
                  L24: {
                    if (var11 == 0) {
                      break L24;
                    } else {
                      this.field_d.field_l.a((byte) -119, (tc) (new nw(this.field_c, 3, false)));
                      break L24;
                    }
                  }
                  if (var9 == 0) {
                    break L18;
                  } else {
                    this.field_d.field_l.a((byte) -119, (tc) (new as(this.field_c, param2, true)));
                    if (var14 == 0) {
                      break L18;
                    } else {
                      break L21;
                    }
                  }
                }
                L25: {
                  if (var10 == 0) {
                    break L25;
                  } else {
                    L26: {
                      this.field_d.field_l.a((byte) -119, (tc) (new st(this.field_c, 1)));
                      if (-1 + this.field_c.field_t <= this.field_c.field_Y) {
                        break L26;
                      } else {
                        this.field_d.field_l.a((byte) -119, (tc) (new st(this.field_c, 1)));
                        break L26;
                      }
                    }
                    this.field_d.e(14, param1, this.field_a, param0);
                    break L25;
                  }
                }
                L27: {
                  if (var11 != 0) {
                    this.field_d.field_l.a((byte) -119, (tc) (new nw(this.field_c, 3, false)));
                    break L27;
                  } else {
                    break L27;
                  }
                }
                L28: {
                  if (var9 == 0) {
                    break L28;
                  } else {
                    this.field_d.field_l.a((byte) -119, (tc) (new as(this.field_c, param2, true)));
                    break L28;
                  }
                }
                L29: {
                  stackOut_107_0 = this.field_d;
                  stackOut_107_1 = param2;
                  stackIn_109_0 = stackOut_107_0;
                  stackIn_109_1 = stackOut_107_1;
                  stackIn_108_0 = stackOut_107_0;
                  stackIn_108_1 = stackOut_107_1;
                  if (var6 == 0) {
                    stackOut_109_0 = (ha) ((Object) stackIn_109_0);
                    stackOut_109_1 = stackIn_109_1;
                    stackOut_109_2 = 50;
                    stackIn_110_0 = stackOut_109_0;
                    stackIn_110_1 = stackOut_109_1;
                    stackIn_110_2 = stackOut_109_2;
                    break L29;
                  } else {
                    stackOut_108_0 = (ha) ((Object) stackIn_108_0);
                    stackOut_108_1 = stackIn_108_1;
                    stackOut_108_2 = 25;
                    stackIn_110_0 = stackOut_108_0;
                    stackIn_110_1 = stackOut_108_1;
                    stackIn_110_2 = stackOut_108_2;
                    break L29;
                  }
                }
                L30: {
                  var5 = ((ha) (Object) stackIn_110_0).d(stackIn_110_1, stackIn_110_2, 6);
                  if (var7 != 0) {
                    break L30;
                  } else {
                    L31: {
                      this.field_d.field_H[param2] = this.field_d.field_H[param2] + var5;
                      if (1000000000 < this.field_d.field_H[param2]) {
                        this.field_d.field_H[param2] = 1000000000;
                        break L31;
                      } else {
                        break L31;
                      }
                    }
                    dupTemp$9 = this.field_d.o(param2, -1);
                    this.field_d.field_fb[dupTemp$9] = this.field_d.field_fb[dupTemp$9] + var5;
                    if (-1000000001 > (this.field_d.field_fb[this.field_d.o(param2, -1)] ^ -1)) {
                      this.field_d.field_fb[this.field_d.o(param2, -1)] = 1000000000;
                      if (var14 == 0) {
                        break L18;
                      } else {
                        break L30;
                      }
                    } else {
                      break L18;
                    }
                  }
                }
                this.field_d.field_l.a((byte) -119, (tc) (new vp(0, var5, param2)));
                if (var14 == 0) {
                  break L18;
                } else {
                  break L20;
                }
              }
              L32: {
                if (var12 == 0) {
                  break L32;
                } else {
                  this.field_d.field_l.a((byte) -119, (tc) (new st(this.field_c, 1)));
                  this.field_d.e(14, param1, this.field_a, param0);
                  break L32;
                }
              }
              L33: {
                stackOut_121_0 = this.field_d;
                stackOut_121_1 = param2;
                stackIn_123_0 = stackOut_121_0;
                stackIn_123_1 = stackOut_121_1;
                stackIn_122_0 = stackOut_121_0;
                stackIn_122_1 = stackOut_121_1;
                if (var6 == 0) {
                  stackOut_123_0 = (ha) ((Object) stackIn_123_0);
                  stackOut_123_1 = stackIn_123_1;
                  stackOut_123_2 = 25;
                  stackIn_124_0 = stackOut_123_0;
                  stackIn_124_1 = stackOut_123_1;
                  stackIn_124_2 = stackOut_123_2;
                  break L33;
                } else {
                  stackOut_122_0 = (ha) ((Object) stackIn_122_0);
                  stackOut_122_1 = stackIn_122_1;
                  stackOut_122_2 = 12;
                  stackIn_124_0 = stackOut_122_0;
                  stackIn_124_1 = stackOut_122_1;
                  stackIn_124_2 = stackOut_122_2;
                  break L33;
                }
              }
              L34: {
                var5 = ((ha) (Object) stackIn_124_0).d(stackIn_124_1, stackIn_124_2, param3 ^ 6);
                if (var7 != 0) {
                  break L34;
                } else {
                  this.field_d.field_H[param2] = this.field_d.field_H[param2] + var5;
                  dupTemp$10 = this.field_d.o(param2, -1);
                  this.field_d.field_fb[dupTemp$10] = this.field_d.field_fb[dupTemp$10] + var5;
                  if (-1000000001 > (this.field_d.field_fb[this.field_d.o(param2, -1)] ^ -1)) {
                    this.field_d.field_fb[this.field_d.o(param2, param3 + -1)] = 1000000000;
                    if (var14 == 0) {
                      break L18;
                    } else {
                      break L34;
                    }
                  } else {
                    break L18;
                  }
                }
              }
              this.field_d.field_l.a((byte) -119, (tc) (new vp(2, var5, param2)));
              if (var14 == 0) {
                break L18;
              } else {
                break L19;
              }
            }
            L35: {
              if (var12 == 0) {
                break L35;
              } else {
                this.field_d.field_l.a((byte) -119, (tc) (new st(this.field_c, 1)));
                this.field_d.e(param3 + 14, param1, this.field_a, param0);
                break L35;
              }
            }
            L36: {
              stackOut_132_0 = this.field_d;
              stackOut_132_1 = param2;
              stackIn_134_0 = stackOut_132_0;
              stackIn_134_1 = stackOut_132_1;
              stackIn_133_0 = stackOut_132_0;
              stackIn_133_1 = stackOut_132_1;
              if (var6 == 0) {
                stackOut_134_0 = (ha) ((Object) stackIn_134_0);
                stackOut_134_1 = stackIn_134_1;
                stackOut_134_2 = 75;
                stackIn_135_0 = stackOut_134_0;
                stackIn_135_1 = stackOut_134_1;
                stackIn_135_2 = stackOut_134_2;
                break L36;
              } else {
                stackOut_133_0 = (ha) ((Object) stackIn_133_0);
                stackOut_133_1 = stackIn_133_1;
                stackOut_133_2 = 37;
                stackIn_135_0 = stackOut_133_0;
                stackIn_135_1 = stackOut_133_1;
                stackIn_135_2 = stackOut_133_2;
                break L36;
              }
            }
            L37: {
              var5 = ((ha) (Object) stackIn_135_0).d(stackIn_135_1, stackIn_135_2, 6);
              if (var7 == 0) {
                break L37;
              } else {
                this.field_d.field_l.a((byte) -119, (tc) (new vp(1, var5, param2)));
                if (var14 == 0) {
                  break L18;
                } else {
                  break L37;
                }
              }
            }
            this.field_d.field_H[param2] = this.field_d.field_H[param2] + var5;
            dupTemp$11 = this.field_d.o(param2, -1);
            this.field_d.field_fb[dupTemp$11] = this.field_d.field_fb[dupTemp$11] + var5;
            if ((this.field_d.field_fb[this.field_d.o(param2, -1)] ^ -1) < -1000000001) {
              this.field_d.field_fb[this.field_d.o(param2, -1)] = 1000000000;
              break L18;
            } else {
              break L18;
            }
          }
          return;
        } else {
          return;
        }
    }

    final int b(byte param0) {
        if (!(this.c((byte) -79))) {
            return -1;
        }
        if (param0 > -19) {
            this.field_m = -105;
        }
        if (!((this.field_n.field_b ^ -1) != -256)) {
            return -1;
        }
        return this.field_n.field_b;
    }

    final boolean d(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 <= -12) {
            break L0;
          } else {
            this.field_g = 34;
            break L0;
          }
        }
        L1: {
          L2: {
            if ((this.field_h ^ -1) == -12) {
              break L2;
            } else {
              if (7 != this.field_h) {
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
            if (this.field_n == null) {
              break L1;
            } else {
              if (this.field_n.field_e == null) {
                break L1;
              } else {
                var2 = this.field_n.field_e;
                if (var3 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          if (jj.field_a.length <= this.field_h) {
            break L0;
          } else {
            L2: {
              L3: {
                if (null == this.field_d) {
                  break L3;
                } else {
                  if (this.field_d.field_hb == 4) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var2 = jj.field_a[this.field_h];
              if (var3 == 0) {
                break L0;
              } else {
                break L2;
              }
            }
            var2 = dj.field_d[this.field_h];
            break L0;
          }
        }
        L4: {
          if (this.e((byte) -120)) {
            var2 = var2 + " " + ce.field_P;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (param0 >= 30) {
            break L5;
          } else {
            this.field_a = -35;
            break L5;
          }
        }
        return var2;
    }

    final boolean a(boolean param0) {
        if (param0) {
            this.field_a = -78;
        }
        return ck.a(this.field_h, -12);
    }

    private ne(int param0) {
        this();
        this.field_h = param0;
        this.field_m = this.e(10);
    }

    final void j(int param0) {
        int var2 = -2 % ((param0 - 5) / 44);
        if (!(this.field_h != 11)) {
            this.field_g = this.field_n.field_g;
        }
    }

    final void a(int param0) {
        L0: {
          if (null != this.field_n) {
            break L0;
          } else {
            this.field_n = new ca();
            break L0;
          }
        }
        if (param0 < 62) {
          return;
        } else {
          this.field_n.field_c = this.field_n.field_c | 8;
          return;
        }
    }

    final int e(int param0) {
        if (param0 == 10) {
          if ((this.field_h ^ -1) != -10) {
            if (14 != this.field_h) {
              return 10;
            } else {
              return 15;
            }
          } else {
            return 15;
          }
        } else {
          return 18;
        }
    }

    final void a(byte param0, ha param1) {
        RuntimeException var3 = null;
        String var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
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
              this.field_d = param1;
              if (param0 == -68) {
                break L1;
              } else {
                var4 = (String) null;
                this.a(-103, (bv) null, (String) null, (byte) 0);
                break L1;
              }
            }
            if (param1 != null) {
              L2: {
                this.field_k = new int[this.field_d.field_tb];
                if (this.field_c != null) {
                  this.field_c.field_l = this.field_d;
                  this.field_d.a(8288, this.field_c);
                  break L2;
                } else {
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("ne.EA(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
            if (null == this.field_n) {
              break L1;
            } else {
              if (0 == (8 & this.field_n.field_c)) {
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
            this.field_c = (jd) null;
        }
        return this.field_m != this.e(10) ? true : false;
    }

    final int a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackOut_7_0 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        var4 = 0;
        if (this.field_k == null) {
          return 0;
        } else {
          L0: {
            var5 = 0;
            if (param0 == 97) {
              break L0;
            } else {
              this.field_b = false;
              break L0;
            }
          }
          L1: while (true) {
            if (this.field_k.length > var5) {
              stackOut_7_0 = param1;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (var6 == 0) {
                L2: {
                  L3: {
                    if (stackIn_9_0 < 0) {
                      break L3;
                    } else {
                      L4: {
                        if (param2 == var5) {
                          break L4;
                        } else {
                          var4 = var4 | 15 & this.field_k[var5];
                          if (var6 == 0) {
                            break L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var4 = var4 | 16 & this.field_k[var5];
                      if (var6 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var4 = var4 | this.field_k[var5];
                  break L2;
                }
                var5++;
                continue L1;
              } else {
                return stackIn_8_0;
              }
            } else {
              return var4;
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
            this.field_j = -3;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_n == null) {
              break L2;
            } else {
              if (0 == (16 & this.field_n.field_c)) {
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
        if (this.field_n == null) {
            this.field_n = new ca();
        }
        if (!param0) {
            field_f = (dn) null;
        }
        this.field_n.field_b = param1;
        this.field_n.field_c = this.field_n.field_c | 16;
    }

    final void d(byte param0) {
        if (param0 < 42) {
            this.a(13, -128, -104, -117);
        }
        this.field_n.field_c = this.field_n.field_c & -2;
    }

    final void i(int param0) {
        if (!(this.field_n != null)) {
            return;
        }
        this.field_n.field_c = this.field_n.field_c & -9;
        if (param0 != 14) {
            this.field_g = 118;
        }
    }

    final static te a(int param0, aa param1) {
        te var2 = null;
        RuntimeException var2_ref = null;
        te stackIn_2_0 = null;
        te stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        te stackOut_3_0 = null;
        te stackOut_1_0 = null;
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
            var2 = new te(param1, param1);
            bl.field_h.a((byte) -119, (tc) (var2));
            if (param0 <= -35) {
              ig.field_n.a(param1);
              stackOut_3_0 = (te) (var2);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (te) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2_ref);
            stackOut_5_1 = new StringBuilder().append("ne.Q(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final boolean b(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        if (param0 != 928) {
          return false;
        } else {
          L0: {
            L1: {
              if (3 == this.field_h) {
                break L1;
              } else {
                if (-3 != (this.field_h ^ -1)) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_4_0 = 1;
            stackIn_6_0 = stackOut_4_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        }
    }

    final int a(byte param0) {
        if (param0 != -107) {
            this.field_j = -71;
        }
        if (this.field_n != null) {
            return this.field_n.field_d;
        }
        return 0;
    }

    final boolean a(int param0, byte param1) {
        if (param1 != 91) {
            this.field_l = true;
        }
        return this.field_d.c(this.field_a, param1 + -17076, param0);
    }

    final void a(int param0, int param1) {
        int var3 = 0;
        L0: {
          L1: {
            var3 = -116 % ((-35 - param0) / 61);
            this.field_m = this.e(10);
            if (this.field_h == 11) {
              break L1;
            } else {
              this.field_a = param1;
              if (!ArmiesOfGielinor.field_M) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (null != this.field_d.field_K) {
              this.field_b = true;
              break L2;
            } else {
              break L2;
            }
          }
          this.field_a = -1;
          this.field_h = 0;
          break L0;
        }
    }

    ne(int param0, ha param1) {
        this(param0);
        try {
            this.a((byte) -68, param1);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ne.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean f(int param0) {
        if (param0 != 19725) {
            this.d((byte) -22);
        }
        return !this.a(false) ? true : false;
    }

    ne() {
        this.field_l = false;
        this.field_b = false;
        this.field_a = -1;
        this.field_m = 10;
        this.field_c = null;
        this.field_g = -1;
        this.field_a = -1;
        this.field_d = null;
        this.field_j = 0;
        this.field_k = null;
    }

    static {
        field_i = -1;
    }
}
