/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lp extends bca {
    static boolean field_u;
    static String field_t;
    int field_r;
    static kv field_q;
    int field_s;

    final void a(byte param0, lu param1) {
        try {
            super.a((byte) -106, param1);
            if (param0 > -12) {
                Object var4 = null;
                qm discarded$0 = lp.a(-82, 11, (java.awt.Component) null, 70);
            }
            param1.d(((lp) this).field_r, 0);
            param1.d(((lp) this).field_s, 0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "lp.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final int[][] e(byte param0) {
        int[][] var2 = null;
        int[][] var3 = null;
        int[][] var4 = null;
        int[][] var5 = null;
        int[][] var6 = null;
        int[][] var7 = null;
        var7 = new int[17][17];
        var6 = var7;
        var5 = var6;
        var4 = var5;
        var3 = var4;
        var2 = var3;
        if (param0 == -108) {
          var7[5][8] = 1;
          var7[6][7] = 1;
          var7[7][6] = 1;
          var7[6][9] = 1;
          var7[7][7] = 1;
          var7[6][8] = 1;
          var7[7][9] = 1;
          var7[8][5] = 1;
          var7[8][7] = 1;
          var7[8][6] = 1;
          var7[7][8] = 1;
          var7[7][10] = 1;
          var7[8][11] = 1;
          var7[8][8] = 1;
          var7[9][6] = 1;
          var7[9][7] = 1;
          var7[8][9] = 1;
          var7[8][10] = 1;
          var7[9][10] = 1;
          var7[10][7] = 1;
          var7[9][8] = 1;
          var7[9][9] = 1;
          var7[10][9] = 1;
          var7[10][8] = 1;
          var7[11][8] = 1;
          return var2;
        } else {
          return null;
        }
    }

    final static qm a(int param0, int param1, java.awt.Component param2, int param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            RuntimeException var4_ref2 = null;
            qm var5 = null;
            uka var5_ref = null;
            Object var6 = null;
            qm stackIn_3_0 = null;
            uka stackIn_5_0 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            qm stackOut_2_0 = null;
            uka stackOut_4_0 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              try {
                L0: {
                  var4 = Class.forName("tu");
                  if (param3 == 29548) {
                    break L0;
                  } else {
                    var6 = null;
                    qm discarded$2 = lp.a(-117, 32, (java.awt.Component) null, -59);
                    break L0;
                  }
                }
                var5 = (qm) var4.newInstance();
                var5.a(param1, param2, param0, 256);
                stackOut_2_0 = (qm) var5;
                stackIn_3_0 = stackOut_2_0;
                return stackIn_3_0;
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4_ref = decompiledCaughtException;
                var5_ref = new uka();
                ((qm) (Object) var5_ref).a(param1, param2, param0, param3 ^ 29292);
                stackOut_4_0 = (uka) var5_ref;
                stackIn_5_0 = stackOut_4_0;
                return (qm) (Object) stackIn_5_0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L1: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var4_ref2;
                stackOut_6_1 = new StringBuilder().append("lp.B(").append(param0).append(44).append(param1).append(44);
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param2 == null) {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L1;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L1;
                }
              }
              throw pe.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param3 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void d() {
        field_t = null;
        field_q = null;
    }

    lp(lu param0) {
        super(param0);
        int var2_int = 0;
        try {
            ((lp) this).field_k = param0.e((byte) 92);
            ((lp) this).field_o = new eaa();
            var2_int = param0.b(16711935);
            while (true) {
                var2_int--;
                if (0 > var2_int) {
                    break;
                }
                ((lp) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
            }
            ((lp) this).field_r = param0.b(16711935);
            ((lp) this).field_s = param0.b(16711935);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "lp.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        sma stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        sma stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 5) {
                break L1;
              } else {
                field_t = null;
                break L1;
              }
            }
            stackOut_2_0 = new sma(param1, (lp) this);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("lp.A(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return (at) (Object) stackIn_3_0;
    }

    final void a(op param0, int param1) {
        try {
            aga discarded$0 = ((lp) this).field_l.a(74, param0);
            param0.a(878, ((lp) this).field_s, ((lp) this).field_r, ((lp) this).e((byte) -108), 30);
            int var3_int = -19 / ((param1 - 12) / 35);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "lp.E(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static kv a(byte param0, kv param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        kv stackIn_36_0 = null;
        kv stackIn_44_0 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        kv stackOut_35_0 = null;
        kv stackOut_43_0 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        var15 = BachelorFridge.field_y;
        try {
          L0: {
            var2_int = param1.field_p;
            var3 = param1.field_q;
            var4 = param1.field_v;
            var5 = var2_int + -1;
            L1: while (true) {
              L2: {
                if (var5 < 0) {
                  break L2;
                } else {
                  var6 = var5 * var3;
                  var7 = 0;
                  L3: while (true) {
                    if (~var3 >= ~var7) {
                      var5--;
                      continue L1;
                    } else {
                      if ((-16777216 & var4[var7 + var6]) != 0) {
                        break L2;
                      } else {
                        var7++;
                        continue L3;
                      }
                    }
                  }
                }
              }
              var6 = 0;
              L4: while (true) {
                L5: {
                  if (var5 <= var6) {
                    break L5;
                  } else {
                    var7 = var3 * var6;
                    var8 = 0;
                    L6: while (true) {
                      if (var8 >= var3) {
                        var6++;
                        continue L4;
                      } else {
                        if (0 == (var4[var8 + var7] & -16777216)) {
                          var8++;
                          continue L6;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                }
                var7 = -1 + var3;
                L7: while (true) {
                  L8: {
                    if (var7 < 0) {
                      break L8;
                    } else {
                      var8 = var6;
                      L9: while (true) {
                        if (var5 < var8) {
                          var7--;
                          continue L7;
                        } else {
                          if ((-16777216 & var4[var7 + var3 * var8]) == 0) {
                            var8++;
                            continue L9;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                  }
                  var8 = 0;
                  L10: while (true) {
                    L11: {
                      if (var7 <= var8) {
                        break L11;
                      } else {
                        var9 = var6;
                        L12: while (true) {
                          if (var5 < var9) {
                            var8++;
                            continue L10;
                          } else {
                            if ((var4[var9 * var3 - -var8] & -16777216) != 0) {
                              break L11;
                            } else {
                              var9++;
                              continue L12;
                            }
                          }
                        }
                      }
                    }
                    L13: {
                      if (0 != var8) {
                        break L13;
                      } else {
                        if (var3 - 1 != var7) {
                          break L13;
                        } else {
                          if (var6 != 0) {
                            break L13;
                          } else {
                            if (var2_int + -1 != var5) {
                              break L13;
                            } else {
                              stackOut_35_0 = (kv) param1;
                              stackIn_36_0 = stackOut_35_0;
                              return stackIn_36_0;
                            }
                          }
                        }
                      }
                    }
                    var9 = -var8 + (var7 - -1);
                    var10 = 1 + (var5 + -var6);
                    var11 = new int[var10 * var9];
                    var12 = 117 % ((param0 - -6) / 50);
                    var13 = 0;
                    L14: while (true) {
                      if (~var13 <= ~var10) {
                        param1.field_q = var9;
                        param1.field_p = var10;
                        param1.field_v = var11;
                        param1.field_u = param1.field_u + var6;
                        param1.field_t = param1.field_t + var8;
                        stackOut_43_0 = (kv) param1;
                        stackIn_44_0 = stackOut_43_0;
                        break L0;
                      } else {
                        var14 = 0;
                        L15: while (true) {
                          if (~var14 <= ~var9) {
                            var13++;
                            continue L14;
                          } else {
                            var11[var14 + var13 * var9] = var4[var14 + (var8 + (var13 + var6) * var3)];
                            var14++;
                            continue L15;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var2 = decompiledCaughtException;
            stackOut_45_0 = (RuntimeException) var2;
            stackOut_45_1 = new StringBuilder().append("lp.C(").append(param0).append(44);
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param1 == null) {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L16;
            } else {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L16;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_48_0, stackIn_48_2 + 41);
        }
        return stackIn_44_0;
    }

    lp(int param0, nq param1) {
        super(param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = false;
        field_t = "Fullscreen";
    }
}
