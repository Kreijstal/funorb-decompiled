/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db implements ci {
    static kl field_a;
    private ee field_n;
    private int field_k;
    static byte field_p;
    private int field_g;
    private int field_t;
    private int field_e;
    private int field_h;
    static int field_m;
    private int field_i;
    private int field_r;
    static int[] field_c;
    static String field_f;
    private int field_d;
    private int field_j;
    static String field_b;
    private int field_q;
    static kc field_o;
    private int field_s;
    static int[] field_l;

    public final void a(int param0, lk param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ua var11 = null;
        lk stackIn_3_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        lk stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (param1 instanceof ua) {
                stackOut_2_0 = (lk) param1;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (lk) (Object) stackOut_1_0;
                break L1;
              }
            }
            var11 = (ua) (Object) stackIn_3_0;
            if (param2 == 11447) {
              L2: {
                if (var11 == null) {
                  break L2;
                } else {
                  param4 = param4 & var11.field_B;
                  break L2;
                }
              }
              L3: {
                var7 = 5592405;
                if (!param4) {
                  break L3;
                } else {
                  var7 = 16777215;
                  break L3;
                }
              }
              L4: {
                vj.c(param1.field_o + param0, param3 - -param1.field_i, param1.field_h, param1.field_q, ((db) this).field_i);
                var8 = ((db) this).field_q + param0 + param1.field_o;
                var9 = ((db) this).field_t + param1.field_i + param3;
                vj.f(var8, var9, ((db) this).field_d, ((db) this).field_g, 5592405);
                vj.c(var8, var9, ((db) this).field_d, ((db) this).field_g, var7);
                if (!var11.field_D) {
                  break L4;
                } else {
                  vj.e(var8, var9, ((db) this).field_d + var8, ((db) this).field_g + var9, 1);
                  vj.e(((db) this).field_d + var8, var9, var8, ((db) this).field_g + var9, 1);
                  break L4;
                }
              }
              L5: {
                if (null != ((db) this).field_n) {
                  var10 = ((db) this).field_d + (((db) this).field_q - -((db) this).field_j);
                  int discarded$1 = ((db) this).field_n.a(param1.field_r, var10 + param0 + param1.field_o, param1.field_i + (param3 - -((db) this).field_e), -((db) this).field_j + (-var10 + param1.field_h), param1.field_q - (((db) this).field_j << 1), ((db) this).field_r, ((db) this).field_h, ((db) this).field_k, ((db) this).field_s, 0);
                  break L5;
                } else {
                  break L5;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var6;
            stackOut_15_1 = new StringBuilder().append("db.C(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(boolean param0, byte[] param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Object var16 = null;
        pb var17 = null;
        pb var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        byte[] var26 = null;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_47_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        var15 = Main.field_T;
        try {
          L0: {
            L1: {
              var17 = new pb(param1);
              var18 = var17;
              var18.field_i = -2 + param1.length;
              cf.field_c = var18.d((byte) 72);
              hb.field_a = new int[cf.field_c];
              kb.field_c = new int[cf.field_c];
              rd.field_k = new byte[cf.field_c][];
              na.field_q = new int[cf.field_c];
              ml.field_b = new int[cf.field_c];
              hl.field_y = new boolean[cf.field_c];
              vd.field_r = new byte[cf.field_c][];
              var18.field_i = -(8 * cf.field_c) + param1.length + -7;
              p.field_l = var18.d((byte) 72);
              if (param0) {
                break L1;
              } else {
                var16 = null;
                db.a(false, (byte[]) null);
                break L1;
              }
            }
            gk.field_a = var18.d((byte) 72);
            var3 = 1 + (255 & var18.f(27));
            var4 = 0;
            L2: while (true) {
              if (var4 >= cf.field_c) {
                var4 = 0;
                L3: while (true) {
                  if (cf.field_c <= var4) {
                    var4 = 0;
                    L4: while (true) {
                      if (cf.field_c <= var4) {
                        var4 = 0;
                        L5: while (true) {
                          if (cf.field_c <= var4) {
                            var18.field_i = param1.length + (-7 + -(cf.field_c * 8) + -(3 * (var3 - 1)));
                            jf.field_i = new int[var3];
                            var4 = 1;
                            L6: while (true) {
                              if (var3 <= var4) {
                                var18.field_i = 0;
                                var4 = 0;
                                L7: while (true) {
                                  if (cf.field_c <= var4) {
                                    break L0;
                                  } else {
                                    L8: {
                                      var5 = na.field_q[var4];
                                      var6 = hb.field_a[var4];
                                      var7 = var5 * var6;
                                      var25 = new byte[var7];
                                      var23 = var25;
                                      var21 = var23;
                                      var19 = var21;
                                      var8 = var19;
                                      rd.field_k[var4] = var25;
                                      var26 = new byte[var7];
                                      var24 = var26;
                                      var22 = var24;
                                      var20 = var22;
                                      var9 = var20;
                                      vd.field_r[var4] = var26;
                                      var10 = 0;
                                      var11 = var18.f(-102);
                                      if ((var11 & 1) == 0) {
                                        var12 = 0;
                                        L9: while (true) {
                                          if (var12 >= var7) {
                                            if ((2 & var11) != 0) {
                                              var12 = 0;
                                              L10: while (true) {
                                                if (var12 >= var7) {
                                                  break L8;
                                                } else {
                                                  L11: {
                                                    byte dupTemp$2 = var18.a(true);
                                                    var9[var12] = dupTemp$2;
                                                    var13 = dupTemp$2;
                                                    stackOut_47_0 = var10;
                                                    stackIn_49_0 = stackOut_47_0;
                                                    stackIn_48_0 = stackOut_47_0;
                                                    if (var13 == -1) {
                                                      stackOut_49_0 = stackIn_49_0;
                                                      stackOut_49_1 = 0;
                                                      stackIn_50_0 = stackOut_49_0;
                                                      stackIn_50_1 = stackOut_49_1;
                                                      break L11;
                                                    } else {
                                                      stackOut_48_0 = stackIn_48_0;
                                                      stackOut_48_1 = 1;
                                                      stackIn_50_0 = stackOut_48_0;
                                                      stackIn_50_1 = stackOut_48_1;
                                                      break L11;
                                                    }
                                                  }
                                                  var10 = stackIn_50_0 | stackIn_50_1;
                                                  var12++;
                                                  continue L10;
                                                }
                                              }
                                            } else {
                                              break L8;
                                            }
                                          } else {
                                            var8[var12] = var18.a(true);
                                            var12++;
                                            continue L9;
                                          }
                                        }
                                      } else {
                                        var12 = 0;
                                        L12: while (true) {
                                          if (var5 <= var12) {
                                            if ((var11 & 2) != 0) {
                                              var12 = 0;
                                              L13: while (true) {
                                                if (var12 >= var5) {
                                                  break L8;
                                                } else {
                                                  var13 = 0;
                                                  L14: while (true) {
                                                    if (var13 >= var6) {
                                                      var12++;
                                                      continue L13;
                                                    } else {
                                                      L15: {
                                                        byte dupTemp$3 = var18.a(true);
                                                        var9[var5 * var13 + var12] = dupTemp$3;
                                                        var14 = dupTemp$3;
                                                        stackOut_35_0 = var10;
                                                        stackIn_37_0 = stackOut_35_0;
                                                        stackIn_36_0 = stackOut_35_0;
                                                        if (-1 == var14) {
                                                          stackOut_37_0 = stackIn_37_0;
                                                          stackOut_37_1 = 0;
                                                          stackIn_38_0 = stackOut_37_0;
                                                          stackIn_38_1 = stackOut_37_1;
                                                          break L15;
                                                        } else {
                                                          stackOut_36_0 = stackIn_36_0;
                                                          stackOut_36_1 = 1;
                                                          stackIn_38_0 = stackOut_36_0;
                                                          stackIn_38_1 = stackOut_36_1;
                                                          break L15;
                                                        }
                                                      }
                                                      var10 = stackIn_38_0 | stackIn_38_1;
                                                      var13++;
                                                      continue L14;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              break L8;
                                            }
                                          } else {
                                            var13 = 0;
                                            L16: while (true) {
                                              if (var6 <= var13) {
                                                var12++;
                                                continue L12;
                                              } else {
                                                var8[var12 - -(var13 * var5)] = var18.a(true);
                                                var13++;
                                                continue L16;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    hl.field_y[var4] = var10 != 0;
                                    var4++;
                                    continue L7;
                                  }
                                }
                              } else {
                                L17: {
                                  jf.field_i[var4] = var18.e(true);
                                  if (jf.field_i[var4] != 0) {
                                    break L17;
                                  } else {
                                    jf.field_i[var4] = 1;
                                    break L17;
                                  }
                                }
                                var4++;
                                continue L6;
                              }
                            }
                          } else {
                            hb.field_a[var4] = var18.d((byte) 72);
                            var4++;
                            continue L5;
                          }
                        }
                      } else {
                        na.field_q[var4] = var18.d((byte) 72);
                        var4++;
                        continue L4;
                      }
                    }
                  } else {
                    ml.field_b[var4] = var18.d((byte) 72);
                    var4++;
                    continue L3;
                  }
                }
              } else {
                kb.field_c[var4] = var17.d((byte) 72);
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var2 = decompiledCaughtException;
            stackOut_53_0 = (RuntimeException) var2;
            stackOut_53_1 = new StringBuilder().append("db.A(").append(param0).append(',');
            stackIn_55_0 = stackOut_53_0;
            stackIn_55_1 = stackOut_53_1;
            stackIn_54_0 = stackOut_53_0;
            stackIn_54_1 = stackOut_53_1;
            if (param1 == null) {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "null";
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              stackIn_56_2 = stackOut_55_2;
              break L18;
            } else {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "{...}";
              stackIn_56_0 = stackOut_54_0;
              stackIn_56_1 = stackOut_54_1;
              stackIn_56_2 = stackOut_54_2;
              break L18;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_56_0, stackIn_56_2 + ')');
        }
    }

    public static void a() {
        field_o = null;
        field_f = null;
        field_a = null;
        field_b = null;
        field_c = null;
        field_l = null;
    }

    db(ee param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((db) this).field_k = 1;
        ((db) this).field_s = 1;
        try {
            ((db) this).field_g = param7;
            ((db) this).field_r = param3;
            ((db) this).field_i = param9;
            ((db) this).field_n = param0;
            ((db) this).field_j = param1;
            ((db) this).field_d = param8;
            ((db) this).field_e = param2;
            ((db) this).field_q = param5;
            ((db) this).field_h = param4;
            ((db) this).field_t = param6;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "db.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_c = new int[128];
        field_b = "Menu";
    }
}
