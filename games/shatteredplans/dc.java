/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dc {
    int field_w;
    int field_k;
    private int field_C;
    int field_f;
    boolean field_z;
    fs[] field_v;
    private int[] field_N;
    l field_g;
    int[] field_m;
    int field_e;
    private int field_M;
    private int[] field_u;
    String[] field_I;
    int field_y;
    private int[] field_B;
    static pf field_E;
    private int[] field_j;
    private int field_b;
    int field_O;
    int field_J;
    me field_x;
    vr field_o;
    private int field_n;
    el field_p;
    private int[][] field_t;
    pf field_i;
    pf field_A;
    int field_r;
    int[] field_D;
    private int[] field_d;
    static bi field_F;
    private int[] field_K;
    private int field_G;
    private Random field_L;
    static int[] field_c;
    pf field_q;
    static int[] field_s;
    private int[] field_h;
    static np field_l;
    private int[] field_H;
    static String field_a;

    private final void a(boolean param0, k param1, int param2) {
        RuntimeException var4 = null;
        qa var4_ref = null;
        fs[] var5 = null;
        int[] var5_array = null;
        int var6 = 0;
        fs var7_ref_fs = null;
        int var7 = 0;
        sd var8 = null;
        lo var8_ref = null;
        fs[] var8_array = null;
        int var9 = 0;
        fs var10 = null;
        int var11 = 0;
        lo var11_ref_lo = null;
        sd var11_ref_sd = null;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        Object stackIn_4_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        boolean stackIn_14_0 = false;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        boolean stackIn_28_0 = false;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        boolean stackIn_42_0 = false;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        boolean stackIn_54_0 = false;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_72_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_75_1 = 0;
        int stackIn_81_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_83_1 = 0;
        int stackIn_90_0 = 0;
        int stackIn_90_1 = 0;
        int stackIn_95_0 = 0;
        int stackIn_95_1 = 0;
        int stackIn_98_0 = 0;
        int stackIn_98_1 = 0;
        RuntimeException stackIn_109_0 = null;
        StringBuilder stackIn_109_1 = null;
        RuntimeException stackIn_110_0 = null;
        StringBuilder stackIn_110_1 = null;
        RuntimeException stackIn_111_0 = null;
        StringBuilder stackIn_111_1 = null;
        String stackIn_111_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        boolean stackOut_13_0 = false;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        boolean stackOut_27_0 = false;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        boolean stackOut_41_0 = false;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        boolean stackOut_53_0 = false;
        int stackOut_57_0 = 0;
        int stackOut_57_1 = 0;
        int stackOut_89_0 = 0;
        int stackOut_89_1 = 0;
        int stackOut_71_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_74_1 = 0;
        int stackOut_80_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_82_1 = 0;
        int stackOut_94_0 = 0;
        int stackOut_94_1 = 0;
        int stackOut_97_0 = 0;
        int stackOut_97_1 = 0;
        RuntimeException stackOut_108_0 = null;
        StringBuilder stackOut_108_1 = null;
        RuntimeException stackOut_110_0 = null;
        StringBuilder stackOut_110_1 = null;
        String stackOut_110_2 = null;
        RuntimeException stackOut_109_0 = null;
        StringBuilder stackOut_109_1 = null;
        String stackOut_109_2 = null;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var4_ref = (qa) (Object) ((dc) this).field_q.d(0);
            L1: while (true) {
              L2: {
                L3: {
                  if (var4_ref == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = this;
                    stackIn_10_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var13 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (((dc) this).field_o.field_i) {
                            break L5;
                          } else {
                            var4_ref.field_u.field_R.field_x = var4_ref.field_u.field_R.field_x - var4_ref.field_v;
                            if (var13 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var4_ref.field_u.field_y.field_m.field_x = var4_ref.field_u.field_y.field_m.field_x - var4_ref.field_v;
                        break L4;
                      }
                      var4_ref.field_u.field_x = var4_ref.field_u.field_x + var4_ref.field_v;
                      var4_ref = (qa) (Object) ((dc) this).field_q.a((byte) -71);
                      if (var13 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_9_0 = this;
                stackIn_10_0 = stackOut_9_0;
                break L2;
              }
              var5 = ((dc) this).field_v;
              var6 = 0;
              L6: while (true) {
                stackOut_11_0 = var5.length;
                stackOut_11_1 = var6;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                L7: while (true) {
                  L8: {
                    L9: {
                      if (stackIn_12_0 <= stackIn_12_1) {
                        break L9;
                      } else {
                        var7_ref_fs = var5[var6];
                        stackOut_13_0 = ((dc) this).field_o.field_i;
                        stackIn_28_0 = stackOut_13_0;
                        stackIn_14_0 = stackOut_13_0;
                        if (var13 != 0) {
                          break L8;
                        } else {
                          L10: {
                            L11: {
                              if (!stackIn_14_0) {
                                break L11;
                              } else {
                                L12: {
                                  var8_ref = var7_ref_fs.field_m;
                                  if (((sd) (Object) var8_ref).field_x > 0) {
                                    ((sd) (Object) var8_ref).field_q.field_x = ((sd) (Object) var8_ref).field_q.field_x + ((sd) (Object) var8_ref).field_x;
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                                if (var13 == 0) {
                                  break L10;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            var8 = (sd) (Object) var7_ref_fs.field_i.d(0);
                            L13: while (true) {
                              if (var8 == null) {
                                break L10;
                              } else {
                                stackOut_21_0 = 0;
                                stackOut_21_1 = var8.field_x;
                                stackIn_12_0 = stackOut_21_0;
                                stackIn_12_1 = stackOut_21_1;
                                stackIn_22_0 = stackOut_21_0;
                                stackIn_22_1 = stackOut_21_1;
                                if (var13 != 0) {
                                  continue L7;
                                } else {
                                  L14: {
                                    if (stackIn_22_0 < stackIn_22_1) {
                                      var8.field_q.field_x = var8.field_q.field_x + var8.field_x;
                                      break L14;
                                    } else {
                                      break L14;
                                    }
                                  }
                                  var8 = (sd) (Object) var7_ref_fs.field_i.a((byte) -71);
                                  if (var13 == 0) {
                                    continue L13;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                            }
                          }
                          var6++;
                          if (var13 == 0) {
                            continue L6;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    stackOut_27_0 = param0;
                    stackIn_28_0 = stackOut_27_0;
                    break L8;
                  }
                  L15: {
                    if (stackIn_28_0) {
                      break L15;
                    } else {
                      field_s = null;
                      break L15;
                    }
                  }
                  L16: {
                    L17: {
                      if (param1 != null) {
                        var4_ref = (qa) (Object) ((dc) this).field_q.d(0);
                        L18: while (true) {
                          L19: {
                            L20: {
                              if (var4_ref == null) {
                                break L20;
                              } else {
                                param1.a(var4_ref.field_v, var4_ref.field_u, -4900);
                                var4_ref = (qa) (Object) ((dc) this).field_q.a((byte) -71);
                                if (var13 != 0) {
                                  break L19;
                                } else {
                                  if (var13 == 0) {
                                    continue L18;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                            }
                            var5 = ((dc) this).field_v;
                            break L19;
                          }
                          var6 = 0;
                          L21: while (true) {
                            stackOut_39_0 = var5.length;
                            stackOut_39_1 = var6;
                            stackIn_40_0 = stackOut_39_0;
                            stackIn_40_1 = stackOut_39_1;
                            L22: while (true) {
                              if (stackIn_40_0 <= stackIn_40_1) {
                                break L17;
                              } else {
                                var7_ref_fs = var5[var6];
                                stackOut_41_0 = ((dc) this).field_o.field_i;
                                stackIn_54_0 = stackOut_41_0;
                                stackIn_42_0 = stackOut_41_0;
                                if (var13 != 0) {
                                  break L16;
                                } else {
                                  L23: {
                                    L24: {
                                      if (stackIn_42_0) {
                                        break L24;
                                      } else {
                                        var8 = (sd) (Object) var7_ref_fs.field_i.d(0);
                                        L25: while (true) {
                                          L26: {
                                            if (var8 == null) {
                                              break L26;
                                            } else {
                                              stackOut_45_0 = ~var8.field_x;
                                              stackOut_45_1 = -1;
                                              stackIn_40_0 = stackOut_45_0;
                                              stackIn_40_1 = stackOut_45_1;
                                              stackIn_46_0 = stackOut_45_0;
                                              stackIn_46_1 = stackOut_45_1;
                                              if (var13 != 0) {
                                                continue L22;
                                              } else {
                                                L27: {
                                                  if (stackIn_46_0 >= stackIn_46_1) {
                                                    break L27;
                                                  } else {
                                                    param1.a(var8.field_x, var8.field_q, -4900);
                                                    break L27;
                                                  }
                                                }
                                                var8 = (sd) (Object) var7_ref_fs.field_i.a((byte) -71);
                                                if (var13 == 0) {
                                                  continue L25;
                                                } else {
                                                  break L26;
                                                }
                                              }
                                            }
                                          }
                                          if (var13 == 0) {
                                            break L23;
                                          } else {
                                            break L24;
                                          }
                                        }
                                      }
                                    }
                                    if (var7_ref_fs.field_m.field_x <= 0) {
                                      break L23;
                                    } else {
                                      param1.a(var7_ref_fs.field_m.field_x, var7_ref_fs.field_m.field_q, -4900);
                                      break L23;
                                    }
                                  }
                                  var6++;
                                  if (var13 == 0) {
                                    continue L21;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        break L17;
                      }
                    }
                    stackOut_53_0 = ((dc) this).field_o.field_h;
                    stackIn_54_0 = stackOut_53_0;
                    break L16;
                  }
                  L28: {
                    if (!stackIn_54_0) {
                      break L28;
                    } else {
                      if (((dc) this).field_x instanceof qg) {
                        break L28;
                      } else {
                        var14 = new int[4];
                        var5_array = new int[4];
                        var8_array = ((dc) this).field_v;
                        var9 = 0;
                        L29: while (true) {
                          stackOut_57_0 = var8_array.length;
                          stackOut_57_1 = var9;
                          stackIn_58_0 = stackOut_57_0;
                          stackIn_58_1 = stackOut_57_1;
                          L30: while (true) {
                            if (stackIn_58_0 <= stackIn_58_1) {
                              break L28;
                            } else {
                              var10 = var8_array[var9];
                              if (var13 != 0) {
                                decompiledRegionSelector0 = 0;
                                break L0;
                              } else {
                                L31: {
                                  if ((1 << var10.field_x & ((dc) this).field_w) == 0) {
                                    var7 = 0;
                                    var11 = 0;
                                    L32: while (true) {
                                      L33: {
                                        L34: {
                                          if (var11 >= 4) {
                                            break L34;
                                          } else {
                                            var14[var11] = 0;
                                            var11++;
                                            if (var13 != 0) {
                                              break L33;
                                            } else {
                                              if (var13 == 0) {
                                                continue L32;
                                              } else {
                                                break L34;
                                              }
                                            }
                                          }
                                        }
                                        var6 = 0;
                                        break L33;
                                      }
                                      L35: {
                                        L36: {
                                          L37: {
                                            if (((dc) this).field_o.field_i) {
                                              var11_ref_lo = var10.field_m;
                                              var12 = 0;
                                              L38: while (true) {
                                                if (var12 >= 4) {
                                                  break L37;
                                                } else {
                                                  var14[var12] = var11_ref_lo.field_u[var12];
                                                  stackOut_89_0 = ~var14[var12];
                                                  stackOut_89_1 = ~var7;
                                                  stackIn_95_0 = stackOut_89_0;
                                                  stackIn_95_1 = stackOut_89_1;
                                                  stackIn_90_0 = stackOut_89_0;
                                                  stackIn_90_1 = stackOut_89_1;
                                                  if (var13 != 0) {
                                                    break L35;
                                                  } else {
                                                    L39: {
                                                      if (stackIn_90_0 >= stackIn_90_1) {
                                                        break L39;
                                                      } else {
                                                        var7 = var14[var12];
                                                        break L39;
                                                      }
                                                    }
                                                    var14[var12] = var14[var12] + 1;
                                                    var6 = var6 + var14[var12];
                                                    var12++;
                                                    if (var13 == 0) {
                                                      continue L38;
                                                    } else {
                                                      break L37;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              var11_ref_sd = (sd) (Object) var10.field_i.d(0);
                                              L40: while (true) {
                                                L41: {
                                                  L42: {
                                                    L43: {
                                                      if (var11_ref_sd == null) {
                                                        break L43;
                                                      } else {
                                                        stackOut_71_0 = 0;
                                                        stackIn_81_0 = stackOut_71_0;
                                                        stackIn_72_0 = stackOut_71_0;
                                                        if (var13 != 0) {
                                                          break L42;
                                                        } else {
                                                          var12 = stackIn_72_0;
                                                          L44: while (true) {
                                                            L45: {
                                                              if (var12 >= 4) {
                                                                break L45;
                                                              } else {
                                                                var14[var12] = var14[var12] + var11_ref_sd.field_u[var12];
                                                                stackOut_74_0 = ~var14[var12];
                                                                stackOut_74_1 = ~var7;
                                                                stackIn_83_0 = stackOut_74_0;
                                                                stackIn_83_1 = stackOut_74_1;
                                                                stackIn_75_0 = stackOut_74_0;
                                                                stackIn_75_1 = stackOut_74_1;
                                                                if (var13 != 0) {
                                                                  break L41;
                                                                } else {
                                                                  L46: {
                                                                    if (stackIn_75_0 < stackIn_75_1) {
                                                                      var7 = var14[var12];
                                                                      break L46;
                                                                    } else {
                                                                      break L46;
                                                                    }
                                                                  }
                                                                  var12++;
                                                                  if (var13 == 0) {
                                                                    continue L44;
                                                                  } else {
                                                                    break L45;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            var11_ref_sd = (sd) (Object) var10.field_i.a((byte) -71);
                                                            if (var13 == 0) {
                                                              continue L40;
                                                            } else {
                                                              break L43;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                    stackOut_80_0 = 0;
                                                    stackIn_81_0 = stackOut_80_0;
                                                    break L42;
                                                  }
                                                  var12 = stackIn_81_0;
                                                  stackOut_82_0 = -5;
                                                  stackOut_82_1 = ~var12;
                                                  stackIn_83_0 = stackOut_82_0;
                                                  stackIn_83_1 = stackOut_82_1;
                                                  break L41;
                                                }
                                                L47: while (true) {
                                                  if (stackIn_83_0 >= stackIn_83_1) {
                                                    break L37;
                                                  } else {
                                                    var14[var12] = var14[var12] + 1;
                                                    var6 = var6 + var14[var12];
                                                    var12++;
                                                    if (var13 != 0) {
                                                      break L36;
                                                    } else {
                                                      if (var13 == 0) {
                                                        stackOut_82_0 = -5;
                                                        stackOut_82_1 = ~var12;
                                                        stackIn_83_0 = stackOut_82_0;
                                                        stackIn_83_1 = stackOut_82_1;
                                                        continue L47;
                                                      } else {
                                                        break L37;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          ((dc) this).field_L.setSeed((long)(1 + var10.field_x ^ param2));
                                          break L36;
                                        }
                                        stackOut_94_0 = 81;
                                        stackOut_94_1 = var6;
                                        stackIn_95_0 = stackOut_94_0;
                                        stackIn_95_1 = stackOut_94_1;
                                        break L35;
                                      }
                                      var11 = qf.a((byte) stackIn_95_0, stackIn_95_1, ((dc) this).field_L);
                                      var12 = 0;
                                      L48: while (true) {
                                        if (4 <= var12) {
                                          break L31;
                                        } else {
                                          stackOut_97_0 = ~var14[var12];
                                          stackOut_97_1 = ~var11;
                                          stackIn_58_0 = stackOut_97_0;
                                          stackIn_58_1 = stackOut_97_1;
                                          stackIn_98_0 = stackOut_97_0;
                                          stackIn_98_1 = stackOut_97_1;
                                          if (var13 != 0) {
                                            continue L30;
                                          } else {
                                            L49: {
                                              if (stackIn_98_0 >= stackIn_98_1) {
                                                break L49;
                                              } else {
                                                L50: {
                                                  if (var10.field_u[var12] < 5) {
                                                    break L50;
                                                  } else {
                                                    if (var10.field_q != null) {
                                                      var10.field_q.field_d = var10.field_q.field_d + 1;
                                                      if (var13 == 0) {
                                                        break L31;
                                                      } else {
                                                        break L50;
                                                      }
                                                    } else {
                                                      break L31;
                                                    }
                                                  }
                                                }
                                                var10.field_u[var12] = var10.field_u[var12] + 1;
                                                if (var13 == 0) {
                                                  break L31;
                                                } else {
                                                  break L49;
                                                }
                                              }
                                            }
                                            var11 = var11 - var14[var12];
                                            var12++;
                                            if (var13 == 0) {
                                              continue L48;
                                            } else {
                                              break L31;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    break L31;
                                  }
                                }
                                var9++;
                                if (var13 == 0) {
                                  continue L29;
                                } else {
                                  break L28;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L51: {
            var4 = decompiledCaughtException;
            stackOut_108_0 = (RuntimeException) var4;
            stackOut_108_1 = new StringBuilder().append("dc.IA(").append(param0).append(44);
            stackIn_110_0 = stackOut_108_0;
            stackIn_110_1 = stackOut_108_1;
            stackIn_109_0 = stackOut_108_0;
            stackIn_109_1 = stackOut_108_1;
            if (param1 == null) {
              stackOut_110_0 = (RuntimeException) (Object) stackIn_110_0;
              stackOut_110_1 = (StringBuilder) (Object) stackIn_110_1;
              stackOut_110_2 = "null";
              stackIn_111_0 = stackOut_110_0;
              stackIn_111_1 = stackOut_110_1;
              stackIn_111_2 = stackOut_110_2;
              break L51;
            } else {
              stackOut_109_0 = (RuntimeException) (Object) stackIn_109_0;
              stackOut_109_1 = (StringBuilder) (Object) stackIn_109_1;
              stackOut_109_2 = "{...}";
              stackIn_111_0 = stackOut_109_0;
              stackIn_111_1 = stackOut_109_1;
              stackIn_111_2 = stackOut_109_2;
              break L51;
            }
          }
          throw r.a((Throwable) (Object) stackIn_111_0, stackIn_111_2 + 44 + param2 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void d(int param0) {
        try {
            Exception var1 = null;
            java.lang.reflect.Method var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  if (param0 == 22943) {
                    break L1;
                  } else {
                    field_a = null;
                    break L1;
                  }
                }
                L2: {
                  L3: {
                    var1_ref = Runtime.class.getMethod("maxMemory", new Class[0]);
                    if (var1_ref == null) {
                      break L3;
                    } else {
                      try {
                        L4: {
                          var2_ref = Runtime.getRuntime();
                          var3 = (Long) var1_ref.invoke((Object) (Object) var2_ref, (Object[]) null);
                          re.field_a = 1 + (int)(var3.longValue() / 1048576L);
                          decompiledRegionSelector0 = 0;
                          break L4;
                        }
                      } catch (java.lang.Throwable decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L5: {
                          var2 = decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                          break L5;
                        }
                      }
                      if (decompiledRegionSelector0 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  break L2;
                }
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var1 = (Exception) (Object) decompiledCaughtException;
                break L6;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, boolean param2) {
        if (param2) {
            ((dc) this).field_f = 124;
        }
        ((dc) this).field_G = param1;
        ((dc) this).field_n = param0;
    }

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          L1: {
            if (~var2 <= ~((dc) this).field_C) {
              break L1;
            } else {
              if (var3 != 0) {
                break L1;
              } else {
                L2: {
                  if (((dc) this).field_H[var2] != 0) {
                    break L2;
                  } else {
                    this.c(var2, -40);
                    if (var3 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
                var2++;
                if (var3 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
          }
          return;
        }
    }

    final boolean a(ln param0, ln param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_1_0 = 0;
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
        try {
          L0: {
            if (param2 == -1) {
              L1: {
                L2: {
                  if (((dc) this).field_o.field_b == 0) {
                    break L2;
                  } else {
                    if (~((dc) this).field_o.field_b > ~((dc) this).field_g.field_h[param0.field_p][param1.field_p]) {
                      stackOut_7_0 = 0;
                      stackIn_8_0 = stackOut_7_0;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                break L1;
              }
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("dc.T(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
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
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
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
          throw r.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param2 + 41);
        }
        return stackIn_8_0 != 0;
    }

    private final void c(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        L0: {
          var6 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param1 <= -15) {
            break L0;
          } else {
            this.b((byte) -59);
            break L0;
          }
        }
        var3 = ((dc) this).field_K[param0];
        ((dc) this).field_C = ((dc) this).field_C - 1;
        ((dc) this).field_K[param0] = ((dc) this).field_K[((dc) this).field_C];
        ((dc) this).field_t[param0] = ((dc) this).field_t[((dc) this).field_C];
        ((dc) this).field_H[param0] = ((dc) this).field_H[((dc) this).field_C];
        var4 = 0;
        L1: while (true) {
          stackOut_3_0 = ~var4;
          stackOut_3_1 = ~((dc) this).field_C;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          L2: while (true) {
            L3: {
              if (stackIn_4_0 <= stackIn_4_1) {
                break L3;
              } else {
                if (var6 != 0) {
                  break L3;
                } else {
                  var5 = 0;
                  L4: while (true) {
                    L5: {
                      if (var5 >= ((dc) this).field_H[var4]) {
                        break L5;
                      } else {
                        stackOut_8_0 = var3;
                        stackOut_8_1 = ((dc) this).field_t[var4][var5];
                        stackIn_4_0 = stackOut_8_0;
                        stackIn_4_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (var6 != 0) {
                          continue L2;
                        } else {
                          L6: {
                            if (stackIn_9_0 == stackIn_9_1) {
                              ((dc) this).field_H[var4] = ((dc) this).field_H[var4] - 1;
                              ((dc) this).field_t[var4][var5] = ((dc) this).field_t[var4][((dc) this).field_H[var4]];
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          var5++;
                          if (var6 == 0) {
                            continue L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    var4++;
                    if (var6 == 0) {
                      continue L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
            }
            return;
          }
        }
    }

    final void c(int param0) {
        fs[] var2 = null;
        int var3 = 0;
        fs var4 = null;
        sd var5 = null;
        int var6 = 0;
        fs[] var7 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        var7 = ((dc) this).field_v;
        var2 = var7;
        var3 = param0;
        L0: while (true) {
          L1: {
            if (var7.length <= var3) {
              break L1;
            } else {
              var4 = var7[var3];
              if (var6 != 0) {
                break L1;
              } else {
                L2: {
                  L3: {
                    L4: {
                      if (((dc) this).field_o.field_i) {
                        break L4;
                      } else {
                        var5 = (sd) (Object) var4.field_i.d(0);
                        L5: while (true) {
                          L6: {
                            if (var5 == null) {
                              break L6;
                            } else {
                              vf.a(127, var5);
                              var5 = (sd) (Object) var4.field_i.a((byte) -71);
                              if (var6 != 0) {
                                break L2;
                              } else {
                                if (var6 == 0) {
                                  continue L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          if (var6 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    vf.a(127, (sd) (Object) var4.field_m);
                    break L3;
                  }
                  var3++;
                  break L2;
                }
                if (var6 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
          }
          return;
        }
    }

    public static void e(byte param0) {
        field_F = null;
        int var1 = -53 % 0;
        field_l = null;
        field_a = null;
        field_c = null;
        field_E = null;
        field_s = null;
    }

    final void b(int param0) {
        int var2_int = 0;
        ln[] var2 = null;
        fs var3_ref_fs = null;
        int var3 = 0;
        sd var4 = null;
        ln var4_ref = null;
        int var5 = 0;
        ln[] var6 = null;
        ln var7 = null;
        Object stackIn_5_0 = null;
        Object stackIn_16_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_15_0 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 <= -2) {
          var2_int = 0;
          L0: while (true) {
            L1: {
              L2: {
                if (~((dc) this).field_r >= ~var2_int) {
                  break L2;
                } else {
                  var3_ref_fs = ((dc) this).field_v[var2_int];
                  ((dc) this).field_D[var2_int] = 0;
                  stackOut_4_0 = this;
                  stackIn_16_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (var5 != 0) {
                    break L1;
                  } else {
                    L3: {
                      L4: {
                        L5: {
                          if (!((dc) this).field_o.field_i) {
                            break L5;
                          } else {
                            ((dc) this).field_D[var2_int] = var3_ref_fs.field_m.field_r;
                            if (var5 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var4 = (sd) (Object) var3_ref_fs.field_i.d(0);
                        L6: while (true) {
                          if (var4 == null) {
                            break L4;
                          } else {
                            ((dc) this).field_D[var2_int] = ((dc) this).field_D[var2_int] + var4.field_r;
                            var4 = (sd) (Object) var3_ref_fs.field_i.a((byte) -71);
                            if (var5 != 0) {
                              break L3;
                            } else {
                              if (var5 == 0) {
                                continue L6;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                      }
                      var2_int++;
                      break L3;
                    }
                    if (var5 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackOut_15_0 = this;
              stackIn_16_0 = stackOut_15_0;
              break L1;
            }
            var6 = ((dc) this).field_g.field_e;
            var2 = var6;
            var3 = 0;
            L7: while (true) {
              L8: {
                L9: {
                  if (~var3 <= ~var6.length) {
                    break L9;
                  } else {
                    var7 = var6[var3];
                    var4_ref = var7;
                    if (var5 != 0) {
                      break L8;
                    } else {
                      L10: {
                        if (var4_ref.field_y != null) {
                          ((dc) this).field_D[var7.field_y.field_x] = ((dc) this).field_D[var7.field_y.field_x] + var7.field_x;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      var3++;
                      if (var5 == 0) {
                        continue L7;
                      } else {
                        break L9;
                      }
                    }
                  }
                }
                ((dc) this).field_m = nf.a(((dc) this).field_D, 3718);
                break L8;
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    final void a(ob param0, fs param1, boolean param2) throws jn, kr {
        RuntimeException var4 = null;
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
        try {
          L0: {
            L1: {
              ((dc) this).field_g = uk.a(((dc) this).field_M, (dc) this, param0, ((dc) this).field_A, ((dc) this).field_v, param1, (byte) -7, ((dc) this).field_o);
              if (!param2) {
                break L1;
              } else {
                ((dc) this).field_L = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var4;
            stackOut_3_1 = new StringBuilder().append("dc.KA(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
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
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param2 + 41);
        }
    }

    private final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        L0: {
          var6 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param0 == 15) {
            break L0;
          } else {
            ((dc) this).field_h = null;
            break L0;
          }
        }
        L1: while (true) {
          L2: {
            if (1 >= ((dc) this).field_C) {
              break L2;
            } else {
              var2 = 0;
              var3 = ((dc) this).field_L.nextInt();
              if (var6 != 0) {
                break L2;
              } else {
                var4 = 1;
                L3: while (true) {
                  L4: {
                    L5: {
                      if (var4 >= ((dc) this).field_C) {
                        break L5;
                      } else {
                        var5 = ((dc) this).field_L.nextInt();
                        stackOut_6_0 = var5;
                        stackOut_6_1 = var3;
                        stackIn_11_0 = stackOut_6_0;
                        stackIn_11_1 = stackOut_6_1;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        if (var6 != 0) {
                          break L4;
                        } else {
                          L6: {
                            if (stackIn_7_0 <= stackIn_7_1) {
                              break L6;
                            } else {
                              var3 = var5;
                              var2 = var4;
                              break L6;
                            }
                          }
                          var4++;
                          if (var6 == 0) {
                            continue L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    var2 = ((dc) this).field_K[var2];
                    ((dc) this).field_u[var2] = ((dc) this).field_u[var2] - 1;
                    stackOut_10_0 = 0;
                    stackOut_10_1 = ((dc) this).field_u[var2] - 1;
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    break L4;
                  }
                  L7: {
                    if (stackIn_11_0 != stackIn_11_1) {
                      break L7;
                    } else {
                      this.c(this.a((byte) 94, var2), -119);
                      break L7;
                    }
                  }
                  if (((dc) this).field_u[var2] >= 0) {
                    if (var6 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  } else {
                    throw new RuntimeException();
                  }
                }
              }
            }
          }
          return;
        }
    }

    private final void a(byte param0, boolean[][] param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        byte stackOut_21_0 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            ((dc) this).field_t = new int[1 + ((dc) this).field_r][((dc) this).field_r];
            var3_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~((dc) this).field_C >= ~var3_int) {
                    break L3;
                  } else {
                    ((dc) this).field_H[var3_int] = 0;
                    var3_int++;
                    if (var7 != 0) {
                      break L2;
                    } else {
                      if (var7 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var3_int = 0;
                break L2;
              }
              L4: while (true) {
                stackOut_8_0 = var3_int;
                stackOut_8_1 = ((dc) this).field_C;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                L5: while (true) {
                  L6: {
                    L7: {
                      if (stackIn_9_0 >= stackIn_9_1) {
                        break L7;
                      } else {
                        var4 = ((dc) this).field_K[var3_int];
                        stackOut_10_0 = var3_int + 1;
                        stackIn_22_0 = stackOut_10_0;
                        stackIn_11_0 = stackOut_10_0;
                        if (var7 != 0) {
                          break L6;
                        } else {
                          var5 = stackIn_11_0;
                          L8: while (true) {
                            L9: {
                              if (~var5 <= ~((dc) this).field_C) {
                                break L9;
                              } else {
                                var6 = ((dc) this).field_K[var5];
                                stackOut_13_0 = ~var4;
                                stackOut_13_1 = ~((dc) this).field_r;
                                stackIn_9_0 = stackOut_13_0;
                                stackIn_9_1 = stackOut_13_1;
                                stackIn_14_0 = stackOut_13_0;
                                stackIn_14_1 = stackOut_13_1;
                                if (var7 != 0) {
                                  continue L5;
                                } else {
                                  L10: {
                                    L11: {
                                      if (stackIn_14_0 == stackIn_14_1) {
                                        break L11;
                                      } else {
                                        if (var6 == ((dc) this).field_r) {
                                          break L11;
                                        } else {
                                          if (param1[var4][var6]) {
                                            break L10;
                                          } else {
                                            break L11;
                                          }
                                        }
                                      }
                                    }
                                    ((dc) this).field_H[var3_int] = ((dc) this).field_H[var3_int] + 1;
                                    ((dc) this).field_t[var3_int][((dc) this).field_H[var3_int]] = var6;
                                    ((dc) this).field_H[var5] = ((dc) this).field_H[var5] + 1;
                                    ((dc) this).field_t[var5][((dc) this).field_H[var5]] = var4;
                                    break L10;
                                  }
                                  var5++;
                                  if (var7 == 0) {
                                    continue L8;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                            var3_int++;
                            if (var7 == 0) {
                              continue L4;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                    }
                    stackOut_21_0 = param0;
                    stackIn_22_0 = stackOut_21_0;
                    break L6;
                  }
                  if (stackIn_22_0 == -114) {
                    this.a(false);
                    break L0;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var3 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var3;
            stackOut_26_1 = new StringBuilder().append("dc.GB(").append(param0).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L12;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L12;
            }
          }
          throw r.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 41);
        }
    }

    final void a(int param0, int param1) {
        ((dc) this).field_z = true;
        ((dc) this).field_k = param0;
        if (param1 != 3) {
            ((dc) this).c(-66);
        }
    }

    final void a(int param0, int param1, k param2, se param3) {
        RuntimeException var5 = null;
        boolean[][] var5_array = null;
        int var6_int = 0;
        Object var6 = null;
        int var7 = 0;
        Object var8 = null;
        int var9 = 0;
        ln[] var10_ref_ln__ = null;
        int var10 = 0;
        int var11 = 0;
        ln var12_ref_ln = null;
        int var12 = 0;
        int var13 = 0;
        ln stackIn_23_0 = null;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_46_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_70_1 = 0;
        boolean stackIn_78_0 = false;
        int stackIn_84_0 = 0;
        ln stackIn_90_0 = null;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        String stackIn_98_2 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_101_2 = null;
        RuntimeException decompiledCaughtException = null;
        ln stackOut_22_0 = null;
        Object stackOut_89_0 = null;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_69_1 = 0;
        boolean stackOut_77_0 = false;
        int stackOut_83_0 = 0;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        String stackOut_97_2 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        String stackOut_96_2 = null;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        String stackOut_100_2 = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        String stackOut_99_2 = null;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  var5_array = new boolean[((dc) this).field_r][];
                  if (((dc) this).field_o.field_j) {
                    break L3;
                  } else {
                    var6_int = 0;
                    L4: while (true) {
                      L5: {
                        if (((dc) this).field_r <= var6_int) {
                          break L5;
                        } else {
                          var5_array[var6_int] = new boolean[((dc) this).field_r];
                          var6_int++;
                          if (var13 != 0) {
                            break L1;
                          } else {
                            if (var13 == 0) {
                              continue L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      if (var13 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var6_int = 0;
                L6: while (true) {
                  if (var6_int >= ((dc) this).field_r) {
                    break L2;
                  } else {
                    var5_array[var6_int] = ((dc) this).field_v[var6_int].field_h;
                    var6_int++;
                    if (var13 != 0) {
                      break L1;
                    } else {
                      if (var13 == 0) {
                        continue L6;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              this.a(true, param2, param0);
              break L1;
            }
            L7: {
              L8: {
                L9: {
                  L10: {
                    L11: {
                      if (param3 == null) {
                        break L11;
                      } else {
                        var6_int = 0;
                        L12: while (true) {
                          L13: {
                            if (~((dc) this).field_r >= ~var6_int) {
                              break L13;
                            } else {
                              param3.field_l[var6_int] = 0;
                              param3.field_b[var6_int] = 0;
                              param3.field_f[var6_int] = 0;
                              param3.field_h[var6_int] = 0;
                              var6_int++;
                              if (var13 != 0) {
                                break L10;
                              } else {
                                if (var13 == 0) {
                                  continue L12;
                                } else {
                                  break L13;
                                }
                              }
                            }
                          }
                          var6 = (Object) (Object) ((dc) this).field_g.field_e;
                          var7 = 0;
                          L14: while (true) {
                            if (~var7 <= ~((Object[]) var6).length) {
                              break L11;
                            } else {
                              var8 = ((Object[]) var6)[var7];
                              stackOut_22_0 = (ln) var8;
                              stackIn_90_0 = stackOut_22_0;
                              stackIn_23_0 = stackOut_22_0;
                              if (var13 != 0) {
                                L15: while (true) {
                                  stackIn_90_0.field_C = 0;
                                  var7++;
                                  if (var13 != 0) {
                                    break L7;
                                  } else {
                                    if (var13 == 0) {
                                      if (((Object[]) var6).length <= var7) {
                                        break L8;
                                      } else {
                                        var8 = ((Object[]) var6)[var7];
                                        ((ln) var8).field_Q = 0;
                                        stackOut_89_0 = var8;
                                        stackIn_90_0 = (ln) (Object) stackOut_89_0;
                                        continue L15;
                                      }
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                              } else {
                                L16: {
                                  if (stackIn_23_0.field_y != null) {
                                    param3.field_l[((ln) var8).field_y.field_x] = param3.field_l[((ln) var8).field_y.field_x] + ((ln) var8).field_x;
                                    break L16;
                                  } else {
                                    break L16;
                                  }
                                }
                                var7++;
                                if (var13 == 0) {
                                  continue L14;
                                } else {
                                  break L11;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    this.a(param2, 82, param3);
                    this.a(param1 + 12268, param2, var5_array, param3, param0);
                    this.a(param2, param0, 14389);
                    this.a(param3, param0, 7377, param2);
                    this.a(param1, param2);
                    ((dc) this).e(0);
                    this.a(param2, 0);
                    this.h(param1 ^ -6);
                    break L10;
                  }
                  L17: {
                    if (param3 != null) {
                      var6_int = 0;
                      L18: while (true) {
                        L19: {
                          if (var6_int >= ((dc) this).field_r) {
                            break L19;
                          } else {
                            if (var13 != 0) {
                              break L17;
                            } else {
                              L20: {
                                if (param3.field_f[var6_int] < 1) {
                                  break L20;
                                } else {
                                  break L20;
                                }
                              }
                              L21: {
                                if (param3.field_h[var6_int] == 4) {
                                  param3.field_j[var6_int][22] = true;
                                  break L21;
                                } else {
                                  break L21;
                                }
                              }
                              var6_int++;
                              if (var13 == 0) {
                                continue L18;
                              } else {
                                break L19;
                              }
                            }
                          }
                        }
                        var6 = null;
                        var7 = 1;
                        var8 = null;
                        var9 = 1;
                        var10_ref_ln__ = ((dc) this).field_g.field_e;
                        var11 = 0;
                        L22: while (true) {
                          L23: {
                            L24: {
                              L25: {
                                if (var10_ref_ln__.length <= var11) {
                                  break L25;
                                } else {
                                  var12_ref_ln = var10_ref_ln__[var11];
                                  stackOut_41_0 = -3;
                                  stackOut_41_1 = ~var12_ref_ln.field_L;
                                  stackIn_70_0 = stackOut_41_0;
                                  stackIn_70_1 = stackOut_41_1;
                                  stackIn_42_0 = stackOut_41_0;
                                  stackIn_42_1 = stackOut_41_1;
                                  if (var13 != 0) {
                                    break L24;
                                  } else {
                                    L26: {
                                      if (stackIn_42_0 != stackIn_42_1) {
                                        break L26;
                                      } else {
                                        L27: {
                                          if (var9 != 0) {
                                            stackOut_45_0 = 0;
                                            stackIn_46_0 = stackOut_45_0;
                                            break L27;
                                          } else {
                                            stackOut_44_0 = 1;
                                            stackIn_46_0 = stackOut_44_0;
                                            break L27;
                                          }
                                        }
                                        if (stackIn_46_0 == 1) {
                                          break L26;
                                        } else {
                                          L28: {
                                            if (var12_ref_ln.field_y != null) {
                                              break L28;
                                            } else {
                                              var9 = 0;
                                              if (var13 == 0) {
                                                break L26;
                                              } else {
                                                break L28;
                                              }
                                            }
                                          }
                                          L29: {
                                            if (var8 == null) {
                                              break L29;
                                            } else {
                                              if ((Object) (Object) var12_ref_ln.field_y != var8) {
                                                var9 = 0;
                                                if (var13 == 0) {
                                                  break L26;
                                                } else {
                                                  break L29;
                                                }
                                              } else {
                                                break L26;
                                              }
                                            }
                                          }
                                          var8 = (Object) (Object) var12_ref_ln.field_y;
                                          break L26;
                                        }
                                      }
                                    }
                                    L30: {
                                      if (var12_ref_ln.field_L != 3) {
                                        break L30;
                                      } else {
                                        if (var7 == 0) {
                                          break L30;
                                        } else {
                                          L31: {
                                            if (null == var12_ref_ln.field_y) {
                                              break L31;
                                            } else {
                                              L32: {
                                                if (var6 != null) {
                                                  break L32;
                                                } else {
                                                  var6 = (Object) (Object) var12_ref_ln.field_y;
                                                  if (var13 == 0) {
                                                    break L30;
                                                  } else {
                                                    break L32;
                                                  }
                                                }
                                              }
                                              if (var6 != (Object) (Object) var12_ref_ln.field_y) {
                                                var7 = 0;
                                                if (var13 == 0) {
                                                  break L30;
                                                } else {
                                                  break L31;
                                                }
                                              } else {
                                                break L30;
                                              }
                                            }
                                          }
                                          var7 = 0;
                                          break L30;
                                        }
                                      }
                                    }
                                    var11++;
                                    if (var13 == 0) {
                                      continue L22;
                                    } else {
                                      break L25;
                                    }
                                  }
                                }
                              }
                              L33: {
                                if (var7 == 0) {
                                  break L33;
                                } else {
                                  if (4 <= ((dc) this).field_r) {
                                    param3.field_j[((fs) var6).field_x][21] = true;
                                    break L33;
                                  } else {
                                    break L33;
                                  }
                                }
                              }
                              if (var9 == 0) {
                                break L23;
                              } else {
                                stackOut_69_0 = ~((dc) this).field_r;
                                stackOut_69_1 = -5;
                                stackIn_70_0 = stackOut_69_0;
                                stackIn_70_1 = stackOut_69_1;
                                break L24;
                              }
                            }
                            if (stackIn_70_0 > stackIn_70_1) {
                              break L23;
                            } else {
                              if (!(((dc) this).field_x instanceof hp)) {
                                break L23;
                              } else {
                                param3.field_j[((fs) var8).field_x][19] = true;
                                break L23;
                              }
                            }
                          }
                          var10 = 0;
                          L34: while (true) {
                            if (var10 >= ((dc) this).field_v.length) {
                              break L17;
                            } else {
                              var11 = 1;
                              var12 = 0;
                              L35: while (true) {
                                L36: {
                                  L37: {
                                    if (var12 >= 4) {
                                      break L37;
                                    } else {
                                      stackOut_77_0 = param3.field_d[var10][var12];
                                      stackIn_84_0 = stackOut_77_0 ? 1 : 0;
                                      stackIn_78_0 = stackOut_77_0;
                                      if (var13 != 0) {
                                        break L36;
                                      } else {
                                        L38: {
                                          if (!stackIn_78_0) {
                                            var11 = 0;
                                            if (var13 == 0) {
                                              break L37;
                                            } else {
                                              break L38;
                                            }
                                          } else {
                                            break L38;
                                          }
                                        }
                                        var12++;
                                        if (var13 == 0) {
                                          continue L35;
                                        } else {
                                          break L37;
                                        }
                                      }
                                    }
                                  }
                                  stackOut_83_0 = var11;
                                  stackIn_84_0 = stackOut_83_0;
                                  break L36;
                                }
                                L39: {
                                  if (stackIn_84_0 == 0) {
                                    break L39;
                                  } else {
                                    param3.field_j[var10][24] = true;
                                    break L39;
                                  }
                                }
                                var10++;
                                if (var13 == 0) {
                                  continue L34;
                                } else {
                                  break L17;
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      break L17;
                    }
                  }
                  var6 = (Object) (Object) ((dc) this).field_g.field_e;
                  var7 = 0;
                  L40: while (true) {
                    if (((Object[]) var6).length <= var7) {
                      break L8;
                    } else {
                      var8 = ((Object[]) var6)[var7];
                      ((ln) var8).field_Q = 0;
                      stackOut_89_0 = var8;
                      stackIn_90_0 = (ln) (Object) stackOut_89_0;
                      stackIn_90_0.field_C = 0;
                      var7++;
                      if (var13 != 0) {
                        break L7;
                      } else {
                        if (var13 == 0) {
                          continue L40;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                }
                break L8;
              }
              ((dc) this).b(-60);
              ((dc) this).field_O = ((dc) this).field_O + 1;
              ((dc) this).field_g.b((byte) 80);
              break L7;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L41: {
            var5 = decompiledCaughtException;
            stackOut_95_0 = (RuntimeException) var5;
            stackOut_95_1 = new StringBuilder().append("dc.E(").append(param0).append(44).append(param1).append(44);
            stackIn_97_0 = stackOut_95_0;
            stackIn_97_1 = stackOut_95_1;
            stackIn_96_0 = stackOut_95_0;
            stackIn_96_1 = stackOut_95_1;
            if (param2 == null) {
              stackOut_97_0 = (RuntimeException) (Object) stackIn_97_0;
              stackOut_97_1 = (StringBuilder) (Object) stackIn_97_1;
              stackOut_97_2 = "null";
              stackIn_98_0 = stackOut_97_0;
              stackIn_98_1 = stackOut_97_1;
              stackIn_98_2 = stackOut_97_2;
              break L41;
            } else {
              stackOut_96_0 = (RuntimeException) (Object) stackIn_96_0;
              stackOut_96_1 = (StringBuilder) (Object) stackIn_96_1;
              stackOut_96_2 = "{...}";
              stackIn_98_0 = stackOut_96_0;
              stackIn_98_1 = stackOut_96_1;
              stackIn_98_2 = stackOut_96_2;
              break L41;
            }
          }
          L42: {
            stackOut_98_0 = (RuntimeException) (Object) stackIn_98_0;
            stackOut_98_1 = ((StringBuilder) (Object) stackIn_98_1).append(stackIn_98_2).append(44);
            stackIn_100_0 = stackOut_98_0;
            stackIn_100_1 = stackOut_98_1;
            stackIn_99_0 = stackOut_98_0;
            stackIn_99_1 = stackOut_98_1;
            if (param3 == null) {
              stackOut_100_0 = (RuntimeException) (Object) stackIn_100_0;
              stackOut_100_1 = (StringBuilder) (Object) stackIn_100_1;
              stackOut_100_2 = "null";
              stackIn_101_0 = stackOut_100_0;
              stackIn_101_1 = stackOut_100_1;
              stackIn_101_2 = stackOut_100_2;
              break L42;
            } else {
              stackOut_99_0 = (RuntimeException) (Object) stackIn_99_0;
              stackOut_99_1 = (StringBuilder) (Object) stackIn_99_1;
              stackOut_99_2 = "{...}";
              stackIn_101_0 = stackOut_99_0;
              stackIn_101_1 = stackOut_99_1;
              stackIn_101_2 = stackOut_99_2;
              break L42;
            }
          }
          throw r.a((Throwable) (Object) stackIn_101_0, stackIn_101_2 + 41);
        }
    }

    private final void a(k param0, int param1, se param2) {
        RuntimeException var4 = null;
        qm var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 > 40) {
                break L1;
              } else {
                this.b((byte) 111);
                break L1;
              }
            }
            if (!((dc) this).field_o.field_h) {
              return;
            } else {
              var4_ref = (qm) (Object) ((dc) this).field_i.d(0);
              L2: while (true) {
                L3: {
                  L4: {
                    L5: {
                      if (var4_ref == null) {
                        break L5;
                      } else {
                        stackOut_8_0 = 0;
                        stackOut_8_1 = var4_ref.field_o;
                        stackIn_25_0 = stackOut_8_0;
                        stackIn_25_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (var6 != 0) {
                          L6: while (true) {
                            L7: {
                              if (stackIn_25_0 == stackIn_25_1) {
                                if (var4_ref.field_q.field_y == var4_ref.field_p) {
                                  break L7;
                                } else {
                                  L8: {
                                    if (null == var4_ref.field_q.field_y) {
                                      break L8;
                                    } else {
                                      if (var4_ref.field_p.field_h[var4_ref.field_q.field_y.field_x]) {
                                        break L7;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                  L9: {
                                    var4_ref.field_p.field_u[2] = 0;
                                    var5 = this.b((byte) 95, var4_ref.field_q);
                                    if (param0 == null) {
                                      break L9;
                                    } else {
                                      param0.a(var5, var4_ref.field_q, var4_ref.field_p, -81);
                                      break L9;
                                    }
                                  }
                                  if (param2 != null) {
                                    param2.field_b[var4_ref.field_p.field_x] = param2.field_b[var4_ref.field_p.field_x] + var5;
                                    param2.field_h[var4_ref.field_p.field_x] = param2.field_h[var4_ref.field_p.field_x] + 1;
                                    if (((dc) this).field_O <= 0) {
                                      break L7;
                                    } else {
                                      L10: {
                                        if (ab.field_c[((dc) this).field_G] == 2) {
                                          break L10;
                                        } else {
                                          if (lr.field_b[((dc) this).field_n] != 2) {
                                            break L7;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                      param2.field_d[var4_ref.field_p.field_x][2] = true;
                                      break L7;
                                    }
                                  } else {
                                    break L7;
                                  }
                                }
                              } else {
                                break L7;
                              }
                            }
                            L11: {
                              if (var4_ref.field_o != 2) {
                                var4_ref.field_p.field_u[var4_ref.field_o] = 0;
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                            var4_ref = (qm) (Object) ((dc) this).field_i.a((byte) -71);
                            if (var6 == 0) {
                              if (var4_ref == null) {
                                break L3;
                              } else {
                                if (var6 != 0) {
                                  break L4;
                                } else {
                                  stackOut_24_0 = var4_ref.field_o;
                                  stackOut_24_1 = 2;
                                  stackIn_25_0 = stackOut_24_0;
                                  stackIn_25_1 = stackOut_24_1;
                                  continue L6;
                                }
                              }
                            } else {
                              break L3;
                            }
                          }
                        } else {
                          L12: {
                            if (stackIn_9_0 == stackIn_9_1) {
                              L13: {
                                this.a(var4_ref.field_q, true);
                                if (param0 != null) {
                                  param0.a(0, var4_ref.field_q, var4_ref.field_p);
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              if (param2 == null) {
                                break L12;
                              } else {
                                param2.field_h[var4_ref.field_p.field_x] = param2.field_h[var4_ref.field_p.field_x] + 1;
                                if (((dc) this).field_O <= 0) {
                                  break L12;
                                } else {
                                  L14: {
                                    if (0 == ab.field_c[((dc) this).field_G]) {
                                      break L14;
                                    } else {
                                      if (lr.field_b[((dc) this).field_n] == 0) {
                                        break L14;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  param2.field_d[var4_ref.field_p.field_x][0] = true;
                                  break L12;
                                }
                              }
                            } else {
                              break L12;
                            }
                          }
                          var4_ref = (qm) (Object) ((dc) this).field_i.a((byte) -71);
                          if (var6 == 0) {
                            continue L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    var4_ref = (qm) (Object) ((dc) this).field_i.d(0);
                    L15: while (true) {
                      if (var4_ref == null) {
                        break L3;
                      } else {
                        if (var6 != 0) {
                          break L4;
                        } else {
                          stackOut_24_0 = var4_ref.field_o;
                          stackOut_24_1 = 2;
                          stackIn_25_0 = stackOut_24_0;
                          stackIn_25_1 = stackOut_24_1;
                          L16: {
                            if (stackIn_25_0 == stackIn_25_1) {
                              if (var4_ref.field_q.field_y == var4_ref.field_p) {
                                break L16;
                              } else {
                                L17: {
                                  if (null == var4_ref.field_q.field_y) {
                                    break L17;
                                  } else {
                                    if (var4_ref.field_p.field_h[var4_ref.field_q.field_y.field_x]) {
                                      break L16;
                                    } else {
                                      break L17;
                                    }
                                  }
                                }
                                L18: {
                                  var4_ref.field_p.field_u[2] = 0;
                                  var5 = this.b((byte) 95, var4_ref.field_q);
                                  if (param0 == null) {
                                    break L18;
                                  } else {
                                    param0.a(var5, var4_ref.field_q, var4_ref.field_p, -81);
                                    break L18;
                                  }
                                }
                                if (param2 != null) {
                                  param2.field_b[var4_ref.field_p.field_x] = param2.field_b[var4_ref.field_p.field_x] + var5;
                                  param2.field_h[var4_ref.field_p.field_x] = param2.field_h[var4_ref.field_p.field_x] + 1;
                                  if (((dc) this).field_O <= 0) {
                                    break L16;
                                  } else {
                                    L19: {
                                      if (ab.field_c[((dc) this).field_G] == 2) {
                                        break L19;
                                      } else {
                                        if (lr.field_b[((dc) this).field_n] != 2) {
                                          break L16;
                                        } else {
                                          break L19;
                                        }
                                      }
                                    }
                                    param2.field_d[var4_ref.field_p.field_x][2] = true;
                                    break L16;
                                  }
                                } else {
                                  break L16;
                                }
                              }
                            } else {
                              break L16;
                            }
                          }
                          L20: {
                            if (var4_ref.field_o != 2) {
                              var4_ref.field_p.field_u[var4_ref.field_o] = 0;
                              break L20;
                            } else {
                              break L20;
                            }
                          }
                          var4_ref = (qm) (Object) ((dc) this).field_i.a((byte) -71);
                          if (var6 == 0) {
                            continue L15;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var4 = decompiledCaughtException;
            stackOut_45_0 = (RuntimeException) var4;
            stackOut_45_1 = new StringBuilder().append("dc.HB(");
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param0 == null) {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L21;
            } else {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L21;
            }
          }
          L22: {
            stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
            stackOut_48_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(44).append(param1).append(44);
            stackIn_50_0 = stackOut_48_0;
            stackIn_50_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param2 == null) {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L22;
            } else {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "{...}";
              stackIn_51_0 = stackOut_49_0;
              stackIn_51_1 = stackOut_49_1;
              stackIn_51_2 = stackOut_49_2;
              break L22;
            }
          }
          throw r.a((Throwable) (Object) stackIn_51_0, stackIn_51_2 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, l param1) {
        RuntimeException var3 = null;
        qa var3_ref = null;
        mg var4 = null;
        qm var5 = null;
        cs var6 = null;
        int var7 = 0;
        mg stackIn_11_0 = null;
        Object stackIn_13_0 = null;
        ln stackIn_16_0 = null;
        Object stackIn_20_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        mg stackOut_10_0 = null;
        oh stackOut_12_0 = null;
        ln stackOut_15_0 = null;
        oh stackOut_19_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            ((dc) this).field_g = param1;
            var3_ref = (qa) (Object) ((dc) this).field_q.d(0);
            L1: while (true) {
              L2: {
                L3: {
                  if (var3_ref == null) {
                    break L3;
                  } else {
                    var3_ref.field_u = ((dc) this).field_g.field_e[var3_ref.field_u.field_p];
                    var3_ref = (qa) (Object) ((dc) this).field_q.a((byte) -71);
                    if (var7 != 0) {
                      break L2;
                    } else {
                      if (var7 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 > 55) {
                  break L2;
                } else {
                  ((dc) this).a(-110, -110, (k) null, (se) null);
                  break L2;
                }
              }
              var4 = (mg) (Object) ((dc) this).field_p.a(true);
              L4: while (true) {
                L5: {
                  L6: {
                    if (var4 == null) {
                      break L6;
                    } else {
                      var4.field_y = ((dc) this).field_g.field_e[var4.field_y.field_p];
                      var4.field_B = ((dc) this).field_g.field_e[var4.field_B.field_p];
                      var4.field_B.field_s.a((df) (Object) var4, 32);
                      var4.field_y.field_T.a((byte) -113, (oh) (Object) var4);
                      stackOut_10_0 = (mg) (Object) ((dc) this).field_p.a((byte) -68);
                      stackIn_13_0 = (Object) (Object) stackOut_10_0;
                      stackIn_11_0 = stackOut_10_0;
                      if (var7 != 0) {
                        break L5;
                      } else {
                        var4 = stackIn_11_0;
                        if (var7 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  stackOut_12_0 = ((dc) this).field_i.d(0);
                  stackIn_13_0 = (Object) (Object) stackOut_12_0;
                  break L5;
                }
                var5 = (qm) (Object) stackIn_13_0;
                L7: while (true) {
                  L8: {
                    L9: {
                      if (var5 == null) {
                        break L9;
                      } else {
                        var5.field_q = ((dc) this).field_g.field_e[var5.field_q.field_p];
                        stackOut_15_0 = var5.field_r;
                        stackIn_20_0 = (Object) (Object) stackOut_15_0;
                        stackIn_16_0 = stackOut_15_0;
                        if (var7 != 0) {
                          break L8;
                        } else {
                          L10: {
                            if (stackIn_16_0 == null) {
                              break L10;
                            } else {
                              var5.field_r = ((dc) this).field_g.field_e[var5.field_r.field_p];
                              break L10;
                            }
                          }
                          var5 = (qm) (Object) ((dc) this).field_i.a((byte) -71);
                          if (var7 == 0) {
                            continue L7;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    stackOut_19_0 = ((dc) this).field_A.d(0);
                    stackIn_20_0 = (Object) (Object) stackOut_19_0;
                    break L8;
                  }
                  var6 = (cs) (Object) stackIn_20_0;
                  L11: while (true) {
                    L12: {
                      if (var6 == null) {
                        break L12;
                      } else {
                        var6.field_n = ((dc) this).field_g.field_e[var6.field_n.field_p];
                        var6.field_k = ((dc) this).field_g.field_e[var6.field_k.field_p];
                        var6 = (cs) (Object) ((dc) this).field_A.a((byte) -71);
                        if (var7 != 0) {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          if (var7 == 0) {
                            continue L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                    }
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var3 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var3;
            stackOut_26_1 = new StringBuilder().append("dc.G(").append(param0).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L13;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L13;
            }
          }
          throw r.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void h(int param0) {
        fs[] var2 = null;
        fs[] var3 = null;
        L0: {
          if (param0 == -5) {
            break L0;
          } else {
            ((dc) this).field_t = null;
            break L0;
          }
        }
        L1: {
          if (((dc) this).field_x.a((dc) this, (byte) 121)) {
            var3 = ((dc) this).field_x.a((byte) -23);
            var2 = var3;
            if (var2 == null) {
              throw new RuntimeException("VictoryChecker claims someone has won, but winners array is null.");
            } else {
              L2: {
                if (var3.length == 1) {
                  break L2;
                } else {
                  ((dc) this).a(-1, param0 + 8);
                  if (!ShatteredPlansClient.field_F) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((dc) this).a(var3[0].field_x, param0 + 8);
              break L1;
            }
          } else {
            break L1;
          }
        }
    }

    private final void a(ln param0, eg param1, int param2) {
        RuntimeException runtimeException = null;
        mg var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == -30724) {
                break L1;
              } else {
                ((dc) this).a(-115, 106, (k) null, (se) null);
                break L1;
              }
            }
            var4 = (mg) (Object) param0.field_s.c(-127);
            L2: while (true) {
              L3: {
                if (var4 == null) {
                  break L3;
                } else {
                  if (var8 != 0) {
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    L4: {
                      if (var4.field_G == param0.field_y) {
                        break L4;
                      } else {
                        L5: {
                          var5 = ((dc) this).field_h[var4.field_G.field_x];
                          var6 = ((dc) this).field_u[var4.field_G.field_x];
                          var7 = var6 * var4.field_z / var5;
                          if (0 == var7) {
                            break L5;
                          } else {
                            if (param1 == null) {
                              break L5;
                            } else {
                              param1.a(var7, 0, var4, 0);
                              break L5;
                            }
                          }
                        }
                        var4.field_y.field_C = var4.field_y.field_C + var7;
                        break L4;
                      }
                    }
                    var4 = (mg) (Object) param0.field_s.b(32);
                    if (var8 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) runtimeException;
            stackOut_13_1 = new StringBuilder().append("dc.SA(");
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
          throw r.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param2 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static gl[] a(qb param0, byte param1) {
        RuntimeException var2 = null;
        pb var2_ref = null;
        int[] var3 = null;
        gl[] var4 = null;
        int var5 = 0;
        gl var6 = null;
        int var7 = 0;
        gl[] stackIn_3_0 = null;
        gl[] stackIn_12_0 = null;
        gl[] stackIn_18_0 = null;
        gl[] stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        gl[] stackOut_17_0 = null;
        gl[] stackOut_20_0 = null;
        gl[] stackOut_11_0 = null;
        gl[] stackOut_2_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param0.a(false)) {
              var2_ref = param0.a(12);
              L1: while (true) {
                L2: {
                  L3: {
                    if (0 != var2_ref.field_d) {
                      break L3;
                    } else {
                      jb.a((byte) -100, 10L);
                      if (var7 != 0) {
                        break L2;
                      } else {
                        if (var7 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  if (var2_ref.field_d == 2) {
                    break L2;
                  } else {
                    L4: {
                      var3 = (int[]) var2_ref.field_e;
                      var4 = new gl[var3.length >> 2];
                      if (param1 == -57) {
                        break L4;
                      } else {
                        field_a = null;
                        break L4;
                      }
                    }
                    var5 = 0;
                    L5: while (true) {
                      L6: {
                        L7: {
                          if (var5 >= var4.length) {
                            break L7;
                          } else {
                            var6 = new gl();
                            stackOut_17_0 = (gl[]) var4;
                            stackIn_21_0 = stackOut_17_0;
                            stackIn_18_0 = stackOut_17_0;
                            if (var7 != 0) {
                              break L6;
                            } else {
                              stackIn_18_0[var5] = var6;
                              var6.field_g = var3[var5 << 2];
                              var6.field_c = var3[1 + (var5 << 2)];
                              var6.field_d = var3[(var5 << 2) - -2];
                              var6.field_f = var3[(var5 << 2) - -3];
                              var5++;
                              if (var7 == 0) {
                                continue L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        stackOut_20_0 = (gl[]) var4;
                        stackIn_21_0 = stackOut_20_0;
                        break L6;
                      }
                      break L0;
                    }
                  }
                }
                stackOut_11_0 = new gl[]{};
                stackIn_12_0 = stackOut_11_0;
                return stackIn_12_0;
              }
            } else {
              stackOut_2_0 = new gl[]{};
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("dc.AA(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw r.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param1 + 41);
        }
        return stackIn_21_0;
    }

    private final void a(int param0, ln param1) {
        try {
            if (param0 != -21031) {
                ((dc) this).field_n = 59;
            }
            this.a((byte) 98, param1);
            param1.field_y = null;
            param1.field_N = 0;
            param1.field_x = 0;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "dc.FA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final String a(byte param0) {
        if (param0 >= -3) {
            return null;
        }
        if (!(0 < ((dc) this).field_O)) {
            return ek.field_H;
        }
        return re.a(tq.field_i, 4371, new String[1]);
    }

    final static void a(int param0) {
        tk.field_z = pr.a(14274);
        vj.field_C = 0;
        if (param0 != -5883) {
            dc.e((byte) 95);
        }
    }

    private final void a(int param0, k param1, boolean[][] param2, se param3, int param4) {
        ln[] var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        ln var8 = null;
        int var9 = 0;
        ln[] var10 = null;
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
        RuntimeException decompiledCaughtException = null;
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
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var10 = ((dc) this).field_g.field_e;
            var6 = var10;
            var7 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (var10.length <= var7) {
                      break L4;
                    } else {
                      var8 = var10[var7];
                      this.a(param4, var8, param3, param1, param2, (byte) 77);
                      var7++;
                      if (var9 != 0) {
                        break L3;
                      } else {
                        if (var9 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (param0 == 12269) {
                    break L3;
                  } else {
                    ((dc) this).field_k = -29;
                    break L2;
                  }
                }
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var6_ref;
            stackOut_9_1 = new StringBuilder().append("dc.AB(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L5;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L5;
            }
          }
          L6: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L6;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L6;
            }
          }
          L7: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L7;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L7;
            }
          }
          throw r.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param4 + 41);
        }
    }

    private final void a(fs param0, ln param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        ln[] var4_array = null;
        int var5 = 0;
        ln var6 = null;
        int var7 = 0;
        ln[] var8 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param1.field_y == param0) {
              return;
            } else {
              L1: {
                L2: {
                  L3: {
                    param1.field_y = param0;
                    if (param0 == param1.field_t) {
                      break L3;
                    } else {
                      if (param1.field_G[0] < 0) {
                        break L3;
                      } else {
                        var4_int = 0;
                        L4: while (true) {
                          if (var4_int >= 4) {
                            break L3;
                          } else {
                            if (var7 != 0) {
                              break L2;
                            } else {
                              L5: {
                                param0.field_u[var4_int] = param0.field_u[var4_int] + param1.field_G[var4_int];
                                if (5 >= param0.field_u[var4_int] + param1.field_G[var4_int]) {
                                  break L5;
                                } else {
                                  L6: {
                                    if (null == param0.field_q) {
                                      break L6;
                                    } else {
                                      param0.field_q.field_d = param0.field_q.field_d + (param0.field_u[var4_int] + -5);
                                      break L6;
                                    }
                                  }
                                  param0.field_u[var4_int] = 5;
                                  break L5;
                                }
                              }
                              var4_int++;
                              if (var7 == 0) {
                                continue L4;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  if (null != param1.field_R) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
                this.a((byte) 122, param1);
                break L1;
              }
              this.b(0, param1);
              this.a(param1, false, (byte) 117);
              var8 = param1.field_D;
              var4_array = var8;
              var5 = 0;
              L7: while (true) {
                L8: {
                  L9: {
                    if (var8.length <= var5) {
                      break L9;
                    } else {
                      var6 = var8[var5];
                      this.a(var6, false, (byte) 119);
                      var5++;
                      if (var7 != 0) {
                        break L8;
                      } else {
                        if (var7 == 0) {
                          continue L7;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                  param1.field_y.field_m.a(-21771, param1);
                  break L8;
                }
                L10: {
                  if (null != param1.field_y.field_m.field_q) {
                    break L10;
                  } else {
                    param1.field_y.field_m.field_q = param1;
                    break L10;
                  }
                }
                sh.a((sd) (Object) param1.field_y.field_m, -5);
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var4;
            stackOut_27_1 = new StringBuilder().append("dc.VA(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L11;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L11;
            }
          }
          L12: {
            stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(44);
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L12;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L12;
            }
          }
          throw r.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 44 + 0 + 41);
        }
    }

    final boolean[][] b(int param0, int param1) {
        boolean[][] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        boolean[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        boolean[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        boolean[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_6_0 = null;
        boolean[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        boolean[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        boolean[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        var3 = new boolean[((dc) this).field_r][((dc) this).field_r];
        var4 = -2 + ((dc) this).field_r;
        if (param1 == 0) {
          L0: while (true) {
            L1: {
              if (0 > var4) {
                break L1;
              } else {
                stackOut_3_0 = this;
                stackIn_4_0 = stackOut_3_0;
                L2: while (true) {
                  var5 = ((dc) this).field_r + -1;
                  L3: while (true) {
                    L4: {
                      if (~var5 >= ~var4) {
                        break L4;
                      } else {
                        stackOut_6_0 = this;
                        stackIn_4_0 = stackOut_6_0;
                        stackIn_7_0 = stackOut_6_0;
                        if (var6 != 0) {
                          continue L2;
                        } else {
                          L5: {
                            stackOut_7_0 = ((dc) this).field_v[var4].field_h;
                            stackOut_7_1 = var5;
                            stackIn_9_0 = stackOut_7_0;
                            stackIn_9_1 = stackOut_7_1;
                            stackIn_8_0 = stackOut_7_0;
                            stackIn_8_1 = stackOut_7_1;
                            if (we.a(param0, 1) == 0) {
                              stackOut_9_0 = (boolean[]) (Object) stackIn_9_0;
                              stackOut_9_1 = stackIn_9_1;
                              stackOut_9_2 = 0;
                              stackIn_10_0 = stackOut_9_0;
                              stackIn_10_1 = stackOut_9_1;
                              stackIn_10_2 = stackOut_9_2;
                              break L5;
                            } else {
                              stackOut_8_0 = (boolean[]) (Object) stackIn_8_0;
                              stackOut_8_1 = stackIn_8_1;
                              stackOut_8_2 = 1;
                              stackIn_10_0 = stackOut_8_0;
                              stackIn_10_1 = stackOut_8_1;
                              stackIn_10_2 = stackOut_8_2;
                              break L5;
                            }
                          }
                          stackIn_10_0[stackIn_10_1] = stackIn_10_2 != 0;
                          param0 = param0 >> 1;
                          var5--;
                          if (var6 == 0) {
                            continue L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var4--;
                    if (var6 == 0) {
                      continue L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            return var3;
          }
        } else {
          return null;
        }
    }

    private final void a(int param0, eg param1, ln param2) {
        RuntimeException var4 = null;
        mg var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                this.a((ln) null, 79, (ln) null);
                break L1;
              }
            }
            var4_ref = (mg) (Object) param2.field_s.c(-128);
            L2: while (true) {
              L3: {
                if (var4_ref == null) {
                  break L3;
                } else {
                  var5 = ((dc) this).field_h[var4_ref.field_G.field_x];
                  var6 = ((dc) this).field_B[var4_ref.field_G.field_x];
                  var7 = var6 * var4_ref.field_z / var5;
                  if (var8 != 0) {
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    L4: {
                      if (param2.field_y != var4_ref.field_G) {
                        break L4;
                      } else {
                        var7 = var4_ref.field_z * (-param2.field_x + var6) / var5;
                        break L4;
                      }
                    }
                    L5: {
                      if (var7 == 0) {
                        break L5;
                      } else {
                        if (param1 == null) {
                          break L5;
                        } else {
                          param1.a(var7, 0, var4_ref, 0);
                          break L5;
                        }
                      }
                    }
                    var4_ref.field_y.field_C = var4_ref.field_y.field_C + var7;
                    var4_ref = (mg) (Object) param2.field_s.b(32);
                    if (var8 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("dc.S(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
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
            if (param2 == null) {
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
          throw r.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final boolean a(byte param0, k param1, ln param2) {
        RuntimeException var4 = null;
        mg var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        fs stackIn_10_0 = null;
        k stackIn_19_0 = null;
        ln stackIn_19_1 = null;
        fs stackIn_19_2 = null;
        int stackIn_19_3 = 0;
        k stackIn_20_0 = null;
        ln stackIn_20_1 = null;
        fs stackIn_20_2 = null;
        int stackIn_20_3 = 0;
        k stackIn_21_0 = null;
        ln stackIn_21_1 = null;
        fs stackIn_21_2 = null;
        int stackIn_21_3 = 0;
        int stackIn_21_4 = 0;
        fs stackIn_26_0 = null;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        fs stackOut_9_0 = null;
        fs stackOut_25_0 = null;
        k stackOut_18_0 = null;
        ln stackOut_18_1 = null;
        fs stackOut_18_2 = null;
        int stackOut_18_3 = 0;
        k stackOut_20_0 = null;
        ln stackOut_20_1 = null;
        fs stackOut_20_2 = null;
        int stackOut_20_3 = 0;
        int stackOut_20_4 = 0;
        k stackOut_19_0 = null;
        ln stackOut_19_1 = null;
        fs stackOut_19_2 = null;
        int stackOut_19_3 = 0;
        int stackOut_19_4 = 0;
        int stackOut_29_0 = 0;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var5 = -118 % ((-37 - param0) / 36);
            var7 = 0;
            L1: while (true) {
              L2: {
                if (((dc) this).field_r <= var7) {
                  break L2;
                } else {
                  ((dc) this).field_h[var7] = 0;
                  var7++;
                  if (var8 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                var6 = 0;
                if (null != param2.field_y) {
                  ((dc) this).field_h[param2.field_y.field_x] = param2.field_x;
                  break L3;
                } else {
                  break L3;
                }
              }
              var4_ref = (mg) (Object) param2.field_s.c(-128);
              L4: while (true) {
                L5: {
                  L6: {
                    if (var4_ref == null) {
                      break L6;
                    } else {
                      stackOut_9_0 = var4_ref.field_G;
                      stackIn_26_0 = stackOut_9_0;
                      stackIn_10_0 = stackOut_9_0;
                      if (var8 != 0) {
                        L7: while (true) {
                          L8: {
                            if (stackIn_26_0 == null) {
                              break L8;
                            } else {
                              ((dc) this).field_h[var4_ref.field_G.field_x] = ((dc) this).field_h[var4_ref.field_G.field_x] - var4_ref.field_z;
                              break L8;
                            }
                          }
                          var4_ref = (mg) (Object) param2.field_T.a((byte) -71);
                          if (var8 == 0) {
                            if (var4_ref == null) {
                              break L5;
                            } else {
                              stackOut_25_0 = var4_ref.field_G;
                              stackIn_26_0 = stackOut_25_0;
                              continue L7;
                            }
                          } else {
                            break L5;
                          }
                        }
                      } else {
                        L9: {
                          if (stackIn_10_0 == null) {
                            break L9;
                          } else {
                            ((dc) this).field_h[var4_ref.field_G.field_x] = ((dc) this).field_h[var4_ref.field_G.field_x] + var4_ref.field_z;
                            if (param2.field_y == var4_ref.field_G) {
                              break L9;
                            } else {
                              var6 = 1;
                              break L9;
                            }
                          }
                        }
                        var4_ref = (mg) (Object) param2.field_s.b(32);
                        if (var8 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  L10: {
                    L11: {
                      if (param1 == null) {
                        break L11;
                      } else {
                        var4_ref = (mg) (Object) param2.field_s.c(-127);
                        L12: while (true) {
                          if (var4_ref == null) {
                            break L11;
                          } else {
                            if (var8 != 0) {
                              break L10;
                            } else {
                              L13: {
                                stackOut_18_0 = (k) param1;
                                stackOut_18_1 = var4_ref.field_B;
                                stackOut_18_2 = var4_ref.field_G;
                                stackOut_18_3 = -62;
                                stackIn_20_0 = stackOut_18_0;
                                stackIn_20_1 = stackOut_18_1;
                                stackIn_20_2 = stackOut_18_2;
                                stackIn_20_3 = stackOut_18_3;
                                stackIn_19_0 = stackOut_18_0;
                                stackIn_19_1 = stackOut_18_1;
                                stackIn_19_2 = stackOut_18_2;
                                stackIn_19_3 = stackOut_18_3;
                                if (var4_ref.field_G == var4_ref.field_B.field_y) {
                                  stackOut_20_0 = (k) (Object) stackIn_20_0;
                                  stackOut_20_1 = (ln) (Object) stackIn_20_1;
                                  stackOut_20_2 = (fs) (Object) stackIn_20_2;
                                  stackOut_20_3 = stackIn_20_3;
                                  stackOut_20_4 = 0;
                                  stackIn_21_0 = stackOut_20_0;
                                  stackIn_21_1 = stackOut_20_1;
                                  stackIn_21_2 = stackOut_20_2;
                                  stackIn_21_3 = stackOut_20_3;
                                  stackIn_21_4 = stackOut_20_4;
                                  break L13;
                                } else {
                                  stackOut_19_0 = (k) (Object) stackIn_19_0;
                                  stackOut_19_1 = (ln) (Object) stackIn_19_1;
                                  stackOut_19_2 = (fs) (Object) stackIn_19_2;
                                  stackOut_19_3 = stackIn_19_3;
                                  stackOut_19_4 = 1;
                                  stackIn_21_0 = stackOut_19_0;
                                  stackIn_21_1 = stackOut_19_1;
                                  stackIn_21_2 = stackOut_19_2;
                                  stackIn_21_3 = stackOut_19_3;
                                  stackIn_21_4 = stackOut_19_4;
                                  break L13;
                                }
                              }
                              ((k) (Object) stackIn_21_0).a(stackIn_21_1, stackIn_21_2, (byte) stackIn_21_3, stackIn_21_4 != 0, var4_ref.field_z, var4_ref.field_y);
                              var4_ref = (mg) (Object) param2.field_s.b(32);
                              if (var8 == 0) {
                                continue L12;
                              } else {
                                break L11;
                              }
                            }
                          }
                        }
                      }
                    }
                    var4_ref = (mg) (Object) param2.field_T.d(0);
                    break L10;
                  }
                  L14: while (true) {
                    if (var4_ref == null) {
                      break L5;
                    } else {
                      stackOut_25_0 = var4_ref.field_G;
                      stackIn_26_0 = stackOut_25_0;
                      L15: {
                        if (stackIn_26_0 == null) {
                          break L15;
                        } else {
                          ((dc) this).field_h[var4_ref.field_G.field_x] = ((dc) this).field_h[var4_ref.field_G.field_x] - var4_ref.field_z;
                          break L15;
                        }
                      }
                      var4_ref = (mg) (Object) param2.field_T.a((byte) -71);
                      if (var8 == 0) {
                        continue L14;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                stackOut_29_0 = var6;
                stackIn_30_0 = stackOut_29_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var4 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var4;
            stackOut_31_1 = new StringBuilder().append("dc.RA(").append(param0).append(44);
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L16;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L16;
            }
          }
          L17: {
            stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
            stackOut_34_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(44);
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param2 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L17;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L17;
            }
          }
          throw r.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + 41);
        }
        return stackIn_30_0 != 0;
    }

    final void a(int param0, byte param1, ob param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        fs var6_ref_fs = null;
        int var6 = 0;
        ln var7 = null;
        mg var7_ref = null;
        ln var8 = null;
        int var9 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              ((dc) this).g(-7954);
              if (param1 <= -121) {
                break L1;
              } else {
                ((dc) this).field_g = null;
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                if (param0 <= 0) {
                  break L3;
                } else {
                  var4_int = param2.j(-70);
                  param0--;
                  if (var9 != 0) {
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    if (var4_int != 255) {
                      L4: {
                        L5: {
                          if (var4_int < 251) {
                            break L5;
                          } else {
                            L6: {
                              L7: {
                                var5 = var4_int - 251;
                                var6_ref_fs = ur.a((dc) this, 78, param2);
                                var7 = mg.a((dc) this, param2, 20);
                                if (var5 != 3) {
                                  break L7;
                                } else {
                                  var8 = mg.a((dc) this, param2, 20);
                                  ((dc) this).field_i.a((byte) -113, (oh) (Object) new qm(var5, var6_ref_fs, var7, var8));
                                  param0 -= 3;
                                  if (var9 == 0) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              param0 -= 2;
                              ((dc) this).field_i.a((byte) -113, (oh) (Object) new qm(var5, var6_ref_fs, var7));
                              break L6;
                            }
                            if (var9 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        L8: {
                          if (var4_int >= 192) {
                            break L8;
                          } else {
                            var5 = 1 + var4_int;
                            var6 = 0;
                            L9: while (true) {
                              L10: {
                                L11: {
                                  if (~var6 <= ~var5) {
                                    break L11;
                                  } else {
                                    var7_ref = qq.a((dc) this, 65, param2);
                                    ((dc) this).field_p.a((byte) 48, (vp) (Object) var7_ref);
                                    var7_ref.field_y.field_T.a((byte) -113, (oh) (Object) var7_ref);
                                    var7_ref.field_B.field_s.a((df) (Object) var7_ref, 32);
                                    var6++;
                                    if (var9 != 0) {
                                      break L10;
                                    } else {
                                      if (var9 == 0) {
                                        continue L9;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                }
                                param0 = param0 - var5 * 4;
                                break L10;
                              }
                              if (var9 == 0) {
                                break L4;
                              } else {
                                break L8;
                              }
                            }
                          }
                        }
                        var5 = -191 + var4_int;
                        param0 = param0 - 3 * var5;
                        var6 = 0;
                        L12: while (true) {
                          if (var5 <= var6) {
                            break L4;
                          } else {
                            ((dc) this).field_q.a((byte) -113, (oh) (Object) qj.a((byte) -85, (dc) this, param2));
                            var6++;
                            if (var9 != 0) {
                              continue L2;
                            } else {
                              if (var9 == 0) {
                                continue L12;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                      }
                      if (var9 == 0) {
                        continue L2;
                      } else {
                        break L3;
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var4 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var4;
            stackOut_26_1 = new StringBuilder().append("dc.CA(").append(param0).append(44).append(param1).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param2 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L13;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L13;
            }
          }
          throw r.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(ln param0, byte param1, Random param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
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
        RuntimeException decompiledCaughtException = null;
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
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (0 >= param0.field_L) {
              L1: {
                if (param1 > 100) {
                  break L1;
                } else {
                  ((dc) this).a((ob) null, (byte) -70, (fs) null);
                  break L1;
                }
              }
              var4_int = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (var4_int >= 4) {
                      break L4;
                    } else {
                      param0.field_G[var4_int] = 1;
                      var4_int++;
                      if (var5 != 0) {
                        break L3;
                      } else {
                        if (var5 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  int dupTemp$4 = qf.a((byte) 109, 4, param2);
                  param0.field_G[dupTemp$4] = param0.field_G[dupTemp$4] + 1;
                  int dupTemp$5 = qf.a((byte) 38, 4, param2);
                  param0.field_G[dupTemp$5] = param0.field_G[dupTemp$5] + 1;
                  param0.field_L = 1;
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
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) runtimeException;
            stackOut_12_1 = new StringBuilder().append("dc.DA(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          L6: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44).append(param1).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw r.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
    }

    private final void a(int param0, ln param1, se param2, k param3, boolean[][] param4, byte param5) {
        RuntimeException var7 = null;
        int var8 = 0;
        int var9_int = 0;
        Object var9 = null;
        fs[] var10 = null;
        int[] var10_array = null;
        int var10_int = 0;
        int var11 = 0;
        Object var12_ref = null;
        int var12 = 0;
        mg var12_ref_mg = null;
        int var13 = 0;
        int[] var14 = null;
        fs var15 = null;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        fs[] stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        fs[] stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        fs[] stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        fs stackIn_62_2 = null;
        int stackIn_75_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_134_0 = 0;
        int stackIn_134_1 = 0;
        int stackIn_138_0 = 0;
        int stackIn_138_1 = 0;
        RuntimeException stackIn_150_0 = null;
        StringBuilder stackIn_150_1 = null;
        RuntimeException stackIn_151_0 = null;
        StringBuilder stackIn_151_1 = null;
        RuntimeException stackIn_152_0 = null;
        StringBuilder stackIn_152_1 = null;
        String stackIn_152_2 = null;
        RuntimeException stackIn_153_0 = null;
        StringBuilder stackIn_153_1 = null;
        RuntimeException stackIn_154_0 = null;
        StringBuilder stackIn_154_1 = null;
        RuntimeException stackIn_155_0 = null;
        StringBuilder stackIn_155_1 = null;
        String stackIn_155_2 = null;
        RuntimeException stackIn_156_0 = null;
        StringBuilder stackIn_156_1 = null;
        RuntimeException stackIn_157_0 = null;
        StringBuilder stackIn_157_1 = null;
        RuntimeException stackIn_158_0 = null;
        StringBuilder stackIn_158_1 = null;
        String stackIn_158_2 = null;
        RuntimeException stackIn_159_0 = null;
        StringBuilder stackIn_159_1 = null;
        RuntimeException stackIn_160_0 = null;
        StringBuilder stackIn_160_1 = null;
        RuntimeException stackIn_161_0 = null;
        StringBuilder stackIn_161_1 = null;
        String stackIn_161_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        fs[] stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        fs[] stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        Object stackOut_61_2 = null;
        fs[] stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        fs stackOut_60_2 = null;
        int stackOut_73_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_133_0 = 0;
        int stackOut_133_1 = 0;
        int stackOut_137_0 = 0;
        int stackOut_137_1 = 0;
        RuntimeException stackOut_149_0 = null;
        StringBuilder stackOut_149_1 = null;
        RuntimeException stackOut_151_0 = null;
        StringBuilder stackOut_151_1 = null;
        String stackOut_151_2 = null;
        RuntimeException stackOut_150_0 = null;
        StringBuilder stackOut_150_1 = null;
        String stackOut_150_2 = null;
        RuntimeException stackOut_152_0 = null;
        StringBuilder stackOut_152_1 = null;
        RuntimeException stackOut_154_0 = null;
        StringBuilder stackOut_154_1 = null;
        String stackOut_154_2 = null;
        RuntimeException stackOut_153_0 = null;
        StringBuilder stackOut_153_1 = null;
        String stackOut_153_2 = null;
        RuntimeException stackOut_155_0 = null;
        StringBuilder stackOut_155_1 = null;
        RuntimeException stackOut_157_0 = null;
        StringBuilder stackOut_157_1 = null;
        String stackOut_157_2 = null;
        RuntimeException stackOut_156_0 = null;
        StringBuilder stackOut_156_1 = null;
        String stackOut_156_2 = null;
        RuntimeException stackOut_158_0 = null;
        StringBuilder stackOut_158_1 = null;
        RuntimeException stackOut_160_0 = null;
        StringBuilder stackOut_160_1 = null;
        String stackOut_160_2 = null;
        RuntimeException stackOut_159_0 = null;
        StringBuilder stackOut_159_1 = null;
        String stackOut_159_2 = null;
        var12_ref = null;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (!this.a((byte) 38, param3, param1)) {
              L1: {
                if (param1.field_y != null) {
                  param1.field_x = ((dc) this).field_h[param1.field_y.field_x];
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            } else {
              ((dc) this).field_L.setSeed((long)(param1.field_p ^ param0));
              ((dc) this).field_C = 0;
              var8 = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    L5: {
                      if (((dc) this).field_r <= var8) {
                        break L5;
                      } else {
                        var9_int = ((dc) this).field_h[var8];
                        ((dc) this).field_u[var8] = var9_int;
                        stackOut_9_0 = -1;
                        stackOut_9_1 = ~var9_int;
                        stackIn_52_0 = stackOut_9_0;
                        stackIn_52_1 = stackOut_9_1;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        if (var13 != 0) {
                          break L4;
                        } else {
                          L6: {
                            if (stackIn_10_0 > stackIn_10_1) {
                              int fieldTemp$3 = ((dc) this).field_C;
                              ((dc) this).field_C = ((dc) this).field_C + 1;
                              ((dc) this).field_K[fieldTemp$3] = var8;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          var8++;
                          if (var13 == 0) {
                            continue L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    L7: {
                      if (param1.field_y == null) {
                        stackOut_16_0 = ((dc) this).field_r;
                        stackIn_17_0 = stackOut_16_0;
                        break L7;
                      } else {
                        stackOut_15_0 = param1.field_y.field_x;
                        stackIn_17_0 = stackOut_15_0;
                        break L7;
                      }
                    }
                    L8: {
                      var8 = stackIn_17_0;
                      if (param2 == null) {
                        break L8;
                      } else {
                        if (null == param1.field_y) {
                          break L8;
                        } else {
                          var9_int = 0;
                          L9: while (true) {
                            stackOut_20_0 = ~((dc) this).field_r;
                            stackOut_20_1 = ~var9_int;
                            stackIn_21_0 = stackOut_20_0;
                            stackIn_21_1 = stackOut_20_1;
                            L10: while (true) {
                              if (stackIn_21_0 >= stackIn_21_1) {
                                break L8;
                              } else {
                                stackOut_22_0 = ~var9_int;
                                stackOut_22_1 = ~var8;
                                stackIn_52_0 = stackOut_22_0;
                                stackIn_52_1 = stackOut_22_1;
                                stackIn_23_0 = stackOut_22_0;
                                stackIn_23_1 = stackOut_22_1;
                                if (var13 != 0) {
                                  break L4;
                                } else {
                                  L11: {
                                    L12: {
                                      if (stackIn_23_0 != stackIn_23_1) {
                                        break L12;
                                      } else {
                                        if (var13 == 0) {
                                          break L11;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                    var10_int = ((dc) this).field_h[var9_int];
                                    if (var10_int == 0) {
                                      break L11;
                                    } else {
                                      L13: {
                                        if (param2.field_j[var9_int][0]) {
                                          break L13;
                                        } else {
                                          if (var10_int < 50) {
                                            break L13;
                                          } else {
                                            if (95 * param2.field_l[var9_int] > 100 * var10_int) {
                                              break L13;
                                            } else {
                                              param2.field_j[var9_int][0] = true;
                                              break L13;
                                            }
                                          }
                                        }
                                      }
                                      L14: {
                                        if (param2.field_j[var9_int][1]) {
                                          break L14;
                                        } else {
                                          if (var10_int < 50) {
                                            break L14;
                                          } else {
                                            if (var10_int < param1.field_x * 10) {
                                              break L14;
                                            } else {
                                              param2.field_j[var9_int][1] = true;
                                              break L14;
                                            }
                                          }
                                        }
                                      }
                                      if (!param2.field_j[var9_int][9]) {
                                        if (null == param1.field_y) {
                                          break L11;
                                        } else {
                                          if (!param4[var9_int][var8]) {
                                            var11 = 0;
                                            L15: while (true) {
                                              if (((dc) this).field_C <= var11) {
                                                break L11;
                                              } else {
                                                var12 = ((dc) this).field_K[var11];
                                                stackOut_42_0 = var9_int;
                                                stackOut_42_1 = var12;
                                                stackIn_21_0 = stackOut_42_0;
                                                stackIn_21_1 = stackOut_42_1;
                                                stackIn_43_0 = stackOut_42_0;
                                                stackIn_43_1 = stackOut_42_1;
                                                if (var13 != 0) {
                                                  continue L10;
                                                } else {
                                                  L16: {
                                                    if (stackIn_43_0 == stackIn_43_1) {
                                                      break L16;
                                                    } else {
                                                      if (!param4[var9_int][var12]) {
                                                        break L16;
                                                      } else {
                                                        if (param4[var8][var12]) {
                                                          break L16;
                                                        } else {
                                                          param2.field_j[var9_int][9] = true;
                                                          break L16;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  var11++;
                                                  if (var13 == 0) {
                                                    continue L15;
                                                  } else {
                                                    break L11;
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            break L11;
                                          }
                                        }
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  var9_int++;
                                  if (var13 == 0) {
                                    continue L9;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    if (param1.field_y == null) {
                      ((dc) this).field_u[((dc) this).field_r] = param1.field_x;
                      stackOut_51_0 = 0;
                      stackOut_51_1 = param1.field_x;
                      stackIn_52_0 = stackOut_51_0;
                      stackIn_52_1 = stackOut_51_1;
                      break L4;
                    } else {
                      break L3;
                    }
                  }
                  if (stackIn_52_0 < stackIn_52_1) {
                    int fieldTemp$4 = ((dc) this).field_C;
                    ((dc) this).field_C = ((dc) this).field_C + 1;
                    ((dc) this).field_K[fieldTemp$4] = ((dc) this).field_r;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L17: {
                  var9 = null;
                  if (param3 != null) {
                    var10 = new fs[((dc) this).field_C];
                    var11 = 0;
                    L18: while (true) {
                      L19: {
                        if (var11 >= ((dc) this).field_C) {
                          break L19;
                        } else {
                          L20: {
                            var12 = ((dc) this).field_K[var11];
                            stackOut_59_0 = (fs[]) var10;
                            stackOut_59_1 = var11;
                            stackIn_61_0 = stackOut_59_0;
                            stackIn_61_1 = stackOut_59_1;
                            stackIn_60_0 = stackOut_59_0;
                            stackIn_60_1 = stackOut_59_1;
                            if (~((dc) this).field_r >= ~var12) {
                              stackOut_61_0 = (fs[]) (Object) stackIn_61_0;
                              stackOut_61_1 = stackIn_61_1;
                              stackOut_61_2 = null;
                              stackIn_62_0 = stackOut_61_0;
                              stackIn_62_1 = stackOut_61_1;
                              stackIn_62_2 = (fs) (Object) stackOut_61_2;
                              break L20;
                            } else {
                              stackOut_60_0 = (fs[]) (Object) stackIn_60_0;
                              stackOut_60_1 = stackIn_60_1;
                              stackOut_60_2 = ((dc) this).field_v[var12];
                              stackIn_62_0 = stackOut_60_0;
                              stackIn_62_1 = stackOut_60_1;
                              stackIn_62_2 = stackOut_60_2;
                              break L20;
                            }
                          }
                          stackIn_62_0[stackIn_62_1] = stackIn_62_2;
                          var11++;
                          if (var13 == 0) {
                            continue L18;
                          } else {
                            break L19;
                          }
                        }
                      }
                      var9 = (Object) (Object) param3.a(((dc) this).field_u, param1, 0, var10);
                      break L17;
                    }
                  } else {
                    break L17;
                  }
                }
                L21: {
                  if (param1.field_u) {
                    ((dc) this).field_u[var8] = ((dc) this).field_u[var8] * 2;
                    break L21;
                  } else {
                    break L21;
                  }
                }
                L22: {
                  this.a((byte) -114, param4);
                  var14 = this.d((byte) 20);
                  var10_array = var14;
                  if (var9 == null) {
                    break L22;
                  } else {
                    ((eg) var9).a((byte) 74, var10_array);
                    break L22;
                  }
                }
                L23: {
                  L24: {
                    L25: {
                      L26: {
                        if (param2 != null) {
                          break L26;
                        } else {
                          L27: {
                            if (!param1.field_u) {
                              break L27;
                            } else {
                              L28: {
                                L29: {
                                  var11 = ((dc) this).field_u[var8] / 2;
                                  if (param1.field_y == null) {
                                    break L29;
                                  } else {
                                    if (((dc) this).field_u[var8] <= 0) {
                                      break L29;
                                    } else {
                                      stackOut_73_0 = 1;
                                      stackIn_75_0 = stackOut_73_0;
                                      break L28;
                                    }
                                  }
                                }
                                stackOut_74_0 = 0;
                                stackIn_75_0 = stackOut_74_0;
                                break L28;
                              }
                              L30: {
                                var12 = stackIn_75_0;
                                if (var12 > var11) {
                                  var11 = var12;
                                  break L30;
                                } else {
                                  break L30;
                                }
                              }
                              ((dc) this).field_u[var8] = var11;
                              break L27;
                            }
                          }
                          this.a((byte) -124, param1, (eg) var9);
                          if (((dc) this).field_u[var8] > 0) {
                            L31: {
                              param1.field_x = ((dc) this).field_u[var8];
                              this.a(param1, (eg) var9, -30724);
                              if (var9 == null) {
                                break L31;
                              } else {
                                ((eg) var9).field_m = param1.field_R;
                                ((eg) var9).field_i = param1.field_y;
                                ((eg) var9).field_l = param1.field_x;
                                break L31;
                              }
                            }
                            if (param2 == null) {
                              break L23;
                            } else {
                              if (null == param1.field_y) {
                                break L23;
                              } else {
                                if (!param2.field_j[var8][3]) {
                                  var11 = 0;
                                  var12_ref_mg = (mg) (Object) param1.field_s.c(-127);
                                  L32: while (true) {
                                    if (var12_ref_mg == null) {
                                      break L24;
                                    } else {
                                      if (var13 != 0) {
                                        break L23;
                                      } else {
                                        L33: {
                                          if (param1.field_y == var12_ref_mg.field_G) {
                                            break L33;
                                          } else {
                                            var11++;
                                            break L33;
                                          }
                                        }
                                        var12_ref_mg = (mg) (Object) param1.field_s.b(32);
                                        if (var13 == 0) {
                                          continue L32;
                                        } else {
                                          break L26;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  break L23;
                                }
                              }
                            }
                          } else {
                            break L25;
                          }
                        }
                      }
                      var11 = 0;
                      L34: while (true) {
                        L35: {
                          L36: {
                            if (((dc) this).field_r <= var11) {
                              break L36;
                            } else {
                              param2.field_b[var11] = param2.field_b[var11] + var14[var11];
                              var11++;
                              if (var13 != 0) {
                                break L35;
                              } else {
                                if (var13 == 0) {
                                  continue L34;
                                } else {
                                  break L36;
                                }
                              }
                            }
                          }
                          L37: {
                            if (!param1.field_u) {
                              break L37;
                            } else {
                              L38: {
                                L39: {
                                  var11 = ((dc) this).field_u[var8] / 2;
                                  if (param1.field_y == null) {
                                    break L39;
                                  } else {
                                    if (((dc) this).field_u[var8] <= 0) {
                                      break L39;
                                    } else {
                                      stackOut_101_0 = 1;
                                      stackIn_103_0 = stackOut_101_0;
                                      break L38;
                                    }
                                  }
                                }
                                stackOut_102_0 = 0;
                                stackIn_103_0 = stackOut_102_0;
                                break L38;
                              }
                              L40: {
                                var12 = stackIn_103_0;
                                if (var12 > var11) {
                                  var11 = var12;
                                  break L40;
                                } else {
                                  break L40;
                                }
                              }
                              ((dc) this).field_u[var8] = var11;
                              break L37;
                            }
                          }
                          this.a((byte) -124, param1, (eg) var9);
                          break L35;
                        }
                        if (((dc) this).field_u[var8] > 0) {
                          L41: {
                            param1.field_x = ((dc) this).field_u[var8];
                            this.a(param1, (eg) var9, -30724);
                            if (var9 == null) {
                              break L41;
                            } else {
                              ((eg) var9).field_m = param1.field_R;
                              ((eg) var9).field_i = param1.field_y;
                              ((eg) var9).field_l = param1.field_x;
                              break L41;
                            }
                          }
                          if (param2 == null) {
                            break L23;
                          } else {
                            if (null == param1.field_y) {
                              break L23;
                            } else {
                              if (!param2.field_j[var8][3]) {
                                var11 = 0;
                                var12_ref_mg = (mg) (Object) param1.field_s.c(-127);
                                L42: while (true) {
                                  if (var12_ref_mg == null) {
                                    break L24;
                                  } else {
                                    if (var13 != 0) {
                                      break L23;
                                    } else {
                                      L43: {
                                        if (param1.field_y == var12_ref_mg.field_G) {
                                          break L43;
                                        } else {
                                          var11++;
                                          break L43;
                                        }
                                      }
                                      var12_ref_mg = (mg) (Object) param1.field_s.b(32);
                                      if (var13 == 0) {
                                        continue L42;
                                      } else {
                                        break L24;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L23;
                              }
                            }
                          }
                        } else {
                          break L25;
                        }
                      }
                    }
                    var11 = 0;
                    L44: while (true) {
                      L45: {
                        L46: {
                          if (~var11 <= ~(((dc) this).field_r + 1)) {
                            break L46;
                          } else {
                            ((dc) this).field_B[var11] = ((dc) this).field_u[var11];
                            var11++;
                            if (var13 != 0) {
                              break L45;
                            } else {
                              if (var13 == 0) {
                                continue L44;
                              } else {
                                break L46;
                              }
                            }
                          }
                        }
                        ((dc) this).field_C = 0;
                        break L45;
                      }
                      var11 = 0;
                      L47: while (true) {
                        L48: {
                          L49: {
                            if (~((dc) this).field_r >= ~var11) {
                              break L49;
                            } else {
                              var12 = ((dc) this).field_B[var11];
                              ((dc) this).field_u[var11] = var12;
                              stackOut_133_0 = -1;
                              stackOut_133_1 = ~var12;
                              stackIn_138_0 = stackOut_133_0;
                              stackIn_138_1 = stackOut_133_1;
                              stackIn_134_0 = stackOut_133_0;
                              stackIn_134_1 = stackOut_133_1;
                              if (var13 != 0) {
                                break L48;
                              } else {
                                L50: {
                                  if (stackIn_134_0 == stackIn_134_1) {
                                    break L50;
                                  } else {
                                    int fieldTemp$5 = ((dc) this).field_C;
                                    ((dc) this).field_C = ((dc) this).field_C + 1;
                                    ((dc) this).field_K[fieldTemp$5] = var11;
                                    break L50;
                                  }
                                }
                                var11++;
                                if (var13 == 0) {
                                  continue L47;
                                } else {
                                  break L49;
                                }
                              }
                            }
                          }
                          stackOut_137_0 = 77;
                          stackOut_137_1 = 15;
                          stackIn_138_0 = stackOut_137_0;
                          stackIn_138_1 = stackOut_137_1;
                          break L48;
                        }
                        L51: {
                          if (stackIn_138_0 > stackIn_138_1) {
                            break L51;
                          } else {
                            this.a((byte) -65, (boolean[][]) null);
                            break L51;
                          }
                        }
                        if (((dc) this).field_C != 0) {
                          L52: {
                            this.b((byte) 15);
                            var11 = ((dc) this).field_K[0];
                            var15 = ((dc) this).field_v[var11];
                            this.a(var15, param1, 0);
                            param1.field_x = ((dc) this).field_u[var11];
                            if (var9 == null) {
                              break L52;
                            } else {
                              ((eg) var9).field_i = var15;
                              ((eg) var9).field_l = param1.field_x;
                              ((eg) var9).field_m = param1.field_R;
                              break L52;
                            }
                          }
                          L53: {
                            if (param2 == null) {
                              break L53;
                            } else {
                              param2.field_f[var11] = param2.field_f[var11] + 1;
                              break L53;
                            }
                          }
                          this.a(0, (eg) var9, param1);
                          break L0;
                        } else {
                          this.a(-21031, param1);
                          return;
                        }
                      }
                    }
                  }
                  if (var11 < 3) {
                    break L23;
                  } else {
                    param2.field_j[var8][3] = true;
                    break L23;
                  }
                }
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L54: {
            var7 = decompiledCaughtException;
            stackOut_149_0 = (RuntimeException) var7;
            stackOut_149_1 = new StringBuilder().append("dc.FB(").append(param0).append(44);
            stackIn_151_0 = stackOut_149_0;
            stackIn_151_1 = stackOut_149_1;
            stackIn_150_0 = stackOut_149_0;
            stackIn_150_1 = stackOut_149_1;
            if (param1 == null) {
              stackOut_151_0 = (RuntimeException) (Object) stackIn_151_0;
              stackOut_151_1 = (StringBuilder) (Object) stackIn_151_1;
              stackOut_151_2 = "null";
              stackIn_152_0 = stackOut_151_0;
              stackIn_152_1 = stackOut_151_1;
              stackIn_152_2 = stackOut_151_2;
              break L54;
            } else {
              stackOut_150_0 = (RuntimeException) (Object) stackIn_150_0;
              stackOut_150_1 = (StringBuilder) (Object) stackIn_150_1;
              stackOut_150_2 = "{...}";
              stackIn_152_0 = stackOut_150_0;
              stackIn_152_1 = stackOut_150_1;
              stackIn_152_2 = stackOut_150_2;
              break L54;
            }
          }
          L55: {
            stackOut_152_0 = (RuntimeException) (Object) stackIn_152_0;
            stackOut_152_1 = ((StringBuilder) (Object) stackIn_152_1).append(stackIn_152_2).append(44);
            stackIn_154_0 = stackOut_152_0;
            stackIn_154_1 = stackOut_152_1;
            stackIn_153_0 = stackOut_152_0;
            stackIn_153_1 = stackOut_152_1;
            if (param2 == null) {
              stackOut_154_0 = (RuntimeException) (Object) stackIn_154_0;
              stackOut_154_1 = (StringBuilder) (Object) stackIn_154_1;
              stackOut_154_2 = "null";
              stackIn_155_0 = stackOut_154_0;
              stackIn_155_1 = stackOut_154_1;
              stackIn_155_2 = stackOut_154_2;
              break L55;
            } else {
              stackOut_153_0 = (RuntimeException) (Object) stackIn_153_0;
              stackOut_153_1 = (StringBuilder) (Object) stackIn_153_1;
              stackOut_153_2 = "{...}";
              stackIn_155_0 = stackOut_153_0;
              stackIn_155_1 = stackOut_153_1;
              stackIn_155_2 = stackOut_153_2;
              break L55;
            }
          }
          L56: {
            stackOut_155_0 = (RuntimeException) (Object) stackIn_155_0;
            stackOut_155_1 = ((StringBuilder) (Object) stackIn_155_1).append(stackIn_155_2).append(44);
            stackIn_157_0 = stackOut_155_0;
            stackIn_157_1 = stackOut_155_1;
            stackIn_156_0 = stackOut_155_0;
            stackIn_156_1 = stackOut_155_1;
            if (param3 == null) {
              stackOut_157_0 = (RuntimeException) (Object) stackIn_157_0;
              stackOut_157_1 = (StringBuilder) (Object) stackIn_157_1;
              stackOut_157_2 = "null";
              stackIn_158_0 = stackOut_157_0;
              stackIn_158_1 = stackOut_157_1;
              stackIn_158_2 = stackOut_157_2;
              break L56;
            } else {
              stackOut_156_0 = (RuntimeException) (Object) stackIn_156_0;
              stackOut_156_1 = (StringBuilder) (Object) stackIn_156_1;
              stackOut_156_2 = "{...}";
              stackIn_158_0 = stackOut_156_0;
              stackIn_158_1 = stackOut_156_1;
              stackIn_158_2 = stackOut_156_2;
              break L56;
            }
          }
          L57: {
            stackOut_158_0 = (RuntimeException) (Object) stackIn_158_0;
            stackOut_158_1 = ((StringBuilder) (Object) stackIn_158_1).append(stackIn_158_2).append(44);
            stackIn_160_0 = stackOut_158_0;
            stackIn_160_1 = stackOut_158_1;
            stackIn_159_0 = stackOut_158_0;
            stackIn_159_1 = stackOut_158_1;
            if (param4 == null) {
              stackOut_160_0 = (RuntimeException) (Object) stackIn_160_0;
              stackOut_160_1 = (StringBuilder) (Object) stackIn_160_1;
              stackOut_160_2 = "null";
              stackIn_161_0 = stackOut_160_0;
              stackIn_161_1 = stackOut_160_1;
              stackIn_161_2 = stackOut_160_2;
              break L57;
            } else {
              stackOut_159_0 = (RuntimeException) (Object) stackIn_159_0;
              stackOut_159_1 = (StringBuilder) (Object) stackIn_159_1;
              stackOut_159_2 = "{...}";
              stackIn_161_0 = stackOut_159_0;
              stackIn_161_1 = stackOut_159_1;
              stackIn_161_2 = stackOut_159_2;
              break L57;
            }
          }
          throw r.a((Throwable) (Object) stackIn_161_0, stackIn_161_2 + 44 + 77 + 41);
        }
    }

    final void g(int param0) {
        ln[] var2 = null;
        fs[] var2_array = null;
        int var3 = 0;
        ln var4 = null;
        fs var4_ref = null;
        fs var5 = null;
        int var6 = 0;
        ln[] var7 = null;
        fs[] var8 = null;
        int var9 = 0;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        ((dc) this).field_q = new pf();
        ((dc) this).field_p = new el();
        ((dc) this).field_i = new pf();
        var7 = ((dc) this).field_g.field_e;
        var2 = var7;
        var3 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var7.length <= var3) {
                break L2;
              } else {
                var4 = var7[var3];
                var4.field_T.a(0);
                var4.field_s.b((byte) 117);
                var3++;
                if (var6 != 0) {
                  break L1;
                } else {
                  if (var6 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            if (param0 == -7954) {
              break L1;
            } else {
              field_E = null;
              break L1;
            }
          }
          var8 = ((dc) this).field_v;
          var2_array = var8;
          var9 = 0;
          var3 = var9;
          L3: while (true) {
            L4: {
              if (var9 >= var8.length) {
                break L4;
              } else {
                var4_ref = var8[var9];
                var5 = var4_ref;
                var4_ref.field_w = 0;
                var5.field_A = 0;
                var9++;
                if (var6 != 0) {
                  break L4;
                } else {
                  if (var6 == 0) {
                    continue L3;
                  } else {
                    break L4;
                  }
                }
              }
            }
            return;
          }
        }
    }

    private final void a(se param0, int param1, int param2, k param3) {
        RuntimeException var5 = null;
        qm var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (((dc) this).field_o.field_h) {
              L1: {
                if (param2 == 7377) {
                  break L1;
                } else {
                  field_E = null;
                  break L1;
                }
              }
              var5_ref = (qm) (Object) ((dc) this).field_i.d(0);
              L2: while (true) {
                L3: {
                  if (var5_ref == null) {
                    break L3;
                  } else {
                    var6 = var5_ref.field_o;
                    if (var7 != 0) {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      L4: {
                        L5: {
                          L6: {
                            if (var6 == 3) {
                              break L6;
                            } else {
                              if (var6 != 1) {
                                break L4;
                              } else {
                                if (var7 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          L7: {
                            this.a(var5_ref.field_r, 4, var5_ref.field_q);
                            if (param3 == null) {
                              break L7;
                            } else {
                              param3.a(param2 + -7500, var5_ref.field_q, var5_ref.field_r, var5_ref.field_p);
                              break L7;
                            }
                          }
                          if (param0 != null) {
                            param0.field_h[var5_ref.field_p.field_x] = param0.field_h[var5_ref.field_p.field_x] + 1;
                            if (((dc) this).field_O <= 0) {
                              break L4;
                            } else {
                              L8: {
                                if (ab.field_c[((dc) this).field_G] == 3) {
                                  break L8;
                                } else {
                                  if (lr.field_b[((dc) this).field_n] != 3) {
                                    break L4;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              param0.field_d[var5_ref.field_p.field_x][3] = true;
                              if (var7 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          } else {
                            break L4;
                          }
                        }
                        L9: {
                          ((dc) this).field_L.setSeed((long)(var5_ref.field_q.field_p ^ param1));
                          this.a(var5_ref.field_q, (byte) 112, ((dc) this).field_L);
                          if (param3 == null) {
                            break L9;
                          } else {
                            param3.a(var5_ref.field_p, var5_ref.field_q, (byte) 120);
                            break L9;
                          }
                        }
                        if (param0 != null) {
                          param0.field_h[var5_ref.field_p.field_x] = param0.field_h[var5_ref.field_p.field_x] + 1;
                          if (0 >= ((dc) this).field_O) {
                            break L4;
                          } else {
                            L10: {
                              if (ab.field_c[((dc) this).field_G] == 1) {
                                break L10;
                              } else {
                                if (lr.field_b[((dc) this).field_n] == 1) {
                                  break L10;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            param0.field_d[var5_ref.field_p.field_x][1] = true;
                            break L4;
                          }
                        } else {
                          break L4;
                        }
                      }
                      var5_ref = (qm) (Object) ((dc) this).field_i.a((byte) -71);
                      if (var7 == 0) {
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var5 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var5;
            stackOut_33_1 = new StringBuilder().append("dc.GA(");
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param0 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L11;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L11;
            }
          }
          L12: {
            stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
            stackOut_36_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param3 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L12;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L12;
            }
          }
          throw r.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(ln param0, int param1, ln param2) {
        RuntimeException var4 = null;
        ln var4_ref = null;
        sd var4_ref2 = null;
        sd var5 = null;
        ln var6 = null;
        sd var6_ref = null;
        int var7 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param2.b(param0, (byte) 10)) {
              return;
            } else {
              L1: {
                if (param0.field_p >= param2.field_p) {
                  break L1;
                } else {
                  var4_ref = param2;
                  param2 = param0;
                  param0 = var4_ref;
                  break L1;
                }
              }
              L2: {
                ((dc) this).field_A.a((byte) -113, (oh) (Object) new cs(param2, param0, param1));
                param2.a((byte) -127, param0);
                param0.a((byte) -81, param2);
                param2.e((byte) -122);
                param0.e((byte) -110);
                if (param2.field_y != param0.field_y) {
                  break L2;
                } else {
                  if (param2.field_R != param0.field_R) {
                    L3: {
                      var4_ref2 = param2.field_R;
                      var5 = param0.field_R;
                      if (var5.field_r <= var4_ref2.field_r) {
                        break L3;
                      } else {
                        var6_ref = var4_ref2;
                        var4_ref2 = var5;
                        var5 = var6_ref;
                        break L3;
                      }
                    }
                    var6 = var5.j(18229);
                    L4: while (true) {
                      L5: {
                        L6: {
                          if (var6 == null) {
                            break L6;
                          } else {
                            var6.field_R = var4_ref2;
                            var4_ref2.a(-21771, var6);
                            var6 = var5.h(param1 ^ -23414);
                            if (var7 != 0) {
                              break L5;
                            } else {
                              if (var7 == 0) {
                                continue L4;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        var5.b((byte) -118);
                        break L5;
                      }
                      sh.a(var4_ref2, -5);
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              this.a(param2, false, (byte) 125);
              this.a(param0, false, (byte) 114);
              ((dc) this).field_g.a(param1 ^ 26249);
              ((dc) this).field_g.b((byte) 80);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var4;
            stackOut_20_1 = new StringBuilder().append("dc.PA(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          L8: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(44).append(param1).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          throw r.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
    }

    private final void b(int param0, ln param1) {
        RuntimeException var3 = null;
        ln[] var3_array = null;
        sd var3_ref = null;
        int var4_int = 0;
        ln[] var4 = null;
        ln var5_ref_ln = null;
        int var5 = 0;
        ln var6 = null;
        sd var7 = null;
        ln var8 = null;
        int var9 = 0;
        ln[] var10 = null;
        fs stackIn_4_0 = null;
        fs stackIn_12_0 = null;
        ln stackIn_17_0 = null;
        ln stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        fs stackOut_3_0 = null;
        fs stackOut_11_0 = null;
        ln stackOut_16_0 = null;
        ln stackOut_28_0 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var10 = param1.field_D;
            var3_array = var10;
            var4_int = param0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var10.length <= var4_int) {
                    break L3;
                  } else {
                    var5_ref_ln = var10[var4_int];
                    var8 = var5_ref_ln;
                    var8 = var5_ref_ln;
                    stackOut_3_0 = param1.field_y;
                    stackIn_12_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var9 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 != var5_ref_ln.field_y) {
                          break L4;
                        } else {
                          param1.field_R = var5_ref_ln.field_R;
                          param1.field_R.a(-21771, param1);
                          if (var9 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var4_int++;
                      if (var9 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param1.field_R == null) {
                  param1.field_R = new sd(param1.field_y, param1);
                  param1.field_R.a(param0 + -21771, param1);
                  stackOut_11_0 = param1.field_y;
                  stackIn_12_0 = stackOut_11_0;
                  break L2;
                } else {
                  var3_ref = param1.field_R;
                  var4 = param1.field_D;
                  var5 = 0;
                  L5: while (true) {
                    L6: {
                      L7: {
                        if (~var4.length >= ~var5) {
                          break L7;
                        } else {
                          var6 = var4[var5];
                          var8 = var6;
                          var8 = var6;
                          var7 = var6.field_R;
                          stackOut_16_0 = (ln) param1;
                          stackIn_29_0 = stackOut_16_0;
                          stackIn_17_0 = stackOut_16_0;
                          if (var9 != 0) {
                            break L6;
                          } else {
                            L8: {
                              L9: {
                                if (stackIn_17_0.field_y != var6.field_y) {
                                  break L9;
                                } else {
                                  if (var3_ref != var7) {
                                    var8 = var7.j(param0 ^ 18229);
                                    L10: while (true) {
                                      L11: {
                                        if (var8 == null) {
                                          break L11;
                                        } else {
                                          var8.field_R = param1.field_R;
                                          var3_ref.a(param0 ^ -21771, var8);
                                          var8 = var7.h(-23410);
                                          if (var9 != 0) {
                                            break L8;
                                          } else {
                                            if (var9 == 0) {
                                              continue L10;
                                            } else {
                                              break L11;
                                            }
                                          }
                                        }
                                      }
                                      var7.b((byte) -118);
                                      break L9;
                                    }
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              var5++;
                              break L8;
                            }
                            if (var9 == 0) {
                              continue L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      stackOut_28_0 = (ln) param1;
                      stackIn_29_0 = stackOut_28_0;
                      break L6;
                    }
                    sh.a(stackIn_29_0.field_R, -5);
                    break L0;
                  }
                }
              }
              ((pf) (Object) stackIn_12_0.field_i).a((byte) -113, (oh) (Object) param1.field_R);
              sh.a(param1.field_R, -5);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var3 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var3;
            stackOut_31_1 = new StringBuilder().append("dc.W(").append(param0).append(44);
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L12;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L12;
            }
          }
          throw r.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 41);
        }
    }

    final void c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
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
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = ShatteredPlansClient.field_F ? 1 : 0;
                    var2 = eg.field_x.length;
                    var3 = ur.field_Bb.length;
                    var4 = var2 * var3 / 2;
                    var5 = var2 / 2;
                    var6 = var3 / 2;
                    if (null == ((dc) this).field_d) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    ((dc) this).field_N = new int[var5];
                    ((dc) this).field_j = new int[var6];
                    ((dc) this).field_b = 0;
                    ((dc) this).field_d = new int[var4];
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (0 == ((dc) this).field_O) {
                        statePc = 5;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 5: {
                    return;
                }
                case 6: {
                    if (((dc) this).field_b >= var4) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    stackOut_7_0 = ((dc) this).field_b;
                    stackIn_9_0 = stackOut_7_0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 8: {
                    stackOut_8_0 = var4;
                    stackIn_9_0 = stackOut_8_0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    var10 = stackIn_9_0;
                    if (var5 > ((dc) this).field_b) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackOut_10_0 = var5;
                    stackIn_12_0 = stackOut_10_0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    stackOut_11_0 = ((dc) this).field_b;
                    stackIn_12_0 = stackOut_11_0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    var11 = stackIn_12_0;
                    if (~((dc) this).field_b > ~var6) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackOut_13_0 = var6;
                    stackIn_15_0 = stackOut_13_0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 14: {
                    stackOut_14_0 = ((dc) this).field_b;
                    stackIn_15_0 = stackOut_14_0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    var12 = stackIn_15_0;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    var7 = vc.a((byte) -39, var2);
                    var13 = 0;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (var11 <= var13) {
                        statePc = 22;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackOut_18_0 = ((dc) this).field_N[var13];
                    stackOut_18_1 = var7;
                    stackIn_23_0 = stackOut_18_0;
                    stackIn_23_1 = stackOut_18_1;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    if (var14 != 0) {
                        statePc = 23;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (stackIn_19_0 == stackIn_19_1) {
                        statePc = 16;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var13++;
                    if (var14 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    stackOut_22_0 = -39;
                    stackOut_22_1 = var3;
                    stackIn_23_0 = stackOut_22_0;
                    stackIn_23_1 = stackOut_22_1;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    var8 = vc.a((byte) stackIn_23_0, stackIn_23_1);
                    var13 = 0;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (var12 <= var13) {
                        statePc = 30;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    stackOut_25_0 = ((dc) this).field_j[var13];
                    stackOut_25_1 = var8;
                    stackIn_31_0 = stackOut_25_0;
                    stackIn_31_1 = stackOut_25_1;
                    stackIn_26_0 = stackOut_25_0;
                    stackIn_26_1 = stackOut_25_1;
                    if (var14 != 0) {
                        statePc = 31;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (stackIn_26_0 == stackIn_26_1) {
                        statePc = 22;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    var13++;
                    if (var14 != 0) {
                        statePc = 30;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (var14 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    stackOut_30_0 = var3 * var7;
                    stackOut_30_1 = var8;
                    stackIn_31_0 = stackOut_30_0;
                    stackIn_31_1 = stackOut_30_1;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    var9 = stackIn_31_0 + stackIn_31_1;
                    var13 = 0;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    if (~var13 <= ~var10) {
                        statePc = 37;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    stackOut_33_0 = ~((dc) this).field_d[var13];
                    stackOut_33_1 = ~var9;
                    stackIn_38_0 = stackOut_33_0;
                    stackIn_38_1 = stackOut_33_1;
                    stackIn_34_0 = stackOut_33_0;
                    stackIn_34_1 = stackOut_33_1;
                    if (var14 != 0) {
                        statePc = 38;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (stackIn_34_0 == stackIn_34_1) {
                        statePc = 16;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    var13++;
                    if (var14 != 0) {
                        statePc = 22;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (var14 == 0) {
                        statePc = 32;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    ((dc) this).field_N[((dc) this).field_b % var5] = var7;
                    ((dc) this).field_j[((dc) this).field_b % var6] = var8;
                    ((dc) this).field_d[((dc) this).field_b % var4] = var9;
                    ((dc) this).field_n = var8;
                    stackOut_37_0 = -30;
                    stackOut_37_1 = (18 - param0) / 42;
                    stackIn_38_0 = stackOut_37_0;
                    stackIn_38_1 = stackOut_37_1;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    var13 = stackIn_38_0 % stackIn_38_1;
                    ((dc) this).field_b = ((dc) this).field_b + 1;
                    ((dc) this).field_G = var7;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(pf param0, int param1, pf param2, pf param3) {
        RuntimeException runtimeException = null;
        mg var5 = null;
        int var6 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            param3.a((byte) -90, ((dc) this).field_i);
            param2.a((byte) -90, ((dc) this).field_q);
            var5 = (mg) (Object) param0.d(param1);
            L1: while (true) {
              L2: {
                L3: {
                  if (var5 == null) {
                    break L3;
                  } else {
                    ((dc) this).field_p.a((byte) 36, (vp) (Object) var5);
                    var5.field_y.field_T.a((byte) -113, (oh) (Object) var5);
                    var5.field_B.field_s.a((df) (Object) var5, 32);
                    var5 = (mg) (Object) param0.a((byte) -71);
                    if (var6 != 0) {
                      break L2;
                    } else {
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                param3.a(0);
                param2.a(0);
                param0.a(0);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) runtimeException;
            stackOut_8_1 = new StringBuilder().append("dc.EA(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          L5: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          L6: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw r.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
    }

    private final void a(ln param0, boolean param1, byte param2) {
        try {
            kd.a(((dc) this).field_o, param1, param0, (byte) -2);
            if (param2 <= 113) {
                this.a((ln) null, (eg) null, 39);
            }
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "dc.M(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final void a(ob param0, byte param1, fs param2) {
        if (param1 <= 49) {
            return;
        }
        try {
            m.a((byte) -80, ((dc) this).field_v, param0, ((dc) this).field_n, ((dc) this).field_A, ((dc) this).field_G, ((dc) this).field_x, param2, ((dc) this).field_g, false);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "dc.V(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    private final int[] d(byte param0) {
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_23_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_22_0 = 0;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        var9 = new int[((dc) this).field_r];
        var2 = var9;
        L0: while (true) {
          stackOut_1_0 = 1;
          stackOut_1_1 = ((dc) this).field_C;
          stackIn_2_0 = stackOut_1_0;
          stackIn_2_1 = stackOut_1_1;
          L1: while (true) {
            L2: {
              L3: {
                if (stackIn_2_0 >= stackIn_2_1) {
                  break L3;
                } else {
                  var3 = 0;
                  var4 = ((dc) this).field_L.nextInt();
                  stackOut_3_0 = 1;
                  stackIn_23_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var8 != 0) {
                    break L2;
                  } else {
                    var5_int = stackIn_4_0;
                    L4: while (true) {
                      L5: {
                        if (~var5_int <= ~((dc) this).field_C) {
                          break L5;
                        } else {
                          var6 = ((dc) this).field_L.nextInt();
                          stackOut_6_0 = var6;
                          stackOut_6_1 = var4;
                          stackIn_2_0 = stackOut_6_0;
                          stackIn_2_1 = stackOut_6_1;
                          stackIn_7_0 = stackOut_6_0;
                          stackIn_7_1 = stackOut_6_1;
                          if (var8 != 0) {
                            continue L1;
                          } else {
                            L6: {
                              if (stackIn_7_0 <= stackIn_7_1) {
                                break L6;
                              } else {
                                var4 = var6;
                                var3 = var5_int;
                                break L6;
                              }
                            }
                            var5_int++;
                            if (var8 == 0) {
                              continue L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      var5 = ((dc) this).field_t[var3];
                      var6 = ((dc) this).field_H[var3];
                      if (var6 == 0) {
                        throw new RuntimeException();
                      } else {
                        L7: {
                          var7 = var5[qf.a((byte) 11, ((dc) this).field_H[var3], ((dc) this).field_L)];
                          if (~((dc) this).field_r >= ~((dc) this).field_K[var3]) {
                            break L7;
                          } else {
                            var9[((dc) this).field_K[var3]] = var9[((dc) this).field_K[var3]] + 1;
                            break L7;
                          }
                        }
                        L8: {
                          ((dc) this).field_u[var7] = ((dc) this).field_u[var7] - 1;
                          if (0 == ((dc) this).field_u[var7] - 1) {
                            this.c(this.a((byte) 98, var7), -32);
                            this.a(false);
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        if (((dc) this).field_u[var7] < 0) {
                          throw new RuntimeException();
                        } else {
                          if (var8 == 0) {
                            continue L0;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
              }
              stackOut_22_0 = 20;
              stackIn_23_0 = stackOut_22_0;
              break L2;
            }
            L9: {
              if (stackIn_23_0 == 20) {
                break L9;
              } else {
                ((dc) this).field_H = null;
                break L9;
              }
            }
            return var9;
          }
        }
    }

    private final void a(ln param0, boolean param1) {
        try {
            param0.field_u = true;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "dc.D(" + (param0 != null ? "{...}" : "null") + 44 + 1 + 41);
        }
    }

    private final int a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        byte stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        var3 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (((dc) this).field_C <= var3) {
                break L2;
              } else {
                stackOut_2_0 = ~((dc) this).field_K[var3];
                stackOut_2_1 = ~param1;
                stackIn_8_0 = stackOut_2_0;
                stackIn_8_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (var4 != 0) {
                  break L1;
                } else {
                  if (stackIn_3_0 == stackIn_3_1) {
                    return var3;
                  } else {
                    var3++;
                    if (var4 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            stackOut_7_0 = param0;
            stackOut_7_1 = 57;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            break L1;
          }
          L3: {
            if (stackIn_8_0 > stackIn_8_1) {
              break L3;
            } else {
              boolean discarded$2 = ((dc) this).a((pf) null, (fs) null, -20, (pf) null, (pf) null);
              break L3;
            }
          }
          throw new RuntimeException();
        }
    }

    final void a(int param0, fs param1) {
        RuntimeException var3 = null;
        fs[] var3_array = null;
        int var4_int = 0;
        String[] var4 = null;
        fs var5 = null;
        int[] var5_array = null;
        int[] var6_ref_int__ = null;
        int var6 = 0;
        boolean[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var3_array = ((dc) this).field_v;
            var4_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var4_int <= ~var3_array.length) {
                    break L3;
                  } else {
                    var5 = var3_array[var4_int];
                    var6_ref_int__ = new int[((dc) this).field_v.length + 1];
                    var7 = new boolean[((dc) this).field_v.length + 1];
                    stackOut_3_0 = 0;
                    stackIn_12_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var9 != 0) {
                      break L2;
                    } else {
                      var8 = stackIn_4_0;
                      L4: while (true) {
                        L5: {
                          L6: {
                            if (var8 >= var5.field_h.length) {
                              break L6;
                            } else {
                              var6_ref_int__[var8] = var5.field_f[var8];
                              var7[var8] = var5.field_h[var8];
                              var8++;
                              if (var9 != 0) {
                                break L5;
                              } else {
                                if (var9 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var5.field_h = var7;
                          var5.field_f = var6_ref_int__;
                          var4_int++;
                          break L5;
                        }
                        if (var9 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                param1.field_f = new int[((dc) this).field_r + 1];
                param1.field_h = new boolean[((dc) this).field_r - -1];
                vf.a(126, (sd) (Object) param1.field_m);
                sh.a((sd) (Object) param1.field_m, param0);
                var3_array = new fs[((dc) this).field_r + 1];
                stackOut_11_0 = ((dc) this).field_r + 1;
                stackIn_12_0 = stackOut_11_0;
                break L2;
              }
              var4 = new String[stackIn_12_0];
              var5_array = new int[1 + ((dc) this).field_r];
              var6 = 0;
              L7: while (true) {
                L8: {
                  L9: {
                    if (((dc) this).field_v.length <= var6) {
                      break L9;
                    } else {
                      var3_array[var6] = ((dc) this).field_v[var6];
                      var4[var6] = ((dc) this).field_I[var6];
                      var5_array[var6] = ((dc) this).field_D[var6];
                      var6++;
                      if (var9 != 0) {
                        break L8;
                      } else {
                        if (var9 == 0) {
                          continue L7;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                  var3_array[var6] = param1;
                  var4[var6] = param1.field_t;
                  ((dc) this).field_D = var5_array;
                  ((dc) this).field_r = ((dc) this).field_r + 1;
                  ((dc) this).field_v = var3_array;
                  ((dc) this).field_I = var4;
                  ((dc) this).field_B = new int[1 + ((dc) this).field_r];
                  ((dc) this).field_u = new int[1 + ((dc) this).field_r];
                  ((dc) this).field_H = new int[((dc) this).field_r + 1];
                  ((dc) this).field_K = new int[1 + ((dc) this).field_r];
                  ((dc) this).field_h = new int[((dc) this).field_r];
                  break L8;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3;
            stackOut_19_1 = new StringBuilder().append("dc.U(").append(param0).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L10;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L10;
            }
          }
          throw r.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
    }

    private final void a(int param0, k param1) {
        RuntimeException var3 = null;
        fs[] var3_array = null;
        cs var3_ref = null;
        int var4_int = 0;
        sd var4 = null;
        fs var5 = null;
        int var6 = 0;
        int var7 = 0;
        fs[] var8 = null;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        boolean stackOut_18_0 = false;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (!((dc) this).field_o.field_j) {
                  break L2;
                } else {
                  var8 = ((dc) this).field_v;
                  var3_array = var8;
                  var4_int = 0;
                  L3: while (true) {
                    stackOut_3_0 = ~var8.length;
                    stackOut_3_1 = ~var4_int;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    L4: while (true) {
                      if (stackIn_4_0 >= stackIn_4_1) {
                        break L2;
                      } else {
                        var5 = var8[var4_int];
                        stackOut_5_0 = 0;
                        stackIn_19_0 = stackOut_5_0;
                        stackIn_6_0 = stackOut_5_0;
                        if (var7 != 0) {
                          break L1;
                        } else {
                          var6 = stackIn_6_0;
                          L5: while (true) {
                            L6: {
                              if (((dc) this).field_r <= var6) {
                                break L6;
                              } else {
                                stackOut_8_0 = ~var5.field_f[var6];
                                stackOut_8_1 = -1;
                                stackIn_4_0 = stackOut_8_0;
                                stackIn_4_1 = stackOut_8_1;
                                stackIn_9_0 = stackOut_8_0;
                                stackIn_9_1 = stackOut_8_1;
                                if (var7 != 0) {
                                  continue L4;
                                } else {
                                  L7: {
                                    if (stackIn_9_0 >= stackIn_9_1) {
                                      break L7;
                                    } else {
                                      var5.field_f[var6] = var5.field_f[var6] - 1;
                                      if (var5.field_f[var6] - 1 == 0) {
                                        var5.field_h[var6] = false;
                                        if (param1 == null) {
                                          break L7;
                                        } else {
                                          if (~var5.field_x > ~var6) {
                                            param1.a(255, var5, ((dc) this).field_v[var6]);
                                            break L7;
                                          } else {
                                            break L7;
                                          }
                                        }
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                  var6++;
                                  if (var7 == 0) {
                                    continue L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            var4_int++;
                            if (var7 == 0) {
                              continue L3;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              stackOut_18_0 = ((dc) this).field_o.field_h;
              stackIn_19_0 = stackOut_18_0 ? 1 : 0;
              break L1;
            }
            L8: {
              L9: {
                if (stackIn_19_0 != 0) {
                  var3_ref = (cs) (Object) ((dc) this).field_A.d(0);
                  L10: while (true) {
                    if (var3_ref == null) {
                      break L9;
                    } else {
                      int fieldTemp$1 = var3_ref.field_m - 1;
                      var3_ref.field_m = var3_ref.field_m - 1;
                      stackOut_23_0 = 0;
                      stackOut_23_1 = fieldTemp$1;
                      stackIn_32_0 = stackOut_23_0;
                      stackIn_32_1 = stackOut_23_1;
                      stackIn_24_0 = stackOut_23_0;
                      stackIn_24_1 = stackOut_23_1;
                      if (var7 != 0) {
                        break L8;
                      } else {
                        L11: {
                          if (stackIn_24_0 < stackIn_24_1) {
                            break L11;
                          } else {
                            L12: {
                              var3_ref.field_n.a(var3_ref.field_k, (byte) -124);
                              var3_ref.field_n.e((byte) -98);
                              var3_ref.field_k.e((byte) -100);
                              var4 = var3_ref.field_n.field_R;
                              if (var4 == null) {
                                break L12;
                              } else {
                                if (var4 == var3_ref.field_k.field_R) {
                                  this.a(80, var4);
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                            }
                            this.a(var3_ref.field_n, false, (byte) 123);
                            this.a(var3_ref.field_k, false, (byte) 118);
                            ((dc) this).field_g.a(26253);
                            ((dc) this).field_g.b((byte) 80);
                            var3_ref.b((byte) -101);
                            break L11;
                          }
                        }
                        var3_ref = (cs) (Object) ((dc) this).field_A.a((byte) -71);
                        if (var7 == 0) {
                          continue L10;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                } else {
                  break L9;
                }
              }
              stackOut_31_0 = param0;
              stackOut_31_1 = 1;
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              break L8;
            }
            L13: {
              if (stackIn_32_0 == stackIn_32_1) {
                break L13;
              } else {
                ((dc) this).b(40);
                break L13;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var3 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var3;
            stackOut_35_1 = new StringBuilder().append("dc.UA(").append(param0).append(44);
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param1 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L14;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L14;
            }
          }
          throw r.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + 41);
        }
    }

    final void a(fs param0, byte param1) {
        ln[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        ln var5 = null;
        int var6 = 0;
        ln[] var7 = null;
        fs stackIn_6_0 = null;
        fs stackIn_11_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        fs stackOut_5_0 = null;
        fs stackOut_10_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 <= -90) {
                break L1;
              } else {
                ((dc) this).c((byte) 63);
                break L1;
              }
            }
            var7 = ((dc) this).field_g.field_e;
            var3 = var7;
            var4 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var7.length <= var4) {
                    break L4;
                  } else {
                    var5 = var7[var4];
                    stackOut_5_0 = var5.field_y;
                    stackIn_11_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var6 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (stackIn_6_0 == param0) {
                          var5.field_R = null;
                          var5.field_y = null;
                          var5.b((byte) -71);
                          var5.a(16);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var4++;
                      if (var6 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                param0.field_i.a(0);
                stackOut_10_0 = (fs) param0;
                stackIn_11_0 = stackOut_10_0;
                break L3;
              }
              L6: {
                if (stackIn_11_0.field_m == null) {
                  break L6;
                } else {
                  param0.field_m.k(0);
                  break L6;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3_ref;
            stackOut_14_1 = new StringBuilder().append("dc.JA(");
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
              break L7;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L7;
            }
          }
          throw r.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 41);
        }
    }

    private final int b(byte param0, ln param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        mg var4 = null;
        int var5 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 >= 88) {
                break L1;
              } else {
                ((dc) this).field_e = 2;
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  if (!param1.field_u) {
                    break L4;
                  } else {
                    if (((dc) this).field_o.field_f) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                var3_int = 1 + param1.field_x >> 1;
                param1.field_x = param1.field_x - var3_int;
                if (var5 == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
              var3_int = 0;
              param1.field_u = false;
              break L2;
            }
            var4 = (mg) (Object) param1.field_T.d(0);
            L5: while (true) {
              L6: {
                if (var4 == null) {
                  break L6;
                } else {
                  var4.b((byte) -113);
                  var4.a(16);
                  var4.d(true);
                  var4 = (mg) (Object) param1.field_T.a((byte) -71);
                  if (var5 == 0) {
                    continue L5;
                  } else {
                    break L6;
                  }
                }
              }
              stackOut_11_0 = var3_int;
              stackIn_12_0 = stackOut_11_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("dc.BB(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L7;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L7;
            }
          }
          throw r.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_12_0;
    }

    final void e(int param0) {
        fs[] var2 = null;
        int var3 = 0;
        fs var4 = null;
        sd var5 = null;
        int var6 = 0;
        fs[] var7 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        var7 = ((dc) this).field_v;
        var2 = var7;
        var3 = param0;
        L0: while (true) {
          L1: {
            if (~var3 <= ~var7.length) {
              break L1;
            } else {
              var4 = var7[var3];
              if (var6 != 0) {
                break L1;
              } else {
                L2: {
                  L3: {
                    L4: {
                      if (((dc) this).field_o.field_i) {
                        break L4;
                      } else {
                        var5 = (sd) (Object) var4.field_i.d(0);
                        L5: while (true) {
                          L6: {
                            if (var5 == null) {
                              break L6;
                            } else {
                              vf.a(param0 ^ 127, var5);
                              sh.a(var5, param0 + -5);
                              var5 = (sd) (Object) var4.field_i.a((byte) -71);
                              if (var6 != 0) {
                                break L2;
                              } else {
                                if (var6 == 0) {
                                  continue L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          if (var6 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    vf.a(param0 ^ 125, (sd) (Object) var4.field_m);
                    sh.a((sd) (Object) var4.field_m, -5);
                    break L3;
                  }
                  var3++;
                  break L2;
                }
                if (var6 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
          }
          return;
        }
    }

    final int f(int param0) {
        int var2 = 0;
        fs[] var3 = null;
        ln[] var3_array = null;
        cs var3_ref = null;
        int var4 = 0;
        fs var5 = null;
        ln var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ln stackIn_14_0 = null;
        int stackIn_17_0 = 0;
        Object stackIn_31_0 = null;
        ln stackOut_13_0 = null;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        oh stackOut_30_0 = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = 305494461;
        var2 = var2 ^ ((dc) this).field_f << 11;
        var2 = var2 ^ ((dc) this).field_w * 5 << 7;
        var2 = var2 ^ ((dc) this).field_y * 13 << 19;
        if (param0 == -28824) {
          var3 = ((dc) this).field_v;
          var4 = 0;
          L0: while (true) {
            L1: {
              if (var3.length <= var4) {
                break L1;
              } else {
                var5 = var3[var4];
                var2 = var2 + (var5.field_u[0] << var5.field_x);
                var2 = var2 + (var5.field_u[1] << var5.field_x + 3);
                var2 = var2 + (var5.field_u[2] << var5.field_x + 7);
                var2 = var2 + (var5.field_u[3] << var5.field_x + 19);
                var6 = 0;
                L2: while (true) {
                  L3: {
                    L4: {
                      if (~var6 <= ~((dc) this).field_v.length) {
                        break L4;
                      } else {
                        var2 = var2 + (var5.field_f[var6] << (var6 * 5 + 7 * var5.field_x) % 11);
                        var6++;
                        if (var9 != 0) {
                          break L3;
                        } else {
                          if (var9 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var4++;
                    break L3;
                  }
                  if (var9 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            var3_array = ((dc) this).field_g.field_e;
            var4 = 0;
            L5: while (true) {
              L6: {
                L7: {
                  if (var3_array.length <= var4) {
                    break L7;
                  } else {
                    var5_ref = var3_array[var4];
                    var6 = 1 + var5_ref.field_p;
                    stackOut_13_0 = (ln) var5_ref;
                    stackIn_31_0 = (Object) (Object) stackOut_13_0;
                    stackIn_14_0 = stackOut_13_0;
                    if (var9 != 0) {
                      break L6;
                    } else {
                      L8: {
                        if (stackIn_14_0.field_u) {
                          stackOut_16_0 = 79;
                          stackIn_17_0 = stackOut_16_0;
                          break L8;
                        } else {
                          stackOut_15_0 = 0;
                          stackIn_17_0 = stackOut_15_0;
                          break L8;
                        }
                      }
                      var7 = stackIn_17_0;
                      var8 = 0;
                      L9: while (true) {
                        L10: {
                          L11: {
                            if (~var5_ref.field_D.length >= ~var8) {
                              break L11;
                            } else {
                              var7 = var7 + 23 * (var8 + 1) * var5_ref.field_D[var8].field_p;
                              var8++;
                              if (var9 != 0) {
                                break L10;
                              } else {
                                if (var9 == 0) {
                                  continue L9;
                                } else {
                                  break L11;
                                }
                              }
                            }
                          }
                          var8 = 0;
                          break L10;
                        }
                        L12: while (true) {
                          L13: {
                            L14: {
                              if (4 <= var8) {
                                break L14;
                              } else {
                                var7 = var7 + var5_ref.field_G[var8] * (13 << var8 * 3);
                                var8++;
                                if (var9 != 0) {
                                  break L13;
                                } else {
                                  if (var9 == 0) {
                                    continue L12;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                            }
                            var7 = var7 + 37 * var5_ref.field_x;
                            var2 = var2 + 17 * (var6 * var7);
                            var4++;
                            break L13;
                          }
                          if (var9 == 0) {
                            continue L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_30_0 = ((dc) this).field_A.d(0);
                stackIn_31_0 = (Object) (Object) stackOut_30_0;
                break L6;
              }
              var3_ref = (cs) (Object) stackIn_31_0;
              L15: while (true) {
                L16: {
                  L17: {
                    if (var3_ref == null) {
                      break L17;
                    } else {
                      var4 = (var3_ref.field_k.field_p - -17) * (13 + var3_ref.field_n.field_p) ^ var3_ref.field_m * 31;
                      var2 = var2 + 23 * var4;
                      var3_ref = (cs) (Object) ((dc) this).field_A.a((byte) -71);
                      if (var9 != 0) {
                        break L16;
                      } else {
                        if (var9 == 0) {
                          continue L15;
                        } else {
                          break L17;
                        }
                      }
                    }
                  }
                  var2 = var2 ^ 47 * ((dc) this).field_G;
                  var2 = var2 ^ 61 * ((dc) this).field_n;
                  break L16;
                }
                return var2;
              }
            }
          }
        } else {
          return 22;
        }
    }

    final boolean a(pf param0, fs param1, int param2, pf param3, pf param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int[] var7 = null;
        int var8_int = 0;
        qa var8 = null;
        int var9 = 0;
        qm var10 = null;
        int var11_int = 0;
        mg var11 = null;
        int var12 = 0;
        Object var12_ref = null;
        int var13 = 0;
        ln[] var13_ref_ln__ = null;
        int var14 = 0;
        ln var15 = null;
        int var16 = 0;
        Object var17 = null;
        sd var18 = null;
        boolean stackIn_12_0 = false;
        int stackIn_35_0 = 0;
        fs stackIn_38_0 = null;
        fs stackIn_38_1 = null;
        fs stackIn_62_0 = null;
        fs stackIn_62_1 = null;
        boolean stackIn_74_0 = false;
        int stackIn_94_0 = 0;
        int stackIn_111_0 = 0;
        RuntimeException stackIn_113_0 = null;
        StringBuilder stackIn_113_1 = null;
        RuntimeException stackIn_114_0 = null;
        StringBuilder stackIn_114_1 = null;
        RuntimeException stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        String stackIn_115_2 = null;
        RuntimeException stackIn_116_0 = null;
        StringBuilder stackIn_116_1 = null;
        RuntimeException stackIn_117_0 = null;
        StringBuilder stackIn_117_1 = null;
        RuntimeException stackIn_118_0 = null;
        StringBuilder stackIn_118_1 = null;
        String stackIn_118_2 = null;
        RuntimeException stackIn_119_0 = null;
        StringBuilder stackIn_119_1 = null;
        RuntimeException stackIn_120_0 = null;
        StringBuilder stackIn_120_1 = null;
        RuntimeException stackIn_121_0 = null;
        StringBuilder stackIn_121_1 = null;
        String stackIn_121_2 = null;
        RuntimeException stackIn_122_0 = null;
        StringBuilder stackIn_122_1 = null;
        RuntimeException stackIn_123_0 = null;
        StringBuilder stackIn_123_1 = null;
        RuntimeException stackIn_124_0 = null;
        StringBuilder stackIn_124_1 = null;
        String stackIn_124_2 = null;
        boolean stackOut_11_0 = false;
        int stackOut_33_0 = 0;
        int stackOut_34_0 = 0;
        fs stackOut_37_0 = null;
        fs stackOut_37_1 = null;
        fs stackOut_61_0 = null;
        fs stackOut_61_1 = null;
        boolean stackOut_73_0 = false;
        int stackOut_92_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_110_0 = 0;
        RuntimeException stackOut_112_0 = null;
        StringBuilder stackOut_112_1 = null;
        RuntimeException stackOut_113_0 = null;
        StringBuilder stackOut_113_1 = null;
        String stackOut_113_2 = null;
        RuntimeException stackOut_114_0 = null;
        StringBuilder stackOut_114_1 = null;
        String stackOut_114_2 = null;
        RuntimeException stackOut_115_0 = null;
        StringBuilder stackOut_115_1 = null;
        RuntimeException stackOut_116_0 = null;
        StringBuilder stackOut_116_1 = null;
        String stackOut_116_2 = null;
        RuntimeException stackOut_117_0 = null;
        StringBuilder stackOut_117_1 = null;
        String stackOut_117_2 = null;
        RuntimeException stackOut_118_0 = null;
        StringBuilder stackOut_118_1 = null;
        RuntimeException stackOut_119_0 = null;
        StringBuilder stackOut_119_1 = null;
        String stackOut_119_2 = null;
        RuntimeException stackOut_120_0 = null;
        StringBuilder stackOut_120_1 = null;
        String stackOut_120_2 = null;
        RuntimeException stackOut_121_0 = null;
        StringBuilder stackOut_121_1 = null;
        RuntimeException stackOut_122_0 = null;
        StringBuilder stackOut_122_1 = null;
        String stackOut_122_2 = null;
        RuntimeException stackOut_123_0 = null;
        StringBuilder stackOut_123_1 = null;
        String stackOut_123_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var17 = null;
                    var16 = ShatteredPlansClient.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6_int = ((dc) this).field_g.field_e.length;
                        var7 = new int[var6_int];
                        var8_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (~var8_int <= ~var6_int) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var7[var8_int] = ((dc) this).field_g.field_e[var8_int].field_x;
                        var8_int++;
                        if (var16 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var8 = (qa) (Object) param3.d(0);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var8 == null) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (null == var8.field_u) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var7[var8.field_u.field_p] = var7[var8.field_u.field_p] + var8.field_v;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var8 = (qa) (Object) param3.a((byte) -71);
                        if (var16 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var9 = 0;
                        var10 = (qm) (Object) param4.d(0);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var10 == null) {
                            statePc = 57;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var11_int = 1;
                        stackOut_11_0 = ((dc) this).field_o.field_h;
                        stackIn_74_0 = stackOut_11_0;
                        stackIn_12_0 = stackOut_11_0;
                        if (var16 != 0) {
                            statePc = 74;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (stackIn_12_0) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var11_int = 0;
                        if (var16 == 0) {
                            statePc = 53;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var10.field_p != param1) {
                            statePc = 52;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (null == var10.field_q) {
                            statePc = 51;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (param1.field_u[var10.field_o] < 5) {
                            statePc = 50;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var12 = 0;
                        var13 = var10.field_o;
                        if (0 == var13) {
                            statePc = 24;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var13 != 1) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var16 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var13 == 2) {
                            statePc = 32;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var13 == 3) {
                            statePc = 43;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var10.field_q.field_y == param1) {
                            statePc = 49;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var11_int = 0;
                        if (var16 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var10.field_q.field_y != param1) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var11_int = 0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var10.field_q.field_L != 0) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var11_int = 0;
                        if (var16 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (param1 != var10.field_q.field_y) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackOut_33_0 = 1;
                        stackIn_35_0 = stackOut_33_0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackOut_34_0 = 0;
                        stackIn_35_0 = stackOut_34_0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var12 = stackIn_35_0;
                        var13_ref_ln__ = var10.field_q.field_D;
                        var14 = 0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (~var13_ref_ln__.length >= ~var14) {
                            statePc = 41;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var15 = var13_ref_ln__[var14];
                        stackOut_37_0 = var15.field_y;
                        stackOut_37_1 = (fs) param1;
                        stackIn_62_0 = stackOut_37_0;
                        stackIn_62_1 = stackOut_37_1;
                        stackIn_38_0 = stackOut_37_0;
                        stackIn_38_1 = stackOut_37_1;
                        if (var16 != 0) {
                            statePc = 62;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (stackIn_38_0 != stackIn_38_1) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var12 = 1;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var14++;
                        if (var16 == 0) {
                            statePc = 36;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var12 != 0) {
                            statePc = 49;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var11_int = 0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (null == var10.field_r) {
                            statePc = 48;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var10.field_q.field_y != param1) {
                            statePc = 47;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (var10.field_q != var10.field_r) {
                            statePc = 49;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var11_int = 0;
                        if (var16 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var11_int = 0;
                        if (var16 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var11_int = 0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var16 == 0) {
                            statePc = 53;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var11_int = 0;
                        if (var16 == 0) {
                            statePc = 53;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var11_int = 0;
                        if (var16 == 0) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var11_int = 0;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (var11_int == 0) {
                            statePc = 55;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var9 = 1;
                        var10.b((byte) -71);
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var10 = (qm) (Object) param4.a((byte) -71);
                        if (var16 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var8 = (qa) (Object) param3.d(param2 ^ param2);
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (var8 == null) {
                            statePc = 73;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var11_int = 1;
                        if (var16 != 0) {
                            statePc = 82;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (null == var8.field_u) {
                            statePc = 63;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        stackOut_61_0 = var8.field_u.field_y;
                        stackOut_61_1 = (fs) param1;
                        stackIn_62_0 = stackOut_61_0;
                        stackIn_62_1 = stackOut_61_1;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (stackIn_62_0 == stackIn_62_1) {
                            statePc = 64;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var11_int = 0;
                        if (var16 == 0) {
                            statePc = 70;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (!((dc) this).field_o.field_i) {
                            statePc = 66;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var12_ref = (Object) (Object) var8.field_u.field_y.field_m;
                        if (var16 == 0) {
                            statePc = 67;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        var12_ref = (Object) (Object) var8.field_u.field_R;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        ((sd) var12_ref).field_x = ((sd) var12_ref).field_x - var8.field_v;
                        if (((sd) var12_ref).field_x < 0) {
                            statePc = 69;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var11_int = 0;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (var11_int != 0) {
                            statePc = 72;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var8.b((byte) -93);
                        var9 = 1;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        var8 = (qa) (Object) param3.a((byte) -71);
                        if (var16 == 0) {
                            statePc = 58;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        stackOut_73_0 = ((dc) this).field_o.field_i;
                        stackIn_74_0 = stackOut_73_0;
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (stackIn_74_0) {
                            statePc = 81;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        var18 = (sd) (Object) param1.field_i.d(0);
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (var18 == null) {
                            statePc = 80;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        vf.a(120, var18);
                        sh.a(var18, -5);
                        var18 = (sd) (Object) param1.field_i.a((byte) -71);
                        if (var16 != 0) {
                            statePc = 83;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (var16 == 0) {
                            statePc = 76;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (var16 == 0) {
                            statePc = 83;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        vf.a(122, (sd) (Object) param1.field_m);
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        sh.a((sd) (Object) param1.field_m, -5);
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        var11 = (mg) (Object) param0.d(0);
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (var11 == null) {
                            statePc = 108;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        var12 = 1;
                        if (var16 != 0) {
                            statePc = 110;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (var11.field_y == null) {
                            statePc = 90;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        if (var11.field_B == null) {
                            statePc = 90;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if (var11.field_y.field_y == param1) {
                            statePc = 91;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        var12 = 0;
                        if (var16 == 0) {
                            statePc = 104;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        var7[var11.field_y.field_p] = var7[var11.field_y.field_p] - var11.field_z;
                        if (!((dc) this).field_o.field_e) {
                            statePc = 93;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        stackOut_92_0 = 0;
                        stackIn_94_0 = stackOut_92_0;
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        stackOut_93_0 = var11.field_y.field_N;
                        stackIn_94_0 = stackOut_93_0;
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        var13 = stackIn_94_0;
                        if (0 < var11.field_z) {
                            statePc = 96;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        var12 = 0;
                        if (var16 == 0) {
                            statePc = 104;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        if (~var13 < ~var7[var11.field_y.field_p]) {
                            statePc = 103;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if (var11.field_y.field_R == var11.field_B.field_R) {
                            statePc = 101;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        if (!var11.field_y.b(var11.field_B, (byte) 10)) {
                            statePc = 100;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        var12 = 0;
                        if (var16 == 0) {
                            statePc = 104;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        if (((dc) this).a(var11.field_y, var11.field_B, -1)) {
                            statePc = 104;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        var12 = 0;
                        if (var16 == 0) {
                            statePc = 104;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        var12 = 0;
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        if (var12 == 0) {
                            statePc = 106;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        var11.b((byte) -103);
                        var9 = 1;
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        var11 = (mg) (Object) param0.a((byte) -71);
                        if (var16 == 0) {
                            statePc = 84;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        if (var9 != 0) {
                            statePc = 110;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        stackOut_109_0 = 1;
                        stackIn_111_0 = stackOut_109_0;
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        stackOut_110_0 = 0;
                        stackIn_111_0 = stackOut_110_0;
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 111: {
                    return stackIn_111_0 != 0;
                }
                case 112: {
                    var6 = (RuntimeException) (Object) caughtException;
                    stackOut_112_0 = (RuntimeException) var6;
                    stackOut_112_1 = new StringBuilder().append("dc.H(");
                    stackIn_114_0 = stackOut_112_0;
                    stackIn_114_1 = stackOut_112_1;
                    stackIn_113_0 = stackOut_112_0;
                    stackIn_113_1 = stackOut_112_1;
                    if (param0 == null) {
                        statePc = 114;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    stackOut_113_0 = (RuntimeException) (Object) stackIn_113_0;
                    stackOut_113_1 = (StringBuilder) (Object) stackIn_113_1;
                    stackOut_113_2 = "{...}";
                    stackIn_115_0 = stackOut_113_0;
                    stackIn_115_1 = stackOut_113_1;
                    stackIn_115_2 = stackOut_113_2;
                    statePc = 115;
                    continue stateLoop;
                }
                case 114: {
                    stackOut_114_0 = (RuntimeException) (Object) stackIn_114_0;
                    stackOut_114_1 = (StringBuilder) (Object) stackIn_114_1;
                    stackOut_114_2 = "null";
                    stackIn_115_0 = stackOut_114_0;
                    stackIn_115_1 = stackOut_114_1;
                    stackIn_115_2 = stackOut_114_2;
                    statePc = 115;
                    continue stateLoop;
                }
                case 115: {
                    stackOut_115_0 = (RuntimeException) (Object) stackIn_115_0;
                    stackOut_115_1 = ((StringBuilder) (Object) stackIn_115_1).append(stackIn_115_2).append(44);
                    stackIn_117_0 = stackOut_115_0;
                    stackIn_117_1 = stackOut_115_1;
                    stackIn_116_0 = stackOut_115_0;
                    stackIn_116_1 = stackOut_115_1;
                    if (param1 == null) {
                        statePc = 117;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    stackOut_116_0 = (RuntimeException) (Object) stackIn_116_0;
                    stackOut_116_1 = (StringBuilder) (Object) stackIn_116_1;
                    stackOut_116_2 = "{...}";
                    stackIn_118_0 = stackOut_116_0;
                    stackIn_118_1 = stackOut_116_1;
                    stackIn_118_2 = stackOut_116_2;
                    statePc = 118;
                    continue stateLoop;
                }
                case 117: {
                    stackOut_117_0 = (RuntimeException) (Object) stackIn_117_0;
                    stackOut_117_1 = (StringBuilder) (Object) stackIn_117_1;
                    stackOut_117_2 = "null";
                    stackIn_118_0 = stackOut_117_0;
                    stackIn_118_1 = stackOut_117_1;
                    stackIn_118_2 = stackOut_117_2;
                    statePc = 118;
                    continue stateLoop;
                }
                case 118: {
                    stackOut_118_0 = (RuntimeException) (Object) stackIn_118_0;
                    stackOut_118_1 = ((StringBuilder) (Object) stackIn_118_1).append(stackIn_118_2).append(44).append(param2).append(44);
                    stackIn_120_0 = stackOut_118_0;
                    stackIn_120_1 = stackOut_118_1;
                    stackIn_119_0 = stackOut_118_0;
                    stackIn_119_1 = stackOut_118_1;
                    if (param3 == null) {
                        statePc = 120;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    stackOut_119_0 = (RuntimeException) (Object) stackIn_119_0;
                    stackOut_119_1 = (StringBuilder) (Object) stackIn_119_1;
                    stackOut_119_2 = "{...}";
                    stackIn_121_0 = stackOut_119_0;
                    stackIn_121_1 = stackOut_119_1;
                    stackIn_121_2 = stackOut_119_2;
                    statePc = 121;
                    continue stateLoop;
                }
                case 120: {
                    stackOut_120_0 = (RuntimeException) (Object) stackIn_120_0;
                    stackOut_120_1 = (StringBuilder) (Object) stackIn_120_1;
                    stackOut_120_2 = "null";
                    stackIn_121_0 = stackOut_120_0;
                    stackIn_121_1 = stackOut_120_1;
                    stackIn_121_2 = stackOut_120_2;
                    statePc = 121;
                    continue stateLoop;
                }
                case 121: {
                    stackOut_121_0 = (RuntimeException) (Object) stackIn_121_0;
                    stackOut_121_1 = ((StringBuilder) (Object) stackIn_121_1).append(stackIn_121_2).append(44);
                    stackIn_123_0 = stackOut_121_0;
                    stackIn_123_1 = stackOut_121_1;
                    stackIn_122_0 = stackOut_121_0;
                    stackIn_122_1 = stackOut_121_1;
                    if (param4 == null) {
                        statePc = 123;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    stackOut_122_0 = (RuntimeException) (Object) stackIn_122_0;
                    stackOut_122_1 = (StringBuilder) (Object) stackIn_122_1;
                    stackOut_122_2 = "{...}";
                    stackIn_124_0 = stackOut_122_0;
                    stackIn_124_1 = stackOut_122_1;
                    stackIn_124_2 = stackOut_122_2;
                    statePc = 124;
                    continue stateLoop;
                }
                case 123: {
                    stackOut_123_0 = (RuntimeException) (Object) stackIn_123_0;
                    stackOut_123_1 = (StringBuilder) (Object) stackIn_123_1;
                    stackOut_123_2 = "null";
                    stackIn_124_0 = stackOut_123_0;
                    stackIn_124_1 = stackOut_123_1;
                    stackIn_124_2 = stackOut_123_2;
                    statePc = 124;
                    continue stateLoop;
                }
                case 124: {
                    throw r.a((Throwable) (Object) stackIn_124_0, stackIn_124_2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(k param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              L2: {
                if (((dc) this).field_r <= var3_int) {
                  break L2;
                } else {
                  if (var4 != 0) {
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    L3: {
                      if ((((dc) this).field_w & 1 << var3_int) != 0) {
                        break L3;
                      } else {
                        if (!((dc) this).field_v[var3_int].field_i.g(-98)) {
                          break L3;
                        } else {
                          ((dc) this).field_w = ((dc) this).field_w | 1 << var3_int;
                          if (param0 == null) {
                            break L3;
                          } else {
                            param0.a(((dc) this).field_v[var3_int], false);
                            break L3;
                          }
                        }
                      }
                    }
                    var3_int++;
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) runtimeException;
            stackOut_10_1 = new StringBuilder().append("dc.Q(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw r.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + 0 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, sd param1) {
        RuntimeException var3 = null;
        pf var3_ref = null;
        pf var4 = null;
        ln var5 = null;
        ln[] var6 = null;
        ln var6_ref = null;
        int var7_int = 0;
        sd var7 = null;
        ln var8 = null;
        ln[] var8_array = null;
        int var9 = 0;
        ln var10 = null;
        int var11 = 0;
        ln[] var12 = null;
        ln[] var13 = null;
        ln stackIn_5_0 = null;
        sd stackIn_10_0 = null;
        Object stackIn_16_0 = null;
        ln stackIn_17_0 = null;
        ln stackIn_26_0 = null;
        sd stackIn_28_0 = null;
        sd stackIn_28_1 = null;
        ln stackIn_30_0 = null;
        ln stackIn_33_0 = null;
        sd stackIn_38_0 = null;
        sd stackIn_38_1 = null;
        ln stackIn_45_0 = null;
        fs stackIn_48_0 = null;
        fs stackIn_53_0 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        RuntimeException decompiledCaughtException = null;
        ln stackOut_4_0 = null;
        sd stackOut_9_0 = null;
        oh stackOut_15_0 = null;
        ln stackOut_16_0 = null;
        ln stackOut_25_0 = null;
        sd stackOut_27_0 = null;
        sd stackOut_27_1 = null;
        ln stackOut_29_0 = null;
        ln stackOut_32_0 = null;
        sd stackOut_37_0 = null;
        sd stackOut_37_1 = null;
        ln stackOut_44_0 = null;
        fs stackOut_47_0 = null;
        fs stackOut_52_0 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var3_ref = new pf();
            var4 = new pf();
            var4.a((byte) -113, (oh) (Object) param1.field_q);
            param1.field_q.field_R = null;
            if (param0 > 45) {
              L1: while (true) {
                L2: {
                  L3: {
                    L4: {
                      if (var4.g(-105)) {
                        break L4;
                      } else {
                        var5 = (ln) (Object) var4.h(118);
                        var3_ref.a((byte) -113, (oh) (Object) var5);
                        stackOut_4_0 = (ln) var5;
                        stackIn_17_0 = stackOut_4_0;
                        stackIn_5_0 = stackOut_4_0;
                        if (var11 != 0) {
                          break L2;
                        } else {
                          if (stackIn_5_0.field_D != null) {
                            var12 = var5.field_D;
                            var6 = var12;
                            var7_int = 0;
                            L5: while (true) {
                              L6: {
                                if (var7_int >= var12.length) {
                                  break L6;
                                } else {
                                  var8 = var12[var7_int];
                                  var6_ref = var8;
                                  var6_ref = var8;
                                  stackOut_9_0 = var8.field_R;
                                  stackIn_16_0 = (Object) (Object) stackOut_9_0;
                                  stackIn_10_0 = stackOut_9_0;
                                  if (var11 != 0) {
                                    break L3;
                                  } else {
                                    L7: {
                                      if (stackIn_10_0 == param1) {
                                        var8.field_R = null;
                                        var4.a((byte) -113, (oh) (Object) var8);
                                        break L7;
                                      } else {
                                        break L7;
                                      }
                                    }
                                    var7_int++;
                                    if (var11 == 0) {
                                      continue L5;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                              if (var11 == 0) {
                                continue L1;
                              } else {
                                break L4;
                              }
                            }
                          } else {
                            continue L1;
                          }
                        }
                      }
                    }
                    stackOut_15_0 = var3_ref.d(0);
                    stackIn_16_0 = (Object) (Object) stackOut_15_0;
                    break L3;
                  }
                  stackOut_16_0 = (ln) (Object) stackIn_16_0;
                  stackIn_17_0 = stackOut_16_0;
                  break L2;
                }
                var5 = stackIn_17_0;
                L8: while (true) {
                  L9: {
                    L10: {
                      L11: {
                        L12: {
                          if (var5 == null) {
                            break L12;
                          } else {
                            var5.field_R = param1;
                            var5 = (ln) (Object) var3_ref.a((byte) -71);
                            if (var11 != 0) {
                              break L11;
                            } else {
                              if (var11 == 0) {
                                continue L8;
                              } else {
                                break L12;
                              }
                            }
                          }
                        }
                        if (!param1.e(27650)) {
                          break L11;
                        } else {
                          break L10;
                        }
                      }
                      L13: while (true) {
                        ln dupTemp$1 = param1.i(-40);
                        var6_ref = dupTemp$1;
                        stackOut_25_0 = (ln) dupTemp$1;
                        stackIn_26_0 = stackOut_25_0;
                        L14: while (true) {
                          if (stackIn_26_0 == null) {
                            break L10;
                          } else {
                            stackOut_27_0 = var6_ref.field_R;
                            stackOut_27_1 = (sd) param1;
                            stackIn_28_0 = stackOut_27_0;
                            stackIn_28_1 = stackOut_27_1;
                            L15: while (true) {
                              if (stackIn_28_0 != stackIn_28_1) {
                                continue L13;
                              } else {
                                var7 = new sd(param1.field_o, var6_ref);
                                var4.a((byte) -113, (oh) (Object) var6_ref);
                                stackOut_29_0 = (ln) var6_ref;
                                stackIn_45_0 = stackOut_29_0;
                                stackIn_30_0 = stackOut_29_0;
                                if (var11 != 0) {
                                  break L9;
                                } else {
                                  stackIn_30_0.field_R = var7;
                                  L16: while (true) {
                                    L17: {
                                      if (var4.g(121)) {
                                        break L17;
                                      } else {
                                        var6_ref = (ln) (Object) var4.h(73);
                                        var7.a(-21771, var6_ref);
                                        stackOut_32_0 = (ln) var6_ref;
                                        stackIn_26_0 = stackOut_32_0;
                                        stackIn_33_0 = stackOut_32_0;
                                        if (var11 != 0) {
                                          continue L14;
                                        } else {
                                          if (stackIn_33_0.field_D != null) {
                                            var13 = var6_ref.field_D;
                                            var8_array = var6_ref.field_D;
                                            var9 = 0;
                                            L18: while (true) {
                                              L19: {
                                                if (~var13.length >= ~var9) {
                                                  break L19;
                                                } else {
                                                  var10 = var13[var9];
                                                  stackOut_37_0 = var10.field_R;
                                                  stackOut_37_1 = (sd) param1;
                                                  stackIn_28_0 = stackOut_37_0;
                                                  stackIn_28_1 = stackOut_37_1;
                                                  stackIn_38_0 = stackOut_37_0;
                                                  stackIn_38_1 = stackOut_37_1;
                                                  if (var11 != 0) {
                                                    continue L15;
                                                  } else {
                                                    L20: {
                                                      if (stackIn_38_0 == stackIn_38_1) {
                                                        var10.field_R = var7;
                                                        var4.a((byte) -113, (oh) (Object) var10);
                                                        break L20;
                                                      } else {
                                                        break L20;
                                                      }
                                                    }
                                                    var9++;
                                                    if (var11 == 0) {
                                                      continue L18;
                                                    } else {
                                                      break L19;
                                                    }
                                                  }
                                                }
                                              }
                                              if (var11 == 0) {
                                                continue L16;
                                              } else {
                                                break L17;
                                              }
                                            }
                                          } else {
                                            continue L16;
                                          }
                                        }
                                      }
                                    }
                                    sh.a(var7, -5);
                                    param1.field_o.field_i.a((byte) -113, (oh) (Object) var7);
                                    if (var11 == 0) {
                                      continue L13;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    param1.a(var3_ref, -9332);
                    stackOut_44_0 = param1.field_o.field_m.j(18229);
                    stackIn_45_0 = stackOut_44_0;
                    break L9;
                  }
                  var6_ref = stackIn_45_0;
                  L21: while (true) {
                    L22: {
                      L23: {
                        if (var6_ref == null) {
                          break L23;
                        } else {
                          stackOut_47_0 = var6_ref.field_y;
                          stackIn_53_0 = stackOut_47_0;
                          stackIn_48_0 = stackOut_47_0;
                          if (var11 != 0) {
                            break L22;
                          } else {
                            L24: {
                              if (stackIn_48_0 != param1.field_o) {
                                var6_ref.a(16);
                                break L24;
                              } else {
                                break L24;
                              }
                            }
                            var6_ref = param1.field_o.field_m.h(-23410);
                            if (var11 == 0) {
                              continue L21;
                            } else {
                              break L23;
                            }
                          }
                        }
                      }
                      stackOut_52_0 = param1.field_o;
                      stackIn_53_0 = stackOut_52_0;
                      break L22;
                    }
                    sh.a((sd) (Object) stackIn_53_0.field_m, -5);
                    break L0;
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L25: {
            var3 = decompiledCaughtException;
            stackOut_55_0 = (RuntimeException) var3;
            stackOut_55_1 = new StringBuilder().append("dc.R(").append(param0).append(44);
            stackIn_57_0 = stackOut_55_0;
            stackIn_57_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param1 == null) {
              stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
              stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
              stackOut_57_2 = "null";
              stackIn_58_0 = stackOut_57_0;
              stackIn_58_1 = stackOut_57_1;
              stackIn_58_2 = stackOut_57_2;
              break L25;
            } else {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "{...}";
              stackIn_58_0 = stackOut_56_0;
              stackIn_58_1 = stackOut_56_1;
              stackIn_58_2 = stackOut_56_2;
              break L25;
            }
          }
          throw r.a((Throwable) (Object) stackIn_58_0, stackIn_58_2 + 41);
        }
    }

    private final void a(byte param0, ln param1) {
        sd var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            if (param0 > 57) {
              var3 = param1.field_R;
              if (var3 != null) {
                L1: {
                  param1.field_R = null;
                  param1.b((byte) -111);
                  param1.a(16);
                  if (param1 == var3.field_o.field_m.field_q) {
                    var3.field_o.field_m.field_q = var3.field_o.field_m.j(18229);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (var3.field_q == param1) {
                    L3: {
                      if (var3.e(27650)) {
                        break L3;
                      } else {
                        var3.field_q = var3.j(18229);
                        if (!ShatteredPlansClient.field_F) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var3.b((byte) -81);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L4: {
                  if (var3.e(27650)) {
                    break L4;
                  } else {
                    this.a(72, var3);
                    break L4;
                  }
                }
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3_ref;
            stackOut_16_1 = new StringBuilder().append("dc.N(").append(param0).append(44);
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
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw r.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
    }

    private final void a(k param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        ln[] var6 = null;
        int var7 = 0;
        ln var8_ref_ln = null;
        int var8 = 0;
        ln[] var9_ref_ln__ = null;
        int var9 = 0;
        int var10 = 0;
        ln var11 = null;
        ln[] var12 = null;
        int var12_int = 0;
        int[] var12_array = null;
        int var13 = 0;
        ln var14_ref_ln = null;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        int stackIn_13_0 = 0;
        fs stackIn_23_0 = null;
        fs stackIn_23_1 = null;
        int stackIn_33_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        fs stackIn_41_0 = null;
        fs stackIn_41_1 = null;
        fs stackIn_54_0 = null;
        fs stackIn_54_1 = null;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        fs stackIn_68_0 = null;
        fs stackIn_75_0 = null;
        fs stackIn_76_0 = null;
        fs stackIn_76_1 = null;
        int stackIn_102_0 = 0;
        int stackIn_102_1 = 0;
        RuntimeException stackIn_111_0 = null;
        StringBuilder stackIn_111_1 = null;
        RuntimeException stackIn_112_0 = null;
        StringBuilder stackIn_112_1 = null;
        RuntimeException stackIn_113_0 = null;
        StringBuilder stackIn_113_1 = null;
        String stackIn_113_2 = null;
        int stackOut_12_0 = 0;
        fs stackOut_22_0 = null;
        fs stackOut_22_1 = null;
        int stackOut_32_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        fs stackOut_40_0 = null;
        fs stackOut_40_1 = null;
        fs stackOut_53_0 = null;
        fs stackOut_53_1 = null;
        int stackOut_62_0 = 0;
        int stackOut_62_1 = 0;
        int stackOut_64_0 = 0;
        int stackOut_64_1 = 0;
        fs stackOut_67_0 = null;
        fs stackOut_74_0 = null;
        fs stackOut_75_0 = null;
        fs stackOut_75_1 = null;
        int stackOut_101_0 = 0;
        int stackOut_101_1 = 0;
        RuntimeException stackOut_110_0 = null;
        StringBuilder stackOut_110_1 = null;
        RuntimeException stackOut_111_0 = null;
        StringBuilder stackOut_111_1 = null;
        String stackOut_111_2 = null;
        RuntimeException stackOut_112_0 = null;
        StringBuilder stackOut_112_1 = null;
        String stackOut_112_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = ShatteredPlansClient.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4_int = ((dc) this).field_g.field_e.length;
                        if (ec.field_r == null) {
                            statePc = 9;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (ec.field_r.length < var4_int) {
                            statePc = 9;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var5 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var4_int <= var5) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        ec.field_r[var5] = false;
                        var5++;
                        if (var15 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var15 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var15 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ec.field_r = new boolean[var4_int];
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5 = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var6 = ((dc) this).field_g.field_e;
                        var7 = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = var7;
                        stackIn_13_0 = stackOut_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (stackIn_13_0 >= var6.length) {
                            statePc = 28;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var8_ref_ln = var6[var7];
                        var11 = var8_ref_ln;
                        var11 = var8_ref_ln;
                        if (var15 != 0) {
                            statePc = 32;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var8_ref_ln.field_y == null) {
                            statePc = 27;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (!ec.field_r[var8_ref_ln.field_p]) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var15 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (~var8_ref_ln.field_N >= ~var8_ref_ln.field_x) {
                            statePc = 27;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        ec.field_r[var8_ref_ln.field_p] = true;
                        var5 = 1;
                        var9_ref_ln__ = var8_ref_ln.field_D;
                        var10 = 0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var9_ref_ln__.length <= var10) {
                            statePc = 27;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var11 = var9_ref_ln__[var10];
                        stackOut_22_0 = var8_ref_ln.field_y;
                        stackOut_22_1 = var11.field_y;
                        stackIn_54_0 = stackOut_22_0;
                        stackIn_54_1 = stackOut_22_1;
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        if (var15 != 0) {
                            statePc = 54;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (stackIn_23_0 != stackIn_23_1) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (ec.field_r[var11.field_p]) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        this.a(var11, true, (byte) 125);
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var10++;
                        if (var15 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var7++;
                        if (var15 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var5 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (!((dc) this).field_o.field_k) {
                            statePc = 10;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var6 = new ln[16];
                        var7 = 16;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var9_ref_ln__ = ((dc) this).field_g.field_e;
                        stackOut_32_0 = 0;
                        stackIn_13_0 = stackOut_32_0;
                        stackIn_33_0 = stackOut_32_0;
                        if (var15 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var10 = stackIn_33_0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (var9_ref_ln__.length <= var10) {
                            statePc = 61;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var11 = var9_ref_ln__[var10];
                        stackOut_35_0 = -1;
                        stackOut_35_1 = ~var11.field_Q;
                        stackIn_63_0 = stackOut_35_0;
                        stackIn_63_1 = stackOut_35_1;
                        stackIn_36_0 = stackOut_35_0;
                        stackIn_36_1 = stackOut_35_1;
                        if (var15 != 0) {
                            statePc = 63;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (stackIn_36_0 > stackIn_36_1) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var8 = 0;
                        var12 = var11.field_D;
                        var13 = 0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (~var13 <= ~var12.length) {
                            statePc = 46;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var14_ref_ln = var12[var13];
                        var11 = var14_ref_ln;
                        var11 = var14_ref_ln;
                        stackOut_40_0 = var14_ref_ln.field_y;
                        stackOut_40_1 = var11.field_t;
                        stackIn_76_0 = stackOut_40_0;
                        stackIn_76_1 = stackOut_40_1;
                        stackIn_41_0 = stackOut_40_0;
                        stackIn_41_1 = stackOut_40_1;
                        if (var15 != 0) {
                            statePc = 76;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (stackIn_41_0 != stackIn_41_1) {
                            statePc = 45;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (!ec.field_r[var14_ref_ln.field_p]) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        int incrementValue$4 = var8;
                        var8++;
                        var6[incrementValue$4] = var14_ref_ln;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var13++;
                        if (var15 == 0) {
                            statePc = 39;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var8 == 0) {
                            statePc = 52;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        ((dc) this).field_L.setSeed((long)(param1 ^ var11.field_p));
                        var12_int = 0;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (var12_int >= var11.field_Q) {
                            statePc = 52;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        ln dupTemp$5 = var6[qf.a((byte) 78, var8, ((dc) this).field_L)];
                        dupTemp$5.field_x = dupTemp$5.field_x + 1;
                        var12_int++;
                        if (var15 != 0) {
                            statePc = 58;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (var15 == 0) {
                            statePc = 48;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (0 >= var11.field_C) {
                            statePc = 58;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        stackOut_53_0 = var11.field_t;
                        stackOut_53_1 = var11.field_y;
                        stackIn_54_0 = stackOut_53_0;
                        stackIn_54_1 = stackOut_53_1;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (stackIn_54_0 != stackIn_54_1) {
                            statePc = 58;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (!ec.field_r[var11.field_p]) {
                            statePc = 57;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var11.field_x = var11.field_x + var11.field_C;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (null == var11.field_y) {
                            statePc = 60;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var11.field_t = var11.field_y;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var10++;
                        if (var15 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var9_ref_ln__ = ((dc) this).field_g.field_e;
                        var10 = 0;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        stackOut_62_0 = ~var9_ref_ln__.length;
                        stackOut_62_1 = ~var10;
                        stackIn_63_0 = stackOut_62_0;
                        stackIn_63_1 = stackOut_62_1;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (stackIn_63_0 >= stackIn_63_1) {
                            statePc = 101;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var11 = var9_ref_ln__[var10];
                        stackOut_64_0 = ~var11.field_D.length;
                        stackOut_64_1 = ~var7;
                        stackIn_102_0 = stackOut_64_0;
                        stackIn_102_1 = stackOut_64_1;
                        stackIn_65_0 = stackOut_64_0;
                        stackIn_65_1 = stackOut_64_1;
                        if (var15 != 0) {
                            statePc = 102;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (stackIn_65_0 >= stackIn_65_1) {
                            statePc = 67;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        var6 = new ln[var11.field_D.length];
                        var7 = var11.field_D.length;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        stackOut_67_0 = var11.field_y;
                        stackIn_68_0 = stackOut_67_0;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (stackIn_68_0 == null) {
                            statePc = 100;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (ec.field_r[var11.field_p]) {
                            statePc = 72;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (var15 == 0) {
                            statePc = 100;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        var8 = 0;
                        var12 = var11.field_D;
                        var13 = 0;
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (var13 >= var12.length) {
                            statePc = 81;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        var14_ref_ln = var12[var13];
                        stackOut_74_0 = var11.field_y;
                        stackIn_68_0 = stackOut_74_0;
                        stackIn_75_0 = stackOut_74_0;
                        if (var15 != 0) {
                            statePc = 68;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        stackOut_75_0 = (fs) (Object) stackIn_75_0;
                        stackOut_75_1 = var14_ref_ln.field_y;
                        stackIn_76_0 = stackOut_75_0;
                        stackIn_76_1 = stackOut_75_1;
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (stackIn_76_0 != stackIn_76_1) {
                            statePc = 80;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if (!ec.field_r[var14_ref_ln.field_p]) {
                            statePc = 79;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        int incrementValue$6 = var8;
                        var8++;
                        var6[incrementValue$6] = var14_ref_ln;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        var13++;
                        if (var15 == 0) {
                            statePc = 73;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if (0 == var8) {
                            statePc = 94;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        ((dc) this).field_L.setSeed((long)(param1 ^ var11.field_p));
                        if (param0 != null) {
                            statePc = 88;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        var12_int = 0;
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (var12_int >= var11.field_x) {
                            statePc = 96;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        ln dupTemp$7 = var6[qf.a((byte) 27, var8, ((dc) this).field_L)];
                        dupTemp$7.field_x = dupTemp$7.field_x + 1;
                        var12_int++;
                        if (var15 != 0) {
                            statePc = 97;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (var15 == 0) {
                            statePc = 84;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        var16 = new int[var8];
                        var12_array = var16;
                        var13 = 0;
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        if (var11.field_x <= var13) {
                            statePc = 93;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        var14 = qf.a((byte) 115, var8, ((dc) this).field_L);
                        var16[var14] = var16[var14] + 1;
                        var6[var14].field_x = var6[var14].field_x + 1;
                        var13++;
                        if (var15 != 0) {
                            statePc = 96;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if (var15 == 0) {
                            statePc = 89;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        param0.a(var11, 73, var12_array, var6);
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        if (param0 == null) {
                            statePc = 96;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        param0.a(var11.field_x, var11, true);
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        this.a(-21031, var11);
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if (var11.field_R != null) {
                            statePc = 99;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        var10++;
                        if (var15 == 0) {
                            statePc = 62;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        stackOut_101_0 = 14389;
                        stackOut_101_1 = 14389;
                        stackIn_102_0 = stackOut_101_0;
                        stackIn_102_1 = stackOut_101_1;
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if (stackIn_102_0 == stackIn_102_1) {
                            statePc = 104;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        ((dc) this).field_u = null;
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        var9 = 0;
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        if (~var4_int >= ~var9) {
                            statePc = 114;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        ec.field_r[var9] = false;
                        var9++;
                        if (var15 != 0) {
                            statePc = 116;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        if (var15 == 0) {
                            statePc = 105;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 110: {
                    var4 = (RuntimeException) (Object) caughtException;
                    stackOut_110_0 = (RuntimeException) var4;
                    stackOut_110_1 = new StringBuilder().append("dc.HA(");
                    stackIn_112_0 = stackOut_110_0;
                    stackIn_112_1 = stackOut_110_1;
                    stackIn_111_0 = stackOut_110_0;
                    stackIn_111_1 = stackOut_110_1;
                    if (param0 == null) {
                        statePc = 112;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    stackOut_111_0 = (RuntimeException) (Object) stackIn_111_0;
                    stackOut_111_1 = (StringBuilder) (Object) stackIn_111_1;
                    stackOut_111_2 = "{...}";
                    stackIn_113_0 = stackOut_111_0;
                    stackIn_113_1 = stackOut_111_1;
                    stackIn_113_2 = stackOut_111_2;
                    statePc = 113;
                    continue stateLoop;
                }
                case 112: {
                    stackOut_112_0 = (RuntimeException) (Object) stackIn_112_0;
                    stackOut_112_1 = (StringBuilder) (Object) stackIn_112_1;
                    stackOut_112_2 = "null";
                    stackIn_113_0 = stackOut_112_0;
                    stackIn_113_1 = stackOut_112_1;
                    stackIn_113_2 = stackOut_112_2;
                    statePc = 113;
                    continue stateLoop;
                }
                case 113: {
                    throw r.a((Throwable) (Object) stackIn_113_0, stackIn_113_2 + 44 + param1 + 44 + 14389 + 41);
                }
                case 114: {
                    return;
                }
                case 116: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void d(int param0, int param1) {
        ((dc) this).field_O = param1;
        if (param0 != -9778) {
            ((dc) this).field_r = -91;
        }
    }

    dc(int param0, vr param1, int param2, String[] param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        ((dc) this).field_n = 0;
        ((dc) this).field_G = 0;
        try {
          L0: {
            ((dc) this).field_J = param0;
            ((dc) this).field_o = param1;
            ((dc) this).field_M = param2;
            ((dc) this).field_r = param3.length;
            ((dc) this).field_v = new fs[((dc) this).field_r];
            ((dc) this).field_k = -1;
            ((dc) this).field_D = new int[((dc) this).field_r];
            ((dc) this).field_I = param3;
            var5_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~((dc) this).field_r >= ~var5_int) {
                    break L3;
                  } else {
                    ((dc) this).field_v[var5_int] = new fs(var5_int, ((dc) this).field_I[var5_int], or.field_b[var5_int], df.field_k[var5_int], ho.field_e[var5_int]);
                    ((dc) this).field_v[var5_int].field_f = new int[((dc) this).field_r];
                    ((dc) this).field_v[var5_int].field_h = new boolean[((dc) this).field_r];
                    var5_int++;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var5_int = ((dc) this).field_M;
                break L2;
              }
              L4: {
                L5: {
                  L6: {
                    L7: {
                      L8: {
                        L9: {
                          if (0 == var5_int) {
                            ((dc) this).field_x = (me) (Object) new jj(((dc) this).field_v);
                            if (var6 == 0) {
                              break L4;
                            } else {
                              break L9;
                            }
                          } else {
                            if (1 == var5_int) {
                              break L9;
                            } else {
                              L10: {
                                if (var5_int != 2) {
                                  break L10;
                                } else {
                                  if (var6 == 0) {
                                    break L8;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              if (var5_int == 3) {
                                break L7;
                              } else {
                                if (var5_int == -1) {
                                  break L6;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                        }
                        ((dc) this).field_x = (me) (Object) new ui(((dc) this).field_v);
                        if (var6 == 0) {
                          break L4;
                        } else {
                          break L8;
                        }
                      }
                      ((dc) this).field_x = (me) (Object) new nh(((dc) this).field_v);
                      if (var6 == 0) {
                        break L4;
                      } else {
                        break L7;
                      }
                    }
                    ((dc) this).field_x = (me) (Object) new hp(((dc) this).field_v);
                    if (var6 == 0) {
                      break L4;
                    } else {
                      break L6;
                    }
                  }
                  ((dc) this).field_x = (me) (Object) new qg(((dc) this).field_v);
                  if (var6 == 0) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
                throw new RuntimeException("No VictoryChecker known for gametype " + ((dc) this).field_M);
              }
              ((dc) this).field_p = new el();
              ((dc) this).field_q = new pf();
              ((dc) this).field_i = new pf();
              ((dc) this).field_B = new int[((dc) this).field_r + 1];
              ((dc) this).field_H = new int[((dc) this).field_r - -1];
              ((dc) this).field_h = new int[((dc) this).field_r];
              ((dc) this).field_K = new int[1 + ((dc) this).field_r];
              ((dc) this).field_u = new int[1 + ((dc) this).field_r];
              ((dc) this).field_A = new pf();
              ((dc) this).field_L = (Random) (Object) new ea();
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var5 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var5;
            stackOut_21_1 = new StringBuilder().append("dc.<init>(").append(param0).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L11;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L11;
            }
          }
          L12: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(44).append(param2).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param3 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L12;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L12;
            }
          }
          throw r.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 41);
        }
    }

    private final void a(byte param0, ln param1, eg param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        mg var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null != param1.field_y) {
                L2: {
                  var4_int = ((dc) this).field_h[param1.field_y.field_x];
                  var5 = ((dc) this).field_u[param1.field_y.field_x];
                  var6 = var4_int - var5;
                  if (var5 > 0) {
                    break L2;
                  } else {
                    L3: {
                      if (param2 != null) {
                        param2.a(var4_int, 14775, var6);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    param1.field_Q = var4_int / 2;
                    if (var10 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L4: {
                  var7 = var6 / 2;
                  if (param2 == null) {
                    break L4;
                  } else {
                    param2.a(var6, var4_int, var7, 124);
                    break L4;
                  }
                }
                param1.field_C = param1.field_C + var7;
                break L1;
              } else {
                break L1;
              }
            }
            L5: {
              var4_ref = (mg) (Object) param1.field_s.c(-128);
              if (param0 <= -122) {
                break L5;
              } else {
                this.a((ln) null, -35, (ln) null);
                break L5;
              }
            }
            L6: while (true) {
              L7: {
                if (var4_ref == null) {
                  break L7;
                } else {
                  if (var10 != 0) {
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    L8: {
                      if (var4_ref.field_G != param1.field_y) {
                        L9: {
                          var5 = ((dc) this).field_h[var4_ref.field_G.field_x];
                          var6 = ((dc) this).field_u[var4_ref.field_G.field_x];
                          var7 = -var6 + var5;
                          var8 = var4_ref.field_z * var7 / var5;
                          var9 = var8 / 2;
                          var8 = var8 - var9;
                          if (param2 != null) {
                            param2.a(var9, 0, var4_ref, var8);
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        var4_ref.field_y.field_C = var4_ref.field_y.field_C + var9;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    var4_ref = (mg) (Object) param1.field_s.b(32);
                    if (var10 == 0) {
                      continue L6;
                    } else {
                      break L7;
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var4;
            stackOut_23_1 = new StringBuilder().append("dc.OA(").append(param0).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L10;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L10;
            }
          }
          L11: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param2 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L11;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L11;
            }
          }
          throw r.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = new pf();
        field_s = new int[8192];
        field_a = "This game has started.";
        field_l = new np(1);
    }
}
