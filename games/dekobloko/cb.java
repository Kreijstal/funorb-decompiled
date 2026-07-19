/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        int fieldTemp$0 = 0;
        try {
            if (this.field_g >= this.field_f.length) {
                var9 = new pb[2 * this.field_g];
                pb[] var7 = var9;
                an.a(this.field_f, 0, var9, 0, this.field_g);
                this.field_f = var9;
            }
            var8 = new pb();
            var10 = var8;
            pb var7_ref = var10;
            var10.field_j = param3;
            if (param1 != 2) {
                this.field_a = (String) null;
            }
            var10.field_a = param2;
            var10.field_b = param0;
            var10.field_h = param4;
            var10.field_g = param5;
            fieldTemp$0 = this.field_g;
            this.field_g = this.field_g + 1;
            this.field_f[fieldTemp$0] = var8;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "cb.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        field_e = (boolean[][]) null;
        if (param0 != 12623) {
            return;
        }
        field_k = null;
        field_h = null;
        field_i = null;
        field_d = null;
    }

    final boolean a(int param0) {
        boolean discarded$1 = false;
        pb var2 = null;
        int var3 = 0;
        pb var4 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_6_0 = false;
        boolean stackOut_4_0 = false;
        L0: {
          var3 = client.field_A ? 1 : 0;
          if (param0 <= -48) {
            break L0;
          } else {
            discarded$1 = this.a(88);
            break L0;
          }
        }
        L1: while (true) {
          if (this.field_j < this.field_g) {
            var4 = this.field_f[this.field_j];
            var2 = var4;
            stackOut_4_0 = var4.field_g.a((byte) 121);
            stackIn_6_0 = stackOut_4_0;
            stackIn_5_0 = stackOut_4_0;
            if (var3 == 0) {
              if (!stackIn_6_0) {
                this.a(var4, 30993, 0);
                return false;
              } else {
                L2: {
                  if ((var4.field_h ^ -1) > -1) {
                    break L2;
                  } else {
                    if (!var4.field_g.b(var4.field_h, (byte) -106)) {
                      this.a(var2, 30993, var4.field_g.a((byte) 34, var4.field_h));
                      return false;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (null == var4.field_b) {
                    break L3;
                  } else {
                    if (!var4.field_g.a(var4.field_b, (byte) -103)) {
                      this.a(var2, 30993, var4.field_g.a(20, var4.field_b));
                      return false;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (-1 >= (var4.field_h ^ -1)) {
                    break L4;
                  } else {
                    if (var4.field_b != null) {
                      break L4;
                    } else {
                      if (null == var4.field_a) {
                        break L4;
                      } else {
                        if (!var4.field_g.a(false)) {
                          this.a(var2, 30993, var4.field_g.b((byte) -100));
                          return false;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                this.field_j = this.field_j + 1;
                if (var3 == 0) {
                  continue L1;
                } else {
                  return true;
                }
              }
            } else {
              return stackIn_5_0;
            }
          } else {
            return true;
          }
        }
    }

    final static boolean a(byte param0) {
        int discarded$4 = 0;
        CharSequence var2 = null;
        if (param0 == -128) {
          if (cd.a(8192)) {
            if ((8 & uf.field_A) != 0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          var2 = (CharSequence) null;
          discarded$4 = cb.a((byte) 49, (CharSequence) null);
          if (cd.a(8192)) {
            if ((8 & uf.field_A) != 0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    private final void a(pb param0, int param1, int param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param1 == 30993) {
              L1: {
                L2: {
                  var4_float = (float)(this.field_j - -1) + (float)param2 / 100.0f;
                  this.field_l = var4_float * (float)this.field_b / (float)(this.field_g + 1);
                  if (param2 != 0) {
                    break L2;
                  } else {
                    this.field_a = param0.field_j;
                    if (!client.field_A) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                this.field_a = param0.field_a + " - " + param2 + "%";
                break L1;
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
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var4);
            stackOut_7_1 = new StringBuilder().append("cb.D(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(String param0, ji param1, String param2, byte param3, String param4) {
        try {
            int var6_int = -19 / ((param3 - 43) / 42);
            this.a(param0, 2, param2, param4, -1, param1);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "cb.F(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
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
              if (-2 == (param0.field_m ^ -1)) {
                stackOut_2_0 = (String) ((Object) stackIn_2_0);
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = stackIn_2_2;
                stackOut_2_3 = stackIn_2_3;
                stackOut_2_4 = (w) ((Object) stackIn_2_4);
                stackOut_2_5 = (String) ((Object) stackIn_2_5);
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
                stackOut_1_0 = (String) ((Object) stackIn_1_0);
                stackOut_1_1 = stackIn_1_1;
                stackOut_1_2 = stackIn_1_2;
                stackOut_1_3 = stackIn_1_3;
                stackOut_1_4 = (w) ((Object) stackIn_1_4);
                stackOut_1_5 = (String) ((Object) stackIn_1_5);
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
              sl.a(stackIn_3_0, (int[]) ((Object) stackIn_3_1), (byte) stackIn_3_2, (nm) ((Object) stackIn_3_3), stackIn_3_4, stackIn_3_5, stackIn_3_6, stackIn_3_7, stackIn_3_8);
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
              if (-2 != (param0.field_m ^ -1)) {
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
            w.field_H.a(param1, 29072);
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
            stackOut_22_0 = (RuntimeException) (var2);
            stackOut_22_1 = new StringBuilder().append("cb.J(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L6;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
    }

    final void a(String param0, byte param1, ji param2, String param3) {
        try {
            this.a((String) null, 2, param3, param0, -1, param2);
            int var5_int = 73 / ((6 - param1) / 37);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "cb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(boolean param0, CharSequence param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        boolean stackIn_24_0 = false;
        int stackIn_32_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_34_0 = 0;
        boolean stackOut_23_0 = false;
        int stackOut_31_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                if (param2 == 4564) {
                  break L1;
                } else {
                  field_c = 77;
                  break L1;
                }
              }
              L2: {
                var3_int = param1.length();
                if (-2 < (var3_int ^ -1)) {
                  break L2;
                } else {
                  if ((var3_int ^ -1) < -13) {
                    break L2;
                  } else {
                    L3: {
                      var4 = kf.a(param1, (byte) 2);
                      if (var4 == null) {
                        break L3;
                      } else {
                        if ((var4.length() ^ -1) > -2) {
                          break L3;
                        } else {
                          L4: {
                            if (ug.a(var4.charAt(0), 32)) {
                              break L4;
                            } else {
                              if (ug.a(var4.charAt(var4.length() + -1), 32)) {
                                break L4;
                              } else {
                                var5 = 0;
                                var6 = 0;
                                L5: while (true) {
                                  L6: {
                                    if (param1.length() <= var6) {
                                      stackOut_34_0 = -1;
                                      stackIn_35_0 = stackOut_34_0;
                                      break L6;
                                    } else {
                                      var7 = param1.charAt(var6);
                                      stackOut_23_0 = ug.a((char) var7, 32);
                                      stackIn_35_0 = stackOut_23_0 ? 1 : 0;
                                      stackIn_24_0 = stackOut_23_0;
                                      if (var8 != 0) {
                                        break L6;
                                      } else {
                                        L7: {
                                          L8: {
                                            if (!stackIn_24_0) {
                                              break L8;
                                            } else {
                                              var5++;
                                              if (var8 == 0) {
                                                break L7;
                                              } else {
                                                break L8;
                                              }
                                            }
                                          }
                                          var5 = 0;
                                          break L7;
                                        }
                                        L9: {
                                          if (-3 < (var5 ^ -1)) {
                                            break L9;
                                          } else {
                                            if (!param0) {
                                              stackOut_31_0 = 0;
                                              stackIn_32_0 = stackOut_31_0;
                                              decompiledRegionSelector0 = 4;
                                              break L0;
                                            } else {
                                              break L9;
                                            }
                                          }
                                        }
                                        var6++;
                                        continue L5;
                                      }
                                    }
                                  }
                                  if (stackIn_35_0 > (var5 ^ -1)) {
                                    stackOut_37_0 = 0;
                                    stackIn_38_0 = stackOut_37_0;
                                    decompiledRegionSelector0 = 5;
                                    break L0;
                                  } else {
                                    return true;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_19_0 = 0;
                          stackIn_20_0 = stackOut_19_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                    }
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) (var3);
            stackOut_39_1 = new StringBuilder().append("cb.G(").append(param0).append(',');
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param1 == null) {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L10;
            } else {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L10;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_20_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_32_0 != 0;
                } else {
                  return stackIn_38_0 != 0;
                }
              }
            }
          }
        }
    }

    cb(int param0) {
        this.field_f = new pb[16];
        this.field_b = param0;
    }

    final static void b(byte param0) {
        int var2 = 0;
        hl var3 = null;
        var2 = client.field_A ? 1 : 0;
        if ((gi.field_c ^ -1) <= -1) {
          bf.field_o = bf.field_o + (-gi.field_c >> 467911937);
          if (var2 != 0) {
            L0: {
              bf.field_o = bf.field_o - (gi.field_c >> 33324641);
              gi.field_c = gi.field_c + bf.field_o;
              if (0 <= gi.field_c) {
                break L0;
              } else {
                gi.field_c = gi.field_c - (gi.field_c >> -858222876);
                if (var2 == 0) {
                  if (0 <= nf.field_e) {
                    wg.field_d = wg.field_d + (-nf.field_e >> -2045972351);
                    nf.field_e = nf.field_e + wg.field_d;
                    if (nf.field_e < 0) {
                      nf.field_e = nf.field_e - (nf.field_e >> 117175588);
                      if (param0 == 71) {
                        L1: {
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
                          var3 = (hl) null;
                          cb.a((hl) null, false);
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
                      nf.field_e = nf.field_e + (-nf.field_e >> 1697152068);
                      if (var2 == 0) {
                        if (param0 == 71) {
                          L5: {
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
                            var3 = (hl) null;
                            cb.a((hl) null, false);
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
                      } else {
                        L9: {
                          nf.field_e = nf.field_e - (nf.field_e >> 117175588);
                          if (param0 == 71) {
                            break L9;
                          } else {
                            var3 = (hl) null;
                            cb.a((hl) null, false);
                            break L9;
                          }
                        }
                        L10: {
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
                      }
                    }
                  } else {
                    wg.field_d = wg.field_d - (nf.field_e >> -727063359);
                    if (var2 == 0) {
                      nf.field_e = nf.field_e + wg.field_d;
                      if (nf.field_e < 0) {
                        nf.field_e = nf.field_e - (nf.field_e >> 117175588);
                        if (param0 == 71) {
                          L12: {
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
                        } else {
                          L14: {
                            var3 = (hl) null;
                            cb.a((hl) null, false);
                            if (nf.field_e > 0) {
                              L15: {
                                if (wg.field_d > 0) {
                                  wg.field_d = -wg.field_d;
                                  break L15;
                                } else {
                                  break L15;
                                }
                              }
                              nf.field_e = 0;
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                          return;
                        }
                      } else {
                        nf.field_e = nf.field_e + (-nf.field_e >> 1697152068);
                        if (var2 == 0) {
                          if (param0 == 71) {
                            L16: {
                              if (nf.field_e > 0) {
                                L17: {
                                  if (wg.field_d > 0) {
                                    wg.field_d = -wg.field_d;
                                    break L17;
                                  } else {
                                    break L17;
                                  }
                                }
                                nf.field_e = 0;
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                            return;
                          } else {
                            L18: {
                              var3 = (hl) null;
                              cb.a((hl) null, false);
                              if (nf.field_e > 0) {
                                L19: {
                                  if (wg.field_d > 0) {
                                    wg.field_d = -wg.field_d;
                                    break L19;
                                  } else {
                                    break L19;
                                  }
                                }
                                nf.field_e = 0;
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            return;
                          }
                        } else {
                          nf.field_e = nf.field_e - (nf.field_e >> 117175588);
                          if (param0 == 71) {
                            L20: {
                              if (nf.field_e > 0) {
                                L21: {
                                  if (wg.field_d > 0) {
                                    wg.field_d = -wg.field_d;
                                    break L21;
                                  } else {
                                    break L21;
                                  }
                                }
                                nf.field_e = 0;
                                break L20;
                              } else {
                                break L20;
                              }
                            }
                            return;
                          } else {
                            L22: {
                              var3 = (hl) null;
                              cb.a((hl) null, false);
                              if (nf.field_e > 0) {
                                L23: {
                                  if (wg.field_d > 0) {
                                    wg.field_d = -wg.field_d;
                                    break L23;
                                  } else {
                                    break L23;
                                  }
                                }
                                nf.field_e = 0;
                                break L22;
                              } else {
                                break L22;
                              }
                            }
                            return;
                          }
                        }
                      }
                    } else {
                      L24: {
                        wg.field_d = wg.field_d + (-nf.field_e >> -2045972351);
                        nf.field_e = nf.field_e + wg.field_d;
                        if (nf.field_e < 0) {
                          break L24;
                        } else {
                          nf.field_e = nf.field_e + (-nf.field_e >> 1697152068);
                          break L24;
                        }
                      }
                      nf.field_e = nf.field_e - (nf.field_e >> 117175588);
                      if (param0 != 71) {
                        L25: {
                          var3 = (hl) null;
                          cb.a((hl) null, false);
                          if (nf.field_e > 0) {
                            L26: {
                              if (wg.field_d > 0) {
                                wg.field_d = -wg.field_d;
                                break L26;
                              } else {
                                break L26;
                              }
                            }
                            nf.field_e = 0;
                            break L25;
                          } else {
                            break L25;
                          }
                        }
                        return;
                      } else {
                        L27: {
                          if (nf.field_e > 0) {
                            L28: {
                              if (wg.field_d > 0) {
                                wg.field_d = -wg.field_d;
                                break L28;
                              } else {
                                break L28;
                              }
                            }
                            nf.field_e = 0;
                            break L27;
                          } else {
                            break L27;
                          }
                        }
                        return;
                      }
                    }
                  }
                } else {
                  break L0;
                }
              }
            }
            L29: {
              L30: {
                gi.field_c = gi.field_c + (-gi.field_c >> -1859306780);
                if (0 <= nf.field_e) {
                  break L30;
                } else {
                  wg.field_d = wg.field_d - (nf.field_e >> -727063359);
                  if (var2 == 0) {
                    break L29;
                  } else {
                    break L30;
                  }
                }
              }
              wg.field_d = wg.field_d + (-nf.field_e >> -2045972351);
              break L29;
            }
            L31: {
              L32: {
                nf.field_e = nf.field_e + wg.field_d;
                if (nf.field_e < 0) {
                  break L32;
                } else {
                  nf.field_e = nf.field_e + (-nf.field_e >> 1697152068);
                  if (var2 == 0) {
                    break L31;
                  } else {
                    break L32;
                  }
                }
              }
              nf.field_e = nf.field_e - (nf.field_e >> 117175588);
              break L31;
            }
            L33: {
              if (param0 == 71) {
                break L33;
              } else {
                var3 = (hl) null;
                cb.a((hl) null, false);
                break L33;
              }
            }
            L34: {
              if (nf.field_e > 0) {
                L35: {
                  if (wg.field_d > 0) {
                    wg.field_d = -wg.field_d;
                    break L35;
                  } else {
                    break L35;
                  }
                }
                nf.field_e = 0;
                break L34;
              } else {
                break L34;
              }
            }
            return;
          } else {
            L36: {
              gi.field_c = gi.field_c + bf.field_o;
              if (0 <= gi.field_c) {
                break L36;
              } else {
                gi.field_c = gi.field_c - (gi.field_c >> -858222876);
                if (var2 == 0) {
                  if (0 > nf.field_e) {
                    wg.field_d = wg.field_d - (nf.field_e >> -727063359);
                    if (var2 == 0) {
                      nf.field_e = nf.field_e + wg.field_d;
                      if (nf.field_e >= 0) {
                        nf.field_e = nf.field_e + (-nf.field_e >> 1697152068);
                        if (var2 == 0) {
                          if (param0 != 71) {
                            L37: {
                              var3 = (hl) null;
                              cb.a((hl) null, false);
                              if (nf.field_e > 0) {
                                L38: {
                                  if (wg.field_d > 0) {
                                    wg.field_d = -wg.field_d;
                                    break L38;
                                  } else {
                                    break L38;
                                  }
                                }
                                nf.field_e = 0;
                                break L37;
                              } else {
                                break L37;
                              }
                            }
                            return;
                          } else {
                            L39: {
                              if (nf.field_e > 0) {
                                L40: {
                                  if (wg.field_d > 0) {
                                    wg.field_d = -wg.field_d;
                                    break L40;
                                  } else {
                                    break L40;
                                  }
                                }
                                nf.field_e = 0;
                                break L39;
                              } else {
                                break L39;
                              }
                            }
                            return;
                          }
                        } else {
                          L41: {
                            nf.field_e = nf.field_e - (nf.field_e >> 117175588);
                            if (param0 == 71) {
                              break L41;
                            } else {
                              var3 = (hl) null;
                              cb.a((hl) null, false);
                              break L41;
                            }
                          }
                          L42: {
                            if (nf.field_e > 0) {
                              L43: {
                                if (wg.field_d > 0) {
                                  wg.field_d = -wg.field_d;
                                  break L43;
                                } else {
                                  break L43;
                                }
                              }
                              nf.field_e = 0;
                              break L42;
                            } else {
                              break L42;
                            }
                          }
                          return;
                        }
                      } else {
                        L44: {
                          nf.field_e = nf.field_e - (nf.field_e >> 117175588);
                          if (param0 == 71) {
                            break L44;
                          } else {
                            var3 = (hl) null;
                            cb.a((hl) null, false);
                            break L44;
                          }
                        }
                        L45: {
                          if (nf.field_e > 0) {
                            L46: {
                              if (wg.field_d > 0) {
                                wg.field_d = -wg.field_d;
                                break L46;
                              } else {
                                break L46;
                              }
                            }
                            nf.field_e = 0;
                            break L45;
                          } else {
                            break L45;
                          }
                        }
                        return;
                      }
                    } else {
                      L47: {
                        wg.field_d = wg.field_d + (-nf.field_e >> -2045972351);
                        nf.field_e = nf.field_e + wg.field_d;
                        if (nf.field_e < 0) {
                          break L47;
                        } else {
                          nf.field_e = nf.field_e + (-nf.field_e >> 1697152068);
                          break L47;
                        }
                      }
                      nf.field_e = nf.field_e - (nf.field_e >> 117175588);
                      L48: {
                        if (param0 == 71) {
                          break L48;
                        } else {
                          var3 = (hl) null;
                          cb.a((hl) null, false);
                          break L48;
                        }
                      }
                      L49: {
                        if (nf.field_e > 0) {
                          L50: {
                            if (wg.field_d > 0) {
                              wg.field_d = -wg.field_d;
                              break L50;
                            } else {
                              break L50;
                            }
                          }
                          nf.field_e = 0;
                          break L49;
                        } else {
                          break L49;
                        }
                      }
                      return;
                    }
                  } else {
                    L51: {
                      L52: {
                        wg.field_d = wg.field_d + (-nf.field_e >> -2045972351);
                        nf.field_e = nf.field_e + wg.field_d;
                        if (nf.field_e < 0) {
                          break L52;
                        } else {
                          nf.field_e = nf.field_e + (-nf.field_e >> 1697152068);
                          if (var2 == 0) {
                            break L51;
                          } else {
                            break L52;
                          }
                        }
                      }
                      nf.field_e = nf.field_e - (nf.field_e >> 117175588);
                      break L51;
                    }
                    L53: {
                      if (param0 == 71) {
                        break L53;
                      } else {
                        var3 = (hl) null;
                        cb.a((hl) null, false);
                        break L53;
                      }
                    }
                    L54: {
                      if (nf.field_e > 0) {
                        L55: {
                          if (wg.field_d > 0) {
                            wg.field_d = -wg.field_d;
                            break L55;
                          } else {
                            break L55;
                          }
                        }
                        nf.field_e = 0;
                        break L54;
                      } else {
                        break L54;
                      }
                    }
                    return;
                  }
                } else {
                  break L36;
                }
              }
            }
            L56: {
              L57: {
                gi.field_c = gi.field_c + (-gi.field_c >> -1859306780);
                if (0 <= nf.field_e) {
                  break L57;
                } else {
                  wg.field_d = wg.field_d - (nf.field_e >> -727063359);
                  if (var2 == 0) {
                    break L56;
                  } else {
                    break L57;
                  }
                }
              }
              wg.field_d = wg.field_d + (-nf.field_e >> -2045972351);
              break L56;
            }
            L58: {
              L59: {
                nf.field_e = nf.field_e + wg.field_d;
                if (nf.field_e < 0) {
                  break L59;
                } else {
                  nf.field_e = nf.field_e + (-nf.field_e >> 1697152068);
                  if (var2 == 0) {
                    break L58;
                  } else {
                    break L59;
                  }
                }
              }
              nf.field_e = nf.field_e - (nf.field_e >> 117175588);
              break L58;
            }
            L60: {
              if (param0 == 71) {
                break L60;
              } else {
                var3 = (hl) null;
                cb.a((hl) null, false);
                break L60;
              }
            }
            L61: {
              if (nf.field_e > 0) {
                L62: {
                  if (wg.field_d > 0) {
                    wg.field_d = -wg.field_d;
                    break L62;
                  } else {
                    break L62;
                  }
                }
                nf.field_e = 0;
                break L61;
              } else {
                break L61;
              }
            }
            return;
          }
        } else {
          L63: {
            bf.field_o = bf.field_o - (gi.field_c >> 33324641);
            gi.field_c = gi.field_c + bf.field_o;
            if (0 <= gi.field_c) {
              break L63;
            } else {
              gi.field_c = gi.field_c - (gi.field_c >> -858222876);
              if (var2 == 0) {
                if (0 > nf.field_e) {
                  wg.field_d = wg.field_d - (nf.field_e >> -727063359);
                  if (var2 == 0) {
                    nf.field_e = nf.field_e + wg.field_d;
                    if (nf.field_e >= 0) {
                      nf.field_e = nf.field_e + (-nf.field_e >> 1697152068);
                      if (var2 == 0) {
                        if (param0 != 71) {
                          L64: {
                            var3 = (hl) null;
                            cb.a((hl) null, false);
                            if (nf.field_e > 0) {
                              L65: {
                                if (wg.field_d > 0) {
                                  wg.field_d = -wg.field_d;
                                  break L65;
                                } else {
                                  break L65;
                                }
                              }
                              nf.field_e = 0;
                              break L64;
                            } else {
                              break L64;
                            }
                          }
                          return;
                        } else {
                          L66: {
                            if (nf.field_e > 0) {
                              L67: {
                                if (wg.field_d > 0) {
                                  wg.field_d = -wg.field_d;
                                  break L67;
                                } else {
                                  break L67;
                                }
                              }
                              nf.field_e = 0;
                              break L66;
                            } else {
                              break L66;
                            }
                          }
                          return;
                        }
                      } else {
                        L68: {
                          nf.field_e = nf.field_e - (nf.field_e >> 117175588);
                          if (param0 == 71) {
                            break L68;
                          } else {
                            var3 = (hl) null;
                            cb.a((hl) null, false);
                            break L68;
                          }
                        }
                        L69: {
                          if (nf.field_e > 0) {
                            L70: {
                              if (wg.field_d > 0) {
                                wg.field_d = -wg.field_d;
                                break L70;
                              } else {
                                break L70;
                              }
                            }
                            nf.field_e = 0;
                            break L69;
                          } else {
                            break L69;
                          }
                        }
                        return;
                      }
                    } else {
                      L71: {
                        nf.field_e = nf.field_e - (nf.field_e >> 117175588);
                        if (param0 == 71) {
                          break L71;
                        } else {
                          var3 = (hl) null;
                          cb.a((hl) null, false);
                          break L71;
                        }
                      }
                      L72: {
                        if (nf.field_e > 0) {
                          L73: {
                            if (wg.field_d > 0) {
                              wg.field_d = -wg.field_d;
                              break L73;
                            } else {
                              break L73;
                            }
                          }
                          nf.field_e = 0;
                          break L72;
                        } else {
                          break L72;
                        }
                      }
                      return;
                    }
                  } else {
                    L74: {
                      wg.field_d = wg.field_d + (-nf.field_e >> -2045972351);
                      nf.field_e = nf.field_e + wg.field_d;
                      if (nf.field_e < 0) {
                        break L74;
                      } else {
                        nf.field_e = nf.field_e + (-nf.field_e >> 1697152068);
                        break L74;
                      }
                    }
                    nf.field_e = nf.field_e - (nf.field_e >> 117175588);
                    L75: {
                      if (param0 == 71) {
                        break L75;
                      } else {
                        var3 = (hl) null;
                        cb.a((hl) null, false);
                        break L75;
                      }
                    }
                    L76: {
                      if (nf.field_e > 0) {
                        L77: {
                          if (wg.field_d > 0) {
                            wg.field_d = -wg.field_d;
                            break L77;
                          } else {
                            break L77;
                          }
                        }
                        nf.field_e = 0;
                        break L76;
                      } else {
                        break L76;
                      }
                    }
                    return;
                  }
                } else {
                  L78: {
                    L79: {
                      wg.field_d = wg.field_d + (-nf.field_e >> -2045972351);
                      nf.field_e = nf.field_e + wg.field_d;
                      if (nf.field_e < 0) {
                        break L79;
                      } else {
                        nf.field_e = nf.field_e + (-nf.field_e >> 1697152068);
                        if (var2 == 0) {
                          break L78;
                        } else {
                          break L79;
                        }
                      }
                    }
                    nf.field_e = nf.field_e - (nf.field_e >> 117175588);
                    break L78;
                  }
                  L80: {
                    if (param0 == 71) {
                      break L80;
                    } else {
                      var3 = (hl) null;
                      cb.a((hl) null, false);
                      break L80;
                    }
                  }
                  L81: {
                    if (nf.field_e > 0) {
                      L82: {
                        if (wg.field_d > 0) {
                          wg.field_d = -wg.field_d;
                          break L82;
                        } else {
                          break L82;
                        }
                      }
                      nf.field_e = 0;
                      break L81;
                    } else {
                      break L81;
                    }
                  }
                  return;
                }
              } else {
                break L63;
              }
            }
          }
          L83: {
            L84: {
              gi.field_c = gi.field_c + (-gi.field_c >> -1859306780);
              if (0 <= nf.field_e) {
                break L84;
              } else {
                wg.field_d = wg.field_d - (nf.field_e >> -727063359);
                if (var2 == 0) {
                  break L83;
                } else {
                  break L84;
                }
              }
            }
            wg.field_d = wg.field_d + (-nf.field_e >> -2045972351);
            break L83;
          }
          L85: {
            L86: {
              nf.field_e = nf.field_e + wg.field_d;
              if (nf.field_e < 0) {
                break L86;
              } else {
                nf.field_e = nf.field_e + (-nf.field_e >> 1697152068);
                if (var2 == 0) {
                  break L85;
                } else {
                  break L86;
                }
              }
            }
            nf.field_e = nf.field_e - (nf.field_e >> 117175588);
            break L85;
          }
          L87: {
            if (param0 == 71) {
              break L87;
            } else {
              var3 = (hl) null;
              cb.a((hl) null, false);
              break L87;
            }
          }
          L88: {
            if (nf.field_e > 0) {
              L89: {
                if (wg.field_d > 0) {
                  wg.field_d = -wg.field_d;
                  break L89;
                } else {
                  break L89;
                }
              }
              nf.field_e = 0;
              break L88;
            } else {
              break L88;
            }
          }
          return;
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
            stackOut_2_0 = (RuntimeException) (var2);
            stackOut_2_1 = new StringBuilder().append("cb.H(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    static {
        field_d = "Breaking real-world laws";
        field_k = "Game full";
        field_h = "Name";
        field_i = "OH NO!";
    }
}
