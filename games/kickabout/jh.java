/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh extends bp {
    static long field_Kb;
    static String field_Jb;
    static tk field_Hb;
    static int[] field_Ib;

    private final void a(int param0, int param1, int param2) {
        sr var4 = null;
        var4 = ((jh) this).field_zb[param2];
        if (param1 != -23061) {
          L0: {
            jh.a(108, (byte) -45);
            if (var4 != null) {
              L1: {
                if (((jh) this).field_Db == param2) {
                  var4.a(true, 125);
                  break L1;
                } else {
                  break L1;
                }
              }
              ((jh) this).field_Db = param2;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L2: {
            if (var4 != null) {
              L3: {
                if (((jh) this).field_Db == param2) {
                  var4.a(true, 125);
                  break L3;
                } else {
                  break L3;
                }
              }
              ((jh) this).field_Db = param2;
              break L2;
            } else {
              break L2;
            }
          }
          return;
        }
    }

    final void b(int param0, int param1) {
        this.a(0, -23061, param0);
        if (param1 < 97) {
            this.a(117, -16, -93);
        }
    }

    final static void a(int param0, byte param1) {
        if (param1 != -25) {
            jh.a(-62, (byte) -61);
            sb.field_h[4] = param0;
            return;
        }
        sb.field_h[4] = param0;
    }

    jh(int[] param0, String[] param1, sr[] param2, int param3) {
        super(param0, param1, param2, param3);
    }

    public static void k(byte param0) {
        field_Hb = null;
        field_Jb = null;
        field_Ib = null;
    }

    final static lk a(q param0, int param1) throws fi {
        RuntimeException var2 = null;
        int var4 = 0;
        lk var5 = null;
        lk var6 = null;
        lk var7 = null;
        lk stackIn_9_0 = null;
        lk stackIn_22_0 = null;
        lk stackIn_27_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        lk stackOut_26_0 = null;
        lk stackOut_21_0 = null;
        lk stackOut_8_0 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            var5 = param0.a((byte) 82);
            if (rb.field_Mb == var5.field_k) {
              break L0;
            } else {
              if (var5.field_k == v.field_d) {
                break L0;
              } else {
                if (pv.field_H == var5.field_k) {
                  break L0;
                } else {
                  if (ra.field_N != var5.field_k) {
                    if (var5.field_k == vu.field_Ab) {
                      if (!param0.a(6)) {
                        var6 = param0.a((byte) 94);
                        if (si.field_g == var6.field_k) {
                          var5.field_j = new tf();
                          L1: while (true) {
                            if (param0.a(6)) {
                              throw new fi(var5.field_f);
                            } else {
                              if (param0.a((byte) 90).field_k != og.field_c) {
                                param0.field_a = param0.field_a - 1;
                                var5.field_j.a((gn) (Object) jh.a(param0, 1422), 3);
                                if (!param0.a(6)) {
                                  var7 = param0.a((byte) 72);
                                  if (og.field_c != var7.field_k) {
                                    if (var7.field_k == bp.field_Gb) {
                                      continue L1;
                                    } else {
                                      throw new fi(var7.field_f);
                                    }
                                  } else {
                                    stackOut_26_0 = (lk) var5;
                                    stackIn_27_0 = stackOut_26_0;
                                    return stackIn_27_0;
                                  }
                                } else {
                                  throw new fi(var5.field_f);
                                }
                              } else {
                                stackOut_21_0 = (lk) var5;
                                stackIn_22_0 = stackOut_21_0;
                                return stackIn_22_0;
                              }
                            }
                          }
                        } else {
                          throw new fi(var6.field_f);
                        }
                      } else {
                        throw new fi(var5.field_f);
                      }
                    } else {
                      throw new fi(var5.field_f);
                    }
                  } else {
                    break L0;
                  }
                }
              }
            }
          }
          stackOut_8_0 = (lk) var5;
          stackIn_9_0 = stackOut_8_0;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var2;
            stackOut_31_1 = new StringBuilder().append("jh.D(");
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param0 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L2;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ',' + 1422 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Jb = "<%0> auction selected";
        field_Ib = new int[74];
        field_Ib[12] = 4;
        field_Ib[30] = 2;
        field_Ib[41] = -2;
        field_Ib[14] = 7;
        field_Ib[18] = 4;
        field_Ib[33] = 4;
        field_Ib[32] = 2;
        field_Ib[20] = 7;
        field_Ib[45] = 4;
        field_Ib[21] = 7;
        field_Ib[17] = 4;
        field_Ib[2] = 4;
        field_Ib[28] = -2;
        field_Ib[16] = 2;
        field_Ib[11] = 4;
        field_Ib[19] = 7;
        field_Ib[3] = 7;
        field_Ib[29] = -2;
        field_Ib[43] = -2;
        field_Ib[13] = 7;
        field_Ib[31] = -2;
        field_Ib[15] = 7;
        field_Ib[10] = 2;
        field_Ib[40] = -2;
        field_Ib[44] = 2;
        field_Ib[1] = 2;
        field_Ib[42] = 2;
    }
}
