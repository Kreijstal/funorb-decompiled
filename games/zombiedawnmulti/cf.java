/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class cf extends br {
    int field_n;
    String field_x;
    static String field_v;
    int field_u;
    static String field_p;
    boolean field_l;
    static rl field_s;
    int field_q;
    static String field_m;
    static String field_t;
    int field_w;
    int field_z;
    bj field_A;
    int field_y;
    nl field_h;
    mp field_k;
    static long field_g;
    String field_j;
    static String[] field_f;
    static String field_o;
    static boolean field_r;
    int field_i;

    final static void d(int param0) {
        qa var1 = null;
        int var2 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var1_ref = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var2 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        dc.field_Fb = 0;
                        fn.field_d = 0;
                        ta.field_ob = null;
                        ro.field_M.e(param0 ^ 22926);
                        jf.field_d.e(-30986);
                        if (param0 == -8328) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_o = (String) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var1 = ol.field_o.a((byte) 7);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var1 == null) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var1.a(-4564);
                        var1 = ol.field_o.c((byte) 112);
                        if (var2 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var2 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var1 = bh.field_f.a((byte) 7);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var1 = bh.field_f.a((byte) 7);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var1 == null) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var1.a(param0 ^ 12628);
                        var1 = bh.field_f.c((byte) 104);
                        if (var2 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var2 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        ge.field_zb = 0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    var1_ref = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) var1_ref), "cf.RB(" + param0 + ')');
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(byte param0, String param1) {
        sc.field_j.field_wb = param1;
        ee.field_a = true;
        int var2_int = dl.field_h.field_h;
        int var3 = dl.field_h.field_f;
        int var4 = sc.field_j.field_yb.a(param1, 272, sc.field_j.field_J);
        int var5 = -(var4 / 2) + 7 + (-110 + var3 / 2);
        lm.field_gb.a(-(2 * var5) + var3 - 120, var5, 320, (-320 + var2_int) / 2, -3344);
        lm.field_gb.field_ab = tg.a(2105376, lm.field_gb.field_z, 8421504, 3, 11579568, 114);
        sc.field_j.a(-20 + (lm.field_gb.field_z + -24), 16, -24 + lm.field_gb.field_zb + -24, 24, -3344);
        if (param0 >= -6) {
            return;
        }
        try {
            kn.field_a.a(24, -24 + (-20 + lm.field_gb.field_z), 80, 120, -3344);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "cf.CC(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void e(int param0) {
        this.b(this.field_y, this.field_i, 28972, this.field_n, this.field_w);
        if (param0 == -1) {
          return;
        } else {
          field_m = (String) null;
          return;
        }
    }

    cf(String param0, bj param1) {
        this(param0, ra.field_o.field_s, param1);
    }

    StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_4_0 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.a(param1, -24, param3, param2)) {
                break L1;
              } else {
                this.a(param2, param3, (byte) 26, param1);
                break L1;
              }
            }
            if (param0 == 7) {
              stackIn_6_0 = (StringBuilder) (param3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = (StringBuilder) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("cf.GA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    void a(int param0, cf param1, int param2, int param3, boolean param4, int param5) {
        try {
            if (!param4) {
                field_g = 71L;
            }
            this.field_u = 0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "cf.NA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    boolean a(byte param0, int param1, int param2, int param3, int param4, int param5, cf param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var8_int = -62 / ((param0 - 48) / 37);
            stackIn_1_0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var8);

            stackIn_4_1 = new StringBuilder().append("cf.DB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0 != 0;
    }

    final boolean a(int param0, byte param1, int param2, boolean param3) {
        int var5;
        int var7;
        ua var8;
        ua var9;
        ua var10;
        ua var11;
        ua var12;
        ua var13;
        L0: {
          L1: {
            var7 = ZombieDawnMulti.field_E ? 1 : 0;
            this.a(-5407, (cf) (this), param0, param2);
            var5 = this.c(127) ? 1 : 0;
            if (!param3) {
              break L1;
            } else {
              if (t.field_d != 0) {
                L2: {
                  if (var5 != 0) {
                    this.a((byte) -111, t.field_d, bo.field_d, param0, param2, bd.field_g, (cf) (this));
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (-1 != (kd.field_b ^ -1)) {
                  L3: {
                    L4: {
                      if (this.a(ka.field_t, vb.field_f, kd.field_b, (cf) (this), -24, param0, param2)) {
                        break L4;
                      } else {
                        if (var5 != 0) {
                          this.c((byte) 32);
                          if (var7 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        } else {
                          L5: {
                            if (0 != pq.field_f) {
                              break L5;
                            } else {
                              if (-1 == (aj.field_j ^ -1)) {
                                break L5;
                              } else {
                                L6: {
                                  this.a(bd.field_g, (cf) (this), param2, bo.field_d, true, param0);
                                  var12 = qi.field_a;
                                  if (var12 == null) {
                                    break L6;
                                  } else {
                                    if (!(var12.field_A instanceof vq)) {
                                      qi.field_a = null;
                                      break L6;
                                    } else {
                                      ((vq) ((Object) var12.field_A)).a(var12, (byte) 5, (sd) null);
                                      qi.field_a = null;
                                      break L6;
                                    }
                                  }
                                }
                                if (var7 == 0) {
                                  break L5;
                                } else {
                                  if (var5 == 0) {
                                    break L5;
                                  } else {
                                    if (0 == kd.field_b) {
                                      break L5;
                                    } else {
                                      this.c((byte) 32);
                                      break L5;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          aj.field_j = pq.field_f;
                          ii.a(-16898, this.d((byte) -51));
                          if (param1 != -27) {
                            this.field_w = -89;
                            return param3;
                          } else {
                            return param3;
                          }
                        }
                      }
                    }
                    param3 = false;
                    break L3;
                  }
                  if (0 != pq.field_f) {
                    break L0;
                  } else {
                    if (-1 == (aj.field_j ^ -1)) {
                      break L0;
                    } else {
                      this.a(bd.field_g, (cf) (this), param2, bo.field_d, true, param0);
                      var13 = qi.field_a;
                      if (var13 == null) {
                        if (var7 == 0) {
                          break L0;
                        } else {
                          break L1;
                        }
                      } else {
                        if (!(var13.field_A instanceof vq)) {
                          L7: {
                            qi.field_a = null;
                            if (var7 == 0) {
                              break L7;
                            } else {
                              if (var5 == 0) {
                                break L7;
                              } else {
                                if (0 == kd.field_b) {
                                  break L7;
                                } else {
                                  this.c((byte) 32);
                                  aj.field_j = pq.field_f;
                                  ii.a(-16898, this.d((byte) -51));
                                  if (param1 != -27) {
                                    this.field_w = -89;
                                    return param3;
                                  } else {
                                    return param3;
                                  }
                                }
                              }
                            }
                          }
                          aj.field_j = pq.field_f;
                          ii.a(-16898, this.d((byte) -51));
                          if (param1 != -27) {
                            this.field_w = -89;
                            return param3;
                          } else {
                            return param3;
                          }
                        } else {
                          ((vq) ((Object) var13.field_A)).a(var13, (byte) 5, (sd) null);
                          L8: {
                            qi.field_a = null;
                            if (var7 == 0) {
                              break L8;
                            } else {
                              if (var5 == 0) {
                                break L8;
                              } else {
                                if (0 == kd.field_b) {
                                  break L8;
                                } else {
                                  this.c((byte) 32);
                                  aj.field_j = pq.field_f;
                                  ii.a(-16898, this.d((byte) -51));
                                  if (param1 != -27) {
                                    this.field_w = -89;
                                    return param3;
                                  } else {
                                    return param3;
                                  }
                                }
                              }
                            }
                          }
                          aj.field_j = pq.field_f;
                          ii.a(-16898, this.d((byte) -51));
                          if (param1 != -27) {
                            this.field_w = -89;
                            return param3;
                          } else {
                            return param3;
                          }
                        }
                      }
                    }
                  }
                } else {
                  if (0 != pq.field_f) {
                    L9: {
                      aj.field_j = pq.field_f;
                      ii.a(-16898, this.d((byte) -51));
                      if (param1 == -27) {
                        break L9;
                      } else {
                        this.field_w = -89;
                        break L9;
                      }
                    }
                    return param3;
                  } else {
                    L10: {
                      if (-1 == (aj.field_j ^ -1)) {
                        break L10;
                      } else {
                        L11: {
                          this.a(bd.field_g, (cf) (this), param2, bo.field_d, true, param0);
                          var11 = qi.field_a;
                          if (var11 == null) {
                            break L11;
                          } else {
                            if (!(var11.field_A instanceof vq)) {
                              qi.field_a = null;
                              break L11;
                            } else {
                              ((vq) ((Object) var11.field_A)).a(var11, (byte) 5, (sd) null);
                              qi.field_a = null;
                              break L11;
                            }
                          }
                        }
                        if (var7 == 0) {
                          break L10;
                        } else {
                          if (var5 == 0) {
                            break L10;
                          } else {
                            if (0 == kd.field_b) {
                              break L10;
                            } else {
                              this.c((byte) 32);
                              break L10;
                            }
                          }
                        }
                      }
                    }
                    L12: {
                      aj.field_j = pq.field_f;
                      ii.a(-16898, this.d((byte) -51));
                      if (param1 == -27) {
                        break L12;
                      } else {
                        this.field_w = -89;
                        break L12;
                      }
                    }
                    return param3;
                  }
                }
              } else {
                if (-1 != (kd.field_b ^ -1)) {
                  L13: {
                    L14: {
                      if (this.a(ka.field_t, vb.field_f, kd.field_b, (cf) (this), -24, param0, param2)) {
                        break L14;
                      } else {
                        if (var5 != 0) {
                          this.c((byte) 32);
                          if (var7 == 0) {
                            break L13;
                          } else {
                            break L14;
                          }
                        } else {
                          L15: {
                            if (0 != pq.field_f) {
                              break L15;
                            } else {
                              if (-1 == (aj.field_j ^ -1)) {
                                break L15;
                              } else {
                                L16: {
                                  this.a(bd.field_g, (cf) (this), param2, bo.field_d, true, param0);
                                  var9 = qi.field_a;
                                  if (var9 == null) {
                                    break L16;
                                  } else {
                                    if (!(var9.field_A instanceof vq)) {
                                      qi.field_a = null;
                                      break L16;
                                    } else {
                                      ((vq) ((Object) var9.field_A)).a(var9, (byte) 5, (sd) null);
                                      qi.field_a = null;
                                      break L16;
                                    }
                                  }
                                }
                                if (var7 == 0) {
                                  break L15;
                                } else {
                                  if (var5 == 0) {
                                    break L15;
                                  } else {
                                    if (0 == kd.field_b) {
                                      break L15;
                                    } else {
                                      this.c((byte) 32);
                                      break L15;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L17: {
                            aj.field_j = pq.field_f;
                            ii.a(-16898, this.d((byte) -51));
                            if (param1 == -27) {
                              break L17;
                            } else {
                              this.field_w = -89;
                              break L17;
                            }
                          }
                          return param3;
                        }
                      }
                    }
                    param3 = false;
                    break L13;
                  }
                  L18: {
                    if (0 != pq.field_f) {
                      break L18;
                    } else {
                      if (-1 == (aj.field_j ^ -1)) {
                        break L18;
                      } else {
                        this.a(bd.field_g, (cf) (this), param2, bo.field_d, true, param0);
                        var10 = qi.field_a;
                        if (var10 == null) {
                          if (var7 == 0) {
                            break L18;
                          } else {
                            if (var5 == 0) {
                              break L18;
                            } else {
                              if (0 == kd.field_b) {
                                break L18;
                              } else {
                                L19: {
                                  this.c((byte) 32);
                                  aj.field_j = pq.field_f;
                                  ii.a(-16898, this.d((byte) -51));
                                  if (param1 == -27) {
                                    break L19;
                                  } else {
                                    this.field_w = -89;
                                    break L19;
                                  }
                                }
                                return param3;
                              }
                            }
                          }
                        } else {
                          if (!(var10.field_A instanceof vq)) {
                            L20: {
                              qi.field_a = null;
                              if (var7 == 0) {
                                break L20;
                              } else {
                                if (var5 == 0) {
                                  break L20;
                                } else {
                                  if (0 == kd.field_b) {
                                    break L20;
                                  } else {
                                    this.c((byte) 32);
                                    break L20;
                                  }
                                }
                              }
                            }
                            L21: {
                              aj.field_j = pq.field_f;
                              ii.a(-16898, this.d((byte) -51));
                              if (param1 == -27) {
                                break L21;
                              } else {
                                this.field_w = -89;
                                break L21;
                              }
                            }
                            return param3;
                          } else {
                            ((vq) ((Object) var10.field_A)).a(var10, (byte) 5, (sd) null);
                            L22: {
                              qi.field_a = null;
                              if (var7 == 0) {
                                break L22;
                              } else {
                                if (var5 == 0) {
                                  break L22;
                                } else {
                                  if (0 == kd.field_b) {
                                    break L22;
                                  } else {
                                    this.c((byte) 32);
                                    break L22;
                                  }
                                }
                              }
                            }
                            L23: {
                              aj.field_j = pq.field_f;
                              ii.a(-16898, this.d((byte) -51));
                              if (param1 == -27) {
                                break L23;
                              } else {
                                this.field_w = -89;
                                break L23;
                              }
                            }
                            return param3;
                          }
                        }
                      }
                    }
                  }
                  aj.field_j = pq.field_f;
                  ii.a(-16898, this.d((byte) -51));
                  if (param1 != -27) {
                    this.field_w = -89;
                    return param3;
                  } else {
                    return param3;
                  }
                } else {
                  L24: {
                    if (0 != pq.field_f) {
                      break L24;
                    } else {
                      if (-1 == (aj.field_j ^ -1)) {
                        break L24;
                      } else {
                        L25: {
                          this.a(bd.field_g, (cf) (this), param2, bo.field_d, true, param0);
                          var8 = qi.field_a;
                          if (var8 == null) {
                            break L25;
                          } else {
                            if (!(var8.field_A instanceof vq)) {
                              qi.field_a = null;
                              break L25;
                            } else {
                              ((vq) ((Object) var8.field_A)).a(var8, (byte) 5, (sd) null);
                              qi.field_a = null;
                              break L25;
                            }
                          }
                        }
                        if (var7 == 0) {
                          break L24;
                        } else {
                          if (var5 == 0) {
                            break L24;
                          } else {
                            if (0 == kd.field_b) {
                              break L24;
                            } else {
                              this.c((byte) 32);
                              break L24;
                            }
                          }
                        }
                      }
                    }
                  }
                  L26: {
                    aj.field_j = pq.field_f;
                    ii.a(-16898, this.d((byte) -51));
                    if (param1 == -27) {
                      break L26;
                    } else {
                      this.field_w = -89;
                      break L26;
                    }
                  }
                  return param3;
                }
              }
            }
          }
          if (var5 == 0) {
            break L0;
          } else {
            if (0 == kd.field_b) {
              break L0;
            } else {
              this.c((byte) 32);
              aj.field_j = pq.field_f;
              ii.a(-16898, this.d((byte) -51));
              if (param1 != -27) {
                this.field_w = -89;
                return param3;
              } else {
                return param3;
              }
            }
          }
        }
        aj.field_j = pq.field_f;
        ii.a(-16898, this.d((byte) -51));
        if (param1 == -27) {
          return param3;
        } else {
          this.field_w = -89;
          return param3;
        }
    }

    boolean c(int param0) {
        if (param0 <= 123) {
            this.f((byte) -51);
            return false;
        }
        return false;
    }

    final void a(int param0, StringBuilder param1, byte param2, Hashtable param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              discarded$0 = param1.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_y).append(",").append(this.field_i).append(" ").append(this.field_n).append("x").append(this.field_w);
              if (this.field_j == null) {
                break L1;
              } else {
                discarded$1 = param1.append(" text=\"").append(this.field_j).append('"');
                break L1;
              }
            }
            L2: {
              if (this.field_l) {
                discarded$2 = param1.append(" mouseover");
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!this.c(param2 + 98)) {
                break L3;
              } else {
                discarded$3 = param1.append(" focused");
                break L3;
              }
            }
            L4: {
              if (this.field_h != null) {
                L5: {
                  discarded$4 = param1.append(" renderer=");
                  if (this.field_h instanceof cf) {
                    break L5;
                  } else {
                    discarded$5 = param1.append(this.field_h);
                    if (var6 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                param1 = this.a(7, param3, 1 + param0, param1);
                break L4;
              } else {
                break L4;
              }
            }
            if (param2 == 26) {
              L6: {
                if (null != this.field_A) {
                  L7: {
                    discarded$6 = param1.append(" listener=");
                    if (this.field_A instanceof cf) {
                      break L7;
                    } else {
                      discarded$7 = param1.append(this.field_A);
                      if (var6 == 0) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  param1 = this.a(7, param3, param0 - -1, param1);
                  break L6;
                } else {
                  break L6;
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
          L8: {
            var5 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var5);

            stackIn_25_1 = new StringBuilder().append("cf.EC(").append(param0).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L9;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L9;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_26_0), stackIn_29_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4;
        int var5_int;
        String var5;
        int var6;
        int var7;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        var4 = this.f((byte) 44);
        var5_int = 0;
        L0: while (true) {
          L1: {
            if (var5_int > var4) {
              break L1;
            } else {
              this.a(-2, param1, var5_int, param2);
              var5_int++;
              if (var7 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          var5 = up.a(-19);
          if (var5 != null) {
            ra.field_o.a(tf.field_Db, var5, bl.field_c, (byte) 95);
            var6 = 46 % ((param0 - -30) / 47);
            return;
          } else {
            var6 = 46 % ((param0 - -30) / 47);
            return;
          }
        }
    }

    boolean a(cf param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 0) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              this.field_y = -78;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("cf.S(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param0 == -2) {
          if (param2 != 0) {
            return;
          } else {
            L0: {
              if (this.field_h != null) {
                this.field_h.a(true, param1, -15112, param3, (cf) (this));
                break L0;
              } else {
                break L0;
              }
            }
            return;
          }
        } else {
          this.field_n = -82;
          if (param2 != 0) {
            return;
          } else {
            L1: {
              if (this.field_h != null) {
                this.field_h.a(true, param1, -15112, param3, (cf) (this));
                break L1;
              } else {
                break L1;
              }
            }
            return;
          }
        }
    }

    int f(byte param0) {
        cf var3;
        if (param0 != 44) {
          var3 = (cf) null;
          this.a(-73, 92, -41, (cf) null, 104, -40, -53);
          return 0;
        } else {
          return 0;
        }
    }

    boolean a(int param0, char param1, cf param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 == -6208) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("cf.CA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    public static void e(byte param0) {
        field_v = null;
        field_t = null;
        if (param0 >= -61) {
          return;
        } else {
          field_o = null;
          field_p = null;
          field_m = null;
          field_f = null;
          field_s = null;
          return;
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4) {
        int var6;
        var6 = 72 % ((44 - param0) / 36);
        if (param1 - -this.field_y <= param2) {
          if (param3 >= param4 - -this.field_i) {
            if (param2 < param1 - -this.field_y + this.field_n) {
              if (param3 >= this.field_w + this.field_i + param4) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    void a(int param0, cf param1, int param2, int param3) {
        int var5_int = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            if (param0 == -5407) {
              L1: {
                var5_int = this.a(param0 ^ 5437, param2, bd.field_g, bo.field_d, param3) ? 1 : 0;
                if ((this.field_l ? 1 : 0) != var5_int) {
                  L2: {
                    stackIn_6_0 = this;

                    if (var5_int == 0) {
                      stackIn_7_0 = this;
                      stackIn_7_1 = 0;
                      break L2;
                    } else {
                      stackIn_7_0 = this;
                      stackIn_7_1 = 1;
                      break L2;
                    }
                  }
                  ((cf) (this)).field_l = stackIn_7_1 != 0;
                  if (this.field_A == null) {
                    break L1;
                  } else {
                    if (!(this.field_A instanceof ar)) {
                      break L1;
                    } else {
                      ((ar) ((Object) this.field_A)).a((cf) (this), -14339, var5_int != 0);
                      break L1;
                    }
                  }
                } else {
                  break L1;
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
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("cf.T(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(Hashtable param0, int param1, StringBuilder param2, int param3) {
        StringBuilder discarded$1 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = 0 / ((param1 - 61) / 45);
            if (param0.containsKey(this)) {
              discarded$1 = param2.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              param0.put(this, this);
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("cf.BC(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    void c(byte param0) {
        if (param0 == 32) {
            return;
        }
        this.field_q = 74;
    }

    boolean a(int param0, int param1, int param2, cf param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.a(-88, param5, param1, param0, param6)) {
                break L1;
              } else {
                this.field_u = param2;
                break L1;
              }
            }
            if (param4 == -24) {
              stackIn_5_0 = 0;
              break L0;
            } else {
              field_p = (String) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var8);

            stackIn_8_1 = new StringBuilder().append("cf.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final static void a(int param0, boolean param1, boolean param2) {
        int var3;
        int var4;
        String var5;
        if (bk.field_i != null) {
          var3 = bk.field_i.a((byte) -58, param1);
          if ((var3 ^ -1) != 1) {
            L0: {
              if (var3 != -1) {
                var4 = bk.field_i.i(-23217) ? 1 : 0;
                ed.a(bk.field_i.h(-26895), bk.field_i.field_Fb, param0, var3, var4 != 0, 21965);
                break L0;
              } else {
                break L0;
              }
            }
            bk.field_i = null;
            q.b(80);
            if (param2) {
              return;
            } else {
              var5 = (String) null;
              cf.a((byte) -35, (String) null);
              return;
            }
          } else {
            if (param2) {
              return;
            } else {
              var5 = (String) null;
              cf.a((byte) -35, (String) null);
              return;
            }
          }
        } else {
          if (param2) {
            return;
          } else {
            var5 = (String) null;
            cf.a((byte) -35, (String) null);
            return;
          }
        }
    }

    public final String toString() {
        return this.a(7, new Hashtable(), 0, new StringBuilder()).toString();
    }

    String d(byte param0) {
        int var2 = 32 / ((53 - param0) / 57);
        if (!this.field_l) {
            return null;
        }
        return this.field_x;
    }

    final boolean a(int param0, char param1, int param2) {
        int var4;
        if (this.c(param0 ^ 126)) {
          if (!this.a(param2, param1, (cf) (this), param0 + -6208)) {
            var4 = param2;
            if ((var4 ^ -1) != -81) {
              if (param0 != 0) {
                this.f((byte) 66);
                return false;
              } else {
                return false;
              }
            } else {
              return this.a((cf) (this), param0 ^ 0);
            }
          } else {
            return true;
          }
        } else {
          var4 = param2;
          if ((var4 ^ -1) != -81) {
            if (param0 != 0) {
              this.f((byte) 66);
              return false;
            } else {
              return false;
            }
          } else {
            return this.a((cf) (this), param0 ^ 0);
          }
        }
    }

    void b(int param0, int param1, int param2, int param3, int param4) {
        this.field_n = param3;
        if (param2 != 28972) {
          field_m = (String) null;
          this.field_i = param1;
          this.field_w = param4;
          this.field_y = param0;
          return;
        } else {
          this.field_i = param1;
          this.field_w = param4;
          this.field_y = param0;
          return;
        }
    }

    protected cf() {
        this.field_z = 0;
        this.field_q = 0;
    }

    cf(String param0, nl param1, bj param2) {
        RuntimeException runtimeException = null;
        rk var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_z = 0;
        this.field_q = 0;
        try {
          L0: {
            L1: {
              this.field_j = param0;
              this.field_h = param1;
              this.field_A = param2;
              if (!(this.field_h instanceof rk)) {
                break L1;
              } else {
                var4 = (rk) ((Object) this.field_h);
                this.field_n = var4.b((cf) (this), -126);
                this.field_w = var4.a((byte) 39, (cf) (this));
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("cf.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
    }

    cf(int param0, int param1, int param2, int param3, nl param4, bj param5) {
        this.field_z = 0;
        this.field_q = 0;
        try {
            this.field_h = param4;
            this.field_A = param5;
            this.field_n = param2;
            this.field_y = param0;
            this.field_w = param3;
            this.field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "cf.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = "Lobby";
        field_p = "Unable to delete friend - system busy";
        field_v = "Click or press F10 to open Quick Chat";
        field_t = "Create an illusion of a zombie that will scare the foolish humans.";
        field_o = "Powerups with this modifier can be used on humans or enemy zombies, but can only be applied to a few - experiment with it...";
    }
}
