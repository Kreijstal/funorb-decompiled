/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tb implements pa {
    static String field_d;
    private int[] field_k;
    private int field_m;
    static volatile int field_g;
    private ha field_c;
    static oc field_e;
    static int[] field_h;
    static wk[] field_j;
    private v field_i;
    private vb field_f;
    static String field_b;
    static String field_a;
    private boolean field_l;

    public final void a(int param0) {
        if (param0 <= 94) {
          oj var3 = (oj) null;
          this.a((oj) null, (byte) -97);
        }
    }

    public final boolean b(byte param0) {
        if (param0 > -25) {
          return false;
        }
        return false;
    }

    public final boolean b(int param0) {
        if (param0 != 8865) {
          field_e = (oc) null;
        }
        return this.field_l;
    }

    final static void d(int param0) {
        ou.a(true);
        pl.field_A = true;
        fh.field_i = true;
        rl.field_C.j(-102);
        if (param0 != 7) {
          tb.c(101);
        }
        af.a(false, bm.field_z, -1);
    }

    final static void a(boolean param0, int param1, boolean param2, int param3, byte param4, int param5) {
        int var10 = 0;
        int var15 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int[][] stackIn_34_2 = null;
        int stackIn_35_3 = 0;
        int stackIn_37_2;
        int stackIn_37_3;
        int stackIn_38_4;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        var16 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          if (param5 != -1 &&
            param5 != 255) {
            if (param4 != -33) {
              field_g = 60;
            }
            stackIn_10_0 = (param2) ? 1 : -1;
            var6_int = stackIn_10_0;
            stackIn_13_0 = (!param0) ? 1 : -1;
            var7 = stackIn_13_0;
            stackIn_16_0 = (param2) ? 0 : 1;
            if (param0) {
              stackIn_19_1 = 0;
            } else {
              stackIn_19_1 = 1;
            }
            stackIn_22_0 = (stackIn_16_0 != stackIn_19_1) ? -1 : 1;
            var8 = stackIn_22_0;
            var9 = so.field_b.field_a;
            for (var10 = 0; var10 < 40; var10++) {
              var11 = var6_int * var10 + param1;
              if (param2) {
                var11++;
              }
              if (var11 >= 0 &&
                var9 >= var11) {
                var12 = (int)(Math.sin((double)(var10 + ug.field_b * (var8 * 2)) * 3.141592653589793 / 20.0) * 3.0 * (double)var8);
                var12 = var12 + (int)((double)var8 * (3.0 * Math.sin(3.141592653589793 * (double)(-(3 * var8 * ug.field_b) + 2 * var10) / 20.0)));
                var13 = 32;
                var14 = 256;
                for (var15 = 0; var15 < 16; var15++) {
                  stackIn_34_0 = var11;
                  stackIn_34_1 = param3 - (-((20 - (var10 >> 1)) * var7) - (-var15 - var12));
                  stackIn_34_2 = op.field_c;
                  if (bv.field_w != null &&
                    bv.field_w.field_wb) {
                    stackIn_35_3 = 1;
                  } else {
                    stackIn_35_3 = 0;
                  }
                  stackIn_37_2 = stackIn_34_2[stackIn_35_3][param5];
                  stackIn_37_3 = 256;
                  if (var14 <= 0) {
                    stackIn_38_4 = -var14;
                  } else {
                    stackIn_38_4 = var14;
                  }
                  qn.g(stackIn_34_0, stackIn_34_1, stackIn_37_2, stackIn_37_3 - stackIn_38_4);
                  var14 = var14 - var13;
                }
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var6), "tb.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void c(int param0) {
        field_j = null;
        field_b = null;
        field_a = null;
        field_d = null;
        if (param0 > -58) {
          field_j = (wk[]) null;
        }
        field_h = null;
        field_e = null;
    }

    final static boolean a(boolean param0, int param1) {
        long dupTemp$2 = 0L;
        if (kd.field_J == null) {
          kd.field_J = wj.field_n.a(rn.field_d, (byte) 120, k.field_c);
        }
        if (param1 == kd.field_J.field_g) {
          return false;
        }
        dupTemp$2 = vi.b(82);
        mb.field_G = dupTemp$2;
        iq.field_h = dupTemp$2;
        if (kd.field_J.field_g != 1) {
        }
        ov.field_g = cj.field_o;
        kd.field_J = null;
        return true;
    }

    public final void b(oj param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_i.field_c[0] = this.field_f.field_x % this.field_m;
          this.field_i.field_c[1] = this.field_f.field_x / this.field_m;
          this.field_i.f(-111);
          this.field_i.i(0);
          this.field_k[1] = this.field_i.field_e[1];
          this.field_k[0] = this.field_i.field_e[0];
          var3_int = 127 % ((param1 + 26) / 48);
          this.field_f.field_m = this.field_k[0];
          this.field_f.field_v = this.field_k[1];
          if (param0 == null) {
            return;
          }
          this.field_l = this.field_f.field_u.a(this.field_f.field_m + 1, -35, this.field_f.field_v - 6, -1, param0.field_w);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("tb.Q(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int[] param0, vh param1, boolean param2, int[] param3) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          var4_int = 0;
          if (param2) {
            field_d = (String) null;
          }
          while (var4_int < 6) {
            param0[var4_int] = param1.k(0);
            param3[var4_int] = param1.k(0);
            if (param0[var4_int] == 255) {
              param0[var4_int] = -1;
            }
            var4_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("tb.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public final boolean a(oj param0, byte param1) {
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        String var4_ref_String = null;
        int var6 = 0;
        hp var7 = null;
        String var8 = null;
        kf var9 = null;
        String var10 = null;
        qq var11 = null;
        String var12 = null;
        ec var13 = null;
        String var14 = null;
        tr var15 = null;
        String var16 = null;
        String var17 = null;
        Object var18 = null;
        qq var18_ref = null;
        String var19 = null;
        Object var20 = null;
        kn var20_ref = null;
        Object var21 = null;
        q var21_ref = null;
        String var22 = null;
        Object var23 = null;
        qq var23_ref = null;
        String var24 = null;
        var18 = null;
        var20 = null;
        var21 = null;
        var23 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          if (param0.field_m != 10) {
            if (param0.field_m != 11) {
              if (3 == param0.field_m) {
                var23_ref = (qq) (param0);
                var4 = this.field_m * var23_ref.field_J + var23_ref.field_I;
                this.field_f.field_x = var4;
                var23_ref.field_w = this.field_c.c(var23_ref.field_J, true, var23_ref.field_I);
                if (var23_ref.field_w == null) {
                  var24 = nv.field_bb + ": Can see capture";
                  this.field_c.a(param1 ^ 57, var24, param0);
                  return false;
                }
                ub.$cfr$intArgs$a$6d836999ad61(91, im.field_v[8]);
                var23_ref.field_w.field_z = 5;
                var23_ref.a(var23_ref.field_w, 12);
                this.b(var23_ref, (byte) -95);
              } else {
                if (param0.field_m != 17) {
                  if (param0.field_m != 21) {
                    if (param0.field_m == 6) {
                      var21_ref = (q) (param0);
                      var21_ref.field_w = this.field_c.c(var21_ref.field_E, true, var21_ref.field_z);
                      var4 = var21_ref.field_z + this.field_m * var21_ref.field_E;
                      this.field_f.field_x = var4;
                      if (null != var21_ref.field_w &&
                        var21_ref.field_w.field_bb) {
                        var21_ref.field_w = var21_ref.field_w.b(false);
                      }
                      if (null == var21_ref.field_w) {
                        var22 = nv.field_bb + ": Can see telepop";
                        this.field_c.a(0, var22, param0);
                        return false;
                      }
                      var21_ref.field_w.field_z = 2;
                      var21_ref.a(var21_ref.field_w, 12);
                      this.b(var21_ref, (byte) -103);
                    } else {
                      if (param0.field_m == 5) {
                        var20_ref = (kn) (param0);
                        if (var20_ref.field_w == null) {
                          var4_ref_String = nv.field_bb + ": Telefrag unit null";
                          this.field_c.a(0, var4_ref_String, param0);
                          return false;
                        }
                        var4 = var20_ref.field_w.field_J + var20_ref.field_w.field_w * this.field_m;
                        var20_ref.field_w.field_z = 1;
                        this.field_f.field_x = var4;
                        dh.a(var20_ref.field_w.field_N, 0, param1 ^ 25);
                        var20_ref.a(var20_ref.field_w, 12);
                        this.b(var20_ref, (byte) -115);
                      } else {
                        if (12 != param0.field_m &&
                          param0.field_m != 16 &&
                          param0.field_m != 14) {
                          if ((param0.field_m == 18)) {
                            var15 = (tr) (param0);
                            var4 = var15.field_E + this.field_m * var15.field_D;
                            this.field_f.field_x = var4;
                            var15.field_w = this.field_c.c(var15.field_D, true, var15.field_E);
                            if (var15.field_w == null) {
                              var16 = nv.field_bb + ": Can see deployment";
                              this.field_c.a(0, var16, param0);
                              return false;
                            }
                            if (34 == var15.field_w.field_N) {
                              var15.field_w.c(75, param1 ^ 49);
                              var15.field_w.field_z = 1;
                            } else {
                              if (var15.field_w.field_N != 7 &&
                                17 != var15.field_w.field_N) {
                                var17 = nv.field_bb + ": Unit not deployable";
                                this.field_c.a(0, var17, param0);
                                return false;
                              }
                              var15.field_w.field_z = 4;
                            }
                            var15.a(var15.field_w, 12);
                            this.b(var15, (byte) -75);
                          }
                          decompiledFrameRemainder0 = false;
                        }
                        else {
                          var18_ref = (qq) (param0);
                          var4 = var18_ref.field_I + var18_ref.field_J * this.field_m;
                          this.field_f.field_x = var4;
                          var18_ref.field_w = this.field_c.c(var18_ref.field_J, true, var18_ref.field_I);
                          if (var18_ref.field_w == null) {
                            var19 = nv.field_bb + ": Can see heal, raise, pump";
                            this.field_c.a(0, var19, param0);
                            return false;
                          }
                          var18_ref.field_w.field_z = 8;
                          var18_ref.a(var18_ref.field_w, 12);
                          this.b(var18_ref, (byte) -124);
                        }
                      }
                    }
                  } else {
                    var13 = (ec) (param0);
                    var4 = var13.field_A + var13.field_B * this.field_m;
                    var13.field_w = this.field_c.c(var13.field_B, true, var13.field_A);
                    if (null != var13.field_w &&
                      var13.field_w.field_bb) {
                      var13.field_w = var13.field_w.b(false);
                    }
                    this.field_f.field_x = var4;
                    if (var13.field_w == null) {
                      var14 = nv.field_bb + ": Can see teleport";
                      this.field_c.a(0, var14, param0);
                      return false;
                    }
                    dh.a(var13.field_w.field_N, 0, 32);
                    var13.field_w.field_z = 2;
                    var13.a(var13.field_w, 12);
                    this.b(var13, (byte) 73);
                  }
                } else {
                  var11 = (qq) (param0);
                  var4 = this.field_m * var11.field_J + var11.field_I;
                  this.field_f.field_x = var4;
                  var11.field_w = this.field_c.c(var11.field_J, true, var11.field_I);
                  if (null == var11.field_w) {
                    var12 = nv.field_bb + ": Can see burial";
                    this.field_c.a(0, var12, param0);
                    return false;
                  }
                  var11.field_w.field_z = 4;
                  var11.a(var11.field_w, 12);
                  this.b(var11, (byte) -126);
                }
              }
            } else {
              var9 = (kf) (param0);
              var4 = var9.field_H + var9.field_F * this.field_m;
              this.field_f.field_x = var4;
              if (null == var9.field_w) {
                var10 = nv.field_bb + ": Can see growth";
                this.field_c.a(0, var10, param0);
                return false;
              }
              var9.field_w.field_z = 1;
              var9.a(var9.field_w, 12);
              this.b(var9, (byte) 123);
            }
          } else {
            var7 = (hp) (param0);
            var4 = var7.field_y + var7.field_D * this.field_m;
            this.field_f.field_x = var4;
            if (null == var7.field_w) {
              var7.field_w = this.field_c.c(var7.field_D, true, var7.field_y);
            }
            if (null == var7.field_w) {
              var8 = nv.field_bb + ": Can see death";
              this.field_c.a(0, var8, param0);
              return false;
            }
            var7.field_w.field_z = 7;
            dh.a(var7.field_w.field_N, 5, param1 - 25);
            var7.a(var7.field_w, 12);
            this.b(var7, (byte) 68);
          }
          if (param1 == 57) {
            return true;
          }
          field_e = (oc) null;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_74_0 = var3;
          stackIn_74_1 = new StringBuilder().append("tb.E(");
          if (param0 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_74_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void a(byte param0) {
        if (param0 != -52) {
          this.b(76);
        }
    }

    public final void c(byte param0) {
        if (param0 >= -119) {
          field_h = (int[]) null;
        }
    }

    tb(ha param0, v param1, vb param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_m = param0.field_v;
          this.field_i = param1;
          this.field_f = param2;
          this.field_c = param0;
          this.field_k = new int[2];
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_5_0 = var4;
          stackIn_5_1 = new StringBuilder().append("tb.<init>(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    static {
        field_d = "Game options";
        field_g = 0;
        field_b = "Asking for or providing contact information";
        field_a = "Unable to delete name - system busy";
    }
}
