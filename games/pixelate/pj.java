/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj {
    static tf field_a;
    private int field_h;
    private tf field_e;
    static ak field_i;
    boolean field_f;
    private int field_b;
    private int field_g;
    private int field_d;
    private int field_j;
    private int field_c;

    final static void a(byte param0, boolean param1) {
        int var3 = 0;
        var3 = Pixelate.field_H ? 1 : 0;
        if (param1) {
          bm.field_o = false;
          if (param1) {
            if (0 >= oo.field_b) {
              if (vn.field_g > 0) {
                vn.field_g = vn.field_g - 1;
                return;
              } else {
                if (0 < h.field_W) {
                  h.field_W = h.field_W - 1;
                  return;
                } else {
                  return;
                }
              }
            } else {
              oo.field_b = oo.field_b - 1;
              return;
            }
          } else {
            if (io.field_c == null) {
              if (null == bn.field_S) {
                bm.field_o = false;
                if (vn.field_g > 0) {
                  vn.field_g = vn.field_g - 1;
                  return;
                } else {
                  if (h.field_W > 0) {
                    h.field_W = h.field_W - 1;
                    return;
                  } else {
                    if (~qh.field_c < ~oo.field_b) {
                      if (oo.field_b == 0) {
                        gd.a((byte) -7);
                        oo.field_b = oo.field_b + 1;
                        return;
                      } else {
                        oo.field_b = oo.field_b + 1;
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
              } else {
                if (oo.field_b <= 0) {
                  if (h.field_W <= 0) {
                    if (~vn.field_g > ~qh.field_c) {
                      if (vn.field_g == 0) {
                        nl.a(true, -71);
                        vn.field_g = vn.field_g + 1;
                        return;
                      } else {
                        vn.field_g = vn.field_g + 1;
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    h.field_W = h.field_W - 1;
                    return;
                  }
                } else {
                  oo.field_b = oo.field_b - 1;
                  return;
                }
              }
            } else {
              if (0 >= oo.field_b) {
                if (vn.field_g <= 0) {
                  if (~qh.field_c < ~h.field_W) {
                    L0: {
                      if (0 == h.field_W) {
                        nl.a(false, -102);
                        break L0;
                      } else {
                        break L0;
                      }
                    }
                    h.field_W = h.field_W + 1;
                    return;
                  } else {
                    return;
                  }
                } else {
                  vn.field_g = vn.field_g - 1;
                  return;
                }
              } else {
                oo.field_b = oo.field_b - 1;
                return;
              }
            }
          }
        } else {
          if (io.field_c == null) {
            bm.field_o = false;
            if (param1) {
              if (0 >= oo.field_b) {
                if (vn.field_g > 0) {
                  vn.field_g = vn.field_g - 1;
                  return;
                } else {
                  if (0 < h.field_W) {
                    h.field_W = h.field_W - 1;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                oo.field_b = oo.field_b - 1;
                return;
              }
            } else {
              if (io.field_c == null) {
                if (null == bn.field_S) {
                  bm.field_o = false;
                  if (vn.field_g > 0) {
                    vn.field_g = vn.field_g - 1;
                    return;
                  } else {
                    if (h.field_W > 0) {
                      h.field_W = h.field_W - 1;
                      return;
                    } else {
                      if (~qh.field_c < ~oo.field_b) {
                        if (oo.field_b == 0) {
                          gd.a((byte) -7);
                          oo.field_b = oo.field_b + 1;
                          return;
                        } else {
                          oo.field_b = oo.field_b + 1;
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  if (oo.field_b <= 0) {
                    if (h.field_W <= 0) {
                      if (~vn.field_g > ~qh.field_c) {
                        if (vn.field_g == 0) {
                          nl.a(true, -71);
                          vn.field_g = vn.field_g + 1;
                          return;
                        } else {
                          vn.field_g = vn.field_g + 1;
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      h.field_W = h.field_W - 1;
                      return;
                    }
                  } else {
                    oo.field_b = oo.field_b - 1;
                    return;
                  }
                }
              } else {
                if (0 >= oo.field_b) {
                  if (vn.field_g <= 0) {
                    if (~qh.field_c < ~h.field_W) {
                      L1: {
                        if (0 == h.field_W) {
                          nl.a(false, -102);
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      h.field_W = h.field_W + 1;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    vn.field_g = vn.field_g - 1;
                    return;
                  }
                } else {
                  oo.field_b = oo.field_b - 1;
                  return;
                }
              }
            }
          } else {
            if (param1) {
              if (0 >= oo.field_b) {
                if (vn.field_g > 0) {
                  vn.field_g = vn.field_g - 1;
                  return;
                } else {
                  if (0 < h.field_W) {
                    h.field_W = h.field_W - 1;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                oo.field_b = oo.field_b - 1;
                return;
              }
            } else {
              if (io.field_c == null) {
                if (null == bn.field_S) {
                  bm.field_o = false;
                  if (vn.field_g > 0) {
                    vn.field_g = vn.field_g - 1;
                    return;
                  } else {
                    if (h.field_W > 0) {
                      h.field_W = h.field_W - 1;
                      return;
                    } else {
                      if (~qh.field_c < ~oo.field_b) {
                        if (oo.field_b == 0) {
                          gd.a((byte) -7);
                          oo.field_b = oo.field_b + 1;
                          return;
                        } else {
                          oo.field_b = oo.field_b + 1;
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  if (oo.field_b <= 0) {
                    if (h.field_W <= 0) {
                      if (~vn.field_g > ~qh.field_c) {
                        if (vn.field_g == 0) {
                          nl.a(true, -71);
                          vn.field_g = vn.field_g + 1;
                          return;
                        } else {
                          vn.field_g = vn.field_g + 1;
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      h.field_W = h.field_W - 1;
                      return;
                    }
                  } else {
                    oo.field_b = oo.field_b - 1;
                    return;
                  }
                }
              } else {
                if (0 >= oo.field_b) {
                  if (vn.field_g <= 0) {
                    if (~qh.field_c < ~h.field_W) {
                      L2: {
                        if (0 == h.field_W) {
                          nl.a(false, -102);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      h.field_W = h.field_W + 1;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    vn.field_g = vn.field_g - 1;
                    return;
                  }
                } else {
                  oo.field_b = oo.field_b - 1;
                  return;
                }
              }
            }
          }
        }
    }

    final void a(String param0, int param1, int param2, int param3) {
        int var5_int = 0;
        try {
            ((pj) this).field_h = 0;
            ((pj) this).field_c = param1;
            if (param2 != -1379417087) {
                ((pj) this).field_b = -57;
            }
            ((pj) this).field_g = 0;
            ((pj) this).field_d = param3;
            ((pj) this).field_f = false;
            ((pj) this).field_j = 0;
            var5_int = rk.field_e.c(param0);
            if (!(var5_int <= ((pj) this).field_e.field_A)) {
                ((pj) this).field_e = new tf(10 + var5_int, ((pj) this).field_e.field_B);
            }
            ((pj) this).field_e.c();
            t.d();
            rk.field_e.b(param0, ((pj) this).field_e.field_A >> 1, ((pj) this).field_e.field_B, 0, -1);
            qa.field_f.a(19692);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "pj.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static int a(int param0, int param1, int param2, byte param3) {
        if (param3 <= 19) {
            field_a = null;
            if (t.field_d >= param1 - -param2 - -param0) {
                return param1 + param2;
            }
            if (!(0 > -param0 + param1)) {
                return -param0 + param1;
            }
            return t.field_d + -param0;
        }
        if (t.field_d >= param1 - -param2 - -param0) {
            return param1 + param2;
        }
        if (!(0 > -param0 + param1)) {
            return -param0 + param1;
        }
        return t.field_d + -param0;
    }

    final void a(byte param0) {
        int var3 = 0;
        var3 = Pixelate.field_H ? 1 : 0;
        if (param0 <= -22) {
          if (((pj) this).field_f) {
            return;
          } else {
            if (((pj) this).field_h >= 8) {
              if (66 <= ((pj) this).field_h) {
                if (0 >= ((pj) this).field_b) {
                  return;
                } else {
                  ((pj) this).field_e.c(((pj) this).field_c - (((pj) this).field_j >> 1), -(((pj) this).field_g >> 1) + ((pj) this).field_d, ((pj) this).field_j, ((pj) this).field_g, ((pj) this).field_b);
                  return;
                }
              } else {
                ((pj) this).field_e.b(((pj) this).field_c + -(((pj) this).field_e.field_A >> 1), ((pj) this).field_d - (((pj) this).field_e.field_B >> 1));
                return;
              }
            } else {
              ((pj) this).field_e.d(-(((pj) this).field_j >> 1) + ((pj) this).field_c, -(((pj) this).field_g >> 1) + ((pj) this).field_d, ((pj) this).field_j, ((pj) this).field_g);
              return;
            }
          }
        } else {
          ((pj) this).field_j = -90;
          if (((pj) this).field_f) {
            return;
          } else {
            if (((pj) this).field_h >= 8) {
              if (66 <= ((pj) this).field_h) {
                if (0 >= ((pj) this).field_b) {
                  return;
                } else {
                  ((pj) this).field_e.c(((pj) this).field_c - (((pj) this).field_j >> 1), -(((pj) this).field_g >> 1) + ((pj) this).field_d, ((pj) this).field_j, ((pj) this).field_g, ((pj) this).field_b);
                  return;
                }
              } else {
                ((pj) this).field_e.b(((pj) this).field_c + -(((pj) this).field_e.field_A >> 1), ((pj) this).field_d - (((pj) this).field_e.field_B >> 1));
                return;
              }
            } else {
              ((pj) this).field_e.d(-(((pj) this).field_j >> 1) + ((pj) this).field_c, -(((pj) this).field_g >> 1) + ((pj) this).field_d, ((pj) this).field_j, ((pj) this).field_g);
              return;
            }
          }
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = Pixelate.field_H ? 1 : 0;
        if (((pj) this).field_f) {
          return;
        } else {
          ((pj) this).field_h = ((pj) this).field_h + 1;
          if (((pj) this).field_h < 8) {
            ((pj) this).field_g = ((pj) this).field_h * ((pj) this).field_e.field_B / 8;
            ((pj) this).field_j = ((pj) this).field_h * ((pj) this).field_e.field_A / 8;
            if (param0 > -55) {
              int discarded$4 = pj.a(31, 2, 48, (byte) 8);
              return;
            } else {
              return;
            }
          } else {
            if (66 <= ((pj) this).field_h) {
              if (((pj) this).field_h >= 76) {
                ((pj) this).field_f = true;
                if (param0 > -55) {
                  int discarded$5 = pj.a(31, 2, 48, (byte) 8);
                  return;
                } else {
                  return;
                }
              } else {
                var2 = -58 + (-8 + ((pj) this).field_h);
                ((pj) this).field_g = ((pj) this).field_e.field_B;
                ((pj) this).field_j = (var2 << 4) + ((pj) this).field_e.field_A;
                ((pj) this).field_b = (10 - var2) * 256 / 10;
                if (param0 <= -55) {
                  return;
                } else {
                  int discarded$6 = pj.a(31, 2, 48, (byte) 8);
                  return;
                }
              }
            } else {
              if (param0 <= -55) {
                return;
              } else {
                int discarded$7 = pj.a(31, 2, 48, (byte) 8);
                return;
              }
            }
          }
        }
    }

    pj() {
        ((pj) this).field_h = 0;
        ((pj) this).field_e = new tf(320, 21);
        ((pj) this).field_f = true;
    }

    public static void a(boolean param0) {
        field_a = null;
        field_i = null;
    }

    static {
    }
}
