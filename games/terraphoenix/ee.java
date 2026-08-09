/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ee {
    short[] field_L;
    short[] field_F;
    int[] field_c;
    short field_o;
    short[] field_J;
    short[] field_k;
    int[] field_q;
    short[] field_P;
    int field_K;
    short[] field_n;
    static String field_z;
    short field_m;
    int[] field_e;
    int field_v;
    int[] field_i;
    int field_a;
    static int field_h;
    short[] field_C;
    byte field_I;
    int field_t;
    int[] field_Q;
    short[] field_D;
    short[] field_j;
    static fa field_G;
    short[] field_y;
    short[] field_g;
    int[] field_w;
    private boolean field_H;
    int[] field_b;
    short[] field_A;
    int field_r;
    byte[] field_f;
    short[] field_x;
    short[] field_p;
    int field_M;
    short field_l;
    int[] field_O;
    int[] field_d;
    short[] field_s;
    short[] field_u;
    short[] field_B;
    static String field_N;
    short[] field_E;

    final void c(byte param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Terraphoenix.field_V;
        try {
          L0: {
            if (!this.field_H) {
              this.field_H = true;
              var2_int = 32767;
              var3 = 32767;
              if (param0 == 41) {
                var4 = 32767;
                var5 = -32768;
                var6 = -32768;
                var7 = -32768;
                var8 = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      if ((this.field_m ^ -1) >= (var8 ^ -1)) {
                        break L3;
                      } else {
                        var9 = this.field_D[var8];
                        var10 = this.field_B[var8];
                        if (var12 != 0) {
                          break L2;
                        } else {
                          L4: {
                            if (var9 > var5) {
                              var5 = var9;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          L5: {
                            if ((var2_int ^ -1) >= (var9 ^ -1)) {
                              break L5;
                            } else {
                              var2_int = var9;
                              break L5;
                            }
                          }
                          L6: {
                            if (var10 < var3) {
                              var3 = var10;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          L7: {
                            var11 = this.field_L[var8];
                            if ((var10 ^ -1) >= (var6 ^ -1)) {
                              break L7;
                            } else {
                              var6 = var10;
                              break L7;
                            }
                          }
                          L8: {
                            if (var7 < var11) {
                              var7 = var11;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          L9: {
                            if (var4 <= var11) {
                              break L9;
                            } else {
                              var4 = var11;
                              break L9;
                            }
                          }
                          var8++;
                          if (var12 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    this.field_r = var2_int;
                    this.field_M = var3;
                    this.field_t = var7;
                    this.field_v = var4;
                    this.field_K = var5;
                    this.field_a = var6;
                    break L2;
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var2), "ee.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    private final void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 < -100) {
                break L1;
              } else {
                ee.b((byte) -122);
                break L1;
              }
            }
            this.field_H = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var2), "ee.B(" + param0 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var6 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Terraphoenix.field_V;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.a(-69);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var6_int = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((var6_int ^ -1) <= (this.field_m ^ -1)) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        this.field_D[var6_int] = (short)(param4 * this.field_D[var6_int] / param3);
                        this.field_B[var6_int] = (short)(this.field_B[var6_int] * param1 / param3);
                        this.field_L[var6_int] = (short)(this.field_L[var6_int] * param2 / param3);
                        var6_int++;
                        if (var7 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var7 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        this.a(-112);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    var6 = (RuntimeException) ((Object) caughtException);
                    throw qk.a((Throwable) ((Object) var6), "ee.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = Terraphoenix.field_V;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (this.field_m <= var5_int) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        this.field_D[var5_int] = (short)(this.field_D[var5_int] + param2);
                        this.field_B[var5_int] = (short)(this.field_B[var5_int] + param3);
                        this.field_L[var5_int] = (short)(this.field_L[var5_int] + param1);
                        var5_int++;
                        if (var6 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 12;
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
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param0) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.field_H = true;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        this.a(-107);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw qk.a((Throwable) ((Object) runtimeException), "ee.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(byte param0, fa param1) {
        RuntimeException runtimeException = null;
        tl var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            tl.a(param1.a("headers.packvorbis", "", -21653));
            var2 = tl.a(param1, "jagex logo2.packvorbis", "");
            if (param0 == 51) {
              var2.a();
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (runtimeException);

            stackIn_7_1 = new StringBuilder().append("ee.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void b(byte param0) {
        try {
            field_G = null;
            field_N = null;
            field_z = null;
            if (param0 != 20) {
                field_h = -43;
            }
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "ee.G(" + param0 + ')');
        }
    }

    final static void a(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_12_0 = 0;
        boolean stackIn_49_0 = false;
        int stackIn_56_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_48_0;
        uc var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Object var3 = null;
        int var3_int = 0;
        int var4 = 0;
        String var4_ref_String = null;
        String var5 = null;
        q var5_ref = null;
        q var6 = null;
        String var6_ref = null;
        q var7 = null;
        String var7_ref = null;
        int var8 = 0;
        var8 = Terraphoenix.field_V;
        try {
          L0: {
            var1 = mk.field_j;
            var2 = var1.a(-16384);
            if (0 != var2) {
              if (-2 != (var2 ^ -1)) {
                if ((var2 ^ -1) == -3) {
                  L1: {
                    if (jg.field_gb != 1) {
                      break L1;
                    } else {
                      jg.field_gb = 2;
                      break L1;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (3 != var2) {
                    if (param0 >= 111) {
                      if (-5 != (var2 ^ -1)) {
                        bd.a((Throwable) null, "F1: " + r.i(-15465), 111);
                        gb.g(-17464);
                        decompiledRegionSelector0 = 6;
                        break L0;
                      } else {
                        jg.field_gb = 1;
                        var3 = var1.e(-1);
                        ml.field_t = ((String) (var3)).intern();
                        var4 = var1.a(-16384);
                        ve.a(2, var4);
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    L2: {
                      if (2 == jg.field_gb) {
                        jg.field_gb = 1;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } else {
                L3: {
                  if (gb.field_z != null) {
                    break L3;
                  } else {
                    gb.field_z = new vb(128);
                    gj.field_a = 0;
                    break L3;
                  }
                }
                L4: {
                  var3 = var1.e(-1);
                  if (!((String) (var3)).equals("")) {
                    break L4;
                  } else {
                    var3 = null;
                    break L4;
                  }
                }
                L5: {
                  var4_ref_String = var1.e(-1);
                  var5 = var1.e(-1);
                  var6 = dd.a((byte) 104, var4_ref_String);
                  if (var6 != null) {
                    break L5;
                  } else {
                    var6 = dd.a((byte) 104, var5);
                    if (null == var6) {
                      break L5;
                    } else {
                      gb.field_z.a(false, var6, (long)hm.a((byte) 92, (CharSequence) ((Object) var4_ref_String)).hashCode());
                      break L5;
                    }
                  }
                }
                L6: {
                  if (var6 != null) {
                    break L6;
                  } else {
                    var6 = new q();
                    gb.field_z.a(false, var6, (long)hm.a((byte) -121, (CharSequence) ((Object) var4_ref_String)).hashCode());
                    fieldTemp$0 = gj.field_a;
                    gj.field_a = gj.field_a + 1;
                    var6.field_Mb = fieldTemp$0;
                    sb.field_h.a(var6, -16611);
                    break L6;
                  }
                }
                L7: {
                  if (var3 != null) {
                    var3 = ((String) (var3)).intern();
                    break L7;
                  } else {
                    break L7;
                  }
                }
                var6.field_Eb = (String) (var3);
                var6.field_Lb = var4_ref_String;
                var6.b((byte) 12);
                var7 = (q) ((Object) sb.field_h.d(9272));
                L8: while (true) {
                  L9: {
                    L10: {
                      L11: {
                        L12: {
                          if (var7 == null) {
                            break L12;
                          } else {
                            stackOut_48_0 = ji.a((byte) -19, var6, var7);
                            stackIn_56_0 = stackOut_48_0 ? 1 : 0;
                            stackIn_49_0 = stackOut_48_0;
                            if (var8 != 0) {
                              break L11;
                            } else {
                              if (!stackIn_49_0) {
                                break L12;
                              } else {
                                var7 = (q) ((Object) sb.field_h.e((byte) -119));
                                if (var8 == 0) {
                                  continue L8;
                                } else {
                                  break L12;
                                }
                              }
                            }
                          }
                        }
                        if (null == var7) {
                          break L10;
                        } else {
                          stackIn_56_0 = 119;
                          break L11;
                        }
                      }
                      ha.a(stackIn_56_0, var7, var6);
                      if (var8 == 0) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                    sb.field_h.a(var6, -16611);
                    break L9;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              L13: {
                if (null == ai.field_f) {
                  ai.field_f = new vb(128);
                  cb.field_I = 0;
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                if (var1.a(-16384) != 1) {
                  stackIn_12_0 = 0;
                  break L14;
                } else {
                  stackIn_12_0 = 1;
                  break L14;
                }
              }
              L15: {
                var3_int = stackIn_12_0;
                var4_ref_String = var1.e(-1);
                if (var3_int == 0) {
                  break L15;
                } else {
                  var1.e(-1);
                  break L15;
                }
              }
              L16: {
                var5_ref = dm.a((byte) -85, var4_ref_String);
                var6_ref = var1.e(-1);
                var7_ref = hm.a((byte) 106, (CharSequence) ((Object) var4_ref_String));
                if (var7_ref != null) {
                  break L16;
                } else {
                  var7_ref = var4_ref_String;
                  break L16;
                }
              }
              L17: {
                if (null != var5_ref) {
                  break L17;
                } else {
                  var5_ref = dm.a((byte) -85, var6_ref);
                  if (var5_ref != null) {
                    ai.field_f.a(false, var5_ref, (long)var7_ref.hashCode());
                    break L17;
                  } else {
                    break L17;
                  }
                }
              }
              L18: {
                if (var5_ref == null) {
                  var5_ref = new q();
                  ai.field_f.a(false, var5_ref, (long)var7_ref.hashCode());
                  fieldTemp$1 = cb.field_I;
                  cb.field_I = cb.field_I + 1;
                  var5_ref.field_Mb = fieldTemp$1;
                  r.field_j.a(var5_ref, -16611);
                  break L18;
                } else {
                  break L18;
                }
              }
              var5_ref.field_Lb = var4_ref_String;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var1_ref), "ee.E(" + param0 + ')');
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
                  if (decompiledRegionSelector0 == 5) {
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        }
    }

    ee() {
        this.field_H = false;
        this.field_I = (byte) 0;
    }

    static {
        field_z = "Open help";
        field_N = "3000pts";
    }
}
