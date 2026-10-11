/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe extends pn {
    static int field_Z;
    static String[] field_U;
    private int field_Y;
    private of field_J;
    static String field_X;
    static String field_V;
    private er field_bb;
    static fe field_W;
    static long field_cb;
    private String field_ab;
    static og field_T;

    final String a(boolean param0) {
        if (!param0) {
          return null;
        }
        qe.h(-124);
        return null;
    }

    public static void h(int param0) {
        field_W = null;
        field_U = null;
        field_X = null;
        field_V = null;
        int var1 = 118 / ((11 - param0) / 39);
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        String var5;
        ba var6;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        String var17;
        Object var18;
        er var19;
        er var20;
        er var21;
        er var22;
        String var23;
        Object var24;
        er var25;
        er var26;
        er var27;
        er var28;
        Object var29;
        er var30;
        er var31;
        er var32;
        er var33;
        qa var34;
        qa var35;
        qa var36;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var11Lifetime4;
        int var12Lifetime4;
        int var11Lifetime1Lifetime1;
        int var12Lifetime1Lifetime1;
        ba var6Lifetime1;
        var18 = null;
        var24 = null;
        var29 = null;
        var13 = Vertigo2.field_L ? 1 : 0;
        var6 = this.field_J.a(-23996);
        if (var6 == tk.field_n) {
          var17 = lr.field_L;
          if (!var17.equals(this.field_w)) {
            this.field_w = var17;
            this.e((byte) -118);
          }
          super.a(param0, param1, param2, param3);
          var6 = this.field_J.a(-23996);
          var34 = (qa) ((Object) this.field_B);
          var9 = this.field_o + param2;
          var10 = var34.a((iq) (this), 1, param3) + (var34.b((iq) (this), 110).b((byte) 91) >> 1);
          if (tk.field_n == var6) {
            var20 = jn.field_b[0];
            var11 = var20.field_x << 1;
            var12 = var20.field_B << 1;
            if (null == this.field_bb) {
              this.field_bb = new er(var11, var12);
              lq.a(this.field_bb, (byte) -94);
            } else {
              if (this.field_bb.field_y < var11) {
                this.field_bb = new er(var11, var12);
                lq.a(this.field_bb, (byte) -94);
              } else {
                if (var12 <= this.field_bb.field_t) {
                  lq.a(this.field_bb, (byte) -94);
                  bi.c();
                } else {
                  this.field_bb = new er(var11, var12);
                  lq.a(this.field_bb, (byte) -94);
                }
              }
            }
            var20.a(112, 144, var20.field_x << 4, var20.field_B << 4, -this.field_Y << 10, 4096);
            ln.d(-28558);
            this.field_bb.d(-(var20.field_x >> 1) + var9, -var20.field_B + var10, 256);
            return;
          }
          if (dj.field_c != var6) {
            if (ir.field_a == var6) {
              var22 = jn.field_b[2];
              var22.d(var9, var10 - (var22.field_t >> 1), 256);
              return;
            }
            if (qm.field_G != var6) {
              return;
            }
            var21 = jn.field_b[1];
            var21.d(var9, var10 - (var21.field_t >> 1), 256);
            return;
          }
          var19 = jn.field_b[0];
          var11Lifetime4 = var19.field_x << 1;
          var12Lifetime4 = var19.field_B << 1;
          if (null != this.field_bb &&
            this.field_bb.field_y >= var11Lifetime4 &&
            var12Lifetime4 <= this.field_bb.field_t) {
            lq.a(this.field_bb, (byte) -94);
            bi.c();
          } else {
            this.field_bb = new er(var11Lifetime4, var12Lifetime4);
            lq.a(this.field_bb, (byte) -94);
          }
          var19.a(112, 144, var19.field_x << 4, var19.field_B << 4, -this.field_Y << 10, 4096);
          ln.d(-28558);
          this.field_bb.d(-(var19.field_x >> 1) + var9, -var19.field_B + var10, 256);
          return;
        }
        if (var6 == dj.field_c) {
          var23 = lr.field_L;
          if (!var23.equals(this.field_w)) {
            this.field_w = var23;
            this.e((byte) -118);
          }
          super.a(param0, param1, param2, param3);
          var6 = this.field_J.a(-23996);
          var35 = (qa) ((Object) this.field_B);
          var9Lifetime1 = this.field_o + param2;
          var10Lifetime1 = var35.a((iq) (this), 1, param3) + (var35.b((iq) (this), 110).b((byte) 91) >> 1);
          if (tk.field_n == var6) {
            var26 = jn.field_b[0];
            var11Lifetime1 = var26.field_x << 1;
            var12Lifetime1 = var26.field_B << 1;
            if (null == this.field_bb) {
              this.field_bb = new er(var11Lifetime1, var12Lifetime1);
              lq.a(this.field_bb, (byte) -94);
            } else {
              if (this.field_bb.field_y < var11Lifetime1) {
                this.field_bb = new er(var11Lifetime1, var12Lifetime1);
                lq.a(this.field_bb, (byte) -94);
              } else {
                if (var12Lifetime1 <= this.field_bb.field_t) {
                  lq.a(this.field_bb, (byte) -94);
                  bi.c();
                } else {
                  this.field_bb = new er(var11Lifetime1, var12Lifetime1);
                  lq.a(this.field_bb, (byte) -94);
                }
              }
            }
            var26.a(112, 144, var26.field_x << 4, var26.field_B << 4, -this.field_Y << 10, 4096);
            ln.d(-28558);
            this.field_bb.d(-(var26.field_x >> 1) + var9Lifetime1, -var26.field_B + var10Lifetime1, 256);
            return;
          }
          if (dj.field_c != var6) {
            if (ir.field_a == var6) {
              var28 = jn.field_b[2];
              var28.d(var9Lifetime1, var10Lifetime1 - (var28.field_t >> 1), 256);
              return;
            }
            if (qm.field_G != var6) {
              return;
            }
            var27 = jn.field_b[1];
            var27.d(var9Lifetime1, var10Lifetime1 - (var27.field_t >> 1), 256);
            return;
          }
          var25 = jn.field_b[0];
          var11Lifetime1Lifetime1 = var25.field_x << 1;
          var12Lifetime1Lifetime1 = var25.field_B << 1;
          if (null != this.field_bb &&
            this.field_bb.field_y >= var11Lifetime1Lifetime1 &&
            var12Lifetime1Lifetime1 <= this.field_bb.field_t) {
            lq.a(this.field_bb, (byte) -94);
            bi.c();
          } else {
            this.field_bb = new er(var11Lifetime1Lifetime1, var12Lifetime1Lifetime1);
            lq.a(this.field_bb, (byte) -94);
          }
          var25.a(112, 144, var25.field_x << 4, var25.field_B << 4, -this.field_Y << 10, 4096);
          ln.d(-28558);
          this.field_bb.d(-(var25.field_x >> 1) + var9Lifetime1, -var25.field_B + var10Lifetime1, 256);
          return;
        }
        var5 = this.field_J.d(-27183);
        if (var5 == null) {
          var5 = this.field_ab;
        }
        if (!var5.equals(this.field_w)) {
          this.field_w = var5;
          this.e((byte) -118);
        }
        super.a(param0, param1, param2, param3);
        var6Lifetime1 = this.field_J.a(-23996);
        var36 = (qa) ((Object) this.field_B);
        var9Lifetime2 = this.field_o + param2;
        var10Lifetime2 = var36.a((iq) (this), 1, param3) + (var36.b((iq) (this), 110).b((byte) 91) >> 1);
        if (tk.field_n == var6Lifetime1) {
          var31 = jn.field_b[0];
          var11Lifetime2 = var31.field_x << 1;
          var12Lifetime2 = var31.field_B << 1;
          if (null == this.field_bb) {
            this.field_bb = new er(var11Lifetime2, var12Lifetime2);
            lq.a(this.field_bb, (byte) -94);
          } else {
            if (this.field_bb.field_y < var11Lifetime2) {
              this.field_bb = new er(var11Lifetime2, var12Lifetime2);
              lq.a(this.field_bb, (byte) -94);
            } else {
              if (var12Lifetime2 > this.field_bb.field_t) {
                this.field_bb = new er(var11Lifetime2, var12Lifetime2);
                lq.a(this.field_bb, (byte) -94);
              } else {
                lq.a(this.field_bb, (byte) -94);
                bi.c();
              }
            }
          }
          var31.a(112, 144, var31.field_x << 4, var31.field_B << 4, -this.field_Y << 10, 4096);
          ln.d(-28558);
          this.field_bb.d(-(var31.field_x >> 1) + var9Lifetime2, -var31.field_B + var10Lifetime2, 256);
          return;
        }
        if (dj.field_c != var6Lifetime1) {
          if (ir.field_a == var6Lifetime1) {
            var33 = jn.field_b[2];
            var33.d(var9Lifetime2, var10Lifetime2 - (var33.field_t >> 1), 256);
            return;
          }
          if (qm.field_G != var6Lifetime1) {
            return;
          }
          var32 = jn.field_b[1];
          var32.d(var9Lifetime2, var10Lifetime2 - (var32.field_t >> 1), 256);
          return;
        }
        var30 = jn.field_b[0];
        var11Lifetime3 = var30.field_x << 1;
        var12Lifetime3 = var30.field_B << 1;
        if (null != this.field_bb &&
          this.field_bb.field_y >= var11Lifetime3 &&
          var12Lifetime3 <= this.field_bb.field_t) {
          lq.a(this.field_bb, (byte) -94);
          bi.c();
        } else {
          this.field_bb = new er(var11Lifetime3, var12Lifetime3);
          lq.a(this.field_bb, (byte) -94);
        }
        var30.a(112, 144, var30.field_x << 4, var30.field_B << 4, -this.field_Y << 10, 4096);
        ln.d(-28558);
        this.field_bb.d(-(var30.field_x >> 1) + var9Lifetime2, -var30.field_B + var10Lifetime2, 256);
    }

    final void a(byte param0, int param1, int param2, iq param3) {
        try {
          this.field_Y = this.field_Y + 1;
          if (param0 < 6) {
            this.field_bb = (er) null;
          }
          super.a((byte) 25, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "qe.E(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    qe(of param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, ni.a(false));
        try {
          this.field_ab = param1;
          this.field_J = param0;
          this.a(false, param2, param3, param5, param4);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "qe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean a(byte param0, iq param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 116) {
            return false;
          }
          this.field_ab = (String) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("qe.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static ch a(String param0, byte param1) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        Object stackIn_9_0 = null;
        ch stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (bf.field_b == um.field_F) {
            stackIn_2_0 = null;
            return (ch) (stackIn_2_0);
          }
          if (param1 < 42) {
            field_Z = 3;
          }
          if (oe.field_qb == um.field_F &&
            param0.equals(uk.field_u)) {
            um.field_F = l.field_a;
            stackIn_11_0 = rf.field_p;
            return stackIn_11_0;
          }
          uk.field_u = param0;
          rf.field_p = null;
          um.field_F = bf.field_b;
          stackIn_9_0 = null;
          return (ch) (stackIn_9_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("qe.B(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_X = "There are no valid types of game that match your preferences.";
        field_T = null;
    }
}
