/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wf extends hm {
    static boolean[] field_P;
    private String field_Q;
    private vn field_O;
    private vc field_R;
    private int field_T;

    final boolean a(byte param0, ga param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
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
        try {
          L0: {
            if (param0 > 67) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              ((wf) this).field_T = 52;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("wf.B(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
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
          throw sh.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    public static void h(int param0) {
        field_P = null;
        if (param0 < 62) {
            wf.h(-102);
        }
    }

    wf(vc param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (io) (Object) tp.c(113));
        try {
            ((wf) this).field_Q = param1;
            ((wf) this).field_R = param0;
            ((wf) this).a(-119, param3, param2, param4, param5);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "wf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(ga param0, byte param1, int param2, int param3) {
        try {
            int var5_int = 101 / ((46 - param1) / 42);
            ((wf) this).field_T = ((wf) this).field_T + 1;
            super.a(param0, (byte) -91, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "wf.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        String var5 = null;
        rh var6 = null;
        Object var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        vn var14 = null;
        vn var15 = null;
        vn var16 = null;
        ak var17 = null;
        var8 = null;
        var13 = ZombieDawn.field_J;
        var6 = ((wf) this).field_R.a((byte) -73);
        if (var6 != se.field_l) {
          if (var6 != gj.field_v) {
            var5 = ((wf) this).field_R.b((byte) 78);
            if (var5 != null) {
              L0: {
                if (!var5.equals((Object) (Object) ((wf) this).field_o)) {
                  ((wf) this).field_o = var5;
                  ((wf) this).d((byte) -36);
                  break L0;
                } else {
                  break L0;
                }
              }
              L1: {
                super.a(param0, param1, param2, param3);
                var6 = ((wf) this).field_R.a((byte) -120);
                var17 = (ak) (Object) ((wf) this).field_h;
                var9 = ((wf) this).field_k + param2;
                var10 = var17.a((ga) this, param3 + 1, param0) + (var17.a(112, (ga) this).a((byte) 102) >> 1);
                if (var6 == se.field_l) {
                  break L1;
                } else {
                  if (gj.field_v == var6) {
                    break L1;
                  } else {
                    if (var6 == uc.field_b) {
                      var15 = dj.field_k[2];
                      var15.b(var9, -(var15.field_t >> 1) + var10, 256);
                      return;
                    } else {
                      if (mc.field_g == var6) {
                        var14 = dj.field_k[1];
                        var14.b(var9, -(var14.field_t >> 1) + var10, 256);
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
              L2: {
                var16 = dj.field_k[0];
                var11 = var16.field_r << 1;
                var12 = var16.field_q << 1;
                if (((wf) this).field_O == null) {
                  break L2;
                } else {
                  if (var11 > ((wf) this).field_O.field_w) {
                    break L2;
                  } else {
                    if (var12 <= ((wf) this).field_O.field_t) {
                      ki.a((byte) -103, ((wf) this).field_O);
                      bi.d();
                      var16.a(112, 144, var16.field_r << 4, var16.field_q << 4, -((wf) this).field_T << 10, 4096);
                      pa.a(-21189);
                      ((wf) this).field_O.b(-(var16.field_r >> 1) + var9, var10 - var16.field_q, 256);
                      return;
                    } else {
                      ((wf) this).field_O = new vn(var11, var12);
                      ki.a((byte) -118, ((wf) this).field_O);
                      var16.a(112, 144, var16.field_r << 4, var16.field_q << 4, -((wf) this).field_T << 10, 4096);
                      pa.a(-21189);
                      ((wf) this).field_O.b(-(var16.field_r >> 1) + var9, var10 - var16.field_q, 256);
                      return;
                    }
                  }
                }
              }
              ((wf) this).field_O = new vn(var11, var12);
              ki.a((byte) -118, ((wf) this).field_O);
              var16.a(112, 144, var16.field_r << 4, var16.field_q << 4, -((wf) this).field_T << 10, 4096);
              pa.a(-21189);
              ((wf) this).field_O.b(-(var16.field_r >> 1) + var9, var10 - var16.field_q, 256);
              return;
            } else {
              L3: {
                var5 = ((wf) this).field_Q;
                if (!var5.equals((Object) (Object) ((wf) this).field_o)) {
                  ((wf) this).field_o = var5;
                  ((wf) this).d((byte) -36);
                  break L3;
                } else {
                  break L3;
                }
              }
              super.a(param0, param1, param2, param3);
              var6 = ((wf) this).field_R.a((byte) -120);
              var17 = (ak) (Object) ((wf) this).field_h;
              var9 = ((wf) this).field_k + param2;
              var10 = var17.a((ga) this, param3 + 1, param0) + (var17.a(112, (ga) this).a((byte) 102) >> 1);
              if (var6 != se.field_l) {
                if (gj.field_v != var6) {
                  if (var6 == uc.field_b) {
                    var15 = dj.field_k[2];
                    var15.b(var9, -(var15.field_t >> 1) + var10, 256);
                    return;
                  } else {
                    if (mc.field_g == var6) {
                      var14 = dj.field_k[1];
                      var14.b(var9, -(var14.field_t >> 1) + var10, 256);
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  var16 = dj.field_k[0];
                  var11 = var16.field_r << 1;
                  var12 = var16.field_q << 1;
                  if (((wf) this).field_O != null) {
                    if (var11 <= ((wf) this).field_O.field_w) {
                      if (var12 > ((wf) this).field_O.field_t) {
                        ((wf) this).field_O = new vn(var11, var12);
                        ki.a((byte) -118, ((wf) this).field_O);
                        var16.a(112, 144, var16.field_r << 4, var16.field_q << 4, -((wf) this).field_T << 10, 4096);
                        pa.a(-21189);
                        ((wf) this).field_O.b(-(var16.field_r >> 1) + var9, var10 - var16.field_q, 256);
                        return;
                      } else {
                        ki.a((byte) -103, ((wf) this).field_O);
                        bi.d();
                        var16.a(112, 144, var16.field_r << 4, var16.field_q << 4, -((wf) this).field_T << 10, 4096);
                        pa.a(-21189);
                        ((wf) this).field_O.b(-(var16.field_r >> 1) + var9, var10 - var16.field_q, 256);
                        return;
                      }
                    } else {
                      ((wf) this).field_O = new vn(var11, var12);
                      ki.a((byte) -118, ((wf) this).field_O);
                      var16.a(112, 144, var16.field_r << 4, var16.field_q << 4, -((wf) this).field_T << 10, 4096);
                      pa.a(-21189);
                      ((wf) this).field_O.b(-(var16.field_r >> 1) + var9, var10 - var16.field_q, 256);
                      return;
                    }
                  } else {
                    ((wf) this).field_O = new vn(var11, var12);
                    ki.a((byte) -118, ((wf) this).field_O);
                    var16.a(112, 144, var16.field_r << 4, var16.field_q << 4, -((wf) this).field_T << 10, 4096);
                    pa.a(-21189);
                    ((wf) this).field_O.b(-(var16.field_r >> 1) + var9, var10 - var16.field_q, 256);
                    return;
                  }
                }
              } else {
                var16 = dj.field_k[0];
                var11 = var16.field_r << 1;
                var12 = var16.field_q << 1;
                if (((wf) this).field_O != null) {
                  if (var11 <= ((wf) this).field_O.field_w) {
                    if (var12 <= ((wf) this).field_O.field_t) {
                      ki.a((byte) -103, ((wf) this).field_O);
                      bi.d();
                      var16.a(112, 144, var16.field_r << 4, var16.field_q << 4, -((wf) this).field_T << 10, 4096);
                      pa.a(-21189);
                      ((wf) this).field_O.b(-(var16.field_r >> 1) + var9, var10 - var16.field_q, 256);
                      return;
                    } else {
                      ((wf) this).field_O = new vn(var11, var12);
                      ki.a((byte) -118, ((wf) this).field_O);
                      var16.a(112, 144, var16.field_r << 4, var16.field_q << 4, -((wf) this).field_T << 10, 4096);
                      pa.a(-21189);
                      ((wf) this).field_O.b(-(var16.field_r >> 1) + var9, var10 - var16.field_q, 256);
                      return;
                    }
                  } else {
                    ((wf) this).field_O = new vn(var11, var12);
                    ki.a((byte) -118, ((wf) this).field_O);
                    var16.a(112, 144, var16.field_r << 4, var16.field_q << 4, -((wf) this).field_T << 10, 4096);
                    pa.a(-21189);
                    ((wf) this).field_O.b(-(var16.field_r >> 1) + var9, var10 - var16.field_q, 256);
                    return;
                  }
                } else {
                  ((wf) this).field_O = new vn(var11, var12);
                  ki.a((byte) -118, ((wf) this).field_O);
                  var16.a(112, 144, var16.field_r << 4, var16.field_q << 4, -((wf) this).field_T << 10, 4096);
                  pa.a(-21189);
                  ((wf) this).field_O.b(-(var16.field_r >> 1) + var9, var10 - var16.field_q, 256);
                  return;
                }
              }
            }
          } else {
            L4: {
              var5 = no.field_E;
              if (!var5.equals((Object) (Object) ((wf) this).field_o)) {
                ((wf) this).field_o = var5;
                ((wf) this).d((byte) -36);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              super.a(param0, param1, param2, param3);
              var6 = ((wf) this).field_R.a((byte) -120);
              var17 = (ak) (Object) ((wf) this).field_h;
              var9 = ((wf) this).field_k + param2;
              var10 = var17.a((ga) this, param3 + 1, param0) + (var17.a(112, (ga) this).a((byte) 102) >> 1);
              if (var6 == se.field_l) {
                break L5;
              } else {
                if (gj.field_v == var6) {
                  break L5;
                } else {
                  if (var6 != uc.field_b) {
                    if (mc.field_g != var6) {
                      return;
                    } else {
                      var14 = dj.field_k[1];
                      var14.b(var9, -(var14.field_t >> 1) + var10, 256);
                      return;
                    }
                  } else {
                    var15 = dj.field_k[2];
                    var15.b(var9, -(var15.field_t >> 1) + var10, 256);
                    return;
                  }
                }
              }
            }
            var16 = dj.field_k[0];
            var11 = var16.field_r << 1;
            var12 = var16.field_q << 1;
            if (((wf) this).field_O != null) {
              if (var11 <= ((wf) this).field_O.field_w) {
                if (var12 <= ((wf) this).field_O.field_t) {
                  ki.a((byte) -103, ((wf) this).field_O);
                  bi.d();
                  var16.a(112, 144, var16.field_r << 4, var16.field_q << 4, -((wf) this).field_T << 10, 4096);
                  pa.a(-21189);
                  ((wf) this).field_O.b(-(var16.field_r >> 1) + var9, var10 - var16.field_q, 256);
                  return;
                } else {
                  ((wf) this).field_O = new vn(var11, var12);
                  ki.a((byte) -118, ((wf) this).field_O);
                  var16.a(112, 144, var16.field_r << 4, var16.field_q << 4, -((wf) this).field_T << 10, 4096);
                  pa.a(-21189);
                  ((wf) this).field_O.b(-(var16.field_r >> 1) + var9, var10 - var16.field_q, 256);
                  return;
                }
              } else {
                ((wf) this).field_O = new vn(var11, var12);
                ki.a((byte) -118, ((wf) this).field_O);
                var16.a(112, 144, var16.field_r << 4, var16.field_q << 4, -((wf) this).field_T << 10, 4096);
                pa.a(-21189);
                ((wf) this).field_O.b(-(var16.field_r >> 1) + var9, var10 - var16.field_q, 256);
                return;
              }
            } else {
              ((wf) this).field_O = new vn(var11, var12);
              ki.a((byte) -118, ((wf) this).field_O);
              var16.a(112, 144, var16.field_r << 4, var16.field_q << 4, -((wf) this).field_T << 10, 4096);
              pa.a(-21189);
              ((wf) this).field_O.b(-(var16.field_r >> 1) + var9, var10 - var16.field_q, 256);
              return;
            }
          }
        } else {
          L6: {
            var5 = no.field_E;
            if (!var5.equals((Object) (Object) ((wf) this).field_o)) {
              ((wf) this).field_o = var5;
              ((wf) this).d((byte) -36);
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            super.a(param0, param1, param2, param3);
            var6 = ((wf) this).field_R.a((byte) -120);
            var17 = (ak) (Object) ((wf) this).field_h;
            var9 = ((wf) this).field_k + param2;
            var10 = var17.a((ga) this, param3 + 1, param0) + (var17.a(112, (ga) this).a((byte) 102) >> 1);
            if (var6 == se.field_l) {
              break L7;
            } else {
              if (gj.field_v == var6) {
                break L7;
              } else {
                if (var6 != uc.field_b) {
                  if (mc.field_g != var6) {
                    return;
                  } else {
                    var14 = dj.field_k[1];
                    var14.b(var9, -(var14.field_t >> 1) + var10, 256);
                    return;
                  }
                } else {
                  var15 = dj.field_k[2];
                  var15.b(var9, -(var15.field_t >> 1) + var10, 256);
                  return;
                }
              }
            }
          }
          var16 = dj.field_k[0];
          var11 = var16.field_r << 1;
          var12 = var16.field_q << 1;
          if (((wf) this).field_O != null) {
            if (var11 <= ((wf) this).field_O.field_w) {
              if (var12 > ((wf) this).field_O.field_t) {
                ((wf) this).field_O = new vn(var11, var12);
                ki.a((byte) -118, ((wf) this).field_O);
                var16.a(112, 144, var16.field_r << 4, var16.field_q << 4, -((wf) this).field_T << 10, 4096);
                pa.a(-21189);
                ((wf) this).field_O.b(-(var16.field_r >> 1) + var9, var10 - var16.field_q, 256);
                return;
              } else {
                ki.a((byte) -103, ((wf) this).field_O);
                bi.d();
                var16.a(112, 144, var16.field_r << 4, var16.field_q << 4, -((wf) this).field_T << 10, 4096);
                pa.a(-21189);
                ((wf) this).field_O.b(-(var16.field_r >> 1) + var9, var10 - var16.field_q, 256);
                return;
              }
            } else {
              ((wf) this).field_O = new vn(var11, var12);
              ki.a((byte) -118, ((wf) this).field_O);
              var16.a(112, 144, var16.field_r << 4, var16.field_q << 4, -((wf) this).field_T << 10, 4096);
              pa.a(-21189);
              ((wf) this).field_O.b(-(var16.field_r >> 1) + var9, var10 - var16.field_q, 256);
              return;
            }
          } else {
            ((wf) this).field_O = new vn(var11, var12);
            ki.a((byte) -118, ((wf) this).field_O);
            var16.a(112, 144, var16.field_r << 4, var16.field_q << 4, -((wf) this).field_T << 10, 4096);
            pa.a(-21189);
            ((wf) this).field_O.b(-(var16.field_r >> 1) + var9, var10 - var16.field_q, 256);
            return;
          }
        }
    }

    final String d(int param0) {
        int var2 = 44 / ((10 - param0) / 58);
        return null;
    }

    final static Boolean e() {
        Boolean var1 = ba.field_g;
        ba.field_g = null;
        return var1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = new boolean[32];
    }
}
