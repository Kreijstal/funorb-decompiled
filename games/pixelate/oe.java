/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;
import java.awt.Canvas;

final class oe extends ak {
    static int field_Sb;
    private ak field_Tb;
    private ak field_Eb;
    private ak field_Fb;
    private fb field_Pb;
    private ak[] field_Lb;
    private int field_Jb;
    private ak field_Nb;
    long field_Ub;
    static int[] field_Hb;
    private ak field_Ob;
    static String field_Gb;
    static String field_Mb;
    static String field_Vb;
    private StringBuilder field_Ib;
    static byte[] field_Rb;
    static String field_Kb;
    private ak field_Qb;

    final boolean j(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_1_0 = 0;
        int stackOut_11_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (-2 == ((oe) this).field_Jb) {
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
                        if ((ke.field_a ^ -1) != -14) {
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
                        ((oe) this).field_Jb = -1;
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
                        if (param0 == -1) {
                            statePc = 11;
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
                        field_Mb = null;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
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
                    throw aa.a((Throwable) (Object) var2, "oe.G(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    oe(int param0, int param1, int param2, int param3, int param4, ak param5, ak param6, ak param7, ak param8, fb param9, ak param10, String param11, long param12) {
        super(0L, param5);
        int var15_int = 0;
        ak[] var15 = null;
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
        Object stackIn_5_0 = null;
        fb stackIn_5_1 = null;
        fb stackIn_5_2 = null;
        long stackIn_5_3 = 0L;
        fb stackIn_5_4 = null;
        Object stackIn_6_0 = null;
        fb stackIn_6_1 = null;
        fb stackIn_6_2 = null;
        long stackIn_6_3 = 0L;
        fb stackIn_6_4 = null;
        Object stackIn_7_0 = null;
        fb stackIn_7_1 = null;
        fb stackIn_7_2 = null;
        long stackIn_7_3 = 0L;
        fb stackIn_7_4 = null;
        Object stackIn_8_0 = null;
        fb stackIn_8_1 = null;
        fb stackIn_8_2 = null;
        long stackIn_8_3 = 0L;
        fb stackIn_8_4 = null;
        Object stackIn_9_0 = null;
        fb stackIn_9_1 = null;
        fb stackIn_9_2 = null;
        long stackIn_9_3 = 0L;
        fb stackIn_9_4 = null;
        Object stackIn_10_0 = null;
        fb stackIn_10_1 = null;
        fb stackIn_10_2 = null;
        long stackIn_10_3 = 0L;
        fb stackIn_10_4 = null;
        String stackIn_10_5 = null;
        ak stackIn_18_0 = null;
        ak stackIn_19_0 = null;
        ak stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        Object stackOut_4_0 = null;
        fb stackOut_4_1 = null;
        fb stackOut_4_2 = null;
        long stackOut_4_3 = 0L;
        fb stackOut_4_4 = null;
        Object stackOut_5_0 = null;
        fb stackOut_5_1 = null;
        fb stackOut_5_2 = null;
        long stackOut_5_3 = 0L;
        fb stackOut_5_4 = null;
        Object stackOut_6_0 = null;
        fb stackOut_6_1 = null;
        fb stackOut_6_2 = null;
        long stackOut_6_3 = 0L;
        fb stackOut_6_4 = null;
        Object stackOut_9_0 = null;
        fb stackOut_9_1 = null;
        fb stackOut_9_2 = null;
        long stackOut_9_3 = 0L;
        fb stackOut_9_4 = null;
        String stackOut_9_5 = null;
        Object stackOut_7_0 = null;
        fb stackOut_7_1 = null;
        fb stackOut_7_2 = null;
        long stackOut_7_3 = 0L;
        fb stackOut_7_4 = null;
        Object stackOut_8_0 = null;
        fb stackOut_8_1 = null;
        fb stackOut_8_2 = null;
        long stackOut_8_3 = 0L;
        fb stackOut_8_4 = null;
        String stackOut_8_5 = null;
        ak stackOut_17_0 = null;
        ak stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        ak stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        L0: {
          L1: {
            var27 = Pixelate.field_H ? 1 : 0;
            ((oe) this).field_Jb = -2;
            ((oe) this).field_Ub = param12;
            ((oe) this).field_Eb = new ak(0L, param6, qo.field_m.toUpperCase());
            ((oe) this).field_Eb.field_Bb = 1;
            ((oe) this).a(((oe) this).field_Eb, (byte) 26);
            ((oe) this).field_Ob = new ak(0L, param7);
            ((oe) this).field_Eb.a(((oe) this).field_Ob, (byte) 26);
            ((oe) this).field_Qb = new ak(0L, (ak) null);
            ((oe) this).a(((oe) this).field_Qb, (byte) 26);
            if (null == param11) {
              break L1;
            } else {
              L2: {
                L3: {
                  ((oe) this).field_Tb = new ak(0L, param8, ge.field_d);
                  ((oe) this).field_Tb.field_N = 11184810;
                  ((oe) this).field_Tb.field_Bb = 1;
                  ((oe) this).field_Qb.a(((oe) this).field_Tb, (byte) 26);
                  ((oe) this).field_Fb = new ak(0L, param8, no.field_j);
                  ((oe) this).field_Fb.field_N = 11184810;
                  ((oe) this).field_Fb.field_Bb = 1;
                  ((oe) this).field_Qb.a(((oe) this).field_Fb, (byte) 26);
                  ((oe) this).field_Nb = new ak(0L, param8);
                  ((oe) this).field_Nb.field_N = 16764006;
                  ((oe) this).field_Qb.a(((oe) this).field_Nb, (byte) 26);
                  ((oe) this).field_Nb.field_qb = "|";
                  if (-6 >= (rj.field_I ^ -1)) {
                    break L3;
                  } else {
                    if (-3 < (wo.field_h ^ -1)) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  L5: {
                    stackOut_4_0 = this;
                    stackOut_4_1 = null;
                    stackOut_4_2 = null;
                    stackOut_4_3 = 0L;
                    stackOut_4_4 = (fb) param9;
                    stackIn_8_0 = stackOut_4_0;
                    stackIn_8_1 = stackOut_4_1;
                    stackIn_8_2 = stackOut_4_2;
                    stackIn_8_3 = stackOut_4_3;
                    stackIn_8_4 = stackOut_4_4;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    stackIn_5_2 = stackOut_4_2;
                    stackIn_5_3 = stackOut_4_3;
                    stackIn_5_4 = stackOut_4_4;
                    if (rj.field_I >= 7) {
                      break L5;
                    } else {
                      stackOut_5_0 = this;
                      stackOut_5_1 = null;
                      stackOut_5_2 = null;
                      stackOut_5_3 = stackIn_5_3;
                      stackOut_5_4 = (fb) (Object) stackIn_5_4;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      stackIn_6_2 = stackOut_5_2;
                      stackIn_6_3 = stackOut_5_3;
                      stackIn_6_4 = stackOut_5_4;
                      stackOut_6_0 = this;
                      stackOut_6_1 = null;
                      stackOut_6_2 = null;
                      stackOut_6_3 = stackIn_6_3;
                      stackOut_6_4 = (fb) (Object) stackIn_6_4;
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
                      if (-3 < (wo.field_h ^ -1)) {
                        stackOut_9_0 = this;
                        stackOut_9_1 = null;
                        stackOut_9_2 = null;
                        stackOut_9_3 = stackIn_9_3;
                        stackOut_9_4 = (fb) (Object) stackIn_9_4;
                        stackOut_9_5 = wi.field_c;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        stackIn_10_2 = stackOut_9_2;
                        stackIn_10_3 = stackOut_9_3;
                        stackIn_10_4 = stackOut_9_4;
                        stackIn_10_5 = stackOut_9_5;
                        break L4;
                      } else {
                        stackOut_7_0 = this;
                        stackOut_7_1 = null;
                        stackOut_7_2 = null;
                        stackOut_7_3 = stackIn_7_3;
                        stackOut_7_4 = (fb) (Object) stackIn_7_4;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        stackIn_8_2 = stackOut_7_2;
                        stackIn_8_3 = stackOut_7_3;
                        stackIn_8_4 = stackOut_7_4;
                        break L5;
                      }
                    }
                  }
                  stackOut_8_0 = this;
                  stackOut_8_1 = null;
                  stackOut_8_2 = null;
                  stackOut_8_3 = stackIn_8_3;
                  stackOut_8_4 = (fb) (Object) stackIn_8_4;
                  stackOut_8_5 = nh.field_d;
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  stackIn_10_2 = stackOut_8_2;
                  stackIn_10_3 = stackOut_8_3;
                  stackIn_10_4 = stackOut_8_4;
                  stackIn_10_5 = stackOut_8_5;
                  break L4;
                }
                new fb(stackIn_10_3, stackIn_10_4, stackIn_10_5);
                ((oe) this).field_Pb = stackIn_10_1;
                ((oe) this).field_Qb.a((ak) (Object) ((oe) this).field_Pb, (byte) 26);
                break L2;
              }
              var15 = new ak[3];
              var15[0] = new ak(0L, (ak) null);
              ((oe) this).field_Qb.a(var15[0], (byte) 26);
              var15[1] = new ak(0L, (ak) null);
              ((oe) this).field_Qb.a(var15[1], (byte) 26);
              var15[2] = new ak(0L, (ak) null);
              ((oe) this).field_Qb.a(var15[2], (byte) 26);
              ((oe) this).field_Lb = new ak[d.field_b];
              var16 = 0;
              L6: while (true) {
                L7: {
                  L8: {
                    if (d.field_b <= var16) {
                      break L8;
                    } else {
                      if (var27 != 0) {
                        break L7;
                      } else {
                        L9: {
                          if (null != cd.field_e[var16]) {
                            L10: {
                              ((oe) this).field_Lb[var16] = new ak(0L, param10, cd.field_e[var16]);
                              ((oe) this).field_Lb[var16].field_Bb = 0;
                              stackOut_17_0 = ((oe) this).field_Lb[var16];
                              stackIn_19_0 = stackOut_17_0;
                              stackIn_18_0 = stackOut_17_0;
                              if (param11 == null) {
                                stackOut_19_0 = (ak) (Object) stackIn_19_0;
                                stackOut_19_1 = 0;
                                stackIn_20_0 = stackOut_19_0;
                                stackIn_20_1 = stackOut_19_1;
                                break L10;
                              } else {
                                stackOut_18_0 = (ak) (Object) stackIn_18_0;
                                stackOut_18_1 = 1;
                                stackIn_20_0 = stackOut_18_0;
                                stackIn_20_1 = stackOut_18_1;
                                break L10;
                              }
                            }
                            stackIn_20_0.field_rb = stackIn_20_1 != 0;
                            ((oe) this).field_Qb.a(((oe) this).field_Lb[var16], (byte) 26);
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
                  ((oe) this).field_Ib = new StringBuilder(12);
                  break L7;
                }
                L11: {
                  if (param11 != null) {
                    StringBuilder discarded$1 = ((oe) this).field_Ib.append(param11);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  var16 = 0;
                  var17 = param6.field_Db.c(bh.field_l);
                  if ((var17 ^ -1) < (var16 ^ -1)) {
                    var16 = var17;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  var17 = param6.field_Db.c(km.field_t);
                  if ((var17 ^ -1) < (var16 ^ -1)) {
                    var16 = var17;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L14: {
                  var17 = param6.field_Db.c(lh.field_j);
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
                      L18: {
                        if ((d.field_b ^ -1) >= (var17 ^ -1)) {
                          break L18;
                        } else {
                          if (var27 != 0) {
                            break L17;
                          } else {
                            L19: {
                              if (null == ((oe) this).field_Lb[var17]) {
                                break L19;
                              } else {
                                var18 = ((oe) this).field_Lb[var17].g(0);
                                if (var16 < var18) {
                                  var16 = var18;
                                  break L19;
                                } else {
                                  break L19;
                                }
                              }
                            }
                            var17++;
                            if (var27 == 0) {
                              continue L15;
                            } else {
                              break L18;
                            }
                          }
                        }
                      }
                      if (var16 > 140) {
                        break L17;
                      } else {
                        break L16;
                      }
                    }
                    var16 = 140;
                    break L16;
                  }
                  L20: {
                    var17 = 0;
                    var18 = 0;
                    var18 = 0;
                    var18 = this.a((byte) 126, var18, param6, var16, var15[0], bh.field_l);
                    var18 = this.a(var15[0], var18, (byte) 110, var16, ((oe) this).field_Lb[6]);
                    var18 = this.a(var15[0], var18, (byte) 112, var16, ((oe) this).field_Lb[9]);
                    var18 = this.a(var15[0], var18, (byte) 101, var16, ((oe) this).field_Lb[5]);
                    var18 = this.a(var15[0], var18, (byte) 126, var16, ((oe) this).field_Lb[7]);
                    var18 = this.a(var15[0], var18, (byte) 98, var16, ((oe) this).field_Lb[15]);
                    var18 = this.a(var15[0], var18, (byte) 108, var16, ((oe) this).field_Lb[4]);
                    if (var17 >= var18) {
                      break L20;
                    } else {
                      var17 = var18;
                      break L20;
                    }
                  }
                  L21: {
                    var18 = 0;
                    var18 = this.a((byte) 112, var18, param6, var16, var15[1], km.field_t);
                    var18 = this.a(var15[1], var18, (byte) 114, var16, ((oe) this).field_Lb[16]);
                    var18 = this.a(var15[1], var18, (byte) 95, var16, ((oe) this).field_Lb[17]);
                    var18 = this.a(var15[1], var18, (byte) 95, var16, ((oe) this).field_Lb[18]);
                    var18 = this.a(var15[1], var18, (byte) 99, var16, ((oe) this).field_Lb[19]);
                    var18 = this.a(var15[1], var18, (byte) 108, var16, ((oe) this).field_Lb[20]);
                    if (var17 < var18) {
                      var17 = var18;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  L22: {
                    var18 = 0;
                    var18 = this.a((byte) 114, var18, param6, var16, var15[2], lh.field_j);
                    var18 = this.a(var15[2], var18, (byte) 94, var16, ((oe) this).field_Lb[13]);
                    var18 = this.a(var15[2], var18, (byte) 98, var16, ((oe) this).field_Lb[21]);
                    var18 = this.a(var15[2], var18, (byte) 120, var16, ((oe) this).field_Lb[11]);
                    if (var17 < var18) {
                      var17 = var18;
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                  L23: {
                    var19 = 26 + var16 * 3;
                    var20 = ((oe) this).field_Eb.g(0);
                    if (var19 < var20) {
                      var19 = var20;
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                  L24: {
                    if (((oe) this).field_Pb == null) {
                      break L24;
                    } else {
                      var20 = ((oe) this).field_Pb.b((byte) 115, 4);
                      if (var20 > var19) {
                        var19 = var20;
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                  }
                  L25: {
                    ((oe) this).field_Eb.a(0, 24, 0, 256, 13 + (var19 + 13));
                    ((oe) this).field_Ob.a(5, 15, ((oe) this).field_Eb.field_K - 20, 256, 15);
                    var21 = 10;
                    ((oe) this).field_Tb.a(var21, 2 * fq.field_q, 13, 256, var19);
                    var21 = var21 + 2 * fq.field_q;
                    ((oe) this).field_Fb.a(var21, 2 * fq.field_q, 13, 256, var19);
                    var21 = var21 + (fq.field_q * 2 - -10);
                    ((oe) this).field_Nb.a(var21, fq.field_q, 0, 256, 0);
                    var21 = var21 + (fq.field_q + 10);
                    if (((oe) this).field_Pb == null) {
                      break L25;
                    } else {
                      var20 = ((oe) this).field_Pb.b((byte) 115, 4);
                      ((oe) this).field_Pb.a(fq.field_q, (var19 + -var20) / 2 + 13, var21, var20, 4, 0);
                      var21 = var21 + (fq.field_q - -10);
                      break L25;
                    }
                  }
                  var15[0].a(var21, var17, 13, 256, var16);
                  var15[1].a(var21, var17, 26 - -var16, 256, var16);
                  var15[2].a(var21, var17, 39 - -(2 * var16), 256, var16);
                  var22 = var21;
                  ((oe) this).field_Qb.a(24, var17 + (var22 + 10), 0, 256, 13 + (var19 + 13));
                  ((oe) this).field_Qb.field_zb = op.a(8421504, 16, 11579568, ((oe) this).field_Qb.field_nb, 2105376, 3);
                  var23 = 13 + (var19 + 13);
                  var24 = var17 + (24 - -var22) + 10;
                  var25 = ui.a(param2, param0, var23, (byte) -1);
                  var26 = pj.a(var24, param1, param3, (byte) 110);
                  ((oe) this).a(var26, var24, var25, 256, var23);
                  if (var27 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          ((oe) this).field_Tb = new ak(0L, param8, im.field_Lb);
          ((oe) this).field_Tb.field_Bb = 1;
          ((oe) this).field_Tb.field_N = 11184810;
          ((oe) this).field_Qb.a(((oe) this).field_Tb, (byte) 26);
          var15_int = 226;
          var16 = 10;
          var17 = ((oe) this).field_Tb.field_Db.b(((oe) this).field_Tb.field_cb, var15_int);
          ((oe) this).field_Tb.a(var16, var17 * fq.field_q, 13, 256, var15_int);
          var16 = var16 + var17 * fq.field_q;
          ((oe) this).field_Qb.a(24, var16 + 10, 0, 256, 13 + (var15_int + 13));
          ((oe) this).field_Qb.field_zb = op.a(8421504, 16, 11579568, ((oe) this).field_Qb.field_nb, 2105376, 3);
          var18 = 13 - (-var15_int - 13);
          var19 = 34 - -var16;
          var20 = ui.a(param2, param0, var18, (byte) -1);
          var21 = pj.a(var19, param1, param3, (byte) 32);
          ((oe) this).a(var21, var19, var20, 256, var18);
          break L0;
        }
    }

    private final int a(byte param0, int param1, ak param2, int param3, ak param4, String param5) {
        ak var7 = null;
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
                        var7 = new ak(0L, param2, 0, param1, param3, 24, param5);
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
                        if (param0 >= 111) {
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
                        ((oe) this).field_Ob = null;
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
                        param1 += 32;
                        param4.a(var7, (byte) 26);
                        stackOut_5_0 = param1;
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
                        stackOut_8_1 = new StringBuilder().append("oe.E(").append(param0).append(44).append(param1).append(44);
                        stackIn_11_0 = stackOut_8_0;
                        stackIn_11_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (param2 == null) {
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
                        stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44).append(param3).append(44);
                        stackIn_15_0 = stackOut_12_0;
                        stackIn_15_1 = stackOut_12_1;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        if (param4 == null) {
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
                        stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
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
                    throw aa.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static java.awt.Canvas b(byte param0) {
        RuntimeException var1 = null;
        Object stackIn_8_0 = null;
        java.awt.Canvas stackOut_5_0 = null;
        mk stackOut_7_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 <= -68) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        oe.m(38);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (ib.field_f != null) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = ec.field_u;
                        stackIn_8_0 = (Object) (Object) stackOut_5_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = ib.field_f;
                        stackIn_8_0 = (Object) (Object) stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return (java.awt.Canvas) (Object) stackIn_8_0;
                }
                case 9: {
                    var1 = (RuntimeException) (Object) caughtException;
                    throw aa.a((Throwable) (Object) var1, "oe.I(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(byte param0, boolean param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        fb stackIn_11_0 = null;
        fb stackIn_13_0 = null;
        fb stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackIn_18_0 = null;
        ak[] stackIn_19_0 = null;
        ak stackIn_25_0 = null;
        ak stackIn_27_0 = null;
        ak stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_44_0 = 0;
        Object stackIn_48_0 = null;
        int stackIn_54_0 = 0;
        Object stackIn_56_0 = null;
        int stackIn_57_0 = 0;
        fb stackOut_10_0 = null;
        fb stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        fb stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_17_0 = null;
        ak[] stackOut_18_0 = null;
        ak stackOut_24_0 = null;
        ak stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        ak stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_43_0 = 0;
        Object stackOut_47_0 = null;
        int stackOut_53_0 = 0;
        Object stackOut_55_0 = null;
        int stackOut_56_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Pixelate.field_H ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((oe) this).a(-28476, param1);
                        if (((oe) this).field_Nb != null) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ((oe) this).field_Nb.field_cb = ((oe) this).field_Ib.toString();
                        ((oe) this).field_Nb.field_D = (((oe) this).field_K + -((oe) this).field_Nb.field_Db.c(((oe) this).field_Nb.field_cb)) / 2;
                        ((oe) this).field_Nb.field_K = -((oe) this).field_Nb.field_D + ((oe) this).field_K;
                        if (null == ((oe) this).field_Pb) {
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
                        if (((oe) this).field_Pb.field_P != 0) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 15;
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
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = ((oe) this).field_Pb;
                        stackIn_13_0 = stackOut_10_0;
                        stackIn_11_0 = stackOut_10_0;
                        if (((oe) this).field_Pb.field_U) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = (fb) (Object) stackIn_11_0;
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
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = (fb) (Object) stackIn_13_0;
                        stackOut_13_1 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackIn_14_0.field_U = stackIn_14_1 != 0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 58;
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
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (d.field_b <= var3_int) {
                            statePc = 35;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackOut_17_0 = this;
                        stackIn_56_0 = stackOut_17_0;
                        stackIn_18_0 = stackOut_17_0;
                        if (var4 != 0) {
                            statePc = 56;
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
                        stackOut_18_0 = ((oe) this).field_Lb;
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
                        if (stackIn_19_0[var3_int] != null) {
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
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackOut_24_0 = ((oe) this).field_Lb[var3_int];
                        stackIn_27_0 = stackOut_24_0;
                        stackIn_25_0 = stackOut_24_0;
                        if (0 >= ((oe) this).field_Ib.length()) {
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
                        stackOut_25_0 = (ak) (Object) stackIn_25_0;
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
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackOut_27_0 = (ak) (Object) stackIn_27_0;
                        stackOut_27_1 = 0;
                        stackIn_28_0 = stackOut_27_0;
                        stackIn_28_1 = stackOut_27_1;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackIn_28_0.field_rb = stackIn_28_1 != 0;
                        if (!((oe) this).field_Lb[var3_int].field_rb) {
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
                        if ((((oe) this).field_Lb[var3_int].field_P ^ -1) == -1) {
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
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 58;
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
                        statePc = 58;
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
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (param0 > 30) {
                            statePc = 39;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        ((oe) this).field_Ob = null;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (-1 == (((oe) this).field_Ob.field_P ^ -1)) {
                            statePc = 42;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackOut_40_0 = -1;
                        stackIn_41_0 = stackOut_40_0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 41: {
                    return stackIn_41_0;
                }
                case 42: {
                    try {
                        if (!param1) {
                            statePc = 55;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackOut_43_0 = -1;
                        stackIn_44_0 = stackOut_43_0;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (stackIn_44_0 == (nm.field_c ^ -1)) {
                            statePc = 55;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackOut_47_0 = this;
                        stackIn_48_0 = stackOut_47_0;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (((oe) this).field_P == 0) {
                            statePc = 53;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        stackOut_53_0 = -1;
                        stackIn_54_0 = stackOut_53_0;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 54: {
                    return stackIn_54_0;
                }
                case 55: {
                    try {
                        stackOut_55_0 = this;
                        stackIn_56_0 = stackOut_55_0;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        stackOut_56_0 = ((oe) this).field_Jb;
                        stackIn_57_0 = stackOut_56_0;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 57: {
                    return stackIn_57_0;
                }
                case 58: {
                    var3 = (RuntimeException) (Object) caughtException;
                    throw aa.a((Throwable) (Object) var3, "oe.C(" + param0 + 44 + param1 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void m(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              field_Kb = null;
              field_Gb = null;
              field_Hb = null;
              field_Mb = null;
              if (param0 == 1) {
                break L0;
              } else {
                java.awt.Canvas discarded$2 = oe.b((byte) -8);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          field_Rb = null;
          field_Vb = null;
        }
    }

    final static void a(int param0, fm param1, hh[] param2, int[] param3, fm param4) {
        hh[] var5 = null;
        int[] var6 = null;
        hh[] var6_array = null;
        int var7_int = 0;
        tc var7 = null;
        ak var8 = null;
        ak var9 = null;
        ak var10 = null;
        ak var11 = null;
        tf[] var12 = null;
        tf[] var13 = null;
        tf[] var14 = null;
        ak var15 = null;
        tf[] var16 = null;
        tf[] var17 = null;
        int var18 = 0;
        L0: {
          var18 = Pixelate.field_H ? 1 : 0;
          var5 = lb.a(param1, 47, "lobby", "crowns");
          kk.field_s = var5.length;
          if (param2 == null) {
            break L0;
          } else {
            var6_array = new hh[param2.length + kk.field_s];
            var7_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((kk.field_s ^ -1) >= (var7_int ^ -1)) {
                    break L3;
                  } else {
                    var6_array[var7_int] = var5[var7_int];
                    var7_int++;
                    if (var18 != 0) {
                      break L2;
                    } else {
                      if (var18 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var7_int = 0;
                break L2;
              }
              L4: while (true) {
                L5: {
                  if ((var7_int ^ -1) <= (param2.length ^ -1)) {
                    break L5;
                  } else {
                    var6_array[var7_int + kk.field_s] = param2[var7_int];
                    var7_int++;
                    if (var18 != 0) {
                      break L0;
                    } else {
                      if (var18 == 0) {
                        continue L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                var5 = var6_array;
                break L0;
              }
            }
          }
        }
        var6 = new int[var5.length];
        var7_int = 0;
        L6: while (true) {
          L7: {
            L8: {
              L9: {
                L10: {
                  if ((kk.field_s ^ -1) >= (var7_int ^ -1)) {
                    break L10;
                  } else {
                    var6[var7_int] = 10;
                    var7_int++;
                    if (var18 != 0) {
                      break L9;
                    } else {
                      if (var18 == 0) {
                        continue L6;
                      } else {
                        break L10;
                      }
                    }
                  }
                }
                if (null != param2) {
                  break L9;
                } else {
                  break L8;
                }
              }
              L11: {
                if (null != param3) {
                  break L11;
                } else {
                  var7_int = 0;
                  L12: while (true) {
                    L13: {
                      if ((var7_int ^ -1) <= (param2.length ^ -1)) {
                        break L13;
                      } else {
                        var6[var7_int + kk.field_s] = param2[var7_int].field_a;
                        var7_int++;
                        if (var18 != 0) {
                          break L7;
                        } else {
                          if (var18 == 0) {
                            continue L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                    if (var18 == 0) {
                      break L8;
                    } else {
                      break L11;
                    }
                  }
                }
              }
              var7_int = 0;
              L14: while (true) {
                if ((param2.length ^ -1) >= (var7_int ^ -1)) {
                  break L8;
                } else {
                  var6[var7_int + kk.field_s] = param3[var7_int];
                  var7_int++;
                  if (var18 != 0) {
                    break L7;
                  } else {
                    if (var18 == 0) {
                      continue L14;
                    } else {
                      break L8;
                    }
                  }
                }
              }
            }
            v.field_c = 4;
            fq.field_q = 15;
            nc.field_d = 11;
            r.field_c = 2;
            hd.field_q = 2;
            break L7;
          }
          var7 = bf.a(0, param4, "largefont", param1, "lobby");
          ig.field_d = bf.a(0, param4, "generalfont", param1, "lobby");
          c.field_Y = bf.a(0, param4, "chatfont", param1, "lobby");
          var7.a((sl[]) (Object) var5, var6);
          ig.field_d.a((sl[]) (Object) var5, var6);
          c.field_Y.a((sl[]) (Object) var5, var6);
          var8 = new ak(0L, (ak) null);
          var8.field_mb = fq.field_q;
          var8.field_N = 16777215;
          var8.field_Db = (jl) (Object) var7;
          var8.field_kb = 1;
          var9 = var8;
          var9.field_Bb = 1;
          var10 = new ak(0L, (ak) null);
          var10.field_Db = (jl) (Object) ig.field_d;
          var10.field_mb = fq.field_q;
          var10.field_N = 16777215;
          var10.field_kb = 1;
          var11 = var10;
          var11.field_Bb = 1;
          io.field_f = new ak(0L, var8);
          io.field_f.field_zb = al.a(false, eh.a("heading", "lobby", (byte) 47, param1));
          eg.field_k = new ak(0L, (ak) null);
          eg.field_k.field_zb = ve.a(false, false, 4210752, 120, true, 8421504);
          sc.field_g = new ak(0L, (ak) null);
          sc.field_g.field_zb = op.a(6316128, 16, 6316128, 114, 1, 3);
          po.field_c = new ak(0L, (ak) null);
          po.field_c.field_zb = al.a(false, eh.a("popup", "lobby", (byte) 47, param1));
          var12 = al.a(false, eh.a("popup_mouseover", "lobby", (byte) 47, param1));
          var13 = eh.a("button", "lobby", (byte) 47, param1);
          var14 = al.a(false, eh.a("tab_active", "lobby", (byte) 47, param1));
          pj.field_i = new ak(0L, var8);
          pj.field_i.field_zb = var14;
          ae.field_f = new ak(0L, (ak) null);
          ae.field_f.field_H = bi.a("lobby", "closebutton", param1, (byte) -127);
          ae.field_f.field_B = bi.a("lobby", "closebutton_mouseover", param1, (byte) -106);
          ff.field_j = new ak(0L, var8);
          ff.field_j.field_zb = ve.a(true, true, 2039583, 40, true, 3815994);
          u.field_l = new ak(0L, var10);
          u.field_l.field_C = 2;
          u.field_l.field_zb = ve.a(true, false, 2039583, 30, true, 3815994);
          vk.field_mb = new ak(0L, var10);
          vk.field_mb.field_C = 2;
          vk.field_mb.field_zb = ve.a(false, false, 2039583, 30, true, 3815994);
          ni.field_s = new ak(0L, var10);
          ni.field_s.field_C = 2;
          ni.field_s.field_zb = ve.a(false, true, 2039583, 30, true, 3815994);
          mg.field_h = new ak(0L, (ak) null);
          mg.field_h.field_kb = 1;
          mg.field_h.field_N = 13421772;
          mg.field_h.field_mb = fq.field_q;
          mg.field_h.field_Db = (jl) (Object) ig.field_d;
          dn.field_c = new ak(0L, mg.field_h);
          dn.field_c.field_Cb = 16777215;
          dn.field_c.field_pb = 16777215;
          dn.field_c.field_N = 16764006;
          dn.field_c.field_O = 8421504;
          dn.field_c.field_y = 16777215;
          var15 = new ak(0L, dn.field_c);
          var15.field_N = 16777215;
          var15.field_mb = fq.field_q;
          var15.field_Db = (jl) (Object) var7;
          kj.field_l = new ak(0L, mg.field_h);
          kj.field_l.field_zb = ve.a(false, false, 2236962, 16, true, 2236962);
          kj.field_l.field_C = 2;
          qk.field_d = new ak(0L, mg.field_h);
          qk.field_d.field_zb = ve.a(false, false, 1513239, 16, true, 1513239);
          qk.field_d.field_C = 2;
          if (param0 < -117) {
            of.field_i = new ak(0L, kj.field_l);
            of.field_i.a(-27813, dn.field_c);
            ak.field_T = new ak(0L, qk.field_d);
            ak.field_T.a(-27813, dn.field_c);
            var16 = eh.a("button_mouseover", "lobby", (byte) 47, param1);
            a.field_O = new pi(po.field_c, var12, mg.field_h, dn.field_c, 3, 2, hd.field_q, 3, fq.field_q);
            lc.field_q = new ak(0L, dn.field_c);
            lc.field_q.field_sb = 1;
            lc.field_q.field_Q = 1;
            lc.field_q.field_hb = 1;
            lc.field_q.field_ab = var16;
            lc.field_q.field_zb = var13;
            lc.field_q.field_V = 1;
            lc.field_q.field_bb = eh.a("button_mouseheld", "lobby", (byte) 47, param1);
            lc.field_q.field_eb = eh.a("button_active", "lobby", (byte) 47, param1);
            lc.field_q.field_M = eh.a("button_disabled", "lobby", (byte) 47, param1);
            lc.field_q.field_Bb = 1;
            ab.field_a = new ak(0L, dn.field_c);
            ab.field_a.field_Bb = 1;
            ab.field_a.field_zb = al.a(false, eh.a("tab_inactive", "lobby", (byte) 47, param1));
            ab.field_a.field_ab = al.a(false, eh.a("tab_mouseover", "lobby", (byte) 47, param1));
            ab.field_a.field_eb = var14;
            vl.field_J = new ak(0L, (ak) null);
            vl.field_J.field_zb = op.a(1127256, 16, 1856141, 206, -1, 3);
            ff.field_a = new ak(0L, (ak) null);
            ff.field_a.field_zb = op.a(6052956, 16, 11579568, 290, -1, 3);
            bf.field_k = new ak(0L, var15);
            bf.field_k.field_V = 1;
            bf.field_k.field_sb = 1;
            bf.field_k.field_Bb = 1;
            bf.field_k.field_hb = 1;
            bf.field_k.field_Q = 1;
            nk.field_f = new ak(0L, bf.field_k);
            u.field_a = new ak(0L, dn.field_c);
            u.field_a.field_Q = 1;
            u.field_a.field_sb = 1;
            u.field_a.field_V = 1;
            u.field_a.field_hb = 1;
            u.field_a.field_Bb = 1;
            ul.field_p = new ak(0L, u.field_a);
            ge.field_h = new ak(0L, u.field_a);
            be.field_R = new ak(0L, bf.field_k);
            bl.field_d = new ak(0L, u.field_a);
            l.field_q = new ak(0L, u.field_a);
            bc.field_o = new ak(0L, u.field_a);
            u.field_a.field_zb = al.a(false, eh.a("smallbutton", "lobby", (byte) 47, param1));
            u.field_a.field_ab = al.a(false, eh.a("smallbutton_mouseover", "lobby", (byte) 47, param1));
            u.field_a.field_eb = al.a(false, eh.a("smallbutton_active", "lobby", (byte) 47, param1));
            u.field_a.field_bb = al.a(false, eh.a("smallbutton_active", "lobby", (byte) 47, param1));
            u.field_a.field_M = al.a(false, eh.a("smallbutton_disabled", "lobby", (byte) 47, param1));
            nk.field_f.field_zb = al.a(false, eh.a("mediumbutton", "lobby", (byte) 47, param1));
            nk.field_f.field_ab = al.a(false, eh.a("mediumbutton_mouseover", "lobby", (byte) 47, param1));
            nk.field_f.field_bb = al.a(false, eh.a("mediumbutton_mouseheld", "lobby", (byte) 47, param1));
            bf.field_k.field_zb = al.a(false, eh.a("bigbutton", "lobby", (byte) 47, param1));
            bf.field_k.field_ab = al.a(false, eh.a("bigbutton_mouseover", "lobby", (byte) 47, param1));
            bf.field_k.field_bb = al.a(false, eh.a("bigbutton_mouseheld", "lobby", (byte) 47, param1));
            bf.field_k.field_M = al.a(false, eh.a("bigbutton_disabled", "lobby", (byte) 47, param1));
            ul.field_p.field_zb = al.a(false, eh.a("greenbutton", "lobby", (byte) 47, param1));
            ul.field_p.field_ab = al.a(false, eh.a("greenbutton_mouseover", "lobby", (byte) 47, param1));
            ul.field_p.field_bb = al.a(false, eh.a("greenbutton_mouseheld", "lobby", (byte) 47, param1));
            ge.field_h.field_zb = al.a(false, eh.a("redbutton", "lobby", (byte) 47, param1));
            ge.field_h.field_ab = al.a(false, eh.a("redbutton_mouseover", "lobby", (byte) 47, param1));
            ge.field_h.field_bb = al.a(false, eh.a("redbutton_mouseheld", "lobby", (byte) 47, param1));
            be.field_R.field_zb = al.a(false, eh.a("backbutton", "lobby", (byte) 47, param1));
            be.field_R.field_ab = al.a(false, eh.a("backbutton_mouseover", "lobby", (byte) 47, param1));
            be.field_R.field_bb = al.a(false, eh.a("backbutton_mouseheld", "lobby", (byte) 47, param1));
            be.field_R.field_M = al.a(false, eh.a("backbutton_disabled", "lobby", (byte) 47, param1));
            bc.field_o.field_zb = al.a(false, eh.a("gameoptionbutton", "lobby", (byte) 47, param1));
            bc.field_o.field_ab = al.a(false, eh.a("gameoptionbutton_mouseover", "lobby", (byte) 47, param1));
            bc.field_o.field_eb = al.a(false, eh.a("gameoptionbutton_active", "lobby", (byte) 47, param1));
            bc.field_o.field_bb = al.a(false, eh.a("gameoptionbutton_active", "lobby", (byte) 47, param1));
            bc.field_o.field_M = al.a(false, eh.a("gameoptionbutton_disabled", "lobby", (byte) 47, param1));
            bl.field_d.field_zb = al.a(false, eh.a("chatbutton", "lobby", (byte) 47, param1));
            bl.field_d.field_ab = al.a(false, eh.a("chatbutton_mouseover", "lobby", (byte) 47, param1));
            bl.field_d.field_eb = al.a(false, eh.a("chatbutton_active", "lobby", (byte) 47, param1));
            bl.field_d.field_bb = al.a(false, eh.a("chatbutton_active", "lobby", (byte) 47, param1));
            l.field_q.field_zb = al.a(false, eh.a("chatfilterbutton", "lobby", (byte) 47, param1));
            l.field_q.field_ab = al.a(false, eh.a("chatfilterbutton_mouseover", "lobby", (byte) 47, param1));
            l.field_q.field_eb = al.a(false, eh.a("chatfilterbutton_active", "lobby", (byte) 47, param1));
            l.field_q.field_bb = al.a(false, eh.a("chatfilterbutton_active", "lobby", (byte) 47, param1));
            var17 = eh.a("checkbox", "lobby", (byte) 47, param1);
            um.field_q = new fb(0L, var17[1], var17[0], 1, dn.field_c, (String) null);
            on.field_mb = new ak(0L, (ak) null);
            on.field_mb.field_zb = db.a(24414, bi.a("lobby", "slideregion", param1, (byte) -73));
            on.field_mb.field_ab = db.a(24414, bi.a("lobby", "slideregion_mouseover", param1, (byte) -123));
            on.field_mb.field_bb = db.a(24414, bi.a("lobby", "slideregion_mouseheld", param1, (byte) -64));
            on.field_mb.field_M = db.a(24414, bi.a("lobby", "slideregion_disabled", param1, (byte) -50));
            jn.field_p = new ak(0L, (ak) null);
            jn.field_p.field_zb = al.a(false, eh.a("dragbar", "lobby", (byte) 47, param1));
            jn.field_p.field_ab = al.a(false, eh.a("dragbar_mouseover", "lobby", (byte) 47, param1));
            jn.field_p.field_bb = al.a(false, eh.a("dragbar_mouseheld", "lobby", (byte) 47, param1));
            jn.field_p.field_M = al.a(false, eh.a("dragbar_disabled", "lobby", (byte) 47, param1));
            dj.field_a = new ak(0L, (ak) null);
            dj.field_a.field_H = bi.a("lobby", "upbutton", param1, (byte) -78);
            dj.field_a.field_B = bi.a("lobby", "upbutton_mouseover", param1, (byte) -126);
            dj.field_a.field_ob = bi.a("lobby", "upbutton_mouseheld", param1, (byte) -43);
            dj.field_a.field_xb = bi.a("lobby", "upbutton_disabled", param1, (byte) -58);
            ek.field_b = new ak(0L, (ak) null);
            ek.field_b.field_H = bi.a("lobby", "downbutton", param1, (byte) -25);
            ek.field_b.field_B = bi.a("lobby", "downbutton_mouseover", param1, (byte) -71);
            ek.field_b.field_ob = bi.a("lobby", "downbutton_mouseheld", param1, (byte) -83);
            ek.field_b.field_xb = bi.a("lobby", "downbutton_disabled", param1, (byte) -97);
            ug.field_s = new vp(0L, dj.field_a, ek.field_b, on.field_mb, jn.field_p);
            rm.field_a = new pd(0L, (ak) null, ff.field_g, ug.field_s, u.field_a, (String) null, (String) null);
            return;
          } else {
            return;
          }
        }
    }

    final boolean l(int param0) {
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
                        if (param0 == 2) {
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
                        oe.a(-5, (fm) null, (hh[]) null, (int[]) null, (fm) null);
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
                        if (((oe) this).field_Pb == null) {
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
                        if (!((oe) this).field_Pb.field_U) {
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
                    throw aa.a((Throwable) (Object) var2, "oe.F(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int a(ak param0, int param1, byte param2, int param3, ak param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
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
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        param1 += 8;
                        var6_int = param4.field_Db.a(param4.field_cb, -(param4.field_C * 2) + param3, param4.field_mb);
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
                        param4.a(param1, var6_int, 0, 256, param3);
                        if (param2 >= 93) {
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
                        int discarded$2 = this.a((ak) null, 19, (byte) -78, -14, (ak) null);
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
                        param0.a(param4, (byte) 26);
                        param1 = param1 + (var6_int - 0);
                        stackOut_5_0 = param1;
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
                    var6 = (RuntimeException) (Object) caughtException;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    try {
                        stackOut_8_0 = (RuntimeException) var6;
                        stackOut_8_1 = new StringBuilder().append("oe.B(");
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
                        stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
                        stackIn_15_0 = stackOut_12_0;
                        stackIn_15_1 = stackOut_12_1;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        if (param4 == null) {
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
                    throw aa.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final String k(int param0) {
        RuntimeException var2 = null;
        String stackIn_5_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        try {
          try {
            L0: {
              if (param0 > 102) {
                break L0;
              } else {
                int discarded$2 = this.a((ak) null, 8, (byte) 76, -63, (ak) null);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = ((oe) this).field_Ib.toString();
          stackIn_5_0 = stackOut_4_0;
        }
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Sb = 0;
        field_Vb = "Emergent Behaviour";
        field_Gb = "Players: <%0>/<%1>";
        field_Mb = "You must play 1 more rated game before playing with the current options.";
        field_Kb = "Spectate <%0>'s game";
    }
}
