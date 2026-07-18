/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class si implements pf {
    private dj field_h;
    private int field_o;
    static ll[] field_p;
    static String field_q;
    private int field_m;
    private int field_j;
    private int field_k;
    static int field_l;
    private int field_c;
    static String field_n;
    private int field_f;
    private int field_b;
    private int field_d;
    private int field_a;
    private int field_e;
    private int field_i;
    static int field_g;

    public final void a(qm param0, int param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        bk var11 = null;
        qm stackIn_3_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        qm stackOut_1_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (!(param0 instanceof bk)) {
                stackOut_2_0 = null;
                stackIn_3_0 = (qm) (Object) stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = (qm) param0;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var11 = (bk) (Object) stackIn_3_0;
              if (var11 != null) {
                param4 = param4 & var11.field_B;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var7 = 5592405;
              de.d(param0.field_n + param2, param3 + param0.field_j, param0.field_v, param0.field_k, ((si) this).field_m);
              if (!param4) {
                break L3;
              } else {
                var7 = 16777215;
                break L3;
              }
            }
            L4: {
              var8 = param2 + param0.field_n + ((si) this).field_k;
              var9 = param3 + (param0.field_j - -((si) this).field_c);
              de.g(var8, var9, ((si) this).field_f, ((si) this).field_d, param1);
              de.d(var8, var9, ((si) this).field_f, ((si) this).field_d, var7);
              if (!var11.field_z) {
                break L4;
              } else {
                de.b(var8, var9, ((si) this).field_f + var8, ((si) this).field_d + var9, 1);
                de.b(var8 + ((si) this).field_f, var9, var8, ((si) this).field_d + var9, 1);
                break L4;
              }
            }
            if (((si) this).field_h != null) {
              var10 = ((si) this).field_j + ((si) this).field_k + ((si) this).field_f;
              int discarded$1 = ((si) this).field_h.a(param0.field_g, param0.field_n + param2 + var10, param0.field_j + (param3 - -((si) this).field_b), -((si) this).field_j + (-var10 + param0.field_v), param0.field_k - (((si) this).field_j << 1), ((si) this).field_e, ((si) this).field_i, ((si) this).field_a, ((si) this).field_o, 0);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var6;
            stackOut_14_1 = new StringBuilder().append("si.A(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void b() {
        field_q = null;
        field_n = null;
        field_p = null;
    }

    final static String a(String param0, String param1, String param2, byte param3) {
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        var4 = param0.indexOf(param1);
        L0: while (true) {
          if (-1 == var4) {
            if (param3 <= 98) {
              var6 = null;
              String discarded$2 = si.a((String) null, (String) null, (String) null, (byte) -117);
              return param0;
            } else {
              return param0;
            }
          } else {
            param0 = param0.substring(0, var4) + param2 + param0.substring(var4 + param1.length());
            var4 = param0.indexOf(param1, param2.length() + var4);
            continue L0;
          }
        }
    }

    final static int a() {
        mk.field_O.a(-8456);
        if (!jl.field_c.e(-3145)) {
            int discarded$0 = 1;
            return to.d();
        }
        return 0;
    }

    final static java.net.URL a(byte param0, String param1, String param2, int param3, java.net.URL param4) {
        try {
            RuntimeException var5 = null;
            String var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_37_0 = null;
            java.net.URL stackIn_39_0 = null;
            RuntimeException stackIn_41_0 = null;
            StringBuilder stackIn_41_1 = null;
            RuntimeException stackIn_42_0 = null;
            StringBuilder stackIn_42_1 = null;
            RuntimeException stackIn_43_0 = null;
            StringBuilder stackIn_43_1 = null;
            String stackIn_43_2 = null;
            RuntimeException stackIn_44_0 = null;
            StringBuilder stackIn_44_1 = null;
            RuntimeException stackIn_45_0 = null;
            StringBuilder stackIn_45_1 = null;
            RuntimeException stackIn_46_0 = null;
            StringBuilder stackIn_46_1 = null;
            String stackIn_46_2 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            RuntimeException stackIn_49_0 = null;
            StringBuilder stackIn_49_1 = null;
            String stackIn_49_2 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_36_0 = null;
            java.net.URL stackOut_38_0 = null;
            RuntimeException stackOut_40_0 = null;
            StringBuilder stackOut_40_1 = null;
            RuntimeException stackOut_42_0 = null;
            StringBuilder stackOut_42_1 = null;
            String stackOut_42_2 = null;
            RuntimeException stackOut_41_0 = null;
            StringBuilder stackOut_41_1 = null;
            String stackOut_41_2 = null;
            RuntimeException stackOut_43_0 = null;
            StringBuilder stackOut_43_1 = null;
            RuntimeException stackOut_45_0 = null;
            StringBuilder stackOut_45_1 = null;
            String stackOut_45_2 = null;
            RuntimeException stackOut_44_0 = null;
            StringBuilder stackOut_44_1 = null;
            String stackOut_44_2 = null;
            RuntimeException stackOut_46_0 = null;
            StringBuilder stackOut_46_1 = null;
            RuntimeException stackOut_48_0 = null;
            StringBuilder stackOut_48_1 = null;
            String stackOut_48_2 = null;
            RuntimeException stackOut_47_0 = null;
            StringBuilder stackOut_47_1 = null;
            String stackOut_47_2 = null;
            var9 = ArcanistsMulti.field_G ? 1 : 0;
            try {
              var5_ref = param4.getFile();
              var6 = 0;
              L0: while (true) {
                L1: {
                  L2: {
                    if (var5_ref.regionMatches(var6, "/l=", 0, 3)) {
                      var7_int = var5_ref.indexOf('/', 1 + var6);
                      if (0 <= var7_int) {
                        break L1;
                      } else {
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (var5_ref.regionMatches(var6, "/a=", 0, 3)) {
                      var7_int = var5_ref.indexOf('/', var6 - -1);
                      if (var7_int < 0) {
                        break L3;
                      } else {
                        var6 = var7_int;
                        continue L0;
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (!var5_ref.regionMatches(var6, "/p=", 0, 3)) {
                      break L4;
                    } else {
                      var7_int = var5_ref.indexOf('/', var6 - -1);
                      if (var7_int >= 0) {
                        if (param1 != null) {
                          var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                          continue L0;
                        } else {
                          var6 = var7_int;
                          continue L0;
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    L6: {
                      if (var5_ref.regionMatches(var6, "/s=", 0, 3)) {
                        break L6;
                      } else {
                        if (var5_ref.regionMatches(var6, "/c=", 0, 3)) {
                          break L6;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var7_int = var5_ref.indexOf('/', 1 + var6);
                    if (var7_int >= 0) {
                      if (param2 == null) {
                        break L1;
                      } else {
                        var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                        continue L0;
                      }
                    } else {
                      break L5;
                    }
                  }
                  L7: {
                    var7 = new StringBuilder(var6);
                    StringBuilder discarded$7 = var7.append(var5_ref.substring(0, var6));
                    if (param1 == null) {
                      break L7;
                    } else {
                      if (0 < param1.length()) {
                        StringBuilder discarded$8 = var7.append("/p=");
                        StringBuilder discarded$9 = var7.append(param1);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: {
                    if (param2 == null) {
                      break L8;
                    } else {
                      if (param2.length() > 0) {
                        StringBuilder discarded$10 = var7.append("/s=");
                        StringBuilder discarded$11 = var7.append(param2);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (var6 < var5_ref.length()) {
                      StringBuilder discarded$12 = var7.append(var5_ref.substring(var6, var5_ref.length()));
                      break L9;
                    } else {
                      StringBuilder discarded$13 = var7.append('/');
                      break L9;
                    }
                  }
                  try {
                    L10: {
                      stackOut_36_0 = new java.net.URL(param4, var7.toString());
                      stackIn_37_0 = stackOut_36_0;
                      break L10;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var8 = (Exception) (Object) decompiledCaughtException;
                    var8.printStackTrace();
                    stackOut_38_0 = (java.net.URL) param4;
                    stackIn_39_0 = stackOut_38_0;
                    return stackIn_39_0;
                  }
                  return stackIn_37_0;
                }
                var6 = var7_int;
                continue L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L11: {
                var5 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_40_0 = (RuntimeException) var5;
                stackOut_40_1 = new StringBuilder().append("si.E(").append(115).append(',');
                stackIn_42_0 = stackOut_40_0;
                stackIn_42_1 = stackOut_40_1;
                stackIn_41_0 = stackOut_40_0;
                stackIn_41_1 = stackOut_40_1;
                if (param1 == null) {
                  stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
                  stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
                  stackOut_42_2 = "null";
                  stackIn_43_0 = stackOut_42_0;
                  stackIn_43_1 = stackOut_42_1;
                  stackIn_43_2 = stackOut_42_2;
                  break L11;
                } else {
                  stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
                  stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
                  stackOut_41_2 = "{...}";
                  stackIn_43_0 = stackOut_41_0;
                  stackIn_43_1 = stackOut_41_1;
                  stackIn_43_2 = stackOut_41_2;
                  break L11;
                }
              }
              L12: {
                stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
                stackOut_43_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_43_2).append(',');
                stackIn_45_0 = stackOut_43_0;
                stackIn_45_1 = stackOut_43_1;
                stackIn_44_0 = stackOut_43_0;
                stackIn_44_1 = stackOut_43_1;
                if (param2 == null) {
                  stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
                  stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
                  stackOut_45_2 = "null";
                  stackIn_46_0 = stackOut_45_0;
                  stackIn_46_1 = stackOut_45_1;
                  stackIn_46_2 = stackOut_45_2;
                  break L12;
                } else {
                  stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
                  stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
                  stackOut_44_2 = "{...}";
                  stackIn_46_0 = stackOut_44_0;
                  stackIn_46_1 = stackOut_44_1;
                  stackIn_46_2 = stackOut_44_2;
                  break L12;
                }
              }
              L13: {
                stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
                stackOut_46_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(',').append(-1).append(',');
                stackIn_48_0 = stackOut_46_0;
                stackIn_48_1 = stackOut_46_1;
                stackIn_47_0 = stackOut_46_0;
                stackIn_47_1 = stackOut_46_1;
                if (param4 == null) {
                  stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
                  stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
                  stackOut_48_2 = "null";
                  stackIn_49_0 = stackOut_48_0;
                  stackIn_49_1 = stackOut_48_1;
                  stackIn_49_2 = stackOut_48_2;
                  break L13;
                } else {
                  stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
                  stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
                  stackOut_47_2 = "{...}";
                  stackIn_49_0 = stackOut_47_0;
                  stackIn_49_1 = stackOut_47_1;
                  stackIn_49_2 = stackOut_47_2;
                  break L13;
                }
              }
              throw aa.a((Throwable) (Object) stackIn_49_0, stackIn_49_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    si(dj param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((si) this).field_o = 1;
        ((si) this).field_a = 1;
        try {
            ((si) this).field_k = param5;
            ((si) this).field_d = param7;
            ((si) this).field_j = param1;
            ((si) this).field_f = param8;
            ((si) this).field_i = param4;
            ((si) this).field_h = param0;
            ((si) this).field_c = param6;
            ((si) this).field_e = param3;
            ((si) this).field_b = param2;
            ((si) this).field_m = param9;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "si.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = 256;
        field_q = "Use this alternative as your account name";
        field_n = "Please try again in a few minutes.";
    }
}
