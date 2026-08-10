/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi {
    static boolean field_b;
    static int field_a;
    static t field_f;
    static int[] field_c;
    static int field_e;
    static String field_d;

    final static ti a(String param0, int param1) {
        int var2_int = 0;
        String var3 = null;
        ti var4 = null;
        String var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        Object stackIn_10_0 = null;
        ti stackIn_16_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (null != ge.field_c) {
              if (param0 != null) {
                if (0 != param0.length()) {
                  var2_int = 90 / ((34 - param1) / 63);
                  var7 = (CharSequence) ((Object) param0);
                  var3 = ua.a(-28, var7);
                  if (var3 != null) {
                    var4 = (ti) ((Object) ge.field_c.a((byte) 125, (long)var3.hashCode()));
                    L1: while (true) {
                      if (var4 != null) {
                        var8 = (CharSequence) ((Object) var4.field_db);
                        var5 = ua.a(-102, var8);
                        if (!var5.equals(var3)) {
                          var4 = (ti) ((Object) ge.field_c.c((byte) -33));
                          continue L1;
                        } else {
                          stackIn_16_0 = (ti) (var4);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      } else {
                        return null;
                      }
                    }
                  } else {
                    stackIn_10_0 = null;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var2);

            stackIn_21_1 = new StringBuilder().append("gi.E(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L2;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ti) ((Object) stackIn_10_0);
        } else {
          return stackIn_16_0;
        }
    }

    public static void a(boolean param0) {
        String var2;
        if (!param0) {
          var2 = (String) null;
          gi.a((String) null, -123);
          field_f = null;
          field_d = null;
          field_c = null;
          return;
        } else {
          field_f = null;
          field_d = null;
          field_c = null;
          return;
        }
    }

    final static void a(String[] args, byte param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 <= -57) {
                break L1;
              } else {
                field_f = (t) null;
                break L1;
              }
            }
            L2: {
              if (ck.field_j == null) {
                break L2;
              } else {
                ck.field_j.field_M.a(args, (byte) -34);
                break L2;
              }
            }
            if (ti.field_bb != null) {
              ti.field_bb.field_I.a(args, (byte) -34);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("gi.B(");

            if (args == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9;
        var9 = OrbDefence.field_D ? 1 : 0;
        if (param4 >= -7) {
          field_e = 95;
          if (param3 < param6) {
            if (param6 >= param1) {
              if (param1 > param3) {
                al.a(ul.field_b, param1, param5, param2, 30979, param7, param3, param0, param6);
                return;
              } else {
                al.a(ul.field_b, param3, param5, param7, 30979, param2, param1, param0, param6);
                return;
              }
            } else {
              al.a(ul.field_b, param6, param2, param5, 30979, param7, param3, param0, param1);
              return;
            }
          } else {
            if (param3 >= param1) {
              if (param1 <= param6) {
                al.a(ul.field_b, param6, param7, param5, 30979, param2, param1, param0, param3);
                return;
              } else {
                al.a(ul.field_b, param1, param7, param2, 30979, param5, param6, param0, param3);
                return;
              }
            } else {
              al.a(ul.field_b, param3, param2, param7, 30979, param5, param6, param0, param1);
              return;
            }
          }
        } else {
          if (param3 < param6) {
            if (param6 >= param1) {
              if (param1 > param3) {
                al.a(ul.field_b, param1, param5, param2, 30979, param7, param3, param0, param6);
                return;
              } else {
                al.a(ul.field_b, param3, param5, param7, 30979, param2, param1, param0, param6);
                return;
              }
            } else {
              al.a(ul.field_b, param6, param2, param5, 30979, param7, param3, param0, param1);
              return;
            }
          } else {
            if (param3 >= param1) {
              if (param1 <= param6) {
                al.a(ul.field_b, param6, param7, param5, 30979, param2, param1, param0, param3);
                return;
              } else {
                al.a(ul.field_b, param1, param7, param2, 30979, param5, param6, param0, param3);
                return;
              }
            } else {
              al.a(ul.field_b, param3, param2, param7, 30979, param5, param6, param0, param1);
              return;
            }
          }
        }
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    static {
        field_c = new int[8192];
        field_e = 0;
        field_d = "You have 1 unread message!";
    }
}
