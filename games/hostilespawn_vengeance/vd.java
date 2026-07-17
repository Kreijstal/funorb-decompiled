/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class vd extends ag implements ai {
    static gb field_C;
    vl field_z;
    static bd[][] field_y;
    static int field_D;
    static int[] field_B;
    static int field_A;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        try {
            super.a(param0, param1, param2, param3, param4);
            this.h(93);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "vd.SA(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static int a(int param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_41_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_64_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_40_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_63_0 = 0;
        var3 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var2_int = param1;
            if (var2_int == 1) {
              stackOut_40_0 = 16;
              stackIn_41_0 = stackOut_40_0;
              return stackIn_41_0;
            } else {
              L1: {
                if (var2_int != 225) {
                  break L1;
                } else {
                  if (var3 == 0) {
                    stackOut_42_0 = 16;
                    stackIn_43_0 = stackOut_42_0;
                    return stackIn_43_0;
                  } else {
                    break L1;
                  }
                }
              }
              if (18 == var2_int) {
                stackOut_44_0 = 226;
                stackIn_45_0 = stackOut_44_0;
                return stackIn_45_0;
              } else {
                if (19 == var2_int) {
                  stackOut_46_0 = 228;
                  stackIn_47_0 = stackOut_46_0;
                  return stackIn_47_0;
                } else {
                  L2: {
                    if (var2_int != 27) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        stackOut_48_0 = 229;
                        stackIn_49_0 = stackOut_48_0;
                        return stackIn_49_0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (var2_int == 24) {
                    stackOut_50_0 = 16;
                    stackIn_51_0 = stackOut_50_0;
                    return stackIn_51_0;
                  } else {
                    if (var2_int == 3) {
                      stackOut_52_0 = 17;
                      stackIn_53_0 = stackOut_52_0;
                      return stackIn_53_0;
                    } else {
                      L3: {
                        if (4 != var2_int) {
                          break L3;
                        } else {
                          if (var3 == 0) {
                            stackOut_54_0 = 232;
                            stackIn_55_0 = stackOut_54_0;
                            return stackIn_55_0;
                          } else {
                            break L3;
                          }
                        }
                      }
                      if (8 == var2_int) {
                        stackOut_56_0 = 227;
                        stackIn_57_0 = stackOut_56_0;
                        return stackIn_57_0;
                      } else {
                        if (231 == var2_int) {
                          stackOut_58_0 = 232;
                          stackIn_59_0 = stackOut_58_0;
                          return stackIn_59_0;
                        } else {
                          L4: {
                            if (param0 == 18475) {
                              break L4;
                            } else {
                              vd.a((byte) 105);
                              break L4;
                            }
                          }
                          stackOut_63_0 = -1;
                          stackIn_64_0 = stackOut_63_0;
                          break L0;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2, "vd.LB(" + param0 + 44 + param1 + 41);
        }
        return stackIn_64_0;
    }

    private final void h(int param0) {
        RuntimeException runtimeException = null;
        fl var2 = null;
        ag var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (param0 > 52) {
              var2 = new fl(((vd) this).field_z);
              var3 = (ag) (Object) var2.b(1);
              L1: while (true) {
                L2: {
                  L3: {
                    if (var3 == null) {
                      break L3;
                    } else {
                      var3.c(0);
                      var3 = (ag) (Object) var2.c(0);
                      if (var4 != 0) {
                        break L2;
                      } else {
                        if (var4 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  break L2;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wg.a((Throwable) (Object) runtimeException, "vd.KB(" + param0 + 41);
        }
    }

    final int f(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        fl var3 = null;
        ag var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var2_int = param0;
            var3 = new fl(((vd) this).field_z);
            var4 = (ag) (Object) var3.b(param0 ^ 1);
            L1: while (true) {
              L2: {
                L3: {
                  if (null == var4) {
                    break L3;
                  } else {
                    var5 = var4.f(param0);
                    stackOut_3_0 = ~var2_int;
                    stackIn_12_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 > ~var5) {
                          var2_int = var5;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var4 = (ag) (Object) var3.c(param0);
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_11_0 = var2_int;
                stackIn_12_0 = stackOut_11_0;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2, "vd.MA(" + param0 + 41);
        }
        return stackIn_12_0;
    }

    private final void b(int param0, Hashtable param1, int param2, StringBuilder param3) {
        RuntimeException runtimeException = null;
        fl var5 = null;
        ag var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var5 = new fl(((vd) this).field_z);
              if (param0 == 30726) {
                break L1;
              } else {
                ((vd) this).a(-109, 91, (byte) -124, 115);
                break L1;
              }
            }
            var6 = (ag) (Object) var5.b(1);
            L2: while (true) {
              L3: {
                L4: {
                  if (var6 == null) {
                    break L4;
                  } else {
                    StringBuilder discarded$9 = param3.append(10);
                    if (var8 != 0) {
                      break L3;
                    } else {
                      var7 = 0;
                      L5: while (true) {
                        L6: {
                          L7: {
                            if (~param2 > ~var7) {
                              break L7;
                            } else {
                              StringBuilder discarded$10 = param3.append(32);
                              var7++;
                              if (var8 != 0) {
                                break L6;
                              } else {
                                if (var8 == 0) {
                                  continue L5;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          StringBuilder discarded$11 = var6.a(118, param1, param2 - -1, param3);
                          var6 = (ag) (Object) var5.c(0);
                          break L6;
                        }
                        if (var8 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            runtimeException = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) runtimeException;
            stackOut_16_1 = new StringBuilder().append("vd.MB(").append(param0).append(44);
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L8;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L8;
            }
          }
          L9: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44).append(param2).append(44);
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L9;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L9;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 41);
        }
    }

    final static void a(p param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        oj var5 = null;
        int var6 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param0.field_e != 2) {
                  break L2;
                } else {
                  var2_int = 0;
                  L3: while (true) {
                    if (rc.field_e <= var2_int) {
                      break L2;
                    } else {
                      var3 = 0;
                      var4 = 0;
                      var5 = re.field_n[var2_int];
                      var3 = (int)((-param0.field_l.field_f + ((double)(-param0.field_j.field_e) + ((double)var5.field_j.field_e + var5.field_l.field_f))) * 24.0);
                      var4 = (int)((-param0.field_l.field_a + ((double)(-param0.field_j.field_g) + (var5.field_l.field_a + (double)var5.field_j.field_g))) * 24.0);
                      stackOut_4_0 = -48;
                      stackOut_4_1 = var3;
                      stackIn_54_0 = stackOut_4_0;
                      stackIn_54_1 = stackOut_4_1;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      if (var6 != 0) {
                        break L1;
                      } else {
                        L4: {
                          if (stackIn_5_0 > stackIn_5_1) {
                            break L4;
                          } else {
                            if (48 < var3) {
                              break L4;
                            } else {
                              if (var4 < -48) {
                                break L4;
                              } else {
                                if (var4 >= 48) {
                                  break L4;
                                } else {
                                  if (var5.field_I <= 0) {
                                    break L4;
                                  } else {
                                    L5: {
                                      if (12 > var5.field_i) {
                                        break L5;
                                      } else {
                                        if (var5.field_i >= 18) {
                                          break L5;
                                        } else {
                                          break L4;
                                        }
                                      }
                                    }
                                    L6: {
                                      var5.field_F = 255;
                                      param0.field_e = 3;
                                      if (34 == param0.field_i) {
                                        break L6;
                                      } else {
                                        param0.field_i = 11;
                                        break L6;
                                      }
                                    }
                                    L7: {
                                      if (var5.a(11, -121)) {
                                        var5.field_I = var5.field_I - 6;
                                        break L7;
                                      } else {
                                        break L7;
                                      }
                                    }
                                    L8: {
                                      if (0 > var5.field_I) {
                                        var5.field_I = 0;
                                        break L8;
                                      } else {
                                        break L8;
                                      }
                                    }
                                    L9: {
                                      if (var5.field_I <= 0) {
                                        param0.field_i = 3;
                                        if (!var5.field_b) {
                                          break L9;
                                        } else {
                                          if (var5.field_i == 27) {
                                            break L9;
                                          } else {
                                            al.field_U[4] = al.field_U[4] + 1;
                                            if (al.field_U[4] + 1 != 30) {
                                              break L9;
                                            } else {
                                              ti.a(246, (byte) -12, 9);
                                              break L9;
                                            }
                                          }
                                        }
                                      } else {
                                        break L9;
                                      }
                                    }
                                    nh.a(var5, -29966);
                                    break L4;
                                  }
                                }
                              }
                            }
                          }
                        }
                        var2_int++;
                        if (var6 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              param0.field_e = param0.field_e + 1;
              stackOut_53_0 = -17;
              stackOut_53_1 = ~param0.field_e;
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              break L1;
            }
            L10: {
              if (stackIn_54_0 <= stackIn_54_1) {
                break L10;
              } else {
                param0.field_i = -1;
                break L10;
              }
            }
            L11: {
              if (param1 <= -43) {
                break L11;
              } else {
                field_A = -121;
                break L11;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var2 = decompiledCaughtException;
            stackOut_61_0 = (RuntimeException) var2;
            stackOut_61_1 = new StringBuilder().append("vd.NB(");
            stackIn_64_0 = stackOut_61_0;
            stackIn_64_1 = stackOut_61_1;
            stackIn_62_0 = stackOut_61_0;
            stackIn_62_1 = stackOut_61_1;
            if (param0 == null) {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "null";
              stackIn_65_0 = stackOut_64_0;
              stackIn_65_1 = stackOut_64_1;
              stackIn_65_2 = stackOut_64_2;
              break L12;
            } else {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "{...}";
              stackIn_65_0 = stackOut_62_0;
              stackIn_65_1 = stackOut_62_1;
              stackIn_65_2 = stackOut_62_2;
              break L12;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_65_0, stackIn_65_2 + 44 + param1 + 41);
        }
    }

    final boolean a(byte param0, ag param1) {
        fl var3 = null;
        RuntimeException var3_ref = null;
        ag var4 = null;
        int var5 = 0;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_10_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var3 = new fl(((vd) this).field_z);
            if (param0 <= 0) {
              var4 = (ag) (Object) var3.b(1);
              L1: while (true) {
                L2: {
                  L3: {
                    if (var4 == null) {
                      break L3;
                    } else {
                      stackOut_6_0 = var4.a((byte) -83, param1);
                      stackIn_14_0 = stackOut_6_0 ? 1 : 0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        if (!stackIn_7_0) {
                          var4 = (ag) (Object) var3.c(0);
                          if (var5 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        } else {
                          stackOut_10_0 = 1;
                          stackIn_11_0 = stackOut_10_0;
                          return stackIn_11_0 != 0;
                        }
                      }
                    }
                  }
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  break L2;
                }
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3_ref;
            stackOut_15_1 = new StringBuilder().append("vd.LA(").append(param0).append(44);
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L4;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
        return stackIn_14_0 != 0;
    }

    boolean a(int param0, ag param1, int param2, char param3) {
        fl var5 = null;
        RuntimeException var5_ref = null;
        ag var6_ref_ag = null;
        int var6 = 0;
        int var7 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        boolean stackIn_27_0 = false;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_16_0 = 0;
        int stackOut_19_0 = 0;
        boolean stackOut_26_0 = false;
        boolean stackOut_24_0 = false;
        int stackOut_28_0 = 0;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var7 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var5 = new fl(((vd) this).field_z);
              if (param0 == 274) {
                break L1;
              } else {
                vd.a((byte) -49);
                break L1;
              }
            }
            var6_ref_ag = (ag) (Object) var5.b(param0 + -273);
            L2: while (true) {
              L3: {
                L4: {
                  if (null == var6_ref_ag) {
                    break L4;
                  } else {
                    stackOut_6_0 = var6_ref_ag.a(3000);
                    stackIn_20_0 = stackOut_6_0 ? 1 : 0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var7 != 0) {
                      break L3;
                    } else {
                      if (!stackIn_7_0) {
                        break L4;
                      } else {
                        L5: {
                          if (!var6_ref_ag.g(-9015)) {
                            break L5;
                          } else {
                            if (!var6_ref_ag.a(274, param1, param2, param3)) {
                              break L5;
                            } else {
                              stackOut_16_0 = 1;
                              stackIn_17_0 = stackOut_16_0;
                              return stackIn_17_0 != 0;
                            }
                          }
                        }
                        var6_ref_ag = (ag) (Object) var5.c(0);
                        if (var7 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                stackOut_19_0 = param2;
                stackIn_20_0 = stackOut_19_0;
                break L3;
              }
              var6 = stackIn_20_0;
              if (80 == var6) {
                L6: {
                  if (qh.field_m[81]) {
                    stackOut_26_0 = ((vd) this).a(param1, (byte) -53);
                    stackIn_27_0 = stackOut_26_0;
                    break L6;
                  } else {
                    stackOut_24_0 = ((vd) this).b((byte) 121, param1);
                    stackIn_27_0 = stackOut_24_0;
                    break L6;
                  }
                }
                return stackIn_27_0;
              } else {
                stackOut_28_0 = 0;
                stackIn_29_0 = stackOut_28_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5_ref = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var5_ref;
            stackOut_30_1 = new StringBuilder().append("vd.F(").append(param0).append(44);
            stackIn_33_0 = stackOut_30_0;
            stackIn_33_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L7;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_34_0 = stackOut_31_0;
              stackIn_34_1 = stackOut_31_1;
              stackIn_34_2 = stackOut_31_2;
              break L7;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_29_0 != 0;
    }

    final boolean g(int param0) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == -9015) {
                break L1;
              } else {
                field_y = null;
                break L1;
              }
            }
            L2: {
              if (((vd) this).i(19011) == null) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_7_0 = stackOut_4_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2, "vd.HA(" + param0 + 41);
        }
        return stackIn_7_0 != 0;
    }

    final boolean a(int param0, int param1, int param2, int param3, ag param4, int param5, int param6) {
        fl var8 = null;
        RuntimeException var8_ref = null;
        ag var9 = null;
        int var10 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_18_0 = 0;
        int stackOut_21_0 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var10 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var8 = new fl(((vd) this).field_z);
              if (param3 == 0) {
                break L1;
              } else {
                ((vd) this).a((ag) null, -42, 61, 98);
                break L1;
              }
            }
            var9 = (ag) (Object) var8.b(1);
            L2: while (true) {
              L3: {
                L4: {
                  if (var9 == null) {
                    break L4;
                  } else {
                    stackOut_6_0 = var9.a(param3 + 3000);
                    stackIn_22_0 = stackOut_6_0 ? 1 : 0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var10 != 0) {
                      break L3;
                    } else {
                      if (!stackIn_7_0) {
                        break L4;
                      } else {
                        L5: {
                          if (!var9.g(-9015)) {
                            break L5;
                          } else {
                            if (var9.a(param0, param1, param2, param3, param4, param5, param6)) {
                              stackOut_18_0 = 1;
                              stackIn_19_0 = stackOut_18_0;
                              return stackIn_19_0 != 0;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var9 = (ag) (Object) var8.c(0);
                        if (var10 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                stackOut_21_0 = 0;
                stackIn_22_0 = stackOut_21_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8_ref = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var8_ref;
            stackOut_23_1 = new StringBuilder().append("vd.FA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param4 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L6;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L6;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_22_0 != 0;
    }

    public static void a(byte param0) {
        try {
            field_C = null;
            field_B = null;
            field_y = null;
            if (param0 != 75) {
                vd.a((p) null, 114);
            }
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "vd.HB(" + param0 + 41);
        }
    }

    final boolean b(byte param0, ag param1) {
        fl var3 = null;
        RuntimeException var3_ref = null;
        ag var4 = null;
        int var5 = 0;
        fl var6 = null;
        ag var7 = null;
        int var8 = 0;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_13_0 = false;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        boolean stackOut_12_0 = false;
        int stackOut_17_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (!((vd) this).field_z.e(-20049)) {
              var3 = new fl(((vd) this).field_z);
              var4 = (ag) (Object) var3.b(1);
              var5 = -128 % ((72 - param0) / 39);
              L1: while (true) {
                L2: {
                  L3: {
                    if (null == var4) {
                      break L3;
                    } else {
                      stackOut_6_0 = var4.g(-9015);
                      stackIn_22_0 = stackOut_6_0 ? 1 : 0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var8 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (!stackIn_7_0) {
                            break L4;
                          } else {
                            var6 = new fl(((vd) this).field_z);
                            am discarded$6 = var6.a((am) (Object) var4, false);
                            var7 = (ag) (Object) var6.c(0);
                            L5: while (true) {
                              if (var7 == null) {
                                break L4;
                              } else {
                                stackOut_12_0 = var7.a((byte) -17, param1);
                                stackIn_22_0 = stackOut_12_0 ? 1 : 0;
                                stackIn_13_0 = stackOut_12_0;
                                if (var8 != 0) {
                                  break L2;
                                } else {
                                  if (stackIn_13_0) {
                                    stackOut_17_0 = 1;
                                    stackIn_18_0 = stackOut_17_0;
                                    return stackIn_18_0 != 0;
                                  } else {
                                    var7 = (ag) (Object) var6.c(0);
                                    if (var8 == 0) {
                                      continue L5;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        var4 = (ag) (Object) var3.c(0);
                        if (var8 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_21_0 = 0;
                  stackIn_22_0 = stackOut_21_0;
                  break L2;
                }
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3_ref = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var3_ref;
            stackOut_23_1 = new StringBuilder().append("vd.FB(").append(param0).append(44);
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L6;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L6;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 41);
        }
        return stackIn_22_0 != 0;
    }

    vd(int param0, int param1, int param2, int param3, nn param4) {
        super(param0, param1, param2, param3, param4, (mh) null);
        ((vd) this).field_z = new vl();
    }

    final void c(byte param0) {
        RuntimeException runtimeException = null;
        fl var2 = null;
        int var3 = 0;
        ag var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var2 = new fl(((vd) this).field_z);
            var3 = 115 % ((-27 - param0) / 39);
            var4 = (ag) (Object) var2.b(1);
            L1: while (true) {
              L2: {
                L3: {
                  if (var4 == null) {
                    break L3;
                  } else {
                    var4.c((byte) 109);
                    var4 = (ag) (Object) var2.c(0);
                    if (var5 != 0) {
                      break L2;
                    } else {
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wg.a((Throwable) (Object) runtimeException, "vd.TA(" + param0 + 41);
        }
    }

    void a(ag param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        fl var5 = null;
        ag var6 = null;
        int var7 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var7 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            super.a(param0, param1, param2, param3);
            var5 = new fl(((vd) this).field_z);
            var6 = (ag) (Object) var5.b(1);
            L1: while (true) {
              L2: {
                if (var6 == null) {
                  break L2;
                } else {
                  if (!var6.a(3000)) {
                    break L2;
                  } else {
                    var6.a(param0, ((vd) this).field_m + param1, param2, param3 - -((vd) this).field_v);
                    var6 = (ag) (Object) var5.c(0);
                    if (var7 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) runtimeException;
            stackOut_6_1 = new StringBuilder().append("vd.W(");
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L3;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final boolean a(ag param0, byte param1) {
        fl var3 = null;
        RuntimeException var3_ref = null;
        ag var4 = null;
        int var5 = 0;
        fl var6 = null;
        ag var7 = null;
        int var8 = 0;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_13_0 = false;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        boolean stackOut_12_0 = false;
        int stackOut_16_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (!((vd) this).field_z.e(-20049)) {
              var3 = new fl(((vd) this).field_z);
              var5 = -92 % ((44 - param1) / 47);
              var4 = (ag) (Object) var3.a(0);
              L1: while (true) {
                L2: {
                  L3: {
                    if (null == var4) {
                      break L3;
                    } else {
                      stackOut_6_0 = var4.g(-9015);
                      stackIn_21_0 = stackOut_6_0 ? 1 : 0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var8 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (!stackIn_7_0) {
                            break L4;
                          } else {
                            var6 = new fl(((vd) this).field_z);
                            am discarded$2 = var6.a(-1, (am) (Object) var4);
                            var7 = (ag) (Object) var6.a(false);
                            L5: while (true) {
                              if (null == var7) {
                                break L4;
                              } else {
                                stackOut_12_0 = var7.a((byte) -69, param0);
                                stackIn_21_0 = stackOut_12_0 ? 1 : 0;
                                stackIn_13_0 = stackOut_12_0;
                                if (var8 != 0) {
                                  break L2;
                                } else {
                                  if (!stackIn_13_0) {
                                    var7 = (ag) (Object) var6.a(false);
                                    if (var8 == 0) {
                                      continue L5;
                                    } else {
                                      break L4;
                                    }
                                  } else {
                                    stackOut_16_0 = 1;
                                    stackIn_17_0 = stackOut_16_0;
                                    return stackIn_17_0 != 0;
                                  }
                                }
                              }
                            }
                          }
                        }
                        var4 = (ag) (Object) var3.a(false);
                        if (var8 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_20_0 = 0;
                  stackIn_21_0 = stackOut_20_0;
                  break L2;
                }
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3_ref = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var3_ref;
            stackOut_22_1 = new StringBuilder().append("vd.GB(");
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L6;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + param1 + 41);
        }
        return stackIn_21_0 != 0;
    }

    final void a(int param0, int param1, int param2, int param3, ag param4, int param5) {
        RuntimeException runtimeException = null;
        fl var7 = null;
        ag var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var9 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var7 = new fl(((vd) this).field_z);
              if (param5 == 0) {
                break L1;
              } else {
                StringBuilder discarded$3 = ((vd) this).a(-29, (Hashtable) null, 10, (StringBuilder) null);
                break L1;
              }
            }
            var8 = (ag) (Object) var7.b(1);
            L2: while (true) {
              L3: {
                if (var8 == null) {
                  break L3;
                } else {
                  if (!var8.a(3000)) {
                    break L3;
                  } else {
                    var8.a(param0, param1 - -((vd) this).field_m, ((vd) this).field_v + param2, param3, param4, 0);
                    var8 = (ag) (Object) var7.c(param5);
                    if (var9 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) runtimeException;
            stackOut_9_1 = new StringBuilder().append("vd.GA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param4 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L4;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param5 + 41);
        }
    }

    final String e(int param0) {
        fl var2 = null;
        RuntimeException var2_ref = null;
        ag var3 = null;
        String var4 = null;
        int var5 = 0;
        Object stackIn_7_0 = null;
        String stackIn_13_0 = null;
        Object stackIn_16_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        String stackOut_12_0 = null;
        Object stackOut_15_0 = null;
        var5 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var2 = new fl(((vd) this).field_z);
              if (param0 == 34) {
                break L1;
              } else {
                boolean discarded$2 = ((vd) this).a(13, (ag) null, 126, 'ﾘ');
                break L1;
              }
            }
            var3 = (ag) (Object) var2.b(param0 + -33);
            L2: while (true) {
              L3: {
                L4: {
                  if (var3 == null) {
                    break L4;
                  } else {
                    var4 = var3.e(34);
                    stackOut_6_0 = null;
                    stackIn_16_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var5 != 0) {
                      break L3;
                    } else {
                      if (stackIn_7_0 != (Object) (Object) var4) {
                        stackOut_12_0 = (String) var4;
                        stackIn_13_0 = stackOut_12_0;
                        return stackIn_13_0;
                      } else {
                        var3 = (ag) (Object) var2.c(0);
                        if (var5 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                stackOut_15_0 = null;
                stackIn_16_0 = stackOut_15_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2_ref, "vd.EA(" + param0 + 41);
        }
        return (String) (Object) stackIn_16_0;
    }

    final void a(int param0, ag param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((vd) this).field_z.a((am) (Object) param1, 119);
              if (param0 == 51448) {
                break L1;
              } else {
                ((vd) this).c((byte) -54);
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
            stackOut_3_1 = new StringBuilder().append("vd.JB(").append(param0).append(44);
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    final StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        Object stackIn_5_0 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (!((vd) this).a(param3, param2, false, param1)) {
                break L1;
              } else {
                ((vd) this).a(param2, param1, param3, -107);
                this.b(30726, param1, param2, param3);
                break L1;
              }
            }
            if (param0 >= 73) {
              stackOut_6_0 = (StringBuilder) param3;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (StringBuilder) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("vd.IA(").append(param0).append(44);
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44).append(param2).append(44);
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L3;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_7_0;
    }

    final boolean a(int param0, int param1, int param2, int param3, byte param4, ag param5, int param6) {
        fl var8 = null;
        RuntimeException var8_ref = null;
        ag var9 = null;
        int var10 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_13_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var10 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var8 = new fl(((vd) this).field_z);
              if (param4 == 110) {
                break L1;
              } else {
                field_C = null;
                break L1;
              }
            }
            var9 = (ag) (Object) var8.b(param4 + -109);
            L2: while (true) {
              L3: {
                L4: {
                  if (null == var9) {
                    break L4;
                  } else {
                    stackOut_6_0 = var9.a(3000);
                    stackIn_17_0 = stackOut_6_0 ? 1 : 0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var10 != 0) {
                      break L3;
                    } else {
                      if (!stackIn_7_0) {
                        break L4;
                      } else {
                        if (!var9.a(param0, ((vd) this).field_v + param1, param2 - -((vd) this).field_m, param3, (byte) 110, param5, param6)) {
                          var9 = (ag) (Object) var8.c(0);
                          if (var10 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        } else {
                          stackOut_13_0 = 1;
                          stackIn_14_0 = stackOut_13_0;
                          return stackIn_14_0 != 0;
                        }
                      }
                    }
                  }
                }
                stackOut_16_0 = 0;
                stackIn_17_0 = stackOut_16_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var8_ref;
            stackOut_18_1 = new StringBuilder().append("vd.KA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param5 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L5;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param6 + 41);
        }
        return stackIn_17_0 != 0;
    }

    ag i(int param0) {
        fl var2 = null;
        RuntimeException var2_ref = null;
        ag var3 = null;
        int var4 = 0;
        ag stackIn_8_0 = null;
        Object stackIn_11_0 = null;
        RuntimeException decompiledCaughtException = null;
        ag stackOut_7_0 = null;
        Object stackOut_10_0 = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 19011) {
                break L1;
              } else {
                field_y = null;
                break L1;
              }
            }
            var2 = new fl(((vd) this).field_z);
            var3 = (ag) (Object) var2.b(param0 ^ 19010);
            L2: while (true) {
              L3: {
                if (var3 == null) {
                  break L3;
                } else {
                  if (!var3.g(-9015)) {
                    var3 = (ag) (Object) var2.c(param0 + -19011);
                    if (var4 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  } else {
                    stackOut_7_0 = (ag) var3;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0;
                  }
                }
              }
              stackOut_10_0 = null;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2_ref, "vd.IB(" + param0 + 41);
        }
        return (ag) (Object) stackIn_11_0;
    }

    void a(int param0, int param1, byte param2, int param3) {
        RuntimeException runtimeException = null;
        fl var5 = null;
        ag var6 = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 != 0) {
                break L1;
              } else {
                if (((vd) this).field_h != null) {
                  ((vd) this).field_h.a(param0, param1, 15430, (ag) this, true);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            var5 = new fl(((vd) this).field_z);
            if (param2 > 42) {
              var6 = (ag) (Object) var5.a(0);
              L2: while (true) {
                L3: {
                  L4: {
                    if (var6 == null) {
                      break L4;
                    } else {
                      var6.a(((vd) this).field_m + param0, param1 - -((vd) this).field_v, (byte) 64, param3);
                      var6 = (ag) (Object) var5.a(false);
                      if (var7 != 0) {
                        break L3;
                      } else {
                        if (var7 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  break L3;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wg.a((Throwable) (Object) runtimeException, "vd.C(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = new int[]{0, 50, 101, 151, 201, 251, 302, 352, 402, 452, 503, 553, 603, 653, 704, 754, 804, 854, 905, 955, 1005, 1056, 1106, 1156, 1206, 1257, 1307, 1357, 1407, 1458, 1508, 1558, 1608, 1659, 1709, 1759, 1809, 1860, 1910, 1960, 2010, 2061, 2111, 2161, 2211, 2261, 2312, 2362, 2412, 2462, 2513, 2563, 2613, 2663, 2714, 2764, 2814, 2864, 2914, 2965, 3015, 3065, 3115, 3165, 3216, 3266, 3316, 3366, 3417, 3467, 3517, 3567, 3617, 3667, 3718, 3768, 3818, 3868, 3918, 3969, 4019, 4069, 4119, 4169, 4219, 4270, 4320, 4370, 4420, 4470, 4520, 4570, 4621, 4671, 4721, 4771, 4821, 4871, 4921, 4972, 5022, 5072, 5122, 5172, 5222, 5272, 5322, 5372, 5422, 5473, 5523, 5573, 5623, 5673, 5723, 5773, 5823, 5873, 5923, 5973, 6023, 6073, 6123, 6173, 6224, 6274, 6324, 6374, 6424, 6474, 6524, 6574, 6624, 6674, 6724, 6774, 6824, 6874, 6924, 6974, 7024, 7074, 7124, 7174, 7224, 7273, 7323, 7373, 7423, 7473, 7523, 7573, 7623, 7673, 7723, 7773, 7823, 7873, 7923, 7972, 8022, 8072, 8122, 8172, 8222, 8272, 8322, 8371, 8421, 8471, 8521, 8571, 8621, 8670, 8720, 8770, 8820, 8870, 8919, 8969, 9019, 9069, 9119, 9168, 9218, 9268, 9318, 9367, 9417, 9467, 9517, 9566, 9616, 9666, 9716, 9765, 9815, 9865, 9914, 9964, 10014, 10063, 10113, 10163, 10212, 10262, 10312, 10361, 10411, 10461, 10510, 10560, 10609, 10659, 10709, 10758, 10808, 10857, 10907, 10956, 11006, 11056, 11105, 11155, 11204, 11254, 11303, 11353, 11402, 11452, 11501, 11551, 11600, 11650, 11699, 11749, 11798, 11847, 11897, 11946, 11996, 12045, 12095, 12144, 12193, 12243, 12292, 12341, 12391, 12440, 12490, 12539, 12588, 12638, 12687, 12736, 12785, 12835, 12884, 12933, 12983, 13032, 13081, 13130, 13180, 13229, 13278, 13327, 13376, 13426, 13475, 13524, 13573, 13622, 13672, 13721, 13770, 13819, 13868, 13917, 13966, 14016, 14065, 14114, 14163, 14212, 14261, 14310, 14359, 14408, 14457, 14506, 14555, 14604, 14653, 14702, 14751, 14800, 14849, 14898, 14947, 14996, 15045, 15094, 15143, 15192, 15240, 15289, 15338, 15387, 15436, 15485, 15534, 15582, 15631, 15680, 15729, 15778, 15826, 15875, 15924, 15973, 16021, 16070, 16119, 16168, 16216, 16265, 16314, 16362, 16411, 16460, 16508, 16557, 16606, 16654, 16703, 16751, 16800, 16849, 16897, 16946, 16994, 17043, 17091, 17140, 17188, 17237, 17285, 17334, 17382, 17431, 17479, 17528, 17576, 17625, 17673, 17721, 17770, 17818, 17867, 17915, 17963, 18012, 18060, 18108, 18156, 18205, 18253, 18301, 18350, 18398, 18446, 18494, 18543, 18591, 18639, 18687, 18735, 18783, 18832, 18880, 18928, 18976, 19024, 19072, 19120, 19168, 19216, 19264, 19313, 19361, 19409, 19457, 19505, 19553, 19600, 19648, 19696, 19744, 19792, 19840, 19888, 19936, 19984, 20032, 20080, 20127, 20175, 20223, 20271, 20319, 20366, 20414, 20462, 20510, 20557, 20605, 20653, 20701, 20748, 20796, 20844, 20891, 20939, 20987, 21034, 21082, 21129, 21177, 21224, 21272, 21320, 21367, 21415, 21462, 21510, 21557, 21604, 21652, 21699, 21747, 21794, 21842, 21889, 21936, 21984, 22031, 22078, 22126, 22173, 22220, 22268, 22315, 22362, 22409, 22457, 22504, 22551, 22598, 22645, 22693, 22740, 22787, 22834, 22881, 22928, 22975, 23022, 23069, 23116, 23163, 23210, 23257, 23304, 23351, 23398, 23445, 23492, 23539, 23586, 23633, 23680, 23727, 23774, 23820, 23867, 23914, 23961, 24008, 24054, 24101, 24148, 24195, 24241, 24288, 24335, 24381, 24428, 24475, 24521, 24568, 24614, 24661, 24708, 24754, 24801, 24847, 24894, 24940, 24987, 25033, 25080, 25126, 25172, 25219, 25265, 25312, 25358, 25404, 25451, 25497, 25543, 25589, 25636, 25682, 25728, 25774, 25821, 25867, 25913, 25959, 26005, 26051, 26098, 26144, 26190, 26236, 26282, 26328, 26374, 26420, 26466, 26512, 26558, 26604, 26650, 26696, 26742, 26787, 26833, 26879, 26925, 26971, 27017, 27062, 27108, 27154, 27200, 27245, 27291, 27337, 27382, 27428, 27474, 27519, 27565, 27611, 27656, 27702, 27747, 27793, 27838, 27884, 27929, 27975, 28020, 28066, 28111, 28156, 28202, 28247, 28293, 28338, 28383, 28429, 28474, 28519, 28564, 28610, 28655, 28700, 28745, 28790, 28835, 28881, 28926, 28971, 29016, 29061, 29106, 29151, 29196, 29241, 29286, 29331, 29376, 29421, 29466, 29511, 29555, 29600, 29645, 29690, 29735, 29780, 29824, 29869, 29914, 29959, 30003, 30048, 30093, 30137, 30182, 30226, 30271, 30316, 30360, 30405, 30449, 30494, 30538, 30583, 30627, 30672, 30716, 30760, 30805, 30849, 30893, 30938, 30982, 31026, 31071, 31115, 31159, 31203, 31248, 31292, 31336, 31380, 31424, 31468, 31512, 31556, 31600, 31644, 31688, 31732, 31776, 31820, 31864, 31908, 31952, 31996, 32040, 32084, 32127, 32171, 32215, 32259, 32303, 32346, 32390, 32434, 32477, 32521, 32565, 32608, 32652, 32695, 32739, 32783, 32826, 32870, 32913, 32956, 33000, 33043, 33087, 33130, 33173, 33217, 33260, 33303, 33347, 33390, 33433, 33476, 33520, 33563, 33606, 33649, 33692, 33735, 33778, 33821, 33865, 33908, 33951, 33994, 34037, 34079, 34122, 34165, 34208, 34251, 34294, 34337, 34380, 34422, 34465, 34508, 34551, 34593, 34636, 34679, 34721, 34764, 34806, 34849, 34892, 34934, 34977, 35019, 35062, 35104, 35146, 35189, 35231, 35274, 35316, 35358, 35401, 35443, 35485, 35527, 35570, 35612, 35654, 35696, 35738, 35781, 35823, 35865, 35907, 35949, 35991, 36033, 36075, 36117, 36159, 36201, 36243, 36284, 36326, 36368, 36410, 36452, 36493, 36535, 36577, 36619, 36660, 36702, 36744, 36785, 36827, 36868, 36910, 36951, 36993, 37034, 37076, 37117, 37159, 37200, 37241, 37283, 37324, 37365, 37407, 37448, 37489, 37530, 37572, 37613, 37654, 37695, 37736, 37777, 37818, 37859, 37900, 37941, 37982, 38023, 38064, 38105, 38146, 38187, 38228, 38269, 38309, 38350, 38391, 38432, 38472, 38513, 38554, 38594, 38635, 38675, 38716, 38757, 38797, 38838, 38878, 38919, 38959, 38999, 39040, 39080, 39120, 39161, 39201, 39241, 39282, 39322, 39362, 39402, 39442, 39482, 39523, 39563, 39603, 39643, 39683, 39723, 39763, 39803, 39843, 39882, 39922, 39962, 40002, 40042, 40082, 40121, 40161, 40201, 40241, 40280, 40320, 40359, 40399, 40439, 40478, 40518, 40557, 40597, 40636, 40675, 40715, 40754, 40794, 40833, 40872, 40912, 40951, 40990, 41029, 41068, 41108, 41147, 41186, 41225, 41264, 41303, 41342, 41381, 41420, 41459, 41498, 41537, 41576, 41614, 41653, 41692, 41731, 41770, 41808, 41847, 41886, 41924, 41963, 42002, 42040, 42079, 42117, 42156, 42194, 42233, 42271, 42309, 42348, 42386, 42424, 42463, 42501, 42539, 42578, 42616, 42654, 42692, 42730, 42768, 42806, 42844, 42882, 42920, 42958, 42996, 43034, 43072, 43110, 43148, 43186, 43223, 43261, 43299, 43337, 43374, 43412, 43450, 43487, 43525, 43562, 43600, 43638, 43675, 43713, 43750, 43787, 43825, 43862, 43899, 43937, 43974, 44011, 44049, 44086, 44123, 44160, 44197, 44234, 44271, 44308, 44345, 44382, 44419, 44456, 44493, 44530, 44567, 44604, 44641, 44677, 44714, 44751, 44788, 44824, 44861, 44898, 44934, 44971, 45007, 45044, 45080, 45117, 45153, 45190, 45226, 45262, 45299, 45335, 45371, 45408, 45444, 45480, 45516, 45552, 45589, 45625, 45661, 45697, 45733, 45769, 45805, 45841, 45877, 45912, 45948, 45984, 46020, 46056, 46091, 46127, 46163, 46199, 46234, 46270, 46305, 46341, 46376, 46412, 46447, 46483, 46518, 46554, 46589, 46624, 46660, 46695, 46730, 46765, 46801, 46836, 46871, 46906, 46941, 46976, 47011, 47046, 47081, 47116, 47151, 47186, 47221, 47256, 47291, 47325, 47360, 47395, 47430, 47464, 47499, 47534, 47568, 47603, 47637, 47672, 47706, 47741, 47775, 47809, 47844, 47878, 47912, 47947, 47981, 48015, 48049, 48084, 48118, 48152, 48186, 48220, 48254, 48288, 48322, 48356, 48390, 48424, 48458, 48491, 48525, 48559, 48593, 48626, 48660, 48694, 48727, 48761, 48795, 48828, 48862, 48895, 48929, 48962, 48995, 49029, 49062, 49095, 49129, 49162, 49195, 49228, 49262, 49295, 49328, 49361, 49394, 49427, 49460, 49493, 49526, 49559, 49592, 49624, 49657, 49690, 49723, 49756, 49788, 49821, 49854, 49886, 49919, 49951, 49984, 50016, 50049, 50081, 50114, 50146, 50178, 50211, 50243, 50275, 50307, 50340, 50372, 50404, 50436, 50468, 50500, 50532, 50564, 50596, 50628, 50660, 50692, 50724, 50756, 50787, 50819, 50851, 50882, 50914, 50946, 50977, 51009, 51041, 51072, 51104, 51135, 51166, 51198, 51229, 51260, 51292, 51323, 51354, 51386, 51417, 51448, 51479, 51510, 51541, 51572, 51603, 51634, 51665, 51696, 51727, 51758, 51789, 51819, 51850, 51881, 51911, 51942, 51973, 52003, 52034, 52065, 52095, 52126, 52156, 52186, 52217, 52247, 52277, 52308, 52338, 52368, 52398, 52429, 52459, 52489, 52519, 52549, 52579, 52609, 52639, 52669, 52699, 52729, 52759, 52788, 52818, 52848, 52878, 52907, 52937, 52967, 52996, 53026, 53055, 53085, 53114, 53144, 53173, 53202, 53232, 53261, 53290, 53319, 53349, 53378, 53407, 53436, 53465, 53494, 53523, 53552, 53581, 53610, 53639, 53668, 53697, 53726, 53754, 53783, 53812, 53840, 53869, 53898, 53926, 53955, 53983, 54012, 54040, 54069, 54097, 54125, 54154, 54182, 54210, 54239, 54267, 54295, 54323, 54351, 54379, 54407, 54435, 54463, 54491, 54519, 54547, 54575, 54603, 54630, 54658, 54686, 54714, 54741, 54769, 54796, 54824, 54852, 54879, 54906, 54934, 54961, 54989, 55016, 55043, 55071, 55098, 55125, 55152, 55179, 55206, 55233, 55260, 55288, 55314, 55341, 55368, 55395, 55422, 55449, 55476, 55502, 55529, 55556, 55582, 55609, 55636, 55662, 55689, 55715, 55742, 55768, 55794, 55821, 55847, 55873, 55900, 55926, 55952, 55978, 56004, 56030, 56056, 56082, 56108, 56134, 56160, 56186, 56212, 56238, 56264, 56289, 56315, 56341, 56367, 56392, 56418, 56443, 56469, 56494, 56520, 56545, 56571, 56596, 56621, 56647, 56672, 56697, 56722, 56747, 56773, 56798, 56823, 56848, 56873, 56898, 56923, 56948, 56972, 56997, 57022, 57047, 57072, 57096, 57121, 57145, 57170, 57195, 57219, 57244, 57268, 57293, 57317, 57341, 57366, 57390, 57414, 57438, 57463, 57487, 57511, 57535, 57559, 57583, 57607, 57631, 57655, 57679, 57703, 57726, 57750, 57774, 57798, 57821, 57845, 57869, 57892, 57916, 57939, 57963, 57986, 58009, 58033, 58056, 58079, 58103, 58126, 58149, 58172, 58195, 58219, 58242, 58265, 58288, 58311, 58334, 58356, 58379, 58402, 58425, 58448, 58470, 58493, 58516, 58538, 58561, 58583, 58606, 58628, 58651, 58673, 58696, 58718, 58740, 58763, 58785, 58807, 58829, 58851, 58873, 58896, 58918, 58940, 58962, 58983, 59005, 59027, 59049, 59071, 59093, 59114, 59136, 59158, 59179, 59201, 59222, 59244, 59265, 59287, 59308, 59330, 59351, 59372, 59393, 59415, 59436, 59457, 59478, 59499, 59520, 59541, 59562, 59583, 59604, 59625, 59646, 59667, 59687, 59708, 59729, 59750, 59770, 59791, 59811, 59832, 59852, 59873, 59893, 59914, 59934, 59954, 59975, 59995, 60015, 60035, 60055, 60075, 60096, 60116, 60136, 60156, 60175, 60195, 60215, 60235, 60255, 60275, 60294, 60314, 60334, 60353, 60373, 60392, 60412, 60431, 60451, 60470, 60490, 60509, 60528, 60547, 60567, 60586, 60605, 60624, 60643, 60662, 60681, 60700, 60719, 60738, 60757, 60776, 60794, 60813, 60832, 60851, 60869, 60888, 60906, 60925, 60943, 60962, 60980, 60999, 61017, 61035, 61054, 61072, 61090, 61108, 61127, 61145, 61163, 61181, 61199, 61217, 61235, 61253, 61270, 61288, 61306, 61324, 61341, 61359, 61377, 61394, 61412, 61429, 61447, 61464, 61482, 61499, 61517, 61534, 61551, 61568, 61586, 61603, 61620, 61637, 61654, 61671, 61688, 61705, 61722, 61739, 61756, 61772, 61789, 61806, 61823, 61839, 61856, 61873, 61889, 61906, 61922, 61939, 61955, 61971, 61988, 62004, 62020, 62036, 62053, 62069, 62085, 62101, 62117, 62133, 62149, 62165, 62181, 62197, 62212, 62228, 62244, 62260, 62275, 62291, 62307, 62322, 62338, 62353, 62369, 62384, 62400, 62415, 62430, 62445, 62461, 62476, 62491, 62506, 62521, 62536, 62551, 62566, 62581, 62596, 62611, 62626, 62641, 62655, 62670, 62685, 62699, 62714, 62729, 62743, 62758, 62772, 62787, 62801, 62815, 62830, 62844, 62858, 62872, 62886, 62901, 62915, 62929, 62943, 62957, 62971, 62985, 62998, 63012, 63026, 63040, 63054, 63067, 63081, 63095, 63108, 63122, 63135, 63149, 63162, 63175, 63189, 63202, 63215, 63229, 63242, 63255, 63268, 63281, 63294, 63307, 63320, 63333, 63346, 63359, 63372, 63385, 63397, 63410, 63423, 63435, 63448, 63461, 63473, 63486, 63498, 63510, 63523, 63535, 63547, 63560, 63572, 63584, 63596, 63608, 63621, 63633, 63645, 63657, 63668, 63680, 63692, 63704, 63716, 63728, 63739, 63751, 63763, 63774, 63786, 63797, 63809, 63820, 63832, 63843, 63854, 63866, 63877, 63888, 63899, 63910, 63922, 63933, 63944, 63955, 63966, 63976, 63987, 63998, 64009, 64020, 64031, 64041, 64052, 64062, 64073, 64084, 64094, 64105, 64115, 64125, 64136, 64146, 64156, 64167, 64177, 64187, 64197, 64207, 64217, 64227, 64237, 64247, 64257, 64267, 64277, 64287, 64296, 64306, 64316, 64325, 64335, 64344, 64354, 64363, 64373, 64382, 64392, 64401, 64410, 64420, 64429, 64438, 64447, 64456, 64465, 64474, 64483, 64492, 64501, 64510, 64519, 64528, 64536, 64545, 64554, 64563, 64571, 64580, 64588, 64597, 64605, 64614, 64622, 64630, 64639, 64647, 64655, 64663, 64672, 64680, 64688, 64696, 64704, 64712, 64720, 64728, 64735, 64743, 64751, 64759, 64766, 64774, 64782, 64789, 64797, 64804, 64812, 64819, 64827, 64834, 64841, 64849, 64856, 64863, 64870, 64877, 64884, 64892, 64899, 64905, 64912, 64919, 64926, 64933, 64940, 64947, 64953, 64960, 64967, 64973, 64980, 64986, 64993, 64999, 65006, 65012, 65018, 65025, 65031, 65037, 65043, 65049, 65055, 65061, 65067, 65073, 65079, 65085, 65091, 65097, 65103, 65109, 65114, 65120, 65126, 65131, 65137, 65142, 65148, 65153, 65159, 65164, 65169, 65175, 65180, 65185, 65190, 65195, 65200, 65205, 65210, 65215, 65220, 65225, 65230, 65235, 65240, 65245, 65249, 65254, 65259, 65263, 65268, 65272, 65277, 65281, 65286, 65290, 65294, 65299, 65303, 65307, 65311, 65315, 65320, 65324, 65328, 65332, 65336, 65339, 65343, 65347, 65351, 65355, 65358, 65362, 65366, 65369, 65373, 65376, 65380, 65383, 65387, 65390, 65393, 65397, 65400, 65403, 65406, 65410, 65413, 65416, 65419, 65422, 65425, 65428, 65430, 65433, 65436, 65439, 65442, 65444, 65447, 65449, 65452, 65455, 65457, 65460, 65462, 65464, 65467, 65469, 65471, 65473, 65476, 65478, 65480, 65482, 65484, 65486, 65488, 65490, 65492, 65493, 65495, 65497, 65499, 65500, 65502, 65504, 65505, 65507, 65508, 65510, 65511, 65512, 65514, 65515, 65516, 65517, 65519, 65520, 65521, 65522, 65523, 65524, 65525, 65526, 65527, 65527, 65528, 65529, 65530, 65530, 65531, 65532, 65532, 65533, 65533, 65534, 65534, 65534, 65535, 65535, 65535, 65536, 65536, 65536, 65536, 65536, 65536};
        field_D = 20;
    }
}
