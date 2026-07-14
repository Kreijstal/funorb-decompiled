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
        if (param0 != 68) {
            return;
        }
        field_Hb = null;
        field_Jb = null;
        field_Ib = null;
    }

    final static lk a(q param0, int param1) throws fi {
        int var4 = 0;
        lk var5 = null;
        lk var6 = null;
        lk var11 = null;
        var4 = Kickabout.field_G;
        if (param1 == 1422) {
          var5 = param0.a((byte) 82);
          if (rb.field_Mb != var5.field_k) {
            if (var5.field_k != v.field_d) {
              if (pv.field_H != var5.field_k) {
                if (ra.field_N != var5.field_k) {
                  if (var5.field_k == vu.field_Ab) {
                    if (!param0.a(6)) {
                      var6 = param0.a((byte) 94);
                      if (si.field_g == var6.field_k) {
                        var5.field_j = new tf();
                        L0: while (true) {
                          if (param0.a(6)) {
                            throw new fi(var5.field_f);
                          } else {
                            if (param0.a((byte) 90).field_k != og.field_c) {
                              param0.field_a = param0.field_a - 1;
                              var5.field_j.a((gn) (Object) jh.a(param0, 1422), 3);
                              if (!param0.a(6)) {
                                var11 = param0.a((byte) 72);
                                if (og.field_c != var11.field_k) {
                                  if (var11.field_k == bp.field_Gb) {
                                    continue L0;
                                  } else {
                                    throw new fi(var11.field_f);
                                  }
                                } else {
                                  return var5;
                                }
                              } else {
                                throw new fi(var5.field_f);
                              }
                            } else {
                              return var5;
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
                  return var5;
                }
              } else {
                return var5;
              }
            } else {
              return var5;
            }
          } else {
            return var5;
          }
        } else {
          return null;
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
