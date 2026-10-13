/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj {
    private int field_i;
    private int field_f;
    private int field_g;
    private km field_m;
    private LevelPack field_l;
    private int field_n;
    int field_h;
    private int field_b;
    private boolean field_d;
    private int field_j;
    private int field_a;
    private int field_k;
    static RgbSprite[] field_e;
    static mf field_o;
    private int field_c;
    private q field_p;
    private int field_r;
    int field_q;

    public static void a(boolean param0) {
        field_o = null;
        field_e = null;
        if (!param0) {
          CharSequence var2 = (CharSequence) null;
          uj.a((CharSequence) null, false);
        }
    }

    final void a(int param0, boolean param1) {
        this.field_g = this.field_g + param0;
        if (!param1) {
          return;
        }
        if (this.field_g < 0) {
          this.field_g = 0;
        }
        if (this.field_g > this.field_k) {
          this.field_g = this.field_k;
        }
    }

    final static void a(int param0) {
        if (null != ag.field_D) {
          return;
        }
        ag.field_D = new String[46];
        ag.field_D[5] = gg.field_l;
        ag.field_D[3] = tn.field_B;
        ag.field_D[4] = pp.field_c;
        ag.field_D[9] = LevelPackLoader.field_d;
        ag.field_D[1] = da.field_H;
        ag.field_D[11] = ej.field_H;
        ag.field_D[7] = jj.field_b;
        ag.field_D[0] = mo.field_O;
        ag.field_D[6] = rd.field_b;
        ag.field_D[8] = null;
        ag.field_D[13] = di.field_a;
        ag.field_D[27] = ld.field_r;
        ag.field_D[2] = pj.field_e;
        sl.field_A[11] = tn.field_w;
        sl.field_A[5] = ef.field_c;
        sl.field_A[6] = ch.field_i;
        sl.field_A[9] = mk.field_a;
        sl.field_A[4] = tm.field_d;
        ag.field_D[14] = pl.field_c[0];
        sl.field_A[3] = sj.field_e;
        ag.field_D[39] = ki.field_o;
        ag.field_D[23] = mh.field_mb;
        ag.field_D[21] = a.field_r;
        ag.field_D[17] = vq.field_E[0];
        ag.field_D[38] = kk.field_a;
        if (param0 != -1) {
          return;
        }
        ag.field_D[34] = f.field_b;
        ag.field_D[28] = sn.field_r;
        ag.field_D[19] = jf.field_g;
        ag.field_D[35] = LevelPackLoader.field_d;
        ag.field_D[20] = pn.field_q;
        ag.field_D[33] = t.field_c;
        ag.field_D[32] = hk.field_L;
        ag.field_D[25] = ck.field_i;
        ag.field_D[24] = gi.field_r;
        ag.field_D[42] = oc.field_u;
        ag.field_D[37] = LevelPackLoader.field_i;
        sl.field_A[7] = ke.field_f;
        sl.field_A[8] = oq.field_v;
        ag.field_D[15] = pl.field_c[1];
        ag.field_D[16] = pl.field_c[2];
        sl.field_A[12] = uo.field_b;
        sl.field_A[10] = eh.field_d;
        ag.field_D[18] = vq.field_E[1];
        ag.field_D[26] = oq.field_u;
        ag.field_D[22] = d.field_D;
        sl.field_A[13] = vp.field_s;
        hm.field_b = new String[]{mi.field_a, qm.field_c, oa.field_Pb, s.field_a};
        sl.field_A[16] = dc.field_d;
        qn.field_u = new String[]{vh.field_T, oc.field_u};
        eh.field_e = new String[]{ag.field_C, bh.field_ub, qo.field_P, bq.field_f, jh.field_c};
        ar.field_a = new String[]{kk.field_a};
        sl.field_A[15] = ab.field_F;
        ih.field_j = new String[]{ff.field_g, pq.field_m, bm.field_b, RectangleBody.field_t};
        ml.field_e = new String[]{qi.field_N, bg.field_o, ue.field_a, eb.field_m, ch.field_j, vg.field_a, nk.field_f, tm.field_h};
        sl.field_A[17] = pq.field_q;
        sl.field_A[14] = vh.field_V;
        sl.field_A[18] = GameScreen.field_g;
    }

    final static short[] a(byte param0, short[] param1, BitPacketBuffer param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        short[] stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        short[] stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param0 >= -53) {
            stackIn_3_0 = (short[]) null;
            return stackIn_3_0;
          }
          var4_int = param2.readBits(param3, (byte) 61);
          if (var4_int == 0) {
            stackIn_6_0 = null;
            return (short[]) (stackIn_6_0);
          }
          if (param1 == null ||
            param1.length != var4_int) {
            param1 = new short[var4_int];
          }
          var5 = param2.readBits(4, (byte) 122);
          var6 = (short)param2.readBits(16, (byte) 94);
          if (var5 <= 0) {
            for (var7 = 0; var7 < var4_int; var7++) {
              param1[var7] = (short)var6;
            }
          } else {
            for (var7 = 0; var4_int > var7; var7++) {
              param1[var7] = (short)(param2.readBits(var5, (byte) 91) + var6);
            }
          }
          stackIn_19_0 = (short[]) (param1);
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("uj.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(byte param0) {
        this.field_b = pq.field_k;
        this.field_g = 0;
        this.field_n = po.field_a;
        this.field_d = true;
        this.field_q = 0;
        int var2 = 125 % ((-49 - param0) / 41);
    }

    final void c(byte param0) {
        int var3 = 0;
        int var2;
        int var4;
        int var5;
        var5 = BrickABrac.field_J ? 1 : 0;
        MovingBody.a((byte) 70, this.field_p.field_c + this.field_p.field_j, this.field_p.field_c, this.field_p.field_a, this.field_p.field_a + this.field_p.field_d);
        var2 = df.a(this.field_i, (byte) 15, this.field_g - this.field_c);
        if (param0 != 28) {
          return;
        }
        for (var3 = this.field_p.field_a + (-this.field_g + this.field_c + this.field_j) + var2 * this.field_i; this.field_p.field_d + (10 + this.field_p.field_a) > var3; var3 = var3 + this.field_i) {
          if (this.field_l.levelCount > var2) {
            if (0 <= var2) {
              var4 = 3;
              if (hh.field_b[this.field_l.packId] < var2) {
                if (this.field_q == var2) {
                  var4 = 0;
                }
              } else {
                var4 = (var2 != this.field_q) ? 2 : 1;
              }
              nn.field_g.b(this.field_l.metadata[var2].numberLabel, (this.field_p.field_c * 2 + this.field_p.field_j) / 2, var3, var4, -1);
            }
            var2++;
            continue;
          }
          break;
        }
        sc.b(-106);
        return;
    }

    final boolean a(int param0, int param1, int param2) {
        int var4;
        var4 = df.a(this.field_f, (byte) 15, this.field_g - this.field_c) + this.field_p.field_d / (2 * this.field_i);
        if (param0 != -28088) {
          this.field_r = -121;
        }
        if (param1 == 99) {
          this.field_d = true;
          this.field_q = this.field_q + 1;
          if (this.field_q > var4) {
            this.a(this.field_i, true);
          }
        } else {
          if (param1 == 98) {
            this.field_q = this.field_q - 1;
            this.field_d = true;
            if (this.field_q <= var4 - 1) {
              this.a(-this.field_i, true);
            }
          }
        }
        if (this.field_q >= 0 &&
          this.field_l.levelCount > this.field_q) {
          return false;
        }
        this.field_q = -1;
        this.field_d = false;
        return true;
    }

    final void b(byte param0) {
        this.field_d = true;
        this.field_q = -1 + this.field_l.levelCount;
        this.field_g = this.field_k;
        if (param0 >= -39) {
          this.a(47, false);
        }
        this.field_n = po.field_a;
        this.field_b = pq.field_k;
    }

    final void b(int param0) {
        this.field_g = param0;
    }

    final void b(boolean param0) {
        if (this.field_a != this.field_m.field_h.field_j) {
          this.field_q = -1;
          this.field_b = -1;
          this.field_n = -1;
          this.field_d = false;
        } else {
          this.a(GameplayAudioEvent.field_o * this.field_h, true);
          this.field_d = this.field_d & (GameplayAudioEvent.field_o == 0 ? true : false);
          if (!this.field_d ||
            pq.field_k != this.field_b ||
            this.field_n != po.field_a) {
            this.field_q = df.a(this.field_i, (byte) 15, po.field_a - (this.field_p.field_a - (-this.field_c + this.field_g)));
            if (this.field_q < 0) {
              this.field_q = 0;
            }
            if (!(this.field_l.levelCount >= this.field_q)) {
              this.field_q = this.field_l.levelCount;
            }
          }
          this.field_n = po.field_a;
          this.field_b = pq.field_k;
        }
        if (param0) {
          this.field_p = (q) null;
        }
    }

    final static byte[] a(CharSequence param0, boolean param1) {
        int var4 = 0;
        byte[] stackIn_69_0 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param1) {
            field_o = (mf) null;
          }
          var2_int = param0.length();
          var3 = new byte[var2_int];
          for (var4 = 0; var2_int > var4; var4++) {
            {
              var5 = param0.charAt(var4);
              if ((0 >= var5 ||
                128 <= var5) && (var5 < 160 ||
                var5 > 255)) {
                switch (var5) {
                  case 8364:
                    var3[var4] = (byte)-128;
                    break;
                  case 8218:
                    var3[var4] = (byte)-126;
                    break;
                  case 402:
                    var3[var4] = (byte)-125;
                    break;
                  case 8222:
                    var3[var4] = (byte)-124;
                    break;
                  case 8230:
                    var3[var4] = (byte)-123;
                    break;
                  case 8224:
                    var3[var4] = (byte)-122;
                    break;
                  case 8225:
                    var3[var4] = (byte)-121;
                    break;
                  case 710:
                    var3[var4] = (byte)-120;
                    break;
                  case 8240:
                    var3[var4] = (byte)-119;
                    break;
                  case 352:
                    var3[var4] = (byte)-118;
                    break;
                  case 8249:
                    var3[var4] = (byte)-117;
                    break;
                  case 338:
                    var3[var4] = (byte)-116;
                    break;
                  case 381:
                    var3[var4] = (byte)-114;
                    break;
                  case 8216:
                    var3[var4] = (byte)-111;
                    break;
                  case 8217:
                    var3[var4] = (byte)-110;
                    break;
                  case 8220:
                    var3[var4] = (byte)-109;
                    break;
                  case 8221:
                    var3[var4] = (byte)-108;
                    break;
                  case 8226:
                    var3[var4] = (byte)-107;
                    break;
                  case 8211:
                    var3[var4] = (byte)-106;
                    break;
                  case 8212:
                    var3[var4] = (byte)-105;
                    break;
                  case 732:
                    var3[var4] = (byte)-104;
                    break;
                  case 8482:
                    var3[var4] = (byte)-103;
                    break;
                  case 353:
                    var3[var4] = (byte)-102;
                    break;
                  case 8250:
                    var3[var4] = (byte)-101;
                    break;
                  case 339:
                    var3[var4] = (byte)-100;
                    break;
                  case 382:
                    var3[var4] = (byte)-98;
                    break;
                  case 376:
                    var3[var4] = (byte)-97;
                    break;
                  default:
                    var3[var4] = (byte)63;
                    break;
                }
              } else {
                var3[var4] = (byte)var5;
              }
            }
          }
          stackIn_69_0 = var3;
          return stackIn_69_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_72_0 = var2;
          stackIn_72_1 = new StringBuilder().append("uj.G(");
          if (param0 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param1).append(')').toString());
        }
    }

    uj(int param0, int param1, int param2, km param3, q param4, LevelPack param5) {
        this.field_q = -1;
        try {
          this.field_i = param0 + param1;
          this.field_m = param3;
          this.field_p = param4;
          this.field_a = param2;
          this.field_l = param5;
          this.field_j = nn.field_g.field_L + (nn.field_g.field_B - 5);
          this.field_c = param1;
          this.field_f = param0;
          this.field_r = this.field_c + this.field_l.levelCount * this.field_i;
          this.field_k = -this.field_p.field_d + this.field_r + 5;
          if (0 > this.field_k) {
            this.field_k = 0;
          }
          this.field_h = 3 * this.field_f / 2;
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "uj.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
