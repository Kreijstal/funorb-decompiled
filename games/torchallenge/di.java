/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di extends kl {
    private rb field_y;
    private int field_s;
    static ka[] field_t;
    private vb field_G;
    private la field_v;
    private sh field_u;
    private int field_z;
    private int field_l;
    private byte[] field_k;
    private byte[] field_i;
    private tf field_C;
    static vi field_g;
    static int field_A;
    static byte[][] field_E;
    private ha field_j;
    private la field_o;
    static char field_m;
    private boolean field_q;
    private sl field_D;
    private boolean field_h;
    private int field_r;
    static k field_F;
    static String field_B;
    static String field_n;
    private sl field_w;
    private boolean field_x;
    private long field_p;

    final tf b(int param0) {
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        L0: {
          var4 = TorChallenge.field_F ? 1 : 0;
          if (param0 == 0) {
            break L0;
          } else {
            field_g = null;
            break L0;
          }
        }
        if (null != ((di) this).field_C) {
          return ((di) this).field_C;
        } else {
          L1: {
            if (((di) this).field_u != null) {
              break L1;
            } else {
              if (!((di) this).field_G.b((byte) 100)) {
                ((di) this).field_u = (sh) (Object) ((di) this).field_G.a(true, 255, ((di) this).field_z, (byte) 0, param0 + 63);
                break L1;
              } else {
                return null;
              }
            }
          }
          if (!((di) this).field_u.field_v) {
            L2: {
              var5 = ((di) this).field_u.e(2);
              var2 = var5;
              if (((di) this).field_u instanceof al) {
                try {
                  L3: {
                    if (var5 == null) {
                      throw new RuntimeException();
                    } else {
                      ((di) this).field_C = new tf(var5, ((di) this).field_l, ((di) this).field_i);
                      if (((di) this).field_s == ((di) this).field_C.field_b) {
                        break L3;
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var3 = decompiledCaughtException;
                    ((di) this).field_C = null;
                    if (!((di) this).field_G.b((byte) 100)) {
                      ((di) this).field_u = (sh) (Object) ((di) this).field_G.a(true, 255, ((di) this).field_z, (byte) 0, 75);
                      break L4;
                    } else {
                      ((di) this).field_u = null;
                      break L4;
                    }
                  }
                  return null;
                }
                break L2;
              } else {
                try {
                  L5: {
                    if (var5 != null) {
                      ((di) this).field_C = new tf(var5, ((di) this).field_l, ((di) this).field_i);
                      break L5;
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L6: {
                    var3 = decompiledCaughtException;
                    ((di) this).field_G.c(-30317);
                    ((di) this).field_C = null;
                    if (!((di) this).field_G.b((byte) 100)) {
                      ((di) this).field_u = (sh) (Object) ((di) this).field_G.a(true, 255, ((di) this).field_z, (byte) 0, 90);
                      break L6;
                    } else {
                      ((di) this).field_u = null;
                      break L6;
                    }
                  }
                  return null;
                }
                if (null != ((di) this).field_o) {
                  al discarded$1 = ((di) this).field_y.a(((di) this).field_z, ((di) this).field_o, (byte) 111, var5);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L7: {
              ((di) this).field_u = null;
              if (((di) this).field_v == null) {
                break L7;
              } else {
                ((di) this).field_k = new byte[((di) this).field_C.field_r];
                break L7;
              }
            }
            return ((di) this).field_C;
          } else {
            return null;
          }
        }
    }

    private final sh a(int param0, int param1, boolean param2) {
        Object var4 = null;
        byte[] var5 = null;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var6_int = 0;
        int var7_int = 0;
        byte[] var7 = null;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object stackIn_58_0 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_57_0 = null;
        L0: {
          var10 = TorChallenge.field_F ? 1 : 0;
          var4 = (Object) (Object) (sh) (Object) ((di) this).field_j.a((byte) 112, (long)param0);
          if (var4 == null) {
            break L0;
          } else {
            if (param1 != 0) {
              break L0;
            } else {
              if (((sh) var4).field_s) {
                break L0;
              } else {
                if (((sh) var4).field_v) {
                  ((sh) var4).a(true);
                  var4 = null;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (var4 != null) {
            break L1;
          } else {
            L2: {
              if (param1 != 0) {
                if (1 == param1) {
                  if (null == ((di) this).field_v) {
                    throw new RuntimeException();
                  } else {
                    var4 = (Object) (Object) ((di) this).field_y.a(param0, 3, ((di) this).field_v);
                    break L2;
                  }
                } else {
                  if (2 != param1) {
                    throw new RuntimeException();
                  } else {
                    if (((di) this).field_v == null) {
                      throw new RuntimeException();
                    } else {
                      if (-1 != ((di) this).field_k[param0]) {
                        throw new RuntimeException();
                      } else {
                        if (!((di) this).field_G.a(true)) {
                          var4 = (Object) (Object) ((di) this).field_G.a(false, ((di) this).field_z, param0, (byte) 2, 60);
                          break L2;
                        } else {
                          return null;
                        }
                      }
                    }
                  }
                }
              } else {
                L3: {
                  if (((di) this).field_v == null) {
                    break L3;
                  } else {
                    if (((di) this).field_k[param0] != -1) {
                      var4 = (Object) (Object) ((di) this).field_y.a(((di) this).field_v, true, param0);
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (!((di) this).field_G.b((byte) 100)) {
                  var4 = (Object) (Object) ((di) this).field_G.a(true, ((di) this).field_z, param0, (byte) 2, 92);
                  break L2;
                } else {
                  return null;
                }
              }
            }
            ((di) this).field_j.a(-111, (da) var4, (long)param0);
            break L1;
          }
        }
        if (!((sh) var4).field_v) {
          var5 = ((sh) var4).e(2);
          if (!(var4 instanceof al)) {
            try {
              L4: {
                L5: {
                  if (var5 == null) {
                    break L5;
                  } else {
                    if (var5.length <= 2) {
                      break L5;
                    } else {
                      vc.field_c.reset();
                      vc.field_c.update(var5, 0, -2 + var5.length);
                      var6_int = (int)vc.field_c.getValue();
                      if (((di) this).field_C.field_t[param0] != var6_int) {
                        throw new RuntimeException();
                      } else {
                        L6: {
                          if (null == ((di) this).field_C.field_n) {
                            break L6;
                          } else {
                            if (null == ((di) this).field_C.field_n[param0]) {
                              break L6;
                            } else {
                              var7 = ((di) this).field_C.field_n[param0];
                              var8 = qc.a(var5, -2 + var5.length, (byte) -82, 0);
                              var11 = 0;
                              var9 = var11;
                              L7: while (true) {
                                if (var11 >= 64) {
                                  break L6;
                                } else {
                                  if (var7[var11] != var8[var11]) {
                                    throw new RuntimeException();
                                  } else {
                                    var11++;
                                    continue L7;
                                  }
                                }
                              }
                            }
                          }
                        }
                        ((di) this).field_G.field_h = 0;
                        ((di) this).field_G.field_b = 0;
                        break L4;
                      }
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L8: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                ((di) this).field_G.c(-30317);
                ((sh) var4).a(true);
                if (((sh) var4).field_s) {
                  if (!((di) this).field_G.b((byte) 100)) {
                    var4 = (Object) (Object) ((di) this).field_G.a(true, ((di) this).field_z, param0, (byte) 2, 108);
                    ((di) this).field_j.a(47, (da) var4, (long)param0);
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
              var5[-2 + var5.length] = (byte)(((di) this).field_C.field_d[param0] >>> 8);
              var5[-1 + var5.length] = (byte)((di) this).field_C.field_d[param0];
              if (null != ((di) this).field_v) {
                al discarded$1 = ((di) this).field_y.a(param0, ((di) this).field_v, (byte) 111, var5);
                if (((di) this).field_k[param0] == 1) {
                  break L9;
                } else {
                  ((di) this).field_k[param0] = (byte) 1;
                  break L9;
                }
              } else {
                break L9;
              }
            }
            L10: {
              if (((sh) var4).field_s) {
                break L10;
              } else {
                ((sh) var4).a(true);
                break L10;
              }
            }
            return (sh) var4;
          } else {
            try {
              L11: {
                L12: {
                  if (var5 == null) {
                    break L12;
                  } else {
                    if (2 < var5.length) {
                      vc.field_c.reset();
                      vc.field_c.update(var5, 0, var5.length + -2);
                      var6_int = (int)vc.field_c.getValue();
                      if (((di) this).field_C.field_t[param0] == var6_int) {
                        L13: {
                          if (((di) this).field_C.field_n == null) {
                            break L13;
                          } else {
                            if (null == ((di) this).field_C.field_n[param0]) {
                              break L13;
                            } else {
                              var7 = ((di) this).field_C.field_n[param0];
                              var8 = qc.a(var5, var5.length - 2, (byte) -117, 0);
                              var9 = 0;
                              L14: while (true) {
                                if (var9 >= 64) {
                                  break L13;
                                } else {
                                  if (var7[var9] == var8[var9]) {
                                    var9++;
                                    continue L14;
                                  } else {
                                    throw new RuntimeException();
                                  }
                                }
                              }
                            }
                          }
                        }
                        var7_int = (65280 & var5[-2 + var5.length] << 8) + (var5[var5.length + -1] & 255);
                        if (var7_int != (((di) this).field_C.field_d[param0] & 65535)) {
                          throw new RuntimeException();
                        } else {
                          L15: {
                            if (((di) this).field_k[param0] == 1) {
                              break L15;
                            } else {
                              L16: {
                                if (((di) this).field_k[param0] != 0) {
                                  break L16;
                                } else {
                                  break L16;
                                }
                              }
                              ((di) this).field_k[param0] = (byte) 1;
                              break L15;
                            }
                          }
                          L17: {
                            if (((sh) var4).field_s) {
                              break L17;
                            } else {
                              ((sh) var4).a(true);
                              break L17;
                            }
                          }
                          stackOut_57_0 = var4;
                          stackIn_58_0 = stackOut_57_0;
                          break L11;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      break L12;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var6 = (Exception) (Object) decompiledCaughtException;
              ((di) this).field_k[param0] = (byte) -1;
              ((sh) var4).a(true);
              if (((sh) var4).field_s) {
                L18: {
                  if (!((di) this).field_G.b((byte) 100)) {
                    var4 = (Object) (Object) ((di) this).field_G.a(true, ((di) this).field_z, param0, (byte) 2, 79);
                    ((di) this).field_j.a(-100, (da) var4, (long)param0);
                    break L18;
                  } else {
                    break L18;
                  }
                }
                return null;
              } else {
                return null;
              }
            }
            return (sh) (Object) stackIn_58_0;
          }
        } else {
          return null;
        }
    }

    final void d(int param0) {
        if (param0 != 14) {
            int discarded$0 = ((di) this).a(-90, -21);
        }
        if (!(null != ((di) this).field_v)) {
            return;
        }
        ((di) this).field_h = true;
        if (!(((di) this).field_D != null)) {
            ((di) this).field_D = new sl();
        }
    }

    final byte[] a(int param0, byte param1) {
        sh var3 = this.a(param0, 0, false);
        if (var3 == null) {
            return null;
        }
        if (param1 != -72) {
            di.a(true);
        }
        byte[] var4 = var3.e(param1 + 74);
        var3.a(true);
        return var4;
    }

    final void c(int param0) {
        sh var2 = null;
        int var2_int = 0;
        da var3 = null;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = TorChallenge.field_F ? 1 : 0;
          if (param0 <= -43) {
            break L0;
          } else {
            byte[] discarded$5 = ((di) this).a(92, (byte) -25);
            break L0;
          }
        }
        L1: {
          if (((di) this).field_D == null) {
            break L1;
          } else {
            if (null == ((di) this).b(0)) {
              return;
            } else {
              if (!((di) this).field_q) {
                if (((di) this).field_h) {
                  var2_int = 1;
                  var3 = ((di) this).field_D.c((byte) 123);
                  L2: while (true) {
                    if (var3 == null) {
                      L3: while (true) {
                        L4: {
                          if (((di) this).field_C.field_e.length <= ((di) this).field_r) {
                            break L4;
                          } else {
                            L5: {
                              if (((di) this).field_C.field_e[((di) this).field_r] == 0) {
                                break L5;
                              } else {
                                if (!((di) this).field_G.a(true)) {
                                  L6: {
                                    if (((di) this).field_k[((di) this).field_r] == 1) {
                                      break L6;
                                    } else {
                                      sh discarded$6 = this.a(((di) this).field_r, 2, false);
                                      break L6;
                                    }
                                  }
                                  if (((di) this).field_k[((di) this).field_r] != 1) {
                                    var3 = new da();
                                    var3.field_d = (long)((di) this).field_r;
                                    ((di) this).field_D.a(var3, -62);
                                    var2_int = 0;
                                    break L5;
                                  } else {
                                    break L5;
                                  }
                                } else {
                                  var2_int = 0;
                                  break L4;
                                }
                              }
                            }
                            ((di) this).field_r = ((di) this).field_r + 1;
                            continue L3;
                          }
                        }
                        if (var2_int != 0) {
                          ((di) this).field_r = 0;
                          ((di) this).field_h = false;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    } else {
                      L7: {
                        var4 = (int)var3.field_d;
                        if (((di) this).field_k[var4] != 1) {
                          sh discarded$7 = this.a(var4, 2, false);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      L8: {
                        if (((di) this).field_k[var4] != 1) {
                          var2_int = 0;
                          break L8;
                        } else {
                          var3.a(true);
                          break L8;
                        }
                      }
                      var3 = ((di) this).field_D.c(-270);
                      continue L2;
                    }
                  }
                } else {
                  ((di) this).field_D = null;
                  break L1;
                }
              } else {
                var2_int = 1;
                var3 = ((di) this).field_D.c((byte) 114);
                L9: while (true) {
                  if (var3 == null) {
                    L10: while (true) {
                      L11: {
                        if (((di) this).field_C.field_e.length <= ((di) this).field_r) {
                          break L11;
                        } else {
                          if (((di) this).field_C.field_e[((di) this).field_r] != 0) {
                            if (250 <= ((di) this).field_y.field_e) {
                              var2_int = 0;
                              break L11;
                            } else {
                              L12: {
                                if (0 != ((di) this).field_k[((di) this).field_r]) {
                                  break L12;
                                } else {
                                  sh discarded$8 = this.a(((di) this).field_r, 1, false);
                                  break L12;
                                }
                              }
                              L13: {
                                if (0 == ((di) this).field_k[((di) this).field_r]) {
                                  var3 = new da();
                                  var3.field_d = (long)((di) this).field_r;
                                  var2_int = 0;
                                  ((di) this).field_D.a(var3, -36);
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              ((di) this).field_r = ((di) this).field_r + 1;
                              continue L10;
                            }
                          } else {
                            ((di) this).field_r = ((di) this).field_r + 1;
                            continue L10;
                          }
                        }
                      }
                      if (var2_int != 0) {
                        ((di) this).field_q = false;
                        ((di) this).field_r = 0;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    L14: {
                      var4 = (int)var3.field_d;
                      if (0 == ((di) this).field_k[var4]) {
                        sh discarded$9 = this.a(var4, 1, false);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    L15: {
                      if (((di) this).field_k[var4] != 0) {
                        var3.a(true);
                        break L15;
                      } else {
                        var2_int = 0;
                        break L15;
                      }
                    }
                    var3 = ((di) this).field_D.c(-270);
                    continue L9;
                  }
                }
              }
            }
          }
        }
        L16: {
          if (!((di) this).field_x) {
            break L16;
          } else {
            if (~((di) this).field_p >= ~ol.a(256)) {
              var2 = (sh) (Object) ((di) this).field_j.a((byte) -73);
              L17: while (true) {
                if (var2 == null) {
                  ((di) this).field_p = ol.a(256) + 1000L;
                  break L16;
                } else {
                  L18: {
                    if (!var2.field_v) {
                      if (!var2.field_p) {
                        var2.field_p = true;
                        break L18;
                      } else {
                        if (!var2.field_s) {
                          throw new RuntimeException();
                        } else {
                          var2.a(true);
                          break L18;
                        }
                      }
                    } else {
                      break L18;
                    }
                  }
                  var2 = (sh) (Object) ((di) this).field_j.a(-27377);
                  continue L17;
                }
              }
            } else {
              break L16;
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_g = null;
        if (param0) {
            return;
        }
        field_B = null;
        field_t = null;
        field_n = null;
        field_F = null;
        field_E = null;
    }

    final void a(byte param0) {
        da var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = TorChallenge.field_F ? 1 : 0;
        if (null == ((di) this).field_D) {
          return;
        } else {
          if (((di) this).b(0) == null) {
            return;
          } else {
            L0: {
              if (param0 < -107) {
                break L0;
              } else {
                ((di) this).field_p = 74L;
                break L0;
              }
            }
            var2 = ((di) this).field_w.c((byte) -61);
            L1: while (true) {
              if (var2 == null) {
                return;
              } else {
                L2: {
                  var3 = (int)var2.field_d;
                  if (var3 >= 0) {
                    if (((di) this).field_C.field_r > var3) {
                      if (((di) this).field_C.field_e[var3] == 0) {
                        var2.a(true);
                        break L2;
                      } else {
                        L3: {
                          if (((di) this).field_k[var3] != 0) {
                            break L3;
                          } else {
                            sh discarded$2 = this.a(var3, 1, false);
                            break L3;
                          }
                        }
                        L4: {
                          if (((di) this).field_k[var3] != -1) {
                            break L4;
                          } else {
                            sh discarded$3 = this.a(var3, 2, false);
                            break L4;
                          }
                        }
                        if (((di) this).field_k[var3] != 1) {
                          break L2;
                        } else {
                          var2.a(true);
                          break L2;
                        }
                      }
                    } else {
                      var2.a(true);
                      break L2;
                    }
                  } else {
                    var2.a(true);
                    break L2;
                  }
                }
                var2 = ((di) this).field_w.c(-270);
                continue L1;
              }
            }
          }
        }
    }

    final int a(int param0, int param1) {
        sh var3 = (sh) (Object) ((di) this).field_j.a((byte) 91, (long)param1);
        if (param0 != 0) {
            tf discarded$0 = ((di) this).b(124);
        }
        if (var3 != null) {
            return var3.f(100);
        }
        return 0;
    }

    di(int param0, la param1, la param2, vb param3, rb param4, int param5, byte[] param6, int param7, boolean param8) {
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
        ((di) this).field_j = new ha(16);
        ((di) this).field_r = 0;
        ((di) this).field_w = new sl();
        ((di) this).field_p = 0L;
        try {
          L0: {
            L1: {
              ((di) this).field_v = param1;
              ((di) this).field_z = param0;
              if (null != ((di) this).field_v) {
                ((di) this).field_q = true;
                ((di) this).field_D = new sl();
                break L1;
              } else {
                ((di) this).field_q = false;
                break L1;
              }
            }
            L2: {
              ((di) this).field_s = param7;
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
              ((di) this).field_x = stackIn_7_1 != 0;
              ((di) this).field_o = param2;
              ((di) this).field_i = param6;
              ((di) this).field_G = param3;
              ((di) this).field_y = param4;
              ((di) this).field_l = param5;
              if (null == ((di) this).field_o) {
                break L3;
              } else {
                ((di) this).field_u = (sh) (Object) ((di) this).field_y.a(((di) this).field_o, true, ((di) this).field_z);
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
            stackOut_10_1 = new StringBuilder().append("di.<init>(").append(param0).append(44);
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
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
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
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
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
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
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
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44).append(param5).append(44);
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
          throw oj.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param7 + 44 + param8 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = new byte[1000][];
        field_g = new vi();
        field_F = new k(14, 0, 4, 1);
        field_B = " - Not available to this monk.";
        field_n = "achievements to collect";
    }
}
