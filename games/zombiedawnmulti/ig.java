/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig {
    static th field_a;
    private io field_c;
    private ul field_h;
    private ul field_f;
    static ja field_b;
    static ja[] field_d;
    static String field_g;
    static ja field_e;

    final ob a(int param0, int param1) {
        byte[] var4 = null;
        ob var3 = (ob) ((ig) this).field_c.a((byte) 127, (long)param0);
        if (var3 != null) {
            return var3;
        }
        if (32768 <= param0) {
            var4 = ((ig) this).field_h.a(0, true, 32767 & param0);
        } else {
            var4 = ((ig) this).field_f.a(0, true, param0);
        }
        var3 = new ob();
        if (var4 != null) {
            var3.a(64, new k(var4));
        }
        if (param0 >= 32768) {
            var3.e((byte) -72);
        }
        ((ig) this).field_c.a((Object) (Object) var3, (long)param0, 1);
        if (param1 != 32767) {
            ((ig) this).field_c = null;
        }
        return var3;
    }

    public static void a(boolean param0) {
        field_d = null;
        field_e = null;
        field_a = null;
        field_b = null;
        field_g = null;
    }

    ig(int param0, ul param1, ul param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        ((ig) this).field_c = new io(64);
        try {
          L0: {
            L1: {
              ((ig) this).field_f = param1;
              ((ig) this).field_h = param2;
              if (((ig) this).field_f == null) {
                break L1;
              } else {
                int discarded$4 = ((ig) this).field_f.d(0, -2);
                break L1;
              }
            }
            L2: {
              if (((ig) this).field_h == null) {
                break L2;
              } else {
                int discarded$5 = ((ig) this).field_h.d(0, -2);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) runtimeException;
            stackOut_6_1 = new StringBuilder().append("ig.<init>(").append(param0).append(44);
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
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
    }

    final static void a(byte param0, int param1, boolean param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        cj var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        ka var9 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (t.field_e < b.field_d) {
                t.field_e = t.field_e + 1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (km.field_cb != dl.field_h.field_f) {
                vj.field_t = vj.field_t + (dl.field_h.field_f + -km.field_cb);
                km.field_cb = dl.field_h.field_f;
                break L2;
              } else {
                break L2;
              }
            }
            if (0 >= t.field_e) {
              return;
            } else {
              L3: {
                lk.g((byte) 93);
                dq.field_k.a(-11838, param2);
                if (ra.field_f != null) {
                  if (nh.field_m) {
                    boolean discarded$1 = ra.field_f.a(dq.field_k.field_w, (byte) -27, dq.field_k.field_qb, param2);
                    break L3;
                  } else {
                    ra.field_f = null;
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              var4_int = 0;
              L4: while (true) {
                if (var4_int >= 5) {
                  L5: {
                    if (nn.field_b.field_T != 0) {
                      bk.field_i = new fa(nn.field_b.field_w, nn.field_b.field_qb, nn.field_b.field_zb, nn.field_b.field_z, param3, wa.field_a, kc.field_c, jf.field_a, vo.field_m, jk.field_h, cm.field_b, (String) null, 0L);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    var9 = km.b(-7, param1, jk.field_f, nj.field_h);
                    if (var9 != null) {
                      kj.a(-31806, var9);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    var8 = jp.a((byte) -104);
                    if (var8 != null) {
                      ui.field_j = var8;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  var6 = -44 % ((-68 - param0) / 36);
                  break L0;
                } else {
                  L8: {
                    var5 = la.field_h[var4_int];
                    if (var5 == null) {
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  var4_int++;
                  continue L4;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var4, "ig.B(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new th();
        field_g = "Research Points: <%0>";
    }
}
