/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fp extends tja {
    private js field_q;
    private byte[] field_s;
    private ta field_g;
    private vm field_n;
    private rf field_d;
    private int field_k;
    private byte[] field_w;
    private cga field_i;
    static String field_t;
    private ea field_r;
    static po field_f;
    private int field_c;
    private ta field_h;
    private int field_o;
    private boolean field_j;
    private eaa field_v;
    private eaa field_l;
    private boolean field_e;
    private int field_u;
    private long field_m;
    private boolean field_p;

    final byte[] a(byte param0, int param1) {
        cga var3 = this.a(0, 123, param1);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.d((byte) -65);
        int var5 = -54 / ((param0 - 49) / 43);
        var3.a(false);
        return var4;
    }

    final void c(int param0) {
        int var2_int = 0;
        cga var2 = null;
        bw var3 = null;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = BachelorFridge.field_y;
          if (((fp) this).field_v != null) {
            if (null == ((fp) this).b(-82)) {
              return;
            } else {
              if (((fp) this).field_j) {
                var2_int = 1;
                var3 = ((fp) this).field_v.b((byte) 90);
                L1: while (true) {
                  if (var3 == null) {
                    L2: while (true) {
                      L3: {
                        if (((fp) this).field_d.field_e.length <= ((fp) this).field_u) {
                          break L3;
                        } else {
                          L4: {
                            if (0 == ((fp) this).field_d.field_e[((fp) this).field_u]) {
                              break L4;
                            } else {
                              if (((fp) this).field_r.field_b < 250) {
                                L5: {
                                  if (((fp) this).field_s[((fp) this).field_u] != 0) {
                                    break L5;
                                  } else {
                                    cga discarded$4 = this.a(1, 34, ((fp) this).field_u);
                                    break L5;
                                  }
                                }
                                if (0 == ((fp) this).field_s[((fp) this).field_u]) {
                                  var3 = new bw();
                                  var3.field_c = (long)((fp) this).field_u;
                                  var2_int = 0;
                                  ((fp) this).field_v.a(var3, true);
                                  break L4;
                                } else {
                                  break L4;
                                }
                              } else {
                                var2_int = 0;
                                break L3;
                              }
                            }
                          }
                          ((fp) this).field_u = ((fp) this).field_u + 1;
                          continue L2;
                        }
                      }
                      if (var2_int != 0) {
                        ((fp) this).field_u = 0;
                        ((fp) this).field_j = false;
                        break L0;
                      } else {
                        break L0;
                      }
                    }
                  } else {
                    L6: {
                      var4 = (int)var3.field_c;
                      if (((fp) this).field_s[var4] == 0) {
                        cga discarded$5 = this.a(1, 127, var4);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      if (0 != ((fp) this).field_s[var4]) {
                        var3.a(false);
                        break L7;
                      } else {
                        var2_int = 0;
                        break L7;
                      }
                    }
                    var3 = ((fp) this).field_v.c(0);
                    continue L1;
                  }
                }
              } else {
                if (((fp) this).field_e) {
                  var2_int = 1;
                  var3 = ((fp) this).field_v.b((byte) 90);
                  L8: while (true) {
                    if (var3 == null) {
                      L9: while (true) {
                        L10: {
                          if (((fp) this).field_u >= ((fp) this).field_d.field_e.length) {
                            break L10;
                          } else {
                            L11: {
                              if (((fp) this).field_d.field_e[((fp) this).field_u] == 0) {
                                break L11;
                              } else {
                                if (!((fp) this).field_n.a(false)) {
                                  L12: {
                                    if (1 == ((fp) this).field_s[((fp) this).field_u]) {
                                      break L12;
                                    } else {
                                      cga discarded$6 = this.a(2, -107, ((fp) this).field_u);
                                      break L12;
                                    }
                                  }
                                  if (((fp) this).field_s[((fp) this).field_u] == 1) {
                                    break L11;
                                  } else {
                                    var3 = new bw();
                                    var3.field_c = (long)((fp) this).field_u;
                                    var2_int = 0;
                                    ((fp) this).field_v.a(var3, true);
                                    break L11;
                                  }
                                } else {
                                  var2_int = 0;
                                  break L10;
                                }
                              }
                            }
                            ((fp) this).field_u = ((fp) this).field_u + 1;
                            continue L9;
                          }
                        }
                        if (var2_int == 0) {
                          break L0;
                        } else {
                          ((fp) this).field_e = false;
                          ((fp) this).field_u = 0;
                          break L0;
                        }
                      }
                    } else {
                      L13: {
                        var4 = (int)var3.field_c;
                        if (((fp) this).field_s[var4] != 1) {
                          cga discarded$7 = this.a(2, param0 + -14193, var4);
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      L14: {
                        if (1 == ((fp) this).field_s[var4]) {
                          var3.a(false);
                          break L14;
                        } else {
                          var2_int = 0;
                          break L14;
                        }
                      }
                      var3 = ((fp) this).field_v.c(0);
                      continue L8;
                    }
                  }
                } else {
                  ((fp) this).field_v = null;
                  break L0;
                }
              }
            }
          } else {
            break L0;
          }
        }
        L15: {
          if (!((fp) this).field_p) {
            break L15;
          } else {
            if (((fp) this).field_m <= f.b((byte) 73)) {
              var2 = (cga) (Object) ((fp) this).field_q.b(-13023);
              L16: while (true) {
                if (var2 == null) {
                  ((fp) this).field_m = f.b((byte) 73) - -1000L;
                  break L15;
                } else {
                  L17: {
                    if (var2.field_n) {
                      break L17;
                    } else {
                      if (var2.field_o) {
                        if (var2.field_q) {
                          var2.a(false);
                          break L17;
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        var2.field_o = true;
                        break L17;
                      }
                    }
                  }
                  var2 = (cga) (Object) ((fp) this).field_q.c(-21446);
                  continue L16;
                }
              }
            } else {
              break L15;
            }
          }
        }
        L18: {
          if (param0 == 14075) {
            break L18;
          } else {
            ((fp) this).field_m = -36L;
            break L18;
          }
        }
    }

    final void a(byte param0) {
        if (((fp) this).field_h == null) {
            return;
        }
        if (param0 != 90) {
            ((fp) this).a((byte) 110);
        }
        ((fp) this).field_e = true;
        if (((fp) this).field_v == null) {
            ((fp) this).field_v = new eaa();
        }
    }

    final int a(int param0, int param1) {
        cga var3 = (cga) (Object) ((fp) this).field_q.a(true, (long)param1);
        if (!(var3 == null)) {
            return var3.e(-6298);
        }
        if (param0 != 8192) {
            int discarded$0 = ((fp) this).a(-44, -17);
            return 0;
        }
        return 0;
    }

    private final cga a(int param0, int param1, int param2) {
        Object var4 = null;
        byte[] var5 = null;
        int var6 = 0;
        Exception var7 = null;
        RuntimeException var7_ref = null;
        int var7_int = 0;
        int var8_int = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Object stackIn_56_0 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_55_0 = null;
        L0: {
          var11 = BachelorFridge.field_y;
          var4 = (Object) (Object) (cga) (Object) ((fp) this).field_q.a(true, (long)param2);
          if (var4 == null) {
            break L0;
          } else {
            if (0 != param0) {
              break L0;
            } else {
              if (((cga) var4).field_q) {
                break L0;
              } else {
                if (((cga) var4).field_n) {
                  ((cga) var4).a(false);
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
              if (param0 == 0) {
                L3: {
                  if (((fp) this).field_h == null) {
                    break L3;
                  } else {
                    if (((fp) this).field_s[param2] != -1) {
                      var4 = (Object) (Object) ((fp) this).field_r.a(param2, (byte) 112, ((fp) this).field_h);
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (!((fp) this).field_n.b(20)) {
                  var4 = (Object) (Object) ((fp) this).field_n.a(((fp) this).field_o, param2, 127, (byte) 2, true);
                  break L2;
                } else {
                  return null;
                }
              } else {
                if (1 != param0) {
                  if (param0 != 2) {
                    throw new RuntimeException();
                  } else {
                    if (((fp) this).field_h != null) {
                      if (((fp) this).field_s[param2] != -1) {
                        throw new RuntimeException();
                      } else {
                        if (!((fp) this).field_n.a(false)) {
                          var4 = (Object) (Object) ((fp) this).field_n.a(((fp) this).field_o, param2, 126, (byte) 2, false);
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
                  if (((fp) this).field_h != null) {
                    var4 = (Object) (Object) ((fp) this).field_r.a(((fp) this).field_h, (byte) -124, param2);
                    break L2;
                  } else {
                    throw new RuntimeException();
                  }
                }
              }
            }
            ((fp) this).field_q.a((long)param2, (byte) -93, (bw) var4);
            break L1;
          }
        }
        if (!((cga) var4).field_n) {
          var6 = -4 / ((param1 - -42) / 59);
          var5 = ((cga) var4).d((byte) -65);
          if (!(var4 instanceof se)) {
            try {
              L4: {
                L5: {
                  if (var5 == null) {
                    break L5;
                  } else {
                    if (var5.length > 2) {
                      gt.field_l.reset();
                      gt.field_l.update(var5, 0, var5.length - 2);
                      var7_int = (int)gt.field_l.getValue();
                      if (((fp) this).field_d.field_p[param2] != var7_int) {
                        throw new RuntimeException();
                      } else {
                        L6: {
                          if (null == ((fp) this).field_d.field_g) {
                            break L6;
                          } else {
                            if (null != ((fp) this).field_d.field_g[param2]) {
                              var8 = ((fp) this).field_d.field_g[param2];
                              int discarded$3 = 8;
                              var9 = ln.a(-2 + var5.length, var5, 0);
                              var12 = 0;
                              var10 = var12;
                              L7: while (true) {
                                if (var12 >= 64) {
                                  break L6;
                                } else {
                                  if (var9[var12] != var8[var12]) {
                                    throw new RuntimeException();
                                  } else {
                                    var12++;
                                    continue L7;
                                  }
                                }
                              }
                            } else {
                              break L6;
                            }
                          }
                        }
                        ((fp) this).field_n.field_e = 0;
                        ((fp) this).field_n.field_k = 0;
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
              var7_ref = (RuntimeException) (Object) decompiledCaughtException;
              ((fp) this).field_n.b((byte) 109);
              ((cga) var4).a(false);
              if (((cga) var4).field_q) {
                L8: {
                  if (!((fp) this).field_n.b(20)) {
                    var4 = (Object) (Object) ((fp) this).field_n.a(((fp) this).field_o, param2, 126, (byte) 2, true);
                    ((fp) this).field_q.a((long)param2, (byte) -77, (bw) var4);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                return null;
              } else {
                return null;
              }
            }
            L9: {
              var5[-2 + var5.length] = (byte)(((fp) this).field_d.field_i[param2] >>> 8);
              var5[-1 + var5.length] = (byte)((fp) this).field_d.field_i[param2];
              if (((fp) this).field_h != null) {
                se discarded$4 = ((fp) this).field_r.a(((fp) this).field_h, var5, param2, 5);
                if (((fp) this).field_s[param2] != 1) {
                  ((fp) this).field_s[param2] = (byte) 1;
                  break L9;
                } else {
                  break L9;
                }
              } else {
                break L9;
              }
            }
            L10: {
              if (!((cga) var4).field_q) {
                ((cga) var4).a(false);
                break L10;
              } else {
                break L10;
              }
            }
            return (cga) var4;
          } else {
            try {
              L11: {
                L12: {
                  if (var5 == null) {
                    break L12;
                  } else {
                    if (var5.length > 2) {
                      gt.field_l.reset();
                      gt.field_l.update(var5, 0, -2 + var5.length);
                      var7_int = (int)gt.field_l.getValue();
                      if (((fp) this).field_d.field_p[param2] == var7_int) {
                        L13: {
                          if (null == ((fp) this).field_d.field_g) {
                            break L13;
                          } else {
                            if (null != ((fp) this).field_d.field_g[param2]) {
                              var8 = ((fp) this).field_d.field_g[param2];
                              int discarded$5 = 8;
                              var9 = ln.a(var5.length + -2, var5, 0);
                              var10 = 0;
                              L14: while (true) {
                                if (var10 >= 64) {
                                  break L13;
                                } else {
                                  if (var8[var10] == var9[var10]) {
                                    var10++;
                                    continue L14;
                                  } else {
                                    throw new RuntimeException();
                                  }
                                }
                              }
                            } else {
                              break L13;
                            }
                          }
                        }
                        var8_int = ((255 & var5[-2 + var5.length]) << 8) + (255 & var5[var5.length + -1]);
                        if (var8_int == (((fp) this).field_d.field_i[param2] & 65535)) {
                          L15: {
                            if (1 != ((fp) this).field_s[param2]) {
                              L16: {
                                if (((fp) this).field_s[param2] != 0) {
                                  break L16;
                                } else {
                                  break L16;
                                }
                              }
                              ((fp) this).field_s[param2] = (byte) 1;
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          L17: {
                            if (((cga) var4).field_q) {
                              break L17;
                            } else {
                              ((cga) var4).a(false);
                              break L17;
                            }
                          }
                          stackOut_55_0 = var4;
                          stackIn_56_0 = stackOut_55_0;
                          break L11;
                        } else {
                          throw new RuntimeException();
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
              var7 = (Exception) (Object) decompiledCaughtException;
              ((fp) this).field_s[param2] = (byte) -1;
              ((cga) var4).a(false);
              if (((cga) var4).field_q) {
                if (!((fp) this).field_n.b(20)) {
                  var4 = (Object) (Object) ((fp) this).field_n.a(((fp) this).field_o, param2, 127, (byte) 2, true);
                  ((fp) this).field_q.a((long)param2, (byte) -38, (bw) var4);
                  return null;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
            return (cga) (Object) stackIn_56_0;
          }
        } else {
          return null;
        }
    }

    final rf b(int param0) {
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = BachelorFridge.field_y;
        if (null != ((fp) this).field_d) {
          return ((fp) this).field_d;
        } else {
          L0: {
            if (param0 < -7) {
              break L0;
            } else {
              int discarded$2 = ((fp) this).a(74, 4);
              break L0;
            }
          }
          L1: {
            if (((fp) this).field_i != null) {
              break L1;
            } else {
              if (!((fp) this).field_n.b(20)) {
                ((fp) this).field_i = (cga) (Object) ((fp) this).field_n.a(255, ((fp) this).field_o, 127, (byte) 0, true);
                break L1;
              } else {
                return null;
              }
            }
          }
          if (!((fp) this).field_i.field_n) {
            L2: {
              var5 = ((fp) this).field_i.d((byte) -65);
              var2 = var5;
              if (!(((fp) this).field_i instanceof se)) {
                try {
                  L3: {
                    if (var5 == null) {
                      throw new RuntimeException();
                    } else {
                      ((fp) this).field_d = new rf(var5, ((fp) this).field_k, ((fp) this).field_w);
                      break L3;
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var3 = decompiledCaughtException;
                    ((fp) this).field_n.b((byte) -93);
                    ((fp) this).field_d = null;
                    if (((fp) this).field_n.b(20)) {
                      ((fp) this).field_i = null;
                      break L4;
                    } else {
                      ((fp) this).field_i = (cga) (Object) ((fp) this).field_n.a(255, ((fp) this).field_o, 122, (byte) 0, true);
                      break L4;
                    }
                  }
                  return null;
                }
                if (null != ((fp) this).field_g) {
                  se discarded$3 = ((fp) this).field_r.a(((fp) this).field_g, var5, ((fp) this).field_o, 5);
                  break L2;
                } else {
                  break L2;
                }
              } else {
                try {
                  L5: {
                    if (var5 == null) {
                      throw new RuntimeException();
                    } else {
                      ((fp) this).field_d = new rf(var5, ((fp) this).field_k, ((fp) this).field_w);
                      if (((fp) this).field_d.field_r == ((fp) this).field_c) {
                        break L5;
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L6: {
                    var3 = decompiledCaughtException;
                    ((fp) this).field_d = null;
                    if (!((fp) this).field_n.b(20)) {
                      ((fp) this).field_i = (cga) (Object) ((fp) this).field_n.a(255, ((fp) this).field_o, 124, (byte) 0, true);
                      break L6;
                    } else {
                      ((fp) this).field_i = null;
                      break L6;
                    }
                  }
                  return null;
                }
                break L2;
              }
            }
            L7: {
              ((fp) this).field_i = null;
              if (null != ((fp) this).field_h) {
                ((fp) this).field_s = new byte[((fp) this).field_d.field_f];
                break L7;
              } else {
                break L7;
              }
            }
            return ((fp) this).field_d;
          } else {
            return null;
          }
        }
    }

    final void e(int param0) {
        int var3 = 0;
        int var4 = BachelorFridge.field_y;
        if (param0 < 44) {
            ((fp) this).field_p = true;
        }
        if (((fp) this).field_v == null) {
            return;
        }
        if (!(((fp) this).b(-24) != null)) {
            return;
        }
        bw var2 = ((fp) this).field_l.b((byte) 90);
        while (var2 != null) {
            var3 = (int)var2.field_c;
            if (var3 < 0) {
                var2.a(false);
            } else {
                if (var3 >= ((fp) this).field_d.field_f) {
                    var2.a(false);
                } else {
                    if (((fp) this).field_d.field_e[var3] == 0) {
                        var2.a(false);
                    } else {
                        if (((fp) this).field_s[var3] == 0) {
                            cga discarded$0 = this.a(1, -111, var3);
                        }
                        if (-1 == ((fp) this).field_s[var3]) {
                            cga discarded$1 = this.a(2, -116, var3);
                        }
                        if (((fp) this).field_s[var3] == 1) {
                            var2.a(false);
                        }
                    }
                }
            }
            var2 = ((fp) this).field_l.c(0);
        }
    }

    public static void d() {
        field_t = null;
        int var1 = 0;
        field_f = null;
    }

    fp(int param0, ta param1, ta param2, vm param3, ea param4, int param5, byte[] param6, int param7, boolean param8) {
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
        ((fp) this).field_q = new js(16);
        ((fp) this).field_u = 0;
        ((fp) this).field_l = new eaa();
        ((fp) this).field_m = 0L;
        try {
          L0: {
            L1: {
              ((fp) this).field_h = param1;
              ((fp) this).field_o = param0;
              if (((fp) this).field_h != null) {
                ((fp) this).field_j = true;
                ((fp) this).field_v = new eaa();
                break L1;
              } else {
                ((fp) this).field_j = false;
                break L1;
              }
            }
            L2: {
              ((fp) this).field_r = param4;
              ((fp) this).field_w = param6;
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
              ((fp) this).field_p = stackIn_7_1 != 0;
              ((fp) this).field_c = param7;
              ((fp) this).field_k = param5;
              ((fp) this).field_g = param2;
              ((fp) this).field_n = param3;
              if (null == ((fp) this).field_g) {
                break L3;
              } else {
                ((fp) this).field_i = (cga) (Object) ((fp) this).field_r.a(((fp) this).field_o, (byte) -124, ((fp) this).field_g);
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
            stackOut_10_1 = new StringBuilder().append("fp.<init>(").append(param0).append(',');
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
          throw pe.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Here you can see your creatures actions, stats and description. Clicking on an unequipped action will equip it, ready to be used in the Arena. You must equip at least one move type action, and one attack type action. Assign all your actions now.";
    }
}
