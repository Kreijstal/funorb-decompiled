/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vla extends mv {
    private int field_q;
    static kka field_x;
    static byte[][][] field_o;
    static ee[] field_r;
    static long field_v;
    static String field_u;
    static String field_t;
    static boolean field_w;
    static boolean field_s;
    static String field_p;

    public static void f(byte param0) {
        field_r = null;
        field_t = null;
        field_p = null;
        field_o = null;
        if (param0 > -82) {
          vla.a(117, -79, -10, false);
          field_u = null;
          field_x = null;
          return;
        } else {
          field_u = null;
          field_x = null;
          return;
        }
    }

    final void e(int param0) {
        pp var2 = null;
        ad var3 = null;
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        if (param0 == (((vla) this).field_k.field_p ^ -1)) {
          return;
        } else {
          var2 = (pp) (Object) ((vla) this).field_k.field_o.b((byte) 90);
          L0: while (true) {
            if (var2 == null) {
              return;
            } else {
              L1: {
                if (var2.field_h == null) {
                  break L1;
                } else {
                  var3 = var2.field_h.a(-27449, ((vla) this).field_l);
                  if (var3.field_f.field_u.field_e) {
                    var3.b(false);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              var2 = (pp) (Object) ((vla) this).field_k.field_o.c(0);
              continue L0;
            }
          }
        }
    }

    vla(gj param0, vja param1) {
        super(param0, param1);
        ((vla) this).field_q = 64;
    }

    final boolean c(byte param0) {
        aga var3 = null;
        ad var4 = null;
        int var5 = 0;
        Object var6 = null;
        t var6_ref = null;
        var6 = null;
        var6_ref = (t) (Object) al.a(-69, ((vla) this).field_k.field_k);
        var3 = ((vla) this).field_k.field_l.a(125, ((vla) this).field_l.field_h);
        var4 = ((vla) this).field_k.field_l.a(-27449, ((vla) this).field_l);
        ((vla) this).field_l.field_s.a((byte) -57, var3.field_J, var3.field_x);
        if (var3.i(91)) {
          return true;
        } else {
          var5 = -90 % ((71 - param0) / 47);
          ((vla) this).field_q = ((vla) this).field_q - 1;
          if (0 <= ((vla) this).field_q - 1) {
            if (-26 != (((vla) this).field_q ^ -1)) {
              L0: {
                if (15 != ((vla) this).field_q) {
                  break L0;
                } else {
                  if (!((vla) this).field_k.d((byte) -75)) {
                    ((vla) this).f(-76);
                    break L0;
                  } else {
                    L1: {
                      if (((vla) this).field_q < 25) {
                        ((vla) this).e(-32);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    L2: {
                      if ((((vla) this).field_q ^ -1) != -64) {
                        break L2;
                      } else {
                        if (((vla) this).field_k.d((byte) -90)) {
                          break L2;
                        } else {
                          var4.b(-1, var6_ref.field_o);
                          return false;
                        }
                      }
                    }
                    return false;
                  }
                }
              }
              L3: {
                if (((vla) this).field_q < 25) {
                  ((vla) this).e(-32);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if ((((vla) this).field_q ^ -1) != -64) {
                  break L4;
                } else {
                  if (((vla) this).field_k.d((byte) -90)) {
                    break L4;
                  } else {
                    var4.b(-1, var6_ref.field_o);
                    return false;
                  }
                }
              }
              return false;
            } else {
              ((vla) this).d((byte) -86);
              mk.a(var6_ref.field_n, -114);
              if (15 == ((vla) this).field_q) {
                L5: {
                  if (!((vla) this).field_k.d((byte) -75)) {
                    ((vla) this).f(-76);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (((vla) this).field_q < 25) {
                    ((vla) this).e(-32);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                if ((((vla) this).field_q ^ -1) == -64) {
                  if (((vla) this).field_k.d((byte) -90)) {
                    return false;
                  } else {
                    var4.b(-1, var6_ref.field_o);
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                L7: {
                  if (((vla) this).field_q < 25) {
                    ((vla) this).e(-32);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                if ((((vla) this).field_q ^ -1) == -64) {
                  if (!((vla) this).field_k.d((byte) -90)) {
                    var4.b(-1, var6_ref.field_o);
                    return false;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              }
            }
          } else {
            ((vla) this).d(88);
            return true;
          }
        }
    }

    final static int a(int param0, be param1) {
        if (param0 != -64) {
            return -77;
        }
        if (!(param1 != null)) {
            return 0;
        }
        return 50 * param1.field_i.length / pb.field_j;
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        if (param0 == 5) {
          if (gm.field_k) {
            L0: {
              fo.field_a.a(19842, param3);
              var4 = da.field_d.g(-16360) ? 1 : 0;
              if (lf.field_c == 0) {
                break L0;
              } else {
                if (var4 != 0) {
                  break L0;
                } else {
                  lc.b(-1);
                  param3 = false;
                  break L0;
                }
              }
            }
            if (!param3) {
              if (var4 == 0) {
                var5 = da.field_d.b(false) + da.field_d.field_D;
                if (var5 > 640) {
                  uga.field_x = uga.field_x + 5;
                  return;
                } else {
                  L1: {
                    if (var5 <= -636) {
                      break L1;
                    } else {
                      if (-1 >= uga.field_x) {
                        break L1;
                      } else {
                        uga.field_x = uga.field_x - 5;
                        return;
                      }
                    }
                  }
                  return;
                }
              } else {
                fo.field_a.a(19842, param3);
                var5 = da.field_d.b(false) + da.field_d.field_D;
                if (var5 > 640) {
                  uga.field_x = uga.field_x + 5;
                  return;
                } else {
                  L2: {
                    if (var5 <= -636) {
                      break L2;
                    } else {
                      if (-1 >= uga.field_x) {
                        break L2;
                      } else {
                        uga.field_x = uga.field_x - 5;
                        return;
                      }
                    }
                  }
                  return;
                }
              }
            } else {
              da.field_d.a(param2, 30091, param1);
              if (var4 == 0) {
                var5 = da.field_d.b(false) + da.field_d.field_D;
                if (var5 > 640) {
                  uga.field_x = uga.field_x + 5;
                  return;
                } else {
                  L3: {
                    if (var5 <= -636) {
                      break L3;
                    } else {
                      if (-1 >= uga.field_x) {
                        break L3;
                      } else {
                        uga.field_x = uga.field_x - 5;
                        return;
                      }
                    }
                  }
                  return;
                }
              } else {
                fo.field_a.a(19842, param3);
                var5 = da.field_d.b(false) + da.field_d.field_D;
                if (var5 > 640) {
                  uga.field_x = uga.field_x + 5;
                  return;
                } else {
                  L4: {
                    if (var5 <= -636) {
                      break L4;
                    } else {
                      if (-1 >= uga.field_x) {
                        break L4;
                      } else {
                        uga.field_x = uga.field_x - 5;
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
          vla.f((byte) -87);
          if (gm.field_k) {
            L5: {
              fo.field_a.a(19842, param3);
              var4 = da.field_d.g(-16360) ? 1 : 0;
              if (lf.field_c == 0) {
                break L5;
              } else {
                if (var4 != 0) {
                  break L5;
                } else {
                  lc.b(-1);
                  param3 = false;
                  break L5;
                }
              }
            }
            if (param3) {
              da.field_d.a(param2, 30091, param1);
              if (var4 != 0) {
                fo.field_a.a(19842, param3);
                var5 = da.field_d.b(false) + da.field_d.field_D;
                if (var5 > 640) {
                  uga.field_x = uga.field_x + 5;
                  return;
                } else {
                  if (var5 > -636) {
                    if (-1 < uga.field_x) {
                      uga.field_x = uga.field_x - 5;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                var5 = da.field_d.b(false) + da.field_d.field_D;
                if (var5 <= 640) {
                  if ((var5 ^ -1) > -636) {
                    if (-1 <= (uga.field_x ^ -1)) {
                      return;
                    } else {
                      uga.field_x = uga.field_x - 5;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  uga.field_x = uga.field_x + 5;
                  return;
                }
              }
            } else {
              if (var4 == 0) {
                var5 = da.field_d.b(false) + da.field_d.field_D;
                if (var5 <= 640) {
                  if (var5 > -636) {
                    if (-1 < uga.field_x) {
                      uga.field_x = uga.field_x - 5;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  uga.field_x = uga.field_x + 5;
                  return;
                }
              } else {
                L6: {
                  fo.field_a.a(19842, param3);
                  var5 = da.field_d.b(false) + da.field_d.field_D;
                  if (var5 > 640) {
                    uga.field_x = uga.field_x + 5;
                    break L6;
                  } else {
                    if (var5 <= -636) {
                      break L6;
                    } else {
                      if (-1 >= uga.field_x) {
                        break L6;
                      } else {
                        uga.field_x = uga.field_x - 5;
                        break L6;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Inviting <%0>";
        field_p = "<%0> turns remaining";
        field_u = "<col=0></col>£<%0>";
    }
}
