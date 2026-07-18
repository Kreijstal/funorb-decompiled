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
              if (((wca) this).field_c.length <= var4_int) {
                stackOut_17_0 = -1;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              } else {
                L2: {
                  if (var4_int == 1) {
                    break L2;
                  } else {
                    if (var4_int == 4) {
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
                            if (((Object) (Object) fw.field_h[((wca) this).field_c[var4_int]]).equals((Object) (Object) param0)) {
                              var5 = (var4_int - -2) / 3;
                              if (0 != var5) {
                                if (!param2[var5 * 3 - 2]) {
                                  break L2;
                                } else {
                                  stackOut_14_0 = var4_int;
                                  stackIn_15_0 = stackOut_14_0;
                                  return stackIn_15_0;
                                }
                              } else {
                                stackOut_11_0 = var4_int;
                                stackIn_12_0 = stackOut_11_0;
                                return stackIn_12_0;
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
            stackOut_19_0 = (RuntimeException) var4;
            stackOut_19_1 = new StringBuilder().append("wca.A(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L3;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L3;
            }
          }
          L4: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param1).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L4;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L4;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
        }
        return stackIn_18_0;
    }

    final int a(int param0, pd param1, boolean[] param2) {
        RuntimeException var4 = null;
        Object var5 = null;
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
              if (((wca) this).field_k.field_b != 7) {
                if (((wca) this).field_k.field_b == 6) {
                  L2: {
                    if (gma.field_e[((wca) this).field_j].field_b != gfa.field_a[param1.field_a].field_k.field_b) {
                      break L2;
                    } else {
                      if (param2[1]) {
                        break L2;
                      } else {
                        stackOut_22_0 = 0;
                        stackIn_23_0 = stackOut_22_0;
                        return stackIn_23_0;
                      }
                    }
                  }
                  if (!((Object) (Object) fw.field_h[((wca) this).field_m]).equals((Object) (Object) param1)) {
                    break L1;
                  } else {
                    if (param2[4]) {
                      break L1;
                    } else {
                      stackOut_26_0 = 1;
                      stackIn_27_0 = stackOut_26_0;
                      return stackIn_27_0;
                    }
                  }
                } else {
                  L3: {
                    if (gfa.field_a[param1.field_a].field_k.field_b != gma.field_e[((wca) this).field_j].field_b) {
                      break L3;
                    } else {
                      if (!param2[1]) {
                        stackOut_18_0 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        return stackIn_19_0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (gfa.field_a[param1.field_a].field_k.field_b != gma.field_e[((wca) this).field_m].field_b) {
                    break L1;
                  } else {
                    if (!param2[4]) {
                      stackOut_16_0 = 1;
                      stackIn_17_0 = stackOut_16_0;
                      return stackIn_17_0;
                    } else {
                      break L1;
                    }
                  }
                }
              } else {
                L4: {
                  if (!((Object) (Object) fw.field_h[((wca) this).field_j]).equals((Object) (Object) param1)) {
                    break L4;
                  } else {
                    if (param2[1]) {
                      break L4;
                    } else {
                      stackOut_3_0 = 0;
                      stackIn_4_0 = stackOut_3_0;
                      return stackIn_4_0;
                    }
                  }
                }
                if (!((Object) (Object) fw.field_h[((wca) this).field_m]).equals((Object) (Object) param1)) {
                  break L1;
                } else {
                  if (param2[4]) {
                    break L1;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0;
                  }
                }
              }
            }
            L5: {
              if (!((Object) (Object) fw.field_h[((wca) this).field_i]).equals((Object) (Object) param1)) {
                break L5;
              } else {
                if (!param2[7]) {
                  stackOut_36_0 = 2;
                  stackIn_37_0 = stackOut_36_0;
                  return stackIn_37_0;
                } else {
                  break L5;
                }
              }
            }
            L6: {
              if (!((Object) (Object) fw.field_h[((wca) this).field_d]).equals((Object) (Object) param1)) {
                break L6;
              } else {
                if (!param2[10]) {
                  stackOut_34_0 = 3;
                  stackIn_35_0 = stackOut_34_0;
                  return stackIn_35_0;
                } else {
                  break L6;
                }
              }
            }
            L7: {
              if (param0 >= 2) {
                break L7;
              } else {
                var5 = null;
                int discarded$1 = ((wca) this).a(-53, (pd) null, (boolean[]) null);
                break L7;
              }
            }
            stackOut_40_0 = -1;
            stackIn_41_0 = stackOut_40_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) var4;
            stackOut_42_1 = new StringBuilder().append("wca.D(").append(param0).append(',');
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param1 == null) {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L8;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L8;
            }
          }
          L9: {
            stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
            stackOut_45_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(',');
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param2 == null) {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L9;
            } else {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L9;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_48_0, stackIn_48_2 + ')');
        }
        return stackIn_41_0;
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        oha var11 = null;
        oha var12 = null;
        oha var13 = null;
        oha var14 = null;
        if (param4 >= 61) {
          var14 = al.a(-72, param3);
          var13 = var14;
          var6 = var13.field_h;
          var7 = var13.field_a;
          var8 = var14.field_l;
          hh.field_b[var6].e(5 + param2, param1 + 5);
          if (1 != var8) {
            if (2 != var8) {
              if (3 == var8) {
                L0: {
                  if (1 == var7) {
                    if (var8 < 1) {
                      L1: {
                        if (var8 >= 2) {
                          us.field_c.a(18 + param2, 3 + param1);
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      if (var8 >= 3) {
                        us.field_c.a(21 + param2, 10 + param1);
                        break L0;
                      } else {
                        return;
                      }
                    } else {
                      L2: {
                        us.field_c.a(param2 + 11, param1);
                        if (var8 >= 2) {
                          us.field_c.a(18 + param2, 3 + param1);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      L3: {
                        if (var8 >= 3) {
                          us.field_c.a(21 + param2, 10 + param1);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      return;
                    }
                  } else {
                    if (var7 != 2) {
                      break L0;
                    } else {
                      if (!hl.a((byte) 104, var13.field_j)) {
                        break L0;
                      } else {
                        if (var8 < 1) {
                          L4: {
                            if (var8 >= 2) {
                              us.field_c.a(18 + param2, 3 + param1);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          L5: {
                            if (var8 >= 3) {
                              us.field_c.a(21 + param2, 10 + param1);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          return;
                        } else {
                          L6: {
                            us.field_c.a(param2 + 11, param1);
                            if (var8 >= 2) {
                              us.field_c.a(18 + param2, 3 + param1);
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          L7: {
                            if (var8 >= 3) {
                              us.field_c.a(21 + param2, 10 + param1);
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          return;
                        }
                      }
                    }
                  }
                }
                return;
              } else {
                if (1 == var7) {
                  if (var8 < 1) {
                    L8: {
                      if (var8 >= 2) {
                        us.field_c.a(18 + param2, 3 + param1);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    if (var8 >= 3) {
                      us.field_c.a(21 + param2, 10 + param1);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    L9: {
                      us.field_c.a(param2 + 11, param1);
                      if (var8 >= 2) {
                        us.field_c.a(18 + param2, 3 + param1);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (var8 >= 3) {
                        us.field_c.a(21 + param2, 10 + param1);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    return;
                  }
                } else {
                  if (var7 == 2) {
                    if (hl.a((byte) 104, var13.field_j)) {
                      L11: {
                        if (var8 < 1) {
                          break L11;
                        } else {
                          us.field_c.a(param2 + 11, param1);
                          break L11;
                        }
                      }
                      L12: {
                        if (var8 >= 2) {
                          us.field_c.a(18 + param2, 3 + param1);
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      L13: {
                        if (var8 >= 3) {
                          us.field_c.a(21 + param2, 10 + param1);
                          break L13;
                        } else {
                          break L13;
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
            } else {
              L14: {
                if (1 == var7) {
                  if (var8 < 1) {
                    L15: {
                      if (var8 >= 2) {
                        us.field_c.a(18 + param2, 3 + param1);
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    if (var8 >= 3) {
                      us.field_c.a(21 + param2, 10 + param1);
                      break L14;
                    } else {
                      return;
                    }
                  } else {
                    L16: {
                      us.field_c.a(param2 + 11, param1);
                      if (var8 >= 2) {
                        us.field_c.a(18 + param2, 3 + param1);
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    L17: {
                      if (var8 >= 3) {
                        us.field_c.a(21 + param2, 10 + param1);
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                    return;
                  }
                } else {
                  if (var7 != 2) {
                    break L14;
                  } else {
                    if (!hl.a((byte) 104, var13.field_j)) {
                      break L14;
                    } else {
                      if (var8 < 1) {
                        L18: {
                          if (var8 >= 2) {
                            us.field_c.a(18 + param2, 3 + param1);
                            break L18;
                          } else {
                            break L18;
                          }
                        }
                        L19: {
                          if (var8 >= 3) {
                            us.field_c.a(21 + param2, 10 + param1);
                            break L19;
                          } else {
                            break L19;
                          }
                        }
                        return;
                      } else {
                        L20: {
                          us.field_c.a(param2 + 11, param1);
                          if (var8 >= 2) {
                            us.field_c.a(18 + param2, 3 + param1);
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                        L21: {
                          if (var8 >= 3) {
                            us.field_c.a(21 + param2, 10 + param1);
                            break L21;
                          } else {
                            break L21;
                          }
                        }
                        return;
                      }
                    }
                  }
                }
              }
              return;
            }
          } else {
            L22: {
              if (1 == var7) {
                if (var8 < 1) {
                  L23: {
                    if (var8 >= 2) {
                      us.field_c.a(18 + param2, 3 + param1);
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                  if (var8 >= 3) {
                    us.field_c.a(21 + param2, 10 + param1);
                    break L22;
                  } else {
                    return;
                  }
                } else {
                  L24: {
                    us.field_c.a(param2 + 11, param1);
                    if (var8 >= 2) {
                      us.field_c.a(18 + param2, 3 + param1);
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  L25: {
                    if (var8 >= 3) {
                      us.field_c.a(21 + param2, 10 + param1);
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  return;
                }
              } else {
                if (var7 != 2) {
                  break L22;
                } else {
                  if (!hl.a((byte) 104, var13.field_j)) {
                    break L22;
                  } else {
                    if (var8 < 1) {
                      L26: {
                        if (var8 >= 2) {
                          us.field_c.a(18 + param2, 3 + param1);
                          break L26;
                        } else {
                          break L26;
                        }
                      }
                      L27: {
                        if (var8 >= 3) {
                          us.field_c.a(21 + param2, 10 + param1);
                          break L27;
                        } else {
                          break L27;
                        }
                      }
                      return;
                    } else {
                      L28: {
                        us.field_c.a(param2 + 11, param1);
                        if (var8 >= 2) {
                          us.field_c.a(18 + param2, 3 + param1);
                          break L28;
                        } else {
                          break L28;
                        }
                      }
                      L29: {
                        if (var8 >= 3) {
                          us.field_c.a(21 + param2, 10 + param1);
                          break L29;
                        } else {
                          break L29;
                        }
                      }
                      return;
                    }
                  }
                }
              }
            }
            return;
          }
        } else {
          wca.a((byte) 117);
          var12 = al.a(-72, param3);
          var11 = var12;
          var6 = var11.field_h;
          var7 = var11.field_a;
          var8 = var12.field_l;
          hh.field_b[var6].e(5 + param2, param1 + 5);
          if (1 != var8) {
            if (2 != var8) {
              L30: {
                if (3 == var8) {
                  break L30;
                } else {
                  break L30;
                }
              }
              L31: {
                L32: {
                  if (1 == var7) {
                    break L32;
                  } else {
                    if (var7 != 2) {
                      break L31;
                    } else {
                      if (!hl.a((byte) 104, var11.field_j)) {
                        break L31;
                      } else {
                        break L32;
                      }
                    }
                  }
                }
                if (var8 < 1) {
                  L33: {
                    if (var8 >= 2) {
                      us.field_c.a(18 + param2, 3 + param1);
                      break L33;
                    } else {
                      break L33;
                    }
                  }
                  if (var8 >= 3) {
                    us.field_c.a(21 + param2, 10 + param1);
                    break L31;
                  } else {
                    return;
                  }
                } else {
                  L34: {
                    us.field_c.a(param2 + 11, param1);
                    if (var8 >= 2) {
                      us.field_c.a(18 + param2, 3 + param1);
                      break L34;
                    } else {
                      break L34;
                    }
                  }
                  L35: {
                    if (var8 >= 3) {
                      us.field_c.a(21 + param2, 10 + param1);
                      break L35;
                    } else {
                      break L35;
                    }
                  }
                  return;
                }
              }
              return;
            } else {
              L36: {
                L37: {
                  if (1 == var7) {
                    break L37;
                  } else {
                    if (var7 != 2) {
                      break L36;
                    } else {
                      if (!hl.a((byte) 104, var11.field_j)) {
                        break L36;
                      } else {
                        break L37;
                      }
                    }
                  }
                }
                L38: {
                  if (var8 < 1) {
                    break L38;
                  } else {
                    us.field_c.a(param2 + 11, param1);
                    break L38;
                  }
                }
                L39: {
                  if (var8 >= 2) {
                    us.field_c.a(18 + param2, 3 + param1);
                    break L39;
                  } else {
                    break L39;
                  }
                }
                if (var8 >= 3) {
                  us.field_c.a(21 + param2, 10 + param1);
                  break L36;
                } else {
                  break L36;
                }
              }
              return;
            }
          } else {
            L40: {
              L41: {
                if (1 == var7) {
                  break L41;
                } else {
                  if (var7 != 2) {
                    break L40;
                  } else {
                    if (!hl.a((byte) 104, var11.field_j)) {
                      break L40;
                    } else {
                      break L41;
                    }
                  }
                }
              }
              L42: {
                if (var8 < 1) {
                  break L42;
                } else {
                  us.field_c.a(param2 + 11, param1);
                  break L42;
                }
              }
              L43: {
                if (var8 >= 2) {
                  us.field_c.a(18 + param2, 3 + param1);
                  break L43;
                } else {
                  break L43;
                }
              }
              if (var8 >= 3) {
                us.field_c.a(21 + param2, 10 + param1);
                break L40;
              } else {
                break L40;
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
                return stackIn_6_0 != 0;
              } else {
                if (this.getClass() == param0.getClass()) {
                  var2 = (wca) param0;
                  if (((wca) this).field_b != var2.field_b) {
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    break L0;
                  } else {
                    return true;
                  }
                } else {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0 != 0;
                }
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2_ref;
            stackOut_14_1 = new StringBuilder().append("wca.equals(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L1;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_13_0 != 0;
    }

    public final int hashCode() {
        int var1 = 1;
        var1 = ((wca) this).field_b + 31 * var1;
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
                dl.field_h.a((long)ol.field_l[var1_int].hashCode(), (byte) -55, (bw) (Object) new ji(var1_int));
                var1_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1, "wca.C(" + param0 + ')');
        }
    }

    wca(int param0, String param1, String param2, int[] param3, int[] param4, int param5, kga param6, String param7) {
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
            ((wca) this).field_f = param1;
            ((wca) this).field_h = param2;
            ((wca) this).field_g = param6;
            ((wca) this).field_b = param0;
            ((wca) this).field_a = param7;
            ((wca) this).field_k = fw.field_h[((wca) this).field_b].field_g;
            Random discarded$1 = new Random((long)param0);
            ((wca) this).field_c = param4;
            ((wca) this).field_e = param5;
            ((wca) this).field_j = ((wca) this).field_c[1];
            ((wca) this).field_l = param3;
            ((wca) this).field_m = ((wca) this).field_c[4];
            ((wca) this).field_d = ((wca) this).field_c[10];
            ((wca) this).field_i = ((wca) this).field_c[7];
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var9;
            stackOut_3_1 = new StringBuilder().append("wca.<init>(").append(param0).append(',');
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
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param5).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param6 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param7 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
    }

    static {
    }
}
