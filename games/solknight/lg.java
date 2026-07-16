/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg extends wd {
    private sk field_x;
    private int field_n;
    private va field_h;
    private bi field_v;
    private byte[] field_u;
    private int field_o;
    private byte[] field_t;
    private ha field_j;
    private qd field_w;
    private int field_k;
    private bi field_f;
    private ae field_p;
    static dl field_l;
    private boolean field_s;
    static String field_r;
    private nc field_e;
    private boolean field_y;
    private nc field_m;
    private int field_q;
    private long field_g;
    private boolean field_i;

    private final sk a(int param0, byte param1, int param2) {
        Object var4 = null;
        byte[] var5 = null;
        Exception var6_ref_Exception = null;
        int var6 = 0;
        int var7_int = 0;
        byte[] var7 = null;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object stackIn_60_0 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_59_0 = null;
        L0: {
          var10 = SolKnight.field_L ? 1 : 0;
          var4 = (Object) (Object) (sk) (Object) ((lg) this).field_w.a(true, (long)param0);
          if (var4 == null) {
            break L0;
          } else {
            if (-1 != (param2 ^ -1)) {
              break L0;
            } else {
              if (((sk) var4).field_r) {
                break L0;
              } else {
                if (!((sk) var4).field_m) {
                  break L0;
                } else {
                  ((sk) var4).c(param1 ^ 10);
                  var4 = null;
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (var4 == null) {
            L2: {
              if (0 != param2) {
                if (-2 == (param2 ^ -1)) {
                  if (((lg) this).field_v == null) {
                    throw new RuntimeException();
                  } else {
                    var4 = (Object) (Object) ((lg) this).field_p.a(-72, ((lg) this).field_v, param0);
                    break L2;
                  }
                } else {
                  if ((param2 ^ -1) != -3) {
                    throw new RuntimeException();
                  } else {
                    if (((lg) this).field_v != null) {
                      if (((lg) this).field_u[param0] != -1) {
                        throw new RuntimeException();
                      } else {
                        if (!((lg) this).field_h.a(param1 ^ -5868)) {
                          var4 = (Object) (Object) ((lg) this).field_h.a(((lg) this).field_o, false, param0, param1 ^ 437409504, (byte) 2);
                          break L2;
                        } else {
                          return null;
                        }
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                }
              } else {
                L3: {
                  if (((lg) this).field_v == null) {
                    break L3;
                  } else {
                    if ((((lg) this).field_u[param0] ^ -1) != 0) {
                      var4 = (Object) (Object) ((lg) this).field_p.a(((lg) this).field_v, param0, -112);
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (!((lg) this).field_h.b(-21)) {
                  var4 = (Object) (Object) ((lg) this).field_h.a(((lg) this).field_o, true, param0, 437409504, (byte) 2);
                  break L2;
                } else {
                  return null;
                }
              }
            }
            ((lg) this).field_w.a((byte) 126, (gg) var4, (long)param0);
            break L1;
          } else {
            break L1;
          }
        }
        L4: {
          if (param1 == 0) {
            break L4;
          } else {
            ha discarded$2 = ((lg) this).c(-104);
            break L4;
          }
        }
        if (!((sk) var4).field_m) {
          var5 = ((sk) var4).f(0);
          if (!(var4 instanceof md)) {
            L5: {
              if (var5 == null) {
                break L5;
              } else {
                if (2 < var5.length) {
                  gl.field_g.reset();
                  gl.field_g.update(var5, 0, var5.length - 2);
                  var6 = (int)gl.field_g.getValue();
                  if (var6 != ((lg) this).field_j.field_b[param0]) {
                    throw new RuntimeException();
                  } else {
                    L6: {
                      if (null == ((lg) this).field_j.field_q) {
                        break L6;
                      } else {
                        if (null != ((lg) this).field_j.field_q[param0]) {
                          var7 = ((lg) this).field_j.field_q[param0];
                          var8 = q.a(var5.length - 2, 0, 100, var5);
                          var11 = 0;
                          var9 = var11;
                          L7: while (true) {
                            if (64 <= var11) {
                              break L6;
                            } else {
                              if (var7[var11] == var8[var11]) {
                                var11++;
                                continue L7;
                              } else {
                                throw new RuntimeException();
                              }
                            }
                          }
                        } else {
                          break L6;
                        }
                      }
                    }
                    L8: {
                      ((lg) this).field_h.field_l = 0;
                      ((lg) this).field_h.field_c = 0;
                      var5[-2 + var5.length] = (byte)(((lg) this).field_j.field_s[param0] >>> 80469384);
                      var5[var5.length - 1] = (byte)((lg) this).field_j.field_s[param0];
                      if (null != ((lg) this).field_v) {
                        md discarded$3 = ((lg) this).field_p.a(95, param0, ((lg) this).field_v, var5);
                        if ((((lg) this).field_u[param0] ^ -1) == -2) {
                          break L8;
                        } else {
                          ((lg) this).field_u[param0] = (byte) 1;
                          break L8;
                        }
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (((sk) var4).field_r) {
                        break L9;
                      } else {
                        ((sk) var4).c(param1 + 10);
                        break L9;
                      }
                    }
                    return (sk) var4;
                  }
                } else {
                  break L5;
                }
              }
            }
            throw new RuntimeException();
          } else {
            try {
              L10: {
                L11: {
                  if (var5 == null) {
                    break L11;
                  } else {
                    if (-3 <= (var5.length ^ -1)) {
                      break L11;
                    } else {
                      gl.field_g.reset();
                      gl.field_g.update(var5, 0, -2 + var5.length);
                      var6 = (int)gl.field_g.getValue();
                      if (var6 == ((lg) this).field_j.field_b[param0]) {
                        L12: {
                          if (((lg) this).field_j.field_q == null) {
                            break L12;
                          } else {
                            if (((lg) this).field_j.field_q[param0] != null) {
                              var7 = ((lg) this).field_j.field_q[param0];
                              var8 = q.a(var5.length + -2, 0, -110, var5);
                              var9 = 0;
                              L13: while (true) {
                                if (var9 >= 64) {
                                  break L12;
                                } else {
                                  if (var7[var9] == var8[var9]) {
                                    var9++;
                                    continue L13;
                                  } else {
                                    throw new RuntimeException();
                                  }
                                }
                              }
                            } else {
                              break L12;
                            }
                          }
                        }
                        var7_int = ((var5[var5.length + -2] & 255) << 924867656) - -(255 & var5[-1 + var5.length]);
                        if (var7_int == (((lg) this).field_j.field_s[param0] & 65535)) {
                          L14: {
                            if (-2 == (((lg) this).field_u[param0] ^ -1)) {
                              break L14;
                            } else {
                              L15: {
                                if (((lg) this).field_u[param0] != 0) {
                                  break L15;
                                } else {
                                  break L15;
                                }
                              }
                              ((lg) this).field_u[param0] = (byte) 1;
                              break L14;
                            }
                          }
                          L16: {
                            if (!((sk) var4).field_r) {
                              ((sk) var4).c(param1 ^ 10);
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          stackOut_59_0 = var4;
                          stackIn_60_0 = stackOut_59_0;
                          break L10;
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6_ref_Exception = (Exception) (Object) decompiledCaughtException;
              ((lg) this).field_u[param0] = (byte)-1;
              ((sk) var4).c(param1 + 10);
              if (((sk) var4).field_r) {
                L17: {
                  if (!((lg) this).field_h.b(-21)) {
                    var4 = (Object) (Object) ((lg) this).field_h.a(((lg) this).field_o, true, param0, 437409504, (byte) 2);
                    ((lg) this).field_w.a((byte) 73, (gg) var4, (long)param0);
                    break L17;
                  } else {
                    break L17;
                  }
                }
                return null;
              } else {
                return null;
              }
            }
            return (sk) (Object) stackIn_60_0;
          }
        } else {
          return null;
        }
    }

    final void e(int param0) {
        int var2_int = 0;
        sk var2 = null;
        gg var3 = null;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = SolKnight.field_L ? 1 : 0;
          if (param0 == 18055) {
            break L0;
          } else {
            ha discarded$5 = ((lg) this).c(79);
            break L0;
          }
        }
        L1: {
          if (null != ((lg) this).field_m) {
            if (null == ((lg) this).c(-110)) {
              return;
            } else {
              if (((lg) this).field_s) {
                var2_int = 1;
                var3 = ((lg) this).field_m.a((byte) 51);
                L2: while (true) {
                  if (var3 == null) {
                    L3: while (true) {
                      L4: {
                        if (((lg) this).field_j.field_r.length <= ((lg) this).field_q) {
                          break L4;
                        } else {
                          if (((lg) this).field_j.field_r[((lg) this).field_q] != 0) {
                            if ((((lg) this).field_p.field_a ^ -1) > -251) {
                              L5: {
                                if (0 == ((lg) this).field_u[((lg) this).field_q]) {
                                  sk discarded$6 = this.a(((lg) this).field_q, (byte) 0, 1);
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                              L6: {
                                if (0 != ((lg) this).field_u[((lg) this).field_q]) {
                                  break L6;
                                } else {
                                  var3 = new gg();
                                  var3.field_g = (long)((lg) this).field_q;
                                  ((lg) this).field_m.a(var3, -7044);
                                  var2_int = 0;
                                  break L6;
                                }
                              }
                              ((lg) this).field_q = ((lg) this).field_q + 1;
                              continue L3;
                            } else {
                              var2_int = 0;
                              break L4;
                            }
                          } else {
                            ((lg) this).field_q = ((lg) this).field_q + 1;
                            continue L3;
                          }
                        }
                      }
                      if (var2_int != 0) {
                        ((lg) this).field_q = 0;
                        ((lg) this).field_s = false;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    L7: {
                      var4 = (int)var3.field_g;
                      if (0 == ((lg) this).field_u[var4]) {
                        sk discarded$7 = this.a(var4, (byte) 0, 1);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (((lg) this).field_u[var4] != 0) {
                        var3.c(10);
                        break L8;
                      } else {
                        var2_int = 0;
                        break L8;
                      }
                    }
                    var3 = ((lg) this).field_m.b(-84);
                    continue L2;
                  }
                }
              } else {
                if (((lg) this).field_y) {
                  var2_int = 1;
                  var3 = ((lg) this).field_m.a((byte) 51);
                  L9: while (true) {
                    if (var3 == null) {
                      L10: while (true) {
                        L11: {
                          if (((lg) this).field_j.field_r.length <= ((lg) this).field_q) {
                            break L11;
                          } else {
                            if (-1 != (((lg) this).field_j.field_r[((lg) this).field_q] ^ -1)) {
                              if (!((lg) this).field_h.a(-5868)) {
                                L12: {
                                  if (-2 == ((lg) this).field_u[((lg) this).field_q]) {
                                    break L12;
                                  } else {
                                    sk discarded$8 = this.a(((lg) this).field_q, (byte) 0, 2);
                                    break L12;
                                  }
                                }
                                L13: {
                                  if (-2 == ((lg) this).field_u[((lg) this).field_q]) {
                                    break L13;
                                  } else {
                                    var3 = new gg();
                                    var3.field_g = (long)((lg) this).field_q;
                                    var2_int = 0;
                                    ((lg) this).field_m.a(var3, -7044);
                                    break L13;
                                  }
                                }
                                ((lg) this).field_q = ((lg) this).field_q + 1;
                                continue L10;
                              } else {
                                var2_int = 0;
                                break L11;
                              }
                            } else {
                              ((lg) this).field_q = ((lg) this).field_q + 1;
                              continue L10;
                            }
                          }
                        }
                        if (var2_int != 0) {
                          ((lg) this).field_q = 0;
                          ((lg) this).field_y = false;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    } else {
                      L14: {
                        var4 = (int)var3.field_g;
                        if (1 != ((lg) this).field_u[var4]) {
                          sk discarded$9 = this.a(var4, (byte) 0, 2);
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      L15: {
                        if (-2 != (((lg) this).field_u[var4] ^ -1)) {
                          var2_int = 0;
                          break L15;
                        } else {
                          var3.c(param0 + -18045);
                          break L15;
                        }
                      }
                      var3 = ((lg) this).field_m.b(-47);
                      continue L9;
                    }
                  }
                } else {
                  ((lg) this).field_m = null;
                  break L1;
                }
              }
            }
          } else {
            break L1;
          }
        }
        L16: {
          if (!((lg) this).field_i) {
            break L16;
          } else {
            if ((je.a(1) ^ -1L) > (((lg) this).field_g ^ -1L)) {
              break L16;
            } else {
              var2 = (sk) (Object) ((lg) this).field_w.b(0);
              L17: while (true) {
                if (var2 == null) {
                  ((lg) this).field_g = 1000L + je.a(param0 + -18054);
                  break L16;
                } else {
                  L18: {
                    if (var2.field_m) {
                      break L18;
                    } else {
                      if (var2.field_q) {
                        if (!var2.field_r) {
                          throw new RuntimeException();
                        } else {
                          var2.c(10);
                          break L18;
                        }
                      } else {
                        var2.field_q = true;
                        break L18;
                      }
                    }
                  }
                  var2 = (sk) (Object) ((lg) this).field_w.c((byte) 122);
                  continue L17;
                }
              }
            }
          }
        }
    }

    final ha c(int param0) {
        int var2 = 0;
        byte[] var3 = null;
        int var5 = 0;
        var5 = SolKnight.field_L ? 1 : 0;
        var2 = -106 / ((param0 - 9) / 62);
        if (((lg) this).field_j == null) {
          L0: {
            if (null == ((lg) this).field_x) {
              if (!((lg) this).field_h.b(-21)) {
                ((lg) this).field_x = (sk) (Object) ((lg) this).field_h.a(255, true, ((lg) this).field_o, 437409504, (byte) 0);
                break L0;
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
          if (!((lg) this).field_x.field_m) {
            L1: {
              var3 = ((lg) this).field_x.f(0);
              if (((lg) this).field_x instanceof md) {
                if (var3 == null) {
                  throw new RuntimeException();
                } else {
                  ((lg) this).field_j = new ha(var3, ((lg) this).field_k, ((lg) this).field_t);
                  if (((lg) this).field_n != ((lg) this).field_j.field_m) {
                    throw new RuntimeException();
                  } else {
                    break L1;
                  }
                }
              } else {
                if (var3 != null) {
                  ((lg) this).field_j = new ha(var3, ((lg) this).field_k, ((lg) this).field_t);
                  if (null != ((lg) this).field_f) {
                    md discarded$1 = ((lg) this).field_p.a(83, ((lg) this).field_o, ((lg) this).field_f, var3);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  throw new RuntimeException();
                }
              }
            }
            L2: {
              ((lg) this).field_x = null;
              if (null == ((lg) this).field_v) {
                break L2;
              } else {
                ((lg) this).field_u = new byte[((lg) this).field_j.field_l];
                break L2;
              }
            }
            return ((lg) this).field_j;
          } else {
            return null;
          }
        } else {
          return ((lg) this).field_j;
        }
    }

    final void d(int param0) {
        gg var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = SolKnight.field_L ? 1 : 0;
        if (param0 == -1) {
          if (null == ((lg) this).field_m) {
            return;
          } else {
            if (((lg) this).c(123) == null) {
              return;
            } else {
              var2 = ((lg) this).field_e.a((byte) 51);
              L0: while (true) {
                if (var2 == null) {
                  return;
                } else {
                  L1: {
                    L2: {
                      var3 = (int)var2.field_g;
                      if (-1 < (var3 ^ -1)) {
                        break L2;
                      } else {
                        if (var3 >= ((lg) this).field_j.field_l) {
                          break L2;
                        } else {
                          if (-1 == (((lg) this).field_j.field_r[var3] ^ -1)) {
                            break L2;
                          } else {
                            L3: {
                              if (0 == ((lg) this).field_u[var3]) {
                                sk discarded$2 = this.a(var3, (byte) 0, 1);
                                break L3;
                              } else {
                                break L3;
                              }
                            }
                            L4: {
                              if (0 != (((lg) this).field_u[var3] ^ -1)) {
                                break L4;
                              } else {
                                sk discarded$3 = this.a(var3, (byte) 0, 2);
                                break L4;
                              }
                            }
                            if (1 == ((lg) this).field_u[var3]) {
                              var2.c(10);
                              break L1;
                            } else {
                              break L1;
                            }
                          }
                        }
                      }
                    }
                    var2.c(param0 + 11);
                    break L1;
                  }
                  var2 = ((lg) this).field_e.b(-41);
                  continue L0;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final int a(int param0, byte param1) {
        sk var3 = (sk) (Object) ((lg) this).field_w.a(true, (long)param0);
        if (!(var3 == null)) {
            return var3.a((byte) -126);
        }
        int var4 = -38 / ((param1 - -68) / 58);
        return 0;
    }

    final byte[] a(int param0, int param1) {
        sk var3 = this.a(param0, (byte) 0, 0);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.f(param1);
        var3.c(10);
        return var4;
    }

    final void a(byte param0) {
        if (!(null != ((lg) this).field_v)) {
            return;
        }
        ((lg) this).field_y = true;
        if (((lg) this).field_m == null) {
            ((lg) this).field_m = new nc();
        }
        if (param0 != 0) {
            ((lg) this).e(-121);
        }
    }

    public static void b(byte param0) {
        field_l = null;
        field_r = null;
        if (param0 != 0) {
            field_l = null;
        }
    }

    lg(int param0, bi param1, bi param2, va param3, ae param4, int param5, byte[] param6, int param7, boolean param8) {
        ((lg) this).field_w = new qd(16);
        ((lg) this).field_q = 0;
        ((lg) this).field_e = new nc();
        ((lg) this).field_g = 0L;
        ((lg) this).field_o = param0;
        ((lg) this).field_v = param1;
        if (null != ((lg) this).field_v) {
            ((lg) this).field_s = true;
            ((lg) this).field_m = new nc();
        } else {
            ((lg) this).field_s = false;
        }
        ((lg) this).field_f = param2;
        ((lg) this).field_t = param6;
        ((lg) this).field_i = param8 ? true : false;
        ((lg) this).field_p = param4;
        ((lg) this).field_n = param7;
        ((lg) this).field_h = param3;
        ((lg) this).field_k = param5;
        if (null != ((lg) this).field_f) {
            ((lg) this).field_x = (sk) (Object) ((lg) this).field_p.a(((lg) this).field_f, ((lg) this).field_o, -122);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "to return to the normal view.";
    }
}
