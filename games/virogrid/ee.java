/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ee {
    static String field_f;
    static String field_b;
    static km field_e;
    static il field_a;
    static wl field_c;
    static String field_d;

    final static boolean a(int param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -10 / ((param0 + 24) / 60);
          stackIn_1_0 = h.a(-4623, false, param1);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("ee.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        if (kf.field_e == 0 - of.field_a) {
          kf.field_e = kf.field_e + 1;
          if (param0) {
            return;
          }
          field_a = (il) null;
          return;
        }
        if (-of.field_a + 250 == kf.field_e) {
          kf.field_e = kf.field_e + 1;
          if (param0) {
            return;
          }
          field_a = (il) null;
          return;
        }
        kf.field_e = kf.field_e + 1;
        if (param0) {
          return;
        }
        field_a = (il) null;
    }

    final static void b(boolean param0) {
        boolean stackIn_9_0 = false;
        boolean stackIn_15_0 = false;
        boolean stackIn_23_0 = false;
        boolean stackIn_29_0 = false;
        boolean stackIn_38_0 = false;
        boolean stackIn_44_0 = false;
        boolean stackIn_52_0 = false;
        boolean stackIn_58_0 = false;
        if (an.field_b) {
          return;
        }
        if (wl.field_e != null) {
          if (!wl.field_e.field_l) {
            if (!param0) {
              if (an.field_b) {
                stackIn_52_0 = ((1 & rn.field_c) == 0);
                b.field_Db = stackIn_52_0;
                ge.b(18887);
                wn.a((byte) 96);
              }
            } else {
              field_c = (wl) null;
              if (an.field_b) {
                stackIn_58_0 = ((1 & rn.field_c) == 0);
                b.field_Db = stackIn_58_0;
                ge.b(18887);
                wn.a((byte) 96);
              }
            }
          } else {
            rn.field_c = rn.field_c | wl.field_e.field_g;
            an.field_b = true;
            wl.field_e = null;
            if (!param0) {
              if (an.field_b) {
                stackIn_38_0 = ((1 & rn.field_c) == 0);
                b.field_Db = stackIn_38_0;
                ge.b(18887);
                wn.a((byte) 96);
              }
            } else {
              field_c = (wl) null;
              if (an.field_b) {
                stackIn_44_0 = ((1 & rn.field_c) == 0);
                b.field_Db = stackIn_44_0;
                ge.b(18887);
                wn.a((byte) 96);
              }
            }
          }
        } else {
          wl.field_e = m.a((byte) 106, 4);
          if (!wl.field_e.field_l) {
            if (!param0) {
              if (an.field_b) {
                stackIn_9_0 = ((1 & rn.field_c) == 0);
                b.field_Db = stackIn_9_0;
                ge.b(18887);
                wn.a((byte) 96);
              }
            } else {
              field_c = (wl) null;
              if (an.field_b) {
                stackIn_15_0 = ((1 & rn.field_c) == 0);
                b.field_Db = stackIn_15_0;
                ge.b(18887);
                wn.a((byte) 96);
              }
            }
          } else {
            rn.field_c = rn.field_c | wl.field_e.field_g;
            an.field_b = true;
            wl.field_e = null;
            if (!param0) {
              if (an.field_b) {
                stackIn_29_0 = ((1 & rn.field_c) == 0);
                b.field_Db = stackIn_29_0;
                ge.b(18887);
                wn.a((byte) 96);
              }
            } else {
              field_c = (wl) null;
              if (an.field_b) {
                stackIn_23_0 = ((1 & rn.field_c) == 0);
                b.field_Db = stackIn_23_0;
                ge.b(18887);
                wn.a((byte) 96);
              }
            }
          }
        }
    }

    final static void a(byte param0) {
        if (param0 < 15) {
          return;
        }
        fi.field_t.b(new jl(), (byte) -53);
    }

    public static void b(byte param0) {
        field_b = null;
        field_c = null;
        field_d = null;
        field_a = null;
        field_f = null;
        if (param0 <= 53) {
          return;
        }
        field_e = null;
    }

    static {
        field_f = "<%0> cannot move";
        field_b = "These are your pieces<br>Click to select one";
        field_d = "Loading sound effects";
        field_c = new wl();
    }
}
