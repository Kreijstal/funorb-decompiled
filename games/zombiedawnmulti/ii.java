/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ii {
    static boolean field_e;
    static ul field_a;
    static String field_b;
    static ja field_c;
    static long field_d;

    final static void a(int param0, byte param1, int param2, String param3, long param4) {
        try {
          v.field_a = param3;
          da.field_c = param4;
          vh.field_Hb = true;
          fh.field_n = param0;
          mi.field_Gb = param2;
          if (param1 > -108) {
            ii.b((byte) -126);
          }
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "ii.J(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    abstract long a(byte param0);

    public static void c(int param0) {
        if (param0 == -26028) {
          field_c = null;
          field_a = null;
          field_b = null;
          return;
        }
        String var2 = (String) null;
        ii.a((String) null, (byte) -103, -24);
        field_c = null;
        field_a = null;
        field_b = null;
    }

    abstract int a(long param0, boolean param1);

    abstract void b(int param0);

    final static void a(int param0) {
        int var2 = 0;
        nc[] var1 = null;
        nc var3 = null;
        int var4 = 0;
        nc[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        String var5 = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (ap.field_s) {
            return;
          }
          ap.field_s = true;
          var6 = mj.field_Hb;
          var1 = var6;
          for (var2 = 0; var6.length > var2; var2++) {
            var3 = var6[var2];
            if (var3 != null) {
              var3.c(1);
            }
          }
          if (param0 > 62) {
            return;
          }
          var5 = (String) null;
          ii.a((String) null, (byte) 19, -44);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1_ref), "ii.L(" + param0 + ')');
        }
    }

    final static String a(String param0, byte param1, int param2) {
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        String stackIn_19_0 = null;
        String stackIn_23_0 = null;
        String stackIn_26_0 = null;
        Object stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        ga var5 = null;
        CharSequence var6 = null;
        try {
          var6 = (CharSequence) ((Object) param0);
          if (!em.a(var6, (byte) -38)) {
            stackIn_3_0 = u.field_f;
            return stackIn_3_0;
          }
          if (ge.field_zb != 2) {
            stackIn_6_0 = le.field_G;
            return stackIn_6_0;
          }
          if (sf.a(1, param0)) {
            stackIn_10_0 = hf.field_b;
            return stackIn_10_0;
          }
          if (kj.a((byte) -94, param0)) {
            stackIn_13_0 = vl.a(jf.field_b, new String[]{param0}, 2);
            return stackIn_13_0;
          }
          if (param1 != 116) {
            ii.b((byte) -55);
          }
          if (100 <= dc.field_Fb &&
            0 >= vl.field_h) {
            stackIn_19_0 = eh.field_g;
            return stackIn_19_0;
          }
          if (200 <= dc.field_Fb) {
            stackIn_23_0 = eh.field_g;
            return stackIn_23_0;
          }
          if (hp.a(param0, param1 + 904)) {
            stackIn_26_0 = vl.a(wf.field_r, new String[]{param0}, param1 - 114);
            return stackIn_26_0;
          }
          var5 = ma.field_a;
          var5.b((byte) -35, param2);
          var5.field_j = var5.field_j + 1;
          var4 = var5.field_j;
          var5.a(124, 0);
          var5.a(param0, (byte) 105);
          var5.e(21, -var4 + var5.field_j);
          stackIn_28_0 = null;
          return (String) (stackIn_28_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_31_0 = var3;
          stackIn_31_1 = new StringBuilder().append("ii.Q(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, String param1) {
        int stackIn_17_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (-1 == hl.field_a &&
            tn.field_z == -1) {
            hl.field_a = bd.field_g;
            tn.field_z = bo.field_d;
          }
          boolean decompiledFrameRemainder0 = true;
          l.field_a = l.field_a + 1;
          if (param1 != null) {
            decompiledFrameRemainder0 = !(param1.equals(kg.field_k));
          } else {
            decompiledFrameRemainder0 = (null == kg.field_k);
          }
          if (decompiledFrameRemainder0) {
            if (!cb.field_l) {
              if (l.field_a >= um.field_h) {
                stackIn_17_0 = (l.field_a < br.field_a + um.field_h) ? 1 : 0;
              } else {
                stackIn_17_0 = 0;
              }
            } else {
              stackIn_17_0 = 0;
            }
            var2_int = stackIn_17_0;
            if (param1 == null) {
              l.field_a = 0;
            } else {
              if (cb.field_l) {
                l.field_a = um.field_h;
              } else {
                if (var2_int != 0) {
                  l.field_a = um.field_h;
                } else {
                  l.field_a = 0;
                }
              }
            }
            tf.field_Db = hl.field_a;
            bl.field_c = tn.field_z;
            if (param1 == null) {
              if (var2_int != 0) {
                cb.field_l = true;
              }
            } else {
              cb.field_l = false;
            }
          }
          kg.field_k = param1;
          if (!cb.field_l &&
            um.field_h > l.field_a &&
            wc.field_J) {
            l.field_a = 0;
            bl.field_c = tn.field_z;
            tf.field_Db = hl.field_a;
          }
          if (param0 != -16898) {
            ii.b((byte) -126);
          }
          if (cb.field_l &&
            ti.field_I == l.field_a) {
            l.field_a = 0;
            cb.field_l = false;
          }
          tn.field_z = -1;
          hl.field_a = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_42_0 = var2;
          stackIn_42_1 = new StringBuilder().append("ii.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(')').toString());
        }
    }

    final static int b(byte param0) {
        int var1 = 96 / ((param0 + 12) / 33);
        return pl.field_F;
    }

    final int b(long param0, boolean param1) {
        long var4 = this.a((byte) -64);
        if (param1) {
          field_b = (String) null;
          if (0L < var4) {
            vd.a(false, var4);
            return this.a(param0, true);
          }
          return this.a(param0, true);
        }
        if (0L >= var4) {
          return this.a(param0, true);
        }
        vd.a(false, var4);
        return this.a(param0, true);
    }

    final static void a(int param0, int param1) {
        ga var2 = ma.field_a;
        var2.b((byte) -35, param0);
        var2.a(126, 1);
        var2.a(-24, 0);
        if (param1 == -1) {
          return;
        }
        ii.a(64, (byte) 88, -76, (String) null, 34L);
    }

    static {
        field_b = "<br><br>";
    }
}
