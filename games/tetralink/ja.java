/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja implements m {
    static String field_d;
    static int field_g;
    static volatile boolean field_h;
    static int field_a;
    private ah field_c;
    static oh field_i;
    static int field_f;
    static String field_e;
    static int[] field_l;
    private jn[] field_b;
    static String field_k;
    static int field_j;

    public final int b(int param0, int param1) {
        if (param0 != 6092) {
            ja.a((byte) -102);
        }
        if (null == ((ja) this).field_b[param1]) {
            return 0;
        }
        return ((ja) this).field_b[param1].field_b;
    }

    final static int c(int param0, int param1) {
        int var2 = 0;
        L0: {
          L1: {
            var2 = 0;
            if (param1 < 0) {
              break L1;
            } else {
              if (65536 <= param1) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          param1 = param1 >>> 16;
          var2 += 16;
          break L0;
        }
        L2: {
          if (param1 >= 256) {
            var2 += 8;
            param1 = param1 >>> 8;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (param1 < 16) {
            break L3;
          } else {
            var2 += 4;
            param1 = param1 >>> 4;
            break L3;
          }
        }
        L4: {
          if (4 <= param1) {
            param1 = param1 >>> 2;
            var2 += 2;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (param1 < 1) {
            break L5;
          } else {
            param1 = param1 >>> 1;
            var2++;
            break L5;
          }
        }
        return var2 + param1;
    }

    final static boolean b(boolean param0, int param1) {
        return 2 == param1;
    }

    private final void a(byte param0, jn param1, float param2) {
        kh var10 = null;
        byte[] var18 = null;
        int[] var17 = null;
        int[] var15 = null;
        int[] var13 = null;
        int[] var11 = null;
        int[] var6 = null;
        int var7 = 0;
        int var9 = 0;
        int var8 = TetraLink.field_J;
        try {
            var10 = hd.a(1, param1.field_e, ((ja) this).field_c);
            var10.a();
            var18 = var10.field_o;
            var17 = var10.field_p;
            var15 = var17;
            var13 = var15;
            var11 = var13;
            var6 = var11;
            for (var7 = 0; var7 < var17.length; var7++) {
                var6[var7] = oa.a(var17[var7], (double)param2, (byte) 45);
            }
            param1.field_c = new int[16384];
            if (128 != var10.field_b) {
                throw new RuntimeException();
            }
            var9 = 0;
            var7 = var9;
            while (16384 > var9) {
                param1.field_c[var9] = var6[pl.a(255, (int) var18[var9])];
                var9++;
            }
            param1.field_f = param2;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "ja.F(" + 6 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        field_k = null;
        field_l = null;
        field_e = null;
        field_d = null;
        if (param0 < 57) {
            return;
        }
        field_i = null;
    }

    public final boolean a(boolean param0, int param1) {
        if (!param0) {
            ((ja) this).field_c = null;
            return true;
        }
        return true;
    }

    final static void a(int param0) {
        if (ch.field_q != null) {
            ch.field_q.b();
        }
        if (!(null == hc.field_v)) {
            hc.field_v.b();
        }
    }

    public final int a(int param0, int param1) {
        if (param1 != 0) {
            field_f = 67;
            return 0;
        }
        return 0;
    }

    public final boolean a(byte param0, int param1) {
        if (param0 != -37) {
            return false;
        }
        return false;
    }

    ja(ah param0, ah param1) {
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        bh var6 = null;
        int[] var8 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
            ((ja) this).field_c = param1;
            var8 = param0.c(0, 0);
            var3 = var8;
            var4 = var8.length;
            ((ja) this).field_b = new jn[param0.b(-23126, 0)];
            var5 = 0;
            L1: while (true) {
              if (var5 >= var4) {
                break L0;
              } else {
                var6 = new bh(param0.a(50, var8[var5], 0));
                ((ja) this).field_b[var8[var5]] = new jn(var6);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3_ref;
            stackOut_5_1 = new StringBuilder().append("ja.<init>(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    public final int[] a(float param0, int param1, boolean param2) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        jn var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        var11 = TetraLink.field_J;
        var12 = ((ja) this).field_b[param1];
        if (var12 != null) {
          L0: {
            if (var12.field_f != param0) {
              var12.field_c = null;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (null == var12.field_c) {
              this.a((byte) 6, var12, param0);
              break L1;
            } else {
              break L1;
            }
          }
          if (5 == param1) {
            return var12.field_c;
          } else {
            L2: {
              if (param2) {
                break L2;
              } else {
                ja.a((byte) 74);
                break L2;
              }
            }
            L3: {
              var16 = cc.field_a.field_C;
              var15 = var16;
              var14 = var15;
              var13 = var14;
              var5 = var13;
              var6 = dh.field_e + ui.a(16, 1692) & 127;
              rd.a(var12.field_c, 0, var5, var6 * 128, -(128 * var6) + 16384);
              rd.a(var12.field_c, 128 * (-var6 + 128), var16, 0, 128 * var6);
              var7 = (3 * param1 + 17) * dh.field_e & 255;
              if (var7 < 128) {
                var7 = var7 >> 2;
                break L3;
              } else {
                break L3;
              }
            }
            var8 = 0;
            L4: while (true) {
              if (var8 >= 16384) {
                return var5;
              } else {
                var9 = var16[var8];
                var10 = var9 & 65280;
                var10 = var7 * var10 & 16711680;
                var9 = var9 & 16711935;
                var9 = -16711936 & var9 * var7;
                var5[var8] = mc.a(var9, var10) >>> 8;
                var8++;
                continue L4;
              }
            }
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Error connecting to server. Please try using a different server.";
        field_a = 64;
        field_f = 360;
        field_k = "Day";
        field_h = true;
        field_e = "Mute this player for 48 hours";
    }
}
