/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ka extends ma {
    static String field_M;
    private vj field_Q;
    static String field_O;
    static af field_P;
    static pl field_N;

    final bl g(byte param0) {
        rd var2;
        bl var3;
        int var4;
        var4 = client.field_A ? 1 : 0;
        var2 = new rd(this.field_Q);
        var3 = (bl) ((Object) var2.a((byte) 71));
        if (param0 > -73) {
          ka.h((byte) 44);
          L0: while (true) {
            if (var3 != null) {
              if (var3.field_S) {
                return var3;
              } else {
                var3 = (bl) ((Object) var2.a(-93));
                if (var4 == 0) {
                  continue L0;
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          }
        } else {
          L1: while (true) {
            if (var3 != null) {
              if (var3.field_S) {
                return var3;
              } else {
                var3 = (bl) ((Object) var2.a(-93));
                if (var4 == 0) {
                  continue L1;
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          }
        }
    }

    final void c(boolean param0) {
        rd var2 = null;
        bl var3 = null;
        int var4 = 0;
        rd var5 = null;
        rd var6 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = client.field_A ? 1 : 0;
                    if (param0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_O = (String) null;
                    statePc = 10;
                    continue stateLoop;
                }
                case 2: {
                    var5 = new rd(this.field_Q);
                    var2 = var5;
                    var3 = (bl) ((Object) var5.a((byte) 71));
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var3 != null) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    this.field_L = null;
                    return;
                }
                case 6: {
                    var3.field_S = false;
                    var3 = (bl) ((Object) var5.a(-48));
                    if (var4 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    return;
                }
                case 8: {
                    if (var4 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    this.field_L = null;
                    return;
                }
                case 10: {
                    var6 = new rd(this.field_Q);
                    var2 = var6;
                    var3 = (bl) ((Object) var6.a((byte) 71));
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (var3 != null) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    this.field_L = null;
                    return;
                }
                case 14: {
                    var3.field_S = false;
                    var3 = (bl) ((Object) var6.a(-48));
                    if (var4 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    return;
                }
                case 16: {
                    if (var4 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    this.field_L = null;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int a(byte param0, int param1, Random param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 <= 0) {
              throw new IllegalArgumentException();
            } else {
              if (!pe.a(922790152, param1)) {
                L1: {
                  if (param0 >= 42) {
                    break L1;
                  } else {
                    field_N = (pl) null;
                    break L1;
                  }
                }
                var3_int = -(int)(4294967296L % (long)param1) + -2147483648;
                L2: while (true) {
                  var4 = param2.nextInt();
                  if (var3_int > var4) {
                    stackIn_12_0 = oi.a(param1, 105, var4);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    continue L2;
                  }
                }
              } else {
                stackIn_5_0 = (int)(((long)param2.nextInt() & 4294967295L) * (long)param1 >> -627379424);
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("ka.S(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_12_0;
        }
    }

    public ka() {
        super(0, 0, cf.field_f, vd.field_n, (gl) null, (kg) null);
        this.field_Q = new vj();
    }

    final static void a(boolean param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0;
        int stackIn_9_1;
        int stackIn_9_2;
        int stackIn_9_3;
        int stackIn_9_4;
        int stackIn_9_5;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_11_3 = 0;
        int stackIn_11_4 = 0;
        int stackIn_11_5 = 0;
        int stackIn_11_6 = 0;
        int stackIn_13_7;
        boolean stackIn_13_8;
        int stackIn_13_9;
        int stackIn_13_10;
        int stackIn_14_7 = 0;
        boolean stackIn_14_8 = false;
        int stackIn_14_9 = 0;
        int stackIn_14_10 = 0;
        int stackIn_14_11 = 0;
        int stackIn_45_0 = 0;
        int stackIn_49_0;
        int stackIn_49_1;
        int stackIn_49_2;
        int stackIn_49_3;
        int stackIn_49_4;
        int stackIn_49_5;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
        int stackIn_51_3 = 0;
        int stackIn_51_4 = 0;
        int stackIn_51_5 = 0;
        int stackIn_51_6 = 0;
        int stackIn_53_7;
        boolean stackIn_53_8;
        int stackIn_53_9;
        int stackIn_53_10;
        int stackIn_54_7 = 0;
        boolean stackIn_54_8 = false;
        int stackIn_54_9 = 0;
        int stackIn_54_10 = 0;
        int stackIn_54_11 = 0;
        int stackIn_84_0 = 0;
        int stackIn_88_0;
        int stackIn_88_1;
        int stackIn_88_2;
        int stackIn_88_3;
        int stackIn_88_4;
        int stackIn_88_5;
        int stackIn_90_0 = 0;
        int stackIn_90_1 = 0;
        int stackIn_90_2 = 0;
        int stackIn_90_3 = 0;
        int stackIn_90_4 = 0;
        int stackIn_90_5 = 0;
        int stackIn_90_6 = 0;
        int stackIn_92_7;
        boolean stackIn_92_8;
        int stackIn_92_9;
        int stackIn_92_10;
        int stackIn_93_7 = 0;
        boolean stackIn_93_8 = false;
        int stackIn_93_9 = 0;
        int stackIn_93_10 = 0;
        int stackIn_93_11 = 0;
        int var2;
        int var3;
        L0: {
          sb.c((byte) 123);
          if (hh.field_a == tc.field_Tb) {
            break L0;
          } else {
            if (cd.field_m != null) {
              if (km.b(cd.field_m.field_rc, -8222)) {
                L1: {
                  var2 = 1;
                  if (hh.field_a == null) {
                    stackIn_84_0 = 0;
                    break L1;
                  } else {
                    stackIn_84_0 = 1;
                    break L1;
                  }
                }
                L2: {
                  L3: {
                    var3 = stackIn_84_0;
                    stackIn_88_0 = 0;

                    stackIn_88_1 = 1;

                    stackIn_88_2 = 14;

                    stackIn_88_3 = 11;

                    stackIn_88_4 = 13;

                    stackIn_88_5 = jk.field_c;

                    if (fm.field_b) {
                      break L3;
                    } else {

                      if (fa.field_n) {
                        break L3;
                      } else {












                        if (var3 == 0) {
                          stackIn_90_0 = stackIn_88_0;
                          stackIn_90_1 = stackIn_88_1;
                          stackIn_90_2 = stackIn_88_2;
                          stackIn_90_3 = stackIn_88_3;
                          stackIn_90_4 = stackIn_88_4;
                          stackIn_90_5 = stackIn_88_5;
                          stackIn_90_6 = 0;
                          break L2;
                        } else {






                          break L3;
                        }
                      }
                    }
                  }
                  stackIn_90_0 = stackIn_88_0;
                  stackIn_90_1 = stackIn_88_1;
                  stackIn_90_2 = stackIn_88_2;
                  stackIn_90_3 = stackIn_88_3;
                  stackIn_90_4 = stackIn_88_4;
                  stackIn_90_5 = stackIn_88_5;
                  stackIn_90_6 = 1;
                  break L2;
                }
                L4: {














                  stackIn_92_7 = 15;

                  stackIn_92_8 = param0;

                  stackIn_92_9 = 1;

                  stackIn_92_10 = var2;

                  if (50 >= pm.field_g) {







                    stackIn_93_7 = stackIn_92_7;
                    stackIn_93_8 = stackIn_92_8;
                    stackIn_93_9 = stackIn_92_9;
                    stackIn_93_10 = stackIn_92_10;
                    stackIn_93_11 = 0;
                    break L4;
                  } else {







                    stackIn_93_7 = stackIn_92_7;
                    stackIn_93_8 = stackIn_92_8;
                    stackIn_93_9 = stackIn_92_9;
                    stackIn_93_10 = stackIn_92_10;
                    stackIn_93_11 = 1;
                    break L4;
                  }
                }
                lk.a(stackIn_90_0, stackIn_90_1 != 0, stackIn_90_2, stackIn_90_3, stackIn_90_4, stackIn_90_5, stackIn_90_6 != 0, stackIn_93_7, stackIn_93_8, stackIn_93_9 != 0, stackIn_93_10 != 0, stackIn_93_11 != 0);
                if (!client.field_A) {
                  if (param1 != -3051) {
                    return;
                  } else {
                    L5: {
                      if (sn.field_g) {
                        jb.a((byte) 126, uj.field_g);
                        sn.field_g = false;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      if (gm.field_I) {
                        we.field_b.f(58, -4);
                        gm.field_I = false;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      if (nh.field_a) {
                        we.field_b.f(10, -4);
                        nh.field_a = false;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    return;
                  }
                } else {
                  break L0;
                }
              } else {
                L8: {
                  var2 = 0;
                  if (hh.field_a == null) {
                    stackIn_45_0 = 0;
                    break L8;
                  } else {
                    stackIn_45_0 = 1;
                    break L8;
                  }
                }
                L9: {
                  L10: {
                    var3 = stackIn_45_0;
                    stackIn_49_0 = 0;

                    stackIn_49_1 = 1;

                    stackIn_49_2 = 14;

                    stackIn_49_3 = 11;

                    stackIn_49_4 = 13;

                    stackIn_49_5 = jk.field_c;

                    if (fm.field_b) {
                      break L10;
                    } else {

                      if (fa.field_n) {
                        break L10;
                      } else {












                        if (var3 == 0) {
                          stackIn_51_0 = stackIn_49_0;
                          stackIn_51_1 = stackIn_49_1;
                          stackIn_51_2 = stackIn_49_2;
                          stackIn_51_3 = stackIn_49_3;
                          stackIn_51_4 = stackIn_49_4;
                          stackIn_51_5 = stackIn_49_5;
                          stackIn_51_6 = 0;
                          break L9;
                        } else {






                          break L10;
                        }
                      }
                    }
                  }
                  stackIn_51_0 = stackIn_49_0;
                  stackIn_51_1 = stackIn_49_1;
                  stackIn_51_2 = stackIn_49_2;
                  stackIn_51_3 = stackIn_49_3;
                  stackIn_51_4 = stackIn_49_4;
                  stackIn_51_5 = stackIn_49_5;
                  stackIn_51_6 = 1;
                  break L9;
                }
                L11: {














                  stackIn_53_7 = 15;

                  stackIn_53_8 = param0;

                  stackIn_53_9 = 1;

                  stackIn_53_10 = var2;

                  if (50 >= pm.field_g) {







                    stackIn_54_7 = stackIn_53_7;
                    stackIn_54_8 = stackIn_53_8;
                    stackIn_54_9 = stackIn_53_9;
                    stackIn_54_10 = stackIn_53_10;
                    stackIn_54_11 = 0;
                    break L11;
                  } else {







                    stackIn_54_7 = stackIn_53_7;
                    stackIn_54_8 = stackIn_53_8;
                    stackIn_54_9 = stackIn_53_9;
                    stackIn_54_10 = stackIn_53_10;
                    stackIn_54_11 = 1;
                    break L11;
                  }
                }
                lk.a(stackIn_51_0, stackIn_51_1 != 0, stackIn_51_2, stackIn_51_3, stackIn_51_4, stackIn_51_5, stackIn_51_6 != 0, stackIn_54_7, stackIn_54_8, stackIn_54_9 != 0, stackIn_54_10 != 0, stackIn_54_11 != 0);
                if (!client.field_A) {
                  if (param1 != -3051) {
                    return;
                  } else {
                    L12: {
                      if (sn.field_g) {
                        jb.a((byte) 126, uj.field_g);
                        sn.field_g = false;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    L13: {
                      if (gm.field_I) {
                        we.field_b.f(58, -4);
                        gm.field_I = false;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    L14: {
                      if (nh.field_a) {
                        we.field_b.f(10, -4);
                        nh.field_a = false;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    return;
                  }
                } else {
                  gn.b(param1 + -26499);
                  if (param1 != -3051) {
                    return;
                  } else {
                    L15: {
                      if (sn.field_g) {
                        jb.a((byte) 126, uj.field_g);
                        sn.field_g = false;
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    L16: {
                      if (gm.field_I) {
                        we.field_b.f(58, -4);
                        gm.field_I = false;
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    L17: {
                      if (nh.field_a) {
                        we.field_b.f(10, -4);
                        nh.field_a = false;
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                    return;
                  }
                }
              }
            } else {
              L18: {
                var2 = 0;
                if (hh.field_a == null) {
                  stackIn_5_0 = 0;
                  break L18;
                } else {
                  stackIn_5_0 = 1;
                  break L18;
                }
              }
              L19: {
                L20: {
                  var3 = stackIn_5_0;
                  stackIn_9_0 = 0;

                  stackIn_9_1 = 1;

                  stackIn_9_2 = 14;

                  stackIn_9_3 = 11;

                  stackIn_9_4 = 13;

                  stackIn_9_5 = jk.field_c;

                  if (fm.field_b) {
                    break L20;
                  } else {

                    if (fa.field_n) {
                      break L20;
                    } else {












                      if (var3 == 0) {
                        stackIn_11_0 = stackIn_9_0;
                        stackIn_11_1 = stackIn_9_1;
                        stackIn_11_2 = stackIn_9_2;
                        stackIn_11_3 = stackIn_9_3;
                        stackIn_11_4 = stackIn_9_4;
                        stackIn_11_5 = stackIn_9_5;
                        stackIn_11_6 = 0;
                        break L19;
                      } else {






                        break L20;
                      }
                    }
                  }
                }
                stackIn_11_0 = stackIn_9_0;
                stackIn_11_1 = stackIn_9_1;
                stackIn_11_2 = stackIn_9_2;
                stackIn_11_3 = stackIn_9_3;
                stackIn_11_4 = stackIn_9_4;
                stackIn_11_5 = stackIn_9_5;
                stackIn_11_6 = 1;
                break L19;
              }
              L21: {














                stackIn_13_7 = 15;

                stackIn_13_8 = param0;

                stackIn_13_9 = 1;

                stackIn_13_10 = var2;

                if (50 >= pm.field_g) {







                  stackIn_14_7 = stackIn_13_7;
                  stackIn_14_8 = stackIn_13_8;
                  stackIn_14_9 = stackIn_13_9;
                  stackIn_14_10 = stackIn_13_10;
                  stackIn_14_11 = 0;
                  break L21;
                } else {







                  stackIn_14_7 = stackIn_13_7;
                  stackIn_14_8 = stackIn_13_8;
                  stackIn_14_9 = stackIn_13_9;
                  stackIn_14_10 = stackIn_13_10;
                  stackIn_14_11 = 1;
                  break L21;
                }
              }
              lk.a(stackIn_11_0, stackIn_11_1 != 0, stackIn_11_2, stackIn_11_3, stackIn_11_4, stackIn_11_5, stackIn_11_6 != 0, stackIn_14_7, stackIn_14_8, stackIn_14_9 != 0, stackIn_14_10 != 0, stackIn_14_11 != 0);
              if (!client.field_A) {
                if (param1 != -3051) {
                  return;
                } else {
                  L22: {
                    if (sn.field_g) {
                      jb.a((byte) 126, uj.field_g);
                      sn.field_g = false;
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                  L23: {
                    if (gm.field_I) {
                      we.field_b.f(58, -4);
                      gm.field_I = false;
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                  L24: {
                    if (nh.field_a) {
                      we.field_b.f(10, -4);
                      nh.field_a = false;
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  return;
                }
              } else {
                gn.b(param1 + -26499);
                if (param1 != -3051) {
                  return;
                } else {
                  L25: {
                    if (sn.field_g) {
                      jb.a((byte) 126, uj.field_g);
                      sn.field_g = false;
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  L26: {
                    if (gm.field_I) {
                      we.field_b.f(58, -4);
                      gm.field_I = false;
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                  L27: {
                    if (nh.field_a) {
                      we.field_b.f(10, -4);
                      nh.field_a = false;
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  return;
                }
              }
            }
          }
        }
        gn.b(param1 + -26499);
        if (param1 != -3051) {
          return;
        } else {
          L28: {
            if (sn.field_g) {
              jb.a((byte) 126, uj.field_g);
              sn.field_g = false;
              break L28;
            } else {
              break L28;
            }
          }
          L29: {
            if (gm.field_I) {
              we.field_b.f(58, -4);
              gm.field_I = false;
              break L29;
            } else {
              break L29;
            }
          }
          L30: {
            if (nh.field_a) {
              we.field_b.f(10, -4);
              nh.field_a = false;
              break L30;
            } else {
              break L30;
            }
          }
          return;
        }
    }

    final void g(int param0) {
        rd var2;
        bl var3;
        int var4;
        rd var5;
        rd var6;
        var4 = client.field_A ? 1 : 0;
        if (param0 == 0) {
          var5 = new rd(this.field_Q);
          var3 = (bl) ((Object) var5.a((byte) 71));
          L0: while (true) {
            if (var3 != null) {
              if (var4 == 0) {
                L1: {
                  if (var3.h((byte) 39)) {
                    var3.b((byte) 124);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var3 = (bl) ((Object) var5.a(param0 + -70));
                if (var4 == 0) {
                  continue L0;
                } else {
                  this.field_L = (ce) ((Object) this.g((byte) -87));
                  return;
                }
              } else {
                return;
              }
            } else {
              this.field_L = (ce) ((Object) this.g((byte) -87));
              return;
            }
          }
        } else {
          field_O = (String) null;
          var6 = new rd(this.field_Q);
          var2 = var6;
          var3 = (bl) ((Object) var6.a((byte) 71));
          L2: while (true) {
            if (var3 != null) {
              if (var4 == 0) {
                L3: {
                  if (var3.h((byte) 39)) {
                    var3.b((byte) 124);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var3 = (bl) ((Object) var6.a(param0 + -70));
                if (var4 == 0) {
                  continue L2;
                } else {
                  this.field_L = (ce) ((Object) this.g((byte) -87));
                  return;
                }
              } else {
                return;
              }
            } else {
              this.field_L = (ce) ((Object) this.g((byte) -87));
              return;
            }
          }
        }
    }

    public static void h(byte param0) {
        field_N = null;
        field_O = null;
        field_M = null;
        field_P = null;
        int var1 = 99 % ((-85 - param0) / 40);
    }

    final ce a(int param0) {
        int var4 = client.field_A ? 1 : 0;
        rd var2 = new rd(this.field_Q);
        if (param0 != 14) {
            return (ce) null;
        }
        bl var3 = (bl) ((Object) var2.a((byte) 71));
        do {
            if (var3 == null) {
                return null;
            }
            if (var3.field_S) {
                return var3.e((byte) -74);
            }
            var3 = (bl) ((Object) var2.a(-93));
        } while (var4 == 0);
        return null;
    }

    final void f(byte param0) {
        rd var2;
        bl var3;
        int var4;
        rd var5;
        rd var6;
        var4 = client.field_A ? 1 : 0;
        if (param0 == -66) {
          var5 = new rd(this.field_Q);
          var3 = (bl) ((Object) var5.a((byte) 71));
          L0: while (true) {
            if (var3 != null) {
              if (var4 == 0) {
                L1: {
                  if (!var3.f((byte) 110)) {
                    break L1;
                  } else {
                    var3.b((byte) 120);
                    break L1;
                  }
                }
                var3 = (bl) ((Object) var5.a(param0 ^ 8));
                if (var4 == 0) {
                  continue L0;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          field_P = (af) null;
          var6 = new rd(this.field_Q);
          var2 = var6;
          var3 = (bl) ((Object) var6.a((byte) 71));
          L2: while (true) {
            if (var3 != null) {
              if (var4 == 0) {
                L3: {
                  if (!var3.f((byte) 110)) {
                    break L3;
                  } else {
                    var3.b((byte) 120);
                    break L3;
                  }
                }
                var3 = (bl) ((Object) var6.a(param0 ^ 8));
                if (var4 == 0) {
                  continue L2;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final void a(byte param0, ce param1) {
        bl var3 = null;
        try {
            if (!(param1 instanceof bl)) {
                throw new IllegalArgumentException();
            }
            if (param0 > -104) {
                ce var4 = (ce) null;
                this.a((byte) -72, (ce) null);
            }
            var3 = (bl) ((Object) param1);
            this.field_Q.b(var3, 7143);
            var3.field_S = true;
            var3.a(false, (ce) (this));
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "ka.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        rd var5 = null;
        ce var6 = null;
        int var7 = client.field_A ? 1 : 0;
        if (null != this.field_p) {
            this.field_p.a(true, param0, param3, (byte) -100, (ce) (this));
            var5 = new rd(this.field_Q);
            if (param1 > -103) {
                return;
            }
            var6 = (ce) ((Object) var5.a(true));
            do {
                if (var6 == null) {
                    return;
                }
                var6.a(param0 + this.field_u, -116, param2, this.field_D + param3);
                var6 = (ce) ((Object) var5.d(2078965185));
                if (var7 != 0) {
                    return;
                }
            } while (var7 == 0);
            return;
        }
        var5 = new rd(this.field_Q);
        if (param1 > -103) {
            return;
        }
        var6 = (ce) ((Object) var5.a(true));
        do {
            if (var6 == null) {
                return;
            }
            var6.a(param0 + this.field_u, -116, param2, this.field_D + param3);
            var6 = (ce) ((Object) var5.d(2078965185));
            if (var7 != 0) {
                return;
            }
        } while (var7 == 0);
    }

    static {
        field_M = "CHALLENGE!";
        field_O = "Members' Benefits";
    }
}
