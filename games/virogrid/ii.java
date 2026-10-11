/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii {
    private byte[] field_c;
    private int[] field_f;
    static pd field_a;
    private int[] field_e;
    static int field_b;
    static km field_d;

    final static void b(byte param0) {
        vi.b((byte) -123);
        co.field_d = true;
        kb.field_c = true;
        if (param0 >= -94) {
          ii.a((byte) 80);
        }
        tm.field_l.a((byte) 76);
        gk.a(false, jm.field_a, false);
    }

    final int a(int param0, int param1, int param2, int param3, byte[] param4, byte[] param5) {
        int dupTemp$0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = Virogrid.field_F ? 1 : 0;
        try {
          var7_int = 0;
          if (param2 != -7089) {
            field_d = (km) null;
          }
          param0 = param0 + param3;
          var8 = param1 << 3;
          while (true) {
            if (param0 <= param3) {
              stackIn_16_0 = -param1 + (7 + var8 >> 3);
              return stackIn_16_0;
            }
            var9 = 255 & param4[param3];
            var10 = this.field_e[var9];
            var11 = this.field_c[var9];
            if (var11 == 0) {
              throw new RuntimeException("" + var9);
            }
            var12 = var8 >> 3;
            var13 = var8 & 7;
            var7_int = var7_int & -var13 >> 31;
            var14 = var12 + (-1 + (var13 + var11) >> 3);
            var13 += 24;
            dupTemp$0 = oh.a(var7_int, var10 >>> var13);
            var7_int = dupTemp$0;
            param5[var12] = (byte)dupTemp$0;
            if (var12 < var14) {
              var13 -= 8;
              var12++;
              var7_int = var10 >>> var13;
              param5[var12] = (byte)(var10 >>> var13);
              if (var14 > var12) {
                var12++;
                var13 -= 8;
                var7_int = var10 >>> var13;
                param5[var12] = (byte)(var10 >>> var13);
                if (var12 < var14) {
                  var12++;
                  var13 -= 8;
                  var7_int = var10 >>> var13;
                  param5[var12] = (byte)(var10 >>> var13);
                  if (var12 < var14) {
                    var12++;
                    var13 -= 8;
                    var7_int = var10 << -var13;
                    param5[var12] = (byte)(var10 << -var13);
                  }
                }
              }
            }
            var8 = var8 + var11;
            param3++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_19_0 = var7;
          stackIn_19_1 = new StringBuilder().append("ii.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param5 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final int a(byte[] param0, int param1, int param2, int param3, byte[] param4, boolean param5) {
        int dupTemp$0 = 0;
        int incrementValue$1 = 0;
        int dupTemp$2 = 0;
        int incrementValue$3 = 0;
        int dupTemp$4 = 0;
        int incrementValue$5 = 0;
        int dupTemp$6 = 0;
        int incrementValue$7 = 0;
        int dupTemp$8 = 0;
        int incrementValue$9 = 0;
        int dupTemp$10 = 0;
        int incrementValue$11 = 0;
        int dupTemp$12 = 0;
        int incrementValue$13 = 0;
        int dupTemp$14 = 0;
        int incrementValue$15 = 0;
        int stackIn_3_0 = 0;
        int stackIn_67_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var10Lifetime5;
        int var10Lifetime6;
        int var10Lifetime7;
        var11 = Virogrid.field_F ? 1 : 0;
        try {
          if (param3 == 0) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          param3 = param3 + param2;
          var7_int = 0;
          if (!param5) {
            this.field_c = (byte[]) null;
          }
          var8 = param1;
          L3: while (true) {
            var9 = param4[var8];
            if (var9 >= 0) {
              var7_int++;
            } else {
              var7_int = this.field_f[var7_int];
            }
            dupTemp$0 = this.field_f[var7_int];
            var10 = dupTemp$0;
            if (0 > dupTemp$0) {
              incrementValue$1 = param2;
              param2++;
              param0[incrementValue$1] = (byte)(~var10);
              if (param2 >= param3) {
                break L3;
              }
              var7_int = 0;
            }
            if (0 != (64 & var9)) {
              var7_int = this.field_f[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$2 = this.field_f[var7_int];
            var10Lifetime1 = dupTemp$2;
            if (dupTemp$2 < 0) {
              incrementValue$3 = param2;
              param2++;
              param0[incrementValue$3] = (byte)(~var10Lifetime1);
              if (param3 <= param2) {
                break L3;
              }
              var7_int = 0;
            }
            if ((32 & var9) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_f[var7_int];
            }
            dupTemp$4 = this.field_f[var7_int];
            var10Lifetime2 = dupTemp$4;
            if (0 > dupTemp$4) {
              incrementValue$5 = param2;
              param2++;
              param0[incrementValue$5] = (byte)(~var10Lifetime2);
              if (param2 >= param3) {
                break L3;
              }
              var7_int = 0;
            }
            if ((16 & var9) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_f[var7_int];
            }
            dupTemp$6 = this.field_f[var7_int];
            var10Lifetime3 = dupTemp$6;
            if (dupTemp$6 < 0) {
              incrementValue$7 = param2;
              param2++;
              param0[incrementValue$7] = (byte)(~var10Lifetime3);
              if (param2 >= param3) {
                break L3;
              }
              var7_int = 0;
            }
            if (0 == (var9 & 8)) {
              var7_int++;
            } else {
              var7_int = this.field_f[var7_int];
            }
            dupTemp$8 = this.field_f[var7_int];
            var10Lifetime4 = dupTemp$8;
            if (dupTemp$8 < 0) {
              incrementValue$9 = param2;
              param2++;
              param0[incrementValue$9] = (byte)(~var10Lifetime4);
              if (param2 >= param3) {
                break L3;
              }
              var7_int = 0;
            }
            if ((var9 & 4) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_f[var7_int];
            }
            dupTemp$10 = this.field_f[var7_int];
            var10Lifetime5 = dupTemp$10;
            if (dupTemp$10 < 0) {
              incrementValue$11 = param2;
              param2++;
              param0[incrementValue$11] = (byte)(~var10Lifetime5);
              if (param2 >= param3) {
                return -param1 + (var8 + 1);
              }
              var7_int = 0;
            }
            if ((2 & var9) != 0) {
              var7_int = this.field_f[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$12 = this.field_f[var7_int];
            var10Lifetime6 = dupTemp$12;
            if (dupTemp$12 < 0) {
              incrementValue$13 = param2;
              param2++;
              param0[incrementValue$13] = (byte)(~var10Lifetime6);
              if (param2 >= param3) {
                break L3;
              }
              var7_int = 0;
            }
            if ((1 & var9) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_f[var7_int];
            }
            dupTemp$14 = this.field_f[var7_int];
            var10Lifetime7 = dupTemp$14;
            if (dupTemp$14 < 0) {
              incrementValue$15 = param2;
              param2++;
              param0[incrementValue$15] = (byte)(~var10Lifetime7);
              if (param2 >= param3) {
                break L3;
              }
              var7_int = 0;
            }
            var8++;
            continue;

          }
          stackIn_67_0 = -param1 + (var8 + 1);
          return stackIn_67_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_70_0 = var7;
          stackIn_70_1 = new StringBuilder().append("ii.D(");
          if (param0 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param5).append(')').toString());
        }
    }

    final static String a(byte param0, boolean param1, CharSequence param2) {
        int var6 = 0;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        String stackIn_16_0 = null;
        String stackIn_21_0 = null;
        String stackIn_30_0 = null;
        String stackIn_35_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          if (param2 == null) {
            stackIn_3_0 = ti.field_a;
            return stackIn_3_0;
          }
          var3_int = param2.length();
          if (var3_int >= 1 &&
            var3_int <= 12) {
            var4 = c.a(param2, true);
            if (param0 != 105) {
              stackIn_11_0 = (String) null;
              return stackIn_11_0;
            }
            if (var4 != null &&
              1 <= var4.length()) {
              if (!ck.a(var4.charAt(0), -46) &&
                !ck.a(var4.charAt(-1 + var4.length()), param0 - 151)) {
                var5 = 0;
                for (var6 = 0; var6 < param2.length(); var6++) {
                  var7 = param2.charAt(var6);
                  if (!ck.a((char) var7, -46)) {
                    var5 = 0;
                  } else {
                    var5++;
                  }
                  if (var5 >= 2 &&
                    !param1) {
                    stackIn_30_0 = km.field_P;
                    return stackIn_30_0;
                  }
                }
                if (var5 <= 0) {
                  return null;
                }
                stackIn_35_0 = wa.field_H;
                return stackIn_35_0;
              }
              stackIn_21_0 = wa.field_H;
              return stackIn_21_0;
            }
            stackIn_16_0 = ti.field_a;
            return stackIn_16_0;
          }
          stackIn_8_0 = ti.field_a;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_38_0 = var3;
          stackIn_38_1 = new StringBuilder().append("ii.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != 6) {
          CharSequence var2 = (CharSequence) null;
          ii.a((byte) -116, false, (CharSequence) null);
        }
        field_d = null;
    }

    ii(byte[] param0) {
        int var5 = 0;
        int var14 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] var3 = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[] var16 = null;
        int[] var17 = null;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var12Lifetime1;
        try {
          var2_int = param0.length;
          this.field_c = param0;
          this.field_e = new int[var2_int];
          this.field_f = new int[8];
          var17 = new int[33];
          var16 = var17;
          var3 = var16;
          var4 = 0;
          for (var5 = 0; var2_int > var5; var5++) {
            var6 = param0[var5];
            if (var6 != 0) {
              boolean decompiledFrameRemainder0 = true;
              boolean decompiledFrameCompleted1 = true;
              boolean decompiledFrameCompleted0 = true;
              var7 = 1 << -var6 + 32;
              var8 = var17[var6];
              this.field_e[var5] = var8;
              if ((var7 & var8) == 0) {
                var9 = var8 | var7;
                var10 = var6 - 1;
                while (var10 >= 1) {
                  var11 = var17[var10];
                  if (var8 != var11) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                  var12 = 1 << 32 - var10;
                  if ((var11 & var12) != 0) {
                    var3[var10] = var3[-1 + var10];
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  var3[var10] = oh.a(var12, var11);
                  var10--;
                }
                if (decompiledFrameCompleted1) {
                  decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                }
              }
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameCompleted1) &&
                (decompiledFrameCompleted0)) {
                var9 = var3[var6 - 1];
              }
              var17[var6] = var9;
              for (var10Lifetime1 = 1 + var6; 32 >= var10Lifetime1; var10Lifetime1++) {
                if (var8 == var17[var10Lifetime1]) {
                  var17[var10Lifetime1] = var9;
                }
              }
              var10Lifetime2 = 0;
              for (var11Lifetime1 = 0; var6 > var11Lifetime1; var11Lifetime1++) {
                var12Lifetime1 = -2147483648 >>> var11Lifetime1;
                if (0 != (var8 & var12Lifetime1)) {
                  if (0 == this.field_f[var10Lifetime2]) {
                    this.field_f[var10Lifetime2] = var4;
                  }
                  var10Lifetime2 = this.field_f[var10Lifetime2];
                } else {
                  var10Lifetime2++;
                }
                var12Lifetime1 = var12Lifetime1 >>> 1;
                if (var10Lifetime2 >= this.field_f.length) {
                  var13 = new int[2 * this.field_f.length];
                  for (var14 = 0; var14 < this.field_f.length; var14++) {
                    var13[var14] = this.field_f[var14];
                  }
                  this.field_f = var13;
                }
              }
              if (var10Lifetime2 >= var4) {
                var4 = var10Lifetime2 + 1;
              }
              this.field_f[var10Lifetime2] = ~var5;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_39_0 = var2;
          stackIn_39_1 = new StringBuilder().append("ii.<init>(");
          if (param0 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(')').toString());
        }
    }

    final static int a(uh param0, uh param1, int param2) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 27984) {
            field_a = (pd) null;
          }
          var4 = (String) null;
          stackIn_3_0 = wh.a(0, false, 0, true, (String) null, param1, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ii.C(");
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
          throw kg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_b = 0;
    }
}
