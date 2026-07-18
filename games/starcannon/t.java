/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t extends ti {
    static String field_q;
    static hl[] field_r;
    private uf field_v;
    private int field_n;
    static int field_C;
    private int field_k;
    private ak field_t;
    static String field_x;
    private byte[] field_j;
    private ef field_y;
    private uf field_p;
    private ih field_w;
    private byte[] field_i;
    private ik field_m;
    static int field_u;
    static lc field_h;
    private int field_A;
    private eh field_s;
    private boolean field_D;
    private int field_F;
    private rk field_B;
    private boolean field_l;
    private rk field_E;
    private boolean field_z;
    private long field_o;

    private final ik a(int param0, int param1, boolean param2) {
        Object var4 = null;
        byte[] var5 = null;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var6_int = 0;
        byte[] var7 = null;
        int var7_int = 0;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object stackIn_60_0 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_59_0 = null;
        L0: {
          var10 = StarCannon.field_A;
          var4 = (Object) (Object) (ik) (Object) ((t) this).field_w.a((long)param0, (byte) 88);
          if (var4 == null) {
            break L0;
          } else {
            if (0 != param1) {
              break L0;
            } else {
              if (((ik) var4).field_o) {
                break L0;
              } else {
                if (!((ik) var4).field_r) {
                  break L0;
                } else {
                  ((ik) var4).b(4);
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
              if (0 == param1) {
                L3: {
                  if (((t) this).field_p == null) {
                    break L3;
                  } else {
                    if (((t) this).field_j[param0] != -1) {
                      var4 = (Object) (Object) ((t) this).field_y.a(((t) this).field_p, -118, param0);
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (!((t) this).field_s.b((byte) -79)) {
                  var4 = (Object) (Object) ((t) this).field_s.a(((t) this).field_k, param0, -28612, true, (byte) 2);
                  break L2;
                } else {
                  return null;
                }
              } else {
                if (param1 != 1) {
                  if (param1 != 2) {
                    throw new RuntimeException();
                  } else {
                    if (null != ((t) this).field_p) {
                      if (((t) this).field_j[param0] != -1) {
                        throw new RuntimeException();
                      } else {
                        if (!((t) this).field_s.f((byte) -49)) {
                          var4 = (Object) (Object) ((t) this).field_s.a(((t) this).field_k, param0, -28612, false, (byte) 2);
                          break L2;
                        } else {
                          return null;
                        }
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } else {
                  if (((t) this).field_p == null) {
                    throw new RuntimeException();
                  } else {
                    var4 = (Object) (Object) ((t) this).field_y.a((byte) 16, param0, ((t) this).field_p);
                    break L2;
                  }
                }
              }
            }
            ((t) this).field_w.a((long)param0, (byte) -100, (rf) var4);
            break L1;
          } else {
            break L1;
          }
        }
        if (!((ik) var4).field_r) {
          var5 = ((ik) var4).f(0);
          if (!(var4 instanceof tg)) {
            try {
              L4: {
                L5: {
                  if (var5 == null) {
                    break L5;
                  } else {
                    if (var5.length > 2) {
                      lh.field_g.reset();
                      lh.field_g.update(var5, 0, var5.length - 2);
                      var6_int = (int)lh.field_g.getValue();
                      if (((t) this).field_t.field_c[param0] != var6_int) {
                        throw new RuntimeException();
                      } else {
                        L6: {
                          if (((t) this).field_t.field_p == null) {
                            break L6;
                          } else {
                            if (null != ((t) this).field_t.field_p[param0]) {
                              var7 = ((t) this).field_t.field_p[param0];
                              var8 = bd.a(var5.length + -2, var5, (byte) 108, 0);
                              var11 = 0;
                              var9 = var11;
                              L7: while (true) {
                                if (var11 >= 64) {
                                  break L6;
                                } else {
                                  if (var8[var11] == var7[var11]) {
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
                        ((t) this).field_s.field_p = 0;
                        ((t) this).field_s.field_d = 0;
                        break L4;
                      }
                    } else {
                      break L5;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L8: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                ((t) this).field_s.a((byte) 126);
                ((ik) var4).b(4);
                if (((ik) var4).field_o) {
                  if (!((t) this).field_s.b((byte) -119)) {
                    var4 = (Object) (Object) ((t) this).field_s.a(((t) this).field_k, param0, -28612, true, (byte) 2);
                    ((t) this).field_w.a((long)param0, (byte) -100, (rf) var4);
                    break L8;
                  } else {
                    return null;
                  }
                } else {
                  break L8;
                }
              }
              return null;
            }
            L9: {
              var5[-2 + var5.length] = (byte)(((t) this).field_t.field_d[param0] >>> 8);
              var5[-1 + var5.length] = (byte)((t) this).field_t.field_d[param0];
              if (((t) this).field_p != null) {
                tg discarded$1 = ((t) this).field_y.a(var5, ((t) this).field_p, false, param0);
                if (1 != ((t) this).field_j[param0]) {
                  ((t) this).field_j[param0] = (byte) 1;
                  break L9;
                } else {
                  break L9;
                }
              } else {
                break L9;
              }
            }
            L10: {
              if (!((ik) var4).field_o) {
                ((ik) var4).b(4);
                break L10;
              } else {
                break L10;
              }
            }
            return (ik) var4;
          } else {
            try {
              L11: {
                L12: {
                  if (var5 == null) {
                    break L12;
                  } else {
                    if (2 >= var5.length) {
                      break L12;
                    } else {
                      lh.field_g.reset();
                      lh.field_g.update(var5, 0, -2 + var5.length);
                      var6_int = (int)lh.field_g.getValue();
                      if (var6_int != ((t) this).field_t.field_c[param0]) {
                        throw new RuntimeException();
                      } else {
                        L13: {
                          if (((t) this).field_t.field_p == null) {
                            break L13;
                          } else {
                            if (null == ((t) this).field_t.field_p[param0]) {
                              break L13;
                            } else {
                              var7 = ((t) this).field_t.field_p[param0];
                              var8 = bd.a(-2 + var5.length, var5, (byte) 93, 0);
                              var9 = 0;
                              L14: while (true) {
                                if (var9 >= 64) {
                                  break L13;
                                } else {
                                  if (var7[var9] != var8[var9]) {
                                    throw new RuntimeException();
                                  } else {
                                    var9++;
                                    continue L14;
                                  }
                                }
                              }
                            }
                          }
                        }
                        var7_int = ((255 & var5[-2 + var5.length]) << 8) + (var5[-1 + var5.length] & 255);
                        if (var7_int != (65535 & ((t) this).field_t.field_d[param0])) {
                          throw new RuntimeException();
                        } else {
                          L15: {
                            if (((t) this).field_j[param0] != -2) {
                              L16: {
                                if (-1 == ((t) this).field_j[param0]) {
                                  break L16;
                                } else {
                                  break L16;
                                }
                              }
                              ((t) this).field_j[param0] = (byte) 1;
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          L17: {
                            if (!((ik) var4).field_o) {
                              ((ik) var4).b(4);
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                          stackOut_59_0 = var4;
                          stackIn_60_0 = stackOut_59_0;
                          break L11;
                        }
                      }
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L18: {
                var6 = (Exception) (Object) decompiledCaughtException;
                ((t) this).field_j[param0] = (byte) -1;
                ((ik) var4).b(4);
                if (((ik) var4).field_o) {
                  if (!((t) this).field_s.b((byte) -124)) {
                    var4 = (Object) (Object) ((t) this).field_s.a(((t) this).field_k, param0, -28612, true, (byte) 2);
                    ((t) this).field_w.a((long)param0, (byte) -100, (rf) var4);
                    break L18;
                  } else {
                    break L18;
                  }
                } else {
                  break L18;
                }
              }
              return null;
            }
            return (ik) (Object) stackIn_60_0;
          }
        } else {
          return null;
        }
    }

    final void a(int param0) {
        if (param0 >= -123) {
            ((t) this).field_D = true;
        }
        if (null == ((t) this).field_p) {
            return;
        }
        ((t) this).field_D = true;
        if (null == ((t) this).field_B) {
            ((t) this).field_B = new rk();
        }
    }

    final byte[] b(int param0, boolean param1) {
        ik var3 = this.a(param0, 0, true);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.f(0);
        var3.b(4);
        if (param1) {
            ak discarded$0 = ((t) this).b((byte) 60);
        }
        return var4;
    }

    final ak b(byte param0) {
        byte[] var2 = null;
        int var3 = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        byte[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = StarCannon.field_A;
        if (null == ((t) this).field_t) {
          L0: {
            if (null != ((t) this).field_m) {
              break L0;
            } else {
              if (!((t) this).field_s.b((byte) -106)) {
                ((t) this).field_m = (ik) (Object) ((t) this).field_s.a(255, ((t) this).field_k, -28612, true, (byte) 0);
                break L0;
              } else {
                return null;
              }
            }
          }
          if (!((t) this).field_m.field_r) {
            L1: {
              var6 = ((t) this).field_m.f(0);
              var2 = var6;
              var3 = -97 / ((50 - param0) / 55);
              if (((t) this).field_m instanceof tg) {
                try {
                  L2: {
                    if (var2 == null) {
                      throw new RuntimeException();
                    } else {
                      ((t) this).field_t = new ak(var2, ((t) this).field_n, ((t) this).field_i);
                      if (((t) this).field_t.field_q != ((t) this).field_A) {
                        throw new RuntimeException();
                      } else {
                        break L2;
                      }
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var4 = decompiledCaughtException;
                    ((t) this).field_t = null;
                    if (!((t) this).field_s.b((byte) -66)) {
                      ((t) this).field_m = (ik) (Object) ((t) this).field_s.a(255, ((t) this).field_k, -28612, true, (byte) 0);
                      break L3;
                    } else {
                      ((t) this).field_m = null;
                      break L3;
                    }
                  }
                  return null;
                }
                break L1;
              } else {
                try {
                  L4: {
                    if (var6 == null) {
                      throw new RuntimeException();
                    } else {
                      ((t) this).field_t = new ak(var6, ((t) this).field_n, ((t) this).field_i);
                      break L4;
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L5: {
                    var4 = decompiledCaughtException;
                    ((t) this).field_s.a((byte) 124);
                    ((t) this).field_t = null;
                    if (((t) this).field_s.b((byte) -128)) {
                      ((t) this).field_m = null;
                      break L5;
                    } else {
                      ((t) this).field_m = (ik) (Object) ((t) this).field_s.a(255, ((t) this).field_k, -28612, true, (byte) 0);
                      break L5;
                    }
                  }
                  return null;
                }
                if (null == ((t) this).field_v) {
                  break L1;
                } else {
                  tg discarded$1 = ((t) this).field_y.a(var6, ((t) this).field_v, false, ((t) this).field_k);
                  break L1;
                }
              }
            }
            L6: {
              if (null == ((t) this).field_p) {
                break L6;
              } else {
                ((t) this).field_j = new byte[((t) this).field_t.field_m];
                break L6;
              }
            }
            ((t) this).field_m = null;
            return ((t) this).field_t;
          } else {
            return null;
          }
        } else {
          return ((t) this).field_t;
        }
    }

    public static void c() {
        field_x = null;
        int var1 = -1;
        field_q = null;
        field_h = null;
        field_r = null;
    }

    final void d(byte param0) {
        int var2_int = 0;
        ik var2 = null;
        rf var3 = null;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = StarCannon.field_A;
          if (param0 == -12) {
            break L0;
          } else {
            int discarded$5 = ((t) this).a(-73, false);
            break L0;
          }
        }
        L1: {
          if (null != ((t) this).field_B) {
            if (((t) this).b((byte) 120) == null) {
              return;
            } else {
              if (!((t) this).field_l) {
                if (!((t) this).field_D) {
                  ((t) this).field_B = null;
                  break L1;
                } else {
                  var2_int = 1;
                  var3 = ((t) this).field_B.c(-3905);
                  L2: while (true) {
                    if (var3 == null) {
                      L3: while (true) {
                        L4: {
                          if (((t) this).field_t.field_i.length <= ((t) this).field_F) {
                            break L4;
                          } else {
                            if (((t) this).field_t.field_i[((t) this).field_F] != 0) {
                              if (((t) this).field_s.f((byte) -49)) {
                                var2_int = 0;
                                break L4;
                              } else {
                                L5: {
                                  if (((t) this).field_j[((t) this).field_F] == 1) {
                                    break L5;
                                  } else {
                                    ik discarded$6 = this.a(((t) this).field_F, 2, true);
                                    break L5;
                                  }
                                }
                                L6: {
                                  if (1 == ((t) this).field_j[((t) this).field_F]) {
                                    break L6;
                                  } else {
                                    var3 = new rf();
                                    var3.field_b = (long)((t) this).field_F;
                                    var2_int = 0;
                                    ((t) this).field_B.b(param0 + 83, var3);
                                    break L6;
                                  }
                                }
                                ((t) this).field_F = ((t) this).field_F + 1;
                                continue L3;
                              }
                            } else {
                              ((t) this).field_F = ((t) this).field_F + 1;
                              continue L3;
                            }
                          }
                        }
                        if (var2_int == 0) {
                          break L1;
                        } else {
                          ((t) this).field_D = false;
                          ((t) this).field_F = 0;
                          break L1;
                        }
                      }
                    } else {
                      L7: {
                        var4 = (int)var3.field_b;
                        if (1 != ((t) this).field_j[var4]) {
                          ik discarded$7 = this.a(var4, 2, true);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      L8: {
                        if (1 == ((t) this).field_j[var4]) {
                          var3.b(4);
                          break L8;
                        } else {
                          var2_int = 0;
                          break L8;
                        }
                      }
                      var3 = ((t) this).field_B.a(param0 + -16901);
                      continue L2;
                    }
                  }
                }
              } else {
                var2_int = 1;
                var3 = ((t) this).field_B.c(param0 + -3893);
                L9: while (true) {
                  if (var3 == null) {
                    L10: while (true) {
                      L11: {
                        if (((t) this).field_t.field_i.length <= ((t) this).field_F) {
                          break L11;
                        } else {
                          L12: {
                            if (((t) this).field_t.field_i[((t) this).field_F] == 0) {
                              break L12;
                            } else {
                              if (((t) this).field_y.field_h < 250) {
                                L13: {
                                  if (0 != ((t) this).field_j[((t) this).field_F]) {
                                    break L13;
                                  } else {
                                    ik discarded$8 = this.a(((t) this).field_F, 1, true);
                                    break L13;
                                  }
                                }
                                if (0 == ((t) this).field_j[((t) this).field_F]) {
                                  var3 = new rf();
                                  var3.field_b = (long)((t) this).field_F;
                                  var2_int = 0;
                                  ((t) this).field_B.b(69, var3);
                                  break L12;
                                } else {
                                  break L12;
                                }
                              } else {
                                var2_int = 0;
                                break L11;
                              }
                            }
                          }
                          ((t) this).field_F = ((t) this).field_F + 1;
                          continue L10;
                        }
                      }
                      if (var2_int == 0) {
                        break L1;
                      } else {
                        ((t) this).field_l = false;
                        ((t) this).field_F = 0;
                        break L1;
                      }
                    }
                  } else {
                    L14: {
                      var4 = (int)var3.field_b;
                      if (((t) this).field_j[var4] != 0) {
                        break L14;
                      } else {
                        ik discarded$9 = this.a(var4, 1, true);
                        break L14;
                      }
                    }
                    L15: {
                      if (((t) this).field_j[var4] == 0) {
                        var2_int = 0;
                        break L15;
                      } else {
                        var3.b(4);
                        break L15;
                      }
                    }
                    var3 = ((t) this).field_B.a(-16913);
                    continue L9;
                  }
                }
              }
            }
          } else {
            break L1;
          }
        }
        L16: {
          if (!((t) this).field_z) {
            break L16;
          } else {
            if (((t) this).field_o > dd.b(119)) {
              break L16;
            } else {
              var2 = (ik) (Object) ((t) this).field_w.a(-1);
              L17: while (true) {
                if (var2 == null) {
                  ((t) this).field_o = dd.b(114) + 1000L;
                  break L16;
                } else {
                  L18: {
                    if (var2.field_r) {
                      break L18;
                    } else {
                      if (!var2.field_n) {
                        var2.field_n = true;
                        break L18;
                      } else {
                        if (var2.field_o) {
                          var2.b(4);
                          break L18;
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    }
                  }
                  var2 = (ik) (Object) ((t) this).field_w.a((byte) -64);
                  continue L17;
                }
              }
            }
          }
        }
    }

    final void b(int param0) {
        int var3 = 0;
        int var4 = StarCannon.field_A;
        if (!(null != ((t) this).field_B)) {
            return;
        }
        if (null == ((t) this).b((byte) 119)) {
            return;
        }
        if (param0 != 0) {
            field_C = -75;
        }
        rf var2 = ((t) this).field_E.c(param0 ^ -3905);
        while (var2 != null) {
            var3 = (int)var2.field_b;
            if (var3 < 0) {
                var2.b(4);
            } else {
                if (((t) this).field_t.field_m <= var3) {
                    var2.b(4);
                } else {
                    if (((t) this).field_t.field_i[var3] == 0) {
                        var2.b(4);
                    } else {
                        if (0 == ((t) this).field_j[var3]) {
                            ik discarded$0 = this.a(var3, 1, true);
                        }
                        if (!(((t) this).field_j[var3] != -1)) {
                            ik discarded$1 = this.a(var3, 2, true);
                        }
                        if (((t) this).field_j[var3] == 1) {
                            var2.b(4);
                        }
                    }
                }
            }
            var2 = ((t) this).field_E.a(param0 ^ -16913);
        }
    }

    final int a(int param0, boolean param1) {
        ik var3 = (ik) (Object) ((t) this).field_w.a((long)param0, (byte) 120);
        if (!param1) {
            ((t) this).d((byte) -101);
        }
        if (var3 != null) {
            return var3.e(-29144);
        }
        return 0;
    }

    t(int param0, uf param1, uf param2, eh param3, ef param4, int param5, byte[] param6, int param7, boolean param8) {
        RuntimeException var10 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        ((t) this).field_w = new ih(16);
        ((t) this).field_F = 0;
        ((t) this).field_E = new rk();
        ((t) this).field_o = 0L;
        try {
          L0: {
            L1: {
              ((t) this).field_k = param0;
              ((t) this).field_p = param1;
              if (((t) this).field_p != null) {
                ((t) this).field_l = true;
                ((t) this).field_B = new rk();
                break L1;
              } else {
                ((t) this).field_l = false;
                break L1;
              }
            }
            L2: {
              ((t) this).field_v = param2;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param8) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              ((t) this).field_z = stackIn_7_1 != 0;
              ((t) this).field_i = param6;
              ((t) this).field_n = param5;
              ((t) this).field_s = param3;
              ((t) this).field_A = param7;
              ((t) this).field_y = param4;
              if (null == ((t) this).field_v) {
                break L3;
              } else {
                ((t) this).field_m = (ik) (Object) ((t) this).field_y.a(((t) this).field_v, -80, ((t) this).field_k);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var10;
            stackOut_10_1 = new StringBuilder().append("t.<init>(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          L7: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          L8: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param5).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param6 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = -1;
        field_x = "SHIELDS - Improves the Nova Ray's shield recharge rate.";
    }
}
