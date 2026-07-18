/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class cl extends al {
    static tg[] field_p;
    static int field_q;
    private String field_j;
    static int[] field_n;
    static volatile boolean field_o;
    private bd field_l;
    static int field_m;
    private boolean field_k;

    final vf b(String param0, byte param1) {
        qh var3 = null;
        RuntimeException var3_ref = null;
        vf stackIn_3_0 = null;
        vf stackIn_7_0 = null;
        vf stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        vf stackOut_2_0 = null;
        vf stackOut_6_0 = null;
        vf stackOut_11_0 = null;
        vf stackOut_10_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (((cl) this).field_l.b(param0, param1) == a.field_e) {
              stackOut_2_0 = a.field_e;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                if (param0.equals((Object) (Object) ((cl) this).field_j)) {
                  break L1;
                } else {
                  var3 = f.a(param0, param1 + -150);
                  if (var3.a(param1 ^ 990)) {
                    ((cl) this).field_j = param0;
                    ((cl) this).field_k = var3.b(123);
                    break L1;
                  } else {
                    stackOut_6_0 = mi.field_c;
                    stackIn_7_0 = stackOut_6_0;
                    return stackIn_7_0;
                  }
                }
              }
              L2: {
                if (((cl) this).field_k) {
                  stackOut_11_0 = mc.field_a;
                  stackIn_12_0 = stackOut_11_0;
                  break L2;
                } else {
                  stackOut_10_0 = a.field_e;
                  stackIn_12_0 = stackOut_10_0;
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("cl.B(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ')');
        }
        return stackIn_12_0;
    }

    final static void a(String param0, boolean param1, int param2) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        Object var4 = null;
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
        try {
          L0: {
            L1: {
              ee.field_c = false;
              if (param1) {
                break L1;
              } else {
                var4 = null;
                cl.a((String) null, false, -26);
                break L1;
              }
            }
            L2: {
              ng.field_b = false;
              if (null == nk.field_a) {
                break L2;
              } else {
                if (!nk.field_a.field_D) {
                  break L2;
                } else {
                  L3: {
                    var3_int = 1;
                    if (8 != param2) {
                      break L3;
                    } else {
                      L4: {
                        if (!fe.field_g) {
                          param0 = mc.field_c;
                          break L4;
                        } else {
                          param0 = q.field_J;
                          break L4;
                        }
                      }
                      param2 = 2;
                      vk.field_c.b(190, gi.field_b);
                      break L3;
                    }
                  }
                  L5: {
                    if (param2 != 10) {
                      break L5;
                    } else {
                      qf.a(0);
                      var3_int = 0;
                      break L5;
                    }
                  }
                  L6: {
                    if (var3_int != 0) {
                      L7: {
                        if (ee.field_c) {
                          param0 = jf.a(ta.field_b, new String[1], (byte) -126);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      L8: {
                        if (va.field_f) {
                          param0 = pf.field_B;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      nk.field_a.a(param0, 4210752, param2);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  if (param2 == 256) {
                    break L2;
                  } else {
                    if (10 == param2) {
                      break L2;
                    } else {
                      if (!fe.field_g) {
                        vk.field_c.e((byte) -100);
                        break L2;
                      } else {
                        return;
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
          L9: {
            runtimeException = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) runtimeException;
            stackOut_26_1 = new StringBuilder().append("cl.E(");
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L9;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L9;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(boolean param0) {
        field_n = null;
        field_p = null;
    }

    cl(ba param0, ba param1) {
        super(param0);
        ((cl) this).field_j = "";
        ((cl) this).field_k = false;
        try {
            ((cl) this).field_l = new bd(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "cl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(String param0, byte param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        String stackIn_4_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        String stackOut_3_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -114) {
                break L1;
              } else {
                var4 = null;
                String discarded$2 = ((cl) this).a((String) null, (byte) -81);
                break L1;
              }
            }
            if (((cl) this).field_l.b(param0, (byte) 54) != a.field_e) {
              if (((cl) this).b(param0, (byte) 54) == a.field_e) {
                stackOut_7_0 = hb.field_C;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                return ha.field_g;
              }
            } else {
              stackOut_3_0 = ((cl) this).field_l.a(param0, (byte) -114);
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("cl.C(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_8_0;
    }

    final static void b(boolean param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        id var4 = null;
        int var4_int = 0;
        int var5 = 0;
        jc var5_ref_jc = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        ii var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Bounce.field_N;
        try {
          var9 = jc.field_g;
          var2 = var9.d((byte) -118);
          var3 = var9.d((byte) -113);
          if (0 == var2) {
            var4 = (id) (Object) mf.field_d.a((byte) -105);
            if (var4 != null) {
              L0: {
                var5 = -var9.field_h + pe.field_d;
                var13 = var4.field_h;
                var12 = var13;
                var11 = var12;
                var10 = var11;
                var6 = var10;
                if (var5 > var13.length << 2) {
                  var5 = var13.length << 2;
                  break L0;
                } else {
                  break L0;
                }
              }
              var7 = 0;
              L1: while (true) {
                if (var5 <= var7) {
                  var4.c(2);
                  return;
                } else {
                  var6[var7 >> 2] = var6[var7 >> 2] + (var9.d((byte) -125) << da.b(768, var7 << 8));
                  var7++;
                  continue L1;
                }
              }
            } else {
              kc.a((byte) 18);
              return;
            }
          } else {
            if (var2 != 1) {
              ti.a((Throwable) null, (byte) 100, "LR1: " + la.a(-114));
              kc.a((byte) 18);
              return;
            } else {
              var4_int = var9.i(128);
              var5_ref_jc = (jc) (Object) m.field_e.a((byte) -53);
              L2: while (true) {
                L3: {
                  if (var5_ref_jc == null) {
                    break L3;
                  } else {
                    L4: {
                      if (var3 != var5_ref_jc.field_l) {
                        break L4;
                      } else {
                        if (var5_ref_jc.field_j != var4_int) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var5_ref_jc = (jc) (Object) m.field_e.d((byte) 90);
                    continue L2;
                  }
                }
                if (var5_ref_jc == null) {
                  kc.a((byte) 18);
                  return;
                } else {
                  var5_ref_jc.c(2);
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var1, "cl.A(" + false + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = false;
    }
}
