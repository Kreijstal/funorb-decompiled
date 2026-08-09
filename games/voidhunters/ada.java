/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ada implements dja {
    static int[] field_a;
    static pia field_b;

    public static void a(int param0) {
        if (param0 != -1) {
            field_a = (int[]) null;
        }
        field_b = null;
        field_a = null;
    }

    final static int a(String param0, boolean param1) {
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_43_0 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        String var3 = null;
        byte[] var4 = null;
        Object var5 = null;
        RuntimeException var6_ref_RuntimeException = null;
        int var6 = 0;
        byte[] var7 = null;
        int var8_int = 0;
        Throwable var8 = null;
        int var9 = 0;
        String var10 = null;
        File var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            if (nwa.field_c.field_k) {
              if (jma.field_q.containsKey(param0)) {
                stackIn_7_0 = 100;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var10 = mib.a((byte) -33, param0);
                if (var10 != null) {
                  var3 = oea.field_p + var10;
                  if (!tba.field_q.a((byte) -107, "", var3)) {
                    stackIn_14_0 = -1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (tba.field_q.a(32171, var3)) {
                      var14 = tba.field_q.a("", param1, var3);
                      var12 = var14;
                      var4 = var12;
                      var5 = null;
                      try {
                        L1: {
                          var11 = lfb.a(var10, (byte) 34);
                          break L1;
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var6_ref_RuntimeException = (RuntimeException) (Object) decompiledCaughtException;
                        stackIn_22_0 = -1;
                        return stackIn_22_0;
                      }
                      L2: {
                        if (var4 == null) {
                          break L2;
                        } else {
                          if (var11 != null) {
                            L3: {
                              L4: {
                                var6 = 1;
                                var15 = ana.a(var11, (byte) 48);
                                var13 = var15;
                                var7 = var13;
                                if (var7 == null) {
                                  break L4;
                                } else {
                                  if (var14.length != var15.length) {
                                    break L4;
                                  } else {
                                    var8_int = 0;
                                    L5: while (true) {
                                      if (var8_int >= var15.length) {
                                        break L3;
                                      } else {
                                        if (var14[var8_int] == var15[var8_int]) {
                                          var8_int++;
                                          continue L5;
                                        } else {
                                          var6 = 0;
                                          break L3;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              var6 = 0;
                              break L3;
                            }
                            try {
                              L6: {
                                L7: {
                                  if (var6 == 0) {
                                    nwa.field_c.a(var14, (byte) 110, var11);
                                    break L7;
                                  } else {
                                    break L7;
                                  }
                                }
                                break L6;
                              }
                            } catch (java.lang.Throwable decompiledCaughtParameter1) {
                              decompiledCaughtException = decompiledCaughtParameter1;
                              var8 = decompiledCaughtException;
                              stackIn_39_0 = -1;
                              return stackIn_39_0;
                            }
                            td.a((byte) 123, param0, var11);
                            stackIn_41_0 = 100;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          } else {
                            break L2;
                          }
                        }
                      }
                      stackIn_43_0 = -1;
                      decompiledRegionSelector0 = 6;
                      break L0;
                    } else {
                      stackIn_17_0 = tba.field_q.a(var3, -2118);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                } else {
                  stackIn_10_0 = -1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_3_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L8: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_46_0 = (RuntimeException) (var2);

            stackIn_46_1 = new StringBuilder().append("ada.C(");

            if (param0 == null) {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "null";
              break L8;
            } else {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "{...}";
              break L8;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_47_0), stackIn_47_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_17_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_41_0;
                  } else {
                    return stackIn_43_0;
                  }
                }
              }
            }
          }
        }
    }

    public final tv a(byte param0) {
        int var2 = 61 % ((param0 - -64) / 50);
        return (tv) ((Object) new cda());
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            return (tv[]) null;
        }
        return (tv[]) ((Object) new cda[param1]);
    }

    final static int a(rsb param0, lbb param1, boolean param2, rna[] param3) {
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        rna var6 = null;
        int var8 = 0;
        et var9 = null;
        int var10 = 0;
        int var11 = 0;
        ika var12 = null;
        uoa var13 = null;
        lrb var14 = null;
        var11 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var4_int = -1;
              if (!param2) {
                break L1;
              } else {
                ada.a(-17);
                break L1;
              }
            }
            var5 = 0;
            L2: while (true) {
              L3: {
                if (var5 >= param3.length) {
                  break L3;
                } else {
                  var6 = param3[var5];
                  if (var6 instanceof lrb) {
                    var14 = (lrb) ((Object) var6);
                    var8 = var14.a(1, -116);
                    if (param0.a(var8, 0, -1)) {
                      var4_int = var8;
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    if (!(var6 instanceof ika)) {
                      if (!(var6 instanceof uoa)) {
                        var5++;
                        continue L2;
                      } else {
                        var13 = (uoa) ((Object) var6);
                        var8 = var13.a(0, -103);
                        var9 = param1.a(-31634, var8);
                        if (var9 == null) {
                          break L3;
                        } else {
                          var10 = var9.field_b;
                          var4_int = fq.field_o[var10];
                          if (-1 < (var13.a(1, -126) ^ -1)) {
                            var4_int = mjb.b(21957, var4_int);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                    } else {
                      var12 = (ika) ((Object) var6);
                      var4_int = var12.a(0, -117);
                      break L3;
                    }
                  }
                }
              }
              stackIn_18_0 = var4_int;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4);

            stackIn_21_1 = new StringBuilder().append("ada.D(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L4;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L6;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_22_0), stackIn_28_2 + ')');
        }
        return stackIn_18_0;
    }

    static {
        field_a = new int[100];
    }
}
