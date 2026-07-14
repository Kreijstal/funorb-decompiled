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
        this.a((byte) -106, param1);
        if (param0 > -12) {
            Object var4 = null;
            qm discarded$0 = lp.a(-82, 11, (java.awt.Component) null, 70);
        }
        param1.d(((lp) this).field_r, 0);
        param1.d(((lp) this).field_s, 0);
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
            qm var5 = null;
            uka var5_ref = null;
            Object var6 = null;
            qm stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            qm stackOut_2_0 = null;
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
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return (qm) (Object) stackIn_3_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    public static void d(byte param0) {
        if (param0 < 15) {
            return;
        }
        field_t = null;
        field_q = null;
    }

    lp(lu param0) {
        super(param0);
        ((lp) this).field_k = param0.e((byte) 92);
        ((lp) this).field_o = new eaa();
        int var2 = param0.b(16711935);
        while (true) {
            var2--;
            if (0 > var2) {
                break;
            }
            ((lp) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
        }
        ((lp) this).field_r = param0.b(16711935);
        ((lp) this).field_s = param0.b(16711935);
    }

    final at a(int param0, gj param1) {
        if (param0 != 5) {
            field_t = null;
        }
        return (at) (Object) new sma(param1, (lp) this);
    }

    final void a(op param0, int param1) {
        aga discarded$0 = ((lp) this).field_l.a(74, param0);
        param0.a(878, ((lp) this).field_s, ((lp) this).field_r, ((lp) this).e((byte) -108), 30);
        int var3 = -19 / ((param1 - 12) / 35);
    }

    final static kv a(byte param0, kv param1) {
        int var2 = 0;
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
        var15 = BachelorFridge.field_y;
        var2 = param1.field_p;
        var3 = param1.field_q;
        var4 = param1.field_v;
        var5 = var2 + -1;
        L0: while (true) {
          L1: {
            if (var5 < 0) {
              break L1;
            } else {
              var6 = var5 * var3;
              var7 = 0;
              L2: while (true) {
                if (var3 <= var7) {
                  var5--;
                  continue L0;
                } else {
                  if ((-16777216 & var4[var7 + var6]) != 0) {
                    break L1;
                  } else {
                    var7++;
                    continue L2;
                  }
                }
              }
            }
          }
          var6 = 0;
          L3: while (true) {
            L4: {
              if (var5 <= var6) {
                break L4;
              } else {
                var7 = var3 * var6;
                var8 = 0;
                L5: while (true) {
                  if (var8 >= var3) {
                    var6++;
                    continue L3;
                  } else {
                    if (0 == (var4[var8 + var7] & -16777216)) {
                      var8++;
                      continue L5;
                    } else {
                      break L4;
                    }
                  }
                }
              }
            }
            var7 = -1 + var3;
            L6: while (true) {
              L7: {
                if ((var7 ^ -1) > -1) {
                  break L7;
                } else {
                  var8 = var6;
                  L8: while (true) {
                    if (var5 < var8) {
                      var7--;
                      continue L6;
                    } else {
                      if ((-16777216 & var4[var7 + var3 * var8]) == 0) {
                        var8++;
                        continue L8;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
              }
              var8 = 0;
              L9: while (true) {
                L10: {
                  if (var7 <= var8) {
                    break L10;
                  } else {
                    var9 = var6;
                    L11: while (true) {
                      if (var5 < var9) {
                        var8++;
                        continue L9;
                      } else {
                        if (-1 != (var4[var9 * var3 - -var8] & -16777216)) {
                          break L10;
                        } else {
                          var9++;
                          continue L11;
                        }
                      }
                    }
                  }
                }
                L12: {
                  if (0 != var8) {
                    break L12;
                  } else {
                    if (var3 - 1 != var7) {
                      break L12;
                    } else {
                      if (-1 != var6) {
                        break L12;
                      } else {
                        if (var2 + -1 != var5) {
                          break L12;
                        } else {
                          return param1;
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
                L13: while (true) {
                  if (var13 >= var10) {
                    param1.field_q = var9;
                    param1.field_p = var10;
                    param1.field_v = var11;
                    param1.field_u = param1.field_u + var6;
                    param1.field_t = param1.field_t + var8;
                    return param1;
                  } else {
                    var14 = 0;
                    L14: while (true) {
                      if (var14 >= var9) {
                        var13++;
                        continue L13;
                      } else {
                        var11[var14 + var13 * var9] = var4[var14 + (var8 + (var13 + var6) * var3)];
                        var14++;
                        continue L14;
                      }
                    }
                  }
                }
              }
            }
          }
        }
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
