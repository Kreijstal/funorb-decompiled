/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb extends pk {
    static String field_t;
    int field_w;
    static int field_y;
    boolean field_C;
    int field_M;
    int field_H;
    private int field_u;
    private int field_v;
    static String field_G;
    private int field_A;
    private int field_L;
    int field_I;
    int field_r;
    private int field_z;
    private int field_E;
    private int field_m;
    String field_q;
    private int field_x;
    private int field_p;
    private int[] field_n;
    int field_B;
    lh field_J;
    private int field_s;
    private int field_F;
    private int field_o;
    int field_K;
    int field_N;
    private int field_O;
    private int field_D;

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        wb.a(((eb) this).field_i, ((eb) this).field_k, ((eb) this).field_l, ((eb) this).field_c, -1 + (((eb) this).field_c >> 1), param8, param5);
        int var11 = ((eb) this).field_c + -(((eb) this).field_K << 1);
        wb.a(((eb) this).field_K + ((eb) this).field_i, ((eb) this).field_k - -((eb) this).field_K, ((eb) this).field_l + -(((eb) this).field_K << 1), var11, (var11 >> 1) + -1, param4, param3);
        wb.b(((eb) this).field_n);
        wb.b(((eb) this).field_i, ((eb) this).field_k, ((eb) this).field_i - -((eb) this).field_l, ((eb) this).field_k - -((eb) this).field_c);
        int discarded$0 = ((eb) this).field_J.a(((eb) this).field_q, param0 + ((eb) this).field_i, ((eb) this).field_k - -param1, ((eb) this).field_l, ((eb) this).field_c, param9, param7, param2, ((eb) this).field_m, ((eb) this).field_L, ((eb) this).field_x);
        wb.a(((eb) this).field_n);
    }

    public static void a(int param0) {
        field_G = null;
        if (param0 != -29115) {
            return;
        }
        field_t = null;
    }

    final static void a(int param0, int param1, int param2) {
        int var5 = 0;
        var5 = Chess.field_G;
        if (0 == param0) {
          if (param1 == 0) {
            if (param1 != 1) {
              if (param1 != 6) {
                if (param1 == 5) {
                  wf.a(um.field_l[1], 44);
                  return;
                } else {
                  wf.a(um.field_l[2], 104);
                  return;
                }
              } else {
                wf.a(um.field_l[1], 44);
                return;
              }
            } else {
              wf.a(um.field_l[3], -65);
              return;
            }
          } else {
            wf.a(um.field_l[8], 114);
            return;
          }
        } else {
          ib.field_a = bc.field_b;
          rf.b(80, bc.field_b / 3);
          mf.a(gl.field_b, 0);
          return;
        }
    }

    final void c(byte param0) {
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        Object stackOut_18_0 = null;
        Object stackOut_19_0 = null;
        Object stackOut_20_0 = null;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        Object stackOut_23_0 = null;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_6_0 = null;
        Object stackOut_7_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        if (param0 == -95) {
          if (((eb) this).field_e) {
            if (!((eb) this).field_C) {
              ((eb) this).field_f = false;
              ((eb) this).field_d = false;
              return;
            } else {
              L0: {
                L1: {
                  stackOut_18_0 = this;
                  stackIn_22_0 = stackOut_18_0;
                  stackIn_19_0 = stackOut_18_0;
                  if (!((eb) this).a((byte) -9)) {
                    break L1;
                  } else {
                    stackOut_19_0 = this;
                    stackIn_22_0 = stackOut_19_0;
                    stackIn_20_0 = stackOut_19_0;
                    if (wh.field_f != 0) {
                      break L1;
                    } else {
                      stackOut_20_0 = this;
                      stackIn_22_0 = stackOut_20_0;
                      stackIn_21_0 = stackOut_20_0;
                      if (!((eb) this).field_f) {
                        break L1;
                      } else {
                        stackOut_21_0 = this;
                        stackOut_21_1 = 1;
                        stackIn_23_0 = stackOut_21_0;
                        stackIn_23_1 = stackOut_21_1;
                        break L0;
                      }
                    }
                  }
                }
                stackOut_22_0 = this;
                stackOut_22_1 = 0;
                stackIn_23_0 = stackOut_22_0;
                stackIn_23_1 = stackOut_22_1;
                break L0;
              }
              L2: {
                ((eb) this).field_d = stackIn_23_1 != 0;
                stackOut_23_0 = this;
                stackIn_25_0 = stackOut_23_0;
                stackIn_24_0 = stackOut_23_0;
                if (wh.field_f == 0) {
                  stackOut_25_0 = this;
                  stackOut_25_1 = 0;
                  stackIn_26_0 = stackOut_25_0;
                  stackIn_26_1 = stackOut_25_1;
                  break L2;
                } else {
                  stackOut_24_0 = this;
                  stackOut_24_1 = 1;
                  stackIn_26_0 = stackOut_24_0;
                  stackIn_26_1 = stackOut_24_1;
                  break L2;
                }
              }
              ((eb) this).field_f = stackIn_26_1 != 0;
              return;
            }
          } else {
            ((eb) this).field_f = false;
            ((eb) this).field_d = false;
            return;
          }
        } else {
          eb.a(8);
          if (((eb) this).field_e) {
            if (((eb) this).field_C) {
              L3: {
                L4: {
                  stackOut_5_0 = this;
                  stackIn_9_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (!((eb) this).a((byte) -9)) {
                    break L4;
                  } else {
                    stackOut_6_0 = this;
                    stackIn_9_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (wh.field_f != 0) {
                      break L4;
                    } else {
                      stackOut_7_0 = this;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_8_0 = stackOut_7_0;
                      if (!((eb) this).field_f) {
                        break L4;
                      } else {
                        stackOut_8_0 = this;
                        stackOut_8_1 = 1;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        break L3;
                      }
                    }
                  }
                }
                stackOut_9_0 = this;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L3;
              }
              L5: {
                ((eb) this).field_d = stackIn_10_1 != 0;
                stackOut_10_0 = this;
                stackIn_12_0 = stackOut_10_0;
                stackIn_11_0 = stackOut_10_0;
                if (wh.field_f == 0) {
                  stackOut_12_0 = this;
                  stackOut_12_1 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  break L5;
                } else {
                  stackOut_11_0 = this;
                  stackOut_11_1 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  break L5;
                }
              }
              ((eb) this).field_f = stackIn_13_1 != 0;
              return;
            } else {
              ((eb) this).field_f = false;
              ((eb) this).field_d = false;
              return;
            }
          } else {
            ((eb) this).field_f = false;
            ((eb) this).field_d = false;
            return;
          }
        }
    }

    final void d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Chess.field_G;
        if (((eb) this).field_C) {
          if (((eb) this).field_J != null) {
            if (null != ((eb) this).field_q) {
              var9 = 56 % ((-64 - param0) / 58);
              if (((eb) this).a((byte) -9)) {
                if (wh.field_f != 0) {
                  var5 = bk.field_k & ((eb) this).field_u;
                  var2 = ((eb) this).field_p & bk.field_k;
                  var4 = ((eb) this).field_E;
                  var3 = ((eb) this).field_p >>> uc.field_d;
                  var7 = bk.field_k & ((eb) this).field_N;
                  var6 = ((eb) this).field_u >>> uc.field_d;
                  var10 = ((eb) this).field_v;
                  var11 = ((eb) this).field_w;
                  var8 = ((eb) this).field_N >>> uc.field_d;
                  this.a(var10, var11, var3, var6, var5, var8, 12054, var4, var7, var2);
                  return;
                } else {
                  var5 = ((eb) this).field_o & bk.field_k;
                  var2 = bk.field_k & ((eb) this).field_D;
                  var4 = ((eb) this).field_O;
                  var3 = ((eb) this).field_D >>> uc.field_d;
                  var6 = ((eb) this).field_o >>> uc.field_d;
                  var7 = bk.field_k & ((eb) this).field_s;
                  var11 = ((eb) this).field_I;
                  var10 = ((eb) this).field_A;
                  var8 = ((eb) this).field_s >>> uc.field_d;
                  this.a(var10, var11, var3, var6, var5, var8, 12054, var4, var7, var2);
                  return;
                }
              } else {
                var5 = ((eb) this).field_z & bk.field_k;
                var3 = ((eb) this).field_B >>> uc.field_d;
                var4 = ((eb) this).field_M;
                var2 = bk.field_k & ((eb) this).field_B;
                var6 = ((eb) this).field_z >>> uc.field_d;
                var7 = bk.field_k & ((eb) this).field_H;
                var8 = ((eb) this).field_H >>> uc.field_d;
                var10 = ((eb) this).field_F;
                var11 = ((eb) this).field_r;
                this.a(var10, var11, var3, var6, var5, var8, 12054, var4, var7, var2);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static boolean a(CharSequence param0) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
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
            int discarded$4 = 0;
            int discarded$5 = 5;
            stackOut_2_0 = fh.a(param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("eb.H(");
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
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + -1 + ')');
        }
        return stackIn_3_0;
    }

    eb(int param0, int param1, int param2, int param3, String param4) {
        ((eb) this).field_v = 0;
        ((eb) this).field_z = -2147483647;
        ((eb) this).field_x = 0;
        ((eb) this).field_E = -1;
        ((eb) this).field_H = -1;
        ((eb) this).field_p = -1;
        ((eb) this).field_C = true;
        ((eb) this).field_u = -16777215;
        ((eb) this).field_r = 0;
        ((eb) this).field_M = -1;
        ((eb) this).field_B = -1;
        ((eb) this).field_s = -2130706433;
        ((eb) this).field_w = 0;
        ((eb) this).field_L = 1;
        ((eb) this).field_F = 0;
        ((eb) this).field_I = 0;
        ((eb) this).field_N = -2130706433;
        ((eb) this).field_n = new int[4];
        ((eb) this).field_m = 1;
        ((eb) this).field_A = 0;
        ((eb) this).field_o = -2147483647;
        ((eb) this).field_D = -1;
        ((eb) this).field_O = -1;
        ((eb) this).field_K = 2;
        try {
            ((eb) this).field_c = param3;
            ((eb) this).field_l = param2;
            ((eb) this).field_q = param4;
            ((eb) this).field_k = param1;
            ((eb) this).field_i = param0;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "eb.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Searching for an opponent";
        field_G = "This option cannot be combined with the current settings for:  ";
    }
}
