/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sl extends ba implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    static ta field_o;
    static int[] field_k;
    static String field_n;
    static int field_j;
    private java.awt.image.ImageConsumer field_l;
    private java.awt.image.ColorModel field_m;

    final void a(int param0, int param1, java.awt.Graphics param2, int param3) {
        RuntimeException runtimeException = null;
        java.awt.image.ImageConsumer var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.b(-102);
              param2.drawImage(this.field_b, param0, param3, (java.awt.image.ImageObserver) (this));
              if (param1 == 7) {
                break L1;
              } else {
                var6 = (java.awt.image.ImageConsumer) null;
                this.requestTopDownLeftRightResend((java.awt.image.ImageConsumer) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("sl.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param3 + ')');
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return this.field_l == param0;
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (!Character.isISOControl(param1)) {
              if (th.a(false, param1)) {
                stackIn_7_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var6 = bi.field_s;
                var2 = var6;
                var3 = param0;
                L1: while (true) {
                  L2: {
                    L3: {
                      L4: {
                        L5: {
                          if (var3 >= var6.length) {
                            break L5;
                          } else {
                            var4 = var6[var3];
                            var8 = var4;
                            var7 = param1;
                            if (var5 != 0) {
                              if (var7 <= var8) {
                                break L3;
                              } else {
                                L6: while (true) {
                                  var4 = var2[var3];
                                  stackIn_25_0 = var4 ^ -1;

                                  if (var5 != 0) {
                                    break L2;
                                  } else {
                                    if (stackIn_25_0 != (param1 ^ -1)) {
                                      var3++;
                                      if (var5 == 0) {
                                        if (var2.length <= var3) {
                                          break L3;
                                        } else {
                                          continue L6;
                                        }
                                      } else {
                                        break L3;
                                      }
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                              }
                            } else {
                              if (var7 != var8) {
                                var3++;
                                if (var5 == 0) {
                                  continue L1;
                                } else {
                                  break L5;
                                }
                              } else {
                                return true;
                              }
                            }
                          }
                        }
                        var2 = ff.field_e;
                        var3 = 0;
                        L7: while (true) {
                          if (var2.length <= var3) {
                            break L3;
                          } else {
                            var4 = var2[var3];
                            stackIn_25_0 = var4 ^ -1;

                            if (var5 != 0) {
                              break L2;
                            } else {
                              if (stackIn_25_0 != (param1 ^ -1)) {
                                var3++;
                                if (var5 == 0) {
                                  continue L7;
                                } else {
                                  break L3;
                                }
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                      }
                      stackIn_22_0 = 1;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                    stackIn_25_0 = 0;
                    break L2;
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2_ref), "sl.G(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_25_0 != 0;
            } else {
              return stackIn_22_0 != 0;
            }
          }
        }
    }

    public static void b(byte param0) {
        field_o = null;
        field_n = null;
        field_k = null;
        if (param0 != 74) {
            sl.a(22, (byte) -64);
        }
    }

    final void a(int param0, java.awt.Component param1, int param2, int param3) {
        try {
            this.field_i = param2;
            this.field_e = new int[1 + param2 * param0];
            this.field_g = param0;
            this.field_m = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
            this.field_b = param1.createImage((java.awt.image.ImageProducer) (this));
            this.b(-68);
            param1.prepareImage(this.field_b, (java.awt.image.ImageObserver) (this));
            this.b(-78);
            if (param3 > -10) {
                java.awt.image.ImageConsumer var6 = (java.awt.image.ImageConsumer) null;
                this.isConsumer((java.awt.image.ImageConsumer) null);
            }
            param1.prepareImage(this.field_b, (java.awt.image.ImageObserver) (this));
            this.b(-62);
            param1.prepareImage(this.field_b, (java.awt.image.ImageObserver) (this));
            this.a((byte) 112);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "sl.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
            this.field_l = param0;
            param0.setDimensions(this.field_g, this.field_i);
            param0.setProperties((Hashtable) null);
            param0.setColorModel(this.field_m);
            param0.setHints(14);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "sl.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(boolean param0) {
        boolean stackIn_24_0 = false;
        int stackIn_30_0 = 0;
        boolean stackOut_23_0;
        int statePc = 0;
        Throwable caughtException = null;
        ki var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1 = (ki) ((Object) hd.field_u.a((byte) -117));
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var1 == null) {
                            statePc = 34;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var4 != 0) {
                            statePc = 40;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var1.field_t != null) {
                            statePc = 33;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var1.b((byte) -106);
                        var1.f(-7);
                        if ((float)var1.field_y + var1.field_q >= 480.0f) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var1.field_t = ri.field_b;
                        if (var4 == 0) {
                            statePc = 33;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (!var1.field_E) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var1.field_q - (float)var1.field_y < (float)hf.field_f.field_O) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        lb.b(false);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (!var1.field_E) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var4 == 0) {
                            statePc = 33;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if ((float)var1.field_y + var1.field_q <= 0.0f) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        dc.field_e = 0;
                        var1.field_q = var1.field_q - (var1.field_q + (float)var1.field_y);
                        var1.field_j = true;
                        var1.field_t = ok.field_a;
                        cj.a((byte) -73, ke.field_h[3]);
                        if (var4 == 0) {
                            statePc = 33;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (!pa.a(var1.field_I, (int)((float)var1.field_G + var1.field_B), var1.field_y + (int)var1.field_q, sb.field_m, 80, 0)) {
                            statePc = 33;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        jj.a(-32680, var1, var1.field_G + ((int)var1.field_B - 80), (int)var1.field_q + var1.field_y);
                        if (0 < var1.field_m) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var1.field_x) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var1.field_t = ok.field_a;
                        lc.field_f = true;
                        var2 = 1;
                        var3 = 0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var1.field_m <= var3) {
                            statePc = 29;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = var1.field_o[var3].field_x;
                        stackIn_30_0 = stackOut_23_0 ? 1 : 0;
                        stackIn_24_0 = stackOut_23_0;
                        if (var4 != 0) {
                            statePc = 30;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (!stackIn_24_0) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var2 = 0;
                        if (var4 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var3++;
                        if (var4 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackIn_30_0 = var2;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (stackIn_30_0 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var1.field_v = var1.field_v * 0.5f;
                        var1.field_D = var1.field_D * 0.5f;
                        var1.b((byte) -115);
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var1 = (ki) ((Object) hd.field_u.d((byte) 63));
                        if (var4 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (!param0) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        ac.field_a.a((byte) 127);
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        sl.a(6, (byte) 31);
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        ac.field_a.a((byte) 127);
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 39: {
                    var1_ref = (RuntimeException) ((Object) caughtException);
                    throw la.a((Throwable) ((Object) var1_ref), "sl.H(" + param0 + ')');
                }
                case 40: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            stackIn_1_0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var7);

            stackIn_4_1 = new StringBuilder().append("sl.imageUpdate(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_1_0 != 0;
    }

    final static void a(int param0, byte param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        m var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5 = (m) ((Object) gi.field_l.a((byte) -117));
                        var3 = 65 / ((param1 - -27) / 57);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var5 == null) {
                            statePc = 9;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        oe.a(var5, param0, (byte) -95);
                        var5 = (m) ((Object) gi.field_l.d((byte) 63));
                        if (var4 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        return;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var4 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        return;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw la.a((Throwable) ((Object) var2), "sl.F(" + param0 + ',' + param1 + ')');
                }
                case 9: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_l != param0) {
                break L1;
              } else {
                this.field_l = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("sl.removeConsumer(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    sl() {
    }

    private final synchronized void b(int param0) {
        java.awt.Image var3;
        if (param0 <= -31) {
          if (null == this.field_l) {
            return;
          } else {
            this.field_l.setPixels(0, 0, this.field_g, this.field_i, this.field_m, this.field_e, 0, this.field_g);
            this.field_l.imageComplete(2);
            return;
          }
        } else {
          var3 = (java.awt.Image) null;
          this.imageUpdate((java.awt.Image) null, 57, 66, 101, 18, -15);
          if (null == this.field_l) {
            return;
          } else {
            this.field_l.setPixels(0, 0, this.field_g, this.field_i, this.field_m, this.field_e, 0, this.field_g);
            this.field_l.imageComplete(2);
            return;
          }
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
            this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "sl.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_j = 0;
        field_k = new int[5];
    }
}
