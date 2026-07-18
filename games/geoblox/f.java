/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class f extends qf implements pl {
    private boolean field_gb;
    private boolean field_rb;
    private boolean field_mb;
    static int field_ib;
    static gk field_hb;
    static int field_qb;
    static java.awt.Canvas field_kb;
    static String field_nb;
    private boolean field_ob;
    private m field_jb;
    static String[] field_lb;
    private hl field_pb;

    static long a(long param0, long param1) {
        RuntimeException var4 = null;
        long stackIn_1_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        long stackOut_0_0 = 0L;
        try {
          L0: {
            stackOut_0_0 = param0 ^ param1;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var4, "f.MA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    public void a(int param0, byte param1, int param2, int param3, hk param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if (param1 == -20) {
                break L1;
              } else {
                boolean discarded$2 = f.b((byte) -98, (CharSequence) null);
                break L1;
              }
            }
            L2: {
              L3: {
                if (!((f) this).field_ob) {
                  break L3;
                } else {
                  pc.a(3, false);
                  ((f) this).h((byte) -104);
                  if (Geoblox.field_C == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              eb.a(k.c(111), (byte) 112, "tochangedisplayname.ws");
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var6;
            stackOut_10_1 = new StringBuilder().append("f.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param4 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
    }

    final static void b(String param0, String param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
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
              if (Geoblox.field_y == null) {
                break L1;
              } else {
                Geoblox.field_y.h((byte) -104);
                break L1;
              }
            }
            if (param2 == 7697781) {
              ml.field_t = new pf(param0, param1, false, true, true);
              hk.field_C.b((el) (Object) ml.field_t, -81);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) runtimeException;
            stackOut_7_1 = new StringBuilder().append("f.HA(");
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
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
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param2 + ')');
        }
    }

    f(ng param0, m param1, String param2, boolean param3, boolean param4) {
        super(param0, (el) (Object) new ni((f) null, param1, param2), 77, 10, 10);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
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
            ((f) this).field_gb = param4;
            ((f) this).field_ob = false;
            ((f) this).field_rb = false;
            ((f) this).field_jb = param1;
            ((f) this).field_mb = param3;
            ((f) this).field_pb = new hl(13, 50, 274, 30, 15, 2113632, 4210752);
            ((f) this).field_pb.field_C = true;
            ((f) this).b((byte) -61, (el) (Object) ((f) this).field_pb);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("f.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void i(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (vl.field_n != null) {
              return;
            } else {
              L1: {
                if (param0 < -48) {
                  break L1;
                } else {
                  field_qb = -112;
                  break L1;
                }
              }
              L2: {
                vl.field_n = od.a(480, 0, 0, -3, ka.field_i, 640);
                if (null == vl.field_n) {
                  break L2;
                } else {
                  sl.a((java.awt.Canvas) (Object) vl.field_n, 57);
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "f.IB(" + param0 + ')');
        }
    }

    final void h(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!((f) this).field_I) {
              return;
            } else {
              L1: {
                ((f) this).field_I = false;
                if (param0 == -104) {
                  break L1;
                } else {
                  ((f) this).field_ob = true;
                  break L1;
                }
              }
              L2: {
                L3: {
                  if (!((f) this).field_mb) {
                    break L3;
                  } else {
                    tj.b((byte) -65);
                    if (Geoblox.field_C == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (!((f) this).field_gb) {
                  break L2;
                } else {
                  wl.b(-1);
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var2, "f.HB(" + param0 + ')');
        }
    }

    final boolean a(int param0, int param1, char param2, el param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 != param1) {
              stackOut_3_0 = super.a(param0, param1, param2, param3);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              ((f) this).h((byte) -104);
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("f.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_4_0;
    }

    public static void n(int param0) {
        try {
            field_hb = null;
            int var1_int = 44 % ((param0 - -23) / 41);
            field_kb = null;
            field_nb = null;
            field_lb = null;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "f.GB(" + param0 + ')');
        }
    }

    final static void o(int param0) {
        RuntimeException var1 = null;
        float var1_float = 0.0f;
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              int fieldTemp$3 = af.field_c;
              af.field_c = af.field_c - 1;
              if (0 <= fieldTemp$3) {
                break L1;
              } else {
                L2: {
                  af.field_c = 20;
                  if (~uf.field_b == ~ka.field_h) {
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        var1_int = -ka.field_h + uf.field_b;
                        if (1 != jk.field_d) {
                          break L4;
                        } else {
                          if (var1_int <= 1) {
                            break L4;
                          } else {
                            uf.field_b = uf.field_b - 1;
                            if (var2 == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      L5: {
                        if (2 != jk.field_d) {
                          break L5;
                        } else {
                          if (5 <= var1_int) {
                            break L5;
                          } else {
                            uf.field_b = uf.field_b + 1;
                            if (var2 == 0) {
                              break L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      L6: {
                        if (0 != jk.field_d) {
                          break L6;
                        } else {
                          if (var1_int >= 3) {
                            break L6;
                          } else {
                            uf.field_b = uf.field_b + 1;
                            if (var2 == 0) {
                              break L3;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      if (0 != jk.field_d) {
                        break L3;
                      } else {
                        if (3 >= var1_int) {
                          break L3;
                        } else {
                          uf.field_b = uf.field_b - 1;
                          break L3;
                        }
                      }
                    }
                    if (var2 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                uf.field_b = ka.field_h + 3;
                break L1;
              }
            }
            L7: {
              pa.field_g = pa.field_g - 1;
              gi.field_e = gi.field_e + 1;
              if (30 <= gi.field_e % param0) {
                break L7;
              } else {
                uf.field_b = ka.field_h;
                break L7;
              }
            }
            L8: {
              if (!el.field_o.field_x) {
                break L8;
              } else {
                if (gi.field_e % 18 == 0) {
                  L9: {
                    L10: {
                      if (gg.field_b == 0) {
                        break L10;
                      } else {
                        L11: {
                          if (gg.field_b == 1) {
                            break L11;
                          } else {
                            g.field_j = g.field_j % 4;
                            ul.field_a = ld.field_b[g.field_j];
                            if (var2 == 0) {
                              break L9;
                            } else {
                              break L11;
                            }
                          }
                        }
                        L12: {
                          if (~ok.field_a.length >= ~g.field_j) {
                            break L12;
                          } else {
                            ul.field_a = ok.field_a[g.field_j];
                            if (var2 == 0) {
                              break L9;
                            } else {
                              break L12;
                            }
                          }
                        }
                        gg.field_b = gg.field_b + 1;
                        pa.field_g = 200;
                        if (var2 == 0) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    L13: {
                      if (!pf.field_D) {
                        break L13;
                      } else {
                        gg.field_b = gg.field_b + 1;
                        g.field_j = 0;
                        fd.a(300, fl.field_c[22], false, j.field_gb);
                        if (var2 == 0) {
                          break L9;
                        } else {
                          break L13;
                        }
                      }
                    }
                    g.field_j = g.field_j % 4;
                    ul.field_a = vf.field_H[g.field_j];
                    break L9;
                  }
                  g.field_j = g.field_j + 1;
                  break L8;
                } else {
                  break L8;
                }
              }
            }
            L14: {
              var1_float = (float)(50 - jf.field_j) * 0.0066999997943639755f;
              int fieldTemp$4 = wa.field_a;
              wa.field_a = wa.field_a - 1;
              if (fieldTemp$4 <= 0) {
                break L14;
              } else {
                ha.field_g = wa.field_a % 15 % 2;
                break L14;
              }
            }
            L15: {
              int fieldTemp$5 = jf.field_j;
              jf.field_j = jf.field_j - 1;
              if (fieldTemp$5 <= 0) {
                break L15;
              } else {
                rj.field_c = ((int)(md.field_b * var1_float) << -1388546160) + (r.field_ub - -((int)(var1_float * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1_float));
                break L15;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "f.LA(" + param0 + ')');
        }
    }

    final static wa p(int param0) {
        RuntimeException var1 = null;
        Object stackIn_5_0 = null;
        wa stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        wa stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        try {
          L0: {
            L1: {
              if (null != uf.field_f) {
                break L1;
              } else {
                uf.field_f = new wa();
                uf.field_f.a(9, ng.field_F);
                uf.field_f.field_h = 14;
                uf.field_f.field_f = 2763306;
                uf.field_f.field_d = 6;
                uf.field_f.field_n = 7697781;
                uf.field_f.field_e = 5;
                uf.field_f.field_i = 0;
                uf.field_f.field_p = 4;
                uf.field_f.field_m = hh.field_d;
                break L1;
              }
            }
            if (param0 >= 71) {
              stackOut_6_0 = uf.field_f;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (wa) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "f.IA(" + param0 + ')');
        }
        return stackIn_7_0;
    }

    final void a(int param0, int param1, String param2) {
        RuntimeException var4 = null;
        ni var4_ref = null;
        int var5 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        ni stackIn_18_0 = null;
        ni stackIn_20_0 = null;
        ni stackIn_22_0 = null;
        ni stackIn_23_0 = null;
        String stackIn_23_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        ni stackOut_17_0 = null;
        ni stackOut_22_0 = null;
        String stackOut_22_1 = null;
        ni stackOut_18_0 = null;
        ni stackOut_20_0 = null;
        String stackOut_20_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        var5 = Geoblox.field_C;
        try {
          L0: {
            if (((f) this).field_rb) {
              return;
            } else {
              if (param1 == 19810) {
                L1: {
                  stackOut_6_0 = this;
                  stackIn_9_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (256 != param0) {
                    stackOut_9_0 = this;
                    stackOut_9_1 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    break L1;
                  } else {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 1;
                    stackIn_10_0 = stackOut_7_0;
                    stackIn_10_1 = stackOut_7_1;
                    break L1;
                  }
                }
                L2: {
                  L3: {
                    ((f) this).field_ob = stackIn_10_1 != 0;
                    ((f) this).field_rb = true;
                    ((f) this).field_pb.a(4210752, 8405024, (byte) -103);
                    var4_ref = new ni((f) this, ((f) this).field_jb, param2);
                    if (param0 == 5) {
                      break L3;
                    } else {
                      L4: {
                        if (param0 != 256) {
                          break L4;
                        } else {
                          hk discarded$2 = var4_ref.a(-2, a.field_b, (bb) this);
                          if (var5 == 0) {
                            break L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        stackOut_17_0 = (ni) var4_ref;
                        stackIn_22_0 = stackOut_17_0;
                        stackIn_18_0 = stackOut_17_0;
                        if (((f) this).field_mb) {
                          stackOut_22_0 = (ni) (Object) stackIn_22_0;
                          stackOut_22_1 = a.field_b;
                          stackIn_23_0 = stackOut_22_0;
                          stackIn_23_1 = stackOut_22_1;
                          break L5;
                        } else {
                          stackOut_18_0 = (ni) (Object) stackIn_18_0;
                          stackIn_20_0 = stackOut_18_0;
                          stackOut_20_0 = (ni) (Object) stackIn_20_0;
                          stackOut_20_1 = ll.field_b;
                          stackIn_23_0 = stackOut_20_0;
                          stackIn_23_1 = stackOut_20_1;
                          break L5;
                        }
                      }
                      ((ni) (Object) stackIn_23_0).a(stackIn_23_1, 1, -1);
                      if (var5 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var4_ref.a(nf.field_E, 1, 11);
                  var4_ref.a(rj.field_e, 1, 17);
                  break L2;
                }
                L6: {
                  L7: {
                    if (param0 == 3) {
                      break L7;
                    } else {
                      L8: {
                        if (param0 != 4) {
                          break L8;
                        } else {
                          var4_ref.a(hb.field_h, 1, 8);
                          if (var5 == 0) {
                            break L6;
                          } else {
                            break L8;
                          }
                        }
                      }
                      L9: {
                        if (param0 == 6) {
                          break L9;
                        } else {
                          if (param0 == 9) {
                            hk discarded$3 = var4_ref.a(-2, fi.field_h, (bb) this);
                            if (var5 == 0) {
                              break L6;
                            } else {
                              break L9;
                            }
                          } else {
                            break L6;
                          }
                        }
                      }
                      var4_ref.a(jc.field_c, 1, 9);
                      if (var5 == 0) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  var4_ref.a(ee.field_y, param1 ^ 19811, 7);
                  break L6;
                }
                ((f) this).b((el) (Object) var4_ref, param1 ^ -19736);
                break L0;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_49_0 = (RuntimeException) var4;
            stackOut_49_1 = new StringBuilder().append("f.KA(").append(param0).append(',').append(param1).append(',');
            stackIn_52_0 = stackOut_49_0;
            stackIn_52_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param2 == null) {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L10;
            } else {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "{...}";
              stackIn_53_0 = stackOut_50_0;
              stackIn_53_1 = stackOut_50_1;
              stackIn_53_2 = stackOut_50_2;
              break L10;
            }
          }
          throw t.a((Throwable) (Object) stackIn_53_0, stackIn_53_2 + ')');
        }
    }

    final static boolean b(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param0 < -111) {
                break L1;
              } else {
                field_lb = null;
                break L1;
              }
            }
            stackOut_3_0 = pa.a(param1, true, 10, 87);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("f.JA(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_4_0;
    }

    final void c(boolean param0) {
        ni var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((f) this).field_pb.a(4210752, 2121792, (byte) -103);
              if (!param0) {
                break L1;
              } else {
                field_kb = null;
                break L1;
              }
            }
            var2 = new ni((f) this, ((f) this).field_jb, oe.field_O);
            var2.a(jk.field_c, 1, 15);
            ((f) this).b((el) (Object) var2, -23);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw t.a((Throwable) (Object) var2_ref, "f.GA(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_hb = new gk();
        field_lb = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
        field_nb = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
    }
}
