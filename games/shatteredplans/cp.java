/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cp {
    private int field_r;
    private int field_m;
    static int field_q;
    private int field_k;
    private int field_j;
    private int field_h;
    private int field_n;
    private int field_o;
    private int field_d;
    static bi field_t;
    private int field_i;
    private int field_f;
    private int field_p;
    private int field_g;
    static boolean field_u;
    private int field_c;
    private int field_l;
    private bn field_s;
    private int field_e;
    static qr field_a;
    private float field_v;
    private boolean field_b;

    final boolean b(int param0) {
        if (param0 == -1) {
          if (re.field_a >= ((cp) this).field_p) {
            if (-1 >= es.field_m) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          eb discarded$6 = ((cp) this).a(-62);
          if (re.field_a >= ((cp) this).field_p) {
            if (-1 <= es.field_m) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static void a(int param0, int param1) {
        sl var2 = js.field_f;
        var2.h(6, 255);
        var2.c(1, (byte) -69);
        var2.c(0, (byte) -119);
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = ((cp) this).field_c;
        var3 = ((cp) this).field_l;
        if (((cp) this).b(-1)) {
          if (var2 <= ((cp) this).field_d) {
            L0: {
              if (((cp) this).field_f <= var2) {
                break L0;
              } else {
                var2 = ((cp) this).field_f;
                break L0;
              }
            }
            L1: {
              if (var3 > ((cp) this).field_j) {
                var3 = ((cp) this).field_j;
                break L1;
              } else {
                if (var3 >= ((cp) this).field_r) {
                  break L1;
                } else {
                  L2: {
                    var3 = ((cp) this).field_r;
                    if (0.0f >= ((cp) this).field_v) {
                      break L2;
                    } else {
                      var4 = (int)(0.5f + ((cp) this).field_v * (float)var3);
                      if (var4 > var2) {
                        var3 = (int)((float)var2 / ((cp) this).field_v);
                        break L2;
                      } else {
                        if (var2 <= var4) {
                          break L2;
                        } else {
                          L3: {
                            var2 = var4;
                            if (me.field_e != var2) {
                              ((cp) this).field_s.a(var3, var2, -12725);
                              break L3;
                            } else {
                              if (nn.field_b == var3) {
                                break L3;
                              } else {
                                ((cp) this).field_s.a(var3, var2, -12725);
                                break L3;
                              }
                            }
                          }
                          L4: {
                            if (((cp) this).field_c > 0) {
                              gs.field_k = (-me.field_e + ((cp) this).field_c) / 2;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          return;
                        }
                      }
                    }
                  }
                  if (me.field_e == var2) {
                    if (nn.field_b != var3) {
                      L5: {
                        ((cp) this).field_s.a(var3, var2, -12725);
                        if (((cp) this).field_c > 0) {
                          gs.field_k = (-me.field_e + ((cp) this).field_c) / 2;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      return;
                    } else {
                      L6: {
                        if (((cp) this).field_c > 0) {
                          gs.field_k = (-me.field_e + ((cp) this).field_c) / 2;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      return;
                    }
                  } else {
                    L7: {
                      ((cp) this).field_s.a(var3, var2, -12725);
                      if (((cp) this).field_c > 0) {
                        gs.field_k = (-me.field_e + ((cp) this).field_c) / 2;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    return;
                  }
                }
              }
            }
            L8: {
              if (0.0f >= ((cp) this).field_v) {
                break L8;
              } else {
                var4 = (int)(0.5f + ((cp) this).field_v * (float)var3);
                if (var4 > var2) {
                  var3 = (int)((float)var2 / ((cp) this).field_v);
                  break L8;
                } else {
                  if (var2 <= var4) {
                    break L8;
                  } else {
                    var2 = var4;
                    if (me.field_e == var2) {
                      if (nn.field_b != var3) {
                        L9: {
                          ((cp) this).field_s.a(var3, var2, -12725);
                          if (((cp) this).field_c > 0) {
                            gs.field_k = (-me.field_e + ((cp) this).field_c) / 2;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        return;
                      } else {
                        L10: {
                          if (((cp) this).field_c > 0) {
                            gs.field_k = (-me.field_e + ((cp) this).field_c) / 2;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        return;
                      }
                    } else {
                      L11: {
                        ((cp) this).field_s.a(var3, var2, -12725);
                        if (((cp) this).field_c > 0) {
                          gs.field_k = (-me.field_e + ((cp) this).field_c) / 2;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      return;
                    }
                  }
                }
              }
            }
            if (me.field_e == var2) {
              if (nn.field_b != var3) {
                L12: {
                  ((cp) this).field_s.a(var3, var2, -12725);
                  if (((cp) this).field_c > 0) {
                    gs.field_k = (-me.field_e + ((cp) this).field_c) / 2;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                return;
              } else {
                L13: {
                  if (((cp) this).field_c > 0) {
                    gs.field_k = (-me.field_e + ((cp) this).field_c) / 2;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                return;
              }
            } else {
              L14: {
                ((cp) this).field_s.a(var3, var2, -12725);
                if (((cp) this).field_c > 0) {
                  gs.field_k = (-me.field_e + ((cp) this).field_c) / 2;
                  break L14;
                } else {
                  break L14;
                }
              }
              return;
            }
          } else {
            L15: {
              var2 = ((cp) this).field_d;
              if (var3 > ((cp) this).field_j) {
                var3 = ((cp) this).field_j;
                break L15;
              } else {
                if (var3 < ((cp) this).field_r) {
                  var3 = ((cp) this).field_r;
                  break L15;
                } else {
                  L16: {
                    if (0.0f >= ((cp) this).field_v) {
                      break L16;
                    } else {
                      var4 = (int)(0.5f + ((cp) this).field_v * (float)var3);
                      if (var4 > var2) {
                        var3 = (int)((float)var2 / ((cp) this).field_v);
                        break L16;
                      } else {
                        if (var2 <= var4) {
                          break L16;
                        } else {
                          var2 = var4;
                          break L16;
                        }
                      }
                    }
                  }
                  L17: {
                    if (me.field_e != var2) {
                      ((cp) this).field_s.a(var3, var2, -12725);
                      break L17;
                    } else {
                      if (nn.field_b == var3) {
                        break L17;
                      } else {
                        ((cp) this).field_s.a(var3, var2, -12725);
                        break L17;
                      }
                    }
                  }
                  L18: {
                    if (((cp) this).field_c > 0) {
                      gs.field_k = (-me.field_e + ((cp) this).field_c) / 2;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  return;
                }
              }
            }
            if (0.0f < ((cp) this).field_v) {
              L19: {
                var4 = (int)(0.5f + ((cp) this).field_v * (float)var3);
                if (var4 > var2) {
                  var3 = (int)((float)var2 / ((cp) this).field_v);
                  break L19;
                } else {
                  if (var2 <= var4) {
                    break L19;
                  } else {
                    var2 = var4;
                    break L19;
                  }
                }
              }
              if (me.field_e != var2) {
                ((cp) this).field_s.a(var3, var2, -12725);
                L20: {
                  if (((cp) this).field_c > 0) {
                    gs.field_k = (-me.field_e + ((cp) this).field_c) / 2;
                    break L20;
                  } else {
                    break L20;
                  }
                }
                return;
              } else {
                if (nn.field_b != var3) {
                  L21: {
                    ((cp) this).field_s.a(var3, var2, -12725);
                    if (((cp) this).field_c > 0) {
                      gs.field_k = (-me.field_e + ((cp) this).field_c) / 2;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  return;
                } else {
                  L22: {
                    if (((cp) this).field_c > 0) {
                      gs.field_k = (-me.field_e + ((cp) this).field_c) / 2;
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                  return;
                }
              }
            } else {
              L23: {
                if (me.field_e != var2) {
                  ((cp) this).field_s.a(var3, var2, -12725);
                  break L23;
                } else {
                  if (nn.field_b == var3) {
                    break L23;
                  } else {
                    ((cp) this).field_s.a(var3, var2, -12725);
                    break L23;
                  }
                }
              }
              L24: {
                if (((cp) this).field_c > 0) {
                  gs.field_k = (-me.field_e + ((cp) this).field_c) / 2;
                  break L24;
                } else {
                  break L24;
                }
              }
              return;
            }
          }
        } else {
          ((cp) this).field_b = false;
          return;
        }
    }

    final static boolean a(int param0, int param1, int[] param2, bh param3, int param4) {
        RuntimeException var5 = null;
        Object var6 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_6_0 = false;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (!param3.a(16548, param1, param4)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              L1: {
                if (param0 == 0) {
                  break L1;
                } else {
                  var6 = null;
                  boolean discarded$2 = cp.a(-93, -33, (int[]) null, (bh) null, 124);
                  break L1;
                }
              }
              stackOut_6_0 = aj.a(1, param4, param1, param2);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("cp.C(").append(param0).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param4 + ')');
        }
        return stackIn_7_0;
    }

    public static void b(boolean param0) {
        field_t = null;
        field_a = null;
    }

    final void a(boolean param0) {
        if (bj.field_K == null) {
          L0: {
            if (es.field_m <= 0) {
              ((cp) this).field_b = false;
              break L0;
            } else {
              break L0;
            }
          }
          if (((cp) this).field_b) {
            int fieldTemp$1 = ((cp) this).field_i - 1;
            ((cp) this).field_i = ((cp) this).field_i - 1;
            if (0 < fieldTemp$1) {
              return;
            } else {
              ((cp) this).field_i = ((cp) this).field_m;
              if (((cp) this).field_p > re.field_a) {
                ((cp) this).field_b = false;
                return;
              } else {
                L1: {
                  this.a((byte) 45);
                  if (param0) {
                    break L1;
                  } else {
                    ((cp) this).field_j = 87;
                    break L1;
                  }
                }
                return;
              }
            }
          } else {
            if (((cp) this).field_c <= me.field_e) {
              if (0 >= ((cp) this).field_c) {
                if (me.field_e == ((cp) this).field_e) {
                  if (nn.field_b == ((cp) this).field_h) {
                    return;
                  } else {
                    ((cp) this).field_s.a(((cp) this).field_h, ((cp) this).field_e, -12725);
                    return;
                  }
                } else {
                  ((cp) this).field_s.a(((cp) this).field_h, ((cp) this).field_e, -12725);
                  return;
                }
              } else {
                gs.field_k = 0;
                if (me.field_e == ((cp) this).field_e) {
                  if (nn.field_b == ((cp) this).field_h) {
                    return;
                  } else {
                    ((cp) this).field_s.a(((cp) this).field_h, ((cp) this).field_e, -12725);
                    return;
                  }
                } else {
                  ((cp) this).field_s.a(((cp) this).field_h, ((cp) this).field_e, -12725);
                  return;
                }
              }
            } else {
              gs.field_k = (((cp) this).field_c - me.field_e) / 2;
              if (me.field_e == ((cp) this).field_e) {
                if (nn.field_b == ((cp) this).field_h) {
                  return;
                } else {
                  ((cp) this).field_s.a(((cp) this).field_h, ((cp) this).field_e, -12725);
                  return;
                }
              } else {
                ((cp) this).field_s.a(((cp) this).field_h, ((cp) this).field_e, -12725);
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final eb a(int param0) {
        ((cp) this).field_o = nn.field_b;
        ((cp) this).field_n = me.field_e;
        ((cp) this).field_s.a(((cp) this).field_g, ((cp) this).field_k, param0 ^ -12725);
        pf.field_c = false;
        eb var2 = si.a(((cp) this).field_k, fa.field_W, 0, (byte) 125, param0, ((cp) this).field_g);
        if (!(var2 != null)) {
            ((cp) this).c(param0 ^ -115);
        }
        return var2;
    }

    final void c(int param0) {
        ((cp) this).field_s.a(((cp) this).field_o, ((cp) this).field_n, -12725);
        int var2 = -2 % ((param0 - -68) / 46);
    }

    final void a(int param0, int param1, int param2) {
        ((cp) this).field_l = param1;
        int var4 = -89 / ((param2 - 64) / 62);
        ((cp) this).field_c = param0;
    }

    private cp() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = 0;
        field_u = true;
    }
}
