/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf extends mf {
    private ul field_l;
    static mn field_k;
    static int[] field_m;
    static nf field_j;
    static String field_h;
    static bi field_i;

    final static void a(int param0, int param1, bj param2) {
        hb var8 = null;
        hb var9 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = Confined.field_J ? 1 : 0;
        try {
            var8 = vh.field_a;
            var9 = var8;
            var9.b(true, param0);
            var9.field_n = var9.field_n + 1;
            var4 = var9.field_n;
            var9.f(96, 1);
            var9.c(param2.field_p, 8);
            var9.c(param2.field_r, 8);
            var9.c(param2.field_x, 8);
            var9.d(-97, param2.field_n);
            var9.d(-101, param2.field_u);
            var9.d(-108, param2.field_o);
            var9.d(-83, param2.field_t);
            var9.f(107, param2.field_s.length);
            if (param1 < 35) {
                bj var7 = (bj) null;
                lf.a(-61, -11, (bj) null);
            }
            for (var5 = 0; param2.field_s.length > var5; var5++) {
                var8.d(-91, param2.field_s[var5]);
            }
            var9.e(26199, var4);
            var9.a(25859, -var4 + var9.field_n);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "lf.L(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(String param0, boolean param1) {
        dm var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!(this.field_l instanceof j)) {
                break L1;
              } else {
                var3 = ((j) ((Object) this.field_l)).a((byte) -9);
                if (var3 != null) {
                  L2: {
                    if (var3.a(-3621) != nn.field_q) {
                      break L2;
                    } else {
                      if (param0.equals(this.field_l.field_B)) {
                        break L2;
                      } else {
                        stackIn_6_0 = lm.field_d;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                  stackIn_8_0 = var3.a((byte) 68);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L3: {
              if (param1) {
                break L3;
              } else {
                lf.e(71);
                break L3;
              }
            }
            if (!param0.equals(this.field_l.field_B)) {
              stackIn_14_0 = lm.field_d;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3_ref);

            stackIn_18_1 = new StringBuilder().append("lf.A(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    lf(ul param0, ul param1) {
        super(param0);
        try {
            this.field_l = param1;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "lf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final fi a(byte param0, String param1) {
        dm var3 = null;
        RuntimeException var3_ref = null;
        fi stackIn_2_0 = null;
        fi stackIn_8_0 = null;
        fi stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 <= -44) {
              L1: {
                if (this.field_l instanceof j) {
                  var3 = ((j) ((Object) this.field_l)).a((byte) -9);
                  if (var3 == null) {
                    break L1;
                  } else {
                    if (var3.a(-3621) == nn.field_q) {
                      break L1;
                    } else {
                      stackIn_8_0 = fb.field_e;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                } else {
                  break L1;
                }
              }
              L2: {
                if (param1.equals(this.field_l.field_B)) {
                  stackIn_12_0 = nn.field_q;
                  break L2;
                } else {
                  stackIn_12_0 = fb.field_e;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_2_0 = (fi) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("lf.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    final static void c(byte param0) {
        Object var1 = null;
        int var2 = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var1 = tf.field_p;
            synchronized (var1) {
              L1: {
                L2: {
                  ic.field_b = lh.field_b;
                  cg.field_d = cg.field_d + 1;
                  if (0 <= ab.field_a) {
                    L3: while (true) {
                      if (mi.field_g == ab.field_a) {
                        break L2;
                      } else {
                        var2 = on.field_f[mi.field_g];
                        mi.field_g = 1 + mi.field_g & 127;
                        if (0 <= var2) {
                          mc.field_e[var2] = true;
                          continue L3;
                        } else {
                          mc.field_e[var2 ^ -1] = false;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    var2 = 0;
                    L4: while (true) {
                      if ((var2 ^ -1) <= -113) {
                        ab.field_a = mi.field_g;
                        break L2;
                      } else {
                        mc.field_e[var2] = false;
                        var2++;
                        continue L4;
                      }
                    }
                  }
                }
                L5: {
                  if (param0 == -84) {
                    break L5;
                  } else {
                    field_i = (bi) null;
                    break L5;
                  }
                }
                lh.field_b = oe.field_W;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1_ref), "lf.B(" + param0 + ')');
        }
    }

    public static void e(int param0) {
        field_h = null;
        field_j = null;
        field_i = null;
        if (param0 < 15) {
            lf.c((byte) 83);
        }
        field_m = null;
        field_k = null;
    }

    static {
        field_m = new int[]{5, 18, 39, 52};
        field_k = new mn();
        field_h = "Special energy weapons";
    }
}
