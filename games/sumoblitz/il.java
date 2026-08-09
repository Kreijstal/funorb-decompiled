/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il {
    static int field_a;
    static hr field_b;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static dk a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        dk var5 = null;
        dk stackIn_4_0 = null;
        dk stackIn_7_0 = null;
        dk stackIn_12_0 = null;
        dk stackIn_14_0 = null;
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
              if (param0 == null) {
                break L1;
              } else {
                if (param0.length() != 0) {
                  var2_int = param0.indexOf('@');
                  if (var2_int != -1) {
                    L2: {
                      var3 = param0.substring(0, var2_int);
                      var4 = param0.substring(1 + var2_int);
                      if (param1 >= 0) {
                        break L2;
                      } else {
                        field_b = (hr) null;
                        break L2;
                      }
                    }
                    var5 = g.a((byte) -126, var3);
                    if (var5 == null) {
                      stackIn_14_0 = lh.a(var4, -1);
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      stackIn_12_0 = (dk) (var5);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    stackIn_7_0 = qo.field_a;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            stackIn_4_0 = en.field_j;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var2);

            stackIn_17_1 = new StringBuilder().append("il.A(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              return stackIn_14_0;
            }
          }
        }
    }

    final static boolean a(boolean param0, ki param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if ((var2_int ^ -1) <= -10) {
                if (!param0) {
                  var4 = 0;
                  var2_int = var4;
                  L2: while (true) {
                    if (-10 >= (var4 ^ -1)) {
                      qr.field_b.field_x.a((byte) 28);
                      qr.field_b.field_r.a((byte) 28);
                      stackIn_21_0 = 1;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      L3: {
                        if (nt.field_m[var4] == null) {
                          break L3;
                        } else {
                          if (!qr.field_b.field_r.a(eb.field_b, nt.field_m[var4], -1, param1, 176400)) {
                            stackIn_18_0 = 0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var4++;
                      continue L2;
                    }
                  }
                } else {
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                L4: {
                  if (null == nt.field_m[var2_int]) {
                    break L4;
                  } else {
                    if (!qr.field_b.field_x.a(eb.field_b, nt.field_m[var2_int], -1, param1, 176400)) {
                      stackIn_7_0 = 0;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      break L4;
                    }
                  }
                }
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2);

            stackIn_24_1 = new StringBuilder().append("il.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L5;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_18_0 != 0;
            } else {
              return stackIn_21_0 != 0;
            }
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 26238) {
            field_a = 82;
        }
    }

    final static void a(byte param0, String param1) {
        System.out.println("Error: " + aw.a("%0a", param1, "\n", true));
        if (param0 < 4) {
            il.a(81);
        }
    }

    static {
        field_a = 0;
    }
}
