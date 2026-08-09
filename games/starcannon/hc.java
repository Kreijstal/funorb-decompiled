/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hc {
    static int field_c;
    static String field_e;
    static String field_d;
    static int field_b;
    static boolean[] field_a;

    public static void a(boolean param0) {
        String var2;
        if (param0) {
          var2 = (String) null;
          hc.a((Throwable) null, (String) null, (byte) 4);
          field_a = null;
          field_e = null;
          field_d = null;
          return;
        } else {
          field_a = null;
          field_e = null;
          field_d = null;
          return;
        }
    }

    final static byte[] a(byte param0, byte[] param1) {
        byte[] stackIn_2_0 = null;
        byte[] stackIn_22_0 = null;
        byte[] stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int var5_int = 0;
        byte[] var6 = null;
        Object var7 = null;
        rb var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        try {
          L0: {
            if (param0 > 10) {
              L1: {
                var9 = new rb(param1);
                var3 = var9.j(7909);
                var4 = var9.f((byte) -97);
                if ((var4 ^ -1) > -1) {
                  break L1;
                } else {
                  L2: {
                    if (qi.field_c == 0) {
                      break L2;
                    } else {
                      if (qi.field_c >= var4) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  if (var3 == 0) {
                    var13 = new byte[var4];
                    var11 = var13;
                    var5 = var11;
                    var9.a(var4, (byte) 88, var13, 0);
                    stackIn_24_0 = (byte[]) (var5);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    L3: {
                      var5_int = var9.f((byte) -104);
                      if ((var5_int ^ -1) > -1) {
                        break L3;
                      } else {
                        L4: {
                          if (qi.field_c == 0) {
                            break L4;
                          } else {
                            if (qi.field_c >= var5_int) {
                              break L4;
                            } else {
                              break L3;
                            }
                          }
                        }
                        L5: {
                          var12 = new byte[var5_int];
                          var10 = var12;
                          var6 = var10;
                          if (var3 != 1) {
                            var7 = mj.field_b;
                            synchronized (var7) {
                              L6: {
                                mj.field_b.a(var9, true, var12);
                                break L6;
                              }
                            }
                            break L5;
                          } else {
                            nk.a(var12, var5_int, param1, var4, 9);
                            break L5;
                          }
                        }
                        stackIn_22_0 = (byte[]) (var6);
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                    throw new RuntimeException();
                  }
                }
              }
              throw new RuntimeException();
            } else {
              stackIn_2_0 = (byte[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var2);

            stackIn_27_1 = new StringBuilder().append("hc.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L7;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L7;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_22_0;
          } else {
            return stackIn_24_0;
          }
        }
    }

    final static void a(Throwable param0, String param1, byte param2) {
        try {
            ka stackIn_14_0;
            int stackIn_14_1;
            java.net.URL stackIn_14_2;
            java.net.URL stackIn_14_3;
            java.net.URL stackIn_14_4;
            StringBuilder stackIn_14_5;
            ka stackIn_15_0;
            int stackIn_15_1;
            java.net.URL stackIn_15_2;
            java.net.URL stackIn_15_3;
            java.net.URL stackIn_15_4;
            StringBuilder stackIn_15_5;
            String stackIn_15_6;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String var3 = null;
            Exception var3_ref = null;
            bk var4 = null;
            DataInputStream var5 = null;
            String var6 = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            try {
              L0: {
                L1: {
                  if (param2 >= 54) {
                    break L1;
                  } else {
                    field_e = (String) null;
                    break L1;
                  }
                }
                L2: {
                  var3 = "";
                  if (param0 == null) {
                    break L2;
                  } else {
                    var3 = uf.a(param0, -17490);
                    break L2;
                  }
                }
                L3: {
                  if (param1 != null) {
                    L4: {
                      if (param0 != null) {
                        var3 = var3 + " | ";
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var3 = var3 + param1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                ic.a((byte) -126, var3);
                var6 = ed.a(-1, var3, "%3a", ":");
                var7 = ed.a(-1, var6, "%40", "@");
                var8 = ed.a(-1, var7, "%26", "&");
                var9 = ed.a(-1, var8, "%23", "#");
                if (null != ek.field_b) {
                  L5: {
                    stackIn_14_0 = kg.field_d;

                    stackIn_14_1 = -10;

                    stackIn_14_2 = null;

                    stackIn_14_3 = null;

                    stackIn_14_4 = ek.field_b.getCodeBase();

                    stackIn_14_5 = new StringBuilder().append("clienterror.ws?c=").append(ac.field_f).append("&u=");

                    if (null == re.field_q) {
                      stackIn_15_0 = (ka) ((Object) stackIn_14_0);
                      stackIn_15_1 = stackIn_14_1;
                      stackIn_15_2 = null;
                      stackIn_15_3 = null;
                      stackIn_15_4 = (java.net.URL) ((Object) stackIn_14_4);
                      stackIn_15_5 = (StringBuilder) ((Object) stackIn_14_5);
                      stackIn_15_6 = "" + ne.field_j;
                      break L5;
                    } else {
                      stackIn_15_0 = (ka) ((Object) stackIn_14_0);
                      stackIn_15_1 = stackIn_14_1;
                      stackIn_15_2 = null;
                      stackIn_15_3 = null;
                      stackIn_15_4 = (java.net.URL) ((Object) stackIn_14_4);
                      stackIn_15_5 = (StringBuilder) ((Object) stackIn_14_5);
                      stackIn_15_6 = re.field_q;
                      break L5;
                    }
                  }
                  var4 = ((ka) (Object) stackIn_15_0).a((byte) stackIn_15_1, new java.net.URL(stackIn_15_4, stackIn_15_6 + "&v1=" + ka.field_l + "&v2=" + ka.field_o + "&e=" + var9));
                  L6: while (true) {
                    if (var4.field_b != 0) {
                      L7: {
                        if ((var4.field_b ^ -1) != -2) {
                          break L7;
                        } else {
                          var5 = (DataInputStream) (var4.field_f);
                          var5.read();
                          var5.close();
                          break L7;
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      uc.a(-94, 1L);
                      continue L6;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L8: {
                var3_ref = (Exception) (Object) decompiledCaughtException;
                decompiledRegionSelector0 = 1;
                break L8;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static ig a(String[] args, int param1) {
        ig var2 = null;
        RuntimeException var2_ref = null;
        ig stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                field_e = (String) null;
                break L1;
              }
            }
            var2 = new ig(false);
            var2.field_a = args;
            stackIn_3_0 = (ig) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2_ref);

            stackIn_6_1 = new StringBuilder().append("hc.A(");

            if (args == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, qe param1, int param2, qe param3, int param4, gi param5, int param6, int param7, int param8, int param9, gi param10, int param11, gi param12, byte param13, int param14, int param15, int param16, int param17, int param18, int param19, int param20) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          L0: {
            L1: {
              ui.a(640, param17, param1, param3);
              le.a(-4797, param16, param19, param8, param15);
              if (param13 == -11) {
                break L1;
              } else {
                field_e = (String) null;
                break L1;
              }
            }
            fc.a(param0, (byte) -102, param20);
            jl.a(param12, param5, param2, -20, param18, param9);
            el.a(param10, param11, param4, true);
            eg.a(param14, param6, (byte) -68, param7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var21 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var21);

            stackIn_6_1 = new StringBuilder().append("hc.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',');

            if (param10 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param11).append(',');

            if (param12 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_19_2 + ',' + param13 + ',' + param14 + ',' + param15 + ',' + param16 + ',' + param17 + ',' + param18 + ',' + param19 + ',' + param20 + ')');
        }
    }

    final static String a(byte param0) {
        if (!(uh.field_k != jl.field_a)) {
            return lh.field_D;
        }
        if (param0 < 93) {
            return (String) null;
        }
        return sd.field_b;
    }

    static {
        field_d = "Please send me news and updates (I can unsubscribe at any time)";
        field_e = "       ";
        field_b = 0;
    }
}
