/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class fd {
    static int[] field_a;
    static int[][] field_h;
    static int field_f;
    static cd field_d;
    static int[] field_c;
    static int[] field_b;
    static int[] field_e;
    static String field_i;
    static long field_g;

    public static void a(int param0) {
        field_e = null;
        field_c = null;
        field_h = null;
        field_b = null;
        field_d = null;
        field_i = null;
        if (param0 <= 103) {
          return;
        } else {
          field_a = null;
          return;
        }
    }

    final static void a(int param0, boolean param1, String param2, String param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              kk.field_c = param2;
              ob.field_F = param3;
              jj.a(param1, gb.field_c, 1702);
              if (param0 >= 58) {
                break L1;
              } else {
                fd.a(-9);
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
            stackOut_3_1 = new StringBuilder().append("fd.B(").append(param0).append(44).append(param1).append(44);
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
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    final static void a(boolean param0) {
        Object var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          var1 = (Object) (Object) el.field_n;
          synchronized (var1) {
            L0: {
              L1: {
                bg.field_l = bf.field_B;
                vd.field_a = vd.field_a + 1;
                if (0 <= j.field_b) {
                  L2: while (true) {
                    if (sc.field_a == j.field_b) {
                      break L1;
                    } else {
                      var2 = se.field_p[sc.field_a];
                      sc.field_a = 127 & sc.field_a + 1;
                      if (var2 < 0) {
                        ve.field_B[~var2] = false;
                        continue L2;
                      } else {
                        ve.field_B[var2] = true;
                        continue L2;
                      }
                    }
                  }
                } else {
                  var2 = 0;
                  L3: while (true) {
                    if (112 <= var2) {
                      j.field_b = sc.field_a;
                      break L1;
                    } else {
                      ve.field_B[var2] = false;
                      var2++;
                      continue L3;
                    }
                  }
                }
              }
              bf.field_B = dk.field_i;
              break L0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw ch.a((Throwable) (Object) var1_ref, "fd.D(" + 1 + 41);
        }
    }

    final static java.net.URL a(int param0, String param1, int param2, java.net.URL param3, String param4) {
        try {
            RuntimeException var5 = null;
            String var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_42_0 = null;
            java.net.URL stackIn_44_0 = null;
            RuntimeException stackIn_46_0 = null;
            StringBuilder stackIn_46_1 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            String stackIn_48_2 = null;
            RuntimeException stackIn_49_0 = null;
            StringBuilder stackIn_49_1 = null;
            RuntimeException stackIn_50_0 = null;
            StringBuilder stackIn_50_1 = null;
            RuntimeException stackIn_51_0 = null;
            StringBuilder stackIn_51_1 = null;
            String stackIn_51_2 = null;
            RuntimeException stackIn_52_0 = null;
            StringBuilder stackIn_52_1 = null;
            RuntimeException stackIn_53_0 = null;
            StringBuilder stackIn_53_1 = null;
            RuntimeException stackIn_54_0 = null;
            StringBuilder stackIn_54_1 = null;
            String stackIn_54_2 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_41_0 = null;
            java.net.URL stackOut_43_0 = null;
            RuntimeException stackOut_45_0 = null;
            StringBuilder stackOut_45_1 = null;
            RuntimeException stackOut_47_0 = null;
            StringBuilder stackOut_47_1 = null;
            String stackOut_47_2 = null;
            RuntimeException stackOut_46_0 = null;
            StringBuilder stackOut_46_1 = null;
            String stackOut_46_2 = null;
            RuntimeException stackOut_48_0 = null;
            StringBuilder stackOut_48_1 = null;
            RuntimeException stackOut_50_0 = null;
            StringBuilder stackOut_50_1 = null;
            String stackOut_50_2 = null;
            RuntimeException stackOut_49_0 = null;
            StringBuilder stackOut_49_1 = null;
            String stackOut_49_2 = null;
            RuntimeException stackOut_51_0 = null;
            StringBuilder stackOut_51_1 = null;
            RuntimeException stackOut_53_0 = null;
            StringBuilder stackOut_53_1 = null;
            String stackOut_53_2 = null;
            RuntimeException stackOut_52_0 = null;
            StringBuilder stackOut_52_1 = null;
            String stackOut_52_2 = null;
            var9 = Transmogrify.field_A ? 1 : 0;
            try {
              var5_ref = param3.getFile();
              var6 = 0;
              L0: while (true) {
                L1: {
                  if (!var5_ref.regionMatches(var6, "/l=", 0, 3)) {
                    break L1;
                  } else {
                    var7_int = var5_ref.indexOf('/', var6 - -1);
                    if (0 > var7_int) {
                      break L1;
                    } else {
                      if (param0 >= 0) {
                        var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                        continue L0;
                      } else {
                        var6 = var7_int;
                        continue L0;
                      }
                    }
                  }
                }
                L2: {
                  if (var5_ref.regionMatches(var6, "/a=", 0, 3)) {
                    var7_int = var5_ref.indexOf('/', var6 - -1);
                    if (var7_int < 0) {
                      break L2;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (var5_ref.regionMatches(var6, "/p=", 0, 3)) {
                    var7_int = var5_ref.indexOf('/', var6 + 1);
                    if (var7_int >= 0) {
                      if (param4 != null) {
                        var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                        continue L0;
                      } else {
                        var6 = var7_int;
                        continue L0;
                      }
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    if (var5_ref.regionMatches(var6, "/s=", 0, 3)) {
                      break L5;
                    } else {
                      if (var5_ref.regionMatches(var6, "/c=", 0, 3)) {
                        break L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var7_int = var5_ref.indexOf('/', var6 + 1);
                  if (var7_int >= 0) {
                    if (param1 == null) {
                      var6 = var7_int;
                      continue L0;
                    } else {
                      var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                      continue L0;
                    }
                  } else {
                    break L4;
                  }
                }
                L6: {
                  var7 = new StringBuilder(var6);
                  StringBuilder discarded$9 = var7.append(var5_ref.substring(0, var6));
                  if (param2 == 130) {
                    break L6;
                  } else {
                    field_d = null;
                    break L6;
                  }
                }
                L7: {
                  if (param0 <= 0) {
                    break L7;
                  } else {
                    StringBuilder discarded$10 = var7.append("/l=");
                    StringBuilder discarded$11 = var7.append(Integer.toString(param0));
                    break L7;
                  }
                }
                L8: {
                  if (param4 == null) {
                    break L8;
                  } else {
                    if (param4.length() > 0) {
                      StringBuilder discarded$12 = var7.append("/p=");
                      StringBuilder discarded$13 = var7.append(param4);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
                L9: {
                  if (param1 == null) {
                    break L9;
                  } else {
                    if (param1.length() > 0) {
                      StringBuilder discarded$14 = var7.append("/s=");
                      StringBuilder discarded$15 = var7.append(param1);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
                L10: {
                  if (var5_ref.length() > var6) {
                    StringBuilder discarded$16 = var7.append(var5_ref.substring(var6, var5_ref.length()));
                    break L10;
                  } else {
                    StringBuilder discarded$17 = var7.append(47);
                    break L10;
                  }
                }
                try {
                  L11: {
                    stackOut_41_0 = new java.net.URL(param3, var7.toString());
                    stackIn_42_0 = stackOut_41_0;
                    break L11;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8 = (Exception) (Object) decompiledCaughtException;
                  var8.printStackTrace();
                  stackOut_43_0 = (java.net.URL) param3;
                  stackIn_44_0 = stackOut_43_0;
                  return stackIn_44_0;
                }
                return stackIn_42_0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L12: {
                var5 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_45_0 = (RuntimeException) var5;
                stackOut_45_1 = new StringBuilder().append("fd.C(").append(param0).append(44);
                stackIn_47_0 = stackOut_45_0;
                stackIn_47_1 = stackOut_45_1;
                stackIn_46_0 = stackOut_45_0;
                stackIn_46_1 = stackOut_45_1;
                if (param1 == null) {
                  stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
                  stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
                  stackOut_47_2 = "null";
                  stackIn_48_0 = stackOut_47_0;
                  stackIn_48_1 = stackOut_47_1;
                  stackIn_48_2 = stackOut_47_2;
                  break L12;
                } else {
                  stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
                  stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
                  stackOut_46_2 = "{...}";
                  stackIn_48_0 = stackOut_46_0;
                  stackIn_48_1 = stackOut_46_1;
                  stackIn_48_2 = stackOut_46_2;
                  break L12;
                }
              }
              L13: {
                stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
                stackOut_48_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(44).append(param2).append(44);
                stackIn_50_0 = stackOut_48_0;
                stackIn_50_1 = stackOut_48_1;
                stackIn_49_0 = stackOut_48_0;
                stackIn_49_1 = stackOut_48_1;
                if (param3 == null) {
                  stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
                  stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
                  stackOut_50_2 = "null";
                  stackIn_51_0 = stackOut_50_0;
                  stackIn_51_1 = stackOut_50_1;
                  stackIn_51_2 = stackOut_50_2;
                  break L13;
                } else {
                  stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
                  stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
                  stackOut_49_2 = "{...}";
                  stackIn_51_0 = stackOut_49_0;
                  stackIn_51_1 = stackOut_49_1;
                  stackIn_51_2 = stackOut_49_2;
                  break L13;
                }
              }
              L14: {
                stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
                stackOut_51_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(44);
                stackIn_53_0 = stackOut_51_0;
                stackIn_53_1 = stackOut_51_1;
                stackIn_52_0 = stackOut_51_0;
                stackIn_52_1 = stackOut_51_1;
                if (param4 == null) {
                  stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
                  stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
                  stackOut_53_2 = "null";
                  stackIn_54_0 = stackOut_53_0;
                  stackIn_54_1 = stackOut_53_1;
                  stackIn_54_2 = stackOut_53_2;
                  break L14;
                } else {
                  stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
                  stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
                  stackOut_52_2 = "{...}";
                  stackIn_54_0 = stackOut_52_0;
                  stackIn_54_1 = stackOut_52_1;
                  stackIn_54_2 = stackOut_52_2;
                  break L14;
                }
              }
              throw ch.a((Throwable) (Object) stackIn_54_0, stackIn_54_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
        field_h = new int[8][];
        field_c = new int[8];
        field_a = new int[8];
        field_b = new int[8];
        field_e = new int[8];
        tg.a(0, 30, new int[9], (byte) 68, 435, 210, 130);
        tg.a(1, 30, new int[6], (byte) 50, 435, 210, 130);
        tg.a(7, 30, new int[6], (byte) 43, 435, 210, 130);
        tg.a(2, 43, new int[2], (byte) 78, 520, 274, 396);
        tg.a(3, 43, new int[4], (byte) 69, 540, 30, 420);
        tg.a(4, 43, new int[2], (byte) 71, 565, 312, 394);
        tg.a(6, 43, new int[2], (byte) 91, 565, 312, 394);
        tg.a(5, 43, new int[2], (byte) 57, 443, 197, 260);
    }
}
