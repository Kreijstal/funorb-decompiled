/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj extends qr {
    int field_Qb;
    boolean field_Ub;
    long field_zb;
    int field_Fb;
    qr field_xb;
    int field_Wb;
    boolean field_Vb;
    static bi[] field_Nb;
    int field_Gb;
    qr field_Ob;
    qr field_Mb;
    static sm[] field_Hb;
    int field_Eb;
    int field_Lb;
    String field_Cb;
    boolean field_Tb;
    qr field_Jb;
    String field_Db;
    static long field_Pb;
    static bi field_Kb;
    qr field_Ab;
    static bg field_Rb;
    static byte[][] field_Bb;
    long field_Ib;
    static sd field_yb;
    static io field_Sb;

    final static void a(int param0, boolean param1) {
        if (!(dn.field_k == null)) {
            dk.a((byte) 54, dn.field_k);
        }
        if (hp.field_m != null) {
            hp.field_m.a(13505, param1);
            return;
        }
    }

    final boolean a(mj param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        boolean stackIn_5_0 = false;
        int stackIn_5_1 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_9_0 = false;
        boolean stackIn_10_0 = false;
        boolean stackIn_11_0 = false;
        int stackIn_11_1 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        boolean stackOut_4_0 = false;
        int stackOut_4_1 = 0;
        boolean stackOut_3_0 = false;
        int stackOut_3_1 = 0;
        boolean stackOut_8_0 = false;
        boolean stackOut_10_0 = false;
        int stackOut_10_1 = 0;
        boolean stackOut_9_0 = false;
        int stackOut_9_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        boolean stackOut_12_0 = false;
        boolean stackOut_6_0 = false;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                field_Rb = null;
                break L1;
              }
            }
            L2: {
              stackOut_2_0 = ((mj) this).field_Vb;
              stackIn_4_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (param0.field_Vb) {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L2;
              } else {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = 1;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                break L2;
              }
            }
            if ((stackIn_5_0 ? 1 : 0) != stackIn_5_1) {
              L3: {
                stackOut_8_0 = param0.field_Tb;
                stackIn_10_0 = stackOut_8_0;
                stackIn_9_0 = stackOut_8_0;
                if (((mj) this).field_Tb) {
                  stackOut_10_0 = stackIn_10_0;
                  stackOut_10_1 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  break L3;
                } else {
                  stackOut_9_0 = stackIn_9_0;
                  stackOut_9_1 = 1;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  break L3;
                }
              }
              if ((stackIn_11_0 ? 1 : 0) != stackIn_11_1) {
                L4: {
                  if (~((mj) this).field_zb <= ~param0.field_zb) {
                    stackOut_16_0 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    break L4;
                  } else {
                    stackOut_15_0 = 1;
                    stackIn_17_0 = stackOut_15_0;
                    break L4;
                  }
                }
                break L0;
              } else {
                stackOut_12_0 = ((mj) this).field_Tb;
                stackIn_13_0 = stackOut_12_0;
                return stackIn_13_0;
              }
            } else {
              stackOut_6_0 = ((mj) this).field_Vb;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3;
            stackOut_18_1 = new StringBuilder().append("mj.B(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw r.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param1 + ')');
        }
        return stackIn_17_0 != 0;
    }

    final void a(String param0, String param1, byte param2) {
        CharSequence var5 = null;
        ((mj) this).field_Db = param1;
        if (param2 <= 1) {
            return;
        }
        try {
            ((mj) this).field_Cb = param0;
            var5 = (CharSequence) (Object) ((mj) this).field_Db;
            String discarded$0 = ji.a(var5, true);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "mj.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void g(int param0) {
        field_Rb = null;
        if (param0 != -4923) {
          return;
        } else {
          field_yb = null;
          field_Sb = null;
          field_Kb = null;
          field_Nb = null;
          field_Hb = null;
          field_Bb = null;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, bi[] param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param5 == null) {
                break L1;
              } else {
                if (param0 <= 0) {
                  break L1;
                } else {
                  var6_int = param5[0].field_o;
                  var7 = param5[2].field_o;
                  var8 = param5[1].field_o;
                  param5[0].d(param4, param3, param2);
                  param5[2].d(-var7 + (param4 - -param0), param3, param2);
                  gf.a(fc.field_g);
                  gf.i(var6_int + param4, param3, param4 + (param0 - var7), param5[1].field_p + param3);
                  var9 = param4 + var6_int;
                  var10 = param0 + param4 - var7;
                  param4 = var9;
                  L2: while (true) {
                    if (param4 >= var10) {
                      gf.b(fc.field_g);
                      break L0;
                    } else {
                      param5[1].d(param4, param3, param2);
                      param4 = param4 + var8;
                      continue L2;
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var6;
            stackOut_10_1 = new StringBuilder().append("mj.C(").append(param0).append(',').append(2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param5 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    final boolean h(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 >= -58) {
          L0: {
            mj.g(-58);
            if (((mj) this).a((byte) 96)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((mj) this).a((byte) 96)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    mj(String param0, String param1, long param2) {
        super(0L, (qr) null);
        CharSequence var6 = null;
        try {
            ((mj) this).field_Db = param0;
            ((mj) this).field_Cb = param1;
            ((mj) this).field_Ib = param2;
            var6 = (CharSequence) (Object) ((mj) this).field_Db;
            String discarded$0 = ji.a(var6, true);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "mj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Hb = new sm[14];
        field_Bb = new byte[250][];
        field_Rb = new bg("");
    }
}
