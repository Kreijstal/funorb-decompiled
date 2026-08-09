/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cja extends bca {
    int field_u;
    int field_s;
    static int field_v;
    static String field_r;
    int field_q;
    static String field_t;

    final void a(op param0, int param1) {
        try {
            int var3_int = -69 % ((param1 - 12) / 35);
            this.a(param0, (byte) -2);
            param0.b((byte) -64, this.field_q, this.field_s, this.field_u);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "cja.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    cja(lu param0) {
        super(param0);
        int var2_int = 0;
        try {
            this.field_k = param0.e((byte) 105);
            this.field_o = new eaa();
            var2_int = param0.b(16711935);
            while (true) {
                var2_int--;
                if (0 > var2_int) {
                    break;
                }
                this.field_o.a(dca.a((byte) 102, param0), true);
            }
            this.field_s = param0.b(16711935);
            this.field_u = param0.b(16711935);
            this.field_q = param0.b(16711935);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "cja.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(int param0) {
        field_r = null;
        field_t = null;
        if (param0 != -23353) {
            field_v = 32;
        }
    }

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        lu var4 = null;
        mm stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 5) {
                break L1;
              } else {
                var4 = (lu) null;
                cja.a((uha) null, (lu) null, 81, true);
                break L1;
              }
            }
            stackIn_3_0 = new mm(param1, (cja) (this));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("cja.A(").append(param0).append(',');

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
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return (at) ((Object) stackIn_3_0);
    }

    cja(int param0, nq param1) {
        super(param0, param1);
    }

    final static void a(int param0, kv param1, byte param2, int param3, int param4) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        try {
          L0: {
            L1: {
              param4 = param4 + param1.field_u;
              param3 = param3 + param1.field_t;
              var5_int = param3 - -(param4 * dg.field_i);
              var6 = 0;
              var7 = param1.field_p;
              var8 = param1.field_q;
              var9 = -var8 + dg.field_i;
              if (dg.field_j > param4) {
                var11 = -param4 + dg.field_j;
                var7 = var7 - var11;
                var6 = var6 + var8 * var11;
                param4 = dg.field_j;
                var5_int = var5_int + dg.field_i * var11;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var10 = 0;
              if (param3 >= dg.field_f) {
                break L2;
              } else {
                var11 = -param3 + dg.field_f;
                var6 = var6 + var11;
                var9 = var9 + var11;
                var8 = var8 - var11;
                var10 = var10 + var11;
                param3 = dg.field_f;
                var5_int = var5_int + var11;
                break L2;
              }
            }
            L3: {
              if (dg.field_k < var7 + param4) {
                var7 = var7 - (-dg.field_k + (param4 + var7));
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (dg.field_h >= var8 + param3) {
                break L4;
              } else {
                var11 = -dg.field_h + (var8 + param3);
                var9 = var9 + var11;
                var8 = var8 - var11;
                var10 = var10 + var11;
                break L4;
              }
            }
            L5: {
              if (-1 <= (var8 ^ -1)) {
                break L5;
              } else {
                if (0 < var7) {
                  if (param2 <= -103) {
                    el.a(var8, var6, var9, var5_int, 125, param0, dg.field_e, param1.field_v, var10, var7);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L5;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var5);

            stackIn_20_1 = new StringBuilder().append("cja.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
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

    final static void a(uha param0, lu param1, int param2, boolean param3) {
        uha stackIn_6_0 = null;
        uha stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        uha stackIn_9_0 = null;
        uha stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        uha stackIn_12_0 = null;
        uha stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        uha stackIn_15_0 = null;
        uha stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        uha stackIn_21_0 = null;
        uha stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        uha stackIn_24_0 = null;
        uha stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        StringBuilder stackIn_45_1 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param3) {
                param0.field_Rb = param1.b(16711935);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              param0.field_Pb = param1.b(16711935);
              param0.field_Kb = param1.b(16711935);
              var4_int = param1.b(16711935);
              stackIn_6_0 = (uha) (param0);

              if (0 == (128 & var4_int)) {
                stackIn_7_0 = (uha) ((Object) stackIn_6_0);
                stackIn_7_1 = 0;
                break L2;
              } else {
                stackIn_7_0 = (uha) ((Object) stackIn_6_0);
                stackIn_7_1 = 1;
                break L2;
              }
            }
            L3: {
              stackIn_7_0.field_Bb = stackIn_7_1 != 0;
              stackIn_9_0 = (uha) (param0);

              if ((32 & var4_int) == 0) {
                stackIn_10_0 = (uha) ((Object) stackIn_9_0);
                stackIn_10_1 = 0;
                break L3;
              } else {
                stackIn_10_0 = (uha) ((Object) stackIn_9_0);
                stackIn_10_1 = 1;
                break L3;
              }
            }
            L4: {
              stackIn_10_0.field_dc = stackIn_10_1 != 0;
              stackIn_12_0 = (uha) (param0);

              if (-1 != (16 & var4_int ^ -1)) {
                stackIn_13_0 = (uha) ((Object) stackIn_12_0);
                stackIn_13_1 = 2;
                break L4;
              } else {
                stackIn_13_0 = (uha) ((Object) stackIn_12_0);
                stackIn_13_1 = 1;
                break L4;
              }
            }
            L5: {
              stackIn_13_0.field_Lb = stackIn_13_1;
              stackIn_15_0 = (uha) (param0);

              if (0 == (var4_int & 64)) {
                stackIn_16_0 = (uha) ((Object) stackIn_15_0);
                stackIn_16_1 = 0;
                break L5;
              } else {
                stackIn_16_0 = (uha) ((Object) stackIn_15_0);
                stackIn_16_1 = 1;
                break L5;
              }
            }
            stackIn_16_0.field_Zb = stackIn_16_1 != 0;
            if (param2 >= 47) {
              L6: {
                L7: {
                  stackIn_21_0 = (uha) (param0);

                  if (!param0.field_Bb) {
                    break L7;
                  } else {
                    stackIn_21_0 = (uha) ((Object) stackIn_21_0);

                    if (param0.field_Pb <= param0.field_Rb) {
                      break L7;
                    } else {
                      stackIn_22_0 = (uha) ((Object) stackIn_21_0);
                      stackIn_22_1 = 1;
                      break L6;
                    }
                  }
                }
                stackIn_22_0 = (uha) ((Object) stackIn_21_0);
                stackIn_22_1 = 0;
                break L6;
              }
              L8: {
                stackIn_22_0.field_zb = stackIn_22_1 != 0;
                stackIn_24_0 = (uha) (param0);

                if ((var4_int & 8) == 0) {
                  stackIn_25_0 = (uha) ((Object) stackIn_24_0);
                  stackIn_25_1 = 0;
                  break L8;
                } else {
                  stackIn_25_0 = (uha) ((Object) stackIn_24_0);
                  stackIn_25_1 = 1;
                  break L8;
                }
              }
              L9: {
                stackIn_25_0.field_Fb = stackIn_25_1 != 0;
                if (0 == (var4_int & 4)) {
                  stackIn_28_0 = 0;
                  break L9;
                } else {
                  stackIn_28_0 = 1;
                  break L9;
                }
              }
              L10: {
                var5 = stackIn_28_0;
                if ((var4_int & 2) == 0) {
                  stackIn_31_0 = 0;
                  break L10;
                } else {
                  stackIn_31_0 = 1;
                  break L10;
                }
              }
              L11: {
                var6 = stackIn_31_0;
                param1.a(param0.field_Eb, param0.field_Eb.length, 128, 0);
                param0.field_bc = param1.e((byte) 64);
                param0.field_Ob = f.b((byte) 73) + -(long)param1.f(-124);
                if (var5 == 0) {
                  param0.field_Nb = -1;
                  break L11;
                } else {
                  param0.field_Nb = param1.f(51);
                  break L11;
                }
              }
              param0.field_Sb = param1.c(-120);
              var7 = param1.field_g;
              param0.field_Jb = param1.g(-87);
              if (var6 != 0) {
                param0.field_Cb = new String[param0.field_Rb];
                param1.field_g = var7;
                var8 = 0;
                L12: while (true) {
                  if (param0.field_Rb <= var8) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    param0.field_Cb[var8] = param1.g(-88);
                    var8++;
                    continue L12;
                  }
                }
              } else {
                param0.field_Cb = null;
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var4 = decompiledCaughtException;
            stackIn_42_0 = (RuntimeException) (var4);

            stackIn_42_1 = new StringBuilder().append("cja.B(");

            if (param0 == null) {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L13;
            } else {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L13;
            }
          }
          L14: {


            stackIn_45_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_43_2).append(',');

            if (param1 == null) {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "null";
              break L14;
            } else {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "{...}";
              break L14;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_43_0), stackIn_46_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(byte param0, lu param1) {
        super.a((byte) -47, param1);
        param1.d(this.field_s, 0);
        param1.d(this.field_u, 0);
        if (param0 > -12) {
            return;
        }
        try {
            param1.d(this.field_q, 0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "cja.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_r = "Lobby";
        field_v = 22;
        field_t = "Fruit & Veg";
    }
}
