/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vr extends wp {
    static String field_G;
    private int field_E;
    private v field_H;
    static String field_F;

    final void a(int param0, int param1, pk param2, int param3) {
        try {
            ((vr) this).field_E = ((vr) this).field_E + 1;
            int var5_int = 46 / ((param1 - -25) / 45);
            super.a(param0, 54, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "vr.U(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(java.awt.Component param0) {
        try {
            param0.removeKeyListener((java.awt.event.KeyListener) (Object) wd.field_e);
            param0.removeFocusListener((java.awt.event.FocusListener) (Object) wd.field_e);
            lv.field_i = -1;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "vr.D(" + (param0 != null ? "{...}" : "null") + ',' + -1 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        gf var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        wb var14 = null;
        wb var15 = null;
        wb var16 = null;
        wb var17 = null;
        var11 = Sumoblitz.field_L ? 1 : 0;
        super.a(param0, param1, (byte) -122, param3);
        if (0 != param3) {
          return;
        } else {
          var5 = (((vr) this).field_q >> 1) + (((vr) this).field_r + param0);
          var6 = (((vr) this).field_p >> 1) + param1 - -((vr) this).field_v;
          var8 = ((vr) this).field_H.c(-103);
          if (mb.field_f != var8) {
            if (kt.field_a != var8) {
              if (qr.field_e != var8) {
                L0: {
                  if (var8 != qe.field_a) {
                    break L0;
                  } else {
                    var15 = fw.field_m[1];
                    var15.d(var5 - (var15.field_x >> 1), var6 - (var15.field_u >> 1), 256);
                    break L0;
                  }
                }
                if (param2 >= -35) {
                  var12 = null;
                  ((vr) this).a(86, -51, (pk) null, 16);
                  return;
                } else {
                  return;
                }
              } else {
                var14 = fw.field_m[2];
                var14.d(-(var14.field_x >> 1) + var5, var6 + -(var14.field_u >> 1), 256);
                if (param2 >= -35) {
                  var12 = null;
                  ((vr) this).a(86, -51, (pk) null, 16);
                  return;
                } else {
                  return;
                }
              }
            } else {
              var17 = fw.field_m[0];
              var9 = var17.field_z << 1;
              var10 = var17.field_w << 1;
              if (kv.field_a != null) {
                if (var9 <= kv.field_a.field_x) {
                  if (var10 <= kv.field_a.field_u) {
                    jq.a(7161, kv.field_a);
                    lk.b();
                    var17.a(112, 144, var17.field_z << 4, var17.field_w << 4, -((vr) this).field_E << 10, 4096);
                    su.a((byte) 126);
                    kv.field_a.d(var5 + -var17.field_z, -var17.field_w + var6, 256);
                    if (param2 >= -35) {
                      var12 = null;
                      ((vr) this).a(86, -51, (pk) null, 16);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    kv.field_a = new wb(var9, var10);
                    jq.a(7161, kv.field_a);
                    var17.a(112, 144, var17.field_z << 4, var17.field_w << 4, -((vr) this).field_E << 10, 4096);
                    su.a((byte) 126);
                    kv.field_a.d(var5 + -var17.field_z, -var17.field_w + var6, 256);
                    if (param2 >= -35) {
                      var12 = null;
                      ((vr) this).a(86, -51, (pk) null, 16);
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  L1: {
                    kv.field_a = new wb(var9, var10);
                    jq.a(7161, kv.field_a);
                    var17.a(112, 144, var17.field_z << 4, var17.field_w << 4, -((vr) this).field_E << 10, 4096);
                    su.a((byte) 126);
                    kv.field_a.d(var5 + -var17.field_z, -var17.field_w + var6, 256);
                    if (param2 < -35) {
                      break L1;
                    } else {
                      var12 = null;
                      ((vr) this).a(86, -51, (pk) null, 16);
                      break L1;
                    }
                  }
                  return;
                }
              } else {
                L2: {
                  kv.field_a = new wb(var9, var10);
                  jq.a(7161, kv.field_a);
                  var17.a(112, 144, var17.field_z << 4, var17.field_w << 4, -((vr) this).field_E << 10, 4096);
                  su.a((byte) 126);
                  kv.field_a.d(var5 + -var17.field_z, -var17.field_w + var6, 256);
                  if (param2 < -35) {
                    break L2;
                  } else {
                    var12 = null;
                    ((vr) this).a(86, -51, (pk) null, 16);
                    break L2;
                  }
                }
                return;
              }
            }
          } else {
            var16 = fw.field_m[0];
            var9 = var16.field_z << 1;
            var10 = var16.field_w << 1;
            if (kv.field_a != null) {
              if (var9 <= kv.field_a.field_x) {
                if (var10 > kv.field_a.field_u) {
                  L3: {
                    kv.field_a = new wb(var9, var10);
                    jq.a(7161, kv.field_a);
                    var16.a(112, 144, var16.field_z << 4, var16.field_w << 4, -((vr) this).field_E << 10, 4096);
                    su.a((byte) 126);
                    kv.field_a.d(var5 + -var16.field_z, -var16.field_w + var6, 256);
                    if (param2 < -35) {
                      break L3;
                    } else {
                      var12 = null;
                      ((vr) this).a(86, -51, (pk) null, 16);
                      break L3;
                    }
                  }
                  return;
                } else {
                  L4: {
                    jq.a(7161, kv.field_a);
                    lk.b();
                    var16.a(112, 144, var16.field_z << 4, var16.field_w << 4, -((vr) this).field_E << 10, 4096);
                    su.a((byte) 126);
                    kv.field_a.d(var5 + -var16.field_z, -var16.field_w + var6, 256);
                    if (param2 < -35) {
                      break L4;
                    } else {
                      var12 = null;
                      ((vr) this).a(86, -51, (pk) null, 16);
                      break L4;
                    }
                  }
                  return;
                }
              } else {
                L5: {
                  kv.field_a = new wb(var9, var10);
                  jq.a(7161, kv.field_a);
                  var16.a(112, 144, var16.field_z << 4, var16.field_w << 4, -((vr) this).field_E << 10, 4096);
                  su.a((byte) 126);
                  kv.field_a.d(var5 + -var16.field_z, -var16.field_w + var6, 256);
                  if (param2 < -35) {
                    break L5;
                  } else {
                    var12 = null;
                    ((vr) this).a(86, -51, (pk) null, 16);
                    break L5;
                  }
                }
                return;
              }
            } else {
              L6: {
                kv.field_a = new wb(var9, var10);
                jq.a(7161, kv.field_a);
                var16.a(112, 144, var16.field_z << 4, var16.field_w << 4, -((vr) this).field_E << 10, 4096);
                su.a((byte) 126);
                kv.field_a.d(var5 + -var16.field_z, -var16.field_w + var6, 256);
                if (param2 < -35) {
                  break L6;
                } else {
                  var12 = null;
                  ((vr) this).a(86, -51, (pk) null, 16);
                  break L6;
                }
              }
              return;
            }
          }
        }
    }

    final String c(int param0) {
        if (((vr) this).field_k) {
          return ((vr) this).field_H.a(3690);
        } else {
          if (param0 == -6696) {
            return null;
          } else {
            ((vr) this).a(-102, 53, (byte) -40, -114);
            return null;
          }
        }
    }

    final boolean a(pk param0, byte param1) {
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
            if (param1 == 61) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              ((vr) this).field_E = 103;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("vr.Q(");
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
          throw qo.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    public static void a() {
        field_G = null;
        field_F = null;
    }

    vr(v param0) {
        try {
            ((vr) this).field_H = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "vr.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = "This password contains your Player Name, and would be easy to guess";
    }
}
