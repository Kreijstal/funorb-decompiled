/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am {
    static String field_a;
    static String field_b;
    static kc field_c;

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
          field_c = (kc) null;
        }
        field_c = null;
        field_b = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(byte param0, int[] param1) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        qe var4_ref_qe = null;
        int var4 = 0;
        qe var5 = null;
        int var7 = 0;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (qc.field_c != ob.field_eb) {
            return false;
          }
          if (param0 != 26) {
            return false;
          }
          var2_long = qj.b(-26572);
          if (ob.field_ab != 0 &&
            so.field_d < 0) {
            var4_ref_qe = (qe) (uf.field_a.b(12623));
            if (var4_ref_qe != null &&
              var4_ref_qe.field_q < var2_long) {
              var4_ref_qe.a(true);
              fj.field_h = var4_ref_qe.field_k.length;
              df.field_z.field_g = 0;
              for (var5_int = 0; var5_int < fj.field_h; var5_int++) {
                df.field_z.field_j[var5_int] = var4_ref_qe.field_k[var5_int];
              }
              ve.field_m = nf.field_W;
              nf.field_W = se.field_I;
              se.field_I = on.field_g;
              on.field_g = var4_ref_qe.field_g;
              return true;
            }
          }
          while (true) {
            if (0 > so.field_d) {
              df.field_z.field_g = 0;
              if (!pe.a((byte) -86, 1)) {
                return false;
              }
              so.field_d = df.field_z.g((byte) 62);
              df.field_z.field_g = 0;
              fj.field_h = param1[so.field_d];
            }
            if (!pn.b(-12564)) {
              return false;
            }
            if (ob.field_ab == 0) {
              ve.field_m = nf.field_W;
              nf.field_W = se.field_I;
              se.field_I = on.field_g;
              on.field_g = so.field_d;
              so.field_d = -1;
              return true;
            }
            var4 = ob.field_ab;
            if (0.0 != hb.field_Cb) {
              var4 = (int)((double)var4 + ag.field_D.nextGaussian() * hb.field_Cb);
              if (var4 < 0) {
                var4 = 0;
              }
            }
            var5 = new qe(var2_long + (long)var4, so.field_d, new byte[fj.field_h]);
            for (var6 = 0; fj.field_h > var6; var6++) {
              var5.field_k[var6] = df.field_z.field_j[var6];
            }
            uf.field_a.b(var5, -1);
            so.field_d = -1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_40_0 = var2;
          stackIn_40_1 = new StringBuilder().append("am.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    final boolean a(byte param0) {
        int var2;
        boolean stackIn_6_0 = false;
        var2 = -128 % ((param0 - 17) / 52);
        stackIn_6_0 = (this == co.field_h) || (this == bb.field_c) || (this == qc.field_c);
        return stackIn_6_0;
    }

    final static void a(int param0) {
        if (!qe.field_p) {
          throw new IllegalStateException();
        }
        if (param0 != 3020) {
          field_a = (String) null;
        }
        lh.field_n = true;
        tj.a(false, (byte) -106);
        fj.field_j = 0;
    }

    final static int a(int param0, int param1, boolean param2) {
        int stackIn_40_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_49_0 = 0;
        int var3;
        int var4;
        int var4Lifetime1;
        int var4Lifetime2;
        var4 = param1 >> 31;
        param1 = param1 + var4 ^ var4;
        if (param2) {
          return -23;
        }
        var4Lifetime1 = param0 >> 31;
        param0 = param0 + var4Lifetime1 ^ var4Lifetime1;
        if (param0 > param1) {
          var4Lifetime2 = param1;
          param1 = param0;
          param0 = var4Lifetime2;
        }
        var3 = 0;
        if (param1 >= 32768) {
          if (1073741824 <= param1) {
            var3 += 16;
            param1 = param1 >> 16;
          }
          if (param1 >= 4194304) {
            param1 = param1 >> 8;
            var3 += 8;
          }
          if (param1 >= 262144) {
            param1 = param1 >> 4;
            var3 += 4;
          }
          if (param1 >= 65536) {
            var3 += 2;
            param1 = param1 >> 2;
          }
          if (param1 >= 32768) {
            param1 = param1 >> 1;
            var3++;
          }
          param0 = param0 >> var3;
        }
        if (param1 > param0 << 5) {
          return param1 << var3;
        }
        param1 = param1 * param1 + param0 * param0;
        if (param1 < 65536) {
          if (256 > param1) {
            if (0 > param1) {
              return -1;
            }
            return gj.field_g[param1] >> 12;
          }
          if (param1 >= 4096) {
            if (16384 <= param1) {
              return gj.field_g[param1 >> 8] >> 8;
            }
            return gj.field_g[param1 >> 6] >> 9;
          }
          if (param1 < 1024) {
            return gj.field_g[param1 >> 2] >> 11;
          }
          return gj.field_g[param1 >> 4] >> 10;
        }
        if (param1 < 16777216) {
          if (param1 >= 1048576) {
            if (param1 >= 4194304) {
              return gj.field_g[param1 >> 16] >> 4;
            }
            return gj.field_g[param1 >> 14] >> 5;
          }
          if (param1 < 262144) {
            return gj.field_g[param1 >> 10] >> 7;
          }
          return gj.field_g[param1 >> 12] >> 6;
        }
        if (param1 >= 268435456) {
          if (1073741824 <= param1) {
            return gj.field_g[param1 >> 24] << var3;
          }
          if (var3 >= 1) {
            stackIn_49_0 = gj.field_g[param1 >> 22] << var3 - 1;
          } else {
            stackIn_49_0 = gj.field_g[param1 >> 22] >> -var3 + 1;
          }
          return stackIn_49_0;
        }
        if (param1 < 67108864) {
          if (var3 < 3) {
            stackIn_44_0 = gj.field_g[param1 >> 18] >> 3 - var3;
          } else {
            stackIn_44_0 = gj.field_g[param1 >> 18] << var3 - 3;
          }
          return stackIn_44_0;
        }
        if (var3 >= 2) {
          stackIn_40_0 = gj.field_g[param1 >> 20] << -2 + var3;
        } else {
          stackIn_40_0 = gj.field_g[param1 >> 20] >> -var3 + 2;
        }
        return stackIn_40_0;
    }

    static {
        field_b = "Always fire at medium power; just point and click.";
        field_a = "Show chat (1 unread message)";
    }
}
