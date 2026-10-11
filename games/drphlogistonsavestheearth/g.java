/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g extends ei {
    static boolean[] field_p;
    static vd field_t;
    static int[] field_s;
    static String field_r;
    static he[] field_q;

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(8192, param1) == u.field_b) {
            stackIn_2_0 = jf.field_kb;
            return stackIn_2_0;
          }
          if (param0 > 47) {
            return null;
          }
          field_t = (vd) null;
          stackIn_6_0 = null;
          return (String) (stackIn_6_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("g.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static boolean a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6) {
        boolean stackIn_8_0 = false;
        if (param1 > -32) {
          field_t = (vd) null;
        }
        stackIn_8_0 = (param4 <= param6) && (param0 + param4 > param6) && (param5 >= param3) && (param3 + param2 > param5);
        return stackIn_8_0;
    }

    final static void a(String param0, int param1) {
        int stackIn_18_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (gl.field_c == -1 &&
            oc.field_B == -1) {
            oc.field_B = ob.field_g;
            gl.field_c = ck.field_c;
          }
          boolean decompiledFrameRemainder0 = true;
          dd.field_l = dd.field_l + 1;
          if (param0 != null) {
            decompiledFrameRemainder0 = !(param0.equals(ie.field_C));
          } else {
            decompiledFrameRemainder0 = (ie.field_C == null);
          }
          if (decompiledFrameRemainder0) {
            if (!em.field_c) {
              if (dd.field_l >= qe.field_c) {
                stackIn_18_0 = (je.field_j + qe.field_c > dd.field_l) ? 1 : 0;
              } else {
                stackIn_18_0 = 0;
              }
            } else {
              stackIn_18_0 = 0;
            }
            boolean decompiledFrameRemainder1 = true;
            var2_int = stackIn_18_0;
            if (param0 != null) {
              if (em.field_c) {
                dd.field_l = qe.field_c;
                decompiledFrameRemainder1 = false;
              }
              else {
                if (var2_int != 0) {
                  dd.field_l = qe.field_c;
                  decompiledFrameRemainder1 = false;
                }
              }
            }
            if (decompiledFrameRemainder1) {
              dd.field_l = 0;
            }
            oh.field_e = gl.field_c;
            pi.field_Q = oc.field_B;
            if (param0 != null) {
              em.field_c = false;
            } else {
              if (var2_int != 0) {
                em.field_c = true;
              }
            }
          }
          ie.field_C = param0;
          if (param1 != 0) {
            return;
          }
          if (!em.field_c &&
            dd.field_l < qe.field_c &&
            df.field_o) {
            oh.field_e = gl.field_c;
            pi.field_Q = oc.field_B;
            dd.field_l = 0;
          }
          gl.field_c = -1;
          if (em.field_c &&
            dd.field_l == cd.field_d) {
            dd.field_l = 0;
            em.field_c = false;
          }
          oc.field_B = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_43_0 = var2;
          stackIn_43_1 = new StringBuilder().append("g.E(");
          if (param0 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean b(byte param0, String param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var2_int = param1.charAt(0);
          for (var3 = 1; var3 < param1.length(); var3++) {
            if (param1.charAt(var3) != var2_int) {
              return false;
            }
          }
          if (param0 > 94) {
            return true;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("g.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final vh a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        vh stackIn_2_0 = null;
        vh stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param1);
          if (!jf.a(var4, param0 - 640)) {
            stackIn_2_0 = u.field_b;
            return stackIn_2_0;
          }
          if (param0 != 8192) {
            field_s = (int[]) null;
          }
          var5 = (CharSequence) ((Object) param1);
          var3_int = hh.a(10, var5);
          if (var3_int > 0 &&
            var3_int <= 130) {
            return ce.field_e;
          }
          stackIn_9_0 = u.field_b;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("g.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        if (!param0) {
          g.a(-14, (byte) -108, 98, -109, -122, -119, -13);
        }
        field_p = null;
        field_q = null;
        field_s = null;
        field_r = null;
        field_t = null;
    }

    g(kl param0) {
        super(param0);
    }

    static {
        field_p = new boolean[64];
        field_s = new int[]{64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 128, 64, 64, 64, 64, 64, 64, 16, 10, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 64, 64, 64, 64, 0, 128, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 64, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16, 10, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16};
        field_t = new vd();
    }
}
