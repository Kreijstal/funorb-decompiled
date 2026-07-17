/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vc {
    private long[] field_k;
    private int field_e;
    static volatile boolean field_a;
    private long[] field_f;
    static String field_n;
    private int field_d;
    static long field_j;
    static String field_i;
    private long[] field_o;
    private long[] field_m;
    private byte[] field_h;
    private long[] field_c;
    static String field_b;
    static int[] field_g;
    private byte[] field_l;

    final void a(byte param0, byte[] param1, long param2) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_12_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_26_0 = 0;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var13 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 >= 2) {
                break L1;
              } else {
                vc.b(101);
                break L1;
              }
            }
            var5_int = 0;
            var6 = 7 & 8 + -((int)param2 & 7);
            var7 = 7 & ((vc) this).field_e;
            var9 = param2;
            var11 = 31;
            var12 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  L5: {
                    if (var11 < 0) {
                      break L5;
                    } else {
                      var12 = var12 + ((((vc) this).field_l[var11] & 255) - -(255 & (int)var9));
                      ((vc) this).field_l[var11] = (byte)var12;
                      var12 = var12 >>> 8;
                      var9 = var9 >>> 8;
                      var11--;
                      if (var13 != 0) {
                        break L4;
                      } else {
                        if (var13 == 0) {
                          continue L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  L6: while (true) {
                    if (param2 <= 8L) {
                      break L4;
                    } else {
                      var8 = 255 & param1[var5_int] << var6 | (255 & param1[var5_int - -1]) >>> -var6 + 8;
                      stackOut_11_0 = var8;
                      stackIn_27_0 = stackOut_11_0;
                      stackIn_12_0 = stackOut_11_0;
                      if (var13 != 0) {
                        break L3;
                      } else {
                        L7: {
                          if (stackIn_12_0 < 0) {
                            break L7;
                          } else {
                            if (var8 >= 256) {
                              break L7;
                            } else {
                              L8: {
                                ((vc) this).field_h[((vc) this).field_d] = (byte)ge.a((int) ((vc) this).field_h[((vc) this).field_d], var8 >>> var7);
                                ((vc) this).field_d = ((vc) this).field_d + 1;
                                ((vc) this).field_e = ((vc) this).field_e + (8 + -var7);
                                if (((vc) this).field_e == 512) {
                                  this.a(false);
                                  ((vc) this).field_e = 0;
                                  ((vc) this).field_d = 0;
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                              ((vc) this).field_h[((vc) this).field_d] = (byte)vi.a(var8 << 8 + -var7, 255);
                              param2 = param2 - 8L;
                              var5_int++;
                              ((vc) this).field_e = ((vc) this).field_e + var7;
                              if (var13 == 0) {
                                continue L6;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        throw new RuntimeException("LOGIC ERROR");
                      }
                    }
                  }
                }
                stackOut_26_0 = (param2 < 0L ? -1 : (param2 == 0L ? 0 : 1));
                stackIn_27_0 = stackOut_26_0;
                break L3;
              }
              L9: {
                L10: {
                  if (stackIn_27_0 <= 0) {
                    break L10;
                  } else {
                    var8 = 255 & param1[var5_int] << var6;
                    ((vc) this).field_h[((vc) this).field_d] = (byte)ge.a((int) ((vc) this).field_h[((vc) this).field_d], var8 >>> var7);
                    if (var13 == 0) {
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
                var8 = 0;
                break L9;
              }
              L11: {
                L12: {
                  if (param2 + (long)var7 < 8L) {
                    break L12;
                  } else {
                    L13: {
                      ((vc) this).field_d = ((vc) this).field_d + 1;
                      param2 = param2 - (long)(-var7 + 8);
                      ((vc) this).field_e = ((vc) this).field_e + (-var7 + 8);
                      if (((vc) this).field_e != 512) {
                        break L13;
                      } else {
                        this.a(false);
                        ((vc) this).field_e = 0;
                        ((vc) this).field_d = 0;
                        break L13;
                      }
                    }
                    ((vc) this).field_h[((vc) this).field_d] = (byte)vi.a(var8 << 8 + -var7, 255);
                    ((vc) this).field_e = ((vc) this).field_e + (int)param2;
                    if (var13 == 0) {
                      break L11;
                    } else {
                      break L12;
                    }
                  }
                }
                ((vc) this).field_e = (int)((long)((vc) this).field_e + param2);
                break L11;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var5 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var5;
            stackOut_38_1 = new StringBuilder().append("vc.A(").append(param0).append(44);
            stackIn_41_0 = stackOut_38_0;
            stackIn_41_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param1 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L14;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_42_0 = stackOut_39_0;
              stackIn_42_1 = stackOut_39_1;
              stackIn_42_2 = stackOut_39_2;
              break L14;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + 44 + param2 + 41);
        }
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        se var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4_int = 0;
        String var4 = null;
        String var5_ref_String = null;
        int var5 = 0;
        ti var6 = null;
        String var6_ref = null;
        String var7 = null;
        ti var7_ref = null;
        String var8 = null;
        ti var8_ref = null;
        int var9 = 0;
        int stackIn_12_0 = 0;
        ti stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        ti stackIn_49_2 = null;
        ti stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        ti stackIn_59_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        ti stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        ti stackOut_48_2 = null;
        ti stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        ti stackOut_57_2 = null;
        var9 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var3 = 50 / ((23 - param0) / 46);
            var1_ref = cd.field_t;
            var2 = var1_ref.b((byte) 90);
            if (var2 == 0) {
              L1: {
                if (qb.field_a == null) {
                  qb.field_a = new k(128);
                  rl.field_e = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (1 != var1_ref.b((byte) 90)) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L2;
                } else {
                  stackOut_9_0 = 1;
                  stackIn_12_0 = stackOut_9_0;
                  break L2;
                }
              }
              L3: {
                var4_int = stackIn_12_0;
                var5_ref_String = var1_ref.g(2);
                if (var4_int == 0) {
                  break L3;
                } else {
                  String discarded$3 = var1_ref.g(2);
                  break L3;
                }
              }
              L4: {
                var6 = tg.a(var5_ref_String, 256);
                var7 = var1_ref.g(2);
                var8 = ua.a(-74, (CharSequence) (Object) var5_ref_String);
                if (var8 != null) {
                  break L4;
                } else {
                  var8 = var5_ref_String;
                  break L4;
                }
              }
              L5: {
                if (var6 != null) {
                  break L5;
                } else {
                  var6 = tg.a(var7, 256);
                  if (null == var6) {
                    break L5;
                  } else {
                    qb.field_a.a(-1, (o) (Object) var6, (long)var8.hashCode());
                    break L5;
                  }
                }
              }
              L6: {
                if (var6 == null) {
                  var6 = new ti();
                  qb.field_a.a(-1, (o) (Object) var6, (long)var8.hashCode());
                  int fieldTemp$4 = rl.field_e;
                  rl.field_e = rl.field_e + 1;
                  var6.field_ab = fieldTemp$4;
                  ii.field_c.a(-109, (ca) (Object) var6);
                  break L6;
                } else {
                  break L6;
                }
              }
              var6.field_db = var5_ref_String;
              return;
            } else {
              if (var2 == 1) {
                L7: {
                  if (null == ge.field_c) {
                    ge.field_c = new k(128);
                    tl.field_a = 0;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  var4 = var1_ref.g(2);
                  if (!var4.equals((Object) (Object) "")) {
                    break L8;
                  } else {
                    var4 = null;
                    break L8;
                  }
                }
                L9: {
                  var5_ref_String = var1_ref.g(2);
                  var6_ref = var1_ref.g(2);
                  var7_ref = gi.a(var5_ref_String, -52);
                  if (null != var7_ref) {
                    break L9;
                  } else {
                    var7_ref = gi.a(var6_ref, -71);
                    if (null == var7_ref) {
                      break L9;
                    } else {
                      ge.field_c.a(-1, (o) (Object) var7_ref, (long)ua.a(-92, (CharSequence) (Object) var5_ref_String).hashCode());
                      break L9;
                    }
                  }
                }
                L10: {
                  if (null == var7_ref) {
                    var7_ref = new ti();
                    ge.field_c.a(-1, (o) (Object) var7_ref, (long)ua.a(-94, (CharSequence) (Object) var5_ref_String).hashCode());
                    int fieldTemp$5 = tl.field_a;
                    tl.field_a = tl.field_a + 1;
                    var7_ref.field_ab = fieldTemp$5;
                    lf.field_b.a(-107, (ca) (Object) var7_ref);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (var4 == null) {
                    break L11;
                  } else {
                    var4 = var4.intern();
                    break L11;
                  }
                }
                var7_ref.field_Z = var4;
                var7_ref.field_db = var5_ref_String;
                var7_ref.b(57);
                var8_ref = (ti) (Object) lf.field_b.b((byte) 126);
                L12: while (true) {
                  L13: {
                    L14: {
                      L15: {
                        if (var8_ref == null) {
                          break L15;
                        } else {
                          stackOut_48_0 = (ti) var7_ref;
                          stackOut_48_1 = 100;
                          stackOut_48_2 = (ti) var8_ref;
                          stackIn_59_0 = stackOut_48_0;
                          stackIn_59_1 = stackOut_48_1;
                          stackIn_59_2 = stackOut_48_2;
                          stackIn_49_0 = stackOut_48_0;
                          stackIn_49_1 = stackOut_48_1;
                          stackIn_49_2 = stackOut_48_2;
                          if (var9 != 0) {
                            break L14;
                          } else {
                            if (!oj.a(stackIn_49_0, stackIn_49_1, stackIn_49_2)) {
                              break L15;
                            } else {
                              var8_ref = (ti) (Object) lf.field_b.d(853);
                              if (var9 == 0) {
                                continue L12;
                              } else {
                                break L15;
                              }
                            }
                          }
                        }
                      }
                      L16: {
                        if (null != var8_ref) {
                          break L16;
                        } else {
                          lf.field_b.a(-96, (ca) (Object) var7_ref);
                          if (var9 == 0) {
                            break L13;
                          } else {
                            break L16;
                          }
                        }
                      }
                      stackOut_57_0 = (ti) var7_ref;
                      stackOut_57_1 = -65;
                      stackOut_57_2 = (ti) var8_ref;
                      stackIn_59_0 = stackOut_57_0;
                      stackIn_59_1 = stackOut_57_1;
                      stackIn_59_2 = stackOut_57_2;
                      break L14;
                    }
                    vk.a((ca) (Object) stackIn_59_0, (byte) stackIn_59_1, (ca) (Object) stackIn_59_2);
                    break L13;
                  }
                  return;
                }
              } else {
                if (var2 != 2) {
                  if (3 != var2) {
                    if (4 == var2) {
                      ob.field_H = 1;
                      var4 = var1_ref.g(2);
                      uc.field_r = var4.intern();
                      var5 = var1_ref.b((byte) 90);
                      lb.a(true, var5);
                      return;
                    } else {
                      pe.a((byte) -13, (Throwable) null, "F1: " + sj.b(true));
                      th.a(113);
                      break L0;
                    }
                  } else {
                    L17: {
                      if (ob.field_H != 2) {
                        break L17;
                      } else {
                        ob.field_H = 1;
                        break L17;
                      }
                    }
                    return;
                  }
                } else {
                  L18: {
                    if (ob.field_H == 1) {
                      ob.field_H = 2;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var1, "vc.E(" + param0 + 41);
        }
    }

    final void a(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              L2: {
                if (var2_int >= 32) {
                  break L2;
                } else {
                  ((vc) this).field_l[var2_int] = (byte) 0;
                  var2_int++;
                  if (var4 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              var3 = -126 / ((param0 - 59) / 36);
              ((vc) this).field_h[0] = (byte) 0;
              ((vc) this).field_e = 0;
              ((vc) this).field_d = 0;
              var2_int = 0;
              L3: while (true) {
                L4: {
                  L5: {
                    if (var2_int >= 8) {
                      break L5;
                    } else {
                      ((vc) this).field_k[var2_int] = 0L;
                      var2_int++;
                      if (var4 != 0) {
                        break L4;
                      } else {
                        if (var4 == 0) {
                          continue L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  break L4;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw dd.a((Throwable) (Object) runtimeException, "vc.F(" + param0 + 41);
        }
    }

    public static void a(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_i = null;
              field_g = null;
              if (param0 > 68) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            field_b = null;
            field_n = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var1, "vc.D(" + param0 + 41);
        }
    }

    private final void a(boolean param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_61_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_60_0 = 0;
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            var3 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (8 <= var2_int) {
                    break L3;
                  } else {
                    ((vc) this).field_m[var2_int] = j.a(j.a(j.a(bm.a((long)((vc) this).field_h[var3 - -5], 255L) << 16, j.a(j.a(bm.a(255L, (long)((vc) this).field_h[3 + var3]) << 32, j.a(j.a(bm.a((long)((vc) this).field_h[1 + var3] << 48, 71776119061217280L), (long)((vc) this).field_h[var3] << 56), bm.a(280375465082880L, (long)((vc) this).field_h[var3 - -2] << 40))), bm.a((long)((vc) this).field_h[var3 + 4], 255L) << 24)), bm.a((long)((vc) this).field_h[6 + var3], 255L) << 8), bm.a((long)((vc) this).field_h[7 + var3], 255L));
                    var3 += 8;
                    var2_int++;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (!param0) {
                  break L2;
                } else {
                  vc.a((byte) -46);
                  break L2;
                }
              }
              var2_int = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (var2_int >= 8) {
                      break L6;
                    } else {
                      ((vc) this).field_o[var2_int] = ((vc) this).field_k[var2_int];
                      ((vc) this).field_c[var2_int] = j.a(((vc) this).field_m[var2_int], ((vc) this).field_k[var2_int]);
                      var2_int++;
                      if (var6 != 0) {
                        break L5;
                      } else {
                        if (var6 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  var2_int = 1;
                  break L5;
                }
                L7: while (true) {
                  L8: {
                    L9: {
                      if (var2_int > 10) {
                        break L9;
                      } else {
                        stackOut_18_0 = 0;
                        stackIn_61_0 = stackOut_18_0;
                        stackIn_19_0 = stackOut_18_0;
                        if (var6 != 0) {
                          break L8;
                        } else {
                          stackOut_19_0 = stackIn_19_0;
                          stackIn_21_0 = stackOut_19_0;
                          var3 = stackIn_21_0;
                          L10: while (true) {
                            L11: {
                              L12: {
                                if (var3 >= 8) {
                                  break L12;
                                } else {
                                  ((vc) this).field_f[var3] = 0L;
                                  var4 = 0;
                                  stackOut_23_0 = 56;
                                  stackIn_33_0 = stackOut_23_0;
                                  stackIn_24_0 = stackOut_23_0;
                                  if (var6 != 0) {
                                    break L11;
                                  } else {
                                    var5 = stackIn_24_0;
                                    L13: while (true) {
                                      L14: {
                                        L15: {
                                          if (var4 >= 8) {
                                            break L15;
                                          } else {
                                            ((vc) this).field_f[var3] = j.a(((vc) this).field_f[var3], nd.field_c[var4][vi.a((int)(((vc) this).field_o[vi.a(-var4 + var3, 7)] >>> var5), 255)]);
                                            var4++;
                                            var5 -= 8;
                                            if (var6 != 0) {
                                              break L14;
                                            } else {
                                              if (var6 == 0) {
                                                continue L13;
                                              } else {
                                                break L15;
                                              }
                                            }
                                          }
                                        }
                                        var3++;
                                        break L14;
                                      }
                                      if (var6 == 0) {
                                        continue L10;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_32_0 = 0;
                              stackIn_33_0 = stackOut_32_0;
                              break L11;
                            }
                            var3 = stackIn_33_0;
                            L16: while (true) {
                              L17: {
                                L18: {
                                  if (var3 >= 8) {
                                    break L18;
                                  } else {
                                    ((vc) this).field_o[var3] = ((vc) this).field_f[var3];
                                    var3++;
                                    if (var6 != 0) {
                                      break L17;
                                    } else {
                                      if (var6 == 0) {
                                        continue L16;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                }
                                ((vc) this).field_o[0] = j.a(((vc) this).field_o[0], nd.field_d[var2_int]);
                                break L17;
                              }
                              var3 = 0;
                              L19: while (true) {
                                L20: {
                                  L21: {
                                    if (var3 >= 8) {
                                      break L21;
                                    } else {
                                      ((vc) this).field_f[var3] = ((vc) this).field_o[var3];
                                      var4 = 0;
                                      stackOut_42_0 = 56;
                                      stackIn_52_0 = stackOut_42_0;
                                      stackIn_43_0 = stackOut_42_0;
                                      if (var6 != 0) {
                                        break L20;
                                      } else {
                                        var5 = stackIn_43_0;
                                        L22: while (true) {
                                          L23: {
                                            L24: {
                                              if (var4 >= 8) {
                                                break L24;
                                              } else {
                                                ((vc) this).field_f[var3] = j.a(((vc) this).field_f[var3], nd.field_c[var4][vi.a((int)(((vc) this).field_c[vi.a(var3 + -var4, 7)] >>> var5), 255)]);
                                                var5 -= 8;
                                                var4++;
                                                if (var6 != 0) {
                                                  break L23;
                                                } else {
                                                  if (var6 == 0) {
                                                    continue L22;
                                                  } else {
                                                    break L24;
                                                  }
                                                }
                                              }
                                            }
                                            var3++;
                                            break L23;
                                          }
                                          if (var6 == 0) {
                                            continue L19;
                                          } else {
                                            break L21;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  stackOut_51_0 = 0;
                                  stackIn_52_0 = stackOut_51_0;
                                  break L20;
                                }
                                var3 = stackIn_52_0;
                                L25: while (true) {
                                  L26: {
                                    L27: {
                                      if (var3 >= 8) {
                                        break L27;
                                      } else {
                                        ((vc) this).field_c[var3] = ((vc) this).field_f[var3];
                                        var3++;
                                        if (var6 != 0) {
                                          break L26;
                                        } else {
                                          if (var6 == 0) {
                                            continue L25;
                                          } else {
                                            break L27;
                                          }
                                        }
                                      }
                                    }
                                    var2_int++;
                                    break L26;
                                  }
                                  if (var6 == 0) {
                                    continue L7;
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
                    stackOut_60_0 = 0;
                    stackIn_61_0 = stackOut_60_0;
                    break L8;
                  }
                  var2_int = stackIn_61_0;
                  L28: while (true) {
                    L29: {
                      L30: {
                        if (8 <= var2_int) {
                          break L30;
                        } else {
                          ((vc) this).field_k[var2_int] = j.a(((vc) this).field_k[var2_int], j.a(((vc) this).field_c[var2_int], ((vc) this).field_m[var2_int]));
                          var2_int++;
                          if (var6 != 0) {
                            break L29;
                          } else {
                            if (var6 == 0) {
                              continue L28;
                            } else {
                              break L30;
                            }
                          }
                        }
                      }
                      break L29;
                    }
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var2, "vc.B(" + param0 + 41);
        }
    }

    final static int a(boolean param0, int param1, int param2, String param3, boolean param4, String param5) {
        try {
            RuntimeException var6 = null;
            int var6_int = 0;
            String var6_ref = null;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            int stackIn_8_0 = 0;
            int stackIn_55_0 = 0;
            int stackIn_58_0 = 0;
            int stackIn_74_0 = 0;
            int stackIn_78_0 = 0;
            int stackIn_124_0 = 0;
            int stackIn_136_0 = 0;
            int stackIn_142_0 = 0;
            int stackIn_156_0 = 0;
            int stackIn_159_0 = 0;
            RuntimeException stackIn_161_0 = null;
            StringBuilder stackIn_161_1 = null;
            RuntimeException stackIn_163_0 = null;
            StringBuilder stackIn_163_1 = null;
            RuntimeException stackIn_164_0 = null;
            StringBuilder stackIn_164_1 = null;
            String stackIn_164_2 = null;
            RuntimeException stackIn_165_0 = null;
            StringBuilder stackIn_165_1 = null;
            RuntimeException stackIn_167_0 = null;
            StringBuilder stackIn_167_1 = null;
            RuntimeException stackIn_168_0 = null;
            StringBuilder stackIn_168_1 = null;
            String stackIn_168_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_7_0 = 0;
            int stackOut_54_0 = 0;
            int stackOut_73_0 = 0;
            int stackOut_71_0 = 0;
            int stackOut_77_0 = 0;
            int stackOut_75_0 = 0;
            int stackOut_123_0 = 0;
            int stackOut_135_0 = 0;
            int stackOut_141_0 = 0;
            int stackOut_155_0 = 0;
            int stackOut_158_0 = 0;
            int stackOut_57_0 = 0;
            RuntimeException stackOut_160_0 = null;
            StringBuilder stackOut_160_1 = null;
            RuntimeException stackOut_163_0 = null;
            StringBuilder stackOut_163_1 = null;
            String stackOut_163_2 = null;
            RuntimeException stackOut_161_0 = null;
            StringBuilder stackOut_161_1 = null;
            String stackOut_161_2 = null;
            RuntimeException stackOut_164_0 = null;
            StringBuilder stackOut_164_1 = null;
            RuntimeException stackOut_167_0 = null;
            StringBuilder stackOut_167_1 = null;
            String stackOut_167_2 = null;
            RuntimeException stackOut_165_0 = null;
            StringBuilder stackOut_165_1 = null;
            String stackOut_165_2 = null;
            var9 = OrbDefence.field_D ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (null == p.field_d) {
                    var6_int = fg.a(param4, -66) ? 1 : 0;
                    if (var6_int == 0) {
                      stackOut_7_0 = -1;
                      stackIn_8_0 = stackOut_7_0;
                      return stackIn_8_0;
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (dh.field_bb != sk.field_E) {
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        if (param4) {
                          break L4;
                        } else {
                          s.field_A = sj.a(true, param3, false, param5);
                          if (var9 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      s.field_A = f.a(false, p.field_c, (String) null, 17470, param5);
                      break L3;
                    }
                    uk.field_b.field_i = 0;
                    uk.field_b.a(14, -111);
                    uk.field_b.a(s.field_A.a(10277).field_c, -53);
                    bh.a(-1, -1);
                    dh.field_bb = nh.field_c;
                    break L2;
                  }
                }
                L5: {
                  if (nh.field_c == dh.field_bb) {
                    if (!va.a(true, 1)) {
                      break L5;
                    } else {
                      L6: {
                        L7: {
                          var6_int = cd.field_t.b((byte) 90);
                          if (0 != var6_int) {
                            break L7;
                          } else {
                            dh.field_bb = wh.field_c;
                            if (var9 == 0) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        ab.field_l = var6_int;
                        tf.field_c = -1;
                        dh.field_bb = hf.field_l;
                        break L6;
                      }
                      cd.field_t.field_i = 0;
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                L8: {
                  if (wh.field_c == dh.field_bb) {
                    if (va.a(true, 8)) {
                      tg.field_a = cd.field_t.c((byte) -89);
                      cd.field_t.field_i = 0;
                      lg.a(3, param1, s.field_A, param4, param0);
                      dh.field_bb = da.field_m;
                      break L8;
                    } else {
                      break L8;
                    }
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (da.field_m != dh.field_bb) {
                    break L9;
                  } else {
                    if (!va.a(true, 1)) {
                      break L9;
                    } else {
                      L10: {
                        L11: {
                          var6_int = cd.field_t.b((byte) 90);
                          cd.field_t.field_i = 0;
                          ug.field_r = null;
                          ab.field_l = var6_int;
                          if (var6_int == 0) {
                            break L11;
                          } else {
                            if (var6_int != 1) {
                              break L10;
                            } else {
                              break L11;
                            }
                          }
                        }
                        dh.field_bb = lm.field_e;
                        tf.field_c = -1;
                        if (var9 == 0) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                      L12: {
                        if (var6_int == 8) {
                          break L12;
                        } else {
                          dh.field_bb = hf.field_l;
                          tf.field_c = -1;
                          if (var9 == 0) {
                            break L9;
                          } else {
                            break L12;
                          }
                        }
                      }
                      th.a(127);
                      ea.field_a = false;
                      stackOut_54_0 = var6_int;
                      stackIn_55_0 = stackOut_54_0;
                      return stackIn_55_0;
                    }
                  }
                }
                if (param2 < -18) {
                  L13: {
                    if (dh.field_bb == lm.field_e) {
                      if (!ce.a(-60)) {
                        break L13;
                      } else {
                        L14: {
                          p.field_c = cd.field_t.c((byte) -89);
                          va.field_d = cd.field_t.b((byte) 90);
                          int discarded$6 = cd.field_t.b((byte) 90);
                          tc.field_b = cd.field_t.j(98203176);
                          var6_ref = cd.field_t.i(-1);
                          var7 = cd.field_t.b((byte) 90);
                          if ((var7 & 1) != 0) {
                            gd.a((byte) 124);
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        L15: {
                          if (!param4) {
                            L16: {
                              if ((8 & var7) == 0) {
                                stackOut_73_0 = 0;
                                stackIn_74_0 = stackOut_73_0;
                                break L16;
                              } else {
                                stackOut_71_0 = 1;
                                stackIn_74_0 = stackOut_71_0;
                                break L16;
                              }
                            }
                            L17: {
                              pc.field_Z = stackIn_74_0 != 0;
                              if ((4 & var7) == 0) {
                                stackOut_77_0 = 0;
                                stackIn_78_0 = stackOut_77_0;
                                break L17;
                              } else {
                                stackOut_75_0 = 1;
                                stackIn_78_0 = stackOut_75_0;
                                break L17;
                              }
                            }
                            jd.field_b = stackIn_78_0 != 0;
                            if (pc.field_Z) {
                              break L15;
                            } else {
                              break L15;
                            }
                          } else {
                            break L15;
                          }
                        }
                        L18: {
                          L19: {
                            if (mg.field_g) {
                              int discarded$7 = cd.field_t.b((byte) 90);
                              int discarded$8 = cd.field_t.b((byte) 90);
                              int discarded$9 = cd.field_t.l(0);
                              cf.field_c = cd.field_t.j(98203176);
                              ij.field_h = new byte[cf.field_c];
                              var8 = 0;
                              L20: while (true) {
                                if (~cf.field_c >= ~var8) {
                                  break L19;
                                } else {
                                  ij.field_h[var8] = cd.field_t.d(-20398);
                                  var8++;
                                  if (var9 != 0) {
                                    break L18;
                                  } else {
                                    if (var9 == 0) {
                                      continue L20;
                                    } else {
                                      break L19;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L19;
                            }
                          }
                          gb.field_h = cd.field_t.g(2);
                          sg.field_E = ua.a(90, (CharSequence) (Object) gb.field_h);
                          cb.field_j = cd.field_t.b((byte) 90);
                          dh.field_bb = da.field_r;
                          break L18;
                        }
                        L21: {
                          L22: {
                            if (s.field_A.a(10277) == ci.field_b) {
                              break L22;
                            } else {
                              if (s.field_A.a(10277) == oj.field_j) {
                                vh.field_s.a(12423, uj.b((byte) -120));
                                if (var9 == 0) {
                                  break L21;
                                } else {
                                  break L22;
                                }
                              } else {
                                break L21;
                              }
                            }
                          }
                          mj.field_l.a(12423, uj.b((byte) -120));
                          break L21;
                        }
                        L23: {
                          ea.field_a = false;
                          if (null != var6_ref) {
                            kb.a(uj.b((byte) -120), false, var6_ref);
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                        L24: {
                          L25: {
                            if (0 < tc.field_b) {
                              break L25;
                            } else {
                              if (jd.field_b) {
                                break L25;
                              } else {
                                try {
                                  L26: {
                                    Object discarded$10 = gm.a(-31183, "unzap", uj.b((byte) -120));
                                    decompiledRegionSelector0 = 0;
                                    break L26;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                                  decompiledCaughtException = decompiledCaughtParameter0;
                                  L27: {
                                    var8_ref_Throwable = decompiledCaughtException;
                                    if (var9 == 0) {
                                      decompiledRegionSelector0 = 0;
                                      break L27;
                                    } else {
                                      decompiledRegionSelector0 = 1;
                                      break L27;
                                    }
                                  }
                                }
                                if (decompiledRegionSelector0 == 0) {
                                  break L24;
                                } else {
                                  break L25;
                                }
                              }
                            }
                          }
                          try {
                            L28: {
                              Object discarded$11 = gm.a(true, "zap", new Object[1], uj.b((byte) -120));
                              break L28;
                            }
                          } catch (java.lang.Throwable decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            L29: {
                              var8_ref_Throwable = decompiledCaughtException;
                              break L29;
                            }
                          }
                          break L24;
                        }
                        L30: {
                          if (tc.field_b > 0) {
                            jc.field_b = true;
                            break L30;
                          } else {
                            break L30;
                          }
                        }
                        uk.field_b.b(og.field_n, 3777);
                        var8 = 0;
                        L31: while (true) {
                          L32: {
                            L33: {
                              if (4 <= var8) {
                                break L33;
                              } else {
                                og.field_n[var8] = og.field_n[var8] + 50;
                                var8++;
                                if (var9 != 0) {
                                  break L32;
                                } else {
                                  if (var9 == 0) {
                                    continue L31;
                                  } else {
                                    break L33;
                                  }
                                }
                              }
                            }
                            cd.field_t.b(og.field_n, 3777);
                            break L32;
                          }
                          stackOut_123_0 = ab.field_l;
                          stackIn_124_0 = stackOut_123_0;
                          return stackIn_124_0;
                        }
                      }
                    } else {
                      break L13;
                    }
                  }
                  L34: {
                    if (hf.field_l == dh.field_bb) {
                      if (!ce.a(-114)) {
                        break L34;
                      } else {
                        L35: {
                          th.a(114);
                          if (7 != ab.field_l) {
                            break L35;
                          } else {
                            if (ea.field_a) {
                              break L35;
                            } else {
                              ea.field_a = true;
                              stackOut_135_0 = -1;
                              stackIn_136_0 = stackOut_135_0;
                              return stackIn_136_0;
                            }
                          }
                        }
                        L36: {
                          if (ab.field_l == 7) {
                            ab.field_l = 3;
                            break L36;
                          } else {
                            break L36;
                          }
                        }
                        kk.field_Y = cd.field_t.g(2);
                        ea.field_a = false;
                        stackOut_141_0 = ab.field_l;
                        stackIn_142_0 = stackOut_141_0;
                        return stackIn_142_0;
                      }
                    } else {
                      break L34;
                    }
                  }
                  L37: {
                    if (null == p.field_d) {
                      if (!ea.field_a) {
                        var6_int = eg.field_v;
                        eg.field_v = sj.field_x;
                        sj.field_x = var6_int;
                        ea.field_a = true;
                        break L37;
                      } else {
                        L38: {
                          L39: {
                            if (30000L >= ed.b(-1)) {
                              break L39;
                            } else {
                              kk.field_Y = ee.field_c;
                              if (var9 == 0) {
                                break L38;
                              } else {
                                break L39;
                              }
                            }
                          }
                          kk.field_Y = dj.field_j;
                          break L38;
                        }
                        ea.field_a = false;
                        stackOut_155_0 = 3;
                        stackIn_156_0 = stackOut_155_0;
                        return stackIn_156_0;
                      }
                    } else {
                      break L37;
                    }
                  }
                  stackOut_158_0 = -1;
                  stackIn_159_0 = stackOut_158_0;
                  break L0;
                } else {
                  stackOut_57_0 = 87;
                  stackIn_58_0 = stackOut_57_0;
                  return stackIn_58_0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L40: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_160_0 = (RuntimeException) var6;
                stackOut_160_1 = new StringBuilder().append("vc.C(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
                stackIn_163_0 = stackOut_160_0;
                stackIn_163_1 = stackOut_160_1;
                stackIn_161_0 = stackOut_160_0;
                stackIn_161_1 = stackOut_160_1;
                if (param3 == null) {
                  stackOut_163_0 = (RuntimeException) (Object) stackIn_163_0;
                  stackOut_163_1 = (StringBuilder) (Object) stackIn_163_1;
                  stackOut_163_2 = "null";
                  stackIn_164_0 = stackOut_163_0;
                  stackIn_164_1 = stackOut_163_1;
                  stackIn_164_2 = stackOut_163_2;
                  break L40;
                } else {
                  stackOut_161_0 = (RuntimeException) (Object) stackIn_161_0;
                  stackOut_161_1 = (StringBuilder) (Object) stackIn_161_1;
                  stackOut_161_2 = "{...}";
                  stackIn_164_0 = stackOut_161_0;
                  stackIn_164_1 = stackOut_161_1;
                  stackIn_164_2 = stackOut_161_2;
                  break L40;
                }
              }
              L41: {
                stackOut_164_0 = (RuntimeException) (Object) stackIn_164_0;
                stackOut_164_1 = ((StringBuilder) (Object) stackIn_164_1).append(stackIn_164_2).append(44).append(param4).append(44);
                stackIn_167_0 = stackOut_164_0;
                stackIn_167_1 = stackOut_164_1;
                stackIn_165_0 = stackOut_164_0;
                stackIn_165_1 = stackOut_164_1;
                if (param5 == null) {
                  stackOut_167_0 = (RuntimeException) (Object) stackIn_167_0;
                  stackOut_167_1 = (StringBuilder) (Object) stackIn_167_1;
                  stackOut_167_2 = "null";
                  stackIn_168_0 = stackOut_167_0;
                  stackIn_168_1 = stackOut_167_1;
                  stackIn_168_2 = stackOut_167_2;
                  break L41;
                } else {
                  stackOut_165_0 = (RuntimeException) (Object) stackIn_165_0;
                  stackOut_165_1 = (StringBuilder) (Object) stackIn_165_1;
                  stackOut_165_2 = "{...}";
                  stackIn_168_0 = stackOut_165_0;
                  stackIn_168_1 = stackOut_165_1;
                  stackIn_168_2 = stackOut_165_2;
                  break L41;
                }
              }
              throw dd.a((Throwable) (Object) stackIn_168_0, stackIn_168_2 + 41);
            }
            return stackIn_159_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(byte[] param0, byte param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              ((vc) this).field_h[((vc) this).field_d] = (byte)ge.a((int) ((vc) this).field_h[((vc) this).field_d], 128 >>> vi.a(7, ((vc) this).field_e));
              ((vc) this).field_d = ((vc) this).field_d + 1;
              if (((vc) this).field_d <= 32) {
                break L1;
              } else {
                L2: while (true) {
                  L3: {
                    L4: {
                      if (((vc) this).field_d >= 64) {
                        break L4;
                      } else {
                        int fieldTemp$2 = ((vc) this).field_d;
                        ((vc) this).field_d = ((vc) this).field_d + 1;
                        ((vc) this).field_h[fieldTemp$2] = (byte) 0;
                        if (var8 != 0) {
                          break L3;
                        } else {
                          if (var8 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    this.a(false);
                    break L3;
                  }
                  ((vc) this).field_d = 0;
                  break L1;
                }
              }
            }
            L5: while (true) {
              L6: {
                L7: {
                  if (((vc) this).field_d >= 32) {
                    break L7;
                  } else {
                    int fieldTemp$3 = ((vc) this).field_d;
                    ((vc) this).field_d = ((vc) this).field_d + 1;
                    ((vc) this).field_h[fieldTemp$3] = (byte) 0;
                    if (var8 != 0) {
                      break L6;
                    } else {
                      if (var8 == 0) {
                        continue L5;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                mk.a(((vc) this).field_l, 0, ((vc) this).field_h, 32, 32);
                this.a(false);
                break L6;
              }
              if (param1 == 87) {
                var4_int = 0;
                var5 = param2;
                L8: while (true) {
                  L9: {
                    L10: {
                      if (var4_int >= 8) {
                        break L10;
                      } else {
                        var6 = ((vc) this).field_k[var4_int];
                        param0[var5] = (byte)(int)(var6 >>> 56);
                        param0[var5 + 1] = (byte)(int)(var6 >>> 48);
                        param0[2 + var5] = (byte)(int)(var6 >>> 40);
                        param0[3 + var5] = (byte)(int)(var6 >>> 32);
                        param0[4 + var5] = (byte)(int)(var6 >>> 24);
                        param0[5 + var5] = (byte)(int)(var6 >>> 16);
                        param0[var5 + 6] = (byte)(int)(var6 >>> 8);
                        param0[7 + var5] = (byte)(int)var6;
                        var5 += 8;
                        var4_int++;
                        if (var8 != 0) {
                          break L9;
                        } else {
                          if (var8 == 0) {
                            continue L8;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    break L9;
                  }
                  break L0;
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var4;
            stackOut_26_1 = new StringBuilder().append("vc.G(");
            stackIn_29_0 = stackOut_26_0;
            stackIn_29_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L11;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_30_0 = stackOut_27_0;
              stackIn_30_1 = stackOut_27_1;
              stackIn_30_2 = stackOut_27_2;
              break L11;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    vc() {
        ((vc) this).field_k = new long[8];
        ((vc) this).field_e = 0;
        ((vc) this).field_o = new long[8];
        ((vc) this).field_f = new long[8];
        ((vc) this).field_m = new long[8];
        ((vc) this).field_d = 0;
        ((vc) this).field_c = new long[8];
        ((vc) this).field_h = new byte[64];
        ((vc) this).field_l = new byte[32];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = false;
        field_j = 20000000L;
        field_n = "Reload game";
        field_i = "Back";
        field_b = "Password is valid";
    }
}
