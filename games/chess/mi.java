/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class mi extends nm {
    static wg field_q;
    static Calendar field_u;
    static int field_v;
    jc field_x;
    static String[] field_t;
    static String field_n;
    private vl field_w;
    lb field_p;
    static String field_o;
    static int field_r;
    static int[] field_s;

    private final void a(int param0, int param1, qd param2) {
        int var4 = 0;
        int var5 = 0;
        vl stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        qd stackIn_17_2 = null;
        vl stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        qd stackIn_18_2 = null;
        vl stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        qd stackIn_19_2 = null;
        int stackIn_19_3 = 0;
        vl stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        qd stackOut_16_2 = null;
        vl stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        qd stackOut_18_2 = null;
        int stackOut_18_3 = 0;
        vl stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        qd stackOut_17_2 = null;
        int stackOut_17_3 = 0;
        if ((((mi) this).field_w.field_Q[param2.field_n] & 4) != 0) {
          if (-1 < (param2.field_J ^ -1)) {
            var4 = ((mi) this).field_w.field_E[param2.field_n] / md.field_l;
            var5 = (var4 + (1048575 - param2.field_x)) / var4;
            param2.field_x = param1 * var4 + param2.field_x & 1048575;
            if (param1 >= var5) {
              if (0 == ((mi) this).field_w.field_r[param2.field_n]) {
                L0: {
                  param2.field_j = na.a(param2.field_H, param2.field_j.k(), param2.field_j.j(), param2.field_j.l());
                  if (0 > param2.field_q.field_p[param2.field_C]) {
                    param2.field_j.f(-1);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                param1 = param2.field_x / var4;
                param2.field_j.a(param1);
                if (param0 > 23) {
                  return;
                } else {
                  field_v = -9;
                  return;
                }
              } else {
                L1: {
                  param2.field_j = na.a(param2.field_H, param2.field_j.k(), 0, param2.field_j.l());
                  stackOut_16_0 = ((mi) this).field_w;
                  stackOut_16_1 = -76;
                  stackOut_16_2 = (qd) param2;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  if ((param2.field_q.field_p[param2.field_C] ^ -1) <= -1) {
                    stackOut_18_0 = (vl) (Object) stackIn_18_0;
                    stackOut_18_1 = stackIn_18_1;
                    stackOut_18_2 = (qd) (Object) stackIn_18_2;
                    stackOut_18_3 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    stackIn_19_3 = stackOut_18_3;
                    break L1;
                  } else {
                    stackOut_17_0 = (vl) (Object) stackIn_17_0;
                    stackOut_17_1 = stackIn_17_1;
                    stackOut_17_2 = (qd) (Object) stackIn_17_2;
                    stackOut_17_3 = 1;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    stackIn_19_3 = stackOut_17_3;
                    break L1;
                  }
                }
                L2: {
                  ((vl) (Object) stackIn_19_0).a((byte) stackIn_19_1, (qd) (Object) stackIn_19_2, stackIn_19_3 != 0);
                  if (0 > param2.field_q.field_p[param2.field_C]) {
                    param2.field_j.f(-1);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                param1 = param2.field_x / var4;
                param2.field_j.a(param1);
                if (param0 > 23) {
                  return;
                } else {
                  field_v = -9;
                  return;
                }
              }
            } else {
              param2.field_j.a(param1);
              if (param0 > 23) {
                return;
              } else {
                field_v = -9;
                return;
              }
            }
          } else {
            param2.field_j.a(param1);
            if (param0 > 23) {
              return;
            } else {
              field_v = -9;
              return;
            }
          }
        } else {
          param2.field_j.a(param1);
          if (param0 > 23) {
            return;
          } else {
            field_v = -9;
            return;
          }
        }
    }

    private final void a(qd param0, int param1, int param2, int param3, int param4, int[] param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        na var11 = null;
        int var12 = 0;
        vl stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        qd stackIn_12_2 = null;
        vl stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        qd stackIn_13_2 = null;
        vl stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        qd stackIn_14_2 = null;
        int stackIn_14_3 = 0;
        vl stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        qd stackOut_11_2 = null;
        vl stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        qd stackOut_13_2 = null;
        int stackOut_13_3 = 0;
        vl stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        qd stackOut_12_2 = null;
        int stackOut_12_3 = 0;
        L0: {
          var12 = Chess.field_G;
          if ((((mi) this).field_w.field_Q[param0.field_n] & 4) == -1) {
            break L0;
          } else {
            if (-1 > param0.field_J) {
              var7 = ((mi) this).field_w.field_E[param0.field_n] / md.field_l;
              L1: while (true) {
                var8 = (-param0.field_x + (var7 + 1048575)) / var7;
                if (var8 > param3) {
                  param0.field_x = param0.field_x + var7 * param3;
                  break L0;
                } else {
                  L2: {
                    param0.field_j.a(param5, param2, var8);
                    param2 = param2 + var8;
                    param3 = param3 - var8;
                    param0.field_x = param0.field_x + (-1048576 + var8 * var7);
                    var9 = md.field_l / 100;
                    var10 = 262144 / var7;
                    if (var10 >= var9) {
                      break L2;
                    } else {
                      var9 = var10;
                      break L2;
                    }
                  }
                  L3: {
                    var11 = param0.field_j;
                    if (((mi) this).field_w.field_r[param0.field_n] == 0) {
                      param0.field_j = na.a(param0.field_H, var11.k(), var11.j(), var11.l());
                      break L3;
                    } else {
                      L4: {
                        param0.field_j = na.a(param0.field_H, var11.k(), 0, var11.l());
                        stackOut_11_0 = ((mi) this).field_w;
                        stackOut_11_1 = -71;
                        stackOut_11_2 = (qd) param0;
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        stackIn_13_2 = stackOut_11_2;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        stackIn_12_2 = stackOut_11_2;
                        if (0 <= param0.field_q.field_p[param0.field_C]) {
                          stackOut_13_0 = (vl) (Object) stackIn_13_0;
                          stackOut_13_1 = stackIn_13_1;
                          stackOut_13_2 = (qd) (Object) stackIn_13_2;
                          stackOut_13_3 = 0;
                          stackIn_14_0 = stackOut_13_0;
                          stackIn_14_1 = stackOut_13_1;
                          stackIn_14_2 = stackOut_13_2;
                          stackIn_14_3 = stackOut_13_3;
                          break L4;
                        } else {
                          stackOut_12_0 = (vl) (Object) stackIn_12_0;
                          stackOut_12_1 = stackIn_12_1;
                          stackOut_12_2 = (qd) (Object) stackIn_12_2;
                          stackOut_12_3 = 1;
                          stackIn_14_0 = stackOut_12_0;
                          stackIn_14_1 = stackOut_12_1;
                          stackIn_14_2 = stackOut_12_2;
                          stackIn_14_3 = stackOut_12_3;
                          break L4;
                        }
                      }
                      ((vl) (Object) stackIn_14_0).a((byte) stackIn_14_1, (qd) (Object) stackIn_14_2, stackIn_14_3 != 0);
                      param0.field_j.b(var9, var11.j());
                      break L3;
                    }
                  }
                  L5: {
                    if (0 > param0.field_q.field_p[param0.field_C]) {
                      param0.field_j.f(-1);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var11.d(var9);
                  var11.a(param5, param2, -param2 + param1);
                  if (!var11.g()) {
                    continue L1;
                  } else {
                    ((mi) this).field_p.a((nm) (Object) var11);
                    continue L1;
                  }
                }
              }
            } else {
              if (param4 == -2771) {
                param0.field_j.a(param5, param2, param3);
                return;
              } else {
                ((mi) this).field_p = null;
                param0.field_j.a(param5, param2, param3);
                return;
              }
            }
          }
        }
        if (param4 == -2771) {
          param0.field_j.a(param5, param2, param3);
          return;
        } else {
          ((mi) this).field_p = null;
          param0.field_j.a(param5, param2, param3);
          return;
        }
    }

    final void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        qd var6 = null;
        int var7 = 0;
        var7 = Chess.field_G;
        ((mi) this).field_p.a(param0, param1, param2);
        var6 = (qd) (Object) ((mi) this).field_x.g(-18110);
        L0: while (true) {
          if (var6 != null) {
            L1: {
              if (((mi) this).field_w.a((byte) -25, var6)) {
                break L1;
              } else {
                var4 = param1;
                var5 = param2;
                L2: while (true) {
                  if (var5 <= var6.field_B) {
                    this.a(var6, var4 + var5, var4, var5, -2771, param0);
                    var6.field_B = var6.field_B - var5;
                    break L1;
                  } else {
                    this.a(var6, var4 + var5, var4, var6.field_B, -2771, param0);
                    var4 = var4 + var6.field_B;
                    var5 = var5 - var6.field_B;
                    if (((mi) this).field_w.a(35, var5, param0, var4, var6)) {
                      break L1;
                    } else {
                      continue L2;
                    }
                  }
                }
              }
            }
            var6 = (qd) (Object) ((mi) this).field_x.a((byte) -112);
            continue L0;
          } else {
            return;
          }
        }
    }

    final static r a(int param0, long param1) {
        if (param0 != 134217727) {
            field_o = null;
            return (r) (Object) cm.field_v.a(param1, 3000);
        }
        return (r) (Object) cm.field_v.a(param1, 3000);
    }

    final static void a(byte param0, boolean param1) {
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        boolean stackIn_4_4 = false;
        int stackIn_4_5 = 0;
        int stackIn_4_6 = 0;
        int stackIn_4_7 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        boolean stackIn_5_4 = false;
        int stackIn_5_5 = 0;
        int stackIn_5_6 = 0;
        int stackIn_5_7 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        boolean stackIn_6_4 = false;
        int stackIn_6_5 = 0;
        int stackIn_6_6 = 0;
        int stackIn_6_7 = 0;
        int stackIn_6_8 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        boolean stackIn_7_4 = false;
        int stackIn_7_5 = 0;
        int stackIn_7_6 = 0;
        int stackIn_7_7 = 0;
        int stackIn_7_8 = 0;
        int stackIn_7_9 = 0;
        int stackIn_7_10 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        boolean stackIn_8_4 = false;
        int stackIn_8_5 = 0;
        int stackIn_8_6 = 0;
        int stackIn_8_7 = 0;
        int stackIn_8_8 = 0;
        int stackIn_8_9 = 0;
        int stackIn_8_10 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        boolean stackIn_9_4 = false;
        int stackIn_9_5 = 0;
        int stackIn_9_6 = 0;
        int stackIn_9_7 = 0;
        int stackIn_9_8 = 0;
        int stackIn_9_9 = 0;
        int stackIn_9_10 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        int stackIn_10_3 = 0;
        boolean stackIn_10_4 = false;
        int stackIn_10_5 = 0;
        int stackIn_10_6 = 0;
        int stackIn_10_7 = 0;
        int stackIn_10_8 = 0;
        int stackIn_10_9 = 0;
        int stackIn_10_10 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_11_3 = 0;
        boolean stackIn_11_4 = false;
        int stackIn_11_5 = 0;
        int stackIn_11_6 = 0;
        int stackIn_11_7 = 0;
        int stackIn_11_8 = 0;
        int stackIn_11_9 = 0;
        int stackIn_11_10 = 0;
        int stackIn_11_11 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        int stackIn_20_3 = 0;
        boolean stackIn_20_4 = false;
        int stackIn_20_5 = 0;
        int stackIn_20_6 = 0;
        int stackIn_20_7 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        int stackIn_21_3 = 0;
        boolean stackIn_21_4 = false;
        int stackIn_21_5 = 0;
        int stackIn_21_6 = 0;
        int stackIn_21_7 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        boolean stackIn_22_4 = false;
        int stackIn_22_5 = 0;
        int stackIn_22_6 = 0;
        int stackIn_22_7 = 0;
        int stackIn_22_8 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        boolean stackIn_23_4 = false;
        int stackIn_23_5 = 0;
        int stackIn_23_6 = 0;
        int stackIn_23_7 = 0;
        int stackIn_23_8 = 0;
        int stackIn_23_9 = 0;
        int stackIn_23_10 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        boolean stackIn_24_4 = false;
        int stackIn_24_5 = 0;
        int stackIn_24_6 = 0;
        int stackIn_24_7 = 0;
        int stackIn_24_8 = 0;
        int stackIn_24_9 = 0;
        int stackIn_24_10 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        boolean stackIn_25_4 = false;
        int stackIn_25_5 = 0;
        int stackIn_25_6 = 0;
        int stackIn_25_7 = 0;
        int stackIn_25_8 = 0;
        int stackIn_25_9 = 0;
        int stackIn_25_10 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        boolean stackIn_26_4 = false;
        int stackIn_26_5 = 0;
        int stackIn_26_6 = 0;
        int stackIn_26_7 = 0;
        int stackIn_26_8 = 0;
        int stackIn_26_9 = 0;
        int stackIn_26_10 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        int stackIn_27_3 = 0;
        boolean stackIn_27_4 = false;
        int stackIn_27_5 = 0;
        int stackIn_27_6 = 0;
        int stackIn_27_7 = 0;
        int stackIn_27_8 = 0;
        int stackIn_27_9 = 0;
        int stackIn_27_10 = 0;
        int stackIn_27_11 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        boolean stackIn_35_4 = false;
        int stackIn_35_5 = 0;
        int stackIn_35_6 = 0;
        int stackIn_35_7 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        boolean stackIn_36_4 = false;
        int stackIn_36_5 = 0;
        int stackIn_36_6 = 0;
        int stackIn_36_7 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        boolean stackIn_37_4 = false;
        int stackIn_37_5 = 0;
        int stackIn_37_6 = 0;
        int stackIn_37_7 = 0;
        int stackIn_37_8 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_38_2 = 0;
        int stackIn_38_3 = 0;
        boolean stackIn_38_4 = false;
        int stackIn_38_5 = 0;
        int stackIn_38_6 = 0;
        int stackIn_38_7 = 0;
        int stackIn_38_8 = 0;
        int stackIn_38_9 = 0;
        int stackIn_38_10 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_39_2 = 0;
        int stackIn_39_3 = 0;
        boolean stackIn_39_4 = false;
        int stackIn_39_5 = 0;
        int stackIn_39_6 = 0;
        int stackIn_39_7 = 0;
        int stackIn_39_8 = 0;
        int stackIn_39_9 = 0;
        int stackIn_39_10 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_40_2 = 0;
        int stackIn_40_3 = 0;
        boolean stackIn_40_4 = false;
        int stackIn_40_5 = 0;
        int stackIn_40_6 = 0;
        int stackIn_40_7 = 0;
        int stackIn_40_8 = 0;
        int stackIn_40_9 = 0;
        int stackIn_40_10 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_41_2 = 0;
        int stackIn_41_3 = 0;
        boolean stackIn_41_4 = false;
        int stackIn_41_5 = 0;
        int stackIn_41_6 = 0;
        int stackIn_41_7 = 0;
        int stackIn_41_8 = 0;
        int stackIn_41_9 = 0;
        int stackIn_41_10 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        int stackIn_42_3 = 0;
        boolean stackIn_42_4 = false;
        int stackIn_42_5 = 0;
        int stackIn_42_6 = 0;
        int stackIn_42_7 = 0;
        int stackIn_42_8 = 0;
        int stackIn_42_9 = 0;
        int stackIn_42_10 = 0;
        int stackIn_42_11 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        boolean stackOut_34_4 = false;
        int stackOut_34_5 = 0;
        int stackOut_34_6 = 0;
        int stackOut_34_7 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_36_2 = 0;
        int stackOut_36_3 = 0;
        boolean stackOut_36_4 = false;
        int stackOut_36_5 = 0;
        int stackOut_36_6 = 0;
        int stackOut_36_7 = 0;
        int stackOut_36_8 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        boolean stackOut_35_4 = false;
        int stackOut_35_5 = 0;
        int stackOut_35_6 = 0;
        int stackOut_35_7 = 0;
        int stackOut_35_8 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        int stackOut_37_3 = 0;
        boolean stackOut_37_4 = false;
        int stackOut_37_5 = 0;
        int stackOut_37_6 = 0;
        int stackOut_37_7 = 0;
        int stackOut_37_8 = 0;
        int stackOut_37_9 = 0;
        int stackOut_37_10 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_38_2 = 0;
        int stackOut_38_3 = 0;
        boolean stackOut_38_4 = false;
        int stackOut_38_5 = 0;
        int stackOut_38_6 = 0;
        int stackOut_38_7 = 0;
        int stackOut_38_8 = 0;
        int stackOut_38_9 = 0;
        int stackOut_38_10 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_41_2 = 0;
        int stackOut_41_3 = 0;
        boolean stackOut_41_4 = false;
        int stackOut_41_5 = 0;
        int stackOut_41_6 = 0;
        int stackOut_41_7 = 0;
        int stackOut_41_8 = 0;
        int stackOut_41_9 = 0;
        int stackOut_41_10 = 0;
        int stackOut_41_11 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        int stackOut_39_2 = 0;
        int stackOut_39_3 = 0;
        boolean stackOut_39_4 = false;
        int stackOut_39_5 = 0;
        int stackOut_39_6 = 0;
        int stackOut_39_7 = 0;
        int stackOut_39_8 = 0;
        int stackOut_39_9 = 0;
        int stackOut_39_10 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        int stackOut_40_2 = 0;
        int stackOut_40_3 = 0;
        boolean stackOut_40_4 = false;
        int stackOut_40_5 = 0;
        int stackOut_40_6 = 0;
        int stackOut_40_7 = 0;
        int stackOut_40_8 = 0;
        int stackOut_40_9 = 0;
        int stackOut_40_10 = 0;
        int stackOut_40_11 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        int stackOut_19_3 = 0;
        boolean stackOut_19_4 = false;
        int stackOut_19_5 = 0;
        int stackOut_19_6 = 0;
        int stackOut_19_7 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        int stackOut_21_3 = 0;
        boolean stackOut_21_4 = false;
        int stackOut_21_5 = 0;
        int stackOut_21_6 = 0;
        int stackOut_21_7 = 0;
        int stackOut_21_8 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        int stackOut_20_3 = 0;
        boolean stackOut_20_4 = false;
        int stackOut_20_5 = 0;
        int stackOut_20_6 = 0;
        int stackOut_20_7 = 0;
        int stackOut_20_8 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        boolean stackOut_22_4 = false;
        int stackOut_22_5 = 0;
        int stackOut_22_6 = 0;
        int stackOut_22_7 = 0;
        int stackOut_22_8 = 0;
        int stackOut_22_9 = 0;
        int stackOut_22_10 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        boolean stackOut_23_4 = false;
        int stackOut_23_5 = 0;
        int stackOut_23_6 = 0;
        int stackOut_23_7 = 0;
        int stackOut_23_8 = 0;
        int stackOut_23_9 = 0;
        int stackOut_23_10 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        int stackOut_26_3 = 0;
        boolean stackOut_26_4 = false;
        int stackOut_26_5 = 0;
        int stackOut_26_6 = 0;
        int stackOut_26_7 = 0;
        int stackOut_26_8 = 0;
        int stackOut_26_9 = 0;
        int stackOut_26_10 = 0;
        int stackOut_26_11 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        boolean stackOut_24_4 = false;
        int stackOut_24_5 = 0;
        int stackOut_24_6 = 0;
        int stackOut_24_7 = 0;
        int stackOut_24_8 = 0;
        int stackOut_24_9 = 0;
        int stackOut_24_10 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        boolean stackOut_25_4 = false;
        int stackOut_25_5 = 0;
        int stackOut_25_6 = 0;
        int stackOut_25_7 = 0;
        int stackOut_25_8 = 0;
        int stackOut_25_9 = 0;
        int stackOut_25_10 = 0;
        int stackOut_25_11 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        boolean stackOut_3_4 = false;
        int stackOut_3_5 = 0;
        int stackOut_3_6 = 0;
        int stackOut_3_7 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        boolean stackOut_5_4 = false;
        int stackOut_5_5 = 0;
        int stackOut_5_6 = 0;
        int stackOut_5_7 = 0;
        int stackOut_5_8 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        boolean stackOut_4_4 = false;
        int stackOut_4_5 = 0;
        int stackOut_4_6 = 0;
        int stackOut_4_7 = 0;
        int stackOut_4_8 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        boolean stackOut_6_4 = false;
        int stackOut_6_5 = 0;
        int stackOut_6_6 = 0;
        int stackOut_6_7 = 0;
        int stackOut_6_8 = 0;
        int stackOut_6_9 = 0;
        int stackOut_6_10 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        boolean stackOut_7_4 = false;
        int stackOut_7_5 = 0;
        int stackOut_7_6 = 0;
        int stackOut_7_7 = 0;
        int stackOut_7_8 = 0;
        int stackOut_7_9 = 0;
        int stackOut_7_10 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        boolean stackOut_10_4 = false;
        int stackOut_10_5 = 0;
        int stackOut_10_6 = 0;
        int stackOut_10_7 = 0;
        int stackOut_10_8 = 0;
        int stackOut_10_9 = 0;
        int stackOut_10_10 = 0;
        int stackOut_10_11 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        boolean stackOut_8_4 = false;
        int stackOut_8_5 = 0;
        int stackOut_8_6 = 0;
        int stackOut_8_7 = 0;
        int stackOut_8_8 = 0;
        int stackOut_8_9 = 0;
        int stackOut_8_10 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        boolean stackOut_9_4 = false;
        int stackOut_9_5 = 0;
        int stackOut_9_6 = 0;
        int stackOut_9_7 = 0;
        int stackOut_9_8 = 0;
        int stackOut_9_9 = 0;
        int stackOut_9_10 = 0;
        int stackOut_9_11 = 0;
        L0: {
          nc.i(20579);
          if (param0 == -78) {
            break L0;
          } else {
            mi.a((byte) 66, true);
            break L0;
          }
        }
        if (pd.field_Rb != null) {
          if (g.a(param0 + 77, pd.field_Rb.field_Xb)) {
            L1: {
              var2 = 1;
              stackOut_34_0 = param0 + -46;
              stackOut_34_1 = 15;
              stackOut_34_2 = 14;
              stackOut_34_3 = 11;
              stackOut_34_4 = param1;
              stackOut_34_5 = fl.field_p;
              stackOut_34_6 = 13;
              stackOut_34_7 = 0;
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              stackIn_36_3 = stackOut_34_3;
              stackIn_36_4 = stackOut_34_4;
              stackIn_36_5 = stackOut_34_5;
              stackIn_36_6 = stackOut_34_6;
              stackIn_36_7 = stackOut_34_7;
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              stackIn_35_3 = stackOut_34_3;
              stackIn_35_4 = stackOut_34_4;
              stackIn_35_5 = stackOut_34_5;
              stackIn_35_6 = stackOut_34_6;
              stackIn_35_7 = stackOut_34_7;
              if (50 >= fl.field_n) {
                stackOut_36_0 = stackIn_36_0;
                stackOut_36_1 = stackIn_36_1;
                stackOut_36_2 = stackIn_36_2;
                stackOut_36_3 = stackIn_36_3;
                stackOut_36_4 = stackIn_36_4;
                stackOut_36_5 = stackIn_36_5;
                stackOut_36_6 = stackIn_36_6;
                stackOut_36_7 = stackIn_36_7;
                stackOut_36_8 = 0;
                stackIn_37_0 = stackOut_36_0;
                stackIn_37_1 = stackOut_36_1;
                stackIn_37_2 = stackOut_36_2;
                stackIn_37_3 = stackOut_36_3;
                stackIn_37_4 = stackOut_36_4;
                stackIn_37_5 = stackOut_36_5;
                stackIn_37_6 = stackOut_36_6;
                stackIn_37_7 = stackOut_36_7;
                stackIn_37_8 = stackOut_36_8;
                break L1;
              } else {
                stackOut_35_0 = stackIn_35_0;
                stackOut_35_1 = stackIn_35_1;
                stackOut_35_2 = stackIn_35_2;
                stackOut_35_3 = stackIn_35_3;
                stackOut_35_4 = stackIn_35_4;
                stackOut_35_5 = stackIn_35_5;
                stackOut_35_6 = stackIn_35_6;
                stackOut_35_7 = stackIn_35_7;
                stackOut_35_8 = 1;
                stackIn_37_0 = stackOut_35_0;
                stackIn_37_1 = stackOut_35_1;
                stackIn_37_2 = stackOut_35_2;
                stackIn_37_3 = stackOut_35_3;
                stackIn_37_4 = stackOut_35_4;
                stackIn_37_5 = stackOut_35_5;
                stackIn_37_6 = stackOut_35_6;
                stackIn_37_7 = stackOut_35_7;
                stackIn_37_8 = stackOut_35_8;
                break L1;
              }
            }
            L2: {
              L3: {
                stackOut_37_0 = stackIn_37_0;
                stackOut_37_1 = stackIn_37_1;
                stackOut_37_2 = stackIn_37_2;
                stackOut_37_3 = stackIn_37_3;
                stackOut_37_4 = stackIn_37_4;
                stackOut_37_5 = stackIn_37_5;
                stackOut_37_6 = stackIn_37_6;
                stackOut_37_7 = stackIn_37_7;
                stackOut_37_8 = stackIn_37_8;
                stackOut_37_9 = var2;
                stackOut_37_10 = 1;
                stackIn_40_0 = stackOut_37_0;
                stackIn_40_1 = stackOut_37_1;
                stackIn_40_2 = stackOut_37_2;
                stackIn_40_3 = stackOut_37_3;
                stackIn_40_4 = stackOut_37_4;
                stackIn_40_5 = stackOut_37_5;
                stackIn_40_6 = stackOut_37_6;
                stackIn_40_7 = stackOut_37_7;
                stackIn_40_8 = stackOut_37_8;
                stackIn_40_9 = stackOut_37_9;
                stackIn_40_10 = stackOut_37_10;
                stackIn_38_0 = stackOut_37_0;
                stackIn_38_1 = stackOut_37_1;
                stackIn_38_2 = stackOut_37_2;
                stackIn_38_3 = stackOut_37_3;
                stackIn_38_4 = stackOut_37_4;
                stackIn_38_5 = stackOut_37_5;
                stackIn_38_6 = stackOut_37_6;
                stackIn_38_7 = stackOut_37_7;
                stackIn_38_8 = stackOut_37_8;
                stackIn_38_9 = stackOut_37_9;
                stackIn_38_10 = stackOut_37_10;
                if (hj.field_i) {
                  break L3;
                } else {
                  stackOut_38_0 = stackIn_38_0;
                  stackOut_38_1 = stackIn_38_1;
                  stackOut_38_2 = stackIn_38_2;
                  stackOut_38_3 = stackIn_38_3;
                  stackOut_38_4 = stackIn_38_4;
                  stackOut_38_5 = stackIn_38_5;
                  stackOut_38_6 = stackIn_38_6;
                  stackOut_38_7 = stackIn_38_7;
                  stackOut_38_8 = stackIn_38_8;
                  stackOut_38_9 = stackIn_38_9;
                  stackOut_38_10 = stackIn_38_10;
                  stackIn_41_0 = stackOut_38_0;
                  stackIn_41_1 = stackOut_38_1;
                  stackIn_41_2 = stackOut_38_2;
                  stackIn_41_3 = stackOut_38_3;
                  stackIn_41_4 = stackOut_38_4;
                  stackIn_41_5 = stackOut_38_5;
                  stackIn_41_6 = stackOut_38_6;
                  stackIn_41_7 = stackOut_38_7;
                  stackIn_41_8 = stackOut_38_8;
                  stackIn_41_9 = stackOut_38_9;
                  stackIn_41_10 = stackOut_38_10;
                  stackIn_39_0 = stackOut_38_0;
                  stackIn_39_1 = stackOut_38_1;
                  stackIn_39_2 = stackOut_38_2;
                  stackIn_39_3 = stackOut_38_3;
                  stackIn_39_4 = stackOut_38_4;
                  stackIn_39_5 = stackOut_38_5;
                  stackIn_39_6 = stackOut_38_6;
                  stackIn_39_7 = stackOut_38_7;
                  stackIn_39_8 = stackOut_38_8;
                  stackIn_39_9 = stackOut_38_9;
                  stackIn_39_10 = stackOut_38_10;
                  if (!hl.field_h) {
                    stackOut_41_0 = stackIn_41_0;
                    stackOut_41_1 = stackIn_41_1;
                    stackOut_41_2 = stackIn_41_2;
                    stackOut_41_3 = stackIn_41_3;
                    stackOut_41_4 = stackIn_41_4;
                    stackOut_41_5 = stackIn_41_5;
                    stackOut_41_6 = stackIn_41_6;
                    stackOut_41_7 = stackIn_41_7;
                    stackOut_41_8 = stackIn_41_8;
                    stackOut_41_9 = stackIn_41_9;
                    stackOut_41_10 = stackIn_41_10;
                    stackOut_41_11 = 0;
                    stackIn_42_0 = stackOut_41_0;
                    stackIn_42_1 = stackOut_41_1;
                    stackIn_42_2 = stackOut_41_2;
                    stackIn_42_3 = stackOut_41_3;
                    stackIn_42_4 = stackOut_41_4;
                    stackIn_42_5 = stackOut_41_5;
                    stackIn_42_6 = stackOut_41_6;
                    stackIn_42_7 = stackOut_41_7;
                    stackIn_42_8 = stackOut_41_8;
                    stackIn_42_9 = stackOut_41_9;
                    stackIn_42_10 = stackOut_41_10;
                    stackIn_42_11 = stackOut_41_11;
                    break L2;
                  } else {
                    stackOut_39_0 = stackIn_39_0;
                    stackOut_39_1 = stackIn_39_1;
                    stackOut_39_2 = stackIn_39_2;
                    stackOut_39_3 = stackIn_39_3;
                    stackOut_39_4 = stackIn_39_4;
                    stackOut_39_5 = stackIn_39_5;
                    stackOut_39_6 = stackIn_39_6;
                    stackOut_39_7 = stackIn_39_7;
                    stackOut_39_8 = stackIn_39_8;
                    stackOut_39_9 = stackIn_39_9;
                    stackOut_39_10 = stackIn_39_10;
                    stackIn_40_0 = stackOut_39_0;
                    stackIn_40_1 = stackOut_39_1;
                    stackIn_40_2 = stackOut_39_2;
                    stackIn_40_3 = stackOut_39_3;
                    stackIn_40_4 = stackOut_39_4;
                    stackIn_40_5 = stackOut_39_5;
                    stackIn_40_6 = stackOut_39_6;
                    stackIn_40_7 = stackOut_39_7;
                    stackIn_40_8 = stackOut_39_8;
                    stackIn_40_9 = stackOut_39_9;
                    stackIn_40_10 = stackOut_39_10;
                    break L3;
                  }
                }
              }
              stackOut_40_0 = stackIn_40_0;
              stackOut_40_1 = stackIn_40_1;
              stackOut_40_2 = stackIn_40_2;
              stackOut_40_3 = stackIn_40_3;
              stackOut_40_4 = stackIn_40_4;
              stackOut_40_5 = stackIn_40_5;
              stackOut_40_6 = stackIn_40_6;
              stackOut_40_7 = stackIn_40_7;
              stackOut_40_8 = stackIn_40_8;
              stackOut_40_9 = stackIn_40_9;
              stackOut_40_10 = stackIn_40_10;
              stackOut_40_11 = 1;
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              stackIn_42_3 = stackOut_40_3;
              stackIn_42_4 = stackOut_40_4;
              stackIn_42_5 = stackOut_40_5;
              stackIn_42_6 = stackOut_40_6;
              stackIn_42_7 = stackOut_40_7;
              stackIn_42_8 = stackOut_40_8;
              stackIn_42_9 = stackOut_40_9;
              stackIn_42_10 = stackOut_40_10;
              stackIn_42_11 = stackOut_40_11;
              break L2;
            }
            L4: {
              bh.a(stackIn_42_0, stackIn_42_1, stackIn_42_2, stackIn_42_3, stackIn_42_4, stackIn_42_5, stackIn_42_6, stackIn_42_7, stackIn_42_8 != 0, stackIn_42_9 != 0, stackIn_42_10 != 0, stackIn_42_11 != 0);
              if (ob.field_w) {
                qn.field_U.f(57, param0 ^ 28);
                ob.field_w = false;
                break L4;
              } else {
                break L4;
              }
            }
            if (tg.field_p) {
              qn.field_U.f(10, -68);
              tg.field_p = false;
              return;
            } else {
              return;
            }
          } else {
            L5: {
              var2 = 0;
              stackOut_19_0 = param0 + -46;
              stackOut_19_1 = 15;
              stackOut_19_2 = 14;
              stackOut_19_3 = 11;
              stackOut_19_4 = param1;
              stackOut_19_5 = fl.field_p;
              stackOut_19_6 = 13;
              stackOut_19_7 = 0;
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              stackIn_21_3 = stackOut_19_3;
              stackIn_21_4 = stackOut_19_4;
              stackIn_21_5 = stackOut_19_5;
              stackIn_21_6 = stackOut_19_6;
              stackIn_21_7 = stackOut_19_7;
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              stackIn_20_3 = stackOut_19_3;
              stackIn_20_4 = stackOut_19_4;
              stackIn_20_5 = stackOut_19_5;
              stackIn_20_6 = stackOut_19_6;
              stackIn_20_7 = stackOut_19_7;
              if (50 >= fl.field_n) {
                stackOut_21_0 = stackIn_21_0;
                stackOut_21_1 = stackIn_21_1;
                stackOut_21_2 = stackIn_21_2;
                stackOut_21_3 = stackIn_21_3;
                stackOut_21_4 = stackIn_21_4;
                stackOut_21_5 = stackIn_21_5;
                stackOut_21_6 = stackIn_21_6;
                stackOut_21_7 = stackIn_21_7;
                stackOut_21_8 = 0;
                stackIn_22_0 = stackOut_21_0;
                stackIn_22_1 = stackOut_21_1;
                stackIn_22_2 = stackOut_21_2;
                stackIn_22_3 = stackOut_21_3;
                stackIn_22_4 = stackOut_21_4;
                stackIn_22_5 = stackOut_21_5;
                stackIn_22_6 = stackOut_21_6;
                stackIn_22_7 = stackOut_21_7;
                stackIn_22_8 = stackOut_21_8;
                break L5;
              } else {
                stackOut_20_0 = stackIn_20_0;
                stackOut_20_1 = stackIn_20_1;
                stackOut_20_2 = stackIn_20_2;
                stackOut_20_3 = stackIn_20_3;
                stackOut_20_4 = stackIn_20_4;
                stackOut_20_5 = stackIn_20_5;
                stackOut_20_6 = stackIn_20_6;
                stackOut_20_7 = stackIn_20_7;
                stackOut_20_8 = 1;
                stackIn_22_0 = stackOut_20_0;
                stackIn_22_1 = stackOut_20_1;
                stackIn_22_2 = stackOut_20_2;
                stackIn_22_3 = stackOut_20_3;
                stackIn_22_4 = stackOut_20_4;
                stackIn_22_5 = stackOut_20_5;
                stackIn_22_6 = stackOut_20_6;
                stackIn_22_7 = stackOut_20_7;
                stackIn_22_8 = stackOut_20_8;
                break L5;
              }
            }
            L6: {
              L7: {
                stackOut_22_0 = stackIn_22_0;
                stackOut_22_1 = stackIn_22_1;
                stackOut_22_2 = stackIn_22_2;
                stackOut_22_3 = stackIn_22_3;
                stackOut_22_4 = stackIn_22_4;
                stackOut_22_5 = stackIn_22_5;
                stackOut_22_6 = stackIn_22_6;
                stackOut_22_7 = stackIn_22_7;
                stackOut_22_8 = stackIn_22_8;
                stackOut_22_9 = var2;
                stackOut_22_10 = 1;
                stackIn_25_0 = stackOut_22_0;
                stackIn_25_1 = stackOut_22_1;
                stackIn_25_2 = stackOut_22_2;
                stackIn_25_3 = stackOut_22_3;
                stackIn_25_4 = stackOut_22_4;
                stackIn_25_5 = stackOut_22_5;
                stackIn_25_6 = stackOut_22_6;
                stackIn_25_7 = stackOut_22_7;
                stackIn_25_8 = stackOut_22_8;
                stackIn_25_9 = stackOut_22_9;
                stackIn_25_10 = stackOut_22_10;
                stackIn_23_0 = stackOut_22_0;
                stackIn_23_1 = stackOut_22_1;
                stackIn_23_2 = stackOut_22_2;
                stackIn_23_3 = stackOut_22_3;
                stackIn_23_4 = stackOut_22_4;
                stackIn_23_5 = stackOut_22_5;
                stackIn_23_6 = stackOut_22_6;
                stackIn_23_7 = stackOut_22_7;
                stackIn_23_8 = stackOut_22_8;
                stackIn_23_9 = stackOut_22_9;
                stackIn_23_10 = stackOut_22_10;
                if (hj.field_i) {
                  break L7;
                } else {
                  stackOut_23_0 = stackIn_23_0;
                  stackOut_23_1 = stackIn_23_1;
                  stackOut_23_2 = stackIn_23_2;
                  stackOut_23_3 = stackIn_23_3;
                  stackOut_23_4 = stackIn_23_4;
                  stackOut_23_5 = stackIn_23_5;
                  stackOut_23_6 = stackIn_23_6;
                  stackOut_23_7 = stackIn_23_7;
                  stackOut_23_8 = stackIn_23_8;
                  stackOut_23_9 = stackIn_23_9;
                  stackOut_23_10 = stackIn_23_10;
                  stackIn_26_0 = stackOut_23_0;
                  stackIn_26_1 = stackOut_23_1;
                  stackIn_26_2 = stackOut_23_2;
                  stackIn_26_3 = stackOut_23_3;
                  stackIn_26_4 = stackOut_23_4;
                  stackIn_26_5 = stackOut_23_5;
                  stackIn_26_6 = stackOut_23_6;
                  stackIn_26_7 = stackOut_23_7;
                  stackIn_26_8 = stackOut_23_8;
                  stackIn_26_9 = stackOut_23_9;
                  stackIn_26_10 = stackOut_23_10;
                  stackIn_24_0 = stackOut_23_0;
                  stackIn_24_1 = stackOut_23_1;
                  stackIn_24_2 = stackOut_23_2;
                  stackIn_24_3 = stackOut_23_3;
                  stackIn_24_4 = stackOut_23_4;
                  stackIn_24_5 = stackOut_23_5;
                  stackIn_24_6 = stackOut_23_6;
                  stackIn_24_7 = stackOut_23_7;
                  stackIn_24_8 = stackOut_23_8;
                  stackIn_24_9 = stackOut_23_9;
                  stackIn_24_10 = stackOut_23_10;
                  if (!hl.field_h) {
                    stackOut_26_0 = stackIn_26_0;
                    stackOut_26_1 = stackIn_26_1;
                    stackOut_26_2 = stackIn_26_2;
                    stackOut_26_3 = stackIn_26_3;
                    stackOut_26_4 = stackIn_26_4;
                    stackOut_26_5 = stackIn_26_5;
                    stackOut_26_6 = stackIn_26_6;
                    stackOut_26_7 = stackIn_26_7;
                    stackOut_26_8 = stackIn_26_8;
                    stackOut_26_9 = stackIn_26_9;
                    stackOut_26_10 = stackIn_26_10;
                    stackOut_26_11 = 0;
                    stackIn_27_0 = stackOut_26_0;
                    stackIn_27_1 = stackOut_26_1;
                    stackIn_27_2 = stackOut_26_2;
                    stackIn_27_3 = stackOut_26_3;
                    stackIn_27_4 = stackOut_26_4;
                    stackIn_27_5 = stackOut_26_5;
                    stackIn_27_6 = stackOut_26_6;
                    stackIn_27_7 = stackOut_26_7;
                    stackIn_27_8 = stackOut_26_8;
                    stackIn_27_9 = stackOut_26_9;
                    stackIn_27_10 = stackOut_26_10;
                    stackIn_27_11 = stackOut_26_11;
                    break L6;
                  } else {
                    stackOut_24_0 = stackIn_24_0;
                    stackOut_24_1 = stackIn_24_1;
                    stackOut_24_2 = stackIn_24_2;
                    stackOut_24_3 = stackIn_24_3;
                    stackOut_24_4 = stackIn_24_4;
                    stackOut_24_5 = stackIn_24_5;
                    stackOut_24_6 = stackIn_24_6;
                    stackOut_24_7 = stackIn_24_7;
                    stackOut_24_8 = stackIn_24_8;
                    stackOut_24_9 = stackIn_24_9;
                    stackOut_24_10 = stackIn_24_10;
                    stackIn_25_0 = stackOut_24_0;
                    stackIn_25_1 = stackOut_24_1;
                    stackIn_25_2 = stackOut_24_2;
                    stackIn_25_3 = stackOut_24_3;
                    stackIn_25_4 = stackOut_24_4;
                    stackIn_25_5 = stackOut_24_5;
                    stackIn_25_6 = stackOut_24_6;
                    stackIn_25_7 = stackOut_24_7;
                    stackIn_25_8 = stackOut_24_8;
                    stackIn_25_9 = stackOut_24_9;
                    stackIn_25_10 = stackOut_24_10;
                    break L7;
                  }
                }
              }
              stackOut_25_0 = stackIn_25_0;
              stackOut_25_1 = stackIn_25_1;
              stackOut_25_2 = stackIn_25_2;
              stackOut_25_3 = stackIn_25_3;
              stackOut_25_4 = stackIn_25_4;
              stackOut_25_5 = stackIn_25_5;
              stackOut_25_6 = stackIn_25_6;
              stackOut_25_7 = stackIn_25_7;
              stackOut_25_8 = stackIn_25_8;
              stackOut_25_9 = stackIn_25_9;
              stackOut_25_10 = stackIn_25_10;
              stackOut_25_11 = 1;
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              stackIn_27_3 = stackOut_25_3;
              stackIn_27_4 = stackOut_25_4;
              stackIn_27_5 = stackOut_25_5;
              stackIn_27_6 = stackOut_25_6;
              stackIn_27_7 = stackOut_25_7;
              stackIn_27_8 = stackOut_25_8;
              stackIn_27_9 = stackOut_25_9;
              stackIn_27_10 = stackOut_25_10;
              stackIn_27_11 = stackOut_25_11;
              break L6;
            }
            L8: {
              bh.a(stackIn_27_0, stackIn_27_1, stackIn_27_2, stackIn_27_3, stackIn_27_4, stackIn_27_5, stackIn_27_6, stackIn_27_7, stackIn_27_8 != 0, stackIn_27_9 != 0, stackIn_27_10 != 0, stackIn_27_11 != 0);
              if (ob.field_w) {
                qn.field_U.f(57, param0 ^ 28);
                ob.field_w = false;
                break L8;
              } else {
                break L8;
              }
            }
            if (tg.field_p) {
              qn.field_U.f(10, -68);
              tg.field_p = false;
              return;
            } else {
              return;
            }
          }
        } else {
          L9: {
            var2 = 0;
            stackOut_3_0 = param0 + -46;
            stackOut_3_1 = 15;
            stackOut_3_2 = 14;
            stackOut_3_3 = 11;
            stackOut_3_4 = param1;
            stackOut_3_5 = fl.field_p;
            stackOut_3_6 = 13;
            stackOut_3_7 = 0;
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_5_2 = stackOut_3_2;
            stackIn_5_3 = stackOut_3_3;
            stackIn_5_4 = stackOut_3_4;
            stackIn_5_5 = stackOut_3_5;
            stackIn_5_6 = stackOut_3_6;
            stackIn_5_7 = stackOut_3_7;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            stackIn_4_2 = stackOut_3_2;
            stackIn_4_3 = stackOut_3_3;
            stackIn_4_4 = stackOut_3_4;
            stackIn_4_5 = stackOut_3_5;
            stackIn_4_6 = stackOut_3_6;
            stackIn_4_7 = stackOut_3_7;
            if (50 >= fl.field_n) {
              stackOut_5_0 = stackIn_5_0;
              stackOut_5_1 = stackIn_5_1;
              stackOut_5_2 = stackIn_5_2;
              stackOut_5_3 = stackIn_5_3;
              stackOut_5_4 = stackIn_5_4;
              stackOut_5_5 = stackIn_5_5;
              stackOut_5_6 = stackIn_5_6;
              stackOut_5_7 = stackIn_5_7;
              stackOut_5_8 = 0;
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              stackIn_6_3 = stackOut_5_3;
              stackIn_6_4 = stackOut_5_4;
              stackIn_6_5 = stackOut_5_5;
              stackIn_6_6 = stackOut_5_6;
              stackIn_6_7 = stackOut_5_7;
              stackIn_6_8 = stackOut_5_8;
              break L9;
            } else {
              stackOut_4_0 = stackIn_4_0;
              stackOut_4_1 = stackIn_4_1;
              stackOut_4_2 = stackIn_4_2;
              stackOut_4_3 = stackIn_4_3;
              stackOut_4_4 = stackIn_4_4;
              stackOut_4_5 = stackIn_4_5;
              stackOut_4_6 = stackIn_4_6;
              stackOut_4_7 = stackIn_4_7;
              stackOut_4_8 = 1;
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              stackIn_6_3 = stackOut_4_3;
              stackIn_6_4 = stackOut_4_4;
              stackIn_6_5 = stackOut_4_5;
              stackIn_6_6 = stackOut_4_6;
              stackIn_6_7 = stackOut_4_7;
              stackIn_6_8 = stackOut_4_8;
              break L9;
            }
          }
          L10: {
            L11: {
              stackOut_6_0 = stackIn_6_0;
              stackOut_6_1 = stackIn_6_1;
              stackOut_6_2 = stackIn_6_2;
              stackOut_6_3 = stackIn_6_3;
              stackOut_6_4 = stackIn_6_4;
              stackOut_6_5 = stackIn_6_5;
              stackOut_6_6 = stackIn_6_6;
              stackOut_6_7 = stackIn_6_7;
              stackOut_6_8 = stackIn_6_8;
              stackOut_6_9 = var2;
              stackOut_6_10 = 1;
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              stackIn_9_3 = stackOut_6_3;
              stackIn_9_4 = stackOut_6_4;
              stackIn_9_5 = stackOut_6_5;
              stackIn_9_6 = stackOut_6_6;
              stackIn_9_7 = stackOut_6_7;
              stackIn_9_8 = stackOut_6_8;
              stackIn_9_9 = stackOut_6_9;
              stackIn_9_10 = stackOut_6_10;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              stackIn_7_3 = stackOut_6_3;
              stackIn_7_4 = stackOut_6_4;
              stackIn_7_5 = stackOut_6_5;
              stackIn_7_6 = stackOut_6_6;
              stackIn_7_7 = stackOut_6_7;
              stackIn_7_8 = stackOut_6_8;
              stackIn_7_9 = stackOut_6_9;
              stackIn_7_10 = stackOut_6_10;
              if (hj.field_i) {
                break L11;
              } else {
                stackOut_7_0 = stackIn_7_0;
                stackOut_7_1 = stackIn_7_1;
                stackOut_7_2 = stackIn_7_2;
                stackOut_7_3 = stackIn_7_3;
                stackOut_7_4 = stackIn_7_4;
                stackOut_7_5 = stackIn_7_5;
                stackOut_7_6 = stackIn_7_6;
                stackOut_7_7 = stackIn_7_7;
                stackOut_7_8 = stackIn_7_8;
                stackOut_7_9 = stackIn_7_9;
                stackOut_7_10 = stackIn_7_10;
                stackIn_10_0 = stackOut_7_0;
                stackIn_10_1 = stackOut_7_1;
                stackIn_10_2 = stackOut_7_2;
                stackIn_10_3 = stackOut_7_3;
                stackIn_10_4 = stackOut_7_4;
                stackIn_10_5 = stackOut_7_5;
                stackIn_10_6 = stackOut_7_6;
                stackIn_10_7 = stackOut_7_7;
                stackIn_10_8 = stackOut_7_8;
                stackIn_10_9 = stackOut_7_9;
                stackIn_10_10 = stackOut_7_10;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                stackIn_8_2 = stackOut_7_2;
                stackIn_8_3 = stackOut_7_3;
                stackIn_8_4 = stackOut_7_4;
                stackIn_8_5 = stackOut_7_5;
                stackIn_8_6 = stackOut_7_6;
                stackIn_8_7 = stackOut_7_7;
                stackIn_8_8 = stackOut_7_8;
                stackIn_8_9 = stackOut_7_9;
                stackIn_8_10 = stackOut_7_10;
                if (!hl.field_h) {
                  stackOut_10_0 = stackIn_10_0;
                  stackOut_10_1 = stackIn_10_1;
                  stackOut_10_2 = stackIn_10_2;
                  stackOut_10_3 = stackIn_10_3;
                  stackOut_10_4 = stackIn_10_4;
                  stackOut_10_5 = stackIn_10_5;
                  stackOut_10_6 = stackIn_10_6;
                  stackOut_10_7 = stackIn_10_7;
                  stackOut_10_8 = stackIn_10_8;
                  stackOut_10_9 = stackIn_10_9;
                  stackOut_10_10 = stackIn_10_10;
                  stackOut_10_11 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  stackIn_11_2 = stackOut_10_2;
                  stackIn_11_3 = stackOut_10_3;
                  stackIn_11_4 = stackOut_10_4;
                  stackIn_11_5 = stackOut_10_5;
                  stackIn_11_6 = stackOut_10_6;
                  stackIn_11_7 = stackOut_10_7;
                  stackIn_11_8 = stackOut_10_8;
                  stackIn_11_9 = stackOut_10_9;
                  stackIn_11_10 = stackOut_10_10;
                  stackIn_11_11 = stackOut_10_11;
                  break L10;
                } else {
                  stackOut_8_0 = stackIn_8_0;
                  stackOut_8_1 = stackIn_8_1;
                  stackOut_8_2 = stackIn_8_2;
                  stackOut_8_3 = stackIn_8_3;
                  stackOut_8_4 = stackIn_8_4;
                  stackOut_8_5 = stackIn_8_5;
                  stackOut_8_6 = stackIn_8_6;
                  stackOut_8_7 = stackIn_8_7;
                  stackOut_8_8 = stackIn_8_8;
                  stackOut_8_9 = stackIn_8_9;
                  stackOut_8_10 = stackIn_8_10;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  stackIn_9_3 = stackOut_8_3;
                  stackIn_9_4 = stackOut_8_4;
                  stackIn_9_5 = stackOut_8_5;
                  stackIn_9_6 = stackOut_8_6;
                  stackIn_9_7 = stackOut_8_7;
                  stackIn_9_8 = stackOut_8_8;
                  stackIn_9_9 = stackOut_8_9;
                  stackIn_9_10 = stackOut_8_10;
                  break L11;
                }
              }
            }
            stackOut_9_0 = stackIn_9_0;
            stackOut_9_1 = stackIn_9_1;
            stackOut_9_2 = stackIn_9_2;
            stackOut_9_3 = stackIn_9_3;
            stackOut_9_4 = stackIn_9_4;
            stackOut_9_5 = stackIn_9_5;
            stackOut_9_6 = stackIn_9_6;
            stackOut_9_7 = stackIn_9_7;
            stackOut_9_8 = stackIn_9_8;
            stackOut_9_9 = stackIn_9_9;
            stackOut_9_10 = stackIn_9_10;
            stackOut_9_11 = 1;
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_11_2 = stackOut_9_2;
            stackIn_11_3 = stackOut_9_3;
            stackIn_11_4 = stackOut_9_4;
            stackIn_11_5 = stackOut_9_5;
            stackIn_11_6 = stackOut_9_6;
            stackIn_11_7 = stackOut_9_7;
            stackIn_11_8 = stackOut_9_8;
            stackIn_11_9 = stackOut_9_9;
            stackIn_11_10 = stackOut_9_10;
            stackIn_11_11 = stackOut_9_11;
            break L10;
          }
          L12: {
            bh.a(stackIn_11_0, stackIn_11_1, stackIn_11_2, stackIn_11_3, stackIn_11_4, stackIn_11_5, stackIn_11_6, stackIn_11_7, stackIn_11_8 != 0, stackIn_11_9 != 0, stackIn_11_10 != 0, stackIn_11_11 != 0);
            if (ob.field_w) {
              qn.field_U.f(57, param0 ^ 28);
              ob.field_w = false;
              break L12;
            } else {
              break L12;
            }
          }
          if (tg.field_p) {
            qn.field_U.f(10, -68);
            tg.field_p = false;
            return;
          } else {
            return;
          }
        }
    }

    final int d() {
        return 0;
    }

    public static void c(byte param0) {
        field_t = null;
        field_o = null;
        field_s = null;
        field_q = null;
        field_n = null;
        field_u = null;
        if (param0 >= 42) {
          return;
        } else {
          mi.a((byte) -41, true);
          return;
        }
    }

    final nm a() {
        qd var1 = null;
        var1 = (qd) (Object) ((mi) this).field_x.g(-18110);
        if (var1 != null) {
          if (var1.field_j != null) {
            return (nm) (Object) var1.field_j;
          } else {
            return ((mi) this).b();
          }
        } else {
          return null;
        }
    }

    final nm b() {
        qd var1_ref = null;
        int var2 = Chess.field_G;
        do {
            var1_ref = (qd) (Object) ((mi) this).field_x.a((byte) -125);
            if (var1_ref == null) {
                return null;
            }
        } while (var1_ref.field_j == null);
        return (nm) (Object) var1_ref.field_j;
    }

    final void a(int param0) {
        int var2 = 0;
        qd var3 = null;
        int var4 = 0;
        var4 = Chess.field_G;
        ((mi) this).field_p.a(param0);
        var3 = (qd) (Object) ((mi) this).field_x.g(-18110);
        L0: while (true) {
          if (var3 != null) {
            L1: {
              if (((mi) this).field_w.a((byte) -25, var3)) {
                break L1;
              } else {
                var2 = param0;
                L2: while (true) {
                  if (var2 <= var3.field_B) {
                    this.a(32, var2, var3);
                    var3.field_B = var3.field_B - var2;
                    break L1;
                  } else {
                    this.a(54, var3.field_B, var3);
                    var2 = var2 - var3.field_B;
                    if (!((mi) this).field_w.a(35, var2, (int[]) null, 0, var3)) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            var3 = (qd) (Object) ((mi) this).field_x.a((byte) -127);
            continue L0;
          } else {
            return;
          }
        }
    }

    mi(vl param0) {
        ((mi) this).field_x = new jc();
        ((mi) this).field_p = new lb();
        ((mi) this).field_w = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "New Game";
        field_v = 0;
        field_u = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_r = 0;
        field_o = "Your email address is used to identify this account";
        field_s = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
