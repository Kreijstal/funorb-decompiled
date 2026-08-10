/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vf implements fe, pj {
    int field_r;
    int field_i;
    int field_j;
    ok field_a;
    int field_h;
    int field_p;
    int field_g;
    private int field_d;
    private boolean field_f;
    int field_s;
    int field_k;
    static si field_e;
    static String field_t;
    static String field_o;
    int field_b;
    static int field_l;
    static va field_q;
    int field_m;
    static bi field_n;
    static int field_c;

    public void a(byte param0, int param1, boolean param2, fj param3, int param4) {
        if (!(this.field_a != null)) {
            return;
        }
        try {
            this.a((byte) -112, param3, param4, param1);
            if (param0 > -97) {
                field_c = -49;
            }
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "vf.C(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public final int a(fj param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = -82 / ((param1 - -84) / 32);
            stackIn_1_0 = param0.field_F - this.field_h + -this.field_r;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("vf.Q(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    public final sc a(fj param0, byte param1) {
        RuntimeException var3 = null;
        sc stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0.field_p != null) {
                break L1;
              } else {
                param0.field_p = (sc) ((Object) new c());
                break L1;
              }
            }
            L2: {
              if (param1 < -81) {
                break L2;
              } else {
                field_n = (bi) null;
                break L2;
              }
            }
            L3: {
              if (!this.field_f) {
                this.b(2147483647, param0);
                break L3;
              } else {
                ((c) ((Object) param0.field_p)).a(this.b(param0, -2), this.a(param0, -124), this.field_p, 3, this.field_k, this.field_s, this.c(param0, 126), this.field_a);
                break L3;
              }
            }
            stackIn_8_0 = param0.field_p;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("vf.S(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_8_0;
    }

    private final void b(int param0, fj param1) {
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null == param1.field_p) {
                param1.field_p = (sc) ((Object) new c());
                break L1;
              } else {
                break L1;
              }
            }
            var3_int = this.a(param1, -121);
            var4 = this.c(param1, -104);
            if (param0 == 2147483647) {
              L2: {
                var6 = this.field_k;
                if (var6 != 0) {
                  if (-3 == (var6 ^ -1)) {
                    var5 = -this.field_a.field_D + var4;
                    break L2;
                  } else {
                    L3: {
                      if ((var6 ^ -1) == -4) {
                        break L3;
                      } else {
                        if ((var6 ^ -1) == -2) {
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var5 = this.field_a.field_C + (var4 - this.field_a.field_C - this.field_a.field_D >> -1356927839);
                    break L2;
                  }
                } else {
                  var5 = this.field_a.field_C;
                  break L2;
                }
              }
              L4: {
                L5: {
                  var6 = this.field_p;
                  if (0 != var6) {
                    if (-4 != (var6 ^ -1)) {
                      L6: {
                        if (-2 == (var6 ^ -1)) {
                          if (!(param1.field_p instanceof c)) {
                            break L6;
                          } else {
                            ((c) ((Object) param1.field_p)).a(var3_int >> 323596033, 121, var5, this.b(param1, param0 + 2147483647), this.field_a);
                            break L4;
                          }
                        } else {
                          if (var6 == 2) {
                            if (param1.field_p instanceof c) {
                              ((c) ((Object) param1.field_p)).a(this.field_a, this.b(param1, -2), var5, var3_int, -103);
                              break L6;
                            } else {
                              break L4;
                            }
                          } else {
                            break L4;
                          }
                        }
                      }
                      break L4;
                    } else {
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                if (param1.field_p instanceof c) {
                  ((c) ((Object) param1.field_p)).a(var5, 0, (byte) -24, this.field_a, this.b(param1, -2));
                  break L4;
                } else {
                  break L4;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var3);

            stackIn_33_1 = new StringBuilder().append("vf.DA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L7;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L7;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final int a(int param0, int param1, fj param2) {
        RuntimeException var4 = null;
        fj var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 2) {
                break L1;
              } else {
                var5 = (fj) null;
                this.a(27, (fj) null, 93, 37, -60);
                break L1;
              }
            }
            stackIn_3_0 = this.a(param2, param1 + 123, param0, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("vf.P(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    private final int a(fj param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = -16 / ((param1 - 63) / 58);
            stackIn_1_0 = this.field_b + param2 - (-param0.field_m - param0.field_y + -param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var5);

            stackIn_4_1 = new StringBuilder().append("vf.AA(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_1_0;
    }

    public final int a(int param0, fj param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.a(param1, (byte) -110);
              if (param0 == -1870081887) {
                break L1;
              } else {
                this.field_g = -44;
                break L1;
              }
            }
            stackIn_3_0 = param1.field_p.b(23791) + this.field_b - -this.field_j;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("vf.T(").append(param0).append(',');

            if (param1 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, fj param6, int param7) {
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            lc.a(param6.field_q + param3, param6.field_F + (param3 - -param6.field_q), param6.field_m + (param2 + param6.field_z), param2 - -param6.field_m, param5 ^ -29579);
            if (param5 == -18866) {
              L1: {
                var9_int = this.a(param6, 111);
                var10 = this.c(param6, 88);
                if (!this.field_f) {
                  L2: {
                    var12 = this.field_k;
                    if (var12 != 0) {
                      if (-3 == (var12 ^ -1)) {
                        var11 = var10 - this.field_a.field_D;
                        break L2;
                      } else {
                        L3: {
                          if (3 != var12) {
                            if (-2 != (var12 ^ -1)) {
                              break L3;
                            } else {
                              break L3;
                            }
                          } else {
                            break L3;
                          }
                        }
                        var11 = this.field_a.field_C - -(var10 - this.field_a.field_C + -this.field_a.field_D >> -1870081887);
                        break L2;
                      }
                    } else {
                      var11 = this.field_a.field_C;
                      break L2;
                    }
                  }
                  L4: {
                    var12 = this.field_p;
                    if (var12 == 0) {
                      break L4;
                    } else {
                      if (var12 != 3) {
                        if (-2 != (var12 ^ -1)) {
                          if (-3 == (var12 ^ -1)) {
                            this.field_a.a(this.b(param6, -2), var9_int + this.a(param3, 14525, param1, param6), this.a(param6, -28, param2, param4) - -var11, param7, param0);
                            break L1;
                          } else {
                            break L1;
                          }
                        } else {
                          this.field_a.b(this.b(param6, -2), this.a(param3, 14525, param1, param6) - -(var9_int >> 1631180257), this.a(param6, -59, param2, param4) + var11, param7, param0);
                          break L1;
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                  this.field_a.c(this.b(param6, -2), this.a(param3, 14525, param1, param6), var11 + this.a(param6, -91, param2, param4), param7, param0);
                  break L1;
                } else {
                  this.field_a.a(this.b(param6, -2), this.a(param3, 14525, param1, param6), this.a(param6, -34, param2, param4), var9_int, var10, param7, param0, this.field_p, this.field_k, this.field_s);
                  break L1;
                }
              }
              ib.b(false);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var9 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var9);

            stackIn_29_1 = new StringBuilder().append("vf.FA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L5;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L5;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final int a(fj param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 0) {
                break L1;
              } else {
                field_n = (bi) null;
                break L1;
              }
            }
            stackIn_3_0 = this.a(param1, 14525, 0, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("vf.R(");

            if (param0 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    private final void a(byte param0, fj param1, int param2, int param3) {
        try {
            this.a(this.field_d, 0, param2, param3, 0, -18866, param1, this.field_i);
            int var5_int = -105 % ((-53 - param0) / 59);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "vf.CA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final int c(fj param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = -44 % ((-33 - param1) / 39);
            stackIn_1_0 = -this.field_j + param0.field_z + -this.field_b;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("vf.EA(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final void a(boolean param0, vf param1) {
        param1.field_f = this.field_f;
        param1.field_g = this.field_g;
        param1.field_m = this.field_m;
        param1.field_h = this.field_h;
        param1.field_j = this.field_j;
        param1.field_r = this.field_r;
        param1.field_d = this.field_d;
        param1.field_a = this.field_a;
        param1.field_k = this.field_k;
        param1.field_b = this.field_b;
        param1.field_p = this.field_p;
        param1.field_s = this.field_s;
        if (param0) {
            return;
        }
        try {
            param1.field_i = this.field_i;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "vf.GA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final int a(int param0) {
        if (param0 != -1431655766) {
            this.field_k = -127;
        }
        return this.field_a.field_D + this.field_a.field_C;
    }

    final static int a(int param0, int param1) {
        param0 = ((-1431655766 & param0) >>> -1850434431) + (1431655765 & param0);
        param0 = (858993459 & param0) - -((-858993459 & param0) >>> -508614974);
        if (param1 != -29047) {
            field_o = (String) null;
        }
        param0 = param0 - -(param0 >>> 889626212) & 252645135;
        param0 = param0 + (param0 >>> 2096579176);
        param0 = param0 + (param0 >>> 1485592944);
        return param0 & 255;
    }

    final static void a(byte param0, int param1) {
        qn.field_n = param1;
        if (param0 > -109) {
            field_c = 89;
        }
    }

    vf(ok param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    public final void a(int param0, fj param1, int param2, int param3, int param4) {
        int var7 = 0;
        sd var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        fj var13 = null;
        sc var14 = null;
        sc var15 = null;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_5_0;
        int stackIn_5_1;
        int stackIn_5_2;
        int stackIn_5_3;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            L1: {
              if (param1.e((byte) 21)) {
                L2: {
                  var14 = this.a(param1, (byte) -113);
                  var15 = var14;
                  var7 = var15.b(-90, param4);
                  var8 = var14.field_c[var7];
                  var9 = var15.a(param4, -115);
                  var10 = this.a(param0, 14525, var9, param1);
                  var11 = this.a(param2, 2, param1) + Math.max(0, var8.field_d);
                  stackIn_4_0 = this.a(param2, 2, param1);

                  stackIn_4_1 = this.c(param1, -122);

                  stackIn_4_2 = var8.field_a;

                  if (var15.field_c.length <= var7 - -1) {
                    stackIn_5_0 = stackIn_4_0;
                    stackIn_5_1 = stackIn_4_1;
                    stackIn_5_2 = stackIn_4_2;
                    stackIn_5_3 = var8.field_a;
                    break L2;
                  } else {
                    stackIn_5_0 = stackIn_4_0;
                    stackIn_5_1 = stackIn_4_1;
                    stackIn_5_2 = stackIn_4_2;
                    stackIn_5_3 = var14.field_c[var7 - -1].field_d;
                    break L2;
                  }
                }
                var12 = stackIn_5_0 + Math.min(stackIn_5_1, Math.min(stackIn_5_2, stackIn_5_3));
                lc.a(param1.field_q + param0, param1.field_F + param1.field_q + param0, param1.field_z + param1.field_m + param2, param2 + param1.field_m, 14907);
                bg.field_d.a(var10, var11, var12, var10, (byte) -62, this.field_m);
                ib.b(false);
                break L1;
              } else {
                break L1;
              }
            }
            L3: {
              if (param3 <= -19) {
                break L3;
              } else {
                var13 = (fj) null;
                this.b((fj) null, 103);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var6);

            stackIn_11_1 = new StringBuilder().append("vf.N(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    String b(fj param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -2) {
                break L1;
              } else {
                this.field_i = 102;
                break L1;
              }
            }
            stackIn_3_0 = param0.field_B;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("vf.K(");

            if (param0 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public final void a(int param0, fj param1, int param2, int param3, int param4, int param5) {
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        sd var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        sc var17 = null;
        sc var18 = null;
        var16 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            if (param2 == 0) {
              if (param5 != param3) {
                L1: {
                  if (param1.e((byte) 85)) {
                    L2: {
                      var17 = this.a(param1, (byte) -115);
                      var18 = var17;
                      if (param3 >= param5) {
                        var9 = param3;
                        var8 = param5;
                        break L2;
                      } else {
                        var8 = param3;
                        var9 = param5;
                        break L2;
                      }
                    }
                    var10 = var18.b(-96, var8);
                    var11 = var18.b(-120, var9);
                    lc.a(param0 - -param1.field_q, param1.field_q + param0 + param1.field_F, param4 - -param1.field_m + param1.field_z, param4 + param1.field_m, 14907);
                    var12 = var10;
                    L3: while (true) {
                      if (var12 > var11) {
                        ib.b(false);
                        break L1;
                      } else {
                        L4: {
                          var13 = var17.field_c[var12];
                          if (var10 != var12) {
                            stackIn_15_0 = var13.field_e[0];
                            break L4;
                          } else {
                            stackIn_15_0 = var18.a(var8, -102);
                            break L4;
                          }
                        }
                        L5: {
                          var14 = stackIn_15_0;
                          if (var12 != var11) {
                            if (var13 != null) {
                              stackIn_20_0 = var13.field_e[var13.field_e.length + -1];
                              break L5;
                            } else {
                              stackIn_20_0 = 0;
                              break L5;
                            }
                          } else {
                            stackIn_20_0 = var18.a(var9, -102);
                            break L5;
                          }
                        }
                        var15 = stackIn_20_0;
                        bg.field_d.a(this.a(param0, param2 ^ 14525, var14, param1), var13.field_d + (param1.field_y + this.field_b) + param4 - -param1.field_m, this.field_g >>> -1887480584, 126, -var14 + var15, var13.field_a, this.field_g);
                        var12++;
                        continue L3;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var7 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var7);

            stackIn_25_1 = new StringBuilder().append("vf.L(").append(param0).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L6;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L6;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    private final int a(int param0, int param1, int param2, fj param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 14525) {
              stackIn_4_0 = param2 + param3.field_v + this.field_h + (param0 - -param3.field_q);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -22;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("vf.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public final int a(byte param0, int param1, int param2, int param3, int param4, fj param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.a(param5, (byte) -99);
              if (param0 > 76) {
                break L1;
              } else {
                vf.b(34);
                break L1;
              }
            }
            stackIn_3_0 = param5.field_p.a(-this.a(param1, 2, param5) + param2, (byte) -126, -this.a(param5, param3, 0) + param4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7);

            stackIn_6_1 = new StringBuilder().append("vf.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    protected vf() {
    }

    public static void b(int param0) {
        field_e = null;
        if (param0 != -1) {
            vf.a(-103, 57);
        }
        field_q = null;
        field_o = null;
        field_n = null;
        field_t = null;
    }

    vf(ok param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
            this.field_b = param3;
            this.field_m = param10;
            this.field_p = param7;
            this.field_s = param9;
            this.field_r = param2;
            this.field_g = param11;
            this.field_d = param6;
            this.field_a = param0;
            this.field_h = param1;
            this.field_f = param12 ? true : false;
            this.field_k = param8;
            this.field_j = param4;
            this.field_i = param5;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "vf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    public final int a(byte param0, fj param1) {
        RuntimeException var3 = null;
        vf var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.a(param1, (byte) -103);
              if (param0 > 117) {
                break L1;
              } else {
                var4 = (vf) null;
                this.a(true, (vf) null);
                break L1;
              }
            }
            stackIn_3_0 = param1.field_p.a(true) + (this.field_h - -this.field_r);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("vf.O(").append(param0).append(',');

            if (param1 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_e = new si(2);
        field_o = null;
        field_l = 50;
        field_t = "This creates a powerful#defensive force field#around your ship.";
        field_q = new va();
        field_c = 0;
    }
}
