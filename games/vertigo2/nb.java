/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb extends ji {
    static String field_A;
    static boolean field_z;
    static String field_E;
    private int field_C;
    static cr field_D;
    static fd field_F;
    static ve field_B;
    static String field_y;

    final static void a(int param0, cc param1, cc param2, byte param3) {
        bc.field_c = param0;
        mf.field_c = param2;
        gb.field_b = param1;
        if (param3 >= -56) {
            field_A = null;
        }
        tn.a(bi.field_j / 2, bi.field_e / 2, 55);
        ar.a(param1.field_M + param1.field_t, (byte) 92, param2.field_M + param2.field_t, param1.field_t, param2.field_t);
    }

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_32_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        L0: {
          var8 = Vertigo2.field_L ? 1 : 0;
          if (param1 >= 91) {
            break L0;
          } else {
            var9 = null;
            String discarded$1 = nb.a((tn) null, 86);
            break L0;
          }
        }
        L1: {
          var14 = ((nb) this).field_x.a(param0, (byte) -72);
          var13 = var14;
          var12 = var13;
          var11 = var12;
          var10 = var11;
          var3 = var10;
          if (!((nb) this).field_x.field_i) {
            break L1;
          } else {
            var4 = lf.field_y[param0];
            var5 = 0;
            L2: while (true) {
              if (var5 >= we.field_M) {
                break L1;
              } else {
                L3: {
                  var6 = rh.field_O[var5];
                  if (var6 <= ((nb) this).field_C) {
                    break L3;
                  } else {
                    if (var6 >= -((nb) this).field_C + 4096) {
                      break L3;
                    } else {
                      if (2048 - ((nb) this).field_C >= var4) {
                        break L3;
                      } else {
                        if (2048 - -((nb) this).field_C <= var4) {
                          break L3;
                        } else {
                          L4: {
                            var7 = -var6 + 2048;
                            if (var7 < 0) {
                              var10 = var3;
                              stackOut_11_0 = -var7;
                              stackIn_12_0 = stackOut_11_0;
                              break L4;
                            } else {
                              stackOut_10_0 = var7;
                              stackIn_12_0 = stackOut_10_0;
                              break L4;
                            }
                          }
                          var10 = var3;
                          var7 = stackIn_12_0;
                          var7 = var7 << 12;
                          var7 = var7 / (-((nb) this).field_C + 2048);
                          var10[var5] = 4096 + -var7;
                          var5++;
                          continue L2;
                        }
                      }
                    }
                  }
                }
                L5: {
                  if (var6 <= -((nb) this).field_C + 2048) {
                    break L5;
                  } else {
                    if (var6 >= 2048 - -((nb) this).field_C) {
                      break L5;
                    } else {
                      L6: {
                        var7 = -2048 + var4;
                        if ((var7 ^ -1) <= -1) {
                          stackOut_17_0 = var7;
                          stackIn_18_0 = stackOut_17_0;
                          break L6;
                        } else {
                          stackOut_16_0 = -var7;
                          stackIn_18_0 = stackOut_16_0;
                          break L6;
                        }
                      }
                      var7 = stackIn_18_0;
                      var7 = var7 - ((nb) this).field_C;
                      var7 = var7 << 12;
                      var10[var5] = var7 / (-((nb) this).field_C + 2048);
                      var5++;
                      continue L2;
                    }
                  }
                }
                L7: {
                  if (var4 < ((nb) this).field_C) {
                    break L7;
                  } else {
                    if (var4 > -((nb) this).field_C + 4096) {
                      break L7;
                    } else {
                      L8: {
                        if (((nb) this).field_C > var6) {
                          break L8;
                        } else {
                          if (-((nb) this).field_C + 4096 < var6) {
                            break L8;
                          } else {
                            var14[var5] = 0;
                            var5++;
                            continue L2;
                          }
                        }
                      }
                      L9: {
                        var7 = 2048 + -var4;
                        if (-1 < (var7 ^ -1)) {
                          stackOut_31_0 = -var7;
                          stackIn_32_0 = stackOut_31_0;
                          break L9;
                        } else {
                          stackOut_30_0 = var7;
                          stackIn_32_0 = stackOut_30_0;
                          break L9;
                        }
                      }
                      var7 = stackIn_32_0;
                      var7 = var7 << 12;
                      var7 = var7 / (2048 + -((nb) this).field_C);
                      var10[var5] = -var7 + 4096;
                      var5++;
                      continue L2;
                    }
                  }
                }
                L10: {
                  var7 = -2048 + var6;
                  if ((var7 ^ -1) <= -1) {
                    stackOut_24_0 = var7;
                    stackIn_25_0 = stackOut_24_0;
                    break L10;
                  } else {
                    stackOut_23_0 = -var7;
                    stackIn_25_0 = stackOut_23_0;
                    break L10;
                  }
                }
                var7 = stackIn_25_0;
                var7 = var7 - ((nb) this).field_C;
                var7 = var7 << 12;
                var10[var5] = var7 / (-((nb) this).field_C + 2048);
                var5++;
                continue L2;
              }
            }
          }
        }
        var10 = var3;
        return var10;
    }

    final static tn a(boolean param0, byte param1) {
        mi var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        mi var8 = null;
        q var9 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int[] stackIn_24_0 = null;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_10_0 = 0;
        int[] stackOut_22_0 = null;
        Object stackOut_23_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Vertigo2.field_L ? 1 : 0;
                    if (param1 > 32) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_A = null;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var8 = id.field_f;
                    var2 = var8;
                    var3 = var8.h(-11);
                    ln.field_c = 127 & var3;
                    if (0 == (var3 & 128)) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    stackOut_3_0 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 4: {
                    stackOut_4_0 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    cb.field_Ib = stackIn_5_0 != 0;
                    rq.field_u = var8.h(-11);
                    ug.field_a = var8.i(-31016);
                    if ((ln.field_c ^ -1) == -3) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    ck.field_J = 0;
                    qf.field_a = 0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 7: {
                    ck.field_J = var8.a((byte) -11);
                    qf.field_a = var8.m(0);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if ((var8.h(-11) ^ -1) != -2) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    stackOut_9_0 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 10: {
                    stackOut_10_0 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    var4 = stackIn_11_0;
                    sp.field_U = var8.f(128);
                    if (var4 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    fd.field_p = var8.f(128);
                    statePc = 14;
                    continue stateLoop;
                }
                case 13: {
                    fd.field_p = sp.field_U;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (-2 == ln.field_c) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (-5 == ln.field_c) {
                        statePc = 18;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    tj.field_b = 0;
                    ad.field_a = null;
                    statePc = 19;
                    continue stateLoop;
                }
                case 17: {
                    tj.field_b = var8.a((byte) -11);
                    ad.field_a = var8.f(128);
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    tj.field_b = var8.a((byte) -11);
                    ad.field_a = var8.f(128);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (!param0) {
                        statePc = 27;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var5 = var8.a((byte) -11);
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    try {
                        var9 = wm.field_k.a(1, var5);
                        tj.field_a = var9.h(33);
                        if (fd.field_p.equals((Object) (Object) qe.field_V)) {
                            statePc = 23;
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
                        stackOut_22_0 = var9.field_w;
                        stackIn_24_0 = stackOut_22_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = null;
                        stackIn_24_0 = (int[]) (Object) stackOut_23_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        sd.field_P = stackIn_24_0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    var6 = (Exception) (Object) caughtException;
                    ke.a((Throwable) (Object) var6, "CC1", 0);
                    sd.field_P = null;
                    tj.field_a = null;
                    statePc = 28;
                    continue stateLoop;
                }
                case 27: {
                    tj.field_a = hh.a((byte) -123, 80, (ed) (Object) var8);
                    sd.field_P = null;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    return new tn(param0);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void h(int param0) {
        if (param0 != -14829) {
            il discarded$0 = nb.i(-116);
        }
        hh.a(-20, lr.field_H);
    }

    final static il i(int param0) {
        try {
            Throwable var1 = null;
            il stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            il stackOut_2_0 = null;
            try {
              L0: {
                if (param0 == 0) {
                  break L0;
                } else {
                  nb.g(127);
                  break L0;
                }
              }
              stackOut_2_0 = (il) Class.forName("vk").newInstance();
              stackIn_3_0 = stackOut_2_0;
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return stackIn_3_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    final static String a(tn param0, int param1) {
        String var2 = null;
        String var3 = null;
        int var4 = 0;
        String var5 = null;
        L0: {
          var4 = Vertigo2.field_L ? 1 : 0;
          var2 = null;
          if (param0.field_l != null) {
            L1: {
              var5 = param0.field_l;
              var2 = var5;
              var2 = var5;
              if (1 != param0.field_h) {
                break L1;
              } else {
                var2 = "<img=0>" + var5;
                break L1;
              }
            }
            if (2 != param0.field_h) {
              break L0;
            } else {
              var2 = "<img=1>" + var2;
              break L0;
            }
          } else {
            break L0;
          }
        }
        var3 = "";
        if (param1 > 6) {
          L2: {
            if (-3 != (param0.field_s ^ -1)) {
              L3: {
                if (param0.field_s != 0) {
                  break L3;
                } else {
                  if (!fq.field_i) {
                    break L3;
                  } else {
                    var3 = "[" + fb.field_A + "] ";
                    break L3;
                  }
                }
              }
              L4: {
                if (-2 != (param0.field_s ^ -1)) {
                  break L4;
                } else {
                  var3 = "[" + Vertigo2.a(new String[1], ie.field_Rb, -117) + "] ";
                  break L4;
                }
              }
              L5: {
                if (-5 != (param0.field_s ^ -1)) {
                  break L5;
                } else {
                  if (v.field_a != null) {
                    var3 = "[" + v.field_a + "] ";
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                if ((param0.field_s ^ -1) == -4) {
                  var3 = "[#" + param0.field_k + "] ";
                  break L6;
                } else {
                  break L6;
                }
              }
              if (!param0.field_n) {
                var3 = var3 + var2 + ": ";
                break L2;
              } else {
                break L2;
              }
            } else {
              if (!param0.field_n) {
                L7: {
                  if (param0.field_o != 0) {
                    break L7;
                  } else {
                    if (param0.field_m == 0) {
                      var3 = Vertigo2.a(new String[1], di.field_B, 70);
                      break L2;
                    } else {
                      break L7;
                    }
                  }
                }
                var3 = Vertigo2.a(new String[1], af.field_L, -118);
                break L2;
              } else {
                break L2;
              }
            }
          }
          return var3;
        } else {
          return null;
        }
    }

    final void a(byte param0, int param1, ed param2) {
        int var4 = param1;
        if (0 == var4) {
            ((nb) this).field_C = param2.a((byte) -11);
        }
        if (param0 != 110) {
            field_A = null;
        }
    }

    final static void d(int param0, int param1) {
        int var3 = Vertigo2.field_L ? 1 : 0;
        hn var4 = (hn) (Object) qo.field_B.a((byte) 100);
        while (var4 != null) {
            lh.a(param0, var4, (byte) 81);
            var4 = (hn) (Object) qo.field_B.b(45);
        }
        li var2 = vf.field_C.a((byte) 100);
        while (var2 != null) {
            mp.a(param0, 98);
            var2 = vf.field_C.b(36);
        }
        if (param1 != -2) {
            tn discarded$0 = nb.a(false, (byte) 93);
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6) {
        int var11 = 0;
        int[] var15 = null;
        int var13 = Vertigo2.field_L ? 1 : 0;
        int var7 = param4 + param0;
        if (param3 != -92) {
            return;
        }
        int var8 = param5 - param4;
        for (var11 = param0; var7 > var11; var11++) {
            ki.a(-101, param6, vl.field_e[var11], param1, param2);
        }
        int var9 = param4 + param6;
        int var10 = -param4 + param1;
        for (var11 = param5; var8 < var11; var11--) {
            ki.a(-81, param6, vl.field_e[var11], param1, param2);
        }
        for (var11 = var7; var8 >= var11; var11++) {
            var15 = vl.field_e[var11];
            ki.a(-106, param6, var15, var9, param2);
            ki.a(-128, var10, var15, param1, param2);
        }
    }

    public nb() {
        super(0, true);
        ((nb) this).field_C = 585;
    }

    public static void g(int param0) {
        field_F = null;
        field_y = null;
        field_D = null;
        field_A = null;
        field_E = null;
        field_B = null;
        if (param0 != 0) {
            Object var2 = null;
            nb.a(102, (cc) null, (cc) null, (byte) 77);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "Select mode";
        field_z = true;
        field_F = new fd(0, 0);
        field_B = new ve(15, 0, 1, 0);
    }
}
