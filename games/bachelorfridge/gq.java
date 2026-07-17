/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gq extends ana {
    private boolean field_v;
    private taa field_A;
    static int field_z;
    static String field_G;
    static boolean field_x;
    private int field_C;
    static kv field_E;
    private ct field_D;
    private int field_y;
    private int field_B;
    private int field_H;
    private int field_w;
    private ad field_F;

    public static void b(boolean param0) {
        field_G = null;
        field_E = null;
    }

    final static void a(boolean param0, int param1) {
        if (param1 != 19626) {
            return;
        }
        nw.a(false, param0, (byte) 85);
    }

    gq(gj param0, ct param1) {
        super(param0, (bca) (Object) param1);
        RuntimeException var3 = null;
        bj var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        ((gq) this).field_v = false;
        try {
          L0: {
            ((gq) this).field_D = param1;
            var4 = (bj) (Object) ((gq) this).field_D.field_o.b((byte) 90);
            ((gq) this).field_F = var4.field_h.a(-27449, ((gq) this).field_q);
            ((gq) this).field_y = -((gq) this).field_F.field_s.field_x + var4.field_i;
            ((gq) this).field_w = var4.field_l - ((gq) this).field_F.field_s.field_J;
            ((gq) this).field_H = (int)Math.sqrt((double)((((gq) this).field_w * ((gq) this).field_w + ((gq) this).field_y * ((gq) this).field_y) * 100));
            ((gq) this).field_C = (int)Math.sqrt((double)(256 * (((gq) this).field_y * ((gq) this).field_y - -(((gq) this).field_w * ((gq) this).field_w))));
            ((gq) this).field_A = new taa(((gq) this).field_q, ((gq) this).field_F);
            ((gq) this).a(27799, (at) (Object) ((gq) this).field_A);
            ((gq) this).field_B = 25 + ((gq) this).field_H;
            ((gq) this).field_F.field_o = 0;
            ((gq) this).field_F.field_r = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var3;
            stackOut_3_1 = new StringBuilder().append("gq.<init>(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    private final void e(byte param0) {
        this.d(6);
        this.f((byte) 107);
        ((gq) this).field_F.field_o = 0;
        ((gq) this).field_F.field_k = 0;
        ((gq) this).field_F.field_r = 0;
    }

    final boolean c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        if (((gq) this).field_A.a((byte) -106)) {
          return false;
        } else {
          if (((gq) this).field_H - -12 > ((gq) this).field_B) {
            if (!((gq) this).field_v) {
              ((gq) this).field_v = true;
              aba.a((byte) 89, 34);
              int fieldTemp$3 = ((gq) this).field_B - 1;
              ((gq) this).field_B = ((gq) this).field_B - 1;
              if (fieldTemp$3 <= 0) {
                if (-25 > ((gq) this).field_B) {
                  return true;
                } else {
                  L0: {
                    if (((gq) this).field_B == 0) {
                      this.e((byte) 49);
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                  return false;
                }
              } else {
                if (((gq) this).field_B >= ((gq) this).field_H) {
                  return false;
                } else {
                  L1: {
                    var2 = ((gq) this).field_H >> 1;
                    ((gq) this).field_F.field_r = (-((gq) this).field_B + ((gq) this).field_H) * (((gq) this).field_w << 16) / ((gq) this).field_H;
                    ((gq) this).field_F.field_k = ((gq) this).field_C * (4 * (((gq) this).field_B * (((gq) this).field_H + -((gq) this).field_B))) / (((gq) this).field_H * ((gq) this).field_H);
                    if (var2 < -10 + ((gq) this).field_H) {
                      var2 = ((gq) this).field_H + -10;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  ((gq) this).field_F.field_o = (((gq) this).field_y << 16) * (-((gq) this).field_B + ((gq) this).field_H) / ((gq) this).field_H;
                  ((gq) this).field_q.field_s.a(((gq) this).field_F, 106);
                  var3 = 85 % ((71 - param0) / 47);
                  return false;
                }
              }
            } else {
              int fieldTemp$4 = ((gq) this).field_B - 1;
              ((gq) this).field_B = ((gq) this).field_B - 1;
              if (fieldTemp$4 <= 0) {
                if (-25 > ((gq) this).field_B) {
                  return true;
                } else {
                  L2: {
                    if (((gq) this).field_B == 0) {
                      this.e((byte) 49);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  return false;
                }
              } else {
                if (((gq) this).field_B >= ((gq) this).field_H) {
                  return false;
                } else {
                  L3: {
                    var2 = ((gq) this).field_H >> 1;
                    ((gq) this).field_F.field_r = (-((gq) this).field_B + ((gq) this).field_H) * (((gq) this).field_w << 16) / ((gq) this).field_H;
                    ((gq) this).field_F.field_k = ((gq) this).field_C * (4 * (((gq) this).field_B * (((gq) this).field_H + -((gq) this).field_B))) / (((gq) this).field_H * ((gq) this).field_H);
                    if (var2 < -10 + ((gq) this).field_H) {
                      var2 = ((gq) this).field_H + -10;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  ((gq) this).field_F.field_o = (((gq) this).field_y << 16) * (-((gq) this).field_B + ((gq) this).field_H) / ((gq) this).field_H;
                  ((gq) this).field_q.field_s.a(((gq) this).field_F, 106);
                  var3 = 85 % ((71 - param0) / 47);
                  return false;
                }
              }
            }
          } else {
            int fieldTemp$5 = ((gq) this).field_B - 1;
            ((gq) this).field_B = ((gq) this).field_B - 1;
            if (fieldTemp$5 <= 0) {
              if (-25 <= ((gq) this).field_B) {
                if (((gq) this).field_B != 0) {
                  return false;
                } else {
                  this.e((byte) 49);
                  return false;
                }
              } else {
                return true;
              }
            } else {
              if (((gq) this).field_B >= ((gq) this).field_H) {
                return false;
              } else {
                L4: {
                  var2 = ((gq) this).field_H >> 1;
                  ((gq) this).field_F.field_r = (-((gq) this).field_B + ((gq) this).field_H) * (((gq) this).field_w << 16) / ((gq) this).field_H;
                  ((gq) this).field_F.field_k = ((gq) this).field_C * (4 * (((gq) this).field_B * (((gq) this).field_H + -((gq) this).field_B))) / (((gq) this).field_H * ((gq) this).field_H);
                  if (var2 < -10 + ((gq) this).field_H) {
                    var2 = ((gq) this).field_H + -10;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                ((gq) this).field_F.field_o = (((gq) this).field_y << 16) * (-((gq) this).field_B + ((gq) this).field_H) / ((gq) this).field_H;
                ((gq) this).field_q.field_s.a(((gq) this).field_F, 106);
                var3 = 85 % ((71 - param0) / 47);
                return false;
              }
            }
          }
        }
    }

    private final void d(int param0) {
        aga var2 = null;
        int var7 = 0;
        aga var8 = null;
        var7 = BachelorFridge.field_y;
        var8 = ((gq) this).field_D.field_l.a(36, ((gq) this).field_q.field_h);
        var2 = var8;
        if (var8.i(-114)) {
          return;
        } else {
          return;
        }
    }

    private final void f(byte param0) {
        aga var2 = null;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        var2 = ((gq) this).field_D.field_l.a(70, ((gq) this).field_q.field_h);
        if (var2.i(-112)) {
          return;
        } else {
          return;
        }
    }

    static {
    }
}
