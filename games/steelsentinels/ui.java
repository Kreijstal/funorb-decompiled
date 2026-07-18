/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui extends ug {
    static gk[] field_V;
    int field_R;
    static boolean field_T;
    static u field_U;
    static String field_W;
    static String field_S;
    static boolean field_G;

    public static void h() {
        field_U = null;
        field_V = null;
        field_W = null;
        field_S = null;
    }

    final static String a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_16_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_15_0 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var9 = SteelSentinels.field_G;
        try {
          if (param1 != null) {
            var2_int = 0;
            var3 = param1.length();
            L0: while (true) {
              L1: {
                if (var3 <= var2_int) {
                  break L1;
                } else {
                  int discarded$3 = -33;
                  if (!jd.a(param1.charAt(var2_int))) {
                    break L1;
                  } else {
                    var2_int++;
                    continue L0;
                  }
                }
              }
              L2: while (true) {
                L3: {
                  if (var2_int >= var3) {
                    break L3;
                  } else {
                    int discarded$4 = -33;
                    if (!jd.a(param1.charAt(-1 + var3))) {
                      break L3;
                    } else {
                      var3--;
                      continue L2;
                    }
                  }
                }
                var4 = var3 - var2_int;
                if (var4 >= 1) {
                  if (var4 <= 12) {
                    var5 = new StringBuilder(var4);
                    var6 = var2_int;
                    L4: while (true) {
                      if (var3 <= var6) {
                        if (0 != var5.length()) {
                          return var5.toString();
                        } else {
                          return null;
                        }
                      } else {
                        L5: {
                          var7 = param1.charAt(var6);
                          if (!qh.a((byte) -30, (char) var7)) {
                            var6++;
                            break L5;
                          } else {
                            var8 = sg.a((byte) 115, (char) var7);
                            if (var8 == 0) {
                              var6++;
                              break L5;
                            } else {
                              StringBuilder discarded$5 = var5.append((char) var8);
                              var6++;
                              break L5;
                            }
                          }
                        }
                        var6++;
                        continue L4;
                      }
                    }
                  } else {
                    stackOut_15_0 = null;
                    stackIn_16_0 = stackOut_15_0;
                    return (String) (Object) stackIn_16_0;
                  }
                } else {
                  return null;
                }
              }
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var2;
            stackOut_31_1 = new StringBuilder().append("ui.CA(").append(1).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L6;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L6;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ')');
        }
    }

    ui(lh param0) {
        super(param0.field_o, param0.field_z, param0.field_x, param0.field_E, (qk) null, (tn) null);
        try {
            param0.a(0, (byte) -101, 0, ((ui) this).field_x, ((ui) this).field_E);
            ((ui) this).field_J = param0;
            ((ui) this).field_R = 256;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "ui.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        wk var6 = null;
        if (param3 == 0) {
          if (((ui) this).field_J != null) {
            if (0 != ((ui) this).field_R) {
              if (((ui) this).field_R == 256) {
                ((ui) this).field_J.a(param0 - -((ui) this).field_z, (byte) -117, param2 - -((ui) this).field_o, param3);
                return;
              } else {
                var6 = new wk(((ui) this).field_J.field_x, ((ui) this).field_J.field_E);
                if (param1 > -99) {
                  return;
                } else {
                  q.a(var6, (byte) -90);
                  ((ui) this).field_J.a(0, (byte) -128, 0, param3);
                  tk.f((byte) 114);
                  var6.b(((ui) this).field_o + param2, ((ui) this).field_z + param0, ((ui) this).field_R);
                  return;
                }
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static int a(boolean param0) {
        return al.field_d;
    }

    final static void a() {
        kj var2 = mm.field_g;
        var2.a(11, (byte) -117);
        var2.a((byte) 111, 1);
        var2.a((byte) 119, 0);
    }

    public ui() {
        super(0, 0, 0, 0, (qk) null, (tn) null);
        ((ui) this).field_R = 256;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_W = "<%0> is not on your ignore list.";
        field_S = "<%0>:<%1><%2>";
        field_G = false;
    }
}
