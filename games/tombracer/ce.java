/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce extends dg {
    static String field_w;
    private int field_s;
    private lpa field_m;
    private int field_q;
    private boolean field_p;
    private static String[] field_n;
    private int field_x;
    private fla field_t;
    static boolean field_B;
    static int[][] field_A;
    private eh[][] field_r;
    private fla field_v;
    private int field_u;
    private fla field_o;
    private int field_y;
    private int field_z;

    final int k(int param0) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -13019) {
            ce.l(-70);
          }
          stackIn_3_0 = this.field_u;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "ce.L(" + param0 + ')');
        }
    }

    final void b(int param0, uw param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          if (this.field_r == null) {
            this.a(true);
          }
          super.b(param0, param1);
          if (this.field_r != null) {
            for (var3_int = 0; this.field_z > var3_int; var3_int++) {
              for (var4 = 0; var4 < this.field_s; var4++) {
                this.field_r[var3_int][var4].a(55);
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("ce.WA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final int n(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 87) {
            stackIn_4_0 = this.field_q;
            return stackIn_4_0;
          }
          stackIn_2_0 = -127;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "ce.J(" + param0 + ')');
        }
    }

    final void a(gr param0, gma param1, byte param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.a(param0, param1, param2);
          if (this.field_k instanceof lpa) {
            this.field_m = (lpa) (this.field_k);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ce.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_0 = stackIn_6_0;
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_11_0 = stackIn_10_0;
            stackIn_11_2 = "null";
          } else {
            stackIn_11_0 = stackIn_6_0;
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(gma param0, int param1, gr param2) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          super.a(param0, param1, param2);
          if (param2 instanceof im) {
            this.field_q = 1;
          }
          if (param0.b(true)) {
            this.field_q = 3;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("ce.C(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_13_0 = stackIn_9_0;
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_0 = stackIn_13_0;
            stackIn_14_2 = "null";
          } else {
            stackIn_14_0 = stackIn_9_0;
            stackIn_14_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void l(int param0) {
        try {
          field_w = null;
          field_n = null;
          if (param0 != 30389) {
            field_n = (String[]) null;
          }
          field_A = (int[][]) null;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ce.P(" + param0 + ')');
        }
    }

    ce(int param0) {
        super(param0);
        this.field_p = false;
        this.field_t = null;
        this.field_o = null;
        this.field_v = null;
    }

    private final void a(boolean param0) {
        int var6 = 0;
        int var8 = 0;
        int stackIn_25_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_37_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var7 = 0;
        eh var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        la var17 = null;
        var16 = TombRacer.field_G ? 1 : 0;
        try {
          var17 = this.a(18);
          var3 = this.field_h.d(3);
          var4 = this.field_h.e(9648);
          this.field_z = this.field_h.c(-84) / 2097152;
          this.field_s = this.field_h.a((byte) 55) / 2097152;
          if ((1 >= this.field_z ||
            this.field_s <= 1) && this.field_q == 2) {
            this.field_q = 0;
          }
          if (!this.p((byte) 77)) {
            this.o((byte) 95);
            return;
          }
          this.field_r = new eh[this.field_z][this.field_s];
          var5 = 1048576 + (-(this.field_h.a((byte) 55) / 2) + var4);
          if (!param0) {
            this.field_o = (fla) null;
          }
          for (var6 = 0; this.field_s > var6; var6++) {
            var7 = -(this.field_h.c(-117) / 2) + (var3 + 1048576);
            for (var8 = 0; this.field_z > var8; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = new eh();
              this.field_r[var8][var6] = var9;
              if (0 != this.field_q) {
                stackIn_25_0 = (var8 > 0) ? 1 : 0;
                var10 = stackIn_25_0;
                stackIn_29_0 = (var8 >= -1 + this.field_z) ? 0 : 1;
                var11 = stackIn_29_0;
                stackIn_33_0 = (var6 <= 0) ? 0 : 1;
                var12 = stackIn_33_0;
                stackIn_37_0 = (this.field_s - 1 <= var6) ? 0 : 1;
                var13 = stackIn_37_0;
                var14 = 0;
                if (var10 != 0) {
                  var14++;
                }
                if (var11 != 0) {
                  var14++;
                }
                if (var12 != 0) {
                  var14++;
                }
                if (var13 != 0) {
                  var14++;
                }
                var15 = 0;
                if (var14 == 4) {
                  var9.field_h = 2;
                } else {
                  if (var14 != 3) {
                    if (2 == var14) {
                      var9.field_h = 1;
                      if (var10 == 0 &&
                        var12 == 0) {
                        var15 = 512;
                      } else {
                        if (var10 == 0 &&
                          var13 == 0) {
                          var15 = 0;
                        } else {
                          if (var11 == 0 &&
                            var12 == 0) {
                            var15 = 1024;
                          } else {
                            if (var11 == 0) {
                              if (var13 != 0) {
                                var9.field_a = dfa.a(var15 + mpa.field_W[var9.field_h], 2048, -70);
                                var9.field_e = this;
                                var9.field_b = var17.e(true).a(100, 0);
                                var9.field_c = var5 - var4;
                                var9.field_d = -var3 + var7;
                                var9.field_f = this.a(var9, 2);
                                var7 = var7 + 2097152;
                                decompiledFrameRemainder0 = false;
                              }
                              else {
                                var15 = -512;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      var9.field_h = 2;
                    }
                  } else {
                    if (var12 != 0) {
                      if (var13 == 0) {
                        var15 = 0;
                      } else {
                        var15 = (var11 != 0) ? 512 : -512;
                      }
                    } else {
                      var15 = 1024;
                    }
                    var9.field_h = 0;
                  }
                }
                if (decompiledFrameRemainder0) {
                  var9.field_a = dfa.a(var15 + mpa.field_W[var9.field_h], 2048, -70);
                }
              } else {
                var9.field_a = 512;
              }
              if (decompiledFrameRemainder0) {
                var9.field_e = this;
                var9.field_b = var17.e(true).a(100, 0);
                var9.field_c = var5 - var4;
                var9.field_d = -var3 + var7;
                var9.field_f = this.a(var9, 2);
                var7 = var7 + 2097152;
              }
            }
            var5 = var5 + 2097152;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "ce.I(" + param0 + ')');
        }
    }

    final int i(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 1024) {
            stackIn_4_0 = this.field_x;
            return stackIn_4_0;
          }
          stackIn_2_0 = 21;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "ce.F(" + param0 + ')');
        }
    }

    final void a(byte param0, int param1) {
        w var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          super.a((byte) 92, param1);
          var3 = (w) (this.a(29).field_G);
          var4 = -57 % ((7 - param0) / 36);
          if (var3 == null) {
            return;
          }
          var3.a(new fm(3, this.b((byte) -93), this.c((byte) 115), this.e((byte) -89)), -58);
          if (this.field_t != null) {
            this.field_t.a(-120, var3);
            this.field_t = null;
          }
          if (null != this.field_o) {
            this.field_o.a(-100, var3);
            this.field_o = null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3_ref), "ce.LA(" + param0 + ',' + param1 + ')');
        }
    }

    final void d(int param0) {
        int var4_int = 0;
        int var5_int = 0;
        boolean stackIn_51_1 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        Object var4 = null;
        w var4_ref = null;
        Object var5 = null;
        fsa var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        vna var15 = null;
        uja var16 = null;
        int var17 = 0;
        Object var18 = null;
        wda var18_ref = null;
        int var19 = 0;
        var4 = null;
        var5 = null;
        var18 = null;
        var19 = TombRacer.field_G ? 1 : 0;
        try {
          super.d(-1);
          var2_int = 0;
          var3 = 0;
          if (this.field_m != null &&
            this.field_m.d(false)) {
            this.field_u = -131072 + uca.field_c.a(262144, ~param0);
            this.field_x = uca.field_c.a(262144, param0 + 1) - 131072;
            var2_int = 1;
            if (this.field_m.g((byte) 120)) {
              var2_int = 0;
              for (var4_int = 0; this.field_z > var4_int; var4_int++) {
                for (var5_int = 0; this.field_s > var5_int; var5_int++) {
                  this.field_r[var4_int][var5_int].field_g.a(0);
                }
              }
              var3 = 1;
            }
          }
          var4_ref = (w) (this.a(94).field_G);
          if (var4_ref == null) {
            return;
          }
          if (param0 != -1) {
            this.field_t = (fla) null;
          }
          var5_ref = (fsa) (this.field_h);
          var6 = 1;
          var7 = this.b((byte) 84) - var4_ref.field_h >> 16;
          var8 = this.c((byte) 126) - var4_ref.field_c >> 16;
          var9 = (double)ua.a(var7, -118);
          var11 = (double)ua.a(var8, -125);
          var13 = Math.sqrt(var11 * var11 + var9 * var9);
          if (768.0 <= var13) {
            var6 = 0;
          }
          if (1 != this.field_q) {
            if (var2_int != 0 &&
              this.field_t == null) {
              this.field_t = var4_ref.a(new fm(19, this.b((byte) 84), this.c((byte) 123), this.e((byte) -118)), param0 ^ 57);
            } else {
              if (var2_int == 0 &&
                null != this.field_t) {
                this.field_t.a(param0 - 117, var4_ref);
                this.field_t = null;
              }
            }
            if (var3 != 0 &&
              !this.field_p) {
              var4_ref.a(new fm(7, this.b((byte) -109), this.c((byte) 125), this.e((byte) -115)), param0 ^ 57);
            }
            stackIn_51_1 = (var3 != 0);
            this.field_p = stackIn_51_1;
            var15 = var5_ref.field_B;
            var16 = new uja(var15);
            var17 = 0;
            var18_ref = (wda) (var16.a(true));
            while (var18_ref != null) {
              if (var18_ref instanceof ro) {
                if (((ro) (var18_ref)).d(false) != this.field_y) {
                  var4_ref.a(new fm(20, this.b((byte) 39), this.c((byte) 109), this.e((byte) -116)), -58);
                  this.field_y = ((ro) (var18_ref)).d(false);
                }
                if (var18_ref.a(-58) &&
                  this.field_y == 0) {
                  if (((ro) (var18_ref)).e(69) == 4096 &&
                    this.field_v == null) {
                    this.field_v = var4_ref.a(new fm(21, this.b((byte) 114), this.c((byte) 94), this.e((byte) -124)), -58);
                  } else {
                    if (((ro) (var18_ref)).e(114) == 327680 &&
                      null == this.field_v) {
                      this.field_v = var4_ref.a(new fm(22, this.b((byte) -86), this.c((byte) 101), this.e((byte) -113)), -58);
                    }
                  }
                  var17 = 1;
                }
              }
              var18_ref = (wda) (var16.a(-1));
            }
            if (var17 == 0 &&
              this.field_v != null) {
              this.field_v.a(param0 + 15, var4_ref);
              this.field_v = null;
            }
          } else if (this.field_o == null &&
            var6 != 0) {
            this.field_o = var4_ref.a(new fm(9, this.b((byte) -101), this.c((byte) 99), this.e((byte) -98)), param0 ^ 57);
          } else {
            if (this.field_o != null &&
              var6 == 0) {
              this.field_o.a(param0 + 112, var4_ref);
              this.field_o = null;
            }
          }
          if (this.field_o != null) {
            this.field_o.a(this.b((byte) -97), var4_ref.field_c, param0 ^ 127, var4_ref.field_h, this.c((byte) 96));
          }
          if (this.field_t != null) {
            this.field_t.a(this.b((byte) 103), var4_ref.field_c, -128, var4_ref.field_h, this.c((byte) 127));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "ce.K(" + param0 + ')');
        }
    }

    final void a(byte param0, kh param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.a((byte) -58, param1);
          var3_int = -7 % ((param0 + 8) / 40);
          param1.a((byte) -16, this.field_q, 4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("ce.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final void h(int param0) {
        int var2_int = 0;
        int var3 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        eh var4 = null;
        int var5 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          super.h(119);
          if (this.field_r == null) {
            return;
          }
          if (param0 <= 0) {
            return;
          }
          for (var2_int = 0; this.field_z > var2_int; var2_int++) {
            for (var3 = 0; this.field_s > var3; var3++) {
              var4 = this.field_r[var2_int][var3];
              var5 = mpa.field_W[var4.field_h];
              var4.field_a = dfa.a(-var4.field_a + var5, 2048, 65);
              var4.field_d = -var4.field_d;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "ce.HA(" + param0 + ')');
        }
    }

    final void b(int param0, byte param1) {
        try {
          if (param1 != 23) {
            field_B = false;
          }
          this.field_q = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ce.Q(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(uw param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 82) {
            this.b(-71, (uw) null);
          }
          super.a(param0, 105);
          this.field_r = (eh[][]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("ce.RA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, uw param1, byte param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          if (param2 <= 40) {
            this.field_v = (fla) null;
          }
          if (null != this.field_r) {
            for (var4_int = 0; this.field_z > var4_int; var4_int++) {
              for (var5 = 0; this.field_s > var5; var5++) {
                param1.a(param0, this.field_r[var4_int][var5], (byte) -33);
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("ce.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void o(byte param0) {
        eh var3 = null;
        eh var2 = null;
        try {
          this.field_s = 1;
          this.field_z = 1;
          this.field_r = new eh[1][1];
          if (param0 < 74) {
            this.a((byte) 41, 36);
          }
          var3 = new eh();
          var2 = var3;
          var2.field_a = 0;
          var2.field_c = 0;
          var2.field_d = 0;
          var2.field_h = 0;
          var2.field_e = this;
          var2.field_b = this.a(53).e(true).a(100, 0);
          var2.field_f = this.a(var3, 2);
          this.field_r[0][0] = var3;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ce.B(" + param0 + ')');
        }
    }

    final int k(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          if (this.field_h.j(-1)) {
            stackIn_4_0 = 2;
            return stackIn_4_0;
          }
          if (param0 != -99) {
            this.field_r = (eh[][]) null;
          }
          var2_int = this.field_q;
          if (var2_int == 2) {
            stackIn_14_0 = 2;
            return stackIn_14_0;
          }
          if (var2_int == 1) {
            stackIn_16_0 = 5;
            return stackIn_16_0;
          }
          stackIn_18_0 = 3;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "ce.S(" + param0 + ')');
        }
    }

    ce(int param0, la param1, kh param2) {
        super(param0, param1, param2);
        this.field_p = false;
        this.field_t = null;
        this.field_o = null;
        this.field_v = null;
    }

    final void a(byte param0, int param1, uw param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 <= 50) {
            this.n((byte) 0);
          }
          if (null != this.field_r) {
            for (var4_int = 0; this.field_z > var4_int; var4_int++) {
              for (var5 = 0; var5 < this.field_s; var5++) {
                param2.a((byte) -111, param1, this.field_r[var4_int][var5]);
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("ce.V(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void a(int param0, la param1, kh param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.a(127, param1, param2);
          this.field_q = param2.b((byte) 44, 4);
          if (param0 <= 119) {
            this.field_s = -69;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ce.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_0 = stackIn_6_0;
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_11_0 = stackIn_10_0;
            stackIn_11_2 = "null";
          } else {
            stackIn_11_0 = stackIn_6_0;
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void j(int param0) {
        psa var1 = null;
        psa var2 = null;
        try {
          var1 = new psa();
          var2 = new psa(var1);
          var1.d(128, 9, param0 + 6);
          var2.d(128, 9, 32460);
          if (param0 != 32454) {
            ce.l(-98);
          }
          ab.field_n = new sq(var1, var2);
          wea.a(22050, 1024, ab.field_n, true, (java.awt.Component) ((Object) nma.field_l), dsa.field_c);
          wra.a(0);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ce.R(" + param0 + ')');
        }
    }

    private final int a(eh param0, int param1) {
        int stackIn_3_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_59_0 = 0;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_64_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1 != 2) {
            stackIn_3_0 = -64;
            return stackIn_3_0;
          }
          var3_int = this.field_q;
          if (var3_int != 0) {
            if (var3_int == 1) {
              stackIn_23_0 = 26;
              return stackIn_23_0;
            }
            if (var3_int == 2) {
              var3_int = param0.field_h;
              if (var3_int == 0) {
                if (33 > param0.field_b) {
                  stackIn_33_0 = 54;
                  return stackIn_33_0;
                }
                if (param0.field_b >= 66) {
                  stackIn_38_0 = 56;
                  return stackIn_38_0;
                }
                stackIn_36_0 = 55;
                return stackIn_36_0;
              }
              if (1 != var3_int) {
                if (var3_int == 2) {
                }
                if (param0.field_b >= 50) {
                  stackIn_51_0 = 61;
                  return stackIn_51_0;
                }
                stackIn_49_0 = 60;
                return stackIn_49_0;
              }
              if (param0.field_b < 33) {
                stackIn_46_0 = 57;
                return stackIn_46_0;
              }
              if (param0.field_b < 66) {
                stackIn_44_0 = 58;
                return stackIn_44_0;
              }
              stackIn_42_0 = 59;
              return stackIn_42_0;
            }
            if (4 == var3_int) {
              if (33 > param0.field_b) {
                stackIn_59_0 = 110;
                return stackIn_59_0;
              }
              if (param0.field_b < 66) {
                stackIn_57_0 = 111;
                return stackIn_57_0;
              }
              stackIn_55_0 = 112;
              return stackIn_55_0;
            }
          }
          if (param0.field_b < 33) {
            stackIn_21_0 = 51;
            return stackIn_21_0;
          }
          if (param0.field_b < 66) {
            stackIn_19_0 = 52;
            return stackIn_19_0;
          }
          stackIn_17_0 = 53;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_63_0 = var3;
          stackIn_63_1 = new StringBuilder().append("ce.H(");
          if (param0 == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_63_0), ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6_int = 63 / ((param4 + 38) / 47);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("ce.D(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final boolean p(byte param0) {
        boolean stackIn_6_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 < 7) {
            this.b(-54, (uw) null);
          }
          stackIn_6_0 = (this.field_q != 1);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "ce.T(" + param0 + ')');
        }
    }

    static {
        field_n = new String[17];
        field_n[5] = "Path Move";
        field_n[7] = "Face Player";
        field_n[9] = "Circle Movement";
        field_n[15] = "Teleport";
        field_n[2] = "Locomotor Controller";
        field_n[16] = "Sweep Rotate";
        field_n[4] = "Mirror Mover";
        field_n[10] = "Face Point";
        field_n[1] = "Approach Player";
        field_n[13] = "Constrain To Facing Arc";
        field_n[6] = "Rotate";
        field_n[0] = "Simple Move";
        field_n[8] = "Constrain To Circle";
        field_n[12] = "Constrain To Lattice";
        field_n[14] = "Track Player";
        field_n[3] = "Flee";
        field_n[11] = "Constrain To Rectangle";
        field_B = true;
        field_w = "<%0> is already on your friend list.";
    }
}
