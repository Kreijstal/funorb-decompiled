/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be extends ih {
    private uh field_t;
    private rh field_f;
    private int field_o;
    private fl field_m;
    private int field_r;
    private ak field_p;
    private cd field_g;
    private ak field_z;
    private byte[] field_i;
    static int field_q;
    private byte[] field_k;
    private el field_v;
    private int field_A;
    private qj field_y;
    private int field_e;
    private qj field_s;
    private boolean field_h;
    private boolean field_u;
    private boolean field_j;
    private long field_l;
    static nk field_w;
    static ci field_n;
    static int field_x;

    public static void c() {
        field_n = null;
        field_w = null;
    }

    private final rh a(int param0, byte param1, int param2) {
        Object var4 = null;
        byte[] var5 = null;
        RuntimeException var6 = null;
        Exception var6_ref = null;
        int var6_int = 0;
        int var7 = 0;
        byte[] var7_ref_byte__ = null;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object stackIn_88_0 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_87_0 = null;
        L0: {
          var10 = Transmogrify.field_A ? 1 : 0;
          var4 = (Object) (Object) (rh) (Object) ((be) this).field_m.a((long)param0, 0);
          if (var4 == null) {
            break L0;
          } else {
            if (param2 != 0) {
              break L0;
            } else {
              if (((rh) var4).field_p) {
                break L0;
              } else {
                if (((rh) var4).field_m) {
                  ((rh) var4).c(5);
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
          if (var4 == null) {
            L2: {
              if (param2 != 0) {
                if (param2 != 1) {
                  if (2 == param2) {
                    if (((be) this).field_p == null) {
                      throw new RuntimeException();
                    } else {
                      if (((be) this).field_k[param0] != -1) {
                        throw new RuntimeException();
                      } else {
                        if (!((be) this).field_t.b((byte) 95)) {
                          var4 = (Object) (Object) ((be) this).field_t.a(((be) this).field_r, false, false, (byte) 2, param0);
                          break L2;
                        } else {
                          return null;
                        }
                      }
                    }
                  } else {
                    throw new RuntimeException();
                  }
                } else {
                  if (((be) this).field_p != null) {
                    var4 = (Object) (Object) ((be) this).field_g.a(param0, ((be) this).field_p, (byte) 67);
                    break L2;
                  } else {
                    throw new RuntimeException();
                  }
                }
              } else {
                L3: {
                  if (((be) this).field_p == null) {
                    break L3;
                  } else {
                    if (((be) this).field_k[param0] == -1) {
                      break L3;
                    } else {
                      var4 = (Object) (Object) ((be) this).field_g.a(((be) this).field_p, param0, true);
                      break L2;
                    }
                  }
                }
                if (!((be) this).field_t.b(6)) {
                  var4 = (Object) (Object) ((be) this).field_t.a(((be) this).field_r, false, true, (byte) 2, param0);
                  break L2;
                } else {
                  return null;
                }
              }
            }
            ((be) this).field_m.a((long)param0, (byte) -98, (wf) var4);
            break L1;
          } else {
            break L1;
          }
        }
        if (!((rh) var4).field_m) {
          var5 = ((rh) var4).e(256);
          if (var4 instanceof cl) {
            try {
              L4: {
                L5: {
                  if (var5 == null) {
                    break L5;
                  } else {
                    if (var5.length <= 2) {
                      break L5;
                    } else {
                      hc.field_v.reset();
                      hc.field_v.update(var5, 0, var5.length + -2);
                      var6_int = (int)hc.field_v.getValue();
                      if (var6_int == ((be) this).field_v.field_j[param0]) {
                        L6: {
                          if (((be) this).field_v.field_p == null) {
                            break L6;
                          } else {
                            if (null != ((be) this).field_v.field_p[param0]) {
                              var7_ref_byte__ = ((be) this).field_v.field_p[param0];
                              var8 = n.a(var5, var5.length - 2, -5705, 0);
                              var11 = 0;
                              var9 = var11;
                              L7: while (true) {
                                if (var11 >= 64) {
                                  break L6;
                                } else {
                                  if (var8[var11] == var7_ref_byte__[var11]) {
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
                        var7 = (var5[var5.length - 2] << 8 & 65280) + (var5[-1 + var5.length] & 255);
                        if ((65535 & ((be) this).field_v.field_q[param0]) == var7) {
                          L8: {
                            if (((be) this).field_k[param0] != 1) {
                              L9: {
                                if (0 == ((be) this).field_k[param0]) {
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              ((be) this).field_k[param0] = (byte) 1;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          L10: {
                            if (!((rh) var4).field_p) {
                              ((rh) var4).c(5);
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          stackOut_87_0 = var4;
                          stackIn_88_0 = stackOut_87_0;
                          break L4;
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
              L11: {
                var6_ref = (Exception) (Object) decompiledCaughtException;
                ((be) this).field_k[param0] = (byte) -1;
                ((rh) var4).c(5);
                if (((rh) var4).field_p) {
                  if (!((be) this).field_t.b(6)) {
                    var4 = (Object) (Object) ((be) this).field_t.a(((be) this).field_r, false, true, (byte) 2, param0);
                    ((be) this).field_m.a((long)param0, (byte) 98, (wf) var4);
                    break L11;
                  } else {
                    return null;
                  }
                } else {
                  break L11;
                }
              }
              return null;
            }
            return (rh) (Object) stackIn_88_0;
          } else {
            try {
              L12: {
                L13: {
                  if (var5 == null) {
                    break L13;
                  } else {
                    if (var5.length > 2) {
                      hc.field_v.reset();
                      hc.field_v.update(var5, 0, var5.length - 2);
                      var6_int = (int)hc.field_v.getValue();
                      if (var6_int != ((be) this).field_v.field_j[param0]) {
                        throw new RuntimeException();
                      } else {
                        L14: {
                          if (((be) this).field_v.field_p == null) {
                            break L14;
                          } else {
                            if (null != ((be) this).field_v.field_p[param0]) {
                              var7_ref_byte__ = ((be) this).field_v.field_p[param0];
                              var8 = n.a(var5, var5.length - 2, -5705, 0);
                              var9 = 0;
                              L15: while (true) {
                                if (var9 >= 64) {
                                  break L14;
                                } else {
                                  if (var7_ref_byte__[var9] == var8[var9]) {
                                    var9++;
                                    continue L15;
                                  } else {
                                    throw new RuntimeException();
                                  }
                                }
                              }
                            } else {
                              break L14;
                            }
                          }
                        }
                        ((be) this).field_t.field_p = 0;
                        ((be) this).field_t.field_k = 0;
                        break L12;
                      }
                    } else {
                      break L13;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var6 = (RuntimeException) (Object) decompiledCaughtException;
              ((be) this).field_t.d(126);
              ((rh) var4).c(5);
              if (((rh) var4).field_p) {
                if (!((be) this).field_t.b(6)) {
                  var4 = (Object) (Object) ((be) this).field_t.a(((be) this).field_r, false, true, (byte) 2, param0);
                  ((be) this).field_m.a((long)param0, (byte) -102, (wf) var4);
                  return null;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
            L16: {
              var5[-2 + var5.length] = (byte)(((be) this).field_v.field_q[param0] >>> 8);
              var5[-1 + var5.length] = (byte)((be) this).field_v.field_q[param0];
              if (null == ((be) this).field_p) {
                break L16;
              } else {
                cl discarded$1 = ((be) this).field_g.a(((be) this).field_p, var5, -122, param0);
                if (((be) this).field_k[param0] != 1) {
                  ((be) this).field_k[param0] = (byte) 1;
                  break L16;
                } else {
                  break L16;
                }
              }
            }
            L17: {
              if (!((rh) var4).field_p) {
                ((rh) var4).c(5);
                break L17;
              } else {
                break L17;
              }
            }
            return (rh) var4;
          }
        } else {
          return null;
        }
    }

    final el a(int param0) {
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        if (null != ((be) this).field_v) {
          return ((be) this).field_v;
        } else {
          if (param0 <= -88) {
            L0: {
              if (null == ((be) this).field_f) {
                if (!((be) this).field_t.b(6)) {
                  ((be) this).field_f = (rh) (Object) ((be) this).field_t.a(255, false, true, (byte) 0, ((be) this).field_r);
                  break L0;
                } else {
                  return null;
                }
              } else {
                break L0;
              }
            }
            if (!((be) this).field_f.field_m) {
              L1: {
                var5 = ((be) this).field_f.e(256);
                var2 = var5;
                if (!(((be) this).field_f instanceof cl)) {
                  try {
                    L2: {
                      if (var5 == null) {
                        throw new RuntimeException();
                      } else {
                        ((be) this).field_v = new el(var5, ((be) this).field_A, ((be) this).field_i);
                        break L2;
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var3 = decompiledCaughtException;
                      ((be) this).field_t.d(121);
                      ((be) this).field_v = null;
                      if (!((be) this).field_t.b(6)) {
                        ((be) this).field_f = (rh) (Object) ((be) this).field_t.a(255, false, true, (byte) 0, ((be) this).field_r);
                        break L3;
                      } else {
                        ((be) this).field_f = null;
                        break L3;
                      }
                    }
                    return null;
                  }
                  if (null == ((be) this).field_z) {
                    break L1;
                  } else {
                    cl discarded$1 = ((be) this).field_g.a(((be) this).field_z, var5, -78, ((be) this).field_r);
                    break L1;
                  }
                } else {
                  try {
                    L4: {
                      if (var5 != null) {
                        ((be) this).field_v = new el(var5, ((be) this).field_A, ((be) this).field_i);
                        if (((be) this).field_v.field_b == ((be) this).field_o) {
                          break L4;
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L5: {
                      var3 = decompiledCaughtException;
                      ((be) this).field_v = null;
                      if (((be) this).field_t.b(6)) {
                        ((be) this).field_f = null;
                        break L5;
                      } else {
                        ((be) this).field_f = (rh) (Object) ((be) this).field_t.a(255, false, true, (byte) 0, ((be) this).field_r);
                        break L5;
                      }
                    }
                    return null;
                  }
                  break L1;
                }
              }
              L6: {
                if (null != ((be) this).field_p) {
                  ((be) this).field_k = new byte[((be) this).field_v.field_l];
                  break L6;
                } else {
                  break L6;
                }
              }
              ((be) this).field_f = null;
              return ((be) this).field_v;
            } else {
              return null;
            }
          } else {
            return null;
          }
        }
    }

    final void d(int param0) {
        int var3 = 0;
        int var4 = Transmogrify.field_A ? 1 : 0;
        if (!(null != ((be) this).field_s)) {
            return;
        }
        if (null == ((be) this).a(-119)) {
            return;
        }
        wf var2 = ((be) this).field_y.a((byte) -95);
        while (var2 != null) {
            var3 = (int)var2.field_c;
            if (var3 < 0) {
                var2.c(5);
            } else {
                if (((be) this).field_v.field_l <= var3) {
                    var2.c(5);
                } else {
                    if (0 == ((be) this).field_v.field_s[var3]) {
                        var2.c(5);
                    } else {
                        if (!(0 != ((be) this).field_k[var3])) {
                            rh discarded$0 = this.a(var3, (byte) 2, 1);
                        }
                        if (((be) this).field_k[var3] == -1) {
                            rh discarded$1 = this.a(var3, (byte) 2, 2);
                        }
                        if (((be) this).field_k[var3] == 1) {
                            var2.c(param0 ^ 23884);
                        }
                    }
                }
            }
            var2 = ((be) this).field_y.a(true);
        }
        if (param0 != 23881) {
            ((be) this).field_v = null;
        }
    }

    final static int b() {
        if (bi.field_L >= 2) {
          L0: {
            if (0 == w.field_f) {
              if (!cj.field_c.a((byte) -126)) {
                return 20;
              } else {
                if (!cj.field_c.a((byte) 120, "commonui")) {
                  return 40;
                } else {
                  if (!wi.field_e.a((byte) -127)) {
                    return 50;
                  } else {
                    if (wi.field_e.a((byte) 112, "commonui")) {
                      if (!nd.field_n.a((byte) -118)) {
                        return 70;
                      } else {
                        if (nd.field_n.c(32031)) {
                          break L0;
                        } else {
                          return 80;
                        }
                      }
                    } else {
                      return 60;
                    }
                  }
                }
              }
            } else {
              L1: {
                if (null == hg.field_a) {
                  break L1;
                } else {
                  if (hg.field_a.a((byte) -114)) {
                    if (!hg.field_a.b((byte) -120, "")) {
                      return 29;
                    } else {
                      if (!hg.field_a.a((byte) -98, "")) {
                        return 29;
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    return 14;
                  }
                }
              }
              if (cj.field_c.a((byte) -125)) {
                if (cj.field_c.a((byte) 120, "commonui")) {
                  if (wi.field_e.a((byte) -118)) {
                    if (wi.field_e.a((byte) -42, "commonui")) {
                      if (nd.field_n.a((byte) -118)) {
                        if (!nd.field_n.c(32031)) {
                          return 86;
                        } else {
                          break L0;
                        }
                      } else {
                        return 82;
                      }
                    } else {
                      return 80;
                    }
                  } else {
                    return 71;
                  }
                } else {
                  return 57;
                }
              } else {
                return 43;
              }
            }
          }
          return 100;
        } else {
          return 0;
        }
    }

    final void a(boolean param0) {
        if (null == ((be) this).field_p) {
            return;
        }
        ((be) this).field_h = param0 ? true : false;
        if (!(null != ((be) this).field_s)) {
            ((be) this).field_s = new qj();
        }
    }

    final static boolean a(String param0, int param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            int discarded$9 = 3336;
            if (ga.a(param0)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (ve.a(1, param0)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                if (!vj.a(-23424, param0)) {
                  if (param2.length() != param1) {
                    if (!fc.a((byte) 19, param0, param2)) {
                      if (fk.a(param2, (byte) 34, param0)) {
                        stackOut_19_0 = 0;
                        stackIn_20_0 = stackOut_19_0;
                        return stackIn_20_0 != 0;
                      } else {
                        if (me.a(param2, (byte) 117, param0)) {
                          stackOut_23_0 = 0;
                          stackIn_24_0 = stackOut_23_0;
                          break L0;
                        } else {
                          return true;
                        }
                      }
                    } else {
                      stackOut_15_0 = 0;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0 != 0;
                    }
                  } else {
                    stackOut_12_0 = 1;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0 != 0;
                  }
                } else {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var3;
            stackOut_25_1 = new StringBuilder().append("be.I(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L1;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L1;
            }
          }
          L2: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(44).append(param1).append(44);
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L2;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L2;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 41);
        }
        return stackIn_24_0 != 0;
    }

    final void b(byte param0) {
        int var2_int = 0;
        rh var2 = null;
        wf var3 = null;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Transmogrify.field_A ? 1 : 0;
          if (null != ((be) this).field_s) {
            if (null != ((be) this).a(-95)) {
              if (((be) this).field_u) {
                var2_int = 1;
                var3 = ((be) this).field_s.a((byte) -95);
                L1: while (true) {
                  if (var3 == null) {
                    L2: while (true) {
                      L3: {
                        if (((be) this).field_e >= ((be) this).field_v.field_s.length) {
                          break L3;
                        } else {
                          L4: {
                            if (((be) this).field_v.field_s[((be) this).field_e] == 0) {
                              break L4;
                            } else {
                              if (250 <= ((be) this).field_g.field_e) {
                                var2_int = 0;
                                break L3;
                              } else {
                                L5: {
                                  if (((be) this).field_k[((be) this).field_e] != 0) {
                                    break L5;
                                  } else {
                                    rh discarded$4 = this.a(((be) this).field_e, (byte) 2, 1);
                                    break L5;
                                  }
                                }
                                if (((be) this).field_k[((be) this).field_e] == 0) {
                                  var3 = new wf();
                                  var3.field_c = (long)((be) this).field_e;
                                  var2_int = 0;
                                  ((be) this).field_s.a(var3, -115);
                                  break L4;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                          ((be) this).field_e = ((be) this).field_e + 1;
                          continue L2;
                        }
                      }
                      if (var2_int != 0) {
                        ((be) this).field_e = 0;
                        ((be) this).field_u = false;
                        break L0;
                      } else {
                        break L0;
                      }
                    }
                  } else {
                    L6: {
                      var4 = (int)var3.field_c;
                      if (((be) this).field_k[var4] == 0) {
                        rh discarded$5 = this.a(var4, (byte) 2, 1);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      if (((be) this).field_k[var4] == 0) {
                        var2_int = 0;
                        break L7;
                      } else {
                        var3.c(5);
                        break L7;
                      }
                    }
                    var3 = ((be) this).field_s.a(true);
                    continue L1;
                  }
                }
              } else {
                if (!((be) this).field_h) {
                  ((be) this).field_s = null;
                  break L0;
                } else {
                  var2_int = 1;
                  var3 = ((be) this).field_s.a((byte) -95);
                  L8: while (true) {
                    if (var3 == null) {
                      L9: while (true) {
                        L10: {
                          if (((be) this).field_v.field_s.length <= ((be) this).field_e) {
                            break L10;
                          } else {
                            if (((be) this).field_v.field_s[((be) this).field_e] != 0) {
                              if (!((be) this).field_t.b((byte) 122)) {
                                L11: {
                                  if (((be) this).field_k[((be) this).field_e] == 1) {
                                    break L11;
                                  } else {
                                    rh discarded$6 = this.a(((be) this).field_e, (byte) 2, 2);
                                    break L11;
                                  }
                                }
                                L12: {
                                  if (1 != ((be) this).field_k[((be) this).field_e]) {
                                    var3 = new wf();
                                    var3.field_c = (long)((be) this).field_e;
                                    ((be) this).field_s.a(var3, -89);
                                    var2_int = 0;
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                                ((be) this).field_e = ((be) this).field_e + 1;
                                continue L9;
                              } else {
                                var2_int = 0;
                                break L10;
                              }
                            } else {
                              ((be) this).field_e = ((be) this).field_e + 1;
                              continue L9;
                            }
                          }
                        }
                        if (var2_int != 0) {
                          ((be) this).field_h = false;
                          ((be) this).field_e = 0;
                          break L0;
                        } else {
                          break L0;
                        }
                      }
                    } else {
                      L13: {
                        var4 = (int)var3.field_c;
                        if (((be) this).field_k[var4] != 1) {
                          rh discarded$7 = this.a(var4, (byte) 2, 2);
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      L14: {
                        if (1 == ((be) this).field_k[var4]) {
                          var3.c(5);
                          break L14;
                        } else {
                          var2_int = 0;
                          break L14;
                        }
                      }
                      var3 = ((be) this).field_s.a(true);
                      continue L8;
                    }
                  }
                }
              }
            } else {
              return;
            }
          } else {
            break L0;
          }
        }
        L15: {
          if (param0 >= 122) {
            break L15;
          } else {
            ((be) this).field_g = null;
            break L15;
          }
        }
        L16: {
          if (!((be) this).field_j) {
            break L16;
          } else {
            if (~((be) this).field_l < ~lk.a(0)) {
              break L16;
            } else {
              var2 = (rh) (Object) ((be) this).field_m.b(1000);
              L17: while (true) {
                if (var2 == null) {
                  ((be) this).field_l = lk.a(0) + 1000L;
                  break L16;
                } else {
                  L18: {
                    if (var2.field_m) {
                      break L18;
                    } else {
                      if (var2.field_o) {
                        if (var2.field_p) {
                          var2.c(5);
                          break L18;
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        var2.field_o = true;
                        break L18;
                      }
                    }
                  }
                  var2 = (rh) (Object) ((be) this).field_m.a(58);
                  continue L17;
                }
              }
            }
          }
        }
    }

    final byte[] a(int param0, int param1) {
        int var3 = 76 / ((-41 - param1) / 60);
        rh var4 = this.a(param0, (byte) 2, 0);
        if (var4 == null) {
            return null;
        }
        byte[] var5 = var4.e(256);
        var4.c(5);
        return var5;
    }

    final static hg c(int param0) {
        String var1 = cd.b(-89);
        if (var1 != null) {
            if (0 <= var1.indexOf('@')) {
                var1 = "";
            }
        }
        int discarded$0 = 4819119;
        return new hg(cd.b(-127), cf.d());
    }

    final int b(int param0, int param1) {
        rh var3 = (rh) (Object) ((be) this).field_m.a((long)param1, 0);
        if (var3 != null) {
            return var3.f(0);
        }
        if (param0 > -13) {
            ((be) this).field_r = 65;
            return 0;
        }
        return 0;
    }

    be(int param0, ak param1, ak param2, uh param3, cd param4, int param5, byte[] param6, int param7, boolean param8) {
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
        ((be) this).field_m = new fl(16);
        ((be) this).field_e = 0;
        ((be) this).field_y = new qj();
        ((be) this).field_l = 0L;
        try {
          L0: {
            L1: {
              ((be) this).field_r = param0;
              ((be) this).field_p = param1;
              if (null != ((be) this).field_p) {
                ((be) this).field_u = true;
                ((be) this).field_s = new qj();
                break L1;
              } else {
                ((be) this).field_u = false;
                break L1;
              }
            }
            L2: {
              ((be) this).field_A = param5;
              ((be) this).field_t = param3;
              ((be) this).field_i = param6;
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
              ((be) this).field_j = stackIn_7_1 != 0;
              ((be) this).field_z = param2;
              ((be) this).field_o = param7;
              ((be) this).field_g = param4;
              if (null == ((be) this).field_z) {
                break L3;
              } else {
                ((be) this).field_f = (rh) (Object) ((be) this).field_g.a(((be) this).field_z, ((be) this).field_r, true);
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
            stackOut_10_1 = new StringBuilder().append("be.<init>(").append(param0).append(44);
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
          throw ch.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param7 + 44 + param8 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new nk(0);
    }
}
