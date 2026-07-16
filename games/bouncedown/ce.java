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
        var3 = (gj) (Object) ((ce) this).field_o.a(19, (long)param1);
        if (param0 >= 111) {
          if (var3 != null) {
            return var3.c((byte) -120);
          } else {
            return 0;
          }
        } else {
          return -12;
        }
    }

    final byte[] a(int param0, boolean param1) {
        gj var3 = null;
        byte[] var4 = null;
        var3 = this.a(0, 255, param0);
        if (var3 == null) {
          return null;
        } else {
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
          return var4;
        }
    }

    final void b(byte param0) {
        if (((ce) this).field_k == null) {
          return;
        } else {
          ((ce) this).field_d = true;
          if (param0 >= -72) {
            return;
          } else {
            L0: {
              if (null == ((ce) this).field_h) {
                ((ce) this).field_h = new bc();
                break L0;
              } else {
                break L0;
              }
            }
            return;
          }
        }
    }

    final g b(int param0) {
        byte[] var2 = null;
        int var4 = 0;
        byte[] var5 = null;
        var4 = Bounce.field_N;
        if (((ce) this).field_s != null) {
          return ((ce) this).field_s;
        } else {
          L0: {
            if (((ce) this).field_i != null) {
              break L0;
            } else {
              if (!((ce) this).field_f.b(false)) {
                ((ce) this).field_i = (gj) (Object) ((ce) this).field_f.a(((ce) this).field_q, (byte) 0, param0 ^ -102, true, 255);
                break L0;
              } else {
                return null;
              }
            }
          }
          if (!((ce) this).field_i.field_n) {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                ((ce) this).field_k = null;
                break L1;
              }
            }
            var5 = ((ce) this).field_i.d((byte) -115);
            var2 = var5;
            if (!(((ce) this).field_i instanceof md)) {
              if (var5 == null) {
                throw new RuntimeException();
              } else {
                L2: {
                  ((ce) this).field_s = new g(var5, ((ce) this).field_r, ((ce) this).field_m);
                  if (((ce) this).field_l == null) {
                    break L2;
                  } else {
                    md discarded$1 = ((ce) this).field_u.a(((ce) this).field_l, ((ce) this).field_q, (byte) -78, var5);
                    break L2;
                  }
                }
                L3: {
                  ((ce) this).field_i = null;
                  if (((ce) this).field_k == null) {
                    break L3;
                  } else {
                    ((ce) this).field_p = new byte[((ce) this).field_s.field_m];
                    break L3;
                  }
                }
                return ((ce) this).field_s;
              }
            } else {
              if (var5 != null) {
                ((ce) this).field_s = new g(var5, ((ce) this).field_r, ((ce) this).field_m);
                if (((ce) this).field_j != ((ce) this).field_s.field_h) {
                  throw new RuntimeException();
                } else {
                  L4: {
                    ((ce) this).field_i = null;
                    if (((ce) this).field_k == null) {
                      break L4;
                    } else {
                      ((ce) this).field_p = new byte[((ce) this).field_s.field_m];
                      break L4;
                    }
                  }
                  return ((ce) this).field_s;
                }
              } else {
                throw new RuntimeException();
              }
            }
          } else {
            return null;
          }
        }
    }

    public static void c(byte param0) {
        if (param0 >= -27) {
            return;
        }
        field_t = null;
        field_n = null;
    }

    private final gj a(int param0, int param1, int param2) {
        Object var4 = null;
        byte[] var5 = null;
        Exception var6 = null;
        int var6_int = 0;
        int var7 = 0;
        byte[] var7_ref_byte__ = null;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        byte stackIn_69_0 = 0;
        byte stackIn_69_1 = 0;
        byte stackIn_75_0 = 0;
        byte stackIn_75_1 = 0;
        byte stackIn_99_0 = 0;
        byte stackIn_99_1 = 0;
        int stackIn_104_0 = 0;
        int stackIn_104_1 = 0;
        Object stackIn_114_0 = null;
        Throwable decompiledCaughtException = null;
        byte stackOut_98_0 = 0;
        byte stackOut_98_1 = 0;
        int stackOut_103_0 = 0;
        int stackOut_103_1 = 0;
        Object stackOut_113_0 = null;
        byte stackOut_68_0 = 0;
        byte stackOut_68_1 = 0;
        L0: {
          var10 = Bounce.field_N;
          var4 = (Object) (Object) (gj) (Object) ((ce) this).field_o.a(36, (long)param2);
          if (var4 == null) {
            break L0;
          } else {
            if (0 != param0) {
              break L0;
            } else {
              if (((gj) var4).field_m) {
                break L0;
              } else {
                if (!((gj) var4).field_n) {
                  break L0;
                } else {
                  ((gj) var4).c(param1 ^ 253);
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
                if (-1 != (param0 ^ -1)) {
                  break L3;
                } else {
                  L4: {
                    if (((ce) this).field_k == null) {
                      break L4;
                    } else {
                      if ((((ce) this).field_p[param2] ^ -1) != 0) {
                        var4 = (Object) (Object) ((ce) this).field_u.a(param2, ((ce) this).field_k, true);
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (!((ce) this).field_f.b(false)) {
                    var4 = (Object) (Object) ((ce) this).field_f.a(param2, (byte) 2, 81, true, ((ce) this).field_q);
                    if (var10 == 0) {
                      break L2;
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              }
              if (-2 == (param0 ^ -1)) {
                if (null == ((ce) this).field_k) {
                  throw new RuntimeException();
                } else {
                  var4 = (Object) (Object) ((ce) this).field_u.a(3, param2, ((ce) this).field_k);
                  break L2;
                }
              } else {
                if (param0 == 2) {
                  if (null != ((ce) this).field_k) {
                    if (-1 != ((ce) this).field_p[param2]) {
                      throw new RuntimeException();
                    } else {
                      if (((ce) this).field_f.b((byte) 39)) {
                        return null;
                      } else {
                        var4 = (Object) (Object) ((ce) this).field_f.a(param2, (byte) 2, -122, false, ((ce) this).field_q);
                        throw new RuntimeException();
                      }
                    }
                  } else {
                    throw new RuntimeException();
                  }
                } else {
                  throw new RuntimeException();
                }
              }
            }
            ((ce) this).field_o.a((long)param2, param1 + -172, (ai) var4);
            break L1;
          } else {
            break L1;
          }
        }
        if (!((gj) var4).field_n) {
          if (param1 == 255) {
            var5 = ((gj) var4).d((byte) -120);
            if (var4 instanceof md) {
              try {
                L5: {
                  L6: {
                    if (var5 == null) {
                      break L6;
                    } else {
                      if (2 < var5.length) {
                        uf.field_b.reset();
                        uf.field_b.update(var5, 0, -2 + var5.length);
                        var6_int = (int)uf.field_b.getValue();
                        if (((ce) this).field_s.field_j[param2] == var6_int) {
                          L7: {
                            L8: {
                              if (null == ((ce) this).field_s.field_e) {
                                break L8;
                              } else {
                                if (((ce) this).field_s.field_e[param2] == null) {
                                  break L8;
                                } else {
                                  var7_ref_byte__ = ((ce) this).field_s.field_e[param2];
                                  var8 = jd.a(var5, 0, var5.length + -2, 0);
                                  var9 = 0;
                                  L9: while (true) {
                                    if (64 <= var9) {
                                      break L8;
                                    } else {
                                      stackOut_98_0 = var7_ref_byte__[var9];
                                      stackOut_98_1 = var8[var9];
                                      stackIn_104_0 = stackOut_98_0;
                                      stackIn_104_1 = stackOut_98_1;
                                      stackIn_99_0 = stackOut_98_0;
                                      stackIn_99_1 = stackOut_98_1;
                                      if (var10 != 0) {
                                        break L7;
                                      } else {
                                        if (stackIn_99_0 != stackIn_99_1) {
                                          throw new RuntimeException();
                                        } else {
                                          var9++;
                                          if (var10 == 0) {
                                            continue L9;
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
                            stackOut_103_0 = 65280 & var5[var5.length + -2] << -1881332952;
                            stackOut_103_1 = -(var5[-1 + var5.length] & 255);
                            stackIn_104_0 = stackOut_103_0;
                            stackIn_104_1 = stackOut_103_1;
                            break L7;
                          }
                          var7 = stackIn_104_0 - stackIn_104_1;
                          if (var7 != (65535 & ((ce) this).field_s.field_g[param2])) {
                            throw new RuntimeException();
                          } else {
                            L10: {
                              if (-2 != (((ce) this).field_p[param2] ^ -1)) {
                                L11: {
                                  if (0 != ((ce) this).field_p[param2]) {
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                                ((ce) this).field_p[param2] = (byte) 1;
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                            L12: {
                              if (((gj) var4).field_m) {
                                break L12;
                              } else {
                                ((gj) var4).c(2);
                                break L12;
                              }
                            }
                            stackOut_113_0 = var4;
                            stackIn_114_0 = stackOut_113_0;
                            break L5;
                          }
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        break L6;
                      }
                    }
                  }
                  throw new RuntimeException();
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L13: {
                  var6 = (Exception) (Object) decompiledCaughtException;
                  ((ce) this).field_p[param2] = (byte)-1;
                  ((gj) var4).c(2);
                  if (((gj) var4).field_m) {
                    if (!((ce) this).field_f.b(false)) {
                      var4 = (Object) (Object) ((ce) this).field_f.a(param2, (byte) 2, 36, true, ((ce) this).field_q);
                      ((ce) this).field_o.a((long)param2, 124, (ai) var4);
                      break L13;
                    } else {
                      break L13;
                    }
                  } else {
                    break L13;
                  }
                }
                return null;
              }
              return (gj) (Object) stackIn_114_0;
            } else {
              L14: {
                if (var5 == null) {
                  break L14;
                } else {
                  if (2 < var5.length) {
                    uf.field_b.reset();
                    uf.field_b.update(var5, 0, var5.length + -2);
                    var6_int = (int)uf.field_b.getValue();
                    if (((ce) this).field_s.field_j[param2] != var6_int) {
                      throw new RuntimeException();
                    } else {
                      if (null != ((ce) this).field_s.field_e) {
                        if (((ce) this).field_s.field_e[param2] != null) {
                          var7_ref_byte__ = ((ce) this).field_s.field_e[param2];
                          var8 = jd.a(var5, 0, var5.length - 2, param1 + -255);
                          var9 = 0;
                          L15: while (true) {
                            if ((var9 ^ -1) > -65) {
                              stackOut_68_0 = var8[var9];
                              stackOut_68_1 = var7_ref_byte__[var9];
                              stackIn_75_0 = stackOut_68_0;
                              stackIn_75_1 = stackOut_68_1;
                              stackIn_69_0 = stackOut_68_0;
                              stackIn_69_1 = stackOut_68_1;
                              if (var10 == 0) {
                                if (stackIn_75_0 != stackIn_75_1) {
                                  throw new RuntimeException();
                                } else {
                                  var9++;
                                  continue L15;
                                }
                              } else {
                                L16: {
                                  if (stackIn_69_0 != stackIn_69_1) {
                                    ((ce) this).field_p[param2] = (byte) 1;
                                    break L16;
                                  } else {
                                    break L16;
                                  }
                                }
                                L17: {
                                  if (((gj) var4).field_m) {
                                    break L17;
                                  } else {
                                    ((gj) var4).c(2);
                                    break L17;
                                  }
                                }
                                return (gj) var4;
                              }
                            } else {
                              ((ce) this).field_f.field_l = 0;
                              ((ce) this).field_f.field_d = 0;
                              L18: {
                                var5[var5.length + -2] = (byte)(((ce) this).field_s.field_g[param2] >>> -973906456);
                                var5[-1 + var5.length] = (byte)((ce) this).field_s.field_g[param2];
                                if (null != ((ce) this).field_k) {
                                  md discarded$3 = ((ce) this).field_u.a(((ce) this).field_k, param2, (byte) 97, var5);
                                  if (((ce) this).field_p[param2] != 1) {
                                    ((ce) this).field_p[param2] = (byte) 1;
                                    break L18;
                                  } else {
                                    break L18;
                                  }
                                } else {
                                  break L18;
                                }
                              }
                              L19: {
                                if (((gj) var4).field_m) {
                                  break L19;
                                } else {
                                  ((gj) var4).c(2);
                                  break L19;
                                }
                              }
                              return (gj) var4;
                            }
                          }
                        } else {
                          ((ce) this).field_f.field_l = 0;
                          ((ce) this).field_f.field_d = 0;
                          L20: {
                            var5[var5.length + -2] = (byte)(((ce) this).field_s.field_g[param2] >>> -973906456);
                            var5[-1 + var5.length] = (byte)((ce) this).field_s.field_g[param2];
                            if (null != ((ce) this).field_k) {
                              md discarded$4 = ((ce) this).field_u.a(((ce) this).field_k, param2, (byte) 97, var5);
                              if (((ce) this).field_p[param2] != 1) {
                                ((ce) this).field_p[param2] = (byte) 1;
                                break L20;
                              } else {
                                break L20;
                              }
                            } else {
                              break L20;
                            }
                          }
                          L21: {
                            if (((gj) var4).field_m) {
                              break L21;
                            } else {
                              ((gj) var4).c(2);
                              break L21;
                            }
                          }
                          return (gj) var4;
                        }
                      } else {
                        ((ce) this).field_f.field_l = 0;
                        ((ce) this).field_f.field_d = 0;
                        L22: {
                          var5[var5.length + -2] = (byte)(((ce) this).field_s.field_g[param2] >>> -973906456);
                          var5[-1 + var5.length] = (byte)((ce) this).field_s.field_g[param2];
                          if (null != ((ce) this).field_k) {
                            md discarded$5 = ((ce) this).field_u.a(((ce) this).field_k, param2, (byte) 97, var5);
                            if (((ce) this).field_p[param2] != 1) {
                              ((ce) this).field_p[param2] = (byte) 1;
                              break L22;
                            } else {
                              break L22;
                            }
                          } else {
                            break L22;
                          }
                        }
                        L23: {
                          if (((gj) var4).field_m) {
                            break L23;
                          } else {
                            ((gj) var4).c(2);
                            break L23;
                          }
                        }
                        return (gj) var4;
                      }
                    }
                  } else {
                    break L14;
                  }
                }
              }
              throw new RuntimeException();
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static String a(CharSequence param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_11_0 = false;
        int stackIn_15_0 = 0;
        boolean stackIn_22_0 = false;
        int stackIn_29_0 = 0;
        boolean stackIn_34_0 = false;
        boolean stackIn_37_0 = false;
        int stackIn_38_0 = 0;
        boolean stackOut_4_0 = false;
        boolean stackOut_36_0 = false;
        boolean stackOut_37_0 = false;
        int stackOut_40_0 = 0;
        boolean stackOut_10_0 = false;
        int stackOut_14_0 = 0;
        boolean stackOut_21_0 = false;
        int stackOut_28_0 = 0;
        var9 = Bounce.field_N;
        if (param0 != null) {
          var2 = param1;
          var3 = param0.length();
          L0: while (true) {
            L1: {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      if ((var2 ^ -1) <= (var3 ^ -1)) {
                        break L5;
                      } else {
                        stackOut_4_0 = f.a(param0.charAt(var2), false);
                        stackIn_38_0 = stackOut_4_0 ? 1 : 0;
                        stackIn_5_0 = stackOut_4_0;
                        if (var9 != 0) {
                          L6: while (true) {
                            if (stackIn_38_0 >= (var2 ^ -1)) {
                              break L2;
                            } else {
                              stackOut_36_0 = f.a(param0.charAt(-1 + var3), false);
                              stackIn_15_0 = stackOut_36_0 ? 1 : 0;
                              stackIn_37_0 = stackOut_36_0;
                              if (var9 != 0) {
                                break L1;
                              } else {
                                stackOut_37_0 = stackIn_37_0;
                                stackIn_34_0 = stackOut_37_0;
                                if (!stackIn_34_0) {
                                  break L2;
                                } else {
                                  var3--;
                                  if (var9 == 0) {
                                    stackOut_40_0 = var3 ^ -1;
                                    stackIn_38_0 = stackOut_40_0;
                                    continue L6;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          if (!stackIn_5_0) {
                            break L5;
                          } else {
                            var2++;
                            if (var9 == 0) {
                              continue L0;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    break L4;
                  }
                  L7: while (true) {
                    if ((var3 ^ -1) >= (var2 ^ -1)) {
                      break L2;
                    } else {
                      stackOut_10_0 = f.a(param0.charAt(-1 + var3), false);
                      stackIn_15_0 = stackOut_10_0 ? 1 : 0;
                      stackIn_11_0 = stackOut_10_0;
                      if (var9 != 0) {
                        break L1;
                      } else {
                        if (!stackIn_11_0) {
                          break L2;
                        } else {
                          var3--;
                          if (var9 == 0) {
                            continue L7;
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
              stackOut_14_0 = var3 - var2;
              stackIn_15_0 = stackOut_14_0;
              break L1;
            }
            var4 = stackIn_15_0;
            if ((var4 ^ -1) <= -2) {
              if (-13 <= (var4 ^ -1)) {
                var5 = new StringBuilder(var4);
                var6 = var2;
                L8: while (true) {
                  L9: {
                    L10: {
                      if (var3 <= var6) {
                        break L10;
                      } else {
                        var7 = param0.charAt(var6);
                        stackOut_21_0 = ng.a((byte) -95, (char) var7);
                        stackIn_29_0 = stackOut_21_0 ? 1 : 0;
                        stackIn_22_0 = stackOut_21_0;
                        if (var9 != 0) {
                          break L9;
                        } else {
                          L11: {
                            if (!stackIn_22_0) {
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
                    stackOut_28_0 = 0;
                    stackIn_29_0 = stackOut_28_0;
                    break L9;
                  }
                  if (stackIn_29_0 != var5.length()) {
                    return var5.toString();
                  } else {
                    return null;
                  }
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final void c(int param0) {
        int var2 = 0;
        gj var3 = null;
        int var3_int = 0;
        ai var4 = null;
        int var5 = 0;
        int var6 = 0;
        byte stackIn_8_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_91_0 = 0;
        int stackIn_91_1 = 0;
        int stackIn_95_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_99_0 = 0;
        int stackOut_18_0 = 0;
        byte stackOut_7_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        int stackOut_89_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_93_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_60_0 = 0;
        L0: {
          var6 = Bounce.field_N;
          var2 = 97 % ((46 - param0) / 34);
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
                          if (var4 == null) {
                            L6: while (true) {
                              if (((ce) this).field_s.field_q.length <= ((ce) this).field_w) {
                                break L4;
                              } else {
                                stackOut_18_0 = 0;
                                stackIn_31_0 = stackOut_18_0;
                                stackIn_19_0 = stackOut_18_0;
                                if (var6 != 0) {
                                  break L3;
                                } else {
                                  if (stackIn_19_0 != ((ce) this).field_s.field_q[((ce) this).field_w]) {
                                    break L5;
                                  } else {
                                    ((ce) this).field_w = ((ce) this).field_w + 1;
                                    continue L6;
                                  }
                                }
                              }
                            }
                          } else {
                            var5 = (int)var4.field_d;
                            stackOut_7_0 = ((ce) this).field_p[var5];
                            stackIn_99_0 = stackOut_7_0;
                            stackIn_8_0 = stackOut_7_0;
                            if (var6 != 0) {
                              L7: while (true) {
                                if (stackIn_99_0 <= ((ce) this).field_w) {
                                  break L4;
                                } else {
                                  stackOut_97_0 = 0;
                                  stackIn_31_0 = stackOut_97_0;
                                  stackIn_98_0 = stackOut_97_0;
                                  if (var6 != 0) {
                                    break L3;
                                  } else {
                                    stackOut_98_0 = stackIn_98_0;
                                    stackIn_95_0 = stackOut_98_0;
                                    if (stackIn_95_0 != ((ce) this).field_s.field_q[((ce) this).field_w]) {
                                      break L5;
                                    } else {
                                      ((ce) this).field_w = ((ce) this).field_w + 1;
                                      stackOut_101_0 = ((ce) this).field_s.field_q.length;
                                      stackIn_99_0 = stackOut_101_0;
                                      continue L7;
                                    }
                                  }
                                }
                              }
                            } else {
                              L8: {
                                if (stackIn_8_0 == 0) {
                                  gj discarded$4 = this.a(1, 255, var5);
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                              L9: {
                                L10: {
                                  if (((ce) this).field_p[var5] == 0) {
                                    break L10;
                                  } else {
                                    var4.c(2);
                                    if (var6 == 0) {
                                      break L9;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                var3_int = 0;
                                break L9;
                              }
                              var4 = ((ce) this).field_h.d((byte) -102);
                              continue L2;
                            }
                          }
                        }
                        L11: {
                          if (((ce) this).field_u.field_b >= 250) {
                            var3_int = 0;
                            if (var6 == 0) {
                              break L4;
                            } else {
                              break L11;
                            }
                          } else {
                            break L11;
                          }
                        }
                        L12: {
                          if (0 != ((ce) this).field_p[((ce) this).field_w]) {
                            break L12;
                          } else {
                            gj discarded$5 = this.a(1, 255, ((ce) this).field_w);
                            break L12;
                          }
                        }
                        L13: {
                          if (((ce) this).field_p[((ce) this).field_w] != 0) {
                            break L13;
                          } else {
                            var4 = new ai();
                            var4.field_d = (long)((ce) this).field_w;
                            var3_int = 0;
                            ((ce) this).field_h.a(1, var4);
                            break L13;
                          }
                        }
                        ((ce) this).field_w = ((ce) this).field_w + 1;
                        break L4;
                      }
                      stackOut_30_0 = var3_int;
                      stackIn_31_0 = stackOut_30_0;
                      break L3;
                    }
                    L14: {
                      if (stackIn_31_0 != 0) {
                        ((ce) this).field_g = false;
                        ((ce) this).field_w = 0;
                        break L14;
                      } else {
                        break L14;
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
              L15: {
                if (((ce) this).field_d) {
                  break L15;
                } else {
                  ((ce) this).field_h = null;
                  break L15;
                }
              }
              var3_int = 1;
              var4 = ((ce) this).field_h.a((byte) -45);
              L16: while (true) {
                L17: {
                  L18: {
                    L19: {
                      L20: {
                        L21: {
                          if (var4 == null) {
                            break L21;
                          } else {
                            var5 = (int)var4.field_d;
                            stackOut_39_0 = -2;
                            stackOut_39_1 = ((ce) this).field_p[var5] ^ -1;
                            stackIn_91_0 = stackOut_39_0;
                            stackIn_91_1 = stackOut_39_1;
                            stackIn_40_0 = stackOut_39_0;
                            stackIn_40_1 = stackOut_39_1;
                            if (var6 != 0) {
                              L22: while (true) {
                                if (stackIn_91_0 >= stackIn_91_1) {
                                  break L18;
                                } else {
                                  stackOut_89_0 = ((ce) this).field_s.field_q[((ce) this).field_w] ^ -1;
                                  stackIn_61_0 = stackOut_89_0;
                                  stackIn_90_0 = stackOut_89_0;
                                  if (var6 != 0) {
                                    break L17;
                                  } else {
                                    stackOut_90_0 = stackIn_90_0;
                                    stackIn_87_0 = stackOut_90_0;
                                    if (stackIn_87_0 == -1) {
                                      ((ce) this).field_w = ((ce) this).field_w + 1;
                                      if (var6 == 0) {
                                        stackOut_93_0 = ((ce) this).field_w;
                                        stackOut_93_1 = ((ce) this).field_s.field_q.length;
                                        stackIn_91_0 = stackOut_93_0;
                                        stackIn_91_1 = stackOut_93_1;
                                        continue L22;
                                      } else {
                                        break L19;
                                      }
                                    } else {
                                      break L20;
                                    }
                                  }
                                }
                              }
                            } else {
                              L23: {
                                if (stackIn_40_0 == stackIn_40_1) {
                                  break L23;
                                } else {
                                  gj discarded$6 = this.a(2, 255, var5);
                                  break L23;
                                }
                              }
                              L24: {
                                L25: {
                                  if (1 == ((ce) this).field_p[var5]) {
                                    break L25;
                                  } else {
                                    var3_int = 0;
                                    if (var6 == 0) {
                                      break L24;
                                    } else {
                                      break L25;
                                    }
                                  }
                                }
                                var4.c(2);
                                break L24;
                              }
                              var4 = ((ce) this).field_h.d((byte) -47);
                              if (var6 == 0) {
                                continue L16;
                              } else {
                                break L21;
                              }
                            }
                          }
                        }
                        L26: while (true) {
                          if (((ce) this).field_w >= ((ce) this).field_s.field_q.length) {
                            break L18;
                          } else {
                            stackOut_48_0 = ((ce) this).field_s.field_q[((ce) this).field_w] ^ -1;
                            stackIn_61_0 = stackOut_48_0;
                            stackIn_49_0 = stackOut_48_0;
                            if (var6 != 0) {
                              break L17;
                            } else {
                              if (stackIn_49_0 == -1) {
                                ((ce) this).field_w = ((ce) this).field_w + 1;
                                if (var6 == 0) {
                                  continue L26;
                                } else {
                                  break L19;
                                }
                              } else {
                                break L20;
                              }
                            }
                          }
                        }
                      }
                      break L19;
                    }
                    L27: {
                      if (!((ce) this).field_f.b((byte) 90)) {
                        break L27;
                      } else {
                        var3_int = 0;
                        if (var6 == 0) {
                          break L18;
                        } else {
                          break L27;
                        }
                      }
                    }
                    L28: {
                      if (((ce) this).field_p[((ce) this).field_w] == 1) {
                        break L28;
                      } else {
                        gj discarded$7 = this.a(2, 255, ((ce) this).field_w);
                        break L28;
                      }
                    }
                    L29: {
                      if (1 != ((ce) this).field_p[((ce) this).field_w]) {
                        var4 = new ai();
                        var4.field_d = (long)((ce) this).field_w;
                        ((ce) this).field_h.a(1, var4);
                        var3_int = 0;
                        break L29;
                      } else {
                        break L29;
                      }
                    }
                    ((ce) this).field_w = ((ce) this).field_w + 1;
                    break L18;
                  }
                  stackOut_60_0 = var3_int;
                  stackIn_61_0 = stackOut_60_0;
                  break L17;
                }
                if (stackIn_61_0 != 0) {
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
        if (((ce) this).field_v) {
          if (((ce) this).field_e <= fa.a(75)) {
            var3 = (gj) (Object) ((ce) this).field_o.b(0);
            L30: while (true) {
              if (var3 != null) {
                if (var6 == 0) {
                  L31: {
                    L32: {
                      if (!var3.field_n) {
                        break L32;
                      } else {
                        if (var6 == 0) {
                          break L31;
                        } else {
                          break L32;
                        }
                      }
                    }
                    L33: {
                      if (!var3.field_o) {
                        break L33;
                      } else {
                        if (var3.field_m) {
                          var3.c(2);
                          break L33;
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    }
                    var3.field_o = true;
                    break L31;
                  }
                  var3 = (gj) (Object) ((ce) this).field_o.a(-1);
                  continue L30;
                } else {
                  return;
                }
              } else {
                ((ce) this).field_e = fa.a(-27) - -1000L;
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void d(int param0) {
        ai var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = Bounce.field_N;
        if (null == ((ce) this).field_h) {
          return;
        } else {
          if (null == ((ce) this).b(1)) {
            return;
          } else {
            if (param0 != 2348) {
              return;
            } else {
              var2 = ((ce) this).field_c.a((byte) -101);
              L0: while (true) {
                L1: {
                  if (var2 == null) {
                    break L1;
                  } else {
                    var3 = (int)var2.field_d;
                    if (var4 != 0) {
                      break L1;
                    } else {
                      L2: {
                        L3: {
                          L4: {
                            if (0 > var3) {
                              break L4;
                            } else {
                              if (var3 >= ((ce) this).field_s.field_m) {
                                break L4;
                              } else {
                                if (-1 == ((ce) this).field_s.field_q[var3]) {
                                  break L4;
                                } else {
                                  break L3;
                                }
                              }
                            }
                          }
                          var2.c(2);
                          if (var4 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                        L5: {
                          if (-1 != ((ce) this).field_p[var3]) {
                            break L5;
                          } else {
                            gj discarded$2 = this.a(1, param0 + -2093, var3);
                            break L5;
                          }
                        }
                        L6: {
                          if ((((ce) this).field_p[var3] ^ -1) == 0) {
                            gj discarded$3 = this.a(2, 255, var3);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        if ((((ce) this).field_p[var3] ^ -1) != -2) {
                          break L2;
                        } else {
                          var2.c(2);
                          break L2;
                        }
                      }
                      var2 = ((ce) this).field_c.d((byte) -108);
                      if (var4 == 0) {
                        continue L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
                return;
              }
            }
          }
        }
    }

    ce(int param0, vh param1, vh param2, v param3, vi param4, int param5, byte[] param6, int param7, boolean param8) {
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
            ((ce) this).field_o = new uk(16);
            ((ce) this).field_w = 0;
            ((ce) this).field_c = new bc();
            ((ce) this).field_e = 0L;
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
          ((ce) this).field_v = stackIn_6_1 != 0;
          ((ce) this).field_r = param5;
          ((ce) this).field_m = param6;
          ((ce) this).field_u = param4;
          ((ce) this).field_l = param2;
          if (((ce) this).field_l == null) {
            break L3;
          } else {
            ((ce) this).field_i = (gj) (Object) ((ce) this).field_u.a(((ce) this).field_q, ((ce) this).field_l, true);
            break L3;
          }
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
