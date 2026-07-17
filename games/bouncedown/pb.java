/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pb {
    private int field_f;
    private int field_t;
    private int field_c;
    static int field_j;
    private int field_e;
    private int field_u;
    private int field_n;
    private int field_q;
    private aa field_b;
    private int field_d;
    private int field_i;
    private int field_o;
    private int field_s;
    private float field_r;
    private int field_l;
    private int field_a;
    static qh field_k;
    private boolean field_p;
    static String field_g;
    private int field_h;
    private int field_m;

    final void a(byte param0) {
        ((pb) this).field_b.a(((pb) this).field_o, ((pb) this).field_u, 7);
        int var2 = 67 / ((param0 - -37) / 44);
    }

    final static boolean a(wi param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              var2_int = param0.d((byte) -121);
              if (var2_int != 1) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            var3 = stackIn_3_0;
            stackOut_3_0 = var3;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("pb.C(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + 87 + 41);
        }
        return stackIn_4_0 != 0;
    }

    final static char a(byte param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        var2 = param0 & 255;
        if (var2 == 0) {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        } else {
          L0: {
            if (var2 < 128) {
              break L0;
            } else {
              if (var2 >= 160) {
                break L0;
              } else {
                L1: {
                  var3 = sa.field_j[-128 + var2];
                  if (0 != var3) {
                    break L1;
                  } else {
                    var3 = 63;
                    break L1;
                  }
                }
                var2 = var3;
                break L0;
              }
            }
          }
          return (char)var2;
        }
    }

    public static void a(int param0) {
        field_k = null;
        int var1 = 28 % ((param0 - 45) / 63);
        field_g = null;
    }

    final void d(byte param0) {
        if (null == sj.field_f) {
          if (param0 == -84) {
            if (0 < ui.field_m) {
              if (!((pb) this).field_p) {
                if (kj.field_i >= ((pb) this).field_i) {
                  if (((pb) this).field_i <= 0) {
                    if (kj.field_i == ((pb) this).field_q) {
                      if (jc.field_i == ((pb) this).field_n) {
                        return;
                      } else {
                        ((pb) this).field_b.a(((pb) this).field_n, ((pb) this).field_q, 125);
                        return;
                      }
                    } else {
                      ((pb) this).field_b.a(((pb) this).field_n, ((pb) this).field_q, 125);
                      return;
                    }
                  } else {
                    el.field_e = 0;
                    if (kj.field_i == ((pb) this).field_q) {
                      if (jc.field_i == ((pb) this).field_n) {
                        return;
                      } else {
                        ((pb) this).field_b.a(((pb) this).field_n, ((pb) this).field_q, 125);
                        return;
                      }
                    } else {
                      ((pb) this).field_b.a(((pb) this).field_n, ((pb) this).field_q, 125);
                      return;
                    }
                  }
                } else {
                  el.field_e = (-kj.field_i + ((pb) this).field_i) / 2;
                  if (kj.field_i == ((pb) this).field_q) {
                    if (jc.field_i == ((pb) this).field_n) {
                      return;
                    } else {
                      ((pb) this).field_b.a(((pb) this).field_n, ((pb) this).field_q, 125);
                      return;
                    }
                  } else {
                    ((pb) this).field_b.a(((pb) this).field_n, ((pb) this).field_q, 125);
                    return;
                  }
                }
              } else {
                int fieldTemp$2 = ((pb) this).field_t - 1;
                ((pb) this).field_t = ((pb) this).field_t - 1;
                if (fieldTemp$2 > 0) {
                  return;
                } else {
                  ((pb) this).field_t = ((pb) this).field_m;
                  if (ja.field_d < ((pb) this).field_a) {
                    ((pb) this).field_p = false;
                    return;
                  } else {
                    this.d(param0 ^ -43);
                    return;
                  }
                }
              }
            } else {
              ((pb) this).field_p = false;
              if (!((pb) this).field_p) {
                if (kj.field_i >= ((pb) this).field_i) {
                  if (((pb) this).field_i <= 0) {
                    L0: {
                      if (kj.field_i != ((pb) this).field_q) {
                        ((pb) this).field_b.a(((pb) this).field_n, ((pb) this).field_q, 125);
                        break L0;
                      } else {
                        if (jc.field_i != ((pb) this).field_n) {
                          ((pb) this).field_b.a(((pb) this).field_n, ((pb) this).field_q, 125);
                          break L0;
                        } else {
                          break L0;
                        }
                      }
                    }
                    return;
                  } else {
                    el.field_e = 0;
                    L1: {
                      if (kj.field_i != ((pb) this).field_q) {
                        ((pb) this).field_b.a(((pb) this).field_n, ((pb) this).field_q, 125);
                        break L1;
                      } else {
                        if (jc.field_i != ((pb) this).field_n) {
                          ((pb) this).field_b.a(((pb) this).field_n, ((pb) this).field_q, 125);
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    }
                    return;
                  }
                } else {
                  el.field_e = (-kj.field_i + ((pb) this).field_i) / 2;
                  L2: {
                    if (kj.field_i != ((pb) this).field_q) {
                      ((pb) this).field_b.a(((pb) this).field_n, ((pb) this).field_q, 125);
                      break L2;
                    } else {
                      if (jc.field_i != ((pb) this).field_n) {
                        ((pb) this).field_b.a(((pb) this).field_n, ((pb) this).field_q, 125);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  return;
                }
              } else {
                int fieldTemp$3 = ((pb) this).field_t - 1;
                ((pb) this).field_t = ((pb) this).field_t - 1;
                if (fieldTemp$3 > 0) {
                  return;
                } else {
                  ((pb) this).field_t = ((pb) this).field_m;
                  if (ja.field_d < ((pb) this).field_a) {
                    ((pb) this).field_p = false;
                    return;
                  } else {
                    this.d(param0 ^ -43);
                    return;
                  }
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final jb c(byte param0) {
        jb var2 = null;
        int var3 = 0;
        ((pb) this).field_o = jc.field_i;
        ((pb) this).field_u = kj.field_i;
        ((pb) this).field_b.a(((pb) this).field_e, ((pb) this).field_d, 18);
        ef.field_f = false;
        var3 = 4 / ((35 - param0) / 54);
        var2 = qd.a(0, ((pb) this).field_d, ck.field_e, 123, 0, ((pb) this).field_e);
        if (var2 == null) {
          ((pb) this).a((byte) -96);
          return var2;
        } else {
          return var2;
        }
    }

    final static void b(int param0) {
        if (param0 != 16) {
            field_k = null;
        }
    }

    private final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Bounce.field_N;
        var2 = ((pb) this).field_i;
        var4 = 56 % ((74 - param0) / 36);
        var3 = ((pb) this).field_s;
        if (!((pb) this).b((byte) -49)) {
          ((pb) this).field_p = false;
          return;
        } else {
          L0: {
            if (var2 <= ((pb) this).field_c) {
              if (((pb) this).field_f <= var2) {
                break L0;
              } else {
                var2 = ((pb) this).field_f;
                break L0;
              }
            } else {
              var2 = ((pb) this).field_c;
              break L0;
            }
          }
          if (((pb) this).field_l >= var3) {
            L1: {
              if (((pb) this).field_h <= var3) {
                break L1;
              } else {
                var3 = ((pb) this).field_h;
                break L1;
              }
            }
            if (0.0f < ((pb) this).field_r) {
              var5 = (int)(0.5f + ((pb) this).field_r * (float)var3);
              if (var2 < var5) {
                var3 = (int)((float)var2 / ((pb) this).field_r);
                if (var2 == kj.field_i) {
                  if (jc.field_i != var3) {
                    L2: {
                      ((pb) this).field_b.a(var3, var2, 125);
                      if (0 < ((pb) this).field_i) {
                        el.field_e = (((pb) this).field_i + -kj.field_i) / 2;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    return;
                  } else {
                    L3: {
                      if (0 < ((pb) this).field_i) {
                        el.field_e = (((pb) this).field_i + -kj.field_i) / 2;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    return;
                  }
                } else {
                  L4: {
                    ((pb) this).field_b.a(var3, var2, 125);
                    if (0 < ((pb) this).field_i) {
                      el.field_e = (((pb) this).field_i + -kj.field_i) / 2;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  return;
                }
              } else {
                if (var2 > var5) {
                  var2 = var5;
                  if (var2 == kj.field_i) {
                    if (jc.field_i != var3) {
                      L5: {
                        ((pb) this).field_b.a(var3, var2, 125);
                        if (0 < ((pb) this).field_i) {
                          el.field_e = (((pb) this).field_i + -kj.field_i) / 2;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      return;
                    } else {
                      L6: {
                        if (0 < ((pb) this).field_i) {
                          el.field_e = (((pb) this).field_i + -kj.field_i) / 2;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      return;
                    }
                  } else {
                    L7: {
                      ((pb) this).field_b.a(var3, var2, 125);
                      if (0 < ((pb) this).field_i) {
                        el.field_e = (((pb) this).field_i + -kj.field_i) / 2;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    return;
                  }
                } else {
                  if (var2 == kj.field_i) {
                    if (jc.field_i != var3) {
                      L8: {
                        ((pb) this).field_b.a(var3, var2, 125);
                        if (0 < ((pb) this).field_i) {
                          el.field_e = (((pb) this).field_i + -kj.field_i) / 2;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      return;
                    } else {
                      L9: {
                        if (0 < ((pb) this).field_i) {
                          el.field_e = (((pb) this).field_i + -kj.field_i) / 2;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      return;
                    }
                  } else {
                    L10: {
                      ((pb) this).field_b.a(var3, var2, 125);
                      if (0 < ((pb) this).field_i) {
                        el.field_e = (((pb) this).field_i + -kj.field_i) / 2;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    return;
                  }
                }
              }
            } else {
              if (var2 == kj.field_i) {
                if (jc.field_i == var3) {
                  L11: {
                    if (0 < ((pb) this).field_i) {
                      el.field_e = (((pb) this).field_i + -kj.field_i) / 2;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  return;
                } else {
                  L12: {
                    ((pb) this).field_b.a(var3, var2, 125);
                    if (0 < ((pb) this).field_i) {
                      el.field_e = (((pb) this).field_i + -kj.field_i) / 2;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  return;
                }
              } else {
                L13: {
                  ((pb) this).field_b.a(var3, var2, 125);
                  if (0 < ((pb) this).field_i) {
                    el.field_e = (((pb) this).field_i + -kj.field_i) / 2;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                return;
              }
            }
          } else {
            L14: {
              var3 = ((pb) this).field_l;
              if (0.0f < ((pb) this).field_r) {
                var5 = (int)(0.5f + ((pb) this).field_r * (float)var3);
                if (var2 < var5) {
                  var3 = (int)((float)var2 / ((pb) this).field_r);
                  break L14;
                } else {
                  if (var2 > var5) {
                    var2 = var5;
                    break L14;
                  } else {
                    break L14;
                  }
                }
              } else {
                break L14;
              }
            }
            if (var2 == kj.field_i) {
              if (jc.field_i == var3) {
                L15: {
                  if (0 < ((pb) this).field_i) {
                    el.field_e = (((pb) this).field_i + -kj.field_i) / 2;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                return;
              } else {
                ((pb) this).field_b.a(var3, var2, 125);
                L16: {
                  if (0 < ((pb) this).field_i) {
                    el.field_e = (((pb) this).field_i + -kj.field_i) / 2;
                    break L16;
                  } else {
                    break L16;
                  }
                }
                return;
              }
            } else {
              ((pb) this).field_b.a(var3, var2, 125);
              L17: {
                if (0 < ((pb) this).field_i) {
                  el.field_e = (((pb) this).field_i + -kj.field_i) / 2;
                  break L17;
                } else {
                  break L17;
                }
              }
              return;
            }
          }
        }
    }

    final static he a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, byte param8) {
        he var9 = null;
        RuntimeException var9_ref = null;
        he stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        he stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            var9 = new he(param6, param7, param1, param4, param2, param3, param0);
            of.field_b.a(1, (ai) (Object) var9);
            mi.a(param5, -99, var9);
            stackOut_2_0 = (he) var9;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var9_ref;
            stackOut_4_1 = new StringBuilder().append("pb.B(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + 98 + 41);
        }
        return stackIn_3_0;
    }

    final static int c(int param0) {
        return ih.field_D;
    }

    final void a(byte param0, int param1, int param2) {
        ((pb) this).field_i = param2;
        ((pb) this).field_s = param1;
        if (param0 != 13) {
            ((pb) this).field_i = -80;
        }
    }

    final boolean b(byte param0) {
        int var2 = 0;
        var2 = 63 % ((38 - param0) / 48);
        if (((pb) this).field_a <= ja.field_d) {
          if (ui.field_m <= 0) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    private pb() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Updates will sent to the email address you've given";
    }
}
