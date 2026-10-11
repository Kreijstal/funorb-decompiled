/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb extends aba {
    private lka field_h;
    static String field_g;
    static ee[] field_k;
    static String field_i;
    static boolean field_j;

    public static void d(int param0) {
        field_k = null;
        if (param0 > -95) {
          return;
        }
        field_g = null;
        field_i = null;
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        if (kaa.field_m == param1) {
          return;
        }
        kaa.field_m = param1;
        ut.field_o = param2;
        tma.field_v = 0;
        if (!tn.a(kaa.field_m, 120)) {
          boolean decompiledFrameRemainder0 = true;
          if (iba.field_s == 0) {
            if (kaa.field_m != -3) {
              if (kaa.field_m != 7) {
                if (kaa.field_m == 8) {
                  ut.field_o = 0;
                }
              } else {
                ut.field_o = 0;
              }
              if ((~iba.field_s == param0 ||
                iba.field_s == 1) &&
                kaa.field_m == 0) {
                au.field_b = false;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              bf.field_f = false;
              au.field_b = true;
            }
          }
          if (decompiledFrameRemainder0) {
            if (kaa.field_m == 7) {
              ut.field_o = 0;
              if ((~iba.field_s == param0 ||
                iba.field_s == 1) && kaa.field_m == 0) {
                au.field_b = false;
              }
            } else {
              if (kaa.field_m != 8) {
                if ((~iba.field_s == param0 ||
                  iba.field_s == 1) &&
                  kaa.field_m == 0) {
                  au.field_b = false;
                }
              } else {
                ut.field_o = 0;
                if ((~iba.field_s == param0 ||
                  iba.field_s == 1) && kaa.field_m == 0) {
                  au.field_b = false;
                }
              }
            }
          }
        } else {
          eg.field_p[kaa.field_m].a(param3, 32);
          if (kaa.field_m == 11) {
            fba.a(param3, (byte) -77);
          }
          if (iba.field_s == 0) {
            if (kaa.field_m != -3) {
              if (kaa.field_m != 7) {
                if (kaa.field_m == 8) {
                  ut.field_o = 0;
                }
              } else {
                ut.field_o = 0;
              }
              if (~iba.field_s == param0) {
                if (kaa.field_m == 0) {
                  au.field_b = false;
                }
              } else {
                if (iba.field_s == 1 &&
                  kaa.field_m == 0) {
                  au.field_b = false;
                }
              }
              if (1 == kaa.field_m) {
                sia.field_h = true;
              }
              return;
            }
            bf.field_f = false;
            au.field_b = true;
          }
          if (kaa.field_m == 7) {
            ut.field_o = 0;
          } else {
            if (kaa.field_m == 8) {
              ut.field_o = 0;
            }
          }
          if (~iba.field_s == param0) {
            if (kaa.field_m == 0) {
              au.field_b = false;
            }
          } else {
            if (iba.field_s == 1 &&
              kaa.field_m == 0) {
              au.field_b = false;
            }
          }
        }
        if (1 == kaa.field_m) {
          sia.field_h = true;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var12 = 0;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7Lifetime1;
        var14 = BachelorFridge.field_y;
        try {
          var6_int = param1 + 8 + (487 + param5 + 8);
          gha.field_d.a(i.field_a.field_p - 6, 31407, -6 + var6_int, 3, 3);
          var7 = gha.field_d.field_p - 5;
          oi.field_w.a(param3, 31407, 2 + param1 - (-485 - param5), 5, -param3 + var7);
          jba.field_A.a(param3, 31407, -ts.field_r.field_sb + (oi.field_w.field_sb - param1), param1, 0);
          var7 = var7 - (param3 + 2);
          ts.field_r.a(param3, 31407, ts.field_r.field_sb, param1 + jba.field_A.field_sb, 0);
          af.field_b.a((byte) -58, -5 + var7, 5, 5, param5 + 2 + 485 + param1, param5, 2);
          if (ao.field_d != null) {
            ao.field_d.a(af.field_b.field_kb, af.field_b.field_p, (byte) 59, af.field_b.field_sb, af.field_b.field_rb);
          }
          var8 = -var6_int - param1 + i.field_a.field_sb;
          var9 = var8 / 2;
          var10 = param0 + var9 + param1;
          var11 = 0;
          for (var12 = 0; 6 > var12; var12++) {
            if (var12 >= 5 ||
              null != r.field_l[var12]) {
              var13 = (-6 + i.field_a.field_p + 2) * var11 / (rf.field_k + 1) + 3;
              var11++;
              var7Lifetime1 = -var13 + (3 + ((2 + (-6 + i.field_a.field_p)) * var11 / (rf.field_k + 1) - 2));
              if (var12 < 5) {
                r.field_l[var12].a(var7Lifetime1, 31407, var8, var6_int, var13);
                cb.field_o[var12].a(var7Lifetime1, 31407, var9 - param1, param1, 0);
                wg.field_i[var12].a(-param2 + var7Lifetime1 - param2, 31407, param0, var9, param2);
                bda.field_m[var12].a(var7Lifetime1 + (-param2 - param2), 31407, var8 - param1 - var10, var10, param2);
              } else {
                kg.field_a.a(var7Lifetime1, 31407, var8, var6_int, var13);
              }
            }
          }
          if (param4 >= -87) {
            field_j = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var6), "hb.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final jg a(String param0, boolean param1) {
        qu var3 = null;
        RuntimeException var3_ref = null;
        jg stackIn_2_0 = null;
        jg stackIn_8_0 = null;
        jg stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            stackIn_2_0 = (jg) null;
            return stackIn_2_0;
          }
          if (this.field_h instanceof mca) {
            var3 = ((mca) ((Object) this.field_h)).a(16728128);
            if (var3 != null &&
              var3.b(-19704) != cm.field_u) {
              stackIn_8_0 = jt.field_f;
              return stackIn_8_0;
            }
          }
          if (param0.equals(this.field_h.field_w)) {
            stackIn_12_0 = cm.field_u;
          } else {
            stackIn_12_0 = jt.field_f;
          }
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("hb.C(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final String a(byte param0, String param1) {
        qu var3 = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        String stackIn_12_0 = null;
        Object stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_h instanceof mca) {
            var3 = ((mca) ((Object) this.field_h)).a(16728128);
            if (var3 != null) {
              if (var3.b(-19704) == cm.field_u &&
                !param1.equals(this.field_h.field_w)) {
                stackIn_6_0 = sa.field_l;
                return stackIn_6_0;
              }
              stackIn_8_0 = var3.a((byte) 36);
              return stackIn_8_0;
            }
          }
          if (!param1.equals(this.field_h.field_w)) {
            stackIn_12_0 = sa.field_l;
            return stackIn_12_0;
          }
          var3_int = 117 / ((param0 + 8) / 45);
          stackIn_14_0 = null;
          return (String) (stackIn_14_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("hb.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    hb(lka param0, lka param1) {
        super(param0);
        try {
          this.field_h = param1;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "hb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = "EXCLUSIVE";
        field_i = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_j = false;
    }
}
