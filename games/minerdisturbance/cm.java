/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm extends pi {
    static ae field_p;
    int field_s;
    static int field_r;
    static int field_o;
    static int field_q;
    static int field_n;

    final static void a(byte param0, boolean param1, int param2, hn param3, boolean param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            L1: {
              v.field_b[0] = dk.field_a.nextInt();
              v.field_b[1] = dk.field_a.nextInt();
              rf.field_c.field_o = 0;
              v.field_b[2] = (int)(gd.field_s >> -2078212512);
              v.field_b[3] = (int)gd.field_s;
              rf.field_c.a((byte) 81, v.field_b[0]);
              rf.field_c.a((byte) 125, v.field_b[1]);
              rf.field_c.a((byte) 119, v.field_b[2]);
              rf.field_c.a((byte) 114, v.field_b[3]);
              ij.a(true, rf.field_c);
              rf.field_c.b((byte) 125, param2);
              param3.a(rf.field_c, (byte) -87);
              sn.field_c.field_o = 0;
              if (param1) {
                sn.field_c.c(18, 25564);
                break L1;
              } else {
                sn.field_c.c(16, 25564);
                break L1;
              }
            }
            L2: {
              sn.field_c.field_o = sn.field_c.field_o + 2;
              var5_int = sn.field_c.field_o;
              sn.field_c.a((byte) 106, mh.field_c);
              sn.field_c.b(-1, bj.field_a);
              var6 = 0;
              if (v.field_e) {
                var6 = var6 | 1;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (ei.field_L) {
                var6 = var6 | 4;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (!param4) {
                break L4;
              } else {
                var6 = var6 | 8;
                break L4;
              }
            }
            L5: {
              if (ag.field_d == null) {
                break L5;
              } else {
                var6 = var6 | 16;
                break L5;
              }
            }
            sn.field_c.c(var6, 25564);
            if (param0 == 6) {
              L6: {
                var7 = ag.a(bm.c(-90), true);
                if (var7 == null) {
                  var7 = "";
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                sn.field_c.b(23446, var7);
                if (null == ag.field_d) {
                  break L7;
                } else {
                  sn.field_c.a(8, ag.field_d);
                  break L7;
                }
              }
              jg.a(kc.field_b, param0 + -108, rf.field_c, ph.field_g, sn.field_c);
              sn.field_c.b(sn.field_c.field_o - var5_int, param0 + -506270862);
              bk.a((byte) -64, -1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var5);
            stackOut_22_1 = new StringBuilder().append("cm.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param3 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean a(boolean param0) {
        if (!param0) {
            field_o = -3;
            return rd.a((byte) 27, bm.c(-118));
        }
        return rd.a((byte) 27, bm.c(-118));
    }

    cm(int param0) {
        this.field_s = param0;
    }

    final static void e(int param0) {
        int fieldTemp$5 = 0;
        ld var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (param0 == 24683) {
              var1 = sn.field_c;
              L1: while (true) {
                if (!ub.a(14921)) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var1.d((byte) -51, 8);
                  fieldTemp$5 = var1.field_o + 1;
                  var1.field_o = var1.field_o + 1;
                  var2 = fieldTemp$5;
                  pj.a((byte) 119, var1);
                  sn.field_c.g(-1, var1.field_o + -var2);
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var1_ref), "cm.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_p = null;
        if (param0 != 18) {
            field_p = (ae) null;
        }
    }

    static {
        field_p = new ae();
        field_n = 0;
    }
}
