/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ln {
    static int field_g;
    static wk field_c;
    static int field_e;
    static String field_b;
    static int field_a;
    static int field_f;
    static boolean field_h;
    static int field_d;

    final static String a(String param0, byte param1, String param2, String param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = SteelSentinels.field_G;
        try {
          L0: {
            var4_int = param3.length();
            var5 = param0.length();
            var6 = param2.length();
            if (-1 != (var5 ^ -1)) {
              L1: {
                var7 = var4_int;
                if (param1 == 11) {
                  break L1;
                } else {
                  field_a = 34;
                  break L1;
                }
              }
              L2: {
                var8 = var6 - var5;
                if (0 != var8) {
                  var9_int = 0;
                  L3: while (true) {
                    var9_int = param3.indexOf(param0, var9_int);
                    if ((var9_int ^ -1) <= -1) {
                      var9_int = var9_int + var5;
                      var7 = var7 + var8;
                      continue L3;
                    } else {
                      break L2;
                    }
                  }
                } else {
                  break L2;
                }
              }
              var9 = new StringBuilder(var7);
              var10 = 0;
              L4: while (true) {
                var11 = param3.indexOf(param0, var10);
                if (var11 >= 0) {
                  discarded$0 = var9.append(param3.substring(var10, var11));
                  var10 = var11 - -var5;
                  discarded$1 = var9.append(param2);
                  continue L4;
                } else {
                  discarded$2 = var9.append(param3.substring(var10));
                  stackIn_16_0 = var9.toString();
                  break L0;
                }
              }
            } else {
              throw new IllegalArgumentException("Key cannot have zero length");
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4);

            stackIn_19_1 = new StringBuilder().append("ln.A(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param3 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L7;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_20_0), stackIn_26_2 + ')');
        }
        return stackIn_16_0;
    }

    final static ik a(byte param0) {
        if (param0 > -53) {
            field_a = 61;
        }
        return new ik(hl.d(87), jk.c((byte) 105));
    }

    final static byte[] a(byte[] param0, byte param1) {
        byte[] stackIn_9_0 = null;
        byte[] stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        byte[] var5_ref_byte__ = null;
        byte[] var6 = null;
        Object var7 = null;
        gi var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        try {
          L0: {
            L1: {
              var9 = new gi(param0);
              if (param1 >= 126) {
                break L1;
              } else {
                field_e = 55;
                break L1;
              }
            }
            L2: {
              var3 = var9.f((byte) -72);
              var4 = var9.i(0);
              if ((var4 ^ -1) > -1) {
                break L2;
              } else {
                L3: {
                  if (uf.field_c == 0) {
                    break L3;
                  } else {
                    if (var4 <= uf.field_c) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                if (0 != var3) {
                  L4: {
                    var5 = var9.i(0);
                    if (var5 < 0) {
                      break L4;
                    } else {
                      L5: {
                        if (-1 == (uf.field_c ^ -1)) {
                          break L5;
                        } else {
                          if (var5 > uf.field_c) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        var13 = new byte[var5];
                        var11 = var13;
                        var6 = var11;
                        if (1 != var3) {
                          var7 = wc.field_e;
                          synchronized (var7) {
                            L7: {
                              wc.field_e.a(var9, var13, true);
                              break L7;
                            }
                          }
                          break L6;
                        } else {
                          oi.a(var13, var5, param0, var4, 9);
                          break L6;
                        }
                      }
                      stackIn_23_0 = (byte[]) (var6);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                  throw new RuntimeException();
                } else {
                  var12 = new byte[var4];
                  var10 = var12;
                  var5_ref_byte__ = var10;
                  var9.a(0, var12, 28, var4);
                  stackIn_9_0 = (byte[]) (var5_ref_byte__);
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var2);

            stackIn_26_1 = new StringBuilder().append("ln.B(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L8;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L8;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_23_0;
        }
    }

    final static String a(CharSequence param0, boolean param1, int param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            if (param2 == -16121) {
              var3 = jd.a(param0, param1, 88);
              if (var3 == null) {
                var4 = 0;
                L1: while (true) {
                  if (param0.length() > var4) {
                    if (im.a(param0.charAt(var4), false)) {
                      var4++;
                      continue L1;
                    } else {
                      stackIn_12_0 = lg.field_f;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                stackIn_6_0 = (String) (var3);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("ln.F(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    public static void b(int param0) {
        field_b = null;
        if (param0 != 0) {
            field_g = 53;
        }
        field_c = null;
    }

    final static void a(int param0) {
        try {
            IOException iOException = null;
            int var1_int = 0;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException var1 = null;
            IOException var2 = null;
            var3 = SteelSentinels.field_G;
            try {
              L0: {
                L1: {
                  if (ne.field_N == null) {
                    break L1;
                  } else {
                    ne.field_N.b(111);
                    break L1;
                  }
                }
                L2: {
                  if (param0 == -8601) {
                    break L2;
                  } else {
                    field_b = (String) null;
                    break L2;
                  }
                }
                L3: {
                  if (null != hk.field_oc) {
                    hk.field_oc.a(0);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (null == si.field_o) {
                    break L4;
                  } else {
                    try {
                      L5: {
                        si.field_o.c(param0 ^ 8679);
                        break L5;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L6: {
                        iOException = (IOException) (Object) decompiledCaughtException;
                        break L6;
                      }
                    }
                    break L4;
                  }
                }
                L7: {
                  if (rh.field_o != null) {
                    var1_int = 0;
                    L8: while (true) {
                      if (var1_int >= rh.field_o.length) {
                        break L7;
                      } else {
                        if (rh.field_o[var1_int] != null) {
                          try {
                            L9: {
                              rh.field_o[var1_int].c(-127);
                              break L9;
                            }
                          } catch (java.io.IOException decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            L10: {
                              var2 = (IOException) (Object) decompiledCaughtException;
                              break L10;
                            }
                          }
                          var1_int++;
                          continue L8;
                        } else {
                          var1_int++;
                          continue L8;
                        }
                      }
                    }
                  } else {
                    break L7;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (RuntimeException) (Object) decompiledCaughtException;
              throw ci.a((Throwable) ((Object) var1), "ln.C(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_b = "Email: ";
        field_c = null;
        field_a = 0;
        field_f = 0;
        field_d = 32;
    }
}
