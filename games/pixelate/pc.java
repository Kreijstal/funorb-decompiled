/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc extends we {
    static String field_t;
    static int field_q;
    static int field_s;
    private lh field_v;
    static String field_u;
    static String field_x;
    static byte[][] field_w;
    private int field_r;

    pc(int param0) {
        super(param0);
    }

    final void b(byte[] param0, int param1, int param2, int param3) {
        int fieldTemp$0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          var5_int = 0;
          while (param3 > var5_int) {
            fieldTemp$0 = this.field_m;
            this.field_m = this.field_m + 1;
            param0[var5_int + param1] = (byte)(this.field_k[fieldTemp$0] - this.field_v.a(256));
            var5_int++;
            if (var6 != 0) {
              return;
            }
          }
          if (param2 < 25) {
            this.field_v = (lh) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("pc.AB(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void g(int param0, int param1) {
        int fieldTemp$1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != 15514) {
            this.f((byte) -21);
          }
          fieldTemp$1 = this.field_m;
          this.field_m = this.field_m + 1;
          this.field_k[fieldTemp$1] = (byte)(param0 + this.field_v.a(256));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "pc.WA(" + param0 + ',' + param1 + ')');
        }
    }

    final static im a(int param0, boolean param1, byte param2) {
        gp stackIn_4_0 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_5_2 = false;
        im stackIn_18_0 = null;
        ak stackIn_45_0 = null;
        String stackIn_46_1 = null;
        ak stackIn_49_0 = null;
        String stackIn_50_1 = null;
        int stackIn_54_0 = 0;
        Object stackIn_95_0 = null;
        im stackIn_103_0 = null;
        Object stackIn_105_0 = null;
        RuntimeException decompiledCaughtException = null;
        im stackOut_17_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        bb var4 = null;
        Object var5 = null;
        Object var6 = null;
        im var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        wi var17 = null;
        String var18 = null;
        int var19 = 0;
        wi var17Lifetime1;
        String var18Lifetime1;
        var19 = Pixelate.field_H ? 1 : 0;
        try {
          stackIn_4_0 = ma.field_z.field_Gb;
          stackIn_4_1 = param1;
          stackIn_5_2 = (bj.field_d == ma.field_z.field_Gb);
          boolean decompiledFrameRemainder0 = true;
          var3_int = ((gp) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_5_2, 2, param0 * (3 * fq.field_q + 6), 0, 2 + fq.field_q) ? 1 : 0;
          var4 = ma.field_z.field_Fb.field_L;
          var5 = null;
          if (gk.field_db != 2) {
            wa.field_f.field_rb = false;
            ak.field_E.field_cb = wd.field_b;
            if (gk.field_db != 1) {
              ma.field_z.field_Gb.field_Ib.field_cb = mk.field_c;
              if (var19 != 0) {
                ma.field_z.field_Gb.field_Ib.field_cb = ih.field_d;
              }
            } else {
              ma.field_z.field_Gb.field_Ib.field_cb = ih.field_d;
            }
            wd.a(ma.field_z.field_Fb, false);
            decompiledFrameRemainder0 = (var19 != 0);
          }
          if (decompiledFrameRemainder0) {
            wa.field_f.field_rb = true;
            ak.field_E.field_cb = sd.a(ke.field_e, 78, new String[]{qp.field_L});
            ma.field_z.field_Gb.field_Ib.field_cb = null;
            var6 = null;
            var7 = (im) (var4.c(1504642273));
            while (true) {
              if (var7 != null) {
                var8 = 0;
                stackOut_17_0 = var7;
                stackIn_95_0 = stackOut_17_0;
                stackIn_18_0 = stackOut_17_0;
                if (var19 == 0) {
                  if (stackIn_18_0.field_L == null) {
                    var7.field_Pb = new ak(0L, ak.field_T);
                    var7.a(var7.field_Pb, (byte) 26);
                    var7.field_Eb = new ak(0L, of.field_i);
                    var7.a(var7.field_Eb, (byte) 26);
                    var7.field_Ob = new ak(0L, ak.field_T);
                    var7.a(var7.field_Ob, (byte) 26);
                    var7.field_Eb.field_Bb = 2;
                    var7.h(-257);
                    var8 = 1;
                  }
                  var7.field_K = ma.field_z.field_Fb.field_K;
                  var9 = 0;
                  if (null != var7.field_Nb) {
                    if (var7.field_Nb == qp.field_L) {
                      var11 = 6750054;
                      var10 = 52224;
                    } else {
                      var10 = 13421568;
                      var11 = 16777062;
                    }
                  } else {
                    var11 = 16737894;
                    var10 = 13369344;
                  }
                  var12 = 0;
                  if (null != var7.field_Gb &&
                    !var7.field_Gb.equals("")) {
                    var7.field_Ob.field_y = var11;
                    var7.field_Ob.field_H = dk.field_e;
                    var7.field_Ob.a(var9, fq.field_q, 0, 256, 3 + dk.field_e.field_A);
                    var12 = 1;
                  }
                  var7.field_Eb.field_y = var11;
                  var7.field_Pb.field_y = var11;
                  var7.field_Eb.field_N = var10;
                  var7.field_Pb.field_N = var10;
                  var7.field_Eb.field_pb = var11;
                  var7.field_Pb.field_pb = var11;
                  var7.field_Eb.field_Cb = var11;
                  var7.field_Pb.field_Cb = var11;
                  var13 = 0;
                  var14 = var7.field_K - 82;
                  if (var12 != 0) {
                    var13 = dk.field_e.field_A + 3;
                    var14 = var14 - var13;
                  }
                  stackIn_45_0 = var7.field_Pb;
                  if (var14 > 0) {
                    stackIn_46_1 = jl.a(var7.field_Pb.field_Db, var7.field_Fb, var14);
                  } else {
                    stackIn_46_1 = var7.field_Fb;
                  }
                  stackIn_45_0.field_cb = stackIn_46_1;
                  var7.field_Pb.a(var9, fq.field_q, var13, 256, var14);
                  stackIn_49_0 = var7.field_Eb;
                  if (null != var7.field_Nb) {
                    stackIn_50_1 = var7.field_Nb;
                  } else {
                    stackIn_50_1 = re.field_g;
                  }
                  stackIn_49_0.field_cb = stackIn_50_1;
                  var7.field_Eb.a(var9, fq.field_q, -80 + var7.field_K, 256, 80);
                  stackIn_54_0 = (var7.field_Pb.field_cb.equals(var7.field_Fb)) ? 0 : 1;
                  var15 = stackIn_54_0;
                  var9 = var9 + fq.field_q;
                  if (var3_int == 0) {
                    var7.field_Z = -var7.field_nb + var9;
                  }
                  if (var8 != 0) {
                    ma.field_z.field_Fb.a(var7, 2, -1, (ak) (var6));
                  }
                  var6 = var7;
                  if (var7.field_Ob != null &&
                    var7.field_Ob.field_W) {
                    up.field_o = var7.field_Gb;
                  } else if (0 == var7.field_P) {
                    if (var7.field_Pb.field_W &&
                      var15 != 0) {
                      up.field_o = var7.field_Fb;
                    }
                  } else {
                    var16 = var7.field_Fb;
                    em.a((String) null, 0L, var16, -1, var7, -163, ma.field_z.field_Gb, (int[]) null, -1);
                    var5 = var7;
                    if (var7.field_Nb != null &&
                      !ul.a(75, eg.field_n.field_h) &&
                      !ln.field_q) {
                      if (!lh.field_g) {
                        var17 = eg.field_n;
                        var18 = sd.a(nf.field_e, 46, new String[]{var16});
                        var17.field_b.a(var18, (byte) -105, 8);
                      }
                      var17Lifetime1 = eg.field_n;
                      var18Lifetime1 = sd.a(ho.field_f, 101, new String[]{var16});
                      var17Lifetime1.field_b.a(var18Lifetime1, (byte) -102, 18);
                    }
                  }
                  var7 = (im) (var4.f(1504642273));
                  continue;
                }
              } else {
                stackIn_95_0 = ma.field_z.field_Ib;
              }
              if (((ak) (stackIn_95_0)).field_P != 0) {
                he.field_f = new ve(ma.field_z.field_Ib.field_tb, ma.field_z.field_Ib.field_gb, ma.field_z.field_Ib.field_K, ma.field_z.field_Ib.field_nb, jj.field_j, po.field_c, mg.field_h, mg.field_h);
                il.field_e = 0;
              }
              if (ma.field_z.field_Hb.field_P == 0) {
                break;
              }
              he.field_f = new ve(ma.field_z.field_Hb.field_tb, ma.field_z.field_Hb.field_gb, ma.field_z.field_Hb.field_K, ma.field_z.field_Hb.field_nb, hp.field_Fb, po.field_c, mg.field_h, mg.field_h);
              il.field_e = 1;
              break;
            }
          }
          if (param2 >= 47) {
            stackIn_105_0 = var5;
            return (im) (stackIn_105_0);
          }
          stackIn_103_0 = (im) null;
          return stackIn_103_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "pc.TA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void o(int param0) {
        try {
          this.field_m = (param0 + this.field_r) / 8;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "pc.BB(" + param0 + ')');
        }
    }

    final void a(int param0, int[] param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != 0) {
            field_t = (String) null;
          }
          this.field_v = new lh(param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("pc.EB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    pc(byte[] param0) {
        super(param0);
    }

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -47) {
            field_q = -19;
          }
          param2 = ub.a(param2, param1 ^ -47, "", '_');
          var3 = bc.b(0, param0);
          stackIn_10_0 = (param2.indexOf(param0) != -1) || (param2.indexOf(var3) != -1);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("pc.CB(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final void n(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 >= -2) {
            pc.a((String) null, (byte) -7, (String) null);
          }
          this.field_r = this.field_m * 8;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "pc.VA(" + param0 + ')');
        }
    }

    final int f(byte param0) {
        int fieldTemp$1 = 0;
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 83) {
            field_q = -104;
          }
          fieldTemp$1 = this.field_m;
          this.field_m = this.field_m + 1;
          stackIn_4_0 = 255 & this.field_k[fieldTemp$1] - this.field_v.a(256);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "pc.UA(" + param0 + ')');
        }
    }

    final int c(int param0, byte param1) {
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          var3_int = this.field_r >> 3;
          if (param1 != -34) {
            stackIn_3_0 = 65;
            return stackIn_3_0;
          }
          var4 = 8 - (7 & this.field_r);
          var5 = 0;
          this.field_r = this.field_r + param0;
          L1: while (true) {
            if (var4 < param0) {
              incrementValue$1 = var3_int;
              var3_int++;
              var5 = var5 + ((pk.field_a[var4] & this.field_k[incrementValue$1]) << param0 - var4);
              param0 = param0 - var4;
              var4 = 8;
              if (var6 == 0) {
                continue;
              }
            } else {
              if (~param0 != ~var4) {
                var5 = var5 + (this.field_k[var3_int] >> -param0 + var4 & pk.field_a[param0]);
                if (var6 == 0) {
                  break L1;
                }
              }
            }
            var5 = var5 + (this.field_k[var3_int] & pk.field_a[var4]);
            break;
          }
          stackIn_14_0 = var5;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "pc.DB(" + param0 + ',' + param1 + ')');
        }
    }

    public static void m(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_t = null;
          if (param0 != 25208) {
            field_x = (String) null;
          }
          field_w = (byte[][]) null;
          field_x = null;
          field_u = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "pc.SA(" + param0 + ')');
        }
    }

    static {
        field_t = "Invite only";
        field_s = 250;
        field_u = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
        field_x = "Loading fonts";
        field_w = new byte[50][];
    }
}
