/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg {
    static int field_b;
    static sg[] field_a;

    final static void a(boolean param0, int param1) {
        int var3 = 0;
        jl var4 = null;
        oi var5 = null;
        qj stackIn_9_0 = null;
        boolean stackIn_10_1 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Transmogrify.field_A ? 1 : 0;
        try {
          var4 = (jl) (ll.field_T.a((byte) -95));
          while (var4 != null) {
            sj.a(-7812, param1, var4);
            var4 = (jl) (ll.field_T.a(true));
          }
          var5 = (oi) (qd.field_d.a((byte) -95));
          if (param0) {
            eg.a((byte) 21);
          }
          while (var5 != null) {
            de.a(var5, param1, 2);
            stackIn_9_0 = qd.field_d;
            stackIn_10_1 = !(param0);
            var5 = (oi) (((qj) (Object) stackIn_9_0).a(stackIn_10_1));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var2), "eg.D(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 <= 47) {
          byte[] var2 = (byte[]) null;
          eg.a(-121, (byte[]) null);
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static void a(int param0) {
        vi.field_e = wh.a((byte) -122);
        ci.field_f = new da();
        wl.a(true, true, 170);
        if (param0 >= 54) {
          return;
        }
        eg.a((byte) -57);
    }

    final static void a(String param0, byte param1) {
        int stackIn_16_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = Transmogrify.field_A ? 1 : 0;
        try {
          if (rd.field_f == -1 &&
            el.field_d == -1) {
            el.field_d = bk.field_a;
            rd.field_f = oa.field_j;
          }
          boolean decompiledFrameRemainder0 = true;
          da.field_y = da.field_y + 1;
          if (param0 != null) {
            decompiledFrameRemainder0 = !(param0.equals(tj.field_v));
          } else {
            decompiledFrameRemainder0 = (tj.field_v == null);
          }
          if (decompiledFrameRemainder0) {
            if (!lk.field_c) {
              if (da.field_y >= bk.field_d) {
                stackIn_16_0 = (bk.field_d + ek.field_g > da.field_y) ? 1 : 0;
              } else {
                stackIn_16_0 = 0;
              }
            } else {
              stackIn_16_0 = 0;
            }
            var2_int = stackIn_16_0;
            if (param0 == null) {
              da.field_y = 0;
            } else {
              if (lk.field_c) {
                da.field_y = bk.field_d;
              } else {
                if (var2_int != 0) {
                  da.field_y = bk.field_d;
                } else {
                  da.field_y = 0;
                }
              }
            }
            if (param0 != null) {
              lk.field_c = false;
            } else {
              if (var2_int != 0) {
                lk.field_c = true;
              }
            }
            qi.field_d = rd.field_f;
            og.field_e = el.field_d;
          }
          tj.field_v = param0;
          if (param1 <= 121) {
            field_b = -62;
          }
          if (!lk.field_c &&
            da.field_y < bk.field_d &&
            tl.field_a) {
            og.field_e = el.field_d;
            qi.field_d = rd.field_f;
            da.field_y = 0;
          }
          rd.field_f = -1;
          if (lk.field_c &&
            pi.field_j == da.field_y) {
            da.field_y = 0;
            lk.field_c = false;
          }
          el.field_d = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_43_0 = var2;
          stackIn_43_1 = new StringBuilder().append("eg.B(");
          if (param0 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String a(int param0, byte[] param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 82) {
            eg.a((byte) -117);
          }
          stackIn_3_0 = cc.a(0, 15923, param1.length, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("eg.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
    }
}
