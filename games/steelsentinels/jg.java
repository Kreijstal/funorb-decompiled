/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg {
    static gh[] field_h;
    private sm field_c;
    private int field_i;
    private int field_u;
    private int field_e;
    private boolean field_v;
    private int field_g;
    private int field_m;
    private int field_o;
    private int field_a;
    private int field_w;
    private int field_p;
    private int field_n;
    private float field_s;
    private int field_d;
    static int field_f;
    static int[] field_l;
    private int field_r;
    static boolean field_j;
    private int field_q;
    private int field_b;
    static String[] field_t;
    private int field_k;

    final nn b(int param0) {
        nn var2 = null;
        ((jg) this).field_g = li.field_A;
        ((jg) this).field_o = na.field_i;
        ((jg) this).field_c.a(((jg) this).field_b, true, ((jg) this).field_a);
        if (param0 == 32472) {
          ti.field_x = false;
          var2 = hc.a(0, hb.field_i, 0, ((jg) this).field_a, 0, ((jg) this).field_b);
          if (var2 == null) {
            ((jg) this).a(15481);
            return var2;
          } else {
            return var2;
          }
        } else {
          jg.a(-128, -3);
          ti.field_x = false;
          var2 = hc.a(0, hb.field_i, 0, ((jg) this).field_a, 0, ((jg) this).field_b);
          if (var2 != null) {
            return var2;
          } else {
            ((jg) this).a(15481);
            return var2;
          }
        }
    }

    private final void c() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = SteelSentinels.field_G;
        var2 = ((jg) this).field_k;
        var3 = ((jg) this).field_i;
        if (((jg) this).a((byte) 106)) {
          L0: {
            if (((jg) this).field_u >= var2) {
              if (((jg) this).field_w > var2) {
                var2 = ((jg) this).field_w;
                break L0;
              } else {
                if (((jg) this).field_q >= var3) {
                  L1: {
                    if (((jg) this).field_e <= var3) {
                      break L1;
                    } else {
                      var3 = ((jg) this).field_e;
                      break L1;
                    }
                  }
                  if (0.0f < ((jg) this).field_s) {
                    var4 = (int)(((jg) this).field_s * (float)var3 + 0.5f);
                    if (var4 <= var2) {
                      L2: {
                        if (var2 <= var4) {
                          break L2;
                        } else {
                          var2 = var4;
                          break L2;
                        }
                      }
                      if (var2 == na.field_i) {
                        if (li.field_A == var3) {
                          L3: {
                            if (-1 < ((jg) this).field_k) {
                              kf.field_p = (((jg) this).field_k - na.field_i) / 2;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          return;
                        } else {
                          L4: {
                            ((jg) this).field_c.a(var2, true, var3);
                            if (-1 > ((jg) this).field_k) {
                              kf.field_p = (((jg) this).field_k - na.field_i) / 2;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          return;
                        }
                      } else {
                        L5: {
                          ((jg) this).field_c.a(var2, true, var3);
                          if (((jg) this).field_k > 0) {
                            kf.field_p = (((jg) this).field_k - na.field_i) / 2;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        return;
                      }
                    } else {
                      var3 = (int)((float)var2 / ((jg) this).field_s);
                      if (var2 == na.field_i) {
                        if (li.field_A == var3) {
                          L6: {
                            if (-1 < ((jg) this).field_k) {
                              kf.field_p = (((jg) this).field_k - na.field_i) / 2;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          return;
                        } else {
                          L7: {
                            ((jg) this).field_c.a(var2, true, var3);
                            if (-1 > ((jg) this).field_k) {
                              kf.field_p = (((jg) this).field_k - na.field_i) / 2;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          return;
                        }
                      } else {
                        L8: {
                          ((jg) this).field_c.a(var2, true, var3);
                          if (((jg) this).field_k > 0) {
                            kf.field_p = (((jg) this).field_k - na.field_i) / 2;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        return;
                      }
                    }
                  } else {
                    if (var2 == na.field_i) {
                      if (li.field_A == var3) {
                        L9: {
                          if (-1 < ((jg) this).field_k) {
                            kf.field_p = (((jg) this).field_k - na.field_i) / 2;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        return;
                      } else {
                        L10: {
                          ((jg) this).field_c.a(var2, true, var3);
                          if (-1 > ((jg) this).field_k) {
                            kf.field_p = (((jg) this).field_k - na.field_i) / 2;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        return;
                      }
                    } else {
                      L11: {
                        ((jg) this).field_c.a(var2, true, var3);
                        if (((jg) this).field_k > 0) {
                          kf.field_p = (((jg) this).field_k - na.field_i) / 2;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      return;
                    }
                  }
                } else {
                  L12: {
                    var3 = ((jg) this).field_q;
                    if (0.0f < ((jg) this).field_s) {
                      var4 = (int)(((jg) this).field_s * (float)var3 + 0.5f);
                      if (var4 <= var2) {
                        if (var2 <= var4) {
                          break L12;
                        } else {
                          var2 = var4;
                          break L12;
                        }
                      } else {
                        var3 = (int)((float)var2 / ((jg) this).field_s);
                        break L12;
                      }
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (var2 != na.field_i) {
                      ((jg) this).field_c.a(var2, true, var3);
                      break L13;
                    } else {
                      if (li.field_A != var3) {
                        ((jg) this).field_c.a(var2, true, var3);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                  L14: {
                    if (((jg) this).field_k > 0) {
                      kf.field_p = (((jg) this).field_k - na.field_i) / 2;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  return;
                }
              }
            } else {
              var2 = ((jg) this).field_u;
              break L0;
            }
          }
          if (((jg) this).field_q >= var3) {
            L15: {
              if (((jg) this).field_e <= var3) {
                break L15;
              } else {
                var3 = ((jg) this).field_e;
                break L15;
              }
            }
            if (0.0f < ((jg) this).field_s) {
              var4 = (int)(((jg) this).field_s * (float)var3 + 0.5f);
              if (var4 <= var2) {
                L16: {
                  if (var2 <= var4) {
                    break L16;
                  } else {
                    var2 = var4;
                    break L16;
                  }
                }
                if (var2 != na.field_i) {
                  L17: {
                    ((jg) this).field_c.a(var2, true, var3);
                    if (((jg) this).field_k > 0) {
                      kf.field_p = (((jg) this).field_k - na.field_i) / 2;
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  return;
                } else {
                  if (li.field_A != var3) {
                    L18: {
                      ((jg) this).field_c.a(var2, true, var3);
                      if (((jg) this).field_k > 0) {
                        kf.field_p = (((jg) this).field_k - na.field_i) / 2;
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    return;
                  } else {
                    L19: {
                      if (((jg) this).field_k > 0) {
                        kf.field_p = (((jg) this).field_k - na.field_i) / 2;
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    return;
                  }
                }
              } else {
                var3 = (int)((float)var2 / ((jg) this).field_s);
                if (var2 != na.field_i) {
                  L20: {
                    ((jg) this).field_c.a(var2, true, var3);
                    if (((jg) this).field_k > 0) {
                      kf.field_p = (((jg) this).field_k - na.field_i) / 2;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  return;
                } else {
                  if (li.field_A != var3) {
                    L21: {
                      ((jg) this).field_c.a(var2, true, var3);
                      if (((jg) this).field_k > 0) {
                        kf.field_p = (((jg) this).field_k - na.field_i) / 2;
                        break L21;
                      } else {
                        break L21;
                      }
                    }
                    return;
                  } else {
                    L22: {
                      if (((jg) this).field_k > 0) {
                        kf.field_p = (((jg) this).field_k - na.field_i) / 2;
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                    return;
                  }
                }
              }
            } else {
              if (var2 != na.field_i) {
                L23: {
                  ((jg) this).field_c.a(var2, true, var3);
                  if (((jg) this).field_k > 0) {
                    kf.field_p = (((jg) this).field_k - na.field_i) / 2;
                    break L23;
                  } else {
                    break L23;
                  }
                }
                return;
              } else {
                if (li.field_A != var3) {
                  L24: {
                    ((jg) this).field_c.a(var2, true, var3);
                    if (((jg) this).field_k > 0) {
                      kf.field_p = (((jg) this).field_k - na.field_i) / 2;
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  return;
                } else {
                  L25: {
                    if (((jg) this).field_k > 0) {
                      kf.field_p = (((jg) this).field_k - na.field_i) / 2;
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  return;
                }
              }
            }
          } else {
            var3 = ((jg) this).field_q;
            if (0.0f < ((jg) this).field_s) {
              var4 = (int)(((jg) this).field_s * (float)var3 + 0.5f);
              if (var4 <= var2) {
                L26: {
                  if (var2 <= var4) {
                    break L26;
                  } else {
                    var2 = var4;
                    break L26;
                  }
                }
                if (var2 == na.field_i) {
                  if (li.field_A != var3) {
                    L27: {
                      ((jg) this).field_c.a(var2, true, var3);
                      if (-1 > ((jg) this).field_k) {
                        kf.field_p = (((jg) this).field_k - na.field_i) / 2;
                        break L27;
                      } else {
                        break L27;
                      }
                    }
                    return;
                  } else {
                    L28: {
                      if (-1 < ((jg) this).field_k) {
                        kf.field_p = (((jg) this).field_k - na.field_i) / 2;
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    return;
                  }
                } else {
                  L29: {
                    ((jg) this).field_c.a(var2, true, var3);
                    if (((jg) this).field_k > 0) {
                      kf.field_p = (((jg) this).field_k - na.field_i) / 2;
                      break L29;
                    } else {
                      break L29;
                    }
                  }
                  return;
                }
              } else {
                L30: {
                  var3 = (int)((float)var2 / ((jg) this).field_s);
                  if (var2 != na.field_i) {
                    ((jg) this).field_c.a(var2, true, var3);
                    break L30;
                  } else {
                    if (li.field_A != var3) {
                      ((jg) this).field_c.a(var2, true, var3);
                      break L30;
                    } else {
                      break L30;
                    }
                  }
                }
                L31: {
                  if (((jg) this).field_k > 0) {
                    kf.field_p = (((jg) this).field_k - na.field_i) / 2;
                    break L31;
                  } else {
                    break L31;
                  }
                }
                return;
              }
            } else {
              L32: {
                if (var2 != na.field_i) {
                  ((jg) this).field_c.a(var2, true, var3);
                  break L32;
                } else {
                  if (li.field_A != var3) {
                    ((jg) this).field_c.a(var2, true, var3);
                    break L32;
                  } else {
                    break L32;
                  }
                }
              }
              L33: {
                if (((jg) this).field_k > 0) {
                  kf.field_p = (((jg) this).field_k - na.field_i) / 2;
                  break L33;
                } else {
                  break L33;
                }
              }
              return;
            }
          }
        } else {
          ((jg) this).field_v = false;
          return;
        }
    }

    final static int[] a(boolean param0) {
        if (!param0) {
            jg.a(57, -61);
            return new int[8];
        }
        return new int[8];
    }

    final void b(int param0, byte param1, int param2) {
        ((jg) this).field_i = param0;
        if (param1 != -114) {
            return;
        }
        ((jg) this).field_k = param2;
    }

    final static void a(int param0, byte param1, int param2) {
        int var4 = -117 / ((-11 - param1) / 35);
        kj var3 = mm.field_g;
        var3.a(param2, (byte) -117);
        var3.a((byte) 124, 3);
        var3.a((byte) 109, 8);
        var3.d(param0, 80);
    }

    final boolean a(byte param0) {
        int var2 = 0;
        var2 = -28 / ((-8 - param0) / 49);
        if (ed.field_a >= ((jg) this).field_p) {
          if (rd.field_b <= 0) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    public static void b() {
        field_h = null;
        field_l = null;
        int var1 = 86;
        field_t = null;
    }

    final void b(boolean param0) {
        Object var3 = null;
        if (wb.field_c == null) {
          if (!param0) {
            L0: {
              if (0 >= rd.field_b) {
                ((jg) this).field_v = false;
                break L0;
              } else {
                break L0;
              }
            }
            if (!((jg) this).field_v) {
              if (na.field_i >= ((jg) this).field_k) {
                if (((jg) this).field_k <= 0) {
                  if (((jg) this).field_r != na.field_i) {
                    ((jg) this).field_c.a(((jg) this).field_r, true, ((jg) this).field_d);
                    return;
                  } else {
                    if (li.field_A == ((jg) this).field_d) {
                      return;
                    } else {
                      ((jg) this).field_c.a(((jg) this).field_r, true, ((jg) this).field_d);
                      return;
                    }
                  }
                } else {
                  kf.field_p = 0;
                  if (((jg) this).field_r != na.field_i) {
                    ((jg) this).field_c.a(((jg) this).field_r, true, ((jg) this).field_d);
                    return;
                  } else {
                    if (li.field_A == ((jg) this).field_d) {
                      return;
                    } else {
                      ((jg) this).field_c.a(((jg) this).field_r, true, ((jg) this).field_d);
                      return;
                    }
                  }
                }
              } else {
                kf.field_p = (((jg) this).field_k - na.field_i) / 2;
                if (((jg) this).field_r != na.field_i) {
                  ((jg) this).field_c.a(((jg) this).field_r, true, ((jg) this).field_d);
                  return;
                } else {
                  if (li.field_A == ((jg) this).field_d) {
                    return;
                  } else {
                    ((jg) this).field_c.a(((jg) this).field_r, true, ((jg) this).field_d);
                    return;
                  }
                }
              }
            } else {
              int fieldTemp$4 = ((jg) this).field_m - 1;
              ((jg) this).field_m = ((jg) this).field_m - 1;
              if (fieldTemp$4 > 0) {
                return;
              } else {
                ((jg) this).field_m = ((jg) this).field_n;
                if (((jg) this).field_p > ed.field_a) {
                  ((jg) this).field_v = false;
                  return;
                } else {
                  int discarded$5 = -95;
                  this.c();
                  return;
                }
              }
            }
          } else {
            L1: {
              var3 = null;
              jg.a((String) null, -86);
              if (0 >= rd.field_b) {
                ((jg) this).field_v = false;
                break L1;
              } else {
                break L1;
              }
            }
            if (!((jg) this).field_v) {
              if (na.field_i >= ((jg) this).field_k) {
                if (((jg) this).field_k > 0) {
                  kf.field_p = 0;
                  if (((jg) this).field_r == na.field_i) {
                    if (li.field_A != ((jg) this).field_d) {
                      ((jg) this).field_c.a(((jg) this).field_r, true, ((jg) this).field_d);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    ((jg) this).field_c.a(((jg) this).field_r, true, ((jg) this).field_d);
                    return;
                  }
                } else {
                  if (((jg) this).field_r == na.field_i) {
                    if (li.field_A != ((jg) this).field_d) {
                      ((jg) this).field_c.a(((jg) this).field_r, true, ((jg) this).field_d);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    ((jg) this).field_c.a(((jg) this).field_r, true, ((jg) this).field_d);
                    return;
                  }
                }
              } else {
                kf.field_p = (((jg) this).field_k - na.field_i) / 2;
                if (((jg) this).field_r == na.field_i) {
                  if (li.field_A == ((jg) this).field_d) {
                    return;
                  } else {
                    ((jg) this).field_c.a(((jg) this).field_r, true, ((jg) this).field_d);
                    return;
                  }
                } else {
                  ((jg) this).field_c.a(((jg) this).field_r, true, ((jg) this).field_d);
                  return;
                }
              }
            } else {
              int fieldTemp$6 = ((jg) this).field_m - 1;
              ((jg) this).field_m = ((jg) this).field_m - 1;
              if (fieldTemp$6 > 0) {
                return;
              } else {
                ((jg) this).field_m = ((jg) this).field_n;
                if (((jg) this).field_p > ed.field_a) {
                  ((jg) this).field_v = false;
                  return;
                } else {
                  int discarded$7 = -95;
                  this.c();
                  return;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(String param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            var2_int = oh.field_f;
            var3 = pi.field_c;
            var4 = bd.field_f.field_L.b(param0, 500);
            var5 = 6 + bd.field_f.field_L.a(param0, 500);
            var6 = 2 + db.field_b * var4;
            var7 = dl.a(12, 127, var2_int, var5);
            var8 = ol.a(var3, 0, 20, var6);
            pb.h(var7, var8, var5, var6, 0);
            pb.a(1 + var7, 1 + var8, -2 + var5, var6 + -2, 16777088);
            int discarded$0 = bd.field_f.field_L.a(param0, 3 + var7, param1 + var8 - (-km.field_g - -bd.field_f.field_L.field_G), 500, 1000, 0, -1, 0, 0, db.field_b);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "jg.L(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = SteelSentinels.field_G;
        try {
          L0: {
            var6_int = param5 * pb.field_c + param2;
            var7 = param5;
            L1: while (true) {
              if (var7 >= 480) {
                break L0;
              } else {
                var8 = 255 * (480 + -var7) / (-param5 + 480);
                var9 = 255 * (var7 + -param5) / (-param5 + 480);
                var10 = (var8 * 0 + var9 * 48) / 256;
                pb.field_g[var6_int] = 65793 * var10;
                var6_int = var6_int + pb.field_c;
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var6, "jg.I(" + 0 + 44 + 48 + 44 + param2 + 44 + 0 + 44 + 480 + 44 + param5 + 41);
        }
    }

    final static void a(int param0, int param1) {
        ud.field_w = i.field_d[param0];
        jk.field_g = nk.field_X[param0];
        nm.field_t = si.field_j[param0];
        if (param1 != 1000) {
            jg.a(126, (byte) -10, -36);
        }
    }

    final void a(int param0) {
        if (param0 != 15481) {
          int[] discarded$2 = jg.a(true);
          ((jg) this).field_c.a(((jg) this).field_o, true, ((jg) this).field_g);
          return;
        } else {
          ((jg) this).field_c.a(((jg) this).field_o, true, ((jg) this).field_g);
          return;
        }
    }

    private jg() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new gh[12];
        field_j = false;
        field_t = new String[]{"Ballistics Master", "Missile Assault", "Ballistic Assault", "Missile Defender", "Counter Attack", "Air Defender", "Mechavity", "Perfection", "Smelter", "Master of War", "Tag Rampage", "Gunning for Tags", "Fusion Tag", "Tagged It", "Energising Tag", "Team Tagger", "Destroyer", "Iron Sentinel", "Steel Sentinel", "Alloy Sentinel", "Titanium Sentinel", "Platinum Sentinel", "Adamant Sentinel", "Diamond Sentinel", "Comeback", "And It Costs How Much?", "Vengeance", "Defender", "Master Defender", "Boomerang", "Slingshot", "The Big Red Button", "Ilolian Hero", "Silver Winner", "Gold Winner", "Silver Hero", "Gold Hero", "Conqueror", "Pterocide"};
    }
}
