/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ef extends uh {
    private int field_j;
    static String field_l;
    private long[] field_g;
    static String field_o;
    private long field_h;
    private long field_i;
    private long field_p;
    private int field_m;
    static oh field_k;
    static boolean field_n;

    final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = TetraLink.field_J;
        if (en.field_K < 0) {
          return;
        } else {
          L0: {
            var3 = -135 + param0;
            var4 = -35 + param1;
            var5 = 256;
            if (en.field_K >= 75) {
              break L0;
            } else {
              var5 = (en.field_K << 8) / 75;
              break L0;
            }
          }
          L1: {
            if (en.field_K <= 200) {
              break L1;
            } else {
              var5 = (-en.field_K + 250 << 8) / 50;
              break L1;
            }
          }
          L2: {
            sk.a((byte) 115, cl.field_d);
            vn.b();
            ra.a();
            ni.a((byte) 71);
            if (var5 < 256) {
              ra.d(0, 0, ra.field_f, ra.field_e, 0, -var5 + 256);
              break L2;
            } else {
              break L2;
            }
          }
          var6 = 11;
          dh.a(-581);
          if (en.field_K < 150) {
            cl.field_d.d(var3, var4);
            var7 = -125 + en.field_K;
            if (0 < var7) {
              if (var7 < 50) {
                if (var7 >= 20) {
                  if (var7 >= 30) {
                    L3: {
                      var8 = (12800 - var7 * 256) / 20;
                      oi.field_e.b(var3, var4, var8);
                      var7 = en.field_K - 140;
                      if (var7 <= 0) {
                        break L3;
                      } else {
                        L4: {
                          var8 = 256;
                          if (var7 < 20) {
                            var8 = 256 * var7 / 20;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        h.field_c.a(var3 - -15, var4 - -10, var8 * var5 >> 8);
                        break L3;
                      }
                    }
                    return;
                  } else {
                    L5: {
                      oi.field_e.b(var3, var4, 256);
                      var7 = en.field_K - 140;
                      if (var7 <= 0) {
                        break L5;
                      } else {
                        L6: {
                          var8 = 256;
                          if (var7 < 20) {
                            var8 = 256 * var7 / 20;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        h.field_c.a(var3 - -15, var4 - -10, var8 * var5 >> 8);
                        break L5;
                      }
                    }
                    return;
                  }
                } else {
                  L7: {
                    var8 = var7 * 256 / 20;
                    oi.field_e.b(var3, var4, var8);
                    var7 = en.field_K - 140;
                    if (var7 <= 0) {
                      break L7;
                    } else {
                      L8: {
                        var8 = 256;
                        if (var7 < 20) {
                          var8 = 256 * var7 / 20;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      h.field_c.a(var3 - -15, var4 - -10, var8 * var5 >> 8);
                      break L7;
                    }
                  }
                  return;
                }
              } else {
                L9: {
                  var7 = en.field_K - 140;
                  if (var7 <= 0) {
                    break L9;
                  } else {
                    L10: {
                      var8 = 256;
                      if (var7 < 20) {
                        var8 = 256 * var7 / 20;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    h.field_c.a(var3 - -15, var4 - -10, var8 * var5 >> 8);
                    break L9;
                  }
                }
                return;
              }
            } else {
              L11: {
                var7 = en.field_K - 140;
                if (var7 <= 0) {
                  break L11;
                } else {
                  L12: {
                    var8 = 256;
                    if (var7 < 20) {
                      var8 = 256 * var7 / 20;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  h.field_c.a(var3 - -15, var4 - -10, var8 * var5 >> 8);
                  break L11;
                }
              }
              return;
            }
          } else {
            a.field_c.a(var3 - -15, var4 - -10, var5);
            var7 = -125 + en.field_K;
            if (0 < var7) {
              if (var7 < 50) {
                if (var7 >= 20) {
                  if (var7 >= 30) {
                    L13: {
                      var8 = (12800 - var7 * 256) / 20;
                      oi.field_e.b(var3, var4, var8);
                      var7 = en.field_K - 140;
                      if (var7 <= 0) {
                        break L13;
                      } else {
                        L14: {
                          var8 = 256;
                          if (var7 < 20) {
                            var8 = 256 * var7 / 20;
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        h.field_c.a(var3 - -15, var4 - -10, var8 * var5 >> 8);
                        break L13;
                      }
                    }
                    return;
                  } else {
                    L15: {
                      oi.field_e.b(var3, var4, 256);
                      var7 = en.field_K - 140;
                      if (var7 <= 0) {
                        break L15;
                      } else {
                        L16: {
                          var8 = 256;
                          if (var7 < 20) {
                            var8 = 256 * var7 / 20;
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                        h.field_c.a(var3 - -15, var4 - -10, var8 * var5 >> 8);
                        break L15;
                      }
                    }
                    return;
                  }
                } else {
                  L17: {
                    var8 = var7 * 256 / 20;
                    oi.field_e.b(var3, var4, var8);
                    var7 = en.field_K - 140;
                    if (var7 <= 0) {
                      break L17;
                    } else {
                      L18: {
                        var8 = 256;
                        if (var7 < 20) {
                          var8 = 256 * var7 / 20;
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                      h.field_c.a(var3 - -15, var4 - -10, var8 * var5 >> 8);
                      break L17;
                    }
                  }
                  return;
                }
              } else {
                L19: {
                  var7 = en.field_K - 140;
                  if (var7 <= 0) {
                    break L19;
                  } else {
                    L20: {
                      var8 = 256;
                      if (var7 < 20) {
                        var8 = 256 * var7 / 20;
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                    h.field_c.a(var3 - -15, var4 - -10, var8 * var5 >> 8);
                    break L19;
                  }
                }
                return;
              }
            } else {
              L21: {
                var7 = en.field_K - 140;
                if (var7 <= 0) {
                  break L21;
                } else {
                  L22: {
                    var8 = 256;
                    if (var7 < 20) {
                      var8 = 256 * var7 / 20;
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                  h.field_c.a(var3 - -15, var4 - -10, var8 * var5 >> 8);
                  break L21;
                }
              }
              return;
            }
          }
        }
    }

    final static String a(byte param0, String param1, int param2) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        String stackIn_11_0 = null;
        String stackIn_14_0 = null;
        String stackIn_18_0 = null;
        String stackIn_22_0 = null;
        String stackIn_25_0 = null;
        String stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_17_0 = null;
        String stackOut_21_0 = null;
        String stackOut_28_0 = null;
        String stackOut_24_0 = null;
        String stackOut_13_0 = null;
        String stackOut_10_0 = null;
        Object stackOut_7_0 = null;
        String stackOut_4_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        try {
          L0: {
            if (3 != param2) {
              if (param2 != 6) {
                if (param0 >= 54) {
                  if (param2 != 7) {
                    if (8 != param2) {
                      if (param2 == 9) {
                        stackOut_17_0 = p.field_c;
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0;
                      } else {
                        if (param2 == 10) {
                          stackOut_21_0 = gd.field_ec;
                          stackIn_22_0 = stackOut_21_0;
                          return stackIn_22_0;
                        } else {
                          if (11 != param2) {
                            if (param2 == 14) {
                              stackOut_28_0 = sk.a(new String[1], bk.field_l, 127);
                              stackIn_29_0 = stackOut_28_0;
                              break L0;
                            } else {
                              return null;
                            }
                          } else {
                            stackOut_24_0 = lf.field_a;
                            stackIn_25_0 = stackOut_24_0;
                            return stackIn_25_0;
                          }
                        }
                      }
                    } else {
                      stackOut_13_0 = fl.field_h;
                      stackIn_14_0 = stackOut_13_0;
                      return stackIn_14_0;
                    }
                  } else {
                    stackOut_10_0 = na.field_q;
                    stackIn_11_0 = stackOut_10_0;
                    return stackIn_11_0;
                  }
                } else {
                  stackOut_7_0 = null;
                  stackIn_8_0 = stackOut_7_0;
                  return (String) (Object) stackIn_8_0;
                }
              } else {
                stackOut_4_0 = al.field_l;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = le.field_Lb;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var3;
            stackOut_31_1 = new StringBuilder().append("ef.K(").append(param0).append(44);
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L1;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L1;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 44 + param2 + 41);
        }
        return stackIn_29_0;
    }

    final int a(long param0, byte param1) {
        int var4 = 0;
        int var5 = 0;
        var5 = TetraLink.field_J;
        if (param1 == 52) {
          if (~((ef) this).field_i >= ~((ef) this).field_p) {
            var4 = 0;
            L0: while (true) {
              L1: {
                var4++;
                ((ef) this).field_i = ((ef) this).field_i + param0;
                if (var4 >= 10) {
                  break L1;
                } else {
                  if (~((ef) this).field_i > ~((ef) this).field_p) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
              if (((ef) this).field_p > ((ef) this).field_i) {
                ((ef) this).field_i = ((ef) this).field_p;
                return var4;
              } else {
                return var4;
              }
            }
          } else {
            ((ef) this).field_h = ((ef) this).field_h + (((ef) this).field_i - ((ef) this).field_p);
            ((ef) this).field_p = ((ef) this).field_p + (-((ef) this).field_p + ((ef) this).field_i);
            ((ef) this).field_i = ((ef) this).field_i + param0;
            return 1;
          }
        } else {
          return -121;
        }
    }

    final long b(byte param0) {
        ((ef) this).field_p = ((ef) this).field_p + this.a(true);
        if (param0 >= -13) {
            ((ef) this).field_m = 57;
            if (!(((ef) this).field_p >= ((ef) this).field_i)) {
                return (((ef) this).field_i + -((ef) this).field_p) / 1000000L;
            }
            return 0L;
        }
        if (!(((ef) this).field_p >= ((ef) this).field_i)) {
            return (((ef) this).field_i + -((ef) this).field_p) / 1000000L;
        }
        return 0L;
    }

    private final long a(boolean param0) {
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        int var8 = 0;
        int var9 = 0;
        var9 = TetraLink.field_J;
        var2 = System.nanoTime();
        var4 = -((ef) this).field_h + var2;
        ((ef) this).field_h = var2;
        if (-5000000000L < var4) {
          if (5000000000L > var4) {
            ((ef) this).field_g[((ef) this).field_j] = var4;
            ((ef) this).field_j = (1 + ((ef) this).field_j) % 10;
            if (((ef) this).field_m < 1) {
              ((ef) this).field_m = ((ef) this).field_m + 1;
              var6 = 0L;
              var8 = 1;
              L0: while (true) {
                if (((ef) this).field_m < var8) {
                  return var6 / (long)((ef) this).field_m;
                } else {
                  var6 = var6 + ((ef) this).field_g[(10 + ((ef) this).field_j - var8) % 10];
                  var8++;
                  continue L0;
                }
              }
            } else {
              var6 = 0L;
              var8 = 1;
              L1: while (true) {
                if (((ef) this).field_m < var8) {
                  return var6 / (long)((ef) this).field_m;
                } else {
                  var6 = var6 + ((ef) this).field_g[(10 + ((ef) this).field_j - var8) % 10];
                  var8++;
                  continue L1;
                }
              }
            }
          } else {
            var6 = 0L;
            var8 = 1;
            L2: while (true) {
              if (((ef) this).field_m < var8) {
                return var6 / (long)((ef) this).field_m;
              } else {
                var6 = var6 + ((ef) this).field_g[(10 + ((ef) this).field_j - var8) % 10];
                var8++;
                continue L2;
              }
            }
          }
        } else {
          var6 = 0L;
          var8 = 1;
          L3: while (true) {
            if (((ef) this).field_m < var8) {
              return var6 / (long)((ef) this).field_m;
            } else {
              var6 = var6 + ((ef) this).field_g[(10 + ((ef) this).field_j - var8) % 10];
              var8++;
              continue L3;
            }
          }
        }
    }

    final void a(int param0) {
        if (param0 > 87) {
          ((ef) this).field_h = 0L;
          if (~((ef) this).field_i < ~((ef) this).field_p) {
            ((ef) this).field_p = ((ef) this).field_p + (-((ef) this).field_p + ((ef) this).field_i);
            return;
          } else {
            return;
          }
        } else {
          ((ef) this).field_h = 0L;
          if (~((ef) this).field_i >= ~((ef) this).field_p) {
            return;
          } else {
            ((ef) this).field_p = ((ef) this).field_p + (-((ef) this).field_p + ((ef) this).field_i);
            return;
          }
        }
    }

    public static void c(int param0) {
        field_l = null;
        field_o = null;
        field_k = null;
    }

    ef() {
        ((ef) this).field_j = 0;
        ((ef) this).field_g = new long[10];
        ((ef) this).field_h = 0L;
        ((ef) this).field_m = 1;
        ((ef) this).field_i = 0L;
        ((ef) this).field_p = 0L;
        ((ef) this).field_p = System.nanoTime();
        ((ef) this).field_i = System.nanoTime();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "<%0>'s turn (<%1>)";
        field_l = "<%0>'s turn";
    }
}
