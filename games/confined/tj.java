/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj extends tk {
    private pc field_o;
    static String field_E;
    private int field_u;
    private byte[] field_B;
    static al field_n;
    private byte[] field_p;
    private rl field_y;
    private vh field_i;
    private int field_x;
    private ae field_v;
    private ae field_s;
    static int[] field_z;
    static int[][] field_l;
    static String field_F;
    private int field_D;
    static int[] field_A;
    private we field_h;
    private jf field_q;
    private boolean field_m;
    private mn field_r;
    private int field_j;
    private boolean field_k;
    private mn field_C;
    private long field_t;
    private boolean field_w;

    final int a(int param0, boolean param1) {
        rl var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              var3 = (rl) (Object) ((tj) this).field_i.a(1, (long)param0);
              if (param1) {
                break L1;
              } else {
                tj.a(17, (String) null, (String) null);
                break L1;
              }
            }
            if (null == var3) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = var3.f((byte) 100);
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var3_ref, "tj.J(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final static void a(int param0, String param1, String param2) {
        RuntimeException var3 = null;
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
        RuntimeException decompiledCaughtException = null;
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
        try {
          L0: {
            if (param0 == -1) {
              L1: {
                if (null == ki.field_c) {
                  break L1;
                } else {
                  ki.field_c.n(10);
                  break L1;
                }
              }
              om.field_p = new w(param1, param2, false, true, true);
              dn.field_b.a((fj) (Object) om.field_p, (byte) -72);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("tj.I(").append(param0).append(',');
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
          throw sd.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    private final rl a(int param0, int param1, int param2) {
        Object var4 = null;
        byte[] var5 = null;
        RuntimeException var6 = null;
        Exception var6_ref = null;
        int var6_int = 0;
        byte[] var7_ref_byte__ = null;
        int var7 = 0;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        Object stackIn_27_0 = null;
        Object stackIn_54_0 = null;
        Object stackIn_60_0 = null;
        byte stackIn_83_0 = 0;
        byte stackIn_83_1 = 0;
        Object stackIn_99_0 = null;
        int stackIn_104_0 = 0;
        int stackIn_104_1 = 0;
        Object stackIn_112_0 = null;
        byte stackIn_132_0 = 0;
        byte stackIn_132_1 = 0;
        int stackIn_139_0 = 0;
        int stackIn_139_1 = 0;
        Object stackIn_151_0 = null;
        Object stackIn_158_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_26_0 = null;
        Object stackOut_53_0 = null;
        Object stackOut_59_0 = null;
        byte stackOut_131_0 = 0;
        byte stackOut_131_1 = 0;
        int stackOut_138_0 = 0;
        int stackOut_138_1 = 0;
        Object stackOut_150_0 = null;
        byte stackOut_82_0 = 0;
        byte stackOut_82_1 = 0;
        Object stackOut_98_0 = null;
        int stackOut_103_0 = 0;
        int stackOut_103_1 = 0;
        Object stackOut_111_0 = null;
        Object stackOut_157_0 = null;
        var10 = Confined.field_J ? 1 : 0;
        try {
          try {
            L0: {
              var4 = (Object) (Object) (rl) (Object) ((tj) this).field_i.a(param0 + -13859, (long)param2);
              if (null == var4) {
                break L0;
              } else {
                if (param1 != 0) {
                  break L0;
                } else {
                  if (((rl) var4).field_t) {
                    break L0;
                  } else {
                    if (!((rl) var4).field_v) {
                      break L0;
                    } else {
                      ((rl) var4).a(true);
                      var4 = null;
                      break L0;
                    }
                  }
                }
              }
            }
            L1: {
              if (var4 == null) {
                L2: {
                  L3: {
                    if (0 != param1) {
                      break L3;
                    } else {
                      L4: {
                        if (((tj) this).field_s == null) {
                          break L4;
                        } else {
                          if (-1 == ((tj) this).field_p[param2]) {
                            break L4;
                          } else {
                            var4 = (Object) (Object) ((tj) this).field_o.a(param2, ((tj) this).field_s, (byte) 53);
                            if (var10 == 0) {
                              break L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      if (!((tj) this).field_q.c(93)) {
                        var4 = (Object) (Object) ((tj) this).field_q.a(((tj) this).field_u, true, -1911606496, param2, (byte) 2);
                        if (var10 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        stackOut_26_0 = null;
                        stackIn_27_0 = stackOut_26_0;
                        return (rl) (Object) stackIn_27_0;
                      }
                    }
                  }
                  L5: {
                    if (param1 != 1) {
                      break L5;
                    } else {
                      if (null == ((tj) this).field_s) {
                        throw new RuntimeException();
                      } else {
                        var4 = (Object) (Object) ((tj) this).field_o.a(((tj) this).field_s, 0, param2);
                        if (var10 == 0) {
                          break L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  if (param1 == 2) {
                    if (((tj) this).field_s == null) {
                      throw new RuntimeException();
                    } else {
                      if (-1 == ((tj) this).field_p[param2]) {
                        L6: {
                          if (((tj) this).field_q.b(-125)) {
                            break L6;
                          } else {
                            var4 = (Object) (Object) ((tj) this).field_q.a(((tj) this).field_u, false, -1911606496, param2, (byte) 2);
                            if (var10 == 0) {
                              break L2;
                            } else {
                              break L6;
                            }
                          }
                        }
                        stackOut_53_0 = null;
                        stackIn_54_0 = stackOut_53_0;
                        return (rl) (Object) stackIn_54_0;
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  } else {
                    throw new RuntimeException();
                  }
                }
                ((tj) this).field_i.a((rk) var4, param0 ^ 13871, (long)param2);
                break L1;
              } else {
                break L1;
              }
            }
            if (((rl) var4).field_v) {
              stackOut_59_0 = null;
              stackIn_60_0 = stackOut_59_0;
              return (rl) (Object) stackIn_60_0;
            } else {
              L7: {
                var5 = ((rl) var4).e((byte) 94);
                if (param0 == 13860) {
                  break L7;
                } else {
                  we discarded$2 = ((tj) this).a((byte) 127);
                  break L7;
                }
              }
              if (var4 instanceof sm) {
                L8: {
                  if (var5 == null) {
                    break L8;
                  } else {
                    if (var5.length > 2) {
                      al.field_e.reset();
                      al.field_e.update(var5, 0, -2 + var5.length);
                      var6_int = (int)al.field_e.getValue();
                      if (var6_int != ((tj) this).field_h.field_l[param2]) {
                        throw new RuntimeException();
                      } else {
                        L9: {
                          L10: {
                            if (null == ((tj) this).field_h.field_d) {
                              break L10;
                            } else {
                              if (((tj) this).field_h.field_d[param2] != null) {
                                var7_ref_byte__ = ((tj) this).field_h.field_d[param2];
                                var8 = in.a(0, var5, var5.length + -2, -26879);
                                var9 = 0;
                                L11: while (true) {
                                  if (var9 >= 64) {
                                    break L10;
                                  } else {
                                    stackOut_131_0 = var7_ref_byte__[var9];
                                    stackOut_131_1 = var8[var9];
                                    stackIn_139_0 = stackOut_131_0;
                                    stackIn_139_1 = stackOut_131_1;
                                    stackIn_132_0 = stackOut_131_0;
                                    stackIn_132_1 = stackOut_131_1;
                                    if (var10 != 0) {
                                      break L9;
                                    } else {
                                      if (stackIn_132_0 == stackIn_132_1) {
                                        var9++;
                                        if (var10 == 0) {
                                          continue L11;
                                        } else {
                                          break L10;
                                        }
                                      } else {
                                        throw new RuntimeException();
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L10;
                              }
                            }
                          }
                          stackOut_138_0 = var5[var5.length + -1] & 255;
                          stackOut_138_1 = (var5[var5.length + -2] & 255) << 1711073096;
                          stackIn_139_0 = stackOut_138_0;
                          stackIn_139_1 = stackOut_138_1;
                          break L9;
                        }
                        var7 = stackIn_139_0 + stackIn_139_1;
                        if (var7 == (((tj) this).field_h.field_o[param2] & 65535)) {
                          L12: {
                            if (((tj) this).field_p[param2] == 1) {
                              break L12;
                            } else {
                              L13: {
                                if (((tj) this).field_p[param2] != 0) {
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              ((tj) this).field_p[param2] = (byte) 1;
                              break L12;
                            }
                          }
                          L14: {
                            if (((rl) var4).field_t) {
                              break L14;
                            } else {
                              ((rl) var4).a(true);
                              break L14;
                            }
                          }
                          stackOut_150_0 = var4;
                          stackIn_151_0 = stackOut_150_0;
                          return (rl) (Object) stackIn_151_0;
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    } else {
                      break L8;
                    }
                  }
                }
                throw new RuntimeException();
              } else {
                try {
                  L15: {
                    L16: {
                      if (var5 == null) {
                        break L16;
                      } else {
                        if (var5.length > 2) {
                          al.field_e.reset();
                          al.field_e.update(var5, 0, var5.length + -2);
                          var6_int = (int)al.field_e.getValue();
                          if (~var6_int == ~((tj) this).field_h.field_l[param2]) {
                            L17: {
                              if (null == ((tj) this).field_h.field_d) {
                                break L17;
                              } else {
                                if (null != ((tj) this).field_h.field_d[param2]) {
                                  var7_ref_byte__ = ((tj) this).field_h.field_d[param2];
                                  var8 = in.a(0, var5, var5.length - 2, -26879);
                                  var9 = 0;
                                  L18: while (true) {
                                    if (var9 >= 64) {
                                      break L17;
                                    } else {
                                      stackOut_82_0 = var7_ref_byte__[var9];
                                      stackOut_82_1 = var8[var9];
                                      stackIn_104_0 = stackOut_82_0;
                                      stackIn_104_1 = stackOut_82_1;
                                      stackIn_83_0 = stackOut_82_0;
                                      stackIn_83_1 = stackOut_82_1;
                                      if (var10 != 0) {
                                        decompiledRegionSelector0 = 0;
                                        break L15;
                                      } else {
                                        if (stackIn_83_0 == stackIn_83_1) {
                                          var9++;
                                          if (var10 == 0) {
                                            continue L18;
                                          } else {
                                            break L17;
                                          }
                                        } else {
                                          throw new RuntimeException();
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  break L17;
                                }
                              }
                            }
                            ((tj) this).field_q.field_a = 0;
                            ((tj) this).field_q.field_e = 0;
                            decompiledRegionSelector0 = 1;
                            break L15;
                          } else {
                            throw new RuntimeException();
                          }
                        } else {
                          break L16;
                        }
                      }
                    }
                    throw new RuntimeException();
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L19: {
                    var6 = (RuntimeException) (Object) decompiledCaughtException;
                    ((tj) this).field_q.a(true);
                    ((rl) var4).a(true);
                    if (!((rl) var4).field_t) {
                      break L19;
                    } else {
                      if (!((tj) this).field_q.c(param0 + -13755)) {
                        var4 = (Object) (Object) ((tj) this).field_q.a(((tj) this).field_u, true, -1911606496, param2, (byte) 2);
                        ((tj) this).field_i.a((rk) var4, 11, (long)param2);
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                  }
                  stackOut_98_0 = null;
                  stackIn_99_0 = stackOut_98_0;
                  return (rl) (Object) stackIn_99_0;
                }
                L20: {
                  L21: {
                    if (decompiledRegionSelector0 == 0) {
                      break L21;
                    } else {
                      var5[var5.length + -2] = (byte)(((tj) this).field_h.field_o[param2] >>> 462725320);
                      var5[var5.length - 1] = (byte)((tj) this).field_h.field_o[param2];
                      if (((tj) this).field_s != null) {
                        sm discarded$3 = ((tj) this).field_o.a(((tj) this).field_s, -127, var5, param2);
                        stackOut_103_0 = ~((tj) this).field_p[param2];
                        stackOut_103_1 = -2;
                        stackIn_104_0 = stackOut_103_0;
                        stackIn_104_1 = stackOut_103_1;
                        break L21;
                      } else {
                        break L20;
                      }
                    }
                  }
                  if (stackIn_104_0 != stackIn_104_1) {
                    ((tj) this).field_p[param2] = (byte) 1;
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L22: {
                  if (!((rl) var4).field_t) {
                    ((rl) var4).a(true);
                    break L22;
                  } else {
                    break L22;
                  }
                }
                stackOut_111_0 = var4;
                stackIn_112_0 = stackOut_111_0;
                return (rl) (Object) stackIn_112_0;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            L23: {
              var6_ref = (Exception) (Object) decompiledCaughtException;
              ((tj) this).field_p[param2] = (byte) -1;
              ((rl) var4).a(true);
              if (((rl) var4).field_t) {
                if (((tj) this).field_q.c(92)) {
                  break L23;
                } else {
                  var4 = (Object) (Object) ((tj) this).field_q.a(((tj) this).field_u, true, -1911606496, param2, (byte) 2);
                  ((tj) this).field_i.a((rk) var4, 11, (long)param2);
                  break L23;
                }
              } else {
                break L23;
              }
            }
            stackOut_157_0 = null;
            stackIn_158_0 = stackOut_157_0;
            return (rl) (Object) stackIn_158_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (Object) (Object) decompiledCaughtException;
          throw sd.a((Throwable) var4, "tj.G(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final byte[] a(int param0, int param1) {
        rl var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_4_0 = null;
        byte[] stackIn_6_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        byte[] stackOut_5_0 = null;
        try {
          L0: {
            var3 = this.a(13860, param1, param0);
            if (var3 == null) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (byte[]) (Object) stackIn_4_0;
            } else {
              var4 = var3.e((byte) 119);
              var3.a(true);
              stackOut_5_0 = (byte[]) var4;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var3_ref, "tj.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              fn.f(-1 + param4, param1 + -1, param3 - 1, -1 + param5, param0);
              fn.f(param4, param1 + -1, param3, -1 + param5, param0);
              fn.f(param4 + -1, param1, param3 - 1, param5, param0);
              if (param2 > 13) {
                break L1;
              } else {
                field_l = null;
                break L1;
              }
            }
            fn.f(param4, param1, param3, param5, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var6, "tj.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        var13 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var5_int = param2 - -param4;
            if (param1 == 1) {
              L1: {
                var6 = param3 + param0;
                if (param2 > fn.field_c) {
                  stackOut_6_0 = param2;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_4_0 = fn.field_c;
                  stackIn_7_0 = stackOut_4_0;
                  break L1;
                }
              }
              L2: {
                var7 = stackIn_7_0;
                if (param3 <= fn.field_b) {
                  stackOut_10_0 = fn.field_b;
                  stackIn_11_0 = stackOut_10_0;
                  break L2;
                } else {
                  stackOut_8_0 = param3;
                  stackIn_11_0 = stackOut_8_0;
                  break L2;
                }
              }
              L3: {
                var8 = stackIn_11_0;
                if (var5_int >= fn.field_i) {
                  stackOut_14_0 = fn.field_i;
                  stackIn_15_0 = stackOut_14_0;
                  break L3;
                } else {
                  stackOut_12_0 = var5_int;
                  stackIn_15_0 = stackOut_12_0;
                  break L3;
                }
              }
              L4: {
                var9 = stackIn_15_0;
                if (var6 >= fn.field_j) {
                  stackOut_18_0 = fn.field_j;
                  stackIn_19_0 = stackOut_18_0;
                  break L4;
                } else {
                  stackOut_16_0 = var6;
                  stackIn_19_0 = stackOut_16_0;
                  break L4;
                }
              }
              L5: {
                L6: {
                  L7: {
                    L8: {
                      L9: {
                        var10 = stackIn_19_0;
                        if (fn.field_c > param2) {
                          break L9;
                        } else {
                          if (~fn.field_i >= ~param2) {
                            break L9;
                          } else {
                            var11 = param2 + fn.field_g * var8;
                            var12 = 1 - (-var10 + var8) >> 350580225;
                            L10: while (true) {
                              var12--;
                              if (var12 < 0) {
                                break L9;
                              } else {
                                fn.field_h[var11] = 16777215;
                                var11 = var11 + 2 * fn.field_g;
                                if (var13 != 0) {
                                  break L8;
                                } else {
                                  if (var13 == 0) {
                                    continue L10;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      if (~fn.field_b < ~param3) {
                        break L8;
                      } else {
                        if (fn.field_j > var6) {
                          var11 = var7 + fn.field_g * param3;
                          var12 = var9 + (1 + -var7) >> 193864673;
                          L11: while (true) {
                            var12--;
                            if (var12 < 0) {
                              break L8;
                            } else {
                              fn.field_h[var11] = 16777215;
                              var11 += 2;
                              if (var13 != 0) {
                                break L7;
                              } else {
                                if (var13 == 0) {
                                  continue L11;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                        } else {
                          break L8;
                        }
                      }
                    }
                    if (~fn.field_c < ~var5_int) {
                      break L7;
                    } else {
                      if (fn.field_i <= var5_int) {
                        break L7;
                      } else {
                        var11 = fn.field_g * ((1 & -param2 + var5_int) + var8) + var5_int;
                        var12 = 1 - (-var10 + var8) >> 1216086497;
                        L12: while (true) {
                          var12--;
                          if (0 > var12) {
                            break L7;
                          } else {
                            fn.field_h[var11] = 16777215;
                            var11 = var11 + fn.field_g * 2;
                            if (var13 != 0) {
                              break L6;
                            } else {
                              if (var13 == 0) {
                                continue L12;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  if (param3 < fn.field_b) {
                    break L6;
                  } else {
                    if (fn.field_j <= var6) {
                      break L6;
                    } else {
                      var11 = (1 & -param3 + var6) + var7 + fn.field_g * var6;
                      var12 = -var7 + 1 + var9 >> 1040869121;
                      L13: while (true) {
                        var12--;
                        if (var12 < 0) {
                          break L6;
                        } else {
                          fn.field_h[var11] = 16777215;
                          var11 += 2;
                          if (var13 != 0) {
                            break L5;
                          } else {
                            if (var13 == 0) {
                              continue L13;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                break L5;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var5, "tj.L(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void b(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        rk var3 = null;
        rl var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_73_0 = 0;
        int stackIn_73_1 = 0;
        int stackIn_75_0 = 0;
        int stackIn_75_1 = 0;
        int stackIn_98_0 = 0;
        int stackIn_98_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_49_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_59_1 = 0;
        int stackOut_72_0 = 0;
        int stackOut_72_1 = 0;
        int stackOut_73_0 = 0;
        int stackOut_73_1 = 0;
        int stackOut_70_0 = 0;
        int stackOut_70_1 = 0;
        int stackOut_97_0 = 0;
        int stackOut_97_1 = 0;
        var5 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (((tj) this).field_r != null) {
                  if (((tj) this).a((byte) -61) == null) {
                    return;
                  } else {
                    L3: {
                      if (((tj) this).field_m) {
                        break L3;
                      } else {
                        L4: {
                          if (!((tj) this).field_k) {
                            break L4;
                          } else {
                            var2_int = 1;
                            var3 = ((tj) this).field_r.a(87);
                            L5: while (true) {
                              L6: {
                                L7: {
                                  L8: {
                                    if (var3 == null) {
                                      break L8;
                                    } else {
                                      var4 = (int)var3.field_i;
                                      stackOut_14_0 = ~((tj) this).field_p[var4];
                                      stackOut_14_1 = -2;
                                      stackIn_26_0 = stackOut_14_0;
                                      stackIn_26_1 = stackOut_14_1;
                                      stackIn_15_0 = stackOut_14_0;
                                      stackIn_15_1 = stackOut_14_1;
                                      if (var5 != 0) {
                                        L9: while (true) {
                                          if (stackIn_26_0 <= stackIn_26_1) {
                                            break L7;
                                          } else {
                                            stackOut_27_0 = ((tj) this).field_h.field_t[((tj) this).field_j];
                                            stackIn_50_0 = stackOut_27_0;
                                            stackIn_28_0 = stackOut_27_0;
                                            if (var5 != 0) {
                                              break L6;
                                            } else {
                                              stackOut_28_0 = stackIn_28_0;
                                              stackIn_30_0 = stackOut_28_0;
                                              L10: {
                                                L11: {
                                                  if (stackIn_30_0 == 0) {
                                                    ((tj) this).field_j = ((tj) this).field_j + 1;
                                                    if (var5 == 0) {
                                                      break L10;
                                                    } else {
                                                      break L11;
                                                    }
                                                  } else {
                                                    break L11;
                                                  }
                                                }
                                                L12: {
                                                  if (((tj) this).field_q.b(-124)) {
                                                    var2_int = 0;
                                                    if (var5 == 0) {
                                                      break L7;
                                                    } else {
                                                      break L12;
                                                    }
                                                  } else {
                                                    break L12;
                                                  }
                                                }
                                                L13: {
                                                  if (((tj) this).field_p[((tj) this).field_j] == 1) {
                                                    break L13;
                                                  } else {
                                                    rl discarded$4 = this.a(13860, 2, ((tj) this).field_j);
                                                    break L13;
                                                  }
                                                }
                                                L14: {
                                                  if (((tj) this).field_p[((tj) this).field_j] != 1) {
                                                    var3 = new rk();
                                                    var3.field_i = (long)((tj) this).field_j;
                                                    ((tj) this).field_r.a(var3, (byte) -84);
                                                    var2_int = 0;
                                                    break L14;
                                                  } else {
                                                    break L14;
                                                  }
                                                }
                                                ((tj) this).field_j = ((tj) this).field_j + 1;
                                                if (var5 == 0) {
                                                  break L10;
                                                } else {
                                                  break L7;
                                                }
                                              }
                                              stackOut_25_0 = ~((tj) this).field_j;
                                              stackOut_25_1 = ~((tj) this).field_h.field_t.length;
                                              stackIn_26_0 = stackOut_25_0;
                                              stackIn_26_1 = stackOut_25_1;
                                              continue L9;
                                            }
                                          }
                                        }
                                      } else {
                                        L15: {
                                          if (stackIn_15_0 != stackIn_15_1) {
                                            rl discarded$5 = this.a(13860, 2, var4);
                                            break L15;
                                          } else {
                                            break L15;
                                          }
                                        }
                                        L16: {
                                          L17: {
                                            if (((tj) this).field_p[var4] == 1) {
                                              break L17;
                                            } else {
                                              var2_int = 0;
                                              if (var5 == 0) {
                                                break L16;
                                              } else {
                                                break L17;
                                              }
                                            }
                                          }
                                          var3.a(true);
                                          break L16;
                                        }
                                        var3 = ((tj) this).field_r.d(2123);
                                        if (var5 == 0) {
                                          continue L5;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                  }
                                  L18: while (true) {
                                    stackOut_25_0 = ~((tj) this).field_j;
                                    stackOut_25_1 = ~((tj) this).field_h.field_t.length;
                                    stackIn_26_0 = stackOut_25_0;
                                    stackIn_26_1 = stackOut_25_1;
                                    if (stackIn_26_0 <= stackIn_26_1) {
                                      break L7;
                                    } else {
                                      stackOut_27_0 = ((tj) this).field_h.field_t[((tj) this).field_j];
                                      stackIn_50_0 = stackOut_27_0;
                                      stackIn_28_0 = stackOut_27_0;
                                      if (var5 != 0) {
                                        break L6;
                                      } else {
                                        stackOut_28_0 = stackIn_28_0;
                                        stackIn_30_0 = stackOut_28_0;
                                        L19: {
                                          if (stackIn_30_0 == 0) {
                                            ((tj) this).field_j = ((tj) this).field_j + 1;
                                            if (var5 == 0) {
                                              continue L18;
                                            } else {
                                              break L19;
                                            }
                                          } else {
                                            break L19;
                                          }
                                        }
                                        L20: {
                                          if (((tj) this).field_q.b(-124)) {
                                            var2_int = 0;
                                            if (var5 == 0) {
                                              break L7;
                                            } else {
                                              break L20;
                                            }
                                          } else {
                                            break L20;
                                          }
                                        }
                                        L21: {
                                          if (((tj) this).field_p[((tj) this).field_j] == 1) {
                                            break L21;
                                          } else {
                                            rl discarded$4 = this.a(13860, 2, ((tj) this).field_j);
                                            break L21;
                                          }
                                        }
                                        L22: {
                                          if (((tj) this).field_p[((tj) this).field_j] != 1) {
                                            var3 = new rk();
                                            var3.field_i = (long)((tj) this).field_j;
                                            ((tj) this).field_r.a(var3, (byte) -84);
                                            var2_int = 0;
                                            break L22;
                                          } else {
                                            break L22;
                                          }
                                        }
                                        ((tj) this).field_j = ((tj) this).field_j + 1;
                                        if (var5 == 0) {
                                          continue L18;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                  }
                                }
                                stackOut_49_0 = var2_int;
                                stackIn_50_0 = stackOut_49_0;
                                break L6;
                              }
                              L23: {
                                if (stackIn_50_0 != 0) {
                                  ((tj) this).field_k = false;
                                  ((tj) this).field_j = 0;
                                  break L23;
                                } else {
                                  break L23;
                                }
                              }
                              if (var5 == 0) {
                                break L2;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        ((tj) this).field_r = null;
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var2_int = 1;
                    var3 = ((tj) this).field_r.a(-125);
                    L24: while (true) {
                      L25: {
                        L26: {
                          if (var3 == null) {
                            break L26;
                          } else {
                            var4 = (int)var3.field_i;
                            stackOut_59_0 = ~((tj) this).field_p[var4];
                            stackOut_59_1 = -1;
                            stackIn_71_0 = stackOut_59_0;
                            stackIn_71_1 = stackOut_59_1;
                            stackIn_60_0 = stackOut_59_0;
                            stackIn_60_1 = stackOut_59_1;
                            if (var5 != 0) {
                              L27: while (true) {
                                if (stackIn_71_0 >= stackIn_71_1) {
                                  break L25;
                                } else {
                                  stackOut_72_0 = ~((tj) this).field_h.field_t[((tj) this).field_j];
                                  stackOut_72_1 = -1;
                                  stackIn_98_0 = stackOut_72_0;
                                  stackIn_98_1 = stackOut_72_1;
                                  stackIn_73_0 = stackOut_72_0;
                                  stackIn_73_1 = stackOut_72_1;
                                  if (var5 != 0) {
                                    break L1;
                                  } else {
                                    stackOut_73_0 = stackIn_73_0;
                                    stackOut_73_1 = stackIn_73_1;
                                    stackIn_75_0 = stackOut_73_0;
                                    stackIn_75_1 = stackOut_73_1;
                                    L28: {
                                      L29: {
                                        if (stackIn_75_0 == stackIn_75_1) {
                                          ((tj) this).field_j = ((tj) this).field_j + 1;
                                          if (var5 == 0) {
                                            break L28;
                                          } else {
                                            break L29;
                                          }
                                        } else {
                                          break L29;
                                        }
                                      }
                                      L30: {
                                        if (((tj) this).field_o.field_b >= 250) {
                                          var2_int = 0;
                                          if (var5 == 0) {
                                            break L25;
                                          } else {
                                            break L30;
                                          }
                                        } else {
                                          break L30;
                                        }
                                      }
                                      L31: {
                                        if (((tj) this).field_p[((tj) this).field_j] != 0) {
                                          break L31;
                                        } else {
                                          rl discarded$6 = this.a(13860, 1, ((tj) this).field_j);
                                          break L31;
                                        }
                                      }
                                      L32: {
                                        if (0 == ((tj) this).field_p[((tj) this).field_j]) {
                                          var3 = new rk();
                                          var3.field_i = (long)((tj) this).field_j;
                                          ((tj) this).field_r.a(var3, (byte) -98);
                                          var2_int = 0;
                                          break L32;
                                        } else {
                                          break L32;
                                        }
                                      }
                                      ((tj) this).field_j = ((tj) this).field_j + 1;
                                      if (var5 == 0) {
                                        break L28;
                                      } else {
                                        break L25;
                                      }
                                    }
                                    stackOut_70_0 = ((tj) this).field_j;
                                    stackOut_70_1 = ((tj) this).field_h.field_t.length;
                                    stackIn_71_0 = stackOut_70_0;
                                    stackIn_71_1 = stackOut_70_1;
                                    continue L27;
                                  }
                                }
                              }
                            } else {
                              L33: {
                                if (stackIn_60_0 != stackIn_60_1) {
                                  break L33;
                                } else {
                                  rl discarded$7 = this.a(13860, 1, var4);
                                  break L33;
                                }
                              }
                              L34: {
                                L35: {
                                  if (((tj) this).field_p[var4] != 0) {
                                    break L35;
                                  } else {
                                    var2_int = 0;
                                    if (var5 == 0) {
                                      break L34;
                                    } else {
                                      break L35;
                                    }
                                  }
                                }
                                var3.a(true);
                                break L34;
                              }
                              var3 = ((tj) this).field_r.d(2123);
                              if (var5 == 0) {
                                continue L24;
                              } else {
                                break L26;
                              }
                            }
                          }
                        }
                        L36: while (true) {
                          stackOut_70_0 = ((tj) this).field_j;
                          stackOut_70_1 = ((tj) this).field_h.field_t.length;
                          stackIn_71_0 = stackOut_70_0;
                          stackIn_71_1 = stackOut_70_1;
                          if (stackIn_71_0 >= stackIn_71_1) {
                            break L25;
                          } else {
                            stackOut_72_0 = ~((tj) this).field_h.field_t[((tj) this).field_j];
                            stackOut_72_1 = -1;
                            stackIn_98_0 = stackOut_72_0;
                            stackIn_98_1 = stackOut_72_1;
                            stackIn_73_0 = stackOut_72_0;
                            stackIn_73_1 = stackOut_72_1;
                            if (var5 != 0) {
                              break L1;
                            } else {
                              stackOut_73_0 = stackIn_73_0;
                              stackOut_73_1 = stackIn_73_1;
                              stackIn_75_0 = stackOut_73_0;
                              stackIn_75_1 = stackOut_73_1;
                              L37: {
                                if (stackIn_75_0 == stackIn_75_1) {
                                  ((tj) this).field_j = ((tj) this).field_j + 1;
                                  if (var5 == 0) {
                                    continue L36;
                                  } else {
                                    break L37;
                                  }
                                } else {
                                  break L37;
                                }
                              }
                              L38: {
                                if (((tj) this).field_o.field_b >= 250) {
                                  var2_int = 0;
                                  if (var5 == 0) {
                                    break L25;
                                  } else {
                                    break L38;
                                  }
                                } else {
                                  break L38;
                                }
                              }
                              L39: {
                                if (((tj) this).field_p[((tj) this).field_j] != 0) {
                                  break L39;
                                } else {
                                  rl discarded$6 = this.a(13860, 1, ((tj) this).field_j);
                                  break L39;
                                }
                              }
                              L40: {
                                if (0 == ((tj) this).field_p[((tj) this).field_j]) {
                                  var3 = new rk();
                                  var3.field_i = (long)((tj) this).field_j;
                                  ((tj) this).field_r.a(var3, (byte) -98);
                                  var2_int = 0;
                                  break L40;
                                } else {
                                  break L40;
                                }
                              }
                              ((tj) this).field_j = ((tj) this).field_j + 1;
                              if (var5 == 0) {
                                continue L36;
                              } else {
                                break L25;
                              }
                            }
                          }
                        }
                      }
                      if (var2_int == 0) {
                        break L2;
                      } else {
                        ((tj) this).field_m = false;
                        ((tj) this).field_j = 0;
                        break L2;
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              stackOut_97_0 = -50;
              stackOut_97_1 = (-13 - param0) / 63;
              stackIn_98_0 = stackOut_97_0;
              stackIn_98_1 = stackOut_97_1;
              break L1;
            }
            L41: {
              var2_int = stackIn_98_0 / stackIn_98_1;
              if (!((tj) this).field_w) {
                break L41;
              } else {
                if (((tj) this).field_t <= ri.a(-3)) {
                  var3_ref = (rl) (Object) ((tj) this).field_i.a(true);
                  L42: while (true) {
                    L43: {
                      if (null == var3_ref) {
                        break L43;
                      } else {
                        if (var5 != 0) {
                          break L41;
                        } else {
                          L44: {
                            if (var3_ref.field_v) {
                              break L44;
                            } else {
                              L45: {
                                if (!var3_ref.field_w) {
                                  break L45;
                                } else {
                                  if (var3_ref.field_t) {
                                    var3_ref.a(true);
                                    if (var5 == 0) {
                                      break L44;
                                    } else {
                                      break L45;
                                    }
                                  } else {
                                    throw new RuntimeException();
                                  }
                                }
                              }
                              var3_ref.field_w = true;
                              break L44;
                            }
                          }
                          var3_ref = (rl) (Object) ((tj) this).field_i.a(70);
                          if (var5 == 0) {
                            continue L42;
                          } else {
                            break L43;
                          }
                        }
                      }
                    }
                    ((tj) this).field_t = ri.a(-3) - -1000L;
                    break L41;
                  }
                } else {
                  break L41;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "tj.D(" + param0 + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            if (param1 == 480) {
              L1: {
                L2: {
                  if (0 >= sg.field_x) {
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        if (null == gg.field_m) {
                          break L4;
                        } else {
                          dn.field_d = gg.field_m.a(20742);
                          jk.a(2, false);
                          if (var3 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      dn.field_d = id.a(2401, ki.field_d, 640, 0, 0, 480);
                      break L3;
                    }
                    L5: {
                      if (dn.field_d == null) {
                        break L5;
                      } else {
                        ac.a((java.awt.Canvas) (Object) dn.field_d, (byte) -79);
                        var2_int = 2;
                        if (var3 == 0) {
                          break L1;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var2_int = 3;
                    if (var3 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L6: {
                  if (!tj.a(true)) {
                    break L6;
                  } else {
                    var2_int = 0;
                    if (var3 == 0) {
                      break L1;
                    } else {
                      break L6;
                    }
                  }
                }
                var2_int = 1;
                break L1;
              }
              L7: {
                if (null != gg.field_m) {
                  break L7;
                } else {
                  if (eh.field_gb) {
                    q.a(var2_int, param0, (byte) -107);
                    break L7;
                  } else {
                    break L7;
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
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "tj.F(" + param0 + ',' + param1 + ')');
        }
    }

    final we a(byte param0) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        RuntimeException var3 = null;
        int var4 = 0;
        we stackIn_3_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_34_0 = null;
        Object stackIn_47_0 = null;
        we stackIn_56_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        Object stackOut_46_0 = null;
        Object stackOut_33_0 = null;
        we stackOut_55_0 = null;
        Object stackOut_17_0 = null;
        Object stackOut_14_0 = null;
        we stackOut_2_0 = null;
        var4 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            if (null == ((tj) this).field_h) {
              L1: {
                if (null == ((tj) this).field_y) {
                  if (((tj) this).field_q.c(91)) {
                    stackOut_10_0 = null;
                    stackIn_11_0 = stackOut_10_0;
                    return (we) (Object) stackIn_11_0;
                  } else {
                    ((tj) this).field_y = (rl) (Object) ((tj) this).field_q.a(255, true, -1911606496, ((tj) this).field_u, (byte) 0);
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              if (param0 < -26) {
                if (!((tj) this).field_y.field_v) {
                  L2: {
                    var2_array = ((tj) this).field_y.e((byte) 116);
                    if (!(((tj) this).field_y instanceof sm)) {
                      try {
                        L3: {
                          if (null != var2_array) {
                            ((tj) this).field_h = new we(var2_array, ((tj) this).field_x, ((tj) this).field_B);
                            break L3;
                          } else {
                            throw new RuntimeException();
                          }
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L4: {
                          L5: {
                            var3 = decompiledCaughtException;
                            ((tj) this).field_q.a(true);
                            ((tj) this).field_h = null;
                            if (((tj) this).field_q.c(-45)) {
                              break L5;
                            } else {
                              ((tj) this).field_y = (rl) (Object) ((tj) this).field_q.a(255, true, -1911606496, ((tj) this).field_u, (byte) 0);
                              if (var4 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          ((tj) this).field_y = null;
                          break L4;
                        }
                        stackOut_46_0 = null;
                        stackIn_47_0 = stackOut_46_0;
                        return (we) (Object) stackIn_47_0;
                      }
                      if (null == ((tj) this).field_v) {
                        break L2;
                      } else {
                        sm discarded$1 = ((tj) this).field_o.a(((tj) this).field_v, -123, var2_array, ((tj) this).field_u);
                        break L2;
                      }
                    } else {
                      try {
                        L6: {
                          if (var2_array != null) {
                            ((tj) this).field_h = new we(var2_array, ((tj) this).field_x, ((tj) this).field_B);
                            if (~((tj) this).field_h.field_m == ~((tj) this).field_D) {
                              break L6;
                            } else {
                              throw new RuntimeException();
                            }
                          } else {
                            throw new RuntimeException();
                          }
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                        decompiledCaughtException = decompiledCaughtParameter1;
                        L7: {
                          L8: {
                            var3 = decompiledCaughtException;
                            ((tj) this).field_h = null;
                            if (!((tj) this).field_q.c(-69)) {
                              break L8;
                            } else {
                              ((tj) this).field_y = null;
                              if (var4 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          ((tj) this).field_y = (rl) (Object) ((tj) this).field_q.a(255, true, -1911606496, ((tj) this).field_u, (byte) 0);
                          break L7;
                        }
                        stackOut_33_0 = null;
                        stackIn_34_0 = stackOut_33_0;
                        return (we) (Object) stackIn_34_0;
                      }
                      break L2;
                    }
                  }
                  L9: {
                    ((tj) this).field_y = null;
                    if (((tj) this).field_s != null) {
                      ((tj) this).field_p = new byte[((tj) this).field_h.field_i];
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  stackOut_55_0 = ((tj) this).field_h;
                  stackIn_56_0 = stackOut_55_0;
                  break L0;
                } else {
                  stackOut_17_0 = null;
                  stackIn_18_0 = stackOut_17_0;
                  return (we) (Object) stackIn_18_0;
                }
              } else {
                stackOut_14_0 = null;
                stackIn_15_0 = stackOut_14_0;
                return (we) (Object) stackIn_15_0;
              }
            } else {
              stackOut_2_0 = ((tj) this).field_h;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "tj.A(" + param0 + ')');
        }
        return stackIn_56_0;
    }

    final void c(byte param0) {
        RuntimeException var2 = null;
        rk var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            if (((tj) this).field_r == null) {
              return;
            } else {
              if (((tj) this).a((byte) -49) == null) {
                return;
              } else {
                if (param0 < -106) {
                  var2_ref = ((tj) this).field_C.a(-115);
                  L1: while (true) {
                    L2: {
                      L3: {
                        if (var2_ref == null) {
                          break L3;
                        } else {
                          var3 = (int)var2_ref.field_i;
                          if (var4 != 0) {
                            break L2;
                          } else {
                            L4: {
                              L5: {
                                L6: {
                                  if (var3 < 0) {
                                    break L6;
                                  } else {
                                    if (((tj) this).field_h.field_i <= var3) {
                                      break L6;
                                    } else {
                                      if (((tj) this).field_h.field_t[var3] != 0) {
                                        break L5;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                }
                                var2_ref.a(true);
                                if (var4 == 0) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                              L7: {
                                if (((tj) this).field_p[var3] != 0) {
                                  break L7;
                                } else {
                                  rl discarded$2 = this.a(13860, 1, var3);
                                  break L7;
                                }
                              }
                              L8: {
                                if (((tj) this).field_p[var3] == -1) {
                                  rl discarded$3 = this.a(13860, 2, var3);
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                              if (((tj) this).field_p[var3] != 1) {
                                break L4;
                              } else {
                                var2_ref.a(true);
                                break L4;
                              }
                            }
                            var2_ref = ((tj) this).field_C.d(2123);
                            if (var4 == 0) {
                              continue L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      break L2;
                    }
                    break L0;
                  }
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "tj.H(" + param0 + ')');
        }
    }

    public static void c(int param0) {
        try {
            field_z = null;
            field_n = null;
            field_l = null;
            int var1_int = 115 % ((param0 - -31) / 61);
            field_E = null;
            field_F = null;
            field_A = null;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "tj.M(" + param0 + ')');
        }
    }

    final void b(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null != ((tj) this).field_s) {
              L1: {
                ((tj) this).field_k = true;
                if (param0 == -2) {
                  break L1;
                } else {
                  field_A = null;
                  break L1;
                }
              }
              L2: {
                if (null == ((tj) this).field_r) {
                  ((tj) this).field_r = new mn();
                  break L2;
                } else {
                  break L2;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "tj.B(" + param0 + ')');
        }
    }

    final static boolean a(boolean param0) {
        RuntimeException var1 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0) {
              stackOut_3_0 = fd.field_j;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var1, "tj.E(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    tj(int param0, ae param1, ae param2, jf param3, pc param4, int param5, byte[] param6, int param7, boolean param8) {
        RuntimeException var10 = null;
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
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
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
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        ((tj) this).field_i = new vh(16);
        ((tj) this).field_j = 0;
        ((tj) this).field_C = new mn();
        ((tj) this).field_t = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((tj) this).field_u = param0;
                ((tj) this).field_s = param1;
                if (((tj) this).field_s == null) {
                  break L2;
                } else {
                  ((tj) this).field_m = true;
                  ((tj) this).field_r = new mn();
                  if (!Confined.field_J) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((tj) this).field_m = false;
              break L1;
            }
            L3: {
              ((tj) this).field_q = param3;
              ((tj) this).field_w = param8;
              ((tj) this).field_o = param4;
              ((tj) this).field_x = param5;
              ((tj) this).field_v = param2;
              ((tj) this).field_D = param7;
              ((tj) this).field_B = param6;
              if (((tj) this).field_v != null) {
                ((tj) this).field_y = (rl) (Object) ((tj) this).field_o.a(((tj) this).field_u, ((tj) this).field_v, (byte) 53);
                break L3;
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var10;
            stackOut_10_1 = new StringBuilder().append("tj.<init>(").append(param0).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L6;
            }
          }
          L7: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param4 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L7;
            }
          }
          L8: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param5).append(',');
            stackIn_29_0 = stackOut_26_0;
            stackIn_29_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param6 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_30_0 = stackOut_27_0;
              stackIn_30_1 = stackOut_27_1;
              stackIn_30_2 = stackOut_27_2;
              break L8;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "If you get it right, the bolt of#energy it delivers is devastating.#Do not fly through the explosion!";
        field_n = new al("usename");
        field_F = "Extra lives";
        field_A = new int[]{0, 0, 0, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
        field_z = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    }
}
