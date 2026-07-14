/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v {
    private int field_a;
    private int field_h;
    private int field_v;
    private int field_c;
    static String field_m;
    private int field_p;
    private int field_b;
    private int field_k;
    private int field_d;
    private int field_j;
    private int field_f;
    private int field_g;
    private float field_i;
    static java.awt.Color field_q;
    private int field_o;
    static String field_e;
    private db field_u;
    private int field_s;
    static String field_n;
    private boolean field_t;
    static gk field_l;
    static long field_r;

    public static void a(boolean param0) {
        Object var2 = null;
        field_n = null;
        field_m = null;
        field_l = null;
        if (!param0) {
          var2 = null;
          byte[] discarded$2 = v.a((byte[]) null, -18);
          field_q = null;
          field_e = null;
          return;
        } else {
          field_q = null;
          field_e = null;
          return;
        }
    }

    final void a(byte param0, int param1, int param2) {
        ((v) this).field_d = param2;
        if (param0 < 125) {
            ((v) this).a((byte) 31);
            ((v) this).field_p = param1;
            return;
        }
        ((v) this).field_p = param1;
    }

    final static byte[] a(byte[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        byte[] var5_ref_byte__ = null;
        int var5 = 0;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        qc var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = new qc(param0);
                    var3 = var9.c((byte) 34);
                    var4 = var9.a((byte) -97);
                    if (var4 < 0) {
                        statePc = 4;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (-1 == uj.field_b) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (var4 > uj.field_b) {
                        statePc = 4;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 4: {
                    throw new RuntimeException();
                }
                case 5: {
                    if (param1 != var3) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var16 = new byte[var4];
                    var14 = var16;
                    var12 = var14;
                    var10 = var12;
                    var5_ref_byte__ = var10;
                    var9.b(29915, var4, var16, 0);
                    return var5_ref_byte__;
                }
                case 7: {
                    var5 = var9.a((byte) -49);
                    if ((var5 ^ -1) > -1) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (uj.field_b == 0) {
                        statePc = 12;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (uj.field_b < var5) {
                        statePc = 11;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 11: {
                    throw new RuntimeException();
                }
                case 12: {
                    var17 = new byte[var5];
                    var15 = var17;
                    var13 = var15;
                    var11 = var13;
                    var6 = var11;
                    if (-2 == (var3 ^ -1)) {
                        statePc = 18;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var7 = (Object) (Object) sc.field_b;
                    // monitorenter sc.field_b
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    try {
                        sc.field_b.a(param1 + 0, var9, var17);
                        // monitorexit var7
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var8 = caughtException;
                        // monitorexit var7
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 17: {
                    throw (RuntimeException) (Object) var8;
                }
                case 18: {
                    int discarded$1 = tb.a(var17, var5, param0, var4, 9);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    return var6;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(byte param0) {
        ((v) this).field_u.a(-2964, ((v) this).field_g, ((v) this).field_b);
        if (param0 > -5) {
            this.b(false);
        }
    }

    final void a(byte param0) {
        if (null != vl.field_n) {
          return;
        } else {
          if (param0 < -108) {
            if ((og.field_n ^ -1) < -1) {
              if (((v) this).field_t) {
                ((v) this).field_c = ((v) this).field_c - 1;
                if (0 < ((v) this).field_c - 1) {
                  return;
                } else {
                  ((v) this).field_c = ((v) this).field_s;
                  if (((v) this).field_k > li.field_c) {
                    ((v) this).field_t = false;
                    return;
                  } else {
                    this.b(true);
                    return;
                  }
                }
              } else {
                if (((v) this).field_d <= kh.field_d) {
                  if (((v) this).field_d <= 0) {
                    if (kh.field_d == ((v) this).field_a) {
                      if (ok.field_c == ((v) this).field_h) {
                        return;
                      } else {
                        ((v) this).field_u.a(-2964, ((v) this).field_a, ((v) this).field_h);
                        return;
                      }
                    } else {
                      ((v) this).field_u.a(-2964, ((v) this).field_a, ((v) this).field_h);
                      return;
                    }
                  } else {
                    qa.field_b = 0;
                    if (kh.field_d == ((v) this).field_a) {
                      if (ok.field_c != ((v) this).field_h) {
                        ((v) this).field_u.a(-2964, ((v) this).field_a, ((v) this).field_h);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      ((v) this).field_u.a(-2964, ((v) this).field_a, ((v) this).field_h);
                      return;
                    }
                  }
                } else {
                  qa.field_b = (-kh.field_d + ((v) this).field_d) / 2;
                  if (kh.field_d == ((v) this).field_a) {
                    if (ok.field_c != ((v) this).field_h) {
                      ((v) this).field_u.a(-2964, ((v) this).field_a, ((v) this).field_h);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    ((v) this).field_u.a(-2964, ((v) this).field_a, ((v) this).field_h);
                    return;
                  }
                }
              }
            } else {
              ((v) this).field_t = false;
              if (((v) this).field_t) {
                ((v) this).field_c = ((v) this).field_c - 1;
                if (0 < ((v) this).field_c - 1) {
                  return;
                } else {
                  ((v) this).field_c = ((v) this).field_s;
                  if (((v) this).field_k > li.field_c) {
                    ((v) this).field_t = false;
                    return;
                  } else {
                    this.b(true);
                    return;
                  }
                }
              } else {
                L0: {
                  if (((v) this).field_d <= kh.field_d) {
                    if (((v) this).field_d <= 0) {
                      break L0;
                    } else {
                      qa.field_b = 0;
                      break L0;
                    }
                  } else {
                    qa.field_b = (-kh.field_d + ((v) this).field_d) / 2;
                    break L0;
                  }
                }
                if (kh.field_d == ((v) this).field_a) {
                  if (ok.field_c != ((v) this).field_h) {
                    ((v) this).field_u.a(-2964, ((v) this).field_a, ((v) this).field_h);
                    return;
                  } else {
                    return;
                  }
                } else {
                  ((v) this).field_u.a(-2964, ((v) this).field_a, ((v) this).field_h);
                  return;
                }
              }
            }
          } else {
            ((v) this).field_a = -79;
            if ((og.field_n ^ -1) >= -1) {
              ((v) this).field_t = false;
              if (((v) this).field_t) {
                ((v) this).field_c = ((v) this).field_c - 1;
                if (0 < ((v) this).field_c - 1) {
                  return;
                } else {
                  ((v) this).field_c = ((v) this).field_s;
                  if (((v) this).field_k > li.field_c) {
                    ((v) this).field_t = false;
                    return;
                  } else {
                    this.b(true);
                    return;
                  }
                }
              } else {
                if (((v) this).field_d <= kh.field_d) {
                  if (((v) this).field_d <= 0) {
                    L1: {
                      if (kh.field_d != ((v) this).field_a) {
                        ((v) this).field_u.a(-2964, ((v) this).field_a, ((v) this).field_h);
                        break L1;
                      } else {
                        if (ok.field_c == ((v) this).field_h) {
                          break L1;
                        } else {
                          ((v) this).field_u.a(-2964, ((v) this).field_a, ((v) this).field_h);
                          break L1;
                        }
                      }
                    }
                    return;
                  } else {
                    qa.field_b = 0;
                    L2: {
                      if (kh.field_d != ((v) this).field_a) {
                        ((v) this).field_u.a(-2964, ((v) this).field_a, ((v) this).field_h);
                        break L2;
                      } else {
                        if (ok.field_c == ((v) this).field_h) {
                          break L2;
                        } else {
                          ((v) this).field_u.a(-2964, ((v) this).field_a, ((v) this).field_h);
                          break L2;
                        }
                      }
                    }
                    return;
                  }
                } else {
                  qa.field_b = (-kh.field_d + ((v) this).field_d) / 2;
                  L3: {
                    if (kh.field_d != ((v) this).field_a) {
                      ((v) this).field_u.a(-2964, ((v) this).field_a, ((v) this).field_h);
                      break L3;
                    } else {
                      if (ok.field_c == ((v) this).field_h) {
                        break L3;
                      } else {
                        ((v) this).field_u.a(-2964, ((v) this).field_a, ((v) this).field_h);
                        break L3;
                      }
                    }
                  }
                  return;
                }
              }
            } else {
              if (((v) this).field_t) {
                ((v) this).field_c = ((v) this).field_c - 1;
                if (0 < ((v) this).field_c - 1) {
                  return;
                } else {
                  ((v) this).field_c = ((v) this).field_s;
                  if (((v) this).field_k > li.field_c) {
                    ((v) this).field_t = false;
                    return;
                  } else {
                    this.b(true);
                    return;
                  }
                }
              } else {
                L4: {
                  if (((v) this).field_d <= kh.field_d) {
                    if (((v) this).field_d <= 0) {
                      break L4;
                    } else {
                      qa.field_b = 0;
                      break L4;
                    }
                  } else {
                    qa.field_b = (-kh.field_d + ((v) this).field_d) / 2;
                    break L4;
                  }
                }
                L5: {
                  if (kh.field_d != ((v) this).field_a) {
                    ((v) this).field_u.a(-2964, ((v) this).field_a, ((v) this).field_h);
                    break L5;
                  } else {
                    if (ok.field_c == ((v) this).field_h) {
                      break L5;
                    } else {
                      ((v) this).field_u.a(-2964, ((v) this).field_a, ((v) this).field_h);
                      break L5;
                    }
                  }
                }
                return;
              }
            }
          }
        }
    }

    private final void b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Geoblox.field_C;
        var2 = ((v) this).field_d;
        var3 = ((v) this).field_p;
        if (!((v) this).a(-123)) {
          ((v) this).field_t = false;
          return;
        } else {
          L0: {
            if (((v) this).field_j >= var2) {
              if (var2 >= ((v) this).field_f) {
                break L0;
              } else {
                var2 = ((v) this).field_f;
                break L0;
              }
            } else {
              var2 = ((v) this).field_j;
              break L0;
            }
          }
          if (var3 <= ((v) this).field_v) {
            L1: {
              if (var3 >= ((v) this).field_o) {
                break L1;
              } else {
                var3 = ((v) this).field_o;
                break L1;
              }
            }
            if (0.0f < ((v) this).field_i) {
              var4 = (int)(0.5f + (float)var3 * ((v) this).field_i);
              if (var4 > var2) {
                var3 = (int)((float)var2 / ((v) this).field_i);
                if (param0) {
                  if (kh.field_d != var2) {
                    ((v) this).field_u.a(-2964, var2, var3);
                    if (((v) this).field_d <= 0) {
                      return;
                    } else {
                      qa.field_b = (-kh.field_d + ((v) this).field_d) / 2;
                      return;
                    }
                  } else {
                    if (var3 != ok.field_c) {
                      ((v) this).field_u.a(-2964, var2, var3);
                      if (((v) this).field_d <= 0) {
                        return;
                      } else {
                        qa.field_b = (-kh.field_d + ((v) this).field_d) / 2;
                        return;
                      }
                    } else {
                      if (((v) this).field_d <= 0) {
                        return;
                      } else {
                        qa.field_b = (-kh.field_d + ((v) this).field_d) / 2;
                        return;
                      }
                    }
                  }
                } else {
                  return;
                }
              } else {
                if (var4 < var2) {
                  var2 = var4;
                  if (param0) {
                    if (kh.field_d != var2) {
                      L2: {
                        ((v) this).field_u.a(-2964, var2, var3);
                        if (((v) this).field_d <= 0) {
                          break L2;
                        } else {
                          qa.field_b = (-kh.field_d + ((v) this).field_d) / 2;
                          break L2;
                        }
                      }
                      return;
                    } else {
                      if (var3 != ok.field_c) {
                        L3: {
                          ((v) this).field_u.a(-2964, var2, var3);
                          if (((v) this).field_d <= 0) {
                            break L3;
                          } else {
                            qa.field_b = (-kh.field_d + ((v) this).field_d) / 2;
                            break L3;
                          }
                        }
                        return;
                      } else {
                        if (((v) this).field_d <= 0) {
                          return;
                        } else {
                          qa.field_b = (-kh.field_d + ((v) this).field_d) / 2;
                          return;
                        }
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  if (param0) {
                    if (kh.field_d != var2) {
                      ((v) this).field_u.a(-2964, var2, var3);
                      if (((v) this).field_d > 0) {
                        qa.field_b = (-kh.field_d + ((v) this).field_d) / 2;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (var3 != ok.field_c) {
                        ((v) this).field_u.a(-2964, var2, var3);
                        if (((v) this).field_d <= 0) {
                          return;
                        } else {
                          qa.field_b = (-kh.field_d + ((v) this).field_d) / 2;
                          return;
                        }
                      } else {
                        if (((v) this).field_d > 0) {
                          qa.field_b = (-kh.field_d + ((v) this).field_d) / 2;
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
            } else {
              if (param0) {
                if (kh.field_d != var2) {
                  ((v) this).field_u.a(-2964, var2, var3);
                  if (((v) this).field_d > 0) {
                    qa.field_b = (-kh.field_d + ((v) this).field_d) / 2;
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (var3 != ok.field_c) {
                    ((v) this).field_u.a(-2964, var2, var3);
                    if (((v) this).field_d > 0) {
                      qa.field_b = (-kh.field_d + ((v) this).field_d) / 2;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if (((v) this).field_d > 0) {
                      qa.field_b = (-kh.field_d + ((v) this).field_d) / 2;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                return;
              }
            }
          } else {
            var3 = ((v) this).field_v;
            if (0.0f < ((v) this).field_i) {
              L4: {
                var4 = (int)(0.5f + (float)var3 * ((v) this).field_i);
                if (var4 > var2) {
                  var3 = (int)((float)var2 / ((v) this).field_i);
                  break L4;
                } else {
                  if (var4 < var2) {
                    var2 = var4;
                    break L4;
                  } else {
                    if (!param0) {
                      return;
                    } else {
                      L5: {
                        if (kh.field_d != var2) {
                          ((v) this).field_u.a(-2964, var2, var3);
                          break L5;
                        } else {
                          if (var3 != ok.field_c) {
                            ((v) this).field_u.a(-2964, var2, var3);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (((v) this).field_d <= 0) {
                          break L6;
                        } else {
                          qa.field_b = (-kh.field_d + ((v) this).field_d) / 2;
                          break L6;
                        }
                      }
                      return;
                    }
                  }
                }
              }
              if (param0) {
                L7: {
                  if (kh.field_d != var2) {
                    ((v) this).field_u.a(-2964, var2, var3);
                    break L7;
                  } else {
                    if (var3 != ok.field_c) {
                      ((v) this).field_u.a(-2964, var2, var3);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                if (((v) this).field_d <= 0) {
                  return;
                } else {
                  qa.field_b = (-kh.field_d + ((v) this).field_d) / 2;
                  return;
                }
              } else {
                return;
              }
            } else {
              if (!param0) {
                return;
              } else {
                L8: {
                  if (kh.field_d != var2) {
                    ((v) this).field_u.a(-2964, var2, var3);
                    break L8;
                  } else {
                    if (var3 != ok.field_c) {
                      ((v) this).field_u.a(-2964, var2, var3);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
                L9: {
                  if (((v) this).field_d <= 0) {
                    break L9;
                  } else {
                    qa.field_b = (-kh.field_d + ((v) this).field_d) / 2;
                    break L9;
                  }
                }
                return;
              }
            }
          }
        }
    }

    final boolean a(int param0) {
        if (param0 <= -91) {
          if (li.field_c >= ((v) this).field_k) {
            if (og.field_n <= 0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_m = null;
          if (li.field_c >= ((v) this).field_k) {
            if (og.field_n <= 0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    private v() throws Throwable {
        throw new Error();
    }

    final static boolean a(String param0, byte param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param1 <= 12) {
          L0: {
            field_e = null;
            if (jg.a((byte) -62, param0) == null) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (jg.a((byte) -62, param0) == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Confirm Password: ";
        field_e = null;
        field_n = "To skip this tutorial, press <img=3> at any point.";
        field_q = new java.awt.Color(10040319);
        field_l = new gk();
    }
}
