/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vq extends sp implements oe, ai {
    private qq field_B;
    private wp field_A;
    pe field_E;
    static String field_D;
    private wp field_C;

    private final boolean e(byte param0) {
        if (param0 != 91) {
            return false;
        }
        if (this.a((op) (this.field_B), (byte) -116)) {
            return true;
        }
        return false;
    }

    private final boolean a(op param0, byte param1) {
        v var3 = null;
        RuntimeException var3_ref = null;
        gf var4 = null;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = param0.a(-120);
            if (var3 == null) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var5 = 12 / ((-67 - param1) / 45);
                var4 = var3.c(35);
                if (qe.field_a != var4) {
                  stackIn_7_0 = 0;
                  break L1;
                } else {
                  stackIn_7_0 = 1;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("vq.F(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    private final void e(boolean param0) {
        if (!this.e((byte) 91)) {
            return;
        }
        if (!param0) {
            return;
        }
        ld.a(this.field_B.field_m, (byte) -47);
    }

    final static void a(int param0, int param1, byte[] param2, int param3, int param4, int param5, int param6) {
        int stackIn_11_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        var23 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (param3 <= 0) {
              break L0;
            } else {
              if (!rm.a(param3, -111)) {
                throw new IllegalArgumentException("");
              } else {
                break L0;
              }
            }
          }
          L1: {
            if ((param5 ^ -1) >= -1) {
              break L1;
            } else {
              if (rm.a(param5, param1 + -23259)) {
                break L1;
              } else {
                throw new IllegalArgumentException("");
              }
            }
          }
          L2: {
            var7_int = pc.a(param6, (byte) -83);
            var8 = 0;
            if (param3 >= param5) {
              stackIn_11_0 = param5;
              break L2;
            } else {
              stackIn_11_0 = param3;
              break L2;
            }
          }
          L3: {
            var9 = stackIn_11_0;
            if (param1 == 23143) {
              break L3;
            } else {
              field_D = (String) null;
              break L3;
            }
          }
          var10 = param3 >> 1147943617;
          var11 = param5 >> -690780479;
          var12 = param2;
          var13 = new byte[var7_int * (var11 * var10)];
          L4: while (true) {
            jaggl.OpenGL.glTexImage2Dub(param0, var8, param4, param3, param5, 0, param6, 5121, var12, 0);
            if (var9 > 1) {
              var16 = param3 * var7_int;
              var17 = 0;
              L5: while (true) {
                if (var7_int <= var17) {
                  var14 = var13;
                  var13 = var12;
                  param3 = var10;
                  var12 = var14;
                  param5 = var11;
                  var8++;
                  var10 = var10 >> 1;
                  var11 = var11 >> 1;
                  var9 = var9 >> 1;
                  continue L4;
                } else {
                  var18 = var17;
                  var19 = var17;
                  var20 = var19 - -var16;
                  var21 = 0;
                  L6: while (true) {
                    if (var11 <= var21) {
                      var17++;
                      continue L5;
                    } else {
                      var22 = 0;
                      L7: while (true) {
                        if (var10 <= var22) {
                          var19 = var19 + var16;
                          var20 = var20 + var16;
                          var21++;
                          continue L6;
                        } else {
                          var15 = var12[var19];
                          var19 = var19 + var7_int;
                          var15 = var15 + var12[var19];
                          var19 = var19 + var7_int;
                          var15 = var15 + var12[var20];
                          var20 = var20 + var7_int;
                          var15 = var15 + var12[var20];
                          var13[var18] = (byte)(var15 >> 1620415074);
                          var20 = var20 + var7_int;
                          var18 = var18 + var7_int;
                          var22++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var7);

            stackIn_29_1 = new StringBuilder().append("vq.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L8;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L8;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public vq() {
        super(0, 0, 496, 0, (mh) null);
        this.field_B = new qq("", (qm) null, 12);
        gm var1 = new gm(jm.field_a, 0, 0, 0, 0, 16777215, -1, 3, 0, kw.field_b.field_s, -1, 2147483647, true);
        pk var2 = new pk(gs.field_c, var1, (qm) null);
        this.field_C = new wp(tf.field_a, (qm) null);
        this.field_A = new wp(te.field_h, (qm) null);
        this.field_B.field_t = rq.field_a;
        this.field_B.a((byte) 127, new ou(this.field_B));
        this.field_C.field_x = false;
        this.field_C.field_w = (mh) ((Object) new ue());
        this.field_A.field_w = (mh) ((Object) new bv());
        this.field_B.field_w = (mh) ((Object) new nl(10000536));
        int var3 = 20;
        int var4 = 4;
        var2.a(92, 20, var3, 50, 270);
        int var5 = 200;
        this.a(var2, 81);
        var3 += 50;
        var3 = var3 + (5 + this.a(var3, 7541, 170, this.field_B, oq.field_r, un.field_c));
        this.field_C.a(126, 496 + -var5 >> 37360673, var3, 40, var5);
        this.field_A.a(-57, 3 + var4, var3 + 15, 40, 60);
        this.field_A.field_o = (qm) (this);
        this.field_C.field_o = (qm) (this);
        this.a(this.field_C, 123);
        this.a(this.field_A, 103);
        this.field_E = new pe((oe) (this));
        this.field_E.a(-64, 60 + this.field_B.field_r - -this.field_B.field_q, 20, 150, -this.field_B.field_q + (-this.field_B.field_r + this.field_q - 60));
        this.a(this.field_E, 65);
        this.a(116, 0, 0, 55 + (var3 - -var4), 496);
    }

    private final int a(byte param0, pk param1, int param2, int param3, String param4, String param5, int param6) {
        RuntimeException var8 = null;
        bn var9 = null;
        int var10 = 0;
        rt var11 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var11 = new rt(20, param2, 120 - -param3, 25, param1, false, 120, 3, kw.field_b, 16777215, param4);
            this.a(var11, 66);
            var9 = new bn(((op) ((Object) param1)).a(85), param5, 126, var11.field_p + param2, param3 - -25, param6);
            var10 = -54 % ((-13 - param0) / 61);
            var9.field_o = (qm) (this);
            this.a(var9, 92);
            stackIn_1_0 = var9.field_p + var11.field_p;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var8);

            stackIn_4_1 = new StringBuilder().append("vq.E(").append(param0).append(',');

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


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param5 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ',' + param6 + ')');
        }
        return stackIn_1_0;
    }

    public final void a(byte param0) {
        int var2 = -18 / ((param0 - 55) / 40);
        ((ou) ((Object) this.field_B.a(24))).e(-1);
    }

    public final void a(String param0, int param1) {
        qq var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = this.field_B;
            var4 = param0;
            ((dh) ((Object) var3)).a(false, var4, (byte) 13);
            if (param1 == 0) {
              break L0;
            } else {
              this.field_A = (wp) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var3_ref);

            stackIn_5_1 = new StringBuilder().append("vq.L(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public static void g(int param0) {
        byte[] var2;
        if (param0 < 105) {
          var2 = (byte[]) null;
          vq.a(71, -40, (byte[]) null, -64, 111, 108, -111);
          field_D = null;
          return;
        } else {
          field_D = null;
          return;
        }
    }

    final boolean a(pk param0, char param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        boolean stackIn_10_0 = false;
        boolean stackIn_13_0 = false;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, (byte) 98, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param2 > 9) {
                if (param3 == 98) {
                  stackIn_10_0 = this.a((byte) 121, param0);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (99 != param3) {
                    stackIn_15_0 = 0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    stackIn_13_0 = this.a(param0, false);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } else {
                stackIn_6_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var5);

            stackIn_18_1 = new StringBuilder().append("vq.KA(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L1;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L1;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0;
              } else {
                return stackIn_15_0 != 0;
              }
            }
          }
        }
    }

    private final int a(int param0, int param1, int param2, pk param3, String param4, String param5) {
        RuntimeException var7 = null;
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
              if (param1 == 7541) {
                break L1;
              } else {
                field_D = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = this.a((byte) 107, param3, param0, param2, param5, param4, 35);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7);

            stackIn_6_1 = new StringBuilder().append("vq.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

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
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

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
          throw qo.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, int param1, pk param2, int param3) {
        try {
            int var5_int = -111 / ((-25 - param1) / 45);
            super.a(param0, -86, param2, param3);
            this.field_C.field_x = this.e((byte) 91);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "vq.U(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public final void a(int param0, int param1, wp param2, int param3, int param4) {
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
              if (param2 == this.field_A) {
                mu.e(0);
                break L1;
              } else {
                if (this.field_C != param2) {
                  break L1;
                } else {
                  this.e(true);
                  break L1;
                }
              }
            }
            if (param1 == 710) {
              break L0;
            } else {
              this.field_C = (wp) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var6);

            stackIn_9_1 = new StringBuilder().append("vq.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw qo.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_D = "Are you sure you want to reset your stats?";
    }
}
