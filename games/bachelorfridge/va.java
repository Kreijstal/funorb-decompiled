/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va {
    final static void a(int param0) {
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
                if (var6 != null) {
                  var6.e(245, 199);
                  break L1;
                } else {
                  if (null == g.field_f) {
                    break L1;
                  } else {
                    int discarded$3 = g.field_f.a(ema.field_Ab, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                    break L1;
                  }
                }
              }
              L2: {
                if (gp.field_A < ph.field_E) {
                  var7 = oja.field_f[vj.field_n];
                  if (var7 == null) {
                    break L2;
                  } else {
                    var2_int = (60 + var7.field_n) * gp.field_A / ph.field_E;
                    var3 = var2_int - 30;
                    if (!ja.field_p) {
                      iia.a((byte) 123, 199, -256 * var3 / 30, var7, (-var3 + var7.field_n) * 256 / 30, 245);
                      break L2;
                    } else {
                      iia.a((byte) -57, 199, 256 * (var7.field_n - var3) / 30, var7, -256 * var3 / 30, 245);
                      break L2;
                    }
                  }
                } else {
                  break L2;
                }
              }
              if (null != g.field_f) {
                var2 = null;
                var5 = 0;
                var3 = var5;
                L3: while (true) {
                  if (oja.field_f.length <= var5) {
                    if (var2 == null) {
                      break L0;
                    } else {
                      int discarded$4 = g.field_f.a("Screenshot(s) " + (String) var2 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                      return;
                    }
                  } else {
                    L4: {
                      var8 = oja.field_f[var5];
                      if (var8 != null) {
                        L5: {
                          if (365 != var8.field_n) {
                            break L5;
                          } else {
                            if (139 != var8.field_o) {
                              break L5;
                            } else {
                              var5++;
                              break L4;
                            }
                          }
                        }
                        if (var2 != null) {
                          var2 = (Object) (Object) ((String) var2 + ", " + var5);
                          break L4;
                        } else {
                          var2 = (Object) (Object) Integer.toString(var5);
                          break L4;
                        }
                      } else {
                        var5++;
                        break L4;
                      }
                    }
                    var5++;
                    continue L3;
                  }
                }
              } else {
                return;
              }
            } else {
              L6: {
                if (null != g.field_f) {
                  int discarded$5 = g.field_f.a(ema.field_Ab, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                  break L6;
                } else {
                  break L6;
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1, "va.A(" + 127 + ')');
        }
    }

    final static void a() {
        ov.field_g = null;
        jl.field_s = -1;
        eaa.field_b = -1;
        b.field_r = false;
        df.field_o = 0;
    }

    static {
    }
}
