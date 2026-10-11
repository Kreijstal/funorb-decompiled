/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qb extends vg implements wj {
    private oe field_Y;
    static int[] field_ab;
    static da field_cb;
    private int field_Z;
    static wb field_L;
    static String field_X;
    static String[] field_W;
    static String field_bb;

    final void a(oe param0, boolean param1) {
        try {
          if (param1) {
            this.j(68);
          }
          this.field_Y = param0;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "qb.QA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static ud a(boolean param0, qi param1) {
        ud var2 = null;
        RuntimeException var2_ref = null;
        ud stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            field_ab = (int[]) null;
          }
          var2 = new ud(param1, param1);
          uc.field_j.a(var2, -7044);
          ti.field_f.a(param1);
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("qb.PA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void j(int param0) {
        super.j(-115);
        if (null != this.field_Y) {
          this.field_Y.a((byte) -127);
        }
        int var2 = 82 % ((param0 + 67) / 44);
    }

    final String c(byte param0) {
        if (!this.field_v) {
          return null;
        }
        if (null != this.field_z) {
          if (param0 <= 14) {
            this.a(-32);
          }
          ja.a(ad.field_m, gb.field_j + this.field_t - this.field_Z, (byte) -41);
          return this.field_z;
        }
        return null;
    }

    qb(String param0, dg param1, int param2) {
        super(param0, param1, param2);
    }

    final void a(int param0, int param1, int param2, rc param3) {
        try {
          super.a(param0, param1, param2, param3);
          this.field_Z = -this.field_m + gb.field_j - param0;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "qb.JA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public final oe a(int param0) {
        if (param0 <= 22) {
          return (oe) null;
        }
        return this.field_Y;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7, int param8) {
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        String stackIn_95_2 = null;
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
        var19 = SolKnight.field_L ? 1 : 0;
        try {
          if (0 <= param1 &&
            hk.field_a > param0) {
            if (param5 < 0 &&
              0 > param2 &&
              param4 < 0) {
              return;
            }
            if (hk.field_i <= param5 &&
              param2 >= hk.field_i &&
              hk.field_i <= param4) {
              return;
            }
            var14 = param1 - param0;
            if (param0 != param8) {
              var10 = param5 << 16;
              var9_int = param5 << 16;
              var15 = -param0 + param8;
              var12 = (param4 - param5 << 16) / var14;
              var11 = (-param5 + param2 << 16) / var15;
              if (var12 > var11) {
                var13 = 0;
              } else {
                var13 = 1;
                var16 = var11;
                var11 = var12;
                var12 = var16;
              }
              if (0 <= param0) {
                var16Lifetime2 = hk.field_d[param0];
                while (param8 > param0) {
                  var17 = var9_int >> 16;
                  if (var17 < hk.field_i) {
                    var18 = -(var9_int >> 16) + (var10 >> 16);
                    if (0 == var18) {
                      if (var17 >= 0 &&
                        var17 < hk.field_i) {
                        wd.a(0, var16Lifetime2 + var17, var18, param3, param7);
                      }
                    } else {
                      if (var18 + var17 >= hk.field_i) {
                        var18 = hk.field_i + (-var17 - 1);
                      }
                      if (var17 >= 0) {
                        wd.a(0, var17 + var16Lifetime2, var18, param3, param7);
                      } else {
                        wd.a(0, var16Lifetime2, var17 + var18, param3, param7);
                      }
                    }
                  }
                  param0++;
                  if (param0 >= hk.field_a) {
                    return;
                  }
                  var9_int = var9_int + var11;
                  var16Lifetime2 = var16Lifetime2 + mi.field_a;
                  var10 = var10 + var12;
                }
              } else if (param8 >= 0) {
                param0 = -param0;
                var9_int = var9_int + param0 * var11;
                var10 = var10 + var12 * param0;
                param0 = 0;
                var16Lifetime2 = hk.field_d[param0];
                while (param8 > param0) {
                  var17 = var9_int >> 16;
                  if (var17 < hk.field_i) {
                    var18 = -(var9_int >> 16) + (var10 >> 16);
                    if (0 == var18) {
                      if (var17 >= 0 &&
                        var17 < hk.field_i) {
                        wd.a(0, var16Lifetime2 + var17, var18, param3, param7);
                      }
                    } else {
                      if (var18 + var17 >= hk.field_i) {
                        var18 = hk.field_i + (-var17 - 1);
                      }
                      if (var17 >= 0) {
                        wd.a(0, var17 + var16Lifetime2, var18, param3, param7);
                      } else {
                        wd.a(0, var16Lifetime2, var17 + var18, param3, param7);
                      }
                    }
                  }
                  param0++;
                  if (param0 >= hk.field_a) {
                    return;
                  }
                  var9_int = var9_int + var11;
                  var16Lifetime2 = var16Lifetime2 + mi.field_a;
                  var10 = var10 + var12;
                }
              } else {
                param0 = -param0 + param8;
                var10 = var10 + param0 * var12;
                var9_int = var9_int + param0 * var11;
                param0 = param8;
              }
              var16Lifetime3 = param1 - param8;
              if (var16Lifetime3 == 0) {
                var11 = 0;
                var12 = 0;
              } else {
                if (var13 != 0) {
                  var10 = param2 << 16;
                } else {
                  var9_int = param2 << 16;
                }
                var17Lifetime2 = param4 << 16;
                var11 = (-var9_int + var17Lifetime2) / var16Lifetime3;
                var12 = (-var10 + var17Lifetime2) / var16Lifetime3;
              }
            } else {
              if (param1 != param0) {
                var15 = -param8 + param1;
                if (param2 > param5) {
                  var9_int = param5 << 16;
                  var12 = (-param2 + param4 << 16) / var15;
                  var10 = param2 << 16;
                  var11 = (-param5 + param4 << 16) / var14;
                } else {
                  var9_int = param2 << 16;
                  var11 = (-param2 + param4 << 16) / var15;
                  var12 = (-param5 + param4 << 16) / var14;
                  var10 = param5 << 16;
                }
              } else {
                var11 = 0;
                var10 = param2 << 16;
                var9_int = param5 << 16;
                var12 = 0;
              }
              if (param0 < 0) {
                param0 = Math.min(-param0, param8 - param0);
                var9_int = var9_int + var11 * param0;
                var10 = var10 + var12 * param0;
                param0 = 0;
              }
              var13 = 0;
            }
            if (param6 < 31) {
              return;
            }
            if (param0 < 0) {
              param0 = -param0;
              var9_int = var9_int + var11 * param0;
              var10 = var10 + var12 * param0;
              param0 = 0;
            }
            var15Lifetime1 = hk.field_d[param0];
            while (param1 > param0) {
              var16Lifetime1 = var9_int >> 16;
              if (var16Lifetime1 < hk.field_i) {
                var17Lifetime1 = (var10 >> 16) - (var9_int >> 16);
                if (var17Lifetime1 != 0) {
                  if (var17Lifetime1 + var16Lifetime1 >= hk.field_i) {
                    var17Lifetime1 = -1 + hk.field_i - var16Lifetime1;
                  }
                  if (0 <= var16Lifetime1) {
                    wd.a(0, var16Lifetime1 + var15Lifetime1, var17Lifetime1, param3, param7);
                  } else {
                    wd.a(0, var15Lifetime1, var17Lifetime1 + var16Lifetime1, param3, param7);
                  }
                } else {
                  if (0 <= var16Lifetime1 &&
                    hk.field_i > var16Lifetime1) {
                    wd.a(0, var16Lifetime1 + var15Lifetime1, var17Lifetime1, param3, param7);
                  }
                }
              }
              param0++;
              if (param0 >= hk.field_a) {
                return;
              }
              var10 = var10 + var12;
              var9_int = var9_int + var11;
              var15Lifetime1 = var15Lifetime1 + mi.field_a;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_94_0 = var9;
          stackIn_94_1 = new StringBuilder().append("qb.EB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_95_2 = "null";
          } else {
            stackIn_95_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_94_0), ((StringBuilder) (Object) stackIn_94_1).append(stackIn_95_2).append(',').append(param8).append(')').toString());
        }
    }

    public static void f(byte param0) {
        field_cb = null;
        int var1 = 113 / ((-12 - param0) / 49);
        field_L = null;
        field_X = null;
        field_ab = null;
        field_bb = null;
        field_W = null;
    }

    static {
        field_ab = new int[8192];
        field_L = new wb(2);
        field_X = "COMBO<br>BONUS";
        field_bb = "Loading fonts";
        field_W = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
    }
}
