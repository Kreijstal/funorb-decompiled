/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue {
    static dd field_c;
    static String field_d;
    static ko field_b;
    static int field_a;
    static int field_e;

    final static void a(byte param0, String param1) {
        int stackIn_18_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          jo.field_J = jo.field_J + 1;
          if (param0 != 70) {
            ue.a((byte) 11);
          }
          if (ci.field_i == -1 &&
            -1 == gg.field_g) {
            gg.field_g = gg.field_f;
            ci.field_i = wn.field_i;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param1 == null) {
            decompiledFrameRemainder0 = (pj.field_I == null);
          } else {
            decompiledFrameRemainder0 = !(param1.equals(pj.field_I));
          }
          if (decompiledFrameRemainder0) {
            if (!nn.field_d) {
              if (wp.field_c <= jo.field_J) {
                stackIn_18_0 = (jo.field_J < ji.field_d + wp.field_c) ? 1 : 0;
              } else {
                stackIn_18_0 = 0;
              }
            } else {
              stackIn_18_0 = 0;
            }
            boolean decompiledFrameRemainder1 = true;
            var2_int = stackIn_18_0;
            if (param1 != null) {
              if (nn.field_d) {
                jo.field_J = wp.field_c;
                decompiledFrameRemainder1 = false;
              }
              else {
                if (var2_int != 0) {
                  jo.field_J = wp.field_c;
                  decompiledFrameRemainder1 = false;
                }
              }
            }
            if (decompiledFrameRemainder1) {
              jo.field_J = 0;
            }
            if (param1 == null) {
              if (var2_int != 0) {
                nn.field_d = true;
              }
            } else {
              nn.field_d = false;
            }
            id.field_b = ci.field_i;
            ne.field_n = gg.field_g;
          }
          pj.field_I = param1;
          if (!nn.field_d &&
            jo.field_J < wp.field_c &&
            re.field_c) {
            ne.field_n = gg.field_g;
            id.field_b = ci.field_i;
            jo.field_J = 0;
          }
          if (nn.field_d &&
            la.field_e == jo.field_J) {
            nn.field_d = false;
            jo.field_J = 0;
          }
          ci.field_i = -1;
          gg.field_g = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_41_0 = var2;
          stackIn_41_1 = new StringBuilder().append("ue.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        if (wd.field_Ub != null) {
          wd.field_Ub.h(11741);
        }
        if (null != of.field_Nb) {
          of.field_Nb.k(0);
          ja.a(param0);
          return;
        }
        ja.a(param0);
    }

    final static boolean a(int param0) {
        if (param0 == 11) {
          bi.field_f = true;
          ia.field_k = rl.a((byte) -110) + 15000L;
          return 11 == fk.field_ab ? true : false;
        }
        return false;
    }

    public static void b(boolean param0) {
        field_c = null;
        field_d = null;
        field_b = null;
        if (param0) {
          String var2 = (String) null;
          ue.a((byte) 106, (String) null);
        }
    }

    final static boolean a(byte param0) {
        if (param0 > -70) {
          field_e = -55;
          if (sf.field_y < 20) {
            return true;
          }
          if (!gg.a(true)) {
            return true;
          }
          if (0 >= no.field_l) {
            return false;
          }
          if (!uc.a(-128)) {
            return true;
          }
          return false;
        }
        if (sf.field_y < 20) {
          return true;
        }
        if (!gg.a(true)) {
          return true;
        }
        if (0 >= no.field_l) {
          return false;
        }
        if (!uc.a(-128)) {
          return true;
        }
        return false;
    }

    static {
        field_d = "Next";
        field_e = 2048;
        field_b = new ko();
    }
}
