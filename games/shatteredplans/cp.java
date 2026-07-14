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
        var2.h(param0, 255);
        var2.c(param1, (byte) -69);
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
                    if (param0 >= 35) {
                      break L2;
                    } else {
                      ((cp) this).field_j = 102;
                      break L2;
                    }
                  }
                  L3: {
                    if (0.0f >= ((cp) this).field_v) {
                      break L3;
                    } else {
                      var4 = (int)(0.5f + ((cp) this).field_v * (float)var3);
                      if (var4 > var2) {
                        var3 = (int)((float)var2 / ((cp) this).field_v);
                        break L3;
                      } else {
                        if (var2 <= var4) {
                          break L3;
                        } else {
                          var2 = var4;
                          break L3;
                        }
                      }
                    }
                  }
                  if (me.field_e != var2) {
                    ((cp) this).field_s.a(var3, var2, -12725);
                    L4: {
                      if (((cp) this).field_c > 0) {
                        gs.field_k = (-me.field_e + ((cp) this).field_c) / 2;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    return;
                  } else {
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
                  }
                }
              }
            }
            if (param0 >= 35) {
              L7: {
                if (0.0f >= ((cp) this).field_v) {
                  break L7;
                } else {
                  var4 = (int)(0.5f + ((cp) this).field_v * (float)var3);
                  if (var4 > var2) {
                    var3 = (int)((float)var2 / ((cp) this).field_v);
                    break L7;
                  } else {
                    if (var2 <= var4) {
                      break L7;
                    } else {
                      var2 = var4;
                      if (me.field_e == var2) {
                        if (nn.field_b != var3) {
                          L8: {
                            ((cp) this).field_s.a(var3, var2, -12725);
                            if (((cp) this).field_c > 0) {
                              gs.field_k = (-me.field_e + ((cp) this).field_c) / 2;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          return;
                        } else {
                          L9: {
                            if (((cp) this).field_c > 0) {
                              gs.field_k = (-me.field_e + ((cp) this).field_c) / 2;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          return;
                        }
                      } else {
                        L10: {
                          ((cp) this).field_s.a(var3, var2, -12725);
                          if (((cp) this).field_c > 0) {
                            gs.field_k = (-me.field_e + ((cp) this).field_c) / 2;
                            break L10;
                          } else {
                            break L10;
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
                } else {
                  L12: {
                    if (((cp) this).field_c > 0) {
                      gs.field_k = (-me.field_e + ((cp) this).field_c) / 2;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  return;
                }
              } else {
                L13: {
                  ((cp) this).field_s.a(var3, var2, -12725);
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
                ((cp) this).field_j = 102;
                if (0.0f >= ((cp) this).field_v) {
                  break L14;
                } else {
                  var4 = (int)(0.5f + ((cp) this).field_v * (float)var3);
                  if (var4 > var2) {
                    var3 = (int)((float)var2 / ((cp) this).field_v);
                    break L14;
                  } else {
                    if (var2 <= var4) {
                      break L14;
                    } else {
                      L15: {
                        var2 = var4;
                        if (me.field_e != var2) {
                          ((cp) this).field_s.a(var3, var2, -12725);
                          break L15;
                        } else {
                          if (nn.field_b == var3) {
                            break L15;
                          } else {
                            ((cp) this).field_s.a(var3, var2, -12725);
                            break L15;
                          }
                        }
                      }
                      L16: {
                        if (((cp) this).field_c > 0) {
                          gs.field_k = (-me.field_e + ((cp) this).field_c) / 2;
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                      return;
                    }
                  }
                }
              }
              if (me.field_e == var2) {
                if (nn.field_b != var3) {
                  L17: {
                    ((cp) this).field_s.a(var3, var2, -12725);
                    if (((cp) this).field_c > 0) {
                      gs.field_k = (-me.field_e + ((cp) this).field_c) / 2;
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  return;
                } else {
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
              } else {
                L19: {
                  ((cp) this).field_s.a(var3, var2, -12725);
                  if (((cp) this).field_c > 0) {
                    gs.field_k = (-me.field_e + ((cp) this).field_c) / 2;
                    break L19;
                  } else {
                    break L19;
                  }
                }
                return;
              }
            }
          } else {
            L20: {
              var2 = ((cp) this).field_d;
              if (var3 > ((cp) this).field_j) {
                var3 = ((cp) this).field_j;
                break L20;
              } else {
                if (var3 < ((cp) this).field_r) {
                  var3 = ((cp) this).field_r;
                  break L20;
                } else {
                  L21: {
                    if (param0 >= 35) {
                      break L21;
                    } else {
                      ((cp) this).field_j = 102;
                      break L21;
                    }
                  }
                  L22: {
                    if (0.0f >= ((cp) this).field_v) {
                      break L22;
                    } else {
                      var4 = (int)(0.5f + ((cp) this).field_v * (float)var3);
                      if (var4 > var2) {
                        var3 = (int)((float)var2 / ((cp) this).field_v);
                        break L22;
                      } else {
                        if (var2 <= var4) {
                          break L22;
                        } else {
                          var2 = var4;
                          break L22;
                        }
                      }
                    }
                  }
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
            }
            if (param0 >= 35) {
              L25: {
                if (0.0f >= ((cp) this).field_v) {
                  break L25;
                } else {
                  var4 = (int)(0.5f + ((cp) this).field_v * (float)var3);
                  if (var4 > var2) {
                    var3 = (int)((float)var2 / ((cp) this).field_v);
                    break L25;
                  } else {
                    if (var2 <= var4) {
                      break L25;
                    } else {
                      var2 = var4;
                      break L25;
                    }
                  }
                }
              }
              L26: {
                if (me.field_e != var2) {
                  ((cp) this).field_s.a(var3, var2, -12725);
                  break L26;
                } else {
                  if (nn.field_b == var3) {
                    break L26;
                  } else {
                    ((cp) this).field_s.a(var3, var2, -12725);
                    break L26;
                  }
                }
              }
              L27: {
                if (((cp) this).field_c > 0) {
                  gs.field_k = (-me.field_e + ((cp) this).field_c) / 2;
                  break L27;
                } else {
                  break L27;
                }
              }
              return;
            } else {
              L28: {
                ((cp) this).field_j = 102;
                if (0.0f >= ((cp) this).field_v) {
                  break L28;
                } else {
                  var4 = (int)(0.5f + ((cp) this).field_v * (float)var3);
                  if (var4 > var2) {
                    var3 = (int)((float)var2 / ((cp) this).field_v);
                    break L28;
                  } else {
                    if (var2 <= var4) {
                      break L28;
                    } else {
                      var2 = var4;
                      break L28;
                    }
                  }
                }
              }
              L29: {
                if (me.field_e != var2) {
                  ((cp) this).field_s.a(var3, var2, -12725);
                  break L29;
                } else {
                  if (nn.field_b == var3) {
                    break L29;
                  } else {
                    ((cp) this).field_s.a(var3, var2, -12725);
                    break L29;
                  }
                }
              }
              L30: {
                if (((cp) this).field_c > 0) {
                  gs.field_k = (-me.field_e + ((cp) this).field_c) / 2;
                  break L30;
                } else {
                  break L30;
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
        Object var6 = null;
        if (!param3.a(16548, param1, param4)) {
          return false;
        } else {
          if (param0 != 0) {
            var6 = null;
            boolean discarded$2 = cp.a(-93, -33, (int[]) null, (bh) null, 124);
            return aj.a(1, param4, param1, param2);
          } else {
            return aj.a(1, param4, param1, param2);
          }
        }
    }

    public static void b(boolean param0) {
        if (param0) {
            field_a = null;
            field_t = null;
            field_a = null;
            return;
        }
        field_t = null;
        field_a = null;
    }

    final void a(boolean param0) {
        if (bj.field_K == null) {
          L0: {
            if (-1 <= (es.field_m ^ -1)) {
              ((cp) this).field_b = false;
              break L0;
            } else {
              break L0;
            }
          }
          if (((cp) this).field_b) {
            ((cp) this).field_i = ((cp) this).field_i - 1;
            if (0 < ((cp) this).field_i - 1) {
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
