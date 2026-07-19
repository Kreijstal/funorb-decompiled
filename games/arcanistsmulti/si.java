/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        int discarded$1 = 0;
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
                stackIn_3_0 = (qm) ((Object) stackOut_2_0);
                break L1;
              } else {
                stackOut_1_0 = (qm) (param0);
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var11 = (bk) ((Object) stackIn_3_0);
              if (var11 != null) {
                param4 = param4 & var11.field_B;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var7 = 5592405;
              de.d(param0.field_n + param2, param3 + param0.field_j, param0.field_v, param0.field_k, this.field_m);
              if (!param4) {
                break L3;
              } else {
                var7 = 16777215;
                break L3;
              }
            }
            L4: {
              var8 = param2 + param0.field_n + this.field_k;
              var9 = param3 + (param0.field_j - -this.field_c);
              de.g(var8, var9, this.field_f, this.field_d, param1);
              de.d(var8, var9, this.field_f, this.field_d, var7);
              if (!var11.field_z) {
                break L4;
              } else {
                de.b(var8, var9, this.field_f + var8, this.field_d + var9, 1);
                de.b(var8 + this.field_f, var9, var8, this.field_d + var9, 1);
                break L4;
              }
            }
            if (this.field_h != null) {
              var10 = this.field_j + this.field_k + this.field_f;
              discarded$1 = this.field_h.a(param0.field_g, param0.field_n + param2 + var10, param0.field_j + (param3 - -this.field_b), -this.field_j + (-var10 + param0.field_v), param0.field_k - (this.field_j << 845520257), this.field_e, this.field_i, this.field_a, this.field_o, 0);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var6);
            stackOut_14_1 = new StringBuilder().append("si.A(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void b(byte param0) {
        if (param0 != 36) {
            return;
        }
        field_q = null;
        field_n = null;
        field_p = null;
    }

    final static String a(String param0, String param1, String param2, byte param3) {
        String discarded$2 = null;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        var4 = param0.indexOf(param1);
        L0: while (true) {
          if (-1 == var4) {
            if (param3 <= 98) {
              var6 = (String) null;
              discarded$2 = si.a((String) null, (String) null, (String) null, (byte) -117);
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

    final static int a(byte param0) {
        if (param0 == 116) {
          mk.field_O.a(-8456);
          if (!jl.field_c.e(param0 + -3261)) {
            return to.d(true);
          } else {
            return 0;
          }
        } else {
          field_q = (String) null;
          mk.field_O.a(-8456);
          if (!jl.field_c.e(param0 + -3261)) {
            return to.d(true);
          } else {
            return 0;
          }
        }
    }

    final static java.net.URL a(byte param0, String param1, String param2, int param3, java.net.URL param4) {
        try {
            StringBuilder discarded$9 = null;
            StringBuilder discarded$10 = null;
            StringBuilder discarded$11 = null;
            StringBuilder discarded$12 = null;
            StringBuilder discarded$13 = null;
            StringBuilder discarded$14 = null;
            StringBuilder discarded$15 = null;
            StringBuilder discarded$16 = null;
            StringBuilder discarded$17 = null;
            RuntimeException var5 = null;
            String var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_44_0 = null;
            java.net.URL stackIn_46_0 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            RuntimeException stackIn_49_0 = null;
            StringBuilder stackIn_49_1 = null;
            RuntimeException stackIn_50_0 = null;
            StringBuilder stackIn_50_1 = null;
            String stackIn_50_2 = null;
            RuntimeException stackIn_51_0 = null;
            StringBuilder stackIn_51_1 = null;
            RuntimeException stackIn_52_0 = null;
            StringBuilder stackIn_52_1 = null;
            RuntimeException stackIn_53_0 = null;
            StringBuilder stackIn_53_1 = null;
            String stackIn_53_2 = null;
            RuntimeException stackIn_54_0 = null;
            StringBuilder stackIn_54_1 = null;
            RuntimeException stackIn_55_0 = null;
            StringBuilder stackIn_55_1 = null;
            RuntimeException stackIn_56_0 = null;
            StringBuilder stackIn_56_1 = null;
            String stackIn_56_2 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_43_0 = null;
            java.net.URL stackOut_45_0 = null;
            RuntimeException stackOut_47_0 = null;
            StringBuilder stackOut_47_1 = null;
            RuntimeException stackOut_49_0 = null;
            StringBuilder stackOut_49_1 = null;
            String stackOut_49_2 = null;
            RuntimeException stackOut_48_0 = null;
            StringBuilder stackOut_48_1 = null;
            String stackOut_48_2 = null;
            RuntimeException stackOut_50_0 = null;
            StringBuilder stackOut_50_1 = null;
            RuntimeException stackOut_52_0 = null;
            StringBuilder stackOut_52_1 = null;
            String stackOut_52_2 = null;
            RuntimeException stackOut_51_0 = null;
            StringBuilder stackOut_51_1 = null;
            String stackOut_51_2 = null;
            RuntimeException stackOut_53_0 = null;
            StringBuilder stackOut_53_1 = null;
            RuntimeException stackOut_55_0 = null;
            StringBuilder stackOut_55_1 = null;
            String stackOut_55_2 = null;
            RuntimeException stackOut_54_0 = null;
            StringBuilder stackOut_54_1 = null;
            String stackOut_54_2 = null;
            var9 = ArcanistsMulti.field_G ? 1 : 0;
            try {
              L0: {
                var5_ref = param4.getFile();
                var6 = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      if (var5_ref.regionMatches(var6, "/l=", 0, 3)) {
                        var7_int = var5_ref.indexOf('/', 1 + var6);
                        if (0 <= var7_int) {
                          if (0 > param3) {
                            break L2;
                          } else {
                            var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                            continue L1;
                          }
                        } else {
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      if (var5_ref.regionMatches(var6, "/a=", 0, 3)) {
                        var7_int = var5_ref.indexOf('/', var6 - -1);
                        if (var7_int < 0) {
                          break L4;
                        } else {
                          var6 = var7_int;
                          continue L1;
                        }
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (!var5_ref.regionMatches(var6, "/p=", 0, 3)) {
                        break L5;
                      } else {
                        var7_int = var5_ref.indexOf('/', var6 - -1);
                        if (var7_int >= 0) {
                          if (param1 != null) {
                            var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                            continue L1;
                          } else {
                            var6 = var7_int;
                            continue L1;
                          }
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      L7: {
                        if (var5_ref.regionMatches(var6, "/s=", 0, 3)) {
                          break L7;
                        } else {
                          if (var5_ref.regionMatches(var6, "/c=", 0, 3)) {
                            break L7;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var7_int = var5_ref.indexOf('/', 1 + var6);
                      if (-1 >= (var7_int ^ -1)) {
                        if (param2 == null) {
                          break L2;
                        } else {
                          var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                          continue L1;
                        }
                      } else {
                        break L6;
                      }
                    }
                    L8: {
                      var7 = new StringBuilder(var6);
                      if (param0 > 102) {
                        break L8;
                      } else {
                        si.b((byte) -35);
                        break L8;
                      }
                    }
                    L9: {
                      discarded$9 = var7.append(var5_ref.substring(0, var6));
                      if (param3 > 0) {
                        discarded$10 = var7.append("/l=");
                        discarded$11 = var7.append(Integer.toString(param3));
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (param1 == null) {
                        break L10;
                      } else {
                        if (0 < param1.length()) {
                          discarded$12 = var7.append("/p=");
                          discarded$13 = var7.append(param1);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (param2 == null) {
                        break L11;
                      } else {
                        if (-1 > (param2.length() ^ -1)) {
                          discarded$14 = var7.append("/s=");
                          discarded$15 = var7.append(param2);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                    }
                    L12: {
                      if (var6 < var5_ref.length()) {
                        discarded$16 = var7.append(var5_ref.substring(var6, var5_ref.length()));
                        break L12;
                      } else {
                        discarded$17 = var7.append('/');
                        break L12;
                      }
                    }
                    try {
                      L13: {
                        stackOut_43_0 = new java.net.URL(param4, var7.toString());
                        stackIn_44_0 = stackOut_43_0;
                        break L13;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var8 = (Exception) (Object) decompiledCaughtException;
                      var8.printStackTrace();
                      stackOut_45_0 = (java.net.URL) (param4);
                      stackIn_46_0 = stackOut_45_0;
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
                var5 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_47_0 = (RuntimeException) (var5);
                stackOut_47_1 = new StringBuilder().append("si.E(").append(param0).append(',');
                stackIn_49_0 = stackOut_47_0;
                stackIn_49_1 = stackOut_47_1;
                stackIn_48_0 = stackOut_47_0;
                stackIn_48_1 = stackOut_47_1;
                if (param1 == null) {
                  stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
                  stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
                  stackOut_49_2 = "null";
                  stackIn_50_0 = stackOut_49_0;
                  stackIn_50_1 = stackOut_49_1;
                  stackIn_50_2 = stackOut_49_2;
                  break L14;
                } else {
                  stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                  stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
                  stackOut_48_2 = "{...}";
                  stackIn_50_0 = stackOut_48_0;
                  stackIn_50_1 = stackOut_48_1;
                  stackIn_50_2 = stackOut_48_2;
                  break L14;
                }
              }
              L15: {
                stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
                stackOut_50_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(',');
                stackIn_52_0 = stackOut_50_0;
                stackIn_52_1 = stackOut_50_1;
                stackIn_51_0 = stackOut_50_0;
                stackIn_51_1 = stackOut_50_1;
                if (param2 == null) {
                  stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
                  stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
                  stackOut_52_2 = "null";
                  stackIn_53_0 = stackOut_52_0;
                  stackIn_53_1 = stackOut_52_1;
                  stackIn_53_2 = stackOut_52_2;
                  break L15;
                } else {
                  stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
                  stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
                  stackOut_51_2 = "{...}";
                  stackIn_53_0 = stackOut_51_0;
                  stackIn_53_1 = stackOut_51_1;
                  stackIn_53_2 = stackOut_51_2;
                  break L15;
                }
              }
              L16: {
                stackOut_53_0 = (RuntimeException) ((Object) stackIn_53_0);
                stackOut_53_1 = ((StringBuilder) (Object) stackIn_53_1).append(stackIn_53_2).append(',').append(param3).append(',');
                stackIn_55_0 = stackOut_53_0;
                stackIn_55_1 = stackOut_53_1;
                stackIn_54_0 = stackOut_53_0;
                stackIn_54_1 = stackOut_53_1;
                if (param4 == null) {
                  stackOut_55_0 = (RuntimeException) ((Object) stackIn_55_0);
                  stackOut_55_1 = (StringBuilder) ((Object) stackIn_55_1);
                  stackOut_55_2 = "null";
                  stackIn_56_0 = stackOut_55_0;
                  stackIn_56_1 = stackOut_55_1;
                  stackIn_56_2 = stackOut_55_2;
                  break L16;
                } else {
                  stackOut_54_0 = (RuntimeException) ((Object) stackIn_54_0);
                  stackOut_54_1 = (StringBuilder) ((Object) stackIn_54_1);
                  stackOut_54_2 = "{...}";
                  stackIn_56_0 = stackOut_54_0;
                  stackIn_56_1 = stackOut_54_1;
                  stackIn_56_2 = stackOut_54_2;
                  break L16;
                }
              }
              throw aa.a((Throwable) ((Object) stackIn_56_0), stackIn_56_2 + ')');
            }
            return stackIn_44_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    si(dj param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.field_o = 1;
        this.field_a = 1;
        try {
            this.field_k = param5;
            this.field_d = param7;
            this.field_j = param1;
            this.field_f = param8;
            this.field_i = param4;
            this.field_h = param0;
            this.field_c = param6;
            this.field_e = param3;
            this.field_b = param2;
            this.field_m = param9;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "si.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        field_l = 256;
        field_q = "Use this alternative as your account name";
        field_n = "Please try again in a few minutes.";
    }
}
