/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bd extends oh implements da {
    private lk field_lb;
    static int[] field_ob;
    private boolean field_mb;
    static java.awt.Image field_kb;
    private boolean field_rb;
    private boolean field_nb;
    private fa field_qb;
    private boolean field_pb;

    final void n(int param0) {
        if (!this.field_G) {
          return;
        } else {
          if (param0 != -22645) {
            return;
          } else {
            L0: {
              L1: {
                this.field_G = false;
                if (this.field_pb) {
                  break L1;
                } else {
                  if (this.field_mb) {
                    cj.a(param0 + 22645);
                    if (!fleas.field_A) {
                      break L0;
                    } else {
                      break L1;
                    }
                  } else {
                    break L0;
                  }
                }
              }
              ek.a((byte) -6);
              break L0;
            }
            return;
          }
        }
    }

    final void a(byte param0, int param1, String param2) {
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        bm stackIn_13_0 = null;
        bm stackIn_14_0 = null;
        String stackIn_14_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        String var6 = null;
        bm var7 = null;
        var5 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (this.field_rb) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                this.field_rb = true;
                stackIn_6_0 = this;

                if (param1 != 256) {
                  stackIn_7_0 = this;
                  stackIn_7_1 = 0;
                  break L1;
                } else {
                  stackIn_7_0 = this;
                  stackIn_7_1 = 1;
                  break L1;
                }
              }
              L2: {
                L3: {
                  ((bd) (this)).field_nb = stackIn_7_1 != 0;
                  this.field_lb.a((byte) 105, 4210752, 8405024);
                  var7 = new bm((bd) (this), this.field_qb, param2);
                  if (-6 != (param1 ^ -1)) {
                    break L3;
                  } else {
                    var7.a(ld.field_c, -23493, 11);
                    var7.a(vk.field_K, -23493, 17);
                    if (var5 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (-257 == (param1 ^ -1)) {
                    break L4;
                  } else {
                    L5: {
                      stackIn_13_0 = (bm) (var7);

                      if (this.field_pb) {
                        stackIn_14_0 = (bm) ((Object) stackIn_13_0);
                        stackIn_14_1 = uh.field_o;
                        break L5;
                      } else {
                        stackIn_14_0 = (bm) ((Object) stackIn_13_0);
                        stackIn_14_1 = mi.field_k;
                        break L5;
                      }
                    }
                    ((bm) (Object) stackIn_14_0).a(stackIn_14_1, -23493, -1);
                    if (var5 == 0) {
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
                var7.a((kd) (this), true, uh.field_o);
                break L2;
              }
              L6: {
                L7: {
                  if ((param1 ^ -1) != -4) {
                    break L7;
                  } else {
                    var7.a(bm.field_N, -23493, 7);
                    if (var5 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                L8: {
                  if (4 == param1) {
                    break L8;
                  } else {
                    L9: {
                      if (-7 == (param1 ^ -1)) {
                        break L9;
                      } else {
                        if (9 != param1) {
                          break L6;
                        } else {
                          var7.a((kd) (this), true, fc.field_d);
                          if (var5 == 0) {
                            break L6;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    var7.a(cb.field_s, -23493, 9);
                    if (var5 == 0) {
                      break L6;
                    } else {
                      break L8;
                    }
                  }
                }
                var7.a(uj.field_e, -23493, 8);
                break L6;
              }
              L10: {
                this.d(var7, 26034);
                if (param0 <= -2) {
                  break L10;
                } else {
                  var6 = (String) null;
                  this.a((byte) 83, 85, (String) null);
                  break L10;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var4);

            stackIn_32_1 = new StringBuilder().append("bd.MB(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L11;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L11;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void g(byte param0) {
        field_ob = null;
        if (param0 != 127) {
            bd.g((byte) 53);
        }
        field_kb = null;
    }

    bd(f param0, fa param1, String param2, boolean param3, boolean param4) {
        super(param0, new bm((bd) null, param1, param2), 77, 10, 10);
        try {
            this.field_qb = param1;
            this.field_pb = param3 ? true : false;
            this.field_mb = param4 ? true : false;
            this.field_nb = false;
            this.field_rb = false;
            this.field_lb = new lk(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_lb.field_H = true;
            this.a((qa) (this.field_lb), (byte) -97);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "bd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void o(int param0) {
        String[][] dupTemp$0 = null;
        long[][] dupTemp$1 = null;
        int[][] dupTemp$2 = null;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4_long = 0L;
        ll var4 = null;
        int var5 = 0;
        bh var6_ref_bh = null;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        ih var28 = null;
        ih var29 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var26 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var28 = ae.field_a;
                        var29 = var28;
                        var2 = var29.e(false);
                        if (0 == var2) {
                            statePc = 16;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var2 ^ -1) != -2) {
                            statePc = 14;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var3 = var29.d((byte) -53);
                        var4_long = var29.f(-102);
                        var6_ref_bh = (bh) ((Object) wi.field_j.c((byte) 47));
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var6_ref_bh == null) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_64_0 = var3 ^ -1;
                        stackIn_6_0 = stackIn_64_0;
                        stackIn_64_1 = var6_ref_bh.field_s ^ -1;
                        stackIn_6_1 = stackIn_64_1;
                        if (var26 != 0) {
                            statePc = 64;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (stackIn_6_0 != stackIn_6_1) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var26 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var6_ref_bh = (bh) ((Object) wi.field_j.b((byte) -105));
                        if (var26 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var6_ref_bh != null) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        k.c(param0 ^ 13077);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return;
                }
                case 13: {
                    try {
                        var6_ref_bh.field_k = var4_long;
                        var6_ref_bh.c(-1);
                        if (var26 == 0) {
                            statePc = 63;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        ud.a("HS1: " + ak.a(true), (Throwable) null, 0);
                        k.c(-28354);
                        if (var26 == 0) {
                            statePc = 63;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var3 = var29.d((byte) 108);
                        var4 = (ll) ((Object) jj.field_S.c((byte) 47));
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var4 == null) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_64_0 = var3 ^ -1;
                        stackIn_19_0 = stackIn_64_0;
                        stackIn_64_1 = var4.field_k ^ -1;
                        stackIn_19_1 = stackIn_64_1;
                        if (var26 != 0) {
                            statePc = 64;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (stackIn_19_0 == stackIn_19_1) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var4 = (ll) ((Object) jj.field_S.b((byte) -105));
                        if (var26 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var4 != null) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        k.c(param0 ^ 13077);
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 23: {
                    return;
                }
                case 24: {
                    try {
                        var5 = var29.e(false);
                        if (0 == var5) {
                            statePc = 62;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var6 = var4.field_q;
                        de.field_n[0].field_b = b.field_e;
                        de.field_n[0].field_e = null;
                        de.field_n[0].field_i = false;
                        var7 = var4.field_t;
                        var8_int = 1;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var8_int >= var5) {
                            statePc = 33;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        de.field_n[var8_int].field_b = var28.h(0);
                        de.field_n[var8_int].field_i = false;
                        stackIn_64_0 = -2;
                        stackIn_28_0 = stackIn_64_0;
                        stackIn_64_1 = var29.e(false) ^ -1;
                        stackIn_28_1 = stackIn_64_1;
                        if (var26 != 0) {
                            statePc = 64;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (stackIn_28_0 == stackIn_28_1) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        de.field_n[var8_int].field_e = null;
                        if (var26 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        de.field_n[var8_int].field_e = var29.h(param0 + 24021);
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var8_int++;
                        if (var26 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        dupTemp$0 = new String[3][var6];
                        var4.field_i = dupTemp$0;
                        var8 = dupTemp$0;
                        var9 = new String[3][var6];
                        dupTemp$1 = new long[3][var6];
                        var4.field_u = dupTemp$1;
                        var10 = dupTemp$1;
                        dupTemp$2 = new int[3][var6 * var7];
                        var4.field_p = dupTemp$2;
                        var11 = dupTemp$2;
                        var12 = 0;
                        var13 = 0;
                        var14 = 0;
                        var15 = 0;
                        var16 = 0;
                        var17 = 0;
                        var18 = var29.e(false);
                        if (0 < var18) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var19 = 0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var19 >= var18) {
                            statePc = 62;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var20 = var28.e(false);
                        var21 = de.field_n[var20].field_b;
                        var22 = var29.f(-103);
                        var24 = var29.field_i;
                        stackIn_64_0 = var19;
                        stackIn_38_0 = stackIn_64_0;
                        stackIn_64_1 = var6;
                        stackIn_38_1 = stackIn_64_1;
                        if (var26 != 0) {
                            statePc = 64;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (stackIn_38_0 < stackIn_38_1) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var8[0][var12] = var21;
                        var9[0][var12] = de.field_n[var20].field_e;
                        var10[0][var12] = var22;
                        var12++;
                        var25 = 0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var7 <= var25) {
                            statePc = 45;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        incrementValue$3 = var15;
                        var15++;
                        var11[0][incrementValue$3] = var28.c((byte) 127);
                        var25++;
                        if (var26 != 0) {
                            statePc = 52;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (var26 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (var21 == null) {
                            statePc = 52;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (!ng.a(var21, (byte) 7)) {
                            statePc = 52;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var8[1][var13] = b.field_e;
                        var9[1][var13] = null;
                        var10[1][var13] = var22;
                        var13++;
                        var29.field_i = var24;
                        var25 = 0;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (var25 >= var7) {
                            statePc = 52;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        incrementValue$4 = var16;
                        var16++;
                        var11[1][incrementValue$4] = var28.c((byte) -31);
                        var25++;
                        if (var26 != 0) {
                            statePc = 61;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (var26 == 0) {
                            statePc = 48;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (var14 >= var6) {
                            statePc = 60;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (!de.field_n[var20].field_i) {
                            statePc = 55;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        de.field_n[var20].field_i = true;
                        var8[2][var14] = var21;
                        var9[2][var14] = de.field_n[var20].field_e;
                        var10[2][var14] = var22;
                        var14++;
                        var29.field_i = var24;
                        var25 = 0;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (var25 >= var7) {
                            statePc = 60;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        incrementValue$5 = var17;
                        var17++;
                        var11[2][incrementValue$5] = var28.c((byte) 123);
                        var25++;
                        if (var26 != 0) {
                            statePc = 61;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (var26 == 0) {
                            statePc = 56;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var19++;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (var26 == 0) {
                            statePc = 36;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        var4.field_l = true;
                        var4.c(param0 + 24020);
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        stackIn_64_0 = param0;
                        stackIn_64_1 = -24021;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (stackIn_64_0 == stackIn_64_1) {
                            statePc = 68;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        bd.o(-33);
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 67: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw pf.a((Throwable) ((Object) var1), "bd.KB(" + param0 + ')');
                }
                case 68: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void e(boolean param0) {
        if (!param0) {
            this.field_rb = false;
        }
        this.field_lb.a((byte) 92, 4210752, 2121792);
        bm var2 = new bm((bd) (this), this.field_qb, kb.field_m);
        var2.a(rc.field_f, -23493, 15);
        this.d(var2, 26034);
    }

    public void a(int param0, int param1, int param2, int param3, bb param4) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (!this.field_nb) {
                  break L2;
                } else {
                  cg.a((byte) -105, 3);
                  this.n(-22645);
                  if (!fleas.field_A) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              qg.a("tochangedisplayname.ws", rl.a((byte) -72), 0);
              break L1;
            }
            L3: {
              if (param3 == 248) {
                break L3;
              } else {
                this.field_lb = (lk) null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var6);

            stackIn_9_1 = new StringBuilder().append("bd.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final boolean a(int param0, int param1, qa param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (13 != param1) {
              L1: {
                if (param0 == -2) {
                  break L1;
                } else {
                  field_kb = (java.awt.Image) null;
                  break L1;
                }
              }
              stackIn_6_0 = super.a(-2, param1, param2, param3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.n(-22645);
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("bd.N(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0;
        }
    }

    static {
    }
}
