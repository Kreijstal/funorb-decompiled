/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.lang.String;

abstract class u extends da {
    private boolean field_B;
    String field_y;
    private int field_w;
    private int field_r;
    private int field_p;
    static String field_u;
    static o field_x;
    private int field_C;
    static String field_o;
    private boolean field_n;
    static wi field_A;
    private long field_s;
    private int field_q;
    private boolean field_t;
    static String field_v;
    private static boolean[] field_z;
    static int[] field_m;
    private int field_l;

    private final int p(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_39_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_11_0 = 0;
        try {
          L0: {
            if (((u) this).field_c) {
              stackOut_3_0 = -1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (!h.b(true)) {
                stackOut_8_0 = -1;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              } else {
                if (param0 == -1) {
                  if (t.field_c) {
                    stackOut_16_0 = -1;
                    stackIn_17_0 = stackOut_16_0;
                    return stackIn_17_0;
                  } else {
                    var2_int = qh.a(pl.a(param0 + 1), ((u) this).field_r, ((u) this).field_B, -9, nf.a((byte) 125), true);
                    if (var2_int != -1) {
                      L1: {
                        if (var2_int == 0) {
                          break L1;
                        } else {
                          if (var2_int == 1) {
                            break L1;
                          } else {
                            L2: {
                              if (ri.field_b) {
                                break L2;
                              } else {
                                ((u) this).a("reconnect", (byte) 126);
                                break L2;
                              }
                            }
                            ci.a((byte) -128);
                            nj.a(10, bh.field_g, var2_int);
                            t.field_c = true;
                            sb.field_c = d.a((byte) 49) + 15000L;
                            stackOut_38_0 = var2_int;
                            stackIn_39_0 = stackOut_38_0;
                            break L0;
                          }
                        }
                      }
                      L3: {
                        if (ml.field_t != 11) {
                          break L3;
                        } else {
                          if (nl.field_r != 0) {
                            break L3;
                          } else {
                            vc.a(260);
                            break L3;
                          }
                        }
                      }
                      stackOut_33_0 = var2_int;
                      stackIn_34_0 = stackOut_33_0;
                      return stackIn_34_0;
                    } else {
                      stackOut_19_0 = -1;
                      stackIn_20_0 = stackOut_19_0;
                      return stackIn_20_0;
                    }
                  }
                } else {
                  stackOut_11_0 = 31;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var2, "u.KA(" + param0 + ')');
        }
        return stackIn_39_0;
    }

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, boolean param4) {
        RuntimeException var6 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.a(false, (byte) -124);
              if (param2) {
                break L1;
              } else {
                ((u) this).field_p = -29;
                break L1;
              }
            }
            L2: {
              if (param4) {
                this.l(110);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param3) {
                this.b((byte) 0);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (!param1) {
                break L4;
              } else {
                this.m(28135);
                break L4;
              }
            }
            L5: {
              if (!param0) {
                break L5;
              } else {
                this.k(-120);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var6, "u.FA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static ae b(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_11_0 = null;
        ae stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        ae stackOut_13_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              if (param1 <= -117) {
                break L1;
              } else {
                field_o = null;
                break L1;
              }
            }
            var2_int = param0.length();
            var3 = 0;
            L2: while (true) {
              L3: {
                if (var2_int <= var3) {
                  break L3;
                } else {
                  L4: {
                    var4 = param0.charAt(var3);
                    if (var4 < 48) {
                      break L4;
                    } else {
                      if (var4 <= 57) {
                        var3++;
                        if (var5 == 0) {
                          continue L2;
                        } else {
                          break L3;
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                  stackOut_10_0 = null;
                  stackIn_11_0 = stackOut_10_0;
                  return (ae) (Object) stackIn_11_0;
                }
              }
              stackOut_13_0 = tl.field_d;
              stackIn_14_0 = stackOut_13_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var2;
            stackOut_15_1 = new StringBuilder().append("u.SA(");
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L5;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ')');
        }
        return stackIn_14_0;
    }

    private final void b(byte param0) {
        try {
            field_z[2] = true;
            if (param0 != 0) {
                int discarded$0 = ((u) this).o(46);
            }
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "u.RA(" + param0 + ')');
        }
    }

    private final void j(int param0) {
        try {
            kc.field_G[17] = -1;
            kc.field_G[3] = -1;
            kc.field_G[16] = param0;
            kc.field_G[7] = -1;
            kc.field_G[18] = 1;
            kc.field_G[2] = -2;
            kc.field_G[10] = -1;
            kc.field_G[5] = -1;
            kc.field_G[8] = -2;
            kc.field_G[13] = -1;
            kc.field_G[11] = -1;
            kc.field_G[1] = 16;
            kc.field_G[4] = -1;
            kc.field_G[9] = -1;
            kc.field_G[6] = -2;
            kc.field_G[12] = -1;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "u.DA(" + param0 + ')');
        }
    }

    final void c(int param0, boolean param1) {
        RuntimeException var3 = null;
        java.awt.Container var3_ref = null;
        int var3_int = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        int stackIn_43_0 = 0;
        int stackIn_205_0 = 0;
        int stackIn_206_0 = 0;
        int stackIn_206_1 = 0;
        String stackIn_206_2 = null;
        int stackIn_208_0 = 0;
        int stackIn_208_1 = 0;
        String stackIn_208_2 = null;
        int stackIn_209_0 = 0;
        int stackIn_209_1 = 0;
        String stackIn_209_2 = null;
        int stackIn_209_3 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_42_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_204_0 = 0;
        int stackOut_202_0 = 0;
        int stackOut_205_0 = 0;
        int stackOut_205_1 = 0;
        String stackOut_205_2 = null;
        int stackOut_208_0 = 0;
        int stackOut_208_1 = 0;
        String stackOut_208_2 = null;
        int stackOut_208_3 = 0;
        int stackOut_206_0 = 0;
        int stackOut_206_1 = 0;
        String stackOut_206_2 = null;
        int stackOut_206_3 = 0;
        var5 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              if (null == oa.field_c) {
                break L1;
              } else {
                L2: {
                  if (null == ki.field_E) {
                    var3_ref = pe.e(152);
                    var4 = var3_ref.getSize();
                    oa.field_c.a((byte) -64, var4.height, var4.width);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                oa.field_c.a(true);
                break L1;
              }
            }
            L3: {
              t.a(-1);
              th.b((byte) -21);
              if (ta.a((byte) 60)) {
                break L3;
              } else {
                if (ml.field_t != 11) {
                  ti.a(param0 + 4122);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (null != vc.field_K) {
                gi.field_c = vc.field_K.a(-1);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (param0 == -4114) {
                break L5;
              } else {
                ((u) this).d((byte) 27);
                break L5;
              }
            }
            L6: {
              if (!wj.a(0)) {
                break L6;
              } else {
                L7: {
                  var3_int = ih.a((byte) -95) * 1200;
                  if (((u) this).field_n) {
                    break L7;
                  } else {
                    if (~ne.a((byte) 28) >= ~var3_int) {
                      break L6;
                    } else {
                      if (~var3_int <= ~mj.a((byte) 53)) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                ((u) this).field_n = false;
                ql.a(-92);
                ci.a((byte) -124);
                nj.a(param0 ^ -4124, df.field_e, 2);
                qh.a(false);
                t.field_c = true;
                sb.field_c = 15000L + d.a((byte) 25);
                break L6;
              }
            }
            L8: {
              L9: {
                if (nl.field_r == -1) {
                  break L9;
                } else {
                  if (nl.field_r == 0) {
                    break L9;
                  } else {
                    break L8;
                  }
                }
              }
              L10: {
                if (-1 != nl.field_r) {
                  stackOut_42_0 = 0;
                  stackIn_43_0 = stackOut_42_0;
                  break L10;
                } else {
                  stackOut_40_0 = 1;
                  stackIn_43_0 = stackOut_40_0;
                  break L10;
                }
              }
              L11: {
                var3_int = stackIn_43_0;
                nl.field_r = ab.c(14326);
                if (var3_int == 0) {
                  break L11;
                } else {
                  if (0 != nl.field_r) {
                    break L11;
                  } else {
                    if (11 != ml.field_t) {
                      break L11;
                    } else {
                      if (!h.b(true)) {
                        vc.a(260);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                  }
                }
              }
              if (nl.field_r == -1) {
                break L8;
              } else {
                if (0 == nl.field_r) {
                  break L8;
                } else {
                  sb.field_c = d.a((byte) 36) - -15000L;
                  break L8;
                }
              }
            }
            L12: {
              if (nl.field_r == -1) {
                break L12;
              } else {
                if (nl.field_r == 0) {
                  break L12;
                } else {
                  L13: {
                    if (ri.field_a < 10) {
                      break L13;
                    } else {
                      if (ml.field_t >= 10) {
                        L14: {
                          L15: {
                            ci.a((byte) -125);
                            if (nl.field_r == 3) {
                              break L15;
                            } else {
                              L16: {
                                if (nl.field_r == 4) {
                                  break L16;
                                } else {
                                  L17: {
                                    if (nl.field_r == 2) {
                                      break L17;
                                    } else {
                                      L18: {
                                        if (nl.field_r == 5) {
                                          break L18;
                                        } else {
                                          nj.a(param0 + 4124, mi.field_C, 256);
                                          if (var5 == 0) {
                                            break L14;
                                          } else {
                                            break L18;
                                          }
                                        }
                                      }
                                      nj.a(10, ki.field_L, 5);
                                      if (var5 == 0) {
                                        break L14;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                  nj.a(param0 ^ -4124, ne.field_d, 256);
                                  if (var5 == 0) {
                                    break L14;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                              nj.a(10, ld.field_f, 256);
                              if (var5 == 0) {
                                break L14;
                              } else {
                                break L15;
                              }
                            }
                          }
                          nj.a(10, ai.field_r, 256);
                          break L14;
                        }
                        t.field_c = true;
                        if (var5 == 0) {
                          break L12;
                        } else {
                          break L13;
                        }
                      } else {
                        break L12;
                      }
                    }
                  }
                  L19: {
                    if (3 != nl.field_r) {
                      break L19;
                    } else {
                      ((u) this).a("js5crc", (byte) 127);
                      if (var5 == 0) {
                        break L12;
                      } else {
                        break L19;
                      }
                    }
                  }
                  L20: {
                    if (nl.field_r != 4) {
                      break L20;
                    } else {
                      ((u) this).a("js5io", (byte) 127);
                      if (var5 == 0) {
                        break L12;
                      } else {
                        break L20;
                      }
                    }
                  }
                  L21: {
                    if (nl.field_r != 2) {
                      break L21;
                    } else {
                      ((u) this).a("js5connect_full", (byte) 126);
                      if (var5 == 0) {
                        break L12;
                      } else {
                        break L21;
                      }
                    }
                  }
                  L22: {
                    if (nl.field_r != 5) {
                      break L22;
                    } else {
                      ((u) this).a("outofdate", (byte) 126);
                      if (var5 == 0) {
                        break L12;
                      } else {
                        break L22;
                      }
                    }
                  }
                  ((u) this).a("js5connect", (byte) 126);
                  break L12;
                }
              }
            }
            L23: {
              L24: {
                L25: {
                  if (nl.field_r == -1) {
                    break L25;
                  } else {
                    if (nl.field_r != 0) {
                      break L24;
                    } else {
                      break L25;
                    }
                  }
                }
                if (!h.b(true)) {
                  break L23;
                } else {
                  break L24;
                }
              }
              if (~sb.field_c >= ~d.a((byte) 22)) {
                t.field_c = false;
                if (-1 == nl.field_r) {
                  break L23;
                } else {
                  if (nl.field_r == 0) {
                    break L23;
                  } else {
                    nl.field_r = -1;
                    oh.a((byte) -117);
                    break L23;
                  }
                }
              } else {
                break L23;
              }
            }
            L26: {
              if (nl.field_r != 0) {
                break L26;
              } else {
                if (!h.b(true)) {
                  cb.field_c = false;
                  break L26;
                } else {
                  break L26;
                }
              }
            }
            L27: {
              if (ri.field_a == 0) {
                if (!ab.d(param0 + 3988)) {
                  break L27;
                } else {
                  ri.field_a = 1;
                  break L27;
                }
              } else {
                break L27;
              }
            }
            L28: {
              if (ri.field_a == 1) {
                L29: {
                  if (0 != mh.field_tb) {
                    qh.field_c = si.a(46, hj.field_a);
                    break L29;
                  } else {
                    break L29;
                  }
                }
                ub.field_x = l.a(sf.field_g, param0 ^ 1784758027, false, 1, true);
                vj.field_b = l.a(jg.field_o, -1784753947, false, 1, true);
                cc.field_a = l.a(rk.field_n, param0 + -1784749833, false, 1, true);
                bb.field_h = ub.field_x;
                ri.field_a = 2;
                md.field_c = vj.field_b;
                break L28;
              } else {
                break L28;
              }
            }
            L30: {
              if (ri.field_a != 2) {
                break L30;
              } else {
                L31: {
                  if (qh.field_c != null) {
                    if (!qh.field_c.b(17820)) {
                      break L31;
                    } else {
                      L32: {
                        if (!qh.field_c.c(-1, "")) {
                          break L32;
                        } else {
                          if (qh.field_c.a((byte) 29, "")) {
                            ea.a(0, qh.field_c);
                            qh.field_c = null;
                            jj.b(param0 + 4114);
                            if (var5 == 0) {
                              break L31;
                            } else {
                              break L32;
                            }
                          } else {
                            break L31;
                          }
                        }
                      }
                      qh.field_c = null;
                      break L31;
                    }
                  } else {
                    break L31;
                  }
                }
                if (null == qh.field_c) {
                  ri.field_a = 3;
                  break L30;
                } else {
                  break L30;
                }
              }
            }
            L33: {
              if (3 == ri.field_a) {
                if (!of.a(ub.field_x, cc.field_a, (byte) -1, vj.field_b)) {
                  break L33;
                } else {
                  if (lc.a(param0 + 4114, cc.field_a)) {
                    L34: {
                      L35: {
                        pg.a(-382);
                        mi.d(3);
                        vc.field_M = false;
                        dg.field_a = wj.field_G;
                        dj.a(param0 ^ -6284, cc.field_a, ub.field_x, vj.field_b, pf.field_g);
                        if (rf.field_c) {
                          break L35;
                        } else {
                          if (null != l.field_K) {
                            break L35;
                          } else {
                            break L34;
                          }
                        }
                      }
                      L36: {
                        if (rf.field_c) {
                          stackOut_204_0 = 0;
                          stackIn_205_0 = stackOut_204_0;
                          break L36;
                        } else {
                          stackOut_202_0 = 1;
                          stackIn_205_0 = stackOut_202_0;
                          break L36;
                        }
                      }
                      L37: {
                        stackOut_205_0 = stackIn_205_0;
                        stackOut_205_1 = 126;
                        stackOut_205_2 = l.field_K;
                        stackIn_208_0 = stackOut_205_0;
                        stackIn_208_1 = stackOut_205_1;
                        stackIn_208_2 = stackOut_205_2;
                        stackIn_206_0 = stackOut_205_0;
                        stackIn_206_1 = stackOut_205_1;
                        stackIn_206_2 = stackOut_205_2;
                        if (rf.field_c) {
                          stackOut_208_0 = stackIn_208_0;
                          stackOut_208_1 = stackIn_208_1;
                          stackOut_208_2 = (String) (Object) stackIn_208_2;
                          stackOut_208_3 = 0;
                          stackIn_209_0 = stackOut_208_0;
                          stackIn_209_1 = stackOut_208_1;
                          stackIn_209_2 = stackOut_208_2;
                          stackIn_209_3 = stackOut_208_3;
                          break L37;
                        } else {
                          stackOut_206_0 = stackIn_206_0;
                          stackOut_206_1 = stackIn_206_1;
                          stackOut_206_2 = (String) (Object) stackIn_206_2;
                          stackOut_206_3 = 1;
                          stackIn_209_0 = stackOut_206_0;
                          stackIn_209_1 = stackOut_206_1;
                          stackIn_209_2 = stackOut_206_2;
                          stackIn_209_3 = stackOut_206_3;
                          break L37;
                        }
                      }
                      ai.a(stackIn_209_0 != 0, (byte) stackIn_209_1, stackIn_209_2, stackIn_209_3 != 0);
                      break L34;
                    }
                    L38: {
                      if (!mj.field_c) {
                        break L38;
                      } else {
                        jf.a(param0 ^ -4158);
                        break L38;
                      }
                    }
                    L39: {
                      if (null != pk.field_n) {
                        break L39;
                      } else {
                        pk.field_n = sl.d((byte) 126);
                        mk.field_f = u.r(8300);
                        break L39;
                      }
                    }
                    ec.a(cc.field_a, (byte) -82, mk.field_f, pk.field_n);
                    vj.field_b = null;
                    cc.field_a = null;
                    ub.field_x = null;
                    ae.a((java.applet.Applet) this, param0 ^ -4213);
                    jj.b(0);
                    ri.field_a = 10;
                    break L33;
                  } else {
                    break L33;
                  }
                }
              } else {
                break L33;
              }
            }
            L40: {
              if (10 == ri.field_a) {
                L41: {
                  if (mh.field_tb == 0) {
                    break L41;
                  } else {
                    oh.field_b = si.a(90, ni.field_b);
                    break L41;
                  }
                }
                ri.field_a = 11;
                break L40;
              } else {
                break L40;
              }
            }
            L42: {
              if (ri.field_a == 11) {
                L43: {
                  L44: {
                    if (null == oh.field_b) {
                      break L44;
                    } else {
                      if (!oh.field_b.b(17820)) {
                        break L43;
                      } else {
                        if (!oh.field_b.d(-111)) {
                          break L43;
                        } else {
                          break L44;
                        }
                      }
                    }
                  }
                  f.field_c = true;
                  ri.field_a = 12;
                  if (var5 == 0) {
                    break L42;
                  } else {
                    break L43;
                  }
                }
                ok.a(de.a(param0 ^ 4150, td.field_e, oh.field_b, bl.field_c), 0.0f, 0);
                break L42;
              } else {
                break L42;
              }
            }
            L45: {
              if (ri.field_a == 12) {
                if (f.field_c) {
                  break L45;
                } else {
                  ri.field_a = 13;
                  break L45;
                }
              } else {
                break L45;
              }
            }
            L46: {
              if (13 == ri.field_a) {
                L47: {
                  var3_int = 1;
                  if (null != ih.field_b) {
                    var3_int = ih.field_b.a(true) ? 1 : 0;
                    ok.a(ih.field_b.field_i, ih.field_b.field_k, 0);
                    break L47;
                  } else {
                    break L47;
                  }
                }
                if (var3_int != 0) {
                  ri.field_a = 20;
                  break L46;
                } else {
                  break L46;
                }
              } else {
                break L46;
              }
            }
            L48: {
              if (param1) {
                break L48;
              } else {
                if (tj.field_F) {
                  ka.a(wizardrun.field_G, 8053);
                  ((u) this).e(88);
                  jf.a(false, wizardrun.field_G);
                  break L48;
                } else {
                  break L48;
                }
              }
            }
            L49: {
              if (!field_z[8]) {
                break L49;
              } else {
                di.a(8);
                break L49;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var3, "u.MA(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, wl param1, wl param2) {
        RuntimeException var3 = null;
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
        try {
          L0: {
            L1: {
              if (null != param2.field_c) {
                param2.a(false);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              param2.field_c = param1.field_c;
              param2.field_b = param1;
              if (param0 == 74) {
                break L2;
              } else {
                u.n(-127);
                break L2;
              }
            }
            param2.field_c.field_b = param2;
            param2.field_b.field_c = param2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("u.JA(").append(param0).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
    }

    private final void k(int param0) {
        try {
            field_z[5] = true;
            if (param0 > -77) {
                u.n(111);
            }
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "u.T(" + param0 + ')');
        }
    }

    private final void a(boolean param0, byte param1) {
        try {
            field_z[8] = param0;
            field_z[0] = true;
            field_z[17] = true;
            field_z[16] = true;
            field_z[18] = true;
            int var3_int = 92 % ((param1 - -62) / 56);
            field_z[3] = true;
            field_z[7] = true;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "u.W(" + param0 + ',' + param1 + ')');
        }
    }

    private final void q(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            L1: {
              var2_int = nk.field_N.f(255);
              if ((var2_int & 1) == 0) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_4_0 = stackOut_1_0;
                break L1;
              }
            }
            var3 = stackIn_4_0;
            var4 = -1 + gd.field_c;
            var5 = new byte[var4];
            if (param0 > 3) {
              nk.field_N.a(0, var4, 0, var5);
              sh.a(var3 != 0, 122, nf.a((byte) 113, var5), jg.f(1));
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw bd.a((Throwable) (Object) runtimeException, "u.LA(" + param0 + ')');
        }
    }

    final static void a(va param0, int param1) {
        try {
            Exception exception = null;
            RuntimeException runtimeException = null;
            byte[] var2 = null;
            int var3_int = 0;
            int var4 = 0;
            int var5 = 0;
            int stackIn_5_0 = 0;
            byte stackIn_5_1 = 0;
            int stackIn_15_0 = 0;
            int stackIn_15_1 = 0;
            RuntimeException stackIn_31_0 = null;
            StringBuilder stackIn_31_1 = null;
            RuntimeException stackIn_33_0 = null;
            StringBuilder stackIn_33_1 = null;
            RuntimeException stackIn_34_0 = null;
            StringBuilder stackIn_34_1 = null;
            String stackIn_34_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_4_0 = 0;
            byte stackOut_4_1 = 0;
            int stackOut_14_0 = 0;
            int stackOut_14_1 = 0;
            RuntimeException stackOut_30_0 = null;
            StringBuilder stackOut_30_1 = null;
            RuntimeException stackOut_33_0 = null;
            StringBuilder stackOut_33_1 = null;
            String stackOut_33_2 = null;
            RuntimeException stackOut_31_0 = null;
            StringBuilder stackOut_31_1 = null;
            String stackOut_31_2 = null;
            var5 = wizardrun.field_H;
            try {
              L0: {
                L1: {
                  L2: {
                    var2 = new byte[24];
                    if (ub.field_t == null) {
                      break L2;
                    } else {
                      try {
                        L3: {
                          ub.field_t.a(0L, (byte) 113);
                          ub.field_t.a(var2, 9350);
                          var3_int = 0;
                          L4: while (true) {
                            L5: {
                              L6: {
                                if (var3_int >= 24) {
                                  break L6;
                                } else {
                                  stackOut_4_0 = 0;
                                  stackOut_4_1 = var2[var3_int];
                                  stackIn_15_0 = stackOut_4_0;
                                  stackIn_15_1 = stackOut_4_1;
                                  stackIn_5_0 = stackOut_4_0;
                                  stackIn_5_1 = stackOut_4_1;
                                  if (var5 != 0) {
                                    break L5;
                                  } else {
                                    L7: {
                                      if (stackIn_5_0 == stackIn_5_1) {
                                        break L7;
                                      } else {
                                        if (var5 == 0) {
                                          break L6;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                    var3_int++;
                                    if (var5 == 0) {
                                      continue L4;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                              stackOut_14_0 = -25;
                              stackOut_14_1 = ~var3_int;
                              stackIn_15_0 = stackOut_14_0;
                              stackIn_15_1 = stackOut_14_1;
                              break L5;
                            }
                            if (stackIn_15_0 >= stackIn_15_1) {
                              throw new IOException();
                            } else {
                              decompiledRegionSelector0 = 0;
                              break L3;
                            }
                          }
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L8: {
                          exception = (Exception) (Object) decompiledCaughtException;
                          var4 = 0;
                          L9: while (true) {
                            L10: {
                              if (var4 >= 24) {
                                break L10;
                              } else {
                                var2[var4] = (byte) -1;
                                var4++;
                                if (var5 != 0) {
                                  decompiledRegionSelector0 = 1;
                                  break L8;
                                } else {
                                  if (var5 == 0) {
                                    continue L9;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                            }
                            decompiledRegionSelector0 = 0;
                            break L8;
                          }
                        }
                      }
                      if (decompiledRegionSelector0 == 0) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  param0.a(var2, 0, 24, -99);
                  break L1;
                }
                L11: {
                  if (param1 == -18) {
                    break L11;
                  } else {
                    int discarded$3 = u.r(5);
                    break L11;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L12: {
                runtimeException = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_30_0 = (RuntimeException) runtimeException;
                stackOut_30_1 = new StringBuilder().append("u.HA(");
                stackIn_33_0 = stackOut_30_0;
                stackIn_33_1 = stackOut_30_1;
                stackIn_31_0 = stackOut_30_0;
                stackIn_31_1 = stackOut_30_1;
                if (param0 == null) {
                  stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
                  stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
                  stackOut_33_2 = "null";
                  stackIn_34_0 = stackOut_33_0;
                  stackIn_34_1 = stackOut_33_1;
                  stackIn_34_2 = stackOut_33_2;
                  break L12;
                } else {
                  stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
                  stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
                  stackOut_31_2 = "{...}";
                  stackIn_34_0 = stackOut_31_0;
                  stackIn_34_1 = stackOut_31_1;
                  stackIn_34_2 = stackOut_31_2;
                  break L12;
                }
              }
              throw bd.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, byte param1, String param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var4_int = -125 / ((param1 - -9) / 49);
            this.a(param0, 480, param2, (byte) 19, 640);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("u.U(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    private final void m(int param0) {
        try {
            field_z[4] = true;
            if (param0 != 28135) {
                field_m = null;
            }
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "u.AA(" + param0 + ')');
        }
    }

    private final static int r(int param0) {
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 8300) {
                break L1;
              } else {
                u.a((byte) 86, (wl) null, (wl) null);
                break L1;
              }
            }
            stackOut_3_0 = sk.field_v;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var1, "u.TA(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    private final void c(byte param0) {
        String var2 = null;
        try {
            int var3 = -90 / ((-61 - param0) / 53);
            var2 = vl.a(-106);
            wl.a(var2, jg.f(1), (byte) -107);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "u.NA(" + param0 + ')');
        }
    }

    private final int a(int param0, boolean param1, boolean param2) {
        try {
            RuntimeException var4 = null;
            int var4_int = 0;
            Exception var5 = null;
            int var5_int = 0;
            Boolean var6 = null;
            va var6_ref = null;
            String var7 = null;
            int var8 = 0;
            int stackIn_107_0 = 0;
            int stackIn_110_0 = 0;
            int stackIn_112_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_106_0 = 0;
            int stackOut_111_0 = 0;
            int stackOut_109_0 = 0;
            var8 = wizardrun.field_H;
            try {
              L0: {
                var4_int = ad.a(mh.field_tb, gi.field_c, param1, param0 + -6426);
                if (var4_int == 0) {
                  throw new IllegalStateException();
                } else {
                  L1: {
                    if (1 == var4_int) {
                      L2: {
                        var5_int = mk.a(vf.a((byte) -68), -124, n.a((byte) 12));
                        if (var5_int != -1) {
                          ni.a(bh.field_g, -101, pd.field_I, var5_int);
                          pd.field_I = null;
                          bh.field_g = null;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      var6 = df.b((byte) -52);
                      if (null != var6) {
                        vg.a(var6.booleanValue(), 3289);
                        break L1;
                      } else {
                        break L1;
                      }
                    } else {
                      break L1;
                    }
                  }
                  L3: {
                    if (var4_int != 2) {
                      break L3;
                    } else {
                      var5_int = qk.a(pl.a(param0 + -6498), ((u) this).field_r, nf.a((byte) 123), dg.a(-21), sc.a(0), param0 + -6498, w.c(-126));
                      if (var5_int == -1) {
                        break L3;
                      } else {
                        ve.a(bh.field_g, pd.field_I, (byte) -112, var5_int);
                        bh.field_g = null;
                        pd.field_I = null;
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (var4_int == 3) {
                      L5: {
                        if (-1 == nl.field_r) {
                          break L5;
                        } else {
                          if (nl.field_r == 0) {
                            break L5;
                          } else {
                            nl.field_r = -1;
                            oh.a((byte) -128);
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (!param2) {
                          break L6;
                        } else {
                          t.field_c = false;
                          if (var8 == 0) {
                            break L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var5_int = qh.a(pl.a(0), ((u) this).field_r, ((u) this).field_B, -9, nf.a((byte) 124), false);
                      if (var5_int == -1) {
                        break L4;
                      } else {
                        L7: {
                          if (0 == var5_int) {
                            break L7;
                          } else {
                            nj.a(param0 + -6488, bh.field_g, var5_int);
                            bh.field_g = null;
                            if (var8 == 0) {
                              break L4;
                            } else {
                              break L7;
                            }
                          }
                        }
                        h.field_m = pe.field_D;
                        vc.a(260);
                        ml.field_t = 10;
                        qb.field_p = false;
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                  L8: {
                    if (var4_int == 4) {
                      L9: {
                        if (pf.field_g) {
                          break L9;
                        } else {
                          qb.field_p = true;
                          ml.field_t = 10;
                          if (var8 == 0) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                      cd.a(jg.f(param0 + -6497), (byte) -113);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L10: {
                    if (5 != var4_int) {
                      break L10;
                    } else {
                      bc.a(125, jg.f(1));
                      break L10;
                    }
                  }
                  L11: {
                    if (var4_int == 6) {
                      if (!vc.field_M) {
                        break L11;
                      } else {
                        ml.field_t = 10;
                        break L11;
                      }
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (var4_int == 7) {
                      lb.a(param0 + -6438, jg.f(1));
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (var4_int == 8) {
                      cd.a(jg.f(1), (byte) -113);
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    if (var4_int != 9) {
                      break L14;
                    } else {
                      wg.a(param0 ^ 7600, jg.f(1));
                      break L14;
                    }
                  }
                  L15: {
                    if (var4_int != 10) {
                      break L15;
                    } else {
                      n.field_b.c((byte) -118, 17);
                      break L15;
                    }
                  }
                  L16: {
                    if (var4_int == 11) {
                      ga.a(jg.f(1), (byte) -40);
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  L17: {
                    if (param0 == 6498) {
                      break L17;
                    } else {
                      this.l(-45);
                      break L17;
                    }
                  }
                  L18: {
                    if (var4_int != 12) {
                      break L18;
                    } else {
                      rb.a(jj.a(true), -1926289535, jg.f(1));
                      break L18;
                    }
                  }
                  L19: {
                    if (var4_int != 13) {
                      break L19;
                    } else {
                      try {
                        L20: {
                          L21: {
                            if (null == cb.field_b) {
                              cb.field_b = new ud(ld.field_g, new java.net.URL(((u) this).getCodeBase(), "countrylist.ws"), 5000);
                              break L21;
                            } else {
                              break L21;
                            }
                          }
                          L22: {
                            var5_int = cb.field_b.c(81) ? 1 : 0;
                            if (var5_int != 0) {
                              L23: {
                                L24: {
                                  var6_ref = cb.field_b.b(-4);
                                  if (null == var6_ref) {
                                    break L24;
                                  } else {
                                    var7 = bi.a(0, var6_ref.field_m, var6_ref.field_k, false);
                                    gf.b(9, var7);
                                    if (var8 == 0) {
                                      break L23;
                                    } else {
                                      break L24;
                                    }
                                  }
                                }
                                gf.b(param0 ^ 6507, (String) null);
                                break L23;
                              }
                              cb.field_b = null;
                              break L22;
                            } else {
                              break L22;
                            }
                          }
                          break L20;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L25: {
                          var5 = (Exception) (Object) decompiledCaughtException;
                          rg.a((Throwable) (Object) var5, "S1", param0 ^ -6996);
                          gf.b(9, (String) null);
                          cb.field_b = null;
                          break L25;
                        }
                      }
                      break L19;
                    }
                  }
                  L26: {
                    if (var4_int == 15) {
                      ml.field_t = 10;
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                  if (var4_int == 16) {
                    stackOut_106_0 = 1;
                    stackIn_107_0 = stackOut_106_0;
                    return stackIn_107_0;
                  } else {
                    if (var4_int != 17) {
                      stackOut_111_0 = 0;
                      stackIn_112_0 = stackOut_111_0;
                      break L0;
                    } else {
                      stackOut_109_0 = 2;
                      stackIn_110_0 = stackOut_109_0;
                      return stackIn_110_0;
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (RuntimeException) (Object) decompiledCaughtException;
              throw bd.a((Throwable) (Object) var4, "u.GA(" + param0 + ',' + param1 + ',' + param2 + ')');
            }
            return stackIn_112_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(boolean param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        wc var3 = null;
        int var4 = 0;
        int stackIn_80_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_85_1 = 0;
        wc stackIn_86_0 = null;
        wc stackIn_88_0 = null;
        wc stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_79_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_84_1 = 0;
        int stackOut_80_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_82_1 = 0;
        wc stackOut_85_0 = null;
        wc stackOut_88_0 = null;
        int stackOut_88_1 = 0;
        wc stackOut_86_0 = null;
        int stackOut_86_1 = 0;
        var4 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_m = null;
                break L1;
              }
            }
            L2: {
              var2_int = ra.field_k;
              if (var2_int >= 64) {
                break L2;
              } else {
                if (field_z[var2_int]) {
                  if (var2_int != 0) {
                    L3: {
                      L4: {
                        if (var2_int != 1) {
                          break L4;
                        } else {
                          bk.b(124);
                          if (var4 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (var2_int != 2) {
                          break L5;
                        } else {
                          fg.a((byte) 112);
                          if (var4 == 0) {
                            break L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (var2_int != 3) {
                          break L6;
                        } else {
                          pd.d(false);
                          if (var4 == 0) {
                            break L3;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if (var2_int == 4) {
                          break L7;
                        } else {
                          L8: {
                            if (var2_int == 5) {
                              break L8;
                            } else {
                              L9: {
                                if (var2_int == 6) {
                                  break L9;
                                } else {
                                  L10: {
                                    if (7 != var2_int) {
                                      break L10;
                                    } else {
                                      this.c((byte) -117);
                                      if (var4 == 0) {
                                        break L3;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                  L11: {
                                    if (8 == var2_int) {
                                      break L11;
                                    } else {
                                      L12: {
                                        if (16 != var2_int) {
                                          break L12;
                                        } else {
                                          qi.e(12582);
                                          if (var4 == 0) {
                                            break L3;
                                          } else {
                                            break L12;
                                          }
                                        }
                                      }
                                      L13: {
                                        if (var2_int == 11) {
                                          break L13;
                                        } else {
                                          if (12 == var2_int) {
                                            break L13;
                                          } else {
                                            L14: {
                                              if (var2_int == 13) {
                                                break L14;
                                              } else {
                                                L15: {
                                                  if (var2_int == 17) {
                                                    break L15;
                                                  } else {
                                                    L16: {
                                                      if (var2_int == 18) {
                                                        break L16;
                                                      } else {
                                                        rg.a((Throwable) null, "MGS1: " + ni.c(6), -562);
                                                        ql.a(-42);
                                                        if (var4 == 0) {
                                                          break L3;
                                                        } else {
                                                          break L16;
                                                        }
                                                      }
                                                    }
                                                    ck.a(2046877441);
                                                    if (var4 == 0) {
                                                      break L3;
                                                    } else {
                                                      break L15;
                                                    }
                                                  }
                                                }
                                                this.q(108);
                                                if (var4 == 0) {
                                                  break L3;
                                                } else {
                                                  break L14;
                                                }
                                              }
                                            }
                                            jk.a(true);
                                            if (var4 == 0) {
                                              break L3;
                                            } else {
                                              break L13;
                                            }
                                          }
                                        }
                                      }
                                      L17: {
                                        stackOut_79_0 = -2;
                                        stackIn_84_0 = stackOut_79_0;
                                        stackIn_80_0 = stackOut_79_0;
                                        if (var2_int != 12) {
                                          stackOut_84_0 = stackIn_84_0;
                                          stackOut_84_1 = 0;
                                          stackIn_85_0 = stackOut_84_0;
                                          stackIn_85_1 = stackOut_84_1;
                                          break L17;
                                        } else {
                                          stackOut_80_0 = stackIn_80_0;
                                          stackIn_82_0 = stackOut_80_0;
                                          stackOut_82_0 = stackIn_82_0;
                                          stackOut_82_1 = 1;
                                          stackIn_85_0 = stackOut_82_0;
                                          stackIn_85_1 = stackOut_82_1;
                                          break L17;
                                        }
                                      }
                                      L18: {
                                        var3 = cf.a(stackIn_85_0, stackIn_85_1 != 0);
                                        stackOut_85_0 = (wc) var3;
                                        stackIn_88_0 = stackOut_85_0;
                                        stackIn_86_0 = stackOut_85_0;
                                        if (param0) {
                                          stackOut_88_0 = (wc) (Object) stackIn_88_0;
                                          stackOut_88_1 = 0;
                                          stackIn_89_0 = stackOut_88_0;
                                          stackIn_89_1 = stackOut_88_1;
                                          break L18;
                                        } else {
                                          stackOut_86_0 = (wc) (Object) stackIn_86_0;
                                          stackOut_86_1 = 1;
                                          stackIn_89_0 = stackOut_86_0;
                                          stackIn_89_1 = stackOut_86_1;
                                          break L18;
                                        }
                                      }
                                      sc.a(stackIn_89_0, stackIn_89_1 != 0);
                                      if (var4 == 0) {
                                        break L3;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  mi.a(-21284, (va) (Object) nk.field_N, ld.field_g, gd.field_c);
                                  if (var4 == 0) {
                                    break L3;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              kk.o(-114);
                              if (var4 == 0) {
                                break L3;
                              } else {
                                break L8;
                              }
                            }
                          }
                          rk.c(-2);
                          if (var4 == 0) {
                            break L3;
                          } else {
                            break L7;
                          }
                        }
                      }
                      pj.f(-17144);
                      break L3;
                    }
                    break L0;
                  } else {
                    return;
                  }
                } else {
                  break L2;
                }
              }
            }
            rg.a((Throwable) null, "MGS2: " + ni.c(6), -562);
            ql.a(-79);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var2, "u.EA(" + param0 + ')');
        }
    }

    final int a(byte param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 > 0) {
              stackOut_3_0 = this.a(6498, param1, true);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = -74;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var3, "u.BA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final void a(int param0, boolean param1, int param2, int param3, boolean param4, int param5, int param6, int param7) {
        RuntimeException runtimeException = null;
        java.awt.Frame var9 = null;
        int stackIn_1_0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        try {
          L0: {
            L1: {
              var9 = new java.awt.Frame("Jagex");
              var9.pack();
              var9.dispose();
              ((u) this).setBackground(java.awt.Color.black);
              mh.field_tb = ((u) this).field_p;
              stackOut_0_0 = mh.field_tb;
              stackIn_3_0 = stackOut_0_0;
              stackIn_1_0 = stackOut_0_0;
              if (param4) {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_1_0 = stackIn_1_0;
                stackOut_1_1 = 1;
                stackIn_4_0 = stackOut_1_0;
                stackIn_4_1 = stackOut_1_1;
                break L1;
              }
            }
            me.a(stackIn_4_0, stackIn_4_1 != 0);
            i.a(mh.field_tb, ((u) this).field_l, param6, param1, ((u) this).field_q, ((u) this).field_s, ((u) this).field_w, ((u) this).field_y, 5000, 5000, ((u) this).field_t, ((u) this).field_C, 64, ld.field_g);
            qc.a(((u) this).field_w, param6, ((u) this).field_C, ld.field_g, ((u) this).field_l, ((u) this).field_y, true, ((u) this).field_q, mh.field_tb);
            of.d(0);
            vc.field_K = qj.a(param4);
            jf.a(param4, wizardrun.field_G);
            sf.field_g = param7;
            jg.field_o = param2;
            ni.field_b = param3;
            rk.field_n = param0;
            hj.field_a = param5;
            this.j(-1);
            rl.a(-19);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw bd.a((Throwable) (Object) runtimeException, "u.OA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    protected u() {
    }

    public static void n(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_u = null;
              field_A = null;
              field_x = null;
              field_z = null;
              field_v = null;
              if (param0 == -18084) {
                break L1;
              } else {
                field_v = null;
                break L1;
              }
            }
            field_m = null;
            field_o = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var1, "u.V(" + param0 + ')');
        }
    }

    final int o(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_35_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_34_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == -10618) {
                break L1;
              } else {
                ((u) this).c(88, true);
                break L1;
              }
            }
            L2: {
              L3: {
                var2_int = this.p(-1);
                if (var2_int == 0) {
                  break L3;
                } else {
                  if (var2_int != 1) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (field_z[1]) {
                  rb.a(2, (byte) -85);
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (!field_z[2]) {
                  break L5;
                } else {
                  fh.b(-28323, 3);
                  break L5;
                }
              }
              L6: {
                if (!field_z[3]) {
                  break L6;
                } else {
                  ei.a((byte) 51, 4);
                  break L6;
                }
              }
              L7: {
                if (!field_z[4]) {
                  break L7;
                } else {
                  ud.a(5, param0 ^ 10496);
                  break L7;
                }
              }
              L8: {
                if (field_z[5]) {
                  oe.a((byte) -86, 6);
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (field_z[6]) {
                  fh.c(7, param0 + 10618);
                  break L9;
                } else {
                  break L9;
                }
              }
              if (field_z[8]) {
                gh.a((byte) 99);
                break L2;
              } else {
                break L2;
              }
            }
            stackOut_34_0 = var2_int;
            stackIn_35_0 = stackOut_34_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var2, "u.IA(" + param0 + ')');
        }
        return stackIn_35_0;
    }

    private final void a(int param0, int param1, String param2, byte param3, int param4) {
        Exception var6 = null;
        RuntimeException var6_ref = null;
        String var6_ref2 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        try {
          try {
            L0: {
              if (!((u) this).g(param3 ^ -36)) {
                return;
              } else {
                L1: {
                  L2: {
                    ((u) this).field_y = ((u) this).getCodeBase().getHost();
                    var6_ref2 = ((u) this).field_y.toLowerCase();
                    stackOut_3_0 = this;
                    stackIn_7_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var6_ref2.equals((Object) (Object) "jagex.com")) {
                      break L2;
                    } else {
                      stackOut_4_0 = this;
                      stackIn_9_0 = stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (!var6_ref2.endsWith(".jagex.com")) {
                        stackOut_9_0 = this;
                        stackOut_9_1 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        break L1;
                      } else {
                        stackOut_5_0 = this;
                        stackIn_7_0 = stackOut_5_0;
                        break L2;
                      }
                    }
                  }
                  stackOut_7_0 = this;
                  stackOut_7_1 = 1;
                  stackIn_10_0 = stackOut_7_0;
                  stackIn_10_1 = stackOut_7_1;
                  break L1;
                }
                L3: {
                  ((u) this).field_B = stackIn_10_1 != 0;
                  ((u) this).field_C = Integer.parseInt(((u) this).getParameter("gameport1"));
                  ((u) this).field_w = Integer.parseInt(((u) this).getParameter("gameport2"));
                  var7 = ((u) this).getParameter("servernum");
                  if (param3 == 19) {
                    break L3;
                  } else {
                    field_m = null;
                    break L3;
                  }
                }
                L4: {
                  if (var7 != null) {
                    ((u) this).field_l = Integer.parseInt(var7);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  ((u) this).field_q = Integer.parseInt(((u) this).getParameter("gamecrc"));
                  ((u) this).field_s = Long.parseLong(((u) this).getParameter("instanceid"));
                  ((u) this).field_t = ((u) this).getParameter("member").equals((Object) (Object) "yes");
                  var8 = ((u) this).getParameter("lang");
                  if (null != var8) {
                    ((u) this).field_p = Integer.parseInt(var8);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (((u) this).field_p < 5) {
                    break L6;
                  } else {
                    ((u) this).field_p = 0;
                    break L6;
                  }
                }
                L7: {
                  var9 = ((u) this).getParameter("affid");
                  if (null != var9) {
                    ((u) this).field_r = Integer.parseInt(var9);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                mj.field_c = Boolean.valueOf(((u) this).getParameter("simplemode")).booleanValue();
                ((u) this).a(((u) this).field_q, param0, (byte) -100, param2, param1, param4, 32);
                break L0;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            L8: {
              var6 = (Exception) (Object) decompiledCaughtException;
              rg.a((Throwable) (Object) var6, (String) null, -562);
              ((u) this).a("crash", (byte) 127);
              break L8;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L9: {
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var6_ref;
            stackOut_32_1 = new StringBuilder().append("u.CA(").append(param0).append(',').append(param1).append(',');
            stackIn_35_0 = stackOut_32_0;
            stackIn_35_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param2 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L9;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_36_0 = stackOut_33_0;
              stackIn_36_1 = stackOut_33_1;
              stackIn_36_2 = stackOut_33_2;
              break L9;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void l(int param0) {
        try {
            field_z[1] = true;
            if (param0 < 88) {
                u.n(63);
            }
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "u.PA(" + param0 + ')');
        }
    }

    final void d(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        var3 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              L2: {
                if (!ph.a((byte) 89)) {
                  break L2;
                } else {
                  L3: {
                    stackOut_2_0 = this;
                    stackOut_2_1 = 6498;
                    stackIn_7_0 = stackOut_2_0;
                    stackIn_7_1 = stackOut_2_1;
                    stackIn_3_0 = stackOut_2_0;
                    stackIn_3_1 = stackOut_2_1;
                    if (null == ki.field_E) {
                      stackOut_7_0 = this;
                      stackOut_7_1 = stackIn_7_1;
                      stackOut_7_2 = 0;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      stackIn_8_2 = stackOut_7_2;
                      break L3;
                    } else {
                      stackOut_3_0 = this;
                      stackOut_3_1 = stackIn_3_1;
                      stackIn_5_0 = stackOut_3_0;
                      stackIn_5_1 = stackOut_3_1;
                      stackOut_5_0 = this;
                      stackOut_5_1 = stackIn_5_1;
                      stackOut_5_2 = 1;
                      stackIn_8_0 = stackOut_5_0;
                      stackIn_8_1 = stackOut_5_1;
                      stackIn_8_2 = stackOut_5_2;
                      break L3;
                    }
                  }
                  int discarded$3 = this.a(stackIn_8_1, stackIn_8_2 != 0, false);
                  if (var3 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (ri.field_a >= 10) {
                L4: {
                  if (w.a((byte) -117)) {
                    break L4;
                  } else {
                    qa.c(250);
                    if (var3 == 0) {
                      break L1;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (ml.field_t != 0) {
                    break L5;
                  } else {
                    int discarded$4 = this.a(6498, false, false);
                    if (var3 == 0) {
                      break L1;
                    } else {
                      break L5;
                    }
                  }
                }
                ac.a(0, gi.field_c);
                break L1;
              } else {
                break L1;
              }
            }
            var2_int = 95 / ((param0 - -52) / 50);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var2, "u.QA(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "The Beach";
        field_m = new int[]{500, 100, 100, 300, 500, 100, 200, 200, 300, 500, 1000, 200};
        field_v = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_z = new boolean[64];
        field_u = "Please wait...";
    }
}
