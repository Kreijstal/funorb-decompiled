/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg extends jp {
    private kj field_g;
    static String field_v;
    private rn field_y;
    private rf field_i;
    private int field_n;
    private int field_m;
    private int field_f;
    static char[] field_h;
    private byte[] field_e;
    static int[] field_z;
    private nl field_j;
    private gm field_r;
    private gn field_o;
    private byte[] field_s;
    private rn field_u;
    private bb field_w;
    private boolean field_q;
    private boolean field_k;
    private bb field_l;
    private int field_x;
    private long field_t;
    private boolean field_p;

    final byte[] a(int param0, int param1) {
        gn var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        byte[] var5 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            var4 = 18 / ((param1 - 33) / 43);
            var3 = this.a(param0, 0, true);
            if (null != var3) {
              var5 = var3.h(0);
              var3.c(2779);
              stackOut_3_0 = (byte[]) var5;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3_ref, "gg.B(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final void f(byte param0) {
        RuntimeException var2 = null;
        fa var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (((gg) this).field_w == null) {
              return;
            } else {
              L1: {
                if (param0 == 29) {
                  break L1;
                } else {
                  field_h = null;
                  break L1;
                }
              }
              if (null == ((gg) this).a((byte) 36)) {
                return;
              } else {
                var2_ref = ((gg) this).field_l.c(param0 + 1504642244);
                L2: while (true) {
                  L3: {
                    L4: {
                      if (null == var2_ref) {
                        break L4;
                      } else {
                        var3 = (int)var2_ref.field_e;
                        if (var4 != 0) {
                          break L3;
                        } else {
                          L5: {
                            L6: {
                              L7: {
                                if (var3 < 0) {
                                  break L7;
                                } else {
                                  if (~var3 <= ~((gg) this).field_g.field_b) {
                                    break L7;
                                  } else {
                                    if (((gg) this).field_g.field_h[var3] == 0) {
                                      break L7;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                              var2_ref.c(2779);
                              if (var4 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                            L8: {
                              if (((gg) this).field_s[var3] == 0) {
                                gn discarded$2 = this.a(var3, 1, true);
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            L9: {
                              if (((gg) this).field_s[var3] == -1) {
                                gn discarded$3 = this.a(var3, 2, true);
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            if (1 == ((gg) this).field_s[var3]) {
                              var2_ref.c(2779);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          var2_ref = ((gg) this).field_l.f(1504642273);
                          if (var4 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    break L3;
                  }
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "gg.H(" + param0 + ')');
        }
    }

    private final gn a(int param0, int param1, boolean param2) {
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
        Object stackIn_36_0 = null;
        Object stackIn_54_0 = null;
        Object stackIn_58_0 = null;
        byte stackIn_77_0 = 0;
        byte stackIn_77_1 = 0;
        Object stackIn_91_0 = null;
        int stackIn_96_0 = 0;
        int stackIn_96_1 = 0;
        Object stackIn_103_0 = null;
        int stackIn_124_0 = 0;
        int stackIn_124_1 = 0;
        int stackIn_131_0 = 0;
        int stackIn_131_1 = 0;
        Object stackIn_144_0 = null;
        Object stackIn_151_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_35_0 = null;
        Object stackOut_53_0 = null;
        int stackOut_123_0 = 0;
        int stackOut_123_1 = 0;
        int stackOut_130_0 = 0;
        int stackOut_130_1 = 0;
        Object stackOut_143_0 = null;
        byte stackOut_76_0 = 0;
        byte stackOut_76_1 = 0;
        Object stackOut_90_0 = null;
        int stackOut_95_0 = 0;
        int stackOut_95_1 = 0;
        Object stackOut_102_0 = null;
        Object stackOut_57_0 = null;
        Object stackOut_150_0 = null;
        var10 = Pixelate.field_H ? 1 : 0;
        try {
          try {
            L0: {
              var4 = (Object) (Object) (gn) (Object) ((gg) this).field_j.a(-25484, (long)param0);
              if (param2) {
                break L0;
              } else {
                gn discarded$2 = this.a(37, -122, true);
                break L0;
              }
            }
            L1: {
              if (null == var4) {
                break L1;
              } else {
                if (0 != param1) {
                  break L1;
                } else {
                  if (((gn) var4).field_t) {
                    break L1;
                  } else {
                    if (!((gn) var4).field_v) {
                      break L1;
                    } else {
                      ((gn) var4).c(2779);
                      var4 = null;
                      break L1;
                    }
                  }
                }
              }
            }
            L2: {
              if (var4 == null) {
                L3: {
                  L4: {
                    if (0 == param1) {
                      break L4;
                    } else {
                      if (1 == param1) {
                        if (null != ((gg) this).field_y) {
                          var4 = (Object) (Object) ((gg) this).field_r.a(param0, 3, ((gg) this).field_y);
                          if (var10 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        if (2 != param1) {
                          throw new RuntimeException();
                        } else {
                          if (((gg) this).field_y != null) {
                            if (((gg) this).field_s[param0] == -1) {
                              L5: {
                                if (((gg) this).field_i.d((byte) 86)) {
                                  break L5;
                                } else {
                                  var4 = (Object) (Object) ((gg) this).field_i.a((byte) -31, ((gg) this).field_m, false, param0, (byte) 2);
                                  if (var10 == 0) {
                                    break L3;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              stackOut_35_0 = null;
                              stackIn_36_0 = stackOut_35_0;
                              return (gn) (Object) stackIn_36_0;
                            } else {
                              throw new RuntimeException();
                            }
                          } else {
                            throw new RuntimeException();
                          }
                        }
                      }
                    }
                  }
                  L6: {
                    if (((gg) this).field_y == null) {
                      break L6;
                    } else {
                      if (((gg) this).field_s[param0] == -1) {
                        break L6;
                      } else {
                        var4 = (Object) (Object) ((gg) this).field_r.a(param0, ((gg) this).field_y, 116);
                        if (var10 == 0) {
                          break L3;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  L7: {
                    if (((gg) this).field_i.a(20)) {
                      break L7;
                    } else {
                      var4 = (Object) (Object) ((gg) this).field_i.a((byte) -31, ((gg) this).field_m, true, param0, (byte) 2);
                      if (var10 == 0) {
                        break L3;
                      } else {
                        break L7;
                      }
                    }
                  }
                  stackOut_53_0 = null;
                  stackIn_54_0 = stackOut_53_0;
                  return (gn) (Object) stackIn_54_0;
                }
                ((gg) this).field_j.a((long)param0, 127, (fa) var4);
                break L2;
              } else {
                break L2;
              }
            }
            if (!((gn) var4).field_v) {
              var5 = ((gn) var4).h(0);
              if (var4 instanceof cg) {
                L8: {
                  if (null == var5) {
                    break L8;
                  } else {
                    if (var5.length <= 2) {
                      break L8;
                    } else {
                      ra.field_h.reset();
                      ra.field_h.update(var5, 0, -2 + var5.length);
                      var6_int = (int)ra.field_h.getValue();
                      if (var6_int != ((gg) this).field_g.field_k[param0]) {
                        throw new RuntimeException();
                      } else {
                        L9: {
                          L10: {
                            if (((gg) this).field_g.field_d == null) {
                              break L10;
                            } else {
                              if (null != ((gg) this).field_g.field_d[param0]) {
                                var7_ref_byte__ = ((gg) this).field_g.field_d[param0];
                                var8 = db.a(var5, 0, 1761872464, -2 + var5.length);
                                var9 = 0;
                                L11: while (true) {
                                  if (64 <= var9) {
                                    break L10;
                                  } else {
                                    stackOut_123_0 = ~var8[var9];
                                    stackOut_123_1 = ~var7_ref_byte__[var9];
                                    stackIn_131_0 = stackOut_123_0;
                                    stackIn_131_1 = stackOut_123_1;
                                    stackIn_124_0 = stackOut_123_0;
                                    stackIn_124_1 = stackOut_123_1;
                                    if (var10 != 0) {
                                      break L9;
                                    } else {
                                      if (stackIn_124_0 == stackIn_124_1) {
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
                          stackOut_130_0 = 65280 & var5[-2 + var5.length] << -1296059800;
                          stackOut_130_1 = 255 & var5[var5.length + -1];
                          stackIn_131_0 = stackOut_130_0;
                          stackIn_131_1 = stackOut_130_1;
                          break L9;
                        }
                        var7 = stackIn_131_0 + stackIn_131_1;
                        if (var7 != (65535 & ((gg) this).field_g.field_a[param0])) {
                          throw new RuntimeException();
                        } else {
                          L12: {
                            if (((gg) this).field_s[param0] != 1) {
                              L13: {
                                if (0 != ((gg) this).field_s[param0]) {
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              ((gg) this).field_s[param0] = (byte) 1;
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          L14: {
                            if (((gn) var4).field_t) {
                              break L14;
                            } else {
                              ((gn) var4).c(2779);
                              break L14;
                            }
                          }
                          stackOut_143_0 = var4;
                          stackIn_144_0 = stackOut_143_0;
                          return (gn) (Object) stackIn_144_0;
                        }
                      }
                    }
                  }
                }
                throw new RuntimeException();
              } else {
                try {
                  L15: {
                    L16: {
                      if (null == var5) {
                        break L16;
                      } else {
                        if (var5.length > 2) {
                          ra.field_h.reset();
                          ra.field_h.update(var5, 0, -2 + var5.length);
                          var6_int = (int)ra.field_h.getValue();
                          if (var6_int != ((gg) this).field_g.field_k[param0]) {
                            throw new RuntimeException();
                          } else {
                            L17: {
                              if (null == ((gg) this).field_g.field_d) {
                                break L17;
                              } else {
                                if (null == ((gg) this).field_g.field_d[param0]) {
                                  break L17;
                                } else {
                                  var7_ref_byte__ = ((gg) this).field_g.field_d[param0];
                                  var8 = db.a(var5, 0, 1761872464, -2 + var5.length);
                                  var9 = 0;
                                  L18: while (true) {
                                    if (var9 >= 64) {
                                      break L17;
                                    } else {
                                      stackOut_76_0 = var8[var9];
                                      stackOut_76_1 = var7_ref_byte__[var9];
                                      stackIn_96_0 = stackOut_76_0;
                                      stackIn_96_1 = stackOut_76_1;
                                      stackIn_77_0 = stackOut_76_0;
                                      stackIn_77_1 = stackOut_76_1;
                                      if (var10 != 0) {
                                        decompiledRegionSelector0 = 0;
                                        break L15;
                                      } else {
                                        if (stackIn_77_0 != stackIn_77_1) {
                                          throw new RuntimeException();
                                        } else {
                                          var9++;
                                          if (var10 == 0) {
                                            continue L18;
                                          } else {
                                            break L17;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            ((gg) this).field_i.field_h = 0;
                            ((gg) this).field_i.field_m = 0;
                            decompiledRegionSelector0 = 1;
                            break L15;
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
                    ((gg) this).field_i.e((byte) 0);
                    ((gn) var4).c(2779);
                    if (!((gn) var4).field_t) {
                      break L19;
                    } else {
                      if (((gg) this).field_i.a(20)) {
                        break L19;
                      } else {
                        var4 = (Object) (Object) ((gg) this).field_i.a((byte) -31, ((gg) this).field_m, true, param0, (byte) 2);
                        ((gg) this).field_j.a((long)param0, 127, (fa) var4);
                        break L19;
                      }
                    }
                  }
                  stackOut_90_0 = null;
                  stackIn_91_0 = stackOut_90_0;
                  return (gn) (Object) stackIn_91_0;
                }
                L20: {
                  L21: {
                    if (decompiledRegionSelector0 == 0) {
                      break L21;
                    } else {
                      var5[var5.length - 2] = (byte)(((gg) this).field_g.field_a[param0] >>> -1775395832);
                      var5[-1 + var5.length] = (byte)((gg) this).field_g.field_a[param0];
                      if (((gg) this).field_y != null) {
                        cg discarded$3 = ((gg) this).field_r.a(param0, 45, ((gg) this).field_y, var5);
                        stackOut_95_0 = -2;
                        stackOut_95_1 = ~((gg) this).field_s[param0];
                        stackIn_96_0 = stackOut_95_0;
                        stackIn_96_1 = stackOut_95_1;
                        break L21;
                      } else {
                        break L20;
                      }
                    }
                  }
                  if (stackIn_96_0 != stackIn_96_1) {
                    ((gg) this).field_s[param0] = (byte) 1;
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L22: {
                  if (((gn) var4).field_t) {
                    break L22;
                  } else {
                    ((gn) var4).c(2779);
                    break L22;
                  }
                }
                stackOut_102_0 = var4;
                stackIn_103_0 = stackOut_102_0;
                return (gn) (Object) stackIn_103_0;
              }
            } else {
              stackOut_57_0 = null;
              stackIn_58_0 = stackOut_57_0;
              return (gn) (Object) stackIn_58_0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            L23: {
              var6_ref = (Exception) (Object) decompiledCaughtException;
              ((gg) this).field_s[param0] = (byte) -1;
              ((gn) var4).c(2779);
              if (((gn) var4).field_t) {
                if (((gg) this).field_i.a(20)) {
                  break L23;
                } else {
                  var4 = (Object) (Object) ((gg) this).field_i.a((byte) -31, ((gg) this).field_m, true, param0, (byte) 2);
                  ((gg) this).field_j.a((long)param0, 127, (fa) var4);
                  break L23;
                }
              } else {
                break L23;
              }
            }
            stackOut_150_0 = null;
            stackIn_151_0 = stackOut_150_0;
            return (gn) (Object) stackIn_151_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (Object) (Object) decompiledCaughtException;
          throw aa.a((Throwable) var4, "gg.L(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int b(int param0, int param1) {
        gn var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 == 8192) {
                break L1;
              } else {
                id discarded$2 = gg.d((byte) 22);
                break L1;
              }
            }
            var3 = (gn) (Object) ((gg) this).field_j.a(-25484, (long)param0);
            if (var3 == null) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = var3.g(param1 ^ -8303);
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3_ref, "gg.D(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final void a(boolean param0) {
        if (!(null != ((gg) this).field_y)) {
            return;
        }
        try {
            ((gg) this).field_q = param0;
            if (((gg) this).field_w == null) {
                ((gg) this).field_w = new bb();
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "gg.J(" + param0 + ')');
        }
    }

    final static void a(boolean param0, String[][] param1, byte[] param2, fm param3, String[] param4, byte[] param5, tf[][] param6, int param7, int param8, tf[][] param9, fm param10, int param11, String[][] param12, fm param13, int[] param14) {
        RuntimeException var15 = null;
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
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
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
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        try {
          L0: {
            L1: {
              ro.a(param0, param6, param8, -15690, param10, param4, param14, param1, (hh[]) null, param7, (int[]) null, param2, param12, param3, param9, param5, param13);
              if (param11 > 6) {
                break L1;
              } else {
                id discarded$1 = gg.d((byte) 43);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var15 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var15;
            stackOut_3_1 = new StringBuilder().append("gg.I(").append(param0).append(',');
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
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
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param4 == null) {
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
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param5 == null) {
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
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param6 == null) {
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
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param7).append(',').append(param8).append(',');
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param9 == null) {
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
          L9: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');
            stackIn_34_0 = stackOut_31_0;
            stackIn_34_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param10 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L9;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_35_0 = stackOut_32_0;
              stackIn_35_1 = stackOut_32_1;
              stackIn_35_2 = stackOut_32_2;
              break L9;
            }
          }
          L10: {
            stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
            stackOut_35_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',').append(param11).append(',');
            stackIn_38_0 = stackOut_35_0;
            stackIn_38_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param12 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L10;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_39_0 = stackOut_36_0;
              stackIn_39_1 = stackOut_36_1;
              stackIn_39_2 = stackOut_36_2;
              break L10;
            }
          }
          L11: {
            stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
            stackOut_39_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',');
            stackIn_42_0 = stackOut_39_0;
            stackIn_42_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param13 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L11;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_43_0 = stackOut_40_0;
              stackIn_43_1 = stackOut_40_1;
              stackIn_43_2 = stackOut_40_2;
              break L11;
            }
          }
          L12: {
            stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
            stackOut_43_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_43_2).append(',');
            stackIn_46_0 = stackOut_43_0;
            stackIn_46_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param14 == null) {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L12;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_47_0 = stackOut_44_0;
              stackIn_47_1 = stackOut_44_1;
              stackIn_47_2 = stackOut_44_2;
              break L12;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_47_0, stackIn_47_2 + ')');
        }
    }

    final void b(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        gn var2_ref = null;
        fa var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_10_0 = 0;
        byte stackIn_10_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_55_0 = 0;
        byte stackIn_55_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_91_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        byte stackOut_9_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_44_0 = 0;
        int stackOut_54_0 = 0;
        byte stackOut_54_1 = 0;
        int stackOut_68_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_66_1 = 0;
        int stackOut_90_0 = 0;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((gg) this).field_w != null) {
                if (null != ((gg) this).a((byte) 36)) {
                  L2: {
                    if (!((gg) this).field_k) {
                      break L2;
                    } else {
                      var2_int = 1;
                      var3 = ((gg) this).field_w.c(1504642273);
                      L3: while (true) {
                        L4: {
                          L5: {
                            L6: {
                              if (var3 == null) {
                                break L6;
                              } else {
                                var4 = (int)var3.field_e;
                                stackOut_9_0 = 0;
                                stackOut_9_1 = ((gg) this).field_s[var4];
                                stackIn_21_0 = stackOut_9_0;
                                stackIn_21_1 = stackOut_9_1;
                                stackIn_10_0 = stackOut_9_0;
                                stackIn_10_1 = stackOut_9_1;
                                if (var5 != 0) {
                                  L7: while (true) {
                                    if (stackIn_21_0 <= stackIn_21_1) {
                                      break L5;
                                    } else {
                                      stackOut_22_0 = 0;
                                      stackIn_45_0 = stackOut_22_0;
                                      stackIn_23_0 = stackOut_22_0;
                                      if (var5 != 0) {
                                        break L4;
                                      } else {
                                        stackOut_23_0 = stackIn_23_0;
                                        stackIn_25_0 = stackOut_23_0;
                                        L8: {
                                          L9: {
                                            if (stackIn_25_0 != ((gg) this).field_g.field_h[((gg) this).field_x]) {
                                              break L9;
                                            } else {
                                              ((gg) this).field_x = ((gg) this).field_x + 1;
                                              if (var5 == 0) {
                                                break L8;
                                              } else {
                                                break L9;
                                              }
                                            }
                                          }
                                          L10: {
                                            if (250 > ((gg) this).field_r.field_c) {
                                              break L10;
                                            } else {
                                              var2_int = 0;
                                              if (var5 == 0) {
                                                break L5;
                                              } else {
                                                break L10;
                                              }
                                            }
                                          }
                                          L11: {
                                            if (((gg) this).field_s[((gg) this).field_x] == 0) {
                                              gn discarded$5 = this.a(((gg) this).field_x, 1, true);
                                              break L11;
                                            } else {
                                              break L11;
                                            }
                                          }
                                          L12: {
                                            if (0 == ((gg) this).field_s[((gg) this).field_x]) {
                                              var3 = new fa();
                                              var3.field_e = (long)((gg) this).field_x;
                                              ((gg) this).field_w.a(22125, var3);
                                              var2_int = 0;
                                              break L12;
                                            } else {
                                              break L12;
                                            }
                                          }
                                          ((gg) this).field_x = ((gg) this).field_x + 1;
                                          if (var5 == 0) {
                                            break L8;
                                          } else {
                                            break L5;
                                          }
                                        }
                                        stackOut_20_0 = ((gg) this).field_g.field_h.length;
                                        stackOut_20_1 = ((gg) this).field_x;
                                        stackIn_21_0 = stackOut_20_0;
                                        stackIn_21_1 = stackOut_20_1;
                                        continue L7;
                                      }
                                    }
                                  }
                                } else {
                                  L13: {
                                    if (stackIn_10_0 != stackIn_10_1) {
                                      break L13;
                                    } else {
                                      gn discarded$6 = this.a(var4, 1, true);
                                      break L13;
                                    }
                                  }
                                  L14: {
                                    L15: {
                                      if (((gg) this).field_s[var4] != 0) {
                                        break L15;
                                      } else {
                                        var2_int = 0;
                                        if (var5 == 0) {
                                          break L14;
                                        } else {
                                          break L15;
                                        }
                                      }
                                    }
                                    var3.c(2779);
                                    break L14;
                                  }
                                  var3 = ((gg) this).field_w.f(1504642273);
                                  if (var5 == 0) {
                                    continue L3;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            L16: while (true) {
                              stackOut_20_0 = ((gg) this).field_g.field_h.length;
                              stackOut_20_1 = ((gg) this).field_x;
                              stackIn_21_0 = stackOut_20_0;
                              stackIn_21_1 = stackOut_20_1;
                              if (stackIn_21_0 <= stackIn_21_1) {
                                break L5;
                              } else {
                                stackOut_22_0 = 0;
                                stackIn_45_0 = stackOut_22_0;
                                stackIn_23_0 = stackOut_22_0;
                                if (var5 != 0) {
                                  break L4;
                                } else {
                                  stackOut_23_0 = stackIn_23_0;
                                  stackIn_25_0 = stackOut_23_0;
                                  L17: {
                                    if (stackIn_25_0 != ((gg) this).field_g.field_h[((gg) this).field_x]) {
                                      break L17;
                                    } else {
                                      ((gg) this).field_x = ((gg) this).field_x + 1;
                                      if (var5 == 0) {
                                        continue L16;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                  L18: {
                                    if (250 > ((gg) this).field_r.field_c) {
                                      break L18;
                                    } else {
                                      var2_int = 0;
                                      if (var5 == 0) {
                                        break L5;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                  L19: {
                                    if (((gg) this).field_s[((gg) this).field_x] == 0) {
                                      gn discarded$5 = this.a(((gg) this).field_x, 1, true);
                                      break L19;
                                    } else {
                                      break L19;
                                    }
                                  }
                                  L20: {
                                    if (0 == ((gg) this).field_s[((gg) this).field_x]) {
                                      var3 = new fa();
                                      var3.field_e = (long)((gg) this).field_x;
                                      ((gg) this).field_w.a(22125, var3);
                                      var2_int = 0;
                                      break L20;
                                    } else {
                                      break L20;
                                    }
                                  }
                                  ((gg) this).field_x = ((gg) this).field_x + 1;
                                  if (var5 == 0) {
                                    continue L16;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_44_0 = var2_int;
                          stackIn_45_0 = stackOut_44_0;
                          break L4;
                        }
                        L21: {
                          if (stackIn_45_0 == 0) {
                            break L21;
                          } else {
                            ((gg) this).field_k = false;
                            ((gg) this).field_x = 0;
                            break L21;
                          }
                        }
                        if (var5 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L22: {
                    if (!((gg) this).field_q) {
                      break L22;
                    } else {
                      var2_int = 1;
                      var3 = ((gg) this).field_w.c(param0 ^ 1504642273);
                      L23: while (true) {
                        L24: {
                          L25: {
                            L26: {
                              if (var3 == null) {
                                break L26;
                              } else {
                                var4 = (int)var3.field_e;
                                stackOut_54_0 = 1;
                                stackOut_54_1 = ((gg) this).field_s[var4];
                                stackIn_67_0 = stackOut_54_0;
                                stackIn_67_1 = stackOut_54_1;
                                stackIn_55_0 = stackOut_54_0;
                                stackIn_55_1 = stackOut_54_1;
                                if (var5 != 0) {
                                  L27: while (true) {
                                    if (stackIn_67_0 <= stackIn_67_1) {
                                      break L25;
                                    } else {
                                      stackOut_68_0 = ~((gg) this).field_g.field_h[((gg) this).field_x];
                                      stackIn_91_0 = stackOut_68_0;
                                      stackIn_69_0 = stackOut_68_0;
                                      if (var5 != 0) {
                                        break L24;
                                      } else {
                                        stackOut_69_0 = stackIn_69_0;
                                        stackIn_71_0 = stackOut_69_0;
                                        L28: {
                                          L29: {
                                            if (stackIn_71_0 != -1) {
                                              break L29;
                                            } else {
                                              ((gg) this).field_x = ((gg) this).field_x + 1;
                                              if (var5 == 0) {
                                                break L28;
                                              } else {
                                                break L29;
                                              }
                                            }
                                          }
                                          L30: {
                                            if (((gg) this).field_i.d((byte) 97)) {
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
                                            if (1 != ((gg) this).field_s[((gg) this).field_x]) {
                                              gn discarded$7 = this.a(((gg) this).field_x, 2, true);
                                              break L31;
                                            } else {
                                              break L31;
                                            }
                                          }
                                          L32: {
                                            if (((gg) this).field_s[((gg) this).field_x] == 1) {
                                              break L32;
                                            } else {
                                              var3 = new fa();
                                              var3.field_e = (long)((gg) this).field_x;
                                              ((gg) this).field_w.a(22125, var3);
                                              var2_int = 0;
                                              break L32;
                                            }
                                          }
                                          ((gg) this).field_x = ((gg) this).field_x + 1;
                                          if (var5 == 0) {
                                            break L28;
                                          } else {
                                            break L25;
                                          }
                                        }
                                        stackOut_66_0 = ~((gg) this).field_x;
                                        stackOut_66_1 = ~((gg) this).field_g.field_h.length;
                                        stackIn_67_0 = stackOut_66_0;
                                        stackIn_67_1 = stackOut_66_1;
                                        continue L27;
                                      }
                                    }
                                  }
                                } else {
                                  L33: {
                                    if (stackIn_55_0 == stackIn_55_1) {
                                      break L33;
                                    } else {
                                      gn discarded$8 = this.a(var4, 2, true);
                                      break L33;
                                    }
                                  }
                                  L34: {
                                    L35: {
                                      if (((gg) this).field_s[var4] != 1) {
                                        break L35;
                                      } else {
                                        var3.c(param0 ^ 2779);
                                        if (var5 == 0) {
                                          break L34;
                                        } else {
                                          break L35;
                                        }
                                      }
                                    }
                                    var2_int = 0;
                                    break L34;
                                  }
                                  var3 = ((gg) this).field_w.f(1504642273);
                                  if (var5 == 0) {
                                    continue L23;
                                  } else {
                                    break L26;
                                  }
                                }
                              }
                            }
                            L36: while (true) {
                              stackOut_66_0 = ~((gg) this).field_x;
                              stackOut_66_1 = ~((gg) this).field_g.field_h.length;
                              stackIn_67_0 = stackOut_66_0;
                              stackIn_67_1 = stackOut_66_1;
                              if (stackIn_67_0 <= stackIn_67_1) {
                                break L25;
                              } else {
                                stackOut_68_0 = ~((gg) this).field_g.field_h[((gg) this).field_x];
                                stackIn_91_0 = stackOut_68_0;
                                stackIn_69_0 = stackOut_68_0;
                                if (var5 != 0) {
                                  break L24;
                                } else {
                                  stackOut_69_0 = stackIn_69_0;
                                  stackIn_71_0 = stackOut_69_0;
                                  L37: {
                                    if (stackIn_71_0 != -1) {
                                      break L37;
                                    } else {
                                      ((gg) this).field_x = ((gg) this).field_x + 1;
                                      if (var5 == 0) {
                                        continue L36;
                                      } else {
                                        break L37;
                                      }
                                    }
                                  }
                                  L38: {
                                    if (((gg) this).field_i.d((byte) 97)) {
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
                                    if (1 != ((gg) this).field_s[((gg) this).field_x]) {
                                      gn discarded$7 = this.a(((gg) this).field_x, 2, true);
                                      break L39;
                                    } else {
                                      break L39;
                                    }
                                  }
                                  L40: {
                                    if (((gg) this).field_s[((gg) this).field_x] == 1) {
                                      break L40;
                                    } else {
                                      var3 = new fa();
                                      var3.field_e = (long)((gg) this).field_x;
                                      ((gg) this).field_w.a(22125, var3);
                                      var2_int = 0;
                                      break L40;
                                    }
                                  }
                                  ((gg) this).field_x = ((gg) this).field_x + 1;
                                  if (var5 == 0) {
                                    continue L36;
                                  } else {
                                    break L25;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_90_0 = var2_int;
                          stackIn_91_0 = stackOut_90_0;
                          break L24;
                        }
                        L41: {
                          if (stackIn_91_0 != 0) {
                            ((gg) this).field_x = 0;
                            ((gg) this).field_q = false;
                            break L41;
                          } else {
                            break L41;
                          }
                        }
                        if (var5 == 0) {
                          break L1;
                        } else {
                          break L22;
                        }
                      }
                    }
                  }
                  ((gg) this).field_w = null;
                  break L1;
                } else {
                  return;
                }
              } else {
                break L1;
              }
            }
            L42: {
              if (param0 == 0) {
                break L42;
              } else {
                gn discarded$9 = this.a(112, 27, true);
                break L42;
              }
            }
            L43: {
              if (!((gg) this).field_p) {
                break L43;
              } else {
                if (~hm.a(64) > ~((gg) this).field_t) {
                  break L43;
                } else {
                  var2_ref = (gn) (Object) ((gg) this).field_j.a((byte) -99);
                  L44: while (true) {
                    L45: {
                      if (null == var2_ref) {
                        break L45;
                      } else {
                        if (var5 != 0) {
                          break L43;
                        } else {
                          L46: {
                            L47: {
                              if (!var2_ref.field_v) {
                                break L47;
                              } else {
                                if (var5 == 0) {
                                  break L46;
                                } else {
                                  break L47;
                                }
                              }
                            }
                            L48: {
                              if (!var2_ref.field_x) {
                                break L48;
                              } else {
                                if (!var2_ref.field_t) {
                                  throw new RuntimeException();
                                } else {
                                  var2_ref.c(param0 + 2779);
                                  if (var5 == 0) {
                                    break L46;
                                  } else {
                                    break L48;
                                  }
                                }
                              }
                            }
                            var2_ref.field_x = true;
                            break L46;
                          }
                          var2_ref = (gn) (Object) ((gg) this).field_j.a(-123);
                          if (var5 == 0) {
                            continue L44;
                          } else {
                            break L45;
                          }
                        }
                      }
                    }
                    ((gg) this).field_t = 1000L + hm.a(64);
                    break L43;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "gg.O(" + param0 + ')');
        }
    }

    final kj a(byte param0) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        RuntimeException var3 = null;
        int var4 = 0;
        kj stackIn_8_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_20_0 = null;
        Object stackIn_37_0 = null;
        Object stackIn_51_0 = null;
        kj stackIn_60_0 = null;
        RuntimeException decompiledCaughtException = null;
        kj stackOut_7_0 = null;
        Object stackOut_15_0 = null;
        Object stackOut_50_0 = null;
        Object stackOut_36_0 = null;
        kj stackOut_59_0 = null;
        Object stackOut_19_0 = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 36) {
                break L1;
              } else {
                int discarded$2 = ((gg) this).b(-6, -35);
                break L1;
              }
            }
            if (((gg) this).field_g != null) {
              stackOut_7_0 = ((gg) this).field_g;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            } else {
              L2: {
                if (((gg) this).field_o == null) {
                  if (((gg) this).field_i.a(20)) {
                    stackOut_15_0 = null;
                    stackIn_16_0 = stackOut_15_0;
                    return (kj) (Object) stackIn_16_0;
                  } else {
                    ((gg) this).field_o = (gn) (Object) ((gg) this).field_i.a((byte) -31, 255, true, ((gg) this).field_m, (byte) 0);
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              if (!((gg) this).field_o.field_v) {
                L3: {
                  var2_array = ((gg) this).field_o.h(0);
                  if (!(((gg) this).field_o instanceof cg)) {
                    try {
                      L4: {
                        if (null == var2_array) {
                          throw new RuntimeException();
                        } else {
                          ((gg) this).field_g = new kj(var2_array, ((gg) this).field_n, ((gg) this).field_e);
                          break L4;
                        }
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        L6: {
                          var3 = decompiledCaughtException;
                          ((gg) this).field_i.e((byte) 0);
                          ((gg) this).field_g = null;
                          if (((gg) this).field_i.a(param0 ^ 48)) {
                            break L6;
                          } else {
                            ((gg) this).field_o = (gn) (Object) ((gg) this).field_i.a((byte) -31, 255, true, ((gg) this).field_m, (byte) 0);
                            if (var4 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        ((gg) this).field_o = null;
                        break L5;
                      }
                      stackOut_50_0 = null;
                      stackIn_51_0 = stackOut_50_0;
                      return (kj) (Object) stackIn_51_0;
                    }
                    if (null == ((gg) this).field_u) {
                      break L3;
                    } else {
                      cg discarded$3 = ((gg) this).field_r.a(((gg) this).field_m, 93, ((gg) this).field_u, var2_array);
                      break L3;
                    }
                  } else {
                    try {
                      L7: {
                        if (var2_array == null) {
                          throw new RuntimeException();
                        } else {
                          ((gg) this).field_g = new kj(var2_array, ((gg) this).field_n, ((gg) this).field_e);
                          if (~((gg) this).field_g.field_c == ~((gg) this).field_f) {
                            break L7;
                          } else {
                            throw new RuntimeException();
                          }
                        }
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L8: {
                        L9: {
                          var3 = decompiledCaughtException;
                          ((gg) this).field_g = null;
                          if (((gg) this).field_i.a(20)) {
                            break L9;
                          } else {
                            ((gg) this).field_o = (gn) (Object) ((gg) this).field_i.a((byte) -31, 255, true, ((gg) this).field_m, (byte) 0);
                            if (var4 == 0) {
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                        ((gg) this).field_o = null;
                        break L8;
                      }
                      stackOut_36_0 = null;
                      stackIn_37_0 = stackOut_36_0;
                      return (kj) (Object) stackIn_37_0;
                    }
                    break L3;
                  }
                }
                L10: {
                  if (((gg) this).field_y != null) {
                    ((gg) this).field_s = new byte[((gg) this).field_g.field_b];
                    break L10;
                  } else {
                    break L10;
                  }
                }
                ((gg) this).field_o = null;
                stackOut_59_0 = ((gg) this).field_g;
                stackIn_60_0 = stackOut_59_0;
                break L0;
              } else {
                stackOut_19_0 = null;
                stackIn_20_0 = stackOut_19_0;
                return (kj) (Object) stackIn_20_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "gg.C(" + param0 + ')');
        }
        return stackIn_60_0;
    }

    public static void e(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_h = null;
              if (param0 == 45) {
                break L1;
              } else {
                gg.a(true, (String[][]) null, (byte[]) null, (fm) null, (String[]) null, (byte[]) null, (tf[][]) null, -91, 127, (tf[][]) null, (fm) null, 112, (String[][]) null, (fm) null, (int[]) null);
                break L1;
              }
            }
            field_z = null;
            field_v = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "gg.N(" + param0 + ')');
        }
    }

    final static id d(byte param0) {
        RuntimeException var1 = null;
        id stackIn_11_0 = null;
        Object stackIn_13_0 = null;
        RuntimeException decompiledCaughtException = null;
        id stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        try {
          L0: {
            if (tm.field_X == wm.field_a) {
              throw new IllegalStateException();
            } else {
              L1: {
                if (param0 == 52) {
                  break L1;
                } else {
                  gg.e((byte) -37);
                  break L1;
                }
              }
              if (tm.field_X == h.field_N) {
                tm.field_X = wm.field_a;
                stackOut_10_0 = v.field_b;
                stackIn_11_0 = stackOut_10_0;
                return stackIn_11_0;
              } else {
                stackOut_12_0 = null;
                stackIn_13_0 = stackOut_12_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "gg.K(" + param0 + ')');
        }
        return (id) (Object) stackIn_13_0;
    }

    final static void c(byte param0) {
        jg.field_K = null;
        if (param0 != 24) {
            return;
        }
        try {
            a.field_L = null;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "gg.M(" + param0 + ')');
        }
    }

    gg(int param0, rn param1, rn param2, rf param3, gm param4, int param5, byte[] param6, int param7, boolean param8) {
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
        ((gg) this).field_j = new nl(16);
        ((gg) this).field_x = 0;
        ((gg) this).field_l = new bb();
        ((gg) this).field_t = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((gg) this).field_y = param1;
                ((gg) this).field_m = param0;
                if (((gg) this).field_y == null) {
                  break L2;
                } else {
                  ((gg) this).field_k = true;
                  ((gg) this).field_w = new bb();
                  if (!Pixelate.field_H) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((gg) this).field_k = false;
              break L1;
            }
            L3: {
              ((gg) this).field_u = param2;
              ((gg) this).field_i = param3;
              ((gg) this).field_n = param5;
              ((gg) this).field_e = param6;
              ((gg) this).field_p = param8;
              ((gg) this).field_r = param4;
              ((gg) this).field_f = param7;
              if (((gg) this).field_u != null) {
                ((gg) this).field_o = (gn) (Object) ((gg) this).field_r.a(((gg) this).field_m, ((gg) this).field_u, 118);
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
            stackOut_10_1 = new StringBuilder().append("gg.<init>(").append(param0).append(',');
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
          throw aa.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "<%0> has entered another game.";
        field_h = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        field_z = new int[32];
    }
}
