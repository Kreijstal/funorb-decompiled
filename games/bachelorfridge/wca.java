/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wca {
    String field_f;
    private int field_m;
    private int field_i;
    private int field_j;
    kga field_g;
    private int field_d;
    String field_a;
    static int field_n;
    int field_b;
    int[] field_c;
    String field_h;
    int field_e;
    int[] field_l;
    si field_k;

    final int a(pd param0, int param1, boolean[] param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_11_0 = 0;
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
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            var4_int = param1;
            L1: while (true) {
              if (this.field_c.length <= var4_int) {
                stackOut_17_0 = -1;
                stackIn_18_0 = stackOut_17_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                L2: {
                  if (var4_int == 1) {
                    break L2;
                  } else {
                    if (-5 == (var4_int ^ -1)) {
                      break L2;
                    } else {
                      if (var4_int == 7) {
                        break L2;
                      } else {
                        if (10 == var4_int) {
                          break L2;
                        } else {
                          if (param2[var4_int]) {
                            break L2;
                          } else {
                            if (fw.field_h[this.field_c[var4_int]].equals(param0)) {
                              var5 = (var4_int - -2) / 3;
                              if (0 != var5) {
                                if (!param2[var5 * 3 - 2]) {
                                  break L2;
                                } else {
                                  stackOut_14_0 = var4_int;
                                  stackIn_15_0 = stackOut_14_0;
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                }
                              } else {
                                stackOut_11_0 = var4_int;
                                stackIn_12_0 = stackOut_11_0;
                                decompiledRegionSelector0 = 0;
                                break L0;
                              }
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var4);
            stackOut_19_1 = new StringBuilder().append("wca.A(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L3;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L3;
            }
          }
          L4: {
            stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param1).append(',');
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
              break L4;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_12_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0;
          } else {
            return stackIn_18_0;
          }
        }
    }

    final int a(int param0, pd param1, boolean[] param2) {
        int discarded$1 = 0;
        RuntimeException var4 = null;
        boolean[] var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_40_0 = 0;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        try {
          L0: {
            L1: {
              if ((this.field_k.field_b ^ -1) != -8) {
                if ((this.field_k.field_b ^ -1) == -7) {
                  L2: {
                    if (gma.field_e[this.field_j].field_b != gfa.field_a[param1.field_a].field_k.field_b) {
                      break L2;
                    } else {
                      if (param2[1]) {
                        break L2;
                      } else {
                        stackOut_22_0 = 0;
                        stackIn_23_0 = stackOut_22_0;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      }
                    }
                  }
                  if (!fw.field_h[this.field_m].equals(param1)) {
                    break L1;
                  } else {
                    if (param2[4]) {
                      break L1;
                    } else {
                      stackOut_26_0 = 1;
                      stackIn_27_0 = stackOut_26_0;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    }
                  }
                } else {
                  L3: {
                    if (gfa.field_a[param1.field_a].field_k.field_b != gma.field_e[this.field_j].field_b) {
                      break L3;
                    } else {
                      if (!param2[1]) {
                        stackOut_18_0 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (gfa.field_a[param1.field_a].field_k.field_b != gma.field_e[this.field_m].field_b) {
                    break L1;
                  } else {
                    if (!param2[4]) {
                      stackOut_16_0 = 1;
                      stackIn_17_0 = stackOut_16_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              } else {
                L4: {
                  if (!fw.field_h[this.field_j].equals(param1)) {
                    break L4;
                  } else {
                    if (param2[1]) {
                      break L4;
                    } else {
                      stackOut_3_0 = 0;
                      stackIn_4_0 = stackOut_3_0;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
                if (!fw.field_h[this.field_m].equals(param1)) {
                  break L1;
                } else {
                  if (param2[4]) {
                    break L1;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_8_0 = stackOut_7_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
            L5: {
              if (!fw.field_h[this.field_i].equals(param1)) {
                break L5;
              } else {
                if (!param2[7]) {
                  stackOut_36_0 = 2;
                  stackIn_37_0 = stackOut_36_0;
                  decompiledRegionSelector0 = 7;
                  break L0;
                } else {
                  break L5;
                }
              }
            }
            L6: {
              if (!fw.field_h[this.field_d].equals(param1)) {
                break L6;
              } else {
                if (!param2[10]) {
                  stackOut_34_0 = 3;
                  stackIn_35_0 = stackOut_34_0;
                  decompiledRegionSelector0 = 6;
                  break L0;
                } else {
                  break L6;
                }
              }
            }
            L7: {
              if (param0 >= 2) {
                break L7;
              } else {
                var5 = (boolean[]) null;
                discarded$1 = this.a(-53, (pd) null, (boolean[]) null);
                break L7;
              }
            }
            stackOut_40_0 = -1;
            stackIn_41_0 = stackOut_40_0;
            decompiledRegionSelector0 = 8;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) (var4);
            stackOut_42_1 = new StringBuilder().append("wca.D(").append(param0).append(',');
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param1 == null) {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L8;
            } else {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L8;
            }
          }
          L9: {
            stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
            stackOut_45_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(',');
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param2 == null) {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L9;
            } else {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L9;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_48_0), stackIn_48_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_17_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_23_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_27_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_35_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_37_0;
                      } else {
                        return stackIn_41_0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        oha var10 = null;
        oha var11 = null;
        if (param4 < 61) {
          wca.a((byte) 117);
          var11 = al.a(-72, param3);
          var6 = var11.field_h;
          var7 = var11.field_a;
          var8 = var11.field_l;
          if (param0) {
            L0: {
              hh.field_b[var6].e(5 + param2, param1 + 5);
              if (1 == var8) {
                break L0;
              } else {
                if (2 == var8) {
                  break L0;
                } else {
                  if (3 == var8) {
                    break L0;
                  } else {
                    L1: {
                      L2: {
                        if (1 == var7) {
                          break L2;
                        } else {
                          if (var7 != 2) {
                            break L1;
                          } else {
                            if (!hl.a((byte) 104, var11.field_j)) {
                              break L1;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                      L3: {
                        if (-2 < (var8 ^ -1)) {
                          break L3;
                        } else {
                          us.field_c.a(param2 + 11, param1);
                          break L3;
                        }
                      }
                      L4: {
                        if ((var8 ^ -1) <= -3) {
                          us.field_c.a(18 + param2, 3 + param1);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      if (-4 >= (var8 ^ -1)) {
                        us.field_c.a(21 + param2, 10 + param1);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    return;
                  }
                }
              }
            }
            if (1 == var7) {
              if (-2 < (var8 ^ -1)) {
                L5: {
                  if ((var8 ^ -1) <= -3) {
                    us.field_c.a(18 + param2, 3 + param1);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if (-4 >= (var8 ^ -1)) {
                  us.field_c.a(21 + param2, 10 + param1);
                  return;
                } else {
                  return;
                }
              } else {
                L6: {
                  us.field_c.a(param2 + 11, param1);
                  if ((var8 ^ -1) <= -3) {
                    us.field_c.a(18 + param2, 3 + param1);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (-4 >= (var8 ^ -1)) {
                    us.field_c.a(21 + param2, 10 + param1);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                return;
              }
            } else {
              if (var7 == 2) {
                if (hl.a((byte) 104, var11.field_j)) {
                  L8: {
                    if (-2 < (var8 ^ -1)) {
                      break L8;
                    } else {
                      us.field_c.a(param2 + 11, param1);
                      break L8;
                    }
                  }
                  L9: {
                    if ((var8 ^ -1) <= -3) {
                      us.field_c.a(18 + param2, 3 + param1);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (-4 >= (var8 ^ -1)) {
                      us.field_c.a(21 + param2, 10 + param1);
                      break L10;
                    } else {
                      break L10;
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
            hh.field_b[var6].a(5 + param2, param1 + 5, 128);
            if (1 != var8) {
              L11: {
                if (2 == var8) {
                  break L11;
                } else {
                  if (3 == var8) {
                    break L11;
                  } else {
                    break L11;
                  }
                }
              }
              L12: {
                L13: {
                  if (1 == var7) {
                    break L13;
                  } else {
                    if (var7 != 2) {
                      break L12;
                    } else {
                      if (!hl.a((byte) 104, var11.field_j)) {
                        break L12;
                      } else {
                        break L13;
                      }
                    }
                  }
                }
                L14: {
                  if (-2 < (var8 ^ -1)) {
                    break L14;
                  } else {
                    us.field_c.a(param2 + 11, param1);
                    break L14;
                  }
                }
                L15: {
                  if ((var8 ^ -1) <= -3) {
                    us.field_c.a(18 + param2, 3 + param1);
                    break L15;
                  } else {
                    break L15;
                  }
                }
                if (-4 >= (var8 ^ -1)) {
                  us.field_c.a(21 + param2, 10 + param1);
                  break L12;
                } else {
                  break L12;
                }
              }
              return;
            } else {
              L16: {
                L17: {
                  if (1 == var7) {
                    break L17;
                  } else {
                    if (var7 != 2) {
                      break L16;
                    } else {
                      if (!hl.a((byte) 104, var11.field_j)) {
                        break L16;
                      } else {
                        break L17;
                      }
                    }
                  }
                }
                L18: {
                  if (-2 < (var8 ^ -1)) {
                    break L18;
                  } else {
                    us.field_c.a(param2 + 11, param1);
                    break L18;
                  }
                }
                L19: {
                  if ((var8 ^ -1) <= -3) {
                    us.field_c.a(18 + param2, 3 + param1);
                    break L19;
                  } else {
                    break L19;
                  }
                }
                if (-4 >= (var8 ^ -1)) {
                  us.field_c.a(21 + param2, 10 + param1);
                  break L16;
                } else {
                  break L16;
                }
              }
              return;
            }
          }
        } else {
          var10 = al.a(-72, param3);
          var6 = var10.field_h;
          var7 = var10.field_a;
          var8 = var10.field_l;
          if (param0) {
            L20: {
              hh.field_b[var6].e(5 + param2, param1 + 5);
              if (1 == var8) {
                break L20;
              } else {
                if (2 == var8) {
                  break L20;
                } else {
                  if (3 == var8) {
                    break L20;
                  } else {
                    break L20;
                  }
                }
              }
            }
            L21: {
              L22: {
                if (1 == var7) {
                  break L22;
                } else {
                  if (var7 != 2) {
                    break L21;
                  } else {
                    if (!hl.a((byte) 104, var10.field_j)) {
                      break L21;
                    } else {
                      break L22;
                    }
                  }
                }
              }
              L23: {
                if (-2 < (var8 ^ -1)) {
                  break L23;
                } else {
                  us.field_c.a(param2 + 11, param1);
                  break L23;
                }
              }
              L24: {
                if ((var8 ^ -1) <= -3) {
                  us.field_c.a(18 + param2, 3 + param1);
                  break L24;
                } else {
                  break L24;
                }
              }
              if (-4 >= (var8 ^ -1)) {
                us.field_c.a(21 + param2, 10 + param1);
                break L21;
              } else {
                break L21;
              }
            }
            return;
          } else {
            L25: {
              hh.field_b[var6].a(5 + param2, param1 + 5, 128);
              if (1 == var8) {
                break L25;
              } else {
                if (2 == var8) {
                  break L25;
                } else {
                  if (3 == var8) {
                    break L25;
                  } else {
                    break L25;
                  }
                }
              }
            }
            L26: {
              L27: {
                if (1 == var7) {
                  break L27;
                } else {
                  if (var7 != 2) {
                    break L26;
                  } else {
                    if (!hl.a((byte) 104, var10.field_j)) {
                      break L26;
                    } else {
                      break L27;
                    }
                  }
                }
              }
              L28: {
                if (-2 < (var8 ^ -1)) {
                  break L28;
                } else {
                  us.field_c.a(param2 + 11, param1);
                  break L28;
                }
              }
              L29: {
                if ((var8 ^ -1) <= -3) {
                  us.field_c.a(18 + param2, 3 + param1);
                  break L29;
                } else {
                  break L29;
                }
              }
              if (-4 >= (var8 ^ -1)) {
                us.field_c.a(21 + param2, 10 + param1);
                break L26;
              } else {
                break L26;
              }
            }
            return;
          }
        }
    }

    public final boolean equals(Object param0) {
        wca var2 = null;
        RuntimeException var2_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (this != param0) {
              if (param0 == null) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (this.getClass() == param0.getClass()) {
                  var2 = (wca) (param0);
                  if (this.field_b != var2.field_b) {
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    return true;
                  }
                } else {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var2_ref);
            stackOut_14_1 = new StringBuilder().append("wca.equals(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L1;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L1;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0 != 0;
            } else {
              return stackIn_13_0 != 0;
            }
          }
        }
    }

    public final int hashCode() {
        int var1 = 1;
        var1 = this.field_b + 31 * var1;
        return var1;
    }

    final static void a(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param0 <= -59) {
                break L1;
              } else {
                wca.a((byte) 26);
                break L1;
              }
            }
            dl.field_h = new js(16);
            var1_int = 0;
            L2: while (true) {
              if (var1_int >= ol.field_l.length) {
                break L0;
              } else {
                dl.field_h.a((long)ol.field_l[var1_int].hashCode(), (byte) -55, new ji(var1_int));
                var1_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1), "wca.C(" + param0 + ')');
        }
    }

    wca(int param0, String param1, String param2, int[] param3, int[] param4, int param5, kga param6, String param7) {
        Random discarded$1 = null;
        RuntimeException var9 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            this.field_f = param1;
            this.field_h = param2;
            this.field_g = param6;
            this.field_b = param0;
            this.field_a = param7;
            this.field_k = fw.field_h[this.field_b].field_g;
            discarded$1 = new Random((long)param0);
            this.field_c = param4;
            this.field_e = param5;
            this.field_j = this.field_c[1];
            this.field_l = param3;
            this.field_m = this.field_c[4];
            this.field_d = this.field_c[10];
            this.field_i = this.field_c[7];
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var9);
            stackOut_3_1 = new StringBuilder().append("wca.<init>(").append(param0).append(',');
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
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param5).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param6 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param7 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
    }

    static {
    }
}
