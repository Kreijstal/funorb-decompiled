/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se extends jj {
    private fo[] field_m;
    static ei field_o;
    private jm[] field_n;

    final static boolean b(boolean param0) {
        RuntimeException var1 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0) {
              L1: {
                L2: {
                  if (null == sh.field_e) {
                    break L2;
                  } else {
                    if (!uk.field_s.b(-21)) {
                      break L2;
                    } else {
                      stackOut_7_0 = 1;
                      stackIn_10_0 = stackOut_7_0;
                      break L1;
                    }
                  }
                }
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L1;
              }
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "se.I(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final void c(int param0) {
        RuntimeException runtimeException = null;
        jm[] var2 = null;
        fo[] var2_array = null;
        int var3 = 0;
        jm var4 = null;
        fo var4_ref = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            super.c(param0);
            var2 = ((se) this).field_n;
            var3 = 0;
            L1: while (true) {
              L2: {
                if (~var2.length >= ~var3) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      var4 = var2[var3];
                      var4.field_m = var4.field_m + var4.field_e;
                      if (-200.0 > var4.field_m) {
                        break L4;
                      } else {
                        if (640.0 < var4.field_m) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var4.a((byte) -114);
                    this.e(-1);
                    break L3;
                  }
                  var3++;
                  if (var5 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              var2_array = ((se) this).field_m;
              var3 = 0;
              L5: while (true) {
                L6: {
                  L7: {
                    if (~var2_array.length >= ~var3) {
                      break L7;
                    } else {
                      var4_ref = var2_array[var3];
                      var4_ref.a(-173);
                      var3++;
                      if (var5 != 0) {
                        break L6;
                      } else {
                        if (var5 == 0) {
                          continue L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  break L6;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw aa.a((Throwable) (Object) runtimeException, "se.H(" + param0 + ')');
        }
    }

    private final boolean b(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_12_0 = 0;
        var3 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~(((se) this).field_n.length - 1) >= ~var2_int) {
                    break L3;
                  } else {
                    stackOut_3_0 = ~((se) this).field_n[var2_int].field_l;
                    stackOut_3_1 = ~((se) this).field_n[1 + var2_int].field_l;
                    stackIn_12_0 = stackOut_3_0;
                    stackIn_12_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (stackIn_4_0 < stackIn_4_1) {
                        stackOut_8_0 = 0;
                        stackIn_9_0 = stackOut_8_0;
                        return stackIn_9_0 != 0;
                      } else {
                        var2_int++;
                        if (var3 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackOut_11_0 = -99;
                stackOut_11_1 = (-7 - param0) / 43;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                break L2;
              }
              var2_int = stackIn_12_0 / stackIn_12_1;
              stackOut_12_0 = 1;
              stackIn_13_0 = stackOut_12_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "se.F(" + param0 + ')');
        }
        return stackIn_13_0 != 0;
    }

    final static tf[] a(int param0, int param1, int param2, fm param3) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        tf[] stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        tf[] stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (!rk.a(param0, false, param3, param1)) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (tf[]) (Object) stackIn_4_0;
            } else {
              if (param2 == 1000) {
                stackOut_8_0 = wa.c(param2 + -1119);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (tf[]) (Object) stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("se.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_9_0;
    }

    final static void a(byte param0, int param1) {
        RuntimeException runtimeException = null;
        rh var2 = null;
        ue var2_ref = null;
        int var3 = 0;
        rh stackIn_4_0 = null;
        Object stackIn_6_0 = null;
        RuntimeException decompiledCaughtException = null;
        rh stackOut_3_0 = null;
        fa stackOut_5_0 = null;
        var3 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var2 = (rh) (Object) de.field_b.c(1504642273);
            L1: while (true) {
              L2: {
                L3: {
                  if (null == var2) {
                    break L3;
                  } else {
                    sd.a((byte) -76, var2, param1);
                    stackOut_3_0 = (rh) (Object) de.field_b.f(1504642273);
                    stackIn_6_0 = (Object) (Object) stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      var2 = stackIn_4_0;
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_5_0 = f.field_c.c(1504642273);
                stackIn_6_0 = (Object) (Object) stackOut_5_0;
                break L2;
              }
              var2_ref = (ue) (Object) stackIn_6_0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (null == var2_ref) {
                      break L6;
                    } else {
                      uj.a(param1, var2_ref, 65536);
                      var2_ref = (ue) (Object) f.field_c.f(1504642273);
                      if (var3 != 0) {
                        break L5;
                      } else {
                        if (var3 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  if (param0 > 3) {
                    break L5;
                  } else {
                    boolean discarded$2 = se.b(true);
                    break L5;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw aa.a((Throwable) (Object) runtimeException, "se.J(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(boolean param0) {
        RuntimeException runtimeException = null;
        jm[] var2 = null;
        fo[] var2_array = null;
        int var3 = 0;
        jm var4 = null;
        fo var4_ref = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            t.g(0, 0, 640, 480, 8874, 3368703);
            if (!param0) {
              var2 = ((se) this).field_n;
              var3 = 0;
              L1: while (true) {
                L2: {
                  if (~var3 <= ~var2.length) {
                    break L2;
                  } else {
                    var4 = var2[var3];
                    eh.field_c[var4.field_n].b((int)var4.field_m, var4.field_c, var4.field_a, var4.field_f, var4.field_t);
                    var3++;
                    if (var5 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var2_array = ((se) this).field_m;
                var3 = 0;
                L3: while (true) {
                  L4: {
                    L5: {
                      if (var3 >= var2_array.length) {
                        break L5;
                      } else {
                        var4_ref = var2_array[var3];
                        var4_ref.b(1);
                        var3++;
                        if (var5 != 0) {
                          break L4;
                        } else {
                          if (var5 == 0) {
                            continue L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    break L4;
                  }
                  break L0;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw aa.a((Throwable) (Object) runtimeException, "se.E(" + param0 + ')');
        }
    }

    private final void a(byte param0, int param1, int param2) {
        jm var5 = null;
        try {
            int var4_int = 36 / ((param0 - 20) / 49);
            var5 = ((se) this).field_n[param1];
            ((se) this).field_n[param1] = ((se) this).field_n[param2];
            ((se) this).field_n[param2] = var5;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "se.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean d(int param0) {
        RuntimeException var1 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (null == ip.field_y) {
              L1: {
                if (param0 == 3782) {
                  break L1;
                } else {
                  boolean discarded$2 = se.b(true);
                  break L1;
                }
              }
              if (!pf.field_d.a("benefits", -1)) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0 != 0;
              } else {
                ip.field_y = bi.a("benefits", "members_benefits_borders", pf.field_d, (byte) -89);
                km.field_p = bi.a("benefits", "members_benefits_price", pf.field_d, (byte) -70);
                cf.field_t = bi.a("benefits", "members_benefits_logo", pf.field_d, (byte) -118);
                li.field_h = eh.a("members_benefits_screenshots", "benefits", (byte) 47, pf.field_d);
                bl.a(11833, ip.field_y, po.field_e);
                ni.a(km.field_p, 2, 40, 40, 80, false, -2400, 15, (jl) (Object) rk.field_e, 80, 0);
                pb.a(-25960, li.field_h);
                sk.a(param0 ^ -3744, cf.field_t);
                stackOut_11_0 = 1;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "se.C(" + param0 + ')');
        }
        return stackIn_12_0 != 0;
    }

    public static void f(int param0) {
        try {
            field_o = null;
            if (param0 != 21476) {
                field_o = null;
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "se.G(" + param0 + ')');
        }
    }

    private final void e(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        var3 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (this.b((byte) 89)) {
                      break L4;
                    } else {
                      stackOut_2_0 = 0;
                      stackIn_14_0 = stackOut_2_0;
                      stackIn_3_0 = stackOut_2_0;
                      if (var3 != 0) {
                        break L3;
                      } else {
                        var2_int = stackIn_3_0;
                        L5: while (true) {
                          L6: {
                            if (~(-1 + ((se) this).field_n.length) >= ~var2_int) {
                              break L6;
                            } else {
                              stackOut_5_0 = ~((se) this).field_n[var2_int - -1].field_l;
                              stackOut_5_1 = ~((se) this).field_n[var2_int].field_l;
                              stackIn_15_0 = stackOut_5_0;
                              stackIn_15_1 = stackOut_5_1;
                              stackIn_6_0 = stackOut_5_0;
                              stackIn_6_1 = stackOut_5_1;
                              if (var3 != 0) {
                                break L2;
                              } else {
                                L7: {
                                  if (stackIn_6_0 > stackIn_6_1) {
                                    this.a((byte) 108, 1 + var2_int, var2_int);
                                    break L7;
                                  } else {
                                    break L7;
                                  }
                                }
                                var2_int++;
                                if (var3 == 0) {
                                  continue L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          if (var3 == 0) {
                            continue L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  stackOut_13_0 = param0;
                  stackIn_14_0 = stackOut_13_0;
                  break L3;
                }
                stackOut_14_0 = stackIn_14_0;
                stackOut_14_1 = -1;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                break L2;
              }
              L8: {
                if (stackIn_15_0 == stackIn_15_1) {
                  break L8;
                } else {
                  field_o = null;
                  break L8;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "se.A(" + param0 + ')');
        }
    }

    se(String param0, tf[] param1) {
        super(param0, param1);
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            ((se) this).field_n = new jm[10];
            var3_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var3_int >= 10) {
                    break L3;
                  } else {
                    ((se) this).field_n[var3_int] = new jm();
                    var3_int++;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                this.e(-1);
                ((se) this).field_m = new fo[4];
                ((se) this).field_m[0] = new fo(1400, 150, 400, 500, 1000);
                ((se) this).field_m[1] = new fo(1800, 430, 320, 800, 1000);
                ((se) this).field_m[2] = new fo(2200, 500, 140, 900, 1000);
                ((se) this).field_m[3] = new fo(2600, 230, 220, 700, 1000);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) runtimeException;
            stackOut_9_1 = new StringBuilder().append("se.<init>(");
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L5;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
    }

    static {
    }
}
