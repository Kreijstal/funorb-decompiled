/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mh {
    static float field_c;
    static String field_f;
    static int field_a;
    static int field_b;
    static String field_e;
    static int field_g;
    static int field_d;

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              if (param0 <= -56) {
                break L0;
              } else {
                mh.a(-37);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          field_e = null;
          field_f = null;
        }
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4) {
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = TetraLink.field_J;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param2 == 0) {
                            statePc = 5;
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
                        int discarded$2 = mh.a(121, -17, 103, -39);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        param3--;
                        if (0 > param3) {
                            statePc = 18;
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
                        var5 = param0;
                        var6 = param4;
                        var7 = param1;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var5[var6] = var7 + (pl.a(var5[var6], 16711422) >> 1134962689);
                        param4++;
                        if (var8 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var8 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    var5_ref = (RuntimeException) (Object) caughtException;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    try {
                        stackOut_13_0 = (RuntimeException) var5_ref;
                        stackOut_13_1 = new StringBuilder().append("mh.B(");
                        stackIn_16_0 = stackOut_13_0;
                        stackIn_16_1 = stackOut_13_1;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        if (param0 == null) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                        stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                        stackOut_14_2 = "{...}";
                        stackIn_17_0 = stackOut_14_0;
                        stackIn_17_1 = stackOut_14_1;
                        stackIn_17_2 = stackOut_14_2;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 16: {
                    stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                    stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                    stackOut_16_2 = "null";
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    stackIn_17_2 = stackOut_16_2;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    throw oi.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
                }
                case 18: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(boolean param0, boolean param1, int param2, boolean param3, int param4) {
        hl var5 = null;
        int var5_int = 0;
        hl var6 = null;
        hl var7 = null;
        hl var8 = null;
        int var9 = 0;
        String var9_ref = null;
        String var10_ref = null;
        int var10 = 0;
        int var11_int = 0;
        String var11 = null;
        int var12 = 0;
        int var13_int = 0;
        String var13 = null;
        int[] var13_array = null;
        int var14_int = 0;
        String var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        je var17 = null;
        gd var18 = null;
        int var18_int = 0;
        int var19 = 0;
        hl stackIn_19_0 = null;
        hl stackIn_20_0 = null;
        hl stackIn_21_0 = null;
        hl stackIn_22_0 = null;
        hl stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_73_0 = 0;
        boolean stackIn_127_0 = false;
        int stackIn_152_0 = 0;
        boolean stackIn_171_0 = false;
        int stackIn_178_0 = 0;
        hl stackIn_194_0 = null;
        int stackIn_194_1 = 0;
        hl stackIn_195_0 = null;
        int stackIn_195_1 = 0;
        hl stackIn_196_0 = null;
        int stackIn_196_1 = 0;
        hl stackIn_197_0 = null;
        int stackIn_197_1 = 0;
        hl stackIn_198_0 = null;
        int stackIn_198_1 = 0;
        hl stackIn_199_0 = null;
        int stackIn_199_1 = 0;
        hl stackIn_200_0 = null;
        int stackIn_200_1 = 0;
        int stackIn_200_2 = 0;
        hl stackIn_201_0 = null;
        int stackIn_201_1 = 0;
        hl stackIn_202_0 = null;
        int stackIn_202_1 = 0;
        hl stackIn_203_0 = null;
        int stackIn_203_1 = 0;
        hl stackIn_204_0 = null;
        int stackIn_204_1 = 0;
        hl stackIn_205_0 = null;
        int stackIn_205_1 = 0;
        hl stackIn_206_0 = null;
        int stackIn_206_1 = 0;
        hl stackIn_207_0 = null;
        int stackIn_207_1 = 0;
        int stackIn_207_2 = 0;
        hl stackIn_208_0 = null;
        int stackIn_208_1 = 0;
        hl stackIn_209_0 = null;
        int stackIn_209_1 = 0;
        hl stackIn_210_0 = null;
        int stackIn_210_1 = 0;
        hl stackIn_211_0 = null;
        int stackIn_211_1 = 0;
        hl stackIn_212_0 = null;
        int stackIn_212_1 = 0;
        hl stackIn_213_0 = null;
        int stackIn_213_1 = 0;
        hl stackIn_214_0 = null;
        int stackIn_214_1 = 0;
        int stackIn_214_2 = 0;
        hl stackOut_18_0 = null;
        hl stackOut_19_0 = null;
        hl stackOut_20_0 = null;
        hl stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        hl stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_62_1 = 0;
        int stackOut_68_0 = 0;
        int stackOut_72_0 = 0;
        boolean stackOut_126_0 = false;
        int stackOut_151_0 = 0;
        boolean stackOut_170_0 = false;
        int stackOut_177_0 = 0;
        hl stackOut_193_0 = null;
        int stackOut_193_1 = 0;
        hl stackOut_194_0 = null;
        int stackOut_194_1 = 0;
        hl stackOut_195_0 = null;
        int stackOut_195_1 = 0;
        hl stackOut_196_0 = null;
        int stackOut_196_1 = 0;
        hl stackOut_197_0 = null;
        int stackOut_197_1 = 0;
        hl stackOut_198_0 = null;
        int stackOut_198_1 = 0;
        int stackOut_198_2 = 0;
        hl stackOut_199_0 = null;
        int stackOut_199_1 = 0;
        int stackOut_199_2 = 0;
        hl stackOut_200_0 = null;
        int stackOut_200_1 = 0;
        hl stackOut_201_0 = null;
        int stackOut_201_1 = 0;
        hl stackOut_202_0 = null;
        int stackOut_202_1 = 0;
        hl stackOut_203_0 = null;
        int stackOut_203_1 = 0;
        hl stackOut_204_0 = null;
        int stackOut_204_1 = 0;
        hl stackOut_205_0 = null;
        int stackOut_205_1 = 0;
        int stackOut_205_2 = 0;
        hl stackOut_206_0 = null;
        int stackOut_206_1 = 0;
        int stackOut_206_2 = 0;
        hl stackOut_207_0 = null;
        int stackOut_207_1 = 0;
        hl stackOut_208_0 = null;
        int stackOut_208_1 = 0;
        hl stackOut_209_0 = null;
        int stackOut_209_1 = 0;
        hl stackOut_210_0 = null;
        int stackOut_210_1 = 0;
        hl stackOut_211_0 = null;
        int stackOut_211_1 = 0;
        hl stackOut_212_0 = null;
        int stackOut_212_1 = 0;
        int stackOut_212_2 = 0;
        hl stackOut_213_0 = null;
        int stackOut_213_1 = 0;
        int stackOut_213_2 = 0;
        L0: {
          var19 = TetraLink.field_J;
          nb.a(am.field_f, (byte) 37);
          if (null != qb.field_N) {
            L1: {
              L2: {
                qi.field_n.field_S = true;
                nm.field_n.field_R = 0;
                var5 = nm.field_n;
                var5.field_Hb = 0;
                var6 = rn.field_c;
                rn.field_c.field_R = 0;
                var6.field_Hb = 0;
                tn.field_a.field_R = 0;
                var7 = tn.field_a;
                var7.field_Hb = 0;
                if (s.b(63)) {
                  break L2;
                } else {
                  var9_ref = qb.field_N.field_ec;
                  ua.field_d.field_jb = sk.a(new String[1], qe.field_e, 127).toUpperCase();
                  tn.field_a.a((byte) -110, fk.field_V.field_Hb, fk.field_V.field_R + -40, 40, 0);
                  tn.field_a.field_jb = sk.a(new String[1], om.field_Xb, 123);
                  var8 = tn.field_a;
                  if (var19 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                L4: {
                  ua.field_d.field_jb = jn.field_d.toUpperCase();
                  var9 = (2 + fk.field_V.field_Hb) / 2;
                  nm.field_n.a((byte) -94, var9 + -2, -40 + fk.field_V.field_R, 40, 0);
                  if (qb.field_N.field_jc < qb.field_N.field_rc) {
                    break L4;
                  } else {
                    nm.field_n.field_jb = cb.field_s.toUpperCase();
                    nm.field_n.field_S = false;
                    if (var19 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                nm.field_n.field_jb = ok.field_c.toUpperCase();
                nm.field_n.field_S = true;
                break L3;
              }
              L5: {
                nm.field_n.field_Eb = rj.field_l.field_Eb;
                if (ja.field_g <= 0) {
                  break L5;
                } else {
                  L6: {
                    L7: {
                      if ((ja.field_g ^ -1) != -2) {
                        break L7;
                      } else {
                        var10_ref = ca.field_d;
                        if (var19 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var10_ref = sk.a(new String[1], field_e, 121);
                    break L6;
                  }
                  L8: {
                    if ((16 & cb.field_u ^ -1) != -1) {
                      break L8;
                    } else {
                      if (lg.field_S) {
                        break L8;
                      } else {
                        nm.field_n.field_Eb = rj.field_l.field_kb;
                        break L8;
                      }
                    }
                  }
                  nm.field_n.field_jb = nm.field_n.field_jb + "<br>" + var10_ref;
                  break L5;
                }
              }
              L9: {
                L10: {
                  rn.field_c.a((byte) -122, -var9 + fk.field_V.field_Hb, fk.field_V.field_R + -40, 40, var9);
                  rn.field_c.field_jb = lk.field_pb.toUpperCase();
                  var8 = rn.field_c;
                  stackOut_18_0 = rn.field_c;
                  stackIn_22_0 = stackOut_18_0;
                  stackIn_19_0 = stackOut_18_0;
                  if (!param0) {
                    break L10;
                  } else {
                    stackOut_19_0 = (hl) (Object) stackIn_19_0;
                    stackIn_22_0 = stackOut_19_0;
                    stackIn_20_0 = stackOut_19_0;
                    if (un.field_f != 0L) {
                      break L10;
                    } else {
                      stackOut_20_0 = (hl) (Object) stackIn_20_0;
                      stackIn_21_0 = stackOut_20_0;
                      stackOut_21_0 = (hl) (Object) stackIn_21_0;
                      stackOut_21_1 = 1;
                      stackIn_23_0 = stackOut_21_0;
                      stackIn_23_1 = stackOut_21_1;
                      break L9;
                    }
                  }
                }
                stackOut_22_0 = (hl) (Object) stackIn_22_0;
                stackOut_22_1 = 0;
                stackIn_23_0 = stackOut_22_0;
                stackIn_23_1 = stackOut_22_1;
                break L9;
              }
              L11: {
                stackIn_23_0.field_S = stackIn_23_1 != 0;
                var10 = 2;
                if (null == uj.field_s) {
                  break L11;
                } else {
                  L12: {
                    if (null != eg.field_K) {
                      break L12;
                    } else {
                      eg.field_K = new byte[hg.field_k];
                      rh.field_G = new boolean[hg.field_k];
                      break L12;
                    }
                  }
                  var11_int = 0;
                  L13: while (true) {
                    L14: {
                      L15: {
                        if ((var11_int ^ -1) <= (hg.field_k ^ -1)) {
                          break L15;
                        } else {
                          rh.field_G[var11_int] = false;
                          var11_int++;
                          if (var19 != 0) {
                            break L14;
                          } else {
                            if (var19 == 0) {
                              continue L13;
                            } else {
                              break L15;
                            }
                          }
                        }
                      }
                      var10 = 0;
                      break L14;
                    }
                    L16: while (true) {
                      L17: {
                        L18: {
                          if (-3 >= (var10 ^ -1)) {
                            break L18;
                          } else {
                            var11_int = 0;
                            stackOut_34_0 = 0;
                            stackIn_73_0 = stackOut_34_0;
                            stackIn_35_0 = stackOut_34_0;
                            if (var19 != 0) {
                              break L17;
                            } else {
                              var12 = stackIn_35_0;
                              L19: while (true) {
                                stackOut_36_0 = uj.field_s.length ^ -1;
                                stackOut_36_1 = var12 ^ -1;
                                stackIn_37_0 = stackOut_36_0;
                                stackIn_37_1 = stackOut_36_1;
                                L20: while (true) {
                                  L21: {
                                    L22: {
                                      if (stackIn_37_0 >= stackIn_37_1) {
                                        break L22;
                                      } else {
                                        var13_array = uj.field_s[var12];
                                        stackOut_38_0 = 0;
                                        stackIn_69_0 = stackOut_38_0;
                                        stackIn_39_0 = stackOut_38_0;
                                        if (var19 != 0) {
                                          break L21;
                                        } else {
                                          var14_int = stackIn_39_0;
                                          L23: while (true) {
                                            L24: {
                                              L25: {
                                                L26: {
                                                  if (var14_int >= var13_array.length) {
                                                    break L26;
                                                  } else {
                                                    var15 = var13_array[var14_int];
                                                    var16 = var13_array[var14_int - -1];
                                                    stackOut_41_0 = var15 ^ -1;
                                                    stackIn_60_0 = stackOut_41_0;
                                                    stackIn_42_0 = stackOut_41_0;
                                                    if (var19 != 0) {
                                                      break L25;
                                                    } else {
                                                      L27: {
                                                        L28: {
                                                          if (stackIn_42_0 != 0) {
                                                            break L28;
                                                          } else {
                                                            L29: {
                                                              if ((var10 ^ -1) == -1) {
                                                                stackOut_47_0 = qb.field_N.field_rc;
                                                                stackIn_48_0 = stackOut_47_0;
                                                                break L29;
                                                              } else {
                                                                stackOut_46_0 = qb.field_N.field_jc;
                                                                stackIn_48_0 = stackOut_46_0;
                                                                break L29;
                                                              }
                                                            }
                                                            L30: {
                                                              var17_int = stackIn_48_0;
                                                              if ((var16 ^ -1) == (var17_int ^ -1)) {
                                                                break L30;
                                                              } else {
                                                                if (var19 == 0) {
                                                                  break L24;
                                                                } else {
                                                                  break L30;
                                                                }
                                                              }
                                                            }
                                                            if (var19 == 0) {
                                                              break L27;
                                                            } else {
                                                              break L28;
                                                            }
                                                          }
                                                        }
                                                        if ((var16 ^ -1) == (qb.field_N.field_sc[var15] & 255 ^ -1)) {
                                                          break L27;
                                                        } else {
                                                          if (var19 == 0) {
                                                            break L24;
                                                          } else {
                                                            break L27;
                                                          }
                                                        }
                                                      }
                                                      var14_int += 2;
                                                      if (var19 == 0) {
                                                        continue L23;
                                                      } else {
                                                        break L26;
                                                      }
                                                    }
                                                  }
                                                }
                                                var11_int = 1;
                                                var14_int = -1;
                                                stackOut_59_0 = 0;
                                                stackIn_60_0 = stackOut_59_0;
                                                break L25;
                                              }
                                              var15 = stackIn_60_0;
                                              L31: while (true) {
                                                L32: {
                                                  if (var13_array.length <= var15) {
                                                    break L32;
                                                  } else {
                                                    var16 = var13_array[var15];
                                                    stackOut_62_0 = var14_int ^ -1;
                                                    stackOut_62_1 = var16 ^ -1;
                                                    stackIn_37_0 = stackOut_62_0;
                                                    stackIn_37_1 = stackOut_62_1;
                                                    stackIn_63_0 = stackOut_62_0;
                                                    stackIn_63_1 = stackOut_62_1;
                                                    if (var19 != 0) {
                                                      continue L20;
                                                    } else {
                                                      L33: {
                                                        if (stackIn_63_0 <= stackIn_63_1) {
                                                          break L33;
                                                        } else {
                                                          var14_int = var16;
                                                          break L33;
                                                        }
                                                      }
                                                      var15 += 2;
                                                      if (var19 == 0) {
                                                        continue L31;
                                                      } else {
                                                        break L32;
                                                      }
                                                    }
                                                  }
                                                }
                                                rh.field_G[var14_int] = true;
                                                break L24;
                                              }
                                            }
                                            var12++;
                                            if (var19 == 0) {
                                              continue L19;
                                            } else {
                                              break L22;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    stackOut_68_0 = var11_int;
                                    stackIn_69_0 = stackOut_68_0;
                                    break L21;
                                  }
                                  if (stackIn_69_0 != 0) {
                                    break L18;
                                  } else {
                                    var10++;
                                    if (var19 == 0) {
                                      continue L16;
                                    } else {
                                      break L18;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        stackOut_72_0 = 2;
                        stackIn_73_0 = stackOut_72_0;
                        break L17;
                      }
                      if (stackIn_73_0 > dd.field_c) {
                        break L11;
                      } else {
                        if (!sn.field_a[12]) {
                          break L11;
                        } else {
                          var10 = 2;
                          break L11;
                        }
                      }
                    }
                  }
                }
              }
              L34: {
                if (2 > var10) {
                  break L34;
                } else {
                  L35: {
                    if (ba.field_S != null) {
                      break L35;
                    } else {
                      if (a.field_g != null) {
                        break L35;
                      } else {
                        if (bi.field_e != null) {
                          break L35;
                        } else {
                          if (null != ti.field_f) {
                            break L35;
                          } else {
                            break L1;
                          }
                        }
                      }
                    }
                  }
                  var11_int = 0;
                  var12 = 0;
                  var13_int = 0;
                  var14_int = 0;
                  var15 = 0;
                  var16 = 0;
                  L36: while (true) {
                    L37: {
                      L38: {
                        if ((hg.field_k ^ -1) >= (var16 ^ -1)) {
                          break L38;
                        } else {
                          var17_int = qb.field_N.field_sc[var16] & 255;
                          if (var19 != 0) {
                            break L37;
                          } else {
                            L39: {
                              if (null == ba.field_S) {
                                break L39;
                              } else {
                                if (null == ba.field_S[var16]) {
                                  break L39;
                                } else {
                                  if (!ba.field_S[var16][var17_int]) {
                                    break L39;
                                  } else {
                                    var11_int = 1;
                                    break L39;
                                  }
                                }
                              }
                            }
                            L40: {
                              if (a.field_g == null) {
                                break L40;
                              } else {
                                if (null != a.field_g[var16]) {
                                  L41: {
                                    var18_int = a.field_g[var16][var17_int];
                                    if (-1 == (var18_int ^ -1)) {
                                      break L41;
                                    } else {
                                      if (oa.field_r) {
                                        break L41;
                                      } else {
                                        var11_int = 1;
                                        break L41;
                                      }
                                    }
                                  }
                                  if (var18_int > var13_int) {
                                    var13_int = var18_int;
                                    break L40;
                                  } else {
                                    break L40;
                                  }
                                } else {
                                  break L40;
                                }
                              }
                            }
                            L42: {
                              if (null == bi.field_e) {
                                break L42;
                              } else {
                                if (bi.field_e[var16] != null) {
                                  L43: {
                                    var18_int = bi.field_e[var16][var17_int];
                                    if ((var18_int ^ -1) == -1) {
                                      break L43;
                                    } else {
                                      if (oa.field_r) {
                                        break L43;
                                      } else {
                                        var11_int = 1;
                                        break L43;
                                      }
                                    }
                                  }
                                  if (var18_int <= var14_int) {
                                    break L42;
                                  } else {
                                    var14_int = var18_int;
                                    break L42;
                                  }
                                } else {
                                  break L42;
                                }
                              }
                            }
                            L44: {
                              if (null == ti.field_f) {
                                break L44;
                              } else {
                                if (null == ti.field_f[var16]) {
                                  break L44;
                                } else {
                                  var15 = var15 | ti.field_f[var16][var17_int];
                                  break L44;
                                }
                              }
                            }
                            var16++;
                            if (var19 == 0) {
                              continue L36;
                            } else {
                              break L38;
                            }
                          }
                        }
                      }
                      var16 = 0;
                      break L37;
                    }
                    var17 = v.field_x.field_Pb.field_fb;
                    var18 = (gd) (Object) var17.c(false);
                    L45: while (true) {
                      L46: {
                        L47: {
                          if (var18 == null) {
                            break L47;
                          } else {
                            stackOut_126_0 = var18.d((byte) -1);
                            stackIn_152_0 = stackOut_126_0 ? 1 : 0;
                            stackIn_127_0 = stackOut_126_0;
                            if (var19 != 0) {
                              break L46;
                            } else {
                              L48: {
                                if (stackIn_127_0) {
                                  break L48;
                                } else {
                                  L49: {
                                    if (var11_int == 0) {
                                      break L49;
                                    } else {
                                      if (!var18.field_Tb) {
                                        var16 = 1;
                                        if (var19 == 0) {
                                          break L47;
                                        } else {
                                          break L49;
                                        }
                                      } else {
                                        break L49;
                                      }
                                    }
                                  }
                                  L50: {
                                    if ((var18.field_Pb ^ -1) > (var13_int ^ -1)) {
                                      var16 = 1;
                                      if (var19 == 0) {
                                        break L47;
                                      } else {
                                        break L50;
                                      }
                                    } else {
                                      break L50;
                                    }
                                  }
                                  L51: {
                                    if (var14_int <= var18.field_Qb) {
                                      break L51;
                                    } else {
                                      var16 = 1;
                                      if (var19 == 0) {
                                        break L47;
                                      } else {
                                        break L51;
                                      }
                                    }
                                  }
                                  L52: {
                                    if (-1 > ((var18.field_Ub ^ -1) & var15 ^ -1)) {
                                      var16 = 1;
                                      if (var19 == 0) {
                                        break L47;
                                      } else {
                                        break L52;
                                      }
                                    } else {
                                      break L52;
                                    }
                                  }
                                  if (var12 != 0) {
                                    var16 = 1;
                                    if (var19 == 0) {
                                      break L47;
                                    } else {
                                      break L48;
                                    }
                                  } else {
                                    break L48;
                                  }
                                }
                              }
                              var18 = (gd) (Object) var17.a((byte) -70);
                              if (var19 == 0) {
                                continue L45;
                              } else {
                                break L47;
                              }
                            }
                          }
                        }
                        stackOut_151_0 = 2;
                        stackIn_152_0 = stackOut_151_0;
                        break L46;
                      }
                      L53: {
                        if (stackIn_152_0 > dd.field_c) {
                          break L53;
                        } else {
                          if (!sn.field_a[12]) {
                            break L53;
                          } else {
                            var16 = 0;
                            break L53;
                          }
                        }
                      }
                      L54: {
                        if (var16 == 0) {
                          break L54;
                        } else {
                          rn.field_c.field_S = false;
                          if (rn.field_c.field_rb) {
                            L55: {
                              if ((we.field_e.field_g.field_Lb ^ -1) != -1) {
                                break L55;
                              } else {
                                re.field_P = af.field_b;
                                if (var19 == 0) {
                                  break L54;
                                } else {
                                  break L55;
                                }
                              }
                            }
                            re.field_P = sk.a(new String[1], cn.field_b, 119);
                            break L54;
                          } else {
                            break L54;
                          }
                        }
                      }
                      if (var19 == 0) {
                        break L1;
                      } else {
                        break L34;
                      }
                    }
                  }
                }
              }
              rn.field_c.field_S = false;
              if (rn.field_c.field_rb) {
                var11 = null;
                var12 = 0;
                var13_int = 0;
                L56: while (true) {
                  L57: {
                    L58: {
                      if ((hg.field_k ^ -1) >= (var13_int ^ -1)) {
                        break L58;
                      } else {
                        stackOut_170_0 = rh.field_G[var13_int];
                        stackIn_178_0 = stackOut_170_0 ? 1 : 0;
                        stackIn_171_0 = stackOut_170_0;
                        if (var19 != 0) {
                          break L57;
                        } else {
                          L59: {
                            if (!stackIn_171_0) {
                              break L59;
                            } else {
                              L60: {
                                var14 = "<col=A00000>" + ll.field_y[var13_int] + "</col>";
                                if (var11 != null) {
                                  break L60;
                                } else {
                                  var11 = var14;
                                  if (var19 == 0) {
                                    break L59;
                                  } else {
                                    break L60;
                                  }
                                }
                              }
                              var12 = 1;
                              var11 = var11 + ", " + var14;
                              break L59;
                            }
                          }
                          var13_int++;
                          if (var19 == 0) {
                            continue L56;
                          } else {
                            break L58;
                          }
                        }
                      }
                    }
                    stackOut_177_0 = 0;
                    stackIn_178_0 = stackOut_177_0;
                    break L57;
                  }
                  L61: {
                    if (stackIn_178_0 == var10) {
                      L62: {
                        var13 = mn.field_b;
                        if (var12 != 0) {
                          break L62;
                        } else {
                          var14 = sk.a(new String[1], hb.field_f, 119);
                          if (var19 == 0) {
                            break L61;
                          } else {
                            break L62;
                          }
                        }
                      }
                      var14 = hm.field_d + var11;
                      break L61;
                    } else {
                      L63: {
                        var13 = gb.field_q;
                        if (var12 != 0) {
                          break L63;
                        } else {
                          var14 = sk.a(new String[1], mc.field_d, 127);
                          if (var19 == 0) {
                            break L61;
                          } else {
                            break L63;
                          }
                        }
                      }
                      var14 = o.field_p + var11;
                      break L61;
                    }
                  }
                  re.field_P = "<col=A00000>" + var13 + "<br>" + var14;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L64: {
              if ((un.field_f ^ -1L) != -1L) {
                L65: {
                  var9 = (int)(-k.a(0) + un.field_f);
                  var9 = (999 + var9) / 1000;
                  if (1 > var9) {
                    var9 = 1;
                    break L65;
                  } else {
                    break L65;
                  }
                }
                var8.field_jb = sk.a(new String[1], ki.field_a, 121);
                break L64;
              } else {
                break L64;
              }
            }
            e.field_d.field_jb = sk.a(new String[2], pl.field_c, 126);
            break L0;
          } else {
            break L0;
          }
        }
        L66: {
          L67: {
            stackOut_193_0 = tl.field_P;
            stackOut_193_1 = 0;
            stackIn_199_0 = stackOut_193_0;
            stackIn_199_1 = stackOut_193_1;
            stackIn_194_0 = stackOut_193_0;
            stackIn_194_1 = stackOut_193_1;
            if (!param3) {
              break L67;
            } else {
              stackOut_194_0 = (hl) (Object) stackIn_194_0;
              stackOut_194_1 = stackIn_194_1;
              stackIn_199_0 = stackOut_194_0;
              stackIn_199_1 = stackOut_194_1;
              stackIn_195_0 = stackOut_194_0;
              stackIn_195_1 = stackOut_194_1;
              if (param1) {
                break L67;
              } else {
                stackOut_195_0 = (hl) (Object) stackIn_195_0;
                stackOut_195_1 = stackIn_195_1;
                stackIn_196_0 = stackOut_195_0;
                stackIn_196_1 = stackOut_195_1;
                stackOut_196_0 = (hl) (Object) stackIn_196_0;
                stackOut_196_1 = stackIn_196_1;
                stackIn_199_0 = stackOut_196_0;
                stackIn_199_1 = stackOut_196_1;
                stackIn_197_0 = stackOut_196_0;
                stackIn_197_1 = stackOut_196_1;
                if (lg.field_S) {
                  break L67;
                } else {
                  stackOut_197_0 = (hl) (Object) stackIn_197_0;
                  stackOut_197_1 = stackIn_197_1;
                  stackIn_198_0 = stackOut_197_0;
                  stackIn_198_1 = stackOut_197_1;
                  stackOut_198_0 = (hl) (Object) stackIn_198_0;
                  stackOut_198_1 = stackIn_198_1;
                  stackOut_198_2 = 1;
                  stackIn_200_0 = stackOut_198_0;
                  stackIn_200_1 = stackOut_198_1;
                  stackIn_200_2 = stackOut_198_2;
                  break L66;
                }
              }
            }
          }
          stackOut_199_0 = (hl) (Object) stackIn_199_0;
          stackOut_199_1 = stackIn_199_1;
          stackOut_199_2 = 0;
          stackIn_200_0 = stackOut_199_0;
          stackIn_200_1 = stackOut_199_1;
          stackIn_200_2 = stackOut_199_2;
          break L66;
        }
        L68: {
          L69: {
            ((hl) (Object) stackIn_200_0).a(stackIn_200_1, stackIn_200_2 != 0);
            var5_int = -59 % ((13 - param4) / 49);
            stackOut_200_0 = fk.field_V;
            stackOut_200_1 = 0;
            stackIn_206_0 = stackOut_200_0;
            stackIn_206_1 = stackOut_200_1;
            stackIn_201_0 = stackOut_200_0;
            stackIn_201_1 = stackOut_200_1;
            if (!param3) {
              break L69;
            } else {
              stackOut_201_0 = (hl) (Object) stackIn_201_0;
              stackOut_201_1 = stackIn_201_1;
              stackIn_206_0 = stackOut_201_0;
              stackIn_206_1 = stackOut_201_1;
              stackIn_202_0 = stackOut_201_0;
              stackIn_202_1 = stackOut_201_1;
              if (param1) {
                break L69;
              } else {
                stackOut_202_0 = (hl) (Object) stackIn_202_0;
                stackOut_202_1 = stackIn_202_1;
                stackIn_203_0 = stackOut_202_0;
                stackIn_203_1 = stackOut_202_1;
                stackOut_203_0 = (hl) (Object) stackIn_203_0;
                stackOut_203_1 = stackIn_203_1;
                stackIn_206_0 = stackOut_203_0;
                stackIn_206_1 = stackOut_203_1;
                stackIn_204_0 = stackOut_203_0;
                stackIn_204_1 = stackOut_203_1;
                if (lg.field_S) {
                  break L69;
                } else {
                  stackOut_204_0 = (hl) (Object) stackIn_204_0;
                  stackOut_204_1 = stackIn_204_1;
                  stackIn_205_0 = stackOut_204_0;
                  stackIn_205_1 = stackOut_204_1;
                  stackOut_205_0 = (hl) (Object) stackIn_205_0;
                  stackOut_205_1 = stackIn_205_1;
                  stackOut_205_2 = 1;
                  stackIn_207_0 = stackOut_205_0;
                  stackIn_207_1 = stackOut_205_1;
                  stackIn_207_2 = stackOut_205_2;
                  break L68;
                }
              }
            }
          }
          stackOut_206_0 = (hl) (Object) stackIn_206_0;
          stackOut_206_1 = stackIn_206_1;
          stackOut_206_2 = 0;
          stackIn_207_0 = stackOut_206_0;
          stackIn_207_1 = stackOut_206_1;
          stackIn_207_2 = stackOut_206_2;
          break L68;
        }
        L70: {
          L71: {
            ((hl) (Object) stackIn_207_0).a(stackIn_207_1, stackIn_207_2 != 0);
            stackOut_207_0 = fj.field_b;
            stackOut_207_1 = 0;
            stackIn_213_0 = stackOut_207_0;
            stackIn_213_1 = stackOut_207_1;
            stackIn_208_0 = stackOut_207_0;
            stackIn_208_1 = stackOut_207_1;
            if (!param3) {
              break L71;
            } else {
              stackOut_208_0 = (hl) (Object) stackIn_208_0;
              stackOut_208_1 = stackIn_208_1;
              stackIn_213_0 = stackOut_208_0;
              stackIn_213_1 = stackOut_208_1;
              stackIn_209_0 = stackOut_208_0;
              stackIn_209_1 = stackOut_208_1;
              if (param1) {
                break L71;
              } else {
                stackOut_209_0 = (hl) (Object) stackIn_209_0;
                stackOut_209_1 = stackIn_209_1;
                stackIn_210_0 = stackOut_209_0;
                stackIn_210_1 = stackOut_209_1;
                stackOut_210_0 = (hl) (Object) stackIn_210_0;
                stackOut_210_1 = stackIn_210_1;
                stackIn_213_0 = stackOut_210_0;
                stackIn_213_1 = stackOut_210_1;
                stackIn_211_0 = stackOut_210_0;
                stackIn_211_1 = stackOut_210_1;
                if (!lg.field_S) {
                  break L71;
                } else {
                  stackOut_211_0 = (hl) (Object) stackIn_211_0;
                  stackOut_211_1 = stackIn_211_1;
                  stackIn_212_0 = stackOut_211_0;
                  stackIn_212_1 = stackOut_211_1;
                  stackOut_212_0 = (hl) (Object) stackIn_212_0;
                  stackOut_212_1 = stackIn_212_1;
                  stackOut_212_2 = 1;
                  stackIn_214_0 = stackOut_212_0;
                  stackIn_214_1 = stackOut_212_1;
                  stackIn_214_2 = stackOut_212_2;
                  break L70;
                }
              }
            }
          }
          stackOut_213_0 = (hl) (Object) stackIn_213_0;
          stackOut_213_1 = stackIn_213_1;
          stackOut_213_2 = 0;
          stackIn_214_0 = stackOut_213_0;
          stackIn_214_1 = stackOut_213_1;
          stackIn_214_2 = stackOut_213_2;
          break L70;
        }
        L72: {
          ((hl) (Object) stackIn_214_0).a(stackIn_214_1, stackIn_214_2 != 0);
          we.field_e.field_g.c(true);
          if (qb.field_N == null) {
            break L72;
          } else {
            L73: {
              if ((qi.field_n.field_F ^ -1) != -1) {
                g.e(qb.field_N.j(-56), -125, param2);
                break L73;
              } else {
                break L73;
              }
            }
            L74: {
              if ((nm.field_n.field_F ^ -1) != -1) {
                lg.field_S = true;
                break L74;
              } else {
                break L74;
              }
            }
            L75: {
              if (0 == rn.field_c.field_F) {
                break L75;
              } else {
                uf.field_b = true;
                break L75;
              }
            }
            L76: {
              if (0 == c.field_b.field_F) {
                break L76;
              } else {
                lg.field_S = false;
                break L76;
              }
            }
            hg.a(param2, qb.field_N, 30544, false);
            break L72;
          }
        }
    }

    final static void a(int param0, bh param1) {
        try {
            RuntimeException runtimeException = null;
            byte[] var2 = null;
            int var3 = 0;
            Exception var3_ref_Exception = null;
            int var4 = 0;
            int var5 = 0;
            int stackIn_5_0 = 0;
            int stackIn_5_1 = 0;
            int stackIn_15_0 = 0;
            int stackIn_15_1 = 0;
            RuntimeException stackIn_26_0 = null;
            StringBuilder stackIn_26_1 = null;
            RuntimeException stackIn_28_0 = null;
            StringBuilder stackIn_28_1 = null;
            RuntimeException stackIn_29_0 = null;
            StringBuilder stackIn_29_1 = null;
            String stackIn_29_2 = null;
            int stackOut_4_0 = 0;
            int stackOut_4_1 = 0;
            int stackOut_14_0 = 0;
            int stackOut_14_1 = 0;
            RuntimeException stackOut_25_0 = null;
            StringBuilder stackOut_25_1 = null;
            RuntimeException stackOut_26_0 = null;
            StringBuilder stackOut_26_1 = null;
            String stackOut_26_2 = null;
            RuntimeException stackOut_28_0 = null;
            StringBuilder stackOut_28_1 = null;
            String stackOut_28_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = TetraLink.field_J;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var2 = new byte[24];
                            if (sk.field_f == null) {
                                statePc = 22;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            sk.field_f.a(0L, 0);
                            sk.field_f.a(var2, (byte) 66);
                            var3 = 0;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof Exception ? 19 : 24);
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if ((var3 ^ -1) <= -25) {
                                statePc = 14;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = (stateCaught_3 instanceof Exception ? 19 : 24);
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            stackOut_4_0 = -1;
                            stackOut_4_1 = var2[var3] ^ -1;
                            stackIn_15_0 = stackOut_4_0;
                            stackIn_15_1 = stackOut_4_1;
                            stackIn_5_0 = stackOut_4_0;
                            stackIn_5_1 = stackOut_4_1;
                            if (var5 != 0) {
                                statePc = 15;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = (stateCaught_4 instanceof Exception ? 7 : 24);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (stackIn_5_0 == stackIn_5_1) {
                                statePc = 11;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof Exception ? 7 : 24);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof Exception ? 19 : 24);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof Exception ? 19 : 24);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (var5 == 0) {
                                statePc = 14;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof Exception ? 13 : 24);
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = (stateCaught_9 instanceof Exception ? 13 : 24);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            var3++;
                            if (var5 == 0) {
                                statePc = 3;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = (stateCaught_11 instanceof Exception ? 13 : 24);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof Exception ? 19 : 24);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof Exception ? 19 : 24);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            stackOut_14_0 = var3 ^ -1;
                            stackOut_14_1 = -25;
                            stackIn_15_0 = stackOut_14_0;
                            stackIn_15_1 = stackOut_14_1;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof Exception ? 19 : 24);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (stackIn_15_0 > stackIn_15_1) {
                                statePc = 18;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof Exception ? 17 : 24);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof Exception ? 17 : 24);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof Exception ? 19 : 24);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var3_ref_Exception = (Exception) (Object) caughtException;
                            var4 = 0;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (-25 >= (var4 ^ -1)) {
                                statePc = 22;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            var2[var4] = (byte) -1;
                            var4++;
                            if (var5 == 0) {
                                statePc = 20;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var3 = -39 % ((42 - param0) / 51);
                            param1.a(0, 128, var2, 24);
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        runtimeException = (RuntimeException) (Object) caughtException;
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 25: {
                        try {
                            stackOut_25_0 = (RuntimeException) runtimeException;
                            stackOut_25_1 = new StringBuilder().append("mh.A(").append(param0).append(44);
                            stackIn_28_0 = stackOut_25_0;
                            stackIn_28_1 = stackOut_25_1;
                            stackIn_26_0 = stackOut_25_0;
                            stackIn_26_1 = stackOut_25_1;
                            if (param1 == null) {
                                statePc = 28;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 27;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
                            stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
                            stackOut_26_2 = "{...}";
                            stackIn_29_0 = stackOut_26_0;
                            stackIn_29_1 = stackOut_26_1;
                            stackIn_29_2 = stackOut_26_2;
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 27;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        throw (RuntimeException) (Object) caughtException;
                    }
                    case 28: {
                        stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
                        stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
                        stackOut_28_2 = "null";
                        stackIn_29_0 = stackOut_28_0;
                        stackIn_29_1 = stackOut_28_1;
                        stackIn_29_2 = stackOut_28_2;
                        statePc = 29;
                        continue stateLoop;
                    }
                    case 29: {
                        throw oi.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 41);
                    }
                    case 30: {
                        return;
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

    final static int a(int param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_1_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param1 - -param0 - -param2 > ra.field_e) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = param0 + param1;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return stackIn_2_0;
                }
                case 3: {
                    try {
                        if (param3 == -8748) {
                            statePc = 7;
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
                        field_b = 48;
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
                        if (-1 < (-param2 + param1 ^ -1)) {
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
                        stackOut_8_0 = param1 - param2;
                        stackIn_9_0 = stackOut_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return stackIn_9_0;
                }
                case 10: {
                    try {
                        stackOut_10_0 = ra.field_e + -param2;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return stackIn_11_0;
                }
                case 12: {
                    var4 = (RuntimeException) (Object) caughtException;
                    throw oi.a((Throwable) (Object) var4, "mh.E(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final String toString() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          throw new IllegalStateException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var1, "mh.toString()");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "(<%0> players want to join)";
        field_b = 0;
        field_a = 9;
        field_g = -1;
        field_f = "Cancel draw";
    }
}
