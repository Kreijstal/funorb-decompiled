/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class td extends gh {
    long field_hc;
    private gh field_cc;
    private gh field_Zb;
    private gh field_Wb;
    private int field_Yb;
    static String field_ac;
    private StringBuilder field_fc;
    static int[] field_Xb;
    private gh[] field_Ub;
    private gh field_Tb;
    private id field_dc;
    static gh field_ic;
    static wk field_ec;
    private gh field_jc;
    static boolean field_Sb;
    private gh field_gc;
    static String field_Vb;
    static gh field_bc;

    final boolean k(int param0) {
        int var2 = 0;
        var2 = -21 % ((param0 - 14) / 53);
        if (-2 == ((td) this).field_Yb) {
          if (ei.field_q != 13) {
            return true;
          } else {
            ((td) this).field_Yb = -1;
            return true;
          }
        } else {
          return false;
        }
    }

    private final int a(int param0, int param1, gh param2, int param3, gh param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
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
            param0 += 8;
            var6_int = param4.field_L.a(param4.field_S, -(param4.field_ub * 2) + param3, param4.field_Ib);
            param4.a(param1, param0, var6_int, 0, param3);
            param0 = param0 + var6_int;
            param2.a(param4, 125);
            stackOut_0_0 = param0;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var6;
            stackOut_2_1 = new StringBuilder().append("td.G(").append(param0).append(44).append(param1).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44).append(param3).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param4 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_1_0;
    }

    private final int a(int param0, boolean param1, gh param2, gh param3, int param4, String param5) {
        gh var7 = null;
        RuntimeException var7_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
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
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            var7 = new gh(0L, param2, 0, param0, param4, 24, param5);
            param0 += 32;
            if (param1) {
              param3.a(var7, 124);
              stackOut_3_0 = param0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = -92;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var7_ref;
            stackOut_5_1 = new StringBuilder().append("td.A(").append(param0).append(44).append(param1).append(44);
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
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44).append(param4).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param5 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_4_0;
    }

    td(int param0, int param1, int param2, int param3, int param4, gh param5, gh param6, gh param7, gh param8, id param9, gh param10, String param11, long param12) {
        super(0L, param5);
        int var15_int = 0;
        gh[] var15 = null;
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
        gh[] var28 = null;
        Object stackIn_4_0 = null;
        id stackIn_4_1 = null;
        id stackIn_4_2 = null;
        long stackIn_4_3 = 0L;
        id stackIn_4_4 = null;
        Object stackIn_5_0 = null;
        id stackIn_5_1 = null;
        id stackIn_5_2 = null;
        long stackIn_5_3 = 0L;
        id stackIn_5_4 = null;
        Object stackIn_6_0 = null;
        id stackIn_6_1 = null;
        id stackIn_6_2 = null;
        long stackIn_6_3 = 0L;
        id stackIn_6_4 = null;
        Object stackIn_7_0 = null;
        id stackIn_7_1 = null;
        id stackIn_7_2 = null;
        long stackIn_7_3 = 0L;
        id stackIn_7_4 = null;
        String stackIn_7_5 = null;
        gh stackIn_12_0 = null;
        gh stackIn_13_0 = null;
        gh stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackOut_3_0 = null;
        id stackOut_3_1 = null;
        id stackOut_3_2 = null;
        long stackOut_3_3 = 0L;
        id stackOut_3_4 = null;
        Object stackOut_4_0 = null;
        id stackOut_4_1 = null;
        id stackOut_4_2 = null;
        long stackOut_4_3 = 0L;
        id stackOut_4_4 = null;
        Object stackOut_5_0 = null;
        id stackOut_5_1 = null;
        id stackOut_5_2 = null;
        long stackOut_5_3 = 0L;
        id stackOut_5_4 = null;
        String stackOut_5_5 = null;
        Object stackOut_6_0 = null;
        id stackOut_6_1 = null;
        id stackOut_6_2 = null;
        long stackOut_6_3 = 0L;
        id stackOut_6_4 = null;
        String stackOut_6_5 = null;
        gh stackOut_11_0 = null;
        gh stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        gh stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        L0: {
          ((td) this).field_Yb = -2;
          ((td) this).field_hc = param12;
          ((td) this).field_Wb = new gh(0L, param6, oc.field_a.toUpperCase());
          ((td) this).field_Wb.field_Kb = 1;
          ((td) this).a(((td) this).field_Wb, 119);
          ((td) this).field_Zb = new gh(0L, param7);
          ((td) this).field_Wb.a(((td) this).field_Zb, 121);
          ((td) this).field_jc = new gh(0L, (gh) null);
          ((td) this).a(((td) this).field_jc, 119);
          if (param11 == null) {
            ((td) this).field_cc = new gh(0L, param8, ed.field_b);
            ((td) this).field_cc.field_Kb = 1;
            ((td) this).field_cc.field_nb = 11184810;
            ((td) this).field_jc.a(((td) this).field_cc, 119);
            var15_int = 226;
            var16 = 10;
            var17 = ((td) this).field_cc.field_L.b(((td) this).field_cc.field_S, var15_int);
            ((td) this).field_cc.a(0, var16, db.field_b * var17, 13, var15_int);
            var16 = var16 + var17 * db.field_b;
            ((td) this).field_jc.a(0, 24, 10 - -var16, 0, 13 + (var15_int + 13));
            ((td) this).field_jc.field_I = se.a(3, 2105376, 11579568, ((td) this).field_jc.field_Lb, 8421504, 13574);
            var18 = 13 + var15_int + 13;
            var19 = 34 + var16;
            var20 = dl.a(param2, 127, param0, var18);
            var21 = ol.a(param1, 0, param3, var19);
            ((td) this).a(0, var21, var19, var20, var18);
            break L0;
          } else {
            L1: {
              L2: {
                ((td) this).field_cc = new gh(0L, param8, cl.field_h);
                ((td) this).field_cc.field_nb = 11184810;
                ((td) this).field_cc.field_Kb = 1;
                ((td) this).field_jc.a(((td) this).field_cc, 120);
                ((td) this).field_gc = new gh(0L, param8, nj.field_X);
                ((td) this).field_gc.field_nb = 11184810;
                ((td) this).field_gc.field_Kb = 1;
                ((td) this).field_jc.a(((td) this).field_gc, 121);
                ((td) this).field_Tb = new gh(0L, param8);
                ((td) this).field_Tb.field_nb = 16764006;
                ((td) this).field_jc.a(((td) this).field_Tb, 119);
                ((td) this).field_Tb.field_Db = "|";
                if (di.field_h >= 5) {
                  break L2;
                } else {
                  if (ul.field_d < 2) {
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
                  stackOut_3_4 = (id) param9;
                  stackIn_6_0 = stackOut_3_0;
                  stackIn_6_1 = stackOut_3_1;
                  stackIn_6_2 = stackOut_3_2;
                  stackIn_6_3 = stackOut_3_3;
                  stackIn_6_4 = stackOut_3_4;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  stackIn_4_2 = stackOut_3_2;
                  stackIn_4_3 = stackOut_3_3;
                  stackIn_4_4 = stackOut_3_4;
                  if (7 <= di.field_h) {
                    break L4;
                  } else {
                    stackOut_4_0 = this;
                    stackOut_4_1 = null;
                    stackOut_4_2 = null;
                    stackOut_4_3 = stackIn_4_3;
                    stackOut_4_4 = (id) (Object) stackIn_4_4;
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
                    if (ul.field_d >= 2) {
                      break L4;
                    } else {
                      stackOut_5_0 = this;
                      stackOut_5_1 = null;
                      stackOut_5_2 = null;
                      stackOut_5_3 = stackIn_5_3;
                      stackOut_5_4 = (id) (Object) stackIn_5_4;
                      stackOut_5_5 = ge.field_h;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      stackIn_7_2 = stackOut_5_2;
                      stackIn_7_3 = stackOut_5_3;
                      stackIn_7_4 = stackOut_5_4;
                      stackIn_7_5 = stackOut_5_5;
                      break L3;
                    }
                  }
                }
                stackOut_6_0 = this;
                stackOut_6_1 = null;
                stackOut_6_2 = null;
                stackOut_6_3 = stackIn_6_3;
                stackOut_6_4 = (id) (Object) stackIn_6_4;
                stackOut_6_5 = id.field_Xb;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                stackIn_7_2 = stackOut_6_2;
                stackIn_7_3 = stackOut_6_3;
                stackIn_7_4 = stackOut_6_4;
                stackIn_7_5 = stackOut_6_5;
                break L3;
              }
              ((td) this).field_dc = new id(stackIn_7_3, stackIn_7_4, stackIn_7_5);
              ((td) this).field_jc.a((gh) (Object) ((td) this).field_dc, 119);
              break L1;
            }
            var28 = new gh[3];
            var15 = var28;
            var28[0] = new gh(0L, (gh) null);
            ((td) this).field_jc.a(var28[0], 127);
            var28[1] = new gh(0L, (gh) null);
            ((td) this).field_jc.a(var28[1], 124);
            var28[2] = new gh(0L, (gh) null);
            ((td) this).field_jc.a(var28[2], 124);
            ((td) this).field_Ub = new gh[fc.field_d];
            var16 = 0;
            L5: while (true) {
              if (fc.field_d <= var16) {
                L6: {
                  ((td) this).field_fc = new StringBuilder(12);
                  if (param11 == null) {
                    break L6;
                  } else {
                    StringBuilder discarded$1 = ((td) this).field_fc.append(param11);
                    break L6;
                  }
                }
                L7: {
                  var16 = 0;
                  var17 = param6.field_L.c(al.field_c);
                  if (var17 <= var16) {
                    break L7;
                  } else {
                    var16 = var17;
                    break L7;
                  }
                }
                L8: {
                  var17 = param6.field_L.c(ch.field_M);
                  if (~var17 >= ~var16) {
                    break L8;
                  } else {
                    var16 = var17;
                    break L8;
                  }
                }
                L9: {
                  var17 = param6.field_L.c(id.field_Ub);
                  if (var17 <= var16) {
                    break L9;
                  } else {
                    var16 = var17;
                    break L9;
                  }
                }
                var17 = 0;
                L10: while (true) {
                  if (~fc.field_d >= ~var17) {
                    L11: {
                      if (var16 <= 140) {
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
                      var18 = this.a(var18, true, param6, var28[0], var16, al.field_c);
                      var18 = this.a(var18, 0, var28[0], var16, ((td) this).field_Ub[6]);
                      var18 = this.a(var18, 0, var28[0], var16, ((td) this).field_Ub[9]);
                      var18 = this.a(var18, 0, var28[0], var16, ((td) this).field_Ub[5]);
                      var18 = this.a(var18, 0, var28[0], var16, ((td) this).field_Ub[7]);
                      var18 = this.a(var18, 0, var28[0], var16, ((td) this).field_Ub[15]);
                      var18 = this.a(var18, 0, var28[0], var16, ((td) this).field_Ub[4]);
                      if (var18 <= var17) {
                        break L12;
                      } else {
                        var17 = var18;
                        break L12;
                      }
                    }
                    L13: {
                      var18 = 0;
                      var18 = this.a(var18, true, param6, var28[1], var16, ch.field_M);
                      var18 = this.a(var18, 0, var28[1], var16, ((td) this).field_Ub[16]);
                      var18 = this.a(var18, 0, var28[1], var16, ((td) this).field_Ub[17]);
                      var18 = this.a(var18, 0, var28[1], var16, ((td) this).field_Ub[18]);
                      var18 = this.a(var18, 0, var28[1], var16, ((td) this).field_Ub[19]);
                      var18 = this.a(var18, 0, var28[1], var16, ((td) this).field_Ub[20]);
                      if (~var17 <= ~var18) {
                        break L13;
                      } else {
                        var17 = var18;
                        break L13;
                      }
                    }
                    L14: {
                      var18 = 0;
                      var18 = this.a(var18, true, param6, var28[2], var16, id.field_Ub);
                      var18 = this.a(var18, 0, var28[2], var16, ((td) this).field_Ub[13]);
                      var18 = this.a(var18, 0, var28[2], var16, ((td) this).field_Ub[21]);
                      var18 = this.a(var18, 0, var28[2], var16, ((td) this).field_Ub[11]);
                      if (~var17 <= ~var18) {
                        break L14;
                      } else {
                        var17 = var18;
                        break L14;
                      }
                    }
                    L15: {
                      var19 = 26 + var16 * 3;
                      var20 = ((td) this).field_Wb.g(-2147483648);
                      if (~var20 >= ~var19) {
                        break L15;
                      } else {
                        var19 = var20;
                        break L15;
                      }
                    }
                    L16: {
                      if (((td) this).field_dc == null) {
                        break L16;
                      } else {
                        var20 = ((td) this).field_dc.c(-52, 4);
                        if (var19 >= var20) {
                          break L16;
                        } else {
                          var19 = var20;
                          break L16;
                        }
                      }
                    }
                    L17: {
                      ((td) this).field_Wb.a(0, 0, 24, 0, 13 + (var19 + 13));
                      ((td) this).field_Zb.a(0, 5, 15, ((td) this).field_Wb.field_zb - 20, 15);
                      var21 = 10;
                      ((td) this).field_cc.a(0, var21, db.field_b * 2, 13, var19);
                      var21 = var21 + db.field_b * 2;
                      ((td) this).field_gc.a(0, var21, 2 * db.field_b, 13, var19);
                      var21 = var21 + (10 + db.field_b * 2);
                      ((td) this).field_Tb.a(0, var21, db.field_b, 0, 0);
                      var21 = var21 + (db.field_b + 10);
                      if (null == ((td) this).field_dc) {
                        break L17;
                      } else {
                        var20 = ((td) this).field_dc.c(-116, 4);
                        ((td) this).field_dc.a(var21, var20, 4, 43, (var19 - var20) / 2 + 13, db.field_b);
                        var21 = var21 + (db.field_b + 10);
                        break L17;
                      }
                    }
                    var28[0].a(0, var21, var17, 13, var16);
                    var28[1].a(0, var21, var17, 13 + (var16 + 13), var16);
                    var28[2].a(0, var21, var17, 13 - (-(var16 * 2) + -26), var16);
                    var22 = var21;
                    ((td) this).field_jc.a(0, 24, var22 - (-var17 - 10), 0, 13 + (var19 + 13));
                    ((td) this).field_jc.field_I = se.a(3, 2105376, 11579568, ((td) this).field_jc.field_Lb, 8421504, 13574);
                    var23 = 26 + var19;
                    var24 = 10 + var17 + (var22 + 24);
                    var25 = dl.a(param2, 127, param0, var23);
                    var26 = ol.a(param1, 0, param3, var24);
                    ((td) this).a(0, var26, var24, var25, var23);
                    break L0;
                  } else {
                    L18: {
                      if (((td) this).field_Ub[var17] == null) {
                        break L18;
                      } else {
                        var18 = ((td) this).field_Ub[var17].g(-2147483648);
                        if (~var16 <= ~var18) {
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
                  if (null == hh.field_g[var16]) {
                    break L19;
                  } else {
                    L20: {
                      ((td) this).field_Ub[var16] = new gh(0L, param10, hh.field_g[var16]);
                      ((td) this).field_Ub[var16].field_Kb = 0;
                      stackOut_11_0 = ((td) this).field_Ub[var16];
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_12_0 = stackOut_11_0;
                      if (param11 == null) {
                        stackOut_13_0 = (gh) (Object) stackIn_13_0;
                        stackOut_13_1 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        break L20;
                      } else {
                        stackOut_12_0 = (gh) (Object) stackIn_12_0;
                        stackOut_12_1 = 1;
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_14_1 = stackOut_12_1;
                        break L20;
                      }
                    }
                    stackIn_14_0.field_T = stackIn_14_1 != 0;
                    ((td) this).field_jc.a(((td) this).field_Ub[var16], 120);
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

    final boolean d(byte param0) {
        Object var3 = null;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 >= 55) {
            break L0;
          } else {
            var3 = null;
            int discarded$2 = this.a(-52, false, (gh) null, (gh) null, 10, (String) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((td) this).field_dc == null) {
              break L2;
            } else {
              if (!((td) this).field_dc.field_G) {
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

    public static void j(int param0) {
        field_Xb = null;
        field_ec = null;
        field_Vb = null;
        field_bc = null;
        field_ac = null;
        field_ic = null;
    }

    final int a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        id stackIn_6_0 = null;
        id stackIn_7_0 = null;
        id stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        gh stackIn_14_0 = null;
        gh stackIn_15_0 = null;
        gh stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        id stackOut_5_0 = null;
        id stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        id stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        gh stackOut_13_0 = null;
        gh stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        gh stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        L0: {
          var4 = SteelSentinels.field_G;
          ((td) this).a((byte) 119, param0);
          if (((td) this).field_Tb != null) {
            L1: {
              ((td) this).field_Tb.field_S = ((td) this).field_fc.toString();
              ((td) this).field_Tb.field_Y = (((td) this).field_zb + -((td) this).field_Tb.field_L.c(((td) this).field_Tb.field_S)) / 2;
              if (((td) this).field_dc != null) {
                if (((td) this).field_dc.field_Eb == 0) {
                  break L1;
                } else {
                  L2: {
                    stackOut_5_0 = ((td) this).field_dc;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (((td) this).field_dc.field_G) {
                      stackOut_7_0 = (id) (Object) stackIn_7_0;
                      stackOut_7_1 = 0;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      break L2;
                    } else {
                      stackOut_6_0 = (id) (Object) stackIn_6_0;
                      stackOut_6_1 = 1;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      break L2;
                    }
                  }
                  stackIn_8_0.field_G = stackIn_8_1 != 0;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            ((td) this).field_Tb.field_zb = ((td) this).field_zb - ((td) this).field_Tb.field_Y;
            var3 = 0;
            L3: while (true) {
              if (fc.field_d <= var3) {
                break L0;
              } else {
                if (null != ((td) this).field_Ub[var3]) {
                  L4: {
                    stackOut_13_0 = ((td) this).field_Ub[var3];
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_14_0 = stackOut_13_0;
                    if (0 >= ((td) this).field_fc.length()) {
                      stackOut_15_0 = (gh) (Object) stackIn_15_0;
                      stackOut_15_1 = 0;
                      stackIn_16_0 = stackOut_15_0;
                      stackIn_16_1 = stackOut_15_1;
                      break L4;
                    } else {
                      stackOut_14_0 = (gh) (Object) stackIn_14_0;
                      stackOut_14_1 = 1;
                      stackIn_16_0 = stackOut_14_0;
                      stackIn_16_1 = stackOut_14_1;
                      break L4;
                    }
                  }
                  stackIn_16_0.field_T = stackIn_16_1 != 0;
                  if (((td) this).field_Ub[var3].field_T) {
                    if (0 != ((td) this).field_Ub[var3].field_Eb) {
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
          } else {
            break L0;
          }
        }
        if (((td) this).field_Zb.field_Eb != 0) {
          return -1;
        } else {
          if (param0) {
            if (lb.field_gc != 0) {
              if (((td) this).field_Eb == 0) {
                return -1;
              } else {
                L5: {
                  if (param1 <= -89) {
                    break L5;
                  } else {
                    field_bc = null;
                    break L5;
                  }
                }
                return ((td) this).field_Yb;
              }
            } else {
              L6: {
                if (param1 <= -89) {
                  break L6;
                } else {
                  field_bc = null;
                  break L6;
                }
              }
              return ((td) this).field_Yb;
            }
          } else {
            L7: {
              if (param1 <= -89) {
                break L7;
              } else {
                field_bc = null;
                break L7;
              }
            }
            return ((td) this).field_Yb;
          }
        }
    }

    final String b(boolean param0) {
        if (!param0) {
            Object var3 = null;
            int discarded$0 = this.a(32, true, (gh) null, (gh) null, -121, (String) null);
        }
        return ((td) this).field_fc.toString();
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ac = "Sentinel configuration is now unlocked.<br>Log in or create a free account to save your progress.";
        field_Xb = new int[]{0, 4096, 5793, 7094, 8192, 9159, 10033, 10837, 11585, 12288, 12953, 13585, 14189, 14768, 15326, 15864, 16384, 16888, 17378, 17854, 18318, 18770, 19212, 19644, 20066, 20480, 20886, 21283, 21674, 22058, 22435, 22806, 23170, 23530, 23884, 24232, 24576, 24915, 25249, 25580, 25905, 26227, 26545, 26859, 27170, 27477, 27780, 28081, 28378, 28672, 28963, 29251, 29537, 29819, 30099, 30377, 30652, 30924, 31194, 31462, 31727, 31991, 32252, 32511, 32768, 33023, 33276, 33527, 33776, 34024, 34270, 34514, 34756, 34996, 35235, 35472, 35708, 35942, 36175, 36406, 36636, 36864, 37091, 37316, 37540, 37763, 37985, 38205, 38424, 38642, 38858, 39073, 39287, 39500, 39712, 39923, 40132, 40341, 40548, 40755, 40960, 41164, 41368, 41570, 41771, 41972, 42171, 42369, 42567, 42763, 42959, 43154, 43348, 43541, 43733, 43925, 44115, 44305, 44494, 44682, 44869, 45056, 45242, 45427, 45611, 45795, 45977, 46160, 46341, 46522, 46702, 46881, 47059, 47237, 47415, 47591, 47767, 47942, 48117, 48291, 48465, 48637, 48809, 48981, 49152, 49322, 49492, 49661, 49830, 49998, 50166, 50332, 50499, 50665, 50830, 50995, 51159, 51323, 51486, 51649, 51811, 51972, 52134, 52294, 52454, 52614, 52773, 52932, 53090, 53248, 53405, 53562, 53719, 53874, 54030, 54185, 54340, 54494, 54647, 54801, 54954, 55106, 55258, 55410, 55561, 55712, 55862, 56012, 56162, 56311, 56459, 56608, 56756, 56903, 57051, 57198, 57344, 57490, 57636, 57781, 57926, 58071, 58215, 58359, 58503, 58646, 58789, 58931, 59073, 59215, 59357, 59498, 59639, 59779, 59919, 60059, 60199, 60338, 60477, 60615, 60753, 60891, 61029, 61166, 61303, 61440, 61576, 61712, 61848, 61984, 62119, 62254, 62388, 62523, 62657, 62790, 62924, 63057, 63190, 63323, 63455, 63587, 63719, 63850, 63982, 64113, 64243, 64374, 64504, 64634, 64763, 64893, 65022, 65151, 65279, 65408};
        field_Vb = "GET DEFAULT SET";
    }
}
