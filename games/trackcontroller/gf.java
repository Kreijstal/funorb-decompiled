/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gf {
    private int field_c;
    private boolean field_d;
    private int field_u;
    static uf field_o;
    private int field_n;
    private int field_p;
    private int field_e;
    private int field_r;
    private float field_k;
    static int field_g;
    private int field_j;
    private int field_f;
    private int field_i;
    private int field_v;
    static String field_a;
    private int field_h;
    private int field_s;
    static int field_q;
    private fl field_b;
    private int field_l;
    private int field_t;
    private int field_m;

    final void b(boolean param0) {
        if (null != og.field_rb) {
          return;
        } else {
          L0: {
            if (hk.field_d <= 0) {
              ((gf) this).field_d = false;
              break L0;
            } else {
              break L0;
            }
          }
          if (!((gf) this).field_d) {
            if (((gf) this).field_j <= og.field_pb) {
              if (0 >= ((gf) this).field_j) {
                if (((gf) this).field_s == og.field_pb) {
                  if (wf.field_b == ((gf) this).field_h) {
                    return;
                  } else {
                    ((gf) this).field_b.a(((gf) this).field_s, ((gf) this).field_h, (byte) 4);
                    return;
                  }
                } else {
                  ((gf) this).field_b.a(((gf) this).field_s, ((gf) this).field_h, (byte) 4);
                  return;
                }
              } else {
                gb.field_i = 0;
                if (((gf) this).field_s == og.field_pb) {
                  if (wf.field_b == ((gf) this).field_h) {
                    return;
                  } else {
                    ((gf) this).field_b.a(((gf) this).field_s, ((gf) this).field_h, (byte) 4);
                    return;
                  }
                } else {
                  ((gf) this).field_b.a(((gf) this).field_s, ((gf) this).field_h, (byte) 4);
                  return;
                }
              }
            } else {
              gb.field_i = (-og.field_pb + ((gf) this).field_j) / 2;
              if (((gf) this).field_s == og.field_pb) {
                if (wf.field_b == ((gf) this).field_h) {
                  return;
                } else {
                  ((gf) this).field_b.a(((gf) this).field_s, ((gf) this).field_h, (byte) 4);
                  return;
                }
              } else {
                ((gf) this).field_b.a(((gf) this).field_s, ((gf) this).field_h, (byte) 4);
                return;
              }
            }
          } else {
            if (param0) {
              int fieldTemp$1 = ((gf) this).field_i - 1;
              ((gf) this).field_i = ((gf) this).field_i - 1;
              if (fieldTemp$1 <= 0) {
                ((gf) this).field_i = ((gf) this).field_m;
                if (((gf) this).field_t > eb.field_i) {
                  ((gf) this).field_d = false;
                  return;
                } else {
                  this.a(false);
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

    final void a(int param0, int param1, int param2) {
        ((gf) this).field_e = param2;
        if (param0 != 0) {
            ((gf) this).field_t = 68;
            ((gf) this).field_j = param1;
            return;
        }
        ((gf) this).field_j = param1;
    }

    public static void a() {
        field_o = null;
        field_a = null;
    }

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = TrackController.field_F ? 1 : 0;
        var2 = ((gf) this).field_j;
        var3 = ((gf) this).field_e;
        if (((gf) this).a(32130)) {
          L0: {
            if (((gf) this).field_c >= var3) {
              if (var3 >= ((gf) this).field_r) {
                break L0;
              } else {
                var3 = ((gf) this).field_r;
                break L0;
              }
            } else {
              var3 = ((gf) this).field_c;
              break L0;
            }
          }
          L1: {
            if (var2 > ((gf) this).field_l) {
              var2 = ((gf) this).field_l;
              break L1;
            } else {
              if (((gf) this).field_u <= var2) {
                break L1;
              } else {
                L2: {
                  var2 = ((gf) this).field_u;
                  if (0.0f < ((gf) this).field_k) {
                    var4 = (int)(((gf) this).field_k * (float)var3 + 0.5f);
                    if (var2 < var4) {
                      var3 = (int)((float)var2 / ((gf) this).field_k);
                      break L2;
                    } else {
                      if (var2 > var4) {
                        var2 = var4;
                        if (og.field_pb != var2) {
                          L3: {
                            ((gf) this).field_b.a(var2, var3, (byte) 4);
                            if (0 >= ((gf) this).field_j) {
                              break L3;
                            } else {
                              gb.field_i = (((gf) this).field_j + -og.field_pb) / 2;
                              break L3;
                            }
                          }
                          return;
                        } else {
                          if (var3 != wf.field_b) {
                            L4: {
                              ((gf) this).field_b.a(var2, var3, (byte) 4);
                              if (0 >= ((gf) this).field_j) {
                                break L4;
                              } else {
                                gb.field_i = (((gf) this).field_j + -og.field_pb) / 2;
                                break L4;
                              }
                            }
                            return;
                          } else {
                            L5: {
                              if (0 >= ((gf) this).field_j) {
                                break L5;
                              } else {
                                gb.field_i = (((gf) this).field_j + -og.field_pb) / 2;
                                break L5;
                              }
                            }
                            return;
                          }
                        }
                      } else {
                        L6: {
                          if (og.field_pb != var2) {
                            ((gf) this).field_b.a(var2, var3, (byte) 4);
                            break L6;
                          } else {
                            if (var3 == wf.field_b) {
                              break L6;
                            } else {
                              L7: {
                                ((gf) this).field_b.a(var2, var3, (byte) 4);
                                if (0 >= ((gf) this).field_j) {
                                  break L7;
                                } else {
                                  gb.field_i = (((gf) this).field_j + -og.field_pb) / 2;
                                  break L7;
                                }
                              }
                              return;
                            }
                          }
                        }
                        if (0 >= ((gf) this).field_j) {
                          return;
                        } else {
                          gb.field_i = (((gf) this).field_j + -og.field_pb) / 2;
                          return;
                        }
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                if (og.field_pb != var2) {
                  ((gf) this).field_b.a(var2, var3, (byte) 4);
                  if (0 >= ((gf) this).field_j) {
                    return;
                  } else {
                    gb.field_i = (((gf) this).field_j + -og.field_pb) / 2;
                    return;
                  }
                } else {
                  if (var3 != wf.field_b) {
                    ((gf) this).field_b.a(var2, var3, (byte) 4);
                    if (0 >= ((gf) this).field_j) {
                      return;
                    } else {
                      gb.field_i = (((gf) this).field_j + -og.field_pb) / 2;
                      return;
                    }
                  } else {
                    if (0 >= ((gf) this).field_j) {
                      return;
                    } else {
                      gb.field_i = (((gf) this).field_j + -og.field_pb) / 2;
                      return;
                    }
                  }
                }
              }
            }
          }
          if (0.0f < ((gf) this).field_k) {
            L8: {
              var4 = (int)(((gf) this).field_k * (float)var3 + 0.5f);
              if (var2 < var4) {
                var3 = (int)((float)var2 / ((gf) this).field_k);
                break L8;
              } else {
                if (var2 <= var4) {
                  break L8;
                } else {
                  var2 = var4;
                  if (og.field_pb != var2) {
                    ((gf) this).field_b.a(var2, var3, (byte) 4);
                    if (0 >= ((gf) this).field_j) {
                      return;
                    } else {
                      gb.field_i = (((gf) this).field_j + -og.field_pb) / 2;
                      return;
                    }
                  } else {
                    if (var3 == wf.field_b) {
                      if (0 >= ((gf) this).field_j) {
                        return;
                      } else {
                        gb.field_i = (((gf) this).field_j + -og.field_pb) / 2;
                        return;
                      }
                    } else {
                      ((gf) this).field_b.a(var2, var3, (byte) 4);
                      if (0 >= ((gf) this).field_j) {
                        return;
                      } else {
                        gb.field_i = (((gf) this).field_j + -og.field_pb) / 2;
                        return;
                      }
                    }
                  }
                }
              }
            }
            if (og.field_pb != var2) {
              ((gf) this).field_b.a(var2, var3, (byte) 4);
              if (0 >= ((gf) this).field_j) {
                return;
              } else {
                gb.field_i = (((gf) this).field_j + -og.field_pb) / 2;
                return;
              }
            } else {
              if (var3 == wf.field_b) {
                if (0 >= ((gf) this).field_j) {
                  return;
                } else {
                  gb.field_i = (((gf) this).field_j + -og.field_pb) / 2;
                  return;
                }
              } else {
                ((gf) this).field_b.a(var2, var3, (byte) 4);
                if (0 >= ((gf) this).field_j) {
                  return;
                } else {
                  gb.field_i = (((gf) this).field_j + -og.field_pb) / 2;
                  return;
                }
              }
            }
          } else {
            if (og.field_pb != var2) {
              ((gf) this).field_b.a(var2, var3, (byte) 4);
              if (0 >= ((gf) this).field_j) {
                return;
              } else {
                gb.field_i = (((gf) this).field_j + -og.field_pb) / 2;
                return;
              }
            } else {
              if (var3 == wf.field_b) {
                if (0 >= ((gf) this).field_j) {
                  return;
                } else {
                  gb.field_i = (((gf) this).field_j + -og.field_pb) / 2;
                  return;
                }
              } else {
                ((gf) this).field_b.a(var2, var3, (byte) 4);
                if (0 >= ((gf) this).field_j) {
                  return;
                } else {
                  gb.field_i = (((gf) this).field_j + -og.field_pb) / 2;
                  return;
                }
              }
            }
          }
        } else {
          ((gf) this).field_d = false;
          return;
        }
    }

    final boolean a(int param0) {
        if (param0 == 32130) {
          if (eb.field_i >= ((gf) this).field_t) {
            if (hk.field_d <= 0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          ih discarded$6 = ((gf) this).c(98);
          if (eb.field_i >= ((gf) this).field_t) {
            if (hk.field_d <= 0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final ih c(int param0) {
        ih var2 = null;
        ((gf) this).field_p = wf.field_b;
        ((gf) this).field_n = og.field_pb;
        ((gf) this).field_b.a(((gf) this).field_f, ((gf) this).field_v, (byte) 4);
        mj.field_c = false;
        var2 = dj.a(param0, ((gf) this).field_v, ((gf) this).field_f, (byte) 28, rg.field_c, 0);
        if (var2 == null) {
          ((gf) this).b(param0 + 6391);
          return var2;
        } else {
          return var2;
        }
    }

    final void b(int param0) {
        if (param0 != 6391) {
          ((gf) this).field_h = 97;
          ((gf) this).field_b.a(((gf) this).field_n, ((gf) this).field_p, (byte) 4);
          return;
        } else {
          ((gf) this).field_b.a(((gf) this).field_n, ((gf) this).field_p, (byte) 4);
          return;
        }
    }

    private gf() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Connection restored.";
        field_g = 500;
    }
}
