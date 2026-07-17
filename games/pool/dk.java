/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk {
    int field_e;
    static String field_a;
    static byte[] field_j;
    static String field_g;
    static String field_h;
    int field_i;
    short field_b;
    short field_l;
    int field_d;
    static int field_f;
    short field_k;
    boolean field_c;

    private final void a(int[] param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var6 = param1 - param0[0];
          var7 = param2 - param0[1];
          var8 = param3 - 64 - param0[2];
          var9 = param0[9] * var6 + param0[10] * var7 + param0[11] * var8 >> 16;
          if (var9 <= 0) {
            break L0;
          } else {
            var10 = (qh.field_b + fb.field_q << 4) + (param0[3] * var6 + param0[4] * var7 + param0[5] * var8 >> 3) / var9;
            var11 = (qh.field_c + fb.field_d << 4) + (param0[6] * var6 + param0[7] * var7 + param0[8] * var8 >> 3) / var9;
            param4 = param4 / var9;
            if (param4 <= -23170) {
              break L0;
            } else {
              if (param4 >= 23170) {
                break L0;
              } else {
                qh.a(var10, var11, param4, 4, bc.field_c);
                break L0;
              }
            }
          }
        }
    }

    final void a(int param0, int[] param1) {
        RuntimeException runtimeException = null;
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
            this.a(param1, ((dk) this).field_e, ((dk) this).field_i, ((dk) this).field_d, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("dk.C(").append(param0).append(44);
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
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
          throw wm.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final static void a(int param0, byte param1, int param2, pq param3, int param4) {
        long var5_long = 0L;
        RuntimeException var5 = null;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        long var12 = 0L;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              param3.a(param2, 6);
              var5_long = param3.e(-14770);
              var7 = param0 - param3.field_g;
              var8 = -param3.field_k + param4;
              int discarded$3 = 0;
              int discarded$4 = 0;
              var9 = bm.a(-107, od.a((long)var7, (long)var7) - -od.a((long)var8, (long)var8));
              if (var9 > 2147483647L) {
                break L1;
              } else {
                if (var9 >= -2147483648L) {
                  L2: {
                    var7 = lh.a((int)var9, (byte) -96, (long)var7);
                    var8 = lh.a((int)var9, (byte) -85, (long)var8);
                    var11 = aj.a(var7, false, param3.field_I) - -aj.a(var8, false, param3.field_t);
                    param3.field_I = param3.field_I - 2 * aj.a(var11, false, var7);
                    param3.field_t = param3.field_t - aj.a(var11, false, var8) * 2;
                    param3.field_n = param3.field_n * kp.field_m >> 8;
                    param3.field_v = 1;
                    param3.field_b = param3.field_b * kp.field_m >> 8;
                    param3.field_K = kp.field_m * param3.field_K >> 8;
                    var12 = param3.e(-14770);
                    if (~td.field_b <= ~nn.field_e.length) {
                      break L2;
                    } else {
                      nn.field_e[td.field_b][0] = param0;
                      nn.field_e[td.field_b][1] = param4;
                      nn.field_e[td.field_b][2] = -524288;
                      break L2;
                    }
                  }
                  L3: {
                    if (~td.field_b > ~cf.field_g.length) {
                      int fieldTemp$5 = td.field_b;
                      td.field_b = td.field_b + 1;
                      cf.field_g[fieldTemp$5] = (int)(var5_long - var12);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalStateException("d out of bounds.");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var5;
            stackOut_17_1 = new StringBuilder().append("dk.F(").append(param0).append(44).append(-20).append(44).append(param2).append(44);
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L4;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param4 + 41);
        }
    }

    final void a(int param0, byte param1, int param2) {
        try {
            ((dk) this).field_k = (short)(param2 + -((dk) this).field_i);
            ((dk) this).field_b = (short)(param0 + -((dk) this).field_e);
            ((dk) this).field_i = param2;
            ((dk) this).field_e = param0;
            if (param1 != 78) {
                String discarded$0 = dk.a((byte) -28, (String) null, (di) null, (String) null, (String) null);
            }
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "dk.G(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static String a(int param0) {
        Object var1 = null;
        Object var2 = null;
        String var3 = null;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String stackIn_59_0 = null;
        Object stackIn_97_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_58_0 = null;
        String stackOut_56_0 = null;
        Object stackOut_96_0 = null;
        var10 = Pool.field_O;
        try {
          L0: {
            L1: {
              var1 = null;
              var2 = null;
              if (0 != hn.field_b) {
                break L1;
              } else {
                if (tp.field_e != null) {
                  var2 = (Object) (Object) cl.field_l;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (hn.field_b != 2) {
                break L2;
              } else {
                if (!hp.a(false)) {
                  L3: {
                    L4: {
                      int discarded$3 = -1;
                      if (lq.a(di.field_a)) {
                        break L4;
                      } else {
                        var2 = (Object) (Object) nr.a(new String[1], -1, tp.field_c);
                        if (var10 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var2 = (Object) (Object) nr.a(new String[1], -1, bm.field_d);
                    break L3;
                  }
                  if (!fm.field_H) {
                    break L2;
                  } else {
                    int discarded$4 = 1;
                    jh.a(0, (String) var2, (String) null, 2, (String) null);
                    int discarded$5 = -1;
                    th.b();
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
            }
            L5: {
              if (null != var2) {
                break L5;
              } else {
                if (gd.field_b) {
                  break L5;
                } else {
                  if (uq.field_D != null) {
                    break L5;
                  } else {
                    var2 = (Object) (Object) fj.field_i;
                    break L5;
                  }
                }
              }
            }
            L6: {
              if (var2 != null) {
                dr.a((String) null, 11468, mc.field_g, 0, (String) var2);
                break L6;
              } else {
                L7: {
                  var3 = di.field_j;
                  var3 = bm.a(524288, var3);
                  var4 = "";
                  var5 = "|";
                  var6 = hn.field_b;
                  var7 = 0;
                  if (var6 == 2) {
                    var4 = nr.a(new String[1], -1, jl.field_a);
                    var8 = nr.a(new String[1], -1, vh.field_S);
                    var7 = pa.field_J.field_gb - (-fj.field_j.field_gb + (485 - m.field_c.b(var8) + m.field_c.b(var4)));
                    if (var7 >= 0) {
                      break L7;
                    } else {
                      var7 = 0;
                      break L7;
                    }
                  } else {
                    L8: {
                      if (var6 == 0) {
                        L9: {
                          if (null != em.field_L) {
                            break L9;
                          } else {
                            if (ej.field_l) {
                              var4 = "[" + sn.field_l + "] ";
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                        }
                        if (null != em.field_L) {
                          L10: {
                            L11: {
                              if (!sa.field_c) {
                                break L11;
                              } else {
                                if (kn.field_g == null) {
                                  break L11;
                                } else {
                                  var4 = "[" + kn.field_g + "] ";
                                  if (var10 == 0) {
                                    break L10;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                            }
                            var4 = "[" + nr.a(new String[1], -1, th.field_c) + "] ";
                            break L10;
                          }
                          var6 = 1;
                          break L8;
                        } else {
                          break L8;
                        }
                      } else {
                        break L8;
                      }
                    }
                    L12: {
                      if (ia.b(-1)) {
                        stackOut_58_0 = ": ";
                        stackIn_59_0 = stackOut_58_0;
                        break L12;
                      } else {
                        stackOut_56_0 = "<img=3>: ";
                        stackIn_59_0 = stackOut_56_0;
                        break L12;
                      }
                    }
                    L13: {
                      L14: {
                        var8 = stackIn_59_0;
                        var4 = var4 + var3 + var8;
                        if (!ea.field_z) {
                          break L14;
                        } else {
                          var5 = "";
                          var4 = "<col=999999>" + var4 + fg.field_e + "</col>";
                          if (var10 == 0) {
                            break L13;
                          } else {
                            break L14;
                          }
                        }
                      }
                      if (!hr.field_y) {
                        break L13;
                      } else {
                        var5 = "";
                        var4 = "<col=999999>" + var4 + je.field_c + "</col>";
                        break L13;
                      }
                    }
                    L15: {
                      var9 = m.field_c.b(var4);
                      if (ia.b(-1)) {
                        break L15;
                      } else {
                        L16: {
                          if (!pa.field_J.field_W) {
                            break L16;
                          } else {
                            if (-pa.field_J.field_sb + wn.field_i >= var9) {
                              break L16;
                            } else {
                              if (ea.field_z) {
                                var1 = (Object) (Object) "Broken!";
                                break L16;
                              } else {
                                var1 = (Object) (Object) je.field_c;
                                break L16;
                              }
                            }
                          }
                        }
                        if (pa.field_J.field_R == 0) {
                          break L15;
                        } else {
                          if (var9 <= pa.field_J.field_mb) {
                            break L15;
                          } else {
                            if (ea.field_z) {
                              break L15;
                            } else {
                              r.c((byte) 68);
                              break L15;
                            }
                          }
                        }
                      }
                    }
                    break L7;
                  }
                }
                L17: {
                  dr.a(var5, 11468, pq.field_F[var6], var7, var4 + lr.a(td.field_c.toString()));
                  if (rg.field_p) {
                    break L17;
                  } else {
                    fj.field_j.field_W = false;
                    break L17;
                  }
                }
                L18: {
                  if (!fj.field_j.field_W) {
                    break L18;
                  } else {
                    var1 = (Object) (Object) nr.a(new String[2], -1, wb.field_b);
                    break L18;
                  }
                }
                break L6;
              }
            }
            stackOut_96_0 = var1;
            stackIn_97_0 = stackOut_96_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (Object) (Object) decompiledCaughtException;
          throw wm.a((Throwable) var1, "dk.E(" + 1 + 41);
        }
        return (String) (Object) stackIn_97_0;
    }

    private final void a(int param0, int param1, byte param2) {
        try {
            ((dk) this).field_i = param0;
            ((dk) this).field_e = param1;
            if (param2 <= 21) {
                this.a(-71, 118, (byte) -96);
            }
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "dk.A(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
    }

    public static void a() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_g = null;
            field_j = null;
            field_a = null;
            field_h = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1, "dk.B(" + 113 + 41);
        }
    }

    final static String a(byte param0, String param1, di param2, String param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
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
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_5_0 = null;
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
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            if (!param2.d(58)) {
              stackOut_3_0 = (String) param4;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              var5_int = -40 / ((param0 - 48) / 49);
              stackOut_5_0 = param3 + " - " + param2.a(100, param1) + "%";
              stackIn_6_0 = stackOut_5_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("dk.D(").append(param0).append(44);
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
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L1;
            }
          }
          L2: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
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
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L2;
            }
          }
          L3: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L3;
            }
          }
          L4: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L4;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L4;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
        return stackIn_6_0;
    }

    final static void a(vh param0) {
        RuntimeException var2 = null;
        dd var2_ref = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              var2_ref = param0.field_hb;
              var2_ref.field_B = -var2_ref.field_A + param0.field_Db >> 1;
              var2_ref.field_y = var2_ref.field_B + var2_ref.field_A;
              var2_ref = param0.field_yb;
              if (null != var2_ref) {
                var2_ref.field_B = -var2_ref.field_A + param0.field_Db >> 1;
                var2_ref.field_y = var2_ref.field_B + var2_ref.field_A;
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("dk.I(");
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + 93 + 41);
        }
    }

    dk(int param0, int param1) {
        ((dk) this).field_c = false;
        try {
            this.a(param1, param0, (byte) 34);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "dk.<init>(" + param0 + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "This game option has not yet been unlocked for use.";
        field_f = 0;
        field_h = "This game has been updated! Please reload this page.";
        field_g = "Return to lobby";
    }
}
