/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class oe extends dd {
    static int[] field_P;
    private int field_R;
    static String field_O;
    private int field_M;
    private int field_U;
    private int field_N;
    private int field_L;
    static gk field_T;
    private int field_Q;
    static int field_V;
    static boolean field_S;

    public static void j(int param0) {
        field_T = null;
        field_P = null;
        field_O = null;
    }

    boolean h(int param0) {
        ((oe) this).b(true);
        return super.h(229);
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (!(param3 > 0)) {
            ((oe) this).c(param0, param2 + 5373, param1);
            return;
        }
        ((oe) this).field_R = ((oe) this).field_r;
        ((oe) this).field_Q = 0;
        if (param2 != -5269) {
            ((oe) this).field_R = 59;
        }
        ((oe) this).field_M = param0;
        ((oe) this).field_L = ((oe) this).field_h;
        ((oe) this).field_N = param1;
        ((oe) this).field_U = param3;
    }

    final static String a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 == 44) {
              stackOut_3_0 = ei.a(false, false, param1);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (String) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("oe.V(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
    }

    void b(boolean param0) {
        if (((oe) this).field_U <= 0) {
            return;
        }
        if (!param0) {
            return;
        }
        ((oe) this).c(((oe) this).field_M, 105, ((oe) this).field_N);
        ((oe) this).field_U = 0;
        ((oe) this).k(-107);
    }

    final static void l(int param0) {
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Geoblox.field_C;
        try {
          L0: {
            var5 = ch.field_d;
            var1 = var5;
            var2 = 0;
            var3 = var5.length;
            L1: while (true) {
              if (var2 >= var3) {
                break L0;
              } else {
                int incrementValue$40 = var2;
                var2++;
                var5[incrementValue$40] = 0;
                int incrementValue$41 = var2;
                var2++;
                var5[incrementValue$41] = 0;
                int incrementValue$42 = var2;
                var2++;
                var5[incrementValue$42] = 0;
                int incrementValue$43 = var2;
                var2++;
                var5[incrementValue$43] = 0;
                int incrementValue$44 = var2;
                var2++;
                var5[incrementValue$44] = 0;
                int incrementValue$45 = var2;
                var2++;
                var5[incrementValue$45] = 0;
                int incrementValue$46 = var2;
                var2++;
                var5[incrementValue$46] = 0;
                int incrementValue$47 = var2;
                var2++;
                var5[incrementValue$47] = 0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1_ref, "oe.N(" + 0 + 41);
        }
    }

    oe(ng param0, int param1, int param2) {
        super(param0, param1, param2);
        ((oe) this).field_U = 0;
        ((oe) this).field_Q = 0;
    }

    void k(int param0) {
        if (param0 > -20) {
            ((oe) this).field_N = 122;
        }
    }

    final static int a(int param0, byte[] param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object var6 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
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
            L1: {
              if (param2 <= -27) {
                break L1;
              } else {
                var6 = null;
                String discarded$2 = oe.a((CharSequence) null, -115);
                break L1;
              }
            }
            var4_int = -1;
            var5 = param3;
            L2: while (true) {
              if (var5 >= param0) {
                var4_int = ~var4_int;
                stackOut_5_0 = var4_int;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                var4_int = sb.field_b[(var4_int ^ param1[var5]) & 255] ^ var4_int >>> 8;
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("oe.P(").append(param0).append(44);
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
          throw t.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_6_0;
    }

    boolean f(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var5 = 0;
        int var4 = 0;
        if (~((oe) this).field_U < param0) {
            var2 = ((oe) this).field_N;
            var3 = ((oe) this).field_M;
            int fieldTemp$0 = ((oe) this).field_Q + 1;
            ((oe) this).field_Q = ((oe) this).field_Q + 1;
            if (fieldTemp$0 < ((oe) this).field_U) {
                var4 = (-((oe) this).field_Q + 2 * ((oe) this).field_U) * ((oe) this).field_Q;
                var5 = ((oe) this).field_U * ((oe) this).field_U;
                var2 = ((oe) this).field_R + var4 * (((oe) this).field_N + -((oe) this).field_R) / var5;
                var3 = var4 * (((oe) this).field_M + -((oe) this).field_L) / var5 + ((oe) this).field_L;
            } else {
                ((oe) this).field_U = 0;
                ((oe) this).k(-31);
            }
            ((oe) this).c(var3, 113, var2);
        }
        return super.f(param0);
    }

    final static void a(int param0, byte param1, int param2) {
        k.field_g = param2;
        if (param1 > -20) {
            return;
        }
        gb.field_e = param0;
    }

    final static String a(CharSequence param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_26_0 = null;
        String stackIn_28_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_27_0 = null;
        Object stackOut_25_0 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            if (param0 != null) {
              var2_int = 0;
              var3 = param0.length();
              L1: while (true) {
                L2: {
                  if (var3 <= var2_int) {
                    break L2;
                  } else {
                    if (!gg.a((byte) 125, param0.charAt(var2_int))) {
                      break L2;
                    } else {
                      var2_int++;
                      continue L1;
                    }
                  }
                }
                L3: while (true) {
                  L4: {
                    if (var2_int >= var3) {
                      break L4;
                    } else {
                      if (!gg.a((byte) -47, param0.charAt(var3 - 1))) {
                        break L4;
                      } else {
                        var3--;
                        continue L3;
                      }
                    }
                  }
                  var4 = -var2_int + var3;
                  if (1 <= var4) {
                    if (12 >= var4) {
                      L5: {
                        if (param1 == 12) {
                          break L5;
                        } else {
                          field_O = null;
                          break L5;
                        }
                      }
                      var5 = new StringBuilder(var4);
                      var6 = var2_int;
                      L6: while (true) {
                        if (var6 >= var3) {
                          if (var5.length() != 0) {
                            stackOut_27_0 = var5.toString();
                            stackIn_28_0 = stackOut_27_0;
                            break L0;
                          } else {
                            stackOut_25_0 = null;
                            stackIn_26_0 = stackOut_25_0;
                            return (String) (Object) stackIn_26_0;
                          }
                        } else {
                          L7: {
                            var7 = param0.charAt(var6);
                            if (!fb.a((char) var7, -47)) {
                              break L7;
                            } else {
                              var8 = hc.a((char) var7, param1 + -239);
                              if (var8 == 0) {
                                break L7;
                              } else {
                                StringBuilder discarded$1 = var5.append(var8);
                                break L7;
                              }
                            }
                          }
                          var6++;
                          continue L6;
                        }
                      }
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var2;
            stackOut_29_1 = new StringBuilder().append("oe.L(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L8;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L8;
            }
          }
          throw t.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 44 + param1 + 41);
        }
        return stackIn_28_0;
    }

    final static void a(boolean param0, boolean param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        var10 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              var3_int = 160;
              var4 = 190;
              if (!param1) {
                var4 -= 10;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0) {
                stackOut_6_0 = ug.field_c;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = vl.field_p;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            var5 = stackIn_7_0;
            var6 = 0;
            if (param2 == 160) {
              L3: {
                L4: {
                  var7 = 0;
                  var8 = 0;
                  if (param0) {
                    var9 = 15;
                    L5: while (true) {
                      if (var9 < 0) {
                        L6: {
                          if (var8 >= 8) {
                            var3_int = var3_int + (-160 + var7);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        var9 = 0;
                        L7: while (true) {
                          if (~pg.field_a.length >= ~var9) {
                            break L4;
                          } else {
                            L8: {
                              L9: {
                                if ((1 << var9 & var5) != 0) {
                                  break L9;
                                } else {
                                  if (!param0) {
                                    break L9;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              L10: {
                                if (da.a(0, 88)) {
                                  break L10;
                                } else {
                                  if (var9 != 16) {
                                    break L10;
                                  } else {
                                    if (!qi.d(109)) {
                                      break L8;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                              }
                              L11: {
                                if (mc.field_a < var3_int) {
                                  break L11;
                                } else {
                                  if (~mc.field_a < ~(var3_int - -32)) {
                                    break L11;
                                  } else {
                                    if (~var4 < ~he.field_d) {
                                      break L11;
                                    } else {
                                      if (he.field_d > var4 - -32) {
                                        break L11;
                                      } else {
                                        if (a.field_e == var9) {
                                          a.field_e = -1;
                                          break L3;
                                        } else {
                                          a.field_e = var9;
                                          break L3;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              int incrementValue$2 = var6;
                              var6++;
                              if (7 != incrementValue$2) {
                                var3_int += 40;
                                break L8;
                              } else {
                                L12: {
                                  var3_int = 160;
                                  var4 += 40;
                                  if (!param1) {
                                    var4 += 5;
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                                if (!param0) {
                                  break L8;
                                } else {
                                  if (var8 < 8) {
                                    var3_int = var3_int + var7;
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                            var9++;
                            continue L7;
                          }
                        }
                      } else {
                        L13: {
                          if ((var5 & 1 << var9) != 0) {
                            break L13;
                          } else {
                            var7 += 20;
                            var8++;
                            break L13;
                          }
                        }
                        var9--;
                        continue L5;
                      }
                    }
                  } else {
                    L14: {
                      if (var8 >= 8) {
                        var3_int = var3_int + (-160 + var7);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    var9 = 0;
                    L15: while (true) {
                      if (~pg.field_a.length >= ~var9) {
                        break L4;
                      } else {
                        L16: {
                          L17: {
                            if ((1 << var9 & var5) != 0) {
                              break L17;
                            } else {
                              if (!param0) {
                                break L17;
                              } else {
                                break L16;
                              }
                            }
                          }
                          L18: {
                            if (da.a(0, 88)) {
                              break L18;
                            } else {
                              if (var9 != 16) {
                                break L18;
                              } else {
                                if (!qi.d(109)) {
                                  break L16;
                                } else {
                                  break L18;
                                }
                              }
                            }
                          }
                          L19: {
                            if (mc.field_a < var3_int) {
                              break L19;
                            } else {
                              if (~mc.field_a < ~(var3_int - -32)) {
                                break L19;
                              } else {
                                if (~var4 < ~he.field_d) {
                                  break L19;
                                } else {
                                  if (he.field_d > var4 - -32) {
                                    break L19;
                                  } else {
                                    if (a.field_e == var9) {
                                      a.field_e = -1;
                                      break L3;
                                    } else {
                                      a.field_e = var9;
                                      break L3;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          int incrementValue$3 = var6;
                          var6++;
                          if (7 != incrementValue$3) {
                            var3_int += 40;
                            break L16;
                          } else {
                            L20: {
                              var3_int = 160;
                              var4 += 40;
                              if (!param1) {
                                var4 += 5;
                                break L20;
                              } else {
                                break L20;
                              }
                            }
                            if (!param0) {
                              break L16;
                            } else {
                              if (var8 < 8) {
                                var3_int = var3_int + var7;
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                          }
                        }
                        var9++;
                        continue L15;
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var3, "oe.R(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
    }

    void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var16 = Geoblox.field_C;
        vb.d(param0 - -6, param2 + 35, -12 + ((oe) this).field_r, -40 + ((oe) this).field_h, 2105376, 0);
        var5 = 211;
        var4 = 35;
        var6 = 194;
        var7 = 0;
        var8 = param2;
        L0: while (true) {
          if (var4 <= var7) {
            var4 = 22;
            var5 = 194;
            var6 = 169;
            var7 = 0;
            var8 = 35 + param2;
            L1: while (true) {
              if (var7 >= var4) {
                L2: {
                  jc.field_a.b(-90 + ((oe) this).field_r + param0, 10 + param2);
                  if (param1 == 20) {
                    break L2;
                  } else {
                    ((oe) this).field_M = -34;
                    break L2;
                  }
                }
                vl.a(id.field_c, -10 + ((oe) this).field_r, 35 + param2, 5 + param0, (byte) 107);
                vl.a(fh.field_e, ((oe) this).field_r, -22 + (((oe) this).field_h + param2), param0, (byte) 107);
                var4 = ((oe) this).field_h + -79;
                var5 = 169;
                var6 = 127;
                var7 = 0;
                var8 = param2 - -57;
                L3: while (true) {
                  if (var7 >= var4) {
                    return;
                  } else {
                    var9 = var7 * (var6 - var5) / var4 + var5;
                    var9 = var9 | (var9 << 16 | var9 << 8);
                    vb.c(param0, var8, 6, var9);
                    vb.c(-6 + (((oe) this).field_r + param0), var8, 6, var9);
                    var8++;
                    var7++;
                    continue L3;
                  }
                }
              } else {
                var9 = var5 + (-var5 + var6) * var7 / var4;
                var9 = var9 | (var9 << 8 | var9 << 16);
                vb.c(param0, var8, 6, var9);
                vb.c(((oe) this).field_r + param0 + -6, var8, 6, var9);
                var7++;
                var8++;
                continue L1;
              }
            }
          } else {
            if (var8 >= vb.field_i) {
              if (vb.field_d > var8) {
                L4: {
                  var9 = (-var5 + var6) * var7 / var4 + var5;
                  var10 = 0;
                  var11 = ((oe) this).field_r;
                  if (var7 > 20) {
                    break L4;
                  } else {
                    L5: while (true) {
                      if (var10 > 20) {
                        break L4;
                      } else {
                        var12 = (-var7 + 20) * (-var7 + 20) - -((-var10 + 20) * (20 - var10));
                        if (var12 >= -463) {
                          if (-421 > var12) {
                            break L4;
                          } else {
                            var13 = (-var12 + 462) * var9 / 42;
                            var13 = var13 | (var13 << 8 | var13 << 16);
                            vb.field_c[var8 * vb.field_f - -param0 - -var10] = var13;
                            var10++;
                            continue L5;
                          }
                        } else {
                          var10++;
                          continue L5;
                        }
                      }
                    }
                  }
                }
                L6: {
                  if (20 < var7) {
                    break L6;
                  } else {
                    var12 = var11;
                    var11 -= 21;
                    var13 = 0;
                    L7: while (true) {
                      L8: {
                        if (var13 > 20) {
                          break L8;
                        } else {
                          var14 = (-var7 + 20) * (-var7 + 20) - -(var13 * var13);
                          if (var14 <= 462) {
                            if (var14 < 420) {
                              var12 = var11 + 1;
                              var11++;
                              var13++;
                              continue L7;
                            } else {
                              var15 = var9 * (462 + -var14) / 42;
                              var15 = var15 | (var15 << 8 | var15 << 16);
                              vb.field_c[var11 + param0 + vb.field_f * var8] = var15;
                              var11++;
                              var13++;
                              continue L7;
                            }
                          } else {
                            break L8;
                          }
                        }
                      }
                      var11 = var12;
                      break L6;
                    }
                  }
                }
                var9 = var9 | (var9 << 16 | var9 << 8);
                vb.c(var10 - -param0, var8, var11 + -var10, var9);
                var8++;
                var7++;
                continue L0;
              } else {
                var8++;
                var7++;
                continue L0;
              }
            } else {
              var8++;
              var7++;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        field_O = "Connection restored.";
        field_T = new gk();
        field_V = 0;
        field_S = false;
    }
}
