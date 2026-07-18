/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce extends br {
    int field_t;
    static String field_o;
    private int field_j;
    private ja field_f;
    private lq field_p;
    private int field_n;
    int field_s;
    static int field_k;
    private int field_h;
    static String[] field_g;
    private fh field_i;
    int field_l;
    static int field_r;
    int field_q;
    int field_m;

    final void a(fh param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        nm var6_ref_nm = null;
        int var7_int = 0;
        th var7 = null;
        lk var7_ref = null;
        br var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object stackIn_15_0 = null;
        Object stackIn_24_0 = null;
        boolean stackIn_30_0 = false;
        int stackIn_37_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_14_0 = null;
        Object stackOut_23_0 = null;
        boolean stackOut_29_0 = false;
        int stackOut_36_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              ((ce) this).field_i = param0;
              var3_int = 0 % ((59 - param1) / 56);
              ((ce) this).field_n = 2 * ip.field_f + (((ce) this).field_t - 1);
              ((ce) this).field_h = 2 * ip.field_f + ((ce) this).field_m + -1;
              if (~((ce) this).field_i.field_i.field_e >= ~((ce) this).field_n) {
                ((ce) this).field_n = -1 + ((ce) this).field_i.field_i.field_e;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((ce) this).field_h < ((ce) this).field_i.field_i.field_d) {
                break L2;
              } else {
                ((ce) this).field_h = -1 + ((ce) this).field_i.field_i.field_d;
                break L2;
              }
            }
            L3: {
              L4: {
                ((ce) this).field_j = 0;
                if (!o.field_j) {
                  break L4;
                } else {
                  L5: {
                    ((ce) this).field_p = new lq();
                    if (((ce) this).field_q == 1) {
                      break L5;
                    } else {
                      var4 = 48 * ip.field_f;
                      var5 = ip.field_f * 48;
                      ((ce) this).field_f = new ja(var4, var5);
                      var6 = ((ce) this).field_t;
                      L6: while (true) {
                        L7: {
                          L8: {
                            if (((ce) this).field_n < var6) {
                              break L8;
                            } else {
                              stackOut_14_0 = this;
                              stackIn_24_0 = stackOut_14_0;
                              stackIn_15_0 = stackOut_14_0;
                              if (var11 != 0) {
                                break L7;
                              } else {
                                var7_int = ((ce) this).field_m;
                                L9: while (true) {
                                  L10: {
                                    L11: {
                                      if (((ce) this).field_h < var7_int) {
                                        break L11;
                                      } else {
                                        ((ce) this).field_i.field_k[var6][var7_int] = false;
                                        var7_int++;
                                        if (var11 != 0) {
                                          break L10;
                                        } else {
                                          if (var11 == 0) {
                                            continue L9;
                                          } else {
                                            break L11;
                                          }
                                        }
                                      }
                                    }
                                    var6++;
                                    break L10;
                                  }
                                  if (var11 == 0) {
                                    continue L6;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_23_0 = this;
                          stackIn_24_0 = stackOut_23_0;
                          break L7;
                        }
                        L12: {
                          g.c(((ce) this).field_f);
                          var6_ref_nm = new nm(((ce) this).field_i.field_r, ((ce) this).field_i.field_c);
                          var6_ref_nm.field_g = 240 + ((ce) this).field_t * 24;
                          var6_ref_nm.field_k = ((ce) this).field_m * 24 + 320;
                          ((ce) this).field_i.a((byte) -12, var6_ref_nm);
                          if (0 != ((ce) this).field_q) {
                            break L12;
                          } else {
                            oo.b();
                            break L12;
                          }
                        }
                        ((ce) this).field_i.a(1, false, var6_ref_nm, -1);
                        var7 = fb.field_e.field_H;
                        var8 = var7.c(46);
                        L13: while (true) {
                          L14: {
                            L15: {
                              if (null == var8) {
                                break L15;
                              } else {
                                stackOut_29_0 = var8 instanceof fd;
                                stackIn_37_0 = stackOut_29_0 ? 1 : 0;
                                stackIn_30_0 = stackOut_29_0;
                                if (var11 != 0) {
                                  break L14;
                                } else {
                                  L16: {
                                    if (stackIn_30_0) {
                                      ((id) (Object) var8).a(-10136, var6_ref_nm);
                                      break L16;
                                    } else {
                                      break L16;
                                    }
                                  }
                                  var8 = var7.b(6);
                                  if (var11 == 0) {
                                    continue L13;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                            }
                            ((ce) this).field_i.a(2, false, var6_ref_nm, -1);
                            g.d();
                            stackOut_36_0 = ((ce) this).field_t;
                            stackIn_37_0 = stackOut_36_0;
                            break L14;
                          }
                          var9 = stackIn_37_0;
                          L17: while (true) {
                            L18: {
                              if (((ce) this).field_n < var9) {
                                break L18;
                              } else {
                                if (var11 != 0) {
                                  break L4;
                                } else {
                                  var10 = ((ce) this).field_m;
                                  L19: while (true) {
                                    L20: {
                                      L21: {
                                        if (~var10 < ~((ce) this).field_h) {
                                          break L21;
                                        } else {
                                          ((ce) this).field_i.field_k[var9][var10] = true;
                                          var10++;
                                          if (var11 != 0) {
                                            break L20;
                                          } else {
                                            if (var11 == 0) {
                                              continue L19;
                                            } else {
                                              break L21;
                                            }
                                          }
                                        }
                                      }
                                      var9++;
                                      break L20;
                                    }
                                    if (var11 == 0) {
                                      continue L17;
                                    } else {
                                      break L18;
                                    }
                                  }
                                }
                              }
                            }
                            if (var11 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                    }
                  }
                  var4 = ((ce) this).field_t;
                  L22: while (true) {
                    stackOut_50_0 = ((ce) this).field_n;
                    stackOut_50_1 = var4;
                    stackIn_51_0 = stackOut_50_0;
                    stackIn_51_1 = stackOut_50_1;
                    L23: while (true) {
                      if (stackIn_51_0 < stackIn_51_1) {
                        break L4;
                      } else {
                        if (var11 != 0) {
                          break L3;
                        } else {
                          var5 = ((ce) this).field_m;
                          L24: while (true) {
                            L25: {
                              if (~var5 < ~((ce) this).field_h) {
                                break L25;
                              } else {
                                stackOut_55_0 = 0;
                                stackOut_55_1 = ((ce) this).field_i.field_i.field_h[var4][var5] & 1;
                                stackIn_51_0 = stackOut_55_0;
                                stackIn_51_1 = stackOut_55_1;
                                stackIn_56_0 = stackOut_55_0;
                                stackIn_56_1 = stackOut_55_1;
                                if (var11 != 0) {
                                  continue L23;
                                } else {
                                  L26: {
                                    L27: {
                                      L28: {
                                        if (stackIn_56_0 != stackIn_56_1) {
                                          break L28;
                                        } else {
                                          if (!((ce) this).field_i.field_k[var4][var5]) {
                                            break L27;
                                          } else {
                                            break L28;
                                          }
                                        }
                                      }
                                      var6 = 0;
                                      L29: while (true) {
                                        if (2 <= var6) {
                                          break L27;
                                        } else {
                                          var7_ref = p.a(var5 * 24, var4 * 24, 100, true);
                                          ((ce) this).field_p.a(29664, (qa) (Object) var7_ref);
                                          op.field_m.field_K.a(-25612, (br) (Object) var7_ref);
                                          var6++;
                                          if (var11 != 0) {
                                            break L26;
                                          } else {
                                            if (var11 == 0) {
                                              continue L29;
                                            } else {
                                              break L27;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    ((ce) this).field_i.field_k[var4][var5] = false;
                                    var5++;
                                    break L26;
                                  }
                                  if (var11 == 0) {
                                    continue L24;
                                  } else {
                                    break L25;
                                  }
                                }
                              }
                            }
                            var4++;
                            if (var11 == 0) {
                              continue L22;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              break L3;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L30: {
            var3 = decompiledCaughtException;
            stackOut_70_0 = (RuntimeException) var3;
            stackOut_70_1 = new StringBuilder().append("ce.H(");
            stackIn_73_0 = stackOut_70_0;
            stackIn_73_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param0 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L30;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_74_0 = stackOut_71_0;
              stackIn_74_1 = stackOut_71_1;
              stackIn_74_2 = stackOut_71_2;
              break L30;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_74_0, stackIn_74_2 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6, int param7, String param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              nq.field_t.field_wb = param8;
              if (param4 >= 109) {
                break L1;
              } else {
                ce.a(-64);
                break L1;
              }
            }
            L2: {
              L3: {
                if (va.field_a == 2) {
                  break L3;
                } else {
                  jk.field_d.field_wb = io.field_e;
                  if (!ZombieDawnMulti.field_E) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              jk.field_d.field_wb = tm.field_d;
              break L2;
            }
            var9_int = 495;
            var10 = 5;
            br.field_c.a(param0, var10, var9_int + -10, 5, -3344);
            ec.field_b.a(param0, 0, br.field_c.field_zb + -ua.field_E.field_zb, 0, -3344);
            var10 = var10 + (param6 + param0);
            ua.field_E.a(param0, 0, ua.field_E.field_zb, ec.field_b.field_zb, -3344);
            dp.field_c.a(param7, var10, dp.field_c.e(0), 5, -3344);
            var11 = jk.field_d.e(0);
            jk.field_d.a(param7, var10, var11, -5 + var9_int + -var11, -3344);
            nq.field_t.a(param3, 0, var9_int, 0, -3344);
            var12 = 5 + var10 + param7;
            re.field_a.a(var12, param3, var9_int, 0, -3344);
            var12 = var12 + param3;
            re.field_a.field_ab = tg.a(2105376, re.field_a.field_z, 8421504, 3, 11579568, 49);
            lj.field_v.a(var12, -(var12 / 2) + param5, var9_int, param2 + -(var9_int / 2), -3344);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var9 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var9;
            stackOut_11_1 = new StringBuilder().append("ce.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param8 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L4;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    final void a(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((ce) this).field_j != 0) {
                this.b(false);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == -60) {
                break L2;
              } else {
                ce.c((byte) -16);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "ce.F(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        try {
            field_o = null;
            field_g = null;
            if (param0 != 24) {
                field_g = null;
            }
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "ce.I(" + param0 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        try {
          L0: {
            L1: {
              var4_int = param1 / 24;
              var5 = param0 / 24;
              if (param2 == -1) {
                break L1;
              } else {
                ((ce) this).field_n = 94;
                break L1;
              }
            }
            L2: {
              L3: {
                if (var5 < ((ce) this).field_m) {
                  break L3;
                } else {
                  if (((ce) this).field_h < var5) {
                    break L3;
                  } else {
                    if (var4_int < ((ce) this).field_t) {
                      break L3;
                    } else {
                      if (~var4_int < ~((ce) this).field_n) {
                        break L3;
                      } else {
                        stackOut_13_0 = 1;
                        stackIn_16_0 = stackOut_13_0;
                        break L2;
                      }
                    }
                  }
                }
              }
              stackOut_15_0 = 0;
              stackIn_16_0 = stackOut_15_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var4, "ce.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_16_0 != 0;
    }

    final void a(byte param0, nm param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            var3_int = param1.c(((ce) this).field_m * 24, -20126);
            int discarded$16 = param1.c((((ce) this).field_h + 1) * 24, -20126);
            if (param0 == 19) {
              L1: {
                L2: {
                  var4 = param1.d(((ce) this).field_t * 24, 114);
                  int discarded$17 = param1.d((1 + ((ce) this).field_n) * 24, 127);
                  var5 = 50;
                  if (((ce) this).field_j != 0) {
                    break L2;
                  } else {
                    var5 = -((ce) this).field_s + ((ce) this).field_l;
                    if (!ZombieDawnMulti.field_E) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (((ce) this).field_j != 2) {
                  break L1;
                } else {
                  var5 = ((ce) this).field_s;
                  break L1;
                }
              }
              L3: {
                var6 = 0;
                var7 = 0;
                if (((ce) this).field_q != 0) {
                  break L3;
                } else {
                  var8 = 47;
                  var9 = var8 + (-var8 + 255) * (-var5 + 50) / 50;
                  ((ce) this).field_f.c(var6 + var3_int, var4 + var7, var9);
                  break L3;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) runtimeException;
            stackOut_11_1 = new StringBuilder().append("ce.D(").append(param0).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L4;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    private final void d(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_11_0 = null;
        fc stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_12_3 = 0;
        fc stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int stackIn_14_3 = 0;
        fc stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        int stackIn_15_4 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        Object stackOut_10_0 = null;
        fc stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        fc stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        int stackOut_14_4 = 0;
        fc stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        int stackOut_12_4 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 > 40) {
                break L1;
              } else {
                boolean discarded$2 = ((ce) this).a(79, -32, -25);
                break L1;
              }
            }
            var2_int = ((ce) this).field_t;
            L2: while (true) {
              stackOut_5_0 = this;
              stackIn_6_0 = stackOut_5_0;
              L3: while (true) {
                L4: {
                  L5: {
                    if (~((ce) this).field_n > ~var2_int) {
                      break L5;
                    } else {
                      if (var4 != 0) {
                        break L4;
                      } else {
                        var3 = ((ce) this).field_m;
                        L6: while (true) {
                          L7: {
                            if (~var3 < ~((ce) this).field_h) {
                              break L7;
                            } else {
                              stackOut_10_0 = this;
                              stackIn_6_0 = stackOut_10_0;
                              stackIn_11_0 = stackOut_10_0;
                              if (var4 != 0) {
                                continue L3;
                              } else {
                                L8: {
                                  stackOut_11_0 = ((ce) this).field_i.field_i;
                                  stackOut_11_1 = -8927;
                                  stackOut_11_2 = var2_int;
                                  stackOut_11_3 = var3;
                                  stackIn_14_0 = stackOut_11_0;
                                  stackIn_14_1 = stackOut_11_1;
                                  stackIn_14_2 = stackOut_11_2;
                                  stackIn_14_3 = stackOut_11_3;
                                  stackIn_12_0 = stackOut_11_0;
                                  stackIn_12_1 = stackOut_11_1;
                                  stackIn_12_2 = stackOut_11_2;
                                  stackIn_12_3 = stackOut_11_3;
                                  if (0 == (1 & ((ce) this).field_i.field_i.field_h[var2_int][var3])) {
                                    stackOut_14_0 = (fc) (Object) stackIn_14_0;
                                    stackOut_14_1 = stackIn_14_1;
                                    stackOut_14_2 = stackIn_14_2;
                                    stackOut_14_3 = stackIn_14_3;
                                    stackOut_14_4 = 0;
                                    stackIn_15_0 = stackOut_14_0;
                                    stackIn_15_1 = stackOut_14_1;
                                    stackIn_15_2 = stackOut_14_2;
                                    stackIn_15_3 = stackOut_14_3;
                                    stackIn_15_4 = stackOut_14_4;
                                    break L8;
                                  } else {
                                    stackOut_12_0 = (fc) (Object) stackIn_12_0;
                                    stackOut_12_1 = stackIn_12_1;
                                    stackOut_12_2 = stackIn_12_2;
                                    stackOut_12_3 = stackIn_12_3;
                                    stackOut_12_4 = 1;
                                    stackIn_15_0 = stackOut_12_0;
                                    stackIn_15_1 = stackOut_12_1;
                                    stackIn_15_2 = stackOut_12_2;
                                    stackIn_15_3 = stackOut_12_3;
                                    stackIn_15_4 = stackOut_12_4;
                                    break L8;
                                  }
                                }
                                ((fc) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_15_2, stackIn_15_3, stackIn_15_4 != 0);
                                ((ce) this).field_i.field_k[var2_int][var3] = false;
                                var3++;
                                if (var4 == 0) {
                                  continue L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          var2_int++;
                          if (var4 == 0) {
                            continue L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  }
                  break L4;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "ce.K(" + param0 + ')');
        }
    }

    final boolean d(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        qa var2_ref = null;
        qa var3 = null;
        int var4 = 0;
        int stackIn_24_0 = 0;
        boolean stackIn_41_0 = false;
        int stackIn_48_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_55_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        boolean stackOut_40_0 = false;
        int stackOut_47_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_54_0 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              ((ce) this).field_s = ((ce) this).field_s - 1;
              var2_int = ((ce) this).field_j;
              if (var2_int == 0) {
                L2: {
                  if (((ce) this).field_f != null) {
                    if (0 == ((ce) this).field_q) {
                      ((ce) this).field_f.b(0, 1, 0);
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                if (((ce) this).field_l + -50 >= ((ce) this).field_s) {
                  this.b(false);
                  ((ce) this).field_j = 1;
                  stackOut_23_0 = 1;
                  stackIn_24_0 = stackOut_23_0;
                  return stackIn_24_0 != 0;
                } else {
                  break L1;
                }
              } else {
                L3: {
                  L4: {
                    if (var2_int != 1) {
                      break L4;
                    } else {
                      if (var4 == 0) {
                        if (((ce) this).field_s <= 50) {
                          ((ce) this).field_j = 2;
                          if (var4 == 0) {
                            break L1;
                          } else {
                            break L3;
                          }
                        } else {
                          break L1;
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (var2_int == 2) {
                    break L3;
                  } else {
                    break L1;
                  }
                }
                L5: {
                  if (null == ((ce) this).field_f) {
                    break L5;
                  } else {
                    if (((ce) this).field_q != 0) {
                      break L5;
                    } else {
                      ((ce) this).field_f.b(0, -1, 0);
                      break L5;
                    }
                  }
                }
                L6: {
                  L7: {
                    if (((ce) this).field_p == null) {
                      break L7;
                    } else {
                      var3 = ((ce) this).field_p.c((byte) 115);
                      L8: while (true) {
                        if (var3 == null) {
                          break L7;
                        } else {
                          var2_ref = ((ce) this).field_p.b((byte) 97);
                          ((lk) (Object) var3).field_S = 1;
                          stackOut_40_0 = ((lk) (Object) var3).field_O;
                          stackIn_48_0 = stackOut_40_0 ? 1 : 0;
                          stackIn_41_0 = stackOut_40_0;
                          if (var4 != 0) {
                            break L6;
                          } else {
                            L9: {
                              if (!stackIn_41_0) {
                                break L9;
                              } else {
                                ((lk) (Object) var3).j(param0 ^ -5404);
                                break L9;
                              }
                            }
                            var3 = var2_ref;
                            if (var4 == 0) {
                              continue L8;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_47_0 = ~((ce) this).field_s;
                  stackIn_48_0 = stackOut_47_0;
                  break L6;
                }
                if (stackIn_48_0 < -1) {
                  break L1;
                } else {
                  this.d((byte) 87);
                  ((ce) this).a(true);
                  stackOut_49_0 = 1;
                  stackIn_50_0 = stackOut_49_0;
                  return stackIn_50_0 != 0;
                }
              }
            }
            L10: {
              if (param0 == -20232) {
                break L10;
              } else {
                ((ce) this).c(-117);
                break L10;
              }
            }
            stackOut_54_0 = 0;
            stackIn_55_0 = stackOut_54_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "ce.C(" + param0 + ')');
        }
        return stackIn_55_0 != 0;
    }

    private final void b(boolean param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        fc stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_13_3 = 0;
        fc stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        fc stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        fc stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        int stackIn_18_3 = 0;
        int stackIn_18_4 = 0;
        boolean[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        boolean[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        boolean[] stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        fc stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        fc stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        int stackOut_17_3 = 0;
        int stackOut_17_4 = 0;
        fc stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        fc stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        int stackOut_15_4 = 0;
        boolean[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        boolean[] stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        boolean[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                ce.a(-36, 94, -24, 32, (byte) 68, -15, -48, 125, (String) null);
                break L1;
              }
            }
            var2_int = ((ce) this).field_t;
            L2: while (true) {
              stackOut_5_0 = ~((ce) this).field_n;
              stackOut_5_1 = ~var2_int;
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              L3: while (true) {
                L4: {
                  L5: {
                    if (stackIn_6_0 > stackIn_6_1) {
                      break L5;
                    } else {
                      if (var4 != 0) {
                        break L4;
                      } else {
                        var3 = ((ce) this).field_m;
                        L6: while (true) {
                          L7: {
                            if (~((ce) this).field_h > ~var3) {
                              break L7;
                            } else {
                              stackOut_10_0 = ~(((ce) this).field_i.field_i.field_g[var2_int][var3] & -2147483648);
                              stackOut_10_1 = -1;
                              stackIn_6_0 = stackOut_10_0;
                              stackIn_6_1 = stackOut_10_1;
                              stackIn_11_0 = stackOut_10_0;
                              stackIn_11_1 = stackOut_10_1;
                              if (var4 != 0) {
                                continue L3;
                              } else {
                                L8: {
                                  if (stackIn_11_0 != stackIn_11_1) {
                                    break L8;
                                  } else {
                                    L9: {
                                      stackOut_12_0 = ((ce) this).field_i.field_i;
                                      stackOut_12_1 = -8927;
                                      stackOut_12_2 = var2_int;
                                      stackOut_12_3 = var3;
                                      stackIn_17_0 = stackOut_12_0;
                                      stackIn_17_1 = stackOut_12_1;
                                      stackIn_17_2 = stackOut_12_2;
                                      stackIn_17_3 = stackOut_12_3;
                                      stackIn_13_0 = stackOut_12_0;
                                      stackIn_13_1 = stackOut_12_1;
                                      stackIn_13_2 = stackOut_12_2;
                                      stackIn_13_3 = stackOut_12_3;
                                      if (0 != ((ce) this).field_q) {
                                        stackOut_17_0 = (fc) (Object) stackIn_17_0;
                                        stackOut_17_1 = stackIn_17_1;
                                        stackOut_17_2 = stackIn_17_2;
                                        stackOut_17_3 = stackIn_17_3;
                                        stackOut_17_4 = 0;
                                        stackIn_18_0 = stackOut_17_0;
                                        stackIn_18_1 = stackOut_17_1;
                                        stackIn_18_2 = stackOut_17_2;
                                        stackIn_18_3 = stackOut_17_3;
                                        stackIn_18_4 = stackOut_17_4;
                                        break L9;
                                      } else {
                                        stackOut_13_0 = (fc) (Object) stackIn_13_0;
                                        stackOut_13_1 = stackIn_13_1;
                                        stackOut_13_2 = stackIn_13_2;
                                        stackOut_13_3 = stackIn_13_3;
                                        stackIn_15_0 = stackOut_13_0;
                                        stackIn_15_1 = stackOut_13_1;
                                        stackIn_15_2 = stackOut_13_2;
                                        stackIn_15_3 = stackOut_13_3;
                                        stackOut_15_0 = (fc) (Object) stackIn_15_0;
                                        stackOut_15_1 = stackIn_15_1;
                                        stackOut_15_2 = stackIn_15_2;
                                        stackOut_15_3 = stackIn_15_3;
                                        stackOut_15_4 = 1;
                                        stackIn_18_0 = stackOut_15_0;
                                        stackIn_18_1 = stackOut_15_1;
                                        stackIn_18_2 = stackOut_15_2;
                                        stackIn_18_3 = stackOut_15_3;
                                        stackIn_18_4 = stackOut_15_4;
                                        break L9;
                                      }
                                    }
                                    L10: {
                                      ((fc) (Object) stackIn_18_0).a(stackIn_18_1, stackIn_18_2, stackIn_18_3, stackIn_18_4 != 0);
                                      stackOut_18_0 = ((ce) this).field_i.field_k[var2_int];
                                      stackOut_18_1 = var3;
                                      stackIn_21_0 = stackOut_18_0;
                                      stackIn_21_1 = stackOut_18_1;
                                      stackIn_19_0 = stackOut_18_0;
                                      stackIn_19_1 = stackOut_18_1;
                                      if (((ce) this).field_q != 0) {
                                        stackOut_21_0 = (boolean[]) (Object) stackIn_21_0;
                                        stackOut_21_1 = stackIn_21_1;
                                        stackOut_21_2 = 0;
                                        stackIn_22_0 = stackOut_21_0;
                                        stackIn_22_1 = stackOut_21_1;
                                        stackIn_22_2 = stackOut_21_2;
                                        break L10;
                                      } else {
                                        stackOut_19_0 = (boolean[]) (Object) stackIn_19_0;
                                        stackOut_19_1 = stackIn_19_1;
                                        stackOut_19_2 = 1;
                                        stackIn_22_0 = stackOut_19_0;
                                        stackIn_22_1 = stackOut_19_1;
                                        stackIn_22_2 = stackOut_19_2;
                                        break L10;
                                      }
                                    }
                                    stackIn_22_0[stackIn_22_1] = stackIn_22_2 != 0;
                                    break L8;
                                  }
                                }
                                var3++;
                                if (var4 == 0) {
                                  continue L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          var2_int++;
                          if (var4 == 0) {
                            continue L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  }
                  break L4;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "ce.A(" + param0 + ')');
        }
    }

    final static void c(byte param0) {
        try {
            cb.a((String) null, 32, mc.field_g);
            if (param0 != -123) {
                ce.a(79);
            }
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "ce.G(" + param0 + ')');
        }
    }

    final void c(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((ce) this).field_s <= 50) {
                break L1;
              } else {
                ((ce) this).field_s = 50;
                break L1;
              }
            }
            L2: {
              if (param0 == -28188) {
                break L2;
              } else {
                ((ce) this).field_h = -2;
                break L2;
              }
            }
            ((ce) this).field_j = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "ce.E(" + param0 + ')');
        }
    }

    ce(fh param0, int param1, int param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              ((ce) this).field_i = param0;
              param1 = param1 / 24;
              param2 = param2 / 24;
              ((ce) this).field_q = param4;
              ((ce) this).field_s = param3;
              ((ce) this).field_l = param3;
              ((ce) this).field_t = param2 - ip.field_f;
              if (((ce) this).field_t >= 0) {
                break L1;
              } else {
                ((ce) this).field_t = 0;
                break L1;
              }
            }
            L2: {
              ((ce) this).field_m = param1 - ip.field_f;
              if (((ce) this).field_m >= 0) {
                break L2;
              } else {
                ((ce) this).field_m = 0;
                break L2;
              }
            }
            L3: {
              if (null != ((ce) this).field_i) {
                ((ce) this).a(((ce) this).field_i, 118);
                break L3;
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) runtimeException;
            stackOut_12_1 = new StringBuilder().append("ce.<init>(");
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L4;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "<%0> must play 1 more rated game before playing with the current options.";
        field_g = new String[]{"Mode: Normal", "Mode: Hard"};
    }
}
