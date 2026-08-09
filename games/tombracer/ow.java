/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ow extends wv {
    static boolean field_s;
    private dea field_r;
    static int[] field_q;

    final void a(byte param0) {
        int var3;
        var3 = TombRacer.field_G ? 1 : 0;
        super.a((byte) 89);
        if (param0 <= 78) {
          this.field_r = (dea) null;
          if (null != rba.field_a) {
            if (!vpa.a(54)) {
              if (rba.field_a.field_D) {
                if (!rba.field_a.d((byte) 100)) {
                  this.a(22174, mi.field_l);
                  return;
                } else {
                  this.a(22174, sja.field_h);
                  return;
                }
              } else {
                this.a(22174, uja.field_e);
                return;
              }
            } else {
              if (rba.field_a.field_D) {
                if (!rba.field_a.d((byte) 68)) {
                  this.a(22174, hi.field_q);
                  return;
                } else {
                  this.a(22174, sk.field_f);
                  return;
                }
              } else {
                this.a(22174, ma.field_f);
                return;
              }
            }
          } else {
            return;
          }
        } else {
          if (null != rba.field_a) {
            if (!vpa.a(54)) {
              if (rba.field_a.field_D) {
                if (!rba.field_a.d((byte) 100)) {
                  this.a(22174, mi.field_l);
                  return;
                } else {
                  this.a(22174, sja.field_h);
                  return;
                }
              } else {
                this.a(22174, uja.field_e);
                return;
              }
            } else {
              if (rba.field_a.field_D) {
                if (!rba.field_a.d((byte) 68)) {
                  this.a(22174, hi.field_q);
                  return;
                } else {
                  this.a(22174, sk.field_f);
                  return;
                }
              } else {
                this.a(22174, ma.field_f);
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    final int a(byte param0, int param1) {
        int var3;
        var3 = super.a((byte) 112, param1);
        if (param0 >= 111) {
          if (this.field_m[param1].field_g != 5) {
            if (-7 == (this.field_m[param1].field_g ^ -1)) {
              var3 -= 10;
              return var3;
            } else {
              return var3;
            }
          } else {
            var3 -= 10;
            return var3;
          }
        } else {
          return 125;
        }
    }

    final int g(int param0, int param1) {
        int var3;
        int var4;
        int var6;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int var5;
        var6 = TombRacer.field_G ? 1 : 0;
        var3 = this.field_n;
        if (param1 == 30) {
          var4 = 0;
          L0: while (true) {
            if (param0 <= var4) {
              if (-6 == (this.field_m[param0].field_g ^ -1)) {
                var3 += 10;
                return var3;
              } else {
                return var3;
              }
            } else {
              L1: {
                if (-6 != (this.field_m[var4].field_g ^ -1)) {
                  if (6 == this.field_m[var4].field_g) {
                    stackIn_11_0 = 1;
                    break L1;
                  } else {
                    stackIn_11_0 = 0;
                    break L1;
                  }
                } else {
                  stackIn_11_0 = 1;
                  break L1;
                }
              }
              L2: {
                var5 = stackIn_11_0;
                stackIn_13_0 = var3;

                if (var5 != 0) {
                  stackIn_14_0 = stackIn_13_0;
                  stackIn_14_1 = this.field_m[var4].d(11919) / 2;
                  break L2;
                } else {
                  stackIn_14_0 = stackIn_13_0;
                  stackIn_14_1 = this.field_i;
                  break L2;
                }
              }
              var3 = stackIn_14_0 + stackIn_14_1;
              if (this.field_m[var4].field_g == 5) {
                var3 += 10;
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return -25;
        }
    }

    final void a(int param0, int param1, boolean param2) {
        super.a(param0, param1, param2);
        this.field_r.c(-72);
    }

    final static void a(byte param0, String[] param1) {
        try {
            if (!(on.field_b == null)) {
                on.field_b.field_y.a(13597, param1);
            }
            if (!(md.field_F == null)) {
                md.field_F.field_x.a(13597, param1);
            }
            int var2_int = -77 % ((-37 - param0) / 57);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ow.BA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ow(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_r = new dea();
    }

    final void c(int param0) {
        ira.a(false, -1, (byte) -125);
        if (param0 != -6) {
            this.c(49);
        }
    }

    final int a(int param0, byte param1) {
        int var3;
        var3 = super.a(param0, param1);
        if (5 != this.field_m[param0].field_g) {
          if (this.field_m[param0].field_g == 6) {
            var3 -= 10;
            return var3;
          } else {
            return var3;
          }
        } else {
          var3 -= 10;
          return var3;
        }
    }

    final void a(byte param0, boolean param1) {
        super.a(param0, param1);
        int var3 = this.field_m[1].field_i + -70 + this.field_r.e(93) - 150;
        tp.field_K.a((aaa.a(false) >> 866144673) + -(tp.field_K.a() >> -479244287), var3);
    }

    final static jea a(int param0, int param1, int param2, int param3, il param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, byte param12) {
        jea var13 = null;
        RuntimeException var13_ref = null;
        jea stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var13 = new jea(0L, (jea) null);
              var13.field_w = sva.a(param11, param2, 4);
              var13.field_C = sva.a(param1, param10, 4);
              var13.field_db = sva.a(param0, param5, 4);
              if (param12 < -75) {
                break L1;
              } else {
                field_s = true;
                break L1;
              }
            }
            var13.field_n = sva.a(param6, param9, 4);
            var13.field_M = sva.a(param7, param8, 4);
            var13.field_H = param4;
            var13.field_ib = param3;
            stackIn_3_0 = (jea) (var13);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var13_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var13_ref);

            stackIn_6_1 = new StringBuilder().append("ow.DA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
        return stackIn_3_0;
    }

    public static void d(int param0) {
        int var1 = -126 % ((param0 - 20) / 55);
        field_q = null;
    }

    final void a(boolean param0, boolean param1, int param2) {
        int var4;
        int var5;
        dea stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        boolean stackIn_2_2 = false;
        dea stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        boolean stackIn_3_2 = false;
        int stackIn_3_3 = 0;
        L0: {
          var5 = TombRacer.field_G ? 1 : 0;
          super.a(param0, param1, param2);
          stackIn_2_0 = this.field_r;

          stackIn_2_1 = -120;

          stackIn_2_2 = param0;

          if (param1) {
            stackIn_3_0 = (dea) ((Object) stackIn_2_0);
            stackIn_3_1 = stackIn_2_1;
            stackIn_3_2 = stackIn_2_2;
            stackIn_3_3 = 0;
            break L0;
          } else {
            stackIn_3_0 = (dea) ((Object) stackIn_2_0);
            stackIn_3_1 = stackIn_2_1;
            stackIn_3_2 = stackIn_2_2;
            stackIn_3_3 = 1;
            break L0;
          }
        }
        ((dea) (Object) stackIn_3_0).a((byte) stackIn_3_1, stackIn_3_2, stackIn_3_3 != 0);
        if (rba.field_a != null) {
          if (rba.field_a.field_k != null) {
            if (rba.field_a.field_D) {
              if (!rba.field_a.d((byte) 92)) {
                var4 = rba.field_a.field_k.field_b;
                if (1 != (1 & var4 >> rba.field_a.field_x)) {
                  if (var4 != 0) {
                    this.field_m[1].field_e = jf.field_s.toUpperCase();
                    return;
                  } else {
                    this.field_m[1].field_e = lda.field_I.toUpperCase();
                    return;
                  }
                } else {
                  this.field_m[1].field_e = pc.field_g.toUpperCase();
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    static {
        field_q = new int[128];
    }
}
