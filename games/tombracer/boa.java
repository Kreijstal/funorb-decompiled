/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class boa extends dg {
    private int field_m;
    static pl field_s;
    static long field_t;
    private fla field_w;
    private int field_v;
    static int[] field_n;
    private fla field_r;
    private fla field_q;
    private fla field_x;
    private fla field_u;
    static float[] field_y;
    private int field_p;
    static int field_o;

    final void a(int param0, la param1, kh param2) {
        try {
            if (param0 <= 119) {
                boa.a(false);
            }
            super.a(122, param1, param2);
            ((boa) this).field_v = param2.b((byte) 44, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "boa.G(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(byte param0, int param1) {
        super.a((byte) 97, param1);
        ((boa) this).a(28).b(false).a(((boa) this).field_h.e(9648), ((boa) this).field_h.g((byte) 115), (byte) 46, ((boa) this).field_h.d(3));
        w var5 = (w) (Object) ((boa) this).a(30).field_G;
        if (var5 == null) {
            return;
        }
        int var4 = -67 / ((7 - param0) / 36);
        if (((boa) this).field_v == 0) {
            fla discarded$1 = var5.a(new fm(3, ((boa) this).b((byte) -118), ((boa) this).c((byte) 95), ((boa) this).e((byte) -89)), -58);
        } else {
            fla discarded$2 = var5.a(new fm(2, ((boa) this).b((byte) -122), ((boa) this).c((byte) 109), ((boa) this).e((byte) -97)), -58);
        }
        if (null != ((boa) this).field_r) {
            ((boa) this).field_r.a(-98, var5);
            ((boa) this).field_r = null;
        }
        if (!(((boa) this).field_q == null)) {
            ((boa) this).field_q.a(-111, var5);
            ((boa) this).field_q = null;
        }
        if (null != ((boa) this).field_x) {
            ((boa) this).field_x.a(27, var5);
            ((boa) this).field_x = null;
        }
    }

    final void a(int param0, uw param1) {
        w var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            super.a(-61, param1);
            var3 = (w) (Object) ((boa) this).a(21).field_G;
            if (var3 == null) {
              return;
            } else {
              L1: {
                if (((boa) this).field_r == null) {
                  break L1;
                } else {
                  ((boa) this).field_r.a(50, var3);
                  ((boa) this).field_r = null;
                  break L1;
                }
              }
              if (param0 < -39) {
                L2: {
                  if (null != ((boa) this).field_q) {
                    ((boa) this).field_q.a(-89, var3);
                    ((boa) this).field_q = null;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (((boa) this).field_x == null) {
                    break L3;
                  } else {
                    ((boa) this).field_x.a(117, var3);
                    ((boa) this).field_x = null;
                    break L3;
                  }
                }
                break L0;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("boa.IA(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    final void a(gma param0, int param1, gr param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2);
              if (param2 instanceof mra) {
                ((boa) this).field_v = 8;
                break L1;
              } else {
                if (4194304 != param0.c(-92)) {
                  break L1;
                } else {
                  if (param0.a((byte) 55) != 4194304) {
                    break L1;
                  } else {
                    ((boa) this).field_v = 10;
                    break L1;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("boa.C(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44).append(param1).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
    }

    final void b(int param0, int param1) {
        if (param0 <= 104) {
            field_o = 62;
        }
        ((boa) this).field_v = param1;
    }

    boa(int param0, la param1, kh param2) {
        super(param0, param1, param2);
        ((boa) this).field_m = 1;
        ((boa) this).field_p = 1;
    }

    private final boolean i(int param0) {
        Object var3 = null;
        int stackIn_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        L0: {
          if (param0 == 77) {
            break L0;
          } else {
            var3 = null;
            ((boa) this).a(42, (la) null, (kh) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((boa) this).field_v == 5) {
              break L2;
            } else {
              if (8 == ((boa) this).field_v) {
                break L2;
              } else {
                if (((boa) this).field_v == 10) {
                  break L2;
                } else {
                  if (((boa) this).field_v == 11) {
                    break L2;
                  } else {
                    if (((boa) this).field_v == 12) {
                      break L2;
                    } else {
                      if (((boa) this).field_v == 13) {
                        break L2;
                      } else {
                        if (((boa) this).field_v == 14) {
                          break L2;
                        } else {
                          if (((boa) this).field_v == 15) {
                            break L2;
                          } else {
                            if (((boa) this).field_v != 16) {
                              stackOut_13_0 = 0;
                              stackIn_14_0 = stackOut_13_0;
                              break L1;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          stackOut_12_0 = 1;
          stackIn_14_0 = stackOut_12_0;
          break L1;
        }
        return stackIn_14_0 != 0;
    }

    public static void a(boolean param0) {
        field_y = null;
        field_s = null;
        field_n = null;
    }

    final void d(int param0) {
        fsa var3 = null;
        int var4 = 0;
        int var7_int = 0;
        nv var7 = null;
        nv var8_ref_nv = null;
        int var8 = 0;
        pc var9 = null;
        int var10 = 0;
        w var11 = null;
        vna var12 = null;
        uja var13 = null;
        vna var14 = null;
        uja var15 = null;
        vna var16 = null;
        uja var17 = null;
        var10 = TombRacer.field_G ? 1 : 0;
        var11 = (w) (Object) ((boa) this).a(111).field_G;
        if (var11 != null) {
          L0: {
            L1: {
              L2: {
                var3 = (fsa) (Object) ((boa) this).field_h;
                var4 = var3.d(50, false) ? 1 : 0;
                if (((boa) this).field_r == null) {
                  break L2;
                } else {
                  if (((boa) this).field_r.l((byte) -116)) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (var4 == 0) {
                break L1;
              } else {
                if (!this.i(param0 ^ -78)) {
                  if (((boa) this).field_v == 9) {
                    ((boa) this).field_r = var11.a(new fm(4, ((boa) this).b((byte) -112), ((boa) this).c((byte) 92), ((boa) this).e((byte) -87)), -58);
                    break L0;
                  } else {
                    ((boa) this).field_r = var11.a(new fm(1, ((boa) this).b((byte) 39), ((boa) this).c((byte) 92), ((boa) this).e((byte) -109)), -58);
                    break L0;
                  }
                } else {
                  ((boa) this).field_r = var11.a(new fm(0, ((boa) this).b((byte) -113), ((boa) this).c((byte) 118), ((boa) this).e((byte) -114)), -58);
                  break L0;
                }
              }
            }
            if (null == ((boa) this).field_r) {
              break L0;
            } else {
              if (var4 == 0) {
                ((boa) this).field_r.a(-96, var11);
                ((boa) this).field_r = null;
                break L0;
              } else {
                break L0;
              }
            }
          }
          L3: {
            if (11 == ((boa) this).field_v) {
              var12 = var3.field_u;
              var13 = new uja(var12);
              var7_int = 0;
              var8_ref_nv = (nv) (Object) var13.a(true);
              L4: while (true) {
                if (var8_ref_nv == null) {
                  L5: {
                    L6: {
                      if (var7_int == 0) {
                        break L6;
                      } else {
                        L7: {
                          if (((boa) this).field_x == null) {
                            break L7;
                          } else {
                            if (((boa) this).field_x.l((byte) -100)) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        ((boa) this).field_x = var11.a(new fm(5, ((boa) this).b((byte) -97), ((boa) this).c((byte) 107), ((boa) this).e((byte) -107)), -58);
                        break L5;
                      }
                    }
                    if (var7_int != 0) {
                      break L5;
                    } else {
                      if (null != ((boa) this).field_x) {
                        fla discarded$1 = var11.a(new fm(6, ((boa) this).b((byte) 117), ((boa) this).c((byte) 108), ((boa) this).e((byte) -116)), -58);
                        ((boa) this).field_x.a(81, var11);
                        ((boa) this).field_x = null;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                  if (null == ((boa) this).field_x) {
                    break L3;
                  } else {
                    ((boa) this).field_x.a(((boa) this).b((byte) -114), var11.field_c, -128, var11.field_h, ((boa) this).c((byte) 105));
                    break L3;
                  }
                } else {
                  L8: {
                    if (var8_ref_nv instanceof ska) {
                      var7_int = var7_int != 0 | ((ska) (Object) var8_ref_nv).g((byte) -68) ? 1 : 0;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  var8_ref_nv = (nv) (Object) var13.a(-1);
                  continue L4;
                }
              }
            } else {
              break L3;
            }
          }
          L9: {
            if (16 != ((boa) this).field_v) {
              break L9;
            } else {
              var14 = var3.field_u;
              var15 = new uja(var14);
              var7 = (nv) (Object) var15.a(true);
              L10: while (true) {
                if (var7 == null) {
                  break L9;
                } else {
                  L11: {
                    if (!(var7 instanceof ov)) {
                      break L11;
                    } else {
                      if (((ov) (Object) var7).b(-98)) {
                        var8 = 1;
                        var9 = ((ov) (Object) var7).c(param0 ^ -105);
                        L12: while (true) {
                          L13: {
                            if (var9.field_h == null) {
                              break L13;
                            } else {
                              if (4 <= var8) {
                                break L13;
                              } else {
                                var9 = var9.field_h;
                                var8++;
                                continue L12;
                              }
                            }
                          }
                          L14: {
                            if (((boa) this).field_w == null) {
                              break L14;
                            } else {
                              if (var8 != ((boa) this).field_m) {
                                break L14;
                              } else {
                                if (!((boa) this).field_w.l((byte) 91)) {
                                  break L14;
                                } else {
                                  var7 = (nv) (Object) var15.a(-1);
                                  continue L10;
                                }
                              }
                            }
                          }
                          L15: {
                            if (((boa) this).field_m < var8) {
                              var11.a(-92, new fm(var8 + 32, ((boa) this).b((byte) 30), ((boa) this).c((byte) 105), ((boa) this).e((byte) -105)));
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          L16: {
                            ((boa) this).field_m = var8;
                            if (null != ((boa) this).field_w) {
                              ((boa) this).field_w.a(-119, var11);
                              ((boa) this).field_w = null;
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          ((boa) this).field_w = var11.a(new fm(29 - -((boa) this).field_m - 1, ((boa) this).b((byte) -80), ((boa) this).c((byte) 109), ((boa) this).e((byte) -97)), -58);
                          break L11;
                        }
                      } else {
                        if (null == ((boa) this).field_w) {
                          break L11;
                        } else {
                          ((boa) this).field_w.a(-94, var11);
                          ((boa) this).field_w = null;
                          var7 = (nv) (Object) var15.a(-1);
                          continue L10;
                        }
                      }
                    }
                  }
                  var7 = (nv) (Object) var15.a(-1);
                  continue L10;
                }
              }
            }
          }
          L17: {
            if (((boa) this).field_v != 15) {
              break L17;
            } else {
              var16 = var3.field_u;
              var17 = new uja(var16);
              var7 = (nv) (Object) var17.a(true);
              L18: while (true) {
                if (var7 == null) {
                  break L17;
                } else {
                  if (var7 instanceof ov) {
                    if (((ov) (Object) var7).b(-19)) {
                      var8 = 1;
                      var9 = ((ov) (Object) var7).c(param0 ^ -110);
                      L19: while (true) {
                        L20: {
                          if (var9.field_h == null) {
                            break L20;
                          } else {
                            if (var8 >= 4) {
                              break L20;
                            } else {
                              var9 = var9.field_h;
                              var8++;
                              continue L19;
                            }
                          }
                        }
                        L21: {
                          L22: {
                            if (null == ((boa) this).field_u) {
                              break L22;
                            } else {
                              if (var8 != ((boa) this).field_p) {
                                break L22;
                              } else {
                                if (((boa) this).field_u.l((byte) -90)) {
                                  break L21;
                                } else {
                                  break L22;
                                }
                              }
                            }
                          }
                          L23: {
                            if (var8 > ((boa) this).field_p) {
                              var11.a(-104, new fm(var8 + 42, ((boa) this).b((byte) -85), ((boa) this).c((byte) 125), ((boa) this).e((byte) -117)));
                              break L23;
                            } else {
                              break L23;
                            }
                          }
                          L24: {
                            ((boa) this).field_p = var8;
                            if (((boa) this).field_u != null) {
                              ((boa) this).field_u.a(-123, var11);
                              ((boa) this).field_u = null;
                              break L24;
                            } else {
                              break L24;
                            }
                          }
                          ((boa) this).field_u = var11.a(new fm(39 - -((boa) this).field_p + -1, ((boa) this).b((byte) 87), ((boa) this).c((byte) 127), ((boa) this).e((byte) -111)), -58);
                          break L21;
                        }
                        var7 = (nv) (Object) var17.a(-1);
                        continue L18;
                      }
                    } else {
                      if (((boa) this).field_u != null) {
                        ((boa) this).field_u.a(param0 + -100, var11);
                        ((boa) this).field_u = null;
                        var7 = (nv) (Object) var17.a(-1);
                        continue L18;
                      } else {
                        var7 = (nv) (Object) var17.a(-1);
                        continue L18;
                      }
                    }
                  } else {
                    var7 = (nv) (Object) var17.a(-1);
                    continue L18;
                  }
                }
              }
            }
          }
          L25: {
            L26: {
              if (!var3.j(param0)) {
                break L26;
              } else {
                if (null != ((boa) this).field_q) {
                  break L26;
                } else {
                  ((boa) this).field_q = var11.a(new fm(7, ((boa) this).b((byte) 122), ((boa) this).c((byte) 92), ((boa) this).e((byte) -99)), param0 ^ 57);
                  break L25;
                }
              }
            }
            if (var3.j(-1)) {
              break L25;
            } else {
              if (null != ((boa) this).field_q) {
                ((boa) this).field_q.a(66, var11);
                ((boa) this).field_q = null;
                break L25;
              } else {
                break L25;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(byte param0, kh param1) {
        try {
            super.a((byte) -100, param1);
            param1.a((byte) 42, ((boa) this).field_v, 4);
            int var3_int = 108 / ((param0 - -8) / 40);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "boa.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void h(int param0) {
        super.h(106);
        if (param0 <= 0) {
            field_n = null;
        }
    }

    boa(int param0) {
        super(param0);
        ((boa) this).field_m = 1;
        ((boa) this).field_p = 1;
    }

    final void a(gr param0, gma param1, byte param2) {
        try {
            super.a(param0, param1, param2);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "boa.E(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        Object var8 = null;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = 38 % ((param4 - -38) / 47);
              var7 = 0;
              var8 = null;
              var9 = ((boa) this).field_v;
              if (var9 == 0) {
                var8 = (Object) (Object) df.field_J[4];
                break L1;
              } else {
                if (1 == var9) {
                  var8 = (Object) (Object) df.field_J[5];
                  break L1;
                } else {
                  if (var9 == 2) {
                    var8 = (Object) (Object) df.field_J[7];
                    break L1;
                  } else {
                    if (var9 == 3) {
                      var8 = (Object) (Object) df.field_J[9];
                      var7 = 4096;
                      break L1;
                    } else {
                      if (var9 == 4) {
                        var8 = (Object) (Object) df.field_J[8];
                        break L1;
                      } else {
                        if (var9 != 5) {
                          if (var9 == 8) {
                            var8 = (Object) (Object) df.field_J[6];
                            break L1;
                          } else {
                            if (9 == var9) {
                              var7 = 2048;
                              var8 = (Object) (Object) df.field_J[27];
                              break L1;
                            } else {
                              if (var9 != 10) {
                                if (var9 != 12) {
                                  if (var9 != 11) {
                                    if (var9 != 13) {
                                      if (var9 != 14) {
                                        if (var9 == 15) {
                                          var8 = (Object) (Object) df.field_J[15];
                                          break L1;
                                        } else {
                                          if (16 == var9) {
                                            var8 = (Object) (Object) df.field_J[16];
                                            break L1;
                                          } else {
                                            break L1;
                                          }
                                        }
                                      } else {
                                        var8 = (Object) (Object) df.field_J[14];
                                        break L1;
                                      }
                                    } else {
                                      var8 = (Object) (Object) df.field_J[13];
                                      break L1;
                                    }
                                  } else {
                                    var8 = (Object) (Object) df.field_J[11];
                                    break L1;
                                  }
                                } else {
                                  var8 = (Object) (Object) df.field_J[12];
                                  break L1;
                                }
                              } else {
                                var8 = (Object) (Object) df.field_J[70];
                                break L1;
                              }
                            }
                          }
                        } else {
                          L2: {
                            var9 = 77;
                            if (((boa) this).field_g < 33) {
                              var9 = 77;
                              break L2;
                            } else {
                              break L2;
                            }
                          }
                          L3: {
                            if (((boa) this).field_g < 66) {
                              var9 = 78;
                              break L3;
                            } else {
                              var9 = 79;
                              break L3;
                            }
                          }
                          var8 = (Object) (Object) df.field_J[var9];
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
            }
            L4: {
              if (var8 == null) {
                break L4;
              } else {
                var9 = dfa.a(4096 + (var7 - ((boa) this).field_h.g(-25787)) >> 2, 2048, -28);
                gqa.a(var9, -83584144, param1, param2, (ka) var8, param3);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_47_0 = (RuntimeException) var6;
            stackOut_47_1 = new StringBuilder().append("boa.D(");
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param0 == null) {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L5;
            } else {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "{...}";
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_50_0, stackIn_50_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = 0L;
        field_y = new float[4];
        field_s = new pl(3);
        field_o = 0;
    }
}
