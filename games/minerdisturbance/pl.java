/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl {
    private int field_p;
    private int field_g;
    static int field_c;
    static int field_h;
    private int field_e;
    private int field_d;
    private int field_u;
    private float field_i;
    private int field_w;
    static String field_a;
    private int field_o;
    private int field_t;
    private int field_f;
    private int field_v;
    private int field_r;
    private int field_j;
    private int field_q;
    private boolean field_n;
    static int[] field_b;
    private mi field_l;
    private int field_s;
    static ea field_k;
    private int field_m;

    final void b(int param0) {
        if (param0 > -81) {
          ((pl) this).field_p = 8;
          ((pl) this).field_l.a(((pl) this).field_e, (byte) -64, ((pl) this).field_q);
          return;
        } else {
          ((pl) this).field_l.a(((pl) this).field_e, (byte) -64, ((pl) this).field_q);
          return;
        }
    }

    final void a(boolean param0, int param1, int param2) {
        if (param0) {
          boolean discarded$2 = ((pl) this).d(90);
          ((pl) this).field_r = param2;
          ((pl) this).field_d = param1;
          return;
        } else {
          ((pl) this).field_r = param2;
          ((pl) this).field_d = param1;
          return;
        }
    }

    final l a(byte param0) {
        l var2 = null;
        if (param0 != -70) {
          L0: {
            this.a(71);
            ((pl) this).field_e = ml.field_a;
            ((pl) this).field_q = nk.field_x;
            ((pl) this).field_l.a(((pl) this).field_j, (byte) -53, ((pl) this).field_u);
            fa.field_a = false;
            var2 = pe.a((byte) -89, ((pl) this).field_u, 0, ((pl) this).field_j, 0, qa.field_a);
            if (var2 == null) {
              ((pl) this).b(-123);
              break L0;
            } else {
              break L0;
            }
          }
          return var2;
        } else {
          L1: {
            ((pl) this).field_e = ml.field_a;
            ((pl) this).field_q = nk.field_x;
            ((pl) this).field_l.a(((pl) this).field_j, (byte) -53, ((pl) this).field_u);
            fa.field_a = false;
            var2 = pe.a((byte) -89, ((pl) this).field_u, 0, ((pl) this).field_j, 0, qa.field_a);
            if (var2 == null) {
              ((pl) this).b(-123);
              break L1;
            } else {
              break L1;
            }
          }
          return var2;
        }
    }

    final boolean d(int param0) {
        if (param0 < -116) {
          if (ec.field_e >= ((pl) this).field_s) {
            if (-1 >= pj.field_a) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_h = 12;
          if (ec.field_e >= ((pl) this).field_s) {
            if (-1 <= pj.field_a) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = MinerDisturbance.field_ab;
        var2 = ((pl) this).field_r;
        if (param0 != 2) {
          ((pl) this).field_f = 95;
          var3 = ((pl) this).field_d;
          if (((pl) this).d(-122)) {
            L0: {
              if (((pl) this).field_p >= var2) {
                if (var2 >= ((pl) this).field_w) {
                  break L0;
                } else {
                  var2 = ((pl) this).field_w;
                  break L0;
                }
              } else {
                var2 = ((pl) this).field_p;
                break L0;
              }
            }
            L1: {
              if (((pl) this).field_f < var3) {
                var3 = ((pl) this).field_f;
                break L1;
              } else {
                if (((pl) this).field_g > var3) {
                  var3 = ((pl) this).field_g;
                  if (0.0f < ((pl) this).field_i) {
                    L2: {
                      var4 = (int)(0.5f + (float)var3 * ((pl) this).field_i);
                      if (var4 <= var2) {
                        if (var4 >= var2) {
                          break L2;
                        } else {
                          var2 = var4;
                          break L2;
                        }
                      } else {
                        var3 = (int)((float)var2 / ((pl) this).field_i);
                        break L2;
                      }
                    }
                    L3: {
                      if (nk.field_x != var2) {
                        ((pl) this).field_l.a(var3, (byte) -82, var2);
                        break L3;
                      } else {
                        if (ml.field_a != var3) {
                          ((pl) this).field_l.a(var3, (byte) -82, var2);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (((pl) this).field_r <= 0) {
                      return;
                    } else {
                      tg.field_f = (((pl) this).field_r + -nk.field_x) / 2;
                      return;
                    }
                  } else {
                    L4: {
                      if (nk.field_x != var2) {
                        ((pl) this).field_l.a(var3, (byte) -82, var2);
                        break L4;
                      } else {
                        if (ml.field_a != var3) {
                          ((pl) this).field_l.a(var3, (byte) -82, var2);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (((pl) this).field_r <= 0) {
                        break L5;
                      } else {
                        tg.field_f = (((pl) this).field_r + -nk.field_x) / 2;
                        break L5;
                      }
                    }
                    return;
                  }
                } else {
                  break L1;
                }
              }
            }
            if (0.0f < ((pl) this).field_i) {
              var4 = (int)(0.5f + (float)var3 * ((pl) this).field_i);
              if (var4 <= var2) {
                L6: {
                  if (var4 >= var2) {
                    break L6;
                  } else {
                    var2 = var4;
                    break L6;
                  }
                }
                if (nk.field_x != var2) {
                  ((pl) this).field_l.a(var3, (byte) -82, var2);
                  if (((pl) this).field_r > 0) {
                    tg.field_f = (((pl) this).field_r + -nk.field_x) / 2;
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (ml.field_a != var3) {
                    ((pl) this).field_l.a(var3, (byte) -82, var2);
                    if (((pl) this).field_r <= 0) {
                      return;
                    } else {
                      tg.field_f = (((pl) this).field_r + -nk.field_x) / 2;
                      return;
                    }
                  } else {
                    if (((pl) this).field_r <= 0) {
                      return;
                    } else {
                      tg.field_f = (((pl) this).field_r + -nk.field_x) / 2;
                      return;
                    }
                  }
                }
              } else {
                var3 = (int)((float)var2 / ((pl) this).field_i);
                if (nk.field_x == var2) {
                  if (ml.field_a == var3) {
                    if (((pl) this).field_r > 0) {
                      tg.field_f = (((pl) this).field_r + -nk.field_x) / 2;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    L7: {
                      ((pl) this).field_l.a(var3, (byte) -82, var2);
                      if (((pl) this).field_r <= 0) {
                        break L7;
                      } else {
                        tg.field_f = (((pl) this).field_r + -nk.field_x) / 2;
                        break L7;
                      }
                    }
                    return;
                  }
                } else {
                  L8: {
                    ((pl) this).field_l.a(var3, (byte) -82, var2);
                    if (((pl) this).field_r <= 0) {
                      break L8;
                    } else {
                      tg.field_f = (((pl) this).field_r + -nk.field_x) / 2;
                      break L8;
                    }
                  }
                  return;
                }
              }
            } else {
              if (nk.field_x != var2) {
                ((pl) this).field_l.a(var3, (byte) -82, var2);
                if (((pl) this).field_r > 0) {
                  tg.field_f = (((pl) this).field_r + -nk.field_x) / 2;
                  return;
                } else {
                  return;
                }
              } else {
                if (ml.field_a != var3) {
                  ((pl) this).field_l.a(var3, (byte) -82, var2);
                  if (((pl) this).field_r > 0) {
                    tg.field_f = (((pl) this).field_r + -nk.field_x) / 2;
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (((pl) this).field_r > 0) {
                    tg.field_f = (((pl) this).field_r + -nk.field_x) / 2;
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          } else {
            ((pl) this).field_n = false;
            return;
          }
        } else {
          var3 = ((pl) this).field_d;
          if (((pl) this).d(-122)) {
            L9: {
              if (((pl) this).field_p >= var2) {
                if (var2 >= ((pl) this).field_w) {
                  break L9;
                } else {
                  var2 = ((pl) this).field_w;
                  break L9;
                }
              } else {
                var2 = ((pl) this).field_p;
                break L9;
              }
            }
            L10: {
              if (((pl) this).field_f < var3) {
                var3 = ((pl) this).field_f;
                break L10;
              } else {
                if (((pl) this).field_g > var3) {
                  L11: {
                    var3 = ((pl) this).field_g;
                    if (0.0f >= ((pl) this).field_i) {
                      break L11;
                    } else {
                      var4 = (int)(0.5f + (float)var3 * ((pl) this).field_i);
                      if (var4 <= var2) {
                        if (var4 >= var2) {
                          break L11;
                        } else {
                          var2 = var4;
                          break L11;
                        }
                      } else {
                        var3 = (int)((float)var2 / ((pl) this).field_i);
                        break L11;
                      }
                    }
                  }
                  L12: {
                    if (nk.field_x != var2) {
                      ((pl) this).field_l.a(var3, (byte) -82, var2);
                      break L12;
                    } else {
                      if (ml.field_a != var3) {
                        ((pl) this).field_l.a(var3, (byte) -82, var2);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                  }
                  L13: {
                    if (((pl) this).field_r <= 0) {
                      break L13;
                    } else {
                      tg.field_f = (((pl) this).field_r + -nk.field_x) / 2;
                      break L13;
                    }
                  }
                  return;
                } else {
                  break L10;
                }
              }
            }
            L14: {
              if (0.0f >= ((pl) this).field_i) {
                break L14;
              } else {
                var4 = (int)(0.5f + (float)var3 * ((pl) this).field_i);
                if (var4 <= var2) {
                  if (var4 >= var2) {
                    break L14;
                  } else {
                    var2 = var4;
                    break L14;
                  }
                } else {
                  L15: {
                    var3 = (int)((float)var2 / ((pl) this).field_i);
                    if (nk.field_x != var2) {
                      ((pl) this).field_l.a(var3, (byte) -82, var2);
                      break L15;
                    } else {
                      if (ml.field_a != var3) {
                        ((pl) this).field_l.a(var3, (byte) -82, var2);
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                  }
                  L16: {
                    if (((pl) this).field_r <= 0) {
                      break L16;
                    } else {
                      tg.field_f = (((pl) this).field_r + -nk.field_x) / 2;
                      break L16;
                    }
                  }
                  return;
                }
              }
            }
            if (nk.field_x == var2) {
              if (ml.field_a == var3) {
                L17: {
                  if (((pl) this).field_r <= 0) {
                    break L17;
                  } else {
                    tg.field_f = (((pl) this).field_r + -nk.field_x) / 2;
                    break L17;
                  }
                }
                return;
              } else {
                L18: {
                  ((pl) this).field_l.a(var3, (byte) -82, var2);
                  if (((pl) this).field_r <= 0) {
                    break L18;
                  } else {
                    tg.field_f = (((pl) this).field_r + -nk.field_x) / 2;
                    break L18;
                  }
                }
                return;
              }
            } else {
              L19: {
                ((pl) this).field_l.a(var3, (byte) -82, var2);
                if (((pl) this).field_r <= 0) {
                  break L19;
                } else {
                  tg.field_f = (((pl) this).field_r + -nk.field_x) / 2;
                  break L19;
                }
              }
              return;
            }
          } else {
            ((pl) this).field_n = false;
            return;
          }
        }
    }

    final void c(int param0) {
        if (null != kf.field_d) {
          return;
        } else {
          if (-1 > (pj.field_a ^ -1)) {
            if (!((pl) this).field_n) {
              if (((pl) this).field_r <= nk.field_x) {
                if (0 < ((pl) this).field_r) {
                  tg.field_f = 0;
                  if (((pl) this).field_o == nk.field_x) {
                    if (ml.field_a == ((pl) this).field_t) {
                      return;
                    } else {
                      ((pl) this).field_l.a(((pl) this).field_t, (byte) -27, ((pl) this).field_o);
                      return;
                    }
                  } else {
                    ((pl) this).field_l.a(((pl) this).field_t, (byte) -27, ((pl) this).field_o);
                    return;
                  }
                } else {
                  if (((pl) this).field_o == nk.field_x) {
                    if (ml.field_a == ((pl) this).field_t) {
                      return;
                    } else {
                      ((pl) this).field_l.a(((pl) this).field_t, (byte) -27, ((pl) this).field_o);
                      return;
                    }
                  } else {
                    ((pl) this).field_l.a(((pl) this).field_t, (byte) -27, ((pl) this).field_o);
                    return;
                  }
                }
              } else {
                tg.field_f = (-nk.field_x + ((pl) this).field_r) / 2;
                if (((pl) this).field_o == nk.field_x) {
                  if (ml.field_a == ((pl) this).field_t) {
                    return;
                  } else {
                    ((pl) this).field_l.a(((pl) this).field_t, (byte) -27, ((pl) this).field_o);
                    return;
                  }
                } else {
                  ((pl) this).field_l.a(((pl) this).field_t, (byte) -27, ((pl) this).field_o);
                  return;
                }
              }
            } else {
              int fieldTemp$2 = ((pl) this).field_m - 1;
              ((pl) this).field_m = ((pl) this).field_m - 1;
              if (-1 <= (fieldTemp$2 ^ -1)) {
                if (param0 == 565) {
                  ((pl) this).field_m = ((pl) this).field_v;
                  if (ec.field_e < ((pl) this).field_s) {
                    ((pl) this).field_n = false;
                    return;
                  } else {
                    this.a(2);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            ((pl) this).field_n = false;
            if (!((pl) this).field_n) {
              L0: {
                if (((pl) this).field_r <= nk.field_x) {
                  if (0 < ((pl) this).field_r) {
                    tg.field_f = 0;
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  tg.field_f = (-nk.field_x + ((pl) this).field_r) / 2;
                  break L0;
                }
              }
              L1: {
                if (((pl) this).field_o != nk.field_x) {
                  ((pl) this).field_l.a(((pl) this).field_t, (byte) -27, ((pl) this).field_o);
                  break L1;
                } else {
                  if (ml.field_a != ((pl) this).field_t) {
                    ((pl) this).field_l.a(((pl) this).field_t, (byte) -27, ((pl) this).field_o);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              return;
            } else {
              int fieldTemp$3 = ((pl) this).field_m - 1;
              ((pl) this).field_m = ((pl) this).field_m - 1;
              if (-1 <= (fieldTemp$3 ^ -1)) {
                if (param0 == 565) {
                  ((pl) this).field_m = ((pl) this).field_v;
                  if (ec.field_e < ((pl) this).field_s) {
                    ((pl) this).field_n = false;
                    return;
                  } else {
                    this.a(2);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
    }

    final static int b(byte param0) {
        if (param0 != -116) {
            field_a = null;
            return (int)(1000000000L / rj.field_c);
        }
        return (int)(1000000000L / rj.field_c);
    }

    public static void e(int param0) {
        field_b = null;
        field_a = null;
        field_k = null;
        if (param0 != -26537) {
            pl.e(9);
        }
    }

    private pl() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
