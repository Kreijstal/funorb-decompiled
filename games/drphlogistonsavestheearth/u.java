/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class u {
    static vd field_f;
    static String field_e;
    static he[] field_a;
    static he[] field_c;
    static vh field_b;
    static rf field_d;

    final static int a(int param0, byte param1) {
        if (param1 != 74) {
            field_b = (vh) null;
        }
        param0 = param0 & 8191;
        if (param0 >= 4096) {
            return (param0 ^ -1) > -6145 ? -tc.field_a[6144 - param0] : tc.field_a[param0 - 6144];
        }
        return (param0 ^ -1) > -2049 ? tc.field_a[2048 + -param0] : -tc.field_a[param0 + -2048];
    }

    final static boolean a(String param0, boolean param1, String param2) {
        RuntimeException var3 = null;
        vj var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (oi.a(8975, param0)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!g.b((byte) 99, param0)) {
                if (!kj.a(param0, (byte) 59)) {
                  L1: {
                    if (!param1) {
                      break L1;
                    } else {
                      var4 = (vj) null;
                      u.a((vj) null, 120, -66);
                      break L1;
                    }
                  }
                  if (param2.length() == 0) {
                    stackIn_15_0 = 1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (rb.a(param2, param0, -1)) {
                      stackIn_19_0 = 0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if (gk.a(-1, param2, param0)) {
                        stackIn_23_0 = 0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (pc.a((byte) -123, param2, param0)) {
                          stackIn_27_0 = 0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          return true;
                        }
                      }
                    }
                  }
                } else {
                  stackIn_9_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var3);

            stackIn_30_1 = new StringBuilder().append("u.I(");

            if (param0 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L2;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L3;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L3;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_31_0), stackIn_34_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_15_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_19_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_23_0 != 0;
                  } else {
                    return stackIn_27_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    abstract void a(od param0, int param1);

    final static ig a(vj param0, int param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        ig stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = param0.b(param2, -2);
            var3 = var4;
            if (var4 != null) {
              L1: {
                if (param1 == 0) {
                  break L1;
                } else {
                  field_d = (rf) null;
                  break L1;
                }
              }
              stackIn_6_0 = new ig(var4);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3_ref);

            stackIn_9_1 = new StringBuilder().append("u.F(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_6_0;
    }

    final static int a(String param0, boolean param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2) {
                break L1;
              } else {
                u.a(-18, (byte) 118);
                break L1;
              }
            }
            if (!param1) {
              stackIn_6_0 = uj.field_i.b(param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = cj.field_a.b(param0);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("u.K(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    final static void a(od param0, byte param1) {
        try {
            byte[] var2 = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            byte[] var7 = null;
            byte[] var8 = null;
            byte[] var9 = null;
            byte[] var10 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            String stackIn_22_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException var2_ref = null;
            var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (param1 < -62) {
                    break L1;
                  } else {
                    field_f = (vd) null;
                    break L1;
                  }
                }
                L2: {
                  var9 = new byte[24];
                  var7 = var9;
                  var6 = var7;
                  var10 = var6;
                  var8 = var10;
                  var2 = var8;
                  if (null != mi.field_f) {
                    try {
                      L3: {
                        mi.field_f.a(0L, (byte) -63);
                        mi.field_f.a((byte) -111, var9);
                        var3_int = 0;
                        L4: while (true) {
                          L5: {
                            if (var3_int >= 24) {
                              break L5;
                            } else {
                              if ((var10[var3_int] ^ -1) == -1) {
                                var3_int++;
                                continue L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          if (var3_int < 24) {
                            break L3;
                          } else {
                            throw new IOException();
                          }
                        }
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L6: {
                        var3 = (Exception) (Object) decompiledCaughtException;
                        var4 = 0;
                        L7: while (true) {
                          if (24 <= var4) {
                            break L6;
                          } else {
                            var2[var4] = (byte)-1;
                            var4++;
                            continue L7;
                          }
                        }
                      }
                    }
                    param0.a(24, 0, 29211, var10);
                    break L2;
                  } else {
                    param0.a(24, 0, 29211, var10);
                    break L2;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L8: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_21_0 = (RuntimeException) (var2_ref);

                stackIn_21_1 = new StringBuilder().append("u.H(");

                if (param0 == null) {
                  stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
                  stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
                  stackIn_22_2 = "null";
                  break L8;
                } else {
                  stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
                  stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
                  stackIn_22_2 = "{...}";
                  break L8;
                }
              }
              throw ie.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        if (param0 != 50) {
            return;
        }
        field_b = null;
        field_d = null;
        field_f = null;
        field_a = null;
        field_e = null;
        field_c = null;
    }

    abstract db b(byte param0);

    static {
        field_f = new vd();
        field_e = "Player";
        field_b = new vh();
    }
}
