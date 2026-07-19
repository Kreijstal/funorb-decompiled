/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
            param2 = param2 + (var6_int - 0);
            stackOut_2_0 = param2;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var6);
            stackOut_4_1 = new StringBuilder().append("wm.G(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param4 + ')');
        }
        return stackIn_3_0;
    }

    final boolean g(int param0) {
        int discarded$2 = 0;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -10459) {
            break L0;
          } else {
            discarded$2 = this.a(true, 67);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == this.field_dc) {
              break L2;
            } else {
              if (!this.field_dc.field_Ib) {
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
          this.a(param0, false);
          if (this.field_Rb == null) {
            break L0;
          } else {
            L1: {
              this.field_Rb.field_nb = this.field_ec.toString();
              this.field_Rb.field_qb = (this.field_gb + -this.field_Rb.field_I.b(this.field_Rb.field_nb)) / 2;
              if (this.field_dc == null) {
                break L1;
              } else {
                if (-1 != (this.field_dc.field_R ^ -1)) {
                  L2: {
                    stackOut_4_0 = this.field_dc;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (this.field_dc.field_Ib) {
                      stackOut_6_0 = (wg) ((Object) stackIn_6_0);
                      stackOut_6_1 = 0;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      break L2;
                    } else {
                      stackOut_5_0 = (wg) ((Object) stackIn_5_0);
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
            this.field_Rb.field_gb = -this.field_Rb.field_qb + this.field_gb;
            var3 = 0;
            L3: while (true) {
              if (var3 >= cd.field_a) {
                break L0;
              } else {
                if (this.field_Vb[var3] != null) {
                  L4: {
                    stackOut_12_0 = this.field_Vb[var3];
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_13_0 = stackOut_12_0;
                    if ((this.field_ec.length() ^ -1) >= -1) {
                      stackOut_14_0 = (vh) ((Object) stackIn_14_0);
                      stackOut_14_1 = 0;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      break L4;
                    } else {
                      stackOut_13_0 = (vh) ((Object) stackIn_13_0);
                      stackOut_13_1 = 1;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      break L4;
                    }
                  }
                  stackIn_15_0.field_pb = stackIn_15_1 != 0;
                  if (this.field_Vb[var3].field_pb) {
                    if (-1 != (this.field_Vb[var3].field_R ^ -1)) {
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
        if (this.field_Zb.field_R == 0) {
          L5: {
            if (!param0) {
              break L5;
            } else {
              if (ne.field_s == 0) {
                break L5;
              } else {
                if (this.field_R != 0) {
                  break L5;
                } else {
                  return -1;
                }
              }
            }
          }
          if (param1 == -27403) {
            return this.field_bc;
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
            var2 = (oa) ((Object) param0);
            var2.field_i = var2.field_i + ' ' + param1;
        } else {
            var2 = new oa(param0, param1);
        }
        return var2;
    }

    wm(int param0, int param1, int param2, int param3, int param4, vh param5, vh param6, vh param7, vh param8, wg param9, vh param10, String param11, long param12) {
        super(0L, param5);
        StringBuilder discarded$1 = null;
        RuntimeException var15 = null;
        int var15_int = 0;
        vh[] var15_array = null;
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
        Object stackIn_8_0 = null;
        wg stackIn_8_1 = null;
        wg stackIn_8_2 = null;
        long stackIn_8_3 = 0L;
        wg stackIn_8_4 = null;
        String stackIn_8_5 = null;
        vh stackIn_13_0 = null;
        vh stackIn_14_0 = null;
        vh stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        wg stackOut_4_1 = null;
        wg stackOut_4_2 = null;
        long stackOut_4_3 = 0L;
        wg stackOut_4_4 = null;
        Object stackOut_5_0 = null;
        wg stackOut_5_1 = null;
        wg stackOut_5_2 = null;
        long stackOut_5_3 = 0L;
        wg stackOut_5_4 = null;
        Object stackOut_7_0 = null;
        wg stackOut_7_1 = null;
        wg stackOut_7_2 = null;
        long stackOut_7_3 = 0L;
        wg stackOut_7_4 = null;
        String stackOut_7_5 = null;
        Object stackOut_6_0 = null;
        wg stackOut_6_1 = null;
        wg stackOut_6_2 = null;
        long stackOut_6_3 = 0L;
        wg stackOut_6_4 = null;
        String stackOut_6_5 = null;
        vh stackOut_12_0 = null;
        vh stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        vh stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        this.field_bc = -2;
        try {
          L0: {
            L1: {
              this.field_Lb = param12;
              this.field_Ob = new vh(0L, param6, oh.field_a.toUpperCase());
              this.field_Ob.field_Fb = 1;
              this.a(66, this.field_Ob);
              this.field_Zb = new vh(0L, param7);
              this.field_Ob.a(-118, this.field_Zb);
              this.field_Tb = new vh(0L, (vh) null);
              this.a(-107, this.field_Tb);
              if (param11 == null) {
                this.field_Mb = new vh(0L, param8, th.field_d);
                this.field_Mb.field_Fb = 1;
                this.field_Mb.field_N = 11184810;
                this.field_Tb.a(123, this.field_Mb);
                var15_int = 226;
                var16 = 10;
                var17 = this.field_Mb.field_I.b(this.field_Mb.field_nb, var15_int);
                this.field_Mb.b(var16, 2147483647, 13, var15_int, ad.field_x * var17);
                var16 = var16 + ad.field_x * var17;
                this.field_Tb.b(24, 2147483647, 0, 13 + var15_int + 13, var16 + 10);
                this.field_Tb.field_F = rp.a(32450, 3, 2105376, this.field_Tb.field_Db, 11579568, 8421504);
                var18 = var15_int + 13 - -13;
                var19 = 34 - -var16;
                var20 = de.a(var18, param2, param0, 0);
                var21 = sh.a(var19, param1, -1, param3);
                this.b(var21, 2147483647, var20, var18, var19);
                break L1;
              } else {
                L2: {
                  L3: {
                    this.field_Mb = new vh(0L, param8, dq.field_b);
                    this.field_Mb.field_N = 11184810;
                    this.field_Mb.field_Fb = 1;
                    this.field_Tb.a(11, this.field_Mb);
                    this.field_Sb = new vh(0L, param8, pq.field_r);
                    this.field_Sb.field_N = 11184810;
                    this.field_Sb.field_Fb = 1;
                    this.field_Tb.a(-101, this.field_Sb);
                    this.field_Rb = new vh(0L, param8);
                    this.field_Rb.field_N = 16764006;
                    this.field_Tb.a(112, this.field_Rb);
                    this.field_Rb.field_kb = "|";
                    if ((ta.field_f ^ -1) <= -6) {
                      break L3;
                    } else {
                      if ((hq.field_i ^ -1) > -3) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    L5: {
                      stackOut_4_0 = this;
                      stackOut_4_1 = null;
                      stackOut_4_2 = null;
                      stackOut_4_3 = 0L;
                      stackOut_4_4 = (wg) (param9);
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
                      if (ta.field_f >= 7) {
                        break L5;
                      } else {
                        stackOut_5_0 = this;
                        stackOut_5_1 = null;
                        stackOut_5_2 = null;
                        stackOut_5_3 = stackIn_5_3;
                        stackOut_5_4 = (wg) ((Object) stackIn_5_4);
                        stackIn_7_0 = stackOut_5_0;
                        stackIn_7_1 = stackOut_5_1;
                        stackIn_7_2 = stackOut_5_2;
                        stackIn_7_3 = stackOut_5_3;
                        stackIn_7_4 = stackOut_5_4;
                        stackIn_6_0 = stackOut_5_0;
                        stackIn_6_1 = stackOut_5_1;
                        stackIn_6_2 = stackOut_5_2;
                        stackIn_6_3 = stackOut_5_3;
                        stackIn_6_4 = stackOut_5_4;
                        if (-3 < (hq.field_i ^ -1)) {
                          stackOut_7_0 = this;
                          stackOut_7_1 = null;
                          stackOut_7_2 = null;
                          stackOut_7_3 = stackIn_7_3;
                          stackOut_7_4 = (wg) ((Object) stackIn_7_4);
                          stackOut_7_5 = tq.field_w;
                          stackIn_8_0 = stackOut_7_0;
                          stackIn_8_1 = stackOut_7_1;
                          stackIn_8_2 = stackOut_7_2;
                          stackIn_8_3 = stackOut_7_3;
                          stackIn_8_4 = stackOut_7_4;
                          stackIn_8_5 = stackOut_7_5;
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    stackOut_6_0 = this;
                    stackOut_6_1 = null;
                    stackOut_6_2 = null;
                    stackOut_6_3 = stackIn_6_3;
                    stackOut_6_4 = (wg) ((Object) stackIn_6_4);
                    stackOut_6_5 = er.field_T;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    stackIn_8_2 = stackOut_6_2;
                    stackIn_8_3 = stackOut_6_3;
                    stackIn_8_4 = stackOut_6_4;
                    stackIn_8_5 = stackOut_6_5;
                    break L4;
                  }
                  ((wm) (this)).field_dc = new wg(stackIn_8_3, stackIn_8_4, stackIn_8_5);
                  this.field_Tb.a(-121, this.field_dc);
                  break L2;
                }
                var27 = new vh[3];
                var15_array = var27;
                var27[0] = new vh(0L, (vh) null);
                this.field_Tb.a(-101, var27[0]);
                var27[1] = new vh(0L, (vh) null);
                this.field_Tb.a(-118, var27[1]);
                var27[2] = new vh(0L, (vh) null);
                this.field_Tb.a(-117, var27[2]);
                this.field_Vb = new vh[cd.field_a];
                var16 = 0;
                L6: while (true) {
                  if (var16 >= cd.field_a) {
                    L7: {
                      this.field_ec = new StringBuilder(12);
                      if (param11 == null) {
                        break L7;
                      } else {
                        discarded$1 = this.field_ec.append(param11);
                        break L7;
                      }
                    }
                    L8: {
                      var16 = 0;
                      var17 = param6.field_I.b(qe.field_B);
                      if (var16 >= var17) {
                        break L8;
                      } else {
                        var16 = var17;
                        break L8;
                      }
                    }
                    L9: {
                      var17 = param6.field_I.b(qa.field_m);
                      if (var17 <= var16) {
                        break L9;
                      } else {
                        var16 = var17;
                        break L9;
                      }
                    }
                    L10: {
                      var17 = param6.field_I.b(hd.field_K);
                      if (var17 <= var16) {
                        break L10;
                      } else {
                        var16 = var17;
                        break L10;
                      }
                    }
                    var17 = 0;
                    L11: while (true) {
                      if (cd.field_a <= var17) {
                        L12: {
                          if (140 >= var16) {
                            break L12;
                          } else {
                            var16 = 140;
                            break L12;
                          }
                        }
                        L13: {
                          var17 = 0;
                          var18 = 0;
                          var18 = 0;
                          var18 = this.a(qe.field_B, var18, var27[0], (byte) -124, param6, var16);
                          var18 = this.a(this.field_Vb[6], -126, var18, var27[0], var16);
                          var18 = this.a(this.field_Vb[9], -128, var18, var27[0], var16);
                          var18 = this.a(this.field_Vb[5], -128, var18, var27[0], var16);
                          var18 = this.a(this.field_Vb[7], -128, var18, var27[0], var16);
                          var18 = this.a(this.field_Vb[15], -127, var18, var27[0], var16);
                          var18 = this.a(this.field_Vb[4], -127, var18, var27[0], var16);
                          if (var18 <= var17) {
                            break L13;
                          } else {
                            var17 = var18;
                            break L13;
                          }
                        }
                        L14: {
                          var18 = 0;
                          var18 = this.a(qa.field_m, var18, var27[1], (byte) -114, param6, var16);
                          var18 = this.a(this.field_Vb[16], -126, var18, var27[1], var16);
                          var18 = this.a(this.field_Vb[17], -126, var18, var27[1], var16);
                          var18 = this.a(this.field_Vb[18], -128, var18, var27[1], var16);
                          var18 = this.a(this.field_Vb[19], -126, var18, var27[1], var16);
                          var18 = this.a(this.field_Vb[20], -128, var18, var27[1], var16);
                          if (var17 >= var18) {
                            break L14;
                          } else {
                            var17 = var18;
                            break L14;
                          }
                        }
                        L15: {
                          var18 = 0;
                          var18 = this.a(hd.field_K, var18, var27[2], (byte) -124, param6, var16);
                          var18 = this.a(this.field_Vb[13], -128, var18, var27[2], var16);
                          var18 = this.a(this.field_Vb[21], -127, var18, var27[2], var16);
                          var18 = this.a(this.field_Vb[11], -127, var18, var27[2], var16);
                          if (var18 <= var17) {
                            break L15;
                          } else {
                            var17 = var18;
                            break L15;
                          }
                        }
                        L16: {
                          var19 = 3 * var16 + 26;
                          var20 = this.field_Ob.b(true);
                          if (var19 >= var20) {
                            break L16;
                          } else {
                            var19 = var20;
                            break L16;
                          }
                        }
                        L17: {
                          if (this.field_dc == null) {
                            break L17;
                          } else {
                            var20 = this.field_dc.b(4, 2154);
                            if (var19 >= var20) {
                              break L17;
                            } else {
                              var19 = var20;
                              break L17;
                            }
                          }
                        }
                        L18: {
                          this.field_Ob.b(0, 2147483647, 0, 13 + var19 + 13, 24);
                          this.field_Zb.b(5, 2147483647, -20 + this.field_Ob.field_gb, 15, 15);
                          var21 = 10;
                          this.field_Mb.b(var21, 2147483647, 13, var19, ad.field_x * 2);
                          var21 = var21 + ad.field_x * 2;
                          this.field_Sb.b(var21, 2147483647, 13, var19, ad.field_x * 2);
                          var21 = var21 + (ad.field_x * 2 + 10);
                          this.field_Rb.b(var21, 2147483647, 0, 0, ad.field_x);
                          var21 = var21 + (10 + ad.field_x);
                          if (null == this.field_dc) {
                            break L18;
                          } else {
                            var20 = this.field_dc.b(4, 2154);
                            this.field_dc.a(var21, 13 - -((-var20 + var19) / 2), ad.field_x, false, var20, 4);
                            var21 = var21 + (ad.field_x - -10);
                            break L18;
                          }
                        }
                        var27[0].b(var21, 2147483647, 13, var16, var17);
                        var27[1].b(var21, 2147483647, 13 + (var16 + 13), var16, var17);
                        var27[2].b(var21, 2147483647, 13 - (-(2 * var16) - 26), var16, var17);
                        var22 = var21;
                        this.field_Tb.b(24, 2147483647, 0, 13 + (13 + var19), 10 + var22 + var17);
                        this.field_Tb.field_F = rp.a(32450, 3, 2105376, this.field_Tb.field_Db, 11579568, 8421504);
                        var23 = 13 + var19 + 13;
                        var24 = 10 + var17 + (var22 + 24);
                        var25 = de.a(var23, param2, param0, 0);
                        var26 = sh.a(var24, param1, -1, param3);
                        this.b(var26, 2147483647, var25, var23, var24);
                        break L1;
                      } else {
                        L19: {
                          if (this.field_Vb[var17] == null) {
                            break L19;
                          } else {
                            var18 = this.field_Vb[var17].b(true);
                            if (var18 <= var16) {
                              break L19;
                            } else {
                              var16 = var18;
                              break L19;
                            }
                          }
                        }
                        var17++;
                        continue L11;
                      }
                    }
                  } else {
                    L20: {
                      if (cm.field_L[var16] == null) {
                        break L20;
                      } else {
                        L21: {
                          this.field_Vb[var16] = new vh(0L, param10, cm.field_L[var16]);
                          this.field_Vb[var16].field_Fb = 0;
                          stackOut_12_0 = this.field_Vb[var16];
                          stackIn_14_0 = stackOut_12_0;
                          stackIn_13_0 = stackOut_12_0;
                          if (param11 == null) {
                            stackOut_14_0 = (vh) ((Object) stackIn_14_0);
                            stackOut_14_1 = 0;
                            stackIn_15_0 = stackOut_14_0;
                            stackIn_15_1 = stackOut_14_1;
                            break L21;
                          } else {
                            stackOut_13_0 = (vh) ((Object) stackIn_13_0);
                            stackOut_13_1 = 1;
                            stackIn_15_0 = stackOut_13_0;
                            stackIn_15_1 = stackOut_13_1;
                            break L21;
                          }
                        }
                        stackIn_15_0.field_pb = stackIn_15_1 != 0;
                        this.field_Tb.a(-128, this.field_Vb[var16]);
                        break L20;
                      }
                    }
                    var16++;
                    continue L6;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var15 = decompiledCaughtException;
            stackOut_49_0 = (RuntimeException) (var15);
            stackOut_49_1 = new StringBuilder().append("wm.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param5 == null) {
              stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L22;
            } else {
              stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L22;
            }
          }
          L23: {
            stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
            stackOut_52_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_52_2).append(',');
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param6 == null) {
              stackOut_54_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackOut_54_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L23;
            } else {
              stackOut_53_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackOut_53_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackOut_53_2 = "{...}";
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              break L23;
            }
          }
          L24: {
            stackOut_55_0 = (RuntimeException) ((Object) stackIn_55_0);
            stackOut_55_1 = ((StringBuilder) (Object) stackIn_55_1).append(stackIn_55_2).append(',');
            stackIn_57_0 = stackOut_55_0;
            stackIn_57_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param7 == null) {
              stackOut_57_0 = (RuntimeException) ((Object) stackIn_57_0);
              stackOut_57_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackOut_57_2 = "null";
              stackIn_58_0 = stackOut_57_0;
              stackIn_58_1 = stackOut_57_1;
              stackIn_58_2 = stackOut_57_2;
              break L24;
            } else {
              stackOut_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackOut_56_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackOut_56_2 = "{...}";
              stackIn_58_0 = stackOut_56_0;
              stackIn_58_1 = stackOut_56_1;
              stackIn_58_2 = stackOut_56_2;
              break L24;
            }
          }
          L25: {
            stackOut_58_0 = (RuntimeException) ((Object) stackIn_58_0);
            stackOut_58_1 = ((StringBuilder) (Object) stackIn_58_1).append(stackIn_58_2).append(',');
            stackIn_60_0 = stackOut_58_0;
            stackIn_60_1 = stackOut_58_1;
            stackIn_59_0 = stackOut_58_0;
            stackIn_59_1 = stackOut_58_1;
            if (param8 == null) {
              stackOut_60_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackOut_60_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackOut_60_2 = "null";
              stackIn_61_0 = stackOut_60_0;
              stackIn_61_1 = stackOut_60_1;
              stackIn_61_2 = stackOut_60_2;
              break L25;
            } else {
              stackOut_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackOut_59_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackOut_59_2 = "{...}";
              stackIn_61_0 = stackOut_59_0;
              stackIn_61_1 = stackOut_59_1;
              stackIn_61_2 = stackOut_59_2;
              break L25;
            }
          }
          L26: {
            stackOut_61_0 = (RuntimeException) ((Object) stackIn_61_0);
            stackOut_61_1 = ((StringBuilder) (Object) stackIn_61_1).append(stackIn_61_2).append(',');
            stackIn_63_0 = stackOut_61_0;
            stackIn_63_1 = stackOut_61_1;
            stackIn_62_0 = stackOut_61_0;
            stackIn_62_1 = stackOut_61_1;
            if (param9 == null) {
              stackOut_63_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackOut_63_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackOut_63_2 = "null";
              stackIn_64_0 = stackOut_63_0;
              stackIn_64_1 = stackOut_63_1;
              stackIn_64_2 = stackOut_63_2;
              break L26;
            } else {
              stackOut_62_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackOut_62_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackOut_62_2 = "{...}";
              stackIn_64_0 = stackOut_62_0;
              stackIn_64_1 = stackOut_62_1;
              stackIn_64_2 = stackOut_62_2;
              break L26;
            }
          }
          L27: {
            stackOut_64_0 = (RuntimeException) ((Object) stackIn_64_0);
            stackOut_64_1 = ((StringBuilder) (Object) stackIn_64_1).append(stackIn_64_2).append(',');
            stackIn_66_0 = stackOut_64_0;
            stackIn_66_1 = stackOut_64_1;
            stackIn_65_0 = stackOut_64_0;
            stackIn_65_1 = stackOut_64_1;
            if (param10 == null) {
              stackOut_66_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackOut_66_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackOut_66_2 = "null";
              stackIn_67_0 = stackOut_66_0;
              stackIn_67_1 = stackOut_66_1;
              stackIn_67_2 = stackOut_66_2;
              break L27;
            } else {
              stackOut_65_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackOut_65_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackOut_65_2 = "{...}";
              stackIn_67_0 = stackOut_65_0;
              stackIn_67_1 = stackOut_65_1;
              stackIn_67_2 = stackOut_65_2;
              break L27;
            }
          }
          L28: {
            stackOut_67_0 = (RuntimeException) ((Object) stackIn_67_0);
            stackOut_67_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_67_2).append(',');
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param11 == null) {
              stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L28;
            } else {
              stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackOut_68_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L28;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_70_0), stackIn_70_2 + ',' + param12 + ')');
        }
    }

    final boolean f(int param0) {
        if (!(this.field_bc == -2)) {
            return false;
        }
        if (param0 == qi.field_a) {
            this.field_bc = -1;
            return true;
        }
        return true;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        bc.field_b.field_v = 0;
        bc.field_b.a(12, false);
        bc.field_b.a(true, lc.field_P.nextInt());
        if (param0 >= -116) {
            field_Wb = (char[]) null;
        }
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
        field_ac = (int[][]) null;
    }

    final String h(int param0) {
        if (param0 != 1) {
            this.field_bc = -13;
        }
        return this.field_ec.toString();
    }

    private final int a(String param0, int param1, vh param2, byte param3, vh param4, int param5) {
        int discarded$2 = 0;
        vh var7 = null;
        RuntimeException var7_ref = null;
        vh var8 = null;
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
                var8 = (vh) null;
                discarded$2 = this.a((String) null, -118, (vh) null, (byte) -47, (vh) null, -97);
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
            stackOut_4_0 = (RuntimeException) (var7_ref);
            stackOut_4_1 = new StringBuilder().append("wm.D(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param3).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param4 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param5 + ')');
        }
        return stackIn_3_0;
    }

    final static int a(boolean param0, int param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
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
              if (param1 == 18) {
                break L1;
              } else {
                wm.f((byte) 15);
                break L1;
              }
            }
            if (!param0) {
              stackOut_5_0 = qp.field_ec.b(param2);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_3_0 = qa.field_t.b(param2);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("wm.A(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    static {
        field_Xb = null;
        field_cc = "(Including <%0>)";
        field_Qb = "Email: ";
        field_Pb = new na();
        field_Wb = new char[]{(char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122};
        field_ac = new int[64][3];
        field_Yb = "Funorb Pool";
    }
}
