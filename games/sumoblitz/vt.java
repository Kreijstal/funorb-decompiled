/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vt extends nt {
    private int field_u;
    static int field_t;
    private int field_s;
    private int field_v;
    private int field_w;

    final boolean a(int param0) {
        int var3 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (((vt) this).field_v > ((vt) this).field_p) {
          ((vt) this).field_o = ((vt) this).field_o + ((vt) this).field_s;
          ((vt) this).field_k = ((vt) this).field_k + ((vt) this).field_w;
          ((vt) this).field_s = ((vt) this).field_s * 251 / 300;
          ((vt) this).field_w = 251 * ((vt) this).field_w / 300;
          if (((vt) this).field_w >= 0) {
            ((vt) this).field_w = ((vt) this).field_w + 1;
            if (((vt) this).field_s >= 0) {
              ((vt) this).field_s = ((vt) this).field_s + 1;
              if (param0 != -2567) {
                ((vt) this).field_w = -90;
                return super.a(-2567);
              } else {
                return super.a(-2567);
              }
            } else {
              ((vt) this).field_s = ((vt) this).field_s - 1;
              if (param0 != -2567) {
                ((vt) this).field_w = -90;
                return super.a(-2567);
              } else {
                return super.a(-2567);
              }
            }
          } else {
            ((vt) this).field_w = ((vt) this).field_w - 1;
            if (((vt) this).field_s >= 0) {
              ((vt) this).field_s = ((vt) this).field_s + 1;
              if (param0 == -2567) {
                return super.a(-2567);
              } else {
                ((vt) this).field_w = -90;
                return super.a(-2567);
              }
            } else {
              ((vt) this).field_s = ((vt) this).field_s - 1;
              if (param0 == -2567) {
                return super.a(-2567);
              } else {
                ((vt) this).field_w = -90;
                return super.a(-2567);
              }
            }
          }
        } else {
          if (param0 == -2567) {
            return super.a(-2567);
          } else {
            ((vt) this).field_w = -90;
            return super.a(-2567);
          }
        }
    }

    final static int a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var5 = -14 + rm.b(-117, param2 ^ param2 >> 31 | param3 ^ param3 >> 31 | param0 >> 31 ^ param0);
          if (var5 <= 0) {
            break L0;
          } else {
            param3 = param3 >> var5;
            param0 = param0 >> var5;
            param2 = param2 >> var5;
            break L0;
          }
        }
        if (0 >= param3) {
          return -1;
        } else {
          var6 = -(param0 * (2 * param3)) + param2 * param2;
          if (var6 < 0) {
            return -1;
          } else {
            var7 = cb.b(-22415, var6);
            var8 = (var7 - param2 << param4) / param3;
            var9 = (-var7 - param2 << param4) / param3;
            if (var8 >= 0) {
              if (var8 <= 1 << param4) {
                if (0 <= var9) {
                  if (var8 <= var9) {
                    return var8;
                  } else {
                    return var9;
                  }
                } else {
                  return var8;
                }
              } else {
                if (var9 >= 0) {
                  if (1 << param4 < var9) {
                    return -1;
                  } else {
                    return var9;
                  }
                } else {
                  return -1;
                }
              }
            } else {
              if (var9 >= 0) {
                if (1 << param4 < var9) {
                  return -1;
                } else {
                  return var9;
                }
              } else {
                return -1;
              }
            }
          }
        }
    }

    final void a(ha param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            if (param1 < -121) {
              break L0;
            } else {
              boolean discarded$2 = ((vt) this).a(84);
              break L0;
            }
          }
          if (((vt) this).field_u != 0) {
            im.field_a.a(((vt) this).field_k >> 8, ((vt) this).field_o >> 8, 0, (256 / ((vt) this).field_v * ((vt) this).field_p << 24) + ((vt) this).field_q, 1);
            return;
          } else {
            uc.field_a.a((float)(((vt) this).field_k >> 8), (float)(((vt) this).field_o >> 8), 1024, 0, 3, 16777215 + (256 / ((vt) this).field_v * ((vt) this).field_p << 24), 1);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("vt.C(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
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
          throw qo.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 41);
        }
    }

    vt(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        super(param0, param1, param2, param3);
        ((vt) this).field_v = param0;
        ((vt) this).field_s = param5;
        ((vt) this).field_u = param6;
        ((vt) this).field_w = param4;
    }

    final static void a(boolean param0, boolean param1) {
        if (!param1) {
            vt.a(false, false);
            rf.field_a.a(0, 0, false);
            return;
        }
        rf.field_a.a(0, 0, false);
    }

    static {
    }
}
