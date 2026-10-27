/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi extends ah {
    static int field_r;
    static int field_o;
    static String field_n;
    static ff field_s;
    static int[] field_p;
    static int field_q;

    final static void a(int param0, byte param1, String param2) {
        try {
          if (param1 != 83) {
            field_q = -5;
          }
          ei.field_i = false;
          ni.field_F = false;
          if (be.field_b != null) {
            if (!be.field_b.field_G) {
              return;
            }
            boolean var3_int = true;
            if (8 != param0) {
            } else {
              param0 = 2;
              if (!eb.field_H) {
                param2 = fd.field_a;
              } else {
                param2 = fi.field_c;
              }
              dd.field_d.a(vk.field_v, (byte) 106);
            }
            if (param0 == 10) {
              ui.a(90);
              var3_int = false;
            }
            if (var3_int) {
              if (ni.field_F) {
                param2 = r.a(QuickChatPhraseDefinition.field_y, param1 - 146, new String[]{param2});
              }
              if (ha.field_a) {
                param2 = jl.field_l;
              }
              be.field_b.a(param2, -1, param0);
            }
            if (256 != param0) {
              if (param0 == 10) {
                return;
              }
              if (!eb.field_H) {
                dd.field_d.h((byte) -128);
                return;
              }
            }
          }
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "hi.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static uf c(boolean param0) {
        if (sl.field_d == null) {
          sl.field_d = new uf();
          sl.field_d.a(-31476, sb.field_a);
          sl.field_d.field_h = 7697781;
          sl.field_d.field_d = ke.field_c;
          sl.field_d.field_j = 5;
          sl.field_d.field_q = 14;
          sl.field_d.field_a = 2763306;
          sl.field_d.field_f = 6;
          sl.field_d.field_l = 0;
          sl.field_d.field_r = 4;
          if (!param0) {
            return sl.field_d;
          }
          return (uf) null;
        }
        if (!param0) {
          return sl.field_d;
        }
        return (uf) null;
    }

    public static void g(int param0) {
        field_s = null;
        field_n = null;
        field_p = null;
        if (param0 != 14) {
          hi.c(false);
        }
    }

    final String a(byte param0, String param1) {
        String stackIn_9_2 = null;
        try {
          if (this.a(-1, param1) == ob.field_a) {
            String stackIn_3_0 = eo.field_a;
            return stackIn_3_0;
          }
          int var3_int = -127 % ((param0 - 10) / 51);
          String stackIn_5_0 = ec.field_c;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var3;
          StringBuilder stackIn_8_1 = new StringBuilder().append("hi.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1) {
        if (param0 == 0) {
          return true;
        }
        if (~param0 != param1) {
          return false;
        }
        return true;
    }

    final static void d(boolean param0) {
        if (bk.field_r != null) {
          bk.field_r.a((byte) -126);
          if (!param0) {
            return;
          }
          field_q = -4;
          return;
        }
        if (param0) {
          field_q = -4;
          return;
        }
    }

    hi(ul param0) {
        super(param0);
    }

    final rf a(int param0, String param1) {
        String stackIn_14_2 = null;
        try {
          boolean stackIn_3_0 = !(null != cd.a(param0 ^ 0, param1));
          boolean var3_int = stackIn_3_0;
          if (!var3_int) {
            rf stackIn_6_0 = ob.field_a;
            return stackIn_6_0;
          }
          if (param0 != -1) {
            field_n = (String) null;
          }
          rf stackIn_10_0 = df.field_h;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var3;
          StringBuilder stackIn_13_1 = new StringBuilder().append("hi.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
        field_p = new int[8192];
        field_n = "Container destroyed - save your ship";
    }
}
