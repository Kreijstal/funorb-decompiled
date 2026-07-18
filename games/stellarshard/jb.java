/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jb {
    static String field_h;
    static String field_p;
    private vb field_q;
    private int field_k;
    private int field_e;
    private int field_j;
    static int field_a;
    private int field_r;
    private int field_b;
    private int field_d;
    private float field_n;
    private int field_i;
    private int field_g;
    private int field_c;
    private int field_o;
    private int field_s;
    private int field_m;
    private int field_l;
    private boolean field_f;

    final static void a(int param0, int param1, qc param2, int param3) {
        try {
            int var4_int = 0;
            sa.field_h = param1;
            ka.field_q = param0;
            eh.field_a = param2;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "jb.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + -100 + ')');
        }
    }

    final void c(int param0) {
        if (param0 != -1) {
            return;
        }
        ((jb) this).field_q.a((byte) 71, ((jb) this).field_i, ((jb) this).field_k);
    }

    public static void a(int param0) {
        field_h = null;
        field_p = null;
    }

    final boolean d(int param0) {
        if (param0 == 2) {
          if (((jb) this).field_d <= fh.field_m) {
            if (mk.field_k <= 0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          ((jb) this).field_n = 0.2115049809217453f;
          if (((jb) this).field_d <= fh.field_m) {
            if (mk.field_k <= 0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = -2 % ((-14 - param0) / 38);
        ((jb) this).field_m = param1;
        ((jb) this).field_b = param2;
    }

    final void b(int param0) {
        if (pd.field_f != null) {
          return;
        } else {
          if (param0 == 0) {
            L0: {
              if (mk.field_k <= 0) {
                ((jb) this).field_f = false;
                break L0;
              } else {
                break L0;
              }
            }
            if (((jb) this).field_f) {
              int fieldTemp$2 = ((jb) this).field_g - 1;
              ((jb) this).field_g = ((jb) this).field_g - 1;
              if (fieldTemp$2 <= 0) {
                ((jb) this).field_g = ((jb) this).field_o;
                if (fh.field_m < ((jb) this).field_d) {
                  ((jb) this).field_f = false;
                  return;
                } else {
                  this.a((byte) -15);
                  return;
                }
              } else {
                return;
              }
            } else {
              if (((jb) this).field_m <= lk.field_j) {
                if (((jb) this).field_m > 0) {
                  fb.field_f = 0;
                  if (((jb) this).field_j == lk.field_j) {
                    if (((jb) this).field_r != td.field_d) {
                      ((jb) this).field_q.a((byte) 71, ((jb) this).field_r, ((jb) this).field_j);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    ((jb) this).field_q.a((byte) 71, ((jb) this).field_r, ((jb) this).field_j);
                    return;
                  }
                } else {
                  if (((jb) this).field_j == lk.field_j) {
                    if (((jb) this).field_r != td.field_d) {
                      ((jb) this).field_q.a((byte) 71, ((jb) this).field_r, ((jb) this).field_j);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    ((jb) this).field_q.a((byte) 71, ((jb) this).field_r, ((jb) this).field_j);
                    return;
                  }
                }
              } else {
                fb.field_f = (((jb) this).field_m + -lk.field_j) / 2;
                if (((jb) this).field_j == lk.field_j) {
                  if (((jb) this).field_r == td.field_d) {
                    return;
                  } else {
                    ((jb) this).field_q.a((byte) 71, ((jb) this).field_r, ((jb) this).field_j);
                    return;
                  }
                } else {
                  ((jb) this).field_q.a((byte) 71, ((jb) this).field_r, ((jb) this).field_j);
                  return;
                }
              }
            }
          } else {
            L1: {
              ((jb) this).field_n = -0.40444520115852356f;
              if (mk.field_k <= 0) {
                ((jb) this).field_f = false;
                break L1;
              } else {
                break L1;
              }
            }
            if (((jb) this).field_f) {
              int fieldTemp$3 = ((jb) this).field_g - 1;
              ((jb) this).field_g = ((jb) this).field_g - 1;
              if (fieldTemp$3 <= 0) {
                ((jb) this).field_g = ((jb) this).field_o;
                if (fh.field_m < ((jb) this).field_d) {
                  ((jb) this).field_f = false;
                  return;
                } else {
                  this.a((byte) -15);
                  return;
                }
              } else {
                return;
              }
            } else {
              L2: {
                if (((jb) this).field_m <= lk.field_j) {
                  if (((jb) this).field_m > 0) {
                    fb.field_f = 0;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  fb.field_f = (((jb) this).field_m + -lk.field_j) / 2;
                  break L2;
                }
              }
              if (((jb) this).field_j == lk.field_j) {
                if (((jb) this).field_r == td.field_d) {
                  return;
                } else {
                  ((jb) this).field_q.a((byte) 71, ((jb) this).field_r, ((jb) this).field_j);
                  return;
                }
              } else {
                ((jb) this).field_q.a((byte) 71, ((jb) this).field_r, ((jb) this).field_j);
                return;
              }
            }
          }
        }
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = stellarshard.field_B;
        var2 = ((jb) this).field_m;
        var3 = ((jb) this).field_b;
        if (!((jb) this).d(2)) {
          ((jb) this).field_f = false;
          return;
        } else {
          L0: {
            if (((jb) this).field_s >= var3) {
              if (((jb) this).field_l <= var3) {
                break L0;
              } else {
                var3 = ((jb) this).field_l;
                break L0;
              }
            } else {
              var3 = ((jb) this).field_s;
              break L0;
            }
          }
          L1: {
            if (var2 <= ((jb) this).field_e) {
              if (((jb) this).field_c > var2) {
                var2 = ((jb) this).field_c;
                break L1;
              } else {
                L2: {
                  if (((jb) this).field_n > 0.0f) {
                    var4 = (int)(0.5f + (float)var3 * ((jb) this).field_n);
                    if (var4 <= var2) {
                      if (var2 > var4) {
                        var2 = var4;
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      var3 = (int)((float)var2 / ((jb) this).field_n);
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                if (lk.field_j == var2) {
                  if (var3 == td.field_d) {
                    L3: {
                      if (((jb) this).field_m > 0) {
                        fb.field_f = (-lk.field_j + ((jb) this).field_m) / 2;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    return;
                  } else {
                    ((jb) this).field_q.a((byte) 71, var3, var2);
                    L4: {
                      if (((jb) this).field_m > 0) {
                        fb.field_f = (-lk.field_j + ((jb) this).field_m) / 2;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    return;
                  }
                } else {
                  ((jb) this).field_q.a((byte) 71, var3, var2);
                  L5: {
                    if (((jb) this).field_m > 0) {
                      fb.field_f = (-lk.field_j + ((jb) this).field_m) / 2;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  return;
                }
              }
            } else {
              var2 = ((jb) this).field_e;
              break L1;
            }
          }
          if (((jb) this).field_n > 0.0f) {
            var4 = (int)(0.5f + (float)var3 * ((jb) this).field_n);
            if (var4 <= var2) {
              if (var2 > var4) {
                var2 = var4;
                if (lk.field_j == var2) {
                  if (var3 != td.field_d) {
                    L6: {
                      ((jb) this).field_q.a((byte) 71, var3, var2);
                      if (((jb) this).field_m > 0) {
                        fb.field_f = (-lk.field_j + ((jb) this).field_m) / 2;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    return;
                  } else {
                    L7: {
                      if (((jb) this).field_m > 0) {
                        fb.field_f = (-lk.field_j + ((jb) this).field_m) / 2;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    return;
                  }
                } else {
                  L8: {
                    ((jb) this).field_q.a((byte) 71, var3, var2);
                    if (((jb) this).field_m > 0) {
                      fb.field_f = (-lk.field_j + ((jb) this).field_m) / 2;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  return;
                }
              } else {
                if (lk.field_j == var2) {
                  if (var3 != td.field_d) {
                    L9: {
                      ((jb) this).field_q.a((byte) 71, var3, var2);
                      if (((jb) this).field_m > 0) {
                        fb.field_f = (-lk.field_j + ((jb) this).field_m) / 2;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    return;
                  } else {
                    L10: {
                      if (((jb) this).field_m > 0) {
                        fb.field_f = (-lk.field_j + ((jb) this).field_m) / 2;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    return;
                  }
                } else {
                  L11: {
                    ((jb) this).field_q.a((byte) 71, var3, var2);
                    if (((jb) this).field_m > 0) {
                      fb.field_f = (-lk.field_j + ((jb) this).field_m) / 2;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  return;
                }
              }
            } else {
              var3 = (int)((float)var2 / ((jb) this).field_n);
              if (lk.field_j == var2) {
                if (var3 != td.field_d) {
                  L12: {
                    ((jb) this).field_q.a((byte) 71, var3, var2);
                    if (((jb) this).field_m > 0) {
                      fb.field_f = (-lk.field_j + ((jb) this).field_m) / 2;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  return;
                } else {
                  L13: {
                    if (((jb) this).field_m > 0) {
                      fb.field_f = (-lk.field_j + ((jb) this).field_m) / 2;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  return;
                }
              } else {
                L14: {
                  ((jb) this).field_q.a((byte) 71, var3, var2);
                  if (((jb) this).field_m > 0) {
                    fb.field_f = (-lk.field_j + ((jb) this).field_m) / 2;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                return;
              }
            }
          } else {
            if (lk.field_j == var2) {
              if (var3 == td.field_d) {
                L15: {
                  if (((jb) this).field_m > 0) {
                    fb.field_f = (-lk.field_j + ((jb) this).field_m) / 2;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                return;
              } else {
                L16: {
                  ((jb) this).field_q.a((byte) 71, var3, var2);
                  if (((jb) this).field_m > 0) {
                    fb.field_f = (-lk.field_j + ((jb) this).field_m) / 2;
                    break L16;
                  } else {
                    break L16;
                  }
                }
                return;
              }
            } else {
              L17: {
                ((jb) this).field_q.a((byte) 71, var3, var2);
                if (((jb) this).field_m > 0) {
                  fb.field_f = (-lk.field_j + ((jb) this).field_m) / 2;
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

    private jb() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "That name is not available";
        field_a = 100;
        field_h = "Names cannot start or end with space or underscore";
    }
}
