/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ro extends kb {
    static th field_M;
    static cj field_O;
    static boolean field_L;
    static String field_N;

    ro(String[] param0, fc param1) {
        super(param0, param1);
    }

    public static void b(byte param0) {
        field_N = null;
        field_M = null;
        if (param0 <= 37) {
            field_L = false;
            field_O = null;
            return;
        }
        field_O = null;
    }

    final static int a(int param0, char param1, CharSequence param2) {
        int var5 = 0;
        int var6 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 > -118) {
            return 101;
        }
        int var3 = 0;
        int var4 = param2.length();
        for (var5 = 0; var4 > var5; var5++) {
            if ((param1 ^ -1) == (param2.charAt(var5) ^ -1)) {
                var3++;
            } else {
                var5++;
            }
        }
        return var3;
    }

    final void a(k param0, byte param1) {
        int var3 = 0;
        ek var3_ref_ek = null;
        ce var3_ref_ce = null;
        int var4_int = 0;
        bf var4 = null;
        int var5 = 0;
        int var6 = 0;
        pa var7 = null;
        og var8 = null;
        ge var9 = null;
        k stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        k stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        k stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        k stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        k stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        k stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        L0: {
          var6 = ZombieDawnMulti.field_E ? 1 : 0;
          param0.a(-110, ((ro) this).field_r);
          param0.a(((ro) this).field_H, (byte) -96);
          stackOut_0_0 = (k) param0;
          stackOut_0_1 = 109;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          if (((ro) this).field_i) {
            stackOut_2_0 = (k) (Object) stackIn_2_0;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = 1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            break L0;
          } else {
            stackOut_1_0 = (k) (Object) stackIn_1_0;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = 0;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            break L0;
          }
        }
        ((k) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2);
        param0.a(((ro) this).field_C, (byte) -121);
        param0.a(((ro) this).field_I, (byte) -55);
        param0.a(((ro) this).field_g, (byte) -54);
        param0.a(-73, ((ro) this).field_l);
        var3 = 0;
        L1: while (true) {
          if (((ro) this).field_t <= var3) {
            var3_ref_ek = (ek) (Object) ((ro) this).field_K.c(40);
            L2: while (true) {
              if (var3_ref_ek == null) {
                var3_ref_ce = (ce) (Object) ((ro) this).field_s.c(102);
                L3: while (true) {
                  if (var3_ref_ce == null) {
                    var3 = 11 + 16 * ((ro) this).field_t - -((((ro) this).field_K.a(0) - -((ro) this).field_s.a(0) + ((ro) this).field_A.a(0)) * 8);
                    if ((57 + var3 ^ -1) < -2001) {
                      param0.a(117, 0);
                      return;
                    } else {
                      var4 = (bf) (Object) ((ro) this).field_A.c(59);
                      if (param1 >= -107) {
                        return;
                      } else {
                        L4: while (true) {
                          if (var4 == null) {
                            param0.a(-106, 0);
                            return;
                          } else {
                            param0.a(-94, 4);
                            param0.a(-36, 0);
                            param0.a(var4.field_i, (byte) -104);
                            param0.a(var4.field_l, (byte) -107);
                            var5 = 0;
                            var5 = var5 | var4.field_o << 97582558;
                            param0.a(var5, (byte) -105);
                            var4 = (bf) (Object) ((ro) this).field_A.b(6);
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    param0.a(-64, 5);
                    param0.a(112, var3_ref_ce.field_q);
                    param0.a((var3_ref_ce.field_m + ip.field_f) * 24, (byte) -69);
                    param0.a((ip.field_f + var3_ref_ce.field_t) * 24, (byte) -54);
                    param0.a(var3_ref_ce.field_s, (byte) -103);
                    var3_ref_ce = (ce) (Object) ((ro) this).field_s.b(6);
                    continue L3;
                  }
                }
              } else {
                L5: {
                  if (var3_ref_ek instanceof pa) {
                    var7 = (pa) (Object) var3_ref_ek;
                    if ((var7.field_Q ^ -1) == -22) {
                      var3_ref_ek = (ek) (Object) ((ro) this).field_K.b(6);
                      continue L2;
                    } else {
                      if (!var7.field_Z) {
                        break L5;
                      } else {
                        var3_ref_ek = (ek) (Object) ((ro) this).field_K.b(6);
                        continue L2;
                      }
                    }
                  } else {
                    break L5;
                  }
                }
                L6: {
                  param0.a(108, this.a(var3_ref_ek, (byte) -105));
                  param0.a(110, var3_ref_ek.field_x);
                  param0.a(var3_ref_ek.e((byte) -112), (byte) -67);
                  param0.a(var3_ref_ek.g(1829947600), (byte) -95);
                  var4_int = var3_ref_ek.field_D;
                  if (var3_ref_ek instanceof ge) {
                    var9 = (ge) (Object) var3_ref_ek;
                    var4_int = var4_int | var9.field_gb << 654099486;
                    break L6;
                  } else {
                    if (var3_ref_ek instanceof og) {
                      var8 = (og) (Object) var3_ref_ek;
                      if (var8.field_Q) {
                        var4_int = var4_int | 536870912;
                        break L6;
                      } else {
                        break L6;
                      }
                    } else {
                      break L6;
                    }
                  }
                }
                var4_int = var4_int & 255 | (-16777216 & var4_int) >> 473582544;
                param0.a(var4_int, (byte) -104);
                var3_ref_ek = (ek) (Object) ((ro) this).field_K.b(6);
                continue L2;
              }
            }
          } else {
            param0.a(110, ((ro) this).field_y[var3]);
            param0.d(((ro) this).field_D[var3][0], -8593);
            param0.d(((ro) this).field_D[var3][1], -8593);
            param0.a(((ro) this).field_d[var3], (byte) -84);
            param0.d((int)(((ro) this).field_e[var3] >>> -399687704), -8593);
            param0.a(((ro) this).field_a[var3], (byte) -85);
            param0.a(((ro) this).field_z[var3], (byte) -78);
            var3++;
            continue L1;
          }
        }
    }

    private final int a(ek param0, byte param1) {
        if (param1 >= -80) {
            Object var4 = null;
            ((ro) this).a((k) null, (byte) 11);
            if (!(param0 instanceof ge)) {
                if (param0 instanceof lm) {
                    return 2;
                }
                if (param0 instanceof og) {
                    return 3;
                }
                return 0;
            }
            return 1;
        }
        if (!(param0 instanceof ge)) {
            if (param0 instanceof lm) {
                return 2;
            }
            if (param0 instanceof og) {
                return 3;
            }
            return 0;
        }
        return 1;
    }

    final static int c(byte param0) {
        if (param0 < 116) {
            return 69;
        }
        return (li.field_C << 437096900) + ((qe.field_g << -1670987742) - -ba.field_q);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = "? ? ?";
    }
}
