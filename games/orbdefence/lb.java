/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb {
    static String field_a;
    private int field_h;
    static int field_g;
    private int field_e;
    int field_i;
    int field_f;
    int field_j;
    int field_d;
    private int field_b;
    int field_c;

    final static void a(boolean param0) {
        if (mg.field_k == null) {
          return;
        } else {
          hl.a(mg.field_k, 125);
          mg.field_k.a(wc.field_c, -128);
          mg.field_k = null;
          if (!param0) {
            return;
          } else {
            L0: {
              if (ne.field_b != null) {
                ne.field_b.c((byte) -113);
                break L0;
              } else {
                break L0;
              }
            }
            tf.field_f.requestFocus();
            return;
          }
        }
    }

    final void a(byte param0, int param1) {
        if (param0 != -6) {
          field_g = -15;
          this.field_e = this.field_e + param1;
          this.field_b = this.field_b - param1;
          return;
        } else {
          this.field_e = this.field_e + param1;
          this.field_b = this.field_b - param1;
          return;
        }
    }

    public static void a(byte param0) {
        if (param0 != -98) {
            return;
        }
        field_a = null;
    }

    final static void c(int param0) {
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        se var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        ha var10 = null;
        se var11 = null;
        int[] var12 = null;
        dc var13 = null;
        dc var14 = null;
        int[] var15 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var11 = cd.field_t;
                        var2 = var11.b((byte) 90);
                        if (var2 != 0) {
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
                        var15 = qh.b(8);
                        var12 = var15;
                        var3 = var12;
                        var9 = var3;
                        var4 = var9;
                        var5 = var11;
                        var6 = ((mg) ((Object) var5)).b((byte) 90);
                        var7 = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var7 >= var6) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var9[var7] = ((mg) ((Object) var5)).l(0);
                        var7++;
                        if (var8 != 0) {
                            statePc = 23;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var8 == 0) {
                            statePc = 3;
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
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var13 = (dc) ((Object) mj.field_m.b((byte) 117));
                        if (var13 != null) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        th.a(124);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return;
                }
                case 10: {
                    try {
                        var13.field_i = var15[0];
                        var13.field_g = true;
                        var13.field_f = var3;
                        var13.b(57);
                        if (var8 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (-2 == (var2 ^ -1)) {
                            statePc = 19;
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
                        if (var2 != 2) {
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
                        var14 = (dc) ((Object) mj.field_m.b((byte) 118));
                        if (var14 != null) {
                            statePc = 16;
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
                        th.a(121);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return;
                }
                case 16: {
                    try {
                        var14.field_f = qh.b(8);
                        var14.field_g = true;
                        var14.field_i = var14.field_f[0];
                        var14.b(57);
                        if (var8 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        pe.a((byte) -13, (Throwable) null, "A1: " + sj.b(true));
                        th.a(107);
                        if (var8 == 0) {
                            statePc = 23;
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
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var10 = (ha) ((Object) oa.field_d.b((byte) 122));
                        if (var10 != null) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        th.a(103);
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 21: {
                    return;
                }
                case 22: {
                    try {
                        var10.b(57);
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (param0 > 108) {
                            statePc = 27;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        lb.a(false);
                        return;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw dd.a((Throwable) ((Object) var1), "lb.D(" + param0 + ')');
                }
                case 27: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int b(boolean param0) {
        if (!param0) {
            this.field_h = 100;
            return this.field_e;
        }
        return this.field_e;
    }

    final void a(int param0) {
        if (this.field_h > param0) {
            this.field_h = this.field_h - 1;
        }
    }

    final boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 >= -18) {
          L0: {
            field_a = (String) null;
            if (this.field_e != (16777215 ^ this.field_b)) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.field_e != (16777215 ^ this.field_b)) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void c(boolean param0) {
        if (param0) {
            return;
        }
        this.field_e = 0;
        this.field_b = 16777215;
    }

    final static void a(boolean param0, int param1) {
        if (param0) {
          hg.field_Z = param1 >> 2081019780 & 3;
          bd.field_p = (14 & param1) >> 158315010;
          if ((hg.field_Z ^ -1) >= -3) {
            wf.field_a = 3 & param1;
            if (bd.field_p <= 2) {
              if (wf.field_a > 2) {
                wf.field_a = 2;
                return;
              } else {
                return;
              }
            } else {
              bd.field_p = 2;
              if (wf.field_a > 2) {
                wf.field_a = 2;
                return;
              } else {
                return;
              }
            }
          } else {
            hg.field_Z = 2;
            wf.field_a = 3 & param1;
            if (bd.field_p <= 2) {
              if (wf.field_a > 2) {
                wf.field_a = 2;
                return;
              } else {
                return;
              }
            } else {
              bd.field_p = 2;
              if (wf.field_a > 2) {
                wf.field_a = 2;
                return;
              } else {
                return;
              }
            }
          }
        } else {
          field_a = (String) null;
          hg.field_Z = param1 >> 2081019780 & 3;
          bd.field_p = (14 & param1) >> 158315010;
          if ((hg.field_Z ^ -1) < -3) {
            hg.field_Z = 2;
            wf.field_a = 3 & param1;
            if (bd.field_p > 2) {
              bd.field_p = 2;
              if (wf.field_a > 2) {
                wf.field_a = 2;
                return;
              } else {
                return;
              }
            } else {
              if (wf.field_a > 2) {
                wf.field_a = 2;
                return;
              } else {
                return;
              }
            }
          } else {
            wf.field_a = 3 & param1;
            if (bd.field_p > 2) {
              bd.field_p = 2;
              if (wf.field_a <= 2) {
                return;
              } else {
                wf.field_a = 2;
                return;
              }
            } else {
              if (wf.field_a > 2) {
                wf.field_a = 2;
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final void b(byte param0) {
        int var2 = -58 / ((20 - param0) / 55);
    }

    lb(f param0, int param1) {
        try {
            this.field_d = 0;
            this.field_i = param1;
            this.c(false);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "lb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_a = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
