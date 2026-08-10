/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk extends ql {
    private md field_X;
    private String field_R;
    static int[] field_U;
    private boolean field_T;
    static int field_V;
    private boolean field_S;
    private String field_W;

    final static void a(int param0, int param1, int param2, ab param3, int param4, byte param5, int param6, int param7, String param8) {
        qd.field_b = param2;
        if (param5 != -92) {
            return;
        }
        try {
            ni.field_e = param1;
            fc.field_q = param6;
            jc.field_c = param7;
            sa.field_g = param3;
            wg.field_e = param4;
            fl.field_d = param8;
            rc.field_i = param0;
            kb.field_b = (wb) ((Object) new qf());
            u.field_pb = new kl(param3);
            nh.field_a = new pg(kb.field_b, u.field_pb);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "uk.M(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    uk(eg param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            this.field_R = param1;
            if (this.field_R != null) {
                var3_int = ra.field_c.a(this.field_R, 260, ra.field_c.field_E);
                this.b(300, -114, 150 - -var3_int);
            }
            this.field_X = new md(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_X.field_G = true;
            this.field_T = false;
            this.field_S = false;
            this.b((byte) 70, this.field_X);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "uk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, byte param1, int param2) {
        int var4;
        var4 = 3 % ((-3 - param1) / 43);
        super.a(param0, (byte) 116, param2);
        ra.field_c.a(this.field_W, param2 + (this.field_j >> -909811167), param0 - -103, 16777215, -1);
        if (this.field_R == null) {
          return;
        } else {
          lf.a(20 + param2, param0 - -120 + -7, 260, 8421504);
          ra.field_c.a(this.field_R, 20 + param2, 120 + param0 + 8, 260, 100, 16777215, -1, 1, 0, ra.field_c.field_E);
          return;
        }
    }

    final void a(boolean param0, String param1, int param2, float param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        boolean stackIn_2_0 = false;
        boolean stackIn_3_0 = false;
        int stackIn_3_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              stackIn_2_0 = param0;

              if (this.field_S) {
                stackIn_3_0 = stackIn_2_0;
                stackIn_3_1 = 0;
                break L1;
              } else {
                stackIn_3_0 = stackIn_2_0;
                stackIn_3_1 = 1;
                break L1;
              }
            }
            L2: {
              if ((stackIn_3_0 ? 1 : 0) != stackIn_3_1) {
                break L2;
              } else {
                L3: {
                  stackIn_6_0 = this;

                  if (!param0) {
                    stackIn_7_0 = this;
                    stackIn_7_1 = 0;
                    break L3;
                  } else {
                    stackIn_7_0 = this;
                    stackIn_7_1 = 1;
                    break L3;
                  }
                }
                ((uk) (this)).field_S = stackIn_7_1 != 0;
                if (this.field_S) {
                  this.field_X.b(4210752, 8405024, 86);
                  this.field_X.field_G = true;
                  break L2;
                } else {
                  this.field_X.b(4210752, 2113632, 122);
                  if (!this.field_T) {
                    break L2;
                  } else {
                    this.field_X.field_G = false;
                    break L2;
                  }
                }
              }
            }
            var5_int = -115 / ((param2 - 92) / 33);
            this.field_X.field_K = (int)(65536.0f * (param3 / 100.0f));
            this.field_W = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (runtimeException);

            stackIn_15_1 = new StringBuilder().append("uk.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static jb a(int param0, sh param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 45 / ((62 - param0) / 60);
          if (nb.a(param2, param3, (byte) -45, param1)) {
            return ql.e(false);
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("uk.Q(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L0;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L0;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static db[] a(String param0, String param1, int param2, sh param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        db[] stackIn_2_0 = null;
        db[] stackIn_4_0 = null;
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
            if (param2 == -909811167) {
              var4_int = param3.c(param1, (byte) -89);
              var5 = param3.a(param0, -27964, var4_int);
              stackIn_4_0 = fi.a(param3, var5, (byte) 62, var4_int);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (db[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("uk.L(");

            if (param0 == null) {
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

            if (param1 == null) {
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


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw ld.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void i(int param0) {
        int var1 = 121 % ((param0 - -30) / 35);
        field_U = null;
    }

    final static void g(boolean param0) {
        int fieldTemp$2 = 0;
        th var1 = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var3 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var1 = ed.field_q;
              if (param0) {
                break L1;
              } else {
                uk.g(false);
                break L1;
              }
            }
            L2: while (true) {
              if (!kf.d(true)) {
                break L0;
              } else {
                var1.h(8, 0);
                fieldTemp$2 = var1.field_h + 1;
                var1.field_h = var1.field_h + 1;
                var2 = fieldTemp$2;
                ej.a(-17, var1);
                ed.field_q.d(-var2 + var1.field_h, (byte) -125);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var1_ref), "uk.A(" + param0 + ')');
        }
    }

    final void h(int param0) {
        sh var3;
        this.field_T = true;
        this.field_X.field_G = false;
        if (param0 == 4210752) {
          return;
        } else {
          var3 = (sh) null;
          uk.a(-77, (sh) null, 44, -33);
          return;
        }
    }

    static {
        field_U = new int[15];
    }
}
