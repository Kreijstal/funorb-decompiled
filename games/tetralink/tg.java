/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg {
    static long field_a;
    static String field_d;
    private je field_e;
    private mc field_b;
    static volatile int field_f;
    static String field_c;

    final mc a(byte param0) {
        mc var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        mc stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = this.field_b;
          if (this.field_e.field_c == var2) {
            this.field_b = null;
            stackIn_2_0 = null;
            return (mc) (stackIn_2_0);
          }
          if (param0 != -66) {
            field_c = (String) null;
          }
          this.field_b = var2.field_e;
          stackIn_7_0 = var2;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var2_ref), "tg.B(" + param0 + ')');
        }
    }

    final mc a(boolean param0) {
        mc var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_4_0 = null;
        mc stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = this.field_e.field_c.field_j;
          if (var2 == this.field_e.field_c) {
            this.field_b = null;
            stackIn_4_0 = null;
            return (mc) (stackIn_4_0);
          }
          if (!param0) {
            this.b(63);
          }
          this.field_b = var2.field_j;
          stackIn_9_0 = var2;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var2_ref), "tg.E(" + param0 + ')');
        }
    }

    final mc a(boolean param0, mc param1) {
        mc var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_7_0 = null;
        mc stackIn_12_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null) {
            var3 = param1;
            if (TetraLink.field_J != 0) {
              var3 = this.field_e.field_c.field_e;
            }
          } else {
            var3 = this.field_e.field_c.field_e;
          }
          if (this.field_e.field_c == var3) {
            this.field_b = null;
            stackIn_7_0 = null;
            return (mc) (stackIn_7_0);
          }
          if (!param0) {
            field_c = (String) null;
          }
          this.field_b = var3.field_e;
          stackIn_12_0 = var3;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("tg.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final mc a(int param0, mc param1) {
        mc var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        mc stackIn_8_0 = null;
        mc stackIn_10_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == param1) {
            var3 = this.field_e.field_c.field_j;
            if (TetraLink.field_J != 0) {
              var3 = param1;
            }
          } else {
            var3 = param1;
          }
          if (var3 == this.field_e.field_c) {
            this.field_b = null;
            stackIn_5_0 = null;
            return (mc) (stackIn_5_0);
          }
          if (param0 >= -1) {
            stackIn_8_0 = (mc) null;
            return stackIn_8_0;
          }
          this.field_b = var3.field_j;
          stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("tg.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final mc b(byte param0) {
        mc var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_7_0 = null;
        mc stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = this.field_b;
          if (param0 != -58) {
            tg.a(87);
          }
          if (this.field_e.field_c == var2) {
            this.field_b = null;
            stackIn_7_0 = null;
            return (mc) (stackIn_7_0);
          }
          this.field_b = var2.field_j;
          stackIn_9_0 = var2;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var2_ref), "tg.G(" + param0 + ')');
        }
    }

    final mc b(int param0) {
        mc var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        Object stackIn_2_0 = null;
        mc stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = this.field_e.field_c.field_e;
          if (var2 == this.field_e.field_c) {
            this.field_b = null;
            stackIn_2_0 = null;
            return (mc) (stackIn_2_0);
          }
          this.field_b = var2.field_e;
          var3 = -100 / ((param0 - 40) / 42);
          stackIn_4_0 = var2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var2_ref), "tg.F(" + param0 + ')');
        }
    }

    tg(je param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_e = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("tg.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        try {
          field_c = null;
          field_d = null;
          if (param0 != 0) {
            field_f = 18;
          }
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "tg.D(" + param0 + ')');
        }
    }

    final static void a(int param0, hl param1, hl param2, jb param3, hl param4, hl param5, hl param6, hl param7, boolean param8, hl param9, hl param10, bl param11) {
        String stackIn_24_0 = null;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_51_2 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_59_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_67_2 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        oh var12 = null;
        RuntimeException var12_ref = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        oh[] var16 = null;
        hl var17 = null;
        int var18 = 0;
        String var19 = null;
        int var20 = 0;
        var20 = TetraLink.field_J;
        try {
          pg.field_f[2] = 9474303;
          pg.field_f[0] = 16764000;
          we.field_k = param3;
          pg.field_f[1] = 6356832;
          ll.field_A = param1;
          go.field_c = param8;
          pg.field_f[3] = 16736511;
          pg.field_f[4] = 16711935;
          pg.field_f[4] = 16711935;
          un.field_j[0] = 16764000;
          un.field_j[2] = 16736352;
          t.field_l = 8421504;
          un.field_j[1] = 6356832;
          un.field_j[3] = 16736511;
          var12 = new oh(4, 4);
          var13 = var12.field_C;
          var14 = var12.field_C;
          var12.field_C[15] = 7368816;
          var15 = var12.field_C;
          var15[8] = 7368816;
          var13[2] = 7368816;
          var14[5] = 7368816;
          var16 = new oh[9];
          var16[4] = var12;
          oj.field_a = new hl(0L, param4);
          ea.field_f = new hl(0L, param10);
          oj.field_a.a((byte) 73, ea.field_f);
          var17 = new hl(0L, (hl) null);
          var17.field_fb = new je();
          id.field_M = new rb(0L, var17, param5, param11);
          ea.field_f.a((byte) -97, id.field_M);
          pj.field_d = new hl(0L, param6);
          ea.field_f.a((byte) -123, pj.field_d);
          in.field_g = new hl(0L, param7);
          in.field_g.field_Ib = we.field_k;
          pj.field_d.a((byte) 89, in.field_g);
          pj.field_d.c((byte) 84);
          ba.field_L = new hl(0L, (hl) null);
          ba.field_L.field_Eb = var16;
          pj.field_d.a((byte) -124, ba.field_L);
          el.field_oc = new hl[5];
          nj.field_f = new hl[5];
          fh.field_f = new hl[5];
          og.field_o = new hl[5];
          var18 = param0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (5 <= var18))) {
            stackIn_28_0 = var18;
            if (var20 == 0) {
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_28_0 != 0) {
                if (var18 == 1 &&
                  go.field_c) {
                  var19 = rl.field_e;
                } else {
                  decompiledFrameRemainder0 = (var18 == 2);
                  if (decompiledFrameRemainder0) {
                    var19 = im.field_b;
                  }
                }
              } else {
                if (go.field_c) {
                  stackIn_24_0 = nm.field_v;
                } else {
                  stackIn_24_0 = r.field_v;
                }
                var19 = stackIn_24_0;
              }
              if (decompiledFrameRemainder0) {
                nj.field_f[var18] = new hl(0L, param9);
                el.field_oc[var18] = new hl(0L, ll.field_A, var19);
                fh.field_f[var18] = new hl(0L, (hl) null);
                fh.field_f[var18].field_J = 1;
                og.field_o[var18] = new hl(0L, ll.field_A);
                og.field_o[var18].field_J = 1;
                nj.field_f[var18].a((byte) -88, el.field_oc[var18]);
                nj.field_f[var18].a((byte) 14, fh.field_f[var18]);
                nj.field_f[var18].a((byte) -106, og.field_o[var18]);
                nj.field_f[var18].c((byte) -96);
                oj.field_a.a((byte) -111, nj.field_f[var18]);
                v.field_r = v.field_r + 1;
              }
              var18++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            nc.field_e = new hl(0L, param2);
            nc.field_e.field_jb = bd.field_f;
            oj.field_a.a((byte) 47, nc.field_e);
            stackIn_28_0 = r.d(0) ? 1 : 0;
          }
          if (stackIn_28_0 != 0 &&
            !cd.field_a) {
            return;
          }
          bk.field_e = new lb(0, 0, 0, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12_ref = decompiledCaughtException;
          stackIn_38_0 = var12_ref;
          stackIn_38_1 = new StringBuilder().append("tg.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          stackIn_42_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',');
          if (param2 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          stackIn_46_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',');
          if (param3 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          stackIn_50_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',');
          if (param4 == null) {
            stackIn_51_2 = "null";
          } else {
            stackIn_51_2 = "{...}";
          }
          stackIn_54_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',');
          if (param5 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          stackIn_58_1 = ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',');
          if (param6 == null) {
            stackIn_59_2 = "null";
          } else {
            stackIn_59_2 = "{...}";
          }
          stackIn_62_1 = ((StringBuilder) (Object) stackIn_58_1).append(stackIn_59_2).append(',');
          if (param7 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          stackIn_66_1 = ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_67_2 = "null";
          } else {
            stackIn_67_2 = "{...}";
          }
          stackIn_70_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_67_2).append(',');
          if (param10 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',');
          if (param11 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(')').toString());
        }
    }

    static {
        field_f = 0;
        field_c = "Music: ";
    }
}
