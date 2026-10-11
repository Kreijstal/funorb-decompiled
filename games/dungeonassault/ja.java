/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja {
    static String[] field_d;
    private int[] field_e;
    private int[] field_c;
    static cn[] field_b;
    static String field_a;

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
          field_b = (cn[]) null;
        }
        field_d = null;
        field_b = null;
    }

    final int a(byte[] param0, byte[] param1, byte param2, int param3, int param4, int param5) {
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
        int stackIn_6_0 = 0;
        int stackIn_68_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        byte[] var12 = null;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var10Lifetime5;
        int var10Lifetime6;
        int var10Lifetime7;
        var11 = DungeonAssault.field_K;
        try {
          if (param2 != -88) {
            var12 = (byte[]) null;
            this.a((byte[]) null, (byte[]) null, (byte) 93, -112, -52, -44);
          }
          if (param5 == 0) {
            stackIn_6_0 = 0;
            return stackIn_6_0;
          }
          param5 = param5 + param4;
          var7_int = 0;
          var8 = param3;
          L3: while (true) {
            var9 = param0[var8];
            if (var9 < 0) {
              var7_int = this.field_e[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$0 = this.field_e[var7_int];
            var10 = dupTemp$0;
            if (dupTemp$0 < 0) {
              incrementValue$1 = param4;
              param4++;
              param1[incrementValue$1] = (byte)(~var10);
              if (param4 >= param5) {
                break L3;
              }
              var7_int = 0;
            }
            if ((var9 & 64) != 0) {
              var7_int = this.field_e[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$2 = this.field_e[var7_int];
            var10Lifetime1 = dupTemp$2;
            if (dupTemp$2 < 0) {
              incrementValue$3 = param4;
              param4++;
              param1[incrementValue$3] = (byte)(~var10Lifetime1);
              if (param4 >= param5) {
                break L3;
              }
              var7_int = 0;
            }
            if ((var9 & 32) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_e[var7_int];
            }
            dupTemp$4 = this.field_e[var7_int];
            var10Lifetime2 = dupTemp$4;
            if (dupTemp$4 < 0) {
              incrementValue$5 = param4;
              param4++;
              param1[incrementValue$5] = (byte)(~var10Lifetime2);
              if (param5 <= param4) {
                break L3;
              }
              var7_int = 0;
            }
            if (0 != (16 & var9)) {
              var7_int = this.field_e[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$6 = this.field_e[var7_int];
            var10Lifetime3 = dupTemp$6;
            if (dupTemp$6 < 0) {
              incrementValue$7 = param4;
              param4++;
              param1[incrementValue$7] = (byte)(~var10Lifetime3);
              if (param5 <= param4) {
                break L3;
              }
              var7_int = 0;
            }
            if (0 != (var9 & 8)) {
              var7_int = this.field_e[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$8 = this.field_e[var7_int];
            var10Lifetime4 = dupTemp$8;
            if (dupTemp$8 < 0) {
              incrementValue$9 = param4;
              param4++;
              param1[incrementValue$9] = (byte)(~var10Lifetime4);
              if (param4 >= param5) {
                break L3;
              }
              var7_int = 0;
            }
            if ((var9 & 4) != 0) {
              var7_int = this.field_e[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$10 = this.field_e[var7_int];
            var10Lifetime5 = dupTemp$10;
            if (dupTemp$10 < 0) {
              incrementValue$11 = param4;
              param4++;
              param1[incrementValue$11] = (byte)(~var10Lifetime5);
              if (param4 >= param5) {
                return -param3 + (1 + var8);
              }
              var7_int = 0;
            }
            if (0 == (var9 & 2)) {
              var7_int++;
            } else {
              var7_int = this.field_e[var7_int];
            }
            dupTemp$12 = this.field_e[var7_int];
            var10Lifetime6 = dupTemp$12;
            if (dupTemp$12 < 0) {
              incrementValue$13 = param4;
              param4++;
              param1[incrementValue$13] = (byte)(~var10Lifetime6);
              if (param4 >= param5) {
                break L3;
              }
              var7_int = 0;
            }
            if ((var9 & 1) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_e[var7_int];
            }
            dupTemp$14 = this.field_e[var7_int];
            var10Lifetime7 = dupTemp$14;
            if (0 > dupTemp$14) {
              incrementValue$15 = param4;
              param4++;
              param1[incrementValue$15] = (byte)(~var10Lifetime7);
              if (param4 >= param5) {
                break L3;
              }
              var7_int = 0;
            }
            var8++;
            continue;

          }
          stackIn_68_0 = -param3 + (1 + var8);
          return stackIn_68_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_71_0 = var7;
          stackIn_71_1 = new StringBuilder().append("ja.C(");
          if (param0 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',');
          if (param1 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    ja(byte[] param0) {
        int var5 = 0;
        int var14 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
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
          this.field_c = new int[var2_int];
          this.field_e = new int[8];
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
              var7 = 1 << 32 - var6;
              var8 = var17[var6];
              this.field_c[var5] = var8;
              if ((var7 & var8) == 0) {
                var9 = var8 | var7;
                var10 = var6 - 1;
                while (var10 >= 1) {
                  var11 = var17[var10];
                  if (var11 != var8) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                  var12 = 1 << -var10 + 32;
                  if (0 != (var12 & var11)) {
                    var3[var10] = var3[-1 + var10];
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  var3[var10] = mp.a(var11, var12);
                  var10--;
                }
                if (decompiledFrameCompleted1) {
                  decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                }
              }
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameCompleted1) &&
                (decompiledFrameCompleted0)) {
                var9 = var3[-1 + var6];
              }
              var17[var6] = var9;
              for (var10Lifetime1 = var6 + 1; var10Lifetime1 <= 32; var10Lifetime1++) {
                if (var17[var10Lifetime1] == var8) {
                  var17[var10Lifetime1] = var9;
                }
              }
              var10Lifetime2 = 0;
              for (var11Lifetime1 = 0; var11Lifetime1 < var6; var11Lifetime1++) {
                var12Lifetime1 = -2147483648 >>> var11Lifetime1;
                if ((var12Lifetime1 & var8) != 0) {
                  if (this.field_e[var10Lifetime2] == 0) {
                    this.field_e[var10Lifetime2] = var4;
                  }
                  var10Lifetime2 = this.field_e[var10Lifetime2];
                } else {
                  var10Lifetime2++;
                }
                var12Lifetime1 = var12Lifetime1 >>> 1;
                if (this.field_e.length <= var10Lifetime2) {
                  var13 = new int[2 * this.field_e.length];
                  for (var14 = 0; var14 < this.field_e.length; var14++) {
                    var13[var14] = this.field_e[var14];
                  }
                  this.field_e = var13;
                }
              }
              if (var4 <= var10Lifetime2) {
                var4 = 1 + var10Lifetime2;
              }
              this.field_e[var10Lifetime2] = ~var5;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_38_0 = var2;
          stackIn_38_1 = new StringBuilder().append("ja.<init>(");
          if (param0 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, byte param2, boolean param3, di[] param4) {
        int var7 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var5_intLifetime1;
        int var6Lifetime1;
        var8 = DungeonAssault.field_K;
        try {
          bj.field_G = false;
          ao.field_o = param0;
          hi.field_c.b(4973, -10 + ao.field_o);
          if (9 < hi.field_c.field_H) {
            hi.field_c.field_H = 9;
          }
          if (fb.field_d == null) {
            fb.field_d = new di[10];
          }
          if (param2 != 22) {
            return;
          }
          if (hi.field_c.field_D > 9) {
            hi.field_c.field_D = 9;
          }
          if (!param3) {
            var5_int = 0;
            if (og.field_f > param1) {
              var5_int = -param1 + og.field_f;
            }
            var6 = param4.length;
            if (param4.length + param1 > fb.field_d.length + og.field_f) {
              var6 = fb.field_d.length + (og.field_f - param1);
            }
            for (var7 = var5_int; var7 < var6; var7++) {
              param4[var7].field_b = var7 + param1;
              fb.field_d[var7 + param1 - og.field_f] = param4[var7];
            }
            return;
          }
          var5_intLifetime1 = 0;
          if (null == ip.field_j) {
            return;
          }
          og.field_f = param1;
          vd.field_a = param1;
          hi.field_c.field_z = param1;
          for (var6Lifetime1 = 0; param4.length > var6Lifetime1; var6Lifetime1++) {
            param4[var6Lifetime1].field_b = param1 + var6Lifetime1;
            fb.field_d[var6Lifetime1] = param4[var6Lifetime1];
            if (le.a(ip.field_j, fb.field_d[var6Lifetime1].field_i, param2 ^ -127)) {
              qc.field_y = var6Lifetime1 + vd.field_a;
              var5_intLifetime1 = 1;
            }
          }
          if (var5_intLifetime1 == 0) {
            qc.field_y = -1;
          }
          gg.a((byte) -84);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_35_0 = var5;
          stackIn_35_1 = new StringBuilder().append("ja.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    static {
        field_d = new String[]{"Circumvent", "Equally adept with the arts of mechanics and deception, the trusty toolkit of the <%0> is enough to disable any obstacle. (Single use)"};
        field_a = "Music: ";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$ed16b0445cf3(int param0, int param1, int param2, boolean param3, di[] param4) {
        int var7 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var5_intLifetime1;
        int var6Lifetime1;
        var8 = DungeonAssault.field_K;
        try {
          bj.field_G = false;
          ao.field_o = param0;
          hi.field_c.b(4973, -10 + ao.field_o);
          if (9 < hi.field_c.field_H) {
            hi.field_c.field_H = 9;
          }
          if (fb.field_d == null) {
            fb.field_d = new di[10];
          }
          if (param2 != 22) {
            return;
          }
          if (hi.field_c.field_D > 9) {
            hi.field_c.field_D = 9;
          }
          if (!param3) {
            var5_int = 0;
            if (og.field_f > param1) {
              var5_int = -param1 + og.field_f;
            }
            var6 = param4.length;
            if (param4.length + param1 > fb.field_d.length + og.field_f) {
              var6 = fb.field_d.length + (og.field_f - param1);
            }
            for (var7 = var5_int; var7 < var6; var7++) {
              param4[var7].field_b = var7 + param1;
              fb.field_d[var7 + param1 - og.field_f] = param4[var7];
            }
            return;
          }
          var5_intLifetime1 = 0;
          if (null == ip.field_j) {
            return;
          }
          og.field_f = param1;
          vd.field_a = param1;
          hi.field_c.field_z = param1;
          for (var6Lifetime1 = 0; param4.length > var6Lifetime1; var6Lifetime1++) {
            param4[var6Lifetime1].field_b = param1 + var6Lifetime1;
            fb.field_d[var6Lifetime1] = param4[var6Lifetime1];
            if (le.a(ip.field_j, fb.field_d[var6Lifetime1].field_i, param2 ^ -127)) {
              qc.field_y = var6Lifetime1 + vd.field_a;
              var5_intLifetime1 = 1;
            }
          }
          if (var5_intLifetime1 == 0) {
            qc.field_y = -1;
          }
          gg.a((byte) -84);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_35_0 = var5;
          stackIn_35_1 = new StringBuilder().append("ja.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }
}
