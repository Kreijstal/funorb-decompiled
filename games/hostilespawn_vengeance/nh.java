/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class nh extends fc {
    private int field_J;
    static int[] field_O;
    private boolean field_K;
    static int field_M;
    static oc field_E;
    private String field_B;
    static uj field_L;
    static int field_H;
    private vm field_N;
    private int field_I;
    private int field_F;
    static we field_P;
    static bd field_C;

    final String e(int param0) {
        int var2 = ((nh) this).field_A.field_u ? 1 : 0;
        ((nh) this).field_A.field_u = ((nh) this).field_u;
        String var3 = ((nh) this).field_A.e((int) (char)param0);
        ((nh) this).field_A.field_u = var2 != 0 ? true : false;
        return var3;
    }

    final static double a(int param0, p param1, p param2) {
        if (param0 != -12149) {
          field_O = null;
          return 128.0 * Math.atan2(-param2.field_l.field_f + ((double)(-param2.field_j.field_e) + ((double)param1.field_j.field_e + param1.field_l.field_f)), (double)(-param2.field_j.field_g) + (param1.field_l.field_a + (double)param1.field_j.field_g) - param2.field_l.field_a) / 3.141592653589793;
        } else {
          return 128.0 * Math.atan2(-param2.field_l.field_f + ((double)(-param2.field_j.field_e) + ((double)param1.field_j.field_e + param1.field_l.field_f)), (double)(-param2.field_j.field_g) + (param1.field_l.field_a + (double)param1.field_j.field_g) - param2.field_l.field_a) / 3.141592653589793;
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        vm stackIn_8_0 = null;
        String stackIn_8_1 = null;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        int stackIn_8_4 = 0;
        int stackIn_8_5 = 0;
        int stackIn_8_6 = 0;
        int stackIn_8_7 = 0;
        vm stackIn_9_0 = null;
        String stackIn_9_1 = null;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        int stackIn_9_4 = 0;
        int stackIn_9_5 = 0;
        int stackIn_9_6 = 0;
        int stackIn_9_7 = 0;
        vm stackIn_10_0 = null;
        String stackIn_10_1 = null;
        int stackIn_10_2 = 0;
        int stackIn_10_3 = 0;
        int stackIn_10_4 = 0;
        int stackIn_10_5 = 0;
        int stackIn_10_6 = 0;
        int stackIn_10_7 = 0;
        int stackIn_10_8 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        vm stackOut_7_0 = null;
        String stackOut_7_1 = null;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        int stackOut_7_4 = 0;
        int stackOut_7_5 = 0;
        int stackOut_7_6 = 0;
        int stackOut_7_7 = 0;
        vm stackOut_9_0 = null;
        String stackOut_9_1 = null;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        int stackOut_9_4 = 0;
        int stackOut_9_5 = 0;
        int stackOut_9_6 = 0;
        int stackOut_9_7 = 0;
        int stackOut_9_8 = 0;
        vm stackOut_8_0 = null;
        String stackOut_8_1 = null;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        int stackOut_8_4 = 0;
        int stackOut_8_5 = 0;
        int stackOut_8_6 = 0;
        int stackOut_8_7 = 0;
        int stackOut_8_8 = 0;
        var5 = param1 + ((nh) this).field_v;
        var6 = ((nh) this).field_m + param0;
        super.a(param0, param1, (byte) 70, param3);
        if (param3 != 0) {
          return;
        } else {
          if (param2 <= 42) {
            return;
          } else {
            L0: {
              if (((nh) this).field_K) {
                stackOut_6_0 = -(((nh) this).field_I * 2) + (((nh) this).field_s + -((nh) this).field_J);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_5_0 = 0;
                stackIn_7_0 = stackOut_5_0;
                break L0;
              }
            }
            L1: {
              var7 = stackIn_7_0;
              stackOut_7_0 = ((nh) this).field_N;
              stackOut_7_1 = ((nh) this).field_B;
              stackOut_7_2 = ((nh) this).field_I + var5 + var7;
              stackOut_7_3 = ((nh) this).field_I + var6;
              stackOut_7_4 = -((nh) this).field_I + ((nh) this).field_J;
              stackOut_7_5 = -(((nh) this).field_I * 2) + ((nh) this).field_x;
              stackOut_7_6 = ((nh) this).field_F;
              stackOut_7_7 = -1;
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              stackIn_9_3 = stackOut_7_3;
              stackIn_9_4 = stackOut_7_4;
              stackIn_9_5 = stackOut_7_5;
              stackIn_9_6 = stackOut_7_6;
              stackIn_9_7 = stackOut_7_7;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              stackIn_8_3 = stackOut_7_3;
              stackIn_8_4 = stackOut_7_4;
              stackIn_8_5 = stackOut_7_5;
              stackIn_8_6 = stackOut_7_6;
              stackIn_8_7 = stackOut_7_7;
              if (((nh) this).field_K) {
                stackOut_9_0 = (vm) (Object) stackIn_9_0;
                stackOut_9_1 = (String) (Object) stackIn_9_1;
                stackOut_9_2 = stackIn_9_2;
                stackOut_9_3 = stackIn_9_3;
                stackOut_9_4 = stackIn_9_4;
                stackOut_9_5 = stackIn_9_5;
                stackOut_9_6 = stackIn_9_6;
                stackOut_9_7 = stackIn_9_7;
                stackOut_9_8 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                stackIn_10_2 = stackOut_9_2;
                stackIn_10_3 = stackOut_9_3;
                stackIn_10_4 = stackOut_9_4;
                stackIn_10_5 = stackOut_9_5;
                stackIn_10_6 = stackOut_9_6;
                stackIn_10_7 = stackOut_9_7;
                stackIn_10_8 = stackOut_9_8;
                break L1;
              } else {
                stackOut_8_0 = (vm) (Object) stackIn_8_0;
                stackOut_8_1 = (String) (Object) stackIn_8_1;
                stackOut_8_2 = stackIn_8_2;
                stackOut_8_3 = stackIn_8_3;
                stackOut_8_4 = stackIn_8_4;
                stackOut_8_5 = stackIn_8_5;
                stackOut_8_6 = stackIn_8_6;
                stackOut_8_7 = stackIn_8_7;
                stackOut_8_8 = 2;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackIn_10_2 = stackOut_8_2;
                stackIn_10_3 = stackOut_8_3;
                stackIn_10_4 = stackOut_8_4;
                stackIn_10_5 = stackOut_8_5;
                stackIn_10_6 = stackOut_8_6;
                stackIn_10_7 = stackOut_8_7;
                stackIn_10_8 = stackOut_8_8;
                break L1;
              }
            }
            int discarded$1 = ((vm) (Object) stackIn_10_0).a(stackIn_10_1, stackIn_10_2, stackIn_10_3, stackIn_10_4, stackIn_10_5, stackIn_10_6, stackIn_10_7, stackIn_10_8, 1, ((nh) this).field_N.field_y);
            return;
          }
        }
    }

    final static void a(boolean param0, byte param1) {
        if (param1 <= -63) {
          if (wa.field_q == null) {
            cn.a(param0, (byte) 91);
            return;
          } else {
            tb.f((byte) -122);
            return;
          }
        } else {
          field_M = 78;
          if (wa.field_q == null) {
            cn.a(param0, (byte) 91);
            return;
          } else {
            tb.f((byte) -122);
            return;
          }
        }
    }

    final static void a(oj param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        var3 = HostileSpawn.field_I ? 1 : 0;
        if (param0 != null) {
          L0: {
            if (0 < param0.field_I) {
              var2 = param0.field_i;
              if (var2 != 1) {
                if (18 != var2) {
                  if (19 != var2) {
                    if (-4 != var2) {
                      if (var2 == 4) {
                        break L0;
                      } else {
                        if (-6 != var2) {
                          if (6 == var2) {
                            break L0;
                          } else {
                            if (-9 == var2) {
                              break L0;
                            } else {
                              if (10 == var2) {
                                break L0;
                              } else {
                                if (var2 == 11) {
                                  break L0;
                                } else {
                                  if (-13 == var2) {
                                    break L0;
                                  } else {
                                    if (-21 == (var2 ^ -1)) {
                                      break L0;
                                    } else {
                                      if (var2 != 21) {
                                        break L0;
                                      } else {
                                        if (param1 == -29966) {
                                          return;
                                        } else {
                                          var4 = null;
                                          nh.a((oj) null, -68);
                                          return;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          if (param1 == -29966) {
                            return;
                          } else {
                            var4 = null;
                            nh.a((oj) null, -68);
                            return;
                          }
                        }
                      }
                    } else {
                      if (param1 != -29966) {
                        var4 = null;
                        nh.a((oj) null, -68);
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    if (param1 != -29966) {
                      var4 = null;
                      nh.a((oj) null, -68);
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  if (param1 != -29966) {
                    var4 = null;
                    nh.a((oj) null, -68);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                if (param1 != -29966) {
                  var4 = null;
                  nh.a((oj) null, -68);
                  return;
                } else {
                  return;
                }
              }
            } else {
              var2 = param0.field_i;
              if ((var2 ^ -1) != -2) {
                if (var2 != -25) {
                  if (-226 != var2) {
                    if (var2 != 18) {
                      if (19 != var2) {
                        if ((var2 ^ -1) != -28) {
                          if (8 == var2) {
                            jh.a(3 * uh.field_i / 2, (byte) 55, 40, jc.field_c, 1);
                            break L0;
                          } else {
                            if (3 == var2) {
                              tk.a(7, jc.field_c, 55, true);
                              break L0;
                            } else {
                              if (var2 != 4) {
                                L1: {
                                  if (-6 != (var2 ^ -1)) {
                                    if ((var2 ^ -1) != -7) {
                                      if ((var2 ^ -1) != -11) {
                                        L2: {
                                          if ((var2 ^ -1) != -12) {
                                            if ((var2 ^ -1) != -13) {
                                              if (var2 != 20) {
                                                if (21 != var2) {
                                                  break L0;
                                                } else {
                                                  if (uj.field_l == 1) {
                                                    if (ej.d((byte) 107)) {
                                                      eh.field_c.a(lm.field_A[14], 100, uh.field_i / 3);
                                                      break L0;
                                                    } else {
                                                      break L0;
                                                    }
                                                  } else {
                                                    break L0;
                                                  }
                                                }
                                              } else {
                                                break L2;
                                              }
                                            } else {
                                              L3: {
                                                if ((uj.field_l ^ -1) == -2) {
                                                  if (ej.d((byte) 102)) {
                                                    eh.field_c.a(lm.field_A[17], 100, uh.field_i);
                                                    break L3;
                                                  } else {
                                                    break L3;
                                                  }
                                                } else {
                                                  break L3;
                                                }
                                              }
                                              if (param1 != -29966) {
                                                var4 = null;
                                                nh.a((oj) null, -68);
                                                return;
                                              } else {
                                                return;
                                              }
                                            }
                                          } else {
                                            break L2;
                                          }
                                        }
                                        if ((uj.field_l ^ -1) == -2) {
                                          if (ej.d((byte) 102)) {
                                            eh.field_c.a(lm.field_A[17], 100, uh.field_i);
                                            break L0;
                                          } else {
                                            break L0;
                                          }
                                        } else {
                                          break L0;
                                        }
                                      } else {
                                        L4: {
                                          if ((uj.field_l ^ -1) == -2) {
                                            if (ej.d((byte) 102)) {
                                              eh.field_c.a(lm.field_A[17], 100, uh.field_i);
                                              break L4;
                                            } else {
                                              break L4;
                                            }
                                          } else {
                                            break L4;
                                          }
                                        }
                                        if (param1 != -29966) {
                                          var4 = null;
                                          nh.a((oj) null, -68);
                                          return;
                                        } else {
                                          return;
                                        }
                                      }
                                    } else {
                                      break L1;
                                    }
                                  } else {
                                    break L1;
                                  }
                                }
                                if (1 != uj.field_l) {
                                  break L0;
                                } else {
                                  if (!ej.d((byte) 61)) {
                                    break L0;
                                  } else {
                                    eh.field_c.a(lm.field_A[17], 100 - -(int)(20.0 * Math.random() - 10.0), uh.field_i / 3);
                                    break L0;
                                  }
                                }
                              } else {
                                if (1 != uj.field_l) {
                                  break L0;
                                } else {
                                  eh.field_c.a(em.field_a[22], (int)(20.0 * Math.random() - 10.0) + 100, uh.field_i);
                                  break L0;
                                }
                              }
                            }
                          }
                        } else {
                          if (param1 != -29966) {
                            var4 = null;
                            nh.a((oj) null, -68);
                            return;
                          } else {
                            return;
                          }
                        }
                      } else {
                        jh.a(uh.field_i * 3 / 2, (byte) 118, 26, jc.field_c, 1);
                        break L0;
                      }
                    } else {
                      jh.a(uh.field_i * 3 / 2, (byte) 126, 21, jc.field_c, 3);
                      break L0;
                    }
                  } else {
                    jh.a(3 * uh.field_i / 2, (byte) 88, 9, jc.field_c, 3);
                    break L0;
                  }
                } else {
                  jh.a(3 * uh.field_i / 2, (byte) 88, 9, jc.field_c, 3);
                  break L0;
                }
              } else {
                jh.a(3 * uh.field_i / 2, (byte) 88, 9, jc.field_c, 3);
                if (param1 != -29966) {
                  var4 = null;
                  nh.a((oj) null, -68);
                  return;
                } else {
                  return;
                }
              }
            }
          }
          if (param1 == -29966) {
            return;
          } else {
            var4 = null;
            nh.a((oj) null, -68);
            return;
          }
        } else {
          return;
        }
    }

    nh(int param0, int param1, int param2, int param3, ag param4, boolean param5, int param6, int param7, vm param8, int param9, String param10) {
        super(param0, param1, param2, param3, (nn) null, (mh) null);
        ((nh) this).field_J = param6;
        ((nh) this).field_F = param9;
        ((nh) this).field_B = param10;
        ((nh) this).field_K = param5 ? true : false;
        ((nh) this).field_A = param4;
        ((nh) this).field_N = param8;
        ((nh) this).field_I = param7;
        int var12 = ((nh) this).field_J + -((nh) this).field_I;
        int var13 = ((nh) this).field_N.b(param10, var12, ((nh) this).field_N.field_y) - -(2 * ((nh) this).field_I);
        if (param3 >= var13) {
            var13 = param3;
        } else {
            ((nh) this).a(param2, param1, 0, param0, var13);
        }
        int var14 = ((nh) this).field_K ? 0 : ((nh) this).field_J + 2 * ((nh) this).field_I;
        ((nh) this).field_A.a(-(((nh) this).field_I * 3) + (-((nh) this).field_J + param2), ((nh) this).field_I - -(var13 - param3 >> 1568777665), 0, var14, param3 + -(2 * ((nh) this).field_I));
    }

    public static void k(int param0) {
        field_P = null;
        field_C = null;
        field_E = null;
        if (param0 != 0) {
            return;
        }
        field_L = null;
        field_O = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = 0;
        field_H = 0;
        field_E = new oc(-1, -1);
        field_P = new we(field_E);
    }
}
