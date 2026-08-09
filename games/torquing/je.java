/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je implements el {
    private int field_d;
    private int field_b;
    static la field_f;
    static String field_i;
    static int field_a;
    static th field_g;
    static t field_e;
    private uc field_h;
    static boolean field_c;

    public final void a(int param0, int param1, int param2, boolean param3, gm param4) {
        int stackIn_7_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Torquing.field_u;
        try {
          L0: {
            if (param0 > 89) {
              L1: {
                L2: {
                  if (param4.field_s) {
                    break L2;
                  } else {
                    if (param4.g(2)) {
                      break L2;
                    } else {
                      stackIn_7_0 = 2188450;
                      break L1;
                    }
                  }
                }
                stackIn_7_0 = 3249872;
                break L1;
              }
              var6_int = stackIn_7_0;
              this.field_h.a("<u=" + Integer.toString(var6_int, 16) + ">" + param4.field_m + "</u>", param4.field_w + param2, param4.field_k + param1, param4.field_p, param4.field_o, var6_int, -1, this.field_b, this.field_d, this.field_h.field_t + this.field_h.field_x);
              if (param4.g(2)) {
                L3: {
                  var7 = this.field_h.a(param4.field_m);
                  var8 = this.field_h.field_x + this.field_h.field_t;
                  var9 = param4.field_w + param2;
                  var10 = param4.field_k + param1;
                  if (this.field_b != 2) {
                    if (1 != this.field_b) {
                      break L3;
                    } else {
                      var9 = var9 + (-var7 + param4.field_p >> -702667263);
                      break L3;
                    }
                  } else {
                    var9 = var9 + (param4.field_p + -var7);
                    break L3;
                  }
                }
                L4: {
                  if (this.field_d != 2) {
                    if (1 == this.field_d) {
                      var10 = var10 + (param4.field_o - var8 >> 1343540225);
                      break L4;
                    } else {
                      break L4;
                    }
                  } else {
                    var10 = var10 + (-var8 + param4.field_o);
                    break L4;
                  }
                }
                he.a(-2 + var9, var8, var10 + 2, 2, 4 + var7);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var6);

            stackIn_22_1 = new StringBuilder().append("je.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void b(byte param0) {
        field_e = null;
        field_g = null;
        int var1 = 30 % ((30 - param0) / 35);
        field_i = null;
        field_f = null;
    }

    final static kh a(la param0, String param1, String param2, byte param3) {
        rm var4 = null;
        RuntimeException var4_ref = null;
        Object stackIn_4_0 = null;
        kh stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = rm.a(param0, param1, param2);
              if (param3 <= -116) {
                break L1;
              } else {
                field_a = -35;
                break L1;
              }
            }
            if (var4 != null) {
              stackIn_6_0 = new kh(var4);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4_ref);

            stackIn_9_1 = new StringBuilder().append("je.D(");

            if (param0 == null) {
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
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_10_0), stackIn_16_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (kh) ((Object) stackIn_4_0);
        } else {
          return stackIn_6_0;
        }
    }

    final static void a(byte param0, long[] param1) {
        ii var2 = null;
        RuntimeException var2_ref = null;
        String var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (lc.field_z >= 1024) {
                break L1;
              } else {
                L2: {
                  var2 = (ii) ((Object) bp.field_a.a((byte) 98));
                  if (var2 != null) {
                    break L2;
                  } else {
                    var2 = new ii();
                    break L2;
                  }
                }
                var2.field_l = param1;
                bd.field_s.a((byte) 54, var2);
                lc.field_z = lc.field_z + 1;
                break L1;
              }
            }
            if (param0 == -43) {
              break L0;
            } else {
              var3 = (String) null;
              je.a((la) null, (String) null, (String) null, (byte) 82);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2_ref);

            stackIn_9_1 = new StringBuilder().append("je.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final static pp a(int param0, int param1, vh param2, int param3, int param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        pp var7 = null;
        java.awt.Frame var8 = null;
        pp stackIn_5_0 = null;
        pp stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var8 = jj.a(param2, param1, param0, 0, param3, param4);
            var6 = var8;
            if (var8 != null) {
              if (param5 <= -9) {
                var7 = new pp();
                var7.field_d = var8;
                var7.field_d.add((java.awt.Component) ((Object) var7));
                var7.setBounds(0, 0, param0, param1);
                var7.addFocusListener(var7);
                var7.requestFocus();
                stackIn_7_0 = (pp) (var7);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_5_0 = (pp) null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var6_ref);

            stackIn_10_1 = new StringBuilder().append("je.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    final static boolean a(byte param0) {
        if (param0 < 40) {
            field_a = -119;
            return kb.field_h;
        }
        return kb.field_h;
    }

    public je() {
        this.field_b = 1;
        this.field_d = 1;
        this.field_h = dg.field_e;
    }

    je(uc param0, int param1, int param2) {
        try {
            this.field_d = param2;
            this.field_h = param0;
            this.field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "je.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_i = "Shield<br>Protects from one bomb";
    }
}
