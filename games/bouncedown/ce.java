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
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        RuntimeException decompiledCaughtException = null;
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
            L2: {
              var5 = ((ce) this).field_i.d((byte) -115);
              var2 = var5;
              if (!(((ce) this).field_i instanceof md)) {
                try {
                  L3: {
                    if (var5 != null) {
                      ((ce) this).field_s = new g(var5, ((ce) this).field_r, ((ce) this).field_m);
                      break L3;
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var3 = decompiledCaughtException;
                  ((ce) this).field_f.c((byte) 118);
                  ((ce) this).field_s = null;
                  if (!((ce) this).field_f.b(false)) {
                    ((ce) this).field_i = (gj) (Object) ((ce) this).field_f.a(((ce) this).field_q, (byte) 0, -102, true, 255);
                    if (var4 == 0) {
                      return null;
                    } else {
                      ((ce) this).field_i = null;
                      return null;
                    }
                  } else {
                    ((ce) this).field_i = null;
                    return null;
                  }
                }
                if (((ce) this).field_l == null) {
                  break L2;
                } else {
                  md discarded$1 = ((ce) this).field_u.a(((ce) this).field_l, ((ce) this).field_q, (byte) -78, var5);
                  break L2;
                }
              } else {
                try {
                  L4: {
                    if (var5 != null) {
                      ((ce) this).field_s = new g(var5, ((ce) this).field_r, ((ce) this).field_m);
                      if (((ce) this).field_j != ((ce) this).field_s.field_h) {
                        throw new RuntimeException();
                      } else {
                        break L4;
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var3 = decompiledCaughtException;
                  ((ce) this).field_s = null;
                  if (((ce) this).field_f.b(false)) {
                    ((ce) this).field_i = null;
                    if (var4 == 0) {
                      return null;
                    } else {
                      ((ce) this).field_i = (gj) (Object) ((ce) this).field_f.a(((ce) this).field_q, (byte) 0, 107, true, 255);
                      return null;
                    }
                  } else {
                    ((ce) this).field_i = (gj) (Object) ((ce) this).field_f.a(((ce) this).field_q, (byte) 0, 107, true, 255);
                    return null;
                  }
                }
                break L2;
              }
            }
            L5: {
              ((ce) this).field_i = null;
              if (((ce) this).field_k == null) {
                break L5;
              } else {
                ((ce) this).field_p = new byte[((ce) this).field_s.field_m];
                break L5;
              }
            }
            return ((ce) this).field_s;
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
        RuntimeException var6 = null;
        Exception var6_ref = null;
        int var6_int = 0;
        int var7 = 0;
        byte[] var7_ref_byte__ = null;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        byte stackIn_51_0 = 0;
        byte stackIn_51_1 = 0;
        byte stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        byte stackIn_84_0 = 0;
        byte stackIn_84_1 = 0;
        int stackIn_89_0 = 0;
        int stackIn_89_1 = 0;
        Object stackIn_99_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        byte stackOut_83_0 = 0;
        byte stackOut_83_1 = 0;
        int stackOut_88_0 = 0;
        int stackOut_88_1 = 0;
        Object stackOut_98_0 = null;
        byte stackOut_50_0 = 0;
        byte stackOut_50_1 = 0;
        byte stackOut_66_0 = 0;
        int stackOut_66_1 = 0;
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
                if (param0 != 0) {
                  break L3;
                } else {
                  L4: {
                    if (((ce) this).field_k == null) {
                      break L4;
                    } else {
                      if (((ce) this).field_p[param2] != -1) {
                        var4 = (Object) (Object) ((ce) this).field_u.a(param2, ((ce) this).field_k, true);
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
              if (param0 == 1) {
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
                      if (!((ce) this).field_f.b((byte) 39)) {
                        var4 = (Object) (Object) ((ce) this).field_f.a(param2, (byte) 2, -122, false, ((ce) this).field_q);
                        if (var10 == 0) {
                          break L2;
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        return null;
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
                                      stackOut_83_0 = var7_ref_byte__[var9];
                                      stackOut_83_1 = var8[var9];
                                      stackIn_89_0 = stackOut_83_0;
                                      stackIn_89_1 = stackOut_83_1;
                                      stackIn_84_0 = stackOut_83_0;
                                      stackIn_84_1 = stackOut_83_1;
                                      if (var10 != 0) {
                                        break L7;
                                      } else {
                                        if (stackIn_84_0 != stackIn_84_1) {
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
                            stackOut_88_0 = 65280 & var5[var5.length + -2] << 8;
                            stackOut_88_1 = -(var5[-1 + var5.length] & 255);
                            stackIn_89_0 = stackOut_88_0;
                            stackIn_89_1 = stackOut_88_1;
                            break L7;
                          }
                          var7 = stackIn_89_0 - stackIn_89_1;
                          if (var7 != (65535 & ((ce) this).field_s.field_g[param2])) {
                            throw new RuntimeException();
                          } else {
                            L10: {
                              if (((ce) this).field_p[param2] != 1) {
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
                            stackOut_98_0 = var4;
                            stackIn_99_0 = stackOut_98_0;
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
                  var6_ref = (Exception) (Object) decompiledCaughtException;
                  ((ce) this).field_p[param2] = (byte) -1;
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
              return (gj) (Object) stackIn_99_0;
            } else {
              try {
                L14: {
                  L15: {
                    if (var5 == null) {
                      break L15;
                    } else {
                      if (2 < var5.length) {
                        uf.field_b.reset();
                        uf.field_b.update(var5, 0, var5.length + -2);
                        var6_int = (int)uf.field_b.getValue();
                        if (((ce) this).field_s.field_j[param2] != var6_int) {
                          throw new RuntimeException();
                        } else {
                          L16: {
                            L17: {
                              if (null == ((ce) this).field_s.field_e) {
                                break L17;
                              } else {
                                if (((ce) this).field_s.field_e[param2] != null) {
                                  var7_ref_byte__ = ((ce) this).field_s.field_e[param2];
                                  var8 = jd.a(var5, 0, var5.length - 2, param1 + -255);
                                  var9 = 0;
                                  L18: while (true) {
                                    if (var9 >= 64) {
                                      break L17;
                                    } else {
                                      stackOut_50_0 = var8[var9];
                                      stackOut_50_1 = var7_ref_byte__[var9];
                                      stackIn_67_0 = stackOut_50_0;
                                      stackIn_67_1 = stackOut_50_1;
                                      stackIn_51_0 = stackOut_50_0;
                                      stackIn_51_1 = stackOut_50_1;
                                      if (var10 != 0) {
                                        decompiledRegionSelector0 = 1;
                                        break L14;
                                      } else {
                                        if (stackIn_51_0 != stackIn_51_1) {
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
                                } else {
                                  ((ce) this).field_f.field_l = 0;
                                  ((ce) this).field_f.field_d = 0;
                                  break L16;
                                }
                              }
                            }
                            ((ce) this).field_f.field_l = 0;
                            ((ce) this).field_f.field_d = 0;
                            break L16;
                          }
                          decompiledRegionSelector0 = 0;
                          break L14;
                        }
                      } else {
                        break L15;
                      }
                    }
                  }
                  throw new RuntimeException();
                }
              } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                ((ce) this).field_f.c((byte) 113);
                ((gj) var4).c(2);
                if (((gj) var4).field_m) {
                  if (((ce) this).field_f.b(false)) {
                    return null;
                  } else {
                    var4 = (Object) (Object) ((ce) this).field_f.a(param2, (byte) 2, -62, true, ((ce) this).field_q);
                    ((ce) this).field_o.a((long)param2, param1 ^ 202, (ai) var4);
                    return null;
                  }
                } else {
                  return null;
                }
              }
              L19: {
                L20: {
                  if (decompiledRegionSelector0 == 0) {
                    var5[var5.length + -2] = (byte)(((ce) this).field_s.field_g[param2] >>> 8);
                    var5[-1 + var5.length] = (byte)((ce) this).field_s.field_g[param2];
                    if (null != ((ce) this).field_k) {
                      md discarded$1 = ((ce) this).field_u.a(((ce) this).field_k, param2, (byte) 97, var5);
                      stackOut_66_0 = ((ce) this).field_p[param2];
                      stackOut_66_1 = 1;
                      stackIn_67_0 = stackOut_66_0;
                      stackIn_67_1 = stackOut_66_1;
                      break L20;
                    } else {
                      break L19;
                    }
                  } else {
                    break L20;
                  }
                }
                if (stackIn_67_0 != stackIn_67_1) {
                  ((ce) this).field_p[param2] = (byte) 1;
                  break L19;
                } else {
                  break L19;
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
            return null;
          }
        } else {
          return null;
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
        int stackIn_12_0 = 0;
        boolean stackIn_14_0 = false;
        int stackIn_18_0 = 0;
        boolean stackIn_26_0 = false;
        int stackIn_33_0 = 0;
        Object stackIn_35_0 = null;
        String stackIn_37_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        boolean stackOut_13_0 = false;
        int stackOut_11_0 = 0;
        int stackOut_17_0 = 0;
        boolean stackOut_25_0 = false;
        int stackOut_32_0 = 0;
        String stackOut_36_0 = null;
        Object stackOut_34_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var9 = Bounce.field_N;
        try {
          L0: {
            if (param0 != null) {
              var2_int = param1;
              var3 = param0.length();
              L1: while (true) {
                L2: {
                  L3: {
                    L4: {
                      L5: {
                        L6: {
                          if (~var2_int <= ~var3) {
                            break L6;
                          } else {
                            stackOut_6_0 = f.a(param0.charAt(var2_int), false);
                            stackIn_12_0 = stackOut_6_0 ? 1 : 0;
                            stackIn_7_0 = stackOut_6_0;
                            if (var9 != 0) {
                              L7: while (true) {
                                if (stackIn_12_0 >= ~var2_int) {
                                  break L3;
                                } else {
                                  stackOut_13_0 = f.a(param0.charAt(-1 + var3), false);
                                  stackIn_18_0 = stackOut_13_0 ? 1 : 0;
                                  stackIn_14_0 = stackOut_13_0;
                                  if (var9 != 0) {
                                    break L2;
                                  } else {
                                    if (!stackIn_14_0) {
                                      break L3;
                                    } else {
                                      var3--;
                                      if (var9 == 0) {
                                        stackOut_11_0 = ~var3;
                                        stackIn_12_0 = stackOut_11_0;
                                        continue L7;
                                      } else {
                                        break L4;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              if (!stackIn_7_0) {
                                break L6;
                              } else {
                                var2_int++;
                                if (var9 == 0) {
                                  continue L1;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                        }
                        break L5;
                      }
                      L8: while (true) {
                        stackOut_11_0 = ~var3;
                        stackIn_12_0 = stackOut_11_0;
                        if (stackIn_12_0 >= ~var2_int) {
                          break L3;
                        } else {
                          stackOut_13_0 = f.a(param0.charAt(-1 + var3), false);
                          stackIn_18_0 = stackOut_13_0 ? 1 : 0;
                          stackIn_14_0 = stackOut_13_0;
                          if (var9 != 0) {
                            break L2;
                          } else {
                            if (!stackIn_14_0) {
                              break L3;
                            } else {
                              var3--;
                              if (var9 == 0) {
                                continue L8;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                      }
                    }
                    break L3;
                  }
                  stackOut_17_0 = var3 - var2_int;
                  stackIn_18_0 = stackOut_17_0;
                  break L2;
                }
                var4 = stackIn_18_0;
                if (var4 >= 1) {
                  if (var4 <= 12) {
                    var5 = new StringBuilder(var4);
                    var6 = var2_int;
                    L9: while (true) {
                      L10: {
                        L11: {
                          if (var3 <= var6) {
                            break L11;
                          } else {
                            var7 = param0.charAt(var6);
                            stackOut_25_0 = ng.a((byte) -95, (char) var7);
                            stackIn_33_0 = stackOut_25_0 ? 1 : 0;
                            stackIn_26_0 = stackOut_25_0;
                            if (var9 != 0) {
                              break L10;
                            } else {
                              L12: {
                                if (!stackIn_26_0) {
                                  break L12;
                                } else {
                                  L13: {
                                    var8 = hd.a(31400, (char) var7);
                                    if (0 != var8) {
                                      break L13;
                                    } else {
                                      if (var9 == 0) {
                                        break L12;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  StringBuilder discarded$1 = var5.append(var8);
                                  break L12;
                                }
                              }
                              var6++;
                              if (var9 == 0) {
                                continue L9;
                              } else {
                                break L11;
                              }
                            }
                          }
                        }
                        stackOut_32_0 = 0;
                        stackIn_33_0 = stackOut_32_0;
                        break L10;
                      }
                      if (stackIn_33_0 != var5.length()) {
                        stackOut_36_0 = var5.toString();
                        stackIn_37_0 = stackOut_36_0;
                        break L0;
                      } else {
                        stackOut_34_0 = null;
                        stackIn_35_0 = stackOut_34_0;
                        return (String) (Object) stackIn_35_0;
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
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (String) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var2 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var2;
            stackOut_38_1 = new StringBuilder().append("ce.L(");
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param0 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L14;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L14;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + 44 + param1 + 41);
        }
        return stackIn_37_0;
    }

    final void c(int param0) {
        int var2 = 0;
        gj var3 = null;
        int var3_int = 0;
        ai var4 = null;
        int var5 = 0;
        int var6 = 0;
        byte stackIn_8_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        int stackIn_66_0 = 0;
        int stackIn_78_0 = 0;
        byte stackOut_7_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_43_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_77_0 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = Bounce.field_N;
                    var2 = 97 % ((46 - param0) / 34);
                    if (((ce) this).field_h == null) {
                        statePc = 81;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (((ce) this).b(1) == null) {
                        statePc = 3;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    if (!((ce) this).field_g) {
                        statePc = 36;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var3_int = 1;
                    var4 = ((ce) this).field_h.a((byte) -126);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (var4 == null) {
                        statePc = 17;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var5 = (int)var4.field_d;
                    stackOut_7_0 = ((ce) this).field_p[var5];
                    stackIn_18_0 = stackOut_7_0;
                    stackIn_8_0 = stackOut_7_0;
                    if (var6 != 0) {
                        statePc = 18;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (stackIn_8_0 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 10: {
                    gj discarded$5 = this.a(1, 255, var5);
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (((ce) this).field_p[var5] == 0) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var4.c(2);
                    if (var6 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var3_int = 0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    var4 = ((ce) this).field_h.d((byte) -102);
                    statePc = 6;
                    continue stateLoop;
                }
                case 17: {
                    stackOut_17_0 = ((ce) this).field_s.field_q.length;
                    stackIn_18_0 = stackOut_17_0;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (stackIn_18_0 <= ((ce) this).field_w) {
                        statePc = 31;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    stackOut_19_0 = 0;
                    stackIn_32_0 = stackOut_19_0;
                    stackIn_20_0 = stackOut_19_0;
                    if (var6 != 0) {
                        statePc = 32;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (stackIn_20_0 != ((ce) this).field_s.field_q[((ce) this).field_w]) {
                        statePc = 23;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    ((ce) this).field_w = ((ce) this).field_w + 1;
                    statePc = 17;
                    continue stateLoop;
                }
                case 23: {
                    if (((ce) this).field_u.field_b >= 250) {
                        statePc = 25;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var3_int = 0;
                    if (var6 == 0) {
                        statePc = 31;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (0 != ((ce) this).field_p[((ce) this).field_w]) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    gj discarded$6 = this.a(1, 255, ((ce) this).field_w);
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    if (((ce) this).field_p[((ce) this).field_w] != 0) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var4 = new ai();
                    var4.field_d = (long)((ce) this).field_w;
                    var3_int = 0;
                    ((ce) this).field_h.a(1, var4);
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    ((ce) this).field_w = ((ce) this).field_w + 1;
                    statePc = 17;
                    continue stateLoop;
                }
                case 31: {
                    stackOut_31_0 = var3_int;
                    stackIn_32_0 = stackOut_31_0;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    if (stackIn_32_0 != 0) {
                        statePc = 34;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 34: {
                    ((ce) this).field_g = false;
                    ((ce) this).field_w = 0;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (var6 == 0) {
                        statePc = 81;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (((ce) this).field_d) {
                        statePc = 39;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    ((ce) this).field_h = null;
                    if (var6 == 0) {
                        statePc = 81;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    var3_int = 1;
                    var4 = ((ce) this).field_h.a((byte) -45);
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    if (var4 == null) {
                        statePc = 64;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    var5 = (int)var4.field_d;
                    stackOut_41_0 = -2;
                    stackOut_41_1 = ~((ce) this).field_p[var5];
                    stackIn_57_0 = stackOut_41_0;
                    stackIn_57_1 = stackOut_41_1;
                    stackIn_42_0 = stackOut_41_0;
                    stackIn_42_1 = stackOut_41_1;
                    if (var6 == 0) {
                        statePc = 57;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (stackIn_42_0 >= stackIn_42_1) {
                        statePc = 77;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    stackOut_43_0 = ~((ce) this).field_s.field_q[((ce) this).field_w];
                    stackIn_78_0 = stackOut_43_0;
                    stackIn_44_0 = stackOut_43_0;
                    if (var6 != 0) {
                        statePc = 78;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if (stackIn_44_0 == -1) {
                        statePc = 46;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 46: {
                    ((ce) this).field_w = ((ce) this).field_w + 1;
                    if (var6 == 0) {
                        statePc = 64;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (!((ce) this).field_f.b((byte) 90)) {
                        statePc = 49;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    var3_int = 0;
                    if (var6 == 0) {
                        statePc = 77;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if (((ce) this).field_p[((ce) this).field_w] == 1) {
                        statePc = 51;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    gj discarded$7 = this.a(2, 255, ((ce) this).field_w);
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    if (1 != ((ce) this).field_p[((ce) this).field_w]) {
                        statePc = 53;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 53: {
                    var4 = new ai();
                    var4.field_d = (long)((ce) this).field_w;
                    ((ce) this).field_h.a(1, var4);
                    var3_int = 0;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    ((ce) this).field_w = ((ce) this).field_w + 1;
                    if (var6 == 0) {
                        statePc = 64;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 57: {
                    if (stackIn_57_0 == stackIn_57_1) {
                        statePc = 59;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    gj discarded$8 = this.a(2, 255, var5);
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    if (1 == ((ce) this).field_p[var5]) {
                        statePc = 61;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    var3_int = 0;
                    if (var6 == 0) {
                        statePc = 62;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    var4.c(2);
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    var4 = ((ce) this).field_h.d((byte) -47);
                    statePc = 40;
                    continue stateLoop;
                }
                case 64: {
                    if (((ce) this).field_w >= ((ce) this).field_s.field_q.length) {
                        statePc = 77;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    stackOut_65_0 = ~((ce) this).field_s.field_q[((ce) this).field_w];
                    stackIn_78_0 = stackOut_65_0;
                    stackIn_66_0 = stackOut_65_0;
                    if (var6 != 0) {
                        statePc = 78;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    if (stackIn_66_0 == -1) {
                        statePc = 68;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 68: {
                    ((ce) this).field_w = ((ce) this).field_w + 1;
                    if (var6 == 0) {
                        statePc = 64;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if (!((ce) this).field_f.b((byte) 90)) {
                        statePc = 71;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    var3_int = 0;
                    if (var6 == 0) {
                        statePc = 77;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    if (((ce) this).field_p[((ce) this).field_w] == 1) {
                        statePc = 73;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    gj discarded$9 = this.a(2, 255, ((ce) this).field_w);
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    if (1 != ((ce) this).field_p[((ce) this).field_w]) {
                        statePc = 75;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 75: {
                    var4 = new ai();
                    var4.field_d = (long)((ce) this).field_w;
                    ((ce) this).field_h.a(1, var4);
                    var3_int = 0;
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    ((ce) this).field_w = ((ce) this).field_w + 1;
                    if (var6 == 0) {
                        statePc = 64;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    stackOut_77_0 = var3_int;
                    stackIn_78_0 = stackOut_77_0;
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    if (stackIn_78_0 != 0) {
                        statePc = 80;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 80: {
                    ((ce) this).field_d = false;
                    ((ce) this).field_w = 0;
                    statePc = 81;
                    continue stateLoop;
                }
                case 81: {
                    if (((ce) this).field_v) {
                        statePc = 83;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    return;
                }
                case 83: {
                    if (((ce) this).field_e <= fa.a(75)) {
                        statePc = 85;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 85: {
                    var3 = (gj) (Object) ((ce) this).field_o.b(0);
                    statePc = 86;
                    continue stateLoop;
                }
                case 86: {
                    if (var3 != null) {
                        statePc = 89;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    ((ce) this).field_e = fa.a(-27) - -1000L;
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    return;
                }
                case 89: {
                    if (var6 == 0) {
                        statePc = 91;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    return;
                }
                case 91: {
                    if (!var3.field_n) {
                        statePc = 94;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    if (var6 == 0) {
                        statePc = 99;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    if (!var3.field_o) {
                        statePc = 98;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    if (var3.field_m) {
                        statePc = 97;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    throw new RuntimeException();
                }
                case 97: {
                    var3.c(2);
                    if (var6 == 0) {
                        statePc = 99;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    var3.field_o = true;
                    statePc = 99;
                    continue stateLoop;
                }
                case 99: {
                    var3 = (gj) (Object) ((ce) this).field_o.a(-1);
                    statePc = 86;
                    continue stateLoop;
                }
                case 101: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
                          if (((ce) this).field_p[var3] == -1) {
                            gj discarded$3 = this.a(2, 255, var3);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        if (((ce) this).field_p[var3] != 1) {
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
        RuntimeException var10 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        ((ce) this).field_o = new uk(16);
        ((ce) this).field_w = 0;
        ((ce) this).field_c = new bc();
        ((ce) this).field_e = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((ce) this).field_k = param1;
                ((ce) this).field_q = param0;
                if (((ce) this).field_k == null) {
                  break L2;
                } else {
                  ((ce) this).field_g = true;
                  ((ce) this).field_h = new bc();
                  if (Bounce.field_N == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((ce) this).field_g = false;
              break L1;
            }
            L3: {
              ((ce) this).field_j = param7;
              ((ce) this).field_f = param3;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param8) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L3;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L3;
              }
            }
            L4: {
              ((ce) this).field_v = stackIn_7_1 != 0;
              ((ce) this).field_r = param5;
              ((ce) this).field_m = param6;
              ((ce) this).field_u = param4;
              ((ce) this).field_l = param2;
              if (((ce) this).field_l == null) {
                break L4;
              } else {
                ((ce) this).field_i = (gj) (Object) ((ce) this).field_u.a(((ce) this).field_q, ((ce) this).field_l, true);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var10 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var10;
            stackOut_10_1 = new StringBuilder().append("ce.<init>(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          L6: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          L7: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          L8: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          L9: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44).append(param5).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param6 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param7 + 44 + param8 + 41);
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
