/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aq {
    static String field_h;
    private int[] field_a;
    private int field_d;
    private int[] field_i;
    private int field_e;
    private int field_g;
    static int[] field_f;
    static int field_c;
    private int field_b;

    final int b(byte param0) {
        int var2 = 102 / ((2 - param0) / 62);
        if (this.field_e == 0) {
            this.a(256);
            this.field_e = 256;
        }
        int fieldTemp$0 = this.field_e - 1;
        this.field_e = this.field_e - 1;
        return this.field_a[fieldTemp$0];
    }

    final static int a(int param0, int param1, ml param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -30273) {
                break L1;
              } else {
                field_f = (int[]) null;
                break L1;
              }
            }
            stackOut_2_0 = (param2.l(param0, 59) ^ 1 << param0 - 1) + -(1 << param0 - 1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("aq.D(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static String c(int param0) {
        int var1 = 55 / ((3 - param0) / 40);
        return ek.field_M;
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = Kickabout.field_G;
          var6 = -1640531527;
          var8 = -1640531527;
          var10 = -1640531527;
          var9 = -1640531527;
          var5 = -1640531527;
          var3 = -1640531527;
          var7 = -1640531527;
          var4 = -1640531527;
          var2 = 0;
          if (param0 <= -65) {
            break L0;
          } else {
            field_f = (int[]) null;
            break L0;
          }
        }
        L1: while (true) {
          if (var2 >= 4) {
            var2 = 0;
            L2: while (true) {
              if ((var2 ^ -1) <= -257) {
                var2 = 0;
                L3: while (true) {
                  if (-257 >= (var2 ^ -1)) {
                    this.a(256);
                    this.field_e = 256;
                    return;
                  } else {
                    var4 = var4 + this.field_i[1 + var2];
                    var3 = var3 + this.field_i[var2];
                    var8 = var8 + this.field_i[5 + var2];
                    var10 = var10 + this.field_i[var2 - -7];
                    var7 = var7 + this.field_i[var2 + 4];
                    var9 = var9 + this.field_i[var2 + 6];
                    var5 = var5 + this.field_i[var2 - -2];
                    var6 = var6 + this.field_i[3 + var2];
                    var3 = var3 ^ var4 << -1403831061;
                    var6 = var6 + var3;
                    var4 = var4 + var5;
                    var4 = var4 ^ var5 >>> 529663522;
                    var5 = var5 + var6;
                    var7 = var7 + var4;
                    var5 = var5 ^ var6 << 1799635560;
                    var8 = var8 + var5;
                    var6 = var6 + var7;
                    var6 = var6 ^ var7 >>> 1697998672;
                    var9 = var9 + var6;
                    var7 = var7 + var8;
                    var7 = var7 ^ var8 << -681784790;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> 1284270884;
                    var3 = var3 + var8;
                    var9 = var9 + var10;
                    var9 = var9 ^ var10 << 1693471848;
                    var4 = var4 + var9;
                    var10 = var10 + var3;
                    var10 = var10 ^ var3 >>> -265197015;
                    var3 = var3 + var4;
                    var5 = var5 + var10;
                    this.field_i[var2] = var3;
                    this.field_i[var2 - -1] = var4;
                    this.field_i[var2 + 2] = var5;
                    this.field_i[3 + var2] = var6;
                    this.field_i[var2 + 4] = var7;
                    this.field_i[var2 + 5] = var8;
                    this.field_i[6 + var2] = var9;
                    this.field_i[7 + var2] = var10;
                    var2 += 8;
                    continue L3;
                  }
                }
              } else {
                var3 = var3 + this.field_a[var2];
                var4 = var4 + this.field_a[1 + var2];
                var10 = var10 + this.field_a[var2 - -7];
                var6 = var6 + this.field_a[var2 + 3];
                var8 = var8 + this.field_a[5 + var2];
                var9 = var9 + this.field_a[var2 + 6];
                var5 = var5 + this.field_a[var2 + 2];
                var7 = var7 + this.field_a[var2 - -4];
                var3 = var3 ^ var4 << 1704044971;
                var6 = var6 + var3;
                var4 = var4 + var5;
                var4 = var4 ^ var5 >>> -1348370238;
                var5 = var5 + var6;
                var7 = var7 + var4;
                var5 = var5 ^ var6 << 321296680;
                var6 = var6 + var7;
                var8 = var8 + var5;
                var6 = var6 ^ var7 >>> -1617496496;
                var9 = var9 + var6;
                var7 = var7 + var8;
                var7 = var7 ^ var8 << 2029246954;
                var10 = var10 + var7;
                var8 = var8 + var9;
                var8 = var8 ^ var9 >>> 1689678084;
                var3 = var3 + var8;
                var9 = var9 + var10;
                var9 = var9 ^ var10 << 2041557864;
                var10 = var10 + var3;
                var4 = var4 + var9;
                var10 = var10 ^ var3 >>> -1711043511;
                var3 = var3 + var4;
                var5 = var5 + var10;
                this.field_i[var2] = var3;
                this.field_i[var2 - -1] = var4;
                this.field_i[2 + var2] = var5;
                this.field_i[3 + var2] = var6;
                this.field_i[var2 - -4] = var7;
                this.field_i[var2 - -5] = var8;
                this.field_i[6 + var2] = var9;
                this.field_i[var2 - -7] = var10;
                var2 += 8;
                continue L2;
              }
            }
          } else {
            var3 = var3 ^ var4 << -196009589;
            var6 = var6 + var3;
            var4 = var4 + var5;
            var4 = var4 ^ var5 >>> 1865293090;
            var5 = var5 + var6;
            var7 = var7 + var4;
            var5 = var5 ^ var6 << -1196998552;
            var6 = var6 + var7;
            var8 = var8 + var5;
            var6 = var6 ^ var7 >>> -1260775024;
            var7 = var7 + var8;
            var9 = var9 + var6;
            var7 = var7 ^ var8 << -425638646;
            var8 = var8 + var9;
            var10 = var10 + var7;
            var8 = var8 ^ var9 >>> -210049500;
            var3 = var3 + var8;
            var9 = var9 + var10;
            var9 = var9 ^ var10 << 1755731976;
            var4 = var4 + var9;
            var10 = var10 + var3;
            var10 = var10 ^ var3 >>> -1542710007;
            var3 = var3 + var4;
            var5 = var5 + var10;
            var2++;
            continue L1;
          }
        }
    }

    final static String a(String param0, int param1) {
        String discarded$7 = null;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        StringBuilder discarded$12 = null;
        StringBuilder discarded$13 = null;
        RuntimeException var2 = null;
        lk[] var2_array = null;
        StringBuilder var3 = null;
        int var4 = 0;
        lk var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        String var10 = null;
        lk[] var11 = null;
        int stackIn_8_0 = 0;
        String stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_20_0 = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var9 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var11 = w.a(param0, (byte) -21);
              var2_array = var11;
              if (param1 >= 103) {
                break L1;
              } else {
                var10 = (String) null;
                discarded$7 = aq.a((String) null, -9);
                break L1;
              }
            }
            var3 = new StringBuilder();
            var4 = 0;
            L2: while (true) {
              if (var11.length <= var4) {
                stackOut_20_0 = var3.toString();
                stackIn_21_0 = stackOut_20_0;
                break L0;
              } else {
                L3: {
                  var5 = var11[var4];
                  var6 = var5.field_f;
                  if (var4 != var11.length - 1) {
                    stackOut_7_0 = var2_array[var4 + 1].field_f;
                    stackIn_8_0 = stackOut_7_0;
                    break L3;
                  } else {
                    stackOut_6_0 = param0.length();
                    stackIn_8_0 = stackOut_6_0;
                    break L3;
                  }
                }
                L4: {
                  var7 = stackIn_8_0;
                  var8 = param0.substring(var6, var7);
                  if (rb.field_Mb == var5.field_k) {
                    discarded$8 = var3.append("<col=66ffff>").append(var8).append("</col>");
                    break L4;
                  } else {
                    if (var5.field_k != v.field_d) {
                      if (vu.field_Ab != var5.field_k) {
                        if (pv.field_H == var5.field_k) {
                          discarded$9 = var3.append("<col=ffaaff>").append(var8).append("</col>");
                          break L4;
                        } else {
                          if (var5.field_k != ra.field_N) {
                            discarded$10 = var3.append(var8);
                            break L4;
                          } else {
                            discarded$11 = var3.append("<col=33ffaa>").append(var8).append("</col>");
                            break L4;
                          }
                        }
                      } else {
                        discarded$12 = var3.append("<col=ffff99>").append(var8).append("</col>");
                        break L4;
                      }
                    } else {
                      discarded$13 = var3.append("<col=33bbff>").append(var8).append("</col>");
                      break L4;
                    }
                  }
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var2);
            stackOut_22_1 = new StringBuilder().append("aq.E(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L5;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L5;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        return stackIn_21_0;
    }

    public static void b(int param0) {
        int discarded$0 = 0;
        field_f = null;
        if (param0 != 1) {
            ml var2 = (ml) null;
            discarded$0 = aq.a(-123, -53, (ml) null);
        }
        field_h = null;
    }

    final static int a(boolean param0) {
        if (!param0) {
            return 17;
        }
        return (int)jr.field_Gb;
    }

    private final void a(int param0) {
        int dupTemp$4 = 0;
        int dupTemp$5 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Kickabout.field_G;
          if (param0 == 256) {
            break L0;
          } else {
            field_h = (String) null;
            break L0;
          }
        }
        int fieldTemp$3 = this.field_b + 1;
        this.field_b = this.field_b + 1;
        this.field_d = this.field_d + fieldTemp$3;
        var2 = 0;
        L1: while (true) {
          if (var2 >= 256) {
            return;
          } else {
            L2: {
              var3 = this.field_i[var2];
              if ((2 & var2) == 0) {
                if ((1 & var2) == 0) {
                  this.field_g = this.field_g ^ this.field_g << -850068083;
                  break L2;
                } else {
                  this.field_g = this.field_g ^ this.field_g >>> 782221510;
                  break L2;
                }
              } else {
                if ((1 & var2) != 0) {
                  this.field_g = this.field_g ^ this.field_g >>> -1219863728;
                  break L2;
                } else {
                  this.field_g = this.field_g ^ this.field_g << -212468638;
                  break L2;
                }
              }
            }
            this.field_g = this.field_g + this.field_i[var2 + 128 & 255];
            dupTemp$4 = this.field_d + this.field_g + this.field_i[qj.b(255, var3 >> 1148827426)];
            var4 = dupTemp$4;
            this.field_i[var2] = dupTemp$4;
            dupTemp$5 = this.field_i[qj.b(var4 >> -711104184 >> 1416578850, 255)] - -var3;
            this.field_d = dupTemp$5;
            this.field_a[var2] = dupTemp$5;
            var2++;
            continue L1;
          }
        }
    }

    final static void c(byte param0) {
        cb.field_d.a(sk.field_d);
        if (param0 > -91) {
            return;
        }
        nm.field_k = null;
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    aq(int[] param0) {
        int var2_int = 0;
        try {
            this.field_i = new int[256];
            this.field_a = new int[256];
            for (var2_int = 0; var2_int < param0.length; var2_int++) {
                this.field_a[var2_int] = param0[var2_int];
            }
            this.a((byte) -113);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "aq.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = "This option is restricted. Your rating is currently <%0>.<br>Can you achieve the qualifying rating of <%1>?";
        field_c = 5;
    }
}
