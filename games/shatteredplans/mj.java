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
        L0: {
          if (dn.field_k != null) {
            dk.a((byte) 54, dn.field_k);
            break L0;
          } else {
            break L0;
          }
        }
        if (hp.field_m == null) {
          if (param0 != 0) {
            return;
          } else {
            L1: {
              r.a((byte) -82, param1);
              if (null != tc.field_G) {
                tc.field_G.b(param1, -68);
                break L1;
              } else {
                break L1;
              }
            }
            ho.a(param1, param0 + 8323199);
            return;
          }
        } else {
          hp.field_m.a(13505, param1);
          if (param0 != 0) {
            return;
          } else {
            L2: {
              r.a((byte) -82, param1);
              if (null != tc.field_G) {
                tc.field_G.b(param1, -68);
                break L2;
              } else {
                break L2;
              }
            }
            ho.a(param1, param0 + 8323199);
            return;
          }
        }
    }

    final boolean a(mj param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        boolean stackIn_5_0 = false;
        int stackIn_5_1 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        boolean stackIn_11_0 = false;
        int stackIn_11_1 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                field_Rb = (bg) null;
                break L1;
              }
            }
            L2: {
              stackIn_4_0 = this.field_Vb;

              if (param0.field_Vb) {
                stackIn_5_0 = stackIn_4_0;
                stackIn_5_1 = 0;
                break L2;
              } else {
                stackIn_5_0 = stackIn_4_0;
                stackIn_5_1 = 1;
                break L2;
              }
            }
            if ((stackIn_5_0 ? 1 : 0) != stackIn_5_1) {
              L3: {
                stackIn_10_0 = param0.field_Tb;

                if (this.field_Tb) {
                  stackIn_11_0 = stackIn_10_0;
                  stackIn_11_1 = 0;
                  break L3;
                } else {
                  stackIn_11_0 = stackIn_10_0;
                  stackIn_11_1 = 1;
                  break L3;
                }
              }
              if ((stackIn_11_0 ? 1 : 0) != stackIn_11_1) {
                L4: {
                  if ((this.field_zb ^ -1L) <= (param0.field_zb ^ -1L)) {
                    stackIn_17_0 = 0;
                    break L4;
                  } else {
                    stackIn_17_0 = 1;
                    break L4;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_13_0 = this.field_Tb;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_7_0 = this.field_Vb;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3);

            stackIn_20_1 = new StringBuilder().append("mj.B(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0;
          } else {
            return stackIn_17_0 != 0;
          }
        }
    }

    final void a(String param0, String param1, byte param2) {
        CharSequence var5 = null;
        this.field_Db = param1;
        if (param2 <= 1) {
            return;
        }
        try {
            this.field_Cb = param0;
            var5 = (CharSequence) ((Object) this.field_Db);
            ji.a(var5, true);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "mj.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
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
          field_Bb = (byte[][]) null;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, bi[] param5) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param5 == null) {
                break L1;
              } else {
                if ((param0 ^ -1) >= -1) {
                  break L1;
                } else {
                  var6_int = param5[0].field_o;
                  var7 = param5[param1].field_o;
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
                      decompiledRegionSelector0 = 1;
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
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var6);

            stackIn_12_1 = new StringBuilder().append("mj.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean h(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 >= -58) {
          L0: {
            mj.g(-58);
            if (this.a((byte) 96)) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.a((byte) 96)) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
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
            this.field_Db = param0;
            this.field_Cb = param1;
            this.field_Ib = param2;
            var6 = (CharSequence) ((Object) this.field_Db);
            ji.a(var6, true);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "mj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_Hb = new sm[14];
        field_Bb = new byte[250][];
        field_Rb = new bg("");
    }
}
