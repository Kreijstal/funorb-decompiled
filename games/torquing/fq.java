/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fq extends jh {
    static dg field_F;
    int field_D;
    static byte[][] field_G;
    static boolean field_E;

    fq(gm param0) {
        super(param0.field_w, param0.field_k, param0.field_p, param0.field_o, (el) null, (ca) null);
        try {
            param0.a((byte) -83, 0, 0, this.field_o, this.field_p);
            this.field_D = 256;
            this.field_C = param0;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "fq.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public fq() {
        super(0, 0, 0, 0, (el) null, (ca) null);
        this.field_D = 256;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        t var5;
        if (0 == param0) {
          if (this.field_C != null) {
            if (this.field_D == 0) {
              return;
            } else {
              if (256 != this.field_D) {
                if (param1 > -7) {
                  return;
                } else {
                  var5 = new t(this.field_C.field_p, this.field_C.field_o);
                  tm.a((byte) 34, var5);
                  this.field_C.a(param0, (byte) -61, 0, 0);
                  r.a(122);
                  var5.e(param3 + this.field_w, this.field_k + param2, this.field_D);
                  return;
                }
              } else {
                this.field_C.a(param0, (byte) -70, param2 - -this.field_k, this.field_w + param3);
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static void g(byte param0) {
        field_G = (byte[][]) null;
        if (param0 > -64) {
            return;
        }
        field_F = null;
    }

    final static void a(boolean param0, int param1, gg param2, int param3) {
        try {
            if (param0) {
                field_F = (dg) null;
            }
            tb.field_l.a(param2, param1, on.field_c * param3 / 160);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "fq.L(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static sm[] a(la param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        sm[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (nd.a(param3, param0, -1, param2)) {
              L1: {
                if (param1 == -25960) {
                  break L1;
                } else {
                  fq.g((byte) -70);
                  break L1;
                }
              }
              stackIn_6_0 = rf.a((byte) 66);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("fq.I(");

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
          throw rb.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    final static boolean a(String param0, int param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        var4 = Torquing.field_u;
        try {
          L0: {
            try {
              L1: {
                if (!vh.field_i.startsWith("win")) {
                  stackIn_4_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L1;
                } else {
                  L2: {
                    if (param0.startsWith("http://")) {
                      break L2;
                    } else {
                      if (param0.startsWith("https://")) {
                        break L2;
                      } else {
                        stackIn_8_0 = 0;
                        decompiledRegionSelector0 = 1;
                        break L1;
                      }
                    }
                  }
                  var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                  var3 = param1;
                  L3: while (true) {
                    if (param0.length() <= var3) {
                      Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                      stackIn_16_0 = 1;
                      decompiledRegionSelector0 = 3;
                      break L1;
                    } else {
                      if ((var2.indexOf((int) param0.charAt(var3)) ^ -1) != 0) {
                        var3++;
                        continue L3;
                      } else {
                        stackIn_13_0 = 0;
                        decompiledRegionSelector0 = 2;
                        break L1;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              stackIn_18_0 = 0;
              return stackIn_18_0 != 0;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                decompiledRegionSelector1 = 1;
                break L0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  decompiledRegionSelector1 = 2;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var2_ref2);

            stackIn_21_1 = new StringBuilder().append("fq.J(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L4;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L4;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return stackIn_13_0 != 0;
            } else {
              return stackIn_16_0 != 0;
            }
          }
        }
    }

    static {
        field_E = false;
    }
}
