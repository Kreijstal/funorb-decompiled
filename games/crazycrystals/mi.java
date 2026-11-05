/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mi extends ea implements Cloneable {
    static int[] field_A;
    private transient boolean field_w;
    private dl[] field_y;
    transient fq field_C;
    transient fq field_z;
    transient int field_u;
    private boolean field_B;
    int field_E;
    transient int field_t;
    static fp field_D;
    static int field_v;
    static dl[] field_x;

    final boolean a(mj param0, boolean param1, f[][] param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("mi.PA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final f b(f[][] param0, int param1, byte param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        f stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_l.a(param0, param3, (byte) 40, param1);
          var5_int = 67 / ((param2 + 43) / 51);
          if ((this.field_s | this.field_o) != 0) {
            aa.field_a.a(128, 12 * param3 + this.field_m * this.field_o, this.field_m * this.field_s + 12 * param1, 0, (byte) -111);
          }
          stackIn_4_0 = super.b(param0, param1, (byte) -110, param3);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("mi.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static db c(int param0, int param1) {
        if (param1 > -94) {
          return (db) null;
        }
        return qk.a(param0, -114, false, true, false, 1);
    }

    public static void h(int param0) {
        field_A = null;
        if (param0 != -20188) {
          return;
        }
        field_x = null;
        field_D = null;
    }

    final nj a(int param0, nj param1) {
        RuntimeException var3 = null;
        nj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 23525) {
            this.e(115, 40, (f[][]) null, -25);
          }
          stackIn_3_0 = ng.a(ec.field_n, param1, new mi(new kp(-1), true), (byte) -83, ch.field_c);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("mi.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static dl[] b(int param0, int param1) {
        int var3 = -18 % ((param0 + 26) / 60);
        dl[] var4 = new dl[9];
        dl[] var2 = var4;
        var4[4] = mc.a(64, -64, param1);
        return var2;
    }

    final void a(int param0, f[][] param1, int param2, int param3) {
        try {
          this.field_t = param2;
          this.field_u = param3;
          if (param0 != -35) {
            this.field_w = false;
          }
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "mi.KC(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final f e(int param0, int param1, f[][] param2, int param3) {
        f var5 = null;
        int var6 = 0;
        f stackIn_5_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var6 = CrazyCrystals.field_B;
        try {
          var5 = this.field_l;
          if (param3 <= 120) {
            this.b((f[][]) null, -56, (byte) -57, -94);
          }
          while (true) {
            if (var5 instanceof ma) {
              stackIn_5_0 = this.a(param2, param0, (f) (this), 11460, param1);
              return stackIn_5_0;
            }
            if (var5 instanceof pn) {
              var5 = ((pn) (var5)).field_l;
              continue;
            }
            break;
          }
          this.field_l = this.field_l.a(param0, (byte) -110, param1);
          return (f) (this);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_13_0 = var5_ref;
          stackIn_13_1 = new StringBuilder().append("mi.OA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    final static int e(byte param0) {
        if (param0 != 125) {
          mi.h(-58);
          return jf.field_a;
        }
        return jf.field_a;
    }

    final f a(sl param0, f[][] param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        f stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          je.field_j = je.field_j + 20;
          we.field_h = we.field_h + 40;
          fp.field_a = fp.field_a + 40;
          b.field_a = b.field_a + 20;
          this.field_t = param6;
          if (param4 != 17512) {
            mi.e((byte) -65);
          }
          mb.field_g = mb.field_g - 10;
          fn.field_j = fn.field_j - 10;
          this.field_u = param3;
          stackIn_3_0 = super.a(param0, param1, param2, param3, 17512, param5, param6);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("mi.I(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final int a(boolean param0, int param1) {
        if (param1 != 0) {
          return -65;
        }
        return 3;
    }

    final f a(mj param0, byte param1, boolean param2, f[][] param3) {
        Object var5 = null;
        ma stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = this;
          if (param1 > -74) {
            this.e(18, 7, (f[][]) null, -101);
          }
          if (param2 &&
            this.field_p >= 2 * this.field_m) {
            var5 = this.a(param0.field_c, param0.field_b, param0.field_a, -119, param3);
          }
          stackIn_7_0 = new ma(param0.b((byte) 84), (f) (var5), param0);
          return (f) ((Object) stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("mi.S(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dn.a((Throwable) (stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final f a(f[][] param0, f param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        f stackIn_2_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_p <= this.field_m * 2) {
            stackIn_2_0 = this.a(-this.field_s + param2, param3 - this.field_o, param1, -124, param0);
            return stackIn_2_0;
          }
          if (!param4) {
            field_A = (int[]) null;
          }
          return (f) (this);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("mi.GB(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final sl a(f[][] param0, int param1, boolean param2, int param3, int param4, int param5) {
        int var8 = 0;
        sl stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        var8 = CrazyCrystals.field_B;
        try {
          aa.field_a.a(128, param4 * 12, param1 * 12, 0, (byte) -111);
          if (0 >= param3) {
            if (param3 < 0) {
              this.field_y = al.field_h;
            } else {
              if (0 < param5) {
                this.field_y = ag.field_c;
              } else {
                this.field_y = sa.field_qb;
              }
            }
          } else {
            this.field_y = cp.field_d;
          }
          if (param2) {
            this.field_C = (fq) null;
          }
          stackIn_11_0 = super.a(param0, param1, false, param3, param4, param5);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_14_0 = var7;
          stackIn_14_1 = new StringBuilder().append("mi.R(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    mi(f param0) {
        this(param0, false);
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        dl stackIn_6_0 = null;
        dl stackIn_20_0 = null;
        dl stackIn_31_0 = null;
        dl stackIn_40_0 = null;
        dl stackIn_48_0 = null;
        dl stackIn_60_0 = null;
        dl stackIn_69_0 = null;
        dl stackIn_77_0 = null;
        dl var7;
        int var8;
        f var9;
        dl var7Lifetime1;
        dl var7Lifetime2;
        dl var7Lifetime3;
        dl var7Lifetime1Lifetime1;
        dl var7Lifetime1Lifetime2;
        var8 = CrazyCrystals.field_B;
        if (param5 != 4261) {
          var9 = (f) null;
          this.a((f[][]) null, (f) null, -83, 121, true);
        }
        if (0 != this.field_m) {
          if (this.field_B) {
            stackIn_6_0 = pa.field_H;
          } else {
            stackIn_6_0 = this.field_y[(this.field_E + this.field_m) % 12];
          }
          var7 = stackIn_6_0;
          if (param2 == 24 &&
            24 == param3) {
            var7.a(param1, -param3 + param4);
            return;
          }
          var7.b(param1, -param3 + param4, 2 * param2, param3 * 3);
          return;
        }
        if (24 != param2) {
          if (this.field_z != null) {
            vj.field_a[18][this.field_z.field_B >> uc.field_c[16]].b(param1, param4 - param3, param2, param3 * 3, ek.field_f[this.field_z.field_u]);
            if (null != this.field_C) {
              vj.field_a[19][this.field_C.field_B >> uc.field_c[17]].b(param2 + param1, -param3 + param4, param2, 3 * param3, ek.field_f[this.field_C.field_u]);
            }
            if (this.field_B) {
              stackIn_31_0 = pa.field_H;
            } else {
              stackIn_31_0 = this.field_y[(this.field_E + this.field_m) % 12];
            }
            var7Lifetime1 = stackIn_31_0;
            if (param2 == 24 &&
              24 == param3) {
              var7Lifetime1.a(param1, -param3 + param4);
              return;
            }
            var7Lifetime1.b(param1, -param3 + param4, 2 * param2, param3 * 3);
            return;
          }
          if (null == this.field_C) {
            if (this.field_B) {
              stackIn_40_0 = pa.field_H;
            } else {
              stackIn_40_0 = this.field_y[(this.field_E + this.field_m) % 12];
            }
            var7Lifetime1Lifetime1 = stackIn_40_0;
            if (param2 == 24 &&
              24 == param3) {
              var7Lifetime1Lifetime1.a(param1, -param3 + param4);
              return;
            }
            var7Lifetime1Lifetime1.b(param1, -param3 + param4, 2 * param2, param3 * 3);
            return;
          }
          vj.field_a[19][this.field_C.field_B >> uc.field_c[17]].b(param2 + param1, -param3 + param4, param2, 3 * param3, ek.field_f[this.field_C.field_u]);
          if (this.field_B) {
            stackIn_48_0 = pa.field_H;
          } else {
            stackIn_48_0 = this.field_y[(this.field_E + this.field_m) % 12];
          }
          var7Lifetime1Lifetime2 = stackIn_48_0;
          if (param2 == 24 &&
            24 == param3) {
            var7Lifetime1Lifetime2.a(param1, -param3 + param4);
            return;
          }
          var7Lifetime1Lifetime2.b(param1, -param3 + param4, 2 * param2, param3 * 3);
          return;
        }
        if (param3 != 24) {
          if (this.field_z != null) {
            vj.field_a[18][this.field_z.field_B >> uc.field_c[16]].b(param1, param4 - param3, param2, param3 * 3, ek.field_f[this.field_z.field_u]);
          }
          if (null != this.field_C) {
            vj.field_a[19][this.field_C.field_B >> uc.field_c[17]].b(param2 + param1, -param3 + param4, param2, 3 * param3, ek.field_f[this.field_C.field_u]);
          }
          if (this.field_B) {
            stackIn_20_0 = pa.field_H;
          } else {
            stackIn_20_0 = this.field_y[(this.field_E + this.field_m) % 12];
          }
          var7Lifetime2 = stackIn_20_0;
          if (param2 == 24 &&
            24 == param3) {
            var7Lifetime2.a(param1, -param3 + param4);
            return;
          }
          var7Lifetime2.b(param1, -param3 + param4, 2 * param2, param3 * 3);
          return;
        }
        if (null != this.field_z) {
          vj.field_a[18][this.field_z.field_B >> uc.field_c[16]].c(param1, -param3 + param4, ek.field_f[this.field_z.field_u]);
          if (null != this.field_C) {
            vj.field_a[19][this.field_C.field_B >> uc.field_c[17]].c(param1 + param2, param4 - param3, ek.field_f[this.field_C.field_u]);
          }
          if (this.field_B) {
            stackIn_60_0 = pa.field_H;
          } else {
            stackIn_60_0 = this.field_y[(this.field_E + this.field_m) % 12];
          }
          var7Lifetime3 = stackIn_60_0;
        } else {
          if (null == this.field_C) {
            if (this.field_B) {
              stackIn_69_0 = pa.field_H;
            } else {
              stackIn_69_0 = this.field_y[(this.field_E + this.field_m) % 12];
            }
            var7Lifetime3 = stackIn_69_0;
          } else {
            vj.field_a[19][this.field_C.field_B >> uc.field_c[17]].c(param1 + param2, param4 - param3, ek.field_f[this.field_C.field_u]);
            if (this.field_B) {
              stackIn_77_0 = pa.field_H;
            } else {
              stackIn_77_0 = this.field_y[(this.field_E + this.field_m) % 12];
            }
            var7Lifetime3 = stackIn_77_0;
          }
        }
        if (param2 == 24 &&
          24 == param3) {
          var7Lifetime3.a(param1, -param3 + param4);
          return;
        }
        var7Lifetime3.b(param1, -param3 + param4, 2 * param2, param3 * 3);
    }

    final static void i(int param0) {
        double var7 = 0.0;
        double var1 = td.field_c[0] / td.field_c[2] - cn.field_d[0] / cn.field_d[2];
        double var3 = -(cn.field_d[1] / cn.field_d[2]) + td.field_c[1] / td.field_c[2];
        double var5 = Math.log(td.field_c[2] / cn.field_d[2]) * 24.0;
        double var7Lifetime1;
        if (param0 == 22075) {
          var7 = Math.sqrt(var5 * var5 + (var3 * var3 + var1 * var1));
          ia.field_g = (int)(Math.sqrt(var7) * 12.0);
          return;
        }
        field_A = (int[]) null;
        var7Lifetime1 = Math.sqrt(var5 * var5 + (var3 * var3 + var1 * var1));
        ia.field_g = (int)(Math.sqrt(var7Lifetime1) * 12.0);
    }

    final void c(boolean param0, boolean param1) {
        if (param1) {
          return;
        }
        if (!param0) {
          mi.i(-117);
          pm.field_d = pm.field_d + 1;
          return;
        }
        pm.field_d = pm.field_d + 1;
    }

    mi(f param0, boolean param1) {
        super(param0);
        this.field_w = false;
        this.field_y = al.field_h;
        this.field_B = false;
        this.field_z = null;
        this.field_C = null;
        try {
          this.field_B = param1 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "mi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final f a(f[][] param0, int param1, f param2, int param3, int param4) {
        int var7_int = 0;
        vh dupTemp$0 = null;
        f stackIn_16_0 = null;
        f stackIn_19_0 = null;
        f stackIn_23_0 = null;
        ji stackIn_27_0 = null;
        ji stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        ji var7 = null;
        int var8 = 0;
        sl var9 = null;
        var8 = CrazyCrystals.field_B;
        try {
          if (null == ab.field_D) {
            pm.field_d = pm.field_d - 1;
            if (param2 != null) {
              var6_int = param2.a(false);
              for (var7_int = 0; var7_int < 3; var7_int++) {
                if ((var6_int & 1 << var7_int) != 0) {
                  dupTemp$0 = q.field_a[var7_int];
                  dupTemp$0.field_d = dupTemp$0.field_d + 1;
                  fp.field_a = fp.field_a + 5;
                  b.field_a = b.field_a + 2;
                  je.field_j = je.field_j + 2;
                  we.field_h = we.field_h + 5;
                  we.field_h = we.field_h + 4;
                  fp.field_a = fp.field_a + 4;
                  je.field_j = je.field_j + 2;
                  b.field_a = b.field_a + 2;
                  mb.field_g = mb.field_g + 400;
                  fn.field_j = fn.field_j + 500;
                  fn.field_j = fn.field_j + 20;
                  mb.field_g = mb.field_g + 20;
                  if (pm.field_d == 0) {
                    ol.field_B = ol.field_B | 1 << var7_int;
                  }
                  wd.field_j = wd.field_j + 1;
                  fn.field_j = fn.field_j - ob.field_l;
                }
              }
              ol.field_B = ol.field_B | 8;
            }
          }
          if (!(param2 instanceof qf) &&
            !(param2 instanceof ig)) {
            if (param3 != 11460) {
              stackIn_19_0 = (f) null;
              return stackIn_19_0;
            }
            bn.field_h.a(192, this.field_o * this.field_m + 12 * param4, 12 * param1 + this.field_s * this.field_m, 0, (byte) -111);
            if ((this.field_s | this.field_o) == 0) {
              stackIn_29_0 = new ji(this.field_l, 0, 0);
              return (f) ((Object) stackIn_29_0);
            }
            var9 = this.d(param1, param4, param0, 85);
            if (this.field_s > 0) {
              var9.field_l = (f) ((Object) new ji(var9.field_l, 0, -12 + this.field_m * this.field_s));
              stackIn_23_0 = this.field_l;
              return stackIn_23_0;
            }
            ob.field_l = ob.field_l + 1;
            mb.field_g = mb.field_g + wd.field_j;
            var7 = new ji(this.field_l, this.field_m * this.field_o, this.field_s * this.field_m);
            if (this.field_s == 0) {
              var9.field_l = (f) ((Object) new tn(var9.field_l, var7, this.field_o, 0));
            }
            stackIn_27_0 = var7;
            return (f) ((Object) stackIn_27_0);
          }
          wp.field_b.a(256, this.field_o * this.field_m + 12 * param4, this.field_m * this.field_s + param1 * 12, 0, (byte) -111);
          stackIn_16_0 = this.field_l;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_32_0 = var6;
          stackIn_32_1 = new StringBuilder().append("mi.VA(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void c(int param0, int param1, int param2) {
        this.field_u = param2;
        if (param1 != -5) {
          return;
        }
        this.field_t = param0;
    }

    final void f(int param0, int param1, f[][] param2, int param3) {
        boolean stackIn_16_0 = false;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        f var5 = null;
        RuntimeException var5_ref = null;
        pf var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = CrazyCrystals.field_B;
        try {
          if (param0 != 1) {
            this.f(126, -128, (f[][]) null, 20);
          }
          var5 = this.field_l;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var5 instanceof pf))) {
            stackIn_16_0 = var5 instanceof pn;
            if (stackIn_16_0) {
              var5 = ((pn) (var5)).field_l;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            var6 = (pf) (var5);
            if (var6.field_r) {
              mb.field_g = mb.field_g - wd.field_j;
              ob.field_l = ob.field_l - 1;
              var7 = var6.field_u;
              var8 = var6.field_v;
              if (0 != (var8 | var7) &&
                param2[var8 + param1][var7 + param3].a(16736352, param2, false, var8, param1, param3, (ea) (this), var7)) {
                this.a(1 << var6.field_w, true, var6.field_p);
                if (!this.field_w) {
                  this.field_l.a(1 << var6.field_w, true, var6.field_p);
                  this.field_w = true;
                }
                this.a(param2, param1, false, var8, param3, var7);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_22_0 = var5_ref;
          stackIn_22_1 = new StringBuilder().append("mi.LA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param3).append(')').toString());
        }
    }

    final f a(int param0, int param1, f[][] param2, int param3, int param4, int param5, ea param6) {
        RuntimeException var8 = null;
        f stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param6 instanceof fq) {
            return (f) (this);
          }
          if (param3 != -31135) {
            this.f(78, -21, (f[][]) null, 71);
          }
          b.field_a = b.field_a + 1;
          fp.field_a = fp.field_a + 2;
          je.field_j = je.field_j + 1;
          we.field_h = we.field_h + 2;
          stackIn_7_0 = this.a(param4, param1, param6, 13, param2);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("mi.P(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
        field_D = new fp();
        field_v = 20;
    }
}
