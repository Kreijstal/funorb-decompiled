/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class cb {
    static String field_k;
    private pb[] field_f;
    static boolean[][] field_e;
    static String field_d;
    private int field_b;
    String field_a;
    static String field_h;
    float field_l;
    private int field_j;
    static String field_i;
    private int field_g;
    static int field_c;

    private final void a(String param0, int param1, String param2, String param3, int param4, ji param5) {
        pb[] var9 = null;
        pb var8 = null;
        pb var10 = null;
        try {
            if (((cb) this).field_g >= ((cb) this).field_f.length) {
                var9 = new pb[2 * ((cb) this).field_g];
                pb[] var7 = var9;
                an.a((Object[]) (Object) ((cb) this).field_f, 0, (Object[]) (Object) var9, 0, ((cb) this).field_g);
                ((cb) this).field_f = var9;
            }
            var8 = new pb();
            var10 = var8;
            pb var7_ref = var10;
            var10.field_j = param3;
            var10.field_a = param2;
            var10.field_b = param0;
            var10.field_h = -1;
            var10.field_g = param5;
            int fieldTemp$0 = ((cb) this).field_g;
            ((cb) this).field_g = ((cb) this).field_g + 1;
            ((cb) this).field_f[fieldTemp$0] = var8;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "cb.C(" + (param0 != null ? "{...}" : "null") + ',' + 2 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + -1 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        field_e = null;
        field_k = null;
        field_h = null;
        field_i = null;
        field_d = null;
    }

    final boolean a(int param0) {
        pb var2 = null;
        int var3 = 0;
        pb var4 = null;
        pb var5 = null;
        pb var6 = null;
        var3 = client.field_A ? 1 : 0;
        if (param0 > -48) {
          boolean discarded$1 = ((cb) this).a(88);
          L0: while (true) {
            if (((cb) this).field_j < ((cb) this).field_g) {
              var6 = ((cb) this).field_f[((cb) this).field_j];
              var4 = var6;
              var2 = var4;
              if (!var6.field_g.a((byte) 121)) {
                this.a(var6, 30993, 0);
                return false;
              } else {
                L1: {
                  if (var6.field_h < 0) {
                    break L1;
                  } else {
                    if (!var6.field_g.b(var6.field_h, (byte) -106)) {
                      this.a(var2, 30993, var6.field_g.a((byte) 34, var6.field_h));
                      return false;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (null == var6.field_b) {
                    break L2;
                  } else {
                    if (!var6.field_g.a(var6.field_b, (byte) -103)) {
                      this.a(var2, 30993, var6.field_g.a(20, var6.field_b));
                      return false;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (var6.field_h >= 0) {
                    break L3;
                  } else {
                    if (var6.field_b != null) {
                      break L3;
                    } else {
                      if (null == var6.field_a) {
                        break L3;
                      } else {
                        if (!var6.field_g.a(false)) {
                          this.a(var2, 30993, var6.field_g.b((byte) -100));
                          return false;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                ((cb) this).field_j = ((cb) this).field_j + 1;
                continue L0;
              }
            } else {
              return true;
            }
          }
        } else {
          L4: while (true) {
            if (((cb) this).field_j < ((cb) this).field_g) {
              var5 = ((cb) this).field_f[((cb) this).field_j];
              var4 = var5;
              var2 = var4;
              if (!var5.field_g.a((byte) 121)) {
                this.a(var5, 30993, 0);
                return false;
              } else {
                L5: {
                  if (var5.field_h < 0) {
                    break L5;
                  } else {
                    if (!var5.field_g.b(var5.field_h, (byte) -106)) {
                      this.a(var2, 30993, var5.field_g.a((byte) 34, var5.field_h));
                      return false;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  if (null == var5.field_b) {
                    break L6;
                  } else {
                    if (!var5.field_g.a(var5.field_b, (byte) -103)) {
                      this.a(var2, 30993, var5.field_g.a(20, var5.field_b));
                      return false;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if (var5.field_h >= 0) {
                    break L7;
                  } else {
                    if (var5.field_b != null) {
                      break L7;
                    } else {
                      if (null == var5.field_a) {
                        break L7;
                      } else {
                        if (!var5.field_g.a(false)) {
                          this.a(var2, 30993, var5.field_g.b((byte) -100));
                          return false;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                }
                ((cb) this).field_j = ((cb) this).field_j + 1;
                continue L4;
              }
            } else {
              return true;
            }
          }
        }
    }

    final static boolean a(byte param0) {
        if (!cd.a(8192)) {
            return false;
        }
        if ((8 & uf.field_A) != 0) {
            return false;
        }
        return true;
    }

    private final void a(pb param0, int param1, int param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              var4_float = (float)(((cb) this).field_j - -1) + (float)param2 / 100.0f;
              ((cb) this).field_l = var4_float * (float)((cb) this).field_b / (float)(((cb) this).field_g + 1);
              if (param2 != 0) {
                ((cb) this).field_a = param0.field_a + " - " + param2 + "%";
                break L1;
              } else {
                ((cb) this).field_a = param0.field_j;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("cb.D(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + 30993 + ',' + param2 + ')');
        }
    }

    final void a(String param0, ji param1, String param2, byte param3, String param4) {
        try {
            int var6_int = -19 / ((param3 - 43) / 42);
            this.a(param0, 2, param2, param4, -1, param1);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "cb.F(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(hl param0, boolean param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        pf var5 = null;
        String var6 = null;
        pf var7 = null;
        String var8 = null;
        pf var9 = null;
        String var10 = null;
        pf var11 = null;
        String var12 = null;
        pf var13 = null;
        String stackIn_1_0 = null;
        Object stackIn_1_1 = null;
        int stackIn_1_2 = 0;
        Object stackIn_1_3 = null;
        w stackIn_1_4 = null;
        String stackIn_1_5 = null;
        long stackIn_1_6 = 0L;
        int stackIn_1_7 = 0;
        String stackIn_2_0 = null;
        Object stackIn_2_1 = null;
        int stackIn_2_2 = 0;
        Object stackIn_2_3 = null;
        w stackIn_2_4 = null;
        String stackIn_2_5 = null;
        long stackIn_2_6 = 0L;
        int stackIn_2_7 = 0;
        String stackIn_3_0 = null;
        Object stackIn_3_1 = null;
        int stackIn_3_2 = 0;
        Object stackIn_3_3 = null;
        w stackIn_3_4 = null;
        String stackIn_3_5 = null;
        long stackIn_3_6 = 0L;
        int stackIn_3_7 = 0;
        int stackIn_3_8 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_0_0 = null;
        Object stackOut_0_1 = null;
        int stackOut_0_2 = 0;
        Object stackOut_0_3 = null;
        w stackOut_0_4 = null;
        String stackOut_0_5 = null;
        long stackOut_0_6 = 0L;
        int stackOut_0_7 = 0;
        String stackOut_2_0 = null;
        Object stackOut_2_1 = null;
        int stackOut_2_2 = 0;
        Object stackOut_2_3 = null;
        w stackOut_2_4 = null;
        String stackOut_2_5 = null;
        long stackOut_2_6 = 0L;
        int stackOut_2_7 = 0;
        int stackOut_2_8 = 0;
        String stackOut_1_0 = null;
        Object stackOut_1_1 = null;
        int stackOut_1_2 = 0;
        Object stackOut_1_3 = null;
        w stackOut_1_4 = null;
        String stackOut_1_5 = null;
        long stackOut_1_6 = 0L;
        int stackOut_1_7 = 0;
        int stackOut_1_8 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            L1: {
              stackOut_0_0 = param0.field_o;
              stackOut_0_1 = null;
              stackOut_0_2 = 100;
              stackOut_0_3 = null;
              stackOut_0_4 = param0.field_f;
              stackOut_0_5 = param0.field_p;
              stackOut_0_6 = param0.field_r;
              stackOut_0_7 = param0.field_m;
              stackIn_2_0 = stackOut_0_0;
              stackIn_2_1 = stackOut_0_1;
              stackIn_2_2 = stackOut_0_2;
              stackIn_2_3 = stackOut_0_3;
              stackIn_2_4 = stackOut_0_4;
              stackIn_2_5 = stackOut_0_5;
              stackIn_2_6 = stackOut_0_6;
              stackIn_2_7 = stackOut_0_7;
              stackIn_1_0 = stackOut_0_0;
              stackIn_1_1 = stackOut_0_1;
              stackIn_1_2 = stackOut_0_2;
              stackIn_1_3 = stackOut_0_3;
              stackIn_1_4 = stackOut_0_4;
              stackIn_1_5 = stackOut_0_5;
              stackIn_1_6 = stackOut_0_6;
              stackIn_1_7 = stackOut_0_7;
              if (param0.field_m == 1) {
                stackOut_2_0 = (String) (Object) stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = stackIn_2_2;
                stackOut_2_3 = stackIn_2_3;
                stackOut_2_4 = (w) (Object) stackIn_2_4;
                stackOut_2_5 = (String) (Object) stackIn_2_5;
                stackOut_2_6 = stackIn_2_6;
                stackOut_2_7 = stackIn_2_7;
                stackOut_2_8 = param0.field_k;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                stackIn_3_2 = stackOut_2_2;
                stackIn_3_3 = stackOut_2_3;
                stackIn_3_4 = stackOut_2_4;
                stackIn_3_5 = stackOut_2_5;
                stackIn_3_6 = stackOut_2_6;
                stackIn_3_7 = stackOut_2_7;
                stackIn_3_8 = stackOut_2_8;
                break L1;
              } else {
                stackOut_1_0 = (String) (Object) stackIn_1_0;
                stackOut_1_1 = stackIn_1_1;
                stackOut_1_2 = stackIn_1_2;
                stackOut_1_3 = stackIn_1_3;
                stackOut_1_4 = (w) (Object) stackIn_1_4;
                stackOut_1_5 = (String) (Object) stackIn_1_5;
                stackOut_1_6 = stackIn_1_6;
                stackOut_1_7 = stackIn_1_7;
                stackOut_1_8 = 0;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                stackIn_3_2 = stackOut_1_2;
                stackIn_3_3 = stackOut_1_3;
                stackIn_3_4 = stackOut_1_4;
                stackIn_3_5 = stackOut_1_5;
                stackIn_3_6 = stackOut_1_6;
                stackIn_3_7 = stackOut_1_7;
                stackIn_3_8 = stackOut_1_8;
                break L1;
              }
            }
            L2: {
              sl.a(stackIn_3_0, (int[]) (Object) stackIn_3_1, (byte) stackIn_3_2, (nm) (Object) stackIn_3_3, stackIn_3_4, stackIn_3_5, stackIn_3_6, stackIn_3_7, stackIn_3_8);
              if (0 != param0.field_m) {
                break L2;
              } else {
                if (ne.b(-18163)) {
                  break L2;
                } else {
                  if (cd.field_m != null) {
                    break L2;
                  } else {
                    if (null != g.field_N) {
                      break L2;
                    } else {
                      L3: {
                        if (!wl.field_p) {
                          var5 = w.field_H;
                          var6 = wk.field_p;
                          var5.field_h.a(var6, 14, -61);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var7 = w.field_H;
                      var8 = re.field_t;
                      var7.field_h.a(var8, 20, 91);
                      break L2;
                    }
                  }
                }
              }
            }
            L4: {
              if (param0.field_m != 1) {
                break L4;
              } else {
                if (ne.b(-18163)) {
                  break L4;
                } else {
                  if (null == cd.field_m) {
                    break L4;
                  } else {
                    if (param0.field_k == cd.field_m.e(125)) {
                      L5: {
                        if (!wl.field_p) {
                          var9 = w.field_H;
                          var10 = ob.field_l;
                          var9.field_h.a(var10, 14, 121);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var11 = w.field_H;
                      var12 = eb.field_r;
                      var11.field_h.a(var12, 20, -57);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
              }
            }
            w.field_H.b(-92);
            w.field_H.a(false, 29072);
            w.field_H.a(param0.field_m, (byte) -43, param0.field_q);
            w.field_H.a(17);
            w.field_H.a((byte) -51, param0);
            var13 = w.field_H;
            var3 = he.field_S;
            var4 = nf.field_h;
            var13.field_h.b(var4, var3, 121, 0, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("cb.J(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L6;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + false + ')');
        }
    }

    final void a(String param0, byte param1, ji param2, String param3) {
        try {
            this.a((String) null, 2, param3, param0, -1, param2);
            int var5_int = 73 / ((6 - param1) / 37);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "cb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(boolean param0, CharSequence param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_33_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_32_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                var3_int = param1.length();
                if (var3_int < 1) {
                  break L1;
                } else {
                  if (var3_int > 12) {
                    break L1;
                  } else {
                    L2: {
                      var4 = kf.a(param1, (byte) 2);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if (var4.length() < 1) {
                          break L2;
                        } else {
                          L3: {
                            if (ug.a(var4.charAt(0), 32)) {
                              break L3;
                            } else {
                              if (ug.a(var4.charAt(var4.length() + -1), 32)) {
                                break L3;
                              } else {
                                var5 = 0;
                                var6 = 0;
                                L4: while (true) {
                                  if (param1.length() <= var6) {
                                    if (var5 > 0) {
                                      stackOut_32_0 = 0;
                                      stackIn_33_0 = stackOut_32_0;
                                      break L0;
                                    } else {
                                      return true;
                                    }
                                  } else {
                                    L5: {
                                      var7 = param1.charAt(var6);
                                      if (!ug.a((char) var7, 32)) {
                                        var5 = 0;
                                        break L5;
                                      } else {
                                        var5++;
                                        break L5;
                                      }
                                    }
                                    L6: {
                                      if (var5 < 2) {
                                        break L6;
                                      } else {
                                        if (!param0) {
                                          stackOut_27_0 = 0;
                                          stackIn_28_0 = stackOut_27_0;
                                          return stackIn_28_0 != 0;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                    var6++;
                                    continue L4;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_17_0 = 0;
                          stackIn_18_0 = stackOut_17_0;
                          return stackIn_18_0 != 0;
                        }
                      }
                    }
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0 != 0;
                  }
                }
              }
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0 != 0;
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) var3;
            stackOut_34_1 = new StringBuilder().append("cb.G(").append(param0).append(',');
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param1 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L7;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L7;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + ',' + 4564 + ')');
        }
        return stackIn_33_0 != 0;
    }

    cb(int param0) {
        ((cb) this).field_f = new pb[16];
        ((cb) this).field_b = param0;
    }

    final static void b(byte param0) {
        int var2 = 0;
        L0: {
          var2 = client.field_A ? 1 : 0;
          if (gi.field_c < 0) {
            bf.field_o = bf.field_o - (gi.field_c >> 1);
            break L0;
          } else {
            bf.field_o = bf.field_o + (-gi.field_c >> 1);
            break L0;
          }
        }
        gi.field_c = gi.field_c + bf.field_o;
        if (0 <= gi.field_c) {
          gi.field_c = gi.field_c + (-gi.field_c >> 4);
          if (0 <= nf.field_e) {
            wg.field_d = wg.field_d + (-nf.field_e >> 1);
            nf.field_e = nf.field_e + wg.field_d;
            if (nf.field_e >= 0) {
              L1: {
                nf.field_e = nf.field_e + (-nf.field_e >> 4);
                if (nf.field_e > 0) {
                  L2: {
                    if (wg.field_d > 0) {
                      wg.field_d = -wg.field_d;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  nf.field_e = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            } else {
              L3: {
                nf.field_e = nf.field_e - (nf.field_e >> 4);
                if (nf.field_e > 0) {
                  L4: {
                    if (wg.field_d > 0) {
                      wg.field_d = -wg.field_d;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  nf.field_e = 0;
                  break L3;
                } else {
                  break L3;
                }
              }
              return;
            }
          } else {
            wg.field_d = wg.field_d - (nf.field_e >> 1);
            nf.field_e = nf.field_e + wg.field_d;
            if (nf.field_e >= 0) {
              L5: {
                nf.field_e = nf.field_e + (-nf.field_e >> 4);
                if (nf.field_e > 0) {
                  L6: {
                    if (wg.field_d > 0) {
                      wg.field_d = -wg.field_d;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  nf.field_e = 0;
                  break L5;
                } else {
                  break L5;
                }
              }
              return;
            } else {
              L7: {
                nf.field_e = nf.field_e - (nf.field_e >> 4);
                if (nf.field_e > 0) {
                  L8: {
                    if (wg.field_d > 0) {
                      wg.field_d = -wg.field_d;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  nf.field_e = 0;
                  break L7;
                } else {
                  break L7;
                }
              }
              return;
            }
          }
        } else {
          L9: {
            gi.field_c = gi.field_c - (gi.field_c >> 4);
            if (0 <= nf.field_e) {
              wg.field_d = wg.field_d + (-nf.field_e >> 1);
              break L9;
            } else {
              wg.field_d = wg.field_d - (nf.field_e >> 1);
              break L9;
            }
          }
          nf.field_e = nf.field_e + wg.field_d;
          if (nf.field_e >= 0) {
            L10: {
              nf.field_e = nf.field_e + (-nf.field_e >> 4);
              if (nf.field_e > 0) {
                L11: {
                  if (wg.field_d > 0) {
                    wg.field_d = -wg.field_d;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                nf.field_e = 0;
                break L10;
              } else {
                break L10;
              }
            }
            return;
          } else {
            L12: {
              nf.field_e = nf.field_e - (nf.field_e >> 4);
              if (nf.field_e > 0) {
                L13: {
                  if (wg.field_d > 0) {
                    wg.field_d = -wg.field_d;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                nf.field_e = 0;
                break L12;
              } else {
                break L12;
              }
            }
            return;
          }
        }
    }

    final static int a(byte param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
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
            var2_int = 96 % ((3 - param0) / 35);
            stackOut_0_0 = s.a(true, 4, 10, param1);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("cb.H(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Breaking real-world laws";
        field_k = "Game full";
        field_h = "Name";
        field_i = "OH NO!";
    }
}
