/*
 * Decompiled by CFR-JS 0.4.0.
 */
class jj extends t {
    static int field_F;
    static byte[][] field_E;
    private bl field_C;
    private String[] field_D;
    static String field_B;
    private pj field_G;

    void a(we param0, int param1, int param2, byte param3) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.a(param0, param1, param2, (byte) -28);
          this.field_C = null;
          if (param3 >= -13) {
            this.field_D = (String[]) null;
          }
          if (this.field_g) {
            var5_int = ei.field_a + (-param2 - this.field_r);
            var6 = -this.field_e - param1 + p.field_a;
            this.field_C = this.b(var6, var5_int, 2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("jj.E(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static cj a(String[] args, boolean param1) {
        cj var2 = null;
        RuntimeException var2_ref = null;
        cj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new cj(false);
          if (!param1) {
            jj.d((byte) -44);
          }
          var2.field_g = args;
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("jj.B(");
          if (args == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void c(int param0, int param1, int param2, int param3) {
        if (param3 != -1) {
          this.a(-61, 36, 65, -22);
        }
        this.a(((ui) ((Object) this.field_h)).a((we) (this), false), 13361, param0, param2, param1);
    }

    boolean a(we param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            return false;
          }
          field_F = -112;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("jj.AA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != 13361) {
          jj.c((byte) -53);
        }
        super.a(param0, param1 + 0, param2, param3, param4);
        this.a(true);
    }

    final void a(boolean param0) {
        int var11 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int var2;
        ui var3;
        aa var4;
        int var5;
        String var6;
        int var7;
        int var8;
        int var9;
        Object var10;
        be var12;
        int var13;
        int var14;
        bl var15;
        int var16;
        String var17;
        int var7Lifetime1;
        var16 = MonkeyPuzzle2.field_F ? 1 : 0;
        this.field_G = new pj();
        var2 = 0;
        if (!param0) {
          var17 = (String) null;
          this.a(true, 111, (String) null);
        }
        var3 = (ui) ((Object) this.field_h);
        var4 = var3.a(-1, (we) (this));
        while (true) {
          var5 = this.field_s.indexOf("<hotspot=", var2);
          if (var5 == -1) {
            return;
          }
          var7 = this.field_s.indexOf(">", var5);
          var6 = this.field_s.substring(var5 + 9, var7);
          var7Lifetime1 = Integer.parseInt(var6);
          var2 = this.field_s.indexOf("</hotspot>", var5);
          var8 = var4.b(var5, -51);
          var9 = var4.b(var2, -21);
          var10 = null;
          for (var11 = var8; var11 <= var9; var11++) {
            var12 = var4.field_c[var11];
            if (var8 == var11) {
              stackIn_9_0 = var4.a(-75, var5);
            } else {
              stackIn_9_0 = var12.field_c[0];
            }
            var13 = stackIn_9_0;
            if (var11 == var9) {
              stackIn_14_0 = var4.a(116, var2);
            } else {
              if (var12 == null) {
                stackIn_14_0 = 0;
              } else {
                stackIn_14_0 = var12.field_c[-1 + var12.field_c.length];
              }
            }
            var14 = stackIn_14_0;
            var15 = new bl(var7Lifetime1, var13, var12.field_a, -var13 + var14, Math.max(var3.a(2), var12.field_f - var12.field_a));
            if (var10 != null) {
              ((bl) (var10)).field_e = var15;
            }
            var10 = var15;
            this.field_G.a(-8212, var15);
          }
        }
    }

    public static void d(byte param0) {
        field_E = (byte[][]) null;
        field_B = null;
        if (param0 != 117) {
          jj.b(true);
        }
    }

    final static boolean a(int param0, ki param1, int param2, int param3) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_67_0 = 0;
        RuntimeException stackIn_134_0 = null;
        StringBuilder stackIn_134_1 = null;
        String stackIn_135_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        ki var32_ref_ki = null;
        int var33 = 0;
        int[] var40 = null;
        int[] var41 = null;
        int var29Lifetime1;
        int var30Lifetime1;
        int var31Lifetime1;
        int var31Lifetime2;
        int var32Lifetime1;
        int var32Lifetime2;
        int var31Lifetime1Lifetime1;
        int var31Lifetime2Lifetime1;
        int var32Lifetime1Lifetime1;
        var33 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          param3 = param3 - (-param1.field_I.field_n + nd.field_b.field_n) / 2;
          param2 = param2 - (-param1.field_I.field_m + nd.field_b.field_m) / 2;
          param2 = param2 + nd.field_b.field_r;
          param3 = param3 + nd.field_b.field_q;
          var4_int = sb.field_m.field_r - param2;
          var5 = sb.field_m.field_q - param3;
          var6 = nd.field_b.field_k;
          if (var4_int < var6) {
            stackIn_4_0 = sb.field_m.field_k;
          } else {
            stackIn_4_0 = 0;
          }
          var7 = stackIn_4_0;
          var8 = nd.field_b.field_j;
          if (var5 < var8) {
            stackIn_7_0 = sb.field_m.field_j;
          } else {
            stackIn_7_0 = 0;
          }
          var9 = stackIn_7_0;
          stackIn_10_0 = (var4_int > 0) ? var4_int : 0;
          var10 = stackIn_10_0;
          stackIn_13_0 = (0 < var5) ? var5 : 0;
          var11 = stackIn_13_0;
          var12 = var7 + var4_int;
          if (var12 > var6) {
            var12 = var6;
          }
          var13 = var5 + var9;
          var12 = var12 - var10;
          if (var8 < var13) {
            var13 = var8;
          }
          var13 = var13 - var11;
          var14 = var10 + var11 * var6;
          if (param0 != -32680) {
            field_E = (byte[][]) null;
          }
          var15 = -var12 + var6;
          var16 = var10 + (-var4_int + (-var5 + var11) * var7);
          var17 = var7 - var12;
          var40 = nd.field_b.field_s;
          var41 = sb.field_m.field_s;
          var20 = 0;
          var21 = 0;
          var22 = 0;
          var23 = 0;
          var24 = -1;
          var25 = -1;
          var26 = -1;
          var27 = -1;
          var28 = 0;
          for (var29 = var13; var29 > 0; var29--) {
            for (var30 = var12; var30 > 0; var30--) {
              if (0 != var40[var14] &&
                0 != var41[var16]) {
                var31 = var41[var16];
                if (var31 >= 16777212) {
                  if (var31 == 16777213) {
                    var25 = var16;
                    var22++;
                  } else {
                    if (16777212 == var31) {
                      var23++;
                      var26 = var16;
                    } else {
                      if (var31 != 16777215) {
                        if (16777214 == var31) {
                          var21++;
                          var27 = var16;
                        }
                      } else {
                        var20++;
                        var24 = var16;
                      }
                    }
                  }
                } else {
                  var32_ref_ki = e.field_a[-1 + var31];
                  stackIn_30_0 = var28;
                  if (var32_ref_ki.field_w != 3) {
                    stackIn_31_1 = 0;
                  } else {
                    stackIn_31_1 = 1;
                  }
                  var28 = stackIn_30_0 | stackIn_31_1;
                  jc.a(var32_ref_ki, (byte) -124, param1);
                }
              }
              var14++;
              var16++;
            }
            var16 = var16 + var17;
            var14 = var14 + var15;
          }
          if (var22 <= 10) {
            stackIn_49_0 = (var23 > 10) ? 1 : 0;
          } else {
            stackIn_49_0 = 1;
          }
          var29Lifetime1 = stackIn_49_0;
          if (var20 <= 5) {
            stackIn_55_0 = (var21 > 5) ? 1 : 0;
          } else {
            stackIn_55_0 = 1;
          }
          var30Lifetime1 = stackIn_55_0;
          if (var29Lifetime1 == 0 &&
            var30Lifetime1 == 0) {
            return false;
          }
          if (var29Lifetime1 != 0 &&
            var30Lifetime1 != 0) {
            stackIn_64_0 = (var20 + var21 <= var22 + var23) ? 0 : 1;
            var30Lifetime1 = stackIn_64_0;
            stackIn_67_0 = (var30Lifetime1 != 0) ? 0 : 1;
            var29Lifetime1 = stackIn_67_0;
          }
          boolean decompiledFrameRemainder1 = true;
          if (var30Lifetime1 != 0) {
            if (var20 < var21 &&
              0.0f >= param1.field_D) {
              var31Lifetime1 = var27 / sb.field_m.field_k;
              var32 = var27 - sb.field_m.field_k * var31Lifetime1;
              if (nh.a(var32 + 1, var31Lifetime1, (int)param1.field_q, (int)(param1.field_D + param1.field_q), -5425, var32, (int)(param1.field_v + param1.field_B), (int)param1.field_B, var31Lifetime1)) {
                if ((param1.field_q - (float)ok.field_b) * (param1.field_q - (float)ok.field_b) < 100.0f) {
                  param1.field_q = (float)(ok.field_b - param1.field_y);
                }
                if (var29Lifetime1 == 0 &&
                  100.0f > ((float)(-ll.field_a) + param1.field_B) * ((float)(-ll.field_a) + param1.field_B)) {
                  param1.field_B = (float)ll.field_a;
                }
              }
              if (param1.field_m == 0) {
                param1.field_D = -param1.field_D;
              } else {
                param1.field_q = param1.field_q + 1.0f;
              }
              decompiledFrameRemainder1 = false;
            }
            else {
              if (0.0f <= param1.field_D &&
                var20 > var21) {
                var31Lifetime1Lifetime1 = var24 / sb.field_m.field_k;
                var32Lifetime2 = var24 - var31Lifetime1Lifetime1 * sb.field_m.field_k;
                if (nh.a(1 + var32Lifetime2, var31Lifetime1Lifetime1, (int)param1.field_q, (int)(param1.field_q + param1.field_D), -5425, var32Lifetime2, (int)(param1.field_v + param1.field_B), (int)param1.field_B, var31Lifetime1Lifetime1)) {
                  if (100.0f > ((float)(-ok.field_b) + param1.field_q) * (param1.field_q - (float)ok.field_b)) {
                    param1.field_q = (float)(ok.field_b + param1.field_y);
                  }
                  if (var29Lifetime1 == 0 &&
                    ((float)(-ll.field_a) + param1.field_B) * ((float)(-ll.field_a) + param1.field_B) < 100.0f) {
                    param1.field_B = (float)ll.field_a;
                  }
                }
                if (param1.field_m != 0) {
                  param1.field_q = param1.field_q - 1.0f;
                } else {
                  param1.field_D = -param1.field_D;
                }
              }
            }
          }
          boolean decompiledFrameRemainder0 = true;
          if (var29Lifetime1 != 0) {
            if (var22 < var23 &&
              param1.field_v <= 0.0f) {
              var31Lifetime2 = var26 / sb.field_m.field_k;
              var32Lifetime1 = -(var31Lifetime2 * sb.field_m.field_k) + var26 + 80;
              if (nh.a(var32Lifetime1, var31Lifetime2, (int)param1.field_q, (int)(param1.field_D + param1.field_q), param0 + 27255, var32Lifetime1, (int)(param1.field_B + param1.field_v), (int)param1.field_B, var31Lifetime2 - 1)) {
                if (var30Lifetime1 == 0 &&
                  100.0f > (param1.field_q - (float)ok.field_b) * (param1.field_q - (float)ok.field_b)) {
                  param1.field_q = (float)ok.field_b;
                }
                if (100.0f > ((float)(-ll.field_a) + param1.field_B) * ((float)(-ll.field_a) + param1.field_B)) {
                  param1.field_B = (float)(ll.field_a - param1.field_G);
                }
              }
              if (param1.field_m == 0) {
                param1.field_v = -param1.field_v;
              } else {
                param1.field_B = param1.field_B + 1.0f;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (var23 < var22 &&
                param1.field_v >= 0.0f) {
                var31Lifetime2Lifetime1 = var25 / sb.field_m.field_k;
                var32Lifetime1Lifetime1 = 80 + var25 - var31Lifetime2Lifetime1 * sb.field_m.field_k;
                if (nh.a(var32Lifetime1Lifetime1, var31Lifetime2Lifetime1, (int)param1.field_q, (int)(param1.field_D + param1.field_q), -5425, var32Lifetime1Lifetime1, (int)(param1.field_B + param1.field_v), (int)param1.field_B, var31Lifetime2Lifetime1 - 1)) {
                  if (100.0f > ((float)(-ll.field_a) + param1.field_B) * (param1.field_B - (float)ll.field_a)) {
                    param1.field_B = (float)(ll.field_a + param1.field_G);
                  }
                  if (var30Lifetime1 == 0 &&
                    100.0f > (param1.field_q - (float)ok.field_b) * (param1.field_q - (float)ok.field_b)) {
                    param1.field_q = (float)ok.field_b;
                  }
                }
                if (param1.field_m != 0) {
                  param1.field_B = param1.field_B - 1.0f;
                } else {
                  param1.field_v = -param1.field_v;
                }
              }
            }
          }
          return (var28 == 0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_134_0 = var4;
          stackIn_134_1 = new StringBuilder().append("jj.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_135_2 = "null";
          } else {
            stackIn_135_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_134_0), ((StringBuilder) (Object) stackIn_134_1).append(stackIn_135_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void c(byte param0) {
        int var1_int = 0;
        ki var2_ref_ki = null;
        int var4 = 0;
        int var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        int var1_intLifetime1;
        try {
          bd.field_b.a(-8212, new ki(1, 0, 0));
          bd.field_b.a(-8212, new ki(1, 0, 0));
          bd.field_b.a(-8212, new ki(1, 1, 0));
          bd.field_b.a(-8212, new ki(1, 1, 0));
          bd.field_b.a(-8212, new ki(1, 2, 0));
          bd.field_b.a(-8212, new ki(1, 2, 0));
          bd.field_b.a(-8212, new ki(1, 3, 0));
          bd.field_b.a(-8212, new ki(1, 3, 0));
          bd.field_b.a(-8212, new ki(1, 4, 0));
          bd.field_b.a(-8212, new ki(1, 4, 0));
          bd.field_b.a(-8212, new ki(1, 0, 0));
          bd.field_b.a(-8212, new ki(1, 0, 0));
          var1_int = 0;
          var2_ref_ki = (ki) (bd.field_b.a((byte) -117));
          while (var2_ref_ki != null) {
            var2_ref_ki.field_B = rl.field_c[var1_int][0];
            var2_ref_ki.field_q = rl.field_c[var1_int][1];
            var2_ref_ki = (ki) (bd.field_b.d((byte) 63));
          }
          var4 = 0;
          var1_intLifetime1 = var4;
          while (ii.field_E > var4) {
            ii.field_U[var4] = -1;
            var4++;
          }
          bl.a(50, uh.field_e);
          int var2 = 93 / ((-18 - param0) / 35);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "jj.D(" + param0 + ')');
        }
    }

    final static boolean b(boolean param0) {
        ki var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (!param0) {
            field_B = (String) null;
          }
          var1 = (ki) (hd.field_u.a((byte) -117));
          while (var1 != null) {
            if (!var1.field_E) {
              return false;
            }
            var1 = (ki) (hd.field_u.d((byte) 63));
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1_ref), "jj.K(" + param0 + ')');
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2, param3);
        if (0 != param1) {
          return;
        }
        ui var5 = (ui) ((Object) this.field_h);
        bl var6 = this.field_C;
        if (var6 == null) {
        } else {
          var7 = var5.a(param3, (byte) 113, (we) (this));
          var8 = var5.a((we) (this), -94, param2);
          do {
            hk.a(var6.field_l + var7 - 2, -2 + var8 + var6.field_n, 53, 2 + var6.field_i, var6.field_j + 2);
            var6 = var6.field_e;
          } while (var6 != null);
        }
    }

    private final bl b(int param0, int param1, int param2) {
        bl var5 = null;
        int var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        bl var4 = (bl) (this.field_G.a((byte) -117));
        while (var4 != null) {
          var5 = var4;
          while (var5 != null) {
            if (var5.field_l <= param1 &&
              var5.field_n <= param0 &&
              var5.field_l + var5.field_i > param1 &&
              param0 <= var5.field_n + var5.field_j) {
              return var4;
            }
            var5 = var5.field_e;
          }
          var4 = (bl) (this.field_G.d((byte) 63));
        }
        if (param2 == 2) {
          return null;
        }
        this.field_G = (pj) null;
        return null;
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (param0 >= -23) {
          this.a((byte) -81);
        }
        super.b(-102, param1, param2, param3);
        int var5 = -this.field_r + param1;
        int var6 = param2 - this.field_e;
        bl var7 = this.b(var6, var5, 2);
        if (var7 != null &&
          this.field_o != null) {
          ((u) ((Object) this.field_o)).a(var7.field_h, -21099, this, param3);
        }
    }

    final void a(boolean param0, int param1, String param2) {
        int var5 = 0;
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var6 = 0;
        String[] var7 = null;
        String[] var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (null == this.field_D ||
            this.field_D.length <= param1) {
            var7 = new String[param1 + 1];
            var8 = var7;
            var4 = var8;
            if (this.field_D != null) {
              for (var5 = 0; var5 < this.field_D.length; var5++) {
                var7[var5] = this.field_D[var5];
              }
            }
            this.field_D = var8;
          }
          if (param0) {
            return;
          }
          this.field_D[param1] = param2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_15_0 = runtimeException;
          stackIn_15_1 = new StringBuilder().append("jj.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    String a(byte param0) {
        if (param0 != 54) {
          return (String) null;
        }
        if (null == this.field_C) {
          return null;
        }
        if (null == this.field_D) {
          return null;
        }
        if (this.field_C.field_h >= this.field_D.length) {
          return null;
        }
        return this.field_D[this.field_C.field_h];
    }

    jj(String param0, ml param1) {
        super(param0, (of) null);
        this.field_C = null;
        try {
          this.field_h = param1;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "jj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_B = "Passwords must be between 5 and 20 letters and numbers";
    }
}
