/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb {
    h field_n;
    int field_c;
    int field_p;
    static String field_l;
    static int[] field_m;
    wb[] field_i;
    int field_o;
    wd field_b;
    int field_j;
    int field_e;
    int field_k;
    int field_g;
    int field_d;
    int field_f;
    static String field_h;
    static bb field_a;

    public static void a(byte param0) {
        field_a = null;
        if (param0 != 3) {
          hb.a((byte) 75);
        }
        field_h = null;
        field_l = null;
        field_m = null;
    }

    final static int[] a(byte param0, int param1) {
        int dupTemp$0 = 0;
        int var5 = DungeonAssault.field_K;
        if (param0 != -111) {
          return (int[]) null;
        }
        int var2 = param1;
        int var3 = 0;
        while (true) {
          dupTemp$0 = jb.field_Sb[var2];
          var2 = dupTemp$0;
          if (-1 == dupTemp$0) {
            break;
          }
          var3++;
        }
        int[] var4 = new int[var3];
        var2 = param1;
        while (-1 != jb.field_Sb[var2]) {
          var3--;
          var4[var3] = var2;
          var2 = jb.field_Sb[var2];
        }
        return var4;
    }

    final void a(boolean param0) {
        this.field_o = this.field_o & -3;
        this.field_p = 255;
        this.field_o = this.field_o | 4;
        if (param0) {
          hb.a((byte) 103);
        }
    }

    final static void a(int param0, ec param1, qg param2, int param3) {
        try {
          int var5 = 0;
          int var11_int = 0;
          int var12_int = 0;
          byte[] array$0 = null;
          RuntimeException stackIn_37_0 = null;
          StringBuilder stackIn_37_1 = null;
          String stackIn_38_2 = null;
          StringBuilder stackIn_40_1 = null;
          String stackIn_41_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var4 = null;
          int var6_int = 0;
          ClassNotFoundException var6 = null;
          SecurityException var6_ref = null;
          NullPointerException var6_ref2 = null;
          Exception var6_ref3 = null;
          Throwable var6_ref4 = null;
          int var9 = 0;
          String[] var10 = null;
          byte[][] var11 = null;
          Class[] var12 = null;
          int var13 = 0;
          int var14 = 0;
          String var15 = null;
          String var16 = null;
          int var17 = 0;
          oe var18 = null;
          byte[][] var19 = null;
          String var20 = null;
          String var21 = null;
          byte[][] var22 = null;
          int var13Lifetime1;
          var14 = DungeonAssault.field_K;
          try {
            var18 = new oe();
            var18.field_q = param1.c(true);
            var18.field_j = param1.h(-43);
            var18.field_o = new pn[var18.field_q];
            var18.field_l = new int[var18.field_q];
            var18.field_k = new byte[var18.field_q][][];
            var18.field_s = new pn[var18.field_q];
            if (param0 != -5) {
              hb.a((byte) -84, 16);
            }
            var18.field_r = new int[var18.field_q];
            var18.field_n = new int[var18.field_q];
            for (var5 = 0; var5 < var18.field_q; var5++) {
              try {
                var6_int = param1.c(true);
                if (var6_int != 0 &&
                  var6_int != 1 &&
                  2 != var6_int) {
                  if (var6_int == 3 ||
                    4 == var6_int) {
                    var20 = param1.d(-111);
                    var21 = param1.d(-127);
                    var9 = param1.c(true);
                    var10 = new String[var9];
                    for (var11_int = 0; var11_int < var9; var11_int++) {
                      var10[var11_int] = param1.d(-116);
                    }
                    var22 = new byte[var9][];
                    var19 = var22;
                    var11 = var19;
                    if (3 == var6_int) {
                      for (var12_int = 0; var9 > var12_int; var12_int++) {
                        var13 = param1.h(-58);
                        array$0 = new byte[var13];
                        var11[var12_int] = array$0;
                        param1.a((byte) -98, 0, var13, var22[var12_int]);
                      }
                    }
                    var18.field_n[var5] = var6_int;
                    var12 = new Class[var9];
                    var17 = 0;
                    var13Lifetime1 = var17;
                    while (var9 > var17) {
                      var12[var17] = al.a(var10[var17], (byte) -121);
                      var17++;
                    }
                    var18.field_o[var5] = param2.a(var12, al.a(var20, (byte) -121), -1, var21);
                    var18.field_k[var5] = var22;
                  }
                } else {
                  var15 = param1.d(-119);
                  var16 = param1.d(-114);
                  var9 = 0;
                  if (var6_int == 1) {
                    var9 = param1.h(-46);
                  }
                  var18.field_n[var5] = var6_int;
                  var18.field_l[var5] = var9;
                  var18.field_s[var5] = param2.a(65535, al.a(var15, (byte) -125), var16);
                }
              } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                var18.field_r[var5] = -1;
              } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var6_ref = (SecurityException) (Object) decompiledCaughtException;
                var18.field_r[var5] = -2;
              } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                var18.field_r[var5] = -3;
              } catch (java.lang.Exception decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var6_ref3 = (Exception) (Object) decompiledCaughtException;
                var18.field_r[var5] = -4;
              } catch (java.lang.Throwable decompiledCaughtParameter4) {
                decompiledCaughtException = decompiledCaughtParameter4;
                var6_ref4 = decompiledCaughtException;
                var18.field_r[var5] = -5;
              }
            }
            fe.field_k.a(var18, false);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
            decompiledCaughtException = decompiledCaughtParameter5;
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_37_0 = var4;
            stackIn_37_1 = new StringBuilder().append("hb.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_38_2 = "null";
            } else {
              stackIn_38_2 = "{...}";
            }
            stackIn_40_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',');
            if (param2 == null) {
              stackIn_41_2 = "null";
            } else {
              stackIn_41_2 = "{...}";
            }
            throw vk.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static byte a(byte param0, char param1) {
        int var2;
        int var3;
        var3 = DungeonAssault.field_K;
        if (param0 != -38) {
          return (byte) 27;
        }
        {
          if ((0 >= param1 ||
            param1 >= 128) &&
            (param1 < 160 ||
            param1 > 255)) {
            if (param1 == 8364) {
              var2 = -128;
            } else if (param1 == 8218) {
              var2 = -126;
            } else if (param1 == 402) {
              var2 = -125;
            } else if (param1 == 8222) {
              var2 = -124;
            } else if (param1 == 8230) {
              var2 = -123;
            } else if (param1 == 8224) {
              var2 = -122;
            } else if (8225 == param1) {
              var2 = -121;
            } else if (param1 == 710) {
              var2 = -120;
            } else if (param1 == 8240) {
              var2 = -119;
            } else if (param1 == 352) {
              var2 = -118;
            } else if (param1 == 8249) {
              var2 = -117;
            } else if (param1 == 338) {
              var2 = -116;
            } else if (381 == param1) {
              var2 = -114;
            } else if (param1 == 8216) {
              var2 = -111;
            } else if (8217 == param1) {
              var2 = -110;
            } else if (param1 == 8220) {
              var2 = -109;
            } else if (param1 == 8221) {
              var2 = -108;
            } else if (param1 == 8226) {
              var2 = -107;
            } else if (param1 == 8211) {
              var2 = -106;
            } else if (8212 == param1) {
              var2 = -105;
            } else if (param1 == 732) {
              var2 = -104;
            } else if (8482 == param1) {
              var2 = -103;
            } else if (param1 == 353) {
              var2 = -102;
            } else if (param1 == 8250) {
              var2 = -101;
            } else if (param1 == 339) {
              var2 = -100;
            } else if (param1 == 382) {
              var2 = -98;
            } else if (param1 != 376) {
              var2 = 63;
            } else {
              var2 = -97;
            }
          } else {
            var2 = (byte)param1;
          }
        }
        return (byte) var2;
    }

    final void a(int param0) {
        this.field_o = this.field_o | 2;
        this.field_p = param0;
    }

    hb(int param0, int param1) {
        this.field_j = param0;
        this.field_c = param1;
        this.field_n = hp.field_b[this.field_c];
        this.field_p = 0;
        this.field_o = 0;
        if (this.field_n != null) {
          this.field_k = this.field_n.field_o;
          this.field_g = this.field_n.field_r;
          this.field_e = this.field_n.field_m;
          this.field_f = this.field_n.field_b;
        }
    }

    static {
        field_l = "Search";
        field_h = "Raging Beast";
        field_m = new int[]{1, 2, 3, 5, 10, 15, 25, 50};
    }
}
