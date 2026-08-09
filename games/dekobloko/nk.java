/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk {
    static int field_b;
    static String field_c;
    static boolean field_k;
    private int field_a;
    private int field_o;
    private be field_m;
    private be field_n;
    static int field_g;
    private be[] field_e;
    private long field_h;
    static qm field_f;
    static int[] field_j;
    static String[][] field_d;
    static volatile int field_l;
    static boolean field_i;

    public static void a(int param0) {
        byte[] var2;
        field_c = null;
        field_d = (String[][]) null;
        field_j = null;
        field_f = null;
        if (param0 <= -31) {
          return;
        } else {
          var2 = (byte[]) null;
          nk.a((w) null, (w) null, 83, -100, -58, (w) null, (byte[]) null, 7, 17, -108);
          return;
        }
    }

    final be b(int param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var2;
        int var3;
        be var4;
        be var5;
        be var6;
        be var9;
        var3 = client.field_A ? 1 : 0;
        if (-1 > (this.field_o ^ -1)) {
          if (this.field_e[-1 + this.field_o] == this.field_m) {
            L0: while (true) {
              if (this.field_o < this.field_a) {
                fieldTemp$2 = this.field_o;
                this.field_o = this.field_o + 1;
                var4 = this.field_e[fieldTemp$2].field_p;
                var6 = var4;
                if (var4 != this.field_e[this.field_o + -1]) {
                  this.field_m = var6.field_p;
                  return var6;
                } else {
                  if (var3 == 0) {
                    continue L0;
                  } else {
                    var2 = -38 / ((param0 - -21) / 56);
                    return null;
                  }
                }
              } else {
                var2 = -38 / ((param0 - -21) / 56);
                return null;
              }
            }
          } else {
            var9 = this.field_m;
            this.field_m = var9.field_p;
            return var9;
          }
        } else {
          L1: while (true) {
            if (this.field_o < this.field_a) {
              fieldTemp$3 = this.field_o;
              this.field_o = this.field_o + 1;
              var4 = this.field_e[fieldTemp$3].field_p;
              var5 = var4;
              if (var4 != this.field_e[this.field_o + -1]) {
                this.field_m = var5.field_p;
                return var5;
              } else {
                if (var3 == 0) {
                  continue L1;
                } else {
                  var2 = -38 / ((param0 - -21) / 56);
                  return null;
                }
              }
            } else {
              var2 = -38 / ((param0 - -21) / 56);
              return null;
            }
          }
        }
    }

    final be d(int param0) {
        be var2;
        be var3;
        int var4;
        Object stackIn_9_0 = null;
        var4 = client.field_A ? 1 : 0;
        if (null != this.field_n) {
          if (param0 == -17713) {
            var2 = this.field_e[(int)((long)(this.field_a - 1) & this.field_h)];
            L0: while (true) {
              if (var2 != this.field_n) {
                stackIn_9_0 = this;

                if (var4 == 0) {
                  if (((nk) (this)).field_n.field_r == this.field_h) {
                    var3 = this.field_n;
                    this.field_n = this.field_n.field_p;
                    return var3;
                  } else {
                    this.field_n = this.field_n.field_p;
                    if (var4 == 0) {
                      continue L0;
                    } else {
                      this.field_n = null;
                      return null;
                    }
                  }
                } else {
                  ((nk) (this)).field_n = null;
                  return null;
                }
              } else {
                this.field_n = null;
                return null;
              }
            }
          } else {
            return (be) null;
          }
        } else {
          return null;
        }
    }

    final void a(be param0, int param1, long param2) {
        be var5 = null;
        RuntimeException var5_ref = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != param0.field_v) {
                param0.e((byte) 75);
                break L1;
              } else {
                break L1;
              }
            }
            var5 = this.field_e[(int)((long)(this.field_a - 1) & param2)];
            param0.field_p = var5;
            param0.field_v = var5.field_v;
            param0.field_v.field_p = param0;
            param0.field_r = param2;
            param0.field_p.field_v = param0;
            if (param1 == -1) {
              break L0;
            } else {
              this.b(85);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5_ref);

            stackIn_8_1 = new StringBuilder().append("nk.A(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final be c(int param0) {
        this.field_o = 0;
        if (param0 != -9443) {
            field_i = true;
            return this.b(-81);
        }
        return this.b(-81);
    }

    final static void a(w param0, w param1, int param2, int param3, int param4, w param5, byte[] param6, int param7, int param8, int param9) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        rb.field_k = param6;
                        uc.field_g = -1L;
                        hg.field_b = param3;
                        j.field_b = param6.length;
                        kk.field_l = new byte[(hg.field_b - -7) / 8];
                        fj.field_h = false;
                        g.field_N = null;
                        cd.field_m = null;
                        var10_int = param2;
                        var11 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var11 >= rb.field_k.length) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var10_int = var10_int + (255 & rb.field_k[var11]);
                        var11++;
                        if (var12 != 0) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var12 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var10_int = (7 + var10_int) / 8;
                        v.field_a = new byte[var10_int];
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (null != param1.field_M) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        param1.field_M = new vj();
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        i.field_b = param1.field_M;
                        i.field_b.c(118);
                        ob.field_i = new nk(param4);
                        rf.field_o = -1;
                        de.field_R = -1;
                        cj.field_a = 0;
                        ta.field_b = 0;
                        if (null == param0.field_M) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        param0.field_M = new vj();
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        h.field_b = param0.field_M;
                        h.field_b.c(param2 ^ 105);
                        tg.field_b = new nk(param9);
                        if (param5.field_M != null) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        param5.field_M = new vj();
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        oc.field_b = param5.field_M;
                        oc.field_b.c(121);
                        hn.field_h = new nk(param8);
                        oa.field_a = param7;
                        km.field_C = 0L;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    var10 = (RuntimeException) ((Object) caughtException);
                    stackIn_18_0 = (RuntimeException) (var10);
                    stackIn_17_0 = stackIn_18_0;
                    stackIn_18_1 = new StringBuilder().append("nk.C(");
                    stackIn_17_1 = stackIn_18_1;
                    if (param0 == null) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_19_2 = "{...}";
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                    stackIn_19_2 = "null";
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_19_0);
                    stackIn_20_0 = stackIn_21_0;
                    stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
                    stackIn_20_1 = stackIn_21_1;
                    if (param1 == null) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    stackIn_22_0 = (RuntimeException) ((Object) stackIn_20_0);
                    stackIn_22_1 = (StringBuilder) ((Object) stackIn_20_1);
                    stackIn_22_2 = "{...}";
                    statePc = 22;
                    continue stateLoop;
                }
                case 21: {
                    stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
                    stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
                    stackIn_22_2 = "null";
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    stackIn_24_0 = (RuntimeException) ((Object) stackIn_22_0);
                    stackIn_23_0 = stackIn_24_0;
                    stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
                    stackIn_23_1 = stackIn_24_1;
                    if (param5 == null) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_23_0);
                    stackIn_25_1 = (StringBuilder) ((Object) stackIn_23_1);
                    stackIn_25_2 = "{...}";
                    statePc = 25;
                    continue stateLoop;
                }
                case 24: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
                    stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
                    stackIn_25_2 = "null";
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    stackIn_27_0 = (RuntimeException) ((Object) stackIn_25_0);
                    stackIn_26_0 = stackIn_27_0;
                    stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
                    stackIn_26_1 = stackIn_27_1;
                    if (param6 == null) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackIn_28_0 = (RuntimeException) ((Object) stackIn_26_0);
                    stackIn_28_1 = (StringBuilder) ((Object) stackIn_26_1);
                    stackIn_28_2 = "{...}";
                    statePc = 28;
                    continue stateLoop;
                }
                case 27: {
                    stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
                    stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
                    stackIn_28_2 = "null";
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    throw dh.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
                }
                case 29: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(String param0, byte param1, tf param2, boolean param3, int param4, String param5, String param6) {
        RuntimeException var7 = null;
        wj var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (uc.field_c != sh.field_d) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                L2: {
                  var8 = new wj(ah.field_c, param2);
                  ah.field_c.a((byte) -123, var8);
                  if (!dg.b(-40)) {
                    break L2;
                  } else {
                    var8.b(true);
                    if (!client.field_A) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  ve.field_Gc = param0;
                  ea.field_x = null;
                  te.field_q = param6;
                  sh.field_d = pa.field_V;
                  qb.field_t = param5;
                  jk.field_e = param4;
                  if (!param3) {
                    stackIn_10_0 = 0;
                    break L3;
                  } else {
                    stackIn_10_0 = 1;
                    break L3;
                  }
                }
                cf.field_i = stackIn_10_0 != 0;
                break L1;
              }
              if (param1 > 120) {
                stackIn_15_0 = 1;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_13_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var7);

            stackIn_18_1 = new StringBuilder().append("nk.G(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param6 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L7;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L7;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_19_0), stackIn_28_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            return stackIn_15_0 != 0;
          }
        }
    }

    nk(int param0) {
        be dupTemp$0 = null;
        be var3 = null;
        int var4 = client.field_A ? 1 : 0;
        this.field_o = 0;
        this.field_e = new be[param0];
        this.field_a = param0;
        int var2 = 0;
        do {
            if (param0 <= var2) {
                return;
            }
            dupTemp$0 = new be();
            var3 = dupTemp$0;
            this.field_e[var2] = dupTemp$0;
            var3.field_v = var3;
            var3.field_p = var3;
            var2++;
            if (var4 != 0) {
                return;
            }
        } while (var4 == 0);
    }

    final be a(int param0, long param1) {
        be var4;
        be var5;
        int var6;
        String var7;
        int stackIn_7_0 = 0;
        var6 = client.field_A ? 1 : 0;
        this.field_h = param1;
        var4 = this.field_e[(int)((long)(-1 + this.field_a) & param1)];
        this.field_n = var4.field_p;
        L0: while (true) {
          L1: {
            L2: {
              if (var4 == this.field_n) {
                break L2;
              } else {
                stackIn_7_0 = ((this.field_n.field_r ^ -1L) < (param1 ^ -1L) ? -1 : ((this.field_n.field_r ^ -1L) == (param1 ^ -1L) ? 0 : 1));

                if (var6 != 0) {
                  break L1;
                } else {
                  if (stackIn_7_0 != 0) {
                    this.field_n = this.field_n.field_p;
                    if (var6 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  } else {
                    var5 = this.field_n;
                    this.field_n = this.field_n.field_p;
                    return var5;
                  }
                }
              }
            }
            stackIn_7_0 = param0;
            break L1;
          }
          if (stackIn_7_0 != 24710) {
            var7 = (String) null;
            nk.a((String) null, (byte) 91, (tf) null, false, 64, (String) null, (String) null);
            this.field_n = null;
            return null;
          } else {
            this.field_n = null;
            return null;
          }
        }
    }

    static {
        field_c = "The wildcard special item can be used in place of any other colour.";
        field_j = new int[8];
        field_d = new String[][]{new String[]{"Earthquake", "Causes stacks of loose pieces to collapse."}, new String[]{"Drill", "Individually pops every piece in its path."}, new String[]{"Bomb", "When you pop a shape touching a bomb, everything in your bucket of the same colour will explode."}, new String[]{"Power Drill", "Pops every entire shape, loose or solid, in its path. Loose shapes take touching solid shapes with them!"}, new String[]{"Water Capsule", "Turns every solid shape in your bucket into loose pieces. Can be quite spectacular."}, new String[]{"Poison", "Turns all the loose pieces in your bucket into solid shapes. Not good!"}, new String[]{"Wildcard", "Can be used in place of any other loose piece."}};
        field_f = new qm(8, 0, 4, 1);
        field_l = 0;
        field_i = false;
    }
}
