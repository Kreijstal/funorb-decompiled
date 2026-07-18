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
        RuntimeException var2 = null;
        int var2_int = 0;
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
        RuntimeException decompiledCaughtException = null;
        var12 = Terraphoenix.field_V;
        try {
          L0: {
            if (!((ee) this).field_H) {
              ((ee) this).field_H = true;
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
                      if (~((ee) this).field_m >= ~var8) {
                        break L3;
                      } else {
                        var9 = ((ee) this).field_D[var8];
                        var10 = ((ee) this).field_B[var8];
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
                            if (~var2_int >= ~var9) {
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
                            var11 = ((ee) this).field_L[var8];
                            if (~var10 >= ~var6) {
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
                    ((ee) this).field_r = var2_int;
                    ((ee) this).field_M = var3;
                    ((ee) this).field_t = var7;
                    ((ee) this).field_v = var4;
                    ((ee) this).field_K = var5;
                    ((ee) this).field_a = var6;
                    break L2;
                  }
                  break L0;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var2, "ee.C(" + param0 + ')');
        }
    }

    private final void a(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
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
            ((ee) this).field_H = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var2, "ee.B(" + param0 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                this.a(-69);
                break L1;
              }
            }
            var6_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (~var6_int <= ~((ee) this).field_m) {
                    break L4;
                  } else {
                    ((ee) this).field_D[var6_int] = (short)(param4 * ((ee) this).field_D[var6_int] / param3);
                    ((ee) this).field_B[var6_int] = (short)(((ee) this).field_B[var6_int] * param1 / param3);
                    ((ee) this).field_L[var6_int] = (short)(((ee) this).field_L[var6_int] * param2 / param3);
                    var6_int++;
                    if (var7 != 0) {
                      break L3;
                    } else {
                      if (var7 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                this.a(-112);
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var6, "ee.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = Terraphoenix.field_V;
        try {
          L0: {
            var5_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (((ee) this).field_m <= var5_int) {
                    break L3;
                  } else {
                    ((ee) this).field_D[var5_int] = (short)(((ee) this).field_D[var5_int] + param2);
                    ((ee) this).field_B[var5_int] = (short)(((ee) this).field_B[var5_int] + param3);
                    ((ee) this).field_L[var5_int] = (short)(((ee) this).field_L[var5_int] + param1);
                    var5_int++;
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
                L4: {
                  if (param0) {
                    break L4;
                  } else {
                    ((ee) this).field_H = true;
                    break L4;
                  }
                }
                this.a(-107);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qk.a((Throwable) (Object) runtimeException, "ee.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(byte param0, fa param1) {
        RuntimeException runtimeException = null;
        tl var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            tl.a(param1.a("headers.packvorbis", "", -21653));
            var2 = tl.a(param1, "jagex logo2.packvorbis", "");
            if (param0 == 51) {
              gg discarded$3 = var2.a();
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("ee.D(").append(param0).append(',');
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
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
            throw qk.a((Throwable) (Object) runtimeException, "ee.G(" + param0 + ')');
        }
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        uc var1_ref = null;
        int var2 = 0;
        String var3 = null;
        int var3_int = 0;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        q var5_ref = null;
        q var6 = null;
        String var6_ref = null;
        String var7 = null;
        q var7_ref = null;
        int var8 = 0;
        int stackIn_12_0 = 0;
        boolean stackIn_49_0 = false;
        int stackIn_56_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_48_0 = false;
        int stackOut_54_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        var8 = Terraphoenix.field_V;
        try {
          L0: {
            var1_ref = mk.field_j;
            var2 = var1_ref.a(-16384);
            if (0 != var2) {
              if (var2 != 1) {
                if (var2 == 2) {
                  L1: {
                    if (jg.field_gb != 1) {
                      break L1;
                    } else {
                      jg.field_gb = 2;
                      break L1;
                    }
                  }
                  return;
                } else {
                  if (3 != var2) {
                    if (param0 >= 111) {
                      if (var2 != 4) {
                        bd.a((Throwable) null, "F1: " + r.i(-15465), 111);
                        gb.g(-17464);
                        break L0;
                      } else {
                        jg.field_gb = 1;
                        var3 = var1_ref.e(-1);
                        ml.field_t = var3.intern();
                        var4 = var1_ref.a(-16384);
                        ve.a(2, var4);
                        return;
                      }
                    } else {
                      return;
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
                    return;
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
                  var3 = var1_ref.e(-1);
                  if (!var3.equals((Object) (Object) "")) {
                    break L4;
                  } else {
                    var3 = null;
                    break L4;
                  }
                }
                L5: {
                  var4_ref_String = var1_ref.e(-1);
                  var5 = var1_ref.e(-1);
                  var6 = dd.a((byte) 104, var4_ref_String);
                  if (var6 != null) {
                    break L5;
                  } else {
                    var6 = dd.a((byte) 104, var5);
                    if (null == var6) {
                      break L5;
                    } else {
                      gb.field_z.a(false, (vh) (Object) var6, (long)hm.a((byte) 92, (CharSequence) (Object) var4_ref_String).hashCode());
                      break L5;
                    }
                  }
                }
                L6: {
                  if (var6 != null) {
                    break L6;
                  } else {
                    var6 = new q();
                    gb.field_z.a(false, (vh) (Object) var6, (long)hm.a((byte) -121, (CharSequence) (Object) var4_ref_String).hashCode());
                    int fieldTemp$3 = gj.field_a;
                    gj.field_a = gj.field_a + 1;
                    var6.field_Mb = fieldTemp$3;
                    sb.field_h.a((uf) (Object) var6, -16611);
                    break L6;
                  }
                }
                L7: {
                  if (var3 != null) {
                    var3 = var3.intern();
                    break L7;
                  } else {
                    break L7;
                  }
                }
                var6.field_Eb = var3;
                var6.field_Lb = var4_ref_String;
                var6.b((byte) 12);
                var7_ref = (q) (Object) sb.field_h.d(9272);
                L8: while (true) {
                  L9: {
                    L10: {
                      L11: {
                        L12: {
                          if (var7_ref == null) {
                            break L12;
                          } else {
                            stackOut_48_0 = ji.a((byte) -19, var6, var7_ref);
                            stackIn_56_0 = stackOut_48_0 ? 1 : 0;
                            stackIn_49_0 = stackOut_48_0;
                            if (var8 != 0) {
                              break L11;
                            } else {
                              if (!stackIn_49_0) {
                                break L12;
                              } else {
                                var7_ref = (q) (Object) sb.field_h.e((byte) -119);
                                if (var8 == 0) {
                                  continue L8;
                                } else {
                                  break L12;
                                }
                              }
                            }
                          }
                        }
                        if (null == var7_ref) {
                          break L10;
                        } else {
                          stackOut_54_0 = 119;
                          stackIn_56_0 = stackOut_54_0;
                          break L11;
                        }
                      }
                      ha.a(stackIn_56_0, (uf) (Object) var7_ref, (uf) (Object) var6);
                      if (var8 == 0) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                    sb.field_h.a((uf) (Object) var6, -16611);
                    break L9;
                  }
                  return;
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
                if (var1_ref.a(-16384) != 1) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L14;
                } else {
                  stackOut_9_0 = 1;
                  stackIn_12_0 = stackOut_9_0;
                  break L14;
                }
              }
              L15: {
                var3_int = stackIn_12_0;
                var4_ref_String = var1_ref.e(-1);
                if (var3_int == 0) {
                  break L15;
                } else {
                  String discarded$4 = var1_ref.e(-1);
                  break L15;
                }
              }
              L16: {
                var5_ref = dm.a((byte) -85, var4_ref_String);
                var6_ref = var1_ref.e(-1);
                var7 = hm.a((byte) 106, (CharSequence) (Object) var4_ref_String);
                if (var7 != null) {
                  break L16;
                } else {
                  var7 = var4_ref_String;
                  break L16;
                }
              }
              L17: {
                if (null != var5_ref) {
                  break L17;
                } else {
                  var5_ref = dm.a((byte) -85, var6_ref);
                  if (var5_ref != null) {
                    ai.field_f.a(false, (vh) (Object) var5_ref, (long)var7.hashCode());
                    break L17;
                  } else {
                    break L17;
                  }
                }
              }
              L18: {
                if (var5_ref == null) {
                  var5_ref = new q();
                  ai.field_f.a(false, (vh) (Object) var5_ref, (long)var7.hashCode());
                  int fieldTemp$5 = cb.field_I;
                  cb.field_I = cb.field_I + 1;
                  var5_ref.field_Mb = fieldTemp$5;
                  r.field_j.a((uf) (Object) var5_ref, -16611);
                  break L18;
                } else {
                  break L18;
                }
              }
              var5_ref.field_Lb = var4_ref_String;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var1, "ee.E(" + param0 + ')');
        }
    }

    ee() {
        ((ee) this).field_H = false;
        ((ee) this).field_I = (byte) 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "Open help";
        field_N = "3000pts";
    }
}
