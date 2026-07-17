/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lp extends br {
    int[] field_i;
    static db field_s;
    int field_n;
    static byte[][] field_f;
    int[] field_g;
    int[] field_q;
    byte[][][] field_o;
    di[] field_m;
    di[] field_l;
    int field_r;
    static uj field_k;
    static String field_h;
    static boolean field_p;
    static int field_j;

    final static void a(byte param0) {
        wi.a((byte) 4, tl.field_t);
        if (param0 < 35) {
            field_p = false;
        }
    }

    public static void a(int param0) {
        field_k = null;
        field_f = null;
        field_s = null;
        field_h = null;
    }

    final static void a(byte param0, int param1, boolean param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        if (param0 == -45) {
          if (ee.field_b) {
            L0: {
              rp.field_l.a(-11838, param2);
              var4 = mj.field_Ib.k(-26899) ? 1 : 0;
              if (0 == kd.field_b) {
                break L0;
              } else {
                if (var4 != 0) {
                  break L0;
                } else {
                  param2 = false;
                  ub.n(33423425);
                  break L0;
                }
              }
            }
            if (!param2) {
              if (var4 == 0) {
                var5 = mj.field_Ib.i(param0 ^ 29767) - -mj.field_Ib.field_w;
                if (var5 > 640) {
                  ti.field_Y = ti.field_Y + 5;
                  return;
                } else {
                  L1: {
                    if (var5 >= 635) {
                      break L1;
                    } else {
                      if (ti.field_Y <= 0) {
                        break L1;
                      } else {
                        ti.field_Y = ti.field_Y - 5;
                        return;
                      }
                    }
                  }
                  return;
                }
              } else {
                rp.field_l.a(-11838, param2);
                var5 = mj.field_Ib.i(param0 ^ 29767) - -mj.field_Ib.field_w;
                if (var5 > 640) {
                  ti.field_Y = ti.field_Y + 5;
                  return;
                } else {
                  L2: {
                    if (var5 >= 635) {
                      break L2;
                    } else {
                      if (ti.field_Y <= 0) {
                        break L2;
                      } else {
                        ti.field_Y = ti.field_Y - 5;
                        return;
                      }
                    }
                  }
                  return;
                }
              }
            } else {
              mj.field_Ib.b(param3, 255, param1);
              if (var4 == 0) {
                var5 = mj.field_Ib.i(param0 ^ 29767) - -mj.field_Ib.field_w;
                if (var5 > 640) {
                  ti.field_Y = ti.field_Y + 5;
                  return;
                } else {
                  L3: {
                    if (var5 >= 635) {
                      break L3;
                    } else {
                      if (ti.field_Y <= 0) {
                        break L3;
                      } else {
                        ti.field_Y = ti.field_Y - 5;
                        return;
                      }
                    }
                  }
                  return;
                }
              } else {
                rp.field_l.a(-11838, param2);
                var5 = mj.field_Ib.i(param0 ^ 29767) - -mj.field_Ib.field_w;
                if (var5 > 640) {
                  ti.field_Y = ti.field_Y + 5;
                  return;
                } else {
                  L4: {
                    if (var5 >= 635) {
                      break L4;
                    } else {
                      if (ti.field_Y <= 0) {
                        break L4;
                      } else {
                        ti.field_Y = ti.field_Y - 5;
                        return;
                      }
                    }
                  }
                  return;
                }
              }
            }
          } else {
            return;
          }
        } else {
          field_j = -28;
          if (ee.field_b) {
            L5: {
              rp.field_l.a(-11838, param2);
              var4 = mj.field_Ib.k(-26899) ? 1 : 0;
              if (0 == kd.field_b) {
                break L5;
              } else {
                if (var4 != 0) {
                  break L5;
                } else {
                  param2 = false;
                  ub.n(33423425);
                  break L5;
                }
              }
            }
            if (param2) {
              mj.field_Ib.b(param3, 255, param1);
              if (var4 != 0) {
                rp.field_l.a(-11838, param2);
                var5 = mj.field_Ib.i(param0 ^ 29767) - -mj.field_Ib.field_w;
                if (var5 > 640) {
                  ti.field_Y = ti.field_Y + 5;
                  return;
                } else {
                  if (var5 < 635) {
                    if (ti.field_Y > 0) {
                      ti.field_Y = ti.field_Y - 5;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                var5 = mj.field_Ib.i(param0 ^ 29767) - -mj.field_Ib.field_w;
                if (var5 > 640) {
                  ti.field_Y = ti.field_Y + 5;
                  return;
                } else {
                  if (var5 < 635) {
                    if (ti.field_Y > 0) {
                      ti.field_Y = ti.field_Y - 5;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            } else {
              if (var4 == 0) {
                var5 = mj.field_Ib.i(param0 ^ 29767) - -mj.field_Ib.field_w;
                if (var5 > 640) {
                  ti.field_Y = ti.field_Y + 5;
                  return;
                } else {
                  L6: {
                    if (var5 >= 635) {
                      break L6;
                    } else {
                      if (ti.field_Y <= 0) {
                        break L6;
                      } else {
                        ti.field_Y = ti.field_Y - 5;
                        return;
                      }
                    }
                  }
                  return;
                }
              } else {
                L7: {
                  rp.field_l.a(-11838, param2);
                  var5 = mj.field_Ib.i(param0 ^ 29767) - -mj.field_Ib.field_w;
                  if (var5 > 640) {
                    ti.field_Y = ti.field_Y + 5;
                    break L7;
                  } else {
                    if (var5 >= 635) {
                      break L7;
                    } else {
                      if (ti.field_Y <= 0) {
                        break L7;
                      } else {
                        ti.field_Y = ti.field_Y - 5;
                        break L7;
                      }
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
    }

    final static void a(byte param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 >= -27) {
          lp.a((byte) -56, false);
          if (vl.field_h <= 0) {
            if (!wc.j(100)) {
              L0: {
                var2 = 1;
                if (ng.field_g != null) {
                  break L0;
                } else {
                  if (!cb.field_o) {
                    break L0;
                  } else {
                    eb.a(false, param1, var2);
                    return;
                  }
                }
              }
              return;
            } else {
              L1: {
                var2 = 0;
                if (ng.field_g != null) {
                  break L1;
                } else {
                  if (!cb.field_o) {
                    break L1;
                  } else {
                    eb.a(false, param1, var2);
                    return;
                  }
                }
              }
              return;
            }
          } else {
            if (ng.field_g != null) {
              rn.field_f = ng.field_g.f(0);
              al.b(true, 2);
              if (null != rn.field_f) {
                L2: {
                  var2 = 2;
                  qi.a(100, (java.awt.Canvas) (Object) rn.field_f);
                  if (ng.field_g != null) {
                    break L2;
                  } else {
                    if (!cb.field_o) {
                      break L2;
                    } else {
                      eb.a(false, param1, var2);
                      return;
                    }
                  }
                }
                return;
              } else {
                L3: {
                  var2 = 3;
                  if (ng.field_g != null) {
                    break L3;
                  } else {
                    if (!cb.field_o) {
                      break L3;
                    } else {
                      eb.a(false, param1, var2);
                      return;
                    }
                  }
                }
                return;
              }
            } else {
              rn.field_f = u.a(10386, pl.field_J, 480, 0, 0, 640);
              if (null != rn.field_f) {
                var2 = 2;
                qi.a(100, (java.awt.Canvas) (Object) rn.field_f);
                if (ng.field_g == null) {
                  if (!cb.field_o) {
                    return;
                  } else {
                    eb.a(false, param1, var2);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                var2 = 3;
                if (ng.field_g == null) {
                  if (!cb.field_o) {
                    return;
                  } else {
                    eb.a(false, param1, var2);
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
        } else {
          if (vl.field_h <= 0) {
            if (!wc.j(100)) {
              L4: {
                var2 = 1;
                if (ng.field_g != null) {
                  break L4;
                } else {
                  if (!cb.field_o) {
                    break L4;
                  } else {
                    eb.a(false, param1, var2);
                    return;
                  }
                }
              }
              return;
            } else {
              L5: {
                var2 = 0;
                if (ng.field_g != null) {
                  break L5;
                } else {
                  if (!cb.field_o) {
                    break L5;
                  } else {
                    eb.a(false, param1, var2);
                    return;
                  }
                }
              }
              return;
            }
          } else {
            if (ng.field_g != null) {
              rn.field_f = ng.field_g.f(0);
              al.b(true, 2);
              if (null != rn.field_f) {
                L6: {
                  var2 = 2;
                  qi.a(100, (java.awt.Canvas) (Object) rn.field_f);
                  if (ng.field_g != null) {
                    break L6;
                  } else {
                    if (!cb.field_o) {
                      break L6;
                    } else {
                      eb.a(false, param1, var2);
                      break L6;
                    }
                  }
                }
                return;
              } else {
                L7: {
                  var2 = 3;
                  if (ng.field_g != null) {
                    break L7;
                  } else {
                    if (!cb.field_o) {
                      break L7;
                    } else {
                      eb.a(false, param1, var2);
                      break L7;
                    }
                  }
                }
                return;
              }
            } else {
              rn.field_f = u.a(10386, pl.field_J, 480, 0, 0, 640);
              if (null != rn.field_f) {
                var2 = 2;
                qi.a(100, (java.awt.Canvas) (Object) rn.field_f);
                if (ng.field_g == null) {
                  if (cb.field_o) {
                    eb.a(false, param1, var2);
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                var2 = 3;
                if (ng.field_g == null) {
                  if (cb.field_o) {
                    eb.a(false, param1, var2);
                    return;
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
    }

    final static void a(int param0, int param1) {
        uf.field_g = 0;
        uk.field_M = new ka[param0 * 15];
        sj.field_m = param0;
        ub.field_ub = new int[3];
    }

    lp() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new byte[1000][];
        field_s = new db();
        field_h = "You have been removed from <%0>'s game.";
        field_j = 0;
    }
}
