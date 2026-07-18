/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lr extends d {
    static String field_L;
    static er field_O;
    static String field_I;
    static String field_K;
    static String field_J;
    static String field_S;
    static String field_N;
    private int field_Q;
    static aa field_H;
    static cr field_P;
    static String field_M;
    static String field_T;
    private of field_R;

    final void a(byte param0, int param1, int param2, iq param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 > 6) {
                break L1;
              } else {
                lr.a((byte) 76);
                break L1;
              }
            }
            ((lr) this).field_Q = ((lr) this).field_Q + 1;
            super.a((byte) 114, param1, param2, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("lr.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L2;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    final String a(boolean param0) {
        if (((lr) this).field_p) {
          return ((lr) this).field_R.d(-27183);
        } else {
          if (param0) {
            String discarded$1 = ((lr) this).a(true);
            return null;
          } else {
            return null;
          }
        }
    }

    public static void a(byte param0) {
        field_O = null;
        field_K = null;
        field_T = null;
        field_H = null;
        field_I = null;
        int var1 = 91 / ((param0 - 36) / 47);
        field_S = null;
        field_L = null;
        field_M = null;
        field_J = null;
        field_N = null;
        field_P = null;
    }

    final boolean a(byte param0, iq param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 == 116) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("lr.DA(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_4_0 != 0;
    }

    final static void a(int param0, String param1, long param2) {
        RuntimeException runtimeException = null;
        CharSequence var5 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            ui.field_g = 2;
            ea.field_b = param1;
            var5 = (CharSequence) (Object) param1;
            sm.field_Kb = rc.a(var5, 320);
            ie.field_Nb = param2;
            int discarded$3 = -14829;
            nb.h();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("lr.C(").append(-57).append(',');
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param2 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        ba var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        er var12 = null;
        er var13 = null;
        er var14 = null;
        var11 = Vertigo2.field_L ? 1 : 0;
        super.a(param0, param1, param2, param3);
        if (param1 != 0) {
          return;
        } else {
          L0: {
            L1: {
              var5 = ((lr) this).field_o + param2 + (((lr) this).field_n >> 1);
              var6 = ((lr) this).field_t + (param3 - -(((lr) this).field_s >> 1));
              var8 = ((lr) this).field_R.a(-23996);
              if (tk.field_n == var8) {
                break L1;
              } else {
                if (dj.field_c == var8) {
                  break L1;
                } else {
                  if (ir.field_a == var8) {
                    var13 = jn.field_b[2];
                    var13.d(var5 - (var13.field_y >> 1), var6 - (var13.field_t >> 1), 256);
                    break L0;
                  } else {
                    if (qm.field_G == var8) {
                      var12 = jn.field_b[1];
                      var12.d(var5 + -(var12.field_y >> 1), -(var12.field_t >> 1) + var6, 256);
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                }
              }
            }
            L2: {
              L3: {
                var14 = jn.field_b[0];
                var9 = var14.field_x << 1;
                var10 = var14.field_B << 1;
                if (cr.field_E == null) {
                  break L3;
                } else {
                  if (var9 > cr.field_E.field_y) {
                    break L3;
                  } else {
                    if (cr.field_E.field_t < var10) {
                      break L3;
                    } else {
                      lq.a(cr.field_E, (byte) -94);
                      bi.c();
                      break L2;
                    }
                  }
                }
              }
              cr.field_E = new er(var9, var10);
              lq.a(cr.field_E, (byte) -94);
              break L2;
            }
            var14.a(112, 144, var14.field_x << 4, var14.field_B << 4, -((lr) this).field_Q << 10, 4096);
            ln.d(-28558);
            cr.field_E.d(var5 - var14.field_x, var6 + -var14.field_B, 256);
            break L0;
          }
          return;
        }
    }

    final static String a(int param0, int param1, CharSequence[] param2) {
        RuntimeException var4 = null;
        CharSequence var4_ref = null;
        int var4_int = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        CharSequence var7_ref_CharSequence = null;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        String stackIn_5_0 = null;
        String stackIn_11_0 = null;
        String stackIn_13_0 = null;
        String stackIn_29_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        String stackOut_12_0 = null;
        String stackOut_10_0 = null;
        String stackOut_28_0 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var9 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 == 0) {
              stackOut_4_0 = "";
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              if (param0 == 1) {
                var10 = param2[0];
                var4_ref = var10;
                if (var4_ref != null) {
                  stackOut_12_0 = ((Object) (Object) var10).toString();
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0;
                } else {
                  stackOut_10_0 = "null";
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              } else {
                var4_int = param0;
                var5 = 0;
                var6_int = 0;
                L1: while (true) {
                  if (var4_int <= var6_int) {
                    var6 = new StringBuilder(var5);
                    var7 = 0;
                    L2: while (true) {
                      if (var4_int <= var7) {
                        stackOut_28_0 = var6.toString();
                        stackIn_29_0 = stackOut_28_0;
                        break L0;
                      } else {
                        L3: {
                          var8 = param2[var7];
                          if (var8 != null) {
                            StringBuilder discarded$2 = var6.append(var8);
                            break L3;
                          } else {
                            StringBuilder discarded$3 = var6.append("null");
                            break L3;
                          }
                        }
                        var7++;
                        continue L2;
                      }
                    }
                  } else {
                    L4: {
                      var7_ref_CharSequence = param2[var6_int];
                      if (var7_ref_CharSequence == null) {
                        var5 += 4;
                        break L4;
                      } else {
                        var5 = var5 + var7_ref_CharSequence.length();
                        break L4;
                      }
                    }
                    var6_int++;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var4;
            stackOut_30_1 = new StringBuilder().append("lr.D(").append(param0).append(',').append(0).append(',');
            stackIn_33_0 = stackOut_30_0;
            stackIn_33_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param2 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L5;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_34_0 = stackOut_31_0;
              stackIn_34_1 = stackOut_31_1;
              stackIn_34_2 = stackOut_31_2;
              break L5;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ',' + 1039685793 + ')');
        }
        return stackIn_29_0;
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
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
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        RuntimeException decompiledCaughtException = null;
        var35 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param4 != param1) {
                  break L2;
                } else {
                  if (param5 != param6) {
                    break L2;
                  } else {
                    if (param0 != param9) {
                      break L2;
                    } else {
                      if (param7 != param3) {
                        break L2;
                      } else {
                        eh.a(param7, param9, (byte) -4, param5, param8, param1);
                        break L1;
                      }
                    }
                  }
                }
              }
              var10_int = param1;
              var11 = param5;
              var12 = 3 * param1;
              var13 = 3 * param5;
              var14 = 3 * param4;
              var15 = param6 * 3;
              var16 = param0 * 3;
              var17 = 3 * param3;
              var18 = param9 - var16 - -var14 - param1;
              var19 = -param5 + (var15 + -var17 + param7);
              var20 = -var14 + (var16 - (var14 + -var12));
              var21 = var13 + -var15 + (var17 + -var15);
              var22 = -var12 + var14;
              var23 = -var13 + var15;
              var24 = 128;
              L3: while (true) {
                if (var24 > 4096) {
                  break L1;
                } else {
                  var25 = var24 * var24 >> 12;
                  var26 = var25 * var24 >> 12;
                  var27 = var18 * var26;
                  var28 = var19 * var26;
                  var29 = var20 * var25;
                  var30 = var25 * var21;
                  var31 = var24 * var22;
                  var32 = var23 * var24;
                  var33 = (var31 + var29 + var27 >> 12) + param1;
                  var34 = (var28 + (var30 - -var32) >> 12) + param5;
                  eh.a(var34, var33, (byte) -4, var11, param8, var10_int);
                  var11 = var34;
                  var10_int = var33;
                  var24 += 128;
                  continue L3;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var10, "lr.A(" + param0 + ',' + param1 + ',' + 67 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    final static int e() {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_34_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_33_0 = 0;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            var2 = 0;
            L1: while (true) {
              int discarded$3 = 0;
              if (!gf.a()) {
                L2: {
                  ve.field_d.a((byte) -29, fk.b(gb.field_d, 1282642017, ed.field_n), fk.b(no.field_e, 1282642017, sd.field_N));
                  if (ve.field_d.a(84)) {
                    var1_int = 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var3 = 0;
                    if (var1_int == 0) {
                      break L4;
                    } else {
                      if (0 > ve.field_d.field_c) {
                        break L4;
                      } else {
                        L5: {
                          var3 = gi.field_n[ve.field_d.field_c];
                          if (var3 == 2) {
                            break L5;
                          } else {
                            if (var3 != 5) {
                              break L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                        int discarded$4 = 47;
                        hd.a();
                        break L3;
                      }
                    }
                  }
                  if (var2 == 0) {
                    break L3;
                  } else {
                    if (da.field_j == 2) {
                      break L3;
                    } else {
                      int discarded$5 = 47;
                      hd.a();
                      break L3;
                    }
                  }
                }
                L6: {
                  if (var3 != 0) {
                    break L6;
                  } else {
                    if (2 != da.field_j) {
                      break L6;
                    } else {
                      var4 = -qe.field_cb + gk.a(52);
                      var6 = (int)((-var4 + 10999L) / 1000L);
                      if (var6 > 0) {
                        break L6;
                      } else {
                        var3 = 2;
                        bl.a(true, 5, -30962);
                        break L6;
                      }
                    }
                  }
                }
                stackOut_33_0 = var3;
                stackIn_34_0 = stackOut_33_0;
                break L0;
              } else {
                L7: {
                  ve.field_d.d((byte) 81);
                  if (!ve.field_d.a(84)) {
                    break L7;
                  } else {
                    var1_int = 1;
                    break L7;
                  }
                }
                if (de.field_f == 13) {
                  var2 = 1;
                  continue L1;
                } else {
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var1, "lr.B(" + -116 + ')');
        }
        return stackIn_34_0;
    }

    lr(of param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            ((lr) this).field_R = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("lr.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "Searching for an opponent";
        field_K = "+<%0>";
        field_L = "Checking";
        field_I = "game complete";
        field_S = null;
        field_M = "Invalid password.";
        field_T = "NEXT LEVEL IN: <%0>";
        field_N = "Close";
    }
}
