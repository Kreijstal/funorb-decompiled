/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends qa {
    char[] field_D;
    int[] field_x;
    boolean field_y;
    char[] field_r;
    static String field_v;
    static String field_C;
    static String field_z;
    static String field_w;
    static String field_u;
    int[] field_B;
    static String field_t;
    static String field_q;
    String field_s;
    static String field_A;

    final static String e(int param0) {
        String var1 = "";
        if (param0 != -24093) {
            return (String) null;
        }
        if (null != b.field_c) {
            var1 = b.field_c.h(6728);
        }
        if (!(-1 != (var1.length() ^ -1))) {
            var1 = ki.a((byte) -127);
        }
        if (!((var1.length() ^ -1) != -1)) {
            var1 = hg.field_vb;
        }
        return var1;
    }

    private final void a(int param0, k param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        char[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        char[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        char[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        char[] stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        char[] stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        char[] stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        char[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        char[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        char stackOut_16_2 = 0;
        char[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        char[] stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        char[] stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        char stackOut_25_2 = 0;
        char[] stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 < -9) {
                break L1;
              } else {
                ob.c((byte) 74);
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  if (1 != param2) {
                    break L4;
                  } else {
                    this.field_s = param1.f((byte) -93);
                    if (var7 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (-3 == (param2 ^ -1)) {
                    break L5;
                  } else {
                    L6: {
                      if (param2 == 3) {
                        break L6;
                      } else {
                        if ((param2 ^ -1) == -5) {
                          this.field_y = true;
                          if (var7 == 0) {
                            break L3;
                          } else {
                            break L6;
                          }
                        } else {
                          break L2;
                        }
                      }
                    }
                    var4_int = param1.g(31365);
                    this.field_D = new char[var4_int];
                    this.field_B = new int[var4_int];
                    var5 = 0;
                    L7: while (true) {
                      L8: {
                        if (var4_int <= var5) {
                          break L8;
                        } else {
                          this.field_B[var5] = param1.d((byte) 69);
                          var6 = param1.d(-249699580);
                          if (var7 != 0) {
                            break L3;
                          } else {
                            L9: {
                              stackOut_14_0 = this.field_D;
                              stackOut_14_1 = var5;
                              stackIn_16_0 = stackOut_14_0;
                              stackIn_16_1 = stackOut_14_1;
                              stackIn_15_0 = stackOut_14_0;
                              stackIn_15_1 = stackOut_14_1;
                              if (0 != var6) {
                                stackOut_16_0 = (char[]) ((Object) stackIn_16_0);
                                stackOut_16_1 = stackIn_16_1;
                                stackOut_16_2 = ob.a((byte) var6, -1);
                                stackIn_17_0 = stackOut_16_0;
                                stackIn_17_1 = stackOut_16_1;
                                stackIn_17_2 = stackOut_16_2;
                                break L9;
                              } else {
                                stackOut_15_0 = (char[]) ((Object) stackIn_15_0);
                                stackOut_15_1 = stackIn_15_1;
                                stackOut_15_2 = 0;
                                stackIn_17_0 = stackOut_15_0;
                                stackIn_17_1 = stackOut_15_1;
                                stackIn_17_2 = stackOut_15_2;
                                break L9;
                              }
                            }
                            stackIn_17_0[stackIn_17_1] = (char) stackIn_17_2;
                            var5++;
                            if (var7 == 0) {
                              continue L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                      if (var7 == 0) {
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                var4_int = param1.g(31365);
                this.field_r = new char[var4_int];
                this.field_x = new int[var4_int];
                var5 = 0;
                L10: while (true) {
                  if ((var4_int ^ -1) >= (var5 ^ -1)) {
                    break L3;
                  } else {
                    this.field_x[var5] = param1.d((byte) 69);
                    var6 = param1.d(-249699580);
                    if (var7 == 0) {
                      L11: {
                        stackOut_23_0 = this.field_r;
                        stackOut_23_1 = var5;
                        stackIn_25_0 = stackOut_23_0;
                        stackIn_25_1 = stackOut_23_1;
                        stackIn_24_0 = stackOut_23_0;
                        stackIn_24_1 = stackOut_23_1;
                        if ((var6 ^ -1) != -1) {
                          stackOut_25_0 = (char[]) ((Object) stackIn_25_0);
                          stackOut_25_1 = stackIn_25_1;
                          stackOut_25_2 = ob.a((byte) var6, -1);
                          stackIn_26_0 = stackOut_25_0;
                          stackIn_26_1 = stackOut_25_1;
                          stackIn_26_2 = stackOut_25_2;
                          break L11;
                        } else {
                          stackOut_24_0 = (char[]) ((Object) stackIn_24_0);
                          stackOut_24_1 = stackIn_24_1;
                          stackOut_24_2 = 0;
                          stackIn_26_0 = stackOut_24_0;
                          stackIn_26_1 = stackOut_24_1;
                          stackIn_26_2 = stackOut_24_2;
                          break L11;
                        }
                      }
                      stackIn_26_0[stackIn_26_1] = (char) stackIn_26_2;
                      var5++;
                      if (var7 == 0) {
                        continue L10;
                      } else {
                        break L3;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var4 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var4);
            stackOut_28_1 = new StringBuilder().append("ob.L(").append(param0).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L12;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L12;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param2 + ')');
        }
    }

    final void e(byte param0) {
        char discarded$16 = 0;
        char discarded$17 = 0;
        char discarded$18 = 0;
        char discarded$19 = 0;
        char discarded$20 = 0;
        char discarded$21 = 0;
        char discarded$22 = 0;
        char discarded$23 = 0;
        int var2 = 0;
        int var3 = 0;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (null != this.field_B) {
          var2 = 0;
          L0: while (true) {
            L1: {
              if (this.field_B.length <= var2) {
                if (this.field_x != null) {
                  break L1;
                } else {
                  if (param0 == -72) {
                    return;
                  } else {
                    discarded$16 = ob.a((byte) -85, -72);
                    return;
                  }
                }
              } else {
                this.field_B[var2] = cr.b(this.field_B[var2], 32768);
                var2++;
                if (var3 != 0) {
                  break L1;
                } else {
                  if (var3 == 0) {
                    continue L0;
                  } else {
                    if (this.field_x != null) {
                      var2 = 0;
                      L2: while (true) {
                        if (this.field_x.length <= var2) {
                          if (param0 == -72) {
                            return;
                          } else {
                            discarded$17 = ob.a((byte) -85, -72);
                            return;
                          }
                        } else {
                          this.field_x[var2] = cr.b(this.field_x[var2], 32768);
                          var2++;
                          if (var3 == 0) {
                            if (var3 == 0) {
                              continue L2;
                            } else {
                              if (param0 == -72) {
                                return;
                              } else {
                                discarded$18 = ob.a((byte) -85, -72);
                                return;
                              }
                            }
                          } else {
                            return;
                          }
                        }
                      }
                    } else {
                      if (param0 == -72) {
                        return;
                      } else {
                        discarded$19 = ob.a((byte) -85, -72);
                        return;
                      }
                    }
                  }
                }
              }
            }
            var2 = 0;
            L3: while (true) {
              if (this.field_x.length <= var2) {
                if (param0 == -72) {
                  return;
                } else {
                  discarded$20 = ob.a((byte) -85, -72);
                  return;
                }
              } else {
                this.field_x[var2] = cr.b(this.field_x[var2], 32768);
                var2++;
                if (var3 == 0) {
                  if (var3 == 0) {
                    continue L3;
                  } else {
                    if (param0 == -72) {
                      return;
                    } else {
                      discarded$21 = ob.a((byte) -85, -72);
                      return;
                    }
                  }
                } else {
                  return;
                }
              }
            }
          }
        } else {
          L4: {
            if (this.field_x != null) {
              var2 = 0;
              L5: while (true) {
                if (this.field_x.length > var2) {
                  this.field_x[var2] = cr.b(this.field_x[var2], 32768);
                  var2++;
                  if (var3 == 0) {
                    if (var3 == 0) {
                      continue L5;
                    } else {
                      break L4;
                    }
                  } else {
                    return;
                  }
                } else {
                  L6: {
                    if (param0 == -72) {
                      break L6;
                    } else {
                      discarded$22 = ob.a((byte) -85, -72);
                      break L6;
                    }
                  }
                  return;
                }
              }
            } else {
              break L4;
            }
          }
          if (param0 != -72) {
            discarded$23 = ob.a((byte) -85, -72);
            return;
          } else {
            return;
          }
        }
    }

    final static boolean d(byte param0) {
        String discarded$1 = null;
        long var1 = 0L;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 >= 3) {
          var1 = bl.a((byte) 55);
          var3 = -wn.field_r + var1;
          if ((var3 ^ -1L) >= -30001L) {
            L0: {
              L1: {
                var5 = 3000;
                if (-8 < (vd.field_c ^ -1)) {
                  break L1;
                } else {
                  var5 = 12000;
                  if (var6 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if ((vd.field_c ^ -1) > -6) {
                  break L2;
                } else {
                  var5 = 9000;
                  if (var6 == 0) {
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              if (vd.field_c >= 3) {
                var5 = 6000;
                break L0;
              } else {
                if (((long)var5 ^ -1L) > (var3 ^ -1L)) {
                  wn.field_r = var1;
                  vd.field_c = vd.field_c + 1;
                  return true;
                } else {
                  return false;
                }
              }
            }
            if (((long)var5 ^ -1L) > (var3 ^ -1L)) {
              wn.field_r = var1;
              vd.field_c = vd.field_c + 1;
              return true;
            } else {
              return false;
            }
          } else {
            vd.field_c = 0;
            wn.field_r = var1;
            return true;
          }
        } else {
          discarded$1 = ob.e(52);
          var1 = bl.a((byte) 55);
          var3 = -wn.field_r + var1;
          if ((var3 ^ -1L) >= -30001L) {
            var5 = 3000;
            if (-8 >= (vd.field_c ^ -1)) {
              var5 = 12000;
              if (var6 == 0) {
                if (((long)var5 ^ -1L) > (var3 ^ -1L)) {
                  wn.field_r = var1;
                  vd.field_c = vd.field_c + 1;
                  return true;
                } else {
                  return false;
                }
              } else {
                L3: {
                  if ((vd.field_c ^ -1) > -6) {
                    break L3;
                  } else {
                    var5 = 9000;
                    if (var6 != 0) {
                      break L3;
                    } else {
                      if (((long)var5 ^ -1L) > (var3 ^ -1L)) {
                        wn.field_r = var1;
                        vd.field_c = vd.field_c + 1;
                        return true;
                      } else {
                        return false;
                      }
                    }
                  }
                }
                L4: {
                  if (vd.field_c >= 3) {
                    var5 = 6000;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if (((long)var5 ^ -1L) > (var3 ^ -1L)) {
                  wn.field_r = var1;
                  vd.field_c = vd.field_c + 1;
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              if ((vd.field_c ^ -1) <= -6) {
                var5 = 9000;
                if (var6 == 0) {
                  if (((long)var5 ^ -1L) > (var3 ^ -1L)) {
                    wn.field_r = var1;
                    vd.field_c = vd.field_c + 1;
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  L5: {
                    if (vd.field_c >= 3) {
                      var5 = 6000;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if (((long)var5 ^ -1L) > (var3 ^ -1L)) {
                    wn.field_r = var1;
                    vd.field_c = vd.field_c + 1;
                    return true;
                  } else {
                    return false;
                  }
                }
              } else {
                L6: {
                  if (vd.field_c >= 3) {
                    var5 = 6000;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                if (((long)var5 ^ -1L) > (var3 ^ -1L)) {
                  wn.field_r = var1;
                  vd.field_c = vd.field_c + 1;
                  return true;
                } else {
                  return false;
                }
              }
            }
          } else {
            vd.field_c = 0;
            wn.field_r = var1;
            return true;
          }
        }
    }

    final void a(int param0, k param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              L2: {
                L3: {
                  var3_int = param1.g(31365);
                  if (0 == var3_int) {
                    break L3;
                  } else {
                    this.a(-56, param1, var3_int);
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var3_int = -23 / ((param0 - 19) / 42);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (runtimeException);
            stackOut_7_1 = new StringBuilder().append("ob.M(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final static char a(byte param0, int param1) {
        int var3 = 0;
        int var2 = param0 & 255;
        if (!(param1 != (var2 ^ -1))) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (-129 >= (var2 ^ -1)) {
            if (var2 >= 160) {
                return (char)var2;
            }
            var3 = vg.field_s[-128 + var2];
            if (!(var3 != 0)) {
                var3 = 63;
            }
            var2 = var3;
        }
        return (char)var2;
    }

    public static void c(byte param0) {
        field_A = null;
        field_C = null;
        field_t = null;
        if (param0 != -52) {
            ob.c((byte) -29);
            field_q = null;
            field_z = null;
            field_w = null;
            field_u = null;
            field_v = null;
            return;
        }
        field_q = null;
        field_z = null;
        field_w = null;
        field_u = null;
        field_v = null;
    }

    final static void a(cj param0, int param1) {
        String discarded$2 = null;
        RuntimeException runtimeException = null;
        int var3 = 0;
        cj var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var4 = (cj) ((Object) param0.field_Cb.c(87));
              if (param1 >= 30) {
                break L1;
              } else {
                discarded$2 = ob.e(34);
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  if (var4 == null) {
                    break L4;
                  } else {
                    var4.field_mb = 0;
                    var4.field_z = 0;
                    var4.field_I = 0;
                    var4.field_Q = 0;
                    var4 = (cj) ((Object) param0.field_Cb.b(6));
                    if (var3 != 0) {
                      break L3;
                    } else {
                      if (var3 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                param0.field_I = 0;
                param0.field_Q = 0;
                param0.field_z = 0;
                param0.field_mb = 0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (runtimeException);
            stackOut_9_1 = new StringBuilder().append("ob.H(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L5;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    ob() {
        this.field_y = false;
    }

    static {
        field_v = "Your rating is <%0>";
        field_z = "Please enter your age in years";
        field_u = "Teleport";
        field_t = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
        field_C = "??? points ";
        field_w = "to over <%0> great games";
        field_q = "x<%0>";
        field_A = "(Click or press 'SPACE' to close)";
    }
}
