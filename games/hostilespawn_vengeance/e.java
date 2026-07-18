/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e {
    private int field_t;
    private int field_o;
    private bd field_e;
    private bd field_h;
    private be field_u;
    private int field_b;
    private String[] field_a;
    private int field_s;
    private boolean field_j;
    private String field_n;
    static int[] field_w;
    private int field_v;
    private int field_f;
    private pg[] field_p;
    static int[] field_y;
    private bd field_i;
    static int[] field_g;
    static String field_x;
    static String field_A;
    static bd field_d;
    static fk field_q;
    static int field_z;
    static String field_k;
    static int[] field_c;
    static String field_m;
    static b field_l;
    static bd field_r;

    final int a(int param0, boolean param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_115_0 = 0;
        int stackIn_121_0 = 0;
        int stackIn_127_0 = 0;
        int stackIn_130_0 = 0;
        int stackIn_133_0 = 0;
        int stackIn_135_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_114_0 = 0;
        int stackOut_120_0 = 0;
        int stackOut_126_0 = 0;
        int stackOut_129_0 = 0;
        int stackOut_132_0 = 0;
        int stackOut_134_0 = 0;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            ((e) this).field_s = ((e) this).field_s + 65536;
            L1: while (true) {
              L2: {
                if (ui.a(65535, q.field_d, ((e) this).field_s) < 65536) {
                  break L2;
                } else {
                  ((e) this).field_v = ((e) this).field_v + 1;
                  ((e) this).field_s = ((e) this).field_s - q.field_d;
                  if (var6 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                var3_int = param0;
                if (null != ((e) this).field_p) {
                  var3_int = ((e) this).field_p.length;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (var3_int == -1) {
                  break L4;
                } else {
                  L5: {
                    if (((e) this).field_f >= q.field_h) {
                      break L5;
                    } else {
                      L6: {
                        ((e) this).field_f = ((e) this).field_f + 1;
                        if (~((e) this).field_f >= ~q.field_k) {
                          break L6;
                        } else {
                          L7: {
                            if (null == ((e) this).field_p) {
                              break L7;
                            } else {
                              if (null != ((e) this).field_p[((e) this).field_b]) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          ((e) this).field_f = ((e) this).field_f - 1;
                          if (var6 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      if (((e) this).field_f < q.field_h) {
                        break L5;
                      } else {
                        if (null == ((e) this).field_p[(1 + ((e) this).field_b) % var3_int]) {
                          ((e) this).field_f = ((e) this).field_f - 1;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  L8: {
                    if (~q.field_h >= ~((e) this).field_f) {
                      L9: {
                        ((e) this).field_o = ((e) this).field_b;
                        ((e) this).field_f = ((e) this).field_f - q.field_h;
                        if (!((e) this).field_j) {
                          break L9;
                        } else {
                          ((e) this).field_b = ((e) this).field_b + 1;
                          if (~((e) this).field_b > ~var3_int) {
                            break L8;
                          } else {
                            ((e) this).field_b = ((e) this).field_b - var3_int;
                            if (var6 == 0) {
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                      ((e) this).field_b = ((e) this).field_b - 1;
                      if (((e) this).field_b >= 0) {
                        break L8;
                      } else {
                        ((e) this).field_b = ((e) this).field_b + var3_int;
                        break L8;
                      }
                    } else {
                      break L8;
                    }
                  }
                  if (~((e) this).field_f >= ~q.field_k) {
                    break L4;
                  } else {
                    ((e) this).field_j = true;
                    break L4;
                  }
                }
              }
              L10: {
                if (jm.field_b != null) {
                  L11: {
                    var4 = 0;
                    if (pf.field_o == 0) {
                      break L11;
                    } else {
                      if (257 >= rc.field_b) {
                        break L11;
                      } else {
                        if (rc.field_b >= 290) {
                          break L11;
                        } else {
                          L12: {
                            if (ec.field_a <= 9) {
                              break L12;
                            } else {
                              if (82 <= ec.field_a) {
                                break L12;
                              } else {
                                ((e) this).field_f = q.field_h;
                                var4 = 1;
                                ((e) this).field_j = false;
                                break L12;
                              }
                            }
                          }
                          if (558 >= ec.field_a) {
                            break L11;
                          } else {
                            if (ec.field_a < 631) {
                              var4 = 1;
                              ((e) this).field_f = q.field_h;
                              ((e) this).field_j = true;
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                        }
                      }
                    }
                  }
                  if (var4 != 0) {
                    break L10;
                  } else {
                    if (~q.field_k <= ~((e) this).field_f) {
                      break L10;
                    } else {
                      if (rc.field_b <= 257) {
                        break L10;
                      } else {
                        if (rc.field_b >= 290) {
                          break L10;
                        } else {
                          L13: {
                            if (j.field_c <= 9) {
                              break L13;
                            } else {
                              if (j.field_c < 82) {
                                ((e) this).field_f = q.field_k;
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                          }
                          if (j.field_c <= 558) {
                            break L10;
                          } else {
                            if (631 > j.field_c) {
                              ((e) this).field_f = q.field_k;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  break L10;
                }
              }
              L14: {
                if (param1) {
                  L15: {
                    ((e) this).field_u.a((byte) -127, this.a(j.field_c, rb.field_m, -1300), this.a(ec.field_a, rc.field_b, -1300));
                    var4 = 0;
                    if (!((e) this).field_u.b(0)) {
                      break L15;
                    } else {
                      L16: {
                        if (0 == ((e) this).field_u.field_f) {
                          var4 = 1;
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                      if (((e) this).field_u.field_f == 1) {
                        stackOut_114_0 = 2;
                        stackIn_115_0 = stackOut_114_0;
                        return stackIn_115_0;
                      } else {
                        break L15;
                      }
                    }
                  }
                  L17: {
                    L18: {
                      if (!o.field_e) {
                        break L18;
                      } else {
                        L19: while (true) {
                          if (!jn.e((byte) -100)) {
                            break L18;
                          } else {
                            var5 = this.a(true);
                            stackOut_120_0 = -1;
                            stackIn_130_0 = stackOut_120_0;
                            stackIn_121_0 = stackOut_120_0;
                            if (var6 != 0) {
                              break L17;
                            } else {
                              if (stackIn_121_0 != ~var5) {
                                stackOut_126_0 = var5;
                                stackIn_127_0 = stackOut_126_0;
                                return stackIn_127_0;
                              } else {
                                if (var6 == 0) {
                                  continue L19;
                                } else {
                                  break L18;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_129_0 = var4;
                    stackIn_130_0 = stackOut_129_0;
                    break L17;
                  }
                  if (stackIn_130_0 != 0) {
                    this.b((byte) -36);
                    stackOut_132_0 = 3;
                    stackIn_133_0 = stackOut_132_0;
                    return stackIn_133_0;
                  } else {
                    break L14;
                  }
                } else {
                  break L14;
                }
              }
              stackOut_134_0 = 0;
              stackIn_135_0 = stackOut_134_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var3, "e.L(" + param0 + ',' + param1 + ')');
        }
        return stackIn_135_0;
    }

    private final int a(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_10_0 = 0;
        try {
          L0: {
            L1: {
              ((e) this).field_u.c(0);
              if (!((e) this).field_u.b(0)) {
                break L1;
              } else {
                if (0 != ((e) this).field_u.field_f) {
                  if (((e) this).field_u.field_f != 1) {
                    break L1;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0;
                  }
                } else {
                  this.b((byte) -36);
                  stackOut_4_0 = 3;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0;
                }
              }
            }
            if (pj.field_e != 13) {
              if (param0) {
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                stackOut_13_0 = -53;
                stackIn_14_0 = stackOut_13_0;
                return stackIn_14_0;
              }
            } else {
              stackOut_10_0 = 1;
              stackIn_11_0 = stackOut_10_0;
              return stackIn_11_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2, "e.G(" + param0 + ')');
        }
        return stackIn_16_0;
    }

    public static void b(int param0) {
        try {
            field_q = null;
            field_g = null;
            field_y = null;
            int var1_int = -97 % ((68 - param0) / 55);
            field_x = null;
            field_d = null;
            field_w = null;
            field_A = null;
            field_c = null;
            field_m = null;
            field_k = null;
            field_l = null;
            field_r = null;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "e.E(" + param0 + ')');
        }
    }

    private final void a(int param0, int[] param1, int param2, String param3, int param4, int param5, vm param6, int param7) {
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var12 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              pf.b(511);
              if (param4 == 1) {
                break L1;
              } else {
                int discarded$4 = this.a(false);
                break L1;
              }
            }
            var9_int = param2;
            L2: while (true) {
              L3: {
                L4: {
                  if (var9_int >= param5) {
                    break L4;
                  } else {
                    si.d(param0, var9_int, param7, var9_int + 1);
                    var10 = var9_int * param1.length / param5;
                    var11 = param1[-1 + (param1.length - var10)];
                    int discarded$5 = param6.a(param3, param0, param2, param7, param5, var11, -1, 1, 1, 0);
                    var9_int++;
                    if (var12 != 0) {
                      break L3;
                    } else {
                      if (var12 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                eh.b(false);
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var9 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var9;
            stackOut_12_1 = new StringBuilder().append("e.K(").append(param0).append(',');
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param2).append(',');
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L6;
            }
          }
          L7: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param6 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L7;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param7 + ')');
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Throwable var2_ref = null;
            RuntimeException var2_ref2 = null;
            String var3 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            String stackIn_11_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var2 = param1.getCodeBase();
                      var3 = nj.a(param1, true, var2).getFile();
                      Object discarded$6 = a.a(param1, new Object[2], "updatelinks", -13730);
                      Object discarded$7 = a.a(param1, new Object[2], "updatelinks", param0 ^ -28622);
                      Object discarded$8 = a.a(param1, new Object[2], "updatelinks", -13730);
                      Object discarded$9 = a.a(param1, new Object[2], "updatelinks", -13730);
                      if (param0 == 23148) {
                        break L2;
                      } else {
                        field_z = 29;
                        break L2;
                      }
                    }
                    Object discarded$10 = a.a(param1, new Object[2], "updatelinks", -13730);
                    Object discarded$11 = a.a(param1, new Object[2], "updatelinks", param0 + -36878);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2_ref = decompiledCaughtException;
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_7_0 = (RuntimeException) var2_ref2;
                stackOut_7_1 = new StringBuilder().append("e.B(").append(param0).append(',');
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
                  break L4;
                } else {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "{...}";
                  stackIn_11_0 = stackOut_8_0;
                  stackIn_11_1 = stackOut_8_1;
                  stackIn_11_2 = stackOut_8_2;
                  break L4;
                }
              }
              throw wg.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void c(int param0) {
        RuntimeException var2 = null;
        pg var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (((e) this).field_p != null) {
              L1: {
                L2: {
                  var2_ref = ((e) this).field_p[((e) this).field_b];
                  if (null != var2_ref) {
                    break L2;
                  } else {
                    if (mn.field_e == null) {
                      break L1;
                    } else {
                      int discarded$2 = mn.field_e.a(l.field_e, 9, 58, 622, 196, 16754688, -1, 1, 1, 0);
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                var2_ref.a(9, 58);
                break L1;
              }
              if (param0 == 9) {
                L3: {
                  if (q.field_k > ((e) this).field_f) {
                    var2_ref = ((e) this).field_p[((e) this).field_o];
                    if (var2_ref != null) {
                      L4: {
                        var3 = ((e) this).field_f * (var2_ref.field_i - -60) / q.field_k;
                        var4 = var3 - 30;
                        if (!((e) this).field_j) {
                          break L4;
                        } else {
                          la.a(var4 * -256 / 30, 126, var2_ref, 9, 256 * (-var4 + var2_ref.field_i) / 30, 58);
                          if (var5 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      la.a(256 * (-var4 + var2_ref.field_i) / 30, param0 + 108, var2_ref, 9, var4 * -256 / 30, 58);
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                break L0;
              } else {
                return;
              }
            } else {
              L5: {
                if (mn.field_e == null) {
                  break L5;
                } else {
                  int discarded$3 = mn.field_e.a(l.field_e, 9, 58, 622, 196, 16754688, -1, 1, 1, 0);
                  break L5;
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2, "e.C(" + param0 + ')');
        }
    }

    private final int a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_33_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (null != im.field_g) {
              L1: {
                if (param0 < 508) {
                  break L1;
                } else {
                  if (param0 >= 635) {
                    break L1;
                  } else {
                    if (param1 < 299) {
                      break L1;
                    } else {
                      if (386 <= param1) {
                        break L1;
                      } else {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        return stackIn_14_0;
                      }
                    }
                  }
                }
              }
              if (param2 == -1300) {
                L2: {
                  if (param0 < 508) {
                    break L2;
                  } else {
                    if (635 <= param0) {
                      break L2;
                    } else {
                      if (param1 < 390) {
                        break L2;
                      } else {
                        if (param1 < 475) {
                          stackOut_30_0 = 1;
                          stackIn_31_0 = stackOut_30_0;
                          return stackIn_31_0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                stackOut_32_0 = -1;
                stackIn_33_0 = stackOut_32_0;
                break L0;
              } else {
                stackOut_16_0 = -46;
                stackIn_17_0 = stackOut_16_0;
                return stackIn_17_0;
              }
            } else {
              stackOut_1_0 = -1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var4, "e.J(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_33_0;
    }

    private final void a(int param0, int param1, int[] param2, vm param3, int param4, String param5, float param6, int param7, bd param8, int param9) {
        int var11_int = 0;
        RuntimeException var11 = null;
        int var12 = 0;
        bd var13 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            var11_int = (int)((float)param9 / param6);
            var12 = (int)((float)param1 / param6);
            var13 = new bd(var11_int, var12);
            sb.a(var13, param4 + -120);
            param8.a((int)((float)(-param7) / param6), (int)((float)(-param0) / param6), (int)((float)param8.field_z / param6), (int)((float)param8.field_A / param6));
            this.a(param4, param2, 0, param5, 1, var12, param3, var11_int);
            eh.b(false);
            sb.a(param8, -128);
            var13.c(param7, param0, param9, param1);
            eh.b(false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var11 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var11;
            stackOut_2_1 = new StringBuilder().append("e.F(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
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
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param4).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param5 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param8 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L4;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param9 + ')');
        }
    }

    private final void b(byte param0) {
        Exception var2 = null;
        RuntimeException var2_ref = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  if (param0 == -36) {
                    break L2;
                  } else {
                    this.a(-82, (int[]) null, -17, (String) null, -50, 44, (vm) null, 100);
                    break L2;
                  }
                }
                HostileSpawn.a(bn.c(param0 ^ 35), -53);
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L3: {
                var2 = (Exception) (Object) decompiledCaughtException;
                var2.printStackTrace();
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2_ref, "e.D(" + param0 + ')');
        }
    }

    private final void a(pg[] param0, String param1, String[] param2, java.applet.Applet param3, int param4, boolean param5) {
        RuntimeException runtimeException = null;
        String var7 = null;
        int var8 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  var7 = param3.getParameter("currency");
                  if (var7 == null) {
                    break L3;
                  } else {
                    if (sf.a((byte) 90, (CharSequence) (Object) var7)) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                ((e) this).field_t = 2;
                if (!HostileSpawn.field_I) {
                  break L1;
                } else {
                  break L2;
                }
              }
              ((e) this).field_t = hi.a(87, (CharSequence) (Object) var7);
              break L1;
            }
            L4: {
              ((e) this).field_n = param1;
              ((e) this).field_u = new be(2);
              ((e) this).field_p = param0;
              var8 = 22 % ((28 - param4) / 47);
              ((e) this).field_a = param2;
              if (((e) this).field_p == null) {
                break L4;
              } else {
                if (((e) this).field_p.length >= 3) {
                  o.field_e = param5;
                  break L0;
                } else {
                  break L4;
                }
              }
            }
            throw new IllegalArgumentException("");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) runtimeException;
            stackOut_17_1 = new StringBuilder().append("e.I(");
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L5;
            }
          }
          L6: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L6;
            }
          }
          L7: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L7;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L7;
            }
          }
          L8: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');
            stackIn_32_0 = stackOut_29_0;
            stackIn_32_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param3 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L8;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_33_0 = stackOut_30_0;
              stackIn_33_1 = stackOut_30_1;
              stackIn_33_2 = stackOut_30_2;
              break L8;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(byte param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((e) this).field_s = 0;
              ((e) this).field_b = 0;
              ((e) this).field_f = q.field_k;
              ((e) this).field_v = 0;
              if (param0 <= -37) {
                break L1;
              } else {
                e.a(103, (java.applet.Applet) null);
                break L1;
              }
            }
            ((e) this).field_u.a(param1, 0, this.a(j.field_c, rb.field_m, -1300), -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var3, "e.A(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int[] var4 = null;
        bd var5 = null;
        String var6 = null;
        String var7 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != ((e) this).field_i) {
                break L1;
              } else {
                if (ra.field_e == null) {
                  break L1;
                } else {
                  ((e) this).field_i = new bd(622, 47);
                  sb.a(((e) this).field_i, -119);
                  si.c(0, 0, 622, 47, 4540749, 65793);
                  var2_int = 16448250;
                  var3 = 10068666;
                  var4 = wg.a(true, var2_int, var3);
                  this.a(0, var4, 0, ((e) this).field_n, 1, 47, (vm) (Object) ra.field_e, 622);
                  eh.b(false);
                  ((e) this).field_e = new bd(475, 24);
                  this.a(-4, 24, var4, (vm) (Object) ra.field_e, 0, eb.field_f, 0.75f, 0, ((e) this).field_e, 475);
                  var4 = wg.a(true, 526344, 526344);
                  var5 = new bd(121, 122);
                  sb.a(var5, -121);
                  si.c(0, 0, var5.field_z, var5.field_A / 2, 16180917, 16306250);
                  si.c(0, var5.field_A / 2, var5.field_z, var5.field_A, 16306250, 15568919);
                  var6 = ue.field_b;
                  var7 = sg.field_m;
                  this.a(-16, var5.field_A, var4, (vm) (Object) ra.field_e, 0, var6, 0.5f, param0, var5, var5.field_z);
                  this.a(20, var5.field_A, var4, (vm) (Object) ra.field_e, param0, var7, 0.5f, 0, var5, var5.field_z);
                  this.a(var5.field_A / 2 + -ra.field_e.field_y - -12, var5.field_A / 3, var4, (vm) (Object) ra.field_e, 0, lk.field_E[((e) this).field_t], 0.699999988079071f, 0, var5, var5.field_z);
                  eh.b(false);
                  ((e) this).field_h = new bd(121, 122);
                  sb.a(((e) this).field_h, -126);
                  var5.b(((e) this).field_h.field_z / 2, ((e) this).field_h.field_A / 2, -2048, 4096);
                  eh.b(false);
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2, "e.H(" + param0 + ')');
        }
    }

    final void a(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              si.c(9, 9, 622, 47, 4540749, 65793);
              if (param0 == -67) {
                break L1;
              } else {
                ((e) this).a((byte) 85);
                break L1;
              }
            }
            si.c(9, 257, 622, 33, 2585);
            si.c(9, 265, 622, 11, 2585, 1515566);
            var2_int = 0;
            var3 = 14;
            L2: while (true) {
              L3: {
                L4: {
                  if (var2_int >= 4) {
                    break L4;
                  } else {
                    si.c(var3, 331, 117, 90, 460551, 3881787);
                    var3 += 121;
                    var2_int++;
                    if (var4 != 0) {
                      break L3;
                    } else {
                      if (var4 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var2_int = 0;
                break L3;
              }
              var3 = 299;
              L5: while (true) {
                L6: {
                  L7: {
                    if (var2_int >= 2) {
                      break L7;
                    } else {
                      si.c(508, var3, 127, 42, 1130115, 3365268);
                      si.c(508, var3 - -42, 127, 42, 12410);
                      var3 += 91;
                      var2_int++;
                      if (var4 != 0) {
                        break L6;
                      } else {
                        if (var4 == 0) {
                          continue L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  this.c(9);
                  break L6;
                }
                L8: {
                  if (null == jk.field_c) {
                    break L8;
                  } else {
                    if (!jk.field_c.a(-15879)) {
                      break L8;
                    } else {
                      if (!jk.field_c.a(-8088, "members_expansion_screen")) {
                        break L8;
                      } else {
                        if (!jk.field_c.a(-8088, "arialish12")) {
                          break L8;
                        } else {
                          if (!jk.field_c.a(-8088, "pump32")) {
                            break L8;
                          } else {
                            if (cl.field_i == null) {
                              break L8;
                            } else {
                              if (!cl.field_i.a(-15879)) {
                                break L8;
                              } else {
                                if (!cl.field_i.a(-8088, "arialish12")) {
                                  break L8;
                                } else {
                                  if (cl.field_i.a(param0 ^ 8149, "pump32")) {
                                    im.field_g = qm.a("members_expansion_screen", param0 + 67, "frame", jk.field_c);
                                    jm.field_b = ci.a("members_expansion_screen", param0 + 181, "arrow", jk.field_c);
                                    mn.field_e = wc.a("arialish12", cl.field_i, 84, jk.field_c, "");
                                    ra.field_e = th.a(jk.field_c, 126, "", cl.field_i, "pump32");
                                    ue.field_j = fg.a("members_expansion_screen", "benefit_orbs", jk.field_c, false);
                                    od.field_D = fg.a("members_expansion_screen", "button_text", jk.field_c, false);
                                    vj.field_h = ei.a(jk.field_c, param0 ^ -49, "members_expansion_screen", "button_highlights");
                                    cl.field_i = null;
                                    jk.field_c = null;
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                this.a(param0 + 67);
                if (im.field_g != null) {
                  L9: {
                    ((e) this).field_h.e(376, 339);
                    ((e) this).field_i.e(9, 9);
                    im.field_g.a(0, 0);
                    if (null != jm.field_b) {
                      jm.field_b.e(9, 257);
                      jm.field_b.d(558, 257);
                      if (rb.field_m <= 257) {
                        break L9;
                      } else {
                        if (rb.field_m < 290) {
                          var2_int = 40 + (40 * la.a(((e) this).field_v << 1393050628, false) >> -1872940368);
                          if (var2_int > 0) {
                            L10: {
                              if (j.field_c <= 9) {
                                break L10;
                              } else {
                                if (82 <= j.field_c) {
                                  break L10;
                                } else {
                                  jm.field_b.c(8, 256, var2_int);
                                  jm.field_b.c(10, 256, var2_int);
                                  jm.field_b.c(8, 258, var2_int);
                                  jm.field_b.c(10, 258, var2_int);
                                  if (var4 == 0) {
                                    break L9;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                            }
                            if (j.field_c <= 558) {
                              break L9;
                            } else {
                              if (j.field_c < 631) {
                                jm.field_b.g();
                                jm.field_b.c(557, 256, var2_int);
                                jm.field_b.c(559, 256, var2_int);
                                jm.field_b.c(557, 258, var2_int);
                                jm.field_b.c(559, 258, var2_int);
                                jm.field_b.g();
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                          } else {
                            break L9;
                          }
                        } else {
                          break L9;
                        }
                      }
                    } else {
                      break L9;
                    }
                  }
                  L11: {
                    L12: {
                      ((e) this).field_e.e(16, 302);
                      int discarded$4 = mn.field_e.a(((e) this).field_a[((e) this).field_b], 9, 257, 622, 33, 16754688, -1, 1, 1, 0);
                      ue.field_j.e(30, 330);
                      int discarded$5 = mn.field_e.a(mm.field_n[0], 17, 428, 111, 35, 16754688, -1, 1, 1, 0);
                      int discarded$6 = mn.field_e.a(mm.field_n[1], 138, 428, 111, 35, 16754688, -1, 1, 1, 0);
                      int discarded$7 = mn.field_e.a(mm.field_n[2], 259, 428, 111, 35, 16754688, -1, 1, 1, 0);
                      od.field_D.e((127 - od.field_D.field_u) / 2 + 508, 315);
                      if (((e) this).field_u.field_f != 0) {
                        break L12;
                      } else {
                        vj.field_h[0].e(508, 299);
                        if (var4 == 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    if (((e) this).field_u.field_f == 1) {
                      vj.field_h[1].e(508, 387);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  break L0;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2, "e.M(" + param0 + ')');
        }
    }

    e(java.applet.Applet param0, String param1, pg[] param2, String[] param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
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
        ((e) this).field_j = true;
        ((e) this).field_s = 0;
        ((e) this).field_v = 0;
        try {
          L0: {
            this.a(param2, param1, param3, param0, -82, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("e.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
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
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
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
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L3;
            }
          }
          L4: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
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
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L4;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0_int = 0;
        int[] var0 = null;
        int[] var1 = null;
        int var2 = 0;
        field_w = nf.a(false);
        field_y = nf.a(false);
        field_g = nf.a(false);
        var0_int = 18;
        L0: while (true) {
          if (var0_int >= 42) {
            var0 = field_y;
            var0[0] = ll.a(var0[0], 131072);
            var0 = field_y;
            var0[0] = ll.a(var0[0], 1073741824);
            var0 = field_y;
            var0[1] = ll.a(var0[1], 1);
            var0 = field_g;
            var0[0] = ll.a(var0[0], 262144);
            var0 = field_g;
            var0[0] = ll.a(var0[0], 2097152);
            var0 = field_g;
            var0[0] = ll.a(var0[0], 4194304);
            var0 = field_g;
            var0[0] = ll.a(var0[0], 8388608);
            var0 = field_g;
            var0[0] = ll.a(var0[0], 16777216);
            var0 = field_g;
            var0[0] = ll.a(var0[0], 33554432);
            var0 = field_g;
            var0[0] = ll.a(var0[0], 67108864);
            var0 = field_g;
            var0[0] = ll.a(var0[0], 134217728);
            var0 = field_g;
            var0[0] = ll.a(var0[0], 268435456);
            var0 = field_g;
            var0[0] = ll.a(var0[0], 536870912);
            var0 = field_g;
            var0[0] = ll.a(var0[0], -2147483648);
            field_x = "Create your own free Jagex account";
            field_A = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
            field_z = 0;
            field_q = new fk();
            field_m = "Check the shuttle bays for a way off the station.";
            field_c = new int[]{41, 327, 41};
            field_k = "These reactor detonations are destabilising the level. I'd better not blow up any more.";
            field_l = null;
            return;
          } else {
            var1 = field_w;
            var2 = var0_int;
            var1[var2 >> 2025952549] = ll.a(var1[var2 >> 2025952549], 1 << ua.a(var2, 31));
            var0_int++;
            continue L0;
          }
        }
    }
}
