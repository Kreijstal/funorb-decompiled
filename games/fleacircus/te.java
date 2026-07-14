/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te {
    private boolean field_b;
    dd field_c;
    static String field_i;
    private int field_f;
    private int field_h;
    private int field_a;
    private int field_e;
    dd[] field_g;
    private int field_d;

    final void a(int param0) {
        ((te) this).field_e = -1;
        ((te) this).field_d = 0;
        ((te) this).field_a = 0;
        ((te) this).field_f = 256;
        ((te) this).field_h = param0;
        ((te) this).field_c = null;
        ((te) this).field_g = null;
    }

    final te c(int param0, int param1) {
        ((te) this).field_a = param1;
        if (param0 < 103) {
            ((te) this).field_c = null;
            return (te) this;
        }
        return (te) this;
    }

    final te a(int param0, int param1) {
        ((te) this).field_e = param0;
        if (param1 < 111) {
            field_i = null;
            return (te) this;
        }
        return (te) this;
    }

    final te a(int param0, byte param1) {
        if (param1 != -75) {
            return null;
        }
        ((te) this).field_d = param0;
        return (te) this;
    }

    final void a(hb param0, qa param1, int param2, int param3, int param4) {
        int var6_int = 0;
        String var6 = null;
        int var7 = 0;
        fa stackIn_21_0 = null;
        String stackIn_21_1 = null;
        fa stackIn_22_0 = null;
        String stackIn_22_1 = null;
        fa stackIn_23_0 = null;
        String stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        fa stackIn_24_0 = null;
        String stackIn_24_1 = null;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        int stackIn_24_4 = 0;
        fa stackIn_25_0 = null;
        String stackIn_25_1 = null;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_25_4 = 0;
        fa stackIn_26_0 = null;
        String stackIn_26_1 = null;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        int stackIn_26_4 = 0;
        int stackIn_26_5 = 0;
        fa stackIn_27_0 = null;
        String stackIn_27_1 = null;
        int stackIn_27_2 = 0;
        int stackIn_27_3 = 0;
        int stackIn_27_4 = 0;
        int stackIn_27_5 = 0;
        int stackIn_27_6 = 0;
        int stackIn_27_7 = 0;
        fa stackIn_28_0 = null;
        String stackIn_28_1 = null;
        int stackIn_28_2 = 0;
        int stackIn_28_3 = 0;
        int stackIn_28_4 = 0;
        int stackIn_28_5 = 0;
        int stackIn_28_6 = 0;
        int stackIn_28_7 = 0;
        fa stackIn_29_0 = null;
        String stackIn_29_1 = null;
        int stackIn_29_2 = 0;
        int stackIn_29_3 = 0;
        int stackIn_29_4 = 0;
        int stackIn_29_5 = 0;
        int stackIn_29_6 = 0;
        int stackIn_29_7 = 0;
        int stackIn_29_8 = 0;
        fa stackOut_20_0 = null;
        String stackOut_20_1 = null;
        fa stackOut_22_0 = null;
        String stackOut_22_1 = null;
        int stackOut_22_2 = 0;
        fa stackOut_21_0 = null;
        String stackOut_21_1 = null;
        int stackOut_21_2 = 0;
        fa stackOut_23_0 = null;
        String stackOut_23_1 = null;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        int stackOut_23_4 = 0;
        fa stackOut_25_0 = null;
        String stackOut_25_1 = null;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        int stackOut_25_4 = 0;
        int stackOut_25_5 = 0;
        fa stackOut_24_0 = null;
        String stackOut_24_1 = null;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        int stackOut_24_4 = 0;
        int stackOut_24_5 = 0;
        fa stackOut_26_0 = null;
        String stackOut_26_1 = null;
        int stackOut_26_2 = 0;
        int stackOut_26_3 = 0;
        int stackOut_26_4 = 0;
        int stackOut_26_5 = 0;
        int stackOut_26_6 = 0;
        int stackOut_26_7 = 0;
        fa stackOut_28_0 = null;
        String stackOut_28_1 = null;
        int stackOut_28_2 = 0;
        int stackOut_28_3 = 0;
        int stackOut_28_4 = 0;
        int stackOut_28_5 = 0;
        int stackOut_28_6 = 0;
        int stackOut_28_7 = 0;
        int stackOut_28_8 = 0;
        fa stackOut_27_0 = null;
        String stackOut_27_1 = null;
        int stackOut_27_2 = 0;
        int stackOut_27_3 = 0;
        int stackOut_27_4 = 0;
        int stackOut_27_5 = 0;
        int stackOut_27_6 = 0;
        int stackOut_27_7 = 0;
        int stackOut_27_8 = 0;
        L0: {
          og.a(param1.field_z + param3, ((te) this).field_g, -113, param4 + param1.field_y, param1.field_j, param1.field_u);
          if (((te) this).field_c != null) {
            L1: {
              var6_int = param4 - -param1.field_y - -((te) this).field_h;
              var7 = ((te) this).field_a + (param1.field_z + param3);
              if (1 == param0.field_i) {
                var6_int = var6_int + (-((te) this).field_c.field_x + param1.field_u) / 2;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (-2 == (param0.field_h ^ -1)) {
                var7 = var7 + (-((te) this).field_c.field_r + param1.field_j) / 2;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param0.field_i != 2) {
                break L3;
              } else {
                var6_int = var6_int + (param1.field_u - ((te) this).field_c.field_x);
                break L3;
              }
            }
            L4: {
              if (2 != param0.field_h) {
                break L4;
              } else {
                var7 = var7 + (param1.field_j + -((te) this).field_c.field_r);
                break L4;
              }
            }
            ((te) this).field_c.d(var6_int, var7);
            break L0;
          } else {
            break L0;
          }
        }
        var6 = param0.c(35, param1);
        if (param2 == 0) {
          if (var6 != null) {
            if (param0.field_j != null) {
              if (-1 < ((te) this).field_d) {
                return;
              } else {
                L5: {
                  stackOut_20_0 = param0.field_j;
                  stackOut_20_1 = (String) var6;
                  stackIn_22_0 = stackOut_20_0;
                  stackIn_22_1 = stackOut_20_1;
                  stackIn_21_0 = stackOut_20_0;
                  stackIn_21_1 = stackOut_20_1;
                  if (2147483647 != ((te) this).field_h) {
                    stackOut_22_0 = (fa) (Object) stackIn_22_0;
                    stackOut_22_1 = (String) (Object) stackIn_22_1;
                    stackOut_22_2 = ((te) this).field_h;
                    stackIn_23_0 = stackOut_22_0;
                    stackIn_23_1 = stackOut_22_1;
                    stackIn_23_2 = stackOut_22_2;
                    break L5;
                  } else {
                    stackOut_21_0 = (fa) (Object) stackIn_21_0;
                    stackOut_21_1 = (String) (Object) stackIn_21_1;
                    stackOut_21_2 = 0;
                    stackIn_23_0 = stackOut_21_0;
                    stackIn_23_1 = stackOut_21_1;
                    stackIn_23_2 = stackOut_21_2;
                    break L5;
                  }
                }
                L6: {
                  stackOut_23_0 = (fa) (Object) stackIn_23_0;
                  stackOut_23_1 = (String) (Object) stackIn_23_1;
                  stackOut_23_2 = stackIn_23_2 + param0.field_n + (param4 + param1.field_y);
                  stackOut_23_3 = param3 + param1.field_z;
                  stackOut_23_4 = param0.field_m;
                  stackIn_25_0 = stackOut_23_0;
                  stackIn_25_1 = stackOut_23_1;
                  stackIn_25_2 = stackOut_23_2;
                  stackIn_25_3 = stackOut_23_3;
                  stackIn_25_4 = stackOut_23_4;
                  stackIn_24_0 = stackOut_23_0;
                  stackIn_24_1 = stackOut_23_1;
                  stackIn_24_2 = stackOut_23_2;
                  stackIn_24_3 = stackOut_23_3;
                  stackIn_24_4 = stackOut_23_4;
                  if (-2147483648 == ((te) this).field_a) {
                    stackOut_25_0 = (fa) (Object) stackIn_25_0;
                    stackOut_25_1 = (String) (Object) stackIn_25_1;
                    stackOut_25_2 = stackIn_25_2;
                    stackOut_25_3 = stackIn_25_3;
                    stackOut_25_4 = stackIn_25_4;
                    stackOut_25_5 = 0;
                    stackIn_26_0 = stackOut_25_0;
                    stackIn_26_1 = stackOut_25_1;
                    stackIn_26_2 = stackOut_25_2;
                    stackIn_26_3 = stackOut_25_3;
                    stackIn_26_4 = stackOut_25_4;
                    stackIn_26_5 = stackOut_25_5;
                    break L6;
                  } else {
                    stackOut_24_0 = (fa) (Object) stackIn_24_0;
                    stackOut_24_1 = (String) (Object) stackIn_24_1;
                    stackOut_24_2 = stackIn_24_2;
                    stackOut_24_3 = stackIn_24_3;
                    stackOut_24_4 = stackIn_24_4;
                    stackOut_24_5 = ((te) this).field_a;
                    stackIn_26_0 = stackOut_24_0;
                    stackIn_26_1 = stackOut_24_1;
                    stackIn_26_2 = stackOut_24_2;
                    stackIn_26_3 = stackOut_24_3;
                    stackIn_26_4 = stackOut_24_4;
                    stackIn_26_5 = stackOut_24_5;
                    break L6;
                  }
                }
                L7: {
                  stackOut_26_0 = (fa) (Object) stackIn_26_0;
                  stackOut_26_1 = (String) (Object) stackIn_26_1;
                  stackOut_26_2 = stackIn_26_2;
                  stackOut_26_3 = stackIn_26_3 + (stackIn_26_4 + stackIn_26_5);
                  stackOut_26_4 = -param0.field_o + (-param0.field_n + param1.field_u);
                  stackOut_26_5 = -param0.field_k + -param0.field_m + param1.field_j;
                  stackOut_26_6 = ((te) this).field_d;
                  stackOut_26_7 = ((te) this).field_e;
                  stackIn_28_0 = stackOut_26_0;
                  stackIn_28_1 = stackOut_26_1;
                  stackIn_28_2 = stackOut_26_2;
                  stackIn_28_3 = stackOut_26_3;
                  stackIn_28_4 = stackOut_26_4;
                  stackIn_28_5 = stackOut_26_5;
                  stackIn_28_6 = stackOut_26_6;
                  stackIn_28_7 = stackOut_26_7;
                  stackIn_27_0 = stackOut_26_0;
                  stackIn_27_1 = stackOut_26_1;
                  stackIn_27_2 = stackOut_26_2;
                  stackIn_27_3 = stackOut_26_3;
                  stackIn_27_4 = stackOut_26_4;
                  stackIn_27_5 = stackOut_26_5;
                  stackIn_27_6 = stackOut_26_6;
                  stackIn_27_7 = stackOut_26_7;
                  if (2147483647 != (((te) this).field_f ^ -1)) {
                    stackOut_28_0 = (fa) (Object) stackIn_28_0;
                    stackOut_28_1 = (String) (Object) stackIn_28_1;
                    stackOut_28_2 = stackIn_28_2;
                    stackOut_28_3 = stackIn_28_3;
                    stackOut_28_4 = stackIn_28_4;
                    stackOut_28_5 = stackIn_28_5;
                    stackOut_28_6 = stackIn_28_6;
                    stackOut_28_7 = stackIn_28_7;
                    stackOut_28_8 = ((te) this).field_f;
                    stackIn_29_0 = stackOut_28_0;
                    stackIn_29_1 = stackOut_28_1;
                    stackIn_29_2 = stackOut_28_2;
                    stackIn_29_3 = stackOut_28_3;
                    stackIn_29_4 = stackOut_28_4;
                    stackIn_29_5 = stackOut_28_5;
                    stackIn_29_6 = stackOut_28_6;
                    stackIn_29_7 = stackOut_28_7;
                    stackIn_29_8 = stackOut_28_8;
                    break L7;
                  } else {
                    stackOut_27_0 = (fa) (Object) stackIn_27_0;
                    stackOut_27_1 = (String) (Object) stackIn_27_1;
                    stackOut_27_2 = stackIn_27_2;
                    stackOut_27_3 = stackIn_27_3;
                    stackOut_27_4 = stackIn_27_4;
                    stackOut_27_5 = stackIn_27_5;
                    stackOut_27_6 = stackIn_27_6;
                    stackOut_27_7 = stackIn_27_7;
                    stackOut_27_8 = 256;
                    stackIn_29_0 = stackOut_27_0;
                    stackIn_29_1 = stackOut_27_1;
                    stackIn_29_2 = stackOut_27_2;
                    stackIn_29_3 = stackOut_27_3;
                    stackIn_29_4 = stackOut_27_4;
                    stackIn_29_5 = stackOut_27_5;
                    stackIn_29_6 = stackOut_27_6;
                    stackIn_29_7 = stackOut_27_7;
                    stackIn_29_8 = stackOut_27_8;
                    break L7;
                  }
                }
                int discarded$1 = ((fa) (Object) stackIn_29_0).a(stackIn_29_1, stackIn_29_2, stackIn_29_3, stackIn_29_4, stackIn_29_5, stackIn_29_6, stackIn_29_7, stackIn_29_8, param0.field_i, param0.field_h, param0.field_d);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final te a(boolean param0, dd[] param1) {
        Object var4 = null;
        if (!param0) {
          var4 = null;
          ((te) this).a((te) null, 57);
          ((te) this).field_g = param1;
          return (te) this;
        } else {
          ((te) this).field_g = param1;
          return (te) this;
        }
    }

    public static void a(boolean param0) {
        field_i = null;
        if (param0) {
            te.a(false);
        }
    }

    final void a(te param0, int param1, qa param2, hb param3, int param4, int param5) {
        L0: {
          if (((te) this).field_b) {
            param0.a(param3, param2, param5 + 2, param1, param4);
            param0.a(0);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (null != ((te) this).field_c) {
            param0.field_c = ((te) this).field_c;
            break L1;
          } else {
            break L1;
          }
        }
        if (-2147483648 == ((te) this).field_a) {
          if ((((te) this).field_d ^ -1) > 0) {
            L2: {
              if (((te) this).field_e <= 0) {
                param0.field_e = ((te) this).field_e;
                break L2;
              } else {
                break L2;
              }
            }
            if (param5 == -2) {
              if (2147483647 == ((te) this).field_h) {
                if (((te) this).field_g != null) {
                  L3: {
                    param0.field_g = ((te) this).field_g;
                    if (-2147483648 != ((te) this).field_f) {
                      param0.field_f = ((te) this).field_f;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  return;
                } else {
                  L4: {
                    if (-2147483648 != ((te) this).field_f) {
                      param0.field_f = ((te) this).field_f;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  return;
                }
              } else {
                param0.field_h = ((te) this).field_h;
                if (((te) this).field_g != null) {
                  L5: {
                    param0.field_g = ((te) this).field_g;
                    if (-2147483648 != ((te) this).field_f) {
                      param0.field_f = ((te) this).field_f;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  return;
                } else {
                  L6: {
                    if (-2147483648 != ((te) this).field_f) {
                      param0.field_f = ((te) this).field_f;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  return;
                }
              }
            } else {
              return;
            }
          } else {
            L7: {
              param0.field_d = ((te) this).field_d;
              if (((te) this).field_e <= 0) {
                param0.field_e = ((te) this).field_e;
                break L7;
              } else {
                break L7;
              }
            }
            if (param5 == -2) {
              if (2147483647 == ((te) this).field_h) {
                if (((te) this).field_g != null) {
                  L8: {
                    param0.field_g = ((te) this).field_g;
                    if (-2147483648 != ((te) this).field_f) {
                      param0.field_f = ((te) this).field_f;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  return;
                } else {
                  L9: {
                    if (-2147483648 != ((te) this).field_f) {
                      param0.field_f = ((te) this).field_f;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  return;
                }
              } else {
                param0.field_h = ((te) this).field_h;
                if (((te) this).field_g != null) {
                  L10: {
                    param0.field_g = ((te) this).field_g;
                    if (-2147483648 != ((te) this).field_f) {
                      param0.field_f = ((te) this).field_f;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  return;
                } else {
                  L11: {
                    if (-2147483648 != ((te) this).field_f) {
                      param0.field_f = ((te) this).field_f;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  return;
                }
              }
            } else {
              return;
            }
          }
        } else {
          param0.field_a = ((te) this).field_a;
          if ((((te) this).field_d ^ -1) <= 0) {
            L12: {
              param0.field_d = ((te) this).field_d;
              if (((te) this).field_e <= 0) {
                param0.field_e = ((te) this).field_e;
                break L12;
              } else {
                break L12;
              }
            }
            if (param5 == -2) {
              if (2147483647 != ((te) this).field_h) {
                param0.field_h = ((te) this).field_h;
                if (((te) this).field_g != null) {
                  L13: {
                    param0.field_g = ((te) this).field_g;
                    if (-2147483648 != ((te) this).field_f) {
                      param0.field_f = ((te) this).field_f;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  return;
                } else {
                  L14: {
                    if (-2147483648 != ((te) this).field_f) {
                      param0.field_f = ((te) this).field_f;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  return;
                }
              } else {
                L15: {
                  if (((te) this).field_g == null) {
                    break L15;
                  } else {
                    param0.field_g = ((te) this).field_g;
                    break L15;
                  }
                }
                L16: {
                  if (-2147483648 != ((te) this).field_f) {
                    param0.field_f = ((te) this).field_f;
                    break L16;
                  } else {
                    break L16;
                  }
                }
                return;
              }
            } else {
              return;
            }
          } else {
            L17: {
              if (((te) this).field_e <= 0) {
                param0.field_e = ((te) this).field_e;
                break L17;
              } else {
                break L17;
              }
            }
            if (param5 != -2) {
              return;
            } else {
              L18: {
                if (2147483647 == ((te) this).field_h) {
                  break L18;
                } else {
                  param0.field_h = ((te) this).field_h;
                  break L18;
                }
              }
              L19: {
                if (((te) this).field_g == null) {
                  break L19;
                } else {
                  param0.field_g = ((te) this).field_g;
                  break L19;
                }
              }
              L20: {
                if (-2147483648 != ((te) this).field_f) {
                  param0.field_f = ((te) this).field_f;
                  break L20;
                } else {
                  break L20;
                }
              }
              return;
            }
          }
        }
    }

    final te a(boolean param0, byte param1) {
        ((te) this).field_b = param0 ? true : false;
        if (param1 > -101) {
            ((te) this).field_d = 76;
            return (te) this;
        }
        return (te) this;
    }

    final static void b(int param0, int param1) {
        int discarded$6 = fb.b(param0 ^ -92);
        if (param0 != 0) {
            field_i = null;
        }
    }

    final te a(boolean param0, int param1) {
        if (!param0) {
            ((te) this).field_e = 73;
            ((te) this).field_h = param1;
            return (te) this;
        }
        ((te) this).field_h = param1;
        return (te) this;
    }

    final void a(te param0, int param1) {
        param0.field_e = ((te) this).field_e;
        param0.field_h = ((te) this).field_h;
        param0.field_a = ((te) this).field_a;
        param0.field_b = ((te) this).field_b;
        param0.field_f = ((te) this).field_f;
        if (param1 <= 22) {
          ((te) this).a(-120);
          param0.field_g = ((te) this).field_g;
          param0.field_c = ((te) this).field_c;
          param0.field_d = ((te) this).field_d;
          return;
        } else {
          param0.field_g = ((te) this).field_g;
          param0.field_c = ((te) this).field_c;
          param0.field_d = ((te) this).field_d;
          return;
        }
    }

    te() {
        ((te) this).field_c = null;
        ((te) this).field_f = -2147483648;
        ((te) this).field_e = -2;
        ((te) this).field_a = -2147483648;
        ((te) this).field_h = -2147483648;
        ((te) this).field_b = false;
        ((te) this).field_g = null;
        ((te) this).field_d = -2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "This password contains your Player Name, and would be easy to guess";
    }
}
