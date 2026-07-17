/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ee extends hl {
    boolean field_z;
    static int field_n;
    float field_x;
    qm field_A;
    float field_t;
    float field_j;
    static String field_o;
    int field_s;
    int field_k;
    int field_v;
    int field_m;
    int field_q;
    int field_B;
    float field_r;
    int field_i;
    in field_w;
    int field_l;
    float field_y;
    boolean field_p;
    float field_u;

    private final void a(float param0, byte param1, int param2, float param3, float param4) {
        ((ee) this).field_y = param3;
        if (param1 <= 35) {
          return;
        } else {
          ((ee) this).field_u = param0;
          ((ee) this).field_r = param4;
          ((ee) this).field_A = new qm((int)((ee) this).field_y, (int)((ee) this).field_u);
          ((ee) this).field_v = -1;
          ((ee) this).field_q = param2;
          ((ee) this).field_s = -1;
          ((ee) this).field_l = -1;
          ((ee) this).field_m = -1;
          ((ee) this).field_w = new in(((ee) this).field_r);
          ((ee) this).field_z = false;
          ((ee) this).field_j = 0.0f;
          ((ee) this).field_t = 0.0f;
          ((ee) this).field_x = 0.0f;
          return;
        }
    }

    public static void e(int param0) {
        field_o = null;
        if (param0 == 0) {
            return;
        }
        ee.e(-50);
    }

    final void a(int param0, wd[] param1) {
        RuntimeException var3 = null;
        float var3_float = 0.0f;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var6 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var3_float = ka.a(((ee) this).field_q, 77, ((ee) this).field_A, param1);
              if ((float)param0 == var3_float) {
                break L1;
              } else {
                L2: {
                  ((ee) this).field_v = (int)var3_float;
                  if (((ee) this).field_v == param1.length) {
                    ((ee) this).field_v = 0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var4 = 0;
                L3: while (true) {
                  L4: {
                    var4++;
                    if (var4 >= param1.length) {
                      break L4;
                    } else {
                      L5: {
                        var5 = var4 + ((ee) this).field_v;
                        if (param1.length <= var5) {
                          var5 = var5 - param1.length;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      if (hl.a(false, ((ee) this).field_q, (wc) (Object) param1[var5], ((ee) this).field_A)) {
                        ((ee) this).field_m = var5;
                        break L4;
                      } else {
                        continue L3;
                      }
                    }
                  }
                  L6: while (true) {
                    L7: {
                      var4++;
                      if (param1.length <= var4) {
                        break L7;
                      } else {
                        L8: {
                          var5 = var4 + ((ee) this).field_v;
                          if (var5 < param1.length) {
                            break L8;
                          } else {
                            var5 = var5 - param1.length;
                            break L8;
                          }
                        }
                        if (!hl.a(false, ((ee) this).field_q, (wc) (Object) param1[var5], ((ee) this).field_A)) {
                          continue L6;
                        } else {
                          ((ee) this).field_l = var5;
                          break L7;
                        }
                      }
                    }
                    L9: while (true) {
                      var4++;
                      if (param1.length <= var4) {
                        break L1;
                      } else {
                        L10: {
                          var5 = var4 + ((ee) this).field_v;
                          if (var5 >= param1.length) {
                            var5 = var5 - param1.length;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        if (hl.a(false, ((ee) this).field_q, (wc) (Object) param1[var5], ((ee) this).field_A)) {
                          ((ee) this).field_s = var5;
                          return;
                        } else {
                          continue L9;
                        }
                      }
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var3;
            stackOut_26_1 = new StringBuilder().append("ee.TA(").append(param0).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L11;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L11;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 41);
        }
    }

    final void a(int param0) {
        if (0.0f == ((ee) this).field_j) {
          ((ee) this).field_u = ((ee) this).field_u + 0.019999999552965164f * (3.5f * ((ee) this).field_x);
          ((ee) this).field_y = ((ee) this).field_y + 0.019999999552965164f * (3.5f * ((ee) this).field_t);
          ((ee) this).field_A.field_h = (int)((ee) this).field_y;
          ((ee) this).field_A.field_f = (int)((ee) this).field_u;
          ((ee) this).a(-1, bl.field_r.field_sb);
          if (~((ee) this).field_v == param0) {
            return;
          } else {
            ((ee) this).field_q = bl.field_r.field_sb[((ee) this).field_v].field_k;
            return;
          }
        } else {
          ((ee) this).field_r = ((ee) this).field_r + ((ee) this).field_j * 0.019999999552965164f;
          ((ee) this).field_w.a(((ee) this).field_r, (byte) -54);
          ((ee) this).field_u = ((ee) this).field_u + 0.019999999552965164f * (3.5f * ((ee) this).field_x);
          ((ee) this).field_y = ((ee) this).field_y + 0.019999999552965164f * (3.5f * ((ee) this).field_t);
          ((ee) this).field_A.field_h = (int)((ee) this).field_y;
          ((ee) this).field_A.field_f = (int)((ee) this).field_u;
          ((ee) this).a(-1, bl.field_r.field_sb);
          if (~((ee) this).field_v == param0) {
            return;
          } else {
            ((ee) this).field_q = bl.field_r.field_sb[((ee) this).field_v].field_k;
            return;
          }
        }
    }

    ee(float param0, float param1, int param2) {
        this.a(param1, (byte) 81, param2, param0, 0.0f);
    }

    ee(float param0, float param1, int param2, float param3) {
        this.a(param1, (byte) 39, param2, param0, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Finish!";
    }
}
