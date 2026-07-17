/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class hd extends um {
    static vl field_x;
    static int[] field_D;
    private boolean field_w;
    static ve field_t;
    static String field_B;
    static int field_q;
    static kl field_u;
    private cb field_A;
    static int field_v;
    static String field_z;
    private String field_y;
    static pf field_s;
    static oh field_r;

    hd(nn param0, nn param1) {
        super(param0);
        ((hd) this).field_w = false;
        ((hd) this).field_y = "";
        try {
            ((hd) this).field_A = new cb(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "hd.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static kh a(int param0, int param1, ah param2) {
        RuntimeException var3 = null;
        kh stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        kh stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (bg.a(-141, param1, param2)) {
              L1: {
                if (param0 == 1) {
                  break L1;
                } else {
                  field_B = null;
                  break L1;
                }
              }
              stackOut_5_0 = ai.b((byte) 126);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("hd.B(").append(param0).append(44).append(param1).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_6_0;
    }

    public static void g(int param0) {
        Object var2 = null;
        field_B = null;
        field_D = null;
        field_u = null;
        field_s = null;
        field_t = null;
        if (param0 > -54) {
          var2 = null;
          hd.a((String) null, 104, -6);
          field_z = null;
          field_r = null;
          field_x = null;
          return;
        } else {
          field_z = null;
          field_r = null;
          field_x = null;
          return;
        }
    }

    final static void a(String param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ci.field_x = param1;
              ko.field_s = 1;
              if (param2 == -308) {
                break L1;
              } else {
                field_B = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("hd.D(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static void a(hl param0, byte param1) {
        hl var4 = null;
        hl var5 = null;
        int var3 = TetraLink.field_J;
        try {
            var4 = (hl) (Object) param0.field_fb.c(false);
            hl var2 = var4;
            while (var4 != null) {
                var4.field_mb = 0;
                var4.field_Db = 0;
                var4.field_yb = 0;
                var4.field_R = 0;
                var5 = (hl) (Object) param0.field_fb.a((byte) -70);
                var5 = var5;
            }
            param0.field_R = 0;
            param0.field_Db = 0;
            param0.field_mb = 0;
            param0.field_yb = 0;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "hd.S(" + (param0 != null ? "{...}" : "null") + 44 + -104 + 41);
        }
    }

    final jk a(int param0, String param1) {
        rj var3 = null;
        RuntimeException var3_ref = null;
        jk stackIn_3_0 = null;
        jk stackIn_7_0 = null;
        jk stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        jk stackOut_2_0 = null;
        jk stackOut_6_0 = null;
        jk stackOut_11_0 = null;
        jk stackOut_10_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (((hd) this).field_A.a(param0 ^ param0, param1) == db.field_h) {
              stackOut_2_0 = db.field_h;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                if (param1.equals((Object) (Object) ((hd) this).field_y)) {
                  break L1;
                } else {
                  var3 = la.a(param1, param0);
                  if (var3.c(false)) {
                    ((hd) this).field_y = param1;
                    ((hd) this).field_w = var3.a(true);
                    break L1;
                  } else {
                    stackOut_6_0 = ug.field_cb;
                    stackIn_7_0 = stackOut_6_0;
                    return stackIn_7_0;
                  }
                }
              }
              L2: {
                if (((hd) this).field_w) {
                  stackOut_11_0 = pf.field_a;
                  stackIn_12_0 = stackOut_11_0;
                  break L2;
                } else {
                  stackOut_10_0 = db.field_h;
                  stackIn_12_0 = stackOut_10_0;
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("hd.C(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_12_0;
    }

    final String a(String param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        String stackOut_9_0 = null;
        String stackOut_7_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 26202) {
                break L1;
              } else {
                hd.g(92);
                break L1;
              }
            }
            if (((hd) this).field_A.a(0, param0) == db.field_h) {
              stackOut_4_0 = ((hd) this).field_A.a(param0, 26202);
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              if (((hd) this).a(0, param0) != db.field_h) {
                stackOut_9_0 = tb.field_h;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_7_0 = ha.field_c;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("hd.A(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 41);
        }
        return stackIn_10_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "Orb points: <%0>";
        field_z = "<%0> has entered another game.";
    }
}
