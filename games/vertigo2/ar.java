/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ar {
    private int field_i;
    private int field_j;
    private io field_s;
    private int field_e;
    private int field_o;
    private int field_n;
    static boolean field_t;
    private int field_q;
    private int field_h;
    static String field_a;
    private float field_k;
    private int field_g;
    private int field_u;
    private int field_f;
    private boolean field_b;
    static kq field_c;
    private int field_d;
    private int field_m;
    private int field_p;
    private int field_l;
    private int field_r;

    final void a(int param0) {
        if (dc.field_L != null) {
          return;
        } else {
          L0: {
            if (-1 <= (q.field_y ^ -1)) {
              ((ar) this).field_b = false;
              break L0;
            } else {
              break L0;
            }
          }
          if (!((ar) this).field_b) {
            if (((ar) this).field_r > op.field_c) {
              bk.field_f = (-op.field_c + ((ar) this).field_r) / 2;
              if (op.field_c == ((ar) this).field_j) {
                if (gh.field_a == ((ar) this).field_u) {
                  return;
                } else {
                  ((ar) this).field_s.a(param0 + -14471, ((ar) this).field_j, ((ar) this).field_u);
                  return;
                }
              } else {
                ((ar) this).field_s.a(param0 + -14471, ((ar) this).field_j, ((ar) this).field_u);
                return;
              }
            } else {
              if (0 < ((ar) this).field_r) {
                bk.field_f = 0;
                if (op.field_c == ((ar) this).field_j) {
                  if (gh.field_a == ((ar) this).field_u) {
                    return;
                  } else {
                    ((ar) this).field_s.a(param0 + -14471, ((ar) this).field_j, ((ar) this).field_u);
                    return;
                  }
                } else {
                  ((ar) this).field_s.a(param0 + -14471, ((ar) this).field_j, ((ar) this).field_u);
                  return;
                }
              } else {
                if (op.field_c == ((ar) this).field_j) {
                  if (gh.field_a == ((ar) this).field_u) {
                    return;
                  } else {
                    ((ar) this).field_s.a(param0 + -14471, ((ar) this).field_j, ((ar) this).field_u);
                    return;
                  }
                } else {
                  ((ar) this).field_s.a(param0 + -14471, ((ar) this).field_j, ((ar) this).field_u);
                  return;
                }
              }
            }
          } else {
            ((ar) this).field_m = ((ar) this).field_m - 1;
            if (((ar) this).field_m - 1 <= 0) {
              ((ar) this).field_m = ((ar) this).field_d;
              if (param0 == 16671) {
                if (ci.field_a < ((ar) this).field_e) {
                  ((ar) this).field_b = false;
                  return;
                } else {
                  this.a((byte) -128);
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

    final static void a(int param0, int param1) {
        mi var2 = null;
        int var3 = 0;
        int var4 = 0;
        var2 = uh.field_Wb;
        var2.j(param1, 126);
        var2.field_u = var2.field_u + 1;
        var3 = var2.field_u;
        var2.f(5, -105);
        if (param0 != 953354214) {
          ar.a(-18, (byte) -22, -75, 35, 98);
          var2.f(gd.field_j.field_uc, -116);
          var4 = (gd.field_j.field_xc << 953354214) + gd.field_j.field_Ub;
          var2.f(var4, -109);
          var2.a(0, -10140, gd.field_j.field_fc, gd.field_j.field_fc.length);
          var2.b((byte) 6, -var3 + var2.field_u);
          return;
        } else {
          var2.f(gd.field_j.field_uc, -116);
          var4 = (gd.field_j.field_xc << 953354214) + gd.field_j.field_Ub;
          var2.f(var4, -109);
          var2.a(0, -10140, gd.field_j.field_fc, gd.field_j.field_fc.length);
          var2.b((byte) 6, -var3 + var2.field_u);
          return;
        }
    }

    final static java.net.URL a(java.applet.Applet param0, java.net.URL param1, int param2) {
        String var3 = null;
        String var4 = null;
        if (param2 == 0) {
          var3 = null;
          var4 = null;
          if (null != v.field_b) {
            if (v.field_b.equals((Object) (Object) param0.getParameter("settings"))) {
              L0: {
                if (null == sm.field_Ib) {
                  break L0;
                } else {
                  if (sm.field_Ib.equals((Object) (Object) param0.getParameter("session"))) {
                    break L0;
                  } else {
                    var4 = sm.field_Ib;
                    break L0;
                  }
                }
              }
              return vj.a(-1, var4, -116, var3, param1);
            } else {
              L1: {
                var3 = v.field_b;
                var4 = var3;
                var4 = var3;
                if (null == sm.field_Ib) {
                  break L1;
                } else {
                  if (sm.field_Ib.equals((Object) (Object) param0.getParameter("session"))) {
                    break L1;
                  } else {
                    var4 = sm.field_Ib;
                    break L1;
                  }
                }
              }
              return vj.a(-1, var4, -116, var3, param1);
            }
          } else {
            L2: {
              if (null == sm.field_Ib) {
                break L2;
              } else {
                if (sm.field_Ib.equals((Object) (Object) param0.getParameter("session"))) {
                  break L2;
                } else {
                  var4 = sm.field_Ib;
                  break L2;
                }
              }
            }
            return vj.a(-1, var4, -116, var3, param1);
          }
        } else {
          return null;
        }
    }

    public static void c(int param0) {
        field_c = null;
        if (param0 != 0) {
            return;
        }
        field_a = null;
    }

    final void b(byte param0) {
        ((ar) this).field_s.a(2200, ((ar) this).field_h, ((ar) this).field_i);
        if (param0 != 118) {
            ar.a(-117, (byte) 38, 100, 115, 15);
        }
    }

    final qi c(byte param0) {
        qi var2 = null;
        ((ar) this).field_i = gh.field_a;
        ((ar) this).field_h = op.field_c;
        ((ar) this).field_s.a(param0 ^ 2283, ((ar) this).field_g, ((ar) this).field_o);
        oh.field_F = false;
        if (param0 == 115) {
          var2 = id.a(0, 0, (byte) 94, ((ar) this).field_g, gi.field_s, ((ar) this).field_o);
          if (var2 == null) {
            ((ar) this).b((byte) 118);
            return var2;
          } else {
            return var2;
          }
        } else {
          ((ar) this).field_k = -0.6264674663543701f;
          var2 = id.a(0, 0, (byte) 94, ((ar) this).field_g, gi.field_s, ((ar) this).field_o);
          if (var2 != null) {
            return var2;
          } else {
            ((ar) this).b((byte) 118);
            return var2;
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        ((ar) this).field_n = param1;
        ((ar) this).field_r = param2;
        if (param0 != 5) {
            field_c = null;
        }
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Vertigo2.field_L ? 1 : 0;
        var2 = ((ar) this).field_r;
        var4 = 44 / ((param0 - -74) / 50);
        var3 = ((ar) this).field_n;
        if (!((ar) this).a(false)) {
          ((ar) this).field_b = false;
          return;
        } else {
          L0: {
            if (var3 > ((ar) this).field_p) {
              var3 = ((ar) this).field_p;
              break L0;
            } else {
              if (var3 < ((ar) this).field_f) {
                var3 = ((ar) this).field_f;
                if (var2 <= ((ar) this).field_l) {
                  L1: {
                    if (var2 >= ((ar) this).field_q) {
                      break L1;
                    } else {
                      var2 = ((ar) this).field_q;
                      break L1;
                    }
                  }
                  L2: {
                    if (((ar) this).field_k > 0.0f) {
                      var5 = (int)(((ar) this).field_k * (float)var3 + 0.5f);
                      if (var5 > var2) {
                        var3 = (int)((float)var2 / ((ar) this).field_k);
                        break L2;
                      } else {
                        if (var2 > var5) {
                          var2 = var5;
                          if (op.field_c != var2) {
                            ((ar) this).field_s.a(2200, var2, var3);
                            if (((ar) this).field_r > 0) {
                              bk.field_f = (-op.field_c + ((ar) this).field_r) / 2;
                              return;
                            } else {
                              return;
                            }
                          } else {
                            if (var3 != gh.field_a) {
                              ((ar) this).field_s.a(2200, var2, var3);
                              if (((ar) this).field_r > 0) {
                                bk.field_f = (-op.field_c + ((ar) this).field_r) / 2;
                                return;
                              } else {
                                return;
                              }
                            } else {
                              if (((ar) this).field_r > 0) {
                                bk.field_f = (-op.field_c + ((ar) this).field_r) / 2;
                                return;
                              } else {
                                return;
                              }
                            }
                          }
                        } else {
                          if (op.field_c != var2) {
                            ((ar) this).field_s.a(2200, var2, var3);
                            if (((ar) this).field_r <= 0) {
                              return;
                            } else {
                              bk.field_f = (-op.field_c + ((ar) this).field_r) / 2;
                              return;
                            }
                          } else {
                            if (var3 != gh.field_a) {
                              ((ar) this).field_s.a(2200, var2, var3);
                              if (((ar) this).field_r > 0) {
                                bk.field_f = (-op.field_c + ((ar) this).field_r) / 2;
                                return;
                              } else {
                                return;
                              }
                            } else {
                              if (((ar) this).field_r <= 0) {
                                return;
                              } else {
                                bk.field_f = (-op.field_c + ((ar) this).field_r) / 2;
                                return;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                  if (op.field_c != var2) {
                    ((ar) this).field_s.a(2200, var2, var3);
                    if (((ar) this).field_r <= 0) {
                      return;
                    } else {
                      bk.field_f = (-op.field_c + ((ar) this).field_r) / 2;
                      return;
                    }
                  } else {
                    if (var3 != gh.field_a) {
                      ((ar) this).field_s.a(2200, var2, var3);
                      if (((ar) this).field_r <= 0) {
                        return;
                      } else {
                        bk.field_f = (-op.field_c + ((ar) this).field_r) / 2;
                        return;
                      }
                    } else {
                      if (((ar) this).field_r <= 0) {
                        return;
                      } else {
                        bk.field_f = (-op.field_c + ((ar) this).field_r) / 2;
                        return;
                      }
                    }
                  }
                } else {
                  L3: {
                    var2 = ((ar) this).field_l;
                    if (((ar) this).field_k > 0.0f) {
                      var5 = (int)(((ar) this).field_k * (float)var3 + 0.5f);
                      if (var5 > var2) {
                        var3 = (int)((float)var2 / ((ar) this).field_k);
                        break L3;
                      } else {
                        if (var2 > var5) {
                          L4: {
                            var2 = var5;
                            if (op.field_c != var2) {
                              ((ar) this).field_s.a(2200, var2, var3);
                              break L4;
                            } else {
                              if (var3 != gh.field_a) {
                                ((ar) this).field_s.a(2200, var2, var3);
                                if (((ar) this).field_r <= 0) {
                                  return;
                                } else {
                                  bk.field_f = (-op.field_c + ((ar) this).field_r) / 2;
                                  return;
                                }
                              } else {
                                break L4;
                              }
                            }
                          }
                          if (((ar) this).field_r <= 0) {
                            return;
                          } else {
                            bk.field_f = (-op.field_c + ((ar) this).field_r) / 2;
                            return;
                          }
                        } else {
                          L5: {
                            if (op.field_c != var2) {
                              ((ar) this).field_s.a(2200, var2, var3);
                              break L5;
                            } else {
                              if (var3 != gh.field_a) {
                                ((ar) this).field_s.a(2200, var2, var3);
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                          }
                          if (((ar) this).field_r <= 0) {
                            return;
                          } else {
                            bk.field_f = (-op.field_c + ((ar) this).field_r) / 2;
                            return;
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  if (op.field_c != var2) {
                    ((ar) this).field_s.a(2200, var2, var3);
                    if (((ar) this).field_r > 0) {
                      bk.field_f = (-op.field_c + ((ar) this).field_r) / 2;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if (var3 != gh.field_a) {
                      ((ar) this).field_s.a(2200, var2, var3);
                      if (((ar) this).field_r > 0) {
                        bk.field_f = (-op.field_c + ((ar) this).field_r) / 2;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (((ar) this).field_r > 0) {
                        bk.field_f = (-op.field_c + ((ar) this).field_r) / 2;
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                }
              } else {
                break L0;
              }
            }
          }
          if (var2 <= ((ar) this).field_l) {
            L6: {
              if (var2 >= ((ar) this).field_q) {
                break L6;
              } else {
                var2 = ((ar) this).field_q;
                break L6;
              }
            }
            L7: {
              if (((ar) this).field_k > 0.0f) {
                var5 = (int)(((ar) this).field_k * (float)var3 + 0.5f);
                if (var5 > var2) {
                  var3 = (int)((float)var2 / ((ar) this).field_k);
                  break L7;
                } else {
                  if (var2 > var5) {
                    var2 = var5;
                    if (op.field_c != var2) {
                      ((ar) this).field_s.a(2200, var2, var3);
                      if (((ar) this).field_r > 0) {
                        bk.field_f = (-op.field_c + ((ar) this).field_r) / 2;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (var3 != gh.field_a) {
                        ((ar) this).field_s.a(2200, var2, var3);
                        if (((ar) this).field_r > 0) {
                          bk.field_f = (-op.field_c + ((ar) this).field_r) / 2;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        if (((ar) this).field_r > 0) {
                          bk.field_f = (-op.field_c + ((ar) this).field_r) / 2;
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    if (op.field_c != var2) {
                      ((ar) this).field_s.a(2200, var2, var3);
                      if (((ar) this).field_r > 0) {
                        bk.field_f = (-op.field_c + ((ar) this).field_r) / 2;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (var3 != gh.field_a) {
                        ((ar) this).field_s.a(2200, var2, var3);
                        if (((ar) this).field_r > 0) {
                          bk.field_f = (-op.field_c + ((ar) this).field_r) / 2;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        if (((ar) this).field_r > 0) {
                          bk.field_f = (-op.field_c + ((ar) this).field_r) / 2;
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
              } else {
                break L7;
              }
            }
            if (op.field_c != var2) {
              ((ar) this).field_s.a(2200, var2, var3);
              if (((ar) this).field_r <= 0) {
                return;
              } else {
                bk.field_f = (-op.field_c + ((ar) this).field_r) / 2;
                return;
              }
            } else {
              if (var3 != gh.field_a) {
                ((ar) this).field_s.a(2200, var2, var3);
                if (((ar) this).field_r <= 0) {
                  return;
                } else {
                  bk.field_f = (-op.field_c + ((ar) this).field_r) / 2;
                  return;
                }
              } else {
                if (((ar) this).field_r <= 0) {
                  return;
                } else {
                  bk.field_f = (-op.field_c + ((ar) this).field_r) / 2;
                  return;
                }
              }
            }
          } else {
            L8: {
              var2 = ((ar) this).field_l;
              if (((ar) this).field_k > 0.0f) {
                var5 = (int)(((ar) this).field_k * (float)var3 + 0.5f);
                if (var5 > var2) {
                  var3 = (int)((float)var2 / ((ar) this).field_k);
                  break L8;
                } else {
                  if (var2 > var5) {
                    var2 = var5;
                    if (op.field_c != var2) {
                      ((ar) this).field_s.a(2200, var2, var3);
                      if (((ar) this).field_r > 0) {
                        bk.field_f = (-op.field_c + ((ar) this).field_r) / 2;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (var3 != gh.field_a) {
                        ((ar) this).field_s.a(2200, var2, var3);
                        if (((ar) this).field_r > 0) {
                          bk.field_f = (-op.field_c + ((ar) this).field_r) / 2;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        if (((ar) this).field_r > 0) {
                          bk.field_f = (-op.field_c + ((ar) this).field_r) / 2;
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    if (op.field_c != var2) {
                      ((ar) this).field_s.a(2200, var2, var3);
                      if (((ar) this).field_r > 0) {
                        bk.field_f = (-op.field_c + ((ar) this).field_r) / 2;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (var3 != gh.field_a) {
                        ((ar) this).field_s.a(2200, var2, var3);
                        if (((ar) this).field_r > 0) {
                          bk.field_f = (-op.field_c + ((ar) this).field_r) / 2;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        if (((ar) this).field_r > 0) {
                          bk.field_f = (-op.field_c + ((ar) this).field_r) / 2;
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
              } else {
                break L8;
              }
            }
            if (op.field_c != var2) {
              ((ar) this).field_s.a(2200, var2, var3);
              if (((ar) this).field_r <= 0) {
                return;
              } else {
                bk.field_f = (-op.field_c + ((ar) this).field_r) / 2;
                return;
              }
            } else {
              if (var3 != gh.field_a) {
                ((ar) this).field_s.a(2200, var2, var3);
                if (((ar) this).field_r <= 0) {
                  return;
                } else {
                  bk.field_f = (-op.field_c + ((ar) this).field_r) / 2;
                  return;
                }
              } else {
                if (((ar) this).field_r <= 0) {
                  return;
                } else {
                  bk.field_f = (-op.field_c + ((ar) this).field_r) / 2;
                  return;
                }
              }
            }
          }
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4) {
        int var5 = -101 % ((-38 - param1) / 53);
        kd.field_z = param0;
        re.field_g = param3;
        gd.field_k = param2;
        gj.field_y = param4;
    }

    final boolean a(boolean param0) {
        if (!param0) {
          if (((ar) this).field_e <= ci.field_a) {
            if (-1 >= q.field_y) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          ((ar) this).a(41);
          if (((ar) this).field_e <= ci.field_a) {
            if (-1 <= q.field_y) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    private ar() throws Throwable {
        throw new Error();
    }

    final static ch b(int param0) {
        if (un.field_Hb == l.field_a) {
          throw new IllegalStateException();
        } else {
          if (param0 == 0) {
            if (un.field_Hb != oe.field_qb) {
              return null;
            } else {
              un.field_Hb = l.field_a;
              return mp.field_f;
            }
          } else {
            ar.a(117, (byte) 91, 7, 99, -65);
            if (un.field_Hb != oe.field_qb) {
              return null;
            } else {
              un.field_Hb = l.field_a;
              return mp.field_f;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Unlock in Standard Game";
        field_t = false;
    }
}
