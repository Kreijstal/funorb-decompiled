/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qn {
    private int field_w;
    private int field_i;
    private rc field_e;
    private int field_t;
    private int field_j;
    private int field_d;
    private int field_g;
    private int field_v;
    static String field_k;
    private int field_c;
    static int field_f;
    private int field_x;
    static long field_n;
    static String[] field_u;
    private int field_q;
    private int field_m;
    private int field_s;
    private float field_r;
    private int field_h;
    private int field_l;
    private int field_a;
    static String field_o;
    static String field_p;
    private boolean field_b;

    final void c(int param0) {
        if (null == ua.field_d) {
          if (go.field_c > 0) {
            if (((qn) this).field_b) {
              int fieldTemp$2 = ((qn) this).field_w - 1;
              ((qn) this).field_w = ((qn) this).field_w - 1;
              if (fieldTemp$2 <= 0) {
                ((qn) this).field_w = ((qn) this).field_g;
                if (qh.field_a >= ((qn) this).field_c) {
                  if (param0 >= 23) {
                    this.d(0);
                    return;
                  } else {
                    ((qn) this).field_l = -43;
                    this.d(0);
                    return;
                  }
                } else {
                  ((qn) this).field_b = false;
                  return;
                }
              } else {
                return;
              }
            } else {
              if (((qn) this).field_m <= to.field_b) {
                if (((qn) this).field_m > 0) {
                  to.field_i = 0;
                  if (to.field_b == ((qn) this).field_v) {
                    if (be.field_g == ((qn) this).field_t) {
                      return;
                    } else {
                      ((qn) this).field_e.a(((qn) this).field_v, ((qn) this).field_t, -70);
                      return;
                    }
                  } else {
                    ((qn) this).field_e.a(((qn) this).field_v, ((qn) this).field_t, -70);
                    return;
                  }
                } else {
                  if (to.field_b == ((qn) this).field_v) {
                    if (be.field_g == ((qn) this).field_t) {
                      return;
                    } else {
                      ((qn) this).field_e.a(((qn) this).field_v, ((qn) this).field_t, -70);
                      return;
                    }
                  } else {
                    ((qn) this).field_e.a(((qn) this).field_v, ((qn) this).field_t, -70);
                    return;
                  }
                }
              } else {
                to.field_i = (-to.field_b + ((qn) this).field_m) / 2;
                if (to.field_b == ((qn) this).field_v) {
                  if (be.field_g == ((qn) this).field_t) {
                    return;
                  } else {
                    ((qn) this).field_e.a(((qn) this).field_v, ((qn) this).field_t, -70);
                    return;
                  }
                } else {
                  ((qn) this).field_e.a(((qn) this).field_v, ((qn) this).field_t, -70);
                  return;
                }
              }
            }
          } else {
            ((qn) this).field_b = false;
            if (((qn) this).field_b) {
              int fieldTemp$3 = ((qn) this).field_w - 1;
              ((qn) this).field_w = ((qn) this).field_w - 1;
              if (fieldTemp$3 <= 0) {
                ((qn) this).field_w = ((qn) this).field_g;
                if (qh.field_a >= ((qn) this).field_c) {
                  if (param0 >= 23) {
                    this.d(0);
                    return;
                  } else {
                    ((qn) this).field_l = -43;
                    this.d(0);
                    return;
                  }
                } else {
                  ((qn) this).field_b = false;
                  return;
                }
              } else {
                return;
              }
            } else {
              L0: {
                if (((qn) this).field_m <= to.field_b) {
                  if (((qn) this).field_m > 0) {
                    to.field_i = 0;
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  to.field_i = (-to.field_b + ((qn) this).field_m) / 2;
                  break L0;
                }
              }
              L1: {
                if (to.field_b != ((qn) this).field_v) {
                  ((qn) this).field_e.a(((qn) this).field_v, ((qn) this).field_t, -70);
                  break L1;
                } else {
                  if (be.field_g != ((qn) this).field_t) {
                    ((qn) this).field_e.a(((qn) this).field_v, ((qn) this).field_t, -70);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    final static void a(byte param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        cq var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var4 = (cq) (Object) fk.field_f.d(-99);
            L1: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                gn.a(-21167, var4, 7);
                var4 = (cq) (Object) fk.field_f.a((byte) 116);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var2, "qn.I(" + 119 + ',' + 7 + ')');
        }
    }

    final void a(int param0) {
        ((qn) this).field_e.a(((qn) this).field_l, ((qn) this).field_d, -77);
        int var2 = 76 / ((param0 - 31) / 42);
    }

    final void a(int param0, int param1, int param2) {
        ((qn) this).field_j = param2;
        ((qn) this).field_m = param1;
        int var4 = 111 % ((param0 - -47) / 41);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        ip.field_r = new fo(new int[1]);
        oq.field_x = 0;
        fr.field_k = 0;
        lg.field_L = 640;
        wo.field_a = 240;
        qb.field_w = lg.field_L + -oq.field_x;
        ag.field_E = -fr.field_k + wo.field_a;
    }

    final wg a(boolean param0) {
        ((qn) this).field_d = be.field_g;
        ((qn) this).field_l = to.field_b;
        ((qn) this).field_e.a(((qn) this).field_q, ((qn) this).field_s, -93);
        tn.field_A = false;
        wg var2 = ff.a(0, 0, ((qn) this).field_q, ((qn) this).field_s, param0, lp.field_ub);
        if (!(var2 != null)) {
            ((qn) this).a(102);
        }
        return var2;
    }

    public static void b(int param0) {
        if (param0 != 0) {
          qn.b(-47);
          field_u = null;
          field_o = null;
          field_p = null;
          field_k = null;
          return;
        } else {
          field_u = null;
          field_o = null;
          field_p = null;
          field_k = null;
          return;
        }
    }

    private qn() throws Throwable {
        throw new Error();
    }

    final boolean a(byte param0) {
        if (param0 != -32) {
            return true;
        }
        if (qh.field_a < ((qn) this).field_c) {
            return false;
        }
        if (0 >= go.field_c) {
            return false;
        }
        return true;
    }

    private final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = BrickABrac.field_J ? 1 : 0;
        var2 = ((qn) this).field_m;
        var3 = ((qn) this).field_j;
        if (((qn) this).a((byte) -32)) {
          L0: {
            if (var3 <= ((qn) this).field_i) {
              if (var3 < ((qn) this).field_h) {
                var3 = ((qn) this).field_h;
                break L0;
              } else {
                break L0;
              }
            } else {
              var3 = ((qn) this).field_i;
              break L0;
            }
          }
          L1: {
            if (((qn) this).field_x < var2) {
              var2 = ((qn) this).field_x;
              break L1;
            } else {
              if (((qn) this).field_a > var2) {
                var2 = ((qn) this).field_a;
                break L1;
              } else {
                if (0.0f < ((qn) this).field_r) {
                  L2: {
                    var4 = (int)((float)var3 * ((qn) this).field_r + 0.5f);
                    if (var4 > var2) {
                      var3 = (int)((float)var2 / ((qn) this).field_r);
                      break L2;
                    } else {
                      if (var2 <= var4) {
                        break L2;
                      } else {
                        L3: {
                          var2 = var4;
                          if (var2 != to.field_b) {
                            ((qn) this).field_e.a(var2, var3, -97);
                            break L3;
                          } else {
                            if (var3 != be.field_g) {
                              ((qn) this).field_e.a(var2, var3, -97);
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        }
                        L4: {
                          if (0 >= ((qn) this).field_m) {
                            break L4;
                          } else {
                            to.field_i = (-to.field_b + ((qn) this).field_m) / 2;
                            break L4;
                          }
                        }
                        return;
                      }
                    }
                  }
                  if (var2 == to.field_b) {
                    if (var3 == be.field_g) {
                      L5: {
                        if (0 >= ((qn) this).field_m) {
                          break L5;
                        } else {
                          to.field_i = (-to.field_b + ((qn) this).field_m) / 2;
                          break L5;
                        }
                      }
                      return;
                    } else {
                      L6: {
                        ((qn) this).field_e.a(var2, var3, -97);
                        if (0 >= ((qn) this).field_m) {
                          break L6;
                        } else {
                          to.field_i = (-to.field_b + ((qn) this).field_m) / 2;
                          break L6;
                        }
                      }
                      return;
                    }
                  } else {
                    L7: {
                      ((qn) this).field_e.a(var2, var3, -97);
                      if (0 >= ((qn) this).field_m) {
                        break L7;
                      } else {
                        to.field_i = (-to.field_b + ((qn) this).field_m) / 2;
                        break L7;
                      }
                    }
                    return;
                  }
                } else {
                  L8: {
                    if (var2 != to.field_b) {
                      ((qn) this).field_e.a(var2, var3, -97);
                      break L8;
                    } else {
                      if (var3 != be.field_g) {
                        ((qn) this).field_e.a(var2, var3, -97);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (0 >= ((qn) this).field_m) {
                      break L9;
                    } else {
                      to.field_i = (-to.field_b + ((qn) this).field_m) / 2;
                      break L9;
                    }
                  }
                  return;
                }
              }
            }
          }
          if (0.0f < ((qn) this).field_r) {
            L10: {
              var4 = (int)((float)var3 * ((qn) this).field_r + 0.5f);
              if (var4 > var2) {
                var3 = (int)((float)var2 / ((qn) this).field_r);
                break L10;
              } else {
                if (var2 <= var4) {
                  break L10;
                } else {
                  var2 = var4;
                  if (var2 != to.field_b) {
                    L11: {
                      ((qn) this).field_e.a(var2, var3, -97);
                      if (0 >= ((qn) this).field_m) {
                        break L11;
                      } else {
                        to.field_i = (-to.field_b + ((qn) this).field_m) / 2;
                        break L11;
                      }
                    }
                    return;
                  } else {
                    if (var3 != be.field_g) {
                      ((qn) this).field_e.a(var2, var3, -97);
                      if (0 < ((qn) this).field_m) {
                        to.field_i = (-to.field_b + ((qn) this).field_m) / 2;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (0 < ((qn) this).field_m) {
                        to.field_i = (-to.field_b + ((qn) this).field_m) / 2;
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
            }
            if (var2 != to.field_b) {
              ((qn) this).field_e.a(var2, var3, -97);
              if (0 < ((qn) this).field_m) {
                to.field_i = (-to.field_b + ((qn) this).field_m) / 2;
                return;
              } else {
                return;
              }
            } else {
              if (var3 != be.field_g) {
                ((qn) this).field_e.a(var2, var3, -97);
                if (0 < ((qn) this).field_m) {
                  to.field_i = (-to.field_b + ((qn) this).field_m) / 2;
                  return;
                } else {
                  return;
                }
              } else {
                if (0 < ((qn) this).field_m) {
                  to.field_i = (-to.field_b + ((qn) this).field_m) / 2;
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            L12: {
              if (var2 != to.field_b) {
                ((qn) this).field_e.a(var2, var3, -97);
                break L12;
              } else {
                if (var3 != be.field_g) {
                  ((qn) this).field_e.a(var2, var3, -97);
                  break L12;
                } else {
                  break L12;
                }
              }
            }
            if (0 >= ((qn) this).field_m) {
              return;
            } else {
              to.field_i = (-to.field_b + ((qn) this).field_m) / 2;
              return;
            }
          }
        } else {
          ((qn) this).field_b = false;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Please log in as a subscribing member to access this feature.";
        field_o = "Playing";
    }
}
