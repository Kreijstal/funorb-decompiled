/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ee extends lk {
    static long field_e;
    private int field_u;
    static String field_q;
    private ni field_v;
    private wl field_k;
    private int field_r;
    private qg field_p;
    private sp field_l;
    private sp field_i;
    private byte[] field_x;
    private ob field_w;
    static dl field_m;
    private int field_s;
    private byte[] field_h;
    private fc field_g;
    private wb field_j;
    private wb field_n;
    private int field_o;
    private boolean field_d;
    private boolean field_f;
    private boolean field_t;
    private long field_c;

    final void e(int param0) {
        Object var2_ref = null;
        int var2 = 0;
        wl var2_ref_wl = null;
        jb var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        int stackOut_57_0 = 0;
        int stackOut_57_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        L0: {
          var2_ref = null;
          var5 = CrazyCrystals.field_B;
          if (((ee) this).field_j == null) {
            break L0;
          } else {
            if (((ee) this).a(630779105) == null) {
              return;
            } else {
              if (!((ee) this).field_d) {
                if (!((ee) this).field_f) {
                  ((ee) this).field_j = null;
                  break L0;
                } else {
                  var2 = 1;
                  var3 = ((ee) this).field_j.g(32073);
                  L1: while (true) {
                    if (var3 == null) {
                      L2: while (true) {
                        L3: {
                          if (((ee) this).field_o >= ((ee) this).field_p.field_f.length) {
                            break L3;
                          } else {
                            stackOut_57_0 = 0;
                            stackOut_57_1 = ((ee) this).field_p.field_f[((ee) this).field_o];
                            stackIn_59_0 = stackOut_57_0;
                            stackIn_59_1 = stackOut_57_1;
                            if (stackIn_59_0 == stackIn_59_1) {
                              ((ee) this).field_o = ((ee) this).field_o + 1;
                              continue L2;
                            } else {
                              if (((ee) this).field_w.c(-21)) {
                                var2 = 0;
                                break L3;
                              } else {
                                L4: {
                                  if (((ee) this).field_h[((ee) this).field_o] != 1) {
                                    wl discarded$4 = this.a(true, 2, ((ee) this).field_o);
                                    break L4;
                                  } else {
                                    break L4;
                                  }
                                }
                                L5: {
                                  if (((ee) this).field_h[((ee) this).field_o] != 1) {
                                    var3 = new jb();
                                    var3.field_e = (long)((ee) this).field_o;
                                    var2 = 0;
                                    ((ee) this).field_j.b(0, var3);
                                    break L5;
                                  } else {
                                    break L5;
                                  }
                                }
                                ((ee) this).field_o = ((ee) this).field_o + 1;
                                continue L2;
                              }
                            }
                          }
                        }
                        if (var2 == 0) {
                          break L0;
                        } else {
                          ((ee) this).field_f = false;
                          ((ee) this).field_o = 0;
                          break L0;
                        }
                      }
                    } else {
                      L6: {
                        var4 = (int)var3.field_e;
                        if (1 != ((ee) this).field_h[var4]) {
                          wl discarded$5 = this.a(true, 2, var4);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        if (((ee) this).field_h[var4] == 1) {
                          var3.a(false);
                          break L7;
                        } else {
                          var2 = 0;
                          break L7;
                        }
                      }
                      var3 = ((ee) this).field_j.a(false);
                      continue L1;
                    }
                  }
                }
              } else {
                var2 = 1;
                var3 = ((ee) this).field_j.g(32073);
                L8: while (true) {
                  if (null == var3) {
                    L9: while (true) {
                      L10: {
                        if (((ee) this).field_o >= ((ee) this).field_p.field_f.length) {
                          break L10;
                        } else {
                          stackOut_20_0 = -1;
                          stackOut_20_1 = ~((ee) this).field_p.field_f[((ee) this).field_o];
                          stackIn_22_0 = stackOut_20_0;
                          stackIn_22_1 = stackOut_20_1;
                          if (stackIn_22_0 == stackIn_22_1) {
                            ((ee) this).field_o = ((ee) this).field_o + 1;
                            continue L9;
                          } else {
                            if (((ee) this).field_v.field_c < 250) {
                              L11: {
                                if (((ee) this).field_h[((ee) this).field_o] == 0) {
                                  wl discarded$6 = this.a(true, 1, ((ee) this).field_o);
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                              L12: {
                                if (((ee) this).field_h[((ee) this).field_o] == 0) {
                                  var3 = new jb();
                                  var3.field_e = (long)((ee) this).field_o;
                                  var2 = 0;
                                  ((ee) this).field_j.b(0, var3);
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                              ((ee) this).field_o = ((ee) this).field_o + 1;
                              continue L9;
                            } else {
                              var2 = 0;
                              break L10;
                            }
                          }
                        }
                      }
                      if (var2 == 0) {
                        break L0;
                      } else {
                        ((ee) this).field_o = 0;
                        ((ee) this).field_d = false;
                        break L0;
                      }
                    }
                  } else {
                    L13: {
                      var4 = (int)var3.field_e;
                      if (0 != ((ee) this).field_h[var4]) {
                        break L13;
                      } else {
                        wl discarded$7 = this.a(true, 1, var4);
                        break L13;
                      }
                    }
                    L14: {
                      if (0 == ((ee) this).field_h[var4]) {
                        var2 = 0;
                        break L14;
                      } else {
                        var3.a(false);
                        break L14;
                      }
                    }
                    var3 = ((ee) this).field_j.a(false);
                    continue L8;
                  }
                }
              }
            }
          }
        }
        L15: {
          if (!((ee) this).field_t) {
            break L15;
          } else {
            if (((ee) this).field_c > lo.a((byte) 110)) {
              break L15;
            } else {
              var2_ref_wl = (wl) (Object) ((ee) this).field_g.a((byte) -92);
              L16: while (true) {
                if (null == var2_ref_wl) {
                  ((ee) this).field_c = 1000L + lo.a((byte) -30);
                  break L15;
                } else {
                  L17: {
                    if (var2_ref_wl.field_n) {
                      break L17;
                    } else {
                      if (var2_ref_wl.field_l) {
                        if (!var2_ref_wl.field_q) {
                          throw new RuntimeException();
                        } else {
                          var2_ref_wl.a(false);
                          break L17;
                        }
                      } else {
                        var2_ref_wl.field_l = true;
                        break L17;
                      }
                    }
                  }
                  var2_ref_wl = (wl) (Object) ((ee) this).field_g.a(105);
                  continue L16;
                }
              }
            }
          }
        }
        var2 = -100 / ((param0 - -13) / 37);
    }

    final static wj a(db param0, String param1, byte param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        wj stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        wj stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            var4_int = param0.a(param1, -1);
            var5 = param0.a(-2862, param3, var4_int);
            stackOut_2_0 = v.a(28297, var4_int, var5, param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("ee.K(");
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
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
          L3: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44).append(-92).append(44);
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L3;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_3_0;
    }

    final int a(int param0, int param1) {
        wl var3 = (wl) (Object) ((ee) this).field_g.a((long)param0, 0);
        if (param1 != 486289953) {
            ((ee) this).e(-120);
        }
        if (var3 == null) {
            return 0;
        }
        return var3.b((byte) 95);
    }

    final byte[] a(int param0, boolean param1) {
        wl var3 = this.a(true, 0, param0);
        if (param1) {
            ((ee) this).field_c = -78L;
        }
        if (null == var3) {
            return null;
        }
        byte[] var4 = var3.e(-27);
        var3.a(param1);
        return var4;
    }

    public static void d(int param0) {
        L0: {
          field_q = null;
          field_m = null;
          if (param0 == 0) {
            break L0;
          } else {
            ee.d(-92);
            break L0;
          }
        }
    }

    private final wl a(boolean param0, int param1, int param2) {
        Object var4 = null;
        byte[] var5 = null;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var6_int = 0;
        int var7_int = 0;
        byte[] var7 = null;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object stackIn_73_0 = null;
        Object stackIn_75_0 = null;
        Object stackIn_102_0 = null;
        int stackIn_110_0 = 0;
        byte stackIn_110_1 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_100_0 = null;
        int stackOut_109_0 = 0;
        byte stackOut_109_1 = 0;
        Object stackOut_71_0 = null;
        Object stackOut_74_0 = null;
        L0: {
          var4 = null;
          var10 = CrazyCrystals.field_B;
          var4 = (Object) (Object) (wl) (Object) ((ee) this).field_g.a((long)param2, 0);
          if (var4 == null) {
            break L0;
          } else {
            if (param1 != 0) {
              break L0;
            } else {
              if (((wl) var4).field_q) {
                break L0;
              } else {
                if (((wl) var4).field_n) {
                  ((wl) var4).a(false);
                  var4 = null;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (var4 != null) {
            break L1;
          } else {
            L2: {
              if (0 == param1) {
                L3: {
                  if (((ee) this).field_l == null) {
                    break L3;
                  } else {
                    if (((ee) this).field_h[param2] == -1) {
                      break L3;
                    } else {
                      var4 = (Object) (Object) ((ee) this).field_v.a(true, param2, ((ee) this).field_l);
                      break L2;
                    }
                  }
                }
                if (!((ee) this).field_w.c((byte) -123)) {
                  var4 = (Object) (Object) ((ee) this).field_w.a(true, 18303, param2, ((ee) this).field_r, (byte) 2);
                  break L2;
                } else {
                  return null;
                }
              } else {
                if (1 != param1) {
                  if (param1 == 2) {
                    if (((ee) this).field_l != null) {
                      if (((ee) this).field_h[param2] == -1) {
                        if (!((ee) this).field_w.c(-21)) {
                          var4 = (Object) (Object) ((ee) this).field_w.a(false, 18303, param2, ((ee) this).field_r, (byte) 2);
                          break L2;
                        } else {
                          return null;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  } else {
                    throw new RuntimeException();
                  }
                } else {
                  if (null != ((ee) this).field_l) {
                    var4 = (Object) (Object) ((ee) this).field_v.a(-4, param2, ((ee) this).field_l);
                    break L2;
                  } else {
                    throw new RuntimeException();
                  }
                }
              }
            }
            ((ee) this).field_g.a(-22072, (long)param2, (jb) var4);
            break L1;
          }
        }
        if (!((wl) var4).field_n) {
          var5 = ((wl) var4).e(-5);
          if (!(var4 instanceof mf)) {
            try {
              L4: {
                L5: {
                  if (null == var5) {
                    break L5;
                  } else {
                    if (var5.length <= 2) {
                      break L5;
                    } else {
                      sj.field_b.reset();
                      sj.field_b.update(var5, 0, -2 + var5.length);
                      var6_int = (int)sj.field_b.getValue();
                      if (var6_int == ((ee) this).field_p.field_n[param2]) {
                        L6: {
                          if (((ee) this).field_p.field_m == null) {
                            break L6;
                          } else {
                            if (((ee) this).field_p.field_m[param2] == null) {
                              break L6;
                            } else {
                              var7 = ((ee) this).field_p.field_m[param2];
                              int discarded$3 = -127;
                              var8 = ac.a(var5, 0, -2 + var5.length);
                              var11 = 0;
                              var9 = var11;
                              L7: while (true) {
                                if (var11 >= 64) {
                                  break L6;
                                } else {
                                  if (var7[var11] == var8[var11]) {
                                    var11++;
                                    continue L7;
                                  } else {
                                    throw new RuntimeException();
                                  }
                                }
                              }
                            }
                          }
                        }
                        ((ee) this).field_w.field_j = 0;
                        ((ee) this).field_w.field_p = 0;
                        break L4;
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6_ref = (RuntimeException) (Object) decompiledCaughtException;
              ((ee) this).field_w.e(20406);
              stackOut_100_0 = var4;
              stackIn_102_0 = stackOut_100_0;
              L8: {
                ((wl) (Object) stackIn_102_0).a(false);
                if (((wl) var4).field_q) {
                  if (!((ee) this).field_w.c((byte) -73)) {
                    var4 = (Object) (Object) ((ee) this).field_w.a(true, 18303, param2, ((ee) this).field_r, (byte) 2);
                    ((ee) this).field_g.a(-22072, (long)param2, (jb) var4);
                    break L8;
                  } else {
                    return null;
                  }
                } else {
                  break L8;
                }
              }
              return null;
            }
            L9: {
              var5[var5.length - 2] = (byte)(((ee) this).field_p.field_g[param2] >>> 8);
              var5[var5.length + -1] = (byte)((ee) this).field_p.field_g[param2];
              if (null == ((ee) this).field_l) {
                break L9;
              } else {
                mf discarded$4 = ((ee) this).field_v.a(param2, ((ee) this).field_l, var5, (byte) 116);
                stackOut_109_0 = 1;
                stackOut_109_1 = ((ee) this).field_h[param2];
                stackIn_110_0 = stackOut_109_0;
                stackIn_110_1 = stackOut_109_1;
                if (stackIn_110_0 == stackIn_110_1) {
                  break L9;
                } else {
                  ((ee) this).field_h[param2] = (byte) 1;
                  break L9;
                }
              }
            }
            L10: {
              if (((wl) var4).field_q) {
                break L10;
              } else {
                ((wl) var4).a(false);
                break L10;
              }
            }
            return (wl) var4;
          } else {
            try {
              L11: {
                L12: {
                  if (var5 == null) {
                    break L12;
                  } else {
                    if (2 >= var5.length) {
                      break L12;
                    } else {
                      sj.field_b.reset();
                      sj.field_b.update(var5, 0, -2 + var5.length);
                      var6_int = (int)sj.field_b.getValue();
                      if (((ee) this).field_p.field_n[param2] == var6_int) {
                        L13: {
                          if (null == ((ee) this).field_p.field_m) {
                            break L13;
                          } else {
                            if (null == ((ee) this).field_p.field_m[param2]) {
                              break L13;
                            } else {
                              var7 = ((ee) this).field_p.field_m[param2];
                              int discarded$5 = -127;
                              var8 = ac.a(var5, 0, -2 + var5.length);
                              var9 = 0;
                              L14: while (true) {
                                if (64 <= var9) {
                                  break L13;
                                } else {
                                  if (var7[var9] != var8[var9]) {
                                    throw new RuntimeException();
                                  } else {
                                    var9++;
                                    continue L14;
                                  }
                                }
                              }
                            }
                          }
                        }
                        var7_int = (65280 & var5[var5.length - 2] << 8) - -(var5[var5.length - 1] & 255);
                        if (var7_int != (((ee) this).field_p.field_g[param2] & 65535)) {
                          throw new RuntimeException();
                        } else {
                          L15: {
                            if (((ee) this).field_h[param2] != 1) {
                              L16: {
                                if (((ee) this).field_h[param2] == 0) {
                                  break L16;
                                } else {
                                  break L16;
                                }
                              }
                              ((ee) this).field_h[param2] = (byte) 1;
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          L17: {
                            if (!((wl) var4).field_q) {
                              stackOut_71_0 = var4;
                              stackIn_73_0 = stackOut_71_0;
                              ((wl) (Object) stackIn_73_0).a(false);
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                          stackOut_74_0 = var4;
                          stackIn_75_0 = stackOut_74_0;
                          break L11;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L18: {
                var6 = (Exception) (Object) decompiledCaughtException;
                ((ee) this).field_h[param2] = (byte) -1;
                ((wl) var4).a(false);
                if (((wl) var4).field_q) {
                  if (!((ee) this).field_w.c((byte) -72)) {
                    var4 = (Object) (Object) ((ee) this).field_w.a(true, 18303, param2, ((ee) this).field_r, (byte) 2);
                    ((ee) this).field_g.a(-22072, (long)param2, (jb) var4);
                    break L18;
                  } else {
                    break L18;
                  }
                } else {
                  break L18;
                }
              }
              return null;
            }
            return (wl) (Object) stackIn_75_0;
          }
        } else {
          return null;
        }
    }

    final qg a(int param0) {
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = CrazyCrystals.field_B;
        if (null != ((ee) this).field_p) {
          return ((ee) this).field_p;
        } else {
          if (param0 == 630779105) {
            L0: {
              if (((ee) this).field_k != null) {
                break L0;
              } else {
                if (!((ee) this).field_w.c((byte) -54)) {
                  ((ee) this).field_k = (wl) (Object) ((ee) this).field_w.a(true, 18303, ((ee) this).field_r, 255, (byte) 0);
                  break L0;
                } else {
                  return null;
                }
              }
            }
            if (!((ee) this).field_k.field_n) {
              L1: {
                var5 = ((ee) this).field_k.e(115);
                var2 = var5;
                if (((ee) this).field_k instanceof mf) {
                  try {
                    L2: {
                      if (var2 != null) {
                        ((ee) this).field_p = new qg(var2, ((ee) this).field_u, ((ee) this).field_x);
                        if (((ee) this).field_s != ((ee) this).field_p.field_r) {
                          throw new RuntimeException();
                        } else {
                          break L2;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var3 = decompiledCaughtException;
                      ((ee) this).field_p = null;
                      if (((ee) this).field_w.c((byte) -90)) {
                        ((ee) this).field_k = null;
                        break L3;
                      } else {
                        ((ee) this).field_k = (wl) (Object) ((ee) this).field_w.a(true, 18303, ((ee) this).field_r, 255, (byte) 0);
                        break L3;
                      }
                    }
                    return null;
                  }
                  break L1;
                } else {
                  try {
                    L4: {
                      if (null == var5) {
                        throw new RuntimeException();
                      } else {
                        ((ee) this).field_p = new qg(var5, ((ee) this).field_u, ((ee) this).field_x);
                        break L4;
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L5: {
                      var3 = decompiledCaughtException;
                      ((ee) this).field_w.e(20406);
                      ((ee) this).field_p = null;
                      if (!((ee) this).field_w.c((byte) -82)) {
                        ((ee) this).field_k = (wl) (Object) ((ee) this).field_w.a(true, 18303, ((ee) this).field_r, 255, (byte) 0);
                        break L5;
                      } else {
                        ((ee) this).field_k = null;
                        break L5;
                      }
                    }
                    return null;
                  }
                  if (null == ((ee) this).field_i) {
                    break L1;
                  } else {
                    mf discarded$1 = ((ee) this).field_v.a(((ee) this).field_r, ((ee) this).field_i, var5, (byte) 116);
                    break L1;
                  }
                }
              }
              L6: {
                if (null == ((ee) this).field_l) {
                  break L6;
                } else {
                  ((ee) this).field_h = new byte[((ee) this).field_p.field_a];
                  break L6;
                }
              }
              ((ee) this).field_k = null;
              return ((ee) this).field_p;
            } else {
              return null;
            }
          } else {
            return null;
          }
        }
    }

    final void c(int param0) {
        jb var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = CrazyCrystals.field_B;
        if (null == ((ee) this).field_j) {
          return;
        } else {
          L0: {
            if (param0 >= 112) {
              break L0;
            } else {
              ((ee) this).field_h = null;
              break L0;
            }
          }
          if (((ee) this).a(630779105) != null) {
            var2 = ((ee) this).field_n.g(32073);
            L1: while (true) {
              if (var2 == null) {
                return;
              } else {
                L2: {
                  var3 = (int)var2.field_e;
                  if (var3 >= 0) {
                    if (((ee) this).field_p.field_a > var3) {
                      if (((ee) this).field_p.field_f[var3] != 0) {
                        L3: {
                          if (0 == ((ee) this).field_h[var3]) {
                            wl discarded$2 = this.a(true, 1, var3);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        L4: {
                          if (((ee) this).field_h[var3] == -1) {
                            wl discarded$3 = this.a(true, 2, var3);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        if (((ee) this).field_h[var3] == 1) {
                          var2.a(false);
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        var2.a(false);
                        break L2;
                      }
                    } else {
                      var2.a(false);
                      break L2;
                    }
                  } else {
                    var2.a(false);
                    break L2;
                  }
                }
                var2 = ((ee) this).field_n.a(false);
                continue L1;
              }
            }
          } else {
            return;
          }
        }
    }

    final static boolean a(int[] param0) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        Object var4_ref = null;
        mo var4_ref_mo = null;
        int var4 = 0;
        int var5_int = 0;
        mo var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_5_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_47_0 = 0;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_35_0 = 0;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        var4_ref = null;
        var7 = CrazyCrystals.field_B;
        try {
          L0: {
            if (ek.field_h != gj.field_k) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              L1: {
                L2: {
                  var2_long = lo.a((byte) -98);
                  if (0 == wb.field_d) {
                    break L2;
                  } else {
                    if (sm.field_i < 0) {
                      L3: {
                        var4_ref_mo = (mo) (Object) bn.field_i.g(32073);
                        if (null == var4_ref_mo) {
                          break L3;
                        } else {
                          if (~var4_ref_mo.field_k <= ~var2_long) {
                            break L3;
                          } else {
                            var4_ref_mo.a(false);
                            rk.field_b = var4_ref_mo.field_g.length;
                            kd.field_n.field_f = 0;
                            var5_int = 0;
                            L4: while (true) {
                              if (rk.field_b <= var5_int) {
                                fl.field_m = ea.field_n;
                                ea.field_n = qn.field_u;
                                qn.field_u = bf.field_b;
                                bf.field_b = var4_ref_mo.field_j;
                                stackOut_19_0 = 1;
                                stackIn_20_0 = stackOut_19_0;
                                return stackIn_20_0 != 0;
                              } else {
                                kd.field_n.field_h[var5_int] = var4_ref_mo.field_g[var5_int];
                                var5_int++;
                                continue L4;
                              }
                            }
                          }
                        }
                      }
                      stackOut_23_0 = sm.field_i;
                      stackIn_26_0 = stackOut_23_0;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_21_0 = sm.field_i;
                stackIn_26_0 = stackOut_21_0;
                break L1;
              }
              L5: while (true) {
                L6: {
                  if (stackIn_26_0 < 0) {
                    kd.field_n.field_f = 0;
                    if (!fq.a(1, (byte) 104)) {
                      stackOut_31_0 = 0;
                      stackIn_32_0 = stackOut_31_0;
                      return stackIn_32_0 != 0;
                    } else {
                      sm.field_i = kd.field_n.e(true);
                      kd.field_n.field_f = 0;
                      rk.field_b = param0[sm.field_i];
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
                if (ol.f((byte) 60)) {
                  if (wb.field_d == 0) {
                    fl.field_m = ea.field_n;
                    ea.field_n = qn.field_u;
                    qn.field_u = bf.field_b;
                    bf.field_b = sm.field_i;
                    sm.field_i = -1;
                    stackOut_46_0 = 1;
                    stackIn_47_0 = stackOut_46_0;
                    break L0;
                  } else {
                    L7: {
                      var4 = wb.field_d;
                      if (0.0 == kk.field_b) {
                        break L7;
                      } else {
                        var4 = (int)((double)var4 + og.field_w.nextGaussian() * kk.field_b);
                        if (var4 >= 0) {
                          break L7;
                        } else {
                          var4 = 0;
                          break L7;
                        }
                      }
                    }
                    var5 = new mo((long)var4 + var2_long, sm.field_i, new byte[rk.field_b]);
                    var6 = 0;
                    L8: while (true) {
                      if (var6 >= rk.field_b) {
                        bn.field_i.b(0, (jb) (Object) var5);
                        sm.field_i = -1;
                        stackOut_25_0 = sm.field_i;
                        stackIn_26_0 = stackOut_25_0;
                        continue L5;
                      } else {
                        var5.field_g[var6] = kd.field_n.field_h[var6];
                        var6++;
                        continue L8;
                      }
                    }
                  }
                } else {
                  stackOut_35_0 = 0;
                  stackIn_36_0 = stackOut_35_0;
                  return stackIn_36_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_48_0 = (RuntimeException) var2;
            stackOut_48_1 = new StringBuilder().append("ee.G(");
            stackIn_51_0 = stackOut_48_0;
            stackIn_51_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param0 == null) {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L9;
            } else {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "{...}";
              stackIn_52_0 = stackOut_49_0;
              stackIn_52_1 = stackOut_49_1;
              stackIn_52_2 = stackOut_49_2;
              break L9;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_52_0, stackIn_52_2 + 44 + 64 + 41);
        }
        return stackIn_47_0 != 0;
    }

    final void b(byte param0) {
        int var2 = 0;
        if (((ee) this).field_l != null) {
          L0: {
            ((ee) this).field_f = true;
            if (((ee) this).field_j == null) {
              ((ee) this).field_j = new wb();
              break L0;
            } else {
              break L0;
            }
          }
          var2 = 42 % ((param0 - 7) / 45);
          return;
        } else {
          return;
        }
    }

    ee(int param0, sp param1, sp param2, ob param3, ni param4, int param5, byte[] param6, int param7, boolean param8) {
        RuntimeException var10 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
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
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
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
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        ((ee) this).field_g = new fc(16);
        ((ee) this).field_o = 0;
        ((ee) this).field_n = new wb();
        ((ee) this).field_c = 0L;
        try {
          L0: {
            L1: {
              ((ee) this).field_l = param1;
              ((ee) this).field_r = param0;
              if (null == ((ee) this).field_l) {
                ((ee) this).field_d = false;
                break L1;
              } else {
                ((ee) this).field_d = true;
                ((ee) this).field_j = new wb();
                break L1;
              }
            }
            L2: {
              ((ee) this).field_s = param7;
              ((ee) this).field_i = param2;
              ((ee) this).field_w = param3;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param8) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              ((ee) this).field_t = stackIn_7_1 != 0;
              ((ee) this).field_u = param5;
              ((ee) this).field_v = param4;
              ((ee) this).field_x = param6;
              if (null == ((ee) this).field_i) {
                break L3;
              } else {
                ((ee) this).field_k = (wl) (Object) ((ee) this).field_v.a(true, ((ee) this).field_r, ((ee) this).field_i);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var10;
            stackOut_11_1 = new StringBuilder().append("ee.<init>(").append(param0).append(44);
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
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L6;
            }
          }
          L7: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(44);
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param4 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L7;
            }
          }
          L8: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(44).append(param5).append(44);
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param6 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L8;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 44 + param7 + 44 + param8 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Login: ";
    }
}
