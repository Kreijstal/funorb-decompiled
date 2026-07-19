/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va {
    final static void a(int param0) {
        int discarded$3 = 0;
        int discarded$4 = 0;
        int discarded$5 = 0;
        RuntimeException var1 = null;
        kv var1_ref = null;
        int var2_int = 0;
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        kv var6 = null;
        kv var7 = null;
        kv var8 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            dg.a(243, 197, 369, 143, 16777215);
            dg.c(244, 198, 367, 141, 0);
            if (null != oja.field_f) {
              L1: {
                var6 = oja.field_f[ih.field_l];
                var1_ref = var6;
                if (param0 >= 124) {
                  break L1;
                } else {
                  va.a((byte) -87);
                  break L1;
                }
              }
              L2: {
                if (var6 != null) {
                  var6.e(245, 199);
                  break L2;
                } else {
                  if (null == g.field_f) {
                    break L2;
                  } else {
                    discarded$3 = g.field_f.a(ema.field_Ab, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                    break L2;
                  }
                }
              }
              L3: {
                if (gp.field_A < ph.field_E) {
                  var7 = oja.field_f[vj.field_n];
                  if (var7 == null) {
                    break L3;
                  } else {
                    var2_int = (60 + var7.field_n) * gp.field_A / ph.field_E;
                    var3 = var2_int - 30;
                    if (!ja.field_p) {
                      iia.a((byte) 123, 199, -256 * var3 / 30, var7, (-var3 + var7.field_n) * 256 / 30, 245);
                      break L3;
                    } else {
                      iia.a((byte) -57, 199, 256 * (var7.field_n - var3) / 30, var7, -256 * var3 / 30, 245);
                      break L3;
                    }
                  }
                } else {
                  break L3;
                }
              }
              if (null != g.field_f) {
                var2 = null;
                var5 = 0;
                var3 = var5;
                L4: while (true) {
                  if (oja.field_f.length <= var5) {
                    if (var2 == null) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      discarded$4 = g.field_f.a("Screenshot(s) " + (String) (var2) + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                      return;
                    }
                  } else {
                    L5: {
                      var8 = oja.field_f[var5];
                      if (var8 != null) {
                        L6: {
                          if (365 != var8.field_n) {
                            break L6;
                          } else {
                            if (139 != var8.field_o) {
                              break L6;
                            } else {
                              break L5;
                            }
                          }
                        }
                        if (var2 != null) {
                          var2 = (String) (var2) + ", " + var5;
                          break L5;
                        } else {
                          var2 = Integer.toString(var5);
                          break L5;
                        }
                      } else {
                        break L5;
                      }
                    }
                    var5++;
                    continue L4;
                  }
                }
              } else {
                return;
              }
            } else {
              L7: {
                if (null != g.field_f) {
                  discarded$5 = g.field_f.a(ema.field_Ab, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                  break L7;
                } else {
                  break L7;
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1), "va.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(byte param0) {
        ov.field_g = null;
        jl.field_s = -1;
        if (param0 < 7) {
            return;
        }
        eaa.field_b = -1;
        b.field_r = false;
        df.field_o = 0;
    }

    static {
    }
}
