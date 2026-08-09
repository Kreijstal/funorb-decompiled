/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s {
    static String field_h;
    private boolean field_f;
    static int field_e;
    static bd field_d;
    static String field_a;
    private String field_c;
    static int field_g;
    static en field_b;

    final static void a(int param0, fd param1, int param2, int param3, kd param4, java.awt.Component param5, boolean param6, int param7) {
        try {
            ug.a(param3, param6, 10);
            uj.field_m = ug.a(param1, param5, 0, param0);
            eb.field_e = ug.a(param1, param5, 1, param2);
            oa.field_b = new wm();
            tm.field_v = param2;
            eb.field_e.a(oa.field_b);
            ha.field_w = param4;
            if (param7 >= -84) {
                java.awt.Component var9 = (java.awt.Component) null;
                s.a(-53, (fd) null, 23, -48, (kd) null, (java.awt.Component) null, false, -17);
            }
            ha.field_w.a(ga.field_b, true);
            uj.field_m.a(ha.field_w);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "s.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ')');
        }
    }

    final String a(int param0) {
        if (param0 != 16751324) {
            return (String) null;
        }
        return this.field_c;
    }

    s(String param0) {
        this(param0, false);
    }

    final boolean a(byte param0) {
        if (param0 != -80) {
            this.field_c = (String) null;
            return this.field_f;
        }
        return this.field_f;
    }

    final static String a(gb param0, String param1, int param2, String param3, String param4) {
        RuntimeException var5 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 >= 35) {
                break L1;
              } else {
                s.a(66, 36, 47, 70);
                break L1;
              }
            }
            if (!param0.a(-15879)) {
              stackIn_5_0 = (String) (param3);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              stackIn_7_0 = param4 + " - " + param0.b(122, param1) + "%";
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("s.E(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param4 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_11_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        field_d = null;
        field_a = null;
        field_h = null;
        if (param0) {
            String var2 = (String) null;
            s.a((gb) null, (String) null, 5, (String) null, (String) null);
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        bd var12 = null;
        bd var13 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var11 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (param1 == 65792) {
              var12 = hh.field_a[param0];
              var13 = var12;
              var5 = 0;
              var6 = param3 + param2 * 640;
              var7 = 0;
              L1: while (true) {
                if (var13.field_A <= var7) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var8 = 0;
                  L2: while (true) {
                    if (var13.field_z <= var8) {
                      var5 = var5 + var13.field_u;
                      var6 += 640;
                      var7++;
                      continue L1;
                    } else {
                      L3: {
                        var9 = var12.field_D[var8 + var5];
                        var10 = Math.max((var9 & 16751324) >> 274516528, Math.max((var9 & 65414) >> 1506417704, var9 & 255));
                        if (var10 > 8) {
                          o.field_n.field_f[var8 + var6] = 65792 * var10;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var8++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var4), "s.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    s(String param0, boolean param1) {
        RuntimeException var3 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_c = param0;
              if (null != this.field_c) {
                break L1;
              } else {
                this.field_c = "";
                break L1;
              }
            }
            L2: {
              stackIn_5_0 = this;

              if (!param1) {
                stackIn_6_0 = this;
                stackIn_6_1 = 0;
                break L2;
              } else {
                stackIn_6_0 = this;
                stackIn_6_1 = 1;
                break L2;
              }
            }
            ((s) (this)).field_f = stackIn_6_1 != 0;
            if (this.field_c.length() != 0) {
              break L0;
            } else {
              this.field_f = false;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("s.<init>(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    static {
        bd discarded$0 = new bd(160, 120);
        field_h = "Type your age in years";
        field_a = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
