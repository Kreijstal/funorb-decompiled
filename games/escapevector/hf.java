/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf {
    static double field_c;
    static int field_b;
    static boolean field_a;

    final static void a(int param0) {
        mi var1 = (mi) (k.field_d.b(-8980));
        if (var1 == null) {
          var1 = new mi();
        }
        var1.a(em.field_j, (byte) 29, em.field_k, em.field_b, em.field_a, em.field_d, em.field_i, em.field_l);
        int var2 = 28 % ((param0 + 72) / 49);
        re.field_q.a(-12328, var1);
    }

    final static String b(byte param0) {
        String var1;
        int var2;
        int var3;
        int var4;
        int var5;
        String var6;
        String var7;
        String var8;
        int var2Lifetime1;
        var5 = EscapeVector.field_A;
        var6 = "(" + g.field_q + " " + f.field_t + " " + jj.field_b + ") " + cd.field_v;
        var1 = var6;
        if (hi.field_r > 0) {
          var1 = var6 + ":";
          for (var2 = 0; var2 < hi.field_r; var2++) {
            var7 = var1 + ' ';
            var1 = var7;
            var3 = 255 & om.field_g.field_g[var2];
            var4 = var3 >> 4;
            if (var4 < 10) {
              var4 += 48;
            } else {
              var4 += 55;
            }
            var3 = var3 & 15;
            var8 = var7 + (char)var4;
            if (var3 >= 10) {
              var3 += 55;
            } else {
              var3 += 48;
            }
            var1 = var8 + (char)var3;
          }
        }
        var2Lifetime1 = 96 / ((-24 - param0) / 38);
        return var1;
    }

    final boolean a(byte param0) {
        boolean stackIn_8_0 = false;
        if (param0 < 62) {
          return false;
        }
        stackIn_8_0 = (this == mc.field_b) || (rn.field_c == this) || (this == ck.field_t);
        return stackIn_8_0;
    }

    final static byte[] a(mf param0, int[] param1, int param2, int param3, mf param4, byte param5) {
        Object stackIn_6_0 = null;
        mf stackIn_10_0 = null;
        byte[] stackIn_15_0 = null;
        byte[] stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        mf var8 = null;
        String var11 = null;
        String var12 = null;
        String var13 = null;
        String var14 = null;
        String var15 = null;
        try {
          if (param5 < 92) {
            field_b = -32;
          }
          var6_int = je.a(false, param3);
          if (param2 < 0) {
            return null;
          }
          if (var6_int <= param2) {
            stackIn_6_0 = null;
            return (byte[]) (stackIn_6_0);
          }
          var7 = dh.field_e[param3];
          if (var7 != 2) {
            stackIn_10_0 = (mf) (param0);
          } else {
            stackIn_10_0 = (mf) (param4);
          }
          var8 = stackIn_10_0;
          if (var8 == null) {
            return null;
          }
          var12 = ja.field_e[param3].toLowerCase();
          var11 = fh.field_c[param3][param2].toLowerCase() + ".lvl";
          var13 = rd.a((byte) 72, var11);
          var15 = var12 + "_" + var13;
          var14 = "";
          if (param1 == null) {
            stackIn_17_0 = var8.a(-4, var15, var14);
            return stackIn_17_0;
          }
          stackIn_15_0 = var8.a((byte) -73, var14, var15, param1);
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_20_0 = var6;
          stackIn_20_1 = new StringBuilder().append("hf.D(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param5).append(')').toString());
        }
    }

    final static ed[] b(int param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = EscapeVector.field_A;
        if (param0 < 63) {
          field_c = -0.8853374871854307;
        }
        ed[] var1 = new ed[qk.field_j];
        for (var2 = 0; var2 < qk.field_j; var2++) {
          var3 = bc.field_a[var2] * qh.field_k[var2];
          var4 = qe.field_a[var2];
          var5 = new int[var3];
          for (var6 = 0; var6 < var3; var6++) {
            var5[var6] = qk.field_f[ae.a((int) var4[var6], 255)];
          }
          var1[var2] = new ed(on.field_e, hd.field_c, gn.field_k[var2], gi.field_e[var2], qh.field_k[var2], bc.field_a[var2], var5);
        }
        of.a(false);
        return var1;
    }

    final static byte a(int param0, char param1) {
        int var2;
        int var3;
        var3 = EscapeVector.field_A;
        if (param0 <= 22) {
          return (byte) -88;
        }
        {
          if ((param1 <= 0 ||
            param1 >= 128) &&
            (param1 < 160 ||
            param1 > 255)) {
            if (8364 == param1) {
              var2 = -128;
            } else if (param1 == 8218) {
              var2 = -126;
            } else if (param1 == 402) {
              var2 = -125;
            } else if (8222 == param1) {
              var2 = -124;
            } else if (param1 == 8230) {
              var2 = -123;
            } else if (param1 == 8224) {
              var2 = -122;
            } else if (8225 == param1) {
              var2 = -121;
            } else if (710 == param1) {
              var2 = -120;
            } else if (param1 == 8240) {
              var2 = -119;
            } else if (param1 == 352) {
              var2 = -118;
            } else if (param1 == 8249) {
              var2 = -117;
            } else if (param1 == 338) {
              var2 = -116;
            } else if (param1 == 381) {
              var2 = -114;
            } else if (8216 == param1) {
              var2 = -111;
            } else if (param1 == 8217) {
              var2 = -110;
            } else if (param1 == 8220) {
              var2 = -109;
            } else if (8221 == param1) {
              var2 = -108;
            } else if (param1 == 8226) {
              var2 = -107;
            } else if (8211 == param1) {
              var2 = -106;
            } else if (8212 == param1) {
              var2 = -105;
            } else if (param1 == 732) {
              var2 = -104;
            } else if (param1 == 8482) {
              var2 = -103;
            } else if (param1 == 353) {
              var2 = -102;
            } else if (8250 == param1) {
              var2 = -101;
            } else if (339 == param1) {
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

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_c = Math.atan2(1.0, 0.0);
    }
}
