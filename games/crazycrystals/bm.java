/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm {
    private int field_i;
    static int field_h;
    private int[] field_a;
    private int field_b;
    private int[] field_f;
    private int field_d;
    static String field_j;
    static int[][] field_e;
    private int field_c;
    static f field_g;

    final static String b(byte param0) {
        if (param0 <= 88) {
            return (String) null;
        }
        if (null == je.field_g) {
            return "";
        }
        return je.field_g;
    }

    final static void a(int param0, dl[] param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 6437) {
                break L1;
              } else {
                field_h = -125;
                break L1;
              }
            }
            L2: {
              nl.field_f = param1;
              if (null == nl.field_f) {
                break L2;
              } else {
                if (3 <= param1.length) {
                  break L2;
                } else {
                  throw new IllegalArgumentException("");
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var2);
            stackOut_6_1 = new StringBuilder().append("bm.A(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final int a(boolean param0) {
        String discarded$6 = null;
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        String discarded$10 = null;
        int fieldTemp$11 = 0;
        if (0 != this.field_b) {
          if (param0) {
            discarded$6 = bm.b((byte) 50);
            fieldTemp$7 = this.field_b - 1;
            this.field_b = this.field_b - 1;
            return this.field_f[fieldTemp$7];
          } else {
            fieldTemp$8 = this.field_b - 1;
            this.field_b = this.field_b - 1;
            return this.field_f[fieldTemp$8];
          }
        } else {
          this.a(-95);
          this.field_b = 256;
          if (!param0) {
            fieldTemp$9 = this.field_b - 1;
            this.field_b = this.field_b - 1;
            return this.field_f[fieldTemp$9];
          } else {
            discarded$10 = bm.b((byte) 50);
            fieldTemp$11 = this.field_b - 1;
            this.field_b = this.field_b - 1;
            return this.field_f[fieldTemp$11];
          }
        }
    }

    public static void a(byte param0) {
        field_j = null;
        field_g = null;
        if (param0 != -66) {
            return;
        }
        field_e = (int[][]) null;
    }

    private final void b(boolean param0) {
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
        var11 = CrazyCrystals.field_B;
        var5 = -1640531527;
        var6 = -1640531527;
        var10 = -1640531527;
        var8 = -1640531527;
        var9 = -1640531527;
        var7 = -1640531527;
        var3 = -1640531527;
        var4 = -1640531527;
        var2 = 0;
        L0: while (true) {
          if (4 <= var2) {
            var2 = 0;
            L1: while (true) {
              if (256 <= var2) {
                var2 = 0;
                if (!param0) {
                  this.field_b = -11;
                  L2: while (true) {
                    if (256 <= var2) {
                      this.a(-53);
                      this.field_b = 256;
                      return;
                    } else {
                      var4 = var4 + this.field_a[var2 - -1];
                      var3 = var3 + this.field_a[var2];
                      var8 = var8 + this.field_a[var2 + 5];
                      var7 = var7 + this.field_a[4 + var2];
                      var9 = var9 + this.field_a[var2 - -6];
                      var6 = var6 + this.field_a[var2 - -3];
                      var5 = var5 + this.field_a[2 + var2];
                      var10 = var10 + this.field_a[7 + var2];
                      var3 = var3 ^ var4 << 731340363;
                      var4 = var4 + var5;
                      var6 = var6 + var3;
                      var4 = var4 ^ var5 >>> -8481470;
                      var5 = var5 + var6;
                      var7 = var7 + var4;
                      var5 = var5 ^ var6 << -999818680;
                      var6 = var6 + var7;
                      var8 = var8 + var5;
                      var6 = var6 ^ var7 >>> 1148220464;
                      var9 = var9 + var6;
                      var7 = var7 + var8;
                      var7 = var7 ^ var8 << -594722422;
                      var10 = var10 + var7;
                      var8 = var8 + var9;
                      var8 = var8 ^ var9 >>> 1643129892;
                      var9 = var9 + var10;
                      var3 = var3 + var8;
                      var9 = var9 ^ var10 << -1792390776;
                      var4 = var4 + var9;
                      var10 = var10 + var3;
                      var10 = var10 ^ var3 >>> 1964002633;
                      var5 = var5 + var10;
                      var3 = var3 + var4;
                      this.field_a[var2] = var3;
                      this.field_a[var2 + 1] = var4;
                      this.field_a[var2 - -2] = var5;
                      this.field_a[var2 - -3] = var6;
                      this.field_a[4 + var2] = var7;
                      this.field_a[5 + var2] = var8;
                      this.field_a[6 + var2] = var9;
                      this.field_a[var2 - -7] = var10;
                      var2 += 8;
                      continue L2;
                    }
                  }
                } else {
                  L3: while (true) {
                    if (256 <= var2) {
                      this.a(-53);
                      this.field_b = 256;
                      return;
                    } else {
                      var4 = var4 + this.field_a[var2 - -1];
                      var3 = var3 + this.field_a[var2];
                      var8 = var8 + this.field_a[var2 + 5];
                      var7 = var7 + this.field_a[4 + var2];
                      var9 = var9 + this.field_a[var2 - -6];
                      var6 = var6 + this.field_a[var2 - -3];
                      var5 = var5 + this.field_a[2 + var2];
                      var10 = var10 + this.field_a[7 + var2];
                      var3 = var3 ^ var4 << 731340363;
                      var4 = var4 + var5;
                      var6 = var6 + var3;
                      var4 = var4 ^ var5 >>> -8481470;
                      var5 = var5 + var6;
                      var7 = var7 + var4;
                      var5 = var5 ^ var6 << -999818680;
                      var6 = var6 + var7;
                      var8 = var8 + var5;
                      var6 = var6 ^ var7 >>> 1148220464;
                      var9 = var9 + var6;
                      var7 = var7 + var8;
                      var7 = var7 ^ var8 << -594722422;
                      var10 = var10 + var7;
                      var8 = var8 + var9;
                      var8 = var8 ^ var9 >>> 1643129892;
                      var9 = var9 + var10;
                      var3 = var3 + var8;
                      var9 = var9 ^ var10 << -1792390776;
                      var4 = var4 + var9;
                      var10 = var10 + var3;
                      var10 = var10 ^ var3 >>> 1964002633;
                      var5 = var5 + var10;
                      var3 = var3 + var4;
                      this.field_a[var2] = var3;
                      this.field_a[var2 + 1] = var4;
                      this.field_a[var2 - -2] = var5;
                      this.field_a[var2 - -3] = var6;
                      this.field_a[4 + var2] = var7;
                      this.field_a[5 + var2] = var8;
                      this.field_a[6 + var2] = var9;
                      this.field_a[var2 - -7] = var10;
                      var2 += 8;
                      continue L3;
                    }
                  }
                }
              } else {
                var10 = var10 + this.field_f[var2 + 7];
                var4 = var4 + this.field_f[1 + var2];
                var5 = var5 + this.field_f[var2 + 2];
                var9 = var9 + this.field_f[var2 - -6];
                var6 = var6 + this.field_f[var2 + 3];
                var8 = var8 + this.field_f[5 + var2];
                var7 = var7 + this.field_f[var2 + 4];
                var3 = var3 + this.field_f[var2];
                var3 = var3 ^ var4 << -913081653;
                var4 = var4 + var5;
                var6 = var6 + var3;
                var4 = var4 ^ var5 >>> 127106946;
                var7 = var7 + var4;
                var5 = var5 + var6;
                var5 = var5 ^ var6 << -363219544;
                var6 = var6 + var7;
                var8 = var8 + var5;
                var6 = var6 ^ var7 >>> -285542576;
                var7 = var7 + var8;
                var9 = var9 + var6;
                var7 = var7 ^ var8 << -732485622;
                var8 = var8 + var9;
                var10 = var10 + var7;
                var8 = var8 ^ var9 >>> 357296292;
                var9 = var9 + var10;
                var3 = var3 + var8;
                var9 = var9 ^ var10 << 1101620904;
                var10 = var10 + var3;
                var4 = var4 + var9;
                var10 = var10 ^ var3 >>> 925153289;
                var5 = var5 + var10;
                var3 = var3 + var4;
                this.field_a[var2] = var3;
                this.field_a[1 + var2] = var4;
                this.field_a[var2 + 2] = var5;
                this.field_a[var2 - -3] = var6;
                this.field_a[var2 + 4] = var7;
                this.field_a[5 + var2] = var8;
                this.field_a[var2 - -6] = var9;
                this.field_a[var2 - -7] = var10;
                var2 += 8;
                continue L1;
              }
            }
          } else {
            var3 = var3 ^ var4 << 358324171;
            var4 = var4 + var5;
            var6 = var6 + var3;
            var4 = var4 ^ var5 >>> 1312297250;
            var5 = var5 + var6;
            var7 = var7 + var4;
            var5 = var5 ^ var6 << -267137112;
            var6 = var6 + var7;
            var8 = var8 + var5;
            var6 = var6 ^ var7 >>> 295080336;
            var9 = var9 + var6;
            var7 = var7 + var8;
            var7 = var7 ^ var8 << 1326478218;
            var8 = var8 + var9;
            var10 = var10 + var7;
            var8 = var8 ^ var9 >>> 809390180;
            var9 = var9 + var10;
            var3 = var3 + var8;
            var9 = var9 ^ var10 << -1032241976;
            var4 = var4 + var9;
            var10 = var10 + var3;
            var10 = var10 ^ var3 >>> -423832183;
            var5 = var5 + var10;
            var3 = var3 + var4;
            var2++;
            continue L0;
          }
        }
    }

    bm(int[] param0) {
        int var2_int = 0;
        try {
            this.field_a = new int[256];
            this.field_f = new int[256];
            for (var2_int = 0; param0.length > var2_int; var2_int++) {
                this.field_f[var2_int] = param0[var2_int];
            }
            this.b(true);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "bm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0) {
        int fieldTemp$6 = 0;
        int dupTemp$7 = 0;
        int dupTemp$8 = 0;
        int fieldTemp$9 = 0;
        int dupTemp$10 = 0;
        int dupTemp$11 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = CrazyCrystals.field_B;
        if (param0 <= -35) {
          fieldTemp$6 = this.field_d + 1;
          this.field_d = this.field_d + 1;
          this.field_c = this.field_c + fieldTemp$6;
          var2 = 0;
          L0: while (true) {
            if (256 <= var2) {
              return;
            } else {
              L1: {
                var3 = this.field_a[var2];
                if ((var2 & 2) == 0) {
                  if (-1 != (var2 & 1 ^ -1)) {
                    this.field_i = this.field_i ^ this.field_i >>> -1023725562;
                    break L1;
                  } else {
                    this.field_i = this.field_i ^ this.field_i << 1710504077;
                    break L1;
                  }
                } else {
                  if ((var2 & 1) == 0) {
                    this.field_i = this.field_i ^ this.field_i << 1685369090;
                    break L1;
                  } else {
                    this.field_i = this.field_i ^ this.field_i >>> -1254748304;
                    break L1;
                  }
                }
              }
              this.field_i = this.field_i + this.field_a[var2 - -128 & 255];
              dupTemp$7 = this.field_a[pf.b(255, var3 >> -1441265758)] + this.field_i + this.field_c;
              var4 = dupTemp$7;
              this.field_a[var2] = dupTemp$7;
              dupTemp$8 = var3 + this.field_a[pf.b(1020, var4 >> 1986300136) >> 1435372002];
              this.field_c = dupTemp$8;
              this.field_f[var2] = dupTemp$8;
              var2++;
              continue L0;
            }
          }
        } else {
          field_j = (String) null;
          fieldTemp$9 = this.field_d + 1;
          this.field_d = this.field_d + 1;
          this.field_c = this.field_c + fieldTemp$9;
          var2 = 0;
          L2: while (true) {
            if (256 <= var2) {
              return;
            } else {
              L3: {
                var3 = this.field_a[var2];
                if ((var2 & 2) == 0) {
                  if (-1 != (var2 & 1 ^ -1)) {
                    this.field_i = this.field_i ^ this.field_i >>> -1023725562;
                    break L3;
                  } else {
                    this.field_i = this.field_i ^ this.field_i << 1710504077;
                    break L3;
                  }
                } else {
                  if ((var2 & 1) == 0) {
                    this.field_i = this.field_i ^ this.field_i << 1685369090;
                    break L3;
                  } else {
                    this.field_i = this.field_i ^ this.field_i >>> -1254748304;
                    break L3;
                  }
                }
              }
              this.field_i = this.field_i + this.field_a[var2 - -128 & 255];
              dupTemp$10 = this.field_a[pf.b(255, var3 >> -1441265758)] + this.field_i + this.field_c;
              var4 = dupTemp$10;
              this.field_a[var2] = dupTemp$10;
              dupTemp$11 = var3 + this.field_a[pf.b(1020, var4 >> 1986300136) >> 1435372002];
              this.field_c = dupTemp$11;
              this.field_f[var2] = dupTemp$11;
              var2++;
              continue L2;
            }
          }
        }
    }

    static {
        field_h = 0;
        field_j = "Achieved";
        field_g = (f) ((Object) new kp(-1));
    }
}
