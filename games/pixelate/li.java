/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li {
    static String field_b;
    static tf[] field_a;
    private ba[] field_c;
    static String field_i;
    static boolean field_e;
    private int[] field_f;
    static tf field_d;
    static tf[] field_h;
    static String field_j;
    static rg field_g;

    public static void a(byte param0) {
        Object var2 = null;
        field_a = null;
        field_h = null;
        field_d = null;
        field_g = null;
        field_b = null;
        if (param0 <= 12) {
          var2 = null;
          li.a(0.3477739989757538f, -63, (String) null);
          field_j = null;
          field_i = null;
          return;
        } else {
          field_j = null;
          field_i = null;
          return;
        }
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = Pixelate.field_H ? 1 : 0;
          var2 = -1 + ((li) this).field_c.length;
          if (param0 != -123) {
            break L0;
          } else {
            if (0 <= var2) {
              L1: {
                if (((li) this).field_c[var2] != null) {
                  ((li) this).field_c[var2].b(-904);
                  break L1;
                } else {
                  var2--;
                  break L1;
                }
              }
              var2--;
              var2--;
              var2--;
              break L0;
            } else {
              return;
            }
          }
        }
        field_d = null;
        if (0 <= var2) {
          L2: {
            if (((li) this).field_c[var2] != null) {
              ((li) this).field_c[var2].b(-904);
              break L2;
            } else {
              var2--;
              break L2;
            }
          }
          var2--;
          var2--;
          var2--;
          if (0 <= var2) {
            L3: {
              if (((li) this).field_c[var2] != null) {
                ((li) this).field_c[var2].b(-904);
                break L3;
              } else {
                var2--;
                break L3;
              }
            }
            L4: {
              var2--;
              var2--;
              var2--;
              if (((li) this).field_c[var2] != null) {
                ((li) this).field_c[var2].b(-904);
                break L4;
              } else {
                var2--;
                break L4;
              }
            }
            var2--;
            var2--;
            var2--;
            L5: while (true) {
              if (0 <= var2) {
                if (((li) this).field_c[var2] != null) {
                  ((li) this).field_c[var2].b(-904);
                  var2--;
                  var2--;
                  continue L5;
                } else {
                  var2--;
                  var2--;
                  continue L5;
                }
              } else {
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

    final static void a(float param0, int param1, String param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ad.field_r = param2;
              bf.field_o = param0;
              if (param1 == -1) {
                break L1;
              } else {
                li.a((byte) -73);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("li.C(").append(param0).append(44).append(param1).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    li(int param0, int param1, int[] param2) {
        try {
            ((li) this).field_f = param2;
            ((li) this).field_c = new ba[param0];
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "li.<init>(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Pixelate.field_H ? 1 : 0;
          if (param2 == 116) {
            break L0;
          } else {
            field_e = true;
            var6 = -1 + ((li) this).field_c.length;
            if (var6 >= 0) {
              L1: {
                L2: {
                  if (((li) this).field_c[var6] == null) {
                    ((li) this).field_c[var6] = new ba(param1, param4, param0, param3, ((li) this).field_f);
                    break L2;
                  } else {
                    if (((li) this).field_c[var6].a(true)) {
                      ((li) this).field_c[var6] = new ba(param1, param4, param0, param3, ((li) this).field_f);
                      var6--;
                      break L2;
                    } else {
                      var6--;
                      break L1;
                    }
                  }
                }
                var6--;
                break L1;
              }
              var6--;
              var6--;
              var6--;
              var6--;
              break L0;
            } else {
              return;
            }
          }
        }
        var6 = -1 + ((li) this).field_c.length;
        L3: while (true) {
          if (var6 >= 0) {
            if (((li) this).field_c[var6] == null) {
              ((li) this).field_c[var6] = new ba(param1, param4, param0, param3, ((li) this).field_f);
              var6--;
              var6--;
              continue L3;
            } else {
              if (((li) this).field_c[var6].a(true)) {
                ((li) this).field_c[var6] = new ba(param1, param4, param0, param3, ((li) this).field_f);
                var6--;
                var6--;
                continue L3;
              } else {
                var6--;
                var6--;
                continue L3;
              }
            }
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Some players haven't unlocked the currently selected game options.<br>Please view the '<%0>' tab on the left for details.";
        field_i = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_e = false;
        field_g = null;
        field_j = "<%0> has been removed.";
    }
}
