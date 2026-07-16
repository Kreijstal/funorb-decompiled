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
        if (param0 <= 50) {
            return;
        }
        field_f = null;
    }

    final static int c(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        var8 = Bounce.field_N;
        var1 = 0;
        var3 = 115 % ((param0 - 53) / 58);
        var2 = 0;
        L0: while (true) {
          if (!q.g((byte) -15)) {
            L1: {
              cf.field_f.a(qe.a(uc.field_C, (byte) -94, ll.field_y), qe.a(og.field_a, (byte) -125, rk.field_a), -798);
              if (cf.field_f.a(-1)) {
                var1 = 1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                var4 = 0;
                if (var1 == 0) {
                  break L3;
                } else {
                  if (0 <= cf.field_f.field_b) {
                    L4: {
                      var4 = ii.field_n[cf.field_f.field_b];
                      if (var4 == 2) {
                        break L4;
                      } else {
                        if ((var4 ^ -1) != -6) {
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                    hb.d((byte) 105);
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (var2 == 0) {
                break L2;
              } else {
                if (ne.field_u != 2) {
                  hb.d((byte) 52);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L5: {
              if (0 != var4) {
                break L5;
              } else {
                if (-3 == (ne.field_u ^ -1)) {
                  var5 = fa.a(84) + -gd.field_a;
                  var7 = (int)((-var5 + 10999L) / 1000L);
                  if (0 >= var7) {
                    nj.a(true, -25698, 5);
                    var4 = 2;
                    break L5;
                  } else {
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
            }
            return var4;
          } else {
            L6: {
              cf.field_f.a((byte) 110);
              if (!cf.field_f.a(-1)) {
                break L6;
              } else {
                var1 = 1;
                break L6;
              }
            }
            if (13 != lh.field_f) {
              continue L0;
            } else {
              var2 = 1;
              continue L0;
            }
          }
        }
    }

    final static void a(int param0) {
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
        var26 = Bounce.field_N;
        var27 = jc.field_g;
        if (param0 == 1) {
          L0: {
            var2 = var27.d((byte) -91);
            if (var2 != 0) {
              if (-2 != (var2 ^ -1)) {
                ti.a((Throwable) null, (byte) 100, "HS1: " + la.a(-105));
                kc.a((byte) 18);
                break L0;
              } else {
                var3 = var27.a(-1640531527);
                var4 = var27.f((byte) -121);
                var6 = (he) (Object) of.field_b.a((byte) -92);
                L1: while (true) {
                  L2: {
                    if (var6 == null) {
                      break L2;
                    } else {
                      if (var6.field_j == var3) {
                        break L2;
                      } else {
                        var6 = (he) (Object) of.field_b.d((byte) -42);
                        continue L1;
                      }
                    }
                  }
                  if (var6 != null) {
                    var6.field_o = var4;
                    var6.c(2);
                    break L0;
                  } else {
                    kc.a((byte) 18);
                    return;
                  }
                }
              }
            } else {
              var3 = var27.a(-1640531527);
              var4_ref_sa = (sa) (Object) jl.field_f.a((byte) -113);
              L3: while (true) {
                L4: {
                  if (var4_ref_sa == null) {
                    break L4;
                  } else {
                    if (var3 == var4_ref_sa.field_n) {
                      break L4;
                    } else {
                      var4_ref_sa = (sa) (Object) jl.field_f.d((byte) -65);
                      continue L3;
                    }
                  }
                }
                if (var4_ref_sa == null) {
                  kc.a((byte) 18);
                  return;
                } else {
                  L5: {
                    var5 = var27.d((byte) -105);
                    if (-1 == (var5 ^ -1)) {
                      break L5;
                    } else {
                      var6_int = var4_ref_sa.field_g;
                      v.field_f[0].field_b = ja.field_b;
                      var7 = var4_ref_sa.field_m;
                      v.field_f[0].field_a = null;
                      v.field_f[0].field_e = false;
                      var8_int = 1;
                      L6: while (true) {
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
                          if (-1 > (var18 ^ -1)) {
                            var19 = 0;
                            L7: while (true) {
                              if (var18 <= var19) {
                                break L5;
                              } else {
                                L8: {
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
                                    L9: while (true) {
                                      if (var25 >= var7) {
                                        break L8;
                                      } else {
                                        int incrementValue$9 = var15;
                                        var15++;
                                        var11[0][incrementValue$9] = var27.j(-3);
                                        var25++;
                                        continue L9;
                                      }
                                    }
                                  } else {
                                    break L8;
                                  }
                                }
                                L10: {
                                  if (var21 == null) {
                                    break L10;
                                  } else {
                                    if (s.a(var21, 126)) {
                                      var8[1][var13] = ja.field_b;
                                      var9[1][var13] = null;
                                      var10[1][var13] = var22;
                                      var27.field_h = var24;
                                      var13++;
                                      var25 = 0;
                                      L11: while (true) {
                                        if (var25 >= var7) {
                                          break L10;
                                        } else {
                                          int incrementValue$10 = var16;
                                          var16++;
                                          var11[1][incrementValue$10] = var27.j(-3);
                                          var25++;
                                          continue L11;
                                        }
                                      }
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                if (var14 < var6_int) {
                                  if (!v.field_f[var20].field_e) {
                                    v.field_f[var20].field_e = true;
                                    var8[2][var14] = var21;
                                    var9[2][var14] = v.field_f[var20].field_a;
                                    var10[2][var14] = var22;
                                    var27.field_h = var24;
                                    var14++;
                                    var25 = 0;
                                    L12: while (true) {
                                      if (var25 < var7) {
                                        int incrementValue$11 = var17;
                                        var17++;
                                        var11[2][incrementValue$11] = var27.j(-3);
                                        var25++;
                                        continue L12;
                                      } else {
                                        var19++;
                                        continue L7;
                                      }
                                    }
                                  } else {
                                    var19++;
                                    continue L7;
                                  }
                                } else {
                                  var19++;
                                  continue L7;
                                }
                              }
                            }
                          } else {
                            break L5;
                          }
                        } else {
                          v.field_f[var8_int].field_b = var27.b(true);
                          v.field_f[var8_int].field_e = false;
                          if ((var27.d((byte) -99) ^ -1) != -2) {
                            v.field_f[var8_int].field_a = null;
                            var8_int++;
                            continue L6;
                          } else {
                            v.field_f[var8_int].field_a = var27.b(true);
                            var8_int++;
                            continue L6;
                          }
                        }
                      }
                    }
                  }
                  var4_ref_sa.field_i = true;
                  var4_ref_sa.c(2);
                  break L0;
                }
              }
            }
          }
          return;
        } else {
          return;
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
        Throwable var4 = null;
        Throwable decompiledCaughtException = null;
        var3 = (Object) (Object) ((vi) this).field_d;
        synchronized (var3) {
          L0: {
            L1: {
              ((vi) this).field_d.a((byte) -78, (ug) (Object) param0);
              ((vi) this).field_b = ((vi) this).field_b + 1;
              if (param1 <= -25) {
                break L1;
              } else {
                field_c = 84;
                break L1;
              }
            }
            ((Object) (Object) ((vi) this).field_d).notifyAll();
            break L0;
          }
        }
    }

    final md a(int param0, int param1, vh param2) {
        md var4 = new md();
        var4.field_r = param2;
        var4.field_m = false;
        var4.field_p = param0;
        var4.field_j = (long)param1;
        this.a(var4, -126);
        return var4;
    }

    final md a(int param0, vh param1, boolean param2) {
        md var4 = null;
        Object var5 = null;
        md var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        md stackIn_7_0 = null;
        md stackIn_14_0 = null;
        md stackIn_15_0 = null;
        md stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Throwable decompiledCaughtException = null;
        md stackOut_6_0 = null;
        md stackOut_13_0 = null;
        md stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        md stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        var8 = Bounce.field_N;
        var4 = new md();
        var4.field_p = 1;
        var5 = (Object) (Object) ((vi) this).field_d;
        synchronized (var5) {
          L0: {
            var6 = (md) (Object) ((vi) this).field_d.d(-86);
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                L2: {
                  if (((long)param0 ^ -1L) != (var6.field_j ^ -1L)) {
                    break L2;
                  } else {
                    if (param1 != var6.field_r) {
                      break L2;
                    } else {
                      if (2 != var6.field_p) {
                        break L2;
                      } else {
                        var4.field_n = false;
                        var4.field_s = var6.field_s;
                        stackOut_6_0 = (md) var4;
                        stackIn_7_0 = stackOut_6_0;
                        return stackIn_7_0;
                      }
                    }
                  }
                }
                var6 = (md) (Object) ((vi) this).field_d.b(0);
                continue L1;
              }
            }
          }
        }
        L3: {
          var4.field_s = param1.a(106, param0);
          stackOut_13_0 = (md) var4;
          stackIn_15_0 = stackOut_13_0;
          stackIn_14_0 = stackOut_13_0;
          if (!param2) {
            stackOut_15_0 = (md) (Object) stackIn_15_0;
            stackOut_15_1 = 0;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            break L3;
          } else {
            stackOut_14_0 = (md) (Object) stackIn_14_0;
            stackOut_14_1 = 1;
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            break L3;
          }
        }
        stackIn_16_0.field_m = stackIn_16_1 != 0;
        var4.field_n = false;
        return var4;
    }

    final md a(vh param0, int param1, byte param2, byte[] param3) {
        md var5 = new md();
        var5.field_m = false;
        var5.field_s = param3;
        int var6 = 92 / ((-20 - param2) / 55);
        var5.field_r = param0;
        var5.field_p = 2;
        var5.field_j = (long)param1;
        this.a(var5, -117);
        return var5;
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
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
                      try {
                        L2: {
                          ((Object) (Object) ((vi) this).field_d).wait();
                          break L2;
                        }
                      } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L3: {
                          interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                          break L3;
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
        ((vi) this).field_d = new ml();
        ((vi) this).field_a = false;
        ((vi) this).field_b = 0;
        mk var2 = param0.a(5, (byte) -123, (Runnable) this);
        while (0 == var2.field_f) {
            wh.a(10L, 19406);
        }
        if (var2.field_f == 2) {
            throw new RuntimeException();
        }
        ((vi) this).field_e = (Thread) var2.field_e;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_f = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
    }
}
