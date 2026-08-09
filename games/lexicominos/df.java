/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df {
    private long field_f;
    static String[] field_d;
    int field_k;
    private boolean field_e;
    int field_g;
    private int field_c;
    private String field_j;
    static int field_a;
    String field_h;
    int field_i;
    int[] field_b;

    final int a(int param0) {
        if (!this.field_e) {
          if (2 == this.field_g) {
            if (this.field_c <= 0) {
              if (fk.field_h != this.field_f) {
                if (param0 == -1) {
                  if ((vl.field_b ^ -1) == -3) {
                    if (dj.a((byte) 79, this.field_j)) {
                      return 1;
                    } else {
                      return 0;
                    }
                  } else {
                    return 0;
                  }
                } else {
                  field_d = (String[]) null;
                  if ((vl.field_b ^ -1) == -3) {
                    if (!dj.a((byte) 79, this.field_j)) {
                      return 0;
                    } else {
                      return 1;
                    }
                  } else {
                    return 0;
                  }
                }
              } else {
                return 1;
              }
            } else {
              return 2;
            }
          } else {
            if (fk.field_h != this.field_f) {
              if (param0 == -1) {
                if ((vl.field_b ^ -1) == -3) {
                  if (!dj.a((byte) 79, this.field_j)) {
                    return 0;
                  } else {
                    return 1;
                  }
                } else {
                  return 0;
                }
              } else {
                field_d = (String[]) null;
                if ((vl.field_b ^ -1) == -3) {
                  if (!dj.a((byte) 79, this.field_j)) {
                    return 0;
                  } else {
                    return 1;
                  }
                } else {
                  return 0;
                }
              }
            } else {
              return 1;
            }
          }
        } else {
          return 2;
        }
    }

    final static db[] a(byte param0) {
        boolean stackIn_5_0 = false;
        int stackIn_24_0 = 0;
        boolean stackIn_28_0 = false;
        int stackIn_45_0 = 0;
        boolean stackOut_4_0;
        boolean stackOut_27_0;
        int statePc = 0;
        db[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var6_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var12 = null;
        int[] var14 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = Lexicominos.field_L ? 1 : 0;
                    if (param0 == 91) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_d = (String[]) null;
                    statePc = 25;
                    continue stateLoop;
                }
                case 2: {
                    var1 = new db[th.field_t];
                    var2 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var2 >= th.field_t) {
                        statePc = 23;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var3 = pb.field_h[var2] * bd.field_m[var2];
                    var21 = be.field_f[var2];
                    stackOut_4_0 = me.field_w[var2];
                    stackIn_24_0 = stackOut_4_0 ? 1 : 0;
                    stackIn_5_0 = stackOut_4_0;
                    if (var8 != 0) {
                        statePc = 24;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (stackIn_5_0) {
                        statePc = 14;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var9 = new int[var3];
                    var6_int = 0;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (var6_int >= var3) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var9[var6_int] = ci.field_b[vg.a(255, (int) var21[var6_int])];
                    var6_int++;
                    if (var8 != 0) {
                        statePc = 13;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (var8 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var1[var2] = new db(uc.field_fb, eh.field_b, mg.field_x[var2], rg.field_c[var2], pb.field_h[var2], bd.field_m[var2], var9);
                    statePc = 13;
                    continue stateLoop;
                }
                case 12: {
                    var1[var2] = new db(uc.field_fb, eh.field_b, mg.field_x[var2], rg.field_c[var2], pb.field_h[var2], bd.field_m[var2], var9);
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    if (var8 == 0) {
                        statePc = 21;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var22 = hl.field_o[var2];
                    var14 = new int[var3];
                    var12 = var14;
                    var6 = var12;
                    var7 = 0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (var3 <= var7) {
                        statePc = 19;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var6[var7] = tb.a(vg.a(255, (int) var22[var7]) << 774833816, ci.field_b[vg.a(255, (int) var21[var7])]);
                    var7++;
                    if (var8 != 0) {
                        statePc = 22;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (var8 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var1[var2] = (db) ((Object) new pi(uc.field_fb, eh.field_b, mg.field_x[var2], rg.field_c[var2], pb.field_h[var2], bd.field_m[var2], var14));
                    statePc = 21;
                    continue stateLoop;
                }
                case 20: {
                    var1[var2] = (db) ((Object) new pi(uc.field_fb, eh.field_b, mg.field_x[var2], rg.field_c[var2], pb.field_h[var2], bd.field_m[var2], var14));
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    var2++;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if (var8 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    stackIn_24_0 = 12428;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    gk.a(stackIn_24_0);
                    return var1;
                }
                case 25: {
                    var1 = new db[th.field_t];
                    var2 = 0;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    if (var2 >= th.field_t) {
                        statePc = 44;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    var3 = pb.field_h[var2] * bd.field_m[var2];
                    var23 = be.field_f[var2];
                    stackOut_27_0 = me.field_w[var2];
                    stackIn_45_0 = stackOut_27_0 ? 1 : 0;
                    stackIn_28_0 = stackOut_27_0;
                    if (var8 != 0) {
                        statePc = 45;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (stackIn_28_0) {
                        statePc = 36;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var9 = new int[var3];
                    var6_int = 0;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    if (var6_int >= var3) {
                        statePc = 34;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var9[var6_int] = ci.field_b[vg.a(255, (int) var23[var6_int])];
                    var6_int++;
                    if (var8 != 0) {
                        statePc = 35;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (var8 == 0) {
                        statePc = 30;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var1[var2] = new db(uc.field_fb, eh.field_b, mg.field_x[var2], rg.field_c[var2], pb.field_h[var2], bd.field_m[var2], var9);
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (var8 == 0) {
                        statePc = 42;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var24 = hl.field_o[var2];
                    var14 = new int[var3];
                    var12 = var14;
                    var6 = var12;
                    var7 = 0;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if (var3 <= var7) {
                        statePc = 41;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var6[var7] = tb.a(vg.a(255, (int) var24[var7]) << 774833816, ci.field_b[vg.a(255, (int) var23[var7])]);
                    var7++;
                    if (var8 != 0) {
                        statePc = 43;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (var8 == 0) {
                        statePc = 37;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    var1[var2] = (db) ((Object) new pi(uc.field_fb, eh.field_b, mg.field_x[var2], rg.field_c[var2], pb.field_h[var2], bd.field_m[var2], var14));
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    var2++;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    if (var8 == 0) {
                        statePc = 26;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    stackIn_45_0 = 12428;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    gk.a(stackIn_45_0);
                    return var1;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            field_a = 12;
            field_d = null;
            return;
        }
        field_d = null;
    }

    final static db a(String param0, String param1, sh param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        db stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = param2.c(param0, (byte) -89);
              if (param3 <= -36) {
                break L1;
              } else {
                df.a(true);
                break L1;
              }
            }
            var5 = param2.a(param1, -27964, var4_int);
            stackIn_3_0 = uh.a(param2, var4_int, (byte) -108, var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("df.D(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    df(boolean param0) {
        L0: {
          L1: {
            this.field_c = rl.field_E;
            this.field_k = kc.field_c;
            this.field_g = kb.field_a;
            if (!param0) {
              break L1;
            } else {
              this.field_b = eb.field_d;
              if (!Lexicominos.field_L) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          this.field_b = null;
          break L0;
        }
        this.field_i = fd.field_g;
        this.field_f = jf.field_P;
        this.field_j = gk.field_c;
        this.field_h = oe.field_b;
        this.field_e = tf.field_a;
    }

    static {
        field_d = new String[]{"Wordsmith", "Expert Wordsmith", "Master Wordsmith", "Virtuoso Wordsmith", "Combosmith", "Expert Combosmith", "Master Combosmith", "Virtuoso Combosmith", "Sequence Builder", "Expert Sequence Builder", "Master Sequence Builder", "Lexicominist", "Expert Lexicominist", "Master Lexicominist", "Virtuoso Lexicominist", "Stunning Recovery"};
        field_a = -1;
    }
}
