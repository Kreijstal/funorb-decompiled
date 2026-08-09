/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        this.field_w = false;
        this.field_y = "";
        try {
            this.field_A = new cb(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "hd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static kh a(int param0, int param1, ah param2) {
        RuntimeException var3 = null;
        kh stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (bg.a(-141, param1, param2)) {
              L1: {
                if (param0 == 1) {
                  break L1;
                } else {
                  field_B = (String) null;
                  break L1;
                }
              }
              stackIn_6_0 = ai.b((byte) 126);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("hd.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    public static void g(int param0) {
        String var2;
        field_B = null;
        field_D = null;
        field_u = null;
        field_s = null;
        field_t = null;
        if (param0 > -54) {
          var2 = (String) null;
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
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ci.field_x = param1;
              ko.field_s = 1;
              if (param2 == -308) {
                break L1;
              } else {
                field_B = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("hd.D(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(hl param0, byte param1) {
        hl var4 = null;
        hl var5 = null;
        int var3 = TetraLink.field_J;
        try {
            if (param1 != -104) {
                field_x = (vl) null;
            }
            var4 = (hl) ((Object) param0.field_fb.c(false));
            hl var2 = var4;
            while (var4 != null) {
                var4.field_mb = 0;
                var4.field_Db = 0;
                var4.field_yb = 0;
                var4.field_R = 0;
                var5 = (hl) ((Object) param0.field_fb.a((byte) -70));
                var5 = var5;
            }
            param0.field_R = 0;
            param0.field_Db = 0;
            param0.field_mb = 0;
            param0.field_yb = 0;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "hd.S(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final jk a(int param0, String param1) {
        rj var3 = null;
        RuntimeException var3_ref = null;
        jk stackIn_3_0 = null;
        jk stackIn_7_0 = null;
        jk stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_A.a(param0 ^ param0, param1) == db.field_h) {
              stackIn_3_0 = db.field_h;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1.equals(this.field_y)) {
                  break L1;
                } else {
                  var3 = la.a(param1, param0 ^ 0);
                  if (var3.c(false)) {
                    this.field_y = param1;
                    this.field_w = var3.a(true);
                    break L1;
                  } else {
                    stackIn_7_0 = ug.field_cb;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              L2: {
                if (this.field_w) {
                  stackIn_12_0 = pf.field_a;
                  break L2;
                } else {
                  stackIn_12_0 = db.field_h;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("hd.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    final String a(String param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
            if (this.field_A.a(0, param0) == db.field_h) {
              stackIn_5_0 = this.field_A.a(param0, 26202);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (this.a(0, param0) != db.field_h) {
                stackIn_10_0 = tb.field_h;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_8_0 = ha.field_c;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("hd.A(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    static {
        field_B = "Orb points: <%0>";
        field_z = "<%0> has entered another game.";
    }
}
