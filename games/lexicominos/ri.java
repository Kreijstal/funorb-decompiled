/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ri implements ma {
    static oc field_c;
    private long field_a;
    static String field_f;
    static db field_b;
    static String field_d;
    static int field_e;

    public final sc b(byte param0) {
        String discarded$2 = null;
        if (!this.a(-104)) {
          if (rf.c(0) < this.field_a - -350L) {
            return jj.field_e;
          } else {
            if (param0 <= 114) {
              discarded$2 = this.b(34);
              return this.b(true);
            } else {
              return this.b(true);
            }
          }
        } else {
          return rc.field_a;
        }
    }

    public final void a(boolean param0) {
        Object discarded$0 = null;
        this.field_a = rf.c(0);
        if (!param0) {
            byte[] var3 = (byte[]) null;
            discarded$0 = ri.a(123, (byte[]) null, true);
        }
    }

    final static Object a(int param0, byte[] param1, boolean param2) {
        bh var3 = null;
        RuntimeException var3_ref = null;
        bh stackIn_6_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        bh stackOut_5_0 = null;
        byte[] stackOut_10_0 = null;
        byte[] stackOut_8_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (param1 != null) {
              if (param0 < param1.length) {
                var3 = new bh();
                ((nl) ((Object) var3)).a(param1, true);
                stackOut_5_0 = (bh) (var3);
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                if (!param2) {
                  stackOut_10_0 = (byte[]) (param1);
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackOut_8_0 = ld.a(param0 + -30, param1);
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3_ref);
            stackOut_12_1 = new StringBuilder().append("ri.P(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    public static void c(byte param0) {
        field_d = null;
        if (param0 != 117) {
          ri.c((byte) 46);
          field_b = null;
          field_f = null;
          field_c = null;
          return;
        } else {
          field_b = null;
          field_f = null;
          field_c = null;
          return;
        }
    }

    public final String a(byte param0) {
        int var2 = 0;
        var2 = 6 / ((34 - param0) / 42);
        if (!this.a(110)) {
          if (rf.c(0) < this.field_a - -350L) {
            return null;
          } else {
            return this.b(66);
          }
        } else {
          return null;
        }
    }

    final static void a(boolean param0, boolean param1, kb param2, byte param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            L1: {
              l.field_F[0] = q.field_a.nextInt();
              l.field_F[1] = q.field_a.nextInt();
              l.field_F[2] = (int)(ti.field_M >> 685562592);
              of.field_a.field_h = 0;
              l.field_F[3] = (int)ti.field_M;
              of.field_a.f(l.field_F[0], param3 ^ 32335);
              of.field_a.f(l.field_F[1], -32287);
              of.field_a.f(l.field_F[2], -32287);
              of.field_a.f(l.field_F[3], -32287);
              ed.a(93, of.field_a);
              of.field_a.e(89, param4);
              param2.a(of.field_a, 7895);
              ed.field_q.field_h = 0;
              if (param1) {
                ed.field_q.c(18, -1);
                break L1;
              } else {
                ed.field_q.c(16, -1);
                if (!Lexicominos.field_L) {
                  break L1;
                } else {
                  ed.field_q.c(18, -1);
                  break L1;
                }
              }
            }
            L2: {
              ed.field_q.field_h = ed.field_q.field_h + 2;
              var5_int = ed.field_q.field_h;
              ed.field_q.f(bk.field_a, -32287);
              ed.field_q.a(fa.field_a, (byte) 37);
              var6 = 0;
              if (hl.field_F) {
                var6 = var6 | 1;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (qb.field_c) {
                var6 = var6 | 4;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param0) {
                var6 = var6 | 8;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (null == og.field_b) {
                break L5;
              } else {
                var6 = var6 | 16;
                break L5;
              }
            }
            L6: {
              ed.field_q.c(var6, -1);
              var7 = pg.a(kk.c(-14047), (byte) -28);
              if (var7 != null) {
                break L6;
              } else {
                var7 = "";
                break L6;
              }
            }
            L7: {
              ed.field_q.a(var7, (byte) 0);
              if (null == og.field_b) {
                break L7;
              } else {
                ed.field_q.a((byte) -38, og.field_b);
                break L7;
              }
            }
            L8: {
              wc.a(wb.field_m, ed.field_q, re.field_T, (byte) 111, of.field_a);
              ed.field_q.b(-var5_int + ed.field_q.field_h, (byte) 26);
              if (param3 == -82) {
                break L8;
              } else {
                field_f = (String) null;
                break L8;
              }
            }
            kc.a(-1, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var5);
            stackOut_24_1 = new StringBuilder().append("ri.Q(").append(param0).append(',').append(param1).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    abstract sc b(boolean param0);

    abstract String b(int param0);

    static {
        field_f = "This game has been updated! Please reload this page.";
        field_c = new oc();
        field_d = "Create a free Account";
    }
}
