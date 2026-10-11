/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pqa extends dg {
    private int field_q;
    static String field_r;
    private ut field_n;
    static int[] field_m;
    static int field_p;
    private int field_o;

    final static void i(int param0) {
        int var2;
        var2 = TombRacer.field_G ? 1 : 0;
        boolean decompiledFrameRemainder0 = true;
        if (mla.field_a > 0) {
          mla.field_a = mla.field_a - 1;
          if (param0 >= mla.field_a) {
            if (gt.field_a > 0) {
              dga.a(gt.field_a, 199);
            }
            if (fp.field_e > 0) {
              dga.a(fp.field_e, 199);
            }
            return;
          }
          ji.a(16);
          if (gt.field_a <= 0) {
            if (fp.field_e > 0) {
              dga.a(fp.field_e, 199);
            }
            return;
          }
          dga.a(gt.field_a, 199);
        } else {
          if (0 < gt.field_a) {
            gt.field_a = gt.field_a - 1;
            if (param0 >= mla.field_a) {
              if (gt.field_a > 0) {
                dga.a(gt.field_a, 199);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              ji.a(16);
              decompiledFrameRemainder0 = !(gt.field_a <= 0);
              if (decompiledFrameRemainder0) {
                dga.a(gt.field_a, 199);
                if (fp.field_e > 0) {
                  dga.a(fp.field_e, 199);
                }
                return;
              }
            }
          }
          if (decompiledFrameRemainder0) {
            if (0 < fp.field_e) {
              fp.field_e = fp.field_e - 1;
            }
            if (param0 < mla.field_a) {
              ji.a(16);
            }
            if (gt.field_a > 0) {
              dga.a(gt.field_a, 199);
            }
          }
        }
        if (fp.field_e <= 0) {
          return;
        }
        dga.a(fp.field_e, 199);
    }

    final void a(gma param0, int param1, gr param2) {
        try {
          super.a(param0, param1, param2);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "pqa.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    pqa(int param0, la param1, kh param2) {
        super(param0, param1, param2);
        this.field_q = 0;
        this.field_o = 0;
    }

    public static void n(byte param0) {
        field_m = null;
        field_r = null;
        if (param0 > -125) {
          field_p = -110;
        }
    }

    pqa(int param0) {
        super(param0);
        this.field_q = 0;
        this.field_o = 0;
    }

    final void d(int param0) {
        la var11 = null;
        hr var12 = null;
        hr var16 = null;
        hr var14 = null;
        hr var19 = null;
        hr var21 = null;
        hr var20 = null;
        hr var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = TombRacer.field_G ? 1 : 0;
        hr var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        if (null == this.field_n) {
          this.field_q = 0;
          return;
        }
        if (!this.field_k.a(-61)) {
          this.field_q = 0;
          return;
        }
        int var2 = this.field_n.b(-113);
        int var3 = this.field_n.j((byte) -108);
        if (this.field_n.k((byte) -74).b((byte) 120)) {
          this.field_q = var2;
          var11 = this.a(param0 + 44);
          la var4 = var11;
          var5 = var11.a(this.b((byte) 42), this.c((byte) 118) + 2097152, (byte) 100, this.e((byte) -92) + 8 << 16);
          var5.a(false, 32, 12, 4, 10 + uca.field_c.a(10, param0 + 1));
          var6 = 262144 + uca.field_c.a(262144, 0);
          var5.a(var6, -var6 / 32, 0, 0, 0, 0, (byte) -20);
          var5.a(uca.field_c.a(2048, param0 ^ param0), -16 + uca.field_c.a(32, 0), param0 ^ 118);
          if (this.field_q <= 10) {
            return;
          }
          var2 -= 25;
          var7 = 0;
          if (this.field_q >= var2) {
            var7 = 1;
            if (var7 != 0) {
              var12 = var11.a(uca.field_c.a(var11.m((byte) -86), 0), uca.field_c.a(var11.s(-125), 0), (byte) 100, 1048576);
              var12.a(false, 64, 12, 8, uca.field_c.a(25, 0) + 25);
              var12.a(65536, 0, param0 ^ 118, 0);
              var12.a(uca.field_c.a(2048, 0), -16 + uca.field_c.a(32, 0), -96);
            }
            return;
          }
          if (this.field_o > 0) {
            this.field_o = this.field_o - 1;
            if (var7 != 0) {
              var16 = var11.a(uca.field_c.a(var11.m((byte) -86), 0), uca.field_c.a(var11.s(-125), 0), (byte) 100, 1048576);
              var16.a(false, 64, 12, 8, uca.field_c.a(25, 0) + 25);
              var16.a(65536, 0, param0 ^ 118, 0);
              var16.a(uca.field_c.a(2048, 0), -16 + uca.field_c.a(32, 0), -96);
            }
            return;
          }
          this.field_o = (var2 - this.field_q) / 8;
          var7Lifetime3 = 1;
          if (var7Lifetime3 != 0) {
            var14 = var11.a(uca.field_c.a(var11.m((byte) -86), 0), uca.field_c.a(var11.s(-125), 0), (byte) 100, 1048576);
            var14.a(false, 64, 12, 8, uca.field_c.a(25, 0) + 25);
            var14.a(65536, 0, param0 ^ 118, 0);
            var14.a(uca.field_c.a(2048, 0), -16 + uca.field_c.a(32, 0), -96);
          }
          return;
        }
        this.field_q = var3;
        la var18 = this.a(param0 + 44);
        var5Lifetime1 = var18.a(this.b((byte) 42), this.c((byte) 118) + 2097152, (byte) 100, this.e((byte) -92) + 8 << 16);
        var5Lifetime1.a(false, 32, 12, 4, 10 + uca.field_c.a(10, param0 + 1));
        var6Lifetime1 = 262144 + uca.field_c.a(262144, 0);
        var5Lifetime1.a(var6Lifetime1, -var6Lifetime1 / 32, 0, 0, 0, 0, (byte) -20);
        var5Lifetime1.a(uca.field_c.a(2048, param0 ^ param0), -16 + uca.field_c.a(32, 0), param0 ^ 118);
        if (this.field_q <= 10) {
          return;
        }
        var2 -= 25;
        var7Lifetime1 = 0;
        if (this.field_q >= var2) {
          var7Lifetime1 = 1;
          if (var7Lifetime1 != 0) {
            var19 = var18.a(uca.field_c.a(var18.m((byte) -86), 0), uca.field_c.a(var18.s(-125), 0), (byte) 100, 1048576);
            var19.a(false, 64, 12, 8, uca.field_c.a(25, 0) + 25);
            var19.a(65536, 0, param0 ^ 118, 0);
            var19.a(uca.field_c.a(2048, 0), -16 + uca.field_c.a(32, 0), -96);
          }
          return;
        }
        if (this.field_o > 0) {
          this.field_o = this.field_o - 1;
          if (var7Lifetime1 != 0) {
            var21 = var18.a(uca.field_c.a(var18.m((byte) -86), 0), uca.field_c.a(var18.s(-125), 0), (byte) 100, 1048576);
            var21.a(false, 64, 12, 8, uca.field_c.a(25, 0) + 25);
            var21.a(65536, 0, param0 ^ 118, 0);
            var21.a(uca.field_c.a(2048, 0), -16 + uca.field_c.a(32, 0), -96);
          }
          return;
        }
        this.field_o = (var2 - this.field_q) / 8;
        var7Lifetime2 = 1;
        if (var7Lifetime2 != 0) {
          var20 = var18.a(uca.field_c.a(var18.m((byte) -86), 0), uca.field_c.a(var18.s(-125), 0), (byte) 100, 1048576);
          var20.a(false, 64, 12, 8, uca.field_c.a(25, 0) + 25);
          var20.a(65536, 0, param0 ^ 118, 0);
          var20.a(uca.field_c.a(2048, 0), -16 + uca.field_c.a(32, 0), -96);
        }
    }

    final void a(gr param0, gma param1, byte param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.a(param0, param1, param2);
          if (!(param0 instanceof ut)) {
            return;
          }
          this.field_n = (ut) ((Object) param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("pqa.E(");
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
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(byte param0, kh param1) {
        try {
          int var3_int = -121 / ((param0 + 8) / 40);
          super.a((byte) -64, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "pqa.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, la param1, kh param2) {
        try {
          super.a(124, param1, param2);
          if (param0 < 119) {
            field_r = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "pqa.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        int var7 = 0;
        try {
          int var6_int = 92 % ((param4 + 38) / 47);
          var7 = dfa.a(4096 - this.field_h.g(-25787) >> 2, 2048, -74);
          gqa.a(var7, -83584144, param1, param2, df.field_J[6], param3);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "pqa.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_r = "Names cannot contain consecutive spaces";
    }
}
