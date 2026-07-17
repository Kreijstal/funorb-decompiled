/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class w extends f {
    static long field_I;
    boolean field_E;
    static String[][] field_J;
    private tc field_F;
    static bi field_D;
    private int field_G;
    static String field_H;

    final static void a(String[] args, int param1, sq param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
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
              param2.field_t = bg.a(args[0], 107);
              param2.field_b = bg.a(args[1], 108);
              param2.field_j = bg.a(args[2], 120);
              param2.field_q = bg.a(args[3], 100);
              param2.field_n = param1;
              if (param3 <= -11) {
                break L1;
              } else {
                String discarded$2 = w.a(-61);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("w.BA(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (args == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44).append(param1).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param3 + 41);
        }
    }

    final static String a(int param0) {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        String stackIn_6_0 = null;
        String stackIn_16_0 = null;
        String stackOut_5_0 = null;
        String stackOut_15_0 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        var6 = "(" + rm.field_e + " " + tp.field_g + " " + kp.field_n + ") " + ej.field_e;
        if (param0 == 16738) {
          if (0 >= rr.field_t) {
            return var6;
          } else {
            var1 = var6 + ":";
            var2 = 0;
            L0: while (true) {
              L1: {
                L2: {
                  if (rr.field_t <= var2) {
                    break L2;
                  } else {
                    stackOut_5_0 = var1 + 32;
                    stackIn_16_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var5 != 0) {
                      break L1;
                    } else {
                      L3: {
                        L4: {
                          var7 = stackIn_6_0;
                          var3 = 255 & sa.field_a.field_h[var2];
                          var4 = var3 >> 4;
                          var3 = var3 & 15;
                          if (10 > var4) {
                            break L4;
                          } else {
                            var4 += 55;
                            if (var5 == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var4 += 48;
                        break L3;
                      }
                      L5: {
                        L6: {
                          if (10 <= var3) {
                            break L6;
                          } else {
                            var3 += 48;
                            if (var5 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var3 += 55;
                        break L5;
                      }
                      var8 = var7 + (char)var4;
                      var1 = var8 + (char)var3;
                      var2++;
                      if (var5 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                stackOut_15_0 = (String) var1;
                stackIn_16_0 = stackOut_15_0;
                break L1;
              }
              return stackIn_16_0;
            }
          }
        } else {
          return null;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (((w) this).field_G == 0) {
          return;
        } else {
          if (((w) this).field_G >= 256) {
            if (param0 != 0) {
              return;
            } else {
              ((w) this).a(param3 - -((w) this).field_m, 103, ((w) this).field_q + param2);
              super.a(param0, -11857, param2, param3);
              return;
            }
          } else {
            if (ci.field_r != null) {
              if (ci.field_r.field_z >= ((w) this).field_x) {
                if (ci.field_r.field_w >= ((w) this).field_n) {
                  aq.a((byte) 110, ci.field_r);
                  gf.b();
                  ((w) this).a(0, 103, 0);
                  super.a(param0, param1, -param2 - ((w) this).field_q, -param3 - ((w) this).field_m);
                  ln.f((byte) -50);
                  ci.field_r.a(((w) this).field_m + param3, ((w) this).field_q + param2, ((w) this).field_G);
                  return;
                } else {
                  ci.field_r = new bi(((w) this).field_x, ((w) this).field_n);
                  aq.a((byte) 110, ci.field_r);
                  gf.b();
                  ((w) this).a(0, 103, 0);
                  super.a(param0, param1, -param2 - ((w) this).field_q, -param3 - ((w) this).field_m);
                  ln.f((byte) -50);
                  ci.field_r.a(((w) this).field_m + param3, ((w) this).field_q + param2, ((w) this).field_G);
                  return;
                }
              } else {
                ci.field_r = new bi(((w) this).field_x, ((w) this).field_n);
                aq.a((byte) 110, ci.field_r);
                gf.b();
                ((w) this).a(0, 103, 0);
                super.a(param0, param1, -param2 - ((w) this).field_q, -param3 - ((w) this).field_m);
                ln.f((byte) -50);
                ci.field_r.a(((w) this).field_m + param3, ((w) this).field_q + param2, ((w) this).field_G);
                return;
              }
            } else {
              ci.field_r = new bi(((w) this).field_x, ((w) this).field_n);
              aq.a((byte) 110, ci.field_r);
              gf.b();
              ((w) this).a(0, 103, 0);
              super.a(param0, param1, -param2 - ((w) this).field_q, -param3 - ((w) this).field_m);
              ln.f((byte) -50);
              ci.field_r.a(((w) this).field_m + param3, ((w) this).field_q + param2, ((w) this).field_G);
              return;
            }
          }
        }
    }

    boolean k(int param0) {
        if (param0 == 0) {
          ((w) this).field_G = this.e(false);
          if (((w) this).field_G == 0) {
            if (((w) this).field_E) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_D = null;
          ((w) this).field_G = this.e(false);
          if (((w) this).field_G == 0) {
            if (((w) this).field_E) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final vg i(int param0) {
        vg var2 = super.i(param0);
        if (var2 != null) {
            return var2;
        }
        return (vg) this;
    }

    boolean a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_10_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var3 = -91 % ((param0 - -23) / 52);
          var2 = this.e(false);
          var3 = var2 - ((w) this).field_G;
          if (0 < var3) {
            ((w) this).field_G = ((w) this).field_G + (8 + (var3 - 1)) / 8;
            break L0;
          } else {
            break L0;
          }
        }
        if (var3 >= 0) {
          if (((w) this).field_G == 0) {
            if (0 != var2) {
              return false;
            } else {
              L1: {
                if (((w) this).field_E) {
                  stackOut_18_0 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  break L1;
                } else {
                  stackOut_17_0 = 1;
                  stackIn_19_0 = stackOut_17_0;
                  break L1;
                }
              }
              return stackIn_19_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          ((w) this).field_G = ((w) this).field_G + (-16 + var3 - -1) / 16;
          if (((w) this).field_G == 0) {
            if (0 != var2) {
              return false;
            } else {
              L2: {
                if (((w) this).field_E) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L2;
                }
              }
              return stackIn_10_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    final void b(int param0, int param1, byte param2) {
        if (param2 >= -103) {
          w.m(11);
          ((w) this).a(ec.field_q - param0 >> 1, param0, (byte) 122, ep.field_a - param1 >> 1, param1);
          return;
        } else {
          ((w) this).a(ec.field_q - param0 >> 1, param0, (byte) 122, ep.field_a - param1 >> 1, param1);
          return;
        }
    }

    final static ro a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ro stackIn_4_0 = null;
        ro stackIn_7_0 = null;
        ro stackIn_17_0 = null;
        ro stackIn_21_0 = null;
        Object stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        ro stackOut_3_0 = null;
        ro stackOut_16_0 = null;
        ro stackOut_20_0 = null;
        Object stackOut_23_0 = null;
        ro stackOut_6_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            if (var2_int == 0) {
              stackOut_3_0 = fg.field_a;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (var2_int <= 63) {
                var3 = 121 % ((param0 - -23) / 41);
                var4 = 0;
                L1: while (true) {
                  if (var4 < var2_int) {
                    L2: {
                      var5 = param1.charAt(var4);
                      if (var5 == 45) {
                        L3: {
                          if (var4 == 0) {
                            break L3;
                          } else {
                            if (var2_int - 1 == var4) {
                              break L3;
                            } else {
                              break L2;
                            }
                          }
                        }
                        stackOut_16_0 = as.field_t;
                        stackIn_17_0 = stackOut_16_0;
                        return stackIn_17_0;
                      } else {
                        if (ma.field_q.indexOf(var5) == -1) {
                          stackOut_20_0 = as.field_t;
                          stackIn_21_0 = stackOut_20_0;
                          return stackIn_21_0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    var4++;
                    if (var6 == 0) {
                      continue L1;
                    } else {
                      stackOut_23_0 = null;
                      stackIn_24_0 = stackOut_23_0;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                stackOut_6_0 = cm.field_e;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var2;
            stackOut_25_1 = new StringBuilder().append("w.W(").append(param0).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L4;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L4;
            }
          }
          throw r.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 41);
        }
        return (ro) (Object) stackIn_24_0;
    }

    w(tc param0, int param1, int param2) {
        super(ep.field_a - param1 >> 1, -param2 + ec.field_q >> 1, param1, param2, (iq) null);
        try {
            ((w) this).field_E = false;
            ((w) this).field_F = param0;
            ((w) this).field_G = 0;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "w.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static void f(byte param0) {
        L0: {
          ej.c(0);
          if (tm.field_i != null) {
            hs.a(tm.field_i, (byte) -101);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          rs.g(-96);
          og.a(false);
          oa.a(0);
          if (oh.b(true)) {
            js.field_f.h(1, 255);
            d.a(0, (byte) 82);
            break L1;
          } else {
            break L1;
          }
        }
        q.g(-107);
        if (param0 < 56) {
          field_J = null;
          return;
        } else {
          return;
        }
    }

    public static void m(int param0) {
        if (param0 != -1) {
          String discarded$2 = w.a(56);
          field_D = null;
          field_H = null;
          field_J = null;
          return;
        } else {
          field_D = null;
          field_H = null;
          field_J = null;
          return;
        }
    }

    private final int e(boolean param0) {
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        L0: {
          if (!((w) this).field_E) {
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          } else {
            if (this == (Object) (Object) ((w) this).field_F.g((byte) 119)) {
              stackOut_3_0 = 256;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 0;
              stackIn_5_0 = stackOut_2_0;
              break L0;
            }
          }
        }
        return stackIn_5_0;
    }

    abstract void a(int param0, int param1, int param2);

    final static String l(int param0) {
        String var1 = "";
        if (null != no.field_e) {
            var1 = no.field_e.d(false);
        }
        if (param0 == var1.length()) {
            var1 = id.a(-106);
        }
        if (var1.length() == 0) {
            var1 = hb.field_c;
        }
        return var1;
    }

    final static boolean d(boolean param0) {
        return eh.field_P;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "Successful defences";
        field_J = new String[][]{new String[0], new String[7], new String[4], new String[5], new String[2]};
    }
}
