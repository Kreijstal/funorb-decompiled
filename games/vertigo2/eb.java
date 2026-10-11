/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb {
    static int[] field_g;
    static ob field_d;
    static String field_a;
    static int field_e;
    static int[] field_f;
    static mc field_c;
    static int field_b;
    static String field_i;
    static int field_h;

    final static void b(int param0) {
        int var3 = 0;
        int stackIn_19_0 = 0;
        String stackIn_24_0 = null;
        int stackIn_28_0 = 0;
        String stackIn_34_0 = null;
        String stackIn_40_0 = null;
        boolean stackIn_41_1 = false;
        mp stackIn_45_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        mp var9 = null;
        int var10 = 0;
        String var11 = null;
        int var7Lifetime1;
        int var8Lifetime1;
        var10 = Vertigo2.field_L ? 1 : 0;
        try {
          var1_int = be.field_t;
          var2 = 0;
          if (da.field_j == 2) {
            var3_long = gk.a(95) - qe.field_cb;
            var2 = (int)((-var3_long + 10999L) / 1000L);
            if (var2 < 0) {
              var2 = 0;
            }
          }
          if (param0 != -14732) {
            var11 = (String) null;
            eb.a((String) null, true);
          }
          for (var3 = 0; mn.field_q.length > var3; var3++) {
            var4 = gd.field_s[var3];
            if (var4 >= 0) {
              if (var4 == ve.field_d.field_c) {
                var5 = sr.field_a;
              } else {
                var5 = ma.field_m;
              }
            } else {
              var5 = oi.field_b;
            }
            var6 = mn.field_q[var3];
            if (da.field_j == 2 &&
              var2 == 1) {
              if (rp.field_e.length > jo.field_g.length) {
                stackIn_19_0 = rp.field_e.length;
              } else {
                stackIn_19_0 = jo.field_g.length;
              }
              var7 = stackIn_19_0;
              if (var3 >= 6 &&
                var3 < 6 + var7) {
                if (-6 + var3 + (jo.field_g.length - var7) >= 0) {
                  stackIn_24_0 = jo.field_g[jo.field_g.length + (-6 + var3 - var7)];
                } else {
                  stackIn_24_0 = "";
                }
                var6 = stackIn_24_0;
              }
              if (ba.field_b.length > bl.field_z.length) {
                stackIn_28_0 = ba.field_b.length;
              } else {
                stackIn_28_0 = bl.field_z.length;
              }
              var8 = stackIn_28_0;
              if (var7 + 7 <= var3 &&
                var8 + (7 + var7) > var3) {
                if (var3 + (-7 - var7) < bl.field_z.length) {
                  stackIn_34_0 = bl.field_z[-7 + var3 - var7];
                } else {
                  stackIn_34_0 = "";
                }
                var6 = stackIn_34_0;
              }
            }
            if (var4 == -2) {
              var6 = Integer.toString(var2);
            }
            stackIn_40_0 = var6;
            stackIn_41_1 = !(0 > var4);
            var7Lifetime1 = uc.a(stackIn_40_0, stackIn_41_1, false);
            var8Lifetime1 = vm.field_c - (var7Lifetime1 >> 1);
            if (0 <= var4) {
              if (var4 == ve.field_d.field_c) {
                stackIn_45_0 = mq.field_v;
              } else {
                stackIn_45_0 = gl.field_i;
              }
              var9 = stackIn_45_0;
              var1_int = var1_int + al.field_z;
              if (var9 != null) {
                var9.a(kd.field_z + (qc.field_z << 1), var8Lifetime1 - gl.field_l, var1_int, var7Lifetime1 + (gl.field_l << 1), -114);
              }
              var1_int = var1_int + qc.field_z;
            }
            if (0 <= var4) {
              gb.field_b.b(var6, var8Lifetime1, var1_int + re.field_g, var5, -1);
              var1_int = var1_int + (kd.field_z + al.field_z + qc.field_z);
            } else {
              mf.field_c.b(var6, var8Lifetime1, gj.field_y + var1_int, var5, -1);
              var1_int = var1_int + gd.field_k;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var1), "eb.B(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_i = null;
        field_a = null;
        field_g = null;
        field_c = null;
        if (param0 != 15) {
          eb.a((byte) -51);
        }
        field_d = null;
    }

    final static boolean a(String param0, boolean param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          try {
            if (!jj.field_v.startsWith("win")) {
              return false;
            }
            if (!param0.startsWith("http://") &&
              !param0.startsWith("https://")) {
              return false;
            }
            var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            if (!param1) {
              return false;
            }
            var3 = 0;
            while (true) {
              if (var3 >= param0.length()) {
                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                return true;
              }
              if (var2.indexOf((int) param0.charAt(var3)) != -1) {
                var3++;
                continue;
              }
              break;
            }
            return false;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_24_0 = var2_ref2;
          stackIn_24_1 = new StringBuilder().append("eb.E(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String a(int param0) {
        if (un.field_Hb == bf.field_b) {
          return mk.field_S;
        }
        if (!cl.field_c.a((byte) -108)) {
          return cl.field_c.d((byte) 121);
        }
        if (um.field_F == bf.field_b) {
          return cl.field_c.d((byte) 119);
        }
        if (param0 != -1) {
          field_h = -125;
        }
        return ff.field_u;
    }

    final static String a(boolean param0, boolean param1, int param2, boolean param3) {
        int var4 = 0;
        if (param2 != 6337) {
          return (String) null;
        }
        if (param1) {
          var4 += 4;
        }
        if (param3) {
          var4 += 2;
        }
        if (param0) {
          var4++;
        }
        return m.field_y[var4];
    }

    static {
        field_g = new int[1024];
        field_f = new int[12];
        field_i = "Your ignore list is full. Max of 100 hit.";
    }
}
