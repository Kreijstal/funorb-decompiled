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
        int var4 = 18 / ((param1 - 33) / 43);
        gn var3 = this.a(param0, 0, true);
        if (var3 == null) {
            return null;
        }
        byte[] var5 = var3.h(0);
        var3.c(2779);
        return var5;
    }

    final void f(byte param0) {
        fa var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = Pixelate.field_H ? 1 : 0;
        if (((gg) this).field_w == null) {
          return;
        } else {
          L0: {
            if (param0 == 29) {
              break L0;
            } else {
              field_h = null;
              break L0;
            }
          }
          if (null == ((gg) this).a((byte) 36)) {
            return;
          } else {
            var2 = ((gg) this).field_l.c(param0 + 1504642244);
            L1: while (true) {
              L2: {
                if (var2 == null) {
                  break L2;
                } else {
                  var3 = (int)var2.field_e;
                  if (var4 != 0) {
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        L5: {
                          if (var3 < 0) {
                            break L5;
                          } else {
                            if ((var3 ^ -1) <= (((gg) this).field_g.field_b ^ -1)) {
                              break L5;
                            } else {
                              if ((((gg) this).field_g.field_h[var3] ^ -1) == -1) {
                                break L5;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        var2.c(2779);
                        if (var4 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                      L6: {
                        if ((((gg) this).field_s[var3] ^ -1) == -1) {
                          gn discarded$4 = this.a(var3, 1, true);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        if ((((gg) this).field_s[var3] ^ -1) == 0) {
                          gn discarded$5 = this.a(var3, 2, true);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      if (1 == ((gg) this).field_s[var3]) {
                        var2.c(2779);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var2 = ((gg) this).field_l.f(1504642273);
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              return;
            }
          }
        }
    }

    private final gn a(int param0, int param1, boolean param2) {
        Object var4 = null;
        byte[] var5 = null;
        Exception var6 = null;
        int var6_int = 0;
        byte[] var7_ref_byte__ = null;
        int var7 = 0;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        byte stackIn_47_0 = 0;
        byte stackIn_47_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_73_0 = 0;
        int stackIn_73_1 = 0;
        int stackIn_77_0 = 0;
        int stackIn_77_1 = 0;
        Object stackIn_87_0 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_72_0 = 0;
        int stackOut_72_1 = 0;
        int stackOut_76_0 = 0;
        int stackOut_76_1 = 0;
        Object stackOut_86_0 = null;
        byte stackOut_46_0 = 0;
        byte stackOut_46_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        L0: {
          var10 = Pixelate.field_H ? 1 : 0;
          var4 = (Object) (Object) (gn) (Object) ((gg) this).field_j.a(-25484, (long)param0);
          if (param2) {
            break L0;
          } else {
            gn discarded$2 = this.a(37, -122, true);
            break L0;
          }
        }
        L1: {
          if (var4 == null) {
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
                        if ((((gg) this).field_s[param0] ^ -1) == 0) {
                          if (!((gg) this).field_i.d((byte) 86)) {
                            var4 = (Object) (Object) ((gg) this).field_i.a((byte) -31, ((gg) this).field_m, false, param0, (byte) 2);
                            if (var10 == 0) {
                              break L3;
                            } else {
                              return null;
                            }
                          } else {
                            return null;
                          }
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
              L5: {
                if (((gg) this).field_y == null) {
                  break L5;
                } else {
                  if ((((gg) this).field_s[param0] ^ -1) == 0) {
                    break L5;
                  } else {
                    var4 = (Object) (Object) ((gg) this).field_r.a(param0, ((gg) this).field_y, 116);
                    if (var10 == 0) {
                      break L3;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              if (!((gg) this).field_i.a(20)) {
                var4 = (Object) (Object) ((gg) this).field_i.a((byte) -31, ((gg) this).field_m, true, param0, (byte) 2);
                if (var10 == 0) {
                  break L3;
                } else {
                  return null;
                }
              } else {
                return null;
              }
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
            try {
              L6: {
                L7: {
                  if (var5 == null) {
                    break L7;
                  } else {
                    if ((var5.length ^ -1) >= -3) {
                      break L7;
                    } else {
                      ra.field_h.reset();
                      ra.field_h.update(var5, 0, -2 + var5.length);
                      var6_int = (int)ra.field_h.getValue();
                      if (var6_int != ((gg) this).field_g.field_k[param0]) {
                        throw new RuntimeException();
                      } else {
                        L8: {
                          L9: {
                            if (((gg) this).field_g.field_d == null) {
                              break L9;
                            } else {
                              if (null != ((gg) this).field_g.field_d[param0]) {
                                var7_ref_byte__ = ((gg) this).field_g.field_d[param0];
                                var8 = db.a(var5, 0, 1761872464, -2 + var5.length);
                                var9 = 0;
                                L10: while (true) {
                                  if (64 <= var9) {
                                    break L9;
                                  } else {
                                    stackOut_72_0 = var8[var9] ^ -1;
                                    stackOut_72_1 = var7_ref_byte__[var9] ^ -1;
                                    stackIn_77_0 = stackOut_72_0;
                                    stackIn_77_1 = stackOut_72_1;
                                    stackIn_73_0 = stackOut_72_0;
                                    stackIn_73_1 = stackOut_72_1;
                                    if (var10 != 0) {
                                      break L8;
                                    } else {
                                      if (stackIn_73_0 == stackIn_73_1) {
                                        var9++;
                                        if (var10 == 0) {
                                          continue L10;
                                        } else {
                                          break L9;
                                        }
                                      } else {
                                        throw new RuntimeException();
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L9;
                              }
                            }
                          }
                          stackOut_76_0 = 65280 & var5[-2 + var5.length] << -1296059800;
                          stackOut_76_1 = 255 & var5[var5.length + -1];
                          stackIn_77_0 = stackOut_76_0;
                          stackIn_77_1 = stackOut_76_1;
                          break L8;
                        }
                        var7 = stackIn_77_0 + stackIn_77_1;
                        if (var7 != (65535 & ((gg) this).field_g.field_a[param0])) {
                          throw new RuntimeException();
                        } else {
                          L11: {
                            if (((gg) this).field_s[param0] != 1) {
                              L12: {
                                if (0 != ((gg) this).field_s[param0]) {
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                              ((gg) this).field_s[param0] = (byte) 1;
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          L13: {
                            if (((gn) var4).field_t) {
                              break L13;
                            } else {
                              ((gn) var4).c(2779);
                              break L13;
                            }
                          }
                          stackOut_86_0 = var4;
                          stackIn_87_0 = stackOut_86_0;
                          break L6;
                        }
                      }
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L14: {
                var6 = (Exception) (Object) decompiledCaughtException;
                ((gg) this).field_s[param0] = (byte)-1;
                ((gn) var4).c(2779);
                if (((gn) var4).field_t) {
                  if (!((gg) this).field_i.a(20)) {
                    var4 = (Object) (Object) ((gg) this).field_i.a((byte) -31, ((gg) this).field_m, true, param0, (byte) 2);
                    ((gg) this).field_j.a((long)param0, 127, (fa) var4);
                    break L14;
                  } else {
                    return null;
                  }
                } else {
                  break L14;
                }
              }
              return null;
            }
            return (gn) (Object) stackIn_87_0;
          } else {
            L15: {
              if (var5 == null) {
                break L15;
              } else {
                if (-3 > (var5.length ^ -1)) {
                  ra.field_h.reset();
                  ra.field_h.update(var5, 0, -2 + var5.length);
                  var6_int = (int)ra.field_h.getValue();
                  if (var6_int != ((gg) this).field_g.field_k[param0]) {
                    throw new RuntimeException();
                  } else {
                    L16: {
                      L17: {
                        L18: {
                          if (null == ((gg) this).field_g.field_d) {
                            break L18;
                          } else {
                            if (null == ((gg) this).field_g.field_d[param0]) {
                              break L18;
                            } else {
                              var7_ref_byte__ = ((gg) this).field_g.field_d[param0];
                              var8 = db.a(var5, 0, 1761872464, -2 + var5.length);
                              var9 = 0;
                              L19: while (true) {
                                if (var9 >= 64) {
                                  break L18;
                                } else {
                                  stackOut_46_0 = var8[var9];
                                  stackOut_46_1 = var7_ref_byte__[var9];
                                  stackIn_54_0 = stackOut_46_0;
                                  stackIn_54_1 = stackOut_46_1;
                                  stackIn_47_0 = stackOut_46_0;
                                  stackIn_47_1 = stackOut_46_1;
                                  if (var10 != 0) {
                                    break L17;
                                  } else {
                                    if (stackIn_47_0 != stackIn_47_1) {
                                      throw new RuntimeException();
                                    } else {
                                      var9++;
                                      if (var10 == 0) {
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
                        }
                        ((gg) this).field_i.field_h = 0;
                        ((gg) this).field_i.field_m = 0;
                        var5[var5.length - 2] = (byte)(((gg) this).field_g.field_a[param0] >>> -1775395832);
                        var5[-1 + var5.length] = (byte)((gg) this).field_g.field_a[param0];
                        if (((gg) this).field_y != null) {
                          cg discarded$3 = ((gg) this).field_r.a(param0, 45, ((gg) this).field_y, var5);
                          stackOut_53_0 = -2;
                          stackOut_53_1 = ((gg) this).field_s[param0] ^ -1;
                          stackIn_54_0 = stackOut_53_0;
                          stackIn_54_1 = stackOut_53_1;
                          break L17;
                        } else {
                          break L16;
                        }
                      }
                      if (stackIn_54_0 != stackIn_54_1) {
                        ((gg) this).field_s[param0] = (byte) 1;
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    L20: {
                      if (((gn) var4).field_t) {
                        break L20;
                      } else {
                        ((gn) var4).c(2779);
                        break L20;
                      }
                    }
                    return (gn) var4;
                  }
                } else {
                  break L15;
                }
              }
            }
            throw new RuntimeException();
          }
        } else {
          return null;
        }
    }

    final int b(int param0, int param1) {
        if (param1 != 8192) {
            id discarded$0 = gg.d((byte) 22);
        }
        gn var3 = (gn) (Object) ((gg) this).field_j.a(-25484, (long)param0);
        if (var3 != null) {
            return var3.g(param1 ^ -8303);
        }
        return 0;
    }

    final void a(boolean param0) {
        if (!(null != ((gg) this).field_y)) {
            return;
        }
        ((gg) this).field_q = param0 ? true : false;
        if (((gg) this).field_w == null) {
            ((gg) this).field_w = new bb();
        }
    }

    final static void a(boolean param0, String[][] param1, byte[] param2, fm param3, String[] param4, byte[] param5, tf[][] param6, int param7, int param8, tf[][] param9, fm param10, int param11, String[][] param12, fm param13, int[] param14) {
        ro.a(param0, param6, param8, -15690, param10, param4, param14, param1, (hh[]) null, param7, (int[]) null, param2, param12, param3, param9, param5, param13);
        if (param11 <= 6) {
            id discarded$0 = gg.d((byte) 43);
        }
    }

    final void b(int param0) {
        int var2_int = 0;
        gn var2 = null;
        fa var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_8_0 = 0;
        byte stackIn_8_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_38_0 = 0;
        byte stackIn_38_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_108_1 = 0;
        int stackIn_128_0 = 0;
        int stackIn_131_0 = 0;
        int stackIn_132_0 = 0;
        int stackIn_132_1 = 0;
        int stackOut_7_0 = 0;
        byte stackOut_7_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_134_0 = 0;
        int stackOut_134_1 = 0;
        int stackOut_130_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_37_0 = 0;
        byte stackOut_37_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_110_0 = 0;
        int stackOut_110_1 = 0;
        int stackOut_106_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_61_0 = 0;
        L0: {
          var5 = Pixelate.field_H ? 1 : 0;
          if (((gg) this).field_w != null) {
            if (null != ((gg) this).a((byte) 36)) {
              L1: {
                if (!((gg) this).field_k) {
                  break L1;
                } else {
                  var2_int = 1;
                  var3 = ((gg) this).field_w.c(1504642273);
                  L2: while (true) {
                    L3: {
                      L4: {
                        L5: {
                          if (var3 == null) {
                            break L5;
                          } else {
                            var4 = (int)var3.field_e;
                            stackOut_7_0 = 0;
                            stackOut_7_1 = ((gg) this).field_s[var4];
                            stackIn_16_0 = stackOut_7_0;
                            stackIn_16_1 = stackOut_7_1;
                            stackIn_8_0 = stackOut_7_0;
                            stackIn_8_1 = stackOut_7_1;
                            if (var5 != 0) {
                              L6: while (true) {
                                if (stackIn_16_0 <= stackIn_16_1) {
                                  break L4;
                                } else {
                                  stackOut_17_0 = 0;
                                  stackIn_31_0 = stackOut_17_0;
                                  stackIn_18_0 = stackOut_17_0;
                                  if (var5 != 0) {
                                    break L3;
                                  } else {
                                    L7: {
                                      L8: {
                                        if (stackIn_18_0 != ((gg) this).field_g.field_h[((gg) this).field_x]) {
                                          break L8;
                                        } else {
                                          ((gg) this).field_x = ((gg) this).field_x + 1;
                                          if (var5 == 0) {
                                            break L7;
                                          } else {
                                            break L8;
                                          }
                                        }
                                      }
                                      L9: {
                                        if (250 > ((gg) this).field_r.field_c) {
                                          break L9;
                                        } else {
                                          var2_int = 0;
                                          if (var5 == 0) {
                                            break L4;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                      L10: {
                                        if (((gg) this).field_s[((gg) this).field_x] == 0) {
                                          gn discarded$7 = this.a(((gg) this).field_x, 1, true);
                                          break L10;
                                        } else {
                                          break L10;
                                        }
                                      }
                                      L11: {
                                        if (0 == ((gg) this).field_s[((gg) this).field_x]) {
                                          var3 = new fa();
                                          var3.field_e = (long)((gg) this).field_x;
                                          ((gg) this).field_w.a(22125, var3);
                                          var2_int = 0;
                                          break L11;
                                        } else {
                                          break L11;
                                        }
                                      }
                                      ((gg) this).field_x = ((gg) this).field_x + 1;
                                      if (var5 == 0) {
                                        break L7;
                                      } else {
                                        break L4;
                                      }
                                    }
                                    stackOut_15_0 = ((gg) this).field_g.field_h.length;
                                    stackOut_15_1 = ((gg) this).field_x;
                                    stackIn_16_0 = stackOut_15_0;
                                    stackIn_16_1 = stackOut_15_1;
                                    continue L6;
                                  }
                                }
                              }
                            } else {
                              L12: {
                                if (stackIn_8_0 != stackIn_8_1) {
                                  break L12;
                                } else {
                                  gn discarded$8 = this.a(var4, 1, true);
                                  break L12;
                                }
                              }
                              L13: {
                                L14: {
                                  if (-1 != (((gg) this).field_s[var4] ^ -1)) {
                                    break L14;
                                  } else {
                                    var2_int = 0;
                                    if (var5 == 0) {
                                      break L13;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                                var3.c(2779);
                                break L13;
                              }
                              var3 = ((gg) this).field_w.f(1504642273);
                              if (var5 == 0) {
                                continue L2;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        L15: while (true) {
                          stackOut_134_0 = ((gg) this).field_g.field_h.length;
                          stackOut_134_1 = ((gg) this).field_x;
                          stackIn_132_0 = stackOut_134_0;
                          stackIn_132_1 = stackOut_134_1;
                          if (stackIn_132_0 <= stackIn_132_1) {
                            break L4;
                          } else {
                            stackOut_130_0 = 0;
                            stackIn_31_0 = stackOut_130_0;
                            stackIn_131_0 = stackOut_130_0;
                            if (var5 != 0) {
                              break L3;
                            } else {
                              stackOut_131_0 = stackIn_131_0;
                              stackIn_128_0 = stackOut_131_0;
                              L16: {
                                if (stackIn_128_0 != ((gg) this).field_g.field_h[((gg) this).field_x]) {
                                  break L16;
                                } else {
                                  ((gg) this).field_x = ((gg) this).field_x + 1;
                                  if (var5 == 0) {
                                    continue L15;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                              L17: {
                                if (250 > ((gg) this).field_r.field_c) {
                                  break L17;
                                } else {
                                  var2_int = 0;
                                  if (var5 == 0) {
                                    break L4;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                              L18: {
                                if (((gg) this).field_s[((gg) this).field_x] == 0) {
                                  gn discarded$9 = this.a(((gg) this).field_x, 1, true);
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              L19: {
                                if (0 == ((gg) this).field_s[((gg) this).field_x]) {
                                  var3 = new fa();
                                  var3.field_e = (long)((gg) this).field_x;
                                  ((gg) this).field_w.a(22125, var3);
                                  var2_int = 0;
                                  break L19;
                                } else {
                                  break L19;
                                }
                              }
                              ((gg) this).field_x = ((gg) this).field_x + 1;
                              if (var5 == 0) {
                                continue L15;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                      }
                      stackOut_30_0 = var2_int;
                      stackIn_31_0 = stackOut_30_0;
                      break L3;
                    }
                    L20: {
                      if (stackIn_31_0 == 0) {
                        break L20;
                      } else {
                        ((gg) this).field_k = false;
                        ((gg) this).field_x = 0;
                        break L20;
                      }
                    }
                    if (var5 == 0) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L21: {
                if (!((gg) this).field_q) {
                  break L21;
                } else {
                  var2_int = 1;
                  var3 = ((gg) this).field_w.c(param0 ^ 1504642273);
                  L22: while (true) {
                    L23: {
                      L24: {
                        L25: {
                          if (var3 == null) {
                            break L25;
                          } else {
                            var4 = (int)var3.field_e;
                            stackOut_37_0 = 1;
                            stackOut_37_1 = ((gg) this).field_s[var4];
                            stackIn_47_0 = stackOut_37_0;
                            stackIn_47_1 = stackOut_37_1;
                            stackIn_38_0 = stackOut_37_0;
                            stackIn_38_1 = stackOut_37_1;
                            if (var5 != 0) {
                              L26: while (true) {
                                if (stackIn_47_0 <= stackIn_47_1) {
                                  break L24;
                                } else {
                                  stackOut_48_0 = ((gg) this).field_g.field_h[((gg) this).field_x] ^ -1;
                                  stackIn_62_0 = stackOut_48_0;
                                  stackIn_49_0 = stackOut_48_0;
                                  if (var5 != 0) {
                                    break L23;
                                  } else {
                                    L27: {
                                      L28: {
                                        if (stackIn_49_0 != -1) {
                                          break L28;
                                        } else {
                                          ((gg) this).field_x = ((gg) this).field_x + 1;
                                          if (var5 == 0) {
                                            break L27;
                                          } else {
                                            break L28;
                                          }
                                        }
                                      }
                                      L29: {
                                        if (((gg) this).field_i.d((byte) 97)) {
                                          var2_int = 0;
                                          if (var5 == 0) {
                                            break L24;
                                          } else {
                                            break L29;
                                          }
                                        } else {
                                          break L29;
                                        }
                                      }
                                      L30: {
                                        if (1 != ((gg) this).field_s[((gg) this).field_x]) {
                                          gn discarded$10 = this.a(((gg) this).field_x, 2, true);
                                          break L30;
                                        } else {
                                          break L30;
                                        }
                                      }
                                      L31: {
                                        if (-2 == (((gg) this).field_s[((gg) this).field_x] ^ -1)) {
                                          break L31;
                                        } else {
                                          var3 = new fa();
                                          var3.field_e = (long)((gg) this).field_x;
                                          ((gg) this).field_w.a(22125, var3);
                                          var2_int = 0;
                                          break L31;
                                        }
                                      }
                                      ((gg) this).field_x = ((gg) this).field_x + 1;
                                      if (var5 == 0) {
                                        break L27;
                                      } else {
                                        break L24;
                                      }
                                    }
                                    stackOut_46_0 = ((gg) this).field_x ^ -1;
                                    stackOut_46_1 = ((gg) this).field_g.field_h.length ^ -1;
                                    stackIn_47_0 = stackOut_46_0;
                                    stackIn_47_1 = stackOut_46_1;
                                    continue L26;
                                  }
                                }
                              }
                            } else {
                              L32: {
                                if (stackIn_38_0 == stackIn_38_1) {
                                  break L32;
                                } else {
                                  gn discarded$11 = this.a(var4, 2, true);
                                  break L32;
                                }
                              }
                              L33: {
                                L34: {
                                  if (((gg) this).field_s[var4] != 1) {
                                    break L34;
                                  } else {
                                    var3.c(param0 ^ 2779);
                                    if (var5 == 0) {
                                      break L33;
                                    } else {
                                      break L34;
                                    }
                                  }
                                }
                                var2_int = 0;
                                break L33;
                              }
                              var3 = ((gg) this).field_w.f(1504642273);
                              if (var5 == 0) {
                                continue L22;
                              } else {
                                break L25;
                              }
                            }
                          }
                        }
                        L35: while (true) {
                          stackOut_110_0 = ((gg) this).field_x ^ -1;
                          stackOut_110_1 = ((gg) this).field_g.field_h.length ^ -1;
                          stackIn_108_0 = stackOut_110_0;
                          stackIn_108_1 = stackOut_110_1;
                          if (stackIn_108_0 <= stackIn_108_1) {
                            break L24;
                          } else {
                            stackOut_106_0 = ((gg) this).field_g.field_h[((gg) this).field_x] ^ -1;
                            stackIn_62_0 = stackOut_106_0;
                            stackIn_107_0 = stackOut_106_0;
                            if (var5 != 0) {
                              break L23;
                            } else {
                              stackOut_107_0 = stackIn_107_0;
                              stackIn_104_0 = stackOut_107_0;
                              L36: {
                                if (stackIn_104_0 != -1) {
                                  break L36;
                                } else {
                                  ((gg) this).field_x = ((gg) this).field_x + 1;
                                  if (var5 == 0) {
                                    continue L35;
                                  } else {
                                    break L36;
                                  }
                                }
                              }
                              L37: {
                                if (((gg) this).field_i.d((byte) 97)) {
                                  var2_int = 0;
                                  if (var5 == 0) {
                                    break L24;
                                  } else {
                                    break L37;
                                  }
                                } else {
                                  break L37;
                                }
                              }
                              L38: {
                                if (1 != ((gg) this).field_s[((gg) this).field_x]) {
                                  gn discarded$12 = this.a(((gg) this).field_x, 2, true);
                                  break L38;
                                } else {
                                  break L38;
                                }
                              }
                              L39: {
                                if (-2 == (((gg) this).field_s[((gg) this).field_x] ^ -1)) {
                                  break L39;
                                } else {
                                  var3 = new fa();
                                  var3.field_e = (long)((gg) this).field_x;
                                  ((gg) this).field_w.a(22125, var3);
                                  var2_int = 0;
                                  break L39;
                                }
                              }
                              ((gg) this).field_x = ((gg) this).field_x + 1;
                              if (var5 == 0) {
                                continue L35;
                              } else {
                                break L24;
                              }
                            }
                          }
                        }
                      }
                      stackOut_61_0 = var2_int;
                      stackIn_62_0 = stackOut_61_0;
                      break L23;
                    }
                    L40: {
                      if (stackIn_62_0 != 0) {
                        ((gg) this).field_x = 0;
                        ((gg) this).field_q = false;
                        break L40;
                      } else {
                        break L40;
                      }
                    }
                    if (var5 == 0) {
                      break L0;
                    } else {
                      break L21;
                    }
                  }
                }
              }
              ((gg) this).field_w = null;
              break L0;
            } else {
              return;
            }
          } else {
            break L0;
          }
        }
        L41: {
          if (param0 == 0) {
            break L41;
          } else {
            gn discarded$13 = this.a(112, 27, true);
            break L41;
          }
        }
        L42: {
          if (!((gg) this).field_p) {
            break L42;
          } else {
            L43: {
              if ((hm.a(64) ^ -1L) > (((gg) this).field_t ^ -1L)) {
                break L43;
              } else {
                var2 = (gn) (Object) ((gg) this).field_j.a((byte) -99);
                L44: while (true) {
                  L45: {
                    if (var2 == null) {
                      break L45;
                    } else {
                      if (var5 != 0) {
                        break L43;
                      } else {
                        L46: {
                          L47: {
                            if (!var2.field_v) {
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
                            if (!var2.field_x) {
                              break L48;
                            } else {
                              if (!var2.field_t) {
                                throw new RuntimeException();
                              } else {
                                var2.c(param0 + 2779);
                                if (var5 == 0) {
                                  break L46;
                                } else {
                                  break L48;
                                }
                              }
                            }
                          }
                          var2.field_x = true;
                          break L46;
                        }
                        var2 = (gn) (Object) ((gg) this).field_j.a(-123);
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
            break L42;
          }
        }
    }

    final kj a(byte param0) {
        byte[] var2 = null;
        int var4 = 0;
        byte[] var5 = null;
        L0: {
          var4 = Pixelate.field_H ? 1 : 0;
          if (param0 == 36) {
            break L0;
          } else {
            int discarded$2 = ((gg) this).b(-6, -35);
            break L0;
          }
        }
        if (((gg) this).field_g != null) {
          return ((gg) this).field_g;
        } else {
          L1: {
            if (((gg) this).field_o == null) {
              if (!((gg) this).field_i.a(20)) {
                ((gg) this).field_o = (gn) (Object) ((gg) this).field_i.a((byte) -31, 255, true, ((gg) this).field_m, (byte) 0);
                break L1;
              } else {
                return null;
              }
            } else {
              break L1;
            }
          }
          if (!((gg) this).field_o.field_v) {
            L2: {
              var5 = ((gg) this).field_o.h(0);
              var2 = var5;
              if (!(((gg) this).field_o instanceof cg)) {
                if (var5 == null) {
                  throw new RuntimeException();
                } else {
                  ((gg) this).field_g = new kj(var5, ((gg) this).field_n, ((gg) this).field_e);
                  if (null == ((gg) this).field_u) {
                    break L2;
                  } else {
                    cg discarded$3 = ((gg) this).field_r.a(((gg) this).field_m, 93, ((gg) this).field_u, var5);
                    break L2;
                  }
                }
              } else {
                if (var5 == null) {
                  throw new RuntimeException();
                } else {
                  ((gg) this).field_g = new kj(var5, ((gg) this).field_n, ((gg) this).field_e);
                  if ((((gg) this).field_g.field_c ^ -1) == (((gg) this).field_f ^ -1)) {
                    break L2;
                  } else {
                    throw new RuntimeException();
                  }
                }
              }
            }
            L3: {
              if (((gg) this).field_y != null) {
                ((gg) this).field_s = new byte[((gg) this).field_g.field_b];
                break L3;
              } else {
                break L3;
              }
            }
            ((gg) this).field_o = null;
            return ((gg) this).field_g;
          } else {
            return null;
          }
        }
    }

    public static void e(byte param0) {
        field_h = null;
        if (param0 != 45) {
            gg.a(true, (String[][]) null, (byte[]) null, (fm) null, (String[]) null, (byte[]) null, (tf[][]) null, -91, 127, (tf[][]) null, (fm) null, 112, (String[][]) null, (fm) null, (int[]) null);
        }
        field_z = null;
        field_v = null;
    }

    final static id d(byte param0) {
        if (!(tm.field_X != wm.field_a)) {
            throw new IllegalStateException();
        }
        if (param0 != 52) {
            gg.e((byte) -37);
        }
        if (!(tm.field_X != h.field_N)) {
            tm.field_X = wm.field_a;
            return v.field_b;
        }
        return null;
    }

    final static void c(byte param0) {
        jg.field_K = null;
        if (param0 != 24) {
            return;
        }
        a.field_L = null;
    }

    gg(int param0, rn param1, rn param2, rf param3, gm param4, int param5, byte[] param6, int param7, boolean param8) {
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        L0: {
          L1: {
            ((gg) this).field_j = new nl(16);
            ((gg) this).field_x = 0;
            ((gg) this).field_l = new bb();
            ((gg) this).field_t = 0L;
            ((gg) this).field_y = param1;
            ((gg) this).field_m = param0;
            if (((gg) this).field_y == null) {
              break L1;
            } else {
              ((gg) this).field_k = true;
              ((gg) this).field_w = new bb();
              if (!Pixelate.field_H) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          ((gg) this).field_k = false;
          break L0;
        }
        L2: {
          ((gg) this).field_u = param2;
          ((gg) this).field_i = param3;
          ((gg) this).field_n = param5;
          ((gg) this).field_e = param6;
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (!param8) {
            stackOut_5_0 = this;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L2;
          } else {
            stackOut_4_0 = this;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L2;
          }
        }
        L3: {
          ((gg) this).field_p = stackIn_6_1 != 0;
          ((gg) this).field_r = param4;
          ((gg) this).field_f = param7;
          if (((gg) this).field_u == null) {
            break L3;
          } else {
            ((gg) this).field_o = (gn) (Object) ((gg) this).field_r.a(((gg) this).field_m, ((gg) this).field_u, 118);
            break L3;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "<%0> has entered another game.";
        field_h = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_z = new int[32];
    }
}
