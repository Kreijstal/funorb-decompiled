/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa extends bh {
    int field_v;
    static String field_n;
    int field_s;
    ck field_o;
    int field_D;
    static int field_p;
    static String field_A;
    String field_r;
    int field_z;
    static ud field_w;
    int field_u;
    int field_y;
    static boolean field_x;
    boolean field_q;
    static vj field_C;
    static String field_B;
    int field_t;

    public static void c(byte param0) {
        field_n = null;
        field_C = null;
        field_A = null;
        field_w = null;
        field_B = null;
        if (param0 >= -65) {
          sa.c((byte) -48);
        }
    }

    final static void a(String param0, int param1) {
        int stackIn_17_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = client.field_A ? 1 : 0;
        try {
          jc.field_g = jc.field_g + 1;
          if (field_p == -1 &&
            u.field_e == -1) {
            u.field_e = pm.field_f;
            field_p = bh.field_g;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param0 != null) {
            decompiledFrameRemainder0 = !(param0.equals(k.field_e));
          } else {
            decompiledFrameRemainder0 = (null == k.field_e);
          }
          if (decompiledFrameRemainder0) {
            if (!wd.field_d) {
              if (jc.field_g >= o.field_b) {
                stackIn_17_0 = (o.field_b + he.field_gb > jc.field_g) ? 1 : 0;
              } else {
                stackIn_17_0 = 0;
              }
            } else {
              stackIn_17_0 = 0;
            }
            var2_int = stackIn_17_0;
            if (param0 == null) {
              jc.field_g = 0;
            } else {
              if (wd.field_d) {
                jc.field_g = o.field_b;
              } else {
                if (var2_int == 0) {
                  jc.field_g = 0;
                } else {
                  jc.field_g = o.field_b;
                }
              }
            }
            if (param0 != null) {
              wd.field_d = false;
            } else {
              if (var2_int != 0) {
                wd.field_d = true;
              }
            }
            dh.field_e = u.field_e;
            pa.field_Z = field_p;
          }
          k.field_e = param0;
          if (!wd.field_d &&
            o.field_b > jc.field_g &&
            pm.field_b) {
            dh.field_e = u.field_e;
            pa.field_Z = field_p;
            jc.field_g = 0;
          }
          field_p = param1;
          u.field_e = -1;
          if (wd.field_d) {
            if (ve.field_hc != jc.field_g) {
              return;
            }
            jc.field_g = 0;
            wd.field_d = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_42_0 = var2;
          stackIn_42_1 = new StringBuilder().append("sa.B(");
          if (param0 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param1).append(')').toString());
        }
    }

    sa(boolean param0, int param1, int param2, int param3, int[] param4, int param5, int param6, String[] param7) {
        RuntimeException var9 = null;
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_t = param3;
          this.field_u = param1;
          this.field_y = param6;
          stackIn_4_1 = (param0);
          this.field_q = stackIn_4_1;
          this.field_D = param2;
          this.field_r = hf.a(param7.length, 0, (CharSequence[]) ((Object) param7), (byte) 74);
          if (param4 == null) {
            this.field_s = param5;
            return;
          }
          if (param5 >= param4.length) {
            param5 = param4.length - 1;
          }
          this.field_s = param4[param5];
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_12_0 = var9;
          stackIn_12_1 = new StringBuilder().append("sa.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_n = "OVER <%0>";
        field_p = -1;
        field_A = "members-only content";
        field_C = new vj();
    }
}
