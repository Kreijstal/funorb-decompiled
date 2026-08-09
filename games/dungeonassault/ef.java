/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef {
    static cn field_e;
    static String field_f;
    static boolean field_h;
    static String field_c;
    static String field_g;
    static String field_b;
    static String field_a;
    static cf field_d;

    private final boolean a(int param0) {
        nh var3;
        int stackIn_7_0 = 0;
        if (param0 < -62) {
          if (rp.field_d != this) {
            if (k.field_e != this) {
              if (this == qa.field_c) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          var3 = (nh) null;
          ef.a(92, -86, (nh) null, 64, (nh) null);
          if (rp.field_d != this) {
            if (k.field_e == this) {
              return true;
            } else {
              L0: {
                if (this != qa.field_c) {
                  stackIn_7_0 = 0;
                  break L0;
                } else {
                  stackIn_7_0 = 1;
                  break L0;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        }
    }

    final static tj a(int param0, int param1, nh param2, int param3, nh param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        tj stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = -125 % ((param0 - -63) / 57);
            if (kk.a(param2, 1, param1, param3)) {
              stackIn_4_0 = rj.a(param4.b(5, param1, param3), 18118);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("ef.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (tj) ((Object) stackIn_2_0);
        } else {
          return stackIn_4_0;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean b(int param0) {
        if (param0 != 0) {
            return false;
        }
        if (sp.field_c == null) {
            return false;
        }
        if (!pd.field_A.a(-86)) {
            return false;
        }
        return true;
    }

    final static String a(int param0, int param1, CharSequence[] param2, int param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        CharSequence var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6_int = 0;
        CharSequence var7_ref_CharSequence = null;
        int var9 = 0;
        CharSequence var10 = null;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_11_0 = null;
        String stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        StringBuilder var6 = null;
        int var7 = 0;
        CharSequence var8 = null;
        var9 = DungeonAssault.field_K;
        try {
          L0: {
            if (param3 == 0) {
              stackIn_4_0 = "";
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((param3 ^ -1) == -2) {
                var10 = param2[param0];
                var4 = var10;
                if (var4 != null) {
                  stackIn_11_0 = var10.toString();
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_9_0 = "null";
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                var4_int = param3 + param0;
                var5 = 0;
                var6_int = param0;
                L1: while (true) {
                  if (var4_int <= var6_int) {
                    var6 = new StringBuilder(var5);
                    var7 = param0;
                    L2: while (true) {
                      if (var4_int <= var7) {
                        var7 = 74 % ((param1 - -43) / 59);
                        stackIn_27_0 = var6.toString();
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        L3: {
                          var8 = param2[var7];
                          if (var8 == null) {
                            discarded$0 = var6.append("null");
                            break L3;
                          } else {
                            discarded$1 = var6.append(var8);
                            break L3;
                          }
                        }
                        var7++;
                        continue L2;
                      }
                    }
                  } else {
                    L4: {
                      var7_ref_CharSequence = param2[var6_int];
                      if (var7_ref_CharSequence != null) {
                        var5 = var5 + var7_ref_CharSequence.length();
                        break L4;
                      } else {
                        var5 += 4;
                        break L4;
                      }
                    }
                    var6_int++;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var4_ref);

            stackIn_30_1 = new StringBuilder().append("ef.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L5;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L5;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_27_0;
            }
          }
        }
    }

    public static void a(byte param0) {
        if (param0 != 111) {
          return;
        } else {
          field_c = null;
          field_g = null;
          field_b = null;
          field_d = null;
          field_e = null;
          field_f = null;
          field_a = null;
          return;
        }
    }

    static {
        field_f = "COST:";
        field_b = "If you do nothing the game will revert to normal view in <%0> second.";
        field_g = "Achievements";
        field_a = "Create";
        field_c = "to keep fullscreen or";
    }
}
