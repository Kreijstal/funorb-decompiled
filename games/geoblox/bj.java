/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj extends nh {
    private fi field_g;
    static boolean field_s;
    private int field_h;
    static int[] field_j;
    private ji field_f;
    private pb field_l;
    private int field_p;
    private uf field_i;
    private int field_m;
    private jh field_y;
    static na field_r;
    private byte[] field_k;
    private byte[] field_x;
    private bm field_u;
    private jh field_e;
    private int field_o;
    private boolean field_v;
    private tf field_t;
    private boolean field_q;
    private tf field_d;
    private boolean field_w;
    private long field_n;

    final bm a(byte param0) {
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Geoblox.field_C;
        if (null != ((bj) this).field_u) {
          return ((bj) this).field_u;
        } else {
          L0: {
            if (((bj) this).field_l == null) {
              if (!((bj) this).field_f.g(20)) {
                ((bj) this).field_l = (pb) (Object) ((bj) this).field_f.a((byte) 0, 255, -21, ((bj) this).field_p, true);
                break L0;
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
          L1: {
            if (param0 > 111) {
              break L1;
            } else {
              ((bj) this).b((byte) 65);
              break L1;
            }
          }
          if (!((bj) this).field_l.field_u) {
            L2: {
              L3: {
                var5 = ((bj) this).field_l.e(397);
                var2 = var5;
                if (((bj) this).field_l instanceof o) {
                  break L3;
                } else {
                  try {
                    L4: {
                      if (var5 == null) {
                        throw new RuntimeException();
                      } else {
                        ((bj) this).field_u = new bm(var5, ((bj) this).field_m, ((bj) this).field_x);
                        break L4;
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3 = decompiledCaughtException;
                    ((bj) this).field_f.e(20);
                    ((bj) this).field_u = null;
                    if (!((bj) this).field_f.g(20)) {
                      ((bj) this).field_l = (pb) (Object) ((bj) this).field_f.a((byte) 0, 255, -21, ((bj) this).field_p, true);
                      if (var4 == 0) {
                        return null;
                      } else {
                        ((bj) this).field_l = null;
                        return null;
                      }
                    } else {
                      ((bj) this).field_l = null;
                      return null;
                    }
                  }
                  if (null == ((bj) this).field_y) {
                    break L2;
                  } else {
                    o discarded$1 = ((bj) this).field_i.a((byte) 88, ((bj) this).field_p, ((bj) this).field_y, var5);
                    if (var4 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              try {
                L5: {
                  if (var5 != null) {
                    ((bj) this).field_u = new bm(var5, ((bj) this).field_m, ((bj) this).field_x);
                    if (((bj) this).field_u.field_g != ((bj) this).field_h) {
                      throw new RuntimeException();
                    } else {
                      break L5;
                    }
                  } else {
                    throw new RuntimeException();
                  }
                }
              } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var3 = decompiledCaughtException;
                ((bj) this).field_u = null;
                if (((bj) this).field_f.g(20)) {
                  ((bj) this).field_l = null;
                  if (var4 == 0) {
                    return null;
                  } else {
                    ((bj) this).field_l = (pb) (Object) ((bj) this).field_f.a((byte) 0, 255, -21, ((bj) this).field_p, true);
                    return null;
                  }
                } else {
                  ((bj) this).field_l = (pb) (Object) ((bj) this).field_f.a((byte) 0, 255, -21, ((bj) this).field_p, true);
                  return null;
                }
              }
              break L2;
            }
            L6: {
              ((bj) this).field_l = null;
              if (((bj) this).field_e == null) {
                break L6;
              } else {
                ((bj) this).field_k = new byte[((bj) this).field_u.field_b];
                break L6;
              }
            }
            return ((bj) this).field_u;
          } else {
            return null;
          }
        }
    }

    private final pb a(byte param0, int param1, int param2) {
        Object var4 = null;
        byte[] var5 = null;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var6_int = 0;
        byte[] var7 = null;
        int var7_int = 0;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        Object stackIn_59_0 = null;
        int stackIn_78_0 = 0;
        int stackIn_78_1 = 0;
        int stackIn_91_0 = 0;
        int stackIn_91_1 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_77_0 = 0;
        int stackOut_77_1 = 0;
        int stackOut_90_0 = 0;
        int stackOut_90_1 = 0;
        int stackOut_44_0 = 0;
        int stackOut_44_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        Object stackOut_58_0 = null;
        L0: {
          var10 = Geoblox.field_C;
          var4 = (Object) (Object) (pb) (Object) ((bj) this).field_g.a((long)param2, (byte) -124);
          if (var4 == null) {
            break L0;
          } else {
            if (param1 != 0) {
              break L0;
            } else {
              if (((pb) var4).field_q) {
                break L0;
              } else {
                if (!((pb) var4).field_u) {
                  break L0;
                } else {
                  ((pb) var4).a(false);
                  var4 = null;
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (var4 != null) {
            break L1;
          } else {
            L2: {
              if (param1 != 0) {
                if (param1 == 1) {
                  if (null != ((bj) this).field_e) {
                    var4 = (Object) (Object) ((bj) this).field_i.a(param0 + 131, ((bj) this).field_e, param2);
                    break L2;
                  } else {
                    throw new RuntimeException();
                  }
                } else {
                  if (param1 == 2) {
                    if (null != ((bj) this).field_e) {
                      if (((bj) this).field_k[param2] == -1) {
                        if (!((bj) this).field_f.b(-21)) {
                          var4 = (Object) (Object) ((bj) this).field_f.a((byte) 2, ((bj) this).field_p, param0 + 50, param2, false);
                          if (var10 == 0) {
                            break L2;
                          } else {
                            throw new RuntimeException();
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
                  } else {
                    throw new RuntimeException();
                  }
                }
              } else {
                L3: {
                  if (null == ((bj) this).field_e) {
                    break L3;
                  } else {
                    if (-1 == ((bj) this).field_k[param2]) {
                      break L3;
                    } else {
                      var4 = (Object) (Object) ((bj) this).field_i.a(((bj) this).field_e, param2, 15079962);
                      if (var10 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (!((bj) this).field_f.g(20)) {
                  var4 = (Object) (Object) ((bj) this).field_f.a((byte) 2, ((bj) this).field_p, -21, param2, true);
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
            ((bj) this).field_g.a((byte) 102, (hf) var4, (long)param2);
            break L1;
          }
        }
        if (!((pb) var4).field_u) {
          var5 = ((pb) var4).e(397);
          if (param0 == -71) {
            if (!(var4 instanceof o)) {
              try {
                L4: {
                  L5: {
                    if (var5 == null) {
                      break L5;
                    } else {
                      if (var5.length <= 2) {
                        break L5;
                      } else {
                        ge.field_f.reset();
                        ge.field_f.update(var5, 0, var5.length + -2);
                        var6_int = (int)ge.field_f.getValue();
                        if (var6_int == ((bj) this).field_u.field_q[param2]) {
                          L6: {
                            L7: {
                              if (null == ((bj) this).field_u.field_r) {
                                break L7;
                              } else {
                                if (null != ((bj) this).field_u.field_r[param2]) {
                                  var7 = ((bj) this).field_u.field_r[param2];
                                  var8 = wh.a(-2 + var5.length, 0, var5, 8);
                                  var9 = 0;
                                  L8: while (true) {
                                    if (var9 >= 64) {
                                      break L7;
                                    } else {
                                      stackOut_77_0 = ~var8[var9];
                                      stackOut_77_1 = ~var7[var9];
                                      stackIn_91_0 = stackOut_77_0;
                                      stackIn_91_1 = stackOut_77_1;
                                      stackIn_78_0 = stackOut_77_0;
                                      stackIn_78_1 = stackOut_77_1;
                                      if (var10 != 0) {
                                        decompiledRegionSelector0 = 1;
                                        break L4;
                                      } else {
                                        if (stackIn_78_0 == stackIn_78_1) {
                                          var9++;
                                          if (var10 == 0) {
                                            continue L8;
                                          } else {
                                            break L7;
                                          }
                                        } else {
                                          throw new RuntimeException();
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  ((bj) this).field_f.field_b = 0;
                                  ((bj) this).field_f.field_q = 0;
                                  break L6;
                                }
                              }
                            }
                            ((bj) this).field_f.field_b = 0;
                            ((bj) this).field_f.field_q = 0;
                            break L6;
                          }
                          decompiledRegionSelector0 = 0;
                          break L4;
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    }
                  }
                  throw new RuntimeException();
                }
              } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L9: {
                  var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                  ((bj) this).field_f.e(20);
                  ((pb) var4).a(false);
                  if (((pb) var4).field_q) {
                    if (!((bj) this).field_f.g(param0 ^ -83)) {
                      var4 = (Object) (Object) ((bj) this).field_f.a((byte) 2, ((bj) this).field_p, -21, param2, true);
                      ((bj) this).field_g.a((byte) 102, (hf) var4, (long)param2);
                      break L9;
                    } else {
                      break L9;
                    }
                  } else {
                    break L9;
                  }
                }
                return null;
              }
              L10: {
                L11: {
                  if (decompiledRegionSelector0 == 0) {
                    var5[var5.length - 2] = (byte)(((bj) this).field_u.field_t[param2] >>> 8);
                    var5[-1 + var5.length] = (byte)((bj) this).field_u.field_t[param2];
                    if (null == ((bj) this).field_e) {
                      break L10;
                    } else {
                      o discarded$1 = ((bj) this).field_i.a((byte) 66, param2, ((bj) this).field_e, var5);
                      stackOut_90_0 = ~((bj) this).field_k[param2];
                      stackOut_90_1 = -2;
                      stackIn_91_0 = stackOut_90_0;
                      stackIn_91_1 = stackOut_90_1;
                      break L11;
                    }
                  } else {
                    break L11;
                  }
                }
                if (stackIn_91_0 != stackIn_91_1) {
                  ((bj) this).field_k[param2] = (byte) 1;
                  break L10;
                } else {
                  break L10;
                }
              }
              L12: {
                if (!((pb) var4).field_q) {
                  ((pb) var4).a(false);
                  break L12;
                } else {
                  break L12;
                }
              }
              return (pb) var4;
            } else {
              try {
                L13: {
                  L14: {
                    if (var5 == null) {
                      break L14;
                    } else {
                      if (var5.length <= 2) {
                        break L14;
                      } else {
                        ge.field_f.reset();
                        ge.field_f.update(var5, 0, var5.length + -2);
                        var6_int = (int)ge.field_f.getValue();
                        if (var6_int == ((bj) this).field_u.field_q[param2]) {
                          L15: {
                            L16: {
                              if (((bj) this).field_u.field_r == null) {
                                break L16;
                              } else {
                                if (null == ((bj) this).field_u.field_r[param2]) {
                                  break L16;
                                } else {
                                  var7 = ((bj) this).field_u.field_r[param2];
                                  var8 = wh.a(-2 + var5.length, 0, var5, 8);
                                  var9 = 0;
                                  L17: while (true) {
                                    if (var9 >= 64) {
                                      break L16;
                                    } else {
                                      stackOut_44_0 = ~var7[var9];
                                      stackOut_44_1 = ~var8[var9];
                                      stackIn_49_0 = stackOut_44_0;
                                      stackIn_49_1 = stackOut_44_1;
                                      stackIn_45_0 = stackOut_44_0;
                                      stackIn_45_1 = stackOut_44_1;
                                      if (var10 != 0) {
                                        break L15;
                                      } else {
                                        if (stackIn_45_0 == stackIn_45_1) {
                                          var9++;
                                          if (var10 == 0) {
                                            continue L17;
                                          } else {
                                            break L16;
                                          }
                                        } else {
                                          throw new RuntimeException();
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_48_0 = var5[-2 + var5.length] << 8 & 65280;
                            stackOut_48_1 = var5[var5.length - 1] & 255;
                            stackIn_49_0 = stackOut_48_0;
                            stackIn_49_1 = stackOut_48_1;
                            break L15;
                          }
                          var7_int = stackIn_49_0 + stackIn_49_1;
                          if ((65535 & ((bj) this).field_u.field_t[param2]) != var7_int) {
                            throw new RuntimeException();
                          } else {
                            L18: {
                              if (((bj) this).field_k[param2] != 1) {
                                L19: {
                                  if (((bj) this).field_k[param2] != 0) {
                                    break L19;
                                  } else {
                                    break L19;
                                  }
                                }
                                ((bj) this).field_k[param2] = (byte) 1;
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            L20: {
                              if (((pb) var4).field_q) {
                                break L20;
                              } else {
                                ((pb) var4).a(false);
                                break L20;
                              }
                            }
                            stackOut_58_0 = var4;
                            stackIn_59_0 = stackOut_58_0;
                            break L13;
                          }
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    }
                  }
                  throw new RuntimeException();
                }
              } catch (java.lang.Exception decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var6 = (Exception) (Object) decompiledCaughtException;
                ((bj) this).field_k[param2] = (byte) -1;
                ((pb) var4).a(false);
                if (((pb) var4).field_q) {
                  if (((bj) this).field_f.g(20)) {
                    return null;
                  } else {
                    var4 = (Object) (Object) ((bj) this).field_f.a((byte) 2, ((bj) this).field_p, -21, param2, true);
                    ((bj) this).field_g.a((byte) 102, (hf) var4, (long)param2);
                    return null;
                  }
                } else {
                  return null;
                }
              }
              return (pb) (Object) stackIn_59_0;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static String a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_8_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var5 = Geoblox.field_C;
        try {
          L0: {
            var2_int = param1.length();
            var3 = new char[var2_int];
            var4 = 0;
            L1: while (true) {
              L2: {
                if (var4 >= var2_int) {
                  if (param0 >= 26) {
                    break L2;
                  } else {
                    var6 = null;
                    String discarded$1 = bj.a(68, (String) null);
                    break L2;
                  }
                } else {
                  var3[-var4 + (-1 + var2_int)] = param1.charAt(var4);
                  var4++;
                  if (var5 != 0) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              stackOut_8_0 = new String(var3);
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2;
            stackOut_10_1 = new StringBuilder().append("bj.A(").append(param0).append(44);
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
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_9_0;
    }

    final byte[] b(int param0, int param1) {
        pb var3 = null;
        byte[] var4 = null;
        var3 = this.a((byte) -71, 0, param1);
        if (var3 == null) {
          return null;
        } else {
          L0: {
            var4 = var3.e(397);
            var3.a(false);
            if (param0 == 4) {
              break L0;
            } else {
              ((bj) this).b(49);
              break L0;
            }
          }
          return var4;
        }
    }

    final int a(int param0, int param1) {
        pb var3 = null;
        var3 = (pb) (Object) ((bj) this).field_g.a((long)param1, (byte) -102);
        if (param0 >= 125) {
          if (var3 != null) {
            return var3.g(0);
          } else {
            return 0;
          }
        } else {
          return -119;
        }
    }

    public static void b(boolean param0) {
        if (!param0) {
            return;
        }
        field_r = null;
        field_j = null;
    }

    final void b(int param0) {
        if (((bj) this).field_e == null) {
          return;
        } else {
          L0: {
            if (param0 >= 80) {
              break L0;
            } else {
              ((bj) this).field_n = -51L;
              break L0;
            }
          }
          L1: {
            ((bj) this).field_v = true;
            if (((bj) this).field_d == null) {
              ((bj) this).field_d = new tf();
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final void a(int param0) {
        hf var2 = null;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Geoblox.field_C;
          if (param0 == 6924) {
            break L0;
          } else {
            ((bj) this).b((byte) -7);
            break L0;
          }
        }
        if (((bj) this).field_d == null) {
          return;
        } else {
          if (null == ((bj) this).a((byte) 126)) {
            return;
          } else {
            var2 = ((bj) this).field_t.g(0);
            L1: while (true) {
              L2: {
                if (var2 == null) {
                  break L2;
                } else {
                  var3 = (int)var2.field_a;
                  if (var4 != 0) {
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        L5: {
                          if (var3 < 0) {
                            break L5;
                          } else {
                            if (var3 >= ((bj) this).field_u.field_b) {
                              break L5;
                            } else {
                              if (((bj) this).field_u.field_a[var3] != 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        var2.a(false);
                        if (var4 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                      L6: {
                        if (((bj) this).field_k[var3] != 0) {
                          break L6;
                        } else {
                          pb discarded$4 = this.a((byte) -71, 1, var3);
                          break L6;
                        }
                      }
                      L7: {
                        if (-1 != ((bj) this).field_k[var3]) {
                          break L7;
                        } else {
                          pb discarded$5 = this.a((byte) -71, 2, var3);
                          break L7;
                        }
                      }
                      if (((bj) this).field_k[var3] == 1) {
                        var2.a(false);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var2 = ((bj) this).field_t.d(1);
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

    final void b(byte param0) {
        int var2_int = 0;
        pb var2 = null;
        hf var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        byte stackIn_40_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        int stackIn_103_0 = 0;
        int stackIn_103_1 = 0;
        int stackIn_106_0 = 0;
        int stackIn_106_1 = 0;
        int stackIn_107_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_126_1 = 0;
        int stackIn_129_0 = 0;
        int stackIn_129_1 = 0;
        int stackIn_130_0 = 0;
        int stackIn_130_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_132_0 = 0;
        int stackOut_132_1 = 0;
        int stackOut_128_0 = 0;
        int stackOut_128_1 = 0;
        int stackOut_129_0 = 0;
        int stackOut_129_1 = 0;
        byte stackOut_39_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_47_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_105_1 = 0;
        int stackOut_106_0 = 0;
        int stackOut_106_1 = 0;
        byte stackOut_64_0 = 0;
        int stackOut_64_1 = 0;
        L0: {
          L1: {
            var5 = Geoblox.field_C;
            if (((bj) this).field_d == null) {
              break L1;
            } else {
              if (null != ((bj) this).a((byte) 118)) {
                L2: {
                  if (((bj) this).field_q) {
                    break L2;
                  } else {
                    L3: {
                      if (((bj) this).field_v) {
                        break L3;
                      } else {
                        ((bj) this).field_d = null;
                        if (var5 == 0) {
                          break L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var2_int = 1;
                    var3 = ((bj) this).field_d.g(0);
                    L4: while (true) {
                      L5: {
                        L6: {
                          if (var3 == null) {
                            break L6;
                          } else {
                            var4 = (int)var3.field_a;
                            stackOut_9_0 = ~((bj) this).field_k[var4];
                            stackOut_9_1 = -2;
                            stackIn_20_0 = stackOut_9_0;
                            stackIn_20_1 = stackOut_9_1;
                            stackIn_10_0 = stackOut_9_0;
                            stackIn_10_1 = stackOut_9_1;
                            if (var5 != 0) {
                              L7: while (true) {
                                if (stackIn_20_0 >= stackIn_20_1) {
                                  break L5;
                                } else {
                                  stackOut_21_0 = -1;
                                  stackOut_21_1 = ~((bj) this).field_u.field_a[((bj) this).field_o];
                                  stackIn_65_0 = stackOut_21_0;
                                  stackIn_65_1 = stackOut_21_1;
                                  stackIn_22_0 = stackOut_21_0;
                                  stackIn_22_1 = stackOut_21_1;
                                  if (var5 != 0) {
                                    break L0;
                                  } else {
                                    L8: {
                                      L9: {
                                        if (stackIn_22_0 == stackIn_22_1) {
                                          ((bj) this).field_o = ((bj) this).field_o + 1;
                                          if (var5 == 0) {
                                            break L8;
                                          } else {
                                            break L9;
                                          }
                                        } else {
                                          break L9;
                                        }
                                      }
                                      L10: {
                                        if (((bj) this).field_f.b(-21)) {
                                          var2_int = 0;
                                          if (var5 == 0) {
                                            break L5;
                                          } else {
                                            break L10;
                                          }
                                        } else {
                                          break L10;
                                        }
                                      }
                                      L11: {
                                        if (((bj) this).field_k[((bj) this).field_o] == 1) {
                                          break L11;
                                        } else {
                                          pb discarded$7 = this.a((byte) -71, 2, ((bj) this).field_o);
                                          break L11;
                                        }
                                      }
                                      L12: {
                                        if (((bj) this).field_k[((bj) this).field_o] == 1) {
                                          break L12;
                                        } else {
                                          var3 = new hf();
                                          var3.field_a = (long)((bj) this).field_o;
                                          var2_int = 0;
                                          ((bj) this).field_d.a(-97, var3);
                                          break L12;
                                        }
                                      }
                                      ((bj) this).field_o = ((bj) this).field_o + 1;
                                      if (var5 == 0) {
                                        break L8;
                                      } else {
                                        break L5;
                                      }
                                    }
                                    stackOut_19_0 = ((bj) this).field_o;
                                    stackOut_19_1 = ((bj) this).field_u.field_a.length;
                                    stackIn_20_0 = stackOut_19_0;
                                    stackIn_20_1 = stackOut_19_1;
                                    continue L7;
                                  }
                                }
                              }
                            } else {
                              L13: {
                                if (stackIn_10_0 != stackIn_10_1) {
                                  pb discarded$8 = this.a((byte) -71, 2, var4);
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              L14: {
                                L15: {
                                  if (((bj) this).field_k[var4] != 1) {
                                    break L15;
                                  } else {
                                    var3.a(false);
                                    if (var5 == 0) {
                                      break L14;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                                var2_int = 0;
                                break L14;
                              }
                              var3 = ((bj) this).field_d.d(1);
                              if (var5 == 0) {
                                continue L4;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        L16: while (true) {
                          stackOut_132_0 = ((bj) this).field_o;
                          stackOut_132_1 = ((bj) this).field_u.field_a.length;
                          stackIn_130_0 = stackOut_132_0;
                          stackIn_130_1 = stackOut_132_1;
                          if (stackIn_130_0 >= stackIn_130_1) {
                            break L5;
                          } else {
                            stackOut_128_0 = -1;
                            stackOut_128_1 = ~((bj) this).field_u.field_a[((bj) this).field_o];
                            stackIn_65_0 = stackOut_128_0;
                            stackIn_65_1 = stackOut_128_1;
                            stackIn_129_0 = stackOut_128_0;
                            stackIn_129_1 = stackOut_128_1;
                            if (var5 != 0) {
                              break L0;
                            } else {
                              stackOut_129_0 = stackIn_129_0;
                              stackOut_129_1 = stackIn_129_1;
                              stackIn_126_0 = stackOut_129_0;
                              stackIn_126_1 = stackOut_129_1;
                              L17: {
                                if (stackIn_126_0 == stackIn_126_1) {
                                  ((bj) this).field_o = ((bj) this).field_o + 1;
                                  if (var5 == 0) {
                                    continue L16;
                                  } else {
                                    break L17;
                                  }
                                } else {
                                  break L17;
                                }
                              }
                              L18: {
                                if (((bj) this).field_f.b(-21)) {
                                  var2_int = 0;
                                  if (var5 == 0) {
                                    break L5;
                                  } else {
                                    break L18;
                                  }
                                } else {
                                  break L18;
                                }
                              }
                              L19: {
                                if (((bj) this).field_k[((bj) this).field_o] == 1) {
                                  break L19;
                                } else {
                                  pb discarded$9 = this.a((byte) -71, 2, ((bj) this).field_o);
                                  break L19;
                                }
                              }
                              L20: {
                                if (((bj) this).field_k[((bj) this).field_o] == 1) {
                                  break L20;
                                } else {
                                  var3 = new hf();
                                  var3.field_a = (long)((bj) this).field_o;
                                  var2_int = 0;
                                  ((bj) this).field_d.a(-97, var3);
                                  break L20;
                                }
                              }
                              ((bj) this).field_o = ((bj) this).field_o + 1;
                              if (var5 == 0) {
                                continue L16;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                      L21: {
                        if (var2_int != 0) {
                          ((bj) this).field_v = false;
                          ((bj) this).field_o = 0;
                          break L21;
                        } else {
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
                var2_int = 1;
                var3 = ((bj) this).field_d.g(0);
                L22: while (true) {
                  L23: {
                    L24: {
                      if (var3 == null) {
                        break L24;
                      } else {
                        var4 = (int)var3.field_a;
                        stackOut_39_0 = ((bj) this).field_k[var4];
                        stackIn_48_0 = stackOut_39_0;
                        stackIn_40_0 = stackOut_39_0;
                        if (var5 != 0) {
                          L25: while (true) {
                            if (stackIn_48_0 >= ((bj) this).field_u.field_a.length) {
                              break L23;
                            } else {
                              stackOut_49_0 = 0;
                              stackOut_49_1 = ((bj) this).field_u.field_a[((bj) this).field_o];
                              stackIn_65_0 = stackOut_49_0;
                              stackIn_65_1 = stackOut_49_1;
                              stackIn_50_0 = stackOut_49_0;
                              stackIn_50_1 = stackOut_49_1;
                              if (var5 != 0) {
                                break L0;
                              } else {
                                L26: {
                                  L27: {
                                    if (stackIn_50_0 != stackIn_50_1) {
                                      break L27;
                                    } else {
                                      ((bj) this).field_o = ((bj) this).field_o + 1;
                                      if (var5 == 0) {
                                        break L26;
                                      } else {
                                        break L27;
                                      }
                                    }
                                  }
                                  L28: {
                                    if (((bj) this).field_i.field_d >= 250) {
                                      var2_int = 0;
                                      if (var5 == 0) {
                                        break L23;
                                      } else {
                                        break L28;
                                      }
                                    } else {
                                      break L28;
                                    }
                                  }
                                  L29: {
                                    if (((bj) this).field_k[((bj) this).field_o] != 0) {
                                      break L29;
                                    } else {
                                      pb discarded$10 = this.a((byte) -71, 1, ((bj) this).field_o);
                                      break L29;
                                    }
                                  }
                                  L30: {
                                    if (0 == ((bj) this).field_k[((bj) this).field_o]) {
                                      var3 = new hf();
                                      var3.field_a = (long)((bj) this).field_o;
                                      var2_int = 0;
                                      ((bj) this).field_d.a(-45, var3);
                                      break L30;
                                    } else {
                                      break L30;
                                    }
                                  }
                                  ((bj) this).field_o = ((bj) this).field_o + 1;
                                  if (var5 == 0) {
                                    break L26;
                                  } else {
                                    break L23;
                                  }
                                }
                                stackOut_47_0 = ((bj) this).field_o;
                                stackIn_48_0 = stackOut_47_0;
                                continue L25;
                              }
                            }
                          }
                        } else {
                          L31: {
                            if (stackIn_40_0 != 0) {
                              break L31;
                            } else {
                              pb discarded$11 = this.a((byte) -71, 1, var4);
                              break L31;
                            }
                          }
                          L32: {
                            L33: {
                              if (((bj) this).field_k[var4] != 0) {
                                break L33;
                              } else {
                                var2_int = 0;
                                if (var5 == 0) {
                                  break L32;
                                } else {
                                  break L33;
                                }
                              }
                            }
                            var3.a(false);
                            break L32;
                          }
                          var3 = ((bj) this).field_d.d(1);
                          if (var5 == 0) {
                            continue L22;
                          } else {
                            break L24;
                          }
                        }
                      }
                    }
                    L34: while (true) {
                      stackOut_109_0 = ((bj) this).field_o;
                      stackIn_107_0 = stackOut_109_0;
                      if (stackIn_107_0 >= ((bj) this).field_u.field_a.length) {
                        break L23;
                      } else {
                        stackOut_105_0 = 0;
                        stackOut_105_1 = ((bj) this).field_u.field_a[((bj) this).field_o];
                        stackIn_65_0 = stackOut_105_0;
                        stackIn_65_1 = stackOut_105_1;
                        stackIn_106_0 = stackOut_105_0;
                        stackIn_106_1 = stackOut_105_1;
                        if (var5 != 0) {
                          break L0;
                        } else {
                          stackOut_106_0 = stackIn_106_0;
                          stackOut_106_1 = stackIn_106_1;
                          stackIn_103_0 = stackOut_106_0;
                          stackIn_103_1 = stackOut_106_1;
                          L35: {
                            if (stackIn_103_0 != stackIn_103_1) {
                              break L35;
                            } else {
                              ((bj) this).field_o = ((bj) this).field_o + 1;
                              if (var5 == 0) {
                                continue L34;
                              } else {
                                break L35;
                              }
                            }
                          }
                          L36: {
                            if (((bj) this).field_i.field_d >= 250) {
                              var2_int = 0;
                              if (var5 == 0) {
                                break L23;
                              } else {
                                break L36;
                              }
                            } else {
                              break L36;
                            }
                          }
                          L37: {
                            if (((bj) this).field_k[((bj) this).field_o] != 0) {
                              break L37;
                            } else {
                              pb discarded$12 = this.a((byte) -71, 1, ((bj) this).field_o);
                              break L37;
                            }
                          }
                          L38: {
                            if (0 == ((bj) this).field_k[((bj) this).field_o]) {
                              var3 = new hf();
                              var3.field_a = (long)((bj) this).field_o;
                              var2_int = 0;
                              ((bj) this).field_d.a(-45, var3);
                              break L38;
                            } else {
                              break L38;
                            }
                          }
                          ((bj) this).field_o = ((bj) this).field_o + 1;
                          if (var5 == 0) {
                            continue L34;
                          } else {
                            break L23;
                          }
                        }
                      }
                    }
                  }
                  if (var2_int == 0) {
                    break L1;
                  } else {
                    ((bj) this).field_o = 0;
                    ((bj) this).field_q = false;
                    break L1;
                  }
                }
              } else {
                return;
              }
            }
          }
          stackOut_64_0 = param0;
          stackOut_64_1 = -38;
          stackIn_65_0 = stackOut_64_0;
          stackIn_65_1 = stackOut_64_1;
          break L0;
        }
        L39: {
          if (stackIn_65_0 == stackIn_65_1) {
            break L39;
          } else {
            byte[] discarded$13 = ((bj) this).b(25, 41);
            break L39;
          }
        }
        L40: {
          if (!((bj) this).field_w) {
            break L40;
          } else {
            L41: {
              if (~oa.a(-12520) > ~((bj) this).field_n) {
                break L41;
              } else {
                var2 = (pb) (Object) ((bj) this).field_g.a((byte) 125);
                L42: while (true) {
                  L43: {
                    if (var2 == null) {
                      break L43;
                    } else {
                      if (var5 != 0) {
                        break L41;
                      } else {
                        L44: {
                          L45: {
                            if (!var2.field_u) {
                              break L45;
                            } else {
                              if (var5 == 0) {
                                break L44;
                              } else {
                                break L45;
                              }
                            }
                          }
                          L46: {
                            if (var2.field_n) {
                              break L46;
                            } else {
                              var2.field_n = true;
                              if (var5 == 0) {
                                break L44;
                              } else {
                                break L46;
                              }
                            }
                          }
                          if (!var2.field_q) {
                            throw new RuntimeException();
                          } else {
                            var2.a(false);
                            break L44;
                          }
                        }
                        var2 = (pb) (Object) ((bj) this).field_g.b(74);
                        if (var5 == 0) {
                          continue L42;
                        } else {
                          break L43;
                        }
                      }
                    }
                  }
                  ((bj) this).field_n = 1000L + oa.a(param0 + -12482);
                  break L41;
                }
              }
            }
            break L40;
          }
        }
    }

    bj(int param0, jh param1, jh param2, ji param3, uf param4, int param5, byte[] param6, int param7, boolean param8) {
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
        ((bj) this).field_g = new fi(16);
        ((bj) this).field_o = 0;
        ((bj) this).field_t = new tf();
        ((bj) this).field_n = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((bj) this).field_e = param1;
                ((bj) this).field_p = param0;
                if (null == ((bj) this).field_e) {
                  break L2;
                } else {
                  ((bj) this).field_q = true;
                  ((bj) this).field_d = new tf();
                  if (Geoblox.field_C == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((bj) this).field_q = false;
              break L1;
            }
            L3: {
              ((bj) this).field_i = param4;
              ((bj) this).field_y = param2;
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
              ((bj) this).field_w = stackIn_7_1 != 0;
              ((bj) this).field_x = param6;
              ((bj) this).field_f = param3;
              ((bj) this).field_h = param7;
              ((bj) this).field_m = param5;
              if (((bj) this).field_y == null) {
                break L4;
              } else {
                ((bj) this).field_l = (pb) (Object) ((bj) this).field_i.a(((bj) this).field_y, ((bj) this).field_p, 15079962);
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
            stackOut_10_1 = new StringBuilder().append("bj.<init>(").append(param0).append(44);
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
          throw t.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param7 + 44 + param8 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new int[8192];
    }
}
