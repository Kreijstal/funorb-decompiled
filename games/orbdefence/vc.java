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
        int stackIn_12_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 >= 2) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        vc.b(101);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var5_int = 0;
                        var6 = 7 & 8 + -((int)param2 & 7);
                        var7 = 7 & this.field_e;
                        var9 = param2;
                        var11 = 31;
                        var12 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var11 < 0) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var12 = var12 + ((this.field_l[var11] & 255) - -(255 & (int)var9));
                        this.field_l[var11] = (byte)var12;
                        var12 = var12 >>> 8;
                        var9 = var9 >>> 8;
                        var11--;
                        if (var13 != 0) {
                            statePc = 26;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var13 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((param2 ^ -1L) >= -9L) {
                            statePc = 26;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var8 = 255 & param1[var5_int] << var6 | (255 & param1[var5_int - -1]) >>> -var6 + 8;
                        stackIn_27_0 = var8;
                        stackIn_12_0 = stackIn_27_0;
                        if (var13 != 0) {
                            statePc = 27;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (stackIn_12_0 < 0) {
                            statePc = 20;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (-257 >= (var8 ^ -1)) {
                            statePc = 20;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw new RuntimeException("LOGIC ERROR");
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        this.field_h[this.field_d] = (byte)ge.a((int) this.field_h[this.field_d], var8 >>> var7);
                        this.field_d = this.field_d + 1;
                        this.field_e = this.field_e + (8 + -var7);
                        if ((this.field_e ^ -1) == -513) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        this.a(false);
                        this.field_e = 0;
                        this.field_d = 0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        this.field_h[this.field_d] = (byte)vi.a(var8 << 8 + -var7, 255);
                        param2 = param2 - 8L;
                        var5_int++;
                        this.field_e = this.field_e + var7;
                        if (var13 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackIn_27_0 = (param2 < 0L ? -1 : (param2 == 0L ? 0 : 1));
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (stackIn_27_0 <= 0) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var8 = 255 & param1[var5_int] << var6;
                        this.field_h[this.field_d] = (byte)ge.a((int) this.field_h[this.field_d], var8 >>> var7);
                        if (var13 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var8 = 0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if ((param2 + (long)var7 ^ -1L) > -9L) {
                            statePc = 35;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        this.field_d = this.field_d + 1;
                        param2 = param2 - (long)(-var7 + 8);
                        this.field_e = this.field_e + (-var7 + 8);
                        if (this.field_e != 512) {
                            statePc = 34;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        this.a(false);
                        this.field_e = 0;
                        this.field_d = 0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        this.field_h[this.field_d] = (byte)vi.a(var8 << 8 + -var7, 255);
                        this.field_e = this.field_e + (int)param2;
                        if (var13 == 0) {
                            statePc = 43;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        this.field_e = (int)((long)this.field_e + param2);
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 38: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_41_0 = (RuntimeException) (var5);
                    stackIn_39_0 = stackIn_41_0;
                    stackIn_41_1 = new StringBuilder().append("vc.A(").append(param0).append(',');
                    stackIn_39_1 = stackIn_41_1;
                    if (param1 == null) {
                        statePc = 41;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    stackIn_42_0 = (RuntimeException) ((Object) stackIn_39_0);
                    stackIn_42_1 = (StringBuilder) ((Object) stackIn_39_1);
                    stackIn_42_2 = "{...}";
                    statePc = 42;
                    continue stateLoop;
                }
                case 41: {
                    stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
                    stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
                    stackIn_42_2 = "null";
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    throw dd.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ',' + param2 + ')');
                }
                case 43: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void b(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_12_0 = 0;
        ti stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        ti stackIn_59_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        se var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4_int = 0;
        Object var4 = null;
        String var5_ref_String = null;
        int var5 = 0;
        ti var6 = null;
        String var6_ref = null;
        String var7 = null;
        ti var7_ref = null;
        String var8 = null;
        ti var8_ref = null;
        int var9 = 0;
        var9 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var3 = 50 / ((23 - param0) / 46);
            var1 = cd.field_t;
            var2 = var1.b((byte) 90);
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
                if (1 != var1.b((byte) 90)) {
                  stackIn_12_0 = 0;
                  break L2;
                } else {
                  stackIn_12_0 = 1;
                  break L2;
                }
              }
              L3: {
                var4_int = stackIn_12_0;
                var5_ref_String = var1.g(2);
                if (var4_int == 0) {
                  break L3;
                } else {
                  var1.g(2);
                  break L3;
                }
              }
              L4: {
                var6 = tg.a(var5_ref_String, 256);
                var7 = var1.g(2);
                var8 = ua.a(-74, (CharSequence) ((Object) var5_ref_String));
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
                    qb.field_a.a(-1, var6, (long)var8.hashCode());
                    break L5;
                  }
                }
              }
              L6: {
                if (var6 == null) {
                  var6 = new ti();
                  qb.field_a.a(-1, var6, (long)var8.hashCode());
                  fieldTemp$0 = rl.field_e;
                  rl.field_e = rl.field_e + 1;
                  var6.field_ab = fieldTemp$0;
                  ii.field_c.a(-109, var6);
                  break L6;
                } else {
                  break L6;
                }
              }
              var6.field_db = var5_ref_String;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-2 == (var2 ^ -1)) {
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
                  var4 = var1.g(2);
                  if (!((String) (var4)).equals("")) {
                    break L8;
                  } else {
                    var4 = null;
                    break L8;
                  }
                }
                L9: {
                  var5_ref_String = var1.g(2);
                  var6_ref = var1.g(2);
                  var7_ref = gi.a(var5_ref_String, -52);
                  if (null != var7_ref) {
                    break L9;
                  } else {
                    var7_ref = gi.a(var6_ref, -71);
                    if (null == var7_ref) {
                      break L9;
                    } else {
                      ge.field_c.a(-1, var7_ref, (long)ua.a(-92, (CharSequence) ((Object) var5_ref_String)).hashCode());
                      break L9;
                    }
                  }
                }
                L10: {
                  if (null == var7_ref) {
                    var7_ref = new ti();
                    ge.field_c.a(-1, var7_ref, (long)ua.a(-94, (CharSequence) ((Object) var5_ref_String)).hashCode());
                    fieldTemp$1 = tl.field_a;
                    tl.field_a = tl.field_a + 1;
                    var7_ref.field_ab = fieldTemp$1;
                    lf.field_b.a(-107, var7_ref);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (var4 == null) {
                    break L11;
                  } else {
                    var4 = ((String) (var4)).intern();
                    break L11;
                  }
                }
                var7_ref.field_Z = (String) (var4);
                var7_ref.field_db = var5_ref_String;
                var7_ref.b(57);
                var8_ref = (ti) ((Object) lf.field_b.b((byte) 126));
                L12: while (true) {
                  L13: {
                    L14: {
                      L15: {
                        if (var8_ref == null) {
                          break L15;
                        } else {
                          stackIn_59_0 = (ti) (var7_ref);

                          stackIn_59_1 = 100;

                          stackIn_59_2 = (ti) (var8_ref);

                          if (var9 != 0) {
                            break L14;
                          } else {
                            if (!oj.a(stackIn_59_0, stackIn_59_1, stackIn_59_2)) {
                              break L15;
                            } else {
                              var8_ref = (ti) ((Object) lf.field_b.d(853));
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
                          lf.field_b.a(-96, var7_ref);
                          if (var9 == 0) {
                            break L13;
                          } else {
                            break L16;
                          }
                        }
                      }
                      stackIn_59_0 = (ti) (var7_ref);
                      stackIn_59_1 = -65;
                      stackIn_59_2 = (ti) (var8_ref);
                      break L14;
                    }
                    vk.a(stackIn_59_0, (byte) stackIn_59_1, stackIn_59_2);
                    break L13;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                if (var2 != 2) {
                  if (3 != var2) {
                    if (4 == var2) {
                      ob.field_H = 1;
                      var4 = var1.g(2);
                      uc.field_r = ((String) (var4)).intern();
                      var5 = var1.b((byte) 90);
                      lb.a(true, var5);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      pe.a((byte) -13, (Throwable) null, "F1: " + sj.b(true));
                      th.a(113);
                      decompiledRegionSelector0 = 5;
                      break L0;
                    }
                  } else {
                    L17: {
                      if (-3 != (ob.field_H ^ -1)) {
                        break L17;
                      } else {
                        ob.field_H = 1;
                        break L17;
                      }
                    }
                    decompiledRegionSelector0 = 3;
                    break L0;
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
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var1_ref), "vc.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    final void a(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var2_int >= 32) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        this.field_l[var2_int] = (byte) 0;
                        var2_int++;
                        if (var4 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var3 = -126 / ((param0 - 59) / 36);
                        this.field_h[0] = (byte) 0;
                        this.field_e = 0;
                        this.field_d = 0;
                        var2_int = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((var2_int ^ -1) <= -9) {
                            statePc = 12;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        this.field_k[var2_int] = 0L;
                        var2_int++;
                        if (var4 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var4 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw dd.a((Throwable) ((Object) runtimeException), "vc.F(" + param0 + ')');
                }
                case 12: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              field_i = null;
              field_g = null;
              if (param0 > 68) {
                break L1;
              } else {
                field_b = (String) null;
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
          throw dd.a((Throwable) ((Object) var1), "vc.D(" + param0 + ')');
        }
    }

    private final void a(boolean param0) {
        long dupTemp$0 = 0L;
        long arrayValue$1 = 0L;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_61_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = 0;
                        var3 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (8 <= var2_int) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        this.field_m[var2_int] = j.a(j.a(j.a(bm.a((long)this.field_h[var3 - -5], 255L) << 2051365776, j.a(j.a(bm.a(255L, (long)this.field_h[3 + var3]) << -425352800, j.a(j.a(bm.a((long)this.field_h[1 + var3] << -378821776, 71776119061217280L), (long)this.field_h[var3] << -1378952264), bm.a(280375465082880L, (long)this.field_h[var3 - -2] << 565649832))), bm.a((long)this.field_h[var3 + 4], 255L) << 202782232)), bm.a((long)this.field_h[6 + var3], 255L) << 2010794632), bm.a((long)this.field_h[7 + var3], 255L));
                        var3 += 8;
                        var2_int++;
                        if (var6 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var6 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (!param0) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        vc.a((byte) -46);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var2_int = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (-9 >= (var2_int ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        dupTemp$0 = this.field_k[var2_int];
                        arrayValue$1 = this.field_m[var2_int];
                        this.field_o[var2_int] = dupTemp$0;
                        this.field_c[var2_int] = j.a(arrayValue$1, dupTemp$0);
                        var2_int++;
                        if (var6 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var6 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var2_int = 1;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if ((var2_int ^ -1) < -11) {
                            statePc = 60;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_61_0 = 0;
                        stackIn_19_0 = stackIn_61_0;
                        if (var6 != 0) {
                            statePc = 61;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_21_0 = stackIn_19_0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var3 = stackIn_21_0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (-9 >= (var3 ^ -1)) {
                            statePc = 32;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        this.field_f[var3] = 0L;
                        var4 = 0;
                        stackIn_33_0 = 56;
                        stackIn_24_0 = stackIn_33_0;
                        if (var6 != 0) {
                            statePc = 33;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var5 = stackIn_24_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if ((var4 ^ -1) <= -9) {
                            statePc = 30;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        this.field_f[var3] = j.a(this.field_f[var3], nd.field_c[var4][vi.a((int)(this.field_o[vi.a(-var4 + var3, 7)] >>> var5), 255)]);
                        var4++;
                        var5 -= 8;
                        if (var6 != 0) {
                            statePc = 31;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var6 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var3++;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (var6 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackIn_33_0 = 0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var3 = stackIn_33_0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (-9 >= (var3 ^ -1)) {
                            statePc = 39;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        this.field_o[var3] = this.field_f[var3];
                        var3++;
                        if (var6 != 0) {
                            statePc = 40;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var6 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        this.field_o[0] = j.a(this.field_o[0], nd.field_d[var2_int]);
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var3 = 0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if ((var3 ^ -1) <= -9) {
                            statePc = 51;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        this.field_f[var3] = this.field_o[var3];
                        var4 = 0;
                        stackIn_52_0 = 56;
                        stackIn_43_0 = stackIn_52_0;
                        if (var6 != 0) {
                            statePc = 52;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var5 = stackIn_43_0;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var4 >= 8) {
                            statePc = 49;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        this.field_f[var3] = j.a(this.field_f[var3], nd.field_c[var4][vi.a((int)(this.field_c[vi.a(var3 + -var4, 7)] >>> var5), 255)]);
                        var5 -= 8;
                        var4++;
                        if (var6 != 0) {
                            statePc = 50;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var6 == 0) {
                            statePc = 44;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var3++;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (var6 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackIn_52_0 = 0;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var3 = stackIn_52_0;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if ((var3 ^ -1) <= -9) {
                            statePc = 58;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        this.field_c[var3] = this.field_f[var3];
                        var3++;
                        if (var6 != 0) {
                            statePc = 59;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (var6 == 0) {
                            statePc = 53;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var2_int++;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (var6 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        stackIn_61_0 = 0;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var2_int = stackIn_61_0;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (8 <= var2_int) {
                            statePc = 69;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        this.field_k[var2_int] = j.a(this.field_k[var2_int], j.a(this.field_c[var2_int], this.field_m[var2_int]));
                        var2_int++;
                        if (var6 != 0) {
                            statePc = 69;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (var6 == 0) {
                            statePc = 62;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 68: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw dd.a((Throwable) ((Object) var2), "vc.B(" + param0 + ')');
                }
                case 69: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int a(boolean param0, int param1, int param2, String param3, boolean param4, String param5) {
        try {
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
            int decompiledRegionSelector1 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            int var6_int = 0;
            String var6 = null;
            RuntimeException var6_ref = null;
            int var7 = 0;
            int var8 = 0;
            Throwable var8_ref_Throwable = null;
            int var9 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = OrbDefence.field_D ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (null == p.field_d) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var6_int = fg.a(param4, -66) ? 1 : 0;
                            if (var6_int == 0) {
                                statePc = 7;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            stackIn_8_0 = -1;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        return stackIn_8_0;
                    }
                    case 9: {
                        try {
                            if (dh.field_bb != sk.field_E) {
                                statePc = 19;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (param4) {
                                statePc = 16;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            s.field_A = sj.a(true, param3, false, param5);
                            if (var9 == 0) {
                                statePc = 18;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            s.field_A = f.a(false, p.field_c, (String) null, 17470, param5);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            uk.field_b.field_i = 0;
                            uk.field_b.a(14, -111);
                            uk.field_b.a(s.field_A.a(10277).field_c, -53);
                            bh.a(-1, -1);
                            dh.field_bb = nh.field_c;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (nh.field_c == dh.field_bb) {
                                statePc = 22;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (!va.a(true, 1)) {
                                statePc = 30;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var6_int = cd.field_t.b((byte) 90);
                            if (0 != var6_int) {
                                statePc = 27;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            dh.field_bb = wh.field_c;
                            if (var9 == 0) {
                                statePc = 29;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            ab.field_l = var6_int;
                            tf.field_c = -1;
                            dh.field_bb = hf.field_l;
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            cd.field_t.field_i = 0;
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (wh.field_c == dh.field_bb) {
                                statePc = 33;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (va.a(true, 8)) {
                                statePc = 36;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            tg.field_a = cd.field_t.c((byte) -89);
                            cd.field_t.field_i = 0;
                            lg.a(3, param1, s.field_A, param4, param0);
                            dh.field_bb = da.field_m;
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (da.field_m != dh.field_bb) {
                                statePc = 56;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (!va.a(true, 1)) {
                                statePc = 56;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            var6_int = cd.field_t.b((byte) 90);
                            cd.field_t.field_i = 0;
                            ug.field_r = null;
                            ab.field_l = var6_int;
                            if ((var6_int ^ -1) == -1) {
                                statePc = 45;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if (var6_int != 1) {
                                statePc = 48;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            dh.field_bb = lm.field_e;
                            tf.field_c = -1;
                            if (var9 == 0) {
                                statePc = 56;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if (-9 == (var6_int ^ -1)) {
                                statePc = 54;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            dh.field_bb = hf.field_l;
                            tf.field_c = -1;
                            if (var9 == 0) {
                                statePc = 56;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            th.a(127);
                            ea.field_a = false;
                            stackIn_55_0 = var6_int;
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        return stackIn_55_0;
                    }
                    case 56: {
                        try {
                            if (param2 < -18) {
                                statePc = 59;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            stackIn_58_0 = 87;
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        return stackIn_58_0;
                    }
                    case 59: {
                        try {
                            if (dh.field_bb == lm.field_e) {
                                statePc = 62;
                            } else {
                                statePc = 60;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            statePc = 125;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            if (!ce.a(-60)) {
                                statePc = 125;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            p.field_c = cd.field_t.c((byte) -89);
                            va.field_d = cd.field_t.b((byte) 90);
                            cd.field_t.b((byte) 90);
                            tc.field_b = cd.field_t.j(98203176);
                            var6 = cd.field_t.i(-1);
                            var7 = cd.field_t.b((byte) 90);
                            if (-1 != (var7 & 1 ^ -1)) {
                                statePc = 66;
                            } else {
                                statePc = 64;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            gd.a((byte) 124);
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            if (!param4) {
                                statePc = 70;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            if ((8 & var7) == 0) {
                                statePc = 73;
                            } else {
                                statePc = 71;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            stackIn_74_0 = 1;
                            statePc = 74;
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            stackIn_74_0 = 0;
                            statePc = 74;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            pc.field_Z = stackIn_74_0 != 0;
                            if ((4 & var7 ^ -1) == -1) {
                                statePc = 77;
                            } else {
                                statePc = 75;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            stackIn_78_0 = 1;
                            statePc = 78;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            stackIn_78_0 = 0;
                            statePc = 78;
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            jd.field_b = stackIn_78_0 != 0;
                            if (pc.field_Z) {
                                statePc = 79;
                            } else {
                                statePc = 79;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            if (mg.field_g) {
                                statePc = 82;
                            } else {
                                statePc = 80;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            statePc = 88;
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            cd.field_t.b((byte) 90);
                            cd.field_t.b((byte) 90);
                            cd.field_t.l(0);
                            cf.field_c = cd.field_t.j(98203176);
                            ij.field_h = new byte[cf.field_c];
                            var8 = 0;
                            statePc = 83;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            if ((cf.field_c ^ -1) >= (var8 ^ -1)) {
                                statePc = 88;
                            } else {
                                statePc = 84;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            ij.field_h[var8] = cd.field_t.d(-20398);
                            var8++;
                            if (var9 != 0) {
                                statePc = 89;
                            } else {
                                statePc = 85;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            if (var9 == 0) {
                                statePc = 83;
                            } else {
                                statePc = 86;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            statePc = 88;
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            gb.field_h = cd.field_t.g(2);
                            sg.field_E = ua.a(90, (CharSequence) ((Object) gb.field_h));
                            cb.field_j = cd.field_t.b((byte) 90);
                            dh.field_bb = da.field_r;
                            statePc = 89;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            if (s.field_A.a(10277) == ci.field_b) {
                                statePc = 96;
                            } else {
                                statePc = 90;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            if (s.field_A.a(10277) == oj.field_j) {
                                statePc = 95;
                            } else {
                                statePc = 91;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            statePc = 93;
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            statePc = 98;
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            vh.field_s.a(12423, uj.b((byte) -120));
                            if (var9 == 0) {
                                statePc = 98;
                            } else {
                                statePc = 96;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            mj.field_l.a(12423, uj.b((byte) -120));
                            statePc = 98;
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            ea.field_a = false;
                            if (null != var6) {
                                statePc = 101;
                            } else {
                                statePc = 99;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            statePc = 102;
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            kb.a(uj.b((byte) -120), false, var6);
                            statePc = 102;
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            if (0 < tc.field_b) {
                                statePc = 109;
                            } else {
                                statePc = 103;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            if (jd.field_b) {
                                statePc = 109;
                            } else {
                                statePc = 104;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            gm.a(-31183, "unzap", uj.b((byte) -120));
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            var8_ref_Throwable = caughtException;
                            if (var9 == 0) {
                                statePc = 112;
                            } else {
                                statePc = 109;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        try {
                            gm.a(true, "zap", new Object[]{jj.a(14461, p.field_c)}, uj.b((byte) -120));
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_109) {
                            caughtException = stateCaught_109;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 110: {
                        try {
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_110) {
                            caughtException = stateCaught_110;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 111: {
                        try {
                            var8_ref_Throwable = caughtException;
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_111) {
                            caughtException = stateCaught_111;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 112: {
                        try {
                            if ((tc.field_b ^ -1) < -1) {
                                statePc = 115;
                            } else {
                                statePc = 113;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_112) {
                            caughtException = stateCaught_112;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 113: {
                        try {
                            statePc = 116;
                            continue stateLoop;
                        } catch (Throwable stateCaught_113) {
                            caughtException = stateCaught_113;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 115: {
                        try {
                            jc.field_b = true;
                            statePc = 116;
                            continue stateLoop;
                        } catch (Throwable stateCaught_115) {
                            caughtException = stateCaught_115;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 116: {
                        try {
                            uk.field_b.b(og.field_n, 3777);
                            var8 = 0;
                            statePc = 117;
                            continue stateLoop;
                        } catch (Throwable stateCaught_116) {
                            caughtException = stateCaught_116;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 117: {
                        try {
                            if (4 <= var8) {
                                statePc = 122;
                            } else {
                                statePc = 118;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_117) {
                            caughtException = stateCaught_117;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 118: {
                        try {
                            og.field_n[var8] = og.field_n[var8] + 50;
                            var8++;
                            if (var9 != 0) {
                                statePc = 123;
                            } else {
                                statePc = 119;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_118) {
                            caughtException = stateCaught_118;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 119: {
                        try {
                            if (var9 == 0) {
                                statePc = 117;
                            } else {
                                statePc = 120;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_119) {
                            caughtException = stateCaught_119;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 120: {
                        try {
                            statePc = 122;
                            continue stateLoop;
                        } catch (Throwable stateCaught_120) {
                            caughtException = stateCaught_120;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 122: {
                        try {
                            cd.field_t.b(og.field_n, 3777);
                            statePc = 123;
                            continue stateLoop;
                        } catch (Throwable stateCaught_122) {
                            caughtException = stateCaught_122;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 123: {
                        try {
                            stackIn_124_0 = ab.field_l;
                            statePc = 124;
                            continue stateLoop;
                        } catch (Throwable stateCaught_123) {
                            caughtException = stateCaught_123;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 124: {
                        return stackIn_124_0;
                    }
                    case 125: {
                        try {
                            if (hf.field_l == dh.field_bb) {
                                statePc = 128;
                            } else {
                                statePc = 126;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_125) {
                            caughtException = stateCaught_125;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 126: {
                        try {
                            statePc = 143;
                            continue stateLoop;
                        } catch (Throwable stateCaught_126) {
                            caughtException = stateCaught_126;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 128: {
                        try {
                            if (!ce.a(-114)) {
                                statePc = 143;
                            } else {
                                statePc = 129;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_128) {
                            caughtException = stateCaught_128;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 129: {
                        try {
                            th.a(114);
                            if (7 != ab.field_l) {
                                statePc = 137;
                            } else {
                                statePc = 130;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_129) {
                            caughtException = stateCaught_129;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 130: {
                        try {
                            statePc = 132;
                            continue stateLoop;
                        } catch (Throwable stateCaught_130) {
                            caughtException = stateCaught_130;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 132: {
                        try {
                            if (ea.field_a) {
                                statePc = 137;
                            } else {
                                statePc = 133;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_132) {
                            caughtException = stateCaught_132;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 133: {
                        try {
                            statePc = 135;
                            continue stateLoop;
                        } catch (Throwable stateCaught_133) {
                            caughtException = stateCaught_133;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 135: {
                        try {
                            ea.field_a = true;
                            stackIn_136_0 = -1;
                            statePc = 136;
                            continue stateLoop;
                        } catch (Throwable stateCaught_135) {
                            caughtException = stateCaught_135;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 136: {
                        return stackIn_136_0;
                    }
                    case 137: {
                        try {
                            if (-8 == (ab.field_l ^ -1)) {
                                statePc = 140;
                            } else {
                                statePc = 138;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_137) {
                            caughtException = stateCaught_137;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 138: {
                        try {
                            statePc = 141;
                            continue stateLoop;
                        } catch (Throwable stateCaught_138) {
                            caughtException = stateCaught_138;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 140: {
                        try {
                            ab.field_l = 3;
                            statePc = 141;
                            continue stateLoop;
                        } catch (Throwable stateCaught_140) {
                            caughtException = stateCaught_140;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 141: {
                        try {
                            kk.field_Y = cd.field_t.g(2);
                            ea.field_a = false;
                            stackIn_142_0 = ab.field_l;
                            statePc = 142;
                            continue stateLoop;
                        } catch (Throwable stateCaught_141) {
                            caughtException = stateCaught_141;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 142: {
                        return stackIn_142_0;
                    }
                    case 143: {
                        try {
                            if (null == p.field_d) {
                                statePc = 146;
                            } else {
                                statePc = 144;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_143) {
                            caughtException = stateCaught_143;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 144: {
                        try {
                            statePc = 158;
                            continue stateLoop;
                        } catch (Throwable stateCaught_144) {
                            caughtException = stateCaught_144;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 146: {
                        try {
                            if (!ea.field_a) {
                                statePc = 157;
                            } else {
                                statePc = 147;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_146) {
                            caughtException = stateCaught_146;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 147: {
                        try {
                            if (30000L >= ed.b(-1)) {
                                statePc = 153;
                            } else {
                                statePc = 148;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_147) {
                            caughtException = stateCaught_147;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 148: {
                        try {
                            statePc = 150;
                            continue stateLoop;
                        } catch (Throwable stateCaught_148) {
                            caughtException = stateCaught_148;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 150: {
                        try {
                            kk.field_Y = ee.field_c;
                            if (var9 == 0) {
                                statePc = 155;
                            } else {
                                statePc = 151;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_150) {
                            caughtException = stateCaught_150;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 151: {
                        try {
                            statePc = 153;
                            continue stateLoop;
                        } catch (Throwable stateCaught_151) {
                            caughtException = stateCaught_151;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 153: {
                        try {
                            kk.field_Y = dj.field_j;
                            statePc = 155;
                            continue stateLoop;
                        } catch (Throwable stateCaught_153) {
                            caughtException = stateCaught_153;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 155: {
                        try {
                            ea.field_a = false;
                            stackIn_156_0 = 3;
                            statePc = 156;
                            continue stateLoop;
                        } catch (Throwable stateCaught_155) {
                            caughtException = stateCaught_155;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 156: {
                        return stackIn_156_0;
                    }
                    case 157: {
                        try {
                            var6_int = eg.field_v;
                            eg.field_v = sj.field_x;
                            sj.field_x = var6_int;
                            ea.field_a = true;
                            statePc = 158;
                            continue stateLoop;
                        } catch (Throwable stateCaught_157) {
                            caughtException = stateCaught_157;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 158: {
                        try {
                            stackIn_159_0 = -1;
                            statePc = 159;
                            continue stateLoop;
                        } catch (Throwable stateCaught_158) {
                            caughtException = stateCaught_158;
                            statePc = 160;
                            continue stateLoop;
                        }
                    }
                    case 159: {
                        return stackIn_159_0;
                    }
                    case 160: {
                        var6_ref = (RuntimeException) ((Object) caughtException);
                        stackIn_163_0 = (RuntimeException) (var6_ref);
                        stackIn_161_0 = stackIn_163_0;
                        stackIn_163_1 = new StringBuilder().append("vc.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                        stackIn_161_1 = stackIn_163_1;
                        if (param3 == null) {
                            statePc = 163;
                        } else {
                            statePc = 161;
                        }
                        continue stateLoop;
                    }
                    case 161: {
                        stackIn_164_0 = (RuntimeException) ((Object) stackIn_161_0);
                        stackIn_164_1 = (StringBuilder) ((Object) stackIn_161_1);
                        stackIn_164_2 = "{...}";
                        statePc = 164;
                        continue stateLoop;
                    }
                    case 163: {
                        stackIn_164_0 = (RuntimeException) ((Object) stackIn_163_0);
                        stackIn_164_1 = (StringBuilder) ((Object) stackIn_163_1);
                        stackIn_164_2 = "null";
                        statePc = 164;
                        continue stateLoop;
                    }
                    case 164: {
                        stackIn_167_0 = (RuntimeException) ((Object) stackIn_164_0);
                        stackIn_165_0 = stackIn_167_0;
                        stackIn_167_1 = ((StringBuilder) (Object) stackIn_164_1).append(stackIn_164_2).append(',').append(param4).append(',');
                        stackIn_165_1 = stackIn_167_1;
                        if (param5 == null) {
                            statePc = 167;
                        } else {
                            statePc = 165;
                        }
                        continue stateLoop;
                    }
                    case 165: {
                        stackIn_168_0 = (RuntimeException) ((Object) stackIn_165_0);
                        stackIn_168_1 = (StringBuilder) ((Object) stackIn_165_1);
                        stackIn_168_2 = "{...}";
                        statePc = 168;
                        continue stateLoop;
                    }
                    case 167: {
                        stackIn_168_0 = (RuntimeException) ((Object) stackIn_167_0);
                        stackIn_168_1 = (StringBuilder) ((Object) stackIn_167_1);
                        stackIn_168_2 = "null";
                        statePc = 168;
                        continue stateLoop;
                    }
                    case 168: {
                        throw dd.a((Throwable) ((Object) stackIn_168_0), stackIn_168_2 + ')');
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(byte[] param0, byte param1, int param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_h[this.field_d] = (byte)ge.a((int) this.field_h[this.field_d], 128 >>> vi.a(7, this.field_e));
                        this.field_d = this.field_d + 1;
                        if ((this.field_d ^ -1) >= -33) {
                            statePc = 11;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (this.field_d >= 64) {
                            statePc = 9;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        fieldTemp$0 = this.field_d;
                        this.field_d = this.field_d + 1;
                        this.field_h[fieldTemp$0] = (byte) 0;
                        if (var8 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var8 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        this.a(false);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        this.field_d = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (-33 >= (this.field_d ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        fieldTemp$1 = this.field_d;
                        this.field_d = this.field_d + 1;
                        this.field_h[fieldTemp$1] = (byte) 0;
                        if (var8 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var8 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        mk.a(this.field_l, 0, this.field_h, 32, 32);
                        this.a(false);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (param1 == 87) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 18: {
                    return;
                }
                case 19: {
                    try {
                        var4_int = 0;
                        var5 = param2;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var4_int >= 8) {
                            statePc = 31;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var6 = this.field_k[var4_int];
                        param0[var5] = (byte)(int)(var6 >>> -933256776);
                        param0[var5 + 1] = (byte)(int)(var6 >>> 1274928624);
                        param0[2 + var5] = (byte)(int)(var6 >>> -1748756696);
                        param0[3 + var5] = (byte)(int)(var6 >>> -1833203296);
                        param0[4 + var5] = (byte)(int)(var6 >>> 1717101592);
                        param0[5 + var5] = (byte)(int)(var6 >>> 814108304);
                        param0[var5 + 6] = (byte)(int)(var6 >>> -795935224);
                        param0[7 + var5] = (byte)(int)var6;
                        var5 += 8;
                        var4_int++;
                        if (var8 != 0) {
                            statePc = 31;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var8 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_29_0 = (RuntimeException) (var4);
                    stackIn_27_0 = stackIn_29_0;
                    stackIn_29_1 = new StringBuilder().append("vc.G(");
                    stackIn_27_1 = stackIn_29_1;
                    if (param0 == null) {
                        statePc = 29;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    stackIn_30_0 = (RuntimeException) ((Object) stackIn_27_0);
                    stackIn_30_1 = (StringBuilder) ((Object) stackIn_27_1);
                    stackIn_30_2 = "{...}";
                    statePc = 30;
                    continue stateLoop;
                }
                case 29: {
                    stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
                    stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
                    stackIn_30_2 = "null";
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    throw dd.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ',' + param2 + ')');
                }
                case 31: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    vc() {
        this.field_k = new long[8];
        this.field_e = 0;
        this.field_o = new long[8];
        this.field_f = new long[8];
        this.field_m = new long[8];
        this.field_d = 0;
        this.field_c = new long[8];
        this.field_h = new byte[64];
        this.field_l = new byte[32];
    }

    static {
        field_a = false;
        field_j = 20000000L;
        field_n = "Reload game";
        field_i = "Back";
        field_b = "Password is valid";
    }
}
