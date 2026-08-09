/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v extends pj implements ra, ke, fh {
    private qg field_S;
    private qg field_Q;
    private qg field_K;
    private qg field_ab;
    private hf field_L;
    private nc field_T;
    private qa field_Z;
    static String field_U;
    jd field_V;
    private qg field_P;
    static he[] field_W;
    private hf field_R;
    static int field_N;
    static String field_X;
    static nh field_Y;
    private qg field_J;
    static nh field_O;

    private final int a(String param0, int param1, vg param2, byte param3, int param4, String param5, int param6) {
        RuntimeException var8 = null;
        ci var9 = null;
        dh var10 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var10 = new dh(20, param4, param1 + 120, 25, param2, false, 120, 3, uh.field_i, 16777215, param0);
              if (param3 <= -74) {
                break L1;
              } else {
                this.field_Q = (qg) null;
                break L1;
              }
            }
            this.b(var10, (byte) 51);
            var9 = new ci(((ud) ((Object) param2)).a((byte) 36), param5, 126, param4 + var10.field_k, param1 - -50, param6);
            var9.field_u = (fd) (this);
            this.b(var9, (byte) 89);
            stackIn_3_0 = var9.field_k + var10.field_k;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var8);

            stackIn_6_1 = new StringBuilder().append("v.E(");

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param6 + ')');
        }
        return stackIn_3_0;
    }

    public final void a(String param0, int param1) {
        qg var3 = null;
        String var4 = null;
        if (param1 != 0) {
            return;
        }
        try {
            var3 = this.field_K;
            var4 = param0;
            ((kl) ((Object) var3)).a(false, var4, param1 ^ -19116);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "v.Q(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final int a(int param0, vg param1, String param2, int param3, int param4) {
        dh var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6 = new dh(20, param4, param0 + 120, 25, param1, false, 120, 3, uh.field_i, param3, param2);
            this.b(var6, (byte) 127);
            stackIn_1_0 = var6.field_k;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var6_ref);

            stackIn_4_1 = new StringBuilder().append("v.L(").append(param0).append(',');

            if (param1 == null) {
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
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_1_0;
    }

    public final void a(int param0, int param1, boolean param2, hf param3, int param4) {
        boolean discarded$1 = false;
        RuntimeException var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2) {
                break L1;
              } else {
                this.field_Z = (qa) null;
                break L1;
              }
            }
            if (param3 != this.field_L) {
              if (param3 != this.field_R) {
                break L0;
              } else {
                discarded$1 = this.k(-1);
                return;
              }
            } else {
              gf.d((byte) 103);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var6);

            stackIn_9_1 = new StringBuilder().append("v.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param4 + ')');
        }
    }

    final void a(vg param0, int param1, int param2, byte param3) {
        try {
            super.a(param0, param1, param2, (byte) -128);
            if (param3 >= -127) {
                this.field_J = (qg) null;
            }
            this.field_R.field_E = this.g((byte) 72);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "v.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void j(int param0) {
        field_O = null;
        field_X = null;
        if (param0 != 3) {
            return;
        }
        field_W = null;
        field_Y = null;
        field_U = null;
    }

    private final boolean a(byte param0, ud param1) {
        String discarded$1 = null;
        qi var3 = null;
        RuntimeException var3_ref = null;
        vh var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 < -79) {
                break L1;
              } else {
                discarded$1 = this.i(-91);
                break L1;
              }
            }
            var3 = param1.a((byte) 27);
            if (var3 == null) {
              stackIn_5_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var4 = var3.a(-12317);
              if (u.field_b == var4) {
                stackIn_9_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (var4 != ai.field_A) {
                  if (pi.field_P != var4) {
                    stackIn_17_0 = 1;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    stackIn_15_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_12_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3_ref);

            stackIn_20_1 = new StringBuilder().append("v.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L2;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_15_0 != 0;
              } else {
                return stackIn_17_0 != 0;
              }
            }
          }
        }
    }

    final boolean a(int param0, char param1, vg param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_9_0 = false;
        boolean stackIn_12_0 = false;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, 86)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param3 >= 63) {
                  break L1;
                } else {
                  v.j(24);
                  break L1;
                }
              }
              if ((param0 ^ -1) == -99) {
                stackIn_9_0 = this.a(param2, 65535);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param0 != 99) {
                  stackIn_14_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_12_0 = this.a(param2, (byte) 43);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var5);

            stackIn_17_1 = new StringBuilder().append("v.BA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              return stackIn_14_0 != 0;
            }
          }
        }
    }

    private final boolean k(int param0) {
        if (!this.g((byte) -109)) {
            return false;
        }
        int var2 = param0;
        try {
            var2 = Integer.parseInt(this.field_Q.field_p);
        } catch (NumberFormatException numberFormatException) {
        }
        return hg.a(this.field_S.field_p, this.field_T.field_A, var2, (byte) -38, this.field_P.field_p, this.field_K.field_p, (v) (this));
    }

    private final boolean g(byte param0) {
        int var2;
        var2 = 5 / ((param0 - -57) / 46);
        if (this.a((byte) -119, this.field_K)) {
          if (this.a((byte) -112, this.field_P)) {
            if (this.a((byte) -128, this.field_J)) {
              if (this.a((byte) -111, this.field_S)) {
                if (this.a((byte) -95, this.field_ab)) {
                  if (!this.a((byte) -104, this.field_Q)) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    private final int a(vg param0, int param1, byte param2, int param3, String param4) {
        int discarded$1 = 0;
        RuntimeException var6 = null;
        gm var7 = null;
        String var8 = null;
        dh var9 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var9 = new dh(20, param1, 120 - -param3, 25, param0, false, 120, 3, uh.field_i, 16777215, param4);
              this.b(var9, (byte) 62);
              if (param2 < -25) {
                break L1;
              } else {
                var8 = (String) null;
                discarded$1 = this.a(-113, (vg) null, (String) null, 70, 32);
                break L1;
              }
            }
            var7 = new gm(((ud) ((Object) param0)).a((byte) 21));
            this.b(var7, (byte) 67);
            var7.a((-15 + var9.field_k >> 1950272577) + var9.field_m, 15, var9.field_w + var9.field_o - -3, 16535, 15);
            stackIn_3_0 = var9.field_k;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var6);

            stackIn_6_1 = new StringBuilder().append("v.H(");

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    private final String l(int param0) {
        String discarded$0 = null;
        if (param0 != 15) {
            discarded$0 = this.l(-60);
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    public final void a(int param0, int param1, qa param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 <= -90) {
                break L1;
              } else {
                this.field_V = (jd) null;
                break L1;
              }
            }
            if (0 != param0) {
              if ((param0 ^ -1) != -2) {
                if ((param0 ^ -1) != -3) {
                  break L0;
                } else {
                  nd.a(-1, "conduct.ws");
                  return;
                }
              } else {
                nd.a(-1, "privacy.ws");
                return;
              }
            } else {
              nd.a(-1, "terms.ws");
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("v.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param3 + ')');
        }
    }

    public final void a(byte param0) {
        ((pk) ((Object) this.field_K.a((byte) 84))).e((byte) -27);
        if (param0 > -23) {
            this.field_Z = (qa) null;
        }
    }

    private final int a(int param0, vg param1, String param2, int param3, byte param4, String param5) {
        RuntimeException var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param4 < -80) {
              stackIn_4_0 = this.a(param2, param3, param1, (byte) -89, param0, param5, 35);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -67;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var7);

            stackIn_7_1 = new StringBuilder().append("v.B(").append(param0).append(',');

            if (param1 == null) {
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
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final String i(int param0) {
        if (param0 > -1) {
            this.field_J = (qg) null;
            return "</col></u>";
        }
        return "</col></u>";
    }

    public v() {
        super(0, 0, 496, 0, (cg) null);
        this.field_K = new qg("", (fd) null, 12);
        this.field_P = new qg("", (fd) null, 100);
        this.field_J = new qg("", (fd) null, 100);
        this.field_S = new qg("", (fd) null, 20);
        this.field_ab = new qg("", (fd) null, 20);
        this.field_Q = new qg("", (fd) null, 3);
        int var1 = 1;
        this.field_T = new nc("", (fd) null, var1 != 0);
        this.field_R = new hf(vd.field_d, (fd) null);
        this.field_L = new hf(ej.field_c, (fd) null);
        this.field_K.field_v = bj.field_c;
        this.field_P.field_v = fm.field_i;
        this.field_J.field_v = ad.field_r;
        this.field_S.field_v = md.field_b;
        this.field_ab.field_v = ch.field_u;
        this.field_Q.field_v = ci.field_K;
        this.field_T.field_v = dc.field_g;
        this.field_K.a(new pk(this.field_K), (byte) -57);
        this.field_P.a(new ni(this.field_P), (byte) -57);
        this.field_J.a(new e(this.field_J, this.field_P), (byte) -57);
        this.field_S.a(new ad(this.field_S, this.field_K, this.field_P), (byte) -57);
        this.field_ab.a(new nf(this.field_ab, this.field_S), (byte) -57);
        this.field_Q.a(new g(this.field_Q), (byte) -57);
        this.field_R.field_E = false;
        this.field_R.field_l = (cg) ((Object) new ie());
        this.field_L.field_l = (cg) ((Object) new uk());
        this.field_K.field_l = (cg) ((Object) new mj(10000536));
        mj dupTemp$0 = new mj(10000536);
        this.field_J.field_l = (cg) ((Object) dupTemp$0);
        this.field_P.field_l = (cg) ((Object) dupTemp$0);
        this.field_Q.field_l = (cg) ((Object) new mj(10000536));
        this.field_T.field_l = (cg) ((Object) new ue());
        dm dupTemp$1 = new dm(10000536);
        this.field_ab.field_l = (cg) ((Object) dupTemp$1);
        this.field_S.field_l = (cg) ((Object) dupTemp$1);
        String var2 = a.a(5044, fk.field_p, new String[]{this.l(15), this.i(-87)});
        int var3 = 20;
        var3 = var3 + this.a(170, this.field_P, ge.field_c, 16777215, var3);
        var3 = var3 + (this.a(ta.field_a, 170, this.field_J, (byte) -103, var3, "", 20) - -5);
        var3 = var3 + this.a(170, this.field_S, qf.field_a, 16777215, var3);
        var3 = var3 + (this.a(var3, this.field_ab, cf.field_a, 170, (byte) -105, ob.field_d) + 5);
        var3 = var3 + (this.a(var3, this.field_K, hj.field_h, 170, (byte) -83, vh.field_b) - -5);
        var3 = var3 + this.a(this.field_Q, var3, (byte) -77, 170, ri.field_c);
        dh var4 = new dh(46, var3, -90 + this.field_w, 25, this.field_T, true, -120 + this.field_w, 5, u.field_d, 11579568, li.field_d);
        this.b(var4, (byte) 105);
        var3 = var3 + var4.field_k;
        l var5 = new l(uh.field_i, 0, 0, 0, 0, 16777215, -1, 0, 0, uh.field_i.field_x, -1, 2147483647, true);
        this.field_Z = new qa(var2, var5);
        this.field_Z.field_v = "";
        this.field_Z.a(we.field_d, 0, -64);
        this.field_Z.a(we.field_d, 1, -73);
        this.field_Z.field_u = (fd) (this);
        this.field_Z.b(0, this.field_w - 90, 46, var3);
        var3 = var3 + (this.field_Z.field_k + 15);
        this.b(this.field_Z, (byte) 81);
        int var6 = 4;
        int var7 = 200;
        this.field_R.a(var3, 40, -var7 + 496 >> 1943477921, 16535, var7);
        this.field_L.a(15 + var3, 40, var6 + 3, 16535, 60);
        this.field_L.field_u = (fd) (this);
        this.field_R.field_u = (fd) (this);
        this.b(this.field_R, (byte) 105);
        this.b(this.field_L, (byte) 39);
        this.field_V = new jd((fh) (this));
        this.field_V.a(this.field_K.field_m + 20, 150, this.field_K.field_o - -this.field_K.field_w - -60, 16535, -60 + -this.field_K.field_w + (this.field_w - this.field_K.field_o));
        this.b(this.field_V, (byte) 118);
        this.a(0, var6 + (55 + var3), 0, 16535, 496);
    }

    static {
        field_U = "Best";
        field_X = "Play the game without logging in just yet";
        field_W = new he[3];
    }
}
