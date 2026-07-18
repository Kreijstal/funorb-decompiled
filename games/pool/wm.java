/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class wm extends vh {
    static ai field_Xb;
    private vh[] field_Vb;
    static String field_cc;
    private StringBuilder field_ec;
    private vh field_Zb;
    long field_Lb;
    static na field_Pb;
    private vh field_Rb;
    private wg field_dc;
    private vh field_Mb;
    private vh field_Ob;
    private vh field_Sb;
    private vh field_Tb;
    private int field_bc;
    static String field_Qb;
    static char[] field_Wb;
    static String field_Yb;
    static int[][] field_ac;
    static int[] field_Ub;
    static int field_Nb;

    private final int a(vh param0, int param1, int param2, vh param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              param2 += 8;
              if (param1 <= -125) {
                break L1;
              } else {
                wm.f((byte) -116);
                break L1;
              }
            }
            var6_int = param0.field_I.b(param0.field_nb, -(param0.field_tb * 2) + param4, param0.field_M);
            param0.b(param2, 2147483647, 0, param4, var6_int);
            param3.a(-93, param0);
            param2 = param2 + var6_int;
            stackOut_2_0 = param2;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var6;
            stackOut_4_1 = new StringBuilder().append("wm.G(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param4 + ')');
        }
        return stackIn_3_0;
    }

    final boolean g(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -10459) {
            break L0;
          } else {
            int discarded$2 = ((wm) this).a(true, 67);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((wm) this).field_dc) {
              break L2;
            } else {
              if (!((wm) this).field_dc.field_Ib) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final int a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        wg stackIn_5_0 = null;
        wg stackIn_6_0 = null;
        wg stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        vh stackIn_13_0 = null;
        vh stackIn_14_0 = null;
        vh stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        wg stackOut_4_0 = null;
        wg stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        wg stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        vh stackOut_12_0 = null;
        vh stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        vh stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        L0: {
          var4 = Pool.field_O;
          ((wm) this).a(param0, false);
          if (((wm) this).field_Rb == null) {
            break L0;
          } else {
            L1: {
              ((wm) this).field_Rb.field_nb = ((wm) this).field_ec.toString();
              ((wm) this).field_Rb.field_qb = (((wm) this).field_gb + -((wm) this).field_Rb.field_I.b(((wm) this).field_Rb.field_nb)) / 2;
              if (((wm) this).field_dc == null) {
                break L1;
              } else {
                if (((wm) this).field_dc.field_R != 0) {
                  L2: {
                    stackOut_4_0 = ((wm) this).field_dc;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (((wm) this).field_dc.field_Ib) {
                      stackOut_6_0 = (wg) (Object) stackIn_6_0;
                      stackOut_6_1 = 0;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      break L2;
                    } else {
                      stackOut_5_0 = (wg) (Object) stackIn_5_0;
                      stackOut_5_1 = 1;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      break L2;
                    }
                  }
                  stackIn_7_0.field_Ib = stackIn_7_1 != 0;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            ((wm) this).field_Rb.field_gb = -((wm) this).field_Rb.field_qb + ((wm) this).field_gb;
            var3 = 0;
            L3: while (true) {
              if (var3 >= cd.field_a) {
                break L0;
              } else {
                if (((wm) this).field_Vb[var3] != null) {
                  L4: {
                    stackOut_12_0 = ((wm) this).field_Vb[var3];
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_13_0 = stackOut_12_0;
                    if (((wm) this).field_ec.length() <= 0) {
                      stackOut_14_0 = (vh) (Object) stackIn_14_0;
                      stackOut_14_1 = 0;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      break L4;
                    } else {
                      stackOut_13_0 = (vh) (Object) stackIn_13_0;
                      stackOut_13_1 = 1;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      break L4;
                    }
                  }
                  stackIn_15_0.field_pb = stackIn_15_1 != 0;
                  if (((wm) this).field_Vb[var3].field_pb) {
                    if (((wm) this).field_Vb[var3].field_R != 0) {
                      return var3;
                    } else {
                      var3++;
                      continue L3;
                    }
                  } else {
                    var3++;
                    continue L3;
                  }
                } else {
                  var3++;
                  continue L3;
                }
              }
            }
          }
        }
        if (((wm) this).field_Zb.field_R == 0) {
          L5: {
            if (!param0) {
              break L5;
            } else {
              if (ne.field_s == 0) {
                break L5;
              } else {
                if (((wm) this).field_R != 0) {
                  break L5;
                } else {
                  return -1;
                }
              }
            }
          }
          if (param1 == -27403) {
            return ((wm) this).field_bc;
          } else {
            return 85;
          }
        } else {
          return -1;
        }
    }

    final static oa a(Throwable param0, String param1) {
        oa var2 = null;
        if (param0 instanceof oa) {
            var2 = (oa) (Object) param0;
            var2.field_i = var2.field_i + ' ' + param1;
        } else {
            var2 = new oa(param0, param1);
        }
        return var2;
    }

    wm(int param0, int param1, int param2, int param3, int param4, vh param5, vh param6, vh param7, vh param8, wg param9, vh param10, String param11, long param12) {
        super(0L, param5);
        int var15_int = 0;
        vh[] var15 = null;
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
        vh[] var27 = null;
        Object stackIn_4_0 = null;
        wg stackIn_4_1 = null;
        wg stackIn_4_2 = null;
        long stackIn_4_3 = 0L;
        wg stackIn_4_4 = null;
        Object stackIn_5_0 = null;
        wg stackIn_5_1 = null;
        wg stackIn_5_2 = null;
        long stackIn_5_3 = 0L;
        wg stackIn_5_4 = null;
        Object stackIn_6_0 = null;
        wg stackIn_6_1 = null;
        wg stackIn_6_2 = null;
        long stackIn_6_3 = 0L;
        wg stackIn_6_4 = null;
        Object stackIn_7_0 = null;
        wg stackIn_7_1 = null;
        wg stackIn_7_2 = null;
        long stackIn_7_3 = 0L;
        wg stackIn_7_4 = null;
        String stackIn_7_5 = null;
        vh stackIn_12_0 = null;
        vh stackIn_13_0 = null;
        vh stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackOut_3_0 = null;
        wg stackOut_3_1 = null;
        wg stackOut_3_2 = null;
        long stackOut_3_3 = 0L;
        wg stackOut_3_4 = null;
        Object stackOut_4_0 = null;
        wg stackOut_4_1 = null;
        wg stackOut_4_2 = null;
        long stackOut_4_3 = 0L;
        wg stackOut_4_4 = null;
        Object stackOut_6_0 = null;
        wg stackOut_6_1 = null;
        wg stackOut_6_2 = null;
        long stackOut_6_3 = 0L;
        wg stackOut_6_4 = null;
        String stackOut_6_5 = null;
        Object stackOut_5_0 = null;
        wg stackOut_5_1 = null;
        wg stackOut_5_2 = null;
        long stackOut_5_3 = 0L;
        wg stackOut_5_4 = null;
        String stackOut_5_5 = null;
        vh stackOut_11_0 = null;
        vh stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        vh stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        L0: {
          ((wm) this).field_bc = -2;
          ((wm) this).field_Lb = param12;
          ((wm) this).field_Ob = new vh(0L, param6, oh.field_a.toUpperCase());
          ((wm) this).field_Ob.field_Fb = 1;
          ((wm) this).a(66, ((wm) this).field_Ob);
          ((wm) this).field_Zb = new vh(0L, param7);
          ((wm) this).field_Ob.a(-118, ((wm) this).field_Zb);
          ((wm) this).field_Tb = new vh(0L, (vh) null);
          ((wm) this).a(-107, ((wm) this).field_Tb);
          if (param11 == null) {
            ((wm) this).field_Mb = new vh(0L, param8, th.field_d);
            ((wm) this).field_Mb.field_Fb = 1;
            ((wm) this).field_Mb.field_N = 11184810;
            ((wm) this).field_Tb.a(123, ((wm) this).field_Mb);
            var15_int = 226;
            var16 = 10;
            var17 = ((wm) this).field_Mb.field_I.b(((wm) this).field_Mb.field_nb, var15_int);
            ((wm) this).field_Mb.b(var16, 2147483647, 13, var15_int, ad.field_x * var17);
            var16 = var16 + ad.field_x * var17;
            ((wm) this).field_Tb.b(24, 2147483647, 0, 13 + var15_int + 13, var16 + 10);
            ((wm) this).field_Tb.field_F = rp.a(32450, 3, 2105376, ((wm) this).field_Tb.field_Db, 11579568, 8421504);
            var18 = var15_int + 26;
            var19 = 34 - -var16;
            var20 = de.a(var18, param2, param0, 0);
            var21 = sh.a(var19, param1, -1, param3);
            ((wm) this).b(var21, 2147483647, var20, var18, var19);
            break L0;
          } else {
            L1: {
              L2: {
                ((wm) this).field_Mb = new vh(0L, param8, dq.field_b);
                ((wm) this).field_Mb.field_N = 11184810;
                ((wm) this).field_Mb.field_Fb = 1;
                ((wm) this).field_Tb.a(11, ((wm) this).field_Mb);
                ((wm) this).field_Sb = new vh(0L, param8, pq.field_r);
                ((wm) this).field_Sb.field_N = 11184810;
                ((wm) this).field_Sb.field_Fb = 1;
                ((wm) this).field_Tb.a(-101, ((wm) this).field_Sb);
                ((wm) this).field_Rb = new vh(0L, param8);
                ((wm) this).field_Rb.field_N = 16764006;
                ((wm) this).field_Tb.a(112, ((wm) this).field_Rb);
                ((wm) this).field_Rb.field_kb = "|";
                if (ta.field_f >= 5) {
                  break L2;
                } else {
                  if (hq.field_i < 2) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                L4: {
                  stackOut_3_0 = this;
                  stackOut_3_1 = null;
                  stackOut_3_2 = null;
                  stackOut_3_3 = 0L;
                  stackOut_3_4 = (wg) param9;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  stackIn_5_2 = stackOut_3_2;
                  stackIn_5_3 = stackOut_3_3;
                  stackIn_5_4 = stackOut_3_4;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  stackIn_4_2 = stackOut_3_2;
                  stackIn_4_3 = stackOut_3_3;
                  stackIn_4_4 = stackOut_3_4;
                  if (ta.field_f >= 7) {
                    break L4;
                  } else {
                    stackOut_4_0 = this;
                    stackOut_4_1 = null;
                    stackOut_4_2 = null;
                    stackOut_4_3 = stackIn_4_3;
                    stackOut_4_4 = (wg) (Object) stackIn_4_4;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    stackIn_6_2 = stackOut_4_2;
                    stackIn_6_3 = stackOut_4_3;
                    stackIn_6_4 = stackOut_4_4;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    stackIn_5_2 = stackOut_4_2;
                    stackIn_5_3 = stackOut_4_3;
                    stackIn_5_4 = stackOut_4_4;
                    if (hq.field_i < 2) {
                      stackOut_6_0 = this;
                      stackOut_6_1 = null;
                      stackOut_6_2 = null;
                      stackOut_6_3 = stackIn_6_3;
                      stackOut_6_4 = (wg) (Object) stackIn_6_4;
                      stackOut_6_5 = tq.field_w;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      stackIn_7_2 = stackOut_6_2;
                      stackIn_7_3 = stackOut_6_3;
                      stackIn_7_4 = stackOut_6_4;
                      stackIn_7_5 = stackOut_6_5;
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                stackOut_5_0 = this;
                stackOut_5_1 = null;
                stackOut_5_2 = null;
                stackOut_5_3 = stackIn_5_3;
                stackOut_5_4 = (wg) (Object) stackIn_5_4;
                stackOut_5_5 = er.field_T;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_7_2 = stackOut_5_2;
                stackIn_7_3 = stackOut_5_3;
                stackIn_7_4 = stackOut_5_4;
                stackIn_7_5 = stackOut_5_5;
                break L3;
              }
              ((wm) this).field_dc = new wg(stackIn_7_3, stackIn_7_4, stackIn_7_5);
              ((wm) this).field_Tb.a(-121, (vh) (Object) ((wm) this).field_dc);
              break L1;
            }
            var27 = new vh[3];
            var15 = var27;
            var27[0] = new vh(0L, (vh) null);
            ((wm) this).field_Tb.a(-101, var27[0]);
            var27[1] = new vh(0L, (vh) null);
            ((wm) this).field_Tb.a(-118, var27[1]);
            var27[2] = new vh(0L, (vh) null);
            ((wm) this).field_Tb.a(-117, var27[2]);
            ((wm) this).field_Vb = new vh[cd.field_a];
            var16 = 0;
            L5: while (true) {
              if (~var16 <= ~cd.field_a) {
                L6: {
                  ((wm) this).field_ec = new StringBuilder(12);
                  if (param11 == null) {
                    break L6;
                  } else {
                    StringBuilder discarded$1 = ((wm) this).field_ec.append(param11);
                    break L6;
                  }
                }
                L7: {
                  var16 = 0;
                  var17 = param6.field_I.b(qe.field_B);
                  if (~var16 <= ~var17) {
                    break L7;
                  } else {
                    var16 = var17;
                    break L7;
                  }
                }
                L8: {
                  var17 = param6.field_I.b(qa.field_m);
                  if (~var17 >= ~var16) {
                    break L8;
                  } else {
                    var16 = var17;
                    break L8;
                  }
                }
                L9: {
                  var17 = param6.field_I.b(hd.field_K);
                  if (~var17 >= ~var16) {
                    break L9;
                  } else {
                    var16 = var17;
                    break L9;
                  }
                }
                var17 = 0;
                L10: while (true) {
                  if (~cd.field_a >= ~var17) {
                    L11: {
                      if (140 >= var16) {
                        break L11;
                      } else {
                        var16 = 140;
                        break L11;
                      }
                    }
                    L12: {
                      var17 = 0;
                      var18 = 0;
                      var18 = 0;
                      var18 = this.a(qe.field_B, var18, var27[0], (byte) -124, param6, var16);
                      var18 = this.a(((wm) this).field_Vb[6], -126, var18, var27[0], var16);
                      var18 = this.a(((wm) this).field_Vb[9], -128, var18, var27[0], var16);
                      var18 = this.a(((wm) this).field_Vb[5], -128, var18, var27[0], var16);
                      var18 = this.a(((wm) this).field_Vb[7], -128, var18, var27[0], var16);
                      var18 = this.a(((wm) this).field_Vb[15], -127, var18, var27[0], var16);
                      var18 = this.a(((wm) this).field_Vb[4], -127, var18, var27[0], var16);
                      if (~var18 >= ~var17) {
                        break L12;
                      } else {
                        var17 = var18;
                        break L12;
                      }
                    }
                    L13: {
                      var18 = 0;
                      var18 = this.a(qa.field_m, var18, var27[1], (byte) -114, param6, var16);
                      var18 = this.a(((wm) this).field_Vb[16], -126, var18, var27[1], var16);
                      var18 = this.a(((wm) this).field_Vb[17], -126, var18, var27[1], var16);
                      var18 = this.a(((wm) this).field_Vb[18], -128, var18, var27[1], var16);
                      var18 = this.a(((wm) this).field_Vb[19], -126, var18, var27[1], var16);
                      var18 = this.a(((wm) this).field_Vb[20], -128, var18, var27[1], var16);
                      if (~var17 <= ~var18) {
                        break L13;
                      } else {
                        var17 = var18;
                        break L13;
                      }
                    }
                    L14: {
                      var18 = 0;
                      var18 = this.a(hd.field_K, var18, var27[2], (byte) -124, param6, var16);
                      var18 = this.a(((wm) this).field_Vb[13], -128, var18, var27[2], var16);
                      var18 = this.a(((wm) this).field_Vb[21], -127, var18, var27[2], var16);
                      var18 = this.a(((wm) this).field_Vb[11], -127, var18, var27[2], var16);
                      if (~var18 >= ~var17) {
                        break L14;
                      } else {
                        var17 = var18;
                        break L14;
                      }
                    }
                    L15: {
                      var19 = 3 * var16 + 26;
                      var20 = ((wm) this).field_Ob.b(true);
                      if (~var19 <= ~var20) {
                        break L15;
                      } else {
                        var19 = var20;
                        break L15;
                      }
                    }
                    L16: {
                      if (((wm) this).field_dc == null) {
                        break L16;
                      } else {
                        var20 = ((wm) this).field_dc.b(4, 2154);
                        if (~var19 <= ~var20) {
                          break L16;
                        } else {
                          var19 = var20;
                          break L16;
                        }
                      }
                    }
                    L17: {
                      ((wm) this).field_Ob.b(0, 2147483647, 0, 13 + var19 + 13, 24);
                      ((wm) this).field_Zb.b(5, 2147483647, -20 + ((wm) this).field_Ob.field_gb, 15, 15);
                      var21 = 10;
                      ((wm) this).field_Mb.b(var21, 2147483647, 13, var19, ad.field_x * 2);
                      var21 = var21 + ad.field_x * 2;
                      ((wm) this).field_Sb.b(var21, 2147483647, 13, var19, ad.field_x * 2);
                      var21 = var21 + (ad.field_x * 2 + 10);
                      ((wm) this).field_Rb.b(var21, 2147483647, 0, 0, ad.field_x);
                      var21 = var21 + (10 + ad.field_x);
                      if (null == ((wm) this).field_dc) {
                        break L17;
                      } else {
                        var20 = ((wm) this).field_dc.b(4, 2154);
                        ((wm) this).field_dc.a(var21, 13 - -((-var20 + var19) / 2), ad.field_x, false, var20, 4);
                        var21 = var21 + (ad.field_x - -10);
                        break L17;
                      }
                    }
                    var27[0].b(var21, 2147483647, 13, var16, var17);
                    var27[1].b(var21, 2147483647, 13 + (var16 + 13), var16, var17);
                    var27[2].b(var21, 2147483647, 13 - (-(2 * var16) - 26), var16, var17);
                    var22 = var21;
                    ((wm) this).field_Tb.b(24, 2147483647, 0, 13 + (13 + var19), 10 + var22 + var17);
                    ((wm) this).field_Tb.field_F = rp.a(32450, 3, 2105376, ((wm) this).field_Tb.field_Db, 11579568, 8421504);
                    var23 = 13 + var19 + 13;
                    var24 = 10 + var17 + (var22 + 24);
                    var25 = de.a(var23, param2, param0, 0);
                    var26 = sh.a(var24, param1, -1, param3);
                    ((wm) this).b(var26, 2147483647, var25, var23, var24);
                    break L0;
                  } else {
                    L18: {
                      if (((wm) this).field_Vb[var17] == null) {
                        break L18;
                      } else {
                        var18 = ((wm) this).field_Vb[var17].b(true);
                        if (~var18 >= ~var16) {
                          break L18;
                        } else {
                          var16 = var18;
                          break L18;
                        }
                      }
                    }
                    var17++;
                    continue L10;
                  }
                }
              } else {
                L19: {
                  if (cm.field_L[var16] == null) {
                    break L19;
                  } else {
                    L20: {
                      ((wm) this).field_Vb[var16] = new vh(0L, param10, cm.field_L[var16]);
                      ((wm) this).field_Vb[var16].field_Fb = 0;
                      stackOut_11_0 = ((wm) this).field_Vb[var16];
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_12_0 = stackOut_11_0;
                      if (param11 == null) {
                        stackOut_13_0 = (vh) (Object) stackIn_13_0;
                        stackOut_13_1 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        break L20;
                      } else {
                        stackOut_12_0 = (vh) (Object) stackIn_12_0;
                        stackOut_12_1 = 1;
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_14_1 = stackOut_12_1;
                        break L20;
                      }
                    }
                    stackIn_14_0.field_pb = stackIn_14_1 != 0;
                    ((wm) this).field_Tb.a(-128, ((wm) this).field_Vb[var16]);
                    break L19;
                  }
                }
                var16++;
                continue L5;
              }
            }
          }
        }
    }

    final boolean f(int param0) {
        if (!(((wm) this).field_bc == -2)) {
            return false;
        }
        if (param0 == qi.field_a) {
            ((wm) this).field_bc = -1;
            return true;
        }
        return true;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        bc.field_b.field_v = 0;
        bc.field_b.a(12, false);
        bc.field_b.a(true, lc.field_P.nextInt());
        bc.field_b.a(true, lc.field_P.nextInt());
        bc.field_b.a(param3, false);
        bc.field_b.a(param2, false);
        bc.field_b.a((byte) -81, param1);
        bc.field_b.a(rb.field_l, 124, ei.field_q);
        ej.field_j.b(false, 18);
        int fieldTemp$0 = ej.field_j.field_v + 1;
        ej.field_j.field_v = ej.field_j.field_v + 1;
        int var4 = fieldTemp$0;
        ej.field_j.a(bc.field_b.field_t, (byte) 0, 0, bc.field_b.field_v);
        ej.field_j.b(-var4 + ej.field_j.field_v, true);
    }

    public static void f(byte param0) {
        field_cc = null;
        field_Qb = null;
        field_Wb = null;
        field_Ub = null;
        int var1 = 74 % ((param0 - 12) / 52);
        field_Pb = null;
        field_Yb = null;
        field_Xb = null;
        field_ac = null;
    }

    final String h(int param0) {
        if (param0 != 1) {
            ((wm) this).field_bc = -13;
        }
        return ((wm) this).field_ec.toString();
    }

    private final int a(String param0, int param1, vh param2, byte param3, vh param4, int param5) {
        vh var7 = null;
        RuntimeException var7_ref = null;
        Object var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var7 = new vh(0L, param4, 0, param1, param5, 24, param0);
              if (param3 <= -98) {
                break L1;
              } else {
                var8 = null;
                int discarded$2 = this.a((String) null, -118, (vh) null, (byte) -47, (vh) null, -97);
                break L1;
              }
            }
            param2.a(-111, var7);
            param1 += 32;
            stackOut_2_0 = param1;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var7_ref;
            stackOut_4_1 = new StringBuilder().append("wm.D(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param3).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param4 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param5 + ')');
        }
        return stackIn_3_0;
    }

    final static int a(boolean param0, int param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (!param0) {
              stackOut_3_0 = qp.field_ec.b(param2);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = qa.field_t.b(param2);
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("wm.A(").append(param0).append(',').append(18).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Xb = null;
        field_cc = "(Including <%0>)";
        field_Qb = "Email: ";
        field_Pb = new na();
        field_Wb = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        field_ac = new int[64][3];
        field_Yb = "Funorb Pool";
    }
}
