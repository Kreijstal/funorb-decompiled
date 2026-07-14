/*
 * Decompiled by CFR-JS 0.4.0.
 */
class fd implements cj, w {
    int field_m;
    static String field_q;
    pk field_j;
    int field_l;
    static boolean field_o;
    static String field_p;
    static boolean field_k;
    int field_e;
    static String[] field_i;
    int field_g;
    int field_d;
    int field_b;
    private int field_n;
    int field_h;
    int field_a;
    int field_r;
    private boolean field_c;
    int field_f;

    final static boolean d(int param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1_ref = (Object) (Object) th.field_g;
                    // monitorenter th.field_g
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (d.field_M != r.field_V) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        // monitorexit var1_ref
                        stackOut_2_0 = 0;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        lf.field_c = ll.field_b[r.field_V];
                        ua.field_g = ah.field_E[r.field_V];
                        r.field_V = param0 + r.field_V & 127;
                        // monitorexit var1_ref
                        stackOut_4_0 = 1;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0 != 0;
                }
                case 6: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1_ref
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 7: {
                    throw (RuntimeException) (Object) var2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final int a(int param0, int param1, int param2, gl param3, int param4, int param5) {
        ld discarded$2 = ((fd) this).a(param3, param1 ^ 18161);
        if (param1 != -3477) {
          int discarded$3 = ((fd) this).a(-103);
          return param3.field_q.a(param0 + -((fd) this).a(param3, -99, param5), -1, param2 + -((fd) this).a(param3, param4, (byte) -72));
        } else {
          return param3.field_q.a(param0 + -((fd) this).a(param3, -99, param5), -1, param2 + -((fd) this).a(param3, param4, (byte) -72));
        }
    }

    private final void c(int param0, gl param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        var7 = Terraphoenix.field_V;
        if (param0 <= 105) {
          L0: {
            var8 = null;
            int discarded$1 = ((fd) this).a((gl) null, 98, 4);
            if (null == param1.field_q) {
              param1.field_q = (ld) (Object) new rd();
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            var3 = ((fd) this).a(28889, param1);
            var4 = this.b(127, param1);
            var6 = ((fd) this).field_a;
            if (-1 != (var6 ^ -1)) {
              if (2 == var6) {
                L2: {
                  var5 = var4 + -((fd) this).field_j.field_p;
                  var6 = ((fd) this).field_h;
                  if (var6 != 0) {
                    if (3 == var6) {
                      break L2;
                    } else {
                      L3: {
                        if (1 != var6) {
                          if (2 == var6) {
                            if (param1.field_q instanceof rd) {
                              ((rd) (Object) param1.field_q).a(var5, 121, ((fd) this).field_j, var3, ((fd) this).b(param1, 32032));
                              break L3;
                            } else {
                              return;
                            }
                          } else {
                            return;
                          }
                        } else {
                          if (!(param1.field_q instanceof rd)) {
                            break L3;
                          } else {
                            ((rd) (Object) param1.field_q).a(var3 >> -751213823, ((fd) this).field_j, ((fd) this).b(param1, 32032), var5, 960877057);
                            return;
                          }
                        }
                      }
                      return;
                    }
                  } else {
                    break L2;
                  }
                }
                if (param1.field_q instanceof rd) {
                  ((rd) (Object) param1.field_q).a(0, ((fd) this).field_j, var5, ((fd) this).b(param1, 32032), (byte) -112);
                  return;
                } else {
                  return;
                }
              } else {
                if ((var6 ^ -1) != -4) {
                  if ((var6 ^ -1) == -2) {
                    var5 = ((fd) this).field_j.field_s - -(-((fd) this).field_j.field_p + -((fd) this).field_j.field_s + var4 >> 1905079201);
                    break L1;
                  } else {
                    var5 = ((fd) this).field_j.field_s - -(-((fd) this).field_j.field_p + -((fd) this).field_j.field_s + var4 >> 1905079201);
                    var6 = ((fd) this).field_h;
                    if (var6 != 0) {
                      if (3 == var6) {
                        if (!(param1.field_q instanceof rd)) {
                          return;
                        } else {
                          ((rd) (Object) param1.field_q).a(0, ((fd) this).field_j, var5, ((fd) this).b(param1, 32032), (byte) -112);
                          return;
                        }
                      } else {
                        L4: {
                          if (1 != var6) {
                            if (2 == var6) {
                              if (param1.field_q instanceof rd) {
                                ((rd) (Object) param1.field_q).a(var5, 121, ((fd) this).field_j, var3, ((fd) this).b(param1, 32032));
                                break L4;
                              } else {
                                return;
                              }
                            } else {
                              return;
                            }
                          } else {
                            if (!(param1.field_q instanceof rd)) {
                              break L4;
                            } else {
                              ((rd) (Object) param1.field_q).a(var3 >> -751213823, ((fd) this).field_j, ((fd) this).b(param1, 32032), var5, 960877057);
                              return;
                            }
                          }
                        }
                        return;
                      }
                    } else {
                      if (param1.field_q instanceof rd) {
                        ((rd) (Object) param1.field_q).a(0, ((fd) this).field_j, var5, ((fd) this).b(param1, 32032), (byte) -112);
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  var5 = ((fd) this).field_j.field_s - -(-((fd) this).field_j.field_p + -((fd) this).field_j.field_s + var4 >> 1905079201);
                  var6 = ((fd) this).field_h;
                  if (var6 != 0) {
                    if (3 == var6) {
                      if (!(param1.field_q instanceof rd)) {
                        return;
                      } else {
                        ((rd) (Object) param1.field_q).a(0, ((fd) this).field_j, var5, ((fd) this).b(param1, 32032), (byte) -112);
                        return;
                      }
                    } else {
                      if (1 != var6) {
                        if (2 == var6) {
                          if (!(param1.field_q instanceof rd)) {
                            return;
                          } else {
                            ((rd) (Object) param1.field_q).a(var5, 121, ((fd) this).field_j, var3, ((fd) this).b(param1, 32032));
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        if (param1.field_q instanceof rd) {
                          ((rd) (Object) param1.field_q).a(var3 >> -751213823, ((fd) this).field_j, ((fd) this).b(param1, 32032), var5, 960877057);
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    L5: {
                      if (param1.field_q instanceof rd) {
                        ((rd) (Object) param1.field_q).a(0, ((fd) this).field_j, var5, ((fd) this).b(param1, 32032), (byte) -112);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    return;
                  }
                }
              }
            } else {
              var5 = ((fd) this).field_j.field_s;
              break L1;
            }
          }
          var6 = ((fd) this).field_h;
          if (var6 != 0) {
            if (3 == var6) {
              if (param1.field_q instanceof rd) {
                ((rd) (Object) param1.field_q).a(0, ((fd) this).field_j, var5, ((fd) this).b(param1, 32032), (byte) -112);
                return;
              } else {
                return;
              }
            } else {
              L6: {
                if (1 != var6) {
                  if (2 != var6) {
                    break L6;
                  } else {
                    if (param1.field_q instanceof rd) {
                      ((rd) (Object) param1.field_q).a(var5, 121, ((fd) this).field_j, var3, ((fd) this).b(param1, 32032));
                      break L6;
                    } else {
                      return;
                    }
                  }
                } else {
                  if (!(param1.field_q instanceof rd)) {
                    break L6;
                  } else {
                    ((rd) (Object) param1.field_q).a(var3 >> -751213823, ((fd) this).field_j, ((fd) this).b(param1, 32032), var5, 960877057);
                    return;
                  }
                }
              }
              return;
            }
          } else {
            if (param1.field_q instanceof rd) {
              ((rd) (Object) param1.field_q).a(0, ((fd) this).field_j, var5, ((fd) this).b(param1, 32032), (byte) -112);
              return;
            } else {
              return;
            }
          }
        } else {
          L7: {
            if (null == param1.field_q) {
              param1.field_q = (ld) (Object) new rd();
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            var3 = ((fd) this).a(28889, param1);
            var4 = this.b(127, param1);
            var6 = ((fd) this).field_a;
            if (-1 != (var6 ^ -1)) {
              if (2 == var6) {
                L9: {
                  L10: {
                    var5 = var4 + -((fd) this).field_j.field_p;
                    var6 = ((fd) this).field_h;
                    if (var6 != 0) {
                      if (3 == var6) {
                        break L10;
                      } else {
                        if (1 != var6) {
                          if (2 != var6) {
                            break L9;
                          } else {
                            if (param1.field_q instanceof rd) {
                              ((rd) (Object) param1.field_q).a(var5, 121, ((fd) this).field_j, var3, ((fd) this).b(param1, 32032));
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                        } else {
                          if (!(param1.field_q instanceof rd)) {
                            break L9;
                          } else {
                            ((rd) (Object) param1.field_q).a(var3 >> -751213823, ((fd) this).field_j, ((fd) this).b(param1, 32032), var5, 960877057);
                            break L9;
                          }
                        }
                      }
                    } else {
                      break L10;
                    }
                  }
                  if (param1.field_q instanceof rd) {
                    ((rd) (Object) param1.field_q).a(0, ((fd) this).field_j, var5, ((fd) this).b(param1, 32032), (byte) -112);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                return;
              } else {
                L11: {
                  if ((var6 ^ -1) == -4) {
                    break L11;
                  } else {
                    if ((var6 ^ -1) != -2) {
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                }
                var5 = ((fd) this).field_j.field_s - -(-((fd) this).field_j.field_p + -((fd) this).field_j.field_s + var4 >> 1905079201);
                break L8;
              }
            } else {
              var5 = ((fd) this).field_j.field_s;
              break L8;
            }
          }
          var6 = ((fd) this).field_h;
          if (var6 != 0) {
            if (3 == var6) {
              if (!(param1.field_q instanceof rd)) {
                return;
              } else {
                ((rd) (Object) param1.field_q).a(0, ((fd) this).field_j, var5, ((fd) this).b(param1, 32032), (byte) -112);
                return;
              }
            } else {
              if (1 != var6) {
                if (2 == var6) {
                  if (!(param1.field_q instanceof rd)) {
                    return;
                  } else {
                    ((rd) (Object) param1.field_q).a(var5, 121, ((fd) this).field_j, var3, ((fd) this).b(param1, 32032));
                    return;
                  }
                } else {
                  return;
                }
              } else {
                if (param1.field_q instanceof rd) {
                  ((rd) (Object) param1.field_q).a(var3 >> -751213823, ((fd) this).field_j, ((fd) this).b(param1, 32032), var5, 960877057);
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            L12: {
              if (param1.field_q instanceof rd) {
                ((rd) (Object) param1.field_q).a(0, ((fd) this).field_j, var5, ((fd) this).b(param1, 32032), (byte) -112);
                break L12;
              } else {
                break L12;
              }
            }
            return;
          }
        }
    }

    public final void b(int param0, int param1, int param2, gl param3, int param4, int param5) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        ld var19 = null;
        ld var20 = null;
        em var21 = null;
        ld var22 = null;
        ld var23 = null;
        em var24 = null;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_36_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        var16 = Terraphoenix.field_V;
        if (param4 != param5) {
          if (param0 != 0) {
            L0: {
              ((fd) this).field_b = 4;
              if (param3.d(param0 ^ -111)) {
                L1: {
                  var20 = ((fd) this).a(param3, -19302);
                  var19 = var20;
                  if (param5 < param4) {
                    var9 = param4;
                    var8 = param5;
                    break L1;
                  } else {
                    var8 = param4;
                    var9 = param5;
                    break L1;
                  }
                }
                var10 = var19.b(var8, 0);
                var11 = var19.b(var9, 0);
                di.a(param2 + param3.field_w - -param3.field_p, param3.field_u + param1, 16105, param3.field_u + param1 + param3.field_n, param2 + param3.field_w);
                var12 = var10;
                L2: while (true) {
                  if (var11 < var12) {
                    ij.a(false);
                    break L0;
                  } else {
                    L3: {
                      var21 = var20.field_f[var12];
                      if (var10 != var12) {
                        stackOut_30_0 = var21.field_d[0];
                        stackIn_31_0 = stackOut_30_0;
                        break L3;
                      } else {
                        stackOut_29_0 = var19.a(var8, 0);
                        stackIn_31_0 = stackOut_29_0;
                        break L3;
                      }
                    }
                    L4: {
                      var14 = stackIn_31_0;
                      if (var11 != var12) {
                        if (var21 == null) {
                          stackOut_35_0 = 0;
                          stackIn_36_0 = stackOut_35_0;
                          break L4;
                        } else {
                          stackOut_34_0 = var21.field_d[-1 + var21.field_d.length];
                          stackIn_36_0 = stackOut_34_0;
                          break L4;
                        }
                      } else {
                        stackOut_32_0 = var19.a(var9, 0);
                        stackIn_36_0 = stackOut_32_0;
                        break L4;
                      }
                    }
                    var15 = stackIn_36_0;
                    vc.field_c.a(((fd) this).field_r, this.a(var14, param3, param2, (byte) 126), var21.field_e + param3.field_v + (((fd) this).field_b + param1) - -param3.field_u, ((fd) this).field_r >>> 1025066360, param0 ^ 2, var21.field_a, var15 - var14);
                    var12++;
                    continue L2;
                  }
                }
              } else {
                break L0;
              }
            }
            return;
          } else {
            L5: {
              if (param3.d(param0 ^ -111)) {
                L6: {
                  var23 = ((fd) this).a(param3, -19302);
                  var22 = var23;
                  if (param5 < param4) {
                    var9 = param4;
                    var8 = param5;
                    break L6;
                  } else {
                    var8 = param4;
                    var9 = param5;
                    break L6;
                  }
                }
                var10 = var22.b(var8, 0);
                var11 = var22.b(var9, 0);
                di.a(param2 + param3.field_w - -param3.field_p, param3.field_u + param1, 16105, param3.field_u + param1 + param3.field_n, param2 + param3.field_w);
                var12 = var10;
                L7: while (true) {
                  if (var11 < var12) {
                    ij.a(false);
                    break L5;
                  } else {
                    L8: {
                      var24 = var23.field_f[var12];
                      if (var10 != var12) {
                        stackOut_12_0 = var24.field_d[0];
                        stackIn_13_0 = stackOut_12_0;
                        break L8;
                      } else {
                        stackOut_11_0 = var22.a(var8, 0);
                        stackIn_13_0 = stackOut_11_0;
                        break L8;
                      }
                    }
                    L9: {
                      var14 = stackIn_13_0;
                      if (var11 != var12) {
                        if (var24 == null) {
                          stackOut_17_0 = 0;
                          stackIn_18_0 = stackOut_17_0;
                          break L9;
                        } else {
                          stackOut_16_0 = var24.field_d[-1 + var24.field_d.length];
                          stackIn_18_0 = stackOut_16_0;
                          break L9;
                        }
                      } else {
                        stackOut_14_0 = var22.a(var9, 0);
                        stackIn_18_0 = stackOut_14_0;
                        break L9;
                      }
                    }
                    var15 = stackIn_18_0;
                    vc.field_c.a(((fd) this).field_r, this.a(var14, param3, param2, (byte) 126), var24.field_e + param3.field_v + (((fd) this).field_b + param1) - -param3.field_u, ((fd) this).field_r >>> 1025066360, param0 ^ 2, var24.field_a, var15 - var14);
                    var12++;
                    continue L7;
                  }
                }
              } else {
                break L5;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    public final int a(int param0) {
        Object var3 = null;
        if (param0 != 8233) {
          var3 = null;
          ((fd) this).a(22, 56, (gl) null, -76, -64);
          return ((fd) this).field_j.field_s + ((fd) this).field_j.field_p;
        } else {
          return ((fd) this).field_j.field_s + ((fd) this).field_j.field_p;
        }
    }

    public final int a(gl param0, int param1, byte param2) {
        if (param2 != -72) {
          ((fd) this).field_a = -64;
          return this.a(param0, (byte) -33, 0, param1);
        } else {
          return this.a(param0, (byte) -33, 0, param1);
        }
    }

    public final void a(int param0, int param1, gl param2, int param3, int param4) {
        int var7 = 0;
        em var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ld var13 = null;
        ld var14 = null;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        L0: {
          if (param2.d(-123)) {
            L1: {
              var13 = ((fd) this).a(param2, -19302);
              var14 = var13;
              var7 = var14.b(param0, param4 ^ -32135);
              var8 = var13.field_f[var7];
              var9 = var14.a(param0, 0);
              var10 = this.a(var9, param2, param3, (byte) 126);
              var11 = ((fd) this).a(param2, param1, (byte) -72) + Math.max(0, var8.field_e);
              stackOut_2_0 = ((fd) this).a(param2, param1, (byte) -72);
              stackOut_2_1 = this.b(127, param2);
              stackOut_2_2 = var8.field_a;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_4_2 = stackOut_2_2;
              stackIn_3_0 = stackOut_2_0;
              stackIn_3_1 = stackOut_2_1;
              stackIn_3_2 = stackOut_2_2;
              if (1 + var7 >= var14.field_f.length) {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = stackIn_4_1;
                stackOut_4_2 = stackIn_4_2;
                stackOut_4_3 = var8.field_a;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                stackIn_5_2 = stackOut_4_2;
                stackIn_5_3 = stackOut_4_3;
                break L1;
              } else {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = stackIn_3_2;
                stackOut_3_3 = var13.field_f[1 + var7].field_e;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                stackIn_5_2 = stackOut_3_2;
                stackIn_5_3 = stackOut_3_3;
                break L1;
              }
            }
            var12 = stackIn_5_0 - -Math.min(stackIn_5_1, Math.min(stackIn_5_2, stackIn_5_3));
            di.a(param2.field_w + (param3 + param2.field_p), param1 + param2.field_u, param4 ^ -17264, param2.field_n + (param2.field_u + param1), param3 + param2.field_w);
            vc.field_c.a(((fd) this).field_g, var10, var10, var12, var11, true);
            ij.a(false);
            break L0;
          } else {
            break L0;
          }
        }
        if (param4 != -32135) {
          ((fd) this).field_a = 106;
          return;
        } else {
          return;
        }
    }

    String b(gl param0, int param1) {
        if (param1 != 32032) {
            int discarded$0 = ((fd) this).a(61);
            return param0.field_o;
        }
        return param0.field_o;
    }

    final static void c(int param0) {
        bj.field_f.a((gl) (Object) new cg(), -110);
        if (param0 >= -16) {
            field_k = true;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, gl param5, byte param6, int param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = Terraphoenix.field_V;
        di.a(param5.field_p + (param3 - -param5.field_w), param4 - -param5.field_u, param6 + 16035, param5.field_u + (param4 - -param5.field_n), param5.field_w + param3);
        if (param6 == 70) {
          var9 = ((fd) this).a(28889, param5);
          var10 = this.b(127, param5);
          if (!((fd) this).field_c) {
            var12 = ((fd) this).field_a;
            if (var12 == 0) {
              L0: {
                var11 = ((fd) this).field_j.field_s;
                var12 = ((fd) this).field_h;
                if (-1 == (var12 ^ -1)) {
                  break L0;
                } else {
                  if (var12 == 3) {
                    break L0;
                  } else {
                    if (var12 != 1) {
                      if (var12 == 2) {
                        ((fd) this).field_j.a(((fd) this).b(param5, 32032), var9 + this.a(param2, param5, param3, (byte) 125), this.a(param5, (byte) -33, param1, param4) + var11, param0, param7);
                        ij.a(false);
                        return;
                      } else {
                        ij.a(false);
                        return;
                      }
                    } else {
                      ((fd) this).field_j.c(((fd) this).b(param5, param6 + 31962), this.a(param2, param5, param3, (byte) 124) - -(var9 >> 92243617), var11 + this.a(param5, (byte) -33, param1, param4), param0, param7);
                      ij.a(false);
                      return;
                    }
                  }
                }
              }
              ((fd) this).field_j.b(((fd) this).b(param5, 32032), this.a(param2, param5, param3, (byte) 126), this.a(param5, (byte) -33, param1, param4) - -var11, param0, param7);
              ij.a(false);
              return;
            } else {
              if ((var12 ^ -1) != -3) {
                if (3 != var12) {
                  if ((var12 ^ -1) == -2) {
                    var11 = (-((fd) this).field_j.field_p + var10 - ((fd) this).field_j.field_s >> -1974813439) + ((fd) this).field_j.field_s;
                    var12 = ((fd) this).field_h;
                    if (-1 != (var12 ^ -1)) {
                      if (var12 != 3) {
                        if (var12 != 1) {
                          if (var12 == 2) {
                            ((fd) this).field_j.a(((fd) this).b(param5, 32032), var9 + this.a(param2, param5, param3, (byte) 125), this.a(param5, (byte) -33, param1, param4) + var11, param0, param7);
                            ij.a(false);
                            return;
                          } else {
                            ij.a(false);
                            return;
                          }
                        } else {
                          ((fd) this).field_j.c(((fd) this).b(param5, param6 + 31962), this.a(param2, param5, param3, (byte) 124) - -(var9 >> 92243617), var11 + this.a(param5, (byte) -33, param1, param4), param0, param7);
                          ij.a(false);
                          return;
                        }
                      } else {
                        ((fd) this).field_j.b(((fd) this).b(param5, 32032), this.a(param2, param5, param3, (byte) 126), this.a(param5, (byte) -33, param1, param4) - -var11, param0, param7);
                        ij.a(false);
                        return;
                      }
                    } else {
                      ((fd) this).field_j.b(((fd) this).b(param5, 32032), this.a(param2, param5, param3, (byte) 126), this.a(param5, (byte) -33, param1, param4) - -var11, param0, param7);
                      ij.a(false);
                      return;
                    }
                  } else {
                    var11 = (-((fd) this).field_j.field_p + var10 - ((fd) this).field_j.field_s >> -1974813439) + ((fd) this).field_j.field_s;
                    var12 = ((fd) this).field_h;
                    if (-1 != (var12 ^ -1)) {
                      if (var12 != 3) {
                        if (var12 != 1) {
                          if (var12 != 2) {
                            ij.a(false);
                            return;
                          } else {
                            ((fd) this).field_j.a(((fd) this).b(param5, 32032), var9 + this.a(param2, param5, param3, (byte) 125), this.a(param5, (byte) -33, param1, param4) + var11, param0, param7);
                            ij.a(false);
                            return;
                          }
                        } else {
                          ((fd) this).field_j.c(((fd) this).b(param5, param6 + 31962), this.a(param2, param5, param3, (byte) 124) - -(var9 >> 92243617), var11 + this.a(param5, (byte) -33, param1, param4), param0, param7);
                          ij.a(false);
                          return;
                        }
                      } else {
                        ((fd) this).field_j.b(((fd) this).b(param5, 32032), this.a(param2, param5, param3, (byte) 126), this.a(param5, (byte) -33, param1, param4) - -var11, param0, param7);
                        ij.a(false);
                        return;
                      }
                    } else {
                      ((fd) this).field_j.b(((fd) this).b(param5, 32032), this.a(param2, param5, param3, (byte) 126), this.a(param5, (byte) -33, param1, param4) - -var11, param0, param7);
                      ij.a(false);
                      return;
                    }
                  }
                } else {
                  var11 = (-((fd) this).field_j.field_p + var10 - ((fd) this).field_j.field_s >> -1974813439) + ((fd) this).field_j.field_s;
                  var12 = ((fd) this).field_h;
                  if (-1 != (var12 ^ -1)) {
                    if (var12 != 3) {
                      if (var12 != 1) {
                        if (var12 != 2) {
                          ij.a(false);
                          return;
                        } else {
                          ((fd) this).field_j.a(((fd) this).b(param5, 32032), var9 + this.a(param2, param5, param3, (byte) 125), this.a(param5, (byte) -33, param1, param4) + var11, param0, param7);
                          ij.a(false);
                          return;
                        }
                      } else {
                        ((fd) this).field_j.c(((fd) this).b(param5, param6 + 31962), this.a(param2, param5, param3, (byte) 124) - -(var9 >> 92243617), var11 + this.a(param5, (byte) -33, param1, param4), param0, param7);
                        ij.a(false);
                        return;
                      }
                    } else {
                      ((fd) this).field_j.b(((fd) this).b(param5, 32032), this.a(param2, param5, param3, (byte) 126), this.a(param5, (byte) -33, param1, param4) - -var11, param0, param7);
                      ij.a(false);
                      return;
                    }
                  } else {
                    ((fd) this).field_j.b(((fd) this).b(param5, 32032), this.a(param2, param5, param3, (byte) 126), this.a(param5, (byte) -33, param1, param4) - -var11, param0, param7);
                    ij.a(false);
                    return;
                  }
                }
              } else {
                var11 = -((fd) this).field_j.field_p + var10;
                var12 = ((fd) this).field_h;
                if (-1 != (var12 ^ -1)) {
                  if (var12 != 3) {
                    if (var12 != 1) {
                      if (var12 == 2) {
                        ((fd) this).field_j.a(((fd) this).b(param5, 32032), var9 + this.a(param2, param5, param3, (byte) 125), this.a(param5, (byte) -33, param1, param4) + var11, param0, param7);
                        ij.a(false);
                        return;
                      } else {
                        ij.a(false);
                        return;
                      }
                    } else {
                      ((fd) this).field_j.c(((fd) this).b(param5, param6 + 31962), this.a(param2, param5, param3, (byte) 124) - -(var9 >> 92243617), var11 + this.a(param5, (byte) -33, param1, param4), param0, param7);
                      ij.a(false);
                      return;
                    }
                  } else {
                    ((fd) this).field_j.b(((fd) this).b(param5, 32032), this.a(param2, param5, param3, (byte) 126), this.a(param5, (byte) -33, param1, param4) - -var11, param0, param7);
                    ij.a(false);
                    return;
                  }
                } else {
                  ((fd) this).field_j.b(((fd) this).b(param5, 32032), this.a(param2, param5, param3, (byte) 126), this.a(param5, (byte) -33, param1, param4) - -var11, param0, param7);
                  ij.a(false);
                  return;
                }
              }
            }
          } else {
            int discarded$1 = ((fd) this).field_j.a(((fd) this).b(param5, 32032), this.a(param2, param5, param3, (byte) 127), this.a(param5, (byte) -33, param1, param4), var9, var10, param0, param7, ((fd) this).field_h, ((fd) this).field_a, ((fd) this).field_m);
            ij.a(false);
            return;
          }
        } else {
          return;
        }
    }

    private final int b(int param0, gl param1) {
        Object var4 = null;
        if (param0 != 127) {
          var4 = null;
          ((fd) this).a((fd) null, -10);
          return param1.field_n + -((fd) this).field_b - ((fd) this).field_f;
        } else {
          return param1.field_n + -((fd) this).field_b - ((fd) this).field_f;
        }
    }

    fd(pk param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    public final ld a(gl param0, int param1) {
        if (null != param0.field_q) {
          if (param1 == -19302) {
            if (((fd) this).field_c) {
              ((rd) (Object) param0.field_q).a(((fd) this).field_h, ((fd) this).field_a, this.b(param1 ^ -19227, param0), ((fd) this).field_j, -119, ((fd) this).b(param0, 32032), ((fd) this).a(28889, param0), ((fd) this).field_m);
              return param0.field_q;
            } else {
              this.c(114, param0);
              return param0.field_q;
            }
          } else {
            return null;
          }
        } else {
          param0.field_q = (ld) (Object) new rd();
          if (param1 == -19302) {
            if (((fd) this).field_c) {
              ((rd) (Object) param0.field_q).a(((fd) this).field_h, ((fd) this).field_a, this.b(param1 ^ -19227, param0), ((fd) this).field_j, -119, ((fd) this).b(param0, 32032), ((fd) this).a(28889, param0), ((fd) this).field_m);
              return param0.field_q;
            } else {
              this.c(114, param0);
              return param0.field_q;
            }
          } else {
            return null;
          }
        }
    }

    public static void b(int param0) {
        field_q = null;
        field_i = null;
        if (param0 < 42) {
            field_o = false;
            field_p = null;
            return;
        }
        field_p = null;
    }

    public final int a(int param0, gl param1) {
        Object var4 = null;
        if (param0 != 28889) {
          var4 = null;
          this.c(-45, (gl) null);
          return param1.field_p - ((fd) this).field_d + -((fd) this).field_l;
        } else {
          return param1.field_p - ((fd) this).field_d + -((fd) this).field_l;
        }
    }

    public final int b(gl param0, byte param1) {
        ld discarded$7 = ((fd) this).a(param0, -19302);
        if (param1 < 102) {
          field_k = false;
          return param0.field_q.c(5859) + ((fd) this).field_b - -((fd) this).field_f;
        } else {
          return param0.field_q.c(5859) + ((fd) this).field_b - -((fd) this).field_f;
        }
    }

    final void a(fd param0, int param1) {
        param0.field_f = ((fd) this).field_f;
        param0.field_a = ((fd) this).field_a;
        param0.field_b = ((fd) this).field_b;
        param0.field_r = ((fd) this).field_r;
        if (param1 > -27) {
          fd.c(-31);
          param0.field_n = ((fd) this).field_n;
          param0.field_m = ((fd) this).field_m;
          param0.field_d = ((fd) this).field_d;
          param0.field_e = ((fd) this).field_e;
          param0.field_h = ((fd) this).field_h;
          param0.field_g = ((fd) this).field_g;
          param0.field_l = ((fd) this).field_l;
          param0.field_j = ((fd) this).field_j;
          param0.field_c = ((fd) this).field_c;
          return;
        } else {
          param0.field_n = ((fd) this).field_n;
          param0.field_m = ((fd) this).field_m;
          param0.field_d = ((fd) this).field_d;
          param0.field_e = ((fd) this).field_e;
          param0.field_h = ((fd) this).field_h;
          param0.field_g = ((fd) this).field_g;
          param0.field_l = ((fd) this).field_l;
          param0.field_j = ((fd) this).field_j;
          param0.field_c = ((fd) this).field_c;
          return;
        }
    }

    public final int a(gl param0, int param1, int param2) {
        int var4 = 9 / ((param1 - 30) / 62);
        return this.a(0, param0, param2, (byte) 124);
    }

    private final int a(gl param0, byte param1, int param2, int param3) {
        if (param1 != -33) {
          return 78;
        } else {
          return param2 + param0.field_v + param0.field_u + (param3 + ((fd) this).field_b);
        }
    }

    private final void a(int param0, int param1, int param2, gl param3) {
        this.a(((fd) this).field_e, 0, 0, param2, param0, param3, (byte) 70, ((fd) this).field_n);
        if (param1 != -6087) {
            ((fd) this).field_f = 105;
        }
    }

    private final int a(int param0, gl param1, int param2, byte param3) {
        if (param3 <= 123) {
          ((fd) this).field_a = -33;
          return param1.field_w + (param2 + (((fd) this).field_d - -param1.field_y)) + param0;
        } else {
          return param1.field_w + (param2 + (((fd) this).field_d - -param1.field_y)) + param0;
        }
    }

    public final int a(gl param0, byte param1) {
        ld discarded$7 = ((fd) this).a(param0, -19302);
        if (param1 < 61) {
          return -75;
        } else {
          return param0.field_q.b(0) - (-((fd) this).field_d - ((fd) this).field_l);
        }
    }

    public void a(int param0, gl param1, int param2, int param3, boolean param4) {
        if (param3 != -24381) {
            return;
        }
        if (null == ((fd) this).field_j) {
            return;
        }
        this.a(param0, -6087, param2, param1);
    }

    protected fd() {
    }

    fd(pk param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        ((fd) this).field_b = param3;
        ((fd) this).field_r = param11;
        ((fd) this).field_n = param6;
        ((fd) this).field_c = param12 ? true : false;
        ((fd) this).field_h = param7;
        ((fd) this).field_g = param10;
        ((fd) this).field_l = param2;
        ((fd) this).field_a = param8;
        ((fd) this).field_e = param5;
        ((fd) this).field_j = param0;
        ((fd) this).field_f = param4;
        ((fd) this).field_d = param1;
        ((fd) this).field_m = param9;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Names cannot contain consecutive spaces";
        field_q = "Connection lost. <%0>";
        field_o = true;
        field_i = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_k = false;
    }
}
