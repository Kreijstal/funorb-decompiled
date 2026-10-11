/*
 * Decompiled by CFR-JS 0.4.0.
 */
class jg extends bg {
    wg field_n;
    int field_g;
    int field_o;
    int field_p;
    int field_h;
    short field_k;
    static int[][] field_j;
    int field_l;
    int field_f;
    int field_s;
    static cr field_q;
    static String field_m;
    boolean field_i;
    int field_r;

    void a(int param0, byte param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 >= -121) {
            jg.a(-60L, -116);
          }
          this.a((byte) -101, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var3), "jg.M(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(byte param0, int param1) {
        boolean stackIn_26_1 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          if (0 == param1) {
            throw new IllegalArgumentException("Can't pass 0 in");
          }
          this.field_p = param1;
          this.field_k = (short) 0;
          stackIn_26_1 = (this.field_p == 11) || (this.field_p == 17) || (20 == this.field_p) || (this.field_p == 12) || (this.field_p == 18) || (this.field_p == 19) || (9 == this.field_p);
          boolean decompiledFrameRemainder0 = true;
          this.field_i = stackIn_26_1;
          this.field_f = -1;
          if (!tj.field_c) {
            if (this.field_p != 7) {
              if (this.field_p == 26 ||
                25 == this.field_p) {
                this.field_n.a(wi.field_d[4], (byte) 100);
                this.field_f = 4;
                decompiledFrameRemainder0 = (var4 != 0);
              }
              if ((decompiledFrameRemainder0) &&
                (this.field_p == 28)) {
                this.field_n.a(wi.field_d[5], (byte) 103);
                this.field_f = 5;
                if (var4 != 0) {
                  this.field_n.a(wi.field_d[3], (byte) 126);
                  this.field_f = 3;
                }
              }
            } else {
              this.field_n.a(wi.field_d[3], (byte) 126);
              this.field_f = 3;
            }
          }
          if (param0 >= -26) {
            this.a(true, (int[]) null, false, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var3), "jg.U(" + param0 + ',' + param1 + ')');
        }
    }

    void a(boolean param0, int[] param1, boolean param2, boolean param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(-30, param1, param2, (byte[]) null, param3);
          if (param0) {
            this.c(true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("jg.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int a(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            this.field_r = -76;
          }
          stackIn_4_0 = this.field_s;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2), "jg.N(" + param0 + ')');
        }
    }

    final int a(int param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -97) {
            this.a((lg) null, -11, -63, (byte) 4);
          }
          var5_int = 64 + this.field_l - param2;
          var6 = 64 + (this.field_g - param0);
          var7 = this.field_s + 23 - param3;
          stackIn_4_0 = var7 * var7 + var5_int * var5_int + var6 * var6;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var5), "jg.T(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    void a(int param0, int[] param1, boolean param2, byte[] param3, boolean param4) {
        int stackIn_19_0 = 0;
        fc[][] stackIn_44_0 = null;
        int stackIn_45_1 = 0;
        fc[][] stackIn_49_0 = null;
        int stackIn_50_1 = 0;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        String stackIn_96_2 = null;
        StringBuilder stackIn_99_1 = null;
        String stackIn_100_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        fc var8 = null;
        Object var9 = null;
        byte[] var10 = null;
        fc var10_ref = null;
        byte[] var11 = null;
        int var12 = 0;
        byte[] var10Lifetime1;
        byte[] var10Lifetime2;
        var12 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param0 != -30) {
            this.c(34);
          }
          var6_int = this.field_p;
          if (wi.field_j.length <= var6_int) {
            return;
          }
          if (this.field_p == 22 &&
            this.field_k % 20 < 10) {
            var6_int = 8;
          }
          if (!param4) {
            stackIn_19_0 = pl.field_n;
          } else {
            stackIn_19_0 = pn.field_L;
          }
          var7 = stackIn_19_0;
          var8 = wi.field_j[var6_int][var7];
          if (null == var8) {
            return;
          }
          vq.field_q[0] = this.field_l + 64;
          vq.field_q[1] = this.field_s;
          vq.field_q[2] = this.field_g + 64;
          if (this.field_p == 23 &&
            (15 & this.field_k) == 0) {
            vq.field_q[0] = vq.field_q[0] + (-4 + be.a(9, (byte) 83));
            vq.field_q[1] = vq.field_q[1] + (-4 + be.a(9, (byte) 83));
            vq.field_q[2] = vq.field_q[2] + (-4 + be.a(9, (byte) 83));
          }
          var9 = null;
          if (!this.field_i) {
            if (this.field_p == 10) {
              stackIn_49_0 = wi.field_j;
              if (param2) {
                stackIn_50_1 = 27;
              } else {
                stackIn_50_1 = 3;
              }
              var9 = stackIn_49_0[stackIn_50_1][var7];
            } else {
              if (5 == this.field_p) {
                stackIn_44_0 = wi.field_j;
                if (!param2) {
                  stackIn_45_1 = 4;
                } else {
                  stackIn_45_1 = 27;
                }
                var9 = stackIn_44_0[stackIn_45_1][var7];
              } else {
                if (this.field_p != 30) {
                  if (this.field_p == 29) {
                    var9 = wi.field_j[4][var7];
                  }
                } else {
                  var9 = wi.field_j[3][var7];
                }
              }
            }
          } else {
            var9 = wi.field_j[27][var7];
          }
          if (null != var9 &&
            param1[1] < this.field_s) {
            var10 = ((fc) (var9)).field_R;
            ((fc) (var9)).field_R = param3;
            ((fc) (var9)).a(param1, vq.field_q);
            ((fc) (var9)).field_R = var10;
          }
          boolean decompiledFrameRemainder0 = true;
          if (var6_int != 12 &&
            var6_int != 18 &&
            19 != var6_int &&
            var6_int != 20 &&
            var6_int != 9 &&
            var6_int != 11 &&
            var6_int != 30 &&
            var6_int != 29) {
            if (this.field_f >= 0) {
              var10_ref = (fc) (this.field_n.a(true, true, false, var8));
              var11 = var10_ref.field_R;
              var10_ref.field_R = param3;
              var10_ref.a(param1, vq.field_q);
              var10_ref.field_R = var11;
              decompiledFrameRemainder0 = (var12 != 0);
            }
            if (decompiledFrameRemainder0) {
              var10Lifetime1 = var8.field_R;
              var8.field_R = param3;
              var8.a(param1, vq.field_q);
              var8.field_R = var10Lifetime1;
              if (var12 != 0) {
                ke.field_e[2] = vq.field_q[2];
                ke.field_e[0] = vq.field_q[0];
                ke.field_e[1] = vq.field_q[1];
                var10Lifetime1 = var8.field_R;
                var8.field_R = param3;
                var8.a(param1, ke.field_e);
                var8.field_R = var10Lifetime1;
              }
            }
          } else {
            ke.field_e[2] = vq.field_q[2];
            ke.field_e[0] = vq.field_q[0];
            ke.field_e[1] = vq.field_q[1];
            var10Lifetime1 = var8.field_R;
            var8.field_R = param3;
            var8.a(param1, ke.field_e);
            var8.field_R = var10Lifetime1;
          }
          if (null != var9 &&
            this.field_s <= param1[1]) {
            var10Lifetime2 = ((fc) (var9)).field_R;
            ((fc) (var9)).field_R = param3;
            ((fc) (var9)).a(param1, vq.field_q);
            ((fc) (var9)).field_R = var10Lifetime2;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_95_0 = var6;
          stackIn_95_1 = new StringBuilder().append("jg.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_96_2 = "null";
          } else {
            stackIn_96_2 = "{...}";
          }
          stackIn_99_1 = ((StringBuilder) (Object) stackIn_95_1).append(stackIn_96_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_100_2 = "null";
          } else {
            stackIn_100_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_95_0), ((StringBuilder) (Object) stackIn_99_1).append(stackIn_100_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        try {
          field_j = (int[][]) null;
          field_m = null;
          field_q = null;
          if (param0) {
            field_j = (int[][]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "jg.V(" + param0 + ')');
        }
    }

    final static bs a(long param0, int param1) {
        bs stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        try {
          var3_int = 42 % ((-65 - param1) / 51);
          stackIn_1_0 = (bs) (kd.field_l.a(3661, param0));
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var3), "jg.CA(" + param0 + ',' + param1 + ')');
        }
    }

    final fc a(lg param0, int param1, int param2, byte param3) {
        Object stackIn_8_0 = null;
        fc stackIn_11_0 = null;
        fc stackIn_41_0 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        fc var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        fc var9 = null;
        fc var10 = null;
        fc var11 = null;
        fc var12 = null;
        fc var13 = null;
        fc var14 = null;
        int var15 = 0;
        int var16 = 0;
        var16 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param0.field_G < 4066 &&
            4096 > param0.field_z) {
            if (param3 >= -85) {
              stackIn_11_0 = (fc) null;
              return stackIn_11_0;
            }
            var5 = new fc(param0, 110, 1560, 10, -10, -5);
            var6 = param1 - this.field_l;
            var7 = param2 - this.field_g;
            var8 = var5.f();
            var9 = en.field_a;
            var10 = en.field_a;
            en.field_a.field_L = 0;
            var9.field_T = 0;
            var10.field_w = 0;
            var11 = on.field_a;
            var12 = on.field_a;
            on.field_a.field_L = 0;
            var11.field_T = 0;
            var12.field_w = 0;
            var13 = ch.field_c;
            var14 = ch.field_c;
            ch.field_c.field_L = 0;
            var13.field_T = 0;
            var14.field_w = 0;
            if (var8 + var6 > 128) {
              ia.a(en.field_a, (byte) -25, var5, 0, 0, 128 - var6 - (var8 - var8), 0, -1, 0, on.field_a);
              ch.field_c.a(en.field_a);
              if (var16 != 0) {
                if (var6 - var8 < 0) {
                  ia.a(en.field_a, (byte) -113, var5, 0, 0, -var8 + (var8 - var6), 0, 1, 0, on.field_a);
                  ch.field_c.a(en.field_a);
                  ch.field_c.a(var5);
                } else {
                  ch.field_c.a(var5);
                }
              }
            } else {
              if (var6 - var8 < 0) {
                ia.a(en.field_a, (byte) -113, var5, 0, 0, -var8 + (var8 - var6), 0, 1, 0, on.field_a);
                ch.field_c.a(en.field_a);
                if (var16 != 0) {
                  ch.field_c.a(var5);
                }
              } else {
                ch.field_c.a(var5);
              }
            }
            if (var8 + var7 <= 128) {
              if (!(-var8 + var7 >= 0)) {
                ia.a(en.field_a, (byte) -93, ch.field_c, 0, -var8 + var8 - var7, 0, 0, 0, 1, on.field_a);
                if (var16 != 0) {
                  ia.a(en.field_a, (byte) -66, ch.field_c, 0, var8 - var8 - var7 + 128, 0, 0, 0, -1, on.field_a);
                }
              }
            } else {
              ia.a(en.field_a, (byte) -66, ch.field_c, 0, var8 - var8 - var7 + 128, 0, 0, 0, -1, on.field_a);
            }
            boolean decompiledFrameCompleted0 = true;
            if (be.field_q) {
              var15 = -1 + en.field_a.field_bb.length;
              while (var15 >= 0) {
                en.field_a.field_i[var15] = 0;
                stackIn_41_0 = en.field_a;
                if (var16 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                stackIn_41_0.field_bb[var15] = -1;
                var15--;
              }
            }
            if (decompiledFrameCompleted0) {
              stackIn_41_0 = en.field_a;
            }
            return stackIn_41_0;
          }
          stackIn_8_0 = null;
          return (fc) (stackIn_8_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_45_0 = var5_ref;
          stackIn_45_1 = new StringBuilder().append("jg.O(");
          if (param0 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(jg param0, int param1) {
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          this.field_h = param0.field_h;
          this.field_r = param0.field_r;
          this.field_s = param0.field_s;
          this.field_l = param0.field_l;
          this.field_o = param0.field_o;
          this.field_g = param0.field_g;
          var3_int = this.field_p;
          this.field_p = param0.field_p;
          if (!tj.field_c) {
            this.field_n.a(param0.field_n, (byte) 64);
            if (7 != this.field_p ||
              var3_int == 7) {
              if ((this.field_p == 26 ||
                25 == this.field_p) &&
                (var3_int != 26 &&
                var3_int != 25)) {
                this.field_n.a(wi.field_d[4], (byte) 120);
                decompiledFrameRemainder0 = (var4 != 0);
              }
              if ((decompiledFrameRemainder0) &&
                (28 == this.field_p) &&
                (28 != var3_int)) {
                this.field_n.a(wi.field_d[5], (byte) 55);
                if (var4 != 0) {
                  this.field_n.a(wi.field_d[3], (byte) 70);
                }
              }
            } else {
              this.field_n.a(wi.field_d[3], (byte) 70);
            }
          }
          this.field_d = param0.field_d;
          this.field_k = param0.field_k;
          this.field_i = param0.field_i;
          this.field_f = param0.field_f;
          if (param1 >= -22) {
            field_j = (int[][]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_41_0 = var3;
          stackIn_41_1 = new StringBuilder().append("jg.W(");
          if (param0 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param1).append(')').toString());
        }
    }

    boolean b(int param0, int param1, int param2, int param3, int param4, int param5) {
        boolean stackIn_22_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (param5 != 0) {
            this.a(-87, -8, -4, -87);
          }
          stackIn_22_0 = (this.field_l < param4) && ((this.field_l + 128) > param0) && (param3 > this.field_g) && (128 + this.field_g > param1) && (param2 >= (-10 + this.field_s)) && (param2 < (this.field_s + 47));
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var7), "jg.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void c(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (tj.field_c) {
            return;
          }
          if (param0 != 0) {
            this.a(70, (int[]) null, true, (byte[]) null, false);
          }
          if (this.field_f == 2) {
            this.field_f = 1;
            this.field_n.a(wi.field_d[1], (byte) 86);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2), "jg.AA(" + param0 + ')');
        }
    }

    boolean b(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_k = (short)(this.field_k + 1);
          if (param0 != 7579) {
            this.b(126, -52, 91, 79, 50, 36);
          }
          if (this.field_k > 255) {
            this.field_k = (short) 0;
          }
          if (!tj.field_c) {
            this.field_n.c(-660903963);
            if (this.field_n.a(param0 ^ -7643)) {
              if (this.field_f != 0 &&
                this.field_f != 2) {
                if (this.field_f == 1) {
                  this.field_f = -1;
                  if (Vertigo2.field_L) {
                    this.field_f = 2;
                    this.field_n.a(wi.field_d[2], (byte) 67);
                  }
                }
              } else {
                this.field_f = 2;
                this.field_n.a(wi.field_d[2], (byte) 67);
              }
            }
          }
          if (this.field_p == 28 &&
            this.field_k > 34) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2), "jg.E(" + param0 + ')');
        }
    }

    final void c(boolean param0) {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            this.field_g = 61;
          }
          if (tj.field_c) {
            return;
          }
          if (this.field_f == -1) {
            this.field_f = 0;
            this.field_n.a(wi.field_d[0], (byte) 76);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) runtimeException), "jg.BA(" + param0 + ')');
        }
    }

    final int a(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 5) {
            this.field_s = -79;
          }
          stackIn_4_0 = this.field_s;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2), "jg.R(" + param0 + ')');
        }
    }

    jg(int param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_g = param2;
          if (ke.field_e == null) {
            ke.field_e = new int[]{0, 0, 0, oo.field_h[0], 0, -oo.field_j[0], 0, 65536, 0, oo.field_j[0], 0, oo.field_h[0]};
          }
          this.field_l = param1;
          this.field_s = param3;
          this.field_h = lj.a(this.field_l, false, 128);
          this.field_r = lj.a(this.field_g, false, 128);
          this.field_o = lj.a(this.field_s, false, 240);
          if (!tj.field_c) {
            this.field_n = new wg();
          }
          this.a((byte) -122, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) runtimeException), "jg.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    jg(jg param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!tj.field_c) {
            this.field_n = new wg();
          }
          this.a(param0, -106);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_9_0 = runtimeException;
          stackIn_9_1 = new StringBuilder().append("jg.<init>(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_m = "Player names can be up to 12 letters, numbers and underscores";
    }
}
