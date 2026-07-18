/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ga {
    oh field_b;
    boolean field_y;
    oh field_A;
    int field_w;
    int field_u;
    int field_d;
    int field_q;
    static jj field_k;
    int field_e;
    int field_t;
    int field_B;
    int field_v;
    static int field_j;
    static java.math.BigInteger field_o;
    int field_g;
    String field_n;
    pc field_m;
    int field_s;
    oh field_i;
    int field_h;
    String field_z;
    static String field_p;
    int field_f;
    static jj field_r;
    static String field_l;
    int field_x;
    static String field_a;
    static int field_c;

    final static int a(int param0) {
        try {
            IOException var1 = null;
            RuntimeException var1_ref = null;
            dh var1_ref2 = null;
            int var1_int = 0;
            int stackIn_5_0 = 0;
            int stackIn_8_0 = 0;
            int stackIn_10_0 = 0;
            int stackIn_22_0 = 0;
            int stackIn_39_0 = 0;
            int stackIn_44_0 = 0;
            int stackIn_50_0 = 0;
            int stackIn_55_0 = 0;
            int stackIn_57_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_9_0 = 0;
            int stackOut_7_0 = 0;
            int stackOut_4_0 = 0;
            int stackOut_21_0 = 0;
            int stackOut_43_0 = 0;
            int stackOut_38_0 = 0;
            int stackOut_49_0 = 0;
            int stackOut_54_0 = 0;
            int stackOut_56_0 = 0;
            try {
              if (4 <= jg.field_kb.field_i) {
                if (jg.field_kb.field_l != -1) {
                  if (-2 != jg.field_kb.field_l) {
                    stackOut_9_0 = 1;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  } else {
                    stackOut_7_0 = 4;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0;
                  }
                } else {
                  stackOut_4_0 = 3;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0;
                }
              } else {
                L0: {
                  if (hm.field_N == 0) {
                    bj.field_c = mc.field_b.a(lg.field_h, eb.field_B, (byte) 60);
                    hm.field_N = hm.field_N + 1;
                    break L0;
                  } else {
                    break L0;
                  }
                }
                L1: {
                  if (1 != hm.field_N) {
                    break L1;
                  } else {
                    if (bj.field_c.field_d == 2) {
                      stackOut_21_0 = o.a(-1, (byte) -112);
                      stackIn_22_0 = stackOut_21_0;
                      return stackIn_22_0;
                    } else {
                      if (bj.field_c.field_d == 1) {
                        hm.field_N = hm.field_N + 1;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
                L2: {
                  if (hm.field_N != 2) {
                    break L2;
                  } else {
                    gi.field_l = new tf((java.net.Socket) bj.field_c.field_e, mc.field_b);
                    var1_ref2 = new dh(13);
                    ej.a(ng.field_y, -25563, var1_ref2, tj.field_wb, ai.field_c);
                    var1_ref2.i(15, -121);
                    var1_ref2.e(rf.field_v, 8959);
                    gi.field_l.a(13, 0, (byte) -97, var1_ref2.field_i);
                    hm.field_N = hm.field_N + 1;
                    t.field_b = 30000L + ll.a(1000);
                    break L2;
                  }
                }
                L3: {
                  if (hm.field_N == 3) {
                    if (gi.field_l.a(0) > 0) {
                      var1_int = gi.field_l.b(0);
                      if (var1_int != 0) {
                        stackOut_43_0 = o.a(var1_int, (byte) -112);
                        stackIn_44_0 = stackOut_43_0;
                        return stackIn_44_0;
                      } else {
                        hm.field_N = hm.field_N + 1;
                        break L3;
                      }
                    } else {
                      if (t.field_b < ll.a(1000)) {
                        stackOut_38_0 = o.a(-2, (byte) -127);
                        stackIn_39_0 = stackOut_38_0;
                        return stackIn_39_0;
                      } else {
                        break L3;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                if (hm.field_N == 4) {
                  jg.field_kb.a(-1456343840, (Object) (Object) gi.field_l, dg.field_b);
                  bj.field_c = null;
                  gi.field_l = null;
                  hm.field_N = 0;
                  stackOut_49_0 = 0;
                  stackIn_50_0 = stackOut_49_0;
                  return stackIn_50_0;
                } else {
                  L4: {
                    if (param0 <= -104) {
                      break L4;
                    } else {
                      field_l = null;
                      break L4;
                    }
                  }
                  stackOut_54_0 = -1;
                  stackIn_55_0 = stackOut_54_0;
                  return stackIn_55_0;
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (IOException) (Object) decompiledCaughtException;
              stackOut_56_0 = o.a(-3, (byte) -119);
              stackIn_57_0 = stackOut_56_0;
              return stackIn_57_0;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw qk.a((Throwable) (Object) var1_ref, "ga.K(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int d(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        try {
          L0: {
            L1: {
              var2_int = 0;
              if (((ga) this).field_b != null) {
                var2_int = var2_int + od.field_c[((ga) this).field_b.field_g].field_s;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((ga) this).field_A == null) {
                break L2;
              } else {
                var2_int = var2_int + od.field_c[((ga) this).field_A.field_g].field_s;
                break L2;
              }
            }
            L3: {
              var3 = -15 / ((param0 - -30) / 42);
              if (((ga) this).field_i != null) {
                var2_int = var2_int + ((ga) this).field_i.field_d * od.field_c[((ga) this).field_i.field_g].field_s;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (null != ((ga) this).field_m) {
                var2_int = var2_int + sj.field_a[((ga) this).field_m.field_f].field_f;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              ((ga) this).field_x = var2_int;
              var2_int = var2_int - ((ga) this).field_v;
              if (var2_int >= 0) {
                break L5;
              } else {
                var2_int = 0;
                break L5;
              }
            }
            L6: {
              ((ga) this).field_u = var2_int + ((ga) this).field_v;
              ((ga) this).field_s = ((ga) this).field_w * ((ga) this).field_v / ((ga) this).field_u;
              if (((ga) this).field_s < 0) {
                ((ga) this).field_s = 0;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (((ga) this).field_u <= 100) {
                break L7;
              } else {
                ((ga) this).field_u = 100;
                break L7;
              }
            }
            stackOut_23_0 = ((ga) this).field_x;
            stackIn_24_0 = stackOut_23_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var2, "ga.M(" + param0 + ')');
        }
        return stackIn_24_0;
    }

    final void a(rk param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -1) {
                break L1;
              } else {
                ((ga) this).field_m = null;
                break L1;
              }
            }
            L2: {
              if (null != ((ga) this).field_b) {
                ((ga) this).field_b.field_d = 8;
                ((ga) this).field_b.field_c = od.field_c[((ga) this).field_b.field_g].field_o;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (((ga) this).field_A == null) {
                break L3;
              } else {
                ((ga) this).field_A.field_d = 8;
                ((ga) this).field_A.field_c = od.field_c[((ga) this).field_A.field_g].field_o;
                break L3;
              }
            }
            L4: {
              if (null != ((ga) this).field_i) {
                if (((ga) this).field_i.field_d < 2) {
                  ((ga) this).field_i.field_d = 2;
                  break L4;
                } else {
                  break L4;
                }
              } else {
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3;
            stackOut_18_1 = new StringBuilder().append("ga.F(");
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L5;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param1 + ')');
        }
    }

    final void c(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                var2_int = 97 % ((-19 - param0) / 58);
                ((ga) this).field_d = (((ga) this).field_f + ((ga) this).field_g) % 12;
                if (((ga) this).field_y) {
                  break L2;
                } else {
                  L3: {
                    if (((ga) this).field_d != 0) {
                      break L3;
                    } else {
                      ((ga) this).field_d = 1;
                      break L3;
                    }
                  }
                  L4: {
                    if (((ga) this).field_d == 3) {
                      ((ga) this).field_d = 2;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (((ga) this).field_d == 4) {
                      ((ga) this).field_d = 9;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (((ga) this).field_d != 5) {
                      break L6;
                    } else {
                      ((ga) this).field_d = 1;
                      break L6;
                    }
                  }
                  L7: {
                    if (((ga) this).field_d == 6) {
                      ((ga) this).field_d = 2;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (((ga) this).field_d == 7) {
                      ((ga) this).field_d = 9;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (((ga) this).field_d != 8) {
                      break L9;
                    } else {
                      ((ga) this).field_d = 1;
                      break L9;
                    }
                  }
                  if (((ga) this).field_d != 11) {
                    break L1;
                  } else {
                    ((ga) this).field_d = 2;
                    if (Terraphoenix.field_V == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L10: {
                if (((ga) this).field_d == 1) {
                  ((ga) this).field_d = 3;
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (2 != ((ga) this).field_d) {
                  break L11;
                } else {
                  ((ga) this).field_d = 5;
                  break L11;
                }
              }
              if (((ga) this).field_d != 9) {
                break L1;
              } else {
                ((ga) this).field_d = 7;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var2, "ga.I(" + param0 + ')');
        }
    }

    final static void b(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null != a.field_b) {
              if (param0 >= 19) {
                L1: {
                  hk.a((java.awt.Canvas) (Object) a.field_b, (byte) -91);
                  a.field_b.a(nj.field_l, 4);
                  a.field_b = null;
                  if (ab.field_b != null) {
                    ab.field_b.a(101);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ae.field_G.requestFocus();
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var1, "ga.J(" + param0 + ')');
        }
    }

    final static void d(int param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var1_int = mk.a(-1);
              var2 = mc.a(55);
              ck.field_a.a(var1_int + (nb.field_e << 834423489), vi.field_o + -nb.field_e, var2 - -(eb.field_D << 1491761953), 0, -eb.field_D + jh.field_m);
              if (param0 == -6513) {
                break L1;
              } else {
                field_p = null;
                break L1;
              }
            }
            sh.a(param0 ^ 6512);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qk.a((Throwable) (Object) runtimeException, "ga.E(" + param0 + ')');
        }
    }

    private final void a(byte param0) {
        String[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                ((ga) this).field_y = true;
                var2 = ph.field_r;
                if (((ga) this).field_d == 1) {
                  break L2;
                } else {
                  if (((ga) this).field_d == 2) {
                    break L2;
                  } else {
                    if (((ga) this).field_d != 9) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              ((ga) this).field_y = false;
              var2 = rl.field_b;
              break L1;
            }
            L3: {
              ((ga) this).field_g = (int)(Math.random() * (double)var2.length);
              if (param0 == 85) {
                break L3;
              } else {
                field_j = 12;
                break L3;
              }
            }
            L4: {
              ((ga) this).field_f = (int)(Math.random() * (double)af.field_d.length);
              var3 = ((ga) this).field_g & 127;
              if (var3 <= var2.length) {
                break L4;
              } else {
                var3 = var3 % var2.length;
                break L4;
              }
            }
            L5: {
              var4 = ((ga) this).field_f;
              if (af.field_d.length >= var4) {
                break L5;
              } else {
                var4 = var4 % af.field_d.length;
                break L5;
              }
            }
            L6: {
              ((ga) this).field_n = var2[var3];
              ((ga) this).field_z = af.field_d[var4];
              if (!((ga) this).field_y) {
                break L6;
              } else {
                ((ga) this).field_g = ((ga) this).field_g | 128;
                break L6;
              }
            }
            L7: {
              L8: {
                if (((ga) this).field_n.compareTo("Yi") == 0) {
                  break L8;
                } else {
                  if (0 != ((ga) this).field_n.compareTo("Thomas")) {
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
              if (((ga) this).field_z.compareTo("de Rivaz") != 0) {
                break L7;
              } else {
                ((ga) this).field_t = (int)(20.0 * Math.random()) + 50;
                ((ga) this).field_w = 50 + (int)(20.0 * Math.random());
                ((ga) this).field_v = 50 + (int)(20.0 * Math.random());
                ((ga) this).field_B = (int)(Math.random() * 20.0) + 50;
                ((ga) this).field_q = (int)(20.0 * Math.random()) + 50;
                break L7;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var2_ref, "ga.C(" + param0 + ')');
        }
    }

    public static void a(boolean param0) {
        try {
            field_k = null;
            field_l = null;
            field_p = null;
            field_a = null;
            field_r = null;
            field_o = null;
            if (param0) {
                field_p = null;
            }
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "ga.G(" + param0 + ')');
        }
    }

    final static bg[] a(byte param0, int param1, fa param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        bg[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        bg[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
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
            if (vh.a(param3, param1, param2, true)) {
              var4_int = 35 / ((-65 - param0) / 58);
              stackOut_3_0 = uc.o(-28336);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (bg[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("ga.L(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
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
          throw qk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param3 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(byte param0, int param1, cc param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              qb.field_a.a((uf) (Object) param2, -16611);
              if (param0 == 7) {
                break L1;
              } else {
                ga.d(113);
                break L1;
              }
            }
            ia.a(param1, param2, -74);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("ga.H(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
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
          throw qk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    final void c(int param0) {
        String[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        Object stackIn_1_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_0_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        try {
          L0: {
            L1: {
              stackOut_0_0 = this;
              stackIn_3_0 = stackOut_0_0;
              stackIn_1_0 = stackOut_0_0;
              if ((128 & ((ga) this).field_g) <= 0) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_1_0 = this;
                stackOut_1_1 = 1;
                stackIn_4_0 = stackOut_1_0;
                stackIn_4_1 = stackOut_1_1;
                break L1;
              }
            }
            L2: {
              ((ga) this).field_y = stackIn_4_1 != 0;
              if (param0 == 50) {
                break L2;
              } else {
                ((ga) this).field_g = 19;
                break L2;
              }
            }
            L3: {
              var2 = ph.field_r;
              if (!((ga) this).field_y) {
                var2 = rl.field_b;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var3 = 127 & ((ga) this).field_g;
              if (~var3 >= ~var2.length) {
                break L4;
              } else {
                var3 = var3 % var2.length;
                break L4;
              }
            }
            L5: {
              var4 = ((ga) this).field_f;
              if (~af.field_d.length > ~var4) {
                var4 = var4 % af.field_d.length;
                break L5;
              } else {
                break L5;
              }
            }
            ((ga) this).field_n = var2[var3];
            ((ga) this).field_z = af.field_d[var4];
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var2_ref, "ga.B(" + param0 + ')');
        }
    }

    final String a(int param0, int param1) {
        RuntimeException var3 = null;
        String var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        String stackIn_69_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        String stackOut_68_0 = null;
        var6 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              var3_ref = ((ga) this).field_n + " " + ((ga) this).field_z;
              if (((ga) this).field_h != 1) {
                break L1;
              } else {
                var3_ref = "# " + var3_ref;
                break L1;
              }
            }
            L2: {
              if (((ga) this).field_h != 2) {
                break L2;
              } else {
                var3_ref = "$ " + var3_ref;
                break L2;
              }
            }
            L3: {
              if (((ga) this).field_h != 3) {
                break L3;
              } else {
                var3_ref = "@ " + var3_ref;
                break L3;
              }
            }
            L4: {
              var4 = 20;
              if (param0 == -1426) {
                break L4;
              } else {
                ((ga) this).field_h = 55;
                break L4;
              }
            }
            L5: while (true) {
              L6: {
                L7: {
                  L8: {
                    L9: {
                      if (~param1 <= ~og.field_f.b(var3_ref)) {
                        break L9;
                      } else {
                        stackOut_11_0 = ~var4;
                        stackOut_11_1 = -2;
                        stackIn_33_0 = stackOut_11_0;
                        stackIn_33_1 = stackOut_11_1;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        if (var6 != 0) {
                          L10: while (true) {
                            if (stackIn_33_0 <= stackIn_33_1) {
                              break L7;
                            } else {
                              if (var4 <= 0) {
                                break L7;
                              } else {
                                var3_ref = ((ga) this).field_n.charAt(0) + ".";
                                var5 = 0;
                                L11: while (true) {
                                  L12: {
                                    L13: {
                                      if (var5 >= var4) {
                                        break L13;
                                      } else {
                                        stackOut_39_0 = var5;
                                        stackOut_39_1 = ((ga) this).field_z.length();
                                        stackIn_47_0 = stackOut_39_0;
                                        stackIn_47_1 = stackOut_39_1;
                                        stackIn_40_0 = stackOut_39_0;
                                        stackIn_40_1 = stackOut_39_1;
                                        if (var6 != 0) {
                                          break L12;
                                        } else {
                                          L14: {
                                            if (stackIn_40_0 < stackIn_40_1) {
                                              var3_ref = var3_ref + ((ga) this).field_z.charAt(var5);
                                              break L14;
                                            } else {
                                              break L14;
                                            }
                                          }
                                          var5++;
                                          if (var6 == 0) {
                                            continue L11;
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                    }
                                    stackOut_46_0 = ((ga) this).field_h;
                                    stackOut_46_1 = 1;
                                    stackIn_47_0 = stackOut_46_0;
                                    stackIn_47_1 = stackOut_46_1;
                                    break L12;
                                  }
                                  L15: {
                                    if (stackIn_47_0 == stackIn_47_1) {
                                      var3_ref = "# " + var3_ref;
                                      break L15;
                                    } else {
                                      break L15;
                                    }
                                  }
                                  L16: {
                                    if (2 == ((ga) this).field_h) {
                                      var3_ref = "$ " + var3_ref;
                                      break L16;
                                    } else {
                                      break L16;
                                    }
                                  }
                                  L17: {
                                    var4--;
                                    if (((ga) this).field_h != 3) {
                                      break L17;
                                    } else {
                                      var3_ref = "@ " + var3_ref;
                                      if (var6 != 0) {
                                        break L6;
                                      } else {
                                        if (var6 == 0) {
                                          break L17;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                  }
                                  stackOut_32_0 = ~param1;
                                  stackOut_32_1 = ~og.field_f.b(var3_ref);
                                  stackIn_33_0 = stackOut_32_0;
                                  stackIn_33_1 = stackOut_32_1;
                                  continue L10;
                                }
                              }
                            }
                          }
                        } else {
                          if (stackIn_12_0 >= stackIn_12_1) {
                            break L9;
                          } else {
                            var3_ref = mm.a(((ga) this).field_n.charAt(0), 0);
                            var5 = 1;
                            L18: while (true) {
                              L19: {
                                L20: {
                                  if (~var5 <= ~var4) {
                                    break L20;
                                  } else {
                                    stackOut_17_0 = ((ga) this).field_n.length();
                                    stackOut_17_1 = var5;
                                    stackIn_24_0 = stackOut_17_0;
                                    stackIn_24_1 = stackOut_17_1;
                                    stackIn_18_0 = stackOut_17_0;
                                    stackIn_18_1 = stackOut_17_1;
                                    if (var6 != 0) {
                                      break L19;
                                    } else {
                                      L21: {
                                        if (stackIn_18_0 <= stackIn_18_1) {
                                          break L21;
                                        } else {
                                          var3_ref = var3_ref + ((ga) this).field_n.charAt(var5);
                                          break L21;
                                        }
                                      }
                                      var5++;
                                      if (var6 == 0) {
                                        continue L18;
                                      } else {
                                        break L20;
                                      }
                                    }
                                  }
                                }
                                var3_ref = var3_ref + "." + ((ga) this).field_z;
                                stackOut_23_0 = 1;
                                stackOut_23_1 = ((ga) this).field_h;
                                stackIn_24_0 = stackOut_23_0;
                                stackIn_24_1 = stackOut_23_1;
                                break L19;
                              }
                              L22: {
                                if (stackIn_24_0 != stackIn_24_1) {
                                  break L22;
                                } else {
                                  var3_ref = "# " + var3_ref;
                                  break L22;
                                }
                              }
                              L23: {
                                if (2 != ((ga) this).field_h) {
                                  break L23;
                                } else {
                                  var3_ref = "$ " + var3_ref;
                                  break L23;
                                }
                              }
                              L24: {
                                if (((ga) this).field_h != 3) {
                                  break L24;
                                } else {
                                  var3_ref = "@ " + var3_ref;
                                  break L24;
                                }
                              }
                              var4--;
                              if (var6 == 0) {
                                continue L5;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                      }
                    }
                    var4 = 20;
                    L25: while (true) {
                      stackOut_32_0 = ~param1;
                      stackOut_32_1 = ~og.field_f.b(var3_ref);
                      stackIn_33_0 = stackOut_32_0;
                      stackIn_33_1 = stackOut_32_1;
                      if (stackIn_33_0 <= stackIn_33_1) {
                        break L7;
                      } else {
                        if (var4 <= 0) {
                          break L7;
                        } else {
                          var3_ref = ((ga) this).field_n.charAt(0) + ".";
                          var5 = 0;
                          L26: while (true) {
                            L27: {
                              L28: {
                                if (var5 >= var4) {
                                  break L28;
                                } else {
                                  stackOut_39_0 = var5;
                                  stackOut_39_1 = ((ga) this).field_z.length();
                                  stackIn_47_0 = stackOut_39_0;
                                  stackIn_47_1 = stackOut_39_1;
                                  stackIn_40_0 = stackOut_39_0;
                                  stackIn_40_1 = stackOut_39_1;
                                  if (var6 != 0) {
                                    break L27;
                                  } else {
                                    L29: {
                                      if (stackIn_40_0 < stackIn_40_1) {
                                        var3_ref = var3_ref + ((ga) this).field_z.charAt(var5);
                                        break L29;
                                      } else {
                                        break L29;
                                      }
                                    }
                                    var5++;
                                    if (var6 == 0) {
                                      continue L26;
                                    } else {
                                      break L28;
                                    }
                                  }
                                }
                              }
                              stackOut_46_0 = ((ga) this).field_h;
                              stackOut_46_1 = 1;
                              stackIn_47_0 = stackOut_46_0;
                              stackIn_47_1 = stackOut_46_1;
                              break L27;
                            }
                            L30: {
                              if (stackIn_47_0 == stackIn_47_1) {
                                var3_ref = "# " + var3_ref;
                                break L30;
                              } else {
                                break L30;
                              }
                            }
                            L31: {
                              if (2 == ((ga) this).field_h) {
                                var3_ref = "$ " + var3_ref;
                                break L31;
                              } else {
                                break L31;
                              }
                            }
                            var4--;
                            if (((ga) this).field_h != 3) {
                              continue L25;
                            } else {
                              var3_ref = "@ " + var3_ref;
                              if (var6 != 0) {
                                break L6;
                              } else {
                                if (var6 == 0) {
                                  continue L25;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  break L7;
                }
                if (~param1 <= ~og.field_f.b(var3_ref)) {
                  break L6;
                } else {
                  L32: {
                    var3_ref = mm.a(((ga) this).field_z.charAt(0), 0);
                    if (((ga) this).field_h != 1) {
                      break L32;
                    } else {
                      var3_ref = "# " + var3_ref;
                      break L32;
                    }
                  }
                  L33: {
                    if (((ga) this).field_h == 2) {
                      var3_ref = "$ " + var3_ref;
                      break L33;
                    } else {
                      break L33;
                    }
                  }
                  if (((ga) this).field_h != 3) {
                    break L6;
                  } else {
                    var3_ref = "@ " + var3_ref;
                    break L6;
                  }
                }
              }
              stackOut_68_0 = (String) var3_ref;
              stackIn_69_0 = stackOut_68_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var3, "ga.A(" + param0 + ',' + param1 + ')');
        }
        return stackIn_69_0;
    }

    final String b(int param0) {
        RuntimeException var2 = null;
        String stackIn_4_0 = null;
        String stackIn_7_0 = null;
        String stackIn_12_0 = null;
        String stackIn_14_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_11_0 = null;
        String stackOut_13_0 = null;
        String stackOut_6_0 = null;
        try {
          L0: {
            if (param0 == ((ga) this).field_h) {
              stackOut_3_0 = og.field_g + ((ga) this).field_n + " " + ((ga) this).field_z;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (((ga) this).field_h != 2) {
                if (((ga) this).field_h == 3) {
                  stackOut_11_0 = cf.field_c + ((ga) this).field_n + " " + ((ga) this).field_z;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                } else {
                  stackOut_13_0 = ((ga) this).field_n + " " + ((ga) this).field_z;
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                }
              } else {
                stackOut_6_0 = wj.field_d + ((ga) this).field_n + " " + ((ga) this).field_z;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var2, "ga.D(" + param0 + ')');
        }
        return stackIn_14_0;
    }

    ga() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        ((ga) this).field_b = null;
        ((ga) this).field_A = null;
        ((ga) this).field_i = null;
        ((ga) this).field_m = null;
        try {
          L0: {
            ((ga) this).field_t = (int)(15.0 * Math.random()) + 25;
            ((ga) this).field_w = 40 - -(int)(Math.random() * 20.0);
            ((ga) this).field_v = (int)(Math.random() * 45.0) + 15;
            ((ga) this).field_B = 25 - -(int)(Math.random() * 35.0);
            ((ga) this).field_w = ((ga) this).field_w + ha.field_q * 5;
            ((ga) this).field_e = 0;
            ((ga) this).field_t = ((ga) this).field_t + ha.field_q * 10;
            ((ga) this).field_h = 0;
            ((ga) this).field_q = 50;
            ((ga) this).field_v = ((ga) this).field_v + 8 * ha.field_q;
            ((ga) this).field_B = ((ga) this).field_B + ha.field_q * 5;
            ((ga) this).field_d = (int)(12.0 * Math.random());
            this.a((byte) 85);
            ((ga) this).c((byte) 41);
            ((ga) this).field_b = new oh((int)(2.0 * Math.random()) + 2);
            ((ga) this).field_b.field_d = 8;
            ((ga) this).field_A = new oh(0);
            ((ga) this).field_A.field_d = 8;
            ((ga) this).field_i = new oh(5);
            ((ga) this).field_s = ((ga) this).field_w;
            ((ga) this).field_i.field_c = 2;
            ((ga) this).field_u = ((ga) this).field_v;
            ((ga) this).field_i.field_d = 2;
            ((ga) this).field_m = new pc();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var1, "ga.<init>()");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new jj();
        field_j = 0;
        field_p = "Type your email address again to make sure it's correct";
        field_o = new java.math.BigInteger("65537");
        field_r = new jj();
        field_c = -1;
        field_l = "to keep fullscreen or";
        field_a = "to over <%0> great games";
    }
}
