/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v {
    static String field_g;
    static String field_c;
    static boolean field_d;
    static String field_b;
    static String field_f;
    static String field_e;
    static byte[] field_a;

    final static boolean a(char param0, int param1) {
        short[] var3;
        if (param1 == -24380) {
          if (param0 < 65) {
            if (param0 >= 97) {
              if (122 < param0) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            if (param0 > 90) {
              if (param0 >= 97) {
                if (122 < param0) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          var3 = (short[]) null;
          v.a((uf) null, true, (short[]) null, -23);
          if (param0 >= 65) {
            if (param0 > 90) {
              if (param0 >= 97) {
                if (122 < param0) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            if (param0 >= 97) {
              if (122 < param0) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    final static void b(int param0) {
        if (param0 != 0) {
            v.b(118);
            be.a((byte) 123, vk.field_a);
            return;
        }
        be.a((byte) 123, vk.field_a);
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_a = null;
        field_g = null;
        field_f = null;
        if (param0 != -66) {
          field_d = true;
          field_e = null;
          return;
        } else {
          field_e = null;
          return;
        }
    }

    final static short[] a(uf param0, boolean param1, short[] param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_5_0 = null;
        short[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                v.a('', -20);
                break L1;
              }
            }
            var4_int = param0.a(param3, (byte) 110);
            if (var4_int != 0) {
              L2: {
                L3: {
                  if (param2 == null) {
                    break L3;
                  } else {
                    if (param2.length != var4_int) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                param2 = new short[var4_int];
                break L2;
              }
              L4: {
                var5 = param0.a(4, (byte) 123);
                var6 = (short)param0.a(16, (byte) 46);
                if (var5 > 0) {
                  var7 = 0;
                  L5: while (true) {
                    if (var4_int <= var7) {
                      break L4;
                    } else {
                      param2[var7] = (short)(param0.a(var5, (byte) 99) + var6);
                      var7++;
                      continue L5;
                    }
                  }
                } else {
                  var7 = 0;
                  L6: while (true) {
                    if (var4_int <= var7) {
                      break L4;
                    } else {
                      param2[var7] = (short)var6;
                      var7++;
                      continue L6;
                    }
                  }
                }
              }
              stackIn_18_0 = (short[]) (param2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_5_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4);

            stackIn_21_1 = new StringBuilder().append("v.B(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (short[]) ((Object) stackIn_5_0);
        } else {
          return stackIn_18_0;
        }
    }

    static {
        field_c = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_g = "Email: ";
        field_b = "Unpacking music";
        field_d = true;
        field_f = "Resigned";
        field_e = "Mouse over an icon for details";
    }
}
