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
        field_n = null;
        field_m = null;
        field_l = null;
        field_q = null;
        field_e = null;
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
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        byte[] var5_ref_byte__ = null;
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
        byte[] stackIn_7_0 = null;
        byte[] stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        byte[] stackOut_20_0 = null;
        byte[] stackOut_6_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            L1: {
              var9 = new qc(param0);
              var3 = var9.c((byte) 34);
              var4 = var9.a((byte) -97);
              if (var4 < 0) {
                break L1;
              } else {
                L2: {
                  if (uj.field_b == 0) {
                    break L2;
                  } else {
                    if (var4 > uj.field_b) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (var3 != 0) {
                  L3: {
                    var5 = var9.a((byte) -49);
                    if (var5 < 0) {
                      break L3;
                    } else {
                      L4: {
                        if (uj.field_b == 0) {
                          break L4;
                        } else {
                          if (uj.field_b < var5) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        var17 = new byte[var5];
                        var15 = var17;
                        var13 = var15;
                        var11 = var13;
                        var6 = var11;
                        if (var3 == 1) {
                          int discarded$1 = tb.a(var17, var5, param0, var4, 9);
                          break L5;
                        } else {
                          var7 = (Object) (Object) sc.field_b;
                          synchronized (var7) {
                            L6: {
                              sc.field_b.a(-1, var9, var17);
                              break L6;
                            }
                          }
                          break L5;
                        }
                      }
                      stackOut_20_0 = (byte[]) var6;
                      stackIn_21_0 = stackOut_20_0;
                      break L0;
                    }
                  }
                  throw new RuntimeException();
                } else {
                  var16 = new byte[var4];
                  var14 = var16;
                  var12 = var14;
                  var10 = var12;
                  var5_ref_byte__ = var10;
                  var9.b(29915, var4, var16, 0);
                  stackOut_6_0 = (byte[]) var5_ref_byte__;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("v.C(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw t.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + -1 + ')');
        }
        return stackIn_21_0;
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
            if (og.field_n > 0) {
              if (((v) this).field_t) {
                int fieldTemp$4 = ((v) this).field_c - 1;
                ((v) this).field_c = ((v) this).field_c - 1;
                if (0 < fieldTemp$4) {
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
                int fieldTemp$5 = ((v) this).field_c - 1;
                ((v) this).field_c = ((v) this).field_c - 1;
                if (0 < fieldTemp$5) {
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
            if (og.field_n <= 0) {
              ((v) this).field_t = false;
              if (((v) this).field_t) {
                int fieldTemp$6 = ((v) this).field_c - 1;
                ((v) this).field_c = ((v) this).field_c - 1;
                if (0 < fieldTemp$6) {
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
                int fieldTemp$7 = ((v) this).field_c - 1;
                ((v) this).field_c = ((v) this).field_c - 1;
                if (0 < fieldTemp$7) {
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
        return jg.a((byte) -62, param0) != null;
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
