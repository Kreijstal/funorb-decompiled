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
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param1 != 87) {
          L0: {
            field_j = 99;
            var2 = param0.d((byte) -121);
            if (var2 != 1) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          var3 = stackIn_8_0;
          return var3 != 0;
        } else {
          L1: {
            var2 = param0.d((byte) -121);
            if (var2 != 1) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          var3 = stackIn_4_0;
          return var3 != 0;
        }
    }

    final static char a(byte param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        if (param1 >= 108) {
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
        } else {
          pb.b(44);
          var2 = param0 & 255;
          if (var2 == 0) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
          } else {
            L2: {
              if (var2 < 128) {
                break L2;
              } else {
                if (var2 >= 160) {
                  break L2;
                } else {
                  L3: {
                    var3 = sa.field_j[-128 + var2];
                    if (0 != var3) {
                      break L3;
                    } else {
                      var3 = 63;
                      break L3;
                    }
                  }
                  var2 = var3;
                  break L2;
                }
              }
            }
            return (char)var2;
          }
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
                  if (-1 <= (((pb) this).field_i ^ -1)) {
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
                ((pb) this).field_t = ((pb) this).field_t - 1;
                if (-1 > (((pb) this).field_t - 1 ^ -1)) {
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
                  if (-1 <= (((pb) this).field_i ^ -1)) {
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
                ((pb) this).field_t = ((pb) this).field_t - 1;
                if (-1 > (((pb) this).field_t - 1 ^ -1)) {
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
        var9 = new he(param6, param7, param1, param4, param2, param3, param0);
        if (param8 <= 56) {
          return null;
        } else {
          of.field_b.a(1, (ai) (Object) var9);
          mi.a(param5, -99, var9);
          return var9;
        }
    }

    final static int c(int param0) {
        if (param0 != 0) {
            pb.a(-21);
            return ih.field_D;
        }
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
          if (-1 <= (ui.field_m ^ -1)) {
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
