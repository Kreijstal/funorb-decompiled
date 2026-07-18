/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th extends wb {
    static dl field_t;
    int[] field_u;
    private int[][] field_v;
    private int[] field_x;
    static int field_z;
    private String[] field_w;
    static String field_r;
    static String[][] field_p;
    static il field_y;
    static km[] field_o;
    static String field_s;
    static boolean field_q;

    final void d(boolean param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (((th) this).field_u != null) {
                  var2_int = 0;
                  L3: while (true) {
                    if (var2_int >= ((th) this).field_u.length) {
                      break L2;
                    } else {
                      ((th) this).field_u[var2_int] = oh.a(((th) this).field_u[var2_int], 32768);
                      var2_int++;
                      if (var3 != 0) {
                        break L1;
                      } else {
                        if (var3 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              if (!param0) {
                break L1;
              } else {
                field_q = false;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var2, "th.D(" + param0 + ')');
        }
    }

    final void a(jc param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                field_r = null;
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  L5: {
                    var3_int = param0.g(11132);
                    if (var3_int != 0) {
                      break L5;
                    } else {
                      if (var4 != 0) {
                        break L4;
                      } else {
                        if (var4 == 0) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  this.a(var3_int, 60, param0);
                  break L4;
                }
                if (var4 == 0) {
                  continue L2;
                } else {
                  break L3;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("th.F(");
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L6;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ')');
        }
    }

    final String d(int param0) {
        StringBuilder var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        Object stackIn_3_0 = null;
        String stackIn_6_0 = null;
        StringBuilder stackIn_10_0 = null;
        StringBuilder stackIn_14_0 = null;
        String stackIn_15_0 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_9_0 = null;
        StringBuilder stackOut_13_0 = null;
        String stackOut_14_0 = null;
        String stackOut_5_0 = null;
        Object stackOut_2_0 = null;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 >= 113) {
              var2 = new StringBuilder(80);
              if (((th) this).field_w != null) {
                StringBuilder discarded$6 = var2.append(((th) this).field_w[0]);
                var3 = 1;
                L1: while (true) {
                  L2: {
                    L3: {
                      if (~((th) this).field_w.length >= ~var3) {
                        break L3;
                      } else {
                        StringBuilder discarded$7 = var2.append("...");
                        stackOut_9_0 = var2.append(((th) this).field_w[var3]);
                        stackIn_14_0 = stackOut_9_0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var4 != 0) {
                          break L2;
                        } else {
                          var3++;
                          if (var4 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    stackOut_13_0 = (StringBuilder) var2;
                    stackIn_14_0 = stackOut_13_0;
                    break L2;
                  }
                  stackOut_14_0 = ((StringBuilder) (Object) stackIn_14_0).toString();
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                }
              } else {
                stackOut_5_0 = "";
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (String) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var2_ref, "th.C(" + param0 + ')');
        }
        return stackIn_15_0;
    }

    public static void e(int param0) {
        field_p = null;
        field_t = null;
        field_o = null;
        if (param0 != -5) {
            return;
        }
        try {
            field_r = null;
            field_y = null;
            field_s = null;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "th.B(" + param0 + ')');
        }
    }

    final static Object a(int param0, byte[] param1, boolean param2) {
        RuntimeException var3 = null;
        tl var3_ref = null;
        Object stackIn_2_0 = null;
        tl stackIn_7_0 = null;
        byte[] stackIn_13_0 = null;
        byte[] stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        tl stackOut_6_0 = null;
        byte[] stackOut_14_0 = null;
        byte[] stackOut_12_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            if (param1 != null) {
              if (136 < param1.length) {
                var3_ref = new tl();
                ((wh) (Object) var3_ref).a(param1, (byte) -4);
                stackOut_6_0 = (tl) var3_ref;
                stackIn_7_0 = stackOut_6_0;
                return (Object) (Object) stackIn_7_0;
              } else {
                L1: {
                  if (param0 == -3) {
                    break L1;
                  } else {
                    boolean discarded$2 = th.a((byte) 34, -128, -119, 34);
                    break L1;
                  }
                }
                if (!param2) {
                  stackOut_14_0 = (byte[]) param1;
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                } else {
                  stackOut_12_0 = va.a(param1, 0);
                  stackIn_13_0 = stackOut_12_0;
                  return (Object) (Object) stackIn_13_0;
                }
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("th.G(").append(param0).append(',');
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L2;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L2;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param2 + ')');
        }
        return (Object) (Object) stackIn_15_0;
    }

    final static void b(byte param0) {
        RuntimeException runtimeException = null;
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        byte stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var1 = (Object) (Object) w.field_L;
            synchronized (var1) {
              L1: {
                L2: {
                  L3: {
                    L4: {
                      ph.field_h = re.field_l;
                      um.field_Fb = um.field_Fb + 1;
                      if (ch.field_f >= 0) {
                        break L4;
                      } else {
                        var2 = 0;
                        L5: while (true) {
                          L6: {
                            L7: {
                              if (112 <= var2) {
                                break L7;
                              } else {
                                dc.field_Y[var2] = false;
                                var2++;
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
                            ch.field_f = bf.field_i;
                            break L6;
                          }
                          if (var4 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    L8: while (true) {
                      if (~ch.field_f == ~bf.field_i) {
                        break L3;
                      } else {
                        var2 = ab.field_H[bf.field_i];
                        bf.field_i = bf.field_i - -1 & 127;
                        stackOut_14_0 = ~var2;
                        stackOut_14_1 = -1;
                        stackIn_29_0 = stackOut_14_0;
                        stackIn_29_1 = stackOut_14_1;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        if (var4 != 0) {
                          break L2;
                        } else {
                          L9: {
                            L10: {
                              if (stackIn_15_0 > stackIn_15_1) {
                                break L10;
                              } else {
                                dc.field_Y[var2] = true;
                                if (var4 == 0) {
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            dc.field_Y[~var2] = false;
                            break L9;
                          }
                          if (var4 == 0) {
                            continue L8;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  re.field_l = hh.field_e;
                  stackOut_28_0 = param0;
                  stackOut_28_1 = 112;
                  stackIn_29_0 = stackOut_28_0;
                  stackIn_29_1 = stackOut_28_1;
                  break L2;
                }
                break L1;
              }
            }
            L11: {
              if (stackIn_29_0 == stackIn_29_1) {
                break L11;
              } else {
                field_z = 45;
                break L11;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw kg.a((Throwable) (Object) runtimeException, "th.E(" + param0 + ')');
        }
    }

    final static boolean a(byte param0, int param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_6_0 = 0;
        try {
          L0: {
            L1: {
              var4_int = -93 % ((13 - param0) / 45);
              if (param3 < 0) {
                break L1;
              } else {
                if (param3 > 11) {
                  break L1;
                } else {
                  L2: {
                    if (param2 < 1) {
                      break L2;
                    } else {
                      if (~kb.a(false, param1, param3) <= ~param2) {
                        stackOut_14_0 = 1;
                        stackIn_15_0 = stackOut_14_0;
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0 != 0;
                }
              }
            }
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            return stackIn_7_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var4, "th.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_15_0 != 0;
    }

    private final void a(int param0, int param1, jc param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        lc var7 = null;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_16_0 = null;
        Object stackIn_42_0 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_15_0 = null;
        Object stackOut_40_0 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        var9 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    if (param0 == 1) {
                      break L4;
                    } else {
                      L5: {
                        if (param0 == 2) {
                          break L5;
                        } else {
                          if (param0 == 3) {
                            var4_int = param2.g(11132);
                            ((th) this).field_x = new int[var4_int];
                            ((th) this).field_v = new int[var4_int][];
                            var5 = 0;
                            L6: while (true) {
                              L7: {
                                if (var5 >= var4_int) {
                                  break L7;
                                } else {
                                  var6 = param2.c((byte) 97);
                                  var7 = vb.a((byte) 0, var6);
                                  stackOut_15_0 = null;
                                  stackIn_42_0 = stackOut_15_0;
                                  stackIn_16_0 = stackOut_15_0;
                                  if (var9 != 0) {
                                    break L2;
                                  } else {
                                    L8: {
                                      L9: {
                                        if (stackIn_16_0 != (Object) (Object) var7) {
                                          ((th) this).field_x[var5] = var6;
                                          ((th) this).field_v[var5] = new int[var7.field_g];
                                          var8 = 0;
                                          L10: while (true) {
                                            if (var7.field_g <= var8) {
                                              break L9;
                                            } else {
                                              ((th) this).field_v[var5][var8] = param2.c((byte) 50);
                                              var8++;
                                              if (var9 != 0) {
                                                break L8;
                                              } else {
                                                if (var9 == 0) {
                                                  continue L10;
                                                } else {
                                                  break L9;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          break L9;
                                        }
                                      }
                                      var5++;
                                      break L8;
                                    }
                                    if (var9 == 0) {
                                      continue L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              if (var9 == 0) {
                                break L3;
                              } else {
                                break L5;
                              }
                            }
                          } else {
                            if (param0 == 4) {
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      var4_int = param2.g(11132);
                      ((th) this).field_u = new int[var4_int];
                      var5 = 0;
                      L11: while (true) {
                        L12: {
                          if (~var4_int >= ~var5) {
                            break L12;
                          } else {
                            ((th) this).field_u[var5] = param2.c((byte) 110);
                            var5++;
                            if (var9 != 0) {
                              break L3;
                            } else {
                              if (var9 == 0) {
                                continue L11;
                              } else {
                                break L12;
                              }
                            }
                          }
                        }
                        if (var9 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  ((th) this).field_w = ql.a(param2.h(-122), (byte) -123, '<');
                  break L3;
                }
                if (param1 == 60) {
                  break L1;
                } else {
                  stackOut_40_0 = null;
                  stackIn_42_0 = stackOut_40_0;
                  break L2;
                }
              }
              field_t = (dl) (Object) stackIn_42_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var4 = decompiledCaughtException;
            stackOut_44_0 = (RuntimeException) var4;
            stackOut_44_1 = new StringBuilder().append("th.A(").append(param0).append(',').append(param1).append(',');
            stackIn_47_0 = stackOut_44_0;
            stackIn_47_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param2 == null) {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L13;
            } else {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "{...}";
              stackIn_48_0 = stackOut_45_0;
              stackIn_48_1 = stackOut_45_1;
              stackIn_48_2 = stackOut_45_2;
              break L13;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_48_0, stackIn_48_2 + ')');
        }
    }

    th() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new dl();
        field_r = "Average rating";
        field_s = "Resign";
    }
}
