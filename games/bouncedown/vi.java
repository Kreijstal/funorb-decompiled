/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi implements Runnable {
    private ml field_d;
    static int field_c;
    static String[] field_f;
    private Thread field_e;
    private boolean field_a;
    int field_b;

    public static void a(byte param0) {
        field_f = null;
    }

    final static int c(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        int stackIn_28_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_27_0 = 0;
        var8 = Bounce.field_N;
        try {
          L0: {
            var1_int = 0;
            var3 = 115 % ((param0 - 53) / 58);
            var2 = 0;
            L1: while (true) {
              if (!q.g((byte) -15)) {
                L2: {
                  cf.field_f.a(qe.a(uc.field_C, (byte) -94, ll.field_y), qe.a(og.field_a, (byte) -125, rk.field_a), -798);
                  if (cf.field_f.a(-1)) {
                    var1_int = 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var4 = 0;
                    if (var1_int == 0) {
                      break L4;
                    } else {
                      if (0 <= cf.field_f.field_b) {
                        L5: {
                          var4 = ii.field_n[cf.field_f.field_b];
                          if (var4 == 2) {
                            break L5;
                          } else {
                            if (var4 != 5) {
                              break L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                        hb.d((byte) 105);
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (var2 == 0) {
                    break L3;
                  } else {
                    if (ne.field_u != 2) {
                      hb.d((byte) 52);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                L6: {
                  if (0 != var4) {
                    break L6;
                  } else {
                    if (ne.field_u == 2) {
                      var5 = fa.a(84) + -gd.field_a;
                      var7 = (int)((-var5 + 10999L) / 1000L);
                      if (0 >= var7) {
                        nj.a(true, -25698, 5);
                        var4 = 2;
                        break L6;
                      } else {
                        break L6;
                      }
                    } else {
                      break L6;
                    }
                  }
                }
                stackOut_27_0 = var4;
                stackIn_28_0 = stackOut_27_0;
                break L0;
              } else {
                L7: {
                  cf.field_f.a((byte) 110);
                  if (!cf.field_f.a(-1)) {
                    break L7;
                  } else {
                    var1_int = 1;
                    break L7;
                  }
                }
                if (13 != lh.field_f) {
                  continue L1;
                } else {
                  var2 = 1;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var1, "vi.A(" + param0 + ')');
        }
        return stackIn_28_0;
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        sa var4_ref_sa = null;
        long var4 = 0L;
        int var5 = 0;
        he var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        ii var27 = null;
        RuntimeException decompiledCaughtException = null;
        var26 = Bounce.field_N;
        try {
          L0: {
            var27 = jc.field_g;
            if (param0 == 1) {
              L1: {
                var2 = var27.d((byte) -91);
                if (var2 != 0) {
                  if (var2 != 1) {
                    ti.a((Throwable) null, (byte) 100, "HS1: " + la.a(-105));
                    kc.a((byte) 18);
                    break L1;
                  } else {
                    var3 = var27.a(-1640531527);
                    var4 = var27.f((byte) -121);
                    var6 = (he) (Object) of.field_b.a((byte) -92);
                    L2: while (true) {
                      L3: {
                        if (var6 == null) {
                          break L3;
                        } else {
                          if (var6.field_j == var3) {
                            break L3;
                          } else {
                            var6 = (he) (Object) of.field_b.d((byte) -42);
                            continue L2;
                          }
                        }
                      }
                      if (var6 != null) {
                        var6.field_o = var4;
                        var6.c(2);
                        break L1;
                      } else {
                        kc.a((byte) 18);
                        return;
                      }
                    }
                  }
                } else {
                  var3 = var27.a(-1640531527);
                  var4_ref_sa = (sa) (Object) jl.field_f.a((byte) -113);
                  L4: while (true) {
                    L5: {
                      if (var4_ref_sa == null) {
                        break L5;
                      } else {
                        if (var3 == var4_ref_sa.field_n) {
                          break L5;
                        } else {
                          var4_ref_sa = (sa) (Object) jl.field_f.d((byte) -65);
                          continue L4;
                        }
                      }
                    }
                    if (var4_ref_sa == null) {
                      kc.a((byte) 18);
                      return;
                    } else {
                      L6: {
                        var5 = var27.d((byte) -105);
                        if (var5 == 0) {
                          break L6;
                        } else {
                          var6_int = var4_ref_sa.field_g;
                          v.field_f[0].field_b = ja.field_b;
                          var7 = var4_ref_sa.field_m;
                          v.field_f[0].field_a = null;
                          v.field_f[0].field_e = false;
                          var8_int = 1;
                          L7: while (true) {
                            if (var5 <= var8_int) {
                              String[][] dupTemp$6 = new String[3][var6_int];
                              var4_ref_sa.field_h = dupTemp$6;
                              var8 = dupTemp$6;
                              var9 = new String[3][var6_int];
                              long[][] dupTemp$7 = new long[3][var6_int];
                              var4_ref_sa.field_l = dupTemp$7;
                              var10 = dupTemp$7;
                              int[][] dupTemp$8 = new int[3][var7 * var6_int];
                              var4_ref_sa.field_o = dupTemp$8;
                              var11 = dupTemp$8;
                              var12 = 0;
                              var13 = 0;
                              var14 = 0;
                              var15 = 0;
                              var16 = 0;
                              var17 = 0;
                              var18 = var27.d((byte) -68);
                              if (var18 > 0) {
                                var19 = 0;
                                L8: while (true) {
                                  if (var18 <= var19) {
                                    break L6;
                                  } else {
                                    L9: {
                                      var20 = var27.d((byte) -74);
                                      var21 = v.field_f[var20].field_b;
                                      var22 = var27.f((byte) -121);
                                      var24 = var27.field_h;
                                      if (var6_int > var19) {
                                        var8[0][var12] = var21;
                                        var9[0][var12] = v.field_f[var20].field_a;
                                        var10[0][var12] = var22;
                                        var12++;
                                        var25 = 0;
                                        L10: while (true) {
                                          if (var25 >= var7) {
                                            break L9;
                                          } else {
                                            int incrementValue$9 = var15;
                                            var15++;
                                            var11[0][incrementValue$9] = var27.j(-3);
                                            var25++;
                                            continue L10;
                                          }
                                        }
                                      } else {
                                        break L9;
                                      }
                                    }
                                    L11: {
                                      if (var21 == null) {
                                        break L11;
                                      } else {
                                        if (s.a(var21, 126)) {
                                          var8[1][var13] = ja.field_b;
                                          var9[1][var13] = null;
                                          var10[1][var13] = var22;
                                          var27.field_h = var24;
                                          var13++;
                                          var25 = 0;
                                          L12: while (true) {
                                            if (var25 >= var7) {
                                              break L11;
                                            } else {
                                              int incrementValue$10 = var16;
                                              var16++;
                                              var11[1][incrementValue$10] = var27.j(-3);
                                              var25++;
                                              continue L12;
                                            }
                                          }
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                    L13: {
                                      if (var14 >= var6_int) {
                                        break L13;
                                      } else {
                                        if (v.field_f[var20].field_e) {
                                          break L13;
                                        } else {
                                          v.field_f[var20].field_e = true;
                                          var8[2][var14] = var21;
                                          var9[2][var14] = v.field_f[var20].field_a;
                                          var10[2][var14] = var22;
                                          var27.field_h = var24;
                                          var14++;
                                          var25 = 0;
                                          L14: while (true) {
                                            if (var25 >= var7) {
                                              break L13;
                                            } else {
                                              int incrementValue$11 = var17;
                                              var17++;
                                              var11[2][incrementValue$11] = var27.j(-3);
                                              var25++;
                                              continue L14;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var19++;
                                    continue L8;
                                  }
                                }
                              } else {
                                break L6;
                              }
                            } else {
                              L15: {
                                v.field_f[var8_int].field_b = var27.b(true);
                                v.field_f[var8_int].field_e = false;
                                if (var27.d((byte) -99) != 1) {
                                  v.field_f[var8_int].field_a = null;
                                  break L15;
                                } else {
                                  v.field_f[var8_int].field_a = var27.b(true);
                                  break L15;
                                }
                              }
                              var8_int++;
                              continue L7;
                            }
                          }
                        }
                      }
                      var4_ref_sa.field_i = true;
                      var4_ref_sa.c(2);
                      break L1;
                    }
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var1, "vi.G(" + param0 + ')');
        }
    }

    final void d(int param0) {
        InterruptedException interruptedException = null;
        Object var2 = null;
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        ((vi) this).field_a = true;
        var2 = (Object) (Object) ((vi) this).field_d;
        synchronized (var2) {
          L0: {
            ((Object) (Object) ((vi) this).field_d).notifyAll();
            break L0;
          }
        }
        try {
          L1: {
            L2: {
              if (param0 == -1) {
                break L2;
              } else {
                int discarded$2 = vi.c(-89);
                break L2;
              }
            }
            ((vi) this).field_e.join();
            break L1;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            interruptedException = (InterruptedException) (Object) decompiledCaughtException;
            break L3;
          }
        }
        ((vi) this).field_e = null;
    }

    final static java.applet.Applet b(int param0) {
        if (a.field_c != null) {
            return a.field_c;
        }
        if (param0 != 0) {
            vi.a(-98);
        }
        return (java.applet.Applet) (Object) og.field_c;
    }

    private final void a(md param0, int param1) {
        Object var3 = null;
        RuntimeException var3_ref = null;
        Throwable var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var3 = (Object) (Object) ((vi) this).field_d;
            synchronized (var3) {
              L1: {
                L2: {
                  ((vi) this).field_d.a((byte) -78, (ug) (Object) param0);
                  ((vi) this).field_b = ((vi) this).field_b + 1;
                  if (param1 <= -25) {
                    break L2;
                  } else {
                    field_c = 84;
                    break L2;
                  }
                }
                ((Object) (Object) ((vi) this).field_d).notifyAll();
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("vi.F(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
        }
    }

    final md a(int param0, int param1, vh param2) {
        md var4 = null;
        RuntimeException var4_ref = null;
        md stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        md stackOut_0_0 = null;
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
            var4 = new md();
            var4.field_r = param2;
            var4.field_m = false;
            var4.field_p = param0;
            var4.field_j = (long)param1;
            this.a(var4, -126);
            stackOut_0_0 = (md) var4;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4_ref;
            stackOut_2_1 = new StringBuilder().append("vi.D(").append(param0).append(',').append(param1).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
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
          throw ii.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final md a(int param0, vh param1, boolean param2) {
        md var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        md var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        md stackIn_8_0 = null;
        md stackIn_15_0 = null;
        md stackIn_16_0 = null;
        md stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        md stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        md stackOut_7_0 = null;
        md stackOut_14_0 = null;
        md stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        md stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        md stackOut_17_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var8 = Bounce.field_N;
        try {
          L0: {
            var4 = new md();
            var4.field_p = 1;
            var5 = (Object) (Object) ((vi) this).field_d;
            synchronized (var5) {
              L1: {
                var6 = (md) (Object) ((vi) this).field_d.d(-86);
                L2: while (true) {
                  if (var6 == null) {
                    break L1;
                  } else {
                    L3: {
                      if (~(long)param0 != ~var6.field_j) {
                        break L3;
                      } else {
                        if (param1 != var6.field_r) {
                          break L3;
                        } else {
                          if (2 != var6.field_p) {
                            break L3;
                          } else {
                            var4.field_n = false;
                            var4.field_s = var6.field_s;
                            stackOut_7_0 = (md) var4;
                            stackIn_8_0 = stackOut_7_0;
                            return stackIn_8_0;
                          }
                        }
                      }
                    }
                    var6 = (md) (Object) ((vi) this).field_d.b(0);
                    continue L2;
                  }
                }
              }
            }
            L4: {
              var4.field_s = param1.a(106, param0);
              stackOut_14_0 = (md) var4;
              stackIn_16_0 = stackOut_14_0;
              stackIn_15_0 = stackOut_14_0;
              if (!param2) {
                stackOut_16_0 = (md) (Object) stackIn_16_0;
                stackOut_16_1 = 0;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                break L4;
              } else {
                stackOut_15_0 = (md) (Object) stackIn_15_0;
                stackOut_15_1 = 1;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                break L4;
              }
            }
            stackIn_17_0.field_m = stackIn_17_1 != 0;
            var4.field_n = false;
            stackOut_17_0 = (md) var4;
            stackIn_18_0 = stackOut_17_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4_ref;
            stackOut_19_1 = new StringBuilder().append("vi.C(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param2 + ')');
        }
        return stackIn_18_0;
    }

    final md a(vh param0, int param1, byte param2, byte[] param3) {
        md var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        md stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        md stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
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
            var5 = new md();
            var5.field_m = false;
            var5.field_s = param3;
            var6 = 92 / ((-20 - param2) / 55);
            var5.field_r = param0;
            var5.field_p = 2;
            var5.field_j = (long)param1;
            this.a(var5, -117);
            stackOut_0_0 = (md) var5;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var5_ref;
            stackOut_2_1 = new StringBuilder().append("vi.E(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
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
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_1_0;
    }

    public final void run() {
        try {
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            Object var6 = null;
            md var7 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var5 = Bounce.field_N;
            L0: while (true) {
              if (((vi) this).field_a) {
                return;
              } else {
                var2 = (Object) (Object) ((vi) this).field_d;
                synchronized (var2) {
                  L1: {
                    var7 = (md) (Object) ((vi) this).field_d.a(-1);
                    if (var7 != null) {
                      ((vi) this).field_b = ((vi) this).field_b - 1;
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      {
                        L2: {
                          ((Object) (Object) ((vi) this).field_d).wait();
                          break L2;
                        }
                      }
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  continue L0;
                } else {
                  try {
                    L4: {
                      L5: {
                        if (var7.field_p == 2) {
                          boolean discarded$1 = var7.field_r.a(var7.field_s.length, (byte) 118, (int)var7.field_j, var7.field_s);
                          var7.field_n = false;
                          break L5;
                        } else {
                          if (3 == var7.field_p) {
                            var7.field_s = var7.field_r.a(102, (int)var7.field_j);
                            var7.field_n = false;
                            break L5;
                          } else {
                            var7.field_n = false;
                            break L5;
                          }
                        }
                      }
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L6: {
                      var2_ref = (Exception) (Object) decompiledCaughtException;
                      var6 = null;
                      ti.a((Throwable) (Object) var2_ref, (byte) 100, (String) null);
                      var7.field_n = false;
                      break L6;
                    }
                  }
                  continue L0;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    vi(si param0) {
        mk var2 = null;
        ((vi) this).field_d = new ml();
        ((vi) this).field_a = false;
        ((vi) this).field_b = 0;
        try {
            var2 = param0.a(5, (byte) -123, (Runnable) this);
            while (0 == var2.field_f) {
                wh.a(10L, 19406);
            }
            if (var2.field_f == 2) {
                throw new RuntimeException();
            }
            ((vi) this).field_e = (Thread) var2.field_e;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "vi.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_f = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
    }
}
