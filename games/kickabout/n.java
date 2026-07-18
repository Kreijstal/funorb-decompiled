/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n {
    private bi field_g;
    private iw field_i;
    static qv field_e;
    static String[] field_f;
    static int field_m;
    private eb field_h;
    private java.math.BigInteger field_b;
    private java.math.BigInteger field_l;
    static String field_j;
    static boolean field_c;
    private wm[] field_k;
    static int field_d;
    private ui field_a;

    public static void b() {
        field_f = null;
        field_e = null;
        field_j = null;
    }

    final static String a(char param0, String param1, byte param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var12 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var4_int = param3.length();
              var5 = param1.length();
              var6 = var4_int;
              var7 = -1 + var5;
              if (var7 != 0) {
                var8_int = 0;
                L2: while (true) {
                  var8_int = param3.indexOf('_', var8_int);
                  if (0 > var8_int) {
                    break L1;
                  } else {
                    var6 = var6 + var7;
                    var8_int++;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            var10 = 4 % ((-69 - param2) / 54);
            var8 = new StringBuilder(var6);
            var9 = 0;
            L3: while (true) {
              var11 = param3.indexOf('_', var9);
              if (0 > var11) {
                StringBuilder discarded$6 = var8.append(param3.substring(var9));
                stackOut_9_0 = var8.toString();
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                StringBuilder discarded$7 = var8.append(param3.substring(var9, var11));
                StringBuilder discarded$8 = var8.append(param1);
                var9 = 1 + var11;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("n.B(").append('_').append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_10_0;
    }

    n(bi param0, eb param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final wm a(qh param0, int param1, int param2, boolean param3, qh param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        wm var9 = null;
        int var10 = 0;
        byte[] var14 = null;
        wm stackIn_9_0 = null;
        wm stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        wm stackOut_8_0 = null;
        wm stackOut_10_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (((n) this).field_i != null) {
              L1: {
                if (param2 < 0) {
                  break L1;
                } else {
                  if (param2 < ((n) this).field_k.length) {
                    if (null != ((n) this).field_k[param2]) {
                      stackOut_8_0 = ((n) this).field_k[param2];
                      stackIn_9_0 = stackOut_8_0;
                      return stackIn_9_0;
                    } else {
                      ((n) this).field_i.field_n = param2 * 72 + 6;
                      var6_int = ((n) this).field_i.k(4);
                      var7 = ((n) this).field_i.k(4);
                      var14 = new byte[64];
                      ((n) this).field_i.a(var14, 0, (byte) -6, 64);
                      var10 = -31 / ((param1 - 39) / 51);
                      var9 = new wm(param2, param0, param4, ((n) this).field_g, ((n) this).field_h, var6_int, var14, var7, param3);
                      ((n) this).field_k[param2] = var9;
                      stackOut_10_0 = (wm) var9;
                      stackIn_11_0 = stackOut_10_0;
                      break L0;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              throw new RuntimeException();
            } else {
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var6;
            stackOut_12_1 = new StringBuilder().append("n.C(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          L3: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param4 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
        return stackIn_11_0;
    }

    final static void a(int param0, String param1) {
        int var2_int = 0;
        int var3 = 0;
        int var5 = 0;
        int var6 = 0;
        try {
            jw.field_Cb.field_E = param1;
            qv.field_f = true;
            var2_int = ea.field_f.field_a;
            var3 = ea.field_f.field_e;
            int var4 = 3;
            var5 = jw.field_Cb.field_X.c(param1, 272, jw.field_Cb.field_xb);
            var6 = -103 + var3 / 2 + -(var5 / 2);
            kk.field_j.a(true, 320, (-320 + var2_int) / 2, var6, -120 + (var3 - 2 * var6));
            kk.field_j.field_R = fs.a(kk.field_j.field_mb, 3, 2105376, 11579568, 8421504, (byte) 126);
            jw.field_Cb.a(true, -24 + kk.field_j.field_q - 24, 24, 16, -24 + (-20 + kk.field_j.field_mb));
            ao.field_a.a(true, 80, 120, -20 + kk.field_j.field_mb + -24, 24);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "n.D(" + 126 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var3 = Kickabout.field_G;
        if (((n) this).field_k == null) {
          return;
        } else {
          var2 = param0;
          L0: while (true) {
            if (((n) this).field_k.length <= var2) {
              var4 = 0;
              var2 = var4;
              L1: while (true) {
                if (((n) this).field_k.length <= var4) {
                  return;
                } else {
                  if (null != ((n) this).field_k[var4]) {
                    ((n) this).field_k[var4].b(-44);
                    var4++;
                    continue L1;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              if (((n) this).field_k[var2] != null) {
                ((n) this).field_k[var2].d(18137);
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (null != oo.field_e) {
          if (param1 > oo.field_e.length) {
            L0: {
              L1: {
                oo.field_e = new int[param1 * 2];
                if (bl.field_m == null) {
                  break L1;
                } else {
                  if (bl.field_m.length < param1) {
                    break L1;
                  } else {
                    break L0;
                  }
                }
              }
              bl.field_m = new int[2 * param1];
              break L0;
            }
            L2: {
              L3: {
                if (qp.field_G == null) {
                  break L3;
                } else {
                  if (param1 <= qp.field_G.length) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              qp.field_G = new int[param1 * 2];
              break L2;
            }
            L4: {
              if (null == fo.field_j) {
                break L4;
              } else {
                if (param1 <= fo.field_j.length) {
                  L5: {
                    L6: {
                      if (ln.field_B == null) {
                        break L6;
                      } else {
                        if (ln.field_B.length < param1) {
                          break L6;
                        } else {
                          break L5;
                        }
                      }
                    }
                    ln.field_B = new int[2 * param1];
                    break L5;
                  }
                  if (null == w.field_a) {
                    w.field_a = new int[param1 * 2];
                    if (pf.field_d == null) {
                      L7: {
                        pf.field_d = new int[(param2 + param1) * 2];
                        if (null == ug.field_f) {
                          break L7;
                        } else {
                          if (ug.field_f.length >= param1) {
                            kt.field_g = -2147483648;
                            lm.field_V = -2147483648;
                            er.field_k = 2147483647;
                            vi.field_s = 2147483647;
                            wf.field_O = 0;
                            return;
                          } else {
                            break L7;
                          }
                        }
                      }
                      ug.field_f = new boolean[2 * param1];
                      kt.field_g = -2147483648;
                      lm.field_V = -2147483648;
                      er.field_k = 2147483647;
                      vi.field_s = 2147483647;
                      wf.field_O = 0;
                      return;
                    } else {
                      if (param2 + param1 <= pf.field_d.length) {
                        if (null == ug.field_f) {
                          ug.field_f = new boolean[2 * param1];
                          kt.field_g = -2147483648;
                          lm.field_V = -2147483648;
                          er.field_k = 2147483647;
                          vi.field_s = 2147483647;
                          wf.field_O = 0;
                          return;
                        } else {
                          if (ug.field_f.length < param1) {
                            ug.field_f = new boolean[2 * param1];
                            kt.field_g = -2147483648;
                            lm.field_V = -2147483648;
                            er.field_k = 2147483647;
                            vi.field_s = 2147483647;
                            wf.field_O = 0;
                            return;
                          } else {
                            kt.field_g = -2147483648;
                            lm.field_V = -2147483648;
                            er.field_k = 2147483647;
                            vi.field_s = 2147483647;
                            wf.field_O = 0;
                            return;
                          }
                        }
                      } else {
                        L8: {
                          pf.field_d = new int[(param2 + param1) * 2];
                          if (null == ug.field_f) {
                            break L8;
                          } else {
                            if (ug.field_f.length >= param1) {
                              kt.field_g = -2147483648;
                              lm.field_V = -2147483648;
                              er.field_k = 2147483647;
                              vi.field_s = 2147483647;
                              wf.field_O = 0;
                              return;
                            } else {
                              break L8;
                            }
                          }
                        }
                        ug.field_f = new boolean[2 * param1];
                        kt.field_g = -2147483648;
                        lm.field_V = -2147483648;
                        er.field_k = 2147483647;
                        vi.field_s = 2147483647;
                        wf.field_O = 0;
                        return;
                      }
                    }
                  } else {
                    if (param1 <= w.field_a.length) {
                      if (pf.field_d == null) {
                        pf.field_d = new int[(param2 + param1) * 2];
                        if (null == ug.field_f) {
                          ug.field_f = new boolean[2 * param1];
                          kt.field_g = -2147483648;
                          lm.field_V = -2147483648;
                          er.field_k = 2147483647;
                          vi.field_s = 2147483647;
                          wf.field_O = 0;
                          return;
                        } else {
                          if (ug.field_f.length < param1) {
                            ug.field_f = new boolean[2 * param1];
                            kt.field_g = -2147483648;
                            lm.field_V = -2147483648;
                            er.field_k = 2147483647;
                            vi.field_s = 2147483647;
                            wf.field_O = 0;
                            return;
                          } else {
                            kt.field_g = -2147483648;
                            lm.field_V = -2147483648;
                            er.field_k = 2147483647;
                            vi.field_s = 2147483647;
                            wf.field_O = 0;
                            return;
                          }
                        }
                      } else {
                        if (param2 + param1 <= pf.field_d.length) {
                          if (null == ug.field_f) {
                            ug.field_f = new boolean[2 * param1];
                            kt.field_g = -2147483648;
                            lm.field_V = -2147483648;
                            er.field_k = 2147483647;
                            vi.field_s = 2147483647;
                            wf.field_O = 0;
                            return;
                          } else {
                            if (ug.field_f.length < param1) {
                              ug.field_f = new boolean[2 * param1];
                              kt.field_g = -2147483648;
                              lm.field_V = -2147483648;
                              er.field_k = 2147483647;
                              vi.field_s = 2147483647;
                              wf.field_O = 0;
                              return;
                            } else {
                              kt.field_g = -2147483648;
                              lm.field_V = -2147483648;
                              er.field_k = 2147483647;
                              vi.field_s = 2147483647;
                              wf.field_O = 0;
                              return;
                            }
                          }
                        } else {
                          pf.field_d = new int[(param2 + param1) * 2];
                          if (null == ug.field_f) {
                            ug.field_f = new boolean[2 * param1];
                            kt.field_g = -2147483648;
                            lm.field_V = -2147483648;
                            er.field_k = 2147483647;
                            vi.field_s = 2147483647;
                            wf.field_O = 0;
                            return;
                          } else {
                            if (ug.field_f.length < param1) {
                              ug.field_f = new boolean[2 * param1];
                              kt.field_g = -2147483648;
                              lm.field_V = -2147483648;
                              er.field_k = 2147483647;
                              vi.field_s = 2147483647;
                              wf.field_O = 0;
                              return;
                            } else {
                              kt.field_g = -2147483648;
                              lm.field_V = -2147483648;
                              er.field_k = 2147483647;
                              vi.field_s = 2147483647;
                              wf.field_O = 0;
                              return;
                            }
                          }
                        }
                      }
                    } else {
                      L9: {
                        L10: {
                          w.field_a = new int[param1 * 2];
                          if (pf.field_d == null) {
                            break L10;
                          } else {
                            if (param2 + param1 <= pf.field_d.length) {
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        pf.field_d = new int[(param2 + param1) * 2];
                        break L9;
                      }
                      if (null == ug.field_f) {
                        ug.field_f = new boolean[2 * param1];
                        kt.field_g = -2147483648;
                        lm.field_V = -2147483648;
                        er.field_k = 2147483647;
                        vi.field_s = 2147483647;
                        wf.field_O = 0;
                        return;
                      } else {
                        if (ug.field_f.length < param1) {
                          ug.field_f = new boolean[2 * param1];
                          kt.field_g = -2147483648;
                          lm.field_V = -2147483648;
                          er.field_k = 2147483647;
                          vi.field_s = 2147483647;
                          wf.field_O = 0;
                          return;
                        } else {
                          kt.field_g = -2147483648;
                          lm.field_V = -2147483648;
                          er.field_k = 2147483647;
                          vi.field_s = 2147483647;
                          wf.field_O = 0;
                          return;
                        }
                      }
                    }
                  }
                } else {
                  break L4;
                }
              }
            }
            L11: {
              L12: {
                fo.field_j = new int[2 * param1];
                if (ln.field_B == null) {
                  break L12;
                } else {
                  if (ln.field_B.length < param1) {
                    break L12;
                  } else {
                    break L11;
                  }
                }
              }
              ln.field_B = new int[2 * param1];
              break L11;
            }
            L13: {
              L14: {
                if (null == w.field_a) {
                  break L14;
                } else {
                  if (param1 <= w.field_a.length) {
                    break L13;
                  } else {
                    break L14;
                  }
                }
              }
              w.field_a = new int[param1 * 2];
              break L13;
            }
            L15: {
              L16: {
                if (pf.field_d == null) {
                  break L16;
                } else {
                  if (param2 + param1 <= pf.field_d.length) {
                    break L15;
                  } else {
                    break L16;
                  }
                }
              }
              pf.field_d = new int[(param2 + param1) * 2];
              break L15;
            }
            L17: {
              if (null == ug.field_f) {
                break L17;
              } else {
                if (ug.field_f.length >= param1) {
                  kt.field_g = -2147483648;
                  lm.field_V = -2147483648;
                  er.field_k = 2147483647;
                  vi.field_s = 2147483647;
                  wf.field_O = 0;
                  return;
                } else {
                  break L17;
                }
              }
            }
            ug.field_f = new boolean[2 * param1];
            kt.field_g = -2147483648;
            lm.field_V = -2147483648;
            er.field_k = 2147483647;
            vi.field_s = 2147483647;
            wf.field_O = 0;
            return;
          } else {
            L18: {
              L19: {
                if (bl.field_m == null) {
                  break L19;
                } else {
                  if (bl.field_m.length < param1) {
                    break L19;
                  } else {
                    break L18;
                  }
                }
              }
              bl.field_m = new int[2 * param1];
              break L18;
            }
            L20: {
              L21: {
                if (qp.field_G == null) {
                  break L21;
                } else {
                  if (param1 <= qp.field_G.length) {
                    break L20;
                  } else {
                    break L21;
                  }
                }
              }
              qp.field_G = new int[param1 * 2];
              break L20;
            }
            L22: {
              if (null == fo.field_j) {
                break L22;
              } else {
                if (param1 <= fo.field_j.length) {
                  L23: {
                    L24: {
                      if (ln.field_B == null) {
                        break L24;
                      } else {
                        if (ln.field_B.length < param1) {
                          break L24;
                        } else {
                          break L23;
                        }
                      }
                    }
                    ln.field_B = new int[2 * param1];
                    break L23;
                  }
                  if (null == w.field_a) {
                    L25: {
                      L26: {
                        w.field_a = new int[param1 * 2];
                        if (pf.field_d == null) {
                          break L26;
                        } else {
                          if (param2 + param1 <= pf.field_d.length) {
                            break L25;
                          } else {
                            break L26;
                          }
                        }
                      }
                      pf.field_d = new int[(param2 + param1) * 2];
                      break L25;
                    }
                    L27: {
                      if (null == ug.field_f) {
                        break L27;
                      } else {
                        if (ug.field_f.length >= param1) {
                          kt.field_g = -2147483648;
                          lm.field_V = -2147483648;
                          er.field_k = 2147483647;
                          vi.field_s = 2147483647;
                          wf.field_O = 0;
                          return;
                        } else {
                          break L27;
                        }
                      }
                    }
                    ug.field_f = new boolean[2 * param1];
                    kt.field_g = -2147483648;
                    lm.field_V = -2147483648;
                    er.field_k = 2147483647;
                    vi.field_s = 2147483647;
                    wf.field_O = 0;
                    return;
                  } else {
                    if (param1 <= w.field_a.length) {
                      if (pf.field_d == null) {
                        L28: {
                          pf.field_d = new int[(param2 + param1) * 2];
                          if (null == ug.field_f) {
                            break L28;
                          } else {
                            if (ug.field_f.length >= param1) {
                              kt.field_g = -2147483648;
                              lm.field_V = -2147483648;
                              er.field_k = 2147483647;
                              vi.field_s = 2147483647;
                              wf.field_O = 0;
                              return;
                            } else {
                              break L28;
                            }
                          }
                        }
                        ug.field_f = new boolean[2 * param1];
                        kt.field_g = -2147483648;
                        lm.field_V = -2147483648;
                        er.field_k = 2147483647;
                        vi.field_s = 2147483647;
                        wf.field_O = 0;
                        return;
                      } else {
                        if (param2 + param1 <= pf.field_d.length) {
                          if (null == ug.field_f) {
                            ug.field_f = new boolean[2 * param1];
                            kt.field_g = -2147483648;
                            lm.field_V = -2147483648;
                            er.field_k = 2147483647;
                            vi.field_s = 2147483647;
                            wf.field_O = 0;
                            return;
                          } else {
                            if (ug.field_f.length < param1) {
                              ug.field_f = new boolean[2 * param1];
                              kt.field_g = -2147483648;
                              lm.field_V = -2147483648;
                              er.field_k = 2147483647;
                              vi.field_s = 2147483647;
                              wf.field_O = 0;
                              return;
                            } else {
                              kt.field_g = -2147483648;
                              lm.field_V = -2147483648;
                              er.field_k = 2147483647;
                              vi.field_s = 2147483647;
                              wf.field_O = 0;
                              return;
                            }
                          }
                        } else {
                          L29: {
                            pf.field_d = new int[(param2 + param1) * 2];
                            if (null == ug.field_f) {
                              break L29;
                            } else {
                              if (ug.field_f.length >= param1) {
                                kt.field_g = -2147483648;
                                lm.field_V = -2147483648;
                                er.field_k = 2147483647;
                                vi.field_s = 2147483647;
                                wf.field_O = 0;
                                return;
                              } else {
                                break L29;
                              }
                            }
                          }
                          ug.field_f = new boolean[2 * param1];
                          kt.field_g = -2147483648;
                          lm.field_V = -2147483648;
                          er.field_k = 2147483647;
                          vi.field_s = 2147483647;
                          wf.field_O = 0;
                          return;
                        }
                      }
                    } else {
                      L30: {
                        L31: {
                          w.field_a = new int[param1 * 2];
                          if (pf.field_d == null) {
                            break L31;
                          } else {
                            if (param2 + param1 <= pf.field_d.length) {
                              break L30;
                            } else {
                              break L31;
                            }
                          }
                        }
                        pf.field_d = new int[(param2 + param1) * 2];
                        break L30;
                      }
                      L32: {
                        if (null == ug.field_f) {
                          break L32;
                        } else {
                          if (ug.field_f.length >= param1) {
                            kt.field_g = -2147483648;
                            lm.field_V = -2147483648;
                            er.field_k = 2147483647;
                            vi.field_s = 2147483647;
                            wf.field_O = 0;
                            return;
                          } else {
                            break L32;
                          }
                        }
                      }
                      ug.field_f = new boolean[2 * param1];
                      kt.field_g = -2147483648;
                      lm.field_V = -2147483648;
                      er.field_k = 2147483647;
                      vi.field_s = 2147483647;
                      wf.field_O = 0;
                      return;
                    }
                  }
                } else {
                  break L22;
                }
              }
            }
            L33: {
              L34: {
                fo.field_j = new int[2 * param1];
                if (ln.field_B == null) {
                  break L34;
                } else {
                  if (ln.field_B.length < param1) {
                    break L34;
                  } else {
                    break L33;
                  }
                }
              }
              ln.field_B = new int[2 * param1];
              break L33;
            }
            L35: {
              L36: {
                if (null == w.field_a) {
                  break L36;
                } else {
                  if (param1 <= w.field_a.length) {
                    break L35;
                  } else {
                    break L36;
                  }
                }
              }
              w.field_a = new int[param1 * 2];
              break L35;
            }
            L37: {
              L38: {
                if (pf.field_d == null) {
                  break L38;
                } else {
                  if (param2 + param1 <= pf.field_d.length) {
                    break L37;
                  } else {
                    break L38;
                  }
                }
              }
              pf.field_d = new int[(param2 + param1) * 2];
              break L37;
            }
            L39: {
              if (null == ug.field_f) {
                break L39;
              } else {
                if (ug.field_f.length >= param1) {
                  kt.field_g = -2147483648;
                  lm.field_V = -2147483648;
                  er.field_k = 2147483647;
                  vi.field_s = 2147483647;
                  wf.field_O = 0;
                  return;
                } else {
                  break L39;
                }
              }
            }
            ug.field_f = new boolean[2 * param1];
            kt.field_g = -2147483648;
            lm.field_V = -2147483648;
            er.field_k = 2147483647;
            vi.field_s = 2147483647;
            wf.field_O = 0;
            return;
          }
        } else {
          L40: {
            L41: {
              oo.field_e = new int[param1 * 2];
              if (bl.field_m == null) {
                break L41;
              } else {
                if (bl.field_m.length < param1) {
                  break L41;
                } else {
                  break L40;
                }
              }
            }
            bl.field_m = new int[2 * param1];
            break L40;
          }
          L42: {
            L43: {
              if (qp.field_G == null) {
                break L43;
              } else {
                if (param1 <= qp.field_G.length) {
                  break L42;
                } else {
                  break L43;
                }
              }
            }
            qp.field_G = new int[param1 * 2];
            break L42;
          }
          L44: {
            if (null == fo.field_j) {
              break L44;
            } else {
              if (param1 <= fo.field_j.length) {
                L45: {
                  L46: {
                    if (ln.field_B == null) {
                      break L46;
                    } else {
                      if (ln.field_B.length < param1) {
                        break L46;
                      } else {
                        break L45;
                      }
                    }
                  }
                  ln.field_B = new int[2 * param1];
                  break L45;
                }
                if (null == w.field_a) {
                  L47: {
                    L48: {
                      w.field_a = new int[param1 * 2];
                      if (pf.field_d == null) {
                        break L48;
                      } else {
                        if (param2 + param1 <= pf.field_d.length) {
                          break L47;
                        } else {
                          break L48;
                        }
                      }
                    }
                    pf.field_d = new int[(param2 + param1) * 2];
                    break L47;
                  }
                  L49: {
                    if (null == ug.field_f) {
                      break L49;
                    } else {
                      if (ug.field_f.length >= param1) {
                        kt.field_g = -2147483648;
                        lm.field_V = -2147483648;
                        er.field_k = 2147483647;
                        vi.field_s = 2147483647;
                        wf.field_O = 0;
                        return;
                      } else {
                        break L49;
                      }
                    }
                  }
                  ug.field_f = new boolean[2 * param1];
                  kt.field_g = -2147483648;
                  lm.field_V = -2147483648;
                  er.field_k = 2147483647;
                  vi.field_s = 2147483647;
                  wf.field_O = 0;
                  return;
                } else {
                  if (param1 <= w.field_a.length) {
                    if (pf.field_d == null) {
                      L50: {
                        pf.field_d = new int[(param2 + param1) * 2];
                        if (null == ug.field_f) {
                          break L50;
                        } else {
                          if (ug.field_f.length >= param1) {
                            kt.field_g = -2147483648;
                            lm.field_V = -2147483648;
                            er.field_k = 2147483647;
                            vi.field_s = 2147483647;
                            wf.field_O = 0;
                            return;
                          } else {
                            break L50;
                          }
                        }
                      }
                      ug.field_f = new boolean[2 * param1];
                      kt.field_g = -2147483648;
                      lm.field_V = -2147483648;
                      er.field_k = 2147483647;
                      vi.field_s = 2147483647;
                      wf.field_O = 0;
                      return;
                    } else {
                      if (param2 + param1 <= pf.field_d.length) {
                        if (null == ug.field_f) {
                          ug.field_f = new boolean[2 * param1];
                          kt.field_g = -2147483648;
                          lm.field_V = -2147483648;
                          er.field_k = 2147483647;
                          vi.field_s = 2147483647;
                          wf.field_O = 0;
                          return;
                        } else {
                          if (ug.field_f.length < param1) {
                            ug.field_f = new boolean[2 * param1];
                            kt.field_g = -2147483648;
                            lm.field_V = -2147483648;
                            er.field_k = 2147483647;
                            vi.field_s = 2147483647;
                            wf.field_O = 0;
                            return;
                          } else {
                            kt.field_g = -2147483648;
                            lm.field_V = -2147483648;
                            er.field_k = 2147483647;
                            vi.field_s = 2147483647;
                            wf.field_O = 0;
                            return;
                          }
                        }
                      } else {
                        L51: {
                          pf.field_d = new int[(param2 + param1) * 2];
                          if (null == ug.field_f) {
                            break L51;
                          } else {
                            if (ug.field_f.length >= param1) {
                              kt.field_g = -2147483648;
                              lm.field_V = -2147483648;
                              er.field_k = 2147483647;
                              vi.field_s = 2147483647;
                              wf.field_O = 0;
                              return;
                            } else {
                              break L51;
                            }
                          }
                        }
                        ug.field_f = new boolean[2 * param1];
                        kt.field_g = -2147483648;
                        lm.field_V = -2147483648;
                        er.field_k = 2147483647;
                        vi.field_s = 2147483647;
                        wf.field_O = 0;
                        return;
                      }
                    }
                  } else {
                    L52: {
                      L53: {
                        w.field_a = new int[param1 * 2];
                        if (pf.field_d == null) {
                          break L53;
                        } else {
                          if (param2 + param1 <= pf.field_d.length) {
                            break L52;
                          } else {
                            break L53;
                          }
                        }
                      }
                      pf.field_d = new int[(param2 + param1) * 2];
                      break L52;
                    }
                    L54: {
                      if (null == ug.field_f) {
                        break L54;
                      } else {
                        if (ug.field_f.length >= param1) {
                          kt.field_g = -2147483648;
                          lm.field_V = -2147483648;
                          er.field_k = 2147483647;
                          vi.field_s = 2147483647;
                          wf.field_O = 0;
                          return;
                        } else {
                          break L54;
                        }
                      }
                    }
                    ug.field_f = new boolean[2 * param1];
                    kt.field_g = -2147483648;
                    lm.field_V = -2147483648;
                    er.field_k = 2147483647;
                    vi.field_s = 2147483647;
                    wf.field_O = 0;
                    return;
                  }
                }
              } else {
                break L44;
              }
            }
          }
          L55: {
            L56: {
              fo.field_j = new int[2 * param1];
              if (ln.field_B == null) {
                break L56;
              } else {
                if (ln.field_B.length < param1) {
                  break L56;
                } else {
                  break L55;
                }
              }
            }
            ln.field_B = new int[2 * param1];
            break L55;
          }
          L57: {
            L58: {
              if (null == w.field_a) {
                break L58;
              } else {
                if (param1 <= w.field_a.length) {
                  break L57;
                } else {
                  break L58;
                }
              }
            }
            w.field_a = new int[param1 * 2];
            break L57;
          }
          L59: {
            L60: {
              if (pf.field_d == null) {
                break L60;
              } else {
                if (param2 + param1 <= pf.field_d.length) {
                  break L59;
                } else {
                  break L60;
                }
              }
            }
            pf.field_d = new int[(param2 + param1) * 2];
            break L59;
          }
          L61: {
            if (null == ug.field_f) {
              break L61;
            } else {
              if (ug.field_f.length >= param1) {
                kt.field_g = -2147483648;
                lm.field_V = -2147483648;
                er.field_k = 2147483647;
                vi.field_s = 2147483647;
                wf.field_O = 0;
                return;
              } else {
                break L61;
              }
            }
          }
          ug.field_f = new boolean[2 * param1];
          kt.field_g = -2147483648;
          lm.field_V = -2147483648;
          er.field_k = 2147483647;
          vi.field_s = 2147483647;
          wf.field_O = 0;
          return;
        }
    }

    final boolean a(byte param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var7_ref_java_math_BigInteger = null;
        int var7 = 0;
        int var8 = 0;
        iw var10 = null;
        byte[] var11 = null;
        java.math.BigInteger var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        var8 = Kickabout.field_G;
        if (((n) this).field_i == null) {
          L0: {
            if (((n) this).field_a == null) {
              if (!((n) this).field_g.a(25533)) {
                ((n) this).field_a = ((n) this).field_g.a(255, 255, (byte) 0, (byte) 89, true);
                break L0;
              } else {
                return false;
              }
            } else {
              break L0;
            }
          }
          if (!((n) this).field_a.field_p) {
            var10 = new iw(((n) this).field_a.b(param0 ^ -12847));
            var10.field_n = 5;
            var3 = var10.h((byte) -116);
            var10.field_n = var10.field_n + 72 * var3;
            var18 = new byte[var10.field_f.length + -var10.field_n];
            var14 = var18;
            var13 = var14;
            var11 = var13;
            var4 = var11;
            if (param0 == -45) {
              L1: {
                var10.a(var4, 0, (byte) -6, var18.length);
                if (((n) this).field_b == null) {
                  var5 = var4;
                  break L1;
                } else {
                  if (((n) this).field_l != null) {
                    var12 = new java.math.BigInteger(var18);
                    var7_ref_java_math_BigInteger = var12.modPow(((n) this).field_b, ((n) this).field_l);
                    var5 = var7_ref_java_math_BigInteger.toByteArray();
                    break L1;
                  } else {
                    var19 = var4;
                    var15 = var19;
                    var5 = var15;
                    if (var19.length == 65) {
                      var20 = jj.a(-5 + var10.field_n + -var18.length, var10.field_f, (byte) 122, 5);
                      var7 = 0;
                      L2: while (true) {
                        if (var7 < 64) {
                          if (var5[var7 - -1] == var20[var7]) {
                            var7++;
                            continue L2;
                          } else {
                            throw new RuntimeException();
                          }
                        } else {
                          ((n) this).field_k = new wm[var3];
                          ((n) this).field_i = var10;
                          return true;
                        }
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                }
              }
              if (var5.length == 65) {
                var21 = jj.a(-5 + var10.field_n + -var18.length, var10.field_f, (byte) 122, 5);
                var7 = 0;
                L3: while (true) {
                  if (var7 < 64) {
                    if (var5[var7 - -1] == var21[var7]) {
                      var7++;
                      continue L3;
                    } else {
                      throw new RuntimeException();
                    }
                  } else {
                    ((n) this).field_k = new wm[var3];
                    ((n) this).field_i = var10;
                    return true;
                  }
                }
              } else {
                throw new RuntimeException();
              }
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    final static boolean a() {
        if (null == mr.field_Z) {
            return false;
        }
        if (null == mr.field_Z.h((byte) 18)) {
            return false;
        }
        return true;
    }

    private n(bi param0, eb param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        RuntimeException runtimeException = null;
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
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
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
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              ((n) this).field_h = param1;
              ((n) this).field_l = param3;
              ((n) this).field_b = param2;
              ((n) this).field_g = param0;
              if (((n) this).field_g.a(25533)) {
                break L1;
              } else {
                ((n) this).field_a = ((n) this).field_g.a(255, 255, (byte) 0, (byte) 89, true);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("n.<init>(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = 0;
        field_f = new String[100];
        field_j = "Options";
        field_d = -1;
    }
}
