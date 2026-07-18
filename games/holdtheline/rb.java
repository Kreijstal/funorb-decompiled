/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb extends ff {
    static int field_m;
    private int field_k;
    static float field_g;
    private og field_w;
    private byte[] field_z;
    private qb field_n;
    private int field_h;
    private ca field_s;
    private sk field_y;
    private byte[] field_o;
    private int field_q;
    private sk field_d;
    private kn field_v;
    static int field_x;
    static int[] field_p;
    private wj field_A;
    private int field_l;
    private boolean field_e;
    static int field_t;
    private ah field_j;
    private boolean field_f;
    private ah field_r;
    static String field_B;
    private long field_i;
    private boolean field_u;

    private final ca a(int param0, int param1, int param2) {
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
        Object stackIn_58_0 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_57_0 = null;
        L0: {
          var10 = HoldTheLine.field_D;
          var4 = (Object) (Object) (ca) (Object) ((rb) this).field_w.a((byte) 122, (long)param2);
          if (param1 >= 48) {
            break L0;
          } else {
            ((rb) this).field_z = null;
            break L0;
          }
        }
        L1: {
          if (var4 == null) {
            break L1;
          } else {
            if (param0 != 0) {
              break L1;
            } else {
              if (((ca) var4).field_t) {
                break L1;
              } else {
                if (((ca) var4).field_u) {
                  ((ca) var4).d(0);
                  var4 = null;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
          }
        }
        L2: {
          if (var4 != null) {
            break L2;
          } else {
            L3: {
              if (param0 == 0) {
                L4: {
                  if (((rb) this).field_d == null) {
                    break L4;
                  } else {
                    if (-1 != ((rb) this).field_o[param2]) {
                      var4 = (Object) (Object) ((rb) this).field_n.a(((rb) this).field_d, -18017, param2);
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                if (!((rb) this).field_A.c(92)) {
                  var4 = (Object) (Object) ((rb) this).field_A.a(param2, true, (byte) 2, (byte) -60, ((rb) this).field_q);
                  break L3;
                } else {
                  return null;
                }
              } else {
                if (param0 != 1) {
                  if (param0 == 2) {
                    if (null != ((rb) this).field_d) {
                      if (((rb) this).field_o[param2] != -1) {
                        throw new RuntimeException();
                      } else {
                        if (!((rb) this).field_A.d(20)) {
                          var4 = (Object) (Object) ((rb) this).field_A.a(param2, false, (byte) 2, (byte) -60, ((rb) this).field_q);
                          break L3;
                        } else {
                          return null;
                        }
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  } else {
                    throw new RuntimeException();
                  }
                } else {
                  if (null != ((rb) this).field_d) {
                    var4 = (Object) (Object) ((rb) this).field_n.a(3, ((rb) this).field_d, param2);
                    break L3;
                  } else {
                    throw new RuntimeException();
                  }
                }
              }
            }
            ((rb) this).field_w.a((hl) var4, (long)param2, false);
            break L2;
          }
        }
        if (!((ca) var4).field_u) {
          var5 = ((ca) var4).i(-20324);
          if (!(var4 instanceof bk)) {
            try {
              L5: {
                L6: {
                  if (var5 == null) {
                    break L6;
                  } else {
                    if (var5.length > 2) {
                      te.field_a.reset();
                      te.field_a.update(var5, 0, -2 + var5.length);
                      var6_int = (int)te.field_a.getValue();
                      if (((rb) this).field_v.field_e[param2] == var6_int) {
                        L7: {
                          if (null == ((rb) this).field_v.field_g) {
                            break L7;
                          } else {
                            if (null == ((rb) this).field_v.field_g[param2]) {
                              break L7;
                            } else {
                              var7 = ((rb) this).field_v.field_g[param2];
                              var8 = wc.a(var5, -6408, 0, -2 + var5.length);
                              var11 = 0;
                              var9 = var11;
                              L8: while (true) {
                                if (var11 >= 64) {
                                  break L7;
                                } else {
                                  if (var7[var11] != var8[var11]) {
                                    throw new RuntimeException();
                                  } else {
                                    var11++;
                                    continue L8;
                                  }
                                }
                              }
                            }
                          }
                        }
                        ((rb) this).field_A.field_c = 0;
                        ((rb) this).field_A.field_f = 0;
                        break L5;
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      break L6;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L9: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                ((rb) this).field_A.a(false);
                ((ca) var4).d(0);
                if (((ca) var4).field_t) {
                  if (!((rb) this).field_A.c(90)) {
                    var4 = (Object) (Object) ((rb) this).field_A.a(param2, true, (byte) 2, (byte) -60, ((rb) this).field_q);
                    ((rb) this).field_w.a((hl) var4, (long)param2, false);
                    break L9;
                  } else {
                    break L9;
                  }
                } else {
                  break L9;
                }
              }
              return null;
            }
            L10: {
              var5[var5.length - 2] = (byte)(((rb) this).field_v.field_p[param2] >>> 8);
              var5[-1 + var5.length] = (byte)((rb) this).field_v.field_p[param2];
              if (null != ((rb) this).field_d) {
                bk discarded$1 = ((rb) this).field_n.a(param2, ((rb) this).field_d, var5, 11998);
                if (((rb) this).field_o[param2] == 1) {
                  break L10;
                } else {
                  ((rb) this).field_o[param2] = (byte) 1;
                  break L10;
                }
              } else {
                break L10;
              }
            }
            L11: {
              if (((ca) var4).field_t) {
                break L11;
              } else {
                ((ca) var4).d(0);
                break L11;
              }
            }
            return (ca) var4;
          } else {
            try {
              L12: {
                L13: {
                  if (var5 == null) {
                    break L13;
                  } else {
                    if (2 >= var5.length) {
                      break L13;
                    } else {
                      te.field_a.reset();
                      te.field_a.update(var5, 0, -2 + var5.length);
                      var6_int = (int)te.field_a.getValue();
                      if (((rb) this).field_v.field_e[param2] == var6_int) {
                        L14: {
                          if (null == ((rb) this).field_v.field_g) {
                            break L14;
                          } else {
                            if (null == ((rb) this).field_v.field_g[param2]) {
                              break L14;
                            } else {
                              var7 = ((rb) this).field_v.field_g[param2];
                              var8 = wc.a(var5, -6408, 0, var5.length - 2);
                              var9 = 0;
                              L15: while (true) {
                                if (var9 >= 64) {
                                  break L14;
                                } else {
                                  if (var8[var9] != var7[var9]) {
                                    throw new RuntimeException();
                                  } else {
                                    var9++;
                                    continue L15;
                                  }
                                }
                              }
                            }
                          }
                        }
                        var7_int = (var5[-1 + var5.length] & 255) + (65280 & var5[var5.length + -2] << 8);
                        if ((((rb) this).field_v.field_p[param2] & 65535) == var7_int) {
                          L16: {
                            if (((rb) this).field_o[param2] == 1) {
                              break L16;
                            } else {
                              L17: {
                                if (((rb) this).field_o[param2] == 0) {
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                              ((rb) this).field_o[param2] = (byte) 1;
                              break L16;
                            }
                          }
                          L18: {
                            if (((ca) var4).field_t) {
                              break L18;
                            } else {
                              ((ca) var4).d(0);
                              break L18;
                            }
                          }
                          stackOut_57_0 = var4;
                          stackIn_58_0 = stackOut_57_0;
                          break L12;
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
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var6 = (Exception) (Object) decompiledCaughtException;
              ((rb) this).field_o[param2] = (byte) -1;
              ((ca) var4).d(0);
              if (((ca) var4).field_t) {
                L19: {
                  if (!((rb) this).field_A.c(104)) {
                    var4 = (Object) (Object) ((rb) this).field_A.a(param2, true, (byte) 2, (byte) -60, ((rb) this).field_q);
                    ((rb) this).field_w.a((hl) var4, (long)param2, false);
                    break L19;
                  } else {
                    break L19;
                  }
                }
                return null;
              } else {
                return null;
              }
            }
            return (ca) (Object) stackIn_58_0;
          }
        } else {
          return null;
        }
    }

    final kn a(byte param0) {
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = HoldTheLine.field_D;
        if (null != ((rb) this).field_v) {
          return ((rb) this).field_v;
        } else {
          L0: {
            if (param0 >= 70) {
              break L0;
            } else {
              ((rb) this).field_r = null;
              break L0;
            }
          }
          L1: {
            if (((rb) this).field_s == null) {
              if (!((rb) this).field_A.c(77)) {
                ((rb) this).field_s = (ca) (Object) ((rb) this).field_A.a(((rb) this).field_q, true, (byte) 0, (byte) -60, 255);
                break L1;
              } else {
                return null;
              }
            } else {
              break L1;
            }
          }
          if (!((rb) this).field_s.field_u) {
            L2: {
              var5 = ((rb) this).field_s.i(-20324);
              var2 = var5;
              if (((rb) this).field_s instanceof bk) {
                try {
                  L3: {
                    if (var5 != null) {
                      ((rb) this).field_v = new kn(var5, ((rb) this).field_h, ((rb) this).field_z);
                      if (((rb) this).field_v.field_s != ((rb) this).field_k) {
                        throw new RuntimeException();
                      } else {
                        break L3;
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var3 = decompiledCaughtException;
                    ((rb) this).field_v = null;
                    if (!((rb) this).field_A.c(98)) {
                      ((rb) this).field_s = (ca) (Object) ((rb) this).field_A.a(((rb) this).field_q, true, (byte) 0, (byte) -60, 255);
                      break L4;
                    } else {
                      ((rb) this).field_s = null;
                      break L4;
                    }
                  }
                  return null;
                }
                break L2;
              } else {
                try {
                  L5: {
                    if (var5 == null) {
                      throw new RuntimeException();
                    } else {
                      ((rb) this).field_v = new kn(var5, ((rb) this).field_h, ((rb) this).field_z);
                      break L5;
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L6: {
                    var3 = decompiledCaughtException;
                    ((rb) this).field_A.a(false);
                    ((rb) this).field_v = null;
                    if (!((rb) this).field_A.c(75)) {
                      ((rb) this).field_s = (ca) (Object) ((rb) this).field_A.a(((rb) this).field_q, true, (byte) 0, (byte) -60, 255);
                      break L6;
                    } else {
                      ((rb) this).field_s = null;
                      break L6;
                    }
                  }
                  return null;
                }
                if (null != ((rb) this).field_y) {
                  bk discarded$1 = ((rb) this).field_n.a(((rb) this).field_q, ((rb) this).field_y, var5, 11998);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L7: {
              if (null != ((rb) this).field_d) {
                ((rb) this).field_o = new byte[((rb) this).field_v.field_o];
                break L7;
              } else {
                break L7;
              }
            }
            ((rb) this).field_s = null;
            return ((rb) this).field_v;
          } else {
            return null;
          }
        }
    }

    final byte[] a(byte param0, int param1) {
        ca var3 = this.a(0, 92, param1);
        if (var3 == null) {
            return null;
        }
        if (param0 > -54) {
            return null;
        }
        byte[] var4 = var3.i(-20324);
        var3.d(0);
        return var4;
    }

    public static void d() {
        field_p = null;
        field_B = null;
    }

    final void b(byte param0) {
        if (((rb) this).field_d == null) {
            return;
        }
        ((rb) this).field_e = true;
        if (!(((rb) this).field_r != null)) {
            ((rb) this).field_r = new ah();
        }
        if (param0 >= -10) {
            ((rb) this).b(-110);
        }
    }

    final void c(int param0) {
        int var3 = 0;
        int var4 = HoldTheLine.field_D;
        if (!(((rb) this).field_r != null)) {
            return;
        }
        if (null == ((rb) this).a((byte) 104)) {
            return;
        }
        if (param0 != 2) {
            ((rb) this).field_h = -32;
        }
        hl var2 = ((rb) this).field_j.b((byte) 121);
        while (var2 != null) {
            var3 = (int)var2.field_f;
            if (var3 < 0) {
                var2.d(0);
            } else {
                if (((rb) this).field_v.field_o <= var3) {
                    var2.d(0);
                } else {
                    if (((rb) this).field_v.field_u[var3] == 0) {
                        var2.d(0);
                    } else {
                        if (0 == ((rb) this).field_o[var3]) {
                            ca discarded$0 = this.a(1, 62, var3);
                        }
                        if (((rb) this).field_o[var3] == -1) {
                            ca discarded$1 = this.a(2, 120, var3);
                        }
                        if (!(((rb) this).field_o[var3] != 1)) {
                            var2.d(0);
                        }
                    }
                }
            }
            var2 = ((rb) this).field_j.c((byte) 117);
        }
    }

    final void b(int param0) {
        ca var2 = null;
        int var2_int = 0;
        hl var3 = null;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = HoldTheLine.field_D;
          if (((rb) this).field_r == null) {
            break L0;
          } else {
            if (((rb) this).a((byte) 73) != null) {
              if (((rb) this).field_f) {
                var2_int = 1;
                var3 = ((rb) this).field_r.b((byte) 99);
                L1: while (true) {
                  if (var3 == null) {
                    L2: while (true) {
                      L3: {
                        if (((rb) this).field_l >= ((rb) this).field_v.field_u.length) {
                          break L3;
                        } else {
                          if (-1 != ((rb) this).field_v.field_u[((rb) this).field_l]) {
                            if (-251 > ((rb) this).field_n.field_c) {
                              L4: {
                                if (((rb) this).field_o[((rb) this).field_l] != 0) {
                                  break L4;
                                } else {
                                  ca discarded$4 = this.a(1, 106, ((rb) this).field_l);
                                  break L4;
                                }
                              }
                              L5: {
                                if (((rb) this).field_o[((rb) this).field_l] == 0) {
                                  var3 = new hl();
                                  var3.field_f = (long)((rb) this).field_l;
                                  var2_int = 0;
                                  ((rb) this).field_r.a((byte) -82, var3);
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                              ((rb) this).field_l = ((rb) this).field_l + 1;
                              continue L2;
                            } else {
                              var2_int = 0;
                              break L3;
                            }
                          } else {
                            ((rb) this).field_l = ((rb) this).field_l + 1;
                            continue L2;
                          }
                        }
                      }
                      if (var2_int != 0) {
                        ((rb) this).field_f = false;
                        ((rb) this).field_l = 0;
                        break L0;
                      } else {
                        break L0;
                      }
                    }
                  } else {
                    L6: {
                      var4 = (int)var3.field_f;
                      if (0 == ((rb) this).field_o[var4]) {
                        ca discarded$5 = this.a(1, param0 ^ 102, var4);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      if (0 != ((rb) this).field_o[var4]) {
                        var3.d(0);
                        break L7;
                      } else {
                        var2_int = 0;
                        break L7;
                      }
                    }
                    var3 = ((rb) this).field_r.c((byte) 113);
                    continue L1;
                  }
                }
              } else {
                if (((rb) this).field_e) {
                  var2_int = 1;
                  var3 = ((rb) this).field_r.b((byte) 92);
                  L8: while (true) {
                    if (var3 == null) {
                      L9: while (true) {
                        L10: {
                          if (((rb) this).field_l >= ((rb) this).field_v.field_u.length) {
                            break L10;
                          } else {
                            L11: {
                              if (((rb) this).field_v.field_u[((rb) this).field_l] == 0) {
                                break L11;
                              } else {
                                if (!((rb) this).field_A.d(param0 ^ 22)) {
                                  L12: {
                                    if (((rb) this).field_o[((rb) this).field_l] != 1) {
                                      ca discarded$6 = this.a(2, 74, ((rb) this).field_l);
                                      break L12;
                                    } else {
                                      break L12;
                                    }
                                  }
                                  if (1 == ((rb) this).field_o[((rb) this).field_l]) {
                                    break L11;
                                  } else {
                                    var3 = new hl();
                                    var3.field_f = (long)((rb) this).field_l;
                                    var2_int = 0;
                                    ((rb) this).field_r.a((byte) -125, var3);
                                    break L11;
                                  }
                                } else {
                                  var2_int = 0;
                                  break L10;
                                }
                              }
                            }
                            ((rb) this).field_l = ((rb) this).field_l + 1;
                            continue L9;
                          }
                        }
                        if (var2_int != 0) {
                          ((rb) this).field_l = 0;
                          ((rb) this).field_e = false;
                          break L0;
                        } else {
                          break L0;
                        }
                      }
                    } else {
                      L13: {
                        var4 = (int)var3.field_f;
                        if (((rb) this).field_o[var4] != 1) {
                          ca discarded$7 = this.a(2, 53, var4);
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      L14: {
                        if (((rb) this).field_o[var4] != 1) {
                          var2_int = 0;
                          break L14;
                        } else {
                          var3.d(0);
                          break L14;
                        }
                      }
                      var3 = ((rb) this).field_r.c((byte) -86);
                      continue L8;
                    }
                  }
                } else {
                  ((rb) this).field_r = null;
                  break L0;
                }
              }
            } else {
              return;
            }
          }
        }
        L15: {
          if (!((rb) this).field_u) {
            break L15;
          } else {
            if (((rb) this).field_i <= bb.b(-1)) {
              var2 = (ca) (Object) ((rb) this).field_w.a(0);
              L16: while (true) {
                if (var2 == null) {
                  ((rb) this).field_i = 1000L + bb.b(-1);
                  break L15;
                } else {
                  L17: {
                    if (!var2.field_u) {
                      if (var2.field_q) {
                        if (var2.field_t) {
                          var2.d(0);
                          break L17;
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        var2.field_q = true;
                        break L17;
                      }
                    } else {
                      break L17;
                    }
                  }
                  var2 = (ca) (Object) ((rb) this).field_w.b(-1);
                  continue L16;
                }
              }
            } else {
              break L15;
            }
          }
        }
        L18: {
          if (param0 == 2) {
            break L18;
          } else {
            ((rb) this).field_y = null;
            break L18;
          }
        }
    }

    final int a(boolean param0, int param1) {
        ca var3 = (ca) (Object) ((rb) this).field_w.a((byte) 113, (long)param1);
        if (param0) {
            ((rb) this).field_v = null;
        }
        if (var3 == null) {
            return 0;
        }
        return var3.g(0);
    }

    rb(int param0, sk param1, sk param2, wj param3, qb param4, int param5, byte[] param6, int param7, boolean param8) {
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
        ((rb) this).field_w = new og(16);
        ((rb) this).field_l = 0;
        ((rb) this).field_j = new ah();
        ((rb) this).field_i = 0L;
        try {
          L0: {
            L1: {
              ((rb) this).field_q = param0;
              ((rb) this).field_d = param1;
              if (((rb) this).field_d != null) {
                ((rb) this).field_f = true;
                ((rb) this).field_r = new ah();
                break L1;
              } else {
                ((rb) this).field_f = false;
                break L1;
              }
            }
            L2: {
              ((rb) this).field_z = param6;
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
              ((rb) this).field_u = stackIn_7_1 != 0;
              ((rb) this).field_A = param3;
              ((rb) this).field_y = param2;
              ((rb) this).field_n = param4;
              ((rb) this).field_k = param7;
              ((rb) this).field_h = param5;
              if (null == ((rb) this).field_y) {
                break L3;
              } else {
                ((rb) this).field_s = (ca) (Object) ((rb) this).field_n.a(((rb) this).field_y, -18017, ((rb) this).field_q);
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
            stackOut_10_1 = new StringBuilder().append("rb.<init>(").append(param0).append(',');
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
          throw kk.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = 10;
        field_t = 0;
        field_B = "Start Game";
    }
}
