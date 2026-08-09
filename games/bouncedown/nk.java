/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk {
    private double field_d;
    static tg[] field_h;
    private int field_l;
    private mj field_k;
    String field_f;
    private boolean field_j;
    int field_c;
    int field_i;
    private int field_g;
    private int field_m;
    static int[] field_b;
    static sh field_a;
    static String field_e;

    private final void a(int param0, int param1, String param2, int param3, int param4) {
        try {
            if (param4 != 21641) {
                field_e = (String) null;
            }
            od.field_f.a(param2, param3 - 2, param0, 0, 0);
            od.field_f.a(param2, -1 + param3, param0, 0, 0);
            od.field_f.a(param2, param3, -1 + param0, 0, 0);
            od.field_f.a(param2, param3 + -1, param0, 0, -1);
            od.field_f.a(param2, param3, -2 + param0, 0, 0);
            od.field_f.a(param2, param3 - -2, param0, 0, -1);
            od.field_f.a(param2, param3, 2 + param0, 0, -1);
            od.field_f.a(param2, param3, param0, param1, 0);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "nk.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final int a(int param0, int param1, int param2, int param3, String param4, int param5, int param6, int param7, int param8, int param9) {
        RuntimeException var11 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              od.field_f.a(param4, -2 + param0, param5, param7, param2, 0, 0, param3, param6, param9);
              od.field_f.a(param4, param0, param5 - 2, param7, param2, 0, 0, param3, param6, param9);
              od.field_f.a(param4, -1 + param0, -1 + param5, param7, param2, 0, 0, param3, param6, param9);
              od.field_f.a(param4, param0, param5, param7, param2, 0, 0, param3, param6, param9);
              od.field_f.a(param4, 1 + param0, param5 - 1, param7, param2, 0, 0, param3, param6, param9);
              if (param8 == 20066) {
                break L1;
              } else {
                this.field_f = (String) null;
                break L1;
              }
            }
            od.field_f.a(param4, param0 - 1, param5 - -1, param7, param2, 0, 0, param3, param6, param9);
            stackIn_3_0 = od.field_f.a(param4, param0, param5, param7, param2, param1, -1, param3, param6, param9);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var11 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var11);

            stackIn_6_1 = new StringBuilder().append("nk.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          throw ii.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, byte param1, boolean param2) {
        ud dupTemp$0 = null;
        ud dupTemp$1 = null;
        ud dupTemp$2 = null;
        ud dupTemp$3 = null;
        mj stackIn_74_0 = null;
        mj stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        mj stackIn_80_0 = null;
        mj stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        int stackIn_87_0 = 0;
        int stackIn_97_0 = 0;
        pk stackIn_101_0 = null;
        pk stackIn_102_0 = null;
        be stackIn_102_1 = null;
        mj stackIn_127_0 = null;
        mj stackIn_128_0 = null;
        int stackIn_128_1 = 0;
        mj stackIn_145_0 = null;
        mj stackIn_146_0 = null;
        int stackIn_146_1 = 0;
        Throwable decompiledCaughtException = null;
        int var4 = 0;
        int var5_int = 0;
        Object var5 = null;
        int var6 = 0;
        int var8 = 0;
        var8 = Bounce.field_N;
        if (!u.field_g) {
          L0: {
            if (!param2) {
              this.field_k.field_o = false;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            L2: {
              L3: {
                var5_int = this.field_i;
                if (0 != var5_int) {
                  if (1 != var5_int) {
                    if ((var5_int ^ -1) != -3) {
                      if (-4 == (var5_int ^ -1)) {
                        if (-1 != (param0 ^ -1)) {
                          return;
                        } else {
                          L4: {
                            this.field_k.field_l = false;
                            this.field_k.field_d = true;
                            stackIn_74_0 = this.field_k;

                            if (!param2) {
                              stackIn_75_0 = (mj) ((Object) stackIn_74_0);
                              stackIn_75_1 = 0;
                              break L4;
                            } else {
                              stackIn_75_0 = (mj) ((Object) stackIn_74_0);
                              stackIn_75_1 = -1;
                              break L4;
                            }
                          }
                          stackIn_75_0.field_n = stackIn_75_1;
                          this.field_k.field_e = false;
                          break L2;
                        }
                      } else {
                        if ((var5_int ^ -1) == -5) {
                          if (-1 == (param0 ^ -1)) {
                            L5: {
                              stackIn_80_0 = this.field_k;

                              if (!param2) {
                                stackIn_81_0 = (mj) ((Object) stackIn_80_0);
                                stackIn_81_1 = 11;
                                break L5;
                              } else {
                                stackIn_81_0 = (mj) ((Object) stackIn_80_0);
                                stackIn_81_1 = -1;
                                break L5;
                              }
                            }
                            stackIn_81_0.field_n = stackIn_81_1;
                            this.field_k.field_e = true;
                            this.field_k.field_d = false;
                            this.field_k.field_l = false;
                            if (jh.b(767564065)) {
                              break L2;
                            } else {
                              pe.field_f = pe.a(3, 10, 1, -16947, 13);
                              break L2;
                            }
                          } else {
                            return;
                          }
                        } else {
                          if (-6 != (var5_int ^ -1)) {
                            if (var5_int == 6) {
                              if (param0 != 0) {
                                L6: {
                                  jd.field_a = jd.field_a + param0;
                                  if (jd.field_a < 0) {
                                    jd.field_a = 0;
                                    break L6;
                                  } else {
                                    break L6;
                                  }
                                }
                                L7: {
                                  if (-257 > (jd.field_a ^ -1)) {
                                    jd.field_a = 256;
                                    break L7;
                                  } else {
                                    break L7;
                                  }
                                }
                                ld.field_l.g(jd.field_a / 2, 100);
                                break L2;
                              } else {
                                L8: {
                                  if (rd.field_a) {
                                    stackIn_97_0 = 0;
                                    break L8;
                                  } else {
                                    stackIn_97_0 = 1;
                                    break L8;
                                  }
                                }
                                rd.field_a = stackIn_97_0 != 0;
                                var5 = jl.field_d;
                                synchronized (var5) {
                                  L9: {
                                    L10: {
                                      if (!rd.field_a) {
                                        ld.field_l.f(-22719);
                                        break L10;
                                      } else {
                                        L11: {
                                          stackIn_101_0 = ld.field_l;

                                          if (u.field_g) {
                                            stackIn_102_0 = (pk) ((Object) stackIn_101_0);
                                            stackIn_102_1 = wj.field_c;
                                            break L11;
                                          } else {
                                            stackIn_102_0 = (pk) ((Object) stackIn_101_0);
                                            stackIn_102_1 = sd.field_mb;
                                            break L11;
                                          }
                                        }
                                        ((pk) (Object) stackIn_102_0).a(stackIn_102_1, true, 123);
                                        break L10;
                                      }
                                    }
                                    jl.field_d.d();
                                    break L9;
                                  }
                                }
                                break L2;
                              }
                            } else {
                              if (7 == var5_int) {
                                if (param0 != 0) {
                                  return;
                                } else {
                                  if (sj.field_f != null) {
                                    mh.a(sj.field_f, (byte) 122);
                                    sj.field_f.a((byte) -124, ck.field_e);
                                    sj.field_f = null;
                                    ch.field_h.requestFocus();
                                    break L2;
                                  } else {
                                    mg.d(30432);
                                    if (param2) {
                                      break L2;
                                    } else {
                                      qf.field_b = 0;
                                      break L2;
                                    }
                                  }
                                }
                              } else {
                                if (var5_int != 8) {
                                  if (9 != var5_int) {
                                    L12: {
                                      if (10 == var5_int) {
                                        break L12;
                                      } else {
                                        if (12 != var5_int) {
                                          if ((var5_int ^ -1) != -14) {
                                            if ((var5_int ^ -1) == -12) {
                                              if (!param2) {
                                                L13: {
                                                  if (param0 >= 0) {
                                                    ii.field_k = ii.field_k + 1;
                                                    break L13;
                                                  } else {
                                                    ii.field_k = ii.field_k - 1;
                                                    break L13;
                                                  }
                                                }
                                                L14: {
                                                  if (-1 >= (ii.field_k ^ -1)) {
                                                    break L14;
                                                  } else {
                                                    ii.field_k = ii.field_k + 3;
                                                    break L14;
                                                  }
                                                }
                                                L15: {
                                                  this.field_k.field_o = false;
                                                  if (ii.field_k >= 3) {
                                                    ii.field_k = ii.field_k - 3;
                                                    break L15;
                                                  } else {
                                                    break L15;
                                                  }
                                                }
                                                this.field_k.field_n = this.field_m;
                                                break L2;
                                              } else {
                                                L16: {
                                                  ii.field_k = 1;
                                                  if (uc.field_C < 256) {
                                                    ii.field_k = 0;
                                                    break L16;
                                                  } else {
                                                    break L16;
                                                  }
                                                }
                                                if (uc.field_C <= 384) {
                                                  break L2;
                                                } else {
                                                  ii.field_k = 2;
                                                  break L2;
                                                }
                                              }
                                            } else {
                                              if (var5_int != 14) {
                                                break L2;
                                              } else {
                                                if (param0 != 0) {
                                                  return;
                                                } else {
                                                  tk.d(-6144);
                                                  rj.field_j = 3;
                                                  break L2;
                                                }
                                              }
                                            }
                                          } else {
                                            break L12;
                                          }
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                    L17: {
                                      if (this.field_i == 13) {
                                        if ((param0 ^ -1) <= -1) {
                                          if (param0 <= 0) {
                                            break L17;
                                          } else {
                                            qa.field_j = 235;
                                            break L17;
                                          }
                                        } else {
                                          qa.field_j = 0;
                                          break L17;
                                        }
                                      } else {
                                        break L17;
                                      }
                                    }
                                    if (param0 != 0) {
                                      return;
                                    } else {
                                      L18: {
                                        this.field_k.field_d = false;
                                        this.field_k.field_e = false;
                                        this.field_k.field_l = false;
                                        stackIn_145_0 = this.field_k;

                                        if (param2) {
                                          stackIn_146_0 = (mj) ((Object) stackIn_145_0);
                                          stackIn_146_1 = -1;
                                          break L18;
                                        } else {
                                          stackIn_146_0 = (mj) ((Object) stackIn_145_0);
                                          stackIn_146_1 = 0;
                                          break L18;
                                        }
                                      }
                                      stackIn_146_0.field_n = stackIn_146_1;
                                      break L2;
                                    }
                                  } else {
                                    if (param0 == 0) {
                                      L19: {
                                        if (null == sj.field_f) {
                                          break L19;
                                        } else {
                                          mh.a(sj.field_f, (byte) 84);
                                          sj.field_f.a((byte) -127, ck.field_e);
                                          sj.field_f = null;
                                          ch.field_h.requestFocus();
                                          break L19;
                                        }
                                      }
                                      tc.a(vi.b(0), 6091);
                                      break L2;
                                    } else {
                                      return;
                                    }
                                  }
                                } else {
                                  if (param0 != 0) {
                                    return;
                                  } else {
                                    L20: {
                                      this.field_k.field_l = true;
                                      stackIn_127_0 = this.field_k;

                                      if (!param2) {
                                        stackIn_128_0 = (mj) ((Object) stackIn_127_0);
                                        stackIn_128_1 = 0;
                                        break L20;
                                      } else {
                                        stackIn_128_0 = (mj) ((Object) stackIn_127_0);
                                        stackIn_128_1 = -1;
                                        break L20;
                                      }
                                    }
                                    stackIn_128_0.field_n = stackIn_128_1;
                                    kb.field_a = 0;
                                    this.field_k.field_d = false;
                                    this.field_k.field_e = false;
                                    break L2;
                                  }
                                }
                              }
                            }
                          } else {
                            if (param0 != 0) {
                              L21: {
                                md.field_w = md.field_w + param0;
                                if (0 <= md.field_w) {
                                  break L21;
                                } else {
                                  md.field_w = 0;
                                  break L21;
                                }
                              }
                              if (md.field_w > 256) {
                                md.field_w = 256;
                                break L2;
                              } else {
                                var4 = -114 / ((36 - param1) / 33);
                                break L1;
                              }
                            } else {
                              L22: {
                                if (wd.field_x) {
                                  stackIn_87_0 = 0;
                                  break L22;
                                } else {
                                  stackIn_87_0 = 1;
                                  break L22;
                                }
                              }
                              wd.field_x = stackIn_87_0 != 0;
                              break L2;
                            }
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                } else {
                  if (param0 == 0) {
                    nb.field_a = 0;
                    kb.field_a = 0;
                    pe.field_f = null;
                    hg.field_l = 0;
                    nb.field_e = 0;
                    kg.field_f = 0;
                    vg.field_j = 0;
                    k.field_C = 0;
                    bf.field_k = false;
                    qe.field_f = 0;
                    qf.field_c = 0;
                    ve.field_a = 0;
                    break L3;
                  } else {
                    return;
                  }
                }
              }
              if (param0 == 0) {
                L23: {
                  var4 = this.field_i + 1;
                  ne.field_w = 0;
                  this.field_k.field_b = false;
                  l.field_c = l.field_c - fa.field_c;
                  bk.field_c = var4;
                  ta.field_c = 1.0;
                  u.field_g = true;
                  vk.field_b = 1;
                  fa.field_c = 0;
                  if (!rd.field_a) {
                    break L23;
                  } else {
                    var5 = jl.field_d;
                    synchronized (var5) {
                      L24: {
                        ld.field_l.a(wj.field_c, true, 89);
                        jl.field_d.d();
                        break L24;
                      }
                    }
                    break L23;
                  }
                }
                jk.field_q = -1;
                var5_int = 0;
                L25: while (true) {
                  if (3 <= var5_int) {
                    L26: {
                      if (-3 == (var4 ^ -1)) {
                        dupTemp$0 = he.field_n[0];
                        dupTemp$0.field_u = dupTemp$0.field_u - 20.0;
                        dupTemp$1 = he.field_n[1];
                        dupTemp$1.field_u = dupTemp$1.field_u + 20.0;
                        break L26;
                      } else {
                        break L26;
                      }
                    }
                    L27: {
                      if ((var4 ^ -1) == -4) {
                        dupTemp$2 = he.field_n[0];
                        dupTemp$2.field_u = dupTemp$2.field_u - 40.0;
                        dupTemp$3 = he.field_n[1];
                        dupTemp$3.field_u = dupTemp$3.field_u + 40.0;
                        break L27;
                      } else {
                        break L27;
                      }
                    }
                    vk.field_b = var4;
                    var5_int = 0;
                    L28: while (true) {
                      if (var5_int >= ua.field_b) {
                        break L2;
                      } else {
                        L29: {
                          var6 = (int)(Math.random() * 384.0 + 64.0);
                          if (0 == var5_int) {
                            var6 = 256;
                            break L29;
                          } else {
                            break L29;
                          }
                        }
                        L30: {
                          if (var5_int == 1) {
                            var6 = 64;
                            break L30;
                          } else {
                            break L30;
                          }
                        }
                        L31: {
                          if ((var5_int ^ -1) != -3) {
                            break L31;
                          } else {
                            var6 = 448;
                            break L31;
                          }
                        }
                        L32: {
                          if (3 == var5_int) {
                            var6 = 160;
                            break L32;
                          } else {
                            break L32;
                          }
                        }
                        L33: {
                          if (4 != var5_int) {
                            break L33;
                          } else {
                            var6 = 352;
                            break L33;
                          }
                        }
                        L34: {
                          if (-6 != (var5_int ^ -1)) {
                            break L34;
                          } else {
                            var6 = 256;
                            break L34;
                          }
                        }
                        ua.field_c[var5_int].a(33, 0, (double)var6);
                        ua.field_c[var5_int].field_h = (double)(320 + var5_int * 64);
                        if (-1 == (var5_int ^ -1)) {
                          ua.field_c[var5_int].field_b = var4;
                          var5_int++;
                          continue L28;
                        } else {
                          var5_int++;
                          continue L28;
                        }
                      }
                    }
                  } else {
                    he.field_n[var5_int].a(true);
                    var5_int++;
                    continue L25;
                  }
                }
              } else {
                return;
              }
            }
            var4 = -114 / ((36 - param1) / 33);
            break L1;
          }
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        ve.a(param2, param0, ig.field_d, (byte) -87, param4, param1);
        na.a(4 + param1, param0 + param3, -8 + param4, param2 - 8, 0, 192);
    }

    private final int a(int param0, int param1, int param2, int param3, int param4, int param5, String param6, int param7, int param8, int param9) {
        RuntimeException var11 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            gk.field_e.a(param6, param8 + param2, param9, param1, param0, 0, 0, param7, param3, param4);
            gk.field_e.a(param6, param8, -1 + param9, param1, param0, 0, 0, param7, param3, param4);
            stackIn_1_0 = gk.field_e.a(param6, param8, param9, param1, param0, param5, -1, param7, param3, param4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var11 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var11);

            stackIn_4_1 = new StringBuilder().append("nk.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

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
          throw ii.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
        return stackIn_1_0;
    }

    final void a(int param0, int param1) {
        int discarded$0 = 0;
        tg discarded$1 = null;
        tg stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        tg stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        int stackIn_69_2 = 0;
        int stackIn_180_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6_int;
        String var6;
        int var7;
        String var7_ref_String;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        String[] var17;
        String var18;
        String var19;
        String var20;
        String var21;
        String var22;
        String var23;
        String var24;
        String[] var25;
        String var26;
        String var27;
        String var28;
        L0: {
          var16 = Bounce.field_N;
          if (9 > (this.field_g ^ -1)) {
            break L0;
          } else {
            if (0 > this.field_i) {
              break L0;
            } else {
              return;
            }
          }
        }
        L1: {
          if (param1 == 16741888) {
            break L1;
          } else {
            this.field_d = 0.04776527549427232;
            break L1;
          }
        }
        L2: {
          if (309 >= (this.field_g ^ -1)) {
            break L2;
          } else {
            if (0 <= this.field_i) {
              break L2;
            } else {
              return;
            }
          }
        }
        L3: {
          var3 = 1;
          if (-1 != (this.field_c ^ -1)) {
            break L3;
          } else {
            L4: {
              if (this.field_k.field_e) {
                break L4;
              } else {
                if (this.field_k.field_d) {
                  break L4;
                } else {
                  if (this.field_k.field_l) {
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
            }
            this.field_j = false;
            var3 = 0;
            break L3;
          }
        }
        L5: {
          if (this.field_c != 1) {
            break L5;
          } else {
            if (!this.field_k.field_e) {
              var3 = 0;
              this.field_j = false;
              break L5;
            } else {
              break L5;
            }
          }
        }
        L6: {
          if (this.field_c != 2) {
            break L6;
          } else {
            if (!this.field_k.field_l) {
              var3 = 0;
              this.field_j = false;
              break L6;
            } else {
              break L6;
            }
          }
        }
        L7: {
          if (this.field_c != 3) {
            break L7;
          } else {
            if (!this.field_k.field_d) {
              var3 = 0;
              this.field_j = false;
              break L7;
            } else {
              break L7;
            }
          }
        }
        L8: {
          if ((this.field_i ^ -1) != -14) {
            break L8;
          } else {
            L9: {
              if (!this.field_k.field_d) {
                mb.field_j = 0;
                qa.field_j = 0;
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              if (250 >= mb.field_j) {
                break L10;
              } else {
                qa.field_j = -qa.field_j + 235;
                mb.field_j = mb.field_j - 250;
                break L10;
              }
            }
            L11: {
              fj.field_b = (9 * fj.field_b - -qa.field_j) / 10;
              var4 = 80;
              var5 = 240;
              if (3 == ud.field_a) {
                var5 += 30;
                var4 += 40;
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              var6_int = this.field_l;
              this.field_l = -12 + (-480 + this.field_g) + 96 - -8;
              this.field_l = this.field_l + this.a(80, 16741888, 480, 1, Bounce.field_A[1], this.field_l, 0, 480, 20066, 20) * 20;
              this.field_l = this.field_l + 10;
              this.field_l = this.field_l + this.a(80, 16741888, 480, 1, Bounce.field_A[2], this.field_l, 0, 480, 20066, 20) * 20;
              this.field_l = this.field_l + this.a(80, 16741888, 480, 1, Bounce.field_A[3], this.field_l, 0, 480, 20066, 20) * 20;
              this.field_l = this.field_l + 10;
              var7 = -this.field_l + -40 + this.field_g;
              this.a(this.field_l, 80, var7, 4, 480);
              na.e(84, this.field_l - -4, 556, -4 + var7 + this.field_l);
              var8 = fj.field_b;
              this.field_l = this.field_l - var8;
              var9 = 6;
              var10 = 120 + (320 + -(kc.field_c.field_t / 2));
              this.field_l = this.field_l + 8;
              kc.field_c.a(var10, var9 + this.field_l);
              this.field_l = this.field_l + this.a(60 + (var4 - gk.field_e.b(Bounce.field_A[4]) / 2), 16741888, 480, 1, Bounce.field_A[4], this.field_l, 0, var5, param1 + -16721822, 20) * 20;
              if ((ud.field_a ^ -1) == -4) {
                this.field_l = this.field_l - 6;
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              this.field_l = this.field_l + 24;
              var11 = ae.field_f % 24;
              if (var11 <= 12) {
                a.field_f.a(var10, var9 + (this.field_l - -re.field_a.field_q + -a.field_f.field_q));
                break L13;
              } else {
                re.field_a.a(var10, var9 + this.field_l);
                break L13;
              }
            }
            L14: {
              this.field_l = this.field_l + this.a(-(gk.field_e.b(Bounce.field_A[5]) / 2) + var4 - -60, 16741888, 480, 1, Bounce.field_A[5], this.field_l, 0, var5, 20066, 20) * 20;
              this.field_l = this.field_l + 8;
              this.field_l = this.field_l + 12 * this.a(480, 480, -1, 0, 12, 16777215, Bounce.field_A[6], 1, 80, this.field_l);
              if (-4 != (ud.field_a ^ -1)) {
                break L14;
              } else {
                this.field_l = this.field_l - 6;
                break L14;
              }
            }
            L15: {
              this.field_l = this.field_l + 22;
              q.field_F.d(var10, var9 + this.field_l, (int)(128.0 + 128.0 * Math.sin((double)(ae.field_f / 4))));
              this.field_l = this.field_l + 20 * this.a(var4 - -60 + -(gk.field_e.b(Bounce.field_A[7]) / 2), 16741888, 480, 1, Bounce.field_A[7], this.field_l, 0, var5, 20066, 20);
              this.field_l = this.field_l + 8;
              this.field_l = this.field_l + this.a(480, 480, -1, 0, 12, 16777215, Bounce.field_A[8], 1, 80, this.field_l) * 12;
              if (ud.field_a != 3) {
                break L15;
              } else {
                this.field_l = this.field_l - 6;
                break L15;
              }
            }
            L16: {
              this.field_l = this.field_l + 22;
              fd.field_n[ae.field_f / 8 % 6].a(var10, var9 + this.field_l);
              this.field_l = this.field_l + 20 * this.a(57 + (var4 - gk.field_e.b(Bounce.field_A[9]) / 2), 16741888, 480, 1, Bounce.field_A[9], this.field_l, 0, var5, param1 + -16721822, 20);
              this.field_l = this.field_l + 8;
              this.field_l = this.field_l + this.a(480, 480, -1, 0, 12, 16777215, Bounce.field_A[10], 1, 80, this.field_l) * 12;
              if (ud.field_a == 3) {
                this.field_l = this.field_l + 4;
                break L16;
              } else {
                break L16;
              }
            }
            this.field_l = this.field_l + 26;
            bd.field_j[ae.field_f / 8 % 3].a(var10, this.field_l + var9);
            this.field_l = this.field_l + 20 * this.a(-(gk.field_e.b(Bounce.field_A[11]) / 2) + (60 + var4), 16741888, 480, 1, Bounce.field_A[11], this.field_l, 0, var5, 20066, 20);
            this.field_l = this.field_l + 8;
            this.field_l = this.field_l + this.a(480, 480, param1 + -16741889, 0, 12, 16777215, Bounce.field_A[12], 1, 80, this.field_l) * 12;
            this.field_l = this.field_l + 22;
            wb.field_e[ae.field_f / 8 % 3].a(var10, this.field_l + var9);
            this.field_l = this.field_l + 20 * this.a(-(gk.field_e.b(Bounce.field_A[13]) / 2) + 60 + var4, 16741888, 480, 1, Bounce.field_A[13], this.field_l, 0, var5, 20066, 20);
            this.field_l = this.field_l + 8;
            this.field_l = this.field_l + 12 * this.a(480, 480, param1 + -16741889, 0, 12, 16777215, Bounce.field_A[14], 1, 80, this.field_l);
            this.field_l = this.field_l + 22;
            field_h[ae.field_f / 8 % 4].a(var10, var9 + this.field_l);
            nl.field_d[0].a(var10, this.field_l + var9 + -nl.field_d[0].field_q);
            this.field_l = this.field_l + 20 * this.a(-(gk.field_e.b(Bounce.field_A[15]) / 2) + (var4 - -60), 16741888, 480, 1, Bounce.field_A[15], this.field_l, 0, var5, param1 ^ 16726114, 20);
            this.field_l = this.field_l + 8;
            this.field_l = this.field_l + this.a(480, 480, param1 ^ -16741889, 0, 12, 16777215, Bounce.field_A[16], 1, 80, this.field_l) * 12;
            this.field_l = this.field_l + 12 * this.a(480, 480, param1 + -16741889, 0, 12, 16777215, Bounce.field_A[17], 1, 80, this.field_l);
            na.d();
            this.field_l = var6_int;
            break L8;
          }
        }
        L17: {
          var4 = 320;
          var5 = param0;
          var18 = this.field_f;
          var6 = var18;
          var6 = var18;
          if (this.field_k.field_b) {
            L18: {
              if (!this.field_j) {
                break L18;
              } else {
                if (0 != (this.field_k.field_n ^ -1)) {
                  break L18;
                } else {
                  if (var3 != 0) {
                    var5 = 16777215;
                    break L18;
                  } else {
                    break L18;
                  }
                }
              }
            }
            L19: {
              if (this.field_m != this.field_k.field_n) {
                break L19;
              } else {
                if (var3 == 0) {
                  break L19;
                } else {
                  var5 = 16777215;
                  break L19;
                }
              }
            }
            if (this.field_i != 7) {
              break L17;
            } else {
              if (kh.a(ck.field_e, 30256)) {
                break L17;
              } else {
                var5 = 8930338;
                break L17;
              }
            }
          } else {
            break L17;
          }
        }
        L20: {
          if (0 != (this.field_i ^ -1)) {
            break L20;
          } else {
            var7 = this.field_g + -35;
            var8 = 295;
            this.a(var7, 80, var8, 4, 480);
            mf.field_b.a(320 + -(mf.field_b.field_t / 2), this.field_g + -120);
            na.e(84, var7 - -4, 556, -4 + (var7 - -var8));
            break L20;
          }
        }
        L21: {
          if (this.field_i == 1) {
            L22: {
              stackIn_68_0 = l.field_e;

              stackIn_68_1 = 20;

              if (-160 + this.field_g >= 0) {
                stackIn_69_0 = (tg) ((Object) stackIn_68_0);
                stackIn_69_1 = stackIn_68_1;
                stackIn_69_2 = 0;
                break L22;
              } else {
                stackIn_69_0 = (tg) ((Object) stackIn_68_0);
                stackIn_69_1 = stackIn_68_1;
                stackIn_69_2 = -160 + this.field_g;
                break L22;
              }
            }
            ((tg) (Object) stackIn_69_0).a(stackIn_69_1, stackIn_69_2);
            break L21;
          } else {
            break L21;
          }
        }
        L23: {
          if (-14 == (this.field_i ^ -1)) {
            mi.field_k.a(-(mi.field_k.field_t / 2) + 320, this.field_g + -470);
            break L23;
          } else {
            break L23;
          }
        }
        L24: {
          if (-1 >= (this.field_i ^ -1)) {
            break L24;
          } else {
            if (tk.field_c != this.field_i) {
              break L24;
            } else {
              var6 = Bounce.field_A[18] + var18;
              var19 = var6;
              var6 = var19;
              var5 = 16711680;
              break L24;
            }
          }
        }
        L25: {
          if (-11 != (this.field_i ^ -1)) {
            break L25;
          } else {
            if (jh.b(767564065)) {
              break L25;
            } else {
              var19 = jc.field_m;
              var6 = var19;
              var6 = var19;
              gk.field_e.a(var19, -1 + var4, -70 + this.field_g, 0, 0);
              gk.field_e.a(var19, var4, this.field_g + -1 - 70, 0, 0);
              gk.field_e.a(var19, var4, -70 + this.field_g, 16777215, -1);
              break L25;
            }
          }
        }
        L26: {
          if (7 == this.field_i) {
            if (null != sj.field_f) {
              var6 = var6 + Bounce.field_A[19];
              break L26;
            } else {
              var6 = var6 + Bounce.field_A[20];
              break L26;
            }
          } else {
            break L26;
          }
        }
        L27: {
          if ((this.field_i ^ -1) != -14) {
            break L27;
          } else {
            L28: {
              var20 = od.field_c;
              var7_ref_String = var20;
              var8 = od.field_f.b(var20);
              var9 = var4;
              if (0 == qa.field_j) {
                var7_ref_String = sg.field_b;
                var9 += 150;
                break L28;
              } else {
                var9 -= 150;
                break L28;
              }
            }
            L29: {
              var10 = var9 - var8 / 2;
              var11 = this.field_g - od.field_f.field_s - 10;
              var12 = var8;
              var13 = 8 + od.field_f.field_s;
              var14 = 16697912;
              if (var10 > uc.field_C) {
                break L29;
              } else {
                if (uc.field_C >= var10 + var12) {
                  break L29;
                } else {
                  if (var11 > ll.field_y) {
                    break L29;
                  } else {
                    if (var13 + var11 <= ll.field_y) {
                      break L29;
                    } else {
                      if (!this.field_k.field_o) {
                        break L29;
                      } else {
                        if (var3 == 0) {
                          break L29;
                        } else {
                          L30: {
                            if (n.field_m != 0) {
                              qa.field_j = -qa.field_j + 235;
                              break L30;
                            } else {
                              break L30;
                            }
                          }
                          var14 = 16777215;
                          break L29;
                        }
                      }
                    }
                  }
                }
              }
            }
            this.a(-10 + this.field_g, var14, var7_ref_String.toUpperCase(), var9, param1 ^ 16720521);
            break L27;
          }
        }
        L31: {
          if (-6 != (this.field_i ^ -1)) {
            if (-7 != (this.field_i ^ -1)) {
              L32: {
                if (this.field_i == 12) {
                  break L32;
                } else {
                  if (10 == this.field_i) {
                    break L32;
                  } else {
                    if (-14 == (this.field_i ^ -1)) {
                      break L32;
                    } else {
                      L33: {
                        if ((this.field_i ^ -1) != -5) {
                          break L33;
                        } else {
                          if ((this.field_m ^ -1) != -2) {
                            break L33;
                          } else {
                            if (var6 == bk.field_d) {
                              break L32;
                            } else {
                              break L33;
                            }
                          }
                        }
                      }
                      if (this.field_i != 14) {
                        L34: {
                          if (this.field_i != 11) {
                            break L34;
                          } else {
                            if (!jh.b(767564065)) {
                              var7 = od.field_f.b(of.field_d[1]);
                              var8 = 0;
                              L35: while (true) {
                                if (var8 >= 3) {
                                  break L31;
                                } else {
                                  L36: {
                                    var4 = 320 + (48 + var7) * (var8 - 1);
                                    var26 = of.field_d[var8];
                                    var9 = var4 - (var7 / 2 - -5);
                                    var10 = this.field_g - (od.field_f.field_s + 10);
                                    var11 = var7 + 10;
                                    var12 = od.field_f.field_s;
                                    var13 = param0;
                                    if ((ii.field_k ^ -1) == (var8 ^ -1)) {
                                      var13 = 16729088;
                                      break L36;
                                    } else {
                                      break L36;
                                    }
                                  }
                                  L37: {
                                    var5 = 16741888;
                                    if (var9 > uc.field_C) {
                                      break L37;
                                    } else {
                                      if (var11 + var9 <= uc.field_C) {
                                        break L37;
                                      } else {
                                        if (ll.field_y < var10) {
                                          break L37;
                                        } else {
                                          if (ll.field_y >= var10 + var12) {
                                            break L37;
                                          } else {
                                            if (!this.field_k.field_o) {
                                              break L37;
                                            } else {
                                              if (var3 != 0) {
                                                L38: {
                                                  this.field_j = true;
                                                  this.field_k.field_n = this.field_m;
                                                  if (var13 == 16729088) {
                                                    var13 = 16746632;
                                                    break L38;
                                                  } else {
                                                    var13 = 16777096;
                                                    break L38;
                                                  }
                                                }
                                                if (n.field_m != 0) {
                                                  break L37;
                                                } else {
                                                  break L37;
                                                }
                                              } else {
                                                break L37;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L39: {
                                    if (ii.field_k != var8) {
                                      break L39;
                                    } else {
                                      var5 = 16768544;
                                      break L39;
                                    }
                                  }
                                  L40: {
                                    L41: {
                                      if (!this.field_k.field_o) {
                                        break L41;
                                      } else {
                                        if (this.field_k.field_n != this.field_m) {
                                          break L41;
                                        } else {
                                          L42: {
                                            if (var13 == 16777096) {
                                              break L42;
                                            } else {
                                              if (var13 != 16746632) {
                                                break L40;
                                              } else {
                                                break L42;
                                              }
                                            }
                                          }
                                          var5 = 16777215;
                                          break L40;
                                        }
                                      }
                                    }
                                    if (this.field_k.field_n != this.field_m) {
                                      break L40;
                                    } else {
                                      L43: {
                                        if (var13 == 16729088) {
                                          break L43;
                                        } else {
                                          if (16746632 != var13) {
                                            break L40;
                                          } else {
                                            break L43;
                                          }
                                        }
                                      }
                                      var5 = 16777215;
                                      break L40;
                                    }
                                  }
                                  this.a(-10 + this.field_g, var5, var26.toUpperCase(), var4, 21641);
                                  var8++;
                                  continue L35;
                                }
                              }
                            } else {
                              break L34;
                            }
                          }
                        }
                        if (0 <= this.field_i) {
                          this.a(this.field_g, var5, var6, var4, 21641);
                          break L31;
                        } else {
                          L44: {
                            var17 = di.a(-108, ',', var6);
                            var25 = var17;
                            if (-3 <= (var17.length ^ -1)) {
                              discarded$0 = this.a(140, var5, 480, 1, var6, this.field_g - 75, 0, 360, 20066, 20);
                              break L44;
                            } else {
                              L45: {
                                if (-16741889 != (var5 ^ -1)) {
                                  break L45;
                                } else {
                                  if (-1 != (this.field_i & 1 ^ -1)) {
                                    break L45;
                                  } else {
                                    var5 = 7785983;
                                    break L45;
                                  }
                                }
                              }
                              L46: {
                                if ((var17[0].length() ^ -1) >= -5) {
                                  od.field_f.c(var25[0], var4 + -136, -4 + this.field_g, 0, 0);
                                  od.field_f.c(var25[0], var4 - 135, this.field_g - 1 - 4, 0, 0);
                                  od.field_f.c(var25[0], -135 + var4, this.field_g - 4, var5, -1);
                                  od.field_f.b(var25[1], -1 + (var4 + -125), -4 + this.field_g, 0, 0);
                                  od.field_f.b(var25[1], -125 + var4, -4 + (-1 + this.field_g), 0, 0);
                                  od.field_f.b(var25[1], var4 - 125, this.field_g + -4, var5, -1);
                                  break L46;
                                } else {
                                  od.field_f.c(var17[0], -135 + (var4 - 1), -4 + this.field_g, 0, 0);
                                  od.field_f.c(var17[0], var4 - 135, this.field_g + -1 - 4, 0, 0);
                                  od.field_f.c(var17[0], var4 - 135, this.field_g + -4, var5, -1);
                                  od.field_f.b(var17[1], var4 - 125 + -1, -4 + this.field_g, 0, 0);
                                  od.field_f.b(var17[1], -125 + var4, this.field_g - 5, 0, 0);
                                  od.field_f.b(var17[1], -125 + var4, this.field_g - 4, var5, -1);
                                  break L46;
                                }
                              }
                              od.field_f.b(var25[2], 75 + var4 + -1, -4 + this.field_g, 0, 0);
                              od.field_f.b(var25[2], 75 + var4, -4 + (-1 + this.field_g), 0, 0);
                              od.field_f.b(var25[2], var4 + 75, this.field_g + -4, var5, -1);
                              break L44;
                            }
                          }
                          if (this.field_i != -10) {
                            break L31;
                          } else {
                            na.d();
                            break L31;
                          }
                        }
                      } else {
                        break L32;
                      }
                    }
                  }
                }
              }
              L47: {
                var7 = od.field_f.b(var6);
                var8 = -(var7 / 2) + var4;
                var9 = -od.field_f.field_s + this.field_g + -10;
                var10 = var7;
                var11 = 8 + od.field_f.field_s;
                if (uc.field_C < var8) {
                  break L47;
                } else {
                  if (uc.field_C >= var8 - -var10) {
                    break L47;
                  } else {
                    if (ll.field_y < var9) {
                      break L47;
                    } else {
                      if (var11 + var9 <= ll.field_y) {
                        break L47;
                      } else {
                        if (!this.field_k.field_o) {
                          break L47;
                        } else {
                          if (var3 == 0) {
                            break L47;
                          } else {
                            this.field_k.field_n = this.field_m;
                            this.field_j = true;
                            if (n.field_m == 0) {
                              break L47;
                            } else {
                              break L47;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              this.a(this.field_g + -10, var5, var6.toUpperCase(), var4, 21641);
              break L31;
            } else {
              L48: {
                if (rd.field_a) {
                  break L48;
                } else {
                  if (param0 == var5) {
                    var5 = 8930338;
                    break L48;
                  } else {
                    break L48;
                  }
                }
              }
              this.a(this.field_g, var5, var6, var4 - od.field_f.b(var6) / 2 - 35, 21641);
              var23 = "----------------";
              var6 = var23;
              this.a(2 + this.field_g, var5, var6, -35 + (od.field_f.b(var23) / 2 + var4), 21641);
              var24 = "l";
              var6 = var24;
              var7 = jd.field_a / 2 + var4;
              this.a(this.field_g, var5, var6, var7 - -(od.field_f.b(var24) / 2) + -35, param1 + -16720247);
              break L31;
            }
          } else {
            L49: {
              if (wd.field_x) {
                break L49;
              } else {
                if (param0 != var5) {
                  break L49;
                } else {
                  var5 = 8930338;
                  break L49;
                }
              }
            }
            this.a(this.field_g, var5, var6, -35 + (var4 + -(od.field_f.b(var6) / 2)), 21641);
            var21 = "----------------";
            var6 = var21;
            this.a(this.field_g - -2, var5, var6, od.field_f.b(var21) / 2 + (var4 + -35), 21641);
            var22 = "l";
            var6 = var22;
            var7 = md.field_w / 2 + var4;
            this.a(this.field_g, var5, var6, -35 + var7 + od.field_f.b(var22) / 2, param1 + -16720247);
            break L31;
          }
        }
        L50: {
          if (12 != this.field_i) {
            break L50;
          } else {
            L51: {
              ej.field_a.a(-(ej.field_a.field_t / 2) + 320, -430 + this.field_g);
              discarded$1 = new tg(32, 32);
              fa.field_b = -1;
              var7 = 140;
              var7 = 144;
              var8 = this.field_g + -318;
              if (0 < kb.field_a) {
                stackIn_180_0 = kb.field_a;
                break L51;
              } else {
                if (!jh.b(767564065)) {
                  stackIn_180_0 = ui.field_g;
                  break L51;
                } else {
                  stackIn_180_0 = 0;
                  break L51;
                }
              }
            }
            L52: {
              L53: {
                var9 = stackIn_180_0;
                var8 -= 24;
                if (vh.a(0, (byte) 88)) {
                  break L53;
                } else {
                  if (-1 <= (var9 & 512 ^ -1)) {
                    this.a(-6 + (var8 - 4), -4 + var7 + -6, 53, 4, 373);
                    break L52;
                  } else {
                    break L53;
                  }
                }
              }
              var7 -= 20;
              this.a(-6 + var8 - 4, -6 + (var7 - 4), 53, 4, 413);
              break L52;
            }
            L54: {
              var10 = -od.field_f.field_s + (-228 + this.field_g);
              this.a(var10 + -5, 75, 3 * od.field_f.field_s + 138, 4, 490);
              if ((kb.field_a ^ -1) >= -1) {
                var28 = Bounce.field_A[25];
                this.a(-272 + this.field_g, 16777215, var28, 320, 21641);
                break L54;
              } else {
                var27 = Bounce.field_A[24];
                this.a(-44 + this.field_g + -228, 16777215, var27, 320, 21641);
                break L54;
              }
            }
            var10 = 1;
            var11 = 0;
            L55: while (true) {
              if (lj.field_b.length <= var11) {
                if (var10 != 0) {
                  L56: {
                    var11 = -228 + this.field_g;
                    var11 = var11 + od.field_f.field_s;
                    if (ud.field_a == 0) {
                      this.a(var11, 16741888, pd.field_b, 320, param1 ^ 16720521);
                      break L56;
                    } else {
                      od.field_f.a(pd.field_b, 128, var11, 384, 256, 16741888, -1, 1, 0, 20);
                      break L56;
                    }
                  }
                  if (jh.b(767564065)) {
                    var11 += 40;
                    break L50;
                  } else {
                    break L50;
                  }
                } else {
                  break L50;
                }
              } else {
                L57: {
                  var12 = 1;
                  if ((var11 ^ -1) != -10) {
                    break L57;
                  } else {
                    if ((var9 & 1 << var11) != 0) {
                      break L57;
                    } else {
                      if (vh.a(0, (byte) 88)) {
                        break L57;
                      } else {
                        var12 = 0;
                        break L57;
                      }
                    }
                  }
                }
                if (var12 != 0) {
                  L58: {
                    var13 = 0;
                    if (var7 > uc.field_C) {
                      break L58;
                    } else {
                      if (uc.field_C > var7 - -32) {
                        break L58;
                      } else {
                        if (var8 > ll.field_y) {
                          break L58;
                        } else {
                          if (ll.field_y > var8 - -32) {
                            break L58;
                          } else {
                            fa.field_b = var11;
                            var13 = 2;
                            break L58;
                          }
                        }
                      }
                    }
                  }
                  L59: {
                    if (ua.field_a != var11) {
                      break L59;
                    } else {
                      var13 = 2;
                      na.b(var7 - -16, 16 + var8, 20, 0);
                      na.b(16 + var7, 16 + var8, 18, 16741888);
                      na.b(16 + var7, var8 + 16, 16, 0);
                      break L59;
                    }
                  }
                  L60: {
                    if ((var9 & 1 << var11) == 0) {
                      if (-1 <= (kb.field_a ^ -1)) {
                        cf.field_c.a(-var13 + var7, -var13 + var8, 32 + var13 * 2, var13 * 2 + 32);
                        break L60;
                      } else {
                        var11++;
                        continue L55;
                      }
                    } else {
                      ug.field_h[var11].a(var7 - var13, -var13 + var8, 32 - -(var13 * 2), 2 * var13 + 32);
                      break L60;
                    }
                  }
                  L61: {
                    if (var11 == ua.field_a) {
                      break L61;
                    } else {
                      if (uc.field_C >= var7) {
                        if (uc.field_C <= 32 + var7) {
                          if (var8 <= ll.field_y) {
                            if (ll.field_y <= var8 - -32) {
                              if (-1 == ua.field_a) {
                                break L61;
                              } else {
                                var7 += 40;
                                var11++;
                                continue L55;
                              }
                            } else {
                              var7 += 40;
                              var11++;
                              continue L55;
                            }
                          } else {
                            var7 += 40;
                            var11++;
                            continue L55;
                          }
                        } else {
                          var7 += 40;
                          var11++;
                          continue L55;
                        }
                      } else {
                        var7 += 40;
                        var11++;
                        continue L55;
                      }
                    }
                  }
                  L62: {
                    this.a(-228 + this.field_g, 16741888, lj.field_b[var11], 400, 21641);
                    var10 = 0;
                    if ((1 << var11 & var9) != 0) {
                      this.a(od.field_f.field_s + this.field_g - 228, 16741888, oh.field_f, 400, 21641);
                      break L62;
                    } else {
                      this.a(od.field_f.field_s + (-228 + this.field_g), 16711680, b.field_c, 400, 21641);
                      break L62;
                    }
                  }
                  L63: {
                    var14 = this.field_g + (-228 - -(4 * od.field_f.field_s / 2));
                    if ((var9 & 1 << var11) == 0) {
                      cf.field_c.a(112, -36 + (1 + var14));
                      break L63;
                    } else {
                      ug.field_h[var11].a(112, 1 + (var14 + -36));
                      break L63;
                    }
                  }
                  L64: {
                    var15 = 0;
                    if (-4 != (ud.field_a ^ -1)) {
                      break L64;
                    } else {
                      var15 += 20;
                      break L64;
                    }
                  }
                  var14 = var14 + 20 * this.a(240 + -var15 + 30, 8840959, 480, 1, bb.field_a[var11], var14, 0, -300 + (560 + var15 * 2), 20066, 20);
                  var14 += 10;
                  var14 = var14 + this.a(270, 8840959, 480, 1, jf.a(jf.field_g, new String[]{Integer.toString(bf.field_j[var11])}, (byte) -126), var14, 0, 260, 20066, 20) * 20;
                  var14 = var14 + this.a(270, 8840959, 480, 1, jf.a(ha.field_m, new String[]{Integer.toString(jg.field_A[var11])}, (byte) -126), var14, 0, 260, 20066, 20) * 20;
                  var7 += 40;
                  var11++;
                  continue L55;
                } else {
                  var11++;
                  continue L55;
                }
              }
            }
          }
        }
    }

    final boolean a(boolean param0, byte param1) {
        int stackIn_29_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_68_1 = 0;
        int stackIn_73_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_74_1 = 0;
        Object stackIn_77_0 = null;
        Object stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        int stackIn_81_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_82_1 = 0;
        Object stackIn_85_0 = null;
        Object stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        int stackIn_93_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        L0: {
          var3 = od.field_f.b(this.field_f) - -32;
          if (this.field_i != 11) {
            break L0;
          } else {
            var3 = 512;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_i == 5) {
              break L2;
            } else {
              if ((this.field_i ^ -1) != -7) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          var3 = 270;
          break L1;
        }
        L3: {
          var4 = this.field_l;
          if (!param0) {
            var4 = -40;
            if (this.field_i < 0) {
              var4 -= 320;
              break L3;
            } else {
              break L3;
            }
          } else {
            break L3;
          }
        }
        L4: {
          if (var4 > this.field_g) {
            this.field_d = this.field_d + 2.0;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (this.field_g <= var4) {
            break L5;
          } else {
            this.field_d = this.field_d - 2.0;
            break L5;
          }
        }
        L6: {
          this.field_d = 9.0 * this.field_d / 10.0;
          if (0.5 > Math.abs(this.field_d)) {
            this.field_d = 0.0;
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          if (param1 == -72) {
            break L7;
          } else {
            field_b = (int[]) null;
            break L7;
          }
        }
        L8: {
          if (0.0 <= this.field_d) {
            break L8;
          } else {
            this.field_d = this.field_d + 0.5;
            break L8;
          }
        }
        L9: {
          if (0.0 >= this.field_d) {
            break L9;
          } else {
            this.field_d = this.field_d - 0.5;
            break L9;
          }
        }
        this.field_g = (int)((double)this.field_g + this.field_d);
        if (param0) {
          L10: {
            if (-1 >= (this.field_i ^ -1)) {
              L11: {
                if (!this.field_k.field_o) {
                  break L11;
                } else {
                  if (n.field_m == 0) {
                    this.field_j = false;
                    break L11;
                  } else {
                    break L11;
                  }
                }
              }
              if (uc.field_C <= 320 + -(var3 / 2)) {
                break L10;
              } else {
                if (uc.field_C >= 320 - -(var3 / 2)) {
                  break L10;
                } else {
                  if (-od.field_f.field_s + this.field_g >= ll.field_y) {
                    break L10;
                  } else {
                    if (this.field_g <= ll.field_y) {
                      break L10;
                    } else {
                      if (n.field_m != 0) {
                        break L10;
                      } else {
                        if (this.field_k.field_o) {
                          this.field_k.field_n = this.field_m;
                          this.field_j = true;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              break L10;
            }
          }
          L12: {
            L13: {
              if (12 == this.field_i) {
                break L13;
              } else {
                if (this.field_i == 10) {
                  break L13;
                } else {
                  if ((this.field_i ^ -1) == -14) {
                    break L13;
                  } else {
                    break L12;
                  }
                }
              }
            }
            var5 = od.field_f.b(this.field_f);
            var6 = 320 - var5 / 2;
            var7 = this.field_g - od.field_f.field_s;
            var8 = var5;
            var9 = od.field_f.field_s;
            if (var6 > uc.field_C) {
              break L12;
            } else {
              if (uc.field_C >= var6 - -var8) {
                break L12;
              } else {
                if (ll.field_y < var7) {
                  break L12;
                } else {
                  if (ll.field_y >= var7 + var9) {
                    break L12;
                  } else {
                    if (!this.field_k.field_o) {
                      break L12;
                    } else {
                      if (n.field_m != 0) {
                        break L12;
                      } else {
                        this.field_j = true;
                        this.field_k.field_n = this.field_m;
                        break L12;
                      }
                    }
                  }
                }
              }
            }
          }
          L14: {
            if (!param0) {
              break L14;
            } else {
              if (this.field_j) {
                L15: {
                  if ((this.field_i ^ -1) == -6) {
                    break L15;
                  } else {
                    if (-7 != (this.field_i ^ -1)) {
                      if (vh.field_e == 1) {
                        this.a(0, (byte) 114, true);
                        break L14;
                      } else {
                        break L14;
                      }
                    } else {
                      break L15;
                    }
                  }
                }
                if (n.field_m != 1) {
                  break L14;
                } else {
                  L16: {
                    L17: {
                      L18: {
                        stackIn_65_0 = 0;

                        if (this.field_i == 5) {
                          stackIn_67_0 = stackIn_65_0;
                          stackIn_66_0 = stackIn_67_0;
                          if (wd.field_x) {
                            break L17;
                          } else {
                            break L18;
                          }
                        } else {
                          stackIn_66_0 = stackIn_65_0;

                          if (!rd.field_a) {
                            break L18;
                          } else {
                            stackIn_67_0 = stackIn_65_0;
                            break L17;
                          }
                        }
                      }
                      stackIn_68_0 = stackIn_66_0;
                      stackIn_68_1 = 1;
                      break L16;
                    }
                    stackIn_68_0 = stackIn_67_0;
                    stackIn_68_1 = 0;
                    break L16;
                  }
                  L19: {
                    if (stackIn_68_0 != stackIn_68_1) {
                      this.a(0, (byte) 104, true);
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  L20: {
                    stackIn_73_0 = -320 + (uc.field_C + 33);

                    if (-6 != (this.field_i ^ -1)) {
                      stackIn_74_0 = stackIn_73_0;
                      stackIn_74_1 = jd.field_a;
                      break L20;
                    } else {
                      stackIn_74_0 = stackIn_73_0;
                      stackIn_74_1 = md.field_w;
                      break L20;
                    }
                  }
                  L21: {
                    if (stackIn_74_0 >= stackIn_74_1 / 2) {
                      break L21;
                    } else {
                      L22: {
                        stackIn_77_0 = this;

                        if ((this.field_i ^ -1) == -6) {
                          stackIn_78_0 = this;
                          stackIn_78_1 = md.field_w;
                          break L22;
                        } else {
                          stackIn_78_0 = this;
                          stackIn_78_1 = jd.field_a;
                          break L22;
                        }
                      }
                      this.a(-(stackIn_78_1 / 2) + (35 + uc.field_C) + -322, (byte) -51, true);
                      break L21;
                    }
                  }
                  L23: {
                    stackIn_81_0 = uc.field_C - 320 - -33;

                    if ((this.field_i ^ -1) != -6) {
                      stackIn_82_0 = stackIn_81_0;
                      stackIn_82_1 = jd.field_a;
                      break L23;
                    } else {
                      stackIn_82_0 = stackIn_81_0;
                      stackIn_82_1 = md.field_w;
                      break L23;
                    }
                  }
                  if (stackIn_82_0 <= stackIn_82_1 / 2) {
                    break L14;
                  } else {
                    L24: {
                      stackIn_85_0 = this;

                      if (this.field_i == 5) {
                        stackIn_86_0 = this;
                        stackIn_86_1 = md.field_w;
                        break L24;
                      } else {
                        stackIn_86_0 = this;
                        stackIn_86_1 = jd.field_a;
                        break L24;
                      }
                    }
                    this.a(-(stackIn_86_1 / 2) + (2 + (-320 + uc.field_C)) + 35, (byte) 84, true);
                    break L14;
                  }
                }
              } else {
                break L14;
              }
            }
          }
          L25: {
            if ((this.field_g ^ -1) >= 9) {
              stackIn_93_0 = 0;
              break L25;
            } else {
              stackIn_93_0 = 1;
              break L25;
            }
          }
          return stackIn_93_0 != 0;
        } else {
          L26: {
            if (-10 >= this.field_g) {
              stackIn_29_0 = 0;
              break L26;
            } else {
              stackIn_29_0 = 1;
              break L26;
            }
          }
          return stackIn_29_0 != 0;
        }
    }

    public static void a(int param0) {
        if (param0 >= -68) {
            return;
        }
        field_b = null;
        field_a = null;
        field_h = null;
        field_e = null;
    }

    nk(int param0, int param1, String param2, int param3, mj param4) {
        try {
            this.field_k = param4;
            this.field_i = param3;
            this.field_f = param2;
            param1 += 128;
            this.field_g = -100;
            this.field_l = param1;
            this.field_d = (double)(-(480 + -param1)) / 10.0;
            this.field_m = param0;
            this.field_j = false;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "nk.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = new int[8192];
        field_e = "Suggested names: ";
    }
}
