/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di extends pu {
    static String field_l;

    final static void c(int param0) {
        int var1 = 0;
        var1 = -52 % ((-35 - param0) / 52);
        if (null != ms.field_u) {
          if (null == ms.field_u.field_g) {
            bga.field_m = null;
            ms.field_u = null;
            return;
          } else {
            ms.field_u.field_g.field_t = false;
            bga.field_m = null;
            ms.field_u = null;
            return;
          }
        } else {
          bga.field_m = null;
          ms.field_u = null;
          return;
        }
    }

    final static nea a(String param0, int param1) {
        Object var2 = null;
        nea var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_3_0 = null;
        nea stackIn_13_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        Object stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        Object stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_17_0 = null;
        nea stackOut_12_0 = null;
        Object stackOut_2_0 = null;
        Object stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        Object stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        Object stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            if (fq.field_s != null) {
              L1: {
                var6 = (CharSequence) (Object) param0;
                var2 = (Object) (Object) fq.a(0, var6);
                if (var2 != null) {
                  break L1;
                } else {
                  var2 = (Object) (Object) var6;
                  break L1;
                }
              }
              var3 = (nea) (Object) fq.field_s.a((long)((String) var2).hashCode(), (byte) -87);
              L2: while (true) {
                if (var3 == null) {
                  if (param1 >= -110) {
                    boolean discarded$2 = di.b(-9);
                    stackOut_17_0 = null;
                    stackIn_18_0 = stackOut_17_0;
                    break L0;
                  } else {
                    return null;
                  }
                } else {
                  L3: {
                    var7 = (CharSequence) (Object) var3.field_xb;
                    var4 = fq.a(0, var7);
                    if (var4 == null) {
                      var4 = var3.field_xb;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  if (!var4.equals(var2)) {
                    var3 = (nea) (Object) fq.field_s.a((byte) -31);
                    continue L2;
                  } else {
                    stackOut_12_0 = (nea) var3;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  }
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (nea) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = (Object) (Object) decompiledCaughtException;
            stackOut_19_0 = var2;
            stackOut_19_1 = new StringBuilder().append("di.B(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_20_0 = stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L4;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param1 + 41);
        }
        return (nea) (Object) stackIn_18_0;
    }

    final static boolean b(int param0) {
        if (qq.field_l != null) {
          return true;
        } else {
          if (!vb.field_j.a("benefits", 20637)) {
            return false;
          } else {
            qq.field_l = hca.a("benefits", vb.field_j, param0 ^ -90, "members_benefits_borders");
            st.field_c = hca.a("benefits", vb.field_j, 101, "members_benefits_price");
            f.field_c = hca.a("benefits", vb.field_j, param0 + -167, "members_benefits_logo");
            ik.field_l = gw.a("benefits", "members_benefits_screenshots", vb.field_j, param0 + -143);
            pp.a(qk.field_k, -84, qq.field_l);
            gd.a(param0, -2400, 40, (byte) -85, st.field_c, 16744576, 80, 2, (po) (Object) aha.field_D, 80, 15);
            oi.a(3, ik.field_l);
            kl.a((byte) 94, f.field_c);
            return true;
          }
        }
    }

    final static void a(boolean param0, int param1) {
        cq var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = BachelorFridge.field_y;
        try {
          L0: {
            b.field_u = param1;
            if (param0) {
              var2 = (cq) (Object) rma.field_d.b((byte) 90);
              L1: while (true) {
                if (var2 == null) {
                  L2: {
                    if (jha.field_i == null) {
                      break L2;
                    } else {
                      var2 = (cq) (Object) jha.field_i.b((byte) 90);
                      L3: while (true) {
                        if (var2 == null) {
                          break L2;
                        } else {
                          L4: {
                            if (var2.field_h.a((byte) -106)) {
                              var2.field_i.f(var2.field_f * b.field_u - -128 >> 8);
                              break L4;
                            } else {
                              var2.a(false);
                              break L4;
                            }
                          }
                          var2 = (cq) (Object) jha.field_i.c(0);
                          continue L3;
                        }
                      }
                    }
                  }
                  break L0;
                } else {
                  L5: {
                    if (!var2.field_h.a((byte) -106)) {
                      var2.a(false);
                      break L5;
                    } else {
                      var2.field_i.f(var2.field_f * b.field_u - -128 >> 8);
                      break L5;
                    }
                  }
                  var2 = (cq) (Object) rma.field_d.c(0);
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2_ref, "di.D(" + param0 + 44 + param1 + 41);
        }
    }

    public static void d(byte param0) {
        field_l = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "CONTINUE";
    }
}
