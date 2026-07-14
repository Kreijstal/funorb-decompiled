/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce extends td {
    private g field_s;
    private byte[] field_p;
    private v field_f;
    static int[] field_n;
    private vh field_k;
    private int field_j;
    private int field_r;
    private vh field_l;
    private byte[] field_m;
    static String field_t;
    private int field_q;
    private vi field_u;
    private gj field_i;
    private uk field_o;
    private bc field_h;
    private bc field_c;
    private boolean field_g;
    private boolean field_d;
    private int field_w;
    private long field_e;
    private boolean field_v;

    final int a(int param0, int param1) {
        gj var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          var3 = (gj) (Object) ((ce) this).field_o.a(19, (long)param1);
          if (param0 >= 111) {
            if (var3 == null) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
            } else {
              stackOut_4_0 = var3.c((byte) -120);
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          } else {
            stackOut_1_0 = -12;
            stackIn_2_0 = stackOut_1_0;
            return stackIn_2_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var3_ref, "ce.D(" + param0 + 44 + param1 + 41);
        }
        return stackIn_7_0;
    }

    final byte[] a(int param0, boolean param1) {
        gj var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_6_0 = null;
        Object stackOut_1_0 = null;
        try {
          var3 = this.a(0, 255, param0);
          if (null != var3) {
            L0: {
              if (param1) {
                break L0;
              } else {
                ((ce) this).field_h = null;
                break L0;
              }
            }
            var4 = var3.d((byte) -124);
            var3.c(2);
            stackOut_6_0 = (byte[]) var4;
            stackIn_7_0 = stackOut_6_0;
          } else {
            stackOut_1_0 = null;
            stackIn_2_0 = stackOut_1_0;
            return (byte[]) (Object) stackIn_2_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var3_ref, "ce.A(" + param0 + 44 + param1 + 41);
        }
        return stackIn_7_0;
    }

    final void b(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (((ce) this).field_k == null) {
            return;
          } else {
            ((ce) this).field_d = true;
            if (param0 < -72) {
              L0: {
                if (null == ((ce) this).field_h) {
                  ((ce) this).field_h = new bc();
                  break L0;
                } else {
                  break L0;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var2, "ce.J(" + param0 + 41);
        }
    }

    final g b(int param0) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        RuntimeException var3 = null;
        int var4 = 0;
        g stackIn_5_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_37_0 = null;
        Object stackIn_50_0 = null;
        g stackIn_58_0 = null;
        RuntimeException decompiledCaughtException = null;
        g stackOut_4_0 = null;
        Object stackOut_10_0 = null;
        Object stackOut_16_0 = null;
        Object stackOut_49_0 = null;
        Object stackOut_36_0 = null;
        g stackOut_57_0 = null;
        var4 = Bounce.field_N;
        try {
          if (((ce) this).field_s != null) {
            stackOut_4_0 = ((ce) this).field_s;
            stackIn_5_0 = stackOut_4_0;
            return stackIn_5_0;
          } else {
            L0: {
              if (((ce) this).field_i != null) {
                break L0;
              } else {
                if (!((ce) this).field_f.b(false)) {
                  ((ce) this).field_i = (gj) (Object) ((ce) this).field_f.a(((ce) this).field_q, (byte) 0, param0 ^ -102, true, 255);
                  break L0;
                } else {
                  stackOut_10_0 = null;
                  stackIn_11_0 = stackOut_10_0;
                  return (g) (Object) stackIn_11_0;
                }
              }
            }
            if (((ce) this).field_i.field_n) {
              stackOut_16_0 = null;
              stackIn_17_0 = stackOut_16_0;
              return (g) (Object) stackIn_17_0;
            } else {
              L1: {
                if (param0 == 1) {
                  break L1;
                } else {
                  ((ce) this).field_k = null;
                  break L1;
                }
              }
              L2: {
                var2_array = ((ce) this).field_i.d((byte) -115);
                if (!(((ce) this).field_i instanceof md)) {
                  try {
                    if (var2_array != null) {
                      ((ce) this).field_s = new g(var2_array, ((ce) this).field_r, ((ce) this).field_m);
                    } else {
                      throw new RuntimeException();
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      L4: {
                        var3 = decompiledCaughtException;
                        ((ce) this).field_f.c((byte) 118);
                        ((ce) this).field_s = null;
                        if (((ce) this).field_f.b(false)) {
                          break L4;
                        } else {
                          ((ce) this).field_i = (gj) (Object) ((ce) this).field_f.a(((ce) this).field_q, (byte) 0, -102, true, 255);
                          if (var4 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      ((ce) this).field_i = null;
                      break L3;
                    }
                    stackOut_49_0 = null;
                    stackIn_50_0 = stackOut_49_0;
                    return (g) (Object) stackIn_50_0;
                  }
                  if (((ce) this).field_l == null) {
                    break L2;
                  } else {
                    md discarded$1 = ((ce) this).field_u.a(((ce) this).field_l, ((ce) this).field_q, (byte) -78, var2_array);
                    break L2;
                  }
                } else {
                  try {
                    if (var2_array != null) {
                      ((ce) this).field_s = new g(var2_array, ((ce) this).field_r, ((ce) this).field_m);
                      if ((((ce) this).field_j ^ -1) != (((ce) this).field_s.field_h ^ -1)) {
                        throw new RuntimeException();
                      } else {
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L5: {
                      L6: {
                        var3 = decompiledCaughtException;
                        ((ce) this).field_s = null;
                        if (!((ce) this).field_f.b(false)) {
                          break L6;
                        } else {
                          ((ce) this).field_i = null;
                          if (var4 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      ((ce) this).field_i = (gj) (Object) ((ce) this).field_f.a(((ce) this).field_q, (byte) 0, 107, true, 255);
                      break L5;
                    }
                    stackOut_36_0 = null;
                    stackIn_37_0 = stackOut_36_0;
                    return (g) (Object) stackIn_37_0;
                  }
                  break L2;
                }
              }
              L7: {
                ((ce) this).field_i = null;
                if (((ce) this).field_k == null) {
                  break L7;
                } else {
                  ((ce) this).field_p = new byte[((ce) this).field_s.field_m];
                  break L7;
                }
              }
              stackOut_57_0 = ((ce) this).field_s;
              stackIn_58_0 = stackOut_57_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var2, "ce.B(" + param0 + 41);
        }
        return stackIn_58_0;
    }

    public static void c(byte param0) {
        if (param0 >= -27) {
            return;
        }
        try {
            field_t = null;
            field_n = null;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "ce.G(" + param0 + 41);
        }
    }

    private final gj a(int param0, int param1, int param2) {
        lf var4 = null;
        RuntimeException var4_ref = null;
        gj var4_ref2 = null;
        byte[] var5 = null;
        RuntimeException var6 = null;
        Exception var6_ref = null;
        int var6_int = 0;
        int var7 = 0;
        byte[] var7_ref_byte__ = null;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        Object stackIn_27_0 = null;
        Object stackIn_46_0 = null;
        Object stackIn_58_0 = null;
        Object stackIn_61_0 = null;
        byte stackIn_82_0 = 0;
        byte stackIn_82_1 = 0;
        Object stackIn_96_0 = null;
        byte stackIn_101_0 = 0;
        int stackIn_101_1 = 0;
        lf stackIn_108_0 = null;
        byte stackIn_125_0 = 0;
        byte stackIn_125_1 = 0;
        int stackIn_132_0 = 0;
        int stackIn_132_1 = 0;
        lf stackIn_145_0 = null;
        Object stackIn_154_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_26_0 = null;
        Object stackOut_45_0 = null;
        byte stackOut_124_0 = 0;
        byte stackOut_124_1 = 0;
        int stackOut_131_0 = 0;
        int stackOut_131_1 = 0;
        lf stackOut_144_0 = null;
        byte stackOut_81_0 = 0;
        byte stackOut_81_1 = 0;
        Object stackOut_95_0 = null;
        byte stackOut_100_0 = 0;
        int stackOut_100_1 = 0;
        lf stackOut_107_0 = null;
        Object stackOut_60_0 = null;
        Object stackOut_57_0 = null;
        Object stackOut_153_0 = null;
        var10 = Bounce.field_N;
        try {
          L0: {
            var4_ref2 = (gj) (Object) ((ce) this).field_o.a(36, (long)param2);
            if (null == var4_ref2) {
              break L0;
            } else {
              if (0 != param0) {
                break L0;
              } else {
                if (var4_ref2.field_m) {
                  break L0;
                } else {
                  if (!var4_ref2.field_n) {
                    break L0;
                  } else {
                    var4_ref2.c(param1 ^ 253);
                    var4_ref2 = null;
                    break L0;
                  }
                }
              }
            }
          }
          L1: {
            if (var4_ref2 == null) {
              L2: {
                L3: {
                  if (-1 != (param0 ^ -1)) {
                    break L3;
                  } else {
                    L4: {
                      if (((ce) this).field_k == null) {
                        break L4;
                      } else {
                        if ((((ce) this).field_p[param2] ^ -1) != 0) {
                          var4 = (lf) (Object) ((ce) this).field_u.a(param2, ((ce) this).field_k, true);
                          if (var10 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (((ce) this).field_f.b(false)) {
                        break L5;
                      } else {
                        var4 = ((ce) this).field_f.a(param2, (byte) 2, 81, true, ((ce) this).field_q);
                        if (var10 == 0) {
                          break L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                    stackOut_26_0 = null;
                    stackIn_27_0 = stackOut_26_0;
                    return (gj) (Object) stackIn_27_0;
                  }
                }
                if (-2 == (param0 ^ -1)) {
                  if (null == ((ce) this).field_k) {
                    throw new RuntimeException();
                  } else {
                    var4 = (lf) (Object) ((ce) this).field_u.a(3, param2, ((ce) this).field_k);
                    break L2;
                  }
                } else {
                  L6: {
                    if (param0 != 2) {
                      break L6;
                    } else {
                      if (null != ((ce) this).field_k) {
                        if (-1 != ((ce) this).field_p[param2]) {
                          throw new RuntimeException();
                        } else {
                          if (!((ce) this).field_f.b((byte) 39)) {
                            var4 = ((ce) this).field_f.a(param2, (byte) 2, -122, false, ((ce) this).field_q);
                            if (var10 == 0) {
                              break L2;
                            } else {
                              break L6;
                            }
                          } else {
                            stackOut_45_0 = null;
                            stackIn_46_0 = stackOut_45_0;
                            return (gj) (Object) stackIn_46_0;
                          }
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                  throw new RuntimeException();
                }
              }
              ((ce) this).field_o.a((long)param2, param1 + -172, (ai) (Object) var4);
              break L1;
            } else {
              break L1;
            }
          }
          if (!((gj) (Object) var4).field_n) {
            if (param1 == 255) {
              var5 = ((gj) (Object) var4).d((byte) -120);
              if (var4 instanceof md) {
                L7: {
                  if (null == var5) {
                    break L7;
                  } else {
                    if (2 < var5.length) {
                      uf.field_b.reset();
                      uf.field_b.update(var5, 0, -2 + var5.length);
                      var6_int = (int)uf.field_b.getValue();
                      if (((ce) this).field_s.field_j[param2] == var6_int) {
                        L8: {
                          L9: {
                            if (null == ((ce) this).field_s.field_e) {
                              break L9;
                            } else {
                              if (((ce) this).field_s.field_e[param2] == null) {
                                break L9;
                              } else {
                                var7_ref_byte__ = ((ce) this).field_s.field_e[param2];
                                var8 = jd.a(var5, 0, var5.length + -2, 0);
                                var9 = 0;
                                L10: while (true) {
                                  if (64 <= var9) {
                                    break L9;
                                  } else {
                                    stackOut_124_0 = var7_ref_byte__[var9];
                                    stackOut_124_1 = var8[var9];
                                    stackIn_132_0 = stackOut_124_0;
                                    stackIn_132_1 = stackOut_124_1;
                                    stackIn_125_0 = stackOut_124_0;
                                    stackIn_125_1 = stackOut_124_1;
                                    if (var10 != 0) {
                                      break L8;
                                    } else {
                                      if (stackIn_125_0 != stackIn_125_1) {
                                        throw new RuntimeException();
                                      } else {
                                        var9++;
                                        if (var10 == 0) {
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
                          }
                          stackOut_131_0 = 65280 & var5[var5.length + -2] << -1881332952;
                          stackOut_131_1 = -(var5[-1 + var5.length] & 255);
                          stackIn_132_0 = stackOut_131_0;
                          stackIn_132_1 = stackOut_131_1;
                          break L8;
                        }
                        var7 = stackIn_132_0 - stackIn_132_1;
                        if ((var7 ^ -1) != (65535 & ((ce) this).field_s.field_g[param2] ^ -1)) {
                          throw new RuntimeException();
                        } else {
                          L11: {
                            if (-2 != (((ce) this).field_p[param2] ^ -1)) {
                              L12: {
                                if (0 != ((ce) this).field_p[param2]) {
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                              ((ce) this).field_p[param2] = (byte) 1;
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          L13: {
                            if (((gj) (Object) var4).field_m) {
                              break L13;
                            } else {
                              ((gj) (Object) var4).c(2);
                              break L13;
                            }
                          }
                          stackOut_144_0 = (lf) var4;
                          stackIn_145_0 = stackOut_144_0;
                          return (gj) (Object) stackIn_145_0;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      break L7;
                    }
                  }
                }
                throw new RuntimeException();
              } else {
                try {
                  L14: {
                    if (null == var5) {
                      break L14;
                    } else {
                      if (2 < var5.length) {
                        uf.field_b.reset();
                        uf.field_b.update(var5, 0, var5.length + -2);
                        var6_int = (int)uf.field_b.getValue();
                        if (((ce) this).field_s.field_j[param2] != var6_int) {
                          throw new RuntimeException();
                        } else {
                          L15: {
                            if (null == ((ce) this).field_s.field_e) {
                              break L15;
                            } else {
                              if (((ce) this).field_s.field_e[param2] != null) {
                                var7_ref_byte__ = ((ce) this).field_s.field_e[param2];
                                var8 = jd.a(var5, 0, var5.length - 2, param1 + -255);
                                var9 = 0;
                                L16: while (true) {
                                  if ((var9 ^ -1) <= -65) {
                                    break L15;
                                  } else {
                                    stackOut_81_0 = var8[var9];
                                    stackOut_81_1 = var7_ref_byte__[var9];
                                    stackIn_101_0 = stackOut_81_0;
                                    stackIn_101_1 = stackOut_81_1;
                                    stackIn_82_0 = stackOut_81_0;
                                    stackIn_82_1 = stackOut_81_1;
                                    if (var10 != 0) {
                                      decompiledRegionSelector0 = 0;
                                    } else {
                                      if (stackIn_82_0 != stackIn_82_1) {
                                        throw new RuntimeException();
                                      } else {
                                        var9++;
                                        if (var10 == 0) {
                                          continue L16;
                                        } else {
                                          break L15;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L15;
                              }
                            }
                          }
                          ((ce) this).field_f.field_l = 0;
                          ((ce) this).field_f.field_d = 0;
                          decompiledRegionSelector0 = 1;
                        }
                      } else {
                        break L14;
                      }
                    }
                  }
                  throw new RuntimeException();
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L17: {
                    var6 = (RuntimeException) (Object) decompiledCaughtException;
                    ((ce) this).field_f.c((byte) 113);
                    ((gj) (Object) var4).c(2);
                    if (((gj) (Object) var4).field_m) {
                      if (((ce) this).field_f.b(false)) {
                        break L17;
                      } else {
                        var4 = ((ce) this).field_f.a(param2, (byte) 2, -62, true, ((ce) this).field_q);
                        ((ce) this).field_o.a((long)param2, param1 ^ 202, (ai) (Object) var4);
                        break L17;
                      }
                    } else {
                      break L17;
                    }
                  }
                  stackOut_95_0 = null;
                  stackIn_96_0 = stackOut_95_0;
                  return (gj) (Object) stackIn_96_0;
                }
                L18: {
                  L19: {
                    if (decompiledRegionSelector0 == 0) {
                      break L19;
                    } else {
                      var5[var5.length + -2] = (byte)(((ce) this).field_s.field_g[param2] >>> -973906456);
                      var5[-1 + var5.length] = (byte)((ce) this).field_s.field_g[param2];
                      if (null != ((ce) this).field_k) {
                        md discarded$1 = ((ce) this).field_u.a(((ce) this).field_k, param2, (byte) 97, var5);
                        stackOut_100_0 = ((ce) this).field_p[param2];
                        stackOut_100_1 = 1;
                        stackIn_101_0 = stackOut_100_0;
                        stackIn_101_1 = stackOut_100_1;
                        break L19;
                      } else {
                        break L18;
                      }
                    }
                  }
                  if (stackIn_101_0 != stackIn_101_1) {
                    ((ce) this).field_p[param2] = (byte) 1;
                    break L18;
                  } else {
                    break L18;
                  }
                }
                L20: {
                  if (((gj) (Object) var4).field_m) {
                    break L20;
                  } else {
                    ((gj) (Object) var4).c(2);
                    break L20;
                  }
                }
                stackOut_107_0 = (lf) var4;
                stackIn_108_0 = stackOut_107_0;
                return (gj) (Object) stackIn_108_0;
              }
            } else {
              stackOut_60_0 = null;
              stackIn_61_0 = stackOut_60_0;
              return (gj) (Object) stackIn_61_0;
            }
          } else {
            stackOut_57_0 = null;
            stackIn_58_0 = stackOut_57_0;
            return (gj) (Object) stackIn_58_0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L21: {
            var6_ref = (Exception) (Object) decompiledCaughtException;
            ((ce) this).field_p[param2] = (byte) -1;
            ((gj) (Object) var4).c(2);
            if (((gj) (Object) var4).field_m) {
              if (!((ce) this).field_f.b(false)) {
                var4 = ((ce) this).field_f.a(param2, (byte) 2, 36, true, ((ce) this).field_q);
                ((ce) this).field_o.a((long)param2, 124, (ai) (Object) var4);
                break L21;
              } else {
                break L21;
              }
            } else {
              break L21;
            }
          }
          stackOut_153_0 = null;
          stackIn_154_0 = stackOut_153_0;
          return (gj) (Object) stackIn_154_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw ii.a((Throwable) (Object) var4_ref, "ce.I(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static String a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_3_0 = null;
        boolean stackIn_7_0 = false;
        int stackIn_14_0 = 0;
        boolean stackIn_16_0 = false;
        boolean stackIn_18_0 = false;
        int stackIn_25_0 = 0;
        Object stackIn_32_0 = null;
        boolean stackIn_36_0 = false;
        int stackIn_47_0 = 0;
        Object stackIn_49_0 = null;
        String stackIn_51_0 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        boolean stackOut_15_0 = false;
        boolean stackOut_16_0 = false;
        int stackOut_13_0 = 0;
        int stackOut_24_0 = 0;
        boolean stackOut_35_0 = false;
        int stackOut_46_0 = 0;
        String stackOut_50_0 = null;
        Object stackOut_48_0 = null;
        Object stackOut_31_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        var9 = Bounce.field_N;
        try {
          if (null != param0) {
            var2_int = param1;
            var3 = param0.length();
            L0: while (true) {
              L1: {
                L2: {
                  L3: {
                    L4: {
                      if ((var2_int ^ -1) <= (var3 ^ -1)) {
                        break L4;
                      } else {
                        stackOut_6_0 = f.a(param0.charAt(var2_int), false);
                        stackIn_14_0 = stackOut_6_0 ? 1 : 0;
                        stackIn_7_0 = stackOut_6_0;
                        if (var9 != 0) {
                          L5: while (true) {
                            if (stackIn_14_0 >= (var2_int ^ -1)) {
                              break L2;
                            } else {
                              stackOut_15_0 = f.a(param0.charAt(-1 + var3), false);
                              stackIn_25_0 = stackOut_15_0 ? 1 : 0;
                              stackIn_16_0 = stackOut_15_0;
                              if (var9 != 0) {
                                break L1;
                              } else {
                                stackOut_16_0 = stackIn_16_0;
                                stackIn_18_0 = stackOut_16_0;
                                if (!stackIn_18_0) {
                                  break L2;
                                } else {
                                  var3--;
                                  if (var9 == 0) {
                                    stackOut_13_0 = var3 ^ -1;
                                    stackIn_14_0 = stackOut_13_0;
                                    continue L5;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          if (!stackIn_7_0) {
                            break L4;
                          } else {
                            var2_int++;
                            if (var9 == 0) {
                              continue L0;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    L6: while (true) {
                      stackOut_13_0 = var3 ^ -1;
                      stackIn_14_0 = stackOut_13_0;
                      if (stackIn_14_0 >= (var2_int ^ -1)) {
                        break L2;
                      } else {
                        stackOut_15_0 = f.a(param0.charAt(-1 + var3), false);
                        stackIn_25_0 = stackOut_15_0 ? 1 : 0;
                        stackIn_16_0 = stackOut_15_0;
                        if (var9 != 0) {
                          break L1;
                        } else {
                          stackOut_16_0 = stackIn_16_0;
                          stackIn_18_0 = stackOut_16_0;
                          if (!stackIn_18_0) {
                            break L2;
                          } else {
                            var3--;
                            if (var9 == 0) {
                              continue L6;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                  }
                  break L2;
                }
                stackOut_24_0 = var3 - var2_int;
                stackIn_25_0 = stackOut_24_0;
                break L1;
              }
              L7: {
                var4 = stackIn_25_0;
                if ((var4 ^ -1) > -2) {
                  break L7;
                } else {
                  if (-13 > (var4 ^ -1)) {
                    break L7;
                  } else {
                    var5 = new StringBuilder(var4);
                    var6 = var2_int;
                    L8: while (true) {
                      L9: {
                        L10: {
                          if (var3 <= var6) {
                            break L10;
                          } else {
                            var7 = param0.charAt(var6);
                            stackOut_35_0 = ng.a((byte) -95, (char) var7);
                            stackIn_47_0 = stackOut_35_0 ? 1 : 0;
                            stackIn_36_0 = stackOut_35_0;
                            if (var9 != 0) {
                              break L9;
                            } else {
                              L11: {
                                if (!stackIn_36_0) {
                                  break L11;
                                } else {
                                  L12: {
                                    var8 = hd.a(31400, (char) var7);
                                    if (0 != var8) {
                                      break L12;
                                    } else {
                                      if (var9 == 0) {
                                        break L11;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  StringBuilder discarded$1 = var5.append(var8);
                                  break L11;
                                }
                              }
                              var6++;
                              if (var9 == 0) {
                                continue L8;
                              } else {
                                break L10;
                              }
                            }
                          }
                        }
                        stackOut_46_0 = 0;
                        stackIn_47_0 = stackOut_46_0;
                        break L9;
                      }
                      if (stackIn_47_0 != var5.length()) {
                        stackOut_50_0 = var5.toString();
                        stackIn_51_0 = stackOut_50_0;
                      } else {
                        stackOut_48_0 = null;
                        stackIn_49_0 = stackOut_48_0;
                        return (String) (Object) stackIn_49_0;
                      }
                    }
                  }
                }
              }
              stackOut_31_0 = null;
              stackIn_32_0 = stackOut_31_0;
              return (String) (Object) stackIn_32_0;
            }
          } else {
            stackOut_2_0 = null;
            stackIn_3_0 = stackOut_2_0;
            return (String) (Object) stackIn_3_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var2 = decompiledCaughtException;
            stackOut_52_0 = (RuntimeException) var2;
            stackOut_52_1 = new StringBuilder().append("ce.L(");
            stackIn_55_0 = stackOut_52_0;
            stackIn_55_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param0 == null) {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "null";
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              stackIn_56_2 = stackOut_55_2;
              break L13;
            } else {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "{...}";
              stackIn_56_0 = stackOut_53_0;
              stackIn_56_1 = stackOut_53_1;
              stackIn_56_2 = stackOut_53_2;
              break L13;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_56_0, stackIn_56_2 + 44 + param1 + 41);
        }
        return stackIn_51_0;
    }

    final void c(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        gj var3 = null;
        int var3_int = 0;
        ai var4 = null;
        int var5 = 0;
        int var6 = 0;
        byte stackIn_12_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_73_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_94_0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte stackOut_11_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_59_1 = 0;
        int stackOut_72_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_70_1 = 0;
        int stackOut_93_0 = 0;
        var6 = Bounce.field_N;
        try {
          L0: {
            var2_int = 97 % ((46 - param0) / 34);
            if (((ce) this).field_h == null) {
              break L0;
            } else {
              if (((ce) this).b(1) == null) {
                return;
              } else {
                L1: {
                  if (!((ce) this).field_g) {
                    break L1;
                  } else {
                    var3_int = 1;
                    var4 = ((ce) this).field_h.a((byte) -126);
                    L2: while (true) {
                      L3: {
                        L4: {
                          L5: {
                            if (null == var4) {
                              break L5;
                            } else {
                              var5 = (int)var4.field_d;
                              stackOut_11_0 = ((ce) this).field_p[var5];
                              stackIn_24_0 = stackOut_11_0;
                              stackIn_12_0 = stackOut_11_0;
                              if (var6 != 0) {
                                L6: while (true) {
                                  if (stackIn_24_0 <= ((ce) this).field_w) {
                                    break L4;
                                  } else {
                                    stackOut_25_0 = 0;
                                    stackIn_47_0 = stackOut_25_0;
                                    stackIn_26_0 = stackOut_25_0;
                                    if (var6 != 0) {
                                      break L3;
                                    } else {
                                      stackOut_26_0 = stackIn_26_0;
                                      stackIn_28_0 = stackOut_26_0;
                                      L7: {
                                        L8: {
                                          if (stackIn_28_0 != ((ce) this).field_s.field_q[((ce) this).field_w]) {
                                            break L8;
                                          } else {
                                            ((ce) this).field_w = ((ce) this).field_w + 1;
                                            if (var6 == 0) {
                                              break L7;
                                            } else {
                                              break L8;
                                            }
                                          }
                                        }
                                        L9: {
                                          if (((ce) this).field_u.field_b >= 250) {
                                            var3_int = 0;
                                            if (var6 == 0) {
                                              break L4;
                                            } else {
                                              break L9;
                                            }
                                          } else {
                                            break L9;
                                          }
                                        }
                                        L10: {
                                          if (0 != ((ce) this).field_p[((ce) this).field_w]) {
                                            break L10;
                                          } else {
                                            gj discarded$4 = this.a(1, 255, ((ce) this).field_w);
                                            break L10;
                                          }
                                        }
                                        L11: {
                                          if ((((ce) this).field_p[((ce) this).field_w] ^ -1) != -1) {
                                            break L11;
                                          } else {
                                            var4 = new ai();
                                            var4.field_d = (long)((ce) this).field_w;
                                            var3_int = 0;
                                            ((ce) this).field_h.a(1, var4);
                                            break L11;
                                          }
                                        }
                                        ((ce) this).field_w = ((ce) this).field_w + 1;
                                        if (var6 == 0) {
                                          break L7;
                                        } else {
                                          break L4;
                                        }
                                      }
                                      stackOut_23_0 = ((ce) this).field_s.field_q.length;
                                      stackIn_24_0 = stackOut_23_0;
                                      continue L6;
                                    }
                                  }
                                }
                              } else {
                                L12: {
                                  if (stackIn_12_0 == 0) {
                                    gj discarded$5 = this.a(1, 255, var5);
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                                L13: {
                                  L14: {
                                    if (((ce) this).field_p[var5] == 0) {
                                      break L14;
                                    } else {
                                      var4.c(2);
                                      if (var6 == 0) {
                                        break L13;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                  var3_int = 0;
                                  break L13;
                                }
                                var4 = ((ce) this).field_h.d((byte) -102);
                                if (var6 == 0) {
                                  continue L2;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                          L15: while (true) {
                            stackOut_23_0 = ((ce) this).field_s.field_q.length;
                            stackIn_24_0 = stackOut_23_0;
                            if (stackIn_24_0 <= ((ce) this).field_w) {
                              break L4;
                            } else {
                              stackOut_25_0 = 0;
                              stackIn_47_0 = stackOut_25_0;
                              stackIn_26_0 = stackOut_25_0;
                              if (var6 != 0) {
                                break L3;
                              } else {
                                stackOut_26_0 = stackIn_26_0;
                                stackIn_28_0 = stackOut_26_0;
                                L16: {
                                  if (stackIn_28_0 != ((ce) this).field_s.field_q[((ce) this).field_w]) {
                                    break L16;
                                  } else {
                                    ((ce) this).field_w = ((ce) this).field_w + 1;
                                    if (var6 == 0) {
                                      continue L15;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                                L17: {
                                  if (((ce) this).field_u.field_b >= 250) {
                                    var3_int = 0;
                                    if (var6 == 0) {
                                      break L4;
                                    } else {
                                      break L17;
                                    }
                                  } else {
                                    break L17;
                                  }
                                }
                                L18: {
                                  if (0 != ((ce) this).field_p[((ce) this).field_w]) {
                                    break L18;
                                  } else {
                                    gj discarded$4 = this.a(1, 255, ((ce) this).field_w);
                                    break L18;
                                  }
                                }
                                L19: {
                                  if ((((ce) this).field_p[((ce) this).field_w] ^ -1) != -1) {
                                    break L19;
                                  } else {
                                    var4 = new ai();
                                    var4.field_d = (long)((ce) this).field_w;
                                    var3_int = 0;
                                    ((ce) this).field_h.a(1, var4);
                                    break L19;
                                  }
                                }
                                ((ce) this).field_w = ((ce) this).field_w + 1;
                                if (var6 == 0) {
                                  continue L15;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                        }
                        stackOut_46_0 = var3_int;
                        stackIn_47_0 = stackOut_46_0;
                        break L3;
                      }
                      L20: {
                        if (stackIn_47_0 != 0) {
                          ((ce) this).field_g = false;
                          ((ce) this).field_w = 0;
                          break L20;
                        } else {
                          break L20;
                        }
                      }
                      if (var6 == 0) {
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
                L21: {
                  if (((ce) this).field_d) {
                    break L21;
                  } else {
                    ((ce) this).field_h = null;
                    if (var6 == 0) {
                      break L0;
                    } else {
                      break L21;
                    }
                  }
                }
                var3_int = 1;
                var4 = ((ce) this).field_h.a((byte) -45);
                L22: while (true) {
                  L23: {
                    L24: {
                      L25: {
                        if (var4 == null) {
                          break L25;
                        } else {
                          var5 = (int)var4.field_d;
                          stackOut_59_0 = -2;
                          stackOut_59_1 = ((ce) this).field_p[var5] ^ -1;
                          stackIn_71_0 = stackOut_59_0;
                          stackIn_71_1 = stackOut_59_1;
                          stackIn_60_0 = stackOut_59_0;
                          stackIn_60_1 = stackOut_59_1;
                          if (var6 != 0) {
                            L26: while (true) {
                              if (stackIn_71_0 <= stackIn_71_1) {
                                break L24;
                              } else {
                                stackOut_72_0 = ((ce) this).field_s.field_q[((ce) this).field_w] ^ -1;
                                stackIn_94_0 = stackOut_72_0;
                                stackIn_73_0 = stackOut_72_0;
                                if (var6 != 0) {
                                  break L23;
                                } else {
                                  stackOut_73_0 = stackIn_73_0;
                                  stackIn_75_0 = stackOut_73_0;
                                  L27: {
                                    L28: {
                                      if (stackIn_75_0 == -1) {
                                        ((ce) this).field_w = ((ce) this).field_w + 1;
                                        if (var6 == 0) {
                                          break L27;
                                        } else {
                                          break L28;
                                        }
                                      } else {
                                        break L28;
                                      }
                                    }
                                    L29: {
                                      if (!((ce) this).field_f.b((byte) 90)) {
                                        break L29;
                                      } else {
                                        var3_int = 0;
                                        if (var6 == 0) {
                                          break L24;
                                        } else {
                                          break L29;
                                        }
                                      }
                                    }
                                    L30: {
                                      if (((ce) this).field_p[((ce) this).field_w] == 1) {
                                        break L30;
                                      } else {
                                        gj discarded$6 = this.a(2, 255, ((ce) this).field_w);
                                        break L30;
                                      }
                                    }
                                    L31: {
                                      if (1 != ((ce) this).field_p[((ce) this).field_w]) {
                                        var4 = new ai();
                                        var4.field_d = (long)((ce) this).field_w;
                                        ((ce) this).field_h.a(1, var4);
                                        var3_int = 0;
                                        break L31;
                                      } else {
                                        break L31;
                                      }
                                    }
                                    ((ce) this).field_w = ((ce) this).field_w + 1;
                                    if (var6 == 0) {
                                      break L27;
                                    } else {
                                      break L24;
                                    }
                                  }
                                  stackOut_70_0 = ((ce) this).field_w ^ -1;
                                  stackOut_70_1 = ((ce) this).field_s.field_q.length ^ -1;
                                  stackIn_71_0 = stackOut_70_0;
                                  stackIn_71_1 = stackOut_70_1;
                                  continue L26;
                                }
                              }
                            }
                          } else {
                            L32: {
                              if (stackIn_60_0 == stackIn_60_1) {
                                break L32;
                              } else {
                                gj discarded$7 = this.a(2, 255, var5);
                                break L32;
                              }
                            }
                            L33: {
                              L34: {
                                if (1 == ((ce) this).field_p[var5]) {
                                  break L34;
                                } else {
                                  var3_int = 0;
                                  if (var6 == 0) {
                                    break L33;
                                  } else {
                                    break L34;
                                  }
                                }
                              }
                              var4.c(2);
                              break L33;
                            }
                            var4 = ((ce) this).field_h.d((byte) -47);
                            if (var6 == 0) {
                              continue L22;
                            } else {
                              break L25;
                            }
                          }
                        }
                      }
                      L35: while (true) {
                        stackOut_70_0 = ((ce) this).field_w ^ -1;
                        stackOut_70_1 = ((ce) this).field_s.field_q.length ^ -1;
                        stackIn_71_0 = stackOut_70_0;
                        stackIn_71_1 = stackOut_70_1;
                        if (stackIn_71_0 <= stackIn_71_1) {
                          break L24;
                        } else {
                          stackOut_72_0 = ((ce) this).field_s.field_q[((ce) this).field_w] ^ -1;
                          stackIn_94_0 = stackOut_72_0;
                          stackIn_73_0 = stackOut_72_0;
                          if (var6 != 0) {
                            break L23;
                          } else {
                            stackOut_73_0 = stackIn_73_0;
                            stackIn_75_0 = stackOut_73_0;
                            L36: {
                              if (stackIn_75_0 == -1) {
                                ((ce) this).field_w = ((ce) this).field_w + 1;
                                if (var6 == 0) {
                                  continue L35;
                                } else {
                                  break L36;
                                }
                              } else {
                                break L36;
                              }
                            }
                            L37: {
                              if (!((ce) this).field_f.b((byte) 90)) {
                                break L37;
                              } else {
                                var3_int = 0;
                                if (var6 == 0) {
                                  break L24;
                                } else {
                                  break L37;
                                }
                              }
                            }
                            L38: {
                              if (((ce) this).field_p[((ce) this).field_w] == 1) {
                                break L38;
                              } else {
                                gj discarded$6 = this.a(2, 255, ((ce) this).field_w);
                                break L38;
                              }
                            }
                            L39: {
                              if (1 != ((ce) this).field_p[((ce) this).field_w]) {
                                var4 = new ai();
                                var4.field_d = (long)((ce) this).field_w;
                                ((ce) this).field_h.a(1, var4);
                                var3_int = 0;
                                break L39;
                              } else {
                                break L39;
                              }
                            }
                            ((ce) this).field_w = ((ce) this).field_w + 1;
                            if (var6 == 0) {
                              continue L35;
                            } else {
                              break L24;
                            }
                          }
                        }
                      }
                    }
                    stackOut_93_0 = var3_int;
                    stackIn_94_0 = stackOut_93_0;
                    break L23;
                  }
                  if (stackIn_94_0 != 0) {
                    ((ce) this).field_d = false;
                    ((ce) this).field_w = 0;
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
            }
          }
          L40: {
            if (!((ce) this).field_v) {
              break L40;
            } else {
              if (((ce) this).field_e <= fa.a(75)) {
                var3 = (gj) (Object) ((ce) this).field_o.b(0);
                L41: while (true) {
                  L42: {
                    if (var3 == null) {
                      break L42;
                    } else {
                      if (var6 != 0) {
                        break L40;
                      } else {
                        L43: {
                          L44: {
                            if (!var3.field_n) {
                              break L44;
                            } else {
                              if (var6 == 0) {
                                break L43;
                              } else {
                                break L44;
                              }
                            }
                          }
                          L45: {
                            if (!var3.field_o) {
                              break L45;
                            } else {
                              if (var3.field_m) {
                                var3.c(2);
                                if (var6 == 0) {
                                  break L43;
                                } else {
                                  break L45;
                                }
                              } else {
                                throw new RuntimeException();
                              }
                            }
                          }
                          var3.field_o = true;
                          break L43;
                        }
                        var3 = (gj) (Object) ((ce) this).field_o.a(-1);
                        if (var6 == 0) {
                          continue L41;
                        } else {
                          break L42;
                        }
                      }
                    }
                  }
                  ((ce) this).field_e = fa.a(-27) - -1000L;
                  break L40;
                }
              } else {
                break L40;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var2, "ce.K(" + param0 + 41);
        }
    }

    final void d(int param0) {
        RuntimeException var2 = null;
        ai var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Bounce.field_N;
        try {
          if (null == ((ce) this).field_h) {
            return;
          } else {
            if (null == ((ce) this).b(1)) {
              return;
            } else {
              if (param0 == 2348) {
                var2_ref = ((ce) this).field_c.a((byte) -101);
                L0: while (true) {
                  L1: {
                    L2: {
                      if (null == var2_ref) {
                        break L2;
                      } else {
                        var3 = (int)var2_ref.field_d;
                        if (var4 != 0) {
                          break L1;
                        } else {
                          L3: {
                            L4: {
                              L5: {
                                if (0 > var3) {
                                  break L5;
                                } else {
                                  if ((var3 ^ -1) <= (((ce) this).field_s.field_m ^ -1)) {
                                    break L5;
                                  } else {
                                    if (-1 == (((ce) this).field_s.field_q[var3] ^ -1)) {
                                      break L5;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                              }
                              var2_ref.c(2);
                              if (var4 == 0) {
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                            L6: {
                              if (-1 != (((ce) this).field_p[var3] ^ -1)) {
                                break L6;
                              } else {
                                gj discarded$2 = this.a(1, param0 + -2093, var3);
                                break L6;
                              }
                            }
                            L7: {
                              if ((((ce) this).field_p[var3] ^ -1) == 0) {
                                gj discarded$3 = this.a(2, 255, var3);
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            if ((((ce) this).field_p[var3] ^ -1) != -2) {
                              break L3;
                            } else {
                              var2_ref.c(2);
                              break L3;
                            }
                          }
                          var2_ref = ((ce) this).field_c.d((byte) -108);
                          if (var4 == 0) {
                            continue L0;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                    break L1;
                  }
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var2, "ce.H(" + param0 + 41);
        }
    }

    ce(int param0, vh param1, vh param2, v param3, vi param4, int param5, byte[] param6, int param7, boolean param8) {
        RuntimeException var10 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
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
        ((ce) this).field_o = new uk(16);
        ((ce) this).field_w = 0;
        ((ce) this).field_c = new bc();
        ((ce) this).field_e = 0L;
        try {
          L0: {
            L1: {
              ((ce) this).field_k = param1;
              ((ce) this).field_q = param0;
              if (((ce) this).field_k == null) {
                break L1;
              } else {
                ((ce) this).field_g = true;
                ((ce) this).field_h = new bc();
                if (Bounce.field_N == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            ((ce) this).field_g = false;
            break L0;
          }
          L2: {
            ((ce) this).field_j = param7;
            ((ce) this).field_f = param3;
            ((ce) this).field_v = param8;
            ((ce) this).field_r = param5;
            ((ce) this).field_m = param6;
            ((ce) this).field_u = param4;
            ((ce) this).field_l = param2;
            if (((ce) this).field_l == null) {
              break L2;
            } else {
              ((ce) this).field_i = (gj) (Object) ((ce) this).field_u.a(((ce) this).field_q, ((ce) this).field_l, true);
              break L2;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var10 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var10;
            stackOut_9_1 = new StringBuilder().append("ce.<init>(").append(param0).append(44);
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44);
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
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
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(44);
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param4 == null) {
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
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(44).append(param5).append(44);
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param6 == null) {
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
          throw ii.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 44 + param7 + 44 + param8 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new int[256];
        field_t = "Creating your account";
    }
}
