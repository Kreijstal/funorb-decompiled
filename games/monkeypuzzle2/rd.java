/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd extends wj {
    static char field_p;
    static te field_o;
    private rj field_n;

    final static le[] a(String param0, ad param1, int param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        le[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 0) {
                break L1;
              } else {
                rd.c(false);
                break L1;
              }
            }
            var4_int = param1.c(param3, (byte) -105);
            var5 = param1.a(param0, var4_int, -28459);
            stackIn_3_0 = tj.a(var5, param1, var4_int, (byte) -126);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("rd.E(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void e(int param0) {
        if (param0 != 10396) {
            field_p = 'ﾳ';
            field_o = null;
            return;
        }
        field_o = null;
    }

    final static ai a(int param0, ad param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        ai stackIn_5_0 = null;
        ai stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (wg.a(param2, param0, param1, -3)) {
              if (param3 == 1896) {
                stackIn_7_0 = ee.k(15090);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = (ai) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("rd.D(").append(param0).append(',');

            if (param1 == null) {
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
          throw la.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ai) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    rd(rj param0, rj param1) {
        super(param0);
        try {
            this.field_n = param1;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "rd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(int param0, String param1) {
        kf var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                var4 = (String) null;
                rd.a((String) null, (ad) null, 78, (String) null);
                break L1;
              }
            }
            L2: {
              if (!(this.field_n instanceof ag)) {
                break L2;
              } else {
                var3 = ((ag) ((Object) this.field_n)).a(-105);
                if (var3 == null) {
                  break L2;
                } else {
                  L3: {
                    if (var3.b(false) != wj.field_i) {
                      break L3;
                    } else {
                      if (param1.equals(this.field_n.field_s)) {
                        break L3;
                      } else {
                        stackIn_7_0 = ad.field_k;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                  stackIn_9_0 = var3.b((byte) 66);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            if (!param1.equals(this.field_n.field_s)) {
              stackIn_13_0 = ad.field_k;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("rd.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    final static void c(boolean param0) {
        Object var1 = null;
        Throwable var2 = null;
        String var3 = null;
        Throwable decompiledCaughtException = null;
        if (we.field_n == null) {
          if (param0) {
            var3 = (String) null;
            rd.a((String) null, (ad) null, -96, (String) null);
            return;
          } else {
            return;
          }
        } else {
          var1 = we.field_n;
          synchronized (var1) {
            L0: {
              we.field_n = null;
              break L0;
            }
          }
          L1: {
            if (!param0) {
              break L1;
            } else {
              var3 = (String) null;
              rd.a((String) null, (ad) null, -96, (String) null);
              break L1;
            }
          }
          return;
        }
    }

    final na a(String param0, int param1) {
        kf var3 = null;
        RuntimeException var3_ref = null;
        na stackIn_6_0 = null;
        na stackIn_9_0 = null;
        na stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_n instanceof ag) {
                var3 = ((ag) ((Object) this.field_n)).a(81);
                if (var3 == null) {
                  break L1;
                } else {
                  if (var3.b(false) != wj.field_i) {
                    stackIn_6_0 = ol.field_h;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            if (param1 == 3917) {
              L2: {
                if (!param0.equals(this.field_n.field_s)) {
                  stackIn_13_0 = ol.field_h;
                  break L2;
                } else {
                  stackIn_13_0 = wj.field_i;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_9_0 = (na) null;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3_ref);

            stackIn_16_1 = new StringBuilder().append("rd.B(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    static {
        field_o = new te(0, 2, 2, 1);
    }
}
