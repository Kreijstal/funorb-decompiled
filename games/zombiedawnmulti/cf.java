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
        RuntimeException var1_ref = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              dc.field_Fb = 0;
              fn.field_d = 0;
              ta.field_ob = null;
              ro.field_M.e(param0 ^ 22926);
              jf.field_d.e(-30986);
              if (param0 == -8328) {
                break L1;
              } else {
                field_o = (String) null;
                break L1;
              }
            }
            var1 = ol.field_o.a((byte) 7);
            L2: while (true) {
              L3: {
                if (var1 == null) {
                  var1 = bh.field_f.a((byte) 7);
                  break L3;
                } else {
                  var1.a(-4564);
                  var1 = ol.field_o.c((byte) 112);
                  if (var2 != 0) {
                    break L3;
                  } else {
                    if (var2 == 0) {
                      continue L2;
                    } else {
                      var1 = bh.field_f.a((byte) 7);
                      break L3;
                    }
                  }
                }
              }
              L4: while (true) {
                L5: {
                  L6: {
                    if (var1 == null) {
                      break L6;
                    } else {
                      var1.a(param0 ^ 12628);
                      var1 = bh.field_f.c((byte) 104);
                      if (var2 != 0) {
                        break L5;
                      } else {
                        if (var2 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  ge.field_zb = 0;
                  break L5;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1_ref), "cf.RB(" + param0 + ')');
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
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_5_0 = null;
        StringBuilder stackOut_3_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
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
              stackOut_5_0 = (StringBuilder) (param3);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_3_0 = (StringBuilder) null;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var5);
            stackOut_7_1 = new StringBuilder().append("cf.GA(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
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
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
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
            var8_int = -62 / ((param0 - 48) / 37);
            stackOut_0_0 = 0;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var8);
            stackOut_2_1 = new StringBuilder().append("cf.DB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param6 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0 != 0;
    }

    final boolean a(int param0, byte param1, int param2, boolean param3) {
        boolean discarded$1 = false;
        int var5 = 0;
        int var7 = 0;
        ua var8 = null;
        ua var9 = null;
        ua var10 = null;
        ua var11 = null;
        ua var12 = null;
        ua var13 = null;
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
                    discarded$1 = this.a((byte) -111, t.field_d, bo.field_d, param0, param2, bd.field_g, (cf) (this));
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
        int discarded$0 = 0;
        if (param0 <= 123) {
            discarded$0 = this.f((byte) -51);
            return false;
        }
        return false;
    }

    final void a(int param0, StringBuilder param1, byte param2, Hashtable param3) {
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        StringBuilder discarded$12 = null;
        StringBuilder discarded$13 = null;
        StringBuilder discarded$14 = null;
        StringBuilder discarded$15 = null;
        RuntimeException var5 = null;
        int var6 = 0;
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
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              discarded$8 = param1.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_y).append(",").append(this.field_i).append(" ").append(this.field_n).append("x").append(this.field_w);
              if (this.field_j == null) {
                break L1;
              } else {
                discarded$9 = param1.append(" text=\"").append(this.field_j).append('"');
                break L1;
              }
            }
            L2: {
              if (this.field_l) {
                discarded$10 = param1.append(" mouseover");
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!this.c(param2 + 98)) {
                break L3;
              } else {
                discarded$11 = param1.append(" focused");
                break L3;
              }
            }
            L4: {
              if (this.field_h != null) {
                L5: {
                  discarded$12 = param1.append(" renderer=");
                  if (this.field_h instanceof cf) {
                    break L5;
                  } else {
                    discarded$13 = param1.append(this.field_h);
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
                    discarded$14 = param1.append(" listener=");
                    if (this.field_A instanceof cf) {
                      break L7;
                    } else {
                      discarded$15 = param1.append(this.field_A);
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
            stackOut_23_0 = (RuntimeException) (var5);
            stackOut_23_1 = new StringBuilder().append("cf.EC(").append(param0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          L9: {
            stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param2).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param3 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L9;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L9;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
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
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param1 == 0) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
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
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("cf.S(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
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
        boolean discarded$2 = false;
        cf var3 = null;
        if (param0 != 44) {
          var3 = (cf) null;
          discarded$2 = this.a(-73, 92, -41, (cf) null, 104, -40, -53);
          return 0;
        } else {
          return 0;
        }
    }

    boolean a(int param0, char param1, cf param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
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
            if (param3 == -6208) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var5);
            stackOut_5_1 = new StringBuilder().append("cf.CA(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
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
        int var6 = 0;
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
        RuntimeException var5 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (param0 == -5407) {
              L1: {
                var5_int = this.a(param0 ^ 5437, param2, bd.field_g, bo.field_d, param3) ? 1 : 0;
                if ((this.field_l ? 1 : 0) != var5_int) {
                  L2: {
                    stackOut_4_0 = this;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (var5_int == 0) {
                      stackOut_6_0 = this;
                      stackOut_6_1 = 0;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      break L2;
                    } else {
                      stackOut_5_0 = this;
                      stackOut_5_1 = 1;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
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
            stackOut_11_0 = (RuntimeException) (var5);
            stackOut_11_1 = new StringBuilder().append("cf.T(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
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
        StringBuilder discarded$4 = null;
        Object discarded$5 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
            var5_int = 0 / ((param1 - 61) / 45);
            if (param0.containsKey(this)) {
              discarded$4 = param2.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              discarded$5 = param0.put(this, this);
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var5);
            stackOut_5_1 = new StringBuilder().append("cf.BC(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
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
          L2: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ')');
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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
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
              if (!this.a(-88, param5, param1, param0, param6)) {
                break L1;
              } else {
                this.field_u = param2;
                break L1;
              }
            }
            if (param4 == -24) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
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
            stackOut_6_0 = (RuntimeException) (var8);
            stackOut_6_1 = new StringBuilder().append("cf.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
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
          throw fa.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final static void a(int param0, boolean param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
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
        int discarded$4 = 0;
        int discarded$5 = 0;
        int var4 = 0;
        if (this.c(param0 ^ 126)) {
          if (!this.a(param2, param1, (cf) (this), param0 + -6208)) {
            var4 = param2;
            if ((var4 ^ -1) != -81) {
              if (param0 != 0) {
                discarded$4 = this.f((byte) 66);
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
              discarded$5 = this.f((byte) 66);
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
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
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
            stackOut_4_0 = (RuntimeException) (runtimeException);
            stackOut_4_1 = new StringBuilder().append("cf.<init>(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
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
