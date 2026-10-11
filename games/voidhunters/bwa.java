/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bwa extends llb {
    private llb field_vb;
    private StringBuilder field_Fb;
    private llb field_Cb;
    long field_yb;
    private int field_xb;
    private llb field_Ab;
    private llb field_Bb;
    private qca field_wb;
    private llb field_zb;
    private llb[] field_Db;
    private llb field_Eb;

    final boolean e(byte param0) {
        int discarded$1 = 0;
        llb var3;
        boolean stackIn_6_0 = false;
        if (param0 >= -59) {
          var3 = (llb) null;
          discarded$1 = this.a(44, (llb) null, (String) null, 120, 54, (llb) null);
        }
        stackIn_6_0 = (null != this.field_wb) && (this.field_wb.field_J);
        return stackIn_6_0;
    }

    final String i(int param0) {
        if (param0 != 0) {
          return (String) null;
        }
        return this.field_Fb.toString();
    }

    final boolean h(int param0) {
        if (this.field_xb != -2) {
          return false;
        }
        if (13 == pma.field_o) {
          this.field_xb = -1;
        }
        if (param0 != -15244) {
          this.field_yb = 44L;
          return true;
        }
        return true;
    }

    private final int a(llb param0, int param1, int param2, llb param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param1 += 8;
          var6_int = param3.field_eb.b(param3.field_R, -(param3.field_w * 2) + param2, param3.field_D);
          param3.a(0, 125, param2, param1, var6_int);
          param1 = param1 + (var6_int - 0);
          if (param4 != 28488) {
            this.field_Eb = (llb) null;
          }
          param0.b(param4 ^ -28025, param3);
          stackIn_3_0 = param1;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_6_0 = var6;
          stackIn_6_1 = new StringBuilder().append("bwa.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(')').toString());
        }
    }

    bwa(int param0, int param1, int param2, int param3, int param4, llb param5, llb param6, llb param7, llb param8, qca param9, llb param10, String param11, long param12) {
        super(0L, param5);
        StringBuilder discarded$1 = null;
        int var15_int = 0;
        llb[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        llb[] var28 = null;
        Object stackIn_8_0;
        qca stackIn_8_1;
        qca stackIn_8_2;
        long stackIn_8_3;
        qca stackIn_8_4;
        Object stackIn_9_0;
        qca stackIn_9_1;
        qca stackIn_9_2;
        String stackIn_9_5;
        llb stackIn_15_0 = null;
        boolean stackIn_16_1 = false;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_58_2 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_61_2 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_64_2 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_67_2 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15_ref = null;
        Object stackIn_8_0Lifetime1;
        qca stackIn_8_1Lifetime1;
        qca stackIn_8_2Lifetime1;
        Object stackIn_9_0Lifetime1;
        qca stackIn_9_1Lifetime1;
        qca stackIn_9_2Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var16Lifetime2;
        int var17Lifetime2;
        int var17Lifetime3;
        int var17Lifetime4;
        int var17Lifetime5;
        int var18Lifetime2;
        int var18Lifetime3;
        int var18Lifetime4;
        int var18Lifetime5;
        int var20Lifetime2;
        int var20Lifetime3;
        this.field_xb = -2;
        try {
          this.field_yb = param12;
          this.field_Cb = new llb(0L, param6, hpb.field_j.toUpperCase());
          this.field_Cb.field_F = 1;
          this.b(-561, this.field_Cb);
          this.field_zb = new llb(0L, param7);
          this.field_Cb.b(-561, this.field_zb);
          this.field_Ab = new llb(0L, (llb) null);
          this.b(-561, this.field_Ab);
          if (param11 != null) {
            this.field_Bb = new llb(0L, param8, lcb.field_p);
            this.field_Bb.field_Y = 11184810;
            this.field_Bb.field_F = 1;
            this.field_Ab.b(-561, this.field_Bb);
            this.field_vb = new llb(0L, param8, fh.field_j);
            this.field_vb.field_Y = 11184810;
            this.field_vb.field_F = 1;
            this.field_Ab.b(-561, this.field_vb);
            this.field_Eb = new llb(0L, param8);
            this.field_Eb.field_Y = 16764006;
            this.field_Ab.b(-561, this.field_Eb);
            this.field_Eb.field_s = "|";
            if (!(nfa.field_d < 5) ||
              !(go.field_p < 2)) {
              L3: {
                stackIn_8_0 = this;
                stackIn_8_1 = null;
                stackIn_8_2 = null;
                stackIn_8_3 = 0L;
                stackIn_8_4 = (qca) (param9);
                if (nfa.field_d < 7) {
                  stackIn_8_0Lifetime1 = this;
                  stackIn_8_1Lifetime1 = null;
                  stackIn_8_2Lifetime1 = null;
                  if (go.field_p < 2) {
                    stackIn_9_0 = this;
                    stackIn_9_1 = null;
                    stackIn_9_2 = null;
                    stackIn_9_5 = po.field_p;
                    break L3;
                  }
                }
                stackIn_9_0Lifetime1 = this;
                stackIn_9_1Lifetime1 = null;
                stackIn_9_2Lifetime1 = null;
                stackIn_9_5 = pqa.field_p;
              }
              this.field_wb = new qca(stackIn_8_3, stackIn_8_4, stackIn_9_5);
              this.field_Ab.b(-561, this.field_wb);
            }
            var28 = new llb[3];
            var15 = var28;
            var28[0] = new llb(0L, (llb) null);
            this.field_Ab.b(-561, var28[0]);
            var28[1] = new llb(0L, (llb) null);
            this.field_Ab.b(-561, var28[1]);
            var28[2] = new llb(0L, (llb) null);
            this.field_Ab.b(-561, var28[2]);
            this.field_Db = new llb[fva.field_o];
            for (var16 = 0; fva.field_o > var16; var16++) {
              if (egb.field_o[var16] != null) {
                this.field_Db[var16] = new llb(0L, param10, egb.field_o[var16]);
                this.field_Db[var16].field_F = 0;
                stackIn_15_0 = this.field_Db[var16];
                stackIn_16_1 = (param11 != null);
                stackIn_15_0.field_y = stackIn_16_1;
                this.field_Ab.b(-561, this.field_Db[var16]);
              }
            }
            this.field_Fb = new StringBuilder(12);
            if (param11 != null) {
              discarded$1 = this.field_Fb.append(param11);
            }
            var16Lifetime2 = 0;
            var17 = param6.field_eb.b(gca.field_p);
            if (var16Lifetime2 < var17) {
              var16Lifetime2 = var17;
            }
            var17Lifetime2 = param6.field_eb.b(oqb.field_n);
            if (var17Lifetime2 > var16Lifetime2) {
              var16Lifetime2 = var17Lifetime2;
            }
            var17Lifetime3 = param6.field_eb.b(jrb.field_p);
            if (var17Lifetime3 > var16Lifetime2) {
              var16Lifetime2 = var17Lifetime3;
            }
            for (var17Lifetime4 = 0; var17Lifetime4 < fva.field_o; var17Lifetime4++) {
              if (null != this.field_Db[var17Lifetime4]) {
                var18 = this.field_Db[var17Lifetime4].e(80);
                if (var16Lifetime2 < var18) {
                  var16Lifetime2 = var18;
                }
              }
            }
            if (var16Lifetime2 > 140) {
              var16Lifetime2 = 140;
            }
            var17Lifetime5 = 0;
            var18Lifetime2 = 0;
            var18Lifetime3 = 0;
            var18Lifetime3 = this.a(6300, var28[0], gca.field_p, var16Lifetime2, var18Lifetime3, param6);
            var18Lifetime3 = this.a(var28[0], var18Lifetime3, var16Lifetime2, this.field_Db[6], 28488);
            var18Lifetime3 = this.a(var28[0], var18Lifetime3, var16Lifetime2, this.field_Db[9], 28488);
            var18Lifetime3 = this.a(var28[0], var18Lifetime3, var16Lifetime2, this.field_Db[5], 28488);
            var18Lifetime3 = this.a(var28[0], var18Lifetime3, var16Lifetime2, this.field_Db[7], 28488);
            var18Lifetime3 = this.a(var28[0], var18Lifetime3, var16Lifetime2, this.field_Db[15], 28488);
            var18Lifetime3 = this.a(var28[0], var18Lifetime3, var16Lifetime2, this.field_Db[4], 28488);
            if (var18Lifetime3 > var17Lifetime5) {
              var17Lifetime5 = var18Lifetime3;
            }
            var18Lifetime4 = 0;
            var18Lifetime4 = this.a(6300, var28[1], oqb.field_n, var16Lifetime2, var18Lifetime4, param6);
            var18Lifetime4 = this.a(var28[1], var18Lifetime4, var16Lifetime2, this.field_Db[16], 28488);
            var18Lifetime4 = this.a(var28[1], var18Lifetime4, var16Lifetime2, this.field_Db[17], 28488);
            var18Lifetime4 = this.a(var28[1], var18Lifetime4, var16Lifetime2, this.field_Db[18], 28488);
            var18Lifetime4 = this.a(var28[1], var18Lifetime4, var16Lifetime2, this.field_Db[19], 28488);
            var18Lifetime4 = this.a(var28[1], var18Lifetime4, var16Lifetime2, this.field_Db[20], 28488);
            if (var18Lifetime4 > var17Lifetime5) {
              var17Lifetime5 = var18Lifetime4;
            }
            var18Lifetime5 = 0;
            var18Lifetime5 = this.a(6300, var28[2], jrb.field_p, var16Lifetime2, var18Lifetime5, param6);
            var18Lifetime5 = this.a(var28[2], var18Lifetime5, var16Lifetime2, this.field_Db[13], 28488);
            var18Lifetime5 = this.a(var28[2], var18Lifetime5, var16Lifetime2, this.field_Db[21], 28488);
            var18Lifetime5 = this.a(var28[2], var18Lifetime5, var16Lifetime2, this.field_Db[11], 28488);
            if (var18Lifetime5 > var17Lifetime5) {
              var17Lifetime5 = var18Lifetime5;
            }
            var19 = var16Lifetime2 * 3 + 26;
            var20 = this.field_Cb.e(112);
            if (var19 < var20) {
              var19 = var20;
            }
            if (this.field_wb != null) {
              var20Lifetime2 = this.field_wb.b(4, 0);
              if (var19 < var20Lifetime2) {
                var19 = var20Lifetime2;
              }
            }
            this.field_Cb.a(0, 35, 13 + (var19 + 13), 0, 24);
            this.field_zb.a(this.field_Cb.field_hb - 20, 119, 15, 5, 15);
            var21 = 10;
            this.field_Bb.a(13, 118, var19, var21, nna.field_w * 2);
            var21 = var21 + 2 * nna.field_w;
            this.field_vb.a(13, 122, var19, var21, nna.field_w * 2);
            var21 = var21 + (nna.field_w * 2 + 10);
            this.field_Eb.a(0, -104, 0, var21, nna.field_w);
            var21 = var21 + (10 + nna.field_w);
            if (this.field_wb != null) {
              var20Lifetime3 = this.field_wb.b(4, 0);
              this.field_wb.a((-var20Lifetime3 + var19) / 2 + 13, nna.field_w, 4, var21, var20Lifetime3, false);
              var21 = var21 + (nna.field_w + 10);
            }
            var28[0].a(13, 122, var16Lifetime2, var21, var17Lifetime5);
            var28[1].a(13 + (13 + var16Lifetime2), -106, var16Lifetime2, var21, var17Lifetime5);
            var28[2].a(39 + 2 * var16Lifetime2, -128, var16Lifetime2, var21, var17Lifetime5);
            var22 = var21;
            this.field_Ab.a(0, -94, var19 + 13 + 13, 24, 10 + var17Lifetime5 + var22);
            this.field_Ab.field_gb = uwa.a(11579568, this.field_Ab.field_G, 2105376, 8421504, 104, 3);
            var23 = 26 + var19;
            var24 = 10 + (24 + (var22 + var17Lifetime5));
            var25 = jv.a((byte) -109, param0, param2, var23);
            var26 = lma.a(param3, param1, var24, (byte) -16);
            this.a(var25, 0, var23, var26, var24);
            return;
          }
          this.field_Bb = new llb(0L, param8, vgb.field_q);
          this.field_Bb.field_Y = 11184810;
          this.field_Bb.field_F = 1;
          this.field_Ab.b(-561, this.field_Bb);
          var15_int = 226;
          var16Lifetime1 = 10;
          var17Lifetime1 = this.field_Bb.field_eb.c(this.field_Bb.field_R, var15_int);
          this.field_Bb.a(13, -65, var15_int, var16Lifetime1, nna.field_w * var17Lifetime1);
          var16Lifetime1 = var16Lifetime1 + var17Lifetime1 * nna.field_w;
          this.field_Ab.a(0, 116, 13 + var15_int + 13, 24, var16Lifetime1 + 10);
          this.field_Ab.field_gb = uwa.a(11579568, this.field_Ab.field_G, 2105376, 8421504, 117, 3);
          var18Lifetime1 = 13 + (var15_int + 13);
          var19Lifetime1 = 34 + var16Lifetime1;
          var20Lifetime1 = jv.a((byte) -109, param0, param2, var18Lifetime1);
          var21Lifetime1 = lma.a(param3, param1, var19Lifetime1, (byte) -16);
          this.a(var20Lifetime1, -77, var18Lifetime1, var21Lifetime1, var19Lifetime1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15_ref = decompiledCaughtException;
          stackIn_51_0 = var15_ref;
          stackIn_51_1 = new StringBuilder().append("bwa.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          stackIn_54_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',');
          if (param6 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          stackIn_57_1 = ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',');
          if (param7 == null) {
            stackIn_58_2 = "null";
          } else {
            stackIn_58_2 = "{...}";
          }
          stackIn_60_1 = ((StringBuilder) (Object) stackIn_57_1).append(stackIn_58_2).append(',');
          if (param8 == null) {
            stackIn_61_2 = "null";
          } else {
            stackIn_61_2 = "{...}";
          }
          stackIn_63_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_61_2).append(',');
          if (param9 == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          stackIn_66_1 = ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(',');
          if (param10 == null) {
            stackIn_67_2 = "null";
          } else {
            stackIn_67_2 = "{...}";
          }
          stackIn_69_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_67_2).append(',');
          if (param11 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param12).append(')').toString());
        }
    }

    final static boolean a(int param0, byte param1, int param2) {
        if (param1 <= 118) {
          return true;
        }
        return (32 & param0) != 0 ? true : false;
    }

    private final int a(int param0, llb param1, String param2, int param3, int param4, llb param5) {
        int discarded$1 = 0;
        llb var7 = null;
        RuntimeException var7_ref = null;
        llb var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = new llb(0L, param5, 0, param4, param3, 24, param2);
          if (param0 != 6300) {
            var8 = (llb) null;
            discarded$1 = this.a(-27, (llb) null, (String) null, -91, 109, (llb) null);
          }
          param1.b(-561, var7);
          param4 += 32;
          stackIn_3_0 = param4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_6_0 = var7_ref;
          stackIn_6_1 = new StringBuilder().append("bwa.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final int c(boolean param0, int param1) {
        int var3 = 0;
        qca stackIn_7_0 = null;
        boolean stackIn_8_1 = false;
        llb stackIn_16_0 = null;
        boolean stackIn_17_1 = false;
        int var4;
        var4 = VoidHunters.field_G;
        this.a(param0, 1332);
        if (null != this.field_Eb) {
          this.field_Eb.field_R = this.field_Fb.toString();
          this.field_Eb.field_L = (this.field_hb - this.field_Eb.field_eb.b(this.field_Eb.field_R)) / 2;
          this.field_Eb.field_hb = this.field_hb - this.field_Eb.field_L;
          if (this.field_wb != null &&
            this.field_wb.field_o != 0) {
            stackIn_7_0 = this.field_wb;
            stackIn_8_1 = !(this.field_wb.field_J);
            stackIn_7_0.field_J = stackIn_8_1;
          }
          for (var3 = 0; var3 < fva.field_o; var3++) {
            if (null != this.field_Db[var3]) {
              stackIn_16_0 = this.field_Db[var3];
              stackIn_17_1 = !(0 >= this.field_Fb.length());
              stackIn_16_0.field_y = stackIn_17_1;
              if (this.field_Db[var3].field_y &&
                this.field_Db[var3].field_o != 0) {
                return var3;
              }
            }
          }
        }
        if (param1 != -8703) {
          return -41;
        }
        if (this.field_zb.field_o != 0) {
          return -1;
        }
        if (param0 &&
          pba.field_o != 0 &&
          0 == this.field_o) {
          return -1;
        }
        return this.field_xb;
    }

    static {
    }
}
