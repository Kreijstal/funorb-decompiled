/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q {
    int field_a;
    static n field_i;
    int field_d;
    int field_f;
    boolean field_h;
    static String field_g;
    private km field_e;
    int field_j;
    private boolean field_b;
    int field_c;

    final boolean a(int param0, int param1, int param2) {
        if (param2 >= -25) {
          return false;
        }
        return bg.a(this.field_c, this.field_d, this.field_j, (byte) 126, param1, param0, this.field_a);
    }

    final void a(int param0) {
        this.field_b = false;
        if (param0 > -63) {
          this.field_d = -50;
        }
    }

    final void a(byte param0, boolean param1) {
        String[] array$0 = null;
        RgbSprite[] stackIn_16_0 = null;
        int stackIn_17_1 = 0;
        RgbSprite[] stackIn_26_0 = null;
        int stackIn_27_1 = 0;
        String stackIn_36_0;
        String[] stackIn_36_1;
        String[] stackIn_36_2;
        int stackIn_36_3;
        String stackIn_37_4;
        int stackIn_47_0 = 0;
        int stackIn_56_0 = 0;
        RgbSprite stackIn_59_0 = null;
        RgbSprite[] var3;
        String var4;
        RgbSprite var4_ref;
        int var5;
        int var6;
        int var7;
        String var8_ref_String;
        int var8;
        int var9_int;
        RgbSprite var9;
        int var10;
        RgbSprite var11;
        RgbSprite var12;
        RgbSprite var4_refLifetime1;
        var10 = BrickABrac.field_J ? 1 : 0;
        if (31 != this.field_f &&
          40 != this.field_f &&
          this.field_f != 41 &&
          this.field_f != 43) {
          if (!this.field_b) {
            if (!param1) {
              var3 = Ball.field_G;
            } else {
              var3 = af.field_A;
            }
          } else {
            var3 = pe.field_k;
          }
          nh.a(this.field_j, this.field_d, -40, this.field_c, var3, this.field_a);
          if (29 != this.field_f &&
            this.field_f != 30) {
            if (44 != this.field_f &&
              this.field_f != 45) {
              var4 = ag.field_D[this.field_f];
              if (this.field_f == 8) {
                var4 = this.field_e.e((byte) 87);
              }
              if (this.field_f == 36) {
                array$0 = new String[1];
                stackIn_36_0 = gj.field_d;
                stackIn_36_1 = array$0;
                stackIn_36_2 = array$0;
                stackIn_36_3 = 0;
                if (!be.field_a) {
                  stackIn_37_4 = jg.field_q;
                } else {
                  stackIn_37_4 = lk.field_q;
                }
                stackIn_36_2[stackIn_36_3] = stackIn_37_4;
                var4 = rd.a(stackIn_36_0, stackIn_36_1, (byte) 103);
              }
              var5 = nn.field_g.c(var4);
              if (20 == this.field_f ||
                this.field_f == 21) {
                var5 = og.field_Zb;
              }
              var6 = -var5 + (this.field_j + 2 * this.field_c) >> 1;
              if (!this.field_h) {
                stackIn_47_0 = (!param1) ? 0 : 1;
              } else {
                stackIn_47_0 = 7;
              }
              var7 = stackIn_47_0;
              if (this.field_f == 42) {
                var8_ref_String = var4.toLowerCase();
                var9_int = -16 + this.field_j;
                nn.field_g.a(var8_ref_String, 8 + this.field_c, this.field_a - 5, var9_int, this.field_d, var7, -1, 1, 1, 3 + nn.field_g.field_B);
              } else {
                nn.field_g.c(var4.toLowerCase(), var6, 2 + (this.field_a + (-nn.field_g.field_P + nn.field_g.field_B + this.field_d) / 2), var7, -1);
              }
              if (this.field_f == 20 ||
                this.field_f == 21) {
                var6 = var6 + dg.field_d;
                Rasterizer2D.drawHorizontalLine(var6, this.field_d / 2 + this.field_a - 1, 121, 11184810);
                Rasterizer2D.drawHorizontalLine(var6, this.field_a + this.field_d / 2, 121, 0);
                Rasterizer2D.drawHorizontalLine(var6, this.field_d / 2 + this.field_a + 1, 121, 11184810);
                if (20 != this.field_f) {
                  stackIn_56_0 = qi.i(-29946) * 120 / 256;
                } else {
                  stackIn_56_0 = lh.g((byte) -44) * 120 / re.e((byte) 43);
                }
                var8 = stackIn_56_0;
                if (!param1) {
                  stackIn_59_0 = g.field_l[0];
                } else {
                  stackIn_59_0 = g.field_l[1];
                }
                var9 = stackIn_59_0;
                var9.drawTransparent(var8 + (var6 + (-1 - var9.canvasWidth / 2)), (-var9.canvasHeight + this.field_d) / 2 + this.field_a);
              }
              if (param0 != 4) {
                this.a(-113, 101, -34);
              }
              return;
            }
            stackIn_26_0 = pa.field_l;
            stackIn_27_1 = (!param1) ? 0 : 1;
            var12 = stackIn_26_0[stackIn_27_1];
            var4_ref = var12;
            if (44 == this.field_f) {
              var4_ref.drawTransparent((this.field_j - var12.canvasWidth) / 2 + this.field_c, this.field_a + (-var12.canvasHeight + this.field_d) / 2);
            } else {
              var4_ref.f((-var12.canvasWidth + this.field_j) / 2 + this.field_c, this.field_a + (-var12.canvasHeight + this.field_d) / 2);
            }
            return;
          }
          stackIn_16_0 = mp.field_Vb;
          stackIn_17_1 = (!param1) ? 0 : 1;
          var11 = stackIn_16_0[stackIn_17_1];
          var4_refLifetime1 = var11;
          if (this.field_f == 29) {
            var4_refLifetime1.drawTransparent(this.field_c + (this.field_j - var11.canvasWidth) / 2, this.field_a + (-var11.canvasHeight + this.field_d) / 2);
          } else {
            var4_refLifetime1.g((-var11.canvasWidth + this.field_j) / 2 + this.field_c, this.field_a + (-var11.canvasHeight + this.field_d) / 2);
          }
          return;
        }
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        String var4 = null;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = w.a(param1 + 121, param2);
          if (param1 != 0) {
            var4 = (String) null;
            q.a((String) null, 78, (String) null);
          }
          if (param0.indexOf(param2) == -1 &&
            param0.indexOf(var3) == -1) {
            stackIn_14_0 = (param0.startsWith(param2)) || (param0.startsWith(var3)) || (param0.endsWith(param2)) || (param0.endsWith(var3));
            return stackIn_14_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("q.E(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_g = null;
        field_i = null;
        if (param0 != -32) {
          q.a((byte) 49);
        }
    }

    q(int param0, km param1) {
        try {
          this.field_f = param0;
          this.field_e = param1;
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "q.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0) {
        re var2;
        boolean stackIn_12_1 = false;
        if (param0 != -2217) {
          return;
        }
        var2 = this.field_e.field_h;
        if (var2 == null) {
          return;
        }
        if (this.field_f == 29 ||
          30 == this.field_f) {
          stackIn_12_1 = (var2.a(false)) && (this.a(pq.field_k, po.field_a, -56));
          this.field_b = stackIn_12_1;
        }
    }

    final static String a(byte[] param0, byte param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > 69) {
            stackIn_4_0 = df.decodeCp1252(param0.length, 117, param0, 0);
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("q.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_i = new n();
        field_g = "Names cannot start or end with space or underscore";
    }
}
