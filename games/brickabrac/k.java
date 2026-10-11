/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class k extends pj implements hf {
    static String field_i;
    static pi field_h;
    static String field_j;
    private vb field_g;

    final qh c(int param0) {
        if (param0 != 4) {
          field_i = (String) null;
        }
        return this.a(this.field_g.field_A, (byte) 106);
    }

    abstract qh a(String param0, byte param1);

    final static void d(byte param0) {
        if (param0 < 114) {
          return;
        }
        ga.d(-105);
    }

    abstract String a(int param0, String param1);

    public final void a(vb param0, byte param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 > -39) {
            field_h = (pi) null;
            this.a(false);
          } else {
            this.a(false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("k.I(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static jp a(jp param0, int param1, int param2) {
        int var4 = 0;
        jp var3 = null;
        RuntimeException var3_ref = null;
        int var5 = 0;
        jp stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          var3 = new jp(param0.field_x, param2 * param0.field_z);
          var3.g();
          if (param1 <= 74) {
            field_i = (String) null;
          }
          for (var4 = 0; var4 < param2; var4++) {
            param0.c(0, param0.field_z * var4);
          }
          kc.field_q.a((byte) 89);
          stackIn_7_0 = var3;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("k.U(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int[] param3, int param4, int param5, int param6, int param7, int param8) {
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
        var19 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param4 >= 0 &&
            mg.field_b > param2) {
            if (param7 < param8 &&
              param0 < 0 &&
              param1 < 0) {
              return;
            }
            if (mg.field_e <= param7 &&
              param0 >= mg.field_e &&
              param1 >= mg.field_e) {
              return;
            }
            var14 = -param2 + param4;
            if (param5 == param2) {
              if (param4 == param2) {
                var9_int = param7 << 16;
                var11 = 0;
                var10 = param0 << 16;
                var12 = 0;
              } else {
                var15 = -param5 + param4;
                if (param0 > param7) {
                  var10 = param0 << 16;
                  var11 = (-param7 + param1 << 16) / var14;
                  var12 = (param1 - param0 << 16) / var15;
                  var9_int = param7 << 16;
                } else {
                  var9_int = param0 << 16;
                  var10 = param7 << 16;
                  var12 = (param1 - param7 << 16) / var14;
                  var11 = (-param0 + param1 << 16) / var15;
                }
              }
              if (param2 < 0) {
                param2 = Math.min(-param2, -param2 + param5);
                var10 = var10 + param2 * var12;
                var9_int = var9_int + var11 * param2;
                param2 = 0;
              }
              var13 = 0;
            } else {
              var10 = param7 << 16;
              var9_int = param7 << 16;
              var15 = -param2 + param5;
              var11 = (param0 - param7 << 16) / var15;
              var12 = (-param7 + param1 << 16) / var14;
              if (var11 >= var12) {
                var16 = var11;
                var11 = var12;
                var12 = var16;
                var13 = 1;
              } else {
                var13 = 0;
              }
              if (0 <= param2) {
                var16Lifetime2 = mg.field_g[param2];
                while (param5 > param2) {
                  var17 = var9_int >> 16;
                  if (mg.field_e > var17) {
                    var18 = -(var9_int >> 16) + (var10 >> 16);
                    if (var18 == 0) {
                      if (var17 >= 0 &&
                        mg.field_e > var17) {
                        wc.a(param3, var18, param6, var16Lifetime2 + var17, -1);
                      }
                    } else {
                      if (mg.field_e <= var17 + var18) {
                        var18 = -1 - var17 + mg.field_e;
                      }
                      if (var17 < 0) {
                        wc.a(param3, var17 + var18, param6, var16Lifetime2, -1);
                      } else {
                        wc.a(param3, var18, param6, var17 + var16Lifetime2, ~param8);
                      }
                    }
                  }
                  param2++;
                  if (param2 >= mg.field_b) {
                    return;
                  }
                  var9_int = var9_int + var11;
                  var16Lifetime2 = var16Lifetime2 + lb.field_c;
                  var10 = var10 + var12;
                }
              } else if (param5 >= 0) {
                param2 = -param2;
                var10 = var10 + var12 * param2;
                var9_int = var9_int + param2 * var11;
                param2 = 0;
                var16Lifetime2 = mg.field_g[param2];
                while (param5 > param2) {
                  var17 = var9_int >> 16;
                  if (mg.field_e > var17) {
                    var18 = -(var9_int >> 16) + (var10 >> 16);
                    if (var18 == 0) {
                      if (var17 >= 0 &&
                        mg.field_e > var17) {
                        wc.a(param3, var18, param6, var16Lifetime2 + var17, -1);
                      }
                    } else {
                      if (mg.field_e <= var17 + var18) {
                        var18 = -1 - var17 + mg.field_e;
                      }
                      if (var17 < 0) {
                        wc.a(param3, var17 + var18, param6, var16Lifetime2, -1);
                      } else {
                        wc.a(param3, var18, param6, var17 + var16Lifetime2, ~param8);
                      }
                    }
                  }
                  param2++;
                  if (param2 >= mg.field_b) {
                    return;
                  }
                  var9_int = var9_int + var11;
                  var16Lifetime2 = var16Lifetime2 + lb.field_c;
                  var10 = var10 + var12;
                }
              } else {
                param2 = param5 - param2;
                var9_int = var9_int + param2 * var11;
                var10 = var10 + var12 * param2;
                param2 = param5;
              }
              var16Lifetime3 = param4 - param5;
              if (var16Lifetime3 != 0) {
                var17Lifetime2 = param1 << 16;
                if (var13 == 0) {
                  var9_int = param0 << 16;
                } else {
                  var10 = param0 << 16;
                }
                var12 = (-var10 + var17Lifetime2) / var16Lifetime3;
                var11 = (var17Lifetime2 - var9_int) / var16Lifetime3;
              } else {
                var12 = 0;
                var11 = 0;
              }
            }
            if (param2 < 0) {
              param2 = -param2;
              var9_int = var9_int + var11 * param2;
              var10 = var10 + param2 * var12;
              param2 = 0;
            }
            var15Lifetime1 = mg.field_g[param2];
            while (param2 < param4) {
              var16Lifetime1 = var9_int >> 16;
              if (mg.field_e > var16Lifetime1) {
                var17Lifetime1 = (var10 >> 16) - (var9_int >> 16);
                if (var17Lifetime1 == 0) {
                  if (var16Lifetime1 >= 0 &&
                    var16Lifetime1 < mg.field_e) {
                    wc.a(param3, var17Lifetime1, param6, var16Lifetime1 + var15Lifetime1, -1);
                  }
                } else {
                  if (mg.field_e <= var16Lifetime1 + var17Lifetime1) {
                    var17Lifetime1 = -1 + mg.field_e - var16Lifetime1;
                  }
                  if (var16Lifetime1 >= 0) {
                    wc.a(param3, var17Lifetime1, param6, var16Lifetime1 + var15Lifetime1, -1);
                  } else {
                    wc.a(param3, var17Lifetime1 + var16Lifetime1, param6, var15Lifetime1, -1);
                  }
                }
              }
              param2++;
              if (param2 >= mg.field_b) {
                return;
              }
              var15Lifetime1 = var15Lifetime1 + lb.field_c;
              var9_int = var9_int + var11;
              var10 = var10 + var12;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_94_0 = var9;
          stackIn_94_1 = new StringBuilder().append("k.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_95_2 = "null";
          } else {
            stackIn_95_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_94_0), ((StringBuilder) (Object) stackIn_94_1).append(stackIn_95_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    public static void c(byte param0) {
        field_i = null;
        field_j = null;
        field_h = null;
        if (param0 > -73) {
          field_i = (String) null;
        }
    }

    final String b(int param0) {
        if (param0 != 28600) {
          field_j = (String) null;
        }
        return this.a(56, this.field_g.field_A);
    }

    public final boolean a(byte param0) {
        boolean stackIn_7_0 = false;
        if (param0 > -27) {
          k.d((byte) 112);
        }
        stackIn_7_0 = (this.field_g.field_A == null) || (0 == this.field_g.field_A.length());
        return stackIn_7_0;
    }

    k(vb param0) {
        try {
          this.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "k.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(vb param0, int param1) {
        try {
          if (param1 != -40) {
            String var4 = (String) null;
            this.a((String) null, (byte) -114);
          }
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "k.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_j = "OK";
        field_i = "Staff impersonation";
    }
}
