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
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        Object stackIn_61_0 = null;
        byte stackIn_80_0 = 0;
        byte stackIn_80_1 = 0;
        int stackIn_95_0 = 0;
        int stackIn_95_1 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        byte stackOut_79_0 = 0;
        byte stackOut_79_1 = 0;
        int stackOut_94_0 = 0;
        int stackOut_94_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        Object stackOut_60_0 = null;
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
                  L5: {
                    if (((rb) this).field_d == null) {
                      break L5;
                    } else {
                      if (-1 != ((rb) this).field_o[param2]) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  if (!((rb) this).field_A.c(92)) {
                    var4 = (Object) (Object) ((rb) this).field_A.a(param2, true, (byte) 2, (byte) -60, ((rb) this).field_q);
                    if (var10 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  } else {
                    return null;
                  }
                }
                var4 = (Object) (Object) ((rb) this).field_n.a(((rb) this).field_d, -18017, param2);
                break L3;
              } else {
                L6: {
                  if (param0 != 1) {
                    break L6;
                  } else {
                    if (null != ((rb) this).field_d) {
                      var4 = (Object) (Object) ((rb) this).field_n.a(3, ((rb) this).field_d, param2);
                      if (var10 == 0) {
                        break L3;
                      } else {
                        break L6;
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                }
                if (param0 == 2) {
                  if (null != ((rb) this).field_d) {
                    if (((rb) this).field_o[param2] != -1) {
                      throw new RuntimeException();
                    } else {
                      if (!((rb) this).field_A.d(20)) {
                        var4 = (Object) (Object) ((rb) this).field_A.a(param2, false, (byte) 2, (byte) -60, ((rb) this).field_q);
                        if (var10 == 0) {
                          break L3;
                        } else {
                          return null;
                        }
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
              L7: {
                L8: {
                  if (var5 == null) {
                    break L8;
                  } else {
                    if (var5.length > 2) {
                      te.field_a.reset();
                      te.field_a.update(var5, 0, -2 + var5.length);
                      var6_int = (int)te.field_a.getValue();
                      if (((rb) this).field_v.field_e[param2] == var6_int) {
                        L9: {
                          if (null == ((rb) this).field_v.field_g) {
                            break L9;
                          } else {
                            if (null == ((rb) this).field_v.field_g[param2]) {
                              break L9;
                            } else {
                              var7 = ((rb) this).field_v.field_g[param2];
                              var8 = wc.a(var5, -6408, 0, -2 + var5.length);
                              var9 = 0;
                              L10: while (true) {
                                if (var9 >= 64) {
                                  break L9;
                                } else {
                                  stackOut_79_0 = var7[var9];
                                  stackOut_79_1 = var8[var9];
                                  stackIn_95_0 = stackOut_79_0;
                                  stackIn_95_1 = stackOut_79_1;
                                  stackIn_80_0 = stackOut_79_0;
                                  stackIn_80_1 = stackOut_79_1;
                                  if (var10 != 0) {
                                    decompiledRegionSelector0 = 0;
                                    break L7;
                                  } else {
                                    if (stackIn_80_0 != stackIn_80_1) {
                                      throw new RuntimeException();
                                    } else {
                                      var9++;
                                      if (var10 == 0) {
                                        continue L10;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        ((rb) this).field_A.field_c = 0;
                        ((rb) this).field_A.field_f = 0;
                        decompiledRegionSelector0 = 1;
                        break L7;
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      break L8;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L11: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                ((rb) this).field_A.a(false);
                ((ca) var4).d(0);
                if (((ca) var4).field_t) {
                  if (!((rb) this).field_A.c(90)) {
                    var4 = (Object) (Object) ((rb) this).field_A.a(param2, true, (byte) 2, (byte) -60, ((rb) this).field_q);
                    ((rb) this).field_w.a((hl) var4, (long)param2, false);
                    break L11;
                  } else {
                    break L11;
                  }
                } else {
                  break L11;
                }
              }
              return null;
            }
            L12: {
              L13: {
                if (decompiledRegionSelector0 == 0) {
                  break L13;
                } else {
                  var5[var5.length - 2] = (byte)(((rb) this).field_v.field_p[param2] >>> 8);
                  var5[-1 + var5.length] = (byte)((rb) this).field_v.field_p[param2];
                  if (null != ((rb) this).field_d) {
                    bk discarded$1 = ((rb) this).field_n.a(param2, ((rb) this).field_d, var5, 11998);
                    stackOut_94_0 = ~((rb) this).field_o[param2];
                    stackOut_94_1 = -2;
                    stackIn_95_0 = stackOut_94_0;
                    stackIn_95_1 = stackOut_94_1;
                    break L13;
                  } else {
                    break L12;
                  }
                }
              }
              if (stackIn_95_0 == stackIn_95_1) {
                break L12;
              } else {
                ((rb) this).field_o[param2] = (byte) 1;
                break L12;
              }
            }
            L14: {
              if (((ca) var4).field_t) {
                break L14;
              } else {
                ((ca) var4).d(0);
                break L14;
              }
            }
            return (ca) var4;
          } else {
            try {
              L15: {
                L16: {
                  if (var5 == null) {
                    break L16;
                  } else {
                    if (2 >= var5.length) {
                      break L16;
                    } else {
                      te.field_a.reset();
                      te.field_a.update(var5, 0, -2 + var5.length);
                      var6_int = (int)te.field_a.getValue();
                      if (((rb) this).field_v.field_e[param2] == var6_int) {
                        L17: {
                          L18: {
                            if (null == ((rb) this).field_v.field_g) {
                              break L18;
                            } else {
                              if (null == ((rb) this).field_v.field_g[param2]) {
                                break L18;
                              } else {
                                var7 = ((rb) this).field_v.field_g[param2];
                                var8 = wc.a(var5, -6408, 0, var5.length - 2);
                                var9 = 0;
                                L19: while (true) {
                                  if (var9 >= 64) {
                                    break L18;
                                  } else {
                                    stackOut_46_0 = ~var8[var9];
                                    stackOut_46_1 = ~var7[var9];
                                    stackIn_52_0 = stackOut_46_0;
                                    stackIn_52_1 = stackOut_46_1;
                                    stackIn_47_0 = stackOut_46_0;
                                    stackIn_47_1 = stackOut_46_1;
                                    if (var10 != 0) {
                                      break L17;
                                    } else {
                                      if (stackIn_47_0 != stackIn_47_1) {
                                        throw new RuntimeException();
                                      } else {
                                        var9++;
                                        continue L19;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          stackOut_51_0 = var5[-1 + var5.length] & 255;
                          stackOut_51_1 = 65280 & var5[var5.length + -2] << 8;
                          stackIn_52_0 = stackOut_51_0;
                          stackIn_52_1 = stackOut_51_1;
                          break L17;
                        }
                        var7_int = stackIn_52_0 + stackIn_52_1;
                        if ((((rb) this).field_v.field_p[param2] & 65535) == var7_int) {
                          L20: {
                            if (((rb) this).field_o[param2] == 1) {
                              break L20;
                            } else {
                              L21: {
                                if (((rb) this).field_o[param2] == 0) {
                                  break L21;
                                } else {
                                  break L21;
                                }
                              }
                              ((rb) this).field_o[param2] = (byte) 1;
                              break L20;
                            }
                          }
                          L22: {
                            if (((ca) var4).field_t) {
                              break L22;
                            } else {
                              ((ca) var4).d(0);
                              break L22;
                            }
                          }
                          stackOut_60_0 = var4;
                          stackIn_61_0 = stackOut_60_0;
                          break L15;
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
              if (!((ca) var4).field_t) {
                return null;
              } else {
                L23: {
                  if (!((rb) this).field_A.c(104)) {
                    var4 = (Object) (Object) ((rb) this).field_A.a(param2, true, (byte) 2, (byte) -60, ((rb) this).field_q);
                    ((rb) this).field_w.a((hl) var4, (long)param2, false);
                    break L23;
                  } else {
                    break L23;
                  }
                }
                return null;
              }
            }
            return (ca) (Object) stackIn_61_0;
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
              L3: {
                var5 = ((rb) this).field_s.i(-20324);
                var2 = var5;
                if (((rb) this).field_s instanceof bk) {
                  break L3;
                } else {
                  try {
                    L4: {
                      if (var5 == null) {
                        throw new RuntimeException();
                      } else {
                        ((rb) this).field_v = new kn(var5, ((rb) this).field_h, ((rb) this).field_z);
                        break L4;
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3 = decompiledCaughtException;
                    ((rb) this).field_A.a(false);
                    ((rb) this).field_v = null;
                    if (((rb) this).field_A.c(75)) {
                      ((rb) this).field_s = null;
                      if (var4 == 0) {
                        return null;
                      } else {
                        ((rb) this).field_s = (ca) (Object) ((rb) this).field_A.a(((rb) this).field_q, true, (byte) 0, (byte) -60, 255);
                        return null;
                      }
                    } else {
                      ((rb) this).field_s = (ca) (Object) ((rb) this).field_A.a(((rb) this).field_q, true, (byte) 0, (byte) -60, 255);
                      return null;
                    }
                  }
                  if (null != ((rb) this).field_y) {
                    bk discarded$1 = ((rb) this).field_n.a(((rb) this).field_q, ((rb) this).field_y, var5, 11998);
                    if (var4 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              try {
                L5: {
                  if (var5 != null) {
                    ((rb) this).field_v = new kn(var5, ((rb) this).field_h, ((rb) this).field_z);
                    if (((rb) this).field_v.field_s != ((rb) this).field_k) {
                      throw new RuntimeException();
                    } else {
                      break L5;
                    }
                  } else {
                    throw new RuntimeException();
                  }
                }
              } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var3 = decompiledCaughtException;
                ((rb) this).field_v = null;
                if (((rb) this).field_A.c(98)) {
                  ((rb) this).field_s = null;
                  if (var4 == 0) {
                    return null;
                  } else {
                    ((rb) this).field_s = (ca) (Object) ((rb) this).field_A.a(((rb) this).field_q, true, (byte) 0, (byte) -60, 255);
                    return null;
                  }
                } else {
                  ((rb) this).field_s = (ca) (Object) ((rb) this).field_A.a(((rb) this).field_q, true, (byte) 0, (byte) -60, 255);
                  return null;
                }
              }
              break L2;
            }
            L6: {
              if (null != ((rb) this).field_d) {
                ((rb) this).field_o = new byte[((rb) this).field_v.field_o];
                break L6;
              } else {
                break L6;
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
        ca var3 = null;
        byte[] var4 = null;
        var3 = this.a(0, 92, param1);
        if (var3 != null) {
          if (param0 > -54) {
            return null;
          } else {
            var4 = var3.i(-20324);
            var3.d(0);
            return var4;
          }
        } else {
          return null;
        }
    }

    public static void d(int param0) {
        field_p = null;
        if (param0 > -103) {
            return;
        }
        field_B = null;
    }

    final void b(byte param0) {
        if (((rb) this).field_d == null) {
          return;
        } else {
          L0: {
            ((rb) this).field_e = true;
            if (((rb) this).field_r == null) {
              ((rb) this).field_r = new ah();
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (param0 < -10) {
              break L1;
            } else {
              ((rb) this).b(-110);
              break L1;
            }
          }
          return;
        }
    }

    final void c(int param0) {
        hl var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = HoldTheLine.field_D;
        if (((rb) this).field_r == null) {
          return;
        } else {
          if (null == ((rb) this).a((byte) 104)) {
            return;
          } else {
            L0: {
              if (param0 == 2) {
                break L0;
              } else {
                ((rb) this).field_h = -32;
                break L0;
              }
            }
            var2 = ((rb) this).field_j.b((byte) 121);
            L1: while (true) {
              L2: {
                if (var2 == null) {
                  break L2;
                } else {
                  var3 = (int)var2.field_f;
                  if (var4 != 0) {
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        L5: {
                          if (var3 < 0) {
                            break L5;
                          } else {
                            if (((rb) this).field_v.field_o <= var3) {
                              break L5;
                            } else {
                              if (((rb) this).field_v.field_u[var3] != 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        var2.d(0);
                        if (var4 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                      L6: {
                        if (0 != ((rb) this).field_o[var3]) {
                          break L6;
                        } else {
                          ca discarded$2 = this.a(1, 62, var3);
                          break L6;
                        }
                      }
                      L7: {
                        if (((rb) this).field_o[var3] != -1) {
                          break L7;
                        } else {
                          ca discarded$3 = this.a(2, 120, var3);
                          break L7;
                        }
                      }
                      if (((rb) this).field_o[var3] == 1) {
                        var2.d(0);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var2 = ((rb) this).field_j.c((byte) 117);
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              return;
            }
          }
        }
    }

    final void b(int param0) {
        ca var2 = null;
        int var2_int = 0;
        hl var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_49_0 = 0;
        byte stackIn_49_1 = 0;
        int stackIn_57_0 = 0;
        byte stackIn_57_1 = 0;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        int stackIn_76_0 = 0;
        int stackIn_76_1 = 0;
        boolean stackIn_95_0 = false;
        boolean stackIn_98_0 = false;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_63_0 = 0;
        int stackOut_63_1 = 0;
        int stackOut_48_0 = 0;
        byte stackOut_48_1 = 0;
        boolean stackOut_94_0 = false;
        L0: {
          var5 = HoldTheLine.field_D;
          if (((rb) this).field_r == null) {
            break L0;
          } else {
            if (((rb) this).a((byte) 73) != null) {
              L1: {
                if (((rb) this).field_f) {
                  break L1;
                } else {
                  L2: {
                    if (((rb) this).field_e) {
                      break L2;
                    } else {
                      ((rb) this).field_r = null;
                      if (var5 == 0) {
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var2_int = 1;
                  var3 = ((rb) this).field_r.b((byte) 92);
                  L3: while (true) {
                    L4: {
                      if (var3 == null) {
                        L5: while (true) {
                          if (((rb) this).field_l >= ((rb) this).field_v.field_u.length) {
                            break L4;
                          } else {
                            stackOut_25_0 = ~((rb) this).field_v.field_u[((rb) this).field_l];
                            stackOut_25_1 = -1;
                            stackIn_38_0 = stackOut_25_0;
                            stackIn_38_1 = stackOut_25_1;
                            stackIn_26_0 = stackOut_25_0;
                            stackIn_26_1 = stackOut_25_1;
                            if (var5 != 0) {
                              L6: {
                                if (stackIn_38_0 == stackIn_38_1) {
                                  break L6;
                                } else {
                                  ((rb) this).field_y = null;
                                  break L6;
                                }
                              }
                              return;
                            } else {
                              L7: {
                                if (stackIn_26_0 == stackIn_26_1) {
                                  break L7;
                                } else {
                                  L8: {
                                    if (!((rb) this).field_A.d(param0 ^ 22)) {
                                      break L8;
                                    } else {
                                      var2_int = 0;
                                      if (var5 == 0) {
                                        break L4;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                  L9: {
                                    if (((rb) this).field_o[((rb) this).field_l] != 1) {
                                      ca discarded$4 = this.a(2, 74, ((rb) this).field_l);
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  }
                                  if (1 == ((rb) this).field_o[((rb) this).field_l]) {
                                    break L7;
                                  } else {
                                    var3 = new hl();
                                    var3.field_f = (long)((rb) this).field_l;
                                    var2_int = 0;
                                    ((rb) this).field_r.a((byte) -125, var3);
                                    break L7;
                                  }
                                }
                              }
                              ((rb) this).field_l = ((rb) this).field_l + 1;
                              continue L5;
                            }
                          }
                        }
                      } else {
                        var4 = (int)var3.field_f;
                        stackOut_9_0 = ~((rb) this).field_o[var4];
                        stackOut_9_1 = -2;
                        stackIn_19_0 = stackOut_9_0;
                        stackIn_19_1 = stackOut_9_1;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        if (var5 != 0) {
                          if (stackIn_19_0 >= stackIn_19_1) {
                            break L4;
                          } else {
                            L10: {
                              if (((rb) this).field_v.field_u[((rb) this).field_l] == 0) {
                                break L10;
                              } else {
                                ((rb) this).field_y = null;
                                break L10;
                              }
                            }
                            return;
                          }
                        } else {
                          L11: {
                            if (stackIn_10_0 != stackIn_10_1) {
                              ca discarded$5 = this.a(2, 53, var4);
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          L12: {
                            L13: {
                              if (((rb) this).field_o[var4] != 1) {
                                break L13;
                              } else {
                                var3.d(0);
                                if (var5 == 0) {
                                  break L12;
                                } else {
                                  break L13;
                                }
                              }
                            }
                            var2_int = 0;
                            break L12;
                          }
                          var3 = ((rb) this).field_r.c((byte) -86);
                          continue L3;
                        }
                      }
                    }
                    L14: {
                      if (var2_int != 0) {
                        ((rb) this).field_l = 0;
                        ((rb) this).field_e = false;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    if (var5 == 0) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              var2_int = 1;
              var3 = ((rb) this).field_r.b((byte) 99);
              L15: while (true) {
                L16: {
                  if (var3 == null) {
                    L17: while (true) {
                      if (((rb) this).field_l >= ((rb) this).field_v.field_u.length) {
                        break L16;
                      } else {
                        stackOut_63_0 = -1;
                        stackOut_63_1 = ((rb) this).field_v.field_u[((rb) this).field_l];
                        stackIn_76_0 = stackOut_63_0;
                        stackIn_76_1 = stackOut_63_1;
                        stackIn_64_0 = stackOut_63_0;
                        stackIn_64_1 = stackOut_63_1;
                        if (var5 != 0) {
                          L18: {
                            if (stackIn_76_0 == stackIn_76_1) {
                              break L18;
                            } else {
                              ((rb) this).field_y = null;
                              break L18;
                            }
                          }
                          return;
                        } else {
                          if (stackIn_64_0 != stackIn_64_1) {
                            L19: {
                              if (-251 > ((rb) this).field_n.field_c) {
                                break L19;
                              } else {
                                var2_int = 0;
                                if (var5 == 0) {
                                  break L16;
                                } else {
                                  break L19;
                                }
                              }
                            }
                            L20: {
                              if (((rb) this).field_o[((rb) this).field_l] != 0) {
                                break L20;
                              } else {
                                ca discarded$6 = this.a(1, 106, ((rb) this).field_l);
                                break L20;
                              }
                            }
                            L21: {
                              if (((rb) this).field_o[((rb) this).field_l] == 0) {
                                var3 = new hl();
                                var3.field_f = (long)((rb) this).field_l;
                                var2_int = 0;
                                ((rb) this).field_r.a((byte) -82, var3);
                                break L21;
                              } else {
                                break L21;
                              }
                            }
                            ((rb) this).field_l = ((rb) this).field_l + 1;
                            if (var5 == 0) {
                              continue L17;
                            } else {
                              break L16;
                            }
                          } else {
                            ((rb) this).field_l = ((rb) this).field_l + 1;
                            continue L17;
                          }
                        }
                      }
                    }
                  } else {
                    var4 = (int)var3.field_f;
                    stackOut_48_0 = 0;
                    stackOut_48_1 = ((rb) this).field_o[var4];
                    stackIn_57_0 = stackOut_48_0;
                    stackIn_57_1 = stackOut_48_1;
                    stackIn_49_0 = stackOut_48_0;
                    stackIn_49_1 = stackOut_48_1;
                    if (var5 != 0) {
                      if (stackIn_57_0 >= stackIn_57_1) {
                        break L16;
                      } else {
                        L22: {
                          if (-1 == ((rb) this).field_v.field_u[((rb) this).field_l]) {
                            break L22;
                          } else {
                            ((rb) this).field_y = null;
                            break L22;
                          }
                        }
                        return;
                      }
                    } else {
                      L23: {
                        if (stackIn_49_0 == stackIn_49_1) {
                          ca discarded$7 = this.a(1, param0 ^ 102, var4);
                          break L23;
                        } else {
                          break L23;
                        }
                      }
                      L24: {
                        L25: {
                          if (0 != ((rb) this).field_o[var4]) {
                            break L25;
                          } else {
                            var2_int = 0;
                            if (var5 == 0) {
                              break L24;
                            } else {
                              break L25;
                            }
                          }
                        }
                        var3.d(0);
                        break L24;
                      }
                      var3 = ((rb) this).field_r.c((byte) 113);
                      continue L15;
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
              return;
            }
          }
        }
        if (((rb) this).field_u) {
          if (((rb) this).field_i <= bb.b(-1)) {
            var2 = (ca) (Object) ((rb) this).field_w.a(0);
            L26: while (true) {
              if (var2 != null) {
                stackOut_94_0 = var2.field_u;
                stackIn_98_0 = stackOut_94_0;
                stackIn_95_0 = stackOut_94_0;
                if (var5 == 0) {
                  L27: {
                    L28: {
                      if (!stackIn_98_0) {
                        break L28;
                      } else {
                        if (var5 == 0) {
                          break L27;
                        } else {
                          break L28;
                        }
                      }
                    }
                    L29: {
                      if (var2.field_q) {
                        break L29;
                      } else {
                        var2.field_q = true;
                        if (var5 == 0) {
                          break L27;
                        } else {
                          break L29;
                        }
                      }
                    }
                    if (var2.field_t) {
                      var2.d(0);
                      break L27;
                    } else {
                      throw new RuntimeException();
                    }
                  }
                  var2 = (ca) (Object) ((rb) this).field_w.b(-1);
                  continue L26;
                } else {
                  L30: {
                    if ((stackIn_95_0 ? 1 : 0) == 2) {
                      break L30;
                    } else {
                      ((rb) this).field_y = null;
                      break L30;
                    }
                  }
                  return;
                }
              } else {
                L31: {
                  ((rb) this).field_i = 1000L + bb.b(-1);
                  if (param0 == 2) {
                    break L31;
                  } else {
                    ((rb) this).field_y = null;
                    break L31;
                  }
                }
                return;
              }
            }
          } else {
            L32: {
              if (param0 == 2) {
                break L32;
              } else {
                ((rb) this).field_y = null;
                break L32;
              }
            }
            return;
          }
        } else {
          L33: {
            if (param0 == 2) {
              break L33;
            } else {
              ((rb) this).field_y = null;
              break L33;
            }
          }
          return;
        }
    }

    final int a(boolean param0, int param1) {
        ca var3 = null;
        L0: {
          var3 = (ca) (Object) ((rb) this).field_w.a((byte) 113, (long)param1);
          if (!param0) {
            break L0;
          } else {
            ((rb) this).field_v = null;
            break L0;
          }
        }
        if (var3 == null) {
          return 0;
        } else {
          return var3.g(0);
        }
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
              L2: {
                ((rb) this).field_q = param0;
                ((rb) this).field_d = param1;
                if (((rb) this).field_d != null) {
                  break L2;
                } else {
                  ((rb) this).field_f = false;
                  if (HoldTheLine.field_D == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((rb) this).field_f = true;
              ((rb) this).field_r = new ah();
              break L1;
            }
            L3: {
              ((rb) this).field_z = param6;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param8) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L3;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L3;
              }
            }
            L4: {
              ((rb) this).field_u = stackIn_7_1 != 0;
              ((rb) this).field_A = param3;
              ((rb) this).field_y = param2;
              ((rb) this).field_n = param4;
              ((rb) this).field_k = param7;
              ((rb) this).field_h = param5;
              if (null == ((rb) this).field_y) {
                break L4;
              } else {
                ((rb) this).field_s = (ca) (Object) ((rb) this).field_n.a(((rb) this).field_y, -18017, ((rb) this).field_q);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var10 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var10;
            stackOut_10_1 = new StringBuilder().append("rb.<init>(").append(param0).append(44);
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
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          L6: {
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
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          L7: {
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
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          L8: {
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
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          L9: {
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
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param7 + 44 + param8 + 41);
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
