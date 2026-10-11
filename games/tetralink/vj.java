/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj extends mc {
    int[] field_r;
    static boolean field_q;
    static int field_n;
    static long field_o;
    static String field_p;

    public static void a(boolean param0) {
        field_p = null;
        if (param0) {
          vj.a(-1.4104137420654297f, true);
        }
    }

    final static byte[] a(boolean param0, byte param1, Object param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        jd var4 = null;
        byte[] stackIn_6_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == null) {
            return null;
          }
          if (param2 instanceof byte[]) {
            var3 = (byte[]) (param2);
            if (param0) {
              stackIn_8_0 = ak.a(-14074, var3);
              return stackIn_8_0;
            }
            stackIn_6_0 = var3;
            return stackIn_6_0;
          }
          if (param1 != -28) {
            vj.a(49);
          }
          if (!(param2 instanceof jd)) {
            throw new IllegalArgumentException();
          }
          var4 = (jd) (param2);
          stackIn_14_0 = var4.a(111);
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("vj.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static float a(float param0, boolean param1) {
        float var2_float = 0.0f;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        float stackIn_7_0 = 0.0f;
        float stackIn_12_0 = 0.0f;
        RuntimeException decompiledCaughtException = null;
        float var2_floatLifetime1;
        int var3Lifetime1;
        var4 = TetraLink.field_J;
        try {
          if (null == el.field_Nb) {
            el.field_Nb = new float[8];
            fm.field_b = new float[8];
            var2_float = 0.5f;
            for (var3 = 0; 8 > var3; var3++) {
              el.field_Nb[var3] = (float)(Math.random() * (double)var2_float);
              fm.field_b[var3] = (float)(2.0 * (Math.random() * 3.141592653589793));
              var2_float = var2_float / 2.0f;
            }
          }
          var2_floatLifetime1 = 0.0f;
          if (!param1) {
            stackIn_7_0 = 1.0860400199890137f;
            return stackIn_7_0;
          }
          var5 = 0;
          var3Lifetime1 = var5;
          while (var5 < 8) {
            var2_floatLifetime1 = (float)((double)var2_floatLifetime1 + (double)el.field_Nb[var5] * Math.sin((double)((float)(1 << var5) * param0 + fm.field_b[var5])));
            var5++;
          }
          stackIn_12_0 = var2_floatLifetime1;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var2), "vj.D(" + param0 + ',' + param1 + ')');
        }
    }

    final static byte[] a(int param0, String param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -73) {
            field_o = 126L;
          }
          stackIn_3_0 = bo.field_e.a("", param1, true);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("vj.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    private vj() throws Throwable {
        throw new Error();
    }

    final static void a(int param0) {
        ei.a(lk.q(13), 60);
        if (param0 != 1) {
          Object var2 = (Object) null;
          vj.a(false, (byte) 43, (Object) null);
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        if (param3 <= 85) {
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        if (param0 == 0) {
          if (ik.field_e != param2) {
            hg.field_c = true;
            ik.field_e = param2;
            nl.a(107, param1);
            if (param0 != 1) {
              if (((param0 == 2)) &&
                ((mc.field_f != param2))) {
                hg.field_c = true;
                mc.field_f = param2;
                nl.a(108, param1);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (param2 == me.field_b) {
                if (((param0 == 2)) &&
                  ((mc.field_f != param2))) {
                  hg.field_c = true;
                  mc.field_f = param2;
                  nl.a(108, param1);
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                me.field_b = param2;
                hg.field_c = true;
                nl.a(102, param1);
              }
            }
          } else {
            if (param0 != 1) {
              if (((param0 == 2)) &&
                ((mc.field_f != param2))) {
                hg.field_c = true;
                mc.field_f = param2;
                nl.a(108, param1);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (param2 == me.field_b) {
                if (((param0 == 2)) &&
                  ((mc.field_f != param2))) {
                  hg.field_c = true;
                  mc.field_f = param2;
                  nl.a(108, param1);
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                me.field_b = param2;
                hg.field_c = true;
                nl.a(102, param1);
              }
            }
          }
        } else {
          if (param0 != 1) {
            if (((param0 == 2)) &&
              ((mc.field_f != param2))) {
              hg.field_c = true;
              mc.field_f = param2;
              nl.a(108, param1);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (param2 == me.field_b) {
              if (((param0 == 2)) &&
                ((mc.field_f != param2))) {
                hg.field_c = true;
                mc.field_f = param2;
                nl.a(108, param1);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              me.field_b = param2;
              hg.field_c = true;
              nl.a(102, param1);
            }
          }
        }
        if ((decompiledFrameRemainder0) && (param0 == 2 &&
          mc.field_f != param2)) {
          hg.field_c = true;
          mc.field_f = param2;
          nl.a(108, param1);
        }

    }

    static {
        field_p = "Enter name of player to add to list";
    }
}
