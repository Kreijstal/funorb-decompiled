/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj {
    int field_f;
    int field_n;
    static String field_a;
    private int field_s;
    static je field_d;
    private int field_r;
    boolean field_h;
    private int field_o;
    private int field_p;
    static String field_u;
    private ok field_k;
    private int field_e;
    private int field_j;
    private float field_v;
    static String[] field_q;
    private int field_t;
    static String field_w;
    private int field_i;
    private int field_m;
    private int field_x;
    static boolean field_c;
    private int field_l;
    private int field_g;
    private int field_b;

    final void a(int param0, int param1, int param2) {
        ((fj) this).field_f = param0;
        ((fj) this).field_n = param1;
        if (param2 == -8717) {
            return;
        }
        this.c((byte) -71);
    }

    final static void a(byte param0, tc param1, tc param2) {
        try {
            if (!(param1.field_j == null)) {
                param1.d(-105);
            }
            param1.field_j = param2.field_j;
            param1.field_b = param2;
            param1.field_j.field_b = param1;
            param1.field_b.field_j = param1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "fj.L(" + -123 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1, int param2) {
        ((fj) this).field_g = param0;
        ((fj) this).field_m = param1;
        if (param2 == -30514) {
            return;
        }
        ((fj) this).field_o = 12;
    }

    final static void a(java.awt.Frame param0, hd param1, int param2) {
        wo var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param2 == -2) {
              L1: while (true) {
                var3 = param1.a((byte) -68, param0);
                L2: while (true) {
                  if (var3.field_g != 0) {
                    if (var3.field_g != 1) {
                      nu.a(100L, 0);
                      continue L1;
                    } else {
                      param0.setVisible(false);
                      param0.dispose();
                      break L0;
                    }
                  } else {
                    nu.a(10L, 0);
                    continue L2;
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("fj.J(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
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
          L4: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param2 + ')');
        }
    }

    fj(ok param0) {
        this(640, 480, 1280, 1024, 640, 480, 122, 16, param0);
    }

    final boolean c(int param0, int param1, int param2) {
        int stackIn_13_0 = 0;
        int stackOut_11_0 = 0;
        if (param1 == 122) {
          if (param0 >= ((fj) this).field_l) {
            if (((fj) this).field_r >= param0) {
              if (param2 >= ((fj) this).field_i) {
                if (param2 <= ((fj) this).field_x) {
                  if (((fj) this).field_v != 0.0f) {
                    if (Math.round(((fj) this).field_v * (float)param2) == param0) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    stackOut_11_0 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    return stackIn_13_0 != 0;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final boolean a(byte param0) {
        if (param0 == 103) {
          if (((fj) this).field_o <= hq.field_f) {
            if (df.field_M <= 0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          ((fj) this).a(-97);
          if (((fj) this).field_o <= hq.field_f) {
            if (df.field_M <= 0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final void b(int param0) {
        ((fj) this).field_k.a(((fj) this).field_j, -32263, ((fj) this).field_e);
        if (param0 >= 114) {
            return;
        }
        ((fj) this).field_j = -64;
    }

    final static void a(java.awt.Component param0, byte param1) {
        try {
            param0.removeKeyListener((java.awt.event.KeyListener) (Object) va.field_w);
            param0.removeFocusListener((java.awt.event.FocusListener) (Object) va.field_w);
            us.field_c = -1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "fj.D(" + (param0 != null ? "{...}" : "null") + ',' + 35 + ')');
        }
    }

    final boolean d(byte param0) {
        if (param0 <= 38) {
            field_w = null;
            if (df.field_M <= 0) {
                return false;
            }
            if (((fj) this).field_o <= hq.field_f) {
                return false;
            }
            return true;
        }
        if (df.field_M <= 0) {
            return false;
        }
        if (((fj) this).field_o <= hq.field_f) {
            return false;
        }
        return true;
    }

    final void a(int param0) {
        if (null == wq.field_a) {
          L0: {
            if (df.field_M <= 0) {
              ((fj) this).field_h = false;
              break L0;
            } else {
              break L0;
            }
          }
          if (!((fj) this).field_h) {
            if (bn.field_b < ((fj) this).field_m) {
              sp.field_b = (((fj) this).field_m - bn.field_b) / 2;
              if (bn.field_b == ((fj) this).field_t) {
                if (dt.field_a == ((fj) this).field_s) {
                  return;
                } else {
                  ((fj) this).field_k.a(((fj) this).field_s, -32263, ((fj) this).field_t);
                  return;
                }
              } else {
                ((fj) this).field_k.a(((fj) this).field_s, -32263, ((fj) this).field_t);
                return;
              }
            } else {
              if (((fj) this).field_m <= 0) {
                if (bn.field_b == ((fj) this).field_t) {
                  if (dt.field_a == ((fj) this).field_s) {
                    return;
                  } else {
                    ((fj) this).field_k.a(((fj) this).field_s, -32263, ((fj) this).field_t);
                    return;
                  }
                } else {
                  ((fj) this).field_k.a(((fj) this).field_s, -32263, ((fj) this).field_t);
                  return;
                }
              } else {
                sp.field_b = 0;
                if (bn.field_b == ((fj) this).field_t) {
                  if (dt.field_a == ((fj) this).field_s) {
                    return;
                  } else {
                    ((fj) this).field_k.a(((fj) this).field_s, -32263, ((fj) this).field_t);
                    return;
                  }
                } else {
                  ((fj) this).field_k.a(((fj) this).field_s, -32263, ((fj) this).field_t);
                  return;
                }
              }
            }
          } else {
            int fieldTemp$1 = ((fj) this).field_p - 1;
            ((fj) this).field_p = ((fj) this).field_p - 1;
            if (fieldTemp$1 <= 0) {
              ((fj) this).field_p = ((fj) this).field_b;
              if (((fj) this).field_o <= hq.field_f) {
                if (param0 == 0) {
                  this.c((byte) 56);
                  return;
                } else {
                  ((fj) this).field_e = 67;
                  this.c((byte) 56);
                  return;
                }
              } else {
                ((fj) this).field_h = false;
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final rd c(int param0) {
        rd var2 = null;
        ((fj) this).field_j = dt.field_a;
        if (param0 == -1) {
          ((fj) this).field_e = bn.field_b;
          ((fj) this).field_k.a(((fj) this).field_n, param0 ^ 32262, ((fj) this).field_f);
          tq.field_a = false;
          var2 = dj.a(((fj) this).field_f, 0, ft.field_m, -71, 0, ((fj) this).field_n);
          if (var2 == null) {
            ((fj) this).b(124);
            return var2;
          } else {
            return var2;
          }
        } else {
          fj.b((byte) -86);
          ((fj) this).field_e = bn.field_b;
          ((fj) this).field_k.a(((fj) this).field_n, param0 ^ 32262, ((fj) this).field_f);
          tq.field_a = false;
          var2 = dj.a(((fj) this).field_f, 0, ft.field_m, -71, 0, ((fj) this).field_n);
          if (var2 != null) {
            return var2;
          } else {
            ((fj) this).b(124);
            return var2;
          }
        }
    }

    public static void b(byte param0) {
        int var1 = -107 / ((57 - param0) / 47);
        field_q = null;
        field_a = null;
        field_w = null;
        field_d = null;
        field_u = null;
    }

    private final void c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = ((fj) this).field_m;
        if (param0 != 56) {
          ((fj) this).field_n = 17;
          var3 = ((fj) this).field_g;
          if (!((fj) this).a((byte) 103)) {
            ((fj) this).field_h = false;
            return;
          } else {
            L0: {
              if (var2 <= ((fj) this).field_r) {
                if (var2 >= ((fj) this).field_l) {
                  break L0;
                } else {
                  var2 = ((fj) this).field_l;
                  break L0;
                }
              } else {
                var2 = ((fj) this).field_r;
                break L0;
              }
            }
            if (var3 <= ((fj) this).field_x) {
              L1: {
                if (((fj) this).field_i <= var3) {
                  break L1;
                } else {
                  var3 = ((fj) this).field_i;
                  break L1;
                }
              }
              if (0.0f < ((fj) this).field_v) {
                var4 = (int)(((fj) this).field_v * (float)var3 + 0.5f);
                if (var2 < var4) {
                  var3 = (int)((float)var2 / ((fj) this).field_v);
                  if (bn.field_b != var2) {
                    ((fj) this).field_k.a(var3, -32263, var2);
                    if (((fj) this).field_m > 0) {
                      sp.field_b = (-bn.field_b + ((fj) this).field_m) / 2;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if (dt.field_a == var3) {
                      if (((fj) this).field_m > 0) {
                        sp.field_b = (-bn.field_b + ((fj) this).field_m) / 2;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      ((fj) this).field_k.a(var3, -32263, var2);
                      if (((fj) this).field_m > 0) {
                        sp.field_b = (-bn.field_b + ((fj) this).field_m) / 2;
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  if (var4 < var2) {
                    var2 = var4;
                    if (bn.field_b != var2) {
                      ((fj) this).field_k.a(var3, -32263, var2);
                      if (((fj) this).field_m > 0) {
                        sp.field_b = (-bn.field_b + ((fj) this).field_m) / 2;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (dt.field_a == var3) {
                        if (((fj) this).field_m > 0) {
                          sp.field_b = (-bn.field_b + ((fj) this).field_m) / 2;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        ((fj) this).field_k.a(var3, -32263, var2);
                        if (((fj) this).field_m > 0) {
                          sp.field_b = (-bn.field_b + ((fj) this).field_m) / 2;
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    if (bn.field_b != var2) {
                      ((fj) this).field_k.a(var3, -32263, var2);
                      if (((fj) this).field_m > 0) {
                        sp.field_b = (-bn.field_b + ((fj) this).field_m) / 2;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (dt.field_a == var3) {
                        if (((fj) this).field_m > 0) {
                          sp.field_b = (-bn.field_b + ((fj) this).field_m) / 2;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        ((fj) this).field_k.a(var3, -32263, var2);
                        if (((fj) this).field_m > 0) {
                          sp.field_b = (-bn.field_b + ((fj) this).field_m) / 2;
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
              } else {
                if (bn.field_b != var2) {
                  ((fj) this).field_k.a(var3, -32263, var2);
                  if (((fj) this).field_m > 0) {
                    sp.field_b = (-bn.field_b + ((fj) this).field_m) / 2;
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (dt.field_a == var3) {
                    if (((fj) this).field_m > 0) {
                      sp.field_b = (-bn.field_b + ((fj) this).field_m) / 2;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    ((fj) this).field_k.a(var3, -32263, var2);
                    if (((fj) this).field_m > 0) {
                      sp.field_b = (-bn.field_b + ((fj) this).field_m) / 2;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
            } else {
              L2: {
                var3 = ((fj) this).field_x;
                if (0.0f < ((fj) this).field_v) {
                  var4 = (int)(((fj) this).field_v * (float)var3 + 0.5f);
                  if (var2 < var4) {
                    var3 = (int)((float)var2 / ((fj) this).field_v);
                    break L2;
                  } else {
                    if (var4 < var2) {
                      var2 = var4;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                if (bn.field_b != var2) {
                  ((fj) this).field_k.a(var3, -32263, var2);
                  break L3;
                } else {
                  if (dt.field_a != var3) {
                    ((fj) this).field_k.a(var3, -32263, var2);
                    break L3;
                  } else {
                    if (((fj) this).field_m <= 0) {
                      return;
                    } else {
                      sp.field_b = (-bn.field_b + ((fj) this).field_m) / 2;
                      return;
                    }
                  }
                }
              }
              if (((fj) this).field_m > 0) {
                sp.field_b = (-bn.field_b + ((fj) this).field_m) / 2;
                return;
              } else {
                return;
              }
            }
          }
        } else {
          var3 = ((fj) this).field_g;
          if (!((fj) this).a((byte) 103)) {
            ((fj) this).field_h = false;
            return;
          } else {
            L4: {
              if (var2 <= ((fj) this).field_r) {
                if (var2 >= ((fj) this).field_l) {
                  break L4;
                } else {
                  var2 = ((fj) this).field_l;
                  break L4;
                }
              } else {
                var2 = ((fj) this).field_r;
                break L4;
              }
            }
            if (var3 <= ((fj) this).field_x) {
              L5: {
                if (((fj) this).field_i <= var3) {
                  break L5;
                } else {
                  var3 = ((fj) this).field_i;
                  break L5;
                }
              }
              if (0.0f < ((fj) this).field_v) {
                var4 = (int)(((fj) this).field_v * (float)var3 + 0.5f);
                if (var2 < var4) {
                  var3 = (int)((float)var2 / ((fj) this).field_v);
                  if (bn.field_b != var2) {
                    ((fj) this).field_k.a(var3, -32263, var2);
                    if (((fj) this).field_m <= 0) {
                      return;
                    } else {
                      sp.field_b = (-bn.field_b + ((fj) this).field_m) / 2;
                      return;
                    }
                  } else {
                    if (dt.field_a == var3) {
                      if (((fj) this).field_m <= 0) {
                        return;
                      } else {
                        sp.field_b = (-bn.field_b + ((fj) this).field_m) / 2;
                        return;
                      }
                    } else {
                      ((fj) this).field_k.a(var3, -32263, var2);
                      if (((fj) this).field_m <= 0) {
                        return;
                      } else {
                        sp.field_b = (-bn.field_b + ((fj) this).field_m) / 2;
                        return;
                      }
                    }
                  }
                } else {
                  if (var4 < var2) {
                    L6: {
                      var2 = var4;
                      if (bn.field_b != var2) {
                        ((fj) this).field_k.a(var3, -32263, var2);
                        break L6;
                      } else {
                        if (dt.field_a == var3) {
                          break L6;
                        } else {
                          ((fj) this).field_k.a(var3, -32263, var2);
                          break L6;
                        }
                      }
                    }
                    if (((fj) this).field_m <= 0) {
                      return;
                    } else {
                      sp.field_b = (-bn.field_b + ((fj) this).field_m) / 2;
                      return;
                    }
                  } else {
                    L7: {
                      if (bn.field_b != var2) {
                        ((fj) this).field_k.a(var3, -32263, var2);
                        break L7;
                      } else {
                        if (dt.field_a == var3) {
                          break L7;
                        } else {
                          ((fj) this).field_k.a(var3, -32263, var2);
                          break L7;
                        }
                      }
                    }
                    if (((fj) this).field_m <= 0) {
                      return;
                    } else {
                      sp.field_b = (-bn.field_b + ((fj) this).field_m) / 2;
                      return;
                    }
                  }
                }
              } else {
                L8: {
                  if (bn.field_b != var2) {
                    ((fj) this).field_k.a(var3, -32263, var2);
                    break L8;
                  } else {
                    if (dt.field_a == var3) {
                      break L8;
                    } else {
                      ((fj) this).field_k.a(var3, -32263, var2);
                      break L8;
                    }
                  }
                }
                if (((fj) this).field_m <= 0) {
                  return;
                } else {
                  sp.field_b = (-bn.field_b + ((fj) this).field_m) / 2;
                  return;
                }
              }
            } else {
              L9: {
                var3 = ((fj) this).field_x;
                if (0.0f < ((fj) this).field_v) {
                  var4 = (int)(((fj) this).field_v * (float)var3 + 0.5f);
                  if (var2 < var4) {
                    var3 = (int)((float)var2 / ((fj) this).field_v);
                    break L9;
                  } else {
                    if (var4 < var2) {
                      var2 = var4;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                } else {
                  break L9;
                }
              }
              L10: {
                if (bn.field_b != var2) {
                  ((fj) this).field_k.a(var3, -32263, var2);
                  break L10;
                } else {
                  if (dt.field_a == var3) {
                    break L10;
                  } else {
                    ((fj) this).field_k.a(var3, -32263, var2);
                    break L10;
                  }
                }
              }
              if (((fj) this).field_m <= 0) {
                return;
              } else {
                sp.field_b = (-bn.field_b + ((fj) this).field_m) / 2;
                return;
              }
            }
          }
        }
    }

    private fj(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, ok param8) {
        try {
            ((fj) this).field_v = 0.0f;
            ((fj) this).field_k = param8;
            ((fj) this).field_t = param4;
            ((fj) this).field_x = param3;
            ((fj) this).field_r = param2;
            ((fj) this).field_s = param5;
            ((fj) this).field_l = param0;
            ((fj) this).field_b = param7;
            ((fj) this).field_i = param1;
            ((fj) this).field_f = 640;
            ((fj) this).field_n = 480;
            ((fj) this).field_h = false;
            ((fj) this).field_o = param6;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "fj.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Back";
        field_w = "More memory is required to run in different resolutions. Try updating your version of Java or changing your Java settings.";
        field_q = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_u = "Spells of great power to cause harm to your enemies.";
    }
}
