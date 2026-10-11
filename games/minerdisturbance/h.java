/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h {
    static ea field_c;
    static int field_b;
    static int[] field_a;
    static wh field_d;

    final static String[] a(char param0, boolean param1, String param2) {
        int var7 = 0;
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        String[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = MinerDisturbance.field_ab;
        try {
          var10 = (CharSequence) ((Object) param2);
          var3_int = fe.a((byte) 74, param0, var10);
          var4 = new String[var3_int + 1];
          var5 = 0;
          var6 = 0;
          for (var7 = 0; var7 < var3_int; var7++) {
            for (var8 = var6; param2.charAt(var8) != param0; var8++) {
            }
            incrementValue$1 = var5;
            var5++;
            var4[incrementValue$1] = param2.substring(var6, var8);
            var6 = var8 + 1;
          }
          if (!param1) {
            field_a = (int[]) null;
          }
          var4[var3_int] = param2.substring(var6);
          stackIn_10_0 = var4;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("h.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        if (!param0) {
          h.a(true);
        }
        field_a = null;
        field_c = null;
        field_d = null;
    }

    final static void a(boolean param0) {
        ri.a((byte) -112, bm.c(-125));
        if (param0) {
          h.b(true);
        }
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var17Lifetime2;
        var19 = MinerDisturbance.field_ab;
        try {
          if (param4 >= 0 &&
            param1 < dj.field_f) {
            if (param8 < 0 &&
              param3 < 0 &&
              param5 < 0) {
              return;
            }
            if (dj.field_b <= param8 &&
              dj.field_b <= param3 &&
              param5 >= dj.field_b) {
              return;
            }
            var14 = param4 - param1;
            if (param1 != param0) {
              var10 = param8 << 16;
              var9_int = param8 << 16;
              var15 = param0 - param1;
              var12 = (-param8 + param5 << 16) / var14;
              var11 = (-param8 + param3 << 16) / var15;
              if (var12 > var11) {
                var13 = 0;
              } else {
                var13 = 1;
                var16 = var11;
                var11 = var12;
                var12 = var16;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param1 < 0) {
                if (param0 < 0) {
                  param1 = -param1 + param0;
                  var9_int = var9_int + var11 * param1;
                  var10 = var10 + param1 * var12;
                  param1 = param0;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param1 = -param1;
                  var9_int = var9_int + var11 * param1;
                  var10 = var10 + var12 * param1;
                  param1 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var16Lifetime2 = dj.field_a[param1];
                while (param1 < param0) {
                  var17 = var9_int >> 16;
                  if (dj.field_b > var17) {
                    var18 = -(var9_int >> 16) + (var10 >> 16);
                    if (var18 != 0) {
                      if (dj.field_b <= var18 + var17) {
                        var18 = -var17 + (dj.field_b - 1);
                      }
                      if (0 > var17) {
                        s.a(param2, -1, var16Lifetime2, param7, var17 + var18);
                      } else {
                        s.a(param2, -1, var17 + var16Lifetime2, param7, var18);
                      }
                    } else {
                      if (var17 >= 0 &&
                        var17 < dj.field_b) {
                        s.a(param2, param6 ^ 13611, var17 + var16Lifetime2, param7, var18);
                      }
                    }
                  }
                  param1++;
                  if (param1 >= dj.field_f) {
                    return;
                  }
                  var9_int = var9_int + var11;
                  var10 = var10 + var12;
                  var16Lifetime2 = var16Lifetime2 + eh.field_g;
                }
              }
              var16Lifetime3 = -param0 + param4;
              if (var16Lifetime3 != 0) {
                if (var13 != 0) {
                  var10 = param3 << 16;
                } else {
                  var9_int = param3 << 16;
                }
                var17Lifetime2 = param5 << 16;
                var11 = (var17Lifetime2 - var9_int) / var16Lifetime3;
                var12 = (-var10 + var17Lifetime2) / var16Lifetime3;
              } else {
                var12 = 0;
                var11 = 0;
              }
            } else {
              if (param1 != param4) {
                var15 = param4 - param0;
                if (param8 >= param3) {
                  var11 = (param5 - param3 << 16) / var15;
                  var12 = (-param8 + param5 << 16) / var14;
                  var10 = param8 << 16;
                  var9_int = param3 << 16;
                } else {
                  var12 = (-param3 + param5 << 16) / var15;
                  var11 = (param5 - param8 << 16) / var14;
                  var10 = param3 << 16;
                  var9_int = param8 << 16;
                }
              } else {
                var11 = 0;
                var12 = 0;
                var10 = param3 << 16;
                var9_int = param8 << 16;
              }
              var13 = 0;
              if (param1 < 0) {
                param1 = Math.min(-param1, param0 - param1);
                var10 = var10 + var12 * param1;
                var9_int = var9_int + var11 * param1;
                param1 = 0;
              }
            }
            if (param6 != -13612) {
              return;
            }
            if (0 > param1) {
              param1 = -param1;
              var10 = var10 + param1 * var12;
              var9_int = var9_int + param1 * var11;
              param1 = 0;
            }
            var15Lifetime1 = dj.field_a[param1];
            while (param4 > param1) {
              var16Lifetime1 = var9_int >> 16;
              if (var16Lifetime1 < dj.field_b) {
                var17Lifetime1 = (var10 >> 16) - (var9_int >> 16);
                if (var17Lifetime1 == 0) {
                  if (var16Lifetime1 >= 0 &&
                    var16Lifetime1 < dj.field_b) {
                    s.a(param2, param6 + 13611, var16Lifetime1 + var15Lifetime1, param7, var17Lifetime1);
                  }
                } else {
                  if (var16Lifetime1 + var17Lifetime1 >= dj.field_b) {
                    var17Lifetime1 = -1 + (dj.field_b - var16Lifetime1);
                  }
                  if (0 <= var16Lifetime1) {
                    s.a(param2, -1, var15Lifetime1 + var16Lifetime1, param7, var17Lifetime1);
                  } else {
                    s.a(param2, -1, var15Lifetime1, param7, var17Lifetime1 + var16Lifetime1);
                  }
                }
              }
              param1++;
              if (param1 >= dj.field_f) {
                return;
              }
              var15Lifetime1 = var15Lifetime1 + eh.field_g;
              var10 = var10 + var12;
              var9_int = var9_int + var11;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_80_0 = var9;
          stackIn_80_1 = new StringBuilder().append("h.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_80_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    final static void a(int param0) {
        if (!oc.d(param0 + 59)) {
          return;
        }
        qd.a(126, false, param0);
    }

    final static void b(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        hf var4_ref_hf = null;
        Object var5 = null;
        int var6 = 0;
        int[] var7 = null;
        byte[] var8 = null;
        af var9 = null;
        ld var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        var6 = MinerDisturbance.field_ab;
        try {
          var10 = kj.field_a;
          if (param0 <= 105) {
            var7 = (int[]) null;
            h.a(66, 0, (int[]) null, -109, -10, 74, -76, 25, -33);
          }
          var2 = var10.d((byte) -54);
          if (0 == var2) {
            var9 = (af) (ag.field_b.b(108));
            if (var9 == null) {
              si.a(-37);
              return;
            }
            var4 = var10.d((byte) -54);
            if (0 != var4) {
              var12 = new byte[var4];
              var11 = var12;
              var8 = var11;
              var5 = var8;
              var10.a(var12, (byte) -120, 0, var4);
            } else {
              var5 = null;
            }
            var10.field_o = var10.field_o + 4;
            if (!var10.f(0)) {
              si.a(-56);
              return;
            }
            var9.field_t = (byte[]) (var5);
            var9.field_q = true;
            var9.b(34);
          } else {
            if (var2 == 1) {
              var3 = var10.b((byte) 119);
              var4_ref_hf = (hf) (kk.field_a.b(109));
              while (var4_ref_hf != null) {
                if (var3 != var4_ref_hf.field_o) {
                  var4_ref_hf = (hf) (kk.field_a.b((byte) 56));
                  continue;
                }
                break;
              }
              if (var4_ref_hf == null) {
                si.a(-60);
                return;
              }
              var4_ref_hf.b(34);
              return;
            }
            di.a((Throwable) null, 1, "A1: " + hj.a((byte) 118));
            si.a(-56);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var1), "h.D(" + param0 + ')');
        }
    }

    static {
        field_b = -1;
        field_a = new int[8192];
    }
}
