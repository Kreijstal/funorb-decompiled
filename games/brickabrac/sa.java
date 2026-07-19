/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class sa extends qg implements vc {
    static boolean field_E;

    public abstract void a(boolean param0, byte param1);

    private final void j(boolean param0) {
        int var3 = 0;
        boolean stackIn_3_0 = false;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        boolean stackIn_11_0 = false;
        boolean stackOut_2_0 = false;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        boolean stackOut_10_0 = false;
        var3 = BrickABrac.field_J ? 1 : 0;
        L0: while (true) {
          L1: {
            L2: {
              if (!nl.a(ch.field_g, (byte) 64)) {
                break L2;
              } else {
                stackOut_2_0 = this.a(jl.field_e, (byte) 47, si.field_a);
                stackIn_11_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var3 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (!stackIn_3_0) {
                      break L3;
                    } else {
                      if (var3 == 0) {
                        continue L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    stackOut_6_0 = this;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (param0) {
                      stackOut_8_0 = this;
                      stackOut_8_1 = 0;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      break L4;
                    } else {
                      stackOut_7_0 = this;
                      stackOut_7_1 = 1;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_9_1 = stackOut_7_1;
                      break L4;
                    }
                  }
                  this.h(stackIn_9_1 != 0);
                  if (var3 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackOut_10_0 = param0;
            stackIn_11_0 = stackOut_10_0;
            break L1;
          }
          L5: {
            if (stackIn_11_0) {
              break L5;
            } else {
              field_E = false;
              break L5;
            }
          }
          return;
        }
    }

    final static int a(int param0, int param1) {
        param0 = param0 & 8191;
        if ((param0 ^ -1) <= param1) {
            return -6145 >= (param0 ^ -1) ? -um.field_j[8192 + -param0] : -um.field_j[-4096 + param0];
        }
        return -2049 < (param0 ^ -1) ? um.field_j[param0] : um.field_j[4096 - param0];
    }

    final static boolean a(int param0, int param1, int param2) {
        int stackIn_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_9_0 = 0;
        if ((dc.field_b ^ -1) == -14) {
          th.b(param1 ^ 103);
          return true;
        } else {
          if (dc.field_b == param1) {
            hd.field_a.f((byte) 41);
            return true;
          } else {
            L0: {
              L1: {
                if (hd.field_a == null) {
                  break L1;
                } else {
                  if (!hd.field_a.a(param2, param0, (byte) -126)) {
                    break L1;
                  } else {
                    stackOut_8_0 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    break L0;
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            }
            return stackIn_10_0 != 0;
          }
        }
    }

    public abstract void a(int param0);

    abstract void b(int param0, int param1);

    public abstract boolean a(int param0, char param1, int param2);

    private final void i(boolean param0) {
        if (param0) {
            this.f(-67);
        }
    }

    final void g(int param0) {
        boolean discarded$3 = false;
        java.awt.Canvas var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = BrickABrac.field_J ? 1 : 0;
        var2 = gd.a((byte) 0);
        if (r.c((byte) -84)) {
          pk.a((byte) 68, var2, mj.a((byte) -81));
          return;
        } else {
          if (!un.field_f) {
            kn.a(true, var2);
            return;
          } else {
            L0: {
              if (um.field_t) {
                break L0;
              } else {
                if (og.h(-26090)) {
                  break L0;
                } else {
                  ai.a((byte) 24, 100.0f, qm.field_e);
                  kn.a(true, var2);
                  return;
                }
              }
            }
            pe.field_i = true;
            var3 = kp.field_d.size() + -1;
            L1: while (true) {
              L2: {
                L3: {
                  if (var3 < 0) {
                    break L3;
                  } else {
                    ((vc) (kp.field_d.elementAt(var3))).a(16769381);
                    var3--;
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
                if (param0 > 93) {
                  break L2;
                } else {
                  field_E = false;
                  break L2;
                }
              }
              L4: {
                L5: {
                  if (!pe.field_i) {
                    break L5;
                  } else {
                    discarded$3 = jj.a((byte) -123);
                    ck.a(var2, 0, 14209, 0);
                    if (var4 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                this.i(false);
                break L4;
              }
              return;
            }
          }
        }
    }

    protected sa() {
    }

    final void a(int param0, wb param1) {
        try {
            al.field_j = param1;
            this.a(8, true);
            this.l(param0 ^ 3156);
            this.i(2);
            this.e(true);
            this.b((byte) -67);
            if (param0 != 3160) {
                return;
            }
            try {
                this.j(64);
                this.c((byte) -19);
                ch.field_g[9] = -1;
                ch.field_g[10] = -1;
                kp.field_d = new Vector();
                op.a((vc) (this), 0);
            } catch (RuntimeException runtimeException) {
                throw qb.a((Throwable) ((Object) runtimeException), "sa.HB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract boolean a(pi param0, byte param1, int param2);

    final static void a(int param0, bi param1, String param2, int param3, int param4, int param5, int param6) {
        int var7_int = 0;
        try {
            var7_int = (-param1.field_B + (param4 + (2 * param0 - param1.field_L))) / 2;
            int var8 = -69 / ((param6 - -85) / 40);
            nn.field_g.b(param2, param3, var7_int + nn.field_g.field_B, param5, -1);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "sa.NB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    private final void r(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        vc var6 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        boolean stackIn_39_0 = false;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        boolean stackIn_51_0 = false;
        int stackIn_63_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        int stackIn_68_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_76_1 = 0;
        Object stackOut_17_0 = null;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        boolean stackOut_38_0 = false;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        int stackOut_72_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_71_1 = 0;
        int stackOut_73_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_68_1 = 0;
        int stackOut_78_0 = 0;
        int stackOut_78_1 = 0;
        boolean stackOut_50_0 = false;
        int stackOut_62_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_64_1 = 0;
        int stackOut_63_0 = 0;
        int stackOut_63_1 = 0;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (param0 == 10) {
          L0: {
            L1: {
              L2: {
                L3: {
                  var2 = 0;
                  if (m.a(2)) {
                    break L3;
                  } else {
                    L4: {
                      if (!lg.a(9)) {
                        break L4;
                      } else {
                        L5: {
                          if (me.b(126)) {
                            break L5;
                          } else {
                            L6: {
                              L7: {
                                var3 = md.f((byte) 124);
                                if (var3 == 2) {
                                  break L7;
                                } else {
                                  L8: {
                                    if (var3 != 3) {
                                      break L8;
                                    } else {
                                      cp.a(true, 21543);
                                      if (var5 == 0) {
                                        break L6;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                  if (var3 != 4) {
                                    break L6;
                                  } else {
                                    he.a(qn.field_k, false, (byte) 61);
                                    wi.field_g = true;
                                    if (var5 == 0) {
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              nc.b(102);
                              break L6;
                            }
                            this.a(false, (byte) 69);
                            if (var5 == 0) {
                              break L2;
                            } else {
                              break L5;
                            }
                          }
                        }
                        nk.a(58);
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L9: {
                      if (!dj.c((byte) -33)) {
                        break L9;
                      } else {
                        L10: {
                          stackOut_17_0 = this;
                          stackIn_19_0 = stackOut_17_0;
                          stackIn_18_0 = stackOut_17_0;
                          if (ua.field_d == null) {
                            stackOut_19_0 = this;
                            stackOut_19_1 = 0;
                            stackIn_20_0 = stackOut_19_0;
                            stackIn_20_1 = stackOut_19_1;
                            break L10;
                          } else {
                            stackOut_18_0 = this;
                            stackOut_18_1 = 1;
                            stackIn_20_0 = stackOut_18_0;
                            stackIn_20_1 = stackOut_18_1;
                            break L10;
                          }
                        }
                        L11: {
                          L12: {
                            var3 = this.b(stackIn_20_1 != 0, (byte) -118);
                            if (1 == var3) {
                              break L12;
                            } else {
                              if ((var3 ^ -1) == -3) {
                                break L12;
                              } else {
                                break L11;
                              }
                            }
                          }
                          L13: {
                            if (null != ua.field_d) {
                              nc.b(118);
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                          if ((var3 ^ -1) != -3) {
                            break L11;
                          } else {
                            nk.a(param0 ^ 2058, uc.e((byte) -85));
                            break L11;
                          }
                        }
                        this.a(false, (byte) 81);
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L9;
                        }
                      }
                    }
                    L14: {
                      if (!uc.f(21651)) {
                        break L14;
                      } else {
                        L15: {
                          if (me.b(param0 ^ -16)) {
                            break L15;
                          } else {
                            L16: {
                              var3 = vh.h(0);
                              if (1 != var3) {
                                break L16;
                              } else {
                                he.a(mq.field_a, true, (byte) 97);
                                break L16;
                              }
                            }
                            this.a(false, (byte) 7);
                            if (var5 == 0) {
                              break L2;
                            } else {
                              break L15;
                            }
                          }
                        }
                        nk.a(param0 + 47);
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L14;
                        }
                      }
                    }
                    L17: {
                      if (me.b(-34)) {
                        break L17;
                      } else {
                        var2 = 1;
                        var3 = -1;
                        L18: while (true) {
                          stackOut_38_0 = jl.a((byte) 5);
                          stackIn_39_0 = stackOut_38_0;
                          L19: while (true) {
                            L20: {
                              if (!stackIn_39_0) {
                                break L20;
                              } else {
                                stackOut_40_0 = dc.field_b;
                                stackOut_40_1 = -1;
                                stackIn_76_0 = stackOut_40_0;
                                stackIn_76_1 = stackOut_40_1;
                                stackIn_41_0 = stackOut_40_0;
                                stackIn_41_1 = stackOut_40_1;
                                if (var5 != 0) {
                                  L21: while (true) {
                                    if (stackIn_76_0 >= stackIn_76_1) {
                                      break L1;
                                    } else {
                                      var6 = (vc) (kp.field_d.elementAt(var3));
                                      var6.a(var2 != 0, (byte) -126);
                                      if (var5 != 0) {
                                        break L0;
                                      } else {
                                        L22: {
                                          stackOut_72_0 = var2;
                                          stackIn_71_0 = stackOut_72_0;
                                          stackIn_73_0 = stackOut_72_0;
                                          if (var6.b(59)) {
                                            stackOut_71_0 = stackIn_71_0;
                                            stackOut_71_1 = 0;
                                            stackIn_69_0 = stackOut_71_0;
                                            stackIn_69_1 = stackOut_71_1;
                                            break L22;
                                          } else {
                                            stackOut_73_0 = stackIn_73_0;
                                            stackIn_68_0 = stackOut_73_0;
                                            stackOut_68_0 = stackIn_68_0;
                                            stackOut_68_1 = 1;
                                            stackIn_69_0 = stackOut_68_0;
                                            stackIn_69_1 = stackOut_68_1;
                                            break L22;
                                          }
                                        }
                                        var2 = stackIn_69_0 & stackIn_69_1;
                                        var3++;
                                        if (var5 == 0) {
                                          stackOut_78_0 = var3;
                                          stackOut_78_1 = kp.field_d.size();
                                          stackIn_76_0 = stackOut_78_0;
                                          stackIn_76_1 = stackOut_78_1;
                                          continue L21;
                                        } else {
                                          break L1;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  L23: {
                                    L24: {
                                      if (stackIn_41_0 != stackIn_41_1) {
                                        break L24;
                                      } else {
                                        if (-1 != dc.field_b) {
                                          break L23;
                                        } else {
                                          if (var3 != -1) {
                                            dc.field_b = var3;
                                            var3 = -1;
                                            if (var5 == 0) {
                                              break L23;
                                            } else {
                                              break L24;
                                            }
                                          } else {
                                            break L23;
                                          }
                                        }
                                      }
                                    }
                                    if (!uf.b(-102, dc.field_b)) {
                                      break L23;
                                    } else {
                                      var3 = dc.field_b;
                                      if (var5 == 0) {
                                        continue L18;
                                      } else {
                                        break L23;
                                      }
                                    }
                                  }
                                  var4 = 0;
                                  L25: while (true) {
                                    L26: {
                                      if ((var4 ^ -1) <= (kp.field_d.size() ^ -1)) {
                                        break L26;
                                      } else {
                                        stackOut_50_0 = ((vc) (kp.field_d.elementAt(var4))).a(dc.field_b, go.field_b, -81);
                                        stackIn_39_0 = stackOut_50_0;
                                        stackIn_51_0 = stackOut_50_0;
                                        if (var5 != 0) {
                                          continue L19;
                                        } else {
                                          if (stackIn_51_0) {
                                            break L26;
                                          } else {
                                            var4++;
                                            if (var5 == 0) {
                                              continue L25;
                                            } else {
                                              break L26;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    if (var5 == 0) {
                                      continue L18;
                                    } else {
                                      break L20;
                                    }
                                  }
                                }
                              }
                            }
                            if (var5 == 0) {
                              break L2;
                            } else {
                              break L17;
                            }
                          }
                        }
                      }
                    }
                    nk.a(114);
                    if (var5 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                this.a(false, (byte) 28);
                break L2;
              }
              var3 = 0;
              L27: while (true) {
                if (var3 >= kp.field_d.size()) {
                  break L1;
                } else {
                  var6 = (vc) (kp.field_d.elementAt(var3));
                  var6.a(var2 != 0, (byte) -126);
                  if (var5 != 0) {
                    break L0;
                  } else {
                    L28: {
                      stackOut_62_0 = var2;
                      stackIn_64_0 = stackOut_62_0;
                      stackIn_63_0 = stackOut_62_0;
                      if (var6.b(59)) {
                        stackOut_64_0 = stackIn_64_0;
                        stackOut_64_1 = 0;
                        stackIn_65_0 = stackOut_64_0;
                        stackIn_65_1 = stackOut_64_1;
                        break L28;
                      } else {
                        stackOut_63_0 = stackIn_63_0;
                        stackOut_63_1 = 1;
                        stackIn_65_0 = stackOut_63_0;
                        stackIn_65_1 = stackOut_63_1;
                        break L28;
                      }
                    }
                    var2 = stackIn_65_0 & stackIn_65_1;
                    var3++;
                    if (var5 == 0) {
                      continue L27;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            break L0;
          }
          return;
        } else {
          return;
        }
    }

    final static String a(char param0, int param1, int param2) {
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        var6 = new char[param2];
        var3 = var6;
        var4 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (param2 <= var4) {
                break L2;
              } else {
                var6[var4] = param0;
                var4++;
                if (var5 != 0) {
                  break L1;
                } else {
                  if (var5 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            var4 = -55 / ((param1 - 75) / 40);
            break L1;
          }
          return new String(var6);
        }
    }

    abstract void p(int param0);

    public final boolean b(int param0) {
        if (param0 < 36) {
            return true;
        }
        return true;
    }

    abstract boolean q(int param0);

    final static void a(byte param0, jp param1, int param2, int param3, jp param4, jp param5, int param6, int param7, int param8, int param9) {
        RuntimeException var10 = null;
        jp var11 = null;
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
        try {
          L0: {
            L1: {
              param5.d((param6 * 5 >> -1649660336) + ((-param5.field_x + param7) / 2 + param9), param2);
              param4.c(param9 + (param7 - param4.field_x) / 2 - (-(param6 * 10 >> 526831088) + -(10 / param3)), 480 + (param8 + (param2 - param4.field_z)));
              if (param0 > 79) {
                break L1;
              } else {
                var11 = (jp) null;
                sa.a((byte) 75, (jp) null, -80, -107, (jp) null, (jp) null, 10, 97, -30, 44);
                break L1;
              }
            }
            param1.c(10 / param3 + (param9 - (-((-param1.field_x + param7) / 2) + -(20 * param6 >> -2016118800))), 480 + (param2 + param8 - param1.field_z));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var10 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var10);
            stackOut_4_1 = new StringBuilder().append("sa.MB(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
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
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param4 == null) {
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
            if (param5 == null) {
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
          throw qb.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    final void f(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        e var5 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        L0: {
          var4 = BrickABrac.field_J ? 1 : 0;
          if (null == ua.field_d) {
            break L0;
          } else {
            if (ua.field_d.field_e) {
              nc.b(84);
              ee.c(4);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          stackOut_4_0 = this;
          stackIn_6_0 = stackOut_4_0;
          stackIn_5_0 = stackOut_4_0;
          if (ua.field_d == null) {
            stackOut_6_0 = this;
            stackOut_6_1 = 0;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            break L1;
          } else {
            stackOut_5_0 = this;
            stackOut_5_1 = 1;
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            break L1;
          }
        }
        L2: {
          this.b(stackIn_7_1 != 0, 1);
          if (param0 < -34) {
            break L2;
          } else {
            field_E = false;
            break L2;
          }
        }
        L3: {
          if (!lo.field_d) {
            break L3;
          } else {
            al.field_j.b(true);
            lo.field_d = false;
            break L3;
          }
        }
        L4: {
          if (r.c((byte) -87)) {
            this.g(false);
            if (!r.c((byte) -113)) {
              break L4;
            } else {
              return;
            }
          } else {
            break L4;
          }
        }
        L5: {
          L6: {
            this.j(true);
            if (un.field_f) {
              break L6;
            } else {
              gk.a(qc.field_o, (byte) 112);
              if (!al.field_j.a((byte) -54)) {
                break L5;
              } else {
                al.field_j.a(false);
                un.field_f = true;
                if (var4 == 0) {
                  break L5;
                } else {
                  break L6;
                }
              }
            }
          }
          L7: {
            L8: {
              if (um.field_t) {
                break L8;
              } else {
                if (!og.h(-26090)) {
                  break L7;
                } else {
                  break L8;
                }
              }
            }
            this.r(10);
            if (var4 == 0) {
              break L5;
            } else {
              break L7;
            }
          }
          if (al.field_j.a(23570)) {
            um.field_t = true;
            this.p(1);
            mc.a((byte) 126);
            break L5;
          } else {
            break L5;
          }
        }
        L9: {
          if (og.h(-26090)) {
            break L9;
          } else {
            L10: while (true) {
              L11: {
                L12: {
                  var5 = (e) ((Object) lp.field_wb.c(3));
                  if (var5 != null) {
                    break L12;
                  } else {
                    if (var4 != 0) {
                      break L11;
                    } else {
                      if (var4 == 0) {
                        break L9;
                      } else {
                        break L12;
                      }
                    }
                  }
                }
                df.a(var5, 4, -161);
                break L11;
              }
              if (var4 == 0) {
                continue L10;
              } else {
                break L9;
              }
            }
          }
        }
        L13: {
          fk.a(14114);
          tm.a((byte) 110, 0);
          if (!ui.a(false)) {
            break L13;
          } else {
            L14: {
              L15: {
                var2 = this.o(-105);
                if (0 == var2) {
                  break L15;
                } else {
                  if (-2 == (var2 ^ -1)) {
                    break L15;
                  } else {
                    break L14;
                  }
                }
              }
              this.b(var2, 1);
              break L14;
            }
            L16: {
              var3 = 0;
              if (-3 == (var2 ^ -1)) {
                var3 = 1;
                break L16;
              } else {
                break L16;
              }
            }
            L17: {
              if (this.q(73)) {
                var3 = 1;
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              if (ui.a(false)) {
                break L18;
              } else {
                var3 = 0;
                break L18;
              }
            }
            if (var3 == 0) {
              break L13;
            } else {
              qb.g(115);
              break L13;
            }
          }
        }
    }

    static {
    }
}
