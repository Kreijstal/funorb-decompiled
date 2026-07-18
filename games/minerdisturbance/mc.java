/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class mc {
    private int field_d;
    private int[] field_p;
    static String field_x;
    private int field_l;
    private int field_s;
    private int field_c;
    private ea field_r;
    static String field_e;
    private MinerDisturbance field_q;
    private int field_b;
    static bd field_t;
    private int field_f;
    private int[] field_g;
    static String field_z;
    static ea field_u;
    private boolean[] field_i;
    private int[] field_j;
    private int field_y;
    private ea field_h;
    boolean field_o;
    private int field_n;
    private int field_k;
    private int field_a;
    static ta field_m;
    private int field_v;
    static int field_w;

    private final void a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        boolean[] var5_ref_boolean__ = null;
        boolean[] var6 = null;
        boolean[] var7 = null;
        boolean[] var8 = null;
        boolean[] var9 = null;
        int var10 = 0;
        Object stackIn_48_0 = null;
        Object stackIn_49_0 = null;
        Object stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int stackIn_66_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_88_0 = 0;
        Object stackIn_119_0 = null;
        int stackIn_119_1 = 0;
        Object stackIn_120_0 = null;
        int stackIn_120_1 = 0;
        Object stackIn_121_0 = null;
        int stackIn_121_1 = 0;
        int stackIn_121_2 = 0;
        boolean[] stackIn_122_0 = null;
        int stackIn_122_1 = 0;
        boolean[] stackIn_123_0 = null;
        int stackIn_123_1 = 0;
        boolean[] stackIn_124_0 = null;
        int stackIn_124_1 = 0;
        int stackIn_124_2 = 0;
        int stackOut_78_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_64_0 = 0;
        Object stackOut_47_0 = null;
        Object stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        Object stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        int stackOut_87_0 = 0;
        int stackOut_86_0 = 0;
        Object stackOut_118_0 = null;
        int stackOut_118_1 = 0;
        Object stackOut_120_0 = null;
        int stackOut_120_1 = 0;
        int stackOut_120_2 = 0;
        Object stackOut_119_0 = null;
        int stackOut_119_1 = 0;
        int stackOut_119_2 = 0;
        boolean[] stackOut_121_0 = null;
        int stackOut_121_1 = 0;
        boolean[] stackOut_123_0 = null;
        int stackOut_123_1 = 0;
        int stackOut_123_2 = 0;
        boolean[] stackOut_122_0 = null;
        int stackOut_122_1 = 0;
        int stackOut_122_2 = 0;
        var10 = MinerDisturbance.field_ab;
        var4 = 0;
        if (param2 == -3) {
          L0: {
            ((mc) this).field_q.a(3, 0);
            ((mc) this).field_o = true;
            if (0 == param0) {
              stackOut_78_0 = 0;
              stackIn_79_0 = stackOut_78_0;
              break L0;
            } else {
              stackOut_77_0 = 1;
              stackIn_79_0 = stackOut_77_0;
              break L0;
            }
          }
          jc.a(stackIn_79_0 != 0, -122, 4);
          return;
        } else {
          if (param2 == -5) {
            L1: {
              if (((mc) this).field_f != 0) {
                break L1;
              } else {
                if (this.a(-7)) {
                  break L1;
                } else {
                  var5 = 0;
                  L2: while (true) {
                    if (var5 >= 21) {
                      ((mc) this).field_o = true;
                      ke.field_V = true;
                      ((mc) this).field_q.h((byte) 78);
                      wm.a(false);
                      return;
                    } else {
                      bn.field_b[var5] = qe.field_b[var5];
                      var5++;
                      continue L2;
                    }
                  }
                }
              }
            }
            ((mc) this).field_y = 100;
            return;
          } else {
            L3: {
              if (param2 != -2) {
                if (-4 != param2) {
                  param2 = nb.field_g[ah.field_f][param2];
                  break L3;
                } else {
                  L4: {
                    if (sc.field_b) {
                      stackOut_65_0 = 0;
                      stackIn_66_0 = stackOut_65_0;
                      break L4;
                    } else {
                      stackOut_64_0 = 1;
                      stackIn_66_0 = stackOut_64_0;
                      break L4;
                    }
                  }
                  sc.field_b = stackIn_66_0 != 0;
                  d.field_c = true;
                  break L3;
                }
              } else {
                L5: {
                  ((mc) this).field_j[21] = 2;
                  if (ah.field_f != 0) {
                    if (!qe.field_b[2]) {
                      break L5;
                    } else {
                      if (!qe.field_b[0]) {
                        break L5;
                      } else {
                        if (!qe.field_b[16]) {
                          break L5;
                        } else {
                          if (!qe.field_b[7]) {
                            break L5;
                          } else {
                            if (!qe.field_b[6]) {
                              break L5;
                            } else {
                              if (!qe.field_b[3]) {
                                break L5;
                              } else {
                                var5_ref_boolean__ = qe.field_b;
                                var6 = qe.field_b;
                                var7 = qe.field_b;
                                var8 = qe.field_b;
                                qe.field_b[3] = false;
                                var9 = qe.field_b;
                                ((mc) this).field_j[0] = 2;
                                ((mc) this).field_f = 6;
                                ((mc) this).field_j[6] = 2;
                                var5_ref_boolean__[2] = false;
                                var8[7] = false;
                                ((mc) this).field_j[16] = 2;
                                var4 = 1;
                                ((mc) this).field_j[2] = 2;
                                var6[0] = false;
                                var9[6] = false;
                                ((mc) this).field_j[7] = 2;
                                ((mc) this).field_j[3] = 2;
                                var7[16] = false;
                                ne.a(2, 94);
                                return;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    if (((mc) this).field_f != 0) {
                      break L5;
                    } else {
                      if (!qe.field_b[2]) {
                        break L5;
                      } else {
                        if (!qe.field_b[0]) {
                          break L5;
                        } else {
                          if (!qe.field_b[3]) {
                            break L5;
                          } else {
                            if (!qe.field_b[7]) {
                              break L5;
                            } else {
                              if (qe.field_b[6]) {
                                var5_ref_boolean__ = qe.field_b;
                                var6 = qe.field_b;
                                var7 = qe.field_b;
                                qe.field_b[6] = false;
                                var8 = qe.field_b;
                                ((mc) this).field_j[2] = 2;
                                ((mc) this).field_f = 5;
                                var8[7] = false;
                                ((mc) this).field_j[3] = 2;
                                var6[0] = false;
                                ((mc) this).field_j[6] = 2;
                                ((mc) this).field_j[7] = 2;
                                var5_ref_boolean__[2] = false;
                                ((mc) this).field_j[0] = 2;
                                var4 = 1;
                                var7[3] = false;
                                ne.a(2, 39);
                                return;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                L6: {
                  if (!qe.field_b[3]) {
                    ((mc) this).field_j[3] = 2;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (!qe.field_b[2]) {
                    ((mc) this).field_j[2] = 2;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (!qe.field_b[6]) {
                    ((mc) this).field_j[6] = 2;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (!qe.field_b[7]) {
                    ((mc) this).field_j[7] = 2;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (qe.field_b[0]) {
                    break L10;
                  } else {
                    ((mc) this).field_j[0] = 2;
                    break L10;
                  }
                }
                var5 = 0;
                L11: while (true) {
                  if (var5 >= 21) {
                    L12: {
                      kj.a(1, -22156);
                      qe.field_b[7] = true;
                      qe.field_b[2] = true;
                      qe.field_b[3] = true;
                      qe.field_b[0] = true;
                      stackOut_47_0 = this;
                      stackIn_49_0 = stackOut_47_0;
                      stackIn_48_0 = stackOut_47_0;
                      if (ah.field_f == 1) {
                        stackOut_49_0 = this;
                        stackOut_49_1 = 6;
                        stackIn_50_0 = stackOut_49_0;
                        stackIn_50_1 = stackOut_49_1;
                        break L12;
                      } else {
                        stackOut_48_0 = this;
                        stackOut_48_1 = 5;
                        stackIn_50_0 = stackOut_48_0;
                        stackIn_50_1 = stackOut_48_1;
                        break L12;
                      }
                    }
                    L13: {
                      ((mc) this).field_f = stackIn_50_1;
                      if (ah.field_f == 1) {
                        L14: {
                          if (!qe.field_b[16]) {
                            ((mc) this).field_j[16] = 2;
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        qe.field_b[16] = true;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    qe.field_b[6] = true;
                    var5 = 0;
                    L15: while (true) {
                      if (21 <= var5) {
                        break L3;
                      } else {
                        L16: {
                          if (qe.field_b[var5]) {
                            ((mc) this).field_f = ((mc) this).field_f - ((mc) this).field_g[var5];
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                        var5++;
                        continue L15;
                      }
                    }
                  } else {
                    L17: {
                      if (var5 == 0) {
                        break L17;
                      } else {
                        if (2 == var5) {
                          break L17;
                        } else {
                          if (var5 == 6) {
                            break L17;
                          } else {
                            if (var5 == 7) {
                              break L17;
                            } else {
                              if (3 != var5) {
                                L18: {
                                  if (ah.field_f != 1) {
                                    break L18;
                                  } else {
                                    if (var5 != 16) {
                                      break L18;
                                    } else {
                                      break L17;
                                    }
                                  }
                                }
                                if (!qe.field_b[var5]) {
                                  break L17;
                                } else {
                                  ((mc) this).field_j[var5] = 2;
                                  qe.field_b[var5] = false;
                                  ((mc) this).field_f = ((mc) this).field_f + ((mc) this).field_g[var5];
                                  break L17;
                                }
                              } else {
                                break L17;
                              }
                            }
                          }
                        }
                      }
                    }
                    var5++;
                    continue L11;
                  }
                }
              }
            }
            L19: {
              if (0 > param2) {
                break L19;
              } else {
                if (21 > param2) {
                  L20: {
                    if (~((mc) this).field_g[param2] < ~((mc) this).field_f) {
                      stackOut_87_0 = 0;
                      stackIn_88_0 = stackOut_87_0;
                      break L20;
                    } else {
                      stackOut_86_0 = 1;
                      stackIn_88_0 = stackOut_86_0;
                      break L20;
                    }
                  }
                  L21: {
                    L22: {
                      var5 = stackIn_88_0;
                      if (param2 != 2) {
                        break L22;
                      } else {
                        if (!qe.field_b[19]) {
                          break L22;
                        } else {
                          ((mc) this).field_j[19] = 2;
                          var5 = 1;
                          qe.field_b[19] = false;
                          ((mc) this).field_f = ((mc) this).field_f + ((mc) this).field_g[19];
                          break L21;
                        }
                      }
                    }
                    L23: {
                      if (19 != param2) {
                        break L23;
                      } else {
                        if (!qe.field_b[2]) {
                          break L23;
                        } else {
                          if (~(((mc) this).field_f + ((mc) this).field_g[2]) > ~((mc) this).field_g[19]) {
                            break L23;
                          } else {
                            var5 = 1;
                            ((mc) this).field_j[2] = 2;
                            qe.field_b[2] = false;
                            ((mc) this).field_f = ((mc) this).field_f + ((mc) this).field_g[2];
                            break L21;
                          }
                        }
                      }
                    }
                    L24: {
                      if (0 != param2) {
                        break L24;
                      } else {
                        if (!qe.field_b[1]) {
                          break L24;
                        } else {
                          ((mc) this).field_j[1] = 2;
                          var5 = 1;
                          qe.field_b[1] = false;
                          ((mc) this).field_f = ((mc) this).field_f + ((mc) this).field_g[1];
                          break L21;
                        }
                      }
                    }
                    L25: {
                      if (param2 != 1) {
                        break L25;
                      } else {
                        if (!qe.field_b[0]) {
                          break L25;
                        } else {
                          if (((mc) this).field_g[1] <= ((mc) this).field_g[0] + ((mc) this).field_f) {
                            qe.field_b[0] = false;
                            var5 = 1;
                            ((mc) this).field_j[0] = 2;
                            ((mc) this).field_f = ((mc) this).field_f + ((mc) this).field_g[0];
                            break L21;
                          } else {
                            break L25;
                          }
                        }
                      }
                    }
                    if (param2 == 12) {
                      if (!qe.field_b[12]) {
                        if (var5 != 0) {
                          kj.a(ne.a(false) * 2, -22156);
                          break L21;
                        } else {
                          break L21;
                        }
                      } else {
                        kj.a(ne.a(false) / 2, -22156);
                        break L21;
                      }
                    } else {
                      if (param2 != 13) {
                        break L21;
                      } else {
                        if (!qe.field_b[13]) {
                          if (var5 != 0) {
                            kj.a(3 * ne.a(false), -22156);
                            break L21;
                          } else {
                            break L21;
                          }
                        } else {
                          kj.a(ne.a(false) / 3, -22156);
                          break L21;
                        }
                      }
                    }
                  }
                  L26: {
                    L27: {
                      if (var5 != 0) {
                        break L27;
                      } else {
                        if (!qe.field_b[param2]) {
                          break L26;
                        } else {
                          break L27;
                        }
                      }
                    }
                    L28: {
                      stackOut_118_0 = this;
                      stackOut_118_1 = ((mc) this).field_f;
                      stackIn_120_0 = stackOut_118_0;
                      stackIn_120_1 = stackOut_118_1;
                      stackIn_119_0 = stackOut_118_0;
                      stackIn_119_1 = stackOut_118_1;
                      if (qe.field_b[param2]) {
                        stackOut_120_0 = this;
                        stackOut_120_1 = stackIn_120_1;
                        stackOut_120_2 = ((mc) this).field_g[param2];
                        stackIn_121_0 = stackOut_120_0;
                        stackIn_121_1 = stackOut_120_1;
                        stackIn_121_2 = stackOut_120_2;
                        break L28;
                      } else {
                        stackOut_119_0 = this;
                        stackOut_119_1 = stackIn_119_1;
                        stackOut_119_2 = -((mc) this).field_g[param2];
                        stackIn_121_0 = stackOut_119_0;
                        stackIn_121_1 = stackOut_119_1;
                        stackIn_121_2 = stackOut_119_2;
                        break L28;
                      }
                    }
                    L29: {
                      ((mc) this).field_f = stackIn_121_1 + stackIn_121_2;
                      var4 = 1;
                      stackOut_121_0 = qe.field_b;
                      stackOut_121_1 = param2;
                      stackIn_123_0 = stackOut_121_0;
                      stackIn_123_1 = stackOut_121_1;
                      stackIn_122_0 = stackOut_121_0;
                      stackIn_122_1 = stackOut_121_1;
                      if (qe.field_b[param2]) {
                        stackOut_123_0 = (boolean[]) (Object) stackIn_123_0;
                        stackOut_123_1 = stackIn_123_1;
                        stackOut_123_2 = 0;
                        stackIn_124_0 = stackOut_123_0;
                        stackIn_124_1 = stackOut_123_1;
                        stackIn_124_2 = stackOut_123_2;
                        break L29;
                      } else {
                        stackOut_122_0 = (boolean[]) (Object) stackIn_122_0;
                        stackOut_122_1 = stackIn_122_1;
                        stackOut_122_2 = 1;
                        stackIn_124_0 = stackOut_122_0;
                        stackIn_124_1 = stackOut_122_1;
                        stackIn_124_2 = stackOut_122_2;
                        break L29;
                      }
                    }
                    stackIn_124_0[stackIn_124_1] = stackIn_124_2 != 0;
                    break L26;
                  }
                  if (var4 != 0) {
                    ((mc) this).field_j[param2] = 2;
                    break L19;
                  } else {
                    break L19;
                  }
                } else {
                  break L19;
                }
              }
            }
            ne.a(2, 63);
            return;
          }
        }
    }

    private final void a(boolean param0, byte param1, String param2, int param3, boolean param4, boolean param5, boolean param6, int param7) {
        RuntimeException var9 = null;
        vm var9_ref = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        vm var13 = null;
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
        var12 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              var13 = mm.field_a;
              var9_ref = var13;
              var10 = ((mc) this).field_v - -param7;
              if (!param5) {
                var13.a(param2, var10 - 2, 450 - -var13.field_I, 2829610, -1);
                var13.a(param2, var10 + 2, 450 + var13.field_I, 2829610, -1);
                var13.a(param2, var10, 450 - -var13.field_I + -2, 2829610, -1);
                var13.a(param2, var10, var13.field_I + 452, 2829610, -1);
                var13.a(param2, var10 - 1, var13.field_I + 449, 2829610, -1);
                var13.a(param2, 1 + var10, var13.field_I + 449, 2829610, -1);
                var13.a(param2, -1 + var10, var13.field_I + 451, 2829610, -1);
                var13.a(param2, 1 + var10, 450 - (-var13.field_I + -1), 2829610, -1);
                break L1;
              } else {
                var11 = 3355443;
                var13.a(param2, var10 - 2, var13.field_I + 450, var11, -1);
                var13.a(param2, var10 + 2, 450 + var13.field_I, var11, -1);
                var13.a(param2, var10, -2 + (var13.field_I + 450), var11, -1);
                var13.a(param2, var10, 2 + var13.field_I + 450, var11, -1);
                var13.a(param2, var10 + -1, var13.field_I + 449, var11, -1);
                var13.a(param2, var10 - -1, 450 + (var13.field_I + -1), var11, -1);
                var13.a(param2, var10 - 1, 1 + (450 - -var13.field_I), var11, -1);
                var13.a(param2, 1 + var10, 450 - (-var13.field_I - 1), var11, -1);
                break L1;
              }
            }
            L2: {
              if (param1 < -97) {
                break L2;
              } else {
                ((mc) this).field_p = null;
                break L2;
              }
            }
            L3: {
              L4: {
                if (param4) {
                  break L4;
                } else {
                  if (!param0) {
                    if (!param5) {
                      var13.a(param2, var10, var13.field_I + 450, 16437248, -1);
                      break L3;
                    } else {
                      var13.a(param2, var10, var13.field_I + 450, 6776679, -1);
                      break L3;
                    }
                  } else {
                    break L4;
                  }
                }
              }
              if (!param5) {
                var13.a(param2, var10, var13.field_I + 450, 15884837, -1);
                break L3;
              } else {
                var13.a(param2, var10, 450 + var13.field_I, 14013909, -1);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var9 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var9;
            stackOut_16_1 = new StringBuilder().append("mc.G(").append(param0).append(',').append(param1).append(',');
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
          throw lj.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + 450 + ',' + param4 + ',' + param5 + ',' + false + ',' + param7 + ')');
        }
    }

    final static void c(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = MinerDisturbance.field_ab;
        if (param0 <= -68) {
          L0: {
            wc.field_b = false;
            ic.field_i = null;
            if (gd.field_B) {
              sj.field_h.i((byte) -97);
              break L0;
            } else {
              var1 = a.field_d;
              if (var1 <= 0) {
                sj.field_h.s(2121792);
                pb.a(53);
                break L0;
              } else {
                if (1 != var1) {
                  ic.field_i = oa.a((byte) -99, pb.field_A, new String[1]);
                  ic.field_i = in.a(new CharSequence[3], -1);
                  sj.field_h.s(2121792);
                  pb.a(53);
                  break L0;
                } else {
                  ic.field_i = qg.field_g;
                  ic.field_i = in.a(new CharSequence[3], -1);
                  sj.field_h.s(2121792);
                  pb.a(53);
                  break L0;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    private final boolean a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_23_0 = 0;
        int stackIn_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        var4 = MinerDisturbance.field_ab;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (var3 >= 21) {
            L1: {
              L2: {
                if (!qe.field_b[12]) {
                  break L2;
                } else {
                  if (qe.field_b[13]) {
                    if (ne.a(false) != 6) {
                      kj.a(6, -22156);
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              if (!qe.field_b[12]) {
                if (qe.field_b[13]) {
                  if (ne.a(false) == 3) {
                    break L1;
                  } else {
                    kj.a(3, -22156);
                    break L1;
                  }
                } else {
                  break L1;
                }
              } else {
                if (2 != ne.a(false)) {
                  kj.a(2, -22156);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            if (ah.field_f != 0) {
              if (ah.field_f == 1) {
                L3: {
                  if (var2 == 6) {
                    stackOut_28_0 = 0;
                    stackIn_29_0 = stackOut_28_0;
                    break L3;
                  } else {
                    stackOut_27_0 = 1;
                    stackIn_29_0 = stackOut_27_0;
                    break L3;
                  }
                }
                return stackIn_29_0 != 0;
              } else {
                return false;
              }
            } else {
              L4: {
                if (var2 == 5) {
                  stackOut_22_0 = 0;
                  stackIn_23_0 = stackOut_22_0;
                  break L4;
                } else {
                  stackOut_21_0 = 1;
                  stackIn_23_0 = stackOut_21_0;
                  break L4;
                }
              }
              return stackIn_23_0 != 0;
            }
          } else {
            L5: {
              if (!qe.field_b[var3]) {
                break L5;
              } else {
                var2 = var2 + ((mc) this).field_g[var3];
                break L5;
              }
            }
            var3++;
            continue L0;
          }
        }
    }

    private final void a(int param0, boolean param1, String param2, int param3, byte param4, boolean param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            this.a(false, (byte) -103, param2, 450, param1, false, false, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var7;
            stackOut_2_1 = new StringBuilder().append("mc.A(").append(450).append(',').append(param1).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param3 + ',' + -66 + ',' + false + ')');
        }
    }

    public static void a(byte param0) {
        field_x = null;
        field_u = null;
        field_m = null;
        if (param0 != -43) {
            mc.a((byte) -122);
        }
        field_t = null;
        field_z = null;
        field_e = null;
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
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int stackIn_19_0 = 0;
        boolean stackIn_66_0 = false;
        boolean stackIn_67_0 = false;
        boolean stackIn_68_0 = false;
        int stackIn_68_1 = 0;
        int stackIn_79_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_82_1 = 0;
        int stackIn_95_0 = 0;
        boolean[] stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        boolean[] stackIn_103_0 = null;
        int stackIn_103_1 = 0;
        boolean[] stackIn_104_0 = null;
        int stackIn_104_1 = 0;
        int stackIn_104_2 = 0;
        boolean[] stackIn_108_0 = null;
        int stackIn_108_1 = 0;
        boolean[] stackIn_109_0 = null;
        int stackIn_109_1 = 0;
        boolean[] stackIn_110_0 = null;
        int stackIn_110_1 = 0;
        int stackIn_110_2 = 0;
        int stackIn_177_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_175_0 = 0;
        int stackOut_176_0 = 0;
        boolean[] stackOut_107_0 = null;
        int stackOut_107_1 = 0;
        boolean[] stackOut_109_0 = null;
        int stackOut_109_1 = 0;
        int stackOut_109_2 = 0;
        boolean[] stackOut_108_0 = null;
        int stackOut_108_1 = 0;
        int stackOut_108_2 = 0;
        boolean[] stackOut_101_0 = null;
        int stackOut_101_1 = 0;
        boolean[] stackOut_103_0 = null;
        int stackOut_103_1 = 0;
        int stackOut_103_2 = 0;
        boolean[] stackOut_102_0 = null;
        int stackOut_102_1 = 0;
        int stackOut_102_2 = 0;
        boolean stackOut_65_0 = false;
        boolean stackOut_67_0 = false;
        int stackOut_67_1 = 0;
        boolean stackOut_66_0 = false;
        int stackOut_66_1 = 0;
        int stackOut_78_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_81_1 = 0;
        int stackOut_80_0 = 0;
        int stackOut_80_1 = 0;
        int stackOut_94_0 = 0;
        int stackOut_93_0 = 0;
        var17 = MinerDisturbance.field_ab;
        if (((mc) this).field_o) {
          L0: {
            ((mc) this).field_v = ((mc) this).field_v - 32;
            if (((mc) this).field_v >= -640) {
              break L0;
            } else {
              ((mc) this).field_q.field_Q = null;
              if (ke.field_V) {
                el.a(ah.field_f, param1 + -5624);
                fa.b(param1 + 15262);
                break L0;
              } else {
                fm.f((byte) 81);
                break L0;
              }
            }
          }
          return;
        } else {
          L1: {
            ((mc) this).field_c = ((mc) this).field_c + 1;
            ((mc) this).field_y = ((mc) this).field_y - 1;
            if ((255 & ((mc) this).field_c) >= 80) {
              break L1;
            } else {
              if (0 == (((mc) this).field_c & 7)) {
                ((mc) this).field_b = ((mc) this).field_b + 1;
                if (5 == ((mc) this).field_b) {
                  ((mc) this).field_b = 0;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
          }
          L2: {
            L3: {
              ((mc) this).field_k = 30 + (int)(0.5 + Math.sin((double)(((mc) this).field_c >> 2)) * 30.0);
              var5 = wc.field_c[ah.field_f][0].field_A;
              var6 = wc.field_c[ah.field_f][0].field_x;
              var7 = 5;
              var8 = 0;
              var9 = 0;
              var10 = 0;
              if (~((mc) this).field_s != ~param3) {
                break L3;
              } else {
                if (param2 != ((mc) this).field_n) {
                  break L3;
                } else {
                  if (param0 == 0) {
                    stackOut_18_0 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
            }
            stackOut_17_0 = 1;
            stackIn_19_0 = stackOut_17_0;
            break L2;
          }
          L4: {
            var11 = stackIn_19_0;
            ((mc) this).field_n = param2;
            if (((mc) this).field_v < 0) {
              break L4;
            } else {
              ((mc) this).field_s = param3;
              break L4;
            }
          }
          L5: {
            if (var11 == 0) {
              break L5;
            } else {
              if (((mc) this).field_v >= 0) {
                L6: {
                  ((mc) this).field_a = -1;
                  var12 = 3;
                  if (ah.field_f != 1) {
                    break L6;
                  } else {
                    var12 = 4;
                    break L6;
                  }
                }
                var13 = 0;
                L7: while (true) {
                  L8: {
                    if (var12 <= var13) {
                      break L8;
                    } else {
                      var14 = 0;
                      L9: while (true) {
                        if (~var14 <= ~var7) {
                          var13++;
                          continue L7;
                        } else {
                          L10: {
                            var15 = 40 + (((mc) this).field_v + var14 * (var6 + 16));
                            var16 = 80 + var13 * (4 + var5);
                            if (var15 >= param3) {
                              break L10;
                            } else {
                              if (param3 >= var15 - -var6) {
                                break L10;
                              } else {
                                if (~param2 >= ~var16) {
                                  break L10;
                                } else {
                                  if (var16 + var5 <= param2) {
                                    break L10;
                                  } else {
                                    var9 = 1;
                                    ((mc) this).field_l = -1;
                                    ((mc) this).field_a = var8;
                                    break L8;
                                  }
                                }
                              }
                            }
                          }
                          var8++;
                          var14++;
                          continue L9;
                        }
                      }
                    }
                  }
                  L11: {
                    if (449 >= param2) {
                      break L11;
                    } else {
                      if (475 <= param2) {
                        break L11;
                      } else {
                        L12: {
                          if (param3 <= 37) {
                            break L12;
                          } else {
                            if (169 > param3) {
                              ((mc) this).field_a = -3;
                              var9 = 1;
                              break L11;
                            } else {
                              break L12;
                            }
                          }
                        }
                        L13: {
                          if (param3 <= 329) {
                            break L13;
                          } else {
                            if (param3 < 443) {
                              ((mc) this).field_a = -4;
                              var9 = 1;
                              break L11;
                            } else {
                              break L13;
                            }
                          }
                        }
                        if (445 >= param3) {
                          break L11;
                        } else {
                          if (588 <= param3) {
                            break L11;
                          } else {
                            var9 = 1;
                            ((mc) this).field_a = -5;
                            break L11;
                          }
                        }
                      }
                    }
                  }
                  L14: {
                    if (param3 <= 39) {
                      break L14;
                    } else {
                      if (param3 >= kd.field_r.field_x + 39) {
                        break L14;
                      } else {
                        if (315 >= param2) {
                          break L14;
                        } else {
                          if (param2 >= 315 + kd.field_r.field_A) {
                            break L14;
                          } else {
                            ((mc) this).field_a = -2;
                            var9 = 1;
                            break L14;
                          }
                        }
                      }
                    }
                  }
                  if (20 >= ((mc) this).field_a) {
                    if (var9 == 0) {
                      break L5;
                    } else {
                      if (param0 == 1) {
                        var10 = 1;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  } else {
                    ((mc) this).field_a = 20;
                    break L5;
                  }
                }
              } else {
                break L5;
              }
            }
          }
          var12 = 0;
          L15: while (true) {
            if (21 < var12) {
              var12 = 0;
              L16: while (true) {
                if (!mm.b((byte) 108)) {
                  L17: {
                    L18: {
                      if (var12 != 0) {
                        break L18;
                      } else {
                        if (var11 == 0) {
                          break L18;
                        } else {
                          stackOut_175_0 = 1;
                          stackIn_177_0 = stackOut_175_0;
                          break L17;
                        }
                      }
                    }
                    stackOut_176_0 = 0;
                    stackIn_177_0 = stackOut_176_0;
                    break L17;
                  }
                  L19: {
                    var11 = stackIn_177_0;
                    if (var10 == 0) {
                      break L19;
                    } else {
                      if (((mc) this).field_a != -1) {
                        this.a(param0, (byte) 18, ((mc) this).field_a);
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                  }
                  if (param1 == -5) {
                    L20: {
                      ((mc) this).field_v = ((mc) this).field_v + 32;
                      if (((mc) this).field_v <= 0) {
                        break L20;
                      } else {
                        ((mc) this).field_v = 0;
                        break L20;
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                } else {
                  L21: {
                    if (13 == lj.field_t) {
                      var10 = 1;
                      ((mc) this).field_a = -3;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  L22: {
                    if (lj.field_t != 96) {
                      break L22;
                    } else {
                      var12 = 1;
                      if (((mc) this).field_a <= 0) {
                        if (((mc) this).field_a < -2) {
                          if (((mc) this).field_a == -3) {
                            ((mc) this).field_a = -5;
                            break L22;
                          } else {
                            ((mc) this).field_a = ((mc) this).field_a + 1;
                            break L22;
                          }
                        } else {
                          break L22;
                        }
                      } else {
                        ((mc) this).field_a = ((mc) this).field_a - 1;
                        break L22;
                      }
                    }
                  }
                  L23: {
                    if (97 != lj.field_t) {
                      break L23;
                    } else {
                      L24: {
                        var12 = 1;
                        if (~((mc) this).field_a <= ~(-1 + nb.field_g[ah.field_f].length)) {
                          break L24;
                        } else {
                          if (-2 < ((mc) this).field_a) {
                            ((mc) this).field_a = ((mc) this).field_a + 1;
                            break L23;
                          } else {
                            break L24;
                          }
                        }
                      }
                      if (((mc) this).field_a >= -2) {
                        break L23;
                      } else {
                        if (-5 == ((mc) this).field_a) {
                          ((mc) this).field_a = -3;
                          break L23;
                        } else {
                          ((mc) this).field_a = ((mc) this).field_a - 1;
                          break L23;
                        }
                      }
                    }
                  }
                  L25: {
                    if (99 == lj.field_t) {
                      L26: {
                        L27: {
                          if (((mc) this).field_a < 0) {
                            break L27;
                          } else {
                            if (5 >= -((mc) this).field_a + nb.field_g[ah.field_f].length) {
                              break L27;
                            } else {
                              ((mc) this).field_a = ((mc) this).field_a + 5;
                              if (((mc) this).field_a >= nb.field_g[ah.field_f].length - 1) {
                                ((mc) this).field_a = nb.field_g[ah.field_f].length + -1;
                                break L26;
                              } else {
                                break L26;
                              }
                            }
                          }
                        }
                        L28: {
                          if (((mc) this).field_a < 0) {
                            break L28;
                          } else {
                            if (-((mc) this).field_a + nb.field_g[ah.field_f].length > 5) {
                              break L28;
                            } else {
                              ((mc) this).field_l = ((mc) this).field_a;
                              ((mc) this).field_a = -2;
                              break L26;
                            }
                          }
                        }
                        if (0 <= ((mc) this).field_a) {
                          break L26;
                        } else {
                          if (((mc) this).field_a != -5) {
                            ((mc) this).field_a = ((mc) this).field_a - 1;
                            break L26;
                          } else {
                            break L26;
                          }
                        }
                      }
                      var12 = 1;
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  L29: {
                    if (lj.field_t == 98) {
                      L30: {
                        if (((mc) this).field_a < 5) {
                          if (((mc) this).field_a >= 0) {
                            break L30;
                          } else {
                            if (((mc) this).field_a == -2) {
                              if (((mc) this).field_l >= 0) {
                                ((mc) this).field_a = ((mc) this).field_l;
                                break L30;
                              } else {
                                ((mc) this).field_a = 10;
                                break L30;
                              }
                            } else {
                              ((mc) this).field_a = ((mc) this).field_a + 1;
                              break L30;
                            }
                          }
                        } else {
                          ((mc) this).field_a = ((mc) this).field_a - 5;
                          break L30;
                        }
                      }
                      var12 = 1;
                      break L29;
                    } else {
                      break L29;
                    }
                  }
                  L31: {
                    if (lj.field_t == 80) {
                      L32: {
                        var12 = 1;
                        if (((mc) this).field_a < 0) {
                          break L32;
                        } else {
                          if (14 > ((mc) this).field_a) {
                            ((mc) this).field_a = -5;
                            break L31;
                          } else {
                            break L32;
                          }
                        }
                      }
                      ((mc) this).field_a = 0;
                      break L31;
                    } else {
                      break L31;
                    }
                  }
                  L33: {
                    if (lj.field_t == 84) {
                      break L33;
                    } else {
                      if (lj.field_t == 83) {
                        break L33;
                      } else {
                        continue L16;
                      }
                    }
                  }
                  var10 = 1;
                  var12 = 1;
                  continue L16;
                }
              }
            } else {
              L34: {
                if (0 != ((mc) this).field_j[var12]) {
                  if (((mc) this).field_j[var12] != 2) {
                    ((mc) this).field_p[var12] = ((mc) this).field_p[var12] + 8;
                    if (0 > ((mc) this).field_p[var12]) {
                      break L34;
                    } else {
                      ((mc) this).field_j[var12] = 0;
                      break L34;
                    }
                  } else {
                    ((mc) this).field_p[var12] = ((mc) this).field_p[var12] - 8;
                    if (var12 == 21) {
                      if (((mc) this).field_p[var12] <= -kd.field_r.field_x) {
                        L35: {
                          ((mc) this).field_j[var12] = 1;
                          stackOut_107_0 = ((mc) this).field_i;
                          stackOut_107_1 = var12;
                          stackIn_109_0 = stackOut_107_0;
                          stackIn_109_1 = stackOut_107_1;
                          stackIn_108_0 = stackOut_107_0;
                          stackIn_108_1 = stackOut_107_1;
                          if (((mc) this).field_i[var12]) {
                            stackOut_109_0 = (boolean[]) (Object) stackIn_109_0;
                            stackOut_109_1 = stackIn_109_1;
                            stackOut_109_2 = 0;
                            stackIn_110_0 = stackOut_109_0;
                            stackIn_110_1 = stackOut_109_1;
                            stackIn_110_2 = stackOut_109_2;
                            break L35;
                          } else {
                            stackOut_108_0 = (boolean[]) (Object) stackIn_108_0;
                            stackOut_108_1 = stackIn_108_1;
                            stackOut_108_2 = 1;
                            stackIn_110_0 = stackOut_108_0;
                            stackIn_110_1 = stackOut_108_1;
                            stackIn_110_2 = stackOut_108_2;
                            break L35;
                          }
                        }
                        stackIn_110_0[stackIn_110_1] = stackIn_110_2 != 0;
                        break L34;
                      } else {
                        break L34;
                      }
                    } else {
                      if (-((mc) this).field_d >= ((mc) this).field_p[var12]) {
                        L36: {
                          ((mc) this).field_j[var12] = 1;
                          stackOut_101_0 = ((mc) this).field_i;
                          stackOut_101_1 = var12;
                          stackIn_103_0 = stackOut_101_0;
                          stackIn_103_1 = stackOut_101_1;
                          stackIn_102_0 = stackOut_101_0;
                          stackIn_102_1 = stackOut_101_1;
                          if (((mc) this).field_i[var12]) {
                            stackOut_103_0 = (boolean[]) (Object) stackIn_103_0;
                            stackOut_103_1 = stackIn_103_1;
                            stackOut_103_2 = 0;
                            stackIn_104_0 = stackOut_103_0;
                            stackIn_104_1 = stackOut_103_1;
                            stackIn_104_2 = stackOut_103_2;
                            break L36;
                          } else {
                            stackOut_102_0 = (boolean[]) (Object) stackIn_102_0;
                            stackOut_102_1 = stackIn_102_1;
                            stackOut_102_2 = 1;
                            stackIn_104_0 = stackOut_102_0;
                            stackIn_104_1 = stackOut_102_1;
                            stackIn_104_2 = stackOut_102_2;
                            break L36;
                          }
                        }
                        stackIn_104_0[stackIn_104_1] = stackIn_104_2 != 0;
                        break L34;
                      } else {
                        break L34;
                      }
                    }
                  }
                } else {
                  L37: {
                    if (var12 >= 21) {
                      break L37;
                    } else {
                      L38: {
                        stackOut_65_0 = ((mc) this).field_i[var12];
                        stackIn_67_0 = stackOut_65_0;
                        stackIn_66_0 = stackOut_65_0;
                        if (qe.field_b[var12]) {
                          stackOut_67_0 = stackIn_67_0;
                          stackOut_67_1 = 0;
                          stackIn_68_0 = stackOut_67_0;
                          stackIn_68_1 = stackOut_67_1;
                          break L38;
                        } else {
                          stackOut_66_0 = stackIn_66_0;
                          stackOut_66_1 = 1;
                          stackIn_68_0 = stackOut_66_0;
                          stackIn_68_1 = stackOut_66_1;
                          break L38;
                        }
                      }
                      if ((stackIn_68_0 ? 1 : 0) != stackIn_68_1) {
                        break L37;
                      } else {
                        ((mc) this).field_j[var12] = 2;
                        break L37;
                      }
                    }
                  }
                  L39: {
                    if (ah.field_f != 0) {
                      break L39;
                    } else {
                      L40: {
                        L41: {
                          if (!qe.field_b[2]) {
                            break L41;
                          } else {
                            if (!qe.field_b[0]) {
                              break L41;
                            } else {
                              if (!qe.field_b[3]) {
                                break L41;
                              } else {
                                if (!qe.field_b[7]) {
                                  break L41;
                                } else {
                                  if (qe.field_b[6]) {
                                    stackOut_78_0 = 0;
                                    stackIn_79_0 = stackOut_78_0;
                                    break L40;
                                  } else {
                                    break L41;
                                  }
                                }
                              }
                            }
                          }
                        }
                        stackOut_77_0 = 1;
                        stackIn_79_0 = stackOut_77_0;
                        break L40;
                      }
                      L42: {
                        stackOut_79_0 = stackIn_79_0;
                        stackIn_81_0 = stackOut_79_0;
                        stackIn_80_0 = stackOut_79_0;
                        if (((mc) this).field_i[21]) {
                          stackOut_81_0 = stackIn_81_0;
                          stackOut_81_1 = 0;
                          stackIn_82_0 = stackOut_81_0;
                          stackIn_82_1 = stackOut_81_1;
                          break L42;
                        } else {
                          stackOut_80_0 = stackIn_80_0;
                          stackOut_80_1 = 1;
                          stackIn_82_0 = stackOut_80_0;
                          stackIn_82_1 = stackOut_80_1;
                          break L42;
                        }
                      }
                      if (stackIn_82_0 != stackIn_82_1) {
                        ((mc) this).field_j[21] = 2;
                        break L39;
                      } else {
                        break L39;
                      }
                    }
                  }
                  if (ah.field_f != 1) {
                    break L34;
                  } else {
                    L43: {
                      L44: {
                        if (!qe.field_b[2]) {
                          break L44;
                        } else {
                          if (!qe.field_b[0]) {
                            break L44;
                          } else {
                            if (!qe.field_b[3]) {
                              break L44;
                            } else {
                              if (!qe.field_b[7]) {
                                break L44;
                              } else {
                                if (!qe.field_b[6]) {
                                  break L44;
                                } else {
                                  if (qe.field_b[16]) {
                                    stackOut_94_0 = 0;
                                    stackIn_95_0 = stackOut_94_0;
                                    break L43;
                                  } else {
                                    break L44;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_93_0 = 1;
                      stackIn_95_0 = stackOut_93_0;
                      break L43;
                    }
                    if (stackIn_95_0 != (((mc) this).field_i[21] ? 1 : 0)) {
                      break L34;
                    } else {
                      ((mc) this).field_j[21] = 2;
                      break L34;
                    }
                  }
                }
              }
              var12++;
              continue L15;
            }
          }
        }
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String var8 = null;
        int var9_int = 0;
        vm var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        Object var13 = null;
        String var13_ref = null;
        vm var14 = null;
        ea var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        ea var22 = null;
        int stackIn_10_0 = 0;
        int stackIn_48_0 = 0;
        vm stackIn_60_0 = null;
        String stackIn_60_1 = null;
        int stackIn_60_2 = 0;
        int stackIn_60_3 = 0;
        vm stackIn_61_0 = null;
        String stackIn_61_1 = null;
        int stackIn_61_2 = 0;
        int stackIn_61_3 = 0;
        vm stackIn_62_0 = null;
        String stackIn_62_1 = null;
        int stackIn_62_2 = 0;
        int stackIn_62_3 = 0;
        int stackIn_62_4 = 0;
        ea stackIn_63_0 = null;
        ea stackIn_64_0 = null;
        ea stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        Object stackIn_69_0 = null;
        Object stackIn_70_0 = null;
        Object stackIn_71_0 = null;
        Object stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        Object stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        int stackIn_73_2 = 0;
        String stackIn_73_3 = null;
        int stackIn_73_4 = 0;
        Object stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        int stackIn_74_2 = 0;
        String stackIn_74_3 = null;
        int stackIn_74_4 = 0;
        Object stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        int stackIn_75_2 = 0;
        String stackIn_75_3 = null;
        int stackIn_75_4 = 0;
        int stackIn_75_5 = 0;
        Object stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        int stackIn_76_2 = 0;
        String stackIn_76_3 = null;
        int stackIn_76_4 = 0;
        int stackIn_76_5 = 0;
        Object stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        int stackIn_77_2 = 0;
        String stackIn_77_3 = null;
        int stackIn_77_4 = 0;
        int stackIn_77_5 = 0;
        Object stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        int stackIn_78_2 = 0;
        String stackIn_78_3 = null;
        int stackIn_78_4 = 0;
        int stackIn_78_5 = 0;
        int stackIn_78_6 = 0;
        Object stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        Object stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        Object stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        int stackIn_81_2 = 0;
        Object stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        int stackIn_82_2 = 0;
        StringBuilder stackIn_82_3 = null;
        Object stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        int stackIn_83_2 = 0;
        StringBuilder stackIn_83_3 = null;
        Object stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        int stackIn_84_2 = 0;
        StringBuilder stackIn_84_3 = null;
        String stackIn_84_4 = null;
        Object stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        Object stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        Object stackIn_87_0 = null;
        int stackIn_87_1 = 0;
        int stackIn_87_2 = 0;
        vm stackIn_145_0 = null;
        String stackIn_145_1 = null;
        int stackIn_145_2 = 0;
        int stackIn_145_3 = 0;
        int stackIn_145_4 = 0;
        vm stackIn_146_0 = null;
        String stackIn_146_1 = null;
        int stackIn_146_2 = 0;
        int stackIn_146_3 = 0;
        int stackIn_146_4 = 0;
        vm stackIn_147_0 = null;
        String stackIn_147_1 = null;
        int stackIn_147_2 = 0;
        int stackIn_147_3 = 0;
        int stackIn_147_4 = 0;
        int stackIn_147_5 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_47_0 = 0;
        vm stackOut_59_0 = null;
        String stackOut_59_1 = null;
        int stackOut_59_2 = 0;
        int stackOut_59_3 = 0;
        vm stackOut_61_0 = null;
        String stackOut_61_1 = null;
        int stackOut_61_2 = 0;
        int stackOut_61_3 = 0;
        int stackOut_61_4 = 0;
        vm stackOut_60_0 = null;
        String stackOut_60_1 = null;
        int stackOut_60_2 = 0;
        int stackOut_60_3 = 0;
        int stackOut_60_4 = 0;
        ea stackOut_62_0 = null;
        ea stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        ea stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        Object stackOut_68_0 = null;
        Object stackOut_69_0 = null;
        Object stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        Object stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        Object stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        int stackOut_72_2 = 0;
        String stackOut_72_3 = null;
        int stackOut_72_4 = 0;
        Object stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        int stackOut_74_2 = 0;
        String stackOut_74_3 = null;
        int stackOut_74_4 = 0;
        int stackOut_74_5 = 0;
        Object stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        int stackOut_73_2 = 0;
        String stackOut_73_3 = null;
        int stackOut_73_4 = 0;
        int stackOut_73_5 = 0;
        Object stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        int stackOut_75_2 = 0;
        String stackOut_75_3 = null;
        int stackOut_75_4 = 0;
        int stackOut_75_5 = 0;
        Object stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        int stackOut_77_2 = 0;
        String stackOut_77_3 = null;
        int stackOut_77_4 = 0;
        int stackOut_77_5 = 0;
        int stackOut_77_6 = 0;
        Object stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        int stackOut_76_2 = 0;
        String stackOut_76_3 = null;
        int stackOut_76_4 = 0;
        int stackOut_76_5 = 0;
        int stackOut_76_6 = 0;
        Object stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        Object stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        int stackOut_80_2 = 0;
        Object stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        int stackOut_79_2 = 0;
        Object stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        int stackOut_81_2 = 0;
        StringBuilder stackOut_81_3 = null;
        Object stackOut_83_0 = null;
        int stackOut_83_1 = 0;
        int stackOut_83_2 = 0;
        StringBuilder stackOut_83_3 = null;
        String stackOut_83_4 = null;
        Object stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        int stackOut_82_2 = 0;
        StringBuilder stackOut_82_3 = null;
        String stackOut_82_4 = null;
        Object stackOut_84_0 = null;
        int stackOut_84_1 = 0;
        Object stackOut_86_0 = null;
        int stackOut_86_1 = 0;
        int stackOut_86_2 = 0;
        Object stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        int stackOut_85_2 = 0;
        vm stackOut_144_0 = null;
        String stackOut_144_1 = null;
        int stackOut_144_2 = 0;
        int stackOut_144_3 = 0;
        int stackOut_144_4 = 0;
        vm stackOut_146_0 = null;
        String stackOut_146_1 = null;
        int stackOut_146_2 = 0;
        int stackOut_146_3 = 0;
        int stackOut_146_4 = 0;
        int stackOut_146_5 = 0;
        vm stackOut_145_0 = null;
        String stackOut_145_1 = null;
        int stackOut_145_2 = 0;
        int stackOut_145_3 = 0;
        int stackOut_145_4 = 0;
        int stackOut_145_5 = 0;
        L0: {
          var20 = MinerDisturbance.field_ab;
          if (((mc) this).field_v != 0) {
            vh.field_a[ah.field_f].c(((mc) this).field_v, 0, 100);
            break L0;
          } else {
            if (((mc) this).field_c <= 40) {
              vh.field_a[ah.field_f].c(((mc) this).field_v, 0, 178 - -(int)(60.0 * Math.sin((double)(((mc) this).field_c * 2)) + 18.0 * Math.cos((double)(3 * ((mc) this).field_c))));
              break L0;
            } else {
              vh.field_a[ah.field_f].g(((mc) this).field_v, 0);
              break L0;
            }
          }
        }
        L1: {
          qc.field_d.f(-(qc.field_d.field_x >> 1) + 320, ((mc) this).field_v);
          if (((mc) this).field_v >= 0) {
            L2: {
              if (((mc) this).field_c > 40) {
                stackOut_9_0 = 30;
                stackIn_10_0 = stackOut_9_0;
                break L2;
              } else {
                stackOut_8_0 = (int)(Math.sin((double)(((mc) this).field_c * 6)) * 20.0 + Math.cos((double)(((mc) this).field_c * 12)) * 14.0) + 35;
                stackIn_10_0 = stackOut_8_0;
                break L2;
              }
            }
            var2 = stackIn_10_0;
            var3 = 345 + -(qc.field_d.field_x >> 1);
            var4 = 320 - -(qc.field_d.field_x >> 1) - 25;
            L3: while (true) {
              if (var3 >= var4) {
                eh.a(var4 << 4, 42 + ((mc) this).field_v << 4, 800, var2, s.field_I);
                break L1;
              } else {
                eh.a(var3 << 4, ((mc) this).field_v + 42 << 4, 800, var2, s.field_I);
                var3 += 50;
                continue L3;
              }
            }
          } else {
            break L1;
          }
        }
        L4: {
          var2 = wc.field_c[ah.field_f][0].field_A;
          var3 = wc.field_c[ah.field_f][0].field_x;
          var4 = 5;
          var5 = 0;
          var6 = 3;
          if (ah.field_f != 1) {
            break L4;
          } else {
            var6 = 4;
            break L4;
          }
        }
        var7 = 0;
        L5: while (true) {
          L6: {
            if (var6 <= var7) {
              break L6;
            } else {
              var8_int = 0;
              L7: while (true) {
                if (var4 <= var8_int) {
                  var7++;
                  continue L5;
                } else {
                  if (21 <= var5) {
                    break L6;
                  } else {
                    L8: {
                      var9_int = 40 + ((16 + var3) * var8_int - -((mc) this).field_v);
                      var10 = var7 * (var2 - -4) - -80;
                      if (~((mc) this).field_a != ~var5) {
                        break L8;
                      } else {
                        var11 = -var3 + pk.field_d.field_x >> 1;
                        var12 = -var2 + pk.field_d.field_A >> 1;
                        pk.field_d.f(var9_int + -var11, var10 + -var12);
                        break L8;
                      }
                    }
                    var5++;
                    var8_int++;
                    continue L7;
                  }
                }
              }
            }
          }
          var21 = 0;
          var5 = var21;
          var7 = 0;
          L9: while (true) {
            L10: {
              if (var7 >= var6) {
                break L10;
              } else {
                var8_int = 0;
                L11: while (true) {
                  if (~var8_int <= ~var4) {
                    var7++;
                    continue L9;
                  } else {
                    if (var21 >= 21) {
                      break L10;
                    } else {
                      L12: {
                        L13: {
                          var9_int = nb.field_g[ah.field_f][var21];
                          var10 = ((mc) this).field_g[var9_int];
                          var11 = ((mc) this).field_p[var9_int];
                          var12 = var11 + var3;
                          var13_int = ((mc) this).field_i[var9_int] ? 1 : 0;
                          var22 = wc.field_c[ah.field_f][var9_int];
                          var15 = te.field_e[ah.field_f][var9_int];
                          var16 = ((mc) this).field_v + (var8_int * (16 + var3) + 40);
                          var17 = 80 + var7 * (var2 + 4);
                          var18 = -(var11 >> 1) + var16;
                          if (~((mc) this).field_f <= ~var10) {
                            break L13;
                          } else {
                            if (var13_int != 0) {
                              break L13;
                            } else {
                              L14: {
                                if (var9_int != 1) {
                                  break L14;
                                } else {
                                  if (!qe.field_b[0]) {
                                    break L14;
                                  } else {
                                    if (~((mc) this).field_f <= ~((mc) this).field_g[0]) {
                                      break L13;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                              }
                              L15: {
                                if (var9_int != 0) {
                                  break L15;
                                } else {
                                  if (qe.field_b[1]) {
                                    break L13;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                              L16: {
                                if (var9_int != 19) {
                                  break L16;
                                } else {
                                  if (!qe.field_b[2]) {
                                    break L16;
                                  } else {
                                    if (~((mc) this).field_f <= ~((mc) this).field_g[2]) {
                                      break L13;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                              }
                              L17: {
                                if (var9_int != 2) {
                                  break L17;
                                } else {
                                  if (qe.field_b[19]) {
                                    break L13;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                              stackOut_46_0 = 1;
                              stackIn_48_0 = stackOut_46_0;
                              break L12;
                            }
                          }
                        }
                        stackOut_47_0 = 0;
                        stackIn_48_0 = stackOut_47_0;
                        break L12;
                      }
                      L18: {
                        var19 = stackIn_48_0;
                        if (var19 != 0) {
                          var22.d(var18, var17, var12, var2, 100);
                          break L18;
                        } else {
                          if (var13_int != 0) {
                            var15.c(var18, var17, var12, var2);
                            if (var21 == ((mc) this).field_a) {
                              var15.e(var18, var17, var12, var2, ((mc) this).field_k);
                              break L18;
                            } else {
                              break L18;
                            }
                          } else {
                            var22.c(var18, var17, var12, var2);
                            if (~var21 == ~((mc) this).field_a) {
                              var22.e(var18, var17, var12, var2, ((mc) this).field_k);
                              break L18;
                            } else {
                              break L18;
                            }
                          }
                        }
                      }
                      L19: {
                        var21++;
                        if (var13_int == 0) {
                          L20: {
                            ((mc) this).field_h.g();
                            eh.d();
                            stackOut_59_0 = ce.field_d;
                            stackOut_59_1 = Integer.toString(var10 * 100);
                            stackOut_59_2 = 10;
                            stackOut_59_3 = 17;
                            stackIn_61_0 = stackOut_59_0;
                            stackIn_61_1 = stackOut_59_1;
                            stackIn_61_2 = stackOut_59_2;
                            stackIn_61_3 = stackOut_59_3;
                            stackIn_60_0 = stackOut_59_0;
                            stackIn_60_1 = stackOut_59_1;
                            stackIn_60_2 = stackOut_59_2;
                            stackIn_60_3 = stackOut_59_3;
                            if (var19 != 0) {
                              stackOut_61_0 = (vm) (Object) stackIn_61_0;
                              stackOut_61_1 = (String) (Object) stackIn_61_1;
                              stackOut_61_2 = stackIn_61_2;
                              stackOut_61_3 = stackIn_61_3;
                              stackOut_61_4 = 3355443;
                              stackIn_62_0 = stackOut_61_0;
                              stackIn_62_1 = stackOut_61_1;
                              stackIn_62_2 = stackOut_61_2;
                              stackIn_62_3 = stackOut_61_3;
                              stackIn_62_4 = stackOut_61_4;
                              break L20;
                            } else {
                              stackOut_60_0 = (vm) (Object) stackIn_60_0;
                              stackOut_60_1 = (String) (Object) stackIn_60_1;
                              stackOut_60_2 = stackIn_60_2;
                              stackOut_60_3 = stackIn_60_3;
                              stackOut_60_4 = 5710861;
                              stackIn_62_0 = stackOut_60_0;
                              stackIn_62_1 = stackOut_60_1;
                              stackIn_62_2 = stackOut_60_2;
                              stackIn_62_3 = stackOut_60_3;
                              stackIn_62_4 = stackOut_60_4;
                              break L20;
                            }
                          }
                          L21: {
                            ((vm) (Object) stackIn_62_0).a(stackIn_62_1, stackIn_62_2, stackIn_62_3, stackIn_62_4, -1);
                            stackOut_62_0 = ((mc) this).field_h;
                            stackIn_64_0 = stackOut_62_0;
                            stackIn_63_0 = stackOut_62_0;
                            if (var19 != 0) {
                              stackOut_64_0 = (ea) (Object) stackIn_64_0;
                              stackOut_64_1 = 6776679;
                              stackIn_65_0 = stackOut_64_0;
                              stackIn_65_1 = stackOut_64_1;
                              break L21;
                            } else {
                              stackOut_63_0 = (ea) (Object) stackIn_63_0;
                              stackOut_63_1 = 16777215;
                              stackIn_65_0 = stackOut_63_0;
                              stackIn_65_1 = stackOut_63_1;
                              break L21;
                            }
                          }
                          ((ea) (Object) stackIn_65_0).f(stackIn_65_1);
                          bj.field_e.a((byte) -45);
                          ((mc) this).field_h.c(var18, var17, var12, var2);
                          break L19;
                        } else {
                          gb.field_a.c(var18, var17, var12, var2);
                          break L19;
                        }
                      }
                      var8_int++;
                      continue L11;
                    }
                  }
                }
              }
            }
            L22: {
              L23: {
                eh.b(((mc) this).field_v, 440, 640, 40, 4539717, 160);
                eh.a(((mc) this).field_v, 441, 640, 41, 10066329);
                stackOut_68_0 = this;
                stackIn_71_0 = stackOut_68_0;
                stackIn_69_0 = stackOut_68_0;
                if (((mc) this).field_f != 0) {
                  break L23;
                } else {
                  stackOut_69_0 = this;
                  stackIn_71_0 = stackOut_69_0;
                  stackIn_70_0 = stackOut_69_0;
                  if (((mc) this).field_c % 10 >= 5) {
                    break L23;
                  } else {
                    stackOut_70_0 = this;
                    stackOut_70_1 = 1;
                    stackIn_72_0 = stackOut_70_0;
                    stackIn_72_1 = stackOut_70_1;
                    break L22;
                  }
                }
              }
              stackOut_71_0 = this;
              stackOut_71_1 = 0;
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              break L22;
            }
            L24: {
              stackOut_72_0 = this;
              stackOut_72_1 = stackIn_72_1;
              stackOut_72_2 = -123;
              stackOut_72_3 = sd.field_e;
              stackOut_72_4 = 450;
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              stackIn_74_3 = stackOut_72_3;
              stackIn_74_4 = stackOut_72_4;
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              stackIn_73_3 = stackOut_72_3;
              stackIn_73_4 = stackOut_72_4;
              if (((mc) this).field_a != -5) {
                stackOut_74_0 = this;
                stackOut_74_1 = stackIn_74_1;
                stackOut_74_2 = stackIn_74_2;
                stackOut_74_3 = (String) (Object) stackIn_74_3;
                stackOut_74_4 = stackIn_74_4;
                stackOut_74_5 = 0;
                stackIn_75_0 = stackOut_74_0;
                stackIn_75_1 = stackOut_74_1;
                stackIn_75_2 = stackOut_74_2;
                stackIn_75_3 = stackOut_74_3;
                stackIn_75_4 = stackOut_74_4;
                stackIn_75_5 = stackOut_74_5;
                break L24;
              } else {
                stackOut_73_0 = this;
                stackOut_73_1 = stackIn_73_1;
                stackOut_73_2 = stackIn_73_2;
                stackOut_73_3 = (String) (Object) stackIn_73_3;
                stackOut_73_4 = stackIn_73_4;
                stackOut_73_5 = 1;
                stackIn_75_0 = stackOut_73_0;
                stackIn_75_1 = stackOut_73_1;
                stackIn_75_2 = stackOut_73_2;
                stackIn_75_3 = stackOut_73_3;
                stackIn_75_4 = stackOut_73_4;
                stackIn_75_5 = stackOut_73_5;
                break L24;
              }
            }
            L25: {
              stackOut_75_0 = this;
              stackOut_75_1 = stackIn_75_1;
              stackOut_75_2 = stackIn_75_2;
              stackOut_75_3 = (String) (Object) stackIn_75_3;
              stackOut_75_4 = stackIn_75_4;
              stackOut_75_5 = stackIn_75_5;
              stackIn_77_0 = stackOut_75_0;
              stackIn_77_1 = stackOut_75_1;
              stackIn_77_2 = stackOut_75_2;
              stackIn_77_3 = stackOut_75_3;
              stackIn_77_4 = stackOut_75_4;
              stackIn_77_5 = stackOut_75_5;
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              stackIn_76_3 = stackOut_75_3;
              stackIn_76_4 = stackOut_75_4;
              stackIn_76_5 = stackOut_75_5;
              if (((mc) this).field_f == 0) {
                stackOut_77_0 = this;
                stackOut_77_1 = stackIn_77_1;
                stackOut_77_2 = stackIn_77_2;
                stackOut_77_3 = (String) (Object) stackIn_77_3;
                stackOut_77_4 = stackIn_77_4;
                stackOut_77_5 = stackIn_77_5;
                stackOut_77_6 = 0;
                stackIn_78_0 = stackOut_77_0;
                stackIn_78_1 = stackOut_77_1;
                stackIn_78_2 = stackOut_77_2;
                stackIn_78_3 = stackOut_77_3;
                stackIn_78_4 = stackOut_77_4;
                stackIn_78_5 = stackOut_77_5;
                stackIn_78_6 = stackOut_77_6;
                break L25;
              } else {
                stackOut_76_0 = this;
                stackOut_76_1 = stackIn_76_1;
                stackOut_76_2 = stackIn_76_2;
                stackOut_76_3 = (String) (Object) stackIn_76_3;
                stackOut_76_4 = stackIn_76_4;
                stackOut_76_5 = stackIn_76_5;
                stackOut_76_6 = 1;
                stackIn_78_0 = stackOut_76_0;
                stackIn_78_1 = stackOut_76_1;
                stackIn_78_2 = stackOut_76_2;
                stackIn_78_3 = stackOut_76_3;
                stackIn_78_4 = stackOut_76_4;
                stackIn_78_5 = stackOut_76_5;
                stackIn_78_6 = stackOut_76_6;
                break L25;
              }
            }
            L26: {
              this.a(stackIn_78_1 != 0, (byte) stackIn_78_2, stackIn_78_3, stackIn_78_4, stackIn_78_5 != 0, stackIn_78_6 != 0, false, 457);
              stackOut_78_0 = this;
              stackOut_78_1 = 450;
              stackIn_80_0 = stackOut_78_0;
              stackIn_80_1 = stackOut_78_1;
              stackIn_79_0 = stackOut_78_0;
              stackIn_79_1 = stackOut_78_1;
              if (((mc) this).field_a != -4) {
                stackOut_80_0 = this;
                stackOut_80_1 = stackIn_80_1;
                stackOut_80_2 = 0;
                stackIn_81_0 = stackOut_80_0;
                stackIn_81_1 = stackOut_80_1;
                stackIn_81_2 = stackOut_80_2;
                break L26;
              } else {
                stackOut_79_0 = this;
                stackOut_79_1 = stackIn_79_1;
                stackOut_79_2 = 1;
                stackIn_81_0 = stackOut_79_0;
                stackIn_81_1 = stackOut_79_1;
                stackIn_81_2 = stackOut_79_2;
                break L26;
              }
            }
            L27: {
              stackOut_81_0 = this;
              stackOut_81_1 = stackIn_81_1;
              stackOut_81_2 = stackIn_81_2;
              stackOut_81_3 = new StringBuilder().append(gd.field_t);
              stackIn_83_0 = stackOut_81_0;
              stackIn_83_1 = stackOut_81_1;
              stackIn_83_2 = stackOut_81_2;
              stackIn_83_3 = stackOut_81_3;
              stackIn_82_0 = stackOut_81_0;
              stackIn_82_1 = stackOut_81_1;
              stackIn_82_2 = stackOut_81_2;
              stackIn_82_3 = stackOut_81_3;
              if (!sc.field_b) {
                stackOut_83_0 = this;
                stackOut_83_1 = stackIn_83_1;
                stackOut_83_2 = stackIn_83_2;
                stackOut_83_3 = (StringBuilder) (Object) stackIn_83_3;
                stackOut_83_4 = ie.field_a;
                stackIn_84_0 = stackOut_83_0;
                stackIn_84_1 = stackOut_83_1;
                stackIn_84_2 = stackOut_83_2;
                stackIn_84_3 = stackOut_83_3;
                stackIn_84_4 = stackOut_83_4;
                break L27;
              } else {
                stackOut_82_0 = this;
                stackOut_82_1 = stackIn_82_1;
                stackOut_82_2 = stackIn_82_2;
                stackOut_82_3 = (StringBuilder) (Object) stackIn_82_3;
                stackOut_82_4 = gm.field_b;
                stackIn_84_0 = stackOut_82_0;
                stackIn_84_1 = stackOut_82_1;
                stackIn_84_2 = stackOut_82_2;
                stackIn_84_3 = stackOut_82_3;
                stackIn_84_4 = stackOut_82_4;
                break L27;
              }
            }
            L28: {
              this.a(stackIn_84_1, stackIn_84_2 != 0, stackIn_84_4, 315, (byte) -66, false);
              stackOut_84_0 = this;
              stackOut_84_1 = 450;
              stackIn_86_0 = stackOut_84_0;
              stackIn_86_1 = stackOut_84_1;
              stackIn_85_0 = stackOut_84_0;
              stackIn_85_1 = stackOut_84_1;
              if (-3 != ((mc) this).field_a) {
                stackOut_86_0 = this;
                stackOut_86_1 = stackIn_86_1;
                stackOut_86_2 = 0;
                stackIn_87_0 = stackOut_86_0;
                stackIn_87_1 = stackOut_86_1;
                stackIn_87_2 = stackOut_86_2;
                break L28;
              } else {
                stackOut_85_0 = this;
                stackOut_85_1 = stackIn_85_1;
                stackOut_85_2 = 1;
                stackIn_87_0 = stackOut_85_0;
                stackIn_87_1 = stackOut_85_1;
                stackIn_87_2 = stackOut_85_2;
                break L28;
              }
            }
            L29: {
              this.a(stackIn_87_1, stackIn_87_2 != 0, mn.field_v, 40, (byte) -66, false);
              if (0 != ((mc) this).field_f) {
                break L29;
              } else {
                a.field_a[((mc) this).field_b - -16].f(((mc) this).field_v + 590, -a.field_a[0].field_u + -a.field_a[0].field_C + 480);
                break L29;
              }
            }
            L30: {
              var7 = -((mc) this).field_v;
              var8 = ta.field_f;
              if (((mc) this).field_i[21]) {
                var8 = se.field_L;
                break L30;
              } else {
                break L30;
              }
            }
            L31: {
              var9 = mm.field_a;
              ((mc) this).field_r.g();
              kd.field_r.g(0, 0);
              var10 = 3 + (var9.field_E + var9.field_I);
              int discarded$11 = var9.a(var8, -2, 0, kd.field_r.field_x, kd.field_r.field_A, 2829610, -1, 1, 1, var10);
              int discarded$12 = var9.a(var8, 2, 0, kd.field_r.field_x, kd.field_r.field_A, 2829610, -1, 1, 1, var10);
              int discarded$13 = var9.a(var8, 0, -2, kd.field_r.field_x, kd.field_r.field_A, 2829610, -1, 1, 1, var10);
              int discarded$14 = var9.a(var8, 0, 2, kd.field_r.field_x, kd.field_r.field_A, 2829610, -1, 1, 1, var10);
              int discarded$15 = var9.a(var8, -1, -1, kd.field_r.field_x, kd.field_r.field_A, 2829610, -1, 1, 1, var10);
              int discarded$16 = var9.a(var8, 1, -1, kd.field_r.field_x, kd.field_r.field_A, 2829610, -1, 1, 1, var10);
              int discarded$17 = var9.a(var8, -1, 1, kd.field_r.field_x, kd.field_r.field_A, 2829610, -1, 1, 1, var10);
              int discarded$18 = var9.a(var8, 1, 1, kd.field_r.field_x, kd.field_r.field_A, 2829610, -1, 1, 1, var10);
              if (((mc) this).field_a == -2) {
                int discarded$19 = var9.a(var8, 0, 0, kd.field_r.field_x, kd.field_r.field_A, 15884837, -1, 1, 1, var10);
                break L31;
              } else {
                int discarded$20 = var9.a(var8, 0, 0, kd.field_r.field_x, kd.field_r.field_A, 16437248, -1, 1, 1, var10);
                break L31;
              }
            }
            L32: {
              var11 = -101 / ((-70 - param0) / 32);
              bj.field_e.a((byte) -45);
              ((mc) this).field_r.c(39 + (var7 + -(((mc) this).field_p[21] >> 1)), 315, kd.field_r.field_x - -((mc) this).field_p[21], kd.field_r.field_A);
              g.a(316, 113, var7 + 190, 414, (byte) 83, he.field_b);
              g.a(391, 38, var7 + 39, 142, (byte) 109, he.field_b);
              if (((mc) this).field_v == 0) {
                L33: {
                  var12 = -1;
                  if (((mc) this).field_a < 0) {
                    break L33;
                  } else {
                    if (nb.field_g[ah.field_f].length <= ((mc) this).field_a) {
                      break L33;
                    } else {
                      var12 = nb.field_g[ah.field_f][((mc) this).field_a];
                      break L33;
                    }
                  }
                }
                L34: {
                  var13 = null;
                  if (6 == var12) {
                    tn.field_K[6].g(487, 326);
                    var13_ref = vh.field_h[ah.field_f];
                    break L34;
                  } else {
                    if (var12 != 0) {
                      if (var12 == 2) {
                        tn.field_K[2].g(487, 326);
                        var13_ref = gl.field_x[ah.field_f];
                        break L34;
                      } else {
                        if (var12 != 3) {
                          if (var12 != 7) {
                            if (var12 != 9) {
                              if (var12 != 1) {
                                if (var12 == 11) {
                                  tn.field_K[11].g(487, 326);
                                  var13_ref = tc.field_p;
                                  break L34;
                                } else {
                                  if (8 != var12) {
                                    if (4 == var12) {
                                      tn.field_K[4].g(487, 326);
                                      var13_ref = cl.field_M;
                                      break L34;
                                    } else {
                                      if (10 != var12) {
                                        if (var12 == 5) {
                                          tn.field_K[5].g(487, 326);
                                          var13_ref = uf.field_u;
                                          break L34;
                                        } else {
                                          if (var12 != 12) {
                                            if (var12 != 13) {
                                              if (14 != var12) {
                                                if (var12 != 15) {
                                                  if (16 != var12) {
                                                    if (17 != var12) {
                                                      if (var12 != 18) {
                                                        if (var12 == 19) {
                                                          tn.field_K[18].g(487, 326);
                                                          var13_ref = ck.field_e;
                                                          break L34;
                                                        } else {
                                                          if (20 == var12) {
                                                            tn.field_K[19].g(487, 326);
                                                            var13_ref = fm.field_K;
                                                            break L34;
                                                          } else {
                                                            var13_ref = ne.field_R[ah.field_f];
                                                            break L34;
                                                          }
                                                        }
                                                      } else {
                                                        tn.field_K[17].g(487, 326);
                                                        var13_ref = lm.field_I;
                                                        break L34;
                                                      }
                                                    } else {
                                                      tn.field_K[16].g(487, 326);
                                                      var13_ref = nf.field_b;
                                                      break L34;
                                                    }
                                                  } else {
                                                    tn.field_K[15].g(487, 326);
                                                    var13_ref = ol.field_d;
                                                    break L34;
                                                  }
                                                } else {
                                                  tn.field_K[14].g(487, 326);
                                                  var13_ref = jn.field_p;
                                                  break L34;
                                                }
                                              } else {
                                                tn.field_K[13].g(487, 326);
                                                var13_ref = fd.field_kb[ah.field_f];
                                                break L34;
                                              }
                                            } else {
                                              tn.field_K[12].g(487, 326);
                                              var13_ref = qh.field_d;
                                              break L34;
                                            }
                                          } else {
                                            tn.field_K[12].g(487, 326);
                                            var13_ref = hh.field_c;
                                            break L34;
                                          }
                                        }
                                      } else {
                                        tn.field_K[10].g(487, 326);
                                        var13_ref = wc.field_d;
                                        break L34;
                                      }
                                    }
                                  } else {
                                    tn.field_K[8].g(487, 326);
                                    var13_ref = ef.field_d;
                                    break L34;
                                  }
                                }
                              } else {
                                tn.field_K[1].g(487, 326);
                                var13_ref = ig.field_d;
                                break L34;
                              }
                            } else {
                              tn.field_K[9].g(487, 326);
                              var13_ref = mn.field_w[ah.field_f];
                              break L34;
                            }
                          } else {
                            tn.field_K[7].g(487, 326);
                            var13_ref = ii.field_c;
                            break L34;
                          }
                        } else {
                          tn.field_K[3].g(487, 326);
                          var13_ref = ob.field_v;
                          break L34;
                        }
                      }
                    } else {
                      tn.field_K[0].g(487, 326);
                      var13_ref = hm.field_J[ah.field_f];
                      break L34;
                    }
                  }
                }
                L35: {
                  if (var13_ref == null) {
                    break L35;
                  } else {
                    L36: {
                      stackOut_144_0 = ce.field_d;
                      stackOut_144_1 = (String) var13_ref;
                      stackOut_144_2 = 205;
                      stackOut_144_3 = 327;
                      stackOut_144_4 = 384;
                      stackIn_146_0 = stackOut_144_0;
                      stackIn_146_1 = stackOut_144_1;
                      stackIn_146_2 = stackOut_144_2;
                      stackIn_146_3 = stackOut_144_3;
                      stackIn_146_4 = stackOut_144_4;
                      stackIn_145_0 = stackOut_144_0;
                      stackIn_145_1 = stackOut_144_1;
                      stackIn_145_2 = stackOut_144_2;
                      stackIn_145_3 = stackOut_144_3;
                      stackIn_145_4 = stackOut_144_4;
                      if (ne.field_R[ah.field_f] == var13_ref) {
                        stackOut_146_0 = (vm) (Object) stackIn_146_0;
                        stackOut_146_1 = (String) (Object) stackIn_146_1;
                        stackOut_146_2 = stackIn_146_2;
                        stackOut_146_3 = stackIn_146_3;
                        stackOut_146_4 = stackIn_146_4;
                        stackOut_146_5 = 0;
                        stackIn_147_0 = stackOut_146_0;
                        stackIn_147_1 = stackOut_146_1;
                        stackIn_147_2 = stackOut_146_2;
                        stackIn_147_3 = stackOut_146_3;
                        stackIn_147_4 = stackOut_146_4;
                        stackIn_147_5 = stackOut_146_5;
                        break L36;
                      } else {
                        stackOut_145_0 = (vm) (Object) stackIn_145_0;
                        stackOut_145_1 = (String) (Object) stackIn_145_1;
                        stackOut_145_2 = stackIn_145_2;
                        stackOut_145_3 = stackIn_145_3;
                        stackOut_145_4 = stackIn_145_4;
                        stackOut_145_5 = tn.field_K[13].field_x + 20;
                        stackIn_147_0 = stackOut_145_0;
                        stackIn_147_1 = stackOut_145_1;
                        stackIn_147_2 = stackOut_145_2;
                        stackIn_147_3 = stackOut_145_3;
                        stackIn_147_4 = stackOut_145_4;
                        stackIn_147_5 = stackOut_145_5;
                        break L36;
                      }
                    }
                    int discarded$21 = ((vm) (Object) stackIn_147_0).a(stackIn_147_1, stackIn_147_2, stackIn_147_3, stackIn_147_4 - stackIn_147_5, 90, 3550242, -1, 3, 0, 0);
                    break L35;
                  }
                }
                L37: {
                  var14 = mm.field_a;
                  if (var12 < 0) {
                    break L37;
                  } else {
                    var14.c(oa.a((byte) -77, af.field_r, new String[1]), 462, 418, 1, -1);
                    break L37;
                  }
                }
                L38: {
                  if (((mc) this).field_y <= 0) {
                    break L38;
                  } else {
                    if (((mc) this).field_y % 10 < 5) {
                      var14.a(oa.a((byte) -73, ne.field_M, new String[1]), 52 - -var7, 418, 16711680, -1);
                      break L32;
                    } else {
                      break L38;
                    }
                  }
                }
                var14.a(oa.a((byte) -126, ne.field_M, new String[1]), 52 - -var7, 418, 1, -1);
                break L32;
              } else {
                break L32;
              }
            }
            return;
          }
        }
    }

    private final void a(boolean param0, byte param1) {
        if (!param0) {
            ((mc) this).field_s = nk.field_w;
            ((mc) this).field_n = gb.field_e;
            ((mc) this).field_a = 0;
        } else {
            ((mc) this).field_s = -1;
            ((mc) this).field_n = -1;
        }
    }

    mc(MinerDisturbance param0, boolean param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var5 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        ((mc) this).field_p = new int[22];
        ((mc) this).field_i = new boolean[22];
        ((mc) this).field_j = new int[22];
        ((mc) this).field_a = 0;
        ((mc) this).field_g = new int[]{1, 2, 1, 1, 3, 2, 1, 1, 2, 1, 2, 1, 2, 3, 1, 2, 1, 3, 1, 2, 3};
        ((mc) this).field_v = -640;
        try {
          L0: {
            L1: {
              ((mc) this).field_q = param0;
              ((mc) this).field_f = 5;
              if (ah.field_f != 1) {
                break L1;
              } else {
                ((mc) this).field_f = 6;
                break L1;
              }
            }
            L2: {
              kj.a(1, -22156);
              if (ah.field_f == cm.field_o) {
                var5 = 0;
                var3_int = var5;
                L3: while (true) {
                  if (21 <= var5) {
                    break L2;
                  } else {
                    L4: {
                      qe.field_b[var5] = bn.field_b[var5];
                      if (!qe.field_b[var5]) {
                        break L4;
                      } else {
                        L5: {
                          ((mc) this).field_f = ((mc) this).field_f - ((mc) this).field_g[var5];
                          if (var5 != 12) {
                            break L5;
                          } else {
                            kj.a(2 * ne.a(false), -22156);
                            break L5;
                          }
                        }
                        if (13 != var5) {
                          break L4;
                        } else {
                          kj.a(ne.a(false) * 3, -22156);
                          break L4;
                        }
                      }
                    }
                    var5++;
                    continue L3;
                  }
                }
              } else {
                var3_int = 0;
                L6: while (true) {
                  if (var3_int >= 21) {
                    break L2;
                  } else {
                    qe.field_b[var3_int] = false;
                    var3_int++;
                    continue L6;
                  }
                }
              }
            }
            ((mc) this).field_d = wc.field_c[ah.field_f][0].field_x;
            ((mc) this).field_h = new ea(((mc) this).field_d, wc.field_c[ah.field_f][0].field_A);
            ((mc) this).field_l = -1;
            ((mc) this).field_y = 0;
            ((mc) this).field_r = new ea(kd.field_r.field_x, kd.field_r.field_A);
            this.a(param1, (byte) 27);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3;
            stackOut_17_1 = new StringBuilder().append("mc.<init>(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L7;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L7;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "Nothing To Say";
        field_x = "Please send me news and updates (I can unsubscribe at any time)";
        field_e = "Not yet achieved";
        field_t = new bd();
    }
}
