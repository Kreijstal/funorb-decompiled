/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf extends q {
    static boolean field_k;
    static String field_j;
    static boolean field_i;

    final static void h(int param0) {
        sj.a(k.c(108), (byte) 110);
        if (param0 >= -24) {
            field_k = true;
        }
    }

    final lh a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        lh stackIn_4_0 = null;
        lh stackIn_9_0 = null;
        lh stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 != -257) {
              field_k = false;
            }
            var4 = (CharSequence) ((Object) param1);
            if (f.b((byte) -123, var4)) {
              var5 = (CharSequence) ((Object) param1);
              var3_int = ol.a(false, var5);
              if (var3_int > 0) {
                if (130 >= var3_int) {
                  stackIn_11_0 = kk.field_w;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
              stackIn_9_0 = si.field_m;
              decompiledRegionSelector0 = 1;
            } else {
              stackIn_4_0 = si.field_m;
              decompiledRegionSelector0 = 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = (RuntimeException) (var3);

          stackIn_14_1 = new StringBuilder().append("cf.D(").append(param0).append(',');

          if (param1 == null) {
            stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
            stackIn_15_2 = "null";
          } else {
            stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
            stackIn_15_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(')').toString());
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    public static void g(int param0) {
        field_j = null;
        if (param0 > -11) {
            field_j = (String) null;
        }
    }

    final String b(int param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(-257, param1) != si.field_m) {
            if (param0 != 422) {
              stackIn_6_0 = (String) null;
              decompiledRegionSelector0 = 1;
            } else {
              return null;
            }
          } else {
            stackIn_2_0 = sl.field_i;
            decompiledRegionSelector0 = 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = (RuntimeException) (var3);

          stackIn_10_1 = new StringBuilder().append("cf.A(").append(param0).append(',');

          if (param1 == null) {
            stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = "null";
          } else {
            stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(')').toString());
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_6_0;
        }
    }

    final static qi a(int param0, int param1) {
        qi var2 = new qi();
        k.field_e.a(-49, var2);
        int var3 = -104 / ((-51 - param1) / 44);
        re.b(-78, param0);
        return var2;
    }

    final static void d(byte param0) {
        me var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var2 = Geoblox.field_C;
        try {
          L0: {
            if (param0 < 8) {
              cf.c((byte) 121);
            }
            var1 = (me) ((Object) md.field_a.g(0));
            L2: while (var1 != null) {
              if (var1.field_k < 1.0f) {
                var1.field_k = var1.field_k + (0.03999999910593033f * var1.field_k + 0.00004999999873689376f);
              } else {
                if (var1.field_h != 1) {
                  el.field_o.a(var1.field_f, -73);
                  ue.field_f.a(-35, var1);
                } else {
                  el.field_o.a((byte) 127, var1.field_f);
                  ue.field_f.a(-35, var1);
                }
              }
              var1 = (me) ((Object) md.field_a.d(1));
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1_ref), "cf.F(" + param0 + ')');
        }
    }

    final static boolean c(byte param0) {
        int var2 = 0;
        eg var1 = null;
        RuntimeException var1_ref = null;
        int var3 = 0;
        eg var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Geoblox.field_C;
        try {
          L0: {
            if (param0 == -114) {
              var4 = (eg) ((Object) sl.field_k.g(0));
              var1 = var4;
              if (var1 != null) {
                for (var2 = 0; var1.field_f > var2; var2++) {
                  if (null != var4.field_n[var2]) {
                    if (var4.field_n[var2].field_a == 0) {
                      stackIn_13_0 = 0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                  if (var4.field_i[var2] != null) {
                    if (var4.field_i[var2].field_a == 0) {
                      stackIn_18_0 = 0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  }
                }
                stackIn_21_0 = 1;
                decompiledRegionSelector0 = 4;
                break L0;
              } else {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
              }
            } else {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1_ref), "cf.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0 != 0;
              } else {
                return stackIn_21_0 != 0;
              }
            }
          }
        }
    }

    cf(dj param0) {
        super(param0);
    }

    static {
        field_j = "Restart tutorial";
    }
}
