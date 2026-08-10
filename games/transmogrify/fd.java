/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        field_h = (int[][]) null;
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
        try {
            kk.field_c = param2;
            ob.field_F = param3;
            jj.a(param1, gb.field_c, 1702);
            if (param0 < 58) {
                fd.a(-9);
            }
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "fd.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0) {
        Object var1 = null;
        int var2 = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          var1 = el.field_n;
          synchronized (var1) {
            L0: {
              L1: {
                if (param0) {
                  break L1;
                } else {
                  field_f = 1;
                  break L1;
                }
              }
              L2: {
                bg.field_l = bf.field_B;
                vd.field_a = vd.field_a + 1;
                if (0 <= j.field_b) {
                  L3: while (true) {
                    if (sc.field_a == j.field_b) {
                      break L2;
                    } else {
                      var2 = se.field_p[sc.field_a];
                      sc.field_a = 127 & sc.field_a + 1;
                      if (var2 < 0) {
                        ve.field_B[var2 ^ -1] = false;
                        continue L3;
                      } else {
                        ve.field_B[var2] = true;
                        continue L3;
                      }
                    }
                  }
                } else {
                  var2 = 0;
                  L4: while (true) {
                    if (112 <= var2) {
                      j.field_b = sc.field_a;
                      break L2;
                    } else {
                      ve.field_B[var2] = false;
                      var2++;
                      continue L4;
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
          throw ch.a((Throwable) ((Object) var1_ref), "fd.D(" + param0 + ')');
        }
    }

    final static java.net.URL a(int param0, String param1, int param2, java.net.URL param3, String param4) {
        try {
            StringBuilder discarded$0 = null;
            StringBuilder discarded$1 = null;
            StringBuilder discarded$2 = null;
            StringBuilder discarded$3 = null;
            StringBuilder discarded$4 = null;
            StringBuilder discarded$5 = null;
            StringBuilder discarded$6 = null;
            StringBuilder discarded$7 = null;
            StringBuilder discarded$8 = null;
            java.net.URL stackIn_44_0 = null;
            java.net.URL stackIn_46_0 = null;
            RuntimeException stackIn_49_0 = null;
            StringBuilder stackIn_49_1 = null;
            RuntimeException stackIn_50_0 = null;
            StringBuilder stackIn_50_1 = null;
            String stackIn_50_2 = null;
            StringBuilder stackIn_52_1 = null;
            StringBuilder stackIn_53_1 = null;
            String stackIn_53_2 = null;
            StringBuilder stackIn_55_1 = null;
            StringBuilder stackIn_56_1 = null;
            String stackIn_56_2 = null;
            Throwable decompiledCaughtException = null;
            String var5 = null;
            RuntimeException var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            var9 = Transmogrify.field_A ? 1 : 0;
            try {
              L0: {
                var5 = param3.getFile();
                var6 = 0;
                L1: while (true) {
                  L2: {
                    if (!var5.regionMatches(var6, "/l=", 0, 3)) {
                      break L2;
                    } else {
                      var7_int = var5.indexOf('/', var6 - -1);
                      if (0 > var7_int) {
                        break L2;
                      } else {
                        if (-1 >= (param0 ^ -1)) {
                          var5 = var5.substring(0, var6) + var5.substring(var7_int);
                          continue L1;
                        } else {
                          var6 = var7_int;
                          continue L1;
                        }
                      }
                    }
                  }
                  L3: {
                    L4: {
                      if (var5.regionMatches(var6, "/a=", 0, 3)) {
                        var7_int = var5.indexOf('/', var6 - -1);
                        if (-1 < (var7_int ^ -1)) {
                          break L4;
                        } else {
                          break L3;
                        }
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (var5.regionMatches(var6, "/p=", 0, 3)) {
                        var7_int = var5.indexOf('/', var6 + 1);
                        if (var7_int >= 0) {
                          if (param4 != null) {
                            var5 = var5.substring(0, var6) + var5.substring(var7_int);
                            continue L1;
                          } else {
                            var6 = var7_int;
                            continue L1;
                          }
                        } else {
                          break L5;
                        }
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      L7: {
                        if (var5.regionMatches(var6, "/s=", 0, 3)) {
                          break L7;
                        } else {
                          if (var5.regionMatches(var6, "/c=", 0, 3)) {
                            break L7;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var7_int = var5.indexOf('/', var6 + 1);
                      if (var7_int >= 0) {
                        if (param1 == null) {
                          break L3;
                        } else {
                          var5 = var5.substring(0, var6) + var5.substring(var7_int);
                          continue L1;
                        }
                      } else {
                        break L6;
                      }
                    }
                    L8: {
                      var7 = new StringBuilder(var6);
                      discarded$0 = var7.append(var5.substring(0, var6));
                      if (param2 == 130) {
                        break L8;
                      } else {
                        field_d = (cd) null;
                        break L8;
                      }
                    }
                    L9: {
                      if ((param0 ^ -1) >= -1) {
                        break L9;
                      } else {
                        discarded$1 = var7.append("/l=");
                        discarded$2 = var7.append(Integer.toString(param0));
                        break L9;
                      }
                    }
                    L10: {
                      if (param4 == null) {
                        break L10;
                      } else {
                        if (param4.length() > 0) {
                          discarded$3 = var7.append("/p=");
                          discarded$4 = var7.append(param4);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (param1 == null) {
                        break L11;
                      } else {
                        if (-1 > (param1.length() ^ -1)) {
                          discarded$5 = var7.append("/s=");
                          discarded$6 = var7.append(param1);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                    }
                    L12: {
                      if (var5.length() > var6) {
                        discarded$7 = var7.append(var5.substring(var6, var5.length()));
                        break L12;
                      } else {
                        discarded$8 = var7.append('/');
                        break L12;
                      }
                    }
                    try {
                      L13: {
                        stackIn_44_0 = new java.net.URL(param3, var7.toString());
                        break L13;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var8 = (Exception) (Object) decompiledCaughtException;
                      var8.printStackTrace();
                      stackIn_46_0 = (java.net.URL) (param3);
                      return stackIn_46_0;
                    }
                    break L0;
                  }
                  var6 = var7_int;
                  continue L1;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L14: {
                var5_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_49_0 = (RuntimeException) (var5_ref);

                stackIn_49_1 = new StringBuilder().append("fd.C(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_50_0 = (RuntimeException) ((Object) stackIn_49_0);
                  stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
                  stackIn_50_2 = "null";
                  break L14;
                } else {
                  stackIn_50_0 = (RuntimeException) ((Object) stackIn_49_0);
                  stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
                  stackIn_50_2 = "{...}";
                  break L14;
                }
              }
              L15: {


                stackIn_52_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(',').append(param2).append(',');

                if (param3 == null) {
                  stackIn_50_0 = (RuntimeException) ((Object) stackIn_50_0);
                  stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
                  stackIn_53_2 = "null";
                  break L15;
                } else {
                  stackIn_50_0 = (RuntimeException) ((Object) stackIn_50_0);
                  stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
                  stackIn_53_2 = "{...}";
                  break L15;
                }
              }
              L16: {


                stackIn_55_1 = ((StringBuilder) (Object) stackIn_53_1).append(stackIn_53_2).append(',');

                if (param4 == null) {
                  stackIn_50_0 = (RuntimeException) ((Object) stackIn_50_0);
                  stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
                  stackIn_56_2 = "null";
                  break L16;
                } else {
                  stackIn_50_0 = (RuntimeException) ((Object) stackIn_50_0);
                  stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
                  stackIn_56_2 = "{...}";
                  break L16;
                }
              }
              throw ch.a((Throwable) ((Object) stackIn_50_0), stackIn_56_2 + ')');
            }
            return stackIn_44_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_f = 0;
        field_h = new int[8][];
        field_c = new int[8];
        field_a = new int[8];
        field_b = new int[8];
        field_e = new int[8];
        tg.a(0, 30, new int[]{0, 3, 17, 12, 13, 4, 2, 14, 11}, (byte) 68, 435, 210, 130);
        tg.a(1, 30, new int[]{1, 12, 13, 4, 3, 7}, (byte) 50, 435, 210, 130);
        tg.a(7, 30, new int[]{21, 12, 13, 4, 3, 22}, (byte) 43, 435, 210, 130);
        tg.a(2, 43, new int[]{15, 5}, (byte) 78, 520, 274, 396);
        tg.a(3, 43, new int[]{18, 6, 19, 20}, (byte) 69, 540, 30, 420);
        tg.a(4, 43, new int[]{15, 5}, (byte) 71, 565, 312, 394);
        tg.a(6, 43, new int[]{2, 5}, (byte) 91, 565, 312, 394);
        tg.a(5, 43, new int[]{15, 16}, (byte) 57, 443, 197, 260);
    }
}
