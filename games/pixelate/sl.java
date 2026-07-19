/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sl {
    int field_a;
    static java.awt.Color field_i;
    int field_g;
    int field_m;
    int field_d;
    int field_f;
    static bd field_b;
    static int field_c;
    static int field_k;
    static String field_j;
    int field_h;
    static int field_l;
    static String field_e;

    abstract void a(int param0, int param1, int param2);

    abstract void a(int param0, int param1);

    public static void a(boolean param0) {
        if (param0) {
          field_e = (String) null;
          field_j = null;
          field_b = null;
          field_e = null;
          field_i = null;
          return;
        } else {
          field_j = null;
          field_b = null;
          field_e = null;
          field_i = null;
          return;
        }
    }

    final static ak a(int param0) {
        if (param0 != 1) {
            field_k = 60;
            return la.b((byte) -110);
        }
        return la.b((byte) -110);
    }

    final static el a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        el stackIn_3_0 = null;
        el stackIn_6_0 = null;
        el stackIn_15_0 = null;
        el stackIn_18_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        el stackOut_17_0 = null;
        el stackOut_14_0 = null;
        el stackOut_5_0 = null;
        el stackOut_2_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (var2_int != 0) {
              if (var2_int <= 63) {
                var3 = 0;
                var4 = -104 / ((param1 - -26) / 43);
                L1: while (true) {
                  if (var2_int > var3) {
                    L2: {
                      var5 = param0.charAt(var3);
                      if (45 != var5) {
                        if (-1 != oa.field_h.indexOf(var5)) {
                          break L2;
                        } else {
                          stackOut_17_0 = gm.field_f;
                          stackIn_18_0 = stackOut_17_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      } else {
                        L3: {
                          if (var3 == 0) {
                            break L3;
                          } else {
                            if (var3 != var2_int - 1) {
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                        stackOut_14_0 = gm.field_f;
                        stackIn_15_0 = stackOut_14_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                    var3++;
                    continue L1;
                  } else {
                    return null;
                  }
                }
              } else {
                stackOut_5_0 = mk.field_a;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = pd.field_Kb;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var2);
            stackOut_21_1 = new StringBuilder().append("sl.B(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L4;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0;
            } else {
              return stackIn_18_0;
            }
          }
        }
    }

    static {
        field_i = new java.awt.Color(10040319);
        field_c = 480;
        field_j = "Report <%0> for abuse";
        field_b = new bd();
        field_e = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
