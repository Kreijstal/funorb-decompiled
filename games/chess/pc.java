/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc extends ci {
    private ci field_Eb;
    long field_Lb;
    private ci field_Fb;
    private ci field_Hb;
    private ci field_Ib;
    private int field_Gb;
    private ci[] field_Jb;
    private ci field_Nb;
    private ci field_Ob;
    static String field_Qb;
    private he field_Kb;
    private StringBuilder field_Pb;
    static String field_Mb;

    private final int a(ci param0, int param1, int param2, byte param3, ci param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        param1 += 8;
                        if (param3 == -42) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        String discarded$2 = ((pc) this).a(false);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var6_int = param4.field_xb.b(param4.field_db, -(param4.field_z * 2) + param2, param4.field_K);
                        param4.a(0, param2, -2147483648, var6_int, param1);
                        param0.a((byte) 127, param4);
                        param1 = param1 + (0 + var6_int);
                        stackOut_4_0 = param1;
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
                    return stackIn_5_0;
                }
                case 6: {
                    var6 = (RuntimeException) (Object) caughtException;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    try {
                        stackOut_7_0 = (RuntimeException) var6;
                        stackOut_7_1 = new StringBuilder().append("pc.G(");
                        stackIn_10_0 = stackOut_7_0;
                        stackIn_10_1 = stackOut_7_1;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        if (param0 == null) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                        stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                        stackOut_8_2 = "{...}";
                        stackIn_11_0 = stackOut_8_0;
                        stackIn_11_1 = stackOut_8_1;
                        stackIn_11_2 = stackOut_8_2;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 10: {
                    stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                    stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                    stackOut_10_2 = "null";
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    stackIn_11_2 = stackOut_10_2;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    try {
                        stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                        stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
                        stackIn_14_0 = stackOut_11_0;
                        stackIn_14_1 = stackOut_11_1;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        if (param4 == null) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                        stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                        stackOut_12_2 = "{...}";
                        stackIn_15_0 = stackOut_12_0;
                        stackIn_15_1 = stackOut_12_1;
                        stackIn_15_2 = stackOut_12_2;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 14: {
                    stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                    stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                    stackOut_14_2 = "null";
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    stackIn_15_2 = stackOut_14_2;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    throw fk.a((Throwable) (Object) stackIn_15_0, (String) (Object) (stackIn_15_2 + 41));
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    pc(int param0, int param1, int param2, int param3, int param4, ci param5, ci param6, ci param7, ci param8, he param9, ci param10, String param11, long param12) {
        super(0L, param5);
        int var15_int = 0;
        ci[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        Object stackIn_6_0 = null;
        he stackIn_6_1 = null;
        he stackIn_6_2 = null;
        long stackIn_6_3 = 0L;
        he stackIn_6_4 = null;
        Object stackIn_7_0 = null;
        he stackIn_7_1 = null;
        he stackIn_7_2 = null;
        long stackIn_7_3 = 0L;
        he stackIn_7_4 = null;
        Object stackIn_8_0 = null;
        he stackIn_8_1 = null;
        he stackIn_8_2 = null;
        long stackIn_8_3 = 0L;
        he stackIn_8_4 = null;
        Object stackIn_9_0 = null;
        he stackIn_9_1 = null;
        he stackIn_9_2 = null;
        long stackIn_9_3 = 0L;
        he stackIn_9_4 = null;
        Object stackIn_10_0 = null;
        he stackIn_10_1 = null;
        he stackIn_10_2 = null;
        long stackIn_10_3 = 0L;
        he stackIn_10_4 = null;
        String stackIn_10_5 = null;
        Object stackIn_14_0 = null;
        String stackIn_14_1 = null;
        ci stackIn_18_0 = null;
        ci stackIn_19_0 = null;
        ci stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        Object stackIn_23_0 = null;
        String stackIn_23_1 = null;
        Object stackOut_5_0 = null;
        he stackOut_5_1 = null;
        he stackOut_5_2 = null;
        long stackOut_5_3 = 0L;
        he stackOut_5_4 = null;
        Object stackOut_6_0 = null;
        he stackOut_6_1 = null;
        he stackOut_6_2 = null;
        long stackOut_6_3 = 0L;
        he stackOut_6_4 = null;
        Object stackOut_7_0 = null;
        he stackOut_7_1 = null;
        he stackOut_7_2 = null;
        long stackOut_7_3 = 0L;
        he stackOut_7_4 = null;
        Object stackOut_8_0 = null;
        he stackOut_8_1 = null;
        he stackOut_8_2 = null;
        long stackOut_8_3 = 0L;
        he stackOut_8_4 = null;
        String stackOut_8_5 = null;
        Object stackOut_9_0 = null;
        he stackOut_9_1 = null;
        he stackOut_9_2 = null;
        long stackOut_9_3 = 0L;
        he stackOut_9_4 = null;
        String stackOut_9_5 = null;
        Object stackOut_13_0 = null;
        String stackOut_13_1 = null;
        ci stackOut_17_0 = null;
        ci stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        ci stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_22_0 = null;
        String stackOut_22_1 = null;
        L0: {
          L1: {
            var27 = Chess.field_G;
            ((pc) this).field_Gb = -2;
            ((pc) this).field_Lb = param12;
            ((pc) this).field_Nb = new ci(0L, param6, se.field_W.toUpperCase());
            ((pc) this).field_Nb.field_fb = 1;
            ((pc) this).a((byte) 125, ((pc) this).field_Nb);
            ((pc) this).field_Fb = new ci(0L, param7);
            ((pc) this).field_Nb.a((byte) 126, ((pc) this).field_Fb);
            ((pc) this).field_Eb = new ci(0L, (ci) null);
            ((pc) this).a((byte) 125, ((pc) this).field_Eb);
            if (param11 == null) {
              break L1;
            } else {
              L2: {
                L3: {
                  ((pc) this).field_Hb = new ci(0L, param8, af.field_a);
                  ((pc) this).field_Hb.field_ib = 11184810;
                  ((pc) this).field_Hb.field_fb = 1;
                  ((pc) this).field_Eb.a((byte) 127, ((pc) this).field_Hb);
                  ((pc) this).field_Ob = new ci(0L, param8, td.field_m);
                  ((pc) this).field_Ob.field_fb = 1;
                  ((pc) this).field_Ob.field_ib = 11184810;
                  ((pc) this).field_Eb.a((byte) 124, ((pc) this).field_Ob);
                  ((pc) this).field_Ib = new ci(0L, param8);
                  ((pc) this).field_Ib.field_ib = 16764006;
                  ((pc) this).field_Eb.a((byte) 125, ((pc) this).field_Ib);
                  ((pc) this).field_Ib.field_S = "|";
                  if (5 <= sb.field_rb) {
                    break L3;
                  } else {
                    if (sk.field_t >= 2) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                L4: {
                  L5: {
                    stackOut_5_0 = this;
                    stackOut_5_1 = null;
                    stackOut_5_2 = null;
                    stackOut_5_3 = 0L;
                    stackOut_5_4 = (he) param9;
                    stackIn_9_0 = stackOut_5_0;
                    stackIn_9_1 = stackOut_5_1;
                    stackIn_9_2 = stackOut_5_2;
                    stackIn_9_3 = stackOut_5_3;
                    stackIn_9_4 = stackOut_5_4;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    stackIn_6_2 = stackOut_5_2;
                    stackIn_6_3 = stackOut_5_3;
                    stackIn_6_4 = stackOut_5_4;
                    if (sb.field_rb >= 7) {
                      break L5;
                    } else {
                      stackOut_6_0 = this;
                      stackOut_6_1 = null;
                      stackOut_6_2 = null;
                      stackOut_6_3 = stackIn_6_3;
                      stackOut_6_4 = (he) (Object) stackIn_6_4;
                      stackIn_9_0 = stackOut_6_0;
                      stackIn_9_1 = stackOut_6_1;
                      stackIn_9_2 = stackOut_6_2;
                      stackIn_9_3 = stackOut_6_3;
                      stackIn_9_4 = stackOut_6_4;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      stackIn_7_2 = stackOut_6_2;
                      stackIn_7_3 = stackOut_6_3;
                      stackIn_7_4 = stackOut_6_4;
                      if ((sk.field_t ^ -1) <= -3) {
                        break L5;
                      } else {
                        stackOut_7_0 = this;
                        stackOut_7_1 = null;
                        stackOut_7_2 = null;
                        stackOut_7_3 = stackIn_7_3;
                        stackOut_7_4 = (he) (Object) stackIn_7_4;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        stackIn_8_2 = stackOut_7_2;
                        stackIn_8_3 = stackOut_7_3;
                        stackIn_8_4 = stackOut_7_4;
                        stackOut_8_0 = this;
                        stackOut_8_1 = null;
                        stackOut_8_2 = null;
                        stackOut_8_3 = stackIn_8_3;
                        stackOut_8_4 = (he) (Object) stackIn_8_4;
                        stackOut_8_5 = jd.field_a;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        stackIn_10_2 = stackOut_8_2;
                        stackIn_10_3 = stackOut_8_3;
                        stackIn_10_4 = stackOut_8_4;
                        stackIn_10_5 = stackOut_8_5;
                        break L4;
                      }
                    }
                  }
                  stackOut_9_0 = this;
                  stackOut_9_1 = null;
                  stackOut_9_2 = null;
                  stackOut_9_3 = stackIn_9_3;
                  stackOut_9_4 = (he) (Object) stackIn_9_4;
                  stackOut_9_5 = h.field_m;
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  stackIn_10_2 = stackOut_9_2;
                  stackIn_10_3 = stackOut_9_3;
                  stackIn_10_4 = stackOut_9_4;
                  stackIn_10_5 = stackOut_9_5;
                  break L4;
                }
                new he(stackIn_10_3, (he) (Object) stackIn_10_4, (String) (Object) stackIn_10_5);
                ((pc) this).field_Kb = (he) (Object) stackIn_10_1;
                ((pc) this).field_Eb.a((byte) 127, (ci) (Object) ((pc) this).field_Kb);
                break L2;
              }
              var15 = new ci[3];
              var15[0] = new ci(0L, (ci) null);
              ((pc) this).field_Eb.a((byte) 126, var15[0]);
              var15[1] = new ci(0L, (ci) null);
              ((pc) this).field_Eb.a((byte) 126, var15[1]);
              var15[2] = new ci(0L, (ci) null);
              ((pc) this).field_Eb.a((byte) 124, var15[2]);
              ((pc) this).field_Jb = new ci[re.field_j];
              var16 = 0;
              L6: while (true) {
                L7: {
                  L8: {
                    if ((var16 ^ -1) <= (re.field_j ^ -1)) {
                      break L8;
                    } else {
                      stackOut_13_0 = null;
                      stackOut_13_1 = mi.field_t[var16];
                      stackIn_23_0 = stackOut_13_0;
                      stackIn_23_1 = stackOut_13_1;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      if (var27 != 0) {
                        break L7;
                      } else {
                        L9: {
                          if ((Object) (Object) stackIn_14_0 != (Object) (Object) stackIn_14_1) {
                            L10: {
                              ((pc) this).field_Jb[var16] = new ci(0L, param10, mi.field_t[var16]);
                              ((pc) this).field_Jb[var16].field_fb = 0;
                              stackOut_17_0 = ((pc) this).field_Jb[var16];
                              stackIn_19_0 = stackOut_17_0;
                              stackIn_18_0 = stackOut_17_0;
                              if (param11 == null) {
                                stackOut_19_0 = (ci) (Object) stackIn_19_0;
                                stackOut_19_1 = 0;
                                stackIn_20_0 = stackOut_19_0;
                                stackIn_20_1 = stackOut_19_1;
                                break L10;
                              } else {
                                stackOut_18_0 = (ci) (Object) stackIn_18_0;
                                stackOut_18_1 = 1;
                                stackIn_20_0 = stackOut_18_0;
                                stackIn_20_1 = stackOut_18_1;
                                break L10;
                              }
                            }
                            ((ci) (Object) stackIn_20_0).field_tb = stackIn_20_1 != 0;
                            ((pc) this).field_Eb.a((byte) 125, ((pc) this).field_Jb[var16]);
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        var16++;
                        if (var27 == 0) {
                          continue L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  ((pc) this).field_Pb = new StringBuilder(12);
                  stackOut_22_0 = null;
                  stackOut_22_1 = (String) param11;
                  stackIn_23_0 = stackOut_22_0;
                  stackIn_23_1 = stackOut_22_1;
                  break L7;
                }
                L11: {
                  if ((Object) (Object) stackIn_23_0 == (Object) (Object) stackIn_23_1) {
                    break L11;
                  } else {
                    StringBuilder discarded$1 = ((pc) this).field_Pb.append(param11);
                    break L11;
                  }
                }
                L12: {
                  var16 = 0;
                  var17 = param6.field_xb.b(cl.field_h);
                  if (var16 < var17) {
                    var16 = var17;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  var17 = param6.field_xb.b(nb.field_Gb);
                  if ((var16 ^ -1) > (var17 ^ -1)) {
                    var16 = var17;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L14: {
                  var17 = param6.field_xb.b(qh.field_d);
                  if (var16 < var17) {
                    var16 = var17;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                var17 = 0;
                L15: while (true) {
                  L16: {
                    L17: {
                      if (var17 >= re.field_j) {
                        break L17;
                      } else {
                        if (var27 != 0) {
                          break L16;
                        } else {
                          L18: {
                            if (((pc) this).field_Jb[var17] == null) {
                              break L18;
                            } else {
                              var18 = ((pc) this).field_Jb[var17].e((byte) -88);
                              if (var18 <= var16) {
                                break L18;
                              } else {
                                var16 = var18;
                                break L18;
                              }
                            }
                          }
                          var17++;
                          if (var27 == 0) {
                            continue L15;
                          } else {
                            break L17;
                          }
                        }
                      }
                    }
                    L19: {
                      if (var16 <= 140) {
                        break L19;
                      } else {
                        var16 = 140;
                        break L19;
                      }
                    }
                    var17 = 0;
                    break L16;
                  }
                  L20: {
                    var18 = 0;
                    var18 = 0;
                    var18 = this.a(cl.field_h, (byte) 108, param6, var18, var16, var15[0]);
                    var18 = this.a(var15[0], var18, var16, (byte) -42, ((pc) this).field_Jb[6]);
                    var18 = this.a(var15[0], var18, var16, (byte) -42, ((pc) this).field_Jb[9]);
                    var18 = this.a(var15[0], var18, var16, (byte) -42, ((pc) this).field_Jb[5]);
                    var18 = this.a(var15[0], var18, var16, (byte) -42, ((pc) this).field_Jb[7]);
                    var18 = this.a(var15[0], var18, var16, (byte) -42, ((pc) this).field_Jb[15]);
                    var18 = this.a(var15[0], var18, var16, (byte) -42, ((pc) this).field_Jb[4]);
                    if (var17 < var18) {
                      var17 = var18;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  L21: {
                    var18 = 0;
                    var18 = this.a(nb.field_Gb, (byte) 108, param6, var18, var16, var15[1]);
                    var18 = this.a(var15[1], var18, var16, (byte) -42, ((pc) this).field_Jb[16]);
                    var18 = this.a(var15[1], var18, var16, (byte) -42, ((pc) this).field_Jb[17]);
                    var18 = this.a(var15[1], var18, var16, (byte) -42, ((pc) this).field_Jb[18]);
                    var18 = this.a(var15[1], var18, var16, (byte) -42, ((pc) this).field_Jb[19]);
                    var18 = this.a(var15[1], var18, var16, (byte) -42, ((pc) this).field_Jb[20]);
                    if ((var18 ^ -1) >= (var17 ^ -1)) {
                      break L21;
                    } else {
                      var17 = var18;
                      break L21;
                    }
                  }
                  L22: {
                    var18 = 0;
                    var18 = this.a(qh.field_d, (byte) 108, param6, var18, var16, var15[2]);
                    var18 = this.a(var15[2], var18, var16, (byte) -42, ((pc) this).field_Jb[13]);
                    var18 = this.a(var15[2], var18, var16, (byte) -42, ((pc) this).field_Jb[21]);
                    var18 = this.a(var15[2], var18, var16, (byte) -42, ((pc) this).field_Jb[11]);
                    if ((var17 ^ -1) > (var18 ^ -1)) {
                      var17 = var18;
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                  L23: {
                    var19 = 26 + 3 * var16;
                    var20 = ((pc) this).field_Nb.e((byte) 122);
                    if (var20 > var19) {
                      var19 = var20;
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                  L24: {
                    if (null == ((pc) this).field_Kb) {
                      break L24;
                    } else {
                      var20 = ((pc) this).field_Kb.a((byte) 119, 4);
                      if (var20 <= var19) {
                        break L24;
                      } else {
                        var19 = var20;
                        break L24;
                      }
                    }
                  }
                  L25: {
                    ((pc) this).field_Nb.a(0, 13 + (var19 - -13), -2147483648, 24, 0);
                    ((pc) this).field_Fb.a(-20 + ((pc) this).field_Nb.field_M, 15, -2147483648, 15, 5);
                    var21 = 10;
                    ((pc) this).field_Hb.a(13, var19, -2147483648, fe.field_g * 2, var21);
                    var21 = var21 + 2 * fe.field_g;
                    ((pc) this).field_Ob.a(13, var19, -2147483648, fe.field_g * 2, var21);
                    var21 = var21 + (fe.field_g * 2 - -10);
                    ((pc) this).field_Ib.a(0, 0, -2147483648, fe.field_g, var21);
                    var21 = var21 + (10 + fe.field_g);
                    if (((pc) this).field_Kb != null) {
                      var20 = ((pc) this).field_Kb.a((byte) 123, 4);
                      ((pc) this).field_Kb.a(fe.field_g, 13 - -((-var20 + var19) / 2), (byte) 127, 4, var20, var21);
                      var21 = var21 + (fe.field_g + 10);
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  var15[0].a(13, var16, -2147483648, var17, var21);
                  var15[1].a(26 + var16, var16, -2147483648, var17, var21);
                  var15[2].a(26 + 2 * var16 + 13, var16, -2147483648, var17, var21);
                  var22 = var21;
                  ((pc) this).field_Eb.a(0, 13 + var19 + 13, -2147483648, var22 - (-var17 - 10), 24);
                  ((pc) this).field_Eb.field_Ab = wh.a(-116, ((pc) this).field_Eb.field_pb, 3, 11579568, 8421504, 2105376);
                  var23 = var19 + 13 - -13;
                  var24 = 24 + var22 + (var17 + 10);
                  var25 = ao.a(var23, true, param0, param2);
                  var26 = sg.a(param1, var24, param3, 0);
                  ((pc) this).a(var25, var23, -2147483648, var24, var26);
                  if (var27 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          ((pc) this).field_Hb = new ci(0L, param8, rf.field_c);
          ((pc) this).field_Hb.field_ib = 11184810;
          ((pc) this).field_Hb.field_fb = 1;
          ((pc) this).field_Eb.a((byte) 125, ((pc) this).field_Hb);
          var15_int = 226;
          var16 = 10;
          var17 = ((pc) this).field_Hb.field_xb.b(((pc) this).field_Hb.field_db, var15_int);
          ((pc) this).field_Hb.a(13, var15_int, -2147483648, fe.field_g * var17, var16);
          var16 = var16 + fe.field_g * var17;
          ((pc) this).field_Eb.a(0, 13 + var15_int + 13, -2147483648, var16 + 10, 24);
          ((pc) this).field_Eb.field_Ab = wh.a(93, ((pc) this).field_Eb.field_pb, 3, 11579568, 8421504, 2105376);
          var18 = 26 + var15_int;
          var19 = var16 + 34;
          var20 = ao.a(var18, true, param0, param2);
          var21 = sg.a(param1, var19, param3, 0);
          ((pc) this).a(var20, var18, -2147483648, var19, var21);
          break L0;
        }
    }

    final String a(boolean param0) {
        RuntimeException var2 = null;
        String stackIn_5_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        try {
          try {
            L0: {
              if (param0) {
                break L0;
              } else {
                ((pc) this).field_Pb = null;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = ((pc) this).field_Pb.toString();
          stackIn_5_0 = stackOut_4_0;
        }
        return null;
    }

    private final int a(String param0, byte param1, ci param2, int param3, int param4, ci param5) {
        ci var7 = null;
        RuntimeException var7_ref = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var7 = new ci(0L, param2, 0, param3, param4, 24, param0);
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        if (param1 == 108) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_Qb = null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        param5.a((byte) 126, var7);
                        param3 += 32;
                        stackOut_5_0 = param3;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0;
                }
                case 7: {
                    var7_ref = (RuntimeException) (Object) caughtException;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    try {
                        stackOut_8_0 = (RuntimeException) var7_ref;
                        stackOut_8_1 = new StringBuilder().append("pc.A(");
                        stackIn_11_0 = stackOut_8_0;
                        stackIn_11_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (param0 == null) {
                            statePc = 11;
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
                        stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                        stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                        stackOut_9_2 = "{...}";
                        stackIn_12_0 = stackOut_9_0;
                        stackIn_12_1 = stackOut_9_1;
                        stackIn_12_2 = stackOut_9_2;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 11: {
                    stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                    stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                    stackOut_11_2 = "null";
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    try {
                        stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                        stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44).append(param1).append(44);
                        stackIn_15_0 = stackOut_12_0;
                        stackIn_15_1 = stackOut_12_1;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        if (param2 == null) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                        stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                        stackOut_13_2 = "{...}";
                        stackIn_16_0 = stackOut_13_0;
                        stackIn_16_1 = stackOut_13_1;
                        stackIn_16_2 = stackOut_13_2;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 15: {
                    stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                    stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                    stackOut_15_2 = "null";
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    stackIn_16_2 = stackOut_15_2;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    try {
                        stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                        stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44).append(param3).append(44).append(param4).append(44);
                        stackIn_19_0 = stackOut_16_0;
                        stackIn_19_1 = stackOut_16_1;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        if (param5 == null) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                        stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                        stackOut_17_2 = "{...}";
                        stackIn_20_0 = stackOut_17_0;
                        stackIn_20_1 = stackOut_17_1;
                        stackIn_20_2 = stackOut_17_2;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 19: {
                    stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                    stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                    stackOut_19_2 = "null";
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    stackIn_20_2 = stackOut_19_2;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    throw fk.a((Throwable) (Object) stackIn_20_0, (String) (Object) (stackIn_20_2 + 41));
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int b(boolean param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        he stackIn_9_0 = null;
        he stackIn_11_0 = null;
        he stackIn_13_0 = null;
        he stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackIn_19_0 = null;
        ci stackIn_25_0 = null;
        ci stackIn_27_0 = null;
        ci stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_58_0 = 0;
        he stackOut_8_0 = null;
        he stackOut_9_0 = null;
        he stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        he stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_18_0 = null;
        ci stackOut_24_0 = null;
        ci stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        ci stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_57_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Chess.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((pc) this).a(param0, (byte) 88);
                        if (((pc) this).field_Ib != null) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ((pc) this).field_Ib.field_db = ((pc) this).field_Pb.toString();
                        ((pc) this).field_Ib.field_mb = (((pc) this).field_M + -((pc) this).field_Ib.field_xb.b(((pc) this).field_Ib.field_db)) / 2;
                        ((pc) this).field_Ib.field_M = -((pc) this).field_Ib.field_mb + ((pc) this).field_M;
                        if (((pc) this).field_Kb == null) {
                            statePc = 15;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (-1 == (((pc) this).field_Kb.field_L ^ -1)) {
                            statePc = 15;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = ((pc) this).field_Kb;
                        stackIn_13_0 = stackOut_8_0;
                        stackIn_9_0 = stackOut_8_0;
                        if (((pc) this).field_Kb.field_gb) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = (he) (Object) stackIn_9_0;
                        stackIn_11_0 = stackOut_9_0;
                        statePc = 11;
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
                case 11: {
                    try {
                        stackOut_11_0 = (he) (Object) stackIn_11_0;
                        stackOut_11_1 = 1;
                        stackIn_14_0 = stackOut_11_0;
                        stackIn_14_1 = stackOut_11_1;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = (he) (Object) stackIn_13_0;
                        stackOut_13_1 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        ((he) (Object) stackIn_14_0).field_gb = stackIn_14_1 != 0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var3_int = 0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if ((var3_int ^ -1) <= (re.field_j ^ -1)) {
                            statePc = 35;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var4 != 0) {
                            statePc = 38;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackOut_18_0 = null;
                        stackIn_19_0 = stackOut_18_0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if ((Object) (Object) stackIn_19_0 != (Object) (Object) ((pc) this).field_Jb[var3_int]) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackOut_24_0 = ((pc) this).field_Jb[var3_int];
                        stackIn_27_0 = stackOut_24_0;
                        stackIn_25_0 = stackOut_24_0;
                        if (((pc) this).field_Pb.length() <= 0) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackOut_25_0 = (ci) (Object) stackIn_25_0;
                        stackOut_25_1 = 1;
                        stackIn_28_0 = stackOut_25_0;
                        stackIn_28_1 = stackOut_25_1;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackOut_27_0 = (ci) (Object) stackIn_27_0;
                        stackOut_27_1 = 0;
                        stackIn_28_0 = stackOut_27_0;
                        stackIn_28_1 = stackOut_27_1;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        ((ci) (Object) stackIn_28_0).field_tb = stackIn_28_1 != 0;
                        if (!((pc) this).field_Jb[var3_int].field_tb) {
                            statePc = 34;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (-1 == (((pc) this).field_Jb[var3_int].field_L ^ -1)) {
                            statePc = 34;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackOut_32_0 = var3_int;
                        stackIn_33_0 = stackOut_32_0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 33: {
                    return stackIn_33_0;
                }
                case 34: {
                    try {
                        var3_int++;
                        if (var4 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (((pc) this).field_Fb.field_L != 0) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackOut_38_0 = -1;
                        stackIn_39_0 = stackOut_38_0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 39: {
                    return stackIn_39_0;
                }
                case 40: {
                    try {
                        if (!param0) {
                            statePc = 53;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackOut_41_0 = 0;
                        stackIn_42_0 = stackOut_41_0;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (stackIn_42_0 == th.field_d) {
                            statePc = 53;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackOut_45_0 = -1;
                        stackIn_46_0 = stackOut_45_0;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (stackIn_46_0 == (((pc) this).field_L ^ -1)) {
                            statePc = 51;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackOut_51_0 = -1;
                        stackIn_52_0 = stackOut_51_0;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 52: {
                    return stackIn_52_0;
                }
                case 53: {
                    try {
                        if (param1 == -95) {
                            statePc = 57;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        ((pc) this).field_Ib = null;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        stackOut_57_0 = ((pc) this).field_Gb;
                        stackIn_58_0 = stackOut_57_0;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 58: {
                    return stackIn_58_0;
                }
                case 59: {
                    var3 = (RuntimeException) (Object) caughtException;
                    throw fk.a((Throwable) (Object) var3, "pc.E(" + param0 + 44 + param1 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean f(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_11_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if ((((pc) this).field_Gb ^ -1) == 1) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = 0;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return stackIn_2_0 != 0;
                }
                case 3: {
                    try {
                        if (param0 == 95) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ((pc) this).field_Nb = null;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (-14 == (vg.field_a ^ -1)) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        ((pc) this).field_Gb = -1;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = 1;
                        stackIn_12_0 = stackOut_11_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return stackIn_12_0 != 0;
                }
                case 13: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw fk.a((Throwable) (Object) var2, "pc.H(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean b(boolean param0) {
        RuntimeException var2 = null;
        Object stackIn_6_0 = null;
        int stackIn_12_0 = 0;
        Object stackOut_5_0 = null;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (!param0) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        pc.a(false, 126, false, false, 82);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (null == ((pc) this).field_Kb) {
                            statePc = 11;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = this;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (!((pc) this).field_Kb.field_gb) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = 1;
                        stackIn_12_0 = stackOut_9_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = 0;
                        stackIn_12_0 = stackOut_11_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return stackIn_12_0 != 0;
                }
                case 13: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw fk.a((Throwable) (Object) var2, "pc.D(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(boolean param0, int param1, boolean param2, boolean param3, int param4) {
        RuntimeException var5 = null;
        ci var5_ref = null;
        int var5_int = 0;
        ci var6 = null;
        ci var7 = null;
        ci var8 = null;
        String var9_ref = null;
        int var9 = 0;
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
        jc var17 = null;
        r var18 = null;
        int var18_int = 0;
        int var19 = 0;
        boolean stackIn_19_0 = false;
        ci stackIn_27_0 = null;
        ci stackIn_28_0 = null;
        long stackIn_28_1 = 0L;
        ci stackIn_29_0 = null;
        ci stackIn_31_0 = null;
        ci stackIn_33_0 = null;
        ci stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        int stackIn_68_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_87_1 = 0;
        int stackIn_89_0 = 0;
        int stackIn_89_1 = 0;
        int stackIn_96_0 = 0;
        int stackIn_101_0 = 0;
        boolean[] stackIn_103_0 = null;
        int[][] stackIn_114_0 = null;
        int[][] stackIn_118_0 = null;
        Object stackIn_129_0 = null;
        boolean[][] stackIn_133_0 = null;
        Object stackIn_144_0 = null;
        int[][] stackIn_161_0 = null;
        int[][] stackIn_178_0 = null;
        boolean stackIn_189_0 = false;
        r stackIn_196_0 = null;
        int stackIn_228_0 = 0;
        boolean[] stackIn_230_0 = null;
        boolean stackIn_258_0 = false;
        int stackIn_266_0 = 0;
        ci stackIn_282_0 = null;
        ci stackIn_283_0 = null;
        boolean stackIn_283_1 = false;
        ci stackIn_284_0 = null;
        ci stackIn_286_0 = null;
        ci stackIn_287_0 = null;
        boolean stackIn_287_1 = false;
        ci stackIn_288_0 = null;
        ci stackIn_290_0 = null;
        ci stackIn_292_0 = null;
        ci stackIn_293_0 = null;
        int stackIn_293_1 = 0;
        ci stackIn_294_0 = null;
        ci stackIn_295_0 = null;
        boolean stackIn_295_1 = false;
        ci stackIn_296_0 = null;
        ci stackIn_298_0 = null;
        ci stackIn_299_0 = null;
        boolean stackIn_299_1 = false;
        ci stackIn_300_0 = null;
        ci stackIn_302_0 = null;
        ci stackIn_304_0 = null;
        ci stackIn_305_0 = null;
        int stackIn_305_1 = 0;
        ci stackIn_306_0 = null;
        ci stackIn_307_0 = null;
        boolean stackIn_307_1 = false;
        ci stackIn_308_0 = null;
        ci stackIn_310_0 = null;
        ci stackIn_311_0 = null;
        boolean stackIn_311_1 = false;
        ci stackIn_312_0 = null;
        ci stackIn_314_0 = null;
        ci stackIn_316_0 = null;
        ci stackIn_317_0 = null;
        int stackIn_317_1 = 0;
        Throwable caughtException = null;
        boolean stackOut_18_0 = false;
        ci stackOut_26_0 = null;
        ci stackOut_27_0 = null;
        long stackOut_27_1 = 0L;
        ci stackOut_28_0 = null;
        ci stackOut_29_0 = null;
        ci stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        ci stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        int stackOut_54_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_58_1 = 0;
        int stackOut_65_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_86_1 = 0;
        int stackOut_88_0 = 0;
        int stackOut_88_1 = 0;
        int stackOut_95_0 = 0;
        int stackOut_100_0 = 0;
        boolean[] stackOut_102_0 = null;
        int[][] stackOut_113_0 = null;
        int[][] stackOut_117_0 = null;
        Object stackOut_128_0 = null;
        boolean[][] stackOut_132_0 = null;
        Object stackOut_143_0 = null;
        int[][] stackOut_160_0 = null;
        int[][] stackOut_177_0 = null;
        boolean stackOut_188_0 = false;
        r stackOut_195_0 = null;
        int stackOut_227_0 = 0;
        boolean[] stackOut_229_0 = null;
        boolean stackOut_257_0 = false;
        int stackOut_265_0 = 0;
        ci stackOut_281_0 = null;
        ci stackOut_282_0 = null;
        boolean stackOut_282_1 = false;
        ci stackOut_283_0 = null;
        ci stackOut_284_0 = null;
        ci stackOut_286_0 = null;
        boolean stackOut_286_1 = false;
        ci stackOut_287_0 = null;
        ci stackOut_288_0 = null;
        ci stackOut_290_0 = null;
        int stackOut_290_1 = 0;
        ci stackOut_292_0 = null;
        int stackOut_292_1 = 0;
        ci stackOut_293_0 = null;
        ci stackOut_294_0 = null;
        boolean stackOut_294_1 = false;
        ci stackOut_295_0 = null;
        ci stackOut_296_0 = null;
        ci stackOut_298_0 = null;
        boolean stackOut_298_1 = false;
        ci stackOut_299_0 = null;
        ci stackOut_300_0 = null;
        ci stackOut_302_0 = null;
        int stackOut_302_1 = 0;
        ci stackOut_304_0 = null;
        int stackOut_304_1 = 0;
        ci stackOut_305_0 = null;
        ci stackOut_306_0 = null;
        boolean stackOut_306_1 = false;
        ci stackOut_307_0 = null;
        ci stackOut_308_0 = null;
        ci stackOut_310_0 = null;
        boolean stackOut_310_1 = false;
        ci stackOut_311_0 = null;
        ci stackOut_312_0 = null;
        ci stackOut_314_0 = null;
        int stackOut_314_1 = 0;
        ci stackOut_316_0 = null;
        int stackOut_316_1 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = Chess.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    f.a(ed.field_c, true);
                    if (null == pd.field_Rb) {
                        statePc = 281;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    sc.field_d.field_tb = true;
                    uj.field_j.field_pb = 0;
                    var5_ref = uj.field_j;
                    var5_ref.field_M = 0;
                    aa.field_g.field_pb = 0;
                    var6 = aa.field_g;
                    var6.field_M = 0;
                    tn.field_j.field_pb = 0;
                    var7 = tn.field_j;
                    var7.field_M = 0;
                    if (!ci.f(-12)) {
                        statePc = 275;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    sc.field_f.field_db = ge.field_cb.toUpperCase();
                    var9 = (2 + ri.field_k.field_M) / 2;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    uj.field_j.a(0, var9 - 2, -2147483648, 40, -40 + ri.field_k.field_pb);
                    if (pd.field_Rb.field_Xb >= pd.field_Rb.field_hc) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    uj.field_j.field_db = uh.field_v.toUpperCase();
                    uj.field_j.field_tb = true;
                    if (var19 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    uj.field_j.field_db = oj.field_b.toUpperCase();
                    uj.field_j.field_tb = false;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    uj.field_j.field_Ab = nj.field_x.field_Ab;
                    if (cb.field_f > 0) {
                        statePc = 14;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (1 != cb.field_f) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var10_ref = ob.field_A;
                    if (var19 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var10_ref = oc.a(tg.field_b, new String[1], (byte) -119);
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    uj.field_j.field_db = uj.field_j.field_db + "<br>" + var10_ref;
                    if ((16 & g.field_c) != 0) {
                        statePc = 25;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackOut_18_0 = jh.field_a;
                    stackIn_19_0 = stackOut_18_0;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (!stackIn_19_0) {
                        statePc = 24;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 24: {
                    uj.field_j.field_Ab = nj.field_x.field_Q;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    aa.field_g.a(var9, ri.field_k.field_M + -var9, -2147483648, 40, ri.field_k.field_pb + -40);
                    aa.field_g.field_db = fl.field_k.toUpperCase();
                    var8 = aa.field_g;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    stackOut_26_0 = aa.field_g;
                    stackIn_33_0 = stackOut_26_0;
                    stackIn_27_0 = stackOut_26_0;
                    if (!param2) {
                        statePc = 33;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    stackOut_27_0 = (ci) (Object) stackIn_27_0;
                    stackOut_27_1 = 0L;
                    stackIn_28_0 = stackOut_27_0;
                    stackIn_28_1 = stackOut_27_1;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    stackOut_28_0 = (ci) (Object) stackIn_28_0;
                    stackIn_33_0 = stackOut_28_0;
                    stackIn_29_0 = stackOut_28_0;
                    if (stackIn_28_1 != eg.field_e) {
                        statePc = 33;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    stackOut_29_0 = (ci) (Object) stackIn_29_0;
                    stackIn_31_0 = stackOut_29_0;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    stackOut_31_0 = (ci) (Object) stackIn_31_0;
                    stackOut_31_1 = 1;
                    stackIn_34_0 = stackOut_31_0;
                    stackIn_34_1 = stackOut_31_1;
                    statePc = 34;
                    continue stateLoop;
                }
                case 33: {
                    stackOut_33_0 = (ci) (Object) stackIn_33_0;
                    stackOut_33_1 = 0;
                    stackIn_34_0 = stackOut_33_0;
                    stackIn_34_1 = stackOut_33_1;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    ((ci) (Object) stackIn_34_0).field_tb = stackIn_34_1 != 0;
                    var10 = 2;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (null != hd.field_n) {
                        statePc = 38;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (null != d.field_Jb) {
                        statePc = 42;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    bi.field_d = new boolean[qa.field_e];
                    d.field_Jb = new byte[qa.field_e];
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    var11_int = 0;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    if ((var11_int ^ -1) <= (qa.field_e ^ -1)) {
                        statePc = 48;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    bi.field_d[var11_int] = false;
                    var11_int++;
                    if (var19 != 0) {
                        statePc = 49;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if (var19 == 0) {
                        statePc = 43;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    var10 = 0;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    if (2 <= var10) {
                        statePc = 100;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var11_int = 0;
                    stackOut_50_0 = 0;
                    stackIn_101_0 = stackOut_50_0;
                    stackIn_51_0 = stackOut_50_0;
                    if (var19 != 0) {
                        statePc = 101;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    var12 = stackIn_51_0;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    stackOut_52_0 = var12 ^ -1;
                    stackOut_52_1 = hd.field_n.length ^ -1;
                    stackIn_53_0 = stackOut_52_0;
                    stackIn_53_1 = stackOut_52_1;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    if (stackIn_53_0 <= stackIn_53_1) {
                        statePc = 95;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    var13_array = hd.field_n[var12];
                    stackOut_54_0 = 0;
                    stackIn_96_0 = stackOut_54_0;
                    stackIn_55_0 = stackOut_54_0;
                    if (var19 != 0) {
                        statePc = 96;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    var14_int = stackIn_55_0;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    if ((var13_array.length ^ -1) >= (var14_int ^ -1)) {
                        statePc = 85;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    var15 = var13_array[var14_int];
                    var16 = var13_array[1 + var14_int];
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    stackOut_58_0 = var15;
                    stackOut_58_1 = -1;
                    stackIn_87_0 = stackOut_58_0;
                    stackIn_87_1 = stackOut_58_1;
                    stackIn_59_0 = stackOut_58_0;
                    stackIn_59_1 = stackOut_58_1;
                    if (var19 != 0) {
                        statePc = 87;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    if (stackIn_59_0 != stackIn_59_1) {
                        statePc = 76;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    if (0 == var10) {
                        statePc = 67;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    stackOut_65_0 = pd.field_Rb.field_Xb;
                    stackIn_68_0 = stackOut_65_0;
                    statePc = 68;
                    continue stateLoop;
                }
                case 67: {
                    stackOut_67_0 = pd.field_Rb.field_hc;
                    stackIn_68_0 = stackOut_67_0;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    var17_int = stackIn_68_0;
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    if ((var16 ^ -1) == (var17_int ^ -1)) {
                        statePc = 73;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    if (var19 == 0) {
                        statePc = 94;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    if (var19 == 0) {
                        statePc = 82;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    if ((var16 ^ -1) == (255 & pd.field_Rb.field_sc[var15] ^ -1)) {
                        statePc = 82;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    if (var19 == 0) {
                        statePc = 94;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    var14_int += 2;
                    if (var19 == 0) {
                        statePc = 56;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    var11_int = 1;
                    var14_int = -1;
                    var15 = 0;
                    statePc = 86;
                    continue stateLoop;
                }
                case 86: {
                    stackOut_86_0 = var13_array.length ^ -1;
                    stackOut_86_1 = var15 ^ -1;
                    stackIn_87_0 = stackOut_86_0;
                    stackIn_87_1 = stackOut_86_1;
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    if (stackIn_87_0 >= stackIn_87_1) {
                        statePc = 93;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    var16 = var13_array[var15];
                    stackOut_88_0 = var14_int;
                    stackOut_88_1 = var16;
                    stackIn_53_0 = stackOut_88_0;
                    stackIn_53_1 = stackOut_88_1;
                    stackIn_89_0 = stackOut_88_0;
                    stackIn_89_1 = stackOut_88_1;
                    if (var19 != 0) {
                        statePc = 53;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    if (stackIn_89_0 < stackIn_89_1) {
                        statePc = 91;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 91: {
                    var14_int = var16;
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    var15 += 2;
                    if (var19 == 0) {
                        statePc = 86;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    bi.field_d[var14_int] = true;
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    var12++;
                    if (var19 == 0) {
                        statePc = 52;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    stackOut_95_0 = var11_int;
                    stackIn_96_0 = stackOut_95_0;
                    statePc = 96;
                    continue stateLoop;
                }
                case 96: {
                    if (stackIn_96_0 != 0) {
                        statePc = 100;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    var10++;
                    if (var19 == 0) {
                        statePc = 49;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    stackOut_100_0 = -3;
                    stackIn_101_0 = stackOut_100_0;
                    statePc = 101;
                    continue stateLoop;
                }
                case 101: {
                    if (stackIn_101_0 < (sk.field_t ^ -1)) {
                        statePc = 109;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    stackOut_102_0 = ok.field_Jb;
                    stackIn_103_0 = stackOut_102_0;
                    statePc = 103;
                    continue stateLoop;
                }
                case 103: {
                    if (stackIn_103_0[12]) {
                        statePc = 108;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 108: {
                    var10 = 2;
                    statePc = 109;
                    continue stateLoop;
                }
                case 109: {
                    if ((var10 ^ -1) > -3) {
                        statePc = 250;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    if (null != t.field_L) {
                        statePc = 124;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    stackOut_113_0 = uj.field_k;
                    stackIn_114_0 = stackOut_113_0;
                    statePc = 114;
                    continue stateLoop;
                }
                case 114: {
                    if (stackIn_114_0 != null) {
                        statePc = 124;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    stackOut_117_0 = il.field_b;
                    stackIn_118_0 = stackOut_117_0;
                    statePc = 118;
                    continue stateLoop;
                }
                case 118: {
                    if (stackIn_118_0 != null) {
                        statePc = 124;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    if (nk.field_r == null) {
                        statePc = 274;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    var11_int = 0;
                    var12 = 0;
                    var13_int = 0;
                    var14_int = 0;
                    var15 = 0;
                    var16 = 0;
                    statePc = 125;
                    continue stateLoop;
                }
                case 125: {
                    if ((var16 ^ -1) <= (qa.field_e ^ -1)) {
                        statePc = 185;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    var17_int = pd.field_Rb.field_sc[var16] & 255;
                    statePc = 127;
                    continue stateLoop;
                }
                case 127: {
                    if (var19 != 0) {
                        statePc = 186;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    stackOut_128_0 = null;
                    stackIn_129_0 = stackOut_128_0;
                    statePc = 129;
                    continue stateLoop;
                }
                case 129: {
                    if ((Object) (Object) stackIn_129_0 == (Object) (Object) t.field_L) {
                        statePc = 142;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    stackOut_132_0 = t.field_L;
                    stackIn_133_0 = stackOut_132_0;
                    statePc = 133;
                    continue stateLoop;
                }
                case 133: {
                    if (stackIn_133_0[var16] == null) {
                        statePc = 142;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    if (t.field_L[var16][var17_int]) {
                        statePc = 141;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 141: {
                    var11_int = 1;
                    statePc = 142;
                    continue stateLoop;
                }
                case 142: {
                    if (null == uj.field_k) {
                        statePc = 159;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 143: {
                    stackOut_143_0 = null;
                    stackIn_144_0 = stackOut_143_0;
                    statePc = 144;
                    continue stateLoop;
                }
                case 144: {
                    if ((Object) (Object) stackIn_144_0 != (Object) (Object) uj.field_k[var16]) {
                        statePc = 149;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 149: {
                    var18_int = uj.field_k[var16][var17_int];
                    statePc = 150;
                    continue stateLoop;
                }
                case 150: {
                    if ((var18_int ^ -1) < (var13_int ^ -1)) {
                        statePc = 153;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 153: {
                    var13_int = var18_int;
                    statePc = 154;
                    continue stateLoop;
                }
                case 154: {
                    if (var18_int == 0) {
                        statePc = 159;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    if (lf.field_U) {
                        statePc = 159;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    var11_int = 1;
                    statePc = 159;
                    continue stateLoop;
                }
                case 159: {
                    if (il.field_b == null) {
                        statePc = 176;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    stackOut_160_0 = il.field_b;
                    stackIn_161_0 = stackOut_160_0;
                    statePc = 161;
                    continue stateLoop;
                }
                case 161: {
                    if (stackIn_161_0[var16] != null) {
                        statePc = 166;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 166: {
                    var18_int = il.field_b[var16][var17_int];
                    statePc = 167;
                    continue stateLoop;
                }
                case 167: {
                    if (var18_int > var14_int) {
                        statePc = 170;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 170: {
                    var14_int = var18_int;
                    statePc = 171;
                    continue stateLoop;
                }
                case 171: {
                    if (var18_int == 0) {
                        statePc = 176;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    if (lf.field_U) {
                        statePc = 176;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 175: {
                    var11_int = 1;
                    statePc = 176;
                    continue stateLoop;
                }
                case 176: {
                    if (null == nk.field_r) {
                        statePc = 184;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    stackOut_177_0 = nk.field_r;
                    stackIn_178_0 = stackOut_177_0;
                    statePc = 178;
                    continue stateLoop;
                }
                case 178: {
                    if (stackIn_178_0[var16] != null) {
                        statePc = 183;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 183: {
                    var15 = var15 | nk.field_r[var16][var17_int];
                    statePc = 184;
                    continue stateLoop;
                }
                case 184: {
                    var16++;
                    if (var19 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 185: {
                    var16 = 0;
                    statePc = 186;
                    continue stateLoop;
                }
                case 186: {
                    var17 = se.field_S.field_Kb.field_I;
                    var18 = (r) (Object) var17.g(-18110);
                    statePc = 187;
                    continue stateLoop;
                }
                case 187: {
                    if (var18 == null) {
                        statePc = 227;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 188: {
                    stackOut_188_0 = var18.l(1);
                    stackIn_228_0 = stackOut_188_0 ? 1 : 0;
                    stackIn_189_0 = stackOut_188_0;
                    if (var19 != 0) {
                        statePc = 228;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 189: {
                    if (stackIn_189_0) {
                        statePc = 226;
                    } else {
                        statePc = 192;
                    }
                    continue stateLoop;
                }
                case 192: {
                    if (var11_int == 0) {
                        statePc = 203;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 195: {
                    stackOut_195_0 = (r) var18;
                    stackIn_196_0 = stackOut_195_0;
                    statePc = 196;
                    continue stateLoop;
                }
                case 196: {
                    if (!((r) (Object) stackIn_196_0).field_Hb) {
                        statePc = 201;
                    } else {
                        statePc = 203;
                    }
                    continue stateLoop;
                }
                case 201: {
                    var16 = 1;
                    statePc = 202;
                    continue stateLoop;
                }
                case 202: {
                    if (var19 == 0) {
                        statePc = 227;
                    } else {
                        statePc = 203;
                    }
                    continue stateLoop;
                }
                case 203: {
                    if (var13_int <= var18.field_Pb) {
                        statePc = 208;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 206: {
                    var16 = 1;
                    statePc = 207;
                    continue stateLoop;
                }
                case 207: {
                    if (var19 == 0) {
                        statePc = 227;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 208: {
                    if ((var18.field_Jb ^ -1) > (var14_int ^ -1)) {
                        statePc = 213;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 213: {
                    var16 = 1;
                    statePc = 214;
                    continue stateLoop;
                }
                case 214: {
                    if (var19 == 0) {
                        statePc = 227;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 215: {
                    if ((var15 & (var18.field_Wb ^ -1) ^ -1) < -1) {
                        statePc = 220;
                    } else {
                        statePc = 222;
                    }
                    continue stateLoop;
                }
                case 220: {
                    var16 = 1;
                    statePc = 221;
                    continue stateLoop;
                }
                case 221: {
                    if (var19 == 0) {
                        statePc = 227;
                    } else {
                        statePc = 222;
                    }
                    continue stateLoop;
                }
                case 222: {
                    if (var12 == 0) {
                        statePc = 226;
                    } else {
                        statePc = 225;
                    }
                    continue stateLoop;
                }
                case 225: {
                    var16 = 1;
                    if (var19 == 0) {
                        statePc = 227;
                    } else {
                        statePc = 226;
                    }
                    continue stateLoop;
                }
                case 226: {
                    var18 = (r) (Object) var17.a((byte) -107);
                    if (var19 == 0) {
                        statePc = 187;
                    } else {
                        statePc = 227;
                    }
                    continue stateLoop;
                }
                case 227: {
                    stackOut_227_0 = -3;
                    stackIn_228_0 = stackOut_227_0;
                    statePc = 228;
                    continue stateLoop;
                }
                case 228: {
                    if (stackIn_228_0 < (sk.field_t ^ -1)) {
                        statePc = 236;
                    } else {
                        statePc = 229;
                    }
                    continue stateLoop;
                }
                case 229: {
                    stackOut_229_0 = ok.field_Jb;
                    stackIn_230_0 = stackOut_229_0;
                    statePc = 230;
                    continue stateLoop;
                }
                case 230: {
                    if (stackIn_230_0[12]) {
                        statePc = 235;
                    } else {
                        statePc = 236;
                    }
                    continue stateLoop;
                }
                case 235: {
                    var16 = 0;
                    statePc = 236;
                    continue stateLoop;
                }
                case 236: {
                    if (var16 != 0) {
                        statePc = 239;
                    } else {
                        statePc = 249;
                    }
                    continue stateLoop;
                }
                case 239: {
                    aa.field_g.field_tb = false;
                    if (aa.field_g.field_Db) {
                        statePc = 242;
                    } else {
                        statePc = 249;
                    }
                    continue stateLoop;
                }
                case 242: {
                    if (-1 != (qa.field_f.field_a.field_Hb ^ -1)) {
                        statePc = 246;
                    } else {
                        statePc = 243;
                    }
                    continue stateLoop;
                }
                case 243: {
                    field_Mb = gh.field_e;
                    if (var19 == 0) {
                        statePc = 249;
                    } else {
                        statePc = 246;
                    }
                    continue stateLoop;
                }
                case 246: {
                    field_Mb = oc.a(wm.field_j, new String[1], (byte) -119);
                    statePc = 249;
                    continue stateLoop;
                }
                case 249: {
                    if (var19 == 0) {
                        statePc = 274;
                    } else {
                        statePc = 250;
                    }
                    continue stateLoop;
                }
                case 250: {
                    aa.field_g.field_tb = false;
                    if (aa.field_g.field_Db) {
                        statePc = 255;
                    } else {
                        statePc = 274;
                    }
                    continue stateLoop;
                }
                case 255: {
                    var11 = null;
                    var12 = 0;
                    var13_int = 0;
                    statePc = 256;
                    continue stateLoop;
                }
                case 256: {
                    if (var13_int >= qa.field_e) {
                        statePc = 265;
                    } else {
                        statePc = 257;
                    }
                    continue stateLoop;
                }
                case 257: {
                    stackOut_257_0 = bi.field_d[var13_int];
                    stackIn_266_0 = stackOut_257_0 ? 1 : 0;
                    stackIn_258_0 = stackOut_257_0;
                    if (var19 != 0) {
                        statePc = 266;
                    } else {
                        statePc = 258;
                    }
                    continue stateLoop;
                }
                case 258: {
                    if (!stackIn_258_0) {
                        statePc = 264;
                    } else {
                        statePc = 261;
                    }
                    continue stateLoop;
                }
                case 261: {
                    var14 = "<col=A00000>" + td.field_n[var13_int] + "</col>";
                    if (null != var11) {
                        statePc = 263;
                    } else {
                        statePc = 262;
                    }
                    continue stateLoop;
                }
                case 262: {
                    var11 = var14;
                    if (var19 == 0) {
                        statePc = 264;
                    } else {
                        statePc = 263;
                    }
                    continue stateLoop;
                }
                case 263: {
                    var12 = 1;
                    var11 = var11 + ", " + var14;
                    statePc = 264;
                    continue stateLoop;
                }
                case 264: {
                    var13_int++;
                    if (var19 == 0) {
                        statePc = 256;
                    } else {
                        statePc = 265;
                    }
                    continue stateLoop;
                }
                case 265: {
                    stackOut_265_0 = -1;
                    stackIn_266_0 = stackOut_265_0;
                    statePc = 266;
                    continue stateLoop;
                }
                case 266: {
                    if (stackIn_266_0 == (var10 ^ -1)) {
                        statePc = 270;
                    } else {
                        statePc = 267;
                    }
                    continue stateLoop;
                }
                case 267: {
                    var13 = jb.field_c;
                    if (var12 != 0) {
                        statePc = 269;
                    } else {
                        statePc = 268;
                    }
                    continue stateLoop;
                }
                case 268: {
                    var14 = oc.a(ld.field_j, new String[1], (byte) -66);
                    if (var19 == 0) {
                        statePc = 273;
                    } else {
                        statePc = 269;
                    }
                    continue stateLoop;
                }
                case 269: {
                    var14 = field_Qb + var11;
                    statePc = 273;
                    continue stateLoop;
                }
                case 270: {
                    var13 = ke.field_c;
                    if (var12 == 0) {
                        statePc = 272;
                    } else {
                        statePc = 271;
                    }
                    continue stateLoop;
                }
                case 271: {
                    var14 = ic.field_d + var11;
                    if (var19 == 0) {
                        statePc = 273;
                    } else {
                        statePc = 272;
                    }
                    continue stateLoop;
                }
                case 272: {
                    var14 = oc.a(qb.field_d, new String[1], (byte) -88);
                    statePc = 273;
                    continue stateLoop;
                }
                case 273: {
                    field_Mb = "<col=A00000>" + var13 + "<br>" + var14;
                    statePc = 274;
                    continue stateLoop;
                }
                case 274: {
                    if (var19 == 0) {
                        statePc = 276;
                    } else {
                        statePc = 275;
                    }
                    continue stateLoop;
                }
                case 275: {
                    var9_ref = pd.field_Rb.field_Gb;
                    sc.field_f.field_db = oc.a(fb.field_D, new String[1], (byte) -88).toUpperCase();
                    tn.field_j.a(0, ri.field_k.field_M, -2147483648, 40, ri.field_k.field_pb + -40);
                    tn.field_j.field_db = oc.a(kb.field_R, new String[1], (byte) -93);
                    var8 = tn.field_j;
                    statePc = 276;
                    continue stateLoop;
                }
                case 276: {
                    if ((eg.field_e ^ -1L) == -1L) {
                        statePc = 280;
                    } else {
                        statePc = 277;
                    }
                    continue stateLoop;
                }
                case 277: {
                    var9 = (int)(eg.field_e - ud.a(2));
                    var9 = (999 + var9) / 1000;
                    if ((var9 ^ -1) <= -2) {
                        statePc = 279;
                    } else {
                        statePc = 278;
                    }
                    continue stateLoop;
                }
                case 278: {
                    var9 = 1;
                    statePc = 279;
                    continue stateLoop;
                }
                case 279: {
                    var8.field_db = oc.a(pa.field_n, new String[1], (byte) -119);
                    statePc = 280;
                    continue stateLoop;
                }
                case 280: {
                    ec.field_j.field_db = oc.a(dk.field_a, new String[2], (byte) -44);
                    statePc = 281;
                    continue stateLoop;
                }
                case 281: {
                    stackOut_281_0 = fm.field_T;
                    stackIn_292_0 = stackOut_281_0;
                    stackIn_282_0 = stackOut_281_0;
                    if (!param0) {
                        statePc = 292;
                    } else {
                        statePc = 282;
                    }
                    continue stateLoop;
                }
                case 282: {
                    stackOut_282_0 = (ci) (Object) stackIn_282_0;
                    stackOut_282_1 = param3;
                    stackIn_283_0 = stackOut_282_0;
                    stackIn_283_1 = stackOut_282_1;
                    statePc = 283;
                    continue stateLoop;
                }
                case 283: {
                    stackOut_283_0 = (ci) (Object) stackIn_283_0;
                    stackIn_292_0 = stackOut_283_0;
                    stackIn_284_0 = stackOut_283_0;
                    if (stackIn_283_1) {
                        statePc = 292;
                    } else {
                        statePc = 284;
                    }
                    continue stateLoop;
                }
                case 284: {
                    stackOut_284_0 = (ci) (Object) stackIn_284_0;
                    stackIn_286_0 = stackOut_284_0;
                    statePc = 286;
                    continue stateLoop;
                }
                case 286: {
                    stackOut_286_0 = (ci) (Object) stackIn_286_0;
                    stackOut_286_1 = jh.field_a;
                    stackIn_287_0 = stackOut_286_0;
                    stackIn_287_1 = stackOut_286_1;
                    statePc = 287;
                    continue stateLoop;
                }
                case 287: {
                    stackOut_287_0 = (ci) (Object) stackIn_287_0;
                    stackIn_292_0 = stackOut_287_0;
                    stackIn_288_0 = stackOut_287_0;
                    if (stackIn_287_1) {
                        statePc = 292;
                    } else {
                        statePc = 288;
                    }
                    continue stateLoop;
                }
                case 288: {
                    stackOut_288_0 = (ci) (Object) stackIn_288_0;
                    stackIn_290_0 = stackOut_288_0;
                    statePc = 290;
                    continue stateLoop;
                }
                case 290: {
                    stackOut_290_0 = (ci) (Object) stackIn_290_0;
                    stackOut_290_1 = 1;
                    stackIn_293_0 = stackOut_290_0;
                    stackIn_293_1 = stackOut_290_1;
                    statePc = 293;
                    continue stateLoop;
                }
                case 292: {
                    stackOut_292_0 = (ci) (Object) stackIn_292_0;
                    stackOut_292_1 = 0;
                    stackIn_293_0 = stackOut_292_0;
                    stackIn_293_1 = stackOut_292_1;
                    statePc = 293;
                    continue stateLoop;
                }
                case 293: {
                    ((ci) (Object) stackIn_293_0).a(stackIn_293_1 != 0, (byte) 88);
                    stackOut_293_0 = ri.field_k;
                    stackIn_304_0 = stackOut_293_0;
                    stackIn_294_0 = stackOut_293_0;
                    if (!param0) {
                        statePc = 304;
                    } else {
                        statePc = 294;
                    }
                    continue stateLoop;
                }
                case 294: {
                    stackOut_294_0 = (ci) (Object) stackIn_294_0;
                    stackOut_294_1 = param3;
                    stackIn_295_0 = stackOut_294_0;
                    stackIn_295_1 = stackOut_294_1;
                    statePc = 295;
                    continue stateLoop;
                }
                case 295: {
                    stackOut_295_0 = (ci) (Object) stackIn_295_0;
                    stackIn_304_0 = stackOut_295_0;
                    stackIn_296_0 = stackOut_295_0;
                    if (stackIn_295_1) {
                        statePc = 304;
                    } else {
                        statePc = 296;
                    }
                    continue stateLoop;
                }
                case 296: {
                    stackOut_296_0 = (ci) (Object) stackIn_296_0;
                    stackIn_298_0 = stackOut_296_0;
                    statePc = 298;
                    continue stateLoop;
                }
                case 298: {
                    stackOut_298_0 = (ci) (Object) stackIn_298_0;
                    stackOut_298_1 = jh.field_a;
                    stackIn_299_0 = stackOut_298_0;
                    stackIn_299_1 = stackOut_298_1;
                    statePc = 299;
                    continue stateLoop;
                }
                case 299: {
                    stackOut_299_0 = (ci) (Object) stackIn_299_0;
                    stackIn_304_0 = stackOut_299_0;
                    stackIn_300_0 = stackOut_299_0;
                    if (stackIn_299_1) {
                        statePc = 304;
                    } else {
                        statePc = 300;
                    }
                    continue stateLoop;
                }
                case 300: {
                    stackOut_300_0 = (ci) (Object) stackIn_300_0;
                    stackIn_302_0 = stackOut_300_0;
                    statePc = 302;
                    continue stateLoop;
                }
                case 302: {
                    stackOut_302_0 = (ci) (Object) stackIn_302_0;
                    stackOut_302_1 = 1;
                    stackIn_305_0 = stackOut_302_0;
                    stackIn_305_1 = stackOut_302_1;
                    statePc = 305;
                    continue stateLoop;
                }
                case 304: {
                    stackOut_304_0 = (ci) (Object) stackIn_304_0;
                    stackOut_304_1 = 0;
                    stackIn_305_0 = stackOut_304_0;
                    stackIn_305_1 = stackOut_304_1;
                    statePc = 305;
                    continue stateLoop;
                }
                case 305: {
                    ((ci) (Object) stackIn_305_0).a(stackIn_305_1 != 0, (byte) 88);
                    stackOut_305_0 = ah.field_i;
                    stackIn_316_0 = stackOut_305_0;
                    stackIn_306_0 = stackOut_305_0;
                    if (!param0) {
                        statePc = 316;
                    } else {
                        statePc = 306;
                    }
                    continue stateLoop;
                }
                case 306: {
                    stackOut_306_0 = (ci) (Object) stackIn_306_0;
                    stackOut_306_1 = param3;
                    stackIn_307_0 = stackOut_306_0;
                    stackIn_307_1 = stackOut_306_1;
                    statePc = 307;
                    continue stateLoop;
                }
                case 307: {
                    stackOut_307_0 = (ci) (Object) stackIn_307_0;
                    stackIn_316_0 = stackOut_307_0;
                    stackIn_308_0 = stackOut_307_0;
                    if (stackIn_307_1) {
                        statePc = 316;
                    } else {
                        statePc = 308;
                    }
                    continue stateLoop;
                }
                case 308: {
                    stackOut_308_0 = (ci) (Object) stackIn_308_0;
                    stackIn_310_0 = stackOut_308_0;
                    statePc = 310;
                    continue stateLoop;
                }
                case 310: {
                    stackOut_310_0 = (ci) (Object) stackIn_310_0;
                    stackOut_310_1 = jh.field_a;
                    stackIn_311_0 = stackOut_310_0;
                    stackIn_311_1 = stackOut_310_1;
                    statePc = 311;
                    continue stateLoop;
                }
                case 311: {
                    stackOut_311_0 = (ci) (Object) stackIn_311_0;
                    stackIn_316_0 = stackOut_311_0;
                    stackIn_312_0 = stackOut_311_0;
                    if (!stackIn_311_1) {
                        statePc = 316;
                    } else {
                        statePc = 312;
                    }
                    continue stateLoop;
                }
                case 312: {
                    stackOut_312_0 = (ci) (Object) stackIn_312_0;
                    stackIn_314_0 = stackOut_312_0;
                    statePc = 314;
                    continue stateLoop;
                }
                case 314: {
                    stackOut_314_0 = (ci) (Object) stackIn_314_0;
                    stackOut_314_1 = 1;
                    stackIn_317_0 = stackOut_314_0;
                    stackIn_317_1 = stackOut_314_1;
                    statePc = 317;
                    continue stateLoop;
                }
                case 316: {
                    stackOut_316_0 = (ci) (Object) stackIn_316_0;
                    stackOut_316_1 = 0;
                    stackIn_317_0 = stackOut_316_0;
                    stackIn_317_1 = stackOut_316_1;
                    statePc = 317;
                    continue stateLoop;
                }
                case 317: {
                    ((ci) (Object) stackIn_317_0).a(stackIn_317_1 != 0, (byte) 88);
                    qa.field_f.field_a.f((byte) 109);
                    var5_int = -71 % ((-3 - param1) / 54);
                    statePc = 318;
                    continue stateLoop;
                }
                case 318: {
                    if (null != pd.field_Rb) {
                        statePc = 321;
                    } else {
                        statePc = 340;
                    }
                    continue stateLoop;
                }
                case 321: {
                    if (sc.field_d.field_L == 0) {
                        statePc = 325;
                    } else {
                        statePc = 322;
                    }
                    continue stateLoop;
                }
                case 322: {
                    db.a(param4, pd.field_Rb.g((byte) -80), 28113);
                    statePc = 325;
                    continue stateLoop;
                }
                case 325: {
                    if ((aa.field_g.field_L ^ -1) == -1) {
                        statePc = 329;
                    } else {
                        statePc = 326;
                    }
                    continue stateLoop;
                }
                case 326: {
                    ob.field_w = true;
                    statePc = 329;
                    continue stateLoop;
                }
                case 329: {
                    if (uj.field_j.field_L == 0) {
                        statePc = 333;
                    } else {
                        statePc = 330;
                    }
                    continue stateLoop;
                }
                case 330: {
                    jh.field_a = true;
                    statePc = 333;
                    continue stateLoop;
                }
                case 333: {
                    if (hn.field_d.field_L != 0) {
                        statePc = 336;
                    } else {
                        statePc = 337;
                    }
                    continue stateLoop;
                }
                case 336: {
                    jh.field_a = false;
                    statePc = 337;
                    continue stateLoop;
                }
                case 337: {
                    t.a(pd.field_Rb, false, param4, true);
                    statePc = 340;
                    continue stateLoop;
                }
                case 340: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void k(int param0) {
        field_Qb = null;
        if (param0 != 0) {
            return;
        }
        try {
            field_Mb = null;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "pc.F(" + param0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Qb = "Invite more players, or alternatively try changing the following settings:  ";
    }
}
