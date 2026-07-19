/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm {
    static String field_b;
    private int field_a;
    static String field_d;
    static dh field_j;
    private int[] field_c;
    private int field_f;
    private int[] field_g;
    private int field_e;
    static int field_i;
    private int field_h;

    final static boolean a(int param0, int param1, eh param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 10332) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            var4 = param2.b(param1, 27034);
            var3 = var4;
            if (var4 == null) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              d.a((byte) -82, var4);
              stackOut_6_0 = 1;
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3_ref);
            stackOut_8_1 = new StringBuilder().append("mm.B(").append(param0).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    private final void a(byte param0) {
        int discarded$4 = 0;
        int dupTemp$6 = 0;
        int dupTemp$7 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Virogrid.field_F ? 1 : 0;
          if (param0 <= -1) {
            break L0;
          } else {
            discarded$4 = this.a(-121);
            break L0;
          }
        }
        int fieldTemp$5 = this.field_f + 1;
        this.field_f = this.field_f + 1;
        this.field_h = this.field_h + fieldTemp$5;
        var2 = 0;
        L1: while (true) {
          if (var2 >= 256) {
            return;
          } else {
            L2: {
              var3 = this.field_c[var2];
              if (0 != (2 & var2)) {
                if (0 != (var2 & 1)) {
                  this.field_e = this.field_e ^ this.field_e >>> -1791008272;
                  break L2;
                } else {
                  this.field_e = this.field_e ^ this.field_e << -129905982;
                  break L2;
                }
              } else {
                if (0 != (var2 & 1)) {
                  this.field_e = this.field_e ^ this.field_e >>> 854569158;
                  break L2;
                } else {
                  this.field_e = this.field_e ^ this.field_e << -115185843;
                  break L2;
                }
              }
            }
            this.field_e = this.field_e + this.field_c[128 + var2 & 255];
            dupTemp$6 = this.field_e + (this.field_c[rb.a(255, var3 >> -389921758)] + this.field_h);
            var4 = dupTemp$6;
            this.field_c[var2] = dupTemp$6;
            dupTemp$7 = this.field_c[rb.a(var4, 261354) >> 1878912712 >> -2016404862] - -var3;
            this.field_h = dupTemp$7;
            this.field_g[var2] = dupTemp$7;
            var2++;
            continue L1;
          }
        }
    }

    final static void a(int param0, long param1) {
        if (-1L <= (param1 ^ -1L)) {
            return;
        }
        if (param1 % 10L == 0L) {
            mh.a(param1 + -1L, (byte) -88);
            mh.a(1L, (byte) -88);
        } else {
            mh.a(param1, (byte) -88);
        }
        if (param0 >= -6) {
            field_j = (dh) null;
        }
    }

    final int a(int param0) {
        if (!(this.field_a != 0)) {
            this.a((byte) -73);
            this.field_a = 256;
        }
        if (param0 != 5180) {
            return -32;
        }
        int fieldTemp$0 = this.field_a - 1;
        this.field_a = this.field_a - 1;
        return this.field_g[fieldTemp$0];
    }

    final static char a(int param0, byte param1) {
        int var3 = 0;
        int var2 = 255 & param1;
        if (param0 <= 85) {
            mm.a(true);
        }
        if (var2 == 0) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if ((var2 ^ -1) <= -129) {
            if (!(160 <= var2)) {
                var3 = cg.field_f[var2 + -128];
                if (var3 == 0) {
                    var3 = 63;
                }
                var2 = var3;
            }
        }
        return (char)var2;
    }

    private final void b(int param0) {
        boolean discarded$1 = false;
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
        eh var12 = null;
        var11 = Virogrid.field_F ? 1 : 0;
        var7 = -1640531527;
        var9 = -1640531527;
        var5 = -1640531527;
        var6 = -1640531527;
        var10 = -1640531527;
        var3 = -1640531527;
        var4 = -1640531527;
        var8 = -1640531527;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 4) {
            L1: {
              if (param0 >= 7) {
                break L1;
              } else {
                var12 = (eh) null;
                discarded$1 = mm.a(119, -92, (eh) null);
                break L1;
              }
            }
            var2 = 0;
            L2: while (true) {
              if ((var2 ^ -1) <= -257) {
                var2 = 0;
                L3: while (true) {
                  if (var2 >= 256) {
                    this.a((byte) -9);
                    this.field_a = 256;
                    return;
                  } else {
                    var10 = var10 + this.field_c[7 + var2];
                    var7 = var7 + this.field_c[4 + var2];
                    var9 = var9 + this.field_c[var2 + 6];
                    var8 = var8 + this.field_c[var2 - -5];
                    var5 = var5 + this.field_c[2 + var2];
                    var6 = var6 + this.field_c[3 + var2];
                    var4 = var4 + this.field_c[var2 + 1];
                    var3 = var3 + this.field_c[var2];
                    var3 = var3 ^ var4 << 1896791275;
                    var4 = var4 + var5;
                    var6 = var6 + var3;
                    var4 = var4 ^ var5 >>> 2137309058;
                    var7 = var7 + var4;
                    var5 = var5 + var6;
                    var5 = var5 ^ var6 << 908415784;
                    var6 = var6 + var7;
                    var8 = var8 + var5;
                    var6 = var6 ^ var7 >>> -1577458832;
                    var7 = var7 + var8;
                    var9 = var9 + var6;
                    var7 = var7 ^ var8 << -368693142;
                    var10 = var10 + var7;
                    var8 = var8 + var9;
                    var8 = var8 ^ var9 >>> -1348176700;
                    var9 = var9 + var10;
                    var3 = var3 + var8;
                    var9 = var9 ^ var10 << 395930504;
                    var4 = var4 + var9;
                    var10 = var10 + var3;
                    var10 = var10 ^ var3 >>> 1021694697;
                    var3 = var3 + var4;
                    var5 = var5 + var10;
                    this.field_c[var2] = var3;
                    this.field_c[1 + var2] = var4;
                    this.field_c[2 + var2] = var5;
                    this.field_c[var2 + 3] = var6;
                    this.field_c[4 + var2] = var7;
                    this.field_c[5 + var2] = var8;
                    this.field_c[6 + var2] = var9;
                    this.field_c[var2 + 7] = var10;
                    var2 += 8;
                    continue L3;
                  }
                }
              } else {
                var4 = var4 + this.field_g[1 + var2];
                var8 = var8 + this.field_g[var2 + 5];
                var9 = var9 + this.field_g[var2 + 6];
                var10 = var10 + this.field_g[var2 - -7];
                var3 = var3 + this.field_g[var2];
                var7 = var7 + this.field_g[4 + var2];
                var5 = var5 + this.field_g[var2 - -2];
                var6 = var6 + this.field_g[3 + var2];
                var3 = var3 ^ var4 << 21401547;
                var4 = var4 + var5;
                var6 = var6 + var3;
                var4 = var4 ^ var5 >>> -1868507710;
                var7 = var7 + var4;
                var5 = var5 + var6;
                var5 = var5 ^ var6 << -1489668056;
                var8 = var8 + var5;
                var6 = var6 + var7;
                var6 = var6 ^ var7 >>> 171998448;
                var9 = var9 + var6;
                var7 = var7 + var8;
                var7 = var7 ^ var8 << 2105382762;
                var10 = var10 + var7;
                var8 = var8 + var9;
                var8 = var8 ^ var9 >>> -933996412;
                var9 = var9 + var10;
                var3 = var3 + var8;
                var9 = var9 ^ var10 << -324103352;
                var10 = var10 + var3;
                var4 = var4 + var9;
                var10 = var10 ^ var3 >>> -1954600823;
                var5 = var5 + var10;
                var3 = var3 + var4;
                this.field_c[var2] = var3;
                this.field_c[var2 - -1] = var4;
                this.field_c[var2 - -2] = var5;
                this.field_c[var2 + 3] = var6;
                this.field_c[var2 - -4] = var7;
                this.field_c[5 + var2] = var8;
                this.field_c[var2 + 6] = var9;
                this.field_c[7 + var2] = var10;
                var2 += 8;
                continue L2;
              }
            }
          } else {
            var3 = var3 ^ var4 << -1708724149;
            var6 = var6 + var3;
            var4 = var4 + var5;
            var4 = var4 ^ var5 >>> -1796922590;
            var7 = var7 + var4;
            var5 = var5 + var6;
            var5 = var5 ^ var6 << 1638016520;
            var8 = var8 + var5;
            var6 = var6 + var7;
            var6 = var6 ^ var7 >>> -1899215216;
            var9 = var9 + var6;
            var7 = var7 + var8;
            var7 = var7 ^ var8 << 2137465834;
            var8 = var8 + var9;
            var10 = var10 + var7;
            var8 = var8 ^ var9 >>> -453564060;
            var9 = var9 + var10;
            var3 = var3 + var8;
            var9 = var9 ^ var10 << 2029527240;
            var4 = var4 + var9;
            var10 = var10 + var3;
            var10 = var10 ^ var3 >>> -974765047;
            var3 = var3 + var4;
            var5 = var5 + var10;
            var2++;
            continue L0;
          }
        }
    }

    public static void a(boolean param0) {
        char discarded$0 = 0;
        if (param0) {
            discarded$0 = mm.a(-39, (byte) 66);
        }
        field_j = null;
        field_d = null;
        field_b = null;
    }

    mm(int[] param0) {
        int var2_int = 0;
        try {
            this.field_g = new int[256];
            this.field_c = new int[256];
            for (var2_int = 0; param0.length > var2_int; var2_int++) {
                this.field_g[var2_int] = param0[var2_int];
            }
            this.b(83);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "mm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Click";
        field_j = null;
        field_d = "Waiting for fonts";
        field_i = 640;
    }
}
