/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc extends ci {
    private ci field_Eb;
    long field_Lb;
    private ci field_Fb;
    private ci field_Hb;
    private ci field_Ib;
    private int field_Gb;
    private ci[] field_Jb;
    private ci field_Nb;
    private ci field_Ob;
    static String field_Qb;
    private he field_Kb;
    private StringBuilder field_Pb;
    static String field_Mb;

    private final int a(ci param0, int param1, int param2, byte param3, ci param4) {
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
          if (param3 != -42) {
            this.a(false);
          }
          var6_int = param4.field_xb.b(param4.field_db, -(param4.field_z * 2) + param2, param4.field_K);
          param4.a(0, param2, -2147483648, var6_int, param1);
          param0.a((byte) 127, param4);
          param1 = param1 + (0 + var6_int);
          stackIn_3_0 = param1;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_6_0 = var6;
          stackIn_6_1 = new StringBuilder().append("pc.G(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    pc(int param0, int param1, int param2, int param3, int param4, ci param5, ci param6, ci param7, ci param8, he param9, ci param10, String param11, long param12) {
        super(0L, param5);
        StringBuilder discarded$1 = null;
        RuntimeException runtimeException = null;
        ci[] var15 = null;
        int var15_int = 0;
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
        int var27 = 0;
        ci[] var28 = null;
        Object stackIn_7_0;
        he stackIn_7_1;
        he stackIn_7_2;
        long stackIn_7_3;
        he stackIn_7_4;
        Object stackIn_8_0;
        he stackIn_8_1;
        he stackIn_8_2;
        String stackIn_8_5;
        ci stackIn_15_0 = null;
        boolean stackIn_16_1 = false;
        Object stackIn_19_0 = null;
        String stackIn_19_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_59_2 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_62_2 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_65_2 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackIn_7_0Lifetime1;
        he stackIn_7_1Lifetime1;
        he stackIn_7_2Lifetime1;
        Object stackIn_8_0Lifetime1;
        he stackIn_8_1Lifetime1;
        he stackIn_8_2Lifetime1;
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
        int var18Lifetime2;
        int var18Lifetime3;
        int var18Lifetime4;
        int var18Lifetime5;
        int var20Lifetime2;
        int var20Lifetime3;
        var27 = Chess.field_G;
        this.field_Gb = -2;
        try {
          this.field_Lb = param12;
          this.field_Nb = new ci(0L, param6, se.field_W.toUpperCase());
          this.field_Nb.field_fb = 1;
          this.a((byte) 125, this.field_Nb);
          this.field_Fb = new ci(0L, param7);
          this.field_Nb.a((byte) 126, this.field_Fb);
          this.field_Eb = new ci(0L, (ci) null);
          this.a((byte) 125, this.field_Eb);
          if (param11 != null) {
            this.field_Hb = new ci(0L, param8, af.field_a);
            this.field_Hb.field_ib = 11184810;
            this.field_Hb.field_fb = 1;
            this.field_Eb.a((byte) 127, this.field_Hb);
            this.field_Ob = new ci(0L, param8, td.field_m);
            this.field_Ob.field_fb = 1;
            this.field_Ob.field_ib = 11184810;
            this.field_Eb.a((byte) 124, this.field_Ob);
            this.field_Ib = new ci(0L, param8);
            this.field_Ib.field_ib = 16764006;
            this.field_Eb.a((byte) 125, this.field_Ib);
            this.field_Ib.field_S = "|";
            if (!(5 > sb.field_rb) ||
              !(sk.field_t < 2)) {
              L4: {
                stackIn_7_0 = this;
                stackIn_7_1 = null;
                stackIn_7_2 = null;
                stackIn_7_3 = 0L;
                stackIn_7_4 = (he) (param9);
                if (sb.field_rb < 7) {
                  stackIn_7_0Lifetime1 = this;
                  stackIn_7_1Lifetime1 = null;
                  stackIn_7_2Lifetime1 = null;
                  if (sk.field_t < 2) {
                    stackIn_8_0 = this;
                    stackIn_8_1 = null;
                    stackIn_8_2 = null;
                    stackIn_8_5 = jd.field_a;
                    break L4;
                  }
                }
                stackIn_8_0Lifetime1 = this;
                stackIn_8_1Lifetime1 = null;
                stackIn_8_2Lifetime1 = null;
                stackIn_8_5 = h.field_m;
              }
              this.field_Kb = new he(stackIn_7_3, stackIn_7_4, stackIn_8_5);
              this.field_Eb.a((byte) 127, this.field_Kb);
            }
            var28 = new ci[3];
            var15 = var28;
            var28[0] = new ci(0L, (ci) null);
            this.field_Eb.a((byte) 126, var28[0]);
            var28[1] = new ci(0L, (ci) null);
            this.field_Eb.a((byte) 126, var28[1]);
            var28[2] = new ci(0L, (ci) null);
            this.field_Eb.a((byte) 124, var28[2]);
            this.field_Jb = new ci[re.field_j];
            var16 = 0;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (!(var16 < re.field_j)))) {
              stackIn_19_0 = null;
              stackIn_19_1 = mi.field_t[var16];
              if (var27 == 0) {
                if (stackIn_19_0 != stackIn_19_1) {
                  this.field_Jb[var16] = new ci(0L, param10, mi.field_t[var16]);
                  this.field_Jb[var16].field_fb = 0;
                  stackIn_15_0 = this.field_Jb[var16];
                  stackIn_16_1 = (param11 != null);
                  stackIn_15_0.field_tb = stackIn_16_1;
                  this.field_Eb.a((byte) 125, this.field_Jb[var16]);
                }
                var16++;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              this.field_Pb = new StringBuilder(12);
              stackIn_19_0 = null;
              stackIn_19_1 = (String) (param11);
            }
            if (stackIn_19_0 != stackIn_19_1) {
              discarded$1 = this.field_Pb.append(param11);
            }
            var16Lifetime2 = 0;
            var17 = param6.field_xb.b(cl.field_h);
            if (var16Lifetime2 < var17) {
              var16Lifetime2 = var17;
            }
            var17Lifetime2 = param6.field_xb.b(nb.field_Gb);
            if (var16Lifetime2 < var17Lifetime2) {
              var16Lifetime2 = var17Lifetime2;
            }
            var17Lifetime3 = param6.field_xb.b(qh.field_d);
            if (var16Lifetime2 < var17Lifetime3) {
              var16Lifetime2 = var17Lifetime3;
            }
            var17Lifetime4 = 0;
            while (true) {
              if (!(var17Lifetime4 < re.field_j)) {
                if (var16Lifetime2 > 140) {
                  var16Lifetime2 = 140;
                }
                var17Lifetime4 = 0;
                break;
              }
              if (var27 == 0) {
                if (this.field_Jb[var17Lifetime4] != null) {
                  var18 = this.field_Jb[var17Lifetime4].e((byte) -88);
                  if (var18 > var16Lifetime2) {
                    var16Lifetime2 = var18;
                  }
                }
                var17Lifetime4++;
                continue;
              }
              break;
            }
            var18Lifetime2 = 0;
            var18Lifetime3 = 0;
            var18Lifetime3 = this.a(cl.field_h, (byte) 108, param6, var18Lifetime3, var16Lifetime2, var28[0]);
            var18Lifetime3 = this.a(var28[0], var18Lifetime3, var16Lifetime2, (byte) -42, this.field_Jb[6]);
            var18Lifetime3 = this.a(var28[0], var18Lifetime3, var16Lifetime2, (byte) -42, this.field_Jb[9]);
            var18Lifetime3 = this.a(var28[0], var18Lifetime3, var16Lifetime2, (byte) -42, this.field_Jb[5]);
            var18Lifetime3 = this.a(var28[0], var18Lifetime3, var16Lifetime2, (byte) -42, this.field_Jb[7]);
            var18Lifetime3 = this.a(var28[0], var18Lifetime3, var16Lifetime2, (byte) -42, this.field_Jb[15]);
            var18Lifetime3 = this.a(var28[0], var18Lifetime3, var16Lifetime2, (byte) -42, this.field_Jb[4]);
            if (var17Lifetime4 < var18Lifetime3) {
              var17Lifetime4 = var18Lifetime3;
            }
            var18Lifetime4 = 0;
            var18Lifetime4 = this.a(nb.field_Gb, (byte) 108, param6, var18Lifetime4, var16Lifetime2, var28[1]);
            var18Lifetime4 = this.a(var28[1], var18Lifetime4, var16Lifetime2, (byte) -42, this.field_Jb[16]);
            var18Lifetime4 = this.a(var28[1], var18Lifetime4, var16Lifetime2, (byte) -42, this.field_Jb[17]);
            var18Lifetime4 = this.a(var28[1], var18Lifetime4, var16Lifetime2, (byte) -42, this.field_Jb[18]);
            var18Lifetime4 = this.a(var28[1], var18Lifetime4, var16Lifetime2, (byte) -42, this.field_Jb[19]);
            var18Lifetime4 = this.a(var28[1], var18Lifetime4, var16Lifetime2, (byte) -42, this.field_Jb[20]);
            if (var18Lifetime4 > var17Lifetime4) {
              var17Lifetime4 = var18Lifetime4;
            }
            var18Lifetime5 = 0;
            var18Lifetime5 = this.a(qh.field_d, (byte) 108, param6, var18Lifetime5, var16Lifetime2, var28[2]);
            var18Lifetime5 = this.a(var28[2], var18Lifetime5, var16Lifetime2, (byte) -42, this.field_Jb[13]);
            var18Lifetime5 = this.a(var28[2], var18Lifetime5, var16Lifetime2, (byte) -42, this.field_Jb[21]);
            var18Lifetime5 = this.a(var28[2], var18Lifetime5, var16Lifetime2, (byte) -42, this.field_Jb[11]);
            if (var17Lifetime4 < var18Lifetime5) {
              var17Lifetime4 = var18Lifetime5;
            }
            var19 = 26 + 3 * var16Lifetime2;
            var20 = this.field_Nb.e((byte) 122);
            if (var20 > var19) {
              var19 = var20;
            }
            if (null != this.field_Kb) {
              var20Lifetime2 = this.field_Kb.a((byte) 119, 4);
              if (var20Lifetime2 > var19) {
                var19 = var20Lifetime2;
              }
            }
            this.field_Nb.a(0, 13 + (var19 + 13), -2147483648, 24, 0);
            this.field_Fb.a(-20 + this.field_Nb.field_M, 15, -2147483648, 15, 5);
            var21 = 10;
            this.field_Hb.a(13, var19, -2147483648, fe.field_g * 2, var21);
            var21 = var21 + 2 * fe.field_g;
            this.field_Ob.a(13, var19, -2147483648, fe.field_g * 2, var21);
            var21 = var21 + (fe.field_g * 2 + 10);
            this.field_Ib.a(0, 0, -2147483648, fe.field_g, var21);
            var21 = var21 + (10 + fe.field_g);
            if (this.field_Kb != null) {
              var20Lifetime3 = this.field_Kb.a((byte) 123, 4);
              this.field_Kb.a(fe.field_g, 13 + (-var20Lifetime3 + var19) / 2, (byte) 127, 4, var20Lifetime3, var21);
              var21 = var21 + (fe.field_g + 10);
            }
            var28[0].a(13, var16Lifetime2, -2147483648, var17Lifetime4, var21);
            var28[1].a(26 + var16Lifetime2, var16Lifetime2, -2147483648, var17Lifetime4, var21);
            var28[2].a(26 + 2 * var16Lifetime2 + 13, var16Lifetime2, -2147483648, var17Lifetime4, var21);
            var22 = var21;
            this.field_Eb.a(0, 13 + var19 + 13, -2147483648, var22 - (-var17Lifetime4 - 10), 24);
            this.field_Eb.field_Ab = wh.a(-116, this.field_Eb.field_pb, 3, 11579568, 8421504, 2105376);
            var23 = var19 + 13 + 13;
            var24 = 24 + var22 + (var17Lifetime4 + 10);
            var25 = ao.a(var23, true, param0, param2);
            var26 = sg.a(param1, var24, param3, 0);
            this.a(var25, var23, -2147483648, var24, var26);
            if (var27 == 0) {
              return;
            }
          }
          this.field_Hb = new ci(0L, param8, rf.field_c);
          this.field_Hb.field_ib = 11184810;
          this.field_Hb.field_fb = 1;
          this.field_Eb.a((byte) 125, this.field_Hb);
          var15_int = 226;
          var16Lifetime1 = 10;
          var17Lifetime1 = this.field_Hb.field_xb.b(this.field_Hb.field_db, var15_int);
          this.field_Hb.a(13, var15_int, -2147483648, fe.field_g * var17Lifetime1, var16Lifetime1);
          var16Lifetime1 = var16Lifetime1 + fe.field_g * var17Lifetime1;
          this.field_Eb.a(0, 13 + var15_int + 13, -2147483648, var16Lifetime1 + 10, 24);
          this.field_Eb.field_Ab = wh.a(93, this.field_Eb.field_pb, 3, 11579568, 8421504, 2105376);
          var18Lifetime1 = 26 + var15_int;
          var19Lifetime1 = var16Lifetime1 + 34;
          var20Lifetime1 = ao.a(var18Lifetime1, true, param0, param2);
          var21Lifetime1 = sg.a(param1, var19Lifetime1, param3, 0);
          this.a(var20Lifetime1, var18Lifetime1, -2147483648, var19Lifetime1, var21Lifetime1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_55_0 = runtimeException;
          stackIn_55_1 = new StringBuilder().append("pc.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          stackIn_58_1 = ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(',');
          if (param6 == null) {
            stackIn_59_2 = "null";
          } else {
            stackIn_59_2 = "{...}";
          }
          stackIn_61_1 = ((StringBuilder) (Object) stackIn_58_1).append(stackIn_59_2).append(',');
          if (param7 == null) {
            stackIn_62_2 = "null";
          } else {
            stackIn_62_2 = "{...}";
          }
          stackIn_64_1 = ((StringBuilder) (Object) stackIn_61_1).append(stackIn_62_2).append(',');
          if (param8 == null) {
            stackIn_65_2 = "null";
          } else {
            stackIn_65_2 = "{...}";
          }
          stackIn_67_1 = ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(',');
          if (param9 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          stackIn_70_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',');
          if (param10 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',');
          if (param11 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param12).append(')').toString());
        }
    }

    final String a(boolean param0) {
        if (!param0) {
          this.field_Pb = (StringBuilder) null;
        }
        return this.field_Pb.toString();
    }

    private final int a(String param0, byte param1, ci param2, int param3, int param4, ci param5) {
        ci var7 = null;
        RuntimeException var7_ref = null;
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
          var7 = new ci(0L, param2, 0, param3, param4, 24, param0);
          if (param1 != 108) {
            field_Qb = (String) null;
          }
          param5.a((byte) 126, var7);
          param3 += 32;
          stackIn_3_0 = param3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_6_0 = var7_ref;
          stackIn_6_1 = new StringBuilder().append("pc.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
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
          throw fk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final int b(boolean param0, byte param1) {
        he stackIn_6_0 = null;
        boolean stackIn_7_1 = false;
        ci stackIn_15_0 = null;
        boolean stackIn_16_1 = false;
        int var3;
        int var4;
        boolean decompiledFrameCompleted0 = true;
        var4 = Chess.field_G;
        this.a(param0, (byte) 88);
        if (this.field_Ib != null) {
          this.field_Ib.field_db = this.field_Pb.toString();
          this.field_Ib.field_mb = (this.field_M - this.field_Ib.field_xb.b(this.field_Ib.field_db)) / 2;
          this.field_Ib.field_M = -this.field_Ib.field_mb + this.field_M;
          if (this.field_Kb != null &&
            this.field_Kb.field_L != 0) {
            stackIn_6_0 = this.field_Kb;
            stackIn_7_1 = !(this.field_Kb.field_gb);
            stackIn_6_0.field_gb = stackIn_7_1;
          }
          var3 = 0;
          while (!(var3 >= re.field_j)) {
            if (var4 != 0) {
              decompiledFrameCompleted0 = false;
              break;
            }
            if (null != this.field_Jb[var3]) {
              stackIn_15_0 = this.field_Jb[var3];
              stackIn_16_1 = !(this.field_Pb.length() <= 0);
              stackIn_15_0.field_tb = stackIn_16_1;
              if (this.field_Jb[var3].field_tb &&
                this.field_Jb[var3].field_L != 0) {
                return var3;
              }
            }
            var3++;
          }
        }
        if ((decompiledFrameCompleted0) &&
          (this.field_Fb.field_L == 0)) {
          if (param0 &&
            0 != th.field_d &&
            this.field_L == 0) {
            return -1;
          }
          if (param1 != -95) {
            this.field_Ib = (ci) null;
          }
          return this.field_Gb;
        }
        return -1;
    }

    final boolean f(byte param0) {
        if (this.field_Gb != -2) {
          return false;
        }
        if (param0 != 95) {
          this.field_Nb = (ci) null;
        }
        if (vg.field_a != 13) {
          return true;
        }
        this.field_Gb = -1;
        return true;
    }

    final boolean b(boolean param0) {
        boolean stackIn_6_0 = false;
        if (param0) {
          pc.a(false, 126, false, false, 82);
        }
        stackIn_6_0 = (null != this.field_Kb) && (this.field_Kb.field_gb);
        return stackIn_6_0;
    }

    final static void a(boolean param0, int param1, boolean param2, boolean param3, int param4) {
        ci stackIn_19_0 = null;
        boolean stackIn_20_1 = false;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_69_0 = 0;
        boolean stackIn_114_0 = false;
        int stackIn_131_0 = 0;
        boolean stackIn_142_0 = false;
        boolean stackIn_159_0 = false;
        int stackIn_165_0 = 0;
        ci stackIn_184_0 = null;
        boolean stackIn_185_1 = false;
        ci stackIn_189_0 = null;
        boolean stackIn_190_1 = false;
        ci stackIn_194_0 = null;
        boolean stackIn_195_1 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_113_0;
        boolean stackOut_141_0;
        boolean stackOut_158_0;
        ci var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        ci var6 = null;
        ci var7 = null;
        ci var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        String var10_ref_String = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        int var12 = 0;
        int[] var13 = null;
        int var13_int = 0;
        String var13_ref = null;
        int var14_int = 0;
        String var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        jc var17 = null;
        Object var18 = null;
        int var18_int = 0;
        r var18_ref = null;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        String var22 = null;
        String var23 = null;
        int[] var24 = null;
        int stackIn_56_0Lifetime1;
        int stackIn_56_1Lifetime1;
        int stackIn_65_0Lifetime1;
        int var13_intLifetime1;
        int var18_intLifetime1;
        int var13_intLifetime2;
        var18 = null;
        var19 = Chess.field_G;
        try {
          f.a(ed.field_c, true);
          if (null != pd.field_Rb) {
            sc.field_d.field_tb = true;
            uj.field_j.field_pb = 0;
            var5 = uj.field_j;
            var5.field_M = 0;
            aa.field_g.field_pb = 0;
            var6 = aa.field_g;
            var6.field_M = 0;
            tn.field_j.field_pb = 0;
            var7 = tn.field_j;
            var7.field_M = 0;
            if (ci.f(-12)) {
              sc.field_f.field_db = ge.field_cb.toUpperCase();
              var9 = (2 + ri.field_k.field_M) / 2;
              uj.field_j.a(0, var9 - 2, -2147483648, 40, -40 + ri.field_k.field_pb);
              if (pd.field_Rb.field_Xb < pd.field_Rb.field_hc) {
                uj.field_j.field_db = uh.field_v.toUpperCase();
                uj.field_j.field_tb = true;
                if (var19 != 0) {
                  uj.field_j.field_db = oj.field_b.toUpperCase();
                  uj.field_j.field_tb = false;
                }
              } else {
                uj.field_j.field_db = oj.field_b.toUpperCase();
                uj.field_j.field_tb = false;
              }
              uj.field_j.field_Ab = nj.field_x.field_Ab;
              if (cb.field_f > 0) {
                boolean decompiledSharedTail2 = (1 != cb.field_f);
                if (!decompiledSharedTail2) {
                  var10_ref_String = ob.field_A;
                  decompiledSharedTail2 = (var19 != 0);
                }
                if (decompiledSharedTail2) {
                  var10_ref_String = oc.a(tg.field_b, new String[]{Integer.toString(cb.field_f)}, (byte) -119);
                }
                uj.field_j.field_db = uj.field_j.field_db + "<br>" + var10_ref_String;
                if ((16 & g.field_c) == 0 &&
                  !jh.field_a) {
                  uj.field_j.field_Ab = nj.field_x.field_Q;
                }
              }
              aa.field_g.a(var9, ri.field_k.field_M - var9, -2147483648, 40, ri.field_k.field_pb - 40);
              aa.field_g.field_db = fl.field_k.toUpperCase();
              var8 = aa.field_g;
              stackIn_19_0 = aa.field_g;
              stackIn_20_1 = (param2) && (0L == eg.field_e);
              stackIn_19_0.field_tb = stackIn_20_1;
              var10 = 2;
              if (null != hd.field_n) {
                if (null == d.field_Jb) {
                  bi.field_d = new boolean[qa.field_e];
                  d.field_Jb = new byte[qa.field_e];
                }
                var11_int = 0;
                do {
                  if (!(var11_int < qa.field_e)) {
                    var10 = 0;
                    break;
                  }
                  bi.field_d[var11_int] = false;
                  var11_int++;
                } while (var19 == 0);
                L16: while (true) {
                  if (2 > var10) {
                    var11_int = 0;
                    stackIn_69_0 = 0;
                    if (var19 != 0) {
                      break L16;
                    }
                    var12 = stackIn_69_0;
                    while (true) {
                      stackIn_35_0 = ~var12;
                      stackIn_35_1 = ~hd.field_n.length;
                      if (stackIn_35_0 > stackIn_35_1) {
                        var24 = hd.field_n[var12];
                        var21 = var24;
                        var20 = var21;
                        var13 = var20;
                        stackIn_65_0 = 0;
                        var14_int = stackIn_65_0;
                        L23: while (true) {
                          if (var24.length > var14_int) {
                            var15 = var24[var14_int];
                            var16 = var20[1 + var14_int];
                            stackIn_56_0 = var15;
                            stackIn_56_1 = -1;
                            if (stackIn_56_0 == stackIn_56_1) {
                              if (0 == var10) {
                                stackIn_44_0 = pd.field_Rb.field_hc;
                              } else {
                                stackIn_44_0 = pd.field_Rb.field_Xb;
                              }
                              var17_int = stackIn_44_0;
                              if (~var16 != ~var17_int &&
                                var19 == 0) {
                                break L23;
                              }
                            } else {
                              if (~var16 != ~(255 & pd.field_Rb.field_sc[var15]) &&
                                var19 == 0) {
                                break L23;
                              }
                            }
                            var14_int += 2;
                            continue;
                          }
                          var11_int = 1;
                          var14_int = -1;
                          var15 = 0;
                          while (true) {
                            stackIn_56_0Lifetime1 = ~var24.length;
                            stackIn_56_1Lifetime1 = ~var15;
                            if (stackIn_56_0Lifetime1 >= stackIn_56_1Lifetime1) {
                              break;
                            }
                            var16 = var24[var15];
                            stackIn_35_0 = var14_int;
                            stackIn_35_1 = var16;
                            if (stackIn_35_0 < stackIn_35_1) {
                              var14_int = var16;
                            }
                            var15 += 2;
                          }
                          bi.field_d[var14_int] = true;
                          break;
                        }
                        var12++;
                        continue;
                      }
                      break;
                    }
                    stackIn_65_0Lifetime1 = var11_int;
                    if (stackIn_65_0Lifetime1 == 0) {
                      var10++;
                      continue;
                    }
                  }
                  stackIn_69_0 = -3;
                  break;
                }
                if (!(stackIn_69_0 < ~sk.field_t) &&
                  ok.field_Jb[12]) {
                  var10 = 2;
                }
              }
              boolean decompiledFrameRemainder0 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameCompleted0 = true;
              boolean decompiledFrameRemainder3 = true;
              if ((var10 >= 2) &&
                (decompiledFrameRemainder0 = (null != t.field_L ||
                uj.field_k != null ||
                il.field_b != null ||
                nk.field_r != null))) {
                var11_int = 0;
                var12 = 0;
                var13_int = 0;
                var14_int = 0;
                var15 = 0;
                var16 = 0;
                boolean decompiledNaturalLoopExit0 = false;
                while (!(decompiledNaturalLoopExit0 = (!(var16 < qa.field_e)))) {
                  var17_int = pd.field_Rb.field_sc[var16] & 255;
                  if (var19 == 0) {
                    if (null != t.field_L &&
                      t.field_L[var16] != null &&
                      t.field_L[var16][var17_int]) {
                      var11_int = 1;
                    }
                    if (null != uj.field_k &&
                      null != uj.field_k[var16]) {
                      var18_int = uj.field_k[var16][var17_int];
                      if (var18_int > var13_int) {
                        var13_int = var18_int;
                      }
                      if (var18_int != 0 &&
                        !lf.field_U) {
                        var11_int = 1;
                      }
                    }
                    if (il.field_b != null &&
                      il.field_b[var16] != null) {
                      var18_intLifetime1 = il.field_b[var16][var17_int];
                      if (var18_intLifetime1 > var14_int) {
                        var14_int = var18_intLifetime1;
                      }
                      if (var18_intLifetime1 != 0 &&
                        !lf.field_U) {
                        var11_int = 1;
                      }
                    }
                    if (null != nk.field_r &&
                      nk.field_r[var16] != null) {
                      var15 = var15 | nk.field_r[var16][var17_int];
                    }
                    var16++;
                    continue;
                  }
                  break;
                }
                if (decompiledNaturalLoopExit0) {
                  var16 = 0;
                }
                var17 = se.field_S.field_Kb.field_I;
                var18_ref = (r) (var17.g(-18110));
                L49: while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (var18_ref != null) {
                    stackOut_113_0 = var18_ref.l(1);
                    stackIn_131_0 = stackOut_113_0 ? 1 : 0;
                    stackIn_114_0 = stackOut_113_0;
                    if (var19 != 0) {
                      break L49;
                    }
                    if (!stackIn_114_0) {
                      if (var11_int != 0 &&
                        !var18_ref.field_Hb) {
                        var16 = 1;
                        decompiledFrameRemainder1 = false;
                      }
                      else {
                        if (var13_int > var18_ref.field_Pb) {
                          var16 = 1;
                          decompiledFrameRemainder1 = false;
                        }
                        else {
                          if (var18_ref.field_Jb < var14_int) {
                            var16 = 1;
                            decompiledFrameRemainder1 = false;
                          }
                          else {
                            if ((var15 & ~var18_ref.field_Wb) > 0) {
                              var16 = 1;
                              decompiledFrameRemainder1 = false;
                            }
                            else {
                              if (var12 != 0) {
                                var16 = 1;
                                decompiledFrameRemainder1 = false;
                              }
                            }
                          }
                        }
                      }
                    }
                    if (decompiledFrameRemainder1) {
                      var18_ref = (r) (var17.a((byte) -107));
                      continue;
                    }
                  }
                  stackIn_131_0 = -3;
                  break;
                }
                if (stackIn_131_0 >= ~sk.field_t &&
                  ok.field_Jb[12]) {
                  var16 = 0;
                }
                if ((var16 == 0) &&
                  (decompiledFrameRemainder0 = (var19 != 0))) {
                  aa.field_g.field_tb = false;
                  decompiledFrameRemainder0 = !(!aa.field_g.field_Db);
                  if (decompiledFrameRemainder0) {
                    var11 = null;
                    var12 = 0;
                    var13_intLifetime2 = 0;
                    decompiledFrameRemainder3 = !(var13_intLifetime2 >= qa.field_e);
                    if (decompiledFrameRemainder3) {
                      stackOut_141_0 = bi.field_d[var13_intLifetime2];
                      stackIn_165_0 = stackOut_141_0 ? 1 : 0;
                      stackIn_142_0 = stackOut_141_0;
                      decompiledFrameRemainder2 = false;
                    }
                  }
                }
                if ((decompiledFrameRemainder3) &&
                  (decompiledFrameRemainder2) &&
                  (decompiledFrameRemainder0)) {
                  aa.field_g.field_tb = false;
                  if (aa.field_g.field_Db) {
                    boolean decompiledSharedTail1 = (qa.field_f.field_a.field_Hb != 0);
                    if (!decompiledSharedTail1) {
                      field_Mb = gh.field_e;
                      decompiledSharedTail1 = (var19 != 0);
                    }
                    if (decompiledSharedTail1) {
                      field_Mb = oc.a(wm.field_j, new String[]{sg.field_b}, (byte) -119);
                    }
                  }
                  decompiledFrameRemainder0 = (var19 != 0);
                }
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (decompiledFrameRemainder0)) {
                aa.field_g.field_tb = false;
                decompiledFrameRemainder0 = !(!aa.field_g.field_Db);
                if (decompiledFrameRemainder0) {
                  var11 = null;
                  var12 = 0;
                  var13_intLifetime1 = 0;
                  while (!(var13_intLifetime1 >= qa.field_e)) {
                    stackOut_158_0 = bi.field_d[var13_intLifetime1];
                    stackIn_165_0 = stackOut_158_0 ? 1 : 0;
                    stackIn_159_0 = stackOut_158_0;
                    if (var19 != 0) {
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                    if (stackIn_159_0) {
                      var23 = "<col=A00000>" + td.field_n[var13_intLifetime1] + "</col>";
                      if (var11 == null) {
                        var11 = var23;
                      } else {
                        var12 = 1;
                        var11 = (String) (var11) + ", " + var23;
                      }
                    }
                    var13_intLifetime1++;
                  }
                }
              }
              if ((decompiledFrameRemainder2) &&
                (decompiledFrameRemainder0) &&
                (decompiledFrameCompleted0)) {
                stackIn_165_0 = -1;
              }
              if (decompiledFrameRemainder0) {
                if (stackIn_165_0 == ~var10) {
                  var13_ref = ke.field_c;
                  boolean decompiledSharedTail0 = (var12 == 0);
                  if (!decompiledSharedTail0) {
                    var14 = ic.field_d + (String) (var11);
                    decompiledSharedTail0 = (var19 != 0);
                  }
                  if (decompiledSharedTail0) {
                    var14 = oc.a(qb.field_d, new String[]{(String) (var11)}, (byte) -88);
                  }
                } else {
                  var13_ref = jb.field_c;
                  if (var12 == 0) {
                    var14 = oc.a(ld.field_j, new String[]{(String) (var11)}, (byte) -66);
                    if (var19 != 0) {
                      var14 = field_Qb + (String) (var11);
                    }
                  } else {
                    var14 = field_Qb + (String) (var11);
                  }
                }
                field_Mb = "<col=A00000>" + var13_ref + "<br>" + var14;
              }
              if (var19 != 0) {
                var9_ref_String = pd.field_Rb.field_Gb;
                sc.field_f.field_db = oc.a(fb.field_D, new String[]{var9_ref_String}, (byte) -88).toUpperCase();
                tn.field_j.a(0, ri.field_k.field_M, -2147483648, 40, ri.field_k.field_pb - 40);
                tn.field_j.field_db = oc.a(kb.field_R, new String[]{var9_ref_String}, (byte) -93);
                var8 = tn.field_j;
              }
            } else {
              var9_ref_String = pd.field_Rb.field_Gb;
              sc.field_f.field_db = oc.a(fb.field_D, new String[]{var9_ref_String}, (byte) -88).toUpperCase();
              tn.field_j.a(0, ri.field_k.field_M, -2147483648, 40, ri.field_k.field_pb - 40);
              tn.field_j.field_db = oc.a(kb.field_R, new String[]{var9_ref_String}, (byte) -93);
              var8 = tn.field_j;
            }
            if (eg.field_e != 0L) {
              var9 = (int)(eg.field_e - ud.a(2));
              var9 = (999 + var9) / 1000;
              if (var9 < 1) {
                var9 = 1;
              }
              var8.field_db = oc.a(pa.field_n, new String[]{Integer.toString(var9)}, (byte) -119);
            }
            ec.field_j.field_db = oc.a(dk.field_a, new String[]{Integer.toString(pd.field_Rb.field_Xb), Integer.toString(pd.field_Rb.field_hc)}, (byte) -44);
          }
          stackIn_184_0 = fm.field_T;
          stackIn_185_1 = (param0) && (!param3) && (!jh.field_a);
          ((ci) (Object) stackIn_184_0).a(stackIn_185_1, (byte) 88);
          stackIn_189_0 = ri.field_k;
          stackIn_190_1 = (param0) && (!param3) && (!jh.field_a);
          ((ci) (Object) stackIn_189_0).a(stackIn_190_1, (byte) 88);
          stackIn_194_0 = ah.field_i;
          stackIn_195_1 = (param0) && (!param3) && (jh.field_a);
          ((ci) (Object) stackIn_194_0).a(stackIn_195_1, (byte) 88);
          qa.field_f.field_a.f((byte) 109);
          var5_int = -71 % ((-3 - param1) / 54);
          if (null != pd.field_Rb) {
            if (sc.field_d.field_L != 0) {
              db.a(param4, pd.field_Rb.g((byte) -80), 28113);
            }
            if (aa.field_g.field_L != 0) {
              ob.field_w = true;
            }
            if (uj.field_j.field_L != 0) {
              jh.field_a = true;
            }
            if (hn.field_d.field_L != 0) {
              jh.field_a = false;
            }
            t.a(pd.field_Rb, false, param4, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var5_ref), "pc.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void k(int param0) {
        field_Qb = null;
        if (param0 != 0) {
          return;
        }
        field_Mb = null;
    }

    static {
        field_Qb = "Invite more players, or alternatively try changing the following settings:  ";
    }
}
