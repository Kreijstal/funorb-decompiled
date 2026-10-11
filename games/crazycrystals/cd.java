/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cd extends ea implements Cloneable {
    private int field_y;
    static int[] field_v;
    private int field_C;
    static String field_A;
    private int field_t;
    static int[][] field_z;
    private boolean field_B;
    private int field_w;
    private int field_x;
    static int[] field_u;

    private final dl h(int param0) {
        if (0 < this.field_t) {
          return rf.field_C;
        }
        if (this.field_t < param0) {
          return qi.field_a;
        }
        if (this.field_C > 0) {
          return ba.field_j;
        }
        return ln.field_d;
    }

    public static void b(boolean param0) {
        field_u = null;
        field_v = null;
        field_A = null;
        if (param0) {
          return;
        }
        field_z = (int[][]) null;
    }

    final f e(int param0, int param1, f[][] param2, int param3) {
        f stackIn_16_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        f var5 = null;
        RuntimeException var5_ref = null;
        de var6 = null;
        int var7 = 0;
        var7 = CrazyCrystals.field_B;
        try {
          var5 = this.field_l;
          while (true) {
            if (!(var5 instanceof de)) {
              if (var5 instanceof pn) {
                var5 = ((pn) (var5)).field_l;
                continue;
              }
              break;
            }
            var6 = (de) (var5);
            if (var6.field_j == null) {
              if (vh.field_a &&
                uo.field_o == 4) {
                if (w.field_f + 2 == param1 &&
                  12 + ia.field_i == param0) {
                  va.field_c = 1;
                }
                if (w.field_f + 2 == param1 &&
                  ia.field_i + 27 == param0) {
                  va.field_c = 2;
                }
              }
              wd.field_j = wd.field_j + 1;
              mb.field_g = mb.field_g + ob.field_l;
              fp.field_a = fp.field_a + 256;
              je.field_j = je.field_j + 128;
              we.field_h = we.field_h + 256;
              b.field_a = b.field_a + 128;
              ua.field_a.a(256, param1 * 12, 12 * param0, 0, (byte) -111);
              this.field_B = false;
              var6.field_j = (ea) (this);
              stackIn_16_0 = this.a(param2, param0, (f) (this), 11460, param1);
              return stackIn_16_0;
            }
            break;
          }
          if (param3 < 120) {
            this.e(-51, 45, (f[][]) null, -88);
          }
          return (f) (this);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_26_0 = var5_ref;
          stackIn_26_1 = new StringBuilder().append("cd.OA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, DataInputStream param1, int param2, byte param3, int param4) throws IOException {
        int var6_int = 0;
        int var7 = 0;
        try {
          var6_int = param1.readUnsignedByte();
          if (param3 >= -69) {
            this.field_w = 52;
          }
          this.field_t = mo.field_h[3 & var6_int];
          this.field_C = kl.field_S[3 & var6_int];
          var7 = (var6_int >> 1 & 2) - 1;
          this.field_y = var7 * -this.field_t;
          this.field_x = this.field_C * var7;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "cd.JC(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        if (this.field_B) {
          this.a(0.0, param3, 1, param2, param4, -72, param1);
        }
        if (param2 == 24 &&
          param3 == 24) {
          qj.field_b.a(param1, -param3 + param4);
          if (param0) {
            this.i(param5 - 4261).a(param1, param4 - param3);
            this.h(0).a(param1, param4 - param3);
          }
        } else {
          qj.field_b.b(param1, param4 - param3, param2 * 2, 3 * param3);
          if (param0) {
            this.i(0).b(param1, -param3 + param4, 2 * param2, 3 * param3);
            this.h(param5 ^ 4261).b(param1, param4 - param3, 2 * param2, 3 * param3);
          }
        }
        if (param5 != 4261) {
          return;
        }
        if (this.field_B) {
          this.a(1.5707963267948966, param3, -1, param2, param4, -114, param1);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int[] param15, int param16) {
        int var17_int = 0;
        int var18 = 0;
        int var19 = 0;
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
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var42 = 0;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_79_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var17 = null;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var35Lifetime1;
        int var36Lifetime1;
        int var37Lifetime1;
        int var38Lifetime1;
        int var39Lifetime1;
        int var40Lifetime1;
        int var36Lifetime2;
        int var36Lifetime3;
        int var37Lifetime2;
        int var38Lifetime2;
        int var39Lifetime2;
        int var40Lifetime2;
        var42 = CrazyCrystals.field_B;
        try {
          if (0 <= param4 &&
            param2 < nb.field_b) {
            if (param0 < 0 &&
              param13 < 0 &&
              0 > param6) {
              return;
            }
            if (param0 >= nb.field_d &&
              nb.field_d <= param13 &&
              nb.field_d <= param6) {
              return;
            }
            if (param14 != 2) {
              cd.e((byte) -92);
            }
            var34 = param4 - param2;
            if (param2 == param8) {
              if (param2 == param4) {
                var24 = 0;
                var28 = 0;
                var17_int = param0 << 16;
                var31 = 0;
                var22 = param5;
                var29 = param7;
                var25 = param16;
                var30 = param3;
                var23 = 0;
                var19 = 0;
                var27 = 0;
                var20 = 0;
                var26 = param9;
                var21 = param10;
                var32 = 0;
                var18 = param13 << 16;
              } else {
                var35 = param4 - param8;
                if (param13 > param0) {
                  var29 = param7 << 16;
                  var20 = (param6 - param13 << 16) / var35;
                  var26 = param9 << 16;
                  var23 = (-param10 + param12 << 16) / var34;
                  var31 = (-param7 + param1 << 16) / var34;
                  var21 = param10 << 16;
                  var25 = param16 << 16;
                  var27 = (param11 - param16 << 16) / var34;
                  var22 = param5 << 16;
                  var19 = (-param0 + param6 << 16) / var34;
                  var30 = param3 << 16;
                  var18 = param13 << 16;
                  var17_int = param0 << 16;
                  var32 = (-param3 + param1 << 16) / var35;
                  var24 = (param12 - param5 << 16) / var35;
                  var28 = (param11 - param9 << 16) / var35;
                } else {
                  var24 = (-param10 + param12 << 16) / var34;
                  var29 = param3 << 16;
                  var26 = param16 << 16;
                  var32 = (-param7 + param1 << 16) / var34;
                  var17_int = param13 << 16;
                  var23 = (-param5 + param12 << 16) / var35;
                  var18 = param0 << 16;
                  var21 = param5 << 16;
                  var31 = (-param3 + param1 << 16) / var35;
                  var27 = (-param9 + param11 << 16) / var35;
                  var20 = (param6 - param0 << 16) / var34;
                  var19 = (param6 - param13 << 16) / var35;
                  var30 = param7 << 16;
                  var25 = param9 << 16;
                  var28 = (param11 - param16 << 16) / var34;
                  var22 = param10 << 16;
                }
              }
              if (param2 < 0) {
                param2 = Math.min(-param2, param8 - param2);
                var25 = var25 + var27 * param2;
                var22 = var22 + param2 * var24;
                var18 = var18 + param2 * var20;
                var29 = var29 + param2 * var31;
                var21 = var21 + var23 * param2;
                var30 = var30 + param2 * var32;
                var17_int = var17_int + var19 * param2;
                var26 = var26 + param2 * var28;
                param2 = 0;
              }
              var33 = 0;
            } else {
              var26 = param16 << 16;
              var25 = param16 << 16;
              var18 = param0 << 16;
              var17_int = param0 << 16;
              var30 = param7 << 16;
              var29 = param7 << 16;
              var22 = param10 << 16;
              var21 = param10 << 16;
              var35 = param8 - param2;
              var20 = (param6 - param0 << 16) / var34;
              var19 = (-param0 + param13 << 16) / var35;
              if (var20 <= var19) {
                var33 = 1;
                var32 = (-param7 + param3 << 16) / var35;
                var31 = (-param7 + param1 << 16) / var34;
                var28 = (-param16 + param9 << 16) / var35;
                var23 = (param12 - param10 << 16) / var34;
                var27 = (param11 - param16 << 16) / var34;
                var24 = (-param10 + param5 << 16) / var35;
                var36 = var19;
                var19 = var20;
                var20 = var36;
              } else {
                var33 = 0;
                var27 = (param9 - param16 << 16) / var35;
                var31 = (-param7 + param3 << 16) / var35;
                var32 = (param1 - param7 << 16) / var34;
                var23 = (-param10 + param5 << 16) / var35;
                var24 = (param12 - param10 << 16) / var34;
                var28 = (param11 - param16 << 16) / var34;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param2 < 0) {
                if (param8 < 0) {
                  param2 = param8 - param2;
                  var21 = var21 + var23 * param2;
                  var25 = var25 + param2 * var27;
                  var17_int = var17_int + var19 * param2;
                  var30 = var30 + var32 * param2;
                  var29 = var29 + param2 * var31;
                  var26 = var26 + var28 * param2;
                  var18 = var18 + var20 * param2;
                  var22 = var22 + param2 * var24;
                  param2 = param8;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param2 = -param2;
                  var25 = var25 + param2 * var27;
                  var22 = var22 + param2 * var24;
                  var30 = var30 + var32 * param2;
                  var18 = var18 + param2 * var20;
                  var21 = var21 + var23 * param2;
                  var17_int = var17_int + var19 * param2;
                  var29 = var29 + var31 * param2;
                  var26 = var26 + param2 * var28;
                  param2 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var36Lifetime2 = nb.field_a[param2];
                while (param2 < param8) {
                  var37 = var17_int >> 16;
                  if (var37 < nb.field_d) {
                    var38 = (var18 >> 16) - (var17_int >> 16);
                    if (var38 != 0) {
                      var39 = (var22 - var21) / var38;
                      var40 = (-var25 + var26) / var38;
                      var41 = (-var29 + var30) / var38;
                      if (var37 + var38 >= nb.field_d) {
                        var38 = -1 + nb.field_d - var37;
                      }
                      if (var37 < 0) {
                        w.a(-(var39 * var37) + var21, (byte) -52, param15, var40, -(var37 * var40) + var25, var41, var39, var29 - var41 * var37, var37 + var38, var36Lifetime2);
                      } else {
                        w.a(var21, (byte) -52, param15, var40, var25, var41, var39, var29, var38, var37 + var36Lifetime2);
                      }
                    } else {
                      if (var37 >= 0 &&
                        var37 < nb.field_d) {
                        w.a(var21, (byte) -52, param15, 0, var25, 0, 0, var29, var38, var37 + var36Lifetime2);
                      }
                    }
                  }
                  param2++;
                  if (nb.field_b <= param2) {
                    return;
                  }
                  var30 = var30 + var32;
                  var29 = var29 + var31;
                  var17_int = var17_int + var19;
                  var25 = var25 + var27;
                  var22 = var22 + var24;
                  var18 = var18 + var20;
                  var36Lifetime2 = var36Lifetime2 + kh.field_l;
                  var26 = var26 + var28;
                  var21 = var21 + var23;
                }
              }
              var36Lifetime3 = param4 - param8;
              if (var36Lifetime3 == 0) {
                var28 = 0;
                var20 = 0;
                var31 = 0;
                var19 = 0;
                var24 = 0;
                var32 = 0;
                var27 = 0;
                var23 = 0;
              } else {
                var37Lifetime2 = param6 << 16;
                var38Lifetime2 = param12 << 16;
                var39Lifetime2 = param11 << 16;
                if (var33 == 0) {
                  var29 = param3 << 16;
                  var21 = param5 << 16;
                  var17_int = param13 << 16;
                  var25 = param9 << 16;
                } else {
                  var30 = param3 << 16;
                  var18 = param13 << 16;
                  var26 = param9 << 16;
                  var22 = param5 << 16;
                }
                var40Lifetime2 = param1 << 16;
                var19 = (var37Lifetime2 - var17_int) / var36Lifetime3;
                var24 = (var38Lifetime2 - var22) / var36Lifetime3;
                var28 = (-var26 + var39Lifetime2) / var36Lifetime3;
                var32 = (var40Lifetime2 - var30) / var36Lifetime3;
                var31 = (-var29 + var40Lifetime2) / var36Lifetime3;
                var20 = (var37Lifetime2 - var18) / var36Lifetime3;
                var27 = (-var25 + var39Lifetime2) / var36Lifetime3;
                var23 = (-var21 + var38Lifetime2) / var36Lifetime3;
              }
            }
            if (param2 < 0) {
              param2 = -param2;
              var30 = var30 + var32 * param2;
              var17_int = var17_int + var19 * param2;
              var25 = var25 + var27 * param2;
              var18 = var18 + var20 * param2;
              var29 = var29 + param2 * var31;
              var21 = var21 + var23 * param2;
              var22 = var22 + var24 * param2;
              var26 = var26 + var28 * param2;
              param2 = 0;
            }
            var35Lifetime1 = nb.field_a[param2];
            while (param4 > param2) {
              var36Lifetime1 = var17_int >> 16;
              if (var36Lifetime1 < nb.field_d) {
                var37Lifetime1 = (var18 >> 16) - (var17_int >> 16);
                if (var37Lifetime1 == 0) {
                  if (var36Lifetime1 >= 0 &&
                    var36Lifetime1 < nb.field_d) {
                    w.a(var21, (byte) -52, param15, 0, var25, 0, 0, var29, var37Lifetime1, var35Lifetime1 + var36Lifetime1);
                  }
                } else {
                  var38Lifetime1 = (-var21 + var22) / var37Lifetime1;
                  var39Lifetime1 = (-var25 + var26) / var37Lifetime1;
                  var40Lifetime1 = (var30 - var29) / var37Lifetime1;
                  if (var36Lifetime1 + var37Lifetime1 >= nb.field_d) {
                    var37Lifetime1 = nb.field_d + (-var36Lifetime1 - 1);
                  }
                  if (var36Lifetime1 < 0) {
                    w.a(var21 - var36Lifetime1 * var38Lifetime1, (byte) -52, param15, var39Lifetime1, -(var39Lifetime1 * var36Lifetime1) + var25, var40Lifetime1, var38Lifetime1, -(var36Lifetime1 * var40Lifetime1) + var29, var37Lifetime1 + var36Lifetime1, var35Lifetime1);
                  } else {
                    w.a(var21, (byte) -52, param15, var39Lifetime1, var25, var40Lifetime1, var38Lifetime1, var29, var37Lifetime1, var35Lifetime1 + var36Lifetime1);
                  }
                }
              }
              param2++;
              if (nb.field_b <= param2) {
                return;
              }
              var30 = var30 + var32;
              var29 = var29 + var31;
              var21 = var21 + var23;
              var25 = var25 + var27;
              var35Lifetime1 = var35Lifetime1 + kh.field_l;
              var22 = var22 + var24;
              var26 = var26 + var28;
              var17_int = var17_int + var19;
              var18 = var18 + var20;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_78_0 = var17;
          stackIn_78_1 = new StringBuilder().append("cd.HC(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',');
          if (param15 == null) {
            stackIn_79_2 = "null";
          } else {
            stackIn_79_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_78_0), ((StringBuilder) (Object) stackIn_78_1).append(stackIn_79_2).append(',').append(param16).append(')').toString());
        }
    }

    final void a(int param0, f[][] param1, int param2, int param3) {
        try {
          if (param0 != -35) {
            this.field_w = 37;
          }
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "cd.KC(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static boolean a(CharSequence param0, byte param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -92) {
            var3 = (CharSequence) null;
            cd.a((CharSequence) null, (byte) 47);
          }
          stackIn_3_0 = wi.a(48, 10, param0, true);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("cd.IC(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean g(int param0) {
        if (param0 != 0) {
          CharSequence var3 = (CharSequence) null;
          cd.a((CharSequence) null, (byte) 26);
          return false;
        }
        return false;
    }

    private final void a(double param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var10 = -110 % ((param5 - 47) / 56);
        int var9 = param3 + param6 << 4;
        int var11 = (param4 << 4) + (param1 << 3);
        double var12 = param0 + (double)(this.field_w + this.field_m) * 0.16534698176788384;
        int var14 = (int)(13.856406460551018 * (Math.sin(var12) * (double)param3));
        int var15 = (int)(13.856406460551018 * (Math.cos(var12) * (double)param1));
        int var16 = (this.field_x - this.field_y) * (this.field_C + this.field_t);
        kh.a(var9 - var14 * var16, var11 - var15 + (int)((double)param1 * 4.0) * param2, param3 << 1, 15, f.field_c);
        kh.a(var16 * var14 + var9, (int)(4.0 * (double)param1) * param2 + (var11 + var15), param3 << 1, 15, f.field_c);
    }

    final f a(f[][] param0, int param1, f param2, int param3, int param4) {
        int var7 = 0;
        f stackIn_14_0 = null;
        f stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var8 = 0;
        var8 = CrazyCrystals.field_B;
        try {
          if (ab.field_D == null) {
            gl.field_e = gl.field_e - 1;
            if (param2 != null) {
              var6_int = param2.a(false);
              for (var7 = 0; 3 > var7; var7++) {
                if (0 != (1 << var7 & var6_int)) {
                  q.field_a[var7].a(true, (byte) -125);
                  mb.field_g = mb.field_g + 250;
                  fn.field_j = fn.field_j + 300;
                  fn.field_j = fn.field_j - 50;
                  mb.field_g = mb.field_g - 50;
                  mb.field_g = mb.field_g - ob.field_l;
                  wd.field_j = wd.field_j - 1;
                  b.field_a = b.field_a - 1;
                  je.field_j = je.field_j - 1;
                  we.field_h = we.field_h - 1;
                  fp.field_a = fp.field_a - 2;
                  we.field_h = we.field_h + 40;
                  je.field_j = je.field_j + 20;
                  fp.field_a = fp.field_a + 40;
                  b.field_a = b.field_a + 20;
                  if (gl.field_e == 0) {
                    va.field_d = va.field_d | 1 << var7;
                  }
                }
              }
            }
          }
          if (param3 == 11460) {
            stackIn_16_0 = this.field_l;
            return stackIn_16_0;
          }
          stackIn_14_0 = (f) null;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_19_0 = var6;
          stackIn_19_1 = new StringBuilder().append("cd.VA(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final nj a(int param0, nj param1) {
        RuntimeException var3 = null;
        nj stackIn_2_0 = null;
        nj stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 23525) {
            stackIn_4_0 = ng.a(wd.field_h, param1, new cd(new kp(-1), 0, 0, 0, 0), (byte) -83, wg.field_N);
            return stackIn_4_0;
          }
          stackIn_2_0 = (nj) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("cd.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private final dl i(int param0) {
        if (this.field_x < 0) {
          return vp.field_d;
        }
        if (this.field_x > 0) {
          return na.field_eb;
        }
        if (param0 <= this.field_y) {
          return tl.field_b;
        }
        return mk.field_a;
    }

    final void c(boolean param0, boolean param1) {
        dl discarded$0 = null;
        if (!param0) {
          discarded$0 = this.i(-72);
        }
        if (param1) {
          return;
        }
        gl.field_e = gl.field_e + 1;
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
          this.field_w = (this.field_w + 12) % 38;
          if (param4 != 17512) {
            this.field_B = true;
          }
          stackIn_3_0 = super.a(param0, param1, param2, param3, 17512, param5, param6);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("cd.I(");
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

    cd(f param0, int param1, int param2, int param3, int param4) {
        super(param0);
        try {
          this.field_t = param1;
          this.field_y = param4;
          this.field_x = param3;
          this.field_C = param2;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "cd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void e(byte param0) {
        oi.field_d.field_j = 0;
        oi.field_d.field_p = 0;
        if (param0 > -29) {
          CharSequence var2 = (CharSequence) null;
          cd.a((CharSequence) null, (byte) 43);
        }
    }

    final sl a(f[][] param0, int param1, boolean param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        sl stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          ck.field_db.a(64, param4 * 12, param1 * 12, 60, (byte) -111);
          if (param2) {
            this.e(22, 29, (f[][]) null, 20);
          }
          stackIn_3_0 = super.a(param0, param1, false, param3, param4, param5);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("cd.R(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void f(int param0, int param1, f[][] param2, int param3) {
        int var7 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var8 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var5_intLifetime1;
        int var6Lifetime1;
        var8 = CrazyCrystals.field_B;
        try {
          this.field_B = false;
          var5_int = this.field_x;
          var6 = this.field_y;
          this.field_x = -this.field_t;
          this.field_y = -this.field_C;
          this.field_t = var5_int;
          this.field_C = var6;
          if (param0 != 1) {
            this.field_x = -119;
          }
          for (var7 = 0; 5 > var7; var7++) {
            if (param2[this.field_C + param1][param3 + this.field_t].a(16736352, param2, false, this.field_C, param1, param3, (ea) (this), this.field_t)) {
              this.field_B = true;
              this.a(param2, param1, false, this.field_C, param3, this.field_t);
              return;
            }
            fn.field_j = fn.field_j - ob.field_l;
            wd.field_j = wd.field_j + 1;
            this.a((byte) 104, param2[this.field_C + param1][param3 + this.field_t]);
            var5_intLifetime1 = -this.field_x;
            var6Lifetime1 = -this.field_y;
            this.field_x = this.field_t;
            this.field_y = this.field_C;
            this.field_t = var5_intLifetime1;
            this.field_C = var6Lifetime1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("cd.LA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
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
          var5_int = 117 % ((-43 - param2) / 51);
          if ((this.field_o | this.field_s) != 0) {
            ck.field_db.a(64, 12 * param3 + this.field_m * this.field_o, 12 * param1 + this.field_s * this.field_m, 60, (byte) -111);
          }
          stackIn_4_0 = super.b(param0, param1, (byte) -109, param3);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("cd.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int a(boolean param0, int param1) {
        if (param1 != 0) {
          field_v = (int[]) null;
        }
        return 12;
    }

    static {
        field_A = "Mouse over an icon for details";
    }
}
