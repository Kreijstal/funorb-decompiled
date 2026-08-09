/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc {
    static volatile int field_g;
    static ti[] field_h;
    private boolean field_a;
    private String field_c;
    private boolean field_b;
    static String field_e;
    static int field_d;
    static int field_f;

    final static void a(int param0, String param1) {
        if (param0 < 111) {
          field_g = -123;
          System.out.println("Error: " + mg.a("%0a", false, "\n", param1));
          return;
        } else {
          System.out.println("Error: " + mg.a("%0a", false, "\n", param1));
          return;
        }
    }

    final boolean a(int param0) {
        if (param0 != -1) {
            this.b(-123);
            return this.field_a;
        }
        return this.field_a;
    }

    final void a(boolean param0, boolean param1) {
        this.field_b = true;
        this.field_a = param0 ? true : false;
        if (param1) {
            this.a(false, false);
        }
    }

    final static boolean a(byte param0, uk param1, uk param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 >= 115) {
                break L1;
              } else {
                field_e = (String) null;
                break L1;
              }
            }
            L2: {
              L3: {
                var3_int = -param1.field_hb + param2.field_hb;
                if (param2.field_fb == bd.field_v) {
                  break L3;
                } else {
                  if (param2.field_fb != null) {
                    break L2;
                  } else {
                    var3_int += 200;
                    if (var4 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              var3_int -= 200;
              break L2;
            }
            L4: {
              L5: {
                if (bd.field_v != param1.field_fb) {
                  break L5;
                } else {
                  var3_int += 200;
                  if (var4 == 0) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              if (null != param1.field_fb) {
                break L4;
              } else {
                var3_int -= 200;
                break L4;
              }
            }
            L6: {
              if ((var3_int ^ -1) >= -1) {
                stackIn_16_0 = 0;
                break L6;
              } else {
                stackIn_16_0 = 1;
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3);

            stackIn_19_1 = new StringBuilder().append("fc.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L8;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L8;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_20_0), stackIn_23_2 + ')');
        }
        return stackIn_16_0 != 0;
    }

    final static boolean a(byte param0, String param1, String param2) {
        String var3 = null;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              var3 = vl.b(-1, param2);
              if (param0 == 19) {
                break L1;
              } else {
                field_d = 73;
                break L1;
              }
            }
            L2: {
              if (param1.indexOf(param2) != -1) {
                break L2;
              } else {
                if ((param1.indexOf(var3) ^ -1) != 0) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      if (param1.startsWith(param2)) {
                        break L4;
                      } else {
                        if (param1.startsWith(var3)) {
                          break L4;
                        } else {
                          if (param1.endsWith(param2)) {
                            break L4;
                          } else {
                            if (!param1.endsWith(var3)) {
                              stackIn_14_0 = 0;
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    stackIn_14_0 = 1;
                    break L3;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            stackIn_6_0 = 1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("fc.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_14_0 != 0;
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            field_g = -17;
            field_h = null;
            field_e = null;
            return;
        }
        field_h = null;
        field_e = null;
    }

    fc(String param0) {
        this.field_a = false;
        this.field_b = false;
        try {
            this.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "fc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(byte param0) {
        int var2 = -39 / ((param0 - 19) / 35);
        return this.field_c;
    }

    final boolean b(int param0) {
        if (param0 != -26753) {
            this.field_a = false;
            return this.field_b;
        }
        return this.field_b;
    }

    static {
        field_e = "The account name you use to access RuneScape and other Jagex.com games";
        field_g = -1;
    }
}
