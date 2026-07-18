/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig extends w {
    private int field_fc;
    private int field_Vb;
    static ud field_ac;
    private int field_bc;
    private int field_ec;
    private int[] field_Nb;
    private qd[] field_gc;
    private int field_Ob;
    private int field_Qb;
    private char[] field_Wb;
    static String field_Sb;
    static String field_Xb;
    private int field_Zb;
    private ig[] field_Pb;
    static int field_Yb;
    private int field_Rb;
    static int field_dc;
    static nh[] field_cc;
    private ig field_Ub;
    static String field_Tb;

    private final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        L0: {
          var8 = client.field_A ? 1 : 0;
          var5 = 2 % ((param2 - 61) / 40);
          if (param1 != ((ig) this).field_Rb) {
            if (((ig) this).field_Pb[param1] != null) {
              ((ig) this).e(0);
              this.b((byte) 67, 0);
              ((ig) this).field_Rb = param1;
              ((ig) this).field_Ub = ((ig) this).field_Pb[((ig) this).field_Rb];
              vm.a(107, ((ig) this).field_Ub);
              ((ig) this).field_Ub.b((byte) 67, 12);
              break L0;
            } else {
              if (((ig) this).field_Nb[param1] != -1) {
                L1: {
                  var6 = ((ig) this).field_Nb[param1] | 32768;
                  var7 = pk.field_r;
                  if (var7 != 0) {
                    break L1;
                  } else {
                    if (null != cd.field_m) {
                      var7 = 1;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (rf.a(0, var7) == 2) {
                    eg.a(var7, param0, 1, (byte) 123);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var9 = null;
                ce.a(param3, (byte) -85, pk.field_r, ed.field_c, var6, (String) null);
                rb.a(fm.field_d, ed.field_c, -94, pk.field_r, var6);
                pf.a(false);
                h.a((byte) 11);
                break L0;
              } else {
                cc.a(8);
                pf.a(false);
                break L0;
              }
            }
          } else {
            ((ig) this).e(0);
            this.b((byte) 67, 0);
            break L0;
          }
        }
    }

    final boolean b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var7 = client.field_A ? 1 : 0;
          if (wh.field_c != 85) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var4 = stackIn_3_0;
        if (null != ((ig) this).field_Ub) {
          L1: {
            if (var4 == 0) {
              break L1;
            } else {
              if (((ig) this).field_Ub.field_Rb != -1) {
                break L1;
              } else {
                ((ig) this).e(param1 + -15028);
                this.b((byte) 67, 0);
                return true;
              }
            }
          }
          return ((ig) this).field_Ub.b(param0, param1, param2);
        } else {
          L2: {
            if (((ig) this).field_Ub != null) {
              break L2;
            } else {
              if (this != mg.field_bc) {
                break L2;
              } else {
                if (var4 == 0) {
                  break L2;
                } else {
                  pf.a(false);
                  return true;
                }
              }
            }
          }
          if (param1 == 15028) {
            L3: {
              var5 = el.field_G;
              if (var5 <= 0) {
                break L3;
              } else {
                L4: {
                  if (aa.field_b == var5) {
                    var5 = 63;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var6 = 0;
                L5: while (true) {
                  if (((ig) this).field_Wb.length <= var6) {
                    break L3;
                  } else {
                    if (((ig) this).field_Wb[var6] == var5) {
                      this.a(param0, var6, 107, param2);
                      return true;
                    } else {
                      var6++;
                      continue L5;
                    }
                  }
                }
              }
            }
            return false;
          } else {
            return true;
          }
        }
    }

    final int g(int param0) {
        if (param0 > -87) {
            field_cc = null;
        }
        return ((ig) this).field_bc - -(null != ((ig) this).field_Ub ? ((ig) this).field_Ub.g(-119) : 0);
    }

    private final void b(byte param0, int param1) {
        int var5 = 0;
        int var4 = 0;
        int var3 = 0;
        int var6 = client.field_A ? 1 : 0;
        ((ig) this).field_ec = param1;
        for (var5 = 0; ((ig) this).field_Ob > var5; var5++) {
            var4 = ((ig) this).field_ec * ((ig) this).field_ec;
            var3 = var5 * ((ig) this).field_Vb;
            ((ig) this).field_gc[var5].field_Ib = (var3 * (-var4 + 144) + (((ig) this).field_Zb - ((ig) this).field_pb) * var4) / 144;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4_int = 0;
        ig var4 = null;
        qd var5 = null;
        int var6 = 0;
        ig var7 = null;
        qd stackIn_7_0 = null;
        qd stackIn_8_0 = null;
        qd stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        qd stackOut_6_0 = null;
        qd stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        qd stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        L0: {
          var6 = client.field_A ? 1 : 0;
          if (param2 <= -97) {
            break L0;
          } else {
            field_Tb = null;
            break L0;
          }
        }
        var4_int = 0;
        L1: while (true) {
          if (var4_int >= ((ig) this).field_gc.length) {
            L2: {
              if (((ig) this).field_Rb == -1) {
                break L2;
              } else {
                var7 = ((ig) this).field_Pb[((ig) this).field_Rb];
                var4 = var7;
                if (var4 == null) {
                  break L2;
                } else {
                  var7.a(param0, param1, -99);
                  break L2;
                }
              }
            }
            L3: {
              if (((ig) this).field_ec <= 0) {
                break L3;
              } else {
                this.b((byte) 67, ((ig) this).field_ec - 1);
                break L3;
              }
            }
            return;
          } else {
            var5 = ((ig) this).field_gc[var4_int];
            if (var5.field_ob == 1) {
              L4: {
                this.a(param1, var4_int, -90, param0);
                stackOut_6_0 = (qd) var5;
                stackIn_8_0 = stackOut_6_0;
                stackIn_7_0 = stackOut_6_0;
                if (var4_int != ((ig) this).field_Rb) {
                  stackOut_8_0 = (qd) (Object) stackIn_8_0;
                  stackOut_8_1 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  break L4;
                } else {
                  stackOut_7_0 = (qd) (Object) stackIn_7_0;
                  stackOut_7_1 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  break L4;
                }
              }
              stackIn_9_0.field_ab = stackIn_9_1 != 0;
              var4_int++;
              continue L1;
            } else {
              var4_int++;
              continue L1;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = client.field_A ? 1 : 0;
          ((ig) this).field_bc = ((ig) this).field_fc + param0 * 2;
          ((ig) this).a(((ig) this).field_bc, 0, -((ig) this).field_Qb + param2, ((ig) this).field_Qb, param1);
          if (param4 == -18) {
            break L0;
          } else {
            ((ig) this).field_Qb = 30;
            break L0;
          }
        }
        L1: {
          if (param5 != ((ig) this).field_Zb) {
            ((ig) this).field_Zb = param5;
            this.b((byte) 67, ((ig) this).field_ec);
            break L1;
          } else {
            break L1;
          }
        }
        var7 = 0;
        L2: while (true) {
          if (((ig) this).field_Ob <= var7) {
            L3: {
              if (((ig) this).field_Rb == -1) {
                break L3;
              } else {
                if (null != ((ig) this).field_Pb[((ig) this).field_Rb]) {
                  var7 = ((ig) this).field_Pb[((ig) this).field_Rb].field_Ob;
                  var8 = (var7 + ((ig) this).field_Rb) * ((ig) this).field_Vb + ((ig) this).field_Ib;
                  L4: while (true) {
                    if (param2 >= var8) {
                      ((ig) this).field_Pb[((ig) this).field_Rb].a(param0, ((ig) this).field_bc + param1, var8, param3, (byte) -18, ((ig) this).field_gc[((ig) this).field_Rb].field_pb);
                      break L3;
                    } else {
                      var8 = var8 - ((ig) this).field_Vb;
                      continue L4;
                    }
                  }
                } else {
                  break L3;
                }
              }
            }
            return;
          } else {
            ((ig) this).field_gc[var7].a(((ig) this).field_Vb, param0, 0, ((ig) this).field_gc[var7].field_Ib, ((ig) this).field_bc, param3, 500);
            var7++;
            continue L2;
          }
        }
    }

    final boolean f(int param0) {
        int var4 = 0;
        qd var5 = null;
        int var6 = client.field_A ? 1 : 0;
        if (param0 != -1) {
            return false;
        }
        int var2 = 0;
        qd[] var3 = ((ig) this).field_gc;
        for (var4 = 0; var3.length > var4; var4++) {
            var5 = var3[var4];
            var2 = var2 | (0 != var5.field_ob ? 1 : 0);
        }
        if (var2 == 0) {
            if (-1 != ((ig) this).field_Rb) {
                if (!(((ig) this).field_Pb[((ig) this).field_Rb] == null)) {
                    var2 = ((ig) this).field_Pb[((ig) this).field_Rb].f(-1) ? 1 : 0;
                }
            }
        }
        return var2 != 0;
    }

    final void e(int param0) {
        int var3 = 0;
        qd var4 = null;
        int var5 = client.field_A ? 1 : 0;
        qd[] var6 = ((ig) this).field_gc;
        qd[] var2 = var6;
        for (var3 = param0; var3 < var6.length; var3++) {
            var4 = var6[var3];
            var4.field_ab = false;
            var4.field_ob = 0;
        }
        if (!(null == ((ig) this).field_Ub)) {
            ((ig) this).field_Ub.e(0);
            ((ig) this).field_Ub.b((byte) 104);
        }
        ((ig) this).field_Rb = -1;
        ((ig) this).field_Ub = null;
        this.b((byte) 67, 12);
    }

    final static boolean a(int param0, int param1, int param2, byte param3) {
        if (w.field_H != null) {
            if (!(!w.field_H.c(-3))) {
                tf.i((byte) -125);
                return true;
            }
        }
        if (pd.field_f != null) {
            if (!(!pd.field_f.b(false))) {
                pd.field_f = null;
                tf.i((byte) -97);
                return true;
            }
        }
        if (!(!ve.g((byte) 119))) {
            return true;
        }
        if (!rm.a(15, 12, (byte) 10, 13)) {
            return false;
        }
        return true;
    }

    public static void g(byte param0) {
        field_Xb = null;
        field_cc = null;
        field_ac = null;
        field_Sb = null;
        field_Tb = null;
    }

    ig(long param0, w param1, w param2, w param3, ig[] param4, int[] param5, String[] param6, char[] param7) {
        super(param0, param1);
        RuntimeException var10 = null;
        String var11 = null;
        String var12 = null;
        int var13 = 0;
        Object var14 = null;
        int var15 = 0;
        mm var17 = null;
        mm var18 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
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
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        ((ig) this).field_Rb = -1;
        try {
          L0: {
            ((ig) this).field_Wb = param7;
            ((ig) this).field_Nb = param5;
            ((ig) this).field_Pb = param4;
            ((ig) this).field_Ob = ((ig) this).field_Nb.length;
            var17 = param3.field_J;
            var18 = var17;
            ((ig) this).field_Vb = var18.field_K + 2 + var18.field_R;
            ((ig) this).field_fc = 0;
            ((ig) this).field_gc = new qd[((ig) this).field_Ob];
            ((ig) this).field_Qb = ((ig) this).field_Vb * ((ig) this).field_Ob;
            var11 = "<col=999999>";
            var12 = "</col>";
            var13 = 0;
            L1: while (true) {
              if (((ig) this).field_Ob <= var13) {
                ((ig) this).field_fc = ((ig) this).field_fc + (qb.field_q.field_K - -10);
                this.b((byte) 67, 12);
                break L0;
              } else {
                L2: {
                  if (0 >= ((ig) this).field_Wb[var13]) {
                    break L2;
                  } else {
                    param6[var13] = var11 + pf.a(((ig) this).field_Wb[var13], (byte) -9).toUpperCase() + ": " + var12 + param6[var13];
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var14 = null;
                    if (((ig) this).field_Pb[var13] != null) {
                      break L4;
                    } else {
                      if (((ig) this).field_Nb[var13] != -1) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var14 = qb.field_q;
                  break L3;
                }
                L5: {
                  ((ig) this).field_gc[var13] = new qd(0L, param2, (w) null, param3, (ck) var14, param6[var13]);
                  ((ig) this).a(((ig) this).field_gc[var13], -16834);
                  var15 = var17.a(param6[var13]);
                  if (var15 <= ((ig) this).field_fc) {
                    break L5;
                  } else {
                    ((ig) this).field_fc = var15;
                    break L5;
                  }
                }
                var13++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var10 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var10;
            stackOut_13_1 = new StringBuilder().append("ig.<init>(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          L7: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          L8: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          L9: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param4 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          L10: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param5 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L10;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L10;
            }
          }
          L11: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param6 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L11;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L11;
            }
          }
          L12: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param7 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L12;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L12;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ')');
        }
    }

    final static boolean b(boolean param0) {
        return uc.field_g == cd.field_m.field_Xb;
    }

    static {
        field_Sb = "This game option has not yet been unlocked for use.";
        field_Yb = 0;
        field_Xb = "Set up new game";
        field_Tb = "Quit to website";
    }
}
