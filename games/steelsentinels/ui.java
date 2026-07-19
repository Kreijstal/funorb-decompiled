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

    public static void h(int param0) {
        String discarded$2 = null;
        CharSequence var2 = null;
        field_U = null;
        field_V = null;
        if (param0 != -13) {
          var2 = (CharSequence) null;
          discarded$2 = ui.a(20, (CharSequence) null);
          field_W = null;
          field_S = null;
          return;
        } else {
          field_W = null;
          field_S = null;
          return;
        }
    }

    final static String a(int param0, CharSequence param1) {
        StringBuilder discarded$1 = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_16_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_15_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var9 = SteelSentinels.field_G;
        try {
          L0: {
            if (param1 != null) {
              var2_int = 0;
              var3 = param1.length();
              L1: while (true) {
                L2: {
                  if (var3 <= var2_int) {
                    break L2;
                  } else {
                    if (!jd.a(param1.charAt(var2_int), -33)) {
                      break L2;
                    } else {
                      var2_int++;
                      continue L1;
                    }
                  }
                }
                L3: while (true) {
                  L4: {
                    if (var2_int >= var3) {
                      break L4;
                    } else {
                      if (!jd.a(param1.charAt(-1 + var3), -33)) {
                        break L4;
                      } else {
                        var3--;
                        continue L3;
                      }
                    }
                  }
                  var4 = var3 - var2_int;
                  if (var4 >= param0) {
                    if ((var4 ^ -1) >= -13) {
                      var5 = new StringBuilder(var4);
                      var6 = var2_int;
                      L5: while (true) {
                        if (var3 <= var6) {
                          if (0 != var5.length()) {
                            return var5.toString();
                          } else {
                            return null;
                          }
                        } else {
                          L6: {
                            var7 = param1.charAt(var6);
                            if (!qh.a((byte) -30, (char) var7)) {
                              break L6;
                            } else {
                              var8 = sg.a((byte) 115, (char) var7);
                              if (var8 == 0) {
                                break L6;
                              } else {
                                discarded$1 = var5.append((char) var8);
                                break L6;
                              }
                            }
                          }
                          var6++;
                          continue L5;
                        }
                      }
                    } else {
                      stackOut_15_0 = null;
                      stackIn_16_0 = stackOut_15_0;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var2);
            stackOut_28_1 = new StringBuilder().append("ui.CA(").append(param0).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L7;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L7;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ')');
        }
        return (String) ((Object) stackIn_16_0);
    }

    ui(lh param0) {
        super(param0.field_o, param0.field_z, param0.field_x, param0.field_E, (qk) null, (tn) null);
        try {
            param0.a(0, (byte) -101, 0, this.field_x, this.field_E);
            this.field_J = param0;
            this.field_R = 256;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "ui.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        wk var6 = null;
        if (-1 == (param3 ^ -1)) {
          if (this.field_J != null) {
            if (0 != this.field_R) {
              if ((this.field_R ^ -1) == -257) {
                this.field_J.a(param0 - -this.field_z, (byte) -117, param2 - -this.field_o, param3);
                return;
              } else {
                var6 = new wk(this.field_J.field_x, this.field_J.field_E);
                if (param1 > -99) {
                  return;
                } else {
                  q.a(var6, (byte) -90);
                  this.field_J.a(0, (byte) -128, 0, param3);
                  tk.f((byte) 114);
                  var6.b(this.field_o + param2, this.field_z + param0, this.field_R);
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
        if (param0) {
            return -12;
        }
        return al.field_d;
    }

    final static void a(int param0, int param1) {
        kj var2 = mm.field_g;
        var2.a(param0, (byte) -117);
        var2.a((byte) 111, 1);
        var2.a((byte) 119, param1);
    }

    public ui() {
        super(0, 0, 0, 0, (qk) null, (tn) null);
        this.field_R = 256;
    }

    static {
        field_W = "<%0> is not on your ignore list.";
        field_S = "<%0>:<%1><%2>";
        field_G = false;
    }
}
