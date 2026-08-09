/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sj extends rqa {
    static int[] field_p;
    static int field_o;

    final static int a(int param0, int param1, Random param2, boolean param3, int[] param4) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_35_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        StringBuilder stackIn_41_1 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = VoidHunters.field_G;
        try {
          L0: {
            if (param4 == null) {
              stackIn_4_0 = hob.a(param2, param1, 123);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 < -36) {
                L1: {
                  var5_int = 0;
                  var6 = 2147483647;
                  if (!param3) {
                    break L1;
                  } else {
                    var6 = -2147483648;
                    break L1;
                  }
                }
                var7 = 0;
                var8 = 0;
                L2: while (true) {
                  if (var8 >= param1) {
                    L3: {
                      if (1 < var7) {
                        var8 = hob.a(param2, var7, 123);
                        var9 = 0;
                        var10 = 0;
                        L4: while (true) {
                          if (param1 <= var10) {
                            break L3;
                          } else {
                            L5: {
                              if (param4[var10] == var6) {
                                if (var9 != var8) {
                                  var9++;
                                  break L5;
                                } else {
                                  stackIn_31_0 = var10;
                                  decompiledRegionSelector0 = 2;
                                  break L0;
                                }
                              } else {
                                break L5;
                              }
                            }
                            var10++;
                            continue L4;
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                    stackIn_35_0 = var5_int;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L6: {
                      L7: {
                        L8: {
                          if (param3) {
                            break L8;
                          } else {
                            if (param4[var8] < var6) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        L9: {
                          if (!param3) {
                            break L9;
                          } else {
                            if (var6 < param4[var8]) {
                              break L7;
                            } else {
                              break L9;
                            }
                          }
                        }
                        if (var6 == param4[var8]) {
                          var7++;
                          break L6;
                        } else {
                          var8++;
                          continue L2;
                        }
                      }
                      var6 = param4[var8];
                      var5_int = var8;
                      var7 = 1;
                      break L6;
                    }
                    var8++;
                    continue L2;
                  }
                }
              } else {
                stackIn_7_0 = -67;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackIn_38_0 = (RuntimeException) (var5);

            stackIn_38_1 = new StringBuilder().append("sj.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L10;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_41_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "null";
              break L11;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "{...}";
              break L11;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_39_0), stackIn_42_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_31_0;
            } else {
              return stackIn_35_0;
            }
          }
        }
    }

    final static void a(boolean param0, byte param1) {
        if (lob.field_a != null) {
            ukb.a(lob.field_a, (byte) 17);
        }
        if (cka.field_o != null) {
            cka.field_o.a(1, param0);
        }
        dba.a(79, param0);
        int var2 = 103 / ((16 - param1) / 32);
        if (null != crb.field_v) {
            crb.field_v.b(param0, -117);
        }
        ocb.a(param0, 124);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            si.a(29, 62, param0[0].a(88));
            if (param1 < -119) {
              stackIn_4_0 = new nc("void");
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (nc) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("sj.A(");

            if (param0 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    sj(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        field_p = null;
    }

    static {
    }
}
